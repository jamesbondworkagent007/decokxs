package com.okinc.business.market.data.model;

import com.okinc.business.dexlogic.bean.ShareLinkVO;
import com.okinc.business.market.common.constants.StringBooleanType;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ModuleDetailData {
    public static final int $stable = 8;
    private final String chainId;
    private final Integer descriptionHidden;
    private final StringBooleanType isBoostModule;
    private final String moduleAvgPriceChange;
    private final String moduleDarkBackgroundUrl;
    private final String moduleDescription;
    private final String moduleGainersProportion;
    private final String moduleLightBackgroundUrl;
    private final List<ModuleBoostTokenData> moduleListedTokenList;
    private final String moduleLosersProportion;
    private final String moduleMarketCap;
    private final String moduleName;
    private final String moduleTotalTokenNum;
    private final String moduleType;
    private final String moduleVolume;
    private final String pushChannel;
    private final ShareLinkVO shareLinkVO;
    private final String tagKey;
    private final String timeType;
    private final List<ModuleTokenData> tokenList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ModuleDetailData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.moduleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.moduleVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.pushChannel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.timeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ModuleTokenData> component14() {
        return this.tokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareLinkVO component15() {
        return this.shareLinkVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.tagKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.moduleDarkBackgroundUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.moduleLightBackgroundUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StringBooleanType component19() {
        return this.isBoostModule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.descriptionHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ModuleBoostTokenData> component20() {
        return this.moduleListedTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.moduleAvgPriceChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.moduleDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.moduleGainersProportion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.moduleLosersProportion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.moduleMarketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.moduleName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.moduleTotalTokenNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ModuleDetailData copy(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List<ModuleTokenData> list, ShareLinkVO shareLinkVO, String str13, String str14, String str15, StringBooleanType stringBooleanType, List<ModuleBoostTokenData> list2) {
        return new ModuleDetailData(str, num, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, list, shareLinkVO, str13, str14, str15, stringBooleanType, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModuleDetailData)) {
            return false;
        }
        ModuleDetailData moduleDetailData = (ModuleDetailData) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) moduleDetailData.chainId) && Intrinsics.EZpvd(this.descriptionHidden, moduleDetailData.descriptionHidden) && Intrinsics.EZpvd((Object) this.moduleAvgPriceChange, (Object) moduleDetailData.moduleAvgPriceChange) && Intrinsics.EZpvd((Object) this.moduleDescription, (Object) moduleDetailData.moduleDescription) && Intrinsics.EZpvd((Object) this.moduleGainersProportion, (Object) moduleDetailData.moduleGainersProportion) && Intrinsics.EZpvd((Object) this.moduleLosersProportion, (Object) moduleDetailData.moduleLosersProportion) && Intrinsics.EZpvd((Object) this.moduleMarketCap, (Object) moduleDetailData.moduleMarketCap) && Intrinsics.EZpvd((Object) this.moduleName, (Object) moduleDetailData.moduleName) && Intrinsics.EZpvd((Object) this.moduleTotalTokenNum, (Object) moduleDetailData.moduleTotalTokenNum) && Intrinsics.EZpvd((Object) this.moduleType, (Object) moduleDetailData.moduleType) && Intrinsics.EZpvd((Object) this.moduleVolume, (Object) moduleDetailData.moduleVolume) && Intrinsics.EZpvd((Object) this.pushChannel, (Object) moduleDetailData.pushChannel) && Intrinsics.EZpvd((Object) this.timeType, (Object) moduleDetailData.timeType) && Intrinsics.EZpvd(this.tokenList, moduleDetailData.tokenList) && Intrinsics.EZpvd(this.shareLinkVO, moduleDetailData.shareLinkVO) && Intrinsics.EZpvd((Object) this.tagKey, (Object) moduleDetailData.tagKey) && Intrinsics.EZpvd((Object) this.moduleDarkBackgroundUrl, (Object) moduleDetailData.moduleDarkBackgroundUrl) && Intrinsics.EZpvd((Object) this.moduleLightBackgroundUrl, (Object) moduleDetailData.moduleLightBackgroundUrl) && this.isBoostModule == moduleDetailData.isBoostModule && Intrinsics.EZpvd(this.moduleListedTokenList, moduleDetailData.moduleListedTokenList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getDescriptionHidden() {
        return this.descriptionHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getModuleAvgPriceChange() {
        return this.moduleAvgPriceChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getModuleDarkBackgroundUrl() {
        return this.moduleDarkBackgroundUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getModuleDescription() {
        return this.moduleDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getModuleGainersProportion() {
        return this.moduleGainersProportion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getModuleLightBackgroundUrl() {
        return this.moduleLightBackgroundUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ModuleBoostTokenData> getModuleListedTokenList() {
        return this.moduleListedTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getModuleLosersProportion() {
        return this.moduleLosersProportion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getModuleMarketCap() {
        return this.moduleMarketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getModuleName() {
        return this.moduleName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getModuleTotalTokenNum() {
        return this.moduleTotalTokenNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getModuleType() {
        return this.moduleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getModuleVolume() {
        return this.moduleVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPushChannel() {
        return this.pushChannel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareLinkVO getShareLinkVO() {
        return this.shareLinkVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTagKey() {
        return this.tagKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeType() {
        return this.timeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ModuleTokenData> getTokenList() {
        return this.tokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.chainId;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.descriptionHidden;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str2 = this.moduleAvgPriceChange;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.moduleDescription;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.moduleGainersProportion;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.moduleLosersProportion;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.moduleMarketCap;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.moduleName;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.moduleTotalTokenNum;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.moduleType;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.moduleVolume;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.pushChannel;
        int iHashCode12 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.timeType;
        int iHashCode13 = str12 == null ? 0 : str12.hashCode();
        List<ModuleTokenData> list = this.tokenList;
        int iHashCode14 = list == null ? 0 : list.hashCode();
        ShareLinkVO shareLinkVO = this.shareLinkVO;
        int iHashCode15 = shareLinkVO == null ? 0 : shareLinkVO.hashCode();
        String str13 = this.tagKey;
        int iHashCode16 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.moduleDarkBackgroundUrl;
        int iHashCode17 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.moduleLightBackgroundUrl;
        int iHashCode18 = str15 == null ? 0 : str15.hashCode();
        StringBooleanType stringBooleanType = this.isBoostModule;
        int iHashCode19 = stringBooleanType == null ? 0 : stringBooleanType.hashCode();
        List<ModuleBoostTokenData> list2 = this.moduleListedTokenList;
        return (((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + (list2 == null ? 0 : list2.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StringBooleanType isBoostModule() {
        return this.isBoostModule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ModuleDetailData(chainId=" + this.chainId + ", descriptionHidden=" + this.descriptionHidden + ", moduleAvgPriceChange=" + this.moduleAvgPriceChange + ", moduleDescription=" + this.moduleDescription + ", moduleGainersProportion=" + this.moduleGainersProportion + ", moduleLosersProportion=" + this.moduleLosersProportion + ", moduleMarketCap=" + this.moduleMarketCap + ", moduleName=" + this.moduleName + ", moduleTotalTokenNum=" + this.moduleTotalTokenNum + ", moduleType=" + this.moduleType + ", moduleVolume=" + this.moduleVolume + ", pushChannel=" + this.pushChannel + ", timeType=" + this.timeType + ", tokenList=" + this.tokenList + ", shareLinkVO=" + this.shareLinkVO + ", tagKey=" + this.tagKey + ", moduleDarkBackgroundUrl=" + this.moduleDarkBackgroundUrl + ", moduleLightBackgroundUrl=" + this.moduleLightBackgroundUrl + ", isBoostModule=" + this.isBoostModule + ", moduleListedTokenList=" + this.moduleListedTokenList + ")";
    }

    public ModuleDetailData(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List<ModuleTokenData> list, ShareLinkVO shareLinkVO, String str13, String str14, String str15, StringBooleanType stringBooleanType, List<ModuleBoostTokenData> list2) {
        this.chainId = str;
        this.descriptionHidden = num;
        this.moduleAvgPriceChange = str2;
        this.moduleDescription = str3;
        this.moduleGainersProportion = str4;
        this.moduleLosersProportion = str5;
        this.moduleMarketCap = str6;
        this.moduleName = str7;
        this.moduleTotalTokenNum = str8;
        this.moduleType = str9;
        this.moduleVolume = str10;
        this.pushChannel = str11;
        this.timeType = str12;
        this.tokenList = list;
        this.shareLinkVO = shareLinkVO;
        this.tagKey = str13;
        this.moduleDarkBackgroundUrl = str14;
        this.moduleLightBackgroundUrl = str15;
        this.isBoostModule = stringBooleanType;
        this.moduleListedTokenList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00db: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r42v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000a: ARITH (r42v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r23v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r42v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r42v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r42v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r42v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r42v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r42v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r42v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r42v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r42v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r42v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r42v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x006a: ARITH (r42v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r35v0 java.util.List))
  (wrap:com.okinc.business.dexlogic.bean.ShareLinkVO:?: TERNARY null = ((wrap:int:0x0072: ARITH (r42v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.ShareLinkVO) : (r36v0 com.okinc.business.dexlogic.bean.ShareLinkVO))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r42v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r42v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0093: ARITH (r42v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:com.okinc.business.market.common.constants.StringBooleanType:?: TERNARY null = ((wrap:int:0x009e: ARITH (r42v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.common.constants.StringBooleanType) : (r40v0 com.okinc.business.market.common.constants.StringBooleanType))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r42v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r41v0 java.util.List))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.data.model.ModuleTokenData>, com.okinc.business.dexlogic.bean.ShareLinkVO, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.StringBooleanType, java.util.List<com.okinc.business.market.data.model.ModuleBoostTokenData>):void (m)] (LINE:8) call: com.okinc.business.market.data.model.ModuleDetailData.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.business.dexlogic.bean.ShareLinkVO, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.StringBooleanType, java.util.List):void type: THIS */
    public /* synthetic */ ModuleDetailData(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List list, ShareLinkVO shareLinkVO, String str13, String str14, String str15, StringBooleanType stringBooleanType, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : list, (i & 16384) != 0 ? null : shareLinkVO, (i & 32768) != 0 ? null : str13, (i & 65536) != 0 ? null : str14, (i & 131072) != 0 ? null : str15, (i & 262144) != 0 ? null : stringBooleanType, (i & 524288) != 0 ? null : list2);
    }
}
