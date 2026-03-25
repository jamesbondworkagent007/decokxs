package o;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.okinc.uilab.stateful.StatefulView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xgE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55237xgE extends android.widget.FrameLayout implements StatefulView {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public int AEQbTJ;
    public android.view.LayoutInflater AYXKKw;
    public int AhwBna;
    public int EZpvd;
    public long KWHzl;
    public C55113xdn OLrzqt;
    public int djBIcL;
    public StatefulView.Status fetchVPNInfo;
    public int gEmmrt;
    public java.util.Map<java.lang.Integer, android.view.View> valueOf;

    /* JADX INFO: renamed from: o.xgE$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[StatefulView.Status.values().length];
            try {
                iArr[StatefulView.Status.Content.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[StatefulView.Status.Loading.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[StatefulView.Status.Empty.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[StatefulView.Status.Error.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[StatefulView.Status.None.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55237xgE(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55237xgE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StatefulView.Status OLrzqt() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLoadingDelayedTime(long j) {
        this.KWHzl = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMContentId(int i) {
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMEmptyLayoutId(int i) {
        this.EZpvd = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMErrorLayoutId(int i) {
        this.djBIcL = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMInflater(android.view.LayoutInflater layoutInflater) {
        this.AYXKKw = layoutInflater;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMLayoutMap(@NotNull java.util.Map<java.lang.Integer, android.view.View> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.valueOf = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMLoadingLayoutId(int i) {
        this.gEmmrt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMNoneLayoutId(int i) {
        this.AhwBna = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:37) call: o.xgE.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55237xgE(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55237xgE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = -1;
        this.gEmmrt = -1;
        this.djBIcL = -1;
        this.AhwBna = -1;
        this.AEQbTJ = -1;
        this.valueOf = new java.util.HashMap();
        this.fetchVPNInfo = StatefulView.Status.Content;
        this.KWHzl = 500L;
        this.AYXKKw = android.view.LayoutInflater.from(context);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.requestPostMessageChannel, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.EZpvd = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.receiveFile, C52761wXj.Fragment.ffGIBT);
        this.gEmmrt = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.ICustomTabsServiceStubProxy, C52761wXj.Fragment.zuWLRA);
        this.djBIcL = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.ICustomTabsServiceStub, C52761wXj.Fragment.ffGIBT);
        this.AhwBna = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.ICustomTabsServiceDefault, C52761wXj.Fragment.DCUTEI);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() != 1) {
            throw new java.lang.IllegalStateException("LoadingLayout only can have one child view".toString());
        }
        android.view.View childAt = getChildAt(0);
        Intrinsics.checkNotNullExpressionValue(childAt, "");
        EZpvd(childAt);
    }

    private final void EZpvd(android.view.View view) {
        int id = view.getId();
        this.AEQbTJ = id;
        EZpvd(id);
        this.valueOf.put(java.lang.Integer.valueOf(this.AEQbTJ), view);
        this.fetchVPNInfo = StatefulView.Status.Content;
    }

    public final C55237xgE OLrzqt(@androidx.annotation.LayoutRes int i) {
        EZpvd(i);
        int i2 = this.EZpvd;
        if (i2 != i) {
            KWHzl(i2);
            this.EZpvd = i;
        }
        return this;
    }

    public final C55237xgE copydefault(@androidx.annotation.LayoutRes int i) {
        EZpvd(i);
        int i2 = this.djBIcL;
        if (i2 != i) {
            KWHzl(i2);
            this.djBIcL = i;
        }
        return this;
    }

    public final C55237xgE djBIcL(@androidx.annotation.LayoutRes int i) {
        this.OLrzqt = null;
        EZpvd(i);
        int i2 = this.gEmmrt;
        if (i2 != i) {
            KWHzl(i2);
            this.gEmmrt = i;
        }
        return this;
    }

    public final void EZpvd() {
        C55113xdn c55113xdn = this.OLrzqt;
        if (c55113xdn != null) {
            c55113xdn.cancelAnimation();
        }
    }

    public final void EZpvd(int i) {
        if (i > 0) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("invalid View/layout id:" + i).toString());
    }

    public final void AhwBna(int i) {
        C55113xdn c55113xdn;
        C55113xdn c55113xdn2;
        for (android.view.View view : this.valueOf.values()) {
            if (view.getVisibility() != 8) {
                view.setVisibility(8);
            }
        }
        if (i == this.gEmmrt && (c55113xdn2 = this.OLrzqt) != null && c55113xdn2.isAnimating()) {
            EZpvd();
        }
        android.view.View viewAEQbTJ = AEQbTJ(i);
        Intrinsics.copydefault(viewAEQbTJ);
        if (viewAEQbTJ.getVisibility() != 0) {
            viewAEQbTJ.setVisibility(0);
            if (i != this.gEmmrt || (c55113xdn = this.OLrzqt) == null) {
                return;
            }
            c55113xdn.KWHzl(this.KWHzl);
        }
    }

    public final boolean KWHzl(int i) {
        if (!this.valueOf.containsKey(java.lang.Integer.valueOf(i))) {
            return false;
        }
        removeView(this.valueOf.remove(java.lang.Integer.valueOf(i)));
        return true;
    }

    public final android.view.View AEQbTJ(int i) {
        if (this.valueOf.containsKey(java.lang.Integer.valueOf(i))) {
            return this.valueOf.get(java.lang.Integer.valueOf(i));
        }
        if (this.AYXKKw == null) {
            this.AYXKKw = android.view.LayoutInflater.from(getContext());
        }
        android.view.LayoutInflater layoutInflater = this.AYXKKw;
        Intrinsics.copydefault(layoutInflater);
        android.view.View viewInflate = layoutInflater.inflate(i, (android.view.ViewGroup) this, false);
        if (i == this.gEmmrt) {
            this.OLrzqt = (C55113xdn) viewInflate.findViewById(C52761wXj.FragmentManager.zblBkD);
        }
        viewInflate.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        if (layoutParams == null) {
            viewInflate.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        addView(viewInflate, layoutParams);
        this.valueOf.put(java.lang.Integer.valueOf(i), viewInflate);
        return viewInflate;
    }

    @Override // com.okinc.uilab.stateful.StatefulView
    public android.view.View AEQbTJ(@NotNull StatefulView.Status status) {
        Intrinsics.checkNotNullParameter(status, "");
        int i = Activity.AEQbTJ[status.ordinal()];
        if (i == 1) {
            return AEQbTJ(this.AEQbTJ);
        }
        if (i == 2) {
            return AEQbTJ(this.gEmmrt);
        }
        if (i == 3) {
            return AEQbTJ(this.EZpvd);
        }
        if (i == 4) {
            return AEQbTJ(this.djBIcL);
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return AEQbTJ(this.AhwBna);
    }

    public void setStatus(@NotNull StatefulView.Status status, boolean z) {
        Intrinsics.checkNotNullParameter(status, "");
        int i = Activity.AEQbTJ[status.ordinal()];
        if (i == 1) {
            AhwBna(this.AEQbTJ);
        } else if (i == 2) {
            AhwBna(this.gEmmrt);
        } else if (i == 3) {
            AhwBna(this.EZpvd);
        } else if (i == 4) {
            AhwBna(this.djBIcL);
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            AhwBna(this.AhwBna);
        }
        this.fetchVPNInfo = status;
    }

    @Override // com.okinc.uilab.stateful.StatefulView
    public void setStatus(@NotNull StatefulView.Status status) {
        Intrinsics.checkNotNullParameter(status, "");
        setStatus(status, false);
    }

    /* JADX INFO: renamed from: o.xgE$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xgE.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
