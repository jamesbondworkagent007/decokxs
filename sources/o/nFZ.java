package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nFZ implements InterfaceC33763nEy {
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.nGa
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return nFZ.OLrzqt();
        }
    });

    public final android.content.SharedPreferences AEQbTJ() {
        return (android.content.SharedPreferences) this.copydefault.getValue();
    }

    public static final android.content.SharedPreferences OLrzqt() throws java.lang.Exception {
        try {
            return C35397nua.Companion.KWHzl().getSharedPreferences("conversation_section_clicks", 0);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("ClickCounterRepository", "Failed to get SharedPreferences", e);
            throw e;
        }
    }

    @Override // o.InterfaceC33763nEy
    public int copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            return AEQbTJ().getInt(str, 0);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("ClickCounterRepository", "Failed to get click count", e);
            return 0;
        }
    }

    @Override // o.InterfaceC33763nEy
    public int EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            int iCopydefault = copydefault(str) + 1;
            AEQbTJ().edit().putInt(str, iCopydefault).apply();
            return iCopydefault;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("ClickCounterRepository", "Failed to increment click count", e);
            return 0;
        }
    }
}
