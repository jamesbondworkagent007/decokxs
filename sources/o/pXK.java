package o;

import com.okinc.market.datamanager.MarketDumpDataManager$updateGropuData$1;
import com.okinc.market.datamanager.MarketDumpDataManager$updateGroupImpl$1;
import com.okinc.unify_trade.biz.ChargeGroupData;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pXK {
    public static final pXK copydefault = new pXK();
    public static final CoroutineScope AEQbTJ = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null)));
    public static final ConcurrentHashMap<java.lang.String, Job> AhwBna = new ConcurrentHashMap<>();
    public static Activity KWHzl = Activity.StateListAnimator.copydefault;
    public static final ConcurrentHashMap<Activity, java.util.Map<java.lang.Object, Job>> EZpvd = new ConcurrentHashMap<>();
    public static final int OLrzqt = 8;

    private pXK() {
    }

    public final void OLrzqt(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (Intrinsics.EZpvd(KWHzl, activity)) {
            return;
        }
        KWHzl = activity;
        AhwBna.clear();
    }

    public static /* synthetic */ void requestDateGroupData$default(pXK pxk, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        pxk.copydefault(z);
    }

    public final void copydefault(boolean z) {
        if (Intrinsics.EZpvd(KWHzl, Activity.StateListAnimator.copydefault)) {
            AEQbTJ();
            return;
        }
        Job job = AhwBna.get("GroupTask");
        if (job == null) {
            AEQbTJ();
        } else {
            if (job.isActive() || !z) {
                return;
            }
            AEQbTJ();
        }
    }

    public final void AEQbTJ() {
        AhwBna.put("GroupTask", BuildersKt__Builders_commonKt.launch$default(AEQbTJ, null, null, new MarketDumpDataManager$updateGropuData$1(null), 3, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MarketDumpDataManager$updateGroupImpl$1 marketDumpDataManager$updateGroupImpl$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof MarketDumpDataManager$updateGroupImpl$1) {
            marketDumpDataManager$updateGroupImpl$1 = (MarketDumpDataManager$updateGroupImpl$1) continuation;
            int i = marketDumpDataManager$updateGroupImpl$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketDumpDataManager$updateGroupImpl$1.label = i - Integer.MIN_VALUE;
            } else {
                marketDumpDataManager$updateGroupImpl$1 = new MarketDumpDataManager$updateGroupImpl$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = marketDumpDataManager$updateGroupImpl$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketDumpDataManager$updateGroupImpl$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                C54452xIy c54452xIy = new C54452xIy();
                Result.Application application = Result.Companion;
                pXK pxk = copydefault;
                marketDumpDataManager$updateGroupImpl$1.label = 1;
                objKWHzl = pxk.KWHzl(c54452xIy, marketDumpDataManager$updateGroupImpl$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) objKWHzl);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            java.util.List<ChargeGroupData> list = (java.util.List) objM7377constructorimpl;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
            if (interfaceC54581xNrOLrzqt != null) {
                interfaceC54581xNrOLrzqt.KWHzl(list);
            }
        }
        return Unit.INSTANCE;
    }

    public static final class Application implements InterfaceC55701xos<java.util.List<? extends ChargeGroupData>> {
        public final /* synthetic */ CancellableContinuation<java.util.List<ChargeGroupData>> EZpvd;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.util.List<com.okinc.unify_trade.biz.ChargeGroupData>> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(CancellableContinuation<? super java.util.List<ChargeGroupData>> cancellableContinuation) {
            this.EZpvd = cancellableContinuation;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<ChargeGroupData> list, java.lang.Exception exc) {
            if (z && C33129mqd.KWHzl((java.util.Collection) list)) {
                CancellableContinuation<java.util.List<ChargeGroupData>> cancellableContinuation = this.EZpvd;
                Result.Application application = Result.Companion;
                Intrinsics.copydefault(list);
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(list));
                return;
            }
            CancellableContinuation<java.util.List<ChargeGroupData>> cancellableContinuation2 = this.EZpvd;
            Result.Application application2 = Result.Companion;
            if (exc == null) {
                exc = new java.lang.Exception("requestTradeGroup failed");
            }
            cancellableContinuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(exc)));
        }
    }

    public static final class StateListAnimator implements Function1<java.lang.Throwable, Unit> {
        public final /* synthetic */ InterfaceC58217yxC AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(InterfaceC58217yxC interfaceC58217yxC) {
            this.AEQbTJ = interfaceC58217yxC;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            OLrzqt(th);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(java.lang.Throwable th) {
            this.AEQbTJ.dispose();
        }
    }

    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pXK.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class Application extends Activity {
            public static final Application KWHzl = new Application();

            private Application() {
                super(null);
            }
        }

        private Activity() {
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class ActionBar extends Activity {
            public static final ActionBar copydefault = new ActionBar();

            private ActionBar() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.pXK$Activity$Activity, reason: collision with other inner class name */
        public static final class C0916Activity extends Activity {
            public static final C0916Activity KWHzl = new C0916Activity();

            private C0916Activity() {
                super(null);
            }
        }

        public static final class StateListAnimator extends Activity {
            public static final StateListAnimator copydefault = new StateListAnimator();

            private StateListAnimator() {
                super(null);
            }
        }
    }

    public final java.lang.Object KWHzl(C54452xIy c54452xIy, Continuation<? super java.util.List<ChargeGroupData>> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new StateListAnimator(c54452xIy.OLrzqt(new Application(cancellableContinuationImpl))));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }
}
