package com.okinc.im.imui.conversation.message.provider.base.moreaction;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.okinc.im.menu.MenuActionBase;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKReferenceMessage;
import com.okinc.okimcore.model.im.OKTextMessage;
import kotlin.jvm.internal.Intrinsics;
import o.C32979mnm;
import o.C35399nuc;
import o.C52761wXj;
import o.C55326xho;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class MenuCopyAction implements MenuActionBase {
    public static final Parcelable.Creator<MenuCopyAction> CREATOR = new Creator();
    public int copydefault = 1;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<MenuCopyAction> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MenuCopyAction createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            return new MenuCopyAction();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MenuCopyAction[] newArray(int i) {
            return new MenuCopyAction[i];
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
        Drawable drawable = ContextCompat.getDrawable(context, C52761wXj.TaskDescription.gkZNMa);
        Intrinsics.copydefault(drawable);
        return drawable;
    }

    @Override // com.okinc.im.menu.MenuActionBase
    public String OLrzqt(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        String string = context.getString(C35399nuc.LoaderManager.Swccd);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.okinc.im.menu.MenuActionBase
    public void AEQbTJ(@NotNull View view, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Object systemService = C32979mnm.EZpvd.OLrzqt().getSystemService("clipboard");
        Intrinsics.copydefault(systemService, "");
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        OKMessageContent content = oKMessage.getContent();
        if (content instanceof OKTextMessage) {
            String languageNicknameContent = ((OKTextMessage) content).getLanguageNicknameContent();
            if (languageNicknameContent == null) {
                languageNicknameContent = "";
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText("msg", languageNicknameContent));
            String string = view.getContext().getString(C35399nuc.LoaderManager.m);
            Intrinsics.checkNotNullExpressionValue(string, "");
            C55326xho.toastWithSuccessfulIcon$default(string, 0, 1, (Object) null);
            return;
        }
        if (content instanceof OKReferenceMessage) {
            OKMessageContent originalOKMessageContent = ((OKReferenceMessage) content).getOriginalOKMessageContent();
            Intrinsics.copydefault(originalOKMessageContent, "");
            clipboardManager.setPrimaryClip(ClipData.newPlainText("msg", ((OKTextMessage) originalOKMessageContent).getAliasedContent()));
            String string2 = view.getContext().getString(C35399nuc.LoaderManager.m);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            C55326xho.toastWithSuccessfulIcon$default(string2, 0, 1, (Object) null);
        }
    }
}
