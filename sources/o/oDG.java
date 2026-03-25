package o;

import com.okinc.im.usecase.group.info.ObserveGroupInfoByConversationIdUseCase$execute$$inlined$map$1$2$1;
import com.okinc.im.usecase.group.info.ObserveGroupInfoByConversationIdUseCase$execute$2;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oDG {
    public final oCI AEQbTJ;
    public final oDI OLrzqt;
    public final CoroutineDispatcher copydefault;

    @yCM
    public oDG(@NotNull oDI odi, @NotNull oCI oci, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(odi, "");
        Intrinsics.checkNotNullParameter(oci, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = odi;
        this.AEQbTJ = oci;
        this.copydefault = coroutineDispatcher;
    }

    public final Flow<GroupInfo> AEQbTJ(java.lang.String str) {
        return FlowKt.flowOn(FlowKt.flatMapConcat(FlowKt.distinctUntilChanged(new ActionBar(this.AEQbTJ.KWHzl(str))), new ObserveGroupInfoByConversationIdUseCase$execute$2(this, null)), this.copydefault);
    }

    public static final class ActionBar implements Flow<java.lang.String> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.oDG$ActionBar$5, reason: invalid class name */
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
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ObserveGroupInfoByConversationIdUseCase$execute$$inlined$map$1$2$1 observeGroupInfoByConversationIdUseCase$execute$$inlined$map$1$2$1;
                if (continuation instanceof ObserveGroupInfoByConversationIdUseCase$execute$$inlined$map$1$2$1) {
                    observeGroupInfoByConversationIdUseCase$execute$$inlined$map$1$2$1 = (ObserveGroupInfoByConversationIdUseCase$execute$$inlined$map$1$2$1) continuation;
                    int i = observeGroupInfoByConversationIdUseCase$execute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        observeGroupInfoByConversationIdUseCase$execute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        observeGroupInfoByConversationIdUseCase$execute$$inlined$map$1$2$1 = new ObserveGroupInfoByConversationIdUseCase$execute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = observeGroupInfoByConversationIdUseCase$execute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = observeGroupInfoByConversationIdUseCase$execute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    OKConversation oKConversation = (OKConversation) obj;
                    java.lang.String strKWHzl = oKConversation != null ? C44166sFt.KWHzl(oKConversation) : null;
                    observeGroupInfoByConversationIdUseCase$execute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(strKWHzl, observeGroupInfoByConversationIdUseCase$execute$$inlined$map$1$2$1) == objCopydefault) {
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

        public ActionBar(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.lang.String> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
