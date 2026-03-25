package o;

import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dex.tee.quick.market.ui.viewmodel.QuickMarketPlaceOrderViewModel;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.dexlogic.bean.track.EventTrackSubmitType;
import com.okinc.business.trade.features.home.ui.meme.statepool.SwapState;
import com.okinc.wallet.api.bean.UnsupportedWalletType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.xWO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.low, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31171low {
    public final androidx.fragment.app.FragmentManager AEQbTJ;
    public final C31161lom AYXKKw;
    public final CoroutineScope AhwBna;
    public final Function0<Unit> AkhnZx;
    public final TransactionType DbNXlk;
    public final C24375ice EZpvd;
    public final C31153loe KWHzl;
    public final Function0<java.util.Map<java.lang.String, java.lang.String>> OLrzqt;
    public final android.content.Context copydefault;
    public final Function0<java.util.List<UnsupportedWalletType>> djBIcL;
    public final AbstractC28352kYf fARcdN;
    public final QuickMarketPlaceOrderViewModel fetchVPNInfo;
    public final Function0<Unit> gEmmrt;
    public final Function2<EventTrackSubmitType, java.util.Map<java.lang.String, java.lang.String>, Unit> isConnected;
    public final Function0<Unit> valueOf;
    public final TokenBase values;

    /* JADX INFO: renamed from: o.low$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SwapState.values().length];
            try {
                iArr[SwapState.SWAP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SwapState.STAND_BY_DISH_WARNING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SwapState.STAND_BY_LEVERAGE_WARNING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[SwapState.NO_WALLET.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[SwapState.SWAP_CHAIN_MARKET_UNSUPPORTED_FOR_DAPP.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[SwapState.BRIDGE_UNSUPPORTED_CHAIN_PAIR_FOR_DAPP.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[SwapState.SWAP_UNSUPPORTED_FOR_DAPP.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[SwapState.INSUFFICIENT_BALANCE.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[SwapState.SWITCH_WALLET.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[SwapState.SA_NOT_SMART_ACCOUNT.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[SwapState.SA_DISABLED.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[SwapState.SA_NEED_TO_UPDATE_APP.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[SwapState.SA_SERVICE_UPGRADED_ACCOUNT.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r28v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.business.dexlogic.bean.track.EventTrackSubmitType, ? super java.util.Map<java.lang.String, java.lang.String>, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r29v0, resolved type: kotlin.jvm.functions.Function0<? extends java.util.List<? extends com.okinc.wallet.api.bean.UnsupportedWalletType>> */
    /* JADX DEBUG: Multi-variable search result rejected for r30v0, resolved type: kotlin.jvm.functions.Function0<? extends java.util.Map<java.lang.String, java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C31171low(@NotNull AbstractC28352kYf abstractC28352kYf, @NotNull C31161lom c31161lom, @NotNull C31153loe c31153loe, @NotNull TransactionType transactionType, @NotNull TokenBase tokenBase, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull android.content.Context context, @NotNull CoroutineScope coroutineScope, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03, @NotNull Function2<? super EventTrackSubmitType, ? super java.util.Map<java.lang.String, java.lang.String>, Unit> function2, @NotNull Function0<? extends java.util.List<? extends UnsupportedWalletType>> function04, @NotNull Function0<? extends java.util.Map<java.lang.String, java.lang.String>> function05, C24375ice c24375ice, @NotNull QuickMarketPlaceOrderViewModel quickMarketPlaceOrderViewModel) {
        Intrinsics.checkNotNullParameter(abstractC28352kYf, "");
        Intrinsics.checkNotNullParameter(c31161lom, "");
        Intrinsics.checkNotNullParameter(c31153loe, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(tokenBase, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function04, "");
        Intrinsics.checkNotNullParameter(function05, "");
        Intrinsics.checkNotNullParameter(quickMarketPlaceOrderViewModel, "");
        this.fARcdN = abstractC28352kYf;
        this.AYXKKw = c31161lom;
        this.KWHzl = c31153loe;
        this.DbNXlk = transactionType;
        this.values = tokenBase;
        this.AEQbTJ = fragmentManager;
        this.copydefault = context;
        this.AhwBna = coroutineScope;
        this.AkhnZx = function0;
        this.gEmmrt = function02;
        this.valueOf = function03;
        this.isConnected = function2;
        this.djBIcL = function04;
        this.OLrzqt = function05;
        this.EZpvd = c24375ice;
        this.fetchVPNInfo = quickMarketPlaceOrderViewModel;
    }

    public final void copydefault(@NotNull SwapState swapState) {
        Function2<android.content.Context, CoroutineScope, Unit> function2EZpvd;
        Intrinsics.checkNotNullParameter(swapState, "");
        switch (StateListAnimator.EZpvd[swapState.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.AkhnZx.invoke();
                this.gEmmrt.invoke();
                this.isConnected.invoke(EventTrackSubmitType.SUBMIT, this.OLrzqt.invoke());
                break;
            case 4:
                xWO xwo = (xWO) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(xWO.class));
                if (xwo != null) {
                    xWO.ActionBar.showConnectWalletDialog$default(xwo, this.AEQbTJ, new Application(), (java.util.List) null, this.djBIcL.invoke(), (InterfaceC54856xXw) null, 20, (java.lang.Object) null);
                }
                this.isConnected.invoke(EventTrackSubmitType.CONNECTED_WALLET, C56424yEw.KWHzl());
                break;
            case 5:
            case 6:
            case 7:
                this.AYXKKw.KWHzl(this.EZpvd);
                this.isConnected.invoke(EventTrackSubmitType.DAPP, C56424yEw.KWHzl());
                break;
            case 8:
                this.KWHzl.KWHzl(this.fARcdN.OLrzqt(this.DbNXlk, this.values.getChainId(), this.values.getTokenContractAddress()));
                this.isConnected.invoke(EventTrackSubmitType.DEPOSIT, C56424yEw.KWHzl());
                break;
            case 9:
                this.AYXKKw.OLrzqt(this.AEQbTJ);
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                gLQ glqEZpvd = this.fetchVPNInfo.EZpvd(this.values.getChainId());
                if (glqEZpvd != null && (function2EZpvd = glqEZpvd.EZpvd()) != null) {
                    function2EZpvd.invoke(this.copydefault, this.AhwBna);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: o.low$Application */
    public static final class Application implements InterfaceC54859xXz {
        public Application() {
        }

        @Override // o.InterfaceC54859xXz
        public void EZpvd() {
            C31171low.this.valueOf.invoke();
        }
    }
}
