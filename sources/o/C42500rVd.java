package o;

import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.ok_kyc_core_okx_impl.foebidden.net.FeatureRestriction;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.rVd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42500rVd {
    public static boolean EZpvd;
    public static final C42500rVd KWHzl = new C42500rVd();
    public static final int OLrzqt = 8;

    private C42500rVd() {
    }

    public final void EZpvd(@NotNull JSONObject jSONObject) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(jSONObject, "");
        try {
            if (EZpvd) {
                return;
            }
            EZpvd = true;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (OKComplianceRestrictionService.Feature feature : OKComplianceRestrictionService.Feature.getEntries()) {
                if (feature != OKComplianceRestrictionService.Feature.LANGUAGE && feature != OKComplianceRestrictionService.Feature.SITE && feature != OKComplianceRestrictionService.Feature.MODE && feature != OKComplianceRestrictionService.Feature.CR_TRADING_MODE && feature != OKComplianceRestrictionService.Feature.CR_TRADING_PAGE) {
                    try {
                        string = jSONObject.getString(feature.getType());
                    } catch (java.lang.Exception unused) {
                    }
                    FeatureRestriction featureRestriction = string != null ? (FeatureRestriction) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) FeatureRestriction.Companion.serializer(), string) : null;
                    if (featureRestriction != null && Intrinsics.EZpvd(featureRestriction.getHidden(), java.lang.Boolean.FALSE)) {
                        arrayList.add(feature.getType());
                    }
                }
            }
            OKComplianceRestrictionService.Feature feature2 = OKComplianceRestrictionService.Feature.CR_TRADING_MODE;
            OKComplianceRestrictionService.Feature feature3 = OKComplianceRestrictionService.Feature.CR_TRADING_PAGE;
            OKComplianceRestrictionService.Feature feature4 = OKComplianceRestrictionService.Feature.SITE;
            OKComplianceRestrictionService.Feature feature5 = OKComplianceRestrictionService.Feature.MODE;
            java.util.Map<java.lang.String, java.lang.String> mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("features_enabled", CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null)), C56390yDp.OLrzqt(feature2.getType(), jSONObject.getString(feature2.getType())), C56390yDp.OLrzqt(feature3.getType(), jSONObject.getString(feature3.getType())), C56390yDp.OLrzqt(feature4.getType(), jSONObject.getString(feature4.getType())), C56390yDp.OLrzqt(feature5.getType(), jSONObject.getString(feature5.getType())));
            ReportManager reportManager = ReportManager.AEQbTJ;
            EventData eventData = new EventData();
            eventData.setAct("feature_restriction_info");
            eventData.setSource("feature_restriction");
            eventData.setAttrs(mapGEmmrt);
            reportManager.EZpvd(eventData);
        } catch (java.lang.Exception unused2) {
            pUU.EZpvd("feature_restriction_info", "Failed to send the event");
            EZpvd = false;
        }
    }
}
