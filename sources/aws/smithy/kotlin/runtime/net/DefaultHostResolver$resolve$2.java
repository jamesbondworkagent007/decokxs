package aws.smithy.kotlin.runtime.net;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.DD;
import o.DF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultHostResolver$resolve$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends DD>>, Object> {
    final /* synthetic */ String $hostname;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultHostResolver$resolve$2(String str, Continuation<? super DefaultHostResolver$resolve$2> continuation) {
        super(2, continuation);
        this.$hostname = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new DefaultHostResolver$resolve$2(this.$hostname, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends DD>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<DD>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@NotNull CoroutineScope coroutineScope, Continuation<? super List<DD>> continuation) {
        return ((DefaultHostResolver$resolve$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InetAddress[] allByName = InetAddress.getAllByName(this.$hostname);
            Intrinsics.checkNotNullExpressionValue(allByName, "");
            ArrayList arrayList = new ArrayList(allByName.length);
            for (InetAddress inetAddress : allByName) {
                Intrinsics.copydefault(inetAddress);
                arrayList.add(DF.copydefault(inetAddress));
            }
            return arrayList;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
