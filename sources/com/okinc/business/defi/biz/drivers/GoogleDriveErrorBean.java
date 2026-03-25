package com.okinc.business.defi.biz.drivers;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class GoogleDriveErrorBean implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<GoogleDriveErrorBean> CREATOR = new Creator();
    private final int code;
    private List<GoogleDriveErrorDetailBean> errors;
    private final String message;

    public static final class Creator implements Parcelable.Creator<GoogleDriveErrorBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoogleDriveErrorBean createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList2.add(GoogleDriveErrorDetailBean.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new GoogleDriveErrorBean(i, string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoogleDriveErrorBean[] newArray(int i) {
            return new GoogleDriveErrorBean[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<GoogleDriveErrorDetailBean> getErrors() {
        return this.errors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setErrors(List<GoogleDriveErrorDetailBean> list) {
        this.errors = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.code);
        parcel.writeString(this.message);
        List<GoogleDriveErrorDetailBean> list = this.errors;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<GoogleDriveErrorDetailBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public GoogleDriveErrorBean(int i, @NotNull String str, List<GoogleDriveErrorDetailBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        this.code = i;
        this.message = str;
        this.errors = list;
    }
}
