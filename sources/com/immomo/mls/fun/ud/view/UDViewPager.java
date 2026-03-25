package com.immomo.mls.fun.ud.view;

import android.graphics.Rect;
import android.os.Handler;
import android.view.MotionEvent;
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
import com.immomo.mls.fun.ui.custom.OkSegmentLayout;
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
import o.C7833arL;
import o.C7865arr;
import o.InterfaceC60044zuT;
import o.InterfaceC7472akV;
import o.InterfaceC7534ale;
import o.InterfaceC7719apD;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDViewPager<T extends FrameLayout & InterfaceC7534ale & InterfaceC7472akV> extends UDViewGroup<T> implements View.OnClickListener {
    public static final String[] OHqIaq = {TypedValues.AttributesType.S_FRAME, "autoScroll", "recurrence", "frameInterval", "endDragging", "showIndicator", "scrollToPage", "currentPage", "setPreRenderCount", "setScrollEnable", "aheadLoad", "setPageClickListener", "currentPageColor", "pageDotColor", "setTabScrollingListener", "onChangeSelected", "segmentTitle", "getCount", "initCell", "cellWillAppear", "cellDidDisappear", "reloadData", "currentCellIndex", "checkStatus", "initHeaderView", "headerHeight", "minVisibleHeaderHeight", "headerBounce", "currentHeaderHeight", "headerScroll", "selectedIndex", "selectIndex", "setScrollCallback", "getLeftIndex", "getRightIndex", "getProgress", "setOnPageScrolledCallback", "setOnPageScrollStateChangedCallback", "setOnPageTransformCallback", "setExpanded", "refreshEnable", "startRefreshing", "stopRefreshing", "setRefreshingCallback", "setLottieJson", "setMaterialHeader", "setPageMargin", "setParentIsViewPager2", "setNFTManyChainHeader", "setOKXLiteHeader", "segmentLabelTitle", "updateTabsLabel", "usedSupportHorizontalContainer", "supportHorizontal", "getHeaderOffset", "onContentTouchBegin", "onContentTouchEnd", "setTopAndBottomOffset", "useAppbarLayoutBehavior", "useBehaviorOffsetLimit", "setTwoLevelView", "closeTwoLevel", "setTwoLevelStateChangedCallback", "setTwoLevelOnMovingCallback", "moveSpinner", "setRefreshRate", "setReboundDuration", "setScrollDuration"};
    public ViewPager.PageTransformer DBxZfM;
    public LuaFunction DCUTEIdCUTEI;
    public LuaFunction DCUTEIddSDPG;
    public int DGOPHZ;
    public float DGOPHZDGOPHZ;
    public int DGUQLI;
    public OkSegmentLayout DGgnkA;
    public InterfaceC7534ale.Application DLWbHP;
    public InterfaceC7719apD DNMMPQ;
    public LuaFunction DWgRXt;
    public int DaRZkR;
    public boolean DcqEDu;
    public int Dmq;
    public LuaFunction DsrFlB;
    public LuaFunction KDccX;
    public UDViewPagerAdapter OFhtUX;
    public LuaFunction OJuSTm;
    public LuaFunction OTwTPd;
    public LuaFunction OxVOHk;
    public LuaFunction QCjLjM;
    public LuaFunction QSLkRj;
    public int QVsKAR;
    public boolean QwvEab;
    public LuaFunction RKcVTr;
    public C7779aqK USBtdM;
    public LuaFunction UlJrfe;
    public boolean UrRBLY;
    public LuaFunction WS;
    public LuaFunction aUsmxb;
    public boolean call;
    public C7545alp dUDNAs;
    public DefaultPageIndicator fERRXa;
    public boolean fHqPtx;
    public LuaFunction fdOvFl;
    public boolean fjfviF;
    public LuaFunction hCLrkq;
    public LuaFunction heceqZ;
    public LuaFunction htlTjW;
    public LuaFunction igXuih;
    public LuaFunction ixgjPv;
    public boolean run;
    public int spnCvw;
    public LuaFunction zblBkD;

    public interface StateListAnimator {
        void EZpvd();

        void copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7545alp DbNXlk() {
        return this.dUDNAs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean dxcTrN() {
        return this.DcqEDu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean finit() {
        return this.fHqPtx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DefaultPageIndicator gEmmrt() {
        return this.fERRXa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7779aqK valueOf() {
        return this.USBtdM;
    }

    @InterfaceC60044zuT
    public UDViewPager(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.DGUQLI = 0;
        this.Dmq = -1;
        this.spnCvw = 436207615;
        this.DGOPHZ = 0;
        this.call = false;
        this.fHqPtx = false;
        this.QwvEab = false;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    /* JADX DEBUG: Method merged with bridge method: EZpvd([Lorg/luaj/vm2/LuaValue;)Landroid/view/ViewGroup; */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public T AEQbTJ(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        C7779aqK c7779aqK = new C7779aqK(AubY(), this);
        C7545alp c7545alpIsConnected = c7779aqK.isConnected();
        this.dUDNAs = c7545alpIsConnected;
        this.USBtdM = c7779aqK;
        OLrzqt(c7545alpIsConnected, c7779aqK);
        if (luaValueArr != null && luaValueArr.length > 0 && (luaValue = luaValueArr[0]) != null) {
            Object userdata = luaValue.toUserdata();
            if (userdata instanceof OkSegmentLayout) {
                OkSegmentLayout okSegmentLayout = (OkSegmentLayout) userdata;
                this.DGgnkA = okSegmentLayout;
                if (okSegmentLayout != null) {
                    okSegmentLayout.AEQbTJ(this.dUDNAs.gEmmrt());
                }
            } else if (userdata instanceof InterfaceC7719apD) {
                InterfaceC7719apD interfaceC7719apD = (InterfaceC7719apD) userdata;
                this.DNMMPQ = interfaceC7719apD;
                interfaceC7719apD.EZpvd(this.dUDNAs.gEmmrt());
            }
        }
        return c7779aqK;
    }

    /* JADX DEBUG: Method merged with bridge method: f_()Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: isConnected, reason: merged with bridge method [inline-methods] */
    public T f_() {
        return (T) ((FrameLayout) super.f_());
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public LuaValue[] height(LuaValue[] luaValueArr) {
        return super.height(luaValueArr);
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public LuaValue[] frame(LuaValue[] luaValueArr) {
        LuaValue[] luaValueArrFrame = super.frame(luaValueArr);
        ejfBZ();
        return luaValueArrFrame;
    }

    public void OLrzqt(C7545alp c7545alp, C7779aqK c7779aqK) {
        UDViewPagerAdapter uDViewPagerAdapter = new UDViewPagerAdapter(getGlobals(), (Object) null);
        if (this.OFhtUX != null) {
            valueOf().copydefault(this.OFhtUX.EZpvd());
        }
        this.OFhtUX = uDViewPagerAdapter;
        if (this.aUsmxb != null) {
            uDViewPagerAdapter.EZpvd(this);
        }
        uDViewPagerAdapter.OLrzqt(this);
        C7465akO c7465akOEZpvd = uDViewPagerAdapter.EZpvd();
        c7465akOEZpvd.copydefault(this);
        c7545alp.setAdapter(c7465akOEZpvd);
        c7779aqK.EZpvd(c7465akOEZpvd);
        c7465akOEZpvd.EZpvd(this.DGUQLI != 0);
        if (!KWHzl(this.OFhtUX.EZpvd())) {
            c7545alp.setScrollable(false);
        }
        AuCTel();
    }

    @InterfaceC60044zuT
    public LuaValue[] reloadData(LuaValue[] luaValueArr) {
        UDViewPagerAdapter uDViewPagerAdapter = this.OFhtUX;
        if (uDViewPagerAdapter != null) {
            int size = getFieldNames(uDViewPagerAdapter.AEQbTJ()).size();
            if (size > 0 && DbNXlk().getOffscreenPageLimit() == 1) {
                DbNXlk().setOffscreenPageLimit(size);
            }
            this.OFhtUX.OLrzqt();
        }
        if (!KWHzl(this.OFhtUX.EZpvd())) {
            DbNXlk().setScrollable(false);
        }
        OLrzqt(DbNXlk().getCurrentItem());
        AEQbTJ(DbNXlk().getCurrentItem());
        List<String> fieldNames = getFieldNames(this.OFhtUX.AEQbTJ());
        OkSegmentLayout okSegmentLayout = this.DGgnkA;
        if (okSegmentLayout != null) {
            okSegmentLayout.copydefault(fieldNames);
        }
        dvKsVJ();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] updateTabsLabel(LuaValue[] luaValueArr) {
        dvKsVJ();
        return null;
    }

    public final void dvKsVJ() {
        List<String> listHDKMBd = hDKMBd(this.OFhtUX.AEQbTJ());
        OkSegmentLayout okSegmentLayout = this.DGgnkA;
        if (okSegmentLayout != null) {
            okSegmentLayout.KWHzl(listHDKMBd);
        }
    }

    public boolean fIwbmz() {
        return valueOf().fetchVPNInfo();
    }

    @InterfaceC60044zuT
    public LuaValue[] closeTwoLevel(LuaValue[] luaValueArr) {
        valueOf().EZpvd();
        return LuaValue.rNil();
    }

    @InterfaceC60044zuT
    public LuaValue[] setReboundDuration(LuaValue[] luaValueArr) {
        valueOf().setReboundDuration(luaValueArr[0].toInt());
        return LuaValue.rNil();
    }

    @InterfaceC60044zuT
    public LuaValue[] setScrollDuration(LuaValue[] luaValueArr) {
        if (luaValueArr.length >= 1 && luaValueArr[0] != null) {
            valueOf().setScrollDuration(luaValueArr[0].toInt());
        }
        return LuaValue.rNil();
    }

    @InterfaceC60044zuT
    public LuaValue[] setTwoLevelView(LuaValue[] luaValueArr) {
        valueOf().setTwoLevelView(((UDView) luaValueArr[0]).f_(), ((UDView) luaValueArr[1]).f_(), luaValueArr.length > 2 ? luaValueArr[2].toFloat() : 0.0f);
        return LuaValue.rNil();
    }

    @InterfaceC60044zuT
    public LuaValue[] setRefreshRate(LuaValue[] luaValueArr) {
        valueOf().setRefreshRate(luaValueArr[0].toFloat(), luaValueArr[1].toFloat(), luaValueArr.length > 2 ? luaValueArr[2].toInt() : 800);
        return LuaValue.rNil();
    }

    @InterfaceC60044zuT
    public LuaValue[] setTwoLevelStateChangedCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.RKcVTr;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        LuaValue luaValue = luaValueArr[0];
        if (luaValue == null || !luaValue.isFunction()) {
            return null;
        }
        this.RKcVTr = luaValue.toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setTwoLevelOnMovingCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.OTwTPd;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        LuaValue luaValue = luaValueArr[0];
        if (luaValue == null || !luaValue.isFunction()) {
            return null;
        }
        this.OTwTPd = luaValue.toLuaFunction();
        return null;
    }

    public void fARcdN(int i) {
        LuaFunction luaFunction = this.RKcVTr;
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.varargsOf(LuaValue.rNumber(i)));
        }
    }

    public void ejfBZ(int i) {
        LuaFunction luaFunction = this.OTwTPd;
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(i)));
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] moveSpinner(LuaValue[] luaValueArr) {
        valueOf().copydefault(C7865arr.copydefault(luaValueArr[0]), luaValueArr[1].toInt(), luaValueArr.length > 2 ? luaValueArr[2].toLuaFunction() : null);
        return LuaValue.rNil();
    }

    @InterfaceC60044zuT
    public LuaValue[] autoScroll(LuaValue[] luaValueArr) {
        if (luaValueArr.length >= 1 && luaValueArr[0] != null) {
            valueOf().setAutoScroll(luaValueArr[0].toBoolean());
            return null;
        }
        return LuaValue.rBoolean(fIwbmz());
    }

    @InterfaceC60044zuT
    public LuaValue[] setParentIsViewPager2(LuaValue[] luaValueArr) {
        if (luaValueArr.length >= 2 && luaValueArr[0] != null && luaValueArr[1] != null) {
            valueOf().setParentIsViewPager2(luaValueArr[0].toInt(), luaValueArr[1].toInt());
            return null;
        }
        return LuaValue.rBoolean(valueOf().djBIcL());
    }

    public boolean fARcdN() {
        return valueOf().values();
    }

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

    public float AYXKKw() {
        return valueOf().gEmmrt();
    }

    @InterfaceC60044zuT
    public LuaValue[] frameInterval(LuaValue[] luaValueArr) {
        if (luaValueArr.length >= 1 && luaValueArr[0] != null) {
            valueOf().setFrameInterval((float) luaValueArr[0].toDouble());
            return null;
        }
        return LuaValue.rNumber(AYXKKw());
    }

    @InterfaceC60044zuT
    @Deprecated
    public LuaValue[] endDragging(LuaValue[] luaValueArr) {
        C7833arL.EZpvd("endDragging", getGlobals());
        LuaValue luaValue = luaValueArr[0];
        LuaFunction luaFunction = luaValue == null ? null : luaValue.toLuaFunction();
        this.QCjLjM = luaFunction;
        if (luaFunction == null) {
            this.DLWbHP = null;
        } else if (this.DLWbHP == null) {
            this.DLWbHP = new Activity();
        }
        valueOf().EZpvd(this.DLWbHP);
        return null;
    }

    public boolean fJNWhG() {
        return valueOf().AYXKKw() != null;
    }

    @InterfaceC60044zuT
    public LuaValue[] showIndicator(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length >= 1 && (luaValue = luaValueArr[0]) != null) {
            this.fjfviF = luaValue.toBoolean();
            AuCTel();
            return null;
        }
        return LuaValue.rBoolean(fJNWhG());
    }

    @InterfaceC60044zuT
    public LuaValue[] scrollToPage(LuaValue[] luaValueArr) {
        int i;
        if (DbNXlk().getAdapter() == null) {
            this.DGOPHZ = luaValueArr[0].toInt() - 1;
            this.call = luaValueArr[1].toBoolean();
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

    @Override // com.immomo.mls.fun.ud.view.UDView, o.InterfaceC7383aim.ActionBar
    public void copydefault() {
        super.copydefault();
        if (this.DGOPHZ != 0) {
            DbNXlk().setCurrentItem(this.DGOPHZ, this.call);
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] currentPage(LuaValue[] luaValueArr) {
        if (AEQbTJ((C7465akO) DbNXlk().getAdapter())) {
            return LuaValue.rNumber((DbNXlk().getCurrentItem() % r3.OLrzqt()) + 1);
        }
        return LuaValue.rNumber(DbNXlk().getCurrentItem() + 1);
    }

    @InterfaceC60044zuT
    public LuaValue[] currentPageColor(LuaValue[] luaValueArr) {
        if (luaValueArr.length >= 1) {
            this.Dmq = ((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals);
            luaValueArr[0].destroy();
            DefaultPageIndicator defaultPageIndicator = this.fERRXa;
            if (defaultPageIndicator != null) {
                defaultPageIndicator.setFillColor(this.Dmq);
            }
        }
        if (this.fERRXa == null) {
            return null;
        }
        return LuaValue.varargsOf(new UDColor(getGlobals(), this.fERRXa.KWHzl()));
    }

    @InterfaceC60044zuT
    public LuaValue[] pageDotColor(LuaValue[] luaValueArr) {
        if (luaValueArr.length >= 1) {
            this.spnCvw = ((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals);
            luaValueArr[0].destroy();
            DefaultPageIndicator defaultPageIndicator = this.fERRXa;
            if (defaultPageIndicator != null) {
                defaultPageIndicator.setPageColor(this.spnCvw);
            }
        }
        if (this.fERRXa == null) {
            return null;
        }
        return LuaValue.varargsOf(new UDColor(getGlobals(), this.fERRXa.AEQbTJ()));
    }

    @InterfaceC60044zuT
    public LuaValue[] setPreRenderCount(LuaValue[] luaValueArr) {
        int i = luaValueArr[0].toInt();
        this.DGUQLI = i;
        if (i < 1) {
            i = 1;
        }
        DbNXlk().setOffscreenPageLimit(i);
        UDViewPagerAdapter uDViewPagerAdapter = this.OFhtUX;
        if (uDViewPagerAdapter == null) {
            return null;
        }
        uDViewPagerAdapter.EZpvd().EZpvd(this.DGUQLI != 0);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setScrollEnable(LuaValue[] luaValueArr) {
        DbNXlk().setScrollable(luaValueArr[0].toBoolean());
        return null;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public LuaValue[] bgColor(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1 && (luaValueArr[0] instanceof UDColor)) {
            valueOf().setBackgroundColor(((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals));
            luaValueArr[0].destroy();
            return null;
        }
        return LuaValue.varargsOf(new UDColor(getGlobals(), iwGUEr()));
    }

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
        return LuaValue.rBoolean(this.DGUQLI > 0);
    }

    @InterfaceC60044zuT
    public LuaValue[] setPageClickListener(LuaValue[] luaValueArr) {
        UDViewPagerAdapter uDViewPagerAdapter;
        LuaFunction luaFunction = luaValueArr[0].toLuaFunction();
        this.aUsmxb = luaFunction;
        if (luaFunction == null || (uDViewPagerAdapter = this.OFhtUX) == null) {
            return null;
        }
        uDViewPagerAdapter.EZpvd(this);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setTabScrollingListener(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.DCUTEIddSDPG;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.DCUTEIddSDPG = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setScrollCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.WS;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.WS = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setOnPageScrolledCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.DWgRXt;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.DWgRXt = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setOnPageScrollStateChangedCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.KDccX;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.KDccX = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] onChangeSelected(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.zblBkD;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.zblBkD = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] segmentTitle(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr == null || luaValueArr.length <= 0 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        LuaFunction luaFunction = luaValue.toLuaFunction();
        this.hCLrkq = luaFunction;
        this.OFhtUX.AEQbTJ(luaFunction);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] segmentLabelTitle(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr == null || luaValueArr.length <= 0 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        this.DsrFlB = luaValue.toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] getCount(LuaValue[] luaValueArr) {
        this.OFhtUX.getCount(luaValueArr);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] getLeftIndex(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaValue.rNumber(this.QVsKAR));
    }

    @InterfaceC60044zuT
    public LuaValue[] getRightIndex(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaValue.rNumber(this.DaRZkR));
    }

    @InterfaceC60044zuT
    public LuaValue[] getProgress(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaValue.rNumber(this.DGOPHZDGOPHZ));
    }

    @InterfaceC60044zuT
    public LuaValue[] setPageMargin(LuaValue[] luaValueArr) {
        DbNXlk().setPageMargin(luaValueArr[0].toInt());
        DbNXlk().setClipChildren(false);
        DbNXlk().setClipToPadding(false);
        DbNXlk().setOffscreenPageLimit(3);
        if (DbNXlk().getParent() instanceof ViewGroup) {
            ((ViewGroup) DbNXlk().getParent()).setLayerType(1, null);
            ((ViewGroup) DbNXlk().getParent()).setClipChildren(false);
            ((ViewGroup) DbNXlk().getParent()).setClipToPadding(false);
            ((ViewGroup) DbNXlk().getParent()).setOnTouchListener(new View.OnTouchListener() { // from class: com.immomo.mls.fun.ud.view.UDViewPager.5
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return UDViewPager.this.DbNXlk().dispatchTouchEvent(motionEvent);
                }
            });
        }
        return null;
    }

    public final List<String> getFieldNames(int i) {
        LuaValue[] luaValueArrInvoke;
        LuaValue luaValue;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 1; i2 <= i; i2++) {
            LuaFunction luaFunction = this.hCLrkq;
            if (luaFunction != null && (luaValueArrInvoke = luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(i2)))) != null && luaValueArrInvoke.length > 0 && (luaValue = luaValueArrInvoke[0]) != null) {
                arrayList.add(luaValue.toJavaString());
            }
        }
        return arrayList;
    }

    public final List<String> hDKMBd(int i) {
        LuaValue[] luaValueArrInvoke;
        LuaValue luaValue;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 1; i2 <= i; i2++) {
            LuaFunction luaFunction = this.DsrFlB;
            if (luaFunction != null && (luaValueArrInvoke = luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(i2)))) != null && luaValueArrInvoke.length > 0 && (luaValue = luaValueArrInvoke[0]) != null) {
                arrayList.add(luaValue.toJavaString());
            }
        }
        return arrayList;
    }

    @InterfaceC60044zuT
    public LuaValue[] initCell(LuaValue[] luaValueArr) {
        this.OFhtUX.initCell(luaValueArr);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] cellWillAppear(LuaValue[] luaValueArr) {
        this.OJuSTm = luaValueArr[0].toLuaFunction();
        DbNXlk().copydefault();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] cellDidDisappear(LuaValue[] luaValueArr) {
        this.OxVOHk = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] currentCellIndex(LuaValue[] luaValueArr) {
        if (this.OFhtUX != null) {
            return LuaValue.varargsOf(LuaNumber.valueOf(DbNXlk().getCurrentItem()));
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] checkStatus(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr == null || luaValueArr.length <= 0 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        this.QSLkRj = luaValue.toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] initHeaderView(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr == null || luaValueArr.length <= 0 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        this.UlJrfe = luaValue.toLuaFunction();
        values();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] usedSupportHorizontalContainer(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr == null || luaValueArr.length <= 0 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        this.UrRBLY = luaValue.toBoolean();
        values();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] supportHorizontal(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        C7779aqK c7779aqK;
        if (luaValueArr == null || luaValueArr.length <= 0 || (luaValue = luaValueArr[0]) == null || (c7779aqK = this.USBtdM) == null) {
            return null;
        }
        c7779aqK.AEQbTJ(luaValue.toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] headerHeight(LuaValue[] luaValueArr) {
        this.igXuih = luaValueArr[0].toLuaFunction();
        values();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] headerScroll(LuaValue[] luaValueArr) {
        this.ixgjPv = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] onContentTouchBegin(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.htlTjW;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.htlTjW = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] onContentTouchEnd(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.fdOvFl;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.fdOvFl = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setTopAndBottomOffset(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (this.USBtdM != null && luaValueArr.length > 0 && (luaValue = luaValueArr[0]) != null) {
            this.USBtdM.setTopAndBottomOffset(C7865arr.copydefault(luaValue.toInt()));
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] useAppbarLayoutBehavior(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length <= 0 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        this.DcqEDu = luaValue.toBoolean();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] useBehaviorOffsetLimit(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length > 0 && (luaValue = luaValueArr[0]) != null) {
            this.fHqPtx = luaValue.toBoolean();
        }
        return LuaValue.rBoolean(this.fHqPtx);
    }

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
            new Handler().postDelayed(new Runnable() { // from class: com.immomo.mls.fun.ud.view.UDViewPager.4
                @Override // java.lang.Runnable
                public void run() {
                    UDViewPager.this.dUDNAs.setCurrentItem(i - 1, z);
                    UDViewPager.this.dUDNAs.setLastPosition(i - 1);
                }
            }, 100L);
            return null;
        }
        return LuaValue.varargsOf(LuaValue.rNumber(this.dUDNAs.gEmmrt().getCurrentItem() + 1));
    }

    @InterfaceC60044zuT
    public LuaValue[] selectIndex(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        LuaValue luaValue2;
        boolean z = true;
        if (luaValueArr.length > 0 && (luaValue = luaValueArr[0]) != null) {
            int i = luaValue.toInt();
            if (luaValueArr.length > 1 && (luaValue2 = luaValueArr[1]) != null) {
                z = luaValue2.toBoolean();
            }
            int i2 = i - 1;
            this.dUDNAs.setCurrentItem(i2, z);
            this.dUDNAs.setLastPosition(i2);
            return null;
        }
        return LuaValue.varargsOf(LuaValue.rNumber(this.dUDNAs.gEmmrt().getCurrentItem() + 1));
    }

    @InterfaceC60044zuT
    public LuaValue[] minVisibleHeaderHeight(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr == null || luaValueArr.length <= 0 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        this.USBtdM.valueOf().setMinimumHeight(C7865arr.copydefault(luaValue.toDouble()));
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] headerBounce(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr == null || luaValueArr.length <= 0 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        luaValue.toBoolean();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setExpanded(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length > 1 && luaValueArr[0] != null) {
            this.USBtdM.AEQbTJ().setExpanded(luaValueArr[0].toBoolean(), luaValueArr[1].toBoolean());
            return null;
        }
        if (luaValueArr == null || luaValueArr.length <= 0 || luaValueArr[0] == null) {
            return null;
        }
        this.USBtdM.AEQbTJ().setExpanded(luaValueArr[0].toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] currentHeaderHeight(LuaValue[] luaValueArr) {
        Rect rect = new Rect();
        this.USBtdM.valueOf().getLocalVisibleRect(rect);
        int bottom = rect.bottom - rect.top;
        if (bottom <= 0) {
            bottom = this.USBtdM.AEQbTJ().getBottom();
        }
        return LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.AEQbTJ(bottom)));
    }

    @InterfaceC60044zuT
    public LuaValue[] getHeaderOffset(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.AEQbTJ(this.USBtdM.AEQbTJ() != null ? this.USBtdM.AEQbTJ().getTop() : 0)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    private void values() {
        if (this.UlJrfe == null || this.igXuih == null || this.QwvEab) {
            return;
        }
        this.QwvEab = true;
        C7362aiR c7362aiR = new C7362aiR(getGlobals(), null);
        ViewGroup viewGroup = (ViewGroup) c7362aiR.f_();
        LuaFunction luaFunction = this.UlJrfe;
        C7350aiF c7350aiFAhwBna = AhwBna();
        AppBarLayout.LayoutParams layoutParams = new AppBarLayout.LayoutParams(c7350aiFAhwBna.copydefault(), c7350aiFAhwBna.AEQbTJ());
        viewGroup.setMinimumHeight(C7865arr.copydefault(60.0f));
        layoutParams.setScrollFlags(3);
        viewGroup.setLayoutParams(layoutParams);
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.varargsOf(c7362aiR.OLrzqt()));
        }
        valueOf().AEQbTJ(viewGroup, this.UrRBLY);
        this.USBtdM.KWHzl(new AppbarLayoutBehavior.ActionBar() { // from class: com.immomo.mls.fun.ud.view.UDViewPager.2
            @Override // com.immomo.mls.fun.ud.view.viewpager.AppbarLayoutBehavior.ActionBar
            public void copydefault() {
                if (UDViewPager.this.ixgjPv != null) {
                    UDViewPager.this.ixgjPv.invoke(null);
                }
            }
        });
        this.USBtdM.OLrzqt(new StateListAnimator() { // from class: com.immomo.mls.fun.ud.view.UDViewPager.3
            @Override // com.immomo.mls.fun.ud.view.UDViewPager.StateListAnimator
            public void EZpvd() {
                if (UDViewPager.this.htlTjW != null) {
                    UDViewPager.this.htlTjW.invoke(null);
                }
            }

            @Override // com.immomo.mls.fun.ud.view.UDViewPager.StateListAnimator
            public void copydefault() {
                if (UDViewPager.this.fdOvFl != null) {
                    UDViewPager.this.fdOvFl.invoke(null);
                }
            }
        });
    }

    private C7350aiF AhwBna() {
        LuaValue luaValueNil;
        LuaFunction luaFunction = this.igXuih;
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

    @Override // com.immomo.mls.fun.ud.view.UDView
    public void AEQbTJ(float f, int i) {
        super.AEQbTJ(f, i);
        UDViewPagerAdapter uDViewPagerAdapter = this.OFhtUX;
        if (uDViewPagerAdapter == null || uDViewPagerAdapter.EZpvd() == null) {
            return;
        }
        this.OFhtUX.EZpvd().notifyDataSetChanged();
    }

    public void ejfBZ() {
        valueOf().setPageIndicator(null);
        AuCTel();
    }

    private void AuCTel() {
        if (this.fjfviF) {
            if (valueOf().AYXKKw() == null) {
                DefaultPageIndicator defaultPageIndicator = new DefaultPageIndicator(AubY());
                this.fERRXa = defaultPageIndicator;
                defaultPageIndicator.setFillColor(this.Dmq);
                this.fERRXa.setPageColor(this.spnCvw);
                valueOf().setPageIndicator(this.fERRXa);
            }
            this.fERRXa.invalidate();
            return;
        }
        valueOf().setPageIndicator(null);
    }

    public void onClick(View view) {
        copydefault(DbNXlk().getCurrentItem() + 1);
    }

    /* JADX INFO: loaded from: classes14.dex */
    public final class Activity implements InterfaceC7534ale.Application {
        @Override // o.InterfaceC7534ale.Application
        public void AEQbTJ(int i) {
        }

        public Activity() {
        }

        @Override // o.InterfaceC7534ale.Application
        public void OLrzqt(int i) {
            int iEZpvd = UDViewPager.this.EZpvd(i);
            if (UDViewPager.this.QCjLjM != null) {
                UDViewPager.this.QCjLjM.invoke(LuaValue.rNumber(iEZpvd + 1));
            }
        }
    }

    public int EZpvd(int i) {
        C7465akO c7465akO = (C7465akO) DbNXlk().getAdapter();
        return AEQbTJ(c7465akO) ? i % c7465akO.OLrzqt() : i;
    }

    public void AEQbTJ(int i) {
        EZpvd(i, false);
    }

    public void EZpvd(int i, boolean z) {
        if (this.OJuSTm != null) {
            int iEZpvd = EZpvd(i);
            LuaValue luaValueKWHzl = KWHzl(iEZpvd);
            if (luaValueKWHzl.isNil()) {
                return;
            }
            this.OJuSTm.invoke(LuaValue.varargsOf(luaValueKWHzl, LuaNumber.valueOf(iEZpvd + 1)));
            if (z) {
                DbNXlk().AkhnZx = false;
            }
        }
    }

    public void OLrzqt(int i) {
        if (this.OxVOHk != null) {
            int iEZpvd = EZpvd(i);
            LuaValue luaValueKWHzl = KWHzl(iEZpvd);
            if (luaValueKWHzl.isNil()) {
                return;
            }
            this.OxVOHk.invoke(LuaValue.varargsOf(luaValueKWHzl, LuaNumber.valueOf(iEZpvd + 1)));
        }
    }

    public void copydefault(int i) {
        if (this.aUsmxb != null) {
            if (AEQbTJ((C7465akO) DbNXlk().getAdapter())) {
                this.aUsmxb.invoke(LuaValue.rNumber((DbNXlk().getCurrentItem() % r0.OLrzqt()) + 1));
            } else {
                this.aUsmxb.invoke(LuaValue.rNumber(i));
            }
        }
    }

    public boolean AEQbTJ(C7465akO c7465akO) {
        return c7465akO != null && c7465akO.copydefault() && c7465akO.OLrzqt() > 1;
    }

    private LuaValue KWHzl(int i) {
        UDViewPagerAdapter uDViewPagerAdapter = this.OFhtUX;
        if (uDViewPagerAdapter == null) {
            return LuaValue.Nil();
        }
        C7462akL c7462akLEZpvd = uDViewPagerAdapter.EZpvd().EZpvd(i);
        if (c7462akLEZpvd != null) {
            return c7462akLEZpvd.copydefault();
        }
        return LuaValue.Nil();
    }

    private boolean KWHzl(C7465akO c7465akO) {
        return c7465akO.OLrzqt() != 1;
    }

    public void AEQbTJ(int i, float f, int i2) {
        LuaFunction luaFunction = this.DWgRXt;
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(i), LuaNumber.copydefault(f), LuaNumber.valueOf(i2)));
        }
    }

    public void AhwBna(int i) {
        LuaFunction luaFunction = this.KDccX;
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(i)));
        }
    }

    public void AEQbTJ(float f, int i, int i2) {
        this.DGOPHZDGOPHZ = f;
        this.QVsKAR = i;
        this.DaRZkR = i2;
        LuaFunction luaFunction = this.QSLkRj;
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(i + 1), LuaNumber.valueOf(i2 + 1), LuaNumber.copydefault(f)));
        }
        LuaFunction luaFunction2 = this.WS;
        if (luaFunction2 != null) {
            luaFunction2.invoke(null);
        }
        LuaFunction luaFunction3 = this.DCUTEIddSDPG;
        if (luaFunction3 != null) {
            luaFunction3.invoke(LuaValue.varargsOf(LuaNumber.copydefault(f), LuaNumber.valueOf(i + 1), LuaNumber.valueOf(i2 + 1)));
        }
    }

    public void djBIcL(int i) {
        LuaFunction luaFunction = this.zblBkD;
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(i + 1)));
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] refreshEnable(LuaValue[] luaValueArr) {
        if (luaValueArr.length > 0) {
            this.run = luaValueArr[0].toBoolean();
            ((InterfaceC7472akV) f_()).setRefreshEnable(this.run);
            return null;
        }
        return LuaValue.rBoolean(this.run);
    }

    @InterfaceC60044zuT
    public LuaValue[] startRefreshing(LuaValue[] luaValueArr) {
        ((InterfaceC7472akV) f_()).copydefault();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] stopRefreshing(LuaValue[] luaValueArr) {
        ((InterfaceC7472akV) f_()).KWHzl();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setRefreshingCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.heceqZ;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        LuaValue luaValue = luaValueArr[0];
        if (luaValue == null || !luaValue.isFunction()) {
            return null;
        }
        this.heceqZ = luaValue.toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setOnPageTransformCallback(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr != null && luaValueArr.length > 0 && (luaValue = luaValueArr[0]) != null) {
            this.DCUTEIdCUTEI = luaValue.toLuaFunction();
            if (this.DBxZfM == null) {
                this.DBxZfM = new ActionBar();
                ((InterfaceC7534ale) f_()).setPageTransformer(false, this.DBxZfM, 2);
            }
        }
        return LuaValue.varargsOf(this);
    }

    public void OLrzqt() {
        LuaFunction luaFunction = this.heceqZ;
        if (luaFunction != null) {
            luaFunction.invoke(null);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public class ActionBar implements ViewPager.PageTransformer {
        public ActionBar() {
        }

        @Override // androidx.viewpager.widget.ViewPager.PageTransformer
        public void transformPage(@NonNull @NotNull View view, float f) {
            if (UDViewPager.this.DCUTEIdCUTEI != null) {
                UDViewPager.this.DCUTEIdCUTEI.EZpvd(f);
            }
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] setMaterialHeader(LuaValue[] luaValueArr) {
        ((InterfaceC7472akV) f_()).setMaterialHeader();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setNFTManyChainHeader(LuaValue[] luaValueArr) {
        ((InterfaceC7472akV) f_()).setNFTManyChainHeader();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setOKXLiteHeader(LuaValue[] luaValueArr) {
        ((InterfaceC7472akV) f_()).setOKXLiteHeader();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setLottieJson(LuaValue[] luaValueArr) {
        if (luaValueArr.length <= 0) {
            return null;
        }
        ((InterfaceC7472akV) f_()).setLottieJson(luaValueArr[0].toJavaString(), luaValueArr[1].toInt(), luaValueArr[2].toInt());
        return null;
    }

    public void fFgQHt() {
        this.OFhtUX.freeJavaUserData();
        this.OFhtUX.releaseLuaRef();
        this.OFhtUX.onJavaRecycle();
        this.OFhtUX.destroy();
        freeJavaUserData();
        releaseLuaRef();
        onJavaRecycle();
        destroy();
    }
}
