package o;

import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKeys;
import com.google.android.gms.stats.CodePackage;
import com.okinc.business.defi.wallet.common.tonconnect.model.DAppManifest;
import com.okinc.business.defi.wallet.common.tonconnect.model.DAppSession;
import com.okinc.core.util.SPUtils;
import java.security.KeyStore;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import o.C59462zhW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ecu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16068ecu {
    public java.lang.String AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public java.util.Map<java.lang.String, DAppManifest> KWHzl;
    public boolean OLrzqt;
    public final android.content.Context copydefault;
    public final KSerializer<java.util.Map<java.lang.String, java.util.List<DAppSession>>> djBIcL;
    public java.util.Map<java.lang.String, ? extends java.util.List<DAppSession>> gEmmrt;
    public final KSerializer<java.util.Map<java.lang.String, DAppManifest>> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends java.util.List<com.okinc.business.defi.wallet.common.tonconnect.model.DAppSession>>, java.util.Map<java.lang.String, java.util.List<com.okinc.business.defi.wallet.common.tonconnect.model.DAppSession>> */
    public final java.util.Map<java.lang.String, java.util.List<DAppSession>> AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, DAppManifest> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    public C16068ecu(@NotNull android.content.Context context) {
        java.util.Map<java.lang.String, ? extends java.util.List<DAppSession>> mapKWHzl;
        java.util.Map<java.lang.String, DAppManifest> mapKWHzl2;
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = context;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.ecy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C16068ecu.KWHzl(this.EZpvd);
            }
        });
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LinkedHashMapSerializer linkedHashMapSerializer = new LinkedHashMapSerializer(stringSerializer, new ArrayListSerializer(DAppSession.Companion.serializer()));
        this.djBIcL = linkedHashMapSerializer;
        this.valueOf = new LinkedHashMapSerializer(stringSerializer, DAppManifest.Companion.serializer());
        android.content.SharedPreferences sharedPreferencesOLrzqt = OLrzqt();
        this.OLrzqt = sharedPreferencesOLrzqt != null ? sharedPreferencesOLrzqt.getBoolean("KEY_TC_LAST_ACTIVE_INIT", false) : false;
        android.content.SharedPreferences sharedPreferencesOLrzqt2 = OLrzqt();
        java.lang.String string = sharedPreferencesOLrzqt2 != null ? sharedPreferencesOLrzqt2.getString("KEY_TC_SESSION_LAST_EVENT_ID", "") : null;
        this.AEQbTJ = string == null ? "" : string;
        try {
            C33489mxS c33489mxS = C33489mxS.KWHzl;
            android.content.SharedPreferences sharedPreferencesOLrzqt3 = OLrzqt();
            java.lang.String string2 = sharedPreferencesOLrzqt3 != null ? sharedPreferencesOLrzqt3.getString("KEY_TC_SESSION_LIST", "") : null;
            mapKWHzl = (java.util.Map) c33489mxS.OLrzqt((DeserializationStrategy) linkedHashMapSerializer, string2 == null ? "" : string2);
        } catch (java.lang.Exception unused) {
            mapKWHzl = C56424yEw.KWHzl();
        }
        this.gEmmrt = mapKWHzl;
        try {
            C33489mxS c33489mxS2 = C33489mxS.KWHzl;
            KSerializer<java.util.Map<java.lang.String, DAppManifest>> kSerializer = this.valueOf;
            java.lang.String string3 = SPUtils.getString("KEY_TC_MANIFEST_LIST", "");
            Intrinsics.checkNotNullExpressionValue(string3, "");
            mapKWHzl2 = (java.util.Map) c33489mxS2.OLrzqt((DeserializationStrategy) kSerializer, string3);
        } catch (java.lang.Exception unused2) {
            mapKWHzl2 = C56424yEw.KWHzl();
        }
        this.KWHzl = mapKWHzl2;
    }

    public final android.content.SharedPreferences OLrzqt() {
        return (android.content.SharedPreferences) this.EZpvd.getValue();
    }

    public static final android.content.SharedPreferences KWHzl(C16068ecu c16068ecu) {
        try {
            return c16068ecu.EZpvd();
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("TonConnectCacheManager", "Resetting keys due to error: " + e.getMessage(), e);
            try {
                KeyStore keyStoreCopydefault = C47235tmH.OLrzqt.copydefault();
                if (keyStoreCopydefault != null && keyStoreCopydefault.containsAlias("okx_tc")) {
                    keyStoreCopydefault.deleteEntry("okx_tc");
                }
            } catch (java.lang.Exception e2) {
                pUU.AEQbTJ("TonConnectCacheManager", "Failed to delete main key", e2);
            }
            try {
                c16068ecu.copydefault.getSharedPreferences("okx_tc_dapps", 0).edit().clear().apply();
                return c16068ecu.EZpvd();
            } catch (java.lang.Exception e3) {
                pUU.AEQbTJ("TonConnectCacheManager", "Failed creating encrypted prefs for the second time", e3);
                return null;
            }
        }
    }

    public final android.content.SharedPreferences EZpvd() {
        android.content.SharedPreferences sharedPreferencesCreate;
        synchronized (this) {
            KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("okx_tc", 3);
            builder.setBlockModes(CodePackage.GCM);
            builder.setEncryptionPaddings("NoPadding");
            builder.setKeySize(256);
            KeyGenParameterSpec keyGenParameterSpecBuild = builder.build();
            Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild, "");
            sharedPreferencesCreate = EncryptedSharedPreferences.create("okx_tc_dapps", MasterKeys.getOrCreate(keyGenParameterSpecBuild), this.copydefault, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesCreate, "");
        }
        return sharedPreferencesCreate;
    }

    public final void EZpvd(boolean z) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutBoolean;
        this.OLrzqt = z;
        android.content.SharedPreferences sharedPreferencesOLrzqt = OLrzqt();
        if (sharedPreferencesOLrzqt == null || (editorEdit = sharedPreferencesOLrzqt.edit()) == null || (editorPutBoolean = editorEdit.putBoolean("KEY_TC_LAST_ACTIVE_INIT", z)) == null) {
            return;
        }
        editorPutBoolean.apply();
    }

    public final void AEQbTJ(java.lang.String str) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        this.AEQbTJ = str;
        android.content.SharedPreferences sharedPreferencesOLrzqt = OLrzqt();
        if (sharedPreferencesOLrzqt == null || (editorEdit = sharedPreferencesOLrzqt.edit()) == null || (editorPutString = editorEdit.putString("KEY_TC_SESSION_LAST_EVENT_ID", str)) == null) {
            return;
        }
        editorPutString.apply();
    }

    public final void EZpvd(java.util.Map<java.lang.String, ? extends java.util.List<DAppSession>> map) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        this.gEmmrt = map;
        android.content.SharedPreferences sharedPreferencesOLrzqt = OLrzqt();
        if (sharedPreferencesOLrzqt == null || (editorEdit = sharedPreferencesOLrzqt.edit()) == null || (editorPutString = editorEdit.putString("KEY_TC_SESSION_LIST", C33489mxS.KWHzl.KWHzl(this.djBIcL, map))) == null) {
            return;
        }
        editorPutString.apply();
    }

    public final void AEQbTJ(java.util.Map<java.lang.String, DAppManifest> map) {
        this.KWHzl = map;
        SPUtils.put("KEY_TC_MANIFEST_LIST", C33489mxS.KWHzl.KWHzl(this.valueOf, map));
    }

    public final boolean valueOf() {
        pUU.EZpvd("TonConnectCacheManager", "isEncryptedPrefsInit: " + (OLrzqt() != null));
        return OLrzqt() != null;
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ(str);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull DAppManifest dAppManifest) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dAppManifest, "");
        AEQbTJ(C56424yEw.KWHzl((java.util.Map) this.KWHzl, C56390yDp.OLrzqt(str, dAppManifest)));
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull DAppSession dAppSession) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dAppSession, "");
        java.util.List<DAppSession> listAhwBna = this.gEmmrt.get(str);
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        EZpvd(C56424yEw.KWHzl((java.util.Map) this.gEmmrt, C56390yDp.OLrzqt(str, CollectionsKt___CollectionsKt.copydefault((java.util.Collection<? extends DAppSession>) listAhwBna, dAppSession))));
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull DAppSession dAppSession) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dAppSession, "");
        java.util.List<DAppSession> listAhwBna = this.gEmmrt.get(str);
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        for (DAppSession dAppSession2 : listAhwBna) {
            if (Intrinsics.EZpvd((java.lang.Object) dAppSession2.getClientId(), (java.lang.Object) dAppSession.getClientId())) {
                dAppSession2 = dAppSession;
            }
            arrayList.add(dAppSession2);
        }
        EZpvd(C56424yEw.KWHzl((java.util.Map) this.gEmmrt, C56390yDp.OLrzqt(str, arrayList)));
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Map mapOLrzqt = C56423yEv.OLrzqt();
        for (Map.Entry<java.lang.String, ? extends java.util.List<DAppSession>> entry : this.gEmmrt.entrySet()) {
            java.lang.String key = entry.getKey();
            java.util.List<DAppSession> value = entry.getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : value) {
                if (!Intrinsics.EZpvd((java.lang.Object) ((DAppSession) obj).getClientId(), (java.lang.Object) str)) {
                    arrayList.add(obj);
                }
            }
            mapOLrzqt.put(key, arrayList);
        }
        EZpvd(C56423yEv.AYXKKw(mapOLrzqt));
    }

    public final java.util.List<java.lang.String> copydefault(int i) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (!this.OLrzqt) {
            pUU.KWHzl("TonConnectCacheManager", "Init lastActiveTimestamp");
            java.util.List listQOLQEE = C56403yEb.QOLQEE(this.gEmmrt.values());
            java.util.ArrayList<DAppSession> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listQOLQEE) {
                if (((DAppSession) obj).getLastActiveTimestamp() == null) {
                    arrayList.add(obj);
                }
            }
            for (DAppSession dAppSession : arrayList) {
                OLrzqt(dAppSession.getWalletId(), DAppSession.copy$default(dAppSession, null, null, null, null, null, null, java.lang.Long.valueOf(jCurrentTimeMillis), 63, null));
            }
            EZpvd(true);
        }
        java.util.List listQOLQEE2 = C56403yEb.QOLQEE(this.gEmmrt.values());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : listQOLQEE2) {
            java.lang.Long lastActiveTimestamp = ((DAppSession) obj2).getLastActiveTimestamp();
            long jLongValue = lastActiveTimestamp != null ? lastActiveTimestamp.longValue() : jCurrentTimeMillis;
            C59462zhW.Activity activity = C59462zhW.OLrzqt;
            if (jCurrentTimeMillis - jLongValue >= C59462zhW.gEmmrt(C59519zia.EZpvd(i, DurationUnit.DAYS))) {
                arrayList2.add(obj2);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((DAppSession) it.next()).getClientId());
        }
        return arrayList3;
    }

    public final java.lang.String gEmmrt() {
        java.lang.Object next;
        java.util.List listQOLQEE = C56403yEb.QOLQEE(this.gEmmrt.values());
        if (listQOLQEE.size() < 100) {
            listQOLQEE = null;
        }
        if (listQOLQEE == null) {
            return null;
        }
        java.util.Iterator it = listQOLQEE.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                java.lang.Long lastActiveTimestamp = ((DAppSession) next).getLastActiveTimestamp();
                long jLongValue = lastActiveTimestamp != null ? lastActiveTimestamp.longValue() : java.lang.System.currentTimeMillis();
                do {
                    java.lang.Object next2 = it.next();
                    java.lang.Long lastActiveTimestamp2 = ((DAppSession) next2).getLastActiveTimestamp();
                    long jLongValue2 = lastActiveTimestamp2 != null ? lastActiveTimestamp2.longValue() : java.lang.System.currentTimeMillis();
                    if (jLongValue > jLongValue2) {
                        next = next2;
                        jLongValue = jLongValue2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        DAppSession dAppSession = (DAppSession) next;
        if (dAppSession != null) {
            return dAppSession.getClientId();
        }
        return null;
    }

    public final void AEQbTJ() {
        EZpvd(C56424yEw.KWHzl());
        AEQbTJ("");
        AEQbTJ(C56424yEw.KWHzl());
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Map<java.lang.String, ? extends java.util.List<DAppSession>> map = this.gEmmrt;
        java.util.Map<java.lang.String, ? extends java.util.List<DAppSession>> linkedHashMap = new LinkedHashMap<>();
        for (Map.Entry<java.lang.String, ? extends java.util.List<DAppSession>> entry : map.entrySet()) {
            if (!Intrinsics.EZpvd((java.lang.Object) entry.getKey(), (java.lang.Object) str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        EZpvd(linkedHashMap);
    }
}
