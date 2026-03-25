package com.okinc.share.api.edit;

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
public final class EditMenuType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ EditMenuType[] $VALUES;
    public static final CREATOR CREATOR;
    private final int type;
    public static final EditMenuType CHECKABLE = new EditMenuType("CHECKABLE", 0, 1);
    public static final EditMenuType SUB_MENU = new EditMenuType("SUB_MENU", 1, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ EditMenuType[] $values() {
        return new EditMenuType[]{CHECKABLE, SUB_MENU};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<EditMenuType> getEntries() {
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

    private EditMenuType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        EditMenuType[] editMenuTypeArr$values = $values();
        $VALUES = editMenuTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(editMenuTypeArr$values);
        CREATOR = new CREATOR(null);
    }

    private EditMenuType(String str, int i, Parcel parcel) {
        this(str, i, parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.type);
    }

    public static final class CREATOR implements Parcelable.Creator<EditMenuType> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.api.edit.EditMenuType.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final EditMenuType valueOf(int i) {
            if (i == 1) {
                return EditMenuType.CHECKABLE;
            }
            if (i != 2) {
                return null;
            }
            return EditMenuType.SUB_MENU;
        }

        public final boolean isValid(int i) {
            EditMenuType editMenuType;
            EditMenuType[] editMenuTypeArrValues = EditMenuType.values();
            int length = editMenuTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    editMenuType = null;
                    break;
                }
                editMenuType = editMenuTypeArrValues[i2];
                if (editMenuType.getType() == i) {
                    break;
                }
                i2++;
            }
            return editMenuType != null;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EditMenuType createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            EditMenuType editMenuTypeValueOf = valueOf(parcel.readInt());
            Intrinsics.copydefault(editMenuTypeValueOf);
            return editMenuTypeValueOf;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EditMenuType[] newArray(int i) {
            return new EditMenuType[i];
        }
    }

    public static EditMenuType valueOf(String str) {
        return (EditMenuType) Enum.valueOf(EditMenuType.class, str);
    }

    public static EditMenuType[] values() {
        return (EditMenuType[]) $VALUES.clone();
    }
}
