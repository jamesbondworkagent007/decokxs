package o;

import com.okinc.business.dex.trade.common.boost.model.BoostEstimateVolumeResponse;
import com.okinc.business.dex.trade.common.boost.usecase.EstimateBoostVolumeUseCase$estimateVolume$1;
import com.okinc.business.dex.trade.common.boost.usecase.EstimateBoostVolumeUseCase$estimateVolumetZkwj4A$$inlined$dexRunCatching$1;
import com.okinc.business.dex.trade.common.boost.usecase.EstimateBoostVolumeUseCase$getLimitOrderBoostInfo$1;
import com.okinc.business.dex.trade.common.boost.usecase.EstimateBoostVolumeUseCase$getLimitOrderBoostInfobMdYcbs$$inlined$dexRunCatching$1;
import com.okinc.business.dex.trade.order.domain.model.BoostInfo;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gOe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19757gOe {
    public final gNX EZpvd;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C19757gOe(@NotNull gNX gnx, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(gnx, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = gnx;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull Continuation<? super Result<BoostEstimateVolumeResponse>> continuation) {
        EstimateBoostVolumeUseCase$estimateVolume$1 estimateBoostVolumeUseCase$estimateVolume$1;
        if (continuation instanceof EstimateBoostVolumeUseCase$estimateVolume$1) {
            estimateBoostVolumeUseCase$estimateVolume$1 = (EstimateBoostVolumeUseCase$estimateVolume$1) continuation;
            int i2 = estimateBoostVolumeUseCase$estimateVolume$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                estimateBoostVolumeUseCase$estimateVolume$1.label = i2 - Integer.MIN_VALUE;
            } else {
                estimateBoostVolumeUseCase$estimateVolume$1 = new EstimateBoostVolumeUseCase$estimateVolume$1(this, continuation);
            }
        }
        EstimateBoostVolumeUseCase$estimateVolume$1 estimateBoostVolumeUseCase$estimateVolume$12 = estimateBoostVolumeUseCase$estimateVolume$1;
        java.lang.Object objWithContext = estimateBoostVolumeUseCase$estimateVolume$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = estimateBoostVolumeUseCase$estimateVolume$12.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            EstimateBoostVolumeUseCase$estimateVolumetZkwj4A$$inlined$dexRunCatching$1 estimateBoostVolumeUseCase$estimateVolumetZkwj4A$$inlined$dexRunCatching$1 = new EstimateBoostVolumeUseCase$estimateVolumetZkwj4A$$inlined$dexRunCatching$1(null, this, i, str, str2, str3, str4, str5, str6, str7);
            estimateBoostVolumeUseCase$estimateVolume$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, estimateBoostVolumeUseCase$estimateVolumetZkwj4A$$inlined$dexRunCatching$1, estimateBoostVolumeUseCase$estimateVolume$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, ServiceFeeInfo serviceFeeInfo, @NotNull Continuation<? super Result<BoostInfo>> continuation) {
        EstimateBoostVolumeUseCase$getLimitOrderBoostInfo$1 estimateBoostVolumeUseCase$getLimitOrderBoostInfo$1;
        if (continuation instanceof EstimateBoostVolumeUseCase$getLimitOrderBoostInfo$1) {
            estimateBoostVolumeUseCase$getLimitOrderBoostInfo$1 = (EstimateBoostVolumeUseCase$getLimitOrderBoostInfo$1) continuation;
            int i2 = estimateBoostVolumeUseCase$getLimitOrderBoostInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                estimateBoostVolumeUseCase$getLimitOrderBoostInfo$1.label = i2 - Integer.MIN_VALUE;
            } else {
                estimateBoostVolumeUseCase$getLimitOrderBoostInfo$1 = new EstimateBoostVolumeUseCase$getLimitOrderBoostInfo$1(this, continuation);
            }
        }
        EstimateBoostVolumeUseCase$getLimitOrderBoostInfo$1 estimateBoostVolumeUseCase$getLimitOrderBoostInfo$12 = estimateBoostVolumeUseCase$getLimitOrderBoostInfo$1;
        java.lang.Object objWithContext = estimateBoostVolumeUseCase$getLimitOrderBoostInfo$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = estimateBoostVolumeUseCase$getLimitOrderBoostInfo$12.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            EstimateBoostVolumeUseCase$getLimitOrderBoostInfobMdYcbs$$inlined$dexRunCatching$1 estimateBoostVolumeUseCase$getLimitOrderBoostInfobMdYcbs$$inlined$dexRunCatching$1 = new EstimateBoostVolumeUseCase$getLimitOrderBoostInfobMdYcbs$$inlined$dexRunCatching$1(null, this, i, str, str2, str3, str4, serviceFeeInfo);
            estimateBoostVolumeUseCase$getLimitOrderBoostInfo$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, estimateBoostVolumeUseCase$getLimitOrderBoostInfobMdYcbs$$inlined$dexRunCatching$1, estimateBoostVolumeUseCase$getLimitOrderBoostInfo$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final boolean KWHzl(java.lang.String str) {
        return str == null || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "11");
    }
}
