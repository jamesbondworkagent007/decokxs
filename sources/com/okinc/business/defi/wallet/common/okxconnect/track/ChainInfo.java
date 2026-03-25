package com.okinc.business.defi.wallet.common.okxconnect.track;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class ChainInfo {
    public static final Companion Companion = new Companion(null);
    private final long generalChainId;
    private final String symbol;

    @SerialName("chain_index")
    private static /* synthetic */ void getGeneralChainId$annotations() {
    }

    @SerialName("chain_name")
    private static /* synthetic */ void getSymbol$annotations() {
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.track.ChainInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChainInfo> serializer() {
            return ChainInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChainInfo(int i, String str, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ChainInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.symbol = str;
        this.generalChainId = j;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ChainInfo chainInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, chainInfo.symbol);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, chainInfo.generalChainId);
    }

    public ChainInfo(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.symbol = str;
        this.generalChainId = j;
    }
}
