package com.okinc.account.api.model.login;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class VerifyResp {
    private int behavior;
    private int verifyType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBehavior() {
        return this.behavior;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getVerifyType() {
        return this.verifyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBehavior(int i) {
        this.behavior = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVerifyType(int i) {
        this.verifyType = i;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.account.api.model.login.VerifyResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VerifyResp> serializer() {
            return VerifyResp$$serializer.INSTANCE;
        }
    }

    public VerifyResp() {
        this.verifyType = -1;
        this.behavior = -1;
    }

    public /* synthetic */ VerifyResp(int i, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.verifyType = -1;
        } else {
            this.verifyType = i2;
        }
        if ((i & 2) == 0) {
            this.behavior = -1;
        } else {
            this.behavior = i3;
        }
    }

    public static final /* synthetic */ void write$Self$OKAccount_account_api(VerifyResp verifyResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || verifyResp.verifyType != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, verifyResp.verifyType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && verifyResp.behavior == -1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 1, verifyResp.behavior);
    }
}
