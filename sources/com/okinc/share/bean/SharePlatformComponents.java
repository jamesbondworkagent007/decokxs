package com.okinc.share.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class SharePlatformComponents implements Parcelable {
    private final AndroidPlatformComponents androidComponents;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SharePlatformComponents> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SharePlatformComponents> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SharePlatformComponents createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SharePlatformComponents(AndroidPlatformComponents.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SharePlatformComponents[] newArray(int i) {
            return new SharePlatformComponents[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SharePlatformComponents copy$default(SharePlatformComponents sharePlatformComponents, AndroidPlatformComponents androidPlatformComponents, int i, Object obj) {
        if ((i & 1) != 0) {
            androidPlatformComponents = sharePlatformComponents.androidComponents;
        }
        return sharePlatformComponents.copy(androidPlatformComponents);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AndroidPlatformComponents component1() {
        return this.androidComponents;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharePlatformComponents copy(@NotNull AndroidPlatformComponents androidPlatformComponents) {
        Intrinsics.checkNotNullParameter(androidPlatformComponents, "");
        return new SharePlatformComponents(androidPlatformComponents);
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
        return (obj instanceof SharePlatformComponents) && Intrinsics.EZpvd(this.androidComponents, ((SharePlatformComponents) obj).androidComponents);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AndroidPlatformComponents getAndroidComponents() {
        return this.androidComponents;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.androidComponents.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SharePlatformComponents(androidComponents=" + this.androidComponents + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.androidComponents.writeToParcel(parcel, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.SharePlatformComponents.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SharePlatformComponents> serializer() {
            return SharePlatformComponents$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SharePlatformComponents(int i, AndroidPlatformComponents androidPlatformComponents, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, SharePlatformComponents$$serializer.INSTANCE.getDescriptor());
        }
        this.androidComponents = androidPlatformComponents;
    }

    public SharePlatformComponents(@NotNull AndroidPlatformComponents androidPlatformComponents) {
        Intrinsics.checkNotNullParameter(androidPlatformComponents, "");
        this.androidComponents = androidPlatformComponents;
    }
}
