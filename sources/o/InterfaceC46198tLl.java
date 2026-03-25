package o;

import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser;
import o.C47501trL;

/* JADX INFO: renamed from: o.tLl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC46198tLl {
    java.lang.Integer AEQbTJ();

    boolean EZpvd();

    java.lang.String OLrzqt();

    java.lang.String copydefault();

    /* JADX INFO: renamed from: o.tLl$Activity */
    public static final class Activity implements InterfaceC46198tLl {
        public static final boolean copydefault = false;
        public static final Activity OLrzqt = new Activity();
        public static final int AhwBna = C47501trL.Fragment.swzYdv;
        public static final java.lang.String KWHzl = "feed";
        public static final java.lang.String EZpvd = "Posts";
        public static java.lang.String gEmmrt = "";
        public static final int AEQbTJ = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46198tLl
        public boolean EZpvd() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46198tLl
        public java.lang.String OLrzqt() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46198tLl
        public java.lang.String copydefault() {
            return KWHzl;
        }

        private Activity() {
        }

        @Override // o.InterfaceC46198tLl
        public java.lang.Integer AEQbTJ() {
            return java.lang.Integer.valueOf(AhwBna);
        }
    }

    /* JADX INFO: renamed from: o.tLl$TaskDescription */
    public static final class TaskDescription implements InterfaceC46198tLl {
        public static final boolean copydefault = false;
        public static final TaskDescription KWHzl = new TaskDescription();
        public static final int AhwBna = C47501trL.Fragment.hvKCwS;
        public static final java.lang.String EZpvd = "feed";
        public static final java.lang.String OLrzqt = "PlanetLivestream";
        public static java.lang.String valueOf = "";
        public static final int AEQbTJ = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46198tLl
        public boolean EZpvd() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46198tLl
        public java.lang.String OLrzqt() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46198tLl
        public java.lang.String copydefault() {
            return EZpvd;
        }

        private TaskDescription() {
        }

        @Override // o.InterfaceC46198tLl
        public java.lang.Integer AEQbTJ() {
            return java.lang.Integer.valueOf(AhwBna);
        }
    }

    /* JADX INFO: renamed from: o.tLl$Application */
    public static final class Application implements InterfaceC46198tLl {
        public final boolean OLrzqt;
        public final int EZpvd = C47501trL.Fragment.sVXHln;
        public final java.lang.String AEQbTJ = "overview";
        public final java.lang.String KWHzl = "Performance";
        public java.lang.String copydefault = "";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = application.OLrzqt;
            }
            return application.copydefault(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46198tLl
        public boolean EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46198tLl
        public java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46198tLl
        public java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(boolean z) {
            return new Application(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && this.OLrzqt == ((Application) obj).OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PlanetOverview(showLockIcon=" + this.OLrzqt + ")";
        }

        public Application(boolean z) {
            this.OLrzqt = z;
        }

        @Override // o.InterfaceC46198tLl
        public java.lang.Integer AEQbTJ() {
            return java.lang.Integer.valueOf(this.EZpvd);
        }
    }

    /* JADX INFO: renamed from: o.tLl$ActionBar */
    public static final class ActionBar implements InterfaceC46198tLl {
        public static final java.lang.Integer AYXKKw = null;
        public static final boolean copydefault = false;
        public static final ActionBar OLrzqt = new ActionBar();
        public static final java.lang.String EZpvd = "protection";
        public static final java.lang.String KWHzl = SsManifestParser.ProtectionParser.TAG;
        public static java.lang.String djBIcL = "";
        public static final int AEQbTJ = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46198tLl
        public java.lang.Integer AEQbTJ() {
            return AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46198tLl
        public boolean EZpvd() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46198tLl
        public java.lang.String OLrzqt() {
            return KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC46198tLl
        public java.lang.String copydefault() {
            return EZpvd;
        }

        private ActionBar() {
        }
    }
}
