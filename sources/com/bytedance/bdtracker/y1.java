package com.bytedance.bdtracker;

import android.content.Context;
import com.bytedance.applog.util.HardwareUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class y1 extends q1 {
    public final Context e;
    public final x1 f;
    public final v1 g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public y1(Context context, v1 v1Var, x1 x1Var) {
        super(false, false);
        this.e = context;
        this.f = x1Var;
        this.g = v1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.q1
    public String a() {
        return "DeviceParams";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.q1
    public boolean a(JSONObject jSONObject) {
        if (this.g.m()) {
            String operatorName = HardwareUtils.getOperatorName(this.e);
            if (r.d(operatorName)) {
                x1.a(jSONObject, "carrier", operatorName);
            }
        }
        x1.a(jSONObject, "clientudid", this.f.h.a());
        x1.a(jSONObject, "openudid", this.f.h.c());
        return true;
    }
}
