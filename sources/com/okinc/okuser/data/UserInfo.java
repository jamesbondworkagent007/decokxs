package com.okinc.okuser.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import o.C33129mqd;
import o.C47260tmg;
import o.C56444yFp;
import o.C6982aZe;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class UserInfo implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private int accountType;
    private String accountTypeName;
    private String antiPhishingCode;
    private JsonObject appI18nDto;
    private String areaCode;
    private int authLogin;
    private int authTrade;
    private BoundAccount boundAccount;
    private boolean boundCrossSiteAccount;
    private Integer brDualAccountType;
    private String email;
    private boolean fido1Ready;
    private boolean fidoReady;
    private List<String> greyscaleHiddenItems;
    private List<String> guidanceItems;
    private boolean hasEmergencyContact;
    private boolean isBindGoogle;
    private boolean isBindPhone;
    private final boolean isEmailVerified;
    private final boolean isFido1OrFido2Ready;
    private final boolean isFido1ReadyOrNot;
    private final boolean isFidoReadyOrNot;
    private boolean isSetTradePwd;
    private boolean isSubUser;
    private boolean isVerifyEmail;
    private boolean isVip;
    private int kycLevel;
    private String language;
    private long lastBindAuthenticatorDate;
    private String levelName;
    private String loginName;
    private boolean loginPwdExist;
    private boolean newBindAuthenticatorFlow;
    private int okbLevel;
    private String phone;
    private int qiyuLevel;
    private RbacFeatures rbacFeatures;
    private String realEmail;
    private String realName;
    private long registerTimeMs;
    private RmFeatures rmFeatures;
    private boolean showAuthenticatorPromotion;
    private SubAccountFunction subAccountFunction;
    private SubUserAuth subUserAuth;
    private boolean supportCrossSiteBinding;
    private int tradeFrequency;
    private List<Integer> userFunction;
    private int userLevel;
    private int userTradingFeeLevel;
    private String uuid;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UserInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<UserInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            int i = parcel.readInt();
            String string = parcel.readString();
            int i2 = parcel.readInt();
            boolean z5 = parcel.readInt() != 0;
            String string2 = parcel.readString();
            boolean z6 = parcel.readInt() != 0;
            boolean z7 = parcel.readInt() != 0;
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i7 = parcel.readInt();
            long j = parcel.readLong();
            boolean z8 = parcel.readInt() != 0;
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            SubUserAuth subUserAuthCreateFromParcel = parcel.readInt() == 0 ? null : SubUserAuth.CREATOR.createFromParcel(parcel);
            int i8 = parcel.readInt();
            String string9 = parcel.readString();
            int i9 = parcel.readInt();
            SubAccountFunction subAccountFunctionCreateFromParcel = parcel.readInt() == 0 ? null : SubAccountFunction.CREATOR.createFromParcel(parcel);
            JsonObject jsonObject = (JsonObject) parcel.readValue(UserInfo.class.getClassLoader());
            String string10 = parcel.readString();
            boolean z9 = parcel.readInt() != 0;
            boolean z10 = parcel.readInt() != 0;
            long j2 = parcel.readLong();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i10 = parcel.readInt();
                arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
            }
            return new UserInfo(z, z2, z3, z4, i, string, i2, z5, string2, z6, z7, i3, i4, i5, i6, string3, string4, string5, string6, i7, j, z8, string7, string8, subUserAuthCreateFromParcel, i8, string9, i9, subAccountFunctionCreateFromParcel, jsonObject, string10, z9, z10, j2, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : RbacFeatures.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RmFeatures.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : BoundAccount.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserInfo[] newArray(int i) {
            return new UserInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UserInfo() {
        this(false, false, false, false, 0, null, 0, false, null, false, false, 0, 0, 0, 0, null, null, null, null, 0, 0L, false, null, null, null, 0, null, 0, null, null, null, false, false, 0L, null, null, null, null, false, false, null, null, null, false, false, null, -1, 16383, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: com.okinc.okuser.data.UserInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserInfo copy$default(UserInfo userInfo, boolean z, boolean z2, boolean z3, boolean z4, int i, String str, int i2, boolean z5, String str2, boolean z6, boolean z7, int i3, int i4, int i5, int i6, String str3, String str4, String str5, String str6, int i7, long j, boolean z8, String str7, String str8, SubUserAuth subUserAuth, int i8, String str9, int i9, SubAccountFunction subAccountFunction, JsonObject jsonObject, String str10, boolean z9, boolean z10, long j2, List list, List list2, List list3, Integer num, boolean z11, boolean z12, String str11, RbacFeatures rbacFeatures, RmFeatures rmFeatures, boolean z13, boolean z14, BoundAccount boundAccount, int i10, int i11, Object obj) {
        boolean z15 = (i10 & 1) != 0 ? userInfo.isVerifyEmail : z;
        boolean z16 = (i10 & 2) != 0 ? userInfo.isSetTradePwd : z2;
        boolean z17 = (i10 & 4) != 0 ? userInfo.isBindPhone : z3;
        boolean z18 = (i10 & 8) != 0 ? userInfo.isSubUser : z4;
        int i12 = (i10 & 16) != 0 ? userInfo.authTrade : i;
        String str12 = (i10 & 32) != 0 ? userInfo.realName : str;
        int i13 = (i10 & 64) != 0 ? userInfo.authLogin : i2;
        boolean z19 = (i10 & 128) != 0 ? userInfo.isBindGoogle : z5;
        String str13 = (i10 & 256) != 0 ? userInfo.antiPhishingCode : str2;
        boolean z20 = (i10 & 512) != 0 ? userInfo.fidoReady : z6;
        boolean z21 = (i10 & 1024) != 0 ? userInfo.fido1Ready : z7;
        int i14 = (i10 & 2048) != 0 ? userInfo.tradeFrequency : i3;
        return userInfo.copy(z15, z16, z17, z18, i12, str12, i13, z19, str13, z20, z21, i14, (i10 & 4096) != 0 ? userInfo.userLevel : i4, (i10 & 8192) != 0 ? userInfo.okbLevel : i5, (i10 & 16384) != 0 ? userInfo.kycLevel : i6, (i10 & 32768) != 0 ? userInfo.uuid : str3, (i10 & 65536) != 0 ? userInfo.email : str4, (i10 & 131072) != 0 ? userInfo.phone : str5, (i10 & 262144) != 0 ? userInfo.areaCode : str6, (i10 & 524288) != 0 ? userInfo.qiyuLevel : i7, (i10 & 1048576) != 0 ? userInfo.registerTimeMs : j, (i10 & 2097152) != 0 ? userInfo.loginPwdExist : z8, (4194304 & i10) != 0 ? userInfo.loginName : str7, (i10 & 8388608) != 0 ? userInfo.realEmail : str8, (i10 & 16777216) != 0 ? userInfo.subUserAuth : subUserAuth, (i10 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? userInfo.accountType : i8, (i10 & 67108864) != 0 ? userInfo.accountTypeName : str9, (i10 & 134217728) != 0 ? userInfo.userTradingFeeLevel : i9, (i10 & 268435456) != 0 ? userInfo.subAccountFunction : subAccountFunction, (i10 & 536870912) != 0 ? userInfo.appI18nDto : jsonObject, (i10 & 1073741824) != 0 ? userInfo.language : str10, (i10 & Integer.MIN_VALUE) != 0 ? userInfo.showAuthenticatorPromotion : z9, (i11 & 1) != 0 ? userInfo.newBindAuthenticatorFlow : z10, (i11 & 2) != 0 ? userInfo.lastBindAuthenticatorDate : j2, (i11 & 4) != 0 ? userInfo.guidanceItems : list, (i11 & 8) != 0 ? userInfo.greyscaleHiddenItems : list2, (i11 & 16) != 0 ? userInfo.userFunction : list3, (i11 & 32) != 0 ? userInfo.brDualAccountType : num, (i11 & 64) != 0 ? userInfo.isVip : z11, (i11 & 128) != 0 ? userInfo.hasEmergencyContact : z12, (i11 & 256) != 0 ? userInfo.levelName : str11, (i11 & 512) != 0 ? userInfo.rbacFeatures : rbacFeatures, (i11 & 1024) != 0 ? userInfo.rmFeatures : rmFeatures, (i11 & 2048) != 0 ? userInfo.supportCrossSiteBinding : z13, (i11 & 4096) != 0 ? userInfo.boundCrossSiteAccount : z14, (i11 & 8192) != 0 ? userInfo.boundAccount : boundAccount);
    }

    public static /* synthetic */ void getAccountType$annotations() {
    }

    public static /* synthetic */ void getLoginName$annotations() {
    }

    public static /* synthetic */ void getUserLevel$annotations() {
    }

    public static /* synthetic */ void getUserTradingFeeLevel$annotations() {
    }

    public static /* synthetic */ void getUuid$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isVerifyEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.fidoReady;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.fido1Ready;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component12() {
        return this.tradeFrequency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.userLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component14() {
        return this.okbLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component15() {
        return this.kycLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.uuid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.email;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.phone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isSetTradePwd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component20() {
        return this.qiyuLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component21() {
        return this.registerTimeMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component22() {
        return this.loginPwdExist;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.loginName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.realEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubUserAuth component25() {
        return this.subUserAuth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component26() {
        return this.accountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.accountTypeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component28() {
        return this.userTradingFeeLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubAccountFunction component29() {
        return this.subAccountFunction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isBindPhone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject component30() {
        return this.appI18nDto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.language;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component32() {
        return this.showAuthenticatorPromotion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component33() {
        return this.newBindAuthenticatorFlow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component34() {
        return this.lastBindAuthenticatorDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component35() {
        return this.guidanceItems;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component36() {
        return this.greyscaleHiddenItems;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component37() {
        return this.userFunction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component38() {
        return this.brDualAccountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component39() {
        return this.isVip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isSubUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component40() {
        return this.hasEmergencyContact;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.levelName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RbacFeatures component42() {
        return this.rbacFeatures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RmFeatures component43() {
        return this.rmFeatures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component44() {
        return this.supportCrossSiteBinding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component45() {
        return this.boundCrossSiteAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BoundAccount component46() {
        return this.boundAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.authTrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.realName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.authLogin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.isBindGoogle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.antiPhishingCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserInfo copy(boolean z, boolean z2, boolean z3, boolean z4, int i, String str, int i2, boolean z5, String str2, boolean z6, boolean z7, int i3, int i4, int i5, int i6, @NotNull String str3, String str4, String str5, String str6, int i7, long j, boolean z8, String str7, String str8, SubUserAuth subUserAuth, int i8, @NotNull String str9, int i9, SubAccountFunction subAccountFunction, JsonObject jsonObject, @NotNull String str10, boolean z9, boolean z10, long j2, List<String> list, List<String> list2, List<Integer> list3, Integer num, boolean z11, boolean z12, @NotNull String str11, RbacFeatures rbacFeatures, RmFeatures rmFeatures, boolean z13, boolean z14, BoundAccount boundAccount) {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new UserInfo(z, z2, z3, z4, i, str, i2, z5, str2, z6, z7, i3, i4, i5, i6, str3, str4, str5, str6, i7, j, z8, str7, str8, subUserAuth, i8, str9, i9, subAccountFunction, jsonObject, str10, z9, z10, j2, list, list2, list3, num, z11, z12, str11, rbacFeatures, rmFeatures, z13, z14, boundAccount);
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
        if (!(obj instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) obj;
        return this.isVerifyEmail == userInfo.isVerifyEmail && this.isSetTradePwd == userInfo.isSetTradePwd && this.isBindPhone == userInfo.isBindPhone && this.isSubUser == userInfo.isSubUser && this.authTrade == userInfo.authTrade && Intrinsics.EZpvd((Object) this.realName, (Object) userInfo.realName) && this.authLogin == userInfo.authLogin && this.isBindGoogle == userInfo.isBindGoogle && Intrinsics.EZpvd((Object) this.antiPhishingCode, (Object) userInfo.antiPhishingCode) && this.fidoReady == userInfo.fidoReady && this.fido1Ready == userInfo.fido1Ready && this.tradeFrequency == userInfo.tradeFrequency && this.userLevel == userInfo.userLevel && this.okbLevel == userInfo.okbLevel && this.kycLevel == userInfo.kycLevel && Intrinsics.EZpvd((Object) this.uuid, (Object) userInfo.uuid) && Intrinsics.EZpvd((Object) this.email, (Object) userInfo.email) && Intrinsics.EZpvd((Object) this.phone, (Object) userInfo.phone) && Intrinsics.EZpvd((Object) this.areaCode, (Object) userInfo.areaCode) && this.qiyuLevel == userInfo.qiyuLevel && this.registerTimeMs == userInfo.registerTimeMs && this.loginPwdExist == userInfo.loginPwdExist && Intrinsics.EZpvd((Object) this.loginName, (Object) userInfo.loginName) && Intrinsics.EZpvd((Object) this.realEmail, (Object) userInfo.realEmail) && Intrinsics.EZpvd(this.subUserAuth, userInfo.subUserAuth) && this.accountType == userInfo.accountType && Intrinsics.EZpvd((Object) this.accountTypeName, (Object) userInfo.accountTypeName) && this.userTradingFeeLevel == userInfo.userTradingFeeLevel && Intrinsics.EZpvd(this.subAccountFunction, userInfo.subAccountFunction) && Intrinsics.EZpvd(this.appI18nDto, userInfo.appI18nDto) && Intrinsics.EZpvd((Object) this.language, (Object) userInfo.language) && this.showAuthenticatorPromotion == userInfo.showAuthenticatorPromotion && this.newBindAuthenticatorFlow == userInfo.newBindAuthenticatorFlow && this.lastBindAuthenticatorDate == userInfo.lastBindAuthenticatorDate && Intrinsics.EZpvd(this.guidanceItems, userInfo.guidanceItems) && Intrinsics.EZpvd(this.greyscaleHiddenItems, userInfo.greyscaleHiddenItems) && Intrinsics.EZpvd(this.userFunction, userInfo.userFunction) && Intrinsics.EZpvd(this.brDualAccountType, userInfo.brDualAccountType) && this.isVip == userInfo.isVip && this.hasEmergencyContact == userInfo.hasEmergencyContact && Intrinsics.EZpvd((Object) this.levelName, (Object) userInfo.levelName) && Intrinsics.EZpvd(this.rbacFeatures, userInfo.rbacFeatures) && Intrinsics.EZpvd(this.rmFeatures, userInfo.rmFeatures) && this.supportCrossSiteBinding == userInfo.supportCrossSiteBinding && this.boundCrossSiteAccount == userInfo.boundCrossSiteAccount && Intrinsics.EZpvd(this.boundAccount, userInfo.boundAccount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAccountType() {
        return this.accountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountTypeName() {
        return this.accountTypeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAntiPhishingCode() {
        return this.antiPhishingCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject getAppI18nDto() {
        return this.appI18nDto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAreaCode() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAuthLogin() {
        return this.authLogin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAuthTrade() {
        return this.authTrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BoundAccount getBoundAccount() {
        return this.boundAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getBoundCrossSiteAccount() {
        return this.boundCrossSiteAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBrDualAccountType() {
        return this.brDualAccountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEmail() {
        return this.email;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFido1Ready() {
        return this.fido1Ready;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFidoReady() {
        return this.fidoReady;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getGreyscaleHiddenItems() {
        return this.greyscaleHiddenItems;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getGuidanceItems() {
        return this.guidanceItems;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasEmergencyContact() {
        return this.hasEmergencyContact;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getKycLevel() {
        return this.kycLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getLastBindAuthenticatorDate() {
        return this.lastBindAuthenticatorDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLevelName() {
        return this.levelName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLoginName() {
        return this.loginName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getLoginPwdExist() {
        return this.loginPwdExist;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNewBindAuthenticatorFlow() {
        return this.newBindAuthenticatorFlow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOkbLevel() {
        return this.okbLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getQiyuLevel() {
        return this.qiyuLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RbacFeatures getRbacFeatures() {
        return this.rbacFeatures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealEmail() {
        return this.realEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealName() {
        return this.realName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getRegisterTimeMs() {
        return this.registerTimeMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RmFeatures getRmFeatures() {
        return this.rmFeatures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowAuthenticatorPromotion() {
        return this.showAuthenticatorPromotion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubAccountFunction getSubAccountFunction() {
        return this.subAccountFunction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubAccountName() {
        return this.accountTypeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubUserAuth getSubUserAuth() {
        return this.subUserAuth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportCrossSiteBinding() {
        return this.supportCrossSiteBinding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTradeFrequency() {
        return this.tradeFrequency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getUserFunction() {
        return this.userFunction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getUserLevel() {
        return this.userLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getUserTradingFeeLevel() {
        return this.userTradingFeeLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isVerifyEmail);
        int iHashCode2 = Boolean.hashCode(this.isSetTradePwd);
        int iHashCode3 = Boolean.hashCode(this.isBindPhone);
        int iHashCode4 = Boolean.hashCode(this.isSubUser);
        int iHashCode5 = Integer.hashCode(this.authTrade);
        String str = this.realName;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        int iHashCode7 = Integer.hashCode(this.authLogin);
        int iHashCode8 = Boolean.hashCode(this.isBindGoogle);
        String str2 = this.antiPhishingCode;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        int iHashCode10 = Boolean.hashCode(this.fidoReady);
        int iHashCode11 = Boolean.hashCode(this.fido1Ready);
        int iHashCode12 = Integer.hashCode(this.tradeFrequency);
        int iHashCode13 = Integer.hashCode(this.userLevel);
        int iHashCode14 = Integer.hashCode(this.okbLevel);
        int iHashCode15 = Integer.hashCode(this.kycLevel);
        int iHashCode16 = this.uuid.hashCode();
        String str3 = this.email;
        int iHashCode17 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.phone;
        int iHashCode18 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.areaCode;
        int iHashCode19 = str5 == null ? 0 : str5.hashCode();
        int iHashCode20 = Integer.hashCode(this.qiyuLevel);
        int iHashCode21 = Long.hashCode(this.registerTimeMs);
        int iHashCode22 = Boolean.hashCode(this.loginPwdExist);
        String str6 = this.loginName;
        int iHashCode23 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.realEmail;
        int iHashCode24 = str7 == null ? 0 : str7.hashCode();
        SubUserAuth subUserAuth = this.subUserAuth;
        int iHashCode25 = subUserAuth == null ? 0 : subUserAuth.hashCode();
        int iHashCode26 = Integer.hashCode(this.accountType);
        int iHashCode27 = this.accountTypeName.hashCode();
        int iHashCode28 = Integer.hashCode(this.userTradingFeeLevel);
        SubAccountFunction subAccountFunction = this.subAccountFunction;
        int iHashCode29 = subAccountFunction == null ? 0 : subAccountFunction.hashCode();
        JsonObject jsonObject = this.appI18nDto;
        int iHashCode30 = jsonObject == null ? 0 : jsonObject.hashCode();
        int iHashCode31 = this.language.hashCode();
        int iHashCode32 = Boolean.hashCode(this.showAuthenticatorPromotion);
        int iHashCode33 = Boolean.hashCode(this.newBindAuthenticatorFlow);
        int iHashCode34 = Long.hashCode(this.lastBindAuthenticatorDate);
        List<String> list = this.guidanceItems;
        int iHashCode35 = list == null ? 0 : list.hashCode();
        List<String> list2 = this.greyscaleHiddenItems;
        int iHashCode36 = list2 == null ? 0 : list2.hashCode();
        List<Integer> list3 = this.userFunction;
        int iHashCode37 = list3 == null ? 0 : list3.hashCode();
        Integer num = this.brDualAccountType;
        int iHashCode38 = num == null ? 0 : num.hashCode();
        int iHashCode39 = Boolean.hashCode(this.isVip);
        int iHashCode40 = Boolean.hashCode(this.hasEmergencyContact);
        int iHashCode41 = this.levelName.hashCode();
        RbacFeatures rbacFeatures = this.rbacFeatures;
        int iHashCode42 = rbacFeatures == null ? 0 : rbacFeatures.hashCode();
        RmFeatures rmFeatures = this.rmFeatures;
        int iHashCode43 = rmFeatures == null ? 0 : rmFeatures.hashCode();
        int iHashCode44 = Boolean.hashCode(this.supportCrossSiteBinding);
        int iHashCode45 = Boolean.hashCode(this.boundCrossSiteAccount);
        BoundAccount boundAccount = this.boundAccount;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + (boundAccount == null ? 0 : boundAccount.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean is2FactorAuthEnabled() {
        return this.authLogin == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isBindGoogle() {
        return this.isBindGoogle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isBindPhone() {
        return this.isBindPhone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isEmailVerified() {
        return this.isEmailVerified;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFido1OrFido2Ready() {
        return this.isFido1OrFido2Ready;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFido1ReadyOrNot() {
        return this.isFido1ReadyOrNot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFidoReadyOrNot() {
        return this.isFidoReadyOrNot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isGoogleEnabled() {
        int i;
        return this.isBindGoogle && ((i = this.authTrade) == 1 || i == 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPhoneVerified() {
        int i;
        return this.isBindPhone && ((i = this.authTrade) == 2 || i == 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSetTradePwd() {
        return this.isSetTradePwd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSubUser() {
        return this.isSubUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isVerifyEmail() {
        return this.isVerifyEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isVip() {
        return this.isVip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountType(int i) {
        this.accountType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountTypeName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountTypeName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAntiPhishingCode(String str) {
        this.antiPhishingCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAppI18nDto(JsonObject jsonObject) {
        this.appI18nDto = jsonObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAreaCode(String str) {
        this.areaCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAuthLogin(int i) {
        this.authLogin = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAuthTrade(int i) {
        this.authTrade = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBindGoogle(boolean z) {
        this.isBindGoogle = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBindPhone(boolean z) {
        this.isBindPhone = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBoundAccount(BoundAccount boundAccount) {
        this.boundAccount = boundAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBoundCrossSiteAccount(boolean z) {
        this.boundCrossSiteAccount = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBrDualAccountType(Integer num) {
        this.brDualAccountType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEmail(String str) {
        this.email = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFido1Ready(boolean z) {
        this.fido1Ready = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFidoReady(boolean z) {
        this.fidoReady = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGreyscaleHiddenItems(List<String> list) {
        this.greyscaleHiddenItems = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGuidanceItems(List<String> list) {
        this.guidanceItems = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasEmergencyContact(boolean z) {
        this.hasEmergencyContact = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setKycLevel(int i) {
        this.kycLevel = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLanguage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.language = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLastBindAuthenticatorDate(long j) {
        this.lastBindAuthenticatorDate = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLevelName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.levelName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLoginName(String str) {
        this.loginName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLoginPwdExist(boolean z) {
        this.loginPwdExist = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewBindAuthenticatorFlow(boolean z) {
        this.newBindAuthenticatorFlow = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOkbLevel(int i) {
        this.okbLevel = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPhone(String str) {
        this.phone = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQiyuLevel(int i) {
        this.qiyuLevel = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRbacFeatures(RbacFeatures rbacFeatures) {
        this.rbacFeatures = rbacFeatures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRealEmail(String str) {
        this.realEmail = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRealName(String str) {
        this.realName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRegisterTimeMs(long j) {
        this.registerTimeMs = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRmFeatures(RmFeatures rmFeatures) {
        this.rmFeatures = rmFeatures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSetTradePwd(boolean z) {
        this.isSetTradePwd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowAuthenticatorPromotion(boolean z) {
        this.showAuthenticatorPromotion = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubAccountFunction(SubAccountFunction subAccountFunction) {
        this.subAccountFunction = subAccountFunction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubUser(boolean z) {
        this.isSubUser = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubUserAuth(SubUserAuth subUserAuth) {
        this.subUserAuth = subUserAuth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportCrossSiteBinding(boolean z) {
        this.supportCrossSiteBinding = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeFrequency(int i) {
        this.tradeFrequency = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserFunction(List<Integer> list) {
        this.userFunction = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserLevel(int i) {
        this.userLevel = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserTradingFeeLevel(int i) {
        this.userTradingFeeLevel = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUuid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uuid = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVerifyEmail(boolean z) {
        this.isVerifyEmail = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVip(boolean z) {
        this.isVip = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UserInfo(isVerifyEmail=" + this.isVerifyEmail + ", isSetTradePwd=" + this.isSetTradePwd + ", isBindPhone=" + this.isBindPhone + ", isSubUser=" + this.isSubUser + ", authTrade=" + this.authTrade + ", realName=" + this.realName + ", authLogin=" + this.authLogin + ", isBindGoogle=" + this.isBindGoogle + ", antiPhishingCode=" + this.antiPhishingCode + ", fidoReady=" + this.fidoReady + ", fido1Ready=" + this.fido1Ready + ", tradeFrequency=" + this.tradeFrequency + ", userLevel=" + this.userLevel + ", okbLevel=" + this.okbLevel + ", kycLevel=" + this.kycLevel + ", uuid=" + this.uuid + ", email=" + this.email + ", phone=" + this.phone + ", areaCode=" + this.areaCode + ", qiyuLevel=" + this.qiyuLevel + ", registerTimeMs=" + this.registerTimeMs + ", loginPwdExist=" + this.loginPwdExist + ", loginName=" + this.loginName + ", realEmail=" + this.realEmail + ", subUserAuth=" + this.subUserAuth + ", accountType=" + this.accountType + ", accountTypeName=" + this.accountTypeName + ", userTradingFeeLevel=" + this.userTradingFeeLevel + ", subAccountFunction=" + this.subAccountFunction + ", appI18nDto=" + this.appI18nDto + ", language=" + this.language + ", showAuthenticatorPromotion=" + this.showAuthenticatorPromotion + ", newBindAuthenticatorFlow=" + this.newBindAuthenticatorFlow + ", lastBindAuthenticatorDate=" + this.lastBindAuthenticatorDate + ", guidanceItems=" + this.guidanceItems + ", greyscaleHiddenItems=" + this.greyscaleHiddenItems + ", userFunction=" + this.userFunction + ", brDualAccountType=" + this.brDualAccountType + ", isVip=" + this.isVip + ", hasEmergencyContact=" + this.hasEmergencyContact + ", levelName=" + this.levelName + ", rbacFeatures=" + this.rbacFeatures + ", rmFeatures=" + this.rmFeatures + ", supportCrossSiteBinding=" + this.supportCrossSiteBinding + ", boundCrossSiteAccount=" + this.boundCrossSiteAccount + ", boundAccount=" + this.boundAccount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.isVerifyEmail ? 1 : 0);
        parcel.writeInt(this.isSetTradePwd ? 1 : 0);
        parcel.writeInt(this.isBindPhone ? 1 : 0);
        parcel.writeInt(this.isSubUser ? 1 : 0);
        parcel.writeInt(this.authTrade);
        parcel.writeString(this.realName);
        parcel.writeInt(this.authLogin);
        parcel.writeInt(this.isBindGoogle ? 1 : 0);
        parcel.writeString(this.antiPhishingCode);
        parcel.writeInt(this.fidoReady ? 1 : 0);
        parcel.writeInt(this.fido1Ready ? 1 : 0);
        parcel.writeInt(this.tradeFrequency);
        parcel.writeInt(this.userLevel);
        parcel.writeInt(this.okbLevel);
        parcel.writeInt(this.kycLevel);
        parcel.writeString(this.uuid);
        parcel.writeString(this.email);
        parcel.writeString(this.phone);
        parcel.writeString(this.areaCode);
        parcel.writeInt(this.qiyuLevel);
        parcel.writeLong(this.registerTimeMs);
        parcel.writeInt(this.loginPwdExist ? 1 : 0);
        parcel.writeString(this.loginName);
        parcel.writeString(this.realEmail);
        SubUserAuth subUserAuth = this.subUserAuth;
        if (subUserAuth == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            subUserAuth.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.accountType);
        parcel.writeString(this.accountTypeName);
        parcel.writeInt(this.userTradingFeeLevel);
        SubAccountFunction subAccountFunction = this.subAccountFunction;
        if (subAccountFunction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            subAccountFunction.writeToParcel(parcel, i);
        }
        parcel.writeValue(this.appI18nDto);
        parcel.writeString(this.language);
        parcel.writeInt(this.showAuthenticatorPromotion ? 1 : 0);
        parcel.writeInt(this.newBindAuthenticatorFlow ? 1 : 0);
        parcel.writeLong(this.lastBindAuthenticatorDate);
        parcel.writeStringList(this.guidanceItems);
        parcel.writeStringList(this.greyscaleHiddenItems);
        List<Integer> list = this.userFunction;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeInt(it.next().intValue());
            }
        }
        Integer num = this.brDualAccountType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.isVip ? 1 : 0);
        parcel.writeInt(this.hasEmergencyContact ? 1 : 0);
        parcel.writeString(this.levelName);
        RbacFeatures rbacFeatures = this.rbacFeatures;
        if (rbacFeatures == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rbacFeatures.writeToParcel(parcel, i);
        }
        RmFeatures rmFeatures = this.rmFeatures;
        if (rmFeatures == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rmFeatures.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.supportCrossSiteBinding ? 1 : 0);
        parcel.writeInt(this.boundCrossSiteAccount ? 1 : 0);
        BoundAccount boundAccount = this.boundAccount;
        if (boundAccount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            boundAccount.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okuser.data.UserInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserInfo> serializer() {
            return UserInfo$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), new ArrayListSerializer(IntSerializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ UserInfo(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, int i3, String str, int i4, boolean z5, String str2, boolean z6, boolean z7, int i5, int i6, int i7, int i8, String str3, String str4, String str5, String str6, int i9, long j, boolean z8, String str7, String str8, SubUserAuth subUserAuth, int i10, String str9, int i11, SubAccountFunction subAccountFunction, JsonObject jsonObject, String str10, boolean z9, boolean z10, long j2, List list, List list2, List list3, Integer num, boolean z11, boolean z12, String str11, RbacFeatures rbacFeatures, RmFeatures rmFeatures, boolean z13, boolean z14, BoundAccount boundAccount, boolean z15, boolean z16, boolean z17, boolean z18, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.isVerifyEmail = false;
        } else {
            this.isVerifyEmail = z;
        }
        if ((i & 2) == 0) {
            this.isSetTradePwd = false;
        } else {
            this.isSetTradePwd = z2;
        }
        if ((i & 4) == 0) {
            this.isBindPhone = false;
        } else {
            this.isBindPhone = z3;
        }
        if ((i & 8) == 0) {
            this.isSubUser = false;
        } else {
            this.isSubUser = z4;
        }
        if ((i & 16) == 0) {
            this.authTrade = 0;
        } else {
            this.authTrade = i3;
        }
        if ((i & 32) == 0) {
            this.realName = null;
        } else {
            this.realName = str;
        }
        if ((i & 64) == 0) {
            this.authLogin = 0;
        } else {
            this.authLogin = i4;
        }
        if ((i & 128) == 0) {
            this.isBindGoogle = false;
        } else {
            this.isBindGoogle = z5;
        }
        if ((i & 256) == 0) {
            this.antiPhishingCode = null;
        } else {
            this.antiPhishingCode = str2;
        }
        if ((i & 512) == 0) {
            this.fidoReady = false;
        } else {
            this.fidoReady = z6;
        }
        if ((i & 1024) == 0) {
            this.fido1Ready = false;
        } else {
            this.fido1Ready = z7;
        }
        if ((i & 2048) == 0) {
            this.tradeFrequency = 0;
        } else {
            this.tradeFrequency = i5;
        }
        if ((i & 4096) == 0) {
            this.userLevel = 0;
        } else {
            this.userLevel = i6;
        }
        if ((i & 8192) == 0) {
            this.okbLevel = 0;
        } else {
            this.okbLevel = i7;
        }
        if ((i & 16384) == 0) {
            this.kycLevel = 0;
        } else {
            this.kycLevel = i8;
        }
        if ((i & 32768) == 0) {
            this.uuid = "";
        } else {
            this.uuid = str3;
        }
        if ((i & 65536) == 0) {
            this.email = null;
        } else {
            this.email = str4;
        }
        if ((i & 131072) == 0) {
            this.phone = null;
        } else {
            this.phone = str5;
        }
        if ((262144 & i) == 0) {
            this.areaCode = null;
        } else {
            this.areaCode = str6;
        }
        if ((524288 & i) == 0) {
            this.qiyuLevel = 0;
        } else {
            this.qiyuLevel = i9;
        }
        if ((1048576 & i) == 0) {
            this.registerTimeMs = 0L;
        } else {
            this.registerTimeMs = j;
        }
        if ((2097152 & i) == 0) {
            this.loginPwdExist = false;
        } else {
            this.loginPwdExist = z8;
        }
        if ((4194304 & i) == 0) {
            this.loginName = null;
        } else {
            this.loginName = str7;
        }
        if ((8388608 & i) == 0) {
            this.realEmail = null;
        } else {
            this.realEmail = str8;
        }
        if ((16777216 & i) == 0) {
            this.subUserAuth = null;
        } else {
            this.subUserAuth = subUserAuth;
        }
        if ((33554432 & i) == 0) {
            this.accountType = 0;
        } else {
            this.accountType = i10;
        }
        if ((67108864 & i) == 0) {
            this.accountTypeName = "";
        } else {
            this.accountTypeName = str9;
        }
        if ((134217728 & i) == 0) {
            this.userTradingFeeLevel = 0;
        } else {
            this.userTradingFeeLevel = i11;
        }
        if ((268435456 & i) == 0) {
            this.subAccountFunction = null;
        } else {
            this.subAccountFunction = subAccountFunction;
        }
        if ((536870912 & i) == 0) {
            this.appI18nDto = null;
        } else {
            this.appI18nDto = jsonObject;
        }
        if ((1073741824 & i) == 0) {
            this.language = "";
        } else {
            this.language = str10;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.showAuthenticatorPromotion = false;
        } else {
            this.showAuthenticatorPromotion = z9;
        }
        if ((i2 & 1) == 0) {
            this.newBindAuthenticatorFlow = false;
        } else {
            this.newBindAuthenticatorFlow = z10;
        }
        if ((i2 & 2) == 0) {
            this.lastBindAuthenticatorDate = 0L;
        } else {
            this.lastBindAuthenticatorDate = j2;
        }
        if ((i2 & 4) == 0) {
            this.guidanceItems = null;
        } else {
            this.guidanceItems = list;
        }
        if ((i2 & 8) == 0) {
            this.greyscaleHiddenItems = null;
        } else {
            this.greyscaleHiddenItems = list2;
        }
        if ((i2 & 16) == 0) {
            this.userFunction = null;
        } else {
            this.userFunction = list3;
        }
        this.brDualAccountType = (i2 & 32) == 0 ? 1 : num;
        if ((i2 & 64) == 0) {
            this.isVip = false;
        } else {
            this.isVip = z11;
        }
        if ((i2 & 128) == 0) {
            this.hasEmergencyContact = false;
        } else {
            this.hasEmergencyContact = z12;
        }
        if ((i2 & 256) == 0) {
            this.levelName = "";
        } else {
            this.levelName = str11;
        }
        if ((i2 & 512) == 0) {
            this.rbacFeatures = null;
        } else {
            this.rbacFeatures = rbacFeatures;
        }
        if ((i2 & 1024) == 0) {
            this.rmFeatures = null;
        } else {
            this.rmFeatures = rmFeatures;
        }
        if ((i2 & 2048) == 0) {
            this.supportCrossSiteBinding = false;
        } else {
            this.supportCrossSiteBinding = z13;
        }
        if ((i2 & 4096) == 0) {
            this.boundCrossSiteAccount = false;
        } else {
            this.boundCrossSiteAccount = z14;
        }
        if ((i2 & 8192) == 0) {
            this.boundAccount = null;
        } else {
            this.boundAccount = boundAccount;
        }
        this.isEmailVerified = (i2 & 16384) == 0 ? this.isVerifyEmail : z15;
        this.isFidoReadyOrNot = (i2 & 32768) == 0 ? this.fidoReady : z16;
        this.isFido1ReadyOrNot = (i2 & 65536) == 0 ? this.fido1Ready : z17;
        if ((i2 & 131072) == 0) {
            this.isFido1OrFido2Ready = this.fidoReady || this.fido1Ready;
        } else {
            this.isFido1OrFido2Ready = z18;
        }
    }

    public static final /* synthetic */ void write$Self$OKUser_okuser(UserInfo userInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || userInfo.isVerifyEmail) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, userInfo.isVerifyEmail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || userInfo.isSetTradePwd) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, userInfo.isSetTradePwd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || userInfo.isBindPhone) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, userInfo.isBindPhone);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || userInfo.isSubUser) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, userInfo.isSubUser);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || userInfo.authTrade != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, userInfo.authTrade);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || userInfo.realName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, userInfo.realName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || userInfo.authLogin != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 6, userInfo.authLogin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || userInfo.isBindGoogle) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, userInfo.isBindGoogle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || userInfo.antiPhishingCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, userInfo.antiPhishingCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || userInfo.fidoReady) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, userInfo.fidoReady);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || userInfo.fido1Ready) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 10, userInfo.fido1Ready);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || userInfo.tradeFrequency != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 11, userInfo.tradeFrequency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || userInfo.userLevel != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 12, userInfo.userLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || userInfo.okbLevel != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 13, userInfo.okbLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || userInfo.kycLevel != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 14, userInfo.kycLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) userInfo.uuid, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, userInfo.uuid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || userInfo.email != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, userInfo.email);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || userInfo.phone != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, userInfo.phone);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || userInfo.areaCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, userInfo.areaCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || userInfo.qiyuLevel != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 19, userInfo.qiyuLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || userInfo.registerTimeMs != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 20, userInfo.registerTimeMs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || userInfo.loginPwdExist) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 21, userInfo.loginPwdExist);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || userInfo.loginName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, userInfo.loginName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || userInfo.realEmail != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, userInfo.realEmail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || userInfo.subUserAuth != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, UserInfo$SubUserAuth$$serializer.INSTANCE, userInfo.subUserAuth);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || userInfo.accountType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 25, userInfo.accountType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) userInfo.accountTypeName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, userInfo.accountTypeName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || userInfo.userTradingFeeLevel != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 27, userInfo.userTradingFeeLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || userInfo.subAccountFunction != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, UserInfo$SubAccountFunction$$serializer.INSTANCE, userInfo.subAccountFunction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || userInfo.appI18nDto != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, JsonObjectSerializer.INSTANCE, userInfo.appI18nDto);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) userInfo.language, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, userInfo.language);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || userInfo.showAuthenticatorPromotion) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 31, userInfo.showAuthenticatorPromotion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || userInfo.newBindAuthenticatorFlow) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 32, userInfo.newBindAuthenticatorFlow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || userInfo.lastBindAuthenticatorDate != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 33, userInfo.lastBindAuthenticatorDate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || userInfo.guidanceItems != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, kSerializerArr[34], userInfo.guidanceItems);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || userInfo.greyscaleHiddenItems != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, kSerializerArr[35], userInfo.greyscaleHiddenItems);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || userInfo.userFunction != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, kSerializerArr[36], userInfo.userFunction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || (num = userInfo.brDualAccountType) == null || num.intValue() != 1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 37, IntSerializer.INSTANCE, userInfo.brDualAccountType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || userInfo.isVip) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 38, userInfo.isVip);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || userInfo.hasEmergencyContact) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 39, userInfo.hasEmergencyContact);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || !Intrinsics.EZpvd((Object) userInfo.levelName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 40, userInfo.levelName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || userInfo.rbacFeatures != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 41, UserInfo$RbacFeatures$$serializer.INSTANCE, userInfo.rbacFeatures);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || userInfo.rmFeatures != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 42, UserInfo$RmFeatures$$serializer.INSTANCE, userInfo.rmFeatures);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || userInfo.supportCrossSiteBinding) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 43, userInfo.supportCrossSiteBinding);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || userInfo.boundCrossSiteAccount) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 44, userInfo.boundCrossSiteAccount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || userInfo.boundAccount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 45, UserInfo$BoundAccount$$serializer.INSTANCE, userInfo.boundAccount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || userInfo.isEmailVerified != userInfo.isVerifyEmail) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 46, userInfo.isEmailVerified);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || userInfo.isFidoReadyOrNot != userInfo.fidoReady) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 47, userInfo.isFidoReadyOrNot);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || userInfo.isFido1ReadyOrNot != userInfo.fido1Ready) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 48, userInfo.isFido1ReadyOrNot);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49)) {
            if (userInfo.isFido1OrFido2Ready == (userInfo.fidoReady || userInfo.fido1Ready)) {
                return;
            }
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 49, userInfo.isFido1OrFido2Ready);
    }

    public UserInfo(boolean z, boolean z2, boolean z3, boolean z4, int i, String str, int i2, boolean z5, String str2, boolean z6, boolean z7, int i3, int i4, int i5, int i6, @NotNull String str3, String str4, String str5, String str6, int i7, long j, boolean z8, String str7, String str8, SubUserAuth subUserAuth, int i8, @NotNull String str9, int i9, SubAccountFunction subAccountFunction, JsonObject jsonObject, @NotNull String str10, boolean z9, boolean z10, long j2, List<String> list, List<String> list2, List<Integer> list3, Integer num, boolean z11, boolean z12, @NotNull String str11, RbacFeatures rbacFeatures, RmFeatures rmFeatures, boolean z13, boolean z14, BoundAccount boundAccount) {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.isVerifyEmail = z;
        this.isSetTradePwd = z2;
        this.isBindPhone = z3;
        this.isSubUser = z4;
        this.authTrade = i;
        this.realName = str;
        this.authLogin = i2;
        this.isBindGoogle = z5;
        this.antiPhishingCode = str2;
        this.fidoReady = z6;
        this.fido1Ready = z7;
        this.tradeFrequency = i3;
        this.userLevel = i4;
        this.okbLevel = i5;
        this.kycLevel = i6;
        this.uuid = str3;
        this.email = str4;
        this.phone = str5;
        this.areaCode = str6;
        this.qiyuLevel = i7;
        this.registerTimeMs = j;
        this.loginPwdExist = z8;
        this.loginName = str7;
        this.realEmail = str8;
        this.subUserAuth = subUserAuth;
        this.accountType = i8;
        this.accountTypeName = str9;
        this.userTradingFeeLevel = i9;
        this.subAccountFunction = subAccountFunction;
        this.appI18nDto = jsonObject;
        this.language = str10;
        this.showAuthenticatorPromotion = z9;
        this.newBindAuthenticatorFlow = z10;
        this.lastBindAuthenticatorDate = j2;
        this.guidanceItems = list;
        this.greyscaleHiddenItems = list2;
        this.userFunction = list3;
        this.brDualAccountType = num;
        this.isVip = z11;
        this.hasEmergencyContact = z12;
        this.levelName = str11;
        this.rbacFeatures = rbacFeatures;
        this.rmFeatures = rmFeatures;
        this.supportCrossSiteBinding = z13;
        this.boundCrossSiteAccount = z14;
        this.boundAccount = boundAccount;
        this.isEmailVerified = z;
        this.isFidoReadyOrNot = z6;
        this.isFido1ReadyOrNot = z7;
        this.isFido1OrFido2Ready = z6 || z7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x021d: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0004: ARITH (r96v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r48v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r96v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r49v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r96v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r50v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001c: ARITH (r96v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r51v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0024: ARITH (r96v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r52v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r96v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r53v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0034: ARITH (r96v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r54v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003c: ARITH (r96v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r55v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r96v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r56v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004c: ARITH (r96v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r57v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0054: ARITH (r96v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r58v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x005c: ARITH (r96v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r59v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0064: ARITH (r96v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r60v0 int))
  (wrap:int:0x0074: TERNARY null = ((wrap:int:0x006c: ARITH (r96v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r61v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0076: ARITH (r96v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r62v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0081: ARITH (r96v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008e: ARITH (r96v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0099: ARITH (r96v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a4: ARITH (r96v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r66v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00af: ARITH (r96v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r67v0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x00ba: ARITH (r96v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r68v0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00c7: ARITH (r96v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? false : (r70v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d2: ARITH (r96v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00dd: ARITH (r96v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r72v0 java.lang.String))
  (wrap:com.okinc.okuser.data.UserInfo$SubUserAuth:?: TERNARY null = ((wrap:int:0x00e8: ARITH (r96v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okuser.data.UserInfo$SubUserAuth) : (r73v0 com.okinc.okuser.data.UserInfo$SubUserAuth))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00f3: ARITH (r96v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (0 int) : (r74v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fe: ARITH (r96v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r75v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0109: ARITH (r96v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r76v0 int))
  (wrap:com.okinc.okuser.data.UserInfo$SubAccountFunction:?: TERNARY null = ((wrap:int:0x0114: ARITH (r96v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okuser.data.UserInfo$SubAccountFunction) : (r77v0 com.okinc.okuser.data.UserInfo$SubAccountFunction))
  (wrap:kotlinx.serialization.json.JsonObject:?: TERNARY null = ((wrap:int:0x011f: ARITH (r96v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonObject) : (r78v0 kotlinx.serialization.json.JsonObject))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012a: ARITH (r96v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r79v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0135: ARITH (r96v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? false : (r80v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x013d: ARITH (r97v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r81v0 boolean))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0146: ARITH (r97v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r82v0 long) : (0 long))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x014d: ARITH (r97v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r84v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0156: ARITH (r97v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r85v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x015f: ARITH (r97v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r86v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0168: ARITH (r97v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r87v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0175: ARITH (r97v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r88v0 boolean))
  (wrap:boolean:0x0188: TERNARY null = ((wrap:int:0x0180: ARITH (r97v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r89v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x018a: ARITH (r97v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r90v0 java.lang.String) : (""))
  (wrap:com.okinc.okuser.data.UserInfo$RbacFeatures:0x0199: TERNARY null = ((wrap:int:0x0191: ARITH (r97v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okuser.data.UserInfo$RbacFeatures) : (r91v0 com.okinc.okuser.data.UserInfo$RbacFeatures))
  (wrap:com.okinc.okuser.data.UserInfo$RmFeatures:0x01a3: TERNARY null = ((wrap:int:0x019b: ARITH (r97v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okuser.data.UserInfo$RmFeatures) : (r92v0 com.okinc.okuser.data.UserInfo$RmFeatures))
  (wrap:boolean:0x01ad: TERNARY null = ((wrap:int:0x01a5: ARITH (r97v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r93v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x01af: ARITH (r97v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r94v0 boolean))
  (wrap:com.okinc.okuser.data.UserInfo$BoundAccount:?: TERNARY null = ((wrap:int:0x01b7: ARITH (r97v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okuser.data.UserInfo$BoundAccount) : (r95v0 com.okinc.okuser.data.UserInfo$BoundAccount))
 A[MD:(boolean, boolean, boolean, boolean, int, java.lang.String, int, boolean, java.lang.String, boolean, boolean, int, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, boolean, java.lang.String, java.lang.String, com.okinc.okuser.data.UserInfo$SubUserAuth, int, java.lang.String, int, com.okinc.okuser.data.UserInfo$SubAccountFunction, kotlinx.serialization.json.JsonObject, java.lang.String, boolean, boolean, long, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<java.lang.Integer>, java.lang.Integer, boolean, boolean, java.lang.String, com.okinc.okuser.data.UserInfo$RbacFeatures, com.okinc.okuser.data.UserInfo$RmFeatures, boolean, boolean, com.okinc.okuser.data.UserInfo$BoundAccount):void (m)] (LINE:16) call: com.okinc.okuser.data.UserInfo.<init>(boolean, boolean, boolean, boolean, int, java.lang.String, int, boolean, java.lang.String, boolean, boolean, int, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, boolean, java.lang.String, java.lang.String, com.okinc.okuser.data.UserInfo$SubUserAuth, int, java.lang.String, int, com.okinc.okuser.data.UserInfo$SubAccountFunction, kotlinx.serialization.json.JsonObject, java.lang.String, boolean, boolean, long, java.util.List, java.util.List, java.util.List, java.lang.Integer, boolean, boolean, java.lang.String, com.okinc.okuser.data.UserInfo$RbacFeatures, com.okinc.okuser.data.UserInfo$RmFeatures, boolean, boolean, com.okinc.okuser.data.UserInfo$BoundAccount):void type: THIS */
    public /* synthetic */ UserInfo(boolean z, boolean z2, boolean z3, boolean z4, int i, String str, int i2, boolean z5, String str2, boolean z6, boolean z7, int i3, int i4, int i5, int i6, String str3, String str4, String str5, String str6, int i7, long j, boolean z8, String str7, String str8, SubUserAuth subUserAuth, int i8, String str9, int i9, SubAccountFunction subAccountFunction, JsonObject jsonObject, String str10, boolean z9, boolean z10, long j2, List list, List list2, List list3, Integer num, boolean z11, boolean z12, String str11, RbacFeatures rbacFeatures, RmFeatures rmFeatures, boolean z13, boolean z14, BoundAccount boundAccount, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z, (i10 & 2) != 0 ? false : z2, (i10 & 4) != 0 ? false : z3, (i10 & 8) != 0 ? false : z4, (i10 & 16) != 0 ? 0 : i, (i10 & 32) != 0 ? null : str, (i10 & 64) != 0 ? 0 : i2, (i10 & 128) != 0 ? false : z5, (i10 & 256) != 0 ? null : str2, (i10 & 512) != 0 ? false : z6, (i10 & 1024) != 0 ? false : z7, (i10 & 2048) != 0 ? 0 : i3, (i10 & 4096) != 0 ? 0 : i4, (i10 & 8192) != 0 ? 0 : i5, (i10 & 16384) != 0 ? 0 : i6, (i10 & 32768) != 0 ? "" : str3, (i10 & 65536) != 0 ? null : str4, (i10 & 131072) != 0 ? null : str5, (i10 & 262144) != 0 ? null : str6, (i10 & 524288) != 0 ? 0 : i7, (i10 & 1048576) != 0 ? 0L : j, (i10 & 2097152) != 0 ? false : z8, (i10 & 4194304) != 0 ? null : str7, (i10 & 8388608) != 0 ? null : str8, (i10 & 16777216) != 0 ? null : subUserAuth, (i10 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? 0 : i8, (i10 & 67108864) != 0 ? "" : str9, (i10 & 134217728) != 0 ? 0 : i9, (i10 & 268435456) != 0 ? null : subAccountFunction, (i10 & 536870912) != 0 ? null : jsonObject, (i10 & 1073741824) != 0 ? "" : str10, (i10 & Integer.MIN_VALUE) != 0 ? false : z9, (i11 & 1) != 0 ? false : z10, (i11 & 2) == 0 ? j2 : 0L, (i11 & 4) != 0 ? null : list, (i11 & 8) != 0 ? null : list2, (i11 & 16) != 0 ? null : list3, (i11 & 32) != 0 ? 1 : num, (i11 & 64) != 0 ? false : z11, (i11 & 128) != 0 ? false : z12, (i11 & 256) == 0 ? str11 : "", (i11 & 512) != 0 ? null : rbacFeatures, (i11 & 1024) != 0 ? null : rmFeatures, (i11 & 2048) != 0 ? false : z13, (i11 & 4096) != 0 ? false : z14, (i11 & 8192) != 0 ? null : boundAccount);
    }

    @Serializable
    public static final class RbacFeatures implements Parcelable {
        public static final int $stable = 0;
        private final boolean isMainAccountApprover;
        private final boolean isMainAccountWithdrawalInitiator;
        private final boolean isRoleBasedAdmin;
        private final boolean isRoleBasedUser;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<RbacFeatures> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<RbacFeatures> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RbacFeatures createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new RbacFeatures(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RbacFeatures[] newArray(int i) {
                return new RbacFeatures[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public RbacFeatures() {
            this(false, false, false, false, 15, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ RbacFeatures copy$default(RbacFeatures rbacFeatures, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                z = rbacFeatures.isRoleBasedAdmin;
            }
            if ((i & 2) != 0) {
                z2 = rbacFeatures.isRoleBasedUser;
            }
            if ((i & 4) != 0) {
                z3 = rbacFeatures.isMainAccountApprover;
            }
            if ((i & 8) != 0) {
                z4 = rbacFeatures.isMainAccountWithdrawalInitiator;
            }
            return rbacFeatures.copy(z, z2, z3, z4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component1() {
            return this.isRoleBasedAdmin;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component2() {
            return this.isRoleBasedUser;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component3() {
            return this.isMainAccountApprover;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component4() {
            return this.isMainAccountWithdrawalInitiator;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RbacFeatures copy(boolean z, boolean z2, boolean z3, boolean z4) {
            return new RbacFeatures(z, z2, z3, z4);
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
            if (!(obj instanceof RbacFeatures)) {
                return false;
            }
            RbacFeatures rbacFeatures = (RbacFeatures) obj;
            return this.isRoleBasedAdmin == rbacFeatures.isRoleBasedAdmin && this.isRoleBasedUser == rbacFeatures.isRoleBasedUser && this.isMainAccountApprover == rbacFeatures.isMainAccountApprover && this.isMainAccountWithdrawalInitiator == rbacFeatures.isMainAccountWithdrawalInitiator;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((Boolean.hashCode(this.isRoleBasedAdmin) * 31) + Boolean.hashCode(this.isRoleBasedUser)) * 31) + Boolean.hashCode(this.isMainAccountApprover)) * 31) + Boolean.hashCode(this.isMainAccountWithdrawalInitiator);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isMainAccountApprover() {
            return this.isMainAccountApprover;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isMainAccountWithdrawalInitiator() {
            return this.isMainAccountWithdrawalInitiator;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isRoleBasedAdmin() {
            return this.isRoleBasedAdmin;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isRoleBasedUser() {
            return this.isRoleBasedUser;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "RbacFeatures(isRoleBasedAdmin=" + this.isRoleBasedAdmin + ", isRoleBasedUser=" + this.isRoleBasedUser + ", isMainAccountApprover=" + this.isMainAccountApprover + ", isMainAccountWithdrawalInitiator=" + this.isMainAccountWithdrawalInitiator + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.isRoleBasedAdmin ? 1 : 0);
            parcel.writeInt(this.isRoleBasedUser ? 1 : 0);
            parcel.writeInt(this.isMainAccountApprover ? 1 : 0);
            parcel.writeInt(this.isMainAccountWithdrawalInitiator ? 1 : 0);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okuser.data.UserInfo.RbacFeatures.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<RbacFeatures> serializer() {
                return UserInfo$RbacFeatures$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ RbacFeatures(int i, boolean z, boolean z2, boolean z3, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.isRoleBasedAdmin = false;
            } else {
                this.isRoleBasedAdmin = z;
            }
            if ((i & 2) == 0) {
                this.isRoleBasedUser = false;
            } else {
                this.isRoleBasedUser = z2;
            }
            if ((i & 4) == 0) {
                this.isMainAccountApprover = false;
            } else {
                this.isMainAccountApprover = z3;
            }
            if ((i & 8) == 0) {
                this.isMainAccountWithdrawalInitiator = false;
            } else {
                this.isMainAccountWithdrawalInitiator = z4;
            }
        }

        public static final /* synthetic */ void write$Self$OKUser_okuser(RbacFeatures rbacFeatures, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || rbacFeatures.isRoleBasedAdmin) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 0, rbacFeatures.isRoleBasedAdmin);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || rbacFeatures.isRoleBasedUser) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 1, rbacFeatures.isRoleBasedUser);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || rbacFeatures.isMainAccountApprover) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 2, rbacFeatures.isMainAccountApprover);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || rbacFeatures.isMainAccountWithdrawalInitiator) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 3, rbacFeatures.isMainAccountWithdrawalInitiator);
            }
        }

        public RbacFeatures(boolean z, boolean z2, boolean z3, boolean z4) {
            this.isRoleBasedAdmin = z;
            this.isRoleBasedUser = z2;
            this.isMainAccountApprover = z3;
            this.isMainAccountWithdrawalInitiator = z4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(boolean, boolean, boolean, boolean):void (m)] (LINE:79) call: com.okinc.okuser.data.UserInfo.RbacFeatures.<init>(boolean, boolean, boolean, boolean):void type: THIS */
        public /* synthetic */ RbacFeatures(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
        }
    }

    @Serializable
    public static final class RmFeatures implements Parcelable {
        public static final int $stable = 0;
        private final boolean isRelationshipManager;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<RmFeatures> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<RmFeatures> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RmFeatures createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new RmFeatures(parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RmFeatures[] newArray(int i) {
                return new RmFeatures[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public RmFeatures() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ RmFeatures copy$default(RmFeatures rmFeatures, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = rmFeatures.isRelationshipManager;
            }
            return rmFeatures.copy(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component1() {
            return this.isRelationshipManager;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RmFeatures copy(boolean z) {
            return new RmFeatures(z);
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
            return (obj instanceof RmFeatures) && this.isRelationshipManager == ((RmFeatures) obj).isRelationshipManager;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Boolean.hashCode(this.isRelationshipManager);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isRelationshipManager() {
            return this.isRelationshipManager;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "RmFeatures(isRelationshipManager=" + this.isRelationshipManager + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.isRelationshipManager ? 1 : 0);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okuser.data.UserInfo.RmFeatures.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<RmFeatures> serializer() {
                return UserInfo$RmFeatures$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ RmFeatures(int i, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.isRelationshipManager = false;
            } else {
                this.isRelationshipManager = z;
            }
        }

        public static final /* synthetic */ void write$Self$OKUser_okuser(RmFeatures rmFeatures, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || rmFeatures.isRelationshipManager) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 0, rmFeatures.isRelationshipManager);
            }
        }

        public RmFeatures(boolean z) {
            this.isRelationshipManager = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:89) call: com.okinc.okuser.data.UserInfo.RmFeatures.<init>(boolean):void type: THIS */
        public /* synthetic */ RmFeatures(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }

    @Serializable
    public static final class BoundAccount implements Parcelable {
        public static final int $stable = 0;
        private final String boundAccountEmail;
        private final String boundAccountSite;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<BoundAccount> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<BoundAccount> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BoundAccount createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new BoundAccount(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BoundAccount[] newArray(int i) {
                return new BoundAccount[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BoundAccount() {
            this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ BoundAccount copy$default(BoundAccount boundAccount, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = boundAccount.boundAccountEmail;
            }
            if ((i & 2) != 0) {
                str2 = boundAccount.boundAccountSite;
            }
            return boundAccount.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.boundAccountEmail;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.boundAccountSite;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BoundAccount copy(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new BoundAccount(str, str2);
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
            if (!(obj instanceof BoundAccount)) {
                return false;
            }
            BoundAccount boundAccount = (BoundAccount) obj;
            return Intrinsics.EZpvd((Object) this.boundAccountEmail, (Object) boundAccount.boundAccountEmail) && Intrinsics.EZpvd((Object) this.boundAccountSite, (Object) boundAccount.boundAccountSite);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBoundAccountEmail() {
            return this.boundAccountEmail;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBoundAccountSite() {
            return this.boundAccountSite;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.boundAccountEmail.hashCode() * 31) + this.boundAccountSite.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "BoundAccount(boundAccountEmail=" + this.boundAccountEmail + ", boundAccountSite=" + this.boundAccountSite + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.boundAccountEmail);
            parcel.writeString(this.boundAccountSite);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okuser.data.UserInfo.BoundAccount.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<BoundAccount> serializer() {
                return UserInfo$BoundAccount$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ BoundAccount(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.boundAccountEmail = "";
            } else {
                this.boundAccountEmail = str;
            }
            if ((i & 2) == 0) {
                this.boundAccountSite = "";
            } else {
                this.boundAccountSite = str2;
            }
        }

        public static final /* synthetic */ void write$Self$OKUser_okuser(BoundAccount boundAccount, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) boundAccount.boundAccountEmail, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 0, boundAccount.boundAccountEmail);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) boundAccount.boundAccountSite, (Object) "")) {
                return;
            }
            compositeEncoder.encodeStringElement(serialDescriptor, 1, boundAccount.boundAccountSite);
        }

        public BoundAccount(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.boundAccountEmail = str;
            this.boundAccountSite = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:96) call: com.okinc.okuser.data.UserInfo.BoundAccount.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ BoundAccount(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }
    }

    @Serializable
    public static final class SubUserAuth implements Parcelable {
        private boolean isAllowCreateApi;
        private boolean isAllowDeposit;
        private boolean isAllowInquireAsset;
        private boolean isAllowInquireTrading;
        private boolean isAllowLogin;
        private boolean isAllowOAuth;
        private boolean isAllowTrading;
        private boolean isAllowTransfer;
        private boolean isAllowUseAsset;
        private boolean isAllowUseFinancial;
        private boolean isAllowWithdraw;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<SubUserAuth> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<SubUserAuth> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SubUserAuth createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new SubUserAuth(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SubUserAuth[] newArray(int i) {
                return new SubUserAuth[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SubUserAuth() {
            this(false, false, false, false, false, false, false, false, false, false, false, 2047, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component1() {
            return this.isAllowLogin;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component10() {
            return this.isAllowInquireTrading;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component11() {
            return this.isAllowInquireAsset;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component2() {
            return this.isAllowDeposit;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component3() {
            return this.isAllowWithdraw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component4() {
            return this.isAllowTransfer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component5() {
            return this.isAllowTrading;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component6() {
            return this.isAllowCreateApi;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component7() {
            return this.isAllowOAuth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component8() {
            return this.isAllowUseFinancial;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component9() {
            return this.isAllowUseAsset;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SubUserAuth copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
            return new SubUserAuth(z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11);
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
            if (!(obj instanceof SubUserAuth)) {
                return false;
            }
            SubUserAuth subUserAuth = (SubUserAuth) obj;
            return this.isAllowLogin == subUserAuth.isAllowLogin && this.isAllowDeposit == subUserAuth.isAllowDeposit && this.isAllowWithdraw == subUserAuth.isAllowWithdraw && this.isAllowTransfer == subUserAuth.isAllowTransfer && this.isAllowTrading == subUserAuth.isAllowTrading && this.isAllowCreateApi == subUserAuth.isAllowCreateApi && this.isAllowOAuth == subUserAuth.isAllowOAuth && this.isAllowUseFinancial == subUserAuth.isAllowUseFinancial && this.isAllowUseAsset == subUserAuth.isAllowUseAsset && this.isAllowInquireTrading == subUserAuth.isAllowInquireTrading && this.isAllowInquireAsset == subUserAuth.isAllowInquireAsset;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((((((Boolean.hashCode(this.isAllowLogin) * 31) + Boolean.hashCode(this.isAllowDeposit)) * 31) + Boolean.hashCode(this.isAllowWithdraw)) * 31) + Boolean.hashCode(this.isAllowTransfer)) * 31) + Boolean.hashCode(this.isAllowTrading)) * 31) + Boolean.hashCode(this.isAllowCreateApi)) * 31) + Boolean.hashCode(this.isAllowOAuth)) * 31) + Boolean.hashCode(this.isAllowUseFinancial)) * 31) + Boolean.hashCode(this.isAllowUseAsset)) * 31) + Boolean.hashCode(this.isAllowInquireTrading)) * 31) + Boolean.hashCode(this.isAllowInquireAsset);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isAllowCreateApi() {
            return this.isAllowCreateApi;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isAllowDeposit() {
            return this.isAllowDeposit;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isAllowInquireAsset() {
            return this.isAllowInquireAsset;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isAllowInquireTrading() {
            return this.isAllowInquireTrading;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isAllowLogin() {
            return this.isAllowLogin;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isAllowOAuth() {
            return this.isAllowOAuth;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isAllowTrading() {
            return this.isAllowTrading;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isAllowTransfer() {
            return this.isAllowTransfer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isAllowUseAsset() {
            return this.isAllowUseAsset;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isAllowUseFinancial() {
            return this.isAllowUseFinancial;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isAllowWithdraw() {
            return this.isAllowWithdraw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAllowCreateApi(boolean z) {
            this.isAllowCreateApi = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAllowDeposit(boolean z) {
            this.isAllowDeposit = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAllowInquireAsset(boolean z) {
            this.isAllowInquireAsset = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAllowInquireTrading(boolean z) {
            this.isAllowInquireTrading = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAllowLogin(boolean z) {
            this.isAllowLogin = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAllowOAuth(boolean z) {
            this.isAllowOAuth = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAllowTrading(boolean z) {
            this.isAllowTrading = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAllowTransfer(boolean z) {
            this.isAllowTransfer = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAllowUseAsset(boolean z) {
            this.isAllowUseAsset = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAllowUseFinancial(boolean z) {
            this.isAllowUseFinancial = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAllowWithdraw(boolean z) {
            this.isAllowWithdraw = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SubUserAuth(isAllowLogin=" + this.isAllowLogin + ", isAllowDeposit=" + this.isAllowDeposit + ", isAllowWithdraw=" + this.isAllowWithdraw + ", isAllowTransfer=" + this.isAllowTransfer + ", isAllowTrading=" + this.isAllowTrading + ", isAllowCreateApi=" + this.isAllowCreateApi + ", isAllowOAuth=" + this.isAllowOAuth + ", isAllowUseFinancial=" + this.isAllowUseFinancial + ", isAllowUseAsset=" + this.isAllowUseAsset + ", isAllowInquireTrading=" + this.isAllowInquireTrading + ", isAllowInquireAsset=" + this.isAllowInquireAsset + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.isAllowLogin ? 1 : 0);
            parcel.writeInt(this.isAllowDeposit ? 1 : 0);
            parcel.writeInt(this.isAllowWithdraw ? 1 : 0);
            parcel.writeInt(this.isAllowTransfer ? 1 : 0);
            parcel.writeInt(this.isAllowTrading ? 1 : 0);
            parcel.writeInt(this.isAllowCreateApi ? 1 : 0);
            parcel.writeInt(this.isAllowOAuth ? 1 : 0);
            parcel.writeInt(this.isAllowUseFinancial ? 1 : 0);
            parcel.writeInt(this.isAllowUseAsset ? 1 : 0);
            parcel.writeInt(this.isAllowInquireTrading ? 1 : 0);
            parcel.writeInt(this.isAllowInquireAsset ? 1 : 0);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okuser.data.UserInfo.SubUserAuth.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SubUserAuth> serializer() {
                return UserInfo$SubUserAuth$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SubUserAuth(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.isAllowLogin = false;
            } else {
                this.isAllowLogin = z;
            }
            if ((i & 2) == 0) {
                this.isAllowDeposit = false;
            } else {
                this.isAllowDeposit = z2;
            }
            if ((i & 4) == 0) {
                this.isAllowWithdraw = false;
            } else {
                this.isAllowWithdraw = z3;
            }
            if ((i & 8) == 0) {
                this.isAllowTransfer = false;
            } else {
                this.isAllowTransfer = z4;
            }
            if ((i & 16) == 0) {
                this.isAllowTrading = false;
            } else {
                this.isAllowTrading = z5;
            }
            if ((i & 32) == 0) {
                this.isAllowCreateApi = false;
            } else {
                this.isAllowCreateApi = z6;
            }
            if ((i & 64) == 0) {
                this.isAllowOAuth = false;
            } else {
                this.isAllowOAuth = z7;
            }
            if ((i & 128) == 0) {
                this.isAllowUseFinancial = false;
            } else {
                this.isAllowUseFinancial = z8;
            }
            if ((i & 256) == 0) {
                this.isAllowUseAsset = false;
            } else {
                this.isAllowUseAsset = z9;
            }
            if ((i & 512) == 0) {
                this.isAllowInquireTrading = false;
            } else {
                this.isAllowInquireTrading = z10;
            }
            if ((i & 1024) == 0) {
                this.isAllowInquireAsset = false;
            } else {
                this.isAllowInquireAsset = z11;
            }
        }

        public static final /* synthetic */ void write$Self$OKUser_okuser(SubUserAuth subUserAuth, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || subUserAuth.isAllowLogin) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 0, subUserAuth.isAllowLogin);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || subUserAuth.isAllowDeposit) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 1, subUserAuth.isAllowDeposit);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || subUserAuth.isAllowWithdraw) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 2, subUserAuth.isAllowWithdraw);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || subUserAuth.isAllowTransfer) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 3, subUserAuth.isAllowTransfer);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || subUserAuth.isAllowTrading) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 4, subUserAuth.isAllowTrading);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || subUserAuth.isAllowCreateApi) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 5, subUserAuth.isAllowCreateApi);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || subUserAuth.isAllowOAuth) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 6, subUserAuth.isAllowOAuth);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || subUserAuth.isAllowUseFinancial) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 7, subUserAuth.isAllowUseFinancial);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || subUserAuth.isAllowUseAsset) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 8, subUserAuth.isAllowUseAsset);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || subUserAuth.isAllowInquireTrading) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 9, subUserAuth.isAllowInquireTrading);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || subUserAuth.isAllowInquireAsset) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 10, subUserAuth.isAllowInquireAsset);
            }
        }

        public SubUserAuth(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
            this.isAllowLogin = z;
            this.isAllowDeposit = z2;
            this.isAllowWithdraw = z3;
            this.isAllowTransfer = z4;
            this.isAllowTrading = z5;
            this.isAllowCreateApi = z6;
            this.isAllowOAuth = z7;
            this.isAllowUseFinancial = z8;
            this.isAllowUseAsset = z9;
            this.isAllowInquireTrading = z10;
            this.isAllowInquireAsset = z11;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006c: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r14v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0018: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0020: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r17v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0028: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0030: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0038: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0040: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0048: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0050: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 boolean) : false)
 A[MD:(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void (m)] (LINE:104) call: com.okinc.okuser.data.UserInfo.SubUserAuth.<init>(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void type: THIS */
        public /* synthetic */ SubUserAuth(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6, (i & 64) != 0 ? false : z7, (i & 128) != 0 ? false : z8, (i & 256) != 0 ? false : z9, (i & 512) != 0 ? false : z10, (i & 1024) == 0 ? z11 : false);
        }
    }

    @Serializable
    public static final class SubAccountFunction implements Parcelable {
        public static final int $stable = 0;
        private final boolean copyTrading;
        private final boolean custodyDelegation;
        private final boolean managedTrading;
        private final boolean visibleToUser;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<SubAccountFunction> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<SubAccountFunction> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SubAccountFunction createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new SubAccountFunction(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SubAccountFunction[] newArray(int i) {
                return new SubAccountFunction[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SubAccountFunction() {
            this(false, false, false, false, 15, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SubAccountFunction copy$default(SubAccountFunction subAccountFunction, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                z = subAccountFunction.copyTrading;
            }
            if ((i & 2) != 0) {
                z2 = subAccountFunction.custodyDelegation;
            }
            if ((i & 4) != 0) {
                z3 = subAccountFunction.managedTrading;
            }
            if ((i & 8) != 0) {
                z4 = subAccountFunction.visibleToUser;
            }
            return subAccountFunction.copy(z, z2, z3, z4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component1() {
            return this.copyTrading;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component2() {
            return this.custodyDelegation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component3() {
            return this.managedTrading;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component4() {
            return this.visibleToUser;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SubAccountFunction copy(boolean z, boolean z2, boolean z3, boolean z4) {
            return new SubAccountFunction(z, z2, z3, z4);
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
            if (!(obj instanceof SubAccountFunction)) {
                return false;
            }
            SubAccountFunction subAccountFunction = (SubAccountFunction) obj;
            return this.copyTrading == subAccountFunction.copyTrading && this.custodyDelegation == subAccountFunction.custodyDelegation && this.managedTrading == subAccountFunction.managedTrading && this.visibleToUser == subAccountFunction.visibleToUser;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getCopyTrading() {
            return this.copyTrading;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getCustodyDelegation() {
            return this.custodyDelegation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getManagedTrading() {
            return this.managedTrading;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getVisibleToUser() {
            return this.visibleToUser;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((Boolean.hashCode(this.copyTrading) * 31) + Boolean.hashCode(this.custodyDelegation)) * 31) + Boolean.hashCode(this.managedTrading)) * 31) + Boolean.hashCode(this.visibleToUser);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SubAccountFunction(copyTrading=" + this.copyTrading + ", custodyDelegation=" + this.custodyDelegation + ", managedTrading=" + this.managedTrading + ", visibleToUser=" + this.visibleToUser + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.copyTrading ? 1 : 0);
            parcel.writeInt(this.custodyDelegation ? 1 : 0);
            parcel.writeInt(this.managedTrading ? 1 : 0);
            parcel.writeInt(this.visibleToUser ? 1 : 0);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okuser.data.UserInfo.SubAccountFunction.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SubAccountFunction> serializer() {
                return UserInfo$SubAccountFunction$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SubAccountFunction(int i, boolean z, boolean z2, boolean z3, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.copyTrading = false;
            } else {
                this.copyTrading = z;
            }
            if ((i & 2) == 0) {
                this.custodyDelegation = false;
            } else {
                this.custodyDelegation = z2;
            }
            if ((i & 4) == 0) {
                this.managedTrading = false;
            } else {
                this.managedTrading = z3;
            }
            if ((i & 8) == 0) {
                this.visibleToUser = false;
            } else {
                this.visibleToUser = z4;
            }
        }

        public static final /* synthetic */ void write$Self$OKUser_okuser(SubAccountFunction subAccountFunction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || subAccountFunction.copyTrading) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 0, subAccountFunction.copyTrading);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || subAccountFunction.custodyDelegation) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 1, subAccountFunction.custodyDelegation);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || subAccountFunction.managedTrading) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 2, subAccountFunction.managedTrading);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || subAccountFunction.visibleToUser) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 3, subAccountFunction.visibleToUser);
            }
        }

        public SubAccountFunction(boolean z, boolean z2, boolean z3, boolean z4) {
            this.copyTrading = z;
            this.custodyDelegation = z2;
            this.managedTrading = z3;
            this.visibleToUser = z4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(boolean, boolean, boolean, boolean):void (m)] (LINE:121) call: com.okinc.okuser.data.UserInfo.SubAccountFunction.<init>(boolean, boolean, boolean, boolean):void type: THIS */
        public /* synthetic */ SubAccountFunction(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
        }
    }

    public final boolean isAntiPhishingVerified() {
        String str = this.antiPhishingCode;
        return str != null && C33129mqd.OLrzqt((CharSequence) str);
    }

    public final String getToastPhone() {
        try {
            String str = this.phone;
            if (str == null) {
                return "";
            }
            String strSubstring = str.substring(str.length() - 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            return strSubstring == null ? "" : strSubstring;
        } catch (Exception unused) {
            return "";
        }
    }

    public final String getToastEmail() {
        try {
            if (C33129mqd.OLrzqt((CharSequence) this.email)) {
                String str = this.email;
                Intrinsics.copydefault((Object) str);
                char cCharAt = str.charAt(0);
                String str2 = this.email;
                Intrinsics.copydefault((Object) str2);
                return cCharAt + "***@" + ((String[]) StringsKt__StringsKt.split$default((CharSequence) str2, new String[]{"@"}, false, 0, 6, (Object) null).toArray(new String[0]))[1];
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public final String getReset2FaDisplayEmail() {
        String str;
        try {
            String str2 = this.email;
            if (str2 != null && str2.length() != 0) {
                String str3 = this.email;
                if (str3 != null && !C6982aZe.KWHzl(str3)) {
                    return "";
                }
                String str4 = this.email;
                String strSubstring = null;
                List listSplit$default = str4 != null ? StringsKt__StringsKt.split$default((CharSequence) str4, new String[]{"@"}, false, 0, 6, (Object) null) : null;
                if (listSplit$default == null || listSplit$default.size() <= 1) {
                    return "";
                }
                String str5 = listSplit$default != null ? (String) listSplit$default.get(0) : null;
                String str6 = listSplit$default != null ? (String) listSplit$default.get(1) : null;
                if (str5 == null || str5.length() <= 2) {
                    str = str5 + "***@";
                } else {
                    if (str5 != null) {
                        strSubstring = str5.substring(0, 3);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    }
                    str = strSubstring + "***@";
                }
                return str + str6;
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public final boolean isAuthenticatorPromotionShow() {
        List<String> list = this.guidanceItems;
        if (list != null) {
            return list.contains("AUTHENTICATOR");
        }
        return false;
    }

    public final boolean isPrimaryAccount() {
        Integer num = this.brDualAccountType;
        return num != null && num.intValue() == 1;
    }

    public final boolean isSecondaryAccount() {
        Integer num = this.brDualAccountType;
        return num != null && num.intValue() == 2;
    }

    public final boolean isPasskeyPromotionShow() {
        List<String> list = this.guidanceItems;
        if (list != null) {
            return list.contains("PASSKEY");
        }
        return false;
    }

    public final boolean isSyncPasskeyPromotionShow() {
        List<String> list = this.guidanceItems;
        if (list != null) {
            return list.contains("SYNC_OKX_PASSKEY");
        }
        return false;
    }

    public final boolean isInHousePasskeyV1GreyScaleOn() {
        List<String> list = this.greyscaleHiddenItems;
        return (list == null || list.contains("IN_HOUSE_PASSKEY")) ? false : true;
    }

    public final boolean isInHousePasskeyV2GreyScaleOn() {
        List<String> list = this.greyscaleHiddenItems;
        return (list == null || list.contains("OKX_PASSKEY")) ? false : true;
    }

    public final String getDisplayName() {
        return C33129mqd.OLrzqt((CharSequence) this.email) ? this.email : C33129mqd.OLrzqt((CharSequence) this.phone) ? this.phone : "";
    }

    public final int securityLevelTitleRes(boolean z) {
        return getSecurityLevel(z).getTitleStringRes();
    }

    public final int securityLevelColorRes(boolean z) {
        return getSecurityLevel(z).getColorRes();
    }

    public final SecurityLevel getSecurityLevel(boolean z) {
        int i = !this.isEmailVerified ? 1 : 0;
        if (!this.isBindPhone || !isPhoneVerified()) {
            i++;
        }
        if (!this.isBindGoogle || !isGoogleEnabled()) {
            i++;
        }
        if (!isAntiPhishingVerified()) {
            i++;
        }
        if (z && !this.isFido1OrFido2Ready) {
            i++;
        }
        if (z) {
            if (i < 1) {
                return SecurityLevel.HIGH;
            }
            if (1 <= i && i < 4) {
                return SecurityLevel.MODERATE;
            }
            return SecurityLevel.LOW;
        }
        if (i < 1) {
            return SecurityLevel.HIGH;
        }
        if (1 <= i && i < 3) {
            return SecurityLevel.MODERATE;
        }
        return SecurityLevel.LOW;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class SecurityLevel {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ SecurityLevel[] $VALUES;
        private final int colorRes;
        private final int level;
        private final int titleStringRes;
        public static final SecurityLevel LOW = new SecurityLevel(VerifyDAppDomainUrlResponse.LEVEL_LOW, 0, 0, C47260tmg.TaskDescription.copydefault, C47260tmg.Activity.AEQbTJ);
        public static final SecurityLevel MODERATE = new SecurityLevel("MODERATE", 1, 3, C47260tmg.TaskDescription.AEQbTJ, C47260tmg.Activity.OLrzqt);
        public static final SecurityLevel HIGH = new SecurityLevel(VerifyDAppDomainUrlResponse.LEVEL_HIGH, 2, 4, C47260tmg.TaskDescription.KWHzl, C47260tmg.Activity.KWHzl);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ SecurityLevel[] $values() {
            return new SecurityLevel[]{LOW, MODERATE, HIGH};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<SecurityLevel> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getColorRes() {
            return this.colorRes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getLevel() {
            return this.level;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getTitleStringRes() {
            return this.titleStringRes;
        }

        private SecurityLevel(String str, int i, int i2, int i3, int i4) {
            this.level = i2;
            this.titleStringRes = i3;
            this.colorRes = i4;
        }

        static {
            SecurityLevel[] securityLevelArr$values = $values();
            $VALUES = securityLevelArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(securityLevelArr$values);
        }

        public static SecurityLevel valueOf(String str) {
            return (SecurityLevel) Enum.valueOf(SecurityLevel.class, str);
        }

        public static SecurityLevel[] values() {
            return (SecurityLevel[]) $VALUES.clone();
        }
    }
}
