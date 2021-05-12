package com.sblearning.user.vo;

import com.sblearning.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseTemplate {
    private User user;
    private Department department;
}
