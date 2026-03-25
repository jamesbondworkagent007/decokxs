package o;

import kotlin.jvm.internal.Intrinsics;
import o.qFL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qFP {
    public static final qFP OLrzqt = new qFP();

    private qFP() {
    }

    public final java.util.List<qFL> copydefault() {
        return yDY.gEmmrt(new qFL.VoiceInteractor(0.0f, null, 3, null), new qFL.FragmentManager(0.0f, null, 3, null), new qFL.StateListAnimator(0.0f, null, 3, null), new qFL.TaskStackBuilder(0.0f, null, 3, null), new qFL.PendingIntent(0.0f, null, 3, null), new qFL.Dialog(0.0f, null, 3, null), new qFL.TaskDescription(0.0f, null, 3, null), new qFL.SharedElementCallback(0.0f, null, 3, null), new qFL.Fragment(0.0f, null, 3, null), new qFL.LoaderManager(0.0f, null, 3, null), new qFL.Application(0.0f, null, 3, null), new qFL.ActionBar(0.0f, null, 3, null));
    }

    public final void KWHzl(@NotNull java.util.List<? extends qFL> list, @NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((qFL) next).EZpvd(), (java.lang.Object) str)) {
                    break;
                }
            }
        }
        qFL qfl = (qFL) next;
        if (qfl != null) {
            qfl.copydefault();
        }
    }

    public final void KWHzl(@NotNull java.util.List<? extends qFL> list, @NotNull java.lang.String str, float f) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((qFL) next).EZpvd(), (java.lang.Object) str)) {
                    break;
                }
            }
        }
        qFL qfl = (qFL) next;
        if (qfl != null) {
            qfl.OLrzqt(f);
        }
    }
}
