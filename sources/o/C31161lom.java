package o;

import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.dexlogic.bean.track.EventPageNameType;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexui.main.dappredirect.DexDappRedirectListFragment;
import com.okinc.business.dexui.main.swap.trade.single.defiplatform.DeFiPlatformSelectionSource;
import com.okinc.business.dexui.main.swap.trade.single.defiplatform.data.V6QuoteRequestWrapper;
import com.okinc.business.trade.features.home.ui.meme.data.MemeStrategyType;
import com.okinc.wallet.api.bean.CurrentWalletSwitchConfig;
import com.okinc.wallet.api.bean.CurrentWalletSwitchNetworkMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC25022ioq;
import o.C23274hvD;
import o.InterfaceC54855xXv;
import o.xWX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lom, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31161lom {
    public final Function0<Unit> AEQbTJ;
    public final AbstractC28352kYf AhwBna;
    public final androidx.fragment.app.Fragment EZpvd;
    public final int KWHzl;
    public final boolean OLrzqt;
    public final InterfaceC28107kPd copydefault;
    public final TransactionType djBIcL;
    public final TokenBase valueOf;

    /* JADX INFO: renamed from: o.lom$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TransactionType.values().length];
            try {
                iArr[TransactionType.Buy.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionType.Sell.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 androidx.fragment.app.Fragment)
  (r2v0 o.kPd)
  (r3v0 com.okinc.business.dex.api.bean.TokenBase)
  (r4v0 o.kYf)
  (r5v0 com.okinc.business.dexlogic.bean.TransactionType)
  (r6v0 int)
  (r7v0 boolean)
  (r8v0 kotlin.jvm.functions.Function0)
 A[MD:(androidx.fragment.app.Fragment, o.kPd, com.okinc.business.dex.api.bean.TokenBase, o.kYf, com.okinc.business.dexlogic.bean.TransactionType, int, boolean, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] call: o.lom.<init>(androidx.fragment.app.Fragment, o.kPd, com.okinc.business.dex.api.bean.TokenBase, o.kYf, com.okinc.business.dexlogic.bean.TransactionType, int, boolean, kotlin.jvm.functions.Function0):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C31161lom(androidx.fragment.app.Fragment fragment, InterfaceC28107kPd interfaceC28107kPd, TokenBase tokenBase, AbstractC28352kYf abstractC28352kYf, TransactionType transactionType, int i, boolean z, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragment, interfaceC28107kPd, tokenBase, abstractC28352kYf, transactionType, i, z, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt ? "MARKET" : "DEX";
    }

    public C31161lom(androidx.fragment.app.Fragment fragment, InterfaceC28107kPd interfaceC28107kPd, TokenBase tokenBase, AbstractC28352kYf abstractC28352kYf, TransactionType transactionType, int i, boolean z, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(interfaceC28107kPd, "");
        Intrinsics.checkNotNullParameter(tokenBase, "");
        Intrinsics.checkNotNullParameter(abstractC28352kYf, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        this.EZpvd = fragment;
        this.copydefault = interfaceC28107kPd;
        this.valueOf = tokenBase;
        this.AhwBna = abstractC28352kYf;
        this.djBIcL = transactionType;
        this.KWHzl = i;
        this.OLrzqt = z;
        this.AEQbTJ = function0;
    }

    public final void KWHzl(final C24375ice c24375ice) {
        final DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault;
        final DexMultiTokenInfoBean dexMultiTokenInfoBeanAkhnZx = C23317hvu.AkhnZx();
        if (dexMultiTokenInfoBeanAkhnZx == null || (dexMultiTokenInfoBeanCopydefault = this.AhwBna.copydefault(this.valueOf.getChainId(), this.valueOf.getTokenContractAddress())) == null) {
            return;
        }
        if (c24375ice != null) {
            C24375ice.m8622updateButtonLoadingForDAppRedirectKubx95w$default(c24375ice, true, this.djBIcL, 0, 4, null);
        }
        C21686hIo.AEQbTJ(C22380heK.OLrzqt.copydefault(this.copydefault.KWHzl()).fetchVPNInfo().KWHzl(dexMultiTokenInfoBeanAkhnZx.getChainId(), dexMultiTokenInfoBeanCopydefault.getChainId(), dexMultiTokenInfoBeanAkhnZx.getTokenContractAddress(), dexMultiTokenInfoBeanCopydefault.getTokenContractAddress()), false, (Function1<? super hHS, Unit>) new Function1() { // from class: o.lor
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31161lom.KWHzl(c24375ice, this, dexMultiTokenInfoBeanAkhnZx, dexMultiTokenInfoBeanCopydefault, (hHS) obj);
            }
        });
    }

    public static final Unit KWHzl(C24375ice c24375ice, C31161lom c31161lom, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, hHS hhs) {
        Intrinsics.checkNotNullParameter(hhs, "");
        if (c24375ice != null) {
            C24375ice.m8622updateButtonLoadingForDAppRedirectKubx95w$default(c24375ice, false, c31161lom.djBIcL, 0, 4, null);
        }
        DexDappRedirectListFragment.Activity activity = DexDappRedirectListFragment.Companion;
        C22825hmf c22825hmf = C22825hmf.OLrzqt;
        DexDappRedirectListFragment.Activity.newInstance$default(activity, null, C24632ihW.copydefault(dexMultiTokenInfoBean, c22825hmf.EZpvd(c31161lom.copydefault.KWHzl(), dexMultiTokenInfoBean.getChainId(), true), false), C24632ihW.copydefault(dexMultiTokenInfoBean2, c22825hmf.EZpvd(c31161lom.copydefault.KWHzl(), dexMultiTokenInfoBean2.getChainId(), true), false), C25444iwo.copydefault(c31161lom.KWHzl), hhs, new Function0() { // from class: o.loq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C31161lom.EZpvd();
            }
        }, new Function0() { // from class: o.loo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C31161lom.KWHzl();
            }
        }, c31161lom.copydefault.KWHzl(), null, 0, c31161lom.djBIcL.getType(), 768, null).show(c31161lom.EZpvd.getChildFragmentManager(), "javaClass");
        AbstractC28336kXq.trackDexTradeHomeFullPageView$default(c31161lom.AhwBna, C33129mqd.gEmmrt(dexMultiTokenInfoBean.getChainId()), c31161lom.djBIcL, EventPageNameType.SELECT_DAPP.getPageName(), C25444iwo.EZpvd(c31161lom.KWHzl), null, null, 48, null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        java.lang.String chainId = this.valueOf.getChainId();
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) chainId)) {
            chainId = "-100000000";
        }
        final long jValueOf = C33129mqd.valueOf(chainId);
        xWX.TaskDescription.showCurrentWalletSwitchScreen$default((xWX) C43251rlk.copydefault(xWX.class), fragmentManager, new CurrentWalletSwitchConfig(null, new CurrentWalletSwitchNetworkMode.SingleNetwork(jValueOf), C33070mpX.AYXKKw(C23274hvD.Fragment.r8lambdatzBBo0FLedRCWSI6_icF8qhF74s), null, null, 0, null, null, 249, null), new Function2() { // from class: o.lon
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(C31161lom.copydefault(jValueOf, (InterfaceC9738bbJ) obj, (java.lang.Long) obj2));
            }
        }, null, new TaskDescription(), 8, null);
    }

    public static final boolean copydefault(long j, InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return (interfaceC9738bbJ.ORxRYg() || interfaceC9738bbJ.getFieldNames() || !interfaceC9738bbJ.AkhnZx(j)) ? false : true;
    }

    /* JADX INFO: renamed from: o.lom$TaskDescription */
    public static final class TaskDescription implements InterfaceC54855xXv {
        public TaskDescription() {
        }

        @Override // o.InterfaceC54855xXv
        public void AEQbTJ(InterfaceC9738bbJ interfaceC9738bbJ) {
            InterfaceC54855xXv.ActionBar.KWHzl(this, interfaceC9738bbJ);
        }

        @Override // o.InterfaceC54855xXv
        public void copydefault() {
            InterfaceC54855xXv.ActionBar.EZpvd(this);
        }

        @Override // o.InterfaceC54855xXv
        public void copydefault(InterfaceC9738bbJ interfaceC9738bbJ) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            InterfaceC54855xXv.ActionBar.copydefault(this, interfaceC9738bbJ);
            Function0 function0 = C31161lom.this.AEQbTJ;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // o.InterfaceC54855xXv
        public void KWHzl(InterfaceC9738bbJ interfaceC9738bbJ, long j) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            InterfaceC54855xXv.ActionBar.EZpvd(this, interfaceC9738bbJ, j);
            Function0 function0 = C31161lom.this.AEQbTJ;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // o.InterfaceC54855xXv
        public void OLrzqt(long j) {
            InterfaceC54855xXv.ActionBar.KWHzl(this, j);
            Function0 function0 = C31161lom.this.AEQbTJ;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public final void AYXKKw() {
        FragmentActivity fragmentActivityRequireActivity = this.EZpvd.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        C25352ivB.OLrzqt((android.content.Context) fragmentActivityRequireActivity, this.copydefault.KWHzl(), this.valueOf.getChainId(), true);
    }

    public final void EZpvd(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, V6QuoteRequestWrapper v6QuoteRequestWrapper, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        MemeStrategyType memeStrategyType;
        DeFiPlatformSelectionSource deFiPlatformSelectionSource;
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(activityResultLauncher, "");
        C24371ica c24371ica = C24371ica.OLrzqt;
        java.lang.String tokenContractAddress = this.valueOf.getTokenContractAddress();
        java.lang.String value = (TransactionType.Buy == this.djBIcL ? DexTrackEventParameter.ButtonName.BUY : DexTrackEventParameter.ButtonName.SELL).getValue();
        java.lang.String strAEQbTJ = AEQbTJ();
        java.lang.String eventSource = this.valueOf.getEventSource();
        TransactionType transactionType = this.djBIcL;
        int[] iArr = StateListAnimator.OLrzqt;
        int i = iArr[transactionType.ordinal()];
        if (i == 1) {
            memeStrategyType = MemeStrategyType.BuyNow;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            memeStrategyType = MemeStrategyType.SellNow;
        }
        c24371ica.OLrzqt("provider_select_enter", tokenContractAddress, value, strAEQbTJ, eventSource, memeStrategyType);
        int i2 = iArr[this.djBIcL.ordinal()];
        if (i2 == 1) {
            deFiPlatformSelectionSource = DeFiPlatformSelectionSource.MEME_MODE_BUY;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            deFiPlatformSelectionSource = DeFiPlatformSelectionSource.MEME_MODE_SELL;
        }
        DeFiPlatformSelectionSource deFiPlatformSelectionSource2 = deFiPlatformSelectionSource;
        ActivityC25022ioq.StateListAnimator stateListAnimator = ActivityC25022ioq.Companion;
        FragmentActivity fragmentActivityRequireActivity = this.EZpvd.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        activityResultLauncher.launch(stateListAnimator.AEQbTJ(fragmentActivityRequireActivity, this.copydefault.KWHzl(), str, str2, v6QuoteRequestWrapper, v6BaseQuoteResponse, deFiPlatformSelectionSource2, z));
    }
}
