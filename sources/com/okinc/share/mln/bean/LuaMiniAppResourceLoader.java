package com.okinc.share.mln.bean;

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

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class LuaMiniAppResourceLoader implements Parcelable {
    private String miniAppRootDir;
    private int type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<LuaMiniAppResourceLoader> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LuaMiniAppResourceLoader> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LuaMiniAppResourceLoader createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LuaMiniAppResourceLoader(parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LuaMiniAppResourceLoader[] newArray(int i) {
            return new LuaMiniAppResourceLoader[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LuaMiniAppResourceLoader copy$default(LuaMiniAppResourceLoader luaMiniAppResourceLoader, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = luaMiniAppResourceLoader.type;
        }
        if ((i2 & 2) != 0) {
            str = luaMiniAppResourceLoader.miniAppRootDir;
        }
        return luaMiniAppResourceLoader.copy(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.miniAppRootDir;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LuaMiniAppResourceLoader copy(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new LuaMiniAppResourceLoader(i, str);
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
        if (!(obj instanceof LuaMiniAppResourceLoader)) {
            return false;
        }
        LuaMiniAppResourceLoader luaMiniAppResourceLoader = (LuaMiniAppResourceLoader) obj;
        return this.type == luaMiniAppResourceLoader.type && Intrinsics.EZpvd((Object) this.miniAppRootDir, (Object) luaMiniAppResourceLoader.miniAppRootDir);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMiniAppRootDir() {
        return this.miniAppRootDir;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.type) * 31) + this.miniAppRootDir.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMiniAppRootDir(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.miniAppRootDir = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(int i) {
        this.type = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LuaMiniAppResourceLoader(type=" + this.type + ", miniAppRootDir=" + this.miniAppRootDir + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.type);
        parcel.writeString(this.miniAppRootDir);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.mln.bean.LuaMiniAppResourceLoader.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LuaMiniAppResourceLoader> serializer() {
            return LuaMiniAppResourceLoader$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LuaMiniAppResourceLoader(int i, int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, LuaMiniAppResourceLoader$$serializer.INSTANCE.getDescriptor());
        }
        this.type = i2;
        this.miniAppRootDir = str;
    }

    public static final /* synthetic */ void write$Self$OKShare_sdk_share_impl(LuaMiniAppResourceLoader luaMiniAppResourceLoader, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, luaMiniAppResourceLoader.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, luaMiniAppResourceLoader.miniAppRootDir);
    }

    public LuaMiniAppResourceLoader(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = i;
        this.miniAppRootDir = str;
    }
}
