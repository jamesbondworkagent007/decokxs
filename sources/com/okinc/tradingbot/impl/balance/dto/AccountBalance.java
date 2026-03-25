package com.okinc.tradingbot.impl.balance.dto;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C48161uHf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class AccountBalance {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String available;
    private final String currencyId;
    private final String target;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AccountBalance copy$default(AccountBalance accountBalance, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountBalance.target;
        }
        if ((i & 2) != 0) {
            str2 = accountBalance.currencyId;
        }
        if ((i & 4) != 0) {
            str3 = accountBalance.available;
        }
        return accountBalance.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.available;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountBalance copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new AccountBalance(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountBalance)) {
            return false;
        }
        AccountBalance accountBalance = (AccountBalance) obj;
        return Intrinsics.EZpvd((Object) this.target, (Object) accountBalance.target) && Intrinsics.EZpvd((Object) this.currencyId, (Object) accountBalance.currencyId) && Intrinsics.EZpvd((Object) this.available, (Object) accountBalance.available);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailable() {
        return this.available;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTarget() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.target.hashCode() * 31) + this.currencyId.hashCode()) * 31) + this.available.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountBalance(target=" + this.target + ", currencyId=" + this.currencyId + ", available=" + this.available + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.balance.dto.AccountBalance.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AccountBalance> serializer() {
            return AccountBalance$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AccountBalance(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, AccountBalance$$serializer.INSTANCE.getDescriptor());
        }
        this.target = str;
        this.currencyId = str2;
        this.available = str3;
    }

    public static final /* synthetic */ void write$Self$OKTradingBot_trading_bot_impl(AccountBalance accountBalance, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, accountBalance.target);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, accountBalance.currencyId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, accountBalance.available);
    }

    public AccountBalance(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.target = str;
        this.currencyId = str2;
        this.available = str3;
    }

    public final AccountType getAccountType() {
        return C48161uHf.KWHzl(this.target);
    }
}
