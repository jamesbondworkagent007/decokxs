package o;

import android.content.SharedPreferences;
import androidx.camera.video.AudioStats;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.aBg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C5714aBg {
    public static final C5714aBg copydefault = new C5714aBg();

    private C5714aBg() {
    }

    /* JADX INFO: renamed from: o.aBg$Application */
    public static final class Application {
        public final java.lang.String AEQbTJ;
        public final boolean EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = application.copydefault;
            }
            java.lang.String str5 = str2;
            if ((i & 4) != 0) {
                str3 = application.OLrzqt;
            }
            java.lang.String str6 = str3;
            if ((i & 8) != 0) {
                str4 = application.AEQbTJ;
            }
            java.lang.String str7 = str4;
            if ((i & 16) != 0) {
                z = application.EZpvd;
            }
            return application.EZpvd(str, str5, str6, str7, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application EZpvd(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(str, str2, str3, str4, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) application.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) application.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) application.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) application.AEQbTJ) && this.EZpvd == application.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            java.lang.String str = this.copydefault;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.OLrzqt;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.AEQbTJ;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PasskeyCredential(credentialId=" + this.KWHzl + ", uid=" + this.copydefault + ", rpId=" + this.OLrzqt + ", createdAt=" + this.AEQbTJ + ", hasBundle=" + this.EZpvd + ")";
        }

        public Application(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
            this.copydefault = str2;
            this.OLrzqt = str3;
            this.AEQbTJ = str4;
            this.EZpvd = z;
        }
    }

    /* JADX INFO: renamed from: o.aBg$TaskDescription */
    /* JADX INFO: loaded from: classes22.dex */
    public static final class TaskDescription {
        public final int AEQbTJ;
        public final int KWHzl;
        public final int OLrzqt;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
            if ((i5 & 1) != 0) {
                i = taskDescription.AEQbTJ;
            }
            if ((i5 & 2) != 0) {
                i2 = taskDescription.KWHzl;
            }
            if ((i5 & 4) != 0) {
                i3 = taskDescription.copydefault;
            }
            if ((i5 & 8) != 0) {
                i4 = taskDescription.OLrzqt;
            }
            return taskDescription.KWHzl(i, i2, i3, i4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(int i, int i2, int i3, int i4) {
            return new TaskDescription(i, i2, i3, i4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return this.AEQbTJ == taskDescription.AEQbTJ && this.KWHzl == taskDescription.KWHzl && this.copydefault == taskDescription.copydefault && this.OLrzqt == taskDescription.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((java.lang.Integer.hashCode(this.AEQbTJ) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "StorageSummary(labelCount=" + this.AEQbTJ + ", accountCount=" + this.KWHzl + ", mappingCount=" + this.copydefault + ", metadataCount=" + this.OLrzqt + ")";
        }

        public TaskDescription(int i, int i2, int i3, int i4) {
            this.AEQbTJ = i;
            this.KWHzl = i2;
            this.copydefault = i3;
            this.OLrzqt = i4;
        }
    }

    public final android.content.SharedPreferences AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            MasterKey masterKeyBuild = new MasterKey.Builder(context).setKeyScheme(MasterKey.KeyScheme.AES256_GCM).build();
            Intrinsics.checkNotNullExpressionValue(masterKeyBuild, "");
            android.content.SharedPreferences sharedPreferencesCreate = EncryptedSharedPreferences.create(context, str, masterKeyBuild, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
            Intrinsics.copydefault(sharedPreferencesCreate);
            return sharedPreferencesCreate;
        } catch (java.lang.Exception e) {
            pUU.copydefault("PasskeyStorageHelper", "Failed to create EncryptedSharedPreferences: " + e.getMessage());
            android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            Intrinsics.copydefault(sharedPreferences);
            return sharedPreferences;
        }
    }

    public final kotlin.Pair<android.content.SharedPreferences, android.content.SharedPreferences> AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return new kotlin.Pair<>(AEQbTJ(context, "com.okx.passkey.v2.storage.encrypted"), AEQbTJ(context, "com.okx.passkey.v2.metadata.encrypted"));
    }

    public final java.util.List<Application> KWHzl(@NotNull android.content.Context context) {
        java.lang.Exception e;
        java.lang.String strOptString;
        java.lang.String strOptString2;
        java.lang.String strValueOf;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        double dOptDouble;
        Intrinsics.checkNotNullParameter(context, "");
        kotlin.Pair<android.content.SharedPreferences, android.content.SharedPreferences> pairAEQbTJ = AEQbTJ(context);
        android.content.SharedPreferences sharedPreferencesComponent1 = pairAEQbTJ.component1();
        android.content.SharedPreferences sharedPreferencesComponent2 = pairAEQbTJ.component2();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Map<java.lang.String, ?> all = sharedPreferencesComponent2.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<java.lang.String, ?> entry : all.entrySet()) {
            java.lang.String key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "");
            if (C59449zhJ.startsWith$default(key, "meta:", false, 2, null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            java.lang.String str4 = (java.lang.String) entry2.getKey();
            java.lang.Object value = entry2.getValue();
            Intrinsics.copydefault((java.lang.Object) str4);
            java.lang.String strKWHzl = StringsKt__StringsKt.KWHzl(str4, (java.lang.CharSequence) "meta:");
            java.lang.String string = value != null ? value.toString() : null;
            if (string != null) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    strOptString = jSONObject.optString("uid", null);
                    try {
                        strOptString2 = jSONObject.optString("rpId", null);
                        try {
                            dOptDouble = jSONObject.optDouble("createdAt", AudioStats.AUDIO_AMPLITUDE_NONE);
                        } catch (java.lang.Exception e2) {
                            e = e2;
                            pUU.copydefault("PasskeyStorageHelper", "Failed to parse metadata for " + strKWHzl + ": " + e.getMessage());
                            strValueOf = null;
                        }
                    } catch (java.lang.Exception e3) {
                        e = e3;
                        strOptString2 = null;
                    }
                } catch (java.lang.Exception e4) {
                    e = e4;
                    strOptString = null;
                    strOptString2 = null;
                }
                if (dOptDouble > AudioStats.AUDIO_AMPLITUDE_NONE) {
                    try {
                        strValueOf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", java.util.Locale.getDefault()).format(new Date((long) (((double) 1000) * dOptDouble)));
                    } catch (java.lang.Exception unused) {
                        strValueOf = java.lang.String.valueOf(dOptDouble);
                    }
                } else {
                    strValueOf = null;
                }
                str = strOptString;
                str2 = strValueOf;
                str3 = strOptString2;
            } else {
                str = null;
                str3 = null;
                str2 = null;
            }
            arrayList.add(new Application(strKWHzl, str, str3, str2, sharedPreferencesComponent1.contains(copydefault.AEQbTJ(strKWHzl))));
        }
        return CollectionsKt___CollectionsKt.EZpvd(arrayList, new StateListAnimator(new ActionBar()));
    }

    /* JADX INFO: renamed from: o.aBg$ActionBar */
    public static final class ActionBar<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Boolean.valueOf(((Application) t2).KWHzl() != null), java.lang.Boolean.valueOf(((Application) t).KWHzl() != null));
        }
    }

    public final TaskDescription copydefault(@NotNull android.content.Context context) {
        int i;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(context, "");
        kotlin.Pair<android.content.SharedPreferences, android.content.SharedPreferences> pairAEQbTJ = AEQbTJ(context);
        android.content.SharedPreferences sharedPreferencesComponent1 = pairAEQbTJ.component1();
        android.content.SharedPreferences sharedPreferencesComponent2 = pairAEQbTJ.component2();
        java.util.Map<java.lang.String, ?> all = sharedPreferencesComponent1.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "");
        int i4 = 0;
        if (all.isEmpty()) {
            i = 0;
        } else {
            java.util.Iterator<Map.Entry<java.lang.String, ?>> it = all.entrySet().iterator();
            i = 0;
            while (it.hasNext()) {
                java.lang.String key = it.next().getKey();
                Intrinsics.checkNotNullExpressionValue(key, "");
                if (C59449zhJ.startsWith$default(key, "label:", false, 2, null)) {
                    i++;
                }
            }
        }
        java.util.Map<java.lang.String, ?> all2 = sharedPreferencesComponent1.getAll();
        Intrinsics.checkNotNullExpressionValue(all2, "");
        if (all2.isEmpty()) {
            i2 = 0;
        } else {
            java.util.Iterator<Map.Entry<java.lang.String, ?>> it2 = all2.entrySet().iterator();
            i2 = 0;
            while (it2.hasNext()) {
                java.lang.String key2 = it2.next().getKey();
                Intrinsics.checkNotNullExpressionValue(key2, "");
                if (C59449zhJ.startsWith$default(key2, "account:", false, 2, null)) {
                    i2++;
                }
            }
        }
        java.util.Map<java.lang.String, ?> all3 = sharedPreferencesComponent2.getAll();
        Intrinsics.checkNotNullExpressionValue(all3, "");
        if (all3.isEmpty()) {
            i3 = 0;
        } else {
            java.util.Iterator<Map.Entry<java.lang.String, ?>> it3 = all3.entrySet().iterator();
            i3 = 0;
            while (it3.hasNext()) {
                java.lang.String key3 = it3.next().getKey();
                Intrinsics.checkNotNullExpressionValue(key3, "");
                if (C59449zhJ.startsWith$default(key3, "mapping:", false, 2, null)) {
                    i3++;
                }
            }
        }
        java.util.Map<java.lang.String, ?> all4 = sharedPreferencesComponent2.getAll();
        Intrinsics.checkNotNullExpressionValue(all4, "");
        if (!all4.isEmpty()) {
            java.util.Iterator<Map.Entry<java.lang.String, ?>> it4 = all4.entrySet().iterator();
            int i5 = 0;
            while (it4.hasNext()) {
                java.lang.String key4 = it4.next().getKey();
                Intrinsics.checkNotNullExpressionValue(key4, "");
                if (C59449zhJ.startsWith$default(key4, "meta:", false, 2, null)) {
                    i5++;
                }
            }
            i4 = i5;
        }
        return new TaskDescription(i, i2, i3, i4);
    }

    public final int EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        int i;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        kotlin.Pair<android.content.SharedPreferences, android.content.SharedPreferences> pairAEQbTJ = AEQbTJ(context);
        android.content.SharedPreferences sharedPreferencesComponent1 = pairAEQbTJ.component1();
        android.content.SharedPreferences sharedPreferencesComponent2 = pairAEQbTJ.component2();
        java.lang.String strAEQbTJ = AEQbTJ(str);
        java.lang.String strKWHzl = KWHzl(str);
        java.util.Map<java.lang.String, ?> all = sharedPreferencesComponent2.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Iterator<Map.Entry<java.lang.String, ?>> it = all.entrySet().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<java.lang.String, ?> next = it.next();
            java.lang.String key = next.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "");
            if (C59449zhJ.startsWith$default(key, "mapping:", false, 2, null) && Intrinsics.EZpvd(next.getValue(), (java.lang.Object) str)) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        java.util.List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(linkedHashMap.keySet());
        java.util.Map<java.lang.String, ?> all2 = sharedPreferencesComponent1.getAll();
        Intrinsics.checkNotNullExpressionValue(all2, "");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<java.lang.String, ?> entry : all2.entrySet()) {
            java.lang.String key2 = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key2, "");
            if (C59449zhJ.startsWith$default(key2, "label:", false, 2, null)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.List<java.lang.String> listAxsJAYsNCnLh2 = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(linkedHashMap2.keySet());
        SharedPreferences.Editor editorEdit = sharedPreferencesComponent1.edit();
        if (sharedPreferencesComponent1.contains(strAEQbTJ)) {
            editorEdit.remove(strAEQbTJ);
            i = 1;
        }
        for (java.lang.String str2 : listAxsJAYsNCnLh2) {
            Intrinsics.copydefault((java.lang.Object) str2);
            if (Intrinsics.EZpvd((java.lang.Object) sharedPreferencesComponent2.getString(copydefault.copydefault(StringsKt__StringsKt.KWHzl(str2, (java.lang.CharSequence) "label:")), null), (java.lang.Object) str)) {
                editorEdit.remove(str2);
                i++;
            }
        }
        editorEdit.apply();
        SharedPreferences.Editor editorEdit2 = sharedPreferencesComponent2.edit();
        if (sharedPreferencesComponent2.contains(strKWHzl)) {
            editorEdit2.remove(strKWHzl);
            i++;
        }
        java.util.Iterator it2 = listAxsJAYsNCnLh.iterator();
        while (it2.hasNext()) {
            editorEdit2.remove((java.lang.String) it2.next());
            i++;
        }
        editorEdit2.apply();
        pUU.KWHzl("PasskeyStorageHelper", "Deleted passkey: " + str + " (" + i + " entries removed)");
        return i;
    }

    /* JADX INFO: renamed from: o.aBg$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        public final /* synthetic */ java.util.Comparator OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(java.util.Comparator comparator) {
            this.OLrzqt = comparator;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.OLrzqt.compare(t, t2);
            return iCompare != 0 ? iCompare : yET.KWHzl(((Application) t2).KWHzl(), ((Application) t).KWHzl());
        }
    }

    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        kotlin.Pair<android.content.SharedPreferences, android.content.SharedPreferences> pairAEQbTJ = AEQbTJ(context);
        android.content.SharedPreferences sharedPreferencesComponent1 = pairAEQbTJ.component1();
        android.content.SharedPreferences sharedPreferencesComponent2 = pairAEQbTJ.component2();
        int size = sharedPreferencesComponent1.getAll().size();
        int size2 = sharedPreferencesComponent2.getAll().size();
        sharedPreferencesComponent1.edit().clear().apply();
        sharedPreferencesComponent2.edit().clear().apply();
        pUU.KWHzl("PasskeyStorageHelper", "Deleted ALL passkeys: " + size + " passkey entries, " + size2 + " metadata entries");
        return new kotlin.Pair<>(java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(size2));
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        return "account:" + str;
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        return "meta:" + str;
    }

    public final java.lang.String copydefault(java.lang.String str) {
        return "mapping:" + str;
    }
}
