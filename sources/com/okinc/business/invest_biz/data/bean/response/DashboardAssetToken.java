package com.okinc.business.invest_biz.data.bean.response;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class DashboardAssetToken {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String currencyAmount;
    public final String tokenAddress;
    public final String tokenAmount;
    public final int tokenDecimal;
    public final String tokenLogo;
    public final String tokenSymbol;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DashboardAssetToken() {
        this((String) null, (String) null, (String) null, 0, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DashboardAssetToken copy$default(DashboardAssetToken dashboardAssetToken, String str, String str2, String str3, int i, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dashboardAssetToken.tokenAddress;
        }
        if ((i2 & 2) != 0) {
            str2 = dashboardAssetToken.currencyAmount;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = dashboardAssetToken.tokenAmount;
        }
        String str7 = str3;
        if ((i2 & 8) != 0) {
            i = dashboardAssetToken.tokenDecimal;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str4 = dashboardAssetToken.tokenLogo;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            str5 = dashboardAssetToken.tokenSymbol;
        }
        return dashboardAssetToken.EZpvd(str, str6, str7, i3, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DashboardAssetToken EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new DashboardAssetToken(str, str2, str3, i, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DashboardAssetToken)) {
            return false;
        }
        DashboardAssetToken dashboardAssetToken = (DashboardAssetToken) obj;
        return Intrinsics.EZpvd((Object) this.tokenAddress, (Object) dashboardAssetToken.tokenAddress) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) dashboardAssetToken.currencyAmount) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) dashboardAssetToken.tokenAmount) && this.tokenDecimal == dashboardAssetToken.tokenDecimal && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) dashboardAssetToken.tokenLogo) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) dashboardAssetToken.tokenSymbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.tokenAddress.hashCode() * 31) + this.currencyAmount.hashCode()) * 31) + this.tokenAmount.hashCode()) * 31) + Integer.hashCode(this.tokenDecimal)) * 31) + this.tokenLogo.hashCode()) * 31) + this.tokenSymbol.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DashboardAssetToken(tokenAddress=" + this.tokenAddress + ", currencyAmount=" + this.currencyAmount + ", tokenAmount=" + this.tokenAmount + ", tokenDecimal=" + this.tokenDecimal + ", tokenLogo=" + this.tokenLogo + ", tokenSymbol=" + this.tokenSymbol + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.response.DashboardAssetToken.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DashboardAssetToken> serializer() {
            return DashboardAssetToken$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DashboardAssetToken(int i, String str, String str2, String str3, int i2, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str;
        }
        if ((i & 2) == 0) {
            this.currencyAmount = "";
        } else {
            this.currencyAmount = str2;
        }
        if ((i & 4) == 0) {
            this.tokenAmount = "";
        } else {
            this.tokenAmount = str3;
        }
        if ((i & 8) == 0) {
            this.tokenDecimal = 0;
        } else {
            this.tokenDecimal = i2;
        }
        if ((i & 16) == 0) {
            this.tokenLogo = "";
        } else {
            this.tokenLogo = str4;
        }
        if ((i & 32) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str5;
        }
    }

    public static final /* synthetic */ void OLrzqt(DashboardAssetToken dashboardAssetToken, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dashboardAssetToken.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dashboardAssetToken.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dashboardAssetToken.currencyAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dashboardAssetToken.currencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dashboardAssetToken.tokenAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dashboardAssetToken.tokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || dashboardAssetToken.tokenDecimal != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, dashboardAssetToken.tokenDecimal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) dashboardAssetToken.tokenLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, dashboardAssetToken.tokenLogo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) dashboardAssetToken.tokenSymbol, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, dashboardAssetToken.tokenSymbol);
    }

    public DashboardAssetToken(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.tokenAddress = str;
        this.currencyAmount = str2;
        this.tokenAmount = str3;
        this.tokenDecimal = i;
        this.tokenLogo = str4;
        this.tokenSymbol = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:int:0x001c: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r9v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String):void (m)] (LINE:85) call: com.okinc.business.invest_biz.data.bean.response.DashboardAssetToken.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DashboardAssetToken(String str, String str2, String str3, int i, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5);
    }
}
