package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.okinc.business.invest_biz.ui.widget.InvestUniv3APRViewMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jrb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27247jrb extends ConstraintLayout {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public InvestUniv3APRViewMode KWHzl;
    public InterfaceC27124jpK OLrzqt;

    /* JADX INFO: renamed from: o.jrb$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InvestUniv3APRViewMode.values().length];
            try {
                iArr[InvestUniv3APRViewMode.DEFAULT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[InvestUniv3APRViewMode.V2.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27247jrb(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27247jrb(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:26) call: o.jrb.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27247jrb(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27247jrb(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = InvestUniv3APRViewMode.DEFAULT;
        OLrzqt();
    }

    /* JADX INFO: renamed from: o.jrb$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jrb.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    private final InterfaceC27124jpK AEQbTJ() {
        return KWHzl();
    }

    private final InterfaceC27124jpK KWHzl() {
        InterfaceC27124jpK c27125jpL;
        if (this.OLrzqt == null) {
            int i = StateListAnimator.copydefault[this.KWHzl.ordinal()];
            if (i == 1) {
                iMU imuOLrzqt = iMU.OLrzqt(android.view.LayoutInflater.from(getContext()), this);
                Intrinsics.checkNotNullExpressionValue(imuOLrzqt, "");
                c27125jpL = new C27125jpL(imuOLrzqt);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iMZ imzAEQbTJ = iMZ.AEQbTJ(android.view.LayoutInflater.from(getContext()), this);
                Intrinsics.checkNotNullExpressionValue(imzAEQbTJ, "");
                c27125jpL = new C27320jsv(imzAEQbTJ);
            }
            this.OLrzqt = c27125jpL;
        }
        InterfaceC27124jpK interfaceC27124jpK = this.OLrzqt;
        Intrinsics.copydefault(interfaceC27124jpK);
        return interfaceC27124jpK;
    }

    private final void OLrzqt() {
        removeAllViews();
        KWHzl();
    }

    public final void setData(@NotNull C23956iPo c23956iPo) {
        Intrinsics.checkNotNullParameter(c23956iPo, "");
        InterfaceC27124jpK interfaceC27124jpKAEQbTJ = AEQbTJ();
        android.view.View viewKWHzl = interfaceC27124jpKAEQbTJ.KWHzl();
        if (viewKWHzl instanceof android.widget.TextView) {
            android.view.View viewKWHzl2 = interfaceC27124jpKAEQbTJ.KWHzl();
            Intrinsics.copydefault(viewKWHzl2, "");
            android.widget.TextView textView = (android.widget.TextView) viewKWHzl2;
            java.lang.String strKWHzl = c23956iPo.KWHzl();
            textView.setText(strKWHzl.length() != 0 ? strKWHzl : "APR");
        } else if (viewKWHzl instanceof C55258xgZ) {
            android.view.View viewKWHzl3 = interfaceC27124jpKAEQbTJ.KWHzl();
            Intrinsics.copydefault(viewKWHzl3, "");
            C55258xgZ c55258xgZ = (C55258xgZ) viewKWHzl3;
            java.lang.String strKWHzl2 = c23956iPo.KWHzl();
            c55258xgZ.setTextValue(strKWHzl2.length() != 0 ? strKWHzl2 : "APR");
        }
        interfaceC27124jpKAEQbTJ.copydefault().setText((c23956iPo.copydefault() || c23956iPo.AEQbTJ()) ? "--" : c23956iPo.OLrzqt());
        if (interfaceC27124jpKAEQbTJ.KWHzl() instanceof android.widget.TextView) {
            android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.GGlJim);
            if (drawable != null) {
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                int iCopydefault = C55298xhM.copydefault(16.0f, context);
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                drawable.setBounds(0, 0, iCopydefault, C55298xhM.copydefault(16.0f, context2));
            }
            android.view.View viewKWHzl4 = interfaceC27124jpKAEQbTJ.KWHzl();
            Intrinsics.copydefault(viewKWHzl4, "");
            ((android.widget.TextView) viewKWHzl4).setCompoundDrawablesRelative(null, null, drawable, null);
            android.view.View viewKWHzl5 = interfaceC27124jpKAEQbTJ.KWHzl();
            viewKWHzl5.setOnClickListener(new ActionBar(viewKWHzl5, 1000L, this, c23956iPo));
            return;
        }
        if (interfaceC27124jpKAEQbTJ.KWHzl() instanceof C55258xgZ) {
            android.view.View viewKWHzl6 = interfaceC27124jpKAEQbTJ.KWHzl();
            viewKWHzl6.setOnClickListener(new LoaderManager(viewKWHzl6, 1000L, this, c23956iPo));
        }
    }

    /* JADX INFO: renamed from: o.jrb$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.copydefault = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.copydefault.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.jrb$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.EZpvd = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.EZpvd.dismiss();
        }
    }

    public final void EZpvd(@NotNull InvestUniv3APRViewMode investUniv3APRViewMode) {
        Intrinsics.checkNotNullParameter(investUniv3APRViewMode, "");
        if (this.KWHzl != investUniv3APRViewMode) {
            this.KWHzl = investUniv3APRViewMode;
            this.OLrzqt = null;
            OLrzqt();
        }
    }

    /* JADX INFO: renamed from: o.jrb$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C23956iPo EZpvd;
        public final /* synthetic */ C27247jrb KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C27247jrb c27247jrb, C23956iPo c23956iPo) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = c27247jrb;
            this.EZpvd = c23956iPo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.content.Context context = this.KWHzl.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.EZpvd(viewOnClickListenerC54939xaY.getContext().getString(this.EZpvd.EZpvd()));
                java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C25493ixk.FragmentManager.OHqIaq);
                Intrinsics.checkNotNullExpressionValue(string, "");
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) new Activity(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.jrb$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ C23956iPo AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C27247jrb KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C27247jrb c27247jrb, C23956iPo c23956iPo) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = c27247jrb;
            this.AEQbTJ = c23956iPo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.content.Context context = this.KWHzl.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.EZpvd(viewOnClickListenerC54939xaY.getContext().getString(this.AEQbTJ.EZpvd()));
                java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C25493ixk.FragmentManager.OHqIaq);
                Intrinsics.checkNotNullExpressionValue(string, "");
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) new TaskDescription(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }
}
