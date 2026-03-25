package com.bytedance.bdtracker;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.bytedance.applog.InitConfig;
import com.bytedance.applog.event.EventBasicData;
import com.bytedance.applog.event.EventPolicy;
import com.bytedance.applog.event.EventType;
import com.bytedance.applog.event.IEventHandler;
import com.bytedance.applog.log.LogUtils;
import com.bytedance.applog.store.IEventDropStrategy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f206a;
    public final j4 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public k4(f0 f0Var, j4 j4Var) {
        this.f206a = f0Var;
        this.b = j4Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final EventPolicy a(IEventHandler iEventHandler, int i, String str, f4 f4Var, JSONObject jSONObject) {
        f4Var.h();
        String strA = u4.a(f4Var.e());
        JSONObject jSONObject2 = new JSONObject();
        if (!TextUtils.isEmpty(strA)) {
            try {
                jSONObject2 = new JSONObject(strA);
            } catch (Throwable unused) {
                this.f206a.d.D.error(5, "Param:[{}] is not a json string", strA);
            }
        }
        if (jSONObject != null) {
            r.c(jSONObject, jSONObject2);
        }
        EventPolicy eventPolicyOnReceive = iEventHandler.onReceive(i, str, jSONObject2, new EventBasicData(f4Var));
        f4Var.f175o = jSONObject2;
        return eventPolicyOnReceive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(List<f4> list) {
        SQLiteDatabase writableDatabase;
        SQLiteDatabase writableDatabase2;
        SQLiteDatabase sQLiteDatabase;
        InitConfig initConfig;
        IEventDropStrategy eventDropStrategy;
        InitConfig initConfig2;
        if (list == null || list.isEmpty()) {
            return;
        }
        v1 v1Var = this.f206a.e;
        if (v1Var == null || (initConfig2 = v1Var.c) == null || initConfig2.isTrackEventEnabled()) {
            ArrayList<n4> arrayList = new ArrayList(4);
            ArrayList<p4> arrayList2 = new ArrayList(4);
            ArrayList arrayList3 = new ArrayList(4);
            IEventHandler iEventHandler = this.f206a.d.C;
            try {
                writableDatabase = this.b.getWritableDatabase();
            } catch (Throwable th) {
                th = th;
                writableDatabase = null;
            }
            try {
                writableDatabase.beginTransaction();
                ContentValues contentValuesA = null;
                for (f4 f4Var : list) {
                    if (a(iEventHandler, f4Var, this.f206a.e.c.isLaunchTerminateEnabled())) {
                        if (TextUtils.isEmpty(f4Var.m)) {
                            f4Var.m = this.f206a.d.m;
                        }
                        if (!(f4Var instanceof n4) && !(f4Var instanceof s4) && !(f4Var instanceof q4)) {
                            f4.a(f4Var, this.f206a.i.o());
                        }
                        this.f206a.F.a(f4Var);
                        String strF = f4Var.f();
                        contentValuesA = f4Var.a(contentValuesA);
                        f4Var.b = writableDatabase.insert(strF, null, contentValuesA);
                        this.f206a.d.b().a("make_event", 1);
                        if ("eventv3".equals(f4Var.f())) {
                            arrayList3.add(f4Var);
                        } else if (f4Var instanceof n4) {
                            arrayList.add((n4) f4Var);
                        } else if (f4Var instanceof p4) {
                            arrayList2.add((p4) f4Var);
                        }
                        LogUtils.sendObject("event_save_db", f4Var);
                        this.f206a.d.D.debug(5, "[event_process][save] event_save_db: {}, id: {}", f4Var, Long.valueOf(f4Var.b));
                    } else {
                        f0 f0Var = this.f206a;
                        p2.a(f0Var.q, 2L, f0Var.d(), 1005);
                        this.f206a.d.D.debug(5, "[event_process][delete] filterByEventHandler: {}", f4Var);
                    }
                }
                writableDatabase.setTransactionSuccessful();
                f0 f0Var2 = this.f206a;
                m2 m2Var = f0Var2.q;
                String strD = f0Var2.d();
                int size = list.size();
                if (m2Var != null) {
                    ((r2) m2Var).a(new w2(size));
                }
                if (m2Var != null) {
                    if (strD == null) {
                        strD = "";
                    }
                    ((r2) m2Var).a(new y2(1L, strD, 1L));
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    this.f206a.d.D.debug(5, "[event_process][save] Insert to table failed", th);
                    this.f206a.d.b().a(th, "db insert");
                    if (list.size() > 0 && !(list.get(0) instanceof t4)) {
                        p2.a(this.f206a.q, th);
                    }
                } finally {
                }
            }
            r.a(writableDatabase);
            a(arrayList3);
            try {
                for (p4 p4Var : arrayList2) {
                    if (p4Var.s == -1) {
                        if (this.f206a.d.c.a()) {
                            this.f206a.d.c.pageJson(p4Var.h(), true);
                        }
                        if (this.f206a.d.c.b()) {
                            this.f206a.d.c.onPageEnter(p4Var.f175o);
                        }
                    } else {
                        if (this.f206a.d.c.a()) {
                            this.f206a.d.c.pageJson(p4Var.h(), false);
                        }
                        if (this.f206a.d.c.b()) {
                            this.f206a.d.c.onPageLeave(p4Var.f175o);
                        }
                    }
                }
            } catch (Throwable th3) {
                this.f206a.d.D.debug(5, "Notify event observer failed", th3);
            }
            try {
                for (n4 n4Var : arrayList) {
                    this.f206a.d.b.onSessionStart(n4Var.b, n4Var.e);
                    if (this.f206a.d.c.a()) {
                        this.f206a.d.c.launchJson(n4Var.h());
                    }
                    if (this.f206a.d.c.b()) {
                        this.f206a.d.c.onLaunch(n4Var.f175o);
                    }
                }
            } catch (Throwable th4) {
                this.f206a.d.D.debug(5, "Notify session observer failed ", th4);
            }
            try {
                initConfig = this.f206a.d.getInitConfig();
            } catch (Throwable th5) {
                th = th5;
                sQLiteDatabase = null;
            }
            if (initConfig != null && (eventDropStrategy = initConfig.getEventDropStrategy()) != null) {
                if (eventDropStrategy.eventDBCacheSize() < 1) {
                    this.f206a.d.D.debug(5, "[event_process][delete] checkDbFileSizeAndClear return, eventDBCacheSize < 1 no limit", new Object[0]);
                    r.a((SQLiteDatabase) null);
                    return;
                }
                sQLiteDatabase = null;
                try {
                    long length = this.f206a.b().getDatabasePath(initConfig.getDbName()).length();
                    long jEventDBCacheSize = ((long) eventDropStrategy.eventDBCacheSize()) * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                    if (length > jEventDBCacheSize) {
                        writableDatabase2 = this.b.getWritableDatabase();
                        try {
                            writableDatabase2.beginTransaction();
                            writableDatabase2.execSQL("DELETE FROM eventv3 WHERE _id IN (SELECT _id FROM eventv3 ORDER BY _id LIMIT 200)");
                            writableDatabase2.setTransactionSuccessful();
                            this.f206a.d.D.debug(5, "[event_process][delete] checkDbFileSizeAndClear trigger delete, fileSize: {}, custom size: {}, delete count: {}", Long.valueOf(length), Long.valueOf(jEventDBCacheSize), 200);
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } else {
                        this.f206a.d.D.debug(5, "[event_process][delete] checkDbFileSizeAndClear don't need trigger delete, fileSize: {}, custom size: {}", Long.valueOf(length), Long.valueOf(jEventDBCacheSize));
                    }
                } catch (Throwable th7) {
                    th = th7;
                    writableDatabase2 = sQLiteDatabase;
                }
                writableDatabase2 = sQLiteDatabase;
                try {
                    this.f206a.d.D.error(5, "[event_process][delete] checkDbFileSizeAndClear failed", th, new Object[0]);
                    return;
                } finally {
                }
            }
            sQLiteDatabase = null;
            writableDatabase2 = sQLiteDatabase;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(IEventHandler iEventHandler, f4 f4Var, boolean z) {
        EventPolicy eventPolicyA;
        int i;
        String str;
        JSONObject jSONObject;
        String strA;
        if (f4Var != null) {
            if (iEventHandler != null) {
                int iAcceptType = iEventHandler.acceptType();
                if (f4Var instanceof h4) {
                    eventPolicyA = EventType.a(iAcceptType, 8) ? a(iEventHandler, 8, "bav2b_click", f4Var, f4Var.f175o) : null;
                    if (f4Var instanceof n4) {
                        eventPolicyA = z ? EventPolicy.ACCEPT : EventPolicy.DENY;
                    }
                    if (eventPolicyA != EventPolicy.DENY) {
                        return false;
                    }
                } else if (!(f4Var instanceof m4)) {
                    if (f4Var instanceof p4) {
                        i = 4;
                        if (EventType.a(iAcceptType, 4)) {
                            jSONObject = f4Var.f175o;
                            strA = "bav2b_page";
                            eventPolicyA = a(iEventHandler, i, strA, f4Var, jSONObject);
                            if (f4Var instanceof n4) {
                            }
                            if (eventPolicyA != EventPolicy.DENY) {
                            }
                        }
                    } else if (f4Var instanceof q4) {
                        i = 2;
                        if (EventType.a(iAcceptType, 2)) {
                            str = ((q4) f4Var).t;
                            strA = r.a((Object) str);
                            jSONObject = f4Var.f175o;
                            eventPolicyA = a(iEventHandler, i, strA, f4Var, jSONObject);
                            if (f4Var instanceof n4) {
                            }
                            if (eventPolicyA != EventPolicy.DENY) {
                            }
                        }
                    }
                    if (f4Var instanceof n4) {
                    }
                    if (eventPolicyA != EventPolicy.DENY) {
                    }
                } else {
                    if (EventType.a(iAcceptType, 1)) {
                        str = ((m4) f4Var).u;
                        i = 1;
                        strA = r.a((Object) str);
                        jSONObject = f4Var.f175o;
                        eventPolicyA = a(iEventHandler, i, strA, f4Var, jSONObject);
                        if (f4Var instanceof n4) {
                        }
                        if (eventPolicyA != EventPolicy.DENY) {
                        }
                    }
                    if (f4Var instanceof n4) {
                    }
                    if (eventPolicyA != EventPolicy.DENY) {
                    }
                }
            }
        }
        return true;
    }

    public void a(List<f4> list) {
        try {
            for (f4 f4Var : list) {
                if ("eventv3".equals(f4Var.f())) {
                    m4 m4Var = (m4) f4Var;
                    j1 j1Var = this.f206a.d.c;
                    String str = m4Var.u;
                    String str2 = m4Var.s;
                    j1Var.onEventV3(str, str2 != null ? new JSONObject(str2) : null);
                    if (this.f206a.d.c.a()) {
                        this.f206a.d.c.eventJson(m4Var.u, m4Var.h());
                    }
                }
            }
        } catch (Throwable th) {
            this.f206a.d.D.debug(5, "Notify event observer failed", th);
        }
    }
}
