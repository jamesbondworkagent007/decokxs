package com.okinc.okimcore.model.im.group;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import com.okinc.okimcore.model.im.group.GroupApplicationStatus;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C44400sOk;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable(with = C44400sOk.class)
public final class GroupApplicationStatus implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ GroupApplicationStatus[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<GroupApplicationStatus> CREATOR;
    public static final Companion Companion;
    private final int rawValue;
    public static final GroupApplicationStatus NOT_SUBMITTED = new GroupApplicationStatus("NOT_SUBMITTED", 0, 0);
    public static final GroupApplicationStatus PENDING = new GroupApplicationStatus(CardSyncResponse.PENDING, 1, 1);
    public static final GroupApplicationStatus APPROVED = new GroupApplicationStatus("APPROVED", 2, 2);
    public static final GroupApplicationStatus REJECTED = new GroupApplicationStatus("REJECTED", 3, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ GroupApplicationStatus[] $values() {
        return new GroupApplicationStatus[]{NOT_SUBMITTED, PENDING, APPROVED, REJECTED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<GroupApplicationStatus> getEntries() {
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.group.GroupApplicationStatus.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) GroupApplicationStatus.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<GroupApplicationStatus> serializer() {
            return EZpvd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new C44400sOk();
    }

    private GroupApplicationStatus(String str, int i, int i2) {
        this.rawValue = i2;
    }

    static {
        GroupApplicationStatus[] groupApplicationStatusArr$values = $values();
        $VALUES = groupApplicationStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(groupApplicationStatusArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<GroupApplicationStatus>() { // from class: com.okinc.okimcore.model.im.group.GroupApplicationStatus.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GroupApplicationStatus createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return GroupApplicationStatus.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GroupApplicationStatus[] newArray(int i) {
                return new GroupApplicationStatus[i];
            }
        };
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sOh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return GroupApplicationStatus._init_$_anonymous_();
            }
        });
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.valueOf(this.rawValue);
    }

    public static GroupApplicationStatus valueOf(String str) {
        return (GroupApplicationStatus) Enum.valueOf(GroupApplicationStatus.class, str);
    }

    public static GroupApplicationStatus[] values() {
        return (GroupApplicationStatus[]) $VALUES.clone();
    }
}
