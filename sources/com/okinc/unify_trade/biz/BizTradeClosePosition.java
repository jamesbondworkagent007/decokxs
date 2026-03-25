package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class BizTradeClosePosition {
    private String bizRefId;
    private String bizRefType;
    private String ccy;
    private String instId;
    private String mgnMode;
    private String posSide;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BizTradeClosePosition copy$default(BizTradeClosePosition bizTradeClosePosition, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bizTradeClosePosition.instId;
        }
        if ((i & 2) != 0) {
            str2 = bizTradeClosePosition.posSide;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = bizTradeClosePosition.mgnMode;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = bizTradeClosePosition.ccy;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = bizTradeClosePosition.bizRefId;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = bizTradeClosePosition.bizRefType;
        }
        return bizTradeClosePosition.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.mgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.bizRefId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.bizRefType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BizTradeClosePosition copy(@NotNull String str, String str2, @NotNull String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new BizTradeClosePosition(str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BizTradeClosePosition)) {
            return false;
        }
        BizTradeClosePosition bizTradeClosePosition = (BizTradeClosePosition) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) bizTradeClosePosition.instId) && Intrinsics.EZpvd((Object) this.posSide, (Object) bizTradeClosePosition.posSide) && Intrinsics.EZpvd((Object) this.mgnMode, (Object) bizTradeClosePosition.mgnMode) && Intrinsics.EZpvd((Object) this.ccy, (Object) bizTradeClosePosition.ccy) && Intrinsics.EZpvd((Object) this.bizRefId, (Object) bizTradeClosePosition.bizRefId) && Intrinsics.EZpvd((Object) this.bizRefType, (Object) bizTradeClosePosition.bizRefType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizRefId() {
        return this.bizRefId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizRefType() {
        return this.bizRefType;
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
    public final String getMgnMode() {
        return this.mgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.instId.hashCode();
        String str = this.posSide;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.mgnMode.hashCode();
        String str2 = this.ccy;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.bizRefId;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.bizRefType;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizRefId(String str) {
        this.bizRefId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizRefType(String str) {
        this.bizRefType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(String str) {
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMgnMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mgnMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosSide(String str) {
        this.posSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BizTradeClosePosition(instId=" + this.instId + ", posSide=" + this.posSide + ", mgnMode=" + this.mgnMode + ", ccy=" + this.ccy + ", bizRefId=" + this.bizRefId + ", bizRefType=" + this.bizRefType + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BizTradeClosePosition.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BizTradeClosePosition> serializer() {
            return BizTradeClosePosition$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BizTradeClosePosition(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, BizTradeClosePosition$$serializer.INSTANCE.getDescriptor());
        }
        this.instId = str;
        this.posSide = str2;
        this.mgnMode = str3;
        this.ccy = str4;
        if ((i & 16) == 0) {
            this.bizRefId = "";
        } else {
            this.bizRefId = str5;
        }
        if ((i & 32) == 0) {
            this.bizRefType = "";
        } else {
            this.bizRefType = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BizTradeClosePosition bizTradeClosePosition, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, bizTradeClosePosition.instId);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, bizTradeClosePosition.posSide);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, bizTradeClosePosition.mgnMode);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, bizTradeClosePosition.ccy);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) bizTradeClosePosition.bizRefId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, bizTradeClosePosition.bizRefId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) bizTradeClosePosition.bizRefType, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, bizTradeClosePosition.bizRefType);
    }

    public BizTradeClosePosition(@NotNull String str, String str2, @NotNull String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.instId = str;
        this.posSide = str2;
        this.mgnMode = str3;
        this.ccy = str4;
        this.bizRefId = str5;
        this.bizRefType = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:741) call: com.okinc.unify_trade.biz.BizTradeClosePosition.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BizTradeClosePosition(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}
