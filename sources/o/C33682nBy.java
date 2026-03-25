package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuRecallAction;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuReplyAction;
import com.okinc.im.imui.utils.IMImageHelper;
import com.okinc.im.menu.MenuActionBase;
import com.okinc.okimcore.model.im.OKGIFMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC37218opg;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nBy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33682nBy extends oAE<OKGIFMessage, AbstractC33965nMk> {
    public final java.lang.Integer copydefault = java.lang.Integer.valueOf(C35342ntX.AEQbTJ);
    public final int OLrzqt = C35399nuc.Dialog.zKcAg;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public int AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public java.lang.Integer EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKGIFMessage> KWHzl() {
        return OKGIFMessage.class;
    }

    @Override // o.oAE, o.AbstractC35707oAs
    public /* bridge */ /* synthetic */ void copydefault(oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent) {
        copydefault((oAC<AbstractC44111sDt, AbstractC33965nMk>) oac, c35254nrp, (OKGIFMessage) oKMessageContent);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKGIFMessage oKGIFMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKGIFMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return "[" + context.getString(C35399nuc.LoaderManager.FdcJU) + "]";
    }

    public void copydefault(@NotNull oAC<AbstractC44111sDt, AbstractC33965nMk> oac, @NotNull C35254nrp c35254nrp, @NotNull OKGIFMessage oKGIFMessage) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKGIFMessage, "");
        super.copydefault((oAC) oac, c35254nrp, oKGIFMessage);
        ShapeableImageView shapeableImageView = ((AbstractC33965nMk) oac.EZpvd()).OLrzqt;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
        AEQbTJ(c35254nrp, shapeableImageView);
        ShapeableImageView shapeableImageView2 = ((AbstractC33965nMk) oac.EZpvd()).OLrzqt;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView2, "");
        android.net.Uri uriKWHzl = C37683oyU.KWHzl(oKGIFMessage);
        if (uriKWHzl == null) {
            uriKWHzl = android.net.Uri.EMPTY;
        }
        IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
        iMImageHelper.KWHzl(shapeableImageView2, uriKWHzl, (20 & 4) != 0 ? null : java.lang.Integer.valueOf(C35399nuc.ActionBar.finit), (20 & 8) != 0 ? null : null, (20 & 16) != 0 ? null : new nPF(shapeableImageView2, iMImageHelper.fetchVPNInfo()));
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;)V */
    @Override // o.AbstractC35707oAs
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

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;Landroidx/viewbinding/ViewBinding;)Z */
    @Override // o.AbstractC35707oAs
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKGIFMessage oKGIFMessage, @NotNull ViewBinding viewBinding) {
        LinearLayoutCompat linearLayoutCompat;
        yHO<android.view.View, java.util.List<? extends MenuActionBase>, C35254nrp, Unit> yhoAuCTel;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKGIFMessage, "");
        Intrinsics.checkNotNullParameter(viewBinding, "");
        if (c35254nrp.KWHzl() != 0) {
            return true;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (C44157sFk.EZpvd(c35254nrp.OLrzqt())) {
            arrayList.add(new MenuReplyAction());
        }
        if (copydefault(c35254nrp.OLrzqt())) {
            arrayList.add(new MenuRecallAction());
        }
        if (!C33129mqd.KWHzl((java.util.Collection) arrayList)) {
            return true;
        }
        AbstractC44111sDt abstractC44111sDt = viewBinding instanceof AbstractC44111sDt ? (AbstractC44111sDt) viewBinding : null;
        if (abstractC44111sDt == null || (linearLayoutCompat = abstractC44111sDt.AhwBna) == null || (yhoAuCTel = AuCTel()) == null) {
            return true;
        }
        yhoAuCTel.invoke(linearLayoutCompat, arrayList, c35254nrp);
        return true;
    }
}
