package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.TradeLiveData;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.refactor.usecase.coroutine.AbsUseCase$doInMain$2;
import com.okinc.unify_trade.refactor.usecase.coroutine.AbsUseCase$doRealRequest$1;
import com.okinc.unify_trade.refactor.usecase.coroutine.AbsUseCase$executeInternal$1;
import java.lang.reflect.ParameterizedType;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.xKL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class xKQ<Resp> implements xKL<Resp> {
    public boolean AhwBna;
    public Job djBIcL;
    public boolean fIwbmz;
    public MutableLiveData<?> fetchVPNInfo;
    public Function1<? super ResponseData<Resp>, Unit> isConnected;
    public static final Activity Companion = new Activity(null);
    public static final int AYXKKw = 8;
    public InterfaceC54501xKt<Resp, ?> valueOf = new xKC();
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.xKN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return xKQ.copydefault();
        }
    });
    public final InterfaceC56387yDm<C56109xwc<java.lang.Exception>> gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.xKP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return xKQ.OLrzqt();
        }
    });
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.xKT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return xKQ.KWHzl(this.copydefault);
        }
    });
    public boolean DbNXlk = true;
    public volatile int fARcdN = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.lifecycle.MutableLiveData<Resp> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(@NotNull MutableLiveData<Resp> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        this.fetchVPNInfo = mutableLiveData;
    }

    public abstract java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<Resp>> continuation) throws java.lang.Exception;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xKL
    public void KWHzl(@NotNull Function1<? super ResponseData<Resp>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.isConnected = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Object OLrzqt(@NotNull Continuation<? super Flow<ResponseData<Resp>>> continuation) throws java.lang.Exception {
        return KWHzl(this, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.lifecycle.MutableLiveData<UIResp> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.xKt<Resp, UIResp> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <UIResp> void OLrzqt(@NotNull MutableLiveData<UIResp> mutableLiveData, @NotNull InterfaceC54501xKt<Resp, UIResp> interfaceC54501xKt) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(interfaceC54501xKt, "");
        this.fetchVPNInfo = mutableLiveData;
        this.valueOf = interfaceC54501xKt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt() {
        this.AhwBna = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xKK
    public boolean values() {
        return !this.fIwbmz || this.fARcdN == -1;
    }

    @Override // o.xKK
    public java.lang.String bB_() {
        return xKL.ActionBar.KWHzl(this);
    }

    @Override // o.xKK
    public java.util.Map<java.lang.String, java.lang.String> valueOf() {
        return xKL.ActionBar.AEQbTJ(this);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xKQ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static final TradeLiveData copydefault() {
        return new TradeLiveData();
    }

    public final TradeLiveData<java.lang.Boolean> isConnected() {
        return (TradeLiveData) this.values.getValue();
    }

    public static final C56109xwc OLrzqt() {
        return new C56109xwc();
    }

    public static final xKZ KWHzl(xKQ xkq) {
        return xkq.djBIcL();
    }

    public final xKZ<Resp, ?> DbNXlk() {
        return (xKZ) this.AkhnZx.getValue();
    }

    public static /* synthetic */ <Resp> java.lang.Object KWHzl(xKQ<Resp> xkq, Continuation<? super Flow<ResponseData<Resp>>> continuation) throws java.lang.Exception {
        return FlowKt.emptyFlow();
    }

    @Override // o.xKK
    public void OLrzqt(long j) {
        executeInternal$default(this, j, false, 2, null);
    }

    public static /* synthetic */ void executeInternal$default(xKQ xkq, long j, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeInternal");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        xkq.AEQbTJ(j, z);
    }

    public final void AEQbTJ(long j, boolean z) {
        Job job = this.djBIcL;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.djBIcL = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new AbsUseCase$executeInternal$1(this, j, z, null), 3, null);
    }

    public static /* synthetic */ java.lang.Object doRealRequest$default(xKQ xkq, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doRealRequest");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return xkq.KWHzl(z, (Continuation<? super Unit>) continuation);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:0x005e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:56:? */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v1, types: [o.xKQ] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [o.xKQ] */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, o.xKQ] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [o.xKQ] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, o.xKQ, o.xKQ<Resp>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(boolean z, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AbsUseCase$doRealRequest$1 absUseCase$doRealRequest$1;
        OKServerException oKServerExceptionOLrzqt;
        xKZ xkzDbNXlk;
        ?? r2;
        ?? r10;
        TaskDescription taskDescription;
        ?? r102;
        if (continuation instanceof AbsUseCase$doRealRequest$1) {
            absUseCase$doRealRequest$1 = (AbsUseCase$doRealRequest$1) continuation;
            int i = absUseCase$doRealRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                absUseCase$doRealRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                absUseCase$doRealRequest$1 = new AbsUseCase$doRealRequest$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = absUseCase$doRealRequest$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = absUseCase$doRealRequest$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                isConnected().postValue(C56443yFo.KWHzl(true));
                try {
                    if (z != 0) {
                        absUseCase$doRealRequest$1.L$0 = this;
                        absUseCase$doRealRequest$1.label = 1;
                        objKWHzl = OLrzqt(absUseCase$doRealRequest$1);
                        if (objKWHzl == objCopydefault) {
                            return objCopydefault;
                        }
                        r10 = this;
                        taskDescription = new TaskDescription(r10);
                        absUseCase$doRealRequest$1.L$0 = r10;
                        absUseCase$doRealRequest$1.label = 2;
                        if (((Flow) objKWHzl).collect(taskDescription, absUseCase$doRealRequest$1) == objCopydefault) {
                        }
                    } else {
                        absUseCase$doRealRequest$1.L$0 = this;
                        absUseCase$doRealRequest$1.L$1 = this;
                        absUseCase$doRealRequest$1.label = 3;
                        objKWHzl = KWHzl(absUseCase$doRealRequest$1);
                        if (objKWHzl == objCopydefault) {
                            return objCopydefault;
                        }
                        ?? r103 = this;
                        r2 = r103;
                        r102 = r103;
                        absUseCase$doRealRequest$1.L$0 = r2;
                        absUseCase$doRealRequest$1.L$1 = null;
                        absUseCase$doRealRequest$1.label = 4;
                        if (r102.AEQbTJ((ResponseData) objKWHzl, absUseCase$doRealRequest$1) == objCopydefault) {
                        }
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    z = this;
                    oKServerExceptionOLrzqt = C43422row.OLrzqt(th);
                    pUU.copydefault("AbsUseCaseCoroutine", "handle request catch exception: " + oKServerExceptionOLrzqt);
                    xkzDbNXlk = z.DbNXlk();
                    absUseCase$doRealRequest$1.L$0 = null;
                    absUseCase$doRealRequest$1.L$1 = null;
                    absUseCase$doRealRequest$1.label = 5;
                    if (xkzDbNXlk.OLrzqt(oKServerExceptionOLrzqt, absUseCase$doRealRequest$1) == objCopydefault) {
                    }
                }
            } else if (i2 == 1) {
                xKQ xkq = (xKQ) absUseCase$doRealRequest$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                r10 = xkq;
                taskDescription = new TaskDescription(r10);
                absUseCase$doRealRequest$1.L$0 = r10;
                absUseCase$doRealRequest$1.label = 2;
                if (((Flow) objKWHzl).collect(taskDescription, absUseCase$doRealRequest$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else if (i2 == 2) {
                C56391yDq.AEQbTJ(objKWHzl);
            } else if (i2 == 3) {
                xKQ xkq2 = (xKQ) absUseCase$doRealRequest$1.L$1;
                r2 = (xKQ) absUseCase$doRealRequest$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objKWHzl);
                    r2 = r2;
                    r102 = xkq2;
                    absUseCase$doRealRequest$1.L$0 = r2;
                    absUseCase$doRealRequest$1.L$1 = null;
                    absUseCase$doRealRequest$1.label = 4;
                    if (r102.AEQbTJ((ResponseData) objKWHzl, absUseCase$doRealRequest$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    z = r2;
                    oKServerExceptionOLrzqt = C43422row.OLrzqt(th);
                    pUU.copydefault("AbsUseCaseCoroutine", "handle request catch exception: " + oKServerExceptionOLrzqt);
                    xkzDbNXlk = z.DbNXlk();
                    absUseCase$doRealRequest$1.L$0 = null;
                    absUseCase$doRealRequest$1.L$1 = null;
                    absUseCase$doRealRequest$1.label = 5;
                    if (xkzDbNXlk.OLrzqt(oKServerExceptionOLrzqt, absUseCase$doRealRequest$1) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else if (i2 != 4) {
                if (i2 != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
        return Unit.INSTANCE;
    }

    public static final class TaskDescription<T> implements FlowCollector {
        public final /* synthetic */ xKQ<Resp> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(xKQ<Resp> xkq) {
            this.EZpvd = xkq;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(ResponseData<Resp> responseData, Continuation<? super Unit> continuation) {
            java.lang.Object objAEQbTJ = this.EZpvd.AEQbTJ(responseData, continuation);
            return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
        }
    }

    public final xKZ<Resp, ? extends java.lang.Object> djBIcL() {
        MutableLiveData<?> mutableLiveData = this.fetchVPNInfo;
        TradeLiveData<java.lang.Boolean> tradeLiveDataIsConnected = isConnected();
        InterfaceC56387yDm<C56109xwc<java.lang.Exception>> interfaceC56387yDm = this.gEmmrt;
        InterfaceC54501xKt<Resp, ?> interfaceC54501xKt = this.valueOf;
        boolean z = this.AhwBna;
        boolean z2 = this.DbNXlk;
        Function1<? super ResponseData<Resp>, Unit> function1 = this.isConnected;
        java.lang.reflect.Type genericSuperclass = getClass().getGenericSuperclass();
        Intrinsics.copydefault(genericSuperclass, "");
        java.lang.reflect.Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "");
        java.lang.Object objAuCTelauCTel = yDV.AuCTelauCTel(actualTypeArguments);
        Intrinsics.checkNotNullExpressionValue(objAuCTelauCTel, "");
        return new xKZ<>(mutableLiveData, tradeLiveDataIsConnected, interfaceC56387yDm, interfaceC54501xKt, z, z2, function1, (java.lang.reflect.Type) objAuCTelauCTel, new Function0() { // from class: o.xKS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xKQ.EZpvd(this.OLrzqt);
            }
        });
    }

    public static final Unit EZpvd(xKQ xkq) {
        xkq.fARcdN++;
        return Unit.INSTANCE;
    }

    public final java.lang.Object copydefault(@NotNull Function0<Unit> function0, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new AbsUseCase$doInMain$2(function0, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    @Override // o.xKK
    public LiveData<java.lang.Boolean> AkhnZx() {
        return isConnected();
    }

    /* JADX DEBUG: Method merged with bridge method: AhwBna()Landroidx/lifecycle/LiveData; */
    @Override // o.xKK
    /* JADX INFO: renamed from: fetchVPNInfo, reason: merged with bridge method [inline-methods] */
    public C56109xwc<java.lang.Exception> AhwBna() {
        return this.gEmmrt.getValue();
    }

    @Override // o.InterfaceC54502xKu
    public void AYXKKw() {
        pUU.EZpvd("AbsUseCaseCoroutine", bB_() + " dispose now!!! ");
        Job job = this.djBIcL;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        isConnected().postValue(java.lang.Boolean.FALSE);
    }

    public final java.lang.Object AEQbTJ(ResponseData<Resp> responseData, Continuation<? super Unit> continuation) {
        if (responseData.getCode() == 0) {
            java.lang.Object objKWHzl = DbNXlk().KWHzl(responseData, continuation);
            return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
        }
        java.lang.Object objOLrzqt = DbNXlk().OLrzqt(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null), continuation);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
    }
}
