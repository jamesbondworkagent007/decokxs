package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import o.InterfaceC31257lqc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nRl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C34101nRl extends AbstractC52780wYb {
    public final java.lang.CharSequence copydefault = C33070mpX.AYXKKw(C35399nuc.LoaderManager.OCdtug);
    public final boolean OLrzqt = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC52780wYb
    public java.lang.CharSequence AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC52780wYb, o.wXX
    public boolean getHasFooter() {
        return this.OLrzqt;
    }

    @Override // o.AbstractC52780wYb
    public void copydefault(@NotNull C54953xam c54953xam) {
        Intrinsics.checkNotNullParameter(c54953xam, "");
        c54953xam.OLrzqt.setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.DtnWsU));
        wYK wyk = c54953xam.KWHzl;
        Intrinsics.checkNotNullExpressionValue(wyk, "");
        wyk.setVisibility(8);
    }

    @Override // o.AbstractC52780wYb, o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(5);
        wxq.setTitle(C33070mpX.AYXKKw(C35399nuc.LoaderManager.OCdtug));
    }

    @Override // o.AbstractC52780wYb, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.zlzhuY));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new ActionBar(c52794wYpCopydefault, 1000L, wyf, this));
        }
    }

    /* JADX INFO: renamed from: o.nRl$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ wYF EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C34101nRl OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, wYF wyf, C34101nRl c34101nRl) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = wyf;
            this.OLrzqt = c34101nRl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                InterfaceC31257lqc interfaceC31257lqc = (InterfaceC31257lqc) C43251rlk.OLrzqt(InterfaceC31257lqc.class);
                if (interfaceC31257lqc != null) {
                    android.content.Context context = this.EZpvd.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    InterfaceC31257lqc.StateListAnimator.activatePayAccount$default(interfaceC31257lqc, context, false, true, true, null, 16, null);
                }
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }
}
