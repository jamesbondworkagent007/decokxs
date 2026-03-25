package o;

import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.OfficialTagType;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.p2p.api.OTCService;

/* JADX INFO: renamed from: o.ntT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35338ntT {
    public static final C35338ntT OLrzqt = new C35338ntT();

    private C35338ntT() {
    }

    public final C37151ooS copydefault(RelationInfo relationInfo) {
        OfficialTagInfo officialTags;
        if (relationInfo == null || (officialTags = relationInfo.getOfficialTags()) == null || !C44170sFx.KWHzl(officialTags)) {
            return null;
        }
        return new C37151ooS(EZpvd(relationInfo.getOfficialTags()), OLrzqt(relationInfo.getOfficialTags()));
    }

    public final java.lang.CharSequence EZpvd(OfficialTagInfo officialTagInfo) {
        if (officialTagInfo == null) {
            return null;
        }
        java.util.List<OfficialTagType> supportTagTypes = officialTagInfo.getSupportTagTypes();
        OTCService oTCService = (OTCService) C43251rlk.OLrzqt(OTCService.class);
        if (supportTagTypes.contains(OfficialTagType.DiamondMerchant)) {
            if (oTCService != null) {
                return oTCService.getDiamondMerchantLabelForIM();
            }
            return null;
        }
        if (!supportTagTypes.contains(OfficialTagType.CertifiedMerchant) || oTCService == null) {
            return null;
        }
        return oTCService.getVerifiedMerchantLabelForIM();
    }

    public final android.graphics.drawable.Drawable OLrzqt(OfficialTagInfo officialTagInfo) {
        java.util.List<OfficialTagType> listAhwBna;
        OTCService oTCService = (OTCService) C43251rlk.OLrzqt(OTCService.class);
        if (officialTagInfo == null || (listAhwBna = officialTagInfo.getSupportTagTypes()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        if (listAhwBna.contains(OfficialTagType.DiamondMerchant)) {
            if (oTCService != null) {
                return oTCService.getDiamondMerchantIcon();
            }
        } else if (listAhwBna.contains(OfficialTagType.CertifiedMerchant) && oTCService != null) {
            return oTCService.getVerifiedMerchantIcon();
        }
        return null;
    }
}
