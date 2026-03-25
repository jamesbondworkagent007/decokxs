package com.okinc.business.market.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class BatchImportAddressListResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final int aliasSize;
    public final int totalSize;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Illegal instructions before constructor call */
    public BatchImportAddressListResponse() {
        int i = 0;
        this(i, i, 3, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BatchImportAddressListResponse copy$default(BatchImportAddressListResponse batchImportAddressListResponse, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = batchImportAddressListResponse.totalSize;
        }
        if ((i3 & 2) != 0) {
            i2 = batchImportAddressListResponse.aliasSize;
        }
        return batchImportAddressListResponse.copydefault(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.totalSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BatchImportAddressListResponse copydefault(int i, int i2) {
        return new BatchImportAddressListResponse(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatchImportAddressListResponse)) {
            return false;
        }
        BatchImportAddressListResponse batchImportAddressListResponse = (BatchImportAddressListResponse) obj;
        return this.totalSize == batchImportAddressListResponse.totalSize && this.aliasSize == batchImportAddressListResponse.aliasSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.totalSize) * 31) + Integer.hashCode(this.aliasSize);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BatchImportAddressListResponse(totalSize=" + this.totalSize + ", aliasSize=" + this.aliasSize + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.BatchImportAddressListResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BatchImportAddressListResponse> serializer() {
            return BatchImportAddressListResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BatchImportAddressListResponse(int i, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.totalSize = 0;
        } else {
            this.totalSize = i2;
        }
        if ((i & 2) == 0) {
            this.aliasSize = 0;
        } else {
            this.aliasSize = i3;
        }
    }

    public static final /* synthetic */ void OLrzqt(BatchImportAddressListResponse batchImportAddressListResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || batchImportAddressListResponse.totalSize != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, batchImportAddressListResponse.totalSize);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && batchImportAddressListResponse.aliasSize == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 1, batchImportAddressListResponse.aliasSize);
    }

    public BatchImportAddressListResponse(int i, int i2) {
        this.totalSize = i;
        this.aliasSize = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(int, int):void (m)] (LINE:7) call: com.okinc.business.market.data.model.BatchImportAddressListResponse.<init>(int, int):void type: THIS */
    public /* synthetic */ BatchImportAddressListResponse(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
