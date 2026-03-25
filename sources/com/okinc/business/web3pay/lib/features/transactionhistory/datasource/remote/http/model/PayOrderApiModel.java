package com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model;

import com.okinc.business.web3pay.lib.core.model.OrderStatus;
import com.okinc.business.web3pay.lib.core.model.OrderType;
import com.okinc.business.web3pay.lib.core.model.ReceiverType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C31343lsI;
import o.InterfaceC31382lsv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class PayOrderApiModel implements InterfaceC31382lsv<C31343lsI> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String areaCode;
    private final String chainIndex;
    private final long createTime;
    private final String currencyAmount;
    private final String from;
    private final String orderId;
    private final int orderType;
    private final Integer receiverType;
    private final int status;
    private final String to;
    private final String tokenAddress;
    private final String tokenAmount;
    private final int tokenDecimal;
    private final String tokenSymbol;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component12() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component13() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component14() {
        return this.receiverType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PayOrderApiModel copy(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, String str4, @NotNull String str5, @NotNull String str6, int i2, @NotNull String str7, @NotNull String str8, String str9, int i3, long j, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new PayOrderApiModel(str, i, str2, str3, str4, str5, str6, i2, str7, str8, str9, i3, j, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayOrderApiModel)) {
            return false;
        }
        PayOrderApiModel payOrderApiModel = (PayOrderApiModel) obj;
        return Intrinsics.EZpvd((Object) this.orderId, (Object) payOrderApiModel.orderId) && this.orderType == payOrderApiModel.orderType && Intrinsics.EZpvd((Object) this.chainIndex, (Object) payOrderApiModel.chainIndex) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) payOrderApiModel.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) payOrderApiModel.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) payOrderApiModel.tokenAmount) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) payOrderApiModel.currencyAmount) && this.tokenDecimal == payOrderApiModel.tokenDecimal && Intrinsics.EZpvd((Object) this.from, (Object) payOrderApiModel.from) && Intrinsics.EZpvd((Object) this.to, (Object) payOrderApiModel.to) && Intrinsics.EZpvd((Object) this.areaCode, (Object) payOrderApiModel.areaCode) && this.status == payOrderApiModel.status && this.createTime == payOrderApiModel.createTime && Intrinsics.EZpvd(this.receiverType, payOrderApiModel.receiverType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAreaCode() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyAmount() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getReceiverType() {
        return this.receiverType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAmount() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTokenDecimal() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.orderId.hashCode();
        int iHashCode2 = Integer.hashCode(this.orderType);
        int iHashCode3 = this.chainIndex.hashCode();
        int iHashCode4 = this.tokenSymbol.hashCode();
        String str = this.tokenAddress;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        int iHashCode6 = this.tokenAmount.hashCode();
        int iHashCode7 = this.currencyAmount.hashCode();
        int iHashCode8 = Integer.hashCode(this.tokenDecimal);
        int iHashCode9 = this.from.hashCode();
        int iHashCode10 = this.to.hashCode();
        String str2 = this.areaCode;
        int iHashCode11 = str2 == null ? 0 : str2.hashCode();
        int iHashCode12 = Integer.hashCode(this.status);
        int iHashCode13 = Long.hashCode(this.createTime);
        Integer num = this.receiverType;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PayOrderApiModel(orderId=" + this.orderId + ", orderType=" + this.orderType + ", chainIndex=" + this.chainIndex + ", tokenSymbol=" + this.tokenSymbol + ", tokenAddress=" + this.tokenAddress + ", tokenAmount=" + this.tokenAmount + ", currencyAmount=" + this.currencyAmount + ", tokenDecimal=" + this.tokenDecimal + ", from=" + this.from + ", to=" + this.to + ", areaCode=" + this.areaCode + ", status=" + this.status + ", createTime=" + this.createTime + ", receiverType=" + this.receiverType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.PayOrderApiModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PayOrderApiModel> serializer() {
            return PayOrderApiModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PayOrderApiModel(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, int i3, String str7, String str8, String str9, int i4, long j, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (16383 != (i & 16383)) {
            PluginExceptionsKt.throwMissingFieldException(i, 16383, PayOrderApiModel$$serializer.INSTANCE.getDescriptor());
        }
        this.orderId = str;
        this.orderType = i2;
        this.chainIndex = str2;
        this.tokenSymbol = str3;
        this.tokenAddress = str4;
        this.tokenAmount = str5;
        this.currencyAmount = str6;
        this.tokenDecimal = i3;
        this.from = str7;
        this.to = str8;
        this.areaCode = str9;
        this.status = i4;
        this.createTime = j;
        this.receiverType = num;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(PayOrderApiModel payOrderApiModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, payOrderApiModel.getOrderId());
        compositeEncoder.encodeIntElement(serialDescriptor, 1, payOrderApiModel.orderType);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, payOrderApiModel.chainIndex);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, payOrderApiModel.tokenSymbol);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, payOrderApiModel.tokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, payOrderApiModel.tokenAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, payOrderApiModel.currencyAmount);
        compositeEncoder.encodeIntElement(serialDescriptor, 7, payOrderApiModel.tokenDecimal);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, payOrderApiModel.from);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, payOrderApiModel.to);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, payOrderApiModel.areaCode);
        compositeEncoder.encodeIntElement(serialDescriptor, 11, payOrderApiModel.status);
        compositeEncoder.encodeLongElement(serialDescriptor, 12, payOrderApiModel.createTime);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, payOrderApiModel.receiverType);
    }

    public PayOrderApiModel(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, String str4, @NotNull String str5, @NotNull String str6, int i2, @NotNull String str7, @NotNull String str8, String str9, int i3, long j, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.orderId = str;
        this.orderType = i;
        this.chainIndex = str2;
        this.tokenSymbol = str3;
        this.tokenAddress = str4;
        this.tokenAmount = str5;
        this.currencyAmount = str6;
        this.tokenDecimal = i2;
        this.from = str7;
        this.to = str8;
        this.areaCode = str9;
        this.status = i3;
        this.createTime = j;
        this.receiverType = num;
    }

    /* JADX DEBUG: Method merged with bridge method: toDomainModel()Ljava/lang/Object; */
    @Override // o.InterfaceC31382lsv
    public C31343lsI toDomainModel() {
        return new C31343lsI(getOrderId(), OrderType.Companion.OLrzqt(this.orderType), this.chainIndex, this.tokenSymbol, this.tokenAddress, this.tokenAmount, this.tokenDecimal, this.currencyAmount, ReceiverType.Companion.EZpvd(this.receiverType), this.from, this.to, this.areaCode, OrderStatus.Companion.EZpvd(this.status), this.createTime);
    }
}
