package com.beloo.widget.chipslayoutmanager.anchor;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Locale;

/* JADX INFO: loaded from: classes21.dex */
public class AnchorViewState implements Parcelable {
    public static final Parcelable.Creator<AnchorViewState> CREATOR = new Parcelable.Creator<AnchorViewState>() { // from class: com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState.1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AnchorViewState createFromParcel(Parcel parcel) {
            return new AnchorViewState(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AnchorViewState[] newArray(int i) {
            return new AnchorViewState[i];
        }
    };
    private Rect anchorViewRect;
    private Integer position;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Rect getAnchorViewRect() {
        return this.anchorViewRect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Integer getPosition() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isNotFoundState() {
        return this.anchorViewRect == null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAnchorViewRect(Rect rect) {
        this.anchorViewRect = rect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setPosition(Integer num) {
        this.position = num;
    }

    private AnchorViewState() {
        this.position = 0;
    }

    public static AnchorViewState getNotFoundState() {
        return new AnchorViewState();
    }

    public AnchorViewState(int i, @NonNull Rect rect) {
        this.position = 0;
        this.position = Integer.valueOf(i);
        this.anchorViewRect = rect;
    }

    public boolean isRemoving() {
        return getPosition().intValue() == -1;
    }

    private AnchorViewState(Parcel parcel) {
        this.position = 0;
        int i = parcel.readInt();
        this.position = i == -1 ? null : Integer.valueOf(i);
        this.anchorViewRect = (Rect) parcel.readParcelable(AnchorViewState.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Integer num = this.position;
        parcel.writeInt(num == null ? -1 : num.intValue());
        parcel.writeParcelable(this.anchorViewRect, 0);
    }

    public String toString() {
        return String.format(Locale.getDefault(), "AnchorState. Position = %d, Rect = %s", this.position, String.valueOf(this.anchorViewRect));
    }
}
