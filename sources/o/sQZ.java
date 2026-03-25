package o;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.inhouseim.PhoneRelationEntity;
import com.okinc.okimcore.model.share.ShareTarget;
import com.okinc.okimcore.model.share.ShareTargetType;
import kotlin.jvm.internal.Intrinsics;
import o.sQW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sQZ {
    public static final ShareTarget OLrzqt(@NotNull sQW.StateListAnimator stateListAnimator) {
        ShareTarget shareTarget;
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        OKConversation oKConversationCopydefault = stateListAnimator.copydefault();
        if (oKConversationCopydefault == null || (shareTargetCopydefault = C44471sRa.copydefault(oKConversationCopydefault)) == null) {
            RelationInfo relationInfoEZpvd = stateListAnimator.EZpvd();
            if (relationInfoEZpvd != null) {
                ShareTarget shareTargetCopydefault = C44471sRa.copydefault(relationInfoEZpvd, ShareTargetType.Contact);
                shareTarget = shareTargetCopydefault;
            } else {
                shareTarget = null;
            }
        } else {
            shareTarget = shareTargetCopydefault;
        }
        if (shareTarget != null) {
            return shareTarget.AEQbTJ((247 & 1) != 0 ? shareTarget.valueOf : null, (247 & 2) != 0 ? shareTarget.OLrzqt : null, (247 & 4) != 0 ? shareTarget.EZpvd : null, (247 & 8) != 0 ? shareTarget.AhwBna : AEQbTJ(stateListAnimator), (247 & 16) != 0 ? shareTarget.AEQbTJ : null, (247 & 32) != 0 ? shareTarget.gEmmrt : null, (247 & 64) != 0 ? shareTarget.AYXKKw : null, (247 & 128) != 0 ? shareTarget.KWHzl : null);
        }
        return null;
    }

    public static final java.lang.String AEQbTJ(@NotNull sQW.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        RelationInfo relationInfoEZpvd = stateListAnimator.EZpvd();
        java.lang.String remarkName = relationInfoEZpvd != null ? relationInfoEZpvd.getRemarkName() : null;
        if (remarkName == null) {
            remarkName = "";
        }
        if (remarkName.length() == 0) {
            PhoneRelationEntity phoneRelationEntityOLrzqt = stateListAnimator.OLrzqt();
            remarkName = phoneRelationEntityOLrzqt != null ? phoneRelationEntityOLrzqt.getName() : null;
            if (remarkName == null) {
                remarkName = "";
            }
        }
        if (remarkName.length() == 0) {
            OKConversation oKConversationCopydefault = stateListAnimator.copydefault();
            remarkName = oKConversationCopydefault != null ? oKConversationCopydefault.getConversationTitle() : null;
            if (remarkName == null) {
                remarkName = "";
            }
        }
        if (remarkName.length() == 0) {
            RelationInfo relationInfoEZpvd2 = stateListAnimator.EZpvd();
            remarkName = relationInfoEZpvd2 != null ? relationInfoEZpvd2.getNickName() : null;
            if (remarkName == null) {
                remarkName = "";
            }
        }
        if (remarkName.length() == 0) {
            RelationInfo relationInfoEZpvd3 = stateListAnimator.EZpvd();
            java.lang.String enNickName = relationInfoEZpvd3 != null ? relationInfoEZpvd3.getEnNickName() : null;
            remarkName = enNickName != null ? enNickName : "";
        }
        return C33129mqd.gEmmrt(remarkName);
    }
}
