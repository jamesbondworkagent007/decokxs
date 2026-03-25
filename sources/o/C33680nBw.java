package o;

import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.im.imui.conversation.message.provider.GifSendMessageViewProvider$onMessageContentViewLongClick$1;
import com.okinc.im.imui.utils.IMImageHelper;
import com.okinc.okimcore.model.im.OKGIFMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC37218opg;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nBw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33680nBw extends oAA<OKGIFMessage, AbstractC33973nMs> {
    public final java.lang.Integer AEQbTJ = java.lang.Integer.valueOf(C35342ntX.AEQbTJ);
    public final int EZpvd = C35399nuc.Dialog.zAEkPU;

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
    public java.lang.Class<OKGIFMessage> KWHzl() {
        return OKGIFMessage.class;
    }

    @Override // o.oAA, o.AbstractC35707oAs
    public /* synthetic */ void copydefault(oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent) {
        EZpvd((oAC<AbstractC44112sDu, AbstractC33973nMs>) oac, c35254nrp, (OKGIFMessage) oKMessageContent);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKGIFMessage oKGIFMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKGIFMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return "[" + context.getString(C35399nuc.LoaderManager.FdcJU) + "]";
    }

    public void EZpvd(@NotNull oAC<AbstractC44112sDu, AbstractC33973nMs> oac, @NotNull C35254nrp c35254nrp, @NotNull OKGIFMessage oKGIFMessage) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKGIFMessage, "");
        super.copydefault(oac, c35254nrp, oKGIFMessage);
        ShapeableImageView shapeableImageView = ((AbstractC33973nMs) oac.EZpvd()).OLrzqt;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
        AEQbTJ(c35254nrp, shapeableImageView);
        ShapeableImageView shapeableImageView2 = ((AbstractC33973nMs) oac.EZpvd()).OLrzqt;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView2, "");
        android.net.Uri uriKWHzl = C37683oyU.KWHzl(oKGIFMessage);
        if (uriKWHzl == null) {
            uriKWHzl = android.net.Uri.EMPTY;
        }
        IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
        iMImageHelper.KWHzl(shapeableImageView2, uriKWHzl, (20 & 4) != 0 ? null : java.lang.Integer.valueOf(C35399nuc.ActionBar.finit), (20 & 8) != 0 ? null : null, (20 & 16) != 0 ? null : new nPF(shapeableImageView2, iMImageHelper.fetchVPNInfo()));
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;)V */
    @Override // o.oAA, o.AbstractC35707oAs
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKGIFMessage oKGIFMessage) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKGIFMessage, "");
        ActivityC37218opg.Application application = ActivityC37218opg.Companion;
        android.content.Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        view.getContext().startActivity(application.EZpvd(context, c35254nrp.OLrzqt()), application.OLrzqt(view, c35254nrp.OLrzqt()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C35802oEf valueOf() {
        return ((InterfaceC35331ntM) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC35331ntM.class)).DarRvM();
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;Landroidx/viewbinding/ViewBinding;)Z */
    @Override // o.AbstractC35707oAs
    public boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKGIFMessage oKGIFMessage, @NotNull ViewBinding viewBinding) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKGIFMessage, "");
        Intrinsics.checkNotNullParameter(viewBinding, "");
        if (!getFieldNames() || c35254nrp.KWHzl() != 0) {
            return true;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(DbNXlk()), null, null, new GifSendMessageViewProvider$onMessageContentViewLongClick$1(c35254nrp, this, viewBinding, null), 3, null);
        return true;
    }
}
