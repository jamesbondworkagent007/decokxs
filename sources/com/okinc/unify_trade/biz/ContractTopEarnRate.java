package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class ContractTopEarnRate {
    private float earnRate;
    private String userName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getEarnRate() {
        return this.earnRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserName() {
        return this.userName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarnRate(float f) {
        this.earnRate = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userName = str;
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ContractTopEarnRate.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContractTopEarnRate> serializer() {
            return ContractTopEarnRate$$serializer.INSTANCE;
        }
    }

    public ContractTopEarnRate() {
        this.userName = "";
    }

    public /* synthetic */ ContractTopEarnRate(int i, String str, float f, SerializationConstructorMarker serializationConstructorMarker) {
        this.userName = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.earnRate = 0.0f;
        } else {
            this.earnRate = f;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ContractTopEarnRate contractTopEarnRate, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) contractTopEarnRate.userName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, contractTopEarnRate.userName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Float.compare(contractTopEarnRate.earnRate, 0.0f) == 0) {
            return;
        }
        compositeEncoder.encodeFloatElement(serialDescriptor, 1, contractTopEarnRate.earnRate);
    }
}
