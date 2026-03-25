package com.okinc.nft.nftmarket;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import androidx.camera.video.AudioStats;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.immomo.mls.fun.constants.FileInfo;
import com.immomo.mls.fun.ud.UDArray;
import com.immomo.mls.fun.ud.UDNativeLoader;
import com.immomo.mls.fun.ud.view.UDView;
import com.okinc.base.bugreport.DetectionInfoBean;
import com.okinc.base.utils.commmon.ThreadUtils;
import com.okinc.business.appupdate.api.AppUpdateService;
import com.okinc.business.appupdate.api.IUpdateStateChange;
import com.okinc.business.defi.api.constant.ChainRegisterStatus;
import com.okinc.business.defi.share.Web3ShareService;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.mln_ui.ui.okkit.UDGoPageBridge;
import com.okinc.nft.model.NFTFile2HexModel;
import com.okinc.nft.nftmarket.NFTBridge;
import com.okinc.nft.push.PayLoad;
import com.okinc.nft.push.TokenAsset;
import com.okinc.rxutils.RxBus;
import com.okinc.wallet.api.bean.WalletRechargeBean;
import com.okinc.wallet.api.bean.WalletRechargeResult;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.function.BiConsumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.AbstractActivityC33041mov;
import o.AbstractC58247yxg;
import o.C43246rlf;
import o.C43248rlh;
import o.C43491rqL;
import o.C43551rrS;
import o.C43650rtL;
import o.C43654rtP;
import o.C54819xWm;
import o.C58266yxz;
import o.C7322ahe;
import o.C7863arp;
import o.C7869arv;
import o.C7910asj;
import o.InterfaceC33167mrO;
import o.InterfaceC54829xWw;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC58249yxi;
import o.InterfaceC58251yxk;
import o.InterfaceC9844bdJ;
import o.InterfaceC9851bdQ;
import o.gKO;
import o.gKX;
import o.gKY;
import o.pTA;
import o.xVX;
import o.xWO;
import o.xWS;
import o.xYW;
import o.yBP;
import o.yCN;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaBoolean;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes9.dex */
@LuaClass
public class NFTBridge {
    public static final String LUA_CLASS_NAME = "OKNFTBridge";
    public static boolean isOpenOnDrawListener = false;
    public static boolean isShowPending = false;
    public static ViewGroup sContainer = null;
    public static String txHash = "";
    public InterfaceC58217yxC gasClosedDisposable;
    public InterfaceC58217yxC gasSuccessDisposable;
    public Globals globals;
    public AppUpdateService mUpdateService = null;
    public IUpdateStateChange mUpdateStateCallback = null;
    public LuaFunction saveImageCallback;
    public static final ArrayList<LuaFunction> mProgressChangedCallbacks = new ArrayList<>();
    public static final HashMap<String, LuaFunction> sProgressCallbackMap = new HashMap<>();
    public static String sGuestAddress = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void EZpvd(String str) {
        sGuestAddress = str;
    }

    public NFTBridge(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
        this.globals = globals;
    }

    @LuaBridge
    public LuaValue[] setCurrentNFT(LuaValue[] luaValueArr) {
        if (luaValueArr.length < 2) {
            return null;
        }
        txHash = luaValueArr[0].toJavaString();
        isShowPending = luaValueArr[1].toBoolean();
        return null;
    }

    @LuaBridge
    public LuaValue[] postPushCheckerResult(LuaValue[] luaValueArr) {
        String javaString;
        String javaString2;
        int i = luaValueArr[0].toInt();
        int i2 = luaValueArr[1].toInt();
        String javaString3 = luaValueArr[2].toJavaString();
        if (javaString3 == null) {
            return null;
        }
        String javaString4 = luaValueArr[3].toJavaString();
        String javaString5 = luaValueArr[4].toJavaString();
        int i3 = luaValueArr[5].toInt();
        String javaString6 = luaValueArr[6].toJavaString();
        String javaString7 = luaValueArr[7].toJavaString();
        String javaString8 = luaValueArr.length > 8 ? luaValueArr[8].toJavaString() : null;
        String javaString9 = luaValueArr.length > 9 ? luaValueArr[9].toJavaString() : null;
        String str = (luaValueArr.length <= 10 || (javaString2 = luaValueArr[10].toJavaString()) == null) ? "" : javaString2;
        String str2 = (luaValueArr.length <= 11 || (javaString = luaValueArr[11].toJavaString()) == null) ? "" : javaString;
        if (javaString6 == null) {
            javaString6 = "";
        }
        C43491rqL.OLrzqt.AYXKKw(new TokenAsset(javaString3, javaString6, i, i3, i2, javaString7 != null ? javaString7 : "", str, Collections.emptyList(), javaString8, javaString9, str2), new PayLoad(javaString5 != null ? javaString5 : "", javaString4 != null ? javaString4 : "", "", "", ""));
        return null;
    }

    @LuaBridge
    public LuaValue[] saveUrlImage(LuaValue[] luaValueArr) {
        if (luaValueArr.length <= 0) {
            return null;
        }
        if (luaValueArr.length > 1) {
            this.saveImageCallback = luaValueArr[1].toLuaFunction();
        }
        C43551rrS.copydefault(luaValueArr[0].toJavaString(), C43246rlf.OLrzqt.valueOf(), this.saveImageCallback);
        return null;
    }

    @LuaBridge
    public LuaValue[] isOpenOnDrawListener(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr == null || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        isOpenOnDrawListener = luaValue.toBoolean();
        return null;
    }

    @LuaBridge
    public LuaValue[] setSearchContainer(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr == null || (luaValue = luaValueArr[0]) == null) {
            sContainer = null;
        } else {
            if (luaValue.isNil()) {
                sContainer = null;
                return null;
            }
            View viewF_ = ((UDView) luaValueArr[0]).f_();
            if (viewF_ instanceof ViewGroup) {
                sContainer = (ViewGroup) viewF_;
            }
        }
        return null;
    }

    @LuaBridge
    public LuaValue[] registerProgressChangedCallback(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr == null || luaValueArr.length <= 0 || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        mProgressChangedCallbacks.add((LuaFunction) luaValue);
        return null;
    }

    @LuaBridge
    public LuaValue[] addProgressChangedCallback(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr == null || luaValueArr.length <= 1 || (luaValue = luaValueArr[0]) == null || luaValueArr[1] == null) {
            return null;
        }
        sProgressCallbackMap.put(luaValue.toJavaString(), (LuaFunction) luaValueArr[1]);
        return null;
    }

    public static boolean KWHzl(String str) {
        return (str == null || str.isEmpty() || sProgressCallbackMap.remove(str) != null) ? false : true;
    }

    @LuaBridge
    public void dismissAll() {
        UDGoPageBridge.AEQbTJ();
        ((xWS) C43248rlh.KWHzl.AEQbTJ(xWS.class)).EZpvd(C54819xWm.KWHzl().AEQbTJ(), false, true);
    }

    @LuaBridge
    public void dismissAllExcept(String str) {
        UDGoPageBridge.OLrzqt(str);
        ((xWS) C43248rlh.KWHzl.AEQbTJ(xWS.class)).EZpvd(C54819xWm.KWHzl().AEQbTJ(), false, true);
    }

    @LuaBridge
    public LuaValue[] isShowTotalAsset() {
        return ((InterfaceC9851bdQ) C43248rlh.KWHzl.AEQbTJ(InterfaceC9851bdQ.class)).fetchVPNInfo() ? LuaValue.rTrue() : LuaValue.rFalse();
    }

    @LuaBridge
    public LuaValue[] apkIsInstalled(LuaValue[] luaValueArr) {
        Boolean bool = Boolean.FALSE;
        if (luaValueArr != null) {
            try {
                if (luaValueArr.length > 0) {
                    String javaString = luaValueArr[0].toJavaString();
                    if (!TextUtils.isEmpty(javaString) && copydefault().getPackageManager().getLaunchIntentForPackage(javaString) != null) {
                        bool = Boolean.TRUE;
                    }
                }
            } catch (Exception unused) {
                return LuaValue.rFalse();
            }
        }
        return bool.booleanValue() ? LuaValue.rTrue() : LuaValue.rFalse();
    }

    @LuaBridge
    public LuaValue[] openApkByPackageName(LuaValue[] luaValueArr) {
        Intent launchIntentForPackage;
        if (luaValueArr == null) {
            return null;
        }
        try {
            if (luaValueArr.length <= 0) {
                return null;
            }
            String javaString = luaValueArr[0].toJavaString();
            if (TextUtils.isEmpty(javaString) || (launchIntentForPackage = copydefault().getPackageManager().getLaunchIntentForPackage(javaString)) == null) {
                return null;
            }
            copydefault().startActivity(launchIntentForPackage);
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @LuaBridge
    public void checkGasStationStratageSupported(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 3) {
            return;
        }
        String javaString = luaValueArr[0].toJavaString();
        String javaString2 = luaValueArr[1].toJavaString();
        final LuaFunction luaFunction = luaValueArr[2].toLuaFunction();
        ((gKO) C43248rlh.KWHzl.OLrzqt(gKO.class)).KWHzl(javaString2, javaString).AEQbTJ(new InterfaceC58227yxM<Boolean>() { // from class: com.okinc.nft.nftmarket.NFTBridge.2
            /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
            @Override // o.InterfaceC58227yxM
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public void accept(Boolean bool) throws Exception {
                luaFunction.invoke(LuaValue.rBoolean(bool.booleanValue()));
            }
        });
    }

    @LuaBridge
    public void showGasStationPage(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 8) {
            return;
        }
        String javaString = luaValueArr[0].toJavaString();
        String javaString2 = luaValueArr[1].toJavaString();
        luaValueArr[2].toJavaString();
        String javaString3 = luaValueArr[3].toJavaString();
        String javaString4 = luaValueArr[4].toJavaString();
        String javaString5 = luaValueArr[5].toJavaString();
        final LuaFunction luaFunction = luaValueArr[6].toLuaFunction();
        final LuaFunction luaFunction2 = luaValueArr[7].toLuaFunction();
        if (copydefault() instanceof FragmentActivity) {
            AEQbTJ();
            this.gasSuccessDisposable = RxBus.KWHzl(gKX.class, new String[0]).AEQbTJ((InterfaceC58227yxM) new InterfaceC58227yxM<gKX>() { // from class: com.okinc.nft.nftmarket.NFTBridge.5
                /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                @Override // o.InterfaceC58227yxM
                /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                public void accept(gKX gkx) throws Exception {
                    luaFunction2.invoke(null);
                    NFTBridge.this.AEQbTJ();
                }
            });
            this.gasClosedDisposable = RxBus.KWHzl(gKY.class, new String[0]).AEQbTJ((InterfaceC58227yxM) new InterfaceC58227yxM<gKY>() { // from class: com.okinc.nft.nftmarket.NFTBridge.10
                /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                @Override // o.InterfaceC58227yxM
                /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                public void accept(gKY gky) throws Exception {
                    luaFunction.invoke(null);
                    NFTBridge.this.AEQbTJ();
                }
            });
            ((gKO) C43248rlh.KWHzl.OLrzqt(gKO.class)).AEQbTJ((FragmentActivity) copydefault(), javaString4, javaString, javaString2, javaString3, javaString5);
        }
    }

    public final void AEQbTJ() {
        InterfaceC58217yxC interfaceC58217yxC = this.gasSuccessDisposable;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
            this.gasSuccessDisposable = null;
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.gasClosedDisposable;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
            this.gasClosedDisposable = null;
        }
    }

    public Activity copydefault() {
        C7322ahe c7322ahe = (C7322ahe) this.globals.AuCTel();
        Context context = c7322ahe != null ? c7322ahe.AEQbTJ : null;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    public static void EZpvd(final float f) {
        ArrayList<LuaFunction> arrayList = mProgressChangedCallbacks;
        if (!arrayList.isEmpty()) {
            Iterator<LuaFunction> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().invoke(LuaValue.rNumber(f));
            }
        }
        HashMap<String, LuaFunction> map = sProgressCallbackMap;
        if (map.isEmpty()) {
            return;
        }
        map.forEach(new BiConsumer() { // from class: o.rqr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                NFTBridge.OLrzqt(f, (java.lang.String) obj, (LuaFunction) obj2);
            }
        });
    }

    public static /* synthetic */ void OLrzqt(float f, String str, LuaFunction luaFunction) {
        luaFunction.invoke(LuaValue.rNumber(f));
    }

    public static void OLrzqt() {
        mProgressChangedCallbacks.clear();
    }

    public static void KWHzl() {
        sProgressCallbackMap.clear();
    }

    @LuaBridge
    public void showSupplementList(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 9) {
            return;
        }
        String javaString = luaValueArr[0].toJavaString();
        String javaString2 = luaValueArr[1].toJavaString();
        String javaString3 = luaValueArr[2].toJavaString();
        boolean z = luaValueArr[3].toBoolean();
        String javaString4 = luaValueArr[4].toJavaString();
        LuaValue luaValue = luaValueArr[5];
        LuaFunction luaFunction = null;
        ArrayList arrayList = (luaValue == null || luaValue.isNil() || !(luaValue instanceof UDArray)) ? null : (ArrayList) ((UDArray) luaValue).EZpvd();
        LuaValue luaValue2 = luaValueArr[6];
        ArrayList arrayList2 = (luaValue2 == null || luaValue2.isNil() || !(luaValue2 instanceof UDArray)) ? null : (ArrayList) ((UDArray) luaValue2).EZpvd();
        LuaValue luaValue3 = luaValueArr[7];
        if (luaValue3 != null && !luaValue3.isNil()) {
            luaFunction = luaValue3.toLuaFunction();
        }
        final LuaFunction luaFunction2 = luaFunction;
        int i = luaValueArr[8].toInt();
        Activity activityCopydefault = copydefault();
        if (activityCopydefault instanceof AbstractActivityC33041mov) {
            InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43248rlh.KWHzl.OLrzqt(InterfaceC54829xWw.class);
            WalletRechargeBean walletRechargeBean = new WalletRechargeBean(javaString, javaString2, "nft", javaString3, arrayList2, arrayList, z, javaString4, i);
            if (interfaceC54829xWw != null) {
                interfaceC54829xWw.EZpvd((AbstractActivityC33041mov) activityCopydefault, walletRechargeBean, -1, new Function1<WalletRechargeResult, Unit>() { // from class: com.okinc.nft.nftmarket.NFTBridge.8
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                    public Unit invoke(WalletRechargeResult walletRechargeResult) {
                        LuaFunction luaFunction3 = luaFunction2;
                        if (luaFunction3 != null) {
                            if (walletRechargeResult != null) {
                                luaFunction3.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(walletRechargeResult.isSubmit())));
                            } else {
                                luaFunction3.invoke(null);
                            }
                        }
                        return null;
                    }
                });
            }
        }
    }

    @LuaBridge
    public void showRechargeDialog(LuaValue[] luaValueArr) {
        InterfaceC54829xWw interfaceC54829xWw;
        LuaValue luaValue;
        final LuaFunction luaFunction = (luaValueArr == null || luaValueArr.length < 1 || (luaValue = luaValueArr[0]) == null || luaValue.isNil()) ? null : luaValue.toLuaFunction();
        Activity activityCopydefault = copydefault();
        if (!(activityCopydefault instanceof AbstractActivityC33041mov) || (interfaceC54829xWw = (InterfaceC54829xWw) C43248rlh.KWHzl.OLrzqt(InterfaceC54829xWw.class)) == null) {
            return;
        }
        interfaceC54829xWw.copydefault((AbstractActivityC33041mov) activityCopydefault, new Function1<WalletRechargeResult, Unit>() { // from class: com.okinc.nft.nftmarket.NFTBridge.6
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public Unit invoke(WalletRechargeResult walletRechargeResult) {
                LuaFunction luaFunction2 = luaFunction;
                if (luaFunction2 != null) {
                    if (walletRechargeResult != null) {
                        luaFunction2.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(walletRechargeResult.isSubmit())));
                    } else {
                        luaFunction2.invoke(null);
                    }
                }
                return null;
            }
        });
    }

    /* JADX INFO: renamed from: com.okinc.nft.nftmarket.NFTBridge$7, reason: invalid class name */
    public class AnonymousClass7 implements UDNativeLoader.StateListAnimator {
        public InterfaceC58217yxC EZpvd = null;
        public final /* synthetic */ String copydefault;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public AnonymousClass7(String str) {
            this.copydefault = str;
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void copydefault(final UDNativeLoader.Application application, UDNativeLoader.Activity activity) {
            this.EZpvd = ((xWO) C43248rlh.KWHzl.AEQbTJ(xWO.class)).g_(this.copydefault).AEQbTJ(new InterfaceC58227yxM() { // from class: o.rqo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) throws java.lang.Exception {
                    NFTBridge.AnonymousClass7.copydefault(application, (java.lang.String) obj);
                }
            }, new InterfaceC58227yxM() { // from class: o.rqp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) throws java.lang.Exception {
                    NFTBridge.AnonymousClass7.OLrzqt(application, (java.lang.Throwable) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void copydefault(UDNativeLoader.Application application, String str) throws Exception {
            application.copydefault(LuaString.copydefault(str));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void OLrzqt(UDNativeLoader.Application application, Throwable th) throws Exception {
            application.copydefault(LuaString.copydefault(""));
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void OLrzqt() {
            InterfaceC58217yxC interfaceC58217yxC = this.EZpvd;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
        }
    }

    @LuaBridge
    public UDNativeLoader getEncryptSignFromWallet(String str) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, (Object) null);
        uDNativeLoader.copydefault(new AnonymousClass7(str));
        return uDNativeLoader;
    }

    @LuaBridge
    public LuaValue[] checkIsRunningInEmulator() {
        Boolean boolValueOf = Boolean.FALSE;
        DetectionInfoBean detectionInfoBeanCopydefault = ((InterfaceC33167mrO) C43248rlh.KWHzl.AEQbTJ(InterfaceC33167mrO.class)).copydefault();
        if (detectionInfoBeanCopydefault != null) {
            boolValueOf = Boolean.valueOf(detectionInfoBeanCopydefault.isRunningInEmulator || detectionInfoBeanCopydefault.isRunningInVirtualEnvironment);
        }
        return LuaValue.varargsOf(LuaBoolean.AEQbTJ(boolValueOf.booleanValue()));
    }

    @LuaBridge
    public LuaValue getGuardReport() {
        try {
            return C7869arv.copydefault(this.globals, JsonParser.parseString(new Gson().toJson(((InterfaceC33167mrO) C43248rlh.KWHzl.AEQbTJ(InterfaceC33167mrO.class)).copydefault())).getAsJsonObject());
        } catch (Exception unused) {
            return LuaTable.AEQbTJ(this.globals);
        }
    }

    @LuaBridge
    public LuaValue[] base64Encoding(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr == null || luaValueArr.length < 1) {
            return LuaValue.rNil();
        }
        String javaString = luaValueArr[0].toJavaString();
        if (javaString.isEmpty()) {
            return LuaValue.rString("");
        }
        if (luaValueArr.length > 1 && (luaValue = luaValueArr[1]) != null && luaValue.toBoolean()) {
            return LuaValue.rString(xYW.AEQbTJ.fetchVPNInfo(javaString));
        }
        return LuaValue.rString(new String(Base64.encode(javaString.getBytes(StandardCharsets.UTF_8), 2)));
    }

    @LuaBridge
    public LuaValue[] base64Decoding(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr == null || luaValueArr.length < 1) {
            return LuaValue.rNil();
        }
        String javaString = luaValueArr[0].toJavaString();
        if (javaString.isEmpty()) {
            return LuaValue.rString("");
        }
        boolean z = (luaValueArr.length <= 1 || (luaValue = luaValueArr[1]) == null) ? false : luaValue.toBoolean();
        byte[] bArrDecode = Base64.decode(javaString.getBytes(StandardCharsets.UTF_8), 2);
        if (z) {
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDecode) {
                sb.append(String.format("%02X", Byte.valueOf(b)));
            }
            return LuaValue.rString(sb.toString());
        }
        return LuaValue.rString(new String(bArrDecode));
    }

    @LuaBridge
    public LuaValue[] walletRequestHeader(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C7910asj.EZpvd(this.globals, ((xWO) C43248rlh.KWHzl.AEQbTJ(xWO.class)).aM_()));
    }

    @LuaBridge
    public LuaValue[] goToMap(LuaValue[] luaValueArr) {
        String javaString = luaValueArr.length > 0 ? luaValueArr[0].toJavaString() : "";
        String javaString2 = luaValueArr.length > 1 ? luaValueArr[1].toJavaString() : "";
        LuaFunction luaFunction = luaValueArr.length > 2 ? luaValueArr[2].toLuaFunction() : null;
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:" + javaString + "," + javaString2));
            intent.setPackage("com.google.android.apps.maps");
            EZpvd(this.globals).startActivity(intent);
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.rTrue());
            }
        } catch (Exception unused) {
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.rFalse());
            }
        }
        return LuaValue.rNil();
    }

    @LuaBridge
    public LuaValue[] addEventToCalendar(LuaValue[] luaValueArr) {
        String javaString = luaValueArr.length > 0 ? luaValueArr[0].toJavaString() : "";
        String javaString2 = luaValueArr.length > 1 ? luaValueArr[1].toJavaString() : "";
        long j = luaValueArr.length > 2 ? luaValueArr[2].toLong() : 0L;
        long j2 = luaValueArr.length > 3 ? luaValueArr[3].toLong() : 0L;
        String javaString3 = luaValueArr.length > 4 ? luaValueArr[4].toJavaString() : "";
        if (luaValueArr.length > 5) {
            luaValueArr[5].toJavaString();
        }
        Integer numValueOf = luaValueArr.length > 6 ? Integer.valueOf(luaValueArr[6].toInt()) : null;
        Long lValueOf = luaValueArr.length > 7 ? Long.valueOf(luaValueArr[7].toLong()) : null;
        LuaFunction luaFunction = luaValueArr.length > 8 ? luaValueArr[8].toLuaFunction() : null;
        boolean zOLrzqt = C43650rtL.EZpvd.OLrzqt(EZpvd(this.globals), javaString, javaString2, j, j2, javaString3, numValueOf, lValueOf);
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.rBoolean(zOLrzqt));
        }
        return LuaValue.rNil();
    }

    public Context EZpvd(@NonNull Globals globals) {
        C7322ahe c7322ahe = (C7322ahe) globals.AuCTel();
        if (c7322ahe != null) {
            return c7322ahe.AEQbTJ;
        }
        return null;
    }

    /* JADX INFO: renamed from: com.okinc.nft.nftmarket.NFTBridge$9, reason: invalid class name */
    /* JADX INFO: loaded from: classes23.dex */
    public class AnonymousClass9 implements UDNativeLoader.StateListAnimator {
        public final /* synthetic */ Boolean AEQbTJ;
        public final /* synthetic */ String OLrzqt;
        public InterfaceC58217yxC copydefault = null;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public AnonymousClass9(String str, Boolean bool) {
            this.OLrzqt = str;
            this.AEQbTJ = bool;
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void copydefault(final UDNativeLoader.Application application, final UDNativeLoader.Activity activity) {
            final String str = this.OLrzqt;
            final Boolean bool = this.AEQbTJ;
            this.copydefault = AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.rqn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58249yxi
                public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) throws java.lang.Exception {
                    this.EZpvd.OLrzqt(str, bool, interfaceC58251yxk);
                }
            }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt()).doOnNext(new InterfaceC58227yxM<NFTFile2HexModel>() { // from class: com.okinc.nft.nftmarket.NFTBridge.9.4
                /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                @Override // o.InterfaceC58227yxM
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public void accept(NFTFile2HexModel nFTFile2HexModel) {
                    application.copydefault(C7869arv.copydefault(NFTBridge.this.globals, JsonParser.parseString(new Gson().toJson(nFTFile2HexModel)).getAsJsonObject()));
                }
            }).doOnError(new InterfaceC58227yxM<Throwable>() { // from class: com.okinc.nft.nftmarket.NFTBridge.9.1
                /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                @Override // o.InterfaceC58227yxM
                /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                public void accept(Throwable th) {
                    activity.KWHzl(-1, "");
                }
            }).subscribe();
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00ad A[PHI: r1 r5 r9
  0x00ad: PHI (r1v1 java.lang.String) = (r1v0 java.lang.String), (r1v8 java.lang.String) binds: [B:29:0x00ab, B:25:0x00a4] A[DONT_GENERATE, DONT_INLINE]
  0x00ad: PHI (r5v2 long) = (r5v0 long), (r5v9 long) binds: [B:29:0x00ab, B:25:0x00a4] A[DONT_GENERATE, DONT_INLINE]
  0x00ad: PHI (r9v3 android.database.Cursor) = (r9v2 android.database.Cursor), (r9v5 android.database.Cursor) binds: [B:29:0x00ab, B:25:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final /* synthetic */ void OLrzqt(String str, Boolean bool, InterfaceC58251yxk interfaceC58251yxk) throws Exception {
            Cursor cursorQuery;
            String str2 = "";
            if (str.startsWith("content://") || str.startsWith("file://")) {
                Uri uri = Uri.parse(str);
                NFTBridge nFTBridge = NFTBridge.this;
                ContentResolver contentResolver = nFTBridge.EZpvd(nFTBridge.globals).getContentResolver();
                try {
                    cursorQuery = contentResolver.query(uri, null, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                int columnIndex = cursorQuery.getColumnIndex("_display_name");
                                int columnIndex2 = cursorQuery.getColumnIndex(FileInfo.FileSize);
                                String string = columnIndex >= 0 ? cursorQuery.getString(columnIndex) : "";
                                if (bool.booleanValue() && columnIndex2 >= 0) {
                                    length = cursorQuery.getLong(columnIndex2);
                                }
                                str2 = string;
                            }
                        } catch (Throwable unused) {
                            if (cursorQuery != null) {
                            }
                        }
                    }
                } catch (Throwable unused2) {
                    cursorQuery = null;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                long j = length;
                String str3 = str2;
                InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                if (inputStreamOpenInputStream == null) {
                    throw new IOException("Cannot open input stream for URI: " + uri);
                }
                byte[] bArrKWHzl = NFTBridge.this.KWHzl(inputStreamOpenInputStream);
                inputStreamOpenInputStream.close();
                interfaceC58251yxk.onNext(new NFTFile2HexModel(Base64.encodeToString(bArrKWHzl, 2), str3, str, j, xVX.AEQbTJ(bArrKWHzl)));
                return;
            }
            File file = new File(str);
            byte[] bArr = new byte[(int) file.length()];
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(bArr);
            String strAEQbTJ = xVX.AEQbTJ(bArr);
            String strEncodeToString = Base64.encodeToString(bArr, 2);
            length = bool.booleanValue() ? file.length() : 0L;
            String name = file.getName();
            fileInputStream.close();
            interfaceC58251yxk.onNext(new NFTFile2HexModel(strEncodeToString, name, file.getAbsolutePath(), length, strAEQbTJ));
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void OLrzqt() {
            InterfaceC58217yxC interfaceC58217yxC = this.copydefault;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
        }
    }

    @LuaBridge
    public UDNativeLoader getFileDecodedInfo(String str, Boolean bool) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, (Object) null);
        uDNativeLoader.copydefault(new AnonymousClass9(str, bool));
        return uDNativeLoader;
    }

    public final byte[] KWHzl(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    @LuaBridge
    public LuaValue[] simpleYYYYMMddHHmmWithTimeZone(LuaValue[] luaValueArr) {
        Long lOLrzqt = OLrzqt(luaValueArr);
        if (lOLrzqt == null) {
            return LuaValue.rNil();
        }
        TimeZone timeZoneOLrzqt = TimeZone.getDefault();
        if (luaValueArr.length > 1) {
            timeZoneOLrzqt = yCN.OLrzqt(luaValueArr[1].toJavaString());
        }
        return LuaValue.rString(pTA.copydefault(new Date(lOLrzqt.longValue()), OKDateEnum.DATE_FORMAT_STANDARD, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, Locale.getDefault(), timeZoneOLrzqt, luaValueArr.length > 2 ? luaValueArr[2].toBoolean() : true));
    }

    @LuaBridge
    public LuaValue[] simpleYYYYMMddWithTimeZone(LuaValue[] luaValueArr) {
        Long lOLrzqt = OLrzqt(luaValueArr);
        if (lOLrzqt == null) {
            return LuaValue.rNil();
        }
        TimeZone timeZoneOLrzqt = TimeZone.getDefault();
        if (luaValueArr.length > 1) {
            timeZoneOLrzqt = yCN.OLrzqt(luaValueArr[1].toJavaString());
        }
        return LuaValue.rString(pTA.copydefault(new Date(lOLrzqt.longValue()), OKDateEnum.DATE_FORMAT_STANDARD, OKTimeEnum.NONE, Locale.getDefault(), timeZoneOLrzqt, luaValueArr.length > 2 ? luaValueArr[2].toBoolean() : true));
    }

    @LuaBridge
    public LuaValue[] simpleHHmmWithTimeZone(LuaValue[] luaValueArr) {
        Long lOLrzqt = OLrzqt(luaValueArr);
        if (lOLrzqt == null) {
            return LuaValue.rNil();
        }
        TimeZone timeZoneOLrzqt = TimeZone.getDefault();
        if (luaValueArr.length > 1) {
            timeZoneOLrzqt = yCN.OLrzqt(luaValueArr[1].toJavaString());
        }
        return LuaValue.rString(pTA.copydefault(new Date(lOLrzqt.longValue()), OKDateEnum.NONE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, Locale.getDefault(), timeZoneOLrzqt, luaValueArr.length > 2 ? luaValueArr[2].toBoolean() : true));
    }

    @LuaBridge
    public LuaValue[] simpleMMddHHmmWithTimeZone(LuaValue[] luaValueArr) {
        Long lOLrzqt = OLrzqt(luaValueArr);
        if (lOLrzqt == null) {
            return LuaValue.rNil();
        }
        TimeZone timeZoneOLrzqt = TimeZone.getDefault();
        if (luaValueArr.length > 1) {
            timeZoneOLrzqt = yCN.OLrzqt(luaValueArr[1].toJavaString());
        }
        return LuaValue.rString(pTA.copydefault(new Date(lOLrzqt.longValue()), OKDateEnum.DATE_FORMAT_STANDARD_MD, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, Locale.getDefault(), timeZoneOLrzqt, luaValueArr.length > 2 ? luaValueArr[2].toBoolean() : true));
    }

    public final Long OLrzqt(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length <= 0) {
            return null;
        }
        return Long.valueOf(KWHzl(luaValueArr[0]).longValue() * 1000);
    }

    public final Long KWHzl(LuaValue luaValue) {
        if (luaValue == null || !luaValue.isNumber()) {
            return null;
        }
        return Long.valueOf(luaValue.toLong());
    }

    @LuaBridge
    public UDNativeLoader checkRegisterStatus(final LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader.copydefault(new UDNativeLoader.StateListAnimator() { // from class: com.okinc.nft.nftmarket.NFTBridge.14
            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void OLrzqt() {
            }

            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void copydefault(final UDNativeLoader.Application application, final UDNativeLoader.Activity activity) {
                LuaValue[] luaValueArr2 = luaValueArr;
                if (luaValueArr2 == null || luaValueArr2.length < 2) {
                    activity.KWHzl(-1, "wrong params");
                    return;
                }
                LuaValue luaValue = luaValueArr2[0];
                int i = luaValue != null ? luaValue.toInt() : 0;
                LuaValue luaValue2 = luaValueArr[1];
                ((InterfaceC9844bdJ) C43248rlh.KWHzl.AEQbTJ(InterfaceC9844bdJ.class)).AEQbTJ(i, luaValue2 != null ? luaValue2.toJavaString() : "").OLrzqt(new InterfaceC58227yxM<Throwable>() { // from class: com.okinc.nft.nftmarket.NFTBridge.14.5
                    /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                    @Override // o.InterfaceC58227yxM
                    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                    public void accept(Throwable th) throws Exception {
                        activity.KWHzl(-1, th.getMessage());
                    }
                }).AEQbTJ(new InterfaceC58227yxM<ChainRegisterStatus>() { // from class: com.okinc.nft.nftmarket.NFTBridge.14.3
                    /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                    /* JADX WARN: Removed duplicated region for block: B:11:0x0011  */
                    @Override // o.InterfaceC58227yxM
                    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public void accept(ChainRegisterStatus chainRegisterStatus) throws Exception {
                        int i2;
                        if (chainRegisterStatus != ChainRegisterStatus.REGISTERED) {
                            if (chainRegisterStatus == ChainRegisterStatus.REGISTERING) {
                                i2 = 1;
                            } else {
                                i2 = chainRegisterStatus == ChainRegisterStatus.UNREGISTERED ? 2 : 0;
                            }
                        }
                        application.copydefault(LuaNumber.valueOf(i2));
                    }
                });
            }
        });
        return uDNativeLoader;
    }

    @LuaBridge
    public LuaValue[] showChainRegisterDialog(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 2) {
            LuaValue.rNil();
        }
        LuaValue luaValue = luaValueArr[0];
        int i = luaValue != null ? luaValue.toInt() : 0;
        LuaValue luaValue2 = luaValueArr[1];
        String javaString = luaValue2 != null ? luaValue2.toJavaString() : "";
        final LuaFunction luaFunction = luaValueArr.length > 2 ? luaValueArr[2].toLuaFunction() : null;
        Activity activityCopydefault = copydefault();
        if (C7863arp.KWHzl(activityCopydefault) && (activityCopydefault instanceof FragmentActivity)) {
            ((InterfaceC54829xWw) C43248rlh.KWHzl.AEQbTJ(InterfaceC54829xWw.class)).KWHzl(activityCopydefault, i, javaString, ((FragmentActivity) activityCopydefault).getSupportFragmentManager(), new Function1<Bundle, Unit>() { // from class: com.okinc.nft.nftmarket.NFTBridge.12
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public Unit invoke(Bundle bundle) {
                    LuaFunction luaFunction2 = luaFunction;
                    if (luaFunction2 != null) {
                        luaFunction2.invoke(null);
                    }
                    return null;
                }
            });
        }
        return LuaValue.rNil();
    }

    /* JADX INFO: renamed from: com.okinc.nft.nftmarket.NFTBridge$4, reason: invalid class name */
    public class AnonymousClass4 implements UDNativeLoader.StateListAnimator {
        public final /* synthetic */ LuaValue[] EZpvd;

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void OLrzqt() {
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public AnonymousClass4(LuaValue[] luaValueArr) {
            this.EZpvd = luaValueArr;
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void copydefault(final UDNativeLoader.Application application, UDNativeLoader.Activity activity) {
            LuaValue[] luaValueArr = this.EZpvd;
            if (luaValueArr == null || luaValueArr.length < 2) {
                activity.KWHzl(-1, "wrong params");
                return;
            }
            String javaString = luaValueArr[0].toJavaString();
            ArrayList arrayList = new ArrayList();
            int i = 1;
            while (true) {
                LuaValue[] luaValueArr2 = this.EZpvd;
                if (i < luaValueArr2.length) {
                    if (luaValueArr2[i].isString()) {
                        arrayList.add(this.EZpvd[i].toJavaString());
                    }
                    i++;
                } else {
                    C43654rtP.EZpvd.OLrzqt(javaString, arrayList, new ValueCallback() { // from class: o.rqq
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.webkit.ValueCallback
                        public final void onReceiveValue(java.lang.Object obj) {
                            application.copydefault((java.lang.String) obj);
                        }
                    });
                    return;
                }
            }
        }
    }

    @LuaBridge
    public UDNativeLoader runStarkNetJS(LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader.copydefault(new AnonymousClass4(luaValueArr));
        return uDNativeLoader;
    }

    @LuaBridge
    public LuaValue[] checkPasswordForStarknet(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 2) {
            return LuaValue.rNil();
        }
        int i = luaValueArr[0].toInt();
        final LuaFunction luaFunction = luaValueArr[1].toLuaFunction();
        Activity activityCopydefault = copydefault();
        if (C7863arp.KWHzl(activityCopydefault) && (activityCopydefault instanceof FragmentActivity)) {
            ((InterfaceC9844bdJ) C43248rlh.KWHzl.AEQbTJ(InterfaceC9844bdJ.class)).EZpvd(i, activityCopydefault, ((FragmentActivity) activityCopydefault).getSupportFragmentManager(), new Function1<Boolean, Unit>() { // from class: com.okinc.nft.nftmarket.NFTBridge.3
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                public Unit invoke(Boolean bool) {
                    luaFunction.invoke(LuaValue.rBoolean(bool.booleanValue()));
                    return null;
                }
            });
        }
        return LuaValue.rNil();
    }

    @LuaBridge
    public LuaValue[] isSupportApplication(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 1) {
            return LuaValue.rBoolean(false);
        }
        try {
            return LuaValue.rBoolean(!EZpvd(this.globals).getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(luaValueArr[0].toJavaString())), 0).isEmpty());
        } catch (Exception unused) {
            return LuaValue.rBoolean(false);
        }
    }

    @LuaBridge
    public LuaValue[] openApplication(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 1) {
            return LuaValue.rBoolean(false);
        }
        String javaString = luaValueArr[0].toJavaString();
        LuaFunction luaFunction = luaValueArr.length == 2 ? luaValueArr[1].toLuaFunction() : null;
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(javaString));
            if (EZpvd(this.globals).getPackageManager().queryIntentActivities(intent, 0).size() > 0) {
                EZpvd(this.globals).startActivity(intent);
                if (luaFunction != null) {
                    luaFunction.invoke(LuaValue.rBoolean(true));
                }
            } else if (luaFunction != null) {
                luaFunction.invoke(LuaValue.rBoolean(false));
            }
        } catch (Exception unused) {
            if (luaFunction != null) {
                luaFunction.invoke(LuaValue.rBoolean(false));
            }
        }
        return LuaValue.rBoolean(true);
    }

    @LuaBridge
    public LuaValue[] isShowUKBanner(LuaValue[] luaValueArr) {
        return LuaValue.rBoolean(((OKComplianceRestrictionService) C43248rlh.KWHzl.AEQbTJ(OKComplianceRestrictionService.class)).OLrzqt(OKComplianceRestrictionService.Feature.BANNER));
    }

    public final AppUpdateService EZpvd() {
        if (this.mUpdateService == null) {
            this.mUpdateService = (AppUpdateService) C43248rlh.KWHzl.AEQbTJ(AppUpdateService.class);
        }
        return this.mUpdateService;
    }

    @LuaBridge
    public LuaValue[] appUpdateEnable(LuaValue[] luaValueArr) {
        AppUpdateService appUpdateServiceEZpvd = EZpvd();
        if (appUpdateServiceEZpvd == null) {
            return LuaValue.rNumber(3.0d);
        }
        if (!appUpdateServiceEZpvd.hasNewVersion()) {
            return LuaValue.rNumber(1.0d);
        }
        if (appUpdateServiceEZpvd.getUpdateProgress() != null) {
            return LuaValue.rNumber(2.0d);
        }
        return LuaValue.rNumber(AudioStats.AUDIO_AMPLITUDE_NONE);
    }

    @LuaBridge
    public LuaValue[] updateApp(LuaValue[] luaValueArr) {
        LuaFunction luaFunction;
        Activity activityCopydefault = copydefault();
        if (!(activityCopydefault instanceof AbstractActivityC33041mov)) {
            return LuaValue.rNumber(1.0d);
        }
        AppUpdateService appUpdateServiceEZpvd = EZpvd();
        if (appUpdateServiceEZpvd == null) {
            return LuaValue.rNumber(2.0d);
        }
        if (luaValueArr != null) {
            LuaFunction luaFunction2 = luaValueArr.length > 0 ? luaValueArr[0].toLuaFunction() : null;
            luaFunction = luaValueArr.length > 1 ? luaValueArr[1].toLuaFunction() : null;
            luaFunction = luaFunction2;
        } else {
            luaFunction = null;
        }
        if (this.mUpdateStateCallback == null) {
            this.mUpdateStateCallback = new StateListAnimator(luaFunction, luaFunction);
        }
        appUpdateServiceEZpvd.addUpdateStateChangeListener(this.mUpdateStateCallback);
        appUpdateServiceEZpvd.checkUpdate((AbstractActivityC33041mov) activityCopydefault, false);
        return LuaValue.rNumber(AudioStats.AUDIO_AMPLITUDE_NONE);
    }

    @LuaBridge
    public LuaValue[] removeUpdateCallback(LuaValue[] luaValueArr) {
        if (this.mUpdateStateCallback == null) {
            return LuaValue.rNumber(1.0d);
        }
        AppUpdateService appUpdateServiceEZpvd = EZpvd();
        if (appUpdateServiceEZpvd == null) {
            return LuaValue.rNumber(2.0d);
        }
        appUpdateServiceEZpvd.removeUpdateStateChangeListener(this.mUpdateStateCallback);
        return LuaValue.rNumber(AudioStats.AUDIO_AMPLITUDE_NONE);
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static class StateListAnimator implements IUpdateStateChange {
        public LuaFunction EZpvd;
        public LuaFunction OLrzqt;

        public StateListAnimator(LuaFunction luaFunction, LuaFunction luaFunction2) {
            this.EZpvd = luaFunction;
            this.OLrzqt = luaFunction2;
        }

        @Override // com.okinc.business.appupdate.api.IUpdateStateChange
        public void onDownLoadStart() {
            KWHzl(1.0d);
        }

        @Override // com.okinc.business.appupdate.api.IUpdateStateChange
        public void onDownloadCanceled() {
            KWHzl(2.0d);
        }

        @Override // com.okinc.business.appupdate.api.IUpdateStateChange
        public void onDownloadFailed() {
            KWHzl(3.0d);
        }

        @Override // com.okinc.business.appupdate.api.IUpdateStateChange
        public void onDownloadProgressChange(int i) {
            AEQbTJ(i);
        }

        @Override // com.okinc.business.appupdate.api.IUpdateStateChange
        public void onDownloadSuccess() {
            KWHzl(AudioStats.AUDIO_AMPLITUDE_NONE);
        }

        public void KWHzl(double d) {
            LuaFunction luaFunction = this.OLrzqt;
            if (luaFunction == null) {
                return;
            }
            luaFunction.invoke(LuaValue.rNumber(d));
        }

        public void AEQbTJ(double d) {
            LuaFunction luaFunction = this.EZpvd;
            if (luaFunction == null) {
                return;
            }
            luaFunction.invoke(LuaValue.rNumber(d));
        }
    }

    @LuaBridge
    public LuaValue[] guestState(LuaValue[] luaValueArr) {
        return LuaValue.rBoolean(!TextUtils.isEmpty(sGuestAddress));
    }

    @LuaBridge
    public LuaValue[] guestAddress(LuaValue[] luaValueArr) {
        return LuaValue.rString(sGuestAddress);
    }

    @LuaBridge
    public LuaValue[] getTimeZoneName(LuaValue[] luaValueArr) {
        return LuaValue.rString(TimeZone.getDefault().getDisplayName(false, 0, Locale.US));
    }

    @LuaBridge
    public void clearNativeShareInstance() {
        ThreadUtils.AEQbTJ(new Runnable() { // from class: com.okinc.nft.nftmarket.NFTBridge.1
            @Override // java.lang.Runnable
            public void run() {
                ((Web3ShareService) C43248rlh.KWHzl.AEQbTJ(Web3ShareService.class)).destroyShareMLNInstance();
            }
        }, 0L);
    }
}
