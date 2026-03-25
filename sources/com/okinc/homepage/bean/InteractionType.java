package com.okinc.homepage.bean;

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
public final class InteractionType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InteractionType[] $VALUES;
    public static final CREATOR CREATOR;
    private final int type;
    public static final InteractionType VIEW = new InteractionType("VIEW", 0, 1000);
    public static final InteractionType CLICK = new InteractionType("CLICK", 1, 2000);
    public static final InteractionType DISMISS = new InteractionType("DISMISS", 2, 3000);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InteractionType[] $values() {
        return new InteractionType[]{VIEW, CLICK, DISMISS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InteractionType> getEntries() {
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

    private InteractionType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        InteractionType[] interactionTypeArr$values = $values();
        $VALUES = interactionTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(interactionTypeArr$values);
        CREATOR = new CREATOR(null);
    }

    private InteractionType(String str, int i, Parcel parcel) {
        this(str, i, parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.type);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class CREATOR implements Parcelable.Creator<InteractionType> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.homepage.bean.InteractionType.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final InteractionType valueOf(int i) {
            InteractionType interactionType = InteractionType.VIEW;
            if (i == interactionType.getType()) {
                return interactionType;
            }
            InteractionType interactionType2 = InteractionType.CLICK;
            if (i == interactionType2.getType()) {
                return interactionType2;
            }
            InteractionType interactionType3 = InteractionType.DISMISS;
            if (i == interactionType3.getType()) {
                return interactionType3;
            }
            return null;
        }

        public final boolean isValid(int i) {
            InteractionType interactionType;
            InteractionType[] interactionTypeArrValues = InteractionType.values();
            int length = interactionTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    interactionType = null;
                    break;
                }
                interactionType = interactionTypeArrValues[i2];
                if (interactionType.getType() == i) {
                    break;
                }
                i2++;
            }
            return interactionType != null;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InteractionType createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            InteractionType interactionTypeValueOf = valueOf(parcel.readInt());
            Intrinsics.copydefault(interactionTypeValueOf);
            return interactionTypeValueOf;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InteractionType[] newArray(int i) {
            return new InteractionType[i];
        }
    }

    public static InteractionType valueOf(String str) {
        return (InteractionType) Enum.valueOf(InteractionType.class, str);
    }

    public static InteractionType[] values() {
        return (InteractionType[]) $VALUES.clone();
    }
}
