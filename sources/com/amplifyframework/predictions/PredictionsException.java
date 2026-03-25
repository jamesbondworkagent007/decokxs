package com.amplifyframework.predictions;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amplifyframework.AmplifyException;

/* JADX INFO: loaded from: classes2.dex */
public class PredictionsException extends AmplifyException {
    private static final long serialVersionUID = 6843042852631940595L;

    public PredictionsException(@NonNull String str, @Nullable Throwable th, @NonNull String str2) {
        super(str, th, str2);
    }

    public PredictionsException(@NonNull String str, @NonNull String str2) {
        super(str, str2);
    }
}
