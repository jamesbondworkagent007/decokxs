package com.okinc.wallet.core.decode;

import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class PsbtDecodeNewItem {
    private final List<PsbtDecodeInputItem> input;
    private final List<PsbtDecodeOutputItem> output;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(PsbtDecodeInputItem$$serializer.INSTANCE), new ArrayListSerializer(PsbtDecodeOutputItem$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.wallet.core.decode.PsbtDecodeNewItem */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PsbtDecodeNewItem copy$default(PsbtDecodeNewItem psbtDecodeNewItem, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = psbtDecodeNewItem.input;
        }
        if ((i & 2) != 0) {
            list2 = psbtDecodeNewItem.output;
        }
        return psbtDecodeNewItem.copy(list, list2);
    }

    @SerialName(Web3SecurityTrackEvent.VALUE_INPUT)
    public static /* synthetic */ void getInput$annotations() {
    }

    @SerialName("output")
    public static /* synthetic */ void getOutput$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PsbtDecodeInputItem> component1() {
        return this.input;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PsbtDecodeOutputItem> component2() {
        return this.output;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PsbtDecodeNewItem copy(@NotNull List<PsbtDecodeInputItem> list, @NotNull List<PsbtDecodeOutputItem> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new PsbtDecodeNewItem(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PsbtDecodeNewItem)) {
            return false;
        }
        PsbtDecodeNewItem psbtDecodeNewItem = (PsbtDecodeNewItem) obj;
        return Intrinsics.EZpvd(this.input, psbtDecodeNewItem.input) && Intrinsics.EZpvd(this.output, psbtDecodeNewItem.output);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PsbtDecodeInputItem> getInput() {
        return this.input;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PsbtDecodeOutputItem> getOutput() {
        return this.output;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.input.hashCode() * 31) + this.output.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PsbtDecodeNewItem(input=" + this.input + ", output=" + this.output + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.decode.PsbtDecodeNewItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PsbtDecodeNewItem> serializer() {
            return PsbtDecodeNewItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PsbtDecodeNewItem(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, PsbtDecodeNewItem$$serializer.INSTANCE.getDescriptor());
        }
        this.input = list;
        this.output = list2;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(PsbtDecodeNewItem psbtDecodeNewItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], psbtDecodeNewItem.input);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], psbtDecodeNewItem.output);
    }

    public PsbtDecodeNewItem(@NotNull List<PsbtDecodeInputItem> list, @NotNull List<PsbtDecodeOutputItem> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.input = list;
        this.output = list2;
    }
}
