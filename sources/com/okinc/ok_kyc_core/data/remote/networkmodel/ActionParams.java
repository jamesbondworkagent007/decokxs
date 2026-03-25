package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class ActionParams implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final Boolean allowReset;
    private final String content;
    private CallApiModel create;
    private final String deeplink;
    private CallApiModel delete;
    private final String extranceId;
    private final Integer forceBackEndConfig;
    private final String idCard;
    private final String infoText;
    private HashMap<String, String> localParams;
    private final String name;
    private final HashMap<String, String> onboarding;
    private final String openerNewTabUrl;
    private final Integer popSwitch;
    private final String primaryLabel;
    private final String processSubTitle;
    private final Long processTimeOut;
    private final String processTitle;
    private final String realName;
    private final ArrayList<String> sdkErrorMsg;
    private final int sdkErrorNumber;
    private final Integer sdkErrorSwitch;
    private final String sdkErrorTarget;
    private final String secondaryLabel;
    private final String serverURL;
    private final Boolean shouldClosePage;
    private final String skipTarget;
    private final String stunServerURL;
    private final Integer subCurrencyId;
    private final HashMap<String, String> submitParams;
    private final String surname;
    private final String title;
    private final String token;
    private final String transactionId;
    private final String travelRuleId;
    private final String turnPassword;
    private final String turnServerURL;
    private final String turnUsername;
    private CallApiModel update;
    private final String urlType;
    private final VerificationPayload verificationPayload;
    private final Integer verifyIdBack;
    private final Integer verifyIdFront;
    private final Integer verifySelfi;
    private final String videoCallWaitingInterval;
    private final String videoCallWaitingPeople;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ActionParams> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ActionParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ActionParams createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String str;
            HashMap map;
            Boolean boolValueOf2;
            HashMap map2;
            HashMap map3;
            HashMap map4;
            HashMap map5;
            Intrinsics.checkNotNullParameter(parcel, "");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            if (parcel.readInt() == 0) {
                str = string7;
                map = null;
            } else {
                int i = parcel.readInt();
                HashMap map6 = new HashMap(i);
                int i2 = 0;
                while (i2 != i) {
                    map6.put(parcel.readString(), parcel.readString());
                    i2++;
                    i = i;
                    string7 = string7;
                }
                str = string7;
                map = map6;
            }
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i3 = parcel.readInt();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            if (parcel.readInt() == 0) {
                map2 = map;
                map3 = null;
            } else {
                int i4 = parcel.readInt();
                HashMap map7 = new HashMap(i4);
                int i5 = 0;
                while (i5 != i4) {
                    map7.put(parcel.readString(), parcel.readString());
                    i5++;
                    i4 = i4;
                    map = map;
                }
                map2 = map;
                map3 = map7;
            }
            if (parcel.readInt() == 0) {
                map4 = map3;
                map5 = null;
            } else {
                int i6 = parcel.readInt();
                HashMap map8 = new HashMap(i6);
                int i7 = 0;
                while (i7 != i6) {
                    map8.put(parcel.readString(), parcel.readString());
                    i7++;
                    i6 = i6;
                    map3 = map3;
                }
                map4 = map3;
                map5 = map8;
            }
            return new ActionParams(numValueOf, numValueOf2, numValueOf3, string, boolValueOf, string2, string3, string4, string5, string6, lValueOf, str, string8, numValueOf4, string9, string10, map2, numValueOf5, numValueOf6, i3, arrayListCreateStringArrayList, string11, string12, boolValueOf2, string13, string14, map4, map5, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : VerificationPayload.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CallApiModel.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CallApiModel.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CallApiModel.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ActionParams[] newArray(int i) {
            return new ActionParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ActionParams() {
        this((Integer) null, (Integer) null, (Integer) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (HashMap) null, (Integer) null, (Integer) null, 0, (ArrayList) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (HashMap) null, (HashMap) null, (Integer) null, (VerificationPayload) null, (String) null, (String) null, (String) null, (CallApiModel) null, (CallApiModel) null, (CallApiModel) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.verifyIdFront;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.secondaryLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component11() {
        return this.processTimeOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.processTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.processSubTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component14() {
        return this.popSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.realName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.idCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> component17() {
        return this.onboarding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component18() {
        return this.forceBackEndConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component19() {
        return this.sdkErrorSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.verifyIdBack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component20() {
        return this.sdkErrorNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component21() {
        return this.sdkErrorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.sdkErrorTarget;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component24() {
        return this.shouldClosePage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.urlType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.openerNewTabUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> component27() {
        return this.submitParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> component28() {
        return this.localParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component29() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.verifySelfi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VerificationPayload component30() {
        return this.verificationPayload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.travelRuleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.extranceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.transactionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CallApiModel component34() {
        return this.create;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CallApiModel component35() {
        return this.update;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CallApiModel component36() {
        return this.delete;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.surname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.serverURL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.skipTarget;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component40() {
        return this.stunServerURL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.turnServerURL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.turnUsername;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.turnPassword;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component45() {
        return this.videoCallWaitingInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component46() {
        return this.videoCallWaitingPeople;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.allowReset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.infoText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.primaryLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActionParams copy(Integer num, Integer num2, Integer num3, String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, Long l, String str7, String str8, Integer num4, String str9, String str10, HashMap<String, String> map, Integer num5, Integer num6, int i, ArrayList<String> arrayList, String str11, String str12, Boolean bool2, String str13, String str14, HashMap<String, String> map2, HashMap<String, String> map3, Integer num7, VerificationPayload verificationPayload, @NotNull String str15, @NotNull String str16, @NotNull String str17, CallApiModel callApiModel, CallApiModel callApiModel2, CallApiModel callApiModel3, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27) {
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        return new ActionParams(num, num2, num3, str, bool, str2, str3, str4, str5, str6, l, str7, str8, num4, str9, str10, map, num5, num6, i, arrayList, str11, str12, bool2, str13, str14, map2, map3, num7, verificationPayload, str15, str16, str17, callApiModel, callApiModel2, callApiModel3, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27);
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
        if (!(obj instanceof ActionParams)) {
            return false;
        }
        ActionParams actionParams = (ActionParams) obj;
        return Intrinsics.EZpvd(this.verifyIdFront, actionParams.verifyIdFront) && Intrinsics.EZpvd(this.verifyIdBack, actionParams.verifyIdBack) && Intrinsics.EZpvd(this.verifySelfi, actionParams.verifySelfi) && Intrinsics.EZpvd((Object) this.skipTarget, (Object) actionParams.skipTarget) && Intrinsics.EZpvd(this.allowReset, actionParams.allowReset) && Intrinsics.EZpvd((Object) this.infoText, (Object) actionParams.infoText) && Intrinsics.EZpvd((Object) this.title, (Object) actionParams.title) && Intrinsics.EZpvd((Object) this.content, (Object) actionParams.content) && Intrinsics.EZpvd((Object) this.primaryLabel, (Object) actionParams.primaryLabel) && Intrinsics.EZpvd((Object) this.secondaryLabel, (Object) actionParams.secondaryLabel) && Intrinsics.EZpvd(this.processTimeOut, actionParams.processTimeOut) && Intrinsics.EZpvd((Object) this.processTitle, (Object) actionParams.processTitle) && Intrinsics.EZpvd((Object) this.processSubTitle, (Object) actionParams.processSubTitle) && Intrinsics.EZpvd(this.popSwitch, actionParams.popSwitch) && Intrinsics.EZpvd((Object) this.realName, (Object) actionParams.realName) && Intrinsics.EZpvd((Object) this.idCard, (Object) actionParams.idCard) && Intrinsics.EZpvd(this.onboarding, actionParams.onboarding) && Intrinsics.EZpvd(this.forceBackEndConfig, actionParams.forceBackEndConfig) && Intrinsics.EZpvd(this.sdkErrorSwitch, actionParams.sdkErrorSwitch) && this.sdkErrorNumber == actionParams.sdkErrorNumber && Intrinsics.EZpvd(this.sdkErrorMsg, actionParams.sdkErrorMsg) && Intrinsics.EZpvd((Object) this.sdkErrorTarget, (Object) actionParams.sdkErrorTarget) && Intrinsics.EZpvd((Object) this.deeplink, (Object) actionParams.deeplink) && Intrinsics.EZpvd(this.shouldClosePage, actionParams.shouldClosePage) && Intrinsics.EZpvd((Object) this.urlType, (Object) actionParams.urlType) && Intrinsics.EZpvd((Object) this.openerNewTabUrl, (Object) actionParams.openerNewTabUrl) && Intrinsics.EZpvd(this.submitParams, actionParams.submitParams) && Intrinsics.EZpvd(this.localParams, actionParams.localParams) && Intrinsics.EZpvd(this.subCurrencyId, actionParams.subCurrencyId) && Intrinsics.EZpvd(this.verificationPayload, actionParams.verificationPayload) && Intrinsics.EZpvd((Object) this.travelRuleId, (Object) actionParams.travelRuleId) && Intrinsics.EZpvd((Object) this.extranceId, (Object) actionParams.extranceId) && Intrinsics.EZpvd((Object) this.transactionId, (Object) actionParams.transactionId) && Intrinsics.EZpvd(this.create, actionParams.create) && Intrinsics.EZpvd(this.update, actionParams.update) && Intrinsics.EZpvd(this.delete, actionParams.delete) && Intrinsics.EZpvd((Object) this.name, (Object) actionParams.name) && Intrinsics.EZpvd((Object) this.surname, (Object) actionParams.surname) && Intrinsics.EZpvd((Object) this.serverURL, (Object) actionParams.serverURL) && Intrinsics.EZpvd((Object) this.stunServerURL, (Object) actionParams.stunServerURL) && Intrinsics.EZpvd((Object) this.turnServerURL, (Object) actionParams.turnServerURL) && Intrinsics.EZpvd((Object) this.token, (Object) actionParams.token) && Intrinsics.EZpvd((Object) this.turnUsername, (Object) actionParams.turnUsername) && Intrinsics.EZpvd((Object) this.turnPassword, (Object) actionParams.turnPassword) && Intrinsics.EZpvd((Object) this.videoCallWaitingInterval, (Object) actionParams.videoCallWaitingInterval) && Intrinsics.EZpvd((Object) this.videoCallWaitingPeople, (Object) actionParams.videoCallWaitingPeople);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowReset() {
        return this.allowReset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CallApiModel getCreate() {
        return this.create;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CallApiModel getDelete() {
        return this.delete;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtranceId() {
        return this.extranceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getForceBackEndConfig() {
        return this.forceBackEndConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIdCard() {
        return this.idCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInfoText() {
        return this.infoText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> getLocalParams() {
        return this.localParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> getOnboarding() {
        return this.onboarding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpenerNewTabUrl() {
        return this.openerNewTabUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPopSwitch() {
        return this.popSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrimaryLabel() {
        return this.primaryLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProcessSubTitle() {
        return this.processSubTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getProcessTimeOut() {
        return this.processTimeOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProcessTitle() {
        return this.processTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealName() {
        return this.realName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getSdkErrorMsg() {
        return this.sdkErrorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSdkErrorNumber() {
        return this.sdkErrorNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSdkErrorSwitch() {
        return this.sdkErrorSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSdkErrorTarget() {
        return this.sdkErrorTarget;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSecondaryLabel() {
        return this.secondaryLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServerURL() {
        return this.serverURL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShouldClosePage() {
        return this.shouldClosePage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSkipTarget() {
        return this.skipTarget;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStunServerURL() {
        return this.stunServerURL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSubCurrencyId() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> getSubmitParams() {
        return this.submitParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSurname() {
        return this.surname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTravelRuleId() {
        return this.travelRuleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTurnPassword() {
        return this.turnPassword;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTurnServerURL() {
        return this.turnServerURL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTurnUsername() {
        return this.turnUsername;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CallApiModel getUpdate() {
        return this.update;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrlType() {
        return this.urlType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VerificationPayload getVerificationPayload() {
        return this.verificationPayload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getVerifyIdBack() {
        return this.verifyIdBack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getVerifyIdFront() {
        return this.verifyIdFront;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getVerifySelfi() {
        return this.verifySelfi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVideoCallWaitingInterval() {
        return this.videoCallWaitingInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVideoCallWaitingPeople() {
        return this.videoCallWaitingPeople;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.verifyIdFront;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.verifyIdBack;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.verifySelfi;
        int iHashCode3 = num3 == null ? 0 : num3.hashCode();
        String str = this.skipTarget;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        Boolean bool = this.allowReset;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        String str2 = this.infoText;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.title;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.content;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.primaryLabel;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.secondaryLabel;
        int iHashCode10 = str6 == null ? 0 : str6.hashCode();
        Long l = this.processTimeOut;
        int iHashCode11 = l == null ? 0 : l.hashCode();
        String str7 = this.processTitle;
        int iHashCode12 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.processSubTitle;
        int iHashCode13 = str8 == null ? 0 : str8.hashCode();
        Integer num4 = this.popSwitch;
        int iHashCode14 = num4 == null ? 0 : num4.hashCode();
        String str9 = this.realName;
        int iHashCode15 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.idCard;
        int iHashCode16 = str10 == null ? 0 : str10.hashCode();
        HashMap<String, String> map = this.onboarding;
        int iHashCode17 = map == null ? 0 : map.hashCode();
        Integer num5 = this.forceBackEndConfig;
        int iHashCode18 = num5 == null ? 0 : num5.hashCode();
        Integer num6 = this.sdkErrorSwitch;
        int iHashCode19 = num6 == null ? 0 : num6.hashCode();
        int iHashCode20 = Integer.hashCode(this.sdkErrorNumber);
        ArrayList<String> arrayList = this.sdkErrorMsg;
        int iHashCode21 = arrayList == null ? 0 : arrayList.hashCode();
        String str11 = this.sdkErrorTarget;
        int iHashCode22 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.deeplink;
        int iHashCode23 = str12 == null ? 0 : str12.hashCode();
        Boolean bool2 = this.shouldClosePage;
        int iHashCode24 = bool2 == null ? 0 : bool2.hashCode();
        String str13 = this.urlType;
        int iHashCode25 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.openerNewTabUrl;
        int iHashCode26 = str14 == null ? 0 : str14.hashCode();
        HashMap<String, String> map2 = this.submitParams;
        int iHashCode27 = map2 == null ? 0 : map2.hashCode();
        HashMap<String, String> map3 = this.localParams;
        int iHashCode28 = map3 == null ? 0 : map3.hashCode();
        Integer num7 = this.subCurrencyId;
        int iHashCode29 = num7 == null ? 0 : num7.hashCode();
        VerificationPayload verificationPayload = this.verificationPayload;
        int iHashCode30 = verificationPayload == null ? 0 : verificationPayload.hashCode();
        int iHashCode31 = this.travelRuleId.hashCode();
        int iHashCode32 = this.extranceId.hashCode();
        int iHashCode33 = this.transactionId.hashCode();
        CallApiModel callApiModel = this.create;
        int iHashCode34 = callApiModel == null ? 0 : callApiModel.hashCode();
        CallApiModel callApiModel2 = this.update;
        int iHashCode35 = callApiModel2 == null ? 0 : callApiModel2.hashCode();
        CallApiModel callApiModel3 = this.delete;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + (callApiModel3 == null ? 0 : callApiModel3.hashCode())) * 31) + this.name.hashCode()) * 31) + this.surname.hashCode()) * 31) + this.serverURL.hashCode()) * 31) + this.stunServerURL.hashCode()) * 31) + this.turnServerURL.hashCode()) * 31) + this.token.hashCode()) * 31) + this.turnUsername.hashCode()) * 31) + this.turnPassword.hashCode()) * 31) + this.videoCallWaitingInterval.hashCode()) * 31) + this.videoCallWaitingPeople.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreate(CallApiModel callApiModel) {
        this.create = callApiModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDelete(CallApiModel callApiModel) {
        this.delete = callApiModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocalParams(HashMap<String, String> map) {
        this.localParams = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpdate(CallApiModel callApiModel) {
        this.update = callApiModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ActionParams(verifyIdFront=" + this.verifyIdFront + ", verifyIdBack=" + this.verifyIdBack + ", verifySelfi=" + this.verifySelfi + ", skipTarget=" + this.skipTarget + ", allowReset=" + this.allowReset + ", infoText=" + this.infoText + ", title=" + this.title + ", content=" + this.content + ", primaryLabel=" + this.primaryLabel + ", secondaryLabel=" + this.secondaryLabel + ", processTimeOut=" + this.processTimeOut + ", processTitle=" + this.processTitle + ", processSubTitle=" + this.processSubTitle + ", popSwitch=" + this.popSwitch + ", realName=" + this.realName + ", idCard=" + this.idCard + ", onboarding=" + this.onboarding + ", forceBackEndConfig=" + this.forceBackEndConfig + ", sdkErrorSwitch=" + this.sdkErrorSwitch + ", sdkErrorNumber=" + this.sdkErrorNumber + ", sdkErrorMsg=" + this.sdkErrorMsg + ", sdkErrorTarget=" + this.sdkErrorTarget + ", deeplink=" + this.deeplink + ", shouldClosePage=" + this.shouldClosePage + ", urlType=" + this.urlType + ", openerNewTabUrl=" + this.openerNewTabUrl + ", submitParams=" + this.submitParams + ", localParams=" + this.localParams + ", subCurrencyId=" + this.subCurrencyId + ", verificationPayload=" + this.verificationPayload + ", travelRuleId=" + this.travelRuleId + ", extranceId=" + this.extranceId + ", transactionId=" + this.transactionId + ", create=" + this.create + ", update=" + this.update + ", delete=" + this.delete + ", name=" + this.name + ", surname=" + this.surname + ", serverURL=" + this.serverURL + ", stunServerURL=" + this.stunServerURL + ", turnServerURL=" + this.turnServerURL + ", token=" + this.token + ", turnUsername=" + this.turnUsername + ", turnPassword=" + this.turnPassword + ", videoCallWaitingInterval=" + this.videoCallWaitingInterval + ", videoCallWaitingPeople=" + this.videoCallWaitingPeople + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.verifyIdFront;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.verifyIdBack;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.verifySelfi;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.skipTarget);
        Boolean bool = this.allowReset;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.infoText);
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeString(this.primaryLabel);
        parcel.writeString(this.secondaryLabel);
        Long l = this.processTimeOut;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.processTitle);
        parcel.writeString(this.processSubTitle);
        Integer num4 = this.popSwitch;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeString(this.realName);
        parcel.writeString(this.idCard);
        HashMap<String, String> map = this.onboarding;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        Integer num5 = this.forceBackEndConfig;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Integer num6 = this.sdkErrorSwitch;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        parcel.writeInt(this.sdkErrorNumber);
        parcel.writeStringList(this.sdkErrorMsg);
        parcel.writeString(this.sdkErrorTarget);
        parcel.writeString(this.deeplink);
        Boolean bool2 = this.shouldClosePage;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.urlType);
        parcel.writeString(this.openerNewTabUrl);
        HashMap<String, String> map2 = this.submitParams;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map2.size());
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                parcel.writeString(entry2.getKey());
                parcel.writeString(entry2.getValue());
            }
        }
        HashMap<String, String> map3 = this.localParams;
        if (map3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map3.size());
            for (Map.Entry<String, String> entry3 : map3.entrySet()) {
                parcel.writeString(entry3.getKey());
                parcel.writeString(entry3.getValue());
            }
        }
        Integer num7 = this.subCurrencyId;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num7.intValue());
        }
        VerificationPayload verificationPayload = this.verificationPayload;
        if (verificationPayload == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            verificationPayload.writeToParcel(parcel, i);
        }
        parcel.writeString(this.travelRuleId);
        parcel.writeString(this.extranceId);
        parcel.writeString(this.transactionId);
        CallApiModel callApiModel = this.create;
        if (callApiModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            callApiModel.writeToParcel(parcel, i);
        }
        CallApiModel callApiModel2 = this.update;
        if (callApiModel2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            callApiModel2.writeToParcel(parcel, i);
        }
        CallApiModel callApiModel3 = this.delete;
        if (callApiModel3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            callApiModel3.writeToParcel(parcel, i);
        }
        parcel.writeString(this.name);
        parcel.writeString(this.surname);
        parcel.writeString(this.serverURL);
        parcel.writeString(this.stunServerURL);
        parcel.writeString(this.turnServerURL);
        parcel.writeString(this.token);
        parcel.writeString(this.turnUsername);
        parcel.writeString(this.turnPassword);
        parcel.writeString(this.videoCallWaitingInterval);
        parcel.writeString(this.videoCallWaitingPeople);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.ActionParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ActionParams> serializer() {
            return ActionParams$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new HashMapSerializer(stringSerializer, stringSerializer), null, null, null, new ArrayListSerializer(stringSerializer), null, null, null, null, null, new HashMapSerializer(stringSerializer, stringSerializer), new HashMapSerializer(stringSerializer, stringSerializer), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ ActionParams(int i, int i2, Integer num, Integer num2, Integer num3, String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, Long l, String str7, String str8, Integer num4, String str9, String str10, HashMap map, Integer num5, Integer num6, int i3, ArrayList arrayList, String str11, String str12, Boolean bool2, String str13, String str14, HashMap map2, HashMap map3, Integer num7, VerificationPayload verificationPayload, String str15, String str16, String str17, CallApiModel callApiModel, CallApiModel callApiModel2, CallApiModel callApiModel3, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.verifyIdFront = null;
        } else {
            this.verifyIdFront = num;
        }
        if ((i & 2) == 0) {
            this.verifyIdBack = null;
        } else {
            this.verifyIdBack = num2;
        }
        if ((i & 4) == 0) {
            this.verifySelfi = null;
        } else {
            this.verifySelfi = num3;
        }
        if ((i & 8) == 0) {
            this.skipTarget = null;
        } else {
            this.skipTarget = str;
        }
        this.allowReset = (i & 16) == 0 ? Boolean.TRUE : bool;
        if ((i & 32) == 0) {
            this.infoText = "";
        } else {
            this.infoText = str2;
        }
        if ((i & 64) == 0) {
            this.title = "";
        } else {
            this.title = str3;
        }
        if ((i & 128) == 0) {
            this.content = "";
        } else {
            this.content = str4;
        }
        if ((i & 256) == 0) {
            this.primaryLabel = "";
        } else {
            this.primaryLabel = str5;
        }
        if ((i & 512) == 0) {
            this.secondaryLabel = "";
        } else {
            this.secondaryLabel = str6;
        }
        this.processTimeOut = (i & 1024) == 0 ? 120000L : l;
        if ((i & 2048) == 0) {
            this.processTitle = "";
        } else {
            this.processTitle = str7;
        }
        if ((i & 4096) == 0) {
            this.processSubTitle = "";
        } else {
            this.processSubTitle = str8;
        }
        if ((i & 8192) == 0) {
            this.popSwitch = null;
        } else {
            this.popSwitch = num4;
        }
        if ((i & 16384) == 0) {
            this.realName = "";
        } else {
            this.realName = str9;
        }
        if ((32768 & i) == 0) {
            this.idCard = "";
        } else {
            this.idCard = str10;
        }
        if ((65536 & i) == 0) {
            this.onboarding = null;
        } else {
            this.onboarding = map;
        }
        if ((131072 & i) == 0) {
            this.forceBackEndConfig = null;
        } else {
            this.forceBackEndConfig = num5;
        }
        if ((262144 & i) == 0) {
            this.sdkErrorSwitch = null;
        } else {
            this.sdkErrorSwitch = num6;
        }
        this.sdkErrorNumber = (524288 & i) == 0 ? 3 : i3;
        this.sdkErrorMsg = (1048576 & i) == 0 ? new ArrayList() : arrayList;
        if ((2097152 & i) == 0) {
            this.sdkErrorTarget = null;
        } else {
            this.sdkErrorTarget = str11;
        }
        if ((4194304 & i) == 0) {
            this.deeplink = "";
        } else {
            this.deeplink = str12;
        }
        this.shouldClosePage = (8388608 & i) == 0 ? Boolean.FALSE : bool2;
        if ((16777216 & i) == 0) {
            this.urlType = "";
        } else {
            this.urlType = str13;
        }
        if ((33554432 & i) == 0) {
            this.openerNewTabUrl = "";
        } else {
            this.openerNewTabUrl = str14;
        }
        if ((67108864 & i) == 0) {
            this.submitParams = null;
        } else {
            this.submitParams = map2;
        }
        if ((134217728 & i) == 0) {
            this.localParams = null;
        } else {
            this.localParams = map3;
        }
        if ((268435456 & i) == 0) {
            this.subCurrencyId = null;
        } else {
            this.subCurrencyId = num7;
        }
        if ((536870912 & i) == 0) {
            this.verificationPayload = null;
        } else {
            this.verificationPayload = verificationPayload;
        }
        this.travelRuleId = (1073741824 & i) == 0 ? "0" : str15;
        if ((i & Integer.MIN_VALUE) == 0) {
            this.extranceId = "";
        } else {
            this.extranceId = str16;
        }
        if ((i2 & 1) == 0) {
            this.transactionId = "";
        } else {
            this.transactionId = str17;
        }
        if ((i2 & 2) == 0) {
            this.create = null;
        } else {
            this.create = callApiModel;
        }
        if ((i2 & 4) == 0) {
            this.update = null;
        } else {
            this.update = callApiModel2;
        }
        if ((i2 & 8) == 0) {
            this.delete = null;
        } else {
            this.delete = callApiModel3;
        }
        if ((i2 & 16) == 0) {
            this.name = "";
        } else {
            this.name = str18;
        }
        if ((i2 & 32) == 0) {
            this.surname = "";
        } else {
            this.surname = str19;
        }
        if ((i2 & 64) == 0) {
            this.serverURL = "";
        } else {
            this.serverURL = str20;
        }
        if ((i2 & 128) == 0) {
            this.stunServerURL = "";
        } else {
            this.stunServerURL = str21;
        }
        if ((i2 & 256) == 0) {
            this.turnServerURL = "";
        } else {
            this.turnServerURL = str22;
        }
        if ((i2 & 512) == 0) {
            this.token = "";
        } else {
            this.token = str23;
        }
        if ((i2 & 1024) == 0) {
            this.turnUsername = "";
        } else {
            this.turnUsername = str24;
        }
        if ((i2 & 2048) == 0) {
            this.turnPassword = "";
        } else {
            this.turnPassword = str25;
        }
        if ((i2 & 4096) == 0) {
            this.videoCallWaitingInterval = "";
        } else {
            this.videoCallWaitingInterval = str26;
        }
        if ((i2 & 8192) == 0) {
            this.videoCallWaitingPeople = "";
        } else {
            this.videoCallWaitingPeople = str27;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(ActionParams actionParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Long l;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || actionParams.verifyIdFront != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, actionParams.verifyIdFront);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || actionParams.verifyIdBack != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, actionParams.verifyIdBack);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || actionParams.verifySelfi != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, actionParams.verifySelfi);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || actionParams.skipTarget != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, actionParams.skipTarget);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(actionParams.allowReset, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, actionParams.allowReset);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) actionParams.infoText, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, actionParams.infoText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) actionParams.title, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, actionParams.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) actionParams.content, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, actionParams.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) actionParams.primaryLabel, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, actionParams.primaryLabel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) actionParams.secondaryLabel, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, actionParams.secondaryLabel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || (l = actionParams.processTimeOut) == null || l.longValue() != 120000) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, LongSerializer.INSTANCE, actionParams.processTimeOut);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) actionParams.processTitle, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, actionParams.processTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) actionParams.processSubTitle, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, actionParams.processSubTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || actionParams.popSwitch != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, actionParams.popSwitch);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) actionParams.realName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, actionParams.realName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) actionParams.idCard, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, actionParams.idCard);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || actionParams.onboarding != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, kSerializerArr[16], actionParams.onboarding);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || actionParams.forceBackEndConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, IntSerializer.INSTANCE, actionParams.forceBackEndConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || actionParams.sdkErrorSwitch != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, IntSerializer.INSTANCE, actionParams.sdkErrorSwitch);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || actionParams.sdkErrorNumber != 3) {
            compositeEncoder.encodeIntElement(serialDescriptor, 19, actionParams.sdkErrorNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd(actionParams.sdkErrorMsg, new ArrayList())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, kSerializerArr[20], actionParams.sdkErrorMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || actionParams.sdkErrorTarget != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, actionParams.sdkErrorTarget);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) actionParams.deeplink, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, actionParams.deeplink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd(actionParams.shouldClosePage, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, BooleanSerializer.INSTANCE, actionParams.shouldClosePage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) actionParams.urlType, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, actionParams.urlType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) actionParams.openerNewTabUrl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, actionParams.openerNewTabUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || actionParams.submitParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, kSerializerArr[26], actionParams.submitParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || actionParams.localParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, kSerializerArr[27], actionParams.localParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || actionParams.subCurrencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, IntSerializer.INSTANCE, actionParams.subCurrencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || actionParams.verificationPayload != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, VerificationPayload$$serializer.INSTANCE, actionParams.verificationPayload);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) actionParams.travelRuleId, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, actionParams.travelRuleId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) actionParams.extranceId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, actionParams.extranceId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) actionParams.transactionId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, actionParams.transactionId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || actionParams.create != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, CallApiModel$$serializer.INSTANCE, actionParams.create);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || actionParams.update != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, CallApiModel$$serializer.INSTANCE, actionParams.update);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || actionParams.delete != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, CallApiModel$$serializer.INSTANCE, actionParams.delete);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd((Object) actionParams.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 36, actionParams.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || !Intrinsics.EZpvd((Object) actionParams.surname, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 37, actionParams.surname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) actionParams.serverURL, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, actionParams.serverURL);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || !Intrinsics.EZpvd((Object) actionParams.stunServerURL, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 39, actionParams.stunServerURL);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || !Intrinsics.EZpvd((Object) actionParams.turnServerURL, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 40, actionParams.turnServerURL);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !Intrinsics.EZpvd((Object) actionParams.token, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 41, actionParams.token);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || !Intrinsics.EZpvd((Object) actionParams.turnUsername, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 42, actionParams.turnUsername);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || !Intrinsics.EZpvd((Object) actionParams.turnPassword, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 43, actionParams.turnPassword);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || !Intrinsics.EZpvd((Object) actionParams.videoCallWaitingInterval, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 44, actionParams.videoCallWaitingInterval);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) && Intrinsics.EZpvd((Object) actionParams.videoCallWaitingPeople, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 45, actionParams.videoCallWaitingPeople);
    }

    public ActionParams(Integer num, Integer num2, Integer num3, String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, Long l, String str7, String str8, Integer num4, String str9, String str10, HashMap<String, String> map, Integer num5, Integer num6, int i, ArrayList<String> arrayList, String str11, String str12, Boolean bool2, String str13, String str14, HashMap<String, String> map2, HashMap<String, String> map3, Integer num7, VerificationPayload verificationPayload, @NotNull String str15, @NotNull String str16, @NotNull String str17, CallApiModel callApiModel, CallApiModel callApiModel2, CallApiModel callApiModel3, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27) {
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        this.verifyIdFront = num;
        this.verifyIdBack = num2;
        this.verifySelfi = num3;
        this.skipTarget = str;
        this.allowReset = bool;
        this.infoText = str2;
        this.title = str3;
        this.content = str4;
        this.primaryLabel = str5;
        this.secondaryLabel = str6;
        this.processTimeOut = l;
        this.processTitle = str7;
        this.processSubTitle = str8;
        this.popSwitch = num4;
        this.realName = str9;
        this.idCard = str10;
        this.onboarding = map;
        this.forceBackEndConfig = num5;
        this.sdkErrorSwitch = num6;
        this.sdkErrorNumber = i;
        this.sdkErrorMsg = arrayList;
        this.sdkErrorTarget = str11;
        this.deeplink = str12;
        this.shouldClosePage = bool2;
        this.urlType = str13;
        this.openerNewTabUrl = str14;
        this.submitParams = map2;
        this.localParams = map3;
        this.subCurrencyId = num7;
        this.verificationPayload = verificationPayload;
        this.travelRuleId = str15;
        this.extranceId = str16;
        this.transactionId = str17;
        this.create = callApiModel;
        this.update = callApiModel2;
        this.delete = callApiModel3;
        this.name = str18;
        this.surname = str19;
        this.serverURL = str20;
        this.stunServerURL = str21;
        this.turnServerURL = str22;
        this.token = str23;
        this.turnUsername = str24;
        this.turnPassword = str25;
        this.videoCallWaitingInterval = str26;
        this.videoCallWaitingPeople = str27;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0231: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0004: ARITH (r91v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r45v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000c: ARITH (r91v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r46v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0014: ARITH (r91v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r47v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r91v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r91v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0028: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r49v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r91v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r91v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r91v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r91v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r91v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0057: ARITH (r91v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (120000 long) : (r55v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r91v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006d: ARITH (r91v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.Integer:0x007f: TERNARY null = ((wrap:int:0x0077: ARITH (r91v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r58v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0081: ARITH (r91v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r91v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x0098: ARITH (r91v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.util.HashMap) : (r61v0 java.util.HashMap))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r91v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r62v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r91v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r63v0 java.lang.Integer))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r91v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (3 int) : (r64v0 int))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r91v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00ca: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:1597) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r65v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d2: ARITH (r91v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00dd: ARITH (r91v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00e8: ARITH (r91v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00ec: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r68v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f3: ARITH (r91v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fe: ARITH (r91v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x0109: ARITH (r91v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.util.HashMap) : (r71v0 java.util.HashMap))
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x0114: ARITH (r91v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.util.HashMap) : (r72v0 java.util.HashMap))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x011f: ARITH (r91v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r73v0 java.lang.Integer))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.VerificationPayload:?: TERNARY null = ((wrap:int:0x012a: ARITH (r91v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.VerificationPayload) : (r74v0 com.okinc.ok_kyc_core.data.remote.networkmodel.VerificationPayload))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0135: ARITH (r91v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("0") : (r75v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0140: ARITH (r91v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r76v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0149: ARITH (r92v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r77v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel:?: TERNARY null = ((wrap:int:0x0152: ARITH (r92v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel) : (r78v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel:?: TERNARY null = ((wrap:int:0x015b: ARITH (r92v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel) : (r79v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel:?: TERNARY null = ((wrap:int:0x0164: ARITH (r92v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel) : (r80v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x016d: ARITH (r92v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r81v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0176: ARITH (r92v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r82v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x017f: ARITH (r92v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r83v0 java.lang.String))
  (wrap:java.lang.String:0x0193: TERNARY null = ((wrap:int:0x018a: ARITH (r92v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r84v0 java.lang.String))
  (wrap:java.lang.String:0x019e: TERNARY null = ((wrap:int:0x0195: ARITH (r92v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r85v0 java.lang.String))
  (wrap:java.lang.String:0x01a9: TERNARY null = ((wrap:int:0x01a0: ARITH (r92v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r86v0 java.lang.String))
  (wrap:java.lang.String:0x01b4: TERNARY null = ((wrap:int:0x01ab: ARITH (r92v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r87v0 java.lang.String))
  (wrap:java.lang.String:0x01bf: TERNARY null = ((wrap:int:0x01b6: ARITH (r92v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r88v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01c1: ARITH (r92v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r89v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01ca: ARITH (r92v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r90v0 java.lang.String))
 A[MD:(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>, java.lang.Integer, java.lang.Integer, int, java.util.ArrayList<java.lang.String>, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>, java.util.HashMap<java.lang.String, java.lang.String>, java.lang.Integer, com.okinc.ok_kyc_core.data.remote.networkmodel.VerificationPayload, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel, com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel, com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1572) call: com.okinc.ok_kyc_core.data.remote.networkmodel.ActionParams.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.util.HashMap, java.lang.Integer, java.lang.Integer, int, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.util.HashMap, java.util.HashMap, java.lang.Integer, com.okinc.ok_kyc_core.data.remote.networkmodel.VerificationPayload, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel, com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel, com.okinc.ok_kyc_core.data.remote.networkmodel.CallApiModel, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ActionParams(Integer num, Integer num2, Integer num3, String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, Long l, String str7, String str8, Integer num4, String str9, String str10, HashMap map, Integer num5, Integer num6, int i, ArrayList arrayList, String str11, String str12, Boolean bool2, String str13, String str14, HashMap map2, HashMap map3, Integer num7, VerificationPayload verificationPayload, String str15, String str16, String str17, CallApiModel callApiModel, CallApiModel callApiModel2, CallApiModel callApiModel3, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? null : num2, (i2 & 4) != 0 ? null : num3, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? Boolean.TRUE : bool, (i2 & 32) != 0 ? "" : str2, (i2 & 64) != 0 ? "" : str3, (i2 & 128) != 0 ? "" : str4, (i2 & 256) != 0 ? "" : str5, (i2 & 512) != 0 ? "" : str6, (i2 & 1024) != 0 ? 120000L : l, (i2 & 2048) != 0 ? "" : str7, (i2 & 4096) != 0 ? "" : str8, (i2 & 8192) != 0 ? null : num4, (i2 & 16384) != 0 ? "" : str9, (i2 & 32768) != 0 ? "" : str10, (i2 & 65536) != 0 ? null : map, (i2 & 131072) != 0 ? null : num5, (i2 & 262144) != 0 ? null : num6, (i2 & 524288) != 0 ? 3 : i, (i2 & 1048576) != 0 ? new ArrayList() : arrayList, (i2 & 2097152) != 0 ? null : str11, (i2 & 4194304) != 0 ? "" : str12, (i2 & 8388608) != 0 ? Boolean.FALSE : bool2, (i2 & 16777216) != 0 ? "" : str13, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str14, (i2 & 67108864) != 0 ? null : map2, (i2 & 134217728) != 0 ? null : map3, (i2 & 268435456) != 0 ? null : num7, (i2 & 536870912) != 0 ? null : verificationPayload, (i2 & 1073741824) != 0 ? "0" : str15, (i2 & Integer.MIN_VALUE) != 0 ? "" : str16, (i3 & 1) != 0 ? "" : str17, (i3 & 2) != 0 ? null : callApiModel, (i3 & 4) != 0 ? null : callApiModel2, (i3 & 8) != 0 ? null : callApiModel3, (i3 & 16) != 0 ? "" : str18, (i3 & 32) != 0 ? "" : str19, (i3 & 64) != 0 ? "" : str20, (i3 & 128) != 0 ? "" : str21, (i3 & 256) != 0 ? "" : str22, (i3 & 512) != 0 ? "" : str23, (i3 & 1024) != 0 ? "" : str24, (i3 & 2048) != 0 ? "" : str25, (i3 & 4096) != 0 ? "" : str26, (i3 & 8192) != 0 ? "" : str27);
    }
}
