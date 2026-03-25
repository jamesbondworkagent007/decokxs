package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wTr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52661wTr {
    public Function2<? super android.view.View, ? super java.lang.Integer, Unit> AEQbTJ;
    public Function2<? super android.view.View, ? super java.lang.Integer, Unit> EZpvd;
    public Function2<? super android.view.View, ? super java.lang.Integer, Unit> OLrzqt;
    public Function2<? super android.view.View, ? super java.lang.Integer, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull Function2<? super android.view.View, ? super java.lang.Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.OLrzqt = function2;
    }

    public void KWHzl(@NotNull android.view.View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        Function2<? super android.view.View, ? super java.lang.Integer, Unit> function2 = this.OLrzqt;
        if (function2 != null) {
            function2.invoke(view, java.lang.Integer.valueOf(i));
        }
    }

    public void AEQbTJ(@NotNull android.view.View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        Function2<? super android.view.View, ? super java.lang.Integer, Unit> function2 = this.AEQbTJ;
        if (function2 != null) {
            function2.invoke(view, java.lang.Integer.valueOf(i));
        }
    }

    public void EZpvd(@NotNull android.view.View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        Function2<? super android.view.View, ? super java.lang.Integer, Unit> function2 = this.copydefault;
        if (function2 != null) {
            function2.invoke(view, java.lang.Integer.valueOf(i));
        }
    }

    public void OLrzqt(@NotNull android.view.View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        Function2<? super android.view.View, ? super java.lang.Integer, Unit> function2 = this.EZpvd;
        if (function2 != null) {
            function2.invoke(view, java.lang.Integer.valueOf(i));
        }
    }
}
