package com.okinc.business.invest_biz.ui.widget.item;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ItemData {
    public static final int $stable = 8;
    private Object config;
    private String content;
    private String customHint;
    private Object data;
    private boolean isAuto;
    private boolean selected;
    private boolean subVisible;
    private int type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ItemData() {
        this(null, false, 0, null, false, null, false, null, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.selected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.customHint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.subVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object component6() {
        return this.config;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.isAuto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object component8() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ItemData copy(@NotNull String str, boolean z, int i, @NotNull String str2, boolean z2, Object obj, boolean z3, Object obj2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ItemData(str, z, i, str2, z2, obj, z3, obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemData)) {
            return false;
        }
        ItemData itemData = (ItemData) obj;
        return Intrinsics.EZpvd((Object) this.content, (Object) itemData.content) && this.selected == itemData.selected && this.type == itemData.type && Intrinsics.EZpvd((Object) this.customHint, (Object) itemData.customHint) && this.subVisible == itemData.subVisible && Intrinsics.EZpvd(this.config, itemData.config) && this.isAuto == itemData.isAuto && Intrinsics.EZpvd(this.data, itemData.data);
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
    public final Object getConfig() {
        return this.config;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCustomHint() {
        return this.customHint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSubVisible() {
        return this.subVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.content.hashCode();
        int iHashCode2 = Boolean.hashCode(this.selected);
        int iHashCode3 = Integer.hashCode(this.type);
        int iHashCode4 = this.customHint.hashCode();
        int iHashCode5 = Boolean.hashCode(this.subVisible);
        Object obj = this.config;
        int iHashCode6 = obj == null ? 0 : obj.hashCode();
        int iHashCode7 = Boolean.hashCode(this.isAuto);
        Object obj2 = this.data;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAuto() {
        return this.isAuto;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAuto(boolean z) {
        this.isAuto = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConfig(Object obj) {
        this.config = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.content = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCustomHint(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.customHint = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setData(Object obj) {
        this.data = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelected(boolean z) {
        this.selected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubVisible(boolean z) {
        this.subVisible = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(int i) {
        this.type = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ItemData(content=" + this.content + ", selected=" + this.selected + ", type=" + this.type + ", customHint=" + this.customHint + ", subVisible=" + this.subVisible + ", config=" + this.config + ", isAuto=" + this.isAuto + ", data=" + this.data + ")";
    }

    public ItemData(@NotNull String str, boolean z, int i, @NotNull String str2, boolean z2, Object obj, boolean z3, Object obj2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.content = str;
        this.selected = z;
        this.type = i;
        this.customHint = str2;
        this.subVisible = z2;
        this.config = obj;
        this.isAuto = z3;
        this.data = obj2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0013: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r12v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r18v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r13v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r14v0 boolean) : false)
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r15v0 java.lang.Object))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? true : (r16v0 boolean))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0036: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.Object) : (null java.lang.Object))
 A[MD:(java.lang.String, boolean, int, java.lang.String, boolean, java.lang.Object, boolean, java.lang.Object):void (m)] (LINE:7) call: com.okinc.business.invest_biz.ui.widget.item.ItemData.<init>(java.lang.String, boolean, int, java.lang.String, boolean, java.lang.Object, boolean, java.lang.Object):void type: THIS */
    public /* synthetic */ ItemData(String str, boolean z, int i, String str2, boolean z2, Object obj, boolean z3, Object obj2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? 0 : i, (i2 & 8) == 0 ? str2 : "", (i2 & 16) == 0 ? z2 : false, (i2 & 32) != 0 ? null : obj, (i2 & 64) != 0 ? true : z3, (i2 & 128) == 0 ? obj2 : null);
    }
}
