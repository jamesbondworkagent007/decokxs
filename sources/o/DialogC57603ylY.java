package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.okinc.widget.dialog.behavior.ViewPagerBottomSheetBehavior;
import o.C32113mPz;

/* JADX INFO: renamed from: o.ylY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@java.lang.Deprecated
public class DialogC57603ylY extends AppCompatDialog {
    public ViewPagerBottomSheetBehavior<android.widget.RelativeLayout> AEQbTJ;
    public android.widget.RelativeLayout AYXKKw;
    public boolean EZpvd;
    public ViewPagerBottomSheetBehavior.Activity KWHzl;
    public boolean OLrzqt;
    public boolean copydefault;
    public android.widget.ImageView valueOf;

    public DialogC57603ylY(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.StyleRes int i) {
        super(context, AEQbTJ(context, i));
        this.OLrzqt = true;
        this.EZpvd = true;
        this.KWHzl = new ViewPagerBottomSheetBehavior.Activity() { // from class: o.ylY.4
            @Override // com.okinc.widget.dialog.behavior.ViewPagerBottomSheetBehavior.Activity
            public void OLrzqt(@androidx.annotation.NonNull android.view.View view, float f) {
            }

            @Override // com.okinc.widget.dialog.behavior.ViewPagerBottomSheetBehavior.Activity
            public void OLrzqt(@androidx.annotation.NonNull android.view.View view, int i2) {
                if (i2 == 5) {
                    DialogC57603ylY.this.cancel();
                }
            }
        };
        supportRequestWindowFeature(1);
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(@androidx.annotation.LayoutRes int i) {
        super.setContentView(EZpvd(i, null, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(android.view.View view) {
        super.setContentView(EZpvd(0, view, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(android.view.View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(EZpvd(0, view, layoutParams));
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.OLrzqt != z) {
            this.OLrzqt = z;
            ViewPagerBottomSheetBehavior<android.widget.RelativeLayout> viewPagerBottomSheetBehavior = this.AEQbTJ;
            if (viewPagerBottomSheetBehavior != null) {
                viewPagerBottomSheetBehavior.KWHzl(z);
            }
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        ViewPagerBottomSheetBehavior<android.widget.RelativeLayout> viewPagerBottomSheetBehavior = this.AEQbTJ;
        if (viewPagerBottomSheetBehavior != null) {
            viewPagerBottomSheetBehavior.EZpvd(4);
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.OLrzqt) {
            this.OLrzqt = true;
        }
        this.EZpvd = z;
        this.copydefault = true;
    }

    private android.view.View EZpvd(int i, android.view.View view, ViewGroup.LayoutParams layoutParams) {
        android.view.View viewInflate = android.view.View.inflate(getContext(), C32113mPz.Fragment.djBIcL, null);
        this.valueOf = (android.widget.ImageView) viewInflate.findViewById(C32113mPz.FragmentManager.QOLQEE);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate.findViewById(C32113mPz.FragmentManager.fetchVPNInfo);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (android.view.ViewGroup) coordinatorLayout, false);
        }
        this.AYXKKw = (android.widget.RelativeLayout) coordinatorLayout.findViewById(C32113mPz.FragmentManager.QfsBiF);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) coordinatorLayout.findViewById(C32113mPz.FragmentManager.isConnected);
        ViewPagerBottomSheetBehavior<android.widget.RelativeLayout> viewPagerBottomSheetBehaviorAEQbTJ = ViewPagerBottomSheetBehavior.AEQbTJ(this.AYXKKw);
        this.AEQbTJ = viewPagerBottomSheetBehaviorAEQbTJ;
        viewPagerBottomSheetBehaviorAEQbTJ.AEQbTJ(this.KWHzl);
        this.AEQbTJ.KWHzl(this.OLrzqt);
        this.AEQbTJ.EZpvd(3);
        this.AEQbTJ.copydefault(OLrzqt());
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C32113mPz.FragmentManager.DXXBbs).setOnClickListener(new View.OnClickListener() { // from class: o.ylY.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                DialogC57603ylY dialogC57603ylY = DialogC57603ylY.this;
                if (dialogC57603ylY.OLrzqt && dialogC57603ylY.isShowing() && DialogC57603ylY.this.EZpvd()) {
                    DialogC57603ylY.this.cancel();
                }
            }
        });
        viewInflate.findViewById(C32113mPz.FragmentManager.QVAiDq).setOnClickListener(new View.OnClickListener() { // from class: o.ylY.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                DialogC57603ylY dialogC57603ylY = DialogC57603ylY.this;
                if (dialogC57603ylY.OLrzqt && dialogC57603ylY.isShowing() && DialogC57603ylY.this.EZpvd()) {
                    DialogC57603ylY.this.cancel();
                }
            }
        });
        ViewCompat.setAccessibilityDelegate(frameLayout, new AccessibilityDelegateCompat() { // from class: o.ylY.5
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(android.view.View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                if (DialogC57603ylY.this.OLrzqt) {
                    accessibilityNodeInfoCompat.addAction(1048576);
                    accessibilityNodeInfoCompat.setDismissable(true);
                } else {
                    accessibilityNodeInfoCompat.setDismissable(false);
                }
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public boolean performAccessibilityAction(android.view.View view2, int i2, android.os.Bundle bundle) {
                if (i2 == 1048576) {
                    DialogC57603ylY dialogC57603ylY = DialogC57603ylY.this;
                    if (dialogC57603ylY.OLrzqt) {
                        dialogC57603ylY.cancel();
                        return true;
                    }
                }
                return super.performAccessibilityAction(view2, i2, bundle);
            }
        });
        frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: o.ylY.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                return true;
            }
        });
        return viewInflate;
    }

    public boolean EZpvd() {
        if (!this.copydefault) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
            this.EZpvd = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.copydefault = true;
        }
        return this.EZpvd;
    }

    private static int AEQbTJ(android.content.Context context, int i) {
        if (i != 0) {
            return i;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        return context.getTheme().resolveAttribute(com.google.android.material.R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : com.google.android.material.R.style.Theme_Design_Light_BottomSheetDialog;
    }

    private int OLrzqt() {
        if (getContext() != null) {
            android.view.WindowManager windowManager = (android.view.WindowManager) getContext().getSystemService("window");
            android.graphics.Point point = new android.graphics.Point();
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getSize(point);
            }
        }
        return C57676yms.KWHzl(getContext());
    }
}
