package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import o.C56770yRr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yRq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56769yRq {
    public static final C56770yRr AEQbTJ;
    public static final C56933yXs EZpvd;
    public static final C56933yXs KWHzl;
    public static final C56933yXs OLrzqt;
    public static final yRA<C56770yRr> copydefault;
    public static final C56933yXs[] djBIcL;
    public static final java.lang.String gEmmrt;
    public static final C56933yXs valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final C56933yXs AEQbTJ() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final C56933yXs[] EZpvd() {
        return djBIcL;
    }

    static {
        C56933yXs c56933yXs = new C56933yXs("org.jspecify.nullness");
        OLrzqt = c56933yXs;
        C56933yXs c56933yXs2 = new C56933yXs("org.jspecify.annotations");
        KWHzl = c56933yXs2;
        C56933yXs c56933yXs3 = new C56933yXs("io.reactivex.rxjava3.annotations");
        valueOf = c56933yXs3;
        C56933yXs c56933yXs4 = new C56933yXs("org.checkerframework.checker.nullness.compatqual");
        EZpvd = c56933yXs4;
        java.lang.String strKWHzl = c56933yXs3.KWHzl();
        gEmmrt = strKWHzl;
        djBIcL = new C56933yXs[]{new C56933yXs(strKWHzl + ".Nullable"), new C56933yXs(strKWHzl + ".NonNull")};
        C56933yXs c56933yXs5 = new C56933yXs("org.jetbrains.annotations");
        C56770yRr.TaskDescription taskDescription = C56770yRr.OLrzqt;
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(c56933yXs5, taskDescription.EZpvd());
        kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt(new C56933yXs("androidx.annotation"), taskDescription.EZpvd());
        kotlin.Pair pairOLrzqt3 = C56390yDp.OLrzqt(new C56933yXs("android.support.annotation"), taskDescription.EZpvd());
        kotlin.Pair pairOLrzqt4 = C56390yDp.OLrzqt(new C56933yXs("android.annotation"), taskDescription.EZpvd());
        kotlin.Pair pairOLrzqt5 = C56390yDp.OLrzqt(new C56933yXs("com.android.annotations"), taskDescription.EZpvd());
        kotlin.Pair pairOLrzqt6 = C56390yDp.OLrzqt(new C56933yXs("org.eclipse.jdt.annotation"), taskDescription.EZpvd());
        kotlin.Pair pairOLrzqt7 = C56390yDp.OLrzqt(new C56933yXs("org.checkerframework.checker.nullness.qual"), taskDescription.EZpvd());
        kotlin.Pair pairOLrzqt8 = C56390yDp.OLrzqt(c56933yXs4, taskDescription.EZpvd());
        kotlin.Pair pairOLrzqt9 = C56390yDp.OLrzqt(new C56933yXs("javax.annotation"), taskDescription.EZpvd());
        kotlin.Pair pairOLrzqt10 = C56390yDp.OLrzqt(new C56933yXs("edu.umd.cs.findbugs.annotations"), taskDescription.EZpvd());
        kotlin.Pair pairOLrzqt11 = C56390yDp.OLrzqt(new C56933yXs("io.reactivex.annotations"), taskDescription.EZpvd());
        C56933yXs c56933yXs6 = new C56933yXs("androidx.annotation.RecentlyNullable");
        ReportLevel reportLevel = ReportLevel.WARN;
        kotlin.Pair pairOLrzqt12 = C56390yDp.OLrzqt(c56933yXs6, new C56770yRr(reportLevel, null, null, 4, null));
        kotlin.Pair pairOLrzqt13 = C56390yDp.OLrzqt(new C56933yXs("androidx.annotation.RecentlyNonNull"), new C56770yRr(reportLevel, null, null, 4, null));
        kotlin.Pair pairOLrzqt14 = C56390yDp.OLrzqt(new C56933yXs("lombok"), taskDescription.EZpvd());
        C56385yDk c56385yDk = new C56385yDk(2, 1);
        ReportLevel reportLevel2 = ReportLevel.STRICT;
        copydefault = new yRB(C56424yEw.gEmmrt(pairOLrzqt, pairOLrzqt2, pairOLrzqt3, pairOLrzqt4, pairOLrzqt5, pairOLrzqt6, pairOLrzqt7, pairOLrzqt8, pairOLrzqt9, pairOLrzqt10, pairOLrzqt11, pairOLrzqt12, pairOLrzqt13, pairOLrzqt14, C56390yDp.OLrzqt(c56933yXs, new C56770yRr(reportLevel, c56385yDk, reportLevel2)), C56390yDp.OLrzqt(c56933yXs2, new C56770yRr(reportLevel, new C56385yDk(2, 1), reportLevel2)), C56390yDp.OLrzqt(c56933yXs3, new C56770yRr(reportLevel, new C56385yDk(1, 8), reportLevel2))));
        AEQbTJ = new C56770yRr(reportLevel, null, null, 4, null);
    }

    public static /* synthetic */ C56776yRx getDefaultJsr305Settings$default(C56385yDk c56385yDk, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c56385yDk = C56385yDk.KWHzl;
        }
        return OLrzqt(c56385yDk);
    }

    public static final C56776yRx OLrzqt(@NotNull C56385yDk c56385yDk) {
        ReportLevel reportLevelOLrzqt;
        Intrinsics.checkNotNullParameter(c56385yDk, "");
        C56770yRr c56770yRr = AEQbTJ;
        if (c56770yRr.EZpvd() != null && c56770yRr.EZpvd().compareTo(c56385yDk) <= 0) {
            reportLevelOLrzqt = c56770yRr.copydefault();
        } else {
            reportLevelOLrzqt = c56770yRr.OLrzqt();
        }
        ReportLevel reportLevel = reportLevelOLrzqt;
        return new C56776yRx(reportLevel, AEQbTJ(reportLevel), null, 4, null);
    }

    public static final ReportLevel AEQbTJ(@NotNull ReportLevel reportLevel) {
        Intrinsics.checkNotNullParameter(reportLevel, "");
        if (reportLevel == ReportLevel.WARN) {
            return null;
        }
        return reportLevel;
    }

    public static final ReportLevel AEQbTJ(@NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        return getReportLevelForAnnotation$default(c56933yXs, yRA.EZpvd.EZpvd(), null, 4, null);
    }

    public static /* synthetic */ ReportLevel getReportLevelForAnnotation$default(C56933yXs c56933yXs, yRA yra, C56385yDk c56385yDk, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            c56385yDk = new C56385yDk(1, 7, 20);
        }
        return OLrzqt(c56933yXs, yra, c56385yDk);
    }

    public static final ReportLevel OLrzqt(@NotNull C56933yXs c56933yXs, @NotNull yRA<? extends ReportLevel> yra, @NotNull C56385yDk c56385yDk) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(yra, "");
        Intrinsics.checkNotNullParameter(c56385yDk, "");
        ReportLevel reportLevelCopydefault = yra.copydefault(c56933yXs);
        if (reportLevelCopydefault != null) {
            return reportLevelCopydefault;
        }
        C56770yRr c56770yRrCopydefault = copydefault.copydefault(c56933yXs);
        if (c56770yRrCopydefault == null) {
            return ReportLevel.IGNORE;
        }
        if (c56770yRrCopydefault.EZpvd() != null && c56770yRrCopydefault.EZpvd().compareTo(c56385yDk) <= 0) {
            return c56770yRrCopydefault.copydefault();
        }
        return c56770yRrCopydefault.OLrzqt();
    }
}
