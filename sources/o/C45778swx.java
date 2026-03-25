package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.core.ok_app.api.LitePortfolioSourceEnum;
import com.okinc.core.ok_app.api.bean.LiteNavigationTabEnum;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC33171mrS;
import o.InterfaceC48694uaX;

/* JADX INFO: renamed from: o.swx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45778swx {
    public static final java.util.HashMap<java.lang.String, yHO<android.content.Context, java.lang.String, android.os.Bundle, Unit>> AEQbTJ;
    public static final java.util.HashMap<java.lang.String, LiteNavigationTabEnum> EZpvd;
    public static final java.util.HashMap<java.lang.String, yHO<android.content.Context, java.lang.String, android.os.Bundle, Unit>> KWHzl;
    public static final java.util.HashSet<java.lang.String> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.util.HashMap<java.lang.String, LiteNavigationTabEnum> AEQbTJ() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.util.HashSet<java.lang.String> KWHzl() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.util.HashMap<java.lang.String, yHO<android.content.Context, java.lang.String, android.os.Bundle, Unit>> copydefault() {
        return AEQbTJ;
    }

    static {
        java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet<>();
        hashSet.add("lite/main/home");
        hashSet.add("lite/main/market");
        hashSet.add("lite/main/earn");
        hashSet.add("lite/main/earn/list");
        hashSet.add("lite/main/earn/jumpstart");
        hashSet.add("lite/main/earn/mine");
        hashSet.add("lite/main/portfolio");
        copydefault = hashSet;
        java.util.HashMap<java.lang.String, LiteNavigationTabEnum> map = new java.util.HashMap<>();
        map.put("lite/main/home", LiteNavigationTabEnum.LITE_HOME);
        map.put("lite/main/market", LiteNavigationTabEnum.LITE_MARKET);
        map.put("lite/main/earn", LiteNavigationTabEnum.LITE_EARN);
        map.put("lite/main/portfolio", LiteNavigationTabEnum.LITE_PORTFOLIO);
        EZpvd = map;
        java.util.HashMap<java.lang.String, yHO<android.content.Context, java.lang.String, android.os.Bundle, Unit>> map2 = new java.util.HashMap<>();
        map2.put("lite/main/home", new yHO() { // from class: o.swy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C45778swx.ejfBZ((android.content.Context) obj, (java.lang.String) obj2, (android.os.Bundle) obj3);
            }
        });
        map2.put("lite/main/discover", new yHO() { // from class: o.swI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C45778swx.fARcdN((android.content.Context) obj, (java.lang.String) obj2, (android.os.Bundle) obj3);
            }
        });
        map2.put("lite/main/market", new yHO() { // from class: o.swG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C45778swx.fJNWhG((android.content.Context) obj, (java.lang.String) obj2, (android.os.Bundle) obj3);
            }
        });
        map2.put("lite/trade/main/page", new yHO() { // from class: o.swJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C45778swx.fIwbmz((android.content.Context) obj, (java.lang.String) obj2, (android.os.Bundle) obj3);
            }
        });
        map2.put("lite/main/earn", new yHO() { // from class: o.swK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C45778swx.getNewProxyInstance((android.content.Context) obj, (java.lang.String) obj2, (android.os.Bundle) obj3);
            }
        });
        map2.put("lite/main/earn/list", new yHO() { // from class: o.swH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C45778swx.iwGUEr((android.content.Context) obj, (java.lang.String) obj2, (android.os.Bundle) obj3);
            }
        });
        map2.put("lite/main/earn/jumpstart", new yHO() { // from class: o.swA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C45778swx.hDKMBd((android.content.Context) obj, (java.lang.String) obj2, (android.os.Bundle) obj3);
            }
        });
        map2.put("lite/main/earn/mine", new yHO() { // from class: o.swz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C45778swx.isConnected((android.content.Context) obj, (java.lang.String) obj2, (android.os.Bundle) obj3);
            }
        });
        map2.put("lite/main/portfolio", new yHO() { // from class: o.swF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C45778swx.AuCTel((android.content.Context) obj, (java.lang.String) obj2, (android.os.Bundle) obj3);
            }
        });
        KWHzl = map2;
        java.util.HashMap<java.lang.String, yHO<android.content.Context, java.lang.String, android.os.Bundle, Unit>> map3 = new java.util.HashMap<>();
        map3.put("lite/b2c", new yHO() { // from class: o.swB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C45778swx.getFieldNames((android.content.Context) obj, (java.lang.String) obj2, (android.os.Bundle) obj3);
            }
        });
        map3.put("lite/account", new yHO() { // from class: o.sww
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C45778swx.uzCIH((android.content.Context) obj, (java.lang.String) obj2, (android.os.Bundle) obj3);
            }
        });
        map3.put("lite/convert", new yHO() { // from class: o.swD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C45778swx.AuCTelauCTel((android.content.Context) obj, (java.lang.String) obj2, (android.os.Bundle) obj3);
            }
        });
        map3.put("lite/main/earn", new yHO() { // from class: o.swE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C45778swx.zLjUOn((android.content.Context) obj, (java.lang.String) obj2, (android.os.Bundle) obj3);
            }
        });
        map3.put("lite/mystery_box", new yHO() { // from class: o.swC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C45778swx.wlaJM((android.content.Context) obj, (java.lang.String) obj2, (android.os.Bundle) obj3);
            }
        });
        AEQbTJ = map3;
    }

    public static final void copydefault(android.content.Context context, LiteNavigationTabEnum liteNavigationTabEnum, android.os.Bundle bundle) {
        java.lang.String string = bundle.getString("key_deeplink");
        if (!android.text.TextUtils.isEmpty(string) && CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) copydefault), string)) {
            bundle.remove("key_deeplink");
        }
        InterfaceC33171mrS interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class);
        bundle.putParcelable("tab_type", liteNavigationTabEnum);
        Unit unit = Unit.INSTANCE;
        InterfaceC33171mrS.Activity.switchToAppMode$default(interfaceC33171mrS, context, 2, false, 0, bundle, null, 32, null);
    }

    public static final Unit ejfBZ(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        copydefault(context, LiteNavigationTabEnum.LITE_HOME, bundle);
        return Unit.INSTANCE;
    }

    public static final Unit fARcdN(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        copydefault(context, LiteNavigationTabEnum.LITE_DISCOVER, bundle);
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        copydefault(context, LiteNavigationTabEnum.LITE_MARKET, bundle);
        return Unit.INSTANCE;
    }

    public static final Unit fIwbmz(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        bundle.putString("path", "lite/trade/main/page");
        copydefault(context, LiteNavigationTabEnum.LITE_TRADE, bundle);
        return Unit.INSTANCE;
    }

    public static final Unit getNewProxyInstance(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        ((InterfaceC45658suG) C43251rlk.copydefault(InterfaceC45658suG.class)).copydefault(context, "lite/main/earn/list", bundle);
        return Unit.INSTANCE;
    }

    public static final Unit iwGUEr(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        ((InterfaceC45658suG) C43251rlk.copydefault(InterfaceC45658suG.class)).copydefault(context, "lite/main/earn/list", bundle);
        return Unit.INSTANCE;
    }

    public static final Unit hDKMBd(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        ((InterfaceC45658suG) C43251rlk.copydefault(InterfaceC45658suG.class)).copydefault(context, "lite/main/earn/jumpstart", bundle);
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        ((InterfaceC45658suG) C43251rlk.copydefault(InterfaceC45658suG.class)).copydefault(context, "lite/main/earn/mine", bundle);
        return Unit.INSTANCE;
    }

    public static final Unit AuCTel(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (Intrinsics.EZpvd((java.lang.Object) java.lang.String.valueOf(bundle.get("source")), (java.lang.Object) "earn")) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putParcelable("portfolio_source", LitePortfolioSourceEnum.EARN_DEPOSIT_SUCCESS);
            copydefault(context, LiteNavigationTabEnum.LITE_PORTFOLIO, bundle2);
        } else if (Intrinsics.EZpvd((java.lang.Object) java.lang.String.valueOf(bundle.get("source")), (java.lang.Object) "buy_delay_notification")) {
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putParcelable("portfolio_source", LitePortfolioSourceEnum.BUY_DELAY_NOTIFICATION);
            copydefault(context, LiteNavigationTabEnum.LITE_PORTFOLIO, bundle3);
        } else {
            ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).AEQbTJ(context, LiteNavigationTabEnum.LITE_PORTFOLIO);
        }
        return Unit.INSTANCE;
    }

    public static final Unit getFieldNames(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity != null) {
            bundle.putSerializable("okPaymentSource", OKPaymentSource.LITE_ONBOARDING_TOPUP);
            ((InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class)).AEQbTJ(fragmentActivity, str, bundle);
        }
        return Unit.INSTANCE;
    }

    public static final Unit uzCIH(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        ((InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class)).EZpvd(context, str, bundle);
        return Unit.INSTANCE;
    }

    public static final Unit AuCTelauCTel(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        ((InterfaceC45657suF) C43251rlk.copydefault(InterfaceC45657suF.class)).KWHzl(context, str, bundle);
        return Unit.INSTANCE;
    }

    public static final Unit zLjUOn(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        ((InterfaceC45658suG) C43251rlk.copydefault(InterfaceC45658suG.class)).copydefault(context, str, bundle);
        return Unit.INSTANCE;
    }

    public static final Unit wlaJM(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        InterfaceC48694uaX interfaceC48694uaX = (InterfaceC48694uaX) C43251rlk.OLrzqt(InterfaceC48694uaX.class);
        if (interfaceC48694uaX != null) {
            InterfaceC48694uaX.StateListAnimator.jumpToLiteMysteryBoxesList$default(interfaceC48694uaX, context, null, 2, null);
        }
        return Unit.INSTANCE;
    }
}
