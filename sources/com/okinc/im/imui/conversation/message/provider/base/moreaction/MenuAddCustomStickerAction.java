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
import com.okinc.components.track.TrackChannel;
import com.okinc.im.menu.MenuActionBase;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKReferenceMessage;
import com.okinc.okimcore.model.im.OKStickerMessage;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C32866mlf;
import o.C35334ntP;
import o.C35399nuc;
import o.C52761wXj;
import o.sDN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class MenuAddCustomStickerAction implements MenuActionBase {
    public static final Parcelable.Creator<MenuAddCustomStickerAction> CREATOR = new Creator();
    public int KWHzl = 9;

    public static final class Creator implements Parcelable.Creator<MenuAddCustomStickerAction> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MenuAddCustomStickerAction createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            return new MenuAddCustomStickerAction();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MenuAddCustomStickerAction[] newArray(int i) {
            return new MenuAddCustomStickerAction[i];
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
        Drawable drawable = ContextCompat.getDrawable(context, C52761wXj.TaskDescription.getValue);
        Intrinsics.copydefault(drawable);
        return drawable;
    }

    @Override // com.okinc.im.menu.MenuActionBase
    public String OLrzqt(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        String string = context.getString(C35399nuc.LoaderManager.RXxsjQ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.okinc.im.menu.MenuActionBase
    public void AEQbTJ(@NotNull View view, @NotNull OKMessage oKMessage) {
        LifecycleCoroutineScope lifecycleScope;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        C32866mlf.onEvent$default("IM_Sticker_Save_Click", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LifecycleOwner lifecycleOwnerAEQbTJ = C35334ntP.AEQbTJ(context);
        if (lifecycleOwnerAEQbTJ == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerAEQbTJ)) == null) {
            return;
        }
        if (oKMessage.getContent() instanceof OKStickerMessage) {
            OKMessageContent content = oKMessage.getContent();
            Intrinsics.copydefault(content, "");
            String stickerId = ((OKStickerMessage) content).getStickerId();
            EZpvd(stickerId != null ? stickerId : "", lifecycleScope);
            return;
        }
        if (oKMessage.getContent() instanceof OKReferenceMessage) {
            OKMessageContent content2 = oKMessage.getContent();
            Intrinsics.copydefault(content2, "");
            OKMessageContent originalOKMessageContent = ((OKReferenceMessage) content2).getOriginalOKMessageContent();
            OKStickerMessage oKStickerMessage = originalOKMessageContent instanceof OKStickerMessage ? (OKStickerMessage) originalOKMessageContent : null;
            if (oKStickerMessage != null) {
                String stickerId2 = oKStickerMessage.getStickerId();
                EZpvd(stickerId2 != null ? stickerId2 : "", lifecycleScope);
            }
        }
    }

    public final void EZpvd(String str, CoroutineScope coroutineScope) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, sDN.copydefault.AEQbTJ(), null, new MenuAddCustomStickerAction$saveCustomSticker$1(str, null), 2, null);
    }
}
