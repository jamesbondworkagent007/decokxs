package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBinding;
import com.bumptech.glide.Glide;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.im.imui.conversation.message.provider.ImageSendMessageViewProvider$onMessageContentViewLongClick$1;
import com.okinc.im.imui.glide.model.IMImageModel;
import com.okinc.im.imui.utils.IMImageHelper;
import com.okinc.okimcore.model.im.OKImageMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nBH extends oAA<OKImageMessage, nMH> {
    public static boolean valueOf;
    public final java.lang.Integer djBIcL = java.lang.Integer.valueOf(C35342ntX.AEQbTJ);
    public final int gEmmrt = C35399nuc.Dialog.DGUQLIDGUQLI;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = C35399nuc.StateListAnimator.gwwzsY;
    public static final int KWHzl = C35399nuc.StateListAnimator.iMXFZQ;
    public static final int AEQbTJ = C35399nuc.StateListAnimator.apLTlu;
    public static final java.util.Set<java.lang.String> EZpvd = new LinkedHashSet();
    public static final java.util.Set<java.lang.String> copydefault = new LinkedHashSet();
    public static final android.os.Handler AYXKKw = new android.os.Handler(android.os.Looper.getMainLooper());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public int AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public java.lang.Integer EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKImageMessage> KWHzl() {
        return OKImageMessage.class;
    }

    @Override // o.oAA, o.AbstractC35707oAs
    public /* synthetic */ void copydefault(oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent) {
        KWHzl((oAC<AbstractC44112sDu, nMH>) oac, c35254nrp, (OKImageMessage) oKMessageContent);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nBH.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKImageMessage oKImageMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKImageMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return "[" + context.getString(C35399nuc.LoaderManager.FdcJU) + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C35802oEf valueOf() {
        return ((InterfaceC35331ntM) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC35331ntM.class)).DarRvM();
    }

    public void KWHzl(@NotNull oAC<AbstractC44112sDu, nMH> oac, @NotNull C35254nrp c35254nrp, @NotNull OKImageMessage oKImageMessage) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKImageMessage, "");
        super.copydefault(oac, c35254nrp, oKImageMessage);
        nMH nmh = (nMH) oac.EZpvd();
        ShapeableImageView shapeableImageView = nmh.KWHzl;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
        AEQbTJ(c35254nrp, shapeableImageView);
        ShapeableImageView shapeableImageView2 = nmh.KWHzl;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView2, "");
        ViewGroup.LayoutParams layoutParams = shapeableImageView2.getLayoutParams();
        if (layoutParams != null) {
            nPJ npj = nPJ.OLrzqt;
            C34059nPx c34059nPxFetchVPNInfo = IMImageHelper.OLrzqt.fetchVPNInfo();
            java.lang.Integer width = oKImageMessage.getWidth();
            int iIntValue = width != null ? width.intValue() : 0;
            java.lang.Integer height = oKImageMessage.getHeight();
            layoutParams.height = npj.EZpvd(c34059nPxFetchVPNInfo, iIntValue, height != null ? height.intValue() : 0).copydefault();
            shapeableImageView2.setLayoutParams(layoutParams);
            ShapeableImageView shapeableImageView3 = nmh.KWHzl;
            Intrinsics.checkNotNullExpressionValue(shapeableImageView3, "");
            IMImageModel iMImageModelAEQbTJ = nPA.AEQbTJ(oKImageMessage);
            android.widget.ImageView imageView = nmh.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(8);
            android.widget.ImageView imageView2 = nmh.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(8);
            nmh.OLrzqt.copydefault();
            OLrzqt(shapeableImageView3, iMImageModelAEQbTJ);
            AEQbTJ(shapeableImageView3, c35254nrp, oac);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void OLrzqt(android.widget.ImageView imageView, IMImageModel iMImageModel) {
        C43453rpa c43453rpa = C43453rpa.AEQbTJ;
        android.content.Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (c43453rpa.KWHzl(context)) {
            IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
            iMImageHelper.AEQbTJ(imageView, iMImageModel, iMImageHelper.fetchVPNInfo());
        } else {
            IMImageHelper iMImageHelper2 = IMImageHelper.OLrzqt;
            iMImageHelper2.KWHzl(imageView, iMImageModel, iMImageHelper2.fetchVPNInfo(), false);
        }
    }

    public static final class Activity implements java.lang.Runnable {
        public static final Activity AEQbTJ = new Activity();

        @Override // java.lang.Runnable
        public final void run() {
            StateListAnimator stateListAnimator = nBH.Companion;
            nBH.valueOf = false;
        }
    }

    public static final boolean KWHzl(oAC oac, android.view.View view) {
        ((AbstractC44112sDu) oac.AEQbTJ()).getRoot().performLongClick();
        return true;
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ nBH EZpvd;
        public final /* synthetic */ android.widget.ImageView KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C35254nrp copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, nBH nbh, android.widget.ImageView imageView, C35254nrp c35254nrp) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = nbh;
            this.KWHzl = imageView;
            this.copydefault = c35254nrp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (!this.EZpvd.getFieldNames() || nBH.valueOf) {
                    return;
                }
                StateListAnimator stateListAnimator = nBH.Companion;
                nBH.valueOf = true;
                IMImageHelper.OLrzqt.KWHzl(this.KWHzl, this.copydefault);
                nBH.AYXKKw.postDelayed(Activity.AEQbTJ, 1000L);
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;Landroidx/viewbinding/ViewBinding;)Z */
    @Override // o.AbstractC35707oAs
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKImageMessage oKImageMessage, @NotNull ViewBinding viewBinding) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKImageMessage, "");
        Intrinsics.checkNotNullParameter(viewBinding, "");
        if (!getFieldNames() || c35254nrp.KWHzl() != 0) {
            return true;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(DbNXlk()), null, null, new ImageSendMessageViewProvider$onMessageContentViewLongClick$1(c35254nrp, this, viewBinding, null), 3, null);
        return true;
    }

    @Override // o.oAA, o.AbstractC35703oAo, o.AbstractC35882oHe
    public void AEQbTJ(@NotNull oGY<AbstractC44112sDu> ogy) {
        nMH nmh;
        ShapeableImageView shapeableImageView;
        Intrinsics.checkNotNullParameter(ogy, "");
        super.AEQbTJ(ogy);
        oAC oac = ogy instanceof oAC ? (oAC) ogy : null;
        if (oac == null || (nmh = (nMH) oac.EZpvd()) == null || (shapeableImageView = nmh.KWHzl) == null) {
            return;
        }
        try {
            Glide.KWHzl(shapeableImageView).AEQbTJ(shapeableImageView);
        } catch (java.lang.Exception unused) {
        }
    }

    public final void AEQbTJ(android.widget.ImageView imageView, C35254nrp c35254nrp, final oAC<AbstractC44112sDu, nMH> oac) {
        imageView.setOnClickListener(new TaskDescription(imageView, 1000L, this, imageView, c35254nrp));
        imageView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.nBJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return nBH.KWHzl(oac, view);
            }
        });
    }
}
