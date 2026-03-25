package com.okinc.okex.uploadlog.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class TicketFormResponse {
    private final String description;
    private final List<FormElement> formElements;
    private final Integer id;
    private final String name;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(FormElement$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TicketFormResponse() {
        this((Integer) null, (String) null, (String) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.uploadlog.bean.TicketFormResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TicketFormResponse copy$default(TicketFormResponse ticketFormResponse, Integer num, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = ticketFormResponse.id;
        }
        if ((i & 2) != 0) {
            str = ticketFormResponse.name;
        }
        if ((i & 4) != 0) {
            str2 = ticketFormResponse.description;
        }
        if ((i & 8) != 0) {
            list = ticketFormResponse.formElements;
        }
        return ticketFormResponse.copy(num, str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FormElement> component4() {
        return this.formElements;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TicketFormResponse copy(Integer num, String str, String str2, List<FormElement> list) {
        return new TicketFormResponse(num, str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketFormResponse)) {
            return false;
        }
        TicketFormResponse ticketFormResponse = (TicketFormResponse) obj;
        return Intrinsics.EZpvd(this.id, ticketFormResponse.id) && Intrinsics.EZpvd((Object) this.name, (Object) ticketFormResponse.name) && Intrinsics.EZpvd((Object) this.description, (Object) ticketFormResponse.description) && Intrinsics.EZpvd(this.formElements, ticketFormResponse.formElements);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FormElement> getFormElements() {
        return this.formElements;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.id;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.name;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.description;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        List<FormElement> list = this.formElements;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TicketFormResponse(id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", formElements=" + this.formElements + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.uploadlog.bean.TicketFormResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TicketFormResponse> serializer() {
            return TicketFormResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TicketFormResponse(int i, Integer num, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = num;
        }
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 4) == 0) {
            this.description = null;
        } else {
            this.description = str2;
        }
        if ((i & 8) == 0) {
            this.formElements = null;
        } else {
            this.formElements = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(TicketFormResponse ticketFormResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || ticketFormResponse.id != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, ticketFormResponse.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || ticketFormResponse.name != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, ticketFormResponse.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || ticketFormResponse.description != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, ticketFormResponse.description);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && ticketFormResponse.formElements == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], ticketFormResponse.formElements);
    }

    public TicketFormResponse(Integer num, String str, String str2, List<FormElement> list) {
        this.id = num;
        this.name = str;
        this.description = str2;
        this.formElements = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.util.List<com.okinc.okex.uploadlog.bean.FormElement>):void (m)] (LINE:12) call: com.okinc.okex.uploadlog.bean.TicketFormResponse.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ TicketFormResponse(Integer num, String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list);
    }
}
