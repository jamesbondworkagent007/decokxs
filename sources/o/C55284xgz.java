package o;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.okinc.uilab.snackbar.BaseTransientBottomBar;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xgz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55284xgz extends BaseTransientBottomBar<C55284xgz> {
    public static final Activity Companion = new Activity(null);
    public static final TaskDescription uzCIH = new TaskDescription();

    /* JADX INFO: renamed from: o.xgz$TaskDescription */
    public static final class TaskDescription implements InterfaceC55278xgt {
        @Override // o.InterfaceC55278xgt
        public void KWHzl(int i, int i2) {
        }

        @Override // o.InterfaceC55278xgt
        public void OLrzqt(int i, int i2) {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 android.content.Context), (r2v0 android.view.ViewGroup), (r3v0 android.view.View), (r4v0 o.xgt) A[MD:(android.content.Context, android.view.ViewGroup, android.view.View, o.xgt):void (m)] call: o.xgz.<init>(android.content.Context, android.view.ViewGroup, android.view.View, o.xgt):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C55284xgz(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view, InterfaceC55278xgt interfaceC55278xgt, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, viewGroup, view, interfaceC55278xgt);
    }

    public C55284xgz(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view, InterfaceC55278xgt interfaceC55278xgt) {
        super(context, viewGroup, view, interfaceC55278xgt);
        AwvSrB().setEndIconClickListener(new View.OnClickListener() { // from class: o.xgy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C55284xgz.AEQbTJ(this.AEQbTJ, view2);
            }
        });
        AEQbTJ(3000);
    }

    public final C55235xgC AwvSrB() {
        android.view.View childAt = this.getFieldNames.getChildAt(0);
        Intrinsics.copydefault(childAt, "");
        return (C55235xgC) childAt;
    }

    public static final void AEQbTJ(C55284xgz c55284xgz, android.view.View view) {
        c55284xgz.copydefault();
    }

    public final C55284xgz isConnected(int i) {
        AwvSrB().setType(i);
        return this;
    }

    public final C55284xgz djBIcL(int i) {
        AwvSrB().setStyle(i);
        return this;
    }

    public final C55284xgz AEQbTJ(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        AwvSrB().setDescription(charSequence);
        return this;
    }

    public final C55284xgz EZpvd(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        AwvSrB().setEndButtonText(charSequence);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(I)Lcom/okinc/uilab/snackbar/BaseTransientBottomBar; */
    @Override // com.okinc.uilab.snackbar.BaseTransientBottomBar
    /* JADX INFO: renamed from: AYXKKw, reason: merged with bridge method [inline-methods] */
    public C55284xgz AEQbTJ(int i) {
        BaseTransientBottomBar baseTransientBottomBarAEQbTJ = super.AEQbTJ(i);
        Intrinsics.checkNotNullExpressionValue(baseTransientBottomBarAEQbTJ, "");
        return (C55284xgz) baseTransientBottomBarAEQbTJ;
    }

    public final C55284xgz EZpvd(View.OnClickListener onClickListener) {
        AwvSrB().setEndButtonClickListener(onClickListener);
        return this;
    }

    public final C55284xgz AEQbTJ(View.OnClickListener onClickListener) {
        AwvSrB().setEndIconClickListener(onClickListener);
        return this;
    }

    /* JADX INFO: renamed from: o.xgz$ActionBar */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class ActionBar extends BaseTransientBottomBar.StateListAnimator {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull android.content.Context context) {
            this(context, null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(context, "");
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:152) call: o.xgz.ActionBar.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
        public /* synthetic */ ActionBar(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i & 2) != 0 ? null : attributeSet);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            Intrinsics.checkNotNullParameter(context, "");
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = getMeasuredWidth();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                android.view.View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - paddingLeft) - paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.xgz$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xgz.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C55284xgz KWHzl(@NotNull android.view.View view, @NotNull java.lang.CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            return copydefault(null, view, charSequence);
        }

        public static /* synthetic */ C55284xgz make$default(Activity activity, android.content.Context context, android.view.View view, java.lang.CharSequence charSequence, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = null;
            }
            return activity.AEQbTJ(context, view, charSequence);
        }

        public final C55284xgz AEQbTJ(android.content.Context context, @NotNull android.view.View view, @NotNull java.lang.CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            return copydefault(context, view, charSequence);
        }

        public static /* synthetic */ C55284xgz make$default(Activity activity, android.content.Context context, android.view.View view, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                context = null;
            }
            return activity.EZpvd(context, view, i);
        }

        public final C55284xgz EZpvd(android.content.Context context, @NotNull android.view.View view, @androidx.annotation.StringRes int i) {
            Intrinsics.checkNotNullParameter(view, "");
            java.lang.CharSequence text = view.getResources().getText(i);
            Intrinsics.checkNotNullExpressionValue(text, "");
            return AEQbTJ(context, view, text);
        }

        public final C55284xgz copydefault(android.content.Context context, android.view.View view, java.lang.CharSequence charSequence) {
            android.view.ViewGroup viewGroupKWHzl = KWHzl(view);
            if (viewGroupKWHzl == null) {
                pUU.copydefault("parent is null in OKSnackbar.makeInternal");
                return null;
            }
            if (context == null) {
                context = viewGroupKWHzl.getContext();
            }
            android.content.Context context2 = context;
            if (context2 == null) {
                pUU.copydefault("parent is null in OKSnackbar.makeInternal");
                return null;
            }
            return new C55284xgz(context2, viewGroupKWHzl, new C55235xgC(context2, null, 0, 6, null), C55284xgz.uzCIH, 0 == true ? 1 : 0).AEQbTJ(charSequence);
        }

        public final android.view.ViewGroup KWHzl(android.view.View view) {
            android.view.ViewGroup viewGroup = null;
            while (!(view instanceof CoordinatorLayout)) {
                if (view instanceof android.widget.FrameLayout) {
                    if (((android.widget.FrameLayout) view).getId() == 16908290) {
                        return (android.view.ViewGroup) view;
                    }
                    viewGroup = (android.view.ViewGroup) view;
                }
                if (view != null) {
                    java.lang.Object parent = view.getParent();
                    view = parent instanceof android.view.View ? (android.view.View) parent : null;
                }
                if (view == null) {
                    return viewGroup;
                }
            }
            return (android.view.ViewGroup) view;
        }
    }
}
