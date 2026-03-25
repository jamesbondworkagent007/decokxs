package com.okinc.unify_trade.bot.dcd.config;

import androidx.annotation.StringRes;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yDY;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class DcdTpMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DcdTpMode[] $VALUES;
    public static final ActionBar Companion;
    private final int desc;
    private final String mode;
    public static final DcdTpMode BUY_PRICE = new DcdTpMode("BUY_PRICE", 0, "buyPrice", C55688xof.Application.DTeKQX);
    public static final DcdTpMode CUSTOM_PRICE = new DcdTpMode("CUSTOM_PRICE", 1, "customPrice", C55688xof.Application.RAQtXZ);
    public static final DcdTpMode DECIMAL = new DcdTpMode("DECIMAL", 2, "decimal", C55688xof.Application.RbVjfb);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DcdTpMode[] $values() {
        return new DcdTpMode[]{BUY_PRICE, CUSTOM_PRICE, DECIMAL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DcdTpMode> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDesc() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMode() {
        return this.mode;
    }

    private DcdTpMode(String str, @StringRes int i, String str2, int i2) {
        this.mode = str2;
        this.desc = i2;
    }

    static {
        DcdTpMode[] dcdTpModeArr$values = $values();
        $VALUES = dcdTpModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(dcdTpModeArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.dcd.config.DcdTpMode.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final List<DcdTpMode> EZpvd(boolean z) {
            if (z) {
                return yDY.gEmmrt(DcdTpMode.BUY_PRICE, DcdTpMode.DECIMAL);
            }
            return yDY.gEmmrt(DcdTpMode.BUY_PRICE, DcdTpMode.CUSTOM_PRICE);
        }
    }

    public static DcdTpMode valueOf(String str) {
        return (DcdTpMode) Enum.valueOf(DcdTpMode.class, str);
    }

    public static DcdTpMode[] values() {
        return (DcdTpMode[]) $VALUES.clone();
    }
}
