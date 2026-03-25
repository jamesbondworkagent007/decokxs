package com.okinc.im.imui.conversation.message.menu.impl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.im.imui.conversation.message.menu.api.AbsConversationMenuItemPerformer;
import com.okinc.okimcore.model.im.OKConversation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C33070mpX;
import o.C35334ntP;
import o.C35399nuc;
import o.C52761wXj;
import o.sDN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class FlagConversationMenuItemPerformer extends AbsConversationMenuItemPerformer {
    public static final Parcelable.Creator<FlagConversationMenuItemPerformer> CREATOR = new Creator();
    public OKConversation EZpvd;

    public static final class Creator implements Parcelable.Creator<FlagConversationMenuItemPerformer> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FlagConversationMenuItemPerformer createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FlagConversationMenuItemPerformer((OKConversation) parcel.readParcelable(FlagConversationMenuItemPerformer.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FlagConversationMenuItemPerformer[] newArray(int i) {
            return new FlagConversationMenuItemPerformer[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.imui.conversation.message.menu.api.AbsConversationMenuItemPerformer
    public OKConversation OLrzqt() {
        return this.EZpvd;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.EZpvd, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagConversationMenuItemPerformer(@NotNull OKConversation oKConversation) {
        super(oKConversation);
        Intrinsics.checkNotNullParameter(oKConversation, "");
        this.EZpvd = oKConversation;
    }

    @Override // com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer
    public CharSequence EZpvd() {
        if (OLrzqt().isFlagged()) {
            return C33070mpX.AYXKKw(C35399nuc.LoaderManager.SqfPTR);
        }
        return C33070mpX.AYXKKw(C35399nuc.LoaderManager.SlnMSS);
    }

    @Override // com.okinc.im.imui.conversation.message.menu.api.AbsConversationMenuItemPerformer, com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer
    public Drawable copydefault() {
        return C33070mpX.KWHzl(C52761wXj.TaskDescription.zSsVtY);
    }

    @Override // com.okinc.im.imui.conversation.message.menu.api.AbsConversationMenuItemPerformer, com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer
    public void AEQbTJ(@NotNull Context context) {
        LifecycleCoroutineScope lifecycleScope;
        Intrinsics.checkNotNullParameter(context, "");
        boolean zIsFlagged = OLrzqt().isFlagged();
        LifecycleOwner lifecycleOwnerAEQbTJ = C35334ntP.AEQbTJ(context);
        if (lifecycleOwnerAEQbTJ == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerAEQbTJ)) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(lifecycleScope, sDN.copydefault.AEQbTJ(), null, new FlagConversationMenuItemPerformer$performClick$1(this, zIsFlagged, null), 2, null);
    }
}
