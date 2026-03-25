package o;

import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.amplitude.AmplitudeName;
import kotlin.Result;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.dlg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14450dlg extends AbstractC14452dli {
    public static final C14450dlg copydefault = new C14450dlg();

    private C14450dlg() {
        super("web3_auto_confirm_config");
    }

    public final long EZpvd() {
        return KWHzl("inactiveTime");
    }

    public final long KWHzl() {
        return KWHzl("expireTime");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long KWHzl(java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        long j;
        try {
            Result.Application application = Result.Companion;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (OLrzqt()) {
            java.lang.Object objKWHzl = ABTestManager.AEQbTJ.KWHzl(AEQbTJ(), AmplitudeName.WEB3);
            pUU.KWHzl("Web3AutoConfirmConfig", "payload: " + objKWHzl);
            JSONObject jSONObjectAEQbTJ = AEQbTJ(objKWHzl);
            if (jSONObjectAEQbTJ != null) {
                j = jSONObjectAEQbTJ.getLong(str);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Long.valueOf(j));
            if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                objM7377constructorimpl = 0L;
            }
            return ((java.lang.Number) objM7377constructorimpl).longValue();
        }
        j = 0;
        objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Long.valueOf(j));
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
        }
        return ((java.lang.Number) objM7377constructorimpl).longValue();
    }

    public final JSONObject AEQbTJ(java.lang.Object obj) {
        java.lang.Object objM7377constructorimpl;
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        if (!(obj instanceof java.lang.String)) {
            return null;
        }
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(new JSONObject((java.lang.String) obj));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (JSONObject) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }
}
