package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class EditGroupAnnouncementReq {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long announcementId;
    private final long groupId;
    private final String newContent;
    private final Integer newPinStatus;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EditGroupAnnouncementReq copy$default(EditGroupAnnouncementReq editGroupAnnouncementReq, long j, long j2, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            j = editGroupAnnouncementReq.groupId;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = editGroupAnnouncementReq.announcementId;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            str = editGroupAnnouncementReq.newContent;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            num = editGroupAnnouncementReq.newPinStatus;
        }
        return editGroupAnnouncementReq.copy(j3, j4, str2, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.announcementId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.newContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.newPinStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EditGroupAnnouncementReq copy(long j, long j2, String str, Integer num) {
        return new EditGroupAnnouncementReq(j, j2, str, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditGroupAnnouncementReq)) {
            return false;
        }
        EditGroupAnnouncementReq editGroupAnnouncementReq = (EditGroupAnnouncementReq) obj;
        return this.groupId == editGroupAnnouncementReq.groupId && this.announcementId == editGroupAnnouncementReq.announcementId && Intrinsics.EZpvd((Object) this.newContent, (Object) editGroupAnnouncementReq.newContent) && Intrinsics.EZpvd(this.newPinStatus, editGroupAnnouncementReq.newPinStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getAnnouncementId() {
        return this.announcementId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewContent() {
        return this.newContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getNewPinStatus() {
        return this.newPinStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.groupId);
        int iHashCode2 = Long.hashCode(this.announcementId);
        String str = this.newContent;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        Integer num = this.newPinStatus;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EditGroupAnnouncementReq(groupId=" + this.groupId + ", announcementId=" + this.announcementId + ", newContent=" + this.newContent + ", newPinStatus=" + this.newPinStatus + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.EditGroupAnnouncementReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EditGroupAnnouncementReq> serializer() {
            return EditGroupAnnouncementReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EditGroupAnnouncementReq(int i, long j, long j2, String str, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, EditGroupAnnouncementReq$$serializer.INSTANCE.getDescriptor());
        }
        this.groupId = j;
        this.announcementId = j2;
        if ((i & 4) == 0) {
            this.newContent = null;
        } else {
            this.newContent = str;
        }
        if ((i & 8) == 0) {
            this.newPinStatus = null;
        } else {
            this.newPinStatus = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(EditGroupAnnouncementReq editGroupAnnouncementReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, editGroupAnnouncementReq.groupId);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, editGroupAnnouncementReq.announcementId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || editGroupAnnouncementReq.newContent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, editGroupAnnouncementReq.newContent);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && editGroupAnnouncementReq.newPinStatus == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, editGroupAnnouncementReq.newPinStatus);
    }

    public EditGroupAnnouncementReq(long j, long j2, String str, Integer num) {
        this.groupId = j;
        this.announcementId = j2;
        this.newContent = str;
        this.newPinStatus = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (r10v0 long)
  (r12v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r15v0 java.lang.Integer))
 A[MD:(long, long, java.lang.String, java.lang.Integer):void (m)] (LINE:114) call: com.okinc.okimcore.model.remote.EditGroupAnnouncementReq.<init>(long, long, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ EditGroupAnnouncementReq(long j, long j2, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num);
    }
}
