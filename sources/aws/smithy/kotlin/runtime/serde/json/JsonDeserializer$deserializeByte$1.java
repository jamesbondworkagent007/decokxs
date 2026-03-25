package aws.smithy.kotlin.runtime.serde.json;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonDeserializer$deserializeByte$1 extends Lambda implements Function1<String, Byte> {
    public static final JsonDeserializer$deserializeByte$1 INSTANCE = new JsonDeserializer$deserializeByte$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JsonDeserializer$deserializeByte$1() {
        super(1);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Byte invoke(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Byte bHDKMBd = StringsKt__StringNumberConversionsKt.hDKMBd(str);
        return Byte.valueOf(bHDKMBd != null ? bHDKMBd.byteValue() : (byte) Double.parseDouble(str));
    }
}
