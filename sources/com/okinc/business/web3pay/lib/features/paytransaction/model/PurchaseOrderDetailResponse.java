package com.okinc.business.web3pay.lib.features.paytransaction.model;

import com.okinc.business.web3pay.lib.features.asset.model.PayChainAsset;
import com.okinc.business.web3pay.lib.features.asset.model.PayChainAsset$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class PurchaseOrderDetailResponse {
    private final List<PayChainAsset> balanceList;
    private final TradeOrderDTO tradeOrderDTO;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(PayChainAsset$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.web3pay.lib.features.paytransaction.model.PurchaseOrderDetailResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PurchaseOrderDetailResponse copy$default(PurchaseOrderDetailResponse purchaseOrderDetailResponse, TradeOrderDTO tradeOrderDTO, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            tradeOrderDTO = purchaseOrderDetailResponse.tradeOrderDTO;
        }
        if ((i & 2) != 0) {
            list = purchaseOrderDetailResponse.balanceList;
        }
        return purchaseOrderDetailResponse.copy(tradeOrderDTO, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeOrderDTO component1() {
        return this.tradeOrderDTO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PayChainAsset> component2() {
        return this.balanceList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PurchaseOrderDetailResponse copy(@NotNull TradeOrderDTO tradeOrderDTO, List<PayChainAsset> list) {
        Intrinsics.checkNotNullParameter(tradeOrderDTO, "");
        return new PurchaseOrderDetailResponse(tradeOrderDTO, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseOrderDetailResponse)) {
            return false;
        }
        PurchaseOrderDetailResponse purchaseOrderDetailResponse = (PurchaseOrderDetailResponse) obj;
        return Intrinsics.EZpvd(this.tradeOrderDTO, purchaseOrderDetailResponse.tradeOrderDTO) && Intrinsics.EZpvd(this.balanceList, purchaseOrderDetailResponse.balanceList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PayChainAsset> getBalanceList() {
        return this.balanceList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeOrderDTO getTradeOrderDTO() {
        return this.tradeOrderDTO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.tradeOrderDTO.hashCode();
        List<PayChainAsset> list = this.balanceList;
        return (iHashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PurchaseOrderDetailResponse(tradeOrderDTO=" + this.tradeOrderDTO + ", balanceList=" + this.balanceList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.paytransaction.model.PurchaseOrderDetailResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PurchaseOrderDetailResponse> serializer() {
            return PurchaseOrderDetailResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PurchaseOrderDetailResponse(int i, TradeOrderDTO tradeOrderDTO, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, PurchaseOrderDetailResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.tradeOrderDTO = tradeOrderDTO;
        if ((i & 2) == 0) {
            this.balanceList = null;
        } else {
            this.balanceList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(PurchaseOrderDetailResponse purchaseOrderDetailResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, TradeOrderDTO$$serializer.INSTANCE, purchaseOrderDetailResponse.tradeOrderDTO);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && purchaseOrderDetailResponse.balanceList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], purchaseOrderDetailResponse.balanceList);
    }

    public PurchaseOrderDetailResponse(@NotNull TradeOrderDTO tradeOrderDTO, List<PayChainAsset> list) {
        Intrinsics.checkNotNullParameter(tradeOrderDTO, "");
        this.tradeOrderDTO = tradeOrderDTO;
        this.balanceList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.okinc.business.web3pay.lib.features.paytransaction.model.TradeOrderDTO)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
 A[MD:(com.okinc.business.web3pay.lib.features.paytransaction.model.TradeOrderDTO, java.util.List<com.okinc.business.web3pay.lib.features.asset.model.PayChainAsset>):void (m)] (LINE:9) call: com.okinc.business.web3pay.lib.features.paytransaction.model.PurchaseOrderDetailResponse.<init>(com.okinc.business.web3pay.lib.features.paytransaction.model.TradeOrderDTO, java.util.List):void type: THIS */
    public /* synthetic */ PurchaseOrderDetailResponse(TradeOrderDTO tradeOrderDTO, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tradeOrderDTO, (i & 2) != 0 ? null : list);
    }
}
