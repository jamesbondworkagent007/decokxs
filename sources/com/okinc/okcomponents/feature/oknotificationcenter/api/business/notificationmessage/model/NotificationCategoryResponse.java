package com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class NotificationCategoryResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<NotificationCategoryResponse> CREATOR = new Creator();
    private final List<NotificationCategoryBean> categories;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<NotificationCategoryResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationCategoryResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(NotificationCategoryBean.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new NotificationCategoryResponse(arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationCategoryResponse[] newArray(int i) {
            return new NotificationCategoryResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationCategoryResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationCategoryResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationCategoryResponse copy$default(NotificationCategoryResponse notificationCategoryResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = notificationCategoryResponse.categories;
        }
        return notificationCategoryResponse.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NotificationCategoryBean> component1() {
        return this.categories;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotificationCategoryResponse copy(List<NotificationCategoryBean> list) {
        return new NotificationCategoryResponse(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NotificationCategoryResponse) && Intrinsics.EZpvd(this.categories, ((NotificationCategoryResponse) obj).categories);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NotificationCategoryBean> getCategories() {
        return this.categories;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<NotificationCategoryBean> list = this.categories;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NotificationCategoryResponse(categories=" + this.categories + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<NotificationCategoryBean> list = this.categories;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<NotificationCategoryBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public NotificationCategoryResponse(List<NotificationCategoryBean> list) {
        this.categories = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationCategoryBean>):void (m)] (LINE:17) call: com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationCategoryResponse.<init>(java.util.List):void type: THIS */
    public /* synthetic */ NotificationCategoryResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
