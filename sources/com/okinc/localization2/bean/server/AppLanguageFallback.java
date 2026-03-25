package com.okinc.localization2.bean.server;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class AppLanguageFallback {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String KEY_DEFAULT_FALLBACK = "defaultFallback";
    private final String defaultFallback;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AppLanguageFallback copy$default(AppLanguageFallback appLanguageFallback, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appLanguageFallback.defaultFallback;
        }
        return appLanguageFallback.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.defaultFallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppLanguageFallback copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AppLanguageFallback(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppLanguageFallback) && Intrinsics.EZpvd((Object) this.defaultFallback, (Object) ((AppLanguageFallback) obj).defaultFallback);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefaultFallback() {
        return this.defaultFallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.defaultFallback.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AppLanguageFallback(defaultFallback=" + this.defaultFallback + ")";
    }

    public /* synthetic */ AppLanguageFallback(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, AppLanguageFallback$$serializer.INSTANCE.getDescriptor());
        }
        this.defaultFallback = str;
    }

    public AppLanguageFallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.defaultFallback = str;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.localization2.bean.server.AppLanguageFallback.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AppLanguageFallback> serializer() {
            return AppLanguageFallback$$serializer.INSTANCE;
        }
    }
}
