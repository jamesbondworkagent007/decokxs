package com.amplifyframework.predictions.options;

import androidx.annotation.Nullable;
import com.amplifyframework.predictions.models.VoiceType;

/* JADX INFO: loaded from: classes14.dex */
public final class TextToSpeechOptions {
    private final VoiceType voiceType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VoiceType getVoiceType() {
        return this.voiceType;
    }

    private TextToSpeechOptions(Builder builder) {
        this.voiceType = builder.getVoiceType();
    }

    public static TextToSpeechOptions defaults() {
        return new TextToSpeechOptions(builder());
    }

    public static Builder builder() {
        return new Builder();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Builder {
        private VoiceType voiceType;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceType getVoiceType() {
            return this.voiceType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder voiceType(@Nullable VoiceType voiceType) {
            this.voiceType = voiceType;
            return this;
        }

        public TextToSpeechOptions build() {
            return new TextToSpeechOptions(this);
        }
    }
}
