package aws.smithy.kotlin.runtime.config;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class EnvironmentSettingKt$intEnvSetting$1 extends FunctionReferenceImpl implements Function1<String, Integer> {
    public static final EnvironmentSettingKt$intEnvSetting$1 INSTANCE = new EnvironmentSettingKt$intEnvSetting$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EnvironmentSettingKt$intEnvSetting$1() {
        super(1, StringsKt.class, "toInt", "toInt(Ljava/lang/String;)I", 1);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Integer.valueOf(Integer.parseInt(str));
    }
}
