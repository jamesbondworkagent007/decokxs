package com.okinc.crcore.coreapi.net.responsebean.bsc;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class UserInfoResponseBean implements Parcelable {
    private final String address;
    private final boolean canModifyName;
    private final String checkoutPuk;
    private final String chineseName;
    private final String city;
    private final String commonName;
    private final String countryId;
    private final String cpf;
    private final String firstName;
    private final String freezeDepositReasonMessage;
    private final String freezeWithdrawReasonMessage;
    private final String fullName;
    private final int kycLevel;
    private final String lastName;
    private final String postalCode;
    private final String state;
    private final List<String> userFreezeList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UserInfoResponseBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<UserInfoResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserInfoResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UserInfoResponseBean(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserInfoResponseBean[] newArray(int i) {
            return new UserInfoResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UserInfoResponseBean() {
        this((String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (List) null, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.freezeDepositReasonMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.freezeWithdrawReasonMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.kycLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.lastName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.postalCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component17() {
        return this.userFreezeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.canModifyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.checkoutPuk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chineseName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.city;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.commonName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.countryId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.cpf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.firstName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserInfoResponseBean copy(@NotNull String str, boolean z, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, int i, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new UserInfoResponseBean(str, z, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, i, str12, str13, str14, list);
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
        if (!(obj instanceof UserInfoResponseBean)) {
            return false;
        }
        UserInfoResponseBean userInfoResponseBean = (UserInfoResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) userInfoResponseBean.address) && this.canModifyName == userInfoResponseBean.canModifyName && Intrinsics.EZpvd((Object) this.checkoutPuk, (Object) userInfoResponseBean.checkoutPuk) && Intrinsics.EZpvd((Object) this.chineseName, (Object) userInfoResponseBean.chineseName) && Intrinsics.EZpvd((Object) this.city, (Object) userInfoResponseBean.city) && Intrinsics.EZpvd((Object) this.commonName, (Object) userInfoResponseBean.commonName) && Intrinsics.EZpvd((Object) this.countryId, (Object) userInfoResponseBean.countryId) && Intrinsics.EZpvd((Object) this.cpf, (Object) userInfoResponseBean.cpf) && Intrinsics.EZpvd((Object) this.firstName, (Object) userInfoResponseBean.firstName) && Intrinsics.EZpvd((Object) this.freezeDepositReasonMessage, (Object) userInfoResponseBean.freezeDepositReasonMessage) && Intrinsics.EZpvd((Object) this.freezeWithdrawReasonMessage, (Object) userInfoResponseBean.freezeWithdrawReasonMessage) && Intrinsics.EZpvd((Object) this.fullName, (Object) userInfoResponseBean.fullName) && this.kycLevel == userInfoResponseBean.kycLevel && Intrinsics.EZpvd((Object) this.lastName, (Object) userInfoResponseBean.lastName) && Intrinsics.EZpvd((Object) this.postalCode, (Object) userInfoResponseBean.postalCode) && Intrinsics.EZpvd((Object) this.state, (Object) userInfoResponseBean.state) && Intrinsics.EZpvd(this.userFreezeList, userInfoResponseBean.userFreezeList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanModifyName() {
        return this.canModifyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCheckoutPuk() {
        return this.checkoutPuk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChineseName() {
        return this.chineseName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCity() {
        return this.city;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCommonName() {
        return this.commonName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCountryId() {
        return this.countryId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCpf() {
        return this.cpf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFreezeDepositReasonMessage() {
        return this.freezeDepositReasonMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFreezeWithdrawReasonMessage() {
        return this.freezeWithdrawReasonMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getKycLevel() {
        return this.kycLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getUserFreezeList() {
        return this.userFreezeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.address.hashCode() * 31) + Boolean.hashCode(this.canModifyName)) * 31) + this.checkoutPuk.hashCode()) * 31) + this.chineseName.hashCode()) * 31) + this.city.hashCode()) * 31) + this.commonName.hashCode()) * 31) + this.countryId.hashCode()) * 31) + this.cpf.hashCode()) * 31) + this.firstName.hashCode()) * 31) + this.freezeDepositReasonMessage.hashCode()) * 31) + this.freezeWithdrawReasonMessage.hashCode()) * 31) + this.fullName.hashCode()) * 31) + Integer.hashCode(this.kycLevel)) * 31) + this.lastName.hashCode()) * 31) + this.postalCode.hashCode()) * 31) + this.state.hashCode()) * 31) + this.userFreezeList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UserInfoResponseBean(address=" + this.address + ", canModifyName=" + this.canModifyName + ", checkoutPuk=" + this.checkoutPuk + ", chineseName=" + this.chineseName + ", city=" + this.city + ", commonName=" + this.commonName + ", countryId=" + this.countryId + ", cpf=" + this.cpf + ", firstName=" + this.firstName + ", freezeDepositReasonMessage=" + this.freezeDepositReasonMessage + ", freezeWithdrawReasonMessage=" + this.freezeWithdrawReasonMessage + ", fullName=" + this.fullName + ", kycLevel=" + this.kycLevel + ", lastName=" + this.lastName + ", postalCode=" + this.postalCode + ", state=" + this.state + ", userFreezeList=" + this.userFreezeList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        parcel.writeInt(this.canModifyName ? 1 : 0);
        parcel.writeString(this.checkoutPuk);
        parcel.writeString(this.chineseName);
        parcel.writeString(this.city);
        parcel.writeString(this.commonName);
        parcel.writeString(this.countryId);
        parcel.writeString(this.cpf);
        parcel.writeString(this.firstName);
        parcel.writeString(this.freezeDepositReasonMessage);
        parcel.writeString(this.freezeWithdrawReasonMessage);
        parcel.writeString(this.fullName);
        parcel.writeInt(this.kycLevel);
        parcel.writeString(this.lastName);
        parcel.writeString(this.postalCode);
        parcel.writeString(this.state);
        parcel.writeStringList(this.userFreezeList);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.UserInfoResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserInfoResponseBean> serializer() {
            return UserInfoResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UserInfoResponseBean(int i, String str, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i2, String str12, String str13, String str14, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.address = "";
        } else {
            this.address = str;
        }
        if ((i & 2) == 0) {
            this.canModifyName = false;
        } else {
            this.canModifyName = z;
        }
        if ((i & 4) == 0) {
            this.checkoutPuk = "";
        } else {
            this.checkoutPuk = str2;
        }
        if ((i & 8) == 0) {
            this.chineseName = "";
        } else {
            this.chineseName = str3;
        }
        if ((i & 16) == 0) {
            this.city = "";
        } else {
            this.city = str4;
        }
        if ((i & 32) == 0) {
            this.commonName = "";
        } else {
            this.commonName = str5;
        }
        if ((i & 64) == 0) {
            this.countryId = "";
        } else {
            this.countryId = str6;
        }
        if ((i & 128) == 0) {
            this.cpf = "";
        } else {
            this.cpf = str7;
        }
        if ((i & 256) == 0) {
            this.firstName = "";
        } else {
            this.firstName = str8;
        }
        if ((i & 512) == 0) {
            this.freezeDepositReasonMessage = "";
        } else {
            this.freezeDepositReasonMessage = str9;
        }
        if ((i & 1024) == 0) {
            this.freezeWithdrawReasonMessage = "";
        } else {
            this.freezeWithdrawReasonMessage = str10;
        }
        if ((i & 2048) == 0) {
            this.fullName = "";
        } else {
            this.fullName = str11;
        }
        if ((i & 4096) == 0) {
            this.kycLevel = 0;
        } else {
            this.kycLevel = i2;
        }
        if ((i & 8192) == 0) {
            this.lastName = "";
        } else {
            this.lastName = str12;
        }
        if ((i & 16384) == 0) {
            this.postalCode = "";
        } else {
            this.postalCode = str13;
        }
        if ((32768 & i) == 0) {
            this.state = "";
        } else {
            this.state = str14;
        }
        this.userFreezeList = (i & 65536) == 0 ? yDY.AhwBna() : list;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(UserInfoResponseBean userInfoResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) userInfoResponseBean.address, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, userInfoResponseBean.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || userInfoResponseBean.canModifyName) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, userInfoResponseBean.canModifyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) userInfoResponseBean.checkoutPuk, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, userInfoResponseBean.checkoutPuk);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) userInfoResponseBean.chineseName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, userInfoResponseBean.chineseName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) userInfoResponseBean.city, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, userInfoResponseBean.city);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) userInfoResponseBean.commonName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, userInfoResponseBean.commonName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) userInfoResponseBean.countryId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, userInfoResponseBean.countryId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) userInfoResponseBean.cpf, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, userInfoResponseBean.cpf);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) userInfoResponseBean.firstName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, userInfoResponseBean.firstName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) userInfoResponseBean.freezeDepositReasonMessage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, userInfoResponseBean.freezeDepositReasonMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) userInfoResponseBean.freezeWithdrawReasonMessage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, userInfoResponseBean.freezeWithdrawReasonMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) userInfoResponseBean.fullName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, userInfoResponseBean.fullName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || userInfoResponseBean.kycLevel != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 12, userInfoResponseBean.kycLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) userInfoResponseBean.lastName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, userInfoResponseBean.lastName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) userInfoResponseBean.postalCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, userInfoResponseBean.postalCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) userInfoResponseBean.state, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, userInfoResponseBean.state);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && Intrinsics.EZpvd(userInfoResponseBean.userFreezeList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 16, kSerializerArr[16], userInfoResponseBean.userFreezeList);
    }

    public UserInfoResponseBean(@NotNull String str, boolean z, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, int i, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.address = str;
        this.canModifyName = z;
        this.checkoutPuk = str2;
        this.chineseName = str3;
        this.city = str4;
        this.commonName = str5;
        this.countryId = str6;
        this.cpf = str7;
        this.firstName = str8;
        this.freezeDepositReasonMessage = str9;
        this.freezeWithdrawReasonMessage = str10;
        this.fullName = str11;
        this.kycLevel = i;
        this.lastName = str12;
        this.postalCode = str13;
        this.state = str14;
        this.userFreezeList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00bc: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0065: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r31v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x008d: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0091: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:31)) : (r35v0 java.util.List))
 A[MD:(java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:14) call: com.okinc.crcore.coreapi.net.responsebean.bsc.UserInfoResponseBean.<init>(java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ UserInfoResponseBean(String str, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, String str12, String str13, String str14, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? "" : str7, (i2 & 256) != 0 ? "" : str8, (i2 & 512) != 0 ? "" : str9, (i2 & 1024) != 0 ? "" : str10, (i2 & 2048) != 0 ? "" : str11, (i2 & 4096) == 0 ? i : 0, (i2 & 8192) != 0 ? "" : str12, (i2 & 16384) != 0 ? "" : str13, (i2 & 32768) != 0 ? "" : str14, (i2 & 65536) != 0 ? yDY.AhwBna() : list);
    }
}
