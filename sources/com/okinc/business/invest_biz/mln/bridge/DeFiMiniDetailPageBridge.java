package com.okinc.business.invest_biz.mln.bridge;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.contants.PoolProtocolType;
import com.okinc.business.invest_biz.data.contants.ProductType;
import com.okinc.business.invest_biz.data.models.ChainInfo;
import com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain;
import com.okinc.business.invest_biz.ui.screens.product_details.ProductTransactionActivityParams;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractActivityC33041mov;
import o.C23924iOj;
import o.C23935iOu;
import o.C25540iye;
import o.C7322ahe;
import o.InterfaceC60037zuM;
import o.iNZ;
import o.pUU;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes6.dex */
@LuaClass
public final class DeFiMiniDetailPageBridge {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public Globals AEQbTJ;

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.mln.bridge.DeFiMiniDetailPageBridge.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public DeFiMiniDetailPageBridge(@NotNull Globals globals) {
        Intrinsics.checkNotNullParameter(globals, "");
        this.AEQbTJ = globals;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void showScoreDetailSheet(LuaValue[] luaValueArr) {
        String javaString;
        LuaValue luaValue;
        String javaString2;
        String str = "";
        if (luaValueArr != null) {
            try {
                LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
                if (luaValue2 == null || (javaString = luaValue2.toJavaString()) == null) {
                    javaString = "";
                }
            } catch (Throwable th) {
                pUU.AEQbTJ("showScoreDetailSheet", "Error:", th);
                return;
            }
        }
        if (luaValueArr != null && (luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 1)) != null && (javaString2 = luaValue.toJavaString()) != null) {
            str = javaString2;
        }
        AbstractActivityC33041mov abstractActivityC33041movKWHzl = KWHzl();
        if (!(abstractActivityC33041movKWHzl instanceof FragmentActivity)) {
            abstractActivityC33041movKWHzl = null;
        }
        if (abstractActivityC33041movKWHzl != null) {
            C23935iOu.OLrzqt.OLrzqt(abstractActivityC33041movKWHzl).AEQbTJ(javaString, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a A[Catch: Exception -> 0x0018, TryCatch #0 {Exception -> 0x0018, blocks: (B:5:0x0005, B:7:0x000d, B:9:0x0013, B:15:0x001f, B:17:0x0027, B:19:0x002d, B:22:0x0034, B:24:0x003d, B:26:0x0043, B:30:0x0052, B:32:0x005b, B:37:0x0065, B:39:0x0070, B:43:0x007b, B:38:0x006a, B:27:0x0048), top: B:47:0x0005 }] */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void showFullHistoryActivity(LuaValue[] luaValueArr) {
        long j;
        int value;
        LuaValue luaValue;
        LuaValue luaValue2;
        String javaString;
        LuaValue luaValue3;
        String javaString2;
        String javaString3;
        long j2 = 1;
        if (luaValueArr != null) {
            try {
                LuaValue luaValue4 = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
                j = (luaValue4 == null || (javaString3 = luaValue4.toJavaString()) == null) ? 1L : Long.parseLong(javaString3);
            } catch (Exception e) {
                pUU.AEQbTJ("showFullHistoryActivity", "Error:", e);
                return;
            }
        }
        if (luaValueArr != null && (luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 1)) != null && (javaString2 = luaValue3.toJavaString()) != null) {
            j2 = Long.parseLong(javaString2);
        }
        long j3 = j2;
        int value2 = (luaValueArr == null || (luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 2)) == null || (javaString = luaValue2.toJavaString()) == null) ? ProductType.Save.getValue() : Integer.parseInt(javaString);
        if (luaValueArr == null || (luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 3)) == null) {
            value = PoolProtocolType.Unknown.getValue();
        } else {
            if (!luaValue.isNumber()) {
                luaValue = null;
            }
            if (luaValue != null) {
                value = luaValue.toInt();
            }
        }
        AbstractActivityC33041mov abstractActivityC33041movKWHzl = KWHzl();
        AbstractActivityC33041mov abstractActivityC33041mov = abstractActivityC33041movKWHzl instanceof FragmentActivity ? abstractActivityC33041movKWHzl : null;
        if (abstractActivityC33041mov != null) {
            C23935iOu.OLrzqt.OLrzqt(abstractActivityC33041mov).AEQbTJ(j, j3, value2, value);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void openTransactionDetail(LuaValue[] luaValueArr) {
        String javaString;
        LuaValue luaValue;
        String javaString2;
        String str = "";
        if (luaValueArr != null) {
            try {
                LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
                if (luaValue2 == null || (javaString = luaValue2.toJavaString()) == null) {
                    javaString = "";
                }
            } catch (Exception e) {
                pUU.AEQbTJ("openTransactionDetail", "Error:", e);
                return;
            }
        }
        if (luaValueArr != null && (luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 1)) != null && (javaString2 = luaValue.toJavaString()) != null) {
            str = javaString2;
        }
        AbstractActivityC33041mov abstractActivityC33041movKWHzl = KWHzl();
        if (!(abstractActivityC33041movKWHzl instanceof FragmentActivity)) {
            abstractActivityC33041movKWHzl = null;
        }
        if (abstractActivityC33041movKWHzl != null) {
            C23935iOu.OLrzqt.OLrzqt(abstractActivityC33041movKWHzl).copydefault(javaString, str);
        }
    }

    @LuaBridge
    public final void detailTransactionAction(LuaValue[] luaValueArr) {
        InvestmentKind investmentKind;
        LuaValue luaValue;
        LuaValue luaValue2;
        String javaString;
        LuaValue luaValue3;
        LuaValue luaValue4;
        String javaString2;
        LuaValue luaValue5;
        String javaString3;
        LuaValue luaValue6;
        String javaString4;
        LuaValue luaValue7;
        String javaString5;
        LuaValue luaValue8;
        String javaString6;
        LuaValue luaValue9;
        String javaString7;
        AbstractActivityC33041mov abstractActivityC33041movKWHzl = KWHzl();
        if (abstractActivityC33041movKWHzl != null) {
            long j = 1;
            int i = 0;
            long j2 = (luaValueArr == null || (luaValue9 = (LuaValue) yDV.gEmmrt(luaValueArr, 0)) == null || (javaString7 = luaValue9.toJavaString()) == null) ? 1L : Long.parseLong(javaString7);
            if (luaValueArr != null && (luaValue8 = (LuaValue) yDV.gEmmrt(luaValueArr, 1)) != null && (javaString6 = luaValue8.toJavaString()) != null) {
                j = Long.parseLong(javaString6);
            }
            int i2 = (luaValueArr == null || (luaValue7 = (LuaValue) yDV.gEmmrt(luaValueArr, 2)) == null || (javaString5 = luaValue7.toJavaString()) == null) ? 0 : Integer.parseInt(javaString5);
            String str = (luaValueArr == null || (luaValue6 = (LuaValue) yDV.gEmmrt(luaValueArr, 3)) == null || (javaString4 = luaValue6.toJavaString()) == null) ? "" : javaString4;
            String str2 = (luaValueArr == null || (luaValue5 = (LuaValue) yDV.gEmmrt(luaValueArr, 4)) == null || (javaString3 = luaValue5.toJavaString()) == null) ? "" : javaString3;
            String str3 = (luaValueArr == null || (luaValue4 = (LuaValue) yDV.gEmmrt(luaValueArr, 5)) == null || (javaString2 = luaValue4.toJavaString()) == null) ? "" : javaString2;
            if (luaValueArr != null && (luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 6)) != null) {
                luaValue3.toJavaString();
            }
            String str4 = (luaValueArr == null || (luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 7)) == null || (javaString = luaValue2.toJavaString()) == null) ? "" : javaString;
            int i3 = (luaValueArr == null || (luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 8)) == null) ? 0 : luaValue.toInt();
            InvestmentKind[] investmentKindArrValues = InvestmentKind.values();
            int length = investmentKindArrValues.length;
            while (true) {
                if (i >= length) {
                    investmentKind = null;
                    break;
                }
                investmentKind = investmentKindArrValues[i];
                if (investmentKind.getValue() == i3) {
                    break;
                } else {
                    i++;
                }
            }
            new iNZ(abstractActivityC33041movKWHzl, new ProductTransactionActivityParams(j2, Long.valueOf(j), C25540iye.AEQbTJ(String.valueOf(i2)), str, str3, str4, str2, null, investmentKind == null ? InvestmentKind.Default : investmentKind, 128, null)).AYXKKw();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void openV3AssetsDetail(LuaValue[] luaValueArr) {
        String javaString;
        long j;
        String javaString2;
        InvestmentKind investmentKind;
        LuaValue luaValue;
        String javaString3;
        LuaValue luaValue2;
        int i = 0;
        if (luaValueArr != null) {
            try {
                LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
                j = (luaValue3 == null || (javaString = luaValue3.toJavaString()) == null) ? 1L : Long.parseLong(javaString);
            } catch (Exception e) {
                pUU.AEQbTJ("openV3AssetsDetail", "Error:", e);
                return;
            }
        }
        if (luaValueArr == null || (luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1)) == null || (javaString2 = luaValue2.toJavaString()) == null) {
            javaString2 = "";
        }
        int i2 = (luaValueArr == null || (luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 2)) == null || (javaString3 = luaValue.toJavaString()) == null) ? 0 : Integer.parseInt(javaString3);
        InvestmentKind[] investmentKindArrValues = InvestmentKind.values();
        int length = investmentKindArrValues.length;
        while (true) {
            if (i >= length) {
                investmentKind = null;
                break;
            }
            investmentKind = investmentKindArrValues[i];
            if (investmentKind.getValue() == i2) {
                break;
            } else {
                i++;
            }
        }
        if (investmentKind == null) {
            investmentKind = InvestmentKind.Default;
        }
        AbstractActivityC33041mov abstractActivityC33041movKWHzl = KWHzl();
        AbstractActivityC33041mov abstractActivityC33041mov = abstractActivityC33041movKWHzl instanceof FragmentActivity ? abstractActivityC33041movKWHzl : null;
        if (abstractActivityC33041mov != null) {
            C23935iOu.OLrzqt.OLrzqt(abstractActivityC33041mov).OLrzqt(j, investmentKind, javaString2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void showTVLkLineTrend(LuaValue[] luaValueArr) {
        String javaString;
        long j;
        InvestmentKind investmentKind;
        LuaValue luaValue;
        LuaValue luaValue2;
        String javaString2;
        long j2 = 1;
        int i = 0;
        if (luaValueArr != null) {
            try {
                LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
                j = (luaValue3 == null || (javaString = luaValue3.toJavaString()) == null) ? 1L : Long.parseLong(javaString);
            } catch (Exception e) {
                pUU.AEQbTJ("showTVLkLineTrend", "Error:", e);
                return;
            }
        }
        if (luaValueArr != null && (luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1)) != null && (javaString2 = luaValue2.toJavaString()) != null) {
            j2 = Long.parseLong(javaString2);
        }
        long j3 = j2;
        int i2 = (luaValueArr == null || (luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 2)) == null) ? 0 : luaValue.toInt();
        InvestmentKind[] investmentKindArrValues = InvestmentKind.values();
        int length = investmentKindArrValues.length;
        while (true) {
            if (i >= length) {
                investmentKind = null;
                break;
            }
            investmentKind = investmentKindArrValues[i];
            if (investmentKind.getValue() == i2) {
                break;
            } else {
                i++;
            }
        }
        InvestmentKind investmentKind2 = investmentKind == null ? InvestmentKind.Default : investmentKind;
        AbstractActivityC33041mov abstractActivityC33041movKWHzl = KWHzl();
        AbstractActivityC33041mov abstractActivityC33041mov = abstractActivityC33041movKWHzl instanceof FragmentActivity ? abstractActivityC33041movKWHzl : null;
        if (abstractActivityC33041mov != null) {
            C23935iOu.OLrzqt.OLrzqt(abstractActivityC33041mov).KWHzl(j, j3, investmentKind2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void showDetailShare(LuaValue[] luaValueArr) {
        String javaString;
        long j;
        InvestmentKind investmentKind;
        LuaValue luaValue;
        LuaValue luaValue2;
        String javaString2;
        long j2 = 1;
        int i = 0;
        if (luaValueArr != null) {
            try {
                LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
                j = (luaValue3 == null || (javaString = luaValue3.toJavaString()) == null) ? 1L : Long.parseLong(javaString);
            } catch (Exception e) {
                pUU.AEQbTJ("showDetailShare", "Error showing detail share", e);
                return;
            }
        }
        if (luaValueArr != null && (luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1)) != null && (javaString2 = luaValue2.toJavaString()) != null) {
            j2 = Long.parseLong(javaString2);
        }
        long j3 = j2;
        int i2 = (luaValueArr == null || (luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 2)) == null) ? 0 : luaValue.toInt();
        InvestmentKind[] investmentKindArrValues = InvestmentKind.values();
        int length = investmentKindArrValues.length;
        while (true) {
            if (i >= length) {
                investmentKind = null;
                break;
            }
            investmentKind = investmentKindArrValues[i];
            if (investmentKind.getValue() == i2) {
                break;
            } else {
                i++;
            }
        }
        InvestmentKind investmentKind2 = investmentKind == null ? InvestmentKind.Default : investmentKind;
        AbstractActivityC33041mov abstractActivityC33041movKWHzl = KWHzl();
        AbstractActivityC33041mov abstractActivityC33041mov = abstractActivityC33041movKWHzl instanceof FragmentActivity ? abstractActivityC33041movKWHzl : null;
        if (abstractActivityC33041mov != null) {
            C23935iOu.OLrzqt.OLrzqt(abstractActivityC33041mov).copydefault(abstractActivityC33041mov, j3, j, investmentKind2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void showDailyBonusDetail(LuaValue[] luaValueArr) {
        long j;
        LuaValue luaValue;
        String javaString;
        String javaString2;
        long j2 = 1;
        if (luaValueArr != null) {
            try {
                LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
                j = (luaValue2 == null || (javaString2 = luaValue2.toJavaString()) == null) ? 1L : Long.parseLong(javaString2);
            } catch (Exception e) {
                pUU.AEQbTJ("showDailyBonusDetail", "Error:", e);
                return;
            }
        }
        if (luaValueArr != null && (luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 1)) != null && (javaString = luaValue.toJavaString()) != null) {
            j2 = Long.parseLong(javaString);
        }
        long j3 = j2;
        AbstractActivityC33041mov abstractActivityC33041movKWHzl = KWHzl();
        if (!(abstractActivityC33041movKWHzl instanceof FragmentActivity)) {
            abstractActivityC33041movKWHzl = null;
        }
        if (abstractActivityC33041movKWHzl != null) {
            C23935iOu.OLrzqt.OLrzqt(abstractActivityC33041movKWHzl).AEQbTJ(abstractActivityC33041movKWHzl, new ProductDetailsByChain(j, InvestmentKind.Default, new ChainInfo(j3, "", null, null, null, 28, null), false, null, null, "bonus_source_from_lua", false, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void putDetailData(LuaValue[] luaValueArr) {
        long j;
        String javaString;
        LuaValue luaValue;
        String javaString2;
        if (luaValueArr != null) {
            try {
                LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
                j = (luaValue2 == null || (javaString2 = luaValue2.toJavaString()) == null) ? 1L : Long.parseLong(javaString2);
            } catch (Exception e) {
                pUU.AEQbTJ("putDetailData", "Error putting detail data", e);
                return;
            }
        }
        if (luaValueArr == null || (luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 1)) == null || (javaString = luaValue.toJavaString()) == null) {
            javaString = "";
        }
        C23924iOj c23924iOj = C23924iOj.AEQbTJ;
        c23924iOj.AEQbTJ(c23924iOj.KWHzl(), j, javaString);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void putPortfolioData(LuaValue[] luaValueArr) {
        long j;
        String javaString;
        LuaValue luaValue;
        String javaString2;
        if (luaValueArr != null) {
            try {
                LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
                j = (luaValue2 == null || (javaString2 = luaValue2.toJavaString()) == null) ? 1L : Long.parseLong(javaString2);
            } catch (Exception e) {
                pUU.AEQbTJ("putPortfolioData", "Error putting portfolio data", e);
                return;
            }
        }
        if (luaValueArr == null || (luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 1)) == null || (javaString = luaValue.toJavaString()) == null) {
            javaString = "";
        }
        C23924iOj c23924iOj = C23924iOj.AEQbTJ;
        c23924iOj.AEQbTJ(c23924iOj.copydefault(), j, javaString);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void putDetailBonusData(LuaValue[] luaValueArr) {
        long j;
        String javaString;
        LuaValue luaValue;
        String javaString2;
        if (luaValueArr != null) {
            try {
                LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
                j = (luaValue2 == null || (javaString2 = luaValue2.toJavaString()) == null) ? 1L : Long.parseLong(javaString2);
            } catch (Exception e) {
                pUU.AEQbTJ("putDetailBonusData", "Error putting detail bonus data", e);
                return;
            }
        }
        if (luaValueArr == null || (luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 1)) == null || (javaString = luaValue.toJavaString()) == null) {
            javaString = "";
        }
        C23924iOj c23924iOj = C23924iOj.AEQbTJ;
        c23924iOj.AEQbTJ(c23924iOj.AEQbTJ(), j, javaString);
    }

    @LuaBridge
    public final void clearAllCache(LuaValue[] luaValueArr) {
        try {
            C23924iOj.AEQbTJ.EZpvd();
            C23935iOu.OLrzqt.AEQbTJ();
        } catch (Exception e) {
            pUU.AEQbTJ("putDetailBonusData", "Error putting detail bonus data", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void clearNextStepMemoryCache(LuaValue[] luaValueArr) {
        long j;
        String javaString;
        if (luaValueArr != null) {
            try {
                LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
                j = (luaValue == null || (javaString = luaValue.toJavaString()) == null) ? 1L : Long.parseLong(javaString);
            } catch (Exception e) {
                pUU.AEQbTJ("clearNextStepMemoryCache", "Error clearNextStepMemoryCache", e);
                return;
            }
        }
        AbstractActivityC33041mov abstractActivityC33041movKWHzl = KWHzl();
        if (!(abstractActivityC33041movKWHzl instanceof FragmentActivity)) {
            abstractActivityC33041movKWHzl = null;
        }
        if (abstractActivityC33041movKWHzl != null) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041movKWHzl), null, null, new DeFiMiniDetailPageBridge$clearNextStepMemoryCache$1$1(abstractActivityC33041movKWHzl, j, null), 3, null);
        }
    }

    public final AbstractActivityC33041mov KWHzl() {
        Globals globals = this.AEQbTJ;
        InterfaceC60037zuM interfaceC60037zuMAuCTel = globals != null ? globals.AuCTel() : null;
        C7322ahe c7322ahe = interfaceC60037zuMAuCTel instanceof C7322ahe ? (C7322ahe) interfaceC60037zuMAuCTel : null;
        Context context = c7322ahe != null ? c7322ahe.AEQbTJ : null;
        if (context instanceof AbstractActivityC33041mov) {
            return (AbstractActivityC33041mov) context;
        }
        return null;
    }
}
