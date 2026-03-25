package aws.sdk.kotlin.services.rekognition.paginators;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.C8190ay;
import o.Magnifier;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class PaginatorsKt$projectDescriptions$$inlined$transform$1 extends SuspendLambda implements Function2<FlowCollector<? super C8190ay>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $this_transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaginatorsKt$projectDescriptions$$inlined$transform$1(Flow flow, Continuation continuation) {
        super(2, continuation);
        this.$this_transform = flow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        PaginatorsKt$projectDescriptions$$inlined$transform$1 paginatorsKt$projectDescriptions$$inlined$transform$1 = new PaginatorsKt$projectDescriptions$$inlined$transform$1(this.$this_transform, continuation);
        paginatorsKt$projectDescriptions$$inlined$transform$1.L$0 = obj;
        return paginatorsKt$projectDescriptions$$inlined$transform$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull FlowCollector<? super C8190ay> flowCollector, Continuation<? super Unit> continuation) {
        return ((PaginatorsKt$projectDescriptions$$inlined$transform$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow flow = this.$this_transform;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(flowCollector);
            this.label = 1;
            if (flow.collect(anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: aws.sdk.kotlin.services.rekognition.paginators.PaginatorsKt$projectDescriptions$$inlined$transform$1$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements FlowCollector {
        public final /* synthetic */ FlowCollector<C8190ay> KWHzl;

        /* JADX INFO: renamed from: aws.sdk.kotlin.services.rekognition.paginators.PaginatorsKt$projectDescriptions$$inlined$transform$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01641 extends ContinuationImpl {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public C01641(Continuation continuation) {
                super(continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass1.this.emit(null, this);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(FlowCollector flowCollector) {
            this.KWHzl = flowCollector;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) throws Throwable {
            C01641 c01641;
            FlowCollector<C8190ay> flowCollector;
            Iterator<T> it;
            if (continuation instanceof C01641) {
                c01641 = (C01641) continuation;
                int i = c01641.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c01641.label = i - Integer.MIN_VALUE;
                } else {
                    c01641 = new C01641(continuation);
                }
            }
            Object obj = c01641.result;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = c01641.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                flowCollector = this.KWHzl;
                List<C8190ay> listEZpvd = ((Magnifier) t).EZpvd();
                if (listEZpvd != null) {
                    it = listEZpvd.iterator();
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) c01641.L$1;
            flowCollector = (FlowCollector) c01641.L$0;
            C56391yDq.AEQbTJ(obj);
            while (it.hasNext()) {
                C8190ay c8190ay = (C8190ay) it.next();
                c01641.L$0 = flowCollector;
                c01641.L$1 = it;
                c01641.label = 1;
                if (flowCollector.emit(c8190ay, c01641) == objCopydefault) {
                    return objCopydefault;
                }
            }
            return Unit.INSTANCE;
        }
    }
}
