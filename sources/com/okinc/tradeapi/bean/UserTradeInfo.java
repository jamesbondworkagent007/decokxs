package com.okinc.tradeapi.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.NamedCompanion;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class UserTradeInfo implements Parcelable {
    public static final int $stable = 0;
    public static final CREATOR CREATOR = new CREATOR(null);
    private final int tradeRemainDay;
    private final int tradeTotalDay;
    private final int traderRemainTask;
    private final int traderTotalTask;
    private final int userChallengeStatus;
    private final int userCompleteStatus;
    private final int userJoinStatus;
    private final int userReadStatus;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UserTradeInfo() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.userReadStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.userJoinStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.userCompleteStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.userChallengeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.tradeTotalDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.tradeRemainDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.traderTotalTask;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.traderRemainTask;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserTradeInfo copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return new UserTradeInfo(i, i2, i3, i4, i5, i6, i7, i8);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserTradeInfo)) {
            return false;
        }
        UserTradeInfo userTradeInfo = (UserTradeInfo) obj;
        return this.userReadStatus == userTradeInfo.userReadStatus && this.userJoinStatus == userTradeInfo.userJoinStatus && this.userCompleteStatus == userTradeInfo.userCompleteStatus && this.userChallengeStatus == userTradeInfo.userChallengeStatus && this.tradeTotalDay == userTradeInfo.tradeTotalDay && this.tradeRemainDay == userTradeInfo.tradeRemainDay && this.traderTotalTask == userTradeInfo.traderTotalTask && this.traderRemainTask == userTradeInfo.traderRemainTask;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTradeRemainDay() {
        return this.tradeRemainDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTradeTotalDay() {
        return this.tradeTotalDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTraderRemainTask() {
        return this.traderRemainTask;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTraderTotalTask() {
        return this.traderTotalTask;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getUserChallengeStatus() {
        return this.userChallengeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getUserCompleteStatus() {
        return this.userCompleteStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getUserJoinStatus() {
        return this.userJoinStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getUserReadStatus() {
        return this.userReadStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.userReadStatus) * 31) + Integer.hashCode(this.userJoinStatus)) * 31) + Integer.hashCode(this.userCompleteStatus)) * 31) + Integer.hashCode(this.userChallengeStatus)) * 31) + Integer.hashCode(this.tradeTotalDay)) * 31) + Integer.hashCode(this.tradeRemainDay)) * 31) + Integer.hashCode(this.traderTotalTask)) * 31) + Integer.hashCode(this.traderRemainTask);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UserTradeInfo(userReadStatus=" + this.userReadStatus + ", userJoinStatus=" + this.userJoinStatus + ", userCompleteStatus=" + this.userCompleteStatus + ", userChallengeStatus=" + this.userChallengeStatus + ", tradeTotalDay=" + this.tradeTotalDay + ", tradeRemainDay=" + this.tradeRemainDay + ", traderTotalTask=" + this.traderTotalTask + ", traderRemainTask=" + this.traderRemainTask + ")";
    }

    public /* synthetic */ UserTradeInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.userReadStatus = 0;
        } else {
            this.userReadStatus = i2;
        }
        if ((i & 2) == 0) {
            this.userJoinStatus = 0;
        } else {
            this.userJoinStatus = i3;
        }
        if ((i & 4) == 0) {
            this.userCompleteStatus = 0;
        } else {
            this.userCompleteStatus = i4;
        }
        if ((i & 8) == 0) {
            this.userChallengeStatus = 0;
        } else {
            this.userChallengeStatus = i5;
        }
        if ((i & 16) == 0) {
            this.tradeTotalDay = 0;
        } else {
            this.tradeTotalDay = i6;
        }
        if ((i & 32) == 0) {
            this.tradeRemainDay = 0;
        } else {
            this.tradeRemainDay = i7;
        }
        if ((i & 64) == 0) {
            this.traderTotalTask = 0;
        } else {
            this.traderTotalTask = i8;
        }
        if ((i & 128) == 0) {
            this.traderRemainTask = 0;
        } else {
            this.traderRemainTask = i9;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(UserTradeInfo userTradeInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || userTradeInfo.userReadStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, userTradeInfo.userReadStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || userTradeInfo.userJoinStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, userTradeInfo.userJoinStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || userTradeInfo.userCompleteStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, userTradeInfo.userCompleteStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || userTradeInfo.userChallengeStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, userTradeInfo.userChallengeStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || userTradeInfo.tradeTotalDay != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, userTradeInfo.tradeTotalDay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || userTradeInfo.tradeRemainDay != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, userTradeInfo.tradeRemainDay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || userTradeInfo.traderTotalTask != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 6, userTradeInfo.traderTotalTask);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && userTradeInfo.traderRemainTask == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 7, userTradeInfo.traderRemainTask);
    }

    public UserTradeInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.userReadStatus = i;
        this.userJoinStatus = i2;
        this.userCompleteStatus = i3;
        this.userChallengeStatus = i4;
        this.tradeTotalDay = i5;
        this.tradeRemainDay = i6;
        this.traderTotalTask = i7;
        this.traderRemainTask = i8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r10v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r11v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r12v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r13v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001f: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r14v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r15v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r16v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0035: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 int) : (0 int))
 A[MD:(int, int, int, int, int, int, int, int):void (m)] (LINE:11) call: com.okinc.tradeapi.bean.UserTradeInfo.<init>(int, int, int, int, int, int, int, int):void type: THIS */
    public /* synthetic */ UserTradeInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? 0 : i, (i9 & 2) != 0 ? 0 : i2, (i9 & 4) != 0 ? 0 : i3, (i9 & 8) != 0 ? 0 : i4, (i9 & 16) != 0 ? 0 : i5, (i9 & 32) != 0 ? 0 : i6, (i9 & 64) != 0 ? 0 : i7, (i9 & 128) == 0 ? i8 : 0);
    }

    public UserTradeInfo(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.readInt();
        parcel.readInt();
        parcel.readInt();
        parcel.readInt();
        parcel.readInt();
        parcel.readInt();
        parcel.readInt();
        throw new NotImplementedError("An operation is not implemented: detail");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.userReadStatus);
        parcel.writeInt(this.userJoinStatus);
        parcel.writeInt(this.userCompleteStatus);
        parcel.writeInt(this.userChallengeStatus);
        parcel.writeInt(this.tradeTotalDay);
        parcel.writeInt(this.tradeRemainDay);
        parcel.writeInt(this.traderTotalTask);
        parcel.writeInt(this.traderRemainTask);
    }

    /* JADX INFO: loaded from: classes24.dex */
    @NamedCompanion
    public static final class CREATOR implements Parcelable.Creator<UserTradeInfo> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradeapi.bean.UserTradeInfo.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final KSerializer<UserTradeInfo> serializer() {
            return UserTradeInfo$$serializer.INSTANCE;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UserTradeInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UserTradeInfo(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UserTradeInfo[] newArray(int i) {
            return new UserTradeInfo[i];
        }
    }
}
