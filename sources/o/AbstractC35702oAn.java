package o;

import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.im.bean.IMUserInfo;
import com.okinc.im.message.MessageClusterType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC35702oAn;
import o.C35254nrp;
import o.C44105sDn;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oAn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC35702oAn<C extends OKMessageContent, VDB extends ViewDataBinding> extends AbstractC35703oAo<C, VDB> {
    public final java.util.Map<android.view.View, java.lang.Boolean> AubY = new LinkedHashMap();

    /* JADX INFO: renamed from: o.oAn$TaskDescription */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MessageClusterType.values().length];
            try {
                iArr[MessageClusterType.First.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            copydefault = iArr;
        }
    }

    /* JADX INFO: renamed from: o.oAn$Activity */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Activity implements InterfaceC35283nsR {
        public final InterfaceC35283nsR copydefault;

        public Activity(InterfaceC35283nsR interfaceC35283nsR) {
            this.copydefault = interfaceC35283nsR;
        }

        @Override // o.InterfaceC35283nsR
        public void EZpvd(int i, @NotNull OKMessage oKMessage, @NotNull RecyclerView.Adapter<?> adapter, @NotNull android.widget.TextView textView) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            Intrinsics.checkNotNullParameter(adapter, "");
            Intrinsics.checkNotNullParameter(textView, "");
            textView.setVisibility(this.copydefault != null ? 0 : 8);
            InterfaceC35283nsR interfaceC35283nsR = this.copydefault;
            if (interfaceC35283nsR != null) {
                interfaceC35283nsR.EZpvd(i, oKMessage, adapter, textView);
            }
        }

        @Override // o.InterfaceC35283nsR
        public void KWHzl(int i, @NotNull OKMessage oKMessage, @NotNull RecyclerView.Adapter<?> adapter, @NotNull android.widget.TextView textView, @NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            Intrinsics.checkNotNullParameter(adapter, "");
            Intrinsics.checkNotNullParameter(textView, "");
            Intrinsics.checkNotNullParameter(view, "");
            InterfaceC35283nsR interfaceC35283nsR = this.copydefault;
            if (interfaceC35283nsR != null) {
                interfaceC35283nsR.KWHzl(i, oKMessage, adapter, textView, view);
            } else {
                view.setVisibility(8);
            }
        }
    }

    @Override // o.AbstractC35703oAo
    public InterfaceC35283nsR values() {
        return new Activity(super.values());
    }

    public final void AEQbTJ(int i, @NotNull C35254nrp c35254nrp, @NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(textView, "");
        InterfaceC35283nsR interfaceC35283nsRValues = values();
        if (interfaceC35283nsRValues != null && c35254nrp.values()) {
            interfaceC35283nsRValues.EZpvd(i, c35254nrp.OLrzqt(), zuBGHE(), textView);
        } else {
            textView.setVisibility(8);
        }
        int iDp2px$default = c35254nrp.AuCTel() ? 0 : C55298xhM.dp2px$default(16.0f, null, 1, null);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, iDp2px$default, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
    }

    public final void AEQbTJ(@NotNull C35254nrp c35254nrp, @NotNull android.view.View view) {
        android.graphics.drawable.Drawable drawableKWHzl;
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(view, "");
        if (view instanceof ShapeableImageView) {
            C35254nrp.Application application = C35254nrp.Companion;
            application.copydefault((ShapeableImageView) view, application.OLrzqt(c35254nrp), false);
            drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.getUriFromString);
        } else {
            C35254nrp.Application application2 = C35254nrp.Companion;
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            drawableKWHzl = application2.KWHzl(context, c35254nrp);
        }
        view.setBackground(drawableKWHzl);
    }

    public final void KWHzl(C35254nrp c35254nrp, android.view.View view) {
        java.lang.Boolean boolIsConnected = c35254nrp.isConnected();
        boolean zBooleanValue = boolIsConnected != null ? boolIsConnected.booleanValue() : false;
        android.view.View viewFindViewById = view.findViewById(C44105sDn.ActionBar.AuCTelauCTel);
        if (viewFindViewById == null) {
            return;
        }
        java.lang.Boolean bool = this.AubY.get(viewFindViewById);
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        boolean zEZpvd = Intrinsics.EZpvd(bool, bool2);
        if (zBooleanValue && !zEZpvd) {
            this.AubY.put(viewFindViewById, bool2);
            viewFindViewById.animate().cancel();
            viewFindViewById.setVisibility(0);
            viewFindViewById.setAlpha(0.0f);
            viewFindViewById.animate().alpha(1.0f).setDuration(600L).setStartDelay(0L).setListener(new StateListAnimator(viewFindViewById, this, viewFindViewById)).start();
            return;
        }
        if (zBooleanValue || zEZpvd) {
            return;
        }
        viewFindViewById.animate().cancel();
        viewFindViewById.setVisibility(8);
        viewFindViewById.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: o.oAn$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator extends android.animation.AnimatorListenerAdapter {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ AbstractC35702oAn<C, VDB> OLrzqt;

        public StateListAnimator(android.view.View view, AbstractC35702oAn<C, VDB> abstractC35702oAn, android.view.View view2) {
            this.AEQbTJ = view;
            this.OLrzqt = abstractC35702oAn;
            this.KWHzl = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            final android.view.View view = this.AEQbTJ;
            final AbstractC35702oAn<C, VDB> abstractC35702oAn = this.OLrzqt;
            final android.view.View view2 = this.KWHzl;
            view.postDelayed(new java.lang.Runnable() { // from class: o.oAq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC35702oAn.StateListAnimator.EZpvd(view, abstractC35702oAn, view2);
                }
            }, 2000L);
        }

        public static final void EZpvd(android.view.View view, AbstractC35702oAn abstractC35702oAn, android.view.View view2) {
            view.animate().alpha(0.0f).setDuration(600L).setListener(new ActionBar(view, abstractC35702oAn, view2)).start();
        }

        /* JADX INFO: renamed from: o.oAn$StateListAnimator$ActionBar */
        public static final class ActionBar extends android.animation.AnimatorListenerAdapter {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ AbstractC35702oAn<C, VDB> copydefault;

            public ActionBar(android.view.View view, AbstractC35702oAn<C, VDB> abstractC35702oAn, android.view.View view2) {
                this.AEQbTJ = view;
                this.copydefault = abstractC35702oAn;
                this.OLrzqt = view2;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "");
                this.AEQbTJ.setVisibility(8);
                this.copydefault.AubY.remove(this.OLrzqt);
            }
        }
    }

    public final void EZpvd(int i, @NotNull C35254nrp c35254nrp, @NotNull android.widget.TextView textView, @NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(view, "");
        InterfaceC35283nsR interfaceC35283nsRValues = values();
        if (interfaceC35283nsRValues != null && (c35254nrp.copydefault() == MessageClusterType.First || iwGUEr())) {
            interfaceC35283nsRValues.KWHzl(i, c35254nrp.OLrzqt(), zuBGHE(), textView, view);
        } else {
            view.setVisibility(8);
        }
    }

    public final void OLrzqt(@NotNull android.view.View view, @NotNull android.widget.TextView textView, @NotNull C35254nrp c35254nrp) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        view.setVisibility(c35254nrp.AuCTel() ? 0 : 8);
        textView.setText(C33070mpX.EZpvd(C44105sDn.Activity.EZpvd, c35254nrp.gEmmrt()));
    }

    public final void copydefault(C35254nrp c35254nrp, android.view.View view) {
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup != null) {
            C35700oAl.EZpvd.OLrzqt(c35254nrp, viewGroup);
        }
    }

    public final java.lang.Object AEQbTJ(@NotNull OKMessage oKMessage, @NotNull Continuation<? super IMUserInfo> continuation) {
        oAX oaxIsConnected = isConnected();
        if (oaxIsConnected != null) {
            return oaxIsConnected.OLrzqt(oKMessage, continuation);
        }
        return null;
    }

    public final void EZpvd(C35254nrp c35254nrp, android.view.View view) {
        int iDp2px$default;
        OKMessageContent content = c35254nrp.OLrzqt().getContent();
        if (content == null || !C44170sFx.OLrzqt(content)) {
            MessageClusterType messageClusterTypeCopydefault = c35254nrp.copydefault();
            if (messageClusterTypeCopydefault != null && TaskDescription.copydefault[messageClusterTypeCopydefault.ordinal()] == 1) {
                iDp2px$default = C55298xhM.dp2px$default(16.0f, null, 1, null);
            } else {
                iDp2px$default = C55298xhM.dp2px$default(2.0f, null, 1, null);
            }
            view.setPadding(view.getPaddingLeft(), iDp2px$default, view.getPaddingRight(), 0);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/oGY;Ljava/lang/Object;)V */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.oGY<VDB extends androidx.databinding.ViewDataBinding> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC35882oHe
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull oGY<VDB> ogy, @NotNull C35254nrp c35254nrp) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        super.KWHzl(ogy, c35254nrp);
        EZpvd(ogy, c35254nrp);
    }

    public final void EZpvd(oGY<VDB> ogy, C35254nrp c35254nrp) {
        InterfaceC35179nqT interfaceC35179nqT;
        android.view.View root = ogy.copydefault().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        copydefault(c35254nrp, root);
        KWHzl(c35254nrp, root);
        EZpvd(c35254nrp, root);
        if (!C32986mnt.EZpvd.valueOf() || (interfaceC35179nqT = (InterfaceC35179nqT) C43251rlk.OLrzqt(InterfaceC35179nqT.class)) == null) {
            return;
        }
        interfaceC35179nqT.OLrzqt(yDY.copydefault(c35254nrp.OLrzqt()));
    }
}
