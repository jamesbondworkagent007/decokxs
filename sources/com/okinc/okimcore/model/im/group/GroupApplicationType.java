package com.okinc.okimcore.model.im.group;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.group.GroupApplicationType;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C44404sOo;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable(with = C44404sOo.class)
public final class GroupApplicationType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ GroupApplicationType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<GroupApplicationType> CREATOR;
    public static final Companion Companion;
    private final int rawValue;
    public static final GroupApplicationType NOT_NEEDED = new GroupApplicationType("NOT_NEEDED", 0, 0);
    public static final GroupApplicationType ADMIN_APPROVAL = new GroupApplicationType("ADMIN_APPROVAL", 1, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ GroupApplicationType[] $values() {
        return new GroupApplicationType[]{NOT_NEEDED, ADMIN_APPROVAL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<GroupApplicationType> getEntries() {
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.group.GroupApplicationType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer KWHzl() {
            return (KSerializer) GroupApplicationType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<GroupApplicationType> serializer() {
            return KWHzl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new C44404sOo();
    }

    private GroupApplicationType(String str, int i, int i2) {
        this.rawValue = i2;
    }

    static {
        GroupApplicationType[] groupApplicationTypeArr$values = $values();
        $VALUES = groupApplicationTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(groupApplicationTypeArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<GroupApplicationType>() { // from class: com.okinc.okimcore.model.im.group.GroupApplicationType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GroupApplicationType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return GroupApplicationType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GroupApplicationType[] newArray(int i) {
                return new GroupApplicationType[i];
            }
        };
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sOp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return GroupApplicationType._init_$_anonymous_();
            }
        });
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.valueOf(this.rawValue);
    }

    public static GroupApplicationType valueOf(String str) {
        return (GroupApplicationType) Enum.valueOf(GroupApplicationType.class, str);
    }

    public static GroupApplicationType[] values() {
        return (GroupApplicationType[]) $VALUES.clone();
    }
}
