package o;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import com.okinc.im.menu.MenuActionBase;
import com.okinc.im.view.MessageReaction;
import com.okinc.okimcore.model.im.inhouseim.ws.ReactionDisplay;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import o.oIG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class oIG implements InterfaceC35924oIt {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public android.widget.ImageView AEQbTJ;
    public Function0<Unit> AYXKKw;
    public android.widget.HorizontalScrollView AhwBna;
    public final java.util.List<MenuActionBase> KWHzl;
    public final java.util.List<java.lang.String> OLrzqt;
    public final android.content.Context copydefault;
    public final Function1<java.lang.String, Unit> djBIcL;
    public final android.view.View gEmmrt;
    public final java.util.List<ReactionDisplay> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35924oIt
    public java.util.List<MenuActionBase> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35924oIt
    public void copydefault(Function0<Unit> function0) {
        this.AYXKKw = function0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.okinc.im.menu.MenuActionBase> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public oIG(@NotNull android.content.Context context, @NotNull android.view.View view, @NotNull java.util.List<java.lang.String> list, @NotNull java.util.List<? extends MenuActionBase> list2, java.util.List<ReactionDisplay> list3, Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.copydefault = context;
        this.gEmmrt = view;
        this.OLrzqt = list;
        this.KWHzl = list2;
        this.valueOf = list3;
        this.djBIcL = function1;
    }

    @Override // o.InterfaceC35924oIt
    public android.view.View AEQbTJ() {
        return copydefault(EZpvd());
    }

    public static final class ActionBar extends android.widget.LinearLayout {
        public final /* synthetic */ int OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(int i, android.content.Context context) {
            super(context);
            this.OLrzqt = i;
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(View.MeasureSpec.getSize(i), this.OLrzqt), View.MeasureSpec.getMode(i)), i2);
        }
    }

    public final android.widget.LinearLayout copydefault(int i) {
        ActionBar actionBar = new ActionBar(i, this.copydefault);
        OLrzqt(actionBar);
        KWHzl(actionBar);
        EZpvd(actionBar);
        return actionBar;
    }

    public final void OLrzqt(android.widget.LinearLayout linearLayout) {
        linearLayout.setOrientation(0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(linearLayout.getContext(), C52761wXj.Activity.dHguZz)));
        android.content.Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        gradientDrawable.setCornerRadius(C55298xhM.AEQbTJ(999, context));
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        android.content.Context context2 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iOLrzqt = C55298xhM.OLrzqt(4, context2);
        android.content.Context context3 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        int iOLrzqt2 = C55298xhM.OLrzqt(4, context3);
        android.content.Context context4 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        int iOLrzqt3 = C55298xhM.OLrzqt(4, context4);
        android.content.Context context5 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        linearLayout.setPadding(iOLrzqt, iOLrzqt2, iOLrzqt3, C55298xhM.OLrzqt(4, context5));
    }

    public final GradientDrawable OLrzqt() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(this.copydefault, C52761wXj.Activity.invokespecialODCBUN)));
        gradientDrawable.setCornerRadius(C55298xhM.AEQbTJ(999, this.copydefault));
        return gradientDrawable;
    }

    public final GradientDrawable EZpvd(boolean z) {
        if (z) {
            return OLrzqt();
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(android.content.res.ColorStateList.valueOf(0));
        gradientDrawable.setCornerRadius(C55298xhM.AEQbTJ(999, this.copydefault));
        return gradientDrawable;
    }

    public final StateListDrawable KWHzl() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(this.copydefault, C52761wXj.Activity.invokespecialODCBUN)));
        gradientDrawable.setCornerRadius(C55298xhM.AEQbTJ(999, this.copydefault));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(android.content.res.ColorStateList.valueOf(0));
        gradientDrawable2.setCornerRadius(C55298xhM.AEQbTJ(999, this.copydefault));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable);
        stateListDrawable.addState(new int[0], gradientDrawable2);
        return stateListDrawable;
    }

    public final void KWHzl(android.widget.LinearLayout linearLayout) {
        android.content.Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        boolean zOLrzqt = C55296xhK.OLrzqt(context);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(linearLayout.getContext());
        int i = 0;
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        frameLayout.setClipChildren(true);
        android.widget.HorizontalScrollView horizontalScrollView = new android.widget.HorizontalScrollView(linearLayout.getContext());
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setOverScrollMode(2);
        horizontalScrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(horizontalScrollView.getContext());
        linearLayout2.setOrientation(0);
        for (java.lang.Object obj : this.OLrzqt) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            linearLayout2.addView(EZpvd((java.lang.String) obj));
            i++;
        }
        horizontalScrollView.addView(linearLayout2);
        android.widget.ImageView imageView = new android.widget.ImageView(linearLayout.getContext());
        android.content.Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        imageView.setLayoutParams(new FrameLayout.LayoutParams(C55298xhM.OLrzqt(16, context2), -1, 8388613));
        imageView.setImageResource(C35399nuc.ActionBar.fJNWhG);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        if (zOLrzqt) {
            imageView.setScaleX(-1.0f);
        }
        imageView.setVisibility(8);
        this.AhwBna = horizontalScrollView;
        this.AEQbTJ = imageView;
        frameLayout.addView(horizontalScrollView);
        frameLayout.addView(imageView);
        linearLayout.addView(frameLayout);
        horizontalScrollView.getViewTreeObserver().addOnGlobalLayoutListener(new Activity(horizontalScrollView, this, zOLrzqt));
    }

    public static final class Activity implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ boolean AEQbTJ;
        public final /* synthetic */ android.widget.HorizontalScrollView EZpvd;
        public final /* synthetic */ oIG copydefault;

        public Activity(android.widget.HorizontalScrollView horizontalScrollView, oIG oig, boolean z) {
            this.EZpvd = horizontalScrollView;
            this.copydefault = oig;
            this.AEQbTJ = z;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            android.widget.ImageView imageView;
            int childCount;
            this.EZpvd.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            final android.widget.HorizontalScrollView horizontalScrollView = this.copydefault.AhwBna;
            if (horizontalScrollView == null || (imageView = this.copydefault.AEQbTJ) == null) {
                return;
            }
            boolean z = horizontalScrollView.canScrollHorizontally(1) || horizontalScrollView.canScrollHorizontally(-1);
            android.view.View childAt = horizontalScrollView.getChildAt(0);
            final int width = childAt != null ? childAt.getWidth() : 0;
            final int width2 = horizontalScrollView.getWidth();
            boolean z2 = width > width2;
            imageView.setVisibility((z || z2) ? 0 : 8);
            android.view.View childAt2 = horizontalScrollView.getChildAt(0);
            android.widget.LinearLayout linearLayout = childAt2 instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) childAt2 : null;
            if (linearLayout != null && (childCount = linearLayout.getChildCount() - 1) >= 0) {
                android.view.View childAt3 = linearLayout.getChildAt(childCount);
                if (z || z2) {
                    ViewGroup.LayoutParams layoutParams = childAt3.getLayoutParams();
                    LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
                    if (layoutParams2 != null) {
                        layoutParams2.setMarginEnd(C55298xhM.dp2px$default(7.0f, null, 1, null) + 16);
                    }
                    childAt3.setLayoutParams(layoutParams);
                } else {
                    ViewGroup.LayoutParams layoutParams3 = childAt3.getLayoutParams();
                    LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams3 : null;
                    if (layoutParams4 != null) {
                        layoutParams4.setMarginEnd(0);
                    }
                    childAt3.setLayoutParams(layoutParams3);
                }
            }
            if (this.AEQbTJ) {
                horizontalScrollView.post(new java.lang.Runnable() { // from class: o.oIE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        oIG.Activity.EZpvd(horizontalScrollView, width, width2);
                    }
                });
            }
        }

        public static final void EZpvd(android.widget.HorizontalScrollView horizontalScrollView, int i, int i2) {
            horizontalScrollView.scrollTo((i - i2) + 16 + C55298xhM.dp2px$default(7.0f, null, 1, null), 0);
        }
    }

    public static final void KWHzl(oIG oig, java.lang.String str, android.view.View view) {
        Function1<java.lang.String, Unit> function1 = oig.djBIcL;
        if (function1 != null) {
            function1.invoke(str);
        }
        Function0<Unit> function0 = oig.AYXKKw;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final android.graphics.drawable.Drawable AEQbTJ(java.lang.String str) {
        android.widget.TextView textView = new android.widget.TextView(this.copydefault);
        textView.setText(str);
        textView.setTextSize(22.0f);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(textView.getMeasuredWidth(), textView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        textView.draw(new android.graphics.Canvas(bitmapCreateBitmap));
        return new BitmapDrawable(this.copydefault.getResources(), bitmapCreateBitmap);
    }

    public final void EZpvd(android.widget.LinearLayout linearLayout) {
        final android.widget.ImageView imageView = new android.widget.ImageView(linearLayout.getContext());
        android.content.Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iOLrzqt = C55298xhM.OLrzqt(42, context);
        android.content.Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iOLrzqt, C55298xhM.OLrzqt(42, context2));
        android.content.Context context3 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        int iOLrzqt2 = C55298xhM.OLrzqt(6, context3);
        android.content.Context context4 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        int iOLrzqt3 = C55298xhM.OLrzqt(6, context4);
        android.content.Context context5 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        int iOLrzqt4 = C55298xhM.OLrzqt(6, context5);
        android.content.Context context6 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        imageView.setPadding(iOLrzqt2, iOLrzqt3, iOLrzqt4, C55298xhM.OLrzqt(6, context6));
        imageView.setLayoutParams(layoutParams);
        imageView.setBackground(KWHzl());
        imageView.setImageResource(C52761wXj.TaskDescription.onLocationChanged);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: o.oIH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                oIG.OLrzqt(imageView, this, view);
            }
        });
        linearLayout.addView(imageView);
    }

    public static final void OLrzqt(android.widget.ImageView imageView, oIG oig, android.view.View view) {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        android.content.Context context = imageView.getContext();
        androidx.fragment.app.FragmentManager supportFragmentManager2 = null;
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
            android.content.Context context2 = oig.gEmmrt.getContext();
            FragmentActivity fragmentActivity2 = context2 instanceof FragmentActivity ? (FragmentActivity) context2 : null;
            if (fragmentActivity2 != null) {
                supportFragmentManager2 = fragmentActivity2.getSupportFragmentManager();
            }
        } else {
            supportFragmentManager2 = supportFragmentManager;
        }
        if (supportFragmentManager2 != null) {
            oIL.Companion.AEQbTJ(oig.djBIcL, oig.AYXKKw).show(supportFragmentManager2, "EmojiPickerBottomSheet");
        }
    }

    @Override // o.InterfaceC35924oIt
    public android.view.View copydefault(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(this.gEmmrt.getWidth(), this.gEmmrt.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        this.gEmmrt.draw(new android.graphics.Canvas(bitmapCreateBitmap));
        android.widget.ImageView imageView = new android.widget.ImageView(this.copydefault);
        imageView.setImageBitmap(bitmapCreateBitmap);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(this.gEmmrt.getWidth(), this.gEmmrt.getHeight()));
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.copydefault);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(this.gEmmrt.getWidth(), this.gEmmrt.getHeight()));
        frameLayout.addView(imageView, frameLayout.getLayoutParams());
        return frameLayout;
    }

    public final int EZpvd() {
        float f = android.content.res.Resources.getSystem().getDisplayMetrics().widthPixels;
        return f / android.content.res.Resources.getSystem().getDisplayMetrics().density <= 320.0f ? (int) (f * 0.75f) : C55298xhM.OLrzqt(302, this.copydefault);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oIG.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final java.lang.String EZpvd(java.util.List<ReactionDisplay> list) {
            java.util.ArrayList arrayList;
            java.lang.Object next;
            if (list != null) {
                arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                for (ReactionDisplay reactionDisplay : list) {
                    arrayList.add(new MessageReaction(reactionDisplay.getEmoji(), reactionDisplay.getCount(), reactionDisplay.isCurrentUserReaction()));
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                return null;
            }
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((MessageReaction) next).isUserReacted()) {
                    break;
                }
            }
            MessageReaction messageReaction = (MessageReaction) next;
            if (messageReaction != null) {
                return messageReaction.getEmoji();
            }
            return null;
        }
    }

    public final android.widget.ImageView EZpvd(final java.lang.String str) {
        java.util.List<ReactionDisplay> list = this.valueOf;
        java.lang.Object obj = null;
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                ReactionDisplay reactionDisplay = (ReactionDisplay) next;
                if (Intrinsics.EZpvd((java.lang.Object) reactionDisplay.getEmoji(), (java.lang.Object) str) && reactionDisplay.isCurrentUserReaction()) {
                    obj = next;
                    break;
                }
            }
            obj = (ReactionDisplay) obj;
        }
        boolean z = obj != null;
        GradientDrawable gradientDrawableOLrzqt = OLrzqt();
        GradientDrawable gradientDrawableEZpvd = EZpvd(z);
        android.widget.ImageView imageView = new android.widget.ImageView(this.copydefault);
        android.content.Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iOLrzqt = C55298xhM.OLrzqt(42, context);
        android.content.Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iOLrzqt, C55298xhM.OLrzqt(42, context2));
        android.content.Context context3 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        int iOLrzqt2 = C55298xhM.OLrzqt(6, context3);
        android.content.Context context4 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        int iOLrzqt3 = C55298xhM.OLrzqt(6, context4);
        android.content.Context context5 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        int iOLrzqt4 = C55298xhM.OLrzqt(6, context5);
        android.content.Context context6 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        imageView.setPadding(iOLrzqt2, iOLrzqt3, iOLrzqt4, C55298xhM.OLrzqt(6, context6));
        imageView.setLayoutParams(layoutParams);
        imageView.setImageDrawable(AEQbTJ(str));
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawableOLrzqt);
        stateListDrawable.addState(new int[0], gradientDrawableEZpvd);
        imageView.setBackground(stateListDrawable);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: o.oIF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                oIG.KWHzl(this.copydefault, str, view);
            }
        });
        return imageView;
    }
}
