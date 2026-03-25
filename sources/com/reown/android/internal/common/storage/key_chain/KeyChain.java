package com.reown.android.internal.common.storage.key_chain;

import android.content.SharedPreferences;
import com.reown.foundation.common.model.Key;
import com.reown.util.UtilFunctionsKt;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o.C56390yDp;
import o.C56548yJl;
import o.yDT;
import o.yDV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class KeyChain implements KeyStore {
    public final SharedPreferences sharedPreferences;

    public KeyChain(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "");
        this.sharedPreferences = sharedPreferences;
    }

    @Override // com.reown.android.internal.common.storage.key_chain.KeyStore
    public void setKey(@NotNull String str, @NotNull Key key) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(key, "");
        this.sharedPreferences.edit().putString(str, key.getKeyAsHex()).apply();
    }

    @Override // com.reown.android.internal.common.storage.key_chain.KeyStore
    public String getKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.sharedPreferences.getString(str, null);
    }

    @Override // com.reown.android.internal.common.storage.key_chain.KeyStore
    public void setKeys(@NotNull String str, @NotNull Key key, @NotNull Key key2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(key, "");
        Intrinsics.checkNotNullParameter(key2, "");
        this.sharedPreferences.edit().putString(str, concatKeys(key, key2)).apply();
    }

    @Override // com.reown.android.internal.common.storage.key_chain.KeyStore
    public Pair<String, String> getKeys(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String string = this.sharedPreferences.getString(str, null);
        if (string == null) {
            return null;
        }
        return splitKeys(string);
    }

    @Override // com.reown.android.internal.common.storage.key_chain.KeyStore
    public void deleteKeys(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (checkKeys(str)) {
            this.sharedPreferences.edit().remove(str).apply();
        }
    }

    @Override // com.reown.android.internal.common.storage.key_chain.KeyStore
    public boolean checkKeys(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.sharedPreferences.contains(str);
    }

    public final String concatKeys(Key key, Key key2) {
        return UtilFunctionsKt.bytesToHex(yDT.copydefault(UtilFunctionsKt.hexToBytes(key.getKeyAsHex()), UtilFunctionsKt.hexToBytes(key2.getKeyAsHex())));
    }

    public final Pair<String, String> splitKeys(String str) {
        byte[] bArrHexToBytes = UtilFunctionsKt.hexToBytes(str);
        return C56390yDp.OLrzqt(UtilFunctionsKt.bytesToHex(yDV.EZpvd(bArrHexToBytes, C56548yJl.AhwBna(0, bArrHexToBytes.length / 2))), UtilFunctionsKt.bytesToHex(yDV.EZpvd(bArrHexToBytes, C56548yJl.AhwBna(bArrHexToBytes.length / 2, bArrHexToBytes.length))));
    }
}
