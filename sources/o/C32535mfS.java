package o;

import com.okinc.common.okcore.net.OKCoreHttpRequest2$execute$1;
import com.okinc.network.model.CallChainExtraInfo;
import com.okinc.network.okg.config.NetworkStringEnum;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.tag.RequestTagEnum;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.net.SocketTimeoutException;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import uniffi.network.CacheStrategy;
import uniffi.network.HttpMethod;
import uniffi.network.NetworkException;

/* JADX INFO: renamed from: o.mfS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C32535mfS implements InterfaceC4267BaQ {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final C4343Bbn AEQbTJ;
    public volatile Call EZpvd;
    public final OkHttpClient copydefault;

    /* JADX INFO: renamed from: o.mfS$TaskDescription */
    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[HttpMethod.values().length];
            try {
                iArr[HttpMethod.GET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[HttpMethod.POST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[HttpMethod.PUT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[HttpMethod.PATCH.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[HttpMethod.HEAD.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[HttpMethod.DELETE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[HttpMethod.OPTIONS.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[CacheStrategy.values().length];
            try {
                iArr2[CacheStrategy.NO_CACHE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[CacheStrategy.ONLY_CACHE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[CacheStrategy.FIRST_CACHE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[CacheStrategy.FIRST_NETWORK.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            EZpvd = iArr2;
        }
    }

    public C32535mfS(@NotNull C4343Bbn c4343Bbn, @NotNull OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(c4343Bbn, "");
        Intrinsics.checkNotNullParameter(okHttpClient, "");
        this.AEQbTJ = c4343Bbn;
        this.copydefault = okHttpClient;
    }

    /* JADX INFO: renamed from: o.mfS$ActionBar */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mfS.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC4267BaQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Continuation<? super C4326BbW> continuation) throws java.lang.Throwable {
        OKCoreHttpRequest2$execute$1 oKCoreHttpRequest2$execute$1;
        java.lang.String strInvoke;
        if (continuation instanceof OKCoreHttpRequest2$execute$1) {
            oKCoreHttpRequest2$execute$1 = (OKCoreHttpRequest2$execute$1) continuation;
            int i = oKCoreHttpRequest2$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKCoreHttpRequest2$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                oKCoreHttpRequest2$execute$1 = new OKCoreHttpRequest2$execute$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = oKCoreHttpRequest2$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKCoreHttpRequest2$execute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                Call callNewCall = this.copydefault.newCall(AEQbTJ());
                this.EZpvd = callNewCall;
                oKCoreHttpRequest2$execute$1.label = 1;
                objAEQbTJ = AEQbTJ(callNewCall, oKCoreHttpRequest2$execute$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            return objAEQbTJ;
        } catch (CancellationException e) {
            pUU.KWHzl("OKCoreHttpRequest2", "wrapWithNetworkException CancellationException", e);
            Function1<NetworkStringEnum, java.lang.String> function1ZsXlph = C43292rmY.OLrzqt.zsXlph();
            if (function1ZsXlph == null || (strInvoke = function1ZsXlph.invoke(NetworkStringEnum.NETWORK_ERROR)) == null) {
                java.lang.String message = e.getMessage();
                if (message == null) {
                    message = "coroutine was cancelled";
                }
                strInvoke = "CancellationException: " + message;
            }
            throw new NetworkException.RequestFailed(strInvoke);
        } catch (NetworkException e2) {
            throw e2;
        } catch (java.lang.Throwable th) {
            pUU.OLrzqt("OKCoreHttpRequest2", "Unexpected error in execute: " + th.getClass().getSimpleName(), th);
            java.lang.String message2 = th.getMessage();
            if (message2 == null) {
                message2 = "Request failed: " + th.getClass().getSimpleName();
            }
            throw new NetworkException.RequestFailed(message2);
        }
    }

    @Override // o.InterfaceC4267BaQ
    public void EZpvd() {
        Call call = this.EZpvd;
        if (call != null) {
            call.cancel();
        }
    }

    public final Request AEQbTJ() {
        Request.Builder builderUrl = new Request.Builder().url(this.AEQbTJ.AYXKKw());
        AEQbTJ(builderUrl);
        OLrzqt(builderUrl);
        builderUrl.tag(CallChainExtraInfo.class, new CallChainExtraInfo());
        return builderUrl.build();
    }

    public final void AEQbTJ(Request.Builder builder) {
        for (Map.Entry<java.lang.String, java.lang.String> entry : this.AEQbTJ.KWHzl().entrySet()) {
            builder.header(entry.getKey(), entry.getValue());
        }
        if (this.AEQbTJ.EZpvd()) {
            builder.header("na-req-tag", RequestTagEnum.WEB3.getTag());
        }
        builder.header("Subdomain-Strategy", C32538mfV.copydefault.EZpvd(this.AEQbTJ.valueOf()));
        KWHzl(builder, this.AEQbTJ.copydefault());
        C32539mfW.AEQbTJ.OLrzqt(builder, this.AEQbTJ.djBIcL());
    }

    public final void OLrzqt(Request.Builder builder) {
        RequestBody requestBodyAEQbTJ = C32541mfY.KWHzl.AEQbTJ(this.AEQbTJ.OLrzqt(), this.AEQbTJ.AhwBna());
        switch (TaskDescription.AEQbTJ[this.AEQbTJ.AEQbTJ().ordinal()]) {
            case 1:
                builder.get();
                return;
            case 2:
                builder.post(requestBodyAEQbTJ);
                return;
            case 3:
                builder.put(requestBodyAEQbTJ);
                return;
            case 4:
                builder.patch(requestBodyAEQbTJ);
                return;
            case 5:
                builder.head();
                return;
            case 6:
                Request.Builder.delete$default(builder, null, 1, null);
                return;
            case 7:
                throw new NotImplementedError("An operation is not implemented: NOT support OPTIONS");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void KWHzl(Request.Builder builder, C4345Bbp c4345Bbp) {
        java.lang.String str;
        if (c4345Bbp == null) {
            return;
        }
        int i = TaskDescription.EZpvd[c4345Bbp.OLrzqt().ordinal()];
        if (i == 1) {
            str = "NO_CACHE";
        } else if (i == 2) {
            str = "ONLY_CACHE";
        } else if (i == 3) {
            str = "FIRST_CACHE";
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str = "FIRST_NETWORK";
        }
        builder.header("Cache-Strategy", str);
        if (c4345Bbp.AEQbTJ() >= 0) {
            builder.header("Cache-Expire", java.lang.String.valueOf(c4345Bbp.AEQbTJ()));
        }
        builder.header("Cache-Token-Valid", c4345Bbp.copydefault() ? "0" : "1");
    }

    /* JADX INFO: renamed from: o.mfS$StateListAnimator */
    public static final class StateListAnimator implements Function1<java.lang.Throwable, Unit> {
        public final /* synthetic */ Call copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Call call) {
            this.copydefault = call;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            AEQbTJ(th);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(java.lang.Throwable th) {
            this.copydefault.cancel();
        }
    }

    /* JADX INFO: renamed from: o.mfS$Activity */
    public static final class Activity implements okhttp3.Callback {
        public final /* synthetic */ C32535mfS KWHzl;
        public final /* synthetic */ CancellableContinuation<C4326BbW> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super o.BbW> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(CancellableContinuation<? super C4326BbW> cancellableContinuation, C32535mfS c32535mfS) {
            this.copydefault = cancellableContinuation;
            this.KWHzl = c32535mfS;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, java.io.IOException iOException) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(iOException, "");
            if (this.copydefault.isActive()) {
                try {
                    this.KWHzl.EZpvd(call, iOException, this.copydefault);
                } catch (java.lang.Throwable th) {
                    pUU.OLrzqt("OKCoreHttpRequest2", "Unexpected error in onFailure: " + th.getClass().getSimpleName(), th);
                    if (this.copydefault.isActive()) {
                        java.lang.String message = th.getMessage();
                        if (message == null) {
                            message = "Unexpected error in onFailure: " + th.getClass().getSimpleName();
                        }
                        NetworkException.RequestFailed requestFailed = new NetworkException.RequestFailed(message);
                        CancellableContinuation<C4326BbW> cancellableContinuation = this.copydefault;
                        Result.Application application = Result.Companion;
                        cancellableContinuation.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(requestFailed)));
                    }
                }
            }
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "");
            Intrinsics.checkNotNullParameter(response, "");
            if (this.copydefault.isActive()) {
                try {
                    this.KWHzl.EZpvd(response, this.copydefault);
                    return;
                } catch (java.lang.Throwable th) {
                    pUU.OLrzqt("OKCoreHttpRequest2", "Unexpected error in onResponse: " + th.getClass().getSimpleName(), th);
                    if (this.copydefault.isActive()) {
                        java.lang.String message = th.getMessage();
                        if (message == null) {
                            message = "Unexpected error in onResponse: " + th.getClass().getSimpleName();
                        }
                        NetworkException.RequestFailed requestFailed = new NetworkException.RequestFailed(message);
                        CancellableContinuation<C4326BbW> cancellableContinuation = this.copydefault;
                        Result.Application application = Result.Companion;
                        cancellableContinuation.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(requestFailed)));
                        return;
                    }
                    return;
                }
            }
            response.close();
        }
    }

    public final void EZpvd(Call call, java.io.IOException iOException, Continuation<? super C4326BbW> continuation) {
        java.lang.Throwable requestFailed;
        if (iOException instanceof OKServerException) {
            OKServerException oKServerException = (OKServerException) iOException;
            if (oKServerException.getResponse() != null) {
                byte[] bytes = java.lang.String.valueOf(oKServerException.getResponse()).getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "");
                java.lang.Integer httpCode = oKServerException.getHttpCode();
                short sAEQbTJ = httpCode != null ? yDB.AEQbTJ((short) httpCode.intValue()) : (short) 500;
                java.util.Map mapEZpvd = C56423yEv.EZpvd(C56390yDp.OLrzqt("Content-Type", EIP1271Verifier.mediaTypeString));
                java.lang.String requestUrl = oKServerException.getRequestUrl();
                C4326BbW c4326BbW = new C4326BbW(sAEQbTJ, mapEZpvd, requestUrl == null ? call.request().url().toString() : requestUrl, bytes, EIP1271Verifier.mediaTypeString, C56396yDv.KWHzl(C56396yDv.copydefault(bytes.length)), "unknown", null);
                Result.Application application = Result.Companion;
                continuation.resumeWith(Result.m7377constructorimpl(c4326BbW));
                return;
            }
        }
        if (call.isCanceled()) {
            requestFailed = new NetworkException.RequestFailed("Request was cancelled");
        } else if (iOException instanceof SocketTimeoutException) {
            requestFailed = new NetworkException.Timeout();
        } else {
            java.lang.String message = iOException.getMessage();
            if (message == null) {
                message = "Network request failed: " + iOException.getClass().getSimpleName();
            }
            requestFailed = new NetworkException.RequestFailed(message);
        }
        Result.Application application2 = Result.Companion;
        continuation.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(requestFailed)));
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 0, expect 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final void EZpvd(Response response, Continuation<? super C4326BbW> continuation) {
        try {
            try {
                C4326BbW c4326BbWAEQbTJ = C32540mfX.KWHzl.AEQbTJ(response);
                Result.Application application = Result.Companion;
                continuation.resumeWith(Result.m7377constructorimpl(c4326BbWAEQbTJ));
            } finally {
            }
            Unit unit = Unit.INSTANCE;
            yFA.copydefault(response, null);
        } finally {
        }
    }

    public final java.lang.Object AEQbTJ(Call call, Continuation<? super C4326BbW> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new StateListAnimator(call));
        call.enqueue(new Activity(cancellableContinuationImpl, this));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }
}
