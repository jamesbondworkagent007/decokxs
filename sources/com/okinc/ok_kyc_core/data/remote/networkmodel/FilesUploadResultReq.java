package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class FilesUploadResultReq implements Parcelable {
    private List<SingleFileUploadResultReq> listOfFiles;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FilesUploadResultReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(SingleFileUploadResultReq$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<FilesUploadResultReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilesUploadResultReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(SingleFileUploadResultReq.CREATOR.createFromParcel(parcel));
            }
            return new FilesUploadResultReq(arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilesUploadResultReq[] newArray(int i) {
            return new FilesUploadResultReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.FilesUploadResultReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FilesUploadResultReq copy$default(FilesUploadResultReq filesUploadResultReq, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = filesUploadResultReq.listOfFiles;
        }
        return filesUploadResultReq.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SingleFileUploadResultReq> component1() {
        return this.listOfFiles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FilesUploadResultReq copy(@NotNull List<SingleFileUploadResultReq> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new FilesUploadResultReq(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FilesUploadResultReq) && Intrinsics.EZpvd(this.listOfFiles, ((FilesUploadResultReq) obj).listOfFiles);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SingleFileUploadResultReq> getListOfFiles() {
        return this.listOfFiles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.listOfFiles.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setListOfFiles(@NotNull List<SingleFileUploadResultReq> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.listOfFiles = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FilesUploadResultReq(listOfFiles=" + this.listOfFiles + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<SingleFileUploadResultReq> list = this.listOfFiles;
        parcel.writeInt(list.size());
        Iterator<SingleFileUploadResultReq> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.FilesUploadResultReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FilesUploadResultReq> serializer() {
            return FilesUploadResultReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FilesUploadResultReq(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, FilesUploadResultReq$$serializer.INSTANCE.getDescriptor());
        }
        this.listOfFiles = list;
    }

    public FilesUploadResultReq(@NotNull List<SingleFileUploadResultReq> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.listOfFiles = list;
    }
}
