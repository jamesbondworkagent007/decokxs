package com.okinc.business.defi.wallet.custom;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class OKWXRCProtocolEnum {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OKWXRCProtocolEnum[] $VALUES;
    public static final Activity Companion;
    private final int protocolId;
    public static final OKWXRCProtocolEnum BRC20 = new OKWXRCProtocolEnum("BRC20", 0, 1);
    public static final OKWXRCProtocolEnum ARC20 = new OKWXRCProtocolEnum("ARC20", 1, 2);
    public static final OKWXRCProtocolEnum RUNES = new OKWXRCProtocolEnum("RUNES", 2, 3);
    public static final OKWXRCProtocolEnum DRC20 = new OKWXRCProtocolEnum("DRC20", 3, 4);
    public static final OKWXRCProtocolEnum SRC20 = new OKWXRCProtocolEnum("SRC20", 4, 5);
    public static final OKWXRCProtocolEnum BRC20S = new OKWXRCProtocolEnum("BRC20S", 5, 6);
    public static final OKWXRCProtocolEnum FRACTAL_CAT20 = new OKWXRCProtocolEnum("FRACTAL_CAT20", 6, 17);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OKWXRCProtocolEnum[] $values() {
        return new OKWXRCProtocolEnum[]{BRC20, ARC20, RUNES, DRC20, SRC20, BRC20S, FRACTAL_CAT20};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OKWXRCProtocolEnum> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getProtocolId() {
        return this.protocolId;
    }

    private OKWXRCProtocolEnum(String str, int i, int i2) {
        this.protocolId = i2;
    }

    static {
        OKWXRCProtocolEnum[] oKWXRCProtocolEnumArr$values = $values();
        $VALUES = oKWXRCProtocolEnumArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(oKWXRCProtocolEnumArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.custom.OKWXRCProtocolEnum.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final OKWXRCProtocolEnum AEQbTJ(int i) {
            if (i != 17) {
                switch (i) {
                    case 1:
                        return OKWXRCProtocolEnum.BRC20;
                    case 2:
                        return OKWXRCProtocolEnum.ARC20;
                    case 3:
                        return OKWXRCProtocolEnum.RUNES;
                    case 4:
                        return OKWXRCProtocolEnum.DRC20;
                    case 5:
                        return OKWXRCProtocolEnum.SRC20;
                    case 6:
                        return OKWXRCProtocolEnum.BRC20S;
                    default:
                        return OKWXRCProtocolEnum.BRC20;
                }
            }
            return OKWXRCProtocolEnum.FRACTAL_CAT20;
        }
    }

    public static OKWXRCProtocolEnum valueOf(String str) {
        return (OKWXRCProtocolEnum) Enum.valueOf(OKWXRCProtocolEnum.class, str);
    }

    public static OKWXRCProtocolEnum[] values() {
        return (OKWXRCProtocolEnum[]) $VALUES.clone();
    }
}
