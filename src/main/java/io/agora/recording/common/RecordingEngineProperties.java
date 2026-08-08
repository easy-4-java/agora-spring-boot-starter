package io.agora.recording.common;

/**
 * Engine properties for the local Agora recording SDK.
 *
 * @author [@Loong Wan](https://github.com/loong10k)
 * @since 1.0.0
 */
public class RecordingEngineProperties{
  /** The relative path of the recorded files and recording log. */
  private String storageDir;

  /**
   * Get the relative path of the recorded files and recording log.
   * @return The relative path of the recorded files and recording log.
   */
  public String getStorageDir(){
    return storageDir;
  }

}
