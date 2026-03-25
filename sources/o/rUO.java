package o;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.core.util.SPUtils;
import com.okinc.kyc.api.biz.restriction.FeatureRestrictionInfo;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rUO {
    public static final rUO OLrzqt = new rUO();
    public static final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.rUQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return rUO.KWHzl();
        }
    });
    public static final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.rUR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(rUO.OLrzqt());
        }
    });
    public static final AKL KWHzl = new AKL(false, null, null, null, null, null, null, false, false, null, null, yDY.AhwBna());
    public static final int copydefault = 8;

    public static final class ActionBar extends TypeToken<java.util.List<? extends java.lang.String>> {
    }

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKComplianceRestrictionService.FeatureAction.values().length];
            try {
                iArr[OKComplianceRestrictionService.FeatureAction.QUESTION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKComplianceRestrictionService.FeatureAction.UK_QUESTION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OKComplianceRestrictionService.FeatureAction.REDIRECT_OKX_WALLET.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    public static final class TaskDescription extends TypeToken<java.util.List<? extends java.lang.String>> {
    }

    private rUO() {
    }

    public static final AKR KWHzl() {
        return new AKR();
    }

    public final AKR gEmmrt() {
        return (AKR) AEQbTJ.getValue();
    }

    public static final boolean OLrzqt() {
        java.lang.Integer numAEQbTJ = rUV.EZpvd.AEQbTJ();
        return numAEQbTJ != null && numAEQbTJ.intValue() == 2;
    }

    public final boolean AYXKKw() {
        return ((java.lang.Boolean) EZpvd.getValue()).booleanValue();
    }

    public final java.util.List<java.lang.String> AhwBna() {
        if (AYXKKw()) {
            return gEmmrt().KWHzl();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (OKComplianceRestrictionService.Feature feature : OKComplianceRestrictionService.Feature.values()) {
            if (feature != OKComplianceRestrictionService.Feature.LANGUAGE && feature != OKComplianceRestrictionService.Feature.MODE && feature != OKComplianceRestrictionService.Feature.SITE) {
                arrayList.add(feature.getType());
            }
        }
        return arrayList;
    }

    public final java.util.List<rUM> djBIcL() {
        rUM rum;
        FeatureRestrictionInfo featureRestrictionInfoEZpvd;
        rUM rum2;
        FeatureRestrictionInfo featureRestrictionInfoEZpvd2;
        if (AYXKKw()) {
            java.util.List<java.lang.String> listAhwBna = AhwBna();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
            for (java.lang.String str : listAhwBna) {
                AKL aklEZpvd = OLrzqt.gEmmrt().EZpvd(str);
                if (aklEZpvd != null) {
                    rum2 = new rUM(str, aklEZpvd);
                } else {
                    OKComplianceRestrictionService.Feature featureCopydefault = C42502rVf.copydefault(str);
                    if (featureCopydefault == null || (featureRestrictionInfoEZpvd2 = ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).EZpvd(featureCopydefault)) == null) {
                        rum2 = null;
                    } else {
                        java.lang.Boolean hidden = featureRestrictionInfoEZpvd2.getHidden();
                        java.lang.Boolean bool = java.lang.Boolean.TRUE;
                        boolean zEZpvd = Intrinsics.EZpvd(hidden, bool);
                        java.lang.String country = featureRestrictionInfoEZpvd2.getCountry();
                        java.lang.String countryName = featureRestrictionInfoEZpvd2.getCountryName();
                        java.lang.String province = featureRestrictionInfoEZpvd2.getProvince();
                        java.lang.String provinceCode = featureRestrictionInfoEZpvd2.getProvinceCode();
                        java.lang.Integer kycLevel = featureRestrictionInfoEZpvd2.getKycLevel();
                        java.lang.Integer politStatus = featureRestrictionInfoEZpvd2.getPolitStatus();
                        boolean zEZpvd2 = Intrinsics.EZpvd(featureRestrictionInfoEZpvd2.getHidden(), bool);
                        boolean zEZpvd3 = Intrinsics.EZpvd(featureRestrictionInfoEZpvd2.getRemoveUserFlag(), bool);
                        java.lang.String strName = featureRestrictionInfoEZpvd2.getAction().name();
                        java.lang.Long content = featureRestrictionInfoEZpvd2.getContent();
                        java.lang.Integer numValueOf = content != null ? java.lang.Integer.valueOf((int) content.longValue()) : null;
                        java.util.List<java.lang.String> mode = featureRestrictionInfoEZpvd2.getMode();
                        if (mode == null) {
                            mode = yDY.AhwBna();
                        }
                        rum2 = new rUM(str, new AKL(zEZpvd, country, countryName, province, provinceCode, kycLevel, politStatus, zEZpvd2, zEZpvd3, strName, numValueOf, mode));
                    }
                }
                arrayList.add(rum2);
            }
            return CollectionsKt___CollectionsKt.QfsBiF(arrayList);
        }
        java.util.List<java.lang.String> listAhwBna2 = AhwBna();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna2, 10));
        for (java.lang.String str2 : listAhwBna2) {
            java.lang.String string = SPUtils.getString("debug_feature_type_" + str2, "");
            if (C33129mqd.OLrzqt((java.lang.CharSequence) string)) {
                FeatureRestrictionInfo featureRestrictionInfo = (FeatureRestrictionInfo) new Gson().fromJson(string, FeatureRestrictionInfo.class);
                java.lang.Boolean hidden2 = featureRestrictionInfo.getHidden();
                java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                boolean zEZpvd4 = Intrinsics.EZpvd(hidden2, bool2);
                java.lang.String country2 = featureRestrictionInfo.getCountry();
                java.lang.String countryName2 = featureRestrictionInfo.getCountryName();
                java.lang.String province2 = featureRestrictionInfo.getProvince();
                java.lang.String provinceCode2 = featureRestrictionInfo.getProvinceCode();
                java.lang.Integer kycLevel2 = featureRestrictionInfo.getKycLevel();
                java.lang.Integer politStatus2 = featureRestrictionInfo.getPolitStatus();
                boolean zEZpvd5 = Intrinsics.EZpvd(featureRestrictionInfo.getHidden(), bool2);
                boolean zEZpvd6 = Intrinsics.EZpvd(featureRestrictionInfo.getRemoveUserFlag(), bool2);
                java.lang.String strName2 = featureRestrictionInfo.getAction().name();
                java.lang.Long content2 = featureRestrictionInfo.getContent();
                java.lang.Integer numValueOf2 = content2 != null ? java.lang.Integer.valueOf((int) content2.longValue()) : null;
                java.util.List<java.lang.String> mode2 = featureRestrictionInfo.getMode();
                if (mode2 == null) {
                    mode2 = yDY.AhwBna();
                }
                rum = new rUM(str2, new AKL(zEZpvd4, country2, countryName2, province2, provinceCode2, kycLevel2, politStatus2, zEZpvd5, zEZpvd6, strName2, numValueOf2, mode2));
            } else {
                OKComplianceRestrictionService.Feature featureCopydefault2 = C42502rVf.copydefault(str2);
                if (featureCopydefault2 == null || (featureRestrictionInfoEZpvd = ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).EZpvd(featureCopydefault2)) == null) {
                    rum = null;
                } else {
                    java.lang.Boolean hidden3 = featureRestrictionInfoEZpvd.getHidden();
                    java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
                    boolean zEZpvd7 = Intrinsics.EZpvd(hidden3, bool3);
                    java.lang.String country3 = featureRestrictionInfoEZpvd.getCountry();
                    java.lang.String countryName3 = featureRestrictionInfoEZpvd.getCountryName();
                    java.lang.String province3 = featureRestrictionInfoEZpvd.getProvince();
                    java.lang.String provinceCode3 = featureRestrictionInfoEZpvd.getProvinceCode();
                    java.lang.Integer kycLevel3 = featureRestrictionInfoEZpvd.getKycLevel();
                    java.lang.Integer politStatus3 = featureRestrictionInfoEZpvd.getPolitStatus();
                    boolean zEZpvd8 = Intrinsics.EZpvd(featureRestrictionInfoEZpvd.getHidden(), bool3);
                    boolean zEZpvd9 = Intrinsics.EZpvd(featureRestrictionInfoEZpvd.getRemoveUserFlag(), bool3);
                    java.lang.String strName3 = featureRestrictionInfoEZpvd.getAction().name();
                    java.lang.Long content3 = featureRestrictionInfoEZpvd.getContent();
                    java.lang.Integer numValueOf3 = content3 != null ? java.lang.Integer.valueOf((int) content3.longValue()) : null;
                    java.util.List<java.lang.String> mode3 = featureRestrictionInfoEZpvd.getMode();
                    if (mode3 == null) {
                        mode3 = yDY.AhwBna();
                    }
                    rum = new rUM(str2, new AKL(zEZpvd7, country3, countryName3, province3, provinceCode3, kycLevel3, politStatus3, zEZpvd8, zEZpvd9, strName3, numValueOf3, mode3));
                }
            }
            arrayList2.add(rum);
        }
        return CollectionsKt___CollectionsKt.QfsBiF(arrayList2);
    }

    public final boolean OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (AYXKKw()) {
            return gEmmrt().OLrzqt(str);
        }
        java.lang.String string = SPUtils.getString("debug_feature_type_" + str, "");
        return C33129mqd.OLrzqt((java.lang.CharSequence) string) && Intrinsics.EZpvd(((FeatureRestrictionInfo) new Gson().fromJson(string, FeatureRestrictionInfo.class)).isDebugMock(), java.lang.Boolean.TRUE);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, boolean z) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(str, "");
        if (AYXKKw()) {
            gEmmrt().OLrzqt(str, z);
            return;
        }
        java.lang.String string = SPUtils.getString("debug_feature_type_" + str, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((FeatureRestrictionInfo) new Gson().fromJson(string, FeatureRestrictionInfo.class));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            OKComplianceRestrictionService.Feature featureCopydefault = C42502rVf.copydefault(str);
            objM7377constructorimpl = featureCopydefault != null ? ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).EZpvd(featureCopydefault) : null;
        }
        FeatureRestrictionInfo featureRestrictionInfo = (FeatureRestrictionInfo) objM7377constructorimpl;
        if (featureRestrictionInfo != null) {
            rUO ruo = OLrzqt;
            featureRestrictionInfo.setDebugMock(java.lang.Boolean.TRUE);
            ruo.EZpvd(featureRestrictionInfo);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(@NotNull java.lang.String str, @NotNull AKL akl) {
        OKComplianceRestrictionService.FeatureAction featureAction;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(akl, "");
        if (AYXKKw()) {
            gEmmrt().AEQbTJ(str, akl);
            return;
        }
        FeatureRestrictionInfo featureRestrictionInfoCopydefault = copydefault(str);
        if (featureRestrictionInfoCopydefault == null) {
            OKComplianceRestrictionService.Feature featureCopydefault = C42502rVf.copydefault(str);
            Intrinsics.copydefault(featureCopydefault);
            featureRestrictionInfoCopydefault = new FeatureRestrictionInfo((java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, featureCopydefault, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, OKComplianceRestrictionService.FeatureAction.NO_FEATURE, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.String) null, (java.util.List) null, (java.lang.Boolean) null, (java.lang.Boolean) null, 65399, (DefaultConstructorMarker) null);
        }
        java.lang.Long lValueOf = akl.KWHzl() != null ? java.lang.Long.valueOf(r0.intValue()) : null;
        java.lang.String strOLrzqt = akl.OLrzqt();
        java.lang.String strEZpvd = akl.EZpvd();
        OKComplianceRestrictionService.Feature feature = featureRestrictionInfoCopydefault.getFeature();
        boolean zAEQbTJ = akl.AEQbTJ();
        java.lang.Integer numGEmmrt = akl.gEmmrt();
        java.lang.String strAkhnZx = akl.AkhnZx();
        java.lang.String strCopydefault = akl.copydefault();
        if (strCopydefault == null) {
            featureAction = OKComplianceRestrictionService.FeatureAction.NO_FEATURE;
        } else {
            int iHashCode = strCopydefault.hashCode();
            if (iHashCode != -1165870106) {
                if (iHashCode != -88947160) {
                    if (iHashCode == 641737913 && strCopydefault.equals("redirectOKXWallet")) {
                        featureAction = OKComplianceRestrictionService.FeatureAction.REDIRECT_OKX_WALLET;
                    }
                } else if (strCopydefault.equals("advancedQuestion")) {
                    featureAction = OKComplianceRestrictionService.FeatureAction.UK_QUESTION;
                }
            } else if (strCopydefault.equals("question")) {
                featureAction = OKComplianceRestrictionService.FeatureAction.QUESTION;
            }
        }
        EZpvd(new FeatureRestrictionInfo(lValueOf, strOLrzqt, strEZpvd, feature, java.lang.Boolean.valueOf(zAEQbTJ), numGEmmrt, strAkhnZx, featureAction, akl.djBIcL(), akl.valueOf(), java.lang.Boolean.valueOf(akl.values()), java.lang.Boolean.valueOf(akl.AhwBna()), featureRestrictionInfoCopydefault.getEntityId(), akl.AYXKKw(), featureRestrictionInfoCopydefault.getCrMarket(), featureRestrictionInfoCopydefault.isDebugMock()));
    }

    public final void EZpvd(@NotNull FeatureRestrictionInfo featureRestrictionInfo) {
        Intrinsics.checkNotNullParameter(featureRestrictionInfo, "");
        SPUtils.put("debug_feature_type_" + featureRestrictionInfo.getFeature().getType(), new Gson().toJson(featureRestrictionInfo));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AKL KWHzl(@NotNull java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.util.List<java.lang.String> mode;
        Intrinsics.checkNotNullParameter(str, "");
        if (AYXKKw()) {
            AKL aklEZpvd = gEmmrt().EZpvd(str);
            return aklEZpvd == null ? KWHzl : aklEZpvd;
        }
        FeatureRestrictionInfo featureRestrictionInfoCopydefault = copydefault(str);
        if (featureRestrictionInfoCopydefault == null) {
            return KWHzl;
        }
        java.lang.Boolean restricted = featureRestrictionInfoCopydefault.getRestricted();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        boolean zEZpvd = Intrinsics.EZpvd(restricted, bool);
        java.lang.String country = featureRestrictionInfoCopydefault.getCountry();
        java.lang.String countryName = featureRestrictionInfoCopydefault.getCountryName();
        java.lang.String province = featureRestrictionInfoCopydefault.getProvince();
        java.lang.String provinceCode = featureRestrictionInfoCopydefault.getProvinceCode();
        java.lang.Integer kycLevel = featureRestrictionInfoCopydefault.getKycLevel();
        java.lang.Integer politStatus = featureRestrictionInfoCopydefault.getPolitStatus();
        boolean zEZpvd2 = Intrinsics.EZpvd(featureRestrictionInfoCopydefault.getHidden(), bool);
        boolean zEZpvd3 = Intrinsics.EZpvd(featureRestrictionInfoCopydefault.getRemoveUserFlag(), bool);
        int i = StateListAnimator.OLrzqt[featureRestrictionInfoCopydefault.getAction().ordinal()];
        if (i == 1) {
            str2 = "question";
        } else if (i == 2) {
            str2 = "advancedQuestion";
        } else {
            if (i != 3) {
                str3 = null;
                java.lang.Long content = featureRestrictionInfoCopydefault.getContent();
                java.lang.Integer numValueOf = content == null ? java.lang.Integer.valueOf((int) content.longValue()) : null;
                mode = featureRestrictionInfoCopydefault.getMode();
                if (mode == null) {
                    mode = yDY.AhwBna();
                }
                return new AKL(zEZpvd, country, countryName, province, provinceCode, kycLevel, politStatus, zEZpvd2, zEZpvd3, str3, numValueOf, mode);
            }
            str2 = "redirectOKXWallet";
        }
        str3 = str2;
        java.lang.Long content2 = featureRestrictionInfoCopydefault.getContent();
        if (content2 == null) {
        }
        mode = featureRestrictionInfoCopydefault.getMode();
        if (mode == null) {
        }
        return new AKL(zEZpvd, country, countryName, province, provinceCode, kycLevel, politStatus, zEZpvd2, zEZpvd3, str3, numValueOf, mode);
    }

    public final FeatureRestrictionInfo copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String string = SPUtils.getString("debug_feature_type_" + str, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) string)) {
            try {
                return (FeatureRestrictionInfo) new Gson().fromJson(string, FeatureRestrictionInfo.class);
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    public final C42495rUz valueOf() {
        if (AYXKKw()) {
            java.util.HashMap map = new java.util.HashMap();
            java.util.List<java.lang.String> listAEQbTJ = gEmmrt().AEQbTJ();
            if (C33129mqd.KWHzl((java.util.Collection) listAEQbTJ)) {
                Gson gson = new Gson();
                Intrinsics.copydefault(listAEQbTJ, "");
                map.put("app mode", gson.toJson(listAEQbTJ));
            }
            java.util.List<java.lang.String> listOLrzqt = gEmmrt().OLrzqt();
            if (C33129mqd.KWHzl((java.util.Collection) listOLrzqt)) {
                Gson gson2 = new Gson();
                Intrinsics.copydefault(listOLrzqt, "");
                map.put("cefi mode", gson2.toJson(listOLrzqt));
            }
            if (C33129mqd.KWHzl((java.util.Collection) listAEQbTJ) || C33129mqd.KWHzl((java.util.Collection) listOLrzqt)) {
                return new C42495rUz(map);
            }
            return null;
        }
        return (C42495rUz) SPUtils.getObject("debug_sectiondata", C42495rUz.class);
    }

    public final void KWHzl(@NotNull C42495rUz c42495rUz) {
        Intrinsics.checkNotNullParameter(c42495rUz, "");
        if (AYXKKw()) {
            if (c42495rUz.KWHzl().containsKey("app mode")) {
                java.lang.reflect.Type type = new ActionBar().getType();
                AKR akrGEmmrt = gEmmrt();
                java.lang.Object objFromJson = new Gson().fromJson(c42495rUz.KWHzl().get("app mode"), type);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "");
                akrGEmmrt.OLrzqt((java.util.List<java.lang.String>) objFromJson);
            }
            if (c42495rUz.KWHzl().containsKey("cefi mode")) {
                java.lang.reflect.Type type2 = new TaskDescription().getType();
                AKR akrGEmmrt2 = gEmmrt();
                java.lang.Object objFromJson2 = new Gson().fromJson(c42495rUz.KWHzl().get("cefi mode"), type2);
                Intrinsics.checkNotNullExpressionValue(objFromJson2, "");
                akrGEmmrt2.EZpvd((java.util.List<java.lang.String>) objFromJson2);
                return;
            }
            return;
        }
        SPUtils.put("debug_sectiondata", c42495rUz);
    }

    public final boolean isConnected() {
        return mNP.AEQbTJ.copydefault();
    }

    public final void AEQbTJ() {
        if (AYXKKw()) {
            gEmmrt().OLrzqt(yDY.AhwBna());
            gEmmrt().EZpvd(yDY.AhwBna());
        } else {
            SPUtils.put("debug_mode_list", "");
            SPUtils.put("debug_cefi_list", "");
            SPUtils.put("debug_sectiondata", "");
        }
    }
}
