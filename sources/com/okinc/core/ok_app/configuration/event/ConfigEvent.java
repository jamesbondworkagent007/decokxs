package com.okinc.core.ok_app.configuration.event;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class ConfigEvent implements Parcelable {
    public static final Parcelable.Creator<ConfigEvent> CREATOR = new Creator();
    public boolean AEQbTJ;
    public boolean EZpvd;
    public boolean KWHzl;
    public boolean copydefault;

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<ConfigEvent> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfigEvent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ConfigEvent(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfigEvent[] newArray(int i) {
            return new ConfigEvent[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ConfigEvent() {
        this(false, false, false, false, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ConfigEvent copy$default(ConfigEvent configEvent, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = configEvent.AEQbTJ;
        }
        if ((i & 2) != 0) {
            z2 = configEvent.EZpvd;
        }
        if ((i & 4) != 0) {
            z3 = configEvent.copydefault;
        }
        if ((i & 8) != 0) {
            z4 = configEvent.KWHzl;
        }
        return configEvent.OLrzqt(z, z2, z3, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConfigEvent OLrzqt(boolean z, boolean z2, boolean z3, boolean z4) {
        return new ConfigEvent(z, z2, z3, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.AEQbTJ || this.EZpvd || this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.EZpvd;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigEvent)) {
            return false;
        }
        ConfigEvent configEvent = (ConfigEvent) obj;
        return this.AEQbTJ == configEvent.AEQbTJ && this.EZpvd == configEvent.EZpvd && this.copydefault == configEvent.copydefault && this.KWHzl == configEvent.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Boolean.hashCode(this.AEQbTJ) * 31) + Boolean.hashCode(this.EZpvd)) * 31) + Boolean.hashCode(this.copydefault)) * 31) + Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConfigEvent(isLangUpdated=" + this.AEQbTJ + ", isThemeUpdated=" + this.EZpvd + ", isAppModeUpdated=" + this.copydefault + ", isTabBarUpdated=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
        parcel.writeInt(this.EZpvd ? 1 : 0);
        parcel.writeInt(this.copydefault ? 1 : 0);
        parcel.writeInt(this.KWHzl ? 1 : 0);
    }

    public ConfigEvent(boolean z, boolean z2, boolean z3, boolean z4) {
        this.AEQbTJ = z;
        this.EZpvd = z2;
        this.copydefault = z3;
        this.KWHzl = z4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(boolean, boolean, boolean, boolean):void (m)] (LINE:7) call: com.okinc.core.ok_app.configuration.event.ConfigEvent.<init>(boolean, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ ConfigEvent(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
    }
}
