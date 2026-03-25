package com.okinc.unify_trade.biz.bot;

import android.os.Parcel;
import android.os.Parcelable;
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

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class EarnCurrencyListResponseDto implements Parcelable {
    private final List<EarnCurrencyDto> earnRecords;
    private final String earnSupport;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EarnCurrencyListResponseDto> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(EarnCurrencyDto$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<EarnCurrencyListResponseDto> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarnCurrencyListResponseDto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(EarnCurrencyDto.CREATOR.createFromParcel(parcel));
            }
            return new EarnCurrencyListResponseDto(string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarnCurrencyListResponseDto[] newArray(int i) {
            return new EarnCurrencyListResponseDto[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EarnCurrencyListResponseDto() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.bot.EarnCurrencyListResponseDto */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EarnCurrencyListResponseDto copy$default(EarnCurrencyListResponseDto earnCurrencyListResponseDto, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = earnCurrencyListResponseDto.earnSupport;
        }
        if ((i & 2) != 0) {
            list = earnCurrencyListResponseDto.earnRecords;
        }
        return earnCurrencyListResponseDto.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.earnSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EarnCurrencyDto> component2() {
        return this.earnRecords;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnCurrencyListResponseDto copy(@NotNull String str, @NotNull List<EarnCurrencyDto> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new EarnCurrencyListResponseDto(str, list);
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
        if (!(obj instanceof EarnCurrencyListResponseDto)) {
            return false;
        }
        EarnCurrencyListResponseDto earnCurrencyListResponseDto = (EarnCurrencyListResponseDto) obj;
        return Intrinsics.EZpvd((Object) this.earnSupport, (Object) earnCurrencyListResponseDto.earnSupport) && Intrinsics.EZpvd(this.earnRecords, earnCurrencyListResponseDto.earnRecords);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EarnCurrencyDto> getEarnRecords() {
        return this.earnRecords;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarnSupport() {
        return this.earnSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.earnSupport.hashCode() * 31) + this.earnRecords.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EarnCurrencyListResponseDto(earnSupport=" + this.earnSupport + ", earnRecords=" + this.earnRecords + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.earnSupport);
        List<EarnCurrencyDto> list = this.earnRecords;
        parcel.writeInt(list.size());
        Iterator<EarnCurrencyDto> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.bot.EarnCurrencyListResponseDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EarnCurrencyListResponseDto> serializer() {
            return EarnCurrencyListResponseDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EarnCurrencyListResponseDto(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.earnSupport = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.earnRecords = yDY.AhwBna();
        } else {
            this.earnRecords = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(EarnCurrencyListResponseDto earnCurrencyListResponseDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) earnCurrencyListResponseDto.earnSupport, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, earnCurrencyListResponseDto.earnSupport);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(earnCurrencyListResponseDto.earnRecords, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], earnCurrencyListResponseDto.earnRecords);
    }

    public EarnCurrencyListResponseDto(@NotNull String str, @NotNull List<EarnCurrencyDto> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.earnSupport = str;
        this.earnRecords = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:36)) : (r2v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<com.okinc.unify_trade.biz.bot.EarnCurrencyDto>):void (m)] (LINE:34) call: com.okinc.unify_trade.biz.bot.EarnCurrencyListResponseDto.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ EarnCurrencyListResponseDto(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list);
    }
}
