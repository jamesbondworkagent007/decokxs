package com.okinc.im.imui.conversationlist.menu.home;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer;
import com.okinc.im.menu.IMMenuItem;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C35399nuc;
import o.C43251rlk;
import o.C52761wXj;
import o.InterfaceC8171axh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public class HomeCreateAffiliateGroupMenuItemPerformer implements IMenuItemPerformer {
    public static final Parcelable.Creator<HomeCreateAffiliateGroupMenuItemPerformer> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<HomeCreateAffiliateGroupMenuItemPerformer> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeCreateAffiliateGroupMenuItemPerformer createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            return new HomeCreateAffiliateGroupMenuItemPerformer();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeCreateAffiliateGroupMenuItemPerformer[] newArray(int i) {
            return new HomeCreateAffiliateGroupMenuItemPerformer[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(1);
    }

    @Override // com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer
    public IMMenuItem AEQbTJ() {
        return IMenuItemPerformer.StateListAnimator.KWHzl(this);
    }

    @Override // com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer
    public CharSequence EZpvd() {
        return C33070mpX.AYXKKw(C35399nuc.LoaderManager.UPzgla);
    }

    @Override // com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer
    public Drawable copydefault() {
        Drawable drawableKWHzl = C33070mpX.KWHzl(C35399nuc.ActionBar.zLjUOn);
        if (drawableKWHzl == null) {
            return null;
        }
        drawableKWHzl.setTint(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        return drawableKWHzl;
    }

    @Override // com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer
    public void AEQbTJ(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        InterfaceC8171axh interfaceC8171axh = (InterfaceC8171axh) C43251rlk.OLrzqt(InterfaceC8171axh.class);
        if (interfaceC8171axh != null) {
            InterfaceC8171axh.Application.navAffiliateIMDataSelect$default(interfaceC8171axh, (Activity) context, null, 2, null);
        }
    }
}
