package com.okinc.ok_kyc_core.data.remote.networkmodel;

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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class WalletCardChoiceData implements Parcelable {
    private final String balance;
    private final CTAButton cta;
    private final String faqUrl;
    private final String time;
    private final String value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WalletCardChoiceData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<WalletCardChoiceData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletCardChoiceData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WalletCardChoiceData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CTAButton.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletCardChoiceData[] newArray(int i) {
            return new WalletCardChoiceData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletCardChoiceData() {
        this((String) null, (String) null, (String) null, (String) null, (CTAButton) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletCardChoiceData copy$default(WalletCardChoiceData walletCardChoiceData, String str, String str2, String str3, String str4, CTAButton cTAButton, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletCardChoiceData.value;
        }
        if ((i & 2) != 0) {
            str2 = walletCardChoiceData.time;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = walletCardChoiceData.balance;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = walletCardChoiceData.faqUrl;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            cTAButton = walletCardChoiceData.cta;
        }
        return walletCardChoiceData.copy(str, str5, str6, str7, cTAButton);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.faqUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton component5() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletCardChoiceData copy(String str, String str2, String str3, String str4, CTAButton cTAButton) {
        return new WalletCardChoiceData(str, str2, str3, str4, cTAButton);
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
        if (!(obj instanceof WalletCardChoiceData)) {
            return false;
        }
        WalletCardChoiceData walletCardChoiceData = (WalletCardChoiceData) obj;
        return Intrinsics.EZpvd((Object) this.value, (Object) walletCardChoiceData.value) && Intrinsics.EZpvd((Object) this.time, (Object) walletCardChoiceData.time) && Intrinsics.EZpvd((Object) this.balance, (Object) walletCardChoiceData.balance) && Intrinsics.EZpvd((Object) this.faqUrl, (Object) walletCardChoiceData.faqUrl) && Intrinsics.EZpvd(this.cta, walletCardChoiceData.cta);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalance() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton getCta() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFaqUrl() {
        return this.faqUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTime() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.value;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.time;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.balance;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.faqUrl;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        CTAButton cTAButton = this.cta;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (cTAButton != null ? cTAButton.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletCardChoiceData(value=" + this.value + ", time=" + this.time + ", balance=" + this.balance + ", faqUrl=" + this.faqUrl + ", cta=" + this.cta + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.value);
        parcel.writeString(this.time);
        parcel.writeString(this.balance);
        parcel.writeString(this.faqUrl);
        CTAButton cTAButton = this.cta;
        if (cTAButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButton.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.WalletCardChoiceData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletCardChoiceData> serializer() {
            return WalletCardChoiceData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletCardChoiceData(int i, String str, String str2, String str3, String str4, CTAButton cTAButton, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.value = null;
        } else {
            this.value = str;
        }
        if ((i & 2) == 0) {
            this.time = null;
        } else {
            this.time = str2;
        }
        if ((i & 4) == 0) {
            this.balance = null;
        } else {
            this.balance = str3;
        }
        if ((i & 8) == 0) {
            this.faqUrl = null;
        } else {
            this.faqUrl = str4;
        }
        if ((i & 16) == 0) {
            this.cta = null;
        } else {
            this.cta = cTAButton;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(WalletCardChoiceData walletCardChoiceData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || walletCardChoiceData.value != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, walletCardChoiceData.value);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || walletCardChoiceData.time != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, walletCardChoiceData.time);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || walletCardChoiceData.balance != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, walletCardChoiceData.balance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || walletCardChoiceData.faqUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, walletCardChoiceData.faqUrl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && walletCardChoiceData.cta == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, CTAButton$$serializer.INSTANCE, walletCardChoiceData.cta);
    }

    public WalletCardChoiceData(String str, String str2, String str3, String str4, CTAButton cTAButton) {
        this.value = str;
        this.time = str2;
        this.balance = str3;
        this.faqUrl = str4;
        this.cta = cTAButton;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton) : (r9v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton):void (m)] (LINE:830) call: com.okinc.ok_kyc_core.data.remote.networkmodel.WalletCardChoiceData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton):void type: THIS */
    public /* synthetic */ WalletCardChoiceData(String str, String str2, String str3, String str4, CTAButton cTAButton, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : cTAButton);
    }
}
