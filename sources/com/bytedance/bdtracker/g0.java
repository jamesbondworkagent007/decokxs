package com.bytedance.bdtracker;

import com.bytedance.applog.util.HardwareUtils;
import java.util.Collections;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f177a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public g0(f0 f0Var) {
        this.f177a = f0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(f4 f4Var) {
        try {
            JSONObject jSONObject = f4Var.f175o;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            if (this.f177a.e.c.isScreenOrientationEnabled()) {
                jSONObject.put("$screen_orientation", HardwareUtils.getScreenOrientation(this.f177a.d.n) == 2 ? "landscape" : "portrait");
            }
            s sVar = this.f177a.d.B;
            if (sVar != null) {
                jSONObject.put("$longitude", sVar.f253a);
                jSONObject.put("$latitude", sVar.b);
                jSONObject.put("$geo_coordinate_system", sVar.c);
            }
            if (jSONObject.length() > 0) {
                f4Var.f175o = jSONObject;
            }
        } catch (Throwable th) {
            this.f177a.d.D.error(4, Collections.singletonList("LifeHook"), "Do beforeEventSave failed", th, new Object[0]);
        }
    }
}
