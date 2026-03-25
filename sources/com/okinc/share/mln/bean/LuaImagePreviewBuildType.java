package com.okinc.share.mln.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class LuaImagePreviewBuildType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LuaImagePreviewBuildType[] $VALUES;
    public static final CREATOR CREATOR;
    private final int type;
    public static final LuaImagePreviewBuildType DEFAULT = new LuaImagePreviewBuildType("DEFAULT", 0, 0);
    public static final LuaImagePreviewBuildType CUSTOM = new LuaImagePreviewBuildType("CUSTOM", 1, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LuaImagePreviewBuildType[] $values() {
        return new LuaImagePreviewBuildType[]{DEFAULT, CUSTOM};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LuaImagePreviewBuildType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    private LuaImagePreviewBuildType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        LuaImagePreviewBuildType[] luaImagePreviewBuildTypeArr$values = $values();
        $VALUES = luaImagePreviewBuildTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(luaImagePreviewBuildTypeArr$values);
        CREATOR = new CREATOR(null);
    }

    private LuaImagePreviewBuildType(String str, int i, Parcel parcel) {
        this(str, i, parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.type);
    }

    public static final class CREATOR implements Parcelable.Creator<LuaImagePreviewBuildType> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.mln.bean.LuaImagePreviewBuildType.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final LuaImagePreviewBuildType valueOf(int i) {
            LuaImagePreviewBuildType luaImagePreviewBuildType = LuaImagePreviewBuildType.DEFAULT;
            if (i == luaImagePreviewBuildType.getType()) {
                return luaImagePreviewBuildType;
            }
            LuaImagePreviewBuildType luaImagePreviewBuildType2 = LuaImagePreviewBuildType.CUSTOM;
            if (i == luaImagePreviewBuildType2.getType()) {
                return luaImagePreviewBuildType2;
            }
            return null;
        }

        public final boolean isValid(int i) {
            LuaImagePreviewBuildType luaImagePreviewBuildType;
            LuaImagePreviewBuildType[] luaImagePreviewBuildTypeArrValues = LuaImagePreviewBuildType.values();
            int length = luaImagePreviewBuildTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    luaImagePreviewBuildType = null;
                    break;
                }
                luaImagePreviewBuildType = luaImagePreviewBuildTypeArrValues[i2];
                if (luaImagePreviewBuildType.getType() == i) {
                    break;
                }
                i2++;
            }
            return luaImagePreviewBuildType != null;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LuaImagePreviewBuildType createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            LuaImagePreviewBuildType luaImagePreviewBuildTypeValueOf = valueOf(parcel.readInt());
            Intrinsics.copydefault(luaImagePreviewBuildTypeValueOf);
            return luaImagePreviewBuildTypeValueOf;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LuaImagePreviewBuildType[] newArray(int i) {
            return new LuaImagePreviewBuildType[i];
        }
    }

    public static LuaImagePreviewBuildType valueOf(String str) {
        return (LuaImagePreviewBuildType) Enum.valueOf(LuaImagePreviewBuildType.class, str);
    }

    public static LuaImagePreviewBuildType[] values() {
        return (LuaImagePreviewBuildType[]) $VALUES.clone();
    }
}
