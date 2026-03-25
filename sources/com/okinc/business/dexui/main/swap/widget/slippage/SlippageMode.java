package com.okinc.business.dexui.main.swap.widget.slippage;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class SlippageMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SlippageMode[] $VALUES;
    public static final Activity Companion;
    public static final SlippageMode Dynamic = new SlippageMode("Dynamic", 0, 1);
    public static final SlippageMode Fixed = new SlippageMode("Fixed", 1, 2);
    private final int type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SlippageMode[] $values() {
        return new SlippageMode[]{Dynamic, Fixed};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SlippageMode> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    private SlippageMode(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        SlippageMode[] slippageModeArr$values = $values();
        $VALUES = slippageModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(slippageModeArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final SlippageMode EZpvd(int i) {
            SlippageMode next;
            Iterator<SlippageMode> it = SlippageMode.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getType() == i) {
                    break;
                }
            }
            SlippageMode slippageMode = next;
            return slippageMode == null ? SlippageMode.Dynamic : slippageMode;
        }
    }

    public static SlippageMode valueOf(String str) {
        return (SlippageMode) Enum.valueOf(SlippageMode.class, str);
    }

    public static SlippageMode[] values() {
        return (SlippageMode[]) $VALUES.clone();
    }
}
