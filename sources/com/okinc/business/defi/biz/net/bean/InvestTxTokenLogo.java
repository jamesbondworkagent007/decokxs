package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class InvestTxTokenLogo implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private List<String> bottomLeftLogo;
    private List<String> bottomRightLogo;
    private List<String> middleLogo;
    private List<String> topLeftLogo;
    private List<String> topRightLogo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestTxTokenLogo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestTxTokenLogo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestTxTokenLogo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestTxTokenLogo(parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestTxTokenLogo[] newArray(int i) {
            return new InvestTxTokenLogo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestTxTokenLogo() {
        this((List) null, (List) null, (List) null, (List) null, (List) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.defi.biz.net.bean.InvestTxTokenLogo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestTxTokenLogo copy$default(InvestTxTokenLogo investTxTokenLogo, List list, List list2, List list3, List list4, List list5, int i, Object obj) {
        if ((i & 1) != 0) {
            list = investTxTokenLogo.middleLogo;
        }
        if ((i & 2) != 0) {
            list2 = investTxTokenLogo.topRightLogo;
        }
        List list6 = list2;
        if ((i & 4) != 0) {
            list3 = investTxTokenLogo.topLeftLogo;
        }
        List list7 = list3;
        if ((i & 8) != 0) {
            list4 = investTxTokenLogo.bottomRightLogo;
        }
        List list8 = list4;
        if ((i & 16) != 0) {
            list5 = investTxTokenLogo.bottomLeftLogo;
        }
        return investTxTokenLogo.copy(list, list6, list7, list8, list5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.middleLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.topRightLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.topLeftLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.bottomRightLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component5() {
        return this.bottomLeftLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTxTokenLogo copy(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        return new InvestTxTokenLogo(list, list2, list3, list4, list5);
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
        if (!(obj instanceof InvestTxTokenLogo)) {
            return false;
        }
        InvestTxTokenLogo investTxTokenLogo = (InvestTxTokenLogo) obj;
        return Intrinsics.EZpvd(this.middleLogo, investTxTokenLogo.middleLogo) && Intrinsics.EZpvd(this.topRightLogo, investTxTokenLogo.topRightLogo) && Intrinsics.EZpvd(this.topLeftLogo, investTxTokenLogo.topLeftLogo) && Intrinsics.EZpvd(this.bottomRightLogo, investTxTokenLogo.bottomRightLogo) && Intrinsics.EZpvd(this.bottomLeftLogo, investTxTokenLogo.bottomLeftLogo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getBottomLeftLogo() {
        return this.bottomLeftLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getBottomRightLogo() {
        return this.bottomRightLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getMiddleLogo() {
        return this.middleLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTopLeftLogo() {
        return this.topLeftLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTopRightLogo() {
        return this.topRightLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<String> list = this.middleLogo;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<String> list2 = this.topRightLogo;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        List<String> list3 = this.topLeftLogo;
        int iHashCode3 = list3 == null ? 0 : list3.hashCode();
        List<String> list4 = this.bottomRightLogo;
        int iHashCode4 = list4 == null ? 0 : list4.hashCode();
        List<String> list5 = this.bottomLeftLogo;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list5 != null ? list5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBottomLeftLogo(List<String> list) {
        this.bottomLeftLogo = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBottomRightLogo(List<String> list) {
        this.bottomRightLogo = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMiddleLogo(List<String> list) {
        this.middleLogo = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTopLeftLogo(List<String> list) {
        this.topLeftLogo = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTopRightLogo(List<String> list) {
        this.topRightLogo = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestTxTokenLogo(middleLogo=" + this.middleLogo + ", topRightLogo=" + this.topRightLogo + ", topLeftLogo=" + this.topLeftLogo + ", bottomRightLogo=" + this.bottomRightLogo + ", bottomLeftLogo=" + this.bottomLeftLogo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.middleLogo);
        parcel.writeStringList(this.topRightLogo);
        parcel.writeStringList(this.topLeftLogo);
        parcel.writeStringList(this.bottomRightLogo);
        parcel.writeStringList(this.bottomLeftLogo);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.InvestTxTokenLogo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestTxTokenLogo> serializer() {
            return InvestTxTokenLogo$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer)};
    }

    public /* synthetic */ InvestTxTokenLogo(int i, List list, List list2, List list3, List list4, List list5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.middleLogo = null;
        } else {
            this.middleLogo = list;
        }
        if ((i & 2) == 0) {
            this.topRightLogo = null;
        } else {
            this.topRightLogo = list2;
        }
        if ((i & 4) == 0) {
            this.topLeftLogo = null;
        } else {
            this.topLeftLogo = list3;
        }
        if ((i & 8) == 0) {
            this.bottomRightLogo = null;
        } else {
            this.bottomRightLogo = list4;
        }
        if ((i & 16) == 0) {
            this.bottomLeftLogo = null;
        } else {
            this.bottomLeftLogo = list5;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(InvestTxTokenLogo investTxTokenLogo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investTxTokenLogo.middleLogo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], investTxTokenLogo.middleLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investTxTokenLogo.topRightLogo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], investTxTokenLogo.topRightLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investTxTokenLogo.topLeftLogo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], investTxTokenLogo.topLeftLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investTxTokenLogo.bottomRightLogo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], investTxTokenLogo.bottomRightLogo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && investTxTokenLogo.bottomLeftLogo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], investTxTokenLogo.bottomLeftLogo);
    }

    public InvestTxTokenLogo(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        this.middleLogo = list;
        this.topRightLogo = list2;
        this.topLeftLogo = list3;
        this.bottomRightLogo = list4;
        this.bottomLeftLogo = list5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r6v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r7v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r8v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r9v0 java.util.List))
 A[MD:(java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<java.lang.String>):void (m)] (LINE:283) call: com.okinc.business.defi.biz.net.bean.InvestTxTokenLogo.<init>(java.util.List, java.util.List, java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ InvestTxTokenLogo(List list, List list2, List list3, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4, (i & 16) != 0 ? null : list5);
    }
}
