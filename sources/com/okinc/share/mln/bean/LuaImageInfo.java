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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class LuaImageInfo implements Parcelable {
    private final String absolutePath;
    private final boolean autoMirrored;
    private String imagePath;
    private boolean isLocal;
    private boolean isTemp;
    private boolean isThemed;
    private final LuaMiniAppResourceLoader miniAppResourceLoader;
    private String name;
    private int okIcon;
    private LuaSize size;
    private LuaTintColor tintColor;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<LuaImageInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LuaImageInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LuaImageInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LuaImageInfo(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : LuaTintColor.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : LuaSize.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0 ? LuaMiniAppResourceLoader.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LuaImageInfo[] newArray(int i) {
            return new LuaImageInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LuaMiniAppResourceLoader component10() {
        return this.miniAppResourceLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.okIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isLocal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isTemp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isThemed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LuaTintColor component5() {
        return this.tintColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.imagePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LuaSize component7() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.autoMirrored;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.absolutePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LuaImageInfo copy(@NotNull String str, boolean z, boolean z2, boolean z3, LuaTintColor luaTintColor, String str2, LuaSize luaSize, boolean z4, String str3, LuaMiniAppResourceLoader luaMiniAppResourceLoader, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new LuaImageInfo(str, z, z2, z3, luaTintColor, str2, luaSize, z4, str3, luaMiniAppResourceLoader, i);
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
        if (!(obj instanceof LuaImageInfo)) {
            return false;
        }
        LuaImageInfo luaImageInfo = (LuaImageInfo) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) luaImageInfo.name) && this.isLocal == luaImageInfo.isLocal && this.isTemp == luaImageInfo.isTemp && this.isThemed == luaImageInfo.isThemed && Intrinsics.EZpvd(this.tintColor, luaImageInfo.tintColor) && Intrinsics.EZpvd((Object) this.imagePath, (Object) luaImageInfo.imagePath) && Intrinsics.EZpvd(this.size, luaImageInfo.size) && this.autoMirrored == luaImageInfo.autoMirrored && Intrinsics.EZpvd((Object) this.absolutePath, (Object) luaImageInfo.absolutePath) && Intrinsics.EZpvd(this.miniAppResourceLoader, luaImageInfo.miniAppResourceLoader) && this.okIcon == luaImageInfo.okIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAbsolutePath() {
        return this.absolutePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAutoMirrored() {
        return this.autoMirrored;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImagePath() {
        return this.imagePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LuaMiniAppResourceLoader getMiniAppResourceLoader() {
        return this.miniAppResourceLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOkIcon() {
        return this.okIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LuaSize getSize() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LuaTintColor getTintColor() {
        return this.tintColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.name.hashCode();
        int iHashCode2 = Boolean.hashCode(this.isLocal);
        int iHashCode3 = Boolean.hashCode(this.isTemp);
        int iHashCode4 = Boolean.hashCode(this.isThemed);
        LuaTintColor luaTintColor = this.tintColor;
        int iHashCode5 = luaTintColor == null ? 0 : luaTintColor.hashCode();
        String str = this.imagePath;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        LuaSize luaSize = this.size;
        int iHashCode7 = luaSize == null ? 0 : luaSize.hashCode();
        int iHashCode8 = Boolean.hashCode(this.autoMirrored);
        String str2 = this.absolutePath;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        LuaMiniAppResourceLoader luaMiniAppResourceLoader = this.miniAppResourceLoader;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (luaMiniAppResourceLoader != null ? luaMiniAppResourceLoader.hashCode() : 0)) * 31) + Integer.hashCode(this.okIcon);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isLocal() {
        return this.isLocal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isTemp() {
        return this.isTemp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isThemed() {
        return this.isThemed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImagePath(String str) {
        this.imagePath = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocal(boolean z) {
        this.isLocal = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOkIcon(int i) {
        this.okIcon = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSize(LuaSize luaSize) {
        this.size = luaSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTemp(boolean z) {
        this.isTemp = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setThemed(boolean z) {
        this.isThemed = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTintColor(LuaTintColor luaTintColor) {
        this.tintColor = luaTintColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LuaImageInfo(name=" + this.name + ", isLocal=" + this.isLocal + ", isTemp=" + this.isTemp + ", isThemed=" + this.isThemed + ", tintColor=" + this.tintColor + ", imagePath=" + this.imagePath + ", size=" + this.size + ", autoMirrored=" + this.autoMirrored + ", absolutePath=" + this.absolutePath + ", miniAppResourceLoader=" + this.miniAppResourceLoader + ", okIcon=" + this.okIcon + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.name);
        parcel.writeInt(this.isLocal ? 1 : 0);
        parcel.writeInt(this.isTemp ? 1 : 0);
        parcel.writeInt(this.isThemed ? 1 : 0);
        LuaTintColor luaTintColor = this.tintColor;
        if (luaTintColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            luaTintColor.writeToParcel(parcel, i);
        }
        parcel.writeString(this.imagePath);
        LuaSize luaSize = this.size;
        if (luaSize == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            luaSize.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.autoMirrored ? 1 : 0);
        parcel.writeString(this.absolutePath);
        LuaMiniAppResourceLoader luaMiniAppResourceLoader = this.miniAppResourceLoader;
        if (luaMiniAppResourceLoader == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            luaMiniAppResourceLoader.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.okIcon);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.mln.bean.LuaImageInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LuaImageInfo> serializer() {
            return LuaImageInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LuaImageInfo(int i, String str, boolean z, boolean z2, boolean z3, LuaTintColor luaTintColor, String str2, LuaSize luaSize, boolean z4, String str3, LuaMiniAppResourceLoader luaMiniAppResourceLoader, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, LuaImageInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        this.isLocal = z;
        this.isTemp = z2;
        this.isThemed = z3;
        if ((i & 16) == 0) {
            this.tintColor = null;
        } else {
            this.tintColor = luaTintColor;
        }
        if ((i & 32) == 0) {
            this.imagePath = null;
        } else {
            this.imagePath = str2;
        }
        if ((i & 64) == 0) {
            this.size = null;
        } else {
            this.size = luaSize;
        }
        if ((i & 128) == 0) {
            this.autoMirrored = false;
        } else {
            this.autoMirrored = z4;
        }
        if ((i & 256) == 0) {
            this.absolutePath = null;
        } else {
            this.absolutePath = str3;
        }
        if ((i & 512) == 0) {
            this.miniAppResourceLoader = null;
        } else {
            this.miniAppResourceLoader = luaMiniAppResourceLoader;
        }
        if ((i & 1024) == 0) {
            this.okIcon = 0;
        } else {
            this.okIcon = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKShare_sdk_share_impl(LuaImageInfo luaImageInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, luaImageInfo.name);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, luaImageInfo.isLocal);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 2, luaImageInfo.isTemp);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, luaImageInfo.isThemed);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || luaImageInfo.tintColor != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, LuaTintColor$$serializer.INSTANCE, luaImageInfo.tintColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || luaImageInfo.imagePath != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, luaImageInfo.imagePath);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || luaImageInfo.size != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, LuaSize$$serializer.INSTANCE, luaImageInfo.size);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || luaImageInfo.autoMirrored) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, luaImageInfo.autoMirrored);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || luaImageInfo.absolutePath != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, luaImageInfo.absolutePath);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || luaImageInfo.miniAppResourceLoader != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, LuaMiniAppResourceLoader$$serializer.INSTANCE, luaImageInfo.miniAppResourceLoader);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && luaImageInfo.okIcon == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 10, luaImageInfo.okIcon);
    }

    public LuaImageInfo(@NotNull String str, boolean z, boolean z2, boolean z3, LuaTintColor luaTintColor, String str2, LuaSize luaSize, boolean z4, String str3, LuaMiniAppResourceLoader luaMiniAppResourceLoader, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
        this.isLocal = z;
        this.isTemp = z2;
        this.isThemed = z3;
        this.tintColor = luaTintColor;
        this.imagePath = str2;
        this.size = luaSize;
        this.autoMirrored = z4;
        this.absolutePath = str3;
        this.miniAppResourceLoader = luaMiniAppResourceLoader;
        this.okIcon = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0045: CONSTRUCTOR 
  (r16v0 java.lang.String)
  (r17v0 boolean)
  (r18v0 boolean)
  (r19v0 boolean)
  (wrap:com.okinc.share.mln.bean.LuaTintColor:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.share.mln.bean.LuaTintColor) : (r20v0 com.okinc.share.mln.bean.LuaTintColor))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:com.okinc.share.mln.bean.LuaSize:?: TERNARY null = ((wrap:int:0x0013: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.share.mln.bean.LuaSize) : (r22v0 com.okinc.share.mln.bean.LuaSize))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r23v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r27v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:com.okinc.share.mln.bean.LuaMiniAppResourceLoader:?: TERNARY null = ((wrap:int:0x002c: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.share.mln.bean.LuaMiniAppResourceLoader) : (r25v0 com.okinc.share.mln.bean.LuaMiniAppResourceLoader))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0034: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r26v0 int))
 A[MD:(java.lang.String, boolean, boolean, boolean, com.okinc.share.mln.bean.LuaTintColor, java.lang.String, com.okinc.share.mln.bean.LuaSize, boolean, java.lang.String, com.okinc.share.mln.bean.LuaMiniAppResourceLoader, int):void (m)] (LINE:13) call: com.okinc.share.mln.bean.LuaImageInfo.<init>(java.lang.String, boolean, boolean, boolean, com.okinc.share.mln.bean.LuaTintColor, java.lang.String, com.okinc.share.mln.bean.LuaSize, boolean, java.lang.String, com.okinc.share.mln.bean.LuaMiniAppResourceLoader, int):void type: THIS */
    public /* synthetic */ LuaImageInfo(String str, boolean z, boolean z2, boolean z3, LuaTintColor luaTintColor, String str2, LuaSize luaSize, boolean z4, String str3, LuaMiniAppResourceLoader luaMiniAppResourceLoader, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, z2, z3, (i2 & 16) != 0 ? null : luaTintColor, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : luaSize, (i2 & 128) != 0 ? false : z4, (i2 & 256) != 0 ? null : str3, (i2 & 512) != 0 ? null : luaMiniAppResourceLoader, (i2 & 1024) != 0 ? 0 : i);
    }
}
