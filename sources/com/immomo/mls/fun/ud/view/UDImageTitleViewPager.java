package com.immomo.mls.fun.ud.view;

import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.immomo.mls.fun.ud.UDColor;
import com.immomo.mls.fun.ud.view.viewpager.AppbarLayoutBehavior;
import com.immomo.mls.fun.ud.view.viewpager.UDViewPagerAdapter;
import com.immomo.mls.fun.ui.DefaultPageIndicator;
import com.immomo.mls.fun.ui.custom.OkSegmentImageTitleLayout;
import com.immomo.mls.utils.AssertUtils;
import java.util.ArrayList;
import java.util.List;
import o.C7320ahc;
import o.C7326ahi;
import o.C7350aiF;
import o.C7362aiR;
import o.C7462akL;
import o.C7465akO;
import o.C7545alp;
import o.C7779aqK;
import o.C7801aqg;
import o.C7833arL;
import o.C7865arr;
import o.InterfaceC60044zuT;
import o.InterfaceC7472akV;
import o.InterfaceC7534ale;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDImageTitleViewPager<T extends FrameLayout & InterfaceC7534ale & InterfaceC7472akV> extends UDViewPager<T> implements View.OnClickListener {
    public static final String[] copydefault = {TypedValues.AttributesType.S_FRAME, "autoScroll", "recurrence", "frameInterval", "endDragging", "showIndicator", "scrollToPage", "currentPage", "setPreRenderCount", "setScrollEnable", "aheadLoad", "setPageClickListener", "currentPageColor", "pageDotColor", "setTabScrollingListener", "onChangeSelected", "segmentTitle", "segmentIcon", "getCount", "initCell", "cellWillAppear", "cellDidDisappear", "reloadData", "currentCellIndex", "checkStatus", "initHeaderView", "headerHeight", "minVisibleHeaderHeight", "headerBounce", "currentHeaderHeight", "headerScroll", "selectedIndex", "setScrollCallback", "getLeftIndex", "getRightIndex", "getProgress", "setOnPageScrolledCallback", "setOnPageScrollStateChangedCallback", "setOnPageTransformCallback", "setExpanded", "refreshEnable", "startRefreshing", "stopRefreshing", "setRefreshingCallback", "setLottieJson", "setMaterialHeader", "setPageMargin", "setParentIsViewPager2", "setNFTManyChainHeader", "setOKXLiteHeader"};
    public LuaFunction AEQbTJ;
    public LuaFunction AYXKKw;
    public LuaFunction AhwBna;
    public boolean AkhnZx;
    public LuaFunction AuCTel;
    public LuaFunction AuCTelauCTel;
    public ViewPager.PageTransformer AubY;
    public OkSegmentImageTitleLayout AwvSrB;
    public LuaFunction AxsJAY;
    public C7545alp DbNXlk;
    public UDViewPagerAdapter EZpvd;
    public LuaFunction KWHzl;
    public InterfaceC7534ale.Application OLrzqt;
    public int QOLQEE;
    public LuaFunction djBIcL;
    public int ejfBZ;
    public LuaFunction fARcdN;
    public LuaFunction fIwbmz;
    public int fJNWhG;
    public DefaultPageIndicator fetchVPNInfo;
    public int gEmmrt;
    public LuaFunction gHZMYf;
    public boolean getFieldNames;
    public LuaFunction getNewProxyInstance;
    public int hDKMBd;
    public C7779aqK isConnected;
    public LuaFunction iwGUEr;
    public LuaFunction sSMYrx;
    public boolean uzCIH;
    public LuaFunction valueOf;
    public boolean values;
    public int wlaJM;
    public LuaFunction zLjUOn;
    public LuaFunction zsXlph;
    public float zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    public C7545alp DbNXlk() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    public DefaultPageIndicator gEmmrt() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    public C7779aqK valueOf() {
        return this.isConnected;
    }

    @InterfaceC60044zuT
    public UDImageTitleViewPager(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.wlaJM = 0;
        this.fJNWhG = -1;
        this.ejfBZ = 436207615;
        this.hDKMBd = 0;
        this.getFieldNames = false;
        this.values = false;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    /* JADX DEBUG: Method merged with bridge method: EZpvd([Lorg/luaj/vm2/LuaValue;)Landroid/view/ViewGroup; */
    @Override // com.immomo.mls.fun.ud.view.UDViewPager, com.immomo.mls.fun.ud.view.UDViewGroup
    /* JADX INFO: renamed from: copydefault */
    public T AEQbTJ(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        C7779aqK c7779aqK = new C7779aqK(AubY(), this);
        C7545alp c7545alpIsConnected = c7779aqK.isConnected();
        this.DbNXlk = c7545alpIsConnected;
        this.isConnected = c7779aqK;
        OLrzqt(c7545alpIsConnected, c7779aqK);
        if (luaValueArr != null && luaValueArr.length > 0 && (luaValue = luaValueArr[0]) != null) {
            OkSegmentImageTitleLayout okSegmentImageTitleLayout = (OkSegmentImageTitleLayout) luaValue.toUserdata();
            this.AwvSrB = okSegmentImageTitleLayout;
            if (okSegmentImageTitleLayout != null) {
                okSegmentImageTitleLayout.KWHzl(this.DbNXlk.gEmmrt());
            }
        }
        return c7779aqK;
    }

    /* JADX DEBUG: Method merged with bridge method: f_()Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDViewPager, com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: isConnected */
    public T f_() {
        return (T) super.f_();
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager, com.immomo.mls.fun.ud.view.UDView
    public LuaValue[] height(LuaValue[] luaValueArr) {
        return super.height(luaValueArr);
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager, com.immomo.mls.fun.ud.view.UDView
    public LuaValue[] frame(LuaValue[] luaValueArr) {
        LuaValue[] luaValueArrFrame = super.frame(luaValueArr);
        ejfBZ();
        return luaValueArrFrame;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    public void OLrzqt(C7545alp c7545alp, C7779aqK c7779aqK) {
        UDViewPagerAdapter uDViewPagerAdapter = new UDViewPagerAdapter(getGlobals(), (Object) null);
        if (this.EZpvd != null) {
            valueOf().copydefault(this.EZpvd.EZpvd());
        }
        this.EZpvd = uDViewPagerAdapter;
        if (this.valueOf != null) {
            uDViewPagerAdapter.EZpvd(this);
        }
        uDViewPagerAdapter.OLrzqt(this);
        C7465akO c7465akOEZpvd = uDViewPagerAdapter.EZpvd();
        c7465akOEZpvd.copydefault(this);
        c7545alp.setAdapter(c7465akOEZpvd);
        c7779aqK.EZpvd(c7465akOEZpvd);
        c7465akOEZpvd.EZpvd(this.wlaJM != 0);
        if (!copydefault(this.EZpvd.EZpvd())) {
            c7545alp.setScrollable(false);
        }
        AuCTel();
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] reloadData(LuaValue[] luaValueArr) {
        UDViewPagerAdapter uDViewPagerAdapter = this.EZpvd;
        if (uDViewPagerAdapter != null) {
            int size = gEmmrt(uDViewPagerAdapter.AEQbTJ()).size();
            if (size > 0 && DbNXlk().getOffscreenPageLimit() == 1) {
                DbNXlk().setOffscreenPageLimit(size);
            }
            this.EZpvd.OLrzqt();
        }
        if (!copydefault(this.EZpvd.EZpvd())) {
            DbNXlk().setScrollable(false);
        }
        OLrzqt(DbNXlk().getCurrentItem());
        AEQbTJ(DbNXlk().getCurrentItem());
        List<C7801aqg.TaskDescription> listGEmmrt = gEmmrt(this.EZpvd.AEQbTJ());
        OkSegmentImageTitleLayout okSegmentImageTitleLayout = this.AwvSrB;
        if (okSegmentImageTitleLayout == null) {
            return null;
        }
        okSegmentImageTitleLayout.EZpvd(listGEmmrt);
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    public boolean fIwbmz() {
        return valueOf().fetchVPNInfo();
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] autoScroll(LuaValue[] luaValueArr) {
        if (luaValueArr.length >= 1 && luaValueArr[0] != null) {
            valueOf().setAutoScroll(luaValueArr[0].toBoolean());
            return null;
        }
        return LuaValue.rBoolean(fIwbmz());
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] setParentIsViewPager2(LuaValue[] luaValueArr) {
        if (luaValueArr.length >= 2 && luaValueArr[0] != null && luaValueArr[1] != null) {
            valueOf().setParentIsViewPager2(luaValueArr[0].toInt(), luaValueArr[1].toInt());
            return null;
        }
        return LuaValue.rBoolean(valueOf().djBIcL());
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    public boolean fARcdN() {
        return valueOf().values();
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] recurrence(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length >= 1 && (luaValue = luaValueArr[0]) != null) {
            boolean z = luaValue.toBoolean();
            if ((valueOf() instanceof C7779aqK) && DbNXlk().AkhnZx() && z) {
                valueOf().setRepeat(false);
            } else {
                valueOf().setRepeat(z);
            }
            if (DbNXlk().getAdapter() == null) {
                return null;
            }
            DbNXlk().getAdapter().notifyDataSetChanged();
            return null;
        }
        return LuaValue.rBoolean(fARcdN());
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    public float AYXKKw() {
        return valueOf().gEmmrt();
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] frameInterval(LuaValue[] luaValueArr) {
        if (luaValueArr.length >= 1 && luaValueArr[0] != null) {
            valueOf().setFrameInterval((float) luaValueArr[0].toDouble());
            return null;
        }
        return LuaValue.rNumber(AYXKKw());
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    @Deprecated
    public LuaValue[] endDragging(LuaValue[] luaValueArr) {
        C7833arL.EZpvd("endDragging", getGlobals());
        LuaValue luaValue = luaValueArr[0];
        LuaFunction luaFunction = luaValue == null ? null : luaValue.toLuaFunction();
        this.AhwBna = luaFunction;
        if (luaFunction == null) {
            this.OLrzqt = null;
        } else if (this.OLrzqt == null) {
            this.OLrzqt = new Application();
        }
        valueOf().EZpvd(this.OLrzqt);
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    public boolean fJNWhG() {
        return valueOf().AYXKKw() != null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] showIndicator(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length >= 1 && (luaValue = luaValueArr[0]) != null) {
            this.AkhnZx = luaValue.toBoolean();
            AuCTel();
            return null;
        }
        return LuaValue.rBoolean(fJNWhG());
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] scrollToPage(LuaValue[] luaValueArr) {
        int i;
        if (DbNXlk().getAdapter() == null) {
            this.hDKMBd = luaValueArr[0].toInt() - 1;
            this.getFieldNames = luaValueArr[1].toBoolean();
            return null;
        }
        int i2 = luaValueArr[0].toInt();
        PagerAdapter adapter = DbNXlk().getAdapter();
        if (C7326ahi.EZpvd && adapter != null && (i2 - 1 >= adapter.getCount() || i < 0)) {
            C7320ahc.AEQbTJ(new IndexOutOfBoundsException("Page index out of range! "), this.globals);
            return null;
        }
        int i3 = i2 - 1;
        DbNXlk().setCurrentItem(i3, luaValueArr[1].toBoolean());
        DbNXlk().setLastPosition(i3);
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager, com.immomo.mls.fun.ud.view.UDView, o.InterfaceC7383aim.ActionBar
    public void copydefault() {
        super.copydefault();
        if (this.hDKMBd != 0) {
            DbNXlk().setCurrentItem(this.hDKMBd, this.getFieldNames);
        }
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] currentPage(LuaValue[] luaValueArr) {
        if (AEQbTJ((C7465akO) DbNXlk().getAdapter())) {
            return LuaValue.rNumber((DbNXlk().getCurrentItem() % r3.OLrzqt()) + 1);
        }
        return LuaValue.rNumber(DbNXlk().getCurrentItem() + 1);
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] currentPageColor(LuaValue[] luaValueArr) {
        if (luaValueArr.length >= 1) {
            this.fJNWhG = ((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals);
            luaValueArr[0].destroy();
            DefaultPageIndicator defaultPageIndicator = this.fetchVPNInfo;
            if (defaultPageIndicator != null) {
                defaultPageIndicator.setFillColor(this.fJNWhG);
            }
        }
        if (this.fetchVPNInfo == null) {
            return null;
        }
        return LuaValue.varargsOf(new UDColor(getGlobals(), this.fetchVPNInfo.KWHzl()));
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] pageDotColor(LuaValue[] luaValueArr) {
        if (luaValueArr.length >= 1) {
            this.ejfBZ = ((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals);
            luaValueArr[0].destroy();
            DefaultPageIndicator defaultPageIndicator = this.fetchVPNInfo;
            if (defaultPageIndicator != null) {
                defaultPageIndicator.setPageColor(this.ejfBZ);
            }
        }
        if (this.fetchVPNInfo == null) {
            return null;
        }
        return LuaValue.varargsOf(new UDColor(getGlobals(), this.fetchVPNInfo.AEQbTJ()));
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] setPreRenderCount(LuaValue[] luaValueArr) {
        int i = luaValueArr[0].toInt();
        this.wlaJM = i;
        if (i < 1) {
            i = 1;
        }
        DbNXlk().setOffscreenPageLimit(i);
        UDViewPagerAdapter uDViewPagerAdapter = this.EZpvd;
        if (uDViewPagerAdapter == null) {
            return null;
        }
        uDViewPagerAdapter.EZpvd().EZpvd(this.wlaJM != 0);
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] setScrollEnable(LuaValue[] luaValueArr) {
        DbNXlk().setScrollable(luaValueArr[0].toBoolean());
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager, com.immomo.mls.fun.ud.view.UDView
    public LuaValue[] bgColor(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1 && (luaValueArr[0] instanceof UDColor)) {
            valueOf().setBackgroundColor(((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals));
            luaValueArr[0].destroy();
            return null;
        }
        return LuaValue.varargsOf(new UDColor(getGlobals(), iwGUEr()));
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] aheadLoad(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length >= 1 && (luaValue = luaValueArr[0]) != null && luaValue.isBoolean()) {
            if (luaValueArr[0].toBoolean()) {
                setPreRenderCount(LuaValue.rNumber(1.0d));
                return null;
            }
            setPreRenderCount(LuaValue.rNumber(AudioStats.AUDIO_AMPLITUDE_NONE));
            return null;
        }
        return LuaValue.rBoolean(this.wlaJM > 0);
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] setPageClickListener(LuaValue[] luaValueArr) {
        UDViewPagerAdapter uDViewPagerAdapter;
        LuaFunction luaFunction = luaValueArr[0].toLuaFunction();
        this.valueOf = luaFunction;
        if (luaFunction == null || (uDViewPagerAdapter = this.EZpvd) == null) {
            return null;
        }
        uDViewPagerAdapter.EZpvd(this);
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] setTabScrollingListener(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.zsXlph;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.zsXlph = luaValueArr[0].toLuaFunction();
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] setScrollCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.iwGUEr;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.iwGUEr = luaValueArr[0].toLuaFunction();
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] setOnPageScrolledCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.AuCTelauCTel;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.AuCTelauCTel = luaValueArr[0].toLuaFunction();
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] setOnPageScrollStateChangedCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.zLjUOn;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.zLjUOn = luaValueArr[0].toLuaFunction();
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] onChangeSelected(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.fIwbmz;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.fIwbmz = luaValueArr[0].toLuaFunction();
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] segmentTitle(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr == null || luaValueArr.length <= 0 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        this.AxsJAY = luaValue.toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] segmentIcon(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr == null || luaValueArr.length <= 0 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        this.sSMYrx = luaValue.toLuaFunction();
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] getCount(LuaValue[] luaValueArr) {
        this.EZpvd.getCount(luaValueArr);
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] getLeftIndex(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaValue.rNumber(this.gEmmrt));
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] getRightIndex(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaValue.rNumber(this.QOLQEE));
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] getProgress(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaValue.rNumber(this.zuBGHE));
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] setPageMargin(LuaValue[] luaValueArr) {
        DbNXlk().setPageMargin(luaValueArr[0].toInt());
        DbNXlk().setClipChildren(false);
        DbNXlk().setClipToPadding(false);
        DbNXlk().setOffscreenPageLimit(3);
        if (!(DbNXlk().getParent() instanceof ViewGroup)) {
            return null;
        }
        ((ViewGroup) DbNXlk().getParent()).setClipChildren(false);
        ((ViewGroup) DbNXlk().getParent()).setClipToPadding(false);
        return null;
    }

    public final List<C7801aqg.TaskDescription> gEmmrt(int i) {
        LuaValue luaValue;
        LuaValue luaValue2;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 1; i2 <= i; i2++) {
            LuaFunction luaFunction = this.AxsJAY;
            if (luaFunction != null && this.sSMYrx != null) {
                LuaValue[] luaValueArrInvoke = luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(i2)));
                String javaString = null;
                String javaString2 = (luaValueArrInvoke == null || luaValueArrInvoke.length <= 0 || (luaValue2 = luaValueArrInvoke[0]) == null) ? null : luaValue2.toJavaString();
                LuaValue[] luaValueArrInvoke2 = this.sSMYrx.invoke(LuaValue.varargsOf(LuaNumber.valueOf(i2)));
                if (luaValueArrInvoke2 != null && luaValueArrInvoke2.length > 0 && (luaValue = luaValueArrInvoke2[0]) != null) {
                    javaString = luaValue.toJavaString();
                }
                if (javaString2 != null && javaString != null) {
                    arrayList.add(new C7801aqg.TaskDescription(javaString2, javaString));
                }
            }
        }
        return arrayList;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] initCell(LuaValue[] luaValueArr) {
        this.EZpvd.initCell(luaValueArr);
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] cellWillAppear(LuaValue[] luaValueArr) {
        this.KWHzl = luaValueArr[0].toLuaFunction();
        DbNXlk().copydefault();
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] cellDidDisappear(LuaValue[] luaValueArr) {
        this.AEQbTJ = luaValueArr[0].toLuaFunction();
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] currentCellIndex(LuaValue[] luaValueArr) {
        if (this.EZpvd != null) {
            return LuaValue.varargsOf(LuaNumber.valueOf(DbNXlk().getCurrentItem()));
        }
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] checkStatus(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr == null || luaValueArr.length <= 0 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        this.AYXKKw = luaValue.toLuaFunction();
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] initHeaderView(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr == null || luaValueArr.length <= 0 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        this.djBIcL = luaValue.toLuaFunction();
        values();
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] headerHeight(LuaValue[] luaValueArr) {
        this.fARcdN = luaValueArr[0].toLuaFunction();
        values();
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] headerScroll(LuaValue[] luaValueArr) {
        this.AuCTel = luaValueArr[0].toLuaFunction();
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] selectedIndex(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        LuaValue luaValue2;
        final boolean z = true;
        if (luaValueArr.length > 0 && (luaValue = luaValueArr[0]) != null) {
            final int i = luaValue.toInt();
            if (luaValueArr.length > 1 && (luaValue2 = luaValueArr[1]) != null) {
                z = luaValue2.toBoolean();
            }
            new Handler().postDelayed(new Runnable() { // from class: com.immomo.mls.fun.ud.view.UDImageTitleViewPager.2
                @Override // java.lang.Runnable
                public void run() {
                    UDImageTitleViewPager.this.DbNXlk.setCurrentItem(i - 1, z);
                    UDImageTitleViewPager.this.DbNXlk.setLastPosition(i - 1);
                }
            }, 100L);
            return null;
        }
        return LuaValue.varargsOf(LuaValue.rNumber(this.DbNXlk.gEmmrt().getCurrentItem() + 1));
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] minVisibleHeaderHeight(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr == null || luaValueArr.length <= 0 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        this.isConnected.valueOf().setMinimumHeight(C7865arr.copydefault(luaValue.toDouble()));
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] headerBounce(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr == null || luaValueArr.length <= 0 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        luaValue.toBoolean();
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] setExpanded(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length > 1 && luaValueArr[0] != null) {
            this.isConnected.AEQbTJ().setExpanded(luaValueArr[0].toBoolean(), luaValueArr[1].toBoolean());
            return null;
        }
        if (luaValueArr == null || luaValueArr.length <= 0 || luaValueArr[0] == null) {
            return null;
        }
        this.isConnected.AEQbTJ().setExpanded(luaValueArr[0].toBoolean());
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] currentHeaderHeight(LuaValue[] luaValueArr) {
        Rect rect = new Rect();
        this.isConnected.valueOf().getLocalVisibleRect(rect);
        int bottom = rect.bottom - rect.top;
        if (bottom <= 0) {
            bottom = this.isConnected.AEQbTJ().getBottom();
        }
        return LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.AEQbTJ(bottom)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    public final void values() {
        if (this.djBIcL == null || this.fARcdN == null || this.values) {
            return;
        }
        this.values = true;
        C7362aiR c7362aiR = new C7362aiR(getGlobals(), null);
        ViewGroup viewGroup = (ViewGroup) c7362aiR.f_();
        LuaFunction luaFunction = this.djBIcL;
        C7350aiF c7350aiFAhwBna = AhwBna();
        AppBarLayout.LayoutParams layoutParams = new AppBarLayout.LayoutParams(c7350aiFAhwBna.copydefault(), c7350aiFAhwBna.AEQbTJ());
        viewGroup.setMinimumHeight(C7865arr.copydefault(60.0f));
        layoutParams.setScrollFlags(3);
        viewGroup.setLayoutParams(layoutParams);
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.varargsOf(c7362aiR.OLrzqt()));
        }
        valueOf().AEQbTJ(viewGroup, false);
        this.isConnected.KWHzl(new AppbarLayoutBehavior.ActionBar() { // from class: com.immomo.mls.fun.ud.view.UDImageTitleViewPager.4
            @Override // com.immomo.mls.fun.ud.view.viewpager.AppbarLayoutBehavior.ActionBar
            public void copydefault() {
                if (UDImageTitleViewPager.this.AuCTel != null) {
                    UDImageTitleViewPager.this.AuCTel.invoke(null);
                }
            }
        });
    }

    public final C7350aiF AhwBna() {
        LuaValue luaValueNil;
        LuaFunction luaFunction = this.fARcdN;
        if (luaFunction == null) {
            return new C7350aiF(Float.MIN_VALUE, 2.8E-45f);
        }
        LuaValue[] luaValueArrInvoke = luaFunction.invoke(null);
        if (luaValueArrInvoke == null || luaValueArrInvoke.length == 0) {
            luaValueNil = LuaValue.Nil();
        } else {
            luaValueNil = luaValueArrInvoke[0];
        }
        if (!AssertUtils.EZpvd(luaValueNil, luaFunction, getGlobals())) {
            return new C7350aiF(Float.MIN_VALUE, 2.8E-45f);
        }
        float f = luaValueNil.toInt();
        return new C7350aiF(Float.MIN_VALUE, f >= 0.0f ? f : 2.8E-45f);
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager, com.immomo.mls.fun.ud.view.UDView
    public void AEQbTJ(float f, int i) {
        super.AEQbTJ(f, i);
        UDViewPagerAdapter uDViewPagerAdapter = this.EZpvd;
        if (uDViewPagerAdapter == null || uDViewPagerAdapter.EZpvd() == null) {
            return;
        }
        this.EZpvd.EZpvd().notifyDataSetChanged();
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    public void ejfBZ() {
        valueOf().setPageIndicator(null);
        AuCTel();
    }

    public final void AuCTel() {
        if (this.AkhnZx) {
            if (valueOf().AYXKKw() == null) {
                DefaultPageIndicator defaultPageIndicator = new DefaultPageIndicator(AubY());
                this.fetchVPNInfo = defaultPageIndicator;
                defaultPageIndicator.setFillColor(this.fJNWhG);
                this.fetchVPNInfo.setPageColor(this.ejfBZ);
                valueOf().setPageIndicator(this.fetchVPNInfo);
            }
            this.fetchVPNInfo.invalidate();
            return;
        }
        valueOf().setPageIndicator(null);
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager, android.view.View.OnClickListener
    public void onClick(View view) {
        copydefault(DbNXlk().getCurrentItem() + 1);
    }

    /* JADX INFO: loaded from: classes14.dex */
    public final class Application implements InterfaceC7534ale.Application {
        @Override // o.InterfaceC7534ale.Application
        public void AEQbTJ(int i) {
        }

        public Application() {
        }

        @Override // o.InterfaceC7534ale.Application
        public void OLrzqt(int i) {
            int iEZpvd = UDImageTitleViewPager.this.EZpvd(i);
            if (UDImageTitleViewPager.this.AhwBna != null) {
                UDImageTitleViewPager.this.AhwBna.invoke(LuaValue.rNumber(iEZpvd + 1));
            }
        }
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    public int EZpvd(int i) {
        C7465akO c7465akO = (C7465akO) DbNXlk().getAdapter();
        return AEQbTJ(c7465akO) ? i % c7465akO.OLrzqt() : i;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    public void AEQbTJ(int i) {
        if (this.KWHzl != null) {
            int iEZpvd = EZpvd(i);
            LuaValue luaValueKWHzl = KWHzl(iEZpvd);
            if (luaValueKWHzl.isNil()) {
                return;
            }
            this.KWHzl.invoke(LuaValue.varargsOf(luaValueKWHzl, LuaNumber.valueOf(iEZpvd + 1)));
            if (iEZpvd == 0) {
                DbNXlk().AkhnZx = false;
            }
        }
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    public void OLrzqt(int i) {
        if (this.AEQbTJ != null) {
            int iEZpvd = EZpvd(i);
            LuaValue luaValueKWHzl = KWHzl(iEZpvd);
            if (luaValueKWHzl.isNil()) {
                return;
            }
            this.AEQbTJ.invoke(LuaValue.varargsOf(luaValueKWHzl, LuaNumber.valueOf(iEZpvd + 1)));
        }
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    public void copydefault(int i) {
        if (this.valueOf != null) {
            if (AEQbTJ((C7465akO) DbNXlk().getAdapter())) {
                this.valueOf.invoke(LuaValue.rNumber((DbNXlk().getCurrentItem() % r0.OLrzqt()) + 1));
            } else {
                this.valueOf.invoke(LuaValue.rNumber(i));
            }
        }
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    public boolean AEQbTJ(C7465akO c7465akO) {
        return c7465akO != null && c7465akO.copydefault() && c7465akO.OLrzqt() > 1;
    }

    public final LuaValue KWHzl(int i) {
        UDViewPagerAdapter uDViewPagerAdapter = this.EZpvd;
        if (uDViewPagerAdapter == null) {
            return LuaValue.Nil();
        }
        C7462akL c7462akLEZpvd = uDViewPagerAdapter.EZpvd().EZpvd(i);
        if (c7462akLEZpvd != null) {
            return c7462akLEZpvd.copydefault();
        }
        return LuaValue.Nil();
    }

    public final boolean copydefault(C7465akO c7465akO) {
        return c7465akO.OLrzqt() != 1;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    public void AEQbTJ(int i, float f, int i2) {
        LuaFunction luaFunction = this.AuCTelauCTel;
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(i), LuaNumber.copydefault(f), LuaNumber.valueOf(i2)));
        }
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    public void AhwBna(int i) {
        LuaFunction luaFunction = this.zLjUOn;
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(i)));
        }
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    public void AEQbTJ(float f, int i, int i2) {
        this.zuBGHE = f;
        this.gEmmrt = i;
        this.QOLQEE = i2;
        LuaFunction luaFunction = this.AYXKKw;
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(i + 1), LuaNumber.valueOf(i2 + 1), LuaNumber.copydefault(f)));
        }
        LuaFunction luaFunction2 = this.iwGUEr;
        if (luaFunction2 != null) {
            luaFunction2.invoke(null);
        }
        LuaFunction luaFunction3 = this.zsXlph;
        if (luaFunction3 != null) {
            luaFunction3.invoke(LuaValue.varargsOf(LuaNumber.copydefault(f), LuaNumber.valueOf(i + 1), LuaNumber.valueOf(i2 + 1)));
        }
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    public void djBIcL(int i) {
        LuaFunction luaFunction = this.fIwbmz;
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(i + 1)));
        }
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] refreshEnable(LuaValue[] luaValueArr) {
        if (luaValueArr.length > 0) {
            this.uzCIH = luaValueArr[0].toBoolean();
            ((InterfaceC7472akV) f_()).setRefreshEnable(this.uzCIH);
            return null;
        }
        return LuaValue.rBoolean(this.uzCIH);
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] startRefreshing(LuaValue[] luaValueArr) {
        ((InterfaceC7472akV) f_()).copydefault();
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] stopRefreshing(LuaValue[] luaValueArr) {
        ((InterfaceC7472akV) f_()).KWHzl();
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] setRefreshingCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.gHZMYf;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        LuaValue luaValue = luaValueArr[0];
        if (luaValue == null || !luaValue.isFunction()) {
            return null;
        }
        this.gHZMYf = luaValue.toLuaFunction();
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] setOnPageTransformCallback(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr != null && luaValueArr.length > 0 && (luaValue = luaValueArr[0]) != null) {
            this.getNewProxyInstance = luaValue.toLuaFunction();
            if (this.AubY == null) {
                this.AubY = new TaskDescription();
                ((InterfaceC7534ale) f_()).setPageTransformer(false, this.AubY, 2);
            }
        }
        return LuaValue.varargsOf(this);
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    public void OLrzqt() {
        LuaFunction luaFunction = this.gHZMYf;
        if (luaFunction != null) {
            luaFunction.invoke(null);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public class TaskDescription implements ViewPager.PageTransformer {
        public TaskDescription() {
        }

        @Override // androidx.viewpager.widget.ViewPager.PageTransformer
        public void transformPage(@NonNull @NotNull View view, float f) {
            if (UDImageTitleViewPager.this.getNewProxyInstance != null) {
                UDImageTitleViewPager.this.getNewProxyInstance.EZpvd(f);
            }
        }
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] setMaterialHeader(LuaValue[] luaValueArr) {
        ((InterfaceC7472akV) f_()).setMaterialHeader();
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] setNFTManyChainHeader(LuaValue[] luaValueArr) {
        ((InterfaceC7472akV) f_()).setNFTManyChainHeader();
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] setOKXLiteHeader(LuaValue[] luaValueArr) {
        ((InterfaceC7472akV) f_()).setOKXLiteHeader();
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewPager
    @InterfaceC60044zuT
    public LuaValue[] setLottieJson(LuaValue[] luaValueArr) {
        if (luaValueArr.length <= 0) {
            return null;
        }
        ((InterfaceC7472akV) f_()).setLottieJson(luaValueArr[0].toJavaString(), luaValueArr[1].toInt(), luaValueArr[2].toInt());
        return null;
    }
}
