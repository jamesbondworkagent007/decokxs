package com.amplifyframework.auth.options;

import androidx.annotation.NonNull;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.auth.AuthUserAttributeKey;
import com.amplifyframework.util.Immutable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public class AuthSignUpOptions {
    private final List<AuthUserAttribute> userAttributes;

    /* JADX INFO: loaded from: classes21.dex */
    public static final class CoreBuilder extends Builder<CoreBuilder> {
        /* JADX DEBUG: Method merged with bridge method: getThis()Lcom/amplifyframework/auth/options/AuthSignUpOptions$Builder; */
        @Override // com.amplifyframework.auth.options.AuthSignUpOptions.Builder
        public CoreBuilder getThis() {
            return this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<AuthUserAttribute> getUserAttributes() {
        return this.userAttributes;
    }

    public AuthSignUpOptions(List<AuthUserAttribute> list) {
        this.userAttributes = list;
    }

    public static Builder<?> builder() {
        return new CoreBuilder();
    }

    public int hashCode() {
        return ObjectsCompat.hash(getUserAttributes());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ObjectsCompat.equals(getUserAttributes(), ((AuthSignUpOptions) obj).getUserAttributes());
    }

    public String toString() {
        return "AuthSignUpOptions{userAttributes=" + this.userAttributes + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static abstract class Builder<T extends Builder<T>> {
        private AuthUserAttribute singleUserAttribute;
        private final List<AuthUserAttribute> userAttributes = new ArrayList();

        public abstract T getThis();

        public List<AuthUserAttribute> getUserAttributes() {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.userAttributes);
            AuthUserAttribute authUserAttribute = this.singleUserAttribute;
            if (authUserAttribute != null && !arrayList.contains(authUserAttribute)) {
                arrayList.add(this.singleUserAttribute);
            }
            return arrayList;
        }

        public T userAttributes(@NonNull List<AuthUserAttribute> list) {
            Objects.requireNonNull(list);
            this.userAttributes.clear();
            this.userAttributes.addAll(list);
            return (T) getThis();
        }

        public T userAttribute(@NonNull AuthUserAttributeKey authUserAttributeKey, @NonNull String str) {
            Objects.requireNonNull(authUserAttributeKey);
            Objects.requireNonNull(str);
            this.singleUserAttribute = new AuthUserAttribute(authUserAttributeKey, str);
            return (T) getThis();
        }

        public AuthSignUpOptions build() {
            return new AuthSignUpOptions(Immutable.of(getUserAttributes()));
        }
    }
}
