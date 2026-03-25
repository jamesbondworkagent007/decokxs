package aws.sdk.kotlin.services.cognitoidentityprovider.paginators;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.CantAddAccountActivity;
import o.PSpecified;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class PaginatorsKt$authEvents$$inlined$transform$1 extends SuspendLambda implements Function2<FlowCollector<? super CantAddAccountActivity>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $this_transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaginatorsKt$authEvents$$inlined$transform$1(Flow flow, Continuation continuation) {
        super(2, continuation);
        this.$this_transform = flow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        PaginatorsKt$authEvents$$inlined$transform$1 paginatorsKt$authEvents$$inlined$transform$1 = new PaginatorsKt$authEvents$$inlined$transform$1(this.$this_transform, continuation);
        paginatorsKt$authEvents$$inlined$transform$1.L$0 = obj;
        return paginatorsKt$authEvents$$inlined$transform$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull FlowCollector<? super CantAddAccountActivity> flowCollector, Continuation<? super Unit> continuation) {
        return ((PaginatorsKt$authEvents$$inlined$transform$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow flow = this.$this_transform;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(flowCollector);
            this.label = 1;
            if (flow.collect(anonymousClass3, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: aws.sdk.kotlin.services.cognitoidentityprovider.paginators.PaginatorsKt$authEvents$$inlined$transform$1$3, reason: invalid class name */
    public static final class AnonymousClass3<T> implements FlowCollector {
        public final /* synthetic */ FlowCollector<CantAddAccountActivity> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass3(FlowCollector flowCollector) {
            this.OLrzqt = flowCollector;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) throws Throwable {
            PaginatorsKt$authEvents$$inlined$transform$1$1$1 paginatorsKt$authEvents$$inlined$transform$1$1$1;
            FlowCollector<CantAddAccountActivity> flowCollector;
            Iterator<T> it;
            if (continuation instanceof PaginatorsKt$authEvents$$inlined$transform$1$1$1) {
                paginatorsKt$authEvents$$inlined$transform$1$1$1 = (PaginatorsKt$authEvents$$inlined$transform$1$1$1) continuation;
                int i = paginatorsKt$authEvents$$inlined$transform$1$1$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    paginatorsKt$authEvents$$inlined$transform$1$1$1.label = i - Integer.MIN_VALUE;
                } else {
                    paginatorsKt$authEvents$$inlined$transform$1$1$1 = new PaginatorsKt$authEvents$$inlined$transform$1$1$1(this, continuation);
                }
            }
            Object obj = paginatorsKt$authEvents$$inlined$transform$1$1$1.result;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = paginatorsKt$authEvents$$inlined$transform$1$1$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                flowCollector = this.OLrzqt;
                List<CantAddAccountActivity> listKWHzl = ((PSpecified) t).KWHzl();
                if (listKWHzl != null) {
                    it = listKWHzl.iterator();
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) paginatorsKt$authEvents$$inlined$transform$1$1$1.L$1;
            flowCollector = (FlowCollector) paginatorsKt$authEvents$$inlined$transform$1$1$1.L$0;
            C56391yDq.AEQbTJ(obj);
            while (it.hasNext()) {
                CantAddAccountActivity cantAddAccountActivity = (CantAddAccountActivity) it.next();
                paginatorsKt$authEvents$$inlined$transform$1$1$1.L$0 = flowCollector;
                paginatorsKt$authEvents$$inlined$transform$1$1$1.L$1 = it;
                paginatorsKt$authEvents$$inlined$transform$1$1$1.label = 1;
                if (flowCollector.emit(cantAddAccountActivity, paginatorsKt$authEvents$$inlined$transform$1$1$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
            return Unit.INSTANCE;
        }
    }
}
