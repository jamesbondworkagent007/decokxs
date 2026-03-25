package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class OptionsDiscoveryEstCostBean {
    private String askBaseSz;
    private String askPx;
    private String askQuoteSz;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OptionsDiscoveryEstCostBean() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OptionsDiscoveryEstCostBean copy$default(OptionsDiscoveryEstCostBean optionsDiscoveryEstCostBean, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionsDiscoveryEstCostBean.askBaseSz;
        }
        if ((i & 2) != 0) {
            str2 = optionsDiscoveryEstCostBean.askPx;
        }
        if ((i & 4) != 0) {
            str3 = optionsDiscoveryEstCostBean.askQuoteSz;
        }
        return optionsDiscoveryEstCostBean.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.askBaseSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.askPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.askQuoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OptionsDiscoveryEstCostBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new OptionsDiscoveryEstCostBean(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionsDiscoveryEstCostBean)) {
            return false;
        }
        OptionsDiscoveryEstCostBean optionsDiscoveryEstCostBean = (OptionsDiscoveryEstCostBean) obj;
        return Intrinsics.EZpvd((Object) this.askBaseSz, (Object) optionsDiscoveryEstCostBean.askBaseSz) && Intrinsics.EZpvd((Object) this.askPx, (Object) optionsDiscoveryEstCostBean.askPx) && Intrinsics.EZpvd((Object) this.askQuoteSz, (Object) optionsDiscoveryEstCostBean.askQuoteSz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAskBaseSz() {
        return this.askBaseSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAskPx() {
        return this.askPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAskQuoteSz() {
        return this.askQuoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.askBaseSz.hashCode() * 31) + this.askPx.hashCode()) * 31) + this.askQuoteSz.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAskBaseSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.askBaseSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAskPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.askPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAskQuoteSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.askQuoteSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OptionsDiscoveryEstCostBean(askBaseSz=" + this.askBaseSz + ", askPx=" + this.askPx + ", askQuoteSz=" + this.askQuoteSz + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.OptionsDiscoveryEstCostBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OptionsDiscoveryEstCostBean> serializer() {
            return OptionsDiscoveryEstCostBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OptionsDiscoveryEstCostBean(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.askBaseSz = "";
        } else {
            this.askBaseSz = str;
        }
        if ((i & 2) == 0) {
            this.askPx = "";
        } else {
            this.askPx = str2;
        }
        if ((i & 4) == 0) {
            this.askQuoteSz = "";
        } else {
            this.askQuoteSz = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(OptionsDiscoveryEstCostBean optionsDiscoveryEstCostBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) optionsDiscoveryEstCostBean.askBaseSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, optionsDiscoveryEstCostBean.askBaseSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) optionsDiscoveryEstCostBean.askPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, optionsDiscoveryEstCostBean.askPx);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) optionsDiscoveryEstCostBean.askQuoteSz, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, optionsDiscoveryEstCostBean.askQuoteSz);
    }

    public OptionsDiscoveryEstCostBean(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.askBaseSz = str;
        this.askPx = str2;
        this.askQuoteSz = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:913) call: com.okinc.unify_trade.biz.OptionsDiscoveryEstCostBean.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ OptionsDiscoveryEstCostBean(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
