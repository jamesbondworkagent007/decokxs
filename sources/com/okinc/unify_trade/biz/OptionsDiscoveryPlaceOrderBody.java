package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class OptionsDiscoveryPlaceOrderBody {
    private String ccy;
    private String instId;
    private String ordType;
    private String px;
    private String side;
    private String sz;
    private String tdMode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OptionsDiscoveryPlaceOrderBody() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OptionsDiscoveryPlaceOrderBody copy$default(OptionsDiscoveryPlaceOrderBody optionsDiscoveryPlaceOrderBody, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionsDiscoveryPlaceOrderBody.instId;
        }
        if ((i & 2) != 0) {
            str2 = optionsDiscoveryPlaceOrderBody.side;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = optionsDiscoveryPlaceOrderBody.ordType;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = optionsDiscoveryPlaceOrderBody.px;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = optionsDiscoveryPlaceOrderBody.sz;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = optionsDiscoveryPlaceOrderBody.tdMode;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = optionsDiscoveryPlaceOrderBody.ccy;
        }
        return optionsDiscoveryPlaceOrderBody.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OptionsDiscoveryPlaceOrderBody copy(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new OptionsDiscoveryPlaceOrderBody(str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionsDiscoveryPlaceOrderBody)) {
            return false;
        }
        OptionsDiscoveryPlaceOrderBody optionsDiscoveryPlaceOrderBody = (OptionsDiscoveryPlaceOrderBody) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) optionsDiscoveryPlaceOrderBody.instId) && Intrinsics.EZpvd((Object) this.side, (Object) optionsDiscoveryPlaceOrderBody.side) && Intrinsics.EZpvd((Object) this.ordType, (Object) optionsDiscoveryPlaceOrderBody.ordType) && Intrinsics.EZpvd((Object) this.px, (Object) optionsDiscoveryPlaceOrderBody.px) && Intrinsics.EZpvd((Object) this.sz, (Object) optionsDiscoveryPlaceOrderBody.sz) && Intrinsics.EZpvd((Object) this.tdMode, (Object) optionsDiscoveryPlaceOrderBody.tdMode) && Intrinsics.EZpvd((Object) this.ccy, (Object) optionsDiscoveryPlaceOrderBody.ccy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPx() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTdMode() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.instId.hashCode();
        int iHashCode2 = this.side.hashCode();
        int iHashCode3 = this.ordType.hashCode();
        String str = this.px;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.sz.hashCode()) * 31) + this.tdMode.hashCode()) * 31) + this.ccy.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPx(String str) {
        this.px = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTdMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tdMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OptionsDiscoveryPlaceOrderBody(instId=" + this.instId + ", side=" + this.side + ", ordType=" + this.ordType + ", px=" + this.px + ", sz=" + this.sz + ", tdMode=" + this.tdMode + ", ccy=" + this.ccy + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.OptionsDiscoveryPlaceOrderBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OptionsDiscoveryPlaceOrderBody> serializer() {
            return OptionsDiscoveryPlaceOrderBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OptionsDiscoveryPlaceOrderBody(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instId = "";
        } else {
            this.instId = str;
        }
        if ((i & 2) == 0) {
            this.side = "";
        } else {
            this.side = str2;
        }
        if ((i & 4) == 0) {
            this.ordType = "";
        } else {
            this.ordType = str3;
        }
        if ((i & 8) == 0) {
            this.px = null;
        } else {
            this.px = str4;
        }
        if ((i & 16) == 0) {
            this.sz = "";
        } else {
            this.sz = str5;
        }
        if ((i & 32) == 0) {
            this.tdMode = "";
        } else {
            this.tdMode = str6;
        }
        if ((i & 64) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(OptionsDiscoveryPlaceOrderBody optionsDiscoveryPlaceOrderBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) optionsDiscoveryPlaceOrderBody.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, optionsDiscoveryPlaceOrderBody.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) optionsDiscoveryPlaceOrderBody.side, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, optionsDiscoveryPlaceOrderBody.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) optionsDiscoveryPlaceOrderBody.ordType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, optionsDiscoveryPlaceOrderBody.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || optionsDiscoveryPlaceOrderBody.px != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, optionsDiscoveryPlaceOrderBody.px);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) optionsDiscoveryPlaceOrderBody.sz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, optionsDiscoveryPlaceOrderBody.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) optionsDiscoveryPlaceOrderBody.tdMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, optionsDiscoveryPlaceOrderBody.tdMode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) optionsDiscoveryPlaceOrderBody.ccy, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, optionsDiscoveryPlaceOrderBody.ccy);
    }

    public OptionsDiscoveryPlaceOrderBody(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.instId = str;
        this.side = str2;
        this.ordType = str3;
        this.px = str4;
        this.sz = str5;
        this.tdMode = str6;
        this.ccy = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:0x001c: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:921) call: com.okinc.unify_trade.biz.OptionsDiscoveryPlaceOrderBody.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ OptionsDiscoveryPlaceOrderBody(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }
}
