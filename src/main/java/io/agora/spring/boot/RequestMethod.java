package io.agora.spring.boot;

/**
 * HTTP request methods supported by the Agora REST endpoints.
 *
 * @author [@Loong Wan](https://github.com/loong10k)
 * @since 1.0.0
 */
public enum RequestMethod {
    /** HTTP GET. */
    GET,
    /** HTTP HEAD. */
    HEAD,
    /** HTTP POST. */
    POST,
    /** HTTP PUT. */
    PUT,
    /** HTTP PATCH. */
    PATCH,
    /** HTTP DELETE. */
    DELETE,
    /** HTTP OPTIONS. */
    OPTIONS,
    /** HTTP TRACE. */
    TRACE
}
