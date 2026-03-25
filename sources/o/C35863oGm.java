package o;

import com.okinc.im.usecase.relationinfo.ObserveRelationInfoByConversationIdUseCase$execute$$inlined$map$1$2$1;
import com.okinc.im.usecase.relationinfo.ObserveRelationInfoByConversationIdUseCase$execute$2;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oGm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35863oGm {
    public final C35862oGl AEQbTJ;
    public final oCI EZpvd;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C35863oGm(@NotNull C35862oGl c35862oGl, @NotNull oCI oci, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c35862oGl, "");
        Intrinsics.checkNotNullParameter(oci, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = c35862oGl;
        this.EZpvd = oci;
        this.copydefault = coroutineDispatcher;
    }

    public final Flow<RelationInfo> EZpvd(java.lang.String str) {
        return FlowKt.flowOn(FlowKt.flatMapConcat(FlowKt.distinctUntilChanged(new Application(this.EZpvd.KWHzl(str))), new ObserveRelationInfoByConversationIdUseCase$execute$2(this, null)), this.copydefault);
    }

    /* JADX INFO: renamed from: o.oGm$Application */
    public static final class Application implements Flow<java.lang.String> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: o.oGm$Application$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ObserveRelationInfoByConversationIdUseCase$execute$$inlined$map$1$2$1 observeRelationInfoByConversationIdUseCase$execute$$inlined$map$1$2$1;
                if (continuation instanceof ObserveRelationInfoByConversationIdUseCase$execute$$inlined$map$1$2$1) {
                    observeRelationInfoByConversationIdUseCase$execute$$inlined$map$1$2$1 = (ObserveRelationInfoByConversationIdUseCase$execute$$inlined$map$1$2$1) continuation;
                    int i = observeRelationInfoByConversationIdUseCase$execute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        observeRelationInfoByConversationIdUseCase$execute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        observeRelationInfoByConversationIdUseCase$execute$$inlined$map$1$2$1 = new ObserveRelationInfoByConversationIdUseCase$execute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = observeRelationInfoByConversationIdUseCase$execute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = observeRelationInfoByConversationIdUseCase$execute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    OKConversation oKConversation = (OKConversation) obj;
                    java.lang.String strCopydefault = oKConversation != null ? C44166sFt.copydefault(oKConversation) : null;
                    observeRelationInfoByConversationIdUseCase$execute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(strCopydefault, observeRelationInfoByConversationIdUseCase$execute$$inlined$map$1$2$1) == objCopydefault) {
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

        public Application(Flow flow) {
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.lang.String> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
