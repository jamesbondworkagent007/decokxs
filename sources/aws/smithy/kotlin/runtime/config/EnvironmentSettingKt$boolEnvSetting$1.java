package aws.smithy.kotlin.runtime.config;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class EnvironmentSettingKt$boolEnvSetting$1 extends FunctionReferenceImpl implements Function1<String, Boolean> {
    public static final EnvironmentSettingKt$boolEnvSetting$1 INSTANCE = new EnvironmentSettingKt$boolEnvSetting$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EnvironmentSettingKt$boolEnvSetting$1() {
        super(1, StringsKt.class, "toBoolean", "toBoolean(Ljava/lang/String;)Z", 1);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }
}
