package com.okinc.wallet.core.decode;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class PsbtDecodeItem {
    public final List<PsbtDecodeItemDetails> content;
    public final String hex;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(PsbtDecodeItemDetails$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.wallet.core.decode.PsbtDecodeItem */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PsbtDecodeItem copy$default(PsbtDecodeItem psbtDecodeItem, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = psbtDecodeItem.hex;
        }
        if ((i & 2) != 0) {
            list = psbtDecodeItem.content;
        }
        return psbtDecodeItem.EZpvd(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PsbtDecodeItem EZpvd(@NotNull String str, @NotNull List<PsbtDecodeItemDetails> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new PsbtDecodeItem(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PsbtDecodeItemDetails> copydefault() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PsbtDecodeItem)) {
            return false;
        }
        PsbtDecodeItem psbtDecodeItem = (PsbtDecodeItem) obj;
        return Intrinsics.EZpvd((Object) this.hex, (Object) psbtDecodeItem.hex) && Intrinsics.EZpvd(this.content, psbtDecodeItem.content);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.hex.hashCode() * 31) + this.content.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PsbtDecodeItem(hex=" + this.hex + ", content=" + this.content + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.decode.PsbtDecodeItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PsbtDecodeItem> serializer() {
            return PsbtDecodeItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PsbtDecodeItem(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, PsbtDecodeItem$$serializer.INSTANCE.getDescriptor());
        }
        this.hex = str;
        this.content = list;
    }

    public static final /* synthetic */ void EZpvd(PsbtDecodeItem psbtDecodeItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, psbtDecodeItem.hex);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], psbtDecodeItem.content);
    }

    public PsbtDecodeItem(@NotNull String str, @NotNull List<PsbtDecodeItemDetails> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.hex = str;
        this.content = list;
    }
}
