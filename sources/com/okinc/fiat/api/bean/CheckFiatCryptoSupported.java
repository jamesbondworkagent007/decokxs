package com.okinc.fiat.api.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CheckFiatCryptoSupported {
    private Boolean canBuy;
    private Boolean canSell;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CheckFiatCryptoSupported copy$default(CheckFiatCryptoSupported checkFiatCryptoSupported, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = checkFiatCryptoSupported.canBuy;
        }
        if ((i & 2) != 0) {
            bool2 = checkFiatCryptoSupported.canSell;
        }
        return checkFiatCryptoSupported.copy(bool, bool2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.canBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.canSell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CheckFiatCryptoSupported copy(Boolean bool, Boolean bool2) {
        return new CheckFiatCryptoSupported(bool, bool2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckFiatCryptoSupported)) {
            return false;
        }
        CheckFiatCryptoSupported checkFiatCryptoSupported = (CheckFiatCryptoSupported) obj;
        return Intrinsics.EZpvd(this.canBuy, checkFiatCryptoSupported.canBuy) && Intrinsics.EZpvd(this.canSell, checkFiatCryptoSupported.canSell);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCanBuy() {
        return this.canBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCanSell() {
        return this.canSell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.canBuy;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.canSell;
        return (iHashCode * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanBuy(Boolean bool) {
        this.canBuy = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanSell(Boolean bool) {
        this.canSell = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CheckFiatCryptoSupported(canBuy=" + this.canBuy + ", canSell=" + this.canSell + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.fiat.api.bean.CheckFiatCryptoSupported.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CheckFiatCryptoSupported> serializer() {
            return CheckFiatCryptoSupported$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CheckFiatCryptoSupported(int i, Boolean bool, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, CheckFiatCryptoSupported$$serializer.INSTANCE.getDescriptor());
        }
        this.canBuy = bool;
        this.canSell = bool2;
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(CheckFiatCryptoSupported checkFiatCryptoSupported, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, booleanSerializer, checkFiatCryptoSupported.canBuy);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, booleanSerializer, checkFiatCryptoSupported.canSell);
    }

    public CheckFiatCryptoSupported(Boolean bool, Boolean bool2) {
        this.canBuy = bool;
        this.canSell = bool2;
    }
}
