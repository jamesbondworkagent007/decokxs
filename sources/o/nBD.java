package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBinding;
import com.bumptech.glide.Glide;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.im.imui.conversation.message.provider.ImageReceiveMessageViewProvider$onMessageContentViewLongClick$1;
import com.okinc.im.imui.glide.model.IMImageModel;
import com.okinc.im.imui.utils.IMImageHelper;
import com.okinc.okimcore.model.im.OKImageMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nBD extends oAE<OKImageMessage, nMA> {
    public static boolean gEmmrt;
    public final java.lang.Integer AYXKKw = java.lang.Integer.valueOf(C35342ntX.AEQbTJ);
    public final int djBIcL = C35399nuc.Dialog.getPriority;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = C35399nuc.StateListAnimator.gwwzsY;
    public static final int KWHzl = C35399nuc.StateListAnimator.iMXFZQ;
    public static final int EZpvd = C35399nuc.StateListAnimator.apLTlu;
    public static final java.util.Set<java.lang.String> AEQbTJ = new LinkedHashSet();
    public static final java.util.Set<java.lang.String> copydefault = new LinkedHashSet();
    public static final android.os.Handler AhwBna = new android.os.Handler(android.os.Looper.getMainLooper());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public int AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35707oAs
    public java.lang.Integer EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKImageMessage> KWHzl() {
        return OKImageMessage.class;
    }

    @Override // o.oAE, o.AbstractC35707oAs
    public /* synthetic */ void copydefault(oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent) {
        OLrzqt((oAC<AbstractC44111sDt, nMA>) oac, c35254nrp, (OKImageMessage) oKMessageContent);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nBD.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKImageMessage oKImageMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKImageMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return "[" + context.getString(C35399nuc.LoaderManager.FdcJU) + "]";
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OLrzqt(@NotNull final oAC<AbstractC44111sDt, nMA> oac, @NotNull C35254nrp c35254nrp, @NotNull OKImageMessage oKImageMessage) {
        java.lang.Runnable runnable;
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKImageMessage, "");
        super.copydefault(oac, c35254nrp, oKImageMessage);
        nMA nma = (nMA) oac.EZpvd();
        ShapeableImageView shapeableImageView = nma.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
        AEQbTJ(c35254nrp, shapeableImageView);
        ShapeableImageView shapeableImageView2 = nma.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView2, "");
        ViewGroup.LayoutParams layoutParams = shapeableImageView2.getLayoutParams();
        if (layoutParams != null) {
            nPJ npj = nPJ.OLrzqt;
            IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
            C34059nPx c34059nPxFetchVPNInfo = iMImageHelper.fetchVPNInfo();
            java.lang.Integer width = oKImageMessage.getWidth();
            int iIntValue = width != null ? width.intValue() : 0;
            java.lang.Integer height = oKImageMessage.getHeight();
            nPB npbEZpvd = npj.EZpvd(c34059nPxFetchVPNInfo, iIntValue, height != null ? height.intValue() : 0);
            layoutParams.height = npbEZpvd.copydefault();
            pUU.KWHzl("Image_height", "dimensions.height = " + npbEZpvd.copydefault() + ", content.height = " + oKImageMessage.getHeight() + ", dimensions.width = " + npbEZpvd.OLrzqt() + ", content.width = " + oKImageMessage.getWidth());
            shapeableImageView2.setLayoutParams(layoutParams);
            final ShapeableImageView shapeableImageView3 = nma.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(shapeableImageView3, "");
            final android.widget.ImageView imageView = nma.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            android.widget.ImageView imageView2 = nma.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            C55113xdn c55113xdn = nma.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            final IMImageModel iMImageModelAEQbTJ = nPA.AEQbTJ(oKImageMessage);
            final java.lang.String str = c35254nrp.OLrzqt().getSeq() + "_" + c35254nrp.OLrzqt().getSentTime();
            java.lang.Object tag = shapeableImageView3.getTag();
            java.lang.String str2 = tag instanceof java.lang.String ? (java.lang.String) tag : null;
            java.util.Set<java.lang.String> set = AEQbTJ;
            boolean zContains = set.contains(str);
            boolean zContains2 = copydefault.contains(str);
            if (str2 == null || Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) str)) {
                runnable = null;
            } else {
                int i = KWHzl;
                java.lang.Object tag2 = shapeableImageView3.getTag(i);
                java.lang.Runnable runnable2 = tag2 instanceof java.lang.Runnable ? (java.lang.Runnable) tag2 : null;
                if (runnable2 != null) {
                    shapeableImageView3.removeCallbacks(runnable2);
                    shapeableImageView3.setTag(i, null);
                }
                int i2 = EZpvd;
                java.lang.Object tag3 = shapeableImageView3.getTag(i2);
                java.lang.Runnable runnable3 = tag3 instanceof java.lang.Runnable ? (java.lang.Runnable) tag3 : null;
                if (runnable3 != null) {
                    shapeableImageView3.removeCallbacks(runnable3);
                    runnable = null;
                    shapeableImageView3.setTag(i2, null);
                } else {
                    runnable = null;
                }
                shapeableImageView3.setTag(OLrzqt, java.lang.Boolean.FALSE);
            }
            shapeableImageView3.setTag(str);
            c55113xdn.copydefault();
            imageView.setVisibility(8);
            imageView2.setVisibility(8);
            if (zContains2) {
                pUU.EZpvd("ImageReceiveMessageViewProvider", "State: Currently downloading - " + str);
                imageView2.setVisibility(0);
                c55113xdn.KWHzl(0L);
                shapeableImageView3.setTag(OLrzqt, java.lang.Boolean.FALSE);
                iMImageHelper.KWHzl(shapeableImageView3, iMImageModelAEQbTJ, iMImageHelper.fetchVPNInfo(), true);
                java.lang.Object tag4 = shapeableImageView3.getTag(EZpvd);
                if ((tag4 instanceof java.lang.Runnable ? (java.lang.Runnable) tag4 : runnable) == null) {
                    KWHzl(iMImageModelAEQbTJ, str, nma);
                }
            } else if (!zContains) {
                android.content.Context context = shapeableImageView3.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                if (iMImageHelper.EZpvd(context)) {
                    pUU.EZpvd("ImageReceiveMessageViewProvider", "State: Downloaded - " + str);
                    iMImageHelper.AEQbTJ(shapeableImageView3, iMImageModelAEQbTJ, iMImageHelper.fetchVPNInfo());
                    shapeableImageView3.setTag(OLrzqt, java.lang.Boolean.TRUE);
                    set.add(str);
                } else {
                    pUU.EZpvd("ImageReceiveMessageViewProvider", "State: Not downloaded - " + str);
                    imageView.setVisibility(0);
                    shapeableImageView3.setTag(OLrzqt, java.lang.Boolean.FALSE);
                    iMImageHelper.KWHzl(shapeableImageView3, iMImageModelAEQbTJ, iMImageHelper.fetchVPNInfo(), true);
                    android.content.Context context2 = shapeableImageView3.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    iMImageHelper.EZpvd(context2, iMImageModelAEQbTJ, new Function1() { // from class: o.nBI
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return nBD.EZpvd(shapeableImageView3, str, imageView, iMImageModelAEQbTJ, ((java.lang.Boolean) obj).booleanValue());
                        }
                    });
                }
            }
            imageView.setOnClickListener(new TaskDescription(imageView, 1000L, this, shapeableImageView3, iMImageModelAEQbTJ, str, nma, c35254nrp));
            imageView2.setOnClickListener(new Activity(imageView2, 1000L, this, shapeableImageView3, imageView2, c55113xdn, str, iMImageModelAEQbTJ, imageView));
            shapeableImageView3.setOnClickListener(new Application(shapeableImageView3, 1000L, this, shapeableImageView3, str, c35254nrp, iMImageModelAEQbTJ, nma));
            shapeableImageView3.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.nBF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    return nBD.OLrzqt(oac, view);
                }
            });
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ IMImageModel AEQbTJ;
        public final /* synthetic */ android.view.View AYXKKw;
        public final /* synthetic */ long AhwBna;
        public final /* synthetic */ ShapeableImageView EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ android.widget.ImageView OLrzqt;
        public final /* synthetic */ android.widget.ImageView copydefault;
        public final /* synthetic */ C55113xdn djBIcL;
        public final /* synthetic */ nBD gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, nBD nbd, ShapeableImageView shapeableImageView, android.widget.ImageView imageView, C55113xdn c55113xdn, java.lang.String str, IMImageModel iMImageModel, android.widget.ImageView imageView2) {
            this.AYXKKw = view;
            this.AhwBna = j;
            this.gEmmrt = nbd;
            this.EZpvd = shapeableImageView;
            this.OLrzqt = imageView;
            this.djBIcL = c55113xdn;
            this.KWHzl = str;
            this.AEQbTJ = iMImageModel;
            this.copydefault = imageView2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AYXKKw) > this.AhwBna || (this.AYXKKw instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AYXKKw, jCurrentTimeMillis);
                this.gEmmrt.OLrzqt(this.EZpvd, this.OLrzqt, this.djBIcL, this.KWHzl);
                IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
                iMImageHelper.KWHzl(this.EZpvd, this.AEQbTJ, iMImageHelper.fetchVPNInfo(), true);
                this.copydefault.setVisibility(0);
                this.EZpvd.setTag(nBD.OLrzqt, java.lang.Boolean.FALSE);
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ android.view.View AYXKKw;
        public final /* synthetic */ ShapeableImageView EZpvd;
        public final /* synthetic */ IMImageModel KWHzl;
        public final /* synthetic */ nMA OLrzqt;
        public final /* synthetic */ C35254nrp copydefault;
        public final /* synthetic */ long djBIcL;
        public final /* synthetic */ nBD gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, nBD nbd, ShapeableImageView shapeableImageView, java.lang.String str, C35254nrp c35254nrp, IMImageModel iMImageModel, nMA nma) {
            this.AYXKKw = view;
            this.djBIcL = j;
            this.gEmmrt = nbd;
            this.EZpvd = shapeableImageView;
            this.AEQbTJ = str;
            this.copydefault = c35254nrp;
            this.KWHzl = iMImageModel;
            this.OLrzqt = nma;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AYXKKw) > this.djBIcL || (this.AYXKKw instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AYXKKw, jCurrentTimeMillis);
                if (this.gEmmrt.getFieldNames()) {
                    java.lang.Object tag = this.EZpvd.getTag(nBD.OLrzqt);
                    java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    boolean zContains = nBD.copydefault.contains(this.AEQbTJ);
                    boolean z = this.EZpvd.getTag(nBD.KWHzl) != null;
                    if (!zBooleanValue) {
                        if (!zContains && !z) {
                            this.gEmmrt.EZpvd(this.EZpvd, this.KWHzl, this.AEQbTJ, this.OLrzqt, this.copydefault);
                            return;
                        } else {
                            pUU.EZpvd("ImageReceiveMessageViewProvider", "Image is downloading, ignoring click");
                            return;
                        }
                    }
                    if (nBD.gEmmrt) {
                        return;
                    }
                    ActionBar actionBar = nBD.Companion;
                    nBD.gEmmrt = true;
                    IMImageHelper.OLrzqt.KWHzl(this.EZpvd, this.copydefault);
                    nBD.AhwBna.postDelayed(StateListAnimator.copydefault, 1000L);
                }
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ ShapeableImageView AEQbTJ;
        public final /* synthetic */ nMA EZpvd;
        public final /* synthetic */ IMImageModel KWHzl;
        public final /* synthetic */ C35254nrp OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;
        public final /* synthetic */ nBD djBIcL;
        public final /* synthetic */ long gEmmrt;
        public final /* synthetic */ android.view.View valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, nBD nbd, ShapeableImageView shapeableImageView, IMImageModel iMImageModel, java.lang.String str, nMA nma, C35254nrp c35254nrp) {
            this.valueOf = view;
            this.gEmmrt = j;
            this.djBIcL = nbd;
            this.AEQbTJ = shapeableImageView;
            this.KWHzl = iMImageModel;
            this.copydefault = str;
            this.EZpvd = nma;
            this.OLrzqt = c35254nrp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.valueOf) > this.gEmmrt || (this.valueOf instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.valueOf, jCurrentTimeMillis);
                this.djBIcL.EZpvd(this.AEQbTJ, this.KWHzl, this.copydefault, this.EZpvd, this.OLrzqt);
            }
        }
    }

    public static final Unit EZpvd(ShapeableImageView shapeableImageView, java.lang.String str, android.widget.ImageView imageView, IMImageModel iMImageModel, boolean z) {
        java.lang.Object tag = shapeableImageView.getTag();
        if (!Intrinsics.EZpvd((java.lang.Object) (tag instanceof java.lang.String ? (java.lang.String) tag : null), (java.lang.Object) str)) {
            return Unit.INSTANCE;
        }
        if (z) {
            pUU.EZpvd("ImageReceiveMessageViewProvider", "Cache found for " + str);
            imageView.setVisibility(8);
            IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
            iMImageHelper.AEQbTJ(shapeableImageView, iMImageModel, iMImageHelper.fetchVPNInfo());
            shapeableImageView.setTag(OLrzqt, java.lang.Boolean.TRUE);
            AEQbTJ.add(str);
        }
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator implements java.lang.Runnable {
        public static final StateListAnimator copydefault = new StateListAnimator();

        @Override // java.lang.Runnable
        public final void run() {
            ActionBar actionBar = nBD.Companion;
            nBD.gEmmrt = false;
        }
    }

    public static final boolean OLrzqt(oAC oac, android.view.View view) {
        ((AbstractC44111sDt) oac.AEQbTJ()).getRoot().performLongClick();
        return true;
    }

    public final void EZpvd(final android.widget.ImageView imageView, final IMImageModel iMImageModel, final java.lang.String str, final nMA nma, C35254nrp c35254nrp) {
        if (getFieldNames()) {
            java.lang.Object tag = imageView.getTag(OLrzqt);
            java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
            if (bool != null && bool.booleanValue()) {
                IMImageHelper.OLrzqt.KWHzl(imageView, c35254nrp);
                return;
            }
            IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
            android.content.Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iMImageHelper.EZpvd(context, iMImageModel, new Function1() { // from class: o.nBC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return nBD.KWHzl(imageView, str, nma, iMImageModel, this, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
    }

    public static final Unit KWHzl(android.widget.ImageView imageView, java.lang.String str, nMA nma, IMImageModel iMImageModel, nBD nbd, boolean z) {
        java.lang.Object tag = imageView.getTag();
        if (!Intrinsics.EZpvd((java.lang.Object) (tag instanceof java.lang.String ? (java.lang.String) tag : null), (java.lang.Object) str)) {
            return Unit.INSTANCE;
        }
        if (z) {
            android.widget.ImageView imageView2 = nma.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(8);
            IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
            iMImageHelper.KWHzl(imageView, iMImageModel, iMImageHelper.fetchVPNInfo(), false);
            imageView.setTag(OLrzqt, java.lang.Boolean.TRUE);
            AEQbTJ.add(str);
        } else {
            C43453rpa c43453rpa = C43453rpa.AEQbTJ;
            android.content.Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            if (c43453rpa.KWHzl(context)) {
                android.widget.ImageView imageView3 = nma.EZpvd;
                Intrinsics.checkNotNullExpressionValue(imageView3, "");
                imageView3.setVisibility(8);
                nbd.KWHzl(iMImageModel, str, nma);
            } else {
                int i = KWHzl;
                if (imageView.getTag(i) != null) {
                    return Unit.INSTANCE;
                }
                IMImageHelper iMImageHelper2 = IMImageHelper.OLrzqt;
                C55113xdn c55113xdn = nma.copydefault;
                Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                android.widget.ImageView imageView4 = nma.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(imageView4, "");
                android.widget.ImageView imageView5 = nma.EZpvd;
                Intrinsics.checkNotNullExpressionValue(imageView5, "");
                imageView.setTag(i, iMImageHelper2.copydefault(c55113xdn, imageView4, imageView5, imageView, str, (32 & 32) != 0 ? 5000L : 0L));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/View;ILo/nrp;Lcom/okinc/okimcore/model/im/OKMessageContent;Landroidx/viewbinding/ViewBinding;)Z */
    @Override // o.AbstractC35707oAs
    public boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull C35254nrp c35254nrp, @NotNull OKImageMessage oKImageMessage, @NotNull ViewBinding viewBinding) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKImageMessage, "");
        Intrinsics.checkNotNullParameter(viewBinding, "");
        if (c35254nrp.KWHzl() != 0) {
            return true;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(DbNXlk()), null, null, new ImageReceiveMessageViewProvider$onMessageContentViewLongClick$1(c35254nrp, this, viewBinding, null), 3, null);
        return true;
    }

    public final void OLrzqt(android.widget.ImageView imageView, android.view.View view, android.view.View view2, java.lang.String str) {
        android.content.Context context;
        int i = KWHzl;
        java.lang.Object tag = imageView.getTag(i);
        java.lang.Runnable runnable = tag instanceof java.lang.Runnable ? (java.lang.Runnable) tag : null;
        if (runnable != null) {
            imageView.removeCallbacks(runnable);
            imageView.setTag(i, null);
        }
        int i2 = EZpvd;
        java.lang.Object tag2 = imageView.getTag(i2);
        java.lang.Runnable runnable2 = tag2 instanceof java.lang.Runnable ? (java.lang.Runnable) tag2 : null;
        if (runnable2 != null) {
            imageView.removeCallbacks(runnable2);
            imageView.setTag(i2, null);
        }
        if (copydefault.contains(str) && (context = imageView.getContext()) != null && !OLrzqt(context)) {
            try {
                Glide.KWHzl(imageView).AEQbTJ(imageView);
            } catch (java.lang.IllegalArgumentException unused) {
                pUU.EZpvd("ImageReceiveMessageViewProvider", "Context destroyed, skipping Glide clear");
            }
        }
        copydefault.remove(str);
        if (view2 instanceof C55113xdn) {
            ((C55113xdn) view2).copydefault();
        }
        if (view2 != null) {
            view2.setVisibility(8);
        }
        view.setVisibility(8);
    }

    public final boolean OLrzqt(android.content.Context context) {
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                return true;
            }
        } else if (context instanceof android.content.ContextWrapper) {
            android.content.Context baseContext = ((android.content.ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "");
            return OLrzqt(baseContext);
        }
        return false;
    }

    public final void KWHzl(final IMImageModel iMImageModel, final java.lang.String str, final nMA nma) {
        copydefault.add(str);
        nma.AEQbTJ.setVisibility(0);
        nma.copydefault.setVisibility(0);
        nma.copydefault.KWHzl(0L);
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: o.nBG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                nBD.KWHzl(str, nma, iMImageModel);
            }
        };
        nma.OLrzqt.setTag(EZpvd, runnable);
        nma.OLrzqt.postDelayed(runnable, 250L);
    }

    public static final void KWHzl(final java.lang.String str, final nMA nma, IMImageModel iMImageModel) {
        if (copydefault.contains(str)) {
            IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
            ShapeableImageView shapeableImageView = nma.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
            iMImageHelper.AEQbTJ(shapeableImageView, iMImageModel, iMImageHelper.fetchVPNInfo(), new Function0() { // from class: o.nBB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return nBD.OLrzqt(str, nma);
                }
            }, new Function1() { // from class: o.nBA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return nBD.copydefault(str, nma, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
    }

    public static final Unit OLrzqt(java.lang.String str, nMA nma) {
        java.util.Set<java.lang.String> set = copydefault;
        if (set.contains(str)) {
            set.remove(str);
            nma.copydefault.copydefault();
            AEQbTJ.add(str);
            android.widget.ImageView imageView = nma.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(8);
            nma.AEQbTJ.setVisibility(8);
            nma.OLrzqt.setTag(OLrzqt, java.lang.Boolean.TRUE);
            nma.OLrzqt.setTag(EZpvd, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.String str, nMA nma, boolean z) {
        java.util.Set<java.lang.String> set = copydefault;
        if (set.contains(str)) {
            set.remove(str);
            nma.copydefault.copydefault();
            nma.AEQbTJ.setVisibility(8);
            nma.OLrzqt.setTag(EZpvd, null);
            if (z) {
                android.widget.ImageView imageView = nma.EZpvd;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(0);
                nma.OLrzqt.setTag(OLrzqt, java.lang.Boolean.FALSE);
                IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
                android.content.Context context = nma.OLrzqt.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                iMImageHelper.copydefault(context);
            } else {
                AEQbTJ.add(str);
                android.widget.ImageView imageView2 = nma.EZpvd;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                imageView2.setVisibility(8);
                nma.OLrzqt.setTag(OLrzqt, java.lang.Boolean.TRUE);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.oAE, o.AbstractC35703oAo, o.AbstractC35882oHe
    public void AEQbTJ(@NotNull oGY<AbstractC44111sDt> ogy) {
        nMA nma;
        ShapeableImageView shapeableImageView;
        Intrinsics.checkNotNullParameter(ogy, "");
        super.AEQbTJ(ogy);
        oAC oac = ogy instanceof oAC ? (oAC) ogy : null;
        if (oac == null || (nma = (nMA) oac.EZpvd()) == null || (shapeableImageView = nma.OLrzqt) == null) {
            return;
        }
        java.lang.Object tag = shapeableImageView.getTag();
        java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        java.lang.Object tag2 = shapeableImageView.getTag(KWHzl);
        java.lang.Runnable runnable = tag2 instanceof java.lang.Runnable ? (java.lang.Runnable) tag2 : null;
        if (runnable != null) {
            shapeableImageView.removeCallbacks(runnable);
        }
        java.lang.Object tag3 = shapeableImageView.getTag(EZpvd);
        java.lang.Runnable runnable2 = tag3 instanceof java.lang.Runnable ? (java.lang.Runnable) tag3 : null;
        if (runnable2 != null) {
            shapeableImageView.removeCallbacks(runnable2);
        }
        if (str != null) {
            java.util.Set<java.lang.String> set = copydefault;
            if (set.contains(str)) {
                set.remove(str);
                android.content.Context context = shapeableImageView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                if (!OLrzqt(context)) {
                    try {
                        Glide.KWHzl(shapeableImageView).AEQbTJ(shapeableImageView);
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
        }
        shapeableImageView.setTag(OLrzqt, null);
        shapeableImageView.setTag(KWHzl, null);
        shapeableImageView.setTag(EZpvd, null);
    }
}
