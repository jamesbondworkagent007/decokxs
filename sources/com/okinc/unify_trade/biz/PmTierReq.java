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

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class PmTierReq {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String ccy;
    private final String instFamily;
    private final String instId;
    private final String instType;
    private final String mgnMode;
    private final String tier;
    private final String uly;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PmTierReq copy$default(PmTierReq pmTierReq, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pmTierReq.instType;
        }
        if ((i & 2) != 0) {
            str2 = pmTierReq.mgnMode;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = pmTierReq.uly;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = pmTierReq.instFamily;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = pmTierReq.ccy;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = pmTierReq.instId;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = pmTierReq.tier;
        }
        return pmTierReq.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.mgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PmTierReq copy(@NotNull String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PmTierReq(str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PmTierReq)) {
            return false;
        }
        PmTierReq pmTierReq = (PmTierReq) obj;
        return Intrinsics.EZpvd((Object) this.instType, (Object) pmTierReq.instType) && Intrinsics.EZpvd((Object) this.mgnMode, (Object) pmTierReq.mgnMode) && Intrinsics.EZpvd((Object) this.uly, (Object) pmTierReq.uly) && Intrinsics.EZpvd((Object) this.instFamily, (Object) pmTierReq.instFamily) && Intrinsics.EZpvd((Object) this.ccy, (Object) pmTierReq.ccy) && Intrinsics.EZpvd((Object) this.instId, (Object) pmTierReq.instId) && Intrinsics.EZpvd((Object) this.tier, (Object) pmTierReq.tier);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstFamily() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMgnMode() {
        return this.mgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTier() {
        return this.tier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUly() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.instType.hashCode();
        String str = this.mgnMode;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.uly;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.instFamily;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.ccy;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.instId;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.tier;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PmTierReq(instType=" + this.instType + ", mgnMode=" + this.mgnMode + ", uly=" + this.uly + ", instFamily=" + this.instFamily + ", ccy=" + this.ccy + ", instId=" + this.instId + ", tier=" + this.tier + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.PmTierReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PmTierReq> serializer() {
            return PmTierReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PmTierReq(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, PmTierReq$$serializer.INSTANCE.getDescriptor());
        }
        this.instType = str;
        if ((i & 2) == 0) {
            this.mgnMode = null;
        } else {
            this.mgnMode = str2;
        }
        if ((i & 4) == 0) {
            this.uly = null;
        } else {
            this.uly = str3;
        }
        if ((i & 8) == 0) {
            this.instFamily = null;
        } else {
            this.instFamily = str4;
        }
        if ((i & 16) == 0) {
            this.ccy = null;
        } else {
            this.ccy = str5;
        }
        if ((i & 32) == 0) {
            this.instId = null;
        } else {
            this.instId = str6;
        }
        if ((i & 64) == 0) {
            this.tier = null;
        } else {
            this.tier = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(PmTierReq pmTierReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, pmTierReq.instType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || pmTierReq.mgnMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, pmTierReq.mgnMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || pmTierReq.uly != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, pmTierReq.uly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || pmTierReq.instFamily != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, pmTierReq.instFamily);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || pmTierReq.ccy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, pmTierReq.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || pmTierReq.instId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, pmTierReq.instId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && pmTierReq.tier == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, pmTierReq.tier);
    }

    public PmTierReq(@NotNull String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instType = str;
        this.mgnMode = str2;
        this.uly = str3;
        this.instFamily = str4;
        this.ccy = str5;
        this.instId = str6;
        this.tier = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0033: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r15v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r15v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r15v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r15v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r15v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r15v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r14v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:2310) call: com.okinc.unify_trade.biz.PmTierReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PmTierReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) == 0 ? str7 : null);
    }
}
