package com.okinc.business.finance_api.bean;

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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class LastRates implements Parcelable {
    private AverageRate averageRate;
    private List<Rate> rates;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<LastRates> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(Rate$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<LastRates> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LastRates createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList = null;
            AverageRate averageRateCreateFromParcel = parcel.readInt() == 0 ? null : AverageRate.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(Rate.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new LastRates(averageRateCreateFromParcel, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LastRates[] newArray(int i) {
            return new LastRates[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LastRates() {
        this((AverageRate) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.finance_api.bean.LastRates */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LastRates copy$default(LastRates lastRates, AverageRate averageRate, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            averageRate = lastRates.averageRate;
        }
        if ((i & 2) != 0) {
            list = lastRates.rates;
        }
        return lastRates.copy(averageRate, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AverageRate component1() {
        return this.averageRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Rate> component2() {
        return this.rates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LastRates copy(AverageRate averageRate, List<Rate> list) {
        return new LastRates(averageRate, list);
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
        if (!(obj instanceof LastRates)) {
            return false;
        }
        LastRates lastRates = (LastRates) obj;
        return Intrinsics.EZpvd(this.averageRate, lastRates.averageRate) && Intrinsics.EZpvd(this.rates, lastRates.rates);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AverageRate getAverageRate() {
        return this.averageRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Rate> getRates() {
        return this.rates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        AverageRate averageRate = this.averageRate;
        int iHashCode = averageRate == null ? 0 : averageRate.hashCode();
        List<Rate> list = this.rates;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAverageRate(AverageRate averageRate) {
        this.averageRate = averageRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRates(List<Rate> list) {
        this.rates = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LastRates(averageRate=" + this.averageRate + ", rates=" + this.rates + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        AverageRate averageRate = this.averageRate;
        if (averageRate == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            averageRate.writeToParcel(parcel, i);
        }
        List<Rate> list = this.rates;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<Rate> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.finance_api.bean.LastRates.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LastRates> serializer() {
            return LastRates$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LastRates(int i, AverageRate averageRate, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.averageRate = (i & 1) == 0 ? new AverageRate((Double) null, (Long) null, (Long) null, 7, (DefaultConstructorMarker) null) : averageRate;
        if ((i & 2) == 0) {
            this.rates = yDY.AhwBna();
        } else {
            this.rates = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKFinance_finance_api(LastRates lastRates, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(lastRates.averageRate, new AverageRate((Double) null, (Long) null, (Long) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, AverageRate$$serializer.INSTANCE, lastRates.averageRate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(lastRates.rates, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], lastRates.rates);
    }

    public LastRates(AverageRate averageRate, List<Rate> list) {
        this.averageRate = averageRate;
        this.rates = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:com.okinc.business.finance_api.bean.AverageRate:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.finance_api.bean.AverageRate:0x000c: CONSTRUCTOR 
  (wrap:java.lang.Double:?: CAST (java.lang.Double) (null java.lang.Double))
  (wrap:java.lang.Long:?: CAST (java.lang.Long) (null java.lang.Long))
  (wrap:java.lang.Long:?: CAST (java.lang.Long) (null java.lang.Long))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.Double, java.lang.Long, java.lang.Long, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:24) call: com.okinc.business.finance_api.bean.AverageRate.<init>(java.lang.Double, java.lang.Long, java.lang.Long, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r7v0 com.okinc.business.finance_api.bean.AverageRate))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0013: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:25)) : (r8v0 java.util.List))
 A[MD:(com.okinc.business.finance_api.bean.AverageRate, java.util.List<com.okinc.business.finance_api.bean.Rate>):void (m)] (LINE:23) call: com.okinc.business.finance_api.bean.LastRates.<init>(com.okinc.business.finance_api.bean.AverageRate, java.util.List):void type: THIS */
    public /* synthetic */ LastRates(AverageRate averageRate, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AverageRate((Double) null, (Long) null, (Long) null, 7, (DefaultConstructorMarker) null) : averageRate, (i & 2) != 0 ? yDY.AhwBna() : list);
    }
}
