package com.okinc.business.defi.wallet.passkey.common.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class EscapeBatchSendUopRes {
    private final List<EscapeBatchSendUopBean> uopList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(EscapeBatchSendUopBean$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.passkey.common.bean.EscapeBatchSendUopRes */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EscapeBatchSendUopRes copy$default(EscapeBatchSendUopRes escapeBatchSendUopRes, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = escapeBatchSendUopRes.uopList;
        }
        return escapeBatchSendUopRes.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EscapeBatchSendUopBean> component1() {
        return this.uopList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapeBatchSendUopRes copy(@NotNull List<EscapeBatchSendUopBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new EscapeBatchSendUopRes(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EscapeBatchSendUopRes) && Intrinsics.EZpvd(this.uopList, ((EscapeBatchSendUopRes) obj).uopList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EscapeBatchSendUopBean> getUopList() {
        return this.uopList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.uopList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EscapeBatchSendUopRes(uopList=" + this.uopList + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.passkey.common.bean.EscapeBatchSendUopRes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EscapeBatchSendUopRes> serializer() {
            return EscapeBatchSendUopRes$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EscapeBatchSendUopRes(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, EscapeBatchSendUopRes$$serializer.INSTANCE.getDescriptor());
        }
        this.uopList = list;
    }

    public EscapeBatchSendUopRes(@NotNull List<EscapeBatchSendUopBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.uopList = list;
    }
}
