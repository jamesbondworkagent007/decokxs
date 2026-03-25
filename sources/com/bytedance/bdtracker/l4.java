package com.bytedance.bdtracker;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.compose.material3.CalendarModelKt;
import com.bytedance.applog.log.LogUtils;
import com.bytedance.applog.store.IEventDropStrategy;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.google.android.gms.common.Scopes;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j4 f217a;
    public final f0 b;
    public final k4 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public l4(f0 f0Var, String str) {
        j4 j4Var = new j4(f0Var, str, null, 51);
        this.f217a = j4Var;
        this.b = f0Var;
        this.c = new k4(f0Var, j4Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("local_time_ms")) {
                    try {
                        arrayList.add(Long.valueOf(jSONObjectOptJSONObject.getLong("local_time_ms")));
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a() {
        IEventDropStrategy eventDropStrategy = this.b.e.c.getEventDropStrategy();
        if (eventDropStrategy == null) {
            this.b.d.D.debug("[event_process][delete] checkNeedClearExpiredEvent return, because no strategy", new Object[0]);
            return;
        }
        if (eventDropStrategy.reportTimeoutInDay() < 1) {
            this.b.d.D.debug(5, "[event_process][delete] checkNeedClearExpiredEvent return, reportTimeoutInDay < 1 no limit", new Object[0]);
            return;
        }
        int iReportTimeoutInDay = eventDropStrategy.reportTimeoutInDay();
        this.b.d.D.debug("[event_process][delete] checkNeedClearExpiredEvent custom timeoutInDay:" + iReportTimeoutInDay, new Object[0]);
        synchronized (this) {
            SQLiteDatabase writableDatabase = null;
            try {
                writableDatabase = this.f217a.getWritableDatabase();
                writableDatabase.beginTransaction();
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = iReportTimeoutInDay;
                for (f4 f4Var : f4.j().values()) {
                    if (r.d(f4Var.a())) {
                        int iDelete = writableDatabase.delete(f4Var.f(), "local_time_ms < ?", new String[]{String.valueOf(jCurrentTimeMillis - (CalendarModelKt.MillisecondsIn24Hours * j))});
                        this.b.d.D.debug("[event_process][delete] checkNeedClearExpiredEvent delete: {}, count: {}" + f4Var.f(), Integer.valueOf(iDelete));
                    }
                }
                writableDatabase.setTransactionSuccessful();
                r.a(writableDatabase);
            } catch (Throwable th) {
                try {
                    this.b.d.D.error("[event_process][delete] checkNeedClearExpiredEvent failed", th, new Object[0]);
                    p2.a(this.b.q, th);
                } finally {
                    if (writableDatabase != null) {
                        r.a(writableDatabase);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void a(JSONObject jSONObject) {
        e(a(jSONObject.optJSONArray("launch")));
        e(a(jSONObject.optJSONArray("terminate")));
        e(a(jSONObject.optJSONArray("event_v3")));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean b() {
        SQLiteDatabase writableDatabase;
        Throwable th;
        boolean z;
        synchronized (this) {
            try {
                writableDatabase = this.f217a.getWritableDatabase();
            } catch (Throwable th2) {
                writableDatabase = null;
                th = th2;
            }
            try {
                writableDatabase.beginTransaction();
                for (f4 f4Var : f4.j().values()) {
                    if (r.d(f4Var.a())) {
                        writableDatabase.delete(f4Var.f(), null, null);
                    }
                }
                writableDatabase.setTransactionSuccessful();
                r.a(writableDatabase);
                z = true;
            } catch (Throwable th3) {
                th = th3;
                try {
                    this.b.d.D.error(5, "Clear database failed", th, new Object[0]);
                    this.b.d.b().a(th, "db clear");
                    p2.a(this.b.q, th);
                    z = false;
                } finally {
                    if (writableDatabase != null) {
                        r.a(writableDatabase);
                    }
                }
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<p4> c(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = str2 == null ? sQLiteDatabase.rawQuery("SELECT * FROM page WHERE _app_id= ? and user_unique_id is null order by duration desc", new String[]{str}) : sQLiteDatabase.rawQuery("SELECT * FROM page WHERE _app_id= ? and user_unique_id = ? order by duration desc", new String[]{str, str2});
            while (cursorRawQuery.moveToNext()) {
                p4 p4Var = new p4();
                p4Var.a(cursorRawQuery);
                arrayList.add(p4Var);
            }
        } catch (Throwable th) {
            try {
                this.b.d.b().a(th, "queryAllPageByUuid");
                boolean z = th instanceof SQLiteBlobTooBigException;
                this.b.d.D.error(5, "Query pages by userId:{} failed", th, str2);
                p2.a(this.b.q, th);
                if (z) {
                    c();
                }
            } finally {
                r.a(cursorRawQuery);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void c(List<f4> list) {
        synchronized (this) {
            this.c.b(list);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void d(List<q4> list) {
        SQLiteDatabase writableDatabase;
        synchronized (this) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                writableDatabase = this.f217a.getWritableDatabase();
            } catch (Throwable th) {
                th = th;
            }
            try {
                writableDatabase.beginTransaction();
                Iterator<q4> it = list.iterator();
                ContentValues contentValuesA = null;
                while (it.hasNext()) {
                    contentValuesA = it.next().a(contentValuesA);
                    writableDatabase.insert(Scopes.PROFILE, null, contentValuesA);
                }
                writableDatabase.setTransactionSuccessful();
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = writableDatabase;
                try {
                    this.b.d.b().a(th, "saveProfiles");
                    this.b.d.D.error(5, "Save profiles failed", th, new Object[0]);
                    p2.a(this.b.q, th);
                    writableDatabase = sQLiteDatabase;
                } finally {
                    r.a(sQLiteDatabase);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(List<Long> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (Long l : list) {
            m2 m2Var = this.b.q;
            long jLongValue = l.longValue();
            if (m2Var != null) {
                ((r2) m2Var).a(new b3(jCurrentTimeMillis - jLongValue));
            }
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, IGET, IGET, INVOKE, CONST_STR, INVOKE, IGET, IGET, IGET, NEW_ARRAY, CONST_STR, CONST, INVOKE, IGET, IGET, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x001e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(List<o4> list) {
        int i;
        synchronized (this) {
            if (list == null) {
                return;
            }
            IEventDropStrategy eventDropStrategy = this.b.e.c.getEventDropStrategy();
            SQLiteDatabase writableDatabase = null;
            try {
                writableDatabase = this.f217a.getWritableDatabase();
                writableDatabase.beginTransaction();
                for (o4 o4Var : list) {
                    int i2 = o4Var.A;
                    if (i2 == 0) {
                        writableDatabase.execSQL("DELETE FROM packV2 WHERE _id=?", new Object[]{Long.valueOf(o4Var.b)});
                        this.b.d.D.debug("[event_process][delete] doAfterPackSend send success delete", new Object[0]);
                    } else if (eventDropStrategy != null) {
                        boolean z = eventDropStrategy.reportTimeoutInDay() >= 1 && Math.abs(System.currentTimeMillis() - o4Var.c) > ((long) eventDropStrategy.reportTimeoutInDay()) * CalendarModelKt.MillisecondsIn24Hours;
                        boolean z2 = eventDropStrategy.reportMaxRetryTimes() >= 1 && o4Var.A > eventDropStrategy.reportMaxRetryTimes();
                        if (!z && !z2) {
                            i = o4Var.A;
                            if (i <= 0) {
                            }
                        }
                        writableDatabase.execSQL("DELETE FROM packV2 WHERE _id=?", new Object[]{Long.valueOf(o4Var.b)});
                        this.b.d.D.debug("[event_process][delete] doAfterPackSend trigger custom drop strategy, reportTimeoutInDay: {}, reportMaxRetryTimes: {}", Boolean.valueOf(z), Boolean.valueOf(z2));
                    } else if (i2 > 0 && Math.abs(System.currentTimeMillis() - o4Var.c) > 2592000000L) {
                        writableDatabase.execSQL("DELETE FROM packV2 WHERE _id=?", new Object[]{Long.valueOf(o4Var.b)});
                        this.b.d.D.debug("[event_process][delete] doAfterPackSend old delete way, failed pack > 0 & day > LIMIT_INTERVAL_SEND_FAIL", new Object[0]);
                    } else {
                        i = o4Var.A;
                        if (i <= 0) {
                            writableDatabase.execSQL("UPDATE packV2 SET _fail= ? WHERE _id= ?", new Object[]{Integer.valueOf(i), Long.valueOf(o4Var.b)});
                        }
                    }
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public final void c() {
        try {
            Field declaredField = CursorWindow.class.getDeclaredField("sCursorWindowSize");
            declaredField.setAccessible(true);
            int i = declaredField.getInt(null);
            if (i > 0 && i <= 8388608) {
                int i2 = i * 2;
                declaredField.setInt(null, i2);
                this.b.d.D.debug("tryIncreaseCursorWindowSize set new curCursorWindowSize = " + i2, new Object[0]);
            } else {
                this.b.d.D.debug("tryIncreaseCursorWindowSize curCursorWindowSize invalid = " + i, new Object[0]);
            }
        } catch (Throwable th) {
            this.b.d.b().a(th, "tryIncreaseCursorWindowSize");
            this.b.d.D.error(5, "tryIncreaseCursorWindowSize", th, new Object[0]);
        }
    }

    public final List<s4> a(List<p4> list, List<p4> list2, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        String strD = this.b.d();
        ArrayList arrayList3 = new ArrayList();
        HashMap map = new HashMap();
        for (p4 p4Var : list) {
            if (!r.a(p4Var.e, strD)) {
                String strA = r.a((Object) p4Var.e);
                List arrayList4 = (List) map.get(strA);
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                    map.put(strA, arrayList4);
                }
                arrayList4.add(p4Var);
            }
        }
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            HashMap map2 = new HashMap();
            p4 p4Var2 = (p4) ((List) entry.getValue()).get(0);
            Iterator it3 = ((List) entry.getValue()).iterator();
            long j = 0;
            long j2 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                p4 p4Var3 = (p4) it3.next();
                Integer num = (Integer) map2.get(p4Var3.u);
                if (p4Var3.k()) {
                    if (num != null) {
                        Integer numValueOf = Integer.valueOf(num.intValue() - 1);
                        if (numValueOf.intValue() > 0) {
                            map2.put(p4Var3.u, numValueOf);
                        } else {
                            map2.remove(p4Var3.u);
                        }
                    } else {
                        p4Var3.s = 1000L;
                        if (!p4Var3.D) {
                            j += 1000;
                        }
                        list2.add(p4Var3);
                    }
                    arrayList2 = arrayList3;
                    it = it2;
                } else {
                    arrayList2 = arrayList3;
                    it = it2;
                    long jMax = Math.max(1000L, p4Var3.s);
                    p4Var3.s = jMax;
                    if (!p4Var3.D) {
                        j += jMax;
                    }
                    map2.put(p4Var3.u, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                    list2.add(p4Var3);
                }
                long j3 = !p4Var3.k() ? p4Var3.c : p4Var3.c + p4Var3.s;
                if (!p4Var3.D && j3 > j2) {
                    j2 = j3;
                    p4Var2 = p4Var3;
                }
                arrayList3 = arrayList2;
                it2 = it;
            }
            ArrayList arrayList5 = arrayList3;
            Iterator it4 = it2;
            v1 v1Var = this.b.e;
            if ((v1Var != null && v1Var.t.b.contains("app_terminate")) || !z) {
                this.b.d.D.debug(5, "Terminate event block", new Object[0]);
                arrayList = arrayList5;
            } else {
                s4 s4Var = new s4();
                s4Var.e = (String) entry.getKey();
                s4Var.s = j;
                s4Var.c = j2;
                s4Var.f = p4Var2.f;
                s4Var.g = p4Var2.g;
                s4Var.h = p4Var2.h;
                s4Var.i = p4Var2.i;
                s4Var.j = p4Var2.j;
                s4Var.t = j2;
                k0 k0Var = this.b.n;
                s4Var.d = k0Var != null ? k0Var.f.incrementAndGet() : 1000L;
                s4Var.u = null;
                if (!TextUtils.isEmpty(p4Var2.B)) {
                    s4Var.u = p4Var2.B;
                }
                JSONObject jSONObject = p4Var2.f175o;
                if (jSONObject != null && jSONObject.has("$screen_orientation")) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("$screen_orientation", p4Var2.f175o.optString("$screen_orientation"));
                        s4Var.f175o = jSONObject2;
                    } catch (Throwable th) {
                        this.b.d.D.warn(5, "JSON handle failed", th);
                    }
                }
                arrayList = arrayList5;
                arrayList.add(s4Var);
            }
            arrayList3 = arrayList;
            it2 = it4;
        }
        return arrayList3;
    }

    public void b(String str, JSONObject jSONObject) {
        synchronized (this) {
            this.b.d.D.debug(5, "Pack trace events for appId:{} start...", str);
            try {
                SQLiteDatabase writableDatabase = this.f217a.getWritableDatabase();
                List<t4> listA = a(writableDatabase, str);
                if (listA.isEmpty()) {
                    return;
                }
                o4 o4Var = new o4();
                JSONObject jSONObject2 = new JSONObject();
                r.a(jSONObject2, jSONObject);
                jSONObject2.remove("user_unique_id");
                jSONObject2.remove("user_unique_id_type");
                o4Var.y = jSONObject2;
                o4Var.m = str;
                o4Var.x = listA;
                a(writableDatabase, o4Var);
            } catch (Throwable th) {
                this.b.d.b().a(th, "packTrace");
                this.b.d.D.error(5, "Pack trace events for appId:{} failed", th, str);
                p2.a(this.b.q, th);
            }
        }
    }

    public final int a(SQLiteDatabase sQLiteDatabase, String str, String str2, String[] strArr) {
        if (sQLiteDatabase == null) {
            return 0;
        }
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery("SELECT count(1) FROM " + str + " WHERE " + str2, strArr);
            if (cursorRawQuery.moveToNext()) {
                return cursorRawQuery.getInt(0);
            }
        } catch (Throwable th) {
            try {
                this.b.d.b().a(th, "countByTableWhere");
                this.b.d.D.error(5, "Count table:{} failed", th, str);
                p2.a(this.b.q, th);
            } finally {
                r.a(cursorRawQuery);
            }
        }
        return 0;
    }

    public final List<m4> b(SQLiteDatabase sQLiteDatabase, String str, String str2, int i) {
        Throwable th;
        Cursor cursorRawQuery;
        if (i <= 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        try {
            cursorRawQuery = str2 == null ? sQLiteDatabase.rawQuery("SELECT * FROM eventv3 WHERE _app_id= ? and user_unique_id is null limit 0, ?", new String[]{str, String.valueOf(i)}) : sQLiteDatabase.rawQuery("SELECT * FROM eventv3 WHERE _app_id= ? and user_unique_id = ? limit 0, ?", new String[]{str, str2, String.valueOf(i)});
            while (cursorRawQuery.moveToNext()) {
                try {
                    m4 m4Var = new m4();
                    m4Var.a(cursorRawQuery);
                    arrayList.add(m4Var);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        this.b.d.b().a(th, "queryAllEventV3ByUuid");
                        boolean z = th instanceof SQLiteBlobTooBigException;
                        this.b.d.D.error(5, "Query v3 event by uuid:{} for appId:{} failed", th, str2, str);
                        p2.a(this.b.q, th);
                        if (z) {
                            c();
                        }
                    } finally {
                        r.a(cursorRawQuery);
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            cursorRawQuery = null;
        }
        return arrayList;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, IGET, IGET, INVOKE, CONST_STR, INVOKE, IGET, IGET, IGET, NEW_ARRAY, CONST_STR, CONST, INVOKE, IGET, IGET, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void a(List<q4> list) {
        synchronized (this) {
            SQLiteDatabase writableDatabase = null;
            try {
                writableDatabase = this.f217a.getWritableDatabase();
                writableDatabase.beginTransaction();
                Iterator<q4> it = list.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(Scopes.PROFILE, "_id=?", new String[]{String.valueOf(it.next().b)});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public final List<n4> b(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = str2 == null ? sQLiteDatabase.rawQuery("SELECT * FROM launch WHERE _app_id= ? and user_unique_id is null", new String[]{str}) : sQLiteDatabase.rawQuery("SELECT * FROM launch WHERE _app_id= ? and user_unique_id = ?", new String[]{str, str2});
            while (cursorRawQuery.moveToNext()) {
                n4 n4Var = new n4();
                n4Var.a(cursorRawQuery);
                arrayList.add(n4Var);
                boolean z = false;
                if (r.d(n4Var.e) && a(sQLiteDatabase, "page", "session_id = ? LIMIT 1", new String[]{n4Var.e}) > 0) {
                    z = true;
                }
                n4Var.u = !z;
            }
        } catch (Throwable th) {
            try {
                this.b.d.b().a(th, "queryAllLaunchByUuid");
                boolean z2 = th instanceof SQLiteBlobTooBigException;
                this.b.d.D.error(5, "Query launch by uuid:{} for appId:{} failed", th, str2, str);
                p2.a(this.b.q, th);
                if (z2) {
                    c();
                }
            } finally {
                r.a(cursorRawQuery);
            }
        }
        return arrayList;
    }

    public final Set<String> a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        HashSet hashSet = new HashSet();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery("SELECT `user_unique_id` FROM " + str + " WHERE _app_id= ?", new String[]{str2});
            while (cursorRawQuery.moveToNext()) {
                hashSet.add(cursorRawQuery.getString(0));
            }
        } catch (Throwable th) {
            try {
                this.b.d.b().a(th, "loadTableUuidSet");
                boolean z = th instanceof SQLiteBlobTooBigException;
                this.b.d.D.error(5, "Query uuid set from table:{} for appId:{} failed", th, str, str2);
                p2.a(this.b.q, th);
                if (z) {
                    c();
                }
            } finally {
                r.a(cursorRawQuery);
            }
        }
        return hashSet;
    }

    public int b(String str) {
        Throwable th;
        Cursor cursorRawQuery;
        int i;
        boolean z = false;
        try {
            cursorRawQuery = this.f217a.getReadableDatabase().rawQuery("SELECT * FROM packV2 WHERE _app_id= ? ORDER BY _id DESC LIMIT 8", new String[]{str});
        } catch (Throwable th2) {
            th = th2;
            cursorRawQuery = null;
            i = 0;
        }
        if (cursorRawQuery == null) {
            return 0;
        }
        i = 0;
        while (cursorRawQuery.moveToNext()) {
            try {
                i++;
            } catch (Throwable th3) {
                th = th3;
                try {
                    this.b.d.b().a(th, "queryPackCount");
                    boolean z2 = th instanceof SQLiteBlobTooBigException;
                    this.b.d.D.error(5, "Query event packs count failed", th, new Object[0]);
                    p2.a(this.b.q, th);
                    r.a(cursorRawQuery);
                    z = z2;
                } finally {
                    r.a(cursorRawQuery);
                }
            }
        }
        if (z) {
            c();
        }
        return i;
    }

    public boolean a(String str, JSONObject jSONObject) {
        SQLiteDatabase readableDatabase;
        List<s4> list;
        List<i4> list2;
        synchronized (this) {
            this.b.d.D.debug(5, "Pack events for appId:{} start...", str);
            try {
                readableDatabase = this.f217a.getReadableDatabase();
            } catch (Throwable th) {
                this.b.d.b().a(th, "queryAllUnionUuid");
                this.b.d.D.error(5, "Open db failed", th, new Object[0]);
                p2.a(this.b.q, th);
                readableDatabase = null;
            }
            HashSet<String> hashSet = new HashSet();
            if (readableDatabase != null) {
                hashSet.addAll(a(readableDatabase, "launch", str));
                hashSet.addAll(a(readableDatabase, "page", str));
                hashSet.addAll(a(readableDatabase, "eventv3", str));
                hashSet.addAll(a(readableDatabase, MTAnalysisConstants.TYPE_EVENT, str));
            }
            if (hashSet.isEmpty()) {
                return false;
            }
            HashSet hashSet2 = new HashSet();
            try {
                SQLiteDatabase writableDatabase = this.f217a.getWritableDatabase();
                for (String str2 : hashSet) {
                    o4 o4Var = new o4();
                    o4Var.m = str;
                    JSONObject jSONObject2 = new JSONObject();
                    r.a(jSONObject2, jSONObject);
                    jSONObject2.remove("ssid");
                    jSONObject2.put("user_unique_id", r.c(str2) ? JSONObject.NULL : str2);
                    o4Var.y = jSONObject2;
                    o4Var.v = b(writableDatabase, str, str2);
                    List<p4> listC = c(writableDatabase, str, str2);
                    ArrayList arrayList = new ArrayList();
                    List<s4> listA = a(listC, arrayList, this.b.e.c.isLaunchTerminateEnabled());
                    o4Var.u = arrayList;
                    o4Var.w = listA;
                    if (!listA.isEmpty()) {
                        v1 v1Var = this.b.e;
                        boolean z = v1Var.r;
                        v1Var.r = false;
                        o4Var.C = z;
                    }
                    o4Var.t = a(writableDatabase, str, str2, o4Var.k());
                    int iK = o4Var.k();
                    List<i4> list3 = o4Var.t;
                    if (list3 != null) {
                        iK -= list3.size();
                    }
                    o4Var.s = b(writableDatabase, str, str2, iK);
                    List<n4> list4 = o4Var.v;
                    if ((list4 != null && !list4.isEmpty()) || (((list = o4Var.w) != null && !list.isEmpty()) || o4Var.a((Set<String>) null).length() != 0 || ((list2 = o4Var.t) != null && !list2.isEmpty()))) {
                        o4Var.m();
                        o4Var.n();
                        if (!this.b.a(jSONObject2)) {
                            this.b.d.D.warn(5, "Register to get ssid by temp header failed.", new Object[0]);
                        } else {
                            this.b.d.D.debug(5, o4Var.toString(), new Object[0]);
                            hashSet2.add(str2);
                            o4Var.c(jSONObject);
                            a(writableDatabase, o4Var);
                        }
                    }
                }
            } catch (Throwable th2) {
                this.b.d.b().a(th2, "pack");
                this.b.d.D.warn(5, "Pack events for appId:{} failed", th2, str);
                p2.a(this.b.q, th2);
            }
            return !hashSet2.isEmpty();
        }
    }

    public final List<i4> a(SQLiteDatabase sQLiteDatabase, String str, String str2, int i) {
        Throwable th;
        Cursor cursorRawQuery;
        if (i <= 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        try {
            cursorRawQuery = str2 == null ? sQLiteDatabase.rawQuery("SELECT * FROM custom_event WHERE _app_id= ? and user_unique_id is null limit 0, ?", new String[]{str, String.valueOf(i)}) : sQLiteDatabase.rawQuery("SELECT * FROM custom_event WHERE _app_id= ? and user_unique_id = ? limit 0, ?", new String[]{str, str2, String.valueOf(i)});
            while (cursorRawQuery.moveToNext()) {
                try {
                    i4 i4Var = new i4();
                    i4Var.a(cursorRawQuery);
                    arrayList.add(i4Var);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        this.b.d.b().a(th, "queryAllCustomEventByUuid");
                        boolean z = th instanceof SQLiteBlobTooBigException;
                        this.b.d.D.error(5, "Query custom event by uuid:{} for appId:{} failed", th, str2, str);
                        p2.a(this.b.q, th);
                        if (z) {
                            c();
                        }
                    } finally {
                        r.a(cursorRawQuery);
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            cursorRawQuery = null;
        }
        return arrayList;
    }

    public Map<String, List<q4>> a(String str) {
        HashMap map;
        synchronized (this) {
            map = new HashMap();
            Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = this.f217a.getWritableDatabase().rawQuery("SELECT * FROM profile WHERE _app_id=? ORDER BY _id DESC LIMIT 200", new String[]{str});
                while (cursorRawQuery.moveToNext()) {
                    q4 q4Var = new q4();
                    q4Var.a(cursorRawQuery);
                    String strA = r.a((Object) q4Var.g);
                    List arrayList = (List) map.get(strA);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        map.put(strA, arrayList);
                    }
                    arrayList.add(q4Var);
                }
            } catch (Throwable th) {
                try {
                    this.b.d.b().a(th, "queryAllProfiles");
                    boolean z = th instanceof SQLiteBlobTooBigException;
                    this.b.d.D.error(5, "Query profiles for appId:{} failed", th, str);
                    p2.a(this.b.q, th);
                    r.a(cursorRawQuery);
                    if (z) {
                        c();
                    }
                } finally {
                    r.a(cursorRawQuery);
                }
            }
        }
        return map;
    }

    public final List<t4> a(SQLiteDatabase sQLiteDatabase, String str) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM trace WHERE _app_id= ? ", new String[]{str});
            while (cursorRawQuery.moveToNext()) {
                t4 t4Var = new t4();
                t4Var.a(cursorRawQuery);
                arrayList.add(t4Var);
            }
        } catch (Throwable th) {
            try {
                this.b.d.b().a(th, "queryAllTrace");
                boolean z = th instanceof SQLiteBlobTooBigException;
                this.b.d.D.error(5, "Query trace for appId:{} failed", th, str);
                p2.a(this.b.q, th);
                if (z) {
                    c();
                }
            } finally {
                r.a(cursorRawQuery);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, IGET, IGET, INVOKE, CONST_STR, INVOKE, IGET, IGET, IGET, NEW_ARRAY, CONST_STR, CONST, INVOKE, IGET, IGET, INVOKE, MOVE_EXCEPTION] complete} */
    public final void a(SQLiteDatabase sQLiteDatabase, o4 o4Var) {
        synchronized (this) {
            try {
                sQLiteDatabase.beginTransaction();
            } finally {
                try {
                } finally {
                }
            }
            if (sQLiteDatabase.insert("packV2", null, o4Var.a((ContentValues) null)) < 0) {
                return;
            }
            List<n4> list = o4Var.v;
            if (list != null) {
                for (n4 n4Var : list) {
                    sQLiteDatabase.delete("launch", "_id = ?", new String[]{String.valueOf(n4Var.b)});
                    LogUtils.sendObject("event_pack", n4Var);
                }
            }
            List<p4> list2 = o4Var.u;
            if (list2 != null) {
                for (p4 p4Var : list2) {
                    sQLiteDatabase.delete("page", "session_id = ? and page_key = ?", new String[]{String.valueOf(p4Var.e), r.a((Object) p4Var.u)});
                    LogUtils.sendObject("event_pack", p4Var);
                }
            }
            List<i4> list3 = o4Var.t;
            if (list3 != null) {
                for (i4 i4Var : list3) {
                    sQLiteDatabase.delete(MTAnalysisConstants.TYPE_EVENT, "_id = ?", new String[]{String.valueOf(i4Var.b)});
                    LogUtils.sendObject("event_pack", i4Var);
                }
            }
            List<m4> list4 = o4Var.s;
            if (list4 != null) {
                for (m4 m4Var : list4) {
                    sQLiteDatabase.delete("eventv3", "_id = ?", new String[]{String.valueOf(m4Var.b)});
                    LogUtils.sendObject("event_pack", m4Var);
                }
            }
            if (o4Var.x != null) {
                sQLiteDatabase.delete("trace", "_app_id= ? ", new String[]{String.valueOf(o4Var.m)});
                if (!LogUtils.isDisabled()) {
                    Iterator<t4> it = o4Var.x.iterator();
                    while (it.hasNext()) {
                        LogUtils.sendObject("event_pack", it.next());
                    }
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, IGET, IGET, INVOKE, CONST_STR, INVOKE, IGET, IGET, IGET, FILLED_NEW_ARRAY, CONST_STR, CONST, INVOKE, IGET, IGET, INVOKE, MOVE_EXCEPTION] complete} */
    public void a(String str, String str2) {
        synchronized (this) {
            SQLiteDatabase writableDatabase = null;
            try {
                writableDatabase = this.f217a.getWritableDatabase();
                writableDatabase.beginTransaction();
                writableDatabase.execSQL("UPDATE launch SET ssid = ? WHERE user_unique_id = ? AND LENGTH(ssid) = 0", new String[]{str2, str});
                writableDatabase.execSQL("UPDATE page SET ssid = ? WHERE user_unique_id = ? AND LENGTH(ssid) = 0", new String[]{str2, str});
                writableDatabase.execSQL("UPDATE eventv3 SET ssid = ? WHERE user_unique_id = ? AND LENGTH(ssid) = 0", new String[]{str2, str});
                writableDatabase.execSQL("UPDATE profile SET ssid = ? WHERE user_unique_id = ? AND LENGTH(ssid) = 0", new String[]{str2, str});
                writableDatabase.execSQL("UPDATE trace SET ssid = ? WHERE user_unique_id = ? AND LENGTH(ssid) = 0", new String[]{str2, str});
                writableDatabase.setTransactionSuccessful();
            } finally {
                try {
                } finally {
                }
            }
        }
    }
}
