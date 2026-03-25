package o;

import com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sOb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44391sOb {
    public final java.lang.String EZpvd;
    public final SystemMessageData copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C44391sOb copy$default(C44391sOb c44391sOb, java.lang.String str, SystemMessageData systemMessageData, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c44391sOb.EZpvd;
        }
        if ((i & 2) != 0) {
            systemMessageData = c44391sOb.copydefault;
        }
        return c44391sOb.KWHzl(str, systemMessageData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44391sOb KWHzl(@NotNull java.lang.String str, @NotNull SystemMessageData systemMessageData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(systemMessageData, "");
        return new C44391sOb(str, systemMessageData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SystemMessageData OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44391sOb)) {
            return false;
        }
        C44391sOb c44391sOb = (C44391sOb) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c44391sOb.EZpvd) && Intrinsics.EZpvd(this.copydefault, c44391sOb.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SystemMessageEvent(channelId=" + this.EZpvd + ", data=" + this.copydefault + ")";
    }

    public C44391sOb(@NotNull java.lang.String str, @NotNull SystemMessageData systemMessageData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(systemMessageData, "");
        this.EZpvd = str;
        this.copydefault = systemMessageData;
    }
}
