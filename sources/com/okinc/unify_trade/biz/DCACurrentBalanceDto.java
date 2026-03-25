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
public final class DCACurrentBalanceDto implements Parcelable {
    public static final int $stable = 0;
    private final DCACoinBalanceDto baseCoin;
    private final DCACoinBalanceDto quoteCoin;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DCACurrentBalanceDto> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DCACurrentBalanceDto> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DCACurrentBalanceDto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DCACurrentBalanceDto(parcel.readInt() == 0 ? null : DCACoinBalanceDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DCACoinBalanceDto.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DCACurrentBalanceDto[] newArray(int i) {
            return new DCACurrentBalanceDto[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DCACurrentBalanceDto() {
        this((DCACoinBalanceDto) null, (DCACoinBalanceDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DCACurrentBalanceDto copy$default(DCACurrentBalanceDto dCACurrentBalanceDto, DCACoinBalanceDto dCACoinBalanceDto, DCACoinBalanceDto dCACoinBalanceDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            dCACoinBalanceDto = dCACurrentBalanceDto.baseCoin;
        }
        if ((i & 2) != 0) {
            dCACoinBalanceDto2 = dCACurrentBalanceDto.quoteCoin;
        }
        return dCACurrentBalanceDto.copy(dCACoinBalanceDto, dCACoinBalanceDto2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DCACoinBalanceDto component1() {
        return this.baseCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DCACoinBalanceDto component2() {
        return this.quoteCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DCACurrentBalanceDto copy(DCACoinBalanceDto dCACoinBalanceDto, DCACoinBalanceDto dCACoinBalanceDto2) {
        return new DCACurrentBalanceDto(dCACoinBalanceDto, dCACoinBalanceDto2);
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
        if (!(obj instanceof DCACurrentBalanceDto)) {
            return false;
        }
        DCACurrentBalanceDto dCACurrentBalanceDto = (DCACurrentBalanceDto) obj;
        return Intrinsics.EZpvd(this.baseCoin, dCACurrentBalanceDto.baseCoin) && Intrinsics.EZpvd(this.quoteCoin, dCACurrentBalanceDto.quoteCoin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DCACoinBalanceDto getBaseCoin() {
        return this.baseCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DCACoinBalanceDto getQuoteCoin() {
        return this.quoteCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        DCACoinBalanceDto dCACoinBalanceDto = this.baseCoin;
        int iHashCode = dCACoinBalanceDto == null ? 0 : dCACoinBalanceDto.hashCode();
        DCACoinBalanceDto dCACoinBalanceDto2 = this.quoteCoin;
        return (iHashCode * 31) + (dCACoinBalanceDto2 != null ? dCACoinBalanceDto2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DCACurrentBalanceDto(baseCoin=" + this.baseCoin + ", quoteCoin=" + this.quoteCoin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        DCACoinBalanceDto dCACoinBalanceDto = this.baseCoin;
        if (dCACoinBalanceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dCACoinBalanceDto.writeToParcel(parcel, i);
        }
        DCACoinBalanceDto dCACoinBalanceDto2 = this.quoteCoin;
        if (dCACoinBalanceDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dCACoinBalanceDto2.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.DCACurrentBalanceDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DCACurrentBalanceDto> serializer() {
            return DCACurrentBalanceDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DCACurrentBalanceDto(int i, DCACoinBalanceDto dCACoinBalanceDto, DCACoinBalanceDto dCACoinBalanceDto2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.baseCoin = null;
        } else {
            this.baseCoin = dCACoinBalanceDto;
        }
        if ((i & 2) == 0) {
            this.quoteCoin = null;
        } else {
            this.quoteCoin = dCACoinBalanceDto2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(DCACurrentBalanceDto dCACurrentBalanceDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || dCACurrentBalanceDto.baseCoin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, DCACoinBalanceDto$$serializer.INSTANCE, dCACurrentBalanceDto.baseCoin);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && dCACurrentBalanceDto.quoteCoin == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, DCACoinBalanceDto$$serializer.INSTANCE, dCACurrentBalanceDto.quoteCoin);
    }

    public DCACurrentBalanceDto(DCACoinBalanceDto dCACoinBalanceDto, DCACoinBalanceDto dCACoinBalanceDto2) {
        this.baseCoin = dCACoinBalanceDto;
        this.quoteCoin = dCACoinBalanceDto2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.unify_trade.biz.DCACoinBalanceDto:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.DCACoinBalanceDto) : (r2v0 com.okinc.unify_trade.biz.DCACoinBalanceDto))
  (wrap:com.okinc.unify_trade.biz.DCACoinBalanceDto:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.DCACoinBalanceDto) : (r3v0 com.okinc.unify_trade.biz.DCACoinBalanceDto))
 A[MD:(com.okinc.unify_trade.biz.DCACoinBalanceDto, com.okinc.unify_trade.biz.DCACoinBalanceDto):void (m)] (LINE:104) call: com.okinc.unify_trade.biz.DCACurrentBalanceDto.<init>(com.okinc.unify_trade.biz.DCACoinBalanceDto, com.okinc.unify_trade.biz.DCACoinBalanceDto):void type: THIS */
    public /* synthetic */ DCACurrentBalanceDto(DCACoinBalanceDto dCACoinBalanceDto, DCACoinBalanceDto dCACoinBalanceDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dCACoinBalanceDto, (i & 2) != 0 ? null : dCACoinBalanceDto2);
    }
}
