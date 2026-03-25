package com.amplifyframework.api;

import androidx.annotation.NonNull;
import com.amplifyframework.AmplifyException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public class ApiException extends AmplifyException {
    private static final long serialVersionUID = 1;

    public ApiException(@NonNull String str, Throwable th, @NonNull String str2) {
        super(str, th, str2);
    }

    public ApiException(@NonNull String str, @NonNull String str2) {
        super(str, str2);
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class NonRetryableException extends ApiException {
        private static final long serialVersionUID = 1;

        public NonRetryableException(@NonNull @NotNull String str, @NotNull String str2) {
            super(str, str2);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class ApiAuthException extends ApiException {
        private static final long serialVersionUID = 1;

        public ApiAuthException(@NonNull String str, Throwable th, @NonNull String str2) {
            super(str, th, str2);
        }

        public ApiAuthException(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }
    }
}
