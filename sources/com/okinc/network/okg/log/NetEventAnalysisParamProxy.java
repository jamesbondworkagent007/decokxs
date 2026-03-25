package com.okinc.network.okg.log;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class NetEventAnalysisParamProxy {
    public final boolean enumerable;
    public final String key;
    public String value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.enumerable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.value;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.network.okg.log.NetEventAnalysisParamProxy.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NetEventAnalysisParamProxy> serializer() {
            return NetEventAnalysisParamProxy$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NetEventAnalysisParamProxy(int i, String str, String str2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, NetEventAnalysisParamProxy$$serializer.INSTANCE.getDescriptor());
        }
        this.key = str;
        this.value = str2;
        if ((i & 4) == 0) {
            this.enumerable = false;
        } else {
            this.enumerable = z;
        }
    }

    public static final /* synthetic */ void copydefault(NetEventAnalysisParamProxy netEventAnalysisParamProxy, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, netEventAnalysisParamProxy.key);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, netEventAnalysisParamProxy.value);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || netEventAnalysisParamProxy.enumerable) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, netEventAnalysisParamProxy.enumerable);
        }
    }

    public NetEventAnalysisParamProxy(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.key = str;
        this.value = str2;
        this.enumerable = z;
    }
}
