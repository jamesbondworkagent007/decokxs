package o;

import com.okinc.dexkline.market.features.address_tracker.domain.GetTrackingAddressAliasUseCase$invoke$1;
import com.okinc.dexkline.market.features.address_tracker.domain.GetTrackingAddressAliasUseCase$invokegIAlus$$inlined$dexRunCatching$1;
import com.okinc.dexkline.market.features.address_tracker.domain.TrackingAddressAlias;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mVO {
    public final CoroutineDispatcher EZpvd;
    public final mVV KWHzl;

    @yCM
    public mVO(@NotNull mVV mvv, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(mvv, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = mvv;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super Result<? extends java.util.List<TrackingAddressAlias>>> continuation) throws java.lang.Throwable {
        GetTrackingAddressAliasUseCase$invoke$1 getTrackingAddressAliasUseCase$invoke$1;
        if (continuation instanceof GetTrackingAddressAliasUseCase$invoke$1) {
            getTrackingAddressAliasUseCase$invoke$1 = (GetTrackingAddressAliasUseCase$invoke$1) continuation;
            int i = getTrackingAddressAliasUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getTrackingAddressAliasUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getTrackingAddressAliasUseCase$invoke$1 = new GetTrackingAddressAliasUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getTrackingAddressAliasUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getTrackingAddressAliasUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            GetTrackingAddressAliasUseCase$invokegIAlus$$inlined$dexRunCatching$1 getTrackingAddressAliasUseCase$invokegIAlus$$inlined$dexRunCatching$1 = new GetTrackingAddressAliasUseCase$invokegIAlus$$inlined$dexRunCatching$1(null, this, str);
            getTrackingAddressAliasUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getTrackingAddressAliasUseCase$invokegIAlus$$inlined$dexRunCatching$1, getTrackingAddressAliasUseCase$invoke$1);
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
