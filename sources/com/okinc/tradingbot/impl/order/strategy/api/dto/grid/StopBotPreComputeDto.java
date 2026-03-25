package com.okinc.tradingbot.impl.order.strategy.api.dto.grid;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.tradingbot.impl.order.strategy.data.BotStopType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class StopBotPreComputeDto implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<CoinAmountDto> returnCoinAmount;
    private final List<CoinAmountDto> sellCoinAmount;
    private final BotStopType stopType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<StopBotPreComputeDto> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<StopBotPreComputeDto> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StopBotPreComputeDto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            BotStopType botStopTypeCreateFromParcel = parcel.readInt() == 0 ? null : BotStopType.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(CoinAmountDto.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(CoinAmountDto.CREATOR.createFromParcel(parcel));
            }
            return new StopBotPreComputeDto(botStopTypeCreateFromParcel, arrayList, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StopBotPreComputeDto[] newArray(int i) {
            return new StopBotPreComputeDto[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StopBotPreComputeDto() {
        this((BotStopType) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.tradingbot.impl.order.strategy.api.dto.grid.StopBotPreComputeDto */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StopBotPreComputeDto copy$default(StopBotPreComputeDto stopBotPreComputeDto, BotStopType botStopType, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            botStopType = stopBotPreComputeDto.stopType;
        }
        if ((i & 2) != 0) {
            list = stopBotPreComputeDto.sellCoinAmount;
        }
        if ((i & 4) != 0) {
            list2 = stopBotPreComputeDto.returnCoinAmount;
        }
        return stopBotPreComputeDto.copy(botStopType, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotStopType component1() {
        return this.stopType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CoinAmountDto> component2() {
        return this.sellCoinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CoinAmountDto> component3() {
        return this.returnCoinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StopBotPreComputeDto copy(BotStopType botStopType, @NotNull List<CoinAmountDto> list, @NotNull List<CoinAmountDto> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new StopBotPreComputeDto(botStopType, list, list2);
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
        if (!(obj instanceof StopBotPreComputeDto)) {
            return false;
        }
        StopBotPreComputeDto stopBotPreComputeDto = (StopBotPreComputeDto) obj;
        return this.stopType == stopBotPreComputeDto.stopType && Intrinsics.EZpvd(this.sellCoinAmount, stopBotPreComputeDto.sellCoinAmount) && Intrinsics.EZpvd(this.returnCoinAmount, stopBotPreComputeDto.returnCoinAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CoinAmountDto> getReturnCoinAmount() {
        return this.returnCoinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CoinAmountDto> getSellCoinAmount() {
        return this.sellCoinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotStopType getStopType() {
        return this.stopType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        BotStopType botStopType = this.stopType;
        return ((((botStopType == null ? 0 : botStopType.hashCode()) * 31) + this.sellCoinAmount.hashCode()) * 31) + this.returnCoinAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StopBotPreComputeDto(stopType=" + this.stopType + ", sellCoinAmount=" + this.sellCoinAmount + ", returnCoinAmount=" + this.returnCoinAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        BotStopType botStopType = this.stopType;
        if (botStopType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            botStopType.writeToParcel(parcel, i);
        }
        List<CoinAmountDto> list = this.sellCoinAmount;
        parcel.writeInt(list.size());
        Iterator<CoinAmountDto> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        List<CoinAmountDto> list2 = this.returnCoinAmount;
        parcel.writeInt(list2.size());
        Iterator<CoinAmountDto> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.api.dto.grid.StopBotPreComputeDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StopBotPreComputeDto> serializer() {
            return StopBotPreComputeDto$$serializer.INSTANCE;
        }
    }

    static {
        CoinAmountDto$$serializer coinAmountDto$$serializer = CoinAmountDto$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{BotStopType.Companion.serializer(), new ArrayListSerializer(coinAmountDto$$serializer), new ArrayListSerializer(coinAmountDto$$serializer)};
    }

    public /* synthetic */ StopBotPreComputeDto(int i, BotStopType botStopType, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        this.stopType = (i & 1) == 0 ? null : botStopType;
        if ((i & 2) == 0) {
            this.sellCoinAmount = yDY.AhwBna();
        } else {
            this.sellCoinAmount = list;
        }
        if ((i & 4) == 0) {
            this.returnCoinAmount = yDY.AhwBna();
        } else {
            this.returnCoinAmount = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradingBot_trading_bot_impl(StopBotPreComputeDto stopBotPreComputeDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || stopBotPreComputeDto.stopType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], stopBotPreComputeDto.stopType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(stopBotPreComputeDto.sellCoinAmount, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], stopBotPreComputeDto.sellCoinAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(stopBotPreComputeDto.returnCoinAmount, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], stopBotPreComputeDto.returnCoinAmount);
    }

    public StopBotPreComputeDto(BotStopType botStopType, @NotNull List<CoinAmountDto> list, @NotNull List<CoinAmountDto> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.stopType = botStopType;
        this.sellCoinAmount = list;
        this.returnCoinAmount = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:com.okinc.tradingbot.impl.order.strategy.data.BotStopType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.tradingbot.impl.order.strategy.data.BotStopType) : (r1v0 com.okinc.tradingbot.impl.order.strategy.data.BotStopType))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0009: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:15)) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000d: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0011: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:16)) : (r3v0 java.util.List))
 A[MD:(com.okinc.tradingbot.impl.order.strategy.data.BotStopType, java.util.List<com.okinc.tradingbot.impl.order.strategy.api.dto.grid.CoinAmountDto>, java.util.List<com.okinc.tradingbot.impl.order.strategy.api.dto.grid.CoinAmountDto>):void (m)] (LINE:13) call: com.okinc.tradingbot.impl.order.strategy.api.dto.grid.StopBotPreComputeDto.<init>(com.okinc.tradingbot.impl.order.strategy.data.BotStopType, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ StopBotPreComputeDto(BotStopType botStopType, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : botStopType, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? yDY.AhwBna() : list2);
    }
}
