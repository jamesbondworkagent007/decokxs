package o;

import com.okinc.im.bean.SearchResultData;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tHj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46088tHj implements InterfaceC47828txV {
    public static final int EZpvd = SearchResultData.GroupResult.$stable | OfficialTagInfo.$stable;
    public final java.lang.String AEQbTJ;
    public final SearchResultData.GroupResult KWHzl;
    public final boolean OLrzqt;
    public final OfficialTagInfo copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C46088tHj copy$default(C46088tHj c46088tHj, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, OfficialTagInfo officialTagInfo, SearchResultData.GroupResult groupResult, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c46088tHj.djBIcL;
        }
        if ((i & 2) != 0) {
            str2 = c46088tHj.gEmmrt;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            str3 = c46088tHj.AEQbTJ;
        }
        java.lang.String str5 = str3;
        if ((i & 8) != 0) {
            z = c46088tHj.OLrzqt;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            officialTagInfo = c46088tHj.copydefault;
        }
        OfficialTagInfo officialTagInfo2 = officialTagInfo;
        if ((i & 32) != 0) {
            groupResult = c46088tHj.KWHzl;
        }
        return c46088tHj.KWHzl(str, str4, str5, z2, officialTagInfo2, groupResult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46088tHj KWHzl(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, OfficialTagInfo officialTagInfo, @NotNull SearchResultData.GroupResult groupResult) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(groupResult, "");
        return new C46088tHj(str, str2, str3, z, officialTagInfo, groupResult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchResultData.GroupResult copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46088tHj)) {
            return false;
        }
        C46088tHj c46088tHj = (C46088tHj) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c46088tHj.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c46088tHj.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c46088tHj.AEQbTJ) && this.OLrzqt == c46088tHj.OLrzqt && Intrinsics.EZpvd(this.copydefault, c46088tHj.copydefault) && Intrinsics.EZpvd(this.KWHzl, c46088tHj.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.djBIcL.hashCode();
        java.lang.String str = this.gEmmrt;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        int iHashCode4 = java.lang.Boolean.hashCode(this.OLrzqt);
        OfficialTagInfo officialTagInfo = this.copydefault;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (officialTagInfo != null ? officialTagInfo.hashCode() : 0)) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SearchResultIMGroupVo(title=" + this.djBIcL + ", subtitle=" + this.gEmmrt + ", avatarUrl=" + this.AEQbTJ + ", isPremiumGroup=" + this.OLrzqt + ", officialTagInfo=" + this.copydefault + ", rawData=" + this.KWHzl + ")";
    }

    public C46088tHj(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, OfficialTagInfo officialTagInfo, @NotNull SearchResultData.GroupResult groupResult) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(groupResult, "");
        this.djBIcL = str;
        this.gEmmrt = str2;
        this.AEQbTJ = str3;
        this.OLrzqt = z;
        this.copydefault = officialTagInfo;
        this.KWHzl = groupResult;
    }

    @Override // o.InterfaceC47828txV
    public boolean copydefault(@NotNull InterfaceC47828txV interfaceC47828txV) {
        Intrinsics.checkNotNullParameter(interfaceC47828txV, "");
        if (interfaceC47828txV instanceof C46088tHj) {
            OKConversation conversation = this.KWHzl.getConversation();
            java.lang.String targetId = conversation != null ? conversation.getTargetId() : null;
            OKConversation conversation2 = ((C46088tHj) interfaceC47828txV).KWHzl.getConversation();
            if (Intrinsics.EZpvd((java.lang.Object) targetId, (java.lang.Object) (conversation2 != null ? conversation2.getTargetId() : null))) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC47828txV
    public boolean KWHzl(@NotNull InterfaceC47828txV interfaceC47828txV) {
        Intrinsics.checkNotNullParameter(interfaceC47828txV, "");
        if (!(interfaceC47828txV instanceof C46088tHj)) {
            return false;
        }
        OKConversation conversation = this.KWHzl.getConversation();
        java.lang.String targetId = conversation != null ? conversation.getTargetId() : null;
        C46088tHj c46088tHj = (C46088tHj) interfaceC47828txV;
        OKConversation conversation2 = c46088tHj.KWHzl.getConversation();
        return Intrinsics.EZpvd((java.lang.Object) targetId, (java.lang.Object) (conversation2 != null ? conversation2.getTargetId() : null)) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl.getSearchKeyword(), (java.lang.Object) c46088tHj.KWHzl.getSearchKeyword());
    }
}
