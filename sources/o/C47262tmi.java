package o;

import com.okinc.okuser.data.PersonalSetting;
import com.okinc.okuser.data.Token;
import com.okinc.okuser.data.TokenType;
import com.okinc.okuser.data.User;
import com.okinc.okuser.data.UserInfo;
import com.okinc.okuser.data.UserProfile;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import uniffi.user.BioBackgroundReviewStatus;
import uniffi.user.DualAccountType;
import uniffi.user.ReviewStatus;
import uniffi.user.SecondVerifyType;

/* JADX INFO: renamed from: o.tmi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47262tmi {

    /* JADX INFO: renamed from: o.tmi$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TokenType.values().length];
            try {
                iArr[TokenType.TEMP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TokenType.LIVE_TRADING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TokenType.DEMO_TRADING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[uniffi.user.TokenType.values().length];
            try {
                iArr2[uniffi.user.TokenType.DEMO_TRADING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[uniffi.user.TokenType.LIVE_TRADING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            AEQbTJ = iArr2;
        }
    }

    public static final BvH EZpvd(@NotNull User user) {
        uniffi.user.TokenType tokenType;
        java.lang.Object objM7377constructorimpl;
        java.lang.Object objM7377constructorimpl2;
        java.lang.Object objM7377constructorimpl3;
        Intrinsics.checkNotNullParameter(user, "");
        int i = Application.EZpvd[user.getToken().getType().ordinal()];
        if (i == 1 || i == 2) {
            tokenType = uniffi.user.TokenType.LIVE_TRADING;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            tokenType = uniffi.user.TokenType.DEMO_TRADING;
        }
        uniffi.user.TokenType tokenType2 = tokenType;
        java.lang.String loginName = user.getLoginName();
        java.lang.String value = user.getToken().getValue();
        java.lang.String tk = user.getTk();
        java.lang.String uid = user.getUid();
        java.lang.String siteCode = user.getSiteCode();
        boolean zIsTesting = user.isTesting();
        try {
            Result.Application application = Result.Companion;
            com.okinc.okuser.data.UserInfo info = user.getInfo();
            objM7377constructorimpl = Result.m7377constructorimpl(info != null ? OLrzqt(info, user) : null);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        BvK bvK = (BvK) objM7377constructorimpl;
        try {
            Result.Application application3 = Result.Companion;
            UserProfile profile = user.getProfile();
            objM7377constructorimpl2 = Result.m7377constructorimpl(profile != null ? OLrzqt(profile) : null);
        } catch (java.lang.Throwable th2) {
            Result.Application application4 = Result.Companion;
            objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
            objM7377constructorimpl2 = null;
        }
        C5007Bzd c5007Bzd = (C5007Bzd) objM7377constructorimpl2;
        boolean zIsLogin$OKUser_okuser = user.isLogin$OKUser_okuser();
        try {
            Result.Application application5 = Result.Companion;
            PersonalSetting personalSetting = user.getPersonalSetting();
            objM7377constructorimpl3 = Result.m7377constructorimpl(personalSetting != null ? copydefault(personalSetting) : null);
        } catch (java.lang.Throwable th3) {
            Result.Application application6 = Result.Companion;
            objM7377constructorimpl3 = Result.m7377constructorimpl(C56391yDq.EZpvd(th3));
        }
        return new BvH(uid, loginName, value, tokenType2, tk, siteCode, java.lang.Boolean.valueOf(zIsTesting), bvK, c5007Bzd, (BvI) (Result.m7383isFailureimpl(objM7377constructorimpl3) ? null : objM7377constructorimpl3), zIsLogin$OKUser_okuser);
    }

    public static final BvI copydefault(PersonalSetting personalSetting) {
        return new BvI(personalSetting.getChargeUnit(), personalSetting.getUpDownColor(), personalSetting.getUpDownTimeZone(), personalSetting.getColorPalette());
    }

    public static final BvK OLrzqt(com.okinc.okuser.data.UserInfo userInfo, User user) {
        java.lang.String str;
        boolean z;
        boolean z2;
        boolean z3;
        C5012Bzi c5012Bzi;
        DualAccountType dualAccountTypeDualAccountTypeFromInt;
        boolean z4;
        boolean z5;
        boolean zIsMainAccountWithdrawalInitiator;
        java.lang.String uuid = userInfo.getUuid();
        java.lang.String areaCode = userInfo.getAreaCode();
        java.lang.String phone = userInfo.getPhone();
        java.lang.String email = userInfo.getEmail();
        java.lang.String loginName = userInfo.getLoginName();
        java.lang.String realName = userInfo.getRealName();
        java.lang.String realEmail = userInfo.getRealEmail();
        boolean zIsSubUser = userInfo.isSubUser();
        boolean zIsVip = userInfo.isVip();
        java.lang.String levelName = userInfo.getLevelName();
        long registerTimeMs = userInfo.getRegisterTimeMs();
        boolean loginPwdExist = userInfo.getLoginPwdExist();
        boolean fidoReady = userInfo.getFidoReady();
        boolean fido1Ready = userInfo.getFido1Ready();
        int accountType = userInfo.getAccountType();
        java.lang.String accountTypeName = userInfo.getAccountTypeName();
        C5011Bzh c5011BzhCreateLocalUserData = BzK.createLocalUserData();
        C5011Bzh c5011BzhEZpvd = c5011BzhCreateLocalUserData.EZpvd((1022 & 1) != 0 ? c5011BzhCreateLocalUserData.EZpvd : !user.isVisibleInSwitchAccountList(), (1022 & 2) != 0 ? c5011BzhCreateLocalUserData.AhwBna : false, (1022 & 4) != 0 ? c5011BzhCreateLocalUserData.OLrzqt : null, (1022 & 8) != 0 ? c5011BzhCreateLocalUserData.KWHzl : 0L, (1022 & 16) != 0 ? c5011BzhCreateLocalUserData.valueOf : false, (1022 & 32) != 0 ? c5011BzhCreateLocalUserData.AEQbTJ : false, (1022 & 64) != 0 ? c5011BzhCreateLocalUserData.djBIcL : 0L, (1022 & 128) != 0 ? c5011BzhCreateLocalUserData.gEmmrt : false, (1022 & 256) != 0 ? c5011BzhCreateLocalUserData.copydefault : false, (1022 & 512) != 0 ? c5011BzhCreateLocalUserData.AYXKKw : false);
        JsonObject appI18nDto = userInfo.getAppI18nDto();
        java.lang.String string = appI18nDto != null ? appI18nDto.toString() : null;
        UserInfo.SubUserAuth subUserAuth = userInfo.getSubUserAuth();
        C5016Bzm c5016Bzm = subUserAuth != null ? new C5016Bzm(subUserAuth.isAllowLogin(), subUserAuth.isAllowDeposit(), subUserAuth.isAllowWithdraw(), subUserAuth.isAllowTransfer(), subUserAuth.isAllowTrading(), subUserAuth.isAllowCreateApi(), subUserAuth.isAllowOAuth(), subUserAuth.isAllowUseFinancial(), subUserAuth.isAllowUseAsset(), subUserAuth.isAllowInquireTrading(), subUserAuth.isAllowInquireAsset()) : null;
        UserInfo.SubAccountFunction subAccountFunction = userInfo.getSubAccountFunction();
        if (subAccountFunction != null) {
            z3 = fido1Ready;
            z2 = fidoReady;
            z = loginPwdExist;
            str = levelName;
            c5012Bzi = new C5012Bzi(subAccountFunction.getCopyTrading(), subAccountFunction.getCustodyDelegation(), subAccountFunction.getManagedTrading(), subAccountFunction.getVisibleToUser());
        } else {
            str = levelName;
            z = loginPwdExist;
            z2 = fidoReady;
            z3 = fido1Ready;
            c5012Bzi = null;
        }
        java.lang.String antiPhishingCode = userInfo.getAntiPhishingCode();
        boolean zIsBindGoogle = userInfo.isBindGoogle();
        boolean zIsBindPhone = userInfo.isBindPhone();
        boolean zIsVerifyEmail = userInfo.isVerifyEmail();
        int kycLevel = userInfo.getKycLevel();
        boolean hasEmergencyContact = userInfo.getHasEmergencyContact();
        SecondVerifyType secondVerifyTypeSecondVerifyTypeFromInt = BzK.secondVerifyTypeFromInt(userInfo.getAuthTrade());
        int userLevel = userInfo.getUserLevel();
        int okbLevel = userInfo.getOkbLevel();
        boolean showAuthenticatorPromotion = userInfo.getShowAuthenticatorPromotion();
        boolean newBindAuthenticatorFlow = userInfo.getNewBindAuthenticatorFlow();
        long lastBindAuthenticatorDate = userInfo.getLastBindAuthenticatorDate();
        java.util.List<java.lang.String> guidanceItems = userInfo.getGuidanceItems();
        java.lang.Integer brDualAccountType = userInfo.getBrDualAccountType();
        if (brDualAccountType == null || (dualAccountTypeDualAccountTypeFromInt = BzK.dualAccountTypeFromInt(brDualAccountType.intValue())) == null) {
            dualAccountTypeDualAccountTypeFromInt = DualAccountType.INVALID;
        }
        DualAccountType dualAccountType = dualAccountTypeDualAccountTypeFromInt;
        java.util.List<java.lang.String> greyscaleHiddenItems = userInfo.getGreyscaleHiddenItems();
        if (greyscaleHiddenItems == null) {
            greyscaleHiddenItems = yDY.AhwBna();
        }
        java.util.List<java.lang.String> list = greyscaleHiddenItems;
        UserInfo.RbacFeatures rbacFeatures = userInfo.getRbacFeatures();
        boolean zIsRoleBasedUser = rbacFeatures != null ? rbacFeatures.isRoleBasedUser() : false;
        UserInfo.RbacFeatures rbacFeatures2 = userInfo.getRbacFeatures();
        boolean zIsRoleBasedAdmin = rbacFeatures2 != null ? rbacFeatures2.isRoleBasedAdmin() : false;
        UserInfo.RbacFeatures rbacFeatures3 = userInfo.getRbacFeatures();
        boolean zIsMainAccountApprover = rbacFeatures3 != null ? rbacFeatures3.isMainAccountApprover() : false;
        UserInfo.RbacFeatures rbacFeatures4 = userInfo.getRbacFeatures();
        if (rbacFeatures4 != null) {
            z4 = zIsSubUser;
            z5 = zIsVip;
            zIsMainAccountWithdrawalInitiator = rbacFeatures4.isMainAccountWithdrawalInitiator();
        } else {
            z4 = zIsSubUser;
            z5 = zIsVip;
            zIsMainAccountWithdrawalInitiator = false;
        }
        C5010Bzg c5010Bzg = new C5010Bzg(zIsRoleBasedAdmin, zIsRoleBasedUser, zIsMainAccountApprover, zIsMainAccountWithdrawalInitiator);
        UserInfo.RmFeatures rmFeatures = userInfo.getRmFeatures();
        C5008Bze c5008Bze = new C5008Bze(rmFeatures != null ? rmFeatures.isRelationshipManager() : false);
        boolean supportCrossSiteBinding = userInfo.getSupportCrossSiteBinding();
        boolean boundCrossSiteAccount = userInfo.getBoundCrossSiteAccount();
        UserInfo.BoundAccount boundAccount = userInfo.getBoundAccount();
        return new BvK(uuid, areaCode, phone, email, loginName, realName, realEmail, z4, z5, str, java.lang.Long.valueOf(registerTimeMs), z, z2, z3, accountType, accountTypeName, string, c5016Bzm, c5012Bzi, c5011BzhEZpvd, antiPhishingCode, zIsBindGoogle, zIsBindPhone, zIsVerifyEmail, kycLevel, hasEmergencyContact, secondVerifyTypeSecondVerifyTypeFromInt, userLevel, okbLevel, showAuthenticatorPromotion, newBindAuthenticatorFlow, java.lang.Long.valueOf(lastBindAuthenticatorDate), guidanceItems, dualAccountType, list, c5010Bzg, c5008Bze, supportCrossSiteBinding, boundCrossSiteAccount, boundAccount != null ? new BuX(boundAccount.getBoundAccountEmail(), boundAccount.getBoundAccountSite()) : null);
    }

    public static final C5007Bzd OLrzqt(UserProfile userProfile) {
        ReviewStatus reviewStatusReviewStatusFromInt;
        ReviewStatus reviewStatusReviewStatusFromInt2;
        ReviewStatus reviewStatusReviewStatusFromInt3;
        ReviewStatus reviewStatusReviewStatusFromInt4;
        ReviewStatus reviewStatusReviewStatusFromInt5;
        ReviewStatus reviewStatusReviewStatusFromInt6;
        BioBackgroundReviewStatus bioBackgroundReviewStatusBioBackgroundReviewStatusFromInt;
        BioBackgroundReviewStatus bioBackgroundReviewStatusBioBackgroundReviewStatusFromInt2;
        java.lang.String identifyId = userProfile.getIdentifyId();
        java.lang.String profilePictureUrl = userProfile.getProfilePictureUrl();
        java.lang.String originalAvatar = userProfile.getOriginalAvatar();
        java.lang.String petname = userProfile.getPetname();
        java.lang.String enPetname = userProfile.getEnPetname();
        java.lang.String sign = userProfile.getSign();
        int userLevel = userProfile.getUserLevel();
        java.lang.String userLevelName = userProfile.getUserLevelName();
        boolean canSwitchAccount = userProfile.getCanSwitchAccount();
        java.lang.Boolean vipAvatarFrameToggle = userProfile.getVipAvatarFrameToggle();
        java.lang.Integer remainingAvatarUpdateQuota = userProfile.getRemainingAvatarUpdateQuota();
        int iIntValue = remainingAvatarUpdateQuota != null ? remainingAvatarUpdateQuota.intValue() : 0;
        java.lang.Integer maxAvatarUpdateQuota = userProfile.getMaxAvatarUpdateQuota();
        int iIntValue2 = maxAvatarUpdateQuota != null ? maxAvatarUpdateQuota.intValue() : 0;
        java.lang.Integer remainingPetnameUpdateQuota = userProfile.getRemainingPetnameUpdateQuota();
        int iIntValue3 = remainingPetnameUpdateQuota != null ? remainingPetnameUpdateQuota.intValue() : 0;
        java.lang.Integer maxPetnameUpdateQuota = userProfile.getMaxPetnameUpdateQuota();
        int iIntValue4 = maxPetnameUpdateQuota != null ? maxPetnameUpdateQuota.intValue() : 0;
        java.lang.Integer avatarStatus = userProfile.getAvatarStatus();
        if (avatarStatus == null || (reviewStatusReviewStatusFromInt = BzK.reviewStatusFromInt(avatarStatus.intValue())) == null) {
            reviewStatusReviewStatusFromInt = ReviewStatus.NONE;
        }
        ReviewStatus reviewStatus = reviewStatusReviewStatusFromInt;
        java.lang.Integer petnameStatus = userProfile.getPetnameStatus();
        if (petnameStatus == null || (reviewStatusReviewStatusFromInt2 = BzK.reviewStatusFromInt(petnameStatus.intValue())) == null) {
            reviewStatusReviewStatusFromInt2 = ReviewStatus.NONE;
        }
        ReviewStatus reviewStatus2 = reviewStatusReviewStatusFromInt2;
        java.lang.Integer enPetnameStatus = userProfile.getEnPetnameStatus();
        if (enPetnameStatus == null || (reviewStatusReviewStatusFromInt3 = BzK.reviewStatusFromInt(enPetnameStatus.intValue())) == null) {
            reviewStatusReviewStatusFromInt3 = ReviewStatus.NONE;
        }
        ReviewStatus reviewStatus3 = reviewStatusReviewStatusFromInt3;
        int i = iIntValue4;
        boolean z = userProfile.isDefaultGeneratedNickname;
        java.lang.String avatar = userProfile.getAvatarInfo().getAvatar();
        java.lang.Integer avatarStatus2 = userProfile.getAvatarStatus();
        if (avatarStatus2 == null || (reviewStatusReviewStatusFromInt4 = BzK.reviewStatusFromInt(avatarStatus2.intValue())) == null) {
            reviewStatusReviewStatusFromInt4 = ReviewStatus.NONE;
        }
        int i2 = iIntValue3;
        BuY buY = new BuY(avatar, reviewStatusReviewStatusFromInt4, java.lang.Boolean.valueOf(userProfile.getAvatarInfo().getSupportUploadedAvatar()));
        java.lang.Integer signStatus = userProfile.getSignStatus();
        if (signStatus == null || (reviewStatusReviewStatusFromInt5 = BzK.reviewStatusFromInt(signStatus.intValue())) == null) {
            reviewStatusReviewStatusFromInt5 = ReviewStatus.NONE;
        }
        ReviewStatus reviewStatus4 = reviewStatusReviewStatusFromInt5;
        java.lang.Integer maxEnPetnameUpdateQuota = userProfile.getMaxEnPetnameUpdateQuota();
        int iIntValue5 = maxEnPetnameUpdateQuota != null ? maxEnPetnameUpdateQuota.intValue() : 0;
        java.lang.Integer remainingEnPetnameUpdateQuota = userProfile.getRemainingEnPetnameUpdateQuota();
        int iIntValue6 = remainingEnPetnameUpdateQuota != null ? remainingEnPetnameUpdateQuota.intValue() : 0;
        java.lang.Integer enSignStatus = userProfile.getEnSignStatus();
        if (enSignStatus == null || (reviewStatusReviewStatusFromInt6 = BzK.reviewStatusFromInt(enSignStatus.intValue())) == null) {
            reviewStatusReviewStatusFromInt6 = ReviewStatus.NONE;
        }
        ReviewStatus reviewStatus5 = reviewStatusReviewStatusFromInt6;
        java.lang.String approvedPetname = userProfile.getApprovedPetname();
        java.lang.String bio = userProfile.getBio();
        java.lang.Integer bioStatus = userProfile.getBioStatus();
        if (bioStatus == null || (bioBackgroundReviewStatusBioBackgroundReviewStatusFromInt = BzK.bioBackgroundReviewStatusFromInt(bioStatus.intValue())) == null) {
            bioBackgroundReviewStatusBioBackgroundReviewStatusFromInt = BioBackgroundReviewStatus.NOT_MODIFIED;
        }
        BioBackgroundReviewStatus bioBackgroundReviewStatus = bioBackgroundReviewStatusBioBackgroundReviewStatusFromInt;
        java.lang.String backgroundUrl = userProfile.getBackgroundUrl();
        java.lang.Integer backgroundUrlStatus = userProfile.getBackgroundUrlStatus();
        if (backgroundUrlStatus == null || (bioBackgroundReviewStatusBioBackgroundReviewStatusFromInt2 = BzK.bioBackgroundReviewStatusFromInt(backgroundUrlStatus.intValue())) == null) {
            bioBackgroundReviewStatusBioBackgroundReviewStatusFromInt2 = BioBackgroundReviewStatus.NOT_MODIFIED;
        }
        return new C5007Bzd(profilePictureUrl, originalAvatar, petname, enPetname, sign, identifyId, java.lang.Integer.valueOf(userLevel), userLevelName, java.lang.Boolean.valueOf(canSwitchAccount), vipAvatarFrameToggle, buY, iIntValue, iIntValue2, i2, i, iIntValue6, iIntValue5, reviewStatus, reviewStatus2, reviewStatus3, reviewStatus4, reviewStatus5, approvedPetname, z, bio, bioBackgroundReviewStatus, backgroundUrl, bioBackgroundReviewStatusBioBackgroundReviewStatusFromInt2);
    }

    public static final User copydefault(@NotNull BvH bvH) {
        TokenType tokenType;
        java.lang.Object objM7377constructorimpl;
        java.lang.Object objM7377constructorimpl2;
        java.lang.Object objM7377constructorimpl3;
        C5011Bzh c5011BzhAuCTel;
        C5011Bzh c5011BzhAuCTel2;
        Intrinsics.checkNotNullParameter(bvH, "");
        int i = Application.AEQbTJ[bvH.AYXKKw().ordinal()];
        boolean z = true;
        if (i == 1) {
            tokenType = TokenType.DEMO_TRADING;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            tokenType = TokenType.LIVE_TRADING;
        }
        java.lang.String strAhwBna = bvH.AhwBna();
        Token token = new Token(bvH.djBIcL(), tokenType);
        java.lang.String strKWHzl = bvH.KWHzl();
        java.lang.String strValueOf = bvH.valueOf();
        boolean zGEmmrt = bvH.gEmmrt();
        java.lang.String strEZpvd = bvH.EZpvd();
        try {
            Result.Application application = Result.Companion;
            BvK bvKCopydefault = bvH.copydefault();
            objM7377constructorimpl = Result.m7377constructorimpl(bvKCopydefault != null ? AEQbTJ(bvKCopydefault) : null);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        com.okinc.okuser.data.UserInfo userInfo = (com.okinc.okuser.data.UserInfo) objM7377constructorimpl;
        try {
            Result.Application application3 = Result.Companion;
            C5007Bzd c5007BzdAEQbTJ = bvH.AEQbTJ();
            objM7377constructorimpl2 = Result.m7377constructorimpl(c5007BzdAEQbTJ != null ? OLrzqt(c5007BzdAEQbTJ) : null);
        } catch (java.lang.Throwable th2) {
            Result.Application application4 = Result.Companion;
            objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
            objM7377constructorimpl2 = null;
        }
        UserProfile userProfile = (UserProfile) objM7377constructorimpl2;
        java.lang.Boolean boolAkhnZx = bvH.AkhnZx();
        boolean zBooleanValue = boolAkhnZx != null ? boolAkhnZx.booleanValue() : false;
        BvK bvKCopydefault2 = bvH.copydefault();
        long jAEQbTJ = (bvKCopydefault2 == null || (c5011BzhAuCTel2 = bvKCopydefault2.AuCTel()) == null) ? 0L : c5011BzhAuCTel2.AEQbTJ();
        try {
            Result.Application application5 = Result.Companion;
            BvI bvIOLrzqt = bvH.OLrzqt();
            objM7377constructorimpl3 = Result.m7377constructorimpl(bvIOLrzqt != null ? OLrzqt(bvIOLrzqt) : null);
        } catch (java.lang.Throwable th3) {
            Result.Application application6 = Result.Companion;
            objM7377constructorimpl3 = Result.m7377constructorimpl(C56391yDq.EZpvd(th3));
        }
        PersonalSetting personalSetting = (PersonalSetting) (Result.m7383isFailureimpl(objM7377constructorimpl3) ? null : objM7377constructorimpl3);
        BvK bvKCopydefault3 = bvH.copydefault();
        if (bvKCopydefault3 != null && (c5011BzhAuCTel = bvKCopydefault3.AuCTel()) != null && c5011BzhAuCTel.gEmmrt()) {
            z = false;
        }
        return new User(strAhwBna, token, strKWHzl, strValueOf, zGEmmrt, jAEQbTJ, z, userInfo, userProfile, zBooleanValue, strEZpvd, personalSetting);
    }

    public static final PersonalSetting OLrzqt(BvI bvI) {
        return new PersonalSetting(bvI.OLrzqt(), bvI.KWHzl(), bvI.EZpvd(), bvI.AEQbTJ());
    }

    public static final com.okinc.okuser.data.UserInfo AEQbTJ(BvK bvK) {
        java.lang.String str;
        UserInfo.SubAccountFunction subAccountFunction;
        java.lang.Object objM7377constructorimpl;
        boolean zORxRYg = bvK.ORxRYg();
        boolean zQKVWgx = bvK.QKVWgx();
        boolean zQOLQEE = bvK.QOLQEE();
        int iSecondVerifyTypeToInt = BzK.secondVerifyTypeToInt(bvK.gEmmrt());
        java.lang.String strAuCTelauCTel = bvK.AuCTelauCTel();
        boolean zDTwDnp = bvK.DTwDnp();
        java.lang.String strOLrzqt = bvK.OLrzqt();
        boolean zIsConnected = bvK.isConnected();
        boolean zValues = bvK.values();
        int iSSMYrx = bvK.sSMYrx();
        int iHDKMBd = bvK.hDKMBd();
        int iEjfBZ = bvK.ejfBZ();
        java.lang.String strZuBGHE = bvK.zuBGHE();
        java.lang.String str2 = strZuBGHE == null ? "" : strZuBGHE;
        java.lang.String strAkhnZx = bvK.AkhnZx();
        java.lang.String strIwGUEr = bvK.iwGUEr();
        java.lang.String strAhwBna = bvK.AhwBna();
        java.lang.Long lWlaJM = bvK.wlaJM();
        long jLongValue = lWlaJM != null ? lWlaJM.longValue() : 0L;
        boolean fieldNames = bvK.getFieldNames();
        java.lang.String strKWHzl = bvK.KWHzl();
        java.lang.String strZsXlph = bvK.zsXlph();
        C5016Bzm c5016BzmAwvSrB = bvK.AwvSrB();
        UserInfo.SubUserAuth subUserAuth = c5016BzmAwvSrB != null ? new UserInfo.SubUserAuth(c5016BzmAwvSrB.OLrzqt(), c5016BzmAwvSrB.KWHzl(), c5016BzmAwvSrB.values(), c5016BzmAwvSrB.AYXKKw(), c5016BzmAwvSrB.valueOf(), c5016BzmAwvSrB.EZpvd(), c5016BzmAwvSrB.gEmmrt(), c5016BzmAwvSrB.djBIcL(), c5016BzmAwvSrB.AhwBna(), c5016BzmAwvSrB.AEQbTJ(), c5016BzmAwvSrB.copydefault()) : null;
        int iCopydefault = bvK.copydefault();
        java.lang.String strAEQbTJ = bvK.AEQbTJ();
        java.lang.String str3 = strAEQbTJ == null ? "" : strAEQbTJ;
        C5012Bzi c5012BziAxsJAY = bvK.AxsJAY();
        if (c5012BziAxsJAY != null) {
            str = "";
            subAccountFunction = new UserInfo.SubAccountFunction(c5012BziAxsJAY.OLrzqt(), c5012BziAxsJAY.AEQbTJ(), c5012BziAxsJAY.EZpvd(), c5012BziAxsJAY.KWHzl());
        } else {
            str = "";
            subAccountFunction = null;
        }
        try {
            Result.Application application = Result.Companion;
            java.lang.String strEZpvd = bvK.EZpvd();
            objM7377constructorimpl = Result.m7377constructorimpl(strEZpvd != null ? JsonElementKt.getJsonObject(C47228tmA.copydefault().parseToJsonElement(strEZpvd)) : null);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        JsonObject jsonObject = (JsonObject) objM7377constructorimpl;
        boolean zZLjUOn = bvK.zLjUOn();
        boolean newProxyInstance = bvK.getNewProxyInstance();
        java.lang.Long lFJNWhG = bvK.fJNWhG();
        long jLongValue2 = lFJNWhG != null ? lFJNWhG.longValue() : 0L;
        java.util.List<java.lang.String> listDbNXlk = bvK.DbNXlk();
        java.util.List<java.lang.String> listFetchVPNInfo = bvK.fetchVPNInfo();
        int iDualAccountTypeToInt = BzK.dualAccountTypeToInt(bvK.AYXKKw());
        boolean zOcIXYQ = bvK.OcIXYQ();
        boolean zFIwbmz = bvK.fIwbmz();
        java.lang.String strFARcdN = bvK.fARcdN();
        java.lang.String str4 = strFARcdN == null ? str : strFARcdN;
        UserInfo.RbacFeatures rbacFeatures = new UserInfo.RbacFeatures(bvK.uzCIH().OLrzqt(), bvK.uzCIH().AEQbTJ(), bvK.uzCIH().EZpvd(), bvK.uzCIH().KWHzl());
        UserInfo.RmFeatures rmFeatures = new UserInfo.RmFeatures(bvK.AubY().copydefault());
        boolean zGHZMYf = bvK.gHZMYf();
        boolean zValueOf = bvK.valueOf();
        BuX buXDjBIcL = bvK.djBIcL();
        int i = 0;
        return new com.okinc.okuser.data.UserInfo(zORxRYg, false, zQKVWgx, zQOLQEE, iSecondVerifyTypeToInt, strAuCTelauCTel, 0, zDTwDnp, strOLrzqt, zIsConnected, zValues, i, iSSMYrx, iHDKMBd, iEjfBZ, str2, strAkhnZx, strIwGUEr, strAhwBna, i, jLongValue, fieldNames, strKWHzl, strZsXlph, subUserAuth, iCopydefault, str3, 0, subAccountFunction, jsonObject, null, zZLjUOn, newProxyInstance, jLongValue2, listDbNXlk, listFetchVPNInfo, null, java.lang.Integer.valueOf(iDualAccountTypeToInt), zOcIXYQ, zFIwbmz, str4, rbacFeatures, rmFeatures, zGHZMYf, zValueOf, buXDjBIcL != null ? new UserInfo.BoundAccount(buXDjBIcL.AEQbTJ(), buXDjBIcL.EZpvd()) : null, 1208485954, 16, null);
    }

    public static final UserProfile OLrzqt(C5007Bzd c5007Bzd) {
        UserProfile.AvatarInfo avatarInfo;
        java.lang.String strIsConnected = c5007Bzd.isConnected();
        java.lang.String strOLrzqt = c5007Bzd.OLrzqt();
        int iReviewStatusToInt = BzK.reviewStatusToInt(c5007Bzd.copydefault());
        java.lang.String strFARcdN = c5007Bzd.fARcdN();
        int iReviewStatusToInt2 = BzK.reviewStatusToInt(c5007Bzd.AuCTel());
        java.lang.String strAEQbTJ = c5007Bzd.AEQbTJ();
        java.lang.String newProxyInstance = c5007Bzd.getNewProxyInstance();
        int iReviewStatusToInt3 = BzK.reviewStatusToInt(c5007Bzd.uzCIH());
        int iReviewStatusToInt4 = BzK.reviewStatusToInt(c5007Bzd.AkhnZx());
        int iIwGUEr = c5007Bzd.iwGUEr();
        int iEjfBZ = c5007Bzd.ejfBZ();
        int iValues = c5007Bzd.values();
        int iFJNWhG = c5007Bzd.fJNWhG();
        java.lang.String strGEmmrt = c5007Bzd.gEmmrt();
        int iReviewStatusToInt5 = BzK.reviewStatusToInt(c5007Bzd.fetchVPNInfo());
        int iHDKMBd = c5007Bzd.hDKMBd();
        int iDbNXlk = c5007Bzd.DbNXlk();
        java.lang.Integer fieldNames = c5007Bzd.getFieldNames();
        boolean z = false;
        int iIntValue = fieldNames != null ? fieldNames.intValue() : 0;
        boolean zWlaJM = c5007Bzd.wlaJM();
        BuY buYEZpvd = c5007Bzd.EZpvd();
        if (buYEZpvd != null) {
            java.lang.String strCopydefault = buYEZpvd.copydefault();
            if (strCopydefault == null) {
                strCopydefault = "";
            }
            java.lang.Boolean boolAEQbTJ = buYEZpvd.AEQbTJ();
            avatarInfo = new UserProfile.AvatarInfo(strCopydefault, boolAEQbTJ != null ? boolAEQbTJ.booleanValue() : false);
        } else {
            avatarInfo = new UserProfile.AvatarInfo((java.lang.String) null, z, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }
        java.lang.Boolean boolAYXKKw = c5007Bzd.AYXKKw();
        boolean zBooleanValue = boolAYXKKw != null ? boolAYXKKw.booleanValue() : false;
        java.lang.String strAuCTelauCTel = c5007Bzd.AuCTelauCTel();
        java.lang.String str = strAuCTelauCTel == null ? "" : strAuCTelauCTel;
        java.lang.Boolean boolZsXlph = c5007Bzd.zsXlph();
        java.lang.String strFIwbmz = c5007Bzd.fIwbmz();
        return new UserProfile(strIsConnected, strOLrzqt, java.lang.Integer.valueOf(iReviewStatusToInt), strFARcdN, java.lang.Integer.valueOf(iReviewStatusToInt2), strAEQbTJ, (java.lang.String) null, newProxyInstance, java.lang.Integer.valueOf(iReviewStatusToInt3), java.lang.Integer.valueOf(iReviewStatusToInt4), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, java.lang.Integer.valueOf(iIwGUEr), java.lang.Integer.valueOf(iEjfBZ), java.lang.Integer.valueOf(iValues), java.lang.Integer.valueOf(iFJNWhG), strGEmmrt, java.lang.Integer.valueOf(iReviewStatusToInt5), java.lang.Integer.valueOf(iHDKMBd), java.lang.Integer.valueOf(iDbNXlk), iIntValue, zWlaJM, avatarInfo, zBooleanValue, str, boolZsXlph, strFIwbmz == null ? "" : strFIwbmz, c5007Bzd.valueOf(), java.lang.Integer.valueOf(BzK.bioBackgroundReviewStatusToInt(c5007Bzd.AhwBna())), c5007Bzd.KWHzl(), java.lang.Integer.valueOf(BzK.bioBackgroundReviewStatusToInt(c5007Bzd.djBIcL())), 31808, 0, (DefaultConstructorMarker) null);
    }
}
