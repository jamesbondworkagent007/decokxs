package o;

import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.market.search.features.navigation.root.ui.NavSearchRootFragment;
import com.okinc.market.search.features.navigation.root.ui.delegate.DefaultNavSearchItemClickDelegate$handleInstrumentClick$2;
import com.okinc.market.search.features.navigation.root.ui.delegate.DefaultNavSearchItemClickDelegate$handleItemClickEvent$1;
import com.okinc.market.search.features.navigation.root.ui.model.NavSearchMode;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.uilab.edit.OKEditText;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CoinInfo;
import com.okinc.unify_trade.biz.DexInstrument;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C27989kKu;
import o.InterfaceC49499uph;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class qOX implements qPL {
    public Function1<? super java.lang.Boolean, Unit> AYXKKw;
    public Function2<? super DexInstrument, ? super java.lang.String, Unit> AhwBna;
    public Function0<Unit> KWHzl;
    public android.content.Context OLrzqt;
    public androidx.fragment.app.DialogFragment copydefault;
    public Function1<java.lang.Object, Unit> djBIcL;
    public boolean gEmmrt;
    public C55230xfy isConnected;
    public Function2<java.lang.Object, ? super java.lang.String, Unit> valueOf;
    public java.lang.String AEQbTJ = "";
    public final java.lang.Runnable AkhnZx = new java.lang.Runnable() { // from class: o.qPg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Runnable
        public final void run() {
            qOX.AEQbTJ(this.EZpvd);
        }
    };
    public final Activity EZpvd = new Activity();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48913uee
    public void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48913uee
    public void EZpvd(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AYXKKw = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final androidx.fragment.app.DialogFragment KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(C55230xfy c55230xfy, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isConnected = c55230xfy;
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48913uee
    public void copydefault(Function0<Unit> function0) {
        this.KWHzl = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48913uee
    public void copydefault(@NotNull Function1<java.lang.Object, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.djBIcL = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48913uee
    public void copydefault(@NotNull Function2<? super DexInstrument, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.AhwBna = function2;
    }

    public static final void AEQbTJ(qOX qox) {
        Function0<Unit> function0 = qox.KWHzl;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final class Activity extends FragmentManager.FragmentLifecycleCallbacks {
        public Activity() {
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentResumed(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
            android.view.View view;
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            super.onFragmentResumed(fragmentManager, fragment);
            if (fragment instanceof qPL) {
                Function1 function1 = qOX.this.AYXKKw;
                if (function1 != null) {
                    function1.invoke(java.lang.Boolean.TRUE);
                }
                androidx.fragment.app.DialogFragment dialogFragmentKWHzl = qOX.this.KWHzl();
                if (dialogFragmentKWHzl == null || (view = dialogFragmentKWHzl.getView()) == null) {
                    return;
                }
                view.postDelayed(qOX.this.AkhnZx, 100L);
            }
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentPaused(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
            androidx.fragment.app.DialogFragment dialogFragmentKWHzl;
            android.view.View view;
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            super.onFragmentPaused(fragmentManager, fragment);
            if (!(fragment instanceof qPL) || (dialogFragmentKWHzl = qOX.this.KWHzl()) == null || (view = dialogFragmentKWHzl.getView()) == null) {
                return;
            }
            view.removeCallbacks(qOX.this.AkhnZx);
        }
    }

    public void EZpvd(@NotNull androidx.fragment.app.DialogFragment dialogFragment) {
        Intrinsics.checkNotNullParameter(dialogFragment, "");
        this.copydefault = dialogFragment;
        this.OLrzqt = dialogFragment.getContext();
        dialogFragment.getParentFragmentManager().registerFragmentLifecycleCallbacks(this.EZpvd, false);
    }

    public void OLrzqt() {
        androidx.fragment.app.FragmentManager parentFragmentManager;
        androidx.fragment.app.DialogFragment dialogFragment;
        qPT qptCopydefault;
        java.lang.String strConvertNavType;
        qPP qppOLrzqt;
        NavSearchMode navSearchModeAwvSrB;
        if (!this.gEmmrt && (dialogFragment = this.copydefault) != null && (qptCopydefault = qPU.copydefault(dialogFragment)) != null) {
            androidx.fragment.app.DialogFragment dialogFragment2 = this.copydefault;
            if (dialogFragment2 == null || (qppOLrzqt = qPM.OLrzqt(dialogFragment2)) == null || (navSearchModeAwvSrB = qppOLrzqt.AwvSrB()) == null || (strConvertNavType = navSearchModeAwvSrB.convertNavType()) == null) {
                strConvertNavType = "bizNAv";
            }
            qptCopydefault.AkhnZx(strConvertNavType);
        }
        Function1<? super java.lang.Boolean, Unit> function1 = this.AYXKKw;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.FALSE);
        }
        androidx.fragment.app.DialogFragment dialogFragment3 = this.copydefault;
        if (dialogFragment3 != null && (parentFragmentManager = dialogFragment3.getParentFragmentManager()) != null) {
            parentFragmentManager.unregisterFragmentLifecycleCallbacks(this.EZpvd);
        }
        this.copydefault = null;
        this.OLrzqt = null;
        this.AYXKKw = null;
        this.djBIcL = null;
        this.valueOf = null;
        this.KWHzl = null;
    }

    @Override // o.qPL
    public void KWHzl(@NotNull android.view.View view, @NotNull BizInstrument bizInstrument, int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        AEQbTJ(view, new C48915ueg(bizInstrument.getInstId(), bizInstrument.getInstType(), java.lang.Integer.valueOf(i), str), str2, str3, z, bizInstrument);
    }

    @Override // o.qPL
    public void AEQbTJ(@NotNull android.view.View view, @NotNull C48915ueg c48915ueg, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, InterfaceC55797xqi interfaceC55797xqi) {
        qPT qptCopydefault;
        java.lang.String strConvertNavType;
        qPP qppOLrzqt;
        NavSearchMode navSearchModeAwvSrB;
        qPT qptCopydefault2;
        qPT qptCopydefault3;
        qPT qptCopydefault4;
        qPT qptCopydefault5;
        qPT qptCopydefault6;
        androidx.fragment.app.DialogFragment dialogFragment;
        LifecycleCoroutineScope lifecycleScope;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c48915ueg, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (z && interfaceC55797xqi != null && (dialogFragment = this.copydefault) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(dialogFragment)) != null) {
            BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new DefaultNavSearchItemClickDelegate$handleItemClickEvent$1(this, interfaceC55797xqi, null), 3, null);
        }
        this.gEmmrt = true;
        Function1<java.lang.Object, Unit> function1 = this.djBIcL;
        if (function1 != null) {
            function1.invoke(new CoinInfo(c48915ueg.OLrzqt(), c48915ueg.AEQbTJ()));
        }
        Function2<java.lang.Object, ? super java.lang.String, Unit> function2 = this.valueOf;
        if (function2 != null) {
            CoinInfo coinInfo = new CoinInfo(c48915ueg.OLrzqt(), c48915ueg.AEQbTJ());
            java.lang.String strKWHzl = c48915ueg.KWHzl();
            if (strKWHzl == null) {
                strKWHzl = "";
            }
            function2.invoke(coinInfo, strKWHzl);
        }
        java.lang.String strKWHzl2 = c48915ueg.KWHzl();
        C27989kKu.Activity activity = C27989kKu.Companion;
        if (Intrinsics.EZpvd((java.lang.Object) strKWHzl2, (java.lang.Object) activity.KWHzl())) {
            androidx.fragment.app.DialogFragment dialogFragment2 = this.copydefault;
            if (dialogFragment2 != null && (qptCopydefault6 = qPU.copydefault(dialogFragment2)) != null) {
                qptCopydefault6.copydefault(c48915ueg.OLrzqt(), c48915ueg.AEQbTJ());
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) strKWHzl2, (java.lang.Object) activity.EZpvd())) {
            androidx.fragment.app.DialogFragment dialogFragment3 = this.copydefault;
            if (dialogFragment3 != null && (qptCopydefault3 = qPU.copydefault(dialogFragment3)) != null) {
                qptCopydefault3.KWHzl(c48915ueg.OLrzqt(), c48915ueg.AEQbTJ());
            }
        } else {
            androidx.fragment.app.DialogFragment dialogFragment4 = this.copydefault;
            if (dialogFragment4 != null && (qptCopydefault2 = qPU.copydefault(dialogFragment4)) != null) {
                qptCopydefault2.KWHzl(view, c48915ueg, str, str2);
            }
            androidx.fragment.app.DialogFragment dialogFragment5 = this.copydefault;
            if (dialogFragment5 != null && (qptCopydefault = qPU.copydefault(dialogFragment5)) != null) {
                androidx.fragment.app.DialogFragment dialogFragment6 = this.copydefault;
                if (dialogFragment6 == null || (qppOLrzqt = qPM.OLrzqt(dialogFragment6)) == null || (navSearchModeAwvSrB = qppOLrzqt.AwvSrB()) == null || (strConvertNavType = navSearchModeAwvSrB.convertNavType()) == null) {
                    strConvertNavType = "bizNAv";
                }
                qptCopydefault.KWHzl(c48915ueg, strConvertNavType);
            }
        }
        if (Intrinsics.EZpvd((java.lang.Object) c48915ueg.KWHzl(), (java.lang.Object) activity.djBIcL())) {
            androidx.fragment.app.DialogFragment dialogFragment7 = this.copydefault;
            if (dialogFragment7 != null && (qptCopydefault5 = qPU.copydefault(dialogFragment7)) != null) {
                java.lang.Integer numCopydefault = c48915ueg.copydefault();
                qptCopydefault5.fetchVPNInfo(C33129mqd.gEmmrt(java.lang.Integer.valueOf((numCopydefault != null ? numCopydefault.intValue() : -1) + 1)));
            }
            androidx.fragment.app.DialogFragment dialogFragment8 = this.copydefault;
            if (dialogFragment8 != null && (qptCopydefault4 = qPU.copydefault(dialogFragment8)) != null) {
                qptCopydefault4.AEQbTJ(c48915ueg.OLrzqt(), c48915ueg.AEQbTJ());
            }
        }
        androidx.fragment.app.DialogFragment dialogFragment9 = this.copydefault;
        if (dialogFragment9 != null) {
            java.lang.String name = NavSearchRootFragment.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            FragmentKt.setFragmentResult(dialogFragment9, name, BundleKt.bundleOf(C56390yDp.OLrzqt("inst_id", c48915ueg.OLrzqt()), C56390yDp.OLrzqt("instType", c48915ueg.AEQbTJ()), C56390yDp.OLrzqt(EopTrackEvent.KEY_PAGE_TYPE, c48915ueg.KWHzl())));
        }
        androidx.fragment.app.DialogFragment dialogFragment10 = this.copydefault;
        if (dialogFragment10 != null) {
            dialogFragment10.dismissAllowingStateLoss();
        }
    }

    @Override // o.qPL
    public void KWHzl(@NotNull android.view.View view, @NotNull DexInstrument dexInstrument, int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, java.lang.Boolean bool) {
        qPT qptCopydefault;
        androidx.fragment.app.DialogFragment dialogFragment;
        LifecycleCoroutineScope lifecycleScope;
        qPT qptCopydefault2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) C27989kKu.Companion.EZpvd())) {
            androidx.fragment.app.DialogFragment dialogFragment2 = this.copydefault;
            if (dialogFragment2 != null && (qptCopydefault2 = qPU.copydefault(dialogFragment2)) != null) {
                java.lang.String tokenSymbol = dexInstrument.getTokenSymbol();
                java.lang.String upperCase = "dex".toUpperCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                qptCopydefault2.KWHzl(tokenSymbol, upperCase);
            }
        } else {
            androidx.fragment.app.DialogFragment dialogFragment3 = this.copydefault;
            if (dialogFragment3 != null && (qptCopydefault = qPU.copydefault(dialogFragment3)) != null) {
                qptCopydefault.OLrzqt(view, dexInstrument, str2, str3, bool);
            }
        }
        this.gEmmrt = true;
        Function2<? super DexInstrument, ? super java.lang.String, Unit> function2 = this.AhwBna;
        if (function2 != null) {
            function2.invoke(dexInstrument, str);
        }
        if (z && (dialogFragment = this.copydefault) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(dialogFragment)) != null) {
            BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new DefaultNavSearchItemClickDelegate$handleInstrumentClick$2(this, dexInstrument, null), 3, null);
        }
        androidx.fragment.app.DialogFragment dialogFragment4 = this.copydefault;
        if (dialogFragment4 != null) {
            java.lang.String name = NavSearchRootFragment.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            FragmentKt.setFragmentResult(dialogFragment4, name, BundleKt.bundleOf(C56390yDp.OLrzqt("data", dexInstrument), C56390yDp.OLrzqt("instType", "CEDEFI"), C56390yDp.OLrzqt(EopTrackEvent.KEY_PAGE_TYPE, str)));
        }
        androidx.fragment.app.DialogFragment dialogFragment5 = this.copydefault;
        if (dialogFragment5 != null) {
            dialogFragment5.dismissAllowingStateLoss();
        }
    }

    @Override // o.qPL
    public void OLrzqt(@NotNull android.content.Context context, @NotNull ActionBar actionBar) {
        qPT qptCopydefault;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        androidx.fragment.app.DialogFragment dialogFragment = this.copydefault;
        if (dialogFragment != null && (qptCopydefault = qPU.copydefault(dialogFragment)) != null) {
            java.lang.String strCopydefault = actionBar.copydefault();
            java.util.Locale locale = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String lowerCase = strCopydefault.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            qptCopydefault.djBIcL(lowerCase + C27989kKu.Companion.valueOf());
        }
        ((InterfaceC49497upf) ((InterfaceC49425uoM) C43248rlh.KWHzl.AEQbTJ(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).KWHzl(context, TaskDescription.copydefault(actionBar), Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "trade_page") ? "trade_page" : "");
        androidx.fragment.app.DialogFragment dialogFragment2 = this.copydefault;
        if (dialogFragment2 != null) {
            dialogFragment2.dismissAllowingStateLoss();
        }
    }

    @Override // o.qPL
    public void OLrzqt(@NotNull java.lang.String str) {
        androidx.fragment.app.DialogFragment dialogFragment;
        qPT qptCopydefault;
        qPP qppOLrzqt;
        qPT qptCopydefault2;
        qPT qptCopydefault3;
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = true;
        java.lang.String str2 = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null));
        if (str2 == null) {
            str2 = "";
        }
        androidx.fragment.app.DialogFragment dialogFragment2 = this.copydefault;
        if (dialogFragment2 != null && (qptCopydefault3 = qPU.copydefault(dialogFragment2)) != null) {
            qptCopydefault3.DbNXlk(str2);
        }
        androidx.fragment.app.DialogFragment dialogFragment3 = this.copydefault;
        if (dialogFragment3 != null && (qptCopydefault2 = qPU.copydefault(dialogFragment3)) != null) {
            qptCopydefault2.values(str);
        }
        android.content.Context context = this.OLrzqt;
        if (context != null) {
            ((InterfaceC49497upf) ((InterfaceC49425uoM) C43248rlh.KWHzl.AEQbTJ(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).OLrzqt(context, str, Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "trade_page") ? "trade_page" : "");
        }
        androidx.fragment.app.DialogFragment dialogFragment4 = this.copydefault;
        if (((dialogFragment4 == null || (qppOLrzqt = qPM.OLrzqt(dialogFragment4)) == null) ? null : qppOLrzqt.AwvSrB()) == NavSearchMode.COIN_MODE && (dialogFragment = this.copydefault) != null && (qptCopydefault = qPU.copydefault(dialogFragment)) != null) {
            qptCopydefault.AEQbTJ(str, "OPTION");
        }
        androidx.fragment.app.DialogFragment dialogFragment5 = this.copydefault;
        if (dialogFragment5 != null) {
            dialogFragment5.dismissAllowingStateLoss();
        }
    }

    @Override // o.qPL
    public void copydefault(@NotNull C40131qKm c40131qKm) {
        qPT qptCopydefault;
        OKEditText oKEditTextKWHzl;
        OKEditText oKEditTextKWHzl2;
        Intrinsics.checkNotNullParameter(c40131qKm, "");
        C55230xfy c55230xfy = this.isConnected;
        if (c55230xfy != null && (oKEditTextKWHzl2 = c55230xfy.KWHzl()) != null) {
            oKEditTextKWHzl2.setText(c40131qKm.AEQbTJ());
        }
        C55230xfy c55230xfy2 = this.isConnected;
        if (c55230xfy2 != null && (oKEditTextKWHzl = c55230xfy2.KWHzl()) != null) {
            oKEditTextKWHzl.setSelection(c40131qKm.AEQbTJ().length());
        }
        androidx.fragment.app.DialogFragment dialogFragment = this.copydefault;
        if (dialogFragment != null) {
            C33054mpH.copydefault(dialogFragment);
        }
        androidx.fragment.app.DialogFragment dialogFragment2 = this.copydefault;
        if (dialogFragment2 == null || (qptCopydefault = qPU.copydefault(dialogFragment2)) == null) {
            return;
        }
        qptCopydefault.copydefault("clickCoin");
    }

    @Override // o.qPL
    public void AEQbTJ() {
        android.content.Context context = this.OLrzqt;
        if (context != null) {
            InterfaceC49499uph.StateListAnimator.routeAccountModeActivity$default((InterfaceC49499uph) C43248rlh.KWHzl.AEQbTJ(InterfaceC49499uph.class), context, null, null, null, 1, null, 46, null);
        }
    }

    @Override // o.qPL
    public void fetchVPNInfo() {
        androidx.fragment.app.DialogFragment dialogFragment = this.copydefault;
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
    }
}
