package com.okinc.okx.paymentapi.educationinfo;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class EducationInfoModel implements Parcelable {
    public static final Parcelable.Creator<EducationInfoModel> CREATOR = new Creator();
    public final InfoAction AEQbTJ;
    public final List<InfoItemModel> EZpvd;
    public final EducationEventData KWHzl;

    public static final class Creator implements Parcelable.Creator<EducationInfoModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EducationInfoModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(EducationInfoModel.class.getClassLoader()));
            }
            return new EducationInfoModel(arrayList, EducationEventData.CREATOR.createFromParcel(parcel), (InfoAction) parcel.readParcelable(EducationInfoModel.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EducationInfoModel[] newArray(int i) {
            return new EducationInfoModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okx.paymentapi.educationinfo.EducationInfoModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EducationInfoModel copy$default(EducationInfoModel educationInfoModel, List list, EducationEventData educationEventData, InfoAction infoAction, int i, Object obj) {
        if ((i & 1) != 0) {
            list = educationInfoModel.EZpvd;
        }
        if ((i & 2) != 0) {
            educationEventData = educationInfoModel.KWHzl;
        }
        if ((i & 4) != 0) {
            infoAction = educationInfoModel.AEQbTJ;
        }
        return educationInfoModel.EZpvd(list, educationEventData, infoAction);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EducationInfoModel EZpvd(@NotNull List<? extends InfoItemModel> list, @NotNull EducationEventData educationEventData, InfoAction infoAction) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(educationEventData, "");
        return new EducationInfoModel(list, educationEventData, infoAction);
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
        if (!(obj instanceof EducationInfoModel)) {
            return false;
        }
        EducationInfoModel educationInfoModel = (EducationInfoModel) obj;
        return Intrinsics.EZpvd(this.EZpvd, educationInfoModel.EZpvd) && Intrinsics.EZpvd(this.KWHzl, educationInfoModel.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, educationInfoModel.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.KWHzl.hashCode();
        InfoAction infoAction = this.AEQbTJ;
        return (((iHashCode * 31) + iHashCode2) * 31) + (infoAction == null ? 0 : infoAction.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EducationInfoModel(content=" + this.EZpvd + ", eventData=" + this.KWHzl + ", action=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<InfoItemModel> list = this.EZpvd;
        parcel.writeInt(list.size());
        Iterator<InfoItemModel> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        this.KWHzl.writeToParcel(parcel, i);
        parcel.writeParcelable(this.AEQbTJ, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.okx.paymentapi.educationinfo.InfoItemModel> */
    /* JADX WARN: Multi-variable type inference failed */
    public EducationInfoModel(@NotNull List<? extends InfoItemModel> list, @NotNull EducationEventData educationEventData, InfoAction infoAction) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(educationEventData, "");
        this.EZpvd = list;
        this.KWHzl = educationEventData;
        this.AEQbTJ = infoAction;
    }
}
