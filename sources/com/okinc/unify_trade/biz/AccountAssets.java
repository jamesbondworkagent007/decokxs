package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class AccountAssets {
    private final String accountGrade;
    private String legalTenderTotalValuation;
    private String totalValuation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AccountAssets() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AccountAssets copy$default(AccountAssets accountAssets, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountAssets.totalValuation;
        }
        if ((i & 2) != 0) {
            str2 = accountAssets.legalTenderTotalValuation;
        }
        if ((i & 4) != 0) {
            str3 = accountAssets.accountGrade;
        }
        return accountAssets.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.totalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.legalTenderTotalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.accountGrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountAssets copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new AccountAssets(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountAssets)) {
            return false;
        }
        AccountAssets accountAssets = (AccountAssets) obj;
        return Intrinsics.EZpvd((Object) this.totalValuation, (Object) accountAssets.totalValuation) && Intrinsics.EZpvd((Object) this.legalTenderTotalValuation, (Object) accountAssets.legalTenderTotalValuation) && Intrinsics.EZpvd((Object) this.accountGrade, (Object) accountAssets.accountGrade);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountGrade() {
        return this.accountGrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLegalTenderTotalValuation() {
        return this.legalTenderTotalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalValuation() {
        return this.totalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.totalValuation.hashCode() * 31) + this.legalTenderTotalValuation.hashCode()) * 31) + this.accountGrade.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLegalTenderTotalValuation(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.legalTenderTotalValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalValuation(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountAssets(totalValuation=" + this.totalValuation + ", legalTenderTotalValuation=" + this.legalTenderTotalValuation + ", accountGrade=" + this.accountGrade + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.AccountAssets.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AccountAssets> serializer() {
            return AccountAssets$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AccountAssets(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.totalValuation = "";
        } else {
            this.totalValuation = str;
        }
        if ((i & 2) == 0) {
            this.legalTenderTotalValuation = "";
        } else {
            this.legalTenderTotalValuation = str2;
        }
        if ((i & 4) == 0) {
            this.accountGrade = "";
        } else {
            this.accountGrade = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AccountAssets accountAssets, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) accountAssets.totalValuation, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, accountAssets.totalValuation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) accountAssets.legalTenderTotalValuation, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, accountAssets.legalTenderTotalValuation);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) accountAssets.accountGrade, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, accountAssets.accountGrade);
    }

    public AccountAssets(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.totalValuation = str;
        this.legalTenderTotalValuation = str2;
        this.accountGrade = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1043) call: com.okinc.unify_trade.biz.AccountAssets.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AccountAssets(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
