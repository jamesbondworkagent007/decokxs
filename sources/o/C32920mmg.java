package o;

import com.okinc.components.track.amplitude.AmplitudeName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mmg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32920mmg {
    public static final java.lang.String EZpvd(@NotNull AmplitudeName amplitudeName) {
        Intrinsics.checkNotNullParameter(amplitudeName, "");
        return amplitudeName != AmplitudeName.CEFI ? "web3_ab_test" : "cefi_ab_test";
    }
}
