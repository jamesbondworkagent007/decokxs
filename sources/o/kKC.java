package o;

import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.market.wallet.data.repository.DexWalletRepositoryImpl$getMetaManager$1;
import com.okinc.business.market.wallet.data.repository.DexWalletRepositoryImpl$getMetaManagerIoAF18A$$inlined$dexRunCatching$1;
import com.okinc.business.market.wallet.data.repository.DexWalletRepositoryImpl$isEvmChain$1;
import com.okinc.business.market.wallet.data.repository.DexWalletRepositoryImpl$isEvmChaingIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.wallet.data.repository.DexWalletRepositoryImpl$isWalletExist$1;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.InterfaceC9737bbI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kKC implements kKD {
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC9852bdR KWHzl;

    @yCM
    public kKC(@NotNull InterfaceC9852bdR interfaceC9852bdR, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC9852bdR, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC9852bdR;
        this.AEQbTJ = coroutineDispatcher;
    }

    @Override // o.kKD
    public Flow<InterfaceC9738bbJ> OLrzqt() {
        return C6953aZB.EZpvd(this.KWHzl.gEmmrt().KWHzl());
    }

    @Override // o.kKD
    public Flow<java.lang.Boolean> AYXKKw() {
        return FlowKt.m7441catch(C6953aZB.copydefault(this.KWHzl.gEmmrt().OLrzqt(false)), new DexWalletRepositoryImpl$isWalletExist$1(null));
    }

    @Override // o.kKD
    public java.lang.String copydefault() {
        return this.KWHzl.djBIcL();
    }

    @Override // o.kKD
    public InterfaceC9738bbJ EZpvd() {
        return (InterfaceC9738bbJ) CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl.gEmmrt().copydefault(), 0);
    }

    @Override // o.kKD
    public InterfaceC9731bbC OLrzqt(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return InterfaceC9737bbI.Application.getTokenWithContractAddressAndChainId$default(this.KWHzl.copydefault(), str, j, false, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.kKD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Continuation<? super Result<? extends InterfaceC9737bbI>> continuation) throws java.lang.Throwable {
        DexWalletRepositoryImpl$getMetaManager$1 dexWalletRepositoryImpl$getMetaManager$1;
        if (continuation instanceof DexWalletRepositoryImpl$getMetaManager$1) {
            dexWalletRepositoryImpl$getMetaManager$1 = (DexWalletRepositoryImpl$getMetaManager$1) continuation;
            int i = dexWalletRepositoryImpl$getMetaManager$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dexWalletRepositoryImpl$getMetaManager$1.label = i - Integer.MIN_VALUE;
            } else {
                dexWalletRepositoryImpl$getMetaManager$1 = new DexWalletRepositoryImpl$getMetaManager$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = dexWalletRepositoryImpl$getMetaManager$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dexWalletRepositoryImpl$getMetaManager$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            DexWalletRepositoryImpl$getMetaManagerIoAF18A$$inlined$dexRunCatching$1 dexWalletRepositoryImpl$getMetaManagerIoAF18A$$inlined$dexRunCatching$1 = new DexWalletRepositoryImpl$getMetaManagerIoAF18A$$inlined$dexRunCatching$1(null, this);
            dexWalletRepositoryImpl$getMetaManager$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, dexWalletRepositoryImpl$getMetaManagerIoAF18A$$inlined$dexRunCatching$1, dexWalletRepositoryImpl$getMetaManager$1);
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

    @Override // o.kKD
    public boolean AEQbTJ() {
        InterfaceC9738bbJ interfaceC9738bbJEZpvd = EZpvd();
        if (interfaceC9738bbJEZpvd != null) {
            return interfaceC9738bbJEZpvd.zLjUOn();
        }
        return true;
    }

    @Override // o.kKD
    public InterfaceC9740bbL KWHzl() {
        return this.KWHzl.AEQbTJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.kKD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        DexWalletRepositoryImpl$isEvmChain$1 dexWalletRepositoryImpl$isEvmChain$1;
        if (continuation instanceof DexWalletRepositoryImpl$isEvmChain$1) {
            dexWalletRepositoryImpl$isEvmChain$1 = (DexWalletRepositoryImpl$isEvmChain$1) continuation;
            int i = dexWalletRepositoryImpl$isEvmChain$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dexWalletRepositoryImpl$isEvmChain$1.label = i - Integer.MIN_VALUE;
            } else {
                dexWalletRepositoryImpl$isEvmChain$1 = new DexWalletRepositoryImpl$isEvmChain$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = dexWalletRepositoryImpl$isEvmChain$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dexWalletRepositoryImpl$isEvmChain$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            DexWalletRepositoryImpl$isEvmChaingIAlus$$inlined$dexRunCatching$1 dexWalletRepositoryImpl$isEvmChaingIAlus$$inlined$dexRunCatching$1 = new DexWalletRepositoryImpl$isEvmChaingIAlus$$inlined$dexRunCatching$1(null, this, str);
            dexWalletRepositoryImpl$isEvmChain$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, dexWalletRepositoryImpl$isEvmChaingIAlus$$inlined$dexRunCatching$1, dexWalletRepositoryImpl$isEvmChain$1);
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

    @Override // o.kKD
    public boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC9731bbC interfaceC9731bbCCopydefault = this.KWHzl.KWHzl().copydefault(C33129mqd.valueOf(str));
        if (interfaceC9731bbCCopydefault != null) {
            return interfaceC9731bbCCopydefault.ejfBZ();
        }
        return false;
    }

    @Override // o.kKD
    public AbstractC58260yxt<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> KWHzl(@NotNull SignDataArgs<?> signDataArgs) {
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        return KWHzl().EZpvd(signDataArgs);
    }

    @Override // o.kKD
    public AbstractC58260yxt<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> EZpvd(@NotNull DappInteractionArgs dappInteractionArgs, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1) {
        Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
        return KWHzl().OLrzqt(dappInteractionArgs, function1);
    }

    @Override // o.kKD
    public boolean EZpvd(InterfaceC9738bbJ interfaceC9738bbJ, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return interfaceC9738bbJ != null && interfaceC9738bbJ.gEmmrt(C33129mqd.valueOf(str)) && interfaceC9738bbJ.djSkpj();
    }
}
