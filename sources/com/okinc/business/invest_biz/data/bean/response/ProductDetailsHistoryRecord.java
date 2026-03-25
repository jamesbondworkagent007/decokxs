package com.okinc.business.invest_biz.data.bean.response;

import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class ProductDetailsHistoryRecord {
    public final InvestAction action;
    public final long blockTime;
    public final List<InvestTokenWithAmount> info;
    public final String txnHash;
    public final String uopHash;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {InvestAction.Companion.serializer(), null, new ArrayListSerializer(InvestTokenWithAmount$$serializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ProductDetailsHistoryRecord() {
        this((InvestAction) null, 0L, (List) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.invest_biz.data.bean.response.ProductDetailsHistoryRecord */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductDetailsHistoryRecord copy$default(ProductDetailsHistoryRecord productDetailsHistoryRecord, InvestAction investAction, long j, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            investAction = productDetailsHistoryRecord.action;
        }
        if ((i & 2) != 0) {
            j = productDetailsHistoryRecord.blockTime;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            list = productDetailsHistoryRecord.info;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            str = productDetailsHistoryRecord.txnHash;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = productDetailsHistoryRecord.uopHash;
        }
        return productDetailsHistoryRecord.KWHzl(investAction, j2, list2, str3, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductDetailsHistoryRecord KWHzl(@NotNull InvestAction investAction, long j, @NotNull List<InvestTokenWithAmount> list, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(investAction, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ProductDetailsHistoryRecord(investAction, j, list, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetailsHistoryRecord)) {
            return false;
        }
        ProductDetailsHistoryRecord productDetailsHistoryRecord = (ProductDetailsHistoryRecord) obj;
        return this.action == productDetailsHistoryRecord.action && this.blockTime == productDetailsHistoryRecord.blockTime && Intrinsics.EZpvd(this.info, productDetailsHistoryRecord.info) && Intrinsics.EZpvd((Object) this.txnHash, (Object) productDetailsHistoryRecord.txnHash) && Intrinsics.EZpvd((Object) this.uopHash, (Object) productDetailsHistoryRecord.uopHash);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.action.hashCode() * 31) + Long.hashCode(this.blockTime)) * 31) + this.info.hashCode()) * 31) + this.txnHash.hashCode()) * 31) + this.uopHash.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProductDetailsHistoryRecord(action=" + this.action + ", blockTime=" + this.blockTime + ", info=" + this.info + ", txnHash=" + this.txnHash + ", uopHash=" + this.uopHash + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.response.ProductDetailsHistoryRecord.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProductDetailsHistoryRecord> serializer() {
            return ProductDetailsHistoryRecord$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ProductDetailsHistoryRecord(int i, InvestAction investAction, long j, List list, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.action = (i & 1) == 0 ? InvestAction.Unknown : investAction;
        if ((i & 2) == 0) {
            this.blockTime = 0L;
        } else {
            this.blockTime = j;
        }
        if ((i & 4) == 0) {
            this.info = yDY.AhwBna();
        } else {
            this.info = list;
        }
        if ((i & 8) == 0) {
            this.txnHash = "";
        } else {
            this.txnHash = str;
        }
        if ((i & 16) == 0) {
            this.uopHash = "";
        } else {
            this.uopHash = str2;
        }
    }

    public static final /* synthetic */ void OLrzqt(ProductDetailsHistoryRecord productDetailsHistoryRecord, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || productDetailsHistoryRecord.action != InvestAction.Unknown) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], productDetailsHistoryRecord.action);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || productDetailsHistoryRecord.blockTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, productDetailsHistoryRecord.blockTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(productDetailsHistoryRecord.info, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], productDetailsHistoryRecord.info);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) productDetailsHistoryRecord.txnHash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, productDetailsHistoryRecord.txnHash);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) productDetailsHistoryRecord.uopHash, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, productDetailsHistoryRecord.uopHash);
    }

    public ProductDetailsHistoryRecord(@NotNull InvestAction investAction, long j, @NotNull List<InvestTokenWithAmount> list, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(investAction, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.action = investAction;
        this.blockTime = j;
        this.info = list;
        this.txnHash = str;
        this.uopHash = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002c: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.data.contants.InvestAction:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.data.contants.InvestAction:0x0004: SGET  A[WRAPPED] (LINE:19) com.okinc.business.invest_biz.data.contants.InvestAction.Unknown com.okinc.business.invest_biz.data.contants.InvestAction) : (r5v0 com.okinc.business.invest_biz.data.contants.InvestAction))
  (wrap:long:0x000c: TERNARY null = ((wrap:int:0x0006: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r6v0 long))
  (wrap:java.util.List:0x0015: TERNARY null = ((wrap:int:0x000d: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0011: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:23)) : (r8v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
 A[MD:(com.okinc.business.invest_biz.data.contants.InvestAction, long, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, java.lang.String, java.lang.String):void (m)] (LINE:17) call: com.okinc.business.invest_biz.data.bean.response.ProductDetailsHistoryRecord.<init>(com.okinc.business.invest_biz.data.contants.InvestAction, long, java.util.List, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ProductDetailsHistoryRecord(InvestAction investAction, long j, List list, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? InvestAction.Unknown : investAction, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? yDY.AhwBna() : list, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2);
    }
}
