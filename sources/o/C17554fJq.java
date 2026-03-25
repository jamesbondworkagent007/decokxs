package o;

import com.okinc.business.defi.wallet.passkey.cedefi.create.usecase.CreatePasskeyAccountUseCase$invoke$1;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyAccountData;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fJq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C17554fJq {
    public final C13934dbu copydefault;

    public C17554fJq(@NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.copydefault = c13934dbu;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Result<PasskeyAccountData>> continuation) {
        CreatePasskeyAccountUseCase$invoke$1 createPasskeyAccountUseCase$invoke$1;
        if (continuation instanceof CreatePasskeyAccountUseCase$invoke$1) {
            createPasskeyAccountUseCase$invoke$1 = (CreatePasskeyAccountUseCase$invoke$1) continuation;
            int i = createPasskeyAccountUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createPasskeyAccountUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                createPasskeyAccountUseCase$invoke$1 = new CreatePasskeyAccountUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = createPasskeyAccountUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = createPasskeyAccountUseCase$invoke$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C13934dbu c13934dbu = this.copydefault;
        createPasskeyAccountUseCase$invoke$1.label = 1;
        java.lang.Object objOLrzqt = c13934dbu.OLrzqt(createPasskeyAccountUseCase$invoke$1);
        return objOLrzqt == objCopydefault ? objCopydefault : objOLrzqt;
    }
}
