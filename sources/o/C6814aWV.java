package o;

import com.okinc.rxutils.RxBus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aWV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6814aWV implements RxBus.Application {
    public final android.os.Bundle AEQbTJ;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C6814aWV copy$default(C6814aWV c6814aWV, java.lang.String str, android.os.Bundle bundle, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c6814aWV.OLrzqt;
        }
        if ((i & 2) != 0) {
            bundle = c6814aWV.AEQbTJ;
        }
        return c6814aWV.KWHzl(str, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.os.Bundle AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C6814aWV KWHzl(@NotNull java.lang.String str, @NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        return new C6814aWV(str, bundle);
    }

    @Override // com.okinc.rxutils.RxBus.Application
    public boolean check(java.lang.String str) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6814aWV)) {
            return false;
        }
        C6814aWV c6814aWV = (C6814aWV) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c6814aWV.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c6814aWV.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ChangePageEvent(nav=" + this.OLrzqt + ", bundle=" + this.AEQbTJ + ")";
    }

    public C6814aWV(@NotNull java.lang.String str, @NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        this.OLrzqt = str;
        this.AEQbTJ = bundle;
    }
}
