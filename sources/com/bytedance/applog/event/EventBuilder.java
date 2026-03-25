package com.bytedance.applog.event;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.applog.log.IAppLogLogger;
import com.bytedance.bdtracker.a;
import com.bytedance.bdtracker.d;
import com.bytedance.bdtracker.m4;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class EventBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f111a;
    public String b;
    public String c;
    public JSONObject d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EventBuilder(@NonNull d dVar) {
        this.f111a = dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EventBuilder addParam(@NonNull String str, @Nullable Object obj) {
        if (this.d == null) {
            this.d = new JSONObject();
        }
        try {
            this.d.put(str, obj);
        } catch (JSONException unused) {
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m4 build() {
        String str = this.f111a.m;
        String str2 = this.b;
        JSONObject jSONObject = this.d;
        m4 m4Var = new m4(str, str2, false, jSONObject != null ? jSONObject.toString() : null, 0);
        m4Var.j = this.c;
        this.f111a.D.debug(4, "EventBuilder build: {}", m4Var);
        return m4Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EventBuilder setAbSdkVersion(@Nullable String str) {
        this.c = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EventBuilder setEvent(@NonNull String str) {
        this.b = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void track() {
        m4 m4VarBuild = build();
        IAppLogLogger iAppLogLogger = this.f111a.D;
        StringBuilder sbA = a.a("EventBuilder track: ");
        sbA.append(this.b);
        iAppLogLogger.debug(4, sbA.toString(), new Object[0]);
        this.f111a.receive(m4VarBuild);
    }
}
