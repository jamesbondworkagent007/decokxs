package aws.sdk.kotlin.services.rekognition.waiters;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C56391yDq;
import o.C56442yFn;
import o.ListAdapter;
import o.ListPopupWindow;
import o.UrlInterceptRegistry;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class WaitersKt$waitUntilProjectVersionRunning$2 extends SuspendLambda implements Function1<Continuation<? super ListAdapter>, Object> {
    final /* synthetic */ ListPopupWindow $request;
    final /* synthetic */ UrlInterceptRegistry $this_waitUntilProjectVersionRunning;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaitersKt$waitUntilProjectVersionRunning$2(UrlInterceptRegistry urlInterceptRegistry, ListPopupWindow listPopupWindow, Continuation<? super WaitersKt$waitUntilProjectVersionRunning$2> continuation) {
        super(1, continuation);
        this.$this_waitUntilProjectVersionRunning = urlInterceptRegistry;
        this.$request = listPopupWindow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new WaitersKt$waitUntilProjectVersionRunning$2(this.$this_waitUntilProjectVersionRunning, this.$request, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ListAdapter> continuation) {
        return ((WaitersKt$waitUntilProjectVersionRunning$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            UrlInterceptRegistry urlInterceptRegistry = this.$this_waitUntilProjectVersionRunning;
            ListPopupWindow listPopupWindow = this.$request;
            this.label = 1;
            obj = urlInterceptRegistry.EZpvd(listPopupWindow, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
