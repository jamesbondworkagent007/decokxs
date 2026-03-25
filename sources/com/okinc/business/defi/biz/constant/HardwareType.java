package com.okinc.business.defi.biz.constant;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.C57032yak;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class HardwareType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ HardwareType[] $VALUES;
    public static final Application Companion;
    public static final HardwareType LedgerNanoX = new HardwareType("LedgerNanoX", 0);
    public static final HardwareType Keystone = new HardwareType("Keystone", 1);
    public static final HardwareType OneKey = new HardwareType("OneKey", 2);
    public static final HardwareType LedgerFlex = new HardwareType("LedgerFlex", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ HardwareType[] $values() {
        return new HardwareType[]{LedgerNanoX, Keystone, OneKey, LedgerFlex};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<HardwareType> getEntries() {
        return $ENTRIES;
    }

    private HardwareType(String str, int i) {
    }

    static {
        HardwareType[] hardwareTypeArr$values = $values();
        $VALUES = hardwareTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(hardwareTypeArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.constant.HardwareType.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final HardwareType AEQbTJ(int i) {
            if (i == 0) {
                return HardwareType.LedgerNanoX;
            }
            if (i == 1) {
                return HardwareType.Keystone;
            }
            if (i == 2) {
                return HardwareType.OneKey;
            }
            if (i == 3) {
                return HardwareType.LedgerFlex;
            }
            return HardwareType.LedgerNanoX;
        }

        public final HardwareType copydefault(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C57032yak.AEQbTJ.AEQbTJ(str) ? HardwareType.LedgerFlex : HardwareType.LedgerNanoX;
        }
    }

    public static HardwareType valueOf(String str) {
        return (HardwareType) Enum.valueOf(HardwareType.class, str);
    }

    public static HardwareType[] values() {
        return (HardwareType[]) $VALUES.clone();
    }
}
