package aws.sdk.kotlin.runtime.config.imds;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.C57631ym;
import o.InvalidClassException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ImdsEndpointProvider$resolvedEndpoint$1 extends FunctionReferenceImpl implements Function1<Continuation<? super C57631ym>, Object> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ImdsEndpointProvider$resolvedEndpoint$1(Object obj) {
        super(1, obj, InvalidClassException.class, "doResolveEndpoint", "doResolveEndpoint(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(@NotNull Continuation<? super C57631ym> continuation) {
        return ((InvalidClassException) this.receiver).KWHzl(continuation);
    }
}
