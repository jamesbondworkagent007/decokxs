package com.okinc.dexkline.dexlogic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.dexkline.market.data.model.CompactTagData;
import com.okinc.dexkline.market.data.model.CompactTagData$$serializer;
import com.okinc.dexkline.trade.features.home.ui.cefi.common.NeedApprove;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class DexMultiTokenInfoBean implements Parcelable {
    private String amount;
    private String amountNum;
    private double amountNumBigDecimal;
    private String availableAmountNum;
    private final String availableCurrencyAmount;
    private final String avgBuyPrice;
    private final String buyTaxes;
    private final String chainBWLogoUrl;
    private String chainId;
    private String chainLogoUrl;
    private String chainName;
    private final String change;
    private final String collectTime;
    private final String crossAbility;
    private String currencyAmount;
    private String decimals;
    private final boolean displayToken;
    private String explorerUrl;
    private String id;
    private final int isAuth;
    private String isCollectToken;
    private int isCustomToken;
    private String isDefault;
    private boolean isDeleteCustomCoin;
    private final int isHoneypot;
    private final String isLeveraged;
    private boolean isLocalCheck;
    private String isNativeToken;
    private final int isSafeMoonToken;
    private int isSubscribe;
    private Integer isSupportCrossChain;
    private final String lastTxPrice;
    private final String liquidity;
    private final String marketCap;
    private final String needApprove;
    private final String netPurchaseAmount;
    private final String price;
    private final String riskLevel;
    private final String sellTaxes;
    private String source;
    private String sourceLogo;
    private final String systemTokenType;
    private final List<CompactTagData> t;
    private final List<Integer> tokenCategories;
    private String tokenContractAddress;
    private String tokenLogoUrl;
    private String tokenName;
    private String tokenSymbol;
    private String tokenType;
    private final int topPlacement;
    private final String totalLiquidity;
    private final String turnOver24H;
    private final String tvlUsd;
    private final String unrealizedPnl;
    private final String unrealizedPnlPercent;
    private final String volume;
    private String wTokenAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DexMultiTokenInfoBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(CompactTagData$$serializer.INSTANCE), null, null, null, null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<DexMultiTokenInfoBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexMultiTokenInfoBean createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            double d = parcel.readDouble();
            boolean z = parcel.readInt() != 0;
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            int i = parcel.readInt();
            String string16 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            int i2 = parcel.readInt();
            String string19 = parcel.readString();
            int i3 = parcel.readInt();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            String string23 = parcel.readString();
            String string24 = parcel.readString();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            String string25 = parcel.readString();
            String string26 = parcel.readString();
            String string27 = parcel.readString();
            String string28 = parcel.readString();
            String string29 = parcel.readString();
            String string30 = parcel.readString();
            boolean z3 = parcel.readInt() != 0;
            String string31 = parcel.readString();
            String string32 = parcel.readString();
            String string33 = parcel.readString();
            String string34 = parcel.readString();
            String string35 = parcel.readString();
            String string36 = parcel.readString();
            String string37 = parcel.readString();
            String string38 = parcel.readString();
            int i7 = parcel.readInt();
            boolean z4 = z;
            ArrayList arrayList2 = new ArrayList(i7);
            int i8 = 0;
            while (i8 != i7) {
                arrayList2.add(CompactTagData.CREATOR.createFromParcel(parcel));
                i8++;
                i7 = i7;
            }
            String string39 = parcel.readString();
            String string40 = parcel.readString();
            String string41 = parcel.readString();
            String string42 = parcel.readString();
            String string43 = parcel.readString();
            String string44 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i9 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i9);
                int i10 = 0;
                while (i10 != i9) {
                    arrayList3.add(Integer.valueOf(parcel.readInt()));
                    i10++;
                    i9 = i9;
                }
                arrayList = arrayList3;
            }
            return new DexMultiTokenInfoBean(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, d, z4, string14, string15, z2, i, string16, numValueOf, string17, string18, i2, string19, i3, string20, string21, string22, string23, string24, i4, i5, i6, string25, string26, string27, string28, string29, string30, z3, string31, string32, string33, string34, string35, string36, string37, string38, arrayList2, string39, string40, string41, string42, string43, string44, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexMultiTokenInfoBean[] newArray(int i) {
            return new DexMultiTokenInfoBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexMultiTokenInfoBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, -1, 33554431, (DefaultConstructorMarker) null);
    }

    @SerialName("needApprove")
    public static /* synthetic */ void getNeedApprove$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void collect() {
        this.isCollectToken = "1";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.decimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.isNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component14() {
        return this.amountNumBigDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component15() {
        return this.isDeleteCustomCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.isDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.amountNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component18() {
        return this.isLocalCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component19() {
        return this.isCustomToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component21() {
        return this.isSupportCrossChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.sourceLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component24() {
        return this.isSafeMoonToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.chainBWLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component26() {
        return this.isHoneypot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.sellTaxes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.buyTaxes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.isCollectToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.tvlUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.collectTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component32() {
        return this.isSubscribe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component33() {
        return this.isAuth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component34() {
        return this.topPlacement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.change;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.availableCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.availableAmountNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component40() {
        return this.isLeveraged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component41() {
        return this.displayToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.crossAbility;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.systemTokenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.netPurchaseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component45() {
        return this.avgBuyPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component46() {
        return this.unrealizedPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component47() {
        return this.unrealizedPnlPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component48() {
        return this.lastTxPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component49() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> component50() {
        return this.t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component51() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component52() {
        return this.totalLiquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component53() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component54() {
        return this.turnOver24H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component55() {
        return this.needApprove;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component56() {
        return this.wTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component57() {
        return this.tokenCategories;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, double d, boolean z, @NotNull String str14, @NotNull String str15, boolean z2, int i, @NotNull String str16, Integer num, String str17, String str18, int i2, @NotNull String str19, int i3, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, int i4, int i5, int i6, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, boolean z3, String str31, String str32, String str33, String str34, String str35, String str36, String str37, @NotNull String str38, @NotNull List<CompactTagData> list, @NotNull String str39, String str40, String str41, String str42, @NotNull String str43, String str44, List<Integer> list2) {
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
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
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
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str43, "");
        return new DexMultiTokenInfoBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, d, z, str14, str15, z2, i, str16, num, str17, str18, i2, str19, i3, str20, str21, str22, str23, str24, i4, i5, i6, str25, str26, str27, str28, str29, str30, z3, str31, str32, str33, str34, str35, str36, str37, str38, list, str39, str40, str41, str42, str43, str44, list2);
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
        if (!(obj instanceof DexMultiTokenInfoBean)) {
            return false;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean = (DexMultiTokenInfoBean) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) dexMultiTokenInfoBean.id) && Intrinsics.EZpvd((Object) this.chainId, (Object) dexMultiTokenInfoBean.chainId) && Intrinsics.EZpvd((Object) this.chainName, (Object) dexMultiTokenInfoBean.chainName) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) dexMultiTokenInfoBean.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenName, (Object) dexMultiTokenInfoBean.tokenName) && Intrinsics.EZpvd((Object) this.tokenType, (Object) dexMultiTokenInfoBean.tokenType) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) dexMultiTokenInfoBean.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) dexMultiTokenInfoBean.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.explorerUrl, (Object) dexMultiTokenInfoBean.explorerUrl) && Intrinsics.EZpvd((Object) this.decimals, (Object) dexMultiTokenInfoBean.decimals) && Intrinsics.EZpvd((Object) this.isNativeToken, (Object) dexMultiTokenInfoBean.isNativeToken) && Intrinsics.EZpvd((Object) this.amount, (Object) dexMultiTokenInfoBean.amount) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) dexMultiTokenInfoBean.currencyAmount) && Double.compare(this.amountNumBigDecimal, dexMultiTokenInfoBean.amountNumBigDecimal) == 0 && this.isDeleteCustomCoin == dexMultiTokenInfoBean.isDeleteCustomCoin && Intrinsics.EZpvd((Object) this.isDefault, (Object) dexMultiTokenInfoBean.isDefault) && Intrinsics.EZpvd((Object) this.amountNum, (Object) dexMultiTokenInfoBean.amountNum) && this.isLocalCheck == dexMultiTokenInfoBean.isLocalCheck && this.isCustomToken == dexMultiTokenInfoBean.isCustomToken && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) dexMultiTokenInfoBean.chainLogoUrl) && Intrinsics.EZpvd(this.isSupportCrossChain, dexMultiTokenInfoBean.isSupportCrossChain) && Intrinsics.EZpvd((Object) this.sourceLogo, (Object) dexMultiTokenInfoBean.sourceLogo) && Intrinsics.EZpvd((Object) this.source, (Object) dexMultiTokenInfoBean.source) && this.isSafeMoonToken == dexMultiTokenInfoBean.isSafeMoonToken && Intrinsics.EZpvd((Object) this.chainBWLogoUrl, (Object) dexMultiTokenInfoBean.chainBWLogoUrl) && this.isHoneypot == dexMultiTokenInfoBean.isHoneypot && Intrinsics.EZpvd((Object) this.sellTaxes, (Object) dexMultiTokenInfoBean.sellTaxes) && Intrinsics.EZpvd((Object) this.buyTaxes, (Object) dexMultiTokenInfoBean.buyTaxes) && Intrinsics.EZpvd((Object) this.isCollectToken, (Object) dexMultiTokenInfoBean.isCollectToken) && Intrinsics.EZpvd((Object) this.tvlUsd, (Object) dexMultiTokenInfoBean.tvlUsd) && Intrinsics.EZpvd((Object) this.collectTime, (Object) dexMultiTokenInfoBean.collectTime) && this.isSubscribe == dexMultiTokenInfoBean.isSubscribe && this.isAuth == dexMultiTokenInfoBean.isAuth && this.topPlacement == dexMultiTokenInfoBean.topPlacement && Intrinsics.EZpvd((Object) this.price, (Object) dexMultiTokenInfoBean.price) && Intrinsics.EZpvd((Object) this.change, (Object) dexMultiTokenInfoBean.change) && Intrinsics.EZpvd((Object) this.volume, (Object) dexMultiTokenInfoBean.volume) && Intrinsics.EZpvd((Object) this.availableCurrencyAmount, (Object) dexMultiTokenInfoBean.availableCurrencyAmount) && Intrinsics.EZpvd((Object) this.availableAmountNum, (Object) dexMultiTokenInfoBean.availableAmountNum) && Intrinsics.EZpvd((Object) this.isLeveraged, (Object) dexMultiTokenInfoBean.isLeveraged) && this.displayToken == dexMultiTokenInfoBean.displayToken && Intrinsics.EZpvd((Object) this.crossAbility, (Object) dexMultiTokenInfoBean.crossAbility) && Intrinsics.EZpvd((Object) this.systemTokenType, (Object) dexMultiTokenInfoBean.systemTokenType) && Intrinsics.EZpvd((Object) this.netPurchaseAmount, (Object) dexMultiTokenInfoBean.netPurchaseAmount) && Intrinsics.EZpvd((Object) this.avgBuyPrice, (Object) dexMultiTokenInfoBean.avgBuyPrice) && Intrinsics.EZpvd((Object) this.unrealizedPnl, (Object) dexMultiTokenInfoBean.unrealizedPnl) && Intrinsics.EZpvd((Object) this.unrealizedPnlPercent, (Object) dexMultiTokenInfoBean.unrealizedPnlPercent) && Intrinsics.EZpvd((Object) this.lastTxPrice, (Object) dexMultiTokenInfoBean.lastTxPrice) && Intrinsics.EZpvd((Object) this.liquidity, (Object) dexMultiTokenInfoBean.liquidity) && Intrinsics.EZpvd(this.t, dexMultiTokenInfoBean.t) && Intrinsics.EZpvd((Object) this.riskLevel, (Object) dexMultiTokenInfoBean.riskLevel) && Intrinsics.EZpvd((Object) this.totalLiquidity, (Object) dexMultiTokenInfoBean.totalLiquidity) && Intrinsics.EZpvd((Object) this.marketCap, (Object) dexMultiTokenInfoBean.marketCap) && Intrinsics.EZpvd((Object) this.turnOver24H, (Object) dexMultiTokenInfoBean.turnOver24H) && Intrinsics.EZpvd((Object) this.needApprove, (Object) dexMultiTokenInfoBean.needApprove) && Intrinsics.EZpvd((Object) this.wTokenAddress, (Object) dexMultiTokenInfoBean.wTokenAddress) && Intrinsics.EZpvd(this.tokenCategories, dexMultiTokenInfoBean.tokenCategories);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmountNum() {
        return this.amountNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getAmountNumBigDecimal() {
        return this.amountNumBigDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailableAmountNum() {
        return this.availableAmountNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailableCurrencyAmount() {
        return this.availableCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvgBuyPrice() {
        return this.avgBuyPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyTaxes() {
        return this.buyTaxes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainBWLogoUrl() {
        return this.chainBWLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogoUrl() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChange() {
        return this.change;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCollectTime() {
        return this.collectTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCrossAbility() {
        return this.crossAbility;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyAmount() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDecimals() {
        return this.decimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDisplayToken() {
        return this.displayToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExplorerUrl() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastTxPrice() {
        return this.lastTxPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiquidity() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketCap() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNeedApprove() {
        return this.needApprove;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetPurchaseAmount() {
        return this.netPurchaseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskLevel() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellTaxes() {
        return this.sellTaxes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceLogo() {
        return this.sourceLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSystemTokenType() {
        return this.systemTokenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> getT() {
        return this.t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getTokenCategories() {
        return this.tokenCategories;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogoUrl() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenName() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenType() {
        return this.tokenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTopPlacement() {
        return this.topPlacement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalLiquidity() {
        return this.totalLiquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTurnOver24H() {
        return this.turnOver24H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTvlUsd() {
        return this.tvlUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnrealizedPnl() {
        return this.unrealizedPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnrealizedPnlPercent() {
        return this.unrealizedPnlPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolume() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWTokenAddress() {
        return this.wTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.chainId.hashCode();
        int iHashCode3 = this.chainName.hashCode();
        int iHashCode4 = this.tokenSymbol.hashCode();
        int iHashCode5 = this.tokenName.hashCode();
        int iHashCode6 = this.tokenType.hashCode();
        int iHashCode7 = this.tokenContractAddress.hashCode();
        int iHashCode8 = this.tokenLogoUrl.hashCode();
        int iHashCode9 = this.explorerUrl.hashCode();
        int iHashCode10 = this.decimals.hashCode();
        int iHashCode11 = this.isNativeToken.hashCode();
        int iHashCode12 = this.amount.hashCode();
        int iHashCode13 = this.currencyAmount.hashCode();
        int iHashCode14 = Double.hashCode(this.amountNumBigDecimal);
        int iHashCode15 = Boolean.hashCode(this.isDeleteCustomCoin);
        int iHashCode16 = this.isDefault.hashCode();
        int iHashCode17 = this.amountNum.hashCode();
        int iHashCode18 = Boolean.hashCode(this.isLocalCheck);
        int iHashCode19 = Integer.hashCode(this.isCustomToken);
        int iHashCode20 = this.chainLogoUrl.hashCode();
        Integer num = this.isSupportCrossChain;
        int iHashCode21 = num == null ? 0 : num.hashCode();
        String str = this.sourceLogo;
        int iHashCode22 = str == null ? 0 : str.hashCode();
        String str2 = this.source;
        int iHashCode23 = str2 == null ? 0 : str2.hashCode();
        int iHashCode24 = Integer.hashCode(this.isSafeMoonToken);
        int iHashCode25 = this.chainBWLogoUrl.hashCode();
        int iHashCode26 = Integer.hashCode(this.isHoneypot);
        int iHashCode27 = this.sellTaxes.hashCode();
        int iHashCode28 = this.buyTaxes.hashCode();
        int iHashCode29 = this.isCollectToken.hashCode();
        int iHashCode30 = this.tvlUsd.hashCode();
        int iHashCode31 = this.collectTime.hashCode();
        int iHashCode32 = Integer.hashCode(this.isSubscribe);
        int iHashCode33 = Integer.hashCode(this.isAuth);
        int iHashCode34 = Integer.hashCode(this.topPlacement);
        int iHashCode35 = this.price.hashCode();
        int iHashCode36 = this.change.hashCode();
        int iHashCode37 = this.volume.hashCode();
        int iHashCode38 = this.availableCurrencyAmount.hashCode();
        int iHashCode39 = this.availableAmountNum.hashCode();
        int iHashCode40 = this.isLeveraged.hashCode();
        int iHashCode41 = Boolean.hashCode(this.displayToken);
        String str3 = this.crossAbility;
        int iHashCode42 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.systemTokenType;
        int iHashCode43 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.netPurchaseAmount;
        int iHashCode44 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.avgBuyPrice;
        int iHashCode45 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.unrealizedPnl;
        int iHashCode46 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.unrealizedPnlPercent;
        int iHashCode47 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.lastTxPrice;
        int iHashCode48 = str9 == null ? 0 : str9.hashCode();
        int iHashCode49 = this.liquidity.hashCode();
        int iHashCode50 = this.t.hashCode();
        int iHashCode51 = this.riskLevel.hashCode();
        String str10 = this.totalLiquidity;
        int iHashCode52 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.marketCap;
        int iHashCode53 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.turnOver24H;
        int iHashCode54 = str12 == null ? 0 : str12.hashCode();
        int iHashCode55 = this.needApprove.hashCode();
        String str13 = this.wTokenAddress;
        int iHashCode56 = str13 == null ? 0 : str13.hashCode();
        List<Integer> list = this.tokenCategories;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isAuth() {
        return this.isAuth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isCollectToken() {
        return this.isCollectToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCustomCoin() {
        return this.isCustomToken == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isCustomToken() {
        return this.isCustomToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isDefault() {
        return this.isDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isDeleteCustomCoin() {
        return this.isDeleteCustomCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isHoneypot() {
        return this.isHoneypot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isLeveraged() {
        return this.isLeveraged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isLocalCheck() {
        return this.isLocalCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isNativeToken() {
        return this.isNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isSafeMoonToken() {
        return this.isSafeMoonToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isSubscribe() {
        return this.isSubscribe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer isSupportCrossChain() {
        return this.isSupportCrossChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmountNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amountNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmountNumBigDecimal(double d) {
        this.amountNumBigDecimal = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvailableAmountNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.availableAmountNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainLogoUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainLogoUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCollectToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isCollectToken = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currencyAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCustomToken(int i) {
        this.isCustomToken = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDecimals(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.decimals = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isDefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeleteCustomCoin(boolean z) {
        this.isDeleteCustomCoin = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExplorerUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.explorerUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocalCheck(boolean z) {
        this.isLocalCheck = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNativeToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isNativeToken = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSource(String str) {
        this.source = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSourceLogo(String str) {
        this.sourceLogo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubscribe(int i) {
        this.isSubscribe = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportCrossChain(Integer num) {
        this.isSupportCrossChain = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenContractAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenContractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenLogoUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenLogoUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWTokenAddress(String str) {
        this.wTokenAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexMultiTokenInfoBean(id=" + this.id + ", chainId=" + this.chainId + ", chainName=" + this.chainName + ", tokenSymbol=" + this.tokenSymbol + ", tokenName=" + this.tokenName + ", tokenType=" + this.tokenType + ", tokenContractAddress=" + this.tokenContractAddress + ", tokenLogoUrl=" + this.tokenLogoUrl + ", explorerUrl=" + this.explorerUrl + ", decimals=" + this.decimals + ", isNativeToken=" + this.isNativeToken + ", amount=" + this.amount + ", currencyAmount=" + this.currencyAmount + ", amountNumBigDecimal=" + this.amountNumBigDecimal + ", isDeleteCustomCoin=" + this.isDeleteCustomCoin + ", isDefault=" + this.isDefault + ", amountNum=" + this.amountNum + ", isLocalCheck=" + this.isLocalCheck + ", isCustomToken=" + this.isCustomToken + ", chainLogoUrl=" + this.chainLogoUrl + ", isSupportCrossChain=" + this.isSupportCrossChain + ", sourceLogo=" + this.sourceLogo + ", source=" + this.source + ", isSafeMoonToken=" + this.isSafeMoonToken + ", chainBWLogoUrl=" + this.chainBWLogoUrl + ", isHoneypot=" + this.isHoneypot + ", sellTaxes=" + this.sellTaxes + ", buyTaxes=" + this.buyTaxes + ", isCollectToken=" + this.isCollectToken + ", tvlUsd=" + this.tvlUsd + ", collectTime=" + this.collectTime + ", isSubscribe=" + this.isSubscribe + ", isAuth=" + this.isAuth + ", topPlacement=" + this.topPlacement + ", price=" + this.price + ", change=" + this.change + ", volume=" + this.volume + ", availableCurrencyAmount=" + this.availableCurrencyAmount + ", availableAmountNum=" + this.availableAmountNum + ", isLeveraged=" + this.isLeveraged + ", displayToken=" + this.displayToken + ", crossAbility=" + this.crossAbility + ", systemTokenType=" + this.systemTokenType + ", netPurchaseAmount=" + this.netPurchaseAmount + ", avgBuyPrice=" + this.avgBuyPrice + ", unrealizedPnl=" + this.unrealizedPnl + ", unrealizedPnlPercent=" + this.unrealizedPnlPercent + ", lastTxPrice=" + this.lastTxPrice + ", liquidity=" + this.liquidity + ", t=" + this.t + ", riskLevel=" + this.riskLevel + ", totalLiquidity=" + this.totalLiquidity + ", marketCap=" + this.marketCap + ", turnOver24H=" + this.turnOver24H + ", needApprove=" + this.needApprove + ", wTokenAddress=" + this.wTokenAddress + ", tokenCategories=" + this.tokenCategories + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.chainId);
        parcel.writeString(this.chainName);
        parcel.writeString(this.tokenSymbol);
        parcel.writeString(this.tokenName);
        parcel.writeString(this.tokenType);
        parcel.writeString(this.tokenContractAddress);
        parcel.writeString(this.tokenLogoUrl);
        parcel.writeString(this.explorerUrl);
        parcel.writeString(this.decimals);
        parcel.writeString(this.isNativeToken);
        parcel.writeString(this.amount);
        parcel.writeString(this.currencyAmount);
        parcel.writeDouble(this.amountNumBigDecimal);
        parcel.writeInt(this.isDeleteCustomCoin ? 1 : 0);
        parcel.writeString(this.isDefault);
        parcel.writeString(this.amountNum);
        parcel.writeInt(this.isLocalCheck ? 1 : 0);
        parcel.writeInt(this.isCustomToken);
        parcel.writeString(this.chainLogoUrl);
        Integer num = this.isSupportCrossChain;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.sourceLogo);
        parcel.writeString(this.source);
        parcel.writeInt(this.isSafeMoonToken);
        parcel.writeString(this.chainBWLogoUrl);
        parcel.writeInt(this.isHoneypot);
        parcel.writeString(this.sellTaxes);
        parcel.writeString(this.buyTaxes);
        parcel.writeString(this.isCollectToken);
        parcel.writeString(this.tvlUsd);
        parcel.writeString(this.collectTime);
        parcel.writeInt(this.isSubscribe);
        parcel.writeInt(this.isAuth);
        parcel.writeInt(this.topPlacement);
        parcel.writeString(this.price);
        parcel.writeString(this.change);
        parcel.writeString(this.volume);
        parcel.writeString(this.availableCurrencyAmount);
        parcel.writeString(this.availableAmountNum);
        parcel.writeString(this.isLeveraged);
        parcel.writeInt(this.displayToken ? 1 : 0);
        parcel.writeString(this.crossAbility);
        parcel.writeString(this.systemTokenType);
        parcel.writeString(this.netPurchaseAmount);
        parcel.writeString(this.avgBuyPrice);
        parcel.writeString(this.unrealizedPnl);
        parcel.writeString(this.unrealizedPnlPercent);
        parcel.writeString(this.lastTxPrice);
        parcel.writeString(this.liquidity);
        List<CompactTagData> list = this.t;
        parcel.writeInt(list.size());
        Iterator<CompactTagData> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.riskLevel);
        parcel.writeString(this.totalLiquidity);
        parcel.writeString(this.marketCap);
        parcel.writeString(this.turnOver24H);
        parcel.writeString(this.needApprove);
        parcel.writeString(this.wTokenAddress);
        List<Integer> list2 = this.tokenCategories;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<Integer> it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeInt(it2.next().intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.dexlogic.bean.DexMultiTokenInfoBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexMultiTokenInfoBean> serializer() {
            return DexMultiTokenInfoBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexMultiTokenInfoBean(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, double d, boolean z, String str14, String str15, boolean z2, int i3, String str16, Integer num, String str17, String str18, int i4, String str19, int i5, String str20, String str21, String str22, String str23, String str24, int i6, int i7, int i8, String str25, String str26, String str27, String str28, String str29, String str30, boolean z3, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, List list, String str39, String str40, String str41, String str42, String str43, String str44, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str2;
        }
        if ((i & 4) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str3;
        }
        if ((i & 8) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str4;
        }
        if ((i & 16) == 0) {
            this.tokenName = "";
        } else {
            this.tokenName = str5;
        }
        if ((i & 32) == 0) {
            this.tokenType = "";
        } else {
            this.tokenType = str6;
        }
        if ((i & 64) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str7;
        }
        if ((i & 128) == 0) {
            this.tokenLogoUrl = "";
        } else {
            this.tokenLogoUrl = str8;
        }
        if ((i & 256) == 0) {
            this.explorerUrl = "";
        } else {
            this.explorerUrl = str9;
        }
        if ((i & 512) == 0) {
            this.decimals = "";
        } else {
            this.decimals = str10;
        }
        if ((i & 1024) == 0) {
            this.isNativeToken = "";
        } else {
            this.isNativeToken = str11;
        }
        if ((i & 2048) == 0) {
            this.amount = "0.00";
        } else {
            this.amount = str12;
        }
        if ((i & 4096) == 0) {
            this.currencyAmount = "0.00";
        } else {
            this.currencyAmount = str13;
        }
        this.amountNumBigDecimal = (i & 8192) == 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d;
        if ((i & 16384) == 0) {
            this.isDeleteCustomCoin = false;
        } else {
            this.isDeleteCustomCoin = z;
        }
        if ((i & 32768) == 0) {
            this.isDefault = "0";
        } else {
            this.isDefault = str14;
        }
        this.amountNum = (i & 65536) != 0 ? str15 : "0.00";
        if ((131072 & i) == 0) {
            this.isLocalCheck = false;
        } else {
            this.isLocalCheck = z2;
        }
        if ((262144 & i) == 0) {
            this.isCustomToken = 0;
        } else {
            this.isCustomToken = i3;
        }
        if ((524288 & i) == 0) {
            this.chainLogoUrl = "";
        } else {
            this.chainLogoUrl = str16;
        }
        this.isSupportCrossChain = (1048576 & i) == 0 ? 1 : num;
        if ((2097152 & i) == 0) {
            this.sourceLogo = null;
        } else {
            this.sourceLogo = str17;
        }
        if ((4194304 & i) == 0) {
            this.source = null;
        } else {
            this.source = str18;
        }
        if ((8388608 & i) == 0) {
            this.isSafeMoonToken = 0;
        } else {
            this.isSafeMoonToken = i4;
        }
        if ((16777216 & i) == 0) {
            this.chainBWLogoUrl = "";
        } else {
            this.chainBWLogoUrl = str19;
        }
        if ((33554432 & i) == 0) {
            this.isHoneypot = 0;
        } else {
            this.isHoneypot = i5;
        }
        if ((67108864 & i) == 0) {
            this.sellTaxes = "";
        } else {
            this.sellTaxes = str20;
        }
        if ((134217728 & i) == 0) {
            this.buyTaxes = "";
        } else {
            this.buyTaxes = str21;
        }
        if ((268435456 & i) == 0) {
            this.isCollectToken = "";
        } else {
            this.isCollectToken = str22;
        }
        if ((536870912 & i) == 0) {
            this.tvlUsd = "";
        } else {
            this.tvlUsd = str23;
        }
        if ((1073741824 & i) == 0) {
            this.collectTime = "0";
        } else {
            this.collectTime = str24;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.isSubscribe = 0;
        } else {
            this.isSubscribe = i6;
        }
        if ((i2 & 1) == 0) {
            this.isAuth = 1;
        } else {
            this.isAuth = i7;
        }
        if ((i2 & 2) == 0) {
            this.topPlacement = 0;
        } else {
            this.topPlacement = i8;
        }
        if ((i2 & 4) == 0) {
            this.price = "";
        } else {
            this.price = str25;
        }
        if ((i2 & 8) == 0) {
            this.change = "";
        } else {
            this.change = str26;
        }
        if ((i2 & 16) == 0) {
            this.volume = "";
        } else {
            this.volume = str27;
        }
        if ((i2 & 32) == 0) {
            this.availableCurrencyAmount = "";
        } else {
            this.availableCurrencyAmount = str28;
        }
        if ((i2 & 64) == 0) {
            this.availableAmountNum = "";
        } else {
            this.availableAmountNum = str29;
        }
        if ((i2 & 128) == 0) {
            this.isLeveraged = "";
        } else {
            this.isLeveraged = str30;
        }
        if ((i2 & 256) == 0) {
            this.displayToken = false;
        } else {
            this.displayToken = z3;
        }
        if ((i2 & 512) == 0) {
            this.crossAbility = null;
        } else {
            this.crossAbility = str31;
        }
        if ((i2 & 1024) == 0) {
            this.systemTokenType = null;
        } else {
            this.systemTokenType = str32;
        }
        if ((i2 & 2048) == 0) {
            this.netPurchaseAmount = null;
        } else {
            this.netPurchaseAmount = str33;
        }
        if ((i2 & 4096) == 0) {
            this.avgBuyPrice = null;
        } else {
            this.avgBuyPrice = str34;
        }
        if ((i2 & 8192) == 0) {
            this.unrealizedPnl = null;
        } else {
            this.unrealizedPnl = str35;
        }
        if ((i2 & 16384) == 0) {
            this.unrealizedPnlPercent = null;
        } else {
            this.unrealizedPnlPercent = str36;
        }
        if ((i2 & 32768) == 0) {
            this.lastTxPrice = null;
        } else {
            this.lastTxPrice = str37;
        }
        if ((i2 & 65536) == 0) {
            this.liquidity = "";
        } else {
            this.liquidity = str38;
        }
        this.t = (131072 & i2) == 0 ? yDY.AhwBna() : list;
        if ((262144 & i2) == 0) {
            this.riskLevel = "0";
        } else {
            this.riskLevel = str39;
        }
        if ((524288 & i2) == 0) {
            this.totalLiquidity = null;
        } else {
            this.totalLiquidity = str40;
        }
        if ((1048576 & i2) == 0) {
            this.marketCap = null;
        } else {
            this.marketCap = str41;
        }
        if ((2097152 & i2) == 0) {
            this.turnOver24H = null;
        } else {
            this.turnOver24H = str42;
        }
        this.needApprove = (4194304 & i2) == 0 ? NeedApprove.NO.getValue() : str43;
        if ((8388608 & i2) == 0) {
            this.wTokenAddress = null;
        } else {
            this.wTokenAddress = str44;
        }
        this.tokenCategories = (16777216 & i2) == 0 ? yDY.AhwBna() : list2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [17=4] */
    public static final /* synthetic */ void write$Self$OKKLine_kline_impl(DexMultiTokenInfoBean dexMultiTokenInfoBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.id, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dexMultiTokenInfoBean.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dexMultiTokenInfoBean.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dexMultiTokenInfoBean.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, dexMultiTokenInfoBean.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.tokenName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, dexMultiTokenInfoBean.tokenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.tokenType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, dexMultiTokenInfoBean.tokenType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, dexMultiTokenInfoBean.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.tokenLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, dexMultiTokenInfoBean.tokenLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.explorerUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, dexMultiTokenInfoBean.explorerUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.decimals, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, dexMultiTokenInfoBean.decimals);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.isNativeToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, dexMultiTokenInfoBean.isNativeToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.amount, (Object) "0.00")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, dexMultiTokenInfoBean.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.currencyAmount, (Object) "0.00")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, dexMultiTokenInfoBean.currencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || Double.compare(dexMultiTokenInfoBean.amountNumBigDecimal, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 13, dexMultiTokenInfoBean.amountNumBigDecimal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || dexMultiTokenInfoBean.isDeleteCustomCoin) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 14, dexMultiTokenInfoBean.isDeleteCustomCoin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.isDefault, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, dexMultiTokenInfoBean.isDefault);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.amountNum, (Object) "0.00")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, dexMultiTokenInfoBean.amountNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || dexMultiTokenInfoBean.isLocalCheck) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 17, dexMultiTokenInfoBean.isLocalCheck);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || dexMultiTokenInfoBean.isCustomToken != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 18, dexMultiTokenInfoBean.isCustomToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.chainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, dexMultiTokenInfoBean.chainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || (num = dexMultiTokenInfoBean.isSupportCrossChain) == null || num.intValue() != 1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, IntSerializer.INSTANCE, dexMultiTokenInfoBean.isSupportCrossChain);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || dexMultiTokenInfoBean.sourceLogo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, dexMultiTokenInfoBean.sourceLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || dexMultiTokenInfoBean.source != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, dexMultiTokenInfoBean.source);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || dexMultiTokenInfoBean.isSafeMoonToken != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 23, dexMultiTokenInfoBean.isSafeMoonToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.chainBWLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, dexMultiTokenInfoBean.chainBWLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || dexMultiTokenInfoBean.isHoneypot != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 25, dexMultiTokenInfoBean.isHoneypot);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.sellTaxes, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, dexMultiTokenInfoBean.sellTaxes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.buyTaxes, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, dexMultiTokenInfoBean.buyTaxes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.isCollectToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, dexMultiTokenInfoBean.isCollectToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.tvlUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, dexMultiTokenInfoBean.tvlUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.collectTime, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, dexMultiTokenInfoBean.collectTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || dexMultiTokenInfoBean.isSubscribe != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 31, dexMultiTokenInfoBean.isSubscribe);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || dexMultiTokenInfoBean.isAuth != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 32, dexMultiTokenInfoBean.isAuth);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || dexMultiTokenInfoBean.topPlacement != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 33, dexMultiTokenInfoBean.topPlacement);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, dexMultiTokenInfoBean.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.change, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 35, dexMultiTokenInfoBean.change);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.volume, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 36, dexMultiTokenInfoBean.volume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.availableCurrencyAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 37, dexMultiTokenInfoBean.availableCurrencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.availableAmountNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, dexMultiTokenInfoBean.availableAmountNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.isLeveraged, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 39, dexMultiTokenInfoBean.isLeveraged);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || dexMultiTokenInfoBean.displayToken) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 40, dexMultiTokenInfoBean.displayToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || dexMultiTokenInfoBean.crossAbility != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 41, StringSerializer.INSTANCE, dexMultiTokenInfoBean.crossAbility);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || dexMultiTokenInfoBean.systemTokenType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 42, StringSerializer.INSTANCE, dexMultiTokenInfoBean.systemTokenType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || dexMultiTokenInfoBean.netPurchaseAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 43, StringSerializer.INSTANCE, dexMultiTokenInfoBean.netPurchaseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || dexMultiTokenInfoBean.avgBuyPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 44, StringSerializer.INSTANCE, dexMultiTokenInfoBean.avgBuyPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || dexMultiTokenInfoBean.unrealizedPnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 45, StringSerializer.INSTANCE, dexMultiTokenInfoBean.unrealizedPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || dexMultiTokenInfoBean.unrealizedPnlPercent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 46, StringSerializer.INSTANCE, dexMultiTokenInfoBean.unrealizedPnlPercent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || dexMultiTokenInfoBean.lastTxPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 47, StringSerializer.INSTANCE, dexMultiTokenInfoBean.lastTxPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.liquidity, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 48, dexMultiTokenInfoBean.liquidity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || !Intrinsics.EZpvd(dexMultiTokenInfoBean.t, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 49, kSerializerArr[49], dexMultiTokenInfoBean.t);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.riskLevel, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 50, dexMultiTokenInfoBean.riskLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || dexMultiTokenInfoBean.totalLiquidity != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 51, StringSerializer.INSTANCE, dexMultiTokenInfoBean.totalLiquidity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || dexMultiTokenInfoBean.marketCap != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 52, StringSerializer.INSTANCE, dexMultiTokenInfoBean.marketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || dexMultiTokenInfoBean.turnOver24H != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 53, StringSerializer.INSTANCE, dexMultiTokenInfoBean.turnOver24H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || !Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.needApprove, (Object) NeedApprove.NO.getValue())) {
            compositeEncoder.encodeStringElement(serialDescriptor, 54, dexMultiTokenInfoBean.needApprove);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || dexMultiTokenInfoBean.wTokenAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 55, StringSerializer.INSTANCE, dexMultiTokenInfoBean.wTokenAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) && Intrinsics.EZpvd(dexMultiTokenInfoBean.tokenCategories, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 56, kSerializerArr[56], dexMultiTokenInfoBean.tokenCategories);
    }

    public DexMultiTokenInfoBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, double d, boolean z, @NotNull String str14, @NotNull String str15, boolean z2, int i, @NotNull String str16, Integer num, String str17, String str18, int i2, @NotNull String str19, int i3, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, int i4, int i5, int i6, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, boolean z3, String str31, String str32, String str33, String str34, String str35, String str36, String str37, @NotNull String str38, @NotNull List<CompactTagData> list, @NotNull String str39, String str40, String str41, String str42, @NotNull String str43, String str44, List<Integer> list2) {
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
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
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
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str43, "");
        this.id = str;
        this.chainId = str2;
        this.chainName = str3;
        this.tokenSymbol = str4;
        this.tokenName = str5;
        this.tokenType = str6;
        this.tokenContractAddress = str7;
        this.tokenLogoUrl = str8;
        this.explorerUrl = str9;
        this.decimals = str10;
        this.isNativeToken = str11;
        this.amount = str12;
        this.currencyAmount = str13;
        this.amountNumBigDecimal = d;
        this.isDeleteCustomCoin = z;
        this.isDefault = str14;
        this.amountNum = str15;
        this.isLocalCheck = z2;
        this.isCustomToken = i;
        this.chainLogoUrl = str16;
        this.isSupportCrossChain = num;
        this.sourceLogo = str17;
        this.source = str18;
        this.isSafeMoonToken = i2;
        this.chainBWLogoUrl = str19;
        this.isHoneypot = i3;
        this.sellTaxes = str20;
        this.buyTaxes = str21;
        this.isCollectToken = str22;
        this.tvlUsd = str23;
        this.collectTime = str24;
        this.isSubscribe = i4;
        this.isAuth = i5;
        this.topPlacement = i6;
        this.price = str25;
        this.change = str26;
        this.volume = str27;
        this.availableCurrencyAmount = str28;
        this.availableAmountNum = str29;
        this.isLeveraged = str30;
        this.displayToken = z3;
        this.crossAbility = str31;
        this.systemTokenType = str32;
        this.netPurchaseAmount = str33;
        this.avgBuyPrice = str34;
        this.unrealizedPnl = str35;
        this.unrealizedPnlPercent = str36;
        this.lastTxPrice = str37;
        this.liquidity = str38;
        this.t = list;
        this.riskLevel = str39;
        this.totalLiquidity = str40;
        this.marketCap = str41;
        this.turnOver24H = str42;
        this.needApprove = str43;
        this.wTokenAddress = str44;
        this.tokenCategories = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x02c1: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0004: ARITH (r117v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r117v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r117v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r117v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r117v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r117v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r117v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r117v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r117v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r117v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r117v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r117v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("0.00") : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r117v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("0.00") : (r71v0 java.lang.String))
  (wrap:double:0x007d: TERNARY null = ((wrap:int:0x0074: ARITH (r117v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0078: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) : (r72v0 double))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x007f: ARITH (r117v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? false : (r74v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r117v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("0") : (r75v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009a: ARITH (r117v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("0.00") : (r76v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00a5: ARITH (r117v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? false : (r77v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00b0: ARITH (r117v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r78v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bb: ARITH (r117v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r79v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00c6: ARITH (r117v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r80v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d5: ARITH (r117v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r81v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e2: ARITH (r117v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r82v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00ed: ARITH (r117v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r83v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f8: ARITH (r117v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r84v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0103: ARITH (r117v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (0 int) : (r85v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010e: ARITH (r117v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r86v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0119: ARITH (r117v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r87v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0124: ARITH (r117v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r88v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012f: ARITH (r117v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r89v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x013a: ARITH (r117v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("0") : (r90v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0145: ARITH (r117v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (0 int) : (r91v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x014e: ARITH (r118v0 int) & (1 int) A[WRAPPED]) == (0 int)) ? (r92v0 int) : (1 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0155: ARITH (r118v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r93v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x015e: ARITH (r118v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r94v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0167: ARITH (r118v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r95v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0170: ARITH (r118v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r96v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0179: ARITH (r118v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r97v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0182: ARITH (r118v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r98v0 java.lang.String))
  (wrap:java.lang.String:0x0196: TERNARY null = ((wrap:int:0x018d: ARITH (r118v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r99v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0198: ARITH (r118v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r100v0 boolean) : false)
  (wrap:java.lang.String:0x01a8: TERNARY null = ((wrap:int:0x019f: ARITH (r118v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r101v0 java.lang.String))
  (wrap:java.lang.String:0x01b3: TERNARY null = ((wrap:int:0x01aa: ARITH (r118v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r102v0 java.lang.String))
  (wrap:java.lang.String:0x01be: TERNARY null = ((wrap:int:0x01b5: ARITH (r118v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r103v0 java.lang.String))
  (wrap:java.lang.String:0x01c9: TERNARY null = ((wrap:int:0x01c0: ARITH (r118v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r104v0 java.lang.String))
  (wrap:java.lang.String:0x01d4: TERNARY null = ((wrap:int:0x01cb: ARITH (r118v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r105v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01d6: ARITH (r118v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r106v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01df: ARITH (r118v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r107v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01e8: ARITH (r118v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r108v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x01f3: ARITH (r118v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x01f7: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:70)) : (r109v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0200: ARITH (r118v0 int) & (262144 int) A[WRAPPED]) == (0 int)) ? (r110v0 java.lang.String) : ("0"))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0209: ARITH (r118v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r111v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0214: ARITH (r118v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r112v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x021f: ARITH (r118v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r113v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x022a: ARITH (r118v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0230: INVOKE 
  (wrap:com.okinc.dexkline.trade.features.home.ui.cefi.common.NeedApprove:0x022e: SGET  A[WRAPPED] (LINE:76) com.okinc.dexkline.trade.features.home.ui.cefi.common.NeedApprove.NO com.okinc.dexkline.trade.features.home.ui.cefi.common.NeedApprove)
 VIRTUAL call: com.okinc.dexkline.trade.features.home.ui.cefi.common.NeedApprove.getValue():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:76)) : (r114v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0239: ARITH (r118v0 int) & (8388608 int) A[WRAPPED]) == (0 int)) ? (r115v0 java.lang.String) : (null java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0242: ARITH (r118v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0246: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:78)) : (r116v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, boolean, java.lang.String, java.lang.String, boolean, int, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.dexkline.market.data.model.CompactTagData>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.Integer>):void (m)] (LINE:20) call: com.okinc.dexkline.dexlogic.bean.DexMultiTokenInfoBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, boolean, java.lang.String, java.lang.String, boolean, int, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ DexMultiTokenInfoBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, double d, boolean z, String str14, String str15, boolean z2, int i, String str16, Integer num, String str17, String str18, int i2, String str19, int i3, String str20, String str21, String str22, String str23, String str24, int i4, int i5, int i6, String str25, String str26, String str27, String str28, String str29, String str30, boolean z3, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, List list, String str39, String str40, String str41, String str42, String str43, String str44, List list2, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? "" : str3, (i7 & 8) != 0 ? "" : str4, (i7 & 16) != 0 ? "" : str5, (i7 & 32) != 0 ? "" : str6, (i7 & 64) != 0 ? "" : str7, (i7 & 128) != 0 ? "" : str8, (i7 & 256) != 0 ? "" : str9, (i7 & 512) != 0 ? "" : str10, (i7 & 1024) != 0 ? "" : str11, (i7 & 2048) != 0 ? "0.00" : str12, (i7 & 4096) != 0 ? "0.00" : str13, (i7 & 8192) != 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d, (i7 & 16384) != 0 ? false : z, (i7 & 32768) != 0 ? "0" : str14, (i7 & 65536) != 0 ? "0.00" : str15, (i7 & 131072) != 0 ? false : z2, (i7 & 262144) != 0 ? 0 : i, (i7 & 524288) != 0 ? "" : str16, (i7 & 1048576) != 0 ? 1 : num, (i7 & 2097152) != 0 ? null : str17, (i7 & 4194304) != 0 ? null : str18, (i7 & 8388608) != 0 ? 0 : i2, (i7 & 16777216) != 0 ? "" : str19, (i7 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? 0 : i3, (i7 & 67108864) != 0 ? "" : str20, (i7 & 134217728) != 0 ? "" : str21, (i7 & 268435456) != 0 ? "" : str22, (i7 & 536870912) != 0 ? "" : str23, (i7 & 1073741824) != 0 ? "0" : str24, (i7 & Integer.MIN_VALUE) != 0 ? 0 : i4, (i8 & 1) == 0 ? i5 : 1, (i8 & 2) != 0 ? 0 : i6, (i8 & 4) != 0 ? "" : str25, (i8 & 8) != 0 ? "" : str26, (i8 & 16) != 0 ? "" : str27, (i8 & 32) != 0 ? "" : str28, (i8 & 64) != 0 ? "" : str29, (i8 & 128) != 0 ? "" : str30, (i8 & 256) == 0 ? z3 : false, (i8 & 512) != 0 ? null : str31, (i8 & 1024) != 0 ? null : str32, (i8 & 2048) != 0 ? null : str33, (i8 & 4096) != 0 ? null : str34, (i8 & 8192) != 0 ? null : str35, (i8 & 16384) != 0 ? null : str36, (i8 & 32768) != 0 ? null : str37, (i8 & 65536) != 0 ? "" : str38, (i8 & 131072) != 0 ? yDY.AhwBna() : list, (i8 & 262144) == 0 ? str39 : "0", (i8 & 524288) != 0 ? null : str40, (i8 & 1048576) != 0 ? null : str41, (i8 & 2097152) != 0 ? null : str42, (i8 & 4194304) != 0 ? NeedApprove.NO.getValue() : str43, (i8 & 8388608) == 0 ? str44 : null, (i8 & 16777216) != 0 ? yDY.AhwBna() : list2);
    }

    public final boolean isMainChainCoin() {
        return Intrinsics.EZpvd((Object) this.isNativeToken, (Object) "1");
    }

    public final void subscribe() {
        if (isCustomCoin()) {
            return;
        }
        this.isSubscribe = 1;
    }
}
