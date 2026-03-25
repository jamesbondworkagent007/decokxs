package com.bytedance.bdtracker;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class d2 extends q1 {
    public final Context e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public d2(Context context) {
        super(true, true);
        this.e = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.q1
    public String a() {
        return "Net";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.q1
    public boolean a(JSONObject jSONObject) {
        x1.a(jSONObject, "access", i5.a(this.e, true));
        return true;
    }
}
