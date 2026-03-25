package com.okinc.business.invest_biz.data.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class ProductJumpParam {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final long aggregateId;
    public final int investmentCategory;
    public final long investmentId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ProductJumpParam() {
        this(0L, 0L, 0, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ProductJumpParam copy$default(ProductJumpParam productJumpParam, long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = productJumpParam.investmentId;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = productJumpParam.aggregateId;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            i = productJumpParam.investmentCategory;
        }
        return productJumpParam.OLrzqt(j3, j4, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductJumpParam OLrzqt(long j, long j2, int i) {
        return new ProductJumpParam(j, j2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductJumpParam)) {
            return false;
        }
        ProductJumpParam productJumpParam = (ProductJumpParam) obj;
        return this.investmentId == productJumpParam.investmentId && this.aggregateId == productJumpParam.aggregateId && this.investmentCategory == productJumpParam.investmentCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Long.hashCode(this.investmentId) * 31) + Long.hashCode(this.aggregateId)) * 31) + Integer.hashCode(this.investmentCategory);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProductJumpParam(investmentId=" + this.investmentId + ", aggregateId=" + this.aggregateId + ", investmentCategory=" + this.investmentCategory + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.ProductJumpParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProductJumpParam> serializer() {
            return ProductJumpParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ProductJumpParam(int i, long j, long j2, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.investmentId = -1L;
        } else {
            this.investmentId = j;
        }
        if ((i & 2) == 0) {
            this.aggregateId = -1L;
        } else {
            this.aggregateId = j2;
        }
        if ((i & 4) == 0) {
            this.investmentCategory = -1;
        } else {
            this.investmentCategory = i2;
        }
    }

    public static final /* synthetic */ void OLrzqt(ProductJumpParam productJumpParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || productJumpParam.investmentId != -1) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, productJumpParam.investmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || productJumpParam.aggregateId != -1) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, productJumpParam.aggregateId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && productJumpParam.investmentCategory == -1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 2, productJumpParam.investmentCategory);
    }

    public ProductJumpParam(long j, long j2, int i) {
        this.investmentId = j;
        this.aggregateId = j2;
        this.investmentCategory = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r5v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r7v0 long) : (-1 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r9v0 int))
 A[MD:(long, long, int):void (m)] (LINE:503) call: com.okinc.business.invest_biz.data.bean.ProductJumpParam.<init>(long, long, int):void type: THIS */
    public /* synthetic */ ProductJumpParam(long j, long j2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1L : j, (i2 & 2) == 0 ? j2 : -1L, (i2 & 4) != 0 ? -1 : i);
    }
}
