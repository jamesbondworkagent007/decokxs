package o;

import com.okinc.business.defi.api.bean.WalletJwtException;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexui.utils.SafetyNetUtilsKt$dexRunCatching$1;
import com.okinc.business.dexui.utils.SafetyNetUtilsKt$dexRunCatching$2;
import com.okinc.business.dexui.utils.SafetyNetUtilsKt$getApiResult$1;
import com.okinc.business.dexui.utils.SafetyNetUtilsKt$getApiResult$responseData$1;
import com.okinc.business.dexui.utils.SafetyNetUtilsKt$getApiResultWithJwtCheck$1;
import com.okinc.business.dexui.utils.SafetyNetUtilsKt$getApiResultWithJwtCheck$responseData$1$1;
import com.okinc.business.dexui.utils.SafetyNetUtilsKt$getNewApiResult$1;
import com.okinc.business.dexui.utils.SafetyNetUtilsKt$getNewApiResult$responseData$1;
import com.okinc.liveness.lca.EopTrackEvent;
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
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ivm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25389ivm {
    public static final CoroutineExceptionHandler EZpvd = new Activity(CoroutineExceptionHandler.Key);

    public static /* synthetic */ Job safeLaunch$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return OLrzqt(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    public static final Job OLrzqt(@NotNull CoroutineScope coroutineScope, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineStart coroutineStart, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
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
            coroutineContext = coroutineContext.plus(EZpvd);
        }
        return BuildersKt.launch(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    /* JADX INFO: renamed from: o.ivm$Activity */
    public static final class Activity extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public Activity(CoroutineExceptionHandler.Key key) {
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
    public static final <T> java.lang.Object OLrzqt(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Function1<? super Continuation<? super ResponseData<T>>, ? extends java.lang.Object> function1, @NotNull Continuation<? super AbstractC43419rot<? extends T, OKServerException>> continuation) throws java.lang.Throwable {
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object EZpvd(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Function1<? super Continuation<? super ResponseData<T>>, ? extends java.lang.Object> function1, @NotNull Continuation<? super AbstractC43419rot<? extends T, OKServerException>> continuation) throws java.lang.Throwable {
        SafetyNetUtilsKt$getNewApiResult$1 safetyNetUtilsKt$getNewApiResult$1;
        if (continuation instanceof SafetyNetUtilsKt$getNewApiResult$1) {
            safetyNetUtilsKt$getNewApiResult$1 = (SafetyNetUtilsKt$getNewApiResult$1) continuation;
            int i = safetyNetUtilsKt$getNewApiResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                safetyNetUtilsKt$getNewApiResult$1.label = i - Integer.MIN_VALUE;
            } else {
                safetyNetUtilsKt$getNewApiResult$1 = new SafetyNetUtilsKt$getNewApiResult$1(continuation);
            }
        }
        java.lang.Object objWithContext = safetyNetUtilsKt$getNewApiResult$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = safetyNetUtilsKt$getNewApiResult$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                SafetyNetUtilsKt$getNewApiResult$responseData$1 safetyNetUtilsKt$getNewApiResult$responseData$1 = new SafetyNetUtilsKt$getNewApiResult$responseData$1(function1, null);
                safetyNetUtilsKt$getNewApiResult$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, safetyNetUtilsKt$getNewApiResult$responseData$1, safetyNetUtilsKt$getNewApiResult$1);
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
            if (e instanceof OKServerException) {
                return new AbstractC43419rot.ActionBar(e);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        if (r9 == null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object AEQbTJ(CoroutineDispatcher coroutineDispatcher, @NotNull Function1<? super Continuation<? super ResponseData<T>>, ? extends java.lang.Object> function1, @NotNull Continuation<? super AbstractC43419rot<? extends T, ? extends java.lang.Exception>> continuation) throws java.lang.Throwable {
        SafetyNetUtilsKt$getApiResultWithJwtCheck$1 safetyNetUtilsKt$getApiResultWithJwtCheck$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof SafetyNetUtilsKt$getApiResultWithJwtCheck$1) {
            safetyNetUtilsKt$getApiResultWithJwtCheck$1 = (SafetyNetUtilsKt$getApiResultWithJwtCheck$1) continuation;
            int i = safetyNetUtilsKt$getApiResultWithJwtCheck$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                safetyNetUtilsKt$getApiResultWithJwtCheck$1.label = i - Integer.MIN_VALUE;
            } else {
                safetyNetUtilsKt$getApiResultWithJwtCheck$1 = new SafetyNetUtilsKt$getApiResultWithJwtCheck$1(continuation);
            }
        }
        java.lang.Object objWithContext = safetyNetUtilsKt$getApiResultWithJwtCheck$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = safetyNetUtilsKt$getApiResultWithJwtCheck$1.label;
        try {
        } catch (java.lang.Exception e) {
            actionBar = new AbstractC43419rot.ActionBar(e);
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            if (coroutineDispatcher != null) {
                SafetyNetUtilsKt$getApiResultWithJwtCheck$responseData$1$1 safetyNetUtilsKt$getApiResultWithJwtCheck$responseData$1$1 = new SafetyNetUtilsKt$getApiResultWithJwtCheck$responseData$1$1(function1, null);
                safetyNetUtilsKt$getApiResultWithJwtCheck$1.L$0 = function1;
                safetyNetUtilsKt$getApiResultWithJwtCheck$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, safetyNetUtilsKt$getApiResultWithJwtCheck$responseData$1$1, safetyNetUtilsKt$getApiResultWithJwtCheck$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            }
            safetyNetUtilsKt$getApiResultWithJwtCheck$1.L$0 = null;
            safetyNetUtilsKt$getApiResultWithJwtCheck$1.label = 2;
            objWithContext = function1.invoke(safetyNetUtilsKt$getApiResultWithJwtCheck$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            responseData = (ResponseData) objWithContext;
            if (responseData.getCode() != 0) {
            }
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
            return actionBar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
            responseData = (ResponseData) objWithContext;
            if (responseData.getCode() != 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
            return actionBar;
        }
        Function1<? super Continuation<? super ResponseData<T>>, ? extends java.lang.Object> function12 = (Function1) safetyNetUtilsKt$getApiResultWithJwtCheck$1.L$0;
        C56391yDq.AEQbTJ(objWithContext);
        function1 = function12;
        responseData = (ResponseData) objWithContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[Catch: Exception -> 0x005d, TryCatch #0 {Exception -> 0x005d, blocks: (B:7:0x0009, B:11:0x002d, B:13:0x0033, B:15:0x0039, B:16:0x0046, B:10:0x0021), top: B:21:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object getApiResultWithJwtCheck$default(CoroutineDispatcher coroutineDispatcher, Function1 function1, Continuation continuation, int i, java.lang.Object obj) {
        ResponseData responseData;
        if ((i & 1) != 0) {
            coroutineDispatcher = null;
        }
        if (coroutineDispatcher != null) {
            try {
                SafetyNetUtilsKt$getApiResultWithJwtCheck$responseData$1$1 safetyNetUtilsKt$getApiResultWithJwtCheck$responseData$1$1 = new SafetyNetUtilsKt$getApiResultWithJwtCheck$responseData$1$1(function1, null);
                C56518yIi.AEQbTJ(3);
                C56518yIi.AEQbTJ(0);
                java.lang.Object objWithContext = BuildersKt.withContext(coroutineDispatcher, safetyNetUtilsKt$getApiResultWithJwtCheck$responseData$1$1, null);
                C56518yIi.AEQbTJ(1);
                responseData = (ResponseData) objWithContext;
                if (responseData == null) {
                    C56518yIi.AEQbTJ(0);
                    java.lang.Object objInvoke = function1.invoke(continuation);
                    C56518yIi.AEQbTJ(1);
                    responseData = (ResponseData) objInvoke;
                }
            } catch (java.lang.Exception e) {
                return new AbstractC43419rot.ActionBar(e);
            }
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        return new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
    }

    public static final boolean copydefault(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof WalletJwtException) {
            return true;
        }
        return (th instanceof OKServerException) && (((OKServerException) th).getOrigin() instanceof WalletJwtException);
    }

    public static final boolean OLrzqt(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Intrinsics.EZpvd((java.lang.Object) KWHzl(th), (java.lang.Object) "41008");
    }

    public static final WalletJwtException EZpvd(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof WalletJwtException) {
            return (WalletJwtException) th;
        }
        if (!(th instanceof OKServerException)) {
            return null;
        }
        OKServerException oKServerException = (OKServerException) th;
        if (!(oKServerException.getOrigin() instanceof WalletJwtException)) {
            return null;
        }
        java.lang.Throwable origin = oKServerException.getOrigin();
        Intrinsics.copydefault(origin, "");
        return (WalletJwtException) origin;
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        WalletJwtException walletJwtExceptionEZpvd = EZpvd(th);
        if (walletJwtExceptionEZpvd == null) {
            return th.getMessage();
        }
        try {
            JsonObject originResponseBody = walletJwtExceptionEZpvd.getOriginResponseBody();
            JsonElement jsonElement = originResponseBody != null ? (JsonElement) originResponseBody.get((java.lang.Object) "code") : null;
            if (jsonElement instanceof JsonPrimitive) {
                return ((JsonPrimitive) jsonElement).getContent();
            }
        } catch (java.lang.Exception unused) {
        }
        return MultiTransferSignData.DEFAULT_INTERVAL;
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        WalletJwtException walletJwtExceptionEZpvd = EZpvd(th);
        if (walletJwtExceptionEZpvd == null) {
            return th.getMessage();
        }
        try {
            JsonObject originResponseBody = walletJwtExceptionEZpvd.getOriginResponseBody();
            JsonElement jsonElement = originResponseBody != null ? (JsonElement) originResponseBody.get((java.lang.Object) EopTrackEvent.KEY_ERROR_MESSAGE) : null;
            return jsonElement instanceof JsonPrimitive ? ((JsonPrimitive) jsonElement).getContent() : walletJwtExceptionEZpvd.getMessage();
        } catch (java.lang.Exception unused) {
            return walletJwtExceptionEZpvd.getMessage();
        }
    }

    public static final <T, E extends java.lang.Throwable> T KWHzl(@NotNull AbstractC43419rot<? extends T, ? extends E> abstractC43419rot) throws java.lang.Throwable {
        Intrinsics.checkNotNullParameter(abstractC43419rot, "");
        if (abstractC43419rot.OLrzqt()) {
            AbstractC43419rot.ActionBar actionBar = (AbstractC43419rot.ActionBar) abstractC43419rot;
            java.lang.Throwable th = (java.lang.Throwable) actionBar.KWHzl();
            if ((th instanceof WalletJwtException) || ((th instanceof OKServerException) && (((OKServerException) th).getOrigin() instanceof WalletJwtException))) {
                throw ((java.lang.Throwable) actionBar.KWHzl());
            }
        }
        return abstractC43419rot.AEQbTJ();
    }
}
