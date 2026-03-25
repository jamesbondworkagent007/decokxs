package o;

import com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams;
import com.okinc.im.imui.messages.audio.call.model.CallStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37147ooO {
    public static final ActionBar Companion = new ActionBar(null);
    public static final C37147ooO copydefault = new C37147ooO(null, null, false, null, false, null, 63, null);
    public final java.lang.String AEQbTJ;
    public final CallStatus AYXKKw;
    public final AudioCallUIParams AhwBna;
    public final java.lang.String EZpvd;
    public final boolean KWHzl;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C37147ooO() {
        this(null, null, false, null, false, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C37147ooO copy$default(C37147ooO c37147ooO, java.lang.String str, java.lang.String str2, boolean z, CallStatus callStatus, boolean z2, AudioCallUIParams audioCallUIParams, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c37147ooO.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = c37147ooO.AEQbTJ;
        }
        java.lang.String str3 = str2;
        if ((i & 4) != 0) {
            z = c37147ooO.KWHzl;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            callStatus = c37147ooO.AYXKKw;
        }
        CallStatus callStatus2 = callStatus;
        if ((i & 16) != 0) {
            z2 = c37147ooO.OLrzqt;
        }
        boolean z4 = z2;
        if ((i & 32) != 0) {
            audioCallUIParams = c37147ooO.AhwBna;
        }
        return c37147ooO.EZpvd(str, str3, z3, callStatus2, z4, audioCallUIParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37147ooO EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull CallStatus callStatus, boolean z2, AudioCallUIParams audioCallUIParams) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(callStatus, "");
        return new C37147ooO(str, str2, z, callStatus, z2, audioCallUIParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AudioCallUIParams KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CallStatus copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37147ooO)) {
            return false;
        }
        C37147ooO c37147ooO = (C37147ooO) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c37147ooO.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c37147ooO.AEQbTJ) && this.KWHzl == c37147ooO.KWHzl && this.AYXKKw == c37147ooO.AYXKKw && this.OLrzqt == c37147ooO.OLrzqt && Intrinsics.EZpvd(this.AhwBna, c37147ooO.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        int iHashCode3 = java.lang.Boolean.hashCode(this.KWHzl);
        int iHashCode4 = this.AYXKKw.hashCode();
        int iHashCode5 = java.lang.Boolean.hashCode(this.OLrzqt);
        AudioCallUIParams audioCallUIParams = this.AhwBna;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (audioCallUIParams == null ? 0 : audioCallUIParams.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ServiceUIState(conversationId=" + this.EZpvd + ", remoteUserId=" + this.AEQbTJ + ", isGroupCall=" + this.KWHzl + ", status=" + this.AYXKKw + ", isShowingCallView=" + this.OLrzqt + ", uiParams=" + this.AhwBna + ")";
    }

    public C37147ooO(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull CallStatus callStatus, boolean z2, AudioCallUIParams audioCallUIParams) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(callStatus, "");
        this.EZpvd = str;
        this.AEQbTJ = str2;
        this.KWHzl = z;
        this.AYXKKw = callStatus;
        this.OLrzqt = z2;
        this.AhwBna = audioCallUIParams;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r6v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:com.okinc.im.imui.messages.audio.call.model.CallStatus:0x001d: TERNARY null = ((wrap:int:0x0017: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.im.imui.messages.audio.call.model.CallStatus:0x001b: SGET  A[WRAPPED] (LINE:26) com.okinc.im.imui.messages.audio.call.model.CallStatus.NOT_ON_CALL com.okinc.im.imui.messages.audio.call.model.CallStatus) : (r8v0 com.okinc.im.imui.messages.audio.call.model.CallStatus))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001e: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams:?: TERNARY null = ((wrap:int:0x0025: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams) : (r10v0 com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams))
 A[MD:(java.lang.String, java.lang.String, boolean, com.okinc.im.imui.messages.audio.call.model.CallStatus, boolean, com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams):void (m)] (LINE:18) call: o.ooO.<init>(java.lang.String, java.lang.String, boolean, com.okinc.im.imui.messages.audio.call.model.CallStatus, boolean, com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams):void type: THIS */
    public /* synthetic */ C37147ooO(java.lang.String str, java.lang.String str2, boolean z, CallStatus callStatus, boolean z2, AudioCallUIParams audioCallUIParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? false : z, (i & 8) != 0 ? CallStatus.NOT_ON_CALL : callStatus, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : audioCallUIParams);
    }

    /* JADX INFO: renamed from: o.ooO$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ooO.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C37147ooO KWHzl() {
            return C37147ooO.copydefault;
        }
    }
}
