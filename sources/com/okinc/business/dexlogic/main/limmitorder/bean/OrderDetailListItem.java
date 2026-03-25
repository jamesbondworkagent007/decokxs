package com.okinc.business.dexlogic.main.limmitorder.bean;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dex.trade.order.domain.model.OrderSubStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C23271hvA;
import o.C23313hvq;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class OrderDetailListItem {
    public static final String BALANCE_LOW = "1";
    public static final String BROADCAST_FAILED = "2";
    public static final String SAFEERC20 = "3";
    public static final String SLIP_OUT = "6";
    public static final String TIME_OUT = "4";
    public static final String UNKNOWN_ERROR = "5";
    private String amount;
    private final String decimals;
    private String failReason;
    private boolean isPay;
    private String orderId;
    private String status;
    private String tokenIcon;
    private String tokenSymbol;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isPay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.failReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.decimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderDetailListItem copy(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new OrderDetailListItem(z, str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderDetailListItem)) {
            return false;
        }
        OrderDetailListItem orderDetailListItem = (OrderDetailListItem) obj;
        return this.isPay == orderDetailListItem.isPay && Intrinsics.EZpvd((Object) this.tokenIcon, (Object) orderDetailListItem.tokenIcon) && Intrinsics.EZpvd((Object) this.amount, (Object) orderDetailListItem.amount) && Intrinsics.EZpvd((Object) this.status, (Object) orderDetailListItem.status) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) orderDetailListItem.tokenSymbol) && Intrinsics.EZpvd((Object) this.orderId, (Object) orderDetailListItem.orderId) && Intrinsics.EZpvd((Object) this.failReason, (Object) orderDetailListItem.failReason) && Intrinsics.EZpvd((Object) this.decimals, (Object) orderDetailListItem.decimals);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDecimals() {
        return this.decimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFailReason() {
        return this.failReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenIcon() {
        return this.tokenIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((Boolean.hashCode(this.isPay) * 31) + this.tokenIcon.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.status.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + this.orderId.hashCode()) * 31) + this.failReason.hashCode()) * 31) + this.decimals.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPay() {
        return this.isPay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFailReason(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.failReason = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPay(boolean z) {
        this.isPay = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.status = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenIcon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrderDetailListItem(isPay=" + this.isPay + ", tokenIcon=" + this.tokenIcon + ", amount=" + this.amount + ", status=" + this.status + ", tokenSymbol=" + this.tokenSymbol + ", orderId=" + this.orderId + ", failReason=" + this.failReason + ", decimals=" + this.decimals + ")";
    }

    public /* synthetic */ OrderDetailListItem(int i, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i, 255, OrderDetailListItem$$serializer.INSTANCE.getDescriptor());
        }
        this.isPay = z;
        this.tokenIcon = str;
        this.amount = str2;
        this.status = str3;
        this.tokenSymbol = str4;
        this.orderId = str5;
        this.failReason = str6;
        this.decimals = str7;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(OrderDetailListItem orderDetailListItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, orderDetailListItem.isPay);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, orderDetailListItem.tokenIcon);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, orderDetailListItem.amount);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, orderDetailListItem.status);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, orderDetailListItem.tokenSymbol);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, orderDetailListItem.orderId);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, orderDetailListItem.failReason);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, orderDetailListItem.decimals);
    }

    public OrderDetailListItem(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.isPay = z;
        this.tokenIcon = str;
        this.amount = str2;
        this.status = str3;
        this.tokenSymbol = str4;
        this.orderId = str5;
        this.failReason = str6;
        this.decimals = str7;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OrderDetailListItem> serializer() {
            return OrderDetailListItem$$serializer.INSTANCE;
        }
    }

    public final String showFromCoinAmountWithoutSymbol() {
        StringBuilder sb;
        String str;
        C23271hvA c23271hvA = C23271hvA.copydefault;
        String str2 = this.amount;
        String str3 = this.decimals;
        if (str3.length() == 0) {
            str3 = "12";
        }
        String strEZpvd = c23271hvA.EZpvd(str2, str3);
        if (!Intrinsics.EZpvd((Object) this.status, (Object) String.valueOf(OrderSubStatus.Creating.getStatus())) && this.amount.length() != 0 && !C23313hvq.copydefault(this.amount, MultiTransferSignData.DEFAULT_INTERVAL)) {
            if (this.isPay) {
                sb = new StringBuilder();
                str = "-";
            } else {
                sb = new StringBuilder();
                str = Marker.ANY_NON_NULL_MARKER;
            }
            sb.append(str);
            sb.append(strEZpvd);
            return sb.toString();
        }
        return "--";
    }
}
