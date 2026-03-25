package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.account.api.model.login.BindConst;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.BaseModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.NetworkFeeModuleModel;
import com.okinc.web3Uilib.bean.TransactionNetworkFeeBean;
import com.okinc.web3Uilib.bean.TransactionTopReminderInfoBean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC20238gdC;
import o.AbstractC8564bFB;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gdC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC20238gdC<T extends AbstractC8564bFB<?, ?>> extends AbstractC20237gdB<T> {
    public C57429yiJ copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbstractC8564bFB AEQbTJ(AbstractC20238gdC abstractC20238gdC) {
        return (AbstractC8564bFB) abstractC20238gdC.ejfBZ();
    }

    @Override // o.AbstractC20237gdB
    public java.lang.Object AEQbTJ(@NotNull BaseModel<?> baseModel, boolean z) {
        NetworkFeeModuleModel.NetworkFeeItem data;
        Intrinsics.checkNotNullParameter(baseModel, "");
        return ((baseModel instanceof NetworkFeeModuleModel) && (data = ((NetworkFeeModuleModel) baseModel).getData()) != null && Intrinsics.EZpvd(data.getShowFee(), java.lang.Boolean.TRUE)) ? djBIcL() : super.AEQbTJ(baseModel, z);
    }

    private final C57429yiJ djBIcL() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57429yiJ c57429yiJ = new C57429yiJ(contextRequireContext, null, 0, 6, null);
        c57429yiJ.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        c57429yiJ.addOnAttachStateChangeListener(new Application(this));
        this.copydefault = c57429yiJ;
        return c57429yiJ;
    }

    /* JADX INFO: renamed from: o.gdC$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application implements View.OnAttachStateChangeListener {
        public InterfaceC58217yxC KWHzl;
        public final /* synthetic */ AbstractC20238gdC<T> OLrzqt;
        public final LifecycleEventObserver copydefault;

        /* JADX INFO: renamed from: o.gdC$Application$StateListAnimator */
        public final /* synthetic */ class StateListAnimator {
            public static final /* synthetic */ int[] copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                copydefault = iArr;
            }
        }

        public Application(final AbstractC20238gdC<T> abstractC20238gdC) {
            this.OLrzqt = abstractC20238gdC;
            this.copydefault = new LifecycleEventObserver() { // from class: com.okinc.business.defi.wallet.transaction.ui.modularization.OKWBaseSignTransactionModularizationFragment$networkFeeView$1$1$$ExternalSyntheticLambda1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    AbstractC20238gdC.Application.OLrzqt(this.KWHzl, abstractC20238gdC, lifecycleOwner, event);
                }
            };
        }

        public static final void OLrzqt(Application application, AbstractC20238gdC abstractC20238gdC, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(lifecycleOwner, "");
            Intrinsics.checkNotNullParameter(event, "");
            int i = StateListAnimator.copydefault[event.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    AbstractC8564bFB.startLoopRefresh$default(AbstractC20238gdC.AEQbTJ(abstractC20238gdC), 0L, 1, null);
                    return;
                } else {
                    if (i != 3) {
                        return;
                    }
                    AbstractC20238gdC.AEQbTJ(abstractC20238gdC).QkdxfA();
                    return;
                }
            }
            AbstractC58185ywX abstractC58185ywXIsConnected = AbstractC20238gdC.AEQbTJ(abstractC20238gdC).QKudOq().isConnected();
            LifecycleOwner viewLifecycleOwner = abstractC20238gdC.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(abstractC58185ywXIsConnected, viewLifecycleOwner, Lifecycle.Event.ON_STOP);
            final Activity activity = new Activity(abstractC20238gdC);
            application.KWHzl = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58227yxM() { // from class: o.gdD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    AbstractC20238gdC.Application.copydefault(activity, obj);
                }
            });
        }

        /* JADX INFO: renamed from: o.gdC$Application$Activity */
        public static final class Activity implements Function1 {
            public final /* synthetic */ AbstractC20238gdC<T> AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(AbstractC20238gdC<T> abstractC20238gdC) {
                this.AEQbTJ = abstractC20238gdC;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                AEQbTJ((C8486bDd) obj);
                return Unit.INSTANCE;
            }

            public final void AEQbTJ(C8486bDd c8486bDd) {
                AbstractC20238gdC<T> abstractC20238gdC = this.AEQbTJ;
                AbstractC8426bCW<?> abstractC8426bCWQKudOq = AbstractC20238gdC.AEQbTJ((AbstractC20238gdC) abstractC20238gdC).QKudOq();
                Intrinsics.copydefault(c8486bDd);
                abstractC20238gdC.KWHzl(abstractC8426bCWQKudOq, c8486bDd);
            }
        }

        public static final void copydefault(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.OLrzqt.getViewLifecycleOwner().getLifecycle().addObserver(this.copydefault);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.OLrzqt.getViewLifecycleOwner().getLifecycle().removeObserver(this.copydefault);
            InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            if (this.OLrzqt.getViewLifecycleOwner().getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                AbstractC20238gdC.AEQbTJ((AbstractC20238gdC) this.OLrzqt).QkdxfA();
            }
        }
    }

    /* JADX DEBUG: Possible override for method o.gaF.EZpvd()V */
    public java.util.ArrayList<android.view.View> EZpvd() {
        android.view.View[] viewArr = new android.view.View[3];
        C57429yiJ c57429yiJ = this.copydefault;
        C57429yiJ c57429yiJ2 = null;
        if (c57429yiJ == null) {
            Intrinsics.gEmmrt("");
            c57429yiJ = null;
        }
        viewArr[0] = c57429yiJ.copydefault();
        C57429yiJ c57429yiJ3 = this.copydefault;
        if (c57429yiJ3 == null) {
            Intrinsics.gEmmrt("");
            c57429yiJ3 = null;
        }
        viewArr[1] = c57429yiJ3.AEQbTJ();
        C57429yiJ c57429yiJ4 = this.copydefault;
        if (c57429yiJ4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c57429yiJ2 = c57429yiJ4;
        }
        viewArr[2] = c57429yiJ2.KWHzl();
        return yDY.copydefault(viewArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void copydefault(AbstractC8426bCW<?> abstractC8426bCW, C8486bDd c8486bDd) {
        java.lang.String str;
        java.lang.CharSequence charSequence;
        java.lang.CharSequence charSequence2;
        java.lang.String strAEQbTJ = AEQbTJ(c8486bDd);
        boolean z = (c8486bDd instanceof C11989ceV) && AEQbTJ();
        C10854bwM c10854bwMDHguZz = ejfBZ().dHguZz();
        pTF ptf = pTF.KWHzl;
        java.lang.String toFeeCoinAmount$default = AbstractC8426bCW.formatToFeeCoinAmount$default(abstractC8426bCW, strAEQbTJ, false, false, true, 6, null);
        java.lang.String toFeeCurrencyAmount$default = AbstractC8426bCW.formatToFeeCurrencyAmount$default(abstractC8426bCW, strAEQbTJ, false, false, false, 14, null);
        if (toFeeCurrencyAmount$default.length() > 0) {
            str = " " + toFeeCurrencyAmount$default;
        } else {
            str = "";
        }
        java.lang.String strEZpvd = ptf.EZpvd(toFeeCoinAmount$default + ((java.lang.Object) str));
        if (z) {
            charSequence = "";
        } else {
            C9165bQT c9165bQT = c8486bDd instanceof C9165bQT ? (C9165bQT) c8486bDd : null;
            if (c9165bQT == null || !c9165bQT.AEQbTJ()) {
                T tEjfBZ = ejfBZ();
                C9413bVC c9413bVC = tEjfBZ instanceof C9413bVC ? (C9413bVC) tEjfBZ : null;
                if (c9413bVC == null || !c9413bVC.gasjUx()) {
                    T tEjfBZ2 = ejfBZ();
                    C8972bMm c8972bMm = tEjfBZ2 instanceof C8972bMm ? (C8972bMm) tEjfBZ2 : null;
                    if (c8972bMm == null || !c8972bMm.aKErDB()) {
                        charSequence = strEZpvd;
                    } else {
                        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(strEZpvd);
                        spannableStringBuilder.setSpan(new android.text.style.StrikethroughSpan(), 0, strEZpvd.length(), 17);
                        charSequence = spannableStringBuilder;
                    }
                }
            }
        }
        if (!z) {
            C9165bQT c9165bQT2 = c8486bDd instanceof C9165bQT ? (C9165bQT) c8486bDd : null;
            if (c9165bQT2 == null || !c9165bQT2.AEQbTJ()) {
                T tEjfBZ3 = ejfBZ();
                C9413bVC c9413bVC2 = tEjfBZ3 instanceof C9413bVC ? (C9413bVC) tEjfBZ3 : null;
                if (c9413bVC2 == null || !c9413bVC2.gasjUx()) {
                    T tEjfBZ4 = ejfBZ();
                    C8972bMm c8972bMm2 = tEjfBZ4 instanceof C8972bMm ? (C8972bMm) tEjfBZ4 : null;
                    if (c8972bMm2 == null || !c8972bMm2.aKErDB()) {
                        charSequence2 = "";
                    }
                }
            }
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplListMenuDecorView);
            android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(strAYXKKw);
            spannableStringBuilder2.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.HJWChPRAkuRW)), 0, strAYXKKw.length(), 17);
            charSequence2 = spannableStringBuilder2;
        }
        C57429yiJ c57429yiJ = this.copydefault;
        if (c57429yiJ == null) {
            Intrinsics.gEmmrt("");
            c57429yiJ = null;
        }
        c57429yiJ.setViewDataBean(new TransactionNetworkFeeBean(null, null, C33069mpW.copydefault(C13754dXa.FragmentManager.bypassDispatchKeyEvent, C56423yEv.EZpvd(C56390yDp.OLrzqt("network", c10854bwMDHguZz.djBIcL()))), z ? "--" : "", charSequence, null, null, null, null, abstractC8426bCW.copydefault().isVariable() ? new Function0() { // from class: o.gdz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC20238gdC.EZpvd(this.OLrzqt);
            }
        } : null, false, charSequence2, null, 5603, null));
        OLrzqt(abstractC8426bCW, c8486bDd);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(AbstractC20238gdC abstractC20238gdC) {
        abstractC20238gdC.wlaJM();
        T tEjfBZ = abstractC20238gdC.ejfBZ();
        AbstractC8564bFB abstractC8564bFB = tEjfBZ instanceof AbstractC8564bFB ? (AbstractC8564bFB) tEjfBZ : null;
        if (abstractC8564bFB != null) {
            C8396bBt c8396bBt = C8396bBt.AEQbTJ;
            androidx.fragment.app.FragmentManager childFragmentManager = abstractC20238gdC.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            C8396bBt.openTransactionFeePage$default(c8396bBt, childFragmentManager, abstractC8564bFB, null, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull java.util.List<? extends android.view.View> list) {
        Intrinsics.checkNotNullParameter(list, "");
        android.animation.AnimatorSet duration = new android.animation.AnimatorSet().setDuration(600L);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(android.animation.ObjectAnimator.ofFloat((android.view.View) it.next(), "alpha", 1.0f, 0.0f, 1.0f));
        }
        duration.playTogether(arrayList);
        duration.start();
    }

    public java.lang.String AEQbTJ(@NotNull C8486bDd c8486bDd) {
        Intrinsics.checkNotNullParameter(c8486bDd, "");
        return c8486bDd instanceof C9215bRQ ? ((C9215bRQ) c8486bDd).copydefault() : c8486bDd.getFeeAmount();
    }

    public final void copydefault() {
        C10854bwM c10854bwMDHguZz = ejfBZ().dHguZz();
        C57429yiJ c57429yiJ = this.copydefault;
        if (c57429yiJ == null) {
            Intrinsics.gEmmrt("");
            c57429yiJ = null;
        }
        c57429yiJ.setViewDataBean(new TransactionNetworkFeeBean(null, null, C33069mpW.copydefault(C13754dXa.FragmentManager.bypassDispatchKeyEvent, C56423yEv.EZpvd(C56390yDp.OLrzqt("network", c10854bwMDHguZz.djBIcL()))), C33070mpX.AYXKKw(C13754dXa.FragmentManager.onCreateActionMode), null, null, null, null, null, null, false, null, null, 8179, null));
    }

    public final boolean AEQbTJ() {
        AbstractC9832bcy abstractC9832bcyValues = values();
        return (abstractC9832bcyValues instanceof C9784bcC) || (abstractC9832bcyValues instanceof C9808bca) || (abstractC9832bcyValues instanceof C9754bbZ) || (abstractC9832bcyValues instanceof C9811bcd);
    }

    private final void OLrzqt(AbstractC8426bCW<?> abstractC8426bCW, C8486bDd c8486bDd) {
        C9745bbQ c9745bbQ;
        java.lang.CharSequence charSequenceEZpvd;
        C57429yiJ c57429yiJ = null;
        if (c8486bDd instanceof C9165bQT) {
            C9165bQT c9165bQT = (C9165bQT) c8486bDd;
            c9745bbQ = c9165bQT.KWHzl();
            if (c9745bbQ == null) {
                c9745bbQ = new C9745bbQ(null, 0, -1, 3, null);
            }
            charSequenceEZpvd = c9165bQT.EZpvd();
        } else {
            c9745bbQ = new C9745bbQ(null, 0, -1, 3, null);
            charSequenceEZpvd = null;
        }
        C17946fYd c17946fYd = C17946fYd.AEQbTJ;
        C9746bbR c9746bbRKWHzl = c17946fYd.KWHzl(getContext(), c17946fYd.KWHzl(abstractC8426bCW, c9745bbQ), c9745bbQ, charSequenceEZpvd);
        if (C33129mqd.OLrzqt(c9746bbRKWHzl.AEQbTJ())) {
            C57429yiJ c57429yiJ2 = this.copydefault;
            if (c57429yiJ2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c57429yiJ = c57429yiJ2;
            }
            android.graphics.drawable.Drawable drawableKWHzl = c9746bbRKWHzl.KWHzl();
            java.lang.CharSequence charSequenceAEQbTJ = c9746bbRKWHzl.AEQbTJ();
            c57429yiJ.setSecondaryTipInfo(drawableKWHzl, charSequenceAEQbTJ != null ? charSequenceAEQbTJ : "");
        }
    }

    public void KWHzl(@NotNull AbstractC8426bCW<?> abstractC8426bCW, @NotNull C8486bDd c8486bDd) {
        Intrinsics.checkNotNullParameter(abstractC8426bCW, "");
        Intrinsics.checkNotNullParameter(c8486bDd, "");
        AbstractC9832bcy abstractC9832bcyValues = values();
        if (ejfBZ().dHguZz().fARcdN()) {
            if ((abstractC9832bcyValues instanceof C9868bdh) && Intrinsics.EZpvd(((C9868bdh) abstractC9832bcyValues).KWHzl(), java.lang.Boolean.TRUE)) {
                copydefault();
                return;
            } else {
                copydefault(abstractC8426bCW, c8486bDd);
                return;
            }
        }
        if (abstractC9832bcyValues instanceof C9868bdh) {
            copydefault();
            return;
        }
        copydefault(ejfBZ().QKudOq(), c8486bDd);
        if (c8486bDd.getFeeChangeType() == 3) {
            EZpvd(EZpvd());
        }
    }

    @Override // o.AbstractC20237gdB, o.AbstractC20082gaF
    public void copydefault(@NotNull java.util.Collection<? extends AbstractC9832bcy> collection) {
        java.lang.String strOLrzqt;
        java.lang.String strOLrzqt2;
        Intrinsics.checkNotNullParameter(collection, "");
        AbstractC9832bcy abstractC9832bcy = (AbstractC9832bcy) CollectionsKt___CollectionsKt.RcXXUw(collection);
        java.lang.String str = null;
        if (abstractC9832bcy instanceof C9868bdh) {
            AbstractC8426bCW<?> abstractC8426bCWQKudOq = ejfBZ().QKudOq();
            KWHzl(abstractC8426bCWQKudOq, abstractC8426bCWQKudOq.KWHzl());
            C9868bdh c9868bdh = (C9868bdh) abstractC9832bcy;
            C9796bcO c9796bcOCopydefault = c9868bdh.copydefault();
            if (c9796bcOCopydefault != null) {
                if (C33492mxV.OLrzqt()) {
                    strOLrzqt2 = c9796bcOCopydefault.AEQbTJ();
                } else {
                    strOLrzqt2 = c9796bcOCopydefault.OLrzqt();
                }
                str = strOLrzqt2;
            }
            java.lang.String str2 = str;
            java.lang.String strAEQbTJ = c9868bdh.AEQbTJ();
            KWHzl(new TransactionTopReminderInfoBean(str2, strAEQbTJ == null ? "" : strAEQbTJ, (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 60, (DefaultConstructorMarker) null));
            return;
        }
        if (abstractC9832bcy instanceof C9872bdl) {
            C9872bdl c9872bdl = (C9872bdl) abstractC9832bcy;
            C9796bcO c9796bcOKWHzl = c9872bdl.KWHzl();
            if (c9796bcOKWHzl != null) {
                if (C33492mxV.OLrzqt()) {
                    strOLrzqt = c9796bcOKWHzl.AEQbTJ();
                } else {
                    strOLrzqt = c9796bcOKWHzl.OLrzqt();
                }
                str = strOLrzqt;
            }
            java.lang.String str3 = str;
            java.lang.String strCopydefault = c9872bdl.copydefault();
            KWHzl(new TransactionTopReminderInfoBean(str3, strCopydefault == null ? "" : strCopydefault, (java.lang.CharSequence) null, (Function0) null, (java.lang.CharSequence) null, (Function0) null, 60, (DefaultConstructorMarker) null));
            return;
        }
        super.copydefault(collection);
    }

    public final void EZpvd(@NotNull C9748bbT c9748bbT) {
        Intrinsics.checkNotNullParameter(c9748bbT, "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("result", -1);
        bundle.putString("data", c9748bbT.KWHzl());
        bundle.putString("tx_id", c9748bbT.gEmmrt());
        bundle.putString("tx_hash", c9748bbT.KWHzl());
        bundle.putString(BindConst.TELEGRAM_RESULT_KEY, c9748bbT.AEQbTJ());
        if (ejfBZ().dUDNAs().getFieldNames()) {
            bundle.putString("tx_uop_hash", c9748bbT.KWHzl());
        }
        bundle.putString("tx_sign", c9748bbT.OLrzqt());
        bundle.putBoolean("tx_isbatch", Intrinsics.EZpvd(c9748bbT.AYXKKw(), java.lang.Boolean.TRUE));
        bundle.putBoolean("send_coin_status", true);
        bundle.putString("tx_send_calls_id", c9748bbT.copydefault());
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1, new android.content.Intent().putExtras(bundle));
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }
}
