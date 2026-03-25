package com.okinc.unify_trade.biz;

import androidx.core.app.FrameMetricsAggregator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class IdxCcyConfig {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String brokerId;
    private final String ccyId;
    private final String ccyName;
    private final String ccySign;
    private final String displayName;
    private final String displaySign;
    private final String instType;
    private final String priceDig;
    private final String referId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IdxCcyConfig() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.brokerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.referId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.ccyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.ccyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.ccySign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.priceDig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.displaySign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IdxCcyConfig copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new IdxCcyConfig(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBrokerId() {
        return this.brokerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcyId() {
        return this.ccyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcyName() {
        return this.ccyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcySign() {
        return this.ccySign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplaySign() {
        return this.displaySign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceDig() {
        return this.priceDig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReferId() {
        return this.referId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IdxCcyConfig(brokerId=" + this.brokerId + ", instType=" + this.instType + ", referId=" + this.referId + ", ccyId=" + this.ccyId + ", ccyName=" + this.ccyName + ", ccySign=" + this.ccySign + ", priceDig=" + this.priceDig + ", displayName=" + this.displayName + ", displaySign=" + this.displaySign + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.IdxCcyConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<IdxCcyConfig> serializer() {
            return IdxCcyConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IdxCcyConfig(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.brokerId = "";
        } else {
            this.brokerId = str;
        }
        if ((i & 2) == 0) {
            this.instType = "";
        } else {
            this.instType = str2;
        }
        if ((i & 4) == 0) {
            this.referId = "";
        } else {
            this.referId = str3;
        }
        if ((i & 8) == 0) {
            this.ccyId = "";
        } else {
            this.ccyId = str4;
        }
        if ((i & 16) == 0) {
            this.ccyName = "";
        } else {
            this.ccyName = str5;
        }
        if ((i & 32) == 0) {
            this.ccySign = "";
        } else {
            this.ccySign = str6;
        }
        if ((i & 64) == 0) {
            this.priceDig = "";
        } else {
            this.priceDig = str7;
        }
        if ((i & 128) == 0) {
            this.displayName = "";
        } else {
            this.displayName = str8;
        }
        if ((i & 256) == 0) {
            this.displaySign = "";
        } else {
            this.displaySign = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(IdxCcyConfig idxCcyConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) idxCcyConfig.brokerId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, idxCcyConfig.brokerId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) idxCcyConfig.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, idxCcyConfig.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) idxCcyConfig.referId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, idxCcyConfig.referId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) idxCcyConfig.ccyId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, idxCcyConfig.ccyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) idxCcyConfig.ccyName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, idxCcyConfig.ccyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) idxCcyConfig.ccySign, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, idxCcyConfig.ccySign);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) idxCcyConfig.priceDig, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, idxCcyConfig.priceDig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) idxCcyConfig.displayName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, idxCcyConfig.displayName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd((Object) idxCcyConfig.displaySign, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 8, idxCcyConfig.displaySign);
    }

    public IdxCcyConfig(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.brokerId = str;
        this.instType = str2;
        this.referId = str3;
        this.ccyId = str4;
        this.ccyName = str5;
        this.ccySign = str6;
        this.priceDig = str7;
        this.displayName = str8;
        this.displaySign = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0055: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1205) call: com.okinc.unify_trade.biz.IdxCcyConfig.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ IdxCcyConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) == 0 ? str9 : "");
    }

    public boolean equals(Object obj) {
        if (obj instanceof IdxCcyConfig) {
            IdxCcyConfig idxCcyConfig = (IdxCcyConfig) obj;
            return Intrinsics.EZpvd((Object) this.instType, (Object) idxCcyConfig.instType) && Intrinsics.EZpvd((Object) this.referId, (Object) idxCcyConfig.referId) && Intrinsics.EZpvd((Object) this.ccyId, (Object) idxCcyConfig.ccyId) && Intrinsics.EZpvd((Object) this.ccySign, (Object) idxCcyConfig.ccySign) && Intrinsics.EZpvd((Object) this.priceDig, (Object) idxCcyConfig.priceDig) && Intrinsics.EZpvd((Object) this.displayName, (Object) idxCcyConfig.displayName) && Intrinsics.EZpvd((Object) this.displaySign, (Object) idxCcyConfig.displaySign);
        }
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    private final boolean compareDepthLv(List<String> list, List<String> list2) {
        boolean z = false;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                yDY.AYXKKw();
            }
            z = list2.size() >= i2 && Intrinsics.EZpvd((Object) obj, (Object) list2.get(i));
            i = i2;
        }
        return z;
    }
}
