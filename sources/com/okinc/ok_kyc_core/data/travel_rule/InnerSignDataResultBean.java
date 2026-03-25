package com.okinc.ok_kyc_core.data.travel_rule;

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

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class InnerSignDataResultBean implements Parcelable {
    private String fullMessage;
    private String publicKey;
    private String signature;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InnerSignDataResultBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<InnerSignDataResultBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InnerSignDataResultBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InnerSignDataResultBean(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InnerSignDataResultBean[] newArray(int i) {
            return new InnerSignDataResultBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InnerSignDataResultBean() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InnerSignDataResultBean copy$default(InnerSignDataResultBean innerSignDataResultBean, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = innerSignDataResultBean.signature;
        }
        if ((i & 2) != 0) {
            str2 = innerSignDataResultBean.publicKey;
        }
        if ((i & 4) != 0) {
            str3 = innerSignDataResultBean.fullMessage;
        }
        return innerSignDataResultBean.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fullMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InnerSignDataResultBean copy(@NotNull String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        return new InnerSignDataResultBean(str, str2, str3);
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
        if (!(obj instanceof InnerSignDataResultBean)) {
            return false;
        }
        InnerSignDataResultBean innerSignDataResultBean = (InnerSignDataResultBean) obj;
        return Intrinsics.EZpvd((Object) this.signature, (Object) innerSignDataResultBean.signature) && Intrinsics.EZpvd((Object) this.publicKey, (Object) innerSignDataResultBean.publicKey) && Intrinsics.EZpvd((Object) this.fullMessage, (Object) innerSignDataResultBean.fullMessage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullMessage() {
        return this.fullMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPublicKey() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.signature.hashCode();
        String str = this.publicKey;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.fullMessage;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFullMessage(String str) {
        this.fullMessage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPublicKey(String str) {
        this.publicKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignature(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.signature = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InnerSignDataResultBean(signature=" + this.signature + ", publicKey=" + this.publicKey + ", fullMessage=" + this.fullMessage + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.signature);
        parcel.writeString(this.publicKey);
        parcel.writeString(this.fullMessage);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.travel_rule.InnerSignDataResultBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InnerSignDataResultBean> serializer() {
            return InnerSignDataResultBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InnerSignDataResultBean(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.signature = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.publicKey = null;
        } else {
            this.publicKey = str2;
        }
        if ((i & 4) == 0) {
            this.fullMessage = null;
        } else {
            this.fullMessage = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(InnerSignDataResultBean innerSignDataResultBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) innerSignDataResultBean.signature, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, innerSignDataResultBean.signature);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || innerSignDataResultBean.publicKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, innerSignDataResultBean.publicKey);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && innerSignDataResultBean.fullMessage == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, innerSignDataResultBean.fullMessage);
    }

    public InnerSignDataResultBean(@NotNull String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.signature = str;
        this.publicKey = str2;
        this.fullMessage = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:35) call: com.okinc.ok_kyc_core.data.travel_rule.InnerSignDataResultBean.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InnerSignDataResultBean(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
