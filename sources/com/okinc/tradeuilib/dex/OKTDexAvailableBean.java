package com.okinc.tradeuilib.dex;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class OKTDexAvailableBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String availableAmt;
    private final String availableAmtUsd;
    private final String ccyName;
    private final String tokenName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKTDexAvailableBean() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OKTDexAvailableBean copy$default(OKTDexAvailableBean oKTDexAvailableBean, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oKTDexAvailableBean.availableAmt;
        }
        if ((i & 2) != 0) {
            str2 = oKTDexAvailableBean.availableAmtUsd;
        }
        if ((i & 4) != 0) {
            str3 = oKTDexAvailableBean.ccyName;
        }
        if ((i & 8) != 0) {
            str4 = oKTDexAvailableBean.tokenName;
        }
        return oKTDexAvailableBean.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.availableAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.availableAmtUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ccyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKTDexAvailableBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new OKTDexAvailableBean(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OKTDexAvailableBean)) {
            return false;
        }
        OKTDexAvailableBean oKTDexAvailableBean = (OKTDexAvailableBean) obj;
        return Intrinsics.EZpvd((Object) this.availableAmt, (Object) oKTDexAvailableBean.availableAmt) && Intrinsics.EZpvd((Object) this.availableAmtUsd, (Object) oKTDexAvailableBean.availableAmtUsd) && Intrinsics.EZpvd((Object) this.ccyName, (Object) oKTDexAvailableBean.ccyName) && Intrinsics.EZpvd((Object) this.tokenName, (Object) oKTDexAvailableBean.tokenName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailableAmt() {
        return this.availableAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailableAmtUsd() {
        return this.availableAmtUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcyName() {
        return this.ccyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenName() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.availableAmt.hashCode() * 31) + this.availableAmtUsd.hashCode()) * 31) + this.ccyName.hashCode()) * 31) + this.tokenName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OKTDexAvailableBean(availableAmt=" + this.availableAmt + ", availableAmtUsd=" + this.availableAmtUsd + ", ccyName=" + this.ccyName + ", tokenName=" + this.tokenName + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradeuilib.dex.OKTDexAvailableBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OKTDexAvailableBean> serializer() {
            return OKTDexAvailableBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OKTDexAvailableBean(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.availableAmt = "";
        } else {
            this.availableAmt = str;
        }
        if ((i & 2) == 0) {
            this.availableAmtUsd = "";
        } else {
            this.availableAmtUsd = str2;
        }
        if ((i & 4) == 0) {
            this.ccyName = "";
        } else {
            this.ccyName = str3;
        }
        if ((i & 8) == 0) {
            this.tokenName = "";
        } else {
            this.tokenName = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeUILib_trade_ui(OKTDexAvailableBean oKTDexAvailableBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) oKTDexAvailableBean.availableAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, oKTDexAvailableBean.availableAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) oKTDexAvailableBean.availableAmtUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, oKTDexAvailableBean.availableAmtUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) oKTDexAvailableBean.ccyName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, oKTDexAvailableBean.ccyName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) oKTDexAvailableBean.tokenName, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, oKTDexAvailableBean.tokenName);
    }

    public OKTDexAvailableBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.availableAmt = str;
        this.availableAmtUsd = str2;
        this.ccyName = str3;
        this.tokenName = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.tradeuilib.dex.OKTDexAvailableBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ OKTDexAvailableBean(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
