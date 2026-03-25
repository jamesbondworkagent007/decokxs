package o;

import com.okinc.business.market.data.model.TrackingAddressData;
import com.okinc.business.market.features.address_tracker.domain.MapTrackingAddressUseCase$map$1;
import com.okinc.business.market.features.address_tracker.domain.MapTrackingAddressUseCase$mapgIAlus$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jAN {
    public final CoroutineDispatcher AEQbTJ;
    public final C29712kyn KWHzl;
    public final C27634jyr copydefault;

    @yCM
    public jAN(@NotNull C29712kyn c29712kyn, @NotNull C27634jyr c27634jyr, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c29712kyn, "");
        Intrinsics.checkNotNullParameter(c27634jyr, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = c29712kyn;
        this.copydefault = c27634jyr;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull TrackingAddressData trackingAddressData, @NotNull Continuation<? super Result<jAZ>> continuation) throws java.lang.Throwable {
        MapTrackingAddressUseCase$map$1 mapTrackingAddressUseCase$map$1;
        if (continuation instanceof MapTrackingAddressUseCase$map$1) {
            mapTrackingAddressUseCase$map$1 = (MapTrackingAddressUseCase$map$1) continuation;
            int i = mapTrackingAddressUseCase$map$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mapTrackingAddressUseCase$map$1.label = i - Integer.MIN_VALUE;
            } else {
                mapTrackingAddressUseCase$map$1 = new MapTrackingAddressUseCase$map$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = mapTrackingAddressUseCase$map$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = mapTrackingAddressUseCase$map$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            MapTrackingAddressUseCase$mapgIAlus$$inlined$dexRunCatching$1 mapTrackingAddressUseCase$mapgIAlus$$inlined$dexRunCatching$1 = new MapTrackingAddressUseCase$mapgIAlus$$inlined$dexRunCatching$1(null, trackingAddressData, this);
            mapTrackingAddressUseCase$map$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, mapTrackingAddressUseCase$mapgIAlus$$inlined$dexRunCatching$1, mapTrackingAddressUseCase$map$1);
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
