package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class InHouseIMDeleteGroupAnnouncementsResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int affectedRows;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InHouseIMDeleteGroupAnnouncementsResponse copy$default(InHouseIMDeleteGroupAnnouncementsResponse inHouseIMDeleteGroupAnnouncementsResponse, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = inHouseIMDeleteGroupAnnouncementsResponse.affectedRows;
        }
        return inHouseIMDeleteGroupAnnouncementsResponse.copy(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.affectedRows;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMDeleteGroupAnnouncementsResponse copy(int i) {
        return new InHouseIMDeleteGroupAnnouncementsResponse(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InHouseIMDeleteGroupAnnouncementsResponse) && this.affectedRows == ((InHouseIMDeleteGroupAnnouncementsResponse) obj).affectedRows;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAffectedRows() {
        return this.affectedRows;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Integer.hashCode(this.affectedRows);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMDeleteGroupAnnouncementsResponse(affectedRows=" + this.affectedRows + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.InHouseIMDeleteGroupAnnouncementsResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InHouseIMDeleteGroupAnnouncementsResponse> serializer() {
            return InHouseIMDeleteGroupAnnouncementsResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InHouseIMDeleteGroupAnnouncementsResponse(int i, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, InHouseIMDeleteGroupAnnouncementsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.affectedRows = i2;
    }

    public InHouseIMDeleteGroupAnnouncementsResponse(int i) {
        this.affectedRows = i;
    }
}
