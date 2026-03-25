package com.amplifyframework.predictions.aws.request;

import androidx.annotation.NonNull;
import com.amplifyframework.predictions.aws.models.AWSVoiceType;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class AWSPollyRequest {
    private final String text;
    private final AWSVoiceType voiceType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AWSVoiceType getVoiceType() {
        return this.voiceType;
    }

    public AWSPollyRequest(@NonNull String str, @NonNull AWSVoiceType aWSVoiceType) {
        Objects.requireNonNull(str);
        this.text = str;
        Objects.requireNonNull(aWSVoiceType);
        this.voiceType = aWSVoiceType;
    }
}
