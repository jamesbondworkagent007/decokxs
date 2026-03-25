package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class UploadImageResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String avatar;
    private final Integer avatarStatus;
    private final Long imageId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UploadImageResponse() {
        this((String) null, (Integer) null, (Long) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UploadImageResponse copy$default(UploadImageResponse uploadImageResponse, String str, Integer num, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uploadImageResponse.avatar;
        }
        if ((i & 2) != 0) {
            num = uploadImageResponse.avatarStatus;
        }
        if ((i & 4) != 0) {
            l = uploadImageResponse.imageId;
        }
        return uploadImageResponse.copy(str, num, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.avatarStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.imageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UploadImageResponse copy(String str, Integer num, Long l) {
        return new UploadImageResponse(str, num, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadImageResponse)) {
            return false;
        }
        UploadImageResponse uploadImageResponse = (UploadImageResponse) obj;
        return Intrinsics.EZpvd((Object) this.avatar, (Object) uploadImageResponse.avatar) && Intrinsics.EZpvd(this.avatarStatus, uploadImageResponse.avatarStatus) && Intrinsics.EZpvd(this.imageId, uploadImageResponse.imageId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAvatarStatus() {
        return this.avatarStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getImageId() {
        return this.imageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.avatar;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.avatarStatus;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        Long l = this.imageId;
        return (((iHashCode * 31) + iHashCode2) * 31) + (l != null ? l.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UploadImageResponse(avatar=" + this.avatar + ", avatarStatus=" + this.avatarStatus + ", imageId=" + this.imageId + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.UploadImageResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UploadImageResponse> serializer() {
            return UploadImageResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UploadImageResponse(int i, String str, Integer num, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.avatar = null;
        } else {
            this.avatar = str;
        }
        if ((i & 2) == 0) {
            this.avatarStatus = null;
        } else {
            this.avatarStatus = num;
        }
        if ((i & 4) == 0) {
            this.imageId = null;
        } else {
            this.imageId = l;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(UploadImageResponse uploadImageResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || uploadImageResponse.avatar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, uploadImageResponse.avatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || uploadImageResponse.avatarStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, uploadImageResponse.avatarStatus);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && uploadImageResponse.imageId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, uploadImageResponse.imageId);
    }

    public UploadImageResponse(String str, Integer num, Long l) {
        this.avatar = str;
        this.avatarStatus = num;
        this.imageId = l;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r4v0 java.lang.Long))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.Long):void (m)] (LINE:92) call: com.okinc.okimcore.model.remote.UploadImageResponse.<init>(java.lang.String, java.lang.Integer, java.lang.Long):void type: THIS */
    public /* synthetic */ UploadImageResponse(String str, Integer num, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : l);
    }
}
