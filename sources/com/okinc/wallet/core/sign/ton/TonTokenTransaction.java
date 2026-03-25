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
public final class TonTokenTransaction extends TonBaseTransaction {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String amount;
    private final String customPayload;
    private final int decimals;
    private final String fromJettonAccount;
    private final String invokeNotificationFee;
    private final boolean isToken;
    private final String memo;
    private final String messageAttachedTons;
    private final String nonce;
    private final String pubKey;
    private final String stateInit;
    private final String to;
    private final int ttl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.pubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.messageAttachedTons;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.stateInit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.customPayload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.ttl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromJettonAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.decimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.isToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.invokeNotificationFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TonTokenTransaction copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull String str5, @NotNull String str6, boolean z, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, int i2) {
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
        return new TonTokenTransaction(str, str2, str3, str4, i, str5, str6, z, str7, str8, str9, str10, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TonTokenTransaction)) {
            return false;
        }
        TonTokenTransaction tonTokenTransaction = (TonTokenTransaction) obj;
        return Intrinsics.EZpvd((Object) this.pubKey, (Object) tonTokenTransaction.pubKey) && Intrinsics.EZpvd((Object) this.fromJettonAccount, (Object) tonTokenTransaction.fromJettonAccount) && Intrinsics.EZpvd((Object) this.to, (Object) tonTokenTransaction.to) && Intrinsics.EZpvd((Object) this.amount, (Object) tonTokenTransaction.amount) && this.decimals == tonTokenTransaction.decimals && Intrinsics.EZpvd((Object) this.nonce, (Object) tonTokenTransaction.nonce) && Intrinsics.EZpvd((Object) this.memo, (Object) tonTokenTransaction.memo) && this.isToken == tonTokenTransaction.isToken && Intrinsics.EZpvd((Object) this.invokeNotificationFee, (Object) tonTokenTransaction.invokeNotificationFee) && Intrinsics.EZpvd((Object) this.messageAttachedTons, (Object) tonTokenTransaction.messageAttachedTons) && Intrinsics.EZpvd((Object) this.stateInit, (Object) tonTokenTransaction.stateInit) && Intrinsics.EZpvd((Object) this.customPayload, (Object) tonTokenTransaction.customPayload) && this.ttl == tonTokenTransaction.ttl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCustomPayload() {
        return this.customPayload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDecimals() {
        return this.decimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromJettonAccount() {
        return this.fromJettonAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvokeNotificationFee() {
        return this.invokeNotificationFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMemo() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessageAttachedTons() {
        return this.messageAttachedTons;
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
    public final String getStateInit() {
        return this.stateInit;
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
        return (((((((((((((((((((((((this.pubKey.hashCode() * 31) + this.fromJettonAccount.hashCode()) * 31) + this.to.hashCode()) * 31) + this.amount.hashCode()) * 31) + Integer.hashCode(this.decimals)) * 31) + this.nonce.hashCode()) * 31) + this.memo.hashCode()) * 31) + Boolean.hashCode(this.isToken)) * 31) + this.invokeNotificationFee.hashCode()) * 31) + this.messageAttachedTons.hashCode()) * 31) + this.stateInit.hashCode()) * 31) + this.customPayload.hashCode()) * 31) + Integer.hashCode(this.ttl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isToken() {
        return this.isToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TonTokenTransaction(pubKey=" + this.pubKey + ", fromJettonAccount=" + this.fromJettonAccount + ", to=" + this.to + ", amount=" + this.amount + ", decimals=" + this.decimals + ", nonce=" + this.nonce + ", memo=" + this.memo + ", isToken=" + this.isToken + ", invokeNotificationFee=" + this.invokeNotificationFee + ", messageAttachedTons=" + this.messageAttachedTons + ", stateInit=" + this.stateInit + ", customPayload=" + this.customPayload + ", ttl=" + this.ttl + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.ton.TonTokenTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TonTokenTransaction> serializer() {
            return TonTokenTransaction$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TonTokenTransaction(int i, String str, String str2, String str3, String str4, int i2, String str5, String str6, boolean z, String str7, String str8, String str9, String str10, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (8191 != (i & 8191)) {
            PluginExceptionsKt.throwMissingFieldException(i, 8191, TonTokenTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.pubKey = str;
        this.fromJettonAccount = str2;
        this.to = str3;
        this.amount = str4;
        this.decimals = i2;
        this.nonce = str5;
        this.memo = str6;
        this.isToken = z;
        this.invokeNotificationFee = str7;
        this.messageAttachedTons = str8;
        this.stateInit = str9;
        this.customPayload = str10;
        this.ttl = i3;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(TonTokenTransaction tonTokenTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        TonBaseTransaction.write$Self(tonTokenTransaction, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tonTokenTransaction.pubKey);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tonTokenTransaction.fromJettonAccount);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, tonTokenTransaction.to);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, tonTokenTransaction.amount);
        compositeEncoder.encodeIntElement(serialDescriptor, 4, tonTokenTransaction.decimals);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, tonTokenTransaction.nonce);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, tonTokenTransaction.memo);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 7, tonTokenTransaction.isToken);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, tonTokenTransaction.invokeNotificationFee);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, tonTokenTransaction.messageAttachedTons);
        compositeEncoder.encodeStringElement(serialDescriptor, 10, tonTokenTransaction.stateInit);
        compositeEncoder.encodeStringElement(serialDescriptor, 11, tonTokenTransaction.customPayload);
        compositeEncoder.encodeIntElement(serialDescriptor, 12, tonTokenTransaction.ttl);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TonTokenTransaction(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull String str5, @NotNull String str6, boolean z, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, int i2) {
        super(null);
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
        this.pubKey = str;
        this.fromJettonAccount = str2;
        this.to = str3;
        this.amount = str4;
        this.decimals = i;
        this.nonce = str5;
        this.memo = str6;
        this.isToken = z;
        this.invokeNotificationFee = str7;
        this.messageAttachedTons = str8;
        this.stateInit = str9;
        this.customPayload = str10;
        this.ttl = i2;
    }
}
