package com.amplifyframework.core.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'OWNER' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes21.dex */
public final class AuthStrategy {
    private static final /* synthetic */ AuthStrategy[] $VALUES;
    public static final AuthStrategy CUSTOM;
    public static final AuthStrategy GROUPS;
    public static final AuthStrategy OWNER;
    public static final AuthStrategy PRIVATE;
    public static final AuthStrategy PUBLIC;
    private final Provider defaultAuthProvider;
    private final int priority;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Provider getDefaultAuthProvider() {
        return this.defaultAuthProvider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getPriority() {
        return this.priority;
    }

    public static AuthStrategy valueOf(String str) {
        return (AuthStrategy) Enum.valueOf(AuthStrategy.class, str);
    }

    public static AuthStrategy[] values() {
        return (AuthStrategy[]) $VALUES.clone();
    }

    static {
        AuthStrategy authStrategy = new AuthStrategy("CUSTOM", 0, Provider.FUNCTION, 1);
        CUSTOM = authStrategy;
        Provider provider = Provider.USER_POOLS;
        AuthStrategy authStrategy2 = new AuthStrategy("OWNER", 1, provider, 2);
        OWNER = authStrategy2;
        AuthStrategy authStrategy3 = new AuthStrategy("GROUPS", 2, provider, 3);
        GROUPS = authStrategy3;
        AuthStrategy authStrategy4 = new AuthStrategy("PRIVATE", 3, provider, 4);
        PRIVATE = authStrategy4;
        AuthStrategy authStrategy5 = new AuthStrategy("PUBLIC", 4, Provider.API_KEY, 5);
        PUBLIC = authStrategy5;
        $VALUES = new AuthStrategy[]{authStrategy, authStrategy2, authStrategy3, authStrategy4, authStrategy5};
    }

    private AuthStrategy(String str, int i, Provider provider, int i2) {
        this.defaultAuthProvider = provider;
        this.priority = i2;
    }

    public enum Provider {
        FUNCTION("function", 1),
        USER_POOLS("userPools", 2),
        OIDC("oidc", 3),
        IAM("iam", 4),
        API_KEY("apiKey", 5);

        private final String authDirectiveProviderName;
        private final int priority;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getAuthDirectiveProviderName() {
            return this.authDirectiveProviderName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int getPriority() {
            return this.priority;
        }

        Provider(String str, int i) {
            this.authDirectiveProviderName = str;
            this.priority = i;
        }

        public static Provider from(@NonNull String str) {
            Objects.requireNonNull(str);
            for (Provider provider : values()) {
                if (str.equals(provider.authDirectiveProviderName)) {
                    return provider;
                }
            }
            throw new IllegalArgumentException("Unable to find a matching auth strategy for " + str);
        }
    }
}
