package o;

import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.tgy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46960tgy {
    public static final C46960tgy AEQbTJ = new C46960tgy();

    private C46960tgy() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tgy */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void dispatchPushMessage$default(C46960tgy c46960tgy, C57789yoz c57789yoz, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        c46960tgy.copydefault(c57789yoz, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(C57789yoz c57789yoz, Function1<? super java.lang.Boolean, Unit> function1) {
        java.lang.Boolean boolValueOf;
        C46953tgr c46953tgrOLrzqt;
        pUU.KWHzl("PushPublisherForOneSignal", "dispatchPushMessage : " + c57789yoz);
        C46952tgq c46952tgqOLrzqt = OLrzqt(c57789yoz);
        if (c46952tgqOLrzqt != null) {
            pUU.KWHzl("PushPublisherForOneSignal", "dispatchPushMessage notification: " + c46952tgqOLrzqt);
            java.lang.String strAEQbTJ = c46952tgqOLrzqt.AEQbTJ();
            if (strAEQbTJ != null) {
                InterfaceC46949tgn interfaceC46949tgnCopydefault = C46954tgs.OLrzqt.copydefault(strAEQbTJ);
                boolean z = false;
                pUU.KWHzl("PushPublisherForOneSignal", "OKPushListener is null : " + (interfaceC46949tgnCopydefault == null));
                if (interfaceC46949tgnCopydefault != null) {
                    interfaceC46949tgnCopydefault.copydefault(c46952tgqOLrzqt);
                }
                if (interfaceC46949tgnCopydefault != null && (c46953tgrOLrzqt = interfaceC46949tgnCopydefault.OLrzqt()) != null && !c46953tgrOLrzqt.KWHzl()) {
                    z = true;
                }
                boolValueOf = java.lang.Boolean.valueOf(z);
            } else {
                boolValueOf = null;
            }
        }
        pUU.KWHzl("PushPublisherForOneSignal", "dispatchPushMessage isShowDefaultBar: " + boolValueOf);
        if (boolValueOf != null) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            if (Intrinsics.EZpvd(boolValueOf, bool)) {
                if (function1 != null) {
                    function1.invoke(bool);
                }
            } else if (function1 != null) {
                function1.invoke(java.lang.Boolean.TRUE);
            }
        }
        C46955tgt c46955tgtEZpvd = EZpvd(c57789yoz != null ? c57789yoz.KWHzl() : null);
        if (c46955tgtEZpvd != null) {
            pUU.KWHzl("PushPublisherForOneSignal", "dispatchPushMessage pushIMRefresh: " + c46955tgtEZpvd);
            InterfaceC46947tgl interfaceC46947tglAEQbTJ = C46954tgs.OLrzqt.AEQbTJ();
            if (interfaceC46947tglAEQbTJ != null) {
                interfaceC46947tglAEQbTJ.KWHzl(c46955tgtEZpvd);
            }
        }
    }

    public final C46952tgq OLrzqt(C57789yoz c57789yoz) {
        if (c57789yoz == null) {
            return null;
        }
        try {
            JSONObject jSONObjectKWHzl = c57789yoz.KWHzl();
            if (jSONObjectKWHzl != null) {
                return new C46952tgq(jSONObjectKWHzl.optString("link"), jSONObjectKWHzl.optString("data"), c57789yoz.DbNXlk(), c57789yoz.EZpvd(), c57789yoz.AEQbTJ(), null, 32, null);
            }
            return null;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("PushPublisherForOneSignal", e);
            return null;
        }
    }

    public final C46955tgt EZpvd(JSONObject jSONObject) {
        java.lang.String strOptString;
        if (jSONObject != null) {
            try {
                strOptString = jSONObject.optString(MetricsSQLiteCacheKt.METRICS_PARAMS);
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("PushPublisherForOneSignal", e);
            }
        } else {
            strOptString = null;
        }
        if (strOptString != null && strOptString.length() != 0) {
            JSONObject jSONObject2 = new JSONObject(strOptString);
            return new C46955tgt(java.lang.Long.valueOf(jSONObject2.optLong("pushTime")), jSONObject2.optString("type"));
        }
        return null;
    }
}
