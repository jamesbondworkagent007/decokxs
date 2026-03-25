package com.okinc.tradingbot.impl.mln;

import android.app.Dialog;
import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import androidx.camera.video.AudioStats;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.tradingbot.impl.mln.OKTradingBotBridge;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotTradeData;
import com.okinc.unify_trade.biz.FundingRateArbCoin;
import com.okinc.unify_trade.biz.HighestApyOverview;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.ActivityC43071riP;
import o.ActivityC51150vhb;
import o.C33129mqd;
import o.C43251rlk;
import o.C51976vxF;
import o.C54589xNz;
import o.C54799xVt;
import o.C55284xgz;
import o.C56033xvF;
import o.C56402yEa;
import o.C7594aml;
import o.C7916asp;
import o.InterfaceC54581xNr;
import o.pUU;
import o.uBU;
import o.vCH;
import o.xOW;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaBoolean;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaValue;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes11.dex */
@LuaClass
public final class OKTradingBotBridge {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final LuaValue[] AEQbTJ;
    public final Globals copydefault;

    public OKTradingBotBridge(Globals globals, LuaValue[] luaValueArr) {
        this.copydefault = globals;
        this.AEQbTJ = luaValueArr;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.mln.OKTradingBotBridge.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @LuaBridge
    public final void a_setTheme(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.zsXlph(luaValueArr);
        Integer numKWHzl = C51976vxF.KWHzl(luaValue != null ? Integer.valueOf(luaValue.toInt()) : null);
        if (numKWHzl != null) {
            int iIntValue = numKWHzl.intValue();
            Context contextAEQbTJ = C7594aml.AEQbTJ(this.copydefault);
            if (contextAEQbTJ != null) {
                contextAEQbTJ.setTheme(iIntValue);
            }
        }
    }

    @LuaBridge
    public final void dismissSheet() {
        FragmentManager supportFragmentManager;
        List<Fragment> fragments;
        Context contextAEQbTJ = C7594aml.AEQbTJ(this.copydefault);
        ActivityC43071riP activityC43071riP = contextAEQbTJ instanceof ActivityC43071riP ? (ActivityC43071riP) contextAEQbTJ : null;
        Fragment fragment = (activityC43071riP == null || (supportFragmentManager = activityC43071riP.getSupportFragmentManager()) == null || (fragments = supportFragmentManager.getFragments()) == null) ? null : (Fragment) CollectionsKt___CollectionsKt.firstOrNull(fragments);
        ActivityC43071riP.ActionBar actionBar = fragment instanceof ActivityC43071riP.ActionBar ? (ActivityC43071riP.ActionBar) fragment : null;
        if (actionBar == null) {
            return;
        }
        Dialog dialog = actionBar.getDialog();
        BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
        if (bottomSheetDialog != null) {
            bottomSheetDialog.setDismissWithAnimation(true);
        }
        actionBar.dismiss();
    }

    @LuaBridge
    public final void navigateToSmartArbCustomParamsPage(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAEQbTJ = C7594aml.AEQbTJ(this.copydefault);
        if (contextAEQbTJ == null) {
            return;
        }
        Map<String, Object> mapAEQbTJ = AEQbTJ((LuaValue) yDV.AuCTelauCTel(luaValueArr));
        String strGEmmrt = C33129mqd.gEmmrt(mapAEQbTJ.get("instId"));
        String str = strGEmmrt + "-SWAP";
        String str2 = "smart_arbitrage";
        String str3 = "SWAP";
        Parcelable parcelable = null;
        boolean z = false;
        String str4 = null;
        boolean z2 = false;
        uBU.ActionBar.startBotNmpTradeActivity$default((uBU) C43251rlk.copydefault(uBU.class), contextAEQbTJ, new BotTradeData(str2, str, str3, parcelable, z, str4, strGEmmrt, z2, C56402yEa.EZpvd(new FundingRateArbCoin((String) null, (String) null, (String) null, str, new HighestApyOverview((String) null, (String) null, C33129mqd.gEmmrt(mapAEQbTJ.get("leveragePrincipal")), (String) null, (String) null, 27, (DefaultConstructorMarker) null), (List) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, 2023, (DefaultConstructorMarker) null)), CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, (DefaultConstructorMarker) null), null, null, 12, null);
    }

    @LuaBridge
    public final LuaValue getPriceDisplaySymbol(@NotNull LuaValue[] luaValueArr) {
        BizInstrument suggestedInstrument$default;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        String javaString = ((LuaValue) yDV.AuCTelauCTel(luaValueArr)).toJavaString();
        String javaString2 = luaValueArr[1].toJavaString();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            Intrinsics.copydefault((Object) javaString);
            suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, javaString, javaString2, null, null, 12, null);
        } else {
            suggestedInstrument$default = null;
        }
        LuaValue luaValueCopydefault = LuaString.copydefault(C56033xvF.EZpvd(suggestedInstrument$default));
        Intrinsics.checkNotNullExpressionValue(luaValueCopydefault, "");
        return luaValueCopydefault;
    }

    @LuaBridge
    public final LuaValue isNegativeContract(@NotNull LuaValue[] luaValueArr) {
        BizInstrument suggestedInstrument$default;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        String javaString = ((LuaValue) yDV.AuCTelauCTel(luaValueArr)).toJavaString();
        String javaString2 = luaValueArr[1].toJavaString();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            Intrinsics.copydefault((Object) javaString);
            suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, javaString, javaString2, null, null, 12, null);
        } else {
            suggestedInstrument$default = null;
        }
        LuaValue luaValueAEQbTJ = LuaBoolean.AEQbTJ(suggestedInstrument$default != null ? Intrinsics.EZpvd(suggestedInstrument$default.isNegativeContract(), Boolean.TRUE) : false);
        Intrinsics.checkNotNullExpressionValue(luaValueAEQbTJ, "");
        return luaValueAEQbTJ;
    }

    @LuaBridge
    public final void presentAdjustLeverVC(@NotNull LuaValue[] luaValueArr) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAEQbTJ = C7594aml.AEQbTJ(this.copydefault);
        FragmentActivity fragmentActivity = contextAEQbTJ instanceof FragmentActivity ? (FragmentActivity) contextAEQbTJ : null;
        if (fragmentActivity == null) {
            return;
        }
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
        final LuaFunction luaFunction = luaValue != null ? luaValue.toLuaFunction() : null;
        Map<String, Object> mapAEQbTJ = AEQbTJ((LuaValue) yDV.AuCTelauCTel(luaValueArr));
        Object obj = mapAEQbTJ.get(HiAnalyticsConstant.HaKey.BI_KEY_TRANSTYPE);
        String str = (obj == null || (string8 = obj.toString()) == null) ? "" : string8;
        Object obj2 = mapAEQbTJ.get("minLever");
        String str2 = (obj2 == null || (string7 = obj2.toString()) == null) ? "" : string7;
        Object obj3 = mapAEQbTJ.get("maxLever");
        String str3 = (obj3 == null || (string6 = obj3.toString()) == null) ? "" : string6;
        Object obj4 = mapAEQbTJ.get("leveragePercents");
        String str4 = (obj4 == null || (string5 = obj4.toString()) == null) ? "" : string5;
        Object obj5 = mapAEQbTJ.get("instId");
        String str5 = (obj5 == null || (string4 = obj5.toString()) == null) ? "" : string4;
        Object obj6 = mapAEQbTJ.get("instType");
        String str6 = (obj6 == null || (string3 = obj6.toString()) == null) ? "" : string3;
        Object obj7 = mapAEQbTJ.get(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION);
        String str7 = (obj7 == null || (string2 = obj7.toString()) == null) ? "" : string2;
        Object obj8 = mapAEQbTJ.get("botType");
        vCH.Companion.copydefault(str, str4, (512 & 4) != 0 ? null : str2, (512 & 8) != 0 ? null : str3, (512 & 16) != 0 ? null : str5, (512 & 32) != 0 ? null : str6, (512 & 64) != 0 ? null : "cross", (512 & 128) != 0 ? null : str7, supportFragmentManager, (512 & 512) != 0 ? null : null, (512 & 1024) != 0 ? null : (obj8 == null || (string = obj8.toString()) == null) ? "" : string, (512 & 2048) != 0 ? null : new Function1() { // from class: o.vxJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj9) {
                return OKTradingBotBridge.KWHzl(luaFunction, (java.lang.String) obj9);
            }
        });
    }

    public static final Unit KWHzl(LuaFunction luaFunction, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (luaFunction != null) {
            luaFunction.copydefault(str);
        }
        return Unit.INSTANCE;
    }

    @LuaBridge
    public final void navigateToBotCopySuccessPage(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAEQbTJ = C7594aml.AEQbTJ(this.copydefault);
        if (contextAEQbTJ == null) {
            return;
        }
        Map<String, Object> mapAEQbTJ = AEQbTJ((LuaValue) yDV.AuCTelauCTel(luaValueArr));
        String strGEmmrt = C33129mqd.gEmmrt(mapAEQbTJ.get("algoId"));
        String strGEmmrt2 = C33129mqd.gEmmrt(mapAEQbTJ.get("ordType"));
        Boolean boolZLjUOn = StringsKt__StringsKt.zLjUOn(C33129mqd.gEmmrt(mapAEQbTJ.get("isFromNmp")));
        boolean zBooleanValue = boolZLjUOn != null ? boolZLjUOn.booleanValue() : false;
        String strGEmmrt3 = C33129mqd.gEmmrt(mapAEQbTJ.get("customDeeplink"));
        Map<String, Object> mapAEQbTJ2 = AEQbTJ((LuaValue) yDV.AubY(luaValueArr));
        if (mapAEQbTJ2 == null) {
            mapAEQbTJ2 = new HashMap<>();
        }
        HashMap map = new HashMap();
        Iterator<Map.Entry<String, Object>> it = mapAEQbTJ2.entrySet().iterator();
        while (it.hasNext()) {
            Object value = it.next().getValue();
            if (value instanceof Map) {
                Map map2 = (Map) value;
                Object obj = map2.get(JwtUtilsKt.DID_METHOD_KEY);
                String strGEmmrt4 = obj != null ? C33129mqd.gEmmrt(obj) : null;
                if (strGEmmrt4 == null) {
                    strGEmmrt4 = "";
                }
                if (strGEmmrt4.length() > 0) {
                    map.put(strGEmmrt4, C33129mqd.gEmmrt(map2.get("value")));
                }
            }
        }
        ActivityC51150vhb.Companion.AEQbTJ(contextAEQbTJ, (WalletImportError.ERROR_CODE_AA_EXIST & 2) != 0 ? null : strGEmmrt2, (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : strGEmmrt, (WalletImportError.ERROR_CODE_AA_EXIST & 8) != 0 ? null : map, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? false : zBooleanValue, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : strGEmmrt3, (WalletImportError.ERROR_CODE_AA_EXIST & 64) == 0 ? null : null);
    }

    @LuaBridge
    public final LuaValue getInstDisplayText(@NotNull LuaValue[] luaValueArr) {
        String javaString;
        Boolean boolZLjUOn;
        String javaString2;
        Boolean boolZLjUOn2;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        String javaString3 = ((LuaValue) yDV.AuCTelauCTel(luaValueArr)).toJavaString();
        String javaString4 = luaValueArr[1].toJavaString();
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 2);
        boolean zBooleanValue = (luaValue == null || (javaString2 = luaValue.toJavaString()) == null || (boolZLjUOn2 = StringsKt__StringsKt.zLjUOn(javaString2)) == null) ? false : boolZLjUOn2.booleanValue();
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 3);
        String strCopydefault = C54799xVt.AEQbTJ.copydefault(javaString4, javaString3, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? "normal" : null, (124 & 32) != 0 ? true : zBooleanValue, (124 & 64) != 0 ? null : null, (124 & 128) != 0 ? false : (luaValue2 == null || (javaString = luaValue2.toJavaString()) == null || (boolZLjUOn = StringsKt__StringsKt.zLjUOn(javaString)) == null) ? false : boolZLjUOn.booleanValue());
        pUU.EZpvd("OKTradingBotBridge", "getInstDisplayText: " + strCopydefault);
        LuaValue luaValueCopydefault = LuaString.copydefault(strCopydefault);
        Intrinsics.checkNotNullExpressionValue(luaValueCopydefault, "");
        return luaValueCopydefault;
    }

    @LuaBridge
    public final LuaValue getTradeAccountLevel() {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return LuaString.copydefault((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.wlaJM());
    }

    @LuaBridge
    public final void a_showSnackbar(@NotNull final LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.AhwBna(luaValueArr, 0, new Function1() { // from class: o.vxK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKTradingBotBridge.KWHzl(luaValueArr, (android.view.View) obj);
            }
        });
    }

    public static final Unit KWHzl(LuaValue[] luaValueArr, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C55284xgz.Activity activity = C55284xgz.Companion;
        LuaValue luaValue = luaValueArr[1];
        String javaString = luaValue != null ? luaValue.toJavaString() : null;
        C55284xgz c55284xgzKWHzl = activity.KWHzl(view, javaString != null ? javaString : "");
        if (c55284xgzKWHzl != null) {
            LuaValue luaValue2 = luaValueArr[2];
            if (luaValue2 != null) {
                c55284xgzKWHzl.isConnected(luaValue2.toInt());
            }
            LuaValue luaValue3 = luaValueArr[3];
            if (luaValue3 != null) {
                c55284xgzKWHzl.djBIcL(luaValue3.toInt());
            }
            c55284xgzKWHzl.hDKMBd();
        }
        return Unit.INSTANCE;
    }

    public final Map<String, Object> AEQbTJ(LuaValue luaValue) {
        return C7916asp.OLrzqt(luaValue.toLuaTable());
    }
}
