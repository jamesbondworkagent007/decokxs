package o;

import com.okinc.business.defi.wallet.home.addressDetail.domain.usecase.WalletSharePnlTokenUseCase$invoke$1;
import com.okinc.business.defi.wallet.home.addressDetail.domain.usecase.WalletSharePnlTokenUseCase$invoke$2;
import com.okinc.business.defi.wallet.home.addressDetail.utils.WalletTokenPnlShareInfo;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eXe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15839eXe {
    public final eWV EZpvd;
    public final eWZ KWHzl;

    @yCM
    public C15839eXe(@NotNull eWZ ewz, @NotNull eWV ewv) {
        Intrinsics.checkNotNullParameter(ewz, "");
        Intrinsics.checkNotNullParameter(ewv, "");
        this.KWHzl = ewz;
        this.EZpvd = ewv;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Continuation<? super Result<WalletTokenPnlShareInfo>> continuation) {
        WalletSharePnlTokenUseCase$invoke$1 walletSharePnlTokenUseCase$invoke$1;
        if (continuation instanceof WalletSharePnlTokenUseCase$invoke$1) {
            walletSharePnlTokenUseCase$invoke$1 = (WalletSharePnlTokenUseCase$invoke$1) continuation;
            int i = walletSharePnlTokenUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSharePnlTokenUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSharePnlTokenUseCase$invoke$1 = new WalletSharePnlTokenUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objSupervisorScope = walletSharePnlTokenUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletSharePnlTokenUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objSupervisorScope);
            WalletSharePnlTokenUseCase$invoke$2 walletSharePnlTokenUseCase$invoke$2 = new WalletSharePnlTokenUseCase$invoke$2(str, str4, this, str2, str3, null);
            walletSharePnlTokenUseCase$invoke$1.label = 1;
            objSupervisorScope = SupervisorKt.supervisorScope(walletSharePnlTokenUseCase$invoke$2, walletSharePnlTokenUseCase$invoke$1);
            if (objSupervisorScope == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objSupervisorScope);
        }
        return ((Result) objSupervisorScope).m7386unboximpl();
    }
}
