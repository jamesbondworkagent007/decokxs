package com.okinc.crcore.coreapi.net.responsebean.content;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CommunitySourceIconBean implements Parcelable {
    public static final int $stable = 0;
    private final String dark;
    private final String light;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CommunitySourceIconBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CommunitySourceIconBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommunitySourceIconBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CommunitySourceIconBean(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommunitySourceIconBean[] newArray(int i) {
            return new CommunitySourceIconBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CommunitySourceIconBean copy$default(CommunitySourceIconBean communitySourceIconBean, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = communitySourceIconBean.dark;
        }
        if ((i & 2) != 0) {
            str2 = communitySourceIconBean.light;
        }
        return communitySourceIconBean.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.dark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.light;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommunitySourceIconBean copy(String str, String str2) {
        return new CommunitySourceIconBean(str, str2);
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
        if (!(obj instanceof CommunitySourceIconBean)) {
            return false;
        }
        CommunitySourceIconBean communitySourceIconBean = (CommunitySourceIconBean) obj;
        return Intrinsics.EZpvd((Object) this.dark, (Object) communitySourceIconBean.dark) && Intrinsics.EZpvd((Object) this.light, (Object) communitySourceIconBean.light);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDark() {
        return this.dark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLight() {
        return this.light;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.dark;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.light;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CommunitySourceIconBean(dark=" + this.dark + ", light=" + this.light + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.dark);
        parcel.writeString(this.light);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.content.CommunitySourceIconBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CommunitySourceIconBean> serializer() {
            return CommunitySourceIconBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CommunitySourceIconBean(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, CommunitySourceIconBean$$serializer.INSTANCE.getDescriptor());
        }
        this.dark = str;
        this.light = str2;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(CommunitySourceIconBean communitySourceIconBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, communitySourceIconBean.dark);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, communitySourceIconBean.light);
    }

    public CommunitySourceIconBean(String str, String str2) {
        this.dark = str;
        this.light = str2;
    }
}
