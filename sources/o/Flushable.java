package o;

import aws.sdk.kotlin.runtime.config.AwsSdkSettingKt$resolveEndpointUrl$serviceSetting$1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class Flushable {
    public static final DL OLrzqt(@NotNull IOException iOException, @NotNull HL hl, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(iOException, "");
        Intrinsics.checkNotNullParameter(hl, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        DL dl = (DL) C59333zf.AEQbTJ((C59492zi) C59492zi.AEQbTJ.copydefault(new AwsSdkSettingKt$resolveEndpointUrl$serviceSetting$1(DL.AEQbTJ)).invoke("aws.endpointUrl" + str, "AWS_ENDPOINT_URL_" + str2), hl);
        return dl == null ? (DL) C59333zf.AEQbTJ(iOException.isConnected(), hl) : dl;
    }
}
