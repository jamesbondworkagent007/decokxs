package com.okinc.wallet.core.sign.ton;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class TonTransaction extends TonBaseTransaction {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String amount;
    private final String memo;
    private final int mode;
    private final String nonce;
    private final String pubKey;
    private final String to;
    private final int ttl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TonTransaction copy$default(TonTransaction tonTransaction, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = tonTransaction.pubKey;
        }
        if ((i3 & 2) != 0) {
            str2 = tonTransaction.to;
        }
        String str6 = str2;
        if ((i3 & 4) != 0) {
            str3 = tonTransaction.amount;
        }
        String str7 = str3;
        if ((i3 & 8) != 0) {
            str4 = tonTransaction.nonce;
        }
        String str8 = str4;
        if ((i3 & 16) != 0) {
            str5 = tonTransaction.memo;
        }
        String str9 = str5;
        if ((i3 & 32) != 0) {
            i = tonTransaction.mode;
        }
        int i4 = i;
        if ((i3 & 64) != 0) {
            i2 = tonTransaction.ttl;
        }
        return tonTransaction.copy(str, str6, str7, str8, str9, i4, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.pubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.ttl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TonTransaction copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new TonTransaction(str, str2, str3, str4, str5, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TonTransaction)) {
            return false;
        }
        TonTransaction tonTransaction = (TonTransaction) obj;
        return Intrinsics.EZpvd((Object) this.pubKey, (Object) tonTransaction.pubKey) && Intrinsics.EZpvd((Object) this.to, (Object) tonTransaction.to) && Intrinsics.EZpvd((Object) this.amount, (Object) tonTransaction.amount) && Intrinsics.EZpvd((Object) this.nonce, (Object) tonTransaction.nonce) && Intrinsics.EZpvd((Object) this.memo, (Object) tonTransaction.memo) && this.mode == tonTransaction.mode && this.ttl == tonTransaction.ttl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMemo() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMode() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPubKey() {
        return this.pubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTtl() {
        return this.ttl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.pubKey.hashCode() * 31) + this.to.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.nonce.hashCode()) * 31) + this.memo.hashCode()) * 31) + Integer.hashCode(this.mode)) * 31) + Integer.hashCode(this.ttl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TonTransaction(pubKey=" + this.pubKey + ", to=" + this.to + ", amount=" + this.amount + ", nonce=" + this.nonce + ", memo=" + this.memo + ", mode=" + this.mode + ", ttl=" + this.ttl + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.ton.TonTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TonTransaction> serializer() {
            return TonTransaction$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TonTransaction(int i, String str, String str2, String str3, String str4, String str5, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (127 != (i & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i, 127, TonTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.pubKey = str;
        this.to = str2;
        this.amount = str3;
        this.nonce = str4;
        this.memo = str5;
        this.mode = i2;
        this.ttl = i3;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(TonTransaction tonTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        TonBaseTransaction.write$Self(tonTransaction, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tonTransaction.pubKey);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tonTransaction.to);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, tonTransaction.amount);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, tonTransaction.nonce);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, tonTransaction.memo);
        compositeEncoder.encodeIntElement(serialDescriptor, 5, tonTransaction.mode);
        compositeEncoder.encodeIntElement(serialDescriptor, 6, tonTransaction.ttl);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TonTransaction(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i, int i2) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.pubKey = str;
        this.to = str2;
        this.amount = str3;
        this.nonce = str4;
        this.memo = str5;
        this.mode = i;
        this.ttl = i2;
    }
}
