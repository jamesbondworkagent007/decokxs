package com.engagelab.privates.common;

import android.content.Context;
import android.os.Bundle;
import com.engagelab.privates.analysis.api.Event;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.push.constants.MTPushConstants;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile g f331a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(Context context, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(bundle.getString(MTPushConstants.Analysis.KEY_JSON));
            Event event = new Event("third_msg_status");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                event.putExtraAttr(next, jSONObject.opt(next));
            }
            d.c().a(context, event);
        } catch (Throwable th) {
            MTCommonLog.w("MTMessageStateBusiness", "onPlatformMessageState failed " + th.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static g a() {
        if (f331a == null) {
            synchronized (g.class) {
                f331a = new g();
            }
        }
        return f331a;
    }

    public void a(Context context, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(bundle.getString(MTPushConstants.Analysis.KEY_JSON));
            Event event = new Event("msg_status");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                event.putExtraAttr(next, jSONObject.opt(next));
            }
            d.c().a(context, event);
        } catch (Throwable th) {
            MTCommonLog.w("MTMessageStateBusiness", "onMessageState failed " + th.getMessage());
        }
    }
}
