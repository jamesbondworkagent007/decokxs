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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gCD<B extends SpeedUpInfoBean, T extends AbstractC12413cmV<B>> extends gCR<B, T> {
    public InterfaceC58217yxC AEQbTJ;
    public AbstractC16446ekA OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull AbstractC16446ekA abstractC16446ekA) {
        Intrinsics.checkNotNullParameter(abstractC16446ekA, "");
        this.OLrzqt = abstractC16446ekA;
    }

    public final AbstractC16446ekA KWHzl() {
        AbstractC16446ekA abstractC16446ekA = this.OLrzqt;
        if (abstractC16446ekA != null) {
            return abstractC16446ekA;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.gCR, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        EZpvd((AbstractC16446ekA) DataBindingUtil.inflate(android.view.LayoutInflater.from(constraintLayout.getContext()), C13754dXa.TaskDescription.QDqgQU, constraintLayout, true));
        KWHzl().EZpvd.setOnClickListener(this);
        djBIcL();
        AhwBna();
    }

    @Override // o.gCR
    public void copydefault() {
        Group group;
        C55173xeu c55173xeu;
        super.copydefault();
        AbstractC16446ekA abstractC16446ekAKWHzl = KWHzl();
        if (abstractC16446ekAKWHzl != null && (c55173xeu = abstractC16446ekAKWHzl.KWHzl) != null) {
            c55173xeu.setVisibility(8);
        }
        AbstractC16446ekA abstractC16446ekAKWHzl2 = KWHzl();
        if (abstractC16446ekAKWHzl2 != null && (group = abstractC16446ekAKWHzl2.AYXKKw) != null) {
            group.setVisibility(0);
        }
        KWHzl().AEQbTJ.setText(gEmmrt().valueOf().KWHzl(gEmmrt().copydefault()));
        KWHzl().copydefault.setEnabled(true);
        AbstractC12782ctV abstractC12782ctVEjfBZ = gEmmrt().ejfBZ();
        if (abstractC12782ctVEjfBZ != null && abstractC12782ctVEjfBZ.gHZMYf()) {
            KWHzl().copydefault.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRccStateFromState));
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.gCR
    public void AEQbTJ() {
        Group group;
        C55173xeu c55173xeu;
        AbstractC16446ekA abstractC16446ekAKWHzl = KWHzl();
        if (abstractC16446ekAKWHzl != null && (c55173xeu = abstractC16446ekAKWHzl.KWHzl) != null) {
            c55173xeu.setVisibility(0);
        }
        AbstractC16446ekA abstractC16446ekAKWHzl2 = KWHzl();
        if (abstractC16446ekAKWHzl2 == null || (group = abstractC16446ekAKWHzl2.AYXKKw) == null) {
            return;
        }
        group.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Integer numValueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int i = C13754dXa.ActionBar.sbu;
        if (numValueOf != null && numValueOf.intValue() == i) {
            dismissAllowingStateLoss();
        }
    }

    private final void djBIcL() {
        final C55173xeu c55173xeu;
        AbstractC16446ekA abstractC16446ekAKWHzl = KWHzl();
        if (abstractC16446ekAKWHzl == null || (c55173xeu = abstractC16446ekAKWHzl.KWHzl) == null) {
            return;
        }
        c55173xeu.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNLfdT));
        c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
        c55173xeu.setRetry(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNUfqk));
        c55173xeu.setEmptyTypeImage(8);
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = C8003auW.copydefault(c55173xeu.AEQbTJ()).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst, "");
        C58156yvv.copydefault(abstractC58247yxgThrottleFirst, this).subscribe(new InterfaceC58227yxM() { // from class: o.gCA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gCD.OLrzqt(c55173xeu, this, obj);
            }
        });
    }

    public static final void OLrzqt(C55173xeu c55173xeu, gCD gcd, java.lang.Object obj) {
        c55173xeu.setVisibility(4);
        gcd.AYXKKw();
    }

    private final void AhwBna() {
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = C8003auW.copydefault(KWHzl().copydefault).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst, "");
        C58156yvv.copydefault(abstractC58247yxgThrottleFirst, this).subscribe(new InterfaceC58227yxM() { // from class: o.gCz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gCD.AEQbTJ(this.copydefault, obj);
            }
        });
    }

    public static final void AEQbTJ(gCD gcd, java.lang.Object obj) {
        gcd.valueOf();
    }

    @Override // o.gCR
    public void copydefault(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd(str, str2);
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2) {
        OLrzqt();
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
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
        final Function1 function1 = new Function1() { // from class: o.gCI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gCD.EZpvd(this.copydefault, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gCH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gCD.copydefault(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gCG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gCD.copydefault(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        this.AEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gCE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                gCD.AEQbTJ(function12, obj);
            }
        });
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(gCD gcd, ResponseData responseData) {
        gcd.EZpvd();
        Intrinsics.copydefault(responseData);
        java.lang.String string = gcd.getString(C13754dXa.FragmentManager.GGlJim);
        Intrinsics.checkNotNullExpressionValue(string, "");
        gcd.OLrzqt((ResponseData<DappTxResultBean>) responseData, string);
        C10350bmm.AEQbTJ.copydefault(true);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(gCD gcd, java.lang.Throwable th) {
        java.lang.String message = th.getMessage();
        if (message != null) {
            C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        gcd.EZpvd();
        C10350bmm.AEQbTJ.copydefault(true);
        return Unit.INSTANCE;
    }

    @Override // o.gCR, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    @Override // o.gCR
    public void OLrzqt() {
        KWHzl().djBIcL.KWHzl(0L);
    }

    @Override // o.gCR
    public void EZpvd() {
        KWHzl().djBIcL.copydefault();
    }
}
