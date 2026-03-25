package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.unify_trade.core.base.FlowWrapper$postValue$1;
import com.okinc.unify_trade.core.base.FlowWrapper$safeEmit$1;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xwt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56126xwt<T> {
    public final Function1<java.lang.Throwable, Unit> AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final Flow<T> EZpvd;
    public final int KWHzl;
    public final java.util.List<Job> OLrzqt;
    public final boolean copydefault;
    public final CoroutineScope djBIcL;
    public final InterfaceC56387yDm valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C56126xwt() {
        this(null, null, null, false, 0, null, 63, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlinx.coroutines.flow.Flow<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C56126xwt(CoroutineScope coroutineScope, Flow<? extends T> flow, final T t, boolean z, int i, @NotNull Function1<? super java.lang.Throwable, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.djBIcL = coroutineScope;
        this.EZpvd = flow;
        this.copydefault = z;
        this.KWHzl = i;
        this.AEQbTJ = function1;
        this.OLrzqt = new java.util.ArrayList();
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.xwv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C56126xwt.copydefault(this.KWHzl);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.xwr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C56126xwt.copydefault(t);
            }
        });
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0034: CONSTRUCTOR 
  (wrap:kotlinx.coroutines.CoroutineScope:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.coroutines.CoroutineScope) : (r5v0 kotlinx.coroutines.CoroutineScope))
  (wrap:kotlinx.coroutines.flow.Flow:?: TERNARY null = ((wrap:int:0x0008: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.coroutines.flow.Flow) : (r6v0 kotlinx.coroutines.flow.Flow))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x000f: ARITH (r11v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.Object) : (null java.lang.Object))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0015: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001d: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r9v0 int))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0024: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x002a: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:29) call: o.xws.<init>():void type: CONSTRUCTOR) : (r10v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlinx.coroutines.CoroutineScope, kotlinx.coroutines.flow.Flow<? extends T>, T, boolean, int, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>):void (m)] (LINE:23) call: o.xwt.<init>(kotlinx.coroutines.CoroutineScope, kotlinx.coroutines.flow.Flow, java.lang.Object, boolean, int, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C56126xwt(CoroutineScope coroutineScope, Flow flow, java.lang.Object obj, boolean z, int i, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : coroutineScope, (i2 & 2) != 0 ? null : flow, (i2 & 4) == 0 ? obj : null, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? new Function1() { // from class: o.xws
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C56126xwt.EZpvd((java.lang.Throwable) obj2);
            }
        } : function1);
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        pUU.copydefault("FlowException", "Flow observe error: " + th.getMessage());
        th.printStackTrace();
        return Unit.INSTANCE;
    }

    public final MutableSharedFlow<T> KWHzl() {
        return (MutableSharedFlow) this.AYXKKw.getValue();
    }

    public static final MutableSharedFlow copydefault(C56126xwt c56126xwt) {
        return SharedFlowKt.MutableSharedFlow$default(c56126xwt.KWHzl, 1, null, 4, null);
    }

    public final MutableStateFlow<T> EZpvd() {
        return (MutableStateFlow) this.valueOf.getValue();
    }

    public static final MutableStateFlow copydefault(java.lang.Object obj) {
        if (obj == null) {
            obj = new java.lang.Object();
        }
        return StateFlowKt.MutableStateFlow(obj);
    }

    public final Flow<T> copydefault() {
        Flow<T> flow = this.EZpvd;
        return flow == null ? this.copydefault ? EZpvd() : KWHzl() : flow;
    }

    public final void AEQbTJ(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C54805xVz.EZpvd(copydefault(), lifecycleOwner, function1, this.AEQbTJ);
    }

    public final void EZpvd(@NotNull LifecycleOwner lifecycleOwner, @NotNull Observer<T> observer) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(observer, "");
        final WeakReference weakReference = new WeakReference(observer);
        AEQbTJ(lifecycleOwner, new Function1() { // from class: o.xwu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C56126xwt.KWHzl(weakReference, obj);
            }
        });
    }

    public static final Unit KWHzl(WeakReference weakReference, java.lang.Object obj) {
        Observer observer = (Observer) weakReference.get();
        if (observer != null) {
            observer.onChanged(obj);
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(T t) {
        CoroutineScope coroutineScope = this.djBIcL;
        if (coroutineScope != null) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FlowWrapper$postValue$1(this, t, null), 3, null);
            return;
        }
        throw new java.lang.IllegalArgumentException("scope is null");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(T t, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        FlowWrapper$safeEmit$1 flowWrapper$safeEmit$1;
        java.lang.Throwable th;
        C56126xwt<T> c56126xwt;
        FlowCollector flowCollector;
        if (continuation instanceof FlowWrapper$safeEmit$1) {
            flowWrapper$safeEmit$1 = (FlowWrapper$safeEmit$1) continuation;
            int i = flowWrapper$safeEmit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowWrapper$safeEmit$1.label = i - Integer.MIN_VALUE;
            } else {
                flowWrapper$safeEmit$1 = new FlowWrapper$safeEmit$1(this, continuation);
            }
        }
        java.lang.Object obj = flowWrapper$safeEmit$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = flowWrapper$safeEmit$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                if (this.copydefault) {
                    Flow<T> flowCopydefault = copydefault();
                    flowCollector = flowCopydefault instanceof MutableStateFlow ? (MutableStateFlow) flowCopydefault : null;
                    if (flowCollector != null) {
                        flowWrapper$safeEmit$1.L$0 = this;
                        flowWrapper$safeEmit$1.label = 1;
                        if (flowCollector.emit(t, flowWrapper$safeEmit$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    Flow<T> flowCopydefault2 = copydefault();
                    flowCollector = flowCopydefault2 instanceof MutableSharedFlow ? (MutableSharedFlow) flowCopydefault2 : null;
                    if (flowCollector != null) {
                        flowWrapper$safeEmit$1.L$0 = this;
                        flowWrapper$safeEmit$1.label = 2;
                        if (flowCollector.emit(t, flowWrapper$safeEmit$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                c56126xwt = this;
                if (th instanceof CancellationException) {
                    c56126xwt.AEQbTJ.invoke(th);
                } else {
                    throw th;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c56126xwt = (C56126xwt) flowWrapper$safeEmit$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (java.lang.Throwable th3) {
                th = th3;
                if (th instanceof CancellationException) {
                }
            }
        }
        return Unit.INSTANCE;
    }
}
