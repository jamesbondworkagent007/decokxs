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
public final class JitoInfoResult implements Parcelable {
    private String clientGasPrice;
    private String maxGasPrice;
    private String minGasPrice;
    private String tipAccountAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<JitoInfoResult> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<JitoInfoResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JitoInfoResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new JitoInfoResult(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JitoInfoResult[] newArray(int i) {
            return new JitoInfoResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JitoInfoResult() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ JitoInfoResult copy$default(JitoInfoResult jitoInfoResult, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jitoInfoResult.minGasPrice;
        }
        if ((i & 2) != 0) {
            str2 = jitoInfoResult.clientGasPrice;
        }
        if ((i & 4) != 0) {
            str3 = jitoInfoResult.maxGasPrice;
        }
        if ((i & 8) != 0) {
            str4 = jitoInfoResult.tipAccountAddress;
        }
        return jitoInfoResult.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.minGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.clientGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.maxGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tipAccountAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JitoInfoResult copy(String str, String str2, String str3, String str4) {
        return new JitoInfoResult(str, str2, str3, str4);
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
        if (!(obj instanceof JitoInfoResult)) {
            return false;
        }
        JitoInfoResult jitoInfoResult = (JitoInfoResult) obj;
        return Intrinsics.EZpvd((Object) this.minGasPrice, (Object) jitoInfoResult.minGasPrice) && Intrinsics.EZpvd((Object) this.clientGasPrice, (Object) jitoInfoResult.clientGasPrice) && Intrinsics.EZpvd((Object) this.maxGasPrice, (Object) jitoInfoResult.maxGasPrice) && Intrinsics.EZpvd((Object) this.tipAccountAddress, (Object) jitoInfoResult.tipAccountAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClientGasPrice() {
        return this.clientGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxGasPrice() {
        return this.maxGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinGasPrice() {
        return this.minGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTipAccountAddress() {
        return this.tipAccountAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.minGasPrice;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.clientGasPrice;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.maxGasPrice;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.tipAccountAddress;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClientGasPrice(String str) {
        this.clientGasPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxGasPrice(String str) {
        this.maxGasPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinGasPrice(String str) {
        this.minGasPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTipAccountAddress(String str) {
        this.tipAccountAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "JitoInfoResult(minGasPrice=" + this.minGasPrice + ", clientGasPrice=" + this.clientGasPrice + ", maxGasPrice=" + this.maxGasPrice + ", tipAccountAddress=" + this.tipAccountAddress + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.minGasPrice);
        parcel.writeString(this.clientGasPrice);
        parcel.writeString(this.maxGasPrice);
        parcel.writeString(this.tipAccountAddress);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.JitoInfoResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<JitoInfoResult> serializer() {
            return JitoInfoResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ JitoInfoResult(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.minGasPrice = "0";
        } else {
            this.minGasPrice = str;
        }
        if ((i & 2) == 0) {
            this.clientGasPrice = "0";
        } else {
            this.clientGasPrice = str2;
        }
        if ((i & 4) == 0) {
            this.maxGasPrice = "0";
        } else {
            this.maxGasPrice = str3;
        }
        if ((i & 8) == 0) {
            this.tipAccountAddress = null;
        } else {
            this.tipAccountAddress = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(JitoInfoResult jitoInfoResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) jitoInfoResult.minGasPrice, (Object) "0")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, jitoInfoResult.minGasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) jitoInfoResult.clientGasPrice, (Object) "0")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, jitoInfoResult.clientGasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) jitoInfoResult.maxGasPrice, (Object) "0")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, jitoInfoResult.maxGasPrice);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && jitoInfoResult.tipAccountAddress == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, jitoInfoResult.tipAccountAddress);
    }

    public JitoInfoResult(String str, String str2, String str3, String str4) {
        this.minGasPrice = str;
        this.clientGasPrice = str2;
        this.maxGasPrice = str3;
        this.tipAccountAddress = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("0") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("0") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:492) call: com.okinc.business.defi.biz.net.bean.JitoInfoResult.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ JitoInfoResult(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str, (i & 2) != 0 ? "0" : str2, (i & 4) != 0 ? "0" : str3, (i & 8) != 0 ? null : str4);
    }
}
