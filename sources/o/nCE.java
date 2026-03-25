package o;

import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.crcore.coreapi.service.IMarketApiService;
import com.okinc.im.imui.conversation.message.provider.SightSendMessageViewProvider$onMessageContentViewLongClick$1;
import com.okinc.im.imui.utils.IMImageHelper;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKSightMessage;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC37218opg;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nCE extends oAA<OKSightMessage, AbstractC33993nNl> {
    public final int EZpvd = C35342ntX.AEQbTJ;
    public final int copydefault = C35399nuc.Dialog.frkDMe;

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

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
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKSightMessage> KWHzl() {
        return OKSightMessage.class;
    }

    @Override // o.oAA, o.AbstractC35707oAs
    public /* bridge */ /* synthetic */ void copydefault(oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent) {
        copydefault((oAC<AbstractC44112sDu, AbstractC33993nNl>) oac, c35254nrp, (OKSightMessage) oKMessageContent);
    }

    @Override // o.AbstractC35707oAs
    public java.lang.Integer EZpvd() {
        return java.lang.Integer.valueOf(this.EZpvd);
    }

    public void copydefault(@NotNull oAC<AbstractC44112sDu, AbstractC33993nNl> oac, @NotNull C35254nrp c35254nrp, @NotNull OKSightMessage oKSightMessage) {
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
        abstractC33993nNl.AEQbTJ.setText(OLrzqt(oKSightMessage.getDuration()));
        android.widget.ImageView imageView = abstractC33993nNl.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        OKMessage.SentStatus sentStatus = c35254nrp.OLrzqt().getSentStatus();
        int i = sentStatus == null ? -1 : Activity.AEQbTJ[sentStatus.ordinal()];
        imageView.setVisibility((i == 1 || i == 2) ? 8 : 0);
    }

    private final java.lang.String OLrzqt(int i) {
        if (i <= 0) {
            return "00:00";
        }
        int i2 = i / 60;
        if (i2 < 60) {
            return EZpvd(i2) + ":" + EZpvd(i % 60);
        }
        int i3 = i2 / 60;
        if (i3 > 99) {
            return "99:59:59";
        }
        int i4 = i2 % 60;
        return EZpvd(i3) + ":" + EZpvd(i4) + ":" + EZpvd((i - (i3 * IMarketApiService.SIXTY_MINUTES)) - (i4 * 60));
    }

    private final java.lang.String EZpvd(int i) {
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
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKSightMessage oKSightMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKSightMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return "[" + context.getString(C35399nuc.LoaderManager.shErWi) + "]";
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;)V */
    @Override // o.oAA, o.AbstractC35707oAs
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKSightMessage oKSightMessage) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKSightMessage, "");
        if (getFieldNames() && OKMessage.SentStatus.SENDING != c35254nrp.OLrzqt().getSentStatus()) {
            ActivityC37218opg.Application application = ActivityC37218opg.Companion;
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            view.getContext().startActivity(application.EZpvd(context, c35254nrp.OLrzqt()), application.OLrzqt(view, c35254nrp.OLrzqt()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C35802oEf valueOf() {
        return ((InterfaceC35331ntM) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC35331ntM.class)).DarRvM();
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;Landroidx/viewbinding/ViewBinding;)Z */
    @Override // o.AbstractC35707oAs
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKSightMessage oKSightMessage, @NotNull ViewBinding viewBinding) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKSightMessage, "");
        Intrinsics.checkNotNullParameter(viewBinding, "");
        if (!getFieldNames() || c35254nrp.KWHzl() != 0) {
            return true;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(DbNXlk()), null, null, new SightSendMessageViewProvider$onMessageContentViewLongClick$1(c35254nrp, this, viewBinding, null), 3, null);
        return true;
    }
}
