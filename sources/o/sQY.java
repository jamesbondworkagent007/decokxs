package o;

import com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import com.okinc.okimcore.model.room.inhouseim.PhoneRelationEntity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sQY {
    public final PhoneRelationEntity AEQbTJ;
    public final InHouseIMConversationEntity EZpvd;
    public final InHouseIMContactInfoEntity KWHzl;
    public final InHouseIMMessageEntity OLrzqt;
    public final InHouseIMContactInfoEntity copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ sQY copy$default(sQY sqy, InHouseIMContactInfoEntity inHouseIMContactInfoEntity, InHouseIMMessageEntity inHouseIMMessageEntity, InHouseIMConversationEntity inHouseIMConversationEntity, InHouseIMContactInfoEntity inHouseIMContactInfoEntity2, PhoneRelationEntity phoneRelationEntity, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            inHouseIMContactInfoEntity = sqy.copydefault;
        }
        if ((i & 2) != 0) {
            inHouseIMMessageEntity = sqy.OLrzqt;
        }
        InHouseIMMessageEntity inHouseIMMessageEntity2 = inHouseIMMessageEntity;
        if ((i & 4) != 0) {
            inHouseIMConversationEntity = sqy.EZpvd;
        }
        InHouseIMConversationEntity inHouseIMConversationEntity2 = inHouseIMConversationEntity;
        if ((i & 8) != 0) {
            inHouseIMContactInfoEntity2 = sqy.KWHzl;
        }
        InHouseIMContactInfoEntity inHouseIMContactInfoEntity3 = inHouseIMContactInfoEntity2;
        if ((i & 16) != 0) {
            phoneRelationEntity = sqy.AEQbTJ;
        }
        return sqy.copydefault(inHouseIMContactInfoEntity, inHouseIMMessageEntity2, inHouseIMConversationEntity2, inHouseIMContactInfoEntity3, phoneRelationEntity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMContactInfoEntity AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PhoneRelationEntity EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMContactInfoEntity KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMConversationEntity OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMMessageEntity copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final sQY copydefault(InHouseIMContactInfoEntity inHouseIMContactInfoEntity, @NotNull InHouseIMMessageEntity inHouseIMMessageEntity, @NotNull InHouseIMConversationEntity inHouseIMConversationEntity, InHouseIMContactInfoEntity inHouseIMContactInfoEntity2, PhoneRelationEntity phoneRelationEntity) {
        Intrinsics.checkNotNullParameter(inHouseIMMessageEntity, "");
        Intrinsics.checkNotNullParameter(inHouseIMConversationEntity, "");
        return new sQY(inHouseIMContactInfoEntity, inHouseIMMessageEntity, inHouseIMConversationEntity, inHouseIMContactInfoEntity2, phoneRelationEntity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sQY)) {
            return false;
        }
        sQY sqy = (sQY) obj;
        return Intrinsics.EZpvd(this.copydefault, sqy.copydefault) && Intrinsics.EZpvd(this.OLrzqt, sqy.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, sqy.EZpvd) && Intrinsics.EZpvd(this.KWHzl, sqy.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, sqy.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        InHouseIMContactInfoEntity inHouseIMContactInfoEntity = this.copydefault;
        int iHashCode = inHouseIMContactInfoEntity == null ? 0 : inHouseIMContactInfoEntity.hashCode();
        int iHashCode2 = this.OLrzqt.hashCode();
        int iHashCode3 = this.EZpvd.hashCode();
        InHouseIMContactInfoEntity inHouseIMContactInfoEntity2 = this.KWHzl;
        int iHashCode4 = inHouseIMContactInfoEntity2 == null ? 0 : inHouseIMContactInfoEntity2.hashCode();
        PhoneRelationEntity phoneRelationEntity = this.AEQbTJ;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (phoneRelationEntity != null ? phoneRelationEntity.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MessageWithConversationAndContact(contact=" + this.copydefault + ", message=" + this.OLrzqt + ", conversation=" + this.EZpvd + ", taggedUserContact=" + this.KWHzl + ", phoneRelations=" + this.AEQbTJ + ")";
    }

    public sQY(InHouseIMContactInfoEntity inHouseIMContactInfoEntity, @NotNull InHouseIMMessageEntity inHouseIMMessageEntity, @NotNull InHouseIMConversationEntity inHouseIMConversationEntity, InHouseIMContactInfoEntity inHouseIMContactInfoEntity2, PhoneRelationEntity phoneRelationEntity) {
        Intrinsics.checkNotNullParameter(inHouseIMMessageEntity, "");
        Intrinsics.checkNotNullParameter(inHouseIMConversationEntity, "");
        this.copydefault = inHouseIMContactInfoEntity;
        this.OLrzqt = inHouseIMMessageEntity;
        this.EZpvd = inHouseIMConversationEntity;
        this.KWHzl = inHouseIMContactInfoEntity2;
        this.AEQbTJ = phoneRelationEntity;
    }
}
