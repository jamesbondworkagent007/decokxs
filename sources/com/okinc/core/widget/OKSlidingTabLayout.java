package com.okinc.core.widget;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.Collections;
import o.C32113mPz;
import o.C52761wXj;
import o.C55051xce;
import o.C55296xhK;
import o.C55328xhq;
import o.InterfaceC33549myZ;

/* JADX INFO: loaded from: classes8.dex */
public class OKSlidingTabLayout extends HorizontalScrollView implements ViewPager.OnPageChangeListener {
    public static int AEQbTJ = 0;
    public static boolean KWHzl = false;
    public float AYXKKw;
    public int AhwBna;
    public Paint AkhnZx;
    public float AuCTel;
    public int AuCTelauCTel;
    public boolean AubY;
    public InterfaceC33549myZ AwvSrB;
    public Paint AxsJAY;
    public Runnable AxsJAYaxsJAY;
    public int DTwDnp;
    public int DbNXlk;
    public boolean EZpvd;
    public boolean OLrzqt;
    public RectF ORxRYg;
    public Activity OcIXYQ;
    public boolean QKVWgx;
    public ScrollType QKudOq;
    public boolean QOLQEE;
    public float QUSxYX;
    public Rect QVAiDq;
    public int QbewEr;
    public boolean QfsBiF;
    public boolean RJOkX;
    public boolean RcXXUw;
    public int UeEOUB;
    public LinearLayout aKErDB;
    public int copydefault;
    public float dNCPSb;
    public int djBIcL;
    public int djSkpj;
    public float dvKsVJ;
    public int dxcTrN;
    public GradientDrawable ejfBZ;
    public float fARcdN;
    public Paint fFgQHt;
    public int fIwbmz;
    public float fJNWhG;
    public int fZBcTu;
    public float fetchVPNInfo;
    public int finit;
    public int flVtFt;
    public Path fvQaOB;
    public Context gEmmrt;
    public int gGvvIC;
    public Paint gHZMYf;
    public ArrayList<String> gasjUx;
    public float getFieldNames;
    public float getNewProxyInstance;
    public Paint giSNqX;
    public float gkJEwt;
    public float hDKMBd;
    public boolean hUfVAv;
    public float iRxXKY;
    public ViewPager iZzfmt;
    public float isConnected;
    public int iwGUEr;
    public Path sSMYrx;
    public Rect uzCIH;
    public boolean valueOf;
    public int values;
    public float wlaJM;
    public int zLjUOn;
    public SparseArray<Boolean> zsXlph;
    public TaskDescription zuBGHE;

    public interface Activity {
        void AEQbTJ(ScrollType scrollType);
    }

    public enum ScrollType {
        IDLE,
        TOUCH_SCROLL,
        FLING
    }

    public interface TaskDescription {
        void KWHzl(int i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(TaskDescription taskDescription) {
        this.zuBGHE = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int copydefault() {
        return this.DTwDnp;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAverageShow() {
        this.RJOkX = true;
        this.EZpvd = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setLayoutTabId(int i) {
        this.zLjUOn = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setOKScrollChangeListener(Activity activity) {
        this.OcIXYQ = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setOnTabSelectListener(InterfaceC33549myZ interfaceC33549myZ) {
        this.AwvSrB = interfaceC33549myZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSnapOnTabClick(boolean z) {
        this.QOLQEE = z;
    }

    public void AEQbTJ(Boolean bool) {
        this.QKVWgx = bool.booleanValue();
    }

    public OKSlidingTabLayout(Context context) {
        this(context, null, 0);
    }

    public OKSlidingTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OKSlidingTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.uzCIH = new Rect();
        this.QVAiDq = new Rect();
        this.ejfBZ = new GradientDrawable();
        this.AxsJAY = new Paint(1);
        this.AkhnZx = new Paint(1);
        this.giSNqX = new Paint(1);
        this.gHZMYf = new Paint(1);
        this.fvQaOB = new Path();
        this.ORxRYg = new RectF();
        this.sSMYrx = new Path();
        this.iwGUEr = 0;
        this.QbewEr = 0;
        this.QKVWgx = false;
        this.hUfVAv = false;
        this.zLjUOn = C32113mPz.Fragment.fARcdN;
        this.copydefault = -9999999;
        this.QKudOq = ScrollType.IDLE;
        this.OLrzqt = true;
        this.valueOf = true;
        this.values = 0;
        this.AxsJAYaxsJAY = new Runnable() { // from class: com.okinc.core.widget.OKSlidingTabLayout.5
            @Override // java.lang.Runnable
            public void run() {
                if (OKSlidingTabLayout.this.getScrollX() == OKSlidingTabLayout.this.copydefault) {
                    OKSlidingTabLayout.this.QKudOq = ScrollType.IDLE;
                    if (OKSlidingTabLayout.this.OcIXYQ != null) {
                        OKSlidingTabLayout.this.OcIXYQ.AEQbTJ(OKSlidingTabLayout.this.QKudOq);
                    }
                    OKSlidingTabLayout.this.removeCallbacks(this);
                    return;
                }
                OKSlidingTabLayout.this.QKudOq = ScrollType.FLING;
                if (OKSlidingTabLayout.this.OcIXYQ != null) {
                    OKSlidingTabLayout.this.OcIXYQ.AEQbTJ(OKSlidingTabLayout.this.QKudOq);
                }
                OKSlidingTabLayout oKSlidingTabLayout = OKSlidingTabLayout.this;
                oKSlidingTabLayout.copydefault = oKSlidingTabLayout.getScrollX();
                OKSlidingTabLayout.this.postDelayed(this, 50L);
            }
        };
        this.fFgQHt = new Paint(1);
        this.zsXlph = new SparseArray<>();
        setFillViewport(true);
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        setOverScrollMode(2);
        this.gEmmrt = context;
        AEQbTJ = AEQbTJ(4.0f);
        LinearLayout linearLayout = new LinearLayout(context);
        this.aKErDB = linearLayout;
        addView(linearLayout);
        KWHzl(context, attributeSet);
        int i2 = this.QbewEr;
        if (i2 == 1) {
            this.aKErDB.setGravity(8388611);
        } else if (i2 == 2) {
            this.aKErDB.setGravity(17);
        } else if (i2 == 3) {
            this.aKErDB.setGravity(8388613);
        }
        if (this.QfsBiF) {
            getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.okinc.core.widget.OKSlidingTabLayout.2
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    OKSlidingTabLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
                    OKSlidingTabLayout.this.EZpvd();
                    return true;
                }
            });
        }
        this.gHZMYf.setPathEffect(new CornerPathEffect(this.AuCTel));
        this.gHZMYf.setStyle(Paint.Style.STROKE);
    }

    public void setTabGravity(int i) {
        this.QbewEr = i;
        if (i == 1) {
            this.aKErDB.setGravity(8388611);
        } else if (i == 2) {
            this.aKErDB.setGravity(17);
        } else {
            if (i != 3) {
                return;
            }
            this.aKErDB.setGravity(8388613);
        }
    }

    private void KWHzl(Context context, AttributeSet attributeSet) {
        float f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C32113mPz.PendingIntent.DLWbHP);
        int i = typedArrayObtainStyledAttributes.getInt(C32113mPz.PendingIntent.UlJrfe, 0);
        this.iwGUEr = i;
        this.DbNXlk = typedArrayObtainStyledAttributes.getColor(C32113mPz.PendingIntent.QVsKAR, Color.parseColor(i == 2 ? "#4B6A87" : "#ffffff"));
        int i2 = C32113mPz.PendingIntent.QSLkRj;
        int i3 = this.iwGUEr;
        if (i3 == 1) {
            f = 4.0f;
        } else {
            f = i3 == 2 ? -1 : 2;
        }
        this.fJNWhG = typedArrayObtainStyledAttributes.getDimension(i2, AEQbTJ(f));
        this.wlaJM = typedArrayObtainStyledAttributes.getDimension(C32113mPz.PendingIntent.fdOvFl, AEQbTJ(this.iwGUEr == 1 ? 10.0f : -1.0f));
        this.AuCTel = typedArrayObtainStyledAttributes.getDimension(C32113mPz.PendingIntent.OxVOHk, AEQbTJ(this.iwGUEr == 2 ? -1.0f : 0.0f));
        this.getNewProxyInstance = typedArrayObtainStyledAttributes.getDimension(C32113mPz.PendingIntent.dUDNAs, AEQbTJ(0.0f));
        this.hDKMBd = typedArrayObtainStyledAttributes.getDimension(C32113mPz.PendingIntent.aUsmxb, AEQbTJ(this.iwGUEr == 2 ? 7.0f : 0.0f));
        this.getFieldNames = typedArrayObtainStyledAttributes.getDimension(C32113mPz.PendingIntent.USBtdM, AEQbTJ(0.0f));
        this.fARcdN = typedArrayObtainStyledAttributes.getDimension(C32113mPz.PendingIntent.QwvEab, AEQbTJ(this.iwGUEr != 2 ? 0.0f : 7.0f));
        this.fIwbmz = typedArrayObtainStyledAttributes.getInt(C32113mPz.PendingIntent.OJuSTm, 80);
        this.AubY = typedArrayObtainStyledAttributes.getBoolean(C32113mPz.PendingIntent.fERRXa, false);
        this.gGvvIC = typedArrayObtainStyledAttributes.getColor(C32113mPz.PendingIntent.DcqEDu, Color.parseColor("#ffffff"));
        this.gkJEwt = typedArrayObtainStyledAttributes.getDimension(C32113mPz.PendingIntent.UrRBLY, AEQbTJ(0.0f));
        this.flVtFt = typedArrayObtainStyledAttributes.getInt(C32113mPz.PendingIntent.DWgRXt, 80);
        this.djBIcL = typedArrayObtainStyledAttributes.getColor(C32113mPz.PendingIntent.hrNTAI, Color.parseColor("#ffffff"));
        this.isConnected = typedArrayObtainStyledAttributes.getDimension(C32113mPz.PendingIntent.ODXsMY, AEQbTJ(0.0f));
        this.fetchVPNInfo = typedArrayObtainStyledAttributes.getDimension(C32113mPz.PendingIntent.OHqIaq, AEQbTJ(12.0f));
        this.dvKsVJ = typedArrayObtainStyledAttributes.getDimension(C32113mPz.PendingIntent.call, copydefault(14.0f));
        this.fZBcTu = typedArrayObtainStyledAttributes.getColor(C32113mPz.PendingIntent.DCUTEIddSDPG, Color.parseColor("#ffffff"));
        this.dxcTrN = typedArrayObtainStyledAttributes.getColor(C32113mPz.PendingIntent.DGOPHZ, Color.parseColor("#AAffffff"));
        this.UeEOUB = typedArrayObtainStyledAttributes.getInt(C32113mPz.PendingIntent.run, 0);
        this.djSkpj = typedArrayObtainStyledAttributes.getInt(C32113mPz.PendingIntent.WS, -1);
        this.RcXXUw = typedArrayObtainStyledAttributes.getBoolean(C32113mPz.PendingIntent.ixgjPv, false);
        this.RJOkX = typedArrayObtainStyledAttributes.getBoolean(C32113mPz.PendingIntent.Dmq, false);
        this.QbewEr = typedArrayObtainStyledAttributes.getInt(C32113mPz.PendingIntent.zblBkD, 0);
        this.QfsBiF = typedArrayObtainStyledAttributes.getBoolean(C32113mPz.PendingIntent.igXuih, false);
        float dimension = typedArrayObtainStyledAttributes.getDimension(C32113mPz.PendingIntent.DCUTEIdCUTEI, AEQbTJ(-1.0f));
        this.dNCPSb = dimension;
        this.QUSxYX = typedArrayObtainStyledAttributes.getDimension(C32113mPz.PendingIntent.spnCvw, (this.RJOkX || dimension > 0.0f) ? AEQbTJ(0.0f) : AEQbTJ(20.0f));
        this.OLrzqt = typedArrayObtainStyledAttributes.getBoolean(C32113mPz.PendingIntent.htlTjW, this.OLrzqt);
        this.valueOf = typedArrayObtainStyledAttributes.getBoolean(C32113mPz.PendingIntent.fjfviF, this.valueOf);
        this.values = typedArrayObtainStyledAttributes.getInt(C32113mPz.PendingIntent.QCjLjM, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1) {
            post(this.AxsJAYaxsJAY);
        } else if (action == 2) {
            ScrollType scrollType = ScrollType.TOUCH_SCROLL;
            this.QKudOq = scrollType;
            Activity activity = this.OcIXYQ;
            if (activity != null) {
                activity.AEQbTJ(scrollType);
            }
            removeCallbacks(this.AxsJAYaxsJAY);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setViewPager(ViewPager viewPager) {
        if (viewPager == null || viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager or ViewPager adapter can not be NULL !");
        }
        this.iZzfmt = viewPager;
        viewPager.removeOnPageChangeListener(this);
        this.iZzfmt.addOnPageChangeListener(this);
        OLrzqt();
    }

    public void setViewPager(ViewPager viewPager, String[] strArr) {
        if (viewPager == null || viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager or ViewPager adapter can not be NULL !");
        }
        if (strArr == null || strArr.length == 0) {
            throw new IllegalStateException("Titles can not be EMPTY !");
        }
        if (strArr.length != viewPager.getAdapter().getCount()) {
            throw new IllegalStateException("Titles length must be the same as the page count !");
        }
        this.iZzfmt = viewPager;
        ArrayList<String> arrayList = new ArrayList<>();
        this.gasjUx = arrayList;
        Collections.addAll(arrayList, strArr);
        this.iZzfmt.removeOnPageChangeListener(this);
        this.iZzfmt.addOnPageChangeListener(this);
        OLrzqt();
    }

    public void setViewPager(ViewPager viewPager, String[] strArr, FragmentActivity fragmentActivity, ArrayList<Fragment> arrayList) {
        if (viewPager == null) {
            throw new IllegalStateException("ViewPager can not be NULL !");
        }
        if (strArr == null || strArr.length == 0) {
            throw new IllegalStateException("Titles can not be EMPTY !");
        }
        this.iZzfmt = viewPager;
        viewPager.setAdapter(new ActionBar(fragmentActivity.getSupportFragmentManager(), arrayList, strArr));
        this.iZzfmt.removeOnPageChangeListener(this);
        this.iZzfmt.addOnPageChangeListener(this);
        OLrzqt();
    }

    public void OLrzqt() {
        this.aKErDB.removeAllViews();
        ArrayList<String> arrayList = this.gasjUx;
        this.DTwDnp = arrayList == null ? this.iZzfmt.getAdapter().getCount() : arrayList.size();
        for (int i = 0; i < this.DTwDnp; i++) {
            View viewInflate = View.inflate(this.gEmmrt, this.zLjUOn, null);
            ArrayList<String> arrayList2 = this.gasjUx;
            String pageTitle = arrayList2 == null ? this.iZzfmt.getAdapter().getPageTitle(i) : arrayList2.get(i);
            if (pageTitle == null) {
                return;
            }
            EZpvd(i, pageTitle.toString(), viewInflate);
        }
        EZpvd();
        KWHzl();
    }

    public void AEQbTJ(String str) {
        View viewInflate = View.inflate(this.gEmmrt, this.zLjUOn, null);
        if (this.gasjUx == null) {
            this.gasjUx = new ArrayList<>();
        }
        this.gasjUx.add(str);
        ArrayList<String> arrayList = this.gasjUx;
        EZpvd(this.DTwDnp, (arrayList == null ? this.iZzfmt.getAdapter().getPageTitle(this.DTwDnp) : arrayList.get(this.DTwDnp)).toString(), viewInflate);
        ArrayList<String> arrayList2 = this.gasjUx;
        this.DTwDnp = arrayList2 == null ? this.iZzfmt.getAdapter().getCount() : arrayList2.size();
        KWHzl();
    }

    private void EZpvd(int i, final String str, View view) {
        LinearLayout.LayoutParams layoutParams;
        TextView textView = (TextView) view.findViewById(C32113mPz.FragmentManager.hBpjJd);
        if (textView != null) {
            if (str != null) {
                textView.setText(str);
                if (KWHzl) {
                    view.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.okinc.core.widget.OKSlidingTabLayout.4
                        @Override // android.view.View.OnLongClickListener
                        public boolean onLongClick(View view2) {
                            ((ClipboardManager) OKSlidingTabLayout.this.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, str));
                            C55328xhq.OLrzqt.AEQbTJ("Copy key:" + str, OKSlidingTabLayout.this.getContext().getDrawable(C52761wXj.TaskDescription.FYtjSf), 0, null, 0, 0);
                            return false;
                        }
                    });
                }
            }
            if (this.QKVWgx) {
                textView.setBackgroundResource(C32113mPz.TaskDescription.OLrzqt);
            }
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.core.widget.OKSlidingTabLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                int iIndexOfChild = OKSlidingTabLayout.this.aKErDB.indexOfChild(view2);
                if (iIndexOfChild != -1) {
                    if (OKSlidingTabLayout.this.iZzfmt != null && OKSlidingTabLayout.this.iZzfmt.getCurrentItem() != iIndexOfChild) {
                        if (OKSlidingTabLayout.this.QOLQEE) {
                            OKSlidingTabLayout.this.iZzfmt.setCurrentItem(iIndexOfChild, false);
                        } else {
                            OKSlidingTabLayout.this.iZzfmt.setCurrentItem(iIndexOfChild);
                        }
                        if (OKSlidingTabLayout.this.AwvSrB != null) {
                            OKSlidingTabLayout.this.AwvSrB.OLrzqt(iIndexOfChild);
                            return;
                        }
                        return;
                    }
                    if (OKSlidingTabLayout.this.AwvSrB != null) {
                        OKSlidingTabLayout.this.AwvSrB.KWHzl(iIndexOfChild);
                    }
                }
            }
        });
        if (this.RJOkX) {
            layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        } else {
            layoutParams = new LinearLayout.LayoutParams(-2, -1);
        }
        if (this.dNCPSb > 0.0f) {
            layoutParams = new LinearLayout.LayoutParams((int) this.dNCPSb, -1);
        }
        this.aKErDB.addView(view, i, layoutParams);
    }

    public final void EZpvd() {
        int i;
        if (this.QfsBiF) {
            int i2 = 0;
            if (this.DTwDnp < 4) {
                while (i2 < this.DTwDnp) {
                    View childAt = this.aKErDB.getChildAt(i2);
                    childAt.findViewById(C32113mPz.FragmentManager.DTwDnp).setLayoutParams(new RelativeLayout.LayoutParams(-2, -1));
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                    if (i2 == 0) {
                        layoutParams.leftMargin = AEQbTJ(16.0f);
                    }
                    layoutParams.rightMargin = AEQbTJ(20.0f);
                    i2++;
                }
                return;
            }
            float measuredWidth = getMeasuredWidth();
            if (measuredWidth <= 0.0f) {
                return;
            }
            int i3 = 0;
            while (true) {
                i = this.DTwDnp;
                if (i3 >= i) {
                    break;
                }
                TextView textView = (TextView) this.aKErDB.getChildAt(i3).findViewById(C32113mPz.FragmentManager.hBpjJd);
                textView.setTextSize(0, this.dvKsVJ);
                measuredWidth -= textView.getPaint().measureText(textView.getText().toString());
                i3++;
            }
            if (i != 1) {
                measuredWidth /= i - 1;
                if (measuredWidth <= AEQbTJ(24.0f)) {
                    measuredWidth = AEQbTJ(24.0f);
                }
            }
            while (i2 < this.DTwDnp) {
                View childAt2 = this.aKErDB.getChildAt(i2);
                childAt2.findViewById(C32113mPz.FragmentManager.DTwDnp).setLayoutParams(new RelativeLayout.LayoutParams(-2, -1));
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
                if (i2 == 0) {
                    layoutParams2.leftMargin = AEQbTJ(16.0f);
                }
                if (i2 == this.DTwDnp - 1) {
                    layoutParams2.rightMargin = AEQbTJ(16.0f);
                } else {
                    layoutParams2.rightMargin = (int) measuredWidth;
                }
                i2++;
            }
        }
    }

    public void KWHzl() {
        Typeface typefaceKWHzl;
        int i = 0;
        while (i < this.DTwDnp) {
            try {
                View childAt = this.aKErDB.getChildAt(i);
                TextView textView = (TextView) childAt.findViewById(C32113mPz.FragmentManager.hBpjJd);
                if (textView != null) {
                    textView.setTextColor(i == this.AhwBna ? this.fZBcTu : this.dxcTrN);
                    if (this.OLrzqt) {
                        if (this.valueOf) {
                            childAt.setBackgroundColor(this.gEmmrt.getResources().getColor(C52761wXj.Activity.EZpvd));
                        } else {
                            childAt.setBackgroundColor(this.gEmmrt.getResources().getColor(C32113mPz.ActionBar.QbewEr));
                        }
                    }
                    textView.setTextSize(0, this.dvKsVJ);
                    TextView textView2 = (TextView) childAt.findViewById(C32113mPz.FragmentManager.dHguZz);
                    if (this.QfsBiF) {
                        this.finit = AEQbTJ;
                        textView.setPaddingRelative(0, 0, 0, 0);
                    } else {
                        float f = AEQbTJ;
                        float f2 = this.QUSxYX;
                        this.finit = (int) (f - f2);
                        int i2 = (int) f2;
                        textView.setPaddingRelative(i2, 0, i2, 0);
                    }
                    if (textView2 != null) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView2.getLayoutParams();
                        layoutParams.leftMargin = this.finit;
                        textView2.setLayoutParams(layoutParams);
                    }
                    if (this.RcXXUw) {
                        textView.setText(textView.getText().toString().toUpperCase());
                    }
                    boolean z = true;
                    if (this.UeEOUB == 1) {
                        textView.getPaint().setFakeBoldText(i == this.AhwBna);
                    }
                    int i3 = this.UeEOUB;
                    if (i3 == 2) {
                        textView.getPaint().setFakeBoldText(true);
                    } else if (i3 == 0) {
                        textView.getPaint().setFakeBoldText(false);
                    }
                    int i4 = this.djSkpj;
                    if (i4 != -1 && (typefaceKWHzl = C55051xce.OLrzqt.KWHzl(i4)) != null) {
                        textView.setTypeface(typefaceKWHzl);
                    }
                    if (this.QKVWgx) {
                        if (i != this.AhwBna) {
                            z = false;
                        }
                        textView.setSelected(z);
                    }
                }
                i++;
            } catch (Exception e) {
                Log.getStackTraceString(e);
                return;
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        if (this.hUfVAv) {
            this.hUfVAv = false;
            return;
        }
        this.AhwBna = i;
        this.AYXKKw = f;
        EZpvd();
        valueOf();
        invalidate();
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        KWHzl(i);
        TaskDescription taskDescription = this.zuBGHE;
        if (taskDescription != null) {
            taskDescription.KWHzl(i);
        }
    }

    private void valueOf() {
        int left;
        int width;
        if (this.DTwDnp <= 0) {
            return;
        }
        int width2 = (int) (this.AYXKKw * this.aKErDB.getChildAt(this.AhwBna).getWidth());
        if (C55296xhK.AEQbTJ(this)) {
            left = this.aKErDB.getChildAt(this.AhwBna).getRight() - width2;
        } else {
            left = this.aKErDB.getChildAt(this.AhwBna).getLeft() + width2;
        }
        if (this.AhwBna > 0 || width2 > 0) {
            if (C55296xhK.AEQbTJ(this)) {
                width = left + (((-getWidth()) / 2) - getPaddingStart());
            } else {
                width = left - ((getWidth() / 2) - getPaddingStart());
            }
            AYXKKw();
            if (C55296xhK.AEQbTJ(this)) {
                Rect rect = this.QVAiDq;
                left = width - ((rect.right - rect.left) / 2);
            } else {
                Rect rect2 = this.QVAiDq;
                left = width + ((rect2.right - rect2.left) / 2);
            }
        }
        if (this.QfsBiF && this.AhwBna == 0) {
            left = 0;
        }
        if (left != this.AuCTelauCTel) {
            this.AuCTelauCTel = left;
            scrollTo(left, 0);
        }
    }

    private void KWHzl(int i) {
        Typeface typefaceKWHzl;
        int i2 = 0;
        while (i2 < this.DTwDnp) {
            try {
                View childAt = this.aKErDB.getChildAt(i2);
                boolean z = i2 == i;
                TextView textView = (TextView) childAt.findViewById(C32113mPz.FragmentManager.hBpjJd);
                if (textView != null) {
                    if (this.OLrzqt) {
                        if (this.valueOf) {
                            childAt.setBackgroundColor(this.gEmmrt.getResources().getColor(C52761wXj.Activity.EZpvd));
                        } else {
                            childAt.setBackgroundColor(this.gEmmrt.getResources().getColor(C32113mPz.ActionBar.QbewEr));
                        }
                    }
                    textView.setTextColor(z ? this.fZBcTu : this.dxcTrN);
                    if (this.UeEOUB == 1) {
                        textView.getPaint().setFakeBoldText(z);
                    }
                    int i3 = this.djSkpj;
                    if (i3 != -1 && (typefaceKWHzl = C55051xce.OLrzqt.KWHzl(i3)) != null) {
                        textView.setTypeface(typefaceKWHzl);
                    }
                    if (this.QKVWgx) {
                        textView.setSelected(z);
                    }
                }
                i2++;
            } catch (Exception e) {
                Log.getStackTraceString(e);
                return;
            }
        }
    }

    private void AYXKKw() {
        View childAt = this.aKErDB.getChildAt(this.AhwBna);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        if (this.EZpvd) {
            float width = this.AYXKKw * childAt.getWidth();
            Rect rect = this.uzCIH;
            rect.left = (int) (left + width);
            rect.right = (int) (right + width);
            return;
        }
        if (this.iwGUEr == 0 && this.AubY) {
            TextView textView = (TextView) childAt.findViewById(C32113mPz.FragmentManager.hBpjJd);
            this.fFgQHt.setTextSize(this.dvKsVJ);
            this.iRxXKY = ((right - left) - this.fFgQHt.measureText(textView.getText().toString())) / 2.0f;
        }
        int i = this.AhwBna;
        if (i < this.DTwDnp - 1) {
            View childAt2 = this.aKErDB.getChildAt(i + 1);
            float left2 = childAt2.getLeft();
            float right2 = childAt2.getRight();
            float f = this.AYXKKw;
            left += (left2 - left) * f;
            right += f * (right2 - right);
            if (this.iwGUEr == 0 && this.AubY) {
                TextView textView2 = (TextView) childAt2.findViewById(C32113mPz.FragmentManager.hBpjJd);
                this.fFgQHt.setTextSize(this.dvKsVJ);
                float fMeasureText = ((right2 - left2) - this.fFgQHt.measureText(textView2.getText().toString())) / 2.0f;
                float f2 = this.iRxXKY;
                this.iRxXKY = f2 + (this.AYXKKw * (fMeasureText - f2));
            }
        }
        Rect rect2 = this.uzCIH;
        int i2 = (int) left;
        rect2.left = i2;
        int i3 = (int) right;
        rect2.right = i3;
        if (this.iwGUEr == 0 && this.AubY) {
            float f3 = this.iRxXKY;
            rect2.left = (int) ((left + f3) - 1.0f);
            rect2.right = (int) ((right - f3) - 1.0f);
        }
        Rect rect3 = this.QVAiDq;
        rect3.left = i2;
        rect3.right = i3;
        if (this.wlaJM < 0.0f) {
            return;
        }
        float left3 = childAt.getLeft() + ((childAt.getWidth() - this.wlaJM) / 2.0f);
        if (this.AhwBna < this.DTwDnp - 1) {
            left3 += this.AYXKKw * ((childAt.getWidth() / 2) + (this.aKErDB.getChildAt(r2 + 1).getWidth() / 2));
        }
        Rect rect4 = this.uzCIH;
        int i4 = (int) left3;
        rect4.left = i4;
        rect4.right = (int) (i4 + this.wlaJM);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (isInEditMode() || this.DTwDnp <= 0) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        float f = this.isConnected;
        if (f > 0.0f) {
            this.AkhnZx.setStrokeWidth(f);
            this.AkhnZx.setColor(this.djBIcL);
            for (int i = 0; i < this.DTwDnp - 1; i++) {
                View childAt = this.aKErDB.getChildAt(i);
                canvas.drawLine(childAt.getRight() + paddingLeft, this.fetchVPNInfo, childAt.getRight() + paddingLeft, height - this.fetchVPNInfo, this.AkhnZx);
            }
        }
        if (this.gkJEwt > 0.0f) {
            this.AxsJAY.setColor(this.gGvvIC);
            if (this.flVtFt == 80) {
                float f2 = height;
                canvas.drawRect(paddingLeft, f2 - this.gkJEwt, this.aKErDB.getWidth() + paddingLeft, f2, this.AxsJAY);
            } else {
                canvas.drawRect(paddingLeft, 0.0f, this.aKErDB.getWidth() + paddingLeft, this.gkJEwt, this.AxsJAY);
            }
        }
        AYXKKw();
        int i2 = this.iwGUEr;
        if (i2 == 1) {
            if (this.fJNWhG > 0.0f) {
                this.giSNqX.setColor(this.DbNXlk);
                this.fvQaOB.reset();
                float f3 = height;
                this.fvQaOB.moveTo(this.uzCIH.left + paddingLeft, f3);
                Path path = this.fvQaOB;
                Rect rect = this.uzCIH;
                path.lineTo((rect.left / 2) + paddingLeft + (rect.right / 2), f3 - this.fJNWhG);
                this.fvQaOB.lineTo(paddingLeft + this.uzCIH.right, f3);
                this.fvQaOB.close();
                canvas.drawPath(this.fvQaOB, this.giSNqX);
                return;
            }
            return;
        }
        if (i2 == 3) {
            this.gHZMYf.setColor(this.DbNXlk);
            this.sSMYrx.reset();
            float strokeWidth = this.gHZMYf.getStrokeWidth();
            float bottom = (getBottom() - getTop()) / 2.0f;
            float f4 = (int) (this.fJNWhG / 2.0f);
            float f5 = bottom - f4;
            this.sSMYrx.moveTo(this.uzCIH.left + paddingLeft + strokeWidth, f5);
            this.sSMYrx.lineTo((this.uzCIH.right + paddingLeft) - strokeWidth, f5);
            float f6 = bottom + f4;
            this.sSMYrx.lineTo((this.uzCIH.right + paddingLeft) - strokeWidth, f6);
            this.sSMYrx.lineTo(paddingLeft + this.uzCIH.left + strokeWidth, f6);
            this.sSMYrx.close();
            canvas.drawPath(this.sSMYrx, this.gHZMYf);
            return;
        }
        if (i2 == 2) {
            if (this.fJNWhG < 0.0f) {
                this.fJNWhG = (height - this.hDKMBd) - this.fARcdN;
            }
            float f7 = this.fJNWhG;
            if (f7 > 0.0f) {
                float f8 = this.AuCTel;
                if (f8 < 0.0f || f8 > f7 / 2.0f) {
                    this.AuCTel = f7 / 2.0f;
                }
                this.ejfBZ.setColor(this.DbNXlk);
                GradientDrawable gradientDrawable = this.ejfBZ;
                int i3 = (int) this.getNewProxyInstance;
                int i4 = this.uzCIH.left;
                float f9 = this.hDKMBd;
                gradientDrawable.setBounds(i3 + paddingLeft + i4, (int) f9, (int) ((paddingLeft + r2.right) - this.getFieldNames), (int) (f9 + this.fJNWhG));
                this.ejfBZ.setCornerRadius(this.AuCTel);
                this.ejfBZ.draw(canvas);
                return;
            }
            return;
        }
        if (this.fJNWhG > 0.0f) {
            this.ejfBZ.setColor(this.DbNXlk);
            if (this.fIwbmz == 80) {
                GradientDrawable gradientDrawable2 = this.ejfBZ;
                int i5 = (int) this.getNewProxyInstance;
                Rect rect2 = this.uzCIH;
                int i6 = i5 + paddingLeft + rect2.left;
                int i7 = height - ((int) this.fJNWhG);
                int i8 = (int) this.fARcdN;
                gradientDrawable2.setBounds(i6, i7 - i8, (paddingLeft + rect2.right) - ((int) this.getFieldNames), height - i8);
            } else {
                GradientDrawable gradientDrawable3 = this.ejfBZ;
                int i9 = (int) this.getNewProxyInstance;
                Rect rect3 = this.uzCIH;
                int i10 = i9 + paddingLeft + rect3.left;
                int i11 = (int) this.hDKMBd;
                gradientDrawable3.setBounds(i10, i11, (paddingLeft + rect3.right) - ((int) this.getFieldNames), ((int) this.fJNWhG) + i11);
            }
            this.ejfBZ.setCornerRadius(this.AuCTel);
            this.ejfBZ.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getLeftFadingEdgeStrength() {
        int i = this.values;
        if (i == 0 || i == 1) {
            return super.getLeftFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getRightFadingEdgeStrength() {
        int i = this.values;
        if (i == 0 || i == 2) {
            return super.getRightFadingEdgeStrength();
        }
        return 0.0f;
    }

    public void setCurrentTab(int i) {
        this.AhwBna = i;
        ViewPager viewPager = this.iZzfmt;
        if (viewPager == null) {
            KWHzl(i);
        } else {
            viewPager.setCurrentItem(i);
        }
    }

    public void setCurrentTab(int i, boolean z) {
        this.AhwBna = i;
        ViewPager viewPager = this.iZzfmt;
        if (viewPager == null) {
            KWHzl(i);
        } else {
            viewPager.setCurrentItem(i, z);
        }
    }

    public void setIndicatorStyle(int i) {
        this.iwGUEr = i;
        invalidate();
    }

    public void setTabPadding(float f) {
        this.QUSxYX = AEQbTJ(f);
        KWHzl();
    }

    public void setTabPaddingPX(float f) {
        this.QUSxYX = f;
        KWHzl();
    }

    public void setTabSpaceEqual(boolean z) {
        this.RJOkX = z;
        KWHzl();
    }

    public void setTabWidth(float f) {
        this.dNCPSb = AEQbTJ(f);
        KWHzl();
    }

    public void setIndicatorColor(int i) {
        this.DbNXlk = i;
        invalidate();
    }

    public void setIndicatorHeight(float f) {
        this.fJNWhG = AEQbTJ(f);
        invalidate();
    }

    public void setIndicatorStrokeWidth(float f) {
        this.gHZMYf.setStrokeWidth(AEQbTJ(f));
        invalidate();
    }

    public void setIndicatorWidth(float f) {
        this.wlaJM = AEQbTJ(f);
        invalidate();
    }

    public void setIndicatorCornerRadius(float f) {
        this.AuCTel = AEQbTJ(f);
        if (this.iwGUEr == 3) {
            this.gHZMYf.setPathEffect(new CornerPathEffect(this.AuCTel));
        }
        invalidate();
    }

    public void setIndicatorGravity(int i) {
        this.fIwbmz = i;
        invalidate();
    }

    public void setIndicatorMargin(float f, float f2, float f3, float f4) {
        this.getNewProxyInstance = AEQbTJ(f);
        this.hDKMBd = AEQbTJ(f2);
        this.getFieldNames = AEQbTJ(f3);
        this.fARcdN = AEQbTJ(f4);
        invalidate();
    }

    public void setIndicatorWidthEqualTitle(boolean z) {
        this.AubY = z;
        invalidate();
    }

    public void setUnderlineColor(int i) {
        this.gGvvIC = i;
        invalidate();
    }

    public void setUnderlineHeight(float f) {
        this.gkJEwt = AEQbTJ(f);
        invalidate();
    }

    public void setUnderlineGravity(int i) {
        this.flVtFt = i;
        invalidate();
    }

    public void setDividerColor(int i) {
        this.djBIcL = i;
        invalidate();
    }

    public void setDividerWidth(float f) {
        this.isConnected = AEQbTJ(f);
        invalidate();
    }

    public void setDividerPadding(float f) {
        this.fetchVPNInfo = AEQbTJ(f);
        invalidate();
    }

    public void setTextsize(float f) {
        this.dvKsVJ = copydefault(f);
        KWHzl();
    }

    public void setTextSelectColor(int i, int i2) {
        try {
            this.fZBcTu = i2;
            View childAt = this.aKErDB.getChildAt(i);
            TextView textView = (TextView) childAt.findViewById(C32113mPz.FragmentManager.hBpjJd);
            if (this.OLrzqt) {
                if (this.valueOf) {
                    childAt.setBackgroundColor(this.gEmmrt.getResources().getColor(C52761wXj.Activity.EZpvd));
                } else {
                    childAt.setBackgroundColor(this.gEmmrt.getResources().getColor(C32113mPz.ActionBar.QbewEr));
                }
            }
            textView.setTextColor(i2);
        } catch (Exception e) {
            Log.getStackTraceString(e);
        }
    }

    public void setTextUnselectColor(int i) {
        this.dxcTrN = i;
        KWHzl();
    }

    public void setTextBold(int i) {
        this.UeEOUB = i;
        KWHzl();
    }

    public void setTextAllCaps(boolean z) {
        this.RcXXUw = z;
        KWHzl();
    }

    public TextView AEQbTJ(int i) {
        return (TextView) this.aKErDB.getChildAt(i).findViewById(C32113mPz.FragmentManager.hBpjJd);
    }

    public TextView EZpvd(int i) {
        return (TextView) this.aKErDB.getChildAt(i).findViewById(C32113mPz.FragmentManager.dHguZz);
    }

    /* JADX INFO: loaded from: classes15.dex */
    public class ActionBar extends FragmentPagerAdapter {
        public String[] EZpvd;
        public ArrayList<Fragment> OLrzqt;

        @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            return -2;
        }

        public ActionBar(FragmentManager fragmentManager, ArrayList<Fragment> arrayList, String[] strArr) {
            super(fragmentManager);
            new ArrayList();
            this.OLrzqt = arrayList;
            this.EZpvd = strArr;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.OLrzqt.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int i) {
            return this.EZpvd[i];
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            return this.OLrzqt.get(i);
        }
    }

    public int AEQbTJ(float f) {
        return (int) ((f * this.gEmmrt.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public int copydefault(float f) {
        return (int) ((f * this.gEmmrt.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public void copydefault(int i, boolean z) {
        if (i >= this.aKErDB.getChildCount() || i < 0) {
            return;
        }
        this.aKErDB.getChildAt(i).findViewById(C32113mPz.FragmentManager.zLjUOn).setVisibility(z ? 0 : 8);
    }

    public View OLrzqt(int i) {
        if (i < this.aKErDB.getChildCount()) {
            return this.aKErDB.getChildAt(i).findViewById(C32113mPz.FragmentManager.UeEOUB);
        }
        return null;
    }
}
