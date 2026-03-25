package o;

import androidx.autofill.HintConstants;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.ibm.icu.text.PluralRules;

/* JADX INFO: renamed from: o.adD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C7083adD {
    public boolean AEQbTJ;
    public java.lang.String[] AYXKKw;
    public byte[] AhwBna;
    public byte[] AkhnZx;
    public boolean AuCTel;
    public java.lang.String[] AuCTelauCTel;
    public java.lang.String AubY;
    public char AwvSrB;
    public byte AxsJAY;
    public java.lang.String[] DbNXlk;
    public java.lang.String EZpvd;
    public byte KWHzl;
    public java.lang.String OLrzqt;
    public byte QKVWgx;
    public char copydefault;
    public java.lang.String djBIcL;
    public java.lang.String[] ejfBZ;
    public boolean fARcdN;
    public byte fIwbmz;
    public java.lang.String[] fJNWhG;
    public java.lang.String[] fetchVPNInfo;
    public byte gEmmrt;
    public boolean[] gHZMYf;
    public java.lang.String[] getFieldNames;
    public byte getNewProxyInstance;
    public boolean hDKMBd;
    public java.lang.String[] isConnected;
    public boolean[] iwGUEr;
    public java.lang.String[] sSMYrx;
    public java.lang.String[][] uzCIH;
    public java.lang.String valueOf;
    public byte[] values;
    public java.lang.String[] wlaJM;
    public java.lang.String zLjUOn;
    public LoaderManager[] zsXlph;
    public boolean zuBGHE;

    /* JADX INFO: renamed from: o.adD$ActionBar */
    public interface ActionBar {
        public static final java.lang.String[] OLrzqt = {"M", "F", "N"};
    }

    /* JADX INFO: renamed from: o.adD$Activity */
    public interface Activity {
        public static final java.lang.String[] copydefault = {"DPLURAL", "DSINGULAR", "DSINGULAR_SUBONE", "DPAUCAL"};
    }

    /* JADX INFO: renamed from: o.adD$Application */
    public interface Application {
        public static final java.lang.String[] KWHzl = {"FPLURAL", "FSINGULAR_PLURAL", "FSINGULAR_PLURAL_ANDAHALF", "FPAUCAL"};
    }

    /* JADX INFO: renamed from: o.adD$Dialog */
    public interface Dialog {
        public static final java.lang.String[] copydefault = {"ZPLURAL", "ZSINGULAR"};
    }

    /* JADX INFO: renamed from: o.adD$Fragment */
    public interface Fragment {
        public static final java.lang.String[] AEQbTJ = {"YES", "NO", "WITH_SECONDS"};
    }

    /* JADX INFO: renamed from: o.adD$FragmentManager */
    public interface FragmentManager {
        public static final java.lang.String[] OLrzqt = {"NONE", "PLURAL", "DUAL", "PAUCAL", "HEBREW", "ARABIC"};
    }

    /* JADX INFO: renamed from: o.adD$PendingIntent */
    public interface PendingIntent {
        public static final java.lang.String[] copydefault = {"DEFAULT", "CHINESE_TRADITIONAL", "CHINESE_SIMPLIFIED", "KOREAN"};
    }

    /* JADX INFO: renamed from: o.adD$StateListAnimator */
    public interface StateListAnimator {
        public static final java.lang.String[] copydefault = {"PREFIX", "AFTER_FIRST", "LAST"};
    }

    /* JADX INFO: renamed from: o.adD$TaskDescription */
    public interface TaskDescription {
        public static final java.lang.String[] copydefault = {"YES", "NO", "ONE_PLUS"};
    }

    public static C7083adD EZpvd(java.lang.String str, InterfaceC7085adF interfaceC7085adF) {
        if (interfaceC7085adF.AEQbTJ("DataRecord")) {
            C7083adD c7083adD = new C7083adD();
            c7083adD.getNewProxyInstance = interfaceC7085adF.OLrzqt("pl", FragmentManager.OLrzqt);
            c7083adD.uzCIH = interfaceC7085adF.gEmmrt("pluralName");
            c7083adD.AhwBna = interfaceC7085adF.copydefault(HintConstants.AUTOFILL_HINT_GENDER, ActionBar.OLrzqt);
            c7083adD.wlaJM = interfaceC7085adF.AhwBna("singularName");
            c7083adD.AYXKKw = interfaceC7085adF.AhwBna("halfName");
            c7083adD.ejfBZ = interfaceC7085adF.AhwBna("numberName");
            c7083adD.isConnected = interfaceC7085adF.AhwBna("mediumName");
            c7083adD.AuCTelauCTel = interfaceC7085adF.AhwBna("shortName");
            c7083adD.fetchVPNInfo = interfaceC7085adF.AhwBna("measure");
            c7083adD.getFieldNames = interfaceC7085adF.AhwBna("rqdSuffix");
            c7083adD.fJNWhG = interfaceC7085adF.AhwBna("optSuffix");
            c7083adD.DbNXlk = interfaceC7085adF.AhwBna("halves");
            c7083adD.AkhnZx = interfaceC7085adF.copydefault("halfPlacement", StateListAnimator.copydefault);
            c7083adD.values = interfaceC7085adF.copydefault("halfSupport", TaskDescription.copydefault);
            c7083adD.valueOf = interfaceC7085adF.KWHzl("fifteenMinutes");
            c7083adD.djBIcL = interfaceC7085adF.KWHzl("fiveMinutes");
            c7083adD.hDKMBd = interfaceC7085adF.copydefault("requiresDigitSeparator");
            c7083adD.OLrzqt = interfaceC7085adF.KWHzl("digitPrefix");
            c7083adD.EZpvd = interfaceC7085adF.KWHzl("countSep");
            c7083adD.zLjUOn = interfaceC7085adF.KWHzl("shortUnitSep");
            c7083adD.sSMYrx = interfaceC7085adF.AhwBna("unitSep");
            c7083adD.gHZMYf = interfaceC7085adF.EZpvd("unitSepRequiresDP");
            c7083adD.iwGUEr = interfaceC7085adF.EZpvd("requiresSkipMarker");
            c7083adD.fIwbmz = interfaceC7085adF.OLrzqt("numberSystem", PendingIntent.copydefault);
            c7083adD.AwvSrB = interfaceC7085adF.OLrzqt(PluralRules.KEYWORD_ZERO);
            c7083adD.copydefault = interfaceC7085adF.OLrzqt("decimalSep");
            c7083adD.fARcdN = interfaceC7085adF.copydefault("omitSingularCount");
            c7083adD.AuCTel = interfaceC7085adF.copydefault("omitDualCount");
            c7083adD.QKVWgx = interfaceC7085adF.OLrzqt("zeroHandling", Dialog.copydefault);
            c7083adD.KWHzl = interfaceC7085adF.OLrzqt("decimalHandling", Activity.copydefault);
            c7083adD.gEmmrt = interfaceC7085adF.OLrzqt("fractionHandling", Application.KWHzl);
            c7083adD.AubY = interfaceC7085adF.KWHzl("skippedUnitMarker");
            c7083adD.AEQbTJ = interfaceC7085adF.copydefault("allowZero");
            c7083adD.zuBGHE = interfaceC7085adF.copydefault("weeksAloneOnly");
            c7083adD.AxsJAY = interfaceC7085adF.OLrzqt("useMilliseconds", Fragment.AEQbTJ);
            if (interfaceC7085adF.AEQbTJ("ScopeDataList")) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (true) {
                    LoaderManager loaderManagerEZpvd = LoaderManager.EZpvd(interfaceC7085adF);
                    if (loaderManagerEZpvd == null) {
                        break;
                    }
                    arrayList.add(loaderManagerEZpvd);
                }
                if (interfaceC7085adF.AEQbTJ()) {
                    c7083adD.zsXlph = (LoaderManager[]) arrayList.toArray(new LoaderManager[arrayList.size()]);
                }
            }
            if (interfaceC7085adF.AEQbTJ()) {
                return c7083adD;
            }
            throw new java.lang.InternalError("null data read while reading " + str);
        }
        throw new java.lang.InternalError("did not find DataRecord while reading " + str);
    }

    /* JADX INFO: renamed from: o.adD$LoaderManager */
    public static class LoaderManager {
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public boolean copydefault;

        public static LoaderManager EZpvd(InterfaceC7085adF interfaceC7085adF) {
            if (!interfaceC7085adF.AEQbTJ("ScopeData")) {
                return null;
            }
            LoaderManager loaderManager = new LoaderManager();
            loaderManager.EZpvd = interfaceC7085adF.KWHzl(RequestParameters.PREFIX);
            loaderManager.copydefault = interfaceC7085adF.copydefault("requiresDigitPrefix");
            loaderManager.KWHzl = interfaceC7085adF.KWHzl("suffix");
            if (interfaceC7085adF.AEQbTJ()) {
                return loaderManager;
            }
            return null;
        }
    }
}
