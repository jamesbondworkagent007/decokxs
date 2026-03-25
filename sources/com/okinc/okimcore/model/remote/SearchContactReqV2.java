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
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class SearchContactReqV2 {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String targetEmail;
    private final PhoneNumber targetPhone;
    private final Long targetUid;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SearchContactReqV2 copy$default(SearchContactReqV2 searchContactReqV2, Long l, String str, PhoneNumber phoneNumber, int i, Object obj) {
        if ((i & 1) != 0) {
            l = searchContactReqV2.targetUid;
        }
        if ((i & 2) != 0) {
            str = searchContactReqV2.targetEmail;
        }
        if ((i & 4) != 0) {
            phoneNumber = searchContactReqV2.targetPhone;
        }
        return searchContactReqV2.copy(l, str, phoneNumber);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.targetUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.targetEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PhoneNumber component3() {
        return this.targetPhone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchContactReqV2 copy(Long l, String str, PhoneNumber phoneNumber) {
        return new SearchContactReqV2(l, str, phoneNumber);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchContactReqV2)) {
            return false;
        }
        SearchContactReqV2 searchContactReqV2 = (SearchContactReqV2) obj;
        return Intrinsics.EZpvd(this.targetUid, searchContactReqV2.targetUid) && Intrinsics.EZpvd((Object) this.targetEmail, (Object) searchContactReqV2.targetEmail) && Intrinsics.EZpvd(this.targetPhone, searchContactReqV2.targetPhone);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetEmail() {
        return this.targetEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PhoneNumber getTargetPhone() {
        return this.targetPhone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getTargetUid() {
        return this.targetUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.targetUid;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.targetEmail;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        PhoneNumber phoneNumber = this.targetPhone;
        return (((iHashCode * 31) + iHashCode2) * 31) + (phoneNumber != null ? phoneNumber.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchContactReqV2(targetUid=" + this.targetUid + ", targetEmail=" + this.targetEmail + ", targetPhone=" + this.targetPhone + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.SearchContactReqV2.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SearchContactReqV2> serializer() {
            return SearchContactReqV2$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SearchContactReqV2(int i, Long l, String str, PhoneNumber phoneNumber, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, SearchContactReqV2$$serializer.INSTANCE.getDescriptor());
        }
        this.targetUid = l;
        this.targetEmail = str;
        this.targetPhone = phoneNumber;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(SearchContactReqV2 searchContactReqV2, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, searchContactReqV2.targetUid);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, searchContactReqV2.targetEmail);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, PhoneNumber$$serializer.INSTANCE, searchContactReqV2.targetPhone);
    }

    public SearchContactReqV2(Long l, String str, PhoneNumber phoneNumber) {
        this.targetUid = l;
        this.targetEmail = str;
        this.targetPhone = phoneNumber;
    }
}
