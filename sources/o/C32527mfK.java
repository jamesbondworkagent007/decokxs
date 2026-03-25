package o;

import com.okinc.di.LocalizeDIModule;
import com.okinc.localization2.bean.AppLocale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: o.mfK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32527mfK implements InterfaceC2760AYe {
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.mfP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C32527mfK.copydefault();
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.mfL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C32527mfK.OLrzqt();
        }
    });

    private final pTU djBIcL() {
        return (pTU) this.copydefault.getValue();
    }

    public static final pTU copydefault() {
        return ((LocalizeDIModule.Activity) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), LocalizeDIModule.Activity.class)).gkJEwt();
    }

    public final pTQ gEmmrt() {
        return (pTQ) this.AEQbTJ.getValue();
    }

    public static final pTQ OLrzqt() {
        return ((LocalizeDIModule.Activity) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), LocalizeDIModule.Activity.class)).AxsJAYaxsJAY();
    }

    @Override // o.InterfaceC2760AYe
    public C2757AYb EZpvd() {
        AppLocale appLocaleOLrzqt = djBIcL().OLrzqt();
        java.lang.String languageCode = appLocaleOLrzqt.getLanguageCode();
        java.lang.String market = appLocaleOLrzqt.getMarket();
        java.lang.String displayName = appLocaleOLrzqt.getDisplayName();
        java.lang.String cefiDisplayName = appLocaleOLrzqt.getCefiDisplayName();
        if (cefiDisplayName == null) {
            cefiDisplayName = "";
        }
        return new C2757AYb(languageCode, market, displayName, cefiDisplayName);
    }

    @Override // o.InterfaceC2760AYe
    public java.lang.String AhwBna() {
        return gEmmrt().EZpvd();
    }

    @Override // o.InterfaceC2760AYe
    public AYE EZpvd(java.lang.String str) {
        return new C32524mfH(djBIcL(), str);
    }

    @Override // o.InterfaceC2760AYe
    public AYE OLrzqt(java.lang.String str) {
        return new C32526mfJ(djBIcL(), str);
    }
}
