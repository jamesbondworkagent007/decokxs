package com.okinc.business.invest_biz.data.bean.response;

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
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class ProductDetailsHistoryResponse {
    public final List<ProductDetailsHistoryRecord> records;
    public final int total;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(ProductDetailsHistoryRecord$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.response.ProductDetailsHistoryResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductDetailsHistoryResponse copy$default(ProductDetailsHistoryResponse productDetailsHistoryResponse, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = productDetailsHistoryResponse.total;
        }
        if ((i2 & 2) != 0) {
            list = productDetailsHistoryResponse.records;
        }
        return productDetailsHistoryResponse.AEQbTJ(i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductDetailsHistoryResponse AEQbTJ(int i, @NotNull List<ProductDetailsHistoryRecord> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new ProductDetailsHistoryResponse(i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetailsHistoryResponse)) {
            return false;
        }
        ProductDetailsHistoryResponse productDetailsHistoryResponse = (ProductDetailsHistoryResponse) obj;
        return this.total == productDetailsHistoryResponse.total && Intrinsics.EZpvd(this.records, productDetailsHistoryResponse.records);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.total) * 31) + this.records.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProductDetailsHistoryResponse(total=" + this.total + ", records=" + this.records + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.response.ProductDetailsHistoryResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProductDetailsHistoryResponse> serializer() {
            return ProductDetailsHistoryResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ProductDetailsHistoryResponse(int i, int i2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, ProductDetailsHistoryResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.total = i2;
        if ((i & 2) == 0) {
            this.records = yDY.AhwBna();
        } else {
            this.records = list;
        }
    }

    public static final /* synthetic */ void AEQbTJ(ProductDetailsHistoryResponse productDetailsHistoryResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeIntElement(serialDescriptor, 0, productDetailsHistoryResponse.total);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(productDetailsHistoryResponse.records, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], productDetailsHistoryResponse.records);
    }

    public ProductDetailsHistoryResponse(int i, @NotNull List<ProductDetailsHistoryRecord> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.total = i;
        this.records = list;
    }
}
