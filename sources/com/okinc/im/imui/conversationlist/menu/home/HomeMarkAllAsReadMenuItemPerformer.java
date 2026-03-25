package com.okinc.im.imui.conversationlist.menu.home;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer;
import com.okinc.im.menu.IMMenuItem;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class HomeMarkAllAsReadMenuItemPerformer implements IMenuItemPerformer {
    public static final Parcelable.Creator<HomeMarkAllAsReadMenuItemPerformer> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<HomeMarkAllAsReadMenuItemPerformer> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeMarkAllAsReadMenuItemPerformer createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            return new HomeMarkAllAsReadMenuItemPerformer();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeMarkAllAsReadMenuItemPerformer[] newArray(int i) {
            return new HomeMarkAllAsReadMenuItemPerformer[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(1);
    }

    @Override // com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer
    public void AEQbTJ(@NotNull Context context) {
        IMenuItemPerformer.StateListAnimator.EZpvd(this, context);
    }

    @Override // com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer
    public CharSequence EZpvd() {
        return C33070mpX.AYXKKw(C35399nuc.LoaderManager.onProviderDisabled);
    }

    @Override // com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer
    public Drawable copydefault() {
        Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.addPreRequisiteCollector);
        if (drawableKWHzl == null) {
            return null;
        }
        drawableKWHzl.setTint(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        return drawableKWHzl;
    }

    @Override // com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer
    public IMMenuItem AEQbTJ() {
        return IMMenuItem.MARK_ALL_READ;
    }
}
