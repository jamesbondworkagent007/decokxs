package com.okinc.okex.lite.earn.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CurrencyProjectBean {
    private String currencyFullName;
    private String currencyIcon;
    private int currencyId;
    private String currencyName;
    private String currencyNum;
    private String earnPercentage;
    private EarnPercentageNum earnPercentageNum;
    private String rateRangeMax;
    private String rateRangeMaxCompar;
    private String rateRangeMin;
    private String termAll;
    private String valuation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CurrencyProjectBean() {
        this((String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (EarnPercentageNum) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.currencyFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnPercentageNum component10() {
        return this.earnPercentageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.termAll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.valuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.currencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.currencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.currencyNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.rateRangeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.rateRangeMaxCompar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.rateRangeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.earnPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrencyProjectBean copy(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, EarnPercentageNum earnPercentageNum, @NotNull String str9, @NotNull String str10) {
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
        return new CurrencyProjectBean(str, str2, i, str3, str4, str5, str6, str7, str8, earnPercentageNum, str9, str10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrencyProjectBean)) {
            return false;
        }
        CurrencyProjectBean currencyProjectBean = (CurrencyProjectBean) obj;
        return Intrinsics.EZpvd((Object) this.currencyFullName, (Object) currencyProjectBean.currencyFullName) && Intrinsics.EZpvd((Object) this.currencyIcon, (Object) currencyProjectBean.currencyIcon) && this.currencyId == currencyProjectBean.currencyId && Intrinsics.EZpvd((Object) this.currencyName, (Object) currencyProjectBean.currencyName) && Intrinsics.EZpvd((Object) this.currencyNum, (Object) currencyProjectBean.currencyNum) && Intrinsics.EZpvd((Object) this.rateRangeMax, (Object) currencyProjectBean.rateRangeMax) && Intrinsics.EZpvd((Object) this.rateRangeMaxCompar, (Object) currencyProjectBean.rateRangeMaxCompar) && Intrinsics.EZpvd((Object) this.rateRangeMin, (Object) currencyProjectBean.rateRangeMin) && Intrinsics.EZpvd((Object) this.earnPercentage, (Object) currencyProjectBean.earnPercentage) && Intrinsics.EZpvd(this.earnPercentageNum, currencyProjectBean.earnPercentageNum) && Intrinsics.EZpvd((Object) this.termAll, (Object) currencyProjectBean.termAll) && Intrinsics.EZpvd((Object) this.valuation, (Object) currencyProjectBean.valuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyFullName() {
        return this.currencyFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyIcon() {
        return this.currencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyNum() {
        return this.currencyNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarnPercentage() {
        return this.earnPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnPercentageNum getEarnPercentageNum() {
        return this.earnPercentageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRateRangeMax() {
        return this.rateRangeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRateRangeMaxCompar() {
        return this.rateRangeMaxCompar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRateRangeMin() {
        return this.rateRangeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTermAll() {
        return this.termAll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuation() {
        return this.valuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.currencyFullName.hashCode();
        int iHashCode2 = this.currencyIcon.hashCode();
        int iHashCode3 = Integer.hashCode(this.currencyId);
        int iHashCode4 = this.currencyName.hashCode();
        int iHashCode5 = this.currencyNum.hashCode();
        int iHashCode6 = this.rateRangeMax.hashCode();
        int iHashCode7 = this.rateRangeMaxCompar.hashCode();
        int iHashCode8 = this.rateRangeMin.hashCode();
        int iHashCode9 = this.earnPercentage.hashCode();
        EarnPercentageNum earnPercentageNum = this.earnPercentageNum;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (earnPercentageNum == null ? 0 : earnPercentageNum.hashCode())) * 31) + this.termAll.hashCode()) * 31) + this.valuation.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyFullName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currencyFullName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currencyIcon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(int i) {
        this.currencyId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currencyName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyNum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currencyNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarnPercentage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.earnPercentage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarnPercentageNum(EarnPercentageNum earnPercentageNum) {
        this.earnPercentageNum = earnPercentageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRateRangeMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rateRangeMax = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRateRangeMaxCompar(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rateRangeMaxCompar = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRateRangeMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rateRangeMin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTermAll(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.termAll = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValuation(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CurrencyProjectBean(currencyFullName=" + this.currencyFullName + ", currencyIcon=" + this.currencyIcon + ", currencyId=" + this.currencyId + ", currencyName=" + this.currencyName + ", currencyNum=" + this.currencyNum + ", rateRangeMax=" + this.rateRangeMax + ", rateRangeMaxCompar=" + this.rateRangeMaxCompar + ", rateRangeMin=" + this.rateRangeMin + ", earnPercentage=" + this.earnPercentage + ", earnPercentageNum=" + this.earnPercentageNum + ", termAll=" + this.termAll + ", valuation=" + this.valuation + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.earn.bean.CurrencyProjectBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CurrencyProjectBean> serializer() {
            return CurrencyProjectBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CurrencyProjectBean(int i, String str, String str2, int i2, String str3, String str4, String str5, String str6, String str7, String str8, EarnPercentageNum earnPercentageNum, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.currencyFullName = "";
        } else {
            this.currencyFullName = str;
        }
        if ((i & 2) == 0) {
            this.currencyIcon = "";
        } else {
            this.currencyIcon = str2;
        }
        if ((i & 4) == 0) {
            this.currencyId = 0;
        } else {
            this.currencyId = i2;
        }
        if ((i & 8) == 0) {
            this.currencyName = "";
        } else {
            this.currencyName = str3;
        }
        if ((i & 16) == 0) {
            this.currencyNum = "";
        } else {
            this.currencyNum = str4;
        }
        if ((i & 32) == 0) {
            this.rateRangeMax = "";
        } else {
            this.rateRangeMax = str5;
        }
        if ((i & 64) == 0) {
            this.rateRangeMaxCompar = "";
        } else {
            this.rateRangeMaxCompar = str6;
        }
        if ((i & 128) == 0) {
            this.rateRangeMin = "";
        } else {
            this.rateRangeMin = str7;
        }
        if ((i & 256) == 0) {
            this.earnPercentage = "";
        } else {
            this.earnPercentage = str8;
        }
        if ((i & 512) == 0) {
            this.earnPercentageNum = null;
        } else {
            this.earnPercentageNum = earnPercentageNum;
        }
        if ((i & 1024) == 0) {
            this.termAll = "";
        } else {
            this.termAll = str9;
        }
        if ((i & 2048) == 0) {
            this.valuation = "";
        } else {
            this.valuation = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKFinance_finance_api(CurrencyProjectBean currencyProjectBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) currencyProjectBean.currencyFullName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, currencyProjectBean.currencyFullName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) currencyProjectBean.currencyIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, currencyProjectBean.currencyIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || currencyProjectBean.currencyId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, currencyProjectBean.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) currencyProjectBean.currencyName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, currencyProjectBean.currencyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) currencyProjectBean.currencyNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, currencyProjectBean.currencyNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) currencyProjectBean.rateRangeMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, currencyProjectBean.rateRangeMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) currencyProjectBean.rateRangeMaxCompar, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, currencyProjectBean.rateRangeMaxCompar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) currencyProjectBean.rateRangeMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, currencyProjectBean.rateRangeMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) currencyProjectBean.earnPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, currencyProjectBean.earnPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || currencyProjectBean.earnPercentageNum != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, EarnPercentageNum$$serializer.INSTANCE, currencyProjectBean.earnPercentageNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) currencyProjectBean.termAll, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, currencyProjectBean.termAll);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && Intrinsics.EZpvd((Object) currencyProjectBean.valuation, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 11, currencyProjectBean.valuation);
    }

    public CurrencyProjectBean(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, EarnPercentageNum earnPercentageNum, @NotNull String str9, @NotNull String str10) {
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
        this.currencyFullName = str;
        this.currencyIcon = str2;
        this.currencyId = i;
        this.currencyName = str3;
        this.currencyNum = str4;
        this.rateRangeMax = str5;
        this.rateRangeMaxCompar = str6;
        this.rateRangeMin = str7;
        this.earnPercentage = str8;
        this.earnPercentageNum = earnPercentageNum;
        this.termAll = str9;
        this.valuation = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0079: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0012: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r16v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:com.okinc.okex.lite.earn.bean.EarnPercentageNum:?: TERNARY null = ((wrap:int:0x004a: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.lite.earn.bean.EarnPercentageNum) : (r23v0 com.okinc.okex.lite.earn.bean.EarnPercentageNum))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okex.lite.earn.bean.EarnPercentageNum, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.okex.lite.earn.bean.CurrencyProjectBean.<init>(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okex.lite.earn.bean.EarnPercentageNum, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CurrencyProjectBean(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, EarnPercentageNum earnPercentageNum, String str9, String str10, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? "" : str7, (i2 & 256) != 0 ? "" : str8, (i2 & 512) != 0 ? null : earnPercentageNum, (i2 & 1024) != 0 ? "" : str9, (i2 & 2048) == 0 ? str10 : "");
    }
}
