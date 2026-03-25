package o;

import com.okinc.localization.bean.RemoteUpdateStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pSD {
    public RemoteUpdateStatus AEQbTJ;
    public java.lang.String KWHzl;
    public RemoteUpdateStatus OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public pSD() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ pSD copy$default(pSD psd, RemoteUpdateStatus remoteUpdateStatus, RemoteUpdateStatus remoteUpdateStatus2, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            remoteUpdateStatus = psd.AEQbTJ;
        }
        if ((i & 2) != 0) {
            remoteUpdateStatus2 = psd.OLrzqt;
        }
        if ((i & 4) != 0) {
            str = psd.KWHzl;
        }
        return psd.KWHzl(remoteUpdateStatus, remoteUpdateStatus2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RemoteUpdateStatus EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pSD KWHzl(@NotNull RemoteUpdateStatus remoteUpdateStatus, @NotNull RemoteUpdateStatus remoteUpdateStatus2, java.lang.String str) {
        Intrinsics.checkNotNullParameter(remoteUpdateStatus, "");
        Intrinsics.checkNotNullParameter(remoteUpdateStatus2, "");
        return new pSD(remoteUpdateStatus, remoteUpdateStatus2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull RemoteUpdateStatus remoteUpdateStatus) {
        Intrinsics.checkNotNullParameter(remoteUpdateStatus, "");
        this.OLrzqt = remoteUpdateStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull RemoteUpdateStatus remoteUpdateStatus) {
        Intrinsics.checkNotNullParameter(remoteUpdateStatus, "");
        this.AEQbTJ = remoteUpdateStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pSD)) {
            return false;
        }
        pSD psd = (pSD) obj;
        return this.AEQbTJ == psd.AEQbTJ && this.OLrzqt == psd.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) psd.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = this.OLrzqt.hashCode();
        java.lang.String str = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UploadLanguageResult(remoteUpdateStatus=" + this.AEQbTJ + ", localUpdateStatus=" + this.OLrzqt + ", errorMsg=" + this.KWHzl + ")";
    }

    public pSD(@NotNull RemoteUpdateStatus remoteUpdateStatus, @NotNull RemoteUpdateStatus remoteUpdateStatus2, java.lang.String str) {
        Intrinsics.checkNotNullParameter(remoteUpdateStatus, "");
        Intrinsics.checkNotNullParameter(remoteUpdateStatus2, "");
        this.AEQbTJ = remoteUpdateStatus;
        this.OLrzqt = remoteUpdateStatus2;
        this.KWHzl = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:com.okinc.localization.bean.RemoteUpdateStatus:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.localization.bean.RemoteUpdateStatus:0x0004: SGET  A[WRAPPED] (LINE:19) com.okinc.localization.bean.RemoteUpdateStatus.LOADING com.okinc.localization.bean.RemoteUpdateStatus) : (r1v0 com.okinc.localization.bean.RemoteUpdateStatus))
  (wrap:com.okinc.localization.bean.RemoteUpdateStatus:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.localization.bean.RemoteUpdateStatus:0x000a: SGET  A[WRAPPED] (LINE:20) com.okinc.localization.bean.RemoteUpdateStatus.LOADING com.okinc.localization.bean.RemoteUpdateStatus) : (r2v0 com.okinc.localization.bean.RemoteUpdateStatus))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(com.okinc.localization.bean.RemoteUpdateStatus, com.okinc.localization.bean.RemoteUpdateStatus, java.lang.String):void (m)] (LINE:18) call: o.pSD.<init>(com.okinc.localization.bean.RemoteUpdateStatus, com.okinc.localization.bean.RemoteUpdateStatus, java.lang.String):void type: THIS */
    public /* synthetic */ pSD(RemoteUpdateStatus remoteUpdateStatus, RemoteUpdateStatus remoteUpdateStatus2, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? RemoteUpdateStatus.LOADING : remoteUpdateStatus, (i & 2) != 0 ? RemoteUpdateStatus.LOADING : remoteUpdateStatus2, (i & 4) != 0 ? null : str);
    }
}
