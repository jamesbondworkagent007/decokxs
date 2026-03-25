package com.amplifyframework.auth.options;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AuthResendUserAttributeConfirmationCodeOptions {

    /* JADX INFO: loaded from: classes21.dex */
    public static abstract class Builder<T extends Builder<T>> {
        public abstract AuthResendUserAttributeConfirmationCodeOptions build();

        public abstract T getThis();
    }

    public static DefaultAuthResendUserAttributeConfirmationCodeOptions defaults() {
        return new DefaultAuthResendUserAttributeConfirmationCodeOptions();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class DefaultAuthResendUserAttributeConfirmationCodeOptions extends AuthResendUserAttributeConfirmationCodeOptions {
        private DefaultAuthResendUserAttributeConfirmationCodeOptions() {
        }

        public int hashCode() {
            return DefaultAuthResendUserAttributeConfirmationCodeOptions.class.hashCode();
        }

        public boolean equals(@Nullable Object obj) {
            return obj instanceof DefaultAuthResendUserAttributeConfirmationCodeOptions;
        }

        public String toString() {
            return DefaultAuthResendUserAttributeConfirmationCodeOptions.class.getSimpleName();
        }
    }
}
