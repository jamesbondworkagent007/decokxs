package com.okinc.okex.uploadlog.bean;

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

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class TicketSubmitRequest {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<TicketFieldElement> extraFields;
    private final List<TicketFieldElement> fields;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.uploadlog.bean.TicketSubmitRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TicketSubmitRequest copy$default(TicketSubmitRequest ticketSubmitRequest, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = ticketSubmitRequest.fields;
        }
        if ((i & 2) != 0) {
            list2 = ticketSubmitRequest.extraFields;
        }
        return ticketSubmitRequest.copy(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TicketFieldElement> component1() {
        return this.fields;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TicketFieldElement> component2() {
        return this.extraFields;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TicketSubmitRequest copy(@NotNull List<TicketFieldElement> list, List<TicketFieldElement> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new TicketSubmitRequest(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketSubmitRequest)) {
            return false;
        }
        TicketSubmitRequest ticketSubmitRequest = (TicketSubmitRequest) obj;
        return Intrinsics.EZpvd(this.fields, ticketSubmitRequest.fields) && Intrinsics.EZpvd(this.extraFields, ticketSubmitRequest.extraFields);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TicketFieldElement> getExtraFields() {
        return this.extraFields;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TicketFieldElement> getFields() {
        return this.fields;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.fields.hashCode();
        List<TicketFieldElement> list = this.extraFields;
        return (iHashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TicketSubmitRequest(fields=" + this.fields + ", extraFields=" + this.extraFields + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.uploadlog.bean.TicketSubmitRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TicketSubmitRequest> serializer() {
            return TicketSubmitRequest$$serializer.INSTANCE;
        }
    }

    static {
        TicketFieldElement$$serializer ticketFieldElement$$serializer = TicketFieldElement$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(ticketFieldElement$$serializer), new ArrayListSerializer(ticketFieldElement$$serializer)};
    }

    public /* synthetic */ TicketSubmitRequest(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, TicketSubmitRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.fields = list;
        if ((i & 2) == 0) {
            this.extraFields = null;
        } else {
            this.extraFields = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(TicketSubmitRequest ticketSubmitRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], ticketSubmitRequest.fields);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && ticketSubmitRequest.extraFields == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], ticketSubmitRequest.extraFields);
    }

    public TicketSubmitRequest(@NotNull List<TicketFieldElement> list, List<TicketFieldElement> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.fields = list;
        this.extraFields = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.util.List)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
 A[MD:(java.util.List<com.okinc.okex.uploadlog.bean.TicketFieldElement>, java.util.List<com.okinc.okex.uploadlog.bean.TicketFieldElement>):void (m)] (LINE:19) call: com.okinc.okex.uploadlog.bean.TicketSubmitRequest.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ TicketSubmitRequest(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : list2);
    }
}
