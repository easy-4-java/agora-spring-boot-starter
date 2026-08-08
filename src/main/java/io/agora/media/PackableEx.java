package io.agora.media;/**
 * Extended {@link Packable} helpers used by the Agora token builders.
 *
 * @author [@Loong Wan](https://github.com/loong10k)
 * @since 1.0.0
 */

public interface PackableEx extends Packable {
    void unmarshal(ByteBuf in);
}
