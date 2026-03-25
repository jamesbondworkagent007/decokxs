package com.okinc.im.imui.conversation.message.provider.base.moreaction;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuDeleteAction;
import com.okinc.im.menu.MenuActionBase;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C33070mpX;
import o.C35334ntP;
import o.C35399nuc;
import o.C35696oAh;
import o.C52761wXj;
import o.C54819xWm;
import o.ViewOnClickListenerC54939xaY;
import o.sDN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class MenuDeleteAction implements MenuActionBase {
    public static final Parcelable.Creator<MenuDeleteAction> CREATOR = new Creator();
    public int KWHzl = 6;

    public static final class Creator implements Parcelable.Creator<MenuDeleteAction> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MenuDeleteAction createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            return new MenuDeleteAction();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MenuDeleteAction[] newArray(int i) {
            return new MenuDeleteAction[i];
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

    @Override // com.okinc.im.menu.MenuActionBase
    public Drawable copydefault(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Drawable drawable = ContextCompat.getDrawable(context, C52761wXj.TaskDescription.hNurIN);
        Intrinsics.copydefault(drawable);
        return drawable;
    }

    @Override // com.okinc.im.menu.MenuActionBase
    public String OLrzqt(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        String string = context.getString(C35399nuc.LoaderManager.DSiOMJ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.okinc.im.menu.MenuActionBase
    public void AEQbTJ(@NotNull final View view, @NotNull final OKMessage oKMessage) {
        Activity activityAEQbTJ;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        final OKConversation oKConversationEZpvd = C35696oAh.KWHzl.EZpvd();
        if (oKConversationEZpvd == null || (activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ()) == null) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activityAEQbTJ);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C35399nuc.LoaderManager.DfrfUJ));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C35399nuc.LoaderManager.XW));
        viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) C33070mpX.AYXKKw(C35399nuc.LoaderManager.DcMfJKfwDlxl), new View.OnClickListener() { // from class: o.nDA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                MenuDeleteAction.KWHzl(view, viewOnClickListenerC54939xaY, oKConversationEZpvd, oKMessage, view2);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C35399nuc.LoaderManager.DrqXHJ), new View.OnClickListener() { // from class: o.nDz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                MenuDeleteAction.EZpvd(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, OKConversation oKConversation, OKMessage oKMessage, View view2) {
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LifecycleOwner lifecycleOwnerAEQbTJ = C35334ntP.AEQbTJ(context);
        LifecycleCoroutineScope lifecycleScope = lifecycleOwnerAEQbTJ != null ? LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerAEQbTJ) : null;
        if (lifecycleScope != null) {
            BuildersKt__Builders_commonKt.launch$default(lifecycleScope, sDN.copydefault.AEQbTJ(), null, new MenuDeleteAction$clickAction$1$1$1$1$1(oKConversation, oKMessage, null), 2, null);
        }
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }
}
