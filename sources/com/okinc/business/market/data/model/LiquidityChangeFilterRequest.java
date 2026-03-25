package com.okinc.business.market.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class LiquidityChangeFilterRequest {
    public final boolean isDescOrder;
    public final String lastItemId;
    public final String orderBy;
    public final String pageSize;
    public final TokenFilterData tokenFilter;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LiquidityChangeFilterRequest copy$default(LiquidityChangeFilterRequest liquidityChangeFilterRequest, TokenFilterData tokenFilterData, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            tokenFilterData = liquidityChangeFilterRequest.tokenFilter;
        }
        if ((i & 2) != 0) {
            str = liquidityChangeFilterRequest.lastItemId;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = liquidityChangeFilterRequest.pageSize;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            z = liquidityChangeFilterRequest.isDescOrder;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str3 = liquidityChangeFilterRequest.orderBy;
        }
        return liquidityChangeFilterRequest.AEQbTJ(tokenFilterData, str4, str5, z2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiquidityChangeFilterRequest AEQbTJ(@NotNull TokenFilterData tokenFilterData, @NotNull String str, @NotNull String str2, boolean z, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(tokenFilterData, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new LiquidityChangeFilterRequest(tokenFilterData, str, str2, z, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiquidityChangeFilterRequest)) {
            return false;
        }
        LiquidityChangeFilterRequest liquidityChangeFilterRequest = (LiquidityChangeFilterRequest) obj;
        return Intrinsics.EZpvd(this.tokenFilter, liquidityChangeFilterRequest.tokenFilter) && Intrinsics.EZpvd((Object) this.lastItemId, (Object) liquidityChangeFilterRequest.lastItemId) && Intrinsics.EZpvd((Object) this.pageSize, (Object) liquidityChangeFilterRequest.pageSize) && this.isDescOrder == liquidityChangeFilterRequest.isDescOrder && Intrinsics.EZpvd((Object) this.orderBy, (Object) liquidityChangeFilterRequest.orderBy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.tokenFilter.hashCode() * 31) + this.lastItemId.hashCode()) * 31) + this.pageSize.hashCode()) * 31) + Boolean.hashCode(this.isDescOrder)) * 31) + this.orderBy.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LiquidityChangeFilterRequest(tokenFilter=" + this.tokenFilter + ", lastItemId=" + this.lastItemId + ", pageSize=" + this.pageSize + ", isDescOrder=" + this.isDescOrder + ", orderBy=" + this.orderBy + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.LiquidityChangeFilterRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LiquidityChangeFilterRequest> serializer() {
            return LiquidityChangeFilterRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LiquidityChangeFilterRequest(int i, TokenFilterData tokenFilterData, String str, String str2, boolean z, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, LiquidityChangeFilterRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenFilter = tokenFilterData;
        if ((i & 2) == 0) {
            this.lastItemId = "";
        } else {
            this.lastItemId = str;
        }
        if ((i & 4) == 0) {
            this.pageSize = "100";
        } else {
            this.pageSize = str2;
        }
        if ((i & 8) == 0) {
            this.isDescOrder = true;
        } else {
            this.isDescOrder = z;
        }
        if ((i & 16) == 0) {
            this.orderBy = "";
        } else {
            this.orderBy = str3;
        }
    }

    public static final /* synthetic */ void OLrzqt(LiquidityChangeFilterRequest liquidityChangeFilterRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, TokenFilterData$$serializer.INSTANCE, liquidityChangeFilterRequest.tokenFilter);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) liquidityChangeFilterRequest.lastItemId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, liquidityChangeFilterRequest.lastItemId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) liquidityChangeFilterRequest.pageSize, (Object) "100")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, liquidityChangeFilterRequest.pageSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !liquidityChangeFilterRequest.isDescOrder) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, liquidityChangeFilterRequest.isDescOrder);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) liquidityChangeFilterRequest.orderBy, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, liquidityChangeFilterRequest.orderBy);
    }

    public LiquidityChangeFilterRequest(@NotNull TokenFilterData tokenFilterData, @NotNull String str, @NotNull String str2, boolean z, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(tokenFilterData, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.tokenFilter = tokenFilterData;
        this.lastItemId = str;
        this.pageSize = str2;
        this.isDescOrder = z;
        this.orderBy = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r8v0 com.okinc.business.market.data.model.TokenFilterData)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("100") : (r10v0 java.lang.String))
  (wrap:boolean:0x0015: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r11v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
 A[MD:(com.okinc.business.market.data.model.TokenFilterData, java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:7) call: com.okinc.business.market.data.model.LiquidityChangeFilterRequest.<init>(com.okinc.business.market.data.model.TokenFilterData, java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ LiquidityChangeFilterRequest(TokenFilterData tokenFilterData, String str, String str2, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tokenFilterData, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "100" : str2, (i & 8) != 0 ? true : z, (i & 16) != 0 ? "" : str3);
    }
}
