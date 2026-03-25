package o;

import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.SettingsChannel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class rZY {
    public final java.lang.String AEQbTJ;
    public final SettingsChannel EZpvd;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ rZY copy$default(rZY rzy, SettingsChannel settingsChannel, int i, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            settingsChannel = rzy.EZpvd;
        }
        if ((i2 & 2) != 0) {
            i = rzy.copydefault;
        }
        if ((i2 & 4) != 0) {
            str = rzy.AEQbTJ;
        }
        return rzy.OLrzqt(settingsChannel, i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SettingsChannel AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final rZY OLrzqt(@NotNull SettingsChannel settingsChannel, int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(settingsChannel, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new rZY(settingsChannel, i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rZY)) {
            return false;
        }
        rZY rzy = (rZY) obj;
        return Intrinsics.EZpvd(this.EZpvd, rzy.EZpvd) && this.copydefault == rzy.copydefault && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) rzy.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.EZpvd.hashCode() * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SettingsChannelRecyclerData(settingsChannel=" + this.EZpvd + ", msgType=" + this.copydefault + ", categoryName=" + this.AEQbTJ + ")";
    }

    public rZY(@NotNull SettingsChannel settingsChannel, int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(settingsChannel, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = settingsChannel;
        this.copydefault = i;
        this.AEQbTJ = str;
    }
}
