package o;

import android.content.SharedPreferences;
import com.onesignal.OneSignal;

/* JADX INFO: renamed from: o.ypr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57834ypr {
    public static java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Object>> KWHzl;
    public static TaskDescription OLrzqt;
    public static final java.lang.String copydefault = OneSignal.class.getSimpleName();

    static {
        copydefault();
    }

    /* JADX INFO: renamed from: o.ypr$TaskDescription */
    public static class TaskDescription extends android.os.HandlerThread {
        public android.os.Handler AEQbTJ;
        public long KWHzl;
        public boolean OLrzqt;

        public TaskDescription(java.lang.String str) {
            super(str);
            this.KWHzl = 0L;
        }

        @Override // android.os.HandlerThread
        public void onLooperPrepared() {
            super.onLooperPrepared();
            this.AEQbTJ = new android.os.Handler(getLooper());
            KWHzl();
        }

        public final void OLrzqt() {
            synchronized (this) {
                if (OneSignal.AEQbTJ == null) {
                    return;
                }
                AEQbTJ();
                KWHzl();
            }
        }

        public final void AEQbTJ() {
            if (this.OLrzqt) {
                return;
            }
            start();
            this.OLrzqt = true;
        }

        public final void KWHzl() {
            synchronized (this) {
                android.os.Handler handler = this.AEQbTJ;
                if (handler == null) {
                    return;
                }
                handler.removeCallbacksAndMessages(null);
                if (this.KWHzl == 0) {
                    this.KWHzl = OneSignal.aKErDB().KWHzl();
                }
                long j = this.KWHzl;
                long jKWHzl = OneSignal.aKErDB().KWHzl();
                this.AEQbTJ.postDelayed(new java.lang.Runnable() { // from class: o.ypr.TaskDescription.2
                    @Override // java.lang.Runnable
                    public void run() {
                        TaskDescription.this.EZpvd();
                    }
                }, (j - jKWHzl) + 200);
            }
        }

        public final void EZpvd() {
            for (java.lang.String str : C57834ypr.KWHzl.keySet()) {
                SharedPreferences.Editor editorEdit = C57834ypr.AEQbTJ(str).edit();
                java.util.HashMap<java.lang.String, java.lang.Object> map = C57834ypr.KWHzl.get(str);
                synchronized (map) {
                    for (java.lang.String str2 : map.keySet()) {
                        java.lang.Object obj = map.get(str2);
                        if (obj instanceof java.lang.String) {
                            editorEdit.putString(str2, (java.lang.String) obj);
                        } else if (obj instanceof java.lang.Boolean) {
                            editorEdit.putBoolean(str2, ((java.lang.Boolean) obj).booleanValue());
                        } else if (obj instanceof java.lang.Integer) {
                            editorEdit.putInt(str2, ((java.lang.Integer) obj).intValue());
                        } else if (obj instanceof java.lang.Long) {
                            editorEdit.putLong(str2, ((java.lang.Long) obj).longValue());
                        } else if (obj instanceof java.util.Set) {
                            editorEdit.putStringSet(str2, (java.util.Set) obj);
                        } else if (obj == null) {
                            editorEdit.remove(str2);
                        }
                    }
                    map.clear();
                }
                editorEdit.apply();
            }
            this.KWHzl = OneSignal.aKErDB().KWHzl();
        }
    }

    public static void copydefault() {
        java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Object>> map = new java.util.HashMap<>();
        KWHzl = map;
        map.put(copydefault, new java.util.HashMap<>());
        KWHzl.put("GTPlayerPurchases", new java.util.HashMap<>());
        KWHzl.put("OneSignalTriggers", new java.util.HashMap<>());
        OLrzqt = new TaskDescription("OSH_WritePrefs");
    }

    public static void AEQbTJ() {
        OLrzqt.OLrzqt();
    }

    public static void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        EZpvd(str, str2, str3);
    }

    public static void EZpvd(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull java.lang.String str2, @androidx.annotation.NonNull java.util.Set<java.lang.String> set) {
        EZpvd(str, str2, (java.lang.Object) set);
    }

    public static void KWHzl(java.lang.String str, java.lang.String str2, boolean z) {
        EZpvd(str, str2, java.lang.Boolean.valueOf(z));
    }

    public static void OLrzqt(java.lang.String str, java.lang.String str2, int i) {
        EZpvd(str, str2, java.lang.Integer.valueOf(i));
    }

    public static void EZpvd(java.lang.String str, java.lang.String str2, long j) {
        EZpvd(str, str2, java.lang.Long.valueOf(j));
    }

    public static void EZpvd(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        java.util.HashMap<java.lang.String, java.lang.Object> map = KWHzl.get(str);
        synchronized (map) {
            map.put(str2, obj);
        }
        AEQbTJ();
    }

    public static java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return (java.lang.String) KWHzl(str, str2, java.lang.String.class, str3);
    }

    public static boolean AEQbTJ(java.lang.String str, java.lang.String str2, boolean z) {
        return ((java.lang.Boolean) KWHzl(str, str2, java.lang.Boolean.class, java.lang.Boolean.valueOf(z))).booleanValue();
    }

    public static int copydefault(java.lang.String str, java.lang.String str2, int i) {
        return ((java.lang.Integer) KWHzl(str, str2, java.lang.Integer.class, java.lang.Integer.valueOf(i))).intValue();
    }

    public static long OLrzqt(java.lang.String str, java.lang.String str2, long j) {
        return ((java.lang.Long) KWHzl(str, str2, java.lang.Long.class, java.lang.Long.valueOf(j))).longValue();
    }

    public static java.util.Set<java.lang.String> copydefault(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull java.lang.String str2, @androidx.annotation.Nullable java.util.Set<java.lang.String> set) {
        return (java.util.Set) KWHzl(str, str2, java.util.Set.class, set);
    }

    public static java.lang.Object KWHzl(java.lang.String str, java.lang.String str2, java.lang.Class cls, java.lang.Object obj) {
        java.util.HashMap<java.lang.String, java.lang.Object> map = KWHzl.get(str);
        synchronized (map) {
            if (cls.equals(java.lang.Object.class) && map.containsKey(str2)) {
                return java.lang.Boolean.TRUE;
            }
            java.lang.Object obj2 = map.get(str2);
            if (obj2 == null && !map.containsKey(str2)) {
                android.content.SharedPreferences sharedPreferencesAEQbTJ = AEQbTJ(str);
                if (sharedPreferencesAEQbTJ == null) {
                    return obj;
                }
                if (cls.equals(java.lang.String.class)) {
                    return sharedPreferencesAEQbTJ.getString(str2, (java.lang.String) obj);
                }
                if (cls.equals(java.lang.Boolean.class)) {
                    return java.lang.Boolean.valueOf(sharedPreferencesAEQbTJ.getBoolean(str2, ((java.lang.Boolean) obj).booleanValue()));
                }
                if (cls.equals(java.lang.Integer.class)) {
                    return java.lang.Integer.valueOf(sharedPreferencesAEQbTJ.getInt(str2, ((java.lang.Integer) obj).intValue()));
                }
                if (cls.equals(java.lang.Long.class)) {
                    return java.lang.Long.valueOf(sharedPreferencesAEQbTJ.getLong(str2, ((java.lang.Long) obj).longValue()));
                }
                if (cls.equals(java.util.Set.class)) {
                    return sharedPreferencesAEQbTJ.getStringSet(str2, (java.util.Set) obj);
                }
                if (cls.equals(java.lang.Object.class)) {
                    return java.lang.Boolean.valueOf(sharedPreferencesAEQbTJ.contains(str2));
                }
                return null;
            }
            return obj2;
        }
    }

    public static android.content.SharedPreferences AEQbTJ(java.lang.String str) {
        synchronized (C57834ypr.class) {
            android.content.Context context = OneSignal.AEQbTJ;
            if (context == null) {
                OneSignal.OLrzqt(OneSignal.LOG_LEVEL.WARN, "OneSignal.appContext null, could not read " + str + " from getSharedPreferences.", new java.lang.Throwable());
                return null;
            }
            return context.getSharedPreferences(str, 0);
        }
    }
}
