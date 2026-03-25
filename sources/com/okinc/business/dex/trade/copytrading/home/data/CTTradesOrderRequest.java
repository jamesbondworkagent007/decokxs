package com.okinc.business.dex.trade.copytrading.home.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CTTradesOrderRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String accountId;
    private final String cursor;
    private final int limit;
    private final String strategyId;
    private final Integer strategyMode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CTTradesOrderRequest copy$default(CTTradesOrderRequest cTTradesOrderRequest, String str, Integer num, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cTTradesOrderRequest.strategyId;
        }
        if ((i2 & 2) != 0) {
            num = cTTradesOrderRequest.strategyMode;
        }
        Integer num2 = num;
        if ((i2 & 4) != 0) {
            str2 = cTTradesOrderRequest.accountId;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            str3 = cTTradesOrderRequest.cursor;
        }
        String str5 = str3;
        if ((i2 & 16) != 0) {
            i = cTTradesOrderRequest.limit;
        }
        return cTTradesOrderRequest.copy(str, num2, str4, str5, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.strategyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.strategyMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.cursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTTradesOrderRequest copy(@NotNull String str, Integer num, @NotNull String str2, String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new CTTradesOrderRequest(str, num, str2, str3, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CTTradesOrderRequest)) {
            return false;
        }
        CTTradesOrderRequest cTTradesOrderRequest = (CTTradesOrderRequest) obj;
        return Intrinsics.EZpvd((Object) this.strategyId, (Object) cTTradesOrderRequest.strategyId) && Intrinsics.EZpvd(this.strategyMode, cTTradesOrderRequest.strategyMode) && Intrinsics.EZpvd((Object) this.accountId, (Object) cTTradesOrderRequest.accountId) && Intrinsics.EZpvd((Object) this.cursor, (Object) cTTradesOrderRequest.cursor) && this.limit == cTTradesOrderRequest.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCursor() {
        return this.cursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLimit() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyId() {
        return this.strategyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getStrategyMode() {
        return this.strategyMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.strategyId.hashCode();
        Integer num = this.strategyMode;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        int iHashCode3 = this.accountId.hashCode();
        String str = this.cursor;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0)) * 31) + Integer.hashCode(this.limit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CTTradesOrderRequest(strategyId=" + this.strategyId + ", strategyMode=" + this.strategyMode + ", accountId=" + this.accountId + ", cursor=" + this.cursor + ", limit=" + this.limit + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.home.data.CTTradesOrderRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CTTradesOrderRequest> serializer() {
            return CTTradesOrderRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CTTradesOrderRequest(int i, String str, Integer num, String str2, String str3, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, CTTradesOrderRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.strategyId = str;
        if ((i & 2) == 0) {
            this.strategyMode = null;
        } else {
            this.strategyMode = num;
        }
        if ((i & 4) == 0) {
            this.accountId = "";
        } else {
            this.accountId = str2;
        }
        if ((i & 8) == 0) {
            this.cursor = null;
        } else {
            this.cursor = str3;
        }
        if ((i & 16) == 0) {
            this.limit = 20;
        } else {
            this.limit = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CTTradesOrderRequest cTTradesOrderRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, cTTradesOrderRequest.strategyId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || cTTradesOrderRequest.strategyMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, cTTradesOrderRequest.strategyMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) cTTradesOrderRequest.accountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, cTTradesOrderRequest.accountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || cTTradesOrderRequest.cursor != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, cTTradesOrderRequest.cursor);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && cTTradesOrderRequest.limit == 20) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 4, cTTradesOrderRequest.limit);
    }

    public CTTradesOrderRequest(@NotNull String str, Integer num, @NotNull String str2, String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.strategyId = str;
        this.strategyMode = num;
        this.accountId = str2;
        this.cursor = str3;
        this.limit = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
  (wrap:java.lang.String:0x000e: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (20 int) : (r12v0 int))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, int):void (m)] (LINE:192) call: com.okinc.business.dex.trade.copytrading.home.data.CTTradesOrderRequest.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ CTTradesOrderRequest(String str, Integer num, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? 20 : i);
    }
}
