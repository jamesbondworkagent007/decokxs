package o;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.deeplink.DexDeeplinkRouterKt$dexDeeplinkRouteHandler$1;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.dex.api.bean.CoinInfo;
import com.okinc.business.dex.api.bean.EditLimitOrderData;
import com.okinc.business.dex.api.bean.LimitParam;
import com.okinc.business.dex.api.bean.SignalTabApi;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dex.api.bean.TradeDetails;
import com.okinc.business.dex.api.bean.TradeParam;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType;
import com.okinc.business.trade.features.home.ui.cefi.common.TxDirection;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import o.gKO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9705bad {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [127=21] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r11v17, types: [o.laN$Application] */
    /* JADX WARN: Type inference failed for: r12v6, types: [o.hvO] */
    /* JADX WARN: Type inference failed for: r12v7, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r12v8, types: [o.hvO] */
    /* JADX WARN: Type inference failed for: r13v8, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Activity, android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [o.hvO] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r48v4, types: [o.hvO] */
    /* JADX WARN: Type inference failed for: r48v5, types: [o.hvO] */
    /* JADX WARN: Type inference failed for: r48v6, types: [o.hvO] */
    /* JADX WARN: Type inference failed for: r48v7, types: [o.hvO] */
    /* JADX WARN: Type inference failed for: r49v4, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r49v7, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r52v8, types: [o.hvO] */
    /* JADX WARN: Type inference failed for: r53v6, types: [android.app.Activity] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull android.app.Activity activity, @NotNull android.os.Bundle bundle, @NotNull C23285hvO c23285hvO, @NotNull C9708bag c9708bag, @NotNull InterfaceC25414iwK interfaceC25414iwK, @NotNull kKG kkg, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        DexDeeplinkRouterKt$dexDeeplinkRouteHandler$1 dexDeeplinkRouterKt$dexDeeplinkRouteHandler$1;
        InterfaceC25414iwK interfaceC25414iwK2;
        java.lang.Object objEZpvd;
        final LifecycleOwner lifecycleOwner;
        kKG kkg2;
        final ?? r3;
        final ?? r1;
        final java.lang.String str2;
        java.lang.String string;
        final java.lang.String str3;
        java.lang.String str4;
        final java.lang.String str5;
        java.lang.String str6;
        java.lang.Object obj;
        java.lang.String strGEmmrt;
        java.lang.String string2;
        SignalTabApi signalTabApi;
        final SignalTabApi signalTabApi2;
        int iIntValue;
        java.lang.String str7 = str;
        java.lang.Object obj2 = activity;
        final android.os.Bundle bundle2 = bundle;
        if (continuation instanceof DexDeeplinkRouterKt$dexDeeplinkRouteHandler$1) {
            dexDeeplinkRouterKt$dexDeeplinkRouteHandler$1 = (DexDeeplinkRouterKt$dexDeeplinkRouteHandler$1) continuation;
            int i = dexDeeplinkRouterKt$dexDeeplinkRouteHandler$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dexDeeplinkRouterKt$dexDeeplinkRouteHandler$1.label = i - Integer.MIN_VALUE;
            } else {
                dexDeeplinkRouterKt$dexDeeplinkRouteHandler$1 = new DexDeeplinkRouterKt$dexDeeplinkRouteHandler$1(continuation);
            }
        }
        java.lang.Object obj3 = dexDeeplinkRouterKt$dexDeeplinkRouteHandler$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dexDeeplinkRouterKt$dexDeeplinkRouteHandler$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj3);
            if (C22416heu.ejfBZ()) {
                C57656ymY.OLrzqt.valueOf();
            }
            Intrinsics.copydefault(obj2, "");
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) obj2;
            java.lang.Object obj4 = bundle2.get("ref");
            java.lang.String strGEmmrt2 = obj4 != null ? C33129mqd.gEmmrt(obj4) : null;
            if (strGEmmrt2 == null) {
                strGEmmrt2 = "";
            }
            if (strGEmmrt2.length() > 0) {
                java.lang.String string3 = bundle2.getString("shareFrom");
                java.lang.String strGEmmrt3 = string3 != null ? C33129mqd.gEmmrt(string3) : null;
                if (strGEmmrt3 == null) {
                    strGEmmrt3 = "";
                }
                c9708bag.EZpvd(str7, strGEmmrt2, strGEmmrt3);
            }
            dexDeeplinkRouterKt$dexDeeplinkRouteHandler$1.L$0 = str7;
            dexDeeplinkRouterKt$dexDeeplinkRouteHandler$1.L$1 = obj2;
            dexDeeplinkRouterKt$dexDeeplinkRouteHandler$1.L$2 = bundle2;
            dexDeeplinkRouterKt$dexDeeplinkRouteHandler$1.L$3 = c23285hvO;
            interfaceC25414iwK2 = interfaceC25414iwK;
            dexDeeplinkRouterKt$dexDeeplinkRouteHandler$1.L$4 = interfaceC25414iwK2;
            dexDeeplinkRouterKt$dexDeeplinkRouteHandler$1.L$5 = kkg;
            dexDeeplinkRouterKt$dexDeeplinkRouteHandler$1.L$6 = lifecycleOwner2;
            dexDeeplinkRouterKt$dexDeeplinkRouteHandler$1.label = 1;
            objEZpvd = kkg.EZpvd(dexDeeplinkRouterKt$dexDeeplinkRouteHandler$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            lifecycleOwner = lifecycleOwner2;
            kkg2 = kkg;
            r3 = c23285hvO;
            r1 = obj2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            LifecycleOwner lifecycleOwner3 = (LifecycleOwner) dexDeeplinkRouterKt$dexDeeplinkRouteHandler$1.L$6;
            kKG kkg3 = (kKG) dexDeeplinkRouterKt$dexDeeplinkRouteHandler$1.L$5;
            InterfaceC25414iwK interfaceC25414iwK3 = (InterfaceC25414iwK) dexDeeplinkRouterKt$dexDeeplinkRouteHandler$1.L$4;
            C23285hvO c23285hvO2 = (C23285hvO) dexDeeplinkRouterKt$dexDeeplinkRouteHandler$1.L$3;
            android.os.Bundle bundle3 = (android.os.Bundle) dexDeeplinkRouterKt$dexDeeplinkRouteHandler$1.L$2;
            android.app.Activity activity2 = (android.app.Activity) dexDeeplinkRouterKt$dexDeeplinkRouteHandler$1.L$1;
            java.lang.String str8 = (java.lang.String) dexDeeplinkRouterKt$dexDeeplinkRouteHandler$1.L$0;
            C56391yDq.AEQbTJ(obj3);
            interfaceC25414iwK2 = interfaceC25414iwK3;
            bundle2 = bundle3;
            lifecycleOwner = lifecycleOwner3;
            str7 = str8;
            objEZpvd = ((Result) obj3).m7386unboximpl();
            kkg2 = kkg3;
            r1 = activity2;
            r3 = c23285hvO2;
        }
        if (Result.m7383isFailureimpl(objEZpvd)) {
            objEZpvd = null;
        }
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) objEZpvd;
        boolean z = interfaceC9738bbJ != null && interfaceC9738bbJ.RJOkX() && interfaceC25414iwK2.valueOf();
        str2 = "";
        switch (str7.hashCode()) {
            case -1902006266:
                if (str7.equals("dex/scanner") && kkg2.AhwBna()) {
                    copydefault((android.content.Context) r1, (Function0<Unit>) new Function0() { // from class: o.ban
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C9705bad.djBIcL();
                        }
                    });
                }
                break;
            case -1173559663:
                if (str7.equals("dex/transaction/dialog")) {
                    java.lang.Object obj5 = bundle2.get("fromChainId");
                    java.lang.String strGEmmrt4 = obj5 != null ? C33129mqd.gEmmrt(obj5) : null;
                    if (strGEmmrt4 == null) {
                        strGEmmrt4 = str2;
                    }
                    java.lang.Object obj6 = bundle2.get("toChainId");
                    java.lang.String strGEmmrt5 = obj6 != null ? C33129mqd.gEmmrt(obj6) : null;
                    if (strGEmmrt5 == null) {
                        strGEmmrt5 = str2;
                    }
                    java.lang.String string4 = bundle2.getString("fromTokenContractAddress");
                    java.lang.String strGEmmrt6 = string4 != null ? C33129mqd.gEmmrt(string4) : null;
                    java.lang.Object obj7 = bundle2.get("isFromNative");
                    boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) (obj7 != null ? C33129mqd.gEmmrt(obj7) : null), (java.lang.Object) "1");
                    java.lang.Object obj8 = bundle2.get("tradeMode");
                    KWHzl(r1, new TradeParam("", "", new CoinInfo("", "", false, (java.lang.String) null, 8, (DefaultConstructorMarker) null), new CoinInfo(strGEmmrt4, strGEmmrt6, zEZpvd, (java.lang.String) null, 8, (DefaultConstructorMarker) null), "", (java.lang.Integer) null, Intrinsics.EZpvd((java.lang.Object) strGEmmrt4, (java.lang.Object) strGEmmrt5) ? "type_swap" : "type_bridge", false, (obj8 == null || (string = obj8.toString()) == null) ? str2 : string, (java.lang.Boolean) null, false, (java.lang.String) null, 0, (java.lang.String) null, 16032, (DefaultConstructorMarker) null));
                }
                break;
            case -981090327:
                java.lang.String str9 = str2;
                if (str7.equals("dex/market/homecustomlist")) {
                    java.lang.Object obj9 = bundle2.get("moduleType");
                    java.lang.String strGEmmrt7 = obj9 != null ? C33129mqd.gEmmrt(obj9) : null;
                    if (strGEmmrt7 == null) {
                        strGEmmrt7 = str9;
                    }
                    java.lang.Object obj10 = bundle2.get("moduleName");
                    java.lang.String strGEmmrt8 = obj10 != null ? C33129mqd.gEmmrt(obj10) : null;
                    if (strGEmmrt8 == null) {
                        strGEmmrt8 = str9;
                    }
                    java.lang.Object obj11 = bundle2.get("moduleNameEnglish");
                    java.lang.String strGEmmrt9 = obj11 != null ? C33129mqd.gEmmrt(obj11) : null;
                    if (strGEmmrt9 != null) {
                        str9 = strGEmmrt9;
                    }
                    if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strGEmmrt7)) {
                        return Unit.INSTANCE;
                    }
                    if (bundle2.get("instant") == null) {
                        final ?? r48 = r3;
                        final ?? r49 = r1;
                        final java.lang.String str10 = strGEmmrt7;
                        final java.lang.String str11 = strGEmmrt8;
                        final java.lang.String str12 = str9;
                        OLrzqt((android.content.Context) r1, (Function0<Unit>) new Function0() { // from class: o.bav
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C9705bad.copydefault(r48, r49, str10, str11, str12);
                            }
                        });
                    } else {
                        r3.copydefault(r1, strGEmmrt7, strGEmmrt8, str9);
                        Unit unit = Unit.INSTANCE;
                    }
                }
                break;
            case -955683945:
                if (str7.equals("dex/coin/detail")) {
                    java.lang.Object obj12 = bundle2.get("chainId");
                    java.lang.String strGEmmrt10 = obj12 != null ? C33129mqd.gEmmrt(obj12) : null;
                    java.lang.String str13 = strGEmmrt10 == null ? str2 : strGEmmrt10;
                    java.lang.String string5 = bundle2.getString("tokenContractAddress");
                    java.lang.String strGEmmrt11 = string5 != null ? C33129mqd.gEmmrt(string5) : null;
                    java.lang.String str14 = strGEmmrt11 == null ? str2 : strGEmmrt11;
                    java.lang.String string6 = bundle2.getString("tokenLogoUrl");
                    java.lang.String strGEmmrt12 = string6 != null ? C33129mqd.gEmmrt(string6) : null;
                    java.lang.String str15 = strGEmmrt12 == null ? str2 : strGEmmrt12;
                    java.lang.String string7 = bundle2.getString("chainLogoUrl");
                    java.lang.String strGEmmrt13 = string7 != null ? C33129mqd.gEmmrt(string7) : null;
                    java.lang.String str16 = strGEmmrt13 == null ? str2 : strGEmmrt13;
                    java.lang.String string8 = bundle2.getString("tokenSymbol");
                    java.lang.String strGEmmrt14 = string8 != null ? C33129mqd.gEmmrt(string8) : null;
                    java.lang.String str17 = strGEmmrt14 == null ? str2 : strGEmmrt14;
                    java.lang.String string9 = bundle2.getString("tokenName");
                    java.lang.String strGEmmrt15 = string9 != null ? C33129mqd.gEmmrt(string9) : null;
                    java.lang.String str18 = strGEmmrt15 == null ? str2 : strGEmmrt15;
                    java.lang.String string10 = bundle2.getString("tab");
                    java.lang.String strGEmmrt16 = string10 != null ? C33129mqd.gEmmrt(string10) : null;
                    if (strGEmmrt16 == null) {
                        strGEmmrt16 = str2;
                    }
                    java.lang.String lowerCase = strGEmmrt16.toLowerCase(java.util.Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, str2);
                    java.lang.Object obj13 = bundle2.get("bizSource");
                    java.lang.String strGEmmrt17 = obj13 != null ? C33129mqd.gEmmrt(obj13) : null;
                    if (strGEmmrt17 == null) {
                        strGEmmrt17 = str2;
                    }
                    r3.EZpvd(r1, new TokenBase(str13, str14, str15, str16, null, str17, str18, 0, 0, 0, 0, null, strGEmmrt17.length() == 0 ? "Unknown" : strGEmmrt17, null, null, null, null, 0, 0, false, null, lowerCase, false, false, null, null, null, 0, false, null, null, false, -2101360, null));
                    java.lang.String string11 = bundle2.getString("from_module");
                    if (string11 != null) {
                        java.lang.String string12 = bundle2.getString("from_channel_id");
                        C23301hve.EZpvd(string11, "market_token", string12 == null ? str2 : string12);
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
                break;
            case -866258140:
                if (str7.equals("dex/history/detail")) {
                    java.lang.Object obj14 = bundle2.get("orderId");
                    java.lang.String strGEmmrt18 = obj14 != null ? C33129mqd.gEmmrt(obj14) : null;
                    final java.lang.String str19 = strGEmmrt18 == null ? str2 : strGEmmrt18;
                    AEQbTJ((android.content.Context) r1, (Function0<Unit>) new Function0() { // from class: o.bas
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C9705bad.AEQbTJ(r3, r1, str19, lifecycleOwner);
                        }
                    });
                }
                break;
            case -845859497:
                if (str7.equals("dex/market/analysis")) {
                    java.lang.Object obj15 = bundle2.get("chainId");
                    java.lang.String strGEmmrt19 = obj15 != null ? C33129mqd.gEmmrt(obj15) : null;
                    if (strGEmmrt19 == null) {
                        strGEmmrt19 = str2;
                    }
                    java.lang.String string13 = bundle2.getString("tokenContractAddress");
                    java.lang.String strGEmmrt20 = string13 != null ? C33129mqd.gEmmrt(string13) : null;
                    r3.KWHzl(r1, strGEmmrt19, strGEmmrt20 == null ? str2 : strGEmmrt20);
                }
                break;
            case -832491004:
                if (str7.equals("dex/copy-trade")) {
                    EZpvd((android.content.Context) r1, (Function0<Unit>) new Function0() { // from class: o.baq
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C9705bad.OLrzqt(bundle2, r3);
                        }
                    });
                }
                break;
            case -618757559:
                if (str7.equals("dex/limit-order/history")) {
                    EZpvd((android.content.Context) r1, (Function0<Unit>) new Function0() { // from class: o.bax
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C9705bad.AEQbTJ(r3, r1, lifecycleOwner);
                        }
                    });
                }
                break;
            case -608418200:
                if (str7.equals("dex/market/meme-factory")) {
                    if (kkg2.AhwBna()) {
                        return Unit.INSTANCE;
                    }
                    if (bundle2.get("instant") == null) {
                        OLrzqt((android.content.Context) r1, (Function0<Unit>) new Function0() { // from class: o.bai
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C9705bad.copydefault(r3, r1);
                            }
                        });
                    } else {
                        r3.OLrzqt(r1);
                        Unit unit3 = Unit.INSTANCE;
                    }
                }
                break;
            case -541479407:
                if (str7.equals("dex/advanced/buy")) {
                    int i3 = bundle2.getInt("chainId");
                    final java.lang.String string14 = bundle2.getString("buyTokenContractAddress");
                    final java.lang.String string15 = bundle2.getString("payTokenContractAddress");
                    java.lang.Double dAEQbTJ = C56443yFo.AEQbTJ(bundle2.getDouble(OtcExtraKeys.AMOUNT));
                    final java.lang.String strGEmmrt21 = C33129mqd.gEmmrt(C33129mqd.AhwBna(C56443yFo.AEQbTJ(dAEQbTJ.doubleValue()), C56443yFo.AEQbTJ(0)) ? dAEQbTJ : null);
                    int i4 = z ? bundle2.getInt("orderType", AdvancedOrderType.MARKET.getValue()) : AdvancedOrderType.MARKET.getValue();
                    final java.lang.String strValueOf = java.lang.String.valueOf(i3);
                    final ?? r482 = r3;
                    final int i5 = i4;
                    EZpvd((android.content.Context) r1, (Function0<Unit>) new Function0() { // from class: o.bam
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C9705bad.KWHzl(r482, strValueOf, string15, string14, strGEmmrt21, i5);
                        }
                    });
                    java.lang.String string16 = bundle2.getString("from_module");
                    if (string16 != null) {
                        java.lang.String string17 = bundle2.getString("from_channel_id");
                        C23301hve.EZpvd(string16, "advanced_mode", string17 == null ? str2 : string17);
                        Unit unit4 = Unit.INSTANCE;
                    }
                }
                break;
            case -85177148:
                if (str7.equals("dex/market/group-manager")) {
                    java.lang.String string18 = bundle2.getString("pageFrom");
                    java.lang.String strGEmmrt22 = string18 != null ? C33129mqd.gEmmrt(string18) : null;
                    final java.lang.String str20 = strGEmmrt22 == null ? str2 : strGEmmrt22;
                    OLrzqt((android.content.Context) r1, (Function0<Unit>) new Function0() { // from class: o.bap
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C9705bad.gEmmrt(r3, r1, str20);
                        }
                    });
                }
                break;
            case 319715636:
                if (str7.equals("dex/market")) {
                    final java.lang.String string19 = bundle2.getString("tab");
                    java.lang.Object obj16 = bundle2.get("chainId");
                    final java.lang.String strGEmmrt23 = obj16 != null ? C33129mqd.gEmmrt(obj16) : null;
                    OLrzqt((android.content.Context) r1, (Function0<Unit>) new Function0() { // from class: o.baw
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C9705bad.EZpvd(r3, string19, strGEmmrt23);
                        }
                    });
                }
                break;
            case 394498343:
                if (str7.equals("dex/advanced/sell")) {
                    int i6 = bundle2.getInt("chainId");
                    final java.lang.String string20 = bundle2.getString("sellTokenContractAddress");
                    final java.lang.String string21 = bundle2.getString("forTokenContractAddress");
                    java.lang.Double dAEQbTJ2 = C56443yFo.AEQbTJ(bundle2.getDouble(OtcExtraKeys.AMOUNT));
                    final java.lang.String strGEmmrt24 = C33129mqd.gEmmrt(C33129mqd.AhwBna(C56443yFo.AEQbTJ(dAEQbTJ2.doubleValue()), C56443yFo.AEQbTJ(0)) ? dAEQbTJ2 : null);
                    int i7 = z ? bundle2.getInt("orderType", AdvancedOrderType.MARKET.getValue()) : AdvancedOrderType.MARKET.getValue();
                    final java.lang.String strValueOf2 = java.lang.String.valueOf(i6);
                    final ?? r483 = r3;
                    final int i8 = i7;
                    EZpvd((android.content.Context) r1, (Function0<Unit>) new Function0() { // from class: o.bao
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C9705bad.AEQbTJ(r483, strValueOf2, string20, string21, strGEmmrt24, i8);
                        }
                    });
                }
                break;
            case 723215130:
                if (str7.equals("dex/meme/swap")) {
                    final java.lang.String strValueOf3 = java.lang.String.valueOf(bundle2.getInt("chainId"));
                    final java.lang.String string22 = bundle2.getString("tokenContractAddress", str2);
                    final int i9 = bundle2.getInt("transaction_direction");
                    java.lang.String string23 = bundle2.getString(OtcExtraKeys.AMOUNT);
                    final java.lang.String str21 = string23 == null ? str2 : string23;
                    final java.lang.String strValueOf4 = java.lang.String.valueOf(bundle2.getInt("strategyType"));
                    boolean z2 = bundle2.getBoolean("dex/transaction/dialog", false);
                    final int i10 = bundle2.getInt("sourceType");
                    java.lang.String string24 = bundle2.getString("sourcePageName");
                    if (string24 == null) {
                        str4 = "payTokenContractAddress";
                        str3 = str2;
                    } else {
                        str3 = string24;
                        str4 = "payTokenContractAddress";
                    }
                    java.lang.String string25 = bundle2.getString(str4);
                    if (string25 == null) {
                        str6 = "forTokenContractAddress";
                        str5 = str2;
                    } else {
                        str5 = string25;
                        str6 = "forTokenContractAddress";
                    }
                    java.lang.String string26 = bundle2.getString(str6);
                    final java.lang.String str22 = string26 == null ? str2 : string26;
                    if (!z2) {
                        final ?? r12 = r3;
                        EZpvd((android.content.Context) r1, (Function0<Unit>) new Function0() { // from class: o.baj
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C9705bad.EZpvd(r12, strValueOf3, string22, i9, str21, strValueOf4, i10, str3, str5, str22);
                            }
                        });
                        java.lang.String string27 = bundle2.getString("from_module");
                        if (string27 != null) {
                            java.lang.String string28 = bundle2.getString("from_channel_id");
                            C23301hve.EZpvd(string27, "meme_mode", string28 == null ? str2 : string28);
                            Unit unit5 = Unit.INSTANCE;
                        }
                    } else {
                        ?? r11 = ActivityC30394laN.Companion;
                        Intrinsics.copydefault((java.lang.Object) string22);
                        r11.EZpvd(r1, "extra_source_type", strValueOf3, string22, true, strValueOf4, i10, str3);
                        Unit unit6 = Unit.INSTANCE;
                    }
                }
                break;
            case 1113379979:
                if (str7.equals("dex/swap")) {
                    C22370heA.copydefault(true);
                    java.lang.Object obj17 = bundle2.get("fromChainId");
                    java.lang.String strGEmmrt25 = obj17 != null ? C33129mqd.gEmmrt(obj17) : null;
                    final java.lang.String str23 = strGEmmrt25 == null ? str2 : strGEmmrt25;
                    java.lang.String string29 = bundle2.getString("fromTokenContractAddress");
                    final java.lang.String strGEmmrt26 = string29 != null ? C33129mqd.gEmmrt(string29) : null;
                    java.lang.Object obj18 = bundle2.get("toChainId");
                    java.lang.String strGEmmrt27 = obj18 != null ? C33129mqd.gEmmrt(obj18) : null;
                    if (strGEmmrt27 == null) {
                        strGEmmrt27 = str2;
                    }
                    java.lang.String string30 = bundle2.getString("toTokenContractAddress");
                    final java.lang.String strGEmmrt28 = string30 != null ? C33129mqd.gEmmrt(string30) : null;
                    java.lang.Object obj19 = bundle2.get("isFromNative");
                    if (obj19 != null) {
                        strGEmmrt = C33129mqd.gEmmrt(obj19);
                        obj = "1";
                    } else {
                        obj = "1";
                        strGEmmrt = null;
                    }
                    final boolean zEZpvd2 = Intrinsics.EZpvd(strGEmmrt, obj);
                    java.lang.Object obj20 = bundle2.get("isToNative");
                    final boolean zEZpvd3 = Intrinsics.EZpvd(obj20 != null ? C33129mqd.gEmmrt(obj20) : null, obj);
                    java.lang.Object obj21 = bundle2.get(OtcExtraKeys.AMOUNT);
                    java.lang.String strGEmmrt29 = obj21 != null ? C33129mqd.gEmmrt(obj21) : null;
                    final java.lang.String str24 = strGEmmrt29 == null ? str2 : strGEmmrt29;
                    java.lang.Object obj22 = bundle2.get("tradeMode");
                    java.lang.Object obj23 = bundle2.get("swapType");
                    java.lang.String strGEmmrt30 = obj23 != null ? C33129mqd.gEmmrt(obj23) : null;
                    final java.lang.String str25 = strGEmmrt30 == null ? str2 : strGEmmrt30;
                    final boolean z3 = bundle2.getBoolean("isOldTradingDialog");
                    final java.lang.String str26 = (obj22 == null || (string2 = obj22.toString()) == null) ? str2 : string2;
                    final int i11 = bundle2.getInt("sourceType");
                    java.lang.String string31 = bundle2.getString("sourcePageName");
                    str2 = string31 != null ? string31 : "";
                    final ?? r122 = r3;
                    final ?? r13 = r1;
                    final java.lang.String str27 = strGEmmrt27;
                    final LifecycleOwner lifecycleOwner4 = lifecycleOwner;
                    EZpvd((android.content.Context) r1, (Function0<Unit>) new Function0() { // from class: o.bah
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C9705bad.KWHzl(r122, r13, str23, strGEmmrt26, zEZpvd2, str27, strGEmmrt28, zEZpvd3, str24, str25, str26, z3, str2, i11, lifecycleOwner4);
                        }
                    });
                }
                break;
            case 1161916292:
                if (str7.equals("dex/market/address-tracker")) {
                    java.lang.String string32 = bundle2.getString("pageFrom");
                    java.lang.String strGEmmrt31 = string32 != null ? C33129mqd.gEmmrt(string32) : null;
                    final java.lang.String str28 = strGEmmrt31 == null ? str2 : strGEmmrt31;
                    if (!kkg2.AhwBna()) {
                        OLrzqt((android.content.Context) r1, (Function0<Unit>) new Function0() { // from class: o.bal
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C9705bad.AEQbTJ(r3, r1, str28);
                            }
                        });
                    } else {
                        OLrzqt((android.content.Context) r1, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.KWHzl(), (Function0<Unit>) new Function0() { // from class: o.bak
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C9705bad.OLrzqt();
                            }
                        });
                    }
                }
                break;
            case 1408933532:
                if (str7.equals("dex/history")) {
                    EZpvd((android.content.Context) r1, (Function0<Unit>) new Function0() { // from class: o.bau
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C9705bad.OLrzqt(r3, r1, lifecycleOwner);
                        }
                    });
                }
                break;
            case 1507997537:
                if (str7.equals("dex/market/smart-money")) {
                    final java.lang.String string33 = bundle2.getString("moduleNameEnglish");
                    if (string33 == null) {
                        string33 = str2;
                    }
                    final java.lang.String string34 = bundle2.getString("pageFrom");
                    if (string34 == null) {
                        string34 = str2;
                    }
                    java.lang.String string35 = bundle2.getString("tab");
                    final boolean zGEmmrt = C59449zhJ.gEmmrt(string35 == null ? str2 : string35, "ranking", true);
                    boolean z4 = bundle2.get("instant") != null;
                    boolean zAhwBna = kkg2.AhwBna();
                    java.lang.String string36 = bundle2.getString("signalTab");
                    final Function0 function0 = new Function0() { // from class: o.baz
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C9705bad.OLrzqt(r3, r1, string34);
                        }
                    };
                    if (string36 == null) {
                        signalTabApi2 = SignalTabApi.OVERVIEW;
                    } else {
                        java.util.Iterator<SignalTabApi> it = SignalTabApi.getEntries().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                SignalTabApi next = it.next();
                                if (Intrinsics.EZpvd((java.lang.Object) next.getTabValue(), (java.lang.Object) string36)) {
                                    signalTabApi = next;
                                }
                            } else {
                                signalTabApi = null;
                            }
                        }
                        signalTabApi2 = signalTabApi;
                        if (signalTabApi2 == null) {
                            signalTabApi2 = SignalTabApi.GEMS;
                        }
                    }
                    final Function0 function02 = new Function0() { // from class: o.bay
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C9705bad.EZpvd(r3, r1, string33, signalTabApi2);
                        }
                    };
                    if (zAhwBna && zGEmmrt) {
                        OLrzqt((android.content.Context) r1, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("param_tracker_tab_position", C56443yFo.AEQbTJ(0))), (Function0<Unit>) new Function0() { // from class: o.baD
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C9705bad.KWHzl();
                            }
                        });
                    } else if (z4) {
                        if (zGEmmrt) {
                            function0.invoke();
                        } else {
                            function02.invoke();
                        }
                        Unit unit7 = Unit.INSTANCE;
                    } else if (!zAhwBna) {
                        OLrzqt((android.content.Context) r1, (Function0<Unit>) new Function0() { // from class: o.baB
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C9705bad.KWHzl(zGEmmrt, function0, function02);
                            }
                        });
                    } else {
                        copydefault((android.content.Context) r1, (Function0<Unit>) new Function0() { // from class: o.baF
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C9705bad.copydefault(function02);
                            }
                        });
                    }
                }
                break;
            case 1708131031:
                if (str7.equals("dex/limit-order/history/detail")) {
                    java.lang.Object obj24 = bundle2.get("orderId");
                    java.lang.String strGEmmrt32 = obj24 != null ? C33129mqd.gEmmrt(obj24) : null;
                    str2 = strGEmmrt32 != null ? strGEmmrt32 : "";
                    java.lang.Object obj25 = bundle2.get("limitOrderType");
                    if (!(obj25 instanceof java.lang.String)) {
                        if (obj25 instanceof java.lang.Integer) {
                            iIntValue = ((java.lang.Number) obj25).intValue();
                        }
                        java.lang.Object obj26 = bundle2.get("strategyMode");
                        final ?? r484 = r3;
                        final ?? r492 = r1;
                        final java.lang.String str29 = str2;
                        final int i12 = iIntValue;
                        final java.lang.Integer intOrNull = !(obj26 instanceof java.lang.String) ? StringsKt__StringNumberConversionsKt.toIntOrNull((java.lang.String) obj26) : obj26 instanceof java.lang.Integer ? (java.lang.Integer) obj26 : null;
                        AEQbTJ((android.content.Context) r1, (Function0<Unit>) new Function0() { // from class: o.bat
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C9705bad.copydefault(r484, r492, str29, i12, intOrNull);
                            }
                        });
                    } else {
                        java.lang.Integer intOrNull2 = StringsKt__StringNumberConversionsKt.toIntOrNull((java.lang.String) obj25);
                        iIntValue = intOrNull2 != null ? intOrNull2.intValue() : 6;
                        java.lang.Object obj262 = bundle2.get("strategyMode");
                        final C23285hvO r4842 = r3;
                        final android.app.Activity r4922 = r1;
                        final java.lang.String str292 = str2;
                        final int i122 = iIntValue;
                        final java.lang.Integer intOrNull3 = !(obj262 instanceof java.lang.String) ? StringsKt__StringNumberConversionsKt.toIntOrNull((java.lang.String) obj262) : obj262 instanceof java.lang.Integer ? (java.lang.Integer) obj262 : null;
                        AEQbTJ((android.content.Context) r1, (Function0<Unit>) new Function0() { // from class: o.bat
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C9705bad.copydefault(r4842, r4922, str292, i122, intOrNull3);
                            }
                        });
                    }
                }
                break;
            case 1920058215:
                if (str7.equals("dex/copy-trade/create")) {
                    EZpvd((android.content.Context) r1, (Function0<Unit>) new Function0() { // from class: o.bar
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C9705bad.AEQbTJ(bundle2, r3);
                        }
                    });
                }
                break;
            case 2009490628:
                if (str7.equals("dex/limit-order")) {
                    java.lang.Object obj27 = bundle2.get("fromChainId");
                    java.lang.String strGEmmrt33 = obj27 != null ? C33129mqd.gEmmrt(obj27) : null;
                    if (strGEmmrt33 == null) {
                        strGEmmrt33 = str2;
                    }
                    java.lang.String string37 = bundle2.getString("fromTokenContractAddress");
                    java.lang.String strGEmmrt34 = string37 != null ? C33129mqd.gEmmrt(string37) : null;
                    if (strGEmmrt34 == null) {
                        strGEmmrt34 = str2;
                    }
                    java.lang.Object obj28 = bundle2.get("toChainId");
                    java.lang.String strGEmmrt35 = obj28 != null ? C33129mqd.gEmmrt(obj28) : null;
                    if (strGEmmrt35 == null) {
                        strGEmmrt35 = str2;
                    }
                    java.lang.String string38 = bundle2.getString("toTokenContractAddress");
                    java.lang.String strGEmmrt36 = string38 != null ? C33129mqd.gEmmrt(string38) : null;
                    final java.lang.String str30 = strGEmmrt33;
                    final java.lang.String str31 = strGEmmrt35;
                    final java.lang.String str32 = strGEmmrt34;
                    final java.lang.String str33 = strGEmmrt36 != null ? strGEmmrt36 : "";
                    final ?? r52 = r3;
                    final ?? r53 = r1;
                    final LifecycleOwner lifecycleOwner5 = lifecycleOwner;
                    EZpvd((android.content.Context) r1, (Function0<Unit>) new Function0() { // from class: o.baA
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C9705bad.OLrzqt(str30, str31, str32, str33, r52, r53, lifecycleOwner5);
                        }
                    });
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C23285hvO c23285hvO, android.app.Activity activity, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, boolean z2, java.lang.String str5, java.lang.String str6, java.lang.String str7, boolean z3, java.lang.String str8, int i, LifecycleOwner lifecycleOwner) {
        c23285hvO.OLrzqt(activity, new TradeParam("", "", new CoinInfo(str, str2, z, (java.lang.String) null, 8, (DefaultConstructorMarker) null), new CoinInfo(str3, str4, z2, (java.lang.String) null, 8, (DefaultConstructorMarker) null), str5, (java.lang.Integer) null, str6, false, str7, (java.lang.Boolean) null, z3, str8, i, (java.lang.String) null, 8864, (DefaultConstructorMarker) null), lifecycleOwner);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C23285hvO c23285hvO, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, int i2, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        Intrinsics.copydefault((java.lang.Object) str2);
        c23285hvO.KWHzl(str, str2, i, str3, str4, i2, str5, i == 0 ? str6 : str7);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C23285hvO c23285hvO, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i) {
        c23285hvO.EZpvd(str, str2, str3, TxDirection.BUY.getValue(), str4, i);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C23285hvO c23285hvO, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i) {
        c23285hvO.EZpvd(str, str2, str3, TxDirection.SELL.getValue(), str4, i);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(android.os.Bundle bundle, C23285hvO c23285hvO) {
        c23285hvO.EZpvd(bundle.getInt("tab"));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(android.os.Bundle bundle, C23285hvO c23285hvO) {
        java.lang.String string = bundle.getString("copyFromAddress");
        if (string == null) {
            string = "";
        }
        java.lang.String string2 = bundle.getString("strategyId");
        c23285hvO.EZpvd(string, string2 != null ? string2 : "");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C23285hvO c23285hvO, android.app.Activity activity, LifecycleOwner lifecycleOwner) {
        c23285hvO.AEQbTJ(activity, lifecycleOwner);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C23285hvO c23285hvO, android.app.Activity activity, java.lang.String str, LifecycleOwner lifecycleOwner) {
        c23285hvO.AEQbTJ(activity, new TradeDetails(str), lifecycleOwner);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C23285hvO c23285hvO, android.app.Activity activity, java.lang.String str, int i, java.lang.Integer num) {
        c23285hvO.OLrzqt(activity, str, i, num);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C23285hvO c23285hvO, java.lang.String str, java.lang.String str2) {
        c23285hvO.OLrzqt(str, str2);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C23285hvO c23285hvO, android.app.Activity activity) {
        c23285hvO.OLrzqt(activity);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C23285hvO c23285hvO, android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        c23285hvO.copydefault(activity, str, str2, str3);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, C23285hvO c23285hvO, android.app.Activity activity, LifecycleOwner lifecycleOwner) {
        LimitParam limitParam;
        if (str.length() > 0 || str2.length() > 0 || str3.length() > 0 || str4.length() > 0) {
            limitParam = new LimitParam(str, str3, str2, str4, (java.lang.String) null, (EditLimitOrderData) null, false, WalletImportError.ERROR_CODE_AA_EXIST, (DefaultConstructorMarker) null);
        } else {
            limitParam = LimitParam.Companion.EZpvd();
        }
        c23285hvO.AEQbTJ(activity, lifecycleOwner, limitParam);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C23285hvO c23285hvO, android.app.Activity activity, LifecycleOwner lifecycleOwner) {
        c23285hvO.KWHzl(activity, lifecycleOwner);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C23285hvO c23285hvO, android.app.Activity activity, java.lang.String str) {
        c23285hvO.copydefault(activity, str, 0);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C23285hvO c23285hvO, android.app.Activity activity, java.lang.String str, SignalTabApi signalTabApi) {
        c23285hvO.EZpvd(activity, str, signalTabApi);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(boolean z, Function0 function0, Function0 function02) {
        if (z) {
            function0.invoke();
        } else {
            function02.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt() {
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C23285hvO c23285hvO, android.app.Activity activity, java.lang.String str) {
        gKO.StateListAnimator.goToAddressTracker$default(c23285hvO, activity, str, 0, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C23285hvO c23285hvO, android.app.Activity activity, java.lang.String str) {
        gKO.StateListAnimator.goToAddressTracker$default(c23285hvO, activity, str, 0, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL() {
        return Unit.INSTANCE;
    }

    public static final void KWHzl(@NotNull android.content.Context context, @NotNull TradeParam tradeParam) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(tradeParam, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC30394laN.class);
        C31200lpY.EZpvd(intent, "wallet_trade");
        intent.putExtra("trade_data", tradeParam);
        context.startActivity(intent);
    }

    public static final Unit AEQbTJ(android.content.Context context, Function0<Unit> function0) {
        InterfaceC9775bbu interfaceC9775bbu;
        java.util.List listKWHzl = C43251rlk.KWHzl(InterfaceC9775bbu.class);
        if (listKWHzl == null || (interfaceC9775bbu = (InterfaceC9775bbu) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) == null) {
            return null;
        }
        interfaceC9775bbu.AEQbTJ(context, null, C56424yEw.KWHzl(), function0);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(android.content.Context context, Function0<Unit> function0) {
        InterfaceC9775bbu interfaceC9775bbu;
        java.util.List listKWHzl = C43251rlk.KWHzl(InterfaceC9775bbu.class);
        if (listKWHzl == null || (interfaceC9775bbu = (InterfaceC9775bbu) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) == null) {
            return null;
        }
        interfaceC9775bbu.AEQbTJ(context, java.lang.Integer.valueOf(C9768bbn.copydefault), C56424yEw.KWHzl(), function0);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(android.content.Context context, Function0<Unit> function0) {
        InterfaceC9775bbu interfaceC9775bbu;
        java.util.List listKWHzl = C43251rlk.KWHzl(InterfaceC9775bbu.class);
        if (listKWHzl == null || (interfaceC9775bbu = (InterfaceC9775bbu) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) == null) {
            return null;
        }
        interfaceC9775bbu.AEQbTJ(context, java.lang.Integer.valueOf(C9768bbn.valueOf), C56424yEw.KWHzl(), function0);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map, Function0<Unit> function0) {
        InterfaceC9775bbu interfaceC9775bbu;
        java.util.List listKWHzl = C43251rlk.KWHzl(InterfaceC9775bbu.class);
        if (listKWHzl == null || (interfaceC9775bbu = (InterfaceC9775bbu) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) == null) {
            return null;
        }
        interfaceC9775bbu.AEQbTJ(context, java.lang.Integer.valueOf(C9768bbn.AkhnZx), map, function0);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(android.content.Context context, Function0<Unit> function0) {
        InterfaceC9775bbu interfaceC9775bbu;
        java.util.List listKWHzl = C43251rlk.KWHzl(InterfaceC9775bbu.class);
        if (listKWHzl == null || (interfaceC9775bbu = (InterfaceC9775bbu) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) == null) {
            return null;
        }
        interfaceC9775bbu.copydefault(context, java.lang.Integer.valueOf(C9768bbn.EZpvd), C56424yEw.KWHzl(), 0L, function0);
        return Unit.INSTANCE;
    }
}
