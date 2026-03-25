package com.okinc.business.dex.trade.copytrading.home.data;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CTOpenOrderRequest {
    private final String accountId;
    private final String cursor;
    private final int limit;
    private final Integer queryStatus;
    private final String strategyId;
    private final Integer strategyMode;
    private final List<String> walletAddressList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.business.dex.trade.copytrading.home.data.CTOpenOrderRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CTOpenOrderRequest copy$default(CTOpenOrderRequest cTOpenOrderRequest, String str, String str2, List list, Integer num, Integer num2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cTOpenOrderRequest.strategyId;
        }
        if ((i2 & 2) != 0) {
            str2 = cTOpenOrderRequest.accountId;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            list = cTOpenOrderRequest.walletAddressList;
        }
        List list2 = list;
        if ((i2 & 8) != 0) {
            num = cTOpenOrderRequest.queryStatus;
        }
        Integer num3 = num;
        if ((i2 & 16) != 0) {
            num2 = cTOpenOrderRequest.strategyMode;
        }
        Integer num4 = num2;
        if ((i2 & 32) != 0) {
            str3 = cTOpenOrderRequest.cursor;
        }
        String str5 = str3;
        if ((i2 & 64) != 0) {
            i = cTOpenOrderRequest.limit;
        }
        return cTOpenOrderRequest.copy(str, str4, list2, num3, num4, str5, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.strategyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.walletAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.queryStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.strategyMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.cursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTOpenOrderRequest copy(@NotNull String str, @NotNull String str2, @NotNull List<String> list, Integer num, Integer num2, @NotNull String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new CTOpenOrderRequest(str, str2, list, num, num2, str3, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CTOpenOrderRequest)) {
            return false;
        }
        CTOpenOrderRequest cTOpenOrderRequest = (CTOpenOrderRequest) obj;
        return Intrinsics.EZpvd((Object) this.strategyId, (Object) cTOpenOrderRequest.strategyId) && Intrinsics.EZpvd((Object) this.accountId, (Object) cTOpenOrderRequest.accountId) && Intrinsics.EZpvd(this.walletAddressList, cTOpenOrderRequest.walletAddressList) && Intrinsics.EZpvd(this.queryStatus, cTOpenOrderRequest.queryStatus) && Intrinsics.EZpvd(this.strategyMode, cTOpenOrderRequest.strategyMode) && Intrinsics.EZpvd((Object) this.cursor, (Object) cTOpenOrderRequest.cursor) && this.limit == cTOpenOrderRequest.limit;
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
    public final Integer getQueryStatus() {
        return this.queryStatus;
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
    public final List<String> getWalletAddressList() {
        return this.walletAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.strategyId.hashCode();
        int iHashCode2 = this.accountId.hashCode();
        int iHashCode3 = this.walletAddressList.hashCode();
        Integer num = this.queryStatus;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        Integer num2 = this.strategyMode;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + this.cursor.hashCode()) * 31) + Integer.hashCode(this.limit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CTOpenOrderRequest(strategyId=" + this.strategyId + ", accountId=" + this.accountId + ", walletAddressList=" + this.walletAddressList + ", queryStatus=" + this.queryStatus + ", strategyMode=" + this.strategyMode + ", cursor=" + this.cursor + ", limit=" + this.limit + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.home.data.CTOpenOrderRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CTOpenOrderRequest> serializer() {
            return CTOpenOrderRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CTOpenOrderRequest(int i, String str, String str2, List list, Integer num, Integer num2, String str3, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, CTOpenOrderRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.strategyId = str;
        if ((i & 2) == 0) {
            this.accountId = "";
        } else {
            this.accountId = str2;
        }
        if ((i & 4) == 0) {
            this.walletAddressList = yDY.AhwBna();
        } else {
            this.walletAddressList = list;
        }
        if ((i & 8) == 0) {
            this.queryStatus = null;
        } else {
            this.queryStatus = num;
        }
        if ((i & 16) == 0) {
            this.strategyMode = null;
        } else {
            this.strategyMode = num2;
        }
        if ((i & 32) == 0) {
            this.cursor = "";
        } else {
            this.cursor = str3;
        }
        if ((i & 64) == 0) {
            this.limit = 20;
        } else {
            this.limit = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CTOpenOrderRequest cTOpenOrderRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, cTOpenOrderRequest.strategyId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) cTOpenOrderRequest.accountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, cTOpenOrderRequest.accountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(cTOpenOrderRequest.walletAddressList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], cTOpenOrderRequest.walletAddressList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || cTOpenOrderRequest.queryStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, cTOpenOrderRequest.queryStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || cTOpenOrderRequest.strategyMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, cTOpenOrderRequest.strategyMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) cTOpenOrderRequest.cursor, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, cTOpenOrderRequest.cursor);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && cTOpenOrderRequest.limit == 20) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 6, cTOpenOrderRequest.limit);
    }

    public CTOpenOrderRequest(@NotNull String str, @NotNull String str2, @NotNull List<String> list, Integer num, Integer num2, @NotNull String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.strategyId = str;
        this.accountId = str2;
        this.walletAddressList = list;
        this.queryStatus = num;
        this.strategyMode = num2;
        this.cursor = str3;
        this.limit = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0037: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:182)) : (r9v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0013: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r10v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001b: ARITH (r14v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r11v0 java.lang.Integer) : (null java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r14v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r12v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0027: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (20 int) : (r13v0 int))
 A[MD:(java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.Integer, java.lang.Integer, java.lang.String, int):void (m)] (LINE:179) call: com.okinc.business.dex.trade.copytrading.home.data.CTOpenOrderRequest.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.Integer, java.lang.Integer, java.lang.String, int):void type: THIS */
    public /* synthetic */ CTOpenOrderRequest(String str, String str2, List list, Integer num, Integer num2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? yDY.AhwBna() : list, (i2 & 8) != 0 ? null : num, (i2 & 16) == 0 ? num2 : null, (i2 & 32) == 0 ? str3 : "", (i2 & 64) != 0 ? 20 : i);
    }
}
