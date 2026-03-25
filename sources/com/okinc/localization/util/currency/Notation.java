package com.okinc.localization.util.currency;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.C7220afi;
import o.C7230afs;
import o.C7237afz;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class Notation {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ Notation[] $VALUES;
    public static final Notation DEFAULT = new Notation("DEFAULT", 0);
    public static final Notation COMPACT_SHORT = new Notation("COMPACT_SHORT", 1);

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Notation.values().length];
            try {
                iArr[Notation.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Notation.COMPACT_SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ Notation[] $values() {
        return new Notation[]{DEFAULT, COMPACT_SHORT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Notation> getEntries() {
        return $ENTRIES;
    }

    private Notation(String str, int i) {
    }

    static {
        Notation[] notationArr$values = $values();
        $VALUES = notationArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(notationArr$values);
    }

    public final C7230afs toICUNotation$OKBase_okbase() {
        int i = TaskDescription.KWHzl[ordinal()];
        if (i == 1) {
            C7237afz c7237afzOLrzqt = C7230afs.OLrzqt();
            Intrinsics.checkNotNullExpressionValue(c7237afzOLrzqt, "");
            return c7237afzOLrzqt;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        C7220afi c7220afiAEQbTJ = C7230afs.AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(c7220afiAEQbTJ, "");
        return c7220afiAEQbTJ;
    }

    public static Notation valueOf(String str) {
        return (Notation) Enum.valueOf(Notation.class, str);
    }

    public static Notation[] values() {
        return (Notation[]) $VALUES.clone();
    }
}
