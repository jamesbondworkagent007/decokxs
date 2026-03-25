package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean;
import com.okinc.business.defi.biz.core.tx.speedup.bean.SpeedUpInfoBean;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC12413cmV;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gCF<B extends SpeedUpInfoBean, T extends AbstractC12413cmV<B>> extends gCR<B, T> {
    public AbstractC16468ekW AEQbTJ;
    public InterfaceC58217yxC KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull AbstractC16468ekW abstractC16468ekW) {
        Intrinsics.checkNotNullParameter(abstractC16468ekW, "");
        this.AEQbTJ = abstractC16468ekW;
    }

    public final AbstractC16468ekW KWHzl() {
        AbstractC16468ekW abstractC16468ekW = this.AEQbTJ;
        if (abstractC16468ekW != null) {
            return abstractC16468ekW;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.gCR, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        KWHzl((AbstractC16468ekW) DataBindingUtil.inflate(android.view.LayoutInflater.from(constraintLayout.getContext()), C13754dXa.TaskDescription.alsFma, constraintLayout, true));
        KWHzl().OLrzqt.setOnClickListener(this);
        djBIcL();
        AhwBna();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Integer numValueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int i = C13754dXa.ActionBar.sbu;
        if (numValueOf != null && numValueOf.intValue() == i) {
            dismissAllowingStateLoss();
        }
    }

    private final void AhwBna() {
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = C8003auW.copydefault(KWHzl().AYXKKw).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst, "");
        C58156yvv.copydefault(abstractC58247yxgThrottleFirst, this).subscribe(new InterfaceC58227yxM() { // from class: o.gCQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gCF.copydefault(this.KWHzl, obj);
            }
        });
    }

    public static final void copydefault(gCF gcf, java.lang.Object obj) {
        gcf.valueOf();
    }

    private final void djBIcL() {
        final C55173xeu c55173xeu;
        AbstractC16468ekW abstractC16468ekWKWHzl = KWHzl();
        if (abstractC16468ekWKWHzl == null || (c55173xeu = abstractC16468ekWKWHzl.KWHzl) == null) {
            return;
        }
        c55173xeu.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNLfdT));
        c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
        c55173xeu.setRetry(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNUfqk));
        c55173xeu.setEmptyTypeImage(8);
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = C8003auW.copydefault(c55173xeu.AEQbTJ()).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst, "");
        C58156yvv.copydefault(abstractC58247yxgThrottleFirst, this).subscribe(new InterfaceC58227yxM() { // from class: o.gCK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gCF.OLrzqt(c55173xeu, this, obj);
            }
        });
    }

    public static final void OLrzqt(C55173xeu c55173xeu, gCF gcf, java.lang.Object obj) {
        c55173xeu.setVisibility(4);
        gcf.AYXKKw();
    }

    @Override // o.gCR
    public void copydefault() {
        Group group;
        C55173xeu c55173xeu;
        super.copydefault();
        AbstractC16468ekW abstractC16468ekWKWHzl = KWHzl();
        if (abstractC16468ekWKWHzl != null && (c55173xeu = abstractC16468ekWKWHzl.KWHzl) != null) {
            c55173xeu.setVisibility(8);
        }
        AbstractC16468ekW abstractC16468ekWKWHzl2 = KWHzl();
        if (abstractC16468ekWKWHzl2 != null && (group = abstractC16468ekWKWHzl2.AhwBna) != null) {
            group.setVisibility(0);
        }
        KWHzl().copydefault.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.iqeXgQ));
        KWHzl().copydefault.KWHzl.setText(gEmmrt().valueOf().KWHzl(gEmmrt().KWHzl()));
        KWHzl().AEQbTJ.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.HJWChPUUMfbK));
        android.widget.TextView textView = KWHzl().AEQbTJ.KWHzl;
        int i = C52761wXj.ActionBar.DCUTEI;
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setTextColor(C55366xib.KWHzl(i, context));
        textView.setText(gEmmrt().valueOf().KWHzl(gEmmrt().copydefault()));
        KWHzl().AYXKKw.setEnabled(true);
        AbstractC12782ctV abstractC12782ctVEjfBZ = gEmmrt().ejfBZ();
        if (abstractC12782ctVEjfBZ != null && abstractC12782ctVEjfBZ.gHZMYf()) {
            KWHzl().AYXKKw.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRccStateFromState));
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.gCR
    public void AEQbTJ() {
        Group group;
        C55173xeu c55173xeu;
        AbstractC16468ekW abstractC16468ekWKWHzl = KWHzl();
        if (abstractC16468ekWKWHzl != null && (c55173xeu = abstractC16468ekWKWHzl.KWHzl) != null) {
            c55173xeu.setVisibility(0);
        }
        AbstractC16468ekW abstractC16468ekWKWHzl2 = KWHzl();
        if (abstractC16468ekWKWHzl2 == null || (group = abstractC16468ekWKWHzl2.AhwBna) == null) {
            return;
        }
        group.setVisibility(8);
    }

    @Override // o.gCR
    public void copydefault(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(str, str2);
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2) {
        OLrzqt();
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        eFB efb = eFB.KWHzl;
        AbstractC58185ywX<ResponseData<DappTxResultBean>> abstractC58185ywXKWHzl = gEmmrt().KWHzl(str, str2, activity);
        C10854bwM c10854bwMOLrzqt = gEmmrt().OLrzqt();
        Intrinsics.copydefault(c10854bwMOLrzqt);
        AbstractC12782ctV abstractC12782ctVEjfBZ = gEmmrt().ejfBZ();
        Intrinsics.copydefault(abstractC12782ctVEjfBZ);
        AbstractC58185ywX abstractC58185ywXEZpvd = efb.EZpvd(abstractC58185ywXKWHzl, activity, c10854bwMOLrzqt, abstractC12782ctVEjfBZ, true);
        final Function1 function1 = new Function1() { // from class: o.gCN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gCF.OLrzqt(this.EZpvd, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gCM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gCF.KWHzl(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gCL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gCF.OLrzqt(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        this.KWHzl = abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gCJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gCF.AEQbTJ(function12, obj);
            }
        });
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(gCF gcf, ResponseData responseData) {
        gcf.EZpvd();
        Intrinsics.copydefault(responseData);
        java.lang.String string = gcf.getString(C13754dXa.FragmentManager.fTEjYi);
        Intrinsics.checkNotNullExpressionValue(string, "");
        gcf.OLrzqt((ResponseData<DappTxResultBean>) responseData, string);
        C10350bmm.AEQbTJ.copydefault(true);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(gCF gcf, java.lang.Throwable th) {
        java.lang.String message = th.getMessage();
        if (message != null) {
            C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        gcf.EZpvd();
        C10350bmm.AEQbTJ.copydefault(true);
        return Unit.INSTANCE;
    }

    @Override // o.gCR, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    @Override // o.gCR
    public void OLrzqt() {
        KWHzl().DbNXlk.KWHzl(0L);
    }

    @Override // o.gCR
    public void EZpvd() {
        KWHzl().DbNXlk.copydefault();
    }
}
