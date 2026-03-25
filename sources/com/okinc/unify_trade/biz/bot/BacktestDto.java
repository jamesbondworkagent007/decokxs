package com.okinc.unify_trade.biz.bot;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C55812xqx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class BacktestDto implements Parcelable {
    public static final int $stable = 0;
    private final String finishTime;
    private final String progress;
    private final String startTime;
    private final BotStatus status;
    private final String virtualEndTime;
    private final String virtualStartTime;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BacktestDto> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BacktestDto> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BacktestDto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BacktestDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BotStatus.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BacktestDto[] newArray(int i) {
            return new BacktestDto[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BacktestDto() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (BotStatus) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BacktestDto copy$default(BacktestDto backtestDto, String str, String str2, String str3, String str4, String str5, BotStatus botStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            str = backtestDto.progress;
        }
        if ((i & 2) != 0) {
            str2 = backtestDto.virtualStartTime;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = backtestDto.virtualEndTime;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = backtestDto.startTime;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = backtestDto.finishTime;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            botStatus = backtestDto.status;
        }
        return backtestDto.copy(str, str6, str7, str8, str9, botStatus);
    }

    @SerialName("status")
    @Serializable(with = C55812xqx.class)
    public static /* synthetic */ void getStatus$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.progress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.virtualStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.virtualEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.finishTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotStatus component6() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BacktestDto copy(@NotNull String str, String str2, String str3, String str4, String str5, BotStatus botStatus) {
        Intrinsics.checkNotNullParameter(str, "");
        return new BacktestDto(str, str2, str3, str4, str5, botStatus);
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
        if (!(obj instanceof BacktestDto)) {
            return false;
        }
        BacktestDto backtestDto = (BacktestDto) obj;
        return Intrinsics.EZpvd((Object) this.progress, (Object) backtestDto.progress) && Intrinsics.EZpvd((Object) this.virtualStartTime, (Object) backtestDto.virtualStartTime) && Intrinsics.EZpvd((Object) this.virtualEndTime, (Object) backtestDto.virtualEndTime) && Intrinsics.EZpvd((Object) this.startTime, (Object) backtestDto.startTime) && Intrinsics.EZpvd((Object) this.finishTime, (Object) backtestDto.finishTime) && this.status == backtestDto.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFinishTime() {
        return this.finishTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProgress() {
        return this.progress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotStatus getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVirtualEndTime() {
        return this.virtualEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVirtualStartTime() {
        return this.virtualStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.progress.hashCode();
        String str = this.virtualStartTime;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.virtualEndTime;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.startTime;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.finishTime;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        BotStatus botStatus = this.status;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (botStatus != null ? botStatus.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BacktestDto(progress=" + this.progress + ", virtualStartTime=" + this.virtualStartTime + ", virtualEndTime=" + this.virtualEndTime + ", startTime=" + this.startTime + ", finishTime=" + this.finishTime + ", status=" + this.status + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.progress);
        parcel.writeString(this.virtualStartTime);
        parcel.writeString(this.virtualEndTime);
        parcel.writeString(this.startTime);
        parcel.writeString(this.finishTime);
        BotStatus botStatus = this.status;
        if (botStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            botStatus.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.bot.BacktestDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BacktestDto> serializer() {
            return BacktestDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BacktestDto(int i, String str, String str2, String str3, String str4, String str5, BotStatus botStatus, SerializationConstructorMarker serializationConstructorMarker) {
        this.progress = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.virtualStartTime = null;
        } else {
            this.virtualStartTime = str2;
        }
        if ((i & 4) == 0) {
            this.virtualEndTime = null;
        } else {
            this.virtualEndTime = str3;
        }
        if ((i & 8) == 0) {
            this.startTime = null;
        } else {
            this.startTime = str4;
        }
        if ((i & 16) == 0) {
            this.finishTime = null;
        } else {
            this.finishTime = str5;
        }
        if ((i & 32) == 0) {
            this.status = null;
        } else {
            this.status = botStatus;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BacktestDto backtestDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) backtestDto.progress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, backtestDto.progress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || backtestDto.virtualStartTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, backtestDto.virtualStartTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || backtestDto.virtualEndTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, backtestDto.virtualEndTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || backtestDto.startTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, backtestDto.startTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || backtestDto.finishTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, backtestDto.finishTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && backtestDto.status == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, C55812xqx.EZpvd, backtestDto.status);
    }

    public BacktestDto(@NotNull String str, String str2, String str3, String str4, String str5, BotStatus botStatus) {
        Intrinsics.checkNotNullParameter(str, "");
        this.progress = str;
        this.virtualStartTime = str2;
        this.virtualEndTime = str3;
        this.startTime = str4;
        this.finishTime = str5;
        this.status = botStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.bot.BotStatus:?: TERNARY null = ((wrap:int:0x0023: ARITH (r11v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r10v0 com.okinc.unify_trade.biz.bot.BotStatus) : (null com.okinc.unify_trade.biz.bot.BotStatus))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.bot.BotStatus):void (m)] (LINE:50) call: com.okinc.unify_trade.biz.bot.BacktestDto.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.bot.BotStatus):void type: THIS */
    public /* synthetic */ BacktestDto(String str, String str2, String str3, String str4, String str5, BotStatus botStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) == 0 ? botStatus : null);
    }
}
