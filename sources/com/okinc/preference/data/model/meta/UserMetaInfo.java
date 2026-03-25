package com.okinc.preference.data.model.meta;

import com.okinc.okuser.data.PersonalSetting;
import com.okinc.okuser.data.PersonalSetting$$serializer;
import com.okinc.okuser.data.UserInfo;
import com.okinc.okuser.data.UserInfo$$serializer;
import com.okinc.okuser.data.popup.Popup;
import com.okinc.okuser.data.popup.Popup$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class UserMetaInfo {
    private final List<String> captchaVendors;
    private PersonalSetting personalSetting;
    private final Popup userConsents;
    private UserInfo userInfo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UserMetaInfo() {
        this((UserInfo) null, (PersonalSetting) null, (Popup) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.preference.data.model.meta.UserMetaInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserMetaInfo copy$default(UserMetaInfo userMetaInfo, UserInfo userInfo, PersonalSetting personalSetting, Popup popup, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            userInfo = userMetaInfo.userInfo;
        }
        if ((i & 2) != 0) {
            personalSetting = userMetaInfo.personalSetting;
        }
        if ((i & 4) != 0) {
            popup = userMetaInfo.userConsents;
        }
        if ((i & 8) != 0) {
            list = userMetaInfo.captchaVendors;
        }
        return userMetaInfo.copy(userInfo, personalSetting, popup, list);
    }

    @SerialName("captchaVendors")
    public static /* synthetic */ void getCaptchaVendors$annotations() {
    }

    @SerialName("userConsents")
    public static /* synthetic */ void getUserConsents$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserInfo component1() {
        return this.userInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PersonalSetting component2() {
        return this.personalSetting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Popup component3() {
        return this.userConsents;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.captchaVendors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserMetaInfo copy(UserInfo userInfo, PersonalSetting personalSetting, Popup popup, List<String> list) {
        return new UserMetaInfo(userInfo, personalSetting, popup, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserMetaInfo)) {
            return false;
        }
        UserMetaInfo userMetaInfo = (UserMetaInfo) obj;
        return Intrinsics.EZpvd(this.userInfo, userMetaInfo.userInfo) && Intrinsics.EZpvd(this.personalSetting, userMetaInfo.personalSetting) && Intrinsics.EZpvd(this.userConsents, userMetaInfo.userConsents) && Intrinsics.EZpvd(this.captchaVendors, userMetaInfo.captchaVendors);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getCaptchaVendors() {
        return this.captchaVendors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PersonalSetting getPersonalSetting() {
        return this.personalSetting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Popup getUserConsents() {
        return this.userConsents;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        UserInfo userInfo = this.userInfo;
        int iHashCode = userInfo == null ? 0 : userInfo.hashCode();
        PersonalSetting personalSetting = this.personalSetting;
        int iHashCode2 = personalSetting == null ? 0 : personalSetting.hashCode();
        Popup popup = this.userConsents;
        int iHashCode3 = popup == null ? 0 : popup.hashCode();
        List<String> list = this.captchaVendors;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPersonalSetting(PersonalSetting personalSetting) {
        this.personalSetting = personalSetting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UserMetaInfo(userInfo=" + this.userInfo + ", personalSetting=" + this.personalSetting + ", userConsents=" + this.userConsents + ", captchaVendors=" + this.captchaVendors + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.preference.data.model.meta.UserMetaInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserMetaInfo> serializer() {
            return UserMetaInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UserMetaInfo(int i, UserInfo userInfo, PersonalSetting personalSetting, Popup popup, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.userInfo = null;
        } else {
            this.userInfo = userInfo;
        }
        if ((i & 2) == 0) {
            this.personalSetting = null;
        } else {
            this.personalSetting = personalSetting;
        }
        if ((i & 4) == 0) {
            this.userConsents = null;
        } else {
            this.userConsents = popup;
        }
        if ((i & 8) == 0) {
            this.captchaVendors = null;
        } else {
            this.captchaVendors = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKPreference_preference_impl(UserMetaInfo userMetaInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || userMetaInfo.userInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, UserInfo$$serializer.INSTANCE, userMetaInfo.userInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || userMetaInfo.personalSetting != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, PersonalSetting$$serializer.INSTANCE, userMetaInfo.personalSetting);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || userMetaInfo.userConsents != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, Popup$$serializer.INSTANCE, userMetaInfo.userConsents);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && userMetaInfo.captchaVendors == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], userMetaInfo.captchaVendors);
    }

    public UserMetaInfo(UserInfo userInfo, PersonalSetting personalSetting, Popup popup, List<String> list) {
        this.userInfo = userInfo;
        this.personalSetting = personalSetting;
        this.userConsents = popup;
        this.captchaVendors = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:com.okinc.okuser.data.UserInfo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okuser.data.UserInfo) : (r2v0 com.okinc.okuser.data.UserInfo))
  (wrap:com.okinc.okuser.data.PersonalSetting:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okuser.data.PersonalSetting) : (r3v0 com.okinc.okuser.data.PersonalSetting))
  (wrap:com.okinc.okuser.data.popup.Popup:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okuser.data.popup.Popup) : (r4v0 com.okinc.okuser.data.popup.Popup))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
 A[MD:(com.okinc.okuser.data.UserInfo, com.okinc.okuser.data.PersonalSetting, com.okinc.okuser.data.popup.Popup, java.util.List<java.lang.String>):void (m)] (LINE:12) call: com.okinc.preference.data.model.meta.UserMetaInfo.<init>(com.okinc.okuser.data.UserInfo, com.okinc.okuser.data.PersonalSetting, com.okinc.okuser.data.popup.Popup, java.util.List):void type: THIS */
    public /* synthetic */ UserMetaInfo(UserInfo userInfo, PersonalSetting personalSetting, Popup popup, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : userInfo, (i & 2) != 0 ? null : personalSetting, (i & 4) != 0 ? null : popup, (i & 8) != 0 ? null : list);
    }
}
