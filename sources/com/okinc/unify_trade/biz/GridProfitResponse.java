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
public final class GridProfitResponse {
    private String baseGridProfit;
    private String quoteGridProfit;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GridProfitResponse() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GridProfitResponse copy$default(GridProfitResponse gridProfitResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gridProfitResponse.baseGridProfit;
        }
        if ((i & 2) != 0) {
            str2 = gridProfitResponse.quoteGridProfit;
        }
        return gridProfitResponse.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.baseGridProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.quoteGridProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridProfitResponse copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new GridProfitResponse(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridProfitResponse)) {
            return false;
        }
        GridProfitResponse gridProfitResponse = (GridProfitResponse) obj;
        return Intrinsics.EZpvd((Object) this.baseGridProfit, (Object) gridProfitResponse.baseGridProfit) && Intrinsics.EZpvd((Object) this.quoteGridProfit, (Object) gridProfitResponse.quoteGridProfit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseGridProfit() {
        return this.baseGridProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteGridProfit() {
        return this.quoteGridProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.baseGridProfit.hashCode() * 31) + this.quoteGridProfit.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseGridProfit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseGridProfit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteGridProfit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteGridProfit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GridProfitResponse(baseGridProfit=" + this.baseGridProfit + ", quoteGridProfit=" + this.quoteGridProfit + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.GridProfitResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GridProfitResponse> serializer() {
            return GridProfitResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GridProfitResponse(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.baseGridProfit = "";
        } else {
            this.baseGridProfit = str;
        }
        if ((i & 2) == 0) {
            this.quoteGridProfit = "";
        } else {
            this.quoteGridProfit = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(GridProfitResponse gridProfitResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) gridProfitResponse.baseGridProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, gridProfitResponse.baseGridProfit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) gridProfitResponse.quoteGridProfit, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, gridProfitResponse.quoteGridProfit);
    }

    public GridProfitResponse(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.baseGridProfit = str;
        this.quoteGridProfit = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:1815) call: com.okinc.unify_trade.biz.GridProfitResponse.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ GridProfitResponse(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
