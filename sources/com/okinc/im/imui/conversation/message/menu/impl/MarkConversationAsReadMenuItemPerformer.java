package com.okinc.im.imui.conversation.message.menu.impl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.components.track.TrackChannel;
import com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer;
import com.okinc.im.menu.IMMenuItem;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C32866mlf;
import o.C32868mlh;
import o.C33070mpX;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class MarkConversationAsReadMenuItemPerformer implements IMenuItemPerformer {
    public static final Parcelable.Creator<MarkConversationAsReadMenuItemPerformer> CREATOR = new Creator();
    public Function0<Unit> AEQbTJ;

    public static final class Creator implements Parcelable.Creator<MarkConversationAsReadMenuItemPerformer> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarkConversationAsReadMenuItemPerformer createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MarkConversationAsReadMenuItemPerformer((Function0) parcel.readSerializable());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarkConversationAsReadMenuItemPerformer[] newArray(int i) {
            return new MarkConversationAsReadMenuItemPerformer[i];
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
        parcel.writeSerializable((Serializable) this.AEQbTJ);
    }

    @Override // com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer
    public IMMenuItem AEQbTJ() {
        return IMenuItemPerformer.StateListAnimator.KWHzl(this);
    }

    public MarkConversationAsReadMenuItemPerformer(Function0<Unit> function0) {
        this.AEQbTJ = function0;
    }

    @Override // com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer
    public CharSequence EZpvd() {
        return C33070mpX.AYXKKw(C35399nuc.LoaderManager.DGUQLIhJrIAr);
    }

    @Override // com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer
    public Drawable copydefault() {
        return C33070mpX.KWHzl(C52761wXj.TaskDescription.ODWQjV);
    }

    @Override // com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer
    public void AEQbTJ(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.onEvent$default("MessagingNotificationCenter_ConversationSetting_MarkAsRead_Click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (Object) null);
        Function0<Unit> function0 = this.AEQbTJ;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
