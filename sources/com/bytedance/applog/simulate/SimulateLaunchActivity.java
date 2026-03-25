package com.bytedance.applog.simulate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.ArrayMap;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.applog.AppLog;
import com.bytedance.applog.AppLogManager;
import com.bytedance.applog.IAppLogInstance;
import com.bytedance.applog.IPageMeta;
import com.bytedance.applog.R;
import com.bytedance.applog.annotation.PageMeta;
import com.bytedance.applog.log.AbstractAppLogLogger;
import com.bytedance.applog.log.IAppLogLogger;
import com.bytedance.applog.log.LoggerImpl;
import com.bytedance.bdtracker.d;
import com.bytedance.bdtracker.d4;
import com.bytedance.bdtracker.r;
import java.lang.reflect.Field;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@PageMeta(path = "/simulateLaunch", title = "圈选/埋点验证")
public class SimulateLaunchActivity extends Activity implements IPageMeta {
    public static final String BIND_QUERY = "bind_query";
    public static final String DEBUG_LOG = "debug_log";
    public static final String KEY_URL_PREFIX = "url_prefix";
    public static final String KEY_URL_PREFIX_NO_QR = "url_prefix_no_qr";
    public static final int MODE_NO_QR = 1;
    public static final int MODE_QR = 0;
    public static String entryAppId = "";
    public static int entryMode = 0;
    public static String entryQrParam = "";
    public static String entryType = "";
    public static String entryUrlPrefix = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f123a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void startSimulatorWithoutQR(@NonNull Context context, String str) {
        startSimulatorWithoutQR(context, AppLog.getAppId(), str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void startSimulatorWithoutQR(@NonNull Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) SimulateLaunchActivity.class);
        intent.putExtra(KEY_URL_PREFIX_NO_QR, str2);
        intent.putExtra("aid_no_qr", str);
        context.startActivity(intent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IAppLogLogger a() {
        IAppLogLogger logger = AbstractAppLogLogger.getLogger(entryAppId);
        return logger != null ? logger : LoggerImpl.global();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f3  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(@Nullable Bundle bundle) {
        TextView textView;
        String str;
        super.onCreate(bundle);
        setContentView(R.layout.applog_activity_simulate);
        this.f123a = (TextView) findViewById(R.id.text_tip);
        Intent intent = getIntent();
        Uri data = intent.getData();
        boolean z = false;
        if (intent.hasExtra(KEY_URL_PREFIX_NO_QR) && intent.hasExtra("aid_no_qr")) {
            entryMode = 1;
            entryUrlPrefix = intent.getStringExtra(KEY_URL_PREFIX_NO_QR);
            entryAppId = intent.getStringExtra("aid_no_qr");
        } else if (data != null) {
            entryMode = 0;
            entryAppId = data.getQueryParameter("aid");
            entryQrParam = data.getQueryParameter("qr_param");
            entryUrlPrefix = data.getQueryParameter(KEY_URL_PREFIX);
            String queryParameter = data.getQueryParameter("type");
            entryType = queryParameter;
            if (!DEBUG_LOG.equals(queryParameter)) {
                textView = this.f123a;
                str = "Launch failed: type parameter mismatch";
            } else if (r.c(entryUrlPrefix)) {
                textView = this.f123a;
                str = "Launch failed: url_prefix parameter not provided";
            }
            textView.setText(str);
            return;
        }
        IAppLogInstance appLogManager = AppLogManager.getInstance(entryAppId);
        if (appLogManager != null && appLogManager.hasStarted()) {
            a().debug(Collections.singletonList("SimulateLaunchActivity"), "AppLog has started with appId:{}", entryAppId);
            new d4((d) appLogManager).execute(new Void[0]);
        }
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(objInvoke);
            if (arrayMap != null && !arrayMap.isEmpty()) {
                if (arrayMap.size() == 1) {
                    if (!arrayMap.values().toArray()[0].toString().contains("com.bytedance.applog.simulate.SimulateLaunchActivity")) {
                        z = true;
                    }
                }
            }
        } catch (Throwable th) {
            a().debug(Collections.singletonList("SimulateLaunchActivity"), "Check has activity failed", th);
        }
        a().debug(Collections.singletonList("SimulateLaunchActivity"), "Simulator onCreate appId: {}, urlPrefix: {}, mode: {}, params: {}, activity exists: {}", entryAppId, entryUrlPrefix, Integer.valueOf(entryMode), entryQrParam, Boolean.valueOf(z));
        if (!z) {
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getApplicationInfo().packageName);
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setPackage(null);
                startActivity(launchIntentForPackage);
            }
        }
        finish();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IPageMeta
    public JSONObject pageProperties() {
        try {
            return new JSONObject().put("class_name", "SimulateLaunchActivity");
        } catch (JSONException e) {
            a().debug(Collections.singletonList("SimulateLaunchActivity"), "JSON handle failed", e);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IPageMeta
    public String path() {
        return "/simulateLaunch";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.applog.IPageMeta
    public String title() {
        return "圈选/埋点验证";
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
