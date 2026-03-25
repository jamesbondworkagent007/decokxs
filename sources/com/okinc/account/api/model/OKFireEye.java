package com.okinc.account.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class OKFireEye {
    private int hcDIFF;
    private int hcVersion;
    private String rasPK;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getHcDIFF() {
        return this.hcDIFF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getHcVersion() {
        return this.hcVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRasPK() {
        return this.rasPK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHcDIFF(int i) {
        this.hcDIFF = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHcVersion(int i) {
        this.hcVersion = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRasPK(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rasPK = str;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.account.api.model.OKFireEye.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OKFireEye> serializer() {
            return OKFireEye$$serializer.INSTANCE;
        }
    }

    public OKFireEye() {
        this.hcVersion = 1;
        this.rasPK = "";
    }

    public /* synthetic */ OKFireEye(int i, int i2, int i3, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.hcDIFF = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.hcVersion = 1;
        } else {
            this.hcVersion = i3;
        }
        if ((i & 4) == 0) {
            this.rasPK = "";
        } else {
            this.rasPK = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKAccount_account_api(OKFireEye oKFireEye, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || oKFireEye.hcDIFF != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, oKFireEye.hcDIFF);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || oKFireEye.hcVersion != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, oKFireEye.hcVersion);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) oKFireEye.rasPK, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, oKFireEye.rasPK);
    }
}
