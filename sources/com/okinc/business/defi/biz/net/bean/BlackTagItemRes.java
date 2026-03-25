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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class BlackTagItemRes implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private String address;
    private Boolean isBlack;
    private Boolean isSimilar;
    private List<String> similar;
    private List<String> tag;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BlackTagItemRes> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BlackTagItemRes> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BlackTagItemRes createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BlackTagItemRes(string, boolValueOf, boolValueOf2, parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BlackTagItemRes[] newArray(int i) {
            return new BlackTagItemRes[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BlackTagItemRes() {
        this((String) null, (Boolean) null, (Boolean) null, (List) null, (List) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.defi.biz.net.bean.BlackTagItemRes */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BlackTagItemRes copy$default(BlackTagItemRes blackTagItemRes, String str, Boolean bool, Boolean bool2, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blackTagItemRes.address;
        }
        if ((i & 2) != 0) {
            bool = blackTagItemRes.isBlack;
        }
        Boolean bool3 = bool;
        if ((i & 4) != 0) {
            bool2 = blackTagItemRes.isSimilar;
        }
        Boolean bool4 = bool2;
        if ((i & 8) != 0) {
            list = blackTagItemRes.similar;
        }
        List list3 = list;
        if ((i & 16) != 0) {
            list2 = blackTagItemRes.tag;
        }
        return blackTagItemRes.copy(str, bool3, bool4, list3, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.isBlack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.isSimilar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.similar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component5() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BlackTagItemRes copy(String str, Boolean bool, Boolean bool2, List<String> list, List<String> list2) {
        return new BlackTagItemRes(str, bool, bool2, list, list2);
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
        if (!(obj instanceof BlackTagItemRes)) {
            return false;
        }
        BlackTagItemRes blackTagItemRes = (BlackTagItemRes) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) blackTagItemRes.address) && Intrinsics.EZpvd(this.isBlack, blackTagItemRes.isBlack) && Intrinsics.EZpvd(this.isSimilar, blackTagItemRes.isSimilar) && Intrinsics.EZpvd(this.similar, blackTagItemRes.similar) && Intrinsics.EZpvd(this.tag, blackTagItemRes.tag);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSimilar() {
        return this.similar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.address;
        int iHashCode = str == null ? 0 : str.hashCode();
        Boolean bool = this.isBlack;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.isSimilar;
        int iHashCode3 = bool2 == null ? 0 : bool2.hashCode();
        List<String> list = this.similar;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        List<String> list2 = this.tag;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isBlack() {
        return this.isBlack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isSimilar() {
        return this.isSimilar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBlack(Boolean bool) {
        this.isBlack = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSimilar(Boolean bool) {
        this.isSimilar = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSimilar(List<String> list) {
        this.similar = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTag(List<String> list) {
        this.tag = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BlackTagItemRes(address=" + this.address + ", isBlack=" + this.isBlack + ", isSimilar=" + this.isSimilar + ", similar=" + this.similar + ", tag=" + this.tag + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        Boolean bool = this.isBlack;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isSimilar;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeStringList(this.similar);
        parcel.writeStringList(this.tag);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.BlackTagItemRes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BlackTagItemRes> serializer() {
            return BlackTagItemRes$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer)};
    }

    public /* synthetic */ BlackTagItemRes(int i, String str, Boolean bool, Boolean bool2, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.address = null;
        } else {
            this.address = str;
        }
        if ((i & 2) == 0) {
            this.isBlack = null;
        } else {
            this.isBlack = bool;
        }
        if ((i & 4) == 0) {
            this.isSimilar = null;
        } else {
            this.isSimilar = bool2;
        }
        if ((i & 8) == 0) {
            this.similar = null;
        } else {
            this.similar = list;
        }
        if ((i & 16) == 0) {
            this.tag = null;
        } else {
            this.tag = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(BlackTagItemRes blackTagItemRes, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || blackTagItemRes.address != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, blackTagItemRes.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || blackTagItemRes.isBlack != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, blackTagItemRes.isBlack);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || blackTagItemRes.isSimilar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, blackTagItemRes.isSimilar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || blackTagItemRes.similar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], blackTagItemRes.similar);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && blackTagItemRes.tag == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], blackTagItemRes.tag);
    }

    public BlackTagItemRes(String str, Boolean bool, Boolean bool2, List<String> list, List<String> list2) {
        this.address = str;
        this.isBlack = bool;
        this.isSimilar = bool2;
        this.similar = list;
        this.tag = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r6v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r7v0 java.lang.Boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r8v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r9v0 java.util.List))
 A[MD:(java.lang.String, java.lang.Boolean, java.lang.Boolean, java.util.List<java.lang.String>, java.util.List<java.lang.String>):void (m)] (LINE:221) call: com.okinc.business.defi.biz.net.bean.BlackTagItemRes.<init>(java.lang.String, java.lang.Boolean, java.lang.Boolean, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ BlackTagItemRes(String str, Boolean bool, Boolean bool2, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2);
    }
}
