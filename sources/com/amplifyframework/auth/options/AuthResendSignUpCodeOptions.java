package com.amplifyframework.auth.options;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AuthResendSignUpCodeOptions {

    /* JADX INFO: loaded from: classes21.dex */
    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthResendSignUpCodeOptions build();

        public abstract T getThis();
    }

    public static DefaultAuthResendSignUpCodeOptions defaults() {
        return new DefaultAuthResendSignUpCodeOptions();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class DefaultAuthResendSignUpCodeOptions extends AuthResendSignUpCodeOptions {
        private DefaultAuthResendSignUpCodeOptions() {
        }

        public int hashCode() {
            return DefaultAuthResendSignUpCodeOptions.class.hashCode();
        }

        public boolean equals(@Nullable Object obj) {
            return obj instanceof DefaultAuthResendSignUpCodeOptions;
        }

        public String toString() {
            return DefaultAuthResendSignUpCodeOptions.class.getSimpleName();
        }
    }
}
