package com.okinc.okex.uploadlog.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.sBY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class TicketFieldElement {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String field;
    private final ElementValue value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TicketFieldElement copy$default(TicketFieldElement ticketFieldElement, String str, ElementValue elementValue, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ticketFieldElement.field;
        }
        if ((i & 2) != 0) {
            elementValue = ticketFieldElement.value;
        }
        return ticketFieldElement.copy(str, elementValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.field;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ElementValue component2() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TicketFieldElement copy(@NotNull String str, @NotNull ElementValue elementValue) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(elementValue, "");
        return new TicketFieldElement(str, elementValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketFieldElement)) {
            return false;
        }
        TicketFieldElement ticketFieldElement = (TicketFieldElement) obj;
        return Intrinsics.EZpvd((Object) this.field, (Object) ticketFieldElement.field) && Intrinsics.EZpvd(this.value, ticketFieldElement.value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getField() {
        return this.field;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ElementValue getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.field.hashCode() * 31) + this.value.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TicketFieldElement(field=" + this.field + ", value=" + this.value + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.uploadlog.bean.TicketFieldElement.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TicketFieldElement> serializer() {
            return TicketFieldElement$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TicketFieldElement(int i, String str, ElementValue elementValue, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, TicketFieldElement$$serializer.INSTANCE.getDescriptor());
        }
        this.field = str;
        this.value = elementValue;
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(TicketFieldElement ticketFieldElement, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, ticketFieldElement.field);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, sBY.KWHzl, ticketFieldElement.value);
    }

    public TicketFieldElement(@NotNull String str, @NotNull ElementValue elementValue) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(elementValue, "");
        this.field = str;
        this.value = elementValue;
    }
}
