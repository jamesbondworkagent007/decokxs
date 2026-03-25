package com.okinc.liveness.lca.debugtool.data;

import com.google.gson.Gson;
import com.okinc.liveness.lca.manager.LcaSdkManager;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaDebugJwstRepository {
    public static final String CLIENT_ID_KYC = "lightcaptcha";
    public static final String TAG = "LcaRepository";
    public static volatile LcaDebugJwstRepository instance;
    public final String lcaServiceUrl;
    public final LcaDebugHttpApiService service;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.okinc.liveness.lca.debugtool.data.LcaDebugJwstRepository$getConfig$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LcaDebugJwstRepository.this.getConfig(this);
        }
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.debugtool.data.LcaDebugJwstRepository$getWsSessionId$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17041 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17041(Continuation<? super C17041> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LcaDebugJwstRepository.this.getWsSessionId(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.debugtool.data.LcaDebugJwstRepository$queryResult$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17051 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17051(Continuation<? super C17051> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LcaDebugJwstRepository.this.queryResult(null, null, this);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 com.okinc.liveness.lca.debugtool.data.LcaDebugHttpApiService), (r2v0 java.lang.String) A[MD:(com.okinc.liveness.lca.debugtool.data.LcaDebugHttpApiService, java.lang.String):void (m)] call: com.okinc.liveness.lca.debugtool.data.LcaDebugJwstRepository.<init>(com.okinc.liveness.lca.debugtool.data.LcaDebugHttpApiService, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LcaDebugJwstRepository(LcaDebugHttpApiService lcaDebugHttpApiService, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(lcaDebugHttpApiService, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void clearInstance() {
        Companion.clearInstance();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final LcaDebugJwstRepository getInstance(@NotNull String str) {
        return Companion.getInstance(str);
    }

    public LcaDebugJwstRepository(LcaDebugHttpApiService lcaDebugHttpApiService, String str) {
        this.service = lcaDebugHttpApiService;
        this.lcaServiceUrl = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.okinc.liveness.lca.debugtool.data.LcaDebugHttpApiService)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(com.okinc.liveness.lca.debugtool.data.LcaDebugHttpApiService, java.lang.String):void (m)] (LINE:8) call: com.okinc.liveness.lca.debugtool.data.LcaDebugJwstRepository.<init>(com.okinc.liveness.lca.debugtool.data.LcaDebugHttpApiService, java.lang.String):void type: THIS */
    public /* synthetic */ LcaDebugJwstRepository(LcaDebugHttpApiService lcaDebugHttpApiService, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lcaDebugHttpApiService, (i & 2) != 0 ? null : str);
    }

    public static abstract class Result<T> {
        public static final int $stable = 0;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.debugtool.data.LcaDebugJwstRepository.Result.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class Success<T> extends Result<T> {
            public static final int $stable = 0;
            public final T data;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.liveness.lca.debugtool.data.LcaDebugJwstRepository$Result$Success */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Success copy$default(Success success, Object obj, int i, Object obj2) {
                if ((i & 1) != 0) {
                    obj = success.data;
                }
                return success.copy(obj);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final T component1() {
                return this.data;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Success<T> copy(T t) {
                return new Success<>(t);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && Intrinsics.EZpvd(this.data, ((Success) obj).data);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final T getData() {
                return this.data;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                T t = this.data;
                if (t == null) {
                    return 0;
                }
                return t.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Success(data=" + this.data + ")";
            }

            public Success(T t) {
                super(null);
                this.data = t;
            }
        }

        private Result() {
        }

        public static final class Error extends Result {
            public static final int $stable = 0;
            public final String message;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = error.message;
                }
                return error.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.message;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Error copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Error(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.EZpvd((Object) this.message, (Object) ((Error) obj).message);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getMessage() {
                return this.message;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.message.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Error(message=" + this.message + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
            }
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.debugtool.data.LcaDebugJwstRepository.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LcaDebugJwstRepository getInstance(@NotNull String str) {
            LcaDebugJwstRepository lcaDebugJwstRepository;
            Intrinsics.checkNotNullParameter(str, "");
            LcaDebugJwstRepository lcaDebugJwstRepository2 = LcaDebugJwstRepository.instance;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (!Intrinsics.EZpvd((Object) (lcaDebugJwstRepository2 != null ? lcaDebugJwstRepository2.lcaServiceUrl : null), (Object) str)) {
                synchronized (this) {
                    lcaDebugJwstRepository = new LcaDebugJwstRepository(LcaDebugHttpApiService.Companion.getInstance(str), str, defaultConstructorMarker);
                    Companion companion = LcaDebugJwstRepository.Companion;
                    LcaDebugJwstRepository.instance = lcaDebugJwstRepository;
                }
                return lcaDebugJwstRepository;
            }
            LcaDebugJwstRepository lcaDebugJwstRepository3 = LcaDebugJwstRepository.instance;
            Intrinsics.copydefault(lcaDebugJwstRepository3);
            return lcaDebugJwstRepository3;
        }

        public final void clearInstance() {
            LcaDebugJwstRepository.instance = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getWsSessionId(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Result<LcaJwstWsSessionIdData>> continuation) throws Throwable {
        C17041 c17041;
        if (continuation instanceof C17041) {
            c17041 = (C17041) continuation;
            int i = c17041.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17041.label = i - Integer.MIN_VALUE;
            } else {
                c17041 = new C17041(continuation);
            }
        }
        Object wsSessionId = c17041.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = c17041.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(wsSessionId);
                LcaJwstWsSessionIdRequest lcaJwstWsSessionIdRequest = new LcaJwstWsSessionIdRequest(CLIENT_ID_KYC, str, str2);
                pUU.KWHzl(TAG, "Getting WS Session ID fpr bizSessionId: " + str);
                LcaDebugHttpApiService lcaDebugHttpApiService = this.service;
                c17041.label = 1;
                wsSessionId = lcaDebugHttpApiService.getWsSessionId(lcaJwstWsSessionIdRequest, c17041);
                if (wsSessionId == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(wsSessionId);
            }
            ResponseData responseData = (ResponseData) wsSessionId;
            if (responseData.getData() == null) {
                pUU.valueOf(TAG, "Empty response data");
                return new Result.Error("Empty response");
            }
            pUU.KWHzl(TAG, "WS Session ID Response: " + responseData.getData());
            return new Result.Success(responseData.getData());
        } catch (Exception e) {
            pUU.OLrzqt(TAG, "Error getting WS Session ID", e);
            return new Result.Error("Network error: " + e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object queryResult(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Result<LcaJwstQueryResultData>> continuation) throws Throwable {
        C17051 c17051;
        if (continuation instanceof C17051) {
            c17051 = (C17051) continuation;
            int i = c17051.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17051.label = i - Integer.MIN_VALUE;
            } else {
                c17051 = new C17051(continuation);
            }
        }
        Object objQueryResult = c17051.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = c17051.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objQueryResult);
                LcaJwstQueryResultRequest lcaJwstQueryResultRequest = new LcaJwstQueryResultRequest(CLIENT_ID_KYC, str, str2);
                pUU.KWHzl(TAG, "Querying result for bizSessionId: " + str + ", wsSessionId: " + str2);
                LcaDebugHttpApiService lcaDebugHttpApiService = this.service;
                c17051.label = 1;
                objQueryResult = lcaDebugHttpApiService.queryResult(lcaJwstQueryResultRequest, c17051);
                if (objQueryResult == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objQueryResult);
            }
            ResponseData responseData = (ResponseData) objQueryResult;
            if (responseData.getData() == null) {
                pUU.valueOf(TAG, "Empty response data");
                return new Result.Error("Empty response");
            }
            pUU.KWHzl(TAG, "Query Result Response: " + responseData.getData());
            Function1<LcaDebugInfo, Unit> debugInfoCallback = LcaSdkManager.Companion.getInstance().getDebugInfoCallback();
            if (debugInfoCallback != null) {
                debugInfoCallback.invoke(new LcaDebugInfo(null, new Gson().toJson(responseData.getData()), null, null, 13, null));
            }
            return new Result.Success(responseData.getData());
        } catch (Exception e) {
            pUU.OLrzqt(TAG, "Error querying result", e);
            return new Result.Error("Network error: " + e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getConfig(@NotNull Continuation<? super Result<LcaSdkLivenessConfig>> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object config = anonymousClass1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = anonymousClass1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(config);
                LcaJwstGetConfigRequest lcaJwstGetConfigRequest = new LcaJwstGetConfigRequest("android");
                pUU.KWHzl(TAG, "Getting config");
                LcaDebugHttpApiService lcaDebugHttpApiService = this.service;
                anonymousClass1.label = 1;
                config = lcaDebugHttpApiService.getConfig(lcaJwstGetConfigRequest, anonymousClass1);
                if (config == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(config);
            }
            ResponseData responseData = (ResponseData) config;
            if (responseData.getData() == null) {
                pUU.valueOf(TAG, "Empty response data");
                return new Result.Error("Empty response");
            }
            pUU.KWHzl(TAG, "Config Response: " + responseData.getData());
            return new Result.Success(responseData.getData());
        } catch (Exception e) {
            pUU.OLrzqt(TAG, "Error getting config", e);
            return new Result.Error("Network error: " + e.getMessage());
        }
    }
}
