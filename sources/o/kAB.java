package o;

import com.okinc.business.market.features.util.ApiConverterUtilKt$getApiResult$1;
import com.okinc.business.market.features.util.ApiConverterUtilKt$getApiResult$2;
import com.okinc.business.market.features.util.ApiConverterUtilKt$getApiResult$responseData$1;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kAB {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object EZpvd(@NotNull Function1<? super Continuation<? super ResponseData<T>>, ? extends java.lang.Object> function1, @NotNull Continuation<? super AbstractC43419rot<? extends T, OKServerException>> continuation) {
        ApiConverterUtilKt$getApiResult$1 apiConverterUtilKt$getApiResult$1;
        if (continuation instanceof ApiConverterUtilKt$getApiResult$1) {
            apiConverterUtilKt$getApiResult$1 = (ApiConverterUtilKt$getApiResult$1) continuation;
            int i = apiConverterUtilKt$getApiResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                apiConverterUtilKt$getApiResult$1.label = i - Integer.MIN_VALUE;
            } else {
                apiConverterUtilKt$getApiResult$1 = new ApiConverterUtilKt$getApiResult$1(continuation);
            }
        }
        java.lang.Object objInvoke = apiConverterUtilKt$getApiResult$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = apiConverterUtilKt$getApiResult$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objInvoke);
                apiConverterUtilKt$getApiResult$1.label = 1;
                objInvoke = function1.invoke(apiConverterUtilKt$getApiResult$1);
                if (objInvoke == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objInvoke);
            }
            ResponseData responseData = (ResponseData) objInvoke;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        } catch (java.lang.Exception e) {
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object OLrzqt(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Function1<? super Continuation<? super ResponseData<T>>, ? extends java.lang.Object> function1, @NotNull Continuation<? super AbstractC43419rot<? extends T, OKServerException>> continuation) throws java.lang.Throwable {
        ApiConverterUtilKt$getApiResult$2 apiConverterUtilKt$getApiResult$2;
        if (continuation instanceof ApiConverterUtilKt$getApiResult$2) {
            apiConverterUtilKt$getApiResult$2 = (ApiConverterUtilKt$getApiResult$2) continuation;
            int i = apiConverterUtilKt$getApiResult$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                apiConverterUtilKt$getApiResult$2.label = i - Integer.MIN_VALUE;
            } else {
                apiConverterUtilKt$getApiResult$2 = new ApiConverterUtilKt$getApiResult$2(continuation);
            }
        }
        java.lang.Object objWithContext = apiConverterUtilKt$getApiResult$2.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = apiConverterUtilKt$getApiResult$2.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                ApiConverterUtilKt$getApiResult$responseData$1 apiConverterUtilKt$getApiResult$responseData$1 = new ApiConverterUtilKt$getApiResult$responseData$1(function1, null);
                apiConverterUtilKt$getApiResult$2.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, apiConverterUtilKt$getApiResult$responseData$1, apiConverterUtilKt$getApiResult$2);
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
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        } catch (java.lang.Exception e) {
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }
}
