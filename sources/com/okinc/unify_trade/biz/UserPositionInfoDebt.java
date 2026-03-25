package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class UserPositionInfoDebt {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String isoLoanCoin;
    private final String liabCcy;
    private final String loanCoin;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UserPositionInfoDebt() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UserPositionInfoDebt copy$default(UserPositionInfoDebt userPositionInfoDebt, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userPositionInfoDebt.liabCcy;
        }
        if ((i & 2) != 0) {
            str2 = userPositionInfoDebt.loanCoin;
        }
        if ((i & 4) != 0) {
            str3 = userPositionInfoDebt.isoLoanCoin;
        }
        return userPositionInfoDebt.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.liabCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.loanCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.isoLoanCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserPositionInfoDebt copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new UserPositionInfoDebt(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserPositionInfoDebt)) {
            return false;
        }
        UserPositionInfoDebt userPositionInfoDebt = (UserPositionInfoDebt) obj;
        return Intrinsics.EZpvd((Object) this.liabCcy, (Object) userPositionInfoDebt.liabCcy) && Intrinsics.EZpvd((Object) this.loanCoin, (Object) userPositionInfoDebt.loanCoin) && Intrinsics.EZpvd((Object) this.isoLoanCoin, (Object) userPositionInfoDebt.isoLoanCoin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIsoLoanCoin() {
        return this.isoLoanCoin;
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
    public int hashCode() {
        return (((this.liabCcy.hashCode() * 31) + this.loanCoin.hashCode()) * 31) + this.isoLoanCoin.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UserPositionInfoDebt(liabCcy=" + this.liabCcy + ", loanCoin=" + this.loanCoin + ", isoLoanCoin=" + this.isoLoanCoin + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.UserPositionInfoDebt.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserPositionInfoDebt> serializer() {
            return UserPositionInfoDebt$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UserPositionInfoDebt(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.liabCcy = "";
        } else {
            this.liabCcy = str;
        }
        if ((i & 2) == 0) {
            this.loanCoin = "";
        } else {
            this.loanCoin = str2;
        }
        if ((i & 4) == 0) {
            this.isoLoanCoin = "";
        } else {
            this.isoLoanCoin = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(UserPositionInfoDebt userPositionInfoDebt, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) userPositionInfoDebt.liabCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, userPositionInfoDebt.liabCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) userPositionInfoDebt.loanCoin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, userPositionInfoDebt.loanCoin);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) userPositionInfoDebt.isoLoanCoin, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, userPositionInfoDebt.isoLoanCoin);
    }

    public UserPositionInfoDebt(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.liabCcy = str;
        this.loanCoin = str2;
        this.isoLoanCoin = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:47) call: com.okinc.unify_trade.biz.UserPositionInfoDebt.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ UserPositionInfoDebt(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
