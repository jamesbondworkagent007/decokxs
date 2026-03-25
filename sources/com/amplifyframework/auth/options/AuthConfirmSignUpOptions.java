package com.amplifyframework.auth.options;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AuthConfirmSignUpOptions {

    /* JADX INFO: loaded from: classes21.dex */
    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthConfirmSignUpOptions build();

        public abstract T getThis();
    }

    public static DefaultAuthConfirmSignUpOptions defaults() {
        return new DefaultAuthConfirmSignUpOptions();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class DefaultAuthConfirmSignUpOptions extends AuthConfirmSignUpOptions {
        private DefaultAuthConfirmSignUpOptions() {
        }

        public int hashCode() {
            return DefaultAuthConfirmSignUpOptions.class.hashCode();
        }

        public boolean equals(@Nullable Object obj) {
            return obj instanceof DefaultAuthConfirmSignUpOptions;
        }

        public String toString() {
            return DefaultAuthConfirmSignUpOptions.class.getSimpleName();
        }
    }
}
