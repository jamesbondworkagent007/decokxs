package com.okinc.business.defi.dapp.view.cardSwipe;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.CardItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.immomo.mls.fun.ud.view.UDViewGroup;
import com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter;
import o.C7323ahf;
import o.C7343ahz;
import o.C7781aqM;
import o.C7823arB;
import o.C7840arS;
import o.C7865arr;
import o.InterfaceC60044zuT;
import o.InterfaceC7949atV;
import o.dAP;
import o.dAR;
import o.dAT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes4.dex */
@InterfaceC60044zuT
public class UDCardRecyclerView<U extends RecyclerView, A extends UDBaseRecyclerAdapter> extends UDViewGroup<U> {
    public static final String[] KWHzl = {"adapter", "setCardSwipeTouchHelper", "reloadData"};
    public InterfaceC7949atV AEQbTJ;
    public A OLrzqt;
    public C7781aqM copydefault;

    @InterfaceC60044zuT
    public UDCardRecyclerView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    @InterfaceC60044zuT
    public UDCardRecyclerView(Globals globals, @NonNull U u) {
        super(globals, u);
    }

    @InterfaceC60044zuT
    public UDCardRecyclerView(Globals globals) {
        super(globals);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    /* JADX DEBUG: Method merged with bridge method: EZpvd([Lorg/luaj/vm2/LuaValue;)Landroid/view/ViewGroup; */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public U AEQbTJ(@NonNull LuaValue[] luaValueArr) {
        this.copydefault = (C7781aqM) LayoutInflater.from(AubY()).inflate(C7343ahz.Activity.OLrzqt, (ViewGroup) null);
        InterfaceC7949atV interfaceC7949atVAEQbTJ = C7323ahf.gEmmrt().AEQbTJ(AubY(), this.copydefault);
        this.AEQbTJ = interfaceC7949atVAEQbTJ;
        this.copydefault.setLoadViewDelegete(interfaceC7949atVAEQbTJ);
        this.copydefault.setLayoutParams(C7823arB.AEQbTJ());
        return this.copydefault;
    }

    @InterfaceC60044zuT
    public LuaValue[] setCardSwipeTouchHelper(final LuaValue[] luaValueArr) {
        if (luaValueArr.length != 4) {
            return null;
        }
        CardItemTouchHelper cardItemTouchHelper = new CardItemTouchHelper(new dAP(new dAT() { // from class: com.okinc.business.defi.dapp.view.cardSwipe.UDCardRecyclerView.5
            @Override // o.dAT
            public void KWHzl(RecyclerView.ViewHolder viewHolder, float f, int i) {
            }

            @Override // o.dAT
            public void KWHzl(RecyclerView.ViewHolder viewHolder, int i, int i2) {
                luaValueArr[0].toLuaFunction().EZpvd(i + 1);
            }
        }, C7865arr.copydefault((float) luaValueArr[1].toDouble()), C7865arr.copydefault((float) luaValueArr[2].toDouble()), luaValueArr[3].toBoolean(), this.copydefault));
        C7781aqM c7781aqM = this.copydefault;
        c7781aqM.setLayoutManager(new CardLayoutManager(c7781aqM, cardItemTouchHelper));
        cardItemTouchHelper.attachToRecyclerView(this.copydefault);
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] adapter(LuaValue[] luaValueArr) {
        if (luaValueArr.length <= 0) {
            LuaValue[] luaValueArr2 = new LuaValue[1];
            LuaValue luaValueNil = this.OLrzqt;
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
        C7840arS.KWHzl(new Runnable() { // from class: com.okinc.business.defi.dapp.view.cardSwipe.UDCardRecyclerView.1
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.dapp.view.cardSwipe.UDCardRecyclerView */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                UDCardRecyclerView.this.copydefault(uDBaseRecyclerAdapter);
            }
        });
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.immomo.mls.fun.ud.view.recycler.UDBaseNeedHeightAdapter */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View] */
    public void copydefault(A a2) {
        this.OLrzqt = a2;
        a2.copydefault(this.AEQbTJ);
        this.OLrzqt.KWHzl(f_());
        a2.AhwBna(AubY().getResources().getDisplayMetrics().widthPixels, AubY().getResources().getDisplayMetrics().heightPixels);
        this.copydefault.setAdapter(a2.gEmmrt());
    }

    @InterfaceC60044zuT
    public LuaValue[] reloadData(LuaValue[] luaValueArr) {
        if (this.OLrzqt != null) {
            if (luaValueArr.length > 0 && luaValueArr[0].toBoolean()) {
                this.copydefault.setItemAnimator(new dAR());
            } else {
                this.copydefault.setItemAnimator(null);
            }
            this.OLrzqt.hDKMBd();
        }
        return null;
    }
}
