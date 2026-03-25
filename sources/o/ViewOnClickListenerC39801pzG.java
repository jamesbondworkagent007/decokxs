package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pzG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ViewOnClickListenerC39801pzG extends android.widget.FrameLayout implements View.OnClickListener {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public android.widget.ImageView AEQbTJ;
    public android.view.View AYXKKw;
    public android.view.View AhwBna;
    public android.widget.ImageView EZpvd;
    public android.widget.ImageView OLrzqt;
    public Function1<? super java.lang.Integer, Unit> copydefault;
    public android.view.View djBIcL;
    public android.view.View gEmmrt;
    public android.view.View valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnItemClickListener(@NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    /* JADX INFO: renamed from: o.pzG$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pzG.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC39801pzG(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C35964oKf.Application.invokespecialDPHOMC, this);
        this.OLrzqt = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.setLocationManually);
        this.AEQbTJ = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.zXhzOT);
        this.EZpvd = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.pXZxY);
        this.gEmmrt = viewInflate.findViewById(C35964oKf.StateListAnimator.onSetCaptioningEnabled);
        this.AhwBna = viewInflate.findViewById(C35964oKf.StateListAnimator.setCurrentControllerInfo);
        this.djBIcL = viewInflate.findViewById(C35964oKf.StateListAnimator.MediaSessionCompatMediaSessionImpl);
        this.AYXKKw = viewInflate.findViewById(C35964oKf.StateListAnimator.MediaSessionCompatCallbackCallbackHandler);
        this.valueOf = viewInflate.findViewById(C35964oKf.StateListAnimator.onSetRating);
        android.view.View view = this.djBIcL;
        if (view != null) {
            view.setOnClickListener(this);
        }
        android.view.View view2 = this.AYXKKw;
        if (view2 != null) {
            view2.setOnClickListener(this);
        }
        android.view.View view3 = this.valueOf;
        if (view3 != null) {
            view3.setOnClickListener(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC39801pzG(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C35964oKf.Application.invokespecialDPHOMC, this);
        this.OLrzqt = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.setLocationManually);
        this.AEQbTJ = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.zXhzOT);
        this.EZpvd = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.pXZxY);
        this.gEmmrt = viewInflate.findViewById(C35964oKf.StateListAnimator.onSetCaptioningEnabled);
        this.AhwBna = viewInflate.findViewById(C35964oKf.StateListAnimator.setCurrentControllerInfo);
        this.djBIcL = viewInflate.findViewById(C35964oKf.StateListAnimator.MediaSessionCompatMediaSessionImpl);
        this.AYXKKw = viewInflate.findViewById(C35964oKf.StateListAnimator.MediaSessionCompatCallbackCallbackHandler);
        this.valueOf = viewInflate.findViewById(C35964oKf.StateListAnimator.onSetRating);
        android.view.View view = this.djBIcL;
        if (view != null) {
            view.setOnClickListener(this);
        }
        android.view.View view2 = this.AYXKKw;
        if (view2 != null) {
            view2.setOnClickListener(this);
        }
        android.view.View view3 = this.valueOf;
        if (view3 != null) {
            view3.setOnClickListener(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC39801pzG(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C35964oKf.Application.invokespecialDPHOMC, this);
        this.OLrzqt = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.setLocationManually);
        this.AEQbTJ = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.zXhzOT);
        this.EZpvd = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.pXZxY);
        this.gEmmrt = viewInflate.findViewById(C35964oKf.StateListAnimator.onSetCaptioningEnabled);
        this.AhwBna = viewInflate.findViewById(C35964oKf.StateListAnimator.setCurrentControllerInfo);
        this.djBIcL = viewInflate.findViewById(C35964oKf.StateListAnimator.MediaSessionCompatMediaSessionImpl);
        this.AYXKKw = viewInflate.findViewById(C35964oKf.StateListAnimator.MediaSessionCompatCallbackCallbackHandler);
        this.valueOf = viewInflate.findViewById(C35964oKf.StateListAnimator.onSetRating);
        android.view.View view = this.djBIcL;
        if (view != null) {
            view.setOnClickListener(this);
        }
        android.view.View view2 = this.AYXKKw;
        if (view2 != null) {
            view2.setOnClickListener(this);
        }
        android.view.View view3 = this.valueOf;
        if (view3 != null) {
            view3.setOnClickListener(this);
        }
    }

    public final void setLevel(int i) {
        if (i == 0) {
            android.widget.ImageView imageView = this.OLrzqt;
            if (imageView != null) {
                imageView.setImageResource(C35964oKf.Activity.OLrzqt);
            }
            android.widget.ImageView imageView2 = this.AEQbTJ;
            if (imageView2 != null) {
                imageView2.setImageResource(C35964oKf.Activity.AEQbTJ);
            }
            android.widget.ImageView imageView3 = this.EZpvd;
            if (imageView3 != null) {
                imageView3.setImageResource(C35964oKf.Activity.AEQbTJ);
            }
            android.view.View view = this.gEmmrt;
            if (view != null) {
                view.setBackgroundColor(getContext().getResources().getColor(C52761wXj.Activity.GiPPlLgiPPlL));
            }
            android.view.View view2 = this.AhwBna;
            if (view2 != null) {
                view2.setBackgroundColor(getContext().getResources().getColor(C52761wXj.Activity.GiPPlLgiPPlL));
                return;
            }
            return;
        }
        if (i == 1) {
            android.widget.ImageView imageView4 = this.OLrzqt;
            if (imageView4 != null) {
                imageView4.setImageResource(C35964oKf.Activity.KWHzl);
            }
            android.widget.ImageView imageView5 = this.AEQbTJ;
            if (imageView5 != null) {
                imageView5.setImageResource(C35964oKf.Activity.OLrzqt);
            }
            android.widget.ImageView imageView6 = this.EZpvd;
            if (imageView6 != null) {
                imageView6.setImageResource(C35964oKf.Activity.AEQbTJ);
            }
            android.view.View view3 = this.gEmmrt;
            if (view3 != null) {
                view3.setBackgroundColor(getContext().getResources().getColor(C52761wXj.Activity.DeEinT));
            }
            android.view.View view4 = this.AhwBna;
            if (view4 != null) {
                view4.setBackgroundColor(getContext().getResources().getColor(C52761wXj.Activity.GiPPlLgiPPlL));
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        android.widget.ImageView imageView7 = this.OLrzqt;
        if (imageView7 != null) {
            imageView7.setImageResource(C35964oKf.Activity.KWHzl);
        }
        android.widget.ImageView imageView8 = this.AEQbTJ;
        if (imageView8 != null) {
            imageView8.setImageResource(C35964oKf.Activity.KWHzl);
        }
        android.widget.ImageView imageView9 = this.EZpvd;
        if (imageView9 != null) {
            imageView9.setImageResource(C35964oKf.Activity.OLrzqt);
        }
        android.view.View view5 = this.gEmmrt;
        if (view5 != null) {
            view5.setBackgroundColor(getContext().getResources().getColor(C52761wXj.Activity.DeEinT));
        }
        android.view.View view6 = this.AhwBna;
        if (view6 != null) {
            view6.setBackgroundColor(getContext().getResources().getColor(C52761wXj.Activity.DeEinT));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Integer numValueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int i = C35964oKf.StateListAnimator.MediaSessionCompatMediaSessionImpl;
        if (numValueOf != null && numValueOf.intValue() == i) {
            setLevel(0);
            Function1<? super java.lang.Integer, Unit> function1 = this.copydefault;
            if (function1 != null) {
                function1.invoke(0);
                return;
            }
            return;
        }
        int i2 = C35964oKf.StateListAnimator.MediaSessionCompatCallbackCallbackHandler;
        if (numValueOf != null && numValueOf.intValue() == i2) {
            setLevel(1);
            Function1<? super java.lang.Integer, Unit> function12 = this.copydefault;
            if (function12 != null) {
                function12.invoke(1);
                return;
            }
            return;
        }
        int i3 = C35964oKf.StateListAnimator.onSetRating;
        if (numValueOf != null && numValueOf.intValue() == i3) {
            setLevel(2);
            Function1<? super java.lang.Integer, Unit> function13 = this.copydefault;
            if (function13 != null) {
                function13.invoke(2);
            }
        }
    }
}
