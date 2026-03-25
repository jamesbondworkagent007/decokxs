package com.geetest.deepknow;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class DPAPI {
    private static final Map<Context, DPAPI> sInstanceMap = new HashMap();
    private e dpHelper;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private DPAPI(Context context, String str) {
        this.dpHelper = new e(context, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static DPAPI getInstance(Context context, String str) {
        DPAPI dpapi;
        if (context == null) {
            return null;
        }
        Map<Context, DPAPI> map = sInstanceMap;
        synchronized (map) {
            Context applicationContext = context.getApplicationContext();
            dpapi = map.get(applicationContext);
            if (dpapi == null) {
                dpapi = new DPAPI(applicationContext, str);
                map.put(applicationContext, dpapi);
            }
        }
        return dpapi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String sdkVersion() {
        return "1.3.3";
    }

    @Deprecated
    public DPAPI closeSQL() {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void getSessionStatus(DPListener dPListener) {
        this.dpHelper.a(dPListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DPAPI setLogEnable(boolean z) {
        this.dpHelper.a(z);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void submitExtraData(JSONObject jSONObject, DPListener dPListener) {
        this.dpHelper.a(jSONObject, dPListener);
    }

    public static DPAPI getInstance(Context context) {
        DPAPI dpapi;
        if (context == null) {
            return null;
        }
        Map<Context, DPAPI> map = sInstanceMap;
        synchronized (map) {
            dpapi = map.get(context.getApplicationContext());
            if (dpapi == null) {
                t.a("getInstance should before set");
            }
        }
        return dpapi;
    }
}
