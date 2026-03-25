package com.okinc.im.imui.conversation.message.provider.base.moreaction;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.okinc.im.menu.MenuActionBase;
import com.okinc.okimcore.model.im.OKContractAddressMessage;
import com.okinc.okimcore.model.im.OKFileMessage;
import com.okinc.okimcore.model.im.OKGIFMessage;
import com.okinc.okimcore.model.im.OKHQVoiceMessage;
import com.okinc.okimcore.model.im.OKImageMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKReferenceMessage;
import com.okinc.okimcore.model.im.OKShareMessage;
import com.okinc.okimcore.model.im.OKSightMessage;
import com.okinc.okimcore.model.im.OKStickerMessage;
import com.okinc.okimcore.model.im.OKTextMessage;
import com.okinc.rxutils.RxBus;
import kotlin.jvm.internal.Intrinsics;
import o.C33729nDr;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class MenuReplyAction implements MenuActionBase {
    public static final Parcelable.Creator<MenuReplyAction> CREATOR = new Creator();
    public int copydefault = 4;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<MenuReplyAction> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MenuReplyAction createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            return new MenuReplyAction();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MenuReplyAction[] newArray(int i) {
            return new MenuReplyAction[i];
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
        Drawable drawable = ContextCompat.getDrawable(context, C52761wXj.TaskDescription.OHsvZP);
        Intrinsics.copydefault(drawable);
        return drawable;
    }

    @Override // com.okinc.im.menu.MenuActionBase
    public String OLrzqt(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        String string = context.getString(C35399nuc.LoaderManager.DXTac);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.okinc.im.menu.MenuActionBase
    public void AEQbTJ(@NotNull View view, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        OKMessageContent content = oKMessage.getContent();
        if ((content instanceof OKTextMessage) || (content instanceof OKImageMessage) || (content instanceof OKReferenceMessage) || (content instanceof OKGIFMessage) || (content instanceof OKHQVoiceMessage) || (content instanceof OKSightMessage) || (content instanceof OKShareMessage) || (content instanceof OKStickerMessage) || (content instanceof OKContractAddressMessage) || (content instanceof OKFileMessage)) {
            RxBus.AEQbTJ(new C33729nDr(oKMessage));
        }
    }
}
