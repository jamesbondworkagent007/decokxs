package o;

import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeDetailDataResp;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.domain.usecase.GetEscapeStatusUseCase$invoke$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fJR {
    public final C13934dbu AEQbTJ;

    @yCM
    public fJR(@NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.AEQbTJ = c13934dbu;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(int i, java.lang.String str, @NotNull Continuation<? super Result<EscapeDetailDataResp>> continuation) {
        GetEscapeStatusUseCase$invoke$1 getEscapeStatusUseCase$invoke$1;
        if (continuation instanceof GetEscapeStatusUseCase$invoke$1) {
            getEscapeStatusUseCase$invoke$1 = (GetEscapeStatusUseCase$invoke$1) continuation;
            int i2 = getEscapeStatusUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getEscapeStatusUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                getEscapeStatusUseCase$invoke$1 = new GetEscapeStatusUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = getEscapeStatusUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = getEscapeStatusUseCase$invoke$1.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C13934dbu c13934dbu = this.AEQbTJ;
        getEscapeStatusUseCase$invoke$1.label = 1;
        java.lang.Object objOLrzqt = c13934dbu.OLrzqt(i, str, (Continuation<? super Result<EscapeDetailDataResp>>) getEscapeStatusUseCase$invoke$1);
        return objOLrzqt == objCopydefault ? objCopydefault : objOLrzqt;
    }
}
