package com.okinc.business.defi.biz.core.ws.channel.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class WalletEIP7702StatusData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long chainIndex;
    private final int status;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletEIP7702StatusData copy$default(WalletEIP7702StatusData walletEIP7702StatusData, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = walletEIP7702StatusData.chainIndex;
        }
        if ((i2 & 2) != 0) {
            i = walletEIP7702StatusData.status;
        }
        return walletEIP7702StatusData.copy(j, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletEIP7702StatusData copy(long j, int i) {
        return new WalletEIP7702StatusData(j, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletEIP7702StatusData)) {
            return false;
        }
        WalletEIP7702StatusData walletEIP7702StatusData = (WalletEIP7702StatusData) obj;
        return this.chainIndex == walletEIP7702StatusData.chainIndex && this.status == walletEIP7702StatusData.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.chainIndex) * 31) + Integer.hashCode(this.status);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletEIP7702StatusData(chainIndex=" + this.chainIndex + ", status=" + this.status + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.ws.channel.bean.WalletEIP7702StatusData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletEIP7702StatusData> serializer() {
            return WalletEIP7702StatusData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletEIP7702StatusData(int i, long j, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, WalletEIP7702StatusData$$serializer.INSTANCE.getDescriptor());
        }
        this.chainIndex = j;
        this.status = i2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(WalletEIP7702StatusData walletEIP7702StatusData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, walletEIP7702StatusData.chainIndex);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, walletEIP7702StatusData.status);
    }

    public WalletEIP7702StatusData(long j, int i) {
        this.chainIndex = j;
        this.status = i;
    }
}
