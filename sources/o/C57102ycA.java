package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.wallet.api.WalletReferralSource;
import com.okinc.wallet.api.bean.EnterWalletMainBean;
import com.okinc.wallet.api.bean.SupportedNetworkType;
import com.okinc.wallet.api.bean.UnsupportedWalletType;
import com.okinc.wallet.mln.MLNWalletRouter$navigation$23$1;
import com.okinc.wallet.mln.MLNWalletRouter$navigation$24;
import com.okinc.wallet.mln.MLNWalletRouter$navigation$25;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import o.ActivityC18621flp;
import o.C14140dfo;
import o.InterfaceC54829xWw;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: renamed from: o.ycA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57102ycA implements InterfaceC7380aij {
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.ycB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C57102ycA.AEQbTJ();
        }
    });

    public final java.util.List<InterfaceC9773bbs> copydefault() {
        return (java.util.List) this.AEQbTJ.getValue();
    }

    public static final java.util.List AEQbTJ() {
        return C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9773bbs.class));
    }

    @Override // o.InterfaceC7380aij
    public java.util.Set<java.lang.String> KWHzl() {
        return yEE.AhwBna("GoToWalletHome", "GoToWalletAddFunds", "WalletHistory", "WalletSendDetail", "AddWallet", "AddWalletSheet", "ImportWalletSheet", "GoToDAppWebView", "UserCenter", "GoToHistoryTxDetailPage", "GoToWalletCopyAddressPage", "GoToWalletBackupSeedPhrasePage", "GoToDexReferralBindEntryPage", "GoToDexReferralBindShortEntryPage");
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [92=15] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v101, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v32, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v37, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v38, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v138, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v139, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v37, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v38, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v94, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v95, resolved type: T */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0137  */
    @Override // o.InterfaceC7380aij
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, final java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull InterfaceC7379aii interfaceC7379aii) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.Object obj;
        java.lang.String str6;
        int i;
        java.util.List listAxsJAYsNCnLh;
        java.lang.Integer num;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Integer num2;
        java.lang.String str7;
        java.lang.String str8;
        InterfaceC9773bbs interfaceC9773bbs;
        java.lang.String str9;
        java.lang.Long l;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.Integer num3;
        java.lang.String str14;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC7379aii, "");
        java.lang.String str15 = null;
        str = null;
        java.lang.String str16 = null;
        str15 = null;
        switch (str.hashCode()) {
            case -1751933198:
                if (str.equals("WalletSendDetail")) {
                    if ((map != null ? map.get("walletId") : null) instanceof java.lang.String) {
                        java.lang.Object obj6 = map != null ? map.get("walletId") : null;
                        if (obj6 instanceof java.lang.String) {
                            str2 = (java.lang.String) obj6;
                        }
                    } else {
                        str2 = null;
                    }
                    java.lang.Long lValueOf = (map == null || (obj = map.get("coinId")) == null) ? null : java.lang.Long.valueOf(C33129mqd.valueOf(obj));
                    if ((map != null ? map.get("txHash") : null) instanceof java.lang.String) {
                        java.lang.Object obj7 = map != null ? map.get("txHash") : null;
                        if (obj7 instanceof java.lang.String) {
                            str3 = (java.lang.String) obj7;
                        }
                    } else {
                        str3 = null;
                    }
                    if ((map != null ? map.get("txId") : null) instanceof java.lang.String) {
                        java.lang.Object obj8 = map != null ? map.get("txId") : null;
                        if (obj8 instanceof java.lang.String) {
                            str4 = (java.lang.String) obj8;
                        }
                    } else {
                        str4 = null;
                    }
                    if ((map != null ? map.get("uopHash") : null) instanceof java.lang.String) {
                        java.lang.Object obj9 = map != null ? map.get("uopHash") : null;
                        if (obj9 instanceof java.lang.String) {
                            str5 = (java.lang.String) obj9;
                        }
                    } else {
                        str5 = null;
                    }
                    if ((map != null ? map.get("walletAddress") : null) instanceof java.lang.String) {
                        java.lang.Object obj10 = map != null ? map.get("walletAddress") : null;
                        if (obj10 instanceof java.lang.String) {
                            str15 = (java.lang.String) obj10;
                        }
                    }
                    android.os.Bundle bundle = new android.os.Bundle();
                    if (str2 != null) {
                        bundle.putString("wallet_id", str2);
                        Unit unit = Unit.INSTANCE;
                    }
                    if (lValueOf != null) {
                        bundle.putLong("coin", lValueOf.longValue());
                        Unit unit2 = Unit.INSTANCE;
                    }
                    if (str4 != null) {
                        bundle.putString("tx_id", str4);
                        Unit unit3 = Unit.INSTANCE;
                    }
                    if (str3 != null) {
                        bundle.putString("tx_hash", str3);
                        Unit unit4 = Unit.INSTANCE;
                    }
                    if (str5 != null) {
                        bundle.putString("tx_uop_hash", str5);
                        Unit unit5 = Unit.INSTANCE;
                    }
                    if (str15 != null) {
                        bundle.putString("tx_address", str15);
                        Unit unit6 = Unit.INSTANCE;
                    }
                    InterfaceC54829xWw.ActionBar.enterWalletTxDetail$default((InterfaceC54829xWw) C43248rlh.KWHzl.AEQbTJ(InterfaceC54829xWw.class), (FragmentActivity) context, bundle, false, false, false, 20, null);
                    break;
                }
                break;
            case -1193825883:
                if (str.equals("AddWalletSheet")) {
                    java.lang.Object obj11 = map != null ? map.get("successCallback") : null;
                    LuaFunction luaFunction = obj11 instanceof LuaFunction ? (LuaFunction) obj11 : null;
                    if (luaFunction == null) {
                        luaFunction = null;
                    }
                    if ((map != null ? map.get("content") : null) instanceof java.lang.String) {
                        java.lang.Object obj12 = map.get("content");
                        java.lang.String str17 = obj12 instanceof java.lang.String ? (java.lang.String) obj12 : null;
                        str6 = str17 == null ? "" : str17;
                    }
                    if ((map != null ? map.get("androidDisableTypes") : null) != null && (map.get("androidDisableTypes") instanceof java.util.List)) {
                        java.lang.Object obj13 = map.get("androidDisableTypes");
                        java.util.List list = obj13 instanceof java.util.List ? (java.util.List) obj13 : null;
                        java.util.List listAhwBna = yDY.AhwBna();
                        if (C33129mqd.KWHzl((java.util.Collection) list)) {
                            java.util.Map mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt(1, UnsupportedWalletType.MPCWallet), C56390yDp.OLrzqt(3, UnsupportedWalletType.HardwareWallet));
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            if (list != null) {
                                java.util.Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    UnsupportedWalletType unsupportedWalletType = (UnsupportedWalletType) mapGEmmrt.get(it.next());
                                    if (unsupportedWalletType != null) {
                                        arrayList.add(unsupportedWalletType);
                                    }
                                }
                                Unit unit7 = Unit.INSTANCE;
                            }
                            i = 1;
                            if (!arrayList.isEmpty()) {
                                listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
                            }
                            C14140dfo instance$default = C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, i, null);
                            androidx.fragment.app.FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                            C14140dfo.showConnectWalletDialog$default(instance$default, supportFragmentManager, new Activity(luaFunction), 0, null, listAxsJAYsNCnLh, str6, null, null, 204, null);
                        } else {
                            i = 1;
                        }
                        listAxsJAYsNCnLh = listAhwBna;
                        C14140dfo instance$default2 = C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, i, null);
                        androidx.fragment.app.FragmentManager supportFragmentManager2 = ((FragmentActivity) context).getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                        C14140dfo.showConnectWalletDialog$default(instance$default2, supportFragmentManager2, new Activity(luaFunction), 0, null, listAxsJAYsNCnLh, str6, null, null, 204, null);
                    } else {
                        C14140dfo instance$default3 = C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null);
                        androidx.fragment.app.FragmentManager supportFragmentManager3 = ((FragmentActivity) context).getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "");
                        C14140dfo.showConnectWalletDialog$default(instance$default3, supportFragmentManager3, new StateListAnimator(luaFunction), 0, null, null, str6, null, null, 220, null);
                    }
                    break;
                }
                break;
            case -1181402080:
                if (str.equals("UserCenter")) {
                    ActivityC18621flp.Activity activity = ActivityC18621flp.Companion;
                    android.app.Activity activity2 = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                    if (activity2 != null) {
                        ActivityC18621flp.Activity.startActivity$default(activity, activity2, 0, null, 2, null);
                        break;
                    }
                }
                break;
            case -602329421:
                if (str.equals("GoToDexReferralBindEntryPage")) {
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    if ((map != null ? map.get("code") : null) instanceof java.lang.String) {
                        java.lang.Object obj14 = map != null ? map.get("code") : null;
                        objectRef.element = obj14 instanceof java.lang.String ? (java.lang.String) obj14 : 0;
                    }
                    if ((map != null ? map.get("source") : null) instanceof java.lang.Integer) {
                        java.lang.Object obj15 = map != null ? map.get("source") : null;
                        if (obj15 instanceof java.lang.Integer) {
                            num = (java.lang.Integer) obj15;
                        }
                    } else {
                        num = null;
                    }
                    BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new MLNWalletRouter$navigation$24(context, objectRef, (num != null && num.intValue() == 1) ? WalletReferralSource.REFERRAL_DASHBOARD : (num != null && num.intValue() == 14) ? WalletReferralSource.BOOST : WalletReferralSource.OTHERS, null), 2, null);
                    break;
                }
                break;
            case -497210670:
                if (str.equals("GoToWalletCopyAddressPage")) {
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    if ((map != null ? map.get("walletId") : null) instanceof java.lang.String) {
                        java.lang.Object obj16 = map != null ? map.get("walletId") : null;
                        objectRef2.element = obj16 instanceof java.lang.String ? (java.lang.String) obj16 : 0;
                    }
                    if (((java.lang.String) objectRef2.element) != null) {
                        if (context instanceof AbstractActivityC33041mov) {
                            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new MLNWalletRouter$navigation$23$1(objectRef2, context, null), 2, null);
                        }
                        Unit unit8 = Unit.INSTANCE;
                    }
                    break;
                }
                break;
            case -228827703:
                if (str.equals("GoToWalletAddFunds")) {
                    C6810aWR c6810aWR = new C6810aWR(null, null, false, null, 0, 31, null);
                    java.lang.Object obj17 = map != null ? map.get("walletId") : null;
                    java.lang.String str18 = obj17 instanceof java.lang.String ? (java.lang.String) obj17 : null;
                    if (str18 == null) {
                        str18 = "";
                    }
                    c6810aWR.KWHzl(str18);
                    java.lang.Object obj18 = map != null ? map.get("coinId") : null;
                    java.lang.String str19 = obj18 instanceof java.lang.String ? (java.lang.String) obj18 : null;
                    if (str19 == null) {
                        str19 = "";
                    }
                    c6810aWR.EZpvd(str19);
                    c6810aWR.AEQbTJ(false);
                    java.lang.Object obj19 = map != null ? map.get("addressType") : null;
                    c6810aWR.copydefault(C33129mqd.AhwBna(obj19 instanceof java.lang.String ? (java.lang.String) obj19 : null));
                    java.lang.Object obj20 = map != null ? map.get("onClose") : null;
                    LuaFunction luaFunction2 = obj20 instanceof LuaFunction ? (LuaFunction) obj20 : null;
                    if (luaFunction2 == null) {
                        luaFunction2 = null;
                    }
                    java.lang.Object obj21 = map != null ? map.get("onError") : null;
                    LuaFunction luaFunction3 = obj21 instanceof LuaFunction ? (LuaFunction) obj21 : null;
                    LuaFunction luaFunction4 = luaFunction3 != null ? luaFunction3 : null;
                    InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43248rlh.KWHzl.AEQbTJ(InterfaceC54829xWw.class);
                    androidx.fragment.app.FragmentManager supportFragmentManager4 = ((FragmentActivity) context).getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager4, "");
                    interfaceC54829xWw.OLrzqt(supportFragmentManager4, c6810aWR, new TaskDescription(luaFunction2, luaFunction4));
                    break;
                }
                break;
            case 63872571:
                if (str.equals("WalletHistory")) {
                    java.lang.Object obj22 = map != null ? map.get("wallet_id") : null;
                    java.lang.String str20 = obj22 instanceof java.lang.String ? (java.lang.String) obj22 : null;
                    java.lang.String str21 = str20 == null ? "" : str20;
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putString("wallet_id", str21);
                    InterfaceC54829xWw.ActionBar.enterWalletHistory$default((InterfaceC54829xWw) C43248rlh.KWHzl.AEQbTJ(InterfaceC54829xWw.class), (FragmentActivity) context, bundle2, false, false, false, 20, null);
                    break;
                }
                break;
            case 67659929:
                if (str.equals("GoToDAppWebView")) {
                    InterfaceC54828xWv interfaceC54828xWv = (InterfaceC54828xWv) C43251rlk.copydefault(InterfaceC54828xWv.class);
                    android.app.Activity activity3 = (android.app.Activity) context;
                    java.lang.Object obj23 = map != null ? map.get("url") : null;
                    java.lang.String str22 = obj23 instanceof java.lang.String ? (java.lang.String) obj23 : null;
                    java.lang.Object obj24 = map != null ? map.get("walletId") : null;
                    java.lang.String str23 = obj24 instanceof java.lang.String ? (java.lang.String) obj24 : null;
                    java.lang.Object obj25 = map != null ? map.get("chainId") : null;
                    java.lang.Long l2 = obj25 instanceof java.lang.Long ? (java.lang.Long) obj25 : null;
                    Function0<Unit> function0 = new Function0() { // from class: o.ycz
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C57102ycA.KWHzl(map);
                        }
                    };
                    java.lang.Object obj26 = map != null ? map.get("chainList") : null;
                    java.util.List<java.lang.Integer> list2 = obj26 instanceof java.util.List ? (java.util.List) obj26 : null;
                    java.lang.Object obj27 = map != null ? map.get("subdomainStrategy") : null;
                    java.lang.String string = obj27 instanceof java.lang.String ? (java.lang.String) obj27 : null;
                    if (string == null) {
                        string = SubdomainStrategy.Global.INSTANCE.toString();
                    }
                    java.lang.String str24 = string;
                    java.lang.Object obj28 = map != null ? map.get("source") : null;
                    interfaceC54828xWv.AEQbTJ(activity3, str22, str23, l2, function0, list2, str24, obj28 instanceof java.lang.String ? (java.lang.String) obj28 : null);
                    break;
                }
                break;
            case 121368499:
                if (str.equals("GoToDexReferralBindShortEntryPage")) {
                    Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                    if (map != null) {
                        obj2 = "code";
                        obj3 = map.get(obj2);
                    } else {
                        obj2 = "code";
                        obj3 = null;
                    }
                    if (obj3 instanceof java.lang.String) {
                        java.lang.Object obj29 = map != null ? map.get(obj2) : null;
                        objectRef3.element = obj29 instanceof java.lang.String ? (java.lang.String) obj29 : 0;
                    }
                    if (map != null) {
                        obj4 = "source";
                        obj5 = map.get(obj4);
                    } else {
                        obj4 = "source";
                        obj5 = null;
                    }
                    if (obj5 instanceof java.lang.Integer) {
                        java.lang.Object obj30 = map != null ? map.get(obj4) : null;
                        if (obj30 instanceof java.lang.Integer) {
                            num2 = (java.lang.Integer) obj30;
                        }
                    } else {
                        num2 = null;
                    }
                    WalletReferralSource walletReferralSource = (num2 != null && num2.intValue() == 1) ? WalletReferralSource.REFERRAL_DASHBOARD : (num2 != null && num2.intValue() == 14) ? WalletReferralSource.BOOST : WalletReferralSource.OTHERS;
                    java.lang.CharSequence charSequence = (java.lang.CharSequence) objectRef3.element;
                    if (charSequence != null && charSequence.length() != 0) {
                        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new MLNWalletRouter$navigation$25(context, objectRef3, walletReferralSource, null), 2, null);
                        break;
                    }
                }
                break;
            case 246043191:
                if (str.equals("GoToWalletBackupSeedPhrasePage")) {
                    if ((map != null ? map.get("accountId") : null) instanceof java.lang.String) {
                        java.lang.Object obj31 = map != null ? map.get("accountId") : null;
                        if (obj31 instanceof java.lang.String) {
                            str7 = (java.lang.String) obj31;
                        }
                    } else {
                        str7 = null;
                    }
                    java.lang.Object obj32 = map != null ? map.get("onClose") : null;
                    LuaFunction luaFunction5 = obj32 instanceof LuaFunction ? (LuaFunction) obj32 : null;
                    final LuaFunction luaFunction6 = luaFunction5 != null ? luaFunction5 : null;
                    if ((context instanceof AbstractActivityC33041mov) && str7 != null) {
                        xWS xws = (xWS) C43251rlk.copydefault(xWS.class);
                        AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) context;
                        androidx.fragment.app.FragmentManager supportFragmentManager5 = abstractActivityC33041mov.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager5, "");
                        xws.OLrzqt(abstractActivityC33041mov, supportFragmentManager5, str7, new Function0() { // from class: o.ycx
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C57102ycA.KWHzl(luaFunction6);
                            }
                        });
                        break;
                    }
                }
                break;
            case 782792315:
                if (str.equals("GoToWalletHome")) {
                    interfaceC7379aii.EZpvd();
                    android.app.Activity activity4 = (android.app.Activity) context;
                    java.lang.Object obj33 = map != null ? map.get("walletId") : null;
                    java.lang.String str25 = obj33 instanceof java.lang.String ? (java.lang.String) obj33 : null;
                    java.lang.String str26 = str25 == null ? "" : str25;
                    java.lang.Object obj34 = map != null ? map.get("index") : null;
                    java.lang.Integer num4 = obj34 instanceof java.lang.Integer ? (java.lang.Integer) obj34 : null;
                    int iIntValue = num4 != null ? num4.intValue() : 1;
                    if (iIntValue == 0) {
                        str8 = "wallet";
                    } else if (iIntValue == 1) {
                        str8 = "collectibles";
                    } else if (iIntValue == 2) {
                        str8 = "portfolio";
                    } else if (iIntValue == 3) {
                        str8 = "approve_manager";
                    } else if (iIntValue == 4) {
                        str8 = "dapps";
                    }
                    if (!Intrinsics.EZpvd((java.lang.Object) str8, (java.lang.Object) "collectibles")) {
                        ((InterfaceC54829xWw) C43248rlh.KWHzl.AEQbTJ(InterfaceC54829xWw.class)).copydefault(activity4, new EnterWalletMainBean((java.lang.Boolean) null, str26, java.lang.Integer.valueOf(C9768bbn.gEmmrt), str8, false, false, (com.okinc.wallet.api.bean.ScanResult) null, WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST, (DefaultConstructorMarker) null));
                        Unit unit9 = Unit.INSTANCE;
                        break;
                    } else {
                        java.util.List<InterfaceC9773bbs> listCopydefault = copydefault();
                        if (listCopydefault != null && (interfaceC9773bbs = (InterfaceC9773bbs) CollectionsKt___CollectionsKt.AuCTelauCTel(listCopydefault)) != null) {
                            interfaceC9773bbs.AEQbTJ(context);
                            Unit unit10 = Unit.INSTANCE;
                            break;
                        }
                    }
                }
                break;
            case 813750241:
                if (str.equals("ImportWalletSheet")) {
                    java.lang.Object obj35 = map != null ? map.get("successCallback") : null;
                    LuaFunction luaFunction7 = obj35 instanceof LuaFunction ? (LuaFunction) obj35 : null;
                    if (luaFunction7 == null) {
                        luaFunction7 = null;
                    }
                    java.lang.Object obj36 = map != null ? map.get("androidDisableTypes") : null;
                    java.util.List list3 = obj36 instanceof java.util.List ? (java.util.List) obj36 : null;
                    java.util.List listAhwBna2 = yDY.AhwBna();
                    if (C33129mqd.KWHzl((java.util.Collection) list3)) {
                        java.util.Map mapGEmmrt2 = C56424yEw.gEmmrt(C56390yDp.OLrzqt(1, UnsupportedWalletType.MPCWallet), C56390yDp.OLrzqt(3, UnsupportedWalletType.HardwareWallet), C56390yDp.OLrzqt(0, UnsupportedWalletType.PrivateKeyWallet));
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        if (list3 != null) {
                            java.util.Iterator it2 = list3.iterator();
                            while (it2.hasNext()) {
                                UnsupportedWalletType unsupportedWalletType2 = (UnsupportedWalletType) mapGEmmrt2.get(it2.next());
                                if (unsupportedWalletType2 != null) {
                                    arrayList2.add(unsupportedWalletType2);
                                }
                            }
                            Unit unit11 = Unit.INSTANCE;
                        }
                        if (!arrayList2.isEmpty()) {
                            listAhwBna2 = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList2);
                        }
                    }
                    java.util.List list4 = listAhwBna2;
                    FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
                    if (fragmentActivity != null) {
                        C14140dfo instance$default4 = C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null);
                        androidx.fragment.app.FragmentManager supportFragmentManager6 = fragmentActivity.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager6, "");
                        instance$default4.KWHzl(supportFragmentManager6, fragmentActivity, (64 & 4) != 0 ? null : new ActionBar(luaFunction7), (64 & 8) != 0 ? 2 : 2, (java.util.List<SupportedNetworkType>) ((64 & 16) != 0 ? null : null), (java.util.List<? extends UnsupportedWalletType>) ((64 & 32) != 0 ? yDY.AhwBna() : list4), (64 & 64) != 0 ? null : null);
                        break;
                    }
                }
                break;
            case 882943029:
                if (str.equals("GoToHistoryTxDetailPage")) {
                    if ((map != null ? map.get("walletId") : null) instanceof java.lang.String) {
                        java.lang.Object obj37 = map != null ? map.get("walletId") : null;
                        if (obj37 instanceof java.lang.String) {
                            str9 = (java.lang.String) obj37;
                        }
                    } else {
                        str9 = null;
                    }
                    if ((map != null ? map.get("coinId") : null) instanceof java.lang.Long) {
                        java.lang.Object obj38 = map != null ? map.get("coinId") : null;
                        if (obj38 instanceof java.lang.Long) {
                            l = (java.lang.Long) obj38;
                        }
                    } else {
                        l = null;
                    }
                    if ((map != null ? map.get("txHash") : null) instanceof java.lang.String) {
                        java.lang.Object obj39 = map != null ? map.get("txHash") : null;
                        if (obj39 instanceof java.lang.String) {
                            str10 = (java.lang.String) obj39;
                        }
                    } else {
                        str10 = null;
                    }
                    if ((map != null ? map.get("txId") : null) instanceof java.lang.String) {
                        java.lang.Object obj40 = map != null ? map.get("txId") : null;
                        if (obj40 instanceof java.lang.String) {
                            str11 = (java.lang.String) obj40;
                        }
                    } else {
                        str11 = null;
                    }
                    if ((map != null ? map.get("uopHash") : null) instanceof java.lang.String) {
                        java.lang.Object obj41 = map != null ? map.get("uopHash") : null;
                        if (obj41 instanceof java.lang.String) {
                            str12 = (java.lang.String) obj41;
                        }
                    } else {
                        str12 = null;
                    }
                    if ((map != null ? map.get("walletAddress") : null) instanceof java.lang.String) {
                        java.lang.Object obj42 = map != null ? map.get("walletAddress") : null;
                        if (obj42 instanceof java.lang.String) {
                            str13 = (java.lang.String) obj42;
                        }
                    } else {
                        str13 = null;
                    }
                    if ((map != null ? map.get("txType") : null) instanceof java.lang.Integer) {
                        java.lang.Object obj43 = map != null ? map.get("txType") : null;
                        if (obj43 instanceof java.lang.Integer) {
                            num3 = (java.lang.Integer) obj43;
                        }
                    } else {
                        num3 = null;
                    }
                    if ((map != null ? map.get("orderId") : null) instanceof java.lang.String) {
                        java.lang.Object obj44 = map != null ? map.get("orderId") : null;
                        if (obj44 instanceof java.lang.String) {
                            str14 = (java.lang.String) obj44;
                        }
                    } else {
                        str14 = null;
                    }
                    if ((map != null ? map.get("dexOrderId") : null) instanceof java.lang.String) {
                        java.lang.Object obj45 = map != null ? map.get("dexOrderId") : null;
                        if (obj45 instanceof java.lang.String) {
                            str16 = (java.lang.String) obj45;
                        }
                    }
                    android.os.Bundle bundle3 = new android.os.Bundle();
                    if (str9 != null) {
                        bundle3.putString("wallet_id", str9);
                        Unit unit12 = Unit.INSTANCE;
                    }
                    if (l != null) {
                        bundle3.putLong("coin", l.longValue());
                        Unit unit13 = Unit.INSTANCE;
                    }
                    if (str11 != null) {
                        bundle3.putString("tx_id", str11);
                        Unit unit14 = Unit.INSTANCE;
                    }
                    if (str10 != null) {
                        bundle3.putString("tx_hash", str10);
                        Unit unit15 = Unit.INSTANCE;
                    }
                    if (str12 != null) {
                        bundle3.putString("tx_uop_hash", str12);
                        Unit unit16 = Unit.INSTANCE;
                    }
                    if (str13 != null) {
                        bundle3.putString("tx_address", str13);
                        Unit unit17 = Unit.INSTANCE;
                    }
                    if (num3 != null) {
                        bundle3.putInt("tx_type", num3.intValue());
                        Unit unit18 = Unit.INSTANCE;
                    }
                    if (str14 != null) {
                        bundle3.putString(OtcExtraKeys.ORDER_ID, str14);
                        Unit unit19 = Unit.INSTANCE;
                    }
                    if (str16 != null) {
                        bundle3.putString("dex_order_id", str16);
                        Unit unit20 = Unit.INSTANCE;
                    }
                    InterfaceC54829xWw.ActionBar.transferToDifferentTypeTxDetail$default((InterfaceC54829xWw) C43248rlh.KWHzl.AEQbTJ(InterfaceC54829xWw.class), (FragmentActivity) context, bundle3, false, false, false, 20, null);
                    break;
                }
                break;
            case 2101615578:
                if (str.equals("AddWallet")) {
                    ActivityC18501fjb.Companion.copydefault(context, (62 & 2) != 0 ? null : null, (62 & 4) == 0 ? null : null, (62 & 8) != 0 ? yDY.AhwBna() : null, (62 & 16) != 0, (62 & 32) == 0 ? 0 : 1);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: o.ycA$TaskDescription */
    public static final class TaskDescription implements InterfaceC54850xXq {
        public final /* synthetic */ LuaFunction AEQbTJ;
        public final /* synthetic */ LuaFunction copydefault;

        public TaskDescription(LuaFunction luaFunction, LuaFunction luaFunction2) {
            this.AEQbTJ = luaFunction;
            this.copydefault = luaFunction2;
        }

        @Override // o.InterfaceC54850xXq
        public void copydefault() {
            LuaFunction luaFunction = this.AEQbTJ;
            if (luaFunction != null) {
                luaFunction.OLrzqt();
            }
        }

        @Override // o.InterfaceC54850xXq
        public void KWHzl(int i) {
            LuaFunction luaFunction = this.copydefault;
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.rNumber(i));
            }
        }
    }

    /* JADX INFO: renamed from: o.ycA$Activity */
    public static final class Activity implements InterfaceC54859xXz {
        public final /* synthetic */ LuaFunction KWHzl;

        public Activity(LuaFunction luaFunction) {
            this.KWHzl = luaFunction;
        }

        @Override // o.InterfaceC54859xXz
        public void EZpvd() {
            LuaFunction luaFunction = this.KWHzl;
            if (luaFunction != null) {
                luaFunction.OLrzqt();
            }
        }
    }

    /* JADX INFO: renamed from: o.ycA$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC54859xXz {
        public final /* synthetic */ LuaFunction OLrzqt;

        public StateListAnimator(LuaFunction luaFunction) {
            this.OLrzqt = luaFunction;
        }

        @Override // o.InterfaceC54859xXz
        public void EZpvd() {
            LuaFunction luaFunction = this.OLrzqt;
            if (luaFunction != null) {
                luaFunction.OLrzqt();
            }
        }
    }

    /* JADX INFO: renamed from: o.ycA$ActionBar */
    public static final class ActionBar implements InterfaceC54859xXz {
        public final /* synthetic */ LuaFunction KWHzl;

        public ActionBar(LuaFunction luaFunction) {
            this.KWHzl = luaFunction;
        }

        @Override // o.InterfaceC54859xXz
        public void EZpvd() {
            LuaFunction luaFunction = this.KWHzl;
            if (luaFunction != null) {
                luaFunction.OLrzqt();
            }
        }
    }

    public static final Unit KWHzl(java.util.Map map) {
        java.lang.Object obj = map != null ? map.get("onClosed") : null;
        LuaFunction luaFunction = obj instanceof LuaFunction ? (LuaFunction) obj : null;
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(LuaFunction luaFunction) {
        if (luaFunction != null) {
            luaFunction.OLrzqt();
        }
        return Unit.INSTANCE;
    }
}
