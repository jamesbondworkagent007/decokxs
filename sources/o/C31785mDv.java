package o;

import com.okinc.components.track.ABTestManager;
import com.okinc.core.util.SPUtils;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.mDv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C31785mDv {
    public static final C31785mDv EZpvd = new C31785mDv();
    public static final java.util.List<java.lang.String> OLrzqt = yDY.gEmmrt("USDT", "USDG", "USDC");
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.mDw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C31785mDv.AEQbTJ();
        }
    });
    public static final int AEQbTJ = 8;

    private C31785mDv() {
    }

    public final java.util.List<java.lang.String> copydefault() {
        return (java.util.List) copydefault.getValue();
    }

    public static final java.util.List AEQbTJ() {
        return EZpvd.valueOf();
    }

    public final java.util.List<java.lang.String> valueOf() {
        java.util.List<java.lang.String> listDjBIcL;
        java.util.List<java.lang.String> list = OLrzqt;
        if (SPUtils.contains("cr_core_stablecoin_list") && (listDjBIcL = djBIcL()) != null) {
            pUU.EZpvd("AmountStablecoinVendors", "Loaded stablecoin list from SP: result = " + listDjBIcL + ", SPList = " + listDjBIcL);
            list = listDjBIcL;
        }
        java.util.List<java.lang.String> listEZpvd = EZpvd();
        if (listEZpvd == null) {
            return list;
        }
        OLrzqt(listEZpvd);
        return listEZpvd;
    }

    public final java.util.List<java.lang.String> OLrzqt() {
        return copydefault();
    }

    public final java.util.List<java.lang.String> djBIcL() {
        return SPUtils.getArrayList("cr_core_stablecoin_list", java.lang.String.class);
    }

    public final void OLrzqt(java.util.List<java.lang.String> list) {
        SPUtils.put("cr_core_stablecoin_list", list);
    }

    public final java.util.List<java.lang.String> EZpvd() {
        java.lang.Object objM7377constructorimpl;
        JSONObject jSONObject;
        try {
            Result.Application application = Result.Companion;
            java.lang.Object payload$default = ABTestManager.getPayload$default(ABTestManager.AEQbTJ, "stablecoin_abstract_decimal", null, 2, null);
            jSONObject = payload$default instanceof JSONObject ? (JSONObject) payload$default : null;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (jSONObject == null) {
            pUU.EZpvd("AmountStablecoinVendors", "Skylab payload is null, keeping cached list");
            return null;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("default");
        if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("stablecoin")) {
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("stablecoin");
            java.util.List<java.lang.String> listKWHzl = jSONArrayOptJSONArray != null ? KWHzl(jSONArrayOptJSONArray) : null;
            if (listKWHzl == null) {
                pUU.EZpvd("AmountStablecoinVendors", "Failed to parse default stablecoin array, keeping cached list");
                return null;
            }
            pUU.EZpvd("AmountStablecoinVendors", "Fetched default stablecoin list from Skylab: " + listKWHzl);
            objM7377constructorimpl = Result.m7377constructorimpl(listKWHzl);
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.copydefault("AmountStablecoinVendors", "Failed to fetch stablecoin list: " + thM7380exceptionOrNullimpl.getMessage());
            }
            return (java.util.List) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        }
        pUU.EZpvd("AmountStablecoinVendors", "No default stablecoin config found, keeping cached list");
        return null;
    }

    public final java.util.List<java.lang.String> KWHzl(JSONArray jSONArray) {
        kotlin.ranges.IntRange intRangeAhwBna = C56548yJl.AhwBna(0, jSONArray.length());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.Integer> it = intRangeAhwBna.iterator();
        while (it.hasNext()) {
            java.lang.String strOptString = jSONArray.optString(((AbstractC56415yEn) it).nextInt());
            if (strOptString == null || strOptString.length() <= 0) {
                strOptString = null;
            }
            if (strOptString != null) {
                arrayList.add(strOptString);
            }
        }
        return arrayList;
    }
}
