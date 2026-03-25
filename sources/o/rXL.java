package o;

import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.InHouseIMChannelType;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rXL {
    public static final int EZpvd = 0;
    public final int AEQbTJ;
    public final InHouseIMChannelType AYXKKw;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final boolean djBIcL;
    public final java.lang.String valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final java.util.Map<java.lang.String, rXL> KWHzl = new LinkedHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ rXL copy$default(rXL rxl, boolean z, InHouseIMChannelType inHouseIMChannelType, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = rxl.djBIcL;
        }
        if ((i2 & 2) != 0) {
            inHouseIMChannelType = rxl.AYXKKw;
        }
        InHouseIMChannelType inHouseIMChannelType2 = inHouseIMChannelType;
        if ((i2 & 4) != 0) {
            str = rxl.OLrzqt;
        }
        java.lang.String str4 = str;
        if ((i2 & 8) != 0) {
            str2 = rxl.valueOf;
        }
        java.lang.String str5 = str2;
        if ((i2 & 16) != 0) {
            i = rxl.AEQbTJ;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            str3 = rxl.copydefault;
        }
        return rxl.EZpvd(z, inHouseIMChannelType2, str4, str5, i3, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final rXL EZpvd(boolean z, @NotNull InHouseIMChannelType inHouseIMChannelType, @NotNull java.lang.String str, @NotNull java.lang.String str2, @androidx.annotation.DrawableRes int i, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(inHouseIMChannelType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new rXL(z, inHouseIMChannelType, str, str2, i, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rXL)) {
            return false;
        }
        rXL rxl = (rXL) obj;
        return this.djBIcL == rxl.djBIcL && this.AYXKKw == rxl.AYXKKw && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) rxl.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) rxl.valueOf) && this.AEQbTJ == rxl.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) rxl.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((java.lang.Boolean.hashCode(this.djBIcL) * 31) + this.AYXKKw.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NotificationChannelMetadata(isDefault=" + this.djBIcL + ", channelType=" + this.AYXKKw + ", categoryKey=" + this.OLrzqt + ", channelId=" + this.valueOf + ", categoryIconResId=" + this.AEQbTJ + ", categoryLabel=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMChannelType valueOf() {
        return this.AYXKKw;
    }

    public rXL(boolean z, @NotNull InHouseIMChannelType inHouseIMChannelType, @NotNull java.lang.String str, @NotNull java.lang.String str2, @androidx.annotation.DrawableRes int i, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(inHouseIMChannelType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.djBIcL = z;
        this.AYXKKw = inHouseIMChannelType;
        this.OLrzqt = str;
        this.valueOf = str2;
        this.AEQbTJ = i;
        this.copydefault = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ rXL(boolean z, InHouseIMChannelType inHouseIMChannelType, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        java.lang.String str4;
        boolean z2 = (i2 & 1) != 0 ? false : z;
        InHouseIMChannelType inHouseIMChannelType2 = (i2 & 2) != 0 ? InHouseIMChannelType.SystemNotification : inHouseIMChannelType;
        if ((i2 & 8) != 0) {
            if (z2) {
                str4 = "Notifications";
            } else {
                str4 = "_NOTIFICATION_CHANNEL_" + str;
            }
            str2 = str4;
        }
        this(z2, inHouseIMChannelType2, str, str2, (i2 & 16) != 0 ? C52761wXj.TaskDescription.UeEOUB : i, str3);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rXL.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ rXL putNotificationChannel$default(TaskDescription taskDescription, java.lang.String str, java.lang.String str2, int i, boolean z, int i2, java.lang.Object obj) {
            if ((i2 & 4) != 0) {
                i = C52761wXj.TaskDescription.UeEOUB;
            }
            if ((i2 & 8) != 0) {
                z = false;
            }
            return taskDescription.KWHzl(str, str2, i, z);
        }

        public final rXL KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @androidx.annotation.DrawableRes int i, boolean z) {
            rXL rxl;
            synchronized (this) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                rxl = new rXL(z, null, str, null, i, str2, 10, null);
                rXL.KWHzl.put(rxl.EZpvd(), rxl);
            }
            return rxl;
        }

        public final void EZpvd() {
            synchronized (this) {
                rXL rxl = (rXL) rXL.KWHzl.get("Notifications");
                rXL.KWHzl.clear();
                if (rxl != null) {
                    rXL.KWHzl.put("Notifications", rxl);
                }
            }
        }

        public final java.util.List<rXL> KWHzl() {
            java.util.List<rXL> listAxsJAYsNCnLh;
            synchronized (this) {
                listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(rXL.KWHzl.values());
            }
            return listAxsJAYsNCnLh;
        }

        public final rXL EZpvd(@NotNull java.lang.String str) {
            rXL rxl;
            synchronized (this) {
                Intrinsics.checkNotNullParameter(str, "");
                rxl = (rXL) rXL.KWHzl.get(str);
            }
            return rxl;
        }
    }
}
