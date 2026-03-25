package o;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.dLX;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dER {
    public int AhwBna;
    public final android.content.Context EZpvd;
    public ViewTreeObserver.OnGlobalLayoutListener OLrzqt;
    public int copydefault;
    public ViewGroup.LayoutParams djBIcL;
    public final android.view.View gEmmrt;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public static final int AEQbTJ = dLX.Application.accept;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 android.view.View), (r2v0 android.content.Context) A[MD:(android.view.View, android.content.Context):void (m)] call: o.dER.<init>(android.view.View, android.content.Context):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ dER(android.view.View view, android.content.Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, context);
    }

    public dER(android.view.View view, android.content.Context context) {
        this.gEmmrt = view;
        this.EZpvd = context;
        this.djBIcL = view.getLayoutParams();
        this.OLrzqt = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.dET
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                dER.EZpvd(this.copydefault);
            }
        };
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.OLrzqt);
        pUU.valueOf("DiscoverAndroidBug5497Workaround", "init: Keyboard workaround initialized for view: " + view.getClass().getSimpleName());
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dER.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void OLrzqt(@NotNull androidx.fragment.app.Fragment fragment) {
            android.content.Context applicationContext;
            Intrinsics.checkNotNullParameter(fragment, "");
            android.view.View view = fragment.getView();
            if (view == null) {
                pUU.valueOf("DiscoverAndroidBug5497Workaround", "assistFragment: Fragment view is null");
                return;
            }
            android.view.View viewFindViewById = view.findViewById(dER.AEQbTJ);
            if (viewFindViewById == null) {
                pUU.valueOf("DiscoverAndroidBug5497Workaround", "assistFragment: layout_web not found");
                return;
            }
            android.content.Context context = fragment.getContext();
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (context == null || (applicationContext = context.getApplicationContext()) == null) {
                FragmentActivity activity = fragment.getActivity();
                applicationContext = activity != null ? activity.getApplicationContext() : null;
            }
            if (applicationContext == null) {
                pUU.valueOf("DiscoverAndroidBug5497Workaround", "assistFragment: Context is null");
            } else {
                final dER der = new dER(viewFindViewById, applicationContext, defaultConstructorMarker);
                fragment.getViewLifecycleOwner().getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.okinc.business.defi.dapp.webview.DiscoverAndroidBug5497Workaround$Companion$assistFragment$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                        Intrinsics.checkNotNullParameter(event, "");
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            der.EZpvd();
                            lifecycleOwner.getLifecycle().removeObserver(this);
                            pUU.valueOf("DiscoverAndroidBug5497Workaround", "assistFragment: Auto released on onDestroyView");
                        }
                    }
                });
            }
        }
    }

    public static final void EZpvd(dER der) {
        der.copydefault();
    }

    public final void copydefault() {
        ViewGroup.LayoutParams layoutParams;
        int i;
        int iOLrzqt = OLrzqt();
        if (iOLrzqt != this.AhwBna) {
            int height = this.gEmmrt.getHeight();
            if (this.gEmmrt.getRootView().getHeight() - iOLrzqt < 200 && height > 0 && ((i = this.copydefault) == 0 || height > i)) {
                this.copydefault = height;
                pUU.valueOf("DiscoverAndroidBug5497Workaround", "Saved Fragment height (keyboard hidden): " + height);
            }
            int i2 = this.copydefault;
            if (i2 > 0) {
                height = i2;
            }
            int i3 = height - iOLrzqt;
            ViewGroup.LayoutParams layoutParams2 = this.djBIcL;
            if (layoutParams2 == null) {
                return;
            }
            int iEZpvd = EZpvd(layoutParams2);
            if (i3 > 0) {
                int i4 = (height - i3) - iEZpvd;
                if (i4 > 0 && (layoutParams = this.djBIcL) != null) {
                    Intrinsics.copydefault(layoutParams);
                    layoutParams.height = i4;
                    this.gEmmrt.setLayoutParams(this.djBIcL);
                    pUU.valueOf("DiscoverAndroidBug5497Workaround", "Keyboard shown: adjusted height to " + i4 + " (difference=" + i3 + ", margin=" + iEZpvd + ")");
                }
            } else {
                int i5 = height - iEZpvd;
                ViewGroup.LayoutParams layoutParams3 = this.djBIcL;
                if (layoutParams3 != null) {
                    Intrinsics.copydefault(layoutParams3);
                    layoutParams3.height = i5;
                    this.gEmmrt.setLayoutParams(this.djBIcL);
                    pUU.valueOf("DiscoverAndroidBug5497Workaround", "Keyboard hidden: restored height to " + i5);
                }
            }
            this.gEmmrt.requestLayout();
            this.AhwBna = iOLrzqt;
        }
    }

    public final int OLrzqt() {
        android.graphics.Rect rect = new android.graphics.Rect();
        this.gEmmrt.getWindowVisibleDisplayFrame(rect);
        if (rect.top == 0) {
            rect.top = C33570myu.gEmmrt(this.EZpvd);
        }
        return rect.bottom;
    }

    public final int EZpvd(@androidx.annotation.Nullable ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void EZpvd() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.OLrzqt;
        if (onGlobalLayoutListener != null) {
            this.gEmmrt.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        this.OLrzqt = null;
        pUU.valueOf("DiscoverAndroidBug5497Workaround", "release: Keyboard workaround released");
    }
}
