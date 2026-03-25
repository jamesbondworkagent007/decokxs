package com.bytedance.bdtracker;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.applog.log.LoggerImpl;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class b2 extends q1 {
    public final Context e;
    public final v1 f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public b2(Context context, v1 v1Var) {
        super(false, false);
        this.e = context;
        this.f = v1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.q1
    public String a() {
        return "Gaid";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.q1
    public boolean a(JSONObject jSONObject) {
        if (!this.f.c.isGaidEnabled()) {
            return true;
        }
        String googleAid = this.f.c.getGoogleAid();
        if (TextUtils.isEmpty(googleAid)) {
            try {
                googleAid = g5.a(this.e, this.f);
            } catch (InterruptedException | ExecutionException | Exception unused) {
            } catch (TimeoutException e) {
                LoggerImpl.global().error("Query Gaid Timeout", e, new Object[0]);
            }
        }
        x1.a(jSONObject, "google_aid", googleAid);
        return true;
    }
}
