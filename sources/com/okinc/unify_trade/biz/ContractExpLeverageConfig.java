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
public final class ContractExpLeverageConfig {
    private BizConfig bizConfig;
    private String sCode;
    private String sMsg;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BizConfig getBizConfig() {
        return this.bizConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSCode() {
        return this.sCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSMsg() {
        return this.sMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizConfig(BizConfig bizConfig) {
        this.bizConfig = bizConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sMsg = str;
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ContractExpLeverageConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContractExpLeverageConfig> serializer() {
            return ContractExpLeverageConfig$$serializer.INSTANCE;
        }
    }

    public ContractExpLeverageConfig() {
        this.sCode = "";
        this.sMsg = "";
    }

    public /* synthetic */ ContractExpLeverageConfig(int i, BizConfig bizConfig, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.bizConfig = (i & 1) == 0 ? null : bizConfig;
        if ((i & 2) == 0) {
            this.sCode = "";
        } else {
            this.sCode = str;
        }
        if ((i & 4) == 0) {
            this.sMsg = "";
        } else {
            this.sMsg = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ContractExpLeverageConfig contractExpLeverageConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || contractExpLeverageConfig.bizConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BizConfig$$serializer.INSTANCE, contractExpLeverageConfig.bizConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) contractExpLeverageConfig.sCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, contractExpLeverageConfig.sCode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) contractExpLeverageConfig.sMsg, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, contractExpLeverageConfig.sMsg);
    }
}
