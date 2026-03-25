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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestLogo implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<InvestLogoBaseVo> bottomRightLogoList;
    private final List<InvestLogoBaseVo> middleLogoList;
    private final List<InvestLogoBaseVo> topLeftLogoList;
    private final List<InvestLogoBaseVo> topRightLogoList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestLogo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestLogo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestLogo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList4 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(InvestLogoBaseVo.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(InvestLogoBaseVo.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(InvestLogoBaseVo.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i7 = parcel.readInt();
                arrayList4 = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    arrayList4.add(InvestLogoBaseVo.CREATOR.createFromParcel(parcel));
                }
            }
            return new InvestLogo(arrayList, arrayList2, arrayList3, arrayList4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestLogo[] newArray(int i) {
            return new InvestLogo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestLogo() {
        this((List) null, (List) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.InvestLogo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestLogo copy$default(InvestLogo investLogo, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = investLogo.bottomRightLogoList;
        }
        if ((i & 2) != 0) {
            list2 = investLogo.middleLogoList;
        }
        if ((i & 4) != 0) {
            list3 = investLogo.topLeftLogoList;
        }
        if ((i & 8) != 0) {
            list4 = investLogo.topRightLogoList;
        }
        return investLogo.copy(list, list2, list3, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestLogoBaseVo> component1() {
        return this.bottomRightLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestLogoBaseVo> component2() {
        return this.middleLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestLogoBaseVo> component3() {
        return this.topLeftLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestLogoBaseVo> component4() {
        return this.topRightLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestLogo copy(List<InvestLogoBaseVo> list, List<InvestLogoBaseVo> list2, List<InvestLogoBaseVo> list3, List<InvestLogoBaseVo> list4) {
        return new InvestLogo(list, list2, list3, list4);
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
        if (!(obj instanceof InvestLogo)) {
            return false;
        }
        InvestLogo investLogo = (InvestLogo) obj;
        return Intrinsics.EZpvd(this.bottomRightLogoList, investLogo.bottomRightLogoList) && Intrinsics.EZpvd(this.middleLogoList, investLogo.middleLogoList) && Intrinsics.EZpvd(this.topLeftLogoList, investLogo.topLeftLogoList) && Intrinsics.EZpvd(this.topRightLogoList, investLogo.topRightLogoList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestLogoBaseVo> getBottomRightLogoList() {
        return this.bottomRightLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestLogoBaseVo> getMiddleLogoList() {
        return this.middleLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestLogoBaseVo> getTopLeftLogoList() {
        return this.topLeftLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestLogoBaseVo> getTopRightLogoList() {
        return this.topRightLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<InvestLogoBaseVo> list = this.bottomRightLogoList;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<InvestLogoBaseVo> list2 = this.middleLogoList;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        List<InvestLogoBaseVo> list3 = this.topLeftLogoList;
        int iHashCode3 = list3 == null ? 0 : list3.hashCode();
        List<InvestLogoBaseVo> list4 = this.topRightLogoList;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list4 != null ? list4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestLogo(bottomRightLogoList=" + this.bottomRightLogoList + ", middleLogoList=" + this.middleLogoList + ", topLeftLogoList=" + this.topLeftLogoList + ", topRightLogoList=" + this.topRightLogoList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<InvestLogoBaseVo> list = this.bottomRightLogoList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<InvestLogoBaseVo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<InvestLogoBaseVo> list2 = this.middleLogoList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<InvestLogoBaseVo> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        List<InvestLogoBaseVo> list3 = this.topLeftLogoList;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<InvestLogoBaseVo> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        List<InvestLogoBaseVo> list4 = this.topRightLogoList;
        if (list4 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list4.size());
        Iterator<InvestLogoBaseVo> it4 = list4.iterator();
        while (it4.hasNext()) {
            it4.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestLogo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestLogo> serializer() {
            return InvestLogo$$serializer.INSTANCE;
        }
    }

    static {
        InvestLogoBaseVo$$serializer investLogoBaseVo$$serializer = InvestLogoBaseVo$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(investLogoBaseVo$$serializer), new ArrayListSerializer(investLogoBaseVo$$serializer), new ArrayListSerializer(investLogoBaseVo$$serializer), new ArrayListSerializer(investLogoBaseVo$$serializer)};
    }

    public /* synthetic */ InvestLogo(int i, List list, List list2, List list3, List list4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.bottomRightLogoList = null;
        } else {
            this.bottomRightLogoList = list;
        }
        if ((i & 2) == 0) {
            this.middleLogoList = null;
        } else {
            this.middleLogoList = list2;
        }
        if ((i & 4) == 0) {
            this.topLeftLogoList = null;
        } else {
            this.topLeftLogoList = list3;
        }
        if ((i & 8) == 0) {
            this.topRightLogoList = null;
        } else {
            this.topRightLogoList = list4;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestLogo investLogo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investLogo.bottomRightLogoList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], investLogo.bottomRightLogoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investLogo.middleLogoList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], investLogo.middleLogoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investLogo.topLeftLogoList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], investLogo.topLeftLogoList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && investLogo.topRightLogoList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], investLogo.topRightLogoList);
    }

    public InvestLogo(List<InvestLogoBaseVo> list, List<InvestLogoBaseVo> list2, List<InvestLogoBaseVo> list3, List<InvestLogoBaseVo> list4) {
        this.bottomRightLogoList = list;
        this.middleLogoList = list2;
        this.topLeftLogoList = list3;
        this.topRightLogoList = list4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.bean.InvestLogoBaseVo>, java.util.List<com.okinc.business.invest_biz.data.bean.InvestLogoBaseVo>, java.util.List<com.okinc.business.invest_biz.data.bean.InvestLogoBaseVo>, java.util.List<com.okinc.business.invest_biz.data.bean.InvestLogoBaseVo>):void (m)] (LINE:121) call: com.okinc.business.invest_biz.data.bean.InvestLogo.<init>(java.util.List, java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ InvestLogo(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4);
    }
}
