package com.okinc.unify_trade.biz.subscribe;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.unify_trade.biz.AssetsRubikIncome;
import com.okinc.unify_trade.biz.AssetsRubikIncome$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import o.C54589xNz;
import o.InterfaceC54581xNr;
import o.xOW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class AccountDetailData implements Parcelable {
    public static final String AUTO_CONVERSION_LEVEL_1 = "1";
    public static final String AUTO_CONVERSION_LEVEL_2 = "2";
    public static final String AUTO_CONVERSION_LEVEL_3 = "3";
    public static final String AUTO_CONVERSION_LEVEL_4 = "4";
    public static final String AUTO_CONVERSION_LEVEL_5 = "5";
    private String accAvgPx;
    private AssetsRubikIncome assetsRubikIncome;
    private boolean autoEarnEnabled;
    private String autoLendAmt;
    private String autoLendApr;
    private String autoLendMtAmt;
    private String autoLendStatus;
    private String autoStakingStatus;
    private String availBal;
    private String availEq;
    private String borrowFroz;
    private String cashBal;
    private String ccy;
    private String coinBorrowFrozenMargin;
    private String coinFullName;
    private String coinLeverage;
    private String coinRealBorrowAmt;
    private String coinUsdPrice;
    private String colBorrAutoConversion;
    private String colRes;
    private String crossLiab;
    private String disEq;
    private String eq;
    private String eqUsd;
    private String fixedBal;
    private String freeInterest;
    private String frozenBal;
    private String frpType;
    private String hourRates;
    private String interest;
    private String isoEq;
    private String isoLiab;
    private String isoUpl;
    private String leverageBorrowLimit;
    private String liab;
    private String liabConversionHistory;
    private String masterAccountLimit;
    private String maxLoan;
    private String mgnRatio;
    private String notionalLever;
    private String openAvgPx;
    private String ordFrozen;
    private String rateType;
    private String rewardBal;
    private String smtSyncEq;
    private String spotBal;
    private String spotCopyTradingEq;
    private String spotInUseAmt;
    private String spotIsoBal;
    private String spotUpl;
    private String spotUplRatio;
    private String stakeDistribFreq;
    private String stakingApr;
    private String stgyEq;
    private boolean supportAutoEarn;
    private boolean supportAutoLend;
    private Boolean supportAutoStaking;
    private String totalPnl;
    private String totalPnlRatio;
    private String twap;
    private String uTime;
    private String upl;
    private String yearRates;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AccountDetailData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AccountDetailData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountDetailData createFromParcel(Parcel parcel) {
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
            Boolean boolValueOf = null;
            AssetsRubikIncome assetsRubikIncomeCreateFromParcel = parcel.readInt() == 0 ? null : AssetsRubikIncome.CREATOR.createFromParcel(parcel);
            String string24 = parcel.readString();
            String string25 = parcel.readString();
            String string26 = parcel.readString();
            String string27 = parcel.readString();
            String string28 = parcel.readString();
            String string29 = parcel.readString();
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
            String string41 = parcel.readString();
            String string42 = parcel.readString();
            String string43 = parcel.readString();
            String string44 = parcel.readString();
            String string45 = parcel.readString();
            String string46 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            String string47 = parcel.readString();
            String string48 = parcel.readString();
            String string49 = parcel.readString();
            String string50 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AccountDetailData(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, assetsRubikIncomeCreateFromParcel, string24, string25, string26, string27, string28, string29, string30, string31, string32, string33, string34, string35, string36, string37, string38, string39, string40, string41, string42, string43, string44, string45, string46, z, z2, z3, string47, string48, string49, string50, boolValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountDetailData[] newArray(int i) {
            return new AccountDetailData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AccountDetailData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (AssetsRubikIncome) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, false, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, Integer.MAX_VALUE, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.interest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.crossLiab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.isoLiab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.twap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.frpType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.notionalLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.cashBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.disEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.ordFrozen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.eq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.maxLoan;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.eqUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.stgyEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.isoUpl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetsRubikIncome component24() {
        return this.assetsRubikIncome;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.coinFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.fixedBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.spotInUseAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.borrowFroz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.coinUsdPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.isoEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.spotIsoBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.spotCopyTradingEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.smtSyncEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.rewardBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.spotBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.openAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.accAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.spotUpl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.spotUplRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.availEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component40() {
        return this.totalPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.yearRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.coinRealBorrowAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.coinLeverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.coinBorrowFrozenMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component45() {
        return this.leverageBorrowLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component46() {
        return this.masterAccountLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component47() {
        return this.colBorrAutoConversion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component48() {
        return this.supportAutoLend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component49() {
        return this.supportAutoEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.availBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component50() {
        return this.autoEarnEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component51() {
        return this.autoLendMtAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component52() {
        return this.autoLendStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component53() {
        return this.autoLendApr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component54() {
        return this.autoLendAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component55() {
        return this.supportAutoStaking;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component56() {
        return this.autoStakingStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component57() {
        return this.stakingApr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component58() {
        return this.stakeDistribFreq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component59() {
        return this.colRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.frozenBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component60() {
        return this.freeInterest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component61() {
        return this.liabConversionHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component62() {
        return this.hourRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component63() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.liab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.upl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.mgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountDetailData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, AssetsRubikIncome assetsRubikIncome, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, @NotNull String str42, @NotNull String str43, @NotNull String str44, @NotNull String str45, String str46, boolean z, boolean z2, boolean z3, String str47, String str48, String str49, String str50, Boolean bool, String str51, String str52, String str53, @NotNull String str54, @NotNull String str55, @NotNull String str56, @NotNull String str57, @NotNull String str58) {
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
        Intrinsics.checkNotNullParameter(str43, "");
        Intrinsics.checkNotNullParameter(str44, "");
        Intrinsics.checkNotNullParameter(str45, "");
        Intrinsics.checkNotNullParameter(str54, "");
        Intrinsics.checkNotNullParameter(str55, "");
        Intrinsics.checkNotNullParameter(str56, "");
        Intrinsics.checkNotNullParameter(str57, "");
        Intrinsics.checkNotNullParameter(str58, "");
        return new AccountDetailData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, assetsRubikIncome, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, z, z2, z3, str47, str48, str49, str50, bool, str51, str52, str53, str54, str55, str56, str57, str58);
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
        if (!(obj instanceof AccountDetailData)) {
            return false;
        }
        AccountDetailData accountDetailData = (AccountDetailData) obj;
        return Intrinsics.EZpvd((Object) this.ccy, (Object) accountDetailData.ccy) && Intrinsics.EZpvd((Object) this.eq, (Object) accountDetailData.eq) && Intrinsics.EZpvd((Object) this.isoEq, (Object) accountDetailData.isoEq) && Intrinsics.EZpvd((Object) this.availEq, (Object) accountDetailData.availEq) && Intrinsics.EZpvd((Object) this.availBal, (Object) accountDetailData.availBal) && Intrinsics.EZpvd((Object) this.frozenBal, (Object) accountDetailData.frozenBal) && Intrinsics.EZpvd((Object) this.liab, (Object) accountDetailData.liab) && Intrinsics.EZpvd((Object) this.upl, (Object) accountDetailData.upl) && Intrinsics.EZpvd((Object) this.mgnRatio, (Object) accountDetailData.mgnRatio) && Intrinsics.EZpvd((Object) this.interest, (Object) accountDetailData.interest) && Intrinsics.EZpvd((Object) this.crossLiab, (Object) accountDetailData.crossLiab) && Intrinsics.EZpvd((Object) this.isoLiab, (Object) accountDetailData.isoLiab) && Intrinsics.EZpvd((Object) this.twap, (Object) accountDetailData.twap) && Intrinsics.EZpvd((Object) this.frpType, (Object) accountDetailData.frpType) && Intrinsics.EZpvd((Object) this.notionalLever, (Object) accountDetailData.notionalLever) && Intrinsics.EZpvd((Object) this.cashBal, (Object) accountDetailData.cashBal) && Intrinsics.EZpvd((Object) this.uTime, (Object) accountDetailData.uTime) && Intrinsics.EZpvd((Object) this.disEq, (Object) accountDetailData.disEq) && Intrinsics.EZpvd((Object) this.ordFrozen, (Object) accountDetailData.ordFrozen) && Intrinsics.EZpvd((Object) this.maxLoan, (Object) accountDetailData.maxLoan) && Intrinsics.EZpvd((Object) this.eqUsd, (Object) accountDetailData.eqUsd) && Intrinsics.EZpvd((Object) this.stgyEq, (Object) accountDetailData.stgyEq) && Intrinsics.EZpvd((Object) this.isoUpl, (Object) accountDetailData.isoUpl) && Intrinsics.EZpvd(this.assetsRubikIncome, accountDetailData.assetsRubikIncome) && Intrinsics.EZpvd((Object) this.coinFullName, (Object) accountDetailData.coinFullName) && Intrinsics.EZpvd((Object) this.fixedBal, (Object) accountDetailData.fixedBal) && Intrinsics.EZpvd((Object) this.spotInUseAmt, (Object) accountDetailData.spotInUseAmt) && Intrinsics.EZpvd((Object) this.borrowFroz, (Object) accountDetailData.borrowFroz) && Intrinsics.EZpvd((Object) this.coinUsdPrice, (Object) accountDetailData.coinUsdPrice) && Intrinsics.EZpvd((Object) this.spotIsoBal, (Object) accountDetailData.spotIsoBal) && Intrinsics.EZpvd((Object) this.spotCopyTradingEq, (Object) accountDetailData.spotCopyTradingEq) && Intrinsics.EZpvd((Object) this.smtSyncEq, (Object) accountDetailData.smtSyncEq) && Intrinsics.EZpvd((Object) this.rewardBal, (Object) accountDetailData.rewardBal) && Intrinsics.EZpvd((Object) this.spotBal, (Object) accountDetailData.spotBal) && Intrinsics.EZpvd((Object) this.openAvgPx, (Object) accountDetailData.openAvgPx) && Intrinsics.EZpvd((Object) this.accAvgPx, (Object) accountDetailData.accAvgPx) && Intrinsics.EZpvd((Object) this.spotUpl, (Object) accountDetailData.spotUpl) && Intrinsics.EZpvd((Object) this.spotUplRatio, (Object) accountDetailData.spotUplRatio) && Intrinsics.EZpvd((Object) this.totalPnl, (Object) accountDetailData.totalPnl) && Intrinsics.EZpvd((Object) this.totalPnlRatio, (Object) accountDetailData.totalPnlRatio) && Intrinsics.EZpvd((Object) this.yearRates, (Object) accountDetailData.yearRates) && Intrinsics.EZpvd((Object) this.coinRealBorrowAmt, (Object) accountDetailData.coinRealBorrowAmt) && Intrinsics.EZpvd((Object) this.coinLeverage, (Object) accountDetailData.coinLeverage) && Intrinsics.EZpvd((Object) this.coinBorrowFrozenMargin, (Object) accountDetailData.coinBorrowFrozenMargin) && Intrinsics.EZpvd((Object) this.leverageBorrowLimit, (Object) accountDetailData.leverageBorrowLimit) && Intrinsics.EZpvd((Object) this.masterAccountLimit, (Object) accountDetailData.masterAccountLimit) && Intrinsics.EZpvd((Object) this.colBorrAutoConversion, (Object) accountDetailData.colBorrAutoConversion) && this.supportAutoLend == accountDetailData.supportAutoLend && this.supportAutoEarn == accountDetailData.supportAutoEarn && this.autoEarnEnabled == accountDetailData.autoEarnEnabled && Intrinsics.EZpvd((Object) this.autoLendMtAmt, (Object) accountDetailData.autoLendMtAmt) && Intrinsics.EZpvd((Object) this.autoLendStatus, (Object) accountDetailData.autoLendStatus) && Intrinsics.EZpvd((Object) this.autoLendApr, (Object) accountDetailData.autoLendApr) && Intrinsics.EZpvd((Object) this.autoLendAmt, (Object) accountDetailData.autoLendAmt) && Intrinsics.EZpvd(this.supportAutoStaking, accountDetailData.supportAutoStaking) && Intrinsics.EZpvd((Object) this.autoStakingStatus, (Object) accountDetailData.autoStakingStatus) && Intrinsics.EZpvd((Object) this.stakingApr, (Object) accountDetailData.stakingApr) && Intrinsics.EZpvd((Object) this.stakeDistribFreq, (Object) accountDetailData.stakeDistribFreq) && Intrinsics.EZpvd((Object) this.colRes, (Object) accountDetailData.colRes) && Intrinsics.EZpvd((Object) this.freeInterest, (Object) accountDetailData.freeInterest) && Intrinsics.EZpvd((Object) this.liabConversionHistory, (Object) accountDetailData.liabConversionHistory) && Intrinsics.EZpvd((Object) this.hourRates, (Object) accountDetailData.hourRates) && Intrinsics.EZpvd((Object) this.rateType, (Object) accountDetailData.rateType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccAvgPx() {
        return this.accAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetsRubikIncome getAssetsRubikIncome() {
        return this.assetsRubikIncome;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAutoEarnEnabled() {
        return this.autoEarnEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoLendAmt() {
        return this.autoLendAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoLendApr() {
        return this.autoLendApr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoLendMtAmt() {
        return this.autoLendMtAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoLendStatus() {
        return this.autoLendStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoStakingStatus() {
        return this.autoStakingStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailBal() {
        return this.availBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailEq() {
        return this.availEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBorrowFroz() {
        return this.borrowFroz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCashBal() {
        return this.cashBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinBorrowFrozenMargin() {
        return this.coinBorrowFrozenMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinFullName() {
        return this.coinFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinLeverage() {
        return this.coinLeverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinRealBorrowAmt() {
        return this.coinRealBorrowAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinUsdPrice() {
        return this.coinUsdPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getColBorrAutoConversion() {
        return this.colBorrAutoConversion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getColRes() {
        return this.colRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCrossLiab() {
        return this.crossLiab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisEq() {
        return this.disEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEq() {
        return this.eq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEqUsd() {
        return this.eqUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFixedBal() {
        return this.fixedBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFreeInterest() {
        return this.freeInterest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrozenBal() {
        return this.frozenBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrpType() {
        return this.frpType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHourRates() {
        return this.hourRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInterest() {
        return this.interest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIsoEq() {
        return this.isoEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIsoLiab() {
        return this.isoLiab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIsoUpl() {
        return this.isoUpl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeverageBorrowLimit() {
        return this.leverageBorrowLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiab() {
        return this.liab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiabConversionHistory() {
        return this.liabConversionHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMasterAccountLimit() {
        return this.masterAccountLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxLoan() {
        return this.maxLoan;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMgnRatio() {
        return this.mgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalLever() {
        return this.notionalLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpenAvgPx() {
        return this.openAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdFrozen() {
        return this.ordFrozen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRateType() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRewardBal() {
        return this.rewardBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSmtSyncEq() {
        return this.smtSyncEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotBal() {
        return this.spotBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotCopyTradingEq() {
        return this.spotCopyTradingEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotInUseAmt() {
        return this.spotInUseAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotIsoBal() {
        return this.spotIsoBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotUpl() {
        return this.spotUpl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotUplRatio() {
        return this.spotUplRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStakeDistribFreq() {
        return this.stakeDistribFreq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStakingApr() {
        return this.stakingApr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStgyEq() {
        return this.stgyEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportAutoEarn() {
        return this.supportAutoEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportAutoLend() {
        return this.supportAutoLend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSupportAutoStaking() {
        return this.supportAutoStaking;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnl() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnlRatio() {
        return this.totalPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTwap() {
        return this.twap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUTime() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpl() {
        return this.upl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getYearRates() {
        return this.yearRates;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.ccy.hashCode();
        int iHashCode2 = this.eq.hashCode();
        int iHashCode3 = this.isoEq.hashCode();
        int iHashCode4 = this.availEq.hashCode();
        int iHashCode5 = this.availBal.hashCode();
        int iHashCode6 = this.frozenBal.hashCode();
        int iHashCode7 = this.liab.hashCode();
        int iHashCode8 = this.upl.hashCode();
        int iHashCode9 = this.mgnRatio.hashCode();
        int iHashCode10 = this.interest.hashCode();
        int iHashCode11 = this.crossLiab.hashCode();
        int iHashCode12 = this.isoLiab.hashCode();
        int iHashCode13 = this.twap.hashCode();
        int iHashCode14 = this.frpType.hashCode();
        int iHashCode15 = this.notionalLever.hashCode();
        int iHashCode16 = this.cashBal.hashCode();
        int iHashCode17 = this.uTime.hashCode();
        int iHashCode18 = this.disEq.hashCode();
        int iHashCode19 = this.ordFrozen.hashCode();
        int iHashCode20 = this.maxLoan.hashCode();
        int iHashCode21 = this.eqUsd.hashCode();
        int iHashCode22 = this.stgyEq.hashCode();
        int iHashCode23 = this.isoUpl.hashCode();
        AssetsRubikIncome assetsRubikIncome = this.assetsRubikIncome;
        int iHashCode24 = assetsRubikIncome == null ? 0 : assetsRubikIncome.hashCode();
        int iHashCode25 = this.coinFullName.hashCode();
        int iHashCode26 = this.fixedBal.hashCode();
        int iHashCode27 = this.spotInUseAmt.hashCode();
        int iHashCode28 = this.borrowFroz.hashCode();
        int iHashCode29 = this.coinUsdPrice.hashCode();
        int iHashCode30 = this.spotIsoBal.hashCode();
        int iHashCode31 = this.spotCopyTradingEq.hashCode();
        int iHashCode32 = this.smtSyncEq.hashCode();
        int iHashCode33 = this.rewardBal.hashCode();
        int iHashCode34 = this.spotBal.hashCode();
        int iHashCode35 = this.openAvgPx.hashCode();
        int iHashCode36 = this.accAvgPx.hashCode();
        int iHashCode37 = this.spotUpl.hashCode();
        int iHashCode38 = this.spotUplRatio.hashCode();
        int iHashCode39 = this.totalPnl.hashCode();
        int iHashCode40 = this.totalPnlRatio.hashCode();
        int iHashCode41 = this.yearRates.hashCode();
        int iHashCode42 = this.coinRealBorrowAmt.hashCode();
        int iHashCode43 = this.coinLeverage.hashCode();
        int iHashCode44 = this.coinBorrowFrozenMargin.hashCode();
        int iHashCode45 = this.leverageBorrowLimit.hashCode();
        int iHashCode46 = this.masterAccountLimit.hashCode();
        String str = this.colBorrAutoConversion;
        int iHashCode47 = str == null ? 0 : str.hashCode();
        int iHashCode48 = Boolean.hashCode(this.supportAutoLend);
        int iHashCode49 = Boolean.hashCode(this.supportAutoEarn);
        int iHashCode50 = Boolean.hashCode(this.autoEarnEnabled);
        String str2 = this.autoLendMtAmt;
        int iHashCode51 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.autoLendStatus;
        int iHashCode52 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.autoLendApr;
        int iHashCode53 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.autoLendAmt;
        int iHashCode54 = str5 == null ? 0 : str5.hashCode();
        Boolean bool = this.supportAutoStaking;
        int iHashCode55 = bool == null ? 0 : bool.hashCode();
        String str6 = this.autoStakingStatus;
        int iHashCode56 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.stakingApr;
        int iHashCode57 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.stakeDistribFreq;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + (str8 != null ? str8.hashCode() : 0)) * 31) + this.colRes.hashCode()) * 31) + this.freeInterest.hashCode()) * 31) + this.liabConversionHistory.hashCode()) * 31) + this.hourRates.hashCode()) * 31) + this.rateType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccAvgPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accAvgPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssetsRubikIncome(AssetsRubikIncome assetsRubikIncome) {
        this.assetsRubikIncome = assetsRubikIncome;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoEarnEnabled(boolean z) {
        this.autoEarnEnabled = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoLendAmt(String str) {
        this.autoLendAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoLendApr(String str) {
        this.autoLendApr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoLendMtAmt(String str) {
        this.autoLendMtAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoLendStatus(String str) {
        this.autoLendStatus = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoStakingStatus(String str) {
        this.autoStakingStatus = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvailBal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.availBal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvailEq(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.availEq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBorrowFroz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.borrowFroz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCashBal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cashBal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinBorrowFrozenMargin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinBorrowFrozenMargin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinFullName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinFullName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinLeverage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinLeverage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinRealBorrowAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinRealBorrowAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinUsdPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinUsdPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setColBorrAutoConversion(String str) {
        this.colBorrAutoConversion = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setColRes(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.colRes = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCrossLiab(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.crossLiab = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisEq(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.disEq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEq(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.eq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEqUsd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.eqUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFixedBal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fixedBal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFreeInterest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.freeInterest = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrozenBal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.frozenBal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrpType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.frpType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHourRates(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.hourRates = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInterest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.interest = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIsoEq(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isoEq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIsoLiab(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isoLiab = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIsoUpl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isoUpl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeverageBorrowLimit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.leverageBorrowLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiab(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.liab = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiabConversionHistory(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.liabConversionHistory = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMasterAccountLimit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.masterAccountLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxLoan(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxLoan = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMgnRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mgnRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalLever(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.notionalLever = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenAvgPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.openAvgPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdFrozen(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordFrozen = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRateType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rateType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRewardBal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rewardBal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSmtSyncEq(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.smtSyncEq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpotBal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.spotBal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpotCopyTradingEq(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.spotCopyTradingEq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpotInUseAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.spotInUseAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpotIsoBal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.spotIsoBal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpotUpl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.spotUpl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpotUplRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.spotUplRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStakeDistribFreq(String str) {
        this.stakeDistribFreq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStakingApr(String str) {
        this.stakingApr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStgyEq(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.stgyEq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportAutoEarn(boolean z) {
        this.supportAutoEarn = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportAutoLend(boolean z) {
        this.supportAutoLend = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportAutoStaking(Boolean bool) {
        this.supportAutoStaking = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalPnl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalPnlRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalPnlRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTwap(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.twap = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.upl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setYearRates(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.yearRates = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.ccy);
        parcel.writeString(this.eq);
        parcel.writeString(this.isoEq);
        parcel.writeString(this.availEq);
        parcel.writeString(this.availBal);
        parcel.writeString(this.frozenBal);
        parcel.writeString(this.liab);
        parcel.writeString(this.upl);
        parcel.writeString(this.mgnRatio);
        parcel.writeString(this.interest);
        parcel.writeString(this.crossLiab);
        parcel.writeString(this.isoLiab);
        parcel.writeString(this.twap);
        parcel.writeString(this.frpType);
        parcel.writeString(this.notionalLever);
        parcel.writeString(this.cashBal);
        parcel.writeString(this.uTime);
        parcel.writeString(this.disEq);
        parcel.writeString(this.ordFrozen);
        parcel.writeString(this.maxLoan);
        parcel.writeString(this.eqUsd);
        parcel.writeString(this.stgyEq);
        parcel.writeString(this.isoUpl);
        AssetsRubikIncome assetsRubikIncome = this.assetsRubikIncome;
        if (assetsRubikIncome == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            assetsRubikIncome.writeToParcel(parcel, i);
        }
        parcel.writeString(this.coinFullName);
        parcel.writeString(this.fixedBal);
        parcel.writeString(this.spotInUseAmt);
        parcel.writeString(this.borrowFroz);
        parcel.writeString(this.coinUsdPrice);
        parcel.writeString(this.spotIsoBal);
        parcel.writeString(this.spotCopyTradingEq);
        parcel.writeString(this.smtSyncEq);
        parcel.writeString(this.rewardBal);
        parcel.writeString(this.spotBal);
        parcel.writeString(this.openAvgPx);
        parcel.writeString(this.accAvgPx);
        parcel.writeString(this.spotUpl);
        parcel.writeString(this.spotUplRatio);
        parcel.writeString(this.totalPnl);
        parcel.writeString(this.totalPnlRatio);
        parcel.writeString(this.yearRates);
        parcel.writeString(this.coinRealBorrowAmt);
        parcel.writeString(this.coinLeverage);
        parcel.writeString(this.coinBorrowFrozenMargin);
        parcel.writeString(this.leverageBorrowLimit);
        parcel.writeString(this.masterAccountLimit);
        parcel.writeString(this.colBorrAutoConversion);
        parcel.writeInt(this.supportAutoLend ? 1 : 0);
        parcel.writeInt(this.supportAutoEarn ? 1 : 0);
        parcel.writeInt(this.autoEarnEnabled ? 1 : 0);
        parcel.writeString(this.autoLendMtAmt);
        parcel.writeString(this.autoLendStatus);
        parcel.writeString(this.autoLendApr);
        parcel.writeString(this.autoLendAmt);
        Boolean bool = this.supportAutoStaking;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.autoStakingStatus);
        parcel.writeString(this.stakingApr);
        parcel.writeString(this.stakeDistribFreq);
        parcel.writeString(this.colRes);
        parcel.writeString(this.freeInterest);
        parcel.writeString(this.liabConversionHistory);
        parcel.writeString(this.hourRates);
        parcel.writeString(this.rateType);
    }

    public /* synthetic */ AccountDetailData(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, AssetsRubikIncome assetsRubikIncome, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, boolean z, boolean z2, boolean z3, String str47, String str48, String str49, String str50, Boolean bool, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str;
        }
        if ((i & 2) == 0) {
            this.eq = "";
        } else {
            this.eq = str2;
        }
        if ((i & 4) == 0) {
            this.isoEq = "";
        } else {
            this.isoEq = str3;
        }
        if ((i & 8) == 0) {
            this.availEq = "";
        } else {
            this.availEq = str4;
        }
        if ((i & 16) == 0) {
            this.availBal = "";
        } else {
            this.availBal = str5;
        }
        if ((i & 32) == 0) {
            this.frozenBal = "";
        } else {
            this.frozenBal = str6;
        }
        if ((i & 64) == 0) {
            this.liab = "";
        } else {
            this.liab = str7;
        }
        if ((i & 128) == 0) {
            this.upl = "";
        } else {
            this.upl = str8;
        }
        if ((i & 256) == 0) {
            this.mgnRatio = "";
        } else {
            this.mgnRatio = str9;
        }
        if ((i & 512) == 0) {
            this.interest = "";
        } else {
            this.interest = str10;
        }
        if ((i & 1024) == 0) {
            this.crossLiab = "";
        } else {
            this.crossLiab = str11;
        }
        if ((i & 2048) == 0) {
            this.isoLiab = "";
        } else {
            this.isoLiab = str12;
        }
        if ((i & 4096) == 0) {
            this.twap = "";
        } else {
            this.twap = str13;
        }
        if ((i & 8192) == 0) {
            this.frpType = "";
        } else {
            this.frpType = str14;
        }
        if ((i & 16384) == 0) {
            this.notionalLever = "";
        } else {
            this.notionalLever = str15;
        }
        if ((i & 32768) == 0) {
            this.cashBal = "";
        } else {
            this.cashBal = str16;
        }
        if ((i & 65536) == 0) {
            this.uTime = "";
        } else {
            this.uTime = str17;
        }
        if ((i & 131072) == 0) {
            this.disEq = "";
        } else {
            this.disEq = str18;
        }
        if ((i & 262144) == 0) {
            this.ordFrozen = "";
        } else {
            this.ordFrozen = str19;
        }
        if ((i & 524288) == 0) {
            this.maxLoan = "";
        } else {
            this.maxLoan = str20;
        }
        if ((1048576 & i) == 0) {
            this.eqUsd = "";
        } else {
            this.eqUsd = str21;
        }
        if ((2097152 & i) == 0) {
            this.stgyEq = "";
        } else {
            this.stgyEq = str22;
        }
        if ((4194304 & i) == 0) {
            this.isoUpl = "";
        } else {
            this.isoUpl = str23;
        }
        this.assetsRubikIncome = (8388608 & i) == 0 ? null : assetsRubikIncome;
        if ((16777216 & i) == 0) {
            this.coinFullName = "";
        } else {
            this.coinFullName = str24;
        }
        if ((33554432 & i) == 0) {
            this.fixedBal = "";
        } else {
            this.fixedBal = str25;
        }
        if ((67108864 & i) == 0) {
            this.spotInUseAmt = "";
        } else {
            this.spotInUseAmt = str26;
        }
        if ((134217728 & i) == 0) {
            this.borrowFroz = "";
        } else {
            this.borrowFroz = str27;
        }
        if ((268435456 & i) == 0) {
            this.coinUsdPrice = "";
        } else {
            this.coinUsdPrice = str28;
        }
        if ((536870912 & i) == 0) {
            this.spotIsoBal = "";
        } else {
            this.spotIsoBal = str29;
        }
        if ((1073741824 & i) == 0) {
            this.spotCopyTradingEq = "";
        } else {
            this.spotCopyTradingEq = str30;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.smtSyncEq = "";
        } else {
            this.smtSyncEq = str31;
        }
        if ((i2 & 1) == 0) {
            this.rewardBal = "";
        } else {
            this.rewardBal = str32;
        }
        if ((i2 & 2) == 0) {
            this.spotBal = "";
        } else {
            this.spotBal = str33;
        }
        if ((i2 & 4) == 0) {
            this.openAvgPx = "";
        } else {
            this.openAvgPx = str34;
        }
        if ((i2 & 8) == 0) {
            this.accAvgPx = "";
        } else {
            this.accAvgPx = str35;
        }
        if ((i2 & 16) == 0) {
            this.spotUpl = "";
        } else {
            this.spotUpl = str36;
        }
        if ((i2 & 32) == 0) {
            this.spotUplRatio = "";
        } else {
            this.spotUplRatio = str37;
        }
        if ((i2 & 64) == 0) {
            this.totalPnl = "";
        } else {
            this.totalPnl = str38;
        }
        if ((i2 & 128) == 0) {
            this.totalPnlRatio = "";
        } else {
            this.totalPnlRatio = str39;
        }
        if ((i2 & 256) == 0) {
            this.yearRates = "";
        } else {
            this.yearRates = str40;
        }
        if ((i2 & 512) == 0) {
            this.coinRealBorrowAmt = "";
        } else {
            this.coinRealBorrowAmt = str41;
        }
        if ((i2 & 1024) == 0) {
            this.coinLeverage = "";
        } else {
            this.coinLeverage = str42;
        }
        if ((i2 & 2048) == 0) {
            this.coinBorrowFrozenMargin = "";
        } else {
            this.coinBorrowFrozenMargin = str43;
        }
        if ((i2 & 4096) == 0) {
            this.leverageBorrowLimit = "";
        } else {
            this.leverageBorrowLimit = str44;
        }
        if ((i2 & 8192) == 0) {
            this.masterAccountLimit = "";
        } else {
            this.masterAccountLimit = str45;
        }
        if ((i2 & 16384) == 0) {
            this.colBorrAutoConversion = "";
        } else {
            this.colBorrAutoConversion = str46;
        }
        if ((i2 & 32768) == 0) {
            this.supportAutoLend = false;
        } else {
            this.supportAutoLend = z;
        }
        if ((i2 & 65536) == 0) {
            this.supportAutoEarn = false;
        } else {
            this.supportAutoEarn = z2;
        }
        if ((i2 & 131072) == 0) {
            this.autoEarnEnabled = false;
        } else {
            this.autoEarnEnabled = z3;
        }
        if ((i2 & 262144) == 0) {
            this.autoLendMtAmt = "";
        } else {
            this.autoLendMtAmt = str47;
        }
        if ((i2 & 524288) == 0) {
            this.autoLendStatus = "";
        } else {
            this.autoLendStatus = str48;
        }
        if ((1048576 & i2) == 0) {
            this.autoLendApr = "";
        } else {
            this.autoLendApr = str49;
        }
        if ((2097152 & i2) == 0) {
            this.autoLendAmt = "";
        } else {
            this.autoLendAmt = str50;
        }
        this.supportAutoStaking = (4194304 & i2) == 0 ? Boolean.FALSE : bool;
        if ((8388608 & i2) == 0) {
            this.autoStakingStatus = "";
        } else {
            this.autoStakingStatus = str51;
        }
        if ((16777216 & i2) == 0) {
            this.stakingApr = "";
        } else {
            this.stakingApr = str52;
        }
        if ((33554432 & i2) == 0) {
            this.stakeDistribFreq = "";
        } else {
            this.stakeDistribFreq = str53;
        }
        if ((67108864 & i2) == 0) {
            this.colRes = "";
        } else {
            this.colRes = str54;
        }
        if ((134217728 & i2) == 0) {
            this.freeInterest = "";
        } else {
            this.freeInterest = str55;
        }
        if ((268435456 & i2) == 0) {
            this.liabConversionHistory = "";
        } else {
            this.liabConversionHistory = str56;
        }
        if ((536870912 & i2) == 0) {
            this.hourRates = "";
        } else {
            this.hourRates = str57;
        }
        if ((1073741824 & i2) == 0) {
            this.rateType = "";
        } else {
            this.rateType = str58;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AccountDetailData accountDetailData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) accountDetailData.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, accountDetailData.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) accountDetailData.eq, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, accountDetailData.eq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) accountDetailData.isoEq, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, accountDetailData.isoEq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) accountDetailData.availEq, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, accountDetailData.availEq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) accountDetailData.availBal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, accountDetailData.availBal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) accountDetailData.frozenBal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, accountDetailData.frozenBal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) accountDetailData.liab, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, accountDetailData.liab);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) accountDetailData.upl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, accountDetailData.upl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) accountDetailData.mgnRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, accountDetailData.mgnRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) accountDetailData.interest, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, accountDetailData.interest);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) accountDetailData.crossLiab, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, accountDetailData.crossLiab);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) accountDetailData.isoLiab, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, accountDetailData.isoLiab);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) accountDetailData.twap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, accountDetailData.twap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) accountDetailData.frpType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, accountDetailData.frpType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) accountDetailData.notionalLever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, accountDetailData.notionalLever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) accountDetailData.cashBal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, accountDetailData.cashBal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) accountDetailData.uTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, accountDetailData.uTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) accountDetailData.disEq, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, accountDetailData.disEq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) accountDetailData.ordFrozen, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, accountDetailData.ordFrozen);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) accountDetailData.maxLoan, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, accountDetailData.maxLoan);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) accountDetailData.eqUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, accountDetailData.eqUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) accountDetailData.stgyEq, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, accountDetailData.stgyEq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) accountDetailData.isoUpl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, accountDetailData.isoUpl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || accountDetailData.assetsRubikIncome != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, AssetsRubikIncome$$serializer.INSTANCE, accountDetailData.assetsRubikIncome);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) accountDetailData.coinFullName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, accountDetailData.coinFullName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) accountDetailData.fixedBal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, accountDetailData.fixedBal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) accountDetailData.spotInUseAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, accountDetailData.spotInUseAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) accountDetailData.borrowFroz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, accountDetailData.borrowFroz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) accountDetailData.coinUsdPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, accountDetailData.coinUsdPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) accountDetailData.spotIsoBal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, accountDetailData.spotIsoBal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) accountDetailData.spotCopyTradingEq, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, accountDetailData.spotCopyTradingEq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) accountDetailData.smtSyncEq, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, accountDetailData.smtSyncEq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) accountDetailData.rewardBal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, accountDetailData.rewardBal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) accountDetailData.spotBal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, accountDetailData.spotBal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) accountDetailData.openAvgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, accountDetailData.openAvgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) accountDetailData.accAvgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 35, accountDetailData.accAvgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd((Object) accountDetailData.spotUpl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 36, accountDetailData.spotUpl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || !Intrinsics.EZpvd((Object) accountDetailData.spotUplRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 37, accountDetailData.spotUplRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) accountDetailData.totalPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, accountDetailData.totalPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || !Intrinsics.EZpvd((Object) accountDetailData.totalPnlRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 39, accountDetailData.totalPnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || !Intrinsics.EZpvd((Object) accountDetailData.yearRates, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 40, accountDetailData.yearRates);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !Intrinsics.EZpvd((Object) accountDetailData.coinRealBorrowAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 41, accountDetailData.coinRealBorrowAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || !Intrinsics.EZpvd((Object) accountDetailData.coinLeverage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 42, accountDetailData.coinLeverage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || !Intrinsics.EZpvd((Object) accountDetailData.coinBorrowFrozenMargin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 43, accountDetailData.coinBorrowFrozenMargin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || !Intrinsics.EZpvd((Object) accountDetailData.leverageBorrowLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 44, accountDetailData.leverageBorrowLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || !Intrinsics.EZpvd((Object) accountDetailData.masterAccountLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 45, accountDetailData.masterAccountLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || !Intrinsics.EZpvd((Object) accountDetailData.colBorrAutoConversion, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 46, StringSerializer.INSTANCE, accountDetailData.colBorrAutoConversion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || accountDetailData.supportAutoLend) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 47, accountDetailData.supportAutoLend);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || accountDetailData.supportAutoEarn) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 48, accountDetailData.supportAutoEarn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || accountDetailData.autoEarnEnabled) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 49, accountDetailData.autoEarnEnabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || !Intrinsics.EZpvd((Object) accountDetailData.autoLendMtAmt, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 50, StringSerializer.INSTANCE, accountDetailData.autoLendMtAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || !Intrinsics.EZpvd((Object) accountDetailData.autoLendStatus, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 51, StringSerializer.INSTANCE, accountDetailData.autoLendStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || !Intrinsics.EZpvd((Object) accountDetailData.autoLendApr, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 52, StringSerializer.INSTANCE, accountDetailData.autoLendApr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || !Intrinsics.EZpvd((Object) accountDetailData.autoLendAmt, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 53, StringSerializer.INSTANCE, accountDetailData.autoLendAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || !Intrinsics.EZpvd(accountDetailData.supportAutoStaking, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 54, BooleanSerializer.INSTANCE, accountDetailData.supportAutoStaking);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || !Intrinsics.EZpvd((Object) accountDetailData.autoStakingStatus, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 55, StringSerializer.INSTANCE, accountDetailData.autoStakingStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || !Intrinsics.EZpvd((Object) accountDetailData.stakingApr, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 56, StringSerializer.INSTANCE, accountDetailData.stakingApr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || !Intrinsics.EZpvd((Object) accountDetailData.stakeDistribFreq, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 57, StringSerializer.INSTANCE, accountDetailData.stakeDistribFreq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 58) || !Intrinsics.EZpvd((Object) accountDetailData.colRes, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 58, accountDetailData.colRes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 59) || !Intrinsics.EZpvd((Object) accountDetailData.freeInterest, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 59, accountDetailData.freeInterest);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 60) || !Intrinsics.EZpvd((Object) accountDetailData.liabConversionHistory, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 60, accountDetailData.liabConversionHistory);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 61) || !Intrinsics.EZpvd((Object) accountDetailData.hourRates, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 61, accountDetailData.hourRates);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 62) && Intrinsics.EZpvd((Object) accountDetailData.rateType, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 62, accountDetailData.rateType);
    }

    public AccountDetailData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, AssetsRubikIncome assetsRubikIncome, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, @NotNull String str42, @NotNull String str43, @NotNull String str44, @NotNull String str45, String str46, boolean z, boolean z2, boolean z3, String str47, String str48, String str49, String str50, Boolean bool, String str51, String str52, String str53, @NotNull String str54, @NotNull String str55, @NotNull String str56, @NotNull String str57, @NotNull String str58) {
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
        Intrinsics.checkNotNullParameter(str43, "");
        Intrinsics.checkNotNullParameter(str44, "");
        Intrinsics.checkNotNullParameter(str45, "");
        Intrinsics.checkNotNullParameter(str54, "");
        Intrinsics.checkNotNullParameter(str55, "");
        Intrinsics.checkNotNullParameter(str56, "");
        Intrinsics.checkNotNullParameter(str57, "");
        Intrinsics.checkNotNullParameter(str58, "");
        this.ccy = str;
        this.eq = str2;
        this.isoEq = str3;
        this.availEq = str4;
        this.availBal = str5;
        this.frozenBal = str6;
        this.liab = str7;
        this.upl = str8;
        this.mgnRatio = str9;
        this.interest = str10;
        this.crossLiab = str11;
        this.isoLiab = str12;
        this.twap = str13;
        this.frpType = str14;
        this.notionalLever = str15;
        this.cashBal = str16;
        this.uTime = str17;
        this.disEq = str18;
        this.ordFrozen = str19;
        this.maxLoan = str20;
        this.eqUsd = str21;
        this.stgyEq = str22;
        this.isoUpl = str23;
        this.assetsRubikIncome = assetsRubikIncome;
        this.coinFullName = str24;
        this.fixedBal = str25;
        this.spotInUseAmt = str26;
        this.borrowFroz = str27;
        this.coinUsdPrice = str28;
        this.spotIsoBal = str29;
        this.spotCopyTradingEq = str30;
        this.smtSyncEq = str31;
        this.rewardBal = str32;
        this.spotBal = str33;
        this.openAvgPx = str34;
        this.accAvgPx = str35;
        this.spotUpl = str36;
        this.spotUplRatio = str37;
        this.totalPnl = str38;
        this.totalPnlRatio = str39;
        this.yearRates = str40;
        this.coinRealBorrowAmt = str41;
        this.coinLeverage = str42;
        this.coinBorrowFrozenMargin = str43;
        this.leverageBorrowLimit = str44;
        this.masterAccountLimit = str45;
        this.colBorrAutoConversion = str46;
        this.supportAutoLend = z;
        this.supportAutoEarn = z2;
        this.autoEarnEnabled = z3;
        this.autoLendMtAmt = str47;
        this.autoLendStatus = str48;
        this.autoLendApr = str49;
        this.autoLendAmt = str50;
        this.supportAutoStaking = bool;
        this.autoStakingStatus = str51;
        this.stakingApr = str52;
        this.stakeDistribFreq = str53;
        this.colRes = str54;
        this.freeInterest = str55;
        this.liabConversionHistory = str56;
        this.hourRates = str57;
        this.rateType = str58;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x02fd: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0004: ARITH (r127v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r127v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r127v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r127v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r127v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r127v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r127v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r127v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r127v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r72v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r127v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r73v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r127v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r74v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r127v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r75v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0066: ARITH (r127v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r76v0 java.lang.String))
  (wrap:java.lang.String:0x0079: TERNARY null = ((wrap:int:0x0070: ARITH (r127v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r77v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007b: ARITH (r127v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r78v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0087: ARITH (r127v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r79v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0092: ARITH (r127v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r80v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009d: ARITH (r127v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r81v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a8: ARITH (r127v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r82v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b3: ARITH (r127v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r83v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00be: ARITH (r127v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r84v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c9: ARITH (r127v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r85v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d4: ARITH (r127v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r86v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.AssetsRubikIncome:?: TERNARY null = ((wrap:int:0x00df: ARITH (r127v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.AssetsRubikIncome) : (r87v0 com.okinc.unify_trade.biz.AssetsRubikIncome))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ea: ARITH (r127v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r88v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f5: ARITH (r127v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r89v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0100: ARITH (r127v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r90v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010b: ARITH (r127v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r91v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0116: ARITH (r127v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r92v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0121: ARITH (r127v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r93v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012c: ARITH (r127v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r94v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0137: ARITH (r127v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r95v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0140: ARITH (r128v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r96v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0149: ARITH (r128v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r97v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0152: ARITH (r128v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r98v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x015b: ARITH (r128v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r99v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0164: ARITH (r128v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r100v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x016d: ARITH (r128v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r101v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0176: ARITH (r128v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r102v0 java.lang.String))
  (wrap:java.lang.String:0x018a: TERNARY null = ((wrap:int:0x0181: ARITH (r128v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r103v0 java.lang.String))
  (wrap:java.lang.String:0x0195: TERNARY null = ((wrap:int:0x018c: ARITH (r128v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r104v0 java.lang.String))
  (wrap:java.lang.String:0x01a0: TERNARY null = ((wrap:int:0x0197: ARITH (r128v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r105v0 java.lang.String))
  (wrap:java.lang.String:0x01ab: TERNARY null = ((wrap:int:0x01a2: ARITH (r128v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r106v0 java.lang.String))
  (wrap:java.lang.String:0x01b6: TERNARY null = ((wrap:int:0x01ad: ARITH (r128v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r107v0 java.lang.String))
  (wrap:java.lang.String:0x01c1: TERNARY null = ((wrap:int:0x01b8: ARITH (r128v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r108v0 java.lang.String))
  (wrap:java.lang.String:0x01cc: TERNARY null = ((wrap:int:0x01c3: ARITH (r128v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r109v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01ce: ARITH (r128v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r110v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x01d7: ARITH (r128v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? false : (r111v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x01e2: ARITH (r128v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? false : (r112v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x01eb: ARITH (r128v0 int) & (131072 int) A[WRAPPED]) == (0 int)) ? (r113v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01f2: ARITH (r128v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r114v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01fb: ARITH (r128v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r115v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0206: ARITH (r128v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r116v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0211: ARITH (r128v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r117v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x021c: ARITH (r128v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0220: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r118v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0227: ARITH (r128v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r119v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0232: ARITH (r128v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r120v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x023d: ARITH (r128v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r121v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0248: ARITH (r128v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r122v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0253: ARITH (r128v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r123v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x025e: ARITH (r128v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r124v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0269: ARITH (r128v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r125v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0274: ARITH (r128v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r126v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.AssetsRubikIncome, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:70) call: com.okinc.unify_trade.biz.subscribe.AccountDetailData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.AssetsRubikIncome, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AccountDetailData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, AssetsRubikIncome assetsRubikIncome, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, boolean z, boolean z2, boolean z3, String str47, String str48, String str49, String str50, Boolean bool, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? "" : str21, (i & 2097152) != 0 ? "" : str22, (i & 4194304) != 0 ? "" : str23, (i & 8388608) != 0 ? null : assetsRubikIncome, (i & 16777216) != 0 ? "" : str24, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str25, (i & 67108864) != 0 ? "" : str26, (i & 134217728) != 0 ? "" : str27, (i & 268435456) != 0 ? "" : str28, (i & 536870912) != 0 ? "" : str29, (i & 1073741824) != 0 ? "" : str30, (i & Integer.MIN_VALUE) != 0 ? "" : str31, (i2 & 1) != 0 ? "" : str32, (i2 & 2) != 0 ? "" : str33, (i2 & 4) != 0 ? "" : str34, (i2 & 8) != 0 ? "" : str35, (i2 & 16) != 0 ? "" : str36, (i2 & 32) != 0 ? "" : str37, (i2 & 64) != 0 ? "" : str38, (i2 & 128) != 0 ? "" : str39, (i2 & 256) != 0 ? "" : str40, (i2 & 512) != 0 ? "" : str41, (i2 & 1024) != 0 ? "" : str42, (i2 & 2048) != 0 ? "" : str43, (i2 & 4096) != 0 ? "" : str44, (i2 & 8192) != 0 ? "" : str45, (i2 & 16384) != 0 ? "" : str46, (i2 & 32768) != 0 ? false : z, (i2 & 65536) != 0 ? false : z2, (i2 & 131072) == 0 ? z3 : false, (i2 & 262144) != 0 ? "" : str47, (i2 & 524288) != 0 ? "" : str48, (i2 & 1048576) != 0 ? "" : str49, (i2 & 2097152) != 0 ? "" : str50, (i2 & 4194304) != 0 ? Boolean.FALSE : bool, (i2 & 8388608) != 0 ? "" : str51, (i2 & 16777216) != 0 ? "" : str52, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str53, (i2 & 67108864) != 0 ? "" : str54, (i2 & 134217728) != 0 ? "" : str55, (i2 & 268435456) != 0 ? "" : str56, (i2 & 536870912) != 0 ? "" : str57, (i2 & 1073741824) != 0 ? "" : str58);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.AccountDetailData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AccountDetailData> serializer() {
            return AccountDetailData$$serializer.INSTANCE;
        }
    }

    public String toString() {
        return "ccy:" + this.ccy + " eq:" + this.eq + " isoEq:" + this.isoEq + " availEq:" + this.availEq + " availBal:" + this.availBal + " frozenBal:" + this.frozenBal + " liab:" + this.liab + " upl:" + this.upl + ";";
    }

    public final String getEarnType() {
        return (this.supportAutoLend && Intrinsics.EZpvd(this.supportAutoStaking, Boolean.TRUE)) ? "3" : this.supportAutoLend ? "1" : Intrinsics.EZpvd(this.supportAutoStaking, Boolean.TRUE) ? "2" : "";
    }

    public final String getCashBalUsdValue() {
        return C33129mqd.mulS$default(this.cashBal, this.coinUsdPrice, null, null, null, 14, null);
    }

    public final ManualTradeSimpleData getManualTradeSimpleData() {
        return new ManualTradeSimpleData(C33129mqd.subS$default(C33129mqd.subS$default(C33129mqd.subS$default(C33129mqd.subS$default(this.eq, this.isoEq, null, null, null, 14, null), this.stgyEq, null, null, null, 14, null), this.spotCopyTradingEq, null, null, null, 14, null), this.smtSyncEq, null, null, null, 14, null), this.availBal, C33129mqd.subS$default(C33129mqd.subS$default(C33129mqd.subS$default(C33129mqd.subS$default(this.frozenBal, this.isoEq, null, null, null, 14, null), this.stgyEq, null, null, null, 14, null), this.spotCopyTradingEq, null, null, null, 14, null), this.smtSyncEq, null, null, null, 14, null), this.ccy);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ManualTradeCrossData getManualTradeCrossData() {
        boolean z;
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) {
            z = false;
        } else {
            z = true;
            if (!newProxyInstance.AkhnZx()) {
            }
        }
        return new ManualTradeCrossData(C33129mqd.subS$default(C33129mqd.subS$default(C33129mqd.subS$default(C33129mqd.subS$default(this.eq, this.isoEq, null, null, null, 14, null), this.stgyEq, null, null, null, 14, null), this.spotCopyTradingEq, null, null, null, 14, null), this.smtSyncEq, null, null, null, 14, null), z ? this.availEq : this.availBal, C33129mqd.subS$default(C33129mqd.subS$default(C33129mqd.subS$default(C33129mqd.subS$default(this.frozenBal, this.isoEq, null, null, null, 14, null), this.stgyEq, null, null, null, 14, null), this.spotCopyTradingEq, null, null, null, 14, null), this.smtSyncEq, null, null, null, 14, null), C33129mqd.subS$default(this.upl, this.isoUpl, null, null, null, 14, null), this.crossLiab, this.ccy, new PotentialBorrowingData(this.coinRealBorrowAmt, this.coinLeverage, this.coinBorrowFrozenMargin, this.leverageBorrowLimit, this.masterAccountLimit));
    }

    public final ManualTradeIsolateData getManualTradeIsolateData() {
        ManualTradeIsolateData manualTradeIsolateData = new ManualTradeIsolateData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
        manualTradeIsolateData.setEq(this.isoEq);
        manualTradeIsolateData.setUpl(this.isoUpl);
        manualTradeIsolateData.setLiab(this.isoLiab);
        manualTradeIsolateData.setCcy(this.ccy);
        return manualTradeIsolateData;
    }

    public final StrategyTradeData getStrategyTradeData() {
        StrategyTradeData strategyTradeData = new StrategyTradeData((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        strategyTradeData.setEq(this.stgyEq);
        strategyTradeData.setCcy(this.ccy);
        return strategyTradeData;
    }

    public final SpotFollowerTradeData getSpotIsoData() {
        SpotFollowerTradeData spotFollowerTradeData = new SpotFollowerTradeData((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        spotFollowerTradeData.setEq(this.spotCopyTradingEq);
        spotFollowerTradeData.setCcy(this.ccy);
        return spotFollowerTradeData;
    }

    public final PosCopyTradeData getPosCopyData() {
        PosCopyTradeData posCopyTradeData = new PosCopyTradeData((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        posCopyTradeData.setEq(this.smtSyncEq);
        posCopyTradeData.setCcy(this.ccy);
        return posCopyTradeData;
    }
}
