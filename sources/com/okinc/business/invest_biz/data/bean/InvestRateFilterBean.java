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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestRateFilterBean implements Parcelable {
    private String investName;
    private Integer investType;
    private List<InvestRateFilter> value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestRateFilterBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(InvestRateFilter$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<InvestRateFilterBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestRateFilterBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(InvestRateFilter.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new InvestRateFilterBean(numValueOf, string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestRateFilterBean[] newArray(int i) {
            return new InvestRateFilterBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestRateFilterBean() {
        this((Integer) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.InvestRateFilterBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestRateFilterBean copy$default(InvestRateFilterBean investRateFilterBean, Integer num, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = investRateFilterBean.investType;
        }
        if ((i & 2) != 0) {
            str = investRateFilterBean.investName;
        }
        if ((i & 4) != 0) {
            list = investRateFilterBean.value;
        }
        return investRateFilterBean.copy(num, str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.investName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestRateFilter> component3() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestRateFilterBean copy(Integer num, String str, List<InvestRateFilter> list) {
        return new InvestRateFilterBean(num, str, list);
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
        if (!(obj instanceof InvestRateFilterBean)) {
            return false;
        }
        InvestRateFilterBean investRateFilterBean = (InvestRateFilterBean) obj;
        return Intrinsics.EZpvd(this.investType, investRateFilterBean.investType) && Intrinsics.EZpvd((Object) this.investName, (Object) investRateFilterBean.investName) && Intrinsics.EZpvd(this.value, investRateFilterBean.value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestName() {
        return this.investName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getInvestType() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestRateFilter> getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.investType;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.investName;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        List<InvestRateFilter> list = this.value;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestName(String str) {
        this.investName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestType(Integer num) {
        this.investType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValue(List<InvestRateFilter> list) {
        this.value = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestRateFilterBean(investType=" + this.investType + ", investName=" + this.investName + ", value=" + this.value + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.investType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.investName);
        List<InvestRateFilter> list = this.value;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<InvestRateFilter> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestRateFilterBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestRateFilterBean> serializer() {
            return InvestRateFilterBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestRateFilterBean(int i, Integer num, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.investType = (i & 1) == 0 ? 0 : num;
        if ((i & 2) == 0) {
            this.investName = null;
        } else {
            this.investName = str;
        }
        if ((i & 4) == 0) {
            this.value = null;
        } else {
            this.value = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestRateFilterBean investRateFilterBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (num = investRateFilterBean.investType) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, investRateFilterBean.investType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investRateFilterBean.investName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, investRateFilterBean.investName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && investRateFilterBean.value == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], investRateFilterBean.value);
    }

    public InvestRateFilterBean(Integer num, String str, List<InvestRateFilter> list) {
        this.investType = num;
        this.investName = str;
        this.value = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000f: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
 A[MD:(java.lang.Integer, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.InvestRateFilter>):void (m)] (LINE:156) call: com.okinc.business.invest_biz.data.bean.InvestRateFilterBean.<init>(java.lang.Integer, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ InvestRateFilterBean(Integer num, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list);
    }
}
