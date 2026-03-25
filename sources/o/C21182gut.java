package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.defi.biz.net.bean.RechargeBean;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.InterfaceC8223ayg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gut, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21182gut extends AbstractC52796wYr {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public android.os.Bundle AEQbTJ;
    public InterfaceC8223ayg OLrzqt;
    public Function1<? super android.os.Bundle, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function1<? super android.os.Bundle, Unit> function1) {
        this.copydefault = function1;
    }

    /* JADX INFO: renamed from: o.gut$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gut.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C21182gut newInstance$default(ActionBar actionBar, java.lang.String str, java.util.ArrayList arrayList, boolean z, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            return actionBar.OLrzqt(str, arrayList, z);
        }

        public final C21182gut OLrzqt(@NotNull java.lang.String str, @NotNull java.util.ArrayList<RechargeBean> arrayList, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            C21182gut c21182gut = new C21182gut();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("title", str);
            bundle.putBoolean("isAATipsLeastDialogShowed", z);
            bundle.putParcelableArrayList("data", arrayList);
            c21182gut.setArguments(bundle);
            return c21182gut;
        }
    }

    public final boolean AEQbTJ() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("isAATipsLeastDialogShowed");
        }
        return false;
    }

    @Override // o.AbstractC52796wYr, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.widget.TextView textViewFARcdN = fARcdN();
        if (textViewFARcdN != null) {
            textViewFARcdN.setVisibility(0);
        }
        android.widget.TextView textViewFJNWhG = fJNWhG();
        if (textViewFJNWhG != null) {
            textViewFJNWhG.setVisibility(8);
        }
        android.widget.TextView textViewFARcdN2 = fARcdN();
        if (textViewFARcdN2 != null) {
            textViewFARcdN2.setText(requireArguments().getString("title"));
        }
        if (!C14728dqt.KWHzl.KWHzl()) {
            this.OLrzqt = ((InterfaceC8224ayh) C43251rlk.copydefault(InterfaceC8224ayh.class)).AEQbTJ(new InterfaceC8223ayg.ActionBar.Activity(this));
        }
        if (AEQbTJ()) {
            fPV.OLrzqt.EZpvd().addFirst(this);
        }
        copydefault();
        KWHzl();
        constraintLayout.post(new java.lang.Runnable() { // from class: o.guD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C21182gut.copydefault(this.EZpvd);
            }
        });
    }

    public static final void copydefault(C21182gut c21182gut) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c21182gut, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void copydefault() {
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList<RechargeBean> parcelableArrayList = requireArguments().getParcelableArrayList("data");
        if (parcelableArrayList != null) {
            for (final RechargeBean rechargeBean : parcelableArrayList) {
                final C55377xim c55377xim = new C55377xim(context, null, 2, null);
                c55377xim.setTitleText(rechargeBean.getTitle());
                if (rechargeBean.isRecommended()) {
                    c55377xim.AhwBna().setAttachmentViewId(C13754dXa.TaskDescription.OEgNct);
                }
                c55377xim.setDescriptionText(rechargeBean.getContent());
                c55377xim.setStartDrawable(C33070mpX.EZpvd(rechargeBean.getIcon(), context));
                c55377xim.setEndDrawable(null);
                AbstractC58247yxg abstractC58247yxgCreate = AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.gux
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58249yxi
                    public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                        C21182gut.copydefault(c55377xim, interfaceC58251yxk);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(abstractC58247yxgCreate, "");
                LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                AbstractC58247yxg abstractC58247yxgThrottleFirst = C58156yvv.OLrzqt(abstractC58247yxgCreate, viewLifecycleOwner, Lifecycle.Event.ON_DESTROY).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS);
                final Function1 function1 = new Function1() { // from class: o.guw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C21182gut.EZpvd(this.AEQbTJ, rechargeBean, (Unit) obj);
                    }
                };
                abstractC58247yxgThrottleFirst.subscribe(new InterfaceC58227yxM() { // from class: o.guB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C21182gut.KWHzl(function1, obj);
                    }
                });
                arrayList.add(c55377xim);
            }
        }
        EZpvd(arrayList);
    }

    public static final void copydefault(C55377xim c55377xim, final InterfaceC58251yxk interfaceC58251yxk) {
        Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
        c55377xim.setClickCallback(new Function0() { // from class: o.guq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C21182gut.AEQbTJ(interfaceC58251yxk);
            }
        });
    }

    public static final Unit AEQbTJ(InterfaceC58251yxk interfaceC58251yxk) {
        Unit unit = Unit.INSTANCE;
        interfaceC58251yxk.onNext(unit);
        return unit;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(final C21182gut c21182gut, RechargeBean rechargeBean, Unit unit) {
        FragmentActivity activity = c21182gut.getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            C21139guC c21139guC = C21139guC.OLrzqt;
            InterfaceC8223ayg interfaceC8223ayg = c21182gut.OLrzqt;
            Intrinsics.copydefault(rechargeBean);
            c21139guC.OLrzqt(abstractActivityC33041mov, interfaceC8223ayg, rechargeBean, new Function1() { // from class: o.guA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C21182gut.AEQbTJ(this.copydefault, (gKW) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C21182gut c21182gut, gKW gkw) {
        Intrinsics.checkNotNullParameter(gkw, "");
        if (gkw.AEQbTJ()) {
            c21182gut.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    private final void KWHzl() {
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C19672gLa.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, this);
        final Function1 function1 = new Function1() { // from class: o.gus
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21182gut.EZpvd(this.AEQbTJ, (C19672gLa) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.guy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21182gut.EZpvd(function1, obj);
            }
        });
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("complete_withdrawal_from_wallet");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXEZpvd2 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this);
        final Function1 function12 = new Function1() { // from class: o.guz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21182gut.KWHzl(this.OLrzqt, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd2.AEQbTJ(new InterfaceC58227yxM() { // from class: o.guv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21182gut.gEmmrt(function12, obj);
            }
        });
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C21182gut c21182gut, C19672gLa c19672gLa) {
        c21182gut.OLrzqt();
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C21182gut c21182gut, java.lang.String str) {
        c21182gut.OLrzqt();
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("is_submit", true);
        this.AEQbTJ = bundle;
        dismissAllowingStateLoss();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        if (AEQbTJ()) {
            fPV.OLrzqt.EZpvd().removeFirst();
        }
        Function1<? super android.os.Bundle, Unit> function1 = this.copydefault;
        if (function1 != null) {
            function1.invoke(this.AEQbTJ);
        }
    }
}
