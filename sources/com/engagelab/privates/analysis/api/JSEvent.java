package com.engagelab.privates.analysis.api;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class JSEvent {
    private static final String TAG = "JSEvent";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @JavascriptInterface
    public void onEvent(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                MTCommonLog.e(TAG, "onEvent eventJson can't be null, please check it");
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(MTAnalysisConstants.EVENT_NAME);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(MTAnalysisConstants.EVENT_ATTRIBUTES);
            Event event = new Event(strOptString);
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    event.putExtraAttr(next, jSONObjectOptJSONObject.opt(next));
                }
            }
            MTAnalysisPrivatesApi.onEvent(MTGlobal.context, event);
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "onEvent failed " + th.getMessage());
        }
    }
}
