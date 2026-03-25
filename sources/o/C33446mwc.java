package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mwc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33446mwc {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public static C33446mwc copydefault;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.mvZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C33446mwc.AEQbTJ();
        }
    });

    public final android.content.SharedPreferences copydefault() {
        return (android.content.SharedPreferences) this.AEQbTJ.getValue();
    }

    public static final android.content.SharedPreferences AEQbTJ() {
        return C32979mnm.EZpvd.OLrzqt().getSharedPreferences("APP_GENERAL_SETTINGS", 0);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        copydefault().edit().putString(str, str2).apply();
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String string = copydefault().getString(str, str2);
        return string == null ? str2 : string;
    }

    /* JADX INFO: renamed from: o.mwc$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mwc.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C33446mwc EZpvd() {
            C33446mwc c33446mwc = C33446mwc.copydefault;
            if (c33446mwc == null) {
                synchronized (this) {
                    c33446mwc = C33446mwc.copydefault;
                    if (c33446mwc == null) {
                        c33446mwc = new C33446mwc();
                        Activity activity = C33446mwc.Companion;
                        C33446mwc.copydefault = c33446mwc;
                    }
                }
            }
            return c33446mwc;
        }
    }
}
