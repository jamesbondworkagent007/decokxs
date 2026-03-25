package com.okinc.business.dex.trade.copytrading.home.data;

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

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CTFilteredOrderRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String accountId;
    private final String cursor;
    private final int limit;
    private final String strategyId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CTFilteredOrderRequest copy$default(CTFilteredOrderRequest cTFilteredOrderRequest, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cTFilteredOrderRequest.accountId;
        }
        if ((i2 & 2) != 0) {
            str2 = cTFilteredOrderRequest.strategyId;
        }
        if ((i2 & 4) != 0) {
            str3 = cTFilteredOrderRequest.cursor;
        }
        if ((i2 & 8) != 0) {
            i = cTFilteredOrderRequest.limit;
        }
        return cTFilteredOrderRequest.copy(str, str2, str3, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.strategyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.cursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTFilteredOrderRequest copy(@NotNull String str, @NotNull String str2, String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new CTFilteredOrderRequest(str, str2, str3, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CTFilteredOrderRequest)) {
            return false;
        }
        CTFilteredOrderRequest cTFilteredOrderRequest = (CTFilteredOrderRequest) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) cTFilteredOrderRequest.accountId) && Intrinsics.EZpvd((Object) this.strategyId, (Object) cTFilteredOrderRequest.strategyId) && Intrinsics.EZpvd((Object) this.cursor, (Object) cTFilteredOrderRequest.cursor) && this.limit == cTFilteredOrderRequest.limit;
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
    public int hashCode() {
        int iHashCode = this.accountId.hashCode();
        int iHashCode2 = this.strategyId.hashCode();
        String str = this.cursor;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.limit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CTFilteredOrderRequest(accountId=" + this.accountId + ", strategyId=" + this.strategyId + ", cursor=" + this.cursor + ", limit=" + this.limit + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.home.data.CTFilteredOrderRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CTFilteredOrderRequest> serializer() {
            return CTFilteredOrderRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CTFilteredOrderRequest(int i, String str, String str2, String str3, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, CTFilteredOrderRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.accountId = str;
        this.strategyId = str2;
        if ((i & 4) == 0) {
            this.cursor = null;
        } else {
            this.cursor = str3;
        }
        if ((i & 8) == 0) {
            this.limit = 20;
        } else {
            this.limit = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CTFilteredOrderRequest cTFilteredOrderRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, cTFilteredOrderRequest.accountId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, cTFilteredOrderRequest.strategyId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || cTFilteredOrderRequest.cursor != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, cTFilteredOrderRequest.cursor);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && cTFilteredOrderRequest.limit == 20) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 3, cTFilteredOrderRequest.limit);
    }

    public CTFilteredOrderRequest(@NotNull String str, @NotNull String str2, String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.accountId = str;
        this.strategyId = str2;
        this.cursor = str3;
        this.limit = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (20 int) : (r4v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:239) call: com.okinc.business.dex.trade.copytrading.home.data.CTFilteredOrderRequest.<init>(java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ CTFilteredOrderRequest(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? 20 : i);
    }
}
