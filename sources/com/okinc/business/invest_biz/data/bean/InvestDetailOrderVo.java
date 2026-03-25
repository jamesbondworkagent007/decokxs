package com.okinc.business.invest_biz.data.bean;

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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class InvestDetailOrderVo implements Parcelable {
    private final long count;
    private final List<InvestOrderBean> homeOrderInfoVoList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestDetailOrderVo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(InvestOrderBean$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<InvestDetailOrderVo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestDetailOrderVo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(InvestOrderBean.CREATOR.createFromParcel(parcel));
            }
            return new InvestDetailOrderVo(j, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestDetailOrderVo[] newArray(int i) {
            return new InvestDetailOrderVo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestDetailOrderVo() {
        this(0L, (List) null, 3, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.InvestDetailOrderVo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestDetailOrderVo copy$default(InvestDetailOrderVo investDetailOrderVo, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = investDetailOrderVo.count;
        }
        if ((i & 2) != 0) {
            list = investDetailOrderVo.homeOrderInfoVoList;
        }
        return investDetailOrderVo.copy(j, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestOrderBean> component2() {
        return this.homeOrderInfoVoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestDetailOrderVo copy(long j, @NotNull List<InvestOrderBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new InvestDetailOrderVo(j, list);
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
        if (!(obj instanceof InvestDetailOrderVo)) {
            return false;
        }
        InvestDetailOrderVo investDetailOrderVo = (InvestDetailOrderVo) obj;
        return this.count == investDetailOrderVo.count && Intrinsics.EZpvd(this.homeOrderInfoVoList, investDetailOrderVo.homeOrderInfoVoList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCount() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestOrderBean> getHomeOrderInfoVoList() {
        return this.homeOrderInfoVoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.count) * 31) + this.homeOrderInfoVoList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestDetailOrderVo(count=" + this.count + ", homeOrderInfoVoList=" + this.homeOrderInfoVoList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.count);
        List<InvestOrderBean> list = this.homeOrderInfoVoList;
        parcel.writeInt(list.size());
        Iterator<InvestOrderBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestDetailOrderVo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestDetailOrderVo> serializer() {
            return InvestDetailOrderVo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestDetailOrderVo(int i, long j, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.count = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.homeOrderInfoVoList = yDY.AhwBna();
        } else {
            this.homeOrderInfoVoList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestDetailOrderVo investDetailOrderVo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investDetailOrderVo.count != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, investDetailOrderVo.count);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(investDetailOrderVo.homeOrderInfoVoList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], investDetailOrderVo.homeOrderInfoVoList);
    }

    public InvestDetailOrderVo(long j, @NotNull List<InvestOrderBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.count = j;
        this.homeOrderInfoVoList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r1v0 long))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:940)) : (r3v0 java.util.List))
 A[MD:(long, java.util.List<com.okinc.business.invest_biz.data.bean.InvestOrderBean>):void (m)] (LINE:938) call: com.okinc.business.invest_biz.data.bean.InvestDetailOrderVo.<init>(long, java.util.List):void type: THIS */
    public /* synthetic */ InvestDetailOrderVo(long j, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? yDY.AhwBna() : list);
    }
}
