package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class InHouseIMAddGroupAnnouncementResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long id;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InHouseIMAddGroupAnnouncementResponse copy$default(InHouseIMAddGroupAnnouncementResponse inHouseIMAddGroupAnnouncementResponse, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = inHouseIMAddGroupAnnouncementResponse.id;
        }
        return inHouseIMAddGroupAnnouncementResponse.copy(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMAddGroupAnnouncementResponse copy(long j) {
        return new InHouseIMAddGroupAnnouncementResponse(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InHouseIMAddGroupAnnouncementResponse) && this.id == ((InHouseIMAddGroupAnnouncementResponse) obj).id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Long.hashCode(this.id);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMAddGroupAnnouncementResponse(id=" + this.id + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.InHouseIMAddGroupAnnouncementResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseIMAddGroupAnnouncementResponse> serializer() {
            return InHouseIMAddGroupAnnouncementResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InHouseIMAddGroupAnnouncementResponse(int i, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, InHouseIMAddGroupAnnouncementResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.id = j;
    }

    public InHouseIMAddGroupAnnouncementResponse(long j) {
        this.id = j;
    }
}
