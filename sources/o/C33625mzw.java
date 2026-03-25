package o;

import android.os.Build;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

/* JADX INFO: renamed from: o.mzw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33625mzw {
    public static C33625mzw KWHzl;
    public Activity AhwBna;

    @java.lang.Deprecated
    public static java.lang.String[] gEmmrt = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    public static java.lang.String[] EZpvd = {"android.permission.READ_PHONE_STATE", "android.permission.ACCESS_WIFI_STATE"};
    public static java.lang.String[] valueOf = {"android.permission.READ_CONTACTS"};
    public static java.lang.String[] AYXKKw = {"android.permission.SEND_SMS"};
    public static java.lang.String[] copydefault = {"android.permission.ACCESS_NOTIFICATION_POLICY"};
    public static java.lang.String[] OLrzqt = {"android.permission.POST_NOTIFICATIONS"};
    public static java.lang.String[] AEQbTJ = {"android.permission.ACCESS_COARSE_LOCATION"};
    public java.lang.String[] djBIcL = {"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    public java.lang.String[] AkhnZx = {"android.permission.CAMERA"};

    /* JADX INFO: renamed from: o.mzw$Activity */
    public interface Activity {
        void EZpvd();

        void EZpvd(java.util.List<java.lang.String> list);

        default void OLrzqt(int i, java.util.List<java.lang.String> list) {
        }
    }

    /* JADX INFO: renamed from: o.mzw$StateListAnimator */
    public interface StateListAnimator {
        void KWHzl(boolean z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.lang.String[] AEQbTJ() {
        int i = Build.VERSION.SDK_INT;
        return i >= 33 ? new java.lang.String[]{"android.permission.READ_MEDIA_AUDIO"} : i >= 29 ? new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"} : new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.lang.String[] copydefault() {
        return new java.lang.String[]{Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_AUDIO" : "android.permission.READ_EXTERNAL_STORAGE"};
    }

    public static C33625mzw OLrzqt() {
        if (KWHzl == null) {
            KWHzl = new C33625mzw();
        }
        return KWHzl;
    }

    public void copydefault(android.app.Activity activity, int i, Activity activity2) {
        if (i == 1) {
            EZpvd(activity, AEQbTJ(), KWHzl(activity, java.util.Arrays.asList(AEQbTJ())), i, activity2);
        }
        if (i == 2) {
            java.lang.String[] strArr = this.djBIcL;
            EZpvd(activity, strArr, KWHzl(activity, java.util.Arrays.asList(strArr)), i, activity2);
            return;
        }
        if (i == 3) {
            java.lang.String[] strArr2 = this.AkhnZx;
            EZpvd(activity, strArr2, KWHzl(activity, java.util.Arrays.asList(strArr2)), i, activity2);
            return;
        }
        if (i == 21) {
            EZpvd(activity, copydefault(), KWHzl(activity, java.util.Arrays.asList(copydefault())), i, activity2);
            return;
        }
        switch (i) {
            case 6:
                java.lang.String[] strArr3 = AEQbTJ;
                EZpvd(activity, strArr3, KWHzl(activity, java.util.Arrays.asList(strArr3)), i, activity2);
                break;
            case 7:
                java.lang.String[] strArr4 = valueOf;
                EZpvd(activity, strArr4, KWHzl(activity, java.util.Arrays.asList(strArr4)), i, activity2);
                break;
            case 8:
                java.lang.String[] strArr5 = AYXKKw;
                EZpvd(activity, strArr5, KWHzl(activity, java.util.Arrays.asList(strArr5)), i, activity2);
                break;
            case 9:
                java.lang.String[] strArr6 = copydefault;
                EZpvd(activity, strArr6, KWHzl(activity, java.util.Arrays.asList(strArr6)), i, activity2);
                break;
            case 10:
                java.lang.String[] strArr7 = EZpvd;
                EZpvd(activity, strArr7, KWHzl(activity, java.util.Arrays.asList(strArr7)), i, activity2);
                break;
        }
    }

    public void EZpvd(android.app.Activity activity, java.lang.String[] strArr, java.lang.String str, int i, Activity activity2) {
        this.AhwBna = activity2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : strArr) {
            if (!C60121zwJ.KWHzl(activity, str2)) {
                arrayList.add(str2);
            }
        }
        if (arrayList.size() <= 0) {
            if (activity2 != null) {
                activity2.EZpvd();
            }
        } else {
            C60121zwJ.AEQbTJ(activity, str, i, (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]));
            if (activity2 != null) {
                if (!EZpvd(activity, (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]))) {
                    EZpvd(activity, arrayList);
                }
                activity2.EZpvd(arrayList);
            }
        }
    }

    public final boolean EZpvd(android.app.Activity activity, @androidx.annotation.NonNull java.lang.String... strArr) {
        for (java.lang.String str : strArr) {
            if (copydefault(activity, str)) {
                return true;
            }
        }
        return false;
    }

    public boolean copydefault(android.app.Activity activity, @androidx.annotation.NonNull java.lang.String str) {
        return ActivityCompat.shouldShowRequestPermissionRationale(activity, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void AEQbTJ(android.app.Activity activity, int i, java.util.List<java.lang.String> list) {
        Activity activity2 = this.AhwBna;
        if (activity2 != null) {
            activity2.OLrzqt(i, list);
        }
        switch (i) {
            case 1:
                copydefault(activity, i, list);
                return;
            case 2:
                copydefault(activity, i, list);
                return;
            case 3:
                copydefault(activity, i, list);
                return;
            case 4:
                copydefault(activity, i, list);
                return;
            case 5:
            default:
                copydefault(activity, i, list);
            case 6:
                copydefault(activity, i, list);
                return;
            case 7:
                copydefault(activity, i, list);
                return;
            case 8:
                copydefault(activity, i, list);
                break;
            case 9:
                break;
        }
        copydefault(activity, i, list);
        copydefault(activity, i, list);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void KWHzl(android.app.Activity activity, int i, java.util.List<java.lang.String> list) {
        Activity activity2 = this.AhwBna;
        if (activity2 == null) {
        }
        switch (i) {
            case 1:
                activity2.EZpvd();
                break;
            case 2:
                activity2.EZpvd();
                break;
            case 3:
                activity2.EZpvd();
                break;
            case 4:
                activity2.EZpvd();
                break;
            case 5:
            default:
                this.AhwBna.EZpvd();
                break;
            case 6:
                activity2.EZpvd();
                break;
            case 7:
                activity2.EZpvd();
                break;
            case 8:
                activity2.EZpvd();
                this.AhwBna.EZpvd();
                this.AhwBna.EZpvd();
                break;
            case 9:
                this.AhwBna.EZpvd();
                this.AhwBna.EZpvd();
                break;
        }
    }

    public final void copydefault(android.app.Activity activity, int i, java.util.List<java.lang.String> list) {
        C60121zwJ.copydefault(activity, list);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(android.content.Context context, java.util.List<java.lang.String> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            java.lang.String str = list.get(i);
            str.hashCode();
            switch (str) {
                case "android.permission.ACCESS_NOTIFICATION_POLICY":
                    break;
                case "android.permission.READ_EXTERNAL_STORAGE":
                case "android.permission.WRITE_EXTERNAL_STORAGE":
                    java.lang.String string = sb.toString();
                    C33088mpp c33088mpp = C33088mpp.AEQbTJ;
                    if (string.contains(context.getString(c33088mpp.AYXKKw()))) {
                        continue;
                    } else {
                        sb.append(context.getString(c33088mpp.AYXKKw()) + context.getString(c33088mpp.AEQbTJ()));
                    }
                    break;
                case "android.permission.SEND_SMS":
                    sb.append(context.getString(C33088mpp.AEQbTJ.valueOf()));
                    break;
                case "android.permission.CAMERA":
                    sb.append(context.getString(C33088mpp.AEQbTJ.OLrzqt()));
                    continue;
                    break;
                case "android.permission.READ_MEDIA_AUDIO":
                    sb.append(context.getString(C33088mpp.AEQbTJ.fetchVPNInfo()));
                    continue;
                    break;
                case "android.permission.RECORD_AUDIO":
                    sb.append(context.getString(C33088mpp.AEQbTJ.gEmmrt()));
                    continue;
                    break;
                case "android.permission.READ_CONTACTS":
                    sb.append(context.getString(C33088mpp.AEQbTJ.copydefault()));
                    continue;
                    break;
                default:
                    break;
            }
            sb.append(context.getString(C33088mpp.AEQbTJ.djBIcL()));
        }
        java.lang.String string2 = sb.toString();
        if (string2.isEmpty()) {
            return;
        }
        C57604ylZ.OLrzqt.OLrzqt(copydefault(context, EZpvd(context, string2)), null, 0, null, 0, 0);
    }

    public final java.lang.String EZpvd(android.content.Context context, java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        int length = str.length();
        if (length > 1 && java.lang.String.valueOf(str.charAt(str.length() - 1)).equals(context.getString(C33088mpp.AEQbTJ.AEQbTJ()))) {
            length--;
        }
        return str.substring(0, length);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String KWHzl(android.content.Context context, java.util.List<java.lang.String> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            java.lang.String str = list.get(i);
            str.hashCode();
            switch (str) {
                case "android.permission.ACCESS_NOTIFICATION_POLICY":
                    break;
                case "android.permission.READ_EXTERNAL_STORAGE":
                case "android.permission.WRITE_EXTERNAL_STORAGE":
                    java.lang.String string = sb.toString();
                    C33088mpp c33088mpp = C33088mpp.AEQbTJ;
                    if (string.contains(context.getString(c33088mpp.AYXKKw()))) {
                        continue;
                    } else {
                        sb.append(context.getString(c33088mpp.AYXKKw()) + context.getString(c33088mpp.AEQbTJ()));
                    }
                    break;
                case "android.permission.ACCESS_COARSE_LOCATION":
                    java.lang.String string2 = sb.toString();
                    C33088mpp c33088mpp2 = C33088mpp.AEQbTJ;
                    if (string2.contains(context.getString(c33088mpp2.KWHzl()))) {
                        continue;
                    } else {
                        sb.append(context.getString(c33088mpp2.KWHzl()) + context.getString(c33088mpp2.AEQbTJ()));
                    }
                    break;
                case "android.permission.READ_PHONE_STATE":
                    sb.append(context.getString(C33088mpp.AEQbTJ.AhwBna()));
                    continue;
                    break;
                case "android.permission.SEND_SMS":
                    sb.append(context.getString(C33088mpp.AEQbTJ.valueOf()));
                    break;
                case "android.permission.CAMERA":
                    sb.append(context.getString(C33088mpp.AEQbTJ.OLrzqt()));
                    continue;
                    break;
                case "android.permission.READ_MEDIA_AUDIO":
                    sb.append(context.getString(C33088mpp.AEQbTJ.fetchVPNInfo()));
                    continue;
                    break;
                case "android.permission.RECORD_AUDIO":
                    sb.append(context.getString(C33088mpp.AEQbTJ.gEmmrt()));
                    continue;
                    break;
                case "android.permission.READ_CONTACTS":
                    sb.append(context.getString(C33088mpp.AEQbTJ.copydefault()));
                    continue;
                    break;
                default:
                    break;
            }
            sb.append(context.getString(C33088mpp.AEQbTJ.djBIcL()));
        }
        return copydefault(context, EZpvd(context, sb.toString()));
    }

    public final java.lang.String copydefault(android.content.Context context, final java.lang.String str) {
        return C33069mpW.KWHzl(context, C33088mpp.AEQbTJ.EZpvd(), new java.util.HashMap<java.lang.String, java.lang.String>(str) { // from class: com.okinc.core.widget.dialog.PermissionHelper$1
            final /* synthetic */ String val$permissionName;

            {
                this.val$permissionName = str;
                put("permission_name", str);
            }
        });
    }

    public boolean OLrzqt(android.content.Context context) {
        return NotificationManagerCompat.from(context).areNotificationsEnabled();
    }

    public void AEQbTJ(android.content.Context context, StateListAnimator stateListAnimator) {
        boolean zAreNotificationsEnabled = NotificationManagerCompat.from(context).areNotificationsEnabled();
        if (stateListAnimator != null) {
            stateListAnimator.KWHzl(zAreNotificationsEnabled);
        }
    }

    public void EZpvd(android.app.Activity activity) {
        if ("V10".equals(C33580mzD.EZpvd())) {
            android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addFlags(268435456);
            intent.setData(android.net.Uri.fromParts("package", activity.getPackageName(), null));
            activity.startActivity(intent);
            return;
        }
        try {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent2.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
            intent2.putExtra(NotificationCompat.EXTRA_CHANNEL_ID, activity.getApplicationInfo().uid);
            intent2.putExtra("app_package", activity.getPackageName());
            intent2.putExtra("app_uid", activity.getApplicationInfo().uid);
            activity.startActivity(intent2);
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
            android.content.Intent intent3 = new android.content.Intent();
            intent3.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent3.setData(android.net.Uri.fromParts("package", activity.getPackageName(), null));
            activity.startActivity(intent3);
        }
    }

    public void KWHzl(android.app.Activity activity) {
        new C33580mzD(activity).copydefault();
    }

    public boolean OLrzqt(android.app.Activity activity, java.lang.String... strArr) {
        return C60121zwJ.KWHzl(activity, strArr);
    }
}
