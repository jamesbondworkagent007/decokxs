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
/* JADX INFO: loaded from: classes11.dex */
public final class LuaShareFooterType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LuaShareFooterType[] $VALUES;
    public static final CREATOR CREATOR;
    private final int type;
    public static final LuaShareFooterType DEFAULT = new LuaShareFooterType("DEFAULT", 0, 0);
    public static final LuaShareFooterType CUSTOM = new LuaShareFooterType("CUSTOM", 1, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LuaShareFooterType[] $values() {
        return new LuaShareFooterType[]{DEFAULT, CUSTOM};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LuaShareFooterType> getEntries() {
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

    private LuaShareFooterType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        LuaShareFooterType[] luaShareFooterTypeArr$values = $values();
        $VALUES = luaShareFooterTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(luaShareFooterTypeArr$values);
        CREATOR = new CREATOR(null);
    }

    private LuaShareFooterType(String str, int i, Parcel parcel) {
        this(str, i, parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.type);
    }

    public static final class CREATOR implements Parcelable.Creator<LuaShareFooterType> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.mln.bean.LuaShareFooterType.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final LuaShareFooterType valueOf(int i) {
            if (i == 0) {
                return LuaShareFooterType.DEFAULT;
            }
            if (i != 1) {
                return null;
            }
            return LuaShareFooterType.CUSTOM;
        }

        public final boolean isValid(int i) {
            LuaShareFooterType luaShareFooterType;
            LuaShareFooterType[] luaShareFooterTypeArrValues = LuaShareFooterType.values();
            int length = luaShareFooterTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    luaShareFooterType = null;
                    break;
                }
                luaShareFooterType = luaShareFooterTypeArrValues[i2];
                if (luaShareFooterType.getType() == i) {
                    break;
                }
                i2++;
            }
            return luaShareFooterType != null;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LuaShareFooterType createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            LuaShareFooterType luaShareFooterTypeValueOf = valueOf(parcel.readInt());
            Intrinsics.copydefault(luaShareFooterTypeValueOf);
            return luaShareFooterTypeValueOf;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LuaShareFooterType[] newArray(int i) {
            return new LuaShareFooterType[i];
        }
    }

    public static LuaShareFooterType valueOf(String str) {
        return (LuaShareFooterType) Enum.valueOf(LuaShareFooterType.class, str);
    }

    public static LuaShareFooterType[] values() {
        return (LuaShareFooterType[]) $VALUES.clone();
    }
}
