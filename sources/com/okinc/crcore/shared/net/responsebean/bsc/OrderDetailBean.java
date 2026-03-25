package com.okinc.crcore.shared.net.responsebean.bsc;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.crcore.coreapi.net.responsebean.bsc.B2CDetailExtraParamsResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.ConvertOrderDetailResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.DexOrderDetailResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.FxRateConversionResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.LocalizedFeeInfoResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.OrderDetailResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.SubOrderDetailResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.UnFreezeDateResponseBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56403yEb;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class OrderDetailBean {
    private final String accountType;
    private final String bankLogo;
    private final String bankName;
    private final String bankNumber;
    private final String baseAmount;
    private final String baseCurrencyName;
    private final String baseCurrencyNightUrl;
    private final String baseCurrencySymbol;
    private final String baseCurrencyUrl;
    private final String businessErrorCode;
    private final int categoryCode;
    private final String chain;
    private final String channelFee;
    private final String channelIcon;
    private final String channelIconNight;
    private final String completedTime;
    private final String convertBaseColorfulIconUrl;
    private final ConvertOrderDetailBean convertOrderDetail;
    private final long createDate;
    private final String customerUrl;
    private final String depositName;
    private final String depositPlatformCode;
    private final String description;
    private final DexOrderDetailBean dexOrderDetail;
    private final String errorCode;
    private final String estimateBaseAmount;
    private final String expireDate;
    private final String expireSeconds;
    private final B2CDetailExtraParamsBean extParams;
    private final String failReason;
    private final String fee;
    private final String frequency;
    private final FxRateConversionBean fxRateConversion;
    private final String iconUrl;
    private final boolean isConvert;
    private final String last4;
    private final List<LocalizedFeeInfoBean> localizedFeeInfo;
    private final String maxPurchaseTime;
    private final String minPurchaseTime;
    private final String orderNo;
    private final int orderType;
    private final String payCardNumber;
    private final String paymentMethod;
    private final String paymentMethodNightUrl;
    private final String paymentMethodUrl;
    private final String planId;
    private final String price;
    private final String priceType;
    private final String quoteAmount;
    private final String quoteCurrencySymbol;
    private final String quoteCurrencyUrl;
    private final String quoteSymbol;
    private final String realAmount;
    private final String requestAmount;
    private final String requestCurrencySign;
    private final String requestCurrencySymbol;
    private final boolean showCustomer;
    private final int status;
    private final List<SubOrderDetailBean> subOrders;
    private final String totalFee;
    private final String tradeType;
    private final boolean type;
    private final UnFreezeDateBean unFreezeDateResponse;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(SubOrderDetailBean$$serializer.INSTANCE), null, new ArrayListSerializer(LocalizedFeeInfoBean$$serializer.INSTANCE), null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OrderDetailBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0L, false, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, 0, (String) null, false, (FxRateConversionBean) null, (UnFreezeDateBean) null, (ConvertOrderDetailBean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (B2CDetailExtraParamsBean) null, (String) null, (String) null, (List) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (DexOrderDetailBean) null, -1, Integer.MAX_VALUE, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.depositName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.categoryCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.estimateBaseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.expireSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.expireDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.chain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.channelFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.baseCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.convertBaseColorfulIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.maxPurchaseTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.minPurchaseTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.orderNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.paymentMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.payCardNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.priceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.quoteCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.baseCurrencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.quoteCurrencyUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.quoteSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component32() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component33() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component34() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.frequency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component36() {
        return this.isConvert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FxRateConversionBean component37() {
        return this.fxRateConversion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnFreezeDateBean component38() {
        return this.unFreezeDateResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertOrderDetailBean component39() {
        return this.convertOrderDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.baseCurrencyUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component40() {
        return this.channelIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.channelIconNight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.paymentMethodNightUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.paymentMethodUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.planId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component45() {
        return this.depositPlatformCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component46() {
        return this.failReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component47() {
        return this.bankName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component48() {
        return this.bankLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component49() {
        return this.bankNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.baseCurrencyNightUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component50() {
        return this.accountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final B2CDetailExtraParamsBean component51() {
        return this.extParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component52() {
        return this.last4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component53() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SubOrderDetailBean> component54() {
        return this.subOrders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component55() {
        return this.businessErrorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<LocalizedFeeInfoBean> component56() {
        return this.localizedFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component57() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component58() {
        return this.totalFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component59() {
        return this.requestCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.completedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component60() {
        return this.requestCurrencySign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component61() {
        return this.requestAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component62() {
        return this.realAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexOrderDetailBean component63() {
        return this.dexOrderDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component7() {
        return this.createDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.showCustomer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.customerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderDetailBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, long j, boolean z, @NotNull String str7, @NotNull String str8, int i, @NotNull String str9, @NotNull String str10, @NotNull String str11, String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, int i2, boolean z2, int i3, @NotNull String str29, boolean z3, FxRateConversionBean fxRateConversionBean, UnFreezeDateBean unFreezeDateBean, ConvertOrderDetailBean convertOrderDetailBean, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, B2CDetailExtraParamsBean b2CDetailExtraParamsBean, @NotNull String str41, @NotNull String str42, @NotNull List<SubOrderDetailBean> list, @NotNull String str43, @NotNull List<LocalizedFeeInfoBean> list2, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47, @NotNull String str48, @NotNull String str49, DexOrderDetailBean dexOrderDetailBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(str41, "");
        Intrinsics.checkNotNullParameter(str42, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str43, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str44, "");
        Intrinsics.checkNotNullParameter(str45, "");
        Intrinsics.checkNotNullParameter(str46, "");
        Intrinsics.checkNotNullParameter(str47, "");
        Intrinsics.checkNotNullParameter(str48, "");
        Intrinsics.checkNotNullParameter(str49, "");
        return new OrderDetailBean(str, str2, str3, str4, str5, str6, j, z, str7, str8, i, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, i2, z2, i3, str29, z3, fxRateConversionBean, unFreezeDateBean, convertOrderDetailBean, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, b2CDetailExtraParamsBean, str41, str42, list, str43, list2, str44, str45, str46, str47, str48, str49, dexOrderDetailBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderDetailBean)) {
            return false;
        }
        OrderDetailBean orderDetailBean = (OrderDetailBean) obj;
        return Intrinsics.EZpvd((Object) this.baseAmount, (Object) orderDetailBean.baseAmount) && Intrinsics.EZpvd((Object) this.baseCurrencySymbol, (Object) orderDetailBean.baseCurrencySymbol) && Intrinsics.EZpvd((Object) this.baseCurrencyName, (Object) orderDetailBean.baseCurrencyName) && Intrinsics.EZpvd((Object) this.baseCurrencyUrl, (Object) orderDetailBean.baseCurrencyUrl) && Intrinsics.EZpvd((Object) this.baseCurrencyNightUrl, (Object) orderDetailBean.baseCurrencyNightUrl) && Intrinsics.EZpvd((Object) this.completedTime, (Object) orderDetailBean.completedTime) && this.createDate == orderDetailBean.createDate && this.showCustomer == orderDetailBean.showCustomer && Intrinsics.EZpvd((Object) this.customerUrl, (Object) orderDetailBean.customerUrl) && Intrinsics.EZpvd((Object) this.depositName, (Object) orderDetailBean.depositName) && this.categoryCode == orderDetailBean.categoryCode && Intrinsics.EZpvd((Object) this.description, (Object) orderDetailBean.description) && Intrinsics.EZpvd((Object) this.estimateBaseAmount, (Object) orderDetailBean.estimateBaseAmount) && Intrinsics.EZpvd((Object) this.expireSeconds, (Object) orderDetailBean.expireSeconds) && Intrinsics.EZpvd((Object) this.expireDate, (Object) orderDetailBean.expireDate) && Intrinsics.EZpvd((Object) this.chain, (Object) orderDetailBean.chain) && Intrinsics.EZpvd((Object) this.channelFee, (Object) orderDetailBean.channelFee) && Intrinsics.EZpvd((Object) this.fee, (Object) orderDetailBean.fee) && Intrinsics.EZpvd((Object) this.iconUrl, (Object) orderDetailBean.iconUrl) && Intrinsics.EZpvd((Object) this.convertBaseColorfulIconUrl, (Object) orderDetailBean.convertBaseColorfulIconUrl) && Intrinsics.EZpvd((Object) this.maxPurchaseTime, (Object) orderDetailBean.maxPurchaseTime) && Intrinsics.EZpvd((Object) this.minPurchaseTime, (Object) orderDetailBean.minPurchaseTime) && Intrinsics.EZpvd((Object) this.orderNo, (Object) orderDetailBean.orderNo) && Intrinsics.EZpvd((Object) this.paymentMethod, (Object) orderDetailBean.paymentMethod) && Intrinsics.EZpvd((Object) this.payCardNumber, (Object) orderDetailBean.payCardNumber) && Intrinsics.EZpvd((Object) this.price, (Object) orderDetailBean.price) && Intrinsics.EZpvd((Object) this.priceType, (Object) orderDetailBean.priceType) && Intrinsics.EZpvd((Object) this.quoteAmount, (Object) orderDetailBean.quoteAmount) && Intrinsics.EZpvd((Object) this.quoteCurrencySymbol, (Object) orderDetailBean.quoteCurrencySymbol) && Intrinsics.EZpvd((Object) this.quoteCurrencyUrl, (Object) orderDetailBean.quoteCurrencyUrl) && Intrinsics.EZpvd((Object) this.quoteSymbol, (Object) orderDetailBean.quoteSymbol) && this.status == orderDetailBean.status && this.type == orderDetailBean.type && this.orderType == orderDetailBean.orderType && Intrinsics.EZpvd((Object) this.frequency, (Object) orderDetailBean.frequency) && this.isConvert == orderDetailBean.isConvert && Intrinsics.EZpvd(this.fxRateConversion, orderDetailBean.fxRateConversion) && Intrinsics.EZpvd(this.unFreezeDateResponse, orderDetailBean.unFreezeDateResponse) && Intrinsics.EZpvd(this.convertOrderDetail, orderDetailBean.convertOrderDetail) && Intrinsics.EZpvd((Object) this.channelIcon, (Object) orderDetailBean.channelIcon) && Intrinsics.EZpvd((Object) this.channelIconNight, (Object) orderDetailBean.channelIconNight) && Intrinsics.EZpvd((Object) this.paymentMethodNightUrl, (Object) orderDetailBean.paymentMethodNightUrl) && Intrinsics.EZpvd((Object) this.paymentMethodUrl, (Object) orderDetailBean.paymentMethodUrl) && Intrinsics.EZpvd((Object) this.planId, (Object) orderDetailBean.planId) && Intrinsics.EZpvd((Object) this.depositPlatformCode, (Object) orderDetailBean.depositPlatformCode) && Intrinsics.EZpvd((Object) this.failReason, (Object) orderDetailBean.failReason) && Intrinsics.EZpvd((Object) this.bankName, (Object) orderDetailBean.bankName) && Intrinsics.EZpvd((Object) this.bankLogo, (Object) orderDetailBean.bankLogo) && Intrinsics.EZpvd((Object) this.bankNumber, (Object) orderDetailBean.bankNumber) && Intrinsics.EZpvd((Object) this.accountType, (Object) orderDetailBean.accountType) && Intrinsics.EZpvd(this.extParams, orderDetailBean.extParams) && Intrinsics.EZpvd((Object) this.last4, (Object) orderDetailBean.last4) && Intrinsics.EZpvd((Object) this.tradeType, (Object) orderDetailBean.tradeType) && Intrinsics.EZpvd(this.subOrders, orderDetailBean.subOrders) && Intrinsics.EZpvd((Object) this.businessErrorCode, (Object) orderDetailBean.businessErrorCode) && Intrinsics.EZpvd(this.localizedFeeInfo, orderDetailBean.localizedFeeInfo) && Intrinsics.EZpvd((Object) this.errorCode, (Object) orderDetailBean.errorCode) && Intrinsics.EZpvd((Object) this.totalFee, (Object) orderDetailBean.totalFee) && Intrinsics.EZpvd((Object) this.requestCurrencySymbol, (Object) orderDetailBean.requestCurrencySymbol) && Intrinsics.EZpvd((Object) this.requestCurrencySign, (Object) orderDetailBean.requestCurrencySign) && Intrinsics.EZpvd((Object) this.requestAmount, (Object) orderDetailBean.requestAmount) && Intrinsics.EZpvd((Object) this.realAmount, (Object) orderDetailBean.realAmount) && Intrinsics.EZpvd(this.dexOrderDetail, orderDetailBean.dexOrderDetail);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountType() {
        return this.accountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBankLogo() {
        return this.bankLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBankName() {
        return this.bankName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBankNumber() {
        return this.bankNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseAmount() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrencyName() {
        return this.baseCurrencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrencyNightUrl() {
        return this.baseCurrencyNightUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrencySymbol() {
        return this.baseCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrencyUrl() {
        return this.baseCurrencyUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBusinessErrorCode() {
        return this.businessErrorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCategoryCode() {
        return this.categoryCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChain() {
        return this.chain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelFee() {
        return this.channelFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelIcon() {
        return this.channelIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelIconNight() {
        return this.channelIconNight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCompletedTime() {
        return this.completedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConvertBaseColorfulIconUrl() {
        return this.convertBaseColorfulIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertOrderDetailBean getConvertOrderDetail() {
        return this.convertOrderDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateDate() {
        return this.createDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCustomerUrl() {
        return this.customerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositName() {
        return this.depositName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositPlatformCode() {
        return this.depositPlatformCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexOrderDetailBean getDexOrderDetail() {
        return this.dexOrderDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimateBaseAmount() {
        return this.estimateBaseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpireDate() {
        return this.expireDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpireSeconds() {
        return this.expireSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final B2CDetailExtraParamsBean getExtParams() {
        return this.extParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFailReason() {
        return this.failReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrequency() {
        return this.frequency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FxRateConversionBean getFxRateConversion() {
        return this.fxRateConversion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLast4() {
        return this.last4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<LocalizedFeeInfoBean> getLocalizedFeeInfo() {
        return this.localizedFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxPurchaseTime() {
        return this.maxPurchaseTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinPurchaseTime() {
        return this.minPurchaseTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderNo() {
        return this.orderNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayCardNumber() {
        return this.payCardNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymentMethodNightUrl() {
        return this.paymentMethodNightUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymentMethodUrl() {
        return this.paymentMethodUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlanId() {
        return this.planId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceType() {
        return this.priceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteAmount() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCurrencySymbol() {
        return this.quoteCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCurrencyUrl() {
        return this.quoteCurrencyUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteSymbol() {
        return this.quoteSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealAmount() {
        return this.realAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestAmount() {
        return this.requestAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestCurrencySign() {
        return this.requestCurrencySign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestCurrencySymbol() {
        return this.requestCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowCustomer() {
        return this.showCustomer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SubOrderDetailBean> getSubOrders() {
        return this.subOrders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalFee() {
        return this.totalFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeType() {
        return this.tradeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnFreezeDateBean getUnFreezeDateResponse() {
        return this.unFreezeDateResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.baseAmount.hashCode();
        int iHashCode2 = this.baseCurrencySymbol.hashCode();
        int iHashCode3 = this.baseCurrencyName.hashCode();
        int iHashCode4 = this.baseCurrencyUrl.hashCode();
        int iHashCode5 = this.baseCurrencyNightUrl.hashCode();
        int iHashCode6 = this.completedTime.hashCode();
        int iHashCode7 = Long.hashCode(this.createDate);
        int iHashCode8 = Boolean.hashCode(this.showCustomer);
        int iHashCode9 = this.customerUrl.hashCode();
        int iHashCode10 = this.depositName.hashCode();
        int iHashCode11 = Integer.hashCode(this.categoryCode);
        int iHashCode12 = this.description.hashCode();
        int iHashCode13 = this.estimateBaseAmount.hashCode();
        int iHashCode14 = this.expireSeconds.hashCode();
        String str = this.expireDate;
        int iHashCode15 = str == null ? 0 : str.hashCode();
        int iHashCode16 = this.chain.hashCode();
        int iHashCode17 = this.channelFee.hashCode();
        int iHashCode18 = this.fee.hashCode();
        int iHashCode19 = this.iconUrl.hashCode();
        int iHashCode20 = this.convertBaseColorfulIconUrl.hashCode();
        int iHashCode21 = this.maxPurchaseTime.hashCode();
        int iHashCode22 = this.minPurchaseTime.hashCode();
        int iHashCode23 = this.orderNo.hashCode();
        int iHashCode24 = this.paymentMethod.hashCode();
        int iHashCode25 = this.payCardNumber.hashCode();
        int iHashCode26 = this.price.hashCode();
        int iHashCode27 = this.priceType.hashCode();
        int iHashCode28 = this.quoteAmount.hashCode();
        int iHashCode29 = this.quoteCurrencySymbol.hashCode();
        int iHashCode30 = this.quoteCurrencyUrl.hashCode();
        int iHashCode31 = this.quoteSymbol.hashCode();
        int iHashCode32 = Integer.hashCode(this.status);
        int iHashCode33 = Boolean.hashCode(this.type);
        int iHashCode34 = Integer.hashCode(this.orderType);
        int iHashCode35 = this.frequency.hashCode();
        int iHashCode36 = Boolean.hashCode(this.isConvert);
        FxRateConversionBean fxRateConversionBean = this.fxRateConversion;
        int iHashCode37 = fxRateConversionBean == null ? 0 : fxRateConversionBean.hashCode();
        UnFreezeDateBean unFreezeDateBean = this.unFreezeDateResponse;
        int iHashCode38 = unFreezeDateBean == null ? 0 : unFreezeDateBean.hashCode();
        ConvertOrderDetailBean convertOrderDetailBean = this.convertOrderDetail;
        int iHashCode39 = convertOrderDetailBean == null ? 0 : convertOrderDetailBean.hashCode();
        int iHashCode40 = this.channelIcon.hashCode();
        int iHashCode41 = this.channelIconNight.hashCode();
        int iHashCode42 = this.paymentMethodNightUrl.hashCode();
        int iHashCode43 = this.paymentMethodUrl.hashCode();
        int iHashCode44 = this.planId.hashCode();
        int iHashCode45 = this.depositPlatformCode.hashCode();
        int iHashCode46 = this.failReason.hashCode();
        int iHashCode47 = this.bankName.hashCode();
        int iHashCode48 = this.bankLogo.hashCode();
        int iHashCode49 = this.bankNumber.hashCode();
        int iHashCode50 = this.accountType.hashCode();
        B2CDetailExtraParamsBean b2CDetailExtraParamsBean = this.extParams;
        int iHashCode51 = b2CDetailExtraParamsBean == null ? 0 : b2CDetailExtraParamsBean.hashCode();
        int iHashCode52 = this.last4.hashCode();
        int iHashCode53 = this.tradeType.hashCode();
        int iHashCode54 = this.subOrders.hashCode();
        int iHashCode55 = this.businessErrorCode.hashCode();
        int iHashCode56 = this.localizedFeeInfo.hashCode();
        int iHashCode57 = this.errorCode.hashCode();
        int iHashCode58 = this.totalFee.hashCode();
        int iHashCode59 = this.requestCurrencySymbol.hashCode();
        int iHashCode60 = this.requestCurrencySign.hashCode();
        int iHashCode61 = this.requestAmount.hashCode();
        int iHashCode62 = this.realAmount.hashCode();
        DexOrderDetailBean dexOrderDetailBean = this.dexOrderDetail;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode59) * 31) + iHashCode60) * 31) + iHashCode61) * 31) + iHashCode62) * 31) + (dexOrderDetailBean != null ? dexOrderDetailBean.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConvert() {
        return this.isConvert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrderDetailBean(baseAmount=" + this.baseAmount + ", baseCurrencySymbol=" + this.baseCurrencySymbol + ", baseCurrencyName=" + this.baseCurrencyName + ", baseCurrencyUrl=" + this.baseCurrencyUrl + ", baseCurrencyNightUrl=" + this.baseCurrencyNightUrl + ", completedTime=" + this.completedTime + ", createDate=" + this.createDate + ", showCustomer=" + this.showCustomer + ", customerUrl=" + this.customerUrl + ", depositName=" + this.depositName + ", categoryCode=" + this.categoryCode + ", description=" + this.description + ", estimateBaseAmount=" + this.estimateBaseAmount + ", expireSeconds=" + this.expireSeconds + ", expireDate=" + this.expireDate + ", chain=" + this.chain + ", channelFee=" + this.channelFee + ", fee=" + this.fee + ", iconUrl=" + this.iconUrl + ", convertBaseColorfulIconUrl=" + this.convertBaseColorfulIconUrl + ", maxPurchaseTime=" + this.maxPurchaseTime + ", minPurchaseTime=" + this.minPurchaseTime + ", orderNo=" + this.orderNo + ", paymentMethod=" + this.paymentMethod + ", payCardNumber=" + this.payCardNumber + ", price=" + this.price + ", priceType=" + this.priceType + ", quoteAmount=" + this.quoteAmount + ", quoteCurrencySymbol=" + this.quoteCurrencySymbol + ", quoteCurrencyUrl=" + this.quoteCurrencyUrl + ", quoteSymbol=" + this.quoteSymbol + ", status=" + this.status + ", type=" + this.type + ", orderType=" + this.orderType + ", frequency=" + this.frequency + ", isConvert=" + this.isConvert + ", fxRateConversion=" + this.fxRateConversion + ", unFreezeDateResponse=" + this.unFreezeDateResponse + ", convertOrderDetail=" + this.convertOrderDetail + ", channelIcon=" + this.channelIcon + ", channelIconNight=" + this.channelIconNight + ", paymentMethodNightUrl=" + this.paymentMethodNightUrl + ", paymentMethodUrl=" + this.paymentMethodUrl + ", planId=" + this.planId + ", depositPlatformCode=" + this.depositPlatformCode + ", failReason=" + this.failReason + ", bankName=" + this.bankName + ", bankLogo=" + this.bankLogo + ", bankNumber=" + this.bankNumber + ", accountType=" + this.accountType + ", extParams=" + this.extParams + ", last4=" + this.last4 + ", tradeType=" + this.tradeType + ", subOrders=" + this.subOrders + ", businessErrorCode=" + this.businessErrorCode + ", localizedFeeInfo=" + this.localizedFeeInfo + ", errorCode=" + this.errorCode + ", totalFee=" + this.totalFee + ", requestCurrencySymbol=" + this.requestCurrencySymbol + ", requestCurrencySign=" + this.requestCurrencySign + ", requestAmount=" + this.requestAmount + ", realAmount=" + this.realAmount + ", dexOrderDetail=" + this.dexOrderDetail + ")";
    }

    public /* synthetic */ OrderDetailBean(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, long j, boolean z, String str7, String str8, int i3, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, int i4, boolean z2, int i5, String str29, boolean z3, FxRateConversionBean fxRateConversionBean, UnFreezeDateBean unFreezeDateBean, ConvertOrderDetailBean convertOrderDetailBean, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, B2CDetailExtraParamsBean b2CDetailExtraParamsBean, String str41, String str42, List list, String str43, List list2, String str44, String str45, String str46, String str47, String str48, String str49, DexOrderDetailBean dexOrderDetailBean, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.baseAmount = "";
        } else {
            this.baseAmount = str;
        }
        if ((i & 2) == 0) {
            this.baseCurrencySymbol = "";
        } else {
            this.baseCurrencySymbol = str2;
        }
        if ((i & 4) == 0) {
            this.baseCurrencyName = "";
        } else {
            this.baseCurrencyName = str3;
        }
        if ((i & 8) == 0) {
            this.baseCurrencyUrl = "";
        } else {
            this.baseCurrencyUrl = str4;
        }
        if ((i & 16) == 0) {
            this.baseCurrencyNightUrl = "";
        } else {
            this.baseCurrencyNightUrl = str5;
        }
        if ((i & 32) == 0) {
            this.completedTime = "";
        } else {
            this.completedTime = str6;
        }
        this.createDate = (i & 64) == 0 ? 0L : j;
        if ((i & 128) == 0) {
            this.showCustomer = false;
        } else {
            this.showCustomer = z;
        }
        if ((i & 256) == 0) {
            this.customerUrl = "";
        } else {
            this.customerUrl = str7;
        }
        if ((i & 512) == 0) {
            this.depositName = "";
        } else {
            this.depositName = str8;
        }
        if ((i & 1024) == 0) {
            this.categoryCode = 0;
        } else {
            this.categoryCode = i3;
        }
        if ((i & 2048) == 0) {
            this.description = "";
        } else {
            this.description = str9;
        }
        if ((i & 4096) == 0) {
            this.estimateBaseAmount = "";
        } else {
            this.estimateBaseAmount = str10;
        }
        if ((i & 8192) == 0) {
            this.expireSeconds = "";
        } else {
            this.expireSeconds = str11;
        }
        if ((i & 16384) == 0) {
            this.expireDate = "";
        } else {
            this.expireDate = str12;
        }
        if ((i & 32768) == 0) {
            this.chain = "";
        } else {
            this.chain = str13;
        }
        if ((i & 65536) == 0) {
            this.channelFee = "";
        } else {
            this.channelFee = str14;
        }
        if ((i & 131072) == 0) {
            this.fee = "";
        } else {
            this.fee = str15;
        }
        if ((i & 262144) == 0) {
            this.iconUrl = "";
        } else {
            this.iconUrl = str16;
        }
        if ((524288 & i) == 0) {
            this.convertBaseColorfulIconUrl = "";
        } else {
            this.convertBaseColorfulIconUrl = str17;
        }
        if ((1048576 & i) == 0) {
            this.maxPurchaseTime = "";
        } else {
            this.maxPurchaseTime = str18;
        }
        if ((2097152 & i) == 0) {
            this.minPurchaseTime = "";
        } else {
            this.minPurchaseTime = str19;
        }
        if ((4194304 & i) == 0) {
            this.orderNo = "";
        } else {
            this.orderNo = str20;
        }
        if ((8388608 & i) == 0) {
            this.paymentMethod = "";
        } else {
            this.paymentMethod = str21;
        }
        if ((16777216 & i) == 0) {
            this.payCardNumber = "";
        } else {
            this.payCardNumber = str22;
        }
        if ((33554432 & i) == 0) {
            this.price = "";
        } else {
            this.price = str23;
        }
        if ((67108864 & i) == 0) {
            this.priceType = "";
        } else {
            this.priceType = str24;
        }
        if ((134217728 & i) == 0) {
            this.quoteAmount = "";
        } else {
            this.quoteAmount = str25;
        }
        if ((268435456 & i) == 0) {
            this.quoteCurrencySymbol = "";
        } else {
            this.quoteCurrencySymbol = str26;
        }
        if ((536870912 & i) == 0) {
            this.quoteCurrencyUrl = "";
        } else {
            this.quoteCurrencyUrl = str27;
        }
        if ((1073741824 & i) == 0) {
            this.quoteSymbol = "";
        } else {
            this.quoteSymbol = str28;
        }
        this.status = (i & Integer.MIN_VALUE) == 0 ? -1 : i4;
        if ((i2 & 1) == 0) {
            this.type = true;
        } else {
            this.type = z2;
        }
        if ((i2 & 2) == 0) {
            this.orderType = 1;
        } else {
            this.orderType = i5;
        }
        if ((i2 & 4) == 0) {
            this.frequency = "";
        } else {
            this.frequency = str29;
        }
        if ((i2 & 8) == 0) {
            this.isConvert = false;
        } else {
            this.isConvert = z3;
        }
        if ((i2 & 16) == 0) {
            this.fxRateConversion = null;
        } else {
            this.fxRateConversion = fxRateConversionBean;
        }
        if ((i2 & 32) == 0) {
            this.unFreezeDateResponse = null;
        } else {
            this.unFreezeDateResponse = unFreezeDateBean;
        }
        if ((i2 & 64) == 0) {
            this.convertOrderDetail = null;
        } else {
            this.convertOrderDetail = convertOrderDetailBean;
        }
        if ((i2 & 128) == 0) {
            this.channelIcon = "";
        } else {
            this.channelIcon = str30;
        }
        if ((i2 & 256) == 0) {
            this.channelIconNight = "";
        } else {
            this.channelIconNight = str31;
        }
        if ((i2 & 512) == 0) {
            this.paymentMethodNightUrl = "";
        } else {
            this.paymentMethodNightUrl = str32;
        }
        if ((i2 & 1024) == 0) {
            this.paymentMethodUrl = "";
        } else {
            this.paymentMethodUrl = str33;
        }
        if ((i2 & 2048) == 0) {
            this.planId = "";
        } else {
            this.planId = str34;
        }
        if ((i2 & 4096) == 0) {
            this.depositPlatformCode = "";
        } else {
            this.depositPlatformCode = str35;
        }
        if ((i2 & 8192) == 0) {
            this.failReason = "";
        } else {
            this.failReason = str36;
        }
        if ((i2 & 16384) == 0) {
            this.bankName = "";
        } else {
            this.bankName = str37;
        }
        if ((i2 & 32768) == 0) {
            this.bankLogo = "";
        } else {
            this.bankLogo = str38;
        }
        if ((i2 & 65536) == 0) {
            this.bankNumber = "";
        } else {
            this.bankNumber = str39;
        }
        if ((i2 & 131072) == 0) {
            this.accountType = "";
        } else {
            this.accountType = str40;
        }
        if ((i2 & 262144) == 0) {
            this.extParams = null;
        } else {
            this.extParams = b2CDetailExtraParamsBean;
        }
        if ((524288 & i2) == 0) {
            this.last4 = "";
        } else {
            this.last4 = str41;
        }
        if ((1048576 & i2) == 0) {
            this.tradeType = "";
        } else {
            this.tradeType = str42;
        }
        this.subOrders = (2097152 & i2) == 0 ? yDY.AhwBna() : list;
        if ((4194304 & i2) == 0) {
            this.businessErrorCode = "";
        } else {
            this.businessErrorCode = str43;
        }
        this.localizedFeeInfo = (8388608 & i2) == 0 ? yDY.AhwBna() : list2;
        if ((16777216 & i2) == 0) {
            this.errorCode = "";
        } else {
            this.errorCode = str44;
        }
        if ((33554432 & i2) == 0) {
            this.totalFee = "";
        } else {
            this.totalFee = str45;
        }
        if ((67108864 & i2) == 0) {
            this.requestCurrencySymbol = "";
        } else {
            this.requestCurrencySymbol = str46;
        }
        if ((134217728 & i2) == 0) {
            this.requestCurrencySign = "";
        } else {
            this.requestCurrencySign = str47;
        }
        if ((268435456 & i2) == 0) {
            this.requestAmount = "";
        } else {
            this.requestAmount = str48;
        }
        if ((536870912 & i2) == 0) {
            this.realAmount = "";
        } else {
            this.realAmount = str49;
        }
        if ((1073741824 & i2) == 0) {
            this.dexOrderDetail = null;
        } else {
            this.dexOrderDetail = dexOrderDetailBean;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(OrderDetailBean orderDetailBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) orderDetailBean.baseAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, orderDetailBean.baseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) orderDetailBean.baseCurrencySymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, orderDetailBean.baseCurrencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) orderDetailBean.baseCurrencyName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, orderDetailBean.baseCurrencyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) orderDetailBean.baseCurrencyUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, orderDetailBean.baseCurrencyUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) orderDetailBean.baseCurrencyNightUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, orderDetailBean.baseCurrencyNightUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) orderDetailBean.completedTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, orderDetailBean.completedTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || orderDetailBean.createDate != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 6, orderDetailBean.createDate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || orderDetailBean.showCustomer) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, orderDetailBean.showCustomer);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) orderDetailBean.customerUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, orderDetailBean.customerUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) orderDetailBean.depositName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, orderDetailBean.depositName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || orderDetailBean.categoryCode != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 10, orderDetailBean.categoryCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) orderDetailBean.description, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, orderDetailBean.description);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) orderDetailBean.estimateBaseAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, orderDetailBean.estimateBaseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) orderDetailBean.expireSeconds, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, orderDetailBean.expireSeconds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) orderDetailBean.expireDate, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, orderDetailBean.expireDate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) orderDetailBean.chain, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, orderDetailBean.chain);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) orderDetailBean.channelFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, orderDetailBean.channelFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) orderDetailBean.fee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, orderDetailBean.fee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) orderDetailBean.iconUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, orderDetailBean.iconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) orderDetailBean.convertBaseColorfulIconUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, orderDetailBean.convertBaseColorfulIconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) orderDetailBean.maxPurchaseTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, orderDetailBean.maxPurchaseTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) orderDetailBean.minPurchaseTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, orderDetailBean.minPurchaseTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) orderDetailBean.orderNo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, orderDetailBean.orderNo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) orderDetailBean.paymentMethod, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, orderDetailBean.paymentMethod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) orderDetailBean.payCardNumber, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, orderDetailBean.payCardNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) orderDetailBean.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, orderDetailBean.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) orderDetailBean.priceType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, orderDetailBean.priceType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) orderDetailBean.quoteAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, orderDetailBean.quoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) orderDetailBean.quoteCurrencySymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, orderDetailBean.quoteCurrencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) orderDetailBean.quoteCurrencyUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, orderDetailBean.quoteCurrencyUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) orderDetailBean.quoteSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, orderDetailBean.quoteSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || orderDetailBean.status != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 31, orderDetailBean.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !orderDetailBean.type) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 32, orderDetailBean.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || orderDetailBean.orderType != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 33, orderDetailBean.orderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) orderDetailBean.frequency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, orderDetailBean.frequency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || orderDetailBean.isConvert) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 35, orderDetailBean.isConvert);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || orderDetailBean.fxRateConversion != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, FxRateConversionBean$$serializer.INSTANCE, orderDetailBean.fxRateConversion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || orderDetailBean.unFreezeDateResponse != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 37, UnFreezeDateBean$$serializer.INSTANCE, orderDetailBean.unFreezeDateResponse);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || orderDetailBean.convertOrderDetail != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 38, ConvertOrderDetailBean$$serializer.INSTANCE, orderDetailBean.convertOrderDetail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || !Intrinsics.EZpvd((Object) orderDetailBean.channelIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 39, orderDetailBean.channelIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || !Intrinsics.EZpvd((Object) orderDetailBean.channelIconNight, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 40, orderDetailBean.channelIconNight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !Intrinsics.EZpvd((Object) orderDetailBean.paymentMethodNightUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 41, orderDetailBean.paymentMethodNightUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || !Intrinsics.EZpvd((Object) orderDetailBean.paymentMethodUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 42, orderDetailBean.paymentMethodUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || !Intrinsics.EZpvd((Object) orderDetailBean.planId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 43, orderDetailBean.planId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || !Intrinsics.EZpvd((Object) orderDetailBean.depositPlatformCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 44, orderDetailBean.depositPlatformCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || !Intrinsics.EZpvd((Object) orderDetailBean.failReason, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 45, orderDetailBean.failReason);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || !Intrinsics.EZpvd((Object) orderDetailBean.bankName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 46, orderDetailBean.bankName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || !Intrinsics.EZpvd((Object) orderDetailBean.bankLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 47, orderDetailBean.bankLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || !Intrinsics.EZpvd((Object) orderDetailBean.bankNumber, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 48, orderDetailBean.bankNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || !Intrinsics.EZpvd((Object) orderDetailBean.accountType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 49, orderDetailBean.accountType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || orderDetailBean.extParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 50, B2CDetailExtraParamsBean$$serializer.INSTANCE, orderDetailBean.extParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || !Intrinsics.EZpvd((Object) orderDetailBean.last4, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 51, orderDetailBean.last4);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || !Intrinsics.EZpvd((Object) orderDetailBean.tradeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 52, orderDetailBean.tradeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || !Intrinsics.EZpvd(orderDetailBean.subOrders, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 53, kSerializerArr[53], orderDetailBean.subOrders);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || !Intrinsics.EZpvd((Object) orderDetailBean.businessErrorCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 54, orderDetailBean.businessErrorCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || !Intrinsics.EZpvd(orderDetailBean.localizedFeeInfo, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 55, kSerializerArr[55], orderDetailBean.localizedFeeInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || !Intrinsics.EZpvd((Object) orderDetailBean.errorCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 56, orderDetailBean.errorCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || !Intrinsics.EZpvd((Object) orderDetailBean.totalFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 57, orderDetailBean.totalFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 58) || !Intrinsics.EZpvd((Object) orderDetailBean.requestCurrencySymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 58, orderDetailBean.requestCurrencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 59) || !Intrinsics.EZpvd((Object) orderDetailBean.requestCurrencySign, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 59, orderDetailBean.requestCurrencySign);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 60) || !Intrinsics.EZpvd((Object) orderDetailBean.requestAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 60, orderDetailBean.requestAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 61) || !Intrinsics.EZpvd((Object) orderDetailBean.realAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 61, orderDetailBean.realAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 62) && orderDetailBean.dexOrderDetail == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 62, DexOrderDetailBean$$serializer.INSTANCE, orderDetailBean.dexOrderDetail);
    }

    public OrderDetailBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, long j, boolean z, @NotNull String str7, @NotNull String str8, int i, @NotNull String str9, @NotNull String str10, @NotNull String str11, String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, int i2, boolean z2, int i3, @NotNull String str29, boolean z3, FxRateConversionBean fxRateConversionBean, UnFreezeDateBean unFreezeDateBean, ConvertOrderDetailBean convertOrderDetailBean, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, B2CDetailExtraParamsBean b2CDetailExtraParamsBean, @NotNull String str41, @NotNull String str42, @NotNull List<SubOrderDetailBean> list, @NotNull String str43, @NotNull List<LocalizedFeeInfoBean> list2, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47, @NotNull String str48, @NotNull String str49, DexOrderDetailBean dexOrderDetailBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(str41, "");
        Intrinsics.checkNotNullParameter(str42, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str43, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str44, "");
        Intrinsics.checkNotNullParameter(str45, "");
        Intrinsics.checkNotNullParameter(str46, "");
        Intrinsics.checkNotNullParameter(str47, "");
        Intrinsics.checkNotNullParameter(str48, "");
        Intrinsics.checkNotNullParameter(str49, "");
        this.baseAmount = str;
        this.baseCurrencySymbol = str2;
        this.baseCurrencyName = str3;
        this.baseCurrencyUrl = str4;
        this.baseCurrencyNightUrl = str5;
        this.completedTime = str6;
        this.createDate = j;
        this.showCustomer = z;
        this.customerUrl = str7;
        this.depositName = str8;
        this.categoryCode = i;
        this.description = str9;
        this.estimateBaseAmount = str10;
        this.expireSeconds = str11;
        this.expireDate = str12;
        this.chain = str13;
        this.channelFee = str14;
        this.fee = str15;
        this.iconUrl = str16;
        this.convertBaseColorfulIconUrl = str17;
        this.maxPurchaseTime = str18;
        this.minPurchaseTime = str19;
        this.orderNo = str20;
        this.paymentMethod = str21;
        this.payCardNumber = str22;
        this.price = str23;
        this.priceType = str24;
        this.quoteAmount = str25;
        this.quoteCurrencySymbol = str26;
        this.quoteCurrencyUrl = str27;
        this.quoteSymbol = str28;
        this.status = i2;
        this.type = z2;
        this.orderType = i3;
        this.frequency = str29;
        this.isConvert = z3;
        this.fxRateConversion = fxRateConversionBean;
        this.unFreezeDateResponse = unFreezeDateBean;
        this.convertOrderDetail = convertOrderDetailBean;
        this.channelIcon = str30;
        this.channelIconNight = str31;
        this.paymentMethodNightUrl = str32;
        this.paymentMethodUrl = str33;
        this.planId = str34;
        this.depositPlatformCode = str35;
        this.failReason = str36;
        this.bankName = str37;
        this.bankLogo = str38;
        this.bankNumber = str39;
        this.accountType = str40;
        this.extParams = b2CDetailExtraParamsBean;
        this.last4 = str41;
        this.tradeType = str42;
        this.subOrders = list;
        this.businessErrorCode = str43;
        this.localizedFeeInfo = list2;
        this.errorCode = str44;
        this.totalFee = str45;
        this.requestCurrencySymbol = str46;
        this.requestCurrencySign = str47;
        this.requestAmount = str48;
        this.realAmount = str49;
        this.dexOrderDetail = dexOrderDetailBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0306: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0004: ARITH (r130v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r130v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r130v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r130v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r130v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r130v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r71v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0036: ARITH (r130v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r72v0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003f: ARITH (r130v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r74v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r130v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r75v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r130v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r76v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0057: ARITH (r130v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r77v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005f: ARITH (r130v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r78v0 java.lang.String))
  (wrap:java.lang.String:0x0072: TERNARY null = ((wrap:int:0x0069: ARITH (r130v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r79v0 java.lang.String))
  (wrap:java.lang.String:0x007d: TERNARY null = ((wrap:int:0x0074: ARITH (r130v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r80v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007f: ARITH (r130v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r81v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008b: ARITH (r130v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r82v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0096: ARITH (r130v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r83v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a1: ARITH (r130v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r84v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ac: ARITH (r130v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r85v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b7: ARITH (r130v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r86v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c2: ARITH (r130v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r87v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cd: ARITH (r130v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r88v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d8: ARITH (r130v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r89v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e3: ARITH (r130v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r90v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ee: ARITH (r130v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r91v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f9: ARITH (r130v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r92v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0104: ARITH (r130v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r93v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010f: ARITH (r130v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r94v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011a: ARITH (r130v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r95v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0125: ARITH (r130v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r96v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0130: ARITH (r130v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r97v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x013b: ARITH (r130v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r98v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0143: ARITH (r131v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r99v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x014e: ARITH (r131v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r100v0 int) : (1 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0155: ARITH (r131v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r101v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x015e: ARITH (r131v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r102v0 boolean))
  (wrap:com.okinc.crcore.shared.net.responsebean.bsc.FxRateConversionBean:?: TERNARY null = ((wrap:int:0x0167: ARITH (r131v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.shared.net.responsebean.bsc.FxRateConversionBean) : (r103v0 com.okinc.crcore.shared.net.responsebean.bsc.FxRateConversionBean))
  (wrap:com.okinc.crcore.shared.net.responsebean.bsc.UnFreezeDateBean:?: TERNARY null = ((wrap:int:0x0172: ARITH (r131v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.shared.net.responsebean.bsc.UnFreezeDateBean) : (r104v0 com.okinc.crcore.shared.net.responsebean.bsc.UnFreezeDateBean))
  (wrap:com.okinc.crcore.shared.net.responsebean.bsc.ConvertOrderDetailBean:?: TERNARY null = ((wrap:int:0x017b: ARITH (r131v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.shared.net.responsebean.bsc.ConvertOrderDetailBean) : (r105v0 com.okinc.crcore.shared.net.responsebean.bsc.ConvertOrderDetailBean))
  (wrap:java.lang.String:0x018f: TERNARY null = ((wrap:int:0x0186: ARITH (r131v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r106v0 java.lang.String))
  (wrap:java.lang.String:0x019a: TERNARY null = ((wrap:int:0x0191: ARITH (r131v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r107v0 java.lang.String))
  (wrap:java.lang.String:0x01a5: TERNARY null = ((wrap:int:0x019c: ARITH (r131v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r108v0 java.lang.String))
  (wrap:java.lang.String:0x01b0: TERNARY null = ((wrap:int:0x01a7: ARITH (r131v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r109v0 java.lang.String))
  (wrap:java.lang.String:0x01bb: TERNARY null = ((wrap:int:0x01b2: ARITH (r131v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r110v0 java.lang.String))
  (wrap:java.lang.String:0x01c6: TERNARY null = ((wrap:int:0x01bd: ARITH (r131v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r111v0 java.lang.String))
  (wrap:java.lang.String:0x01d1: TERNARY null = ((wrap:int:0x01c8: ARITH (r131v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r112v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01d3: ARITH (r131v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r113v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01dc: ARITH (r131v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r114v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01e5: ARITH (r131v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r115v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01ee: ARITH (r131v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r116v0 java.lang.String))
  (wrap:com.okinc.crcore.shared.net.responsebean.bsc.B2CDetailExtraParamsBean:?: TERNARY null = ((wrap:int:0x01f7: ARITH (r131v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.shared.net.responsebean.bsc.B2CDetailExtraParamsBean) : (r117v0 com.okinc.crcore.shared.net.responsebean.bsc.B2CDetailExtraParamsBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0202: ARITH (r131v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r118v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x020d: ARITH (r131v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r119v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0218: ARITH (r131v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x021c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:72)) : (r120v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0225: ARITH (r131v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r121v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0230: ARITH (r131v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0234: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:74)) : (r122v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x023d: ARITH (r131v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r123v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0248: ARITH (r131v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r124v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0253: ARITH (r131v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r125v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x025e: ARITH (r131v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r126v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0269: ARITH (r131v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r127v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0274: ARITH (r131v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r128v0 java.lang.String))
  (wrap:com.okinc.crcore.shared.net.responsebean.bsc.DexOrderDetailBean:?: TERNARY null = ((wrap:int:0x027f: ARITH (r131v0 int) & (1073741824 int) A[WRAPPED]) == (0 int)) ? (r129v0 com.okinc.crcore.shared.net.responsebean.bsc.DexOrderDetailBean) : (null com.okinc.crcore.shared.net.responsebean.bsc.DexOrderDetailBean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, boolean, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, int, java.lang.String, boolean, com.okinc.crcore.shared.net.responsebean.bsc.FxRateConversionBean, com.okinc.crcore.shared.net.responsebean.bsc.UnFreezeDateBean, com.okinc.crcore.shared.net.responsebean.bsc.ConvertOrderDetailBean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.crcore.shared.net.responsebean.bsc.B2CDetailExtraParamsBean, java.lang.String, java.lang.String, java.util.List<com.okinc.crcore.shared.net.responsebean.bsc.SubOrderDetailBean>, java.lang.String, java.util.List<com.okinc.crcore.shared.net.responsebean.bsc.LocalizedFeeInfoBean>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.crcore.shared.net.responsebean.bsc.DexOrderDetailBean):void (m)] (LINE:18) call: com.okinc.crcore.shared.net.responsebean.bsc.OrderDetailBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, boolean, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, int, java.lang.String, boolean, com.okinc.crcore.shared.net.responsebean.bsc.FxRateConversionBean, com.okinc.crcore.shared.net.responsebean.bsc.UnFreezeDateBean, com.okinc.crcore.shared.net.responsebean.bsc.ConvertOrderDetailBean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.crcore.shared.net.responsebean.bsc.B2CDetailExtraParamsBean, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.crcore.shared.net.responsebean.bsc.DexOrderDetailBean):void type: THIS */
    public /* synthetic */ OrderDetailBean(String str, String str2, String str3, String str4, String str5, String str6, long j, boolean z, String str7, String str8, int i, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, int i2, boolean z2, int i3, String str29, boolean z3, FxRateConversionBean fxRateConversionBean, UnFreezeDateBean unFreezeDateBean, ConvertOrderDetailBean convertOrderDetailBean, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, B2CDetailExtraParamsBean b2CDetailExtraParamsBean, String str41, String str42, List list, String str43, List list2, String str44, String str45, String str46, String str47, String str48, String str49, DexOrderDetailBean dexOrderDetailBean, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? "" : str4, (i4 & 16) != 0 ? "" : str5, (i4 & 32) != 0 ? "" : str6, (i4 & 64) != 0 ? 0L : j, (i4 & 128) != 0 ? false : z, (i4 & 256) != 0 ? "" : str7, (i4 & 512) != 0 ? "" : str8, (i4 & 1024) != 0 ? 0 : i, (i4 & 2048) != 0 ? "" : str9, (i4 & 4096) != 0 ? "" : str10, (i4 & 8192) != 0 ? "" : str11, (i4 & 16384) != 0 ? "" : str12, (i4 & 32768) != 0 ? "" : str13, (i4 & 65536) != 0 ? "" : str14, (i4 & 131072) != 0 ? "" : str15, (i4 & 262144) != 0 ? "" : str16, (i4 & 524288) != 0 ? "" : str17, (i4 & 1048576) != 0 ? "" : str18, (i4 & 2097152) != 0 ? "" : str19, (i4 & 4194304) != 0 ? "" : str20, (i4 & 8388608) != 0 ? "" : str21, (i4 & 16777216) != 0 ? "" : str22, (i4 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str23, (i4 & 67108864) != 0 ? "" : str24, (i4 & 134217728) != 0 ? "" : str25, (i4 & 268435456) != 0 ? "" : str26, (i4 & 536870912) != 0 ? "" : str27, (i4 & 1073741824) != 0 ? "" : str28, (i4 & Integer.MIN_VALUE) != 0 ? -1 : i2, (i5 & 1) != 0 ? true : z2, (i5 & 2) == 0 ? i3 : 1, (i5 & 4) != 0 ? "" : str29, (i5 & 8) != 0 ? false : z3, (i5 & 16) != 0 ? null : fxRateConversionBean, (i5 & 32) != 0 ? null : unFreezeDateBean, (i5 & 64) != 0 ? null : convertOrderDetailBean, (i5 & 128) != 0 ? "" : str30, (i5 & 256) != 0 ? "" : str31, (i5 & 512) != 0 ? "" : str32, (i5 & 1024) != 0 ? "" : str33, (i5 & 2048) != 0 ? "" : str34, (i5 & 4096) != 0 ? "" : str35, (i5 & 8192) != 0 ? "" : str36, (i5 & 16384) != 0 ? "" : str37, (i5 & 32768) != 0 ? "" : str38, (i5 & 65536) != 0 ? "" : str39, (i5 & 131072) != 0 ? "" : str40, (i5 & 262144) != 0 ? null : b2CDetailExtraParamsBean, (i5 & 524288) != 0 ? "" : str41, (i5 & 1048576) != 0 ? "" : str42, (i5 & 2097152) != 0 ? yDY.AhwBna() : list, (i5 & 4194304) != 0 ? "" : str43, (i5 & 8388608) != 0 ? yDY.AhwBna() : list2, (i5 & 16777216) != 0 ? "" : str44, (i5 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str45, (i5 & 67108864) != 0 ? "" : str46, (i5 & 134217728) != 0 ? "" : str47, (i5 & 268435456) != 0 ? "" : str48, (i5 & 536870912) != 0 ? "" : str49, (i5 & 1073741824) == 0 ? dexOrderDetailBean : null);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.OrderDetailBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OrderDetailBean> serializer() {
            return OrderDetailBean$$serializer.INSTANCE;
        }

        public final OrderDetailBean copydefault(@NotNull OrderDetailResponseBean orderDetailResponseBean) {
            FxRateConversionBean fxRateConversionBean;
            UnFreezeDateBean unFreezeDateBeanAEQbTJ;
            UnFreezeDateBean unFreezeDateBean;
            ConvertOrderDetailBean convertOrderDetailBeanEZpvd;
            Intrinsics.checkNotNullParameter(orderDetailResponseBean, "");
            String baseAmount = orderDetailResponseBean.getBaseAmount();
            String baseCurrencySymbol = orderDetailResponseBean.getBaseCurrencySymbol();
            String baseCurrencyName = orderDetailResponseBean.getBaseCurrencyName();
            String baseCurrencyUrl = orderDetailResponseBean.getBaseCurrencyUrl();
            String baseCurrencyNightUrl = orderDetailResponseBean.getBaseCurrencyNightUrl();
            String completedTime = orderDetailResponseBean.getCompletedTime();
            long createDate = orderDetailResponseBean.getCreateDate();
            boolean showCustomer = orderDetailResponseBean.getShowCustomer();
            String customerUrl = orderDetailResponseBean.getCustomerUrl();
            String depositName = orderDetailResponseBean.getDepositName();
            int categoryCode = orderDetailResponseBean.getCategoryCode();
            String description = orderDetailResponseBean.getDescription();
            String estimateBaseAmount = orderDetailResponseBean.getEstimateBaseAmount();
            String expireSeconds = orderDetailResponseBean.getExpireSeconds();
            String expireDate = orderDetailResponseBean.getExpireDate();
            String chain = orderDetailResponseBean.getChain();
            String channelFee = orderDetailResponseBean.getChannelFee();
            String fee = orderDetailResponseBean.getFee();
            String iconUrl = orderDetailResponseBean.getIconUrl();
            String convertBaseColorfulIconUrl = orderDetailResponseBean.getConvertBaseColorfulIconUrl();
            String maxPurchaseTime = orderDetailResponseBean.getMaxPurchaseTime();
            String minPurchaseTime = orderDetailResponseBean.getMinPurchaseTime();
            String orderNo = orderDetailResponseBean.getOrderNo();
            String paymentMethod = orderDetailResponseBean.getPaymentMethod();
            String payCardNumber = orderDetailResponseBean.getPayCardNumber();
            String price = orderDetailResponseBean.getPrice();
            String priceType = orderDetailResponseBean.getPriceType();
            String quoteAmount = orderDetailResponseBean.getQuoteAmount();
            String quoteCurrencySymbol = orderDetailResponseBean.getQuoteCurrencySymbol();
            String quoteSymbol = orderDetailResponseBean.getQuoteSymbol();
            String quoteCurrencyUrl = orderDetailResponseBean.getQuoteCurrencyUrl();
            int status = orderDetailResponseBean.getStatus();
            boolean type = orderDetailResponseBean.getType();
            int orderType = orderDetailResponseBean.getOrderType();
            String frequency = orderDetailResponseBean.getFrequency();
            boolean zIsConvert = orderDetailResponseBean.isConvert();
            FxRateConversionResponseBean fxRateConversion = orderDetailResponseBean.getFxRateConversion();
            FxRateConversionBean fxRateConversionBeanOLrzqt = fxRateConversion != null ? FxRateConversionBean.Companion.OLrzqt(fxRateConversion) : null;
            UnFreezeDateResponseBean unFreezeDateResponse = orderDetailResponseBean.getUnFreezeDateResponse();
            if (unFreezeDateResponse != null) {
                fxRateConversionBean = fxRateConversionBeanOLrzqt;
                unFreezeDateBeanAEQbTJ = UnFreezeDateBean.Companion.AEQbTJ(unFreezeDateResponse);
            } else {
                fxRateConversionBean = fxRateConversionBeanOLrzqt;
                unFreezeDateBeanAEQbTJ = null;
            }
            ConvertOrderDetailResponseBean convertOrderDetail = orderDetailResponseBean.getConvertOrderDetail();
            if (convertOrderDetail != null) {
                unFreezeDateBean = unFreezeDateBeanAEQbTJ;
                convertOrderDetailBeanEZpvd = ConvertOrderDetailBean.Companion.EZpvd(convertOrderDetail);
            } else {
                unFreezeDateBean = unFreezeDateBeanAEQbTJ;
                convertOrderDetailBeanEZpvd = null;
            }
            String channelIcon = orderDetailResponseBean.getChannelIcon();
            String channelIconNight = orderDetailResponseBean.getChannelIconNight();
            String paymentMethodNightUrl = orderDetailResponseBean.getPaymentMethodNightUrl();
            String paymentMethodUrl = orderDetailResponseBean.getPaymentMethodUrl();
            String planId = orderDetailResponseBean.getPlanId();
            String depositPlatformCode = orderDetailResponseBean.getDepositPlatformCode();
            String failReason = orderDetailResponseBean.getFailReason();
            String bankName = orderDetailResponseBean.getBankName();
            String bankLogo = orderDetailResponseBean.getBankLogo();
            String bankNumber = orderDetailResponseBean.getBankNumber();
            String accountType = orderDetailResponseBean.getAccountType();
            B2CDetailExtraParamsResponseBean extParams = orderDetailResponseBean.getExtParams();
            ConvertOrderDetailBean convertOrderDetailBean = convertOrderDetailBeanEZpvd;
            B2CDetailExtraParamsBean b2CDetailExtraParamsBeanKWHzl = extParams != null ? B2CDetailExtraParamsBean.Companion.KWHzl(extParams) : null;
            String last4 = orderDetailResponseBean.getLast4();
            String tradeType = orderDetailResponseBean.getTradeType();
            List<SubOrderDetailResponseBean> subOrders = orderDetailResponseBean.getSubOrders();
            B2CDetailExtraParamsBean b2CDetailExtraParamsBean = b2CDetailExtraParamsBeanKWHzl;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(subOrders, 10));
            Iterator<T> it = subOrders.iterator();
            while (it.hasNext()) {
                arrayList.add(SubOrderDetailBean.Companion.KWHzl((SubOrderDetailResponseBean) it.next()));
            }
            String businessErrorCode = orderDetailResponseBean.getBusinessErrorCode();
            List<LocalizedFeeInfoResponseBean> localizedFeeInfo = orderDetailResponseBean.getLocalizedFeeInfo();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(localizedFeeInfo, 10));
            for (Iterator it2 = localizedFeeInfo.iterator(); it2.hasNext(); it2 = it2) {
                arrayList2.add(LocalizedFeeInfoBean.Companion.copydefault((LocalizedFeeInfoResponseBean) it2.next()));
            }
            String errorCode = orderDetailResponseBean.getErrorCode();
            String totalFee = orderDetailResponseBean.getTotalFee();
            String requestCurrencySymbol = orderDetailResponseBean.getRequestCurrencySymbol();
            String requestCurrencySign = orderDetailResponseBean.getRequestCurrencySign();
            String requestAmount = orderDetailResponseBean.getRequestAmount();
            String realAmount = orderDetailResponseBean.getRealAmount();
            DexOrderDetailResponseBean dexOrderDetail = orderDetailResponseBean.getDexOrderDetail();
            return new OrderDetailBean(baseAmount, baseCurrencySymbol, baseCurrencyName, baseCurrencyUrl, baseCurrencyNightUrl, completedTime, createDate, showCustomer, customerUrl, depositName, categoryCode, description, estimateBaseAmount, expireSeconds, expireDate, chain, channelFee, fee, iconUrl, convertBaseColorfulIconUrl, maxPurchaseTime, minPurchaseTime, orderNo, paymentMethod, payCardNumber, price, priceType, quoteAmount, quoteCurrencySymbol, quoteCurrencyUrl, quoteSymbol, status, type, orderType, frequency, zIsConvert, fxRateConversionBean, unFreezeDateBean, convertOrderDetailBean, channelIcon, channelIconNight, paymentMethodNightUrl, paymentMethodUrl, planId, depositPlatformCode, failReason, bankName, bankLogo, bankNumber, accountType, b2CDetailExtraParamsBean, last4, tradeType, arrayList, businessErrorCode, arrayList2, errorCode, totalFee, requestCurrencySymbol, requestCurrencySign, requestAmount, realAmount, dexOrderDetail != null ? DexOrderDetailBean.Companion.AEQbTJ(dexOrderDetail) : null);
        }
    }
}
