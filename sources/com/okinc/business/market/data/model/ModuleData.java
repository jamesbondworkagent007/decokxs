package com.okinc.business.market.data.model;

import com.okinc.business.market.common.constants.StringBooleanType;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class ModuleData {
    public final String averagePriceChange;
    public final Integer categoryModuleId;
    public final Integer categoryType;
    public final Integer dataId;
    public final String deepLink;
    public final String descriptionHidden;
    public final StringBooleanType isBoostModule;
    public final String moduleDarkBackgroundUrl;
    public final String moduleDescription;
    public final String moduleLightBackgroundUrl;
    public final String moduleName;
    public final String moduleNameEnglish;
    public final Integer moduleType;
    public final String pushChannel1H;
    public final String pushChannel24H;
    public final String pushChannel4H;
    public final String pushChannel5Min;
    public final Integer rank;
    public final ShareLinkData shareLinkVO;
    public final Integer status;
    public final String tagKey;
    public final List<String> top3TokenLogoList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, StringBooleanType.Companion.serializer(), null, null, null, new ArrayListSerializer(BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ModuleData() {
        this((Integer) null, (Integer) null, (StringBooleanType) null, (String) null, (String) null, (String) null, (List) null, (Integer) null, (Integer) null, (String) null, (Integer) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ShareLinkData) null, 4194303, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer AEQbTJ() {
        return this.dataId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.moduleDarkBackgroundUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.moduleName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer AkhnZx() {
        return this.moduleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StringBooleanType AuCTel() {
        return this.isBoostModule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.pushChannel1H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ModuleData EZpvd(Integer num, Integer num2, StringBooleanType stringBooleanType, String str, String str2, String str3, List<String> list, Integer num3, Integer num4, String str4, Integer num5, String str5, Integer num6, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, ShareLinkData shareLinkData) {
        return new ModuleData(num, num2, stringBooleanType, str, str2, str3, list, num3, num4, str4, num5, str5, num6, str6, str7, str8, str9, str10, str11, str12, str13, shareLinkData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.descriptionHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.averagePriceChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer copydefault() {
        return this.categoryType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.moduleNameEnglish;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String ejfBZ() {
        return this.tagKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModuleData)) {
            return false;
        }
        ModuleData moduleData = (ModuleData) obj;
        return Intrinsics.EZpvd(this.moduleType, moduleData.moduleType) && Intrinsics.EZpvd(this.dataId, moduleData.dataId) && this.isBoostModule == moduleData.isBoostModule && Intrinsics.EZpvd((Object) this.moduleName, (Object) moduleData.moduleName) && Intrinsics.EZpvd((Object) this.moduleNameEnglish, (Object) moduleData.moduleNameEnglish) && Intrinsics.EZpvd((Object) this.averagePriceChange, (Object) moduleData.averagePriceChange) && Intrinsics.EZpvd(this.top3TokenLogoList, moduleData.top3TokenLogoList) && Intrinsics.EZpvd(this.rank, moduleData.rank) && Intrinsics.EZpvd(this.status, moduleData.status) && Intrinsics.EZpvd((Object) this.deepLink, (Object) moduleData.deepLink) && Intrinsics.EZpvd(this.categoryType, moduleData.categoryType) && Intrinsics.EZpvd((Object) this.descriptionHidden, (Object) moduleData.descriptionHidden) && Intrinsics.EZpvd(this.categoryModuleId, moduleData.categoryModuleId) && Intrinsics.EZpvd((Object) this.moduleDescription, (Object) moduleData.moduleDescription) && Intrinsics.EZpvd((Object) this.moduleDarkBackgroundUrl, (Object) moduleData.moduleDarkBackgroundUrl) && Intrinsics.EZpvd((Object) this.moduleLightBackgroundUrl, (Object) moduleData.moduleLightBackgroundUrl) && Intrinsics.EZpvd((Object) this.tagKey, (Object) moduleData.tagKey) && Intrinsics.EZpvd((Object) this.pushChannel24H, (Object) moduleData.pushChannel24H) && Intrinsics.EZpvd((Object) this.pushChannel4H, (Object) moduleData.pushChannel4H) && Intrinsics.EZpvd((Object) this.pushChannel1H, (Object) moduleData.pushChannel1H) && Intrinsics.EZpvd((Object) this.pushChannel5Min, (Object) moduleData.pushChannel5Min) && Intrinsics.EZpvd(this.shareLinkVO, moduleData.shareLinkVO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareLinkData fIwbmz() {
        return this.shareLinkVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> fJNWhG() {
        return this.top3TokenLogoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.pushChannel4H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.moduleDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.moduleType;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.dataId;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        StringBooleanType stringBooleanType = this.isBoostModule;
        int iHashCode3 = stringBooleanType == null ? 0 : stringBooleanType.hashCode();
        String str = this.moduleName;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.moduleNameEnglish;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.averagePriceChange;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        List<String> list = this.top3TokenLogoList;
        int iHashCode7 = list == null ? 0 : list.hashCode();
        Integer num3 = this.rank;
        int iHashCode8 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.status;
        int iHashCode9 = num4 == null ? 0 : num4.hashCode();
        String str4 = this.deepLink;
        int iHashCode10 = str4 == null ? 0 : str4.hashCode();
        Integer num5 = this.categoryType;
        int iHashCode11 = num5 == null ? 0 : num5.hashCode();
        String str5 = this.descriptionHidden;
        int iHashCode12 = str5 == null ? 0 : str5.hashCode();
        Integer num6 = this.categoryModuleId;
        int iHashCode13 = num6 == null ? 0 : num6.hashCode();
        String str6 = this.moduleDescription;
        int iHashCode14 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.moduleDarkBackgroundUrl;
        int iHashCode15 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.moduleLightBackgroundUrl;
        int iHashCode16 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.tagKey;
        int iHashCode17 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.pushChannel24H;
        int iHashCode18 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.pushChannel4H;
        int iHashCode19 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.pushChannel1H;
        int iHashCode20 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.pushChannel5Min;
        int iHashCode21 = str13 == null ? 0 : str13.hashCode();
        ShareLinkData shareLinkData = this.shareLinkVO;
        return (((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + (shareLinkData == null ? 0 : shareLinkData.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.pushChannel24H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ModuleData(moduleType=" + this.moduleType + ", dataId=" + this.dataId + ", isBoostModule=" + this.isBoostModule + ", moduleName=" + this.moduleName + ", moduleNameEnglish=" + this.moduleNameEnglish + ", averagePriceChange=" + this.averagePriceChange + ", top3TokenLogoList=" + this.top3TokenLogoList + ", rank=" + this.rank + ", status=" + this.status + ", deepLink=" + this.deepLink + ", categoryType=" + this.categoryType + ", descriptionHidden=" + this.descriptionHidden + ", categoryModuleId=" + this.categoryModuleId + ", moduleDescription=" + this.moduleDescription + ", moduleDarkBackgroundUrl=" + this.moduleDarkBackgroundUrl + ", moduleLightBackgroundUrl=" + this.moduleLightBackgroundUrl + ", tagKey=" + this.tagKey + ", pushChannel24H=" + this.pushChannel24H + ", pushChannel4H=" + this.pushChannel4H + ", pushChannel1H=" + this.pushChannel1H + ", pushChannel5Min=" + this.pushChannel5Min + ", shareLinkVO=" + this.shareLinkVO + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.moduleLightBackgroundUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.pushChannel5Min;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.ModuleData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ModuleData> serializer() {
            return ModuleData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ModuleData(int i, Integer num, Integer num2, StringBooleanType stringBooleanType, String str, String str2, String str3, List list, Integer num3, Integer num4, String str4, Integer num5, String str5, Integer num6, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, ShareLinkData shareLinkData, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.moduleType = null;
        } else {
            this.moduleType = num;
        }
        if ((i & 2) == 0) {
            this.dataId = null;
        } else {
            this.dataId = num2;
        }
        if ((i & 4) == 0) {
            this.isBoostModule = null;
        } else {
            this.isBoostModule = stringBooleanType;
        }
        if ((i & 8) == 0) {
            this.moduleName = null;
        } else {
            this.moduleName = str;
        }
        if ((i & 16) == 0) {
            this.moduleNameEnglish = null;
        } else {
            this.moduleNameEnglish = str2;
        }
        if ((i & 32) == 0) {
            this.averagePriceChange = null;
        } else {
            this.averagePriceChange = str3;
        }
        if ((i & 64) == 0) {
            this.top3TokenLogoList = null;
        } else {
            this.top3TokenLogoList = list;
        }
        if ((i & 128) == 0) {
            this.rank = null;
        } else {
            this.rank = num3;
        }
        if ((i & 256) == 0) {
            this.status = null;
        } else {
            this.status = num4;
        }
        if ((i & 512) == 0) {
            this.deepLink = null;
        } else {
            this.deepLink = str4;
        }
        if ((i & 1024) == 0) {
            this.categoryType = null;
        } else {
            this.categoryType = num5;
        }
        if ((i & 2048) == 0) {
            this.descriptionHidden = null;
        } else {
            this.descriptionHidden = str5;
        }
        if ((i & 4096) == 0) {
            this.categoryModuleId = null;
        } else {
            this.categoryModuleId = num6;
        }
        if ((i & 8192) == 0) {
            this.moduleDescription = null;
        } else {
            this.moduleDescription = str6;
        }
        if ((i & 16384) == 0) {
            this.moduleDarkBackgroundUrl = null;
        } else {
            this.moduleDarkBackgroundUrl = str7;
        }
        if ((32768 & i) == 0) {
            this.moduleLightBackgroundUrl = null;
        } else {
            this.moduleLightBackgroundUrl = str8;
        }
        if ((65536 & i) == 0) {
            this.tagKey = null;
        } else {
            this.tagKey = str9;
        }
        if ((131072 & i) == 0) {
            this.pushChannel24H = null;
        } else {
            this.pushChannel24H = str10;
        }
        if ((262144 & i) == 0) {
            this.pushChannel4H = null;
        } else {
            this.pushChannel4H = str11;
        }
        if ((524288 & i) == 0) {
            this.pushChannel1H = null;
        } else {
            this.pushChannel1H = str12;
        }
        if ((1048576 & i) == 0) {
            this.pushChannel5Min = null;
        } else {
            this.pushChannel5Min = str13;
        }
        if ((i & 2097152) == 0) {
            this.shareLinkVO = null;
        } else {
            this.shareLinkVO = shareLinkData;
        }
    }

    public static final /* synthetic */ void OLrzqt(ModuleData moduleData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || moduleData.moduleType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, moduleData.moduleType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || moduleData.dataId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, moduleData.dataId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || moduleData.isBoostModule != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], moduleData.isBoostModule);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || moduleData.moduleName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, moduleData.moduleName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || moduleData.moduleNameEnglish != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, moduleData.moduleNameEnglish);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || moduleData.averagePriceChange != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, moduleData.averagePriceChange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || moduleData.top3TokenLogoList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], moduleData.top3TokenLogoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || moduleData.rank != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, moduleData.rank);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || moduleData.status != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.INSTANCE, moduleData.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || moduleData.deepLink != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, moduleData.deepLink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || moduleData.categoryType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.INSTANCE, moduleData.categoryType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || moduleData.descriptionHidden != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, moduleData.descriptionHidden);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || moduleData.categoryModuleId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.INSTANCE, moduleData.categoryModuleId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || moduleData.moduleDescription != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, moduleData.moduleDescription);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || moduleData.moduleDarkBackgroundUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, moduleData.moduleDarkBackgroundUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || moduleData.moduleLightBackgroundUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, moduleData.moduleLightBackgroundUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || moduleData.tagKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, moduleData.tagKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || moduleData.pushChannel24H != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, moduleData.pushChannel24H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || moduleData.pushChannel4H != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, moduleData.pushChannel4H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || moduleData.pushChannel1H != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, moduleData.pushChannel1H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || moduleData.pushChannel5Min != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, moduleData.pushChannel5Min);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) && moduleData.shareLinkVO == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, ShareLinkData$$serializer.INSTANCE, moduleData.shareLinkVO);
    }

    public ModuleData(Integer num, Integer num2, StringBooleanType stringBooleanType, String str, String str2, String str3, List<String> list, Integer num3, Integer num4, String str4, Integer num5, String str5, Integer num6, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, ShareLinkData shareLinkData) {
        this.moduleType = num;
        this.dataId = num2;
        this.isBoostModule = stringBooleanType;
        this.moduleName = str;
        this.moduleNameEnglish = str2;
        this.averagePriceChange = str3;
        this.top3TokenLogoList = list;
        this.rank = num3;
        this.status = num4;
        this.deepLink = str4;
        this.categoryType = num5;
        this.descriptionHidden = str5;
        this.categoryModuleId = num6;
        this.moduleDescription = str6;
        this.moduleDarkBackgroundUrl = str7;
        this.moduleLightBackgroundUrl = str8;
        this.tagKey = str9;
        this.pushChannel24H = str10;
        this.pushChannel4H = str11;
        this.pushChannel1H = str12;
        this.pushChannel5Min = str13;
        this.shareLinkVO = shareLinkData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00f5: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r46v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r24v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000a: ARITH (r46v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r25v0 java.lang.Integer))
  (wrap:com.okinc.business.market.common.constants.StringBooleanType:?: TERNARY null = ((wrap:int:0x0012: ARITH (r46v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.common.constants.StringBooleanType) : (r26v0 com.okinc.business.market.common.constants.StringBooleanType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r46v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r46v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r46v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0032: ARITH (r46v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r30v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x003a: ARITH (r46v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r31v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0042: ARITH (r46v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r32v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r46v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0052: ARITH (r46v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r34v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r46v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0062: ARITH (r46v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r36v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r46v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r46v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r46v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r46v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0093: ARITH (r46v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009e: ARITH (r46v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r46v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r46v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:com.okinc.business.market.data.model.ShareLinkData:?: TERNARY null = ((wrap:int:0x00bf: ARITH (r46v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.data.model.ShareLinkData) : (r45v0 com.okinc.business.market.data.model.ShareLinkData))
 A[MD:(java.lang.Integer, java.lang.Integer, com.okinc.business.market.common.constants.StringBooleanType, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.data.model.ShareLinkData):void (m)] (LINE:8) call: com.okinc.business.market.data.model.ModuleData.<init>(java.lang.Integer, java.lang.Integer, com.okinc.business.market.common.constants.StringBooleanType, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.data.model.ShareLinkData):void type: THIS */
    public /* synthetic */ ModuleData(Integer num, Integer num2, StringBooleanType stringBooleanType, String str, String str2, String str3, List list, Integer num3, Integer num4, String str4, Integer num5, String str5, Integer num6, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, ShareLinkData shareLinkData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : stringBooleanType, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? null : num4, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : num5, (i & 2048) != 0 ? null : str5, (i & 4096) != 0 ? null : num6, (i & 8192) != 0 ? null : str6, (i & 16384) != 0 ? null : str7, (i & 32768) != 0 ? null : str8, (i & 65536) != 0 ? null : str9, (i & 131072) != 0 ? null : str10, (i & 262144) != 0 ? null : str11, (i & 524288) != 0 ? null : str12, (i & 1048576) != 0 ? null : str13, (i & 2097152) != 0 ? null : shareLinkData);
    }
}
