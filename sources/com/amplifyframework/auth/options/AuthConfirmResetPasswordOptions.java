package com.amplifyframework.auth.options;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AuthConfirmResetPasswordOptions {

    /* JADX INFO: loaded from: classes21.dex */
    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthConfirmResetPasswordOptions build();

        public abstract T getThis();
    }

    public static DefaultAuthConfirmResetPasswordOptions defaults() {
        return new DefaultAuthConfirmResetPasswordOptions();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class DefaultAuthConfirmResetPasswordOptions extends AuthConfirmResetPasswordOptions {
        private DefaultAuthConfirmResetPasswordOptions() {
        }

        public int hashCode() {
            return DefaultAuthConfirmResetPasswordOptions.class.hashCode();
        }

        public boolean equals(@Nullable Object obj) {
            return obj instanceof DefaultAuthConfirmResetPasswordOptions;
        }

        public String toString() {
            return DefaultAuthConfirmResetPasswordOptions.class.getSimpleName();
        }
    }
}
