package o;

import com.okinc.business.defi.wallet.tee.common.usecase.AddressVerifyUseCase$invoke$1;
import com.okinc.business.defi.wallet.tee.common.usecase.AddressVerifyUseCase$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fTS {
    public final C13058cyg EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final C13934dbu OLrzqt;

    @yCM
    public fTS(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C13934dbu c13934dbu, @NotNull C13058cyg c13058cyg) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(c13058cyg, "");
        this.KWHzl = coroutineDispatcher;
        this.OLrzqt = c13934dbu;
        this.EZpvd = c13058cyg;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull java.lang.String str, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        AddressVerifyUseCase$invoke$1 addressVerifyUseCase$invoke$1;
        if (continuation instanceof AddressVerifyUseCase$invoke$1) {
            addressVerifyUseCase$invoke$1 = (AddressVerifyUseCase$invoke$1) continuation;
            int i = addressVerifyUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                addressVerifyUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                addressVerifyUseCase$invoke$1 = new AddressVerifyUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = addressVerifyUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = addressVerifyUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            AddressVerifyUseCase$invoke$2 addressVerifyUseCase$invoke$2 = new AddressVerifyUseCase$invoke$2(abstractC12782ctV, str, this, null);
            addressVerifyUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, addressVerifyUseCase$invoke$2, addressVerifyUseCase$invoke$1);
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
