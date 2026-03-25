package com.okinc.auth.impl.widget;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewGroupKt;
import androidx.core.widget.TextViewCompat;
import com.okinc.business.invest_biz.data.bean.InvestButtonAction;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o.C52761wXj;
import o.C55296xhK;
import o.C55302xhQ;
import o.C56444yFp;
import o.C56524yIo;
import o.C59467zhb;
import o.C6692aUD;
import o.C8206ayP;
import o.InterfaceC56445yFq;
import o.wYC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SimpleToolBar extends LinearLayout {
    public boolean AYXKKw;
    public boolean KWHzl;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public static final String OLrzqt = C56524yIo.AEQbTJ(SimpleToolBar.class).valueOf() + ".navIcon";
    public static final String copydefault = C56524yIo.AEQbTJ(SimpleToolBar.class).valueOf() + ".title";
    public static final String AEQbTJ = C56524yIo.AEQbTJ(SimpleToolBar.class).valueOf() + ".rightIcon";

    /* JADX INFO: loaded from: classes14.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[NavigationType.values().length];
            try {
                iArr[NavigationType.BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NavigationType.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleToolBar(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleToolBar(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:51) call: com.okinc.auth.impl.widget.SimpleToolBar.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ SimpleToolBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleToolBar(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = true;
        KWHzl();
        setDataFromAttributes(context, attributeSet);
        setDefaultNavigationClickHandling();
    }

    public final void setNavigationIconVisible(boolean z) {
        this.KWHzl = z;
        copydefault().setVisibility(z ^ true ? 4 : 0);
        copydefault().setEnabled(z);
    }

    public final void setRightIconVisible(boolean z) {
        this.AYXKKw = z;
        AEQbTJ().setVisibility(z ^ true ? 4 : 0);
        AEQbTJ().setEnabled(z);
    }

    public final void KWHzl() {
        setOrientation(0);
        setGravity(16);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setMinimumHeight(getResources().getDimensionPixelSize(C8206ayP.ActionBar.EZpvd));
        copydefault(OLrzqt);
        OLrzqt();
        copydefault(AEQbTJ);
    }

    public final void setDataFromAttributes(Context context, AttributeSet attributeSet) {
        NavigationType navigationType;
        Resources resources;
        int i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8206ayP.LoaderManager.djBIcL);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        int i2 = typedArrayObtainStyledAttributes.getInt(C8206ayP.LoaderManager.values, NavigationType.BACK.getValue());
        NavigationType[] navigationTypeArrValues = NavigationType.values();
        int length = navigationTypeArrValues.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                navigationType = null;
                break;
            }
            navigationType = navigationTypeArrValues[i3];
            if (navigationType.getValue() == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (navigationType == null) {
            navigationType = NavigationType.BACK;
        }
        setNavigationType(navigationType);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C8206ayP.LoaderManager.DbNXlk, 0);
        if (resourceId != 0) {
            setRightIcon(resourceId);
        }
        String strAEQbTJ = C6692aUD.AEQbTJ(typedArrayObtainStyledAttributes, C8206ayP.LoaderManager.isConnected);
        if (strAEQbTJ.length() > 0) {
            setTitle(strAEQbTJ);
        }
        int color = typedArrayObtainStyledAttributes.getColor(C8206ayP.LoaderManager.gEmmrt, 0);
        if (color != 0) {
            setNavigationIconTint(color);
        }
        int color2 = typedArrayObtainStyledAttributes.getColor(C8206ayP.LoaderManager.AkhnZx, 0);
        if (color2 != 0) {
            setTitleColor(color2);
        }
        int color3 = typedArrayObtainStyledAttributes.getColor(C8206ayP.LoaderManager.fetchVPNInfo, 0);
        if (color3 != 0) {
            setRightIconTint(color3);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C8206ayP.LoaderManager.AuCTel, false)) {
            resources = getResources();
            i = C8206ayP.ActionBar.OLrzqt;
        } else {
            resources = getResources();
            i = C8206ayP.ActionBar.copydefault;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, 0);
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setDefaultNavigationClickHandling() {
        wYC wycCopydefault = copydefault();
        wycCopydefault.setOnClickListener(new Application(wycCopydefault, 1000L, this));
    }

    public final void copydefault(Context context) {
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).onBackPressed();
        } else if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "");
            copydefault(baseContext);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        KWHzl(context);
    }

    public final void KWHzl(Context context) {
        Sequence<View> children;
        View view;
        if (context instanceof android.app.Activity) {
            ViewGroup viewGroup = (ViewGroup) ((android.app.Activity) context).findViewById(R.id.content);
            if (viewGroup == null || (children = ViewGroupKt.getChildren(viewGroup)) == null || (view = (View) C59467zhb.zLjUOn(children)) == null) {
                return;
            }
            view.setPaddingRelative(view.getPaddingStart(), C55302xhQ.EZpvd(context), view.getPaddingEnd(), view.getPaddingBottom());
            return;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "");
            KWHzl(baseContext);
        }
    }

    public final void setTitle(@StringRes int i) {
        String string = getContext().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        setTitle(string);
    }

    public final void setTitle(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        EZpvd().setText(charSequence);
    }

    public final void setTitleColorResource(@ColorRes int i) {
        EZpvd().setTextColor(ContextCompat.getColor(getContext(), i));
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ Function0 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(View view, long j, Function0 function0) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.invoke();
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ SimpleToolBar AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, SimpleToolBar simpleToolBar) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = simpleToolBar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                SimpleToolBar simpleToolBar = this.AEQbTJ;
                Context context = simpleToolBar.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                simpleToolBar.copydefault(context);
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ Function0 KWHzl;
        public final /* synthetic */ View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(View view, long j, Function0 function0) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.invoke();
            }
        }
    }

    public final void setTitleColor(@ColorInt int i) {
        EZpvd().setTextColor(i);
    }

    public final void setNavigationType(@NotNull NavigationType navigationType) {
        Intrinsics.checkNotNullParameter(navigationType, "");
        int i = Activity.EZpvd[navigationType.ordinal()];
        if (i == 1) {
            AEQbTJ(C52761wXj.TaskDescription.fHqPtx);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            AEQbTJ(C52761wXj.TaskDescription.alsFma);
        }
    }

    private final void AEQbTJ(@DrawableRes int i) {
        copydefault().setImageResource(i);
        setNavigationIconTintResource(C52761wXj.Activity.DeEinT);
    }

    public final void setNavigationIconTintResource(@ColorRes int i) {
        setNavigationIconTint(ContextCompat.getColor(getContext(), i));
    }

    public final void setNavigationIconTint(@ColorInt int i) {
        wYC wycCopydefault = copydefault();
        Drawable drawable = wycCopydefault.getDrawable();
        if (drawable == null) {
            return;
        }
        Drawable drawableWrap = DrawableCompat.wrap(drawable);
        Intrinsics.checkNotNullExpressionValue(drawableWrap, "");
        DrawableCompat.setTint(drawableWrap, i);
        wycCopydefault.setImageDrawable(drawableWrap);
    }

    public final void setNavigationOnClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        wYC wycCopydefault = copydefault();
        wycCopydefault.setOnClickListener(new ActionBar(wycCopydefault, 1000L, function0));
    }

    public final void setRightIcon(@DrawableRes int i) {
        Drawable drawable = ContextCompat.getDrawable(getContext(), i);
        if (drawable != null) {
            setRightIcon(drawable);
        }
    }

    public final void setRightIcon(Drawable drawable) {
        wYC wycAEQbTJ = AEQbTJ();
        wycAEQbTJ.setImageDrawable(drawable);
        wycAEQbTJ.setVisibility(drawable != null ? 0 : 8);
    }

    public final void setRightIconTintResource(@ColorRes int i) {
        setRightIconTint(ContextCompat.getColor(getContext(), i));
    }

    public final void setRightIconTint(@ColorInt int i) {
        wYC wycAEQbTJ = AEQbTJ();
        Drawable drawable = wycAEQbTJ.getDrawable();
        if (drawable == null) {
            return;
        }
        Drawable drawableWrap = DrawableCompat.wrap(drawable);
        Intrinsics.checkNotNullExpressionValue(drawableWrap, "");
        DrawableCompat.setTint(drawableWrap, i);
        wycAEQbTJ.setImageDrawable(drawableWrap);
    }

    public final void copydefault(String str) {
        if (((wYC) findViewWithTag(str)) == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            wYC wyc = new wYC(context, null, R.attr.selectableItemBackgroundBorderless);
            wyc.setScaleType(ImageView.ScaleType.CENTER);
            wyc.setTag(str);
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C8206ayP.ActionBar.KWHzl);
            wyc.setMinimumWidth(dimensionPixelSize);
            wyc.setMinimumHeight(dimensionPixelSize);
            OLrzqt(wyc);
            wyc.setContentDescription(Intrinsics.EZpvd((Object) str, (Object) OLrzqt) ? "navigationIcon" : "rightIcon");
            addView(wyc, new LinearLayout.LayoutParams(-2, -2));
        }
    }

    private final void OLrzqt(ImageView imageView) {
        TypedValue typedValue = new TypedValue();
        imageView.getContext().getTheme().resolveAttribute(R.attr.selectableItemBackgroundBorderless, typedValue, true);
        int i = typedValue.resourceId;
        if (i > 0) {
            imageView.setBackgroundResource(i);
        }
    }

    public final void OLrzqt() {
        Object obj = copydefault;
        if (((TextView) findViewWithTag(obj)) == null) {
            TextView textView = new TextView(getContext());
            textView.setTag(obj);
            TextViewCompat.setTextAppearance(textView, C52761wXj.LoaderManager.hrNTAI);
            textView.setTypeface(null, 1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            textView.setGravity(17);
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.gLWkOL));
            addView(textView, new LinearLayout.LayoutParams(-2, -2, 1.0f));
        }
    }

    public final void setRightIconOnClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        wYC wycAEQbTJ = AEQbTJ();
        wycAEQbTJ.setOnClickListener(new TaskDescription(wycAEQbTJ, 1000L, function0));
    }

    public final TextView EZpvd() {
        View viewFindViewWithTag = findViewWithTag(copydefault);
        Intrinsics.checkNotNullExpressionValue(viewFindViewWithTag, "");
        return (TextView) viewFindViewWithTag;
    }

    public final wYC copydefault() {
        View viewFindViewWithTag = findViewWithTag(OLrzqt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewWithTag, "");
        return (wYC) viewFindViewWithTag;
    }

    public final wYC AEQbTJ() {
        View viewFindViewWithTag = findViewWithTag(AEQbTJ);
        Intrinsics.checkNotNullExpressionValue(viewFindViewWithTag, "");
        return (wYC) viewFindViewWithTag;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class NavigationType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ NavigationType[] $VALUES;
        public static final NavigationType BACK = new NavigationType("BACK", 0, 0);
        public static final NavigationType CLOSE = new NavigationType(InvestButtonAction.ACTION_CALLBACK_CLOSE, 1, 1);
        private final int value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ NavigationType[] $values() {
            return new NavigationType[]{BACK, CLOSE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<NavigationType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        private NavigationType(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            NavigationType[] navigationTypeArr$values = $values();
            $VALUES = navigationTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(navigationTypeArr$values);
        }

        public static NavigationType valueOf(String str) {
            return (NavigationType) Enum.valueOf(NavigationType.class, str);
        }

        public static NavigationType[] values() {
            return (NavigationType[]) $VALUES.clone();
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.widget.SimpleToolBar.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
