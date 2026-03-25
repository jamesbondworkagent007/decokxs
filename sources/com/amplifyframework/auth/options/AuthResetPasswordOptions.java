package com.amplifyframework.auth.options;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AuthResetPasswordOptions {

    /* JADX INFO: loaded from: classes21.dex */
    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthResetPasswordOptions build();

        public abstract T getThis();
    }

    public static DefaultAuthResetPasswordOptions defaults() {
        return new DefaultAuthResetPasswordOptions();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class DefaultAuthResetPasswordOptions extends AuthResetPasswordOptions {
        private DefaultAuthResetPasswordOptions() {
        }

        public int hashCode() {
            return DefaultAuthResetPasswordOptions.class.hashCode();
        }

        public boolean equals(@Nullable Object obj) {
            return obj instanceof DefaultAuthResetPasswordOptions;
        }

        public String toString() {
            return DefaultAuthResetPasswordOptions.class.getSimpleName();
        }
    }
}
