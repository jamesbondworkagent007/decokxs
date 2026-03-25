package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.account.KycState;
import uniffi.account.ProfileListType;

/* JADX INFO: renamed from: o.AaH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC2816AaH {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AaH.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC2816AaH(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC2816AaH() {
    }

    /* JADX INFO: renamed from: o.AaH$Application */
    public static final class Application extends AbstractC2816AaH {
        public static final int $stable = 0;
        public final zCC AEQbTJ;
        public final zCC KWHzl;
        public final ProfileListType OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, ProfileListType profileListType, zCC zcc, zCC zcc2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                profileListType = application.OLrzqt;
            }
            if ((i & 2) != 0) {
                zcc = application.KWHzl;
            }
            if ((i & 4) != 0) {
                zcc2 = application.AEQbTJ;
            }
            return application.KWHzl(profileListType, zcc, zcc2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ProfileListType EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(@NotNull ProfileListType profileListType, @NotNull zCC zcc, @NotNull zCC zcc2) {
            Intrinsics.checkNotNullParameter(profileListType, "");
            Intrinsics.checkNotNullParameter(zcc, "");
            Intrinsics.checkNotNullParameter(zcc2, "");
            return new Application(profileListType, zcc, zcc2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final zCC KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final zCC OLrzqt() {
            return this.KWHzl;
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
            return this.OLrzqt == application.OLrzqt && Intrinsics.EZpvd(this.KWHzl, application.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.OLrzqt.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "RowItem(itemType=" + this.OLrzqt + ", title=" + this.KWHzl + ", desc=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull ProfileListType profileListType, @NotNull zCC zcc, @NotNull zCC zcc2) {
            super(null);
            Intrinsics.checkNotNullParameter(profileListType, "");
            Intrinsics.checkNotNullParameter(zcc, "");
            Intrinsics.checkNotNullParameter(zcc2, "");
            this.OLrzqt = profileListType;
            this.KWHzl = zcc;
            this.AEQbTJ = zcc2;
        }
    }

    /* JADX INFO: renamed from: o.AaH$Activity */
    public static final class Activity extends AbstractC2816AaH {
        public static final int $stable = 0;
        public final ProfileListType AEQbTJ;
        public final zCC EZpvd;
        public final java.lang.String KWHzl;
        public final KycState OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, ProfileListType profileListType, zCC zcc, java.lang.String str, KycState kycState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                profileListType = activity.AEQbTJ;
            }
            if ((i & 2) != 0) {
                zcc = activity.EZpvd;
            }
            if ((i & 4) != 0) {
                str = activity.KWHzl;
            }
            if ((i & 8) != 0) {
                kycState = activity.OLrzqt;
            }
            return activity.EZpvd(profileListType, zcc, str, kycState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ProfileListType AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@NotNull ProfileListType profileListType, @NotNull zCC zcc, @NotNull java.lang.String str, @NotNull KycState kycState) {
            Intrinsics.checkNotNullParameter(profileListType, "");
            Intrinsics.checkNotNullParameter(zcc, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(kycState, "");
            return new Activity(profileListType, zcc, str, kycState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final KycState KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final zCC copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return this.AEQbTJ == activity.AEQbTJ && Intrinsics.EZpvd(this.EZpvd, activity.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) activity.KWHzl) && this.OLrzqt == activity.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "KycItem(itemType=" + this.AEQbTJ + ", title=" + this.EZpvd + ", kycLevelString=" + this.KWHzl + ", kycLevel=" + this.OLrzqt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull ProfileListType profileListType, @NotNull zCC zcc, @NotNull java.lang.String str, @NotNull KycState kycState) {
            super(null);
            Intrinsics.checkNotNullParameter(profileListType, "");
            Intrinsics.checkNotNullParameter(zcc, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(kycState, "");
            this.AEQbTJ = profileListType;
            this.EZpvd = zcc;
            this.KWHzl = str;
            this.OLrzqt = kycState;
        }
    }
}
