package com.okinc.crcore.coreapi.net.responsebean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class BusinessSupportResponseBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String coin;
    private final String coinPair;
    private final String supportBuySell;
    private final String supportDeposit;
    private final String supportOrderbook;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BusinessSupportResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BusinessSupportResponseBean copy$default(BusinessSupportResponseBean businessSupportResponseBean, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = businessSupportResponseBean.coin;
        }
        if ((i & 2) != 0) {
            str2 = businessSupportResponseBean.supportDeposit;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = businessSupportResponseBean.supportBuySell;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = businessSupportResponseBean.supportOrderbook;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = businessSupportResponseBean.coinPair;
        }
        return businessSupportResponseBean.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.coin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.supportDeposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.supportBuySell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.supportOrderbook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.coinPair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BusinessSupportResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new BusinessSupportResponseBean(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusinessSupportResponseBean)) {
            return false;
        }
        BusinessSupportResponseBean businessSupportResponseBean = (BusinessSupportResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.coin, (Object) businessSupportResponseBean.coin) && Intrinsics.EZpvd((Object) this.supportDeposit, (Object) businessSupportResponseBean.supportDeposit) && Intrinsics.EZpvd((Object) this.supportBuySell, (Object) businessSupportResponseBean.supportBuySell) && Intrinsics.EZpvd((Object) this.supportOrderbook, (Object) businessSupportResponseBean.supportOrderbook) && Intrinsics.EZpvd((Object) this.coinPair, (Object) businessSupportResponseBean.coinPair);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoin() {
        return this.coin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinPair() {
        return this.coinPair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSupportBuySell() {
        return this.supportBuySell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSupportDeposit() {
        return this.supportDeposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSupportOrderbook() {
        return this.supportOrderbook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.coin.hashCode() * 31) + this.supportDeposit.hashCode()) * 31) + this.supportBuySell.hashCode()) * 31) + this.supportOrderbook.hashCode()) * 31) + this.coinPair.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BusinessSupportResponseBean(coin=" + this.coin + ", supportDeposit=" + this.supportDeposit + ", supportBuySell=" + this.supportBuySell + ", supportOrderbook=" + this.supportOrderbook + ", coinPair=" + this.coinPair + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.BusinessSupportResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BusinessSupportResponseBean> serializer() {
            return BusinessSupportResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BusinessSupportResponseBean(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.coin = "";
        } else {
            this.coin = str;
        }
        if ((i & 2) == 0) {
            this.supportDeposit = "";
        } else {
            this.supportDeposit = str2;
        }
        if ((i & 4) == 0) {
            this.supportBuySell = "";
        } else {
            this.supportBuySell = str3;
        }
        if ((i & 8) == 0) {
            this.supportOrderbook = "";
        } else {
            this.supportOrderbook = str4;
        }
        if ((i & 16) == 0) {
            this.coinPair = "";
        } else {
            this.coinPair = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(BusinessSupportResponseBean businessSupportResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) businessSupportResponseBean.coin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, businessSupportResponseBean.coin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) businessSupportResponseBean.supportDeposit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, businessSupportResponseBean.supportDeposit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) businessSupportResponseBean.supportBuySell, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, businessSupportResponseBean.supportBuySell);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) businessSupportResponseBean.supportOrderbook, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, businessSupportResponseBean.supportOrderbook);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) businessSupportResponseBean.coinPair, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, businessSupportResponseBean.coinPair);
    }

    public BusinessSupportResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.coin = str;
        this.supportDeposit = str2;
        this.supportBuySell = str3;
        this.supportOrderbook = str4;
        this.coinPair = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:10) call: com.okinc.crcore.coreapi.net.responsebean.BusinessSupportResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BusinessSupportResponseBean(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
