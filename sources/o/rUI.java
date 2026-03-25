package o;

import com.google.gson.JsonObject;
import com.okinc.kyc.api.biz.restriction.FeatureRestrictionInfo;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.ok_kyc_core_okx_impl.foebidden.loader.OKCoreFeatureRestrictionClient$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rUI implements ALH {
    public final pHH AEQbTJ;

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

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
            AEQbTJ = iArr;
        }
    }

    public rUI(@NotNull pHH phh) {
        Intrinsics.checkNotNullParameter(phh, "");
        this.AEQbTJ = phh;
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new OKCoreFeatureRestrictionClient$1(this, null), 3, null);
    }

    public static final class Application implements InterfaceC2462AMr {
        @Override // o.InterfaceC2462AMr
        public void EZpvd() {
        }

        public Application() {
        }

        @Override // o.InterfaceC2462AMr
        public java.lang.Object EZpvd(Continuation<? super java.lang.Boolean> continuation) {
            return rUI.this.AEQbTJ.copydefault(continuation);
        }
    }

    @Override // o.ALH
    public InterfaceC2462AMr EZpvd() {
        return new Application();
    }

    @Override // o.ALH
    public boolean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OKComplianceRestrictionService.Feature featureCopydefault = C42502rVf.copydefault(str);
        if (featureCopydefault == null) {
            return false;
        }
        return this.AEQbTJ.AEQbTJ(featureCopydefault);
    }

    @Override // o.ALH
    public boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OKComplianceRestrictionService.Feature featureCopydefault = C42502rVf.copydefault(str);
        if (featureCopydefault == null) {
            return false;
        }
        return this.AEQbTJ.OLrzqt(featureCopydefault);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    @Override // o.ALH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AKL OLrzqt(@NotNull java.lang.String str) {
        FeatureRestrictionInfo featureRestrictionInfoEZpvd;
        java.lang.String str2;
        java.lang.String str3;
        java.util.List<java.lang.String> mode;
        Intrinsics.checkNotNullParameter(str, "");
        OKComplianceRestrictionService.Feature featureCopydefault = C42502rVf.copydefault(str);
        if (featureCopydefault == null || (featureRestrictionInfoEZpvd = this.AEQbTJ.EZpvd(featureCopydefault)) == null) {
            return null;
        }
        java.lang.Boolean restricted = featureRestrictionInfoEZpvd.getRestricted();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        boolean zEZpvd = Intrinsics.EZpvd(restricted, bool);
        java.lang.String country = featureRestrictionInfoEZpvd.getCountry();
        java.lang.String countryName = featureRestrictionInfoEZpvd.getCountryName();
        java.lang.String province = featureRestrictionInfoEZpvd.getProvince();
        java.lang.String provinceCode = featureRestrictionInfoEZpvd.getProvinceCode();
        java.lang.Integer kycLevel = featureRestrictionInfoEZpvd.getKycLevel();
        java.lang.Integer politStatus = featureRestrictionInfoEZpvd.getPolitStatus();
        boolean zEZpvd2 = Intrinsics.EZpvd(featureRestrictionInfoEZpvd.getHidden(), bool);
        boolean zEZpvd3 = Intrinsics.EZpvd(featureRestrictionInfoEZpvd.getRemoveUserFlag(), bool);
        int i = Activity.AEQbTJ[featureRestrictionInfoEZpvd.getAction().ordinal()];
        if (i == 1) {
            str2 = "question";
        } else if (i == 2) {
            str2 = "advancedQuestion";
        } else {
            if (i != 3) {
                str3 = null;
                java.lang.Long content = featureRestrictionInfoEZpvd.getContent();
                java.lang.Integer numValueOf = content != null ? java.lang.Integer.valueOf((int) content.longValue()) : null;
                mode = featureRestrictionInfoEZpvd.getMode();
                if (mode == null) {
                    mode = yDY.AhwBna();
                }
                return new AKL(zEZpvd, country, countryName, province, provinceCode, kycLevel, politStatus, zEZpvd2, zEZpvd3, str3, numValueOf, mode);
            }
            str2 = "redirectOKXWallet";
        }
        str3 = str2;
        java.lang.Long content2 = featureRestrictionInfoEZpvd.getContent();
        java.lang.Integer numValueOf2 = content2 != null ? java.lang.Integer.valueOf((int) content2.longValue()) : null;
        mode = featureRestrictionInfoEZpvd.getMode();
        if (mode == null) {
        }
        return new AKL(zEZpvd, country, countryName, province, provinceCode, kycLevel, politStatus, zEZpvd2, zEZpvd3, str3, numValueOf2, mode);
    }

    @Override // o.ALH
    public java.lang.String djBIcL() {
        return this.AEQbTJ.AuCTelauCTel();
    }

    @Override // o.ALH
    public java.lang.String AEQbTJ() {
        return this.AEQbTJ.zsXlph();
    }

    @Override // o.ALH
    public boolean AhwBna() {
        return this.AEQbTJ.djSkpj();
    }

    @Override // o.ALH
    public java.lang.String gEmmrt() {
        JsonObject jsonObjectAwvSrB = this.AEQbTJ.AwvSrB();
        if (jsonObjectAwvSrB != null) {
            return jsonObjectAwvSrB.toString();
        }
        return null;
    }

    @Override // o.ALH
    public java.util.List<java.lang.String> copydefault() {
        return this.AEQbTJ.AuCTel();
    }

    @Override // o.ALH
    public boolean copydefault(@NotNull java.lang.String str) {
        OKComplianceRestrictionService.AppMode appMode;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "cefi")) {
            appMode = OKComplianceRestrictionService.AppMode.CEFI;
        } else {
            if (!Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "web3")) {
                return false;
            }
            appMode = OKComplianceRestrictionService.AppMode.WEB3;
        }
        return this.AEQbTJ.OLrzqt(appMode);
    }

    @Override // o.ALH
    public java.util.List<java.lang.String> OLrzqt() {
        return this.AEQbTJ.fIwbmz();
    }

    @Override // o.ALH
    public boolean EZpvd(@NotNull java.lang.String str) {
        OKComplianceRestrictionService.CefiMode cefiMode;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "pro")) {
            cefiMode = OKComplianceRestrictionService.CefiMode.PRO;
        } else {
            if (!Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "lite")) {
                return false;
            }
            cefiMode = OKComplianceRestrictionService.CefiMode.LITE;
        }
        return this.AEQbTJ.AEQbTJ(cefiMode);
    }

    @Override // o.ALH
    public java.util.List<java.lang.String> KWHzl() {
        return this.AEQbTJ.ejfBZ();
    }

    @Override // o.ALH
    public java.util.List<java.lang.String> AYXKKw() {
        return this.AEQbTJ.getNewProxyInstance();
    }

    @Override // o.ALH
    public boolean AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AEQbTJ.ejfBZ().contains(str);
    }
}
