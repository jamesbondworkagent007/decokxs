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
public final class ExternalFeeInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String feeAmountInFiat;
    private final String feeAmountInUSD;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ExternalFeeInfo copy$default(ExternalFeeInfo externalFeeInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = externalFeeInfo.feeAmountInFiat;
        }
        if ((i & 2) != 0) {
            str2 = externalFeeInfo.feeAmountInUSD;
        }
        return externalFeeInfo.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.feeAmountInFiat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.feeAmountInUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExternalFeeInfo copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ExternalFeeInfo(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExternalFeeInfo)) {
            return false;
        }
        ExternalFeeInfo externalFeeInfo = (ExternalFeeInfo) obj;
        return Intrinsics.EZpvd((Object) this.feeAmountInFiat, (Object) externalFeeInfo.feeAmountInFiat) && Intrinsics.EZpvd((Object) this.feeAmountInUSD, (Object) externalFeeInfo.feeAmountInUSD);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeAmountInFiat() {
        return this.feeAmountInFiat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeAmountInUSD() {
        return this.feeAmountInUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.feeAmountInFiat.hashCode() * 31) + this.feeAmountInUSD.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ExternalFeeInfo(feeAmountInFiat=" + this.feeAmountInFiat + ", feeAmountInUSD=" + this.feeAmountInUSD + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.paytransaction.model.ExternalFeeInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ExternalFeeInfo> serializer() {
            return ExternalFeeInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ExternalFeeInfo(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ExternalFeeInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.feeAmountInFiat = str;
        this.feeAmountInUSD = str2;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(ExternalFeeInfo externalFeeInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, externalFeeInfo.feeAmountInFiat);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, externalFeeInfo.feeAmountInUSD);
    }

    public ExternalFeeInfo(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.feeAmountInFiat = str;
        this.feeAmountInUSD = str2;
    }
}
