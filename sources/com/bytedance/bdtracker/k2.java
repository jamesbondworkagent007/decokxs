package com.bytedance.bdtracker;

import android.content.Context;
import com.bytedance.applog.util.HardwareUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class k2 extends q1 {
    public final Context e;
    public final v1 f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public k2(v1 v1Var, Context context) {
        super(true, false);
        this.e = context;
        this.f = v1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.q1
    public String a() {
        return "SimCountry";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.q1
    public boolean a(JSONObject jSONObject) {
        if (!this.f.m()) {
            return true;
        }
        x1.a(jSONObject, "sim_region", HardwareUtils.getSimCountryIso(this.e));
        return true;
    }
}
