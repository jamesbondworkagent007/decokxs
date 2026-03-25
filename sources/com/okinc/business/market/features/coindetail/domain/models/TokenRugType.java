package com.okinc.business.market.features.coindetail.domain.models;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class TokenRugType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TokenRugType[] $VALUES;
    public static final ActionBar Companion;
    public static final TokenRugType NONE = new TokenRugType("NONE", 0);
    public static final TokenRugType DUMPING = new TokenRugType("DUMPING", 1);
    public static final TokenRugType REMOVE_LIQUIDITY = new TokenRugType("REMOVE_LIQUIDITY", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TokenRugType[] $values() {
        return new TokenRugType[]{NONE, DUMPING, REMOVE_LIQUIDITY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TokenRugType> getEntries() {
        return $ENTRIES;
    }

    private TokenRugType(String str, int i) {
    }

    static {
        TokenRugType[] tokenRugTypeArr$values = $values();
        $VALUES = tokenRugTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tokenRugTypeArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.coindetail.domain.models.TokenRugType.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final TokenRugType AEQbTJ(String str) {
            return Intrinsics.EZpvd((Object) str, (Object) "LIQUIDITY_REMOVAL") ? TokenRugType.REMOVE_LIQUIDITY : Intrinsics.EZpvd((Object) str, (Object) "DUMPING") ? TokenRugType.DUMPING : TokenRugType.NONE;
        }
    }

    public static TokenRugType valueOf(String str) {
        return (TokenRugType) Enum.valueOf(TokenRugType.class, str);
    }

    public static TokenRugType[] values() {
        return (TokenRugType[]) $VALUES.clone();
    }
}
