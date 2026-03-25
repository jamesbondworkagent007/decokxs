package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mfN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32530mfN implements InterfaceC4494Bgd {
    public static final Application Companion = new Application(null);

    /* JADX INFO: renamed from: o.mfN$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mfN.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.InterfaceC4494Bgd
    public void copydefault(int i, java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i2, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (i != 0) {
            if (i == 1) {
                pUU.copydefault(str, "file: " + str3 + ", line: " + C56395yDu.OLrzqt(i2) + ", function: " + str4 + ", " + str2);
                return;
            }
            if (i == 2) {
                pUU.valueOf(str, "function: " + str4 + ", " + str2);
                return;
            }
            if (i == 3) {
                pUU.KWHzl(str, str2);
                return;
            } else if (i == 4) {
                pUU.EZpvd(str, str2);
                return;
            } else if (i != 5) {
                pUU.EZpvd(str, str2);
                return;
            }
        }
        pUU.OLrzqt(str, str2);
    }
}
