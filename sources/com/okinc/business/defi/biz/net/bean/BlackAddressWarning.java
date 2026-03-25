package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class BlackAddressWarning implements Parcelable {
    private String address;
    private String msg;
    private String tag;
    private Boolean tagExt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BlackAddressWarning> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BlackAddressWarning> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BlackAddressWarning createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BlackAddressWarning(string, string2, string3, boolValueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BlackAddressWarning[] newArray(int i) {
            return new BlackAddressWarning[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BlackAddressWarning() {
        this((String) null, (String) null, (String) null, (Boolean) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BlackAddressWarning copy$default(BlackAddressWarning blackAddressWarning, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blackAddressWarning.address;
        }
        if ((i & 2) != 0) {
            str2 = blackAddressWarning.tag;
        }
        if ((i & 4) != 0) {
            str3 = blackAddressWarning.msg;
        }
        if ((i & 8) != 0) {
            bool = blackAddressWarning.tagExt;
        }
        return blackAddressWarning.copy(str, str2, str3, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.tagExt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BlackAddressWarning copy(String str, String str2, String str3, Boolean bool) {
        return new BlackAddressWarning(str, str2, str3, bool);
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
        if (!(obj instanceof BlackAddressWarning)) {
            return false;
        }
        BlackAddressWarning blackAddressWarning = (BlackAddressWarning) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) blackAddressWarning.address) && Intrinsics.EZpvd((Object) this.tag, (Object) blackAddressWarning.tag) && Intrinsics.EZpvd((Object) this.msg, (Object) blackAddressWarning.msg) && Intrinsics.EZpvd(this.tagExt, blackAddressWarning.tagExt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getTagExt() {
        return this.tagExt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.address;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.tag;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.msg;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Boolean bool = this.tagExt;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMsg(String str) {
        this.msg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTag(String str) {
        this.tag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTagExt(Boolean bool) {
        this.tagExt = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BlackAddressWarning(address=" + this.address + ", tag=" + this.tag + ", msg=" + this.msg + ", tagExt=" + this.tagExt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        parcel.writeString(this.tag);
        parcel.writeString(this.msg);
        Boolean bool = this.tagExt;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.BlackAddressWarning.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BlackAddressWarning> serializer() {
            return BlackAddressWarning$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BlackAddressWarning(int i, String str, String str2, String str3, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.address = null;
        } else {
            this.address = str;
        }
        if ((i & 2) == 0) {
            this.tag = null;
        } else {
            this.tag = str2;
        }
        if ((i & 4) == 0) {
            this.msg = null;
        } else {
            this.msg = str3;
        }
        if ((i & 8) == 0) {
            this.tagExt = null;
        } else {
            this.tagExt = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(BlackAddressWarning blackAddressWarning, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || blackAddressWarning.address != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, blackAddressWarning.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || blackAddressWarning.tag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, blackAddressWarning.tag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || blackAddressWarning.msg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, blackAddressWarning.msg);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && blackAddressWarning.tagExt == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, blackAddressWarning.tagExt);
    }

    public BlackAddressWarning(String str, String str2, String str3, Boolean bool) {
        this.address = str;
        this.tag = str2;
        this.msg = str3;
        this.tagExt = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r5v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:174) call: com.okinc.business.defi.biz.net.bean.BlackAddressWarning.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ BlackAddressWarning(String str, String str2, String str3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool);
    }
}
