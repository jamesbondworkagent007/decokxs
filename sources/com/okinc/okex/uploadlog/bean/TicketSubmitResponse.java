package com.okinc.okex.uploadlog.bean;

import com.okinc.okex.uploadlog.bean.enums.TicketChannel;
import com.okinc.okex.uploadlog.bean.enums.TicketStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class TicketSubmitResponse {
    public static final int $stable = 0;
    private final TicketChannel channel;
    private final String createdAt;
    private final String id;
    private final TicketStatus status;
    private final String title;
    private final String updatedAt;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, TicketChannel.Companion.serializer(), TicketStatus.Companion.serializer(), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TicketSubmitResponse() {
        this((String) null, (String) null, (TicketChannel) null, (TicketStatus) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TicketSubmitResponse copy$default(TicketSubmitResponse ticketSubmitResponse, String str, String str2, TicketChannel ticketChannel, TicketStatus ticketStatus, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ticketSubmitResponse.id;
        }
        if ((i & 2) != 0) {
            str2 = ticketSubmitResponse.title;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            ticketChannel = ticketSubmitResponse.channel;
        }
        TicketChannel ticketChannel2 = ticketChannel;
        if ((i & 8) != 0) {
            ticketStatus = ticketSubmitResponse.status;
        }
        TicketStatus ticketStatus2 = ticketStatus;
        if ((i & 16) != 0) {
            str3 = ticketSubmitResponse.createdAt;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            str4 = ticketSubmitResponse.updatedAt;
        }
        return ticketSubmitResponse.copy(str, str5, ticketChannel2, ticketStatus2, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TicketChannel component3() {
        return this.channel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TicketStatus component4() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.createdAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.updatedAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TicketSubmitResponse copy(String str, String str2, TicketChannel ticketChannel, TicketStatus ticketStatus, String str3, String str4) {
        return new TicketSubmitResponse(str, str2, ticketChannel, ticketStatus, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketSubmitResponse)) {
            return false;
        }
        TicketSubmitResponse ticketSubmitResponse = (TicketSubmitResponse) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) ticketSubmitResponse.id) && Intrinsics.EZpvd((Object) this.title, (Object) ticketSubmitResponse.title) && this.channel == ticketSubmitResponse.channel && this.status == ticketSubmitResponse.status && Intrinsics.EZpvd((Object) this.createdAt, (Object) ticketSubmitResponse.createdAt) && Intrinsics.EZpvd((Object) this.updatedAt, (Object) ticketSubmitResponse.updatedAt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TicketChannel getChannel() {
        return this.channel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TicketStatus getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.id;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.title;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        TicketChannel ticketChannel = this.channel;
        int iHashCode3 = ticketChannel == null ? 0 : ticketChannel.hashCode();
        TicketStatus ticketStatus = this.status;
        int iHashCode4 = ticketStatus == null ? 0 : ticketStatus.hashCode();
        String str3 = this.createdAt;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.updatedAt;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TicketSubmitResponse(id=" + this.id + ", title=" + this.title + ", channel=" + this.channel + ", status=" + this.status + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.uploadlog.bean.TicketSubmitResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TicketSubmitResponse> serializer() {
            return TicketSubmitResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TicketSubmitResponse(int i, String str, String str2, TicketChannel ticketChannel, TicketStatus ticketStatus, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.channel = null;
        } else {
            this.channel = ticketChannel;
        }
        if ((i & 8) == 0) {
            this.status = null;
        } else {
            this.status = ticketStatus;
        }
        if ((i & 16) == 0) {
            this.createdAt = null;
        } else {
            this.createdAt = str3;
        }
        if ((i & 32) == 0) {
            this.updatedAt = null;
        } else {
            this.updatedAt = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(TicketSubmitResponse ticketSubmitResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || ticketSubmitResponse.id != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, ticketSubmitResponse.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || ticketSubmitResponse.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, ticketSubmitResponse.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || ticketSubmitResponse.channel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], ticketSubmitResponse.channel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || ticketSubmitResponse.status != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], ticketSubmitResponse.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || ticketSubmitResponse.createdAt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, ticketSubmitResponse.createdAt);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && ticketSubmitResponse.updatedAt == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, ticketSubmitResponse.updatedAt);
    }

    public TicketSubmitResponse(String str, String str2, TicketChannel ticketChannel, TicketStatus ticketStatus, String str3, String str4) {
        this.id = str;
        this.title = str2;
        this.channel = ticketChannel;
        this.status = ticketStatus;
        this.createdAt = str3;
        this.updatedAt = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:com.okinc.okex.uploadlog.bean.enums.TicketChannel:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.uploadlog.bean.enums.TicketChannel) : (r8v0 com.okinc.okex.uploadlog.bean.enums.TicketChannel))
  (wrap:com.okinc.okex.uploadlog.bean.enums.TicketStatus:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.uploadlog.bean.enums.TicketStatus) : (r9v0 com.okinc.okex.uploadlog.bean.enums.TicketStatus))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, com.okinc.okex.uploadlog.bean.enums.TicketChannel, com.okinc.okex.uploadlog.bean.enums.TicketStatus, java.lang.String, java.lang.String):void (m)] (LINE:10) call: com.okinc.okex.uploadlog.bean.TicketSubmitResponse.<init>(java.lang.String, java.lang.String, com.okinc.okex.uploadlog.bean.enums.TicketChannel, com.okinc.okex.uploadlog.bean.enums.TicketStatus, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TicketSubmitResponse(String str, String str2, TicketChannel ticketChannel, TicketStatus ticketStatus, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : ticketChannel, (i & 8) != 0 ? null : ticketStatus, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }
}
