package o;

import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hvn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23310hvn {
    public static final C23310hvn copydefault = new C23310hvn();
    public static final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.hvm
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C23310hvn.copydefault();
        }
    });
    public static final int AEQbTJ = 8;

    private C23310hvn() {
    }

    public final pUP EZpvd() {
        return (pUP) KWHzl.getValue();
    }

    public static final pUP copydefault() {
        return pUU.KWHzl("DEX-LOG");
    }

    public static /* synthetic */ void e$default(C23310hvn c23310hvn, java.lang.String str, java.lang.Object obj, java.lang.Throwable th, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            th = null;
        }
        c23310hvn.AEQbTJ(str, obj, th);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, java.lang.Object obj, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strOLrzqt = OLrzqt(obj);
        if (th == null) {
            EZpvd().copydefault(str, strOLrzqt);
        } else {
            EZpvd().KWHzl(str, strOLrzqt, th);
        }
    }

    public static /* synthetic */ void i$default(C23310hvn c23310hvn, java.lang.String str, java.lang.Object obj, java.lang.Throwable th, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            th = null;
        }
        c23310hvn.EZpvd(str, obj, th);
    }

    public final void EZpvd(@NotNull java.lang.String str, java.lang.Object obj, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strOLrzqt = OLrzqt(obj);
        if (th == null) {
            EZpvd().OLrzqt(str, strOLrzqt);
        } else {
            EZpvd().copydefault(str, strOLrzqt, th);
        }
    }

    public static /* synthetic */ void v$default(C23310hvn c23310hvn, java.lang.String str, java.lang.Object obj, java.lang.Throwable th, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            th = null;
        }
        c23310hvn.KWHzl(str, obj, th);
    }

    public final void KWHzl(@NotNull java.lang.String str, java.lang.Object obj, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strOLrzqt = OLrzqt(obj);
        if (th == null) {
            EZpvd().EZpvd(str, strOLrzqt);
        } else {
            EZpvd().EZpvd(str, strOLrzqt, th);
        }
    }

    public static /* synthetic */ void d$default(C23310hvn c23310hvn, java.lang.String str, java.lang.Object obj, java.lang.Throwable th, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            th = null;
        }
        c23310hvn.copydefault(str, obj, th);
    }

    public final void copydefault(@NotNull java.lang.String str, java.lang.Object obj, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strOLrzqt = OLrzqt(obj);
        if (th == null) {
            EZpvd().AEQbTJ(str, strOLrzqt);
        } else {
            EZpvd().OLrzqt(str, strOLrzqt, th);
        }
    }

    public final java.lang.String OLrzqt(java.lang.Object obj) {
        java.lang.Object objM7377constructorimpl;
        java.lang.String strOLrzqt;
        if (obj == null) {
            return "";
        }
        try {
            Result.Application application = Result.Companion;
            if (obj instanceof java.lang.CharSequence) {
                strOLrzqt = obj.toString();
            } else if (obj instanceof java.util.Collection) {
                strOLrzqt = CollectionsKt___CollectionsKt.joinToString$default((java.lang.Iterable) obj, ",", null, null, 0, null, new Function1() { // from class: o.hvl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return C23310hvn.KWHzl(obj2);
                    }
                }, 30, null);
            } else if (obj instanceof java.lang.Object[]) {
                strOLrzqt = yDV.joinToString$default((java.lang.Object[]) obj, ",", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, new Function1() { // from class: o.hvs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return C23310hvn.EZpvd(obj2);
                    }
                }, 30, (java.lang.Object) null);
            } else {
                strOLrzqt = obj instanceof java.util.Map ? C23316hvt.OLrzqt(obj) : C23316hvt.OLrzqt(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(strOLrzqt);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.String string = obj.toString();
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = string;
        }
        return (java.lang.String) objM7377constructorimpl;
    }

    public static final java.lang.CharSequence KWHzl(java.lang.Object obj) {
        return copydefault.OLrzqt(obj);
    }

    public static final java.lang.CharSequence EZpvd(java.lang.Object obj) {
        return copydefault.OLrzqt(obj);
    }
}
