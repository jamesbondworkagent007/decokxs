package o;

import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedWalletUseCase$buildAccountInfo$2;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedWalletUseCase$checkWallet$2;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedWalletUseCase$getAccountId$2;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedWalletUseCase$getEncryptSign$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedWalletUseCase$getEncryptSign$2;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedWalletUseCase$getMainWallet$2;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedWalletUseCase$getUserUniqueId$2;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedWalletUseCase$getWalletAddressByChain$2;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedWalletUseCase$getWatchlistWalletAddress$2;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedWalletUseCase$isChainSupported$2;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedWalletUseCase$needBackup$2;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedWalletUseCase$showRechargeDialog$2;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedWalletUseCase$walletExists$2;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.WalletDexService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import o.InterfaceC9737bbI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kSl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28196kSl {
    public final kTW AEQbTJ;
    public final kKD OLrzqt;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C28196kSl(@NotNull kKD kkd, @NotNull kTW ktw, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(kkd, "");
        Intrinsics.checkNotNullParameter(ktw, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = kkd;
        this.AEQbTJ = ktw;
        this.copydefault = coroutineDispatcher;
    }

    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(this.copydefault, new AdvancedWalletUseCase$walletExists$2(this, null), continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull Continuation<? super java.lang.String> continuation) {
        return BuildersKt.withContext(this.copydefault, new AdvancedWalletUseCase$getAccountId$2(this, null), continuation);
    }

    public final java.lang.Object copydefault(@NotNull Continuation<? super java.lang.String> continuation) {
        return BuildersKt.withContext(this.copydefault, new AdvancedWalletUseCase$getUserUniqueId$2(this, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        AdvancedWalletUseCase$getEncryptSign$1 advancedWalletUseCase$getEncryptSign$1;
        if (continuation instanceof AdvancedWalletUseCase$getEncryptSign$1) {
            advancedWalletUseCase$getEncryptSign$1 = (AdvancedWalletUseCase$getEncryptSign$1) continuation;
            int i = advancedWalletUseCase$getEncryptSign$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedWalletUseCase$getEncryptSign$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedWalletUseCase$getEncryptSign$1 = new AdvancedWalletUseCase$getEncryptSign$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = advancedWalletUseCase$getEncryptSign$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedWalletUseCase$getEncryptSign$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            AdvancedWalletUseCase$getEncryptSign$2 advancedWalletUseCase$getEncryptSign$2 = new AdvancedWalletUseCase$getEncryptSign$2(this, null);
            advancedWalletUseCase$getEncryptSign$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, advancedWalletUseCase$getEncryptSign$2, advancedWalletUseCase$getEncryptSign$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        Intrinsics.checkNotNullExpressionValue(objWithContext, "");
        return objWithContext;
    }

    public final java.lang.String copydefault() {
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) CollectionsKt___CollectionsKt.AkhnZx(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().copydefault(), 0);
        java.lang.String strDbNXlk = interfaceC9738bbJ != null ? interfaceC9738bbJ.DbNXlk() : null;
        return strDbNXlk == null ? "" : strDbNXlk;
    }

    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.String> continuation) {
        return BuildersKt.withContext(this.copydefault, new AdvancedWalletUseCase$getWatchlistWalletAddress$2(this, str, null), continuation);
    }

    public final java.lang.Object EZpvd(@NotNull Continuation<? super InterfaceC9738bbJ> continuation) {
        return BuildersKt.withContext(this.copydefault, new AdvancedWalletUseCase$getMainWallet$2(this, null), continuation);
    }

    public final java.lang.Object OLrzqt(long j, @NotNull Continuation<? super java.lang.String> continuation) {
        return BuildersKt.withContext(this.copydefault, new AdvancedWalletUseCase$getWalletAddressByChain$2(this, j, null), continuation);
    }

    public final AbstractC58185ywX<java.util.ArrayList<WalletDexService.SupportedMevNodeBean>> AEQbTJ() {
        return ((WalletDexService) C43251rlk.copydefault(WalletDexService.class)).OLrzqt();
    }

    public final AbstractC58260yxt<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> OLrzqt(@NotNull DappInteractionArgs dappInteractionArgs, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1) {
        Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
        return OLrzqt().OLrzqt(dappInteractionArgs, function1);
    }

    public final AbstractC58260yxt<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> KWHzl(@NotNull SignDataArgs<?> signDataArgs) {
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        return OLrzqt().EZpvd(signDataArgs);
    }

    public final java.lang.Object copydefault(java.lang.String str, boolean z, @NotNull Continuation<? super InterfaceC30595leC> continuation) {
        return BuildersKt.withContext(this.copydefault, new AdvancedWalletUseCase$checkWallet$2(this, z, str, null), continuation);
    }

    public final java.lang.Object OLrzqt(AbstractActivityC33041mov abstractActivityC33041mov, @NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getMain(), new AdvancedWalletUseCase$needBackup$2(this, abstractActivityC33041mov, str, null), continuation);
    }

    public final java.lang.Object EZpvd(java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(this.copydefault, new AdvancedWalletUseCase$isChainSupported$2(this, str, null), continuation);
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return InterfaceC9737bbI.Application.getTokenWithContractAddressAndChainId$default(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault(), str, j, false, 4, null) != null;
    }

    public static /* synthetic */ java.lang.Object showRechargeDialog$default(C28196kSl c28196kSl, AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str, java.lang.String str2, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        return c28196kSl.KWHzl(abstractActivityC33041mov, str, str2, z, continuation);
    }

    public final java.lang.Object KWHzl(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new AdvancedWalletUseCase$showRechargeDialog$2(z, abstractActivityC33041mov, str, str2, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public final InterfaceC9740bbL OLrzqt() {
        return ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).AEQbTJ();
    }

    public final java.lang.Object EZpvd(boolean z, @NotNull Continuation<? super AccountInfo> continuation) {
        return BuildersKt.withContext(this.copydefault, new AdvancedWalletUseCase$buildAccountInfo$2(this, z, null), continuation);
    }

    public final void KWHzl() {
        C23263hut c23263hutDjBIcL;
        if (C22416heu.ejfBZ() || (c23263hutDjBIcL = C22380heK.OLrzqt.djBIcL()) == null) {
            return;
        }
        c23263hutDjBIcL.AYXKKw().subWs();
    }

    public final void EZpvd() {
        C23261hur c23261hurCopydefault;
        if (C22416heu.ejfBZ() || (c23261hurCopydefault = C22380heK.OLrzqt.copydefault()) == null) {
            return;
        }
        c23261hurCopydefault.EZpvd().subWs();
    }
}
