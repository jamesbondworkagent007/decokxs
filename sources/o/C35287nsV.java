package o;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.nsV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35287nsV {
    public static final int AEQbTJ = (GroupInfo.$stable | RelationInfo.$stable) | OKConversation.$stable;
    public final OKConversation KWHzl;
    public final RelationInfo OLrzqt;
    public final GroupInfo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C35287nsV copy$default(C35287nsV c35287nsV, OKConversation oKConversation, RelationInfo relationInfo, GroupInfo groupInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            oKConversation = c35287nsV.KWHzl;
        }
        if ((i & 2) != 0) {
            relationInfo = c35287nsV.OLrzqt;
        }
        if ((i & 4) != 0) {
            groupInfo = c35287nsV.copydefault;
        }
        return c35287nsV.AEQbTJ(oKConversation, relationInfo, groupInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35287nsV AEQbTJ(OKConversation oKConversation, RelationInfo relationInfo, GroupInfo groupInfo) {
        return new C35287nsV(oKConversation, relationInfo, groupInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelationInfo EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKConversation KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupInfo copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35287nsV)) {
            return false;
        }
        C35287nsV c35287nsV = (C35287nsV) obj;
        return Intrinsics.EZpvd(this.KWHzl, c35287nsV.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c35287nsV.OLrzqt) && Intrinsics.EZpvd(this.copydefault, c35287nsV.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        OKConversation oKConversation = this.KWHzl;
        int iHashCode = oKConversation == null ? 0 : oKConversation.hashCode();
        RelationInfo relationInfo = this.OLrzqt;
        int iHashCode2 = relationInfo == null ? 0 : relationInfo.hashCode();
        GroupInfo groupInfo = this.copydefault;
        return (((iHashCode * 31) + iHashCode2) * 31) + (groupInfo != null ? groupInfo.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PluginsModuleSharedDataConfig(conversation=" + this.KWHzl + ", relationInfo=" + this.OLrzqt + ", groupInfo=" + this.copydefault + ")";
    }

    public C35287nsV(OKConversation oKConversation, RelationInfo relationInfo, GroupInfo groupInfo) {
        this.KWHzl = oKConversation;
        this.OLrzqt = relationInfo;
        this.copydefault = groupInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 com.okinc.okimcore.model.im.OKConversation)
  (wrap:com.okinc.okimcore.model.remote.RelationInfo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.RelationInfo) : (r3v0 com.okinc.okimcore.model.remote.RelationInfo))
  (wrap:com.okinc.okimcore.model.other.GroupInfo:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.other.GroupInfo) : (r4v0 com.okinc.okimcore.model.other.GroupInfo))
 A[MD:(com.okinc.okimcore.model.im.OKConversation, com.okinc.okimcore.model.remote.RelationInfo, com.okinc.okimcore.model.other.GroupInfo):void (m)] (LINE:7) call: o.nsV.<init>(com.okinc.okimcore.model.im.OKConversation, com.okinc.okimcore.model.remote.RelationInfo, com.okinc.okimcore.model.other.GroupInfo):void type: THIS */
    public /* synthetic */ C35287nsV(OKConversation oKConversation, RelationInfo relationInfo, GroupInfo groupInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(oKConversation, (i & 2) != 0 ? null : relationInfo, (i & 4) != 0 ? null : groupInfo);
    }
}
