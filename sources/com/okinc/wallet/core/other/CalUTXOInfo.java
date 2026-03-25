package com.okinc.wallet.core.other;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class CalUTXOInfo {
    private String hex;
    private int length;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHex() {
        return this.hex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLength() {
        return this.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.hex = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLength(int i) {
        this.length = i;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.other.CalUTXOInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CalUTXOInfo> serializer() {
            return CalUTXOInfo$$serializer.INSTANCE;
        }
    }

    public CalUTXOInfo() {
        this.hex = "";
    }

    public /* synthetic */ CalUTXOInfo(int i, String str, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        this.hex = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.length = 0;
        } else {
            this.length = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(CalUTXOInfo calUTXOInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) calUTXOInfo.hex, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, calUTXOInfo.hex);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && calUTXOInfo.length == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 1, calUTXOInfo.length);
    }
}
