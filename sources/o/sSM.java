package o;

import com.okinc.okimcore.model.im.inhouseim.ContactRelationType;
import com.okinc.okimcore.model.other.QRCodeResultInfo;
import com.okinc.okimcore.model.other.QRCodeString;
import com.okinc.okimcore.model.remote.InhouseIMQueryMyQRCodeResponse;
import com.okinc.okimcore.model.remote.InhouseIMQueryQRCodeScanResponse;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.QRCodeType;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.ContactEntity;
import com.okinc.okimcore.model.utility.ContactExtField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sSM {
    public static final sSM AEQbTJ = new sSM();

    private sSM() {
    }

    public final RelationInfo OLrzqt(ContactEntity contactEntity) {
        OfficialTagInfo officialTagInfoCopydefault;
        ContactExtField contactExtFieldKWHzl;
        if (contactEntity == null) {
            return null;
        }
        boolean zKWHzl = C44157sFk.KWHzl(contactEntity.getContactsId());
        if (contactEntity.getOfficialTagInfo() != null) {
            officialTagInfoCopydefault = contactEntity.getOfficialTagInfo();
        } else {
            officialTagInfoCopydefault = C44474sRd.KWHzl.copydefault(contactEntity.getV1Field());
        }
        OfficialTagInfo officialTagInfo = officialTagInfoCopydefault;
        if (contactEntity.getV2Field().length() == 0) {
            contactExtFieldKWHzl = ContactExtField.Companion.KWHzl(contactEntity.isOpenKOL(), contactEntity.getKolUniqueName(), contactEntity.getEnNickname());
        } else {
            contactExtFieldKWHzl = ContactExtField.Companion.KWHzl(contactEntity.getV2Field());
        }
        return new RelationInfo(contactEntity.getContactsId(), contactEntity.getAvatar(), contactEntity.getNickName(), contactEntity.getRemarkName(), contactEntity.getSign(), contactEntity.getBlackListStatus() != 0, contactEntity.getNoDisturbStatus() != 0, contactEntity.getTopStatus() != 0, zKWHzl || contactEntity.getStrangerStatus() != ContactRelationType.STRANGER.getApiValue(), zKWHzl || contactEntity.getStrangerStatus() == ContactRelationType.TWO_WAY.getApiValue(), !zKWHzl && contactEntity.getStrangerStatus() == ContactRelationType.TWO_WAY.getApiValue(), zKWHzl, "", officialTagInfo, contactEntity.getTimestamp(), contactExtFieldKWHzl != null ? contactExtFieldKWHzl.isOpenKOL() : false, contactExtFieldKWHzl != null ? contactExtFieldKWHzl.getKolUniqueName() : null, contactExtFieldKWHzl != null ? contactExtFieldKWHzl.getEnNickName() : null, contactEntity.getAllowAddContact(), contactEntity.isAllowSendMessage(), contactEntity.getShowVoiceCall(), contactEntity.getAllowKycBanner(), contactEntity.getRelationSourceType(), contactEntity.getHash(), contactEntity.getPhoneName(), contactEntity.getPhoneRawNumber(), contactEntity.isAllowSingleChatInGroup(), contactEntity.getShowUnknownContactBanner(), contactEntity.getAllowVoice(), contactEntity.getAllowFile(), contactEntity.getAllowPlanetProfile(), contactEntity.getOrbitBackgroundImage(), contactEntity.getOrbitStatus(), contactEntity.getAllowBlockUser(), contactEntity.getShowVipPerformanceDetails(), contactEntity.getAllowRemoveGroupMember(), contactEntity.getCustomNote(), contactEntity.getAllowPay());
    }

    public final QRCodeResultInfo OLrzqt(@NotNull InhouseIMQueryQRCodeScanResponse inhouseIMQueryQRCodeScanResponse) {
        Intrinsics.checkNotNullParameter(inhouseIMQueryQRCodeScanResponse, "");
        QRCodeType qRCodeTypeAEQbTJ = QRCodeType.Companion.AEQbTJ(inhouseIMQueryQRCodeScanResponse.getTargetType());
        java.lang.String targetId = inhouseIMQueryQRCodeScanResponse.getTargetId();
        java.lang.String str = targetId == null ? "" : targetId;
        java.lang.String targetId2 = inhouseIMQueryQRCodeScanResponse.getTargetId();
        java.lang.String str2 = targetId2 == null ? "" : targetId2;
        java.lang.String avatar = inhouseIMQueryQRCodeScanResponse.getAvatar();
        return new QRCodeResultInfo(qRCodeTypeAEQbTJ, str, str2, avatar == null ? "" : avatar, inhouseIMQueryQRCodeScanResponse.getName(), 0);
    }

    public final QRCodeString KWHzl(@NotNull InhouseIMQueryMyQRCodeResponse inhouseIMQueryMyQRCodeResponse) {
        Intrinsics.checkNotNullParameter(inhouseIMQueryMyQRCodeResponse, "");
        return new QRCodeString(inhouseIMQueryMyQRCodeResponse.getQrcode());
    }
}
