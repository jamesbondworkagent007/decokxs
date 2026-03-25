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
public final class TravelRuleStatus implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TravelRuleStatus[] $VALUES;
    public static final Parcelable.Creator<TravelRuleStatus> CREATOR;
    public static final ActionBar Companion;
    public static final TravelRuleStatus PendingSubmitInfo = new TravelRuleStatus("PendingSubmitInfo", 0);
    public static final TravelRuleStatus PendingCSApproval = new TravelRuleStatus("PendingCSApproval", 1);
    public static final TravelRuleStatus PendingAdditionalInfo = new TravelRuleStatus("PendingAdditionalInfo", 2);
    public static final TravelRuleStatus OTHER = new TravelRuleStatus("OTHER", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TravelRuleStatus[] $values() {
        return new TravelRuleStatus[]{PendingSubmitInfo, PendingCSApproval, PendingAdditionalInfo, OTHER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TravelRuleStatus> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private TravelRuleStatus(String str, int i) {
    }

    static {
        TravelRuleStatus[] travelRuleStatusArr$values = $values();
        $VALUES = travelRuleStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(travelRuleStatusArr$values);
        Companion = new ActionBar(null);
        CREATOR = new Parcelable.Creator<TravelRuleStatus>() { // from class: com.okinc.assets.backend.api.model.TravelRuleStatus.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TravelRuleStatus createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return TravelRuleStatus.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TravelRuleStatus[] newArray(int i) {
                return new TravelRuleStatus[i];
            }
        };
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.TravelRuleStatus.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final TravelRuleStatus EZpvd(Integer num) {
            return (num != null && num.intValue() == 14) ? TravelRuleStatus.PendingSubmitInfo : (num != null && num.intValue() == 15) ? TravelRuleStatus.PendingCSApproval : (num != null && num.intValue() == 16) ? TravelRuleStatus.PendingAdditionalInfo : TravelRuleStatus.OTHER;
        }
    }

    public static TravelRuleStatus valueOf(String str) {
        return (TravelRuleStatus) Enum.valueOf(TravelRuleStatus.class, str);
    }

    public static TravelRuleStatus[] values() {
        return (TravelRuleStatus[]) $VALUES.clone();
    }
}
