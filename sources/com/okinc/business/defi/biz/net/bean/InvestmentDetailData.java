package com.okinc.business.defi.biz.net.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class InvestmentDetailData {
    private final Integer investmentId;
    private final Boolean isSupportDeposit;
    private final Boolean isSupportRedeem;
    private final Boolean isSupportSwap;
    private final String platformItemKey;
    private final String platformLogo;
    private final String platformName;
    private final String platformUrl;
    private final List<QaItem> qaList;
    private final String rate;
    private final Integer tabId;
    private final String unlockDate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(QaItem$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestmentDetailData() {
        this((Integer) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 4095, (DefaultConstructorMarker) null);
    }

    @SerialName("investmentId")
    public static /* synthetic */ void getInvestmentId$annotations() {
    }

    @SerialName("platformItemKey")
    public static /* synthetic */ void getPlatformItemKey$annotations() {
    }

    @SerialName("platformLogo")
    public static /* synthetic */ void getPlatformLogo$annotations() {
    }

    @SerialName("platformName")
    public static /* synthetic */ void getPlatformName$annotations() {
    }

    @SerialName("platformUrl")
    public static /* synthetic */ void getPlatformUrl$annotations() {
    }

    @SerialName("qaList")
    public static /* synthetic */ void getQaList$annotations() {
    }

    @SerialName("rate")
    public static /* synthetic */ void getRate$annotations() {
    }

    @SerialName("tabId")
    public static /* synthetic */ void getTabId$annotations() {
    }

    @SerialName("unlockDate")
    public static /* synthetic */ void getUnlockDate$annotations() {
    }

    @SerialName("isSupportDeposit")
    public static /* synthetic */ void isSupportDeposit$annotations() {
    }

    @SerialName("isSupportRedeem")
    public static /* synthetic */ void isSupportRedeem$annotations() {
    }

    @SerialName("isSupportSwap")
    public static /* synthetic */ void isSupportSwap$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.unlockDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<QaItem> component12() {
        return this.qaList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.isSupportRedeem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.isSupportDeposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.isSupportSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.tabId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.platformItemKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.platformUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.platformLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestmentDetailData copy(Integer num, Boolean bool, Boolean bool2, Boolean bool3, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, List<QaItem> list) {
        return new InvestmentDetailData(num, bool, bool2, bool3, num2, str, str2, str3, str4, str5, str6, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestmentDetailData)) {
            return false;
        }
        InvestmentDetailData investmentDetailData = (InvestmentDetailData) obj;
        return Intrinsics.EZpvd(this.investmentId, investmentDetailData.investmentId) && Intrinsics.EZpvd(this.isSupportRedeem, investmentDetailData.isSupportRedeem) && Intrinsics.EZpvd(this.isSupportDeposit, investmentDetailData.isSupportDeposit) && Intrinsics.EZpvd(this.isSupportSwap, investmentDetailData.isSupportSwap) && Intrinsics.EZpvd(this.tabId, investmentDetailData.tabId) && Intrinsics.EZpvd((Object) this.platformName, (Object) investmentDetailData.platformName) && Intrinsics.EZpvd((Object) this.platformItemKey, (Object) investmentDetailData.platformItemKey) && Intrinsics.EZpvd((Object) this.platformUrl, (Object) investmentDetailData.platformUrl) && Intrinsics.EZpvd((Object) this.platformLogo, (Object) investmentDetailData.platformLogo) && Intrinsics.EZpvd((Object) this.rate, (Object) investmentDetailData.rate) && Intrinsics.EZpvd((Object) this.unlockDate, (Object) investmentDetailData.unlockDate) && Intrinsics.EZpvd(this.qaList, investmentDetailData.qaList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getInvestmentId() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformItemKey() {
        return this.platformItemKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformLogo() {
        return this.platformLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformName() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformUrl() {
        return this.platformUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<QaItem> getQaList() {
        return this.qaList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRate() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTabId() {
        return this.tabId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnlockDate() {
        return this.unlockDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.investmentId;
        int iHashCode = num == null ? 0 : num.hashCode();
        Boolean bool = this.isSupportRedeem;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.isSupportDeposit;
        int iHashCode3 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.isSupportSwap;
        int iHashCode4 = bool3 == null ? 0 : bool3.hashCode();
        Integer num2 = this.tabId;
        int iHashCode5 = num2 == null ? 0 : num2.hashCode();
        String str = this.platformName;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.platformItemKey;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.platformUrl;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.platformLogo;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.rate;
        int iHashCode10 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.unlockDate;
        int iHashCode11 = str6 == null ? 0 : str6.hashCode();
        List<QaItem> list = this.qaList;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isSupportDeposit() {
        return this.isSupportDeposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isSupportRedeem() {
        return this.isSupportRedeem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isSupportSwap() {
        return this.isSupportSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestmentDetailData(investmentId=" + this.investmentId + ", isSupportRedeem=" + this.isSupportRedeem + ", isSupportDeposit=" + this.isSupportDeposit + ", isSupportSwap=" + this.isSupportSwap + ", tabId=" + this.tabId + ", platformName=" + this.platformName + ", platformItemKey=" + this.platformItemKey + ", platformUrl=" + this.platformUrl + ", platformLogo=" + this.platformLogo + ", rate=" + this.rate + ", unlockDate=" + this.unlockDate + ", qaList=" + this.qaList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.InvestmentDetailData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestmentDetailData> serializer() {
            return InvestmentDetailData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestmentDetailData(int i, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.investmentId = null;
        } else {
            this.investmentId = num;
        }
        if ((i & 2) == 0) {
            this.isSupportRedeem = null;
        } else {
            this.isSupportRedeem = bool;
        }
        if ((i & 4) == 0) {
            this.isSupportDeposit = null;
        } else {
            this.isSupportDeposit = bool2;
        }
        if ((i & 8) == 0) {
            this.isSupportSwap = null;
        } else {
            this.isSupportSwap = bool3;
        }
        if ((i & 16) == 0) {
            this.tabId = null;
        } else {
            this.tabId = num2;
        }
        if ((i & 32) == 0) {
            this.platformName = null;
        } else {
            this.platformName = str;
        }
        if ((i & 64) == 0) {
            this.platformItemKey = null;
        } else {
            this.platformItemKey = str2;
        }
        if ((i & 128) == 0) {
            this.platformUrl = null;
        } else {
            this.platformUrl = str3;
        }
        if ((i & 256) == 0) {
            this.platformLogo = null;
        } else {
            this.platformLogo = str4;
        }
        if ((i & 512) == 0) {
            this.rate = null;
        } else {
            this.rate = str5;
        }
        if ((i & 1024) == 0) {
            this.unlockDate = null;
        } else {
            this.unlockDate = str6;
        }
        if ((i & 2048) == 0) {
            this.qaList = null;
        } else {
            this.qaList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(InvestmentDetailData investmentDetailData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investmentDetailData.investmentId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, investmentDetailData.investmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investmentDetailData.isSupportRedeem != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, investmentDetailData.isSupportRedeem);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investmentDetailData.isSupportDeposit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, investmentDetailData.isSupportDeposit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investmentDetailData.isSupportSwap != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, investmentDetailData.isSupportSwap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investmentDetailData.tabId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, investmentDetailData.tabId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investmentDetailData.platformName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, investmentDetailData.platformName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || investmentDetailData.platformItemKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, investmentDetailData.platformItemKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || investmentDetailData.platformUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, investmentDetailData.platformUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || investmentDetailData.platformLogo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, investmentDetailData.platformLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || investmentDetailData.rate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, investmentDetailData.rate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || investmentDetailData.unlockDate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, investmentDetailData.unlockDate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && investmentDetailData.qaList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], investmentDetailData.qaList);
    }

    public InvestmentDetailData(Integer num, Boolean bool, Boolean bool2, Boolean bool3, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, List<QaItem> list) {
        this.investmentId = num;
        this.isSupportRedeem = bool;
        this.isSupportDeposit = bool2;
        this.isSupportSwap = bool3;
        this.tabId = num2;
        this.platformName = str;
        this.platformItemKey = str2;
        this.platformUrl = str3;
        this.platformLogo = str4;
        this.rate = str5;
        this.unlockDate = str6;
        this.qaList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0078: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r14v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r15v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r16v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0019: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r17v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0021: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r18v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0059: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.util.List) : (null java.util.List))
 A[MD:(java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.defi.biz.net.bean.QaItem>):void (m)] (LINE:12) call: com.okinc.business.defi.biz.net.bean.InvestmentDetailData.<init>(java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ InvestmentDetailData(Integer num, Boolean bool, Boolean bool2, Boolean bool3, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : str6, (i & 2048) == 0 ? list : null);
    }
}
