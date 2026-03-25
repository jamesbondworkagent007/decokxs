package com.okinc.preference.data.model.meta;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class PromotionDisplayType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PromotionDisplayType[] $VALUES;
    public static final ActionBar Companion;
    private final String type;
    public static final PromotionDisplayType AUTHENTICATOR = new PromotionDisplayType("AUTHENTICATOR", 0, "authenticator");
    public static final PromotionDisplayType PASSKEY = new PromotionDisplayType("PASSKEY", 1, "passkey");
    public static final PromotionDisplayType SYNC_OKX_PASSKEY = new PromotionDisplayType("SYNC_OKX_PASSKEY", 2, "syncPasskey");
    public static final PromotionDisplayType ALL = new PromotionDisplayType("ALL", 3, "all");
    public static final PromotionDisplayType NONE = new PromotionDisplayType("NONE", 4, "none");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PromotionDisplayType[] $values() {
        return new PromotionDisplayType[]{AUTHENTICATOR, PASSKEY, SYNC_OKX_PASSKEY, ALL, NONE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PromotionDisplayType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private PromotionDisplayType(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        PromotionDisplayType[] promotionDisplayTypeArr$values = $values();
        $VALUES = promotionDisplayTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(promotionDisplayTypeArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.preference.data.model.meta.PromotionDisplayType.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static PromotionDisplayType valueOf(String str) {
        return (PromotionDisplayType) Enum.valueOf(PromotionDisplayType.class, str);
    }

    public static PromotionDisplayType[] values() {
        return (PromotionDisplayType[]) $VALUES.clone();
    }
}
