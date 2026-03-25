package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class InputDataReq {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long coinId;
    private final String inputData;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InputDataReq copy$default(InputDataReq inputDataReq, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = inputDataReq.coinId;
        }
        if ((i & 2) != 0) {
            str = inputDataReq.inputData;
        }
        return inputDataReq.copy(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.inputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputDataReq copy(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new InputDataReq(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputDataReq)) {
            return false;
        }
        InputDataReq inputDataReq = (InputDataReq) obj;
        return this.coinId == inputDataReq.coinId && Intrinsics.EZpvd((Object) this.inputData, (Object) inputDataReq.inputData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInputData() {
        return this.inputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.coinId) * 31) + this.inputData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InputDataReq(coinId=" + this.coinId + ", inputData=" + this.inputData + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.InputDataReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InputDataReq> serializer() {
            return InputDataReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InputDataReq(int i, long j, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, InputDataReq$$serializer.INSTANCE.getDescriptor());
        }
        this.coinId = j;
        this.inputData = str;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(InputDataReq inputDataReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, inputDataReq.coinId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, inputDataReq.inputData);
    }

    public InputDataReq(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinId = j;
        this.inputData = str;
    }
}
