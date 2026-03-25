package o;

import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dmA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14471dmA {
    public static final C14471dmA EZpvd = new C14471dmA();

    private C14471dmA() {
    }

    public final boolean copydefault() {
        boolean z = SPUtils.getBoolean("has_fingerprint", false);
        C10856bwO.copydefault("FingerprintUtils", 0, "hasFingerprint=" + z);
        return z;
    }

    public final void OLrzqt() {
        C10856bwO.copydefault("FingerprintUtils", 0, "saveFingerprint");
        SPUtils.put("has_fingerprint", java.lang.Boolean.TRUE);
    }

    public final void EZpvd() {
        C10856bwO.copydefault("FingerprintUtils", 0, "delFingerprint");
        SPUtils.remove("has_fingerprint");
    }

    public final boolean EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return FingerprintManagerCompat.from(context).isHardwareDetected();
    }

    public final boolean KWHzl(android.content.Context context) {
        return FingerprintManagerCompat.from(context).hasEnrolledFingerprints();
    }

    public final boolean OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        boolean z = EZpvd(context) && KWHzl(context);
        C10856bwO.copydefault("FingerprintUtils", 0, "fingerprintEnable=" + z);
        return z;
    }
}
