package com.amplifyframework.auth.options;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AuthVerifyTOTPSetupOptions {

    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthVerifyTOTPSetupOptions build();

        public abstract T getThis();
    }

    public static DefaultAuthVerifyTOTPSetupOptions defaults() {
        return new DefaultAuthVerifyTOTPSetupOptions();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class DefaultAuthVerifyTOTPSetupOptions extends AuthVerifyTOTPSetupOptions {
        private DefaultAuthVerifyTOTPSetupOptions() {
        }

        public int hashCode() {
            return DefaultAuthVerifyTOTPSetupOptions.class.hashCode();
        }

        public boolean equals(@Nullable Object obj) {
            return obj instanceof DefaultAuthVerifyTOTPSetupOptions;
        }

        public String toString() {
            return DefaultAuthVerifyTOTPSetupOptions.class.getSimpleName();
        }
    }
}
