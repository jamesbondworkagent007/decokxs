package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class BizResp {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String errorMsg;
    private final boolean isSuccess;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BizResp copy$default(BizResp bizResp, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bizResp.isSuccess;
        }
        if ((i & 2) != 0) {
            str = bizResp.errorMsg;
        }
        return bizResp.copy(z, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.errorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BizResp copy(boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new BizResp(z, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BizResp)) {
            return false;
        }
        BizResp bizResp = (BizResp) obj;
        return this.isSuccess == bizResp.isSuccess && Intrinsics.EZpvd((Object) this.errorMsg, (Object) bizResp.errorMsg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Boolean.hashCode(this.isSuccess) * 31) + this.errorMsg.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSuccess() {
        return this.isSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BizResp(isSuccess=" + this.isSuccess + ", errorMsg=" + this.errorMsg + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BizResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BizResp> serializer() {
            return BizResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BizResp(int i, boolean z, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, BizResp$$serializer.INSTANCE.getDescriptor());
        }
        this.isSuccess = z;
        this.errorMsg = str;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BizResp bizResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, bizResp.isSuccess);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, bizResp.errorMsg);
    }

    public BizResp(boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isSuccess = z;
        this.errorMsg = str;
    }
}
