package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mwf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33449mwf {
    public static C33449mwf EZpvd;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.mwg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C33449mwf.EZpvd();
        }
    });
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;

    public final android.content.SharedPreferences KWHzl() {
        return (android.content.SharedPreferences) this.AEQbTJ.getValue();
    }

    public static final android.content.SharedPreferences EZpvd() {
        return C32979mnm.EZpvd.OLrzqt().getSharedPreferences("LITE_APP_GENERAL_SETTINGS", 0);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        KWHzl().edit().putString(str, str2).apply();
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String string = KWHzl().getString(str, str2);
        return string == null ? str2 : string;
    }

    /* JADX INFO: renamed from: o.mwf$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mwf.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C33449mwf copydefault() {
            C33449mwf c33449mwf = C33449mwf.EZpvd;
            if (c33449mwf == null) {
                synchronized (this) {
                    c33449mwf = C33449mwf.EZpvd;
                    if (c33449mwf == null) {
                        c33449mwf = new C33449mwf();
                        ActionBar actionBar = C33449mwf.Companion;
                        C33449mwf.EZpvd = c33449mwf;
                    }
                }
            }
            return c33449mwf;
        }
    }
}
