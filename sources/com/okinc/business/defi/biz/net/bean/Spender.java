package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class Spender implements Parcelable {
    private String addressType;
    private String approvalRaw;
    private Integer approvalType;
    private String imageUrl;
    private String name;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Spender> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Spender> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Spender createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Spender(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Spender[] newArray(int i) {
            return new Spender[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Spender() {
        this((String) null, (String) null, (String) null, (Integer) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Spender copy$default(Spender spender, String str, String str2, String str3, Integer num, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spender.approvalRaw;
        }
        if ((i & 2) != 0) {
            str2 = spender.imageUrl;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = spender.name;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            num = spender.approvalType;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            str4 = spender.addressType;
        }
        return spender.copy(str, str5, str6, num2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.approvalRaw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.approvalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Spender copy(String str, String str2, String str3, Integer num, String str4) {
        return new Spender(str, str2, str3, num, str4);
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
        if (!(obj instanceof Spender)) {
            return false;
        }
        Spender spender = (Spender) obj;
        return Intrinsics.EZpvd((Object) this.approvalRaw, (Object) spender.approvalRaw) && Intrinsics.EZpvd((Object) this.imageUrl, (Object) spender.imageUrl) && Intrinsics.EZpvd((Object) this.name, (Object) spender.name) && Intrinsics.EZpvd(this.approvalType, spender.approvalType) && Intrinsics.EZpvd((Object) this.addressType, (Object) spender.addressType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddressType() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApprovalRaw() {
        return this.approvalRaw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getApprovalType() {
        return this.approvalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.approvalRaw;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.imageUrl;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.name;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.approvalType;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        String str4 = this.addressType;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressType(String str) {
        this.addressType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApprovalRaw(String str) {
        this.approvalRaw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApprovalType(Integer num) {
        this.approvalType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(String str) {
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Spender(approvalRaw=" + this.approvalRaw + ", imageUrl=" + this.imageUrl + ", name=" + this.name + ", approvalType=" + this.approvalType + ", addressType=" + this.addressType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.approvalRaw);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.name);
        Integer num = this.approvalType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.addressType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.Spender.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Spender> serializer() {
            return Spender$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Spender(int i, String str, String str2, String str3, Integer num, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.approvalRaw = null;
        } else {
            this.approvalRaw = str;
        }
        if ((i & 2) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str2;
        }
        if ((i & 4) == 0) {
            this.name = null;
        } else {
            this.name = str3;
        }
        if ((i & 8) == 0) {
            this.approvalType = null;
        } else {
            this.approvalType = num;
        }
        if ((i & 16) == 0) {
            this.addressType = null;
        } else {
            this.addressType = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(Spender spender, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || spender.approvalRaw != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, spender.approvalRaw);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || spender.imageUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, spender.imageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || spender.name != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, spender.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || spender.approvalType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, spender.approvalType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && spender.addressType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, spender.addressType);
    }

    public Spender(String str, String str2, String str3, Integer num, String str4) {
        this.approvalRaw = str;
        this.imageUrl = str2;
        this.name = str3;
        this.approvalType = num;
        this.addressType = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r8v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String):void (m)] (LINE:286) call: com.okinc.business.defi.biz.net.bean.Spender.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ Spender(String str, String str2, String str3, Integer num, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4);
    }
}
