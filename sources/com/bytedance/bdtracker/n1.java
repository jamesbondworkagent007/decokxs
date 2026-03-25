package com.bytedance.bdtracker;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.applog.log.LoggerImpl;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class n1 extends q1 {
    public final Context e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public n1(Context context) {
        super(true, false);
        this.e = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.q1
    public String a() {
        return "AppKey";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.q1
    public boolean a(JSONObject jSONObject) {
        try {
            Bundle bundle = this.e.getPackageManager().getApplicationInfo(this.e.getPackageName(), 128).metaData;
            if (bundle == null || TextUtils.isEmpty("")) {
                return true;
            }
            jSONObject.put("appkey", bundle.getString(""));
            return true;
        } catch (Throwable th) {
            LoggerImpl.global().error("Load app key failed.", th, new Object[0]);
            return true;
        }
    }
}
