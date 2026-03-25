package o;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class qXX extends AbstractC52786wYh {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final java.util.List<C55276xgr> AEQbTJ;
    public final java.lang.String AYXKKw;
    public final boolean EZpvd;
    public DialogInterface.OnDismissListener KWHzl;
    public Function1<? super C55276xgr, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function1<? super C55276xgr, Unit> function1) {
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.EZpvd;
    }

    public qXX(@NotNull java.util.List<C55276xgr> list, java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
        this.AYXKKw = str;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qXX.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        if (this.AYXKKw != null) {
            wxq.setStyle(2);
            wxq.setTitle(this.AYXKKw);
        } else {
            wxq.setStyle(0);
        }
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        c55198xfS.setSingleOneColumnData(this.AEQbTJ, new yHO() { // from class: o.qXY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return qXX.copydefault(this.KWHzl, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
    }

    public static final Unit copydefault(qXX qxx, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        Function1<? super C55276xgr, Unit> function1 = qxx.OLrzqt;
        if (function1 != null) {
            function1.invoke(c55276xgr);
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC52786wYh, o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.KWHzl;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.OLrzqt = null;
        this.KWHzl = null;
        super.onDestroy();
    }
}
