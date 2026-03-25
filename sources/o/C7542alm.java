package o;

import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.immomo.mls.fun.ud.view.UDScrollView;
import com.immomo.mls.fun.ud.view.UDView;
import o.C52761wXj;
import o.InterfaceC7383aim;
import o.InterfaceC7475akY;

/* JADX INFO: renamed from: o.alm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7542alm extends C7812aqr implements InterfaceC7475akY<UDScrollView>, InterfaceC57903yrG, InterfaceC7472akV {
    public final UDScrollView AEQbTJ;
    public C7499akw EZpvd;
    public InterfaceC7475akY KWHzl;
    public C33546myW OLrzqt;
    public InterfaceC7383aim.ActionBar copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    /* JADX INFO: renamed from: AhwBna, reason: merged with bridge method [inline-methods] */
    public UDScrollView getUserdata() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
        this.copydefault = actionBar;
    }

    public C7542alm(android.content.Context context, UDScrollView uDScrollView, boolean z, boolean z2, android.util.AttributeSet attributeSet) {
        super(context);
        this.AEQbTJ = uDScrollView;
        if (z) {
            this.KWHzl = new C7547alr(getContext(), uDScrollView, z2, attributeSet);
        } else {
            this.KWHzl = new C7538ali(getContext(), uDScrollView, z2);
        }
        setViewLifeCycleCallback(uDScrollView);
        addView(this.KWHzl.djBIcL(), C7823arB.KWHzl());
    }

    @Override // android.view.View, o.InterfaceC7475akY
    public void setHorizontalScrollBarEnabled(boolean z) {
        super.setHorizontalScrollBarEnabled(z);
        this.KWHzl.setHorizontalScrollBarEnabled(z);
    }

    @Override // android.view.View, o.InterfaceC7475akY
    public void setVerticalScrollBarEnabled(boolean z) {
        super.setVerticalScrollBarEnabled(z);
        this.KWHzl.setVerticalScrollBarEnabled(z);
    }

    @Override // o.InterfaceC7475akY
    public void setBouncesEnabled(boolean z) {
        this.KWHzl.setBouncesEnabled(z);
    }

    @Override // o.InterfaceC7472akV
    public void setLottieJson(java.lang.String str, int i, int i2) {
        C7499akw c7499akw = this.EZpvd;
        if (c7499akw != null) {
            c7499akw.setLottieJson(getUserdata().zuBGHE(), str, i, i2);
        }
    }

    @Override // o.InterfaceC7472akV
    public void setMaterialHeader() {
        C57860yqQ c57860yqQ = new C57860yqQ(getContext());
        c57860yqQ.EZpvd(C7329ahl.OLrzqt());
        C33546myW c33546myW = this.OLrzqt;
        if (c33546myW != null) {
            c33546myW.AEQbTJ(c57860yqQ);
            this.OLrzqt.EZpvd(115.0f);
        }
    }

    @Override // o.InterfaceC7472akV
    public void setOKXLiteHeader() {
        if (this.OLrzqt != null) {
            this.OLrzqt.AEQbTJ(new C33603mza(getContext()));
            this.OLrzqt.EZpvd(115.0f);
        }
    }

    @Override // o.InterfaceC7472akV
    public void setOKXLightHeader() {
        if (this.OLrzqt != null) {
            C33603mza c33603mza = new C33603mza(getContext());
            java.io.InputStream inputStreamOLrzqt = C7823arB.OLrzqt("finance_refresh_loading_light_v6240.json", this.AEQbTJ.zuBGHE());
            if (inputStreamOLrzqt != null) {
                c33603mza.OLrzqt.copydefault().setAnimation(inputStreamOLrzqt, "finance_refresh_loading_light_v6240.json");
                c33603mza.OLrzqt.AEQbTJ().setTextColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.HJWChP));
            }
            this.OLrzqt.AEQbTJ(c33603mza);
        }
    }

    @Override // o.InterfaceC7472akV
    public void setNFTManyChainHeader() {
        if (this.OLrzqt == null || this.EZpvd != null) {
            return;
        }
        C7499akw c7499akw = new C7499akw(getContext());
        this.EZpvd = c7499akw;
        c7499akw.copydefault().setLayoutParams(C7823arB.OLrzqt());
        this.OLrzqt.AEQbTJ(this.EZpvd);
        if ("".equals(C7823arB.copydefault)) {
            return;
        }
        setLottieJson(C7823arB.copydefault, C7823arB.AEQbTJ, C7823arB.EZpvd);
    }

    @Override // o.C7771aqC, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        getUserdata().OLrzqt(i, i2);
    }

    @Override // o.C7771aqC, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getUserdata().OLrzqt(i, i2, i3, i4);
    }

    @Override // o.C7812aqr, android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
        getUserdata().OLrzqt(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC7383aim.ActionBar actionBar = this.copydefault;
        if (actionBar != null) {
            actionBar.copydefault();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC7383aim.ActionBar actionBar = this.copydefault;
        if (actionBar != null) {
            actionBar.AEQbTJ();
        }
    }

    @Override // o.InterfaceC7475akY
    public void setContentSize(C7350aiF c7350aiF) {
        this.KWHzl.setContentSize(c7350aiF);
    }

    @Override // o.InterfaceC7475akY
    public android.view.ViewGroup AYXKKw() {
        return this.KWHzl.AYXKKw();
    }

    @Override // o.InterfaceC7475akY
    public C7350aiF EZpvd() {
        return this.KWHzl.EZpvd();
    }

    @Override // o.InterfaceC7475akY
    public android.view.ViewGroup djBIcL() {
        return this.KWHzl.djBIcL();
    }

    @Override // o.InterfaceC7475akY
    public void setContentOffset(C7348aiD c7348aiD) {
        this.KWHzl.setContentOffset(c7348aiD);
    }

    @Override // o.InterfaceC7475akY
    public void setScrollEnable(boolean z) {
        this.KWHzl.setScrollEnable(z);
    }

    @Override // o.InterfaceC7475akY
    public void setOffsetWithAnim(C7348aiD c7348aiD) {
        this.KWHzl.setOffsetWithAnim(c7348aiD);
    }

    @Override // o.InterfaceC7475akY
    public void setOffsetWithAnim(C7348aiD c7348aiD, int i) {
        this.KWHzl.setOffsetWithAnim(c7348aiD, i);
    }

    @Override // o.InterfaceC7475akY
    public C7348aiD AEQbTJ() {
        return this.KWHzl.AEQbTJ();
    }

    @Override // o.InterfaceC7475akY
    public void setOnScrollListener(InterfaceC7475akY.TaskDescription taskDescription) {
        this.KWHzl.setOnScrollListener(taskDescription);
    }

    @Override // o.InterfaceC7475akY
    public void setTouchActionListener(InterfaceC7475akY.StateListAnimator stateListAnimator) {
        this.KWHzl.setTouchActionListener(stateListAnimator);
    }

    @Override // o.InterfaceC7475akY
    public void setFlingListener(InterfaceC7475akY.ActionBar actionBar) {
        this.KWHzl.setFlingListener(actionBar);
    }

    @Override // o.InterfaceC7384ain
    public void bringSubviewToFront(UDView uDView) {
        this.KWHzl.bringSubviewToFront(uDView);
    }

    @Override // o.InterfaceC7384ain
    public void sendSubviewToBack(UDView uDView) {
        this.KWHzl.sendSubviewToBack(uDView);
    }

    @Override // o.InterfaceC7384ain
    public ViewGroup.LayoutParams applyLayoutParams(ViewGroup.LayoutParams layoutParams, UDView.Activity activity) {
        return this.KWHzl.applyLayoutParams(layoutParams, activity);
    }

    @Override // o.InterfaceC7384ain
    public ViewGroup.LayoutParams applyChildCenter(ViewGroup.LayoutParams layoutParams, UDView.Activity activity) {
        return this.KWHzl.applyChildCenter(layoutParams, activity);
    }

    @Override // o.InterfaceC7475akY
    public void setFlingSpeed(float f) {
        this.KWHzl.setFlingSpeed(f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // o.InterfaceC57903yrG
    public void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
        this.AEQbTJ.OLrzqt();
    }

    @Override // o.InterfaceC7472akV
    public void setRefreshEnable(boolean z) {
        if (z && this.OLrzqt == null) {
            this.OLrzqt = new C33546myW(getContext());
            removeAllViews();
            this.OLrzqt.EZpvd(this.KWHzl.djBIcL());
            addView(this.OLrzqt, C7823arB.KWHzl());
            this.OLrzqt.AEQbTJ(new C33603mza(getContext()));
            this.OLrzqt.OLrzqt(this);
        }
        C33546myW c33546myW = this.OLrzqt;
        if (c33546myW != null) {
            c33546myW.djBIcL(z);
        }
    }

    @Override // o.InterfaceC7472akV
    public boolean OLrzqt() {
        return isEnabled();
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        super.setClipToPadding(z);
        java.lang.Object obj = this.KWHzl;
        if (obj instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) obj).setClipToPadding(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setClipChildren(boolean z) {
        super.setClipChildren(z);
        java.lang.Object obj = this.KWHzl;
        if (obj instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) obj).setClipChildren(z);
        }
    }

    @Override // o.InterfaceC7472akV
    public void copydefault() {
        C33546myW c33546myW = this.OLrzqt;
        if (c33546myW != null) {
            c33546myW.AhwBna();
            copydefault(this.OLrzqt);
        }
    }

    @Override // o.InterfaceC7472akV
    public void KWHzl() {
        C33546myW c33546myW = this.OLrzqt;
        if (c33546myW != null) {
            c33546myW.AEQbTJ();
        }
    }
}
