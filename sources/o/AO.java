package o;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AO {
    public static final RequestBody KWHzl(@NotNull RequestBody requestBody, @NotNull GI gi, @NotNull InterfaceC57843yq interfaceC57843yq) {
        Intrinsics.checkNotNullParameter(requestBody, "");
        Intrinsics.checkNotNullParameter(gi, "");
        Intrinsics.checkNotNullParameter(interfaceC57843yq, "");
        return new AL(requestBody, gi, interfaceC57843yq);
    }

    public static final ResponseBody AEQbTJ(@NotNull ResponseBody responseBody, @NotNull GI gi, @NotNull InterfaceC57843yq interfaceC57843yq) {
        Intrinsics.checkNotNullParameter(responseBody, "");
        Intrinsics.checkNotNullParameter(gi, "");
        Intrinsics.checkNotNullParameter(interfaceC57843yq, "");
        return new AM(responseBody, gi, interfaceC57843yq);
    }
}
