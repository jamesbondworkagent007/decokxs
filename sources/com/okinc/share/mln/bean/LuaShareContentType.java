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
public final class LuaShareContentType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LuaShareContentType[] $VALUES;
    public static final CREATOR CREATOR;
    private final int type;
    public static final LuaShareContentType LINK = new LuaShareContentType("LINK", 0, 1);
    public static final LuaShareContentType IMAGE = new LuaShareContentType("IMAGE", 1, 2);
    public static final LuaShareContentType ALL = new LuaShareContentType("ALL", 2, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LuaShareContentType[] $values() {
        return new LuaShareContentType[]{LINK, IMAGE, ALL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LuaShareContentType> getEntries() {
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

    private LuaShareContentType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        LuaShareContentType[] luaShareContentTypeArr$values = $values();
        $VALUES = luaShareContentTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(luaShareContentTypeArr$values);
        CREATOR = new CREATOR(null);
    }

    private LuaShareContentType(String str, int i, Parcel parcel) {
        this(str, i, parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.type);
    }

    public static final class CREATOR implements Parcelable.Creator<LuaShareContentType> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.mln.bean.LuaShareContentType.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final LuaShareContentType valueOf(int i) {
            if (i == 1) {
                return LuaShareContentType.LINK;
            }
            if (i == 2) {
                return LuaShareContentType.IMAGE;
            }
            if (i != 3) {
                return null;
            }
            return LuaShareContentType.ALL;
        }

        public final boolean isValid(int i) {
            LuaShareContentType luaShareContentType;
            LuaShareContentType[] luaShareContentTypeArrValues = LuaShareContentType.values();
            int length = luaShareContentTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    luaShareContentType = null;
                    break;
                }
                luaShareContentType = luaShareContentTypeArrValues[i2];
                if (luaShareContentType.getType() == i) {
                    break;
                }
                i2++;
            }
            return luaShareContentType != null;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LuaShareContentType createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            LuaShareContentType luaShareContentTypeValueOf = valueOf(parcel.readInt());
            Intrinsics.copydefault(luaShareContentTypeValueOf);
            return luaShareContentTypeValueOf;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LuaShareContentType[] newArray(int i) {
            return new LuaShareContentType[i];
        }
    }

    public static LuaShareContentType valueOf(String str) {
        return (LuaShareContentType) Enum.valueOf(LuaShareContentType.class, str);
    }

    public static LuaShareContentType[] values() {
        return (LuaShareContentType[]) $VALUES.clone();
    }
}
