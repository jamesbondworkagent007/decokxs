package com.okinc.business.defi.dapp.bridge;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.activity.ComponentActivity;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.trusted.NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.immomo.mls.fun.ud.UDArray;
import com.immomo.mls.fun.ud.UDNativeLoader;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.OrderStatus;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.dapp.base.FragmentNavigator;
import com.okinc.business.defi.dapp.bridge.DappBridge;
import com.okinc.business.defi.dapp.net.DappListBean;
import com.okinc.business.defi.dapp.net.WhiteList;
import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.dapp.bean.DappChains;
import com.okinc.dapp.bean.DappSearchResultBean;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.rxutils.RxBus;
import com.okinc.wallet.api.bean.CurrentWalletSelectMode;
import com.okinc.wallet.api.bean.CurrentWalletSwitchConfig;
import com.okinc.wallet.api.bean.CurrentWalletSwitchNetworkMode;
import com.okinc.wallet.api.bean.FunctionConfig;
import com.okinc.wallet.api.bean.ThemeType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.AbstractActivityC33041mov;
import o.AbstractC14835dsu;
import o.C14795dsG;
import o.C14808dsT;
import o.C14822dsh;
import o.C14846dtE;
import o.C14851dtJ;
import o.C14865dtX;
import o.C14866dtY;
import o.C14923duc;
import o.C15059dxF;
import o.C15099dxt;
import o.C15112dyF;
import o.C15114dyH;
import o.C15118dyL;
import o.C15142dyj;
import o.C15148dyp;
import o.C15196dzk;
import o.C32979mnm;
import o.C33490mxT;
import o.C43248rlh;
import o.C43251rlk;
import o.C52761wXj;
import o.C58156yvv;
import o.C58266yxz;
import o.C7322ahe;
import o.C7323ahf;
import o.C7910asj;
import o.C9767bbm;
import o.C9768bbn;
import o.C9921beh;
import o.InterfaceC43294rma;
import o.InterfaceC54855xXv;
import o.InterfaceC58227yxM;
import o.InterfaceC7298ahG;
import o.InterfaceC9738bbJ;
import o.InterfaceC9852bdR;
import o.InterfaceC9859bdY;
import o.dBQ;
import o.dBW;
import o.pUU;
import o.xWA;
import o.xWH;
import o.xWO;
import o.xWX;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaBoolean;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes4.dex */
@LuaClass
public class DappBridge {
    public static final String EVENT_KEY_CLOSE_DAPP_NEW_HOME_PAGE = "closeDappNewHomePage";
    public static final String EVENT_KEY_CLOSE_DAPP_NEW_SEARCH_PAGE = "closeDappNewSearchPage";
    public static final String LUA_CLASS_NAME = "OKDAppBridge";
    public Globals globals;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: RETURN  */
    public static /* synthetic */ void KWHzl(Integer num) throws Exception {
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: RETURN  */
    public static /* synthetic */ void KWHzl(Throwable th) throws Exception {
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: RETURN  */
    public static /* synthetic */ void OLrzqt(Integer num) throws Exception {
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: RETURN  */
    public static /* synthetic */ void copydefault(Throwable th) throws Exception {
    }

    public DappBridge(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
        this.globals = globals;
    }

    public Activity copydefault() {
        C7322ahe c7322ahe = (C7322ahe) this.globals.AuCTel();
        Context context = c7322ahe != null ? c7322ahe.AEQbTJ : null;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    @LuaBridge
    public LuaValue[] closeDappNewHomePage() {
        RxBus.KWHzl(EVENT_KEY_CLOSE_DAPP_NEW_HOME_PAGE);
        return null;
    }

    @LuaBridge
    public LuaValue[] closeDappSearchPage() {
        RxBus.KWHzl(EVENT_KEY_CLOSE_DAPP_NEW_SEARCH_PAGE);
        return null;
    }

    @LuaBridge
    public LuaValue[] openDappSearchFragment(LuaValue[] luaValueArr) {
        C15148dyp c15148dyp;
        FragmentManager fragmentManagerCopydefault;
        Integer numAEQbTJ;
        if (luaValueArr.length > 0) {
            String javaString = luaValueArr[0].toJavaString();
            if (javaString.isEmpty() || (fragmentManagerCopydefault = (c15148dyp = C15148dyp.copydefault).copydefault(javaString)) == null || (numAEQbTJ = c15148dyp.AEQbTJ(javaString)) == null) {
                return null;
            }
            HashMap map = new HashMap();
            map.put("rootPage", javaString);
            map.put("pageSource", "DappNewHomeSearch");
            C14865dtX c14865dtXKWHzl = C14865dtX.Companion.KWHzl("DiscoverSearchHomeVC", map);
            FragmentNavigator.Application application = new FragmentNavigator.Application();
            int i = C52761wXj.Application.EZpvd;
            int i2 = C52761wXj.Application.copydefault;
            FragmentNavigator.Companion.EZpvd(fragmentManagerCopydefault, numAEQbTJ).OLrzqt(c14865dtXKWHzl, C14866dtY.class.getSimpleName(), application.AEQbTJ(i, i2, i2, i, false, true, FragmentNavigator.TransactionMode.ADD_SHOW_HIDE, Collections.emptyList(), true, true));
        }
        return null;
    }

    @LuaBridge
    public LuaValue[] validateDeeplinkScheme(LuaValue[] luaValueArr) {
        if (luaValueArr.length < 1) {
            return LuaValue.rFalse();
        }
        return LuaValue.rBoolean(((InterfaceC43294rma) C43248rlh.KWHzl.AEQbTJ(InterfaceC43294rma.class)).values(luaValueArr[0].toJavaString()));
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.dapp.bridge.DappBridge$4, reason: invalid class name */
    public class AnonymousClass4 implements UDNativeLoader.StateListAnimator {
        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void OLrzqt() {
        }

        public AnonymousClass4() {
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void copydefault(final UDNativeLoader.Application application, UDNativeLoader.Activity activity) {
            new C15059dxF().OLrzqt().AEQbTJ(new InterfaceC58227yxM() { // from class: o.dsI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) throws java.lang.Exception {
                    DappBridge.AnonymousClass4.copydefault(application, (ResponseData) obj);
                }
            }, new InterfaceC58227yxM() { // from class: o.dsK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    application.copydefault("");
                }
            });
        }

        public static /* synthetic */ void copydefault(UDNativeLoader.Application application, ResponseData responseData) throws Exception {
            String whiteMainlandHost = ((WhiteList) responseData.getData()).getWhiteMainlandHost();
            String webDeskConfigList = ((WhiteList) responseData.getData()).getWebDeskConfigList();
            C14923duc c14923duc = C14923duc.EZpvd;
            c14923duc.EZpvd(whiteMainlandHost, webDeskConfigList, ((WhiteList) responseData.getData()).getGenesisHashToChainMap());
            c14923duc.EZpvd(((WhiteList) responseData.getData()).getRequestTranslateCharCount(), ((WhiteList) responseData.getData()).getRequestTranslateRecordCount());
            application.copydefault(whiteMainlandHost);
        }
    }

    @LuaBridge
    public LuaValue[] requestDappWhiteList(LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader.copydefault(new AnonymousClass4());
        return LuaValue.varargsOf(C7910asj.KWHzl(this.globals, uDNativeLoader));
    }

    @LuaBridge
    public LuaValue[] presentToSearchVC(LuaValue[] luaValueArr) {
        C15118dyL.EZpvd();
        return null;
    }

    @LuaBridge
    public LuaValue[] openManagementPage(LuaValue[] luaValueArr) {
        if (luaValueArr.length > 0 && !luaValueArr[0].isNil()) {
            LuaValue luaValue = luaValueArr[0];
            if (luaValue instanceof LuaFunction) {
                C15118dyL.EZpvd = (LuaFunction) luaValue;
            }
        }
        String javaString = (luaValueArr.length <= 1 || luaValueArr[1].isNil()) ? "" : luaValueArr[1].toJavaString();
        if (!TextUtils.isEmpty(javaString)) {
            C15148dyp c15148dyp = C15148dyp.copydefault;
            FragmentManager fragmentManagerCopydefault = c15148dyp.copydefault(javaString);
            Integer numAEQbTJ = c15148dyp.AEQbTJ(javaString);
            if (fragmentManagerCopydefault != null && numAEQbTJ != null) {
                FragmentNavigator.Companion.EZpvd(fragmentManagerCopydefault, numAEQbTJ).OLrzqt(dBW.Companion.AEQbTJ(javaString, Boolean.TRUE, "dapp_icon_tab"), dBW.class.getSimpleName(), new FragmentNavigator.Application());
                return null;
            }
        }
        dBQ.Companion.KWHzl(copydefault(), "dapp_icon_tab");
        return null;
    }

    @LuaBridge
    public LuaValue[] validateDAppWhiteList(LuaValue[] luaValueArr) {
        if (luaValueArr.length < 1) {
            return LuaValue.rFalse();
        }
        return LuaValue.rBoolean(C14923duc.EZpvd.valueOf(luaValueArr[0].toJavaString()));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LuaValue[] openDAppBrowserWithDic(LuaValue[] luaValueArr) {
        PlatformItem platformItem;
        List<DappChains> list;
        Long lValueOf;
        String asString;
        String asString2;
        String str;
        if (luaValueArr.length < 1) {
            return LuaValue.rFalse();
        }
        boolean z = false;
        if (luaValueArr.length > 0) {
            String strOLrzqt = C33490mxT.OLrzqt(C7910asj.EZpvd(luaValueArr[0]));
            if (strOLrzqt == null) {
                return null;
            }
            DappListBean dappListBean = (DappListBean) C33490mxT.EZpvd(strOLrzqt, DappListBean.class);
            PlatformItem platformItemOLrzqt = C14923duc.EZpvd.OLrzqt(dappListBean);
            List<DappChains> chains = dappListBean.getChains();
            if (platformItemOLrzqt == null) {
                return null;
            }
            list = chains;
            platformItem = platformItemOLrzqt;
        } else {
            platformItem = null;
            list = null;
        }
        boolean z2 = (luaValueArr.length <= 1 || luaValueArr[1].isNil()) ? false : luaValueArr[1].toBoolean();
        if (luaValueArr.length > 2 && !luaValueArr[2].isNil()) {
            z = luaValueArr[2].toBoolean();
        }
        boolean z3 = z;
        if (luaValueArr.length <= 3 || luaValueArr[3].isNil()) {
            lValueOf = null;
        } else {
            String javaString = luaValueArr[3].toJavaString();
            if (!TextUtils.isEmpty(javaString)) {
                lValueOf = Long.valueOf(Long.parseLong(javaString));
            }
        }
        if (luaValueArr.length > 4 && !luaValueArr[4].isNil()) {
            C15118dyL.EZpvd = (LuaFunction) luaValueArr[4];
        }
        String string = SubdomainStrategy.Global.INSTANCE.toString();
        asString = "";
        if (luaValueArr.length > 5) {
            try {
                JsonObject jsonObjectOLrzqt = C33490mxT.OLrzqt(C33490mxT.OLrzqt(C7910asj.EZpvd(luaValueArr[5])));
                String asString3 = jsonObjectOLrzqt.has("click_page") ? jsonObjectOLrzqt.get("click_page").getAsString() : "";
                if (jsonObjectOLrzqt.has("subdomainstrategy")) {
                    string = jsonObjectOLrzqt.get("subdomainstrategy").getAsString();
                }
                asString = jsonObjectOLrzqt.has("source") ? jsonObjectOLrzqt.get("source").getAsString() : "";
                asString2 = jsonObjectOLrzqt.has("rootPage") ? jsonObjectOLrzqt.get("rootPage").getAsString() : null;
                try {
                    C14808dsT.Companion.KWHzl(asString3);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                asString2 = null;
            }
            str = string;
        } else {
            str = string;
            asString2 = null;
        }
        String str2 = asString;
        if (asString2 != null) {
            C15148dyp c15148dyp = C15148dyp.copydefault;
            final FragmentManager fragmentManagerCopydefault = c15148dyp.copydefault(asString2);
            final Integer numAEQbTJ = c15148dyp.AEQbTJ(asString2);
            if (fragmentManagerCopydefault != null && numAEQbTJ != null) {
                C14923duc.EZpvd.AEQbTJ((ComponentActivity) copydefault(), platformItem, (String) null, lValueOf, (Function0<Unit>) null, true, list, !z2, z3, (Function1<? super PlatformItem, Unit>) null, str, str2, (Function1<? super Fragment, Unit>) new Function1<Fragment, Unit>() { // from class: com.okinc.business.defi.dapp.bridge.DappBridge.5
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public Unit invoke(Fragment fragment) {
                        if (fragment instanceof AbstractC14835dsu) {
                            ((AbstractC14835dsu) fragment).OLrzqt(fragmentManagerCopydefault);
                        }
                        FragmentNavigator.Companion.EZpvd(fragmentManagerCopydefault, numAEQbTJ).OLrzqt(fragment, fragment.getClass().getSimpleName(), new FragmentNavigator.Application());
                        return null;
                    }
                }, Boolean.TRUE, asString2, (int[]) null);
                return null;
            }
        }
        C14923duc.EZpvd.AEQbTJ((ComponentActivity) copydefault(), platformItem, (String) null, lValueOf, (Function0<Unit>) null, true, list, !z2, z3, (Function1<? super PlatformItem, Unit>) null, str, str2, (Function1<? super Fragment, Unit>) null, (Boolean) null, (String) null, (int[]) null);
        return null;
    }

    @LuaBridge
    public LuaValue[] getCurrentSelectedTab(LuaValue[] luaValueArr) {
        int iAK_ = ((xWO) C43248rlh.KWHzl.AEQbTJ(xWO.class)).aK_();
        if (iAK_ == C9768bbn.KWHzl) {
            return LuaValue.rString("DISCOVER");
        }
        if (iAK_ == C9768bbn.djBIcL) {
            return LuaValue.rString("NFT");
        }
        return LuaValue.rString("OTHERS");
    }

    @LuaBridge
    public LuaValue[] abTestForDAppUseMLN(LuaValue[] luaValueArr) {
        return LuaValue.rBoolean(true);
    }

    @LuaBridge
    public LuaValue[] switchToDiscoverTabbar(LuaValue[] luaValueArr) {
        C14822dsh.Companion.copydefault(copydefault(), null);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LuaValue[] getABTestValueForFlag(LuaValue[] luaValueArr) {
        String javaString;
        AmplitudeName amplitudeNameAEQbTJ;
        if (luaValueArr.length <= 0 || luaValueArr[0].isNil()) {
            javaString = "";
        } else {
            LuaValue luaValue = luaValueArr[0];
            if (luaValue instanceof LuaString) {
                javaString = luaValue.toJavaString();
            }
        }
        if (luaValueArr.length <= 1 || luaValueArr[1].isNil()) {
            amplitudeNameAEQbTJ = null;
        } else {
            LuaValue luaValue2 = luaValueArr[1];
            if (luaValue2 instanceof LuaString) {
                amplitudeNameAEQbTJ = AmplitudeName.Companion.AEQbTJ(luaValue2.toJavaString());
            }
        }
        if (amplitudeNameAEQbTJ == null) {
            amplitudeNameAEQbTJ = AmplitudeName.WEB3;
        }
        String strAEQbTJ = ABTestManager.AEQbTJ.AEQbTJ(javaString, amplitudeNameAEQbTJ);
        if (TextUtils.isEmpty(strAEQbTJ)) {
            return LuaValue.rNil();
        }
        return LuaValue.rString(strAEQbTJ);
    }

    @LuaBridge
    public LuaValue[] getDappHistory(LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader.copydefault(new UDNativeLoader.StateListAnimator() { // from class: com.okinc.business.defi.dapp.bridge.DappBridge.2
            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void OLrzqt() {
            }

            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void copydefault(final UDNativeLoader.Application application, UDNativeLoader.Activity activity) {
                C14923duc.EZpvd.gHZMYf().AEQbTJ(new InterfaceC58227yxM<List<DappSearchResultBean>>() { // from class: com.okinc.business.defi.dapp.bridge.DappBridge.2.5
                    /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                    @Override // o.InterfaceC58227yxM
                    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                    public void accept(List<DappSearchResultBean> list) {
                        Collections.reverse(list);
                        ArrayList arrayList = new ArrayList();
                        Iterator<DappSearchResultBean> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new UDDappHistory(DappBridge.this.globals, it.next()));
                        }
                        application.copydefault(new UDArray(DappBridge.this.globals, (List) arrayList));
                    }
                }, new InterfaceC58227yxM<Throwable>() { // from class: com.okinc.business.defi.dapp.bridge.DappBridge.2.1
                    /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                    @Override // o.InterfaceC58227yxM
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public void accept(Throwable th) throws Exception {
                    }
                });
            }
        });
        return LuaValue.varargsOf(C7910asj.KWHzl(this.globals, uDNativeLoader));
    }

    @LuaBridge
    public LuaValue[] getRecentAccess(LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader.copydefault(new UDNativeLoader.StateListAnimator() { // from class: com.okinc.business.defi.dapp.bridge.DappBridge.3
            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void OLrzqt() {
            }

            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void copydefault(final UDNativeLoader.Application application, UDNativeLoader.Activity activity) {
                C14923duc.EZpvd.zuBGHE().AEQbTJ(new InterfaceC58227yxM<List<DappSearchResultBean>>() { // from class: com.okinc.business.defi.dapp.bridge.DappBridge.3.2
                    /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                    @Override // o.InterfaceC58227yxM
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public void accept(List<DappSearchResultBean> list) {
                        Collections.reverse(list);
                        ArrayList arrayList = new ArrayList();
                        Iterator<DappSearchResultBean> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new UDDappHistory(DappBridge.this.globals, it.next()));
                        }
                        application.copydefault(new UDArray(DappBridge.this.globals, (List) arrayList));
                    }
                }, new InterfaceC58227yxM<Throwable>() { // from class: com.okinc.business.defi.dapp.bridge.DappBridge.3.3
                    /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                    @Override // o.InterfaceC58227yxM
                    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                    public void accept(Throwable th) throws Exception {
                    }
                });
            }
        });
        return LuaValue.varargsOf(C7910asj.KWHzl(this.globals, uDNativeLoader));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LuaValue[] removeRecentAccess(LuaValue[] luaValueArr) {
        if (luaValueArr.length >= 1) {
            LuaValue luaValue = luaValueArr[0];
            if (luaValue instanceof UDDappHistory) {
                DappSearchResultBean javaUserdata = ((UDDappHistory) luaValue).getJavaUserdata();
                if (luaValueArr.length >= 2) {
                    LuaValue luaValue2 = luaValueArr[1];
                    final LuaFunction luaFunction = luaValue2 instanceof LuaFunction ? (LuaFunction) luaValue2 : null;
                    if (javaUserdata != null && javaUserdata.getId() != null && !javaUserdata.getId().isEmpty() && !javaUserdata.getId().equals("0")) {
                        ((xWH) C43248rlh.KWHzl.AEQbTJ(xWH.class)).KWHzl(javaUserdata.getId()).OLrzqt(C58266yxz.OLrzqt()).AEQbTJ(new InterfaceC58227yxM() { // from class: o.dsz
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58227yxM
                            public final void accept(java.lang.Object obj) throws java.lang.Exception {
                                DappBridge.OLrzqt(luaFunction, (java.lang.Integer) obj);
                            }
                        }, new InterfaceC58227yxM() { // from class: o.dsD
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58227yxM
                            public final void accept(java.lang.Object obj) throws java.lang.Exception {
                                DappBridge.KWHzl(luaFunction, (java.lang.Throwable) obj);
                            }
                        });
                    } else if (luaFunction != null) {
                        luaFunction.invoke(new LuaValue[]{LuaBoolean.AEQbTJ(false)});
                    }
                }
            }
        }
        return LuaValue.rNil();
    }

    public static /* synthetic */ void OLrzqt(LuaFunction luaFunction, Integer num) throws Exception {
        if (luaFunction != null) {
            luaFunction.invoke(new LuaValue[]{LuaBoolean.AEQbTJ(true)});
        }
    }

    public static /* synthetic */ void KWHzl(LuaFunction luaFunction, Throwable th) throws Exception {
        if (luaFunction != null) {
            luaFunction.invoke(new LuaValue[]{LuaBoolean.AEQbTJ(false)});
        }
    }

    @LuaBridge
    public LuaValue[] clearDappAllHistory(LuaValue[] luaValueArr) {
        ((xWH) C43248rlh.KWHzl.AEQbTJ(xWH.class)).EZpvd().AEQbTJ(new InterfaceC58227yxM() { // from class: o.dsC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) throws java.lang.Exception {
                DappBridge.OLrzqt((java.lang.Integer) obj);
            }
        }, new InterfaceC58227yxM() { // from class: o.dsJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) throws java.lang.Exception {
                DappBridge.copydefault((java.lang.Throwable) obj);
            }
        });
        return LuaValue.rNil();
    }

    @LuaBridge
    public LuaValue[] deleteDappHistory(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            LuaValue luaValue = luaValueArr[0];
            if (luaValue instanceof UDDappHistory) {
                ((xWH) C43248rlh.KWHzl.AEQbTJ(xWH.class)).copydefault(((UDDappHistory) luaValue).getJavaUserdata()).AEQbTJ(new InterfaceC58227yxM() { // from class: o.dsx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) throws java.lang.Exception {
                        DappBridge.KWHzl((java.lang.Integer) obj);
                    }
                }, new InterfaceC58227yxM() { // from class: o.dsw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) throws java.lang.Exception {
                        DappBridge.KWHzl((java.lang.Throwable) obj);
                    }
                });
            }
        }
        return LuaValue.rNil();
    }

    @LuaBridge
    public LuaValue[] regexDeeplink(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            LuaValue luaValue = luaValueArr[0];
            if (luaValue instanceof LuaString) {
                String strDjBIcL = C15142dyj.EZpvd.djBIcL(luaValue.toJavaString());
                if (!TextUtils.isEmpty(strDjBIcL)) {
                    return LuaValue.rString(strDjBIcL);
                }
            }
        }
        return LuaValue.rNil();
    }

    @LuaBridge
    public LuaValue[] openSelectChainDialog(final LuaValue[] luaValueArr) {
        if (luaValueArr.length == 5) {
            long j = luaValueArr[0].toLong();
            final LuaFunction luaFunction = luaValueArr[1].toLuaFunction();
            ArrayList<DappChains> arrayList = (ArrayList) new Gson().fromJson(luaValueArr[2].toJavaString(), new TypeToken<ArrayList<DappChains>>() { // from class: com.okinc.business.defi.dapp.bridge.DappBridge.1
            }.getType());
            boolean z = luaValueArr[3].toBoolean();
            if (copydefault() != null && (copydefault() instanceof AbstractActivityC33041mov)) {
                C14851dtJ c14851dtJEZpvd = C14851dtJ.Companion.EZpvd(Long.valueOf(j), new Function2() { // from class: o.dsB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return DappBridge.EZpvd(luaFunction, (C14846dtE) obj, (java.lang.Integer) obj2);
                    }
                }, arrayList, z);
                c14851dtJEZpvd.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.dsE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(android.content.DialogInterface dialogInterface) {
                        DappBridge.EZpvd(luaValueArr, dialogInterface);
                    }
                });
                c14851dtJEZpvd.show(((AbstractActivityC33041mov) copydefault()).getSupportFragmentManager());
            }
        }
        return LuaValue.rNil();
    }

    public static /* synthetic */ Unit EZpvd(LuaFunction luaFunction, C14846dtE c14846dtE, Integer num) {
        luaFunction.invoke(LuaValue.varargsOf(LuaString.copydefault(String.valueOf(c14846dtE.copydefault())), LuaString.copydefault(c14846dtE.djBIcL()), LuaString.copydefault(c14846dtE.OLrzqt()), LuaString.copydefault(c14846dtE.KWHzl())));
        return null;
    }

    public static /* synthetic */ void EZpvd(LuaValue[] luaValueArr, DialogInterface dialogInterface) {
        luaValueArr[4].toLuaFunction().invoke(null);
    }

    public final void EZpvd() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannelM = NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4.m("discover_notification", "Discover Reminder Channel", 4);
            notificationChannelM.setDescription("Show Discover Reminder");
            ((NotificationManager) copydefault().getSystemService(RemoteMessageConst.NOTIFICATION)).createNotificationChannel(notificationChannelM);
        }
    }

    @LuaBridge
    public LuaValue[] startNotification(LuaValue[] luaValueArr) throws Throwable {
        WorkRequest workRequestBuild;
        EZpvd();
        String javaString = luaValueArr[0].toJavaString();
        long j = luaValueArr[1].toLong();
        String javaString2 = luaValueArr[2].toJavaString();
        int i = luaValueArr[3].toInt();
        String javaString3 = luaValueArr[4].toJavaString();
        int i2 = luaValueArr[5].toInt();
        String javaString4 = luaValueArr[6].toJavaString();
        luaValueArr[7].toLuaFunction().KWHzl(AEQbTJ(copydefault()));
        Data dataBuild = new Data.Builder().putString("title", javaString).putLong(CrashHianalyticsData.TIME, j).putString("dappUrl", javaString2).putString("desc", javaString3).putInt("id", i2).putString("dappName", javaString4).build();
        Constraints constraintsBuild = new Constraints.Builder().setRequiredNetworkType(NetworkType.NOT_REQUIRED).build();
        try {
            if (i == 0) {
                workRequestBuild = new OneTimeWorkRequest.Builder(NotificationWork.class).setInitialDelay(j - System.currentTimeMillis(), TimeUnit.MILLISECONDS).setInputData(dataBuild).setConstraints(constraintsBuild).addTag("discover_reminder" + i2).build();
            } else if (i == 1) {
                workRequestBuild = new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) NotificationWork.class, 1L, TimeUnit.DAYS).setInitialDelay(j - System.currentTimeMillis(), TimeUnit.MILLISECONDS).setInputData(dataBuild).setConstraints(constraintsBuild).addTag("discover_reminder" + i2).build();
            } else if (i == 2) {
                workRequestBuild = new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) NotificationWork.class, 7L, TimeUnit.DAYS).setInitialDelay(j - System.currentTimeMillis(), TimeUnit.MILLISECONDS).setInputData(dataBuild).setConstraints(constraintsBuild).addTag("discover_reminder" + i2).build();
            } else if (i == 3) {
                workRequestBuild = new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) NotificationWork.class, 30L, TimeUnit.DAYS).setInitialDelay(j - System.currentTimeMillis(), TimeUnit.MILLISECONDS).setInputData(dataBuild).setConstraints(constraintsBuild).addTag("discover_reminder" + i2).build();
            } else {
                workRequestBuild = null;
            }
            if (workRequestBuild != null) {
                pUU.EZpvd(LUA_CLASS_NAME, "enqueue called");
                WorkManager.getInstance().enqueue(workRequestBuild);
            }
        } catch (Exception e) {
            pUU.copydefault(LUA_CLASS_NAME, "Error creating or enqueuing work request: " + e.getMessage());
        }
        return LuaValue.rNil();
    }

    @LuaBridge
    public LuaValue[] cancelNotification(LuaValue[] luaValueArr) {
        int i = luaValueArr[0].toInt();
        try {
            WorkManager.getInstance().cancelAllWorkByTag("discover_reminder" + i);
            pUU.EZpvd(LUA_CLASS_NAME, "Successfully cancelled notification work with id: " + i);
        } catch (Exception e) {
            pUU.copydefault(LUA_CLASS_NAME, "Error cancelling notification work: " + e.getMessage());
        }
        return LuaValue.rNil();
    }

    public boolean AEQbTJ(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
        if (notificationManager != null) {
            return notificationManager.areNotificationsEnabled();
        }
        return false;
    }

    @LuaBridge
    public LuaValue[] getWebTabCount(LuaValue[] luaValueArr) {
        return LuaValue.rNumber(C15112dyF.AEQbTJ.djBIcL().size());
    }

    @LuaBridge
    public LuaValue[] discoverDBFilePath(LuaValue[] luaValueArr) {
        return LuaValue.rString("discover.db");
    }

    @LuaBridge
    public LuaValue[] openSettings(LuaValue[] luaValueArr) {
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 26) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", copydefault().getPackageName());
        } else {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", copydefault().getPackageName());
            intent.putExtra("app_uid", copydefault().getApplicationInfo().uid);
        }
        copydefault().startActivity(intent);
        return LuaValue.rNil();
    }

    @LuaBridge
    public LuaValue[] getNotificationAuth(LuaValue[] luaValueArr) {
        luaValueArr[0].toLuaFunction().KWHzl(AEQbTJ(copydefault()));
        return LuaValue.rNil();
    }

    @LuaBridge
    public LuaValue[] showBoostTab(LuaValue[] luaValueArr) {
        return LuaValue.rBoolean(((xWA) C43251rlk.KWHzl(xWA.class).get(0)).KWHzl());
    }

    @LuaBridge
    public LuaValue[] registerHashStatus(LuaValue[] luaValueArr) {
        luaValueArr[0].toJavaString();
        ComponentCallbacks2 componentCallbacks2Copydefault = copydefault();
        if (componentCallbacks2Copydefault instanceof LifecycleOwner) {
            C58156yvv.EZpvd(((InterfaceC9859bdY) C43248rlh.KWHzl.AEQbTJ(InterfaceC9859bdY.class)).gEmmrt(getClass().getSimpleName()), (LifecycleOwner) componentCallbacks2Copydefault).AEQbTJ(new InterfaceC58227yxM<C9921beh>() { // from class: com.okinc.business.defi.dapp.bridge.DappBridge.9
                /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                @Override // o.InterfaceC58227yxM
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public void accept(C9921beh c9921beh) {
                    pUU.copydefault("BoostPush", "postEvent transaction subscription:" + c9921beh.copydefault() + c9921beh.AEQbTJ());
                    InterfaceC7298ahG interfaceC7298ahGKWHzl = C7323ahf.KWHzl();
                    HashMap map = new HashMap();
                    map.put("txHash", c9921beh.copydefault());
                    map.put("txStatus", Integer.valueOf(c9921beh.AEQbTJ()));
                    interfaceC7298ahGKWHzl.AEQbTJ("DiscoverTxHashStatusEvent", null, map);
                }
            }, new InterfaceC58227yxM<Throwable>() { // from class: com.okinc.business.defi.dapp.bridge.DappBridge.8
                /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                @Override // o.InterfaceC58227yxM
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public void accept(Throwable th) throws Exception {
                }
            });
        }
        return LuaValue.rNil();
    }

    @LuaBridge
    public LuaValue[] registerCedefiHashStatus() {
        ComponentCallbacks2 componentCallbacks2Copydefault = copydefault();
        if (componentCallbacks2Copydefault instanceof LifecycleOwner) {
            pUU.copydefault("BoostPush", "registerCedefiHashStatus");
            C14795dsG.AEQbTJ.EZpvd((LifecycleOwner) componentCallbacks2Copydefault, new Function1<C9767bbm, Unit>() { // from class: com.okinc.business.defi.dapp.bridge.DappBridge.6
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public Unit invoke(C9767bbm c9767bbm) {
                    String strCopydefault = c9767bbm.copydefault();
                    OrderStatus orderStatusOLrzqt = c9767bbm.OLrzqt();
                    pUU.copydefault("BoostPush", "registerCedefiHashStatus postEvent transaction subscription:" + strCopydefault + orderStatusOLrzqt);
                    InterfaceC7298ahG interfaceC7298ahGKWHzl = C7323ahf.KWHzl();
                    HashMap map = new HashMap();
                    map.put("txHash", strCopydefault);
                    if (orderStatusOLrzqt != null) {
                        if (orderStatusOLrzqt.getValue() == OrderStatus.SUCCESS.getValue()) {
                            map.put("txStatus", 4);
                        } else if (orderStatusOLrzqt.getValue() == OrderStatus.FAILED.getValue()) {
                            map.put("txStatus", 3);
                        } else {
                            map.put("txStatus", Integer.valueOf(orderStatusOLrzqt.getValue()));
                        }
                    }
                    interfaceC7298ahGKWHzl.AEQbTJ("DiscoverTxHashStatusEvent", null, map);
                    return null;
                }
            });
        }
        return LuaValue.rNil();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(46:6|(4:202|7|(1:15)(1:13)|16)|19|(2:212|20)|(1:46)(44:24|207|25|(3:27|(1:32)(1:36)|(0)(1:(2:39|(1:41))(1:42)))(3:33|(1:35)(0)|(0)(0))|208|51|(39:59|196|63|(1:71)(1:69)|72|75|216|76|(1:84)(1:82)|85|200|88|(27:96|192|100|(1:106)|(23:(1:119)|194|121|(1:129)(1:127)|130|133|214|134|(1:140)|144|198|145|(1:157)(2:153|154)|210|158|(1:164)|168|204|169|(2:178|179)(3:175|(1:177)(0)|179)|206|182|(2:184|185)(3:186|190|191))(3:113|(1:116)|117)|120|194|121|(3:123|129|130)(0)|133|214|134|(3:136|138|140)|144|198|145|(2:147|157)(0)|210|158|(3:160|162|164)|168|204|169|(3:171|178|179)(0)|206|182|(0)(0))(1:94)|99|192|100|(3:102|104|106)|(2:111|(0))(0)|194|121|(0)(0)|133|214|134|(0)|144|198|145|(0)(0)|210|158|(0)|168|204|169|(0)(0)|206|182|(0)(0))(1:57)|62|196|63|(3:65|71|72)(0)|75|216|76|(3:78|84|85)(0)|200|88|(1:90)|96|192|100|(0)|(0)(0)|194|121|(0)(0)|133|214|134|(0)|144|198|145|(0)(0)|210|158|(0)|168|204|169|(0)(0)|206|182|(0)(0))|47|208|51|(1:53)|59|196|63|(0)(0)|75|216|76|(0)(0)|200|88|(0)|96|192|100|(0)|(0)(0)|194|121|(0)(0)|133|214|134|(0)|144|198|145|(0)(0)|210|158|(0)|168|204|169|(0)(0)|206|182|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(47:6|(4:202|7|(1:15)(1:13)|16)|19|212|20|(1:46)(44:24|207|25|(3:27|(1:32)(1:36)|(0)(1:(2:39|(1:41))(1:42)))(3:33|(1:35)(0)|(0)(0))|208|51|(39:59|196|63|(1:71)(1:69)|72|75|216|76|(1:84)(1:82)|85|200|88|(27:96|192|100|(1:106)|(23:(1:119)|194|121|(1:129)(1:127)|130|133|214|134|(1:140)|144|198|145|(1:157)(2:153|154)|210|158|(1:164)|168|204|169|(2:178|179)(3:175|(1:177)(0)|179)|206|182|(2:184|185)(3:186|190|191))(3:113|(1:116)|117)|120|194|121|(3:123|129|130)(0)|133|214|134|(3:136|138|140)|144|198|145|(2:147|157)(0)|210|158|(3:160|162|164)|168|204|169|(3:171|178|179)(0)|206|182|(0)(0))(1:94)|99|192|100|(3:102|104|106)|(2:111|(0))(0)|194|121|(0)(0)|133|214|134|(0)|144|198|145|(0)(0)|210|158|(0)|168|204|169|(0)(0)|206|182|(0)(0))(1:57)|62|196|63|(3:65|71|72)(0)|75|216|76|(3:78|84|85)(0)|200|88|(1:90)|96|192|100|(0)|(0)(0)|194|121|(0)(0)|133|214|134|(0)|144|198|145|(0)(0)|210|158|(0)|168|204|169|(0)(0)|206|182|(0)(0))|47|208|51|(1:53)|59|196|63|(0)(0)|75|216|76|(0)(0)|200|88|(0)|96|192|100|(0)|(0)(0)|194|121|(0)(0)|133|214|134|(0)|144|198|145|(0)(0)|210|158|(0)|168|204|169|(0)(0)|206|182|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(50:6|202|7|(1:15)(1:13)|16|19|212|20|(1:46)(44:24|207|25|(3:27|(1:32)(1:36)|(0)(1:(2:39|(1:41))(1:42)))(3:33|(1:35)(0)|(0)(0))|208|51|(39:59|196|63|(1:71)(1:69)|72|75|216|76|(1:84)(1:82)|85|200|88|(27:96|192|100|(1:106)|(23:(1:119)|194|121|(1:129)(1:127)|130|133|214|134|(1:140)|144|198|145|(1:157)(2:153|154)|210|158|(1:164)|168|204|169|(2:178|179)(3:175|(1:177)(0)|179)|206|182|(2:184|185)(3:186|190|191))(3:113|(1:116)|117)|120|194|121|(3:123|129|130)(0)|133|214|134|(3:136|138|140)|144|198|145|(2:147|157)(0)|210|158|(3:160|162|164)|168|204|169|(3:171|178|179)(0)|206|182|(0)(0))(1:94)|99|192|100|(3:102|104|106)|(2:111|(0))(0)|194|121|(0)(0)|133|214|134|(0)|144|198|145|(0)(0)|210|158|(0)|168|204|169|(0)(0)|206|182|(0)(0))(1:57)|62|196|63|(3:65|71|72)(0)|75|216|76|(3:78|84|85)(0)|200|88|(1:90)|96|192|100|(0)|(0)(0)|194|121|(0)(0)|133|214|134|(0)|144|198|145|(0)(0)|210|158|(0)|168|204|169|(0)(0)|206|182|(0)(0))|47|208|51|(1:53)|59|196|63|(0)(0)|75|216|76|(0)(0)|200|88|(0)|96|192|100|(0)|(0)(0)|194|121|(0)(0)|133|214|134|(0)|144|198|145|(0)(0)|210|158|(0)|168|204|169|(0)(0)|206|182|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0190, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0191, code lost:
    
        o.pUU.copydefault(com.okinc.business.defi.dapp.bridge.DappBridge.LUA_CLASS_NAME, "Error parsing popular chain IDs: " + r0.getMessage());
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01ec, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01ed, code lost:
    
        o.pUU.copydefault(com.okinc.business.defi.dapp.bridge.DappBridge.LUA_CLASS_NAME, "Error parsing business name: " + r0.getMessage());
        r13 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0222, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0223, code lost:
    
        o.pUU.copydefault(com.okinc.business.defi.dapp.bridge.DappBridge.LUA_CLASS_NAME, "Error parsing BRC20 flag: " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0258, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0259, code lost:
    
        o.pUU.copydefault(com.okinc.business.defi.dapp.bridge.DappBridge.LUA_CLASS_NAME, "Error parsing theme: " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0288, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0289, code lost:
    
        o.pUU.copydefault(com.okinc.business.defi.dapp.bridge.DappBridge.LUA_CLASS_NAME, "Error parsing title: " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02bf, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02c0, code lost:
    
        o.pUU.copydefault(com.okinc.business.defi.dapp.bridge.DappBridge.LUA_CLASS_NAME, "Error parsing 7702 tag: " + r0.getMessage());
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x031e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x031f, code lost:
    
        o.pUU.copydefault(com.okinc.business.defi.dapp.bridge.DappBridge.LUA_CLASS_NAME, "Error showing wallet switch screen: " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ba, code lost:
    
        o.pUU.copydefault(com.okinc.business.defi.dapp.bridge.DappBridge.LUA_CLASS_NAME, "Error parsing unsupported wallet types: " + r0.getMessage());
        r0 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00ea, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00eb, code lost:
    
        o.pUU.copydefault(com.okinc.business.defi.dapp.bridge.DappBridge.LUA_CLASS_NAME, "Error parsing filter function: " + r0.getMessage());
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0122, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0123, code lost:
    
        o.pUU.copydefault(com.okinc.business.defi.dapp.bridge.DappBridge.LUA_CLASS_NAME, "Error parsing chain ID: " + r0.getMessage());
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0157, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0158, code lost:
    
        o.pUU.copydefault(com.okinc.business.defi.dapp.bridge.DappBridge.LUA_CLASS_NAME, "Error parsing supported chain IDs: " + r0.getMessage());
        r0 = new java.util.ArrayList();
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x017a A[Catch: Exception -> 0x0190, TryCatch #0 {Exception -> 0x0190, blocks: (B:100:0x0176, B:102:0x017a, B:104:0x017e, B:106:0x0184), top: B:192:0x0176 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d8 A[Catch: Exception -> 0x01ec, TryCatch #1 {Exception -> 0x01ec, blocks: (B:121:0x01d4, B:123:0x01d8, B:125:0x01dc, B:127:0x01e2), top: B:194:0x01d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x020d A[Catch: Exception -> 0x0222, TryCatch #12 {Exception -> 0x0222, blocks: (B:134:0x0208, B:136:0x020d, B:138:0x0211, B:140:0x0217), top: B:214:0x0208 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0242 A[Catch: Exception -> 0x0258, TryCatch #3 {Exception -> 0x0258, blocks: (B:145:0x023d, B:147:0x0242, B:149:0x0246, B:151:0x024c, B:153:0x0254), top: B:198:0x023d }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0277 A[Catch: Exception -> 0x0288, TryCatch #10 {Exception -> 0x0288, blocks: (B:158:0x0272, B:160:0x0277, B:162:0x027b, B:164:0x0281), top: B:210:0x0272 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02a7 A[Catch: Exception -> 0x02bf, TryCatch #6 {Exception -> 0x02bf, blocks: (B:169:0x02a2, B:171:0x02a7, B:173:0x02ab, B:175:0x02b1), top: B:204:0x02a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02e2 A[Catch: Exception -> 0x031e, TryCatch #7 {Exception -> 0x031e, blocks: (B:182:0x02da, B:184:0x02e2, B:186:0x02ec), top: B:206:0x02da }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02ec A[Catch: Exception -> 0x031e, TRY_LEAVE, TryCatch #7 {Exception -> 0x031e, blocks: (B:182:0x02da, B:184:0x02e2, B:186:0x02ec), top: B:206:0x02da }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dc A[Catch: Exception -> 0x00ea, TryCatch #2 {Exception -> 0x00ea, blocks: (B:63:0x00d8, B:65:0x00dc, B:67:0x00e0, B:69:0x00e4), top: B:196:0x00d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010a A[Catch: Exception -> 0x0122, TryCatch #13 {Exception -> 0x0122, blocks: (B:76:0x0106, B:78:0x010a, B:80:0x010e, B:82:0x0114), top: B:216:0x0106 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0140 A[Catch: Exception -> 0x0157, TryCatch #4 {Exception -> 0x0157, blocks: (B:88:0x013c, B:90:0x0140, B:92:0x0144, B:94:0x014a), top: B:200:0x013c }] */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LuaValue[] selectWallet(LuaValue[] luaValueArr) {
        final LuaFunction luaFunction;
        final String javaString;
        CurrentWalletSelectMode walletSelectedById;
        List arrayList;
        final List list;
        List arrayList2;
        List list2;
        CurrentWalletSwitchNetworkMode singleNetwork;
        final Boolean boolValueOf;
        int i;
        AppCompatActivity appCompatActivity;
        int i2;
        LuaValue luaValue;
        LuaValue luaValue2;
        LuaValue luaValue3;
        LuaValue luaValue4;
        LuaValue luaValue5;
        LuaValue luaValue6;
        LuaValue luaValue7;
        LuaValue luaValue8;
        LuaValue luaValue9;
        LuaValue luaValue10;
        LuaValue luaValue11;
        byte b;
        LuaValue luaValue12;
        String javaString2 = "";
        if (luaValueArr == null) {
            return LuaValue.rNil();
        }
        List arrayList3 = null;
        try {
            luaFunction = (luaValueArr.length <= 0 || (luaValue12 = luaValueArr[0]) == null || !(luaValue12 instanceof LuaFunction)) ? null : (LuaFunction) luaValue12;
        } catch (Exception e) {
            pUU.copydefault(LUA_CLASS_NAME, "Error parsing wallet select callback: " + e.getMessage());
            luaFunction = null;
        }
        CurrentWalletSelectMode currentWalletSelectMode = CurrentWalletSelectMode.MainWalletSelected.KWHzl;
        try {
        } catch (Exception e2) {
            e = e2;
            javaString = null;
        }
        if (luaValueArr.length <= 1 || (luaValue11 = luaValueArr[1]) == null) {
            javaString = null;
        } else {
            javaString = luaValue11.toJavaString();
            try {
                int iHashCode = javaString.hashCode();
                if (iHashCode != 48) {
                    b = (iHashCode == 1444 && javaString.equals(MultiTransferSignData.DEFAULT_INTERVAL)) ? (byte) 1 : (byte) -1;
                    if (b != 0) {
                        if (b == 1) {
                            currentWalletSelectMode = CurrentWalletSelectMode.NoWalletSelected.EZpvd;
                        } else if (!TextUtils.isEmpty(javaString)) {
                            walletSelectedById = new CurrentWalletSelectMode.WalletSelectedById(javaString);
                        }
                    }
                } else {
                    if (javaString.equals("0")) {
                        b = 0;
                    }
                    if (b != 0) {
                    }
                }
            } catch (Exception e3) {
                e = e3;
                pUU.copydefault(LUA_CLASS_NAME, "Error parsing wallet ID: " + e.getMessage());
            }
            if (luaValueArr.length <= 2 && (luaValue10 = luaValueArr[2]) != null && !luaValue10.isNil()) {
                arrayList = C7910asj.OLrzqt(luaValueArr[2].toLuaTable());
            } else {
                list = null;
                final LuaFunction luaFunction2 = (luaValueArr.length <= 3 || (luaValue9 = luaValueArr[3]) == null || !(luaValue9 instanceof LuaFunction)) ? null : (LuaFunction) luaValue9;
                CurrentWalletSwitchNetworkMode currentWalletSwitchNetworkMode = CurrentWalletSwitchNetworkMode.Ignored.OLrzqt;
                Long lValueOf = (luaValueArr.length <= 4 || (luaValue8 = luaValueArr[4]) == null || luaValue8.isNil()) ? null : Long.valueOf(luaValueArr[4].toLong());
                if (luaValueArr.length <= 5 && (luaValue7 = luaValueArr[5]) != null && !luaValue7.isNil()) {
                    arrayList2 = ((UDArray) luaValueArr[5]).getJavaUserdata();
                } else {
                    list2 = null;
                    if (luaValueArr.length > 6 && (luaValue6 = luaValueArr[6]) != null && !luaValue6.isNil()) {
                        arrayList3 = ((UDArray) luaValueArr[6]).getJavaUserdata();
                    }
                    if (list2 == null && !list2.isEmpty()) {
                        long jLongValue = lValueOf.longValue();
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        singleNetwork = new CurrentWalletSwitchNetworkMode.MultipleNetworks(jLongValue, list2, arrayList3);
                    } else {
                        if (lValueOf != null) {
                            singleNetwork = new CurrentWalletSwitchNetworkMode.SingleNetwork(lValueOf.longValue());
                        }
                        String javaString3 = (luaValueArr.length <= 7 || (luaValue5 = luaValueArr[7]) == null || luaValue5.isNil()) ? "" : luaValueArr[7].toJavaString();
                        boolValueOf = Boolean.FALSE;
                        if (luaValueArr.length > 8 && (luaValue4 = luaValueArr[8]) != null && !luaValue4.isNil()) {
                            boolValueOf = Boolean.valueOf(luaValueArr[8].toBoolean());
                        }
                        ThemeType themeType = (luaValueArr.length <= 9 || (luaValue3 = luaValueArr[9]) == null || luaValue3.isNil() || !luaValueArr[9].toBoolean()) ? ThemeType.DEFAULT : ThemeType.NIGHT;
                        if (luaValueArr.length > 10 && (luaValue2 = luaValueArr[10]) != null && !luaValue2.isNil()) {
                            javaString2 = luaValueArr[10].toJavaString();
                        }
                        String str = javaString2;
                        if (luaValueArr.length <= 11 || (luaValue = luaValueArr[11]) == null || luaValue.isNil()) {
                            i2 = 0;
                            i = i2;
                        } else {
                            if (luaValueArr[11].toBoolean()) {
                                i2 = 1;
                            }
                            i = i2;
                        }
                        appCompatActivity = (AppCompatActivity) copydefault();
                        if (appCompatActivity == null) {
                            pUU.copydefault(LUA_CLASS_NAME, "Activity is null");
                            return LuaValue.rNil();
                        }
                        ((xWX) C43248rlh.KWHzl.AEQbTJ(xWX.class)).EZpvd(appCompatActivity.getSupportFragmentManager(), new CurrentWalletSwitchConfig(walletSelectedById, currentWalletSwitchNetworkMode, javaString3, str, themeType, i, null, new FunctionConfig()), new Function2() { // from class: o.dsA
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return DappBridge.EZpvd(boolValueOf, list, luaFunction2, (InterfaceC9738bbJ) obj, (java.lang.Long) obj2);
                            }
                        }, new ArrayList(), new InterfaceC54855xXv() { // from class: com.okinc.business.defi.dapp.bridge.DappBridge.7
                            @Override // o.InterfaceC54855xXv
                            public void KWHzl(@NonNull InterfaceC9738bbJ interfaceC9738bbJ, long j) {
                                try {
                                    LuaFunction luaFunction3 = luaFunction;
                                    if (luaFunction3 != null) {
                                        luaFunction3.invoke(LuaValue.varargsOf(LuaString.copydefault(interfaceC9738bbJ.DbNXlk()), LuaString.copydefault(String.valueOf(j))));
                                    }
                                } catch (Exception e4) {
                                    pUU.copydefault(DappBridge.LUA_CLASS_NAME, "Error in onWalletAndNetworkSwitched: " + e4.getMessage());
                                }
                            }

                            @Override // o.InterfaceC54855xXv
                            public void copydefault(@NonNull InterfaceC9738bbJ interfaceC9738bbJ) {
                                try {
                                    LuaFunction luaFunction3 = luaFunction;
                                    if (luaFunction3 != null) {
                                        luaFunction3.invoke(LuaValue.varargsOf(LuaString.copydefault(interfaceC9738bbJ.DbNXlk()), LuaValue.Nil()));
                                    }
                                } catch (Exception e4) {
                                    pUU.copydefault(DappBridge.LUA_CLASS_NAME, "Error in onWalletSwitched: " + e4.getMessage());
                                }
                            }

                            @Override // o.InterfaceC54855xXv
                            public void OLrzqt(long j) {
                                try {
                                    LuaFunction luaFunction3 = luaFunction;
                                    if (luaFunction3 != null) {
                                        luaFunction3.invoke(LuaValue.varargsOf(LuaValue.Nil(), LuaString.copydefault(String.valueOf(j))));
                                    }
                                } catch (Exception e4) {
                                    pUU.copydefault(DappBridge.LUA_CLASS_NAME, "Error in onNetworkSwitched: " + e4.getMessage());
                                }
                            }

                            @Override // o.InterfaceC54855xXv
                            public void copydefault() {
                                try {
                                    LuaFunction luaFunction3 = luaFunction;
                                    if (luaFunction3 != null) {
                                        luaFunction3.invoke(LuaValue.varargsOf(LuaValue.Nil(), LuaValue.Nil()));
                                    }
                                } catch (Exception e4) {
                                    pUU.copydefault(DappBridge.LUA_CLASS_NAME, "Error in onCancelled: " + e4.getMessage());
                                }
                            }

                            @Override // o.InterfaceC54855xXv
                            public void AEQbTJ(@NonNull InterfaceC9738bbJ interfaceC9738bbJ) {
                                LuaFunction luaFunction3;
                                try {
                                    if (!interfaceC9738bbJ.DbNXlk().equals(javaString) || (luaFunction3 = luaFunction) == null) {
                                        return;
                                    }
                                    luaFunction3.invoke(LuaValue.varargsOf(LuaString.copydefault(interfaceC9738bbJ.DbNXlk()), LuaValue.Nil()));
                                } catch (Exception e4) {
                                    pUU.copydefault(DappBridge.LUA_CLASS_NAME, "Error in onNetworkSwitched: " + e4.getMessage());
                                }
                            }
                        });
                        return LuaValue.rNil();
                    }
                    currentWalletSwitchNetworkMode = singleNetwork;
                    if (luaValueArr.length <= 7) {
                        String javaString32 = (luaValueArr.length <= 7 || (luaValue5 = luaValueArr[7]) == null || luaValue5.isNil()) ? "" : luaValueArr[7].toJavaString();
                    }
                    boolValueOf = Boolean.FALSE;
                    if (luaValueArr.length > 8) {
                        boolValueOf = Boolean.valueOf(luaValueArr[8].toBoolean());
                    }
                    if (luaValueArr.length <= 9) {
                    }
                    if (luaValueArr.length > 10) {
                        javaString2 = luaValueArr[10].toJavaString();
                    }
                    String str2 = javaString2;
                    if (luaValueArr.length <= 11) {
                        i2 = 0;
                        i = i2;
                    }
                    appCompatActivity = (AppCompatActivity) copydefault();
                    if (appCompatActivity == null) {
                    }
                }
                list2 = arrayList2;
                if (luaValueArr.length > 6) {
                    arrayList3 = ((UDArray) luaValueArr[6]).getJavaUserdata();
                }
                if (list2 == null) {
                    if (lValueOf != null) {
                    }
                }
                boolValueOf = Boolean.FALSE;
                if (luaValueArr.length > 8) {
                }
                if (luaValueArr.length <= 9) {
                }
                if (luaValueArr.length > 10) {
                }
                String str22 = javaString2;
                if (luaValueArr.length <= 11) {
                }
                appCompatActivity = (AppCompatActivity) copydefault();
                if (appCompatActivity == null) {
                }
            }
            list = arrayList;
            if (luaValueArr.length <= 3) {
                final LuaFunction luaFunction22 = (luaValueArr.length <= 3 || (luaValue9 = luaValueArr[3]) == null || !(luaValue9 instanceof LuaFunction)) ? null : (LuaFunction) luaValue9;
            }
            CurrentWalletSwitchNetworkMode currentWalletSwitchNetworkMode2 = CurrentWalletSwitchNetworkMode.Ignored.OLrzqt;
            if (luaValueArr.length <= 4) {
                Long lValueOf2 = (luaValueArr.length <= 4 || (luaValue8 = luaValueArr[4]) == null || luaValue8.isNil()) ? null : Long.valueOf(luaValueArr[4].toLong());
            }
            if (luaValueArr.length <= 5) {
            }
            list2 = null;
            if (luaValueArr.length > 6) {
            }
            if (list2 == null) {
            }
            boolValueOf = Boolean.FALSE;
            if (luaValueArr.length > 8) {
            }
            if (luaValueArr.length <= 9) {
            }
            if (luaValueArr.length > 10) {
            }
            String str222 = javaString2;
            if (luaValueArr.length <= 11) {
            }
            appCompatActivity = (AppCompatActivity) copydefault();
            if (appCompatActivity == null) {
            }
        }
        walletSelectedById = currentWalletSelectMode;
        if (luaValueArr.length <= 2) {
        }
        list = null;
        CurrentWalletSwitchNetworkMode currentWalletSwitchNetworkMode22 = CurrentWalletSwitchNetworkMode.Ignored.OLrzqt;
        if (luaValueArr.length <= 5) {
        }
        list2 = null;
        if (luaValueArr.length > 6) {
        }
        if (list2 == null) {
        }
        boolValueOf = Boolean.FALSE;
        if (luaValueArr.length > 8) {
        }
        if (luaValueArr.length <= 9) {
        }
        if (luaValueArr.length > 10) {
        }
        String str2222 = javaString2;
        if (luaValueArr.length <= 11) {
        }
        appCompatActivity = (AppCompatActivity) copydefault();
        if (appCompatActivity == null) {
        }
    }

    public static /* synthetic */ Boolean EZpvd(Boolean bool, List list, final LuaFunction luaFunction, final InterfaceC9738bbJ interfaceC9738bbJ, final Long l) {
        LuaValue luaValue;
        try {
            if (bool.booleanValue() && C15114dyH.AEQbTJ(l.longValue()) && !C15196dzk.KWHzl.copydefault(interfaceC9738bbJ, l.longValue())) {
                return Boolean.FALSE;
            }
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).gEmmrt().OLrzqt(interfaceC9738bbJ, ((Integer) it.next()).intValue())) {
                        return Boolean.FALSE;
                    }
                }
            }
            if (luaFunction != null) {
                try {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        LuaValue[] luaValueArr = new LuaValue[2];
                        luaValueArr[0] = LuaString.copydefault(interfaceC9738bbJ.DbNXlk());
                        luaValueArr[1] = l != null ? LuaString.copydefault(String.valueOf(l)) : LuaValue.Nil();
                        LuaValue[] luaValueArrInvoke = luaFunction.invoke(LuaValue.varargsOf(luaValueArr));
                        if (luaValueArrInvoke != null && luaValueArrInvoke.length > 0 && (luaValue = luaValueArrInvoke[0]) != null) {
                            return Boolean.valueOf(luaValue.toBoolean());
                        }
                    } else {
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o.dsF
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // java.lang.Runnable
                            public final void run() {
                                DappBridge.copydefault(luaFunction, interfaceC9738bbJ, l, atomicBoolean, countDownLatch);
                            }
                        });
                        countDownLatch.await();
                        return Boolean.valueOf(atomicBoolean.get());
                    }
                } catch (Exception e) {
                    pUU.copydefault(LUA_CLASS_NAME, "Error invoking filter function: " + e.getMessage());
                }
            }
            return Boolean.TRUE;
        } catch (Exception e2) {
            pUU.copydefault(LUA_CLASS_NAME, "Error in wallet filter: " + e2.getMessage());
            return Boolean.FALSE;
        }
    }

    public static /* synthetic */ void copydefault(LuaFunction luaFunction, InterfaceC9738bbJ interfaceC9738bbJ, Long l, AtomicBoolean atomicBoolean, CountDownLatch countDownLatch) {
        LuaValue luaValue;
        try {
            try {
                LuaValue[] luaValueArr = new LuaValue[2];
                luaValueArr[0] = LuaString.copydefault(interfaceC9738bbJ.DbNXlk());
                luaValueArr[1] = l != null ? LuaString.copydefault(String.valueOf(l)) : LuaValue.Nil();
                LuaValue[] luaValueArrInvoke = luaFunction.invoke(LuaValue.varargsOf(luaValueArr));
                if (luaValueArrInvoke != null && luaValueArrInvoke.length > 0 && (luaValue = luaValueArrInvoke[0]) != null) {
                    atomicBoolean.set(luaValue.toBoolean());
                }
            } catch (Exception e) {
                pUU.copydefault(LUA_CLASS_NAME, "Error invoking filter function: " + e.getMessage());
            }
        } finally {
            countDownLatch.countDown();
        }
    }

    @LuaBridge
    public LuaValue[] isAppInstalled(LuaValue[] luaValueArr) {
        try {
            C32979mnm.EZpvd.OLrzqt().getPackageManager().getPackageInfo(luaValueArr[0].toJavaString(), 0);
            return LuaValue.rBoolean(true);
        } catch (PackageManager.NameNotFoundException unused) {
            return LuaValue.rBoolean(false);
        }
    }

    @LuaBridge
    public void openDappNewHomePage(String str, int i, String str2) {
        FragmentManager fragmentManagerCopydefault;
        Integer numAEQbTJ;
        try {
            Activity activityCopydefault = copydefault();
            if (activityCopydefault != null) {
                if (str == null || TextUtils.isEmpty(str)) {
                    fragmentManagerCopydefault = null;
                    numAEQbTJ = null;
                } else {
                    C15148dyp c15148dyp = C15148dyp.copydefault;
                    fragmentManagerCopydefault = c15148dyp.copydefault(str);
                    numAEQbTJ = c15148dyp.AEQbTJ(str);
                }
                new C15099dxt().AEQbTJ(activityCopydefault, fragmentManagerCopydefault, numAEQbTJ, i, str2);
            }
        } catch (Throwable th) {
            pUU.copydefault(LUA_CLASS_NAME, "Error opening DApp new home page: " + th.getMessage());
        }
    }

    @LuaBridge
    public LuaValue[] getTimeZoneOffset(LuaValue[] luaValueArr) {
        return LuaValue.rString(String.valueOf(TimeZone.getDefault().getRawOffset() / 3600000));
    }
}
