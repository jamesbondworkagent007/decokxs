package o;

import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBinding;
import com.okinc.im.imui.conversation.message.provider.EmojiReceiveMessageViewProvider$onMessageContentViewLongClick$1;
import com.okinc.okimcore.model.im.OKEmojiMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nBg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33664nBg extends oAE<OKEmojiMessage, AbstractC33985nNd> {
    public final java.lang.Integer AEQbTJ = java.lang.Integer.valueOf(C35342ntX.AEQbTJ);
    public final int EZpvd = C35399nuc.Dialog.QfJbVf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public java.lang.Integer EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKEmojiMessage> KWHzl() {
        return OKEmojiMessage.class;
    }

    @Override // o.oAE, o.AbstractC35707oAs
    public /* synthetic */ void copydefault(oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent) {
        KWHzl((oAC<AbstractC44111sDt, AbstractC33985nNd>) oac, c35254nrp, (OKEmojiMessage) oKMessageContent);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKEmojiMessage oKEmojiMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKEmojiMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        java.lang.String content = oKEmojiMessage.getContent();
        return content == null ? "" : content;
    }

    public void KWHzl(@NotNull oAC<AbstractC44111sDt, AbstractC33985nNd> oac, @NotNull C35254nrp c35254nrp, @NotNull OKEmojiMessage oKEmojiMessage) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKEmojiMessage, "");
        super.copydefault(oac, c35254nrp, oKEmojiMessage);
        android.widget.TextView textView = ((AbstractC33985nNd) oac.EZpvd()).OLrzqt;
        textView.setPadding(0, C55298xhM.dp2px$default(4.0f, null, 1, null), 0, C55298xhM.dp2px$default(4.0f, null, 1, null));
        textView.setTextSize(1, oKEmojiMessage.getTotalEmoji() == 1 ? 72.0f : 48.0f);
        java.lang.String content = oKEmojiMessage.getContent();
        textView.setText(content != null ? content : "");
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;Landroidx/viewbinding/ViewBinding;)Z */
    @Override // o.AbstractC35707oAs
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKEmojiMessage oKEmojiMessage, @NotNull ViewBinding viewBinding) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKEmojiMessage, "");
        Intrinsics.checkNotNullParameter(viewBinding, "");
        if (!getFieldNames()) {
            return true;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(DbNXlk()), null, null, new EmojiReceiveMessageViewProvider$onMessageContentViewLongClick$1(c35254nrp, this, viewBinding, null), 3, null);
        return true;
    }
}
