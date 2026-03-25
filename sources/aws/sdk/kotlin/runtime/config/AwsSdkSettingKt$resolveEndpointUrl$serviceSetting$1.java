package aws.sdk.kotlin.runtime.config;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import o.DL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class AwsSdkSettingKt$resolveEndpointUrl$serviceSetting$1 extends AdaptedFunctionReference implements Function1<String, DL> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AwsSdkSettingKt$resolveEndpointUrl$serviceSetting$1(Object obj) {
        super(1, obj, DL.StateListAnimator.class, "parse", "parse(Ljava/lang/String;Laws/smithy/kotlin/runtime/net/url/UrlEncoding;)Laws/smithy/kotlin/runtime/net/url/Url;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final DL invoke(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return DL.StateListAnimator.parse$default((DL.StateListAnimator) this.receiver, str, null, 2, null);
    }
}
