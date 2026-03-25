package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class HomeNotifyResponse implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private String action;
    private HashMap<String, String> actionParams;
    private Boolean allowClose;
    private Integer bannerType;
    private final BtnTips btnTips;
    private String buttonText;
    private String content;
    private final CtaData cta;
    private String iconName;
    private String playbook;
    private final ButtonDialogData playbookCtaDialogConfigurationModel;
    private Boolean showNotify;
    private String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<HomeNotifyResponse> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<HomeNotifyResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeNotifyResponse createFromParcel(Parcel parcel) {
            HashMap map;
            Intrinsics.checkNotNullParameter(parcel, "");
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                map = null;
            } else {
                int i = parcel.readInt();
                HashMap map2 = new HashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    map2.put(parcel.readString(), parcel.readString());
                }
                map = map2;
            }
            return new HomeNotifyResponse(boolValueOf, string, string2, string3, string4, map, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : BtnTips.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CtaData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ButtonDialogData.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeNotifyResponse[] newArray(int i) {
            return new HomeNotifyResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HomeNotifyResponse() {
        this((Boolean) null, (String) null, (String) null, (String) null, (String) null, (HashMap) null, (String) null, (String) null, (Integer) null, (Boolean) null, (BtnTips) null, (CtaData) null, (ButtonDialogData) null, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.showNotify;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component10() {
        return this.allowClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BtnTips component11() {
        return this.btnTips;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaData component12() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ButtonDialogData component13() {
        return this.playbookCtaDialogConfigurationModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.buttonText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.playbook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> component6() {
        return this.actionParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.action;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.iconName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component9() {
        return this.bannerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeNotifyResponse copy(Boolean bool, String str, String str2, String str3, String str4, HashMap<String, String> map, String str5, String str6, Integer num, Boolean bool2, BtnTips btnTips, CtaData ctaData, ButtonDialogData buttonDialogData) {
        return new HomeNotifyResponse(bool, str, str2, str3, str4, map, str5, str6, num, bool2, btnTips, ctaData, buttonDialogData);
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
        if (!(obj instanceof HomeNotifyResponse)) {
            return false;
        }
        HomeNotifyResponse homeNotifyResponse = (HomeNotifyResponse) obj;
        return Intrinsics.EZpvd(this.showNotify, homeNotifyResponse.showNotify) && Intrinsics.EZpvd((Object) this.content, (Object) homeNotifyResponse.content) && Intrinsics.EZpvd((Object) this.title, (Object) homeNotifyResponse.title) && Intrinsics.EZpvd((Object) this.buttonText, (Object) homeNotifyResponse.buttonText) && Intrinsics.EZpvd((Object) this.playbook, (Object) homeNotifyResponse.playbook) && Intrinsics.EZpvd(this.actionParams, homeNotifyResponse.actionParams) && Intrinsics.EZpvd((Object) this.action, (Object) homeNotifyResponse.action) && Intrinsics.EZpvd((Object) this.iconName, (Object) homeNotifyResponse.iconName) && Intrinsics.EZpvd(this.bannerType, homeNotifyResponse.bannerType) && Intrinsics.EZpvd(this.allowClose, homeNotifyResponse.allowClose) && Intrinsics.EZpvd(this.btnTips, homeNotifyResponse.btnTips) && Intrinsics.EZpvd(this.cta, homeNotifyResponse.cta) && Intrinsics.EZpvd(this.playbookCtaDialogConfigurationModel, homeNotifyResponse.playbookCtaDialogConfigurationModel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAction() {
        return this.action;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, String> getActionParams() {
        return this.actionParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowClose() {
        return this.allowClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBannerType() {
        return this.bannerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BtnTips getBtnTips() {
        return this.btnTips;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaData getCta() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconName() {
        return this.iconName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlaybook() {
        return this.playbook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ButtonDialogData getPlaybookCtaDialogConfigurationModel() {
        return this.playbookCtaDialogConfigurationModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShowNotify() {
        return this.showNotify;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.showNotify;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        String str = this.content;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.title;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.buttonText;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.playbook;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        HashMap<String, String> map = this.actionParams;
        int iHashCode6 = map == null ? 0 : map.hashCode();
        String str5 = this.action;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.iconName;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        Integer num = this.bannerType;
        int iHashCode9 = num == null ? 0 : num.hashCode();
        Boolean bool2 = this.allowClose;
        int iHashCode10 = bool2 == null ? 0 : bool2.hashCode();
        BtnTips btnTips = this.btnTips;
        int iHashCode11 = btnTips == null ? 0 : btnTips.hashCode();
        CtaData ctaData = this.cta;
        int iHashCode12 = ctaData == null ? 0 : ctaData.hashCode();
        ButtonDialogData buttonDialogData = this.playbookCtaDialogConfigurationModel;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (buttonDialogData != null ? buttonDialogData.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAction(String str) {
        this.action = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActionParams(HashMap<String, String> map) {
        this.actionParams = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllowClose(Boolean bool) {
        this.allowClose = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBannerType(Integer num) {
        this.bannerType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setButtonText(String str) {
        this.buttonText = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContent(String str) {
        this.content = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIconName(String str) {
        this.iconName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlaybook(String str) {
        this.playbook = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowNotify(Boolean bool) {
        this.showNotify = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(String str) {
        this.title = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HomeNotifyResponse(showNotify=" + this.showNotify + ", content=" + this.content + ", title=" + this.title + ", buttonText=" + this.buttonText + ", playbook=" + this.playbook + ", actionParams=" + this.actionParams + ", action=" + this.action + ", iconName=" + this.iconName + ", bannerType=" + this.bannerType + ", allowClose=" + this.allowClose + ", btnTips=" + this.btnTips + ", cta=" + this.cta + ", playbookCtaDialogConfigurationModel=" + this.playbookCtaDialogConfigurationModel + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Boolean bool = this.showNotify;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.content);
        parcel.writeString(this.title);
        parcel.writeString(this.buttonText);
        parcel.writeString(this.playbook);
        HashMap<String, String> map = this.actionParams;
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
        parcel.writeString(this.action);
        parcel.writeString(this.iconName);
        Integer num = this.bannerType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool2 = this.allowClose;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        BtnTips btnTips = this.btnTips;
        if (btnTips == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            btnTips.writeToParcel(parcel, i);
        }
        CtaData ctaData = this.cta;
        if (ctaData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ctaData.writeToParcel(parcel, i);
        }
        ButtonDialogData buttonDialogData = this.playbookCtaDialogConfigurationModel;
        if (buttonDialogData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonDialogData.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.HomeNotifyResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HomeNotifyResponse> serializer() {
            return HomeNotifyResponse$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, new HashMapSerializer(stringSerializer, stringSerializer), null, null, null, null, null, null, null};
    }

    public /* synthetic */ HomeNotifyResponse(int i, Boolean bool, String str, String str2, String str3, String str4, HashMap map, String str5, String str6, Integer num, Boolean bool2, BtnTips btnTips, CtaData ctaData, ButtonDialogData buttonDialogData, SerializationConstructorMarker serializationConstructorMarker) {
        this.showNotify = (i & 1) == 0 ? Boolean.FALSE : bool;
        if ((i & 2) == 0) {
            this.content = "";
        } else {
            this.content = str;
        }
        if ((i & 4) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 8) == 0) {
            this.buttonText = "";
        } else {
            this.buttonText = str3;
        }
        if ((i & 16) == 0) {
            this.playbook = "";
        } else {
            this.playbook = str4;
        }
        if ((i & 32) == 0) {
            this.actionParams = null;
        } else {
            this.actionParams = map;
        }
        if ((i & 64) == 0) {
            this.action = "";
        } else {
            this.action = str5;
        }
        if ((i & 128) == 0) {
            this.iconName = "";
        } else {
            this.iconName = str6;
        }
        if ((i & 256) == 0) {
            this.bannerType = -1;
        } else {
            this.bannerType = num;
        }
        if ((i & 512) == 0) {
            this.allowClose = Boolean.TRUE;
        } else {
            this.allowClose = bool2;
        }
        if ((i & 1024) == 0) {
            this.btnTips = null;
        } else {
            this.btnTips = btnTips;
        }
        if ((i & 2048) == 0) {
            this.cta = null;
        } else {
            this.cta = ctaData;
        }
        if ((i & 4096) == 0) {
            this.playbookCtaDialogConfigurationModel = null;
        } else {
            this.playbookCtaDialogConfigurationModel = buttonDialogData;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(HomeNotifyResponse homeNotifyResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(homeNotifyResponse.showNotify, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, homeNotifyResponse.showNotify);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) homeNotifyResponse.content, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, homeNotifyResponse.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) homeNotifyResponse.title, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, homeNotifyResponse.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) homeNotifyResponse.buttonText, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, homeNotifyResponse.buttonText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) homeNotifyResponse.playbook, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, homeNotifyResponse.playbook);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || homeNotifyResponse.actionParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], homeNotifyResponse.actionParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) homeNotifyResponse.action, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, homeNotifyResponse.action);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) homeNotifyResponse.iconName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, homeNotifyResponse.iconName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || (num = homeNotifyResponse.bannerType) == null || num.intValue() != -1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.INSTANCE, homeNotifyResponse.bannerType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(homeNotifyResponse.allowClose, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, homeNotifyResponse.allowClose);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || homeNotifyResponse.btnTips != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BtnTips$$serializer.INSTANCE, homeNotifyResponse.btnTips);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || homeNotifyResponse.cta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, CtaData$$serializer.INSTANCE, homeNotifyResponse.cta);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && homeNotifyResponse.playbookCtaDialogConfigurationModel == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, ButtonDialogData$$serializer.INSTANCE, homeNotifyResponse.playbookCtaDialogConfigurationModel);
    }

    public HomeNotifyResponse(Boolean bool, String str, String str2, String str3, String str4, HashMap<String, String> map, String str5, String str6, Integer num, Boolean bool2, BtnTips btnTips, CtaData ctaData, ButtonDialogData buttonDialogData) {
        this.showNotify = bool;
        this.content = str;
        this.title = str2;
        this.buttonText = str3;
        this.playbook = str4;
        this.actionParams = map;
        this.action = str5;
        this.iconName = str6;
        this.bannerType = num;
        this.allowClose = bool2;
        this.btnTips = btnTips;
        this.cta = ctaData;
        this.playbookCtaDialogConfigurationModel = buttonDialogData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x008b: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r15v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x002c: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.HashMap) : (r20v0 java.util.HashMap))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r28v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r22v0 java.lang.String) : (""))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0044: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r23v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0050: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0054: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r24v0 java.lang.Boolean))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.BtnTips:?: TERNARY null = ((wrap:int:0x0059: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.BtnTips) : (r25v0 com.okinc.ok_kyc_core.data.remote.networkmodel.BtnTips))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CtaData:?: TERNARY null = ((wrap:int:0x0061: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CtaData) : (r26v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CtaData))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialogData:?: TERNARY null = ((wrap:int:0x0069: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r27v0 com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialogData) : (null com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialogData))
 A[MD:(java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.BtnTips, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaData, com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialogData):void (m)] (LINE:14) call: com.okinc.ok_kyc_core.data.remote.networkmodel.HomeNotifyResponse.<init>(java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.HashMap, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.BtnTips, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaData, com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialogData):void type: THIS */
    public /* synthetic */ HomeNotifyResponse(Boolean bool, String str, String str2, String str3, String str4, HashMap map, String str5, String str6, Integer num, Boolean bool2, BtnTips btnTips, CtaData ctaData, ButtonDialogData buttonDialogData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : map, (i & 64) != 0 ? "" : str5, (i & 128) == 0 ? str6 : "", (i & 256) != 0 ? -1 : num, (i & 512) != 0 ? Boolean.TRUE : bool2, (i & 1024) != 0 ? null : btnTips, (i & 2048) != 0 ? null : ctaData, (i & 4096) == 0 ? buttonDialogData : null);
    }
}
