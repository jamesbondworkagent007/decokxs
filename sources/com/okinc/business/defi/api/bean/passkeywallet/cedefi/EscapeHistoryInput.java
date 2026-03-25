package com.okinc.business.defi.api.bean.passkeywallet.cedefi;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class EscapeHistoryInput implements Parcelable {
    private ProjectSource projectSource;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EscapeHistoryInput> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {EnumsKt.createSimpleEnumSerializer("com.okinc.business.defi.api.bean.passkeywallet.cedefi.ProjectSource", ProjectSource.values())};

    public static final class Creator implements Parcelable.Creator<EscapeHistoryInput> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeHistoryInput createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EscapeHistoryInput(ProjectSource.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeHistoryInput[] newArray(int i) {
            return new EscapeHistoryInput[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EscapeHistoryInput copy$default(EscapeHistoryInput escapeHistoryInput, ProjectSource projectSource, int i, Object obj) {
        if ((i & 1) != 0) {
            projectSource = escapeHistoryInput.projectSource;
        }
        return escapeHistoryInput.copy(projectSource);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProjectSource component1() {
        return this.projectSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapeHistoryInput copy(@NotNull ProjectSource projectSource) {
        Intrinsics.checkNotNullParameter(projectSource, "");
        return new EscapeHistoryInput(projectSource);
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
        return (obj instanceof EscapeHistoryInput) && this.projectSource == ((EscapeHistoryInput) obj).projectSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProjectSource getProjectSource() {
        return this.projectSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.projectSource.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProjectSource(@NotNull ProjectSource projectSource) {
        Intrinsics.checkNotNullParameter(projectSource, "");
        this.projectSource = projectSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EscapeHistoryInput(projectSource=" + this.projectSource + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.projectSource.name());
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeHistoryInput.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EscapeHistoryInput> serializer() {
            return EscapeHistoryInput$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EscapeHistoryInput(int i, ProjectSource projectSource, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, EscapeHistoryInput$$serializer.INSTANCE.getDescriptor());
        }
        this.projectSource = projectSource;
    }

    public EscapeHistoryInput(@NotNull ProjectSource projectSource) {
        Intrinsics.checkNotNullParameter(projectSource, "");
        this.projectSource = projectSource;
    }
}
