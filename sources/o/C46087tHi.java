package o;

import com.okinc.im.bean.SearchResultData;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tHi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46087tHi implements InterfaceC47828txV {
    public static final int copydefault = SearchResultData.ChatAndContact.$stable | OfficialTagInfo.$stable;
    public final OfficialTagInfo AEQbTJ;
    public final java.lang.String AYXKKw;
    public final boolean EZpvd;
    public final java.lang.String KWHzl;
    public final SearchResultData.ChatAndContact OLrzqt;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C46087tHi copy$default(C46087tHi c46087tHi, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, OfficialTagInfo officialTagInfo, SearchResultData.ChatAndContact chatAndContact, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c46087tHi.AYXKKw;
        }
        if ((i & 2) != 0) {
            str2 = c46087tHi.gEmmrt;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            str3 = c46087tHi.KWHzl;
        }
        java.lang.String str5 = str3;
        if ((i & 8) != 0) {
            z = c46087tHi.EZpvd;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            officialTagInfo = c46087tHi.AEQbTJ;
        }
        OfficialTagInfo officialTagInfo2 = officialTagInfo;
        if ((i & 32) != 0) {
            chatAndContact = c46087tHi.OLrzqt;
        }
        return c46087tHi.KWHzl(str, str4, str5, z2, officialTagInfo2, chatAndContact);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46087tHi KWHzl(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, OfficialTagInfo officialTagInfo, @NotNull SearchResultData.ChatAndContact chatAndContact) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(chatAndContact, "");
        return new C46087tHi(str, str2, str3, z, officialTagInfo, chatAndContact);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchResultData.ChatAndContact OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46087tHi)) {
            return false;
        }
        C46087tHi c46087tHi = (C46087tHi) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c46087tHi.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c46087tHi.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c46087tHi.KWHzl) && this.EZpvd == c46087tHi.EZpvd && Intrinsics.EZpvd(this.AEQbTJ, c46087tHi.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, c46087tHi.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AYXKKw.hashCode();
        java.lang.String str = this.gEmmrt;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.KWHzl;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        int iHashCode4 = java.lang.Boolean.hashCode(this.EZpvd);
        OfficialTagInfo officialTagInfo = this.AEQbTJ;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (officialTagInfo != null ? officialTagInfo.hashCode() : 0)) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SearchResultIMContactVo(title=" + this.AYXKKw + ", subtitle=" + this.gEmmrt + ", avatarUrl=" + this.KWHzl + ", isPremiumGroup=" + this.EZpvd + ", officialTagInfo=" + this.AEQbTJ + ", rawData=" + this.OLrzqt + ")";
    }

    public C46087tHi(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, OfficialTagInfo officialTagInfo, @NotNull SearchResultData.ChatAndContact chatAndContact) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(chatAndContact, "");
        this.AYXKKw = str;
        this.gEmmrt = str2;
        this.KWHzl = str3;
        this.EZpvd = z;
        this.AEQbTJ = officialTagInfo;
        this.OLrzqt = chatAndContact;
    }

    @Override // o.InterfaceC47828txV
    public boolean copydefault(@NotNull InterfaceC47828txV interfaceC47828txV) {
        Intrinsics.checkNotNullParameter(interfaceC47828txV, "");
        if (!(interfaceC47828txV instanceof C46087tHi)) {
            return false;
        }
        OKConversation conversation = this.OLrzqt.getConversation();
        java.lang.String targetId = conversation != null ? conversation.getTargetId() : null;
        C46087tHi c46087tHi = (C46087tHi) interfaceC47828txV;
        OKConversation conversation2 = c46087tHi.OLrzqt.getConversation();
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) targetId, (java.lang.Object) (conversation2 != null ? conversation2.getTargetId() : null));
        RelationInfo relation = this.OLrzqt.getRelation();
        java.lang.String contactsId = relation != null ? relation.getContactsId() : null;
        RelationInfo relation2 = c46087tHi.OLrzqt.getRelation();
        return zEZpvd && Intrinsics.EZpvd((java.lang.Object) contactsId, (java.lang.Object) (relation2 != null ? relation2.getContactsId() : null));
    }

    @Override // o.InterfaceC47828txV
    public boolean KWHzl(@NotNull InterfaceC47828txV interfaceC47828txV) {
        Intrinsics.checkNotNullParameter(interfaceC47828txV, "");
        if (!(interfaceC47828txV instanceof C46087tHi)) {
            return false;
        }
        OKConversation conversation = this.OLrzqt.getConversation();
        java.lang.String targetId = conversation != null ? conversation.getTargetId() : null;
        C46087tHi c46087tHi = (C46087tHi) interfaceC47828txV;
        OKConversation conversation2 = c46087tHi.OLrzqt.getConversation();
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) targetId, (java.lang.Object) (conversation2 != null ? conversation2.getTargetId() : null));
        RelationInfo relation = this.OLrzqt.getRelation();
        java.lang.String contactsId = relation != null ? relation.getContactsId() : null;
        RelationInfo relation2 = c46087tHi.OLrzqt.getRelation();
        return zEZpvd && Intrinsics.EZpvd((java.lang.Object) contactsId, (java.lang.Object) (relation2 != null ? relation2.getContactsId() : null)) && Intrinsics.EZpvd(this.OLrzqt.getPhoneRelation(), c46087tHi.OLrzqt.getPhoneRelation()) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt.getSearchKeyword(), (java.lang.Object) c46087tHi.OLrzqt.getSearchKeyword());
    }
}
