package com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class AppNotificationBizType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AppNotificationBizType[] $VALUES;
    public static final CREATOR CREATOR;
    private final int type;
    public static final AppNotificationBizType CEFI = new AppNotificationBizType("CEFI", 0, 1);
    public static final AppNotificationBizType WEB3 = new AppNotificationBizType("WEB3", 1, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AppNotificationBizType[] $values() {
        return new AppNotificationBizType[]{CEFI, WEB3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AppNotificationBizType> getEntries() {
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

    private AppNotificationBizType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        AppNotificationBizType[] appNotificationBizTypeArr$values = $values();
        $VALUES = appNotificationBizTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(appNotificationBizTypeArr$values);
        CREATOR = new CREATOR(null);
    }

    private AppNotificationBizType(String str, int i, Parcel parcel) {
        this(str, i, parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.type);
    }

    public static final class CREATOR implements Parcelable.Creator<AppNotificationBizType> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.AppNotificationBizType.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final AppNotificationBizType valueOf(int i) {
            if (i == 1) {
                return AppNotificationBizType.CEFI;
            }
            if (i != 2) {
                return null;
            }
            return AppNotificationBizType.WEB3;
        }

        public final boolean isValid(int i) {
            AppNotificationBizType appNotificationBizType;
            AppNotificationBizType[] appNotificationBizTypeArrValues = AppNotificationBizType.values();
            int length = appNotificationBizTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    appNotificationBizType = null;
                    break;
                }
                appNotificationBizType = appNotificationBizTypeArrValues[i2];
                if (appNotificationBizType.getType() == i) {
                    break;
                }
                i2++;
            }
            return appNotificationBizType != null;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AppNotificationBizType createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            AppNotificationBizType appNotificationBizTypeValueOf = valueOf(parcel.readInt());
            Intrinsics.copydefault(appNotificationBizTypeValueOf);
            return appNotificationBizTypeValueOf;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AppNotificationBizType[] newArray(int i) {
            return new AppNotificationBizType[i];
        }
    }

    public static AppNotificationBizType valueOf(String str) {
        return (AppNotificationBizType) Enum.valueOf(AppNotificationBizType.class, str);
    }

    public static AppNotificationBizType[] values() {
        return (AppNotificationBizType[]) $VALUES.clone();
    }
}
