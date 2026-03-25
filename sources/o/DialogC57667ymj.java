package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import o.C32113mPz;

/* JADX INFO: renamed from: o.ymj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@java.lang.Deprecated
public class DialogC57667ymj extends AppCompatDialog {
    public BottomSheetBehavior<android.widget.RelativeLayout> AEQbTJ;
    public android.widget.RelativeLayout AYXKKw;
    public boolean EZpvd;
    public BottomSheetBehavior.BottomSheetCallback KWHzl;
    public boolean OLrzqt;
    public boolean copydefault;
    public android.widget.ImageView djBIcL;
    public StateListAnimator gEmmrt;
    public android.widget.ImageView valueOf;

    /* JADX INFO: renamed from: o.ymj$StateListAnimator */
    public interface StateListAnimator {
        void AEQbTJ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BottomSheetBehavior<android.widget.RelativeLayout> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(StateListAnimator stateListAnimator) {
        this.gEmmrt = stateListAnimator;
    }

    public DialogC57667ymj(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.StyleRes int i) {
        super(context, OLrzqt(context, i));
        this.EZpvd = true;
        this.OLrzqt = true;
        this.KWHzl = new BottomSheetBehavior.BottomSheetCallback() { // from class: o.ymj.7
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(@androidx.annotation.NonNull android.view.View view, float f) {
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(@androidx.annotation.NonNull android.view.View view, int i2) {
                if (i2 == 5) {
                    DialogC57667ymj.this.cancel();
                }
            }
        };
        supportRequestWindowFeature(1);
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(@androidx.annotation.LayoutRes int i) {
        super.setContentView(KWHzl(i, null, null));
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
        super.setContentView(KWHzl(0, view, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(android.view.View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(KWHzl(0, view, layoutParams));
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.EZpvd != z) {
            this.EZpvd = z;
            BottomSheetBehavior<android.widget.RelativeLayout> bottomSheetBehavior = this.AEQbTJ;
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
        this.copydefault = true;
    }

    private android.view.View KWHzl(int i, android.view.View view, ViewGroup.LayoutParams layoutParams) {
        android.view.View viewInflate = android.view.View.inflate(getContext(), C32113mPz.Fragment.KWHzl, null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate.findViewById(C32113mPz.FragmentManager.fetchVPNInfo);
        this.valueOf = (android.widget.ImageView) viewInflate.findViewById(C32113mPz.FragmentManager.QOLQEE);
        this.djBIcL = (android.widget.ImageView) viewInflate.findViewById(C32113mPz.FragmentManager.QOLQEE);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (android.view.ViewGroup) coordinatorLayout, false);
        }
        this.AYXKKw = (android.widget.RelativeLayout) coordinatorLayout.findViewById(C32113mPz.FragmentManager.QfsBiF);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) coordinatorLayout.findViewById(C32113mPz.FragmentManager.isConnected);
        BottomSheetBehavior<android.widget.RelativeLayout> bottomSheetBehaviorFrom = BottomSheetBehavior.from(this.AYXKKw);
        this.AEQbTJ = bottomSheetBehaviorFrom;
        bottomSheetBehaviorFrom.setBottomSheetCallback(this.KWHzl);
        this.AEQbTJ.setHideable(this.EZpvd);
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C32113mPz.FragmentManager.DXXBbs).setOnClickListener(new View.OnClickListener() { // from class: o.ymj.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                DialogC57667ymj dialogC57667ymj = DialogC57667ymj.this;
                if (dialogC57667ymj.EZpvd && dialogC57667ymj.isShowing() && DialogC57667ymj.this.KWHzl()) {
                    DialogC57667ymj.this.cancel();
                }
            }
        });
        viewInflate.findViewById(C32113mPz.FragmentManager.QVAiDq).setOnClickListener(new View.OnClickListener() { // from class: o.ymj.5
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                DialogC57667ymj dialogC57667ymj = DialogC57667ymj.this;
                if (dialogC57667ymj.EZpvd && dialogC57667ymj.isShowing() && DialogC57667ymj.this.KWHzl()) {
                    DialogC57667ymj.this.cancel();
                }
            }
        });
        this.djBIcL.setOnClickListener(new View.OnClickListener() { // from class: o.ymj.4
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                if (DialogC57667ymj.this.gEmmrt != null) {
                    DialogC57667ymj.this.gEmmrt.AEQbTJ();
                }
            }
        });
        ViewCompat.setAccessibilityDelegate(frameLayout, new AccessibilityDelegateCompat() { // from class: o.ymj.3
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(android.view.View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                if (DialogC57667ymj.this.EZpvd) {
                    accessibilityNodeInfoCompat.addAction(1048576);
                    accessibilityNodeInfoCompat.setDismissable(true);
                } else {
                    accessibilityNodeInfoCompat.setDismissable(false);
                }
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public boolean performAccessibilityAction(android.view.View view2, int i2, android.os.Bundle bundle) {
                if (i2 == 1048576) {
                    DialogC57667ymj dialogC57667ymj = DialogC57667ymj.this;
                    if (dialogC57667ymj.EZpvd) {
                        dialogC57667ymj.cancel();
                        return true;
                    }
                }
                return super.performAccessibilityAction(view2, i2, bundle);
            }
        });
        frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: o.ymj.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                return true;
            }
        });
        return viewInflate;
    }

    public boolean KWHzl() {
        if (!this.copydefault) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
            this.OLrzqt = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.copydefault = true;
        }
        return this.OLrzqt;
    }

    private static int OLrzqt(android.content.Context context, int i) {
        if (i != 0) {
            return i;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        return context.getTheme().resolveAttribute(com.google.android.material.R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : com.google.android.material.R.style.Theme_Design_Light_BottomSheetDialog;
    }

    public void EZpvd(int i) {
        android.widget.ImageView imageView = this.valueOf;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
    }

    public void copydefault(int i) {
        android.widget.ImageView imageView = this.valueOf;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) layoutParams).topMargin = i;
                this.valueOf.setLayoutParams(layoutParams);
            }
        }
    }
}
