package com.immomo.mls.fun.ud.view;

import android.content.Context;
import com.google.gson.Gson;
import com.immomo.mls.fun.other.BlueLinkTag;
import com.immomo.mls.fun.other.CoinTag;
import com.immomo.mls.fun.other.ContentTagList;
import com.immomo.mls.fun.ud.UDColor;
import com.immomo.mls.fun.ud.view.UDOKMarketFeedContentView;
import com.immomo.mls.fun.ui.custom.JColor;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55298xhM;
import o.C56390yDp;
import o.C7869arv;
import o.C7875asA;
import o.InterfaceC60044zuT;
import o.pUU;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class UDOKMarketFeedContentView extends UDView<C7875asA> {
    public static final Application Companion = new Application(null);
    public static final String[] KWHzl = {"setContent", "setContentWithMaskColor", "setContentWithTagList", "setTextColorAndMoreTextColor"};

    @InterfaceC60044zuT
    public UDOKMarketFeedContentView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ud.view.UDOKMarketFeedContentView.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final String[] EZpvd() {
            return UDOKMarketFeedContentView.KWHzl;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C7875asA AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        return new C7875asA(contextAubY, null, 0, 6, null);
    }

    @InterfaceC60044zuT
    public final LuaValue[] setTextColorAndMoreTextColor(@NotNull LuaValue[] luaValueArr) {
        JColor jColorAEQbTJ;
        JColor jColorAEQbTJ2;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Object objGEmmrt = yDV.gEmmrt(luaValueArr, 0);
        UDColor uDColor = objGEmmrt instanceof UDColor ? (UDColor) objGEmmrt : null;
        Integer numValueOf = (uDColor == null || (jColorAEQbTJ2 = uDColor.AEQbTJ()) == null) ? null : Integer.valueOf(jColorAEQbTJ2.getColor(this.globals));
        Object objGEmmrt2 = yDV.gEmmrt(luaValueArr, 1);
        UDColor uDColor2 = objGEmmrt2 instanceof UDColor ? (UDColor) objGEmmrt2 : null;
        ((C7875asA) this.dHguZz).setTextColorAndMoreTextColor(numValueOf, (uDColor2 == null || (jColorAEQbTJ = uDColor2.AEQbTJ()) == null) ? null : Integer.valueOf(jColorAEQbTJ.getColor(this.globals)));
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setContent(@NotNull LuaValue[] luaValueArr) {
        String javaString;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        if (luaValueArr.length == 0) {
            pUU.copydefault("OKMarketFeedContentView", "setPostContent: invalid params");
            return null;
        }
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        String str = (luaValue == null || (javaString = luaValue.toJavaString()) == null) ? "" : javaString;
        int iDp2px$default = ((LuaValue) yDV.gEmmrt(luaValueArr, 1)) != null ? C55298xhM.dp2px$default(r5.toInt(), null, 1, null) : -1;
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 2);
        int i = luaValue2 != null ? luaValue2.toInt() : 0;
        LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 3);
        boolean z = luaValue3 != null ? luaValue3.toBoolean() : false;
        LuaValue luaValue4 = (LuaValue) yDV.gEmmrt(luaValueArr, 4);
        int i2 = luaValue4 != null ? luaValue4.toInt() : 0;
        LuaValue luaValue5 = (LuaValue) yDV.gEmmrt(luaValueArr, 5);
        final LuaFunction luaFunction = luaValue5 != null ? luaValue5.toLuaFunction() : null;
        ((C7875asA) this.dHguZz).copydefault(i);
        ((C7875asA) this.dHguZz).setTextAndAvatars(str, iDp2px$default, z, i2, new Function0() { // from class: o.ajZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return UDOKMarketFeedContentView.KWHzl(luaFunction);
            }
        }, (224 & 32) != 0 ? null : null, (224 & 64) != 0 ? new CoinTag((ContentTagList) null, 1, (DefaultConstructorMarker) null) : null, (224 & 128) != 0 ? new Function1() { // from class: o.asE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C7875asA.OLrzqt((BlueLinkTag) obj);
            }
        } : null);
        return null;
    }

    public static final Unit KWHzl(LuaFunction luaFunction) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setContentWithMaskColor(@NotNull LuaValue[] luaValueArr) {
        JColor jColorAEQbTJ;
        String javaString;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        if (luaValueArr.length == 0) {
            pUU.copydefault("OKMarketFeedContentView", "setPostContent: invalid params");
            return null;
        }
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        String str = (luaValue == null || (javaString = luaValue.toJavaString()) == null) ? "" : javaString;
        int iDp2px$default = ((LuaValue) yDV.gEmmrt(luaValueArr, 1)) != null ? C55298xhM.dp2px$default(r5.toInt(), null, 1, null) : -1;
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 2);
        int i = luaValue2 != null ? luaValue2.toInt() : 0;
        LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 3);
        boolean z = luaValue3 != null ? luaValue3.toBoolean() : false;
        LuaValue luaValue4 = (LuaValue) yDV.gEmmrt(luaValueArr, 4);
        int i2 = luaValue4 != null ? luaValue4.toInt() : 0;
        LuaValue luaValue5 = (LuaValue) yDV.gEmmrt(luaValueArr, 5);
        final LuaFunction luaFunction = luaValue5 != null ? luaValue5.toLuaFunction() : null;
        Object objGEmmrt = yDV.gEmmrt(luaValueArr, 6);
        UDColor uDColor = objGEmmrt instanceof UDColor ? (UDColor) objGEmmrt : null;
        Integer numValueOf = (uDColor == null || (jColorAEQbTJ = uDColor.AEQbTJ()) == null) ? null : Integer.valueOf(jColorAEQbTJ.getColor(this.globals));
        ((C7875asA) this.dHguZz).copydefault(i);
        ((C7875asA) this.dHguZz).setTextAndAvatars(str, iDp2px$default, z, i2, new Function0() { // from class: o.ajX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return UDOKMarketFeedContentView.gEmmrt(luaFunction);
            }
        }, (224 & 32) != 0 ? null : numValueOf, (224 & 64) != 0 ? new CoinTag((ContentTagList) null, 1, (DefaultConstructorMarker) null) : null, (224 & 128) != 0 ? new Function1() { // from class: o.asE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C7875asA.OLrzqt((BlueLinkTag) obj);
            }
        } : null);
        return null;
    }

    public static final Unit gEmmrt(LuaFunction luaFunction) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setContentWithTagList(@NotNull LuaValue[] luaValueArr) {
        LuaValue luaValue;
        JColor jColorAEQbTJ;
        String javaString;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        if (luaValueArr.length == 0) {
            pUU.copydefault("OKMarketFeedContentView", "setPostContent: invalid params");
            return null;
        }
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        String str = (luaValue2 == null || (javaString = luaValue2.toJavaString()) == null) ? "" : javaString;
        int iDp2px$default = ((LuaValue) yDV.gEmmrt(luaValueArr, 1)) != null ? C55298xhM.dp2px$default(r5.toInt(), null, 1, null) : -1;
        LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 2);
        int i = luaValue3 != null ? luaValue3.toInt() : 0;
        LuaValue luaValue4 = (LuaValue) yDV.gEmmrt(luaValueArr, 3);
        boolean z = luaValue4 != null ? luaValue4.toBoolean() : false;
        LuaValue luaValue5 = (LuaValue) yDV.gEmmrt(luaValueArr, 4);
        int i2 = luaValue5 != null ? luaValue5.toInt() : 0;
        LuaValue luaValue6 = (LuaValue) yDV.gEmmrt(luaValueArr, 5);
        final LuaFunction luaFunction = luaValue6 != null ? luaValue6.toLuaFunction() : null;
        Object objGEmmrt = yDV.gEmmrt(luaValueArr, 6);
        UDColor uDColor = objGEmmrt instanceof UDColor ? (UDColor) objGEmmrt : null;
        Integer numValueOf = (uDColor == null || (jColorAEQbTJ = uDColor.AEQbTJ()) == null) ? null : Integer.valueOf(jColorAEQbTJ.getColor(this.globals));
        ((C7875asA) this.dHguZz).copydefault(i);
        if (luaValueArr.length != 9 || ((luaValue = luaValueArr[7]) != null && luaValue.isNil())) {
            ((C7875asA) this.dHguZz).setTextAndAvatars(str, iDp2px$default, z, i2, new Function0() { // from class: o.ajS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return UDOKMarketFeedContentView.AhwBna(luaFunction);
                }
            }, (224 & 32) != 0 ? null : numValueOf, (224 & 64) != 0 ? new CoinTag((ContentTagList) null, 1, (DefaultConstructorMarker) null) : null, (224 & 128) != 0 ? new Function1() { // from class: o.asE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C7875asA.OLrzqt((BlueLinkTag) obj);
                }
            } : null);
            return null;
        }
        LuaValue luaValue7 = (LuaValue) yDV.gEmmrt(luaValueArr, 7);
        LuaTable luaTable = luaValue7 != null ? luaValue7.toLuaTable() : null;
        LuaValue luaValue8 = (LuaValue) yDV.gEmmrt(luaValueArr, 8);
        final LuaFunction luaFunction2 = luaValue8 != null ? luaValue8.toLuaFunction() : null;
        CoinTag coinTagAEQbTJ = AEQbTJ(luaTable);
        pUU.KWHzl("qjf", "-------coinTag = " + coinTagAEQbTJ);
        ((C7875asA) this.dHguZz).setTextAndAvatars(str, iDp2px$default, z, i2, new Function0() { // from class: o.ajU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return UDOKMarketFeedContentView.valueOf(luaFunction);
            }
        }, numValueOf, coinTagAEQbTJ, new Function1() { // from class: o.aka
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UDOKMarketFeedContentView.KWHzl(luaFunction2, this, (BlueLinkTag) obj);
            }
        });
        return null;
    }

    public static final Unit AhwBna(LuaFunction luaFunction) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(LuaFunction luaFunction) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(LuaFunction luaFunction, UDOKMarketFeedContentView uDOKMarketFeedContentView, BlueLinkTag blueLinkTag) {
        Intrinsics.checkNotNullParameter(blueLinkTag, "");
        pUU.KWHzl("qjf", "spanClickCallback fastInvoke tag = " + blueLinkTag);
        if (luaFunction != null) {
            luaFunction.AEQbTJ(C7869arv.copydefault(uDOKMarketFeedContentView.globals, new Gson().toJsonTree(blueLinkTag).getAsJsonObject()));
        }
        return Unit.INSTANCE;
    }

    public final CoinTag AEQbTJ(LuaTable luaTable) {
        Pair pairOLrzqt;
        LuaValue luaValue;
        LuaValue luaValue2;
        LuaValue luaValue3;
        CoinTag coinTag = new CoinTag((ContentTagList) null, 1, (DefaultConstructorMarker) null);
        if (luaTable == null || (luaValue3 = luaTable.get("cashTagList")) == null || !luaValue3.isNil()) {
            pairOLrzqt = C56390yDp.OLrzqt((luaTable == null || (luaValue2 = luaTable.get("cashTagList")) == null) ? null : luaValue2.toLuaTable(), (luaTable == null || (luaValue = luaTable.get("hashTagList")) == null) ? null : luaValue.toLuaTable());
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(LuaTable.AEQbTJ(this.globals), LuaTable.AEQbTJ(this.globals));
        }
        LuaTable luaTable2 = (LuaTable) pairOLrzqt.component1();
        LuaTable luaTable3 = (LuaTable) pairOLrzqt.component2();
        ContentTagList contentTagList = new ContentTagList((List) null, (List) null, 3, (DefaultConstructorMarker) null);
        if (luaTable2 != null) {
            contentTagList.setCashtagList(copydefault(luaTable2));
        }
        if (luaTable3 != null) {
            contentTagList.setHashtagList(OLrzqt(luaTable3));
        }
        coinTag.setContentTagList(contentTagList);
        return coinTag;
    }

    public final ArrayList<BlueLinkTag> copydefault(LuaTable luaTable) {
        LuaTable luaTable2;
        String javaString;
        String javaString2;
        String javaString3;
        String javaString4;
        String javaString5;
        ArrayList<BlueLinkTag> arrayList = new ArrayList<>();
        int iZLjUOn = luaTable.zLjUOn();
        int i = 0;
        while (i < iZLjUOn) {
            i++;
            LuaValue luaValue = luaTable.get(i);
            if (luaValue.get("position").isNil()) {
                luaTable2 = LuaTable.AEQbTJ(this.globals);
            } else {
                luaTable2 = luaValue.get("position").toLuaTable();
            }
            BlueLinkTag blueLinkTag = new BlueLinkTag((String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 63, (DefaultConstructorMarker) null);
            LuaValue luaValue2 = luaValue.get("tag");
            String str = "";
            if (luaValue2 == null || (javaString = luaValue2.toJavaString()) == null) {
                javaString = "";
            }
            LuaValue luaValue3 = luaValue.get("instId");
            if (luaValue3 == null || (javaString2 = luaValue3.toJavaString()) == null) {
                javaString2 = "";
            }
            LuaValue luaValue4 = luaValue.get("instType");
            if (luaValue4 == null || (javaString3 = luaValue4.toJavaString()) == null) {
                javaString3 = "";
            }
            LuaValue luaValue5 = luaValue.get("linkUrl");
            if (luaValue5 == null || (javaString4 = luaValue5.toJavaString()) == null) {
                javaString4 = "";
            }
            LuaValue luaValue6 = luaValue.get("deeplinkUrl");
            if (luaValue6 != null && (javaString5 = luaValue6.toJavaString()) != null) {
                str = javaString5;
            }
            blueLinkTag.setTag(javaString);
            blueLinkTag.setInstId(javaString2);
            blueLinkTag.setInstType(javaString3);
            blueLinkTag.setDeeplinkUrl(str);
            blueLinkTag.setLinkUrl(javaString4);
            ArrayList arrayList2 = new ArrayList();
            int iZLjUOn2 = luaTable2.zLjUOn();
            int i2 = 0;
            while (i2 < iZLjUOn2) {
                i2++;
                LuaValue luaValue7 = luaTable2.get(i2);
                arrayList2.add(Integer.valueOf(luaValue7 != null ? luaValue7.toInt() : 1));
            }
            blueLinkTag.setPosition(arrayList2);
            arrayList.add(blueLinkTag);
        }
        return arrayList;
    }

    public final ArrayList<BlueLinkTag> OLrzqt(LuaTable luaTable) {
        LuaTable luaTable2;
        String javaString;
        String javaString2;
        String javaString3;
        ArrayList<BlueLinkTag> arrayList = new ArrayList<>();
        int iZLjUOn = luaTable.zLjUOn();
        int i = 0;
        while (i < iZLjUOn) {
            i++;
            LuaValue luaValue = luaTable.get(i);
            if (luaValue.get("position").isNil()) {
                luaTable2 = LuaTable.AEQbTJ(this.globals);
            } else {
                luaTable2 = luaValue.get("position").toLuaTable();
            }
            BlueLinkTag blueLinkTag = new BlueLinkTag((String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 63, (DefaultConstructorMarker) null);
            LuaValue luaValue2 = luaValue.get("tag");
            String str = "";
            if (luaValue2 == null || (javaString = luaValue2.toJavaString()) == null) {
                javaString = "";
            }
            LuaValue luaValue3 = luaValue.get("deeplinkUrl");
            if (luaValue3 == null || (javaString2 = luaValue3.toJavaString()) == null) {
                javaString2 = "";
            }
            LuaValue luaValue4 = luaValue.get("linkUrl");
            if (luaValue4 != null && (javaString3 = luaValue4.toJavaString()) != null) {
                str = javaString3;
            }
            blueLinkTag.setTag(javaString);
            blueLinkTag.setDeeplinkUrl(javaString2);
            blueLinkTag.setLinkUrl(str);
            ArrayList arrayList2 = new ArrayList();
            int iZLjUOn2 = luaTable2.zLjUOn();
            int i2 = 0;
            while (i2 < iZLjUOn2) {
                i2++;
                LuaValue luaValue5 = luaTable2.get(i2);
                arrayList2.add(Integer.valueOf(luaValue5 != null ? luaValue5.toInt() : 1));
            }
            blueLinkTag.setPosition(arrayList2);
            arrayList.add(blueLinkTag);
        }
        return arrayList;
    }
}
