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
public final class CTPositionsRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String accountId;
    private final String desc;
    private final String orderBy;
    private final String strategyId;
    private final Integer strategyMode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CTPositionsRequest copy$default(CTPositionsRequest cTPositionsRequest, String str, String str2, Integer num, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cTPositionsRequest.strategyId;
        }
        if ((i & 2) != 0) {
            str2 = cTPositionsRequest.accountId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            num = cTPositionsRequest.strategyMode;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            str3 = cTPositionsRequest.orderBy;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = cTPositionsRequest.desc;
        }
        return cTPositionsRequest.copy(str, str5, num2, str6, str4);
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
    public final Integer component3() {
        return this.strategyMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.orderBy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTPositionsRequest copy(@NotNull String str, @NotNull String str2, Integer num, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new CTPositionsRequest(str, str2, num, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CTPositionsRequest)) {
            return false;
        }
        CTPositionsRequest cTPositionsRequest = (CTPositionsRequest) obj;
        return Intrinsics.EZpvd((Object) this.strategyId, (Object) cTPositionsRequest.strategyId) && Intrinsics.EZpvd((Object) this.accountId, (Object) cTPositionsRequest.accountId) && Intrinsics.EZpvd(this.strategyMode, cTPositionsRequest.strategyMode) && Intrinsics.EZpvd((Object) this.orderBy, (Object) cTPositionsRequest.orderBy) && Intrinsics.EZpvd((Object) this.desc, (Object) cTPositionsRequest.desc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderBy() {
        return this.orderBy;
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
        int iHashCode2 = this.accountId.hashCode();
        Integer num = this.strategyMode;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str = this.orderBy;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.desc;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CTPositionsRequest(strategyId=" + this.strategyId + ", accountId=" + this.accountId + ", strategyMode=" + this.strategyMode + ", orderBy=" + this.orderBy + ", desc=" + this.desc + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.home.data.CTPositionsRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CTPositionsRequest> serializer() {
            return CTPositionsRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CTPositionsRequest(int i, String str, String str2, Integer num, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, CTPositionsRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.strategyId = str;
        if ((i & 2) == 0) {
            this.accountId = "";
        } else {
            this.accountId = str2;
        }
        if ((i & 4) == 0) {
            this.strategyMode = null;
        } else {
            this.strategyMode = num;
        }
        if ((i & 8) == 0) {
            this.orderBy = null;
        } else {
            this.orderBy = str3;
        }
        if ((i & 16) == 0) {
            this.desc = null;
        } else {
            this.desc = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CTPositionsRequest cTPositionsRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, cTPositionsRequest.strategyId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) cTPositionsRequest.accountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, cTPositionsRequest.accountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || cTPositionsRequest.strategyMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, cTPositionsRequest.strategyMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || cTPositionsRequest.orderBy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, cTPositionsRequest.orderBy);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && cTPositionsRequest.desc == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, cTPositionsRequest.desc);
    }

    public CTPositionsRequest(@NotNull String str, @NotNull String str2, Integer num, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.strategyId = str;
        this.accountId = str2;
        this.strategyMode = num;
        this.orderBy = str3;
        this.desc = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (wrap:java.lang.String:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String):void (m)] (LINE:202) call: com.okinc.business.dex.trade.copytrading.home.data.CTPositionsRequest.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CTPositionsRequest(String str, String str2, Integer num, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
