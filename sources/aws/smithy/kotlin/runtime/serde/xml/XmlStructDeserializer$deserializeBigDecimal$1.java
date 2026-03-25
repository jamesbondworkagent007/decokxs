package aws.smithy.kotlin.runtime.serde.xml;

import aws.smithy.kotlin.runtime.serde.DeserializationException;
import java.math.BigDecimal;
import kotlin.Result;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.C5131Fx;
import o.C56391yDq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class XmlStructDeserializer$deserializeBigDecimal$1 extends Lambda implements Function1<String, BigDecimal> {
    final /* synthetic */ C5131Fx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XmlStructDeserializer$deserializeBigDecimal$1(C5131Fx c5131Fx) {
        super(1);
        this.this$0 = c5131Fx;
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final BigDecimal invoke(@NotNull String str) {
        Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(new BigDecimal(str));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            return (BigDecimal) objM7377constructorimpl;
        }
        throw new DeserializationException("Unable to deserialize " + thM7380exceptionOrNullimpl + " as BigDecimal");
    }
}
