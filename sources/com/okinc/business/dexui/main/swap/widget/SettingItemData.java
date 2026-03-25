package com.okinc.business.dexui.main.swap.widget;

import com.okinc.business.dexlogic.bean.ConsumeData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class SettingItemData {
    public static final int $stable = 8;
    private ConsumeData<String> autoSlip;
    private ConsumeData<String> content;
    private Object data;
    private ConsumeData<Boolean> isShowUnderLine;
    private boolean isSingleChain;
    private ConsumeData<Boolean> isTagImg;
    private ConsumeData<Boolean> isTitleHintImg;
    private String mevSupportedChainUrl;
    private ConsumeData<String> minSlip;
    private String minimumReceived;
    private ConsumeData<String> title;
    private SettingType type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SettingItemData() {
        this(null, null, null, null, null, null, null, null, null, null, false, null, 4095, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.minimumReceived;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.isSingleChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.mevSupportedChainUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> component2() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SettingType component3() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<Boolean> component4() {
        return this.isTitleHintImg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<Boolean> component5() {
        return this.isTagImg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> component6() {
        return this.autoSlip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> component7() {
        return this.minSlip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object component8() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<Boolean> component9() {
        return this.isShowUnderLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SettingItemData copy(@NotNull ConsumeData<String> consumeData, @NotNull ConsumeData<String> consumeData2, @NotNull SettingType settingType, @NotNull ConsumeData<Boolean> consumeData3, @NotNull ConsumeData<Boolean> consumeData4, @NotNull ConsumeData<String> consumeData5, @NotNull ConsumeData<String> consumeData6, Object obj, @NotNull ConsumeData<Boolean> consumeData7, @NotNull String str, boolean z, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        Intrinsics.checkNotNullParameter(consumeData2, "");
        Intrinsics.checkNotNullParameter(settingType, "");
        Intrinsics.checkNotNullParameter(consumeData3, "");
        Intrinsics.checkNotNullParameter(consumeData4, "");
        Intrinsics.checkNotNullParameter(consumeData5, "");
        Intrinsics.checkNotNullParameter(consumeData6, "");
        Intrinsics.checkNotNullParameter(consumeData7, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SettingItemData(consumeData, consumeData2, settingType, consumeData3, consumeData4, consumeData5, consumeData6, obj, consumeData7, str, z, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingItemData)) {
            return false;
        }
        SettingItemData settingItemData = (SettingItemData) obj;
        return Intrinsics.EZpvd(this.title, settingItemData.title) && Intrinsics.EZpvd(this.content, settingItemData.content) && this.type == settingItemData.type && Intrinsics.EZpvd(this.isTitleHintImg, settingItemData.isTitleHintImg) && Intrinsics.EZpvd(this.isTagImg, settingItemData.isTagImg) && Intrinsics.EZpvd(this.autoSlip, settingItemData.autoSlip) && Intrinsics.EZpvd(this.minSlip, settingItemData.minSlip) && Intrinsics.EZpvd(this.data, settingItemData.data) && Intrinsics.EZpvd(this.isShowUnderLine, settingItemData.isShowUnderLine) && Intrinsics.EZpvd((Object) this.minimumReceived, (Object) settingItemData.minimumReceived) && this.isSingleChain == settingItemData.isSingleChain && Intrinsics.EZpvd((Object) this.mevSupportedChainUrl, (Object) settingItemData.mevSupportedChainUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> getAutoSlip() {
        return this.autoSlip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMevSupportedChainUrl() {
        return this.mevSupportedChainUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> getMinSlip() {
        return this.minSlip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinimumReceived() {
        return this.minimumReceived;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SettingType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.title.hashCode();
        int iHashCode2 = this.content.hashCode();
        int iHashCode3 = this.type.hashCode();
        int iHashCode4 = this.isTitleHintImg.hashCode();
        int iHashCode5 = this.isTagImg.hashCode();
        int iHashCode6 = this.autoSlip.hashCode();
        int iHashCode7 = this.minSlip.hashCode();
        Object obj = this.data;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (obj == null ? 0 : obj.hashCode())) * 31) + this.isShowUnderLine.hashCode()) * 31) + this.minimumReceived.hashCode()) * 31) + Boolean.hashCode(this.isSingleChain)) * 31) + this.mevSupportedChainUrl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<Boolean> isShowUnderLine() {
        return this.isShowUnderLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSingleChain() {
        return this.isSingleChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<Boolean> isTagImg() {
        return this.isTagImg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<Boolean> isTitleHintImg() {
        return this.isTitleHintImg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoSlip(@NotNull ConsumeData<String> consumeData) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        this.autoSlip = consumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContent(@NotNull ConsumeData<String> consumeData) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        this.content = consumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setData(Object obj) {
        this.data = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMevSupportedChainUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mevSupportedChainUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinSlip(@NotNull ConsumeData<String> consumeData) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        this.minSlip = consumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinimumReceived(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minimumReceived = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowUnderLine(@NotNull ConsumeData<Boolean> consumeData) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        this.isShowUnderLine = consumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSingleChain(boolean z) {
        this.isSingleChain = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTagImg(@NotNull ConsumeData<Boolean> consumeData) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        this.isTagImg = consumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(@NotNull ConsumeData<String> consumeData) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        this.title = consumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitleHintImg(@NotNull ConsumeData<Boolean> consumeData) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        this.isTitleHintImg = consumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(@NotNull SettingType settingType) {
        Intrinsics.checkNotNullParameter(settingType, "");
        this.type = settingType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SettingItemData(title=" + this.title + ", content=" + this.content + ", type=" + this.type + ", isTitleHintImg=" + this.isTitleHintImg + ", isTagImg=" + this.isTagImg + ", autoSlip=" + this.autoSlip + ", minSlip=" + this.minSlip + ", data=" + this.data + ", isShowUnderLine=" + this.isShowUnderLine + ", minimumReceived=" + this.minimumReceived + ", isSingleChain=" + this.isSingleChain + ", mevSupportedChainUrl=" + this.mevSupportedChainUrl + ")";
    }

    public SettingItemData(@NotNull ConsumeData<String> consumeData, @NotNull ConsumeData<String> consumeData2, @NotNull SettingType settingType, @NotNull ConsumeData<Boolean> consumeData3, @NotNull ConsumeData<Boolean> consumeData4, @NotNull ConsumeData<String> consumeData5, @NotNull ConsumeData<String> consumeData6, Object obj, @NotNull ConsumeData<Boolean> consumeData7, @NotNull String str, boolean z, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        Intrinsics.checkNotNullParameter(consumeData2, "");
        Intrinsics.checkNotNullParameter(settingType, "");
        Intrinsics.checkNotNullParameter(consumeData3, "");
        Intrinsics.checkNotNullParameter(consumeData4, "");
        Intrinsics.checkNotNullParameter(consumeData5, "");
        Intrinsics.checkNotNullParameter(consumeData6, "");
        Intrinsics.checkNotNullParameter(consumeData7, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.title = consumeData;
        this.content = consumeData2;
        this.type = settingType;
        this.isTitleHintImg = consumeData3;
        this.isTagImg = consumeData4;
        this.autoSlip = consumeData5;
        this.minSlip = consumeData6;
        this.data = obj;
        this.isShowUnderLine = consumeData7;
        this.minimumReceived = str;
        this.isSingleChain = z;
        this.mevSupportedChainUrl = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a2: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.bean.ConsumeData:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000d: CONSTRUCTOR 
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (""))
  false
  (2 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:372) call: com.okinc.business.dexlogic.bean.ConsumeData.<init>(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r16v0 com.okinc.business.dexlogic.bean.ConsumeData))
  (wrap:com.okinc.business.dexlogic.bean.ConsumeData:?: TERNARY null = ((wrap:int:0x0013: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0019: CONSTRUCTOR 
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (""))
  false
  (2 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:373) call: com.okinc.business.dexlogic.bean.ConsumeData.<init>(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r17v0 com.okinc.business.dexlogic.bean.ConsumeData))
  (wrap:com.okinc.business.dexui.main.swap.widget.SettingItemData$SettingType:?: TERNARY null = ((wrap:int:0x001f: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0023: SGET  A[WRAPPED] (LINE:374) com.okinc.business.dexui.main.swap.widget.SettingItemData.SettingType.UNKNOWN com.okinc.business.dexui.main.swap.widget.SettingItemData$SettingType) : (r18v0 com.okinc.business.dexui.main.swap.widget.SettingItemData$SettingType))
  (wrap:com.okinc.business.dexlogic.bean.ConsumeData:?: TERNARY null = ((wrap:int:0x0028: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0030: CONSTRUCTOR 
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (wrap:java.lang.Boolean:0x002e: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean))
  false
  (2 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:375) call: com.okinc.business.dexlogic.bean.ConsumeData.<init>(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r19v0 com.okinc.business.dexlogic.bean.ConsumeData))
  (wrap:com.okinc.business.dexlogic.bean.ConsumeData:?: TERNARY null = ((wrap:int:0x0036: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003e: CONSTRUCTOR 
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (wrap:java.lang.Boolean:0x003c: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean))
  false
  (2 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:376) call: com.okinc.business.dexlogic.bean.ConsumeData.<init>(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r20v0 com.okinc.business.dexlogic.bean.ConsumeData))
  (wrap:com.okinc.business.dexlogic.bean.ConsumeData:?: TERNARY null = ((wrap:int:0x0044: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004a: CONSTRUCTOR 
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (""))
  false
  (2 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:377) call: com.okinc.business.dexlogic.bean.ConsumeData.<init>(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r21v0 com.okinc.business.dexlogic.bean.ConsumeData))
  (wrap:com.okinc.business.dexlogic.bean.ConsumeData:?: TERNARY null = ((wrap:int:0x0050: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0056: CONSTRUCTOR 
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (""))
  false
  (2 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:378) call: com.okinc.business.dexlogic.bean.ConsumeData.<init>(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r22v0 com.okinc.business.dexlogic.bean.ConsumeData))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x005c: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r23v0 java.lang.Object))
  (wrap:com.okinc.business.dexlogic.bean.ConsumeData:?: TERNARY null = ((wrap:int:0x0064: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006c: CONSTRUCTOR 
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (wrap:java.lang.Boolean:0x006a: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean))
  false
  (2 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:380) call: com.okinc.business.dexlogic.bean.ConsumeData.<init>(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r24v0 com.okinc.business.dexlogic.bean.ConsumeData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x007a: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r26v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0081: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (""))
 A[MD:(com.okinc.business.dexlogic.bean.ConsumeData<java.lang.String>, com.okinc.business.dexlogic.bean.ConsumeData<java.lang.String>, com.okinc.business.dexui.main.swap.widget.SettingItemData$SettingType, com.okinc.business.dexlogic.bean.ConsumeData<java.lang.Boolean>, com.okinc.business.dexlogic.bean.ConsumeData<java.lang.Boolean>, com.okinc.business.dexlogic.bean.ConsumeData<java.lang.String>, com.okinc.business.dexlogic.bean.ConsumeData<java.lang.String>, java.lang.Object, com.okinc.business.dexlogic.bean.ConsumeData<java.lang.Boolean>, java.lang.String, boolean, java.lang.String):void (m)] (LINE:371) call: com.okinc.business.dexui.main.swap.widget.SettingItemData.<init>(com.okinc.business.dexlogic.bean.ConsumeData, com.okinc.business.dexlogic.bean.ConsumeData, com.okinc.business.dexui.main.swap.widget.SettingItemData$SettingType, com.okinc.business.dexlogic.bean.ConsumeData, com.okinc.business.dexlogic.bean.ConsumeData, com.okinc.business.dexlogic.bean.ConsumeData, com.okinc.business.dexlogic.bean.ConsumeData, java.lang.Object, com.okinc.business.dexlogic.bean.ConsumeData, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ SettingItemData(ConsumeData consumeData, ConsumeData consumeData2, SettingType settingType, ConsumeData consumeData3, ConsumeData consumeData4, ConsumeData consumeData5, ConsumeData consumeData6, Object obj, ConsumeData consumeData7, String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ConsumeData((Object) "", false, 2, (DefaultConstructorMarker) null) : consumeData, (i & 2) != 0 ? new ConsumeData((Object) "", false, 2, (DefaultConstructorMarker) null) : consumeData2, (i & 4) != 0 ? SettingType.UNKNOWN : settingType, (i & 8) != 0 ? new ConsumeData((Object) Boolean.FALSE, false, 2, (DefaultConstructorMarker) null) : consumeData3, (i & 16) != 0 ? new ConsumeData((Object) Boolean.TRUE, false, 2, (DefaultConstructorMarker) null) : consumeData4, (i & 32) != 0 ? new ConsumeData((Object) "", false, 2, (DefaultConstructorMarker) null) : consumeData5, (i & 64) != 0 ? new ConsumeData((Object) "", false, 2, (DefaultConstructorMarker) null) : consumeData6, (i & 128) != 0 ? null : obj, (i & 256) != 0 ? new ConsumeData((Object) Boolean.FALSE, false, 2, (DefaultConstructorMarker) null) : consumeData7, (i & 512) != 0 ? "" : str, (i & 1024) == 0 ? z : false, (i & 2048) == 0 ? str2 : "");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SettingType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ SettingType[] $VALUES;
        public static final SettingType MINI_RECEIVE = new SettingType("MINI_RECEIVE", 0);
        public static final SettingType SLIPPAGE = new SettingType("SLIPPAGE", 1);
        public static final SettingType UNKNOWN = new SettingType("UNKNOWN", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ SettingType[] $values() {
            return new SettingType[]{MINI_RECEIVE, SLIPPAGE, UNKNOWN};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<SettingType> getEntries() {
            return $ENTRIES;
        }

        private SettingType(String str, int i) {
        }

        static {
            SettingType[] settingTypeArr$values = $values();
            $VALUES = settingTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(settingTypeArr$values);
        }

        public static SettingType valueOf(String str) {
            return (SettingType) Enum.valueOf(SettingType.class, str);
        }

        public static SettingType[] values() {
            return (SettingType[]) $VALUES.clone();
        }
    }
}
