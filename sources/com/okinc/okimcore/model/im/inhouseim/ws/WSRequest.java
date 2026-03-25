package com.okinc.okimcore.model.im.inhouseim.ws;

import com.okinc.okimcore.model.im.inhouseim.ws.WSRequest;
import java.lang.annotation.Annotation;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC44448sQe;
import o.InterfaceC56387yDm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public abstract class WSRequest implements InterfaceC44448sQe {
    public static final int $stable = 0;
    public final String requestId;
    public final InHouseIMCommand websocketCommand;
    public static final Companion Companion = new Companion(null);
    public static final KSerializer<Object>[] $childSerializers = {InHouseIMCommand.Companion.serializer(), null};
    public static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sQg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return WSRequest.gEmmrt();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.requestId;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.WSRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) WSRequest.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<WSRequest> serializer() {
            return AEQbTJ();
        }
    }

    public /* synthetic */ WSRequest(int i, InHouseIMCommand inHouseIMCommand, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.websocketCommand = inHouseIMCommand;
        if ((i & 2) != 0) {
            this.requestId = str;
            return;
        }
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        this.requestId = string;
    }

    public static final /* synthetic */ void OLrzqt(WSRequest wSRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], wSRequest.websocketCommand);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1)) {
            String str = wSRequest.requestId;
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            if (Intrinsics.EZpvd((Object) str, (Object) string)) {
                return;
            }
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, wSRequest.requestId);
    }

    public static final /* synthetic */ KSerializer gEmmrt() {
        return new PolymorphicSerializer(C56524yIo.AEQbTJ(WSRequest.class), new Annotation[0]);
    }

    public WSRequest(@NotNull InHouseIMCommand inHouseIMCommand) {
        Intrinsics.checkNotNullParameter(inHouseIMCommand, "");
        this.websocketCommand = inHouseIMCommand;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        this.requestId = string;
    }
}
