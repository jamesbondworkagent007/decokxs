package o;

import com.okinc.business.market.data.model.position_pnl.AddressLoginRequest;
import com.okinc.business.market.features.jwt.domain.AddressLoginUseCase$login$1;
import com.okinc.business.market.features.jwt.domain.AddressLoginUseCase$logingIAlus$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kdj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28595kdj {
    public final InterfaceC27595jyE AEQbTJ;
    public final C27612jyV EZpvd;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C28595kdj(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull C27612jyV c27612jyV, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(c27612jyV, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = interfaceC27595jyE;
        this.EZpvd = c27612jyV;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(AddressLoginRequest addressLoginRequest, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        AddressLoginUseCase$login$1 addressLoginUseCase$login$1;
        if (continuation instanceof AddressLoginUseCase$login$1) {
            addressLoginUseCase$login$1 = (AddressLoginUseCase$login$1) continuation;
            int i = addressLoginUseCase$login$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                addressLoginUseCase$login$1.label = i - Integer.MIN_VALUE;
            } else {
                addressLoginUseCase$login$1 = new AddressLoginUseCase$login$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = addressLoginUseCase$login$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = addressLoginUseCase$login$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            AddressLoginUseCase$logingIAlus$$inlined$dexRunCatching$1 addressLoginUseCase$logingIAlus$$inlined$dexRunCatching$1 = new AddressLoginUseCase$logingIAlus$$inlined$dexRunCatching$1(null, this, addressLoginRequest);
            addressLoginUseCase$login$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, addressLoginUseCase$logingIAlus$$inlined$dexRunCatching$1, addressLoginUseCase$login$1);
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
