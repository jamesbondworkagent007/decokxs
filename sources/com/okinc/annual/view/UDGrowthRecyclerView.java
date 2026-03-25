package com.okinc.annual.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.camera.video.AudioStats;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.immomo.mls.fun.ud.UDArray;
import com.immomo.mls.fun.ud.UDPoint;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ud.view.UDViewGroup;
import com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter;
import com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerLayout;
import java.util.ArrayList;
import java.util.List;
import o.C43246rlf;
import o.C7326ahi;
import o.C7348aiD;
import o.C7353aiI;
import o.C7354aiJ;
import o.C7393aiw;
import o.C7454akD;
import o.C7500akx;
import o.C7781aqM;
import o.C7833arL;
import o.C7840arS;
import o.C7865arr;
import o.C8155axR;
import o.C8156axS;
import o.InterfaceC60044zuT;
import o.InterfaceC7408ajK;
import o.InterfaceC7451akA;
import o.InterfaceC7468akR;
import o.InterfaceC7473akW;
import o.InterfaceC7474akX;
import o.InterfaceC7550alu;
import o.InterfaceC7554aly;
import o.InterfaceC7949atV;
import o.InterfaceC8006aua;
import org.luaj.vm2.LuaBoolean;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDGrowthRecyclerView<T extends ViewGroup & InterfaceC7474akX & InterfaceC7554aly, A extends UDBaseRecyclerAdapter, L extends UDBaseRecyclerLayout> extends UDViewGroup<T> implements InterfaceC7550alu {
    public float AYXKKw;
    public float AhwBna;
    public LuaValue[] AkhnZx;
    public boolean AuCTel;
    public boolean AuCTelauCTel;
    public int AubY;
    public boolean AxsJAY;
    public float DbNXlk;
    public float EZpvd;
    public LuaFunction KWHzl;
    public A copydefault;
    public float djBIcL;
    public RecyclerView.OnScrollListener ejfBZ;
    public boolean fARcdN;
    public RecyclerView.LayoutManager fIwbmz;
    public boolean fJNWhG;
    public boolean fetchVPNInfo;
    public List<View> gEmmrt;
    public int getFieldNames;
    public C7500akx getNewProxyInstance;
    public LuaFunction hDKMBd;
    public InterfaceC7949atV isConnected;
    public LuaFunction iwGUEr;
    public LuaFunction uzCIH;
    public L valueOf;
    public LuaFunction values;
    public LuaFunction wlaJM;
    public LuaFunction zLjUOn;
    public int zsXlph;
    public static final String[] OLrzqt = {"OKGrowthAnnualBillTableView"};
    public static final String[] AEQbTJ = {"refreshEnable", "loadEnable", "scrollDirection", "loadThreshold", "openReuseCell", "reloadData", "setScrollEnable", "reloadAtRow", "invalidHeightAtRow", "reloadAtSection", "showScrollIndicator", "scrollToTop", "scrollToCell", "insertCellAtRow", "insertRow", "deleteCellAtRow", "deleteRow", "isRefreshing", "startRefreshing", "stopRefreshing", "isLoading", "stopLoading", "noMoreData", "resetLoading", "loadError", "adapter", TtmlNode.TAG_LAYOUT, "setRefreshingCallback", "setLoadingCallback", "setScrollingCallback", "setScrollBeginCallback", "setScrollEndCallback", "setEndDraggingCallback", "setStartDeceleratingCallback", "insertCellsAtSection", "insertRowsAtSection", "deleteRowsAtSection", "deleteCellsAtSection", "addHeaderView", "removeHeaderView", "setContentInset", "getContentInset", "useAllSpanForLoading", "getRecycledViewNum", "isStartPosition", "cellWithSectionRow", "visibleCells", "scrollEnabled", "setOffsetWithAnim", "contentOffset", "disallowFling", "pagerContentOffset", "i_bounces", "i_pagingEnabled", "setRefreshHeaderOffset", "setLottieJson", "setMaterialHeader", "setNFTManyChainHeader", "addItemDecorationDrawListener", "setOKXLiteHeader", "setOKXLightHeader", "pauseImageRequestsOnFling", "animationConfig", "getSysDensity", "setSlideMode", "getRvCurrentIndex"};

    private int copydefault(int i) {
        return i == 0 ? 1 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(InterfaceC7949atV interfaceC7949atV) {
        this.isConnected = interfaceC7949atV;
    }

    @InterfaceC60044zuT
    public LuaValue[] i_bounces(LuaValue[] luaValueArr) {
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] i_pagingEnabled(LuaValue[] luaValueArr) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public L valueOf() {
        return this.valueOf;
    }

    @InterfaceC60044zuT
    public UDGrowthRecyclerView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.getFieldNames = 1;
        this.AuCTelauCTel = false;
        this.AxsJAY = true;
        this.DbNXlk = 0.0f;
        this.EZpvd = Float.MIN_VALUE;
        this.AYXKKw = 0.0f;
        this.AhwBna = 0.0f;
        this.djBIcL = Float.MIN_VALUE;
        this.fetchVPNInfo = false;
        this.ejfBZ = new RecyclerView.OnScrollListener() { // from class: com.okinc.annual.view.UDGrowthRecyclerView.1
            public boolean copydefault;
            public boolean OLrzqt = false;
            public boolean KWHzl = false;

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (this.KWHzl && i != 1 && UDGrowthRecyclerView.this.KWHzl != null) {
                    KWHzl(UDGrowthRecyclerView.this.KWHzl, false);
                }
                this.KWHzl = i == 1;
                if (i == 0) {
                    this.copydefault = false;
                    this.OLrzqt = false;
                    if (UDGrowthRecyclerView.this.wlaJM != null) {
                        EZpvd(UDGrowthRecyclerView.this.wlaJM, EZpvd().position);
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    this.copydefault = true;
                }
                if (this.OLrzqt) {
                    return;
                }
                this.OLrzqt = true;
                if (UDGrowthRecyclerView.this.hDKMBd != null) {
                    EZpvd(UDGrowthRecyclerView.this.hDKMBd);
                }
            }

            public final SCROLL_TO_POSITION EZpvd() {
                SCROLL_TO_POSITION scroll_to_position = SCROLL_TO_POSITION.SCROLL_TO_OTHER;
                if (UDGrowthRecyclerView.this.AhwBna().canScrollVertically(1)) {
                    return !UDGrowthRecyclerView.this.AhwBna().canScrollVertically(-1) ? SCROLL_TO_POSITION.SCROLL_TO_TOP : scroll_to_position;
                }
                return SCROLL_TO_POSITION.SCROLL_TO_BOTTOM;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                if (UDGrowthRecyclerView.this.fetchVPNInfo) {
                    UDGrowthRecyclerView.this.fetchVPNInfo = false;
                } else if (UDGrowthRecyclerView.this.iwGUEr != null) {
                    OLrzqt(UDGrowthRecyclerView.this.iwGUEr, i, i2);
                }
                if (this.copydefault && UDGrowthRecyclerView.this.zLjUOn != null) {
                    EZpvd(UDGrowthRecyclerView.this.zLjUOn);
                }
                this.copydefault = false;
            }

            private void EZpvd(LuaFunction luaFunction, int i) {
                luaFunction.invoke(LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.AEQbTJ(UDGrowthRecyclerView.this.AhwBna().computeHorizontalScrollOffset())), LuaNumber.copydefault(C7865arr.AEQbTJ(UDGrowthRecyclerView.this.AhwBna().computeVerticalScrollOffset())), LuaNumber.valueOf(i)));
            }

            private void EZpvd(LuaFunction luaFunction) {
                luaFunction.invoke(LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.AEQbTJ(UDGrowthRecyclerView.this.AhwBna().computeHorizontalScrollOffset())), LuaNumber.copydefault(C7865arr.AEQbTJ(UDGrowthRecyclerView.this.AhwBna().computeVerticalScrollOffset()))));
            }

            private void OLrzqt(LuaFunction luaFunction, int i, int i2) {
                luaFunction.invoke(LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.AEQbTJ(i)), LuaNumber.copydefault(C7865arr.AEQbTJ(i2))));
            }

            private void KWHzl(LuaFunction luaFunction, boolean z) {
                float fComputeHorizontalScrollOffset = UDGrowthRecyclerView.this.AhwBna().computeHorizontalScrollOffset();
                float fComputeVerticalScrollOffset = UDGrowthRecyclerView.this.AhwBna().computeVerticalScrollOffset();
                LuaValue[] luaValueArr2 = new LuaValue[3];
                luaValueArr2[0] = LuaNumber.copydefault(C7865arr.AEQbTJ(fComputeHorizontalScrollOffset));
                luaValueArr2[1] = LuaNumber.copydefault(C7865arr.AEQbTJ(fComputeVerticalScrollOffset));
                luaValueArr2[2] = z ? LuaValue.True() : LuaValue.False();
                luaFunction.invoke(LuaValue.varargsOf(luaValueArr2));
            }
        };
        this.fARcdN = true;
        ((InterfaceC7474akX) ((ViewGroup) this.dHguZz)).setSizeChangedListener(this);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup, com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: EZpvd */
    public T AEQbTJ(LuaValue[] luaValueArr) {
        if (luaValueArr.length > 0) {
            this.AuCTel = luaValueArr[0].toBoolean();
        }
        boolean z = luaValueArr.length > 1 ? luaValueArr[1].toBoolean() : false;
        boolean z2 = luaValueArr.length > 2 ? luaValueArr[2].toBoolean() : false;
        C8156axS c8156axS = new C8156axS(AubY(), this, this.AuCTel, z);
        c8156axS.setViewpager(z2);
        return c8156axS;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    public RecyclerView AhwBna() {
        return ((InterfaceC7474akX) ((ViewGroup) f_())).KWHzl();
    }

    @Override // com.immomo.mls.fun.ud.view.UDView, o.InterfaceC7383aim.ActionBar
    public void copydefault() {
        super.copydefault();
        this.fetchVPNInfo = true;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    @InterfaceC60044zuT
    public LuaValue[] clipToBounds(LuaValue[] luaValueArr) {
        boolean z = luaValueArr[0].toBoolean();
        ((ViewGroup) this.dHguZz).setClipToPadding(z);
        ((ViewGroup) this.dHguZz).setClipChildren(z);
        ((InterfaceC7474akX) ((ViewGroup) this.dHguZz)).KWHzl().setClipToPadding(z);
        ((InterfaceC7474akX) ((ViewGroup) this.dHguZz)).KWHzl().setClipChildren(z);
        V v = this.dHguZz;
        if (!(v instanceof InterfaceC7408ajK)) {
            return null;
        }
        ((InterfaceC7408ajK) v).forceClipLevel(z ? 1 : 2);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] refreshEnable(LuaValue[] luaValueArr) {
        if (luaValueArr.length > 0) {
            this.AuCTel = luaValueArr[0].toBoolean();
            ((InterfaceC7474akX) ((ViewGroup) f_())).setRefreshEnable(this.AuCTel);
            return null;
        }
        return LuaValue.rBoolean(((InterfaceC7474akX) ((ViewGroup) f_())).gEmmrt());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] loadEnable(LuaValue[] luaValueArr) {
        if (luaValueArr.length > 0) {
            boolean z = luaValueArr[0].toBoolean();
            ((InterfaceC7474akX) ((ViewGroup) f_())).setLoadEnable(z);
            if (!(AhwBna().getAdapter() instanceof C7393aiw)) {
                return null;
            }
            ((C7393aiw) AhwBna().getAdapter()).AEQbTJ(z);
            return null;
        }
        return LuaValue.rBoolean(((InterfaceC7474akX) ((ViewGroup) f_())).EZpvd());
    }

    @InterfaceC60044zuT
    public LuaValue[] scrollDirection(LuaValue[] luaValueArr) {
        L l;
        if (luaValueArr.length <= 0) {
            return LuaValue.varargsOf(LuaNumber.valueOf(copydefault(this.getFieldNames)));
        }
        int iCopydefault = copydefault(luaValueArr[0].toInt());
        boolean z = this.getFieldNames != iCopydefault;
        this.getFieldNames = iCopydefault;
        if (z && this.copydefault != null && (l = this.valueOf) != null) {
            l.AEQbTJ(iCopydefault);
            if (this.valueOf instanceof InterfaceC7451akA) {
                AEQbTJ(AhwBna());
                AhwBna().addItemDecoration(this.valueOf.KWHzl());
            }
        }
        OLrzqt(AhwBna().getLayoutManager());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] loadThreshold(LuaValue[] luaValueArr) {
        if (luaValueArr.length <= 0) {
            return LuaValue.varargsOf(LuaNumber.copydefault(this.DbNXlk));
        }
        this.DbNXlk = (float) luaValueArr[0].toDouble();
        ((C7781aqM) AhwBna()).setLoadThreshold(this.DbNXlk);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] addItemDecorationDrawListener(LuaValue[] luaValueArr) {
        C7353aiI c7353aiI;
        L l = this.valueOf;
        if (l != null && (c7353aiI = (C7353aiI) l.KWHzl()) != null) {
            c7353aiI.EZpvd(new C7353aiI.TaskDescription() { // from class: o.aya
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.C7353aiI.TaskDescription
                public final void AEQbTJ() {
                    this.AEQbTJ.values();
                }
            });
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void values() {
        RecyclerView recyclerViewAhwBna = AhwBna();
        if (recyclerViewAhwBna == null) {
            return;
        }
        ViewParent parent = recyclerViewAhwBna.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            coordinatorLayout.dispatchDependentViewsChanged(coordinatorLayout.getChildAt(0));
        } else {
            if (parent == null) {
                return;
            }
            ViewParent parent2 = parent.getParent();
            if (parent2 instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout2 = (CoordinatorLayout) parent2;
                coordinatorLayout2.dispatchDependentViewsChanged(coordinatorLayout2.getChildAt(1));
            }
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] openReuseCell(LuaValue[] luaValueArr) {
        if (luaValueArr.length > 0) {
            boolean z = luaValueArr[0].toBoolean();
            this.fJNWhG = z;
            if (z) {
                this.getNewProxyInstance = C7500akx.AEQbTJ(getGlobals());
                AhwBna().setRecycledViewPool(this.getNewProxyInstance.copydefault());
                A a2 = this.copydefault;
                if (a2 != null) {
                    RecyclerView.LayoutManager layoutManagerFetchVPNInfo = a2.fetchVPNInfo();
                    if (layoutManagerFetchVPNInfo instanceof LinearLayoutManager) {
                        ((LinearLayoutManager) layoutManagerFetchVPNInfo).setRecycleChildrenOnDetach(true);
                    }
                    this.copydefault.EZpvd(this.getNewProxyInstance.AEQbTJ());
                }
            } else {
                this.getNewProxyInstance = null;
                A a3 = this.copydefault;
                if (a3 != null) {
                    a3.EZpvd(null);
                }
            }
            return null;
        }
        return LuaValue.rBoolean(this.fJNWhG);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setOffsetWithAnim(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return null;
        }
        UDPoint uDPoint = (UDPoint) luaValueArr[0];
        ((InterfaceC7474akX) ((ViewGroup) f_())).OLrzqt(uDPoint.EZpvd());
        uDPoint.destroy();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] contentOffset(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return LuaValue.varargsOf(new UDPoint(this.globals, ((InterfaceC7474akX) ((ViewGroup) f_())).copydefault()));
        }
        ((InterfaceC7474akX) ((ViewGroup) f_())).setContentOffset(((UDPoint) luaValueArr[0]).EZpvd());
        luaValueArr[0].destroy();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] pagerContentOffset(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 2) {
            V v = this.dHguZz;
            if (!(v instanceof InterfaceC7468akR)) {
                return null;
            }
            ((InterfaceC7468akR) v).EZpvd(luaValueArr[0].toFloat(), luaValueArr[1].toFloat());
            return null;
        }
        V v2 = this.dHguZz;
        if (v2 instanceof InterfaceC7468akR) {
            float[] fArrOLrzqt = ((InterfaceC7468akR) v2).OLrzqt();
            return LuaValue.varargsOf(LuaNumber.copydefault(fArrOLrzqt[0]), LuaNumber.copydefault(fArrOLrzqt[1]));
        }
        return LuaValue.rNil();
    }

    @InterfaceC60044zuT
    public LuaValue[] reloadData(LuaValue[] luaValueArr) {
        A a2 = this.copydefault;
        if (a2 == null) {
            return null;
        }
        a2.hDKMBd();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setScrollEnable(LuaValue[] luaValueArr) {
        EZpvd(luaValueArr[0].toBoolean());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    private void EZpvd(boolean z) {
        this.fARcdN = z;
        Object obj = this.fIwbmz;
        if (obj instanceof InterfaceC7473akW) {
            ((InterfaceC7473akW) obj).KWHzl(z);
        }
        ((InterfaceC7474akX) ((ViewGroup) f_())).setRefreshEnable(this.fARcdN && this.AuCTel);
    }

    @InterfaceC60044zuT
    public LuaValue[] reloadAtRow(LuaValue[] luaValueArr) {
        A a2;
        if (luaValueArr.length != 3 || (a2 = this.copydefault) == null) {
            return null;
        }
        a2.EZpvd(luaValueArr[1].toInt() - 1, luaValueArr[0].toInt() - 1, luaValueArr[2].toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] invalidHeightAtRow(LuaValue[] luaValueArr) {
        A a2;
        if (luaValueArr.length <= 1 || (a2 = this.copydefault) == null) {
            return null;
        }
        a2.AEQbTJ(luaValueArr[1].toInt() - 1, luaValueArr[0].toInt() - 1);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] reloadAtSection(LuaValue[] luaValueArr) {
        A a2;
        if (luaValueArr.length != 2 || (a2 = this.copydefault) == null) {
            return null;
        }
        a2.AEQbTJ(luaValueArr[0].toInt() - 1, luaValueArr[1].toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] showScrollIndicator(LuaValue[] luaValueArr) {
        if (luaValueArr.length >= 1) {
            boolean z = luaValueArr[0].toBoolean();
            AhwBna().setVerticalScrollBarEnabled(z);
            AhwBna().setHorizontalScrollBarEnabled(z);
            return null;
        }
        return LuaValue.varargsOf(LuaBoolean.AEQbTJ(this.getFieldNames == 1 ? AhwBna().isVerticalScrollBarEnabled() : AhwBna().isHorizontalScrollBarEnabled()));
    }

    @InterfaceC60044zuT
    public LuaValue[] scrollToTop(LuaValue[] luaValueArr) {
        boolean z = luaValueArr.length >= 1 ? luaValueArr[0].toBoolean() : false;
        if (!this.fARcdN) {
            return null;
        }
        KWHzl(z);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] scrollToCell(LuaValue[] luaValueArr) {
        A a2 = this.copydefault;
        if (a2 == null || luaValueArr.length < 2 || !this.fARcdN) {
            return null;
        }
        int iCopydefault = a2.copydefault(luaValueArr[1].toInt() - 1, luaValueArr[0].toInt() - 1);
        RecyclerView recyclerViewAhwBna = AhwBna();
        if ((recyclerViewAhwBna instanceof C7781aqM) && luaValueArr.length >= 3) {
            ((C7781aqM) recyclerViewAhwBna).AEQbTJ(!luaValueArr[2].toBoolean(), iCopydefault + this.copydefault.gEmmrt().KWHzl());
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] insertCellAtRow(LuaValue[] luaValueArr) {
        A a2 = this.copydefault;
        if (a2 == null) {
            return null;
        }
        a2.copydefault(false);
        this.copydefault.OLrzqt(luaValueArr[1].toInt() - 1, luaValueArr[0].toInt() - 1);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] insertRow(LuaValue[] luaValueArr) {
        if (this.copydefault == null || luaValueArr.length < 2) {
            return null;
        }
        this.copydefault.KWHzl(luaValueArr[1].toInt() - 1, luaValueArr[0].toInt() - 1, luaValueArr.length >= 3 ? luaValueArr[2].toBoolean() : false);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] deleteCellAtRow(LuaValue[] luaValueArr) {
        A a2 = this.copydefault;
        if (a2 == null) {
            return null;
        }
        a2.copydefault(false);
        this.copydefault.EZpvd(luaValueArr[1].toInt() - 1, luaValueArr[0].toInt() - 1);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] deleteRow(LuaValue[] luaValueArr) {
        if (this.copydefault == null || luaValueArr.length < 2) {
            return null;
        }
        this.copydefault.AEQbTJ(luaValueArr[1].toInt() - 1, luaValueArr[0].toInt() - 1, luaValueArr.length >= 3 ? luaValueArr[2].toBoolean() : false);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isRefreshing(LuaValue[] luaValueArr) {
        return LuaValue.rBoolean(((InterfaceC7474akX) ((ViewGroup) f_())).AYXKKw());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] startRefreshing(LuaValue[] luaValueArr) {
        ((InterfaceC7474akX) ((ViewGroup) f_())).isConnected();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] stopRefreshing(LuaValue[] luaValueArr) {
        ((InterfaceC7474akX) ((ViewGroup) f_())).fetchVPNInfo();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isLoading(LuaValue[] luaValueArr) {
        return LuaValue.rBoolean(((InterfaceC7474akX) ((ViewGroup) f_())).AEQbTJ());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] stopLoading(LuaValue[] luaValueArr) {
        ((InterfaceC7474akX) ((ViewGroup) f_())).values();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] noMoreData(LuaValue[] luaValueArr) {
        ((InterfaceC7474akX) ((ViewGroup) f_())).AhwBna();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] resetLoading(LuaValue[] luaValueArr) {
        ((InterfaceC7474akX) ((ViewGroup) f_())).valueOf();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] loadError(LuaValue[] luaValueArr) {
        ((InterfaceC7474akX) ((ViewGroup) f_())).djBIcL();
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] adapter(LuaValue[] luaValueArr) {
        if (luaValueArr.length <= 0) {
            LuaValue[] luaValueArr2 = new LuaValue[1];
            LuaValue luaValueNil = this.copydefault;
            if (luaValueNil == null) {
                luaValueNil = LuaValue.Nil();
            }
            luaValueArr2[0] = luaValueNil;
            return LuaValue.varargsOf(luaValueArr2);
        }
        LuaValue luaValue = luaValueArr[0];
        if (luaValue == null || !luaValue.isUserdata()) {
            return null;
        }
        final UDBaseRecyclerAdapter uDBaseRecyclerAdapter = (UDBaseRecyclerAdapter) luaValue.toUserdata();
        C7840arS.KWHzl(new Runnable() { // from class: com.okinc.annual.view.UDGrowthRecyclerView.2
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.annual.view.UDGrowthRecyclerView */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                UDGrowthRecyclerView.this.OLrzqt(uDBaseRecyclerAdapter);
            }
        });
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: com.immomo.mls.fun.ud.view.recycler.UDBaseNeedHeightAdapter */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View] */
    @InterfaceC60044zuT
    public LuaValue[] layout(LuaValue[] luaValueArr) {
        LuaValue[] luaValueArr2;
        if (luaValueArr.length <= 0) {
            LuaValue[] luaValueArr3 = new LuaValue[1];
            LuaValue luaValueNil = this.valueOf;
            if (luaValueNil == null) {
                luaValueNil = LuaValue.Nil();
            }
            luaValueArr3[0] = luaValueNil;
            return LuaValue.varargsOf(luaValueArr3);
        }
        LuaValue luaValue = luaValueArr[0];
        if (luaValue == null || !luaValue.isUserdata()) {
            return null;
        }
        L l = (L) luaValue.toUserdata();
        A a2 = this.copydefault;
        if (a2 != 0) {
            a2.AEQbTJ(l, f_());
        }
        if ((l instanceof InterfaceC7451akA) && (luaValueArr2 = this.AkhnZx) != null) {
            ((InterfaceC7451akA) l).layoutInset(luaValueArr2);
        }
        this.valueOf = l;
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setRefreshingCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.uzCIH;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        LuaValue luaValue = luaValueArr[0];
        if (luaValue == null || !luaValue.isFunction()) {
            return null;
        }
        this.uzCIH = luaValue.toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setLoadingCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.values;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        LuaValue luaValue = luaValueArr[0];
        if (luaValue == null || !luaValue.isFunction()) {
            return null;
        }
        this.values = luaValue.toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setScrollingCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.iwGUEr;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        LuaValue luaValue = luaValueArr[0];
        if (luaValue == null || !luaValue.isFunction()) {
            return null;
        }
        LuaFunction luaFunction2 = luaValue.toLuaFunction();
        this.iwGUEr = luaFunction2;
        if (luaFunction2 == null || this.AuCTelauCTel) {
            return null;
        }
        AhwBna().addOnScrollListener(this.ejfBZ);
        this.AuCTelauCTel = true;
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setScrollBeginCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.hDKMBd;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        LuaValue luaValue = luaValueArr[0];
        if (luaValue == null || !luaValue.isFunction()) {
            return null;
        }
        LuaFunction luaFunction2 = luaValue.toLuaFunction();
        this.hDKMBd = luaFunction2;
        if (luaFunction2 == null || this.AuCTelauCTel) {
            return null;
        }
        AhwBna().addOnScrollListener(this.ejfBZ);
        this.AuCTelauCTel = true;
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setScrollEndCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.wlaJM;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        LuaValue luaValue = luaValueArr[0];
        if (luaValue == null || !luaValue.isFunction()) {
            return null;
        }
        LuaFunction luaFunction2 = luaValue.toLuaFunction();
        this.wlaJM = luaFunction2;
        if (luaFunction2 == null || this.AuCTelauCTel) {
            return null;
        }
        AhwBna().addOnScrollListener(this.ejfBZ);
        this.AuCTelauCTel = true;
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setEndDraggingCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.KWHzl;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        LuaValue luaValue = luaValueArr[0];
        if (luaValue == null || !luaValue.isFunction()) {
            return null;
        }
        LuaFunction luaFunction2 = luaValue.toLuaFunction();
        this.KWHzl = luaFunction2;
        if (luaFunction2 == null || this.AuCTelauCTel) {
            return null;
        }
        AhwBna().addOnScrollListener(this.ejfBZ);
        this.AuCTelauCTel = true;
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setStartDeceleratingCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.zLjUOn;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        LuaValue luaValue = luaValueArr[0];
        if (luaValue == null || !luaValue.isFunction()) {
            return null;
        }
        LuaFunction luaFunction2 = luaValue.toLuaFunction();
        this.zLjUOn = luaFunction2;
        if (luaFunction2 == null || this.AuCTelauCTel) {
            return null;
        }
        AhwBna().addOnScrollListener(this.ejfBZ);
        this.AuCTelauCTel = true;
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] insertCellsAtSection(LuaValue[] luaValueArr) {
        A a2 = this.copydefault;
        if (a2 == null) {
            return null;
        }
        a2.copydefault(false);
        this.copydefault.AEQbTJ(luaValueArr[0].toInt() - 1, luaValueArr[1].toInt() - 1, (luaValueArr[2].toInt() - luaValueArr[1].toInt()) + 1);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] insertRowsAtSection(LuaValue[] luaValueArr) {
        A a2 = this.copydefault;
        if (a2 == null) {
            return null;
        }
        a2.copydefault(luaValueArr[3].toBoolean());
        this.copydefault.AEQbTJ(luaValueArr[0].toInt() - 1, luaValueArr[1].toInt() - 1, (luaValueArr[2].toInt() - luaValueArr[1].toInt()) + 1);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] deleteRowsAtSection(LuaValue[] luaValueArr) {
        A a2 = this.copydefault;
        if (a2 == null) {
            return null;
        }
        a2.copydefault(luaValueArr[3].toBoolean());
        copydefault(luaValueArr);
        this.copydefault.KWHzl(luaValueArr[0].toInt() - 1, luaValueArr[1].toInt() - 1, (luaValueArr[2].toInt() - luaValueArr[1].toInt()) + 1);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] deleteCellsAtSection(LuaValue[] luaValueArr) {
        A a2 = this.copydefault;
        if (a2 == null) {
            return null;
        }
        a2.copydefault(false);
        copydefault(luaValueArr);
        this.copydefault.KWHzl(luaValueArr[0].toInt() - 1, luaValueArr[1].toInt() - 1, (luaValueArr[2].toInt() - luaValueArr[1].toInt()) + 1);
        return null;
    }

    @InterfaceC60044zuT
    @Deprecated
    public LuaValue[] addHeaderView(LuaValue[] luaValueArr) {
        C7833arL.OLrzqt("WaterfallView:addHeaderView method is deprecated, use WaterfallAdapter:initHeader and WaterfallAdapter:fillHeaderData methods instead!", getGlobals());
        UDView uDView = (UDView) luaValueArr[0];
        A a2 = this.copydefault;
        if (a2 == null) {
            if (this.gEmmrt == null) {
                this.gEmmrt = new ArrayList();
            }
            this.gEmmrt.add(uDView.f_());
            return null;
        }
        a2.gEmmrt().copydefault(uDView.f_());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setRefreshHeaderOffset(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length != 1) {
            return null;
        }
        int i = luaValueArr[0].toInt();
        if (!(((ViewGroup) f_()) instanceof C8156axS)) {
            return null;
        }
        if (((C8156axS) f_()).AkhnZx() != null) {
            ((C8156axS) f_()).AkhnZx().KWHzl(i + C7865arr.AEQbTJ(this.AYXKKw));
            return null;
        }
        ((C8156axS) f_()).copydefault = i + C7865arr.AEQbTJ(this.AYXKKw);
        return null;
    }

    @InterfaceC60044zuT
    @Deprecated
    public LuaValue[] removeHeaderView(LuaValue[] luaValueArr) {
        C7833arL.OLrzqt("WaterfallView:removeHeaderView method is deprecated, use WaterfallAdapter:initHeader and WaterfallAdapter:fillHeaderData methods instead!", getGlobals());
        List<View> list = this.gEmmrt;
        if (list != null) {
            list.clear();
        }
        A a2 = this.copydefault;
        if (a2 == null) {
            return null;
        }
        a2.gEmmrt().AEQbTJ();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v24, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r1v27, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r1v29, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setContentInset(LuaValue[] luaValueArr) {
        this.AkhnZx = luaValueArr;
        if (luaValueArr.length > 3) {
            this.AhwBna = C7865arr.copydefault(luaValueArr[3].toDouble());
            this.AYXKKw = C7865arr.copydefault(luaValueArr[0].toDouble());
            if (f_() instanceof C8156axS) {
                if (((C8156axS) f_()).AkhnZx() != null) {
                    ((C8156axS) f_()).AkhnZx().KWHzl(luaValueArr[0].toFloat());
                } else {
                    ((C8156axS) f_()).copydefault = luaValueArr[0].toFloat();
                }
            }
            this.djBIcL = C7865arr.copydefault((float) luaValueArr[1].toDouble());
            this.EZpvd = C7865arr.copydefault((float) luaValueArr[2].toDouble());
            ((ViewGroup) this.dHguZz).setClipToPadding(false);
            ((ViewGroup) this.dHguZz).setClipChildren(false);
            L l = this.valueOf;
            if (l instanceof InterfaceC7451akA) {
                ((InterfaceC7451akA) l).layoutInset(luaValueArr);
            }
        }
        gEmmrt();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] getContentInset(LuaValue[] luaValueArr) {
        if (luaValueArr.length < 1 || !luaValueArr[0].isFunction()) {
            return null;
        }
        if (this.AkhnZx != null) {
            luaValueArr[0].toLuaFunction().invoke(this.AkhnZx);
            return null;
        }
        LuaNumber luaNumberValueOf = LuaNumber.valueOf(0);
        luaValueArr[0].toLuaFunction().invoke(LuaValue.varargsOf(luaNumberValueOf, luaNumberValueOf, luaNumberValueOf, luaNumberValueOf));
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] useAllSpanForLoading(LuaValue[] luaValueArr) {
        this.AxsJAY = luaValueArr[0].toBoolean();
        A a2 = this.copydefault;
        if (a2 == null) {
            return null;
        }
        a2.gEmmrt().EZpvd(this.AxsJAY);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] getRecycledViewNum(LuaValue[] luaValueArr) {
        return LuaValue.rNumber(this.getNewProxyInstance != null ? r3.gEmmrt() : AudioStats.AUDIO_AMPLITUDE_NONE);
    }

    @InterfaceC60044zuT
    public LuaValue[] isStartPosition(LuaValue[] luaValueArr) {
        if (this.getFieldNames == 1) {
            return LuaValue.rBoolean(!AhwBna().canScrollVertically(-1));
        }
        return LuaValue.rBoolean(!AhwBna().canScrollHorizontally(-1));
    }

    @InterfaceC60044zuT
    public LuaValue[] cellWithSectionRow(LuaValue[] luaValueArr) {
        A a2 = this.copydefault;
        if (a2 == null) {
            return LuaValue.rNil();
        }
        View viewFindViewByPosition = AhwBna().getLayoutManager().findViewByPosition(a2.copydefault(luaValueArr[0].toInt() - 1, luaValueArr[1].toInt() - 1));
        if (viewFindViewByPosition == null) {
            return LuaValue.rNil();
        }
        return LuaValue.varargsOf(((C7354aiJ) AhwBna().getChildViewHolder(viewFindViewByPosition)).OLrzqt());
    }

    @InterfaceC60044zuT
    public LuaValue[] visibleCells(LuaValue[] luaValueArr) {
        ArrayList arrayList = new ArrayList();
        if (this.copydefault == null) {
            return LuaValue.varargsOf(new UDArray(getGlobals(), (List) arrayList));
        }
        RecyclerView.LayoutManager layoutManager = AhwBna().getLayoutManager();
        if (layoutManager == null) {
            return LuaValue.varargsOf(new UDArray(getGlobals(), (List) arrayList));
        }
        int iKWHzl = ((C7781aqM) AhwBna()).KWHzl();
        for (int iAEQbTJ = ((C7781aqM) AhwBna()).AEQbTJ(); iAEQbTJ < iKWHzl + 1; iAEQbTJ++) {
            View viewFindViewByPosition = layoutManager.findViewByPosition(iAEQbTJ);
            if (viewFindViewByPosition != null) {
                C7354aiJ c7354aiJ = (C7354aiJ) AhwBna().getChildViewHolder(viewFindViewByPosition);
                if (c7354aiJ.OLrzqt() != null) {
                    arrayList.add(c7354aiJ.OLrzqt());
                }
            }
        }
        return LuaValue.varargsOf(new UDArray(getGlobals(), (List) arrayList));
    }

    @InterfaceC60044zuT
    public LuaValue[] scrollEnabled(LuaValue[] luaValueArr) {
        if (luaValueArr.length > 0) {
            AhwBna().setLayoutFrozen(luaValueArr[0].toBoolean());
            return null;
        }
        return LuaValue.rBoolean(AhwBna().isLayoutFrozen());
    }

    @InterfaceC60044zuT
    public LuaValue[] pauseImageRequestsOnFling(LuaValue[] luaValueArr) {
        if (luaValueArr.length <= 0) {
            return null;
        }
        ((C7781aqM) AhwBna()).setPauseImageRequestsOnFling(luaValueArr[0].toBoolean());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setLottieJson(LuaValue[] luaValueArr) {
        if (luaValueArr.length <= 0) {
            return null;
        }
        ((InterfaceC7474akX) ((ViewGroup) f_())).setLottieJson(luaValueArr[0].toJavaString(), luaValueArr[1].toInt(), luaValueArr[2].toInt());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setMaterialHeader(LuaValue[] luaValueArr) {
        ((InterfaceC7474akX) ((ViewGroup) f_())).setMaterialHeader();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setNFTManyChainHeader(LuaValue[] luaValueArr) {
        ((InterfaceC7474akX) ((ViewGroup) f_())).setNFTManyChainHeader();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setOKXLiteHeader(LuaValue[] luaValueArr) {
        ((InterfaceC7474akX) ((ViewGroup) f_())).setOKXLiteHeader();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setOKXLightHeader(LuaValue[] luaValueArr) {
        ((InterfaceC7474akX) ((ViewGroup) f_())).setOKXLightHeader();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] disallowFling(LuaValue[] luaValueArr) {
        if (luaValueArr.length > 0) {
            ((C7781aqM) AhwBna()).setDisallowFling(luaValueArr[0].toBoolean());
            return null;
        }
        return LuaValue.rBoolean(((C7781aqM) AhwBna()).valueOf());
    }

    @InterfaceC60044zuT
    public LuaValue[] animationConfig(LuaValue[] luaValueArr) {
        C7348aiD c7348aiD = new C7348aiD(0.3f, 0.0f);
        C7348aiD c7348aiD2 = new C7348aiD(0.7f, 1.0f);
        int i = 50;
        if (luaValueArr.length >= 4) {
            f = luaValueArr[0].isNumber() ? luaValueArr[0].toFloat() : 0.3f;
            LuaValue luaValue = luaValueArr[1];
            if (luaValue instanceof UDPoint) {
                c7348aiD = ((UDPoint) luaValue).EZpvd();
            }
            LuaValue luaValue2 = luaValueArr[2];
            if (luaValue2 instanceof UDPoint) {
                c7348aiD2 = ((UDPoint) luaValue2).EZpvd();
            }
            if (luaValueArr[3].isNumber()) {
                i = luaValueArr[3].toInt();
            }
        }
        RecyclerView recyclerViewAhwBna = AhwBna();
        if (!(recyclerViewAhwBna instanceof C8155axR)) {
            return null;
        }
        ((C8155axR) recyclerViewAhwBna).OLrzqt(f, c7348aiD, c7348aiD2, i);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] getSysDensity(LuaValue[] luaValueArr) {
        return LuaValue.rNumber(Float.valueOf(C43246rlf.OLrzqt.valueOf().getResources().getDisplayMetrics().density).floatValue());
    }

    @InterfaceC60044zuT
    public LuaValue[] setSlideMode(LuaValue[] luaValueArr) {
        if (luaValueArr.length < 1 || !luaValueArr[0].isNumber()) {
            return null;
        }
        int i = luaValueArr[0].toInt();
        RecyclerView recyclerViewAhwBna = AhwBna();
        if (!(recyclerViewAhwBna instanceof C8155axR)) {
            return null;
        }
        ((C8155axR) recyclerViewAhwBna).setSlideMode(i);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] getRvCurrentIndex(LuaValue[] luaValueArr) {
        RecyclerView recyclerViewAhwBna = AhwBna();
        int iAYXKKw = recyclerViewAhwBna instanceof C8155axR ? ((C8155axR) recyclerViewAhwBna).AYXKKw() : -1;
        if (iAYXKKw == -1) {
            return LuaValue.rNil();
        }
        return LuaValue.rNumber(iAYXKKw);
    }

    public void AYXKKw() {
        LuaFunction luaFunction = this.uzCIH;
        if (luaFunction != null) {
            luaFunction.invoke(null);
        }
    }

    public void OLrzqt() {
        LuaFunction luaFunction = this.values;
        if (luaFunction != null) {
            luaFunction.invoke(null);
        }
    }

    public void gEmmrt() {
        InterfaceC7949atV interfaceC7949atV = this.isConnected;
        if (interfaceC7949atV == null || this.EZpvd == Float.MIN_VALUE) {
            return;
        }
        View viewOLrzqt = ((InterfaceC8006aua) interfaceC7949atV.copydefault()).OLrzqt();
        viewOLrzqt.setPadding(viewOLrzqt.getPaddingLeft(), viewOLrzqt.getPaddingTop(), viewOLrzqt.getPaddingRight(), (int) this.EZpvd);
    }

    @Override // o.InterfaceC7550alu
    public void AEQbTJ(int i, int i2) {
        A a2 = this.copydefault;
        if (a2 != null) {
            int i3 = this.AubY;
            if (i3 <= 0 || i3 == i) {
                int i4 = this.zsXlph;
                if (i4 <= 0 || i4 == i2) {
                    a2.AhwBna(i, i2);
                }
            }
        }
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public void AhwBna(float f) {
        super.AhwBna(f);
        this.AubY = (int) f;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public void AEQbTJ(float f) {
        super.AEQbTJ(f);
        this.zsXlph = (int) f;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public LuaValue[] setMinWidth(LuaValue[] luaValueArr) {
        C7833arL.OLrzqt("Not support 'setMinWidth'  method!", getGlobals());
        return super.setMinWidth(luaValueArr);
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public LuaValue[] setMaxWidth(LuaValue[] luaValueArr) {
        C7833arL.OLrzqt("Not support 'setMaxWidth'  method!", getGlobals());
        return super.setMaxWidth(luaValueArr);
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public LuaValue[] setMinHeight(LuaValue[] luaValueArr) {
        C7833arL.OLrzqt("Not support 'setMinHeight'  method!", getGlobals());
        return super.setMinHeight(luaValueArr);
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public LuaValue[] setMaxHeight(LuaValue[] luaValueArr) {
        C7833arL.OLrzqt("Not support 'setMaxHeight'  method!", getGlobals());
        return super.setMaxHeight(luaValueArr);
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewGroup
    public LuaValue[] addView(LuaValue[] luaValueArr) {
        C7833arL.OLrzqt("not support addView", getGlobals());
        return super.addView(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v18, resolved type: com.immomo.mls.fun.ud.view.recycler.UDBaseNeedHeightAdapter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: com.immomo.mls.fun.ud.view.recycler.UDBaseNeedHeightAdapter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View] */
    public void OLrzqt(A a2) {
        this.copydefault = a2;
        a2.copydefault(this.isConnected);
        gEmmrt();
        RecyclerView recyclerViewAhwBna = AhwBna();
        L l = this.valueOf;
        if (l != null) {
            l.AEQbTJ(this.getFieldNames);
            this.valueOf.copydefault(this.copydefault);
            this.copydefault.AEQbTJ(this.valueOf, f_());
            AEQbTJ(recyclerViewAhwBna);
            recyclerViewAhwBna.addItemDecoration(this.valueOf.KWHzl());
            boolean z = this.valueOf instanceof InterfaceC7451akA;
        }
        if (this.copydefault.KWHzl() && this.copydefault.DbNXlk() > 1) {
            recyclerViewAhwBna.addItemDecoration(new C7454akD(this.copydefault));
        }
        this.copydefault.KWHzl(f_());
        if (this.gEmmrt != null) {
            this.copydefault.gEmmrt().KWHzl(this.gEmmrt);
            this.gEmmrt.clear();
            this.gEmmrt = null;
        }
        this.copydefault.gEmmrt().EZpvd(this.AxsJAY);
        a2.copydefault((InterfaceC7554aly) f_());
        a2.AhwBna(recyclerViewAhwBna.getWidth(), recyclerViewAhwBna.getHeight());
        C7393aiw c7393aiwGEmmrt = a2.gEmmrt();
        c7393aiwGEmmrt.AEQbTJ(((InterfaceC7474akX) ((ViewGroup) f_())).EZpvd());
        recyclerViewAhwBna.setAdapter(c7393aiwGEmmrt);
        RecyclerView.LayoutManager layoutManagerFetchVPNInfo = a2.fetchVPNInfo();
        this.fIwbmz = layoutManagerFetchVPNInfo;
        recyclerViewAhwBna.setLayoutManager(layoutManagerFetchVPNInfo);
        OLrzqt(this.fIwbmz);
        if (this.fJNWhG) {
            RecyclerView.LayoutManager layoutManager = this.fIwbmz;
            if (layoutManager instanceof LinearLayoutManager) {
                ((LinearLayoutManager) layoutManager).setRecycleChildrenOnDetach(true);
            }
            A a3 = this.copydefault;
            if (a3 != null) {
                a3.EZpvd(this.getNewProxyInstance.AEQbTJ());
            }
        } else {
            A a4 = this.copydefault;
            if (a4 != null) {
                a4.EZpvd(null);
            }
        }
        EZpvd(this.fARcdN);
    }

    private void AEQbTJ(RecyclerView recyclerView) {
        for (int i = 0; i < recyclerView.getItemDecorationCount(); i++) {
            recyclerView.removeItemDecorationAt(i);
        }
    }

    public void KWHzl(boolean z) {
        if (!z) {
            AhwBna().scrollToPosition(0);
        } else {
            AhwBna().smoothScrollToPosition(0);
        }
    }

    private void OLrzqt(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof LinearLayoutManager) {
            ((LinearLayoutManager) layoutManager).setOrientation(this.getFieldNames);
        }
        L l = this.valueOf;
        if (l != null) {
            l.AEQbTJ(this.getFieldNames);
        }
        A a2 = this.copydefault;
        if (a2 != null) {
            a2.ejfBZ(this.getFieldNames);
        }
    }

    private void copydefault(LuaValue[] luaValueArr) {
        if (C7326ahi.EZpvd) {
            this.copydefault.copydefault(luaValueArr[0].toInt() - 1, luaValueArr[2].toInt() - 1);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public enum SCROLL_TO_POSITION {
        SCROLL_TO_TOP(1),
        SCROLL_TO_BOTTOM(2),
        SCROLL_TO_OTHER(-1);

        private int position;

        SCROLL_TO_POSITION(int i) {
            this.position = i;
        }
    }
}
