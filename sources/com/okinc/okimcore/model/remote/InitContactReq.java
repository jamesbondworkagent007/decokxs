package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InitContactReq {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long contactUid;
    private final String memberOfGroup;
    private final int relationSourceType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InitContactReq copy$default(InitContactReq initContactReq, long j, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = initContactReq.contactUid;
        }
        if ((i2 & 2) != 0) {
            i = initContactReq.relationSourceType;
        }
        if ((i2 & 4) != 0) {
            str = initContactReq.memberOfGroup;
        }
        return initContactReq.copy(j, i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.contactUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.relationSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.memberOfGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InitContactReq copy(long j, int i, String str) {
        return new InitContactReq(j, i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitContactReq)) {
            return false;
        }
        InitContactReq initContactReq = (InitContactReq) obj;
        return this.contactUid == initContactReq.contactUid && this.relationSourceType == initContactReq.relationSourceType && Intrinsics.EZpvd((Object) this.memberOfGroup, (Object) initContactReq.memberOfGroup);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getContactUid() {
        return this.contactUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMemberOfGroup() {
        return this.memberOfGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRelationSourceType() {
        return this.relationSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.contactUid);
        int iHashCode2 = Integer.hashCode(this.relationSourceType);
        String str = this.memberOfGroup;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InitContactReq(contactUid=" + this.contactUid + ", relationSourceType=" + this.relationSourceType + ", memberOfGroup=" + this.memberOfGroup + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.InitContactReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InitContactReq> serializer() {
            return InitContactReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InitContactReq(int i, long j, int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, InitContactReq$$serializer.INSTANCE.getDescriptor());
        }
        this.contactUid = j;
        this.relationSourceType = i2;
        this.memberOfGroup = str;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(InitContactReq initContactReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, initContactReq.contactUid);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, initContactReq.relationSourceType);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, initContactReq.memberOfGroup);
    }

    public InitContactReq(long j, int i, String str) {
        this.contactUid = j;
        this.relationSourceType = i;
        this.memberOfGroup = str;
    }
}
