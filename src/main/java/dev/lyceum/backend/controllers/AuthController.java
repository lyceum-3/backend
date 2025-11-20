package dev.lyceum.backend.controllers;

import dev.lyceum.backend.dto.LoginRequest;
import dev.lyceum.backend.dto.LoginResponse;
import dev.lyceum.backend.service.AdminService;
import dev.lyceum.backend.utils.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {
    
    private final JwtUtil jwtUtil;
    private final AdminService adminService;

    @PostMapping("/api/auth/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        String username = request.username();
        String password = request.password();

        boolean ok = adminService.checkCredentials(username, password);

        if (ok) {
            String token = jwtUtil.generateToken(username);
            return ResponseEntity.ok(new LoginResponse(token));
        }
        return ResponseEntity.status(401).body("Невірний логін або пароль");
    }
}
