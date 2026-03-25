package o;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: renamed from: o.mnj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C32976mnj extends ViewPager {
    public boolean AEQbTJ;
    public InterfaceC32977mnk AYXKKw;
    public float AhwBna;
    public boolean EZpvd;
    public C32970mnd KWHzl;
    public boolean OLrzqt;
    public ViewPager.OnPageChangeListener copydefault;
    public ViewPager.OnPageChangeListener djBIcL;
    public float valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getAdapter()Landroidx/viewpager/widget/PagerAdapter; */
    @Override // androidx.viewpager.widget.ViewPager
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C32970mnd getAdapter() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCanScroll(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setOnItemClickListener(InterfaceC32977mnk interfaceC32977mnk) {
        this.AYXKKw = interfaceC32977mnk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewpager.widget.ViewPager
    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.copydefault = onPageChangeListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setScrollEnable(boolean z) {
        this.OLrzqt = z;
    }

    public void setAdapter(PagerAdapter pagerAdapter, boolean z) {
        C32970mnd c32970mnd = (C32970mnd) pagerAdapter;
        this.KWHzl = c32970mnd;
        c32970mnd.EZpvd(z);
        this.KWHzl.KWHzl(this);
        super.setAdapter(this.KWHzl);
        setCurrentItem(KWHzl(), false);
    }

    public int KWHzl() {
        if (this.EZpvd) {
            return this.KWHzl.KWHzl();
        }
        return 0;
    }

    public int AEQbTJ() {
        return this.KWHzl.KWHzl() - 1;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.AEQbTJ) {
            return false;
        }
        if (this.AYXKKw != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.valueOf = motionEvent.getX();
            } else if (action == 1) {
                float x = motionEvent.getX();
                this.AhwBna = x;
                if (java.lang.Math.abs(this.valueOf - x) < 5.0f) {
                    this.AYXKKw.AEQbTJ(copydefault());
                }
                this.valueOf = 0.0f;
                this.AhwBna = 0.0f;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return this.AEQbTJ && super.onInterceptTouchEvent(motionEvent);
    }

    public int copydefault() {
        C32970mnd c32970mnd = this.KWHzl;
        if (c32970mnd != null) {
            return c32970mnd.KWHzl(super.getCurrentItem());
        }
        return 0;
    }

    public C32976mnj(android.content.Context context) {
        super(context);
        this.AEQbTJ = true;
        this.EZpvd = true;
        this.OLrzqt = true;
        this.valueOf = 0.0f;
        this.AhwBna = 0.0f;
        this.djBIcL = new ViewPager.OnPageChangeListener() { // from class: o.mnj.4
            public float KWHzl = -1.0f;

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                int iKWHzl = C32976mnj.this.KWHzl.KWHzl(i);
                float f = iKWHzl;
                if (this.KWHzl != f) {
                    this.KWHzl = f;
                    ViewPager.OnPageChangeListener onPageChangeListener = C32976mnj.this.copydefault;
                    if (onPageChangeListener != null) {
                        onPageChangeListener.onPageSelected(iKWHzl);
                    }
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                if (C32976mnj.this.copydefault != null) {
                    if (i != r0.KWHzl.KWHzl() - 1) {
                        C32976mnj.this.copydefault.onPageScrolled(i, f, i2);
                    } else if (f > 0.5d) {
                        C32976mnj.this.copydefault.onPageScrolled(0, 0.0f, 0);
                    } else {
                        C32976mnj.this.copydefault.onPageScrolled(i, 0.0f, 0);
                    }
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                ViewPager.OnPageChangeListener onPageChangeListener = C32976mnj.this.copydefault;
                if (onPageChangeListener != null) {
                    onPageChangeListener.onPageScrollStateChanged(i);
                }
            }
        };
        EZpvd();
    }

    public C32976mnj(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.AEQbTJ = true;
        this.EZpvd = true;
        this.OLrzqt = true;
        this.valueOf = 0.0f;
        this.AhwBna = 0.0f;
        this.djBIcL = new ViewPager.OnPageChangeListener() { // from class: o.mnj.4
            public float KWHzl = -1.0f;

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                int iKWHzl = C32976mnj.this.KWHzl.KWHzl(i);
                float f = iKWHzl;
                if (this.KWHzl != f) {
                    this.KWHzl = f;
                    ViewPager.OnPageChangeListener onPageChangeListener = C32976mnj.this.copydefault;
                    if (onPageChangeListener != null) {
                        onPageChangeListener.onPageSelected(iKWHzl);
                    }
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                if (C32976mnj.this.copydefault != null) {
                    if (i != r0.KWHzl.KWHzl() - 1) {
                        C32976mnj.this.copydefault.onPageScrolled(i, f, i2);
                    } else if (f > 0.5d) {
                        C32976mnj.this.copydefault.onPageScrolled(0, 0.0f, 0);
                    } else {
                        C32976mnj.this.copydefault.onPageScrolled(i, 0.0f, 0);
                    }
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                ViewPager.OnPageChangeListener onPageChangeListener = C32976mnj.this.copydefault;
                if (onPageChangeListener != null) {
                    onPageChangeListener.onPageScrollStateChanged(i);
                }
            }
        };
        EZpvd();
    }

    private void EZpvd() {
        super.setOnPageChangeListener(this.djBIcL);
    }

    @Override // android.view.View
    public void scrollTo(@androidx.annotation.Px int i, @androidx.annotation.Px int i2) {
        if (this.OLrzqt) {
            super.scrollTo(i, i2);
        }
    }

    public void setCanLoop(boolean z) {
        this.EZpvd = z;
        if (!z) {
            setCurrentItem(copydefault(), false);
        }
        C32970mnd c32970mnd = this.KWHzl;
        if (c32970mnd == null) {
            return;
        }
        c32970mnd.EZpvd(z);
        this.KWHzl.notifyDataSetChanged();
    }
}
