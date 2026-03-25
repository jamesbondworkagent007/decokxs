package o;

import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeListDataResp;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.domain.usecase.GetEscapeListUseCase$invoke$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fJS {
    public final C13934dbu EZpvd;

    @yCM
    public fJS(@NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.EZpvd = c13934dbu;
    }

    /* JADX INFO: renamed from: invoke-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8600invoke0E7RQCE$default(fJS fjs, int i, java.lang.String str, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 20;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return fjs.EZpvd(i, str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(int i, java.lang.String str, @NotNull Continuation<? super Result<EscapeListDataResp>> continuation) throws java.lang.Throwable {
        GetEscapeListUseCase$invoke$1 getEscapeListUseCase$invoke$1;
        if (continuation instanceof GetEscapeListUseCase$invoke$1) {
            getEscapeListUseCase$invoke$1 = (GetEscapeListUseCase$invoke$1) continuation;
            int i2 = getEscapeListUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getEscapeListUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                getEscapeListUseCase$invoke$1 = new GetEscapeListUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = getEscapeListUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = getEscapeListUseCase$invoke$1.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C13934dbu c13934dbu = this.EZpvd;
        getEscapeListUseCase$invoke$1.label = 1;
        java.lang.Object objKWHzl = c13934dbu.KWHzl(i, str, getEscapeListUseCase$invoke$1);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }
}
