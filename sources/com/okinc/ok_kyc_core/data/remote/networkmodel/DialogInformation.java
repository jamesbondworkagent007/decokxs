package com.okinc.ok_kyc_core.data.remote.networkmodel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52794wYp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class DialogInformation {
    public static final int $stable = 8;
    private C52794wYp button;
    private boolean isPopUp;
    private String pageId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DialogInformation() {
        this(null, false, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DialogInformation copy$default(DialogInformation dialogInformation, String str, boolean z, C52794wYp c52794wYp, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dialogInformation.pageId;
        }
        if ((i & 2) != 0) {
            z = dialogInformation.isPopUp;
        }
        if ((i & 4) != 0) {
            c52794wYp = dialogInformation.button;
        }
        return dialogInformation.copy(str, z, c52794wYp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.pageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isPopUp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C52794wYp component3() {
        return this.button;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DialogInformation copy(@NotNull String str, boolean z, C52794wYp c52794wYp) {
        Intrinsics.checkNotNullParameter(str, "");
        return new DialogInformation(str, z, c52794wYp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogInformation)) {
            return false;
        }
        DialogInformation dialogInformation = (DialogInformation) obj;
        return Intrinsics.EZpvd((Object) this.pageId, (Object) dialogInformation.pageId) && this.isPopUp == dialogInformation.isPopUp && Intrinsics.EZpvd(this.button, dialogInformation.button);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C52794wYp getButton() {
        return this.button;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPageId() {
        return this.pageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.pageId.hashCode();
        int iHashCode2 = Boolean.hashCode(this.isPopUp);
        C52794wYp c52794wYp = this.button;
        return (((iHashCode * 31) + iHashCode2) * 31) + (c52794wYp == null ? 0 : c52794wYp.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPopUp() {
        return this.isPopUp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setButton(C52794wYp c52794wYp) {
        this.button = c52794wYp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPageId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pageId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPopUp(boolean z) {
        this.isPopUp = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DialogInformation(pageId=" + this.pageId + ", isPopUp=" + this.isPopUp + ", button=" + this.button + ")";
    }

    public DialogInformation(@NotNull String str, boolean z, C52794wYp c52794wYp) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pageId = str;
        this.isPopUp = z;
        this.button = c52794wYp;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:o.wYp:?: TERNARY null = ((wrap:int:0x000b: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null o.wYp) : (r3v0 o.wYp))
 A[MD:(java.lang.String, boolean, o.wYp):void (m)] (LINE:5700) call: com.okinc.ok_kyc_core.data.remote.networkmodel.DialogInformation.<init>(java.lang.String, boolean, o.wYp):void type: THIS */
    public /* synthetic */ DialogInformation(String str, boolean z, C52794wYp c52794wYp, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : c52794wYp);
    }
}
