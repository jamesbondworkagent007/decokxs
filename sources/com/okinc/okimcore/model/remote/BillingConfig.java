package com.okinc.okimcore.model.remote;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class BillingConfig {
    private final List<SupportedCurrencies> supportedCurrencies;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(SupportedCurrencies$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.remote.BillingConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BillingConfig copy$default(BillingConfig billingConfig, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = billingConfig.supportedCurrencies;
        }
        return billingConfig.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SupportedCurrencies> component1() {
        return this.supportedCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BillingConfig copy(@NotNull List<SupportedCurrencies> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new BillingConfig(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BillingConfig) && Intrinsics.EZpvd(this.supportedCurrencies, ((BillingConfig) obj).supportedCurrencies);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SupportedCurrencies> getSupportedCurrencies() {
        return this.supportedCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.supportedCurrencies.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BillingConfig(supportedCurrencies=" + this.supportedCurrencies + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.BillingConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BillingConfig> serializer() {
            return BillingConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BillingConfig(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, BillingConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.supportedCurrencies = list;
    }

    public BillingConfig(@NotNull List<SupportedCurrencies> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.supportedCurrencies = list;
    }
}
