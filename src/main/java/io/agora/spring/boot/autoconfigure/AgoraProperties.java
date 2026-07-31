package io.agora.spring.boot.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = AgoraProperties.PREFIX)
public class AgoraProperties extends io.agora.spring.boot.AgoraProperties {
}
