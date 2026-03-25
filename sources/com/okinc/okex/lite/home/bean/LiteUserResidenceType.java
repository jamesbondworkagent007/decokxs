package com.okinc.okex.lite.home.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class LiteUserResidenceType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LiteUserResidenceType[] $VALUES;
    public static final ActionBar Companion;
    public static final LiteUserResidenceType NOT_REQUIRING_WARNING = new LiteUserResidenceType("NOT_REQUIRING_WARNING", 0, 0);
    public static final LiteUserResidenceType REQUIRING_WARNING = new LiteUserResidenceType("REQUIRING_WARNING", 1, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LiteUserResidenceType[] $values() {
        return new LiteUserResidenceType[]{NOT_REQUIRING_WARNING, REQUIRING_WARNING};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LiteUserResidenceType> getEntries() {
        return $ENTRIES;
    }

    private LiteUserResidenceType(String str, int i, int i2) {
    }

    static {
        LiteUserResidenceType[] liteUserResidenceTypeArr$values = $values();
        $VALUES = liteUserResidenceTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(liteUserResidenceTypeArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.LiteUserResidenceType.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static LiteUserResidenceType valueOf(String str) {
        return (LiteUserResidenceType) Enum.valueOf(LiteUserResidenceType.class, str);
    }

    public static LiteUserResidenceType[] values() {
        return (LiteUserResidenceType[]) $VALUES.clone();
    }
}
