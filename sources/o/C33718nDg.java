package o;

import android.view.View;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nDg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33718nDg extends oAA<OKMessageContent, AbstractC33991nNj> {
    public final java.lang.Integer copydefault = java.lang.Integer.valueOf(C35342ntX.AEQbTJ);
    public final int KWHzl = C35399nuc.Dialog.dzCpvv;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public int AEQbTJ() {
        return this.KWHzl;
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
        return this.copydefault;
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

    @Override // o.oAA, o.AbstractC35707oAs
    public void copydefault(@NotNull oAC<AbstractC44112sDu, AbstractC33991nNj> oac, @NotNull C35254nrp c35254nrp, @NotNull OKMessageContent oKMessageContent) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKMessageContent, "");
        super.copydefault(oac, c35254nrp, oKMessageContent);
        final AbstractC33991nNj abstractC33991nNj = (AbstractC33991nNj) oac.EZpvd();
        abstractC33991nNj.copydefault.setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.ijmTNW));
        abstractC33991nNj.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.nDf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C33718nDg.KWHzl(abstractC33991nNj, view);
            }
        });
        abstractC33991nNj.copydefault.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.nDh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C33718nDg.EZpvd(abstractC33991nNj, view);
            }
        });
        android.view.View root = abstractC33991nNj.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        AEQbTJ(c35254nrp, root);
    }

    public static final void KWHzl(AbstractC33991nNj abstractC33991nNj, android.view.View view) {
        abstractC33991nNj.getRoot().performClick();
    }

    public static final boolean EZpvd(AbstractC33991nNj abstractC33991nNj, android.view.View view) {
        return abstractC33991nNj.getRoot().performLongClick();
    }
}
