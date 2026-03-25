package com.okinc.okuser.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class User {
    private UserInfo info;
    private boolean isLogin;
    private boolean isTesting;
    private boolean isVisibleInSwitchAccountList;
    private final String loginName;
    private long loginTime;
    private PersonalSetting personalSetting;
    private UserProfile profile;
    private String siteCode;
    private final String tk;
    private Token token;
    private final String uid;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ void getLoginName$annotations() {
    }

    @SerialName("entityCode")
    public static /* synthetic */ void getSiteCode$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.loginName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.isTesting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.siteCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PersonalSetting component12() {
        return this.personalSetting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Token component2() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5$OKUser_okuser() {
        return this.isLogin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.loginTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.isVisibleInSwitchAccountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserInfo component8() {
        return this.info;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserProfile component9() {
        return this.profile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final User copy(@NotNull String str, @NotNull Token token, @NotNull String str2, @NotNull String str3, boolean z, long j, boolean z2, UserInfo userInfo, UserProfile userProfile, boolean z3, String str4, PersonalSetting personalSetting) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(token, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new User(str, token, str2, str3, z, j, z2, userInfo, userProfile, z3, str4, personalSetting);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        return Intrinsics.EZpvd((Object) this.loginName, (Object) user.loginName) && Intrinsics.EZpvd(this.token, user.token) && Intrinsics.EZpvd((Object) this.tk, (Object) user.tk) && Intrinsics.EZpvd((Object) this.uid, (Object) user.uid) && this.isLogin == user.isLogin && this.loginTime == user.loginTime && this.isVisibleInSwitchAccountList == user.isVisibleInSwitchAccountList && Intrinsics.EZpvd(this.info, user.info) && Intrinsics.EZpvd(this.profile, user.profile) && this.isTesting == user.isTesting && Intrinsics.EZpvd((Object) this.siteCode, (Object) user.siteCode) && Intrinsics.EZpvd(this.personalSetting, user.personalSetting);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserInfo getInfo() {
        return this.info;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLoginName() {
        return this.loginName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getLoginTime() {
        return this.loginTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PersonalSetting getPersonalSetting() {
        return this.personalSetting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserProfile getProfile() {
        return this.profile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSiteCode() {
        return this.siteCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTk() {
        return this.tk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Token getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUid() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.loginName.hashCode();
        int iHashCode2 = this.token.hashCode();
        int iHashCode3 = this.tk.hashCode();
        int iHashCode4 = this.uid.hashCode();
        int iHashCode5 = Boolean.hashCode(this.isLogin);
        int iHashCode6 = Long.hashCode(this.loginTime);
        int iHashCode7 = Boolean.hashCode(this.isVisibleInSwitchAccountList);
        UserInfo userInfo = this.info;
        int iHashCode8 = userInfo == null ? 0 : userInfo.hashCode();
        UserProfile userProfile = this.profile;
        int iHashCode9 = userProfile == null ? 0 : userProfile.hashCode();
        int iHashCode10 = Boolean.hashCode(this.isTesting);
        String str = this.siteCode;
        int iHashCode11 = str == null ? 0 : str.hashCode();
        PersonalSetting personalSetting = this.personalSetting;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (personalSetting != null ? personalSetting.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isLogin$OKUser_okuser() {
        return this.isLogin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isTesting() {
        return this.isTesting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isVisibleInSwitchAccountList() {
        return this.isVisibleInSwitchAccountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInfo(UserInfo userInfo) {
        this.info = userInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLogin$OKUser_okuser(boolean z) {
        this.isLogin = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLoginTime(long j) {
        this.loginTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPersonalSetting(PersonalSetting personalSetting) {
        this.personalSetting = personalSetting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfile(UserProfile userProfile) {
        this.profile = userProfile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSiteCode(String str) {
        this.siteCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTesting(boolean z) {
        this.isTesting = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToken(@NotNull Token token) {
        Intrinsics.checkNotNullParameter(token, "");
        this.token = token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVisibleInSwitchAccountList(boolean z) {
        this.isVisibleInSwitchAccountList = z;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okuser.data.User.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<User> serializer() {
            return User$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ User(int i, String str, Token token, String str2, String str3, boolean z, long j, boolean z2, UserInfo userInfo, UserProfile userProfile, boolean z3, String str4, PersonalSetting personalSetting, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, User$$serializer.INSTANCE.getDescriptor());
        }
        this.loginName = str;
        this.token = token;
        this.tk = str2;
        this.uid = str3;
        if ((i & 16) == 0) {
            this.isLogin = false;
        } else {
            this.isLogin = z;
        }
        this.loginTime = (i & 32) == 0 ? 0L : j;
        this.isVisibleInSwitchAccountList = (i & 64) == 0 ? true : z2;
        if ((i & 128) == 0) {
            this.info = null;
        } else {
            this.info = userInfo;
        }
        if ((i & 256) == 0) {
            this.profile = null;
        } else {
            this.profile = userProfile;
        }
        if ((i & 512) == 0) {
            this.isTesting = false;
        } else {
            this.isTesting = z3;
        }
        if ((i & 1024) == 0) {
            this.siteCode = null;
        } else {
            this.siteCode = str4;
        }
        if ((i & 2048) == 0) {
            this.personalSetting = null;
        } else {
            this.personalSetting = personalSetting;
        }
    }

    public static final /* synthetic */ void write$Self$OKUser_okuser(User user, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, user.loginName);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, Token$$serializer.INSTANCE, user.token);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, user.tk);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, user.uid);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || user.isLogin) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, user.isLogin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || user.loginTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 5, user.loginTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !user.isVisibleInSwitchAccountList) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, user.isVisibleInSwitchAccountList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || user.info != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, UserInfo$$serializer.INSTANCE, user.info);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || user.profile != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, UserProfile$$serializer.INSTANCE, user.profile);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || user.isTesting) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, user.isTesting);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || user.siteCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, user.siteCode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && user.personalSetting == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, PersonalSetting$$serializer.INSTANCE, user.personalSetting);
    }

    public User(@NotNull String str, @NotNull Token token, @NotNull String str2, @NotNull String str3, boolean z, long j, boolean z2, UserInfo userInfo, UserProfile userProfile, boolean z3, String str4, PersonalSetting personalSetting) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(token, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.loginName = str;
        this.token = token;
        this.tk = str2;
        this.uid = str3;
        this.isLogin = z;
        this.loginTime = j;
        this.isVisibleInSwitchAccountList = z2;
        this.info = userInfo;
        this.profile = userProfile;
        this.isTesting = z3;
        this.siteCode = str4;
        this.personalSetting = personalSetting;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0052: CONSTRUCTOR 
  (r18v0 java.lang.String)
  (r19v0 com.okinc.okuser.data.Token)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r31v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r23v0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0015: ARITH (r31v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? true : (r25v0 boolean))
  (wrap:com.okinc.okuser.data.UserInfo:?: TERNARY null = ((wrap:int:0x001e: ARITH (r31v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okuser.data.UserInfo) : (r26v0 com.okinc.okuser.data.UserInfo))
  (wrap:com.okinc.okuser.data.UserProfile:?: TERNARY null = ((wrap:int:0x0027: ARITH (r31v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okuser.data.UserProfile) : (r27v0 com.okinc.okuser.data.UserProfile))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002f: ARITH (r31v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r28v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r31v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:com.okinc.okuser.data.PersonalSetting:?: TERNARY null = ((wrap:int:0x003f: ARITH (r31v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okuser.data.PersonalSetting) : (r30v0 com.okinc.okuser.data.PersonalSetting))
 A[MD:(java.lang.String, com.okinc.okuser.data.Token, java.lang.String, java.lang.String, boolean, long, boolean, com.okinc.okuser.data.UserInfo, com.okinc.okuser.data.UserProfile, boolean, java.lang.String, com.okinc.okuser.data.PersonalSetting):void (m)] (LINE:10) call: com.okinc.okuser.data.User.<init>(java.lang.String, com.okinc.okuser.data.Token, java.lang.String, java.lang.String, boolean, long, boolean, com.okinc.okuser.data.UserInfo, com.okinc.okuser.data.UserProfile, boolean, java.lang.String, com.okinc.okuser.data.PersonalSetting):void type: THIS */
    public /* synthetic */ User(String str, Token token, String str2, String str3, boolean z, long j, boolean z2, UserInfo userInfo, UserProfile userProfile, boolean z3, String str4, PersonalSetting personalSetting, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, token, str2, str3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? 0L : j, (i & 64) != 0 ? true : z2, (i & 128) != 0 ? null : userInfo, (i & 256) != 0 ? null : userProfile, (i & 512) != 0 ? false : z3, (i & 1024) != 0 ? null : str4, (i & 2048) != 0 ? null : personalSetting);
    }

    public final String getNickname() {
        UserProfile userProfile = this.profile;
        String petname = userProfile != null ? userProfile.getPetname() : null;
        if (C33129mqd.OLrzqt((CharSequence) petname)) {
            Intrinsics.copydefault((Object) petname);
            return petname;
        }
        return getUsername();
    }

    public final String getNameDesc() {
        UserInfo userInfo;
        String displayName;
        UserProfile userProfile = this.profile;
        return ((userProfile != null && userProfile.isDefaultGeneratedNickname) || (userInfo = this.info) == null || (displayName = userInfo.getDisplayName()) == null) ? "" : displayName;
    }

    public final String getSubAccountType() {
        String subAccountName;
        UserInfo userInfo = this.info;
        return (userInfo == null || (subAccountName = userInfo.getSubAccountName()) == null) ? "" : subAccountName;
    }

    public final String getUsername() {
        String phone;
        UserInfo userInfo = this.info;
        if (userInfo != null) {
            if (userInfo.isSubUser()) {
                phone = this.loginName;
            } else if (C33129mqd.OLrzqt((CharSequence) userInfo.getEmail())) {
                phone = userInfo.getEmail();
                Intrinsics.copydefault((Object) phone);
            } else if (C33129mqd.OLrzqt((CharSequence) userInfo.getPhone())) {
                phone = userInfo.getPhone();
                Intrinsics.copydefault((Object) phone);
            } else {
                phone = this.loginName;
            }
            if (phone != null) {
                return phone;
            }
        }
        return this.loginName;
    }

    public final boolean isMainAccount() {
        if (this.info != null) {
            return !r0.isSubUser();
        }
        return false;
    }

    public final boolean isSubAccount() {
        UserInfo userInfo = this.info;
        if (userInfo != null) {
            return userInfo.isSubUser();
        }
        return false;
    }

    public final boolean isVip() {
        UserInfo userInfo = this.info;
        if (userInfo != null) {
            return userInfo.isVip();
        }
        return false;
    }

    public String toString() {
        return "User(uid=" + this.uid + ", siteCode=" + this.siteCode + ", isVisibleInSwitchAccountList=" + this.isVisibleInSwitchAccountList + ")";
    }
}
