package com.okinc.account.api.model.login;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class AddPwdGoResp {
    private int behavior;
    private int type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBehavior() {
        return this.behavior;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBehavior(int i) {
        this.behavior = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(int i) {
        this.type = i;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.account.api.model.login.AddPwdGoResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddPwdGoResp> serializer() {
            return AddPwdGoResp$$serializer.INSTANCE;
        }
    }

    public AddPwdGoResp() {
        this.type = -1;
        this.behavior = -1;
    }

    public /* synthetic */ AddPwdGoResp(int i, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.type = -1;
        } else {
            this.type = i2;
        }
        if ((i & 2) == 0) {
            this.behavior = -1;
        } else {
            this.behavior = i3;
        }
    }

    public static final /* synthetic */ void write$Self$OKAccount_account_api(AddPwdGoResp addPwdGoResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || addPwdGoResp.type != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, addPwdGoResp.type);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && addPwdGoResp.behavior == -1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 1, addPwdGoResp.behavior);
    }
}
