package com.okinc.assets.backend.api.model;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class AllFrozenAccountValBean {
    public static final int $stable = 8;
    private final Integer bizType;
    private final String bizTypeName;
    private final String btcValuation;
    private final ArrayList<FrozenAccountValBean> data;
    private final String usdValuation;
    private final String usdtValuation;
    private final String valuation;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AllFrozenAccountValBean() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.assets.backend.api.model.AllFrozenAccountValBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AllFrozenAccountValBean copy$default(AllFrozenAccountValBean allFrozenAccountValBean, ArrayList arrayList, Integer num, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = allFrozenAccountValBean.data;
        }
        if ((i & 2) != 0) {
            num = allFrozenAccountValBean.bizType;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            str = allFrozenAccountValBean.bizTypeName;
        }
        String str6 = str;
        if ((i & 8) != 0) {
            str2 = allFrozenAccountValBean.valuation;
        }
        String str7 = str2;
        if ((i & 16) != 0) {
            str3 = allFrozenAccountValBean.btcValuation;
        }
        String str8 = str3;
        if ((i & 32) != 0) {
            str4 = allFrozenAccountValBean.usdValuation;
        }
        String str9 = str4;
        if ((i & 64) != 0) {
            str5 = allFrozenAccountValBean.usdtValuation;
        }
        return allFrozenAccountValBean.copy(arrayList, num2, str6, str7, str8, str9, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<FrozenAccountValBean> component1() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.bizTypeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.valuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.btcValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.usdValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.usdtValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AllFrozenAccountValBean copy(ArrayList<FrozenAccountValBean> arrayList, Integer num, String str, String str2, String str3, String str4, String str5) {
        return new AllFrozenAccountValBean(arrayList, num, str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllFrozenAccountValBean)) {
            return false;
        }
        AllFrozenAccountValBean allFrozenAccountValBean = (AllFrozenAccountValBean) obj;
        return Intrinsics.EZpvd(this.data, allFrozenAccountValBean.data) && Intrinsics.EZpvd(this.bizType, allFrozenAccountValBean.bizType) && Intrinsics.EZpvd((Object) this.bizTypeName, (Object) allFrozenAccountValBean.bizTypeName) && Intrinsics.EZpvd((Object) this.valuation, (Object) allFrozenAccountValBean.valuation) && Intrinsics.EZpvd((Object) this.btcValuation, (Object) allFrozenAccountValBean.btcValuation) && Intrinsics.EZpvd((Object) this.usdValuation, (Object) allFrozenAccountValBean.usdValuation) && Intrinsics.EZpvd((Object) this.usdtValuation, (Object) allFrozenAccountValBean.usdtValuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizTypeName() {
        return this.bizTypeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBtcValuation() {
        return this.btcValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<FrozenAccountValBean> getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdValuation() {
        return this.usdValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdtValuation() {
        return this.usdtValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuation() {
        return this.valuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ArrayList<FrozenAccountValBean> arrayList = this.data;
        int iHashCode = arrayList == null ? 0 : arrayList.hashCode();
        Integer num = this.bizType;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str = this.bizTypeName;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.valuation;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.btcValuation;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.usdValuation;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.usdtValuation;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AllFrozenAccountValBean(data=" + this.data + ", bizType=" + this.bizType + ", bizTypeName=" + this.bizTypeName + ", valuation=" + this.valuation + ", btcValuation=" + this.btcValuation + ", usdValuation=" + this.usdValuation + ", usdtValuation=" + this.usdtValuation + ")";
    }

    public AllFrozenAccountValBean(ArrayList<FrozenAccountValBean> arrayList, Integer num, String str, String str2, String str3, String str4, String str5) {
        this.data = arrayList;
        this.bizType = num;
        this.bizTypeName = str;
        this.valuation = str2;
        this.btcValuation = str3;
        this.usdValuation = str4;
        this.usdtValuation = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r7v0 java.util.ArrayList))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r8v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(java.util.ArrayList<com.okinc.assets.backend.api.model.FrozenAccountValBean>, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:44) call: com.okinc.assets.backend.api.model.AllFrozenAccountValBean.<init>(java.util.ArrayList, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AllFrozenAccountValBean(ArrayList arrayList, Integer num, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arrayList, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5);
    }
}
