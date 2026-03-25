package o;

import aws.smithy.kotlin.runtime.http.HttpException;
import aws.smithy.kotlin.runtime.http.engine.okhttp.OkHttpEngine$Companion$engineConstructor$1;
import aws.smithy.kotlin.runtime.http.engine.okhttp.OkHttpEngine$roundTrip$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import o.AS;
import o.C5173Hn;
import okhttp3.Call;
import okhttp3.JvmCallExtensionsKt;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AU extends AB {
    public static final TaskDescription OLrzqt;
    public static final Function1<Function1<? super AS.StateListAnimator, Unit>, AU> copydefault;
    public final java.util.function.Consumer<OkHttpClient.Builder> AhwBna;
    public final AS djBIcL;
    public final AK gEmmrt;
    public final OkHttpClient valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Lo/Ay; */
    @Override // o.InterfaceC3972Aw
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public AS OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.AT.AEQbTJ(o.AS, o.AK, java.util.function.Consumer):okhttp3.OkHttpClient */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AU(@NotNull AS as, java.util.function.Consumer<OkHttpClient.Builder> consumer) {
        super("OkHttp");
        Intrinsics.checkNotNullParameter(as, "");
        this.djBIcL = as;
        this.AhwBna = consumer;
        AK ak = new AK("aws.smithy.kotlin.runtime.http.engine.okhttp", OLrzqt().AhwBna());
        this.gEmmrt = ak;
        this.valueOf = AT.OLrzqt(OLrzqt(), ak, consumer);
    }

    public AU() {
        this(AS.fetchVPNInfo.KWHzl(), null);
    }

    public static final class TaskDescription implements InterfaceC3232Ai<AS.StateListAnimator, AU> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AU.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final AU KWHzl(@NotNull Function1<? super AS.StateListAnimator, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return new AU(AS.fetchVPNInfo.OLrzqt(function1), null);
        }

        @Override // o.InterfaceC3232Ai
        public Function1<Function1<? super AS.StateListAnimator, Unit>, AU> AEQbTJ() {
            return AU.copydefault;
        }
    }

    static {
        TaskDescription taskDescription = new TaskDescription(null);
        OLrzqt = taskDescription;
        copydefault = new OkHttpEngine$Companion$engineConstructor$1(taskDescription);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.AZ.EZpvd(java.lang.Exception):aws.smithy.kotlin.runtime.http.HttpErrorCode */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC3972Aw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull DT dt, @NotNull InterfaceC5037Ch interfaceC5037Ch, @NotNull Continuation<? super C58859zS> continuation) throws java.lang.Throwable {
        OkHttpEngine$roundTrip$1 okHttpEngine$roundTrip$1;
        AU au;
        Call call;
        InterfaceC5037Ch interfaceC5037Ch2;
        CoroutineContext coroutineContext;
        if (continuation instanceof OkHttpEngine$roundTrip$1) {
            okHttpEngine$roundTrip$1 = (OkHttpEngine$roundTrip$1) continuation;
            int i = okHttpEngine$roundTrip$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                okHttpEngine$roundTrip$1.label = i - Integer.MIN_VALUE;
            } else {
                okHttpEngine$roundTrip$1 = new OkHttpEngine$roundTrip$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = okHttpEngine$roundTrip$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = okHttpEngine$roundTrip$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                okHttpEngine$roundTrip$1.L$0 = this;
                okHttpEngine$roundTrip$1.L$1 = dt;
                okHttpEngine$roundTrip$1.L$2 = interfaceC5037Ch;
                okHttpEngine$roundTrip$1.label = 1;
                objEZpvd = C3497An.EZpvd(okHttpEngine$roundTrip$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                au = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Call call2 = (Call) okHttpEngine$roundTrip$1.L$2;
                    CoroutineContext coroutineContext2 = (CoroutineContext) okHttpEngine$roundTrip$1.L$1;
                    InterfaceC5037Ch interfaceC5037Ch3 = (InterfaceC5037Ch) okHttpEngine$roundTrip$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    call = call2;
                    coroutineContext = coroutineContext2;
                    interfaceC5037Ch2 = interfaceC5037Ch3;
                    final Response response = (Response) objEZpvd;
                    JobKt.getJob(coroutineContext).invokeOnCompletion(new Function1<java.lang.Throwable, Unit>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.OkHttpEngine$roundTrip$2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        {
                            super(1);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                            invoke2(th);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Throwable th) {
                            ResponseBody responseBodyBody = response.body();
                            if (responseBodyBody != null) {
                                responseBodyBody.close();
                            }
                        }
                    });
                    InterfaceC5039Cj interfaceC5039CjEZpvd = AZ.EZpvd(response);
                    C5173Hn.ActionBar actionBar = C5173Hn.AEQbTJ;
                    return new AR(interfaceC5037Ch2, interfaceC5039CjEZpvd, C5172Hm.AEQbTJ(actionBar, response.sentRequestAtMillis()), C5172Hm.AEQbTJ(actionBar, response.receivedResponseAtMillis()), coroutineContext, call);
                }
                interfaceC5037Ch = (InterfaceC5037Ch) okHttpEngine$roundTrip$1.L$2;
                dt = (DT) okHttpEngine$roundTrip$1.L$1;
                au = (AU) okHttpEngine$roundTrip$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
            }
            CoroutineContext coroutineContext3 = (CoroutineContext) objEZpvd;
            Call callNewCall = au.valueOf.newCall(AZ.OLrzqt(interfaceC5037Ch, dt, coroutineContext3, au.gEmmrt));
            okHttpEngine$roundTrip$1.L$0 = interfaceC5037Ch;
            okHttpEngine$roundTrip$1.L$1 = coroutineContext3;
            okHttpEngine$roundTrip$1.L$2 = callNewCall;
            okHttpEngine$roundTrip$1.label = 2;
            java.lang.Object objExecuteAsync = JvmCallExtensionsKt.executeAsync(callNewCall, okHttpEngine$roundTrip$1);
            if (objExecuteAsync == objCopydefault) {
                return objCopydefault;
            }
            call = callNewCall;
            interfaceC5037Ch2 = interfaceC5037Ch;
            coroutineContext = coroutineContext3;
            objEZpvd = objExecuteAsync;
            final Response response2 = (Response) objEZpvd;
            JobKt.getJob(coroutineContext).invokeOnCompletion(new Function1<java.lang.Throwable, Unit>() { // from class: aws.smithy.kotlin.runtime.http.engine.okhttp.OkHttpEngine$roundTrip$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    ResponseBody responseBodyBody = response2.body();
                    if (responseBodyBody != null) {
                        responseBodyBody.close();
                    }
                }
            });
            InterfaceC5039Cj interfaceC5039CjEZpvd2 = AZ.EZpvd(response2);
            C5173Hn.ActionBar actionBar2 = C5173Hn.AEQbTJ;
            return new AR(interfaceC5037Ch2, interfaceC5039CjEZpvd2, C5172Hm.AEQbTJ(actionBar2, response2.sentRequestAtMillis()), C5172Hm.AEQbTJ(actionBar2, response2.receivedResponseAtMillis()), coroutineContext, call);
        } catch (java.io.IOException e) {
            throw new HttpException((java.lang.Throwable) e, AZ.AEQbTJ(e), true);
        }
    }

    @Override // o.AB
    public void copydefault() {
        this.valueOf.connectionPool().evictAll();
        this.valueOf.dispatcher().executorService().shutdown();
        this.gEmmrt.close();
    }
}
