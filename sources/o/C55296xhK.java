package o;

import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xhK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55296xhK {
    public static int OLrzqt;

    public static /* synthetic */ void setHitRect$default(android.view.View view, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        EZpvd(view, i);
    }

    public static final void EZpvd(@NotNull final android.view.View view, final int i) {
        Intrinsics.checkNotNullParameter(view, "");
        if (i == 0) {
            if (OLrzqt == 0) {
                android.content.Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                OLrzqt = C55298xhM.OLrzqt(48, context);
            }
            i = OLrzqt;
        }
        view.post(new java.lang.Runnable() { // from class: o.xhP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C55296xhK.KWHzl(view, i);
            }
        });
    }

    public static final void KWHzl(android.view.View view, int i) {
        if (view.getParent() instanceof android.view.View) {
            java.lang.Object parent = view.getParent();
            Intrinsics.copydefault(parent, "");
            android.view.View view2 = (android.view.View) parent;
            android.graphics.Rect rect = new android.graphics.Rect();
            view.getHitRect(rect);
            int iWidth = rect.width();
            int iHeight = rect.height();
            if (iWidth < i) {
                int i2 = (i - iWidth) / 2;
                rect.left -= i2;
                rect.right += i2;
            }
            if (iHeight < i) {
                int i3 = (i - iHeight) / 2;
                rect.top -= i3;
                rect.bottom += i3;
            }
            android.view.TouchDelegate touchDelegate = view2.getTouchDelegate();
            if (touchDelegate instanceof C55305xhT) {
                ((C55305xhT) touchDelegate).EZpvd(new android.view.TouchDelegate(rect, view));
                return;
            }
            if (touchDelegate != null) {
                C55305xhT c55305xhT = new C55305xhT(view);
                c55305xhT.EZpvd(touchDelegate);
                c55305xhT.EZpvd(new android.view.TouchDelegate(rect, view));
                view2.setTouchDelegate(c55305xhT);
                return;
            }
            C55305xhT c55305xhT2 = new C55305xhT(view);
            c55305xhT2.EZpvd(new android.view.TouchDelegate(rect, view));
            view2.setTouchDelegate(c55305xhT2);
        }
    }

    public static final void AEQbTJ(@NotNull android.view.ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        for (android.view.View view : ViewGroupKt.getChildren(viewGroup)) {
            if (view instanceof android.view.ViewGroup) {
                AEQbTJ((android.view.ViewGroup) view, z);
            }
            view.setEnabled(z);
        }
    }

    /* JADX INFO: renamed from: o.xhK$Activity */
    public static final class Activity extends android.view.ViewOutlineProvider {
        public final /* synthetic */ float OLrzqt;

        public Activity(float f) {
            this.OLrzqt = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(android.view.View view, Outline outline) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(outline, "");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.OLrzqt);
        }
    }

    public static final void EZpvd(@NotNull android.view.View view, float f) {
        Intrinsics.checkNotNullParameter(view, "");
        if (f < 0.0f) {
            return;
        }
        view.setOutlineProvider(new Activity(f));
        view.setClipToOutline(true);
    }

    public static /* synthetic */ android.graphics.drawable.Drawable viewToDrawable$default(android.view.View view, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return KWHzl(view, i, i2);
    }

    public static final android.graphics.drawable.Drawable KWHzl(@NotNull android.view.View view, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, "");
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (i <= 0) {
            i = view.getMeasuredWidth();
        }
        if (i2 <= 0) {
            i2 = view.getMeasuredHeight();
        }
        if (i == 0 || i2 == 0) {
            return null;
        }
        view.layout(0, 0, i, i2);
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        view.draw(new android.graphics.Canvas(bitmapCreateBitmap));
        return new BitmapDrawable(view.getResources(), bitmapCreateBitmap);
    }

    public static /* synthetic */ android.graphics.Bitmap viewToBitmap$default(android.view.View view, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return EZpvd(view, i, i2);
    }

    public static final android.graphics.Bitmap EZpvd(@NotNull android.view.View view, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, "");
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (i <= 0) {
            i = view.getMeasuredWidth();
        }
        if (i2 <= 0) {
            i2 = view.getMeasuredHeight();
        }
        if (i == 0 || i2 == 0) {
            return null;
        }
        view.layout(0, 0, i, i2);
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        view.draw(new android.graphics.Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ void singleClick$default(android.view.View view, long j, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 1000;
        }
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(function1, "");
        view.setOnClickListener(new ActionBar(view, j, function1));
    }

    /* JADX INFO: renamed from: o.xhK$ActionBar */
    public static final class ActionBar implements View.OnClickListener {

        /* JADX INFO: Incorrect field signature: TT; */
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ Function1<T, Unit> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Incorrect types in method signature: (TT;JLkotlin/jvm/functions/Function1<-TT;Lkotlin/Unit;>;)V */
        public ActionBar(android.view.View view, long j, Function1 function1) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = function1;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.invoke((T) this.AEQbTJ);
            }
        }
    }

    public static /* synthetic */ void singleClick$default(android.view.View view, View.OnClickListener onClickListener, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 1000;
        }
        KWHzl(view, onClickListener, j);
    }

    public static final <T extends android.view.View> void KWHzl(@NotNull final T t, @NotNull final View.OnClickListener onClickListener, final long j) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(onClickListener, "");
        t.setOnClickListener(new View.OnClickListener() { // from class: o.xhJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C55296xhK.copydefault(t, j, onClickListener, view);
            }
        });
    }

    public static final void copydefault(android.view.View view, long j, View.OnClickListener onClickListener, android.view.View view2) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (jCurrentTimeMillis - copydefault(view) > j || (view instanceof android.widget.Checkable)) {
            OLrzqt(view, jCurrentTimeMillis);
            onClickListener.onClick(view);
        }
    }

    public static final <T extends android.view.View> void OLrzqt(@NotNull T t, long j) {
        Intrinsics.checkNotNullParameter(t, "");
        t.setTag(1766613352, java.lang.Long.valueOf(j));
    }

    public static final <T extends android.view.View> long copydefault(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        java.lang.Object tag = t.getTag(1766613352);
        java.lang.Long l = tag instanceof java.lang.Long ? (java.lang.Long) tag : null;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static /* synthetic */ void margin$default(android.view.View view, java.lang.Float f, java.lang.Float f2, java.lang.Float f3, java.lang.Float f4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = null;
        }
        if ((i & 2) != 0) {
            f2 = null;
        }
        if ((i & 4) != 0) {
            f3 = null;
        }
        if ((i & 8) != 0) {
            f4 = null;
        }
        OLrzqt(view, f, f2, f3, f4);
    }

    public static final int AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return context.getResources().getConfiguration().getLayoutDirection();
    }

    public static final boolean OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public static final android.app.Activity KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        if (!(context instanceof android.content.ContextWrapper)) {
            return null;
        }
        android.content.Context baseContext = ((android.content.ContextWrapper) context).getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "");
        return KWHzl(baseContext);
    }

    public static final boolean AEQbTJ(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return view.getLayoutDirection() == 1;
    }

    public static final void AEQbTJ(@NotNull ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(marginLayoutParams, "");
        marginLayoutParams.setMargins(i, i2, i3, i4);
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.setMarginEnd(i3);
    }

    public static final void EZpvd(@NotNull android.graphics.Rect rect, boolean z) {
        Intrinsics.checkNotNullParameter(rect, "");
        if (z) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
    }

    public static final void OLrzqt(@NotNull android.view.View view, java.lang.Float f, java.lang.Float f2, java.lang.Float f3, java.lang.Float f4) {
        Intrinsics.checkNotNullParameter(view, "");
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (f != null) {
                float fFloatValue = f.floatValue();
                android.content.Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                marginLayoutParams.leftMargin = C55298xhM.copydefault(fFloatValue, context);
            }
            if (f2 != null) {
                float fFloatValue2 = f2.floatValue();
                android.content.Context context2 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                marginLayoutParams.topMargin = C55298xhM.copydefault(fFloatValue2, context2);
            }
            if (f3 != null) {
                float fFloatValue3 = f3.floatValue();
                android.content.Context context3 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                marginLayoutParams.rightMargin = C55298xhM.copydefault(fFloatValue3, context3);
            }
            if (f4 != null) {
                float fFloatValue4 = f4.floatValue();
                android.content.Context context4 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                marginLayoutParams.bottomMargin = C55298xhM.copydefault(fFloatValue4, context4);
            }
        }
    }
}
