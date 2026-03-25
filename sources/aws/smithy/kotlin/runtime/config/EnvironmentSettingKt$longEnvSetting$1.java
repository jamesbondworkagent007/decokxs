package aws.smithy.kotlin.runtime.config;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class EnvironmentSettingKt$longEnvSetting$1 extends FunctionReferenceImpl implements Function1<String, Long> {
    public static final EnvironmentSettingKt$longEnvSetting$1 INSTANCE = new EnvironmentSettingKt$longEnvSetting$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EnvironmentSettingKt$longEnvSetting$1() {
        super(1, StringsKt.class, "toLong", "toLong(Ljava/lang/String;)J", 1);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Long invoke(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Long.valueOf(Long.parseLong(str));
    }
}
