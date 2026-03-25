package aws.sdk.kotlin.runtime.region;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.ArithmeticException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ImdsRegionProvider$resolvedRegion$1 extends FunctionReferenceImpl implements Function1<Continuation<? super String>, Object> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ImdsRegionProvider$resolvedRegion$1(Object obj) {
        super(1, obj, ArithmeticException.class, "loadRegion", "loadRegion(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(@NotNull Continuation<? super String> continuation) {
        return ((ArithmeticException) this.receiver).OLrzqt(continuation);
    }
}
