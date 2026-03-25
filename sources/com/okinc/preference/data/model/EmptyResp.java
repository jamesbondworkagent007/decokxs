package com.okinc.preference.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class EmptyResp {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    public static final /* synthetic */ void write$Self$OKPreference_preference_impl(EmptyResp emptyResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.preference.data.model.EmptyResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EmptyResp> serializer() {
            return EmptyResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EmptyResp(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    public EmptyResp() {
    }
}
