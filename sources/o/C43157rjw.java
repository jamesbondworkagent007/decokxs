package o;

import android.provider.CalendarContract;
import androidx.camera.video.AudioStats;
import androidx.core.app.ActivityCompat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import o.C43084ric;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: renamed from: o.rjw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C43157rjw {
    public static final C43157rjw copydefault = new C43157rjw();
    public static final android.net.Uri KWHzl = CalendarContract.Calendars.CONTENT_URI;
    public static final android.net.Uri EZpvd = CalendarContract.Events.CONTENT_URI;
    public static final int AEQbTJ = 2000;
    public static final SimpleDateFormat AhwBna = new SimpleDateFormat("yyyyMMdd");
    public static java.lang.String[] gEmmrt = {"android.permission.WRITE_CALENDAR", "android.permission.READ_CALENDAR"};
    public static final int OLrzqt = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String[] EZpvd() {
        return gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return AEQbTJ;
    }

    private C43157rjw() {
    }

    public final void OLrzqt(@NotNull android.content.Context context, LuaFunction luaFunction) {
        Intrinsics.checkNotNullParameter(context, "");
        boolean zKWHzl = C60121zwJ.KWHzl(context, "android.permission.WRITE_CALENDAR", "android.permission.READ_CALENDAR");
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.rBoolean(zKWHzl));
        }
    }

    public final void KWHzl(@NotNull android.content.Context context, LuaFunction luaFunction) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.String[] strArr = gEmmrt;
        if (!C60121zwJ.KWHzl(context, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length))) {
            ActivityCompat.requestPermissions((android.app.Activity) context, gEmmrt, AEQbTJ);
        } else if (luaFunction != null) {
            luaFunction.invoke(LuaValue.rNumber(1.0d));
        }
    }

    public final boolean KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.String[] strArr = gEmmrt;
        if (C60121zwJ.KWHzl(context, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length))) {
            return false;
        }
        java.lang.String[] strArr2 = gEmmrt;
        return C60121zwJ.copydefault((android.app.Activity) context, yDY.gEmmrt(java.util.Arrays.copyOf(strArr2, strArr2.length)));
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE] complete} */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[PHI: r1 r2
  0x0041: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v16 java.lang.String) binds: [B:21:0x003f, B:15:0x0035] A[DONT_GENERATE, DONT_INLINE]
  0x0041: PHI (r2v3 android.database.Cursor) = (r2v2 android.database.Cursor), (r2v6 android.database.Cursor) binds: [B:21:0x003f, B:15:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(@NotNull android.content.Context context) {
        int columnIndex;
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.String string = "1";
        android.database.Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(KWHzl, null, null, null, null);
            } catch (java.lang.Exception e) {
                e.getMessage();
                if (cursorQuery != null) {
                }
            }
            if (cursorQuery != null) {
                if (cursorQuery.getCount() > 0) {
                    if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("_id")) >= 0) {
                        string = cursorQuery.getString(columnIndex);
                    }
                } else {
                    cursorQuery.close();
                    return;
                }
                if (cursorQuery != null) {
                    return;
                }
                copydefault(context);
                android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put("title", context.getString(C43084ric.Activity.AEQbTJ));
                contentValues.put("description", context.getString(C43084ric.Activity.copydefault));
                contentValues.put("calendar_id", string);
                Calendar calendar = Calendar.getInstance();
                calendar.set(11, 12);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                long time = calendar.getTime().getTime();
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
                long millis = time + timeUnit.toMillis(1L);
                long millis2 = java.util.concurrent.TimeUnit.MINUTES.toMillis(5L);
                java.lang.String str = AhwBna.format(java.lang.Long.valueOf(timeUnit.toMillis(6L) + millis));
                Intrinsics.checkNotNullExpressionValue(str, "");
                contentValues.put("rrule", "FREQ=DAILY;UNTIL=" + str + "T000000Z");
                contentValues.put("dtstart", java.lang.Long.valueOf(millis));
                contentValues.put("dtend", java.lang.Long.valueOf(millis2 + millis));
                contentValues.put("hasAlarm", (java.lang.Integer) 1);
                contentValues.put("eventTimezone", TimeZone.getDefault().getID());
                context.getContentResolver().insert(EZpvd, contentValues);
                C33134mqi.AEQbTJ(context.getString(C43084ric.Activity.OLrzqt));
                return;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            if (cursorQuery != null) {
            }
        } catch (java.lang.Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE] complete} */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int copydefault(@NotNull android.content.Context context, LuaFunction luaFunction) throws java.lang.Throwable {
        int count;
        int count2;
        boolean z;
        int columnIndex;
        Intrinsics.checkNotNullParameter(context, "");
        if (!C60121zwJ.KWHzl(context, "android.permission.WRITE_CALENDAR", "android.permission.READ_CALENDAR")) {
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.rNumber(-1.0d));
            }
            return -1;
        }
        android.database.Cursor cursorQuery = null;
        try {
            try {
                android.database.Cursor cursorQuery2 = context.getContentResolver().query(KWHzl, null, null, null, null);
                if (cursorQuery2 != null) {
                    try {
                        count = cursorQuery2.getCount() > 0 ? cursorQuery2.getCount() : 0;
                    } catch (java.lang.Exception e) {
                        e = e;
                        cursorQuery = cursorQuery2;
                        e.getMessage();
                        if (luaFunction != null) {
                            luaFunction.invoke(LuaValue.rNumber(-1.0d));
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return -1;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        cursorQuery = cursorQuery2;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        throw th;
                    }
                }
                if (cursorQuery2 != null) {
                    cursorQuery2.close();
                }
                if (count == 0) {
                    if (luaFunction != null) {
                        luaFunction.invoke(LuaValue.rNumber(-1.0d));
                    }
                    return -1;
                }
                Calendar calendar = Calendar.getInstance();
                calendar.set(11, 12);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                long time = calendar.getTime().getTime();
                try {
                    try {
                        cursorQuery = context.getContentResolver().query(EZpvd, null, "title= ?", new java.lang.String[]{context.getString(C43084ric.Activity.AEQbTJ)}, "dtstart ASC ");
                        if (cursorQuery != null) {
                            count2 = cursorQuery.getCount();
                            if (count2 <= 0 || !cursorQuery.moveToFirst() || (columnIndex = cursorQuery.getColumnIndex("dtstart")) < 0) {
                                z = false;
                            } else if (java.util.concurrent.TimeUnit.MILLISECONDS.toDays(time - cursorQuery.getLong(columnIndex)) < 5) {
                                z = true;
                            }
                        } else {
                            count2 = 0;
                            z = false;
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (count2 <= 0) {
                            if (luaFunction != null) {
                                luaFunction.invoke(LuaValue.rNumber(AudioStats.AUDIO_AMPLITUDE_NONE));
                            }
                            return 0;
                        }
                        if (z) {
                            if (luaFunction != null) {
                                luaFunction.invoke(LuaValue.rNumber(1.0d));
                            }
                            return 1;
                        }
                        if (luaFunction == null) {
                            return 0;
                        }
                        luaFunction.invoke(LuaValue.rNumber(AudioStats.AUDIO_AMPLITUDE_NONE));
                        return 0;
                    } catch (java.lang.Exception e2) {
                        e2.getMessage();
                        if (luaFunction != null) {
                            luaFunction.invoke(LuaValue.rNumber(-1.0d));
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return -1;
                    }
                } catch (java.lang.Throwable th2) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th2;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
            }
        } catch (java.lang.Exception e3) {
            e = e3;
        }
    }

    public final void copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            context.getContentResolver().delete(EZpvd, "title= ?", new java.lang.String[]{context.getString(C43084ric.Activity.AEQbTJ)});
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE] complete} */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int EZpvd(@NotNull android.content.Context context, long j, LuaFunction luaFunction) throws java.lang.Throwable {
        android.database.Cursor cursorQuery;
        int count;
        int count2;
        boolean z;
        Intrinsics.checkNotNullParameter(context, "");
        if (!C60121zwJ.KWHzl(context, "android.permission.WRITE_CALENDAR", "android.permission.READ_CALENDAR")) {
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.rNumber(-1.0d));
            }
            return -1;
        }
        android.database.Cursor cursorQuery2 = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(KWHzl, null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        count = cursorQuery.getCount() > 0 ? cursorQuery.getCount() : 0;
                    } catch (java.lang.Exception e) {
                        e = e;
                        cursorQuery2 = cursorQuery;
                        e.getMessage();
                        if (luaFunction != null) {
                            luaFunction.invoke(LuaValue.rNumber(-1.0d));
                        }
                        if (cursorQuery2 != null) {
                            cursorQuery2.close();
                        }
                        return -1;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        throw th;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (count == 0) {
                    if (luaFunction != null) {
                        luaFunction.invoke(LuaValue.rNumber(-1.0d));
                    }
                    return -1;
                }
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date(j));
                if (calendar.get(11) > 12) {
                    calendar.setTime(new Date(j + java.util.concurrent.TimeUnit.DAYS.toMillis(1L)));
                }
                calendar.set(11, 12);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                long time = calendar.getTime().getTime();
                try {
                    try {
                        cursorQuery2 = context.getContentResolver().query(EZpvd, null, "title= ? AND dtstart= ?", new java.lang.String[]{context.getString(C43084ric.Activity.AhwBna), java.lang.String.valueOf(time)}, "dtstart ASC ");
                        if (cursorQuery2 != null) {
                            count2 = cursorQuery2.getCount();
                            if (count2 > 0) {
                                while (cursorQuery2.moveToNext()) {
                                    int columnIndex = cursorQuery2.getColumnIndex("dtstart");
                                    if (columnIndex >= 0 && copydefault.OLrzqt(time, cursorQuery2.getLong(columnIndex))) {
                                        z = true;
                                        break;
                                    }
                                }
                                z = false;
                            } else {
                                z = false;
                            }
                        } else {
                            count2 = 0;
                            z = false;
                        }
                        if (cursorQuery2 != null) {
                            cursorQuery2.close();
                        }
                        if (count2 <= 0) {
                            if (luaFunction != null) {
                                luaFunction.invoke(LuaValue.rNumber(AudioStats.AUDIO_AMPLITUDE_NONE));
                            }
                            return 0;
                        }
                        if (z) {
                            if (luaFunction != null) {
                                luaFunction.invoke(LuaValue.rNumber(1.0d));
                            }
                            return 1;
                        }
                        if (luaFunction == null) {
                            return 0;
                        }
                        luaFunction.invoke(LuaValue.rNumber(AudioStats.AUDIO_AMPLITUDE_NONE));
                        return 0;
                    } catch (java.lang.Exception e2) {
                        e2.getMessage();
                        if (luaFunction != null) {
                            luaFunction.invoke(LuaValue.rNumber(-1.0d));
                        }
                        if (cursorQuery2 != null) {
                            cursorQuery2.close();
                        }
                        return -1;
                    }
                } catch (java.lang.Throwable th2) {
                    if (cursorQuery2 != null) {
                        cursorQuery2.close();
                    }
                    throw th2;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                cursorQuery = cursorQuery2;
            }
        } catch (java.lang.Exception e3) {
            e = e3;
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE] complete} */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a A[DONT_GENERATE, PHI: r5 r7
  0x004a: PHI (r5v2 java.lang.String) = (r5v0 java.lang.String), (r5v18 java.lang.String) binds: [B:24:0x0048, B:17:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x004a: PHI (r7v3 android.database.Cursor) = (r7v2 android.database.Cursor), (r7v7 android.database.Cursor) binds: [B:24:0x0048, B:17:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(@NotNull android.content.Context context, long j) throws java.lang.Throwable {
        android.database.Cursor cursorQuery;
        int count;
        int columnIndex;
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.String string = "1";
        android.database.Cursor cursorQuery2 = null;
        try {
            cursorQuery = context.getContentResolver().query(KWHzl, null, null, null, null);
        } catch (java.lang.Exception e) {
            e = e;
            cursorQuery = null;
        } catch (java.lang.Throwable th) {
            th = th;
            if (cursorQuery2 != null) {
            }
            throw th;
        }
        if (cursorQuery != null) {
            try {
                try {
                    if (cursorQuery.getCount() > 0) {
                        if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("_id")) >= 0) {
                            string = cursorQuery.getString(columnIndex);
                        }
                    } else {
                        cursorQuery.close();
                        return;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    cursorQuery2 = cursorQuery;
                    if (cursorQuery2 != null) {
                        cursorQuery2.close();
                    }
                    throw th;
                }
            } catch (java.lang.Exception e2) {
                e = e2;
                e.getMessage();
            }
            if (cursorQuery != null) {
                return;
            }
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("title", context.getString(C43084ric.Activity.AhwBna));
            contentValues.put("description", context.getString(C43084ric.Activity.AYXKKw));
            contentValues.put("calendar_id", string);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date(j));
            if (calendar.get(11) > 12) {
                calendar.setTime(new Date(j + java.util.concurrent.TimeUnit.DAYS.toMillis(1L)));
            }
            calendar.set(11, 12);
            boolean z = false;
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            long time = calendar.getTime().getTime();
            long millis = java.util.concurrent.TimeUnit.MINUTES.toMillis(5L);
            try {
                try {
                    cursorQuery2 = context.getContentResolver().query(EZpvd, null, "title= ? AND dtstart= ?", new java.lang.String[]{context.getString(C43084ric.Activity.AhwBna), java.lang.String.valueOf(time)}, "dtstart ASC ");
                    if (cursorQuery2 != null) {
                        count = cursorQuery2.getCount();
                        if (count > 0) {
                            while (true) {
                                try {
                                    if (!cursorQuery2.moveToNext()) {
                                        break;
                                    }
                                    int columnIndex2 = cursorQuery2.getColumnIndex("dtstart");
                                    if (columnIndex2 >= 0 && copydefault.OLrzqt(time, cursorQuery2.getLong(columnIndex2))) {
                                        z = true;
                                        break;
                                    }
                                } catch (java.lang.Exception e3) {
                                    e = e3;
                                    e.getMessage();
                                    if (cursorQuery2 != null) {
                                    }
                                    if (count > 0) {
                                    }
                                    contentValues.put("dtstart", java.lang.Long.valueOf(time));
                                    contentValues.put("dtend", java.lang.Long.valueOf(millis + time));
                                    contentValues.put("hasAlarm", (java.lang.Integer) 1);
                                    contentValues.put("eventTimezone", TimeZone.getDefault().getID());
                                    context.getContentResolver().insert(EZpvd, contentValues);
                                    return;
                                }
                            }
                        }
                    } else {
                        count = 0;
                    }
                } catch (java.lang.Exception e4) {
                    e = e4;
                    count = 0;
                }
                if (cursorQuery2 != null) {
                    cursorQuery2.close();
                }
                if (count > 0 || !z) {
                    contentValues.put("dtstart", java.lang.Long.valueOf(time));
                    contentValues.put("dtend", java.lang.Long.valueOf(millis + time));
                    contentValues.put("hasAlarm", (java.lang.Integer) 1);
                    contentValues.put("eventTimezone", TimeZone.getDefault().getID());
                    context.getContentResolver().insert(EZpvd, contentValues);
                    return;
                }
                return;
            } finally {
                if (cursorQuery2 != null) {
                    cursorQuery2.close();
                }
            }
        }
        if (cursorQuery != null) {
        }
        if (cursorQuery != null) {
        }
    }

    public final boolean OLrzqt(long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        calendar.setTime(new Date(j2));
        return calendar.get(1) == i && calendar.get(2) == i2 && calendar.get(5) == i3;
    }
}
