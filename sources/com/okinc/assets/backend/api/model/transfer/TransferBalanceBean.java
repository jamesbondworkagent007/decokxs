package com.okinc.assets.backend.api.model.transfer;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class TransferBalanceBean {
    private String balance;
    private String currency;
    private int currencyId;
    private String fullName;
    private String icon;
    private String valuation;
    private String valuationSymbol;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransferBalanceBean() {
        this(0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TransferBalanceBean copy$default(TransferBalanceBean transferBalanceBean, int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = transferBalanceBean.currencyId;
        }
        if ((i2 & 2) != 0) {
            str = transferBalanceBean.balance;
        }
        String str7 = str;
        if ((i2 & 4) != 0) {
            str2 = transferBalanceBean.currency;
        }
        String str8 = str2;
        if ((i2 & 8) != 0) {
            str3 = transferBalanceBean.icon;
        }
        String str9 = str3;
        if ((i2 & 16) != 0) {
            str4 = transferBalanceBean.fullName;
        }
        String str10 = str4;
        if ((i2 & 32) != 0) {
            str5 = transferBalanceBean.valuation;
        }
        String str11 = str5;
        if ((i2 & 64) != 0) {
            str6 = transferBalanceBean.valuationSymbol;
        }
        return transferBalanceBean.copy(i, str7, str8, str9, str10, str11, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.valuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.valuationSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransferBalanceBean copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new TransferBalanceBean(i, str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferBalanceBean)) {
            return false;
        }
        TransferBalanceBean transferBalanceBean = (TransferBalanceBean) obj;
        return this.currencyId == transferBalanceBean.currencyId && Intrinsics.EZpvd((Object) this.balance, (Object) transferBalanceBean.balance) && Intrinsics.EZpvd((Object) this.currency, (Object) transferBalanceBean.currency) && Intrinsics.EZpvd((Object) this.icon, (Object) transferBalanceBean.icon) && Intrinsics.EZpvd((Object) this.fullName, (Object) transferBalanceBean.fullName) && Intrinsics.EZpvd((Object) this.valuation, (Object) transferBalanceBean.valuation) && Intrinsics.EZpvd((Object) this.valuationSymbol, (Object) transferBalanceBean.valuationSymbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalance() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuation() {
        return this.valuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuationSymbol() {
        return this.valuationSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((Integer.hashCode(this.currencyId) * 31) + this.balance.hashCode()) * 31) + this.currency.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.fullName.hashCode()) * 31) + this.valuation.hashCode()) * 31) + this.valuationSymbol.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBalance(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.balance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(int i) {
        this.currencyId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFullName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fullName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.icon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValuation(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValuationSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valuationSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransferBalanceBean(currencyId=" + this.currencyId + ", balance=" + this.balance + ", currency=" + this.currency + ", icon=" + this.icon + ", fullName=" + this.fullName + ", valuation=" + this.valuation + ", valuationSymbol=" + this.valuationSymbol + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.transfer.TransferBalanceBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TransferBalanceBean> serializer() {
            return TransferBalanceBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TransferBalanceBean(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        this.currencyId = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.balance = "";
        } else {
            this.balance = str;
        }
        if ((i & 4) == 0) {
            this.currency = "";
        } else {
            this.currency = str2;
        }
        if ((i & 8) == 0) {
            this.icon = "";
        } else {
            this.icon = str3;
        }
        if ((i & 16) == 0) {
            this.fullName = "";
        } else {
            this.fullName = str4;
        }
        if ((i & 32) == 0) {
            this.valuation = "";
        } else {
            this.valuation = str5;
        }
        if ((i & 64) == 0) {
            this.valuationSymbol = "";
        } else {
            this.valuationSymbol = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(TransferBalanceBean transferBalanceBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || transferBalanceBean.currencyId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, transferBalanceBean.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) transferBalanceBean.balance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, transferBalanceBean.balance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) transferBalanceBean.currency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, transferBalanceBean.currency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) transferBalanceBean.icon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, transferBalanceBean.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) transferBalanceBean.fullName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, transferBalanceBean.fullName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) transferBalanceBean.valuation, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, transferBalanceBean.valuation);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) transferBalanceBean.valuationSymbol, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, transferBalanceBean.valuationSymbol);
    }

    public TransferBalanceBean(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.currencyId = i;
        this.balance = str;
        this.currency = str2;
        this.icon = str3;
        this.fullName = str4;
        this.valuation = str5;
        this.valuationSymbol = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r6v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r13v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r12v0 java.lang.String) : (""))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.assets.backend.api.model.transfer.TransferBalanceBean.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TransferBalanceBean(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) == 0 ? str6 : "");
    }
}
