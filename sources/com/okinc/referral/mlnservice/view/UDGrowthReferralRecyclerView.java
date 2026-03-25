package com.okinc.referral.mlnservice.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter;
import com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerLayout;
import com.immomo.mls.fun.ud.view.recycler.UDRecyclerView;
import o.C33570myu;
import o.C48734ubK;
import o.C48742ubS;
import o.C7865arr;
import o.InterfaceC60044zuT;
import o.InterfaceC7474akX;
import o.InterfaceC7554aly;
import o.pUU;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC60044zuT
public class UDGrowthReferralRecyclerView<T extends ViewGroup & InterfaceC7474akX & InterfaceC7554aly, A extends UDBaseRecyclerAdapter, L extends UDBaseRecyclerLayout> extends UDRecyclerView<T, A, L> {
    public C48734ubK OHqIaq;
    public C48742ubS QOLQEE;
    public LuaFunction gHZMYf;
    public int zuBGHE;
    public static final String[] sSMYrx = {"OKGrowthReferralCollectionView"};
    public static final String[] AwvSrB = {"setClickCallback", "getCenterIndex", "supportReferralPageScroll", "updateScale", "scrollToItemByIndex", "customItemWidth", "scrollToPositionWithoutAni", "setAdapterSynGrowth", "autoMirrored", "scrollToPositionByCellWidthWithoutAni"};

    @InterfaceC60044zuT
    public UDGrowthReferralRecyclerView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.zuBGHE = CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA;
        this.OHqIaq = new C48734ubK();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.recycler.UDRecyclerView, com.immomo.mls.fun.ud.view.UDViewGroup, com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: EZpvd */
    public T AEQbTJ(LuaValue[] luaValueArr) {
        boolean z = false;
        if (luaValueArr.length > 0 && luaValueArr[0].isBoolean()) {
            this.fARcdN = luaValueArr[0].toBoolean();
        }
        boolean z2 = (luaValueArr.length <= 1 || !luaValueArr[1].isBoolean()) ? false : luaValueArr[1].toBoolean();
        if (luaValueArr.length > 2 && luaValueArr[2].isBoolean()) {
            z = luaValueArr[2].toBoolean();
        }
        C48742ubS c48742ubS = new C48742ubS(AubY(), this, this.fARcdN, z2);
        this.QOLQEE = c48742ubS;
        c48742ubS.setViewpager(z);
        return this.QOLQEE;
    }

    @InterfaceC60044zuT
    public LuaValue[] customItemWidth(LuaValue[] luaValueArr) {
        if (this.QOLQEE != null && luaValueArr.length > 0 && luaValueArr[0].isInt()) {
            this.zuBGHE = luaValueArr[0].toInt();
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] updateScale(LuaValue[] luaValueArr) {
        if (this.QOLQEE != null && luaValueArr.length == 1) {
            this.QOLQEE.OLrzqt(luaValueArr[0].toFloat());
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] supportReferralPageScroll(LuaValue[] luaValueArr) {
        C48742ubS c48742ubS = this.QOLQEE;
        if (c48742ubS == null) {
            return null;
        }
        RecyclerView recyclerViewKWHzl = c48742ubS.KWHzl();
        recyclerViewKWHzl.setOnFlingListener(null);
        if (this.OHqIaq == null) {
            this.OHqIaq = new C48734ubK();
        }
        this.OHqIaq.attachToRecyclerView(recyclerViewKWHzl);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setClickCallback(LuaValue[] luaValueArr) {
        View viewFindSnapView;
        LuaFunction luaFunction = this.gHZMYf;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        if (this.QOLQEE != null && this.copydefault != null && this.OHqIaq != null && luaValueArr.length == 2 && luaValueArr[0].isInt() && luaValueArr[1].isFunction()) {
            int i = luaValueArr[0].toInt();
            RecyclerView recyclerViewKWHzl = this.QOLQEE.KWHzl();
            recyclerViewKWHzl.setOnFlingListener(null);
            RecyclerView.LayoutManager layoutManagerFetchVPNInfo = this.copydefault.fetchVPNInfo();
            if (layoutManagerFetchVPNInfo == null || (viewFindSnapView = this.OHqIaq.findSnapView(layoutManagerFetchVPNInfo)) == null) {
                return null;
            }
            if (i == layoutManagerFetchVPNInfo.getPosition(viewFindSnapView)) {
                LuaValue luaValue = luaValueArr[1];
                if (luaValue != null && luaValue.isFunction()) {
                    LuaFunction luaFunction2 = luaValue.toLuaFunction();
                    this.gHZMYf = luaFunction2;
                    luaFunction2.invoke(null);
                }
            } else if (i > layoutManagerFetchVPNInfo.getPosition(viewFindSnapView)) {
                recyclerViewKWHzl.smoothScrollBy(C7865arr.copydefault(this.zuBGHE) + ((C33570myu.AEQbTJ() - C7865arr.copydefault(this.zuBGHE * 2)) / 2), 0);
            } else {
                recyclerViewKWHzl.smoothScrollBy(-(C7865arr.copydefault(this.zuBGHE) + ((C33570myu.AEQbTJ() - C7865arr.copydefault(this.zuBGHE * 2)) / 2)), 0);
            }
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] getCenterIndex(LuaValue[] luaValueArr) {
        A a2;
        RecyclerView.LayoutManager layoutManagerFetchVPNInfo;
        View viewFindSnapView;
        if (this.OHqIaq == null || (a2 = this.copydefault) == null || (layoutManagerFetchVPNInfo = a2.fetchVPNInfo()) == null || (viewFindSnapView = this.OHqIaq.findSnapView(layoutManagerFetchVPNInfo)) == null) {
            return null;
        }
        return LuaValue.rNumber(layoutManagerFetchVPNInfo.getPosition(viewFindSnapView));
    }

    @InterfaceC60044zuT
    public LuaValue[] scrollToItemByIndex(final LuaValue[] luaValueArr) {
        C48742ubS c48742ubS = this.QOLQEE;
        if (c48742ubS == null || this.copydefault == null || this.OHqIaq == null) {
            return null;
        }
        final RecyclerView recyclerViewKWHzl = c48742ubS.KWHzl();
        recyclerViewKWHzl.post(new Runnable() { // from class: com.okinc.referral.mlnservice.view.UDGrowthReferralRecyclerView.5
            @Override // java.lang.Runnable
            public void run() {
                View viewFindSnapView;
                RecyclerView.LayoutManager layoutManagerFetchVPNInfo = UDGrowthReferralRecyclerView.this.copydefault.fetchVPNInfo();
                if (layoutManagerFetchVPNInfo == null || (viewFindSnapView = UDGrowthReferralRecyclerView.this.OHqIaq.findSnapView(layoutManagerFetchVPNInfo)) == null) {
                    return;
                }
                LuaValue[] luaValueArr2 = luaValueArr;
                if (luaValueArr2.length == 2 && luaValueArr2[0].isInt() && luaValueArr[1].isInt()) {
                    int i = luaValueArr[0].toInt();
                    int i2 = luaValueArr[1].toInt();
                    if (UDGrowthReferralRecyclerView.this.AubY() != null && UDGrowthReferralRecyclerView.this.AubY().getResources() != null && UDGrowthReferralRecyclerView.this.AubY().getResources().getConfiguration() != null) {
                        if (UDGrowthReferralRecyclerView.this.AubY().getResources().getConfiguration().getLayoutDirection() == 1) {
                            recyclerViewKWHzl.smoothScrollBy((-(i - layoutManagerFetchVPNInfo.getPosition(viewFindSnapView))) * C7865arr.copydefault(i2), 0);
                            return;
                        } else {
                            recyclerViewKWHzl.smoothScrollBy((i - layoutManagerFetchVPNInfo.getPosition(viewFindSnapView)) * C7865arr.copydefault(i2), 0);
                            return;
                        }
                    }
                    recyclerViewKWHzl.smoothScrollBy((i - layoutManagerFetchVPNInfo.getPosition(viewFindSnapView)) * C7865arr.copydefault(i2), 0);
                }
            }
        });
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] scrollToPositionWithoutAni(LuaValue[] luaValueArr) {
        try {
            if (luaValueArr.length >= 1 && luaValueArr[0].isInt()) {
                int i = luaValueArr[0].toInt();
                C48742ubS c48742ubS = this.QOLQEE;
                if (c48742ubS != null && c48742ubS.KWHzl() != null) {
                    this.QOLQEE.KWHzl().scrollToPosition(i);
                }
                return null;
            }
        } catch (Exception e) {
            pUU.copydefault("scrollToPositionWithoutAni", e.getMessage());
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] scrollToPositionByCellWidthWithoutAni(final LuaValue[] luaValueArr) {
        C48742ubS c48742ubS = this.QOLQEE;
        if (c48742ubS == null || this.copydefault == null || this.OHqIaq == null) {
            return null;
        }
        final RecyclerView recyclerViewKWHzl = c48742ubS.KWHzl();
        recyclerViewKWHzl.post(new Runnable() { // from class: o.ubT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                this.OLrzqt.AEQbTJ(luaValueArr, recyclerViewKWHzl);
            }
        });
        return null;
    }

    public final /* synthetic */ void AEQbTJ(LuaValue[] luaValueArr, RecyclerView recyclerView) {
        View viewFindSnapView;
        try {
            RecyclerView.LayoutManager layoutManagerFetchVPNInfo = this.copydefault.fetchVPNInfo();
            if (layoutManagerFetchVPNInfo == null || (viewFindSnapView = this.OHqIaq.findSnapView(layoutManagerFetchVPNInfo)) == null) {
                return;
            }
            if (luaValueArr.length == 2 && luaValueArr[0].isInt() && luaValueArr[1].isInt()) {
                int i = luaValueArr[0].toInt();
                int i2 = luaValueArr[1].toInt();
                if (AubY() != null && AubY().getResources() != null && AubY().getResources().getConfiguration() != null && AubY().getResources().getConfiguration().getLayoutDirection() == 1) {
                    recyclerView.scrollBy((-(i - layoutManagerFetchVPNInfo.getPosition(viewFindSnapView))) * C7865arr.copydefault(i2), 0);
                } else {
                    recyclerView.scrollBy((i - layoutManagerFetchVPNInfo.getPosition(viewFindSnapView)) * C7865arr.copydefault(i2), 0);
                }
            }
        } catch (Exception unused) {
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] setAdapterSynGrowth(LuaValue[] luaValueArr) {
        if (luaValueArr.length > 0) {
            LuaValue luaValue = luaValueArr[0];
            if (luaValue == null || !luaValue.isUserdata()) {
                return null;
            }
            AEQbTJ((UDBaseRecyclerAdapter) luaValue.toUserdata());
            return null;
        }
        LuaValue[] luaValueArr2 = new LuaValue[1];
        LuaValue luaValueNil = this.copydefault;
        if (luaValueNil == null) {
            luaValueNil = LuaValue.Nil();
        }
        luaValueArr2[0] = luaValueNil;
        return LuaValue.varargsOf(luaValueArr2);
    }

    @InterfaceC60044zuT
    public LuaValue[] autoMirrored(LuaValue[] luaValueArr) {
        if (this.QOLQEE != null && luaValueArr.length == 1 && luaValueArr[0].isBoolean()) {
            this.QOLQEE.setAutoMirrored(Boolean.valueOf(luaValueArr[0].toBoolean()).booleanValue());
        }
        return null;
    }
}
