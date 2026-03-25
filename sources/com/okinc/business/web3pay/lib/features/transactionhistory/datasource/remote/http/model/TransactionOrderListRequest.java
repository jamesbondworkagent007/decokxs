package com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class TransactionOrderListRequest {
    private final String chainIndex;
    private final String cursor;
    private final Long endTime;
    private final int limit;
    private final List<Integer> orderTypeList;
    private final String productCode;
    private final Long startTime;
    private final String tokenCoinTypeNo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component4() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component5() {
        return this.orderTypeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.productCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.cursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionOrderListRequest copy(String str, String str2, Long l, Long l2, List<Integer> list, String str3, String str4, int i) {
        return new TransactionOrderListRequest(str, str2, l, l2, list, str3, str4, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionOrderListRequest)) {
            return false;
        }
        TransactionOrderListRequest transactionOrderListRequest = (TransactionOrderListRequest) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) transactionOrderListRequest.chainIndex) && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) transactionOrderListRequest.tokenCoinTypeNo) && Intrinsics.EZpvd(this.startTime, transactionOrderListRequest.startTime) && Intrinsics.EZpvd(this.endTime, transactionOrderListRequest.endTime) && Intrinsics.EZpvd(this.orderTypeList, transactionOrderListRequest.orderTypeList) && Intrinsics.EZpvd((Object) this.productCode, (Object) transactionOrderListRequest.productCode) && Intrinsics.EZpvd((Object) this.cursor, (Object) transactionOrderListRequest.cursor) && this.limit == transactionOrderListRequest.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCursor() {
        return this.cursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getEndTime() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLimit() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getOrderTypeList() {
        return this.orderTypeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProductCode() {
        return this.productCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getStartTime() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenCoinTypeNo() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.chainIndex;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.tokenCoinTypeNo;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Long l = this.startTime;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        Long l2 = this.endTime;
        int iHashCode4 = l2 == null ? 0 : l2.hashCode();
        List<Integer> list = this.orderTypeList;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        String str3 = this.productCode;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.cursor;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + Integer.hashCode(this.limit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionOrderListRequest(chainIndex=" + this.chainIndex + ", tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", orderTypeList=" + this.orderTypeList + ", productCode=" + this.productCode + ", cursor=" + this.cursor + ", limit=" + this.limit + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.TransactionOrderListRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TransactionOrderListRequest> serializer() {
            return TransactionOrderListRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TransactionOrderListRequest(int i, String str, String str2, Long l, Long l2, List list, String str3, String str4, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (128 != (i & 128)) {
            PluginExceptionsKt.throwMissingFieldException(i, 128, TransactionOrderListRequest$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.chainIndex = null;
        } else {
            this.chainIndex = str;
        }
        if ((i & 2) == 0) {
            this.tokenCoinTypeNo = null;
        } else {
            this.tokenCoinTypeNo = str2;
        }
        if ((i & 4) == 0) {
            this.startTime = null;
        } else {
            this.startTime = l;
        }
        if ((i & 8) == 0) {
            this.endTime = null;
        } else {
            this.endTime = l2;
        }
        if ((i & 16) == 0) {
            this.orderTypeList = null;
        } else {
            this.orderTypeList = list;
        }
        if ((i & 32) == 0) {
            this.productCode = null;
        } else {
            this.productCode = str3;
        }
        if ((i & 64) == 0) {
            this.cursor = null;
        } else {
            this.cursor = str4;
        }
        this.limit = i2;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(TransactionOrderListRequest transactionOrderListRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || transactionOrderListRequest.chainIndex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, transactionOrderListRequest.chainIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || transactionOrderListRequest.tokenCoinTypeNo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, transactionOrderListRequest.tokenCoinTypeNo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || transactionOrderListRequest.startTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, transactionOrderListRequest.startTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || transactionOrderListRequest.endTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, transactionOrderListRequest.endTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || transactionOrderListRequest.orderTypeList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], transactionOrderListRequest.orderTypeList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || transactionOrderListRequest.productCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, transactionOrderListRequest.productCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || transactionOrderListRequest.cursor != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, transactionOrderListRequest.cursor);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 7, transactionOrderListRequest.limit);
    }

    public TransactionOrderListRequest(String str, String str2, Long l, Long l2, List<Integer> list, String str3, String str4, int i) {
        this.chainIndex = str;
        this.tokenCoinTypeNo = str2;
        this.startTime = l;
        this.endTime = l2;
        this.orderTypeList = list;
        this.productCode = str3;
        this.cursor = str4;
        this.limit = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000f: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r14v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0016: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r15v0 java.lang.Long))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001d: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r16v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (r19v0 int)
 A[MD:(java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.util.List<java.lang.Integer>, java.lang.String, java.lang.String, int):void (m)] (LINE:8) call: com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.TransactionOrderListRequest.<init>(java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.util.List, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ TransactionOrderListRequest(String str, String str2, Long l, Long l2, List list, String str3, String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : l, (i2 & 8) != 0 ? null : l2, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : str4, i);
    }
}
