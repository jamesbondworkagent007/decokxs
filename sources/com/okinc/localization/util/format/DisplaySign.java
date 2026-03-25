package com.okinc.localization.util.format;

import com.ibm.icu.number.NumberFormatter;
import kotlin.NoWhenBranchMatchedException;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class DisplaySign {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DisplaySign[] $VALUES;
    public static final DisplaySign AUTO = new DisplaySign("AUTO", 0);
    public static final DisplaySign EXCEPT_ZERO = new DisplaySign("EXCEPT_ZERO", 1);
    public static final DisplaySign ALWAYS = new DisplaySign("ALWAYS", 2);

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DisplaySign.values().length];
            try {
                iArr[DisplaySign.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisplaySign.EXCEPT_ZERO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DisplaySign.ALWAYS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DisplaySign[] $values() {
        return new DisplaySign[]{AUTO, EXCEPT_ZERO, ALWAYS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DisplaySign> getEntries() {
        return $ENTRIES;
    }

    private DisplaySign(String str, int i) {
    }

    static {
        DisplaySign[] displaySignArr$values = $values();
        $VALUES = displaySignArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(displaySignArr$values);
    }

    public final NumberFormatter.SignDisplay toSignDisplay() {
        int i = Application.OLrzqt[ordinal()];
        if (i == 1) {
            return NumberFormatter.SignDisplay.AUTO;
        }
        if (i == 2) {
            return NumberFormatter.SignDisplay.EXCEPT_ZERO;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return NumberFormatter.SignDisplay.ALWAYS;
    }

    public static DisplaySign valueOf(String str) {
        return (DisplaySign) Enum.valueOf(DisplaySign.class, str);
    }

    public static DisplaySign[] values() {
        return (DisplaySign[]) $VALUES.clone();
    }
}
