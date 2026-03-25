package o;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter;
import com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerLayout;
import com.immomo.mls.fun.ud.view.recycler.UDCollectionLayout;
import com.okinc.annual.view.UDGrowthRecyclerView;
import o.C28102kOz;
import o.C52761wXj;
import o.InterfaceC7383aim;

/* JADX INFO: renamed from: o.axS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8156axS<A extends UDBaseRecyclerAdapter, L extends UDBaseRecyclerLayout> extends C7812aqr implements InterfaceC7384ain<UDGrowthRecyclerView>, InterfaceC7474akX, InterfaceC7554aly, InterfaceC57903yrG, InterfaceC7468akR {
    public boolean AEQbTJ;
    public InterfaceC7550alu AYXKKw;
    public final InterfaceC7949atV AhwBna;
    public InterfaceC7383aim.ActionBar EZpvd;
    public boolean KWHzl;
    public boolean OLrzqt;
    public float copydefault;
    public C7499akw djBIcL;
    public final C8155axR gEmmrt;
    public final UDGrowthRecyclerView isConnected;
    public C33546myW valueOf;

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
    public C33546myW AkhnZx() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    /* JADX INFO: renamed from: DbNXlk, reason: merged with bridge method [inline-methods] */
    public UDGrowthRecyclerView getUserdata() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7474akX
    public boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7474akX
    public RecyclerView KWHzl() {
        return this.gEmmrt;
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
        this.EZpvd = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewpager(boolean z) {
        this.AEQbTJ = z;
    }

    public C8156axS(android.content.Context context, UDGrowthRecyclerView uDGrowthRecyclerView, boolean z, boolean z2) {
        super(context);
        this.KWHzl = false;
        this.OLrzqt = false;
        this.AEQbTJ = false;
        this.isConnected = uDGrowthRecyclerView;
        C8155axR c8155axR = (C8155axR) android.view.LayoutInflater.from(context).inflate(C28102kOz.Activity.OLrzqt, (android.view.ViewGroup) null);
        this.gEmmrt = c8155axR;
        InterfaceC7949atV interfaceC7949atVAEQbTJ = C7323ahf.gEmmrt().AEQbTJ(context, c8155axR);
        this.AhwBna = interfaceC7949atVAEQbTJ;
        c8155axR.setLoadViewDelegete(interfaceC7949atVAEQbTJ);
        c8155axR.setOnLoadListener(this);
        c8155axR.setCycleCallback(uDGrowthRecyclerView);
        c8155axR.setClipToPadding(false);
        uDGrowthRecyclerView.EZpvd(interfaceC7949atVAEQbTJ);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(c8155axR, C7823arB.AEQbTJ());
        setRefreshEnable(z);
        setLoadEnable(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC7383aim.ActionBar actionBar = this.EZpvd;
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
        if (z && this.valueOf == null) {
            C33546myW c33546myW = new C33546myW(getContext());
            this.valueOf = c33546myW;
            c33546myW.KWHzl(this.copydefault);
            this.valueOf.OLrzqt(this);
            removeAllViews();
            addView(this.valueOf, C7823arB.AEQbTJ());
            if (this.gEmmrt.getParent() != null && (this.gEmmrt.getParent() instanceof android.view.ViewGroup)) {
                ((android.view.ViewGroup) this.gEmmrt.getParent()).removeView(this.gEmmrt);
            }
            this.valueOf.EZpvd(this.gEmmrt);
            this.valueOf.AEQbTJ(new C33603mza(getContext()));
        }
    }

    @Override // o.InterfaceC7474akX
    public boolean gEmmrt() {
        return isEnabled();
    }

    @Override // o.InterfaceC7474akX
    public void isConnected() {
        this.isConnected.KWHzl(false);
        C33546myW c33546myW = this.valueOf;
        if (c33546myW != null) {
            c33546myW.AhwBna();
        }
    }

    @Override // o.InterfaceC7474akX
    public void fetchVPNInfo() {
        C33546myW c33546myW = this.valueOf;
        if (c33546myW != null) {
            c33546myW.AEQbTJ();
        }
        if (this.OLrzqt) {
            this.OLrzqt = false;
        } else {
            this.AhwBna.EZpvd(this.KWHzl);
        }
    }

    @Override // o.InterfaceC7474akX
    public void setLoadEnable(boolean z) {
        if (this.KWHzl == z) {
            return;
        }
        this.KWHzl = z;
        this.AhwBna.EZpvd(z);
    }

    @Override // o.InterfaceC7474akX
    public void values() {
        this.OLrzqt = false;
        ((InterfaceC7948atU) this.AhwBna.copydefault()).AhwBna();
    }

    @Override // o.InterfaceC7474akX
    public void AhwBna() {
        this.AhwBna.AYXKKw();
    }

    @Override // o.InterfaceC7474akX
    public void valueOf() {
        this.AhwBna.valueOf();
    }

    @Override // o.InterfaceC7474akX
    public void djBIcL() {
        this.OLrzqt = false;
        this.AhwBna.EZpvd();
    }

    @Override // o.InterfaceC7554aly
    public void getFieldNames() {
        if (this.OLrzqt) {
            return;
        }
        this.OLrzqt = true;
        this.isConnected.OLrzqt();
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
        FrameLayout.LayoutParams layoutParamsEZpvd = EZpvd((FrameLayout.LayoutParams) layoutParams);
        layoutParamsEZpvd.setMargins(activity.DbNXlk, activity.AkhnZx, activity.isConnected, activity.AYXKKw);
        return layoutParamsEZpvd;
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

    @Override // o.InterfaceC7468akR
    public void EZpvd(float f, float f2) {
        UDCollectionLayout uDCollectionLayout = (UDCollectionLayout) this.isConnected.valueOf();
        GridLayoutManager gridLayoutManager = (GridLayoutManager) KWHzl().getLayoutManager();
        KWHzl().scrollBy(C7865arr.copydefault(f) - C7507alD.KWHzl(gridLayoutManager, uDCollectionLayout), C7865arr.copydefault(f2) - C7507alD.AEQbTJ(gridLayoutManager, uDCollectionLayout));
    }

    @Override // o.InterfaceC7468akR
    public float[] OLrzqt() {
        UDCollectionLayout uDCollectionLayout = (UDCollectionLayout) this.isConnected.valueOf();
        GridLayoutManager gridLayoutManager = (GridLayoutManager) KWHzl().getLayoutManager();
        return new float[]{C7865arr.AEQbTJ(C7507alD.KWHzl(gridLayoutManager, uDCollectionLayout)), C7865arr.AEQbTJ(C7507alD.AEQbTJ(gridLayoutManager, uDCollectionLayout))};
    }

    private FrameLayout.LayoutParams EZpvd(FrameLayout.LayoutParams layoutParams) {
        return layoutParams == null ? (FrameLayout.LayoutParams) new ViewGroup.MarginLayoutParams(-2, -2) : layoutParams;
    }

    @Override // o.InterfaceC57903yrG
    public void copydefault(@androidx.annotation.NonNull InterfaceC57934yrl interfaceC57934yrl) {
        this.AhwBna.EZpvd(false);
        this.isConnected.AYXKKw();
    }

    @Override // o.InterfaceC7474akX
    public void setLottieJson(java.lang.String str, int i, int i2) {
        C7499akw c7499akw = this.djBIcL;
        if (c7499akw != null) {
            c7499akw.setLottieJson(getUserdata().zuBGHE(), str, i, i2);
        }
    }

    @Override // o.InterfaceC7474akX
    public void setMaterialHeader() {
        if (this.valueOf != null) {
            C57860yqQ c57860yqQ = new C57860yqQ(getContext());
            c57860yqQ.EZpvd(C7329ahl.OLrzqt());
            this.valueOf.AEQbTJ(c57860yqQ);
        }
    }

    @Override // o.InterfaceC7474akX
    public void setOKXLiteHeader() {
        if (this.valueOf != null) {
            this.valueOf.AEQbTJ(new C33603mza(getContext()));
        }
    }

    @Override // o.InterfaceC7474akX
    public void setOKXLightHeader() {
        if (this.valueOf != null) {
            C33603mza c33603mza = new C33603mza(getContext());
            java.io.InputStream inputStreamOLrzqt = C7823arB.OLrzqt("finance_refresh_loading_light_v6240.json", this.isConnected.zuBGHE());
            if (inputStreamOLrzqt != null) {
                c33603mza.OLrzqt.copydefault().setAnimation(inputStreamOLrzqt, "finance_refresh_loading_light_v6240.json");
                c33603mza.OLrzqt.AEQbTJ().setTextColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.HJWChP));
            }
            this.valueOf.AEQbTJ(c33603mza);
        }
    }

    @Override // o.InterfaceC7474akX
    public void setNFTManyChainHeader() {
        if (this.valueOf == null || this.djBIcL != null) {
            return;
        }
        C7499akw c7499akw = new C7499akw(getContext());
        this.djBIcL = c7499akw;
        c7499akw.copydefault().setLayoutParams(C7823arB.OLrzqt());
        this.valueOf.AEQbTJ(this.djBIcL);
        if ("".equals(C7823arB.copydefault)) {
            return;
        }
        setLottieJson(C7823arB.copydefault, C7823arB.AEQbTJ, C7823arB.EZpvd);
    }
}
