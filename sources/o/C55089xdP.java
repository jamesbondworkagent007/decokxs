package o;

import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xdP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55089xdP extends BottomNavigationView {
    public final InterfaceC56387yDm AEQbTJ;
    public boolean AYXKKw;
    public final InterfaceC56387yDm EZpvd;
    public final java.util.Map<java.lang.Integer, android.graphics.drawable.Drawable> KWHzl;
    public InterfaceC55084xdK OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55089xdP(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55089xdP(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDrawableFactory(@NotNull InterfaceC55084xdK interfaceC55084xdK) {
        Intrinsics.checkNotNullParameter(interfaceC55084xdK, "");
        this.OLrzqt = interfaceC55084xdK;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:30) call: o.xdP.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55089xdP(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55089xdP(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(new androidx.appcompat.view.ContextThemeWrapper(context, C52761wXj.LoaderManager.QfsBiF), attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = new LinkedHashMap();
        this.OLrzqt = new C55087xdN();
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.xdR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C55089xdP.KWHzl();
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.xdS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C55089xdP.KWHzl(context);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.xdQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C55089xdP.OLrzqt();
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.xdV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C55089xdP.gEmmrt();
            }
        });
        setLabelVisibilityMode(1);
        if (this.AYXKKw) {
            djBIcL();
        }
    }

    public final void setUseArcTopTabBarStyle(boolean z) {
        this.AYXKKw = z;
        if (z) {
            djBIcL();
        }
    }

    private final ShapeDrawable valueOf() {
        return (ShapeDrawable) this.EZpvd.getValue();
    }

    public static final ShapeDrawable KWHzl() {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
        return shapeDrawable;
    }

    private final android.graphics.drawable.Drawable isConnected() {
        return (android.graphics.drawable.Drawable) this.valueOf.getValue();
    }

    public static final android.graphics.drawable.Drawable KWHzl(android.content.Context context) {
        return ContextCompat.getDrawable(context, C52761wXj.TaskDescription.finit);
    }

    private final android.util.SparseArray<kotlin.Pair<InterfaceC55083xdJ, android.view.View>> DbNXlk() {
        return (android.util.SparseArray) this.AEQbTJ.getValue();
    }

    public static final android.util.SparseArray OLrzqt() {
        return new android.util.SparseArray();
    }

    private final android.util.SparseArray<View.OnLayoutChangeListener> AkhnZx() {
        return (android.util.SparseArray) this.copydefault.getValue();
    }

    public static final android.util.SparseArray gEmmrt() {
        return new android.util.SparseArray();
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, 0);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, 0);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public BadgeDrawable getOrCreateBadge(int i) {
        android.widget.FrameLayout frameLayoutKWHzl = KWHzl(i);
        final android.graphics.drawable.Drawable drawableOLrzqt = this.KWHzl.get(java.lang.Integer.valueOf(i));
        if (drawableOLrzqt == null) {
            InterfaceC55084xdK interfaceC55084xdK = this.OLrzqt;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            drawableOLrzqt = interfaceC55084xdK.OLrzqt(context);
            this.KWHzl.put(java.lang.Integer.valueOf(i), drawableOLrzqt);
        }
        if (frameLayoutKWHzl != null) {
            frameLayoutKWHzl.setClipChildren(false);
        }
        if (frameLayoutKWHzl != null) {
            frameLayoutKWHzl.setClipToPadding(false);
        }
        final android.widget.ImageView imageViewCopydefault = copydefault(i);
        if (imageViewCopydefault != null) {
            imageViewCopydefault.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o.xdW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(android.view.View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    C55089xdP.AEQbTJ(this.KWHzl, imageViewCopydefault, drawableOLrzqt, view, i2, i3, i4, i5, i6, i7, i8, i9);
                }
            });
            C55086xdM c55086xdM = C55086xdM.OLrzqt;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            c55086xdM.copydefault(context2, imageViewCopydefault, drawableOLrzqt);
            imageViewCopydefault.getOverlay().add(drawableOLrzqt);
        }
        BadgeDrawable orCreateBadge = super.getOrCreateBadge(i);
        Intrinsics.checkNotNullExpressionValue(orCreateBadge, "");
        orCreateBadge.setVisible(false);
        return orCreateBadge;
    }

    public static final void AEQbTJ(C55089xdP c55089xdP, android.widget.ImageView imageView, android.graphics.drawable.Drawable drawable, android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C55086xdM c55086xdM = C55086xdM.OLrzqt;
        android.content.Context context = c55089xdP.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c55086xdM.copydefault(context, imageView, drawable);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public void removeBadge(int i) {
        android.graphics.drawable.Drawable drawable;
        super.removeBadge(i);
        android.widget.ImageView imageViewCopydefault = copydefault(i);
        if (imageViewCopydefault == null || (drawable = this.KWHzl.get(java.lang.Integer.valueOf(i))) == null) {
            return;
        }
        imageViewCopydefault.getOverlay().remove(drawable);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            layoutParams = null;
        } else if (this.AYXKKw) {
            layoutParams.height = getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.dNCPSb);
        }
        super.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        android.util.SparseArray<kotlin.Pair<InterfaceC55083xdJ, android.view.View>> sparseArrayDbNXlk = DbNXlk();
        int size = sparseArrayDbNXlk.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseArrayDbNXlk.keyAt(i2);
            sparseArrayDbNXlk.valueAt(i2).getSecond().setVisibility(i);
        }
    }

    public final android.widget.FrameLayout KWHzl(int i) {
        android.view.View viewFindViewById = findViewById(i);
        if (viewFindViewById != null) {
            return (android.widget.FrameLayout) viewFindViewById.findViewById(com.google.android.material.R.id.navigation_bar_item_icon_container);
        }
        return null;
    }

    public final android.widget.ImageView copydefault(int i) {
        android.view.View viewFindViewById = findViewById(i);
        if (viewFindViewById != null) {
            return (android.widget.ImageView) viewFindViewById.findViewById(com.google.android.material.R.id.navigation_bar_item_icon_view);
        }
        return null;
    }

    public final android.view.ViewGroup EZpvd(int i) {
        android.view.View viewFindViewById = findViewById(i);
        if (viewFindViewById != null) {
            return (android.view.ViewGroup) viewFindViewById.findViewById(com.google.android.material.R.id.navigation_bar_item_labels_group);
        }
        return null;
    }

    public final void setFloatingActionView(@NotNull InterfaceC55083xdJ interfaceC55083xdJ, final int i) {
        ViewGroup.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(interfaceC55083xdJ, "");
        android.view.ViewParent parent = getParent();
        if (interfaceC55083xdJ instanceof InterfaceC55085xdL) {
            if (this.AYXKKw) {
                if (parent instanceof android.view.ViewGroup) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                    viewGroup.setClipToPadding(false);
                    viewGroup.setClipChildren(false);
                }
                android.graphics.drawable.Drawable drawableIsConnected = isConnected();
                if (drawableIsConnected != null) {
                    getOverlay().remove(valueOf());
                    getOverlay().add(drawableIsConnected);
                }
            }
            ((InterfaceC55085xdL) interfaceC55083xdJ).OLrzqt(EZpvd(i));
        }
        android.view.View viewOLrzqt = interfaceC55083xdJ.OLrzqt();
        viewOLrzqt.setOutlineProvider(null);
        if (parent instanceof android.widget.FrameLayout) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) parent;
            frameLayout.removeView(viewOLrzqt);
            viewOLrzqt.setElevation(getElevation() + 1.0f);
            if (viewOLrzqt.getLayoutParams() != null) {
                layoutParams = viewOLrzqt.getLayoutParams();
            } else {
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                int iOLrzqt = C55298xhM.OLrzqt(40, context);
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iOLrzqt, C55298xhM.OLrzqt(40, context2));
                layoutParams2.gravity = 81;
                int i2 = this.AYXKKw ? 26 : 16;
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                layoutParams2.bottomMargin = C55298xhM.OLrzqt(i2, context3);
                layoutParams = layoutParams2;
            }
            frameLayout.addView(viewOLrzqt, layoutParams);
            viewOLrzqt.bringToFront();
            DbNXlk().put(i, C56390yDp.OLrzqt(interfaceC55083xdJ, viewOLrzqt));
        }
        if (viewOLrzqt.hasOnClickListeners()) {
            return;
        }
        viewOLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.xdO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.OLrzqt.setSelectedItemId(i);
            }
        });
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public void setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener != null ? new Activity(new WeakReference(this), onItemSelectedListener) : null);
    }

    public final android.util.SparseArray<kotlin.Pair<InterfaceC55083xdJ, android.view.View>> AhwBna() {
        return DbNXlk();
    }

    public final void AYXKKw() {
        getMenu().clear();
        android.util.SparseArray<kotlin.Pair<InterfaceC55083xdJ, android.view.View>> sparseArrayDbNXlk = DbNXlk();
        int size = sparseArrayDbNXlk.size();
        for (int i = 0; i < size; i++) {
            sparseArrayDbNXlk.keyAt(i);
            kotlin.Pair<InterfaceC55083xdJ, android.view.View> pairValueAt = sparseArrayDbNXlk.valueAt(i);
            android.view.ViewParent parent = getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(pairValueAt.getSecond());
            }
        }
        if (this.AYXKKw) {
            getOverlay().clear();
            getOverlay().add(valueOf());
        }
        DbNXlk().clear();
        AkhnZx().clear();
    }

    /* JADX INFO: renamed from: o.xdP$Activity */
    public static final class Activity implements NavigationBarView.OnItemSelectedListener {
        public final Reference<C55089xdP> EZpvd;
        public final NavigationBarView.OnItemSelectedListener OLrzqt;

        public Activity(@NotNull Reference<C55089xdP> reference, @NotNull NavigationBarView.OnItemSelectedListener onItemSelectedListener) {
            Intrinsics.checkNotNullParameter(reference, "");
            Intrinsics.checkNotNullParameter(onItemSelectedListener, "");
            this.EZpvd = reference;
            this.OLrzqt = onItemSelectedListener;
        }

        @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
        public boolean onNavigationItemSelected(@NotNull android.view.MenuItem menuItem) {
            kotlin.Pair<InterfaceC55083xdJ, android.view.View> pair;
            InterfaceC55083xdJ first;
            Intrinsics.checkNotNullParameter(menuItem, "");
            try {
                C55089xdP c55089xdP = this.EZpvd.get();
                if (c55089xdP != null && (pair = c55089xdP.AhwBna().get(menuItem.getItemId())) != null && (first = pair.getFirst()) != null) {
                    first.OLrzqt(c55089xdP, menuItem);
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            return this.OLrzqt.onNavigationItemSelected(menuItem);
        }
    }

    public final void djBIcL() {
        setBackgroundColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.GhqvEQ));
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        setElevation(C55298xhM.AEQbTJ(16, context));
        setItemPaddingTop(getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.djSkpj));
        getOverlay().add(valueOf());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            layoutParams.height = C55298xhM.OLrzqt(60, context2);
            setLayoutParams(layoutParams);
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o.xdT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    C55089xdP.OLrzqt(this.EZpvd, view, i, i2, i3, i4, i5, i6, i7, i8);
                }
            });
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final void OLrzqt(C55089xdP c55089xdP, android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i3 == i7) {
            return;
        }
        ShapeDrawable shapeDrawableValueOf = c55089xdP.valueOf();
        shapeDrawableValueOf.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
        shapeDrawableValueOf.getPaint().setShader(new LinearGradient(i, 0.0f, i3, 0.0f, new int[]{ContextCompat.getColor(c55089xdP.getContext(), C52761wXj.Activity.wlaJM), ContextCompat.getColor(c55089xdP.getContext(), C52761wXj.Activity.AwvSrB), ContextCompat.getColor(c55089xdP.getContext(), C52761wXj.Activity.AwvSrB), ContextCompat.getColor(c55089xdP.getContext(), C52761wXj.Activity.wlaJM)}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP));
        android.content.Context context = c55089xdP.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        shapeDrawableValueOf.setBounds(i, 0, i3, C55298xhM.OLrzqt(1, context));
        c55089xdP.valueOf().invalidateSelf();
        android.graphics.drawable.Drawable drawableIsConnected = c55089xdP.isConnected();
        if (drawableIsConnected != null) {
            android.content.Context context2 = c55089xdP.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iOLrzqt = C55298xhM.OLrzqt(-8, context2);
            android.content.Context context3 = c55089xdP.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            drawableIsConnected.setBounds(i, iOLrzqt, i3, C55298xhM.OLrzqt(4, context3));
        }
    }
}
