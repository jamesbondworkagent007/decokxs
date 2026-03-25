package o;

import com.okinc.dexkline.market.wallet.data.repository.DexWalletRepositoryImpl$isEvmChain$1;
import com.okinc.dexkline.market.wallet.data.repository.DexWalletRepositoryImpl$isEvmChaingIAlus$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nek, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34580nek implements InterfaceC34581nel {
    public final CoroutineDispatcher OLrzqt;
    public final InterfaceC9852bdR copydefault;

    @yCM
    public C34580nek(@NotNull InterfaceC9852bdR interfaceC9852bdR, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC9852bdR, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC9852bdR;
        this.OLrzqt = coroutineDispatcher;
    }

    @Override // o.InterfaceC34581nel
    public InterfaceC9738bbJ AEQbTJ() {
        return (InterfaceC9738bbJ) CollectionsKt___CollectionsKt.AkhnZx(this.copydefault.gEmmrt().copydefault(), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC34581nel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
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
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
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
}
