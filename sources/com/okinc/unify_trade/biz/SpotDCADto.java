package com.okinc.unify_trade.biz;

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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class SpotDCADto implements Parcelable {
    public static final int $stable = 0;
    private final DCACurrentBalanceDto currentBalance;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SpotDCADto> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SpotDCADto> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotDCADto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SpotDCADto(parcel.readInt() == 0 ? null : DCACurrentBalanceDto.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotDCADto[] newArray(int i) {
            return new SpotDCADto[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SpotDCADto() {
        this((DCACurrentBalanceDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SpotDCADto copy$default(SpotDCADto spotDCADto, DCACurrentBalanceDto dCACurrentBalanceDto, int i, Object obj) {
        if ((i & 1) != 0) {
            dCACurrentBalanceDto = spotDCADto.currentBalance;
        }
        return spotDCADto.copy(dCACurrentBalanceDto);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DCACurrentBalanceDto component1() {
        return this.currentBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotDCADto copy(DCACurrentBalanceDto dCACurrentBalanceDto) {
        return new SpotDCADto(dCACurrentBalanceDto);
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
        return (obj instanceof SpotDCADto) && Intrinsics.EZpvd(this.currentBalance, ((SpotDCADto) obj).currentBalance);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DCACurrentBalanceDto getCurrentBalance() {
        return this.currentBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        DCACurrentBalanceDto dCACurrentBalanceDto = this.currentBalance;
        if (dCACurrentBalanceDto == null) {
            return 0;
        }
        return dCACurrentBalanceDto.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpotDCADto(currentBalance=" + this.currentBalance + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        DCACurrentBalanceDto dCACurrentBalanceDto = this.currentBalance;
        if (dCACurrentBalanceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dCACurrentBalanceDto.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SpotDCADto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotDCADto> serializer() {
            return SpotDCADto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpotDCADto(int i, DCACurrentBalanceDto dCACurrentBalanceDto, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.currentBalance = null;
        } else {
            this.currentBalance = dCACurrentBalanceDto;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SpotDCADto spotDCADto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && spotDCADto.currentBalance == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, DCACurrentBalanceDto$$serializer.INSTANCE, spotDCADto.currentBalance);
    }

    public SpotDCADto(DCACurrentBalanceDto dCACurrentBalanceDto) {
        this.currentBalance = dCACurrentBalanceDto;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.unify_trade.biz.DCACurrentBalanceDto:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.DCACurrentBalanceDto) : (r1v0 com.okinc.unify_trade.biz.DCACurrentBalanceDto))
 A[MD:(com.okinc.unify_trade.biz.DCACurrentBalanceDto):void (m)] (LINE:97) call: com.okinc.unify_trade.biz.SpotDCADto.<init>(com.okinc.unify_trade.biz.DCACurrentBalanceDto):void type: THIS */
    public /* synthetic */ SpotDCADto(DCACurrentBalanceDto dCACurrentBalanceDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dCACurrentBalanceDto);
    }
}
