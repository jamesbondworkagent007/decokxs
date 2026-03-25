package o;

import com.okinc.kyc.api.biz.restriction.FeatureRestrictionInfo;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC33244msm;

/* JADX INFO: renamed from: o.svi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45726svi {
    public static final C45726svi KWHzl = new C45726svi();

    private C45726svi() {
    }

    public final boolean EZpvd() {
        FeatureRestrictionInfo featureRestrictionInfoEZpvd;
        java.lang.Boolean hidden;
        OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) C43251rlk.OLrzqt(OKComplianceRestrictionService.class);
        if (oKComplianceRestrictionService == null || (featureRestrictionInfoEZpvd = oKComplianceRestrictionService.EZpvd(OKComplianceRestrictionService.Feature.NEW_ONSHORE_IA)) == null || (hidden = featureRestrictionInfoEZpvd.getHidden()) == null) {
            return true;
        }
        return hidden.booleanValue();
    }

    public final boolean copydefault() {
        StateFlow<AbstractC33244msm> stateFlowValues;
        java.util.List listGEmmrt = yDY.gEmmrt(AbstractC33244msm.Fragment.KWHzl, AbstractC33244msm.ActionBar.KWHzl);
        InterfaceC33171mrS interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.OLrzqt(InterfaceC33171mrS.class);
        return CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends AbstractC33244msm>) ((java.lang.Iterable<? extends java.lang.Object>) listGEmmrt), (interfaceC33171mrS == null || (stateFlowValues = interfaceC33171mrS.values()) == null) ? null : stateFlowValues.getValue());
    }

    public final boolean AEQbTJ() {
        return !EZpvd() && copydefault();
    }
}
