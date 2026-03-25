package com.okinc.im.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class ContactType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ContactType[] $VALUES;
    public static final CREATOR CREATOR;
    private final int type;
    public static final ContactType ALL_FRIEND = new ContactType("ALL_FRIEND", 0, 0);
    public static final ContactType BOTH_FRIEND = new ContactType("BOTH_FRIEND", 1, 1);
    public static final ContactType SINGLE_FRIEND = new ContactType("SINGLE_FRIEND", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ContactType[] $values() {
        return new ContactType[]{ALL_FRIEND, BOTH_FRIEND, SINGLE_FRIEND};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ContactType> getEntries() {
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

    private ContactType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        ContactType[] contactTypeArr$values = $values();
        $VALUES = contactTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(contactTypeArr$values);
        CREATOR = new CREATOR(null);
    }

    private ContactType(String str, int i, Parcel parcel) {
        this(str, i, parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.type);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class CREATOR implements Parcelable.Creator<ContactType> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.bean.ContactType.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final ContactType valueOf(int i) {
            if (i == 0) {
                return ContactType.ALL_FRIEND;
            }
            if (i == 1) {
                return ContactType.BOTH_FRIEND;
            }
            if (i != 2) {
                return null;
            }
            return ContactType.SINGLE_FRIEND;
        }

        public final boolean isValid(int i) {
            ContactType contactType;
            ContactType[] contactTypeArrValues = ContactType.values();
            int length = contactTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    contactType = null;
                    break;
                }
                contactType = contactTypeArrValues[i2];
                if (contactType.getType() == i) {
                    break;
                }
                i2++;
            }
            return contactType != null;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ContactType createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ContactType contactTypeValueOf = valueOf(parcel.readInt());
            Intrinsics.copydefault(contactTypeValueOf);
            return contactTypeValueOf;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ContactType[] newArray(int i) {
            return new ContactType[i];
        }
    }

    public static ContactType valueOf(String str) {
        return (ContactType) Enum.valueOf(ContactType.class, str);
    }

    public static ContactType[] values() {
        return (ContactType[]) $VALUES.clone();
    }
}
