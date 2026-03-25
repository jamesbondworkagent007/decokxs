package o;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import com.google.android.material.imageview.ShapeableImageView;
import com.just.agentweb.DefaultWebClient;
import com.okinc.okimcore.model.im.OKTextMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.SiteMeta;
import com.okinc.web.WebActivity;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C44105sDn;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class nDC {
    public static final nDC AEQbTJ = new nDC();

    private nDC() {
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(@NotNull sDA sda, @NotNull OKTextMessage oKTextMessage, boolean z) {
        int i;
        java.lang.String strKWHzl;
        java.lang.String strOLrzqt;
        java.lang.String strAhwBna;
        Intrinsics.checkNotNullParameter(sda, "");
        Intrinsics.checkNotNullParameter(oKTextMessage, "");
        android.view.View view = sda.djBIcL;
        view.setBackground(ContextCompat.getDrawable(view.getContext(), z ? C44105sDn.Application.fetchVPNInfo : C44105sDn.Application.AuCTel));
        nDC ndc = AEQbTJ;
        android.content.Context context = sda.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        java.lang.String strEZpvd = ndc.EZpvd(context, oKTextMessage);
        android.widget.TextView textView = sda.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(strEZpvd.length() > 0 ? 0 : 8);
        sda.AhwBna.setText(strEZpvd);
        SiteMeta siteMeta = oKTextMessage.getSiteMeta();
        if (siteMeta != null && (strAhwBna = siteMeta.AhwBna()) != null) {
            android.widget.TextView textView2 = sda.EZpvd;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) strAhwBna) ? 0 : 8);
            sda.EZpvd.setText(strAhwBna);
        }
        SiteMeta siteMeta2 = oKTextMessage.getSiteMeta();
        if (siteMeta2 != null && (strOLrzqt = siteMeta2.OLrzqt()) != null) {
            android.widget.TextView textView3 = sda.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) strOLrzqt) ? 0 : 8);
            sda.KWHzl.setText(strOLrzqt);
        }
        android.widget.TextView textView4 = sda.AhwBna;
        textView4.setTextColor(ContextCompat.getColor(textView4.getContext(), z ? C52761wXj.Activity.DCUTEIddSDPG : C52761wXj.Activity.WS));
        android.widget.TextView textView5 = sda.EZpvd;
        textView5.setTextColor(ContextCompat.getColor(textView5.getContext(), z ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.zblBkD));
        android.widget.TextView textView6 = sda.KWHzl;
        textView6.setTextColor(ContextCompat.getColor(textView6.getContext(), z ? C52761wXj.Activity.DCUTEIddSDPG : C52761wXj.Activity.WS));
        android.view.View root = sda.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.setVisibility(0);
        java.lang.Object parent = sda.getRoot().getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view2 != null) {
            android.view.ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new Application(viewTreeObserver, view2, view2, sda));
        }
        LottieAnimationView lottieAnimationView = sda.copydefault;
        android.content.Context context2 = lottieAnimationView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        lottieAnimationView.setAnimationFromUrl(C7827arF.EZpvd("lottie/im/og_image_preview_loading.lottie", context2, true));
        sda.copydefault.setVisibility(0);
        if (C33492mxV.OLrzqt()) {
            i = z ? C52761wXj.Activity.QkdxfA : C52761wXj.Activity.OFhtUX;
        } else if (z) {
            i = C52761wXj.Activity.OBJEWx;
        }
        sda.AEQbTJ.setBackgroundResource(i);
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(sda.AEQbTJ.getContext());
        SiteMeta siteMeta3 = oKTextMessage.getSiteMeta();
        componentCallbacks2C5333NrAEQbTJ.EZpvd(siteMeta3 != null ? siteMeta3.EZpvd() : null).OLrzqt((RY<android.graphics.drawable.Drawable>) new Activity(sda)).EZpvd((android.widget.ImageView) sda.AEQbTJ);
        SiteMeta siteMeta4 = oKTextMessage.getSiteMeta();
        if (siteMeta4 == null || (strKWHzl = siteMeta4.KWHzl()) == null) {
            return;
        }
        android.view.View root2 = sda.getRoot();
        root2.setOnClickListener(new ActionBar(root2, 1000L, strKWHzl, sda));
    }

    public static final class Activity implements RY<android.graphics.drawable.Drawable> {
        public final /* synthetic */ sDA KWHzl;

        public Activity(sDA sda) {
            this.KWHzl = sda;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
        @Override // o.RY
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean copydefault(android.graphics.drawable.Drawable drawable, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
            this.KWHzl.copydefault.setVisibility(8);
            this.KWHzl.AEQbTJ.setVisibility(0);
            return false;
        }

        @Override // o.RY
        public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, boolean z) {
            this.KWHzl.copydefault.setVisibility(0);
            this.KWHzl.AEQbTJ.setVisibility(8);
            return false;
        }
    }

    public static final class Application implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ android.view.ViewTreeObserver AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ sDA copydefault;

        public Application(android.view.ViewTreeObserver viewTreeObserver, android.view.View view, android.view.View view2, sDA sda) {
            this.AEQbTJ = viewTreeObserver;
            this.OLrzqt = view;
            this.KWHzl = view2;
            this.copydefault = sda;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            (this.AEQbTJ.isAlive() ? this.AEQbTJ : this.OLrzqt.getViewTreeObserver()).removeOnGlobalLayoutListener(this);
            int measuredWidth = this.KWHzl.getMeasuredWidth();
            android.content.Context context = this.copydefault.AEQbTJ.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iCopydefault = C55298xhM.copydefault(34.0f, context);
            ViewGroup.LayoutParams layoutParams = this.copydefault.OLrzqt.getLayoutParams();
            android.content.Context context2 = this.copydefault.AEQbTJ.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iCopydefault2 = C55298xhM.copydefault(229.0f, context2);
            android.content.Context context3 = this.copydefault.AEQbTJ.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            int iCopydefault3 = C55298xhM.copydefault(205.0f, context3);
            if (measuredWidth >= iCopydefault2 + iCopydefault) {
                android.content.Context context4 = this.copydefault.AEQbTJ.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                layoutParams.width = C55298xhM.copydefault(229.0f, context4);
                android.content.Context context5 = this.copydefault.AEQbTJ.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "");
                layoutParams.height = C55298xhM.copydefault(120.6f, context5);
            } else if (measuredWidth >= iCopydefault3 + iCopydefault) {
                android.content.Context context6 = this.copydefault.AEQbTJ.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "");
                layoutParams.width = C55298xhM.copydefault(205.0f, context6);
                android.content.Context context7 = this.copydefault.AEQbTJ.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "");
                layoutParams.height = C55298xhM.copydefault(108.0f, context7);
            } else {
                android.content.Context context8 = this.copydefault.AEQbTJ.getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "");
                layoutParams.width = C55298xhM.copydefault(165.0f, context8);
                android.content.Context context9 = this.copydefault.AEQbTJ.getContext();
                Intrinsics.checkNotNullExpressionValue(context9, "");
                layoutParams.height = C55298xhM.copydefault(86.9f, context9);
            }
            this.copydefault.OLrzqt.setLayoutParams(layoutParams);
        }
    }

    public final java.lang.String EZpvd(android.content.Context context, OKTextMessage oKTextMessage) {
        java.lang.String strValueOf;
        SiteMeta siteMeta = oKTextMessage.getSiteMeta();
        if (siteMeta != null) {
            java.lang.Long lCopydefault = siteMeta.copydefault();
            java.lang.Long lAEQbTJ = siteMeta.AEQbTJ();
            if (lCopydefault != null && lCopydefault.longValue() != 0 && lAEQbTJ != null && lAEQbTJ.longValue() != 0) {
                java.lang.String string = context.getString(C35399nuc.LoaderManager.DQzvGNdrmXxu);
                Intrinsics.checkNotNullExpressionValue(string, "");
                return C33069mpW.OLrzqt(string, C56424yEw.gEmmrt(C56390yDp.OLrzqt("startDate", pTA.formatSimpleDate$default(new Date(lCopydefault.longValue()), null, 1, null)), C56390yDp.OLrzqt("endDate", pTA.formatSimpleDate$default(new Date(lAEQbTJ.longValue()), null, 1, null))));
            }
        }
        SiteMeta siteMeta2 = oKTextMessage.getSiteMeta();
        return (siteMeta2 == null || (strValueOf = siteMeta2.valueOf()) == null) ? "" : strValueOf;
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ sDA copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, java.lang.String str, sDA sda) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = str;
            this.copydefault = sda;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (C59449zhJ.AYXKKw(this.AEQbTJ, DefaultWebClient.HTTPS_SCHEME, true) || C59449zhJ.AYXKKw(this.AEQbTJ, DefaultWebClient.HTTP_SCHEME, true)) {
                    WebActivity.TaskDescription taskDescription = WebActivity.Companion;
                    android.content.Context context = this.copydefault.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    C35878oHa.openPageWithInterceptor$default(taskDescription, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", this.AEQbTJ)), null, 4, null);
                    return;
                }
                WebActivity.TaskDescription taskDescription2 = WebActivity.Companion;
                android.content.Context context2 = this.copydefault.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                C35878oHa.openPageWithInterceptor$default(taskDescription2, context2, BundleKt.bundleOf(C56390yDp.OLrzqt("url", DefaultWebClient.HTTPS_SCHEME + this.AEQbTJ)), null, 4, null);
            }
        }
    }

    public final void copydefault(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        try {
            CardView cardView = (CardView) view.findViewById(C44105sDn.ActionBar.OLrzqt);
            ShapeableImageView shapeableImageView = (ShapeableImageView) view.findViewById(C44105sDn.ActionBar.AuCTel);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(C44105sDn.ActionBar.zsXlph);
            float fDp2pxFloat$default = C55298xhM.dp2pxFloat$default(8.0f, null, 1, null);
            if (cardView != null) {
                cardView.setRadius(fDp2pxFloat$default);
                cardView.setLayerType(1, null);
            }
            if (shapeableImageView != null) {
                shapeableImageView.setShapeAppearanceModel(shapeableImageView.getShapeAppearanceModel().toBuilder().setAllCornerSizes(fDp2pxFloat$default).build());
                shapeableImageView.setClipToOutline(true);
                shapeableImageView.setOutlineProvider(new TaskDescription(fDp2pxFloat$default));
            }
            if (lottieAnimationView != null) {
                lottieAnimationView.setClipToOutline(true);
                lottieAnimationView.setOutlineProvider(new StateListAnimator(fDp2pxFloat$default));
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public static final class TaskDescription extends android.view.ViewOutlineProvider {
        public final /* synthetic */ float EZpvd;

        public TaskDescription(float f) {
            this.EZpvd = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(android.view.View view, Outline outline) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(outline, "");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.EZpvd);
        }
    }

    public static final class StateListAnimator extends android.view.ViewOutlineProvider {
        public final /* synthetic */ float OLrzqt;

        public StateListAnimator(float f) {
            this.OLrzqt = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(android.view.View view, Outline outline) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(outline, "");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.OLrzqt);
        }
    }
}
