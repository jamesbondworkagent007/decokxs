package com.okinc.account.api.model.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.ArrayList;
import java.util.Iterator;
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
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class LoginBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    public static final /* synthetic */ void write$Self$OKAccount_account_api(LoginBean loginBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.account.api.model.login.LoginBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LoginBean> serializer() {
            return LoginBean$$serializer.INSTANCE;
        }
    }

    public LoginBean() {
    }

    public /* synthetic */ LoginBean(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    @Serializable
    public static final class LoginResp implements Parcelable {
        private static final KSerializer<Object>[] $childSerializers;
        private String _tk;
        private List<String> appMode;
        private String applyId;
        private String areaCode;
        private int authDevice;
        private List<AuthInfo> authList;
        private int behavior;
        private List<String> cefiMode;
        private String currentBid;
        private String email;
        private String from;
        private String ftID;
        private int jumpTobind;
        private String lid;
        private String loginName;
        private String logo;
        private String maskedEmail;
        private String maskedPhone;
        private int mold;
        private String msgParams;
        private String nextStep;
        private String oauthClient;
        private String passkeyEasyRegToken;
        private long pastDue;
        private String phone;
        private String preferredMode;
        private String redirectPage;
        private String socialAccBindToken;
        private String socialAccount;
        private int step2MsgType;
        private int step2Type;
        private int thirdType;
        private String tk;
        private String to;
        private String token;
        private String uid;
        private List<String> usableVendors;
        private long userId;
        private int verifyType;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<LoginResp> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<LoginResp> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LoginResp createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                int i = parcel.readInt();
                String string = parcel.readString();
                long j = parcel.readLong();
                String string2 = parcel.readString();
                int i2 = parcel.readInt();
                int i3 = parcel.readInt();
                String string3 = parcel.readString();
                long j2 = parcel.readLong();
                String string4 = parcel.readString();
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                int i6 = parcel.readInt();
                String string14 = parcel.readString();
                int i7 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i7);
                int i8 = 0;
                while (i8 != i7) {
                    arrayList.add(AuthInfo.CREATOR.createFromParcel(parcel));
                    i8++;
                    i7 = i7;
                }
                return new LoginResp(i, string, j, string2, i2, i3, string3, j2, string4, i4, i5, string5, string6, string7, string8, string9, string10, string11, string12, string13, i6, string14, arrayList, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LoginResp[] newArray(int i) {
                return new LoginResp[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoginResp() {
            this(0, (String) null, 0L, (String) null, 0, 0, (String) null, 0L, (String) null, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (List) null, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (String) null, -1, 127, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component1() {
            return this.behavior;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component10() {
            return this.thirdType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component11() {
            return this.jumpTobind;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component12() {
            return this.email;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component13() {
            return this.maskedEmail;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component14() {
            return this.tk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component15() {
            return this._tk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component16() {
            return this.lid;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component17() {
            return this.ftID;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component18() {
            return this.from;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component19() {
            return this.to;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.areaCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component20() {
            return this.loginName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component21() {
            return this.authDevice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component22() {
            return this.applyId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<AuthInfo> component23() {
            return this.authList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component24() {
            return this.mold;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component25() {
            return this.verifyType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component26() {
            return this.msgParams;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component27() {
            return this.maskedPhone;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component28() {
            return this.uid;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component29() {
            return this.redirectPage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component3() {
            return this.pastDue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component30() {
            return this.socialAccount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component31() {
            return this.passkeyEasyRegToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component32() {
            return this.nextStep;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component33() {
            return this.socialAccBindToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component34() {
            return this.logo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component35() {
            return this.oauthClient;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> component36() {
            return this.appMode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> component37() {
            return this.cefiMode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> component38() {
            return this.usableVendors;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component39() {
            return this.preferredMode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.phone;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component5() {
            return this.step2Type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component6() {
            return this.step2MsgType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.token;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component8() {
            return this.userId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component9() {
            return this.currentBid;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoginResp copy(int i, @NotNull String str, long j, @NotNull String str2, int i2, int i3, @NotNull String str3, long j2, @NotNull String str4, int i4, int i5, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, int i6, @NotNull String str14, @NotNull List<AuthInfo> list, int i7, int i8, @NotNull String str15, @NotNull String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull List<String> list4, String str25) {
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
            Intrinsics.checkNotNullParameter(str15, "");
            Intrinsics.checkNotNullParameter(str16, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            Intrinsics.checkNotNullParameter(list4, "");
            return new LoginResp(i, str, j, str2, i2, i3, str3, j2, str4, i4, i5, str5, str6, str7, str8, str9, str10, str11, str12, str13, i6, str14, list, i7, i8, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, list2, list3, list4, str25);
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
            if (!(obj instanceof LoginResp)) {
                return false;
            }
            LoginResp loginResp = (LoginResp) obj;
            return this.behavior == loginResp.behavior && Intrinsics.EZpvd((Object) this.areaCode, (Object) loginResp.areaCode) && this.pastDue == loginResp.pastDue && Intrinsics.EZpvd((Object) this.phone, (Object) loginResp.phone) && this.step2Type == loginResp.step2Type && this.step2MsgType == loginResp.step2MsgType && Intrinsics.EZpvd((Object) this.token, (Object) loginResp.token) && this.userId == loginResp.userId && Intrinsics.EZpvd((Object) this.currentBid, (Object) loginResp.currentBid) && this.thirdType == loginResp.thirdType && this.jumpTobind == loginResp.jumpTobind && Intrinsics.EZpvd((Object) this.email, (Object) loginResp.email) && Intrinsics.EZpvd((Object) this.maskedEmail, (Object) loginResp.maskedEmail) && Intrinsics.EZpvd((Object) this.tk, (Object) loginResp.tk) && Intrinsics.EZpvd((Object) this._tk, (Object) loginResp._tk) && Intrinsics.EZpvd((Object) this.lid, (Object) loginResp.lid) && Intrinsics.EZpvd((Object) this.ftID, (Object) loginResp.ftID) && Intrinsics.EZpvd((Object) this.from, (Object) loginResp.from) && Intrinsics.EZpvd((Object) this.to, (Object) loginResp.to) && Intrinsics.EZpvd((Object) this.loginName, (Object) loginResp.loginName) && this.authDevice == loginResp.authDevice && Intrinsics.EZpvd((Object) this.applyId, (Object) loginResp.applyId) && Intrinsics.EZpvd(this.authList, loginResp.authList) && this.mold == loginResp.mold && this.verifyType == loginResp.verifyType && Intrinsics.EZpvd((Object) this.msgParams, (Object) loginResp.msgParams) && Intrinsics.EZpvd((Object) this.maskedPhone, (Object) loginResp.maskedPhone) && Intrinsics.EZpvd((Object) this.uid, (Object) loginResp.uid) && Intrinsics.EZpvd((Object) this.redirectPage, (Object) loginResp.redirectPage) && Intrinsics.EZpvd((Object) this.socialAccount, (Object) loginResp.socialAccount) && Intrinsics.EZpvd((Object) this.passkeyEasyRegToken, (Object) loginResp.passkeyEasyRegToken) && Intrinsics.EZpvd((Object) this.nextStep, (Object) loginResp.nextStep) && Intrinsics.EZpvd((Object) this.socialAccBindToken, (Object) loginResp.socialAccBindToken) && Intrinsics.EZpvd((Object) this.logo, (Object) loginResp.logo) && Intrinsics.EZpvd((Object) this.oauthClient, (Object) loginResp.oauthClient) && Intrinsics.EZpvd(this.appMode, loginResp.appMode) && Intrinsics.EZpvd(this.cefiMode, loginResp.cefiMode) && Intrinsics.EZpvd(this.usableVendors, loginResp.usableVendors) && Intrinsics.EZpvd((Object) this.preferredMode, (Object) loginResp.preferredMode);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> getAppMode() {
            return this.appMode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getApplyId() {
            return this.applyId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAreaCode() {
            return this.areaCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getAuthDevice() {
            return this.authDevice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<AuthInfo> getAuthList() {
            return this.authList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getBehavior() {
            return this.behavior;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> getCefiMode() {
            return this.cefiMode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCurrentBid() {
            return this.currentBid;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getEmail() {
            return this.email;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFrom() {
            return this.from;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFtID() {
            return this.ftID;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getJumpTobind() {
            return this.jumpTobind;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLid() {
            return this.lid;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLoginName() {
            return this.loginName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLogo() {
            return this.logo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMaskedEmail() {
            return this.maskedEmail;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMaskedPhone() {
            return this.maskedPhone;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getMold() {
            return this.mold;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMsgParams() {
            return this.msgParams;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getNextStep() {
            return this.nextStep;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getOauthClient() {
            return this.oauthClient;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPasskeyEasyRegToken() {
            return this.passkeyEasyRegToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getPastDue() {
            return this.pastDue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPhone() {
            return this.phone;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPreferredMode() {
            return this.preferredMode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRedirectPage() {
            return this.redirectPage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSocialAccBindToken() {
            return this.socialAccBindToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSocialAccount() {
            return this.socialAccount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getStep2MsgType() {
            return this.step2MsgType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getStep2Type() {
            return this.step2Type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getThirdType() {
            return this.thirdType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTk() {
            return this.tk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTo() {
            return this.to;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getToken() {
            return this.token;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUid() {
            return this.uid;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> getUsableVendors() {
            return this.usableVendors;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getUserId() {
            return this.userId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getVerifyType() {
            return this.verifyType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String get_tk() {
            return this._tk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Integer.hashCode(this.behavior);
            int iHashCode2 = this.areaCode.hashCode();
            int iHashCode3 = Long.hashCode(this.pastDue);
            int iHashCode4 = this.phone.hashCode();
            int iHashCode5 = Integer.hashCode(this.step2Type);
            int iHashCode6 = Integer.hashCode(this.step2MsgType);
            int iHashCode7 = this.token.hashCode();
            int iHashCode8 = Long.hashCode(this.userId);
            int iHashCode9 = this.currentBid.hashCode();
            int iHashCode10 = Integer.hashCode(this.thirdType);
            int iHashCode11 = Integer.hashCode(this.jumpTobind);
            int iHashCode12 = this.email.hashCode();
            int iHashCode13 = this.maskedEmail.hashCode();
            int iHashCode14 = this.tk.hashCode();
            int iHashCode15 = this._tk.hashCode();
            int iHashCode16 = this.lid.hashCode();
            int iHashCode17 = this.ftID.hashCode();
            int iHashCode18 = this.from.hashCode();
            int iHashCode19 = this.to.hashCode();
            int iHashCode20 = this.loginName.hashCode();
            int iHashCode21 = Integer.hashCode(this.authDevice);
            int iHashCode22 = this.applyId.hashCode();
            int iHashCode23 = this.authList.hashCode();
            int iHashCode24 = Integer.hashCode(this.mold);
            int iHashCode25 = Integer.hashCode(this.verifyType);
            int iHashCode26 = this.msgParams.hashCode();
            int iHashCode27 = this.maskedPhone.hashCode();
            String str = this.uid;
            int iHashCode28 = str == null ? 0 : str.hashCode();
            String str2 = this.redirectPage;
            int iHashCode29 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.socialAccount;
            int iHashCode30 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.passkeyEasyRegToken;
            int iHashCode31 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.nextStep;
            int iHashCode32 = str5 == null ? 0 : str5.hashCode();
            String str6 = this.socialAccBindToken;
            int iHashCode33 = str6 == null ? 0 : str6.hashCode();
            String str7 = this.logo;
            int iHashCode34 = str7 == null ? 0 : str7.hashCode();
            String str8 = this.oauthClient;
            int iHashCode35 = str8 == null ? 0 : str8.hashCode();
            int iHashCode36 = this.appMode.hashCode();
            int iHashCode37 = this.cefiMode.hashCode();
            int iHashCode38 = this.usableVendors.hashCode();
            String str9 = this.preferredMode;
            return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + (str9 != null ? str9.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAppMode(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.appMode = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setApplyId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.applyId = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAreaCode(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.areaCode = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAuthDevice(int i) {
            this.authDevice = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAuthList(@NotNull List<AuthInfo> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.authList = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setBehavior(int i) {
            this.behavior = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCefiMode(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.cefiMode = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCurrentBid(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.currentBid = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setEmail(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.email = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setFrom(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.from = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setFtID(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.ftID = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setJumpTobind(int i) {
            this.jumpTobind = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setLid(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.lid = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setLoginName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.loginName = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setLogo(String str) {
            this.logo = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMaskedEmail(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.maskedEmail = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMaskedPhone(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.maskedPhone = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMold(int i) {
            this.mold = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMsgParams(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.msgParams = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setNextStep(String str) {
            this.nextStep = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setOauthClient(String str) {
            this.oauthClient = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPasskeyEasyRegToken(String str) {
            this.passkeyEasyRegToken = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPastDue(long j) {
            this.pastDue = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPhone(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.phone = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPreferredMode(String str) {
            this.preferredMode = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setRedirectPage(String str) {
            this.redirectPage = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSocialAccBindToken(String str) {
            this.socialAccBindToken = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSocialAccount(String str) {
            this.socialAccount = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setStep2MsgType(int i) {
            this.step2MsgType = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setStep2Type(int i) {
            this.step2Type = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setThirdType(int i) {
            this.thirdType = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTk(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.tk = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTo(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.to = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setToken(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.token = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setUid(String str) {
            this.uid = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setUsableVendors(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.usableVendors = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setUserId(long j) {
            this.userId = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setVerifyType(int i) {
            this.verifyType = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void set_tk(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this._tk = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "LoginResp(behavior=" + this.behavior + ", areaCode=" + this.areaCode + ", pastDue=" + this.pastDue + ", phone=" + this.phone + ", step2Type=" + this.step2Type + ", step2MsgType=" + this.step2MsgType + ", token=" + this.token + ", userId=" + this.userId + ", currentBid=" + this.currentBid + ", thirdType=" + this.thirdType + ", jumpTobind=" + this.jumpTobind + ", email=" + this.email + ", maskedEmail=" + this.maskedEmail + ", tk=" + this.tk + ", _tk=" + this._tk + ", lid=" + this.lid + ", ftID=" + this.ftID + ", from=" + this.from + ", to=" + this.to + ", loginName=" + this.loginName + ", authDevice=" + this.authDevice + ", applyId=" + this.applyId + ", authList=" + this.authList + ", mold=" + this.mold + ", verifyType=" + this.verifyType + ", msgParams=" + this.msgParams + ", maskedPhone=" + this.maskedPhone + ", uid=" + this.uid + ", redirectPage=" + this.redirectPage + ", socialAccount=" + this.socialAccount + ", passkeyEasyRegToken=" + this.passkeyEasyRegToken + ", nextStep=" + this.nextStep + ", socialAccBindToken=" + this.socialAccBindToken + ", logo=" + this.logo + ", oauthClient=" + this.oauthClient + ", appMode=" + this.appMode + ", cefiMode=" + this.cefiMode + ", usableVendors=" + this.usableVendors + ", preferredMode=" + this.preferredMode + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.behavior);
            parcel.writeString(this.areaCode);
            parcel.writeLong(this.pastDue);
            parcel.writeString(this.phone);
            parcel.writeInt(this.step2Type);
            parcel.writeInt(this.step2MsgType);
            parcel.writeString(this.token);
            parcel.writeLong(this.userId);
            parcel.writeString(this.currentBid);
            parcel.writeInt(this.thirdType);
            parcel.writeInt(this.jumpTobind);
            parcel.writeString(this.email);
            parcel.writeString(this.maskedEmail);
            parcel.writeString(this.tk);
            parcel.writeString(this._tk);
            parcel.writeString(this.lid);
            parcel.writeString(this.ftID);
            parcel.writeString(this.from);
            parcel.writeString(this.to);
            parcel.writeString(this.loginName);
            parcel.writeInt(this.authDevice);
            parcel.writeString(this.applyId);
            List<AuthInfo> list = this.authList;
            parcel.writeInt(list.size());
            Iterator<AuthInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
            parcel.writeInt(this.mold);
            parcel.writeInt(this.verifyType);
            parcel.writeString(this.msgParams);
            parcel.writeString(this.maskedPhone);
            parcel.writeString(this.uid);
            parcel.writeString(this.redirectPage);
            parcel.writeString(this.socialAccount);
            parcel.writeString(this.passkeyEasyRegToken);
            parcel.writeString(this.nextStep);
            parcel.writeString(this.socialAccBindToken);
            parcel.writeString(this.logo);
            parcel.writeString(this.oauthClient);
            parcel.writeStringList(this.appMode);
            parcel.writeStringList(this.cefiMode);
            parcel.writeStringList(this.usableVendors);
            parcel.writeString(this.preferredMode);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.account.api.model.login.LoginBean.LoginResp.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<LoginResp> serializer() {
                return LoginBean$LoginResp$$serializer.INSTANCE;
            }
        }

        static {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(AuthInfo$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), null};
        }

        public /* synthetic */ LoginResp(int i, int i2, int i3, String str, long j, String str2, int i4, int i5, String str3, long j2, String str4, int i6, int i7, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i8, String str14, List list, int i9, int i10, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, List list2, List list3, List list4, String str25, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.behavior = 0;
            } else {
                this.behavior = i3;
            }
            if ((i & 2) == 0) {
                this.areaCode = "";
            } else {
                this.areaCode = str;
            }
            this.pastDue = (i & 4) == 0 ? 0L : j;
            if ((i & 8) == 0) {
                this.phone = "";
            } else {
                this.phone = str2;
            }
            if ((i & 16) == 0) {
                this.step2Type = 0;
            } else {
                this.step2Type = i4;
            }
            if ((i & 32) == 0) {
                this.step2MsgType = -1;
            } else {
                this.step2MsgType = i5;
            }
            if ((i & 64) == 0) {
                this.token = "";
            } else {
                this.token = str3;
            }
            this.userId = (i & 128) == 0 ? -1L : j2;
            if ((i & 256) == 0) {
                this.currentBid = "";
            } else {
                this.currentBid = str4;
            }
            if ((i & 512) == 0) {
                this.thirdType = 0;
            } else {
                this.thirdType = i6;
            }
            if ((i & 1024) == 0) {
                this.jumpTobind = 0;
            } else {
                this.jumpTobind = i7;
            }
            if ((i & 2048) == 0) {
                this.email = "";
            } else {
                this.email = str5;
            }
            if ((i & 4096) == 0) {
                this.maskedEmail = "";
            } else {
                this.maskedEmail = str6;
            }
            if ((i & 8192) == 0) {
                this.tk = "";
            } else {
                this.tk = str7;
            }
            if ((i & 16384) == 0) {
                this._tk = "";
            } else {
                this._tk = str8;
            }
            if ((32768 & i) == 0) {
                this.lid = "";
            } else {
                this.lid = str9;
            }
            if ((65536 & i) == 0) {
                this.ftID = "";
            } else {
                this.ftID = str10;
            }
            if ((131072 & i) == 0) {
                this.from = "";
            } else {
                this.from = str11;
            }
            if ((262144 & i) == 0) {
                this.to = "";
            } else {
                this.to = str12;
            }
            if ((524288 & i) == 0) {
                this.loginName = "";
            } else {
                this.loginName = str13;
            }
            if ((1048576 & i) == 0) {
                this.authDevice = 0;
            } else {
                this.authDevice = i8;
            }
            if ((2097152 & i) == 0) {
                this.applyId = "";
            } else {
                this.applyId = str14;
            }
            this.authList = (4194304 & i) == 0 ? yDY.AhwBna() : list;
            this.mold = (8388608 & i) != 0 ? i9 : 0;
            if ((16777216 & i) == 0) {
                this.verifyType = -1;
            } else {
                this.verifyType = i10;
            }
            if ((33554432 & i) == 0) {
                this.msgParams = "";
            } else {
                this.msgParams = str15;
            }
            if ((67108864 & i) == 0) {
                this.maskedPhone = "";
            } else {
                this.maskedPhone = str16;
            }
            if ((134217728 & i) == 0) {
                this.uid = "";
            } else {
                this.uid = str17;
            }
            if ((268435456 & i) == 0) {
                this.redirectPage = "";
            } else {
                this.redirectPage = str18;
            }
            if ((536870912 & i) == 0) {
                this.socialAccount = "";
            } else {
                this.socialAccount = str19;
            }
            if ((1073741824 & i) == 0) {
                this.passkeyEasyRegToken = "";
            } else {
                this.passkeyEasyRegToken = str20;
            }
            if ((i & Integer.MIN_VALUE) == 0) {
                this.nextStep = "";
            } else {
                this.nextStep = str21;
            }
            if ((i2 & 1) == 0) {
                this.socialAccBindToken = "";
            } else {
                this.socialAccBindToken = str22;
            }
            if ((i2 & 2) == 0) {
                this.logo = "";
            } else {
                this.logo = str23;
            }
            if ((i2 & 4) == 0) {
                this.oauthClient = "";
            } else {
                this.oauthClient = str24;
            }
            this.appMode = (i2 & 8) == 0 ? yDY.AhwBna() : list2;
            this.cefiMode = (i2 & 16) == 0 ? yDY.AhwBna() : list3;
            this.usableVendors = (i2 & 32) == 0 ? yDY.AhwBna() : list4;
            this.preferredMode = (i2 & 64) == 0 ? null : str25;
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [24=5] */
        public static final /* synthetic */ void write$Self$OKAccount_account_api(LoginResp loginResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || loginResp.behavior != 0) {
                compositeEncoder.encodeIntElement(serialDescriptor, 0, loginResp.behavior);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) loginResp.areaCode, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 1, loginResp.areaCode);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || loginResp.pastDue != 0) {
                compositeEncoder.encodeLongElement(serialDescriptor, 2, loginResp.pastDue);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) loginResp.phone, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 3, loginResp.phone);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || loginResp.step2Type != 0) {
                compositeEncoder.encodeIntElement(serialDescriptor, 4, loginResp.step2Type);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || loginResp.step2MsgType != -1) {
                compositeEncoder.encodeIntElement(serialDescriptor, 5, loginResp.step2MsgType);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) loginResp.token, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 6, loginResp.token);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || loginResp.userId != -1) {
                compositeEncoder.encodeLongElement(serialDescriptor, 7, loginResp.userId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) loginResp.currentBid, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 8, loginResp.currentBid);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || loginResp.thirdType != 0) {
                compositeEncoder.encodeIntElement(serialDescriptor, 9, loginResp.thirdType);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || loginResp.jumpTobind != 0) {
                compositeEncoder.encodeIntElement(serialDescriptor, 10, loginResp.jumpTobind);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) loginResp.email, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 11, loginResp.email);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) loginResp.maskedEmail, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 12, loginResp.maskedEmail);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) loginResp.tk, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 13, loginResp.tk);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) loginResp._tk, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 14, loginResp._tk);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) loginResp.lid, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 15, loginResp.lid);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) loginResp.ftID, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 16, loginResp.ftID);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) loginResp.from, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 17, loginResp.from);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) loginResp.to, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 18, loginResp.to);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) loginResp.loginName, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 19, loginResp.loginName);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || loginResp.authDevice != 0) {
                compositeEncoder.encodeIntElement(serialDescriptor, 20, loginResp.authDevice);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) loginResp.applyId, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 21, loginResp.applyId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd(loginResp.authList, yDY.AhwBna())) {
                compositeEncoder.encodeSerializableElement(serialDescriptor, 22, kSerializerArr[22], loginResp.authList);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || loginResp.mold != 0) {
                compositeEncoder.encodeIntElement(serialDescriptor, 23, loginResp.mold);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || loginResp.verifyType != -1) {
                compositeEncoder.encodeIntElement(serialDescriptor, 24, loginResp.verifyType);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) loginResp.msgParams, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 25, loginResp.msgParams);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) loginResp.maskedPhone, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 26, loginResp.maskedPhone);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) loginResp.uid, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, StringSerializer.INSTANCE, loginResp.uid);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) loginResp.redirectPage, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, StringSerializer.INSTANCE, loginResp.redirectPage);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) loginResp.socialAccount, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, loginResp.socialAccount);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) loginResp.passkeyEasyRegToken, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.INSTANCE, loginResp.passkeyEasyRegToken);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) loginResp.nextStep, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, StringSerializer.INSTANCE, loginResp.nextStep);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) loginResp.socialAccBindToken, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, StringSerializer.INSTANCE, loginResp.socialAccBindToken);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) loginResp.logo, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, StringSerializer.INSTANCE, loginResp.logo);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) loginResp.oauthClient, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, StringSerializer.INSTANCE, loginResp.oauthClient);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd(loginResp.appMode, yDY.AhwBna())) {
                compositeEncoder.encodeSerializableElement(serialDescriptor, 35, kSerializerArr[35], loginResp.appMode);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd(loginResp.cefiMode, yDY.AhwBna())) {
                compositeEncoder.encodeSerializableElement(serialDescriptor, 36, kSerializerArr[36], loginResp.cefiMode);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || !Intrinsics.EZpvd(loginResp.usableVendors, yDY.AhwBna())) {
                compositeEncoder.encodeSerializableElement(serialDescriptor, 37, kSerializerArr[37], loginResp.usableVendors);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) && loginResp.preferredMode == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 38, StringSerializer.INSTANCE, loginResp.preferredMode);
        }

        public LoginResp(int i, @NotNull String str, long j, @NotNull String str2, int i2, int i3, @NotNull String str3, long j2, @NotNull String str4, int i4, int i5, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, int i6, @NotNull String str14, @NotNull List<AuthInfo> list, int i7, int i8, @NotNull String str15, @NotNull String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull List<String> list4, String str25) {
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
            Intrinsics.checkNotNullParameter(str15, "");
            Intrinsics.checkNotNullParameter(str16, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            Intrinsics.checkNotNullParameter(list4, "");
            this.behavior = i;
            this.areaCode = str;
            this.pastDue = j;
            this.phone = str2;
            this.step2Type = i2;
            this.step2MsgType = i3;
            this.token = str3;
            this.userId = j2;
            this.currentBid = str4;
            this.thirdType = i4;
            this.jumpTobind = i5;
            this.email = str5;
            this.maskedEmail = str6;
            this.tk = str7;
            this._tk = str8;
            this.lid = str9;
            this.ftID = str10;
            this.from = str11;
            this.to = str12;
            this.loginName = str13;
            this.authDevice = i6;
            this.applyId = str14;
            this.authList = list;
            this.mold = i7;
            this.verifyType = i8;
            this.msgParams = str15;
            this.maskedPhone = str16;
            this.uid = str17;
            this.redirectPage = str18;
            this.socialAccount = str19;
            this.passkeyEasyRegToken = str20;
            this.nextStep = str21;
            this.socialAccBindToken = str22;
            this.logo = str23;
            this.oauthClient = str24;
            this.appMode = list2;
            this.cefiMode = list3;
            this.usableVendors = list4;
            this.preferredMode = str25;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ LoginResp(int i, String str, long j, String str2, int i2, int i3, String str3, long j2, String str4, int i4, int i5, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i6, String str14, List list, int i7, int i8, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, List list2, List list3, List list4, String str25, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            String str26;
            str26 = "";
            this((i9 & 1) != 0 ? 0 : i, (i9 & 2) != 0 ? "" : str, (i9 & 4) != 0 ? 0L : j, (i9 & 8) != 0 ? "" : str2, (i9 & 16) != 0 ? 0 : i2, (i9 & 32) != 0 ? -1 : i3, (i9 & 64) != 0 ? "" : str3, (i9 & 128) != 0 ? -1L : j2, (i9 & 256) != 0 ? "" : str4, (i9 & 512) != 0 ? 0 : i4, (i9 & 1024) != 0 ? 0 : i5, (i9 & 2048) != 0 ? "" : str5, (i9 & 4096) != 0 ? str26 : str6, (i9 & 8192) != 0 ? str26 : str7, (i9 & 16384) != 0 ? str26 : str8, (i9 & 32768) != 0 ? str26 : str9, (i9 & 65536) != 0 ? str26 : str10, (i9 & 131072) != 0 ? str26 : str11, (i9 & 262144) != 0 ? str26 : str12, (i9 & 524288) != 0 ? str26 : str13, (i9 & 1048576) != 0 ? 0 : i6, (i9 & 2097152) != 0 ? str26 : str14, (i9 & 4194304) != 0 ? yDY.AhwBna() : list, (i9 & 8388608) != 0 ? 0 : i7, (i9 & 16777216) != 0 ? -1 : i8, (i9 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? str26 : str15, (i9 & 67108864) != 0 ? str26 : str16, (i9 & 134217728) != 0 ? str26 : str17, (i9 & 268435456) != 0 ? str26 : str18, (i9 & 536870912) != 0 ? str26 : str19, (i9 & 1073741824) != 0 ? str26 : str20, (i9 & Integer.MIN_VALUE) != 0 ? str26 : str21, (i10 & 1) != 0 ? str26 : str22, (i10 & 2) != 0 ? str26 : str23, (i10 & 4) == 0 ? str24 : "", (i10 & 8) != 0 ? yDY.AhwBna() : list2, (i10 & 16) != 0 ? yDY.AhwBna() : list3, (i10 & 32) != 0 ? yDY.AhwBna() : list4, (i10 & 64) != 0 ? null : str25);
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [70=5] */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        
            if (r0.equals("NONE") == false) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
        
            if (r0.equals("") == false) goto L33;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final LoginNextStepAction getNextStepAction() {
            String str = this.nextStep;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1024706405:
                        if (str.equals("FACE_VERIFY")) {
                            return LoginNextStepAction.FACE_VERIFY;
                        }
                        break;
                    case -91994382:
                        if (str.equals("NEW_DEVICE_AUTH_COMBINED")) {
                            return LoginNextStepAction.NEW_DEVICE_AUTH_COMBINED;
                        }
                        break;
                    case 0:
                        break;
                    case 50285:
                        if (str.equals("2FA")) {
                            return LoginNextStepAction.TWO_FACTOR_AUTH;
                        }
                        break;
                    case 2402104:
                        break;
                    case 1361890738:
                        if (str.equals("NEW_DEVICE_AUTH")) {
                            return LoginNextStepAction.NEW_DEVICE_AUTH;
                        }
                        break;
                    case 1825991192:
                        if (str.equals("NEW_DEVICE_AUTH_CN")) {
                            return LoginNextStepAction.NEW_DEVICE_AUTH_CN;
                        }
                        break;
                }
                return LoginNextStepAction.NONE;
            }
            return LoginNextStepAction.NONE;
        }

        public final Integer getPreferredModeKey() {
            return Intrinsics.EZpvd((Object) this.preferredMode, (Object) "pay") ? 5 : null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LoginNextStepAction {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ LoginNextStepAction[] $VALUES;
        public static final LoginNextStepAction NEW_DEVICE_AUTH = new LoginNextStepAction("NEW_DEVICE_AUTH", 0);
        public static final LoginNextStepAction NEW_DEVICE_AUTH_CN = new LoginNextStepAction("NEW_DEVICE_AUTH_CN", 1);
        public static final LoginNextStepAction TWO_FACTOR_AUTH = new LoginNextStepAction("TWO_FACTOR_AUTH", 2);
        public static final LoginNextStepAction FACE_VERIFY = new LoginNextStepAction("FACE_VERIFY", 3);
        public static final LoginNextStepAction NEW_DEVICE_AUTH_COMBINED = new LoginNextStepAction("NEW_DEVICE_AUTH_COMBINED", 4);
        public static final LoginNextStepAction NONE = new LoginNextStepAction("NONE", 5);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ LoginNextStepAction[] $values() {
            return new LoginNextStepAction[]{NEW_DEVICE_AUTH, NEW_DEVICE_AUTH_CN, TWO_FACTOR_AUTH, FACE_VERIFY, NEW_DEVICE_AUTH_COMBINED, NONE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<LoginNextStepAction> getEntries() {
            return $ENTRIES;
        }

        private LoginNextStepAction(String str, int i) {
        }

        static {
            LoginNextStepAction[] loginNextStepActionArr$values = $values();
            $VALUES = loginNextStepActionArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(loginNextStepActionArr$values);
        }

        public static LoginNextStepAction valueOf(String str) {
            return (LoginNextStepAction) Enum.valueOf(LoginNextStepAction.class, str);
        }

        public static LoginNextStepAction[] values() {
            return (LoginNextStepAction[]) $VALUES.clone();
        }
    }
}
