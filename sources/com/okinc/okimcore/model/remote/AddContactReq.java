package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class AddContactReq {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long contactUid;
    private final Long memberOfGroup;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AddContactReq copy$default(AddContactReq addContactReq, long j, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            j = addContactReq.contactUid;
        }
        if ((i & 2) != 0) {
            l = addContactReq.memberOfGroup;
        }
        return addContactReq.copy(j, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.contactUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.memberOfGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddContactReq copy(long j, Long l) {
        return new AddContactReq(j, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddContactReq)) {
            return false;
        }
        AddContactReq addContactReq = (AddContactReq) obj;
        return this.contactUid == addContactReq.contactUid && Intrinsics.EZpvd(this.memberOfGroup, addContactReq.memberOfGroup);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getContactUid() {
        return this.contactUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getMemberOfGroup() {
        return this.memberOfGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.contactUid);
        Long l = this.memberOfGroup;
        return (iHashCode * 31) + (l == null ? 0 : l.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddContactReq(contactUid=" + this.contactUid + ", memberOfGroup=" + this.memberOfGroup + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.AddContactReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddContactReq> serializer() {
            return AddContactReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddContactReq(int i, long j, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, AddContactReq$$serializer.INSTANCE.getDescriptor());
        }
        this.contactUid = j;
        this.memberOfGroup = l;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(AddContactReq addContactReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, addContactReq.contactUid);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, addContactReq.memberOfGroup);
    }

    public AddContactReq(long j, Long l) {
        this.contactUid = j;
        this.memberOfGroup = l;
    }
}
