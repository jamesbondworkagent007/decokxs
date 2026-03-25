package com.okinc.business.defi.biz.core.nostrfix;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class IdentifierType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ IdentifierType[] $VALUES;
    public static final Activity Companion;
    public static final IdentifierType IDENTIFIER_TYPE_DEFAULT = new IdentifierType("IDENTIFIER_TYPE_DEFAULT", 0, 0);
    public static final IdentifierType IDENTIFIER_TYPE_NOSTR_FIX = new IdentifierType("IDENTIFIER_TYPE_NOSTR_FIX", 1, 1);
    public static final IdentifierType IDENTIFIER_TYPE_NOSTR_KEY_WALLET_TYPE = new IdentifierType("IDENTIFIER_TYPE_NOSTR_KEY_WALLET_TYPE", 2, 2);
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ IdentifierType[] $values() {
        return new IdentifierType[]{IDENTIFIER_TYPE_DEFAULT, IDENTIFIER_TYPE_NOSTR_FIX, IDENTIFIER_TYPE_NOSTR_KEY_WALLET_TYPE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<IdentifierType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private IdentifierType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        IdentifierType[] identifierTypeArr$values = $values();
        $VALUES = identifierTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(identifierTypeArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.nostrfix.IdentifierType.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final IdentifierType AEQbTJ(int i) {
            if (i == 0) {
                return IdentifierType.IDENTIFIER_TYPE_DEFAULT;
            }
            if (i == 1) {
                return IdentifierType.IDENTIFIER_TYPE_NOSTR_FIX;
            }
            if (i == 2) {
                return IdentifierType.IDENTIFIER_TYPE_NOSTR_KEY_WALLET_TYPE;
            }
            return IdentifierType.IDENTIFIER_TYPE_DEFAULT;
        }
    }

    public static IdentifierType valueOf(String str) {
        return (IdentifierType) Enum.valueOf(IdentifierType.class, str);
    }

    public static IdentifierType[] values() {
        return (IdentifierType[]) $VALUES.clone();
    }
}
