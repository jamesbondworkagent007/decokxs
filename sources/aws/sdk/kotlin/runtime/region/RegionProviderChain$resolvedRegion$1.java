package aws.sdk.kotlin.runtime.region;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.Boolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RegionProviderChain$resolvedRegion$1 extends FunctionReferenceImpl implements Function1<Continuation<? super String>, Object> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RegionProviderChain$resolvedRegion$1(Object obj) {
        super(1, obj, Boolean.class, "resolveRegion", "resolveRegion(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(@NotNull Continuation<? super String> continuation) {
        return ((Boolean) this.receiver).AEQbTJ(continuation);
    }
}
