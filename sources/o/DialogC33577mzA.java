package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: o.mzA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class DialogC33577mzA extends AppCompatDialog {
    public BottomSheetBehavior.BottomSheetCallback AEQbTJ;
    public boolean EZpvd;
    public BottomSheetBehavior<android.widget.FrameLayout> KWHzl;
    public boolean OLrzqt;
    public ActionBar copydefault;
    public boolean djBIcL;
    public boolean gEmmrt;

    /* JADX INFO: renamed from: o.mzA$ActionBar */
    public interface ActionBar {
        void copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(boolean z) {
        this.djBIcL = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BottomSheetBehavior<android.widget.FrameLayout> copydefault() {
        return this.KWHzl;
    }

    public DialogC33577mzA(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.StyleRes int i) {
        super(context, copydefault(context, i));
        this.EZpvd = true;
        this.djBIcL = true;
        this.OLrzqt = true;
        this.AEQbTJ = new BottomSheetBehavior.BottomSheetCallback() { // from class: o.mzA.2
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(@androidx.annotation.NonNull android.view.View view, int i2) {
                DialogC33577mzA dialogC33577mzA = DialogC33577mzA.this;
                if (!dialogC33577mzA.djBIcL) {
                    dialogC33577mzA.KWHzl.setState(3);
                }
                if (i2 == 5) {
                    DialogC33577mzA.this.cancel();
                }
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(@androidx.annotation.NonNull android.view.View view, float f) {
                DialogC33577mzA dialogC33577mzA = DialogC33577mzA.this;
                if (dialogC33577mzA.djBIcL) {
                    return;
                }
                dialogC33577mzA.KWHzl.setState(3);
            }
        };
        supportRequestWindowFeature(1);
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(@androidx.annotation.LayoutRes int i) {
        super.setContentView(AEQbTJ(i, null, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            C33567myr.AEQbTJ(window);
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(android.view.View view) {
        super.setContentView(AEQbTJ(0, view, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(android.view.View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(AEQbTJ(0, view, layoutParams));
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.EZpvd != z) {
            this.EZpvd = z;
            BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior = this.KWHzl;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(z);
            }
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.EZpvd) {
            this.EZpvd = true;
        }
        this.OLrzqt = z;
        this.gEmmrt = true;
    }

    public final android.view.View AEQbTJ(int i, android.view.View view, ViewGroup.LayoutParams layoutParams) {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) android.view.View.inflate(getContext(), com.google.android.material.R.layout.design_bottom_sheet_dialog, null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) frameLayout.findViewById(com.google.android.material.R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (android.view.ViewGroup) coordinatorLayout, false);
        }
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) coordinatorLayout.findViewById(com.google.android.material.R.id.design_bottom_sheet);
        BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout2);
        this.KWHzl = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setBottomSheetCallback(this.AEQbTJ);
        this.KWHzl.setHideable(this.EZpvd);
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(com.google.android.material.R.id.touch_outside).setOnClickListener(new View.OnClickListener() { // from class: o.mzA.5
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                DialogC33577mzA dialogC33577mzA = DialogC33577mzA.this;
                if (dialogC33577mzA.EZpvd && dialogC33577mzA.isShowing() && DialogC33577mzA.this.AEQbTJ()) {
                    if (DialogC33577mzA.this.copydefault != null) {
                        DialogC33577mzA.this.copydefault.copydefault();
                    }
                    DialogC33577mzA.this.cancel();
                }
            }
        });
        ViewCompat.setAccessibilityDelegate(frameLayout2, new AccessibilityDelegateCompat() { // from class: o.mzA.3
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(android.view.View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                if (DialogC33577mzA.this.EZpvd) {
                    accessibilityNodeInfoCompat.addAction(1048576);
                    accessibilityNodeInfoCompat.setDismissable(true);
                } else {
                    accessibilityNodeInfoCompat.setDismissable(false);
                }
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public boolean performAccessibilityAction(android.view.View view2, int i2, android.os.Bundle bundle) {
                if (i2 == 1048576) {
                    DialogC33577mzA dialogC33577mzA = DialogC33577mzA.this;
                    if (dialogC33577mzA.EZpvd) {
                        dialogC33577mzA.cancel();
                        return true;
                    }
                }
                return super.performAccessibilityAction(view2, i2, bundle);
            }
        });
        frameLayout2.setOnTouchListener(new View.OnTouchListener() { // from class: o.mzA.4
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                return true;
            }
        });
        return frameLayout;
    }

    public boolean AEQbTJ() {
        if (!this.gEmmrt) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
            this.OLrzqt = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.gEmmrt = true;
        }
        return this.OLrzqt;
    }

    public static int copydefault(android.content.Context context, int i) {
        if (i != 0) {
            return i;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        return context.getTheme().resolveAttribute(com.google.android.material.R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : com.google.android.material.R.style.Theme_Design_Light_BottomSheetDialog;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            C55328xhq c55328xhq = C55328xhq.OLrzqt;
            if (c55328xhq.EZpvd() && c55328xhq.KWHzl() != null && c55328xhq.KWHzl().get() != null) {
                c55328xhq.KWHzl().get().cancel();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
