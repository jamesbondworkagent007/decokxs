package com.okinc.fiat.api.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class FiatCryptoRange {
    private boolean isLeftClose;
    private boolean isRightClose;
    private String max;
    private String min;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMax() {
        return this.max;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMin() {
        return this.min;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isLeftClose() {
        return this.isLeftClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isRightClose() {
        return this.isRightClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeftClose(boolean z) {
        this.isLeftClose = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.max = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.min = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRightClose(boolean z) {
        this.isRightClose = z;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.fiat.api.bean.FiatCryptoRange.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FiatCryptoRange> serializer() {
            return FiatCryptoRange$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FiatCryptoRange(int i, String str, String str2, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.min = "0.0";
        } else {
            this.min = str;
        }
        if ((i & 2) == 0) {
            this.max = "0.0";
        } else {
            this.max = str2;
        }
        if ((i & 4) == 0) {
            this.isLeftClose = false;
        } else {
            this.isLeftClose = z;
        }
        if ((i & 8) == 0) {
            this.isRightClose = false;
        } else {
            this.isRightClose = z2;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(FiatCryptoRange fiatCryptoRange, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) fiatCryptoRange.min, (Object) "0.0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, fiatCryptoRange.min);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) fiatCryptoRange.max, (Object) "0.0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, fiatCryptoRange.max);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || fiatCryptoRange.isLeftClose) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, fiatCryptoRange.isLeftClose);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || fiatCryptoRange.isRightClose) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, fiatCryptoRange.isRightClose);
        }
    }

    public FiatCryptoRange(@NotNull String str, @NotNull String str2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.min = str;
        this.max = str2;
        this.isLeftClose = z;
        this.isRightClose = z2;
    }
}
