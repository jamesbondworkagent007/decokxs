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
public final class CeDefiCreateUopResp {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final CeDefiCreateUopRespServerOption serverOption;
    private final int signType;
    private final String uopHash;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CeDefiCreateUopResp copy$default(CeDefiCreateUopResp ceDefiCreateUopResp, String str, int i, CeDefiCreateUopRespServerOption ceDefiCreateUopRespServerOption, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = ceDefiCreateUopResp.uopHash;
        }
        if ((i2 & 2) != 0) {
            i = ceDefiCreateUopResp.signType;
        }
        if ((i2 & 4) != 0) {
            ceDefiCreateUopRespServerOption = ceDefiCreateUopResp.serverOption;
        }
        return ceDefiCreateUopResp.copy(str, i, ceDefiCreateUopRespServerOption);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.signType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CeDefiCreateUopRespServerOption component3() {
        return this.serverOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CeDefiCreateUopResp copy(@NotNull String str, int i, @NotNull CeDefiCreateUopRespServerOption ceDefiCreateUopRespServerOption) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(ceDefiCreateUopRespServerOption, "");
        return new CeDefiCreateUopResp(str, i, ceDefiCreateUopRespServerOption);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CeDefiCreateUopResp)) {
            return false;
        }
        CeDefiCreateUopResp ceDefiCreateUopResp = (CeDefiCreateUopResp) obj;
        return Intrinsics.EZpvd((Object) this.uopHash, (Object) ceDefiCreateUopResp.uopHash) && this.signType == ceDefiCreateUopResp.signType && Intrinsics.EZpvd(this.serverOption, ceDefiCreateUopResp.serverOption);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CeDefiCreateUopRespServerOption getServerOption() {
        return this.serverOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSignType() {
        return this.signType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUopHash() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.uopHash.hashCode() * 31) + Integer.hashCode(this.signType)) * 31) + this.serverOption.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CeDefiCreateUopResp(uopHash=" + this.uopHash + ", signType=" + this.signType + ", serverOption=" + this.serverOption + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CeDefiCreateUopResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CeDefiCreateUopResp> serializer() {
            return CeDefiCreateUopResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CeDefiCreateUopResp(int i, String str, int i2, CeDefiCreateUopRespServerOption ceDefiCreateUopRespServerOption, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, CeDefiCreateUopResp$$serializer.INSTANCE.getDescriptor());
        }
        this.uopHash = str;
        this.signType = i2;
        this.serverOption = ceDefiCreateUopRespServerOption;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CeDefiCreateUopResp ceDefiCreateUopResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, ceDefiCreateUopResp.uopHash);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, ceDefiCreateUopResp.signType);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, CeDefiCreateUopResp$CeDefiCreateUopRespServerOption$$serializer.INSTANCE, ceDefiCreateUopResp.serverOption);
    }

    public CeDefiCreateUopResp(@NotNull String str, int i, @NotNull CeDefiCreateUopRespServerOption ceDefiCreateUopRespServerOption) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(ceDefiCreateUopRespServerOption, "");
        this.uopHash = str;
        this.signType = i;
        this.serverOption = ceDefiCreateUopRespServerOption;
    }

    @Serializable
    public static final class CeDefiCreateUopRespServerOption {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String hash;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ CeDefiCreateUopRespServerOption copy$default(CeDefiCreateUopRespServerOption ceDefiCreateUopRespServerOption, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ceDefiCreateUopRespServerOption.hash;
            }
            return ceDefiCreateUopRespServerOption.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.hash;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CeDefiCreateUopRespServerOption copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new CeDefiCreateUopRespServerOption(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CeDefiCreateUopRespServerOption) && Intrinsics.EZpvd((Object) this.hash, (Object) ((CeDefiCreateUopRespServerOption) obj).hash);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getHash() {
            return this.hash;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.hash.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CeDefiCreateUopRespServerOption(hash=" + this.hash + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CeDefiCreateUopResp.CeDefiCreateUopRespServerOption.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<CeDefiCreateUopRespServerOption> serializer() {
                return CeDefiCreateUopResp$CeDefiCreateUopRespServerOption$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ CeDefiCreateUopRespServerOption(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, CeDefiCreateUopResp$CeDefiCreateUopRespServerOption$$serializer.INSTANCE.getDescriptor());
            }
            this.hash = str;
        }

        public CeDefiCreateUopRespServerOption(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.hash = str;
        }
    }
}
