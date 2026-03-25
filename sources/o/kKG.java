package o;

import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo;
import com.okinc.business.market.wallet.domain.usecase.WalletUseCase$getActiveWallet$1;
import com.okinc.business.market.wallet.domain.usecase.WalletUseCase$getActiveWalletIoAF18A$$inlined$dexRunCatching$1;
import com.okinc.business.market.wallet.domain.usecase.WalletUseCase$getChainMetadata$1;
import com.okinc.business.market.wallet.domain.usecase.WalletUseCase$getChainMetadata0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.business.market.wallet.domain.usecase.WalletUseCase$getNetworkFromChainId$1;
import com.okinc.business.market.wallet.domain.usecase.WalletUseCase$getNetworkFromChainIdgIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.wallet.domain.usecase.WalletUseCase$getUserUniqueId$2;
import com.okinc.business.market.wallet.domain.usecase.WalletUseCase$getWalletAddress$1;
import com.okinc.business.market.wallet.domain.usecase.WalletUseCase$getWalletAddressgIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.wallet.domain.usecase.WalletUseCase$getWalletId$2;
import com.okinc.business.market.wallet.domain.usecase.WalletUseCase$isAAWallet$2;
import com.okinc.business.market.wallet.domain.usecase.WalletUseCase$isAAWalletSupportDifferentWallets$2;
import com.okinc.business.market.wallet.domain.usecase.WalletUseCase$isEvmChain$1;
import com.okinc.business.market.wallet.domain.usecase.WalletUseCase$isWalletExist$2;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.WalletDexService;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kKG {
    public final kKD OLrzqt;
    public final CoroutineDispatcher copydefault;

    @yCM
    public kKG(@NotNull kKD kkd, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(kkd, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = kkd;
        this.copydefault = coroutineDispatcher;
    }

    public final java.lang.Object AYXKKw(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(this.copydefault, new WalletUseCase$isWalletExist$2(this, null), continuation);
    }

    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super java.lang.String> continuation) {
        return BuildersKt.withContext(this.copydefault, new WalletUseCase$getWalletId$2(this, null), continuation);
    }

    public final java.lang.String OLrzqt() {
        InterfaceC9738bbJ interfaceC9738bbJValueOf = valueOf();
        java.lang.String strDbNXlk = interfaceC9738bbJValueOf != null ? interfaceC9738bbJValueOf.DbNXlk() : null;
        return strDbNXlk == null ? "" : strDbNXlk;
    }

    public final java.lang.Object copydefault(@NotNull Continuation<? super java.lang.String> continuation) {
        return BuildersKt.withContext(this.copydefault, new WalletUseCase$getUserUniqueId$2(this, null), continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(this.copydefault, new WalletUseCase$isAAWallet$2(this, null), continuation);
    }

    public final InterfaceC9738bbJ valueOf() {
        return this.OLrzqt.EZpvd();
    }

    public final java.util.List<java.lang.String> EZpvd() {
        java.util.Set<java.lang.String> setCopydefault;
        java.util.List<java.lang.String> listAxsJAYsNCnLh;
        InterfaceC9738bbJ interfaceC9738bbJValueOf = valueOf();
        return (interfaceC9738bbJValueOf == null || (setCopydefault = interfaceC9738bbJValueOf.copydefault()) == null || (listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(setCopydefault)) == null) ? yDY.AhwBna() : listAxsJAYsNCnLh;
    }

    public final java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(this.copydefault, new WalletUseCase$isAAWalletSupportDifferentWallets$2(this, null), continuation);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC9738bbJ interfaceC9738bbJValueOf = valueOf();
        java.lang.String strEZpvd = interfaceC9738bbJValueOf != null ? interfaceC9738bbJValueOf.EZpvd(C33129mqd.valueOf(str)) : null;
        return strEZpvd == null ? "" : strEZpvd;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        WalletUseCase$isEvmChain$1 walletUseCase$isEvmChain$1;
        if (continuation instanceof WalletUseCase$isEvmChain$1) {
            walletUseCase$isEvmChain$1 = (WalletUseCase$isEvmChain$1) continuation;
            int i = walletUseCase$isEvmChain$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletUseCase$isEvmChain$1.label = i - Integer.MIN_VALUE;
            } else {
                walletUseCase$isEvmChain$1 = new WalletUseCase$isEvmChain$1(this, continuation);
            }
        }
        java.lang.Object obj = walletUseCase$isEvmChain$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletUseCase$isEvmChain$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        kKD kkd = this.OLrzqt;
        walletUseCase$isEvmChain$1.label = 1;
        java.lang.Object objAEQbTJ = kkd.AEQbTJ(str, walletUseCase$isEvmChain$1);
        return objAEQbTJ == objCopydefault ? objCopydefault : objAEQbTJ;
    }

    public final boolean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.OLrzqt.AEQbTJ(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull Continuation<? super Result<? extends InterfaceC9738bbJ>> continuation) throws java.lang.Throwable {
        WalletUseCase$getActiveWallet$1 walletUseCase$getActiveWallet$1;
        if (continuation instanceof WalletUseCase$getActiveWallet$1) {
            walletUseCase$getActiveWallet$1 = (WalletUseCase$getActiveWallet$1) continuation;
            int i = walletUseCase$getActiveWallet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletUseCase$getActiveWallet$1.label = i - Integer.MIN_VALUE;
            } else {
                walletUseCase$getActiveWallet$1 = new WalletUseCase$getActiveWallet$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletUseCase$getActiveWallet$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletUseCase$getActiveWallet$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            WalletUseCase$getActiveWalletIoAF18A$$inlined$dexRunCatching$1 walletUseCase$getActiveWalletIoAF18A$$inlined$dexRunCatching$1 = new WalletUseCase$getActiveWalletIoAF18A$$inlined$dexRunCatching$1(null, this);
            walletUseCase$getActiveWallet$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, walletUseCase$getActiveWalletIoAF18A$$inlined$dexRunCatching$1, walletUseCase$getActiveWallet$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final java.lang.String EZpvd(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (interfaceC9738bbJ.ORxRYg() || interfaceC9738bbJ.gHZMYf() || interfaceC9738bbJ.AubY()) {
            return interfaceC9738bbJ.EZpvd(C33129mqd.valueOf(str));
        }
        return C33129mqd.gEmmrt(CollectionsKt___CollectionsKt.RcXXUw(interfaceC9738bbJ.copydefault()));
    }

    public final boolean OLrzqt(InterfaceC9738bbJ interfaceC9738bbJ) {
        if (interfaceC9738bbJ != null) {
            return interfaceC9738bbJ.zsXlph();
        }
        return false;
    }

    public static /* synthetic */ boolean isTrackingWallet$default(kKG kkg, InterfaceC9738bbJ interfaceC9738bbJ, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC9738bbJ = null;
        }
        return kkg.AEQbTJ(interfaceC9738bbJ);
    }

    public final boolean AEQbTJ(InterfaceC9738bbJ interfaceC9738bbJ) {
        if (interfaceC9738bbJ == null) {
            interfaceC9738bbJ = valueOf();
        }
        if (interfaceC9738bbJ != null) {
            return interfaceC9738bbJ.QfsBiF();
        }
        return false;
    }

    public static /* synthetic */ long getChainId$default(kKG kkg, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 501;
        }
        return kkg.AEQbTJ(j);
    }

    public final long AEQbTJ(long j) {
        java.util.List<InterfaceC9731bbC> listRcXXUw;
        InterfaceC9731bbC interfaceC9731bbC;
        InterfaceC9738bbJ interfaceC9738bbJValueOf = valueOf();
        return (interfaceC9738bbJValueOf == null || (listRcXXUw = interfaceC9738bbJValueOf.RcXXUw()) == null || (interfaceC9731bbC = (InterfaceC9731bbC) CollectionsKt___CollectionsKt.AuCTelauCTel(listRcXXUw)) == null) ? j : interfaceC9731bbC.fetchVPNInfo();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(long j, boolean z, @NotNull Continuation<? super Result<? extends InterfaceC9731bbC>> continuation) throws java.lang.Throwable {
        WalletUseCase$getChainMetadata$1 walletUseCase$getChainMetadata$1;
        if (continuation instanceof WalletUseCase$getChainMetadata$1) {
            walletUseCase$getChainMetadata$1 = (WalletUseCase$getChainMetadata$1) continuation;
            int i = walletUseCase$getChainMetadata$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletUseCase$getChainMetadata$1.label = i - Integer.MIN_VALUE;
            } else {
                walletUseCase$getChainMetadata$1 = new WalletUseCase$getChainMetadata$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletUseCase$getChainMetadata$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletUseCase$getChainMetadata$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            WalletUseCase$getChainMetadata0E7RQCE$$inlined$dexRunCatching$1 walletUseCase$getChainMetadata0E7RQCE$$inlined$dexRunCatching$1 = new WalletUseCase$getChainMetadata0E7RQCE$$inlined$dexRunCatching$1(null, this, j, z);
            walletUseCase$getChainMetadata$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, walletUseCase$getChainMetadata0E7RQCE$$inlined$dexRunCatching$1, walletUseCase$getChainMetadata$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(long j, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        WalletUseCase$getNetworkFromChainId$1 walletUseCase$getNetworkFromChainId$1;
        if (continuation instanceof WalletUseCase$getNetworkFromChainId$1) {
            walletUseCase$getNetworkFromChainId$1 = (WalletUseCase$getNetworkFromChainId$1) continuation;
            int i = walletUseCase$getNetworkFromChainId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletUseCase$getNetworkFromChainId$1.label = i - Integer.MIN_VALUE;
            } else {
                walletUseCase$getNetworkFromChainId$1 = new WalletUseCase$getNetworkFromChainId$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletUseCase$getNetworkFromChainId$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletUseCase$getNetworkFromChainId$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            WalletUseCase$getNetworkFromChainIdgIAlus$$inlined$dexRunCatching$1 walletUseCase$getNetworkFromChainIdgIAlus$$inlined$dexRunCatching$1 = new WalletUseCase$getNetworkFromChainIdgIAlus$$inlined$dexRunCatching$1(null, j);
            walletUseCase$getNetworkFromChainId$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, walletUseCase$getNetworkFromChainIdgIAlus$$inlined$dexRunCatching$1, walletUseCase$getNetworkFromChainId$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(long j, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        WalletUseCase$getWalletAddress$1 walletUseCase$getWalletAddress$1;
        if (continuation instanceof WalletUseCase$getWalletAddress$1) {
            walletUseCase$getWalletAddress$1 = (WalletUseCase$getWalletAddress$1) continuation;
            int i = walletUseCase$getWalletAddress$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletUseCase$getWalletAddress$1.label = i - Integer.MIN_VALUE;
            } else {
                walletUseCase$getWalletAddress$1 = new WalletUseCase$getWalletAddress$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletUseCase$getWalletAddress$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletUseCase$getWalletAddress$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            WalletUseCase$getWalletAddressgIAlus$$inlined$dexRunCatching$1 walletUseCase$getWalletAddressgIAlus$$inlined$dexRunCatching$1 = new WalletUseCase$getWalletAddressgIAlus$$inlined$dexRunCatching$1(null, this, j);
            walletUseCase$getWalletAddress$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, walletUseCase$getWalletAddressgIAlus$$inlined$dexRunCatching$1, walletUseCase$getWalletAddress$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public static /* synthetic */ java.lang.String getWalletAddressByType$default(kKG kkg, InterfaceC9738bbJ interfaceC9738bbJ, java.lang.String str, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        return kkg.AEQbTJ(interfaceC9738bbJ, str, num);
    }

    public final java.lang.String AEQbTJ(InterfaceC9738bbJ interfaceC9738bbJ, @NotNull java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        if (interfaceC9738bbJ == null) {
            return "";
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0") && num != null) {
            java.lang.String strCopydefault = interfaceC9738bbJ.copydefault(C33129mqd.valueOf(str), num.intValue());
            return strCopydefault == null ? interfaceC9738bbJ.EZpvd(C33129mqd.valueOf(str)) : strCopydefault;
        }
        return interfaceC9738bbJ.EZpvd(C33129mqd.valueOf(str));
    }

    public final boolean AYXKKw() {
        return this.OLrzqt.AEQbTJ();
    }

    public final InterfaceC9740bbL KWHzl() {
        return this.OLrzqt.KWHzl();
    }

    public final java.lang.String copydefault() {
        java.lang.String strEZpvd;
        InterfaceC9738bbJ interfaceC9738bbJValueOf = valueOf();
        if (interfaceC9738bbJValueOf != null) {
            strEZpvd = EZpvd(interfaceC9738bbJValueOf, C33129mqd.gEmmrt(java.lang.Long.valueOf(interfaceC9738bbJValueOf.AubY() ? 1L : ((InterfaceC9731bbC) CollectionsKt___CollectionsKt.AuCTelauCTel(interfaceC9738bbJValueOf.RcXXUw())).fetchVPNInfo())));
        } else {
            strEZpvd = null;
        }
        return strEZpvd == null ? "" : strEZpvd;
    }

    public final AbstractC58260yxt<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> KWHzl(@NotNull SignDataArgs<?> signDataArgs) {
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        return this.OLrzqt.KWHzl(signDataArgs);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kKG */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbstractC58260yxt buildContractTransaction$default(kKG kkg, DappInteractionArgs dappInteractionArgs, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return kkg.AEQbTJ(dappInteractionArgs, (Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>>) function1);
    }

    public final AbstractC58260yxt<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> AEQbTJ(@NotNull DappInteractionArgs dappInteractionArgs, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1) {
        Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
        return this.OLrzqt.EZpvd(dappInteractionArgs, function1);
    }

    public final boolean copydefault(InterfaceC9738bbJ interfaceC9738bbJ, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.OLrzqt.EZpvd(interfaceC9738bbJ, str);
    }

    public final AbstractC58185ywX<java.util.ArrayList<WalletDexService.SupportedMevNodeBean>> AEQbTJ() {
        return ((WalletDexService) C43248rlh.KWHzl.AEQbTJ(WalletDexService.class)).OLrzqt();
    }

    public static /* synthetic */ AccountInfo buildAccountInfo$default(kKG kkg, boolean z, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        return kkg.copydefault(z, bool);
    }

    public final AccountInfo copydefault(boolean z, java.lang.Boolean bool) {
        boolean fieldNames;
        InterfaceC9738bbJ interfaceC9738bbJValueOf = valueOf();
        if (z) {
            java.lang.String strEjfBZ = interfaceC9738bbJValueOf != null ? interfaceC9738bbJValueOf.ejfBZ() : null;
            if (bool != null) {
                fieldNames = bool.booleanValue();
            } else {
                fieldNames = C22416heu.getFieldNames();
            }
            return new AccountInfo(strEjfBZ, 1, java.lang.Boolean.valueOf(fieldNames), OLrzqt());
        }
        return new AccountInfo((java.lang.String) null, (java.lang.Integer) 2, bool, OLrzqt(), 1, (DefaultConstructorMarker) null);
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).AhwBna().AEQbTJ(str, j);
    }

    public final boolean AhwBna() {
        InterfaceC9738bbJ interfaceC9738bbJValueOf = valueOf();
        return interfaceC9738bbJValueOf != null && interfaceC9738bbJValueOf.DTwDnp() && ((dTQ) C43251rlk.copydefault(dTQ.class)).OLrzqt(interfaceC9738bbJValueOf.DbNXlk());
    }
}
