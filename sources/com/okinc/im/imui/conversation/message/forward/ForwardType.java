package com.okinc.im.imui.conversation.message.forward;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class ForwardType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ForwardType[] $VALUES;
    public static final CREATOR CREATOR;
    private final int type;
    public static final ForwardType STEP = new ForwardType("STEP", 0, 0);
    public static final ForwardType SHARE = new ForwardType("SHARE", 1, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ForwardType[] $values() {
        return new ForwardType[]{STEP, SHARE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ForwardType> getEntries() {
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

    private ForwardType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        ForwardType[] forwardTypeArr$values = $values();
        $VALUES = forwardTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(forwardTypeArr$values);
        CREATOR = new CREATOR(null);
    }

    private ForwardType(String str, int i, Parcel parcel) {
        this(str, i, parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.type);
    }

    public static final class CREATOR implements Parcelable.Creator<ForwardType> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.conversation.message.forward.ForwardType.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final ForwardType valueOf(int i) {
            if (i == 0) {
                return ForwardType.STEP;
            }
            if (i != 2) {
                return null;
            }
            return ForwardType.SHARE;
        }

        public final boolean isValid(int i) {
            ForwardType forwardType;
            ForwardType[] forwardTypeArrValues = ForwardType.values();
            int length = forwardTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    forwardType = null;
                    break;
                }
                forwardType = forwardTypeArrValues[i2];
                if (forwardType.getType() == i) {
                    break;
                }
                i2++;
            }
            return forwardType != null;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ForwardType createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ForwardType forwardTypeValueOf = valueOf(parcel.readInt());
            Intrinsics.copydefault(forwardTypeValueOf);
            return forwardTypeValueOf;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ForwardType[] newArray(int i) {
            return new ForwardType[i];
        }
    }

    public static ForwardType valueOf(String str) {
        return (ForwardType) Enum.valueOf(ForwardType.class, str);
    }

    public static ForwardType[] values() {
        return (ForwardType[]) $VALUES.clone();
    }
}
