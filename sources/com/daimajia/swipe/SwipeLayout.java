package com.daimajia.swipe;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.SX;

/* JADX INFO: loaded from: classes21.dex */
public class SwipeLayout extends FrameLayout {
    public static final DragEdge EZpvd = DragEdge.Right;
    public Rect AEQbTJ;
    public LinkedHashMap<DragEdge, View> AYXKKw;
    public DragEdge AhwBna;
    public ViewDragHelper.Callback AkhnZx;
    public List<TaskDescription> AuCTel;
    public float AubY;
    public ViewDragHelper DbNXlk;
    public View.OnClickListener KWHzl;
    public View.OnLongClickListener OLrzqt;
    public GestureDetector copydefault;
    public int djBIcL;
    public Map<View, Boolean> ejfBZ;
    public List<StateListAnimator> fARcdN;
    public ShowMode fIwbmz;
    public Map<View, ArrayList<Application>> fJNWhG;
    public int fetchVPNInfo;
    public boolean gEmmrt;
    public int getFieldNames;
    public boolean[] getNewProxyInstance;
    public boolean hDKMBd;
    public boolean isConnected;
    public float iwGUEr;
    public List<FragmentManager> uzCIH;
    public ActionBar valueOf;
    public float[] values;

    public interface ActionBar {
        void copydefault(SwipeLayout swipeLayout, boolean z);
    }

    public interface Application {
        void copydefault(View view, DragEdge dragEdge, float f, int i);
    }

    public enum DragEdge {
        Left,
        Top,
        Right,
        Bottom
    }

    public interface FragmentManager {
        void AEQbTJ(SwipeLayout swipeLayout, float f, float f2);

        void EZpvd(SwipeLayout swipeLayout);

        void EZpvd(SwipeLayout swipeLayout, int i, int i2);

        void KWHzl(SwipeLayout swipeLayout);

        void OLrzqt(SwipeLayout swipeLayout);

        void copydefault(SwipeLayout swipeLayout);
    }

    public enum ShowMode {
        LayDown,
        PullOut
    }

    public interface StateListAnimator {
        boolean KWHzl(MotionEvent motionEvent);
    }

    public enum Status {
        Middle,
        Open,
        Close
    }

    public interface TaskDescription {
        void OLrzqt(SwipeLayout swipeLayout);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DragEdge EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isConnected() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setClickToClose(boolean z) {
        this.gEmmrt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setOnDoubleClickListener(ActionBar actionBar) {
        this.valueOf = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSwipeEnabled(boolean z) {
        this.hDKMBd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ShowMode valueOf() {
        return this.fIwbmz;
    }

    public SwipeLayout(Context context) {
        this(context, null);
    }

    public SwipeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwipeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.AhwBna = EZpvd;
        this.djBIcL = 0;
        this.AYXKKw = new LinkedHashMap<>();
        this.values = new float[4];
        this.uzCIH = new ArrayList();
        this.fARcdN = new ArrayList();
        this.fJNWhG = new HashMap();
        this.ejfBZ = new HashMap();
        this.hDKMBd = true;
        this.getNewProxyInstance = new boolean[]{true, true, true, true};
        this.gEmmrt = false;
        this.AkhnZx = new ViewDragHelper.Callback() { // from class: com.daimajia.swipe.SwipeLayout.2
            public boolean AEQbTJ = true;

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(View view, int i2, int i3) {
                if (view == SwipeLayout.this.gEmmrt()) {
                    int i4 = AnonymousClass5.copydefault[SwipeLayout.this.AhwBna.ordinal()];
                    if (i4 == 1 || i4 == 2) {
                        return SwipeLayout.this.getPaddingLeft();
                    }
                    if (i4 != 3) {
                        if (i4 == 4) {
                            if (i2 > SwipeLayout.this.getPaddingLeft()) {
                                return SwipeLayout.this.getPaddingLeft();
                            }
                            if (i2 < SwipeLayout.this.getPaddingLeft() - SwipeLayout.this.djBIcL) {
                                return SwipeLayout.this.getPaddingLeft() - SwipeLayout.this.djBIcL;
                            }
                        }
                    } else {
                        if (i2 < SwipeLayout.this.getPaddingLeft()) {
                            return SwipeLayout.this.getPaddingLeft();
                        }
                        if (i2 > SwipeLayout.this.getPaddingLeft() + SwipeLayout.this.djBIcL) {
                            return SwipeLayout.this.getPaddingLeft() + SwipeLayout.this.djBIcL;
                        }
                    }
                } else if (SwipeLayout.this.copydefault() == view) {
                    int i5 = AnonymousClass5.copydefault[SwipeLayout.this.AhwBna.ordinal()];
                    if (i5 == 1 || i5 == 2) {
                        return SwipeLayout.this.getPaddingLeft();
                    }
                    if (i5 != 3) {
                        if (i5 == 4 && SwipeLayout.this.fIwbmz == ShowMode.PullOut && i2 < SwipeLayout.this.getMeasuredWidth() - SwipeLayout.this.djBIcL) {
                            return SwipeLayout.this.getMeasuredWidth() - SwipeLayout.this.djBIcL;
                        }
                    } else if (SwipeLayout.this.fIwbmz == ShowMode.PullOut && i2 > SwipeLayout.this.getPaddingLeft()) {
                        return SwipeLayout.this.getPaddingLeft();
                    }
                }
                return i2;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(View view, int i2, int i3) {
                if (view == SwipeLayout.this.gEmmrt()) {
                    int i4 = AnonymousClass5.copydefault[SwipeLayout.this.AhwBna.ordinal()];
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3 || i4 == 4) {
                                return SwipeLayout.this.getPaddingTop();
                            }
                        } else {
                            if (i2 < SwipeLayout.this.getPaddingTop() - SwipeLayout.this.djBIcL) {
                                return SwipeLayout.this.getPaddingTop() - SwipeLayout.this.djBIcL;
                            }
                            if (i2 > SwipeLayout.this.getPaddingTop()) {
                                return SwipeLayout.this.getPaddingTop();
                            }
                        }
                    } else {
                        if (i2 < SwipeLayout.this.getPaddingTop()) {
                            return SwipeLayout.this.getPaddingTop();
                        }
                        if (i2 > SwipeLayout.this.getPaddingTop() + SwipeLayout.this.djBIcL) {
                            return SwipeLayout.this.getPaddingTop() + SwipeLayout.this.djBIcL;
                        }
                    }
                } else {
                    View viewGEmmrt = SwipeLayout.this.gEmmrt();
                    int top = viewGEmmrt == null ? 0 : viewGEmmrt.getTop();
                    int i5 = AnonymousClass5.copydefault[SwipeLayout.this.AhwBna.ordinal()];
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 == 3 || i5 == 4) {
                                return SwipeLayout.this.getPaddingTop();
                            }
                        } else if (SwipeLayout.this.fIwbmz == ShowMode.PullOut) {
                            if (i2 < SwipeLayout.this.getMeasuredHeight() - SwipeLayout.this.djBIcL) {
                                return SwipeLayout.this.getMeasuredHeight() - SwipeLayout.this.djBIcL;
                            }
                        } else {
                            int i6 = top + i3;
                            if (i6 < SwipeLayout.this.getPaddingTop()) {
                                if (i6 <= SwipeLayout.this.getPaddingTop() - SwipeLayout.this.djBIcL) {
                                    return SwipeLayout.this.getPaddingTop() - SwipeLayout.this.djBIcL;
                                }
                            } else {
                                return SwipeLayout.this.getPaddingTop();
                            }
                        }
                    } else if (SwipeLayout.this.fIwbmz == ShowMode.PullOut) {
                        if (i2 > SwipeLayout.this.getPaddingTop()) {
                            return SwipeLayout.this.getPaddingTop();
                        }
                    } else {
                        int i7 = top + i3;
                        if (i7 >= SwipeLayout.this.getPaddingTop()) {
                            if (i7 > SwipeLayout.this.getPaddingTop() + SwipeLayout.this.djBIcL) {
                                return SwipeLayout.this.getPaddingTop() + SwipeLayout.this.djBIcL;
                            }
                        } else {
                            return SwipeLayout.this.getPaddingTop();
                        }
                    }
                }
                return i2;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(View view, int i2) {
                boolean z = view == SwipeLayout.this.gEmmrt() || SwipeLayout.this.OLrzqt().contains(view);
                if (z) {
                    this.AEQbTJ = SwipeLayout.this.KWHzl() == Status.Close;
                }
                return z;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewHorizontalDragRange(View view) {
                return SwipeLayout.this.djBIcL;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public int getViewVerticalDragRange(View view) {
                return SwipeLayout.this.djBIcL;
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewReleased(View view, float f, float f2) {
                super.onViewReleased(view, f, f2);
                Iterator it = SwipeLayout.this.uzCIH.iterator();
                while (it.hasNext()) {
                    ((FragmentManager) it.next()).AEQbTJ(SwipeLayout.this, f, f2);
                }
                SwipeLayout.this.OLrzqt(f, f2, this.AEQbTJ);
                SwipeLayout.this.invalidate();
            }

            @Override // androidx.customview.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(View view, int i2, int i3, int i4, int i5) {
                View viewGEmmrt = SwipeLayout.this.gEmmrt();
                if (viewGEmmrt == null) {
                    return;
                }
                View viewCopydefault = SwipeLayout.this.copydefault();
                int left = viewGEmmrt.getLeft();
                int right = viewGEmmrt.getRight();
                int top = viewGEmmrt.getTop();
                int bottom = viewGEmmrt.getBottom();
                if (view == viewGEmmrt) {
                    if (SwipeLayout.this.fIwbmz == ShowMode.PullOut && viewCopydefault != null) {
                        if (SwipeLayout.this.AhwBna == DragEdge.Left || SwipeLayout.this.AhwBna == DragEdge.Right) {
                            viewCopydefault.offsetLeftAndRight(i4);
                        } else {
                            viewCopydefault.offsetTopAndBottom(i5);
                        }
                    }
                } else if (SwipeLayout.this.OLrzqt().contains(view)) {
                    if (SwipeLayout.this.fIwbmz != ShowMode.PullOut) {
                        SwipeLayout swipeLayout = SwipeLayout.this;
                        Rect rectCopydefault = swipeLayout.copydefault(swipeLayout.AhwBna);
                        if (viewCopydefault != null) {
                            viewCopydefault.layout(rectCopydefault.left, rectCopydefault.top, rectCopydefault.right, rectCopydefault.bottom);
                        }
                        int left2 = viewGEmmrt.getLeft() + i4;
                        int top2 = viewGEmmrt.getTop() + i5;
                        if (SwipeLayout.this.AhwBna != DragEdge.Left || left2 >= SwipeLayout.this.getPaddingLeft()) {
                            if (SwipeLayout.this.AhwBna != DragEdge.Right || left2 <= SwipeLayout.this.getPaddingLeft()) {
                                if (SwipeLayout.this.AhwBna != DragEdge.Top || top2 >= SwipeLayout.this.getPaddingTop()) {
                                    if (SwipeLayout.this.AhwBna == DragEdge.Bottom && top2 > SwipeLayout.this.getPaddingTop()) {
                                        top2 = SwipeLayout.this.getPaddingTop();
                                    }
                                } else {
                                    top2 = SwipeLayout.this.getPaddingTop();
                                }
                            } else {
                                left2 = SwipeLayout.this.getPaddingLeft();
                            }
                        } else {
                            left2 = SwipeLayout.this.getPaddingLeft();
                        }
                        viewGEmmrt.layout(left2, top2, SwipeLayout.this.getMeasuredWidth() + left2, SwipeLayout.this.getMeasuredHeight() + top2);
                    } else {
                        viewGEmmrt.offsetLeftAndRight(i4);
                        viewGEmmrt.offsetTopAndBottom(i5);
                    }
                }
                SwipeLayout.this.AEQbTJ(left, top, right, bottom);
                SwipeLayout.this.copydefault(left, top, i4, i5);
                SwipeLayout.this.invalidate();
            }
        };
        this.fetchVPNInfo = 0;
        this.iwGUEr = -1.0f;
        this.AubY = -1.0f;
        this.copydefault = new GestureDetector(getContext(), new Activity());
        this.DbNXlk = ViewDragHelper.create(this, this.AkhnZx);
        this.getFieldNames = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, SX.ActionBar.AEQbTJ);
        int i2 = typedArrayObtainStyledAttributes.getInt(SX.ActionBar.OLrzqt, 2);
        float[] fArr = this.values;
        DragEdge dragEdge = DragEdge.Left;
        fArr[dragEdge.ordinal()] = typedArrayObtainStyledAttributes.getDimension(SX.ActionBar.copydefault, 0.0f);
        float[] fArr2 = this.values;
        DragEdge dragEdge2 = DragEdge.Right;
        fArr2[dragEdge2.ordinal()] = typedArrayObtainStyledAttributes.getDimension(SX.ActionBar.djBIcL, 0.0f);
        float[] fArr3 = this.values;
        DragEdge dragEdge3 = DragEdge.Top;
        fArr3[dragEdge3.ordinal()] = typedArrayObtainStyledAttributes.getDimension(SX.ActionBar.AhwBna, 0.0f);
        float[] fArr4 = this.values;
        DragEdge dragEdge4 = DragEdge.Bottom;
        fArr4[dragEdge4.ordinal()] = typedArrayObtainStyledAttributes.getDimension(SX.ActionBar.KWHzl, 0.0f);
        setClickToClose(typedArrayObtainStyledAttributes.getBoolean(SX.ActionBar.EZpvd, this.gEmmrt));
        if ((i2 & 1) == 1) {
            this.AYXKKw.put(dragEdge, null);
        }
        if ((i2 & 4) == 4) {
            this.AYXKKw.put(dragEdge3, null);
        }
        if ((i2 & 2) == 2) {
            this.AYXKKw.put(dragEdge2, null);
        }
        if ((i2 & 8) == 8) {
            this.AYXKKw.put(dragEdge4, null);
        }
        this.fIwbmz = ShowMode.values()[typedArrayObtainStyledAttributes.getInt(SX.ActionBar.valueOf, ShowMode.PullOut.ordinal())];
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: com.daimajia.swipe.SwipeLayout$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] copydefault;

        static {
            int[] iArr = new int[DragEdge.values().length];
            copydefault = iArr;
            try {
                iArr[DragEdge.Top.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                copydefault[DragEdge.Bottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                copydefault[DragEdge.Left.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                copydefault[DragEdge.Right.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public boolean EZpvd(View view, Rect rect, DragEdge dragEdge, int i, int i2, int i3, int i4) {
        if (this.ejfBZ.get(view).booleanValue()) {
            return false;
        }
        int i5 = rect.left;
        int i6 = rect.right;
        int i7 = rect.top;
        int i8 = rect.bottom;
        if (valueOf() == ShowMode.LayDown) {
            if ((dragEdge != DragEdge.Right || i3 > i5) && ((dragEdge != DragEdge.Left || i < i6) && ((dragEdge != DragEdge.Top || i2 < i8) && (dragEdge != DragEdge.Bottom || i4 > i7)))) {
                return false;
            }
        } else {
            if (valueOf() != ShowMode.PullOut) {
                return false;
            }
            if ((dragEdge != DragEdge.Right || i6 > getWidth()) && ((dragEdge != DragEdge.Left || i5 < getPaddingLeft()) && ((dragEdge != DragEdge.Top || i7 < getPaddingTop()) && (dragEdge != DragEdge.Bottom || i8 > getHeight())))) {
                return false;
            }
        }
        return true;
    }

    public boolean AEQbTJ(View view, Rect rect, DragEdge dragEdge, int i, int i2, int i3, int i4) {
        int i5 = rect.left;
        int i6 = rect.right;
        int i7 = rect.top;
        int i8 = rect.bottom;
        if (valueOf() == ShowMode.LayDown) {
            int i9 = AnonymousClass5.copydefault[dragEdge.ordinal()];
            return i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 == 4 && i3 > i5 && i3 <= i6 : i < i6 && i >= i5 : i4 > i7 && i4 <= i8 : i2 >= i7 && i2 < i8;
        }
        if (valueOf() != ShowMode.PullOut) {
            return false;
        }
        int i10 = AnonymousClass5.copydefault[dragEdge.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 == 4 && i5 <= getWidth() && i6 > getWidth() : i6 >= getPaddingLeft() && i5 < getPaddingLeft() : i7 < getHeight() && i7 >= getPaddingTop() : i7 < getPaddingTop() && i8 >= getPaddingTop();
    }

    public Rect KWHzl(View view) {
        Rect rect = new Rect(view.getLeft(), view.getTop(), 0, 0);
        View view2 = view;
        while (view2.getParent() != null && view2 != getRootView() && (view2 = (View) view2.getParent()) != this) {
            rect.left += view2.getLeft();
            rect.top += view2.getTop();
        }
        rect.right = rect.left + view.getMeasuredWidth();
        rect.bottom = rect.top + view.getMeasuredHeight();
        return rect;
    }

    public void copydefault(int i, int i2, int i3, int i4) {
        DragEdge dragEdgeEZpvd = EZpvd();
        copydefault(i, i2, dragEdgeEZpvd != DragEdge.Left ? dragEdgeEZpvd != DragEdge.Right ? dragEdgeEZpvd != DragEdge.Top ? dragEdgeEZpvd != DragEdge.Bottom || i4 <= 0 : i4 >= 0 : i3 <= 0 : i3 >= 0);
    }

    public void copydefault(int i, int i2, boolean z) {
        ejfBZ();
        Status statusKWHzl = KWHzl();
        if (this.uzCIH.isEmpty()) {
            return;
        }
        this.fetchVPNInfo++;
        for (FragmentManager fragmentManager : this.uzCIH) {
            if (this.fetchVPNInfo == 1) {
                if (z) {
                    fragmentManager.OLrzqt(this);
                } else {
                    fragmentManager.EZpvd(this);
                }
            }
            fragmentManager.EZpvd(this, i - getPaddingLeft(), i2 - getPaddingTop());
        }
        if (statusKWHzl == Status.Close) {
            Iterator<FragmentManager> it = this.uzCIH.iterator();
            while (it.hasNext()) {
                it.next().copydefault(this);
            }
            this.fetchVPNInfo = 0;
        }
        if (statusKWHzl == Status.Open) {
            View viewCopydefault = copydefault();
            if (viewCopydefault != null) {
                viewCopydefault.setEnabled(true);
            }
            Iterator<FragmentManager> it2 = this.uzCIH.iterator();
            while (it2.hasNext()) {
                it2.next().KWHzl(this);
            }
            this.fetchVPNInfo = 0;
        }
    }

    public final void ejfBZ() {
        Status statusKWHzl = KWHzl();
        List<View> listOLrzqt = OLrzqt();
        if (statusKWHzl == Status.Close) {
            for (View view : listOLrzqt) {
                if (view != null && view.getVisibility() != 4) {
                    view.setVisibility(4);
                }
            }
            return;
        }
        View viewCopydefault = copydefault();
        if (viewCopydefault == null || viewCopydefault.getVisibility() == 0) {
            return;
        }
        viewCopydefault.setVisibility(0);
    }

    public void AEQbTJ(int i, int i2, int i3, int i4) {
        int paddingTop;
        float f;
        int height;
        float f2;
        if (this.fJNWhG.isEmpty()) {
            return;
        }
        for (Map.Entry<View, ArrayList<Application>> entry : this.fJNWhG.entrySet()) {
            View key = entry.getKey();
            Rect rectKWHzl = KWHzl(key);
            if (AEQbTJ(key, rectKWHzl, this.AhwBna, i, i2, i3, i4)) {
                this.ejfBZ.put(key, Boolean.FALSE);
                if (valueOf() == ShowMode.LayDown) {
                    int i5 = AnonymousClass5.copydefault[this.AhwBna.ordinal()];
                    if (i5 == 1) {
                        paddingTop = rectKWHzl.top - i2;
                        f = paddingTop;
                        height = key.getHeight();
                    } else if (i5 == 2) {
                        paddingTop = rectKWHzl.bottom - i4;
                        f = paddingTop;
                        height = key.getHeight();
                    } else if (i5 != 3) {
                        if (i5 == 4) {
                            paddingTop = rectKWHzl.right - i3;
                            f = paddingTop;
                            height = key.getWidth();
                        }
                        paddingTop = 0;
                        f2 = 0.0f;
                    } else {
                        paddingTop = rectKWHzl.left - i;
                        f = paddingTop;
                        height = key.getWidth();
                    }
                    f2 = f / height;
                } else {
                    if (valueOf() == ShowMode.PullOut) {
                        int i6 = AnonymousClass5.copydefault[this.AhwBna.ordinal()];
                        if (i6 == 1) {
                            paddingTop = rectKWHzl.bottom - getPaddingTop();
                            f = paddingTop;
                            height = key.getHeight();
                        } else if (i6 == 2) {
                            paddingTop = rectKWHzl.top - getHeight();
                            f = paddingTop;
                            height = key.getHeight();
                        } else if (i6 == 3) {
                            paddingTop = rectKWHzl.right - getPaddingLeft();
                            f = paddingTop;
                            height = key.getWidth();
                        } else if (i6 == 4) {
                            paddingTop = rectKWHzl.left - getWidth();
                            f = paddingTop;
                            height = key.getWidth();
                        }
                        f2 = f / height;
                    }
                    paddingTop = 0;
                    f2 = 0.0f;
                }
                Iterator<Application> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    it.next().copydefault(key, this.AhwBna, Math.abs(f2), paddingTop);
                    if (Math.abs(f2) == 1.0f) {
                        this.ejfBZ.put(key, Boolean.TRUE);
                    }
                }
            }
            if (EZpvd(key, rectKWHzl, this.AhwBna, i, i2, i3, i4)) {
                this.ejfBZ.put(key, Boolean.TRUE);
                for (Application application : entry.getValue()) {
                    DragEdge dragEdge = this.AhwBna;
                    if (dragEdge == DragEdge.Left || dragEdge == DragEdge.Right) {
                        application.copydefault(key, dragEdge, 1.0f, key.getWidth());
                    } else {
                        application.copydefault(key, dragEdge, 1.0f, key.getHeight());
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (this.DbNXlk.continueSettling(true)) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public void copydefault(DragEdge dragEdge, View view) {
        OLrzqt(dragEdge, view, (ViewGroup.LayoutParams) null);
    }

    public void OLrzqt(DragEdge dragEdge, View view, ViewGroup.LayoutParams layoutParams) {
        int i;
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        int i2 = AnonymousClass5.copydefault[dragEdge.ordinal()];
        if (i2 == 1) {
            i = 48;
        } else if (i2 != 2) {
            i = 3;
            if (i2 != 3) {
                i = i2 != 4 ? -1 : 5;
            }
        } else {
            i = 80;
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = i;
        }
        addView(view, 0, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int iIntValue;
        try {
            iIntValue = ((Integer) layoutParams.getClass().getField("gravity").get(layoutParams)).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            iIntValue = 0;
        }
        if (iIntValue > 0) {
            int absoluteGravity = GravityCompat.getAbsoluteGravity(iIntValue, ViewCompat.getLayoutDirection(this));
            if ((absoluteGravity & 3) == 3) {
                this.AYXKKw.put(DragEdge.Left, view);
            }
            if ((absoluteGravity & 5) == 5) {
                this.AYXKKw.put(DragEdge.Right, view);
            }
            if ((absoluteGravity & 48) == 48) {
                this.AYXKKw.put(DragEdge.Top, view);
            }
            if ((absoluteGravity & 80) == 80) {
                this.AYXKKw.put(DragEdge.Bottom, view);
            }
        } else {
            Iterator<Map.Entry<DragEdge, View>> it = this.AYXKKw.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<DragEdge, View> next = it.next();
                if (next.getValue() == null) {
                    this.AYXKKw.put(next.getKey(), view);
                    break;
                }
            }
        }
        if (view == null || view.getParent() == this) {
            return;
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        fJNWhG();
        if (this.AuCTel != null) {
            for (int i5 = 0; i5 < this.AuCTel.size(); i5++) {
                this.AuCTel.get(i5).OLrzqt(this);
            }
        }
    }

    public void values() {
        Rect rectEZpvd = EZpvd(false);
        View viewGEmmrt = gEmmrt();
        if (viewGEmmrt != null) {
            viewGEmmrt.layout(rectEZpvd.left, rectEZpvd.top, rectEZpvd.right, rectEZpvd.bottom);
            bringChildToFront(viewGEmmrt);
        }
        Rect rectCopydefault = copydefault(ShowMode.PullOut, rectEZpvd);
        View viewCopydefault = copydefault();
        if (viewCopydefault != null) {
            viewCopydefault.layout(rectCopydefault.left, rectCopydefault.top, rectCopydefault.right, rectCopydefault.bottom);
        }
    }

    public void AkhnZx() {
        Rect rectEZpvd = EZpvd(false);
        View viewGEmmrt = gEmmrt();
        if (viewGEmmrt != null) {
            viewGEmmrt.layout(rectEZpvd.left, rectEZpvd.top, rectEZpvd.right, rectEZpvd.bottom);
            bringChildToFront(viewGEmmrt);
        }
        Rect rectCopydefault = copydefault(ShowMode.LayDown, rectEZpvd);
        View viewCopydefault = copydefault();
        if (viewCopydefault != null) {
            viewCopydefault.layout(rectCopydefault.left, rectCopydefault.top, rectCopydefault.right, rectCopydefault.bottom);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(MotionEvent motionEvent) {
        boolean z;
        DragEdge dragEdge;
        if (this.isConnected) {
            return;
        }
        Status statusKWHzl = KWHzl();
        Status status = Status.Middle;
        if (statusKWHzl == status) {
            this.isConnected = true;
            return;
        }
        Status statusKWHzl2 = KWHzl();
        float rawX = motionEvent.getRawX() - this.iwGUEr;
        float rawY = motionEvent.getRawY() - this.AubY;
        float degrees = (float) Math.toDegrees(Math.atan(Math.abs(rawY / rawX)));
        Status statusKWHzl3 = KWHzl();
        Status status2 = Status.Close;
        if (statusKWHzl3 == status2) {
            if (degrees < 45.0f) {
                if (rawX > 0.0f && AYXKKw()) {
                    dragEdge = DragEdge.Left;
                } else if (rawX >= 0.0f || !fetchVPNInfo()) {
                    return;
                } else {
                    dragEdge = DragEdge.Right;
                }
            } else if (rawY > 0.0f && DbNXlk()) {
                dragEdge = DragEdge.Top;
            } else if (rawY >= 0.0f || !djBIcL()) {
                return;
            } else {
                dragEdge = DragEdge.Bottom;
            }
            KWHzl(dragEdge);
        }
        DragEdge dragEdge2 = this.AhwBna;
        if (dragEdge2 != DragEdge.Right) {
            z = false;
        } else {
            boolean z2 = (statusKWHzl2 == Status.Open && rawX > ((float) this.getFieldNames)) || (statusKWHzl2 == status2 && rawX < ((float) (-this.getFieldNames))) || statusKWHzl2 == status;
            if (degrees > 30.0f || !z2) {
                z = true;
            }
        }
        if (dragEdge2 == DragEdge.Left) {
            boolean z3 = (statusKWHzl2 == Status.Open && rawX < ((float) (-this.getFieldNames))) || (statusKWHzl2 == status2 && rawX > ((float) this.getFieldNames)) || statusKWHzl2 == status;
            if (degrees > 30.0f || !z3) {
                z = true;
            }
        }
        if (dragEdge2 == DragEdge.Top) {
            boolean z4 = (statusKWHzl2 == Status.Open && rawY < ((float) (-this.getFieldNames))) || (statusKWHzl2 == status2 && rawY > ((float) this.getFieldNames)) || statusKWHzl2 == status;
            if (degrees < 60.0f || !z4) {
                z = true;
            }
        }
        if (dragEdge2 == DragEdge.Bottom) {
            boolean z5 = (statusKWHzl2 == Status.Open && rawY > ((float) this.getFieldNames)) || (statusKWHzl2 == status2 && rawY < ((float) (-this.getFieldNames))) || statusKWHzl2 == status;
            if (degrees < 60.0f || !z5) {
                z = true;
            }
        }
        this.isConnected = !z;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (!isConnected()) {
            return false;
        }
        if (this.gEmmrt && KWHzl() == Status.Open && copydefault(motionEvent)) {
            return true;
        }
        for (StateListAnimator stateListAnimator : this.fARcdN) {
            if (stateListAnimator != null && stateListAnimator.KWHzl(motionEvent)) {
                return false;
            }
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.DbNXlk.processTouchEvent(motionEvent);
            this.isConnected = false;
            this.iwGUEr = motionEvent.getRawX();
            this.AubY = motionEvent.getRawY();
            if (KWHzl() == Status.Middle) {
                this.isConnected = true;
            }
        } else if (action == 1) {
            this.isConnected = false;
            this.DbNXlk.processTouchEvent(motionEvent);
        } else if (action == 2) {
            boolean z = this.isConnected;
            EZpvd(motionEvent);
            if (this.isConnected && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!z && this.isConnected) {
                return false;
            }
        } else if (action != 3) {
            this.DbNXlk.processTouchEvent(motionEvent);
        }
        return this.isConnected;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isConnected()) {
            return super.onTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        this.copydefault.onTouchEvent(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.isConnected = false;
                this.DbNXlk.processTouchEvent(motionEvent);
            } else if (actionMasked != 2) {
                if (actionMasked != 3) {
                    this.DbNXlk.processTouchEvent(motionEvent);
                }
            }
            return !super.onTouchEvent(motionEvent) || this.isConnected || actionMasked == 0;
        }
        this.DbNXlk.processTouchEvent(motionEvent);
        this.iwGUEr = motionEvent.getRawX();
        this.AubY = motionEvent.getRawY();
        EZpvd(motionEvent);
        if (this.isConnected) {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.DbNXlk.processTouchEvent(motionEvent);
        }
        if (super.onTouchEvent(motionEvent)) {
        }
    }

    public boolean AYXKKw() {
        LinkedHashMap<DragEdge, View> linkedHashMap = this.AYXKKw;
        DragEdge dragEdge = DragEdge.Left;
        View view = linkedHashMap.get(dragEdge);
        return view != null && view.getParent() == this && view != gEmmrt() && this.getNewProxyInstance[dragEdge.ordinal()];
    }

    public void setLeftSwipeEnabled(boolean z) {
        this.getNewProxyInstance[DragEdge.Left.ordinal()] = z;
    }

    public boolean fetchVPNInfo() {
        LinkedHashMap<DragEdge, View> linkedHashMap = this.AYXKKw;
        DragEdge dragEdge = DragEdge.Right;
        View view = linkedHashMap.get(dragEdge);
        return view != null && view.getParent() == this && view != gEmmrt() && this.getNewProxyInstance[dragEdge.ordinal()];
    }

    public void setRightSwipeEnabled(boolean z) {
        this.getNewProxyInstance[DragEdge.Right.ordinal()] = z;
    }

    public boolean DbNXlk() {
        LinkedHashMap<DragEdge, View> linkedHashMap = this.AYXKKw;
        DragEdge dragEdge = DragEdge.Top;
        View view = linkedHashMap.get(dragEdge);
        return view != null && view.getParent() == this && view != gEmmrt() && this.getNewProxyInstance[dragEdge.ordinal()];
    }

    public void setTopSwipeEnabled(boolean z) {
        this.getNewProxyInstance[DragEdge.Top.ordinal()] = z;
    }

    public boolean djBIcL() {
        LinkedHashMap<DragEdge, View> linkedHashMap = this.AYXKKw;
        DragEdge dragEdge = DragEdge.Bottom;
        View view = linkedHashMap.get(dragEdge);
        return view != null && view.getParent() == this && view != gEmmrt() && this.getNewProxyInstance[dragEdge.ordinal()];
    }

    public void setBottomSwipeEnabled(boolean z) {
        this.getNewProxyInstance[DragEdge.Bottom.ordinal()] = z;
    }

    public final boolean AhwBna() {
        return iwGUEr() != null;
    }

    private AdapterView iwGUEr() {
        ViewParent parent = getParent();
        if (parent instanceof AdapterView) {
            return (AdapterView) parent;
        }
        return null;
    }

    public final void AuCTel() {
        AdapterView adapterView;
        int positionForView;
        if (KWHzl() != Status.Close) {
            return;
        }
        ViewParent parent = getParent();
        if (!(parent instanceof AdapterView) || (positionForView = (adapterView = (AdapterView) parent).getPositionForView(this)) == -1) {
            return;
        }
        adapterView.performItemClick(adapterView.getChildAt(positionForView - adapterView.getFirstVisiblePosition()), positionForView, adapterView.getAdapter().getItemId(positionForView));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        r0 = (android.widget.AdapterView) r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean fARcdN() {
        AdapterView<?> adapterView;
        int positionForView;
        if (KWHzl() != Status.Close) {
            return false;
        }
        ViewParent parent = getParent();
        if (!(parent instanceof AdapterView) || (positionForView = adapterView.getPositionForView(this)) == -1) {
            return false;
        }
        long itemIdAtPosition = adapterView.getItemIdAtPosition(positionForView);
        try {
            Method declaredMethod = AbsListView.class.getDeclaredMethod("performLongPress", View.class, Integer.TYPE, Long.TYPE);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(adapterView, this, Integer.valueOf(positionForView), Long.valueOf(itemIdAtPosition))).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            boolean zOnItemLongClick = adapterView.getOnItemLongClickListener() != null ? adapterView.getOnItemLongClickListener().onItemLongClick(adapterView, this, positionForView, itemIdAtPosition) : false;
            if (zOnItemLongClick) {
                adapterView.performHapticFeedback(0);
            }
            return zOnItemLongClick;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (AhwBna()) {
            if (this.KWHzl == null) {
                setOnClickListener(new View.OnClickListener() { // from class: com.daimajia.swipe.SwipeLayout.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        SwipeLayout.this.AuCTel();
                    }
                });
            }
            if (this.OLrzqt == null) {
                setOnLongClickListener(new View.OnLongClickListener() { // from class: com.daimajia.swipe.SwipeLayout.4
                    @Override // android.view.View.OnLongClickListener
                    public boolean onLongClick(View view) {
                        SwipeLayout.this.fARcdN();
                        return true;
                    }
                });
            }
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.KWHzl = onClickListener;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        this.OLrzqt = onLongClickListener;
    }

    public final boolean copydefault(MotionEvent motionEvent) {
        View viewGEmmrt = gEmmrt();
        if (viewGEmmrt == null) {
            return false;
        }
        if (this.AEQbTJ == null) {
            this.AEQbTJ = new Rect();
        }
        viewGEmmrt.getHitRect(this.AEQbTJ);
        return this.AEQbTJ.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    public class Activity extends GestureDetector.SimpleOnGestureListener {
        public Activity() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (SwipeLayout.this.gEmmrt && SwipeLayout.this.copydefault(motionEvent)) {
                SwipeLayout.this.AEQbTJ();
            }
            return super.onSingleTapUp(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (SwipeLayout.this.valueOf != null) {
                View viewCopydefault = SwipeLayout.this.copydefault();
                View viewGEmmrt = SwipeLayout.this.gEmmrt();
                if (viewCopydefault == null || motionEvent.getX() <= viewCopydefault.getLeft() || motionEvent.getX() >= viewCopydefault.getRight() || motionEvent.getY() <= viewCopydefault.getTop() || motionEvent.getY() >= viewCopydefault.getBottom()) {
                    viewCopydefault = viewGEmmrt;
                }
                SwipeLayout.this.valueOf.copydefault(SwipeLayout.this, viewCopydefault == viewGEmmrt);
            }
            return true;
        }
    }

    public void setDragDistance(int i) {
        if (i < 0) {
            i = 0;
        }
        this.djBIcL = EZpvd(i);
        requestLayout();
    }

    public void setShowMode(ShowMode showMode) {
        this.fIwbmz = showMode;
        requestLayout();
    }

    public View gEmmrt() {
        if (getChildCount() == 0) {
            return null;
        }
        return getChildAt(getChildCount() - 1);
    }

    public View copydefault() {
        List<View> listOLrzqt = OLrzqt();
        if (this.AhwBna.ordinal() < listOLrzqt.size()) {
            return listOLrzqt.get(this.AhwBna.ordinal());
        }
        return null;
    }

    public List<View> OLrzqt() {
        ArrayList arrayList = new ArrayList();
        for (DragEdge dragEdge : DragEdge.values()) {
            arrayList.add(this.AYXKKw.get(dragEdge));
        }
        return arrayList;
    }

    public Status KWHzl() {
        View viewGEmmrt = gEmmrt();
        if (viewGEmmrt == null) {
            return Status.Close;
        }
        int left = viewGEmmrt.getLeft();
        int top = viewGEmmrt.getTop();
        if (left == getPaddingLeft() && top == getPaddingTop()) {
            return Status.Close;
        }
        if (left == getPaddingLeft() - this.djBIcL || left == getPaddingLeft() + this.djBIcL || top == getPaddingTop() - this.djBIcL || top == getPaddingTop() + this.djBIcL) {
            return Status.Open;
        }
        return Status.Middle;
    }

    public void OLrzqt(float f, float f2, boolean z) {
        float minVelocity = this.DbNXlk.getMinVelocity();
        View viewGEmmrt = gEmmrt();
        DragEdge dragEdge = this.AhwBna;
        if (dragEdge == null || viewGEmmrt == null) {
            return;
        }
        float f3 = z ? 0.25f : 0.75f;
        if (dragEdge == DragEdge.Left) {
            if (f > minVelocity) {
                fIwbmz();
                return;
            }
            if (f < (-minVelocity)) {
                AEQbTJ();
                return;
            } else if ((gEmmrt().getLeft() * 1.0f) / this.djBIcL > f3) {
                fIwbmz();
                return;
            } else {
                AEQbTJ();
                return;
            }
        }
        if (dragEdge == DragEdge.Right) {
            if (f > minVelocity) {
                AEQbTJ();
                return;
            }
            if (f < (-minVelocity)) {
                fIwbmz();
                return;
            } else if (((-gEmmrt().getLeft()) * 1.0f) / this.djBIcL > f3) {
                fIwbmz();
                return;
            } else {
                AEQbTJ();
                return;
            }
        }
        if (dragEdge == DragEdge.Top) {
            if (f2 > minVelocity) {
                fIwbmz();
                return;
            }
            if (f2 < (-minVelocity)) {
                AEQbTJ();
                return;
            } else if ((gEmmrt().getTop() * 1.0f) / this.djBIcL > f3) {
                fIwbmz();
                return;
            } else {
                AEQbTJ();
                return;
            }
        }
        if (dragEdge == DragEdge.Bottom) {
            if (f2 > minVelocity) {
                AEQbTJ();
                return;
            }
            if (f2 < (-minVelocity)) {
                fIwbmz();
            } else if (((-gEmmrt().getTop()) * 1.0f) / this.djBIcL > f3) {
                fIwbmz();
            } else {
                AEQbTJ();
            }
        }
    }

    public void fIwbmz() {
        copydefault(true, true);
    }

    public void copydefault(boolean z, boolean z2) {
        View viewGEmmrt = gEmmrt();
        View viewCopydefault = copydefault();
        if (viewGEmmrt == null) {
            return;
        }
        Rect rectEZpvd = EZpvd(true);
        if (z) {
            this.DbNXlk.smoothSlideViewTo(viewGEmmrt, rectEZpvd.left, rectEZpvd.top);
        } else {
            int i = rectEZpvd.left;
            int left = viewGEmmrt.getLeft();
            int i2 = rectEZpvd.top;
            int top = viewGEmmrt.getTop();
            viewGEmmrt.layout(rectEZpvd.left, rectEZpvd.top, rectEZpvd.right, rectEZpvd.bottom);
            ShowMode showModeValueOf = valueOf();
            ShowMode showMode = ShowMode.PullOut;
            if (showModeValueOf == showMode) {
                Rect rectCopydefault = copydefault(showMode, rectEZpvd);
                if (viewCopydefault != null) {
                    viewCopydefault.layout(rectCopydefault.left, rectCopydefault.top, rectCopydefault.right, rectCopydefault.bottom);
                }
            }
            if (z2) {
                AEQbTJ(rectEZpvd.left, rectEZpvd.top, rectEZpvd.right, rectEZpvd.bottom);
                copydefault(rectEZpvd.left, rectEZpvd.top, i - left, i2 - top);
            } else {
                ejfBZ();
            }
        }
        invalidate();
    }

    public void AEQbTJ() {
        OLrzqt(true, true);
    }

    public void OLrzqt(boolean z, boolean z2) {
        View viewGEmmrt = gEmmrt();
        if (viewGEmmrt == null) {
            return;
        }
        if (z) {
            this.DbNXlk.smoothSlideViewTo(gEmmrt(), getPaddingLeft(), getPaddingTop());
        } else {
            Rect rectEZpvd = EZpvd(false);
            int i = rectEZpvd.left;
            int left = viewGEmmrt.getLeft();
            int i2 = rectEZpvd.top;
            int top = viewGEmmrt.getTop();
            viewGEmmrt.layout(rectEZpvd.left, rectEZpvd.top, rectEZpvd.right, rectEZpvd.bottom);
            if (z2) {
                AEQbTJ(rectEZpvd.left, rectEZpvd.top, rectEZpvd.right, rectEZpvd.bottom);
                copydefault(rectEZpvd.left, rectEZpvd.top, i - left, i2 - top);
            } else {
                ejfBZ();
            }
        }
        invalidate();
    }

    public final Rect EZpvd(boolean z) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        if (z) {
            DragEdge dragEdge = this.AhwBna;
            if (dragEdge == DragEdge.Left) {
                paddingLeft = this.djBIcL + getPaddingLeft();
            } else if (dragEdge == DragEdge.Right) {
                paddingLeft = getPaddingLeft() - this.djBIcL;
            } else if (dragEdge == DragEdge.Top) {
                paddingTop = this.djBIcL + getPaddingTop();
            } else {
                paddingTop = getPaddingTop() - this.djBIcL;
            }
        }
        return new Rect(paddingLeft, paddingTop, getMeasuredWidth() + paddingLeft, getMeasuredHeight() + paddingTop);
    }

    public final Rect copydefault(ShowMode showMode, Rect rect) {
        View viewCopydefault = copydefault();
        int i = rect.left;
        int i2 = rect.top;
        int measuredWidth = rect.right;
        int measuredHeight = rect.bottom;
        if (showMode == ShowMode.PullOut) {
            DragEdge dragEdge = this.AhwBna;
            DragEdge dragEdge2 = DragEdge.Left;
            if (dragEdge == dragEdge2) {
                i -= this.djBIcL;
            } else if (dragEdge == DragEdge.Right) {
                i = measuredWidth;
            } else {
                i2 = dragEdge == DragEdge.Top ? i2 - this.djBIcL : measuredHeight;
            }
            if (dragEdge == dragEdge2 || dragEdge == DragEdge.Right) {
                measuredWidth = (viewCopydefault != null ? viewCopydefault.getMeasuredWidth() : 0) + i;
            } else {
                measuredHeight = i2 + (viewCopydefault != null ? viewCopydefault.getMeasuredHeight() : 0);
                measuredWidth = rect.right;
            }
        } else if (showMode == ShowMode.LayDown) {
            DragEdge dragEdge3 = this.AhwBna;
            if (dragEdge3 == DragEdge.Left) {
                measuredWidth = i + this.djBIcL;
            } else if (dragEdge3 == DragEdge.Right) {
                i = measuredWidth - this.djBIcL;
            } else if (dragEdge3 == DragEdge.Top) {
                measuredHeight = i2 + this.djBIcL;
            } else {
                i2 = measuredHeight - this.djBIcL;
            }
        }
        return new Rect(i, i2, measuredWidth, measuredHeight);
    }

    public final Rect copydefault(DragEdge dragEdge) {
        int measuredWidth;
        int measuredHeight;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        DragEdge dragEdge2 = DragEdge.Right;
        if (dragEdge == dragEdge2) {
            paddingLeft = getMeasuredWidth() - this.djBIcL;
        } else if (dragEdge == DragEdge.Bottom) {
            paddingTop = getMeasuredHeight() - this.djBIcL;
        }
        if (dragEdge == DragEdge.Left || dragEdge == dragEdge2) {
            measuredWidth = this.djBIcL + paddingLeft;
            measuredHeight = getMeasuredHeight();
        } else {
            measuredWidth = getMeasuredWidth() + paddingLeft;
            measuredHeight = this.djBIcL;
        }
        return new Rect(paddingLeft, paddingTop, measuredWidth, measuredHeight + paddingTop);
    }

    public final int EZpvd(float f) {
        return (int) ((f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Deprecated
    public void setDragEdge(DragEdge dragEdge) {
        if (getChildCount() >= 2) {
            this.AYXKKw.put(dragEdge, getChildAt(getChildCount() - 2));
        }
        KWHzl(dragEdge);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        for (Map.Entry entry : new HashMap(this.AYXKKw).entrySet()) {
            if (entry.getValue() == view) {
                this.AYXKKw.remove(entry.getKey());
            }
        }
    }

    @Deprecated
    public void setDragEdges(List<DragEdge> list) {
        int iMin = Math.min(list.size(), getChildCount() - 1);
        for (int i = 0; i < iMin; i++) {
            this.AYXKKw.put(list.get(i), getChildAt(i));
        }
        if (list.size() == 0 || list.contains(EZpvd)) {
            KWHzl(EZpvd);
        } else {
            KWHzl(list.get(0));
        }
    }

    @Deprecated
    public void setDragEdges(DragEdge... dragEdgeArr) {
        setDragEdges(Arrays.asList(dragEdgeArr));
    }

    @Deprecated
    public void setBottomViewIds(int i, int i2, int i3, int i4) {
        copydefault(DragEdge.Left, findViewById(i));
        copydefault(DragEdge.Right, findViewById(i2));
        copydefault(DragEdge.Top, findViewById(i3));
        copydefault(DragEdge.Bottom, findViewById(i4));
    }

    private float hDKMBd() {
        DragEdge dragEdge = this.AhwBna;
        if (dragEdge == null) {
            return 0.0f;
        }
        return this.values[dragEdge.ordinal()];
    }

    private void KWHzl(DragEdge dragEdge) {
        if (this.AhwBna != dragEdge) {
            this.AhwBna = dragEdge;
            fJNWhG();
        }
    }

    public final void fJNWhG() {
        View viewCopydefault = copydefault();
        if (viewCopydefault != null) {
            DragEdge dragEdge = this.AhwBna;
            if (dragEdge == DragEdge.Left || dragEdge == DragEdge.Right) {
                this.djBIcL = viewCopydefault.getMeasuredWidth() - EZpvd(hDKMBd());
            } else {
                this.djBIcL = viewCopydefault.getMeasuredHeight() - EZpvd(hDKMBd());
            }
        }
        ShowMode showMode = this.fIwbmz;
        if (showMode == ShowMode.PullOut) {
            values();
        } else if (showMode == ShowMode.LayDown) {
            AkhnZx();
        }
        ejfBZ();
    }
}
