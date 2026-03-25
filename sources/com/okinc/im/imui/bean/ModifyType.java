package com.okinc.im.imui.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class ModifyType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ModifyType[] $VALUES;
    public static final CREATOR CREATOR;
    private final int type;
    public static final ModifyType ADD = new ModifyType("ADD", 0, 0);
    public static final ModifyType REMOVE = new ModifyType("REMOVE", 1, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ModifyType[] $values() {
        return new ModifyType[]{ADD, REMOVE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ModifyType> getEntries() {
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

    private ModifyType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        ModifyType[] modifyTypeArr$values = $values();
        $VALUES = modifyTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(modifyTypeArr$values);
        CREATOR = new CREATOR(null);
    }

    private ModifyType(String str, int i, Parcel parcel) {
        this(str, i, parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.type);
    }

    public static final class CREATOR implements Parcelable.Creator<ModifyType> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.bean.ModifyType.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final ModifyType valueOf(int i) {
            if (i == 0) {
                return ModifyType.ADD;
            }
            if (i != 1) {
                return null;
            }
            return ModifyType.REMOVE;
        }

        public final boolean isValid(int i) {
            ModifyType modifyType;
            ModifyType[] modifyTypeArrValues = ModifyType.values();
            int length = modifyTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    modifyType = null;
                    break;
                }
                modifyType = modifyTypeArrValues[i2];
                if (modifyType.getType() == i) {
                    break;
                }
                i2++;
            }
            return modifyType != null;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ModifyType createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ModifyType modifyTypeValueOf = valueOf(parcel.readInt());
            Intrinsics.copydefault(modifyTypeValueOf);
            return modifyTypeValueOf;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ModifyType[] newArray(int i) {
            return new ModifyType[i];
        }
    }

    public static ModifyType valueOf(String str) {
        return (ModifyType) Enum.valueOf(ModifyType.class, str);
    }

    public static ModifyType[] values() {
        return (ModifyType[]) $VALUES.clone();
    }
}
