package com.okinc.oklive.domain.model;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class TokenType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TokenType[] $VALUES;
    public static final TokenType CEDEFI = new TokenType("CEDEFI", 0, 1);
    public static final TokenType CEFI = new TokenType("CEFI", 1, 2);
    public static final Companion Companion;
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TokenType[] $values() {
        return new TokenType[]{CEDEFI, CEFI};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TokenType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private TokenType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        TokenType[] tokenTypeArr$values = $values();
        $VALUES = tokenTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tokenTypeArr$values);
        Companion = new Companion(null);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.oklive.domain.model.TokenType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TokenType fromValue(Integer num) {
            TokenType next;
            Iterator<TokenType> it = TokenType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                int value = next.getValue();
                if (num != null && value == num.intValue()) {
                    break;
                }
            }
            return next;
        }
    }

    public static TokenType valueOf(String str) {
        return (TokenType) Enum.valueOf(TokenType.class, str);
    }

    public static TokenType[] values() {
        return (TokenType[]) $VALUES.clone();
    }
}
