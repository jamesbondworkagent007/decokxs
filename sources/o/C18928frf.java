package o;

import com.okinc.business.defi.wallet.mine.search.banner.domain.usecase.WalletBannerEventUseCase$invoke$1;
import com.okinc.business.defi.wallet.mine.search.banner.domain.usecase.WalletBannerEventUseCase$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.frf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18928frf {
    public final InterfaceC18926frd copydefault;

    @yCM
    public C18928frf(@NotNull InterfaceC18926frd interfaceC18926frd) {
        Intrinsics.checkNotNullParameter(interfaceC18926frd, "");
        this.copydefault = interfaceC18926frd;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull Continuation<? super Result<? extends java.util.List<C18927fre>>> continuation) throws java.lang.Throwable {
        WalletBannerEventUseCase$invoke$1 walletBannerEventUseCase$invoke$1;
        if (continuation instanceof WalletBannerEventUseCase$invoke$1) {
            walletBannerEventUseCase$invoke$1 = (WalletBannerEventUseCase$invoke$1) continuation;
            int i = walletBannerEventUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletBannerEventUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                walletBannerEventUseCase$invoke$1 = new WalletBannerEventUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = walletBannerEventUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletBannerEventUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            WalletBannerEventUseCase$invoke$2 walletBannerEventUseCase$invoke$2 = new WalletBannerEventUseCase$invoke$2(this, null);
            walletBannerEventUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(io2, walletBannerEventUseCase$invoke$2, walletBannerEventUseCase$invoke$1);
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
