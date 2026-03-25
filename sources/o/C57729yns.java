package o;

import android.R;
import android.graphics.BitmapFactory;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.bytedance.applog.encryptor.IEncryptorType;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.just.agentweb.DefaultWebClient;
import com.okinc.productmatrix.biz.bean.ProductMatrixRemoteConfig;
import com.onesignal.NotificationDismissReceiver;
import com.onesignal.NotificationOpenedReceiver;
import com.onesignal.OSThrowable;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C57720ynj;
import o.C57792ypB;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yns, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57729yns {
    public static android.content.Context AEQbTJ;
    public static java.lang.String AhwBna;
    public static java.lang.Integer KWHzl;
    public static android.content.res.Resources OLrzqt;
    public static java.lang.Class<?> copydefault = NotificationOpenedReceiver.class;
    public static java.lang.Class<?> EZpvd = NotificationDismissReceiver.class;

    public static int AEQbTJ(int i) {
        if (i > 9) {
            return 2;
        }
        if (i > 7) {
            return 1;
        }
        if (i > 4) {
            return 0;
        }
        return i > 2 ? -1 : -2;
    }

    /* JADX INFO: renamed from: o.yns$ActionBar */
    public static class ActionBar {
        public NotificationCompat.Builder OLrzqt;
        public boolean copydefault;

        private ActionBar() {
        }
    }

    public static void EZpvd() {
        KWHzl = 2;
    }

    public static void EZpvd(android.content.Context context) {
        AEQbTJ = context;
        AhwBna = context.getPackageName();
        OLrzqt = AEQbTJ.getResources();
    }

    public static boolean copydefault(C57745yoH c57745yoH) {
        EZpvd(c57745yoH.copydefault());
        KWHzl();
        EZpvd();
        return OLrzqt(c57745yoH);
    }

    public static boolean KWHzl(C57745yoH c57745yoH) {
        EZpvd(c57745yoH.copydefault());
        return OLrzqt(c57745yoH);
    }

    public static void KWHzl() {
        if (OSUtils.fIwbmz()) {
            throw new OSThrowable.OSMainThreadException("Process for showing a notification should never been done on Main Thread!");
        }
    }

    public static java.lang.CharSequence copydefault() {
        android.content.pm.ApplicationInfo applicationInfoKWHzl = C57721ynk.Companion.KWHzl(AEQbTJ);
        return applicationInfoKWHzl == null ? "" : AEQbTJ.getPackageManager().getApplicationLabel(applicationInfoKWHzl);
    }

    public static java.lang.CharSequence OLrzqt(JSONObject jSONObject) {
        java.lang.String strOptString = jSONObject.optString("title", null);
        return strOptString != null ? strOptString : copydefault();
    }

    public static android.app.PendingIntent AEQbTJ(int i, android.content.Intent intent) {
        return android.app.PendingIntent.getBroadcast(AEQbTJ, i, intent, 201326592);
    }

    public static android.content.Intent OLrzqt(int i) {
        return new android.content.Intent(AEQbTJ, EZpvd).putExtra("androidNotificationId", i).putExtra("dismissed", true);
    }

    public static ActionBar AEQbTJ(C57745yoH c57745yoH) {
        NotificationCompat.Builder builder;
        JSONObject jSONObjectOLrzqt = c57745yoH.OLrzqt();
        ActionBar actionBar = new ActionBar();
        try {
            builder = new NotificationCompat.Builder(AEQbTJ, C57690ynF.EZpvd(c57745yoH));
        } catch (java.lang.Throwable unused) {
            builder = new NotificationCompat.Builder(AEQbTJ);
        }
        java.lang.String strOptString = jSONObjectOLrzqt.optString(ProductMatrixRemoteConfig.ALERT, null);
        builder.setAutoCancel(true).setSmallIcon(EZpvd(jSONObjectOLrzqt)).setStyle(new NotificationCompat.BigTextStyle().bigText(strOptString)).setContentText(strOptString).setTicker(strOptString);
        if (!jSONObjectOLrzqt.optString("title").equals("")) {
            builder.setContentTitle(OLrzqt(jSONObjectOLrzqt));
        }
        try {
            java.math.BigInteger bigIntegerAEQbTJ = AEQbTJ(jSONObjectOLrzqt);
            if (bigIntegerAEQbTJ != null) {
                builder.setColor(bigIntegerAEQbTJ.intValue());
            }
        } catch (java.lang.Throwable unused2) {
        }
        try {
            builder.setVisibility(jSONObjectOLrzqt.has("vis") ? java.lang.Integer.parseInt(jSONObjectOLrzqt.optString("vis")) : 1);
        } catch (java.lang.Throwable unused3) {
        }
        android.graphics.Bitmap bitmapKWHzl = KWHzl(jSONObjectOLrzqt);
        if (bitmapKWHzl != null) {
            actionBar.copydefault = true;
            builder.setLargeIcon(bitmapKWHzl);
        }
        android.graphics.Bitmap bitmapKWHzl2 = KWHzl(jSONObjectOLrzqt.optString("bicon", null));
        if (bitmapKWHzl2 != null) {
            builder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmapKWHzl2).setSummaryText(strOptString));
        }
        if (c57745yoH.gEmmrt() != null) {
            try {
                builder.setWhen(c57745yoH.gEmmrt().longValue() * 1000);
            } catch (java.lang.Throwable unused4) {
            }
        }
        copydefault(jSONObjectOLrzqt, builder);
        actionBar.OLrzqt = builder;
        return actionBar;
    }

    public static void copydefault(JSONObject jSONObject, NotificationCompat.Builder builder) {
        int i;
        int iAEQbTJ = AEQbTJ(jSONObject.optInt("pri", 6));
        builder.setPriority(iAEQbTJ);
        if (iAEQbTJ < 0) {
            return;
        }
        if (jSONObject.has("ledc") && jSONObject.optInt("led", 1) == 1) {
            try {
                builder.setLights(new java.math.BigInteger(jSONObject.optString("ledc"), 16).intValue(), 2000, 5000);
                i = 0;
            } catch (java.lang.Throwable unused) {
                i = 4;
            }
        } else {
            i = 4;
        }
        if (jSONObject.optInt("vib", 1) == 1) {
            if (jSONObject.has("vib_pt")) {
                long[] jArrEZpvd = OSUtils.EZpvd(jSONObject);
                if (jArrEZpvd != null) {
                    builder.setVibrate(jArrEZpvd);
                }
            } else {
                i |= 2;
            }
        }
        if (copydefault(jSONObject)) {
            android.net.Uri uriKWHzl = OSUtils.KWHzl(AEQbTJ, jSONObject.optString(RemoteMessageConst.Notification.SOUND, null));
            if (uriKWHzl != null) {
                builder.setSound(uriKWHzl);
            } else {
                i |= 1;
            }
        }
        builder.setDefaults(i);
    }

    public static void AEQbTJ(NotificationCompat.Builder builder) {
        builder.setOnlyAlertOnce(true).setDefaults(0).setSound(null).setVibrate(null).setTicker(null);
    }

    public static boolean OLrzqt(C57745yoH c57745yoH) throws java.lang.Throwable {
        android.app.Notification notificationOLrzqt;
        int iIntValue = c57745yoH.AEQbTJ().intValue();
        JSONObject jSONObjectOLrzqt = c57745yoH.OLrzqt();
        java.lang.String strOptString = jSONObjectOLrzqt.optString("grp", null);
        C57688ynD c57688ynD = new C57688ynD(AEQbTJ);
        new java.util.ArrayList();
        java.util.ArrayList<android.service.notification.StatusBarNotification> arrayListEZpvd = C57836ypt.EZpvd(AEQbTJ);
        if (strOptString == null && arrayListEZpvd.size() >= 3) {
            strOptString = C57836ypt.OLrzqt();
            C57836ypt.copydefault(AEQbTJ, arrayListEZpvd);
        }
        ActionBar actionBarAEQbTJ = AEQbTJ(c57745yoH);
        NotificationCompat.Builder builder = actionBarAEQbTJ.OLrzqt;
        OLrzqt(jSONObjectOLrzqt, c57688ynD, builder, iIntValue, null);
        try {
            EZpvd(jSONObjectOLrzqt, builder);
        } catch (java.lang.Throwable th) {
            OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "Could not set background notification image!", th);
        }
        OLrzqt(c57745yoH, builder);
        if (c57745yoH.values()) {
            AEQbTJ(builder);
        }
        C57700ynP.OLrzqt(AEQbTJ, strOptString != null ? 2 : 1);
        if (strOptString != null) {
            EZpvd(builder, c57688ynD, jSONObjectOLrzqt, strOptString, iIntValue);
            notificationOLrzqt = copydefault(c57745yoH, builder);
            if (strOptString.equals(C57836ypt.OLrzqt())) {
                EZpvd(c57745yoH, c57688ynD, arrayListEZpvd.size() + 1);
            } else {
                KWHzl(c57745yoH, actionBarAEQbTJ);
            }
        } else {
            notificationOLrzqt = OLrzqt(builder, c57688ynD, jSONObjectOLrzqt, iIntValue);
        }
        copydefault(actionBarAEQbTJ, notificationOLrzqt);
        NotificationManagerCompat.from(AEQbTJ).notify(iIntValue, notificationOLrzqt);
        if (Build.VERSION.SDK_INT >= 26) {
            return C57836ypt.KWHzl(AEQbTJ, notificationOLrzqt.getChannelId());
        }
        return true;
    }

    public static android.app.Notification OLrzqt(NotificationCompat.Builder builder, C57688ynD c57688ynD, JSONObject jSONObject, int i) {
        java.security.SecureRandom secureRandom = new java.security.SecureRandom();
        builder.setContentIntent(c57688ynD.OLrzqt(secureRandom.nextInt(), c57688ynD.EZpvd(i).putExtra("onesignalData", jSONObject.toString())));
        builder.setDeleteIntent(AEQbTJ(secureRandom.nextInt(), OLrzqt(i)));
        return builder.build();
    }

    public static void EZpvd(NotificationCompat.Builder builder, C57688ynD c57688ynD, JSONObject jSONObject, java.lang.String str, int i) {
        java.security.SecureRandom secureRandom = new java.security.SecureRandom();
        builder.setContentIntent(c57688ynD.OLrzqt(secureRandom.nextInt(), c57688ynD.EZpvd(i).putExtra("onesignalData", jSONObject.toString()).putExtra("grp", str)));
        builder.setDeleteIntent(AEQbTJ(secureRandom.nextInt(), OLrzqt(i).putExtra("grp", str)));
        builder.setGroup(str);
        try {
            builder.setGroupAlertBehavior(KWHzl.intValue());
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void OLrzqt(C57745yoH c57745yoH, NotificationCompat.Builder builder) {
        if (c57745yoH.isConnected()) {
            try {
                java.lang.reflect.Field declaredField = NotificationCompat.Builder.class.getDeclaredField("mNotification");
                declaredField.setAccessible(true);
                android.app.Notification notification = (android.app.Notification) declaredField.get(builder);
                c57745yoH.KWHzl(java.lang.Integer.valueOf(notification.flags));
                c57745yoH.AEQbTJ(notification.sound);
                builder.extend(c57745yoH.valueOf().valueOf());
                android.app.Notification notification2 = (android.app.Notification) declaredField.get(builder);
                java.lang.reflect.Field declaredField2 = NotificationCompat.Builder.class.getDeclaredField("mContentText");
                declaredField2.setAccessible(true);
                java.lang.CharSequence charSequence = (java.lang.CharSequence) declaredField2.get(builder);
                java.lang.reflect.Field declaredField3 = NotificationCompat.Builder.class.getDeclaredField("mContentTitle");
                declaredField3.setAccessible(true);
                java.lang.CharSequence charSequence2 = (java.lang.CharSequence) declaredField3.get(builder);
                c57745yoH.AEQbTJ(charSequence);
                c57745yoH.copydefault(charSequence2);
                if (c57745yoH.values()) {
                    return;
                }
                c57745yoH.EZpvd(java.lang.Integer.valueOf(notification2.flags));
                c57745yoH.KWHzl(notification2.sound);
            } catch (java.lang.Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static android.app.Notification copydefault(C57745yoH c57745yoH, NotificationCompat.Builder builder) {
        return builder.build();
    }

    public static void copydefault(ActionBar actionBar, android.app.Notification notification) {
        if (actionBar.copydefault) {
            try {
                java.lang.Object objNewInstance = java.lang.Class.forName("android.app.MiuiNotification").newInstance();
                java.lang.reflect.Field declaredField = objNewInstance.getClass().getDeclaredField("customizedIcon");
                declaredField.setAccessible(true);
                declaredField.set(objNewInstance, java.lang.Boolean.TRUE);
                java.lang.reflect.Field field = notification.getClass().getField("extraNotification");
                field.setAccessible(true);
                field.set(notification, objNewInstance);
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static void EZpvd(C57745yoH c57745yoH) {
        EZpvd(c57745yoH.copydefault());
        KWHzl(c57745yoH, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02f6  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void KWHzl(C57745yoH c57745yoH, ActionBar actionBar) throws java.lang.Throwable {
        android.database.Cursor cursor;
        android.database.Cursor cursorKWHzl;
        java.lang.String str;
        JSONObject jSONObject;
        java.util.ArrayList arrayList;
        java.lang.Integer numValueOf;
        android.app.Notification notificationBuild;
        java.lang.CharSequence charSequenceReplace;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6 = "android_notification_id";
        java.lang.String str7 = "message";
        java.lang.String str8 = "is_summary";
        boolean zValues = c57745yoH.values();
        JSONObject jSONObjectOLrzqt = c57745yoH.OLrzqt();
        C57688ynD c57688ynD = new C57688ynD(AEQbTJ);
        java.lang.String strOptString = jSONObjectOLrzqt.optString("grp", null);
        java.security.SecureRandom secureRandom = new java.security.SecureRandom();
        android.app.PendingIntent pendingIntentAEQbTJ = AEQbTJ(secureRandom.nextInt(), OLrzqt(0).putExtra("summary", strOptString));
        C57830ypn c57830ypnKWHzl = C57830ypn.KWHzl(AEQbTJ);
        try {
            java.lang.String[] strArr = new java.lang.String[5];
            strArr[0] = "android_notification_id";
            try {
                strArr[1] = "full_data";
                strArr[2] = "is_summary";
                strArr[3] = "title";
                strArr[4] = "message";
                java.lang.String[] strArr2 = {strOptString};
                if (zValues) {
                    str = "group_id = ? AND dismissed = 0 AND opened = 0";
                } else {
                    try {
                        str = "group_id = ? AND dismissed = 0 AND opened = 0 AND android_notification_id <> " + c57745yoH.AEQbTJ();
                    } catch (java.lang.Throwable th) {
                        th = th;
                        cursorKWHzl = null;
                        if (cursorKWHzl != null && !cursorKWHzl.isClosed()) {
                            cursorKWHzl.close();
                        }
                        throw th;
                    }
                }
                cursorKWHzl = c57830ypnKWHzl.KWHzl(RemoteMessageConst.NOTIFICATION, strArr, str, strArr2, null, null, "_id DESC");
            } catch (java.lang.Throwable th2) {
                th = th2;
                cursor = null;
                cursorKWHzl = cursor;
                if (cursorKWHzl != null) {
                }
                throw th;
            }
            try {
                java.lang.String str9 = "";
                if (cursorKWHzl.moveToFirst()) {
                    arrayList = new java.util.ArrayList();
                    java.lang.String string = null;
                    numValueOf = null;
                    while (true) {
                        java.lang.String str10 = str8;
                        if (cursorKWHzl.getInt(cursorKWHzl.getColumnIndex(str8)) == 1) {
                            numValueOf = java.lang.Integer.valueOf(cursorKWHzl.getInt(cursorKWHzl.getColumnIndex(str6)));
                            str3 = str6;
                            str4 = str7;
                        } else {
                            java.lang.String string2 = cursorKWHzl.getString(cursorKWHzl.getColumnIndex("title"));
                            if (string2 == null) {
                                str2 = "";
                            } else {
                                str2 = string2 + " ";
                            }
                            str3 = str6;
                            str4 = str7;
                            android.text.SpannableString spannableString = new android.text.SpannableString(str2 + cursorKWHzl.getString(cursorKWHzl.getColumnIndex(str7)));
                            if (str2.length() > 0) {
                                spannableString.setSpan(new android.text.style.StyleSpan(1), 0, str2.length(), 0);
                            }
                            arrayList.add(spannableString);
                            if (string == null) {
                                string = cursorKWHzl.getString(cursorKWHzl.getColumnIndex("full_data"));
                            }
                        }
                        str5 = string;
                        if (!cursorKWHzl.moveToNext()) {
                            break;
                        }
                        string = str5;
                        str8 = str10;
                        str6 = str3;
                        str7 = str4;
                    }
                    if (!zValues || str5 == null) {
                        jSONObject = jSONObjectOLrzqt;
                    } else {
                        try {
                            jSONObject = new JSONObject(str5);
                        } catch (JSONException e) {
                            e.printStackTrace();
                            jSONObject = jSONObjectOLrzqt;
                        }
                    }
                } else {
                    jSONObject = jSONObjectOLrzqt;
                    arrayList = null;
                    numValueOf = null;
                }
                if (!cursorKWHzl.isClosed()) {
                    cursorKWHzl.close();
                }
                if (numValueOf == null) {
                    numValueOf = java.lang.Integer.valueOf(secureRandom.nextInt());
                    EZpvd(c57830ypnKWHzl, strOptString, numValueOf.intValue());
                }
                android.app.PendingIntent pendingIntentOLrzqt = c57688ynD.OLrzqt(secureRandom.nextInt(), EZpvd(numValueOf.intValue(), c57688ynD, jSONObject, strOptString));
                if (arrayList != null && ((zValues && arrayList.size() > 1) || (!zValues && arrayList.size() > 0))) {
                    int size = arrayList.size() + (!zValues ? 1 : 0);
                    java.lang.String strOptString2 = jSONObject.optString("grp_msg", null);
                    if (strOptString2 == null) {
                        charSequenceReplace = size + " new messages";
                    } else {
                        charSequenceReplace = strOptString2.replace("$[notif_count]", "" + size);
                    }
                    NotificationCompat.Builder builder = AEQbTJ(c57745yoH).OLrzqt;
                    if (zValues) {
                        AEQbTJ(builder);
                    } else {
                        if (c57745yoH.AYXKKw() != null) {
                            builder.setSound(c57745yoH.AYXKKw());
                        }
                        if (c57745yoH.djBIcL() != null) {
                            builder.setDefaults(c57745yoH.djBIcL().intValue());
                        }
                    }
                    builder.setContentIntent(pendingIntentOLrzqt).setDeleteIntent(pendingIntentAEQbTJ).setContentTitle(copydefault()).setContentText(charSequenceReplace).setNumber(size).setSmallIcon(OLrzqt()).setLargeIcon(AEQbTJ()).setOnlyAlertOnce(zValues).setAutoCancel(false).setGroup(strOptString).setGroupSummary(true);
                    try {
                        builder.setGroupAlertBehavior(KWHzl.intValue());
                    } catch (java.lang.Throwable unused) {
                    }
                    if (!zValues) {
                        builder.setTicker(charSequenceReplace);
                    }
                    NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
                    if (!zValues) {
                        java.lang.String string3 = c57745yoH.AhwBna() != null ? c57745yoH.AhwBna().toString() : null;
                        if (string3 != null) {
                            str9 = string3 + " ";
                        }
                        android.text.SpannableString spannableString2 = new android.text.SpannableString(str9 + c57745yoH.KWHzl().toString());
                        if (str9.length() > 0) {
                            spannableString2.setSpan(new android.text.style.StyleSpan(1), 0, str9.length(), 0);
                        }
                        inboxStyle.addLine(spannableString2);
                    }
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        inboxStyle.addLine((android.text.SpannableString) it.next());
                    }
                    inboxStyle.setBigContentTitle(charSequenceReplace);
                    builder.setStyle(inboxStyle);
                    notificationBuild = builder.build();
                } else {
                    NotificationCompat.Builder builder2 = actionBar.OLrzqt;
                    builder2.mActions.clear();
                    OLrzqt(jSONObject, c57688ynD, builder2, numValueOf.intValue(), strOptString);
                    builder2.setContentIntent(pendingIntentOLrzqt).setDeleteIntent(pendingIntentAEQbTJ).setOnlyAlertOnce(zValues).setAutoCancel(false).setGroup(strOptString).setGroupSummary(true);
                    try {
                        builder2.setGroupAlertBehavior(KWHzl.intValue());
                    } catch (java.lang.Throwable unused2) {
                    }
                    notificationBuild = builder2.build();
                    copydefault(actionBar, notificationBuild);
                }
                NotificationManagerCompat.from(AEQbTJ).notify(numValueOf.intValue(), notificationBuild);
            } catch (java.lang.Throwable th3) {
                th = th3;
                if (cursorKWHzl != null) {
                    cursorKWHzl.close();
                }
                throw th;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            cursor = null;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void EZpvd(C57745yoH c57745yoH, C57688ynD c57688ynD, int i) {
        JSONObject jSONObjectOLrzqt = c57745yoH.OLrzqt();
        java.security.SecureRandom secureRandom = new java.security.SecureRandom();
        java.lang.String strOLrzqt = C57836ypt.OLrzqt();
        java.lang.String str = i + " new messages";
        int iKWHzl = C57836ypt.KWHzl();
        EZpvd(C57830ypn.KWHzl(AEQbTJ), strOLrzqt, iKWHzl);
        android.app.PendingIntent pendingIntentOLrzqt = c57688ynD.OLrzqt(secureRandom.nextInt(), EZpvd(iKWHzl, c57688ynD, jSONObjectOLrzqt, strOLrzqt));
        android.app.PendingIntent pendingIntentAEQbTJ = AEQbTJ(secureRandom.nextInt(), OLrzqt(0).putExtra("summary", strOLrzqt));
        NotificationCompat.Builder builder = AEQbTJ(c57745yoH).OLrzqt;
        if (c57745yoH.AYXKKw() != null) {
            builder.setSound(c57745yoH.AYXKKw());
        }
        if (c57745yoH.djBIcL() != null) {
            builder.setDefaults(c57745yoH.djBIcL().intValue());
        }
        builder.setContentIntent(pendingIntentOLrzqt).setDeleteIntent(pendingIntentAEQbTJ).setContentTitle(copydefault()).setContentText(str).setNumber(i).setSmallIcon(OLrzqt()).setLargeIcon(AEQbTJ()).setOnlyAlertOnce(true).setAutoCancel(false).setGroup(strOLrzqt).setGroupSummary(true);
        try {
            builder.setGroupAlertBehavior(KWHzl.intValue());
        } catch (java.lang.Throwable unused) {
        }
        NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
        inboxStyle.setBigContentTitle(str);
        builder.setStyle(inboxStyle);
        NotificationManagerCompat.from(AEQbTJ).notify(iKWHzl, builder.build());
    }

    public static android.content.Intent EZpvd(int i, C57688ynD c57688ynD, JSONObject jSONObject, java.lang.String str) {
        return c57688ynD.EZpvd(i).putExtra("onesignalData", jSONObject.toString()).putExtra("summary", str);
    }

    public static void EZpvd(C57830ypn c57830ypn, java.lang.String str, int i) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("android_notification_id", java.lang.Integer.valueOf(i));
        contentValues.put("group_id", str);
        contentValues.put("is_summary", (java.lang.Integer) 1);
        c57830ypn.AEQbTJ(RemoteMessageConst.NOTIFICATION, (java.lang.String) null, contentValues);
    }

    public static void EZpvd(JSONObject jSONObject, NotificationCompat.Builder builder) throws java.lang.Throwable {
        android.graphics.Bitmap bitmapCopydefault;
        JSONObject jSONObject2;
        java.lang.String string;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.VERBOSE, "Cannot use background images in notifications for device on version: " + i);
            return;
        }
        java.lang.String strOptString = jSONObject.optString("bg_img", null);
        if (strOptString != null) {
            jSONObject2 = new JSONObject(strOptString);
            bitmapCopydefault = KWHzl(jSONObject2.optString("img", null));
        } else {
            bitmapCopydefault = null;
            jSONObject2 = null;
        }
        if (bitmapCopydefault == null) {
            bitmapCopydefault = copydefault("onesignal_bgimage_default_image");
        }
        if (bitmapCopydefault != null) {
            android.widget.RemoteViews remoteViews = new android.widget.RemoteViews(AEQbTJ.getPackageName(), C57792ypB.Activity.copydefault);
            remoteViews.setTextViewText(C57792ypB.TaskDescription.OLrzqt, OLrzqt(jSONObject));
            remoteViews.setTextViewText(C57792ypB.TaskDescription.KWHzl, jSONObject.optString(ProductMatrixRemoteConfig.ALERT));
            AEQbTJ(remoteViews, jSONObject2, C57792ypB.TaskDescription.OLrzqt, "tc", "onesignal_bgimage_notif_title_color");
            AEQbTJ(remoteViews, jSONObject2, C57792ypB.TaskDescription.KWHzl, "bc", "onesignal_bgimage_notif_body_color");
            if (jSONObject2 != null && jSONObject2.has("img_align")) {
                string = jSONObject2.getString("img_align");
            } else {
                int identifier = OLrzqt.getIdentifier("onesignal_bgimage_notif_image_align", "string", AhwBna);
                string = identifier != 0 ? OLrzqt.getString(identifier) : null;
            }
            if (TtmlNode.RIGHT.equals(string)) {
                remoteViews.setViewPadding(C57792ypB.TaskDescription.copydefault, -5000, 0, 0, 0);
                remoteViews.setImageViewBitmap(C57792ypB.TaskDescription.EZpvd, bitmapCopydefault);
                remoteViews.setViewVisibility(C57792ypB.TaskDescription.EZpvd, 0);
                remoteViews.setViewVisibility(C57792ypB.TaskDescription.AEQbTJ, 2);
            } else {
                remoteViews.setImageViewBitmap(C57792ypB.TaskDescription.AEQbTJ, bitmapCopydefault);
            }
            builder.setContent(remoteViews);
            builder.setStyle(null);
        }
    }

    public static void AEQbTJ(android.widget.RemoteViews remoteViews, JSONObject jSONObject, int i, java.lang.String str, java.lang.String str2) {
        java.lang.Integer numOLrzqt = OLrzqt(jSONObject, str);
        if (numOLrzqt != null) {
            remoteViews.setTextColor(i, numOLrzqt.intValue());
            return;
        }
        int identifier = OLrzqt.getIdentifier(str2, "color", AhwBna);
        if (identifier != 0) {
            remoteViews.setTextColor(i, C57720ynj.Activity.OLrzqt(AEQbTJ, identifier));
        }
    }

    public static java.lang.Integer OLrzqt(JSONObject jSONObject, java.lang.String str) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.has(str)) {
                return java.lang.Integer.valueOf(new java.math.BigInteger(jSONObject.optString(str), 16).intValue());
            }
            return null;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static android.graphics.Bitmap KWHzl(JSONObject jSONObject) {
        android.graphics.Bitmap bitmapKWHzl = KWHzl(jSONObject.optString("licon"));
        if (bitmapKWHzl == null) {
            bitmapKWHzl = copydefault("ic_onesignal_large_icon_default");
        }
        if (bitmapKWHzl == null) {
            return null;
        }
        return KWHzl(bitmapKWHzl);
    }

    public static android.graphics.Bitmap AEQbTJ() {
        return KWHzl(copydefault("ic_onesignal_large_icon_default"));
    }

    public static android.graphics.Bitmap KWHzl(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int dimension = (int) OLrzqt.getDimension(android.R.dimen.notification_large_icon_height);
            int dimension2 = (int) OLrzqt.getDimension(android.R.dimen.notification_large_icon_width);
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();
            if (width <= dimension2 && height <= dimension) {
                return bitmap;
            }
            if (height > width) {
                dimension2 = (int) (dimension * (width / height));
            } else if (width > height) {
                dimension = (int) (dimension2 * (height / width));
            }
            return android.graphics.Bitmap.createScaledBitmap(bitmap, dimension2, dimension, true);
        } catch (java.lang.Throwable unused) {
            return bitmap;
        }
    }

    public static android.graphics.Bitmap copydefault(java.lang.String str) {
        android.graphics.Bitmap bitmapDecodeStream;
        try {
            bitmapDecodeStream = BitmapFactory.decodeStream(AEQbTJ.getAssets().open(str));
        } catch (java.lang.Throwable unused) {
            bitmapDecodeStream = null;
        }
        if (bitmapDecodeStream != null) {
            return bitmapDecodeStream;
        }
        try {
            for (java.lang.String str2 : java.util.Arrays.asList(".png", ".webp", ".jpg", ".gif", ".bmp")) {
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(AEQbTJ.getAssets().open(str + str2));
                } catch (java.lang.Throwable unused2) {
                }
                if (bitmapDecodeStream != null) {
                    return bitmapDecodeStream;
                }
            }
            int iAEQbTJ = AEQbTJ(str);
            if (iAEQbTJ != 0) {
                return BitmapFactory.decodeResource(OLrzqt, iAEQbTJ);
            }
        } catch (java.lang.Throwable unused3) {
        }
        return null;
    }

    public static android.graphics.Bitmap OLrzqt(java.lang.String str) {
        try {
            return BitmapFactory.decodeStream(new java.net.URL(str).openConnection().getInputStream());
        } catch (java.lang.Throwable th) {
            OneSignal.OLrzqt(OneSignal.LOG_LEVEL.WARN, "Could not download image!", th);
            return null;
        }
    }

    public static android.graphics.Bitmap KWHzl(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String strTrim = str.trim();
        if (strTrim.startsWith(DefaultWebClient.HTTP_SCHEME) || strTrim.startsWith(DefaultWebClient.HTTPS_SCHEME)) {
            return OLrzqt(strTrim);
        }
        return copydefault(str);
    }

    public static int AEQbTJ(java.lang.String str) {
        if (str == null) {
            return 0;
        }
        java.lang.String strTrim = str.trim();
        if (!OSUtils.OLrzqt(strTrim)) {
            return 0;
        }
        int iEZpvd = EZpvd(strTrim);
        if (iEZpvd != 0) {
            return iEZpvd;
        }
        try {
            return R.drawable.class.getField(str).getInt(null);
        } catch (java.lang.Throwable unused) {
            return 0;
        }
    }

    public static int EZpvd(JSONObject jSONObject) {
        int iAEQbTJ = AEQbTJ(jSONObject.optString("sicon", null));
        return iAEQbTJ != 0 ? iAEQbTJ : OLrzqt();
    }

    public static int OLrzqt() {
        int iEZpvd = EZpvd("ic_stat_onesignal_default");
        if (iEZpvd != 0) {
            return iEZpvd;
        }
        int iEZpvd2 = EZpvd("corona_statusbar_icon_default");
        if (iEZpvd2 != 0) {
            return iEZpvd2;
        }
        int iEZpvd3 = EZpvd("ic_os_notification_fallback_white_24dp");
        return iEZpvd3 != 0 ? iEZpvd3 : android.R.drawable.ic_popup_reminder;
    }

    public static int EZpvd(java.lang.String str) {
        return OLrzqt.getIdentifier(str, "drawable", AhwBna);
    }

    public static boolean copydefault(JSONObject jSONObject) {
        java.lang.String strOptString = jSONObject.optString(RemoteMessageConst.Notification.SOUND, null);
        return (AbstractJsonLexerKt.NULL.equals(strOptString) || "nil".equals(strOptString)) ? false : true;
    }

    public static java.math.BigInteger AEQbTJ(JSONObject jSONObject) {
        try {
            if (jSONObject.has("bgac")) {
                return new java.math.BigInteger(jSONObject.optString("bgac", null), 16);
            }
        } catch (java.lang.Throwable unused) {
        }
        try {
            java.lang.String strAEQbTJ = OSUtils.AEQbTJ(OneSignal.AEQbTJ, "onesignal_notification_accent_color", null);
            if (strAEQbTJ != null) {
                return new java.math.BigInteger(strAEQbTJ, 16);
            }
        } catch (java.lang.Throwable unused2) {
        }
        try {
            java.lang.String strOLrzqt = OSUtils.OLrzqt(OneSignal.AEQbTJ, "com.onesignal.NotificationAccentColor.DEFAULT");
            if (strOLrzqt != null) {
                return new java.math.BigInteger(strOLrzqt, 16);
            }
        } catch (java.lang.Throwable unused3) {
        }
        return null;
    }

    public static void OLrzqt(JSONObject jSONObject, C57688ynD c57688ynD, NotificationCompat.Builder builder, int i, java.lang.String str) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("custom"));
            if (jSONObject2.has(IEncryptorType.DEFAULT_ENCRYPTOR)) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(IEncryptorType.DEFAULT_ENCRYPTOR);
                if (jSONObject3.has("actionButtons")) {
                    JSONArray jSONArray = jSONObject3.getJSONArray("actionButtons");
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                        JSONObject jSONObject4 = new JSONObject(jSONObject.toString());
                        android.content.Intent intentEZpvd = c57688ynD.EZpvd(i);
                        intentEZpvd.setAction("" + i2);
                        intentEZpvd.putExtra("action_button", true);
                        jSONObject4.put("actionId", jSONObjectOptJSONObject.optString("id"));
                        intentEZpvd.putExtra("onesignalData", jSONObject4.toString());
                        if (str != null) {
                            intentEZpvd.putExtra("summary", str);
                        } else if (jSONObject.has("grp")) {
                            intentEZpvd.putExtra("grp", jSONObject.optString("grp"));
                        }
                        builder.addAction(jSONObjectOptJSONObject.has(RemoteMessageConst.Notification.ICON) ? AEQbTJ(jSONObjectOptJSONObject.optString(RemoteMessageConst.Notification.ICON)) : 0, jSONObjectOptJSONObject.optString("text"), c57688ynD.OLrzqt(i, intentEZpvd));
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }
}
