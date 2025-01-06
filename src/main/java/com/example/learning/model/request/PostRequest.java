package com.example.learning.model.request;

import java.time.LocalDateTime;

public record PostRequest(String title,

                          String content,

                          boolean published,

                          LocalDateTime publishedAt) {
}
