package o;

import com.onesignal.influence.domain.OSInfluenceChannel;
import com.onesignal.influence.domain.OSInfluenceType;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: o.yqh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57877yqh {
    public final InterfaceC57833ypq KWHzl;
    public final InterfaceC57757yoT OLrzqt;
    public final InterfaceC57738yoA copydefault;

    /* JADX INFO: renamed from: o.yqh$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OSInfluenceType.values().length];
            iArr[OSInfluenceType.DIRECT.ordinal()] = 1;
            iArr[OSInfluenceType.INDIRECT.ordinal()] = 2;
            AEQbTJ = iArr;
        }
    }

    public C57877yqh(@NotNull InterfaceC57738yoA interfaceC57738yoA, @NotNull InterfaceC57833ypq interfaceC57833ypq, @NotNull InterfaceC57757yoT interfaceC57757yoT) {
        Intrinsics.checkNotNullParameter(interfaceC57738yoA, "");
        Intrinsics.checkNotNullParameter(interfaceC57833ypq, "");
        Intrinsics.checkNotNullParameter(interfaceC57757yoT, "");
        this.copydefault = interfaceC57738yoA;
        this.KWHzl = interfaceC57833ypq;
        this.OLrzqt = interfaceC57757yoT;
    }

    public final boolean EZpvd() {
        InterfaceC57757yoT interfaceC57757yoT = this.OLrzqt;
        return interfaceC57757yoT.KWHzl(interfaceC57757yoT.copydefault(), this.OLrzqt.AEQbTJ(), false);
    }

    public final java.util.Set<java.lang.String> copydefault() {
        InterfaceC57757yoT interfaceC57757yoT = this.OLrzqt;
        return interfaceC57757yoT.KWHzl(interfaceC57757yoT.copydefault(), "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", (java.util.Set<java.lang.String>) null);
    }

    public final void EZpvd(java.util.Set<java.lang.String> set) {
        InterfaceC57757yoT interfaceC57757yoT = this.OLrzqt;
        java.lang.String strCopydefault = interfaceC57757yoT.copydefault();
        Intrinsics.copydefault(set);
        interfaceC57757yoT.AEQbTJ(strCopydefault, "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", set);
    }

    public final void KWHzl(@NotNull C57885yqp c57885yqp) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(c57885yqp, "");
            this.KWHzl.AEQbTJ("outcome", "timestamp = ?", new java.lang.String[]{java.lang.String.valueOf(c57885yqp.AEQbTJ())});
        }
    }

    public final void AEQbTJ(@NotNull C57885yqp c57885yqp) {
        C57890yqu c57890yquEZpvd;
        OSInfluenceType oSInfluenceType;
        OSInfluenceType oSInfluenceType2;
        C57890yqu c57890yquKWHzl;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(c57885yqp, "");
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            OSInfluenceType oSInfluenceType3 = OSInfluenceType.UNATTRIBUTED;
            C57891yqv c57891yqvEZpvd = c57885yqp.EZpvd();
            if (c57891yqvEZpvd == null || (c57890yquEZpvd = c57891yqvEZpvd.EZpvd()) == null) {
                oSInfluenceType2 = oSInfluenceType3;
            } else {
                JSONArray jSONArrayOLrzqt = c57890yquEZpvd.OLrzqt();
                if (jSONArrayOLrzqt != null && jSONArrayOLrzqt.length() > 0) {
                    oSInfluenceType = OSInfluenceType.DIRECT;
                    jSONArray = jSONArrayOLrzqt;
                } else {
                    oSInfluenceType = oSInfluenceType3;
                }
                JSONArray jSONArrayAEQbTJ = c57890yquEZpvd.AEQbTJ();
                if (jSONArrayAEQbTJ != null && jSONArrayAEQbTJ.length() > 0) {
                    oSInfluenceType3 = OSInfluenceType.DIRECT;
                    jSONArray2 = jSONArrayAEQbTJ;
                }
                oSInfluenceType2 = oSInfluenceType3;
                oSInfluenceType3 = oSInfluenceType;
            }
            C57891yqv c57891yqvEZpvd2 = c57885yqp.EZpvd();
            if (c57891yqvEZpvd2 != null && (c57890yquKWHzl = c57891yqvEZpvd2.KWHzl()) != null) {
                JSONArray jSONArrayOLrzqt2 = c57890yquKWHzl.OLrzqt();
                if (jSONArrayOLrzqt2 != null && jSONArrayOLrzqt2.length() > 0) {
                    oSInfluenceType3 = OSInfluenceType.INDIRECT;
                    jSONArray = jSONArrayOLrzqt2;
                }
                JSONArray jSONArrayAEQbTJ2 = c57890yquKWHzl.AEQbTJ();
                if (jSONArrayAEQbTJ2 != null && jSONArrayAEQbTJ2.length() > 0) {
                    oSInfluenceType2 = OSInfluenceType.INDIRECT;
                    jSONArray2 = jSONArrayAEQbTJ2;
                }
            }
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("notification_ids", jSONArray.toString());
            contentValues.put("iam_ids", jSONArray2.toString());
            java.lang.String string = oSInfluenceType3.toString();
            if (string == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            java.lang.String lowerCase = string.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            contentValues.put("notification_influence_type", lowerCase);
            java.lang.String string2 = oSInfluenceType2.toString();
            if (string2 == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            java.lang.String lowerCase2 = string2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            contentValues.put("iam_influence_type", lowerCase2);
            contentValues.put("name", c57885yqp.KWHzl());
            contentValues.put("weight", java.lang.Float.valueOf(c57885yqp.copydefault()));
            contentValues.put("timestamp", java.lang.Long.valueOf(c57885yqp.AEQbTJ()));
            this.KWHzl.EZpvd("outcome", null, contentValues);
        }
    }

    public final java.util.List<C57885yqp> OLrzqt() {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList();
            android.database.Cursor cursor = null;
            try {
                android.database.Cursor cursorKWHzl = this.KWHzl.KWHzl("outcome", null, null, null, null, null, null);
                try {
                    if (cursorKWHzl.moveToFirst()) {
                        do {
                            java.lang.String string = cursorKWHzl.getString(cursorKWHzl.getColumnIndex("notification_influence_type"));
                            OSInfluenceType.TaskDescription taskDescription = OSInfluenceType.Companion;
                            OSInfluenceType oSInfluenceTypeAEQbTJ = taskDescription.AEQbTJ(string);
                            OSInfluenceType oSInfluenceTypeAEQbTJ2 = taskDescription.AEQbTJ(cursorKWHzl.getString(cursorKWHzl.getColumnIndex("iam_influence_type")));
                            java.lang.String string2 = cursorKWHzl.getString(cursorKWHzl.getColumnIndex("notification_ids"));
                            if (string2 == null) {
                                string2 = HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
                            }
                            java.lang.String string3 = cursorKWHzl.getString(cursorKWHzl.getColumnIndex("iam_ids"));
                            if (string3 == null) {
                                string3 = HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
                            }
                            java.lang.String str = string3;
                            java.lang.String string4 = cursorKWHzl.getString(cursorKWHzl.getColumnIndex("name"));
                            float f = cursorKWHzl.getFloat(cursorKWHzl.getColumnIndex("weight"));
                            long j = cursorKWHzl.getLong(cursorKWHzl.getColumnIndex("timestamp"));
                            try {
                                C57890yqu c57890yqu = new C57890yqu(null, null, 3, null);
                                C57890yqu c57890yqu2 = new C57890yqu(null, null, 3, null);
                                C57891yqv c57891yqvKWHzl = KWHzl(oSInfluenceTypeAEQbTJ, c57890yqu, c57890yqu2, string2);
                                OLrzqt(oSInfluenceTypeAEQbTJ2, c57890yqu, c57890yqu2, str, c57891yqvKWHzl);
                                if (c57891yqvKWHzl == null) {
                                    c57891yqvKWHzl = new C57891yqv(null, null);
                                }
                                Intrinsics.checkNotNullExpressionValue(string4, "");
                                arrayList.add(new C57885yqp(string4, c57891yqvKWHzl, f, j));
                            } catch (JSONException e) {
                                this.copydefault.KWHzl("Generating JSONArray from notifications ids outcome:JSON Failed.", e);
                            }
                        } while (cursorKWHzl.moveToNext());
                    }
                    if (!cursorKWHzl.isClosed()) {
                        cursorKWHzl.close();
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    cursor = cursorKWHzl;
                    if (cursor != null && !cursor.isClosed()) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        }
        return arrayList;
    }

    public final C57891yqv KWHzl(OSInfluenceType oSInfluenceType, C57890yqu c57890yqu, C57890yqu c57890yqu2, java.lang.String str) {
        C57891yqv c57891yqv;
        int i = Application.AEQbTJ[oSInfluenceType.ordinal()];
        if (i == 1) {
            c57890yqu.AEQbTJ(new JSONArray(str));
            c57891yqv = new C57891yqv(c57890yqu, null);
        } else {
            if (i != 2) {
                return null;
            }
            c57890yqu2.AEQbTJ(new JSONArray(str));
            c57891yqv = new C57891yqv(null, c57890yqu2);
        }
        return c57891yqv;
    }

    public final C57891yqv OLrzqt(OSInfluenceType oSInfluenceType, C57890yqu c57890yqu, C57890yqu c57890yqu2, java.lang.String str, C57891yqv c57891yqv) {
        int i = Application.AEQbTJ[oSInfluenceType.ordinal()];
        if (i == 1) {
            c57890yqu.KWHzl(new JSONArray(str));
            C57891yqv c57891yqvEZpvd = c57891yqv == null ? null : c57891yqv.EZpvd(c57890yqu);
            return c57891yqvEZpvd == null ? new C57891yqv(c57890yqu, null) : c57891yqvEZpvd;
        }
        if (i != 2) {
            return c57891yqv;
        }
        c57890yqu2.KWHzl(new JSONArray(str));
        C57891yqv c57891yqvOLrzqt = c57891yqv == null ? null : c57891yqv.OLrzqt(c57890yqu2);
        return c57891yqvOLrzqt == null ? new C57891yqv(null, c57890yqu2) : c57891yqvOLrzqt;
    }

    public final void AEQbTJ(java.util.List<C57888yqs> list, JSONArray jSONArray, OSInfluenceChannel oSInfluenceChannel) {
        int length;
        if (jSONArray == null || (length = jSONArray.length()) <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            try {
                java.lang.String string = jSONArray.getString(i);
                Intrinsics.checkNotNullExpressionValue(string, "");
                list.add(new C57888yqs(string, oSInfluenceChannel));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (i2 >= length) {
                return;
            } else {
                i = i2;
            }
        }
    }

    public final void EZpvd(java.util.List<C57888yqs> list, C57890yqu c57890yqu) {
        if (c57890yqu == null) {
            return;
        }
        JSONArray jSONArrayAEQbTJ = c57890yqu.AEQbTJ();
        JSONArray jSONArrayOLrzqt = c57890yqu.OLrzqt();
        AEQbTJ(list, jSONArrayAEQbTJ, OSInfluenceChannel.IAM);
        AEQbTJ(list, jSONArrayOLrzqt, OSInfluenceChannel.NOTIFICATION);
    }

    public final void copydefault(@NotNull C57885yqp c57885yqp) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(c57885yqp, "");
            this.copydefault.OLrzqt(Intrinsics.KWHzl("OneSignal saveUniqueOutcomeEventParams: ", c57885yqp));
            java.lang.String strKWHzl = c57885yqp.KWHzl();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            C57891yqv c57891yqvEZpvd = c57885yqp.EZpvd();
            C57890yqu c57890yquEZpvd = c57891yqvEZpvd == null ? null : c57891yqvEZpvd.EZpvd();
            C57891yqv c57891yqvEZpvd2 = c57885yqp.EZpvd();
            C57890yqu c57890yquKWHzl = c57891yqvEZpvd2 == null ? null : c57891yqvEZpvd2.KWHzl();
            EZpvd(arrayList, c57890yquEZpvd);
            EZpvd(arrayList, c57890yquKWHzl);
            for (C57888yqs c57888yqs : arrayList) {
                android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put("channel_influence_id", c57888yqs.EZpvd());
                contentValues.put("channel_type", c57888yqs.OLrzqt().toString());
                contentValues.put("name", strKWHzl);
                this.KWHzl.EZpvd("cached_unique_outcome", null, contentValues);
            }
        }
    }

    public final java.util.List<C57870yqa> OLrzqt(@NotNull java.lang.String str, @NotNull java.util.List<C57870yqa> list) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            arrayList = new java.util.ArrayList();
            android.database.Cursor cursorCopydefault = null;
            try {
                try {
                    for (C57870yqa c57870yqa : list) {
                        JSONArray jSONArray = new JSONArray();
                        JSONArray jSONArrayOLrzqt = c57870yqa.OLrzqt();
                        if (jSONArrayOLrzqt != null) {
                            int length = jSONArrayOLrzqt.length();
                            if (length > 0) {
                                int i = 0;
                                while (true) {
                                    int i2 = i + 1;
                                    java.lang.String string = jSONArrayOLrzqt.getString(i);
                                    cursorCopydefault = this.KWHzl.copydefault("cached_unique_outcome", new java.lang.String[0], "channel_influence_id = ? AND channel_type = ? AND name = ?", new java.lang.String[]{string, c57870yqa.AEQbTJ().toString(), str}, null, null, null, "1");
                                    if (cursorCopydefault.getCount() == 0) {
                                        jSONArray.put(string);
                                    }
                                    if (i2 >= length) {
                                        break;
                                    }
                                    i = i2;
                                }
                            }
                            if (jSONArray.length() > 0) {
                                C57870yqa c57870yqaKWHzl = c57870yqa.KWHzl();
                                c57870yqaKWHzl.KWHzl(jSONArray);
                                arrayList.add(c57870yqaKWHzl);
                            }
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                    if (cursorCopydefault != null && !cursorCopydefault.isClosed()) {
                    }
                }
                if (cursorCopydefault != null && !cursorCopydefault.isClosed()) {
                    cursorCopydefault.close();
                }
            } catch (java.lang.Throwable th) {
                if (cursorCopydefault != null && !cursorCopydefault.isClosed()) {
                    cursorCopydefault.close();
                }
                throw th;
            }
        }
        return arrayList;
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("NOT EXISTS(SELECT NULL FROM ");
            sb.append(str);
            sb.append(" n WHERE n.");
            sb.append(str2);
            sb.append(" = channel_influence_id AND channel_type = \"");
            java.lang.String string = OSInfluenceChannel.NOTIFICATION.toString();
            java.util.Locale locale = java.util.Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "");
            if (string != null) {
                java.lang.String lowerCase = string.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                sb.append(lowerCase);
                sb.append("\")");
                this.KWHzl.AEQbTJ("cached_unique_outcome", sb.toString(), null);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
    }
}
