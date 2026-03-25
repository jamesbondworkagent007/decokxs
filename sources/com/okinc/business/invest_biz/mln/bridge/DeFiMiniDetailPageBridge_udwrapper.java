package com.okinc.business.invest_biz.mln.bridge;

import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes23.dex */
@InterfaceC60044zuT
public class DeFiMiniDetailPageBridge_udwrapper extends LuaUserdata {
    public static final String[] methods = {"showScoreDetailSheet", "showFullHistoryActivity", "openTransactionDetail", "detailTransactionAction", "openV3AssetsDetail", "showTVLkLineTrend", "showDetailShare", "showDailyBonusDetail", "putDetailData", "putPortfolioData", "putDetailBonusData", "clearAllCache", "clearNextStepMemoryCache"};

    public DeFiMiniDetailPageBridge_udwrapper(Globals globals, Object obj) {
        super(globals, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public DeFiMiniDetailPageBridge_udwrapper(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = newUserdata(luaValueArr);
    }

    public Object newUserdata(LuaValue[] luaValueArr) {
        return new DeFiMiniDetailPageBridge(this.globals);
    }

    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    public DeFiMiniDetailPageBridge getJavaUserdata() {
        return (DeFiMiniDetailPageBridge) this.javaUserdata;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] showScoreDetailSheet(LuaValue[] luaValueArr) {
        ((DeFiMiniDetailPageBridge) this.javaUserdata).showScoreDetailSheet(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] showFullHistoryActivity(LuaValue[] luaValueArr) {
        ((DeFiMiniDetailPageBridge) this.javaUserdata).showFullHistoryActivity(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] openTransactionDetail(LuaValue[] luaValueArr) {
        ((DeFiMiniDetailPageBridge) this.javaUserdata).openTransactionDetail(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] detailTransactionAction(LuaValue[] luaValueArr) {
        ((DeFiMiniDetailPageBridge) this.javaUserdata).detailTransactionAction(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] openV3AssetsDetail(LuaValue[] luaValueArr) {
        ((DeFiMiniDetailPageBridge) this.javaUserdata).openV3AssetsDetail(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] showTVLkLineTrend(LuaValue[] luaValueArr) {
        ((DeFiMiniDetailPageBridge) this.javaUserdata).showTVLkLineTrend(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] showDetailShare(LuaValue[] luaValueArr) {
        ((DeFiMiniDetailPageBridge) this.javaUserdata).showDetailShare(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] showDailyBonusDetail(LuaValue[] luaValueArr) {
        ((DeFiMiniDetailPageBridge) this.javaUserdata).showDailyBonusDetail(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] putDetailData(LuaValue[] luaValueArr) {
        ((DeFiMiniDetailPageBridge) this.javaUserdata).putDetailData(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] putPortfolioData(LuaValue[] luaValueArr) {
        ((DeFiMiniDetailPageBridge) this.javaUserdata).putPortfolioData(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] putDetailBonusData(LuaValue[] luaValueArr) {
        ((DeFiMiniDetailPageBridge) this.javaUserdata).putDetailBonusData(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] clearAllCache(LuaValue[] luaValueArr) {
        ((DeFiMiniDetailPageBridge) this.javaUserdata).clearAllCache(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] clearNextStepMemoryCache(LuaValue[] luaValueArr) {
        ((DeFiMiniDetailPageBridge) this.javaUserdata).clearNextStepMemoryCache(luaValueArr);
        return null;
    }

    @Override // org.luaj.vm2.LuaUserdata, org.luaj.vm2.NLuaValue, org.luaj.vm2.LuaValue
    @InterfaceC60044zuT
    public String toString() {
        return String.valueOf(this.javaUserdata);
    }

    @Override // org.luaj.vm2.LuaUserdata, org.luaj.vm2.NLuaValue
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        T t = this.javaUserdata;
        if (t != 0) {
            return t.equals(((LuaUserdata) obj).getJavaUserdata());
        }
        return ((LuaUserdata) obj).getJavaUserdata() == null;
    }

    @Override // org.luaj.vm2.LuaUserdata
    @InterfaceC60044zuT
    public boolean __onLuaEq(Object obj) {
        return equals(obj);
    }
}
