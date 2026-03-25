package o;

import android.security.keystore.KeyGenParameterSpec;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;
import com.google.android.gms.stats.CodePackage;
import com.okinc.business.defi.wallet.common.tonconnect.storage.EncryptedStorageProvider$get$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ecr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16065ecr {
    public final android.content.Context AEQbTJ;
    public volatile android.content.SharedPreferences EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final java.lang.Object OLrzqt;

    public C16065ecr(@NotNull android.content.Context context, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = context;
        this.KWHzl = coroutineDispatcher;
        this.OLrzqt = new java.lang.Object();
    }

    public final java.lang.Object KWHzl(@NotNull Continuation<? super android.content.SharedPreferences> continuation) {
        return BuildersKt.withContext(this.KWHzl, new EncryptedStorageProvider$get$2(this, null), continuation);
    }

    public final android.content.SharedPreferences EZpvd() {
        android.content.SharedPreferences sharedPreferencesCreate;
        synchronized (this) {
            KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder("okx_wallet", 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256).build();
            Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild, "");
            MasterKey masterKeyBuild = new MasterKey.Builder(this.AEQbTJ, "okx_wallet").setKeyGenParameterSpec(keyGenParameterSpecBuild).build();
            Intrinsics.checkNotNullExpressionValue(masterKeyBuild, "");
            sharedPreferencesCreate = EncryptedSharedPreferences.create(this.AEQbTJ, "okx_wallet_storage", masterKeyBuild, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesCreate, "");
        }
        return sharedPreferencesCreate;
    }
}
