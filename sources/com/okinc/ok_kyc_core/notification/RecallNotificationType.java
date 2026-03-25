package com.okinc.ok_kyc_core.notification;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class RecallNotificationType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RecallNotificationType[] $VALUES;
    public static final Parcelable.Creator<RecallNotificationType> CREATOR;
    public static final RecallNotificationType LOCAL_PUSH_NOTIFICATION = new RecallNotificationType("LOCAL_PUSH_NOTIFICATION", 0, "local_push_notification", RecallNotificationDeeplinkParams.IS_LOCAL_PUSH_RECALL);
    public static final RecallNotificationType UNKNOWN = new RecallNotificationType("UNKNOWN", 1, "unknown", RecallNotificationDeeplinkParams.UNKNOWN);
    private final RecallNotificationDeeplinkParams deeplinkParam;
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RecallNotificationType[] $values() {
        return new RecallNotificationType[]{LOCAL_PUSH_NOTIFICATION, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RecallNotificationType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecallNotificationDeeplinkParams getDeeplinkParam() {
        return this.deeplinkParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private RecallNotificationType(String str, int i, String str2, RecallNotificationDeeplinkParams recallNotificationDeeplinkParams) {
        this.value = str2;
        this.deeplinkParam = recallNotificationDeeplinkParams;
    }

    static {
        RecallNotificationType[] recallNotificationTypeArr$values = $values();
        $VALUES = recallNotificationTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(recallNotificationTypeArr$values);
        CREATOR = new Parcelable.Creator<RecallNotificationType>() { // from class: com.okinc.ok_kyc_core.notification.RecallNotificationType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RecallNotificationType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return RecallNotificationType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RecallNotificationType[] newArray(int i) {
                return new RecallNotificationType[i];
            }
        };
    }

    public static RecallNotificationType valueOf(String str) {
        return (RecallNotificationType) Enum.valueOf(RecallNotificationType.class, str);
    }

    public static RecallNotificationType[] values() {
        return (RecallNotificationType[]) $VALUES.clone();
    }
}
