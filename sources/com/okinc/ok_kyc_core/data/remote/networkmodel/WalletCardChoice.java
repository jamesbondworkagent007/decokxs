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
public final class WalletCardChoice implements Parcelable {
    private final String balance;
    private final CTAButtonAppModel cta;
    private final String faqUrl;
    private final String time;
    private final String value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WalletCardChoice> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<WalletCardChoice> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletCardChoice createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WalletCardChoice(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CTAButtonAppModel.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletCardChoice[] newArray(int i) {
            return new WalletCardChoice[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletCardChoice() {
        this((String) null, (String) null, (String) null, (String) null, (CTAButtonAppModel) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletCardChoice copy$default(WalletCardChoice walletCardChoice, String str, String str2, String str3, String str4, CTAButtonAppModel cTAButtonAppModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletCardChoice.value;
        }
        if ((i & 2) != 0) {
            str2 = walletCardChoice.time;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = walletCardChoice.balance;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = walletCardChoice.faqUrl;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            cTAButtonAppModel = walletCardChoice.cta;
        }
        return walletCardChoice.copy(str, str5, str6, str7, cTAButtonAppModel);
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
    public final CTAButtonAppModel component5() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletCardChoice copy(String str, String str2, String str3, String str4, CTAButtonAppModel cTAButtonAppModel) {
        return new WalletCardChoice(str, str2, str3, str4, cTAButtonAppModel);
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
        if (!(obj instanceof WalletCardChoice)) {
            return false;
        }
        WalletCardChoice walletCardChoice = (WalletCardChoice) obj;
        return Intrinsics.EZpvd((Object) this.value, (Object) walletCardChoice.value) && Intrinsics.EZpvd((Object) this.time, (Object) walletCardChoice.time) && Intrinsics.EZpvd((Object) this.balance, (Object) walletCardChoice.balance) && Intrinsics.EZpvd((Object) this.faqUrl, (Object) walletCardChoice.faqUrl) && Intrinsics.EZpvd(this.cta, walletCardChoice.cta);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalance() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel getCta() {
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
        CTAButtonAppModel cTAButtonAppModel = this.cta;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (cTAButtonAppModel != null ? cTAButtonAppModel.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletCardChoice(value=" + this.value + ", time=" + this.time + ", balance=" + this.balance + ", faqUrl=" + this.faqUrl + ", cta=" + this.cta + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.value);
        parcel.writeString(this.time);
        parcel.writeString(this.balance);
        parcel.writeString(this.faqUrl);
        CTAButtonAppModel cTAButtonAppModel = this.cta;
        if (cTAButtonAppModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButtonAppModel.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.WalletCardChoice.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletCardChoice> serializer() {
            return WalletCardChoice$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletCardChoice(int i, String str, String str2, String str3, String str4, CTAButtonAppModel cTAButtonAppModel, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.cta = cTAButtonAppModel;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(WalletCardChoice walletCardChoice, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || walletCardChoice.value != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, walletCardChoice.value);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || walletCardChoice.time != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, walletCardChoice.time);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || walletCardChoice.balance != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, walletCardChoice.balance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || walletCardChoice.faqUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, walletCardChoice.faqUrl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && walletCardChoice.cta == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, CTAButtonAppModel$$serializer.INSTANCE, walletCardChoice.cta);
    }

    public WalletCardChoice(String str, String str2, String str3, String str4, CTAButtonAppModel cTAButtonAppModel) {
        this.value = str;
        this.time = str2;
        this.balance = str3;
        this.faqUrl = str4;
        this.cta = cTAButtonAppModel;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel) : (r9v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel):void (m)] (LINE:841) call: com.okinc.ok_kyc_core.data.remote.networkmodel.WalletCardChoice.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel):void type: THIS */
    public /* synthetic */ WalletCardChoice(String str, String str2, String str3, String str4, CTAButtonAppModel cTAButtonAppModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : cTAButtonAppModel);
    }
}
