package o;

import com.okinc.im.usecase.message.ObserveReferenceMessageIdUseCase$execute$$inlined$map$1$2$1;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.room.inhouseim.DraftMessageModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oEp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35812oEp {
    public final oCI EZpvd;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C35812oEp(@NotNull oCI oci, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(oci, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = oci;
        this.OLrzqt = coroutineDispatcher;
    }

    public final Flow<java.lang.Long> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FlowKt.flowOn(FlowKt.distinctUntilChanged(new TaskDescription(this.EZpvd.KWHzl(str))), this.OLrzqt);
    }

    /* JADX INFO: renamed from: o.oEp$TaskDescription */
    public static final class TaskDescription implements Flow<java.lang.Long> {
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: o.oEp$TaskDescription$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ObserveReferenceMessageIdUseCase$execute$$inlined$map$1$2$1 observeReferenceMessageIdUseCase$execute$$inlined$map$1$2$1;
                DraftMessageModel draftMessageModel;
                java.lang.String quotedMessageId;
                if (continuation instanceof ObserveReferenceMessageIdUseCase$execute$$inlined$map$1$2$1) {
                    observeReferenceMessageIdUseCase$execute$$inlined$map$1$2$1 = (ObserveReferenceMessageIdUseCase$execute$$inlined$map$1$2$1) continuation;
                    int i = observeReferenceMessageIdUseCase$execute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        observeReferenceMessageIdUseCase$execute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        observeReferenceMessageIdUseCase$execute$$inlined$map$1$2$1 = new ObserveReferenceMessageIdUseCase$execute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = observeReferenceMessageIdUseCase$execute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = observeReferenceMessageIdUseCase$execute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    OKConversation oKConversation = (OKConversation) obj;
                    java.lang.Long fieldNames = (oKConversation == null || (draftMessageModel = oKConversation.getDraftMessageModel()) == null || (quotedMessageId = draftMessageModel.getQuotedMessageId()) == null) ? null : StringsKt__StringNumberConversionsKt.getFieldNames(quotedMessageId);
                    observeReferenceMessageIdUseCase$execute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(fieldNames, observeReferenceMessageIdUseCase$execute$$inlined$map$1$2$1) == objCopydefault) {
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

        public TaskDescription(Flow flow) {
            this.KWHzl = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.lang.Long> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
