package o;

import com.okinc.okimcore.model.biz.relationlocal.PhoneRelationGroup;
import com.okinc.okimcore.usecase.phonerelations.GetPhoneRelationGroupByHashesFlowUseCase$execute$$inlined$map$1$2$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sSq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44514sSq {
    public final C44358sMw AEQbTJ;

    @yCM
    public C44514sSq(@NotNull C44358sMw c44358sMw) {
        Intrinsics.checkNotNullParameter(c44358sMw, "");
        this.AEQbTJ = c44358sMw;
    }

    public final Flow<java.util.List<PhoneRelationGroup>> EZpvd(@NotNull java.util.Set<java.lang.String> set) {
        Intrinsics.checkNotNullParameter(set, "");
        return new StateListAnimator(FlowKt.distinctUntilChanged(this.AEQbTJ.getPhoneRelationsByHashesAsFlow(set)));
    }

    /* JADX INFO: renamed from: o.sSq$StateListAnimator */
    public static final class StateListAnimator implements Flow<java.util.List<? extends PhoneRelationGroup>> {
        public final /* synthetic */ Flow EZpvd;

        public StateListAnimator(Flow flow) {
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(@NotNull FlowCollector<? super java.util.List<? extends PhoneRelationGroup>> flowCollector, @NotNull Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.sSq$StateListAnimator$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, @NotNull Continuation continuation) throws java.lang.Throwable {
                GetPhoneRelationGroupByHashesFlowUseCase$execute$$inlined$map$1$2$1 getPhoneRelationGroupByHashesFlowUseCase$execute$$inlined$map$1$2$1;
                if (continuation instanceof GetPhoneRelationGroupByHashesFlowUseCase$execute$$inlined$map$1$2$1) {
                    getPhoneRelationGroupByHashesFlowUseCase$execute$$inlined$map$1$2$1 = (GetPhoneRelationGroupByHashesFlowUseCase$execute$$inlined$map$1$2$1) continuation;
                    int i = getPhoneRelationGroupByHashesFlowUseCase$execute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        getPhoneRelationGroupByHashesFlowUseCase$execute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        getPhoneRelationGroupByHashesFlowUseCase$execute$$inlined$map$1$2$1 = new GetPhoneRelationGroupByHashesFlowUseCase$execute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = getPhoneRelationGroupByHashesFlowUseCase$execute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = getPhoneRelationGroupByHashesFlowUseCase$execute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    java.util.List<PhoneRelationGroup> listCopydefault = C44523sSz.copydefault((java.util.List) obj);
                    getPhoneRelationGroupByHashesFlowUseCase$execute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(listCopydefault, getPhoneRelationGroupByHashesFlowUseCase$execute$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
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
    }
}
