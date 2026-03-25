package o;

import com.okinc.im.bean.SearchResultData;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tHp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46094tHp implements InterfaceC47828txV {
    public static final int KWHzl = SearchResultData.Message.$stable | OfficialTagInfo.$stable;
    public final java.lang.String AEQbTJ;
    public final SearchResultData.Message AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public final boolean OLrzqt;
    public final java.lang.String copydefault;
    public final OfficialTagInfo djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C46094tHp copy$default(C46094tHp c46094tHp, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, OfficialTagInfo officialTagInfo, SearchResultData.Message message, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c46094tHp.AhwBna;
        }
        if ((i & 2) != 0) {
            str2 = c46094tHp.AEQbTJ;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = c46094tHp.copydefault;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = c46094tHp.EZpvd;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            z = c46094tHp.OLrzqt;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            officialTagInfo = c46094tHp.djBIcL;
        }
        OfficialTagInfo officialTagInfo2 = officialTagInfo;
        if ((i & 64) != 0) {
            message = c46094tHp.AYXKKw;
        }
        return c46094tHp.EZpvd(str, str5, str6, str7, z2, officialTagInfo2, message);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46094tHp EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, OfficialTagInfo officialTagInfo, @NotNull SearchResultData.Message message) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(message, "");
        return new C46094tHp(str, str2, str3, str4, z, officialTagInfo, message);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchResultData.Message copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46094tHp)) {
            return false;
        }
        C46094tHp c46094tHp = (C46094tHp) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c46094tHp.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c46094tHp.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c46094tHp.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c46094tHp.EZpvd) && this.OLrzqt == c46094tHp.OLrzqt && Intrinsics.EZpvd(this.djBIcL, c46094tHp.djBIcL) && Intrinsics.EZpvd(this.AYXKKw, c46094tHp.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AhwBna.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        java.lang.String str = this.copydefault;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.EZpvd;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        int iHashCode5 = java.lang.Boolean.hashCode(this.OLrzqt);
        OfficialTagInfo officialTagInfo = this.djBIcL;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (officialTagInfo != null ? officialTagInfo.hashCode() : 0)) * 31) + this.AYXKKw.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SearchResultIMMessageVo(title=" + this.AhwBna + ", content=" + this.AEQbTJ + ", avatarUrl=" + this.copydefault + ", formattedTime=" + this.EZpvd + ", isPremiumGroup=" + this.OLrzqt + ", officialTagInfo=" + this.djBIcL + ", rawData=" + this.AYXKKw + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.AhwBna;
    }

    public C46094tHp(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, OfficialTagInfo officialTagInfo, @NotNull SearchResultData.Message message) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(message, "");
        this.AhwBna = str;
        this.AEQbTJ = str2;
        this.copydefault = str3;
        this.EZpvd = str4;
        this.OLrzqt = z;
        this.djBIcL = officialTagInfo;
        this.AYXKKw = message;
    }

    @Override // o.InterfaceC47828txV
    public boolean copydefault(@NotNull InterfaceC47828txV interfaceC47828txV) {
        Intrinsics.checkNotNullParameter(interfaceC47828txV, "");
        if (!(interfaceC47828txV instanceof C46094tHp)) {
            return false;
        }
        OKMessage message = this.AYXKKw.getMessage();
        java.lang.Long lValueOf = message != null ? java.lang.Long.valueOf(message.getSeq()) : null;
        OKMessage message2 = ((C46094tHp) interfaceC47828txV).AYXKKw.getMessage();
        return Intrinsics.EZpvd(lValueOf, message2 != null ? java.lang.Long.valueOf(message2.getSeq()) : null);
    }

    @Override // o.InterfaceC47828txV
    public boolean KWHzl(@NotNull InterfaceC47828txV interfaceC47828txV) {
        Intrinsics.checkNotNullParameter(interfaceC47828txV, "");
        if (!(interfaceC47828txV instanceof C46094tHp)) {
            return false;
        }
        OKMessage message = this.AYXKKw.getMessage();
        java.lang.Long lValueOf = message != null ? java.lang.Long.valueOf(message.getSeq()) : null;
        C46094tHp c46094tHp = (C46094tHp) interfaceC47828txV;
        OKMessage message2 = c46094tHp.AYXKKw.getMessage();
        return Intrinsics.EZpvd(lValueOf, message2 != null ? java.lang.Long.valueOf(message2.getSeq()) : null) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw.getConversation().getTargetId(), (java.lang.Object) c46094tHp.AYXKKw.getConversation().getTargetId()) && Intrinsics.EZpvd(this.AYXKKw.getTaggedUserContact(), c46094tHp.AYXKKw.getTaggedUserContact()) && Intrinsics.EZpvd(this.AYXKKw.getContact(), c46094tHp.AYXKKw.getContact()) && Intrinsics.EZpvd(this.AYXKKw.getPhoneRelation(), c46094tHp.AYXKKw.getPhoneRelation());
    }
}
