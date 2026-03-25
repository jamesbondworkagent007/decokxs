package com.okinc.business.invest_biz.ui.screens.transaction.invest;

import com.google.gson.annotations.SerializedName;
import com.okinc.business.invest_biz.data.bean.TokenInvestDetail;
import com.okinc.business.invest_biz.data.bean.TokenInvestDetail$$serializer;
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
public final class InvestItem {

    @SerializedName("investDetail")
    private final TokenInvestDetail investDetail;

    @SerializedName("investLogo")
    private final String investLogo;

    @SerializedName("investmentId")
    private final long investmentId;

    @SerializedName("leftTitle")
    private final String leftTitle;

    @SerializedName("rightTitle")
    private final String rightTitle;

    @SerializedName("tvl")
    private final String tvl;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestItem() {
        this((String) null, (String) null, 0L, (String) null, (String) null, (TokenInvestDetail) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestItem copy$default(InvestItem investItem, String str, String str2, long j, String str3, String str4, TokenInvestDetail tokenInvestDetail, int i, Object obj) {
        if ((i & 1) != 0) {
            str = investItem.leftTitle;
        }
        if ((i & 2) != 0) {
            str2 = investItem.rightTitle;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            j = investItem.investmentId;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            str3 = investItem.investLogo;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = investItem.tvl;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            tokenInvestDetail = investItem.investDetail;
        }
        return investItem.KWHzl(str, str5, j2, str6, str7, tokenInvestDetail);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInvestDetail AEQbTJ() {
        return this.investDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.investLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestItem KWHzl(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4, TokenInvestDetail tokenInvestDetail) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new InvestItem(str, str2, j, str3, str4, tokenInvestDetail);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.rightTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.leftTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.tvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestItem)) {
            return false;
        }
        InvestItem investItem = (InvestItem) obj;
        return Intrinsics.EZpvd((Object) this.leftTitle, (Object) investItem.leftTitle) && Intrinsics.EZpvd((Object) this.rightTitle, (Object) investItem.rightTitle) && this.investmentId == investItem.investmentId && Intrinsics.EZpvd((Object) this.investLogo, (Object) investItem.investLogo) && Intrinsics.EZpvd((Object) this.tvl, (Object) investItem.tvl) && Intrinsics.EZpvd(this.investDetail, investItem.investDetail);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.leftTitle.hashCode();
        int iHashCode2 = this.rightTitle.hashCode();
        int iHashCode3 = Long.hashCode(this.investmentId);
        int iHashCode4 = this.investLogo.hashCode();
        int iHashCode5 = this.tvl.hashCode();
        TokenInvestDetail tokenInvestDetail = this.investDetail;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (tokenInvestDetail == null ? 0 : tokenInvestDetail.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestItem(leftTitle=" + this.leftTitle + ", rightTitle=" + this.rightTitle + ", investmentId=" + this.investmentId + ", investLogo=" + this.investLogo + ", tvl=" + this.tvl + ", investDetail=" + this.investDetail + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestItem> serializer() {
            return InvestItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestItem(int i, String str, String str2, long j, String str3, String str4, TokenInvestDetail tokenInvestDetail, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.leftTitle = "";
        } else {
            this.leftTitle = str;
        }
        if ((i & 2) == 0) {
            this.rightTitle = "";
        } else {
            this.rightTitle = str2;
        }
        if ((i & 4) == 0) {
            this.investmentId = 0L;
        } else {
            this.investmentId = j;
        }
        if ((i & 8) == 0) {
            this.investLogo = "";
        } else {
            this.investLogo = str3;
        }
        if ((i & 16) == 0) {
            this.tvl = "";
        } else {
            this.tvl = str4;
        }
        if ((i & 32) == 0) {
            this.investDetail = null;
        } else {
            this.investDetail = tokenInvestDetail;
        }
    }

    public static final /* synthetic */ void copydefault(InvestItem investItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) investItem.leftTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, investItem.leftTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) investItem.rightTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, investItem.rightTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investItem.investmentId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 2, investItem.investmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) investItem.investLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, investItem.investLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) investItem.tvl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, investItem.tvl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && investItem.investDetail == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, TokenInvestDetail$$serializer.INSTANCE, investItem.investDetail);
    }

    public InvestItem(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4, TokenInvestDetail tokenInvestDetail) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.leftTitle = str;
        this.rightTitle = str2;
        this.investmentId = j;
        this.investLogo = str3;
        this.tvl = str4;
        this.investDetail = tokenInvestDetail;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:long:0x0016: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r8v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r13v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r11v0 java.lang.String) : (""))
  (wrap:com.okinc.business.invest_biz.data.bean.TokenInvestDetail:?: TERNARY null = ((wrap:int:0x0024: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.TokenInvestDetail) : (r12v0 com.okinc.business.invest_biz.data.bean.TokenInvestDetail))
 A[MD:(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.TokenInvestDetail):void (m)] (LINE:18) call: com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestItem.<init>(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.TokenInvestDetail):void type: THIS */
    public /* synthetic */ InvestItem(String str, String str2, long j, String str3, String str4, TokenInvestDetail tokenInvestDetail, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? "" : str3, (i & 16) == 0 ? str4 : "", (i & 32) != 0 ? null : tokenInvestDetail);
    }
}
