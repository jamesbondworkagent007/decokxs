package o;

import com.okinc.dexkline.dexui.utils.SafetyNetUtilsKt$dexRunCatching$1;
import com.okinc.dexkline.dexui.utils.SafetyNetUtilsKt$dexRunCatching$2;
import com.okinc.dexkline.dexui.utils.SafetyNetUtilsKt$getApiResult$1;
import com.okinc.dexkline.dexui.utils.SafetyNetUtilsKt$getApiResult$responseData$1;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mUR {
    public static final CoroutineExceptionHandler OLrzqt = new TaskDescription(CoroutineExceptionHandler.Key);

    public static /* synthetic */ Job safeLaunch$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return EZpvd(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    public static final Job EZpvd(@NotNull CoroutineScope coroutineScope, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineStart coroutineStart, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        Intrinsics.checkNotNullParameter(coroutineStart, "");
        Intrinsics.checkNotNullParameter(function2, "");
        CoroutineContext coroutineContext2 = coroutineScope.getCoroutineContext();
        CoroutineExceptionHandler.Key key = CoroutineExceptionHandler.Key;
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) coroutineContext2.get(key);
        if (coroutineExceptionHandler == null) {
            coroutineExceptionHandler = (CoroutineExceptionHandler) coroutineContext.get(key);
        }
        if (coroutineExceptionHandler == null) {
            coroutineContext = coroutineContext.plus(OLrzqt);
        }
        return BuildersKt.launch(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    public static final class TaskDescription extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public TaskDescription(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            if (th instanceof CancellationException) {
                return;
            }
            th.printStackTrace();
            pUU.copydefault("DefaultExceptionHandler", th + "\n" + Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object copydefault(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Function1<? super Continuation<? super T>, ? extends java.lang.Object> function1, @NotNull Continuation<? super Result<? extends T>> continuation) throws java.lang.Throwable {
        SafetyNetUtilsKt$dexRunCatching$1 safetyNetUtilsKt$dexRunCatching$1;
        if (continuation instanceof SafetyNetUtilsKt$dexRunCatching$1) {
            safetyNetUtilsKt$dexRunCatching$1 = (SafetyNetUtilsKt$dexRunCatching$1) continuation;
            int i = safetyNetUtilsKt$dexRunCatching$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                safetyNetUtilsKt$dexRunCatching$1.label = i - Integer.MIN_VALUE;
            } else {
                safetyNetUtilsKt$dexRunCatching$1 = new SafetyNetUtilsKt$dexRunCatching$1(continuation);
            }
        }
        java.lang.Object objWithContext = safetyNetUtilsKt$dexRunCatching$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = safetyNetUtilsKt$dexRunCatching$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            SafetyNetUtilsKt$dexRunCatching$2 safetyNetUtilsKt$dexRunCatching$2 = new SafetyNetUtilsKt$dexRunCatching$2(function1, null);
            safetyNetUtilsKt$dexRunCatching$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, safetyNetUtilsKt$dexRunCatching$2, safetyNetUtilsKt$dexRunCatching$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object KWHzl(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Function1<? super Continuation<? super ResponseData<T>>, ? extends java.lang.Object> function1, @NotNull Continuation<? super AbstractC43419rot<? extends T, OKServerException>> continuation) throws java.lang.Throwable {
        SafetyNetUtilsKt$getApiResult$1 safetyNetUtilsKt$getApiResult$1;
        if (continuation instanceof SafetyNetUtilsKt$getApiResult$1) {
            safetyNetUtilsKt$getApiResult$1 = (SafetyNetUtilsKt$getApiResult$1) continuation;
            int i = safetyNetUtilsKt$getApiResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                safetyNetUtilsKt$getApiResult$1.label = i - Integer.MIN_VALUE;
            } else {
                safetyNetUtilsKt$getApiResult$1 = new SafetyNetUtilsKt$getApiResult$1(continuation);
            }
        }
        java.lang.Object objWithContext = safetyNetUtilsKt$getApiResult$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = safetyNetUtilsKt$getApiResult$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                SafetyNetUtilsKt$getApiResult$responseData$1 safetyNetUtilsKt$getApiResult$responseData$1 = new SafetyNetUtilsKt$getApiResult$responseData$1(function1, null);
                safetyNetUtilsKt$getApiResult$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, safetyNetUtilsKt$getApiResult$responseData$1, safetyNetUtilsKt$getApiResult$1);
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
