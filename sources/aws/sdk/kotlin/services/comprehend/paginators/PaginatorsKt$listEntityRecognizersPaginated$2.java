package aws.sdk.kotlin.services.comprehend.paginators;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.LocalSocket;
import o.UserManagerInternal;
import o.Vibrator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class PaginatorsKt$listEntityRecognizersPaginated$2 extends SuspendLambda implements Function2<FlowCollector<? super UserManagerInternal>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Vibrator $initialRequest;
    final /* synthetic */ LocalSocket $this_listEntityRecognizersPaginated;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaginatorsKt$listEntityRecognizersPaginated$2(Vibrator vibrator, LocalSocket localSocket, Continuation<? super PaginatorsKt$listEntityRecognizersPaginated$2> continuation) {
        super(2, continuation);
        this.$initialRequest = vibrator;
        this.$this_listEntityRecognizersPaginated = localSocket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        PaginatorsKt$listEntityRecognizersPaginated$2 paginatorsKt$listEntityRecognizersPaginated$2 = new PaginatorsKt$listEntityRecognizersPaginated$2(this.$initialRequest, this.$this_listEntityRecognizersPaginated, continuation);
        paginatorsKt$listEntityRecognizersPaginated$2.L$0 = obj;
        return paginatorsKt$listEntityRecognizersPaginated$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull FlowCollector<? super UserManagerInternal> flowCollector, Continuation<? super Unit> continuation) {
        return ((PaginatorsKt$listEntityRecognizersPaginated$2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:17:0x006d, B:20:0x0075], limit reached: 26 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0082 -> B:11:0x0040). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        FlowCollector flowCollector;
        Ref.ObjectRef objectRef;
        int i;
        UserManagerInternal userManagerInternal;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            objectRef = new Ref.ObjectRef();
            i = 1;
        } else if (i2 == 1) {
            Ref.ObjectRef objectRef2 = (Ref.ObjectRef) this.L$1;
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
            flowCollector = flowCollector2;
            objectRef = objectRef2;
            userManagerInternal = (UserManagerInternal) obj;
            ?? KWHzl = userManagerInternal.KWHzl();
            objectRef.element = KWHzl;
            i = (KWHzl != 0 || KWHzl.length() <= 0) ? 0 : 1;
            this.L$0 = flowCollector;
            this.L$1 = objectRef;
            this.I$0 = i;
            this.label = 2;
            if (flowCollector.emit(userManagerInternal, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            objectRef = (Ref.ObjectRef) this.L$1;
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (i == 0) {
            Vibrator.Activity activity = new Vibrator.Activity(this.$initialRequest);
            activity.KWHzl((String) objectRef.element);
            Vibrator vibratorCopydefault = activity.copydefault();
            LocalSocket localSocket = this.$this_listEntityRecognizersPaginated;
            this.L$0 = flowCollector;
            this.L$1 = objectRef;
            this.label = 1;
            obj = localSocket.EZpvd(vibratorCopydefault, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            userManagerInternal = (UserManagerInternal) obj;
            ?? KWHzl2 = userManagerInternal.KWHzl();
            objectRef.element = KWHzl2;
            if (KWHzl2 != 0) {
            }
            this.L$0 = flowCollector;
            this.L$1 = objectRef;
            this.I$0 = i;
            this.label = 2;
            if (flowCollector.emit(userManagerInternal, this) == objCopydefault) {
            }
            if (i == 0) {
                return Unit.INSTANCE;
            }
        }
    }
}
