package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.FollowRankResponseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class FollowRankBean implements Parcelable {
    public static final int $stable = 0;
    private final String followerLimit;
    private final String followerNum;
    private final String nickName;
    private final String portrait;
    private final String targetId;
    private final String uniqueName;
    private final String yieldRatio;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final Parcelable.Creator<FollowRankBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<FollowRankBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FollowRankBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FollowRankBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FollowRankBean[] newArray(int i) {
            return new FollowRankBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FollowRankBean() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FollowRankBean copy$default(FollowRankBean followRankBean, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = followRankBean.uniqueName;
        }
        if ((i & 2) != 0) {
            str2 = followRankBean.nickName;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = followRankBean.portrait;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = followRankBean.targetId;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = followRankBean.followerNum;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = followRankBean.followerLimit;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = followRankBean.yieldRatio;
        }
        return followRankBean.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.uniqueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.portrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.targetId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.followerNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.followerLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.yieldRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FollowRankBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new FollowRankBean(str, str2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof FollowRankBean)) {
            return false;
        }
        FollowRankBean followRankBean = (FollowRankBean) obj;
        return Intrinsics.EZpvd((Object) this.uniqueName, (Object) followRankBean.uniqueName) && Intrinsics.EZpvd((Object) this.nickName, (Object) followRankBean.nickName) && Intrinsics.EZpvd((Object) this.portrait, (Object) followRankBean.portrait) && Intrinsics.EZpvd((Object) this.targetId, (Object) followRankBean.targetId) && Intrinsics.EZpvd((Object) this.followerNum, (Object) followRankBean.followerNum) && Intrinsics.EZpvd((Object) this.followerLimit, (Object) followRankBean.followerLimit) && Intrinsics.EZpvd((Object) this.yieldRatio, (Object) followRankBean.yieldRatio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFollowerLimit() {
        return this.followerLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFollowerNum() {
        return this.followerNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPortrait() {
        return this.portrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetId() {
        return this.targetId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUniqueName() {
        return this.uniqueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getYieldRatio() {
        return this.yieldRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.uniqueName.hashCode() * 31) + this.nickName.hashCode()) * 31) + this.portrait.hashCode()) * 31) + this.targetId.hashCode()) * 31) + this.followerNum.hashCode()) * 31) + this.followerLimit.hashCode()) * 31) + this.yieldRatio.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FollowRankBean(uniqueName=" + this.uniqueName + ", nickName=" + this.nickName + ", portrait=" + this.portrait + ", targetId=" + this.targetId + ", followerNum=" + this.followerNum + ", followerLimit=" + this.followerLimit + ", yieldRatio=" + this.yieldRatio + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.uniqueName);
        parcel.writeString(this.nickName);
        parcel.writeString(this.portrait);
        parcel.writeString(this.targetId);
        parcel.writeString(this.followerNum);
        parcel.writeString(this.followerLimit);
        parcel.writeString(this.yieldRatio);
    }

    public FollowRankBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.uniqueName = str;
        this.nickName = str2;
        this.portrait = str3;
        this.targetId = str4;
        this.followerNum = str5;
        this.followerLimit = str6;
        this.yieldRatio = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:31) call: com.okinc.crcore.shared.net.responsebean.FollowRankBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FollowRankBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.FollowRankBean.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final FollowRankBean OLrzqt(@NotNull FollowRankResponseBean followRankResponseBean) {
            Intrinsics.checkNotNullParameter(followRankResponseBean, "");
            return new FollowRankBean(followRankResponseBean.getUniqueName(), followRankResponseBean.getNickName(), followRankResponseBean.getPortrait(), followRankResponseBean.getTargetId(), followRankResponseBean.getFollowerNum(), followRankResponseBean.getFollowerLimit(), followRankResponseBean.getYieldRatio());
        }
    }
}
