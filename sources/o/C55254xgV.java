package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xgV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55254xgV extends android.widget.RelativeLayout implements InterfaceC55066xct {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public android.view.View AEQbTJ;
    public int AYXKKw;
    public final C54962xav EZpvd;
    public boolean KWHzl;
    public boolean copydefault;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55254xgV(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55254xgV(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.view.View EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.ActionBar.DcqEDu int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:42) call: o.xgV.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55254xgV(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.ActionBar.DcqEDu : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55254xgV(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C54962xav c54962xavOLrzqt = C54962xav.OLrzqt(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c54962xavOLrzqt, "");
        this.EZpvd = c54962xavOLrzqt;
        this.AYXKKw = 5;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.SFHvfSaKzXkR);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            C55247xgO c55247xgO = c54962xavOLrzqt.OLrzqt;
            c55247xgO.setHasIndicator$OKUILib_uilib(typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.ScLVFT, true));
            c55247xgO.setTabSize$OKUILib_uilib(typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.sQOHWT, 44));
            setOkdsTabGravity(typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.DtA, 0));
            this.AYXKKw = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.SdSTJp, 5);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.hBORwR, -1);
            if (resourceId != -1) {
                setExtraView(android.view.LayoutInflater.from(context).inflate(resourceId, (android.view.ViewGroup) this, false));
            }
            if (typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.hCiIDQ, 0) == 0 && typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.ikcuIV, 0) == 0 && typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.haRtnV, 0) == 0 && typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.zagaMW, 0) == 0 && typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.dXhJGx, 0) == 0 && typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.fruYXx, 0) == 0) {
                int iEZpvd = new C52771wXt(context).EZpvd() - C55298xhM.OLrzqt(12, context);
                C55247xgO c55247xgO2 = c54962xavOLrzqt.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c55247xgO2, "");
                c55247xgO2.setPaddingRelative(iEZpvd, c55247xgO2.getPaddingTop(), iEZpvd, c55247xgO2.getPaddingBottom());
            }
            c54962xavOLrzqt.OLrzqt.setClipToPadding(false);
            typedArrayObtainStyledAttributes.recycle();
            setStyle(this.AYXKKw);
            C55247xgO c55247xgO3 = c54962xavOLrzqt.OLrzqt;
            c55247xgO3.KWHzl(c55247xgO3.djBIcL());
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void setExtraView(android.view.View view) {
        this.AEQbTJ = view;
        C55247xgO c55247xgO = this.EZpvd.OLrzqt;
        android.graphics.drawable.Drawable drawableViewToDrawable$default = null;
        if (view != null) {
            Intrinsics.copydefault(view);
            drawableViewToDrawable$default = C55296xhK.viewToDrawable$default(view, 0, 0, 3, null);
        }
        c55247xgO.setExtraViewDrawable$OKUILib_uilib(drawableViewToDrawable$default);
    }

    public final void setAlwaysShowExtraView(boolean z) {
        this.copydefault = z;
        this.EZpvd.OLrzqt.setAlwaysShowExtraView$OKUILib_uilib(z);
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: o.xgU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C55254xgV.KWHzl(this.KWHzl);
            }
        });
    }

    public static final void KWHzl(C55254xgV c55254xgV) {
        c55254xgV.setOKDSSize(c55254xgV.OLrzqt());
    }

    public void setOkdsTabGravity(int i) {
        this.valueOf = i;
        this.EZpvd.OLrzqt.setTabMode(i == 0 ? 0 : 1);
        this.EZpvd.OLrzqt.setTabGravity(i);
    }

    public int OLrzqt() {
        return this.EZpvd.OLrzqt.djBIcL();
    }

    @Override // o.InterfaceC55066xct
    public void setOKDSSize(int i) {
        this.EZpvd.OLrzqt.setOKDSSize(i);
    }

    public void setOKDSIndicator(boolean z) {
        this.EZpvd.OLrzqt.setOKDSIndicator(z);
    }

    public boolean AhwBna() {
        return this.EZpvd.OLrzqt.gEmmrt();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iDjBIcL = this.EZpvd.OLrzqt.djBIcL();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(C55298xhM.OLrzqt(iDjBIcL, context), 1073741824));
    }

    public final TabLayout.Tab gEmmrt() {
        return this.EZpvd.OLrzqt.newTab();
    }

    public final void EZpvd(@NotNull TabLayout.Tab tab) {
        Intrinsics.checkNotNullParameter(tab, "");
        this.EZpvd.OLrzqt.addTab(tab);
    }

    public final void OLrzqt(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.EZpvd.AEQbTJ.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        int iDjBIcL = this.EZpvd.OLrzqt.djBIcL();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        layoutParams.height = C55298xhM.OLrzqt(iDjBIcL, context);
        if (this.EZpvd.AEQbTJ.getChildCount() > 0) {
            C55296xhK.OLrzqt(view, java.lang.Float.valueOf(12.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f));
        }
        view.setLayoutParams(layoutParams);
        setGravity(15);
        this.EZpvd.AEQbTJ.addView(view);
    }

    public final android.widget.LinearLayout KWHzl() {
        android.widget.LinearLayout linearLayout = this.EZpvd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        return linearLayout;
    }

    public final TabLayout copydefault() {
        C55247xgO c55247xgO = this.EZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55247xgO, "");
        return c55247xgO;
    }

    public static /* synthetic */ TabLayout.Tab updateBadgeCount$default(C55254xgV c55254xgV, TabLayout.Tab tab, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 99;
        }
        return c55254xgV.AEQbTJ(tab, i, i2);
    }

    public final TabLayout.Tab AEQbTJ(@NotNull TabLayout.Tab tab, int i, int i2) {
        Intrinsics.checkNotNullParameter(tab, "");
        return this.EZpvd.OLrzqt.copydefault(tab, i, i2);
    }

    public static /* synthetic */ void updateBadgeCount$default(C55254xgV c55254xgV, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 4) != 0) {
            i3 = 99;
        }
        c55254xgV.EZpvd(i, i2, i3);
    }

    public final void EZpvd(int i, int i2, int i3) {
        this.EZpvd.OLrzqt.EZpvd(i, i2, i3);
    }

    public static /* synthetic */ void setStyle$default(C55254xgV c55254xgV, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 5;
        }
        c55254xgV.setStyle(i);
    }

    public final void setStyle(int i) {
        this.EZpvd.OLrzqt.setStyle$OKUILib_uilib(i);
        this.AYXKKw = i;
        if (i == 6 || i == 7) {
            C55247xgO c55247xgO = this.EZpvd.OLrzqt;
            c55247xgO.setTabTextSize$OKUILib_uilib(c55247xgO.valueOf().copydefault());
            c55247xgO.setTabTextAppearance$OKUILib_uilib(C52761wXj.LoaderManager.gwTjWJ);
            c55247xgO.setTabSize$OKUILib_uilib(44);
            c55247xgO.setTabMode(0);
            c55247xgO.setOKDSIndicator(false);
            c55247xgO.setTabTextColors(c55247xgO.valueOf().KWHzl());
            c55247xgO.setTabIconTint(c55247xgO.valueOf().KWHzl());
            KWHzl(false);
            return;
        }
        C55247xgO c55247xgO2 = this.EZpvd.OLrzqt;
        c55247xgO2.setOKDSIndicator(c55247xgO2.gEmmrt());
        c55247xgO2.setTabTextColors(c55247xgO2.valueOf().KWHzl());
        c55247xgO2.setTabIconTint(c55247xgO2.valueOf().KWHzl());
        KWHzl(true);
    }

    public static /* synthetic */ void showUnderline$default(C55254xgV c55254xgV, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c55254xgV.KWHzl(z);
    }

    public final void KWHzl(boolean z) {
        setUnderline(z);
    }

    public final void setupWithViewPager(ViewPager viewPager) {
        this.EZpvd.OLrzqt.setupWithViewPager(viewPager);
    }

    public final void OLrzqt(TabLayout.BaseOnTabSelectedListener<TabLayout.Tab> baseOnTabSelectedListener) {
        this.EZpvd.OLrzqt.removeOnTabSelectedListener(baseOnTabSelectedListener);
    }

    public final void AEQbTJ(TabLayout.BaseOnTabSelectedListener<TabLayout.Tab> baseOnTabSelectedListener) {
        this.EZpvd.OLrzqt.addOnTabSelectedListener(baseOnTabSelectedListener);
    }

    public final void setSelectedTabIndicatorColor(int i) {
        this.EZpvd.OLrzqt.setSelectedTabIndicatorColor(i);
    }

    public final TabLayout.Tab copydefault(int i) {
        return this.EZpvd.OLrzqt.getTabAt(i);
    }

    public final int AEQbTJ() {
        return this.EZpvd.OLrzqt.getSelectedTabPosition();
    }

    public final void setItemImageAtIndex(android.graphics.drawable.Drawable drawable, int i) {
        TabLayout.Tab tabAt = this.EZpvd.OLrzqt.getTabAt(i);
        if (tabAt != null) {
            tabAt.setIcon(drawable);
        }
    }

    public final void setItemImageAtIndex(@androidx.annotation.DrawableRes int i, int i2) {
        TabLayout.Tab tabAt = this.EZpvd.OLrzqt.getTabAt(i2);
        if (tabAt != null) {
            tabAt.setIcon(i);
        }
    }

    public final void EZpvd(int i, boolean z) {
        android.view.View customView;
        android.view.View viewFindViewById;
        TabLayout.Tab tabAt = this.EZpvd.OLrzqt.getTabAt(i);
        if (tabAt == null || (customView = tabAt.getCustomView()) == null || (viewFindViewById = customView.findViewById(C52761wXj.FragmentManager.DbNXlk)) == null) {
            return;
        }
        viewFindViewById.setVisibility(z ? 0 : 8);
    }

    public static /* synthetic */ void setUnderline$default(C55254xgV c55254xgV, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c55254xgV.setUnderline(z);
    }

    public final void setUnderline(boolean z) {
        this.KWHzl = z;
        this.EZpvd.AYXKKw.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: renamed from: o.xgV$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xgV.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
