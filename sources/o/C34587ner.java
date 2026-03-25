package o;

import com.okinc.dexkline.market.wallet.domain.usecase.KlineWalletUseCase$ensureInitForTradeDex$2;
import com.okinc.dexkline.market.wallet.domain.usecase.KlineWalletUseCase$isEvmChain$1;
import com.okinc.dexkline.market.wallet.domain.usecase.KlineWalletUseCase$isWalletExist$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ner, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@yCR
public final class C34587ner {
    public final InterfaceC34581nel AEQbTJ;
    public InterfaceC54572xNi KWHzl;
    public final java.lang.String OLrzqt;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C34587ner(@NotNull InterfaceC34581nel interfaceC34581nel, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC34581nel, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = interfaceC34581nel;
        this.copydefault = coroutineDispatcher;
        this.OLrzqt = "KlineWalletUseCase";
    }

    public final java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(this.copydefault, new KlineWalletUseCase$ensureInitForTradeDex$2(this, null), continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(this.copydefault, new KlineWalletUseCase$isWalletExist$2(null), continuation);
    }

    public final java.lang.String AEQbTJ() {
        java.lang.String strKWHzl;
        InterfaceC54572xNi interfaceC54572xNi = this.KWHzl;
        return (interfaceC54572xNi == null || (strKWHzl = interfaceC54572xNi.KWHzl()) == null) ? "" : strKWHzl;
    }

    public final InterfaceC9738bbJ KWHzl() {
        return this.AEQbTJ.AEQbTJ();
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        java.lang.String strOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54572xNi interfaceC54572xNi = this.KWHzl;
        return (interfaceC54572xNi == null || (strOLrzqt = interfaceC54572xNi.OLrzqt(str)) == null) ? "" : strOLrzqt;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        KlineWalletUseCase$isEvmChain$1 klineWalletUseCase$isEvmChain$1;
        if (continuation instanceof KlineWalletUseCase$isEvmChain$1) {
            klineWalletUseCase$isEvmChain$1 = (KlineWalletUseCase$isEvmChain$1) continuation;
            int i = klineWalletUseCase$isEvmChain$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                klineWalletUseCase$isEvmChain$1.label = i - Integer.MIN_VALUE;
            } else {
                klineWalletUseCase$isEvmChain$1 = new KlineWalletUseCase$isEvmChain$1(this, continuation);
            }
        }
        java.lang.Object obj = klineWalletUseCase$isEvmChain$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = klineWalletUseCase$isEvmChain$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        InterfaceC34581nel interfaceC34581nel = this.AEQbTJ;
        klineWalletUseCase$isEvmChain$1.label = 1;
        java.lang.Object objEZpvd = interfaceC34581nel.EZpvd(str, klineWalletUseCase$isEvmChain$1);
        return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
    }

    public final java.lang.String copydefault(InterfaceC9738bbJ interfaceC9738bbJ, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return KWHzl(str);
    }
}
