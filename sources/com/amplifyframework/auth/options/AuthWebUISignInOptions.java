package com.amplifyframework.auth.options;

import androidx.annotation.NonNull;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.util.Immutable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public class AuthWebUISignInOptions {
    private final List<String> scopes;

    /* JADX INFO: loaded from: classes21.dex */
    public static final class CoreBuilder extends Builder<CoreBuilder> {
        /* JADX DEBUG: Method merged with bridge method: getThis()Lcom/amplifyframework/auth/options/AuthWebUISignInOptions$Builder; */
        @Override // com.amplifyframework.auth.options.AuthWebUISignInOptions.Builder
        public CoreBuilder getThis() {
            return this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<String> getScopes() {
        return this.scopes;
    }

    public AuthWebUISignInOptions(List<String> list) {
        this.scopes = list;
    }

    public static Builder<?> builder() {
        return new CoreBuilder();
    }

    public int hashCode() {
        return ObjectsCompat.hash(getScopes());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ObjectsCompat.equals(getScopes(), ((AuthWebUISignInOptions) obj).getScopes());
    }

    public String toString() {
        return "AuthWebUISignInOptions{scopes=" + getScopes() + AbstractJsonLexerKt.END_OBJ;
    }

    public static abstract class Builder<T extends Builder<T>> {
        private List<String> scopes = new ArrayList();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public List<String> getScopes() {
            return this.scopes;
        }

        public abstract T getThis();

        public T scopes(@NonNull List<String> list) {
            Objects.requireNonNull(list);
            this.scopes.clear();
            this.scopes.addAll(list);
            return (T) getThis();
        }

        public AuthWebUISignInOptions build() {
            return new AuthWebUISignInOptions(Immutable.of(this.scopes));
        }
    }
}
