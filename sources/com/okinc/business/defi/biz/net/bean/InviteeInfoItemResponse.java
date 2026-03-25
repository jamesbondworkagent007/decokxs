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
public final class InviteeInfoItemResponse implements Parcelable {
    private String code;
    private String discountRate;
    private String lastTradeTime;
    private String signMsg;
    private String signature;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InviteeInfoItemResponse> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InviteeInfoItemResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InviteeInfoItemResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InviteeInfoItemResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InviteeInfoItemResponse[] newArray(int i) {
            return new InviteeInfoItemResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InviteeInfoItemResponse() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InviteeInfoItemResponse copy$default(InviteeInfoItemResponse inviteeInfoItemResponse, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inviteeInfoItemResponse.code;
        }
        if ((i & 2) != 0) {
            str2 = inviteeInfoItemResponse.signMsg;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = inviteeInfoItemResponse.signature;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = inviteeInfoItemResponse.lastTradeTime;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = inviteeInfoItemResponse.discountRate;
        }
        return inviteeInfoItemResponse.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.signMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.lastTradeTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.discountRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InviteeInfoItemResponse copy(String str, String str2, String str3, String str4, String str5) {
        return new InviteeInfoItemResponse(str, str2, str3, str4, str5);
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
        if (!(obj instanceof InviteeInfoItemResponse)) {
            return false;
        }
        InviteeInfoItemResponse inviteeInfoItemResponse = (InviteeInfoItemResponse) obj;
        return Intrinsics.EZpvd((Object) this.code, (Object) inviteeInfoItemResponse.code) && Intrinsics.EZpvd((Object) this.signMsg, (Object) inviteeInfoItemResponse.signMsg) && Intrinsics.EZpvd((Object) this.signature, (Object) inviteeInfoItemResponse.signature) && Intrinsics.EZpvd((Object) this.lastTradeTime, (Object) inviteeInfoItemResponse.lastTradeTime) && Intrinsics.EZpvd((Object) this.discountRate, (Object) inviteeInfoItemResponse.discountRate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDiscountRate() {
        return this.discountRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastTradeTime() {
        return this.lastTradeTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignMsg() {
        return this.signMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.code;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.signMsg;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.signature;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.lastTradeTime;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.discountRate;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCode(String str) {
        this.code = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDiscountRate(String str) {
        this.discountRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLastTradeTime(String str) {
        this.lastTradeTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignMsg(String str) {
        this.signMsg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignature(String str) {
        this.signature = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InviteeInfoItemResponse(code=" + this.code + ", signMsg=" + this.signMsg + ", signature=" + this.signature + ", lastTradeTime=" + this.lastTradeTime + ", discountRate=" + this.discountRate + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.code);
        parcel.writeString(this.signMsg);
        parcel.writeString(this.signature);
        parcel.writeString(this.lastTradeTime);
        parcel.writeString(this.discountRate);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.InviteeInfoItemResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InviteeInfoItemResponse> serializer() {
            return InviteeInfoItemResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InviteeInfoItemResponse(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.code = "";
        } else {
            this.code = str;
        }
        if ((i & 2) == 0) {
            this.signMsg = "";
        } else {
            this.signMsg = str2;
        }
        if ((i & 4) == 0) {
            this.signature = "";
        } else {
            this.signature = str3;
        }
        if ((i & 8) == 0) {
            this.lastTradeTime = "";
        } else {
            this.lastTradeTime = str4;
        }
        if ((i & 16) == 0) {
            this.discountRate = "";
        } else {
            this.discountRate = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(InviteeInfoItemResponse inviteeInfoItemResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) inviteeInfoItemResponse.code, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, inviteeInfoItemResponse.code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) inviteeInfoItemResponse.signMsg, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, inviteeInfoItemResponse.signMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) inviteeInfoItemResponse.signature, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, inviteeInfoItemResponse.signature);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) inviteeInfoItemResponse.lastTradeTime, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, inviteeInfoItemResponse.lastTradeTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) inviteeInfoItemResponse.discountRate, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, inviteeInfoItemResponse.discountRate);
    }

    public InviteeInfoItemResponse(String str, String str2, String str3, String str4, String str5) {
        this.code = str;
        this.signMsg = str2;
        this.signature = str3;
        this.lastTradeTime = str4;
        this.discountRate = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:266) call: com.okinc.business.defi.biz.net.bean.InviteeInfoItemResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InviteeInfoItemResponse(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
