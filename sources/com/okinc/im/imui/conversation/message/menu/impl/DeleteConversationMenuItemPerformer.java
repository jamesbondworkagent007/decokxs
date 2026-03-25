package com.okinc.im.imui.conversation.message.menu.impl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.components.track.TrackChannel;
import com.okinc.im.imui.conversation.message.menu.api.AbsConversationMenuItemPerformer;
import com.okinc.im.imui.conversation.message.menu.impl.DeleteConversationMenuItemPerformer;
import com.okinc.okimcore.model.im.OKConversation;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractActivityC33041mov;
import o.C32866mlf;
import o.C32868mlh;
import o.C33070mpX;
import o.C33814nGv;
import o.C35334ntP;
import o.C35399nuc;
import o.C52761wXj;
import o.sDN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class DeleteConversationMenuItemPerformer extends AbsConversationMenuItemPerformer {
    public static final Parcelable.Creator<DeleteConversationMenuItemPerformer> CREATOR = new Creator();
    public OKConversation copydefault;

    public static final class Creator implements Parcelable.Creator<DeleteConversationMenuItemPerformer> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeleteConversationMenuItemPerformer createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DeleteConversationMenuItemPerformer((OKConversation) parcel.readParcelable(DeleteConversationMenuItemPerformer.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeleteConversationMenuItemPerformer[] newArray(int i) {
            return new DeleteConversationMenuItemPerformer[i];
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
    public DeleteConversationMenuItemPerformer(@NotNull OKConversation oKConversation) {
        super(oKConversation);
        Intrinsics.checkNotNullParameter(oKConversation, "");
        this.copydefault = oKConversation;
    }

    @Override // com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer
    public CharSequence EZpvd() {
        return C33070mpX.AYXKKw(C35399nuc.LoaderManager.DSiOMJ);
    }

    @Override // com.okinc.im.imui.conversation.message.menu.api.AbsConversationMenuItemPerformer, com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer
    public Drawable copydefault() {
        return C33070mpX.KWHzl(C52761wXj.TaskDescription.dTTfOR);
    }

    @Override // com.okinc.im.imui.conversation.message.menu.api.AbsConversationMenuItemPerformer, com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer
    public void AEQbTJ(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        final AbstractActivityC33041mov abstractActivityC33041movEZpvd = C35334ntP.EZpvd(context);
        Function0<Unit> function0 = new Function0() { // from class: o.nAP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DeleteConversationMenuItemPerformer.EZpvd(abstractActivityC33041movEZpvd, this);
            }
        };
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.onEvent$default("MessagingNotificationCenter_ConversationSetting_Delete_Click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (Object) null);
        KWHzl(abstractActivityC33041movEZpvd, function0);
    }

    public static final Unit EZpvd(AbstractActivityC33041mov abstractActivityC33041mov, DeleteConversationMenuItemPerformer deleteConversationMenuItemPerformer) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041mov), sDN.copydefault.AEQbTJ(), null, new DeleteConversationMenuItemPerformer$performClick$deleteAction$1$1(abstractActivityC33041mov, deleteConversationMenuItemPerformer, null), 2, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(AbstractActivityC33041mov abstractActivityC33041mov, Function0<Unit> function0) {
        C33814nGv.Companion.copydefault(function0).show(abstractActivityC33041mov.getSupportFragmentManager(), "DeleteDialog");
    }
}
