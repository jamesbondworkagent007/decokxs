package o;

import com.reown.android.internal.common.crypto.kmr.BouncyCastleKeyManagementRepository;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bAs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8342bAs {
    public static volatile C8342bAs KWHzl;
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final java.lang.String AEQbTJ = "RuntimePasswordManager";
    public java.lang.String OLrzqt = "";
    public java.lang.String EZpvd = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd() {
        this.OLrzqt = "";
    }

    /* JADX INFO: renamed from: o.bAs$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bAs.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C8342bAs EZpvd() {
            C8342bAs c8342bAs = C8342bAs.KWHzl;
            if (c8342bAs == null) {
                synchronized (this) {
                    c8342bAs = C8342bAs.KWHzl;
                    if (c8342bAs == null) {
                        c8342bAs = new C8342bAs();
                        Activity activity = C8342bAs.Companion;
                        C8342bAs.KWHzl = c8342bAs;
                    }
                }
            }
            return c8342bAs;
        }
    }

    public final boolean AEQbTJ() {
        copydefault();
        return this.OLrzqt.length() > 0;
    }

    public final java.lang.String OLrzqt() throws java.lang.Exception {
        if (this.OLrzqt.length() == 0) {
            C10856bwO.copydefault(this.AEQbTJ, 0, "password is empty");
            throw new java.lang.RuntimeException("");
        }
        java.lang.String strCopydefault = C33514mxr.copydefault(this.OLrzqt, com.google.android.exoplayer2.C.UTF8_NAME, BouncyCastleKeyManagementRepository.AES, copydefault());
        Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
        return strCopydefault;
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = C33514mxr.AEQbTJ(str, com.google.android.exoplayer2.C.UTF8_NAME, BouncyCastleKeyManagementRepository.AES, copydefault());
    }

    public final java.lang.String copydefault() {
        java.lang.String strSubstring;
        if (this.EZpvd.length() == 0) {
            java.lang.String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            if (string.length() > 16) {
                strSubstring = string.substring(0, 16);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            } else {
                strSubstring = "1234567890!@#$%^";
            }
            this.EZpvd = strSubstring;
        }
        return this.EZpvd;
    }
}
