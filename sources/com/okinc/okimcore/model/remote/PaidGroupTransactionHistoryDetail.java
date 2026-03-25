package com.okinc.okimcore.model.remote;

import com.okinc.okimcore.model.im.group.TransactionStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class PaidGroupTransactionHistoryDetail {
    public static final int $stable = 0;
    private final String amount;
    private final Long createTime;
    private final Integer currencyId;
    private final String currencySymbol;
    private final Integer decimalPoint;
    private final Long groupId;
    private final Long memberUid;
    private final String nickname;
    private final String paymentTime;
    private final String transactionId;
    private final TransactionStatus transactionStatus;
    private final Long updateTime;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, TransactionStatus.Companion.serializer(), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PaidGroupTransactionHistoryDetail() {
        this((String) null, (Long) null, (Long) null, (String) null, (Integer) null, (Integer) null, (String) null, (String) null, (Long) null, (Long) null, (TransactionStatus) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.transactionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component10() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionStatus component11() {
        return this.transactionStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.paymentTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.memberUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.decimalPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.currencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component9() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaidGroupTransactionHistoryDetail copy(String str, Long l, Long l2, String str2, Integer num, Integer num2, String str3, String str4, Long l3, Long l4, TransactionStatus transactionStatus, String str5) {
        return new PaidGroupTransactionHistoryDetail(str, l, l2, str2, num, num2, str3, str4, l3, l4, transactionStatus, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaidGroupTransactionHistoryDetail)) {
            return false;
        }
        PaidGroupTransactionHistoryDetail paidGroupTransactionHistoryDetail = (PaidGroupTransactionHistoryDetail) obj;
        return Intrinsics.EZpvd((Object) this.transactionId, (Object) paidGroupTransactionHistoryDetail.transactionId) && Intrinsics.EZpvd(this.groupId, paidGroupTransactionHistoryDetail.groupId) && Intrinsics.EZpvd(this.memberUid, paidGroupTransactionHistoryDetail.memberUid) && Intrinsics.EZpvd((Object) this.amount, (Object) paidGroupTransactionHistoryDetail.amount) && Intrinsics.EZpvd(this.decimalPoint, paidGroupTransactionHistoryDetail.decimalPoint) && Intrinsics.EZpvd(this.currencyId, paidGroupTransactionHistoryDetail.currencyId) && Intrinsics.EZpvd((Object) this.currencySymbol, (Object) paidGroupTransactionHistoryDetail.currencySymbol) && Intrinsics.EZpvd((Object) this.nickname, (Object) paidGroupTransactionHistoryDetail.nickname) && Intrinsics.EZpvd(this.createTime, paidGroupTransactionHistoryDetail.createTime) && Intrinsics.EZpvd(this.updateTime, paidGroupTransactionHistoryDetail.updateTime) && this.transactionStatus == paidGroupTransactionHistoryDetail.transactionStatus && Intrinsics.EZpvd((Object) this.paymentTime, (Object) paidGroupTransactionHistoryDetail.paymentTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getDecimalPoint() {
        return this.decimalPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getMemberUid() {
        return this.memberUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymentTime() {
        return this.paymentTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionStatus getTransactionStatus() {
        return this.transactionStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.transactionId;
        int iHashCode = str == null ? 0 : str.hashCode();
        Long l = this.groupId;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        Long l2 = this.memberUid;
        int iHashCode3 = l2 == null ? 0 : l2.hashCode();
        String str2 = this.amount;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.decimalPoint;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        Integer num2 = this.currencyId;
        int iHashCode6 = num2 == null ? 0 : num2.hashCode();
        String str3 = this.currencySymbol;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.nickname;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        Long l3 = this.createTime;
        int iHashCode9 = l3 == null ? 0 : l3.hashCode();
        Long l4 = this.updateTime;
        int iHashCode10 = l4 == null ? 0 : l4.hashCode();
        TransactionStatus transactionStatus = this.transactionStatus;
        int iHashCode11 = transactionStatus == null ? 0 : transactionStatus.hashCode();
        String str5 = this.paymentTime;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PaidGroupTransactionHistoryDetail(transactionId=" + this.transactionId + ", groupId=" + this.groupId + ", memberUid=" + this.memberUid + ", amount=" + this.amount + ", decimalPoint=" + this.decimalPoint + ", currencyId=" + this.currencyId + ", currencySymbol=" + this.currencySymbol + ", nickname=" + this.nickname + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", transactionStatus=" + this.transactionStatus + ", paymentTime=" + this.paymentTime + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.PaidGroupTransactionHistoryDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PaidGroupTransactionHistoryDetail> serializer() {
            return PaidGroupTransactionHistoryDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PaidGroupTransactionHistoryDetail(int i, String str, Long l, Long l2, String str2, Integer num, Integer num2, String str3, String str4, Long l3, Long l4, TransactionStatus transactionStatus, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.transactionId = null;
        } else {
            this.transactionId = str;
        }
        if ((i & 2) == 0) {
            this.groupId = null;
        } else {
            this.groupId = l;
        }
        if ((i & 4) == 0) {
            this.memberUid = null;
        } else {
            this.memberUid = l2;
        }
        if ((i & 8) == 0) {
            this.amount = null;
        } else {
            this.amount = str2;
        }
        if ((i & 16) == 0) {
            this.decimalPoint = null;
        } else {
            this.decimalPoint = num;
        }
        if ((i & 32) == 0) {
            this.currencyId = null;
        } else {
            this.currencyId = num2;
        }
        if ((i & 64) == 0) {
            this.currencySymbol = null;
        } else {
            this.currencySymbol = str3;
        }
        if ((i & 128) == 0) {
            this.nickname = null;
        } else {
            this.nickname = str4;
        }
        if ((i & 256) == 0) {
            this.createTime = null;
        } else {
            this.createTime = l3;
        }
        if ((i & 512) == 0) {
            this.updateTime = null;
        } else {
            this.updateTime = l4;
        }
        if ((i & 1024) == 0) {
            this.transactionStatus = null;
        } else {
            this.transactionStatus = transactionStatus;
        }
        if ((i & 2048) == 0) {
            this.paymentTime = null;
        } else {
            this.paymentTime = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(PaidGroupTransactionHistoryDetail paidGroupTransactionHistoryDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || paidGroupTransactionHistoryDetail.transactionId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, paidGroupTransactionHistoryDetail.transactionId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || paidGroupTransactionHistoryDetail.groupId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, paidGroupTransactionHistoryDetail.groupId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || paidGroupTransactionHistoryDetail.memberUid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, paidGroupTransactionHistoryDetail.memberUid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || paidGroupTransactionHistoryDetail.amount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, paidGroupTransactionHistoryDetail.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || paidGroupTransactionHistoryDetail.decimalPoint != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, paidGroupTransactionHistoryDetail.decimalPoint);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || paidGroupTransactionHistoryDetail.currencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, paidGroupTransactionHistoryDetail.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || paidGroupTransactionHistoryDetail.currencySymbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, paidGroupTransactionHistoryDetail.currencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || paidGroupTransactionHistoryDetail.nickname != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, paidGroupTransactionHistoryDetail.nickname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || paidGroupTransactionHistoryDetail.createTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.INSTANCE, paidGroupTransactionHistoryDetail.createTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || paidGroupTransactionHistoryDetail.updateTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.INSTANCE, paidGroupTransactionHistoryDetail.updateTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || paidGroupTransactionHistoryDetail.transactionStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], paidGroupTransactionHistoryDetail.transactionStatus);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && paidGroupTransactionHistoryDetail.paymentTime == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, paidGroupTransactionHistoryDetail.paymentTime);
    }

    public PaidGroupTransactionHistoryDetail(String str, Long l, Long l2, String str2, Integer num, Integer num2, String str3, String str4, Long l3, Long l4, TransactionStatus transactionStatus, String str5) {
        this.transactionId = str;
        this.groupId = l;
        this.memberUid = l2;
        this.amount = str2;
        this.decimalPoint = num;
        this.currencyId = num2;
        this.currencySymbol = str3;
        this.nickname = str4;
        this.createTime = l3;
        this.updateTime = l4;
        this.transactionStatus = transactionStatus;
        this.paymentTime = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0078: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r15v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0011: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r16v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0021: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r18v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0029: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r19v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0041: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r22v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0049: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r23v0 java.lang.Long))
  (wrap:com.okinc.okimcore.model.im.group.TransactionStatus:?: TERNARY null = ((wrap:int:0x0051: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.group.TransactionStatus) : (r24v0 com.okinc.okimcore.model.im.group.TransactionStatus))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0059: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, com.okinc.okimcore.model.im.group.TransactionStatus, java.lang.String):void (m)] (LINE:9) call: com.okinc.okimcore.model.remote.PaidGroupTransactionHistoryDetail.<init>(java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, com.okinc.okimcore.model.im.group.TransactionStatus, java.lang.String):void type: THIS */
    public /* synthetic */ PaidGroupTransactionHistoryDetail(String str, Long l, Long l2, String str2, Integer num, Integer num2, String str3, String str4, Long l3, Long l4, TransactionStatus transactionStatus, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : l3, (i & 512) != 0 ? null : l4, (i & 1024) != 0 ? null : transactionStatus, (i & 2048) == 0 ? str5 : null);
    }
}
