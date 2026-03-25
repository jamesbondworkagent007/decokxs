package o;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC10347bmj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.blP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10274blP extends C10264blF {
    @Override // o.C10264blF
    public void copydefault(@NotNull C17027euz c17027euz) {
        Intrinsics.checkNotNullParameter(c17027euz, "");
        android.widget.ImageView imageView = c17027euz.copydefault;
        imageView.setOnClickListener(new Application(imageView, 1000L, this));
        C14646dpQ.EZpvd(this, C10350bmm.AEQbTJ.AEQbTJ(), Lifecycle.State.CREATED, new Function1() { // from class: o.blS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10274blP.OLrzqt(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        c17027euz.getRoot().post(new java.lang.Runnable() { // from class: o.blO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C10274blP.KWHzl(this.KWHzl);
            }
        });
    }

    public static final Unit OLrzqt(C10274blP c10274blP, boolean z) {
        if (z) {
            c10274blP.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C10274blP c10274blP) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c10274blP, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        C10350bmm.AEQbTJ.AEQbTJ(AbstractC10347bmj.ActionBar.copydefault);
    }

    /* JADX INFO: renamed from: o.blP$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C10274blP OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C10274blP c10274blP) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = c10274blP;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.dismiss();
            }
        }
    }
}
