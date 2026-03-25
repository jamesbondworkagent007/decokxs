package com.okinc.referral.bean;

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
public final class LayoutType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LayoutType[] $VALUES;
    public static final CREATOR CREATOR;
    public static final LayoutType TYPE1 = new LayoutType("TYPE1", 0, 1);
    public static final LayoutType TYPE2 = new LayoutType("TYPE2", 1, 2);
    public static final LayoutType TYPE3 = new LayoutType("TYPE3", 2, 3);
    private final int type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LayoutType[] $values() {
        return new LayoutType[]{TYPE1, TYPE2, TYPE3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LayoutType> getEntries() {
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

    private LayoutType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        LayoutType[] layoutTypeArr$values = $values();
        $VALUES = layoutTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(layoutTypeArr$values);
        CREATOR = new CREATOR(null);
    }

    private LayoutType(String str, int i, Parcel parcel) {
        this(str, i, parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.type);
    }

    public static final class CREATOR implements Parcelable.Creator<LayoutType> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.referral.bean.LayoutType.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final LayoutType valueOf(int i) {
            LayoutType layoutType = LayoutType.TYPE1;
            if (i == layoutType.getType()) {
                return layoutType;
            }
            LayoutType layoutType2 = LayoutType.TYPE2;
            if (i == layoutType2.getType()) {
                return layoutType2;
            }
            LayoutType layoutType3 = LayoutType.TYPE3;
            if (i == layoutType3.getType()) {
                return layoutType3;
            }
            return null;
        }

        public final boolean isValid(int i) {
            LayoutType layoutType;
            LayoutType[] layoutTypeArrValues = LayoutType.values();
            int length = layoutTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    layoutType = null;
                    break;
                }
                layoutType = layoutTypeArrValues[i2];
                if (layoutType.getType() == i) {
                    break;
                }
                i2++;
            }
            return layoutType != null;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LayoutType createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            LayoutType layoutTypeValueOf = valueOf(parcel.readInt());
            Intrinsics.copydefault(layoutTypeValueOf);
            return layoutTypeValueOf;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LayoutType[] newArray(int i) {
            return new LayoutType[i];
        }
    }

    public static LayoutType valueOf(String str) {
        return (LayoutType) Enum.valueOf(LayoutType.class, str);
    }

    public static LayoutType[] values() {
        return (LayoutType[]) $VALUES.clone();
    }
}
