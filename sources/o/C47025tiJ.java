package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tiJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C47025tiJ {
    public static final int $stable = 8;

    @SerializedName("deviceInfo")
    private final java.util.Map<java.lang.String, java.lang.String> deviceInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tiJ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C47025tiJ copy$default(C47025tiJ c47025tiJ, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = c47025tiJ.deviceInfo;
        }
        return c47025tiJ.KWHzl(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47025tiJ KWHzl(@NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return new C47025tiJ(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C47025tiJ) && Intrinsics.EZpvd(this.deviceInfo, ((C47025tiJ) obj).deviceInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.deviceInfo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DeviceProfileBody(deviceInfo=" + this.deviceInfo + ")";
    }

    public C47025tiJ(@NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.deviceInfo = map;
    }
}
