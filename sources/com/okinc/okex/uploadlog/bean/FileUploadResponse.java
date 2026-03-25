package com.okinc.okex.uploadlog.bean;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class FileUploadResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    @SerializedName("fileId")
    private final String fileId;

    @SerializedName("fileName")
    private final String fileName;

    @SerializedName("filePath")
    private final String filePath;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FileUploadResponse copy$default(FileUploadResponse fileUploadResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fileUploadResponse.fileId;
        }
        if ((i & 2) != 0) {
            str2 = fileUploadResponse.fileName;
        }
        if ((i & 4) != 0) {
            str3 = fileUploadResponse.filePath;
        }
        return fileUploadResponse.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fileId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fileName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.filePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FileUploadResponse copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new FileUploadResponse(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileUploadResponse)) {
            return false;
        }
        FileUploadResponse fileUploadResponse = (FileUploadResponse) obj;
        return Intrinsics.EZpvd((Object) this.fileId, (Object) fileUploadResponse.fileId) && Intrinsics.EZpvd((Object) this.fileName, (Object) fileUploadResponse.fileName) && Intrinsics.EZpvd((Object) this.filePath, (Object) fileUploadResponse.filePath);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFileId() {
        return this.fileId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFilePath() {
        return this.filePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.fileId.hashCode() * 31) + this.fileName.hashCode()) * 31) + this.filePath.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FileUploadResponse(fileId=" + this.fileId + ", fileName=" + this.fileName + ", filePath=" + this.filePath + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.uploadlog.bean.FileUploadResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FileUploadResponse> serializer() {
            return FileUploadResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FileUploadResponse(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, FileUploadResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.fileId = str;
        this.fileName = str2;
        this.filePath = str3;
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(FileUploadResponse fileUploadResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, fileUploadResponse.fileId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, fileUploadResponse.fileName);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, fileUploadResponse.filePath);
    }

    public FileUploadResponse(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.fileId = str;
        this.fileName = str2;
        this.filePath = str3;
    }
}
