package o;

import kotlin.jvm.internal.Intrinsics;
import o.pUP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pUU {
    public static volatile boolean AEQbTJ;
    public static pUQ KWHzl;
    public static pUP copydefault;
    public static final pUU EZpvd = new pUU();
    public static final int OLrzqt = 8;

    private pUU() {
    }

    public static final void AEQbTJ(@NotNull pUQ puq) {
        Intrinsics.checkNotNullParameter(puq, "");
        if (AEQbTJ) {
            java.lang.System.out.println((java.lang.Object) "OkLog is already initialized, do not initialize again");
        }
        KWHzl = puq;
        copydefault = new pUP(puq);
        AEQbTJ = true;
    }

    public static final void OLrzqt() {
        if (!AEQbTJ) {
            throw new java.lang.IllegalStateException("OkLog is not initialize".toString());
        }
    }

    public static final pUP KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUP pup = copydefault;
        Intrinsics.copydefault(pup);
        pUP.TaskDescription taskDescriptionKWHzl = new pUP.TaskDescription(pup.copydefault()).KWHzl(str);
        pUQ puq = KWHzl;
        Intrinsics.copydefault(puq);
        return taskDescriptionKWHzl.AEQbTJ(puq);
    }

    public static final void KWHzl(java.lang.String str, java.lang.Object obj) {
        OLrzqt();
        pUP pup = copydefault;
        Intrinsics.copydefault(pup);
        pup.copydefault(str, obj);
    }

    public static final void OLrzqt(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        OLrzqt();
        pUP pup = copydefault;
        Intrinsics.copydefault(pup);
        pup.EZpvd(str, str2);
    }

    public static final void copydefault(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        OLrzqt();
        pUP pup = copydefault;
        Intrinsics.copydefault(pup);
        pup.EZpvd(obj);
    }

    public static final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt();
        pUP pup = copydefault;
        Intrinsics.copydefault(pup);
        pup.copydefault(str);
    }

    public static final void EZpvd(java.lang.String str, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        OLrzqt();
        pUP pup = copydefault;
        Intrinsics.copydefault(pup);
        pup.OLrzqt(str, obj);
    }

    public static final void EZpvd(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        OLrzqt();
        pUP pup = copydefault;
        Intrinsics.copydefault(pup);
        pup.AEQbTJ(str, str2);
    }

    public static final void copydefault(java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str2, "");
        OLrzqt();
        pUP pup = copydefault;
        Intrinsics.copydefault(pup);
        pup.OLrzqt(str, str2, th);
    }

    public static final void AEQbTJ(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        OLrzqt();
        pUP pup = copydefault;
        Intrinsics.copydefault(pup);
        pup.KWHzl(obj);
    }

    public static final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt();
        pUP pup = copydefault;
        Intrinsics.copydefault(pup);
        pup.EZpvd(str);
    }

    public static final void copydefault(java.lang.String str, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        OLrzqt();
        pUP pup = copydefault;
        Intrinsics.copydefault(pup);
        pup.KWHzl(str, obj);
    }

    public static final void KWHzl(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        OLrzqt();
        pUP pup = copydefault;
        Intrinsics.copydefault(pup);
        pup.OLrzqt(str, str2);
    }

    public static final void KWHzl(java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str2, "");
        OLrzqt();
        pUP pup = copydefault;
        Intrinsics.copydefault(pup);
        pup.copydefault(str, str2, th);
    }

    public static final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt();
        pUP pup = copydefault;
        Intrinsics.copydefault(pup);
        pup.OLrzqt(str);
    }

    public static final void OLrzqt(java.lang.String str, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        OLrzqt();
        pUP pup = copydefault;
        Intrinsics.copydefault(pup);
        pup.AEQbTJ(str, obj);
    }

    public static final void valueOf(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        OLrzqt();
        pUP pup = copydefault;
        Intrinsics.copydefault(pup);
        pup.gEmmrt(str, str2);
    }

    public static final void OLrzqt(java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str2, "");
        OLrzqt();
        pUP pup = copydefault;
        Intrinsics.copydefault(pup);
        pup.AEQbTJ(str, str2, th);
    }

    public static final void KWHzl(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        OLrzqt();
        pUP pup = copydefault;
        Intrinsics.copydefault(pup);
        pup.OLrzqt(obj);
    }

    public static final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt();
        pUP pup = copydefault;
        Intrinsics.copydefault(pup);
        pup.AEQbTJ(str);
    }

    public static final void AEQbTJ(java.lang.String str, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        OLrzqt();
        pUP pup = copydefault;
        Intrinsics.copydefault(pup);
        pup.EZpvd(str, obj);
    }

    public static final void copydefault(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        OLrzqt();
        pUP pup = copydefault;
        Intrinsics.copydefault(pup);
        pup.copydefault(str, str2);
    }

    public static final void AEQbTJ(java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str2, "");
        OLrzqt();
        pUP pup = copydefault;
        Intrinsics.copydefault(pup);
        pup.KWHzl(str, str2, th);
    }

    public static final void AEQbTJ(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        OLrzqt();
        pUP pup = copydefault;
        Intrinsics.copydefault(pup);
        pup.KWHzl(str, str2);
    }

    public static /* synthetic */ java.io.File getToadyZipFileByLimit$default(long j, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        return EZpvd(j, (java.util.List<java.io.File>) list);
    }

    public static final java.io.File EZpvd(long j, java.util.List<java.io.File> list) {
        pUP pup = copydefault;
        Intrinsics.copydefault(pup);
        return pup.AEQbTJ("today", j, list);
    }

    public static /* synthetic */ java.io.File getZipFile$default(java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        return EZpvd((java.util.List<java.io.File>) list);
    }

    public static final java.io.File EZpvd(java.util.List<java.io.File> list) {
        pUP pup = copydefault;
        Intrinsics.copydefault(pup);
        return pup.AEQbTJ("", list);
    }

    public static /* synthetic */ java.io.File getZipFile$default(java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        return EZpvd(str, (java.util.List<java.io.File>) list);
    }

    public static final java.io.File EZpvd(@NotNull java.lang.String str, java.util.List<java.io.File> list) {
        Intrinsics.checkNotNullParameter(str, "");
        pUP pup = copydefault;
        Intrinsics.copydefault(pup);
        return pup.AEQbTJ(str, list);
    }

    public static /* synthetic */ java.io.File getZipFileByLimit$default(java.lang.String str, long j, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            list = null;
        }
        return copydefault(str, j, (java.util.List<java.io.File>) list);
    }

    public static final java.io.File copydefault(@NotNull java.lang.String str, long j, java.util.List<java.io.File> list) {
        Intrinsics.checkNotNullParameter(str, "");
        pUP pup = copydefault;
        Intrinsics.copydefault(pup);
        return pup.OLrzqt(str, j, list);
    }

    public static /* synthetic */ java.io.File getZipFileByLimit$default(long j, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        return KWHzl(j, (java.util.List<java.io.File>) list);
    }

    public static final java.io.File KWHzl(long j, java.util.List<java.io.File> list) {
        return copydefault("", j, list);
    }

    public static final void copydefault() {
        pUP pup = copydefault;
        Intrinsics.copydefault(pup);
        pup.AEQbTJ();
    }

    public static final void EZpvd(boolean z) {
        pUP pup = copydefault;
        Intrinsics.copydefault(pup);
        pup.copydefault(z);
    }
}
