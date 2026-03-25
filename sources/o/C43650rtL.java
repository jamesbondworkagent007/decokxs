package o;

import android.provider.CalendarContract;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rtL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C43650rtL {
    public static final C43650rtL EZpvd = new C43650rtL();
    public static final android.net.Uri OLrzqt = CalendarContract.Calendars.CONTENT_URI;
    public static final android.net.Uri copydefault = CalendarContract.Events.CONTENT_URI;
    public static final SimpleDateFormat AEQbTJ = new SimpleDateFormat("yyyyMMdd");
    public static final int KWHzl = 8;

    private C43650rtL() {
    }

    public final boolean OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, long j, long j2, @NotNull java.lang.String str3, java.lang.Integer num, java.lang.Long l) {
        java.lang.String str4;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        try {
            int iAEQbTJ = AEQbTJ(context);
            if (iAEQbTJ < 0) {
                return false;
            }
            C43157rjw.copydefault.copydefault(context);
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("title", str);
            contentValues.put("description", str2);
            contentValues.put("calendar_id", java.lang.Integer.valueOf(iAEQbTJ));
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 12);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            if (num != null && num.intValue() == 1) {
                str4 = "FREQ=DAILY;";
            } else if (num != null && num.intValue() == 2) {
                str4 = "FREQ=WEEKLY;";
            } else {
                str4 = (num != null && num.intValue() == 3) ? "FREQ=MONTHLY;" : "";
            }
            if (l != null && C33129mqd.OLrzqt((java.lang.CharSequence) str4)) {
                java.lang.String str5 = AEQbTJ.format(l);
                Intrinsics.checkNotNullExpressionValue(str5, "");
                str4 = str4 + "UNTIL=" + str5 + "T000000Z";
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str4)) {
                contentValues.put("rrule", str4);
            }
            contentValues.put("dtstart", java.lang.Long.valueOf(j));
            contentValues.put("dtend", java.lang.Long.valueOf(j2));
            contentValues.put("hasAlarm", (java.lang.Integer) 1);
            java.lang.String id = TimeZone.getDefault().getID();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str3)) {
                id = yCN.OLrzqt(str3).getID();
            }
            contentValues.put("eventTimezone", id);
            context.getContentResolver().insert(copydefault, contentValues);
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public final int AEQbTJ(android.content.Context context) {
        int iOLrzqt = OLrzqt(context);
        if (iOLrzqt >= 0) {
            return iOLrzqt;
        }
        if (EZpvd(context) >= 0) {
            return OLrzqt(context);
        }
        return -1;
    }

    public final int OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.database.Cursor cursorQuery = context.getContentResolver().query(OLrzqt, null, null, null, null);
        if (cursorQuery == null) {
            return -1;
        }
        try {
            if (cursorQuery.getCount() <= 0) {
                return -1;
            }
            cursorQuery.moveToFirst();
            return cursorQuery.getInt(cursorQuery.getColumnIndex("_id"));
        } finally {
            cursorQuery.close();
        }
    }

    public final long EZpvd(android.content.Context context) {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("name", "OKX Reminder");
            contentValues.put("account_name", "OKX Reminder");
            contentValues.put("account_type", "LOCAL");
            contentValues.put("calendar_displayName", "OKX Reminder");
            contentValues.put("visible", (java.lang.Integer) 1);
            contentValues.put("calendar_color", (java.lang.Integer) (-16776961));
            contentValues.put("calendar_access_level", java.lang.Integer.valueOf(TypedValues.TransitionType.TYPE_DURATION));
            contentValues.put("sync_events", (java.lang.Integer) 1);
            contentValues.put("calendar_timezone", timeZone.getID());
            contentValues.put("ownerAccount", "OKX Reminder");
            contentValues.put("canOrganizerRespond", (java.lang.Integer) 0);
            android.net.Uri uriInsert = context.getContentResolver().insert(OLrzqt.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", "OKX Reminder").appendQueryParameter("account_type", "LOCAL").build(), contentValues);
            if (uriInsert != null) {
                return android.content.ContentUris.parseId(uriInsert);
            }
        } catch (java.lang.Exception unused) {
        }
        return -1L;
    }
}
