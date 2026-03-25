package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class SignCallDataCheckReq implements Parcelable {
    private String chainId;
    private String data;
    private String method;
    private String raw;
    private String source;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SignCallDataCheckReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SignCallDataCheckReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignCallDataCheckReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SignCallDataCheckReq(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignCallDataCheckReq[] newArray(int i) {
            return new SignCallDataCheckReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignCallDataCheckReq() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SignCallDataCheckReq copy$default(SignCallDataCheckReq signCallDataCheckReq, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signCallDataCheckReq.data;
        }
        if ((i & 2) != 0) {
            str2 = signCallDataCheckReq.raw;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = signCallDataCheckReq.chainId;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = signCallDataCheckReq.method;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = signCallDataCheckReq.source;
        }
        return signCallDataCheckReq.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.raw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignCallDataCheckReq copy(String str, String str2, String str3, String str4, String str5) {
        return new SignCallDataCheckReq(str, str2, str3, str4, str5);
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
        if (!(obj instanceof SignCallDataCheckReq)) {
            return false;
        }
        SignCallDataCheckReq signCallDataCheckReq = (SignCallDataCheckReq) obj;
        return Intrinsics.EZpvd((Object) this.data, (Object) signCallDataCheckReq.data) && Intrinsics.EZpvd((Object) this.raw, (Object) signCallDataCheckReq.raw) && Intrinsics.EZpvd((Object) this.chainId, (Object) signCallDataCheckReq.chainId) && Intrinsics.EZpvd((Object) this.method, (Object) signCallDataCheckReq.method) && Intrinsics.EZpvd((Object) this.source, (Object) signCallDataCheckReq.source);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMethod() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRaw() {
        return this.raw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.data;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.raw;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.chainId;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.method;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.source;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(String str) {
        this.chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setData(String str) {
        this.data = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMethod(String str) {
        this.method = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRaw(String str) {
        this.raw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSource(String str) {
        this.source = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignCallDataCheckReq(data=" + this.data + ", raw=" + this.raw + ", chainId=" + this.chainId + ", method=" + this.method + ", source=" + this.source + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.data);
        parcel.writeString(this.raw);
        parcel.writeString(this.chainId);
        parcel.writeString(this.method);
        parcel.writeString(this.source);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.SignCallDataCheckReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignCallDataCheckReq> serializer() {
            return SignCallDataCheckReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignCallDataCheckReq(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.data = null;
        } else {
            this.data = str;
        }
        if ((i & 2) == 0) {
            this.raw = null;
        } else {
            this.raw = str2;
        }
        if ((i & 4) == 0) {
            this.chainId = null;
        } else {
            this.chainId = str3;
        }
        if ((i & 8) == 0) {
            this.method = null;
        } else {
            this.method = str4;
        }
        if ((i & 16) == 0) {
            this.source = null;
        } else {
            this.source = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SignCallDataCheckReq signCallDataCheckReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || signCallDataCheckReq.data != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, signCallDataCheckReq.data);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || signCallDataCheckReq.raw != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, signCallDataCheckReq.raw);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || signCallDataCheckReq.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, signCallDataCheckReq.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || signCallDataCheckReq.method != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, signCallDataCheckReq.method);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && signCallDataCheckReq.source == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, signCallDataCheckReq.source);
    }

    public SignCallDataCheckReq(String str, String str2, String str3, String str4, String str5) {
        this.data = str;
        this.raw = str2;
        this.chainId = str3;
        this.method = str4;
        this.source = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:519) call: com.okinc.business.defi.biz.net.bean.SignCallDataCheckReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SignCallDataCheckReq(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
