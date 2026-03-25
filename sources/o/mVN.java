package o;

import com.okinc.dexkline.market.features.address_tracker.domain.GetTrackingAddressListUseCase$getAllTrackingAddresses$1;
import com.okinc.dexkline.market.features.address_tracker.domain.GetTrackingAddressListUseCase$getAllTrackingAddressesgIAlus$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mVN {
    public final CoroutineDispatcher AEQbTJ;
    public final mVV OLrzqt;

    @yCM
    public mVN(@NotNull mVV mvv, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(mvv, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = mvv;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super Result<? extends java.util.List<java.lang.String>>> continuation) throws java.lang.Throwable {
        GetTrackingAddressListUseCase$getAllTrackingAddresses$1 getTrackingAddressListUseCase$getAllTrackingAddresses$1;
        if (continuation instanceof GetTrackingAddressListUseCase$getAllTrackingAddresses$1) {
            getTrackingAddressListUseCase$getAllTrackingAddresses$1 = (GetTrackingAddressListUseCase$getAllTrackingAddresses$1) continuation;
            int i = getTrackingAddressListUseCase$getAllTrackingAddresses$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getTrackingAddressListUseCase$getAllTrackingAddresses$1.label = i - Integer.MIN_VALUE;
            } else {
                getTrackingAddressListUseCase$getAllTrackingAddresses$1 = new GetTrackingAddressListUseCase$getAllTrackingAddresses$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getTrackingAddressListUseCase$getAllTrackingAddresses$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getTrackingAddressListUseCase$getAllTrackingAddresses$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            GetTrackingAddressListUseCase$getAllTrackingAddressesgIAlus$$inlined$dexRunCatching$1 getTrackingAddressListUseCase$getAllTrackingAddressesgIAlus$$inlined$dexRunCatching$1 = new GetTrackingAddressListUseCase$getAllTrackingAddressesgIAlus$$inlined$dexRunCatching$1(null, this, str);
            getTrackingAddressListUseCase$getAllTrackingAddresses$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getTrackingAddressListUseCase$getAllTrackingAddressesgIAlus$$inlined$dexRunCatching$1, getTrackingAddressListUseCase$getAllTrackingAddresses$1);
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
