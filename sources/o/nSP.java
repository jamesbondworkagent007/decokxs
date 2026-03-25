package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class nSP extends AbstractC52787wYi {
    public final Function1<PaymentRequiredStatus, Unit> EZpvd;
    public PaymentRequiredStatus KWHzl;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public nSP(@NotNull Function1<? super PaymentRequiredStatus, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
        this.KWHzl = PaymentRequiredStatus.REQUIRED;
        this.OLrzqt = true;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(6);
        wxq.setTitle(C33070mpX.AYXKKw(C35399nuc.LoaderManager.OAUGar));
    }

    @Override // o.AbstractC52787wYi, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
        copydefault();
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.AYXKKw));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new StateListAnimator(c52794wYpCopydefault, 1000L, this));
        }
    }

    public final void copydefault() {
        OLrzqt(yDY.gEmmrt(new C55167xeo(-1, C33070mpX.AYXKKw(C35399nuc.LoaderManager.OhcwxsRkSIEV), C33070mpX.AYXKKw(C35399nuc.LoaderManager.gCiISl), null, 0, 24, null), new C55167xeo(-1, C33070mpX.AYXKKw(C35399nuc.LoaderManager.DDDCac), C33070mpX.AYXKKw(C35399nuc.LoaderManager.Ohcwxs), null, 0, 24, null)));
        OLrzqt(new Function2() { // from class: o.nSN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return nSP.KWHzl(this.OLrzqt, ((java.lang.Integer) obj).intValue(), (C55167xeo) obj2);
            }
        });
        KWHzl(0);
    }

    public static final Unit KWHzl(nSP nsp, int i, C55167xeo c55167xeo) {
        PaymentRequiredStatus paymentRequiredStatus;
        if (i == 1) {
            paymentRequiredStatus = PaymentRequiredStatus.NOT_REQUIRED;
        } else {
            paymentRequiredStatus = PaymentRequiredStatus.REQUIRED;
        }
        nsp.KWHzl = paymentRequiredStatus;
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ nSP OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, nSP nsp) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = nsp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.EZpvd.invoke(this.OLrzqt.KWHzl);
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }
}
