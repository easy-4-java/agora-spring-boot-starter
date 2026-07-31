package io.agora.spring.boot.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = AgoraRecordingProperties.PREFIX)
public class AgoraRecordingProperties extends io.agora.spring.boot.AgoraRecordingProperties {
}
