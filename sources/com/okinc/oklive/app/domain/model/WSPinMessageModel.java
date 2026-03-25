package com.okinc.oklive.app.domain.model;

import com.okinc.oklive.app.data.model.remote.PinnedMessageModel;
import com.okinc.oklive.app.data.model.remote.PinnedMessageModel$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class WSPinMessageModel {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final PinnedMessageModel message;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WSPinMessageModel() {
        this((PinnedMessageModel) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WSPinMessageModel copy$default(WSPinMessageModel wSPinMessageModel, PinnedMessageModel pinnedMessageModel, int i, Object obj) {
        if ((i & 1) != 0) {
            pinnedMessageModel = wSPinMessageModel.message;
        }
        return wSPinMessageModel.copy(pinnedMessageModel);
    }

    @SerialName("message")
    public static /* synthetic */ void getMessage$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PinnedMessageModel component1() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WSPinMessageModel copy(PinnedMessageModel pinnedMessageModel) {
        return new WSPinMessageModel(pinnedMessageModel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WSPinMessageModel) && Intrinsics.EZpvd(this.message, ((WSPinMessageModel) obj).message);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PinnedMessageModel getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        PinnedMessageModel pinnedMessageModel = this.message;
        if (pinnedMessageModel == null) {
            return 0;
        }
        return pinnedMessageModel.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WSPinMessageModel(message=" + this.message + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.oklive.app.domain.model.WSPinMessageModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WSPinMessageModel> serializer() {
            return WSPinMessageModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WSPinMessageModel(int i, PinnedMessageModel pinnedMessageModel, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.message = null;
        } else {
            this.message = pinnedMessageModel;
        }
    }

    public static final /* synthetic */ void write$Self$OKLive_oklive_impl(WSPinMessageModel wSPinMessageModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && wSPinMessageModel.message == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, PinnedMessageModel$$serializer.INSTANCE, wSPinMessageModel.message);
    }

    public WSPinMessageModel(PinnedMessageModel pinnedMessageModel) {
        this.message = pinnedMessageModel;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.oklive.app.data.model.remote.PinnedMessageModel:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.oklive.app.data.model.remote.PinnedMessageModel) : (r1v0 com.okinc.oklive.app.data.model.remote.PinnedMessageModel))
 A[MD:(com.okinc.oklive.app.data.model.remote.PinnedMessageModel):void (m)] (LINE:10) call: com.okinc.oklive.app.domain.model.WSPinMessageModel.<init>(com.okinc.oklive.app.data.model.remote.PinnedMessageModel):void type: THIS */
    public /* synthetic */ WSPinMessageModel(PinnedMessageModel pinnedMessageModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : pinnedMessageModel);
    }
}
