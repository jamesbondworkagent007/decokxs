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
import com.immomo.mls.fun.ud.view.recycler.UDRecyclerView;
import o.C52761wXj;
import o.C7343ahz;
import o.InterfaceC7383aim;

/* JADX INFO: renamed from: o.aln, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7543aln<A extends UDBaseRecyclerAdapter, L extends UDBaseRecyclerLayout> extends C7812aqr implements InterfaceC7384ain<UDRecyclerView>, InterfaceC7474akX, InterfaceC7554aly, InterfaceC57903yrG, InterfaceC7468akR {
    public float AEQbTJ;
    public final InterfaceC7949atV AYXKKw;
    public C7499akw AhwBna;
    public final UDRecyclerView DbNXlk;
    public boolean EZpvd;
    public InterfaceC7383aim.ActionBar KWHzl;
    public boolean OLrzqt;
    public boolean copydefault;
    public final C7781aqM djBIcL;
    public InterfaceC7550alu gEmmrt;
    public C33546myW valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7474akX
    public boolean AEQbTJ() {
        return this.EZpvd;
    }

    @Override // o.InterfaceC7474akX
    public boolean AYXKKw() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getUserdata()Lcom/immomo/mls/fun/ud/view/UDView; */
    @Override // o.InterfaceC7383aim
    /* JADX INFO: renamed from: AuCTel, reason: merged with bridge method [inline-methods] */
    public UDRecyclerView getUserdata() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C33546myW DbNXlk() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7474akX
    public boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7474akX
    public RecyclerView KWHzl() {
        return this.djBIcL;
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
        this.gEmmrt = interfaceC7550alu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewLifeCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
        this.KWHzl = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setViewpager(boolean z) {
        this.OLrzqt = z;
    }

    public C7543aln(android.content.Context context, UDRecyclerView uDRecyclerView, boolean z, boolean z2) {
        super(context);
        this.copydefault = false;
        this.EZpvd = false;
        this.OLrzqt = false;
        this.DbNXlk = uDRecyclerView;
        C7781aqM c7781aqM = (C7781aqM) android.view.LayoutInflater.from(context).inflate(C7343ahz.Activity.OLrzqt, (android.view.ViewGroup) null);
        this.djBIcL = c7781aqM;
        InterfaceC7949atV interfaceC7949atVAEQbTJ = C7323ahf.gEmmrt().AEQbTJ(context, c7781aqM);
        this.AYXKKw = interfaceC7949atVAEQbTJ;
        c7781aqM.setLoadViewDelegete(interfaceC7949atVAEQbTJ);
        c7781aqM.setOnLoadListener(this);
        c7781aqM.setCycleCallback(uDRecyclerView);
        c7781aqM.setClipToPadding(false);
        uDRecyclerView.copydefault(interfaceC7949atVAEQbTJ);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(c7781aqM, C7823arB.AEQbTJ());
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
        C33546myW c33546myW = this.valueOf;
        if (c33546myW != null) {
            c33546myW.djBIcL(z);
            return;
        }
        if (z) {
            C33546myW c33546myW2 = new C33546myW(getContext());
            this.valueOf = c33546myW2;
            c33546myW2.KWHzl(this.AEQbTJ);
            this.valueOf.OLrzqt(this);
            removeAllViews();
            addView(this.valueOf, C7823arB.AEQbTJ());
            if (this.djBIcL.getParent() != null && (this.djBIcL.getParent() instanceof android.view.ViewGroup)) {
                ((android.view.ViewGroup) this.djBIcL.getParent()).removeView(this.djBIcL);
            }
            this.valueOf.EZpvd(this.djBIcL);
            this.valueOf.AEQbTJ(new C33603mza(getContext()));
        }
    }

    @Override // o.InterfaceC7474akX
    public boolean gEmmrt() {
        return isEnabled();
    }

    @Override // o.InterfaceC7474akX
    public void isConnected() {
        this.DbNXlk.EZpvd(false);
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
        if (this.EZpvd) {
            this.EZpvd = false;
        } else {
            this.AYXKKw.EZpvd(this.copydefault);
        }
    }

    @Override // o.InterfaceC7474akX
    public void setLoadEnable(boolean z) {
        if (this.copydefault == z) {
            return;
        }
        this.copydefault = z;
        this.AYXKKw.EZpvd(z);
    }

    @Override // o.InterfaceC7474akX
    public void values() {
        this.EZpvd = false;
        ((InterfaceC7948atU) this.AYXKKw.copydefault()).AhwBna();
    }

    @Override // o.InterfaceC7474akX
    public void AhwBna() {
        this.AYXKKw.AYXKKw();
    }

    @Override // o.InterfaceC7474akX
    public void valueOf() {
        this.AYXKKw.valueOf();
    }

    @Override // o.InterfaceC7474akX
    public void djBIcL() {
        this.EZpvd = false;
        this.AYXKKw.EZpvd();
    }

    @Override // o.InterfaceC7554aly
    public void getFieldNames() {
        if (this.EZpvd) {
            return;
        }
        this.EZpvd = true;
        this.DbNXlk.OLrzqt();
    }

    @Override // o.C7812aqr, o.C7771aqC, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        InterfaceC7550alu interfaceC7550alu = this.gEmmrt;
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
        FrameLayout.LayoutParams layoutParamsKWHzl = KWHzl((FrameLayout.LayoutParams) layoutParams);
        C7460akJ.OLrzqt(layoutParamsKWHzl, activity.DbNXlk, activity.AkhnZx, activity.isConnected, activity.AYXKKw);
        return layoutParamsKWHzl;
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
        UDCollectionLayout uDCollectionLayout = (UDCollectionLayout) this.DbNXlk.valueOf();
        GridLayoutManager gridLayoutManager = (GridLayoutManager) KWHzl().getLayoutManager();
        KWHzl().scrollBy(C7865arr.copydefault(f) - C7507alD.KWHzl(gridLayoutManager, uDCollectionLayout), C7865arr.copydefault(f2) - C7507alD.AEQbTJ(gridLayoutManager, uDCollectionLayout));
    }

    @Override // o.InterfaceC7468akR
    public float[] OLrzqt() {
        UDCollectionLayout uDCollectionLayout = (UDCollectionLayout) this.DbNXlk.valueOf();
        GridLayoutManager gridLayoutManager = (GridLayoutManager) KWHzl().getLayoutManager();
        return new float[]{C7865arr.AEQbTJ(C7507alD.KWHzl(gridLayoutManager, uDCollectionLayout)), C7865arr.AEQbTJ(C7507alD.AEQbTJ(gridLayoutManager, uDCollectionLayout))};
    }

    public final FrameLayout.LayoutParams KWHzl(FrameLayout.LayoutParams layoutParams) {
        return layoutParams == null ? (FrameLayout.LayoutParams) new ViewGroup.MarginLayoutParams(-2, -2) : layoutParams;
    }

    @Override // o.InterfaceC57903yrG
    public void copydefault(@androidx.annotation.NonNull InterfaceC57934yrl interfaceC57934yrl) {
        this.AYXKKw.EZpvd(false);
        this.DbNXlk.AhwBna();
    }

    @Override // o.InterfaceC7474akX
    public void setLottieJson(java.lang.String str, int i, int i2) {
        C7499akw c7499akw = this.AhwBna;
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
            java.io.InputStream inputStreamOLrzqt = C7823arB.OLrzqt("finance_refresh_loading_light_v6240.json", this.DbNXlk.zuBGHE());
            if (inputStreamOLrzqt != null) {
                c33603mza.OLrzqt.copydefault().setAnimation(inputStreamOLrzqt, "finance_refresh_loading_light_v6240.json");
                c33603mza.OLrzqt.AEQbTJ().setTextColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.HJWChP));
            }
            this.valueOf.AEQbTJ(c33603mza);
        }
    }

    @Override // o.InterfaceC7474akX
    public void setNFTManyChainHeader() {
        if (this.valueOf == null || this.AhwBna != null) {
            return;
        }
        C7499akw c7499akw = new C7499akw(getContext());
        this.AhwBna = c7499akw;
        c7499akw.copydefault().setLayoutParams(C7823arB.OLrzqt());
        this.valueOf.AEQbTJ(this.AhwBna);
        if ("".equals(C7823arB.copydefault)) {
            return;
        }
        setLottieJson(C7823arB.copydefault, C7823arB.AEQbTJ, C7823arB.EZpvd);
    }

    public void AkhnZx() {
        C7354aiJ c7354aiJ;
        C7362aiR c7362aiRAEQbTJ;
        for (int i = 0; i < this.djBIcL.getChildCount(); i++) {
            android.view.View childAt = this.djBIcL.getChildAt(i);
            if ((this.djBIcL.getChildViewHolder(childAt) instanceof C7354aiJ) && (c7354aiJ = (C7354aiJ) this.djBIcL.getChildViewHolder(childAt)) != null && (c7362aiRAEQbTJ = c7354aiJ.AEQbTJ()) != null) {
                c7354aiJ.itemView.setOnClickListener(null);
                c7354aiJ.itemView.setOnLongClickListener(null);
                c7362aiRAEQbTJ.EZpvd();
            }
        }
    }
}
