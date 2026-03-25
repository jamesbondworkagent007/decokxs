package com.okinc.okimcore.model.im.group;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.group.GroupBillingType;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C44408sOs;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable(with = C44408sOs.class)
public final class GroupBillingType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ GroupBillingType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<GroupBillingType> CREATOR;
    public static final Companion Companion;
    private final int rawValue;
    public static final GroupBillingType UNKNOWN = new GroupBillingType("UNKNOWN", 0, -1);
    public static final GroupBillingType ONE_OFF = new GroupBillingType("ONE_OFF", 1, 0);
    public static final GroupBillingType MONTHLY = new GroupBillingType("MONTHLY", 2, 1);
    public static final GroupBillingType YEARLY = new GroupBillingType("YEARLY", 3, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ GroupBillingType[] $values() {
        return new GroupBillingType[]{UNKNOWN, ONE_OFF, MONTHLY, YEARLY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<GroupBillingType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRawValue() {
        return this.rawValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.group.GroupBillingType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) GroupBillingType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<GroupBillingType> serializer() {
            return EZpvd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new C44408sOs();
    }

    private GroupBillingType(String str, int i, int i2) {
        this.rawValue = i2;
    }

    static {
        GroupBillingType[] groupBillingTypeArr$values = $values();
        $VALUES = groupBillingTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(groupBillingTypeArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<GroupBillingType>() { // from class: com.okinc.okimcore.model.im.group.GroupBillingType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GroupBillingType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return GroupBillingType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GroupBillingType[] newArray(int i) {
                return new GroupBillingType[i];
            }
        };
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sOr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return GroupBillingType._init_$_anonymous_();
            }
        });
    }

    public static GroupBillingType valueOf(String str) {
        return (GroupBillingType) Enum.valueOf(GroupBillingType.class, str);
    }

    public static GroupBillingType[] values() {
        return (GroupBillingType[]) $VALUES.clone();
    }
}
