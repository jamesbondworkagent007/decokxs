package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.growth.SharePlatform;

/* JADX INFO: renamed from: o.AQo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C2563AQo {
    public static final int $stable = 8;
    public java.util.List<? extends SharePlatform> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.AQo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C2563AQo copy$default(C2563AQo c2563AQo, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c2563AQo.EZpvd;
        }
        return c2563AQo.AEQbTJ(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2563AQo AEQbTJ(@NotNull java.util.List<? extends SharePlatform> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C2563AQo(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends uniffi.growth.SharePlatform>, java.util.List<uniffi.growth.SharePlatform> */
    public final java.util.List<SharePlatform> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2563AQo) && Intrinsics.EZpvd(this.EZpvd, ((C2563AQo) obj).EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SharePlatformsConfig(replacedSharePlatforms=" + this.EZpvd + ")";
    }

    public C2563AQo(@NotNull java.util.List<? extends SharePlatform> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = list;
    }
}
