package o;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: o.aqL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7780aqL extends android.view.ViewGroup implements InterfaceC7776aqH, InterfaceC7777aqI {
    public android.view.View[] AYXKKw;
    public int AhwBna;
    public int AkhnZx;
    public int AuCTel;
    public int DbNXlk;
    public int ejfBZ;
    public int fetchVPNInfo;
    public boolean gEmmrt;
    public InterfaceC7947atT isConnected;
    public int valueOf;
    public android.view.View values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public android.view.View AEQbTJ() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AYXKKw() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(boolean z, android.view.View view) {
        this.gEmmrt = z;
        this.values = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7776aqH
    public int getMaxHeight() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7776aqH
    public int getMaxWidth() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCrossAxisAlignment(int i) {
        this.valueOf = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMainAxisAlignment(int i) {
        this.ejfBZ = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7776aqH
    public void setMaxHeight(int i) {
        this.AkhnZx = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7776aqH
    public void setMaxWidth(int i) {
        this.DbNXlk = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setWrap(int i) {
        this.AuCTel = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int valueOf() {
        return this.ejfBZ;
    }

    public AbstractC7780aqL(android.content.Context context) {
        super(context);
        this.fetchVPNInfo = 0;
        this.DbNXlk = Integer.MAX_VALUE;
        this.AkhnZx = Integer.MAX_VALUE;
        this.AYXKKw = new android.view.View[10];
        this.AhwBna = 0;
        this.valueOf = 1;
        this.ejfBZ = 1;
        this.AuCTel = 0;
        this.gEmmrt = false;
        OLrzqt();
    }

    public AbstractC7780aqL(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.fetchVPNInfo = 0;
        this.DbNXlk = Integer.MAX_VALUE;
        this.AkhnZx = Integer.MAX_VALUE;
        this.AYXKKw = new android.view.View[10];
        this.AhwBna = 0;
        this.valueOf = 1;
        this.ejfBZ = 1;
        this.AuCTel = 0;
        this.gEmmrt = false;
        OLrzqt();
    }

    public AbstractC7780aqL(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.fetchVPNInfo = 0;
        this.DbNXlk = Integer.MAX_VALUE;
        this.AkhnZx = Integer.MAX_VALUE;
        this.AYXKKw = new android.view.View[10];
        this.AhwBna = 0;
        this.valueOf = 1;
        this.ejfBZ = 1;
        this.AuCTel = 0;
        this.gEmmrt = false;
        OLrzqt();
    }

    private void OLrzqt() {
        this.isConnected = new C7943atP(this);
    }

    public void setOrientation(int i) {
        if (this.fetchVPNInfo != i) {
            this.fetchVPNInfo = i;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof Activity)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        Activity activity = (Activity) layoutParams;
        activity.AEQbTJ = this.AhwBna;
        copydefault(view, activity);
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        OLrzqt(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(android.view.View view) {
        OLrzqt(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        EZpvd();
        super.removeAllViews();
    }

    @Override // o.InterfaceC7777aqI
    public void AEQbTJ(android.view.View view, int i, int i2) {
        int i3;
        int i4 = 0;
        while (true) {
            i3 = this.AhwBna;
            if (i4 >= i3) {
                i4 = -1;
                break;
            } else if (this.AYXKKw[i4] == view) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 == -1) {
            throw new java.lang.IllegalStateException("Is the child added in this layout?");
        }
        if (i2 > i) {
            if (i4 == 0) {
                return;
            }
            for (int i5 = i4 - 1; i5 >= 0; i5--) {
                android.view.View view2 = this.AYXKKw[i5];
                if (((Activity) view2.getLayoutParams()).OLrzqt >= i2) {
                    this.AYXKKw[i5 + 1] = view;
                    return;
                }
                this.AYXKKw[i5 + 1] = view2;
            }
            this.AYXKKw[0] = view;
            return;
        }
        if (i4 == i3 - 1) {
            return;
        }
        while (true) {
            int i6 = i4 + 1;
            int i7 = this.AhwBna;
            if (i6 < i7) {
                android.view.View view3 = this.AYXKKw[i6];
                if (((Activity) view3.getLayoutParams()).OLrzqt < i2) {
                    this.AYXKKw[i4] = view;
                    return;
                } else {
                    this.AYXKKw[i4] = view3;
                    i4 = i6;
                }
            } else {
                this.AYXKKw[i7 - 1] = view;
                return;
            }
        }
    }

    public final void copydefault(android.view.View view, Activity activity) {
        if (this.AhwBna == this.AYXKKw.length) {
            djBIcL();
        }
        int i = activity.OLrzqt;
        int i2 = this.AhwBna - 1;
        while (i2 >= 0 && ((Activity) this.AYXKKw[i2].getLayoutParams()).OLrzqt < i) {
            i2--;
        }
        int i3 = i2 + 1;
        android.view.View[] viewArr = this.AYXKKw;
        java.lang.System.arraycopy(viewArr, i3, viewArr, i2 + 2, this.AhwBna - i3);
        this.AYXKKw[i3] = view;
        this.AhwBna++;
    }

    private void OLrzqt(android.view.View view) {
        int i = 0;
        boolean z = false;
        while (true) {
            int i2 = this.AhwBna;
            if (i < i2) {
                if (!z && this.AYXKKw[i] == view) {
                    z = true;
                } else if (z) {
                    android.view.View[] viewArr = this.AYXKKw;
                    viewArr[i - 1] = viewArr[i];
                }
                i++;
            } else {
                int i3 = i2 - 1;
                this.AYXKKw[i3] = null;
                this.AhwBna = i3;
                return;
            }
        }
    }

    private void EZpvd() {
        for (int i = 0; i < this.AhwBna; i++) {
            this.AYXKKw[i] = null;
        }
        this.AhwBna = 0;
    }

    private void djBIcL() {
        android.view.View[] viewArr = this.AYXKKw;
        int length = viewArr.length;
        android.view.View[] viewArr2 = new android.view.View[((int) (length * 0.75f)) + length];
        java.lang.System.arraycopy(viewArr, 0, viewArr2, 0, length);
        this.AYXKKw = viewArr2;
    }

    public android.view.View EZpvd(int i) {
        if (this.AhwBna > i) {
            return this.AYXKKw[i];
        }
        return null;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int iEZpvd = EZpvd(i, this.DbNXlk);
        int iEZpvd2 = EZpvd(i2, this.AkhnZx);
        if (this.fetchVPNInfo == 1) {
            this.isConnected.OLrzqt(iEZpvd, iEZpvd2);
        } else {
            this.isConnected.AEQbTJ(iEZpvd, iEZpvd2);
        }
    }

    public void OLrzqt(android.view.View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return super.getSuggestedMinimumHeight();
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return super.getSuggestedMinimumWidth();
    }

    public void setMeasuredDimensionX(int i, int i2) {
        super.setMeasuredDimension(i, i2);
    }

    private int EZpvd(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        return (mode != 1073741824 && View.MeasureSpec.getSize(i) > i2) ? View.MeasureSpec.makeMeasureSpec(i2, mode) : i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.fetchVPNInfo == 1) {
            this.isConnected.copydefault(i, i2, i3, i4);
        } else {
            this.isConnected.OLrzqt(i, i2, i3, i4);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public Activity generateDefaultLayoutParams() {
        int i = this.fetchVPNInfo;
        if (i == 0) {
            return new Activity(-2, -2);
        }
        if (i == 1) {
            return new Activity(-1, -2);
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Activity generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof Activity) {
            return new Activity((Activity) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new Activity((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new Activity(layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof Activity;
    }

    /* JADX INFO: renamed from: o.aqL$Activity */
    public static class Activity extends ViewGroup.MarginLayoutParams {
        public int AEQbTJ;
        public int KWHzl;
        public int OLrzqt;
        public int copydefault;

        public Activity(int i, int i2) {
            super(i, i2);
            this.KWHzl = -1;
            this.OLrzqt = 0;
            this.copydefault = 0;
        }

        public Activity(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.OLrzqt = 0;
            this.copydefault = 0;
            this.KWHzl = -1;
        }

        public Activity(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.OLrzqt = 0;
            this.copydefault = 0;
            this.KWHzl = -1;
        }

        public Activity(Activity activity) {
            super((ViewGroup.MarginLayoutParams) activity);
            this.OLrzqt = 0;
            this.copydefault = 0;
            this.KWHzl = -1;
            this.OLrzqt = activity.OLrzqt;
            this.KWHzl = activity.KWHzl;
            this.copydefault = activity.copydefault;
        }
    }
}
