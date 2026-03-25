package com.okinc.business.dex.trade.core.domain.model;

import com.okinc.business.dex.trade.core.domain.model.common.TeeSaStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class V6BroadcastAccountInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final boolean autoConfirm;
    private final String teeSaStatus;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ V6BroadcastAccountInfo copy$default(V6BroadcastAccountInfo v6BroadcastAccountInfo, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = v6BroadcastAccountInfo.teeSaStatus;
        }
        if ((i & 2) != 0) {
            z = v6BroadcastAccountInfo.autoConfirm;
        }
        return v6BroadcastAccountInfo.copy(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.teeSaStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.autoConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V6BroadcastAccountInfo copy(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new V6BroadcastAccountInfo(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V6BroadcastAccountInfo)) {
            return false;
        }
        V6BroadcastAccountInfo v6BroadcastAccountInfo = (V6BroadcastAccountInfo) obj;
        return Intrinsics.EZpvd((Object) this.teeSaStatus, (Object) v6BroadcastAccountInfo.teeSaStatus) && this.autoConfirm == v6BroadcastAccountInfo.autoConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAutoConfirm() {
        return this.autoConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTeeSaStatus() {
        return this.teeSaStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.teeSaStatus.hashCode() * 31) + Boolean.hashCode(this.autoConfirm);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "V6BroadcastAccountInfo(teeSaStatus=" + this.teeSaStatus + ", autoConfirm=" + this.autoConfirm + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.V6BroadcastAccountInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<V6BroadcastAccountInfo> serializer() {
            return V6BroadcastAccountInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ V6BroadcastAccountInfo(int i, String str, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, V6BroadcastAccountInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.teeSaStatus = str;
        this.autoConfirm = z;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(V6BroadcastAccountInfo v6BroadcastAccountInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, v6BroadcastAccountInfo.teeSaStatus);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, v6BroadcastAccountInfo.autoConfirm);
    }

    public V6BroadcastAccountInfo(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.teeSaStatus = str;
        this.autoConfirm = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public V6BroadcastAccountInfo(@NotNull TeeSaStatus teeSaStatus, boolean z) {
        this(teeSaStatus.getValue(), z);
        Intrinsics.checkNotNullParameter(teeSaStatus, "");
    }
}
