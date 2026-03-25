package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.experiment.FeatureStatus;

/* JADX INFO: renamed from: o.AIk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C2351AIk {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public FeatureStatus EZpvd;
    public java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C2351AIk copy$default(C2351AIk c2351AIk, java.lang.String str, FeatureStatus featureStatus, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c2351AIk.AEQbTJ;
        }
        if ((i & 2) != 0) {
            featureStatus = c2351AIk.EZpvd;
        }
        if ((i & 4) != 0) {
            str2 = c2351AIk.KWHzl;
        }
        return c2351AIk.AEQbTJ(str, featureStatus, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2351AIk AEQbTJ(@NotNull java.lang.String str, @NotNull FeatureStatus featureStatus, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(featureStatus, "");
        return new C2351AIk(str, featureStatus, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FeatureStatus KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2351AIk)) {
            return false;
        }
        C2351AIk c2351AIk = (C2351AIk) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c2351AIk.AEQbTJ) && this.EZpvd == c2351AIk.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c2351AIk.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        java.lang.String str = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FeatureItem(featureCode=" + this.AEQbTJ + ", status=" + this.EZpvd + ", extraConfigJson=" + this.KWHzl + ")";
    }

    public C2351AIk(@NotNull java.lang.String str, @NotNull FeatureStatus featureStatus, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(featureStatus, "");
        this.AEQbTJ = str;
        this.EZpvd = featureStatus;
        this.KWHzl = str2;
    }
}
