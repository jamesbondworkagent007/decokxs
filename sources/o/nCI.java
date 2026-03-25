package o;

import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import com.okinc.im.imui.conversation.message.provider.StickerReceiveMessageViewProvider$onMessageContentViewLongClick$1;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKStickerMessage;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nCI extends oAE<OKStickerMessage, AbstractC33982nNa> {
    public final java.lang.Integer KWHzl = java.lang.Integer.valueOf(C35342ntX.AEQbTJ);
    public final int EZpvd = C35399nuc.Dialog.DSiOMJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public java.lang.Integer EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKStickerMessage> KWHzl() {
        return OKStickerMessage.class;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKStickerMessage oKStickerMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKStickerMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return "[" + C33070mpX.AYXKKw(C35399nuc.LoaderManager.ZGRCNj) + "] ";
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/oAC;Lo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;)V */
    @Override // o.oAE, o.AbstractC35707oAs
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull oAC<AbstractC44111sDt, AbstractC33982nNa> oac, @NotNull C35254nrp c35254nrp, @NotNull OKStickerMessage oKStickerMessage) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKStickerMessage, "");
        super.copydefault(oac, c35254nrp, oKStickerMessage);
        AbstractC33982nNa abstractC33982nNa = (AbstractC33982nNa) oac.EZpvd();
        EZpvd(abstractC33982nNa);
        OLrzqt(abstractC33982nNa, oKStickerMessage);
    }

    public final void EZpvd(AbstractC33982nNa abstractC33982nNa) {
        android.view.View root = abstractC33982nNa.getRoot();
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams != null) {
            C37658oxw c37658oxw = C37658oxw.EZpvd;
            android.content.Context context = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iCopydefault = c37658oxw.copydefault(context);
            layoutParams.width = iCopydefault;
            layoutParams.height = iCopydefault;
        } else {
            layoutParams = null;
        }
        root.setLayoutParams(layoutParams);
    }

    public final void OLrzqt(AbstractC33982nNa abstractC33982nNa, OKStickerMessage oKStickerMessage) {
        LottieAnimationView lottieAnimationView = abstractC33982nNa.KWHzl;
        android.content.Context context = lottieAnimationView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        lottieAnimationView.setAnimationFromUrl(C7827arF.EZpvd("lottie/im/sticker_placeholder.lottie", context, true));
        abstractC33982nNa.KWHzl.setVisibility(0);
        Glide.AEQbTJ(abstractC33982nNa.OLrzqt.getContext()).EZpvd(oKStickerMessage.getIconUrl()).OLrzqt((RY<android.graphics.drawable.Drawable>) new Application(abstractC33982nNa)).EZpvd((android.widget.ImageView) abstractC33982nNa.OLrzqt);
    }

    public static final class Application implements RY<android.graphics.drawable.Drawable> {
        public final /* synthetic */ AbstractC33982nNa OLrzqt;

        public Application(AbstractC33982nNa abstractC33982nNa) {
            this.OLrzqt = abstractC33982nNa;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
        @Override // o.RY
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public boolean copydefault(android.graphics.drawable.Drawable drawable, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
            this.OLrzqt.KWHzl.setVisibility(8);
            this.OLrzqt.OLrzqt.setVisibility(0);
            return false;
        }

        @Override // o.RY
        public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, boolean z) {
            this.OLrzqt.KWHzl.setVisibility(0);
            this.OLrzqt.OLrzqt.setVisibility(8);
            return false;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;Landroidx/viewbinding/ViewBinding;)Z */
    @Override // o.AbstractC35707oAs
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKStickerMessage oKStickerMessage, @NotNull ViewBinding viewBinding) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKStickerMessage, "");
        Intrinsics.checkNotNullParameter(viewBinding, "");
        if (!getFieldNames()) {
            return true;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(DbNXlk()), sDN.copydefault.copydefault(), null, new StickerReceiveMessageViewProvider$onMessageContentViewLongClick$1(c35254nrp, this, oKStickerMessage, viewBinding, null), 2, null);
        return true;
    }
}
