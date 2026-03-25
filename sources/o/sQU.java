package o;

import com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import com.okinc.okimcore.model.room.inhouseim.PhoneRelationEntity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class sQU {
    public final PhoneRelationEntity EZpvd;
    public final InHouseIMConversationEntity KWHzl;
    public final InHouseIMContactInfoEntity OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ sQU copy$default(sQU squ, InHouseIMConversationEntity inHouseIMConversationEntity, InHouseIMContactInfoEntity inHouseIMContactInfoEntity, PhoneRelationEntity phoneRelationEntity, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            inHouseIMConversationEntity = squ.KWHzl;
        }
        if ((i & 2) != 0) {
            inHouseIMContactInfoEntity = squ.OLrzqt;
        }
        if ((i & 4) != 0) {
            phoneRelationEntity = squ.EZpvd;
        }
        return squ.copydefault(inHouseIMConversationEntity, inHouseIMContactInfoEntity, phoneRelationEntity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PhoneRelationEntity KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMContactInfoEntity OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMConversationEntity copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final sQU copydefault(InHouseIMConversationEntity inHouseIMConversationEntity, InHouseIMContactInfoEntity inHouseIMContactInfoEntity, PhoneRelationEntity phoneRelationEntity) {
        return new sQU(inHouseIMConversationEntity, inHouseIMContactInfoEntity, phoneRelationEntity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sQU)) {
            return false;
        }
        sQU squ = (sQU) obj;
        return Intrinsics.EZpvd(this.KWHzl, squ.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, squ.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, squ.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        InHouseIMConversationEntity inHouseIMConversationEntity = this.KWHzl;
        int iHashCode = inHouseIMConversationEntity == null ? 0 : inHouseIMConversationEntity.hashCode();
        InHouseIMContactInfoEntity inHouseIMContactInfoEntity = this.OLrzqt;
        int iHashCode2 = inHouseIMContactInfoEntity == null ? 0 : inHouseIMContactInfoEntity.hashCode();
        PhoneRelationEntity phoneRelationEntity = this.EZpvd;
        return (((iHashCode * 31) + iHashCode2) * 31) + (phoneRelationEntity != null ? phoneRelationEntity.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ConversationWithOkxRelationAndPhoneRelation(conversation=" + this.KWHzl + ", relation=" + this.OLrzqt + ", phoneRelation=" + this.EZpvd + ")";
    }

    public sQU(InHouseIMConversationEntity inHouseIMConversationEntity, InHouseIMContactInfoEntity inHouseIMContactInfoEntity, PhoneRelationEntity phoneRelationEntity) {
        this.KWHzl = inHouseIMConversationEntity;
        this.OLrzqt = inHouseIMContactInfoEntity;
        this.EZpvd = phoneRelationEntity;
    }
}
