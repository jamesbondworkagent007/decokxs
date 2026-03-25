package com.okinc.im.imui.conversation.message.menu.impl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.components.track.TrackChannel;
import com.okinc.im.imui.conversation.message.menu.api.AbsConversationMenuItemPerformer;
import com.okinc.okimcore.model.im.OKConversation;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C32866mlf;
import o.C32868mlh;
import o.C33070mpX;
import o.C35334ntP;
import o.C35399nuc;
import o.C52761wXj;
import o.sDN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class DisturbConversationMenuItemPerformer extends AbsConversationMenuItemPerformer {
    public static final Parcelable.Creator<DisturbConversationMenuItemPerformer> CREATOR = new Creator();
    public OKConversation copydefault;

    public static final class Creator implements Parcelable.Creator<DisturbConversationMenuItemPerformer> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DisturbConversationMenuItemPerformer createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DisturbConversationMenuItemPerformer((OKConversation) parcel.readParcelable(DisturbConversationMenuItemPerformer.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DisturbConversationMenuItemPerformer[] newArray(int i) {
            return new DisturbConversationMenuItemPerformer[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.imui.conversation.message.menu.api.AbsConversationMenuItemPerformer
    public OKConversation OLrzqt() {
        return this.copydefault;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.copydefault, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisturbConversationMenuItemPerformer(@NotNull OKConversation oKConversation) {
        super(oKConversation);
        Intrinsics.checkNotNullParameter(oKConversation, "");
        this.copydefault = oKConversation;
    }

    @Override // com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer
    public CharSequence EZpvd() {
        if (OLrzqt().isNoDisturb()) {
            return C33070mpX.AYXKKw(C35399nuc.LoaderManager.zeUJxr);
        }
        return C33070mpX.AYXKKw(C35399nuc.LoaderManager.hNurIN);
    }

    @Override // com.okinc.im.imui.conversation.message.menu.api.AbsConversationMenuItemPerformer, com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer
    public Drawable copydefault() {
        if (OLrzqt().isNoDisturb()) {
            return C33070mpX.KWHzl(C52761wXj.TaskDescription.UeEOUB);
        }
        return C33070mpX.KWHzl(C52761wXj.TaskDescription.aKErDB);
    }

    @Override // com.okinc.im.imui.conversation.message.menu.api.AbsConversationMenuItemPerformer, com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer
    public void AEQbTJ(@NotNull Context context) {
        LifecycleCoroutineScope lifecycleScope;
        Intrinsics.checkNotNullParameter(context, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.onEvent$default("MessagingNotificationCenter_ConversationSetting_Mute_Click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (Object) null);
        boolean zIsNoDisturb = OLrzqt().isNoDisturb();
        LifecycleOwner lifecycleOwnerAEQbTJ = C35334ntP.AEQbTJ(context);
        if (lifecycleOwnerAEQbTJ == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerAEQbTJ)) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(lifecycleScope, sDN.copydefault.AEQbTJ(), null, new DisturbConversationMenuItemPerformer$performClick$1(this, zIsNoDisturb, null), 2, null);
    }
}
