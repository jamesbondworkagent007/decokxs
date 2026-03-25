package com.okinc.unify_trade.biz;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class AccountTierData {
    private final String baseIsoLoanCoin;
    private final String coinVal;
    private final String contractVal;
    private final String dmmUserTypePosLimit;
    private final String liabCcy;
    private final String loanCoin;
    private final String mulitiper;
    private final String normalUserTypePosLimit;
    private final String notionalUsd;
    private final String quoteIsoLoanCoin;
    private final String sz;
    private final List<UserPositionInfoDebt> userPositionInfoDebtVoList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(UserPositionInfoDebt$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AccountTierData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.contractVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.normalUserTypePosLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.dmmUserTypePosLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UserPositionInfoDebt> component12() {
        return this.userPositionInfoDebtVoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.mulitiper;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.coinVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.notionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.loanCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.liabCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.baseIsoLoanCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.quoteIsoLoanCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountTierData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, List<UserPositionInfoDebt> list) {
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
        return new AccountTierData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountTierData)) {
            return false;
        }
        AccountTierData accountTierData = (AccountTierData) obj;
        return Intrinsics.EZpvd((Object) this.contractVal, (Object) accountTierData.contractVal) && Intrinsics.EZpvd((Object) this.sz, (Object) accountTierData.sz) && Intrinsics.EZpvd((Object) this.mulitiper, (Object) accountTierData.mulitiper) && Intrinsics.EZpvd((Object) this.coinVal, (Object) accountTierData.coinVal) && Intrinsics.EZpvd((Object) this.notionalUsd, (Object) accountTierData.notionalUsd) && Intrinsics.EZpvd((Object) this.loanCoin, (Object) accountTierData.loanCoin) && Intrinsics.EZpvd((Object) this.liabCcy, (Object) accountTierData.liabCcy) && Intrinsics.EZpvd((Object) this.baseIsoLoanCoin, (Object) accountTierData.baseIsoLoanCoin) && Intrinsics.EZpvd((Object) this.quoteIsoLoanCoin, (Object) accountTierData.quoteIsoLoanCoin) && Intrinsics.EZpvd((Object) this.normalUserTypePosLimit, (Object) accountTierData.normalUserTypePosLimit) && Intrinsics.EZpvd((Object) this.dmmUserTypePosLimit, (Object) accountTierData.dmmUserTypePosLimit) && Intrinsics.EZpvd(this.userPositionInfoDebtVoList, accountTierData.userPositionInfoDebtVoList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseIsoLoanCoin() {
        return this.baseIsoLoanCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinVal() {
        return this.coinVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractVal() {
        return this.contractVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDmmUserTypePosLimit() {
        return this.dmmUserTypePosLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiabCcy() {
        return this.liabCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLoanCoin() {
        return this.loanCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMulitiper() {
        return this.mulitiper;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNormalUserTypePosLimit() {
        return this.normalUserTypePosLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalUsd() {
        return this.notionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteIsoLoanCoin() {
        return this.quoteIsoLoanCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UserPositionInfoDebt> getUserPositionInfoDebtVoList() {
        return this.userPositionInfoDebtVoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.contractVal.hashCode();
        int iHashCode2 = this.sz.hashCode();
        int iHashCode3 = this.mulitiper.hashCode();
        int iHashCode4 = this.coinVal.hashCode();
        int iHashCode5 = this.notionalUsd.hashCode();
        int iHashCode6 = this.loanCoin.hashCode();
        int iHashCode7 = this.liabCcy.hashCode();
        int iHashCode8 = this.baseIsoLoanCoin.hashCode();
        int iHashCode9 = this.quoteIsoLoanCoin.hashCode();
        int iHashCode10 = this.normalUserTypePosLimit.hashCode();
        int iHashCode11 = this.dmmUserTypePosLimit.hashCode();
        List<UserPositionInfoDebt> list = this.userPositionInfoDebtVoList;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountTierData(contractVal=" + this.contractVal + ", sz=" + this.sz + ", mulitiper=" + this.mulitiper + ", coinVal=" + this.coinVal + ", notionalUsd=" + this.notionalUsd + ", loanCoin=" + this.loanCoin + ", liabCcy=" + this.liabCcy + ", baseIsoLoanCoin=" + this.baseIsoLoanCoin + ", quoteIsoLoanCoin=" + this.quoteIsoLoanCoin + ", normalUserTypePosLimit=" + this.normalUserTypePosLimit + ", dmmUserTypePosLimit=" + this.dmmUserTypePosLimit + ", userPositionInfoDebtVoList=" + this.userPositionInfoDebtVoList + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.AccountTierData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AccountTierData> serializer() {
            return AccountTierData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AccountTierData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.contractVal = "";
        } else {
            this.contractVal = str;
        }
        if ((i & 2) == 0) {
            this.sz = "";
        } else {
            this.sz = str2;
        }
        if ((i & 4) == 0) {
            this.mulitiper = "";
        } else {
            this.mulitiper = str3;
        }
        if ((i & 8) == 0) {
            this.coinVal = "";
        } else {
            this.coinVal = str4;
        }
        if ((i & 16) == 0) {
            this.notionalUsd = "";
        } else {
            this.notionalUsd = str5;
        }
        if ((i & 32) == 0) {
            this.loanCoin = "";
        } else {
            this.loanCoin = str6;
        }
        if ((i & 64) == 0) {
            this.liabCcy = "";
        } else {
            this.liabCcy = str7;
        }
        if ((i & 128) == 0) {
            this.baseIsoLoanCoin = "";
        } else {
            this.baseIsoLoanCoin = str8;
        }
        if ((i & 256) == 0) {
            this.quoteIsoLoanCoin = "";
        } else {
            this.quoteIsoLoanCoin = str9;
        }
        if ((i & 512) == 0) {
            this.normalUserTypePosLimit = "";
        } else {
            this.normalUserTypePosLimit = str10;
        }
        if ((i & 1024) == 0) {
            this.dmmUserTypePosLimit = "";
        } else {
            this.dmmUserTypePosLimit = str11;
        }
        if ((i & 2048) == 0) {
            this.userPositionInfoDebtVoList = null;
        } else {
            this.userPositionInfoDebtVoList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AccountTierData accountTierData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) accountTierData.contractVal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, accountTierData.contractVal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) accountTierData.sz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, accountTierData.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) accountTierData.mulitiper, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, accountTierData.mulitiper);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) accountTierData.coinVal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, accountTierData.coinVal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) accountTierData.notionalUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, accountTierData.notionalUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) accountTierData.loanCoin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, accountTierData.loanCoin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) accountTierData.liabCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, accountTierData.liabCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) accountTierData.baseIsoLoanCoin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, accountTierData.baseIsoLoanCoin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) accountTierData.quoteIsoLoanCoin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, accountTierData.quoteIsoLoanCoin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) accountTierData.normalUserTypePosLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, accountTierData.normalUserTypePosLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) accountTierData.dmmUserTypePosLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, accountTierData.dmmUserTypePosLimit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && accountTierData.userPositionInfoDebtVoList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], accountTierData.userPositionInfoDebtVoList);
    }

    public AccountTierData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, List<UserPositionInfoDebt> list) {
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
        this.contractVal = str;
        this.sz = str2;
        this.mulitiper = str3;
        this.coinVal = str4;
        this.notionalUsd = str5;
        this.loanCoin = str6;
        this.liabCcy = str7;
        this.baseIsoLoanCoin = str8;
        this.quoteIsoLoanCoin = str9;
        this.normalUserTypePosLimit = str10;
        this.dmmUserTypePosLimit = str11;
        this.userPositionInfoDebtVoList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0079: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r24v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0059: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r25v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.UserPositionInfoDebt>):void (m)] (LINE:30) call: com.okinc.unify_trade.biz.AccountTierData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ AccountTierData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) == 0 ? str11 : "", (i & 2048) != 0 ? null : list);
    }
}
