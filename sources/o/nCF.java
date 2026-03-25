package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.crcore.coreapi.service.IMarketApiService;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuRecallAction;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuReplyAction;
import com.okinc.im.imui.utils.IMImageHelper;
import com.okinc.im.menu.MenuActionBase;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKSightMessage;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC37218opg;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nCF extends oAE<OKSightMessage, AbstractC33993nNl> {
    public final int KWHzl = C35399nuc.Dialog.frkDMe;
    public final int EZpvd = C35342ntX.AEQbTJ;

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKMessage.SentStatus.values().length];
            try {
                iArr[OKMessage.SentStatus.SENDING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKMessage.SentStatus.FAILED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKSightMessage> KWHzl() {
        return OKSightMessage.class;
    }

    @Override // o.oAE, o.AbstractC35707oAs
    public /* bridge */ /* synthetic */ void copydefault(oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent) {
        copydefault((oAC<AbstractC44111sDt, AbstractC33993nNl>) oac, c35254nrp, (OKSightMessage) oKMessageContent);
    }

    @Override // o.AbstractC35707oAs
    public java.lang.Integer EZpvd() {
        return java.lang.Integer.valueOf(this.EZpvd);
    }

    public void copydefault(@NotNull oAC<AbstractC44111sDt, AbstractC33993nNl> oac, @NotNull C35254nrp c35254nrp, @NotNull OKSightMessage oKSightMessage) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKSightMessage, "");
        super.copydefault((oAC) oac, c35254nrp, oKSightMessage);
        AbstractC33993nNl abstractC33993nNl = (AbstractC33993nNl) oac.EZpvd();
        ShapeableImageView shapeableImageView = abstractC33993nNl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
        AEQbTJ(c35254nrp, shapeableImageView);
        IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
        ShapeableImageView shapeableImageView2 = abstractC33993nNl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView2, "");
        IMImageHelper.loadCacheOnlyImageWithThumbnail$default(iMImageHelper, shapeableImageView2, nPA.AEQbTJ(oKSightMessage), iMImageHelper.fetchVPNInfo(), false, 8, null);
        abstractC33993nNl.AEQbTJ.setText(KWHzl(oKSightMessage.getDuration()));
        android.widget.ImageView imageView = abstractC33993nNl.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        OKMessage.SentStatus sentStatus = c35254nrp.OLrzqt().getSentStatus();
        int i = sentStatus == null ? -1 : Application.KWHzl[sentStatus.ordinal()];
        imageView.setVisibility((i == 1 || i == 2) ? 8 : 0);
    }

    public final java.lang.String KWHzl(int i) {
        if (i <= 0) {
            return "00:00";
        }
        int i2 = i / 60;
        if (i2 < 60) {
            return AEQbTJ(i2) + ":" + AEQbTJ(i % 60);
        }
        int i3 = i2 / 60;
        if (i3 > 99) {
            return "99:59:59";
        }
        int i4 = i2 % 60;
        return AEQbTJ(i3) + ":" + AEQbTJ(i4) + ":" + AEQbTJ((i - (i3 * IMarketApiService.SIXTY_MINUTES)) - (i4 * 60));
    }

    public final java.lang.String AEQbTJ(int i) {
        java.lang.StringBuilder sb;
        if (i < 0 || i >= 10) {
            sb = new java.lang.StringBuilder();
        } else {
            sb = new java.lang.StringBuilder();
            sb.append("0");
        }
        sb.append(i);
        return sb.toString();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKSightMessage oKSightMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKSightMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return "[" + context.getString(C35399nuc.LoaderManager.shErWi) + "]";
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;)V */
    @Override // o.AbstractC35707oAs
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKSightMessage oKSightMessage) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKSightMessage, "");
        super.copydefault(view, i, c35254nrp, oKSightMessage);
        if (getFieldNames() && OKMessage.SentStatus.SENDING != c35254nrp.OLrzqt().getSentStatus()) {
            ActivityC37218opg.Application application = ActivityC37218opg.Companion;
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            view.getContext().startActivity(application.EZpvd(context, c35254nrp.OLrzqt()), application.OLrzqt(view, c35254nrp.OLrzqt()));
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;Landroidx/viewbinding/ViewBinding;)Z */
    @Override // o.AbstractC35707oAs
    public boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKSightMessage oKSightMessage, @NotNull ViewBinding viewBinding) {
        LinearLayoutCompat linearLayoutCompat;
        yHO<android.view.View, java.util.List<? extends MenuActionBase>, C35254nrp, Unit> yhoAuCTel;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKSightMessage, "");
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
