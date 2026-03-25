package com.okinc.business.web3pay.lib.features.uop.model;

import com.okinc.business.web3pay.lib.features.paytransaction.model.FiatAmountDTO;
import com.okinc.business.web3pay.lib.features.paytransaction.model.FiatAmountDTO$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class C2BUopRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final FiatAmountDTO orderFiatAmount;
    private final String price;
    private final int projectId;
    private final String quoteId;
    private final String tokenAmount;
    private final String tokenCoinTypeNo;
    private final String tradeOrderId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C2BUopRequest copy$default(C2BUopRequest c2BUopRequest, String str, String str2, int i, String str3, FiatAmountDTO fiatAmountDTO, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c2BUopRequest.tokenAmount;
        }
        if ((i2 & 2) != 0) {
            str2 = c2BUopRequest.tokenCoinTypeNo;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            i = c2BUopRequest.projectId;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = c2BUopRequest.tradeOrderId;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            fiatAmountDTO = c2BUopRequest.orderFiatAmount;
        }
        FiatAmountDTO fiatAmountDTO2 = fiatAmountDTO;
        if ((i2 & 32) != 0) {
            str4 = c2BUopRequest.quoteId;
        }
        String str8 = str4;
        if ((i2 & 64) != 0) {
            str5 = c2BUopRequest.price;
        }
        return c2BUopRequest.copy(str, str6, i3, str7, fiatAmountDTO2, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tradeOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FiatAmountDTO component5() {
        return this.orderFiatAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2BUopRequest copy(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull FiatAmountDTO fiatAmountDTO, String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(fiatAmountDTO, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new C2BUopRequest(str, str2, i, str3, fiatAmountDTO, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2BUopRequest)) {
            return false;
        }
        C2BUopRequest c2BUopRequest = (C2BUopRequest) obj;
        return Intrinsics.EZpvd((Object) this.tokenAmount, (Object) c2BUopRequest.tokenAmount) && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) c2BUopRequest.tokenCoinTypeNo) && this.projectId == c2BUopRequest.projectId && Intrinsics.EZpvd((Object) this.tradeOrderId, (Object) c2BUopRequest.tradeOrderId) && Intrinsics.EZpvd(this.orderFiatAmount, c2BUopRequest.orderFiatAmount) && Intrinsics.EZpvd((Object) this.quoteId, (Object) c2BUopRequest.quoteId) && Intrinsics.EZpvd((Object) this.price, (Object) c2BUopRequest.price);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FiatAmountDTO getOrderFiatAmount() {
        return this.orderFiatAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getProjectId() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteId() {
        return this.quoteId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAmount() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenCoinTypeNo() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeOrderId() {
        return this.tradeOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.tokenAmount.hashCode();
        int iHashCode2 = this.tokenCoinTypeNo.hashCode();
        int iHashCode3 = Integer.hashCode(this.projectId);
        int iHashCode4 = this.tradeOrderId.hashCode();
        int iHashCode5 = this.orderFiatAmount.hashCode();
        String str = this.quoteId;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.price.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "C2BUopRequest(tokenAmount=" + this.tokenAmount + ", tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", projectId=" + this.projectId + ", tradeOrderId=" + this.tradeOrderId + ", orderFiatAmount=" + this.orderFiatAmount + ", quoteId=" + this.quoteId + ", price=" + this.price + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.uop.model.C2BUopRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<C2BUopRequest> serializer() {
            return C2BUopRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ C2BUopRequest(int i, String str, String str2, int i2, String str3, FiatAmountDTO fiatAmountDTO, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i, 127, C2BUopRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenAmount = str;
        this.tokenCoinTypeNo = str2;
        this.projectId = i2;
        this.tradeOrderId = str3;
        this.orderFiatAmount = fiatAmountDTO;
        this.quoteId = str4;
        this.price = str5;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(C2BUopRequest c2BUopRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, c2BUopRequest.tokenAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, c2BUopRequest.tokenCoinTypeNo);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, c2BUopRequest.projectId);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, c2BUopRequest.tradeOrderId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, FiatAmountDTO$$serializer.INSTANCE, c2BUopRequest.orderFiatAmount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, c2BUopRequest.quoteId);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, c2BUopRequest.price);
    }

    public C2BUopRequest(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull FiatAmountDTO fiatAmountDTO, String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(fiatAmountDTO, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.tokenAmount = str;
        this.tokenCoinTypeNo = str2;
        this.projectId = i;
        this.tradeOrderId = str3;
        this.orderFiatAmount = fiatAmountDTO;
        this.quoteId = str4;
        this.price = str5;
    }
}
