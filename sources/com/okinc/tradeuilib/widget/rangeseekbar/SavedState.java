package com.okinc.tradeuilib.widget.rangeseekbar;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes24.dex */
public class SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.okinc.tradeuilib.widget.rangeseekbar.SavedState.1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SavedState createFromParcel(Parcel parcel) {
            return new SavedState(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SavedState[] newArray(int i) {
            return new SavedState[i];
        }
    };
    public float AEQbTJ;
    public float EZpvd;
    public float KWHzl;
    public float OLrzqt;
    public float copydefault;
    public int valueOf;

    public SavedState(Parcel parcel) {
        super(parcel);
        this.EZpvd = parcel.readFloat();
        this.OLrzqt = parcel.readFloat();
        this.copydefault = parcel.readFloat();
        this.valueOf = parcel.readInt();
        this.AEQbTJ = parcel.readFloat();
        this.KWHzl = parcel.readFloat();
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.EZpvd);
        parcel.writeFloat(this.OLrzqt);
        parcel.writeFloat(this.copydefault);
        parcel.writeInt(this.valueOf);
        parcel.writeFloat(this.AEQbTJ);
        parcel.writeFloat(this.KWHzl);
    }
}
