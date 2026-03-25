package o;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ayY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8215ayY {
    public static final <T> T EZpvd(@NotNull InterfaceC56551yJo<T> interfaceC56551yJo, @NotNull Interceptor... interceptorArr) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        Intrinsics.checkNotNullParameter(interceptorArr, "");
        return (T) C43393roT.EZpvd(interfaceC56551yJo, new C8214ayX(yDV.AwvSrB(interceptorArr)));
    }
}
