package aws.smithy.kotlin.runtime.serde.json;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonDeserializer$deserializeNumber$1 extends Lambda implements Function1<String, Number> {
    public static final JsonDeserializer$deserializeNumber$1 INSTANCE = new JsonDeserializer$deserializeNumber$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JsonDeserializer$deserializeNumber$1() {
        super(1);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Number invoke(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return StringsKt__StringsKt.contains$default((CharSequence) str, '.', false, 2, (Object) null) ? Double.valueOf(Double.parseDouble(str)) : Long.valueOf(Long.parseLong(str));
    }
}
