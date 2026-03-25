package com.okinc.okex.uploadlog.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class TicketAttachmentResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String fileName;
    private final String fileSize;
    private final String fileUrl;
    private final String id;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TicketAttachmentResponse() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TicketAttachmentResponse copy$default(TicketAttachmentResponse ticketAttachmentResponse, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ticketAttachmentResponse.id;
        }
        if ((i & 2) != 0) {
            str2 = ticketAttachmentResponse.fileName;
        }
        if ((i & 4) != 0) {
            str3 = ticketAttachmentResponse.fileUrl;
        }
        if ((i & 8) != 0) {
            str4 = ticketAttachmentResponse.fileSize;
        }
        return ticketAttachmentResponse.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fileName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fileUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fileSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TicketAttachmentResponse copy(String str, String str2, String str3, String str4) {
        return new TicketAttachmentResponse(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketAttachmentResponse)) {
            return false;
        }
        TicketAttachmentResponse ticketAttachmentResponse = (TicketAttachmentResponse) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) ticketAttachmentResponse.id) && Intrinsics.EZpvd((Object) this.fileName, (Object) ticketAttachmentResponse.fileName) && Intrinsics.EZpvd((Object) this.fileUrl, (Object) ticketAttachmentResponse.fileUrl) && Intrinsics.EZpvd((Object) this.fileSize, (Object) ticketAttachmentResponse.fileSize);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFileSize() {
        return this.fileSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFileUrl() {
        return this.fileUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.id;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.fileName;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.fileUrl;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.fileSize;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TicketAttachmentResponse(id=" + this.id + ", fileName=" + this.fileName + ", fileUrl=" + this.fileUrl + ", fileSize=" + this.fileSize + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.uploadlog.bean.TicketAttachmentResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TicketAttachmentResponse> serializer() {
            return TicketAttachmentResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TicketAttachmentResponse(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.fileName = null;
        } else {
            this.fileName = str2;
        }
        if ((i & 4) == 0) {
            this.fileUrl = null;
        } else {
            this.fileUrl = str3;
        }
        if ((i & 8) == 0) {
            this.fileSize = null;
        } else {
            this.fileSize = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(TicketAttachmentResponse ticketAttachmentResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || ticketAttachmentResponse.id != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, ticketAttachmentResponse.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || ticketAttachmentResponse.fileName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, ticketAttachmentResponse.fileName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || ticketAttachmentResponse.fileUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, ticketAttachmentResponse.fileUrl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && ticketAttachmentResponse.fileSize == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, ticketAttachmentResponse.fileSize);
    }

    public TicketAttachmentResponse(String str, String str2, String str3, String str4) {
        this.id = str;
        this.fileName = str2;
        this.fileUrl = str3;
        this.fileSize = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.okex.uploadlog.bean.TicketAttachmentResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TicketAttachmentResponse(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
