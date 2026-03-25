package o;

import android.view.View;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nDd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33715nDd extends oAE<OKMessageContent, AbstractC33989nNh> {
    public final java.lang.Integer AEQbTJ = java.lang.Integer.valueOf(C35342ntX.AEQbTJ);
    public final int EZpvd = C35399nuc.Dialog.awiJhF;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public int EZpvd(@NotNull OKMessageContent oKMessageContent, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessageContent, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return 8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public java.lang.Integer EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKMessageContent> KWHzl() {
        return OKMessageContent.class;
    }

    @Override // o.AbstractC35703oAo
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKMessageContent oKMessageContent, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKMessageContent, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return C33070mpX.AYXKKw(C35399nuc.LoaderManager.ijmTNW);
    }

    @Override // o.oAE, o.AbstractC35707oAs
    public void copydefault(@NotNull oAC<AbstractC44111sDt, AbstractC33989nNh> oac, @NotNull C35254nrp c35254nrp, @NotNull OKMessageContent oKMessageContent) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKMessageContent, "");
        super.copydefault(oac, c35254nrp, oKMessageContent);
        final AbstractC33989nNh abstractC33989nNh = (AbstractC33989nNh) oac.EZpvd();
        abstractC33989nNh.AEQbTJ.setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.ijmTNW));
        abstractC33989nNh.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.nDe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C33715nDd.KWHzl(abstractC33989nNh, view);
            }
        });
        abstractC33989nNh.AEQbTJ.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.nDc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C33715nDd.copydefault(abstractC33989nNh, view);
            }
        });
        android.view.View root = abstractC33989nNh.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        AEQbTJ(c35254nrp, root);
    }

    public static final void KWHzl(AbstractC33989nNh abstractC33989nNh, android.view.View view) {
        abstractC33989nNh.getRoot().performClick();
    }

    public static final boolean copydefault(AbstractC33989nNh abstractC33989nNh, android.view.View view) {
        return abstractC33989nNh.getRoot().performLongClick();
    }
}
