package o;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import com.okinc.okimcore.model.room.inhouseim.ConversationIcon;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import o.C44105sDn;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oIV extends android.widget.LinearLayout {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oIV(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oIV(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setItemMargin(int i) {
        this.OLrzqt = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:27) call: o.oIV.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ oIV(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oIV(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.OuxcSI);
        setOrientation(0);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oIV.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void setIconOrientation(int i) {
        setOrientation(i);
    }

    public final void setItemMarginRes(int i) {
        this.OLrzqt = getContext().getResources().getDimensionPixelSize(i);
    }

    public final void copydefault() {
        removeAllViews();
        setVisibility(8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.oIV */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setIcons$default(oIV oiv, java.util.List list, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        oiv.setIcons(list, z, z2, z3);
    }

    public final void setIcons(java.util.List<ConversationIcon> list, boolean z, boolean z2, boolean z3) {
        int i = 0;
        pUU.EZpvd("IMIconListView", "setIcons called with " + (list != null ? list.size() : 0) + " icons, premium: " + z);
        removeAllViews();
        java.util.List<android.widget.ImageView> listEZpvd = EZpvd(list, z, z2, z3);
        OLrzqt(listEZpvd);
        if ((listEZpvd instanceof java.util.Collection) && listEZpvd.isEmpty()) {
            i = 8;
        } else {
            java.util.Iterator<T> it = listEZpvd.iterator();
            while (it.hasNext()) {
                if (((android.widget.ImageView) it.next()).getVisibility() == 0) {
                    break;
                }
            }
            i = 8;
        }
        setVisibility(i);
    }

    public final java.util.List<android.widget.ImageView> EZpvd(java.util.List<ConversationIcon> list, boolean z, boolean z2, boolean z3) {
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        if (z) {
            listOLrzqt.add(AEQbTJ());
        }
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                listOLrzqt.add(KWHzl((ConversationIcon) it.next(), z2, z3));
            }
        }
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public final void OLrzqt(android.widget.ImageView imageView, int i) {
        if (i == 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        int orientation = getOrientation();
        if (orientation == 0) {
            layoutParams2.leftMargin = this.OLrzqt;
        } else if (orientation == 1) {
            layoutParams2.topMargin = this.OLrzqt;
        }
        imageView.setLayoutParams(layoutParams2);
    }

    public static /* synthetic */ android.widget.ImageView createIconView$default(oIV oiv, ConversationIcon conversationIcon, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return oiv.KWHzl(conversationIcon, z, z2);
    }

    public final android.widget.ImageView KWHzl(ConversationIcon conversationIcon, boolean z, boolean z2) {
        android.widget.ImageView imageViewKWHzl = KWHzl();
        AEQbTJ(imageViewKWHzl, conversationIcon, z, z2);
        return imageViewKWHzl;
    }

    public final android.widget.ImageView AEQbTJ() {
        android.widget.ImageView imageViewKWHzl = KWHzl();
        imageViewKWHzl.setImageResource(C44105sDn.Application.getNewProxyInstance);
        return imageViewKWHzl;
    }

    public final android.widget.ImageView KWHzl() {
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setAdjustViewBounds(true);
        return imageView;
    }

    public static /* synthetic */ void loadIconWithGlide$default(oIV oiv, android.widget.ImageView imageView, ConversationIcon conversationIcon, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        oiv.AEQbTJ(imageView, conversationIcon, z, z2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v14, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [T, java.lang.String] */
    public final void AEQbTJ(final android.widget.ImageView imageView, ConversationIcon conversationIcon, boolean z, boolean z2) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        T dark = (C33492mxV.OLrzqt() || z2) ? conversationIcon.getDark() : conversationIcon.getLight();
        objectRef.element = dark;
        java.lang.CharSequence charSequence = (java.lang.CharSequence) dark;
        if (charSequence == null || StringsKt__StringsKt.fARcdN(charSequence)) {
            imageView.setVisibility(8);
            return;
        }
        if (z) {
            objectRef.element = C43386roM.EZpvd.EZpvd() + "/" + objectRef.element;
            post(new java.lang.Runnable() { // from class: o.oIX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    oIV.OLrzqt(this.OLrzqt, imageView, objectRef);
                }
            });
            return;
        }
        post(new java.lang.Runnable() { // from class: o.oIT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                oIV.copydefault(this.EZpvd, imageView, objectRef);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(oIV oiv, android.widget.ImageView imageView, Ref.ObjectRef objectRef) {
        RY<android.graphics.drawable.Drawable> ryOLrzqt = oiv.OLrzqt(imageView, (java.lang.String) objectRef.element);
        android.content.Context context = oiv.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (nPI.copydefault(context)) {
            ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(context);
            Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
            componentCallbacks2C5333NrAEQbTJ.EZpvd((java.lang.String) objectRef.element).OLrzqt(ryOLrzqt).EZpvd(imageView);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(oIV oiv, android.widget.ImageView imageView, Ref.ObjectRef objectRef) {
        kotlin.Pair pairOLrzqt;
        int orientation = oiv.getOrientation();
        if (orientation == 0) {
            pairOLrzqt = C56390yDp.OLrzqt(Integer.MIN_VALUE, java.lang.Integer.valueOf(oiv.getHeight() > 0 ? oiv.getHeight() : -2));
        } else if (orientation == 1) {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(oiv.getWidth() > 0 ? oiv.getWidth() : -2), Integer.MIN_VALUE);
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
        int iIntValue = ((java.lang.Number) pairOLrzqt.component1()).intValue();
        int iIntValue2 = ((java.lang.Number) pairOLrzqt.component2()).intValue();
        RY<android.graphics.drawable.Drawable> ryOLrzqt = oiv.OLrzqt(imageView, (java.lang.String) objectRef.element);
        android.content.Context context = oiv.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (nPI.copydefault(context)) {
            ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(context);
            Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
            componentCallbacks2C5333NrAEQbTJ.EZpvd((java.lang.String) objectRef.element).copydefault(AbstractC5360Os.copydefault).copydefault(iIntValue, iIntValue2).OLrzqt((RY) ryOLrzqt).EZpvd(imageView);
        }
    }

    public static final class Activity implements RY<android.graphics.drawable.Drawable> {
        public final /* synthetic */ android.widget.ImageView AEQbTJ;
        public final /* synthetic */ java.lang.String copydefault;

        public Activity(android.widget.ImageView imageView, java.lang.String str) {
            this.AEQbTJ = imageView;
            this.copydefault = str;
        }

        @Override // o.RY
        public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, boolean z) {
            this.AEQbTJ.setVisibility(8);
            pUU.AEQbTJ("IMIconListView", "Image load failed for URL: " + this.copydefault + ", error: " + (glideException != null ? glideException.getMessage() : null), glideException);
            return true;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
        @Override // o.RY
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public boolean copydefault(android.graphics.drawable.Drawable drawable, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
            this.AEQbTJ.setVisibility(0);
            return false;
        }
    }

    public final RY<android.graphics.drawable.Drawable> OLrzqt(android.widget.ImageView imageView, java.lang.String str) {
        return new Activity(imageView, str);
    }

    public final void OLrzqt(java.util.List<? extends android.widget.ImageView> list) {
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            android.widget.ImageView imageView = (android.widget.ImageView) obj;
            OLrzqt(imageView, i);
            addView(imageView);
            i++;
        }
    }
}
