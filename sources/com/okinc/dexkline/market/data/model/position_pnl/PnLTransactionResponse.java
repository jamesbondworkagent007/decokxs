package com.okinc.dexkline.market.data.model.position_pnl;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class PnLTransactionResponse {
    private final boolean hasNext;
    private final boolean supportHistory;
    private final List<PnLTransactionData> transactions;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(PnLTransactionData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PnLTransactionResponse() {
        this(false, false, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.dexkline.market.data.model.position_pnl.PnLTransactionResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PnLTransactionResponse copy$default(PnLTransactionResponse pnLTransactionResponse, boolean z, boolean z2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = pnLTransactionResponse.hasNext;
        }
        if ((i & 2) != 0) {
            z2 = pnLTransactionResponse.supportHistory;
        }
        if ((i & 4) != 0) {
            list = pnLTransactionResponse.transactions;
        }
        return pnLTransactionResponse.copy(z, z2, list);
    }

    @SerialName("hasNext")
    public static /* synthetic */ void getHasNext$annotations() {
    }

    @SerialName("isHistorySupported")
    public static /* synthetic */ void getSupportHistory$annotations() {
    }

    @SerialName("transactions")
    public static /* synthetic */ void getTransactions$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.hasNext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.supportHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PnLTransactionData> component3() {
        return this.transactions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PnLTransactionResponse copy(boolean z, boolean z2, @NotNull List<PnLTransactionData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new PnLTransactionResponse(z, z2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PnLTransactionResponse)) {
            return false;
        }
        PnLTransactionResponse pnLTransactionResponse = (PnLTransactionResponse) obj;
        return this.hasNext == pnLTransactionResponse.hasNext && this.supportHistory == pnLTransactionResponse.supportHistory && Intrinsics.EZpvd(this.transactions, pnLTransactionResponse.transactions);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasNext() {
        return this.hasNext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportHistory() {
        return this.supportHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PnLTransactionData> getTransactions() {
        return this.transactions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Boolean.hashCode(this.hasNext) * 31) + Boolean.hashCode(this.supportHistory)) * 31) + this.transactions.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PnLTransactionResponse(hasNext=" + this.hasNext + ", supportHistory=" + this.supportHistory + ", transactions=" + this.transactions + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.data.model.position_pnl.PnLTransactionResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PnLTransactionResponse> serializer() {
            return PnLTransactionResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PnLTransactionResponse(int i, boolean z, boolean z2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.hasNext = false;
        } else {
            this.hasNext = z;
        }
        if ((i & 2) == 0) {
            this.supportHistory = false;
        } else {
            this.supportHistory = z2;
        }
        if ((i & 4) == 0) {
            this.transactions = yDY.AhwBna();
        } else {
            this.transactions = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKKLine_kline_impl(PnLTransactionResponse pnLTransactionResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || pnLTransactionResponse.hasNext) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, pnLTransactionResponse.hasNext);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || pnLTransactionResponse.supportHistory) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, pnLTransactionResponse.supportHistory);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(pnLTransactionResponse.transactions, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], pnLTransactionResponse.transactions);
    }

    public PnLTransactionResponse(boolean z, boolean z2, @NotNull List<PnLTransactionData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.hasNext = z;
        this.supportHistory = z2;
        this.transactions = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:15)) : (r4v0 java.util.List))
 A[MD:(boolean, boolean, java.util.List<com.okinc.dexkline.market.data.model.position_pnl.PnLTransactionData>):void (m)] (LINE:9) call: com.okinc.dexkline.market.data.model.position_pnl.PnLTransactionResponse.<init>(boolean, boolean, java.util.List):void type: THIS */
    public /* synthetic */ PnLTransactionResponse(boolean z, boolean z2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? yDY.AhwBna() : list);
    }
}
