package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class SetContactRemarkReq {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long contactUid;
    private final String remarkName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SetContactRemarkReq copy$default(SetContactRemarkReq setContactRemarkReq, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = setContactRemarkReq.contactUid;
        }
        if ((i & 2) != 0) {
            str = setContactRemarkReq.remarkName;
        }
        return setContactRemarkReq.copy(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.contactUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.remarkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SetContactRemarkReq copy(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new SetContactRemarkReq(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetContactRemarkReq)) {
            return false;
        }
        SetContactRemarkReq setContactRemarkReq = (SetContactRemarkReq) obj;
        return this.contactUid == setContactRemarkReq.contactUid && Intrinsics.EZpvd((Object) this.remarkName, (Object) setContactRemarkReq.remarkName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getContactUid() {
        return this.contactUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRemarkName() {
        return this.remarkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.contactUid) * 31) + this.remarkName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SetContactRemarkReq(contactUid=" + this.contactUid + ", remarkName=" + this.remarkName + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.SetContactRemarkReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SetContactRemarkReq> serializer() {
            return SetContactRemarkReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SetContactRemarkReq(int i, long j, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, SetContactRemarkReq$$serializer.INSTANCE.getDescriptor());
        }
        this.contactUid = j;
        this.remarkName = str;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(SetContactRemarkReq setContactRemarkReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, setContactRemarkReq.contactUid);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, setContactRemarkReq.remarkName);
    }

    public SetContactRemarkReq(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.contactUid = j;
        this.remarkName = str;
    }
}
