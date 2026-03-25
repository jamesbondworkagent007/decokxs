package com.okinc.business.web3pay.lib.features.paytransaction.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class RateInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String fromCcySymbol;
    private final String price;
    private final String toCcySymbol;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RateInfo copy$default(RateInfo rateInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rateInfo.fromCcySymbol;
        }
        if ((i & 2) != 0) {
            str2 = rateInfo.price;
        }
        if ((i & 4) != 0) {
            str3 = rateInfo.toCcySymbol;
        }
        return rateInfo.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fromCcySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.toCcySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RateInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new RateInfo(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RateInfo)) {
            return false;
        }
        RateInfo rateInfo = (RateInfo) obj;
        return Intrinsics.EZpvd((Object) this.fromCcySymbol, (Object) rateInfo.fromCcySymbol) && Intrinsics.EZpvd((Object) this.price, (Object) rateInfo.price) && Intrinsics.EZpvd((Object) this.toCcySymbol, (Object) rateInfo.toCcySymbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromCcySymbol() {
        return this.fromCcySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToCcySymbol() {
        return this.toCcySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.fromCcySymbol.hashCode() * 31) + this.price.hashCode()) * 31) + this.toCcySymbol.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RateInfo(fromCcySymbol=" + this.fromCcySymbol + ", price=" + this.price + ", toCcySymbol=" + this.toCcySymbol + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.paytransaction.model.RateInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RateInfo> serializer() {
            return RateInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RateInfo(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, RateInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.fromCcySymbol = str;
        this.price = str2;
        this.toCcySymbol = str3;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(RateInfo rateInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, rateInfo.fromCcySymbol);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, rateInfo.price);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, rateInfo.toCcySymbol);
    }

    public RateInfo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.fromCcySymbol = str;
        this.price = str2;
        this.toCcySymbol = str3;
    }
}
