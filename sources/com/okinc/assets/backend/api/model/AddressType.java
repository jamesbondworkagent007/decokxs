package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class AddressType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AddressType[] $VALUES;
    public static final CREATOR CREATOR;
    private final int value;
    public static final AddressType Standard = new AddressType("Standard", 0, 0);
    public static final AddressType Universal = new AddressType("Universal", 1, 1);
    public static final AddressType Evm = new AddressType("Evm", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AddressType[] $values() {
        return new AddressType[]{Standard, Universal, Evm};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AddressType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private AddressType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        AddressType[] addressTypeArr$values = $values();
        $VALUES = addressTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(addressTypeArr$values);
        CREATOR = new CREATOR(null);
    }

    private AddressType(String str, int i, Parcel parcel) {
        this(str, i, parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.value);
    }

    public static final class CREATOR implements Parcelable.Creator<AddressType> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.AddressType.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final AddressType valueOf(int i) {
            for (AddressType addressType : AddressType.values()) {
                if (addressType.getValue() == i) {
                    return addressType;
                }
            }
            return null;
        }

        public final boolean isValid(int i) {
            return valueOf(i) != null;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AddressType createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            AddressType addressTypeValueOf = valueOf(parcel.readInt());
            Intrinsics.copydefault(addressTypeValueOf);
            return addressTypeValueOf;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AddressType[] newArray(int i) {
            return new AddressType[i];
        }
    }

    public static AddressType valueOf(String str) {
        return (AddressType) Enum.valueOf(AddressType.class, str);
    }

    public static AddressType[] values() {
        return (AddressType[]) $VALUES.clone();
    }
}
