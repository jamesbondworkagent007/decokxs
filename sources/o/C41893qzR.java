package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.ViewKt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33473mxC;
import o.C52761wXj;
import o.qAG;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qzR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41893qzR extends ConstraintLayout {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public InterfaceC41894qzS EZpvd;
    public C42637raF copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41893qzR(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41893qzR(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setListener(InterfaceC41894qzS interfaceC41894qzS) {
        this.EZpvd = interfaceC41894qzS;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:32) call: o.qzR.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C41893qzR(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41893qzR(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C42637raF c42637raFOLrzqt = C42637raF.OLrzqt(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c42637raFOLrzqt, "");
        this.copydefault = c42637raFOLrzqt;
        if (ViewCompat.isAttachedToWindow(this)) {
            KWHzl();
        } else {
            addOnAttachStateChangeListener(new Dialog(this, this));
        }
    }

    /* JADX INFO: renamed from: o.qzR$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qzR.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl() {
        qAG qag = this.copydefault.copydefault;
        Intrinsics.copydefault(qag);
        C41396qpy.onTextChanged$default(qag, LifecycleOwnerKt.getLifecycleScope(ViewKt.findFragment(qag)), 150L, false, new Function1() { // from class: o.qzP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41893qzR.KWHzl(this.AEQbTJ, (java.lang.String) obj);
            }
        }, 4, null);
        qag.setFilters(new qAI[]{new qAI()});
        new C33473mxC(qag, new TaskDescription());
        qag.setOnKeyClickListener(new ActionBar(qag));
        C55258xgZ c55258xgZ = this.copydefault.OLrzqt;
        c55258xgZ.setOnClickListener(new StateListAnimator(c55258xgZ, 1000L, this));
        AEQbTJ(0);
    }

    public static final Unit KWHzl(C41893qzR c41893qzR, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c41893qzR.AEQbTJ(str.length());
        InterfaceC41894qzS interfaceC41894qzS = c41893qzR.EZpvd;
        if (interfaceC41894qzS != null) {
            interfaceC41894qzS.AEQbTJ(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.qzR$TaskDescription */
    public static final class TaskDescription implements C33473mxC.Activity {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C33473mxC.Activity
        public void EZpvd(android.view.View view, android.graphics.drawable.Drawable drawable) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public TaskDescription() {
        }

        @Override // o.C33473mxC.Activity
        public void KWHzl(android.view.View view, android.graphics.drawable.Drawable drawable) {
            Intrinsics.checkNotNullParameter(view, "");
            C41893qzR.this.copydefault.copydefault.setText("");
        }
    }

    /* JADX INFO: renamed from: o.qzR$ActionBar */
    public static final class ActionBar implements qAG.Application {
        public final /* synthetic */ qAG copydefault;

        @Override // o.qAG.Application
        public boolean KWHzl() {
            return false;
        }

        public ActionBar(qAG qag) {
            this.copydefault = qag;
        }

        @Override // o.qAG.Application
        public boolean EZpvd() {
            qAG qag = C41893qzR.this.copydefault.copydefault;
            Intrinsics.checkNotNullExpressionValue(qag, "");
            android.content.Context context = this.copydefault.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C41431qqg.AEQbTJ(qag, context);
            return true;
        }
    }

    /* JADX INFO: renamed from: o.qzR$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.KWHzl = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.KWHzl.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.qzR$Dialog */
    public static final class Dialog implements View.OnAttachStateChangeListener {
        public final /* synthetic */ C41893qzR KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public Dialog(android.view.View view, C41893qzR c41893qzR) {
            this.copydefault = view;
            this.KWHzl = c41893qzR;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.copydefault.removeOnAttachStateChangeListener(this);
            this.KWHzl.KWHzl();
        }
    }

    private final void AEQbTJ(int i) {
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.hdpuIA);
        android.graphics.drawable.Drawable drawableKWHzl2 = i > 0 ? C33070mpX.KWHzl(C52761wXj.TaskDescription.TarCU) : null;
        if (drawableKWHzl2 != null) {
            C33057mpK.copydefault(drawableKWHzl2, C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        }
        this.copydefault.copydefault.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableKWHzl, (android.graphics.drawable.Drawable) null, drawableKWHzl2, (android.graphics.drawable.Drawable) null);
    }

    public final void AEQbTJ(@NotNull java.util.Set<? extends BizInstrument> set) {
        Intrinsics.checkNotNullParameter(set, "");
        C55372xih c55372xih = this.copydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55372xih, "");
        c55372xih.setVisibility(set.isEmpty() ^ true ? 0 : 8);
        this.copydefault.EZpvd.removeAllViews();
        int i = 0;
        for (java.lang.Object obj : set) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            C55372xih c55372xih2 = this.copydefault.EZpvd;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            final C41895qzT c41895qzT = new C41895qzT(context, null, 0, 6, null);
            c41895qzT.setData((BizInstrument) obj, C33129mqd.AhwBna(java.lang.Integer.valueOf(i), 0), new Function1() { // from class: o.qzV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C41893qzR.KWHzl(this.EZpvd, c41895qzT, (BizInstrument) obj2);
                }
            });
            c55372xih2.addView(c41895qzT);
            i++;
        }
    }

    public static final Unit KWHzl(C41893qzR c41893qzR, C41895qzT c41895qzT, BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        c41893qzR.copydefault.EZpvd.removeView(c41895qzT);
        InterfaceC41894qzS interfaceC41894qzS = c41893qzR.EZpvd;
        if (interfaceC41894qzS != null) {
            interfaceC41894qzS.AEQbTJ(bizInstrument);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.qzR$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C41893qzR KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C41893qzR c41893qzR) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = c41893qzR;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.content.Context context = this.KWHzl.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.setTitle(qZH.PendingIntent.HJWChPHhYHK);
                viewOnClickListenerC54939xaY.copydefault(qZH.PendingIntent.GzAsTt);
                viewOnClickListenerC54939xaY.EZpvd(qZH.PendingIntent.uzCIH, new Activity(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }
}
