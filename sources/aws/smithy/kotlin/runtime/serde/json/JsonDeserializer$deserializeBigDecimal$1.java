package aws.smithy.kotlin.runtime.serde.json;

import java.math.BigDecimal;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class JsonDeserializer$deserializeBigDecimal$1 extends FunctionReferenceImpl implements Function1<String, BigDecimal> {
    public static final JsonDeserializer$deserializeBigDecimal$1 INSTANCE = new JsonDeserializer$deserializeBigDecimal$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JsonDeserializer$deserializeBigDecimal$1() {
        super(1, BigDecimal.class, "<init>", "<init>(Ljava/lang/String;)V", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final BigDecimal invoke(String str) {
        return new BigDecimal(str);
    }
}
