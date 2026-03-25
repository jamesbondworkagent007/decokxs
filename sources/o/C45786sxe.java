package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.lite.onboarding.api.UserModeSwitchConfig;
import com.okinc.okex.lite.onboarding.bean.TradingModeRecommendationBean;
import com.okinc.okex.lite.onboarding.net.OnBoardingNetworkService;
import com.okinc.okex.lite.onboarding.repository.OnBoardingDataRepositoryImpl$getModeSwitchConfig$1;
import com.okinc.okex.lite.onboarding.repository.OnBoardingDataRepositoryImpl$getModeSwitchConfig$2$1;
import com.okinc.okex.lite.onboarding.repository.OnBoardingDataRepositoryImpl$getTradingModeRecommendation$1;
import com.okinc.okex.lite.onboarding.repository.OnBoardingDataRepositoryImpl$getTradingModeRecommendation$2$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sxe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@yCR
public final class C45786sxe {
    public final OnBoardingNetworkService EZpvd;
    public final CoroutineExceptionHandler KWHzl;
    public final CoroutineDispatcher copydefault;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Continuation<? super AbstractC43419rot<TradingModeRecommendationBean, OKServerException>> continuation) throws java.lang.Throwable {
        OnBoardingDataRepositoryImpl$getTradingModeRecommendation$1 onBoardingDataRepositoryImpl$getTradingModeRecommendation$1;
        if (continuation instanceof OnBoardingDataRepositoryImpl$getTradingModeRecommendation$1) {
            onBoardingDataRepositoryImpl$getTradingModeRecommendation$1 = (OnBoardingDataRepositoryImpl$getTradingModeRecommendation$1) continuation;
            int i = onBoardingDataRepositoryImpl$getTradingModeRecommendation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onBoardingDataRepositoryImpl$getTradingModeRecommendation$1.label = i - Integer.MIN_VALUE;
            } else {
                onBoardingDataRepositoryImpl$getTradingModeRecommendation$1 = new OnBoardingDataRepositoryImpl$getTradingModeRecommendation$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = onBoardingDataRepositoryImpl$getTradingModeRecommendation$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = onBoardingDataRepositoryImpl$getTradingModeRecommendation$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineContext coroutineContextPlus = this.copydefault.plus(this.KWHzl);
                OnBoardingDataRepositoryImpl$getTradingModeRecommendation$2$1 onBoardingDataRepositoryImpl$getTradingModeRecommendation$2$1 = new OnBoardingDataRepositoryImpl$getTradingModeRecommendation$2$1(this, null);
                onBoardingDataRepositoryImpl$getTradingModeRecommendation$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineContextPlus, onBoardingDataRepositoryImpl$getTradingModeRecommendation$2$1, onBoardingDataRepositoryImpl$getTradingModeRecommendation$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Continuation<? super AbstractC43419rot<UserModeSwitchConfig, OKServerException>> continuation) throws java.lang.Throwable {
        OnBoardingDataRepositoryImpl$getModeSwitchConfig$1 onBoardingDataRepositoryImpl$getModeSwitchConfig$1;
        if (continuation instanceof OnBoardingDataRepositoryImpl$getModeSwitchConfig$1) {
            onBoardingDataRepositoryImpl$getModeSwitchConfig$1 = (OnBoardingDataRepositoryImpl$getModeSwitchConfig$1) continuation;
            int i = onBoardingDataRepositoryImpl$getModeSwitchConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onBoardingDataRepositoryImpl$getModeSwitchConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                onBoardingDataRepositoryImpl$getModeSwitchConfig$1 = new OnBoardingDataRepositoryImpl$getModeSwitchConfig$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = onBoardingDataRepositoryImpl$getModeSwitchConfig$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = onBoardingDataRepositoryImpl$getModeSwitchConfig$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineContext coroutineContextPlus = this.copydefault.plus(this.KWHzl);
                OnBoardingDataRepositoryImpl$getModeSwitchConfig$2$1 onBoardingDataRepositoryImpl$getModeSwitchConfig$2$1 = new OnBoardingDataRepositoryImpl$getModeSwitchConfig$2$1(this, null);
                onBoardingDataRepositoryImpl$getModeSwitchConfig$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineContextPlus, onBoardingDataRepositoryImpl$getModeSwitchConfig$2$1, onBoardingDataRepositoryImpl$getModeSwitchConfig$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }
}
