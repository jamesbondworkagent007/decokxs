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
public final class RateObj {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String maxAmountPerDay;
    private final String maxAmountPerMonth;
    private final String maxAmountPerTransaction;
    private final String minAmountPerTransaction;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RateObj copy$default(RateObj rateObj, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rateObj.minAmountPerTransaction;
        }
        if ((i & 2) != 0) {
            str2 = rateObj.maxAmountPerTransaction;
        }
        if ((i & 4) != 0) {
            str3 = rateObj.maxAmountPerDay;
        }
        if ((i & 8) != 0) {
            str4 = rateObj.maxAmountPerMonth;
        }
        return rateObj.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.minAmountPerTransaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.maxAmountPerTransaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.maxAmountPerDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.maxAmountPerMonth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RateObj copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new RateObj(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RateObj)) {
            return false;
        }
        RateObj rateObj = (RateObj) obj;
        return Intrinsics.EZpvd((Object) this.minAmountPerTransaction, (Object) rateObj.minAmountPerTransaction) && Intrinsics.EZpvd((Object) this.maxAmountPerTransaction, (Object) rateObj.maxAmountPerTransaction) && Intrinsics.EZpvd((Object) this.maxAmountPerDay, (Object) rateObj.maxAmountPerDay) && Intrinsics.EZpvd((Object) this.maxAmountPerMonth, (Object) rateObj.maxAmountPerMonth);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxAmountPerDay() {
        return this.maxAmountPerDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxAmountPerMonth() {
        return this.maxAmountPerMonth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxAmountPerTransaction() {
        return this.maxAmountPerTransaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinAmountPerTransaction() {
        return this.minAmountPerTransaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.minAmountPerTransaction.hashCode() * 31) + this.maxAmountPerTransaction.hashCode()) * 31) + this.maxAmountPerDay.hashCode()) * 31) + this.maxAmountPerMonth.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RateObj(minAmountPerTransaction=" + this.minAmountPerTransaction + ", maxAmountPerTransaction=" + this.maxAmountPerTransaction + ", maxAmountPerDay=" + this.maxAmountPerDay + ", maxAmountPerMonth=" + this.maxAmountPerMonth + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.paytransaction.model.RateObj.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RateObj> serializer() {
            return RateObj$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RateObj(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, RateObj$$serializer.INSTANCE.getDescriptor());
        }
        this.minAmountPerTransaction = str;
        this.maxAmountPerTransaction = str2;
        this.maxAmountPerDay = str3;
        this.maxAmountPerMonth = str4;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(RateObj rateObj, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, rateObj.minAmountPerTransaction);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, rateObj.maxAmountPerTransaction);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, rateObj.maxAmountPerDay);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, rateObj.maxAmountPerMonth);
    }

    public RateObj(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.minAmountPerTransaction = str;
        this.maxAmountPerTransaction = str2;
        this.maxAmountPerDay = str3;
        this.maxAmountPerMonth = str4;
    }
}
