package com.okinc.business.invest_biz.data.bean.response;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class DashboardTokenListResponse {
    public final String accountId;
    public final DashboardTokenInfo borrow;
    public final DashboardTokenInfo dual;
    public final boolean showViewByToken;
    public final DashboardTokenInfo single;
    public final String totalAssets;
    public final String totalEarnings;
    public final String yesterdayProfit;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DashboardTokenListResponse() {
        this((String) null, (String) null, (String) null, (String) null, (DashboardTokenInfo) null, (DashboardTokenInfo) null, (DashboardTokenInfo) null, false, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DashboardTokenInfo AEQbTJ() {
        return this.single;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.totalAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DashboardTokenInfo KWHzl() {
        return this.borrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DashboardTokenInfo OLrzqt() {
        return this.dual;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DashboardTokenListResponse OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull DashboardTokenInfo dashboardTokenInfo, @NotNull DashboardTokenInfo dashboardTokenInfo2, @NotNull DashboardTokenInfo dashboardTokenInfo3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(dashboardTokenInfo, "");
        Intrinsics.checkNotNullParameter(dashboardTokenInfo2, "");
        Intrinsics.checkNotNullParameter(dashboardTokenInfo3, "");
        return new DashboardTokenListResponse(str, str2, str3, str4, dashboardTokenInfo, dashboardTokenInfo2, dashboardTokenInfo3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.showViewByToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DashboardTokenListResponse)) {
            return false;
        }
        DashboardTokenListResponse dashboardTokenListResponse = (DashboardTokenListResponse) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) dashboardTokenListResponse.accountId) && Intrinsics.EZpvd((Object) this.totalAssets, (Object) dashboardTokenListResponse.totalAssets) && Intrinsics.EZpvd((Object) this.yesterdayProfit, (Object) dashboardTokenListResponse.yesterdayProfit) && Intrinsics.EZpvd((Object) this.totalEarnings, (Object) dashboardTokenListResponse.totalEarnings) && Intrinsics.EZpvd(this.single, dashboardTokenListResponse.single) && Intrinsics.EZpvd(this.dual, dashboardTokenListResponse.dual) && Intrinsics.EZpvd(this.borrow, dashboardTokenListResponse.borrow) && this.showViewByToken == dashboardTokenListResponse.showViewByToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.totalEarnings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.accountId.hashCode() * 31) + this.totalAssets.hashCode()) * 31) + this.yesterdayProfit.hashCode()) * 31) + this.totalEarnings.hashCode()) * 31) + this.single.hashCode()) * 31) + this.dual.hashCode()) * 31) + this.borrow.hashCode()) * 31) + Boolean.hashCode(this.showViewByToken);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DashboardTokenListResponse(accountId=" + this.accountId + ", totalAssets=" + this.totalAssets + ", yesterdayProfit=" + this.yesterdayProfit + ", totalEarnings=" + this.totalEarnings + ", single=" + this.single + ", dual=" + this.dual + ", borrow=" + this.borrow + ", showViewByToken=" + this.showViewByToken + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.yesterdayProfit;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.response.DashboardTokenListResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DashboardTokenListResponse> serializer() {
            return DashboardTokenListResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DashboardTokenListResponse(int i, String str, String str2, String str3, String str4, DashboardTokenInfo dashboardTokenInfo, DashboardTokenInfo dashboardTokenInfo2, DashboardTokenInfo dashboardTokenInfo3, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.accountId = "";
        } else {
            this.accountId = str;
        }
        if ((i & 2) == 0) {
            this.totalAssets = "";
        } else {
            this.totalAssets = str2;
        }
        if ((i & 4) == 0) {
            this.yesterdayProfit = "";
        } else {
            this.yesterdayProfit = str3;
        }
        if ((i & 8) == 0) {
            this.totalEarnings = "";
        } else {
            this.totalEarnings = str4;
        }
        if ((i & 16) == 0) {
            this.single = new DashboardTokenInfo((List) null, 1, (DefaultConstructorMarker) null);
        } else {
            this.single = dashboardTokenInfo;
        }
        if ((i & 32) == 0) {
            this.dual = new DashboardTokenInfo((List) null, 1, (DefaultConstructorMarker) null);
        } else {
            this.dual = dashboardTokenInfo2;
        }
        if ((i & 64) == 0) {
            this.borrow = new DashboardTokenInfo((List) null, 1, (DefaultConstructorMarker) null);
        } else {
            this.borrow = dashboardTokenInfo3;
        }
        if ((i & 128) == 0) {
            this.showViewByToken = true;
        } else {
            this.showViewByToken = z;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [22=4] */
    public static final /* synthetic */ void OLrzqt(DashboardTokenListResponse dashboardTokenListResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dashboardTokenListResponse.accountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dashboardTokenListResponse.accountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dashboardTokenListResponse.totalAssets, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dashboardTokenListResponse.totalAssets);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dashboardTokenListResponse.yesterdayProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dashboardTokenListResponse.yesterdayProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) dashboardTokenListResponse.totalEarnings, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, dashboardTokenListResponse.totalEarnings);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(dashboardTokenListResponse.single, new DashboardTokenInfo((List) null, 1, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, DashboardTokenInfo$$serializer.INSTANCE, dashboardTokenListResponse.single);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(dashboardTokenListResponse.dual, new DashboardTokenInfo((List) null, 1, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, DashboardTokenInfo$$serializer.INSTANCE, dashboardTokenListResponse.dual);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(dashboardTokenListResponse.borrow, new DashboardTokenInfo((List) null, 1, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, DashboardTokenInfo$$serializer.INSTANCE, dashboardTokenListResponse.borrow);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && dashboardTokenListResponse.showViewByToken) {
            return;
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 7, dashboardTokenListResponse.showViewByToken);
    }

    public DashboardTokenListResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull DashboardTokenInfo dashboardTokenInfo, @NotNull DashboardTokenInfo dashboardTokenInfo2, @NotNull DashboardTokenInfo dashboardTokenInfo3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(dashboardTokenInfo, "");
        Intrinsics.checkNotNullParameter(dashboardTokenInfo2, "");
        Intrinsics.checkNotNullParameter(dashboardTokenInfo3, "");
        this.accountId = str;
        this.totalAssets = str2;
        this.yesterdayProfit = str3;
        this.totalEarnings = str4;
        this.single = dashboardTokenInfo;
        this.dual = dashboardTokenInfo2;
        this.borrow = dashboardTokenInfo3;
        this.showViewByToken = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0058: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r19v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r19v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r19v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r19v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r14v0 java.lang.String) : (""))
  (wrap:com.okinc.business.invest_biz.data.bean.response.DashboardTokenInfo:?: TERNARY null = ((wrap:int:0x001f: ARITH (r19v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0027: CONSTRUCTOR 
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (1 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:33) call: com.okinc.business.invest_biz.data.bean.response.DashboardTokenInfo.<init>(java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r15v0 com.okinc.business.invest_biz.data.bean.response.DashboardTokenInfo))
  (wrap:com.okinc.business.invest_biz.data.bean.response.DashboardTokenInfo:?: TERNARY null = ((wrap:int:0x002c: ARITH (r19v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0032: CONSTRUCTOR 
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (1 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:35) call: com.okinc.business.invest_biz.data.bean.response.DashboardTokenInfo.<init>(java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r16v0 com.okinc.business.invest_biz.data.bean.response.DashboardTokenInfo))
  (wrap:com.okinc.business.invest_biz.data.bean.response.DashboardTokenInfo:?: TERNARY null = ((wrap:int:0x0038: ARITH (r19v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003e: CONSTRUCTOR 
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (1 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:37) call: com.okinc.business.invest_biz.data.bean.response.DashboardTokenInfo.<init>(java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r17v0 com.okinc.business.invest_biz.data.bean.response.DashboardTokenInfo))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0044: ARITH (r19v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r18v0 boolean) : true)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.response.DashboardTokenInfo, com.okinc.business.invest_biz.data.bean.response.DashboardTokenInfo, com.okinc.business.invest_biz.data.bean.response.DashboardTokenInfo, boolean):void (m)] (LINE:23) call: com.okinc.business.invest_biz.data.bean.response.DashboardTokenListResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.response.DashboardTokenInfo, com.okinc.business.invest_biz.data.bean.response.DashboardTokenInfo, com.okinc.business.invest_biz.data.bean.response.DashboardTokenInfo, boolean):void type: THIS */
    public /* synthetic */ DashboardTokenListResponse(String str, String str2, String str3, String str4, DashboardTokenInfo dashboardTokenInfo, DashboardTokenInfo dashboardTokenInfo2, DashboardTokenInfo dashboardTokenInfo3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? new DashboardTokenInfo((List) null, 1, (DefaultConstructorMarker) null) : dashboardTokenInfo, (i & 32) != 0 ? new DashboardTokenInfo((List) null, 1, (DefaultConstructorMarker) null) : dashboardTokenInfo2, (i & 64) != 0 ? new DashboardTokenInfo((List) null, 1, (DefaultConstructorMarker) null) : dashboardTokenInfo3, (i & 128) == 0 ? z : true);
    }
}
