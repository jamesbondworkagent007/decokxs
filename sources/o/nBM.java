package o;

import com.okinc.okimcore.model.im.OKMediaMessage;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nBM extends AbstractC35702oAn<OKMediaMessage, nMD> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKMediaMessage> KWHzl() {
        return OKMediaMessage.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35882oHe
    public int OLrzqt() {
        return C44108sDq.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35882oHe
    public int copydefault() {
        return C35399nuc.Dialog.getLabel;
    }

    @Override // o.AbstractC35703oAo
    public java.util.Set<OKMessage.MessageDirection> be_() {
        return yEE.AhwBna(OKMessage.MessageDirection.SEND, OKMessage.MessageDirection.RECEIVE);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKMediaMessage oKMediaMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKMediaMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        java.lang.String string = context.getString(C35399nuc.LoaderManager.DQYQgr);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
