package com.okinc.business.dexlogic.main.swap.trade.input.bean;

import com.okinc.business.dexlogic.bean.ConsumeData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class HorizontalLabelData {
    public static final int $stable = 8;
    private ConsumeData<String> action;
    private ConsumeData<String> addFunds;
    private ConsumeData<String> availableAmountNum;
    private ConsumeData<String> chainLogoUrl;
    private ConsumeData<String> chainText;
    private final boolean clickMax;
    private ConsumeData<String> content;
    private Object data;
    private ConsumeData<Boolean> error;
    private ConsumeData<String> errorContent;
    private boolean needShowAction;
    private boolean showAddFunds;
    private boolean showMax;
    private ConsumeData<String> title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HorizontalLabelData() {
        this(null, null, null, null, null, null, false, null, null, null, null, false, false, false, 16383, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> component10() {
        return this.addFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object component11() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.showMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component13() {
        return this.showAddFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.clickMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> component2() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> component3() {
        return this.availableAmountNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> component4() {
        return this.action;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<Boolean> component5() {
        return this.error;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> component6() {
        return this.errorContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.needShowAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> component8() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> component9() {
        return this.chainText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HorizontalLabelData copy(@NotNull ConsumeData<String> consumeData, @NotNull ConsumeData<String> consumeData2, @NotNull ConsumeData<String> consumeData3, @NotNull ConsumeData<String> consumeData4, @NotNull ConsumeData<Boolean> consumeData5, @NotNull ConsumeData<String> consumeData6, boolean z, @NotNull ConsumeData<String> consumeData7, @NotNull ConsumeData<String> consumeData8, @NotNull ConsumeData<String> consumeData9, Object obj, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        Intrinsics.checkNotNullParameter(consumeData2, "");
        Intrinsics.checkNotNullParameter(consumeData3, "");
        Intrinsics.checkNotNullParameter(consumeData4, "");
        Intrinsics.checkNotNullParameter(consumeData5, "");
        Intrinsics.checkNotNullParameter(consumeData6, "");
        Intrinsics.checkNotNullParameter(consumeData7, "");
        Intrinsics.checkNotNullParameter(consumeData8, "");
        Intrinsics.checkNotNullParameter(consumeData9, "");
        return new HorizontalLabelData(consumeData, consumeData2, consumeData3, consumeData4, consumeData5, consumeData6, z, consumeData7, consumeData8, consumeData9, obj, z2, z3, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HorizontalLabelData)) {
            return false;
        }
        HorizontalLabelData horizontalLabelData = (HorizontalLabelData) obj;
        return Intrinsics.EZpvd(this.title, horizontalLabelData.title) && Intrinsics.EZpvd(this.content, horizontalLabelData.content) && Intrinsics.EZpvd(this.availableAmountNum, horizontalLabelData.availableAmountNum) && Intrinsics.EZpvd(this.action, horizontalLabelData.action) && Intrinsics.EZpvd(this.error, horizontalLabelData.error) && Intrinsics.EZpvd(this.errorContent, horizontalLabelData.errorContent) && this.needShowAction == horizontalLabelData.needShowAction && Intrinsics.EZpvd(this.chainLogoUrl, horizontalLabelData.chainLogoUrl) && Intrinsics.EZpvd(this.chainText, horizontalLabelData.chainText) && Intrinsics.EZpvd(this.addFunds, horizontalLabelData.addFunds) && Intrinsics.EZpvd(this.data, horizontalLabelData.data) && this.showMax == horizontalLabelData.showMax && this.showAddFunds == horizontalLabelData.showAddFunds && this.clickMax == horizontalLabelData.clickMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> getAction() {
        return this.action;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> getAddFunds() {
        return this.addFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> getAvailableAmountNum() {
        return this.availableAmountNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final <T> T getCacheData() {
        T t = (T) this.data;
        if (t == null) {
            return null;
        }
        return t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> getChainLogoUrl() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> getChainText() {
        return this.chainText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getClickMax() {
        return this.clickMax;
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
    public final ConsumeData<Boolean> getError() {
        return this.error;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> getErrorContent() {
        return this.errorContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedShowAction() {
        return this.needShowAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowAddFunds() {
        return this.showAddFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowMax() {
        return this.showMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConsumeData<String> getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.title.hashCode();
        int iHashCode2 = this.content.hashCode();
        int iHashCode3 = this.availableAmountNum.hashCode();
        int iHashCode4 = this.action.hashCode();
        int iHashCode5 = this.error.hashCode();
        int iHashCode6 = this.errorContent.hashCode();
        int iHashCode7 = Boolean.hashCode(this.needShowAction);
        int iHashCode8 = this.chainLogoUrl.hashCode();
        int iHashCode9 = this.chainText.hashCode();
        int iHashCode10 = this.addFunds.hashCode();
        Object obj = this.data;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (obj == null ? 0 : obj.hashCode())) * 31) + Boolean.hashCode(this.showMax)) * 31) + Boolean.hashCode(this.showAddFunds)) * 31) + Boolean.hashCode(this.clickMax);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAction(@NotNull ConsumeData<String> consumeData) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        this.action = consumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddFunds(@NotNull ConsumeData<String> consumeData) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        this.addFunds = consumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvailableAmountNum(@NotNull ConsumeData<String> consumeData) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        this.availableAmountNum = consumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainLogoUrl(@NotNull ConsumeData<String> consumeData) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        this.chainLogoUrl = consumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainText(@NotNull ConsumeData<String> consumeData) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        this.chainText = consumeData;
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
    public final void setError(@NotNull ConsumeData<Boolean> consumeData) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        this.error = consumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setErrorContent(@NotNull ConsumeData<String> consumeData) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        this.errorContent = consumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedShowAction(boolean z) {
        this.needShowAction = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowAddFunds(boolean z) {
        this.showAddFunds = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowMax(boolean z) {
        this.showMax = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(@NotNull ConsumeData<String> consumeData) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        this.title = consumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HorizontalLabelData(title=" + this.title + ", content=" + this.content + ", availableAmountNum=" + this.availableAmountNum + ", action=" + this.action + ", error=" + this.error + ", errorContent=" + this.errorContent + ", needShowAction=" + this.needShowAction + ", chainLogoUrl=" + this.chainLogoUrl + ", chainText=" + this.chainText + ", addFunds=" + this.addFunds + ", data=" + this.data + ", showMax=" + this.showMax + ", showAddFunds=" + this.showAddFunds + ", clickMax=" + this.clickMax + ")";
    }

    public HorizontalLabelData(@NotNull ConsumeData<String> consumeData, @NotNull ConsumeData<String> consumeData2, @NotNull ConsumeData<String> consumeData3, @NotNull ConsumeData<String> consumeData4, @NotNull ConsumeData<Boolean> consumeData5, @NotNull ConsumeData<String> consumeData6, boolean z, @NotNull ConsumeData<String> consumeData7, @NotNull ConsumeData<String> consumeData8, @NotNull ConsumeData<String> consumeData9, Object obj, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(consumeData, "");
        Intrinsics.checkNotNullParameter(consumeData2, "");
        Intrinsics.checkNotNullParameter(consumeData3, "");
        Intrinsics.checkNotNullParameter(consumeData4, "");
        Intrinsics.checkNotNullParameter(consumeData5, "");
        Intrinsics.checkNotNullParameter(consumeData6, "");
        Intrinsics.checkNotNullParameter(consumeData7, "");
        Intrinsics.checkNotNullParameter(consumeData8, "");
        Intrinsics.checkNotNullParameter(consumeData9, "");
        this.title = consumeData;
        this.content = consumeData2;
        this.availableAmountNum = consumeData3;
        this.action = consumeData4;
        this.error = consumeData5;
        this.errorContent = consumeData6;
        this.needShowAction = z;
        this.chainLogoUrl = consumeData7;
        this.chainText = consumeData8;
        this.addFunds = consumeData9;
        this.data = obj;
        this.showMax = z2;
        this.showAddFunds = z3;
        this.clickMax = z4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b9: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.bean.ConsumeData:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000d: CONSTRUCTOR 
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (""))
  false
  (2 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:13) call: com.okinc.business.dexlogic.bean.ConsumeData.<init>(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r17v0 com.okinc.business.dexlogic.bean.ConsumeData))
  (wrap:com.okinc.business.dexlogic.bean.ConsumeData:?: TERNARY null = ((wrap:int:0x0013: ARITH (r31v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0019: CONSTRUCTOR 
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (""))
  false
  (2 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:14) call: com.okinc.business.dexlogic.bean.ConsumeData.<init>(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r18v0 com.okinc.business.dexlogic.bean.ConsumeData))
  (wrap:com.okinc.business.dexlogic.bean.ConsumeData:?: TERNARY null = ((wrap:int:0x001f: ARITH (r31v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0025: CONSTRUCTOR 
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (""))
  false
  (2 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:15) call: com.okinc.business.dexlogic.bean.ConsumeData.<init>(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r19v0 com.okinc.business.dexlogic.bean.ConsumeData))
  (wrap:com.okinc.business.dexlogic.bean.ConsumeData:?: TERNARY null = ((wrap:int:0x002b: ARITH (r31v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0031: CONSTRUCTOR 
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (""))
  false
  (2 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:16) call: com.okinc.business.dexlogic.bean.ConsumeData.<init>(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r20v0 com.okinc.business.dexlogic.bean.ConsumeData))
  (wrap:com.okinc.business.dexlogic.bean.ConsumeData:?: TERNARY null = ((wrap:int:0x0037: ARITH (r31v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003f: CONSTRUCTOR 
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (wrap:java.lang.Boolean:0x003d: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean))
  false
  (2 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:17) call: com.okinc.business.dexlogic.bean.ConsumeData.<init>(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r21v0 com.okinc.business.dexlogic.bean.ConsumeData))
  (wrap:com.okinc.business.dexlogic.bean.ConsumeData:?: TERNARY null = ((wrap:int:0x0045: ARITH (r31v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004b: CONSTRUCTOR 
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (""))
  false
  (2 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:18) call: com.okinc.business.dexlogic.bean.ConsumeData.<init>(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r22v0 com.okinc.business.dexlogic.bean.ConsumeData))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0051: ARITH (r31v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r23v0 boolean))
  (wrap:com.okinc.business.dexlogic.bean.ConsumeData:?: TERNARY null = ((wrap:int:0x0059: ARITH (r31v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005f: CONSTRUCTOR 
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (""))
  false
  (2 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:20) call: com.okinc.business.dexlogic.bean.ConsumeData.<init>(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r24v0 com.okinc.business.dexlogic.bean.ConsumeData))
  (wrap:com.okinc.business.dexlogic.bean.ConsumeData:?: TERNARY null = ((wrap:int:0x0065: ARITH (r31v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006b: CONSTRUCTOR 
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (""))
  false
  (2 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:21) call: com.okinc.business.dexlogic.bean.ConsumeData.<init>(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r25v0 com.okinc.business.dexlogic.bean.ConsumeData))
  (wrap:com.okinc.business.dexlogic.bean.ConsumeData:?: TERNARY null = ((wrap:int:0x0071: ARITH (r31v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0077: CONSTRUCTOR 
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (""))
  false
  (2 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:22) call: com.okinc.business.dexlogic.bean.ConsumeData.<init>(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r26v0 com.okinc.business.dexlogic.bean.ConsumeData))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x007d: ARITH (r31v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.Object) : (null java.lang.Object))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0084: ARITH (r31v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? true : (r28v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x008d: ARITH (r31v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r29v0 boolean) : false)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0094: ARITH (r31v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r30v0 boolean) : true)
 A[MD:(com.okinc.business.dexlogic.bean.ConsumeData<java.lang.String>, com.okinc.business.dexlogic.bean.ConsumeData<java.lang.String>, com.okinc.business.dexlogic.bean.ConsumeData<java.lang.String>, com.okinc.business.dexlogic.bean.ConsumeData<java.lang.String>, com.okinc.business.dexlogic.bean.ConsumeData<java.lang.Boolean>, com.okinc.business.dexlogic.bean.ConsumeData<java.lang.String>, boolean, com.okinc.business.dexlogic.bean.ConsumeData<java.lang.String>, com.okinc.business.dexlogic.bean.ConsumeData<java.lang.String>, com.okinc.business.dexlogic.bean.ConsumeData<java.lang.String>, java.lang.Object, boolean, boolean, boolean):void (m)] (LINE:12) call: com.okinc.business.dexlogic.main.swap.trade.input.bean.HorizontalLabelData.<init>(com.okinc.business.dexlogic.bean.ConsumeData, com.okinc.business.dexlogic.bean.ConsumeData, com.okinc.business.dexlogic.bean.ConsumeData, com.okinc.business.dexlogic.bean.ConsumeData, com.okinc.business.dexlogic.bean.ConsumeData, com.okinc.business.dexlogic.bean.ConsumeData, boolean, com.okinc.business.dexlogic.bean.ConsumeData, com.okinc.business.dexlogic.bean.ConsumeData, com.okinc.business.dexlogic.bean.ConsumeData, java.lang.Object, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ HorizontalLabelData(ConsumeData consumeData, ConsumeData consumeData2, ConsumeData consumeData3, ConsumeData consumeData4, ConsumeData consumeData5, ConsumeData consumeData6, boolean z, ConsumeData consumeData7, ConsumeData consumeData8, ConsumeData consumeData9, Object obj, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ConsumeData((Object) "", false, 2, (DefaultConstructorMarker) null) : consumeData, (i & 2) != 0 ? new ConsumeData((Object) "", false, 2, (DefaultConstructorMarker) null) : consumeData2, (i & 4) != 0 ? new ConsumeData((Object) "", false, 2, (DefaultConstructorMarker) null) : consumeData3, (i & 8) != 0 ? new ConsumeData((Object) "", false, 2, (DefaultConstructorMarker) null) : consumeData4, (i & 16) != 0 ? new ConsumeData((Object) Boolean.FALSE, false, 2, (DefaultConstructorMarker) null) : consumeData5, (i & 32) != 0 ? new ConsumeData((Object) "", false, 2, (DefaultConstructorMarker) null) : consumeData6, (i & 64) != 0 ? false : z, (i & 128) != 0 ? new ConsumeData((Object) "", false, 2, (DefaultConstructorMarker) null) : consumeData7, (i & 256) != 0 ? new ConsumeData((Object) "", false, 2, (DefaultConstructorMarker) null) : consumeData8, (i & 512) != 0 ? new ConsumeData((Object) "", false, 2, (DefaultConstructorMarker) null) : consumeData9, (i & 1024) == 0 ? obj : null, (i & 2048) != 0 ? true : z2, (i & 4096) == 0 ? z3 : false, (i & 8192) == 0 ? z4 : true);
    }

    public final String getAmountNum() {
        if (this.availableAmountNum.getData().length() != 0) {
            return this.availableAmountNum.getData();
        }
        Object obj = this.data;
        String str = obj instanceof String ? (String) obj : null;
        return str == null ? "" : str;
    }
}
