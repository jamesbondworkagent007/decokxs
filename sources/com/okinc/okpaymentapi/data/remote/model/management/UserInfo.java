package com.okinc.okpaymentapi.data.remote.model.management;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class UserInfo {
    private final String actionCode;
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
    private final String lastName;
    private final boolean needPayback;
    private final String postalCode;
    private final String state;
    private final ArrayList<String> userFreezeList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UserInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, false, 262143, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.checkoutPuk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.canModifyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component13() {
        return this.userFreezeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.freezeDepositReasonMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.freezeWithdrawReasonMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.cpf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.actionCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component18() {
        return this.needPayback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.city;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.commonName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chineseName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.countryId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.firstName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.lastName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.postalCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, boolean z, ArrayList<String> arrayList, @NotNull String str12, @NotNull String str13, String str14, @NotNull String str15, boolean z2) {
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
        Intrinsics.checkNotNullParameter(str15, "");
        return new UserInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, z, arrayList, str12, str13, str14, str15, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) userInfo.address) && Intrinsics.EZpvd((Object) this.city, (Object) userInfo.city) && Intrinsics.EZpvd((Object) this.commonName, (Object) userInfo.commonName) && Intrinsics.EZpvd((Object) this.chineseName, (Object) userInfo.chineseName) && Intrinsics.EZpvd((Object) this.countryId, (Object) userInfo.countryId) && Intrinsics.EZpvd((Object) this.firstName, (Object) userInfo.firstName) && Intrinsics.EZpvd((Object) this.lastName, (Object) userInfo.lastName) && Intrinsics.EZpvd((Object) this.fullName, (Object) userInfo.fullName) && Intrinsics.EZpvd((Object) this.postalCode, (Object) userInfo.postalCode) && Intrinsics.EZpvd((Object) this.state, (Object) userInfo.state) && Intrinsics.EZpvd((Object) this.checkoutPuk, (Object) userInfo.checkoutPuk) && this.canModifyName == userInfo.canModifyName && Intrinsics.EZpvd(this.userFreezeList, userInfo.userFreezeList) && Intrinsics.EZpvd((Object) this.freezeDepositReasonMessage, (Object) userInfo.freezeDepositReasonMessage) && Intrinsics.EZpvd((Object) this.freezeWithdrawReasonMessage, (Object) userInfo.freezeWithdrawReasonMessage) && Intrinsics.EZpvd((Object) this.cpf, (Object) userInfo.cpf) && Intrinsics.EZpvd((Object) this.actionCode, (Object) userInfo.actionCode) && this.needPayback == userInfo.needPayback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActionCode() {
        return this.actionCode;
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
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedPayback() {
        return this.needPayback;
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
    public final ArrayList<String> getUserFreezeList() {
        return this.userFreezeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.address.hashCode();
        int iHashCode2 = this.city.hashCode();
        int iHashCode3 = this.commonName.hashCode();
        int iHashCode4 = this.chineseName.hashCode();
        int iHashCode5 = this.countryId.hashCode();
        int iHashCode6 = this.firstName.hashCode();
        int iHashCode7 = this.lastName.hashCode();
        int iHashCode8 = this.fullName.hashCode();
        int iHashCode9 = this.postalCode.hashCode();
        int iHashCode10 = this.state.hashCode();
        int iHashCode11 = this.checkoutPuk.hashCode();
        int iHashCode12 = Boolean.hashCode(this.canModifyName);
        ArrayList<String> arrayList = this.userFreezeList;
        int iHashCode13 = arrayList == null ? 0 : arrayList.hashCode();
        int iHashCode14 = this.freezeDepositReasonMessage.hashCode();
        int iHashCode15 = this.freezeWithdrawReasonMessage.hashCode();
        String str = this.cpf;
        return (((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.actionCode.hashCode()) * 31) + Boolean.hashCode(this.needPayback);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UserInfo(address=" + this.address + ", city=" + this.city + ", commonName=" + this.commonName + ", chineseName=" + this.chineseName + ", countryId=" + this.countryId + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", fullName=" + this.fullName + ", postalCode=" + this.postalCode + ", state=" + this.state + ", checkoutPuk=" + this.checkoutPuk + ", canModifyName=" + this.canModifyName + ", userFreezeList=" + this.userFreezeList + ", freezeDepositReasonMessage=" + this.freezeDepositReasonMessage + ", freezeWithdrawReasonMessage=" + this.freezeWithdrawReasonMessage + ", cpf=" + this.cpf + ", actionCode=" + this.actionCode + ", needPayback=" + this.needPayback + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.management.UserInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserInfo> serializer() {
            return UserInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UserInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, ArrayList arrayList, String str12, String str13, String str14, String str15, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.address = "";
        } else {
            this.address = str;
        }
        if ((i & 2) == 0) {
            this.city = "";
        } else {
            this.city = str2;
        }
        if ((i & 4) == 0) {
            this.commonName = "";
        } else {
            this.commonName = str3;
        }
        if ((i & 8) == 0) {
            this.chineseName = "";
        } else {
            this.chineseName = str4;
        }
        if ((i & 16) == 0) {
            this.countryId = "";
        } else {
            this.countryId = str5;
        }
        if ((i & 32) == 0) {
            this.firstName = "";
        } else {
            this.firstName = str6;
        }
        if ((i & 64) == 0) {
            this.lastName = "";
        } else {
            this.lastName = str7;
        }
        if ((i & 128) == 0) {
            this.fullName = "";
        } else {
            this.fullName = str8;
        }
        if ((i & 256) == 0) {
            this.postalCode = "";
        } else {
            this.postalCode = str9;
        }
        if ((i & 512) == 0) {
            this.state = "";
        } else {
            this.state = str10;
        }
        if ((i & 1024) == 0) {
            this.checkoutPuk = "";
        } else {
            this.checkoutPuk = str11;
        }
        if ((i & 2048) == 0) {
            this.canModifyName = false;
        } else {
            this.canModifyName = z;
        }
        this.userFreezeList = (i & 4096) == 0 ? new ArrayList() : arrayList;
        if ((i & 8192) == 0) {
            this.freezeDepositReasonMessage = "";
        } else {
            this.freezeDepositReasonMessage = str12;
        }
        if ((i & 16384) == 0) {
            this.freezeWithdrawReasonMessage = "";
        } else {
            this.freezeWithdrawReasonMessage = str13;
        }
        this.cpf = (32768 & i) == 0 ? null : str14;
        if ((65536 & i) == 0) {
            this.actionCode = "";
        } else {
            this.actionCode = str15;
        }
        if ((i & 131072) == 0) {
            this.needPayback = false;
        } else {
            this.needPayback = z2;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(UserInfo userInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) userInfo.address, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, userInfo.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) userInfo.city, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, userInfo.city);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) userInfo.commonName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, userInfo.commonName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) userInfo.chineseName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, userInfo.chineseName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) userInfo.countryId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, userInfo.countryId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) userInfo.firstName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, userInfo.firstName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) userInfo.lastName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, userInfo.lastName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) userInfo.fullName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, userInfo.fullName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) userInfo.postalCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, userInfo.postalCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) userInfo.state, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, userInfo.state);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) userInfo.checkoutPuk, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, userInfo.checkoutPuk);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || userInfo.canModifyName) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 11, userInfo.canModifyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd(userInfo.userFreezeList, new ArrayList())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr[12], userInfo.userFreezeList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) userInfo.freezeDepositReasonMessage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, userInfo.freezeDepositReasonMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) userInfo.freezeWithdrawReasonMessage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, userInfo.freezeWithdrawReasonMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || userInfo.cpf != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, userInfo.cpf);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) userInfo.actionCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, userInfo.actionCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || userInfo.needPayback) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 17, userInfo.needPayback);
        }
    }

    public UserInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, boolean z, ArrayList<String> arrayList, @NotNull String str12, @NotNull String str13, String str14, @NotNull String str15, boolean z2) {
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
        Intrinsics.checkNotNullParameter(str15, "");
        this.address = str;
        this.city = str2;
        this.commonName = str3;
        this.chineseName = str4;
        this.countryId = str5;
        this.firstName = str6;
        this.lastName = str7;
        this.fullName = str8;
        this.postalCode = str9;
        this.state = str10;
        this.checkoutPuk = str11;
        this.canModifyName = z;
        this.userFreezeList = arrayList;
        this.freezeDepositReasonMessage = str12;
        this.freezeWithdrawReasonMessage = str13;
        this.cpf = str14;
        this.actionCode = str15;
        this.needPayback = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ca: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r38v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r38v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r38v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r38v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r38v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r38v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r38v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r38v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r38v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r38v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r38v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005c: ARITH (r38v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r31v0 boolean))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0064: ARITH (r38v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006a: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:22) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r32v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0070: ARITH (r38v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007a: ARITH (r38v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0086: ARITH (r38v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0091: ARITH (r38v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x009c: ARITH (r38v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? false : (r37v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.ArrayList<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:9) call: com.okinc.okpaymentapi.data.remote.model.management.UserInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ UserInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, ArrayList arrayList, String str12, String str13, String str14, String str15, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? false : z, (i & 4096) != 0 ? new ArrayList() : arrayList, (i & 8192) != 0 ? "" : str12, (i & 16384) != 0 ? "" : str13, (i & 32768) != 0 ? null : str14, (i & 65536) != 0 ? "" : str15, (i & 131072) != 0 ? false : z2);
    }
}
