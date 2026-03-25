package com.okinc.business.defi.biz.core.transaction.bean;

import com.okinc.business.defi.api.model.tx.SignAuthType;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class BatchBroadcastModel {
    private transient List<? extends List<String>> bizId;
    private String estTime;
    private Boolean isBatch;
    private Boolean isBtcMint;
    private Integer protocolId;
    private transient SignAuthType signAuthType;
    private final List<BroadcastBean> txList;
    private String txType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(BroadcastBean$$serializer.INSTANCE), new ArrayListSerializer(new ArrayListSerializer(StringSerializer.INSTANCE)), null, null, null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.business.defi.api.model.tx.SignAuthType", SignAuthType.values())};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BroadcastBean> component1() {
        return this.txList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends java.util.List<java.lang.String>>, java.util.List<java.util.List<java.lang.String>> */
    public final List<List<String>> component2() {
        return this.bizId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.isBatch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.estTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.isBtcMint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.txType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignAuthType component8() {
        return this.signAuthType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BatchBroadcastModel copy(@NotNull List<BroadcastBean> list, List<? extends List<String>> list2, Boolean bool, String str, Boolean bool2, Integer num, String str2, SignAuthType signAuthType) {
        Intrinsics.checkNotNullParameter(list, "");
        return new BatchBroadcastModel(list, list2, bool, str, bool2, num, str2, signAuthType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatchBroadcastModel)) {
            return false;
        }
        BatchBroadcastModel batchBroadcastModel = (BatchBroadcastModel) obj;
        return Intrinsics.EZpvd(this.txList, batchBroadcastModel.txList) && Intrinsics.EZpvd(this.bizId, batchBroadcastModel.bizId) && Intrinsics.EZpvd(this.isBatch, batchBroadcastModel.isBatch) && Intrinsics.EZpvd((Object) this.estTime, (Object) batchBroadcastModel.estTime) && Intrinsics.EZpvd(this.isBtcMint, batchBroadcastModel.isBtcMint) && Intrinsics.EZpvd(this.protocolId, batchBroadcastModel.protocolId) && Intrinsics.EZpvd((Object) this.txType, (Object) batchBroadcastModel.txType) && this.signAuthType == batchBroadcastModel.signAuthType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends java.util.List<java.lang.String>>, java.util.List<java.util.List<java.lang.String>> */
    public final List<List<String>> getBizId() {
        return this.bizId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstTime() {
        return this.estTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getProtocolId() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignAuthType getSignAuthType() {
        return this.signAuthType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BroadcastBean> getTxList() {
        return this.txList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxType() {
        return this.txType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.txList.hashCode();
        List<? extends List<String>> list = this.bizId;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        Boolean bool = this.isBatch;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        String str = this.estTime;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        Boolean bool2 = this.isBtcMint;
        int iHashCode5 = bool2 == null ? 0 : bool2.hashCode();
        Integer num = this.protocolId;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        String str2 = this.txType;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        SignAuthType signAuthType = this.signAuthType;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (signAuthType != null ? signAuthType.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isBatch() {
        return this.isBatch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isBtcMint() {
        return this.isBtcMint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBatch(Boolean bool) {
        this.isBatch = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizId(List<? extends List<String>> list) {
        this.bizId = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBtcMint(Boolean bool) {
        this.isBtcMint = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstTime(String str) {
        this.estTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProtocolId(Integer num) {
        this.protocolId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignAuthType(SignAuthType signAuthType) {
        this.signAuthType = signAuthType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxType(String str) {
        this.txType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BatchBroadcastModel(txList=" + this.txList + ", bizId=" + this.bizId + ", isBatch=" + this.isBatch + ", estTime=" + this.estTime + ", isBtcMint=" + this.isBtcMint + ", protocolId=" + this.protocolId + ", txType=" + this.txType + ", signAuthType=" + this.signAuthType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BatchBroadcastModel> serializer() {
            return BatchBroadcastModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BatchBroadcastModel(int i, List list, List list2, Boolean bool, String str, Boolean bool2, Integer num, String str2, SignAuthType signAuthType, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, BatchBroadcastModel$$serializer.INSTANCE.getDescriptor());
        }
        this.txList = list;
        if ((i & 2) == 0) {
            this.bizId = null;
        } else {
            this.bizId = list2;
        }
        if ((i & 4) == 0) {
            this.isBatch = Boolean.FALSE;
        } else {
            this.isBatch = bool;
        }
        if ((i & 8) == 0) {
            this.estTime = null;
        } else {
            this.estTime = str;
        }
        if ((i & 16) == 0) {
            this.isBtcMint = Boolean.FALSE;
        } else {
            this.isBtcMint = bool2;
        }
        if ((i & 32) == 0) {
            this.protocolId = null;
        } else {
            this.protocolId = num;
        }
        if ((i & 64) == 0) {
            this.txType = null;
        } else {
            this.txType = str2;
        }
        if ((i & 128) == 0) {
            this.signAuthType = null;
        } else {
            this.signAuthType = signAuthType;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(BatchBroadcastModel batchBroadcastModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], batchBroadcastModel.txList);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || batchBroadcastModel.bizId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], batchBroadcastModel.bizId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(batchBroadcastModel.isBatch, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, batchBroadcastModel.isBatch);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || batchBroadcastModel.estTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, batchBroadcastModel.estTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(batchBroadcastModel.isBtcMint, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, batchBroadcastModel.isBtcMint);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || batchBroadcastModel.protocolId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, batchBroadcastModel.protocolId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || batchBroadcastModel.txType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, batchBroadcastModel.txType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && batchBroadcastModel.signAuthType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], batchBroadcastModel.signAuthType);
    }

    public BatchBroadcastModel(@NotNull List<BroadcastBean> list, List<? extends List<String>> list2, Boolean bool, String str, Boolean bool2, Integer num, String str2, SignAuthType signAuthType) {
        Intrinsics.checkNotNullParameter(list, "");
        this.txList = list;
        this.bizId = list2;
        this.isBatch = bool;
        this.estTime = str;
        this.isBtcMint = bool2;
        this.protocolId = num;
        this.txType = str2;
        this.signAuthType = signAuthType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0042: CONSTRUCTOR 
  (r9v0 java.util.List)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r17v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r10v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000e: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r11v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0019: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001d: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r13v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0021: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r14v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:com.okinc.business.defi.api.model.tx.SignAuthType:?: TERNARY null = ((wrap:int:0x002f: ARITH (r17v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r16v0 com.okinc.business.defi.api.model.tx.SignAuthType) : (null com.okinc.business.defi.api.model.tx.SignAuthType))
 A[MD:(java.util.List<com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean>, java.util.List<? extends java.util.List<java.lang.String>>, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.Integer, java.lang.String, com.okinc.business.defi.api.model.tx.SignAuthType):void (m)] (LINE:76) call: com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel.<init>(java.util.List, java.util.List, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.Integer, java.lang.String, com.okinc.business.defi.api.model.tx.SignAuthType):void type: THIS */
    public /* synthetic */ BatchBroadcastModel(List list, List list2, Boolean bool, String str, Boolean bool2, Integer num, String str2, SignAuthType signAuthType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? null : str, (i & 16) != 0 ? Boolean.FALSE : bool2, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : str2, (i & 128) == 0 ? signAuthType : null);
    }
}
