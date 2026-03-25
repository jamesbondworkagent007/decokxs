package com.okinc.okex.lite.earn.bean;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.ReferenceArraySerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56524yIo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class EarnTopOfferBean {
    private String amountToDepositToInvest;
    private String apy;
    private EarnCurrency currency;
    private String expectedEarningsFiat;
    private Integer[] labels;
    private boolean migrationBlocked;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ReferenceArraySerializer(C56524yIo.AEQbTJ(Integer.class), IntSerializer.INSTANCE), null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EarnTopOfferBean() {
        this((EarnCurrency) null, (Integer[]) null, (String) null, (String) null, (String) null, false, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EarnTopOfferBean copy$default(EarnTopOfferBean earnTopOfferBean, EarnCurrency earnCurrency, Integer[] numArr, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            earnCurrency = earnTopOfferBean.currency;
        }
        if ((i & 2) != 0) {
            numArr = earnTopOfferBean.labels;
        }
        Integer[] numArr2 = numArr;
        if ((i & 4) != 0) {
            str = earnTopOfferBean.apy;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = earnTopOfferBean.expectedEarningsFiat;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = earnTopOfferBean.amountToDepositToInvest;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            z = earnTopOfferBean.migrationBlocked;
        }
        return earnTopOfferBean.copy(earnCurrency, numArr2, str4, str5, str6, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnCurrency component1() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer[] component2() {
        return this.labels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.apy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.expectedEarningsFiat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.amountToDepositToInvest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.migrationBlocked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnTopOfferBean copy(@NotNull EarnCurrency earnCurrency, Integer[] numArr, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(earnCurrency, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new EarnTopOfferBean(earnCurrency, numArr, str, str2, str3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarnTopOfferBean)) {
            return false;
        }
        EarnTopOfferBean earnTopOfferBean = (EarnTopOfferBean) obj;
        return Intrinsics.EZpvd(this.currency, earnTopOfferBean.currency) && Intrinsics.EZpvd(this.labels, earnTopOfferBean.labels) && Intrinsics.EZpvd((Object) this.apy, (Object) earnTopOfferBean.apy) && Intrinsics.EZpvd((Object) this.expectedEarningsFiat, (Object) earnTopOfferBean.expectedEarningsFiat) && Intrinsics.EZpvd((Object) this.amountToDepositToInvest, (Object) earnTopOfferBean.amountToDepositToInvest) && this.migrationBlocked == earnTopOfferBean.migrationBlocked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmountToDepositToInvest() {
        return this.amountToDepositToInvest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApy() {
        return this.apy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnCurrency getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpectedEarningsFiat() {
        return this.expectedEarningsFiat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer[] getLabels() {
        return this.labels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMigrationBlocked() {
        return this.migrationBlocked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.currency.hashCode();
        Integer[] numArr = this.labels;
        return (((((((((iHashCode * 31) + (numArr == null ? 0 : Arrays.hashCode(numArr))) * 31) + this.apy.hashCode()) * 31) + this.expectedEarningsFiat.hashCode()) * 31) + this.amountToDepositToInvest.hashCode()) * 31) + Boolean.hashCode(this.migrationBlocked);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmountToDepositToInvest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amountToDepositToInvest = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.apy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrency(@NotNull EarnCurrency earnCurrency) {
        Intrinsics.checkNotNullParameter(earnCurrency, "");
        this.currency = earnCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpectedEarningsFiat(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.expectedEarningsFiat = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLabels(Integer[] numArr) {
        this.labels = numArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMigrationBlocked(boolean z) {
        this.migrationBlocked = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EarnTopOfferBean(currency=" + this.currency + ", labels=" + Arrays.toString(this.labels) + ", apy=" + this.apy + ", expectedEarningsFiat=" + this.expectedEarningsFiat + ", amountToDepositToInvest=" + this.amountToDepositToInvest + ", migrationBlocked=" + this.migrationBlocked + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.earn.bean.EarnTopOfferBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EarnTopOfferBean> serializer() {
            return EarnTopOfferBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EarnTopOfferBean(int i, EarnCurrency earnCurrency, Integer[] numArr, String str, String str2, String str3, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        this.currency = (i & 1) == 0 ? new EarnCurrency(0L, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : earnCurrency;
        if ((i & 2) == 0) {
            this.labels = null;
        } else {
            this.labels = numArr;
        }
        this.apy = (i & 4) == 0 ? "0" : str;
        if ((i & 8) == 0) {
            this.expectedEarningsFiat = "";
        } else {
            this.expectedEarningsFiat = str2;
        }
        if ((i & 16) == 0) {
            this.amountToDepositToInvest = "";
        } else {
            this.amountToDepositToInvest = str3;
        }
        this.migrationBlocked = (i & 32) == 0 ? false : z;
    }

    public static final /* synthetic */ void write$Self$OKFinance_finance_api(EarnTopOfferBean earnTopOfferBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(earnTopOfferBean.currency, new EarnCurrency(0L, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, EarnCurrency$$serializer.INSTANCE, earnTopOfferBean.currency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || earnTopOfferBean.labels != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], earnTopOfferBean.labels);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) earnTopOfferBean.apy, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, earnTopOfferBean.apy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) earnTopOfferBean.expectedEarningsFiat, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, earnTopOfferBean.expectedEarningsFiat);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) earnTopOfferBean.amountToDepositToInvest, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, earnTopOfferBean.amountToDepositToInvest);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || earnTopOfferBean.migrationBlocked) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, earnTopOfferBean.migrationBlocked);
        }
    }

    public EarnTopOfferBean(@NotNull EarnCurrency earnCurrency, Integer[] numArr, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(earnCurrency, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.currency = earnCurrency;
        this.labels = numArr;
        this.apy = str;
        this.expectedEarningsFiat = str2;
        this.amountToDepositToInvest = str3;
        this.migrationBlocked = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0041: CONSTRUCTOR 
  (wrap:com.okinc.okex.lite.earn.bean.EarnCurrency:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000f: CONSTRUCTOR 
  (0 long)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:34) call: com.okinc.okex.lite.earn.bean.EarnCurrency.<init>(long, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r10v0 com.okinc.okex.lite.earn.bean.EarnCurrency))
  (wrap:java.lang.Integer[]:?: TERNARY null = ((wrap:int:0x0014: ARITH (r16v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer[]) : (r11v0 java.lang.Integer[]))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r16v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("0") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r16v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r14v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0032: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
 A[MD:(com.okinc.okex.lite.earn.bean.EarnCurrency, java.lang.Integer[], java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:33) call: com.okinc.okex.lite.earn.bean.EarnTopOfferBean.<init>(com.okinc.okex.lite.earn.bean.EarnCurrency, java.lang.Integer[], java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ EarnTopOfferBean(EarnCurrency earnCurrency, Integer[] numArr, String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new EarnCurrency(0L, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : earnCurrency, (i & 2) != 0 ? null : numArr, (i & 4) != 0 ? "0" : str, (i & 8) != 0 ? "" : str2, (i & 16) == 0 ? str3 : "", (i & 32) != 0 ? false : z);
    }
}
