package o;

import com.okinc.im.widgets.inputpanel.InputMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oJd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C35935oJd {
    public static final C35935oJd copydefault = new C35935oJd();

    /* JADX INFO: renamed from: o.oJd$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InputMode.values().length];
            try {
                iArr[InputMode.PluginMode.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[InputMode.VoiceInput.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[InputMode.StickerMode.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    private C35935oJd() {
    }

    /* JADX INFO: renamed from: o.oJd$Application */
    public static final class Application {
        public final int AEQbTJ;
        public final boolean AYXKKw;
        public final boolean AhwBna;
        public final boolean AkhnZx;
        public final boolean DbNXlk;
        public final java.lang.String EZpvd;
        public final boolean KWHzl;
        public final boolean OLrzqt;
        public final InputMode copydefault;
        public final boolean djBIcL;
        public final boolean fetchVPNInfo;
        public final boolean gEmmrt;
        public final boolean isConnected;
        public final boolean valueOf;
        public final boolean values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(@NotNull InputMode inputMode, java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, boolean z9, boolean z10, boolean z11, boolean z12) {
            Intrinsics.checkNotNullParameter(inputMode, "");
            return new Application(inputMode, str, z, z2, z3, z4, z5, z6, z7, z8, i, z9, z10, z11, z12);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AkhnZx() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean DbNXlk() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InputMode EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return this.copydefault == application.copydefault && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) application.EZpvd) && this.AkhnZx == application.AkhnZx && this.fetchVPNInfo == application.fetchVPNInfo && this.gEmmrt == application.gEmmrt && this.djBIcL == application.djBIcL && this.OLrzqt == application.OLrzqt && this.values == application.values && this.AYXKKw == application.AYXKKw && this.DbNXlk == application.DbNXlk && this.AEQbTJ == application.AEQbTJ && this.isConnected == application.isConnected && this.AhwBna == application.AhwBna && this.valueOf == application.valueOf && this.KWHzl == application.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean fetchVPNInfo() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean gEmmrt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            java.lang.String str = this.EZpvd;
            return (((((((((((((((((((((((((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.AkhnZx)) * 31) + java.lang.Boolean.hashCode(this.fetchVPNInfo)) * 31) + java.lang.Boolean.hashCode(this.gEmmrt)) * 31) + java.lang.Boolean.hashCode(this.djBIcL)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.values)) * 31) + java.lang.Boolean.hashCode(this.AYXKKw)) * 31) + java.lang.Boolean.hashCode(this.DbNXlk)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.isConnected)) * 31) + java.lang.Boolean.hashCode(this.AhwBna)) * 31) + java.lang.Boolean.hashCode(this.valueOf)) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isConnected() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "State(inputMode=" + this.copydefault + ", currentText=" + this.EZpvd + ", isVoiceToggleSelected=" + this.AkhnZx + ", isStickerToggleSelected=" + this.fetchVPNInfo + ", isPluginToggleSelected=" + this.gEmmrt + ", isSendButtonVisible=" + this.djBIcL + ", isAddButtonVisible=" + this.OLrzqt + ", isVoiceButtonVisible=" + this.values + ", isStickerButtonVisible=" + this.AYXKKw + ", isStopButtonVisible=" + this.DbNXlk + ", addButtonAnimation=" + this.AEQbTJ + ", isVoiceButtonEnabled=" + this.isConnected + ", isStickerButtonEnabled=" + this.AhwBna + ", isPluginButtonEnabled=" + this.valueOf + ", isAgentProcessing=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean valueOf() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean values() {
            return this.values;
        }

        public Application(@NotNull InputMode inputMode, java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, boolean z9, boolean z10, boolean z11, boolean z12) {
            Intrinsics.checkNotNullParameter(inputMode, "");
            this.copydefault = inputMode;
            this.EZpvd = str;
            this.AkhnZx = z;
            this.fetchVPNInfo = z2;
            this.gEmmrt = z3;
            this.djBIcL = z4;
            this.OLrzqt = z5;
            this.values = z6;
            this.AYXKKw = z7;
            this.DbNXlk = z8;
            this.AEQbTJ = i;
            this.isConnected = z9;
            this.AhwBna = z10;
            this.valueOf = z11;
            this.KWHzl = z12;
        }
    }

    public final Application EZpvd(@NotNull InputMode inputMode, java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(inputMode, "");
        boolean z5 = !(str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str));
        int i = StateListAnimator.AEQbTJ[inputMode.ordinal()] == 1 ? 0 : 1;
        pUU.EZpvd("InputModeStateManager", "buildState: inputMode=" + inputMode + ", isAgentProcessing=" + z + ", hasText=" + z5);
        return new Application(inputMode, str, inputMode == InputMode.VoiceInput, inputMode == InputMode.StickerMode, inputMode == InputMode.PluginMode, z4 ? !(!z5 || z) : !(z || !z5), (!z4 || z5 || z) ? false : true, (!z3 || z5 || z) ? false : true, z2, z, i, z3, z2, z4, z);
    }

    public final Application AEQbTJ() {
        return EZpvd(InputMode.DefaultMode, null, false, false, false, false);
    }

    public final Application EZpvd(@NotNull Application application, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(application, "");
        return EZpvd(application.EZpvd(), application.AEQbTJ(), application.OLrzqt(), z2, z, z3);
    }

    public final Application AEQbTJ(@NotNull Application application) {
        InputMode inputMode;
        Intrinsics.checkNotNullParameter(application, "");
        if (StateListAnimator.AEQbTJ[application.EZpvd().ordinal()] == 2) {
            inputMode = InputMode.TextInput;
        } else {
            inputMode = InputMode.VoiceInput;
        }
        return EZpvd(inputMode, application.AEQbTJ(), application.OLrzqt(), application.gEmmrt(), application.fetchVPNInfo(), application.valueOf());
    }

    public final Application KWHzl(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        return EZpvd(InputMode.TextInput, application.AEQbTJ(), application.OLrzqt(), application.gEmmrt(), application.fetchVPNInfo(), application.valueOf());
    }

    public final Application EZpvd(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        return EZpvd(application.EZpvd(), application.AEQbTJ(), application.OLrzqt(), application.gEmmrt(), application.fetchVPNInfo(), application.valueOf());
    }

    public final Application OLrzqt(@NotNull Application application) {
        InputMode inputMode;
        Intrinsics.checkNotNullParameter(application, "");
        if (StateListAnimator.AEQbTJ[application.EZpvd().ordinal()] == 3) {
            inputMode = InputMode.TextInput;
        } else {
            inputMode = InputMode.StickerMode;
        }
        return EZpvd(inputMode, application.AEQbTJ(), application.OLrzqt(), application.gEmmrt(), application.fetchVPNInfo(), application.valueOf());
    }

    public final Application copydefault(@NotNull Application application) {
        InputMode inputMode;
        Intrinsics.checkNotNullParameter(application, "");
        if (StateListAnimator.AEQbTJ[application.EZpvd().ordinal()] == 1) {
            inputMode = InputMode.TextInput;
        } else {
            inputMode = InputMode.PluginMode;
        }
        return EZpvd(inputMode, application.AEQbTJ(), application.OLrzqt(), application.gEmmrt(), application.fetchVPNInfo(), application.valueOf());
    }

    public final Application OLrzqt(@NotNull Application application, java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(application, "");
        return EZpvd(application.EZpvd(), charSequence != null ? charSequence.toString() : null, application.OLrzqt(), application.gEmmrt(), application.fetchVPNInfo(), application.valueOf());
    }

    public final Application OLrzqt(@NotNull Application application, boolean z) {
        Intrinsics.checkNotNullParameter(application, "");
        return EZpvd(application.EZpvd(), application.AEQbTJ(), z, application.gEmmrt(), application.fetchVPNInfo(), application.valueOf());
    }

    public final Application AEQbTJ(@NotNull Application application, boolean z) {
        Intrinsics.checkNotNullParameter(application, "");
        return EZpvd(application.EZpvd(), application.AEQbTJ(), application.OLrzqt(), z, application.fetchVPNInfo(), application.valueOf());
    }

    public final Application KWHzl(@NotNull Application application, boolean z) {
        Intrinsics.checkNotNullParameter(application, "");
        return EZpvd(application.EZpvd(), application.AEQbTJ(), application.OLrzqt(), application.gEmmrt(), z, application.valueOf());
    }

    public final Application copydefault(@NotNull Application application, boolean z) {
        Intrinsics.checkNotNullParameter(application, "");
        return EZpvd(application.EZpvd(), application.AEQbTJ(), application.OLrzqt(), application.gEmmrt(), application.fetchVPNInfo(), z);
    }
}
