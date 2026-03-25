package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.dex.api.bean.CoinInfo;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dex.api.bean.TradeParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.gKO;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;

/* JADX INFO: loaded from: classes15.dex */
public final class gLK implements InterfaceC7380aij {
    @Override // o.InterfaceC7380aij
    public java.util.Set<java.lang.String> KWHzl() {
        return yEE.AhwBna("dexSwap", "tokenCoinDetail");
    }

    @Override // o.InterfaceC7380aij
    public void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull InterfaceC7379aii interfaceC7379aii) {
        java.lang.Object obj;
        java.lang.String strGEmmrt;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.String strGEmmrt2;
        java.lang.Object obj4;
        java.lang.String strGEmmrt3;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC7379aii, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "tokenCoinDetail")) {
            java.lang.String str2 = (map == null || (obj4 = map.get("chainId")) == null || (strGEmmrt3 = C33129mqd.gEmmrt(obj4)) == null) ? "" : strGEmmrt3;
            java.lang.Object obj5 = map != null ? map.get("tokenContractAddress") : null;
            java.lang.String str3 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
            AEQbTJ(context, str2, str3 == null ? "" : str3, (map == null || (obj3 = map.get("tab")) == null || (strGEmmrt2 = C33129mqd.gEmmrt(obj3)) == null) ? "" : strGEmmrt2, (map == null || (obj = map.get("sourcePageName")) == null || (strGEmmrt = C33129mqd.gEmmrt(obj)) == null) ? "" : strGEmmrt, (map == null || (obj2 = map.get("sourceType")) == null) ? 0 : C33129mqd.AhwBna(obj2));
            return;
        }
        java.lang.Object obj6 = map != null ? map.get("fromChainId") : null;
        java.lang.String str4 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
        if (str4 == null) {
            str4 = "";
        }
        java.lang.Object obj7 = map != null ? map.get("toChainId") : null;
        java.lang.String str5 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
        java.lang.String str6 = str5 == null ? "" : str5;
        java.lang.Object obj8 = map != null ? map.get("fromNativeToken") : null;
        java.lang.Boolean bool = obj8 instanceof java.lang.Boolean ? (java.lang.Boolean) obj8 : null;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        java.lang.Object obj9 = map != null ? map.get("toNativeToken") : null;
        java.lang.Boolean bool2 = obj9 instanceof java.lang.Boolean ? (java.lang.Boolean) obj9 : null;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        java.lang.Object obj10 = map != null ? map.get("fromTokenContractAddress") : null;
        java.lang.String str7 = obj10 instanceof java.lang.String ? (java.lang.String) obj10 : null;
        java.lang.String str8 = str7 == null ? "" : str7;
        java.lang.Object obj11 = map != null ? map.get("toTokenContractAddress") : null;
        java.lang.String str9 = obj11 instanceof java.lang.String ? (java.lang.String) obj11 : null;
        java.lang.String str10 = str9 == null ? "" : str9;
        java.lang.Object obj12 = map != null ? map.get("fromAmount") : null;
        java.lang.String str11 = obj12 instanceof java.lang.String ? (java.lang.String) obj12 : null;
        java.lang.String str12 = str11 == null ? "" : str11;
        java.lang.Object obj13 = map != null ? map.get("walletId") : null;
        java.lang.String str13 = obj13 instanceof java.lang.String ? (java.lang.String) obj13 : null;
        java.lang.String str14 = str13 == null ? "" : str13;
        java.lang.Object obj14 = map != null ? map.get("onClosed") : null;
        AEQbTJ(str4, str8, zBooleanValue, str6, str10, zBooleanValue2, str14, str12, context, obj14 instanceof LuaFunction ? (LuaFunction) obj14 : null);
    }

    public final void AEQbTJ(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i) {
        gKO gko = (gKO) C43248rlh.KWHzl.OLrzqt(gKO.class);
        if (gko != null) {
            gko.EZpvd(context, new TokenBase(str, str2, null, null, null, null, null, 0, 0, 0, 0, null, "dapp_trade", null, null, null, null, 0, 0, false, null, str3, false, false, null, null, str4, i, false, null, null, false, -203427844, null));
        }
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, boolean z2, java.lang.String str5, java.lang.String str6, android.content.Context context, final LuaFunction luaFunction) {
        TradeParam tradeParam = new TradeParam(str5, "nft_trade", new CoinInfo(str, str2, z, (java.lang.String) null, 8, (DefaultConstructorMarker) null), new CoinInfo(str3, str4, z2, (java.lang.String) null, 8, (DefaultConstructorMarker) null), str6, (java.lang.Integer) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.Boolean) null, false, (java.lang.String) null, 0, (java.lang.String) null, 16352, (DefaultConstructorMarker) null);
        gKO gko = (gKO) C43248rlh.KWHzl.OLrzqt(gKO.class);
        if (gko != null) {
            Intrinsics.copydefault(context, "");
            gKO.StateListAnimator.goToDexTrade$default(gko, context, (FragmentActivity) context, tradeParam, "bb", null, 0, new Function1() { // from class: o.gLG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return gLK.OLrzqt(luaFunction, (gKW) obj);
                }
            }, 48, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(LuaFunction luaFunction, gKW gkw) {
        java.lang.Exception excEZpvd;
        java.lang.String message;
        java.lang.String strCopydefault;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(gkw, "");
        if (!gkw.AEQbTJ()) {
            java.lang.Exception excEZpvd2 = gkw.EZpvd();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (excEZpvd2 != null ? excEZpvd2.getMessage() : null)) && (excEZpvd = gkw.EZpvd()) != null && (message = excEZpvd.getMessage()) != null) {
                C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
        } else if (luaFunction != null) {
            if (gkw.KWHzl() == null) {
                luaFunction.OLrzqt();
            } else {
                gKR gkrKWHzl = gkw.KWHzl();
                if (C33129mqd.OLrzqt((java.lang.CharSequence) (gkrKWHzl != null ? gkrKWHzl.copydefault() : null))) {
                    gKR gkrKWHzl2 = gkw.KWHzl();
                    if (gkrKWHzl2 != null && (strCopydefault = gkrKWHzl2.copydefault()) != null) {
                        str = strCopydefault;
                    }
                    luaFunction.copydefault(str);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
