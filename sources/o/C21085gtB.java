package o;

import androidx.lifecycle.ViewModelKt;
import com.okinc.assets.api.model.GoToWithdrawFromWalletResultContractArgs;
import com.okinc.business.defi.biz.core.error.OKWException;
import com.okinc.business.defi.wallet.transfer.receive.exchange.WithdrawNetworksViewModel$requestNetworksData$2;
import com.okinc.business.defi.wallet.transfer.receive.exchange.bean.AssetWalletNetwork;
import com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeSelectNetworkBean;
import com.okinc.wallet.api.bean.WithdrawFromExchangeBean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.Bitmap;
import o.C12827cuN;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gtB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21085gtB extends AbstractC33073mpa {
    public final C13934dbu AEQbTJ;
    public final StateFlow<Bitmap<java.util.ArrayList<java.lang.Object>>> EZpvd;
    public final MutableStateFlow<Bitmap<java.util.ArrayList<java.lang.Object>>> KWHzl;
    public AbstractC12782ctV OLrzqt;
    public java.util.ArrayList<java.lang.Object> copydefault;
    public final C12827cuN gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C21085gtB() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Bitmap<java.util.ArrayList<java.lang.Object>>> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:o.cuN:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cuN:0x0008: INVOKE 
  (wrap:o.cuN$Application:0x0004: SGET  A[WRAPPED] (LINE:43) o.cuN.Companion o.cuN$Application)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.cuN.Application.getInstance$default(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN A[MD:(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN (m), WRAPPED] (LINE:43)) : (r2v0 o.cuN))
  (wrap:o.dbu:?: TERNARY null = ((wrap:int:0x000c: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.dbu:0x0012: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:44) call: o.dbu.<init>():void type: CONSTRUCTOR) : (r3v0 o.dbu))
 A[MD:(o.cuN, o.dbu):void (m)] (LINE:42) call: o.gtB.<init>(o.cuN, o.dbu):void type: THIS */
    public /* synthetic */ C21085gtB(C12827cuN c12827cuN, C13934dbu c13934dbu, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null) : c12827cuN, (i & 2) != 0 ? new C13934dbu() : c13934dbu);
    }

    public C21085gtB(@NotNull C12827cuN c12827cuN, @NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.gEmmrt = c12827cuN;
        this.AEQbTJ = c13934dbu;
        MutableStateFlow<Bitmap<java.util.ArrayList<java.lang.Object>>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow);
        this.copydefault = new java.util.ArrayList<>();
    }

    public final void OLrzqt(@NotNull java.util.ArrayList<AssetWalletNetwork> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        boolean zKWHzl = C33129mqd.KWHzl((java.util.Collection) arrayList);
        if (!zKWHzl) {
            MutableStateFlow<Bitmap<java.util.ArrayList<java.lang.Object>>> mutableStateFlow = this.KWHzl;
            while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new Bitmap.StateListAnimator(yDY.copydefault(new C14316djE(null, 0, 2, null))))) {
            }
        } else {
            if (zKWHzl) {
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WithdrawNetworksViewModel$requestNetworksData$2(arrayList, this, null), 3, null);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static /* synthetic */ void goToWithdrawalDetailPage$default(C21085gtB c21085gtB, InterfaceC8223ayg interfaceC8223ayg, WithdrawFromExchangeBean withdrawFromExchangeBean, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        c21085gtB.KWHzl(interfaceC8223ayg, withdrawFromExchangeBean, z);
    }

    public final void KWHzl(@NotNull InterfaceC8223ayg interfaceC8223ayg, @NotNull WithdrawFromExchangeBean withdrawFromExchangeBean, boolean z) {
        java.lang.String walletDisplayName;
        java.lang.String walletId;
        Intrinsics.checkNotNullParameter(interfaceC8223ayg, "");
        Intrinsics.checkNotNullParameter(withdrawFromExchangeBean, "");
        OLrzqt(withdrawFromExchangeBean);
        java.lang.Integer currencyId = withdrawFromExchangeBean.getCurrencyId();
        int iIntValue = currencyId != null ? currencyId.intValue() : 0;
        java.lang.Integer subCurrencyId = withdrawFromExchangeBean.getSubCurrencyId();
        int iIntValue2 = subCurrencyId != null ? subCurrencyId.intValue() : 0;
        java.lang.String address = withdrawFromExchangeBean.getAddress();
        if (address == null || (walletDisplayName = withdrawFromExchangeBean.getWalletDisplayName()) == null || (walletId = withdrawFromExchangeBean.getWalletId()) == null) {
            return;
        }
        long jValueOf = C33129mqd.valueOf(withdrawFromExchangeBean.getCoinId());
        java.lang.String walletIcon = withdrawFromExchangeBean.getWalletIcon();
        interfaceC8223ayg.KWHzl(new GoToWithdrawFromWalletResultContractArgs.Withdraw(iIntValue, iIntValue2, address, walletDisplayName, walletId, jValueOf, walletIcon == null ? "" : walletIcon));
    }

    public final void OLrzqt(WithdrawFromExchangeBean withdrawFromExchangeBean) {
        java.lang.String str;
        java.lang.Long coinId;
        if (withdrawFromExchangeBean != null) {
            java.lang.Integer currencyId = withdrawFromExchangeBean.getCurrencyId();
            str = (currencyId != null && currencyId.intValue() == -1) ? "currencyId is value of invalid " : "";
            if (withdrawFromExchangeBean.getSubCurrencyId() == null) {
                str = str + "subCurrencyId is value of invalid ";
            }
            java.lang.String address = withdrawFromExchangeBean.getAddress();
            if (address != null && address.length() == 0) {
                str = str + "walletAddress is null or empty";
            }
            java.lang.String walletId = withdrawFromExchangeBean.getWalletId();
            if (walletId != null && walletId.length() == 0) {
                str = str + "walletId is null or empty";
            }
            if (withdrawFromExchangeBean.getCoinId() == null && (coinId = withdrawFromExchangeBean.getCoinId()) != null && coinId.longValue() == -1) {
                str = str + "walletId is null or empty";
            }
        } else {
            str = "ExchangeSelectNetworkBean bean is null";
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            C10856bwO.EZpvd("WithdrawNetworksViewModel", new OKWException(str, null));
        }
    }

    public final void AEQbTJ(@NotNull android.app.Activity activity, @NotNull java.lang.String str, final ExchangeSelectNetworkBean exchangeSelectNetworkBean, @NotNull final Function2<? super java.lang.Integer, ? super AbstractC12782ctV, Unit> function2) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function2, "");
        getWallet$default(this, false, str, new Function1() { // from class: o.gtF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21085gtB.EZpvd(exchangeSelectNetworkBean, function2, (AbstractC12782ctV) obj);
            }
        }, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(ExchangeSelectNetworkBean exchangeSelectNetworkBean, Function2 function2, AbstractC12782ctV abstractC12782ctV) {
        java.lang.Long realChainId;
        if (abstractC12782ctV == null) {
            function2.invoke(2, abstractC12782ctV);
        } else {
            if (abstractC12782ctV.KWHzl(exchangeSelectNetworkBean != null ? exchangeSelectNetworkBean.getRealChainId() : null)) {
                C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault((exchangeSelectNetworkBean == null || (realChainId = exchangeSelectNetworkBean.getRealChainId()) == null) ? -1L : realChainId.longValue());
                if (c10854bwMCopydefault != null && c10854bwMCopydefault.QCjLjM()) {
                    C55326xho.toast$default(C13754dXa.FragmentManager.Dmq, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                    function2.invoke(0, abstractC12782ctV);
                } else {
                    function2.invoke(1, abstractC12782ctV);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getWallet$default(C21085gtB c21085gtB, boolean z, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c21085gtB.KWHzl(z, str, (Function1<? super AbstractC12782ctV, Unit>) function1);
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C21085gtB c21085gtB, Function1 function1, AbstractC12782ctV abstractC12782ctV) {
        c21085gtB.OLrzqt = abstractC12782ctV;
        function1.invoke(abstractC12782ctV);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Function1 function1, java.lang.Throwable th) {
        function1.invoke(null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(boolean z, java.lang.String str, final Function1<? super AbstractC12782ctV, Unit> function1) {
        AbstractC12782ctV abstractC12782ctV = this.OLrzqt;
        if (abstractC12782ctV == null || z) {
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = this.gEmmrt.OLrzqt(str, false);
            final Function1 function12 = new Function1() { // from class: o.gtz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C21085gtB.AEQbTJ(this.KWHzl, function1, (AbstractC12782ctV) obj);
                }
            };
            InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gty
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C21085gtB.OLrzqt(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.gtE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C21085gtB.OLrzqt(function1, (java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gtD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C21085gtB.EZpvd(function13, obj);
                }
            });
            call().AEQbTJ(interfaceC58217yxCAEQbTJ);
            Intrinsics.copydefault(interfaceC58217yxCAEQbTJ);
            return;
        }
        function1.invoke(abstractC12782ctV);
    }
}
