package o;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.business.defi.wallet.detail.binders.accountDetail.DefiWalletAccountDetailBean;
import com.okinc.business.defi.wallet.detail.binders.accountDetail.DefiWalletAccountNameBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import o.dTH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eBS extends AbstractC14584doH<DefiWalletAccountDetailBean.Application, C16713epC> {
    public final Function0<Unit> AEQbTJ;
    public final Function1<java.lang.Boolean, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<java.lang.Boolean, Unit> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public eBS(@NotNull Function0<Unit> function0, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        super(DefiWalletAccountNameBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function0;
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC14584doH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C16713epC c16713epC, @NotNull DefiWalletAccountDetailBean.Application application) {
        Intrinsics.checkNotNullParameter(c16713epC, "");
        Intrinsics.checkNotNullParameter(application, "");
        ShapeableImageView shapeableImageView = c16713epC.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
        C14725dqq.copydefault(shapeableImageView, application.OLrzqt().AEQbTJ(), C13754dXa.Activity.fJNWhG, new Function1() { // from class: o.eBW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eBS.AEQbTJ((C5335Nt) obj);
            }
        }, 80.0f);
        android.widget.TextView textView = c16713epC.gEmmrt;
        textView.setText(application.KWHzl());
        int iMeasureText = (int) textView.getPaint().measureText(application.KWHzl());
        int iDjBIcL = C7857arj.djBIcL(textView.getContext()) - C55298xhM.dpInt$default(104.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (iMeasureText > iDjBIcL) {
            layoutParams.width = iDjBIcL;
        } else {
            layoutParams.width = iMeasureText;
        }
        textView.setLayoutParams(layoutParams);
        textView.setOnClickListener(new ActionBar(textView, 1000L, this));
        android.widget.ImageView imageView = c16713epC.KWHzl;
        imageView.setOnClickListener(new TaskDescription(imageView, 1000L, this));
        android.widget.LinearLayout linearLayout = c16713epC.EZpvd;
        dTQ dtq = (dTQ) C43251rlk.OLrzqt(dTQ.class);
        if (dtq == null || !dtq.copydefault()) {
            c16713epC.gEmmrt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            linearLayout.setVisibility(8);
            return;
        }
        if (application.OLrzqt().djBIcL() || (application.OLrzqt().AubY() && !application.OLrzqt().zLjUOn())) {
            int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.UlJrfe);
            android.widget.ImageView imageView2 = c16713epC.copydefault;
            imageView2.setImageTintList(android.content.res.ColorStateList.valueOf(iCopydefault));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(C55298xhM.dp$default(8, (android.content.Context) null, 1, (java.lang.Object) null));
            gradientDrawable.setColor(C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC));
            imageView2.setBackground(gradientDrawable);
            android.widget.TextView textView2 = c16713epC.AhwBna;
            textView2.setText(C13754dXa.FragmentManager.fraLem);
            textView2.setTextColor(iCopydefault);
            linearLayout.setVisibility(0);
            linearLayout.setOnClickListener(new StateListAnimator(linearLayout, 1000L, this));
            return;
        }
        if (application.OLrzqt().DTwDnp()) {
            android.widget.ImageView imageView3 = c16713epC.copydefault;
            if (C17922fXg.OLrzqt(application.OLrzqt()) instanceof dTH.PendingIntent) {
                int iCopydefault2 = C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ);
                c16713epC.gEmmrt.setTextColor(iCopydefault2);
                imageView3.setImageTintList(android.content.res.ColorStateList.valueOf(iCopydefault2));
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(C55298xhM.dp$default(8, (android.content.Context) null, 1, (java.lang.Object) null));
                gradientDrawable2.setColor(C33070mpX.copydefault(C52761wXj.Activity.aJZHYI));
                imageView3.setBackground(gradientDrawable2);
            } else {
                int iCopydefault3 = C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ);
                c16713epC.gEmmrt.setTextColor(iCopydefault3);
                imageView3.setImageTintList(android.content.res.ColorStateList.valueOf(iCopydefault3));
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setShape(0);
                gradientDrawable3.setCornerRadius(C55298xhM.dp$default(8, (android.content.Context) null, 1, (java.lang.Object) null));
                gradientDrawable3.setColor(C33070mpX.copydefault(C52761wXj.Activity.aJZHYI));
                imageView3.setBackground(gradientDrawable3);
            }
            android.widget.TextView textView3 = c16713epC.AhwBna;
            textView3.setText(C13754dXa.FragmentManager.hQufeQ);
            textView3.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
            linearLayout.setVisibility(0);
            linearLayout.setOnClickListener(new Activity(linearLayout, 1000L, this));
            return;
        }
        if (application.OLrzqt().QbewEr() && !application.OLrzqt().DTwDnp()) {
            c16713epC.gEmmrt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            android.widget.ImageView imageView4 = c16713epC.copydefault;
            imageView4.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe)));
            GradientDrawable gradientDrawable4 = new GradientDrawable();
            gradientDrawable4.setShape(0);
            gradientDrawable4.setCornerRadius(C55298xhM.dp$default(8, (android.content.Context) null, 1, (java.lang.Object) null));
            gradientDrawable4.setColor(C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC));
            imageView4.setBackground(gradientDrawable4);
            android.widget.TextView textView4 = c16713epC.AhwBna;
            textView4.setText(C13754dXa.FragmentManager.zEkrwr);
            textView4.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
            linearLayout.setVisibility(0);
            linearLayout.setOnClickListener(new Application(linearLayout, 1000L, this));
            return;
        }
        c16713epC.gEmmrt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        linearLayout.setVisibility(8);
    }

    public static final Unit AEQbTJ(C5335Nt c5335Nt) {
        Intrinsics.checkNotNullParameter(c5335Nt, "");
        c5335Nt.EZpvd((NN<android.graphics.Bitmap>) new C5417Qx(C55298xhM.dp2px$default(16.0f, null, 1, null)));
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ eBS KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, eBS ebs) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = ebs;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.EZpvd().invoke();
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ eBS copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, eBS ebs) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = ebs;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.copydefault().invoke(java.lang.Boolean.TRUE);
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ eBS copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, eBS ebs) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = ebs;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.copydefault().invoke(java.lang.Boolean.TRUE);
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ eBS OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, eBS ebs) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = ebs;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.copydefault().invoke(java.lang.Boolean.FALSE);
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ eBS OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, eBS ebs) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = ebs;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.EZpvd().invoke();
            }
        }
    }
}
