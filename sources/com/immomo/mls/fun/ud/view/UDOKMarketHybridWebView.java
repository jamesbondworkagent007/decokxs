package com.immomo.mls.fun.ud.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.immomo.mls.fun.ud.view.UDOKMarketHybridWebView;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.view.hybrid.IJsBridge;
import com.immomo.mls.view.hybrid.handler.impl.ImageGalleryHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43238rlX;
import o.C33129mqd;
import o.C33490mxT;
import o.C43251rlk;
import o.C56391yDq;
import o.C56403yEb;
import o.C7594aml;
import o.C7863arp;
import o.C7869arv;
import o.C7910asj;
import o.C7961ath;
import o.C8010aue;
import o.InterfaceC43294rma;
import o.InterfaceC60044zuT;
import o.pUU;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class UDOKMarketHybridWebView extends UDView<C7961ath> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final String[] copydefault = {"setHtmlContent", "setOnContentUpdatedCallback", "setOnWebViewHeightUpdatedCallback", "setOnHyperLinkClickCallback", "setOnImgClickCallback", "openExternalBrowser"};

    @InterfaceC60044zuT
    public UDOKMarketHybridWebView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ud.view.UDOKMarketHybridWebView.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C8010aue.AssistContent KWHzl() {
            String[] strArr = UDOKMarketHybridWebView.copydefault;
            C8010aue.AssistContent assistContentKWHzl = C8010aue.KWHzl("OKMarketHybridWebView", UDOKMarketHybridWebView.class, false, true, (String[]) Arrays.copyOf(strArr, strArr.length));
            Intrinsics.checkNotNullExpressionValue(assistContentKWHzl, "");
            return assistContentKWHzl;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C7961ath AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
        int i = luaValue != null ? luaValue.toInt() : -100;
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        return new C7961ath(contextAubY, null, 0, luaValue2 != null ? luaValue2.toJavaString() : null, i, 6, null);
    }

    @InterfaceC60044zuT
    public final LuaValue[] setHtmlContent(@NotNull LuaValue[] luaValueArr) {
        String javaString;
        String javaString2;
        final String str = "";
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        int length = luaValueArr.length;
        if (length == 1) {
            LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
            if (luaValue != null && (javaString = luaValue.toJavaString()) != null) {
                str = javaString;
            }
            ((C7961ath) this.dHguZz).setHtmlContent(str);
            return null;
        }
        if (length == 2) {
            LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
            if (luaValue2 != null && (javaString2 = luaValue2.toJavaString()) != null) {
                str = javaString2;
            }
            C7594aml.djBIcL(luaValueArr, 1, new Function1() { // from class: o.akh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return UDOKMarketHybridWebView.EZpvd(this.EZpvd, str, (LuaTable) obj);
                }
            });
            return null;
        }
        pUU.copydefault("OKMarketHybridWebView", "setHtmlContent: invalid params");
        return null;
    }

    public static final Unit EZpvd(UDOKMarketHybridWebView uDOKMarketHybridWebView, String str, LuaTable luaTable) {
        String string;
        String string2;
        String string3;
        Intrinsics.checkNotNullParameter(luaTable, "");
        List listOLrzqt = C7910asj.OLrzqt(luaTable);
        Intrinsics.checkNotNullExpressionValue(listOLrzqt, "");
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        for (Object obj : listOLrzqt) {
            Intrinsics.copydefault(obj, "");
            Map map = (Map) obj;
            Object obj2 = map.get("url");
            String str2 = (obj2 == null || (string3 = obj2.toString()) == null) ? "" : string3;
            int iAhwBna = C33129mqd.AhwBna(map.get("width"));
            int iAhwBna2 = C33129mqd.AhwBna(map.get("height"));
            Object obj3 = map.get("id");
            String str3 = (obj3 == null || (string2 = obj3.toString()) == null) ? "" : string2;
            Object obj4 = map.get("node");
            arrayList.add(new IJsBridge.InjectHtmlContentPayload.ImgConfig(str2, iAhwBna, iAhwBna2, str3, (obj4 == null || (string = obj4.toString()) == null) ? "" : string));
        }
        ((C7961ath) uDOKMarketHybridWebView.dHguZz).setHtmlContent(str, arrayList);
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setOnContentUpdatedCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "onContentUpdated", new UDView.TaskDescription() { // from class: o.ake
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                UDOKMarketHybridWebView.AEQbTJ(this.copydefault, luaFunction);
            }
        });
        return null;
    }

    public static final void AEQbTJ(UDOKMarketHybridWebView uDOKMarketHybridWebView, final LuaFunction luaFunction) {
        ((C7961ath) uDOKMarketHybridWebView.dHguZz).setOnContentUpdatedListener(new Function0() { // from class: o.akf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return UDOKMarketHybridWebView.KWHzl(luaFunction);
            }
        });
    }

    public static final Unit KWHzl(LuaFunction luaFunction) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setOnWebViewHeightUpdatedCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "onWebViewHeightUpdated", new UDView.TaskDescription() { // from class: o.akk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                UDOKMarketHybridWebView.AhwBna(this.OLrzqt, luaFunction);
            }
        });
        return null;
    }

    public static final void AhwBna(UDOKMarketHybridWebView uDOKMarketHybridWebView, final LuaFunction luaFunction) {
        ((C7961ath) uDOKMarketHybridWebView.dHguZz).setOnWebViewHeightUpdatedListener(new Function1() { // from class: o.akb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UDOKMarketHybridWebView.KWHzl(luaFunction, ((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final Unit KWHzl(LuaFunction luaFunction, int i) {
        if (luaFunction != null) {
            luaFunction.EZpvd(C33129mqd.AEQbTJ(Integer.valueOf(i)));
        }
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setOnHyperLinkClickCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "onHyperLinkClick", new UDView.TaskDescription() { // from class: o.ajY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                UDOKMarketHybridWebView.gEmmrt(this.copydefault, luaFunction);
            }
        });
        return null;
    }

    public static final void gEmmrt(final UDOKMarketHybridWebView uDOKMarketHybridWebView, final LuaFunction luaFunction) {
        ((C7961ath) uDOKMarketHybridWebView.dHguZz).setOnHyperLinkClickListener(new Function1() { // from class: o.akg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UDOKMarketHybridWebView.copydefault(this.KWHzl, luaFunction, (java.lang.String) obj);
            }
        });
    }

    public static final Unit copydefault(UDOKMarketHybridWebView uDOKMarketHybridWebView, LuaFunction luaFunction, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("deeplink");
            if (C33129mqd.OLrzqt((CharSequence) queryParameter)) {
                InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
                Context contextAubY = uDOKMarketHybridWebView.AubY();
                Intrinsics.checkNotNullExpressionValue(contextAubY, "");
                Intrinsics.copydefault((Object) queryParameter);
                InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, contextAubY, queryParameter, null, new Function1() { // from class: o.akl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return UDOKMarketHybridWebView.KWHzl((AbstractC43238rlX) obj);
                    }
                }, 4, null);
                return Unit.INSTANCE;
            }
        } catch (Exception unused) {
        }
        if (luaFunction != null) {
            luaFunction.copydefault(str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setOnImgClickCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "onImgClick", new UDView.TaskDescription() { // from class: o.akd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                UDOKMarketHybridWebView.AYXKKw(this.copydefault, luaFunction);
            }
        });
        return null;
    }

    public static final void AYXKKw(final UDOKMarketHybridWebView uDOKMarketHybridWebView, final LuaFunction luaFunction) {
        ((C7961ath) uDOKMarketHybridWebView.dHguZz).setOnImgClickListener(new Function2() { // from class: o.akc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return UDOKMarketHybridWebView.AEQbTJ(luaFunction, uDOKMarketHybridWebView, ((java.lang.Integer) obj).intValue(), (ImageGalleryHandler) obj2);
            }
        });
    }

    public static final Unit AEQbTJ(LuaFunction luaFunction, UDOKMarketHybridWebView uDOKMarketHybridWebView, int i, ImageGalleryHandler imageGalleryHandler) {
        Intrinsics.checkNotNullParameter(imageGalleryHandler, "");
        try {
            String json = new Gson().toJson(imageGalleryHandler.getClickedImageFrame());
            Intrinsics.checkNotNullExpressionValue(json, "");
            JsonObject jsonObjectOLrzqt = C33490mxT.OLrzqt(json);
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(i), C7869arv.copydefault(uDOKMarketHybridWebView.globals, jsonObjectOLrzqt)));
            }
        } catch (Exception unused) {
        }
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] openExternalBrowser(@NotNull LuaValue[] luaValueArr) {
        Object objM7377constructorimpl;
        Unit unit;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isString()) {
            String javaString = luaValue.toJavaString();
            Intrinsics.checkNotNullExpressionValue(javaString, "");
            try {
                Result.Application application = Result.Companion;
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(javaString));
                Activity activityCopydefault = C7863arp.copydefault(AubY());
                if (activityCopydefault != null) {
                    activityCopydefault.startActivity(intent);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        }
        return null;
    }
}
