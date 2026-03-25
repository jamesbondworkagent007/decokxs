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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class AddGroupAnnouncementReq {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String content;
    private final long groupId;
    private final Integer pinStatus;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AddGroupAnnouncementReq copy$default(AddGroupAnnouncementReq addGroupAnnouncementReq, long j, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            j = addGroupAnnouncementReq.groupId;
        }
        if ((i & 2) != 0) {
            str = addGroupAnnouncementReq.content;
        }
        if ((i & 4) != 0) {
            num = addGroupAnnouncementReq.pinStatus;
        }
        return addGroupAnnouncementReq.copy(j, str, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.pinStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddGroupAnnouncementReq copy(long j, @NotNull String str, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AddGroupAnnouncementReq(j, str, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddGroupAnnouncementReq)) {
            return false;
        }
        AddGroupAnnouncementReq addGroupAnnouncementReq = (AddGroupAnnouncementReq) obj;
        return this.groupId == addGroupAnnouncementReq.groupId && Intrinsics.EZpvd((Object) this.content, (Object) addGroupAnnouncementReq.content) && Intrinsics.EZpvd(this.pinStatus, addGroupAnnouncementReq.pinStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPinStatus() {
        return this.pinStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.groupId);
        int iHashCode2 = this.content.hashCode();
        Integer num = this.pinStatus;
        return (((iHashCode * 31) + iHashCode2) * 31) + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddGroupAnnouncementReq(groupId=" + this.groupId + ", content=" + this.content + ", pinStatus=" + this.pinStatus + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.AddGroupAnnouncementReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddGroupAnnouncementReq> serializer() {
            return AddGroupAnnouncementReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddGroupAnnouncementReq(int i, long j, String str, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, AddGroupAnnouncementReq$$serializer.INSTANCE.getDescriptor());
        }
        this.groupId = j;
        this.content = str;
        this.pinStatus = num;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(AddGroupAnnouncementReq addGroupAnnouncementReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, addGroupAnnouncementReq.groupId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, addGroupAnnouncementReq.content);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, addGroupAnnouncementReq.pinStatus);
    }

    public AddGroupAnnouncementReq(long j, @NotNull String str, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        this.groupId = j;
        this.content = str;
        this.pinStatus = num;
    }
}
