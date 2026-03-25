package com.okinc.im.imui.conversation.message.provider.base.moreaction;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.im.menu.MenuActionBase;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35334ntP;
import o.C35399nuc;
import o.C52761wXj;
import o.sDN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class MenuRecallAction implements MenuActionBase {
    public static final Parcelable.Creator<MenuRecallAction> CREATOR = new Creator();
    public int OLrzqt = 8;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<MenuRecallAction> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MenuRecallAction createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            return new MenuRecallAction();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MenuRecallAction[] newArray(int i) {
            return new MenuRecallAction[i];
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
        Drawable drawable = ContextCompat.getDrawable(context, C52761wXj.TaskDescription.OFqMGB);
        Intrinsics.copydefault(drawable);
        return drawable;
    }

    @Override // com.okinc.im.menu.MenuActionBase
    public String OLrzqt(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        String string = context.getString(C35399nuc.LoaderManager.gRtANS);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.okinc.im.menu.MenuActionBase
    public void AEQbTJ(@NotNull View view, @NotNull OKMessage oKMessage) {
        LifecycleCoroutineScope lifecycleScope;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LifecycleOwner lifecycleOwnerAEQbTJ = C35334ntP.AEQbTJ(context);
        if (lifecycleOwnerAEQbTJ == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerAEQbTJ)) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(lifecycleScope, sDN.copydefault.AEQbTJ(), null, new MenuRecallAction$clickAction$1(view, oKMessage, null), 2, null);
    }
}
