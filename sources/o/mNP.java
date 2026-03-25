package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mNP {
    public static final mNP AEQbTJ = new mNP();
    public static final int EZpvd = 8;
    public static Activity OLrzqt;

    public interface Activity {
        void AEQbTJ();

        boolean EZpvd();

        boolean KWHzl();

        java.lang.String OLrzqt();

        java.lang.String OLrzqt(@NotNull java.lang.String str);

        boolean copydefault();
    }

    private mNP() {
    }

    public final void KWHzl() {
        Activity activity = OLrzqt;
        if (activity != null) {
            activity.AEQbTJ();
        }
    }

    public final boolean copydefault() {
        Activity activity = OLrzqt;
        if (activity != null) {
            return activity.KWHzl();
        }
        return false;
    }

    public final java.lang.String AEQbTJ() {
        java.lang.String strOLrzqt;
        Activity activity = OLrzqt;
        return (activity == null || (strOLrzqt = activity.OLrzqt()) == null) ? AbstractJsonLexerKt.NULL : strOLrzqt;
    }

    public final boolean OLrzqt() {
        Activity activity = OLrzqt;
        if (activity != null) {
            return activity.EZpvd();
        }
        return false;
    }

    public final boolean EZpvd() {
        Activity activity = OLrzqt;
        if (activity != null) {
            return activity.copydefault();
        }
        return false;
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Activity activity = OLrzqt;
        if (activity != null) {
            return activity.OLrzqt(str);
        }
        return null;
    }
}
