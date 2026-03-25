package com.okinc.business.invest_biz.ui.widget;

import com.okinc.business.invest_biz.ui.bean.InvestConsumeData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class LeftRightInputData {
    public static final int $stable = 8;
    private String content;
    private InvestConsumeData<String> customHint;
    private Object data;
    private InvestConsumeData<String> hint;
    private InvestConsumeData<String> lable;
    private boolean setInput;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LeftRightInputData() {
        this(null, null, null, null, false, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.invest_biz.ui.widget.LeftRightInputData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LeftRightInputData copy$default(LeftRightInputData leftRightInputData, String str, InvestConsumeData investConsumeData, InvestConsumeData investConsumeData2, Object obj, boolean z, InvestConsumeData investConsumeData3, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = leftRightInputData.content;
        }
        if ((i & 2) != 0) {
            investConsumeData = leftRightInputData.hint;
        }
        InvestConsumeData investConsumeData4 = investConsumeData;
        if ((i & 4) != 0) {
            investConsumeData2 = leftRightInputData.lable;
        }
        InvestConsumeData investConsumeData5 = investConsumeData2;
        if ((i & 8) != 0) {
            obj = leftRightInputData.data;
        }
        Object obj3 = obj;
        if ((i & 16) != 0) {
            z = leftRightInputData.setInput;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            investConsumeData3 = leftRightInputData.customHint;
        }
        return leftRightInputData.copy(str, investConsumeData4, investConsumeData5, obj3, z2, investConsumeData3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestConsumeData<String> component2() {
        return this.hint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestConsumeData<String> component3() {
        return this.lable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object component4() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.setInput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestConsumeData<String> component6() {
        return this.customHint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LeftRightInputData copy(@NotNull String str, @NotNull InvestConsumeData<String> investConsumeData, @NotNull InvestConsumeData<String> investConsumeData2, Object obj, boolean z, @NotNull InvestConsumeData<String> investConsumeData3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(investConsumeData, "");
        Intrinsics.checkNotNullParameter(investConsumeData2, "");
        Intrinsics.checkNotNullParameter(investConsumeData3, "");
        return new LeftRightInputData(str, investConsumeData, investConsumeData2, obj, z, investConsumeData3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeftRightInputData)) {
            return false;
        }
        LeftRightInputData leftRightInputData = (LeftRightInputData) obj;
        return Intrinsics.EZpvd((Object) this.content, (Object) leftRightInputData.content) && Intrinsics.EZpvd(this.hint, leftRightInputData.hint) && Intrinsics.EZpvd(this.lable, leftRightInputData.lable) && Intrinsics.EZpvd(this.data, leftRightInputData.data) && this.setInput == leftRightInputData.setInput && Intrinsics.EZpvd(this.customHint, leftRightInputData.customHint);
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
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestConsumeData<String> getCustomHint() {
        return this.customHint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestConsumeData<String> getHint() {
        return this.hint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestConsumeData<String> getLable() {
        return this.lable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSetInput() {
        return this.setInput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.content.hashCode();
        int iHashCode2 = this.hint.hashCode();
        int iHashCode3 = this.lable.hashCode();
        Object obj = this.data;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (obj == null ? 0 : obj.hashCode())) * 31) + Boolean.hashCode(this.setInput)) * 31) + this.customHint.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.content = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCustomHint(@NotNull InvestConsumeData<String> investConsumeData) {
        Intrinsics.checkNotNullParameter(investConsumeData, "");
        this.customHint = investConsumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setData(Object obj) {
        this.data = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHint(@NotNull InvestConsumeData<String> investConsumeData) {
        Intrinsics.checkNotNullParameter(investConsumeData, "");
        this.hint = investConsumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLable(@NotNull InvestConsumeData<String> investConsumeData) {
        Intrinsics.checkNotNullParameter(investConsumeData, "");
        this.lable = investConsumeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSetInput(boolean z) {
        this.setInput = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LeftRightInputData(content=" + this.content + ", hint=" + this.hint + ", lable=" + this.lable + ", data=" + this.data + ", setInput=" + this.setInput + ", customHint=" + this.customHint + ")";
    }

    public LeftRightInputData(@NotNull String str, @NotNull InvestConsumeData<String> investConsumeData, @NotNull InvestConsumeData<String> investConsumeData2, Object obj, boolean z, @NotNull InvestConsumeData<String> investConsumeData3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(investConsumeData, "");
        Intrinsics.checkNotNullParameter(investConsumeData2, "");
        Intrinsics.checkNotNullParameter(investConsumeData3, "");
        this.content = str;
        this.hint = investConsumeData;
        this.lable = investConsumeData2;
        this.data = obj;
        this.setInput = z;
        this.customHint = investConsumeData3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0045: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.ui.bean.InvestConsumeData:?: TERNARY null = ((wrap:int:0x0009: ARITH (r17v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0012: CONSTRUCTOR 
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (""))
  false
  (2 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:211) call: com.okinc.business.invest_biz.ui.bean.InvestConsumeData.<init>(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r12v0 com.okinc.business.invest_biz.ui.bean.InvestConsumeData))
  (wrap:com.okinc.business.invest_biz.ui.bean.InvestConsumeData:?: TERNARY null = ((wrap:int:0x0017: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001d: CONSTRUCTOR 
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (""))
  false
  (2 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] call: com.okinc.business.invest_biz.ui.bean.InvestConsumeData.<init>(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r13v0 com.okinc.business.invest_biz.ui.bean.InvestConsumeData))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0022: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r14v0 java.lang.Object))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0029: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
  (wrap:com.okinc.business.invest_biz.ui.bean.InvestConsumeData:?: TERNARY null = ((wrap:int:0x0030: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0036: CONSTRUCTOR 
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (""))
  false
  (2 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:212) call: com.okinc.business.invest_biz.ui.bean.InvestConsumeData.<init>(java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r16v0 com.okinc.business.invest_biz.ui.bean.InvestConsumeData))
 A[MD:(java.lang.String, com.okinc.business.invest_biz.ui.bean.InvestConsumeData<java.lang.String>, com.okinc.business.invest_biz.ui.bean.InvestConsumeData<java.lang.String>, java.lang.Object, boolean, com.okinc.business.invest_biz.ui.bean.InvestConsumeData<java.lang.String>):void (m)] (LINE:211) call: com.okinc.business.invest_biz.ui.widget.LeftRightInputData.<init>(java.lang.String, com.okinc.business.invest_biz.ui.bean.InvestConsumeData, com.okinc.business.invest_biz.ui.bean.InvestConsumeData, java.lang.Object, boolean, com.okinc.business.invest_biz.ui.bean.InvestConsumeData):void type: THIS */
    public /* synthetic */ LeftRightInputData(String str, InvestConsumeData investConsumeData, InvestConsumeData investConsumeData2, Object obj, boolean z, InvestConsumeData investConsumeData3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new InvestConsumeData((Object) "", false, 2, (DefaultConstructorMarker) null) : investConsumeData, (i & 4) != 0 ? new InvestConsumeData((Object) "", false, 2, (DefaultConstructorMarker) null) : investConsumeData2, (i & 8) != 0 ? null : obj, (i & 16) != 0 ? false : z, (i & 32) != 0 ? new InvestConsumeData((Object) "", false, 2, (DefaultConstructorMarker) null) : investConsumeData3);
    }
}
