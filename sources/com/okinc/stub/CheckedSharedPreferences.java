package com.okinc.stub;

import android.content.SharedPreferences;
import com.okinc.stub.CheckedSharedPreferences;
import java.io.File;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32979mnm;
import o.C6777aVl;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class CheckedSharedPreferences implements SharedPreferences {
    private static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final SharedPreferences EZpvd;
    public final String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return this.EZpvd.contains(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        return this.EZpvd.getAll();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.EZpvd.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.EZpvd.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public CheckedSharedPreferences(String str, @NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "");
        this.OLrzqt = str;
        this.EZpvd = sharedPreferences;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.stub.CheckedSharedPreferences.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ Object monitoredExecution$default(Activity activity, String str, String str2, Object obj, boolean z, Function0 function0, int i, Object obj2) {
            if ((i & 8) != 0) {
                z = true;
            }
            return activity.copydefault(str, str2, obj, z, function0);
        }

        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        public final <T> T copydefault(String str, String str2, Object obj, boolean z, @NotNull Function0<? extends T> function0) {
            String str3;
            Intrinsics.checkNotNullParameter(function0, "");
            if (str2 == null || str2.length() == 0) {
                try {
                    String str4 = (z ? "Get" : "Put") + " preference with null or empty key, value is " + obj + ", file name is " + str;
                    pUU.copydefault("SystemPreference", str4);
                    C6777aVl.Companion.EZpvd(new OKIllegalArgumentException(str4));
                } catch (Exception unused) {
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                T tInvoke = function0.invoke();
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                if (jCurrentTimeMillis2 > 10) {
                    long jCopydefault = copydefault(str);
                    if (jCopydefault > 1024) {
                        str3 = (jCopydefault / ((long) 1024)) + " KB";
                    } else {
                        str3 = jCopydefault + " B";
                    }
                    pUU.KWHzl("SystemPreference", (z ? "Get" : "Put") + " sp file took " + jCurrentTimeMillis2 + " ms, file name " + str + ", file size " + str3);
                }
                return tInvoke;
            } finally {
            }
        }

        public final long copydefault(String str) {
            if (str != null && str.length() != 0) {
                try {
                    File file = new File(C32979mnm.EZpvd.OLrzqt().getApplicationInfo().dataDir, "shared_prefs/" + str + ".xml");
                    if (file.exists()) {
                        return file.length();
                    }
                } catch (Exception unused) {
                }
            }
            return 0L;
        }
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        String str = this.OLrzqt;
        SharedPreferences.Editor editorEdit = this.EZpvd.edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "");
        return new StateListAnimator(str, editorEdit);
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(final String str, final boolean z) {
        return ((Boolean) Activity.monitoredExecution$default(Companion, this.OLrzqt, str, Boolean.valueOf(z), false, new Function0() { // from class: o.umU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(CheckedSharedPreferences.AEQbTJ(this.OLrzqt, str, z));
            }
        }, 8, null)).booleanValue();
    }

    public static final boolean AEQbTJ(CheckedSharedPreferences checkedSharedPreferences, String str, boolean z) {
        return checkedSharedPreferences.EZpvd.getBoolean(str, z);
    }

    @Override // android.content.SharedPreferences
    public float getFloat(final String str, final float f) {
        return ((Number) Activity.monitoredExecution$default(Companion, this.OLrzqt, str, Float.valueOf(f), false, new Function0() { // from class: o.umY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Float.valueOf(CheckedSharedPreferences.OLrzqt(this.copydefault, str, f));
            }
        }, 8, null)).floatValue();
    }

    public static final float OLrzqt(CheckedSharedPreferences checkedSharedPreferences, String str, float f) {
        return checkedSharedPreferences.EZpvd.getFloat(str, f);
    }

    @Override // android.content.SharedPreferences
    public int getInt(final String str, final int i) {
        return ((Number) Activity.monitoredExecution$default(Companion, this.OLrzqt, str, Integer.valueOf(i), false, new Function0() { // from class: o.umW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(CheckedSharedPreferences.OLrzqt(this.KWHzl, str, i));
            }
        }, 8, null)).intValue();
    }

    public static final int OLrzqt(CheckedSharedPreferences checkedSharedPreferences, String str, int i) {
        return checkedSharedPreferences.EZpvd.getInt(str, i);
    }

    @Override // android.content.SharedPreferences
    public long getLong(final String str, final long j) {
        return ((Number) Activity.monitoredExecution$default(Companion, this.OLrzqt, str, Long.valueOf(j), false, new Function0() { // from class: o.umS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Long.valueOf(CheckedSharedPreferences.EZpvd(this.EZpvd, str, j));
            }
        }, 8, null)).longValue();
    }

    public static final long EZpvd(CheckedSharedPreferences checkedSharedPreferences, String str, long j) {
        return checkedSharedPreferences.EZpvd.getLong(str, j);
    }

    @Override // android.content.SharedPreferences
    public String getString(final String str, final String str2) {
        return (String) Activity.monitoredExecution$default(Companion, this.OLrzqt, str, str2, false, new Function0() { // from class: o.unb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return CheckedSharedPreferences.EZpvd(this.KWHzl, str, str2);
            }
        }, 8, null);
    }

    public static final String EZpvd(CheckedSharedPreferences checkedSharedPreferences, String str, String str2) {
        return checkedSharedPreferences.EZpvd.getString(str, str2);
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(final String str, final Set<String> set) {
        return (Set) Activity.monitoredExecution$default(Companion, this.OLrzqt, str, set, false, new Function0() { // from class: o.umT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return CheckedSharedPreferences.EZpvd(this.copydefault, str, set);
            }
        }, 8, null);
    }

    public static final Set EZpvd(CheckedSharedPreferences checkedSharedPreferences, String str, Set set) {
        return checkedSharedPreferences.EZpvd.getStringSet(str, set);
    }

    public static final class StateListAnimator implements SharedPreferences.Editor {
        public final SharedPreferences.Editor KWHzl;
        public final String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            this.KWHzl.apply();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            return this.KWHzl.clear();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            return this.KWHzl.commit();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            return this.KWHzl.remove(str);
        }

        public StateListAnimator(String str, @NotNull SharedPreferences.Editor editor) {
            Intrinsics.checkNotNullParameter(editor, "");
            this.OLrzqt = str;
            this.KWHzl = editor;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(final String str, final String str2) {
            Object objCopydefault = CheckedSharedPreferences.Companion.copydefault(this.OLrzqt, str, str2, false, new Function0() { // from class: o.und
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return CheckedSharedPreferences.StateListAnimator.copydefault(this.AEQbTJ, str, str2);
                }
            });
            Intrinsics.checkNotNullExpressionValue(objCopydefault, "");
            return (SharedPreferences.Editor) objCopydefault;
        }

        public static final SharedPreferences.Editor copydefault(StateListAnimator stateListAnimator, String str, String str2) {
            return stateListAnimator.KWHzl.putString(str, str2);
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(final String str, final boolean z) {
            Object objCopydefault = CheckedSharedPreferences.Companion.copydefault(this.OLrzqt, str, Boolean.valueOf(z), false, new Function0() { // from class: o.umX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return CheckedSharedPreferences.StateListAnimator.EZpvd(this.EZpvd, str, z);
                }
            });
            Intrinsics.checkNotNullExpressionValue(objCopydefault, "");
            return (SharedPreferences.Editor) objCopydefault;
        }

        public static final SharedPreferences.Editor EZpvd(StateListAnimator stateListAnimator, String str, boolean z) {
            return stateListAnimator.KWHzl.putBoolean(str, z);
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(final String str, final float f) {
            Object objCopydefault = CheckedSharedPreferences.Companion.copydefault(this.OLrzqt, str, Float.valueOf(f), false, new Function0() { // from class: o.una
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return CheckedSharedPreferences.StateListAnimator.AEQbTJ(this.EZpvd, str, f);
                }
            });
            Intrinsics.checkNotNullExpressionValue(objCopydefault, "");
            return (SharedPreferences.Editor) objCopydefault;
        }

        public static final SharedPreferences.Editor AEQbTJ(StateListAnimator stateListAnimator, String str, float f) {
            return stateListAnimator.KWHzl.putFloat(str, f);
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(final String str, final int i) {
            Object objCopydefault = CheckedSharedPreferences.Companion.copydefault(this.OLrzqt, str, Integer.valueOf(i), false, new Function0() { // from class: o.ung
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return CheckedSharedPreferences.StateListAnimator.KWHzl(this.AEQbTJ, str, i);
                }
            });
            Intrinsics.checkNotNullExpressionValue(objCopydefault, "");
            return (SharedPreferences.Editor) objCopydefault;
        }

        public static final SharedPreferences.Editor KWHzl(StateListAnimator stateListAnimator, String str, int i) {
            return stateListAnimator.KWHzl.putInt(str, i);
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(final String str, final long j) {
            Object objCopydefault = CheckedSharedPreferences.Companion.copydefault(this.OLrzqt, str, Long.valueOf(j), false, new Function0() { // from class: o.umZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return CheckedSharedPreferences.StateListAnimator.copydefault(this.OLrzqt, str, j);
                }
            });
            Intrinsics.checkNotNullExpressionValue(objCopydefault, "");
            return (SharedPreferences.Editor) objCopydefault;
        }

        public static final SharedPreferences.Editor copydefault(StateListAnimator stateListAnimator, String str, long j) {
            return stateListAnimator.KWHzl.putLong(str, j);
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(final String str, final Set<String> set) {
            Object objCopydefault = CheckedSharedPreferences.Companion.copydefault(this.OLrzqt, str, set, false, new Function0() { // from class: o.unc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return CheckedSharedPreferences.StateListAnimator.OLrzqt(this.EZpvd, str, set);
                }
            });
            Intrinsics.checkNotNullExpressionValue(objCopydefault, "");
            return (SharedPreferences.Editor) objCopydefault;
        }

        public static final SharedPreferences.Editor OLrzqt(StateListAnimator stateListAnimator, String str, Set set) {
            return stateListAnimator.KWHzl.putStringSet(str, set);
        }
    }

    public static final class OKIllegalArgumentException extends IllegalArgumentException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OKIllegalArgumentException(@NotNull String str) {
            super(str);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }
}
