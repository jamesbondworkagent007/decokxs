package com.okinc.crcore.coreapi.net.responsebean.bsc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.crcore.coreapi.enums.ChannelCategoryCode;
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
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class OrderDetailResponseBean implements Parcelable {
    private String accountType;
    private String bankLogo;
    private String bankName;
    private String bankNumber;
    private String baseAmount;
    private String baseCurrencyName;
    private String baseCurrencyNightUrl;
    private String baseCurrencySymbol;
    private String baseCurrencyUrl;
    private final String businessErrorCode;
    private int categoryCode;
    private String chain;
    private String channelFee;
    private String channelIcon;
    private String channelIconNight;
    private String completedTime;
    private String convertBaseColorfulIconUrl;
    private ConvertOrderDetailResponseBean convertOrderDetail;
    private long createDate;
    private String customerUrl;
    private String depositName;
    private String depositPlatformCode;
    private String description;
    private final DexOrderDetailResponseBean dexOrderDetail;
    private final String errorCode;
    private String estimateBaseAmount;
    private String expireDate;
    private String expireSeconds;
    private final B2CDetailExtraParamsResponseBean extParams;
    private String failReason;
    private String fee;
    private final String frequency;
    private FxRateConversionResponseBean fxRateConversion;
    private String iconUrl;
    private boolean isConvert;
    private final String last4;
    private List<LocalizedFeeInfoResponseBean> localizedFeeInfo;
    private String maxPurchaseTime;
    private String minPurchaseTime;
    private String orderNo;
    private final int orderType;
    private String payCardNumber;
    private String paymentMethod;
    private String paymentMethodNightUrl;
    private String paymentMethodUrl;
    private String planId;
    private String price;
    private String priceType;
    private String quoteAmount;
    private String quoteCurrencySymbol;
    private String quoteCurrencyUrl;
    private String quoteSymbol;
    private final String realAmount;
    private final String requestAmount;
    private final String requestCurrencySign;
    private final String requestCurrencySymbol;
    private boolean showCustomer;
    private int status;
    private final List<SubOrderDetailResponseBean> subOrders;
    private final String totalFee;
    private final String tradeType;
    private boolean type;
    private UnFreezeDateResponseBean unFreezeDateResponse;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OrderDetailResponseBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(SubOrderDetailResponseBean$$serializer.INSTANCE), null, new ArrayListSerializer(LocalizedFeeInfoResponseBean$$serializer.INSTANCE), null, null, null, null, null, null, null};

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<OrderDetailResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderDetailResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            long j = parcel.readLong();
            boolean z = parcel.readInt() != 0;
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            int i = parcel.readInt();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            String string23 = parcel.readString();
            String string24 = parcel.readString();
            String string25 = parcel.readString();
            String string26 = parcel.readString();
            String string27 = parcel.readString();
            String string28 = parcel.readString();
            int i2 = parcel.readInt();
            boolean z2 = parcel.readInt() != 0;
            int i3 = parcel.readInt();
            String string29 = parcel.readString();
            boolean z3 = parcel.readInt() != 0;
            FxRateConversionResponseBean fxRateConversionResponseBeanCreateFromParcel = parcel.readInt() == 0 ? null : FxRateConversionResponseBean.CREATOR.createFromParcel(parcel);
            UnFreezeDateResponseBean unFreezeDateResponseBeanCreateFromParcel = parcel.readInt() == 0 ? null : UnFreezeDateResponseBean.CREATOR.createFromParcel(parcel);
            ConvertOrderDetailResponseBean convertOrderDetailResponseBeanCreateFromParcel = parcel.readInt() == 0 ? null : ConvertOrderDetailResponseBean.CREATOR.createFromParcel(parcel);
            String string30 = parcel.readString();
            String string31 = parcel.readString();
            String string32 = parcel.readString();
            String string33 = parcel.readString();
            String string34 = parcel.readString();
            String string35 = parcel.readString();
            String string36 = parcel.readString();
            String string37 = parcel.readString();
            String string38 = parcel.readString();
            String string39 = parcel.readString();
            String string40 = parcel.readString();
            B2CDetailExtraParamsResponseBean b2CDetailExtraParamsResponseBeanCreateFromParcel = parcel.readInt() == 0 ? null : B2CDetailExtraParamsResponseBean.CREATOR.createFromParcel(parcel);
            String string41 = parcel.readString();
            String string42 = parcel.readString();
            int i4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i4);
            int i5 = 0;
            while (i5 != i4) {
                arrayList.add(SubOrderDetailResponseBean.CREATOR.createFromParcel(parcel));
                i5++;
                i4 = i4;
            }
            String string43 = parcel.readString();
            int i6 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i6);
            int i7 = 0;
            while (i7 != i6) {
                arrayList2.add(LocalizedFeeInfoResponseBean.CREATOR.createFromParcel(parcel));
                i7++;
                i6 = i6;
            }
            return new OrderDetailResponseBean(string, string2, string3, string4, string5, string6, j, z, string7, string8, i, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, i2, z2, i3, string29, z3, fxRateConversionResponseBeanCreateFromParcel, unFreezeDateResponseBeanCreateFromParcel, convertOrderDetailResponseBeanCreateFromParcel, string30, string31, string32, string33, string34, string35, string36, string37, string38, string39, string40, b2CDetailExtraParamsResponseBeanCreateFromParcel, string41, string42, arrayList, string43, arrayList2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? DexOrderDetailResponseBean.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderDetailResponseBean[] newArray(int i) {
            return new OrderDetailResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OrderDetailResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0L, false, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false, 0, (String) null, false, (FxRateConversionResponseBean) null, (UnFreezeDateResponseBean) null, (ConvertOrderDetailResponseBean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (B2CDetailExtraParamsResponseBean) null, (String) null, (String) null, (List) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (DexOrderDetailResponseBean) null, -1, Integer.MAX_VALUE, (DefaultConstructorMarker) null);
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
        return this.channelFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.chain;
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
    public final FxRateConversionResponseBean component37() {
        return this.fxRateConversion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnFreezeDateResponseBean component38() {
        return this.unFreezeDateResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertOrderDetailResponseBean component39() {
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
    public final B2CDetailExtraParamsResponseBean component51() {
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
    public final List<SubOrderDetailResponseBean> component54() {
        return this.subOrders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component55() {
        return this.businessErrorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<LocalizedFeeInfoResponseBean> component56() {
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
    public final DexOrderDetailResponseBean component63() {
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
    public final OrderDetailResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, long j, boolean z, @NotNull String str7, @NotNull String str8, int i, @NotNull String str9, @NotNull String str10, @NotNull String str11, String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, int i2, boolean z2, int i3, @NotNull String str29, boolean z3, FxRateConversionResponseBean fxRateConversionResponseBean, UnFreezeDateResponseBean unFreezeDateResponseBean, ConvertOrderDetailResponseBean convertOrderDetailResponseBean, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, B2CDetailExtraParamsResponseBean b2CDetailExtraParamsResponseBean, @NotNull String str41, @NotNull String str42, @NotNull List<SubOrderDetailResponseBean> list, @NotNull String str43, @NotNull List<LocalizedFeeInfoResponseBean> list2, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47, @NotNull String str48, @NotNull String str49, DexOrderDetailResponseBean dexOrderDetailResponseBean) {
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
        return new OrderDetailResponseBean(str, str2, str3, str4, str5, str6, j, z, str7, str8, i, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, i2, z2, i3, str29, z3, fxRateConversionResponseBean, unFreezeDateResponseBean, convertOrderDetailResponseBean, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, b2CDetailExtraParamsResponseBean, str41, str42, list, str43, list2, str44, str45, str46, str47, str48, str49, dexOrderDetailResponseBean);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderDetailResponseBean)) {
            return false;
        }
        OrderDetailResponseBean orderDetailResponseBean = (OrderDetailResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.baseAmount, (Object) orderDetailResponseBean.baseAmount) && Intrinsics.EZpvd((Object) this.baseCurrencySymbol, (Object) orderDetailResponseBean.baseCurrencySymbol) && Intrinsics.EZpvd((Object) this.baseCurrencyName, (Object) orderDetailResponseBean.baseCurrencyName) && Intrinsics.EZpvd((Object) this.baseCurrencyUrl, (Object) orderDetailResponseBean.baseCurrencyUrl) && Intrinsics.EZpvd((Object) this.baseCurrencyNightUrl, (Object) orderDetailResponseBean.baseCurrencyNightUrl) && Intrinsics.EZpvd((Object) this.completedTime, (Object) orderDetailResponseBean.completedTime) && this.createDate == orderDetailResponseBean.createDate && this.showCustomer == orderDetailResponseBean.showCustomer && Intrinsics.EZpvd((Object) this.customerUrl, (Object) orderDetailResponseBean.customerUrl) && Intrinsics.EZpvd((Object) this.depositName, (Object) orderDetailResponseBean.depositName) && this.categoryCode == orderDetailResponseBean.categoryCode && Intrinsics.EZpvd((Object) this.description, (Object) orderDetailResponseBean.description) && Intrinsics.EZpvd((Object) this.estimateBaseAmount, (Object) orderDetailResponseBean.estimateBaseAmount) && Intrinsics.EZpvd((Object) this.expireSeconds, (Object) orderDetailResponseBean.expireSeconds) && Intrinsics.EZpvd((Object) this.expireDate, (Object) orderDetailResponseBean.expireDate) && Intrinsics.EZpvd((Object) this.channelFee, (Object) orderDetailResponseBean.channelFee) && Intrinsics.EZpvd((Object) this.chain, (Object) orderDetailResponseBean.chain) && Intrinsics.EZpvd((Object) this.fee, (Object) orderDetailResponseBean.fee) && Intrinsics.EZpvd((Object) this.iconUrl, (Object) orderDetailResponseBean.iconUrl) && Intrinsics.EZpvd((Object) this.convertBaseColorfulIconUrl, (Object) orderDetailResponseBean.convertBaseColorfulIconUrl) && Intrinsics.EZpvd((Object) this.maxPurchaseTime, (Object) orderDetailResponseBean.maxPurchaseTime) && Intrinsics.EZpvd((Object) this.minPurchaseTime, (Object) orderDetailResponseBean.minPurchaseTime) && Intrinsics.EZpvd((Object) this.orderNo, (Object) orderDetailResponseBean.orderNo) && Intrinsics.EZpvd((Object) this.paymentMethod, (Object) orderDetailResponseBean.paymentMethod) && Intrinsics.EZpvd((Object) this.payCardNumber, (Object) orderDetailResponseBean.payCardNumber) && Intrinsics.EZpvd((Object) this.price, (Object) orderDetailResponseBean.price) && Intrinsics.EZpvd((Object) this.priceType, (Object) orderDetailResponseBean.priceType) && Intrinsics.EZpvd((Object) this.quoteAmount, (Object) orderDetailResponseBean.quoteAmount) && Intrinsics.EZpvd((Object) this.quoteCurrencySymbol, (Object) orderDetailResponseBean.quoteCurrencySymbol) && Intrinsics.EZpvd((Object) this.quoteCurrencyUrl, (Object) orderDetailResponseBean.quoteCurrencyUrl) && Intrinsics.EZpvd((Object) this.quoteSymbol, (Object) orderDetailResponseBean.quoteSymbol) && this.status == orderDetailResponseBean.status && this.type == orderDetailResponseBean.type && this.orderType == orderDetailResponseBean.orderType && Intrinsics.EZpvd((Object) this.frequency, (Object) orderDetailResponseBean.frequency) && this.isConvert == orderDetailResponseBean.isConvert && Intrinsics.EZpvd(this.fxRateConversion, orderDetailResponseBean.fxRateConversion) && Intrinsics.EZpvd(this.unFreezeDateResponse, orderDetailResponseBean.unFreezeDateResponse) && Intrinsics.EZpvd(this.convertOrderDetail, orderDetailResponseBean.convertOrderDetail) && Intrinsics.EZpvd((Object) this.channelIcon, (Object) orderDetailResponseBean.channelIcon) && Intrinsics.EZpvd((Object) this.channelIconNight, (Object) orderDetailResponseBean.channelIconNight) && Intrinsics.EZpvd((Object) this.paymentMethodNightUrl, (Object) orderDetailResponseBean.paymentMethodNightUrl) && Intrinsics.EZpvd((Object) this.paymentMethodUrl, (Object) orderDetailResponseBean.paymentMethodUrl) && Intrinsics.EZpvd((Object) this.planId, (Object) orderDetailResponseBean.planId) && Intrinsics.EZpvd((Object) this.depositPlatformCode, (Object) orderDetailResponseBean.depositPlatformCode) && Intrinsics.EZpvd((Object) this.failReason, (Object) orderDetailResponseBean.failReason) && Intrinsics.EZpvd((Object) this.bankName, (Object) orderDetailResponseBean.bankName) && Intrinsics.EZpvd((Object) this.bankLogo, (Object) orderDetailResponseBean.bankLogo) && Intrinsics.EZpvd((Object) this.bankNumber, (Object) orderDetailResponseBean.bankNumber) && Intrinsics.EZpvd((Object) this.accountType, (Object) orderDetailResponseBean.accountType) && Intrinsics.EZpvd(this.extParams, orderDetailResponseBean.extParams) && Intrinsics.EZpvd((Object) this.last4, (Object) orderDetailResponseBean.last4) && Intrinsics.EZpvd((Object) this.tradeType, (Object) orderDetailResponseBean.tradeType) && Intrinsics.EZpvd(this.subOrders, orderDetailResponseBean.subOrders) && Intrinsics.EZpvd((Object) this.businessErrorCode, (Object) orderDetailResponseBean.businessErrorCode) && Intrinsics.EZpvd(this.localizedFeeInfo, orderDetailResponseBean.localizedFeeInfo) && Intrinsics.EZpvd((Object) this.errorCode, (Object) orderDetailResponseBean.errorCode) && Intrinsics.EZpvd((Object) this.totalFee, (Object) orderDetailResponseBean.totalFee) && Intrinsics.EZpvd((Object) this.requestCurrencySymbol, (Object) orderDetailResponseBean.requestCurrencySymbol) && Intrinsics.EZpvd((Object) this.requestCurrencySign, (Object) orderDetailResponseBean.requestCurrencySign) && Intrinsics.EZpvd((Object) this.requestAmount, (Object) orderDetailResponseBean.requestAmount) && Intrinsics.EZpvd((Object) this.realAmount, (Object) orderDetailResponseBean.realAmount) && Intrinsics.EZpvd(this.dexOrderDetail, orderDetailResponseBean.dexOrderDetail);
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
    public final ConvertOrderDetailResponseBean getConvertOrderDetail() {
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
    public final DexOrderDetailResponseBean getDexOrderDetail() {
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
    public final B2CDetailExtraParamsResponseBean getExtParams() {
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
    public final FxRateConversionResponseBean getFxRateConversion() {
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
    public final List<LocalizedFeeInfoResponseBean> getLocalizedFeeInfo() {
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
    public final List<SubOrderDetailResponseBean> getSubOrders() {
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
    public final UnFreezeDateResponseBean getUnFreezeDateResponse() {
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
        int iHashCode16 = this.channelFee.hashCode();
        int iHashCode17 = this.chain.hashCode();
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
        FxRateConversionResponseBean fxRateConversionResponseBean = this.fxRateConversion;
        int iHashCode37 = fxRateConversionResponseBean == null ? 0 : fxRateConversionResponseBean.hashCode();
        UnFreezeDateResponseBean unFreezeDateResponseBean = this.unFreezeDateResponse;
        int iHashCode38 = unFreezeDateResponseBean == null ? 0 : unFreezeDateResponseBean.hashCode();
        ConvertOrderDetailResponseBean convertOrderDetailResponseBean = this.convertOrderDetail;
        int iHashCode39 = convertOrderDetailResponseBean == null ? 0 : convertOrderDetailResponseBean.hashCode();
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
        B2CDetailExtraParamsResponseBean b2CDetailExtraParamsResponseBean = this.extParams;
        int iHashCode51 = b2CDetailExtraParamsResponseBean == null ? 0 : b2CDetailExtraParamsResponseBean.hashCode();
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
        DexOrderDetailResponseBean dexOrderDetailResponseBean = this.dexOrderDetail;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode59) * 31) + iHashCode60) * 31) + iHashCode61) * 31) + iHashCode62) * 31) + (dexOrderDetailResponseBean != null ? dexOrderDetailResponseBean.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConvert() {
        return this.isConvert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBankLogo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bankLogo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBankName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bankName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBankNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bankNumber = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCurrencyName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseCurrencyName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCurrencyNightUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseCurrencyNightUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCurrencySymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseCurrencySymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCurrencyUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseCurrencyUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCategoryCode(int i) {
        this.categoryCode = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChain(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chain = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChannelFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.channelFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChannelIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.channelIcon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChannelIconNight(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.channelIconNight = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCompletedTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.completedTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConvert(boolean z) {
        this.isConvert = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConvertBaseColorfulIconUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.convertBaseColorfulIconUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConvertOrderDetail(ConvertOrderDetailResponseBean convertOrderDetailResponseBean) {
        this.convertOrderDetail = convertOrderDetailResponseBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateDate(long j) {
        this.createDate = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCustomerUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.customerUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDepositName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.depositName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDepositPlatformCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.depositPlatformCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.description = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimateBaseAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.estimateBaseAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpireDate(String str) {
        this.expireDate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpireSeconds(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.expireSeconds = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFailReason(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.failReason = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFxRateConversion(FxRateConversionResponseBean fxRateConversionResponseBean) {
        this.fxRateConversion = fxRateConversionResponseBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIconUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.iconUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocalizedFeeInfo(@NotNull List<LocalizedFeeInfoResponseBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.localizedFeeInfo = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxPurchaseTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxPurchaseTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinPurchaseTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minPurchaseTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderNo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderNo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayCardNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.payCardNumber = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymentMethod(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymentMethod = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymentMethodNightUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymentMethodNightUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymentMethodUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymentMethodUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlanId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.planId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.priceType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteCurrencySymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteCurrencySymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteCurrencyUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteCurrencyUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowCustomer(boolean z) {
        this.showCustomer = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(int i) {
        this.status = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(boolean z) {
        this.type = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnFreezeDateResponse(UnFreezeDateResponseBean unFreezeDateResponseBean) {
        this.unFreezeDateResponse = unFreezeDateResponseBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrderDetailResponseBean(baseAmount=" + this.baseAmount + ", baseCurrencySymbol=" + this.baseCurrencySymbol + ", baseCurrencyName=" + this.baseCurrencyName + ", baseCurrencyUrl=" + this.baseCurrencyUrl + ", baseCurrencyNightUrl=" + this.baseCurrencyNightUrl + ", completedTime=" + this.completedTime + ", createDate=" + this.createDate + ", showCustomer=" + this.showCustomer + ", customerUrl=" + this.customerUrl + ", depositName=" + this.depositName + ", categoryCode=" + this.categoryCode + ", description=" + this.description + ", estimateBaseAmount=" + this.estimateBaseAmount + ", expireSeconds=" + this.expireSeconds + ", expireDate=" + this.expireDate + ", channelFee=" + this.channelFee + ", chain=" + this.chain + ", fee=" + this.fee + ", iconUrl=" + this.iconUrl + ", convertBaseColorfulIconUrl=" + this.convertBaseColorfulIconUrl + ", maxPurchaseTime=" + this.maxPurchaseTime + ", minPurchaseTime=" + this.minPurchaseTime + ", orderNo=" + this.orderNo + ", paymentMethod=" + this.paymentMethod + ", payCardNumber=" + this.payCardNumber + ", price=" + this.price + ", priceType=" + this.priceType + ", quoteAmount=" + this.quoteAmount + ", quoteCurrencySymbol=" + this.quoteCurrencySymbol + ", quoteCurrencyUrl=" + this.quoteCurrencyUrl + ", quoteSymbol=" + this.quoteSymbol + ", status=" + this.status + ", type=" + this.type + ", orderType=" + this.orderType + ", frequency=" + this.frequency + ", isConvert=" + this.isConvert + ", fxRateConversion=" + this.fxRateConversion + ", unFreezeDateResponse=" + this.unFreezeDateResponse + ", convertOrderDetail=" + this.convertOrderDetail + ", channelIcon=" + this.channelIcon + ", channelIconNight=" + this.channelIconNight + ", paymentMethodNightUrl=" + this.paymentMethodNightUrl + ", paymentMethodUrl=" + this.paymentMethodUrl + ", planId=" + this.planId + ", depositPlatformCode=" + this.depositPlatformCode + ", failReason=" + this.failReason + ", bankName=" + this.bankName + ", bankLogo=" + this.bankLogo + ", bankNumber=" + this.bankNumber + ", accountType=" + this.accountType + ", extParams=" + this.extParams + ", last4=" + this.last4 + ", tradeType=" + this.tradeType + ", subOrders=" + this.subOrders + ", businessErrorCode=" + this.businessErrorCode + ", localizedFeeInfo=" + this.localizedFeeInfo + ", errorCode=" + this.errorCode + ", totalFee=" + this.totalFee + ", requestCurrencySymbol=" + this.requestCurrencySymbol + ", requestCurrencySign=" + this.requestCurrencySign + ", requestAmount=" + this.requestAmount + ", realAmount=" + this.realAmount + ", dexOrderDetail=" + this.dexOrderDetail + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.baseAmount);
        parcel.writeString(this.baseCurrencySymbol);
        parcel.writeString(this.baseCurrencyName);
        parcel.writeString(this.baseCurrencyUrl);
        parcel.writeString(this.baseCurrencyNightUrl);
        parcel.writeString(this.completedTime);
        parcel.writeLong(this.createDate);
        parcel.writeInt(this.showCustomer ? 1 : 0);
        parcel.writeString(this.customerUrl);
        parcel.writeString(this.depositName);
        parcel.writeInt(this.categoryCode);
        parcel.writeString(this.description);
        parcel.writeString(this.estimateBaseAmount);
        parcel.writeString(this.expireSeconds);
        parcel.writeString(this.expireDate);
        parcel.writeString(this.channelFee);
        parcel.writeString(this.chain);
        parcel.writeString(this.fee);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.convertBaseColorfulIconUrl);
        parcel.writeString(this.maxPurchaseTime);
        parcel.writeString(this.minPurchaseTime);
        parcel.writeString(this.orderNo);
        parcel.writeString(this.paymentMethod);
        parcel.writeString(this.payCardNumber);
        parcel.writeString(this.price);
        parcel.writeString(this.priceType);
        parcel.writeString(this.quoteAmount);
        parcel.writeString(this.quoteCurrencySymbol);
        parcel.writeString(this.quoteCurrencyUrl);
        parcel.writeString(this.quoteSymbol);
        parcel.writeInt(this.status);
        parcel.writeInt(this.type ? 1 : 0);
        parcel.writeInt(this.orderType);
        parcel.writeString(this.frequency);
        parcel.writeInt(this.isConvert ? 1 : 0);
        FxRateConversionResponseBean fxRateConversionResponseBean = this.fxRateConversion;
        if (fxRateConversionResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fxRateConversionResponseBean.writeToParcel(parcel, i);
        }
        UnFreezeDateResponseBean unFreezeDateResponseBean = this.unFreezeDateResponse;
        if (unFreezeDateResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            unFreezeDateResponseBean.writeToParcel(parcel, i);
        }
        ConvertOrderDetailResponseBean convertOrderDetailResponseBean = this.convertOrderDetail;
        if (convertOrderDetailResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            convertOrderDetailResponseBean.writeToParcel(parcel, i);
        }
        parcel.writeString(this.channelIcon);
        parcel.writeString(this.channelIconNight);
        parcel.writeString(this.paymentMethodNightUrl);
        parcel.writeString(this.paymentMethodUrl);
        parcel.writeString(this.planId);
        parcel.writeString(this.depositPlatformCode);
        parcel.writeString(this.failReason);
        parcel.writeString(this.bankName);
        parcel.writeString(this.bankLogo);
        parcel.writeString(this.bankNumber);
        parcel.writeString(this.accountType);
        B2CDetailExtraParamsResponseBean b2CDetailExtraParamsResponseBean = this.extParams;
        if (b2CDetailExtraParamsResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            b2CDetailExtraParamsResponseBean.writeToParcel(parcel, i);
        }
        parcel.writeString(this.last4);
        parcel.writeString(this.tradeType);
        List<SubOrderDetailResponseBean> list = this.subOrders;
        parcel.writeInt(list.size());
        Iterator<SubOrderDetailResponseBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.businessErrorCode);
        List<LocalizedFeeInfoResponseBean> list2 = this.localizedFeeInfo;
        parcel.writeInt(list2.size());
        Iterator<LocalizedFeeInfoResponseBean> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.errorCode);
        parcel.writeString(this.totalFee);
        parcel.writeString(this.requestCurrencySymbol);
        parcel.writeString(this.requestCurrencySign);
        parcel.writeString(this.requestAmount);
        parcel.writeString(this.realAmount);
        DexOrderDetailResponseBean dexOrderDetailResponseBean = this.dexOrderDetail;
        if (dexOrderDetailResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexOrderDetailResponseBean.writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.OrderDetailResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OrderDetailResponseBean> serializer() {
            return OrderDetailResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OrderDetailResponseBean(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, long j, boolean z, String str7, String str8, int i3, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, int i4, boolean z2, int i5, String str29, boolean z3, FxRateConversionResponseBean fxRateConversionResponseBean, UnFreezeDateResponseBean unFreezeDateResponseBean, ConvertOrderDetailResponseBean convertOrderDetailResponseBean, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, B2CDetailExtraParamsResponseBean b2CDetailExtraParamsResponseBean, String str41, String str42, List list, String str43, List list2, String str44, String str45, String str46, String str47, String str48, String str49, DexOrderDetailResponseBean dexOrderDetailResponseBean, SerializationConstructorMarker serializationConstructorMarker) {
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
        this.categoryCode = (i & 1024) == 0 ? ChannelCategoryCode.THIRD_PARTY.getCode() : i3;
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
            this.channelFee = "";
        } else {
            this.channelFee = str13;
        }
        if ((i & 65536) == 0) {
            this.chain = "";
        } else {
            this.chain = str14;
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
            this.fxRateConversion = fxRateConversionResponseBean;
        }
        if ((i2 & 32) == 0) {
            this.unFreezeDateResponse = null;
        } else {
            this.unFreezeDateResponse = unFreezeDateResponseBean;
        }
        if ((i2 & 64) == 0) {
            this.convertOrderDetail = null;
        } else {
            this.convertOrderDetail = convertOrderDetailResponseBean;
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
            this.extParams = b2CDetailExtraParamsResponseBean;
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
            this.dexOrderDetail = dexOrderDetailResponseBean;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [13=4] */
    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(OrderDetailResponseBean orderDetailResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.baseAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, orderDetailResponseBean.baseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.baseCurrencySymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, orderDetailResponseBean.baseCurrencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.baseCurrencyName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, orderDetailResponseBean.baseCurrencyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.baseCurrencyUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, orderDetailResponseBean.baseCurrencyUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.baseCurrencyNightUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, orderDetailResponseBean.baseCurrencyNightUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.completedTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, orderDetailResponseBean.completedTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || orderDetailResponseBean.createDate != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 6, orderDetailResponseBean.createDate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || orderDetailResponseBean.showCustomer) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, orderDetailResponseBean.showCustomer);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.customerUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, orderDetailResponseBean.customerUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.depositName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, orderDetailResponseBean.depositName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || orderDetailResponseBean.categoryCode != ChannelCategoryCode.THIRD_PARTY.getCode()) {
            compositeEncoder.encodeIntElement(serialDescriptor, 10, orderDetailResponseBean.categoryCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.description, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, orderDetailResponseBean.description);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.estimateBaseAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, orderDetailResponseBean.estimateBaseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.expireSeconds, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, orderDetailResponseBean.expireSeconds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.expireDate, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, orderDetailResponseBean.expireDate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.channelFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, orderDetailResponseBean.channelFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.chain, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, orderDetailResponseBean.chain);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.fee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, orderDetailResponseBean.fee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.iconUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, orderDetailResponseBean.iconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.convertBaseColorfulIconUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, orderDetailResponseBean.convertBaseColorfulIconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.maxPurchaseTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, orderDetailResponseBean.maxPurchaseTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.minPurchaseTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, orderDetailResponseBean.minPurchaseTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.orderNo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, orderDetailResponseBean.orderNo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.paymentMethod, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, orderDetailResponseBean.paymentMethod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.payCardNumber, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, orderDetailResponseBean.payCardNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, orderDetailResponseBean.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.priceType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, orderDetailResponseBean.priceType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.quoteAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, orderDetailResponseBean.quoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.quoteCurrencySymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, orderDetailResponseBean.quoteCurrencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.quoteCurrencyUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, orderDetailResponseBean.quoteCurrencyUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.quoteSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, orderDetailResponseBean.quoteSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || orderDetailResponseBean.status != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 31, orderDetailResponseBean.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !orderDetailResponseBean.type) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 32, orderDetailResponseBean.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || orderDetailResponseBean.orderType != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 33, orderDetailResponseBean.orderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.frequency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, orderDetailResponseBean.frequency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || orderDetailResponseBean.isConvert) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 35, orderDetailResponseBean.isConvert);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || orderDetailResponseBean.fxRateConversion != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, FxRateConversionResponseBean$$serializer.INSTANCE, orderDetailResponseBean.fxRateConversion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || orderDetailResponseBean.unFreezeDateResponse != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 37, UnFreezeDateResponseBean$$serializer.INSTANCE, orderDetailResponseBean.unFreezeDateResponse);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || orderDetailResponseBean.convertOrderDetail != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 38, ConvertOrderDetailResponseBean$$serializer.INSTANCE, orderDetailResponseBean.convertOrderDetail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.channelIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 39, orderDetailResponseBean.channelIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.channelIconNight, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 40, orderDetailResponseBean.channelIconNight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.paymentMethodNightUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 41, orderDetailResponseBean.paymentMethodNightUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.paymentMethodUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 42, orderDetailResponseBean.paymentMethodUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.planId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 43, orderDetailResponseBean.planId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.depositPlatformCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 44, orderDetailResponseBean.depositPlatformCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.failReason, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 45, orderDetailResponseBean.failReason);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.bankName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 46, orderDetailResponseBean.bankName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.bankLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 47, orderDetailResponseBean.bankLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.bankNumber, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 48, orderDetailResponseBean.bankNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.accountType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 49, orderDetailResponseBean.accountType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || orderDetailResponseBean.extParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 50, B2CDetailExtraParamsResponseBean$$serializer.INSTANCE, orderDetailResponseBean.extParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.last4, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 51, orderDetailResponseBean.last4);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.tradeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 52, orderDetailResponseBean.tradeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || !Intrinsics.EZpvd(orderDetailResponseBean.subOrders, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 53, kSerializerArr[53], orderDetailResponseBean.subOrders);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.businessErrorCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 54, orderDetailResponseBean.businessErrorCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || !Intrinsics.EZpvd(orderDetailResponseBean.localizedFeeInfo, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 55, kSerializerArr[55], orderDetailResponseBean.localizedFeeInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.errorCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 56, orderDetailResponseBean.errorCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.totalFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 57, orderDetailResponseBean.totalFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 58) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.requestCurrencySymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 58, orderDetailResponseBean.requestCurrencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 59) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.requestCurrencySign, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 59, orderDetailResponseBean.requestCurrencySign);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 60) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.requestAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 60, orderDetailResponseBean.requestAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 61) || !Intrinsics.EZpvd((Object) orderDetailResponseBean.realAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 61, orderDetailResponseBean.realAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 62) && orderDetailResponseBean.dexOrderDetail == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 62, DexOrderDetailResponseBean$$serializer.INSTANCE, orderDetailResponseBean.dexOrderDetail);
    }

    public OrderDetailResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, long j, boolean z, @NotNull String str7, @NotNull String str8, int i, @NotNull String str9, @NotNull String str10, @NotNull String str11, String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, int i2, boolean z2, int i3, @NotNull String str29, boolean z3, FxRateConversionResponseBean fxRateConversionResponseBean, UnFreezeDateResponseBean unFreezeDateResponseBean, ConvertOrderDetailResponseBean convertOrderDetailResponseBean, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, B2CDetailExtraParamsResponseBean b2CDetailExtraParamsResponseBean, @NotNull String str41, @NotNull String str42, @NotNull List<SubOrderDetailResponseBean> list, @NotNull String str43, @NotNull List<LocalizedFeeInfoResponseBean> list2, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47, @NotNull String str48, @NotNull String str49, DexOrderDetailResponseBean dexOrderDetailResponseBean) {
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
        this.channelFee = str13;
        this.chain = str14;
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
        this.fxRateConversion = fxRateConversionResponseBean;
        this.unFreezeDateResponse = unFreezeDateResponseBean;
        this.convertOrderDetail = convertOrderDetailResponseBean;
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
        this.extParams = b2CDetailExtraParamsResponseBean;
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
        this.dexOrderDetail = dexOrderDetailResponseBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x030b: CONSTRUCTOR 
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
  (wrap:int:?: TERNARY null = ((wrap:int:0x0057: ARITH (r130v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005d: INVOKE 
  (wrap:com.okinc.crcore.coreapi.enums.ChannelCategoryCode:0x005b: SGET  A[WRAPPED] (LINE:27) com.okinc.crcore.coreapi.enums.ChannelCategoryCode.THIRD_PARTY com.okinc.crcore.coreapi.enums.ChannelCategoryCode)
 VIRTUAL call: com.okinc.crcore.coreapi.enums.ChannelCategoryCode.getCode():int A[MD:():int (m), WRAPPED] (LINE:27)) : (r77v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r130v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r78v0 java.lang.String))
  (wrap:java.lang.String:0x0077: TERNARY null = ((wrap:int:0x006e: ARITH (r130v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r79v0 java.lang.String))
  (wrap:java.lang.String:0x0082: TERNARY null = ((wrap:int:0x0079: ARITH (r130v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r80v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0084: ARITH (r130v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r81v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0090: ARITH (r130v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r82v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009b: ARITH (r130v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r83v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a6: ARITH (r130v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r84v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b1: ARITH (r130v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r85v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bc: ARITH (r130v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r86v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c7: ARITH (r130v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r87v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d2: ARITH (r130v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r88v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00dd: ARITH (r130v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r89v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e8: ARITH (r130v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r90v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f3: ARITH (r130v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r91v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fe: ARITH (r130v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r92v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0109: ARITH (r130v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r93v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0114: ARITH (r130v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r94v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011f: ARITH (r130v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r95v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012a: ARITH (r130v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r96v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0135: ARITH (r130v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r97v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0140: ARITH (r130v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r98v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0148: ARITH (r131v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r99v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0153: ARITH (r131v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r100v0 int) : (1 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x015a: ARITH (r131v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r101v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0163: ARITH (r131v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r102v0 boolean))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.bsc.FxRateConversionResponseBean:?: TERNARY null = ((wrap:int:0x016c: ARITH (r131v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.coreapi.net.responsebean.bsc.FxRateConversionResponseBean) : (r103v0 com.okinc.crcore.coreapi.net.responsebean.bsc.FxRateConversionResponseBean))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.bsc.UnFreezeDateResponseBean:?: TERNARY null = ((wrap:int:0x0177: ARITH (r131v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.coreapi.net.responsebean.bsc.UnFreezeDateResponseBean) : (r104v0 com.okinc.crcore.coreapi.net.responsebean.bsc.UnFreezeDateResponseBean))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.bsc.ConvertOrderDetailResponseBean:?: TERNARY null = ((wrap:int:0x0180: ARITH (r131v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.coreapi.net.responsebean.bsc.ConvertOrderDetailResponseBean) : (r105v0 com.okinc.crcore.coreapi.net.responsebean.bsc.ConvertOrderDetailResponseBean))
  (wrap:java.lang.String:0x0194: TERNARY null = ((wrap:int:0x018b: ARITH (r131v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r106v0 java.lang.String))
  (wrap:java.lang.String:0x019f: TERNARY null = ((wrap:int:0x0196: ARITH (r131v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r107v0 java.lang.String))
  (wrap:java.lang.String:0x01aa: TERNARY null = ((wrap:int:0x01a1: ARITH (r131v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r108v0 java.lang.String))
  (wrap:java.lang.String:0x01b5: TERNARY null = ((wrap:int:0x01ac: ARITH (r131v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r109v0 java.lang.String))
  (wrap:java.lang.String:0x01c0: TERNARY null = ((wrap:int:0x01b7: ARITH (r131v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r110v0 java.lang.String))
  (wrap:java.lang.String:0x01cb: TERNARY null = ((wrap:int:0x01c2: ARITH (r131v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r111v0 java.lang.String))
  (wrap:java.lang.String:0x01d6: TERNARY null = ((wrap:int:0x01cd: ARITH (r131v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r112v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01d8: ARITH (r131v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r113v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01e1: ARITH (r131v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r114v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01ea: ARITH (r131v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r115v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01f3: ARITH (r131v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r116v0 java.lang.String))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.bsc.B2CDetailExtraParamsResponseBean:?: TERNARY null = ((wrap:int:0x01fc: ARITH (r131v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.coreapi.net.responsebean.bsc.B2CDetailExtraParamsResponseBean) : (r117v0 com.okinc.crcore.coreapi.net.responsebean.bsc.B2CDetailExtraParamsResponseBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0207: ARITH (r131v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r118v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0212: ARITH (r131v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r119v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x021d: ARITH (r131v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0221: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:70)) : (r120v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x022a: ARITH (r131v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r121v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0235: ARITH (r131v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0239: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:72)) : (r122v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0242: ARITH (r131v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r123v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x024d: ARITH (r131v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r124v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0258: ARITH (r131v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r125v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0263: ARITH (r131v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r126v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x026e: ARITH (r131v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r127v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0279: ARITH (r131v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r128v0 java.lang.String))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.bsc.DexOrderDetailResponseBean:?: TERNARY null = ((wrap:int:0x0284: ARITH (r131v0 int) & (1073741824 int) A[WRAPPED]) == (0 int)) ? (r129v0 com.okinc.crcore.coreapi.net.responsebean.bsc.DexOrderDetailResponseBean) : (null com.okinc.crcore.coreapi.net.responsebean.bsc.DexOrderDetailResponseBean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, boolean, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, int, java.lang.String, boolean, com.okinc.crcore.coreapi.net.responsebean.bsc.FxRateConversionResponseBean, com.okinc.crcore.coreapi.net.responsebean.bsc.UnFreezeDateResponseBean, com.okinc.crcore.coreapi.net.responsebean.bsc.ConvertOrderDetailResponseBean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.crcore.coreapi.net.responsebean.bsc.B2CDetailExtraParamsResponseBean, java.lang.String, java.lang.String, java.util.List<com.okinc.crcore.coreapi.net.responsebean.bsc.SubOrderDetailResponseBean>, java.lang.String, java.util.List<com.okinc.crcore.coreapi.net.responsebean.bsc.LocalizedFeeInfoResponseBean>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.crcore.coreapi.net.responsebean.bsc.DexOrderDetailResponseBean):void (m)] (LINE:16) call: com.okinc.crcore.coreapi.net.responsebean.bsc.OrderDetailResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, boolean, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, int, java.lang.String, boolean, com.okinc.crcore.coreapi.net.responsebean.bsc.FxRateConversionResponseBean, com.okinc.crcore.coreapi.net.responsebean.bsc.UnFreezeDateResponseBean, com.okinc.crcore.coreapi.net.responsebean.bsc.ConvertOrderDetailResponseBean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.crcore.coreapi.net.responsebean.bsc.B2CDetailExtraParamsResponseBean, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.crcore.coreapi.net.responsebean.bsc.DexOrderDetailResponseBean):void type: THIS */
    public /* synthetic */ OrderDetailResponseBean(String str, String str2, String str3, String str4, String str5, String str6, long j, boolean z, String str7, String str8, int i, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, int i2, boolean z2, int i3, String str29, boolean z3, FxRateConversionResponseBean fxRateConversionResponseBean, UnFreezeDateResponseBean unFreezeDateResponseBean, ConvertOrderDetailResponseBean convertOrderDetailResponseBean, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, B2CDetailExtraParamsResponseBean b2CDetailExtraParamsResponseBean, String str41, String str42, List list, String str43, List list2, String str44, String str45, String str46, String str47, String str48, String str49, DexOrderDetailResponseBean dexOrderDetailResponseBean, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? "" : str4, (i4 & 16) != 0 ? "" : str5, (i4 & 32) != 0 ? "" : str6, (i4 & 64) != 0 ? 0L : j, (i4 & 128) != 0 ? false : z, (i4 & 256) != 0 ? "" : str7, (i4 & 512) != 0 ? "" : str8, (i4 & 1024) != 0 ? ChannelCategoryCode.THIRD_PARTY.getCode() : i, (i4 & 2048) != 0 ? "" : str9, (i4 & 4096) != 0 ? "" : str10, (i4 & 8192) != 0 ? "" : str11, (i4 & 16384) != 0 ? "" : str12, (i4 & 32768) != 0 ? "" : str13, (i4 & 65536) != 0 ? "" : str14, (i4 & 131072) != 0 ? "" : str15, (i4 & 262144) != 0 ? "" : str16, (i4 & 524288) != 0 ? "" : str17, (i4 & 1048576) != 0 ? "" : str18, (i4 & 2097152) != 0 ? "" : str19, (i4 & 4194304) != 0 ? "" : str20, (i4 & 8388608) != 0 ? "" : str21, (i4 & 16777216) != 0 ? "" : str22, (i4 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str23, (i4 & 67108864) != 0 ? "" : str24, (i4 & 134217728) != 0 ? "" : str25, (i4 & 268435456) != 0 ? "" : str26, (i4 & 536870912) != 0 ? "" : str27, (i4 & 1073741824) != 0 ? "" : str28, (i4 & Integer.MIN_VALUE) != 0 ? -1 : i2, (i5 & 1) != 0 ? true : z2, (i5 & 2) == 0 ? i3 : 1, (i5 & 4) != 0 ? "" : str29, (i5 & 8) != 0 ? false : z3, (i5 & 16) != 0 ? null : fxRateConversionResponseBean, (i5 & 32) != 0 ? null : unFreezeDateResponseBean, (i5 & 64) != 0 ? null : convertOrderDetailResponseBean, (i5 & 128) != 0 ? "" : str30, (i5 & 256) != 0 ? "" : str31, (i5 & 512) != 0 ? "" : str32, (i5 & 1024) != 0 ? "" : str33, (i5 & 2048) != 0 ? "" : str34, (i5 & 4096) != 0 ? "" : str35, (i5 & 8192) != 0 ? "" : str36, (i5 & 16384) != 0 ? "" : str37, (i5 & 32768) != 0 ? "" : str38, (i5 & 65536) != 0 ? "" : str39, (i5 & 131072) != 0 ? "" : str40, (i5 & 262144) != 0 ? null : b2CDetailExtraParamsResponseBean, (i5 & 524288) != 0 ? "" : str41, (i5 & 1048576) != 0 ? "" : str42, (i5 & 2097152) != 0 ? yDY.AhwBna() : list, (i5 & 4194304) != 0 ? "" : str43, (i5 & 8388608) != 0 ? yDY.AhwBna() : list2, (i5 & 16777216) != 0 ? "" : str44, (i5 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str45, (i5 & 67108864) != 0 ? "" : str46, (i5 & 134217728) != 0 ? "" : str47, (i5 & 268435456) != 0 ? "" : str48, (i5 & 536870912) != 0 ? "" : str49, (i5 & 1073741824) == 0 ? dexOrderDetailResponseBean : null);
    }
}
