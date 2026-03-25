package com.okinc.business.dexlogic.bean;

import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dex.api.bean.TokenBase$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class MemeTransactionParams {
    public static final int $stable;
    public static final Companion Companion = new Companion(null);
    private static final MemeTransactionParams DEFAULT;
    private final String amount;
    private final TokenBase currencyToken;
    private final String strategyType;
    private final TokenBase tokenBase;
    private final int transaction_direction;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MemeTransactionParams copy$default(MemeTransactionParams memeTransactionParams, TokenBase tokenBase, int i, String str, String str2, TokenBase tokenBase2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            tokenBase = memeTransactionParams.tokenBase;
        }
        if ((i2 & 2) != 0) {
            i = memeTransactionParams.transaction_direction;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = memeTransactionParams.amount;
        }
        String str3 = str;
        if ((i2 & 8) != 0) {
            str2 = memeTransactionParams.strategyType;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            tokenBase2 = memeTransactionParams.currencyToken;
        }
        return memeTransactionParams.copy(tokenBase, i3, str3, str4, tokenBase2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenBase component1() {
        return this.tokenBase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.transaction_direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenBase component5() {
        return this.currencyToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeTransactionParams copy(@NotNull TokenBase tokenBase, int i, @NotNull String str, @NotNull String str2, TokenBase tokenBase2) {
        Intrinsics.checkNotNullParameter(tokenBase, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new MemeTransactionParams(tokenBase, i, str, str2, tokenBase2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemeTransactionParams)) {
            return false;
        }
        MemeTransactionParams memeTransactionParams = (MemeTransactionParams) obj;
        return Intrinsics.EZpvd(this.tokenBase, memeTransactionParams.tokenBase) && this.transaction_direction == memeTransactionParams.transaction_direction && Intrinsics.EZpvd((Object) this.amount, (Object) memeTransactionParams.amount) && Intrinsics.EZpvd((Object) this.strategyType, (Object) memeTransactionParams.strategyType) && Intrinsics.EZpvd(this.currencyToken, memeTransactionParams.currencyToken);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenBase getCurrencyToken() {
        return this.currencyToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyType() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenBase getTokenBase() {
        return this.tokenBase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTransaction_direction() {
        return this.transaction_direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.tokenBase.hashCode();
        int iHashCode2 = Integer.hashCode(this.transaction_direction);
        int iHashCode3 = this.amount.hashCode();
        int iHashCode4 = this.strategyType.hashCode();
        TokenBase tokenBase = this.currencyToken;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (tokenBase == null ? 0 : tokenBase.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MemeTransactionParams(tokenBase=" + this.tokenBase + ", transaction_direction=" + this.transaction_direction + ", amount=" + this.amount + ", strategyType=" + this.strategyType + ", currencyToken=" + this.currencyToken + ")";
    }

    public /* synthetic */ MemeTransactionParams(int i, TokenBase tokenBase, int i2, String str, String str2, TokenBase tokenBase2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, MemeTransactionParams$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenBase = tokenBase;
        this.transaction_direction = i2;
        this.amount = str;
        if ((i & 8) == 0) {
            this.strategyType = "0";
        } else {
            this.strategyType = str2;
        }
        if ((i & 16) == 0) {
            this.currencyToken = null;
        } else {
            this.currencyToken = tokenBase2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(MemeTransactionParams memeTransactionParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        TokenBase$$serializer tokenBase$$serializer = TokenBase$$serializer.INSTANCE;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, tokenBase$$serializer, memeTransactionParams.tokenBase);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, memeTransactionParams.transaction_direction);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, memeTransactionParams.amount);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) memeTransactionParams.strategyType, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, memeTransactionParams.strategyType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && memeTransactionParams.currencyToken == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, tokenBase$$serializer, memeTransactionParams.currencyToken);
    }

    public MemeTransactionParams(@NotNull TokenBase tokenBase, int i, @NotNull String str, @NotNull String str2, TokenBase tokenBase2) {
        Intrinsics.checkNotNullParameter(tokenBase, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.tokenBase = tokenBase;
        this.transaction_direction = i;
        this.amount = str;
        this.strategyType = str2;
        this.currencyToken = tokenBase2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r7v0 com.okinc.business.dex.api.bean.TokenBase)
  (r8v0 int)
  (r9v0 java.lang.String)
  (wrap:java.lang.String:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("0") : (r10v0 java.lang.String))
  (wrap:com.okinc.business.dex.api.bean.TokenBase:?: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.api.bean.TokenBase) : (r11v0 com.okinc.business.dex.api.bean.TokenBase))
 A[MD:(com.okinc.business.dex.api.bean.TokenBase, int, java.lang.String, java.lang.String, com.okinc.business.dex.api.bean.TokenBase):void (m)] (LINE:181) call: com.okinc.business.dexlogic.bean.MemeTransactionParams.<init>(com.okinc.business.dex.api.bean.TokenBase, int, java.lang.String, java.lang.String, com.okinc.business.dex.api.bean.TokenBase):void type: THIS */
    public /* synthetic */ MemeTransactionParams(TokenBase tokenBase, int i, String str, String str2, TokenBase tokenBase2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(tokenBase, i, str, (i2 & 8) != 0 ? "0" : str2, (i2 & 16) != 0 ? null : tokenBase2);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.MemeTransactionParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MemeTransactionParams> serializer() {
            return MemeTransactionParams$$serializer.INSTANCE;
        }

        public final MemeTransactionParams EZpvd() {
            return MemeTransactionParams.DEFAULT;
        }
    }

    static {
        int i = TokenBase.$stable;
        $stable = i | i;
        DEFAULT = new MemeTransactionParams(new TokenBase(null, null, null, null, null, null, null, 0, 0, 0, 0, null, null, null, null, null, null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -1, null), -1, "", (String) null, (TokenBase) null, 8, (DefaultConstructorMarker) null);
    }
}
