package com.bytedance.bdtracker;

import android.database.Cursor;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.os.Bundle;
import androidx.work.WorkRequest;
import com.bytedance.applog.IHeaderCustomTimelyCallback;
import com.bytedance.applog.log.EventBus;
import com.bytedance.applog.log.LogUtils;
import com.okinc.liveness.lca.EopTrackEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class j0 extends d0 {
    public static final long[] h = {WorkRequest.MIN_BACKOFF_MILLIS};
    public final p3 g;

    public class a implements EventBus.DataFetcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Set f196a;
        public final /* synthetic */ boolean b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public a(Set set, boolean z) {
            this.f196a = set;
            this.b = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.bytedance.applog.log.EventBus.DataFetcher
        public Object fetch() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("$$APP_ID", j0.this.f.m);
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.f196a.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                jSONObject.put("$$EVENT_LOCAL_ID_ARRAY", jSONArray);
                jSONObject.put("$$UPLOAD_STATUS", this.b ? "success" : EopTrackEvent.KEY_RESULT_FAILED);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j0(f0 f0Var) {
        super(f0Var);
        this.g = new p3("sender_", f0Var.e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void a(Set<String> set, boolean z) {
        if (LogUtils.isDisabled() || set == null || set.isEmpty()) {
            return;
        }
        LogUtils.sendJsonFetcher("event_upload_eid", new a(set, z));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean a(o4 o4Var) {
        boolean z;
        int length;
        j3 j3VarB;
        String str;
        j3 j3VarB2;
        String str2;
        c4 c4Var = this.f.j;
        f0 f0Var = this.e;
        String[] strArrA = c4Var.a(f0Var, f0Var.i.f(), o4Var.l);
        try {
            JSONObject jSONObject = new JSONObject(new String(o4Var.z));
            jSONObject.put("local_time", System.currentTimeMillis() / 1000);
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("event_v3");
                length = jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.length() : 0;
                try {
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("launch");
                    if (jSONArrayOptJSONArray2 != null) {
                        length += jSONArrayOptJSONArray2.length();
                    }
                    JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("terminate");
                    if (jSONArrayOptJSONArray3 != null) {
                        length += jSONArrayOptJSONArray3.length();
                    }
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                length = 0;
            }
            this.e.d.b().a("net_event", Integer.valueOf(length));
            int iA = this.f.k.a(strArrA, jSONObject, this.e.e);
            z = true;
            if (iA == 200) {
                this.g.c();
                o4Var.A = 0;
                try {
                    a(o4Var.l(), true);
                    this.e.c().a(jSONObject);
                    j3VarB2 = this.e.d.b();
                    str2 = "event";
                } catch (Throwable th) {
                    th = th;
                    this.e.d.D.error(4, "Send pack failed", th, new Object[0]);
                    a(o4Var.l(), false);
                }
            } else {
                if (iA < 500 || iA >= 600) {
                    if (iA >= 400 && iA < 500) {
                        j3VarB = this.e.d.b();
                        str = "f_4xx";
                    }
                    f0 f0Var2 = this.e;
                    p2.a(f0Var2.q, 13L, f0Var2.d(), iA);
                    this.e.d.D.error(4, "Send pack failed:{}", Integer.valueOf(iA));
                    o4Var.A++;
                    a(o4Var.l(), false);
                    j3VarB2 = this.e.d.b();
                    str2 = "f_net_event";
                    z = false;
                } else {
                    this.g.b();
                    j3VarB = this.e.d.b();
                    str = "f_5xx";
                }
                j3VarB.a(str, 1);
                f0 f0Var22 = this.e;
                p2.a(f0Var22.q, 13L, f0Var22.d(), iA);
                this.e.d.D.error(4, "Send pack failed:{}", Integer.valueOf(iA));
                o4Var.A++;
                a(o4Var.l(), false);
                j3VarB2 = this.e.d.b();
                str2 = "f_net_event";
                z = false;
            }
            j3VarB2.a(str2, Integer.valueOf(length));
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9 A[Catch: all -> 0x00ef, LOOP:2: B:36:0x00d9->B:38:0x00df, LOOP_START, TryCatch #1 {all -> 0x00ef, blocks: (B:33:0x00c6, B:36:0x00d9, B:38:0x00df), top: B:70:0x00c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0139  */
    @Override // com.bytedance.bdtracker.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c() {
        int iB;
        ArrayList arrayList;
        Cursor cursorRawQuery;
        Bundle bundleA;
        long jCurrentTimeMillis = System.currentTimeMillis();
        k0 k0Var = this.e.n;
        if (k0Var != null && (bundleA = k0Var.a(jCurrentTimeMillis, 50000L)) != null) {
            this.e.d.D.debug(4, "New play session event", new Object[0]);
            this.f.onEventV3("play_session", bundleA, 1);
            this.f.flush();
        }
        x1 x1Var = this.e.i;
        if (x1Var.i() == 0) {
            return false;
        }
        x1Var.a("access", (Object) i5.a(x1Var.b, this.e.n.a()));
        JSONObject jSONObjectB = r.b(x1Var.f());
        if (jSONObjectB == null) {
            this.e.d.D.error(4, "Header is empty", new Object[0]);
            return false;
        }
        IHeaderCustomTimelyCallback headerCustomCallback = this.f.getHeaderCustomCallback();
        if (headerCustomCallback != null) {
            headerCustomCallback.updateHeader(jSONObjectB);
        }
        this.e.d.D.debug(4, "Send events with header:{}", jSONObjectB);
        l4 l4VarC = this.e.c();
        String str = this.f.m;
        p3 p3Var = this.g;
        if (p3Var.a()) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            long j = p3Var.f;
            long[] jArr = p3.h[p3Var.c];
            if (jCurrentTimeMillis2 - j >= jArr[0]) {
                p3Var.d = 1;
                p3Var.f = jCurrentTimeMillis2;
            } else {
                int i = p3Var.d;
                if (i < jArr[2]) {
                    p3Var.d = i + 1;
                }
            }
            iB = l4VarC.b(str);
            if (iB < 8) {
            }
            arrayList = new ArrayList();
            cursorRawQuery = null;
            cursorRawQuery = l4VarC.f217a.getReadableDatabase().rawQuery("SELECT * FROM packV2 WHERE _app_id= ? ORDER BY _id DESC LIMIT 8", new String[]{str});
            if (cursorRawQuery == null) {
            }
            this.e.d.D.debug(4, "{} packs to be sent", Integer.valueOf(arrayList.size()));
            if (!arrayList.isEmpty()) {
            }
        } else {
            iB = l4VarC.b(str);
            if (iB < 8) {
                for (int i2 = 0; i2 < 8 - iB && l4VarC.a(str, jSONObjectB); i2++) {
                }
            }
            arrayList = new ArrayList();
            cursorRawQuery = null;
            try {
                cursorRawQuery = l4VarC.f217a.getReadableDatabase().rawQuery("SELECT * FROM packV2 WHERE _app_id= ? ORDER BY _id DESC LIMIT 8", new String[]{str});
                if (cursorRawQuery == null) {
                    while (cursorRawQuery.moveToNext()) {
                        o4 o4Var = new o4();
                        o4Var.a(cursorRawQuery);
                        arrayList.add(o4Var);
                    }
                }
            } catch (Throwable th) {
                try {
                    l4VarC.b.d.b().a(th, "queryPacks");
                    boolean z = th instanceof SQLiteBlobTooBigException;
                    l4VarC.b.d.D.error(5, "Query event packs failed", th, new Object[0]);
                    p2.a(l4VarC.b.q, th);
                    r.a(cursorRawQuery);
                    if (z) {
                        l4VarC.c();
                    }
                } finally {
                    r.a(cursorRawQuery);
                }
            }
            this.e.d.D.debug(4, "{} packs to be sent", Integer.valueOf(arrayList.size()));
            if (!arrayList.isEmpty()) {
                int i3 = 0;
                for (o4 o4Var2 : arrayList) {
                    byte[] bArr = o4Var2.z;
                    if (bArr == null || bArr.length <= 0) {
                        o4Var2.A = 0;
                        i3++;
                    } else if (a(o4Var2)) {
                        i3++;
                    }
                }
                l4VarC.b(arrayList);
                this.e.d.b().a("net", Integer.valueOf(arrayList.size()));
                this.e.d.b().a("f_net", Integer.valueOf(arrayList.size() - i3));
                this.e.d.D.debug(4, "sender successfully send " + i3 + " packs (total: " + arrayList.size() + ")", new Object[0]);
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.d0
    public String d() {
        return "sender";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.d0
    public long[] e() {
        return h;
    }

    @Override // com.bytedance.bdtracker.d0
    public boolean f() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.d0
    public long g() {
        v1 v1Var = this.e.e;
        return v1Var.a(v1Var.p) ? v1Var.p : v1Var.f.getLong("batch_event_interval", 60000L);
    }
}
