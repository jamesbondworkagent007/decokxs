package com.okinc.okpaymentapi.data.remote.model.experience;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class B2CPostPaymentResp implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private String account;
    private String baseAmount;
    private String baseCurrency;
    private String cardPayErrorCode;
    private boolean formRequest;
    private int minutesNumber;
    private String orderNo;
    private HashMap<String, String> param;
    private String referenceCode;
    private String responseSummary;
    private String url;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<B2CPostPaymentResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<B2CPostPaymentResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final B2CPostPaymentResp createFromParcel(Parcel parcel) {
            HashMap map;
            Intrinsics.checkNotNullParameter(parcel, "");
            boolean z = parcel.readInt() != 0;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                map = null;
            } else {
                int i = parcel.readInt();
                HashMap map2 = new HashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    map2.put(parcel.readString(), parcel.readString());
                }
                map = map2;
            }
            return new B2CPostPaymentResp(z, string, string2, string3, string4, map, parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final B2CPostPaymentResp[] newArray(int i) {
            return new B2CPostPaymentResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public B2CPostPaymentResp() {
        this(false, (String) null, (String) null, (String) null, (String) null, (HashMap) null, (String) null, 0, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.formRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.orderNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.responseSummary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.cardPayErrorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> component6() {
        return this.param;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.referenceCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.minutesNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.account;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final B2CPostPaymentResp copy(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, HashMap<String, String> map, @NotNull String str5, int i, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new B2CPostPaymentResp(z, str, str2, str3, str4, map, str5, i, str6, str7, str8);
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
        if (!(obj instanceof B2CPostPaymentResp)) {
            return false;
        }
        B2CPostPaymentResp b2CPostPaymentResp = (B2CPostPaymentResp) obj;
        return this.formRequest == b2CPostPaymentResp.formRequest && Intrinsics.EZpvd((Object) this.url, (Object) b2CPostPaymentResp.url) && Intrinsics.EZpvd((Object) this.orderNo, (Object) b2CPostPaymentResp.orderNo) && Intrinsics.EZpvd((Object) this.responseSummary, (Object) b2CPostPaymentResp.responseSummary) && Intrinsics.EZpvd((Object) this.cardPayErrorCode, (Object) b2CPostPaymentResp.cardPayErrorCode) && Intrinsics.EZpvd(this.param, b2CPostPaymentResp.param) && Intrinsics.EZpvd((Object) this.referenceCode, (Object) b2CPostPaymentResp.referenceCode) && this.minutesNumber == b2CPostPaymentResp.minutesNumber && Intrinsics.EZpvd((Object) this.account, (Object) b2CPostPaymentResp.account) && Intrinsics.EZpvd((Object) this.baseAmount, (Object) b2CPostPaymentResp.baseAmount) && Intrinsics.EZpvd((Object) this.baseCurrency, (Object) b2CPostPaymentResp.baseCurrency);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccount() {
        return this.account;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseAmount() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCardPayErrorCode() {
        return this.cardPayErrorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFormRequest() {
        return this.formRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMinutesNumber() {
        return this.minutesNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderNo() {
        return this.orderNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> getParam() {
        return this.param;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReferenceCode() {
        return this.referenceCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getResponseSummary() {
        return this.responseSummary;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.formRequest);
        int iHashCode2 = this.url.hashCode();
        int iHashCode3 = this.orderNo.hashCode();
        int iHashCode4 = this.responseSummary.hashCode();
        int iHashCode5 = this.cardPayErrorCode.hashCode();
        HashMap<String, String> map = this.param;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (map == null ? 0 : map.hashCode())) * 31) + this.referenceCode.hashCode()) * 31) + Integer.hashCode(this.minutesNumber)) * 31) + this.account.hashCode()) * 31) + this.baseAmount.hashCode()) * 31) + this.baseCurrency.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.account = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCardPayErrorCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cardPayErrorCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFormRequest(boolean z) {
        this.formRequest = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinutesNumber(int i) {
        this.minutesNumber = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderNo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderNo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setParam(HashMap<String, String> map) {
        this.param = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReferenceCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.referenceCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setResponseSummary(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.responseSummary = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "B2CPostPaymentResp(formRequest=" + this.formRequest + ", url=" + this.url + ", orderNo=" + this.orderNo + ", responseSummary=" + this.responseSummary + ", cardPayErrorCode=" + this.cardPayErrorCode + ", param=" + this.param + ", referenceCode=" + this.referenceCode + ", minutesNumber=" + this.minutesNumber + ", account=" + this.account + ", baseAmount=" + this.baseAmount + ", baseCurrency=" + this.baseCurrency + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.formRequest ? 1 : 0);
        parcel.writeString(this.url);
        parcel.writeString(this.orderNo);
        parcel.writeString(this.responseSummary);
        parcel.writeString(this.cardPayErrorCode);
        HashMap<String, String> map = this.param;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        parcel.writeString(this.referenceCode);
        parcel.writeInt(this.minutesNumber);
        parcel.writeString(this.account);
        parcel.writeString(this.baseAmount);
        parcel.writeString(this.baseCurrency);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.experience.B2CPostPaymentResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<B2CPostPaymentResp> serializer() {
            return B2CPostPaymentResp$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, new HashMapSerializer(stringSerializer, stringSerializer), null, null, null, null, null};
    }

    public /* synthetic */ B2CPostPaymentResp(int i, boolean z, String str, String str2, String str3, String str4, HashMap map, String str5, int i2, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.formRequest = false;
        } else {
            this.formRequest = z;
        }
        if ((i & 2) == 0) {
            this.url = "";
        } else {
            this.url = str;
        }
        if ((i & 4) == 0) {
            this.orderNo = "";
        } else {
            this.orderNo = str2;
        }
        if ((i & 8) == 0) {
            this.responseSummary = "";
        } else {
            this.responseSummary = str3;
        }
        if ((i & 16) == 0) {
            this.cardPayErrorCode = "";
        } else {
            this.cardPayErrorCode = str4;
        }
        if ((i & 32) == 0) {
            this.param = new HashMap<>();
        } else {
            this.param = map;
        }
        if ((i & 64) == 0) {
            this.referenceCode = "";
        } else {
            this.referenceCode = str5;
        }
        if ((i & 128) == 0) {
            this.minutesNumber = 0;
        } else {
            this.minutesNumber = i2;
        }
        if ((i & 256) == 0) {
            this.account = "";
        } else {
            this.account = str6;
        }
        if ((i & 512) == 0) {
            this.baseAmount = "";
        } else {
            this.baseAmount = str7;
        }
        if ((i & 1024) == 0) {
            this.baseCurrency = "";
        } else {
            this.baseCurrency = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(B2CPostPaymentResp b2CPostPaymentResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || b2CPostPaymentResp.formRequest) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, b2CPostPaymentResp.formRequest);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) b2CPostPaymentResp.url, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, b2CPostPaymentResp.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) b2CPostPaymentResp.orderNo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, b2CPostPaymentResp.orderNo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) b2CPostPaymentResp.responseSummary, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, b2CPostPaymentResp.responseSummary);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) b2CPostPaymentResp.cardPayErrorCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, b2CPostPaymentResp.cardPayErrorCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(b2CPostPaymentResp.param, new HashMap())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], b2CPostPaymentResp.param);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) b2CPostPaymentResp.referenceCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, b2CPostPaymentResp.referenceCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || b2CPostPaymentResp.minutesNumber != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 7, b2CPostPaymentResp.minutesNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) b2CPostPaymentResp.account, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, b2CPostPaymentResp.account);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) b2CPostPaymentResp.baseAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, b2CPostPaymentResp.baseAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && Intrinsics.EZpvd((Object) b2CPostPaymentResp.baseCurrency, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 10, b2CPostPaymentResp.baseCurrency);
    }

    public B2CPostPaymentResp(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, HashMap<String, String> map, @NotNull String str5, int i, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.formRequest = z;
        this.url = str;
        this.orderNo = str2;
        this.responseSummary = str3;
        this.cardPayErrorCode = str4;
        this.param = map;
        this.referenceCode = str5;
        this.minutesNumber = i;
        this.account = str6;
        this.baseAmount = str7;
        this.baseCurrency = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0071: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x002a: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0030: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:47) call: java.util.HashMap.<init>():void type: CONSTRUCTOR) : (r18v0 java.util.HashMap))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003e: ARITH (r24v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r20v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (""))
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:41) call: com.okinc.okpaymentapi.data.remote.model.experience.B2CPostPaymentResp.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.HashMap, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ B2CPostPaymentResp(boolean z, String str, String str2, String str3, String str4, HashMap map, String str5, int i, String str6, String str7, String str8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? new HashMap() : map, (i2 & 64) != 0 ? "" : str5, (i2 & 128) == 0 ? i : 0, (i2 & 256) != 0 ? "" : str6, (i2 & 512) != 0 ? "" : str7, (i2 & 1024) == 0 ? str8 : "");
    }
}
