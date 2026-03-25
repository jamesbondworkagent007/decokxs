package o;

import com.okinc.biz.net.common.SignTypeEnum;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import uniffi.network.SignAlgoKind;

/* JADX INFO: renamed from: o.mfW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C32539mfW {
    public static final C32539mfW AEQbTJ = new C32539mfW();

    /* JADX INFO: renamed from: o.mfW$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SignAlgoKind.values().length];
            try {
                iArr[SignAlgoKind.SYMMETRIC.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SignAlgoKind.ASYMMETRIC_K1.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SignAlgoKind.ASYMMETRIC_R1.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    private C32539mfW() {
    }

    public final void OLrzqt(@NotNull Request.Builder builder, C4393Bck c4393Bck) {
        java.lang.String strKWHzl;
        java.lang.String strAEQbTJ;
        Intrinsics.checkNotNullParameter(builder, "");
        if (c4393Bck == null) {
            return;
        }
        C4396Bcn c4396BcnEZpvd = c4393Bck.EZpvd();
        if (c4396BcnEZpvd != null) {
            int i = TaskDescription.KWHzl[c4396BcnEZpvd.EZpvd().ordinal()];
            if (i == 1) {
                C4398Bcp c4398BcpOLrzqt = c4396BcnEZpvd.OLrzqt();
                if (c4398BcpOLrzqt == null || (strKWHzl = c4398BcpOLrzqt.KWHzl()) == null || builder.header("OK-VERIFY-TOKEN", strKWHzl) == null) {
                    builder.header("OK-VERIFY-TOKEN", "");
                }
            } else if (i == 2) {
                builder.header("OKAsymmetricSignEnable", "true");
                builder.header("X-Sign-Type-Key", SignTypeEnum.K1.getType());
                C2786AZe c2786AZeKWHzl = c4396BcnEZpvd.KWHzl();
                if (c2786AZeKWHzl != null) {
                    java.lang.String strAEQbTJ2 = c2786AZeKWHzl.AEQbTJ();
                    if (strAEQbTJ2 == null) {
                        strAEQbTJ2 = "";
                    }
                    builder.header("X-Client-Public-Key", strAEQbTJ2);
                    java.lang.String strKWHzl2 = c2786AZeKWHzl.KWHzl();
                    builder.header("X-Client-Private-Key", strKWHzl2 != null ? strKWHzl2 : "");
                }
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                C2786AZe c2786AZeKWHzl2 = c4396BcnEZpvd.KWHzl();
                java.lang.String strKWHzl3 = c2786AZeKWHzl2 != null ? c2786AZeKWHzl2.KWHzl() : null;
                if (strKWHzl3 != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl3) && (strAEQbTJ = c2786AZeKWHzl2.AEQbTJ()) != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ)) {
                    throw new NotImplementedError("An operation is not implemented: NOT SUPPORT custom privateKey/publicKey for R1");
                }
                builder.header("OKAsymmetricSignEnable", "true");
                builder.header("X-Sign-Type-Key", SignTypeEnum.R1.getType());
            }
        }
        C2783AZb c2783AZbOLrzqt = c4393Bck.OLrzqt();
        if (c2783AZbOLrzqt != null) {
            builder.header("Encrypt-Strategy", "TIME");
            java.lang.String strEZpvd = c2783AZbOLrzqt.EZpvd();
            if (strEZpvd != null) {
                builder.header("sign", strEZpvd);
            }
            builder.header("Encrypt-ignore-extra-body-param", c2783AZbOLrzqt.KWHzl() ? "1" : "0");
        }
    }
}
