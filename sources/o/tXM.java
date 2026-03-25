package o;

import com.okinc.okuser.data.PersonalSetting;
import com.okinc.preference.data.model.FuturesSettings;
import com.okinc.preference.data.model.ValuationCurrencyBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import o.C46526tXp;

/* JADX INFO: loaded from: classes10.dex */
public final class tXM {
    public static final Json AEQbTJ;
    public static ValuationCurrencyBean AYXKKw;
    public static double AhwBna;
    public static int AkhnZx;
    public static int DbNXlk;
    public static int EZpvd;
    public static java.lang.String KWHzl;
    public static final tXM OLrzqt;
    public static final int copydefault;
    public static java.util.ArrayList<ValuationCurrencyBean> djBIcL;
    public static double ejfBZ;
    public static double fARcdN;
    public static java.lang.String fIwbmz;
    public static PersonalSetting fJNWhG;
    public static java.lang.String fetchVPNInfo;
    public static InterfaceC46547tYj gEmmrt;
    public static int isConnected;
    public static int valueOf;
    public static java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<ValuationCurrencyBean> AEQbTJ() {
        return djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(InterfaceC46547tYj interfaceC46547tYj) {
        gEmmrt = interfaceC46547tYj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt() {
        fetchVPNInfo = "";
        values = "";
        fIwbmz = "";
        ejfBZ = -1.0d;
        fARcdN = -1.0d;
        isConnected = -1;
        AYXKKw = null;
        EZpvd = -1;
        valueOf = -1;
        DbNXlk = -1;
        AhwBna = -1.0d;
        AkhnZx = -1;
        KWHzl = "";
    }

    private tXM() {
    }

    static {
        tXM txm = new tXM();
        OLrzqt = txm;
        AEQbTJ = JsonKt.Json$default(null, new Function1() { // from class: o.tXR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tXM.AEQbTJ((JsonBuilder) obj);
            }
        }, 1, null);
        DbNXlk = -1;
        fetchVPNInfo = "";
        values = "";
        fIwbmz = "";
        ejfBZ = -1.0d;
        fARcdN = -1.0d;
        AhwBna = -1.0d;
        valueOf = -1;
        AkhnZx = -1;
        KWHzl = "";
        EZpvd = -1;
        isConnected = -1;
        djBIcL = txm.AkhnZx();
        fJNWhG = txm.DbNXlk();
        copydefault = 8;
    }

    public static final Unit AEQbTJ(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setEncodeDefaults(true);
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setLenient(true);
        jsonBuilder.setUseArrayPolymorphism(true);
        return Unit.INSTANCE;
    }

    public final ValuationCurrencyBean EZpvd() {
        ValuationCurrencyBean valuationCurrencyBean = AYXKKw;
        if (valuationCurrencyBean != null) {
            return valuationCurrencyBean;
        }
        java.util.ArrayList<ValuationCurrencyBean> arrayList = djBIcL;
        if (arrayList != null) {
            Intrinsics.copydefault(arrayList);
            java.util.Iterator<ValuationCurrencyBean> it = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                ValuationCurrencyBean next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                ValuationCurrencyBean valuationCurrencyBean2 = next;
                if (valuationCurrencyBean2.getCurrencyId() == KWHzl()) {
                    AYXKKw = valuationCurrencyBean2;
                    return valuationCurrencyBean2;
                }
            }
        }
        return new ValuationCurrencyBean();
    }

    public final java.lang.String valueOf() {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) fetchVPNInfo)) {
            return fetchVPNInfo;
        }
        java.util.ArrayList<ValuationCurrencyBean> arrayList = djBIcL;
        if (arrayList != null) {
            Intrinsics.copydefault(arrayList);
            java.util.Iterator<ValuationCurrencyBean> it = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                ValuationCurrencyBean next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                ValuationCurrencyBean valuationCurrencyBean = next;
                if (valuationCurrencyBean.getCurrencyId() == KWHzl()) {
                    java.lang.String displayName = valuationCurrencyBean.getDisplayName();
                    fetchVPNInfo = displayName;
                    return displayName;
                }
            }
        }
        java.lang.String string = C32979mnm.EZpvd.OLrzqt().getString(C46526tXp.TaskDescription.valueOf);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final int KWHzl() {
        int i = DbNXlk;
        if (i != -1) {
            return i;
        }
        int iOLrzqt = C33485mxO.OLrzqt(C32979mnm.EZpvd.OLrzqt(), FuturesSettings.PREFS_FILENAME, "setting_valuation_currency", 0);
        DbNXlk = iOLrzqt;
        return iOLrzqt;
    }

    public final java.lang.String gEmmrt() {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) values)) {
            return values;
        }
        java.util.ArrayList<ValuationCurrencyBean> arrayList = djBIcL;
        if (arrayList == null) {
            return "USD";
        }
        Intrinsics.copydefault(arrayList);
        java.util.Iterator<ValuationCurrencyBean> it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            ValuationCurrencyBean next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            ValuationCurrencyBean valuationCurrencyBean = next;
            if (valuationCurrencyBean.getCurrencyId() == KWHzl()) {
                java.lang.String isoCode = valuationCurrencyBean.getIsoCode();
                values = isoCode;
                return isoCode;
            }
        }
        return "USD";
    }

    public final java.lang.String djBIcL() {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) fIwbmz)) {
            return fIwbmz;
        }
        java.util.ArrayList<ValuationCurrencyBean> arrayList = djBIcL;
        if (arrayList == null) {
            return "$";
        }
        Intrinsics.copydefault(arrayList);
        java.util.Iterator<ValuationCurrencyBean> it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            ValuationCurrencyBean next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            ValuationCurrencyBean valuationCurrencyBean = next;
            if (valuationCurrencyBean.getCurrencyId() == KWHzl()) {
                java.lang.String symbol = valuationCurrencyBean.getSymbol();
                fIwbmz = symbol;
                return symbol;
            }
        }
        return "$";
    }

    public final double AYXKKw() {
        double d = ejfBZ;
        if (d != -1.0d) {
            return d;
        }
        java.util.ArrayList<ValuationCurrencyBean> arrayList = djBIcL;
        if (arrayList != null) {
            Intrinsics.copydefault(arrayList);
            java.util.Iterator<ValuationCurrencyBean> it = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                ValuationCurrencyBean next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                ValuationCurrencyBean valuationCurrencyBean = next;
                if (valuationCurrencyBean.getCurrencyId() == KWHzl()) {
                    double usdToThisRate = valuationCurrencyBean.getUsdToThisRate();
                    ejfBZ = usdToThisRate;
                    return usdToThisRate;
                }
            }
        }
        return 1.0d;
    }

    public final int AhwBna() {
        int i = isConnected;
        if (i != -1) {
            return i;
        }
        java.util.ArrayList<ValuationCurrencyBean> arrayList = djBIcL;
        if (arrayList == null) {
            return 2;
        }
        Intrinsics.copydefault(arrayList);
        java.util.Iterator<ValuationCurrencyBean> it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            ValuationCurrencyBean next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            ValuationCurrencyBean valuationCurrencyBean = next;
            if (valuationCurrencyBean.getCurrencyId() == KWHzl()) {
                int precision = valuationCurrencyBean.getPrecision();
                isConnected = precision;
                return precision;
            }
        }
        return 2;
    }

    public final int copydefault() {
        int i = AkhnZx;
        if (i != -1) {
            return i;
        }
        java.util.ArrayList<ValuationCurrencyBean> arrayList = djBIcL;
        if (arrayList == null) {
            return 2;
        }
        Intrinsics.copydefault(arrayList);
        java.util.Iterator<ValuationCurrencyBean> it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            ValuationCurrencyBean next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            ValuationCurrencyBean valuationCurrencyBean = next;
            if (C59449zhJ.gEmmrt("usd", valuationCurrencyBean.getIsoCode(), true)) {
                int precision = valuationCurrencyBean.getPrecision();
                AkhnZx = precision;
                return precision;
            }
        }
        return 2;
    }

    public final void AEQbTJ(android.content.Context context, int i) {
        if (i >= 0 && DbNXlk != i) {
            OLrzqt();
            DbNXlk = i;
            C33485mxO.EZpvd(context, FuturesSettings.PREFS_FILENAME, "setting_valuation_currency", i);
            InterfaceC46547tYj interfaceC46547tYj = gEmmrt;
            if (interfaceC46547tYj != null) {
                Intrinsics.copydefault(interfaceC46547tYj);
                interfaceC46547tYj.AEQbTJ(i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e A[Catch: Exception -> 0x0068, TRY_LEAVE, TryCatch #0 {Exception -> 0x0068, blocks: (B:4:0x0008, B:6:0x000e, B:12:0x005c, B:14:0x0060, B:7:0x002e, B:11:0x005a, B:10:0x0055, B:8:0x0038), top: B:19:0x0008, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(java.util.ArrayList<ValuationCurrencyBean> arrayList) {
        java.util.ArrayList<ValuationCurrencyBean> arrayList2;
        if (arrayList != null) {
            try {
                if (arrayList.size() > 0) {
                    djBIcL = arrayList;
                    android.app.Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
                    Json json = AEQbTJ;
                    json.getSerializersModule();
                    C33485mxO.KWHzl(applicationOLrzqt, FuturesSettings.PREFS_FILENAME, FuturesSettings.SETTING_CURRENCIES, json.encodeToString(new ArrayListSerializer(ValuationCurrencyBean.Companion.serializer()), arrayList));
                } else {
                    java.lang.String strAEQbTJ = C33485mxO.AEQbTJ(C32979mnm.EZpvd.OLrzqt(), FuturesSettings.PREFS_FILENAME, FuturesSettings.SETTING_CURRENCIES, "");
                    try {
                        Json json2 = AEQbTJ;
                        Intrinsics.copydefault((java.lang.Object) strAEQbTJ);
                        json2.getSerializersModule();
                        java.lang.Object objDecodeFromString = json2.decodeFromString(new ArrayListSerializer(ValuationCurrencyBean.Companion.serializer()), strAEQbTJ);
                        Intrinsics.copydefault(objDecodeFromString, "");
                        arrayList2 = (java.util.ArrayList) objDecodeFromString;
                    } catch (java.lang.Exception unused) {
                        arrayList2 = new java.util.ArrayList<>();
                    }
                    djBIcL = arrayList2;
                }
            } catch (java.lang.Exception e) {
                android.util.Log.getStackTraceString(e);
                return;
            }
        }
        if (djBIcL == null) {
            djBIcL = new java.util.ArrayList<>();
        }
    }

    public final java.util.ArrayList<ValuationCurrencyBean> AkhnZx() {
        java.util.ArrayList<ValuationCurrencyBean> arrayList;
        try {
            java.lang.String strAEQbTJ = C33485mxO.AEQbTJ(C32979mnm.EZpvd.OLrzqt(), FuturesSettings.PREFS_FILENAME, FuturesSettings.SETTING_CURRENCIES, "");
            try {
                Json json = AEQbTJ;
                Intrinsics.copydefault((java.lang.Object) strAEQbTJ);
                json.getSerializersModule();
                java.lang.Object objDecodeFromString = json.decodeFromString(new ArrayListSerializer(ValuationCurrencyBean.Companion.serializer()), strAEQbTJ);
                Intrinsics.copydefault(objDecodeFromString, "");
                arrayList = (java.util.ArrayList) objDecodeFromString;
            } catch (java.lang.Exception unused) {
                arrayList = new java.util.ArrayList<>();
            }
            djBIcL = arrayList;
            if (arrayList == null) {
                djBIcL = new java.util.ArrayList<>();
            }
            return djBIcL;
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
            return new java.util.ArrayList<>();
        }
    }

    public final PersonalSetting DbNXlk() {
        try {
            if (fJNWhG == null) {
                fJNWhG = new PersonalSetting(0, 0, 0, 0, 15, (DefaultConstructorMarker) null);
            }
            return fJNWhG;
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
            return new PersonalSetting(0, 0, 0, 0, 15, (DefaultConstructorMarker) null);
        }
    }
}
