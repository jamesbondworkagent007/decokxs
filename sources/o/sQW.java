package o;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.inhouseim.PhoneRelationEntity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public interface sQW {

    public static final class StateListAnimator implements sQW {
        public final OKConversation EZpvd;
        public final RelationInfo KWHzl;
        public final PhoneRelationEntity copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, OKConversation oKConversation, RelationInfo relationInfo, PhoneRelationEntity phoneRelationEntity, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                oKConversation = stateListAnimator.EZpvd;
            }
            if ((i & 2) != 0) {
                relationInfo = stateListAnimator.KWHzl;
            }
            if ((i & 4) != 0) {
                phoneRelationEntity = stateListAnimator.copydefault;
            }
            return stateListAnimator.OLrzqt(oKConversation, relationInfo, phoneRelationEntity);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RelationInfo EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PhoneRelationEntity OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(OKConversation oKConversation, RelationInfo relationInfo, PhoneRelationEntity phoneRelationEntity) {
            return new StateListAnimator(oKConversation, relationInfo, phoneRelationEntity);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKConversation copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd) && Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl) && Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            OKConversation oKConversation = this.EZpvd;
            int iHashCode = oKConversation == null ? 0 : oKConversation.hashCode();
            RelationInfo relationInfo = this.KWHzl;
            int iHashCode2 = relationInfo == null ? 0 : relationInfo.hashCode();
            PhoneRelationEntity phoneRelationEntity = this.copydefault;
            return (((iHashCode * 31) + iHashCode2) * 31) + (phoneRelationEntity != null ? phoneRelationEntity.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Contact(conversation=" + this.EZpvd + ", relation=" + this.KWHzl + ", phoneRelation=" + this.copydefault + ")";
        }

        public StateListAnimator(OKConversation oKConversation, RelationInfo relationInfo, PhoneRelationEntity phoneRelationEntity) {
            this.EZpvd = oKConversation;
            this.KWHzl = relationInfo;
            this.copydefault = phoneRelationEntity;
        }
    }
}
