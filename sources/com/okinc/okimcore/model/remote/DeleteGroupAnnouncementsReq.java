package com.okinc.okimcore.model.remote;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class DeleteGroupAnnouncementsReq {
    private final List<Long> announcementIds;
    private final long groupId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(LongSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.remote.DeleteGroupAnnouncementsReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeleteGroupAnnouncementsReq copy$default(DeleteGroupAnnouncementsReq deleteGroupAnnouncementsReq, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = deleteGroupAnnouncementsReq.groupId;
        }
        if ((i & 2) != 0) {
            list = deleteGroupAnnouncementsReq.announcementIds;
        }
        return deleteGroupAnnouncementsReq.copy(j, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component2() {
        return this.announcementIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeleteGroupAnnouncementsReq copy(long j, List<Long> list) {
        return new DeleteGroupAnnouncementsReq(j, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteGroupAnnouncementsReq)) {
            return false;
        }
        DeleteGroupAnnouncementsReq deleteGroupAnnouncementsReq = (DeleteGroupAnnouncementsReq) obj;
        return this.groupId == deleteGroupAnnouncementsReq.groupId && Intrinsics.EZpvd(this.announcementIds, deleteGroupAnnouncementsReq.announcementIds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getAnnouncementIds() {
        return this.announcementIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.groupId);
        List<Long> list = this.announcementIds;
        return (iHashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DeleteGroupAnnouncementsReq(groupId=" + this.groupId + ", announcementIds=" + this.announcementIds + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.DeleteGroupAnnouncementsReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DeleteGroupAnnouncementsReq> serializer() {
            return DeleteGroupAnnouncementsReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DeleteGroupAnnouncementsReq(int i, long j, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, DeleteGroupAnnouncementsReq$$serializer.INSTANCE.getDescriptor());
        }
        this.groupId = j;
        if ((i & 2) == 0) {
            this.announcementIds = null;
        } else {
            this.announcementIds = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(DeleteGroupAnnouncementsReq deleteGroupAnnouncementsReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeLongElement(serialDescriptor, 0, deleteGroupAnnouncementsReq.groupId);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && deleteGroupAnnouncementsReq.announcementIds == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], deleteGroupAnnouncementsReq.announcementIds);
    }

    public DeleteGroupAnnouncementsReq(long j, List<Long> list) {
        this.groupId = j;
        this.announcementIds = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 long)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(long, java.util.List<java.lang.Long>):void (m)] (LINE:129) call: com.okinc.okimcore.model.remote.DeleteGroupAnnouncementsReq.<init>(long, java.util.List):void type: THIS */
    public /* synthetic */ DeleteGroupAnnouncementsReq(long j, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : list);
    }
}
