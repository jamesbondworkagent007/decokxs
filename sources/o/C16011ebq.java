package o;

import com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession;
import com.okinc.business.defi.wallet.common.okxconnect.storage.OKXConnectCacheManager$addOrReplaceDAppSession$1;
import com.okinc.business.defi.wallet.common.okxconnect.storage.OKXConnectCacheManager$getExpiredSessionClientIds$2;
import com.okinc.business.defi.wallet.common.okxconnect.storage.OKXConnectCacheManager$getWalletIdToDAppSessionList$2;
import com.okinc.business.defi.wallet.common.okxconnect.storage.OKXConnectCacheManager$getWebSocketJwt$2;
import com.okinc.business.defi.wallet.common.okxconnect.storage.OKXConnectCacheManager$getWebSocketJwtKeypair$2;
import com.okinc.business.defi.wallet.common.okxconnect.storage.OKXConnectCacheManager$isEncryptedPrefsInit$2;
import com.okinc.business.defi.wallet.common.okxconnect.storage.OKXConnectCacheManager$removeAllDAppSessionsByWalletId$1;
import com.okinc.business.defi.wallet.common.okxconnect.storage.OKXConnectCacheManager$removeDAppSession$1;
import com.okinc.business.defi.wallet.common.okxconnect.storage.OKXConnectCacheManager$updateDAppSession$1;
import com.okinc.business.defi.wallet.common.okxconnect.storage.OKXConnectCacheManager$updateWalletIdToDAppSessionList$1;
import com.okinc.business.defi.wallet.common.okxconnect.storage.OKXConnectCacheManager$updateWebSocketJwt$1;
import com.okinc.business.defi.wallet.common.okxconnect.storage.OKXConnectCacheManager$updateWebSocketJwtKeyPair$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.Ed25519KeyPair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ebq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16011ebq {
    public final CoroutineScope AEQbTJ;
    public final KSerializer<java.util.Map<java.lang.String, java.util.List<DAppSession>>> KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final C16065ecr copydefault;

    public C16011ebq(@NotNull C16065ecr c16065ecr, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c16065ecr, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = c16065ecr;
        this.OLrzqt = coroutineDispatcher;
        this.AEQbTJ = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
        this.KWHzl = new LinkedHashMapSerializer(StringSerializer.INSTANCE, new ArrayListSerializer(DAppSession.Companion.serializer()));
    }

    public final java.lang.Object KWHzl(Continuation<? super android.content.SharedPreferences> continuation) {
        return this.copydefault.KWHzl(continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull Continuation<? super java.util.Map<java.lang.String, ? extends java.util.List<DAppSession>>> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new OKXConnectCacheManager$getWalletIdToDAppSessionList$2(this, null), continuation);
    }

    public final Job copydefault(java.util.Map<java.lang.String, ? extends java.util.List<DAppSession>> map) {
        return BuildersKt__Builders_commonKt.launch$default(this.AEQbTJ, null, null, new OKXConnectCacheManager$updateWalletIdToDAppSessionList$1(this, map, null), 3, null);
    }

    public final java.lang.Object EZpvd(@NotNull Continuation<? super java.lang.String> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new OKXConnectCacheManager$getWebSocketJwt$2(this, null), continuation);
    }

    public final Job AEQbTJ(java.lang.String str) {
        return BuildersKt__Builders_commonKt.launch$default(this.AEQbTJ, null, null, new OKXConnectCacheManager$updateWebSocketJwt$1(this, str, null), 3, null);
    }

    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Ed25519KeyPair> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new OKXConnectCacheManager$getWebSocketJwtKeypair$2(this, null), continuation);
    }

    public final Job EZpvd(Ed25519KeyPair ed25519KeyPair) {
        return BuildersKt__Builders_commonKt.launch$default(this.AEQbTJ, null, null, new OKXConnectCacheManager$updateWebSocketJwtKeyPair$1(ed25519KeyPair, this, null), 3, null);
    }

    public final java.lang.Object copydefault(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new OKXConnectCacheManager$isEncryptedPrefsInit$2(this, null), continuation);
    }

    public final Job OLrzqt(@NotNull java.lang.String str, @NotNull DAppSession dAppSession) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dAppSession, "");
        return BuildersKt__Builders_commonKt.launch$default(this.AEQbTJ, null, null, new OKXConnectCacheManager$addOrReplaceDAppSession$1(this, str, dAppSession, null), 3, null);
    }

    public final Job copydefault(@NotNull java.lang.String str, @NotNull DAppSession dAppSession) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dAppSession, "");
        return BuildersKt__Builders_commonKt.launch$default(this.AEQbTJ, null, null, new OKXConnectCacheManager$updateDAppSession$1(this, str, dAppSession, null), 3, null);
    }

    public final Job OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return BuildersKt__Builders_commonKt.launch$default(this.AEQbTJ, null, null, new OKXConnectCacheManager$removeDAppSession$1(this, str, null), 3, null);
    }

    public final Job KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return BuildersKt__Builders_commonKt.launch$default(this.AEQbTJ, null, null, new OKXConnectCacheManager$removeAllDAppSessionsByWalletId$1(this, str, null), 3, null);
    }

    public final java.lang.Object AEQbTJ(int i, @NotNull Continuation<? super java.util.List<java.lang.String>> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new OKXConnectCacheManager$getExpiredSessionClientIds$2(this, i, null), continuation);
    }

    public final void KWHzl() {
        copydefault(C56424yEw.KWHzl());
        AEQbTJ((java.lang.String) null);
        EZpvd((Ed25519KeyPair) null);
    }
}
