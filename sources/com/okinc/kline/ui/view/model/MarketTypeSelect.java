package com.okinc.kline.ui.view.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class MarketTypeSelect {
    public static final int $stable = 8;
    private Object data;
    private int group;
    private boolean isSelect;
    private String selectTypeName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketTypeSelect() {
        this(null, false, 0, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MarketTypeSelect copy$default(MarketTypeSelect marketTypeSelect, String str, boolean z, int i, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            str = marketTypeSelect.selectTypeName;
        }
        if ((i2 & 2) != 0) {
            z = marketTypeSelect.isSelect;
        }
        if ((i2 & 4) != 0) {
            i = marketTypeSelect.group;
        }
        if ((i2 & 8) != 0) {
            obj = marketTypeSelect.data;
        }
        return marketTypeSelect.copy(str, z, i, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.selectTypeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isSelect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.group;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object component4() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketTypeSelect copy(@NotNull String str, boolean z, int i, Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        return new MarketTypeSelect(str, z, i, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketTypeSelect)) {
            return false;
        }
        MarketTypeSelect marketTypeSelect = (MarketTypeSelect) obj;
        return Intrinsics.EZpvd((Object) this.selectTypeName, (Object) marketTypeSelect.selectTypeName) && this.isSelect == marketTypeSelect.isSelect && this.group == marketTypeSelect.group && Intrinsics.EZpvd(this.data, marketTypeSelect.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getGroup() {
        return this.group;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSelectTypeName() {
        return this.selectTypeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.selectTypeName.hashCode();
        int iHashCode2 = Boolean.hashCode(this.isSelect);
        int iHashCode3 = Integer.hashCode(this.group);
        Object obj = this.data;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (obj == null ? 0 : obj.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelect() {
        return this.isSelect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setData(Object obj) {
        this.data = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGroup(int i) {
        this.group = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelect(boolean z) {
        this.isSelect = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelectTypeName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.selectTypeName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketTypeSelect(selectTypeName=" + this.selectTypeName + ", isSelect=" + this.isSelect + ", group=" + this.group + ", data=" + this.data + ")";
    }

    public MarketTypeSelect(@NotNull String str, boolean z, int i, Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        this.selectTypeName = str;
        this.isSelect = z;
        this.group = i;
        this.data = obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r7v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0007: ARITH (r7v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000d: ARITH (r7v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0012: ARITH (r7v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.Object))
 A[MD:(java.lang.String, boolean, int, java.lang.Object):void (m)] (LINE:13) call: com.okinc.kline.ui.view.model.MarketTypeSelect.<init>(java.lang.String, boolean, int, java.lang.Object):void type: THIS */
    public /* synthetic */ MarketTypeSelect(String str, boolean z, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str2);
    }
}
