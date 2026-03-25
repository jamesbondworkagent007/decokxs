package o;

import com.okinc.core.ok_app.modeswitch.OKAppSubModeServiceDelegate$proSubMode_delegate$lambda$1$$inlined$mapNotNull$1$2$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC33249msr;

/* JADX INFO: renamed from: o.mvt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33410mvt extends AbstractC43215rlA implements InterfaceC33232msa {
    public final CoroutineScope EZpvd = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getDefault()));
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.mvq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C33410mvt.AEQbTJ(this.KWHzl);
        }
    });

    public static final StateFlow AEQbTJ(C33410mvt c33410mvt) {
        StateListAnimator stateListAnimator = new StateListAnimator(((InterfaceC33171mrS) C43251rlk.AEQbTJ(C56524yIo.AEQbTJ(InterfaceC33171mrS.class))).values());
        CoroutineScope coroutineScope = c33410mvt.EZpvd;
        SharingStarted lazily = SharingStarted.Companion.getLazily();
        java.lang.Object objEZpvd = C33250mss.EZpvd(((InterfaceC33171mrS) C43251rlk.AEQbTJ(C56524yIo.AEQbTJ(InterfaceC33171mrS.class))).values().getValue());
        if (objEZpvd == null) {
            objEZpvd = AbstractC33249msr.TaskDescription.KWHzl;
        }
        return FlowKt.stateIn(stateListAnimator, coroutineScope, lazily, objEZpvd);
    }

    /* JADX INFO: renamed from: o.mvt$StateListAnimator */
    public static final class StateListAnimator implements Flow<AbstractC33249msr> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: o.mvt$StateListAnimator$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                OKAppSubModeServiceDelegate$proSubMode_delegate$lambda$1$$inlined$mapNotNull$1$2$1 oKAppSubModeServiceDelegate$proSubMode_delegate$lambda$1$$inlined$mapNotNull$1$2$1;
                if (continuation instanceof OKAppSubModeServiceDelegate$proSubMode_delegate$lambda$1$$inlined$mapNotNull$1$2$1) {
                    oKAppSubModeServiceDelegate$proSubMode_delegate$lambda$1$$inlined$mapNotNull$1$2$1 = (OKAppSubModeServiceDelegate$proSubMode_delegate$lambda$1$$inlined$mapNotNull$1$2$1) continuation;
                    int i = oKAppSubModeServiceDelegate$proSubMode_delegate$lambda$1$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        oKAppSubModeServiceDelegate$proSubMode_delegate$lambda$1$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        oKAppSubModeServiceDelegate$proSubMode_delegate$lambda$1$$inlined$mapNotNull$1$2$1 = new OKAppSubModeServiceDelegate$proSubMode_delegate$lambda$1$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = oKAppSubModeServiceDelegate$proSubMode_delegate$lambda$1$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = oKAppSubModeServiceDelegate$proSubMode_delegate$lambda$1$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    AbstractC33249msr abstractC33249msrEZpvd = C33250mss.EZpvd((AbstractC33244msm) obj);
                    if (abstractC33249msrEZpvd != null) {
                        oKAppSubModeServiceDelegate$proSubMode_delegate$lambda$1$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(abstractC33249msrEZpvd, oKAppSubModeServiceDelegate$proSubMode_delegate$lambda$1$$inlined$mapNotNull$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public StateListAnimator(Flow flow) {
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super AbstractC33249msr> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
