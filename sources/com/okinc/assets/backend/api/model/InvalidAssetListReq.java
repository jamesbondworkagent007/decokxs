package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class InvalidAssetListReq {
    public static final int $stable = 8;
    private Boolean includeEntityUnsupportedCcy;
    private Boolean onlyEntityUnsupportedCcy;
    public String subUser;
    public Integer targets;
    private String valuationUnit;
    private Boolean withCash;
    private Boolean withNetwork;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvalidAssetListReq copy$default(InvalidAssetListReq invalidAssetListReq, String str, Integer num, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = invalidAssetListReq.subUser;
        }
        if ((i & 2) != 0) {
            num = invalidAssetListReq.targets;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            str2 = invalidAssetListReq.valuationUnit;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            bool = invalidAssetListReq.withNetwork;
        }
        Boolean bool5 = bool;
        if ((i & 16) != 0) {
            bool2 = invalidAssetListReq.includeEntityUnsupportedCcy;
        }
        Boolean bool6 = bool2;
        if ((i & 32) != 0) {
            bool3 = invalidAssetListReq.onlyEntityUnsupportedCcy;
        }
        Boolean bool7 = bool3;
        if ((i & 64) != 0) {
            bool4 = invalidAssetListReq.withCash;
        }
        return invalidAssetListReq.copy(str, num2, str3, bool5, bool6, bool7, bool4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.subUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.targets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.valuationUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.withNetwork;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.includeEntityUnsupportedCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.onlyEntityUnsupportedCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.withCash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvalidAssetListReq copy(String str, Integer num, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        return new InvalidAssetListReq(str, num, str2, bool, bool2, bool3, bool4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvalidAssetListReq)) {
            return false;
        }
        InvalidAssetListReq invalidAssetListReq = (InvalidAssetListReq) obj;
        return Intrinsics.EZpvd((Object) this.subUser, (Object) invalidAssetListReq.subUser) && Intrinsics.EZpvd(this.targets, invalidAssetListReq.targets) && Intrinsics.EZpvd((Object) this.valuationUnit, (Object) invalidAssetListReq.valuationUnit) && Intrinsics.EZpvd(this.withNetwork, invalidAssetListReq.withNetwork) && Intrinsics.EZpvd(this.includeEntityUnsupportedCcy, invalidAssetListReq.includeEntityUnsupportedCcy) && Intrinsics.EZpvd(this.onlyEntityUnsupportedCcy, invalidAssetListReq.onlyEntityUnsupportedCcy) && Intrinsics.EZpvd(this.withCash, invalidAssetListReq.withCash);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getIncludeEntityUnsupportedCcy() {
        return this.includeEntityUnsupportedCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getOnlyEntityUnsupportedCcy() {
        return this.onlyEntityUnsupportedCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuationUnit() {
        return this.valuationUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getWithCash() {
        return this.withCash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getWithNetwork() {
        return this.withNetwork;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.subUser;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.targets;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str2 = this.valuationUnit;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.withNetwork;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.includeEntityUnsupportedCcy;
        int iHashCode5 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.onlyEntityUnsupportedCcy;
        int iHashCode6 = bool3 == null ? 0 : bool3.hashCode();
        Boolean bool4 = this.withCash;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (bool4 != null ? bool4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIncludeEntityUnsupportedCcy(Boolean bool) {
        this.includeEntityUnsupportedCcy = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnlyEntityUnsupportedCcy(Boolean bool) {
        this.onlyEntityUnsupportedCcy = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValuationUnit(String str) {
        this.valuationUnit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWithCash(Boolean bool) {
        this.withCash = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWithNetwork(Boolean bool) {
        this.withNetwork = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvalidAssetListReq(subUser=" + this.subUser + ", targets=" + this.targets + ", valuationUnit=" + this.valuationUnit + ", withNetwork=" + this.withNetwork + ", includeEntityUnsupportedCcy=" + this.includeEntityUnsupportedCcy + ", onlyEntityUnsupportedCcy=" + this.onlyEntityUnsupportedCcy + ", withCash=" + this.withCash + ")";
    }

    public InvalidAssetListReq(String str, Integer num, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.subUser = str;
        this.targets = num;
        this.valuationUnit = str2;
        this.withNetwork = bool;
        this.includeEntityUnsupportedCcy = bool2;
        this.onlyEntityUnsupportedCcy = bool3;
        this.withCash = bool4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0035: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r8v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0013: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r10v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001b: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r11v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001f: ARITH (r14v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r12v0 java.lang.Boolean) : (null java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0029: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r13v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean):void (m)] (LINE:167) call: com.okinc.assets.backend.api.model.InvalidAssetListReq.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean):void type: THIS */
    public /* synthetic */ InvalidAssetListReq(String str, Integer num, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? Boolean.FALSE : bool, (i & 16) != 0 ? Boolean.TRUE : bool2, (i & 32) == 0 ? bool3 : null, (i & 64) != 0 ? Boolean.TRUE : bool4);
    }
}
