package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.WaitOnlineRankResponseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class WaitOnlineRank implements Parcelable {
    public static final int $stable = 0;
    private final String displayId;
    private final String icon;
    private final String instId;
    private final String onlineTs;
    private final String openMethod;
    private final String type;
    private final String waitOnlineTime;
    public static final Activity Companion = new Activity(null);
    public static final Parcelable.Creator<WaitOnlineRank> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<WaitOnlineRank> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WaitOnlineRank createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WaitOnlineRank(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WaitOnlineRank[] newArray(int i) {
            return new WaitOnlineRank[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WaitOnlineRank() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WaitOnlineRank copy$default(WaitOnlineRank waitOnlineRank, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = waitOnlineRank.instId;
        }
        if ((i & 2) != 0) {
            str2 = waitOnlineRank.displayId;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = waitOnlineRank.icon;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = waitOnlineRank.onlineTs;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = waitOnlineRank.waitOnlineTime;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = waitOnlineRank.type;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = waitOnlineRank.openMethod;
        }
        return waitOnlineRank.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.onlineTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.waitOnlineTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.openMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WaitOnlineRank copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new WaitOnlineRank(str, str2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof WaitOnlineRank)) {
            return false;
        }
        WaitOnlineRank waitOnlineRank = (WaitOnlineRank) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) waitOnlineRank.instId) && Intrinsics.EZpvd((Object) this.displayId, (Object) waitOnlineRank.displayId) && Intrinsics.EZpvd((Object) this.icon, (Object) waitOnlineRank.icon) && Intrinsics.EZpvd((Object) this.onlineTs, (Object) waitOnlineRank.onlineTs) && Intrinsics.EZpvd((Object) this.waitOnlineTime, (Object) waitOnlineRank.waitOnlineTime) && Intrinsics.EZpvd((Object) this.type, (Object) waitOnlineRank.type) && Intrinsics.EZpvd((Object) this.openMethod, (Object) waitOnlineRank.openMethod);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayId() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOnlineTs() {
        return this.onlineTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpenMethod() {
        return this.openMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWaitOnlineTime() {
        return this.waitOnlineTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.instId.hashCode() * 31) + this.displayId.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.onlineTs.hashCode()) * 31) + this.waitOnlineTime.hashCode()) * 31) + this.type.hashCode()) * 31) + this.openMethod.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WaitOnlineRank(instId=" + this.instId + ", displayId=" + this.displayId + ", icon=" + this.icon + ", onlineTs=" + this.onlineTs + ", waitOnlineTime=" + this.waitOnlineTime + ", type=" + this.type + ", openMethod=" + this.openMethod + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instId);
        parcel.writeString(this.displayId);
        parcel.writeString(this.icon);
        parcel.writeString(this.onlineTs);
        parcel.writeString(this.waitOnlineTime);
        parcel.writeString(this.type);
        parcel.writeString(this.openMethod);
    }

    public WaitOnlineRank(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.instId = str;
        this.displayId = str2;
        this.icon = str3;
        this.onlineTs = str4;
        this.waitOnlineTime = str5;
        this.type = str6;
        this.openMethod = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:69) call: com.okinc.crcore.shared.net.responsebean.WaitOnlineRank.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ WaitOnlineRank(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.WaitOnlineRank.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final WaitOnlineRank KWHzl(@NotNull WaitOnlineRankResponseBean waitOnlineRankResponseBean) {
            Intrinsics.checkNotNullParameter(waitOnlineRankResponseBean, "");
            return new WaitOnlineRank(waitOnlineRankResponseBean.getInstId(), waitOnlineRankResponseBean.getDisplayId(), waitOnlineRankResponseBean.getIcon(), waitOnlineRankResponseBean.getOnlineTs(), waitOnlineRankResponseBean.getWaitOnlineTime(), waitOnlineRankResponseBean.getType(), waitOnlineRankResponseBean.getOpenMethod());
        }
    }
}
