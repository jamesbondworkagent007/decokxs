package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class UploadMediaResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String fileId;
    private final URLS urls;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UploadMediaResponse() {
        this((URLS) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UploadMediaResponse copy$default(UploadMediaResponse uploadMediaResponse, URLS urls, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            urls = uploadMediaResponse.urls;
        }
        if ((i & 2) != 0) {
            str = uploadMediaResponse.fileId;
        }
        return uploadMediaResponse.copy(urls, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final URLS component1() {
        return this.urls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fileId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UploadMediaResponse copy(URLS urls, String str) {
        return new UploadMediaResponse(urls, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadMediaResponse)) {
            return false;
        }
        UploadMediaResponse uploadMediaResponse = (UploadMediaResponse) obj;
        return Intrinsics.EZpvd(this.urls, uploadMediaResponse.urls) && Intrinsics.EZpvd((Object) this.fileId, (Object) uploadMediaResponse.fileId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFileId() {
        return this.fileId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final URLS getUrls() {
        return this.urls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        URLS urls = this.urls;
        int iHashCode = urls == null ? 0 : urls.hashCode();
        String str = this.fileId;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UploadMediaResponse(urls=" + this.urls + ", fileId=" + this.fileId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.UploadMediaResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UploadMediaResponse> serializer() {
            return UploadMediaResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UploadMediaResponse(int i, URLS urls, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.urls = null;
        } else {
            this.urls = urls;
        }
        if ((i & 2) == 0) {
            this.fileId = null;
        } else {
            this.fileId = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(UploadMediaResponse uploadMediaResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || uploadMediaResponse.urls != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, URLS$$serializer.INSTANCE, uploadMediaResponse.urls);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && uploadMediaResponse.fileId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, uploadMediaResponse.fileId);
    }

    public UploadMediaResponse(URLS urls, String str) {
        this.urls = urls;
        this.fileId = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.okimcore.model.remote.URLS:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.URLS) : (r2v0 com.okinc.okimcore.model.remote.URLS))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(com.okinc.okimcore.model.remote.URLS, java.lang.String):void (m)] (LINE:8) call: com.okinc.okimcore.model.remote.UploadMediaResponse.<init>(com.okinc.okimcore.model.remote.URLS, java.lang.String):void type: THIS */
    public /* synthetic */ UploadMediaResponse(URLS urls, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : urls, (i & 2) != 0 ? null : str);
    }
}
