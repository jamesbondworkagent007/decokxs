package com.okinc.okex.feedback.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class FileLimit {
    private int maxFile;
    private int maxFileCount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FileLimit copy$default(FileLimit fileLimit, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = fileLimit.maxFile;
        }
        if ((i3 & 2) != 0) {
            i2 = fileLimit.maxFileCount;
        }
        return fileLimit.copy(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.maxFile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.maxFileCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FileLimit copy(int i, int i2) {
        return new FileLimit(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileLimit)) {
            return false;
        }
        FileLimit fileLimit = (FileLimit) obj;
        return this.maxFile == fileLimit.maxFile && this.maxFileCount == fileLimit.maxFileCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMaxFile() {
        return this.maxFile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMaxFileCount() {
        return this.maxFileCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.maxFile) * 31) + Integer.hashCode(this.maxFileCount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxFile(int i) {
        this.maxFile = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxFileCount(int i) {
        this.maxFileCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FileLimit(maxFile=" + this.maxFile + ", maxFileCount=" + this.maxFileCount + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.feedback.net.bean.FileLimit.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FileLimit> serializer() {
            return FileLimit$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FileLimit(int i, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, FileLimit$$serializer.INSTANCE.getDescriptor());
        }
        this.maxFile = i2;
        this.maxFileCount = i3;
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(FileLimit fileLimit, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, fileLimit.maxFile);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, fileLimit.maxFileCount);
    }

    public FileLimit(int i, int i2) {
        this.maxFile = i;
        this.maxFileCount = i2;
    }
}
