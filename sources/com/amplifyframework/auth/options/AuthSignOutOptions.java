package com.amplifyframework.auth.options;

import androidx.core.util.ObjectsCompat;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public class AuthSignOutOptions {
    private final boolean globalSignOut;

    /* JADX INFO: loaded from: classes21.dex */
    public static final class CoreBuilder extends Builder<CoreBuilder> {
        /* JADX DEBUG: Method merged with bridge method: getThis()Lcom/amplifyframework/auth/options/AuthSignOutOptions$Builder; */
        @Override // com.amplifyframework.auth.options.AuthSignOutOptions.Builder
        public CoreBuilder getThis() {
            return this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isGlobalSignOut() {
        return this.globalSignOut;
    }

    public AuthSignOutOptions(boolean z) {
        this.globalSignOut = z;
    }

    public static Builder<?> builder() {
        return new CoreBuilder();
    }

    public int hashCode() {
        return ObjectsCompat.hash(Boolean.valueOf(isGlobalSignOut()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ObjectsCompat.equals(Boolean.valueOf(isGlobalSignOut()), Boolean.valueOf(((AuthSignOutOptions) obj).isGlobalSignOut()));
    }

    public String toString() {
        return "AuthSignOutOptions{globalSignOut=" + isGlobalSignOut() + AbstractJsonLexerKt.END_OBJ;
    }

    public static abstract class Builder<T extends Builder<T>> {
        private boolean globalSignOut = false;

        public abstract T getThis();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean isGlobalSignOut() {
            return this.globalSignOut;
        }

        public T globalSignOut(boolean z) {
            this.globalSignOut = z;
            return (T) getThis();
        }

        public AuthSignOutOptions build() {
            return new AuthSignOutOptions(this.globalSignOut);
        }
    }
}
