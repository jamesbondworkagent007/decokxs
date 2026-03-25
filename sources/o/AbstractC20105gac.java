package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC8564bFB;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20105gac<T extends AbstractC8564bFB<?, ?>> extends AbstractC20109gag<T> {
    public AbstractC16468ekW copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull AbstractC16468ekW abstractC16468ekW) {
        Intrinsics.checkNotNullParameter(abstractC16468ekW, "");
        this.copydefault = abstractC16468ekW;
    }

    public final AbstractC16468ekW OLrzqt() {
        AbstractC16468ekW abstractC16468ekW = this.copydefault;
        if (abstractC16468ekW != null) {
            return abstractC16468ekW;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AEQbTJ((AbstractC16468ekW) DataBindingUtil.inflate(android.view.LayoutInflater.from(constraintLayout.getContext()), C13754dXa.TaskDescription.alsFma, constraintLayout, true));
        OLrzqt().OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.gai
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractC20105gac.OLrzqt(this.EZpvd, view);
            }
        });
        EZpvd();
        values();
    }

    public static final void OLrzqt(AbstractC20105gac abstractC20105gac, android.view.View view) {
        abstractC20105gac.dismissAllowingStateLoss();
    }

    public final void EZpvd() {
        final C55173xeu c55173xeu = OLrzqt().KWHzl;
        c55173xeu.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNLfdT));
        c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
        c55173xeu.setRetry(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNUfqk));
        c55173xeu.setEmptyTypeImage(8);
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = C8003auW.copydefault(c55173xeu.AEQbTJ()).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst, "");
        C58156yvv.copydefault(abstractC58247yxgThrottleFirst, this).subscribe(new InterfaceC58227yxM() { // from class: o.gak
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC20105gac.EZpvd(c55173xeu, this, obj);
            }
        });
    }

    public static final void EZpvd(C55173xeu c55173xeu, AbstractC20105gac abstractC20105gac, java.lang.Object obj) {
        c55173xeu.setVisibility(4);
        abstractC20105gac.valueOf();
    }

    private final void values() {
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = C8003auW.copydefault(OLrzqt().AYXKKw).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst, "");
        C58156yvv.copydefault(abstractC58247yxgThrottleFirst, this).subscribe(new InterfaceC58227yxM() { // from class: o.gab
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC20105gac.copydefault(this.KWHzl, obj);
            }
        });
    }

    public static final void copydefault(AbstractC20105gac abstractC20105gac, java.lang.Object obj) {
        abstractC20105gac.AYXKKw();
    }

    @Override // o.AbstractC20109gag
    public void copydefault() {
        super.copydefault();
        OLrzqt().KWHzl.setVisibility(8);
        OLrzqt().AhwBna.setVisibility(0);
        T tGEmmrt = gEmmrt();
        InterfaceC8391bBo interfaceC8391bBo = tGEmmrt instanceof InterfaceC8391bBo ? (InterfaceC8391bBo) tGEmmrt : null;
        if (interfaceC8391bBo == null) {
            return;
        }
        AbstractC8426bCW abstractC8426bCWQKudOq = gEmmrt().QKudOq();
        C8486bDd c8486bDdKWHzl = abstractC8426bCWQKudOq.KWHzl();
        java.lang.String strCopydefault = interfaceC8391bBo.copydefault();
        java.lang.String feeAmount = c8486bDdKWHzl.getFeeAmount();
        OLrzqt().copydefault.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.iqeXgQ));
        OLrzqt().copydefault.KWHzl.setText(AbstractC8426bCW.formatToFeeCoinAmount$default(abstractC8426bCWQKudOq, strCopydefault, false, false, false, 14, null) + " " + AbstractC8426bCW.formatToFeeCurrencyAmount$default(abstractC8426bCWQKudOq, strCopydefault, false, false, false, 14, null));
        OLrzqt().AEQbTJ.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.HJWChPUUMfbK));
        OLrzqt().AEQbTJ.KWHzl.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.HJWChPRAkuRW));
        OLrzqt().AEQbTJ.KWHzl.setText(AbstractC8426bCW.formatToFeeCoinAmount$default(abstractC8426bCWQKudOq, feeAmount, false, false, false, 14, null) + " " + AbstractC8426bCW.formatToFeeCurrencyAmount$default(abstractC8426bCWQKudOq, feeAmount, false, false, false, 14, null));
        OLrzqt().AYXKKw.setEnabled(true);
        if (gEmmrt().dUDNAs().gHZMYf()) {
            OLrzqt().AYXKKw.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRccStateFromState));
        }
        android.view.View view = getView();
        if (view != null) {
            view.post(new java.lang.Runnable() { // from class: o.gah
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC20105gac.EZpvd(this.EZpvd);
                }
            });
        }
    }

    public static final void EZpvd(AbstractC20105gac abstractC20105gac) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) abstractC20105gac, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC20109gag
    public void AEQbTJ() {
        OLrzqt().KWHzl.setVisibility(0);
        OLrzqt().AhwBna.setVisibility(8);
    }

    @Override // o.AbstractC20109gag
    public void AhwBna() {
        OLrzqt().DbNXlk.KWHzl(0L);
    }

    @Override // o.AbstractC20109gag
    public void KWHzl() {
        OLrzqt().DbNXlk.copydefault();
    }
}
