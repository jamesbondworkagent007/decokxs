package com.okinc.im.imui.conversationlist.menu.home;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.okinc.account.api.service.UserInfoService;
import com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer;
import com.okinc.im.menu.IMMenuItem;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C35399nuc;
import o.C43248rlh;
import o.C52761wXj;
import o.C58196ywi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class EditProfileMenuItemPerformer implements IMenuItemPerformer {
    public static final Parcelable.Creator<EditProfileMenuItemPerformer> CREATOR = new Creator();

    public static final class Application implements UserInfoService.ActionBar {
    }

    public static final class Creator implements Parcelable.Creator<EditProfileMenuItemPerformer> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditProfileMenuItemPerformer createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            return new EditProfileMenuItemPerformer();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditProfileMenuItemPerformer[] newArray(int i) {
            return new EditProfileMenuItemPerformer[i];
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
    public IMMenuItem AEQbTJ() {
        return IMenuItemPerformer.StateListAnimator.KWHzl(this);
    }

    @Override // com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer
    public CharSequence EZpvd() {
        return C33070mpX.AYXKKw(C35399nuc.LoaderManager.HJWChPdNQGVJ);
    }

    @Override // com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer
    public Drawable copydefault() {
        Drawable drawableKWHzl = C33070mpX.KWHzl(C35399nuc.ActionBar.AuCTelauCTel);
        if (drawableKWHzl == null) {
            return null;
        }
        drawableKWHzl.setTint(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        return drawableKWHzl;
    }

    @Override // com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer
    public void AEQbTJ(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Context contextOLrzqt = C58196ywi.OLrzqt(context);
        Intrinsics.copydefault(contextOLrzqt, "");
        UserInfoService.Application.startEditProfileFlow$default((UserInfoService) C43248rlh.KWHzl.AEQbTJ(UserInfoService.class), (FragmentActivity) contextOLrzqt, null, new Application(), null, null, null, null, 122, null);
    }
}
