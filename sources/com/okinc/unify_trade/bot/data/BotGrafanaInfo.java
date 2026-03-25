package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class BotGrafanaInfo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BotGrafanaInfo> CREATOR = new Creator();
    private final String createCount;
    private final String createStateCode;
    private final String errorMsg;
    private final boolean secondaryConfirm;

    public static final class Creator implements Parcelable.Creator<BotGrafanaInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotGrafanaInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BotGrafanaInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotGrafanaInfo[] newArray(int i) {
            return new BotGrafanaInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BotGrafanaInfo copy$default(BotGrafanaInfo botGrafanaInfo, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = botGrafanaInfo.createCount;
        }
        if ((i & 2) != 0) {
            str2 = botGrafanaInfo.errorMsg;
        }
        if ((i & 4) != 0) {
            str3 = botGrafanaInfo.createStateCode;
        }
        if ((i & 8) != 0) {
            z = botGrafanaInfo.secondaryConfirm;
        }
        return botGrafanaInfo.copy(str, str2, str3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.createCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.errorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.createStateCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.secondaryConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotGrafanaInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new BotGrafanaInfo(str, str2, str3, z);
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
        if (!(obj instanceof BotGrafanaInfo)) {
            return false;
        }
        BotGrafanaInfo botGrafanaInfo = (BotGrafanaInfo) obj;
        return Intrinsics.EZpvd((Object) this.createCount, (Object) botGrafanaInfo.createCount) && Intrinsics.EZpvd((Object) this.errorMsg, (Object) botGrafanaInfo.errorMsg) && Intrinsics.EZpvd((Object) this.createStateCode, (Object) botGrafanaInfo.createStateCode) && this.secondaryConfirm == botGrafanaInfo.secondaryConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreateCount() {
        return this.createCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreateStateCode() {
        return this.createStateCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSecondaryConfirm() {
        return this.secondaryConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.createCount.hashCode() * 31) + this.errorMsg.hashCode()) * 31) + this.createStateCode.hashCode()) * 31) + Boolean.hashCode(this.secondaryConfirm);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotGrafanaInfo(createCount=" + this.createCount + ", errorMsg=" + this.errorMsg + ", createStateCode=" + this.createStateCode + ", secondaryConfirm=" + this.secondaryConfirm + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.createCount);
        parcel.writeString(this.errorMsg);
        parcel.writeString(this.createStateCode);
        parcel.writeInt(this.secondaryConfirm ? 1 : 0);
    }

    public BotGrafanaInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.createCount = str;
        this.errorMsg = str2;
        this.createStateCode = str3;
        this.secondaryConfirm = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (r5v0 boolean)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:1441) call: com.okinc.unify_trade.bot.data.BotGrafanaInfo.<init>(java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ BotGrafanaInfo(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, z);
    }
}
