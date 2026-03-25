package com.okinc.unify_trade.biz;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class RecurringBuyDto implements Parcelable {
    private final List<Integer> availableAccountList;
    private final String recurringTimeMinutes;
    private final Integer recurringTimeType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecurringBuyDto> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(IntSerializer.INSTANCE), null, null};

    public static final class Creator implements Parcelable.Creator<RecurringBuyDto> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
            }
            return new RecurringBuyDto(arrayList, parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyDto[] newArray(int i) {
            return new RecurringBuyDto[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecurringBuyDto() {
        this((List) null, (String) null, (Integer) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.RecurringBuyDto */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecurringBuyDto copy$default(RecurringBuyDto recurringBuyDto, List list, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = recurringBuyDto.availableAccountList;
        }
        if ((i & 2) != 0) {
            str = recurringBuyDto.recurringTimeMinutes;
        }
        if ((i & 4) != 0) {
            num = recurringBuyDto.recurringTimeType;
        }
        return recurringBuyDto.copy(list, str, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component1() {
        return this.availableAccountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.recurringTimeMinutes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.recurringTimeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyDto copy(List<Integer> list, String str, Integer num) {
        return new RecurringBuyDto(list, str, num);
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
        if (!(obj instanceof RecurringBuyDto)) {
            return false;
        }
        RecurringBuyDto recurringBuyDto = (RecurringBuyDto) obj;
        return Intrinsics.EZpvd(this.availableAccountList, recurringBuyDto.availableAccountList) && Intrinsics.EZpvd((Object) this.recurringTimeMinutes, (Object) recurringBuyDto.recurringTimeMinutes) && Intrinsics.EZpvd(this.recurringTimeType, recurringBuyDto.recurringTimeType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getAvailableAccountList() {
        return this.availableAccountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecurringTimeMinutes() {
        return this.recurringTimeMinutes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRecurringTimeType() {
        return this.recurringTimeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<Integer> list = this.availableAccountList;
        int iHashCode = list == null ? 0 : list.hashCode();
        String str = this.recurringTimeMinutes;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.recurringTimeType;
        return (((iHashCode * 31) + iHashCode2) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringBuyDto(availableAccountList=" + this.availableAccountList + ", recurringTimeMinutes=" + this.recurringTimeMinutes + ", recurringTimeType=" + this.recurringTimeType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<Integer> list = this.availableAccountList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeInt(it.next().intValue());
            }
        }
        parcel.writeString(this.recurringTimeMinutes);
        Integer num = this.recurringTimeType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.RecurringBuyDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecurringBuyDto> serializer() {
            return RecurringBuyDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecurringBuyDto(int i, List list, String str, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        this.availableAccountList = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.recurringTimeMinutes = null;
        } else {
            this.recurringTimeMinutes = str;
        }
        if ((i & 4) == 0) {
            this.recurringTimeType = null;
        } else {
            this.recurringTimeType = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(RecurringBuyDto recurringBuyDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(recurringBuyDto.availableAccountList, yDY.AhwBna())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], recurringBuyDto.availableAccountList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || recurringBuyDto.recurringTimeMinutes != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, recurringBuyDto.recurringTimeMinutes);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && recurringBuyDto.recurringTimeType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, recurringBuyDto.recurringTimeType);
    }

    public RecurringBuyDto(List<Integer> list, String str, Integer num) {
        this.availableAccountList = list;
        this.recurringTimeMinutes = str;
        this.recurringTimeType = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:198)) : (r2v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000e: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
 A[MD:(java.util.List<java.lang.Integer>, java.lang.String, java.lang.Integer):void (m)] (LINE:197) call: com.okinc.unify_trade.biz.RecurringBuyDto.<init>(java.util.List, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ RecurringBuyDto(List list, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num);
    }
}
