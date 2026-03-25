package com.okinc.unify_trade.biz;

import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class DropItemBean {
    public static final int DEFAULT_SUB_INDEX = -1;
    private final boolean canSelectIcon;
    private final Object data;
    private final String des;
    private boolean enable;
    private final int headerType;
    private String hintText;
    private final int icon;
    private int index;
    private boolean isShowDivide;
    private final boolean isUI20;
    private final boolean ivHelp;
    private Function1<? super ImageView, Unit> ivHelpCallBack;
    private final boolean ivSelect;
    private List<DropItemBean> subData;
    private int subIndex;
    private final String title;
    private int type;
    private String typeTitle;
    private final String uniqueKey;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.typeTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.isShowDivide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.des;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component14() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component15() {
        return this.headerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component16() {
        return this.canSelectIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component17() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component18() {
        return this.isUI20;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component19() {
        return this.ivSelect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.uniqueKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object component3() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.ivHelp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super android.widget.ImageView, kotlin.Unit>, kotlin.jvm.functions.Function1<android.widget.ImageView, kotlin.Unit> */
    public final Function1<ImageView, Unit> component5() {
        return this.ivHelpCallBack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DropItemBean> component6() {
        return this.subData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.subIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.hintText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.enable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DropItemBean copy(@NotNull String str, @NotNull String str2, Object obj, boolean z, Function1<? super ImageView, Unit> function1, @NotNull List<DropItemBean> list, int i, @NotNull String str3, boolean z2, String str4, int i2, boolean z3, @NotNull String str5, int i3, int i4, boolean z4, int i5, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new DropItemBean(str, str2, obj, z, function1, list, i, str3, z2, str4, i2, z3, str5, i3, i4, z4, i5, z5, z6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropItemBean)) {
            return false;
        }
        DropItemBean dropItemBean = (DropItemBean) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) dropItemBean.title) && Intrinsics.EZpvd((Object) this.uniqueKey, (Object) dropItemBean.uniqueKey) && Intrinsics.EZpvd(this.data, dropItemBean.data) && this.ivHelp == dropItemBean.ivHelp && Intrinsics.EZpvd(this.ivHelpCallBack, dropItemBean.ivHelpCallBack) && Intrinsics.EZpvd(this.subData, dropItemBean.subData) && this.subIndex == dropItemBean.subIndex && Intrinsics.EZpvd((Object) this.hintText, (Object) dropItemBean.hintText) && this.enable == dropItemBean.enable && Intrinsics.EZpvd((Object) this.typeTitle, (Object) dropItemBean.typeTitle) && this.type == dropItemBean.type && this.isShowDivide == dropItemBean.isShowDivide && Intrinsics.EZpvd((Object) this.des, (Object) dropItemBean.des) && this.icon == dropItemBean.icon && this.headerType == dropItemBean.headerType && this.canSelectIcon == dropItemBean.canSelectIcon && this.index == dropItemBean.index && this.isUI20 == dropItemBean.isUI20 && this.ivSelect == dropItemBean.ivSelect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanSelectIcon() {
        return this.canSelectIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDes() {
        return this.des;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getHeaderType() {
        return this.headerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHintText() {
        return this.hintText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIndex() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getIvHelp() {
        return this.ivHelp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super android.widget.ImageView, kotlin.Unit>, kotlin.jvm.functions.Function1<android.widget.ImageView, kotlin.Unit> */
    public final Function1<ImageView, Unit> getIvHelpCallBack() {
        return this.ivHelpCallBack;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getIvSelect() {
        return this.ivSelect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DropItemBean> getSubData() {
        return this.subData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSubIndex() {
        return this.subIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTypeTitle() {
        return this.typeTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUniqueKey() {
        return this.uniqueKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.title.hashCode();
        int iHashCode2 = this.uniqueKey.hashCode();
        Object obj = this.data;
        int iHashCode3 = obj == null ? 0 : obj.hashCode();
        int iHashCode4 = Boolean.hashCode(this.ivHelp);
        Function1<? super ImageView, Unit> function1 = this.ivHelpCallBack;
        int iHashCode5 = function1 == null ? 0 : function1.hashCode();
        int iHashCode6 = this.subData.hashCode();
        int iHashCode7 = Integer.hashCode(this.subIndex);
        int iHashCode8 = this.hintText.hashCode();
        int iHashCode9 = Boolean.hashCode(this.enable);
        String str = this.typeTitle;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str != null ? str.hashCode() : 0)) * 31) + Integer.hashCode(this.type)) * 31) + Boolean.hashCode(this.isShowDivide)) * 31) + this.des.hashCode()) * 31) + Integer.hashCode(this.icon)) * 31) + Integer.hashCode(this.headerType)) * 31) + Boolean.hashCode(this.canSelectIcon)) * 31) + Integer.hashCode(this.index)) * 31) + Boolean.hashCode(this.isUI20)) * 31) + Boolean.hashCode(this.ivSelect);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowDivide() {
        return this.isShowDivide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isUI20() {
        return this.isUI20;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnable(boolean z) {
        this.enable = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHintText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.hintText = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIndex(int i) {
        this.index = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIvHelpCallBack(Function1<? super ImageView, Unit> function1) {
        this.ivHelpCallBack = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowDivide(boolean z) {
        this.isShowDivide = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubData(@NotNull List<DropItemBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.subData = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubIndex(int i) {
        this.subIndex = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(int i) {
        this.type = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTypeTitle(String str) {
        this.typeTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DropItemBean(title=" + this.title + ", uniqueKey=" + this.uniqueKey + ", data=" + this.data + ", ivHelp=" + this.ivHelp + ", ivHelpCallBack=" + this.ivHelpCallBack + ", subData=" + this.subData + ", subIndex=" + this.subIndex + ", hintText=" + this.hintText + ", enable=" + this.enable + ", typeTitle=" + this.typeTitle + ", type=" + this.type + ", isShowDivide=" + this.isShowDivide + ", des=" + this.des + ", icon=" + this.icon + ", headerType=" + this.headerType + ", canSelectIcon=" + this.canSelectIcon + ", index=" + this.index + ", isUI20=" + this.isUI20 + ", ivSelect=" + this.ivSelect + ")";
    }

    public DropItemBean(@NotNull String str, @NotNull String str2, Object obj, boolean z, Function1<? super ImageView, Unit> function1, @NotNull List<DropItemBean> list, int i, @NotNull String str3, boolean z2, String str4, int i2, boolean z3, @NotNull String str5, int i3, int i4, boolean z4, int i5, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.title = str;
        this.uniqueKey = str2;
        this.data = obj;
        this.ivHelp = z;
        this.ivHelpCallBack = function1;
        this.subData = list;
        this.subIndex = i;
        this.hintText = str3;
        this.enable = z2;
        this.typeTitle = str4;
        this.type = i2;
        this.isShowDivide = z3;
        this.des = str5;
        this.icon = i3;
        this.headerType = i4;
        this.canSelectIcon = z4;
        this.index = i5;
        this.isUI20 = z5;
        this.ivSelect = z6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a7: CONSTRUCTOR 
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0002: ARITH (r43v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r26v0 java.lang.Object))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r43v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r27v0 boolean))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0014: ARITH (r43v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r28v0 kotlin.jvm.functions.Function1))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001c: ARITH (r43v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0025: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:18) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r29v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0029: ARITH (r43v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r30v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r43v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003c: ARITH (r43v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? true : (r32v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r43v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004d: ARITH (r43v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r34v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0055: ARITH (r43v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r35v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r43v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0066: ARITH (r43v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r37v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x006f: ARITH (r43v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r38v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x007b: ARITH (32768 int) & (r43v0 int) A[WRAPPED]) != (0 int)) ? true : (r39v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0085: ARITH (65536 int) & (r43v0 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r40v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x008f: ARITH (131072 int) & (r43v0 int) A[WRAPPED]) != (0 int)) ? false : (r41v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0099: ARITH (r43v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? true : (r42v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.Object, boolean, kotlin.jvm.functions.Function1<? super android.widget.ImageView, kotlin.Unit>, java.util.List<com.okinc.unify_trade.biz.DropItemBean>, int, java.lang.String, boolean, java.lang.String, int, boolean, java.lang.String, int, int, boolean, int, boolean, boolean):void (m)] (LINE:12) call: com.okinc.unify_trade.biz.DropItemBean.<init>(java.lang.String, java.lang.String, java.lang.Object, boolean, kotlin.jvm.functions.Function1, java.util.List, int, java.lang.String, boolean, java.lang.String, int, boolean, java.lang.String, int, int, boolean, int, boolean, boolean):void type: THIS */
    public /* synthetic */ DropItemBean(String str, String str2, Object obj, boolean z, Function1 function1, List list, int i, String str3, boolean z2, String str4, int i2, boolean z3, String str5, int i3, int i4, boolean z4, int i5, boolean z5, boolean z6, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i6 & 4) != 0 ? null : obj, (i6 & 8) != 0 ? false : z, (i6 & 16) != 0 ? null : function1, (i6 & 32) != 0 ? new ArrayList() : list, (i6 & 64) != 0 ? -1 : i, (i6 & 128) != 0 ? "" : str3, (i6 & 256) != 0 ? true : z2, (i6 & 512) != 0 ? "" : str4, (i6 & 1024) != 0 ? 0 : i2, (i6 & 2048) != 0 ? false : z3, (i6 & 4096) != 0 ? "" : str5, (i6 & 8192) != 0 ? 0 : i3, (i6 & 16384) != 0 ? 0 : i4, (32768 & i6) != 0 ? true : z4, (65536 & i6) != 0 ? 0 : i5, (131072 & i6) != 0 ? false : z5, (i6 & 262144) != 0 ? true : z6);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.DropItemBean.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
