package com.okinc.okex.campaign.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class RedirectTarget implements Parcelable {
    public static final int $stable = 0;
    private final String anchor;
    private final RedirectType type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<RedirectTarget> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {RedirectType.Companion.serializer(), null};

    public static final class Creator implements Parcelable.Creator<RedirectTarget> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RedirectTarget createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RedirectTarget(RedirectType.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RedirectTarget[] newArray(int i) {
            return new RedirectTarget[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RedirectTarget copy$default(RedirectTarget redirectTarget, RedirectType redirectType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            redirectType = redirectTarget.type;
        }
        if ((i & 2) != 0) {
            str = redirectTarget.anchor;
        }
        return redirectTarget.copy(redirectType, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RedirectType component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.anchor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RedirectTarget copy(@NotNull RedirectType redirectType, @NotNull String str) {
        Intrinsics.checkNotNullParameter(redirectType, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new RedirectTarget(redirectType, str);
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
        if (!(obj instanceof RedirectTarget)) {
            return false;
        }
        RedirectTarget redirectTarget = (RedirectTarget) obj;
        return this.type == redirectTarget.type && Intrinsics.EZpvd((Object) this.anchor, (Object) redirectTarget.anchor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAnchor() {
        return this.anchor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RedirectType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.type.hashCode() * 31) + this.anchor.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RedirectTarget(type=" + this.type + ", anchor=" + this.anchor + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type.name());
        parcel.writeString(this.anchor);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.campaign.bean.RedirectTarget.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RedirectTarget> serializer() {
            return RedirectTarget$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RedirectTarget(int i, RedirectType redirectType, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, RedirectTarget$$serializer.INSTANCE.getDescriptor());
        }
        this.type = redirectType;
        this.anchor = str;
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(RedirectTarget redirectTarget, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], redirectTarget.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, redirectTarget.anchor);
    }

    public RedirectTarget(@NotNull RedirectType redirectType, @NotNull String str) {
        Intrinsics.checkNotNullParameter(redirectType, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.type = redirectType;
        this.anchor = str;
    }
}
