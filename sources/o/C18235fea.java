package o;

import com.okinc.business.defi.wallet.home.usdgActivity.data.model.AddressRegisterBean;
import com.okinc.business.defi.wallet.home.usdgActivity.domain.usecase.RegisterActivityAddressUseCase$invoke$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18235fea {
    public final C18174fdS KWHzl;

    @yCM
    public C18235fea(@NotNull C18174fdS c18174fdS) {
        Intrinsics.checkNotNullParameter(c18174fdS, "");
        this.KWHzl = c18174fdS;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull C18179fdX c18179fdX, @NotNull Continuation<? super Result<C18176fdU>> continuation) {
        RegisterActivityAddressUseCase$invoke$1 registerActivityAddressUseCase$invoke$1;
        if (continuation instanceof RegisterActivityAddressUseCase$invoke$1) {
            registerActivityAddressUseCase$invoke$1 = (RegisterActivityAddressUseCase$invoke$1) continuation;
            int i = registerActivityAddressUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                registerActivityAddressUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                registerActivityAddressUseCase$invoke$1 = new RegisterActivityAddressUseCase$invoke$1(this, continuation);
            }
        }
        RegisterActivityAddressUseCase$invoke$1 registerActivityAddressUseCase$invoke$12 = registerActivityAddressUseCase$invoke$1;
        java.lang.Object obj = registerActivityAddressUseCase$invoke$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = registerActivityAddressUseCase$invoke$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C18174fdS c18174fdS = this.KWHzl;
        java.lang.String strAEQbTJ = c18179fdX.AEQbTJ();
        long jOLrzqt = c18179fdX.OLrzqt();
        java.util.List<AddressRegisterBean> listEZpvd = c18179fdX.EZpvd();
        registerActivityAddressUseCase$invoke$12.label = 1;
        java.lang.Object objOLrzqt = c18174fdS.OLrzqt(strAEQbTJ, jOLrzqt, listEZpvd, registerActivityAddressUseCase$invoke$12);
        return objOLrzqt == objCopydefault ? objCopydefault : objOLrzqt;
    }
}
