package com.okinc.tradingbot.impl.botList.dto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class BacktestListPreviewDto implements Parcelable {
    public static final int $stable = 0;
    public final int all;
    public final int done;
    public final int running;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BacktestListPreviewDto> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<BacktestListPreviewDto> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BacktestListPreviewDto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BacktestListPreviewDto(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BacktestListPreviewDto[] newArray(int i) {
            return new BacktestListPreviewDto[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BacktestListPreviewDto() {
        this(0, 0, 0, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BacktestListPreviewDto copy$default(BacktestListPreviewDto backtestListPreviewDto, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = backtestListPreviewDto.all;
        }
        if ((i4 & 2) != 0) {
            i2 = backtestListPreviewDto.running;
        }
        if ((i4 & 4) != 0) {
            i3 = backtestListPreviewDto.done;
        }
        return backtestListPreviewDto.EZpvd(i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.all;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.running;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BacktestListPreviewDto EZpvd(int i, int i2, int i3) {
        return new BacktestListPreviewDto(i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.done;
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
        if (!(obj instanceof BacktestListPreviewDto)) {
            return false;
        }
        BacktestListPreviewDto backtestListPreviewDto = (BacktestListPreviewDto) obj;
        return this.all == backtestListPreviewDto.all && this.running == backtestListPreviewDto.running && this.done == backtestListPreviewDto.done;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Integer.hashCode(this.all) * 31) + Integer.hashCode(this.running)) * 31) + Integer.hashCode(this.done);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BacktestListPreviewDto(all=" + this.all + ", running=" + this.running + ", done=" + this.done + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.all);
        parcel.writeInt(this.running);
        parcel.writeInt(this.done);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.botList.dto.BacktestListPreviewDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BacktestListPreviewDto> serializer() {
            return BacktestListPreviewDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BacktestListPreviewDto(int i, int i2, int i3, int i4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.all = 0;
        } else {
            this.all = i2;
        }
        if ((i & 2) == 0) {
            this.running = 0;
        } else {
            this.running = i3;
        }
        if ((i & 4) == 0) {
            this.done = 0;
        } else {
            this.done = i4;
        }
    }

    public static final /* synthetic */ void EZpvd(BacktestListPreviewDto backtestListPreviewDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || backtestListPreviewDto.all != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, backtestListPreviewDto.all);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || backtestListPreviewDto.running != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, backtestListPreviewDto.running);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && backtestListPreviewDto.done == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 2, backtestListPreviewDto.done);
    }

    public BacktestListPreviewDto(int i, int i2, int i3) {
        this.all = i;
        this.running = i2;
        this.done = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(int, int, int):void (m)] (LINE:15) call: com.okinc.tradingbot.impl.botList.dto.BacktestListPreviewDto.<init>(int, int, int):void type: THIS */
    public /* synthetic */ BacktestListPreviewDto(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
