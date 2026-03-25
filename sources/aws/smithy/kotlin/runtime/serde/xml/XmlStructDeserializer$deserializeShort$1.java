package aws.smithy.kotlin.runtime.serde.xml;

import aws.smithy.kotlin.runtime.serde.DeserializationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class XmlStructDeserializer$deserializeShort$1 extends Lambda implements Function1<String, Short> {
    public static final XmlStructDeserializer$deserializeShort$1 INSTANCE = new XmlStructDeserializer$deserializeShort$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public XmlStructDeserializer$deserializeShort$1() {
        super(1);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Short invoke(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(str);
        if (intOrNull != null) {
            return Short.valueOf((short) intOrNull.intValue());
        }
        throw new DeserializationException("Unable to deserialize " + str);
    }
}
