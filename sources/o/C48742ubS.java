package o;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter;
import com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerLayout;
import com.okinc.referral.mlnservice.view.UDGalleryLayout;
import com.okinc.referral.mlnservice.view.UDGrowthReferralRecyclerView;
import o.C48824ucv;
import o.C52761wXj;
import o.InterfaceC7383aim;

/* JADX INFO: renamed from: o.ubS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48742ubS<A extends UDBaseRecyclerAdapter, L extends UDBaseRecyclerLayout> extends C7812aqr implements InterfaceC7384ain<UDGrowthReferralRecyclerView>, InterfaceC7474akX, InterfaceC7554aly, InterfaceC57903yrG, InterfaceC7468akR {
    public boolean AEQbTJ;
    public InterfaceC7550alu AYXKKw;
    public C33546myW AhwBna;
    public final UDGrowthReferralRecyclerView DbNXlk;
    public boolean EZpvd;
    public InterfaceC7383aim.ActionBar KWHzl;
    public boolean OLrzqt;
    public float copydefault;
    public final InterfaceC7949atV djBIcL;
    public C7499akw gEmmrt;
    public final C48741ubR valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7474akX
    public boolean AEQbTJ() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC7474akX
    public boolean AYXKKw() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    /* JADX INFO: renamed from: AkhnZx, reason: merged with bridge method [inline-methods] */
    public UDGrowthReferralRecyclerView getUserdata() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7474akX
    public boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7474akX
    public RecyclerView KWHzl() {
        return this.valueOf;
    }

    @Override // o.InterfaceC7384ain
    public ViewGroup.LayoutParams applyChildCenter(ViewGroup.LayoutParams layoutParams, UDView.Activity activity) {
        return layoutParams;
    }

    @Override // o.InterfaceC7384ain
    public void bringSubviewToFront(UDView uDView) {
    }

    @Override // o.InterfaceC7384ain
    public void sendSubviewToBack(UDView uDView) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7474akX
    public void setSizeChangedListener(InterfaceC7550alu interfaceC7550alu) {
        this.AYXKKw = interfaceC7550alu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
        this.KWHzl = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewpager(boolean z) {
        this.AEQbTJ = z;
    }

    public C48742ubS(android.content.Context context, UDGrowthReferralRecyclerView uDGrowthReferralRecyclerView, boolean z, boolean z2) {
        super(context);
        this.EZpvd = false;
        this.OLrzqt = false;
        this.AEQbTJ = false;
        this.DbNXlk = uDGrowthReferralRecyclerView;
        C48741ubR c48741ubR = (C48741ubR) android.view.LayoutInflater.from(context).inflate(C48824ucv.TaskDescription.OLrzqt, (android.view.ViewGroup) null);
        this.valueOf = c48741ubR;
        InterfaceC7949atV interfaceC7949atVAEQbTJ = C7323ahf.gEmmrt().AEQbTJ(context, c48741ubR);
        this.djBIcL = interfaceC7949atVAEQbTJ;
        c48741ubR.setLoadViewDelegete(interfaceC7949atVAEQbTJ);
        c48741ubR.setOnLoadListener(this);
        c48741ubR.setCycleCallback(uDGrowthReferralRecyclerView);
        c48741ubR.setClipToPadding(false);
        uDGrowthReferralRecyclerView.copydefault(interfaceC7949atVAEQbTJ);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(c48741ubR, C7823arB.AEQbTJ());
        setRefreshEnable(z);
        setLoadEnable(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC7383aim.ActionBar actionBar = this.KWHzl;
        if (actionBar != null) {
            actionBar.copydefault();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // o.InterfaceC7474akX
    public void setRefreshEnable(boolean z) {
        if (z && this.AhwBna == null) {
            C33546myW c33546myW = new C33546myW(getContext());
            this.AhwBna = c33546myW;
            c33546myW.KWHzl(this.copydefault);
            this.AhwBna.OLrzqt(this);
            removeAllViews();
            addView(this.AhwBna, C7823arB.AEQbTJ());
            if (this.valueOf.getParent() != null && (this.valueOf.getParent() instanceof android.view.ViewGroup)) {
                ((android.view.ViewGroup) this.valueOf.getParent()).removeView(this.valueOf);
            }
            this.AhwBna.EZpvd(this.valueOf);
            this.AhwBna.AEQbTJ(new C33603mza(getContext()));
        }
    }

    @Override // o.InterfaceC7474akX
    public boolean gEmmrt() {
        return isEnabled();
    }

    @Override // o.InterfaceC7474akX
    public void isConnected() {
        this.DbNXlk.EZpvd(false);
        C33546myW c33546myW = this.AhwBna;
        if (c33546myW != null) {
            c33546myW.AhwBna();
        }
    }

    @Override // o.InterfaceC7474akX
    public void fetchVPNInfo() {
        C33546myW c33546myW = this.AhwBna;
        if (c33546myW != null) {
            c33546myW.AEQbTJ();
        }
        if (this.OLrzqt) {
            this.OLrzqt = false;
        } else {
            this.djBIcL.EZpvd(this.EZpvd);
        }
    }

    @Override // o.InterfaceC7474akX
    public void setLoadEnable(boolean z) {
        if (this.EZpvd == z) {
            return;
        }
        this.EZpvd = z;
        this.djBIcL.EZpvd(z);
    }

    @Override // o.InterfaceC7474akX
    public void values() {
        this.OLrzqt = false;
        ((InterfaceC7948atU) this.djBIcL.copydefault()).AhwBna();
    }

    @Override // o.InterfaceC7474akX
    public void AhwBna() {
        this.djBIcL.AYXKKw();
    }

    @Override // o.InterfaceC7474akX
    public void valueOf() {
        this.djBIcL.valueOf();
    }

    @Override // o.InterfaceC7474akX
    public void djBIcL() {
        this.OLrzqt = false;
        this.djBIcL.EZpvd();
    }

    @Override // o.InterfaceC7554aly
    public void getFieldNames() {
        if (this.OLrzqt) {
            return;
        }
        this.OLrzqt = true;
        this.DbNXlk.OLrzqt();
    }

    @Override // o.C7812aqr, o.C7771aqC, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        InterfaceC7550alu interfaceC7550alu = this.AYXKKw;
        if (interfaceC7550alu != null) {
            interfaceC7550alu.AEQbTJ(i, i2);
        }
    }

    @Override // o.C7771aqC, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getUserdata().OLrzqt(i, i2, i3, i4);
    }

    @Override // o.C7771aqC, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        getUserdata().OLrzqt(i, i2);
    }

    @Override // o.C7812aqr, android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
        getUserdata().OLrzqt(canvas);
    }

    @Override // o.InterfaceC7384ain
    public ViewGroup.LayoutParams applyLayoutParams(ViewGroup.LayoutParams layoutParams, UDView.Activity activity) {
        FrameLayout.LayoutParams layoutParamsCopydefault = copydefault((FrameLayout.LayoutParams) layoutParams);
        layoutParamsCopydefault.setMargins(activity.DbNXlk, activity.AkhnZx, activity.isConnected, activity.AYXKKw);
        return layoutParamsCopydefault;
    }

    @Override // o.InterfaceC7474akX
    public void OLrzqt(C7348aiD c7348aiD) {
        KWHzl().smoothScrollBy(((int) c7348aiD.copydefault()) - KWHzl().computeHorizontalScrollOffset(), ((int) c7348aiD.OLrzqt()) - KWHzl().computeVerticalScrollOffset());
    }

    @Override // o.InterfaceC7474akX
    public void setContentOffset(C7348aiD c7348aiD) {
        KWHzl().scrollBy(((int) c7348aiD.copydefault()) - KWHzl().computeHorizontalScrollOffset(), ((int) c7348aiD.OLrzqt()) - KWHzl().computeVerticalScrollOffset());
    }

    @Override // o.InterfaceC7474akX
    public C7348aiD copydefault() {
        return new C7348aiD(C7865arr.AEQbTJ(KWHzl().computeHorizontalScrollOffset()), C7865arr.AEQbTJ(KWHzl().computeVerticalScrollOffset()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: L */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC7468akR
    public void EZpvd(float f, float f2) {
        UDGalleryLayout uDGalleryLayout = (UDGalleryLayout) this.DbNXlk.valueOf();
        GridLayoutManager gridLayoutManager = (GridLayoutManager) KWHzl().getLayoutManager();
        KWHzl().scrollBy(C7865arr.copydefault(f) - C7507alD.KWHzl(gridLayoutManager, uDGalleryLayout), C7865arr.copydefault(f2) - C7507alD.AEQbTJ(gridLayoutManager, uDGalleryLayout));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: L */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC7468akR
    public float[] OLrzqt() {
        UDGalleryLayout uDGalleryLayout = (UDGalleryLayout) this.DbNXlk.valueOf();
        GridLayoutManager gridLayoutManager = (GridLayoutManager) KWHzl().getLayoutManager();
        return new float[]{C7865arr.AEQbTJ(C7507alD.KWHzl(gridLayoutManager, uDGalleryLayout)), C7865arr.AEQbTJ(C7507alD.AEQbTJ(gridLayoutManager, uDGalleryLayout))};
    }

    private FrameLayout.LayoutParams copydefault(FrameLayout.LayoutParams layoutParams) {
        return layoutParams == null ? (FrameLayout.LayoutParams) new ViewGroup.MarginLayoutParams(-2, -2) : layoutParams;
    }

    @Override // o.InterfaceC57903yrG
    public void copydefault(@androidx.annotation.NonNull InterfaceC57934yrl interfaceC57934yrl) {
        this.djBIcL.EZpvd(false);
        this.DbNXlk.AhwBna();
    }

    @Override // o.InterfaceC7474akX
    public void setLottieJson(java.lang.String str, int i, int i2) {
        C7499akw c7499akw = this.gEmmrt;
        if (c7499akw != null) {
            c7499akw.setLottieJson(getUserdata().zuBGHE(), str, i, i2);
        }
    }

    @Override // o.InterfaceC7474akX
    public void setMaterialHeader() {
        if (this.AhwBna != null) {
            C57860yqQ c57860yqQ = new C57860yqQ(getContext());
            c57860yqQ.EZpvd(C7329ahl.OLrzqt());
            this.AhwBna.AEQbTJ(c57860yqQ);
        }
    }

    @Override // o.InterfaceC7474akX
    public void setOKXLiteHeader() {
        if (this.AhwBna != null) {
            this.AhwBna.AEQbTJ(new C33603mza(getContext()));
        }
    }

    @Override // o.InterfaceC7474akX
    public void setOKXLightHeader() {
        if (this.AhwBna != null) {
            C33603mza c33603mza = new C33603mza(getContext());
            java.io.InputStream inputStreamOLrzqt = C7823arB.OLrzqt("finance_refresh_loading_light_v6240.json", this.DbNXlk.zuBGHE());
            if (inputStreamOLrzqt != null) {
                c33603mza.OLrzqt.copydefault().setAnimation(inputStreamOLrzqt, "finance_refresh_loading_light_v6240.json");
                c33603mza.OLrzqt.AEQbTJ().setTextColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.HJWChP));
            }
            this.AhwBna.AEQbTJ(c33603mza);
        }
    }

    @Override // o.InterfaceC7474akX
    public void setNFTManyChainHeader() {
        if (this.AhwBna == null || this.gEmmrt != null) {
            return;
        }
        C7499akw c7499akw = new C7499akw(getContext());
        this.gEmmrt = c7499akw;
        c7499akw.copydefault().setLayoutParams(C7823arB.OLrzqt());
        this.AhwBna.AEQbTJ(this.gEmmrt);
        if ("".equals(C7823arB.copydefault)) {
            return;
        }
        setLottieJson(C7823arB.copydefault, C7823arB.AEQbTJ, C7823arB.EZpvd);
    }

    public void OLrzqt(float f) {
        this.valueOf.AEQbTJ(f);
    }

    public void setAutoMirrored(boolean z) {
        this.valueOf.setAutoMirrored(z);
    }
}
