package com.immomo.mls.fun.ud.view.recycler;

import android.content.Context;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.immomo.mls.fun.ud.UDColor;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerLayout;
import com.immomo.mls.utils.AssertUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import o.C7320ahc;
import o.C7322ahe;
import o.C7326ahi;
import o.C7328ahk;
import o.C7350aiF;
import o.C7354aiJ;
import o.C7393aiw;
import o.C7454akD;
import o.C7494akr;
import o.C7501aky;
import o.C7833arL;
import o.InterfaceC60044zuT;
import o.InterfaceC7451akA;
import o.InterfaceC7474akX;
import o.InterfaceC7554aly;
import o.InterfaceC7949atV;
import org.luaj.vm2.JavaUserdata;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public abstract class UDBaseRecyclerAdapter<L extends UDBaseRecyclerLayout> extends JavaUserdata implements InterfaceC7554aly, C7454akD.StateListAnimator {
    public static final String[] valueOf = {"showPressed", "pressedColor", "reuseId", "initCell", "initCellByReuseId", "fillCellData", "fillCellDataByReuseId", "headerValid", "initHeader", "fillHeaderData", "sectionCount", "rowCount", "editParam", "editAction", "selectedRow", "longPressRow", "selectedRowByReuseId", "longPressRowByReuseId", "cellDidDisappear", "cellDidDisappearByReuseId", "cellWillAppear", "cellWillAppearByReuseId", "headerDidDisappear", "headerWillAppear", "isViewHolderCanRecycler", "limitClick"};
    public LuaFunction AkhnZx;
    public Map<String, LuaFunction> AuCTel;
    public boolean AuCTelauCTel;
    public L AubY;
    public InterfaceC7554aly AwvSrB;
    public int AxsJAY;
    public boolean DTwDnp;
    public Map<String, LuaFunction> DbNXlk;
    public SparseArray<String> ORxRYg;
    public UDColor OcIXYQ;
    public LuaFunction QKVWgx;
    public C7494akr QOLQEE;
    public List<Integer> QUSxYX;
    public LuaFunction QVAiDq;
    public LuaFunction QbewEr;
    public LuaFunction QfsBiF;
    public LuaFunction RJOkX;
    public Map<String, LuaFunction> RcXXUw;
    public Map<String, LuaFunction> UeEOUB;
    public int[] aKErDB;
    public Map<String, LuaFunction> dNCPSb;
    public LuaFunction djBIcL;
    public boolean djSkpj;
    public int dvKsVJ;
    public SparseArray<View.OnLongClickListener> dxcTrN;
    public LuaFunction ejfBZ;
    public LuaFunction fARcdN;
    public LuaFunction fFgQHt;
    public LuaFunction fIwbmz;
    public LuaFunction fJNWhG;
    public int fZBcTu;
    public Map<String, LuaFunction> fetchVPNInfo;
    public SparseArray<View.OnClickListener> finit;
    public AtomicInteger gEmmrt;
    public boolean gHZMYf;
    public LuaFunction getFieldNames;
    public LuaFunction getNewProxyInstance;
    public final C7494akr hDKMBd;
    public LuaFunction isConnected;
    public LuaFunction iwGUEr;
    public int sSMYrx;
    public final C7501aky uzCIH;
    public LuaFunction values;
    public InterfaceC7949atV wlaJM;
    public DefaultItemAnimator zLjUOn;
    public C7393aiw zsXlph;
    public View zuBGHE;

    /* JADX INFO: loaded from: classes14.dex */
    public interface Application {
        void copydefault(LuaValue luaValue, int i);
    }

    public abstract int AhwBna();

    public abstract C7350aiF AhwBna(int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AkhnZx() {
        return this.djSkpj;
    }

    public boolean AuCTel(int i) {
        return (i == -2 || i == -1) ? false : true;
    }

    public abstract int EZpvd();

    public void EZpvd(L l) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(C7494akr c7494akr) {
        this.QOLQEE = c7494akr;
    }

    public abstract C7350aiF KWHzl(int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(View view) {
        this.zuBGHE = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C7454akD.StateListAnimator
    public boolean KWHzl() {
        return this.QbewEr != null;
    }

    public ViewGroup.LayoutParams OLrzqt(ViewGroup.LayoutParams layoutParams, int i) {
        return layoutParams;
    }

    public abstract ViewGroup.LayoutParams OLrzqt(ViewGroup.LayoutParams layoutParams, boolean z);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        if (this.fZBcTu != 0 && this.dvKsVJ != 0) {
            return false;
        }
        this.gHZMYf = true;
        return true;
    }

    public abstract C7350aiF copydefault(int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(InterfaceC7554aly interfaceC7554aly) {
        this.AwvSrB = interfaceC7554aly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(InterfaceC7949atV interfaceC7949atV) {
        this.wlaJM = interfaceC7949atV;
    }

    public abstract boolean copydefault();

    @InterfaceC60044zuT
    public LuaValue[] editAction(LuaValue[] luaValueArr) {
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] editParam(LuaValue[] luaValueArr) {
        return null;
    }

    public abstract RecyclerView.LayoutManager fetchVPNInfo();

    public void gEmmrt(int i) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public L isConnected() {
        return this.AubY;
    }

    public void uzCIH() {
    }

    @InterfaceC60044zuT
    public UDBaseRecyclerAdapter(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.AuCTelauCTel = true;
        this.djSkpj = false;
        this.DTwDnp = false;
        this.gHZMYf = false;
        this.sSMYrx = 1;
        this.hDKMBd = new C7494akr();
        this.AxsJAY = -2894893;
        this.uzCIH = new C7501aky();
    }

    public Context valueOf() {
        C7322ahe c7322ahe = (C7322ahe) this.globals.AuCTel();
        if (c7322ahe != null) {
            return c7322ahe.AEQbTJ;
        }
        return null;
    }

    public void AhwBna(int i, int i2) {
        if (this.fZBcTu == i && this.dvKsVJ == i2) {
            return;
        }
        this.fZBcTu = i;
        this.dvKsVJ = i2;
        if (this.DTwDnp && i > 0 && i2 > 0) {
            hDKMBd();
        } else {
            if (!this.gHZMYf || i <= 0 || i2 <= 0) {
                return;
            }
            gEmmrt().notifyDataSetChanged();
        }
    }

    public void hDKMBd() {
        if (this.fZBcTu == 0 || this.dvKsVJ == 0) {
            this.DTwDnp = true;
            return;
        }
        copydefault(false);
        fJNWhG();
        gEmmrt().notifyDataSetChanged();
        AEQbTJ();
    }

    public void EZpvd(int i, int i2, boolean z) {
        fARcdN(copydefault(i, i2));
    }

    public void AEQbTJ(int i, int i2) {
        gEmmrt(copydefault(i, i2));
    }

    public void AEQbTJ(int i, boolean z) {
        fJNWhG();
        if (djBIcL()) {
            int[] iArr = this.aKErDB;
            int i2 = i << 1;
            if (i2 >= iArr.length) {
                if (C7326ahi.EZpvd) {
                    IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("section over the source data");
                    if (!C7320ahc.AEQbTJ(indexOutOfBoundsException, getGlobals())) {
                        throw indexOutOfBoundsException;
                    }
                    return;
                }
                return;
            }
            int i3 = iArr[i2];
            KWHzl(i3, iArr[i2 + 1] - i3);
        }
    }

    public void OLrzqt(int i, int i2) {
        fJNWhG();
        fIwbmz(copydefault(i, i2));
    }

    public void KWHzl(int i, int i2, boolean z) {
        copydefault(z);
        fJNWhG();
        fIwbmz(copydefault(i, i2));
    }

    public void copydefault(boolean z) {
        KeyEvent.Callback callback = this.zuBGHE;
        if (callback instanceof InterfaceC7474akX) {
            RecyclerView recyclerViewKWHzl = ((InterfaceC7474akX) callback).KWHzl();
            if (z) {
                fARcdN();
                if (recyclerViewKWHzl.getItemAnimator() == null) {
                    recyclerViewKWHzl.setItemAnimator(this.zLjUOn);
                    return;
                }
                return;
            }
            recyclerViewKWHzl.setItemAnimator(null);
        }
    }

    public final void fARcdN() {
        if (this.zLjUOn == null) {
            this.zLjUOn = new DefaultItemAnimator();
        }
    }

    public void EZpvd(int i, int i2) {
        int iCopydefault = copydefault(i, i2);
        fJNWhG();
        fJNWhG(iCopydefault);
    }

    public void AEQbTJ(int i, int i2, boolean z) {
        copydefault(z);
        int iCopydefault = copydefault(i, i2);
        fJNWhG();
        fJNWhG(iCopydefault);
    }

    public void AEQbTJ(int i, int i2, int i3) {
        fJNWhG();
        AYXKKw(copydefault(i, i2), i3);
    }

    public void KWHzl(int i, int i2, int i3) {
        int iCopydefault = copydefault(i, i2);
        fJNWhG();
        valueOf(iCopydefault, i3);
    }

    public C7393aiw gEmmrt() {
        if (this.zsXlph == null) {
            this.zsXlph = new C7393aiw(this, this.wlaJM);
        }
        return this.zsXlph;
    }

    public void AEQbTJ(L l, View view) {
        this.AubY = l;
        KWHzl(view);
        EZpvd(l);
    }

    public void ejfBZ(int i) {
        if (this.sSMYrx != i) {
            this.sSMYrx = i;
            uzCIH();
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] showPressed(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length >= 1 && (luaValue = luaValueArr[0]) != null) {
            this.djSkpj = luaValue.toBoolean();
            C7393aiw c7393aiw = this.zsXlph;
            if (c7393aiw == null) {
                return null;
            }
            c7393aiw.notifyDataSetChanged();
            return null;
        }
        return LuaValue.rBoolean(AkhnZx());
    }

    @InterfaceC60044zuT
    public LuaValue[] pressedColor(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return LuaValue.varargsOf(values());
        }
        if (luaValueArr[0] == LuaValue.Nil()) {
            this.AxsJAY = -2894893;
        } else {
            this.AxsJAY = ((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals);
        }
        C7393aiw c7393aiw = this.zsXlph;
        if (c7393aiw != null) {
            c7393aiw.notifyDataSetChanged();
        }
        luaValueArr[0].destroy();
        return null;
    }

    public UDColor values() {
        if (this.OcIXYQ == null) {
            UDColor uDColor = new UDColor(this.globals, this.AxsJAY);
            this.OcIXYQ = uDColor;
            uDColor.onJavaRef();
        }
        this.OcIXYQ.copydefault(this.AxsJAY);
        return this.OcIXYQ;
    }

    @InterfaceC60044zuT
    public LuaValue[] reuseId(LuaValue[] luaValueArr) {
        this.QKVWgx = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] initCell(LuaValue[] luaValueArr) {
        this.getFieldNames = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] initCellByReuseId(LuaValue[] luaValueArr) {
        if (this.dNCPSb == null) {
            this.dNCPSb = new HashMap();
        }
        this.dNCPSb.put(luaValueArr[0].toJavaString(), luaValueArr[1].toLuaFunction());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] headerValid(LuaValue[] luaValueArr) {
        this.iwGUEr = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] initHeader(LuaValue[] luaValueArr) {
        this.getNewProxyInstance = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] fillHeaderData(LuaValue[] luaValueArr) {
        this.values = luaValueArr[0].toLuaFunction();
        return null;
    }

    public void AuCTel() {
        LuaFunction luaFunction = this.iwGUEr;
        if (luaFunction != null) {
            LuaValue[] luaValueArrInvoke = luaFunction.invoke(null);
            if (luaValueArrInvoke != null && luaValueArrInvoke.length > 0 && luaValueArrInvoke[0].isBoolean() && luaValueArrInvoke[0].toBoolean()) {
                C7393aiw c7393aiw = this.zsXlph;
                if (c7393aiw == null || c7393aiw.KWHzl() != 0) {
                    return;
                }
                this.zsXlph.copydefault(new FrameLayout(valueOf()));
                return;
            }
            if (this.zsXlph.KWHzl() > 0) {
                this.zsXlph.AEQbTJ();
            }
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] fillCellData(LuaValue[] luaValueArr) {
        this.djBIcL = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] limitClick(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            this.AuCTelauCTel = luaValueArr[0].toBoolean();
            return null;
        }
        return LuaValue.varargsOf(LuaValue.rBoolean(this.AuCTelauCTel));
    }

    @InterfaceC60044zuT
    public LuaValue[] fillCellDataByReuseId(LuaValue[] luaValueArr) {
        if (this.DbNXlk == null) {
            this.DbNXlk = new HashMap();
        }
        this.DbNXlk.put(luaValueArr[0].toJavaString(), luaValueArr[1].toLuaFunction());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] sectionCount(LuaValue[] luaValueArr) {
        this.QfsBiF = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] rowCount(LuaValue[] luaValueArr) {
        this.RJOkX = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] isViewHolderCanRecycler(LuaValue[] luaValueArr) {
        this.fFgQHt = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] selectedRow(LuaValue[] luaValueArr) {
        this.ejfBZ = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] longPressRow(LuaValue[] luaValueArr) {
        this.fIwbmz = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] selectedRowByReuseId(LuaValue[] luaValueArr) {
        if (this.UeEOUB == null) {
            this.UeEOUB = new HashMap();
        }
        this.UeEOUB.put(luaValueArr[0].toJavaString(), luaValueArr[1].toLuaFunction());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] longPressRowByReuseId(LuaValue[] luaValueArr) {
        if (this.RcXXUw == null) {
            this.RcXXUw = new HashMap();
        }
        this.RcXXUw.put(luaValueArr[0].toJavaString(), luaValueArr[1].toLuaFunction());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] cellDidDisappear(LuaValue[] luaValueArr) {
        this.AkhnZx = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] cellDidDisappearByReuseId(LuaValue[] luaValueArr) {
        if (this.AuCTel == null) {
            this.AuCTel = new HashMap();
        }
        this.AuCTel.put(luaValueArr[0].toJavaString(), luaValueArr[1].toLuaFunction());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] cellWillAppear(LuaValue[] luaValueArr) {
        this.isConnected = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] cellWillAppearByReuseId(LuaValue[] luaValueArr) {
        if (this.fetchVPNInfo == null) {
            this.fetchVPNInfo = new HashMap();
        }
        this.fetchVPNInfo.put(luaValueArr[0].toJavaString(), luaValueArr[1].toLuaFunction());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] headerDidDisappear(LuaValue[] luaValueArr) {
        this.fARcdN = luaValueArr[0].toLuaFunction();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] headerWillAppear(LuaValue[] luaValueArr) {
        this.fJNWhG = luaValueArr[0].toLuaFunction();
        return null;
    }

    public long AYXKKw(int i) {
        return this.uzCIH.copydefault(i, values(i));
    }

    public boolean iwGUEr(int i) {
        LuaFunction luaFunction = this.fFgQHt;
        if (luaFunction != null) {
            return luaFunction.invoke(LuaValue.rNumber(i))[0].toBoolean();
        }
        return true;
    }

    public int values(int i) {
        String strDbNXlk = DbNXlk(i);
        C7494akr c7494akr = this.QOLQEE;
        if (c7494akr != null) {
            return c7494akr.AEQbTJ(strDbNXlk);
        }
        return this.hDKMBd.AEQbTJ(strDbNXlk);
    }

    public int AkhnZx(int i) {
        int[] iArrFetchVPNInfo;
        if (!AEQbTJ(i) || (iArrFetchVPNInfo = fetchVPNInfo(i)) == null || iArrFetchVPNInfo.length == 0) {
            return 0;
        }
        return this.QVAiDq.invoke(LuaValue.rNumber(iArrFetchVPNInfo[0] + 1))[0].toInt();
    }

    @Override // o.C7454akD.StateListAnimator
    public boolean AEQbTJ(int i) {
        List<Integer> list;
        return (this.QbewEr == null || (list = this.QUSxYX) == null || !list.contains(Integer.valueOf(i))) ? false : true;
    }

    @Override // o.C7454akD.StateListAnimator
    public View EZpvd(int i) {
        int[] iArrFetchVPNInfo = fetchVPNInfo(i);
        if (iArrFetchVPNInfo == null || iArrFetchVPNInfo.length == 0) {
            return null;
        }
        try {
            return ((UDView) this.QbewEr.invoke(LuaValue.rNumber(iArrFetchVPNInfo[0] + 1))[0].toUserdata()).f_();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // o.C7454akD.StateListAnimator
    public int OLrzqt(int i) {
        while (!AEQbTJ(i)) {
            i--;
            if (i < 0) {
                return 0;
            }
        }
        return i;
    }

    public View.OnClickListener KWHzl(LuaValue luaValue, int i) {
        if (this.ejfBZ == null && this.UeEOUB == null) {
            return null;
        }
        if (this.finit == null) {
            this.finit = new SparseArray<>();
        }
        View.OnClickListener onClickListener = this.finit.get(i);
        if (onClickListener != null) {
            if (onClickListener instanceof Application) {
                ((Application) onClickListener).copydefault(luaValue, i);
            }
            return onClickListener;
        }
        Activity activity = new Activity(luaValue, i, this);
        this.finit.put(i, activity);
        return activity;
    }

    public View.OnLongClickListener OLrzqt(LuaValue luaValue, int i) {
        if (this.fIwbmz == null && this.RcXXUw == null) {
            return null;
        }
        if (this.dxcTrN == null) {
            this.dxcTrN = new SparseArray<>();
        }
        View.OnLongClickListener onLongClickListener = this.dxcTrN.get(i);
        if (onLongClickListener != null) {
            if (onLongClickListener instanceof Application) {
                ((Application) onLongClickListener).copydefault(luaValue, i);
            }
            return onLongClickListener;
        }
        TaskDescription taskDescription = new TaskDescription(luaValue, i, this);
        this.dxcTrN.put(i, taskDescription);
        return taskDescription;
    }

    public int fIwbmz() {
        int i;
        AtomicInteger atomicInteger = this.gEmmrt;
        if (atomicInteger != null && (i = atomicInteger.get()) >= 0) {
            return i;
        }
        fJNWhG();
        return this.gEmmrt.get();
    }

    public void copydefault(LuaValue luaValue, int i) {
        LuaFunction luaFunction;
        if (this.dNCPSb != null) {
            luaFunction = this.dNCPSb.get(isConnected(i));
        } else {
            luaFunction = null;
        }
        if (luaFunction == null) {
            luaFunction = this.getFieldNames;
        }
        if (!this.globals.isDestroyed() && AssertUtils.EZpvd(luaFunction, "必须通过initCell将函数设置到adapter中", getGlobals())) {
            luaFunction.invoke(LuaValue.varargsOf(luaValue));
        }
    }

    public void copydefault(LuaValue luaValue) {
        LuaFunction luaFunction = this.getNewProxyInstance;
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.varargsOf(luaValue));
        } else {
            C7833arL.valueOf("initHeader callback must not be nil!", this.globals);
        }
    }

    public void AEQbTJ(LuaValue luaValue, int i) {
        LuaFunction luaFunction = this.values;
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.varargsOf(luaValue, valueOf(1), valueOf(i)));
        }
    }

    public boolean ejfBZ() {
        LuaFunction luaFunction = this.iwGUEr;
        if (luaFunction == null) {
            return false;
        }
        LuaValue[] luaValueArrInvoke = luaFunction.invoke(null);
        return luaValueArrInvoke.length > 0 && luaValueArrInvoke[0].toBoolean();
    }

    public void EZpvd(LuaValue luaValue, int i) {
        Map<String, LuaFunction> map = this.DbNXlk;
        LuaFunction luaFunction = map != null ? map.get(DbNXlk(i)) : null;
        if (luaFunction == null) {
            luaFunction = this.djBIcL;
        }
        if (luaFunction != null) {
            int[] iArrFetchVPNInfo = fetchVPNInfo(i);
            luaFunction.invoke(LuaValue.varargsOf(luaValue, valueOf(iArrFetchVPNInfo[0]), valueOf(iArrFetchVPNInfo[1])));
        }
    }

    public void copydefault(C7354aiJ c7354aiJ) {
        LuaFunction luaFunction;
        int[] iArrFetchVPNInfo;
        LuaFunction luaFunction2;
        int[] iArrFetchVPNInfo2;
        LuaFunction luaFunction3;
        LuaFunction luaFunction4;
        if (this.AkhnZx == null && this.fARcdN == null && this.AuCTel == null) {
            return;
        }
        int adapterPosition = c7354aiJ.getAdapterPosition();
        int iKWHzl = this.zsXlph.KWHzl();
        if (adapterPosition == -1) {
            if (c7354aiJ.OLrzqt() == null && (luaFunction4 = this.fARcdN) != null) {
                luaFunction4.invoke(null);
                return;
            }
            String strOLrzqt = this.hDKMBd.OLrzqt(c7354aiJ.getItemViewType());
            Map<String, LuaFunction> map = this.AuCTel;
            luaFunction = map != null ? map.get(strOLrzqt) : null;
            if (luaFunction == null && (luaFunction3 = this.AkhnZx) != null) {
                luaFunction = luaFunction3;
            }
            if (luaFunction == null || (iArrFetchVPNInfo2 = fetchVPNInfo(c7354aiJ.getLayoutPosition() - iKWHzl)) == null) {
                return;
            }
            luaFunction.invoke(LuaValue.varargsOf(c7354aiJ.OLrzqt(), valueOf(iArrFetchVPNInfo2[0]), valueOf(iArrFetchVPNInfo2[1])));
            return;
        }
        if (adapterPosition < iKWHzl) {
            LuaFunction luaFunction5 = this.fARcdN;
            if (luaFunction5 != null) {
                luaFunction5.invoke(null);
                return;
            }
            return;
        }
        int i = adapterPosition - iKWHzl;
        Map<String, LuaFunction> map2 = this.AuCTel;
        luaFunction = map2 != null ? map2.get(DbNXlk(i)) : null;
        if (luaFunction == null && (luaFunction2 = this.AkhnZx) != null) {
            luaFunction = luaFunction2;
        }
        if (luaFunction == null || (iArrFetchVPNInfo = fetchVPNInfo(i)) == null) {
            return;
        }
        luaFunction.invoke(LuaValue.varargsOf(c7354aiJ.OLrzqt(), valueOf(iArrFetchVPNInfo[0]), valueOf(iArrFetchVPNInfo[1])));
    }

    public void OLrzqt(C7354aiJ c7354aiJ) {
        int[] iArrFetchVPNInfo;
        LuaFunction luaFunction;
        if (this.isConnected == null && this.fJNWhG == null && this.fetchVPNInfo == null) {
            return;
        }
        int iKWHzl = this.zsXlph.KWHzl();
        int adapterPosition = c7354aiJ.getAdapterPosition();
        if (adapterPosition < iKWHzl) {
            LuaFunction luaFunction2 = this.fJNWhG;
            if (luaFunction2 != null) {
                luaFunction2.invoke(null);
                return;
            }
            return;
        }
        int i = adapterPosition - iKWHzl;
        Map<String, LuaFunction> map = this.fetchVPNInfo;
        LuaFunction luaFunction3 = map != null ? map.get(DbNXlk(i)) : null;
        if (luaFunction3 == null && (luaFunction = this.isConnected) != null) {
            luaFunction3 = luaFunction;
        }
        if (luaFunction3 == null || (iArrFetchVPNInfo = fetchVPNInfo(i)) == null) {
            return;
        }
        luaFunction3.invoke(LuaValue.varargsOf(c7354aiJ.OLrzqt(), valueOf(iArrFetchVPNInfo[0]), valueOf(iArrFetchVPNInfo[1])));
    }

    public void fARcdN(int i) {
        C7393aiw c7393aiwGEmmrt = gEmmrt();
        c7393aiwGEmmrt.notifyItemChanged(i + c7393aiwGEmmrt.KWHzl());
    }

    public void KWHzl(int i, int i2) {
        C7393aiw c7393aiwGEmmrt = gEmmrt();
        c7393aiwGEmmrt.notifyItemRangeChanged(c7393aiwGEmmrt.KWHzl() + i, i2);
        djBIcL(i);
    }

    public void fJNWhG(int i) {
        C7393aiw c7393aiwGEmmrt = gEmmrt();
        c7393aiwGEmmrt.notifyItemRemoved(c7393aiwGEmmrt.KWHzl() + i);
        djBIcL(i);
    }

    public void valueOf(int i, int i2) {
        C7393aiw c7393aiwGEmmrt = gEmmrt();
        c7393aiwGEmmrt.notifyItemRangeRemoved(c7393aiwGEmmrt.KWHzl() + i, i2);
        djBIcL(i);
    }

    public void fIwbmz(int i) {
        C7393aiw c7393aiwGEmmrt = gEmmrt();
        c7393aiwGEmmrt.notifyItemInserted(c7393aiwGEmmrt.KWHzl() + i);
        djBIcL(i);
    }

    public void AYXKKw(int i, int i2) {
        C7393aiw c7393aiwGEmmrt = gEmmrt();
        c7393aiwGEmmrt.notifyItemRangeInserted(c7393aiwGEmmrt.KWHzl() + i, i2);
        djBIcL(i);
    }

    public int DbNXlk() {
        int i;
        LuaValue luaValueNil;
        LuaFunction luaFunction = this.QfsBiF;
        if (luaFunction == null || !luaFunction.isFunction()) {
            i = 1;
        } else {
            LuaValue[] luaValueArrInvoke = this.QfsBiF.invoke(null);
            i = 0;
            if (luaValueArrInvoke == null || luaValueArrInvoke.length == 0) {
                luaValueNil = LuaValue.Nil();
            } else {
                luaValueNil = luaValueArrInvoke[0];
            }
            if (AssertUtils.EZpvd(luaValueNil, this.QfsBiF, getGlobals())) {
                i = luaValueNil.toInt();
            }
        }
        if (i > 0) {
            return i;
        }
        if (!C7326ahi.EZpvd) {
            return 1;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("section count must bigger than 0, return " + i);
        if (C7320ahc.AEQbTJ(illegalArgumentException, getGlobals())) {
            return 1;
        }
        throw illegalArgumentException;
    }

    public final int[] EZpvd(AtomicInteger atomicInteger) {
        LuaValue luaValueNil;
        LuaFunction luaFunction = this.RJOkX;
        if (luaFunction == null || luaFunction.isNil()) {
            return null;
        }
        int iDbNXlk = DbNXlk() << 1;
        int[] iArr = new int[iDbNXlk];
        if (KWHzl() && this.QUSxYX == null) {
            this.QUSxYX = new ArrayList();
        }
        List<Integer> list = this.QUSxYX;
        if (list != null) {
            list.clear();
        }
        int i = 0;
        for (int i2 = 0; i2 < iDbNXlk; i2 += 2) {
            LuaValue[] luaValueArrInvoke = this.RJOkX.invoke(LuaValue.varargsOf(valueOf(i2 >> 1)));
            if (luaValueArrInvoke == null || luaValueArrInvoke.length == 0) {
                luaValueNil = LuaValue.Nil();
            } else {
                luaValueNil = luaValueArrInvoke[0];
            }
            iArr[i2] = i;
            List<Integer> list2 = this.QUSxYX;
            if (list2 != null) {
                list2.add(Integer.valueOf(i));
            }
            if (AssertUtils.EZpvd(luaValueNil, this.RJOkX, getGlobals())) {
                i += luaValueNil.toInt();
            }
            iArr[i2 + 1] = i;
            List<Integer> list3 = this.QUSxYX;
            if (list3 != null) {
                list3.add(Integer.valueOf(i));
            }
        }
        if (atomicInteger != null) {
            atomicInteger.set(i);
        }
        return iArr;
    }

    public int[] fetchVPNInfo(int i) {
        int[] iArr = this.aKErDB;
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2 += 2) {
            int[] iArr2 = this.aKErDB;
            int i3 = i - iArr2[i2];
            if (i3 >= 0 && i < iArr2[i2 + 1]) {
                return new int[]{i2 >> 1, i3};
            }
        }
        return null;
    }

    public String DbNXlk(int i) {
        int[] iArrFetchVPNInfo;
        String string;
        String str;
        SparseArray<String> sparseArray = this.ORxRYg;
        if (sparseArray != null && (str = sparseArray.get(i)) != null) {
            return str;
        }
        LuaFunction luaFunction = this.QKVWgx;
        if (luaFunction == null || luaFunction.isNil() || (iArrFetchVPNInfo = fetchVPNInfo(i)) == null) {
            return null;
        }
        LuaValue[] luaValueArrInvoke = this.QKVWgx.invoke(LuaValue.varargsOf(valueOf(iArrFetchVPNInfo[0]), valueOf(iArrFetchVPNInfo[1])));
        LuaValue luaValueNil = (luaValueArrInvoke == null || luaValueArrInvoke.length <= 0) ? LuaValue.Nil() : luaValueArrInvoke[0];
        if (AssertUtils.OLrzqt(luaValueNil, this.QKVWgx, getGlobals())) {
            string = luaValueNil.toJavaString();
        } else {
            string = luaValueNil.toString();
        }
        if (C7326ahi.EZpvd && "".equals(string)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("reuseId  can`t be ”“");
            if (!C7320ahc.AEQbTJ(illegalArgumentException, getGlobals())) {
                throw illegalArgumentException;
            }
        }
        if (this.ORxRYg == null) {
            this.ORxRYg = new SparseArray<>();
        }
        this.ORxRYg.put(i, string);
        return string;
    }

    public String isConnected(int i) {
        C7494akr c7494akr = this.QOLQEE;
        if (c7494akr != null) {
            return c7494akr.OLrzqt(i);
        }
        return this.hDKMBd.OLrzqt(i);
    }

    public int copydefault(int i, int i2) {
        if (!djBIcL()) {
            return 0;
        }
        int[] iArr = this.aKErDB;
        int i3 = i << 1;
        if (i3 >= iArr.length) {
            if (C7326ahi.EZpvd) {
                IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("section over the source data");
                if (!C7320ahc.AEQbTJ(indexOutOfBoundsException, getGlobals())) {
                    throw indexOutOfBoundsException;
                }
            }
            return 0;
        }
        if (C7326ahi.EZpvd && (i2 >= iArr[i3 + 1] - iArr[i3] || i2 < 0)) {
            IndexOutOfBoundsException indexOutOfBoundsException2 = new IndexOutOfBoundsException("row  = " + i2 + "  IndexOutOfBoundsException ");
            if (!C7320ahc.AEQbTJ(indexOutOfBoundsException2, getGlobals())) {
                throw indexOutOfBoundsException2;
            }
        }
        return this.aKErDB[i3] + i2;
    }

    public boolean djBIcL() {
        return this.aKErDB != null && this.gEmmrt.get() >= 0;
    }

    public final void fJNWhG() {
        if (this.gEmmrt == null) {
            this.gEmmrt = new AtomicInteger();
        }
        this.gEmmrt.set(-1);
        this.aKErDB = EZpvd(this.gEmmrt);
    }

    public static void OLrzqt(SparseArray sparseArray, int i) {
        if (sparseArray == null) {
            return;
        }
        int size = sparseArray.size();
        while (i < size) {
            sparseArray.removeAt(i);
            i++;
        }
    }

    public static LuaValue valueOf(int i) {
        return LuaNumber.valueOf(i + 1);
    }

    public void djBIcL(int i) {
        OLrzqt(this.finit, i);
        OLrzqt(this.ORxRYg, i);
        this.uzCIH.OLrzqt(i);
    }

    public void AEQbTJ() {
        SparseArray<View.OnClickListener> sparseArray = this.finit;
        if (sparseArray != null) {
            sparseArray.clear();
        }
        SparseArray<String> sparseArray2 = this.ORxRYg;
        if (sparseArray2 != null) {
            sparseArray2.clear();
        }
        this.uzCIH.KWHzl();
        AuCTel();
        iwGUEr();
    }

    public void AEQbTJ(boolean z) {
        L l = this.AubY;
        if (l != null) {
            l.EZpvd(z);
        }
    }

    @Override // o.InterfaceC7554aly
    public void getFieldNames() {
        InterfaceC7554aly interfaceC7554aly = this.AwvSrB;
        if (interfaceC7554aly != null) {
            interfaceC7554aly.getFieldNames();
        }
    }

    public final void iwGUEr() {
        if (this.AubY instanceof InterfaceC7451akA) {
            KeyEvent.Callback callback = this.zuBGHE;
            if (callback instanceof InterfaceC7474akX) {
                copydefault(((InterfaceC7474akX) callback).KWHzl());
            }
        }
    }

    public void copydefault(RecyclerView recyclerView) {
        int[] iArrEZpvd = ((InterfaceC7451akA) this.AubY).EZpvd();
        int i = iArrEZpvd[0];
        if (i <= 0 && iArrEZpvd[1] <= 0 && iArrEZpvd[2] <= 0) {
            int i2 = iArrEZpvd[3];
        }
        L l = this.AubY;
        if (l instanceof UDCollectionLayout) {
            if (l.orientation == 1) {
                recyclerView.setPaddingRelative(i - l.gEmmrt(), iArrEZpvd[1], iArrEZpvd[2] - this.AubY.gEmmrt(), 0);
                return;
            } else {
                recyclerView.setPaddingRelative(i, iArrEZpvd[1] - l.djBIcL(), 0, iArrEZpvd[3] - this.AubY.djBIcL());
                return;
            }
        }
        if (l instanceof UDWaterFallLayout) {
            recyclerView.setPaddingRelative(i - (l.gEmmrt() / 2), iArrEZpvd[1], iArrEZpvd[2] - (this.AubY.gEmmrt() / 2), 0);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class Activity implements View.OnClickListener, Application {
        public int AEQbTJ;
        public LuaValue KWHzl;
        public WeakReference<UDBaseRecyclerAdapter> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter.Application
        public void copydefault(LuaValue luaValue, int i) {
            this.AEQbTJ = i;
            this.KWHzl = luaValue;
        }

        public Activity(LuaValue luaValue, int i, UDBaseRecyclerAdapter uDBaseRecyclerAdapter) {
            this.AEQbTJ = i;
            this.KWHzl = luaValue;
            this.OLrzqt = new WeakReference<>(uDBaseRecyclerAdapter);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UDBaseRecyclerAdapter uDBaseRecyclerAdapter = this.OLrzqt.get();
            if (uDBaseRecyclerAdapter != null) {
                if (!uDBaseRecyclerAdapter.AuCTelauCTel || uDBaseRecyclerAdapter.getNewProxyInstance()) {
                    LuaFunction luaFunction = uDBaseRecyclerAdapter.UeEOUB != null ? (LuaFunction) uDBaseRecyclerAdapter.UeEOUB.get(uDBaseRecyclerAdapter.DbNXlk(this.AEQbTJ)) : null;
                    if (luaFunction == null) {
                        luaFunction = uDBaseRecyclerAdapter.ejfBZ;
                    }
                    if (luaFunction != null) {
                        int[] iArrFetchVPNInfo = uDBaseRecyclerAdapter.fetchVPNInfo(this.AEQbTJ);
                        luaFunction.invoke(LuaValue.varargsOf(this.KWHzl, UDBaseRecyclerAdapter.valueOf(iArrFetchVPNInfo[0]), UDBaseRecyclerAdapter.valueOf(iArrFetchVPNInfo[1])));
                    }
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class TaskDescription implements View.OnLongClickListener, Application {
        public int EZpvd;
        public WeakReference<UDBaseRecyclerAdapter> KWHzl;
        public LuaValue copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter.Application
        public void copydefault(LuaValue luaValue, int i) {
            this.EZpvd = i;
            this.copydefault = luaValue;
        }

        public TaskDescription(LuaValue luaValue, int i, UDBaseRecyclerAdapter uDBaseRecyclerAdapter) {
            this.EZpvd = i;
            this.copydefault = luaValue;
            this.KWHzl = new WeakReference<>(uDBaseRecyclerAdapter);
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            UDBaseRecyclerAdapter uDBaseRecyclerAdapter = this.KWHzl.get();
            if (uDBaseRecyclerAdapter != null && uDBaseRecyclerAdapter.getNewProxyInstance()) {
                LuaFunction luaFunction = uDBaseRecyclerAdapter.RcXXUw != null ? (LuaFunction) uDBaseRecyclerAdapter.RcXXUw.get(uDBaseRecyclerAdapter.DbNXlk(this.EZpvd)) : null;
                if (luaFunction == null) {
                    luaFunction = uDBaseRecyclerAdapter.fIwbmz;
                }
                if (luaFunction != null) {
                    int[] iArrFetchVPNInfo = uDBaseRecyclerAdapter.fetchVPNInfo(this.EZpvd);
                    luaFunction.invoke(LuaValue.varargsOf(this.copydefault, UDBaseRecyclerAdapter.valueOf(iArrFetchVPNInfo[0]), UDBaseRecyclerAdapter.valueOf(iArrFetchVPNInfo[1])));
                }
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean getNewProxyInstance() {
        C7322ahe c7322ahe = (C7322ahe) getGlobals().AuCTel();
        C7328ahk c7328ahk = c7322ahe != null ? c7322ahe.copydefault : null;
        if (c7328ahk != null) {
            return c7328ahk.valueOf().OLrzqt();
        }
        return true;
    }

    public void AYXKKw() {
        SparseArray<View.OnClickListener> sparseArray = this.finit;
        if (sparseArray != null) {
            sparseArray.clear();
        }
        SparseArray<View.OnLongClickListener> sparseArray2 = this.dxcTrN;
        if (sparseArray2 != null) {
            sparseArray2.clear();
        }
        this.AwvSrB = null;
        this.zuBGHE = null;
    }
}
