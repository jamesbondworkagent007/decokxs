package o;

import com.okinc.core.ok_app.modeswitch.OKLiteAppServiceDelegate$liteSubMode_delegate$lambda$1$$inlined$mapNotNull$1$2$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
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
import o.AbstractC33240msi;
import o.InterfaceC33171mrS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mvx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33414mvx extends AbstractC43215rlA implements InterfaceC33236mse {
    public final CoroutineScope copydefault = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getDefault()));
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.mvu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C33414mvx.KWHzl(this.AEQbTJ);
        }
    });

    private final InterfaceC33171mrS KWHzl() {
        return (InterfaceC33171mrS) C43251rlk.AEQbTJ(C56524yIo.AEQbTJ(InterfaceC33171mrS.class));
    }

    public static final StateFlow KWHzl(C33414mvx c33414mvx) {
        TaskDescription taskDescription = new TaskDescription(((InterfaceC33171mrS) C43251rlk.AEQbTJ(C56524yIo.AEQbTJ(InterfaceC33171mrS.class))).values());
        CoroutineScope coroutineScope = c33414mvx.copydefault;
        SharingStarted eagerly = SharingStarted.Companion.getEagerly();
        java.lang.Object objCopydefault = C33239msh.copydefault(((InterfaceC33171mrS) C43251rlk.AEQbTJ(C56524yIo.AEQbTJ(InterfaceC33171mrS.class))).values().getValue());
        if (objCopydefault == null) {
            objCopydefault = AbstractC33240msi.Activity.OLrzqt;
        }
        return FlowKt.stateIn(taskDescription, coroutineScope, eagerly, objCopydefault);
    }

    /* JADX INFO: renamed from: o.mvx$TaskDescription */
    public static final class TaskDescription implements Flow<AbstractC33240msi> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.mvx$TaskDescription$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                OKLiteAppServiceDelegate$liteSubMode_delegate$lambda$1$$inlined$mapNotNull$1$2$1 oKLiteAppServiceDelegate$liteSubMode_delegate$lambda$1$$inlined$mapNotNull$1$2$1;
                if (continuation instanceof OKLiteAppServiceDelegate$liteSubMode_delegate$lambda$1$$inlined$mapNotNull$1$2$1) {
                    oKLiteAppServiceDelegate$liteSubMode_delegate$lambda$1$$inlined$mapNotNull$1$2$1 = (OKLiteAppServiceDelegate$liteSubMode_delegate$lambda$1$$inlined$mapNotNull$1$2$1) continuation;
                    int i = oKLiteAppServiceDelegate$liteSubMode_delegate$lambda$1$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        oKLiteAppServiceDelegate$liteSubMode_delegate$lambda$1$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        oKLiteAppServiceDelegate$liteSubMode_delegate$lambda$1$$inlined$mapNotNull$1$2$1 = new OKLiteAppServiceDelegate$liteSubMode_delegate$lambda$1$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = oKLiteAppServiceDelegate$liteSubMode_delegate$lambda$1$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = oKLiteAppServiceDelegate$liteSubMode_delegate$lambda$1$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    AbstractC33244msm abstractC33244msm = (AbstractC33244msm) obj;
                    AbstractC33240msi abstractC33240msiCopydefault = C33239msh.copydefault(abstractC33244msm);
                    pUU.KWHzl("ModeSwitch-Legacy", "liteSubMode from OKAppService: " + abstractC33244msm + " -> " + abstractC33240msiCopydefault);
                    if (abstractC33240msiCopydefault != null) {
                        oKLiteAppServiceDelegate$liteSubMode_delegate$lambda$1$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(abstractC33240msiCopydefault, oKLiteAppServiceDelegate$liteSubMode_delegate$lambda$1$$inlined$mapNotNull$1$2$1) == objCopydefault) {
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

        public TaskDescription(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super AbstractC33240msi> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // o.InterfaceC33236mse
    public java.lang.Object copydefault(@NotNull AbstractC33240msi abstractC33240msi, @NotNull android.content.Context context, android.os.Bundle bundle, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return InterfaceC33171mrS.Activity.switchSubMode$default(KWHzl(), C33239msh.OLrzqt(abstractC33240msi), context, false, bundle, continuation, 4, null);
    }

    @Override // o.InterfaceC33236mse
    public boolean KWHzl(@NotNull AbstractC33240msi abstractC33240msi) {
        Intrinsics.checkNotNullParameter(abstractC33240msi, "");
        return KWHzl().KWHzl(C33239msh.OLrzqt(abstractC33240msi));
    }
}
