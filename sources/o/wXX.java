package o;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC52764wXm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public class wXX extends BottomSheetDialogFragment {
    public static final int STYLE_ADJUST_PAN = 1;
    public static final int STYLE_ADJUST_RESIZE = 2;
    public static final int STYLE_UNSPECIFIED = 0;
    private C54946xaf binding;
    private Function1<? super ConstraintLayout, Unit> contentCreateCallback;
    private C33472mxB edgeToEdge;
    private Function1<? super ConstraintLayout, Unit> footerCreateCallback;
    private final boolean hasFooter;
    private Function1<? super C52781wYc, Unit> headerCreateCallback;
    private float heightRatio;
    private final float heightScale;
    private boolean isDynamicFullScreen;
    private final boolean isFullScreen;
    private Function1<? super BottomSheetBehavior<android.widget.FrameLayout>, Unit> onBehaviorSet;
    private DialogInterface.OnCancelListener onCancelListener;
    private DialogInterface.OnDismissListener onDismissListener;
    public static final Activity Companion = new Activity(null);
    public static final int $stable = 8;
    private int softInputStyle = 2;
    private final int brandTheme = C52761wXj.LoaderManager.fERRXa;
    private final C52782wYd appearance = new C52782wYd(this);
    private final InterfaceC56387yDm measureRect$delegate = C56392yDr.copydefault(new Function0() { // from class: o.wXV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return wXX.measureRect_delegate$lambda$0();
        }
    });

    public static /* synthetic */ void getContentCreateCallback$annotations() {
    }

    public static /* synthetic */ void getFooterCreateCallback$annotations() {
    }

    public static /* synthetic */ void getHeaderCreateCallback$annotations() {
    }

    public static /* synthetic */ void getOnBehaviorSet$annotations() {
    }

    public static /* synthetic */ void getOnCancelListener$annotations() {
    }

    public static /* synthetic */ void getSoftInputStyle$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54946xaf getBinding() {
        return this.binding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54946xaf getBindingForTest() {
        return this.binding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getBrandTheme() {
        return this.brandTheme;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super androidx.constraintlayout.widget.ConstraintLayout, kotlin.Unit>, kotlin.jvm.functions.Function1<androidx.constraintlayout.widget.ConstraintLayout, kotlin.Unit> */
    public final Function1<ConstraintLayout, Unit> getContentCreateCallback() {
        return this.contentCreateCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super androidx.constraintlayout.widget.ConstraintLayout, kotlin.Unit>, kotlin.jvm.functions.Function1<androidx.constraintlayout.widget.ConstraintLayout, kotlin.Unit> */
    public final Function1<ConstraintLayout, Unit> getFooterCreateCallback() {
        return this.footerCreateCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean getHasFooter() {
        return this.hasFooter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super o.wYc, kotlin.Unit>, kotlin.jvm.functions.Function1<o.wYc, kotlin.Unit> */
    public final Function1<C52781wYc, Unit> getHeaderCreateCallback() {
        return this.headerCreateCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getHeightRatio() {
        return this.heightRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float getHeightScale() {
        return this.heightScale;
    }

    public int getInitBehaviorState() {
        return 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout>, kotlin.Unit>, kotlin.jvm.functions.Function1<com.google.android.material.bottomsheet.BottomSheetBehavior<android.widget.FrameLayout>, kotlin.Unit> */
    public final Function1<BottomSheetBehavior<android.widget.FrameLayout>, Unit> getOnBehaviorSet() {
        return this.onBehaviorSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DialogInterface.OnCancelListener getOnCancelListener() {
        return this.onCancelListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DialogInterface.OnDismissListener getOnDismissListener() {
        return this.onDismissListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getSoftInputStyle() {
        return this.softInputStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isDynamicFullScreen() {
        return this.isDynamicFullScreen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isFullScreen() {
        return this.isFullScreen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void onHeaderCreated(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void onSetBehavior(@NotNull BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
    }

    public java.lang.Integer overrideFooterTheme() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBinding(C54946xaf c54946xaf) {
        this.binding = c54946xaf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContentCreateCallback(Function1<? super ConstraintLayout, Unit> function1) {
        this.contentCreateCallback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDynamicFullScreen(boolean z) {
        this.isDynamicFullScreen = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFooterCreateCallback(Function1<? super ConstraintLayout, Unit> function1) {
        this.footerCreateCallback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHeaderCreateCallback(Function1<? super C52781wYc, Unit> function1) {
        this.headerCreateCallback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHeightRatio(float f) {
        this.heightRatio = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnBehaviorSet(Function1<? super BottomSheetBehavior<android.widget.FrameLayout>, Unit> function1) {
        this.onBehaviorSet = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.onCancelListener = onCancelListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.onDismissListener = onDismissListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSoftInputStyle(int i) {
        this.softInputStyle = i;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.mxu.resolveTheme$default(o.mxu, android.content.Context, int, int, int, java.lang.Object):android.content.Context */
    public android.view.LayoutInflater getCustomLayoutInflater() {
        C33517mxu c33517mxu = C33517mxu.KWHzl;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(C33517mxu.resolveTheme$default(c33517mxu, contextRequireContext, getBrandTheme(), 0, 2, null));
        Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "");
        return layoutInflaterFrom;
    }

    public static final android.graphics.Rect measureRect_delegate$lambda$0() {
        return new android.graphics.Rect();
    }

    public final android.graphics.Rect getMeasureRect() {
        return (android.graphics.Rect) this.measureRect$delegate.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        InterfaceC52764wXm.Application.loadFromAttributes$default(this.appearance, null, C52761wXj.ActionBar.USBtdM, 0, 4, null);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, getThemeByStyle());
    }

    public final int getThemeByStyle() {
        int softInputStyle = getSoftInputStyle();
        return softInputStyle != 1 ? softInputStyle != 2 ? C52761wXj.LoaderManager.accept : C52761wXj.LoaderManager.QKudOq : C52761wXj.LoaderManager.RlQdEF;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.binding = C54946xaf.AEQbTJ(getCustomLayoutInflater(), null, false);
        updateHeightAndMaxHeight();
        C54946xaf c54946xaf = this.binding;
        if (c54946xaf != null) {
            C52781wYc c52781wYc = c54946xaf.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c52781wYc, "");
            onCreateHeader(c52781wYc);
            wXQ wxq = c54946xaf.KWHzl;
            Intrinsics.checkNotNullExpressionValue(wxq, "");
            onCreateHeader(wxq);
            Function1<? super C52781wYc, Unit> function1 = this.headerCreateCallback;
            if (function1 != null) {
                C52781wYc c52781wYc2 = c54946xaf.EZpvd;
                Intrinsics.checkNotNullExpressionValue(c52781wYc2, "");
                function1.invoke(c52781wYc2);
            }
            ConstraintLayout constraintLayout = c54946xaf.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            onCreateContent(constraintLayout);
            Function1<? super ConstraintLayout, Unit> function12 = this.contentCreateCallback;
            if (function12 != null) {
                ConstraintLayout constraintLayout2 = c54946xaf.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
                function12.invoke(constraintLayout2);
            }
            ConstraintLayout constraintLayout3 = c54946xaf.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
            onCreateFooter(constraintLayout3);
            Function1<? super ConstraintLayout, Unit> function13 = this.footerCreateCallback;
            if (function13 != null) {
                ConstraintLayout constraintLayout4 = c54946xaf.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(constraintLayout4, "");
                function13.invoke(constraintLayout4);
            }
            c54946xaf.getRoot().setTag(C52761wXj.FragmentManager.DGOPHZDGOPHZ, "Bottom Sheet");
        }
        C54946xaf c54946xaf2 = this.binding;
        if (c54946xaf2 != null) {
            return c54946xaf2.getRoot();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateHeightAndMaxHeight() {
        C55118xds c55118xdsAEQbTJ;
        int iOLrzqt;
        float fAEQbTJ;
        float heightScale;
        ViewGroup.LayoutParams layoutParams;
        C54946xaf c54946xaf = this.binding;
        if (c54946xaf == null || (c55118xdsAEQbTJ = c54946xaf.getRoot()) == null) {
            return;
        }
        c55118xdsAEQbTJ.getWindowVisibleDisplayFrame(getMeasureRect());
        int iHeight = getMeasureRect().height();
        if (iHeight > 0) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            int iOLrzqt2 = C55298xhM.OLrzqt(60, contextRequireContext);
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            int iEZpvd = (iHeight - iOLrzqt2) + C55302xhQ.EZpvd(contextRequireContext2);
            if (iEZpvd > 0) {
                updateMaxHeight(iEZpvd);
            }
        }
        float f = this.heightRatio;
        if (f > 0.0f && f < 1.0f) {
            android.content.res.Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            fAEQbTJ = C55302xhQ.AEQbTJ(resources);
            heightScale = this.heightRatio;
        } else if (getHeightScale() > 0.0f && getHeightScale() < 1.0f) {
            android.content.res.Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "");
            fAEQbTJ = C55302xhQ.AEQbTJ(resources2);
            heightScale = getHeightScale();
        } else {
            iOLrzqt = (isFullScreen() || this.isDynamicFullScreen) ? c55118xdsAEQbTJ.OLrzqt() : -2;
            layoutParams = c55118xdsAEQbTJ.getLayoutParams();
            if (layoutParams != null) {
                c55118xdsAEQbTJ.setLayoutParams(new ConstraintLayout.LayoutParams(-1, iOLrzqt));
                return;
            } else {
                if (layoutParams.height != iOLrzqt) {
                    layoutParams.height = iOLrzqt;
                    c55118xdsAEQbTJ.setLayoutParams(layoutParams);
                    return;
                }
                return;
            }
        }
        iOLrzqt = (int) (fAEQbTJ * heightScale);
        layoutParams = c55118xdsAEQbTJ.getLayoutParams();
        if (layoutParams != null) {
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.app.Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(dialogOnCreateDialog, "");
        android.view.Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C33472mxB c33472mxB = new C33472mxB(contextRequireContext, window);
            c33472mxB.AEQbTJ();
            java.lang.Integer numOLrzqt = this.appearance.OLrzqt();
            c33472mxB.AEQbTJ(numOLrzqt != null ? numOLrzqt.intValue() : 0);
            c33472mxB.EZpvd(false, true);
            this.edgeToEdge = c33472mxB;
        }
        return dialogOnCreateDialog;
    }

    public final void setNavigationBarColor(@androidx.annotation.ColorInt int i) {
        C33472mxB c33472mxB = this.edgeToEdge;
        if (c33472mxB != null) {
            c33472mxB.KWHzl(i);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        android.app.Dialog dialog = getDialog();
        if (dialog == null || !(dialog instanceof BottomSheetDialog)) {
            return;
        }
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) dialog;
        bottomSheetDialog.getBehavior().setState(getInitBehaviorState());
        bottomSheetDialog.getBehavior().setSkipCollapsed(true);
        Function1<? super BottomSheetBehavior<android.widget.FrameLayout>, Unit> function1 = this.onBehaviorSet;
        if (function1 != null) {
            BottomSheetBehavior<android.widget.FrameLayout> behavior = bottomSheetDialog.getBehavior();
            Intrinsics.checkNotNullExpressionValue(behavior, "");
            function1.invoke(behavior);
        }
        BottomSheetBehavior<android.widget.FrameLayout> behavior2 = bottomSheetDialog.getBehavior();
        Intrinsics.checkNotNullExpressionValue(behavior2, "");
        onSetBehavior(behavior2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        if ((isFullScreen() || this.isDynamicFullScreen) && (view.getParent() instanceof android.view.ViewGroup)) {
            android.view.ViewParent parent = view.getParent();
            Intrinsics.copydefault(parent, "");
            ((android.view.ViewGroup) parent).getLayoutParams().height = -2;
        }
        C54946xaf c54946xaf = this.binding;
        if (c54946xaf != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: o.wXW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    this.AEQbTJ.dismissAllowingStateLoss();
                }
            };
            android.widget.ImageView imageViewKWHzl = c54946xaf.EZpvd.KWHzl();
            if (imageViewKWHzl != null) {
                imageViewKWHzl.setOnClickListener(onClickListener);
            }
            android.widget.ImageView imageViewOLrzqt = c54946xaf.EZpvd.OLrzqt();
            if (imageViewOLrzqt != null) {
                imageViewOLrzqt.setOnClickListener(onClickListener);
            }
            C52781wYc c52781wYc = c54946xaf.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c52781wYc, "");
            onHeaderCreated(c52781wYc);
            wXQ wxq = c54946xaf.KWHzl;
            Intrinsics.checkNotNullExpressionValue(wxq, "");
            onHeaderCreated(wxq);
        }
        java.lang.Object parent2 = view.getParent();
        if (parent2 != null && (parent2 instanceof android.view.View)) {
            ((android.view.View) parent2).setBackground(null);
        }
        view.setBackground(this.appearance.KWHzl());
        android.app.Dialog dialog = getDialog();
        final android.view.View viewFindViewById = dialog != null ? dialog.findViewById(com.google.android.material.R.id.container) : null;
        if (viewFindViewById != null) {
            ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.wXY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(android.view.View view2, WindowInsetsCompat windowInsetsCompat) {
                    return wXX.onViewCreated$lambda$12$lambda$11(this.KWHzl, viewFindViewById, view2, windowInsetsCompat);
                }
            });
            return;
        }
        pUU.copydefault("setOnApplyWindowInsetsListener not set for bottomSheetContainer is null, dialogIsNull=" + (getDialog() == null));
    }

    public static final WindowInsetsCompat onViewCreated$lambda$12$lambda$11(wXX wxx, android.view.View view, android.view.View view2, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view2, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime() | WindowInsetsCompat.Type.systemBars()).bottom);
        wxx.updateHeightAndMaxHeight();
        return windowInsetsCompat;
    }

    public final void show(@NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        show(fragmentManager, getClass().getCanonicalName() + " #" + hashCode());
    }

    public final void updateMaxHeight(int i) {
        C55118xds c55118xdsAEQbTJ;
        C54946xaf c54946xaf = this.binding;
        if (c54946xaf == null || (c55118xdsAEQbTJ = c54946xaf.getRoot()) == null) {
            return;
        }
        c55118xdsAEQbTJ.setMaxHeight(i);
    }

    public void onCreateFooter(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        if (getHasFooter()) {
            java.lang.Integer numOverrideFooterTheme = overrideFooterTheme();
            android.content.Context context = numOverrideFooterTheme == null ? constraintLayout.getContext() : new androidx.appcompat.view.ContextThemeWrapper(constraintLayout.getContext(), numOverrideFooterTheme.intValue());
            Intrinsics.copydefault(context);
            wYF wyf = new wYF(context, null, 2, 0 == true ? 1 : 0);
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
            layoutParams.bottomToBottom = 0;
            Unit unit = Unit.INSTANCE;
            constraintLayout.addView(wyf, layoutParams);
            onFooterCreated(wyf);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.onDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onCancel(dialogInterface);
        DialogInterface.OnCancelListener onCancelListener = this.onCancelListener;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wXX.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
