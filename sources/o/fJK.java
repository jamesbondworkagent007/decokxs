package o;

import com.okinc.business.defi.api.bean.passkeywallet.cedefi.BindEmailData;
import com.okinc.business.defi.wallet.passkey.cedefi.email.usecase.UpdateEmailUseCase$invoke$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class fJK {
    public final C13934dbu KWHzl;

    public fJK(@NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.KWHzl = c13934dbu;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(int i, @NotNull Continuation<? super Result<BindEmailData>> continuation) {
        UpdateEmailUseCase$invoke$1 updateEmailUseCase$invoke$1;
        if (continuation instanceof UpdateEmailUseCase$invoke$1) {
            updateEmailUseCase$invoke$1 = (UpdateEmailUseCase$invoke$1) continuation;
            int i2 = updateEmailUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateEmailUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                updateEmailUseCase$invoke$1 = new UpdateEmailUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = updateEmailUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = updateEmailUseCase$invoke$1.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C13934dbu c13934dbu = this.KWHzl;
        updateEmailUseCase$invoke$1.label = 1;
        java.lang.Object objOLrzqt = c13934dbu.OLrzqt(i, (Continuation<? super Result<BindEmailData>>) updateEmailUseCase$invoke$1);
        return objOLrzqt == objCopydefault ? objCopydefault : objOLrzqt;
    }
}
