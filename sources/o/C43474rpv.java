package o;

import androidx.fragment.app.FragmentActivity;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.immomo.mls.fun.ud.view.UDImageView;
import com.immomo.mls.fun.ud.view.UDViewGroup;
import com.okinc.biz.share.ShareFileProvider;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.ShareType;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.share.bean.text.TextShareParams;
import com.okinc.wallet.api.bean.EnterWalletMainBean;
import com.okinc.web.WebActivity;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43517rql;
import o.InterfaceC33171mrS;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaValue;

/* JADX INFO: renamed from: o.rpv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C43474rpv implements InterfaceC7380aij {
    @Override // o.InterfaceC7380aij
    public java.util.Set<java.lang.String> KWHzl() {
        return yEE.AhwBna("GoToNFTMediaPicker", "GoToNFTShare", "GoToNFTMarketTab", "GoToBRC20CoinDetail", "NFTThirdLoginWebView", "GoToWalletBackUp", "GoToWalletSelectedPage", "Web3AnnualReport", "SwitchAppMode");
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [82=9] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v29, resolved type: V */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0397  */
    /* JADX WARN: Type inference failed for: r12v5, types: [android.view.View] */
    @Override // o.InterfaceC7380aij
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull InterfaceC7379aii interfaceC7379aii) {
        ShareType shareType;
        java.io.File fileAEQbTJ;
        android.graphics.Bitmap drawingCache;
        java.util.Set<java.lang.String> setKeySet;
        java.lang.Object obj;
        java.lang.Integer num;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC7379aii, "");
        java.lang.Integer num2 = null;
        switch (str.hashCode()) {
            case -2084990816:
                if (str.equals("GoToNFTMarketTab")) {
                    ((InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class)).copydefault((AbstractActivityC33041mov) context, new EnterWalletMainBean((java.lang.Boolean) null, (java.lang.String) null, java.lang.Integer.valueOf(C9768bbn.djBIcL), (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, 123, (DefaultConstructorMarker) null));
                    Unit unit = Unit.INSTANCE;
                    return;
                }
                break;
            case -723717562:
                if (str.equals("GoToNFTShare")) {
                    java.lang.Object obj2 = map != null ? map.get("shareFrom") : null;
                    java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                    if (str2 == null) {
                        str2 = "OKNFT";
                    }
                    java.lang.String str3 = str2;
                    java.lang.Object obj3 = map != null ? map.get("title") : null;
                    java.lang.String str4 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
                    java.lang.Object obj4 = map != null ? map.get("body") : null;
                    java.lang.String str5 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
                    java.lang.Object obj5 = map != null ? map.get("type") : null;
                    java.lang.String str6 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
                    java.lang.Object obj6 = map != null ? map.get("shortName") : null;
                    java.lang.String str7 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
                    if (str6 == null) {
                        shareType = ShareType.SHARE_IMAGE;
                    } else {
                        shareType = Intrinsics.EZpvd((java.lang.Object) str6, (java.lang.Object) TtmlNode.TAG_IMAGE) ? ShareType.SHARE_IMAGE : ShareType.SHARE_TEXT;
                        if (shareType == null) {
                        }
                    }
                    if (shareType != ShareType.SHARE_IMAGE) {
                        InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class);
                        AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) context;
                        ShareConfig.ActionBar actionBar = ShareConfig.Companion;
                        TextShareParams textShareParamsCreate$default = TextShareParams.Application.create$default(TextShareParams.Companion, str7 == null ? "" : str7, str4 == null ? "" : str4, null, 4, null);
                        textShareParamsCreate$default.setWcMomentBody(str4 == null ? "" : str4);
                        textShareParamsCreate$default.setSubtitle(str4 == null ? "" : str4);
                        textShareParamsCreate$default.setEmailBody(str4 == null ? "" : str4);
                        textShareParamsCreate$default.setSmsBody(str4 != null ? str4 : "");
                        textShareParamsCreate$default.setShareFrom(str3);
                        Unit unit2 = Unit.INSTANCE;
                        interfaceC48893ueK.copydefault(abstractActivityC33041mov, ShareConfig.ActionBar.create$default(actionBar, textShareParamsCreate$default, null, 2, null));
                        return;
                    }
                    java.lang.Object obj7 = map != null ? map.get("shareContentView") : null;
                    Intrinsics.copydefault(obj7, "");
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((UDViewGroup) obj7).f_();
                    Intrinsics.copydefault(map.get("width"), "");
                    float fKWHzl = C33570myu.KWHzl(context, ((java.lang.Integer) r0).intValue());
                    Intrinsics.copydefault(map.get("height"), "");
                    float fKWHzl2 = C33570myu.KWHzl(context, ((java.lang.Integer) r7).intValue());
                    java.lang.Object obj8 = map.get("cornerImageConfigs");
                    java.util.ArrayList<java.util.Map> arrayList = obj8 instanceof java.util.ArrayList ? (java.util.ArrayList) obj8 : null;
                    if (C55296xhK.OLrzqt(context)) {
                        viewGroup.setLayoutDirection(1);
                    }
                    C33487mxQ.EZpvd(viewGroup, (int) fKWHzl, (int) fKWHzl2);
                    if (arrayList != null) {
                        for (java.util.Map map2 : arrayList) {
                            try {
                                java.lang.Object obj9 = map2.get("cornerImage");
                                Intrinsics.copydefault(obj9, "");
                                ?? F_ = ((UDImageView) obj9).f_();
                                if (F_ != 0) {
                                    try {
                                        F_.destroyDrawingCache();
                                        F_.setDrawingCacheBackgroundColor(-1);
                                        if (!F_.isDrawingCacheEnabled()) {
                                            F_.setDrawingCacheEnabled(true);
                                        }
                                        drawingCache = F_.getDrawingCache(true);
                                    } catch (java.lang.Throwable th) {
                                        th.printStackTrace();
                                        drawingCache = null;
                                    }
                                    if (drawingCache != null) {
                                        Intrinsics.copydefault(map2.get("radius"), "");
                                        android.graphics.Bitmap bitmapEZpvd = C33487mxQ.EZpvd(drawingCache, C33570myu.KWHzl(context, ((java.lang.Integer) r7).intValue()));
                                        F_.setDrawingCacheEnabled(false);
                                        ((android.widget.ImageView) F_).setImageBitmap(bitmapEZpvd);
                                        F_.setDrawingCacheBackgroundColor(0);
                                    }
                                }
                            } catch (java.lang.Throwable th2) {
                                th2.printStackTrace();
                            }
                        }
                        Unit unit3 = Unit.INSTANCE;
                    }
                    android.graphics.Bitmap bitmapCopydefault = C33570myu.copydefault((android.view.View) viewGroup, true);
                    if (bitmapCopydefault == null || (fileAEQbTJ = ShareFileProvider.Companion.AEQbTJ(bitmapCopydefault)) == null) {
                        return;
                    }
                    ShareConfig.ActionBar actionBar2 = ShareConfig.Companion;
                    ImageShareParams.ActionBar actionBar3 = ImageShareParams.Companion;
                    java.lang.String absolutePath = fileAEQbTJ.getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(absolutePath, "");
                    ImageShareParams imageShareParamsCreate$default = ImageShareParams.ActionBar.create$default(actionBar3, absolutePath, null, 2, null);
                    if (str4 == null) {
                        str4 = "";
                    }
                    imageShareParamsCreate$default.setTitle(str4);
                    imageShareParamsCreate$default.setShareFrom(str3);
                    imageShareParamsCreate$default.setBody(str5 != null ? str5 : "");
                    ShareConfig shareConfigCreate$default = ShareConfig.ActionBar.create$default(actionBar2, imageShareParamsCreate$default, null, 2, null);
                    if (shareConfigCreate$default != null) {
                        ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).copydefault((AbstractActivityC33041mov) context, shareConfigCreate$default);
                        return;
                    }
                    return;
                }
                break;
            case -269135728:
                if (str.equals("GoToBRC20CoinDetail")) {
                    long jValueOf = C33129mqd.valueOf(map != null ? map.get("coinId") : null);
                    java.lang.Object obj10 = map != null ? map.get("walletId") : null;
                    Intrinsics.copydefault(obj10, "");
                    ((InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class)).copydefault((AbstractActivityC33041mov) context, jValueOf, (java.lang.String) obj10);
                    Unit unit4 = Unit.INSTANCE;
                    return;
                }
                break;
            case -8507118:
                if (str.equals("Web3AnnualReport")) {
                    java.lang.Object obj11 = map != null ? map.get("animation") : null;
                    java.lang.Boolean bool = obj11 instanceof java.lang.Boolean ? (java.lang.Boolean) obj11 : null;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (map != null && (setKeySet = map.keySet()) != null) {
                        for (java.lang.String str8 : setKeySet) {
                            java.lang.Object obj12 = map.get(str8);
                            if (obj12 != null) {
                                linkedHashMap.put(str8, obj12);
                                Unit unit5 = Unit.INSTANCE;
                            }
                        }
                        Unit unit6 = Unit.INSTANCE;
                    }
                    InterfaceC33171mrS.Activity.switchToAppMode$default((InterfaceC33171mrS) C43248rlh.KWHzl.AEQbTJ(InterfaceC33171mrS.class), context, 3, zBooleanValue, 0, null, null, 56, null);
                    C43056riA.AEQbTJ.copydefault(context, "Web3AnnualReport2023", "/web3annual", linkedHashMap);
                    Unit unit7 = Unit.INSTANCE;
                    return;
                }
                break;
            case 459144318:
                if (str.equals("GoToWalletBackUp")) {
                    java.lang.Object obj13 = map != null ? map.get("walletId") : null;
                    final java.lang.String str9 = obj13 instanceof java.lang.String ? (java.lang.String) obj13 : null;
                    Intrinsics.copydefault(map);
                    java.lang.Object obj14 = map.get(com.sun.jna.Callback.METHOD_NAME);
                    final LuaFunction luaFunction = obj14 instanceof LuaFunction ? (LuaFunction) obj14 : null;
                    AbstractActivityC33041mov abstractActivityC33041mov2 = (AbstractActivityC33041mov) context;
                    if (str9 != null) {
                        xWS xws = (xWS) C43251rlk.copydefault(xWS.class);
                        androidx.fragment.app.FragmentManager supportFragmentManager = abstractActivityC33041mov2.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                        xws.OLrzqt(abstractActivityC33041mov2, supportFragmentManager, str9, new Function0() { // from class: o.rpC
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C43474rpv.EZpvd(luaFunction, str9);
                            }
                        });
                        Unit unit8 = Unit.INSTANCE;
                        return;
                    }
                    return;
                }
                break;
            case 881142118:
                if (str.equals("GoToWalletSelectedPage")) {
                    java.lang.Object obj15 = map != null ? map.get("supportChainList") : null;
                    java.util.List<? extends java.lang.Object> list = obj15 instanceof java.util.List ? (java.util.List) obj15 : null;
                    java.lang.Object obj16 = map != null ? map.get("selectedWalletId") : null;
                    java.lang.String str10 = obj16 instanceof java.lang.String ? (java.lang.String) obj16 : null;
                    java.lang.Long lValueOf = (map == null || (obj = map.get("selectedChain")) == null) ? null : java.lang.Long.valueOf(C33129mqd.valueOf(obj));
                    java.lang.Object obj17 = map != null ? map.get("contractAddress") : null;
                    java.lang.String str11 = obj17 instanceof java.lang.String ? (java.lang.String) obj17 : null;
                    java.lang.Object obj18 = map != null ? map.get("contractAddressList") : null;
                    java.util.List<java.lang.String> list2 = obj18 instanceof java.util.List ? (java.util.List) obj18 : null;
                    java.lang.Object obj19 = map != null ? map.get("isBrc20") : null;
                    java.lang.Boolean bool2 = obj19 instanceof java.lang.Boolean ? (java.lang.Boolean) obj19 : null;
                    java.lang.Object obj20 = map != null ? map.get("enableWithoutBackup") : null;
                    java.lang.Boolean bool3 = obj20 instanceof java.lang.Boolean ? (java.lang.Boolean) obj20 : null;
                    java.lang.Object obj21 = map != null ? map.get("isDarkMode") : null;
                    java.lang.Boolean bool4 = obj21 instanceof java.lang.Boolean ? (java.lang.Boolean) obj21 : null;
                    java.lang.Object obj22 = map != null ? map.get("complete") : null;
                    final LuaFunction luaFunction2 = obj22 instanceof LuaFunction ? (LuaFunction) obj22 : null;
                    java.lang.Object obj23 = map != null ? map.get("showSearchNetwork") : null;
                    java.lang.Boolean bool5 = obj23 instanceof java.lang.Boolean ? (java.lang.Boolean) obj23 : null;
                    java.lang.Object obj24 = map != null ? map.get("hiddenWalletTypeList") : null;
                    ((InterfaceC54828xWv) C43251rlk.copydefault(InterfaceC54828xWv.class)).AEQbTJ((AbstractActivityC33041mov) context, list, str10, lValueOf, str11, list2, bool2, bool3 != null ? bool3.booleanValue() : false, bool4 != null ? bool4.booleanValue() : false, bool5 != null ? bool5.booleanValue() : false, obj24 instanceof java.util.List ? (java.util.List) obj24 : null, new Function2() { // from class: o.rpz
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj25, java.lang.Object obj26) {
                            return C43474rpv.copydefault(luaFunction2, (java.lang.Long) obj25, (java.lang.String) obj26);
                        }
                    });
                    Unit unit9 = Unit.INSTANCE;
                    return;
                }
                break;
            case 1176458555:
                if (str.equals("NFTThirdLoginWebView")) {
                    EZpvd(context, str, map, interfaceC7379aii);
                    Unit unit10 = Unit.INSTANCE;
                    return;
                }
                break;
            case 1365172921:
                if (str.equals("GoToNFTMediaPicker")) {
                    Intrinsics.copydefault(map);
                    LuaFunction luaFunction3 = (LuaFunction) map.get(com.sun.jna.Callback.METHOD_NAME);
                    if (map.get("type") != null) {
                        java.lang.Object obj25 = map.get("type");
                        Intrinsics.copydefault(obj25, "");
                        num = (java.lang.Integer) obj25;
                    } else {
                        num = null;
                    }
                    java.lang.String str12 = map.get("filePath") != null ? (java.lang.String) map.get("filePath") : null;
                    if (map.get("pickerType") != null) {
                        java.lang.Object obj26 = map.get("pickerType");
                        Intrinsics.copydefault(obj26, "");
                        num2 = (java.lang.Integer) obj26;
                    }
                    if (num2 != null) {
                        C43640rtB c43640rtBKWHzl = C43640rtB.Companion.KWHzl(str12);
                        c43640rtBKWHzl.EZpvd(new Application(luaFunction3, c43640rtBKWHzl));
                        c43640rtBKWHzl.show(((FragmentActivity) context).getSupportFragmentManager(), C43640rtB.class.toString());
                    } else {
                        C43647rtI c43647rtIEZpvd = C43647rtI.Companion.EZpvd(num, str12);
                        c43647rtIEZpvd.OLrzqt(new Activity(luaFunction3, c43647rtIEZpvd));
                        c43647rtIEZpvd.show(((FragmentActivity) context).getSupportFragmentManager(), C43647rtI.class.toString());
                    }
                    Unit unit11 = Unit.INSTANCE;
                    return;
                }
                break;
            case 1761049968:
                if (str.equals("SwitchAppMode")) {
                    java.lang.Object obj27 = map != null ? map.get("appMode") : null;
                    java.lang.Integer num3 = obj27 instanceof java.lang.Integer ? (java.lang.Integer) obj27 : null;
                    int iIntValue = num3 != null ? num3.intValue() : 3;
                    java.lang.Object obj28 = map != null ? map.get("animation") : null;
                    java.lang.Boolean bool6 = obj28 instanceof java.lang.Boolean ? (java.lang.Boolean) obj28 : null;
                    InterfaceC33171mrS.Activity.switchToAppMode$default((InterfaceC33171mrS) C43248rlh.KWHzl.AEQbTJ(InterfaceC33171mrS.class), context, iIntValue, bool6 != null ? bool6.booleanValue() : false, 0, null, null, 56, null);
                    return;
                }
                break;
        }
        Unit unit12 = Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.rpv$Application */
    public static final class Application implements InterfaceC43645rtG {
        public final /* synthetic */ C43640rtB AEQbTJ;
        public final /* synthetic */ LuaFunction copydefault;

        public Application(LuaFunction luaFunction, C43640rtB c43640rtB) {
            this.copydefault = luaFunction;
            this.AEQbTJ = c43640rtB;
        }

        @Override // o.InterfaceC43645rtG
        public void copydefault(int i, java.lang.String str, java.lang.String str2, long j, java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            if (this.copydefault != null) {
                this.AEQbTJ.dismissAllowingStateLoss();
                this.copydefault.invoke(LuaValue.varargsOf(LuaNumber.valueOf(i), LuaString.copydefault(str), LuaString.copydefault(str2), LuaNumber.copydefault(j), LuaString.copydefault(str3)));
            }
        }
    }

    /* JADX INFO: renamed from: o.rpv$Activity */
    public static final class Activity implements InterfaceC43645rtG {
        public final /* synthetic */ LuaFunction EZpvd;
        public final /* synthetic */ C43647rtI copydefault;

        public Activity(LuaFunction luaFunction, C43647rtI c43647rtI) {
            this.EZpvd = luaFunction;
            this.copydefault = c43647rtI;
        }

        @Override // o.InterfaceC43645rtG
        public void copydefault(int i, java.lang.String str, java.lang.String str2, long j, java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            if (this.EZpvd != null) {
                this.copydefault.dismissAllowingStateLoss();
                this.EZpvd.invoke(LuaValue.varargsOf(LuaNumber.valueOf(i), LuaString.copydefault(str), LuaString.copydefault(str2), LuaNumber.copydefault(j), LuaString.copydefault(str3)));
            }
        }
    }

    public static final Unit EZpvd(final LuaFunction luaFunction, final java.lang.String str) {
        AbstractC58260yxt<java.util.List<InterfaceC9738bbJ>> abstractC58260yxtGEmmrt = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().gEmmrt();
        final Function1 function1 = new Function1() { // from class: o.rpA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43474rpv.AEQbTJ(luaFunction, str, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM<? super java.util.List<InterfaceC9738bbJ>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.rpD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C43474rpv.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.rpB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43474rpv.OLrzqt((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtGEmmrt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.rpE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C43474rpv.copydefault(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(LuaFunction luaFunction, java.lang.String str, java.util.List list) {
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.rString(str));
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(LuaFunction luaFunction, java.lang.Long l, java.lang.String str) {
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.varargsOf(LuaString.copydefault(str), LuaString.copydefault(java.lang.String.valueOf(l))));
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(android.content.Context context, java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, InterfaceC7379aii interfaceC7379aii) {
        Intrinsics.copydefault(map);
        java.lang.Object obj = map.get("webUrl");
        Intrinsics.copydefault(obj, "");
        java.lang.String str2 = (java.lang.String) obj;
        java.lang.Object obj2 = map.get(MTPushConstants.PlatformNode.KEY_PLATFORM);
        java.lang.String str3 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.Object obj3 = map.get(com.sun.jna.Callback.METHOD_NAME);
        LuaFunction luaFunction = obj3 instanceof LuaFunction ? (LuaFunction) obj3 : null;
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) "telegram", (java.lang.Object) str3);
        C43517rql.Companion.KWHzl(new StateListAnimator(luaFunction));
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) WebActivity.class);
        intent.putExtra("url", str2);
        intent.putExtra("telegram", zEZpvd);
        java.lang.Object obj4 = map.get("showCloseButton");
        intent.putExtra("SHOW_CLOSE", Intrinsics.EZpvd(obj4 instanceof java.lang.Boolean ? (java.lang.Boolean) obj4 : null, java.lang.Boolean.TRUE));
        intent.putExtra("subdomainstrategy", "Global");
        if (context instanceof android.app.Application) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: o.rpv$StateListAnimator */
    public static final class StateListAnimator implements C43517rql.TaskDescription {
        public final /* synthetic */ LuaFunction copydefault;

        public StateListAnimator(LuaFunction luaFunction) {
            this.copydefault = luaFunction;
        }

        @Override // o.C43517rql.TaskDescription
        public void OLrzqt(java.lang.String str) {
            LuaFunction luaFunction = this.copydefault;
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.varargsOf(LuaString.copydefault(str)));
            }
        }
    }
}
