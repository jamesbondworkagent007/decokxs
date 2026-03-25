package o;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.account.api.model.login.BindConst;
import com.okinc.business.defi.biz.core.transaction.sign.evm.OKWX402SignTransfer;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.web3Uilib.bean.TransactionNetworkFeeBean;
import com.okinc.web3Uilib.bean.TransactionTopReminderInfoBean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC20080gaD;
import o.AbstractC8564bFB;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gaD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20080gaD<T extends AbstractC8564bFB<?, ?>> extends AbstractC20102gaZ<T> {
    public C57429yiJ copydefault;

    /* JADX INFO: renamed from: o.gaD$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

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
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull AbstractC8426bCW<?> abstractC8426bCW, @NotNull C8486bDd c8486bDd) {
        Intrinsics.checkNotNullParameter(abstractC8426bCW, "");
        Intrinsics.checkNotNullParameter(c8486bDd, "");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbstractC8564bFB copydefault(AbstractC20080gaD abstractC20080gaD) {
        return (AbstractC8564bFB) abstractC20080gaD.ejfBZ();
    }

    /* JADX DEBUG: Possible override for method o.gaF.EZpvd()V */
    public C57429yiJ EZpvd() {
        getViewLifecycleOwner().getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.okinc.business.defi.wallet.transaction.ui.OKWBaseSignTransactionFragment$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                AbstractC20080gaD.AEQbTJ(this.AEQbTJ, lifecycleOwner, event);
            }
        });
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57429yiJ c57429yiJ = new C57429yiJ(contextRequireContext, null, 0, 6, null);
        c57429yiJ.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        this.copydefault = c57429yiJ;
        return c57429yiJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(AbstractC20080gaD abstractC20080gaD, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(event, "");
        int i = TaskDescription.EZpvd[event.ordinal()];
        if (i != 1) {
            if (i == 2) {
                AbstractC8564bFB.startLoopRefresh$default((AbstractC8564bFB) abstractC20080gaD.ejfBZ(), 0L, 1, null);
                return;
            } else {
                if (i != 3) {
                    return;
                }
                ((AbstractC8564bFB) abstractC20080gaD.ejfBZ()).QkdxfA();
                return;
            }
        }
        AbstractC58185ywX abstractC58185ywXIsConnected = ((AbstractC8564bFB) abstractC20080gaD.ejfBZ()).QKudOq().isConnected();
        LifecycleOwner viewLifecycleOwner = abstractC20080gaD.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(abstractC58185ywXIsConnected, viewLifecycleOwner, Lifecycle.Event.ON_STOP);
        final StateListAnimator stateListAnimator = new StateListAnimator(abstractC20080gaD);
        abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58227yxM() { // from class: o.gaG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC20080gaD.KWHzl(stateListAnimator, obj);
            }
        });
    }

    /* JADX INFO: renamed from: o.gaD$StateListAnimator */
    public static final class StateListAnimator implements Function1 {
        public final /* synthetic */ AbstractC20080gaD<T> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(AbstractC20080gaD<T> abstractC20080gaD) {
            this.KWHzl = abstractC20080gaD;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            KWHzl((C8486bDd) obj);
            return Unit.INSTANCE;
        }

        public final void KWHzl(C8486bDd c8486bDd) {
            AbstractC20080gaD<T> abstractC20080gaD = this.KWHzl;
            AbstractC8426bCW<?> abstractC8426bCWQKudOq = AbstractC20080gaD.copydefault((AbstractC20080gaD) abstractC20080gaD).QKudOq();
            Intrinsics.copydefault(c8486bDd);
            abstractC20080gaD.copydefault(abstractC8426bCWQKudOq, c8486bDd);
            if (c8486bDd.getFeeChangeType() == 3) {
                AbstractC20080gaD<T> abstractC20080gaD2 = this.KWHzl;
                abstractC20080gaD2.copydefault((java.util.List<? extends android.view.View>) abstractC20080gaD2.KWHzl());
            }
            AbstractC20080gaD<T> abstractC20080gaD3 = this.KWHzl;
            abstractC20080gaD3.KWHzl(AbstractC20080gaD.copydefault((AbstractC20080gaD) abstractC20080gaD3).QKudOq(), c8486bDd);
        }
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public java.util.ArrayList<android.view.View> KWHzl() {
        java.util.ArrayList<android.view.View> arrayList = new java.util.ArrayList<>();
        C57429yiJ c57429yiJ = this.copydefault;
        C57429yiJ c57429yiJ2 = null;
        if (c57429yiJ == null) {
            Intrinsics.gEmmrt("");
            c57429yiJ = null;
        }
        arrayList.add(c57429yiJ.copydefault());
        C57429yiJ c57429yiJ3 = this.copydefault;
        if (c57429yiJ3 == null) {
            Intrinsics.gEmmrt("");
            c57429yiJ3 = null;
        }
        arrayList.add(c57429yiJ3.AEQbTJ());
        C57429yiJ c57429yiJ4 = this.copydefault;
        if (c57429yiJ4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c57429yiJ2 = c57429yiJ4;
        }
        arrayList.add(c57429yiJ2.KWHzl());
        C57437yiR c57437yiRDTwDnp = DTwDnp();
        if (c57437yiRDTwDnp != null) {
            arrayList.add(c57437yiRDTwDnp.EZpvd());
        }
        return arrayList;
    }

    public final void copydefault(@NotNull java.util.List<? extends android.view.View> list) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0156  */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r9v19, types: [o.yiJ] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(@NotNull AbstractC8426bCW<?> abstractC8426bCW, @NotNull C8486bDd c8486bDd) {
        java.lang.String str;
        java.lang.CharSequence charSequence;
        java.lang.CharSequence charSequence2;
        java.lang.String str2;
        java.lang.String strCopydefault;
        java.lang.String str3;
        java.lang.String strPriorityFee$default;
        C10854bwM c10854bwMDHguZz;
        C9592bYW c9592bYWFJNWhG;
        C9592bYW c9592bYWFJNWhG2;
        java.lang.String strCopydefault2;
        C10854bwM c10854bwMDHguZz2;
        C9592bYW c9592bYWFJNWhG3;
        C9592bYW c9592bYWFJNWhG4;
        C57429yiJ c57429yiJ;
        Intrinsics.checkNotNullParameter(abstractC8426bCW, "");
        Intrinsics.checkNotNullParameter(c8486bDd, "");
        java.lang.String strEZpvd = EZpvd(c8486bDd);
        java.lang.String feeAmount = c8486bDd instanceof C9215bRQ ? c8486bDd.getFeeAmount() : null;
        AbstractC9832bcy abstractC9832bcyValues = values();
        boolean z = ((c8486bDd instanceof C11989ceV) && AEQbTJ()) || (abstractC9832bcyValues instanceof C9868bdh);
        boolean z2 = abstractC9832bcyValues instanceof C9868bdh;
        C10854bwM c10854bwMDHguZz3 = ejfBZ().dHguZz();
        pTF ptf = pTF.KWHzl;
        java.lang.String toFeeCoinAmount$default = AbstractC8426bCW.formatToFeeCoinAmount$default(abstractC8426bCW, strEZpvd, false, false, true, 6, null);
        java.lang.String toFeeCurrencyAmount$default = AbstractC8426bCW.formatToFeeCurrencyAmount$default(abstractC8426bCW, strEZpvd, false, false, false, 14, null);
        if (toFeeCurrencyAmount$default.length() > 0) {
            str = " " + toFeeCurrencyAmount$default;
        } else {
            str = "";
        }
        java.lang.String strEZpvd2 = ptf.EZpvd(toFeeCoinAmount$default + ((java.lang.Object) str));
        if (z || (ejfBZ() instanceof OKWX402SignTransfer)) {
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
                        charSequence = strEZpvd2;
                    } else {
                        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(java.lang.String.valueOf(strEZpvd2));
                        spannableStringBuilder.setSpan(new android.text.style.StrikethroughSpan(), 0, strEZpvd2.length(), 17);
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
            android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(java.lang.String.valueOf(strAYXKKw));
            spannableStringBuilder2.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.HJWChPRAkuRW)), 0, strAYXKKw.length(), 17);
            charSequence2 = spannableStringBuilder2;
        }
        if (feeAmount == null) {
            if (ejfBZ() instanceof C9615bYt) {
                T tEjfBZ5 = ejfBZ();
                C9615bYt c9615bYt = tEjfBZ5 instanceof C9615bYt ? (C9615bYt) tEjfBZ5 : null;
                java.lang.Integer numValueOf = c9615bYt != null ? java.lang.Integer.valueOf(c9615bYt.isConnected()) : null;
                if (numValueOf != null && numValueOf.intValue() == 2) {
                    int i = C13754dXa.FragmentManager.onWindowStartingActionMode;
                    kotlin.Pair[] pairArr = new kotlin.Pair[3];
                    java.lang.String strFetchVPNInfo = (c9615bYt == null || (c9592bYWFJNWhG4 = c9615bYt.fJNWhG()) == null) ? null : c9592bYWFJNWhG4.fetchVPNInfo();
                    pairArr[0] = C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, AbstractC8426bCW.formatToFeeCoinAmount$default(abstractC8426bCW, strFetchVPNInfo == null ? "" : strFetchVPNInfo, false, false, false, 10, null));
                    java.lang.String strDbNXlk = (c9615bYt == null || (c9592bYWFJNWhG3 = c9615bYt.fJNWhG()) == null) ? null : c9592bYWFJNWhG3.DbNXlk();
                    pairArr[1] = C56390yDp.OLrzqt("num", AbstractC8426bCW.formatToFeeCoinAmount$default(abstractC8426bCW, strDbNXlk == null ? "" : strDbNXlk, false, false, false, 10, null));
                    java.lang.String strFJNWhG = (c9615bYt == null || (c10854bwMDHguZz2 = c9615bYt.dHguZz()) == null) ? null : c10854bwMDHguZz2.fJNWhG();
                    if (strFJNWhG == null) {
                        strFJNWhG = "";
                    }
                    pairArr[2] = C56390yDp.OLrzqt("token", strFJNWhG);
                    strCopydefault2 = C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr));
                } else if (numValueOf != null && numValueOf.intValue() == 1) {
                    int i2 = C13754dXa.FragmentManager.MediaSessionCompatMediaSessionImplApi21;
                    kotlin.Pair[] pairArr2 = new kotlin.Pair[3];
                    java.lang.String strFetchVPNInfo2 = (c9615bYt == null || (c9592bYWFJNWhG2 = c9615bYt.fJNWhG()) == null) ? null : c9592bYWFJNWhG2.fetchVPNInfo();
                    pairArr2[0] = C56390yDp.OLrzqt("gas", AbstractC8426bCW.formatToFeeCoinAmount$default(abstractC8426bCW, strFetchVPNInfo2 == null ? "" : strFetchVPNInfo2, false, false, false, 10, null));
                    if (c9615bYt == null || (c9592bYWFJNWhG = c9615bYt.fJNWhG()) == null) {
                        str3 = null;
                        strPriorityFee$default = null;
                    } else {
                        str3 = null;
                        strPriorityFee$default = C9592bYW.priorityFee$default(c9592bYWFJNWhG, 0, 1, null);
                    }
                    str2 = str3;
                    pairArr2[1] = C56390yDp.OLrzqt("gasfee", AbstractC8426bCW.formatToFeeCoinAmount$default(abstractC8426bCW, strPriorityFee$default == null ? "" : strPriorityFee$default, false, false, false, 10, null));
                    java.lang.String strFJNWhG2 = (c9615bYt == null || (c10854bwMDHguZz = c9615bYt.dHguZz()) == null) ? str2 : c10854bwMDHguZz.fJNWhG();
                    if (strFJNWhG2 == null) {
                        strFJNWhG2 = "";
                    }
                    pairArr2[2] = C56390yDp.OLrzqt("token", strFJNWhG2);
                    strCopydefault = C33069mpW.copydefault(i2, C56424yEw.gEmmrt(pairArr2));
                } else {
                    str2 = null;
                    strCopydefault = "";
                }
            }
            c57429yiJ = this.copydefault;
            ?? r9 = c57429yiJ;
            if (c57429yiJ == null) {
                Intrinsics.gEmmrt("");
                r9 = str2;
            }
            r9.setViewDataBean(new TransactionNetworkFeeBean(null, null, C33069mpW.copydefault(C13754dXa.FragmentManager.bypassDispatchKeyEvent, C56423yEv.EZpvd(C56390yDp.OLrzqt("network", c10854bwMDHguZz3.djBIcL()))), !z ? "--" : "", charSequence, strCopydefault, null, null, null, (abstractC8426bCW.copydefault().isVariable() || z2) ? str2 : new Function0() { // from class: o.gaJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC20080gaD.KWHzl(this.EZpvd);
                }
            }, false, charSequence2, ejfBZ() instanceof OKWX402SignTransfer ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplActionMenuPresenterCallback) : "", 1475, null));
            AEQbTJ(abstractC8426bCW, c8486bDd);
        }
        strCopydefault2 = "";
        strCopydefault = strCopydefault2;
        str2 = null;
        c57429yiJ = this.copydefault;
        ?? r92 = c57429yiJ;
        if (c57429yiJ == null) {
        }
        if (!z) {
        }
        r92.setViewDataBean(new TransactionNetworkFeeBean(null, null, C33069mpW.copydefault(C13754dXa.FragmentManager.bypassDispatchKeyEvent, C56423yEv.EZpvd(C56390yDp.OLrzqt("network", c10854bwMDHguZz3.djBIcL()))), !z ? "--" : "", charSequence, strCopydefault, null, null, null, (abstractC8426bCW.copydefault().isVariable() || z2) ? str2 : new Function0() { // from class: o.gaJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC20080gaD.KWHzl(this.EZpvd);
            }
        }, false, charSequence2, ejfBZ() instanceof OKWX402SignTransfer ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplActionMenuPresenterCallback) : "", 1475, null));
        AEQbTJ(abstractC8426bCW, c8486bDd);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(AbstractC20080gaD abstractC20080gaD) {
        abstractC20080gaD.wlaJM();
        T tEjfBZ = abstractC20080gaD.ejfBZ();
        AbstractC8564bFB abstractC8564bFB = tEjfBZ instanceof AbstractC8564bFB ? (AbstractC8564bFB) tEjfBZ : null;
        if (abstractC8564bFB != null) {
            C8396bBt c8396bBt = C8396bBt.AEQbTJ;
            androidx.fragment.app.FragmentManager childFragmentManager = abstractC20080gaD.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            C8396bBt.openTransactionFeePage$default(c8396bBt, childFragmentManager, abstractC8564bFB, null, 4, null);
        }
        return Unit.INSTANCE;
    }

    public java.lang.String EZpvd(@NotNull C8486bDd c8486bDd) {
        Intrinsics.checkNotNullParameter(c8486bDd, "");
        return c8486bDd instanceof C9215bRQ ? ((C9215bRQ) c8486bDd).copydefault() : c8486bDd.getFeeAmount();
    }

    public final void OLrzqt() {
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

    public final void AEQbTJ(AbstractC8426bCW<?> abstractC8426bCW, C8486bDd c8486bDd) {
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

    public final void copydefault() {
        AbstractC20082gaF.trackClickEvent$default(this, ejfBZ(), "contract_address", null, 4, null);
    }

    public final void djBIcL() {
        AbstractC20082gaF.trackClickEvent$default(this, ejfBZ(), "to_address", null, 4, null);
    }

    @Override // o.AbstractC20082gaF
    public void copydefault(@NotNull java.util.Collection<? extends AbstractC9832bcy> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        if (Intrinsics.EZpvd((AbstractC9832bcy) CollectionsKt___CollectionsKt.RcXXUw(collection), C9863bdc.EZpvd)) {
            KWHzl((TransactionTopReminderInfoBean) null);
        }
    }

    public final void KWHzl(@NotNull C9748bbT c9748bbT) {
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
