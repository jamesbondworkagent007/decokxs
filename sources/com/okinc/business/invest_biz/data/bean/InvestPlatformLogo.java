package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_biz.data.models.UnderlyingToken;
import com.okinc.business.invest_biz.data.models.UnderlyingToken$$serializer;
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
public final class InvestPlatformLogo implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private List<UnderlyingToken> bottomRightLogoList;
    private List<UnderlyingToken> middleLogoList;
    private List<UnderlyingToken> topLeftLogoList;
    private List<UnderlyingToken> topRightLogoList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestPlatformLogo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestPlatformLogo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestPlatformLogo createFromParcel(Parcel parcel) {
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
                    arrayList.add(UnderlyingToken.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(UnderlyingToken.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(UnderlyingToken.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i7 = parcel.readInt();
                arrayList4 = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    arrayList4.add(UnderlyingToken.CREATOR.createFromParcel(parcel));
                }
            }
            return new InvestPlatformLogo(arrayList, arrayList2, arrayList3, arrayList4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestPlatformLogo[] newArray(int i) {
            return new InvestPlatformLogo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestPlatformLogo() {
        this((List) null, (List) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.InvestPlatformLogo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestPlatformLogo copy$default(InvestPlatformLogo investPlatformLogo, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = investPlatformLogo.middleLogoList;
        }
        if ((i & 2) != 0) {
            list2 = investPlatformLogo.bottomRightLogoList;
        }
        if ((i & 4) != 0) {
            list3 = investPlatformLogo.topLeftLogoList;
        }
        if ((i & 8) != 0) {
            list4 = investPlatformLogo.topRightLogoList;
        }
        return investPlatformLogo.copy(list, list2, list3, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UnderlyingToken> component1() {
        return this.middleLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UnderlyingToken> component2() {
        return this.bottomRightLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UnderlyingToken> component3() {
        return this.topLeftLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UnderlyingToken> component4() {
        return this.topRightLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestPlatformLogo copy(List<UnderlyingToken> list, List<UnderlyingToken> list2, List<UnderlyingToken> list3, List<UnderlyingToken> list4) {
        return new InvestPlatformLogo(list, list2, list3, list4);
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
        if (!(obj instanceof InvestPlatformLogo)) {
            return false;
        }
        InvestPlatformLogo investPlatformLogo = (InvestPlatformLogo) obj;
        return Intrinsics.EZpvd(this.middleLogoList, investPlatformLogo.middleLogoList) && Intrinsics.EZpvd(this.bottomRightLogoList, investPlatformLogo.bottomRightLogoList) && Intrinsics.EZpvd(this.topLeftLogoList, investPlatformLogo.topLeftLogoList) && Intrinsics.EZpvd(this.topRightLogoList, investPlatformLogo.topRightLogoList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UnderlyingToken> getBottomRightLogoList() {
        return this.bottomRightLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UnderlyingToken> getMiddleLogoList() {
        return this.middleLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UnderlyingToken> getTopLeftLogoList() {
        return this.topLeftLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UnderlyingToken> getTopRightLogoList() {
        return this.topRightLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<UnderlyingToken> list = this.middleLogoList;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<UnderlyingToken> list2 = this.bottomRightLogoList;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        List<UnderlyingToken> list3 = this.topLeftLogoList;
        int iHashCode3 = list3 == null ? 0 : list3.hashCode();
        List<UnderlyingToken> list4 = this.topRightLogoList;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list4 != null ? list4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBottomRightLogoList(List<UnderlyingToken> list) {
        this.bottomRightLogoList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMiddleLogoList(List<UnderlyingToken> list) {
        this.middleLogoList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTopLeftLogoList(List<UnderlyingToken> list) {
        this.topLeftLogoList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTopRightLogoList(List<UnderlyingToken> list) {
        this.topRightLogoList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestPlatformLogo(middleLogoList=" + this.middleLogoList + ", bottomRightLogoList=" + this.bottomRightLogoList + ", topLeftLogoList=" + this.topLeftLogoList + ", topRightLogoList=" + this.topRightLogoList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<UnderlyingToken> list = this.middleLogoList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<UnderlyingToken> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<UnderlyingToken> list2 = this.bottomRightLogoList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<UnderlyingToken> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        List<UnderlyingToken> list3 = this.topLeftLogoList;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<UnderlyingToken> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        List<UnderlyingToken> list4 = this.topRightLogoList;
        if (list4 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list4.size());
        Iterator<UnderlyingToken> it4 = list4.iterator();
        while (it4.hasNext()) {
            it4.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestPlatformLogo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestPlatformLogo> serializer() {
            return InvestPlatformLogo$$serializer.INSTANCE;
        }
    }

    static {
        UnderlyingToken$$serializer underlyingToken$$serializer = UnderlyingToken$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(underlyingToken$$serializer), new ArrayListSerializer(underlyingToken$$serializer), new ArrayListSerializer(underlyingToken$$serializer), new ArrayListSerializer(underlyingToken$$serializer)};
    }

    public /* synthetic */ InvestPlatformLogo(int i, List list, List list2, List list3, List list4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.middleLogoList = null;
        } else {
            this.middleLogoList = list;
        }
        if ((i & 2) == 0) {
            this.bottomRightLogoList = null;
        } else {
            this.bottomRightLogoList = list2;
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

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestPlatformLogo investPlatformLogo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investPlatformLogo.middleLogoList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], investPlatformLogo.middleLogoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investPlatformLogo.bottomRightLogoList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], investPlatformLogo.bottomRightLogoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investPlatformLogo.topLeftLogoList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], investPlatformLogo.topLeftLogoList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && investPlatformLogo.topRightLogoList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], investPlatformLogo.topRightLogoList);
    }

    public InvestPlatformLogo(List<UnderlyingToken> list, List<UnderlyingToken> list2, List<UnderlyingToken> list3, List<UnderlyingToken> list4) {
        this.middleLogoList = list;
        this.bottomRightLogoList = list2;
        this.topLeftLogoList = list3;
        this.topRightLogoList = list4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.models.UnderlyingToken>, java.util.List<com.okinc.business.invest_biz.data.models.UnderlyingToken>, java.util.List<com.okinc.business.invest_biz.data.models.UnderlyingToken>, java.util.List<com.okinc.business.invest_biz.data.models.UnderlyingToken>):void (m)] (LINE:285) call: com.okinc.business.invest_biz.data.bean.InvestPlatformLogo.<init>(java.util.List, java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ InvestPlatformLogo(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4);
    }
}
