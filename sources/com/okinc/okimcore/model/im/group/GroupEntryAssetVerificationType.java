package com.okinc.okimcore.model.im.group;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.group.GroupEntryAssetVerificationType;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.sOF;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable(with = sOF.class)
public final class GroupEntryAssetVerificationType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ GroupEntryAssetVerificationType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<GroupEntryAssetVerificationType> CREATOR;
    public static final Companion Companion;
    private final int rawValue;
    public static final GroupEntryAssetVerificationType ASSET = new GroupEntryAssetVerificationType("ASSET", 0, 0);
    public static final GroupEntryAssetVerificationType TOKEN = new GroupEntryAssetVerificationType("TOKEN", 1, 1);
    public static final GroupEntryAssetVerificationType UNKNOWN = new GroupEntryAssetVerificationType("UNKNOWN", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ GroupEntryAssetVerificationType[] $values() {
        return new GroupEntryAssetVerificationType[]{ASSET, TOKEN, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<GroupEntryAssetVerificationType> getEntries() {
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.group.GroupEntryAssetVerificationType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) GroupEntryAssetVerificationType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<GroupEntryAssetVerificationType> serializer() {
            return copydefault();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new sOF();
    }

    private GroupEntryAssetVerificationType(String str, int i, int i2) {
        this.rawValue = i2;
    }

    static {
        GroupEntryAssetVerificationType[] groupEntryAssetVerificationTypeArr$values = $values();
        $VALUES = groupEntryAssetVerificationTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(groupEntryAssetVerificationTypeArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<GroupEntryAssetVerificationType>() { // from class: com.okinc.okimcore.model.im.group.GroupEntryAssetVerificationType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GroupEntryAssetVerificationType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return GroupEntryAssetVerificationType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GroupEntryAssetVerificationType[] newArray(int i) {
                return new GroupEntryAssetVerificationType[i];
            }
        };
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sOv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return GroupEntryAssetVerificationType._init_$_anonymous_();
            }
        });
    }

    public static GroupEntryAssetVerificationType valueOf(String str) {
        return (GroupEntryAssetVerificationType) Enum.valueOf(GroupEntryAssetVerificationType.class, str);
    }

    public static GroupEntryAssetVerificationType[] values() {
        return (GroupEntryAssetVerificationType[]) $VALUES.clone();
    }
}
