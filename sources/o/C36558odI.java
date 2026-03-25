package o;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.odI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36558odI {
    public final boolean AEQbTJ;
    public final boolean AYXKKw;
    public final java.util.List<C35254nrp> AhwBna;
    public final java.lang.String AkhnZx;
    public final OKMessage DbNXlk;
    public final boolean EZpvd;
    public final OKConversation KWHzl;
    public final boolean OLrzqt;
    public final java.lang.Long copydefault;
    public final OKMessage djBIcL;
    public final java.lang.Integer fetchVPNInfo;
    public final java.lang.Long gEmmrt;
    public final java.lang.Long isConnected;
    public final boolean valueOf;
    public final java.lang.Long values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C35254nrp> AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C36558odI AEQbTJ(@NotNull java.util.List<C35254nrp> list, @NotNull OKConversation oKConversation, OKMessage oKMessage, java.lang.String str, java.lang.Long l, OKMessage oKMessage2, boolean z, boolean z2, java.lang.Long l2, boolean z3, java.lang.Long l3, java.lang.Long l4, java.lang.Integer num, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(oKConversation, "");
        return new C36558odI(list, oKConversation, oKMessage, str, l, oKMessage2, z, z2, l2, z3, l3, l4, num, z4, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long AYXKKw() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKMessage AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKMessage AkhnZx() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKConversation OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long djBIcL() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36558odI)) {
            return false;
        }
        C36558odI c36558odI = (C36558odI) obj;
        return Intrinsics.EZpvd(this.AhwBna, c36558odI.AhwBna) && Intrinsics.EZpvd(this.KWHzl, c36558odI.KWHzl) && Intrinsics.EZpvd(this.DbNXlk, c36558odI.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) c36558odI.AkhnZx) && Intrinsics.EZpvd(this.isConnected, c36558odI.isConnected) && Intrinsics.EZpvd(this.djBIcL, c36558odI.djBIcL) && this.EZpvd == c36558odI.EZpvd && this.OLrzqt == c36558odI.OLrzqt && Intrinsics.EZpvd(this.values, c36558odI.values) && this.AYXKKw == c36558odI.AYXKKw && Intrinsics.EZpvd(this.gEmmrt, c36558odI.gEmmrt) && Intrinsics.EZpvd(this.copydefault, c36558odI.copydefault) && Intrinsics.EZpvd(this.fetchVPNInfo, c36558odI.fetchVPNInfo) && this.AEQbTJ == c36558odI.AEQbTJ && this.valueOf == c36558odI.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer fetchVPNInfo() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AhwBna.hashCode();
        int iHashCode2 = this.KWHzl.hashCode();
        OKMessage oKMessage = this.DbNXlk;
        int iHashCode3 = oKMessage == null ? 0 : oKMessage.hashCode();
        java.lang.String str = this.AkhnZx;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        java.lang.Long l = this.isConnected;
        int iHashCode5 = l == null ? 0 : l.hashCode();
        OKMessage oKMessage2 = this.djBIcL;
        int iHashCode6 = oKMessage2 == null ? 0 : oKMessage2.hashCode();
        int iHashCode7 = java.lang.Boolean.hashCode(this.EZpvd);
        int iHashCode8 = java.lang.Boolean.hashCode(this.OLrzqt);
        java.lang.Long l2 = this.values;
        int iHashCode9 = l2 == null ? 0 : l2.hashCode();
        int iHashCode10 = java.lang.Boolean.hashCode(this.AYXKKw);
        java.lang.Long l3 = this.gEmmrt;
        int iHashCode11 = l3 == null ? 0 : l3.hashCode();
        java.lang.Long l4 = this.copydefault;
        int iHashCode12 = l4 == null ? 0 : l4.hashCode();
        java.lang.Integer num = this.fetchVPNInfo;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (num != null ? num.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.valueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MessageListModel(messageList=" + this.AhwBna + ", conversation=" + this.KWHzl + ", targetMessage=" + this.DbNXlk + ", searchKey=" + this.AkhnZx + ", startMessageSequence=" + this.isConnected + ", receiveMessage=" + this.djBIcL + ", hasNewerMessage=" + this.EZpvd + ", hasOlderMessage=" + this.OLrzqt + ", showSendStatusSeq=" + this.values + ", needScrollToBottom=" + this.AYXKKw + ", lastReadSeq=" + this.gEmmrt + ", firstUnreadMessageSeq=" + this.copydefault + ", unreadIndicatorCount=" + this.fetchVPNInfo + ", isAgentProcessing=" + this.AEQbTJ + ", isPrivateTypingIndicatorVisible=" + this.valueOf + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.AYXKKw;
    }

    public C36558odI(@NotNull java.util.List<C35254nrp> list, @NotNull OKConversation oKConversation, OKMessage oKMessage, java.lang.String str, java.lang.Long l, OKMessage oKMessage2, boolean z, boolean z2, java.lang.Long l2, boolean z3, java.lang.Long l3, java.lang.Long l4, java.lang.Integer num, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(oKConversation, "");
        this.AhwBna = list;
        this.KWHzl = oKConversation;
        this.DbNXlk = oKMessage;
        this.AkhnZx = str;
        this.isConnected = l;
        this.djBIcL = oKMessage2;
        this.EZpvd = z;
        this.OLrzqt = z2;
        this.values = l2;
        this.AYXKKw = z3;
        this.gEmmrt = l3;
        this.copydefault = l4;
        this.fetchVPNInfo = num;
        this.AEQbTJ = z4;
        this.valueOf = z5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0037: CONSTRUCTOR 
  (r20v0 java.util.List)
  (r21v0 com.okinc.okimcore.model.im.OKConversation)
  (r22v0 com.okinc.okimcore.model.im.OKMessage)
  (r23v0 java.lang.String)
  (r24v0 java.lang.Long)
  (r25v0 com.okinc.okimcore.model.im.OKMessage)
  (r26v0 boolean)
  (r27v0 boolean)
  (r28v0 java.lang.Long)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r35v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r29v0 boolean))
  (r30v0 java.lang.Long)
  (r31v0 java.lang.Long)
  (r32v0 java.lang.Integer)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r35v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r33v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r35v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? false : (r34v0 boolean))
 A[MD:(java.util.List<o.nrp>, com.okinc.okimcore.model.im.OKConversation, com.okinc.okimcore.model.im.OKMessage, java.lang.String, java.lang.Long, com.okinc.okimcore.model.im.OKMessage, boolean, boolean, java.lang.Long, boolean, java.lang.Long, java.lang.Long, java.lang.Integer, boolean, boolean):void (m)] (LINE:7) call: o.odI.<init>(java.util.List, com.okinc.okimcore.model.im.OKConversation, com.okinc.okimcore.model.im.OKMessage, java.lang.String, java.lang.Long, com.okinc.okimcore.model.im.OKMessage, boolean, boolean, java.lang.Long, boolean, java.lang.Long, java.lang.Long, java.lang.Integer, boolean, boolean):void type: THIS */
    public /* synthetic */ C36558odI(java.util.List list, OKConversation oKConversation, OKMessage oKMessage, java.lang.String str, java.lang.Long l, OKMessage oKMessage2, boolean z, boolean z2, java.lang.Long l2, boolean z3, java.lang.Long l3, java.lang.Long l4, java.lang.Integer num, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, oKConversation, oKMessage, str, l, oKMessage2, z, z2, l2, (i & 512) != 0 ? false : z3, l3, l4, num, (i & 8192) != 0 ? false : z4, (i & 16384) != 0 ? false : z5);
    }
}
