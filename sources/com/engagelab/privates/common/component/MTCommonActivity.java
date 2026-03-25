package com.engagelab.privates.common.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.push.api.MTPushPrivatesApi;
import com.engagelab.privates.push.api.NotificationMessage;
import com.engagelab.privates.push.utils.NotificationUtil;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class MTCommonActivity extends Activity {
    private static final String TAG = "MTCommonActivity";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void processIntent(Intent intent) {
        try {
            if (intent == null) {
                MTCommonLog.e(TAG, "processIntent intent is null ");
                return;
            }
            Bundle extras = intent.getExtras();
            String string = intent.getData() != null ? intent.getData().toString() : "";
            if (TextUtils.isEmpty(string) && intent.getExtras() != null) {
                string = extras.containsKey("JMessageExtra") ? extras.getString("JMessageExtra") : extras.getString("MTMessageExtra");
            }
            if (TextUtils.isEmpty(string)) {
                int i = Integer.parseInt(intent.getAction());
                if (3003 == i && ((NotificationMessage) extras.getParcelable("message")) == null) {
                    return;
                }
                MTPushPrivatesApi.init(getApplicationContext());
                MTCommonPrivatesApi.sendMessageToMainProcess(getApplicationContext(), i, extras);
            } else {
                processPlatformMessage(string);
            }
        } catch (Throwable th) {
            try {
                MTCommonLog.w(TAG, "processIntent failed " + th.getMessage());
            } finally {
                finish();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void processPlatformMessage(String str) {
        String strOptString;
        String strOptString2;
        String strOptString3;
        String strOptString4;
        Bundle bundleConvertJsonToBundle;
        try {
            JSONObject jSONObject = new JSONObject(str);
            MTCommonLog.d(TAG, "platformMessageJson:" + MTCommonLog.toLogString(jSONObject));
            String messageId = NotificationUtil.getMessageId(jSONObject);
            byte bOptInt = (byte) jSONObject.optInt("rom_type");
            if (jSONObject.has("m_content")) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("m_content");
                strOptString = jSONObjectOptJSONObject.optString("n_title");
                strOptString2 = jSONObjectOptJSONObject.optString("n_content");
                strOptString3 = jSONObjectOptJSONObject.optString("n_intent_uri");
                strOptString4 = jSONObjectOptJSONObject.optString("n_intent_ssl");
                bundleConvertJsonToBundle = NotificationUtil.convertJsonToBundle(jSONObjectOptJSONObject.optJSONObject("n_extras"));
            } else {
                strOptString = jSONObject.optString("n_title");
                strOptString2 = jSONObject.optString("n_content");
                strOptString3 = jSONObject.optString("n_intent_uri");
                strOptString4 = jSONObject.optString("n_intent_ssl");
                bundleConvertJsonToBundle = NotificationUtil.convertJsonToBundle(jSONObject.optJSONObject("n_extras"));
            }
            String strOptString5 = jSONObject.optString("_j_data_");
            NotificationMessage intentSsl = new NotificationMessage().setMessageId(messageId).setPlatform(bOptInt).setTitle(strOptString).setContent(strOptString2).setExtras(bundleConvertJsonToBundle).setIntentUri(strOptString3).setIntentSsl(strOptString4);
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(strOptString5)) {
                bundle.putString("_j_data_", strOptString5);
            }
            bundle.putParcelable("message", intentSsl);
            MTPushPrivatesApi.init(getApplicationContext());
            MTCommonPrivatesApi.sendMessageToMainProcess(getApplicationContext(), 3003, bundle);
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "processPlatformMessage failed " + th.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        processIntent(getIntent());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        processIntent(intent);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
