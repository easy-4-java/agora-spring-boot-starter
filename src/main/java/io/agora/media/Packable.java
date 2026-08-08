package io.agora.media;

/**
 * Contract for Agora token value types that can be packed into a byte buffer.
 *
 * @author [@Loong Wan](https://github.com/loong10k)
 * @since 1.0.0
 */
public interface Packable {
    ByteBuf marshal(ByteBuf out);
}
