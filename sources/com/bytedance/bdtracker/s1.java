package com.bytedance.bdtracker;

import android.content.Context;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class s1 extends q1 {
    public final d e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public s1(@NonNull d dVar) {
        super(true, false);
        this.e = dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.q1
    public String a() {
        return "business_conversion_id";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.q1
    public boolean a(JSONObject jSONObject) {
        try {
            a("com.bytedance.applog.convert.ClickIdProvider", jSONObject);
        } catch (Throwable th) {
            this.e.D.debug("ClickId find error", th);
        }
        try {
            a("com.bytedance.applog.convert.IPIDProvider", jSONObject);
            return true;
        } catch (Throwable th2) {
            this.e.D.debug("IPID find error", th2);
            return true;
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        Class<?> clsB = r.b(str);
        if (clsB == null) {
            this.e.D.debug("No " + str + " class, get id error", new Object[0]);
            return;
        }
        try {
            Method declaredMethod = clsB.getDeclaredMethod("getIdAndSetIntoJson", JSONObject.class, Context.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(clsB.newInstance(), jSONObject, this.e.n);
        } catch (Throwable unused) {
        }
    }
}
