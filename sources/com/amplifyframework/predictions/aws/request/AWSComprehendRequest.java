package com.amplifyframework.predictions.aws.request;

import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class AWSComprehendRequest {
    private final String text;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getText() {
        return this.text;
    }

    public AWSComprehendRequest(@NonNull String str) {
        Objects.requireNonNull(str);
        this.text = str;
    }
}
