package com.amplifyframework.predictions.result;

import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class TextToSpeechResult {
    private final InputStream audioData;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InputStream getAudioData() {
        return this.audioData;
    }

    private TextToSpeechResult(InputStream inputStream) {
        this.audioData = inputStream;
    }

    public static TextToSpeechResult fromAudioData(@NonNull InputStream inputStream) {
        Objects.requireNonNull(inputStream);
        return new TextToSpeechResult(inputStream);
    }
}
