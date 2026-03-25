package o;

import android.content.pm.PackageManager;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.account.api.model.wallet.BindWalletPreCheckResult;
import com.okinc.account.api.model.wallet.BindWalletResult;
import com.okinc.account.api.model.wallet.BoundWalletAccount;
import com.okinc.account.api.model.wallet.BoundWalletAccountsResult;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.CheckWalletBindStatusAccountResponse;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.CheckWalletBindStatusResponse;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.GetBindingTokenRequestBody;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.GetBindingTokenResponseBody;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.Intention;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.WalletBindApiService;
import com.okinc.business.defi.wallet.mine.walletbind.utils.IndependentWalletBindCeFiUtils$getBoundWalletsFromBE$1;
import com.okinc.business.defi.wallet.mine.walletbind.utils.IndependentWalletBindCeFiUtils$getBoundWalletsFromBE$result$1;
import com.okinc.business.defi.wallet.mine.walletbind.utils.IndependentWalletBindCeFiUtils$goToWithdraw$1;
import com.okinc.business.defi.wallet.mine.walletbind.utils.IndependentWalletBindCeFiUtils$handleBindWalletPreCheckResult$1;
import com.okinc.business.defi.wallet.mine.walletbind.utils.IndependentWalletBindCeFiUtils$handleBindWalletPreCheckResult$2;
import com.okinc.business.defi.wallet.mine.walletbind.utils.IndependentWalletBindCeFiUtils$startWalletCeFiBind$1;
import com.okinc.business.defi.wallet.mine.walletbind.utils.IndependentWalletBindCeFiUtils$startWalletCeFiBind$2$3$1$2$1;
import com.okinc.business.defi.wallet.mine.walletbind.utils.IndependentWalletBindCeFiUtils$startWalletCeFiBind$2$3$1$loginLauncher$1$1$1;
import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.okuser.data.User;
import com.okinc.rxutils.RxBus;
import com.okinc.wallet.api.bean.WalletInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC54840xXg;
import o.C12827cuN;
import o.C52761wXj;
import o.InterfaceC8107awW;
import o.gJK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fAj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17304fAj {
    public static WalletInfo AhwBna;
    public static final C17304fAj EZpvd = new C17304fAj();
    public static final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.fAu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C17304fAj.djBIcL();
        }
    });
    public static final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.fAt
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C17304fAj.AYXKKw();
        }
    });
    public static final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.fAw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C17304fAj.valueOf();
        }
    });
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.fAm
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C17304fAj.gEmmrt();
        }
    });
    public static final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.fAk
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C17304fAj.AhwBna();
        }
    });
    public static final int OLrzqt = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(WalletInfo walletInfo) {
        AhwBna = walletInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletInfo AuCTel() {
        return AhwBna;
    }

    private C17304fAj() {
    }

    public static final WalletBindApiService djBIcL() {
        return WalletBindApiService.Companion.AEQbTJ();
    }

    public final WalletBindApiService values() {
        return (WalletBindApiService) AEQbTJ.getValue();
    }

    public static final C13934dbu AYXKKw() {
        return new C13934dbu();
    }

    public final C13934dbu fARcdN() {
        return (C13934dbu) gEmmrt.getValue();
    }

    public static final InterfaceC8107awW valueOf() {
        return (InterfaceC8107awW) C43248rlh.KWHzl.AEQbTJ(InterfaceC8107awW.class);
    }

    public final InterfaceC8107awW fetchVPNInfo() {
        return (InterfaceC8107awW) KWHzl.getValue();
    }

    public static final InterfaceC8106awV gEmmrt() {
        return (InterfaceC8106awV) C43248rlh.KWHzl.AEQbTJ(InterfaceC8106awV.class);
    }

    public final InterfaceC8106awV isConnected() {
        return (InterfaceC8106awV) copydefault.getValue();
    }

    public static final InterfaceC47278tmy AhwBna() {
        return (InterfaceC47278tmy) C43248rlh.KWHzl.AEQbTJ(InterfaceC47278tmy.class);
    }

    public final InterfaceC47278tmy fIwbmz() {
        return (InterfaceC47278tmy) AYXKKw.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.util.List<java.lang.String> list, @NotNull WalletBindApiService walletBindApiService, @NotNull Continuation<? super BoundWalletAccountsResult> continuation) throws java.lang.Throwable {
        IndependentWalletBindCeFiUtils$getBoundWalletsFromBE$1 independentWalletBindCeFiUtils$getBoundWalletsFromBE$1;
        java.util.ArrayList arrayList;
        java.util.List<CheckWalletBindStatusAccountResponse> accountList;
        if (continuation instanceof IndependentWalletBindCeFiUtils$getBoundWalletsFromBE$1) {
            independentWalletBindCeFiUtils$getBoundWalletsFromBE$1 = (IndependentWalletBindCeFiUtils$getBoundWalletsFromBE$1) continuation;
            int i = independentWalletBindCeFiUtils$getBoundWalletsFromBE$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                independentWalletBindCeFiUtils$getBoundWalletsFromBE$1.label = i - Integer.MIN_VALUE;
            } else {
                independentWalletBindCeFiUtils$getBoundWalletsFromBE$1 = new IndependentWalletBindCeFiUtils$getBoundWalletsFromBE$1(this, continuation);
            }
        }
        java.lang.Object obj = independentWalletBindCeFiUtils$getBoundWalletsFromBE$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = independentWalletBindCeFiUtils$getBoundWalletsFromBE$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            CoroutineDispatcher io2 = Dispatchers.getIO();
            IndependentWalletBindCeFiUtils$getBoundWalletsFromBE$result$1 independentWalletBindCeFiUtils$getBoundWalletsFromBE$result$1 = new IndependentWalletBindCeFiUtils$getBoundWalletsFromBE$result$1(walletBindApiService, list, null);
            independentWalletBindCeFiUtils$getBoundWalletsFromBE$1.L$0 = arrayList2;
            independentWalletBindCeFiUtils$getBoundWalletsFromBE$1.label = 1;
            java.lang.Object objWithContext = BuildersKt.withContext(io2, independentWalletBindCeFiUtils$getBoundWalletsFromBE$result$1, independentWalletBindCeFiUtils$getBoundWalletsFromBE$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            arrayList = arrayList2;
            obj = objWithContext;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = (java.util.ArrayList) independentWalletBindCeFiUtils$getBoundWalletsFromBE$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        java.lang.Object objM7386unboximpl = ((Result) obj).m7386unboximpl();
        Ref.IntRef intRef = new Ref.IntRef();
        CheckWalletBindStatusResponse checkWalletBindStatusResponse = (CheckWalletBindStatusResponse) (Result.m7383isFailureimpl(objM7386unboximpl) ? null : objM7386unboximpl);
        if (checkWalletBindStatusResponse != null) {
            intRef.element = C33129mqd.AhwBna(checkWalletBindStatusResponse.getThreshold());
        }
        CheckWalletBindStatusResponse checkWalletBindStatusResponse2 = (CheckWalletBindStatusResponse) (Result.m7383isFailureimpl(objM7386unboximpl) ? null : objM7386unboximpl);
        if (checkWalletBindStatusResponse2 != null && (accountList = checkWalletBindStatusResponse2.getAccountList()) != null) {
            for (CheckWalletBindStatusAccountResponse checkWalletBindStatusAccountResponse : accountList) {
                if (checkWalletBindStatusAccountResponse.isBinded()) {
                    arrayList.add(new BoundWalletAccount(checkWalletBindStatusAccountResponse.getAccountId(), "", "", null, null, null, false, 120, null));
                }
            }
        }
        return new BoundWalletAccountsResult(arrayList, intRef.element);
    }

    public static /* synthetic */ java.lang.Object getBoundWalletsFromBE$default(C17304fAj c17304fAj, java.util.List list, WalletBindApiService walletBindApiService, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            walletBindApiService = c17304fAj.values();
        }
        return c17304fAj.copydefault((java.util.List<java.lang.String>) list, walletBindApiService, (Continuation<? super BoundWalletAccountsResult>) continuation);
    }

    public final boolean hDKMBd() {
        OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) C43251rlk.OLrzqt(OKComplianceRestrictionService.class);
        return uzCIH() && (oKComplianceRestrictionService != null && !oKComplianceRestrictionService.AEQbTJ(OKComplianceRestrictionService.Feature.EASY_CONNECT));
    }

    public final boolean fJNWhG() {
        java.lang.String value$default = ABTestManager.getValue$default(ABTestManager.AEQbTJ, "feat_easy_connect", null, 2, null);
        if (value$default == null) {
            value$default = "treatment";
        }
        return Intrinsics.EZpvd((java.lang.Object) value$default, (java.lang.Object) "treatment");
    }

    public final boolean uzCIH() {
        java.lang.String strAEQbTJ = ABTestManager.AEQbTJ.AEQbTJ("mobile_web3_wallet_app_bind_enabled", AmplitudeName.WEB3);
        if (strAEQbTJ == null) {
            strAEQbTJ = DebugKt.DEBUG_PROPERTY_VALUE_ON;
        }
        return Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) DebugKt.DEBUG_PROPERTY_VALUE_ON);
    }

    public final java.util.List<java.lang.String> DbNXlk() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (AEQbTJ("com.okinc.okex")) {
            arrayList.add("com.okinc.okex");
        }
        if (AEQbTJ("com.okinc.okex.gp")) {
            arrayList.add("com.okinc.okex.gp");
        }
        if (AEQbTJ("com.okx.tr")) {
            arrayList.add("com.okx.tr");
        }
        return arrayList;
    }

    public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull final Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function1, "");
        java.util.List<java.lang.String> listDbNXlk = DbNXlk();
        if (listDbNXlk.size() > 1) {
            C19316fyw.Companion.EZpvd(new Function1() { // from class: o.fAl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C17304fAj.copydefault(function1, (java.lang.String) obj);
                }
            }).show(fragmentManager);
        } else {
            C19315fyv.Companion.OLrzqt(listDbNXlk.size() == 1 ? listDbNXlk.get(0) : "", new Function1() { // from class: o.fAi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C17304fAj.EZpvd(function1, (java.lang.String) obj);
                }
            }).show(fragmentManager);
        }
    }

    public static final Unit copydefault(Function1 function1, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(Function1 function1, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            android.content.pm.PackageManager packageManager = C32979mnm.EZpvd.OLrzqt().getPackageManager();
            if (packageManager != null) {
                packageManager.getPackageInfo(str, 0);
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final java.lang.String AkhnZx() {
        java.lang.String packageName = C32979mnm.EZpvd.OLrzqt().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        return packageName;
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, android.content.Context context) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.setPackage(str2);
            intent.setData(android.net.Uri.parse(str));
            if (context != null) {
                context.startActivity(intent);
            }
            if (context instanceof android.app.Activity) {
                ((android.app.Activity) context).overridePendingTransition(C52761wXj.Application.isConnected, C52761wXj.Application.values);
            }
        } catch (java.lang.Exception e) {
            C19339fzS.EZpvd.OLrzqt("[Get Deeplink]", "start " + str2 + " failed, error:" + e.getMessage());
        }
    }

    public final void OLrzqt(@NotNull android.content.Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        kotlin.Pair<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> pairKWHzl = C33568mys.AEQbTJ.KWHzl(C59449zhJ.replace$default("web3/wallet/account/linking", C34704nhP.copydefault.AEQbTJ() + "://", "", false, 4, (java.lang.Object) null));
        java.lang.String first = pairKWHzl.getFirst();
        java.util.Set<Map.Entry<java.lang.String, java.lang.String>> setEntrySet = pairKWHzl.getSecond().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(setEntrySet, 10)), 16));
        java.util.Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(entry.getKey(), entry.getValue());
            linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
        }
        java.util.Map<java.lang.String, ? extends java.lang.Object> mapIsConnected = C56424yEw.isConnected(linkedHashMap);
        mapIsConnected.put("KEY_SHOW_BIND_SUCCESS", java.lang.String.valueOf(z));
        ((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class)).KWHzl(context, first, mapIsConnected, new Function1() { // from class: o.fAn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17304fAj.OLrzqt((AbstractC43238rlX) obj);
            }
        });
    }

    public static final Unit OLrzqt(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new IndependentWalletBindCeFiUtils$goToWithdraw$1(context, null), 3, null);
    }

    public final boolean getFieldNames() {
        OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) C43251rlk.OLrzqt(OKComplianceRestrictionService.class);
        return (oKComplianceRestrictionService == null || oKComplianceRestrictionService.AEQbTJ(OKComplianceRestrictionService.Feature.QUICK_WITHDRAW) || !uzCIH()) ? false : true;
    }

    public final boolean ejfBZ() {
        OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) C43251rlk.OLrzqt(OKComplianceRestrictionService.class);
        return (oKComplianceRestrictionService == null || oKComplianceRestrictionService.AEQbTJ(OKComplianceRestrictionService.Feature.QUICK_WITHDRAW) || !fJNWhG()) ? false : true;
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "com.okx.tr") ? "okxtr://" : "okx://";
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.fzR.handleWalletBindState$default(o.fzR, o.mov, o.gJK, androidx.activity.result.ActivityResultLauncher, androidx.activity.result.ActivityResultLauncher, o.fAx, kotlin.jvm.functions.Function0, boolean, int, java.lang.Object):void */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd A[Catch: all -> 0x023d, TryCatch #2 {all -> 0x023d, blocks: (B:104:0x0232, B:105:0x0236, B:103:0x0228, B:107:0x023c, B:24:0x0074, B:52:0x012c, B:56:0x0135, B:58:0x0139, B:59:0x014a, B:61:0x0150, B:27:0x0087, B:49:0x0119, B:31:0x0096, B:39:0x00c2, B:41:0x00dd, B:46:0x00ea, B:34:0x00a2, B:36:0x00ab, B:16:0x0046, B:79:0x01a0, B:87:0x01bc, B:89:0x01c4, B:91:0x01ca, B:93:0x01e4, B:96:0x01ec, B:98:0x01f2, B:99:0x0207, B:100:0x0222, B:21:0x0060, B:69:0x017e, B:73:0x0187, B:76:0x0191, B:81:0x01a6, B:83:0x01ac, B:85:0x01b2, B:63:0x0154, B:65:0x0160, B:66:0x016d), top: B:112:0x0032, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0118 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0139 A[Catch: all -> 0x023d, TryCatch #2 {all -> 0x023d, blocks: (B:104:0x0232, B:105:0x0236, B:103:0x0228, B:107:0x023c, B:24:0x0074, B:52:0x012c, B:56:0x0135, B:58:0x0139, B:59:0x014a, B:61:0x0150, B:27:0x0087, B:49:0x0119, B:31:0x0096, B:39:0x00c2, B:41:0x00dd, B:46:0x00ea, B:34:0x00a2, B:36:0x00ab, B:16:0x0046, B:79:0x01a0, B:87:0x01bc, B:89:0x01c4, B:91:0x01ca, B:93:0x01e4, B:96:0x01ec, B:98:0x01f2, B:99:0x0207, B:100:0x0222, B:21:0x0060, B:69:0x017e, B:73:0x0187, B:76:0x0191, B:81:0x01a6, B:83:0x01ac, B:85:0x01b2, B:63:0x0154, B:65:0x0160, B:66:0x016d), top: B:112:0x0032, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0150 A[Catch: all -> 0x023d, TRY_LEAVE, TryCatch #2 {all -> 0x023d, blocks: (B:104:0x0232, B:105:0x0236, B:103:0x0228, B:107:0x023c, B:24:0x0074, B:52:0x012c, B:56:0x0135, B:58:0x0139, B:59:0x014a, B:61:0x0150, B:27:0x0087, B:49:0x0119, B:31:0x0096, B:39:0x00c2, B:41:0x00dd, B:46:0x00ea, B:34:0x00a2, B:36:0x00ab, B:16:0x0046, B:79:0x01a0, B:87:0x01bc, B:89:0x01c4, B:91:0x01ca, B:93:0x01e4, B:96:0x01ec, B:98:0x01f2, B:99:0x0207, B:100:0x0222, B:21:0x0060, B:69:0x017e, B:73:0x0187, B:76:0x0191, B:81:0x01a6, B:83:0x01ac, B:85:0x01b2, B:63:0x0154, B:65:0x0160, B:66:0x016d), top: B:112:0x0032, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ac A[Catch: all -> 0x0227, CancellationException -> 0x023b, TryCatch #3 {CancellationException -> 0x023b, all -> 0x0227, blocks: (B:16:0x0046, B:79:0x01a0, B:87:0x01bc, B:89:0x01c4, B:91:0x01ca, B:93:0x01e4, B:96:0x01ec, B:98:0x01f2, B:99:0x0207, B:100:0x0222, B:21:0x0060, B:69:0x017e, B:73:0x0187, B:76:0x0191, B:81:0x01a6, B:83:0x01ac, B:85:0x01b2, B:63:0x0154, B:65:0x0160, B:66:0x016d), top: B:112:0x0032, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01bc A[Catch: all -> 0x0227, CancellationException -> 0x023b, TryCatch #3 {CancellationException -> 0x023b, all -> 0x0227, blocks: (B:16:0x0046, B:79:0x01a0, B:87:0x01bc, B:89:0x01c4, B:91:0x01ca, B:93:0x01e4, B:96:0x01ec, B:98:0x01f2, B:99:0x0207, B:100:0x0222, B:21:0x0060, B:69:0x017e, B:73:0x0187, B:76:0x0191, B:81:0x01a6, B:83:0x01ac, B:85:0x01b2, B:63:0x0154, B:65:0x0160, B:66:0x016d), top: B:112:0x0032, outer: #2 }] */
    /* JADX WARN: Type inference failed for: r18v3, types: [androidx.activity.result.ActivityResultLauncher] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        IndependentWalletBindCeFiUtils$startWalletCeFiBind$1 independentWalletBindCeFiUtils$startWalletCeFiBind$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.Object objM7377constructorimpl2;
        java.lang.Object objM8562bindWalletPreCheckgIAlus$default;
        gJK gjk;
        GetBindingTokenRequestBody getBindingTokenRequestBody;
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault;
        final AbstractActivityC33041mov abstractActivityC33041mov2;
        java.lang.Object objCopydefault;
        final GetBindingTokenResponseBody getBindingTokenResponseBody;
        final AbstractActivityC33041mov abstractActivityC33041mov3;
        gJK application;
        ActivityResultRegistry activityResultRegistry;
        ActivityResultRegistry activityResultRegistry2;
        final java.lang.String str2 = str;
        AbstractActivityC33041mov abstractActivityC33041mov4 = abstractActivityC33041mov;
        if (continuation instanceof IndependentWalletBindCeFiUtils$startWalletCeFiBind$1) {
            independentWalletBindCeFiUtils$startWalletCeFiBind$1 = (IndependentWalletBindCeFiUtils$startWalletCeFiBind$1) continuation;
            int i = independentWalletBindCeFiUtils$startWalletCeFiBind$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                independentWalletBindCeFiUtils$startWalletCeFiBind$1.label = i - Integer.MIN_VALUE;
            } else {
                independentWalletBindCeFiUtils$startWalletCeFiBind$1 = new IndependentWalletBindCeFiUtils$startWalletCeFiBind$1(this, continuation);
            }
        }
        java.lang.Object objAwait = independentWalletBindCeFiUtils$startWalletCeFiBind$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = independentWalletBindCeFiUtils$startWalletCeFiBind$1.label;
        java.lang.Object objM7376boximpl = null;
        try {
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwait);
                Result.Application application3 = Result.Companion;
                if (C34703nhO.copydefault()) {
                    AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str2, false);
                    independentWalletBindCeFiUtils$startWalletCeFiBind$1.L$0 = str2;
                    independentWalletBindCeFiUtils$startWalletCeFiBind$1.L$1 = abstractActivityC33041mov4;
                    independentWalletBindCeFiUtils$startWalletCeFiBind$1.label = 1;
                    objAwait = RxAwaitKt.await(abstractC58260yxtOLrzqt, independentWalletBindCeFiUtils$startWalletCeFiBind$1);
                    if (objAwait == objCopydefault2) {
                        return objCopydefault2;
                    }
                    AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objAwait;
                    getBindingTokenRequestBody = new GetBindingTokenRequestBody(str2, abstractC12782ctV.AYXKKw());
                    java.lang.String strAYXKKw = abstractC12782ctV.AYXKKw();
                    java.lang.String strAkhnZx = abstractC12782ctV.AkhnZx();
                    AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
                    if (abstractC12784ctXGwTjWJ == null) {
                    }
                    if (strAuCTel != null) {
                    }
                    WalletType.Application application4 = WalletType.Companion;
                    Intrinsics.copydefault(abstractC12782ctV);
                    AhwBna = new WalletInfo(str2, strAYXKKw, strAkhnZx, str, application4.OLrzqt(abstractC12782ctV), "", abstractC12782ctV.AEQbTJ(), abstractC12782ctV);
                    abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(str2);
                    independentWalletBindCeFiUtils$startWalletCeFiBind$1.L$0 = abstractActivityC33041mov4;
                    independentWalletBindCeFiUtils$startWalletCeFiBind$1.L$1 = getBindingTokenRequestBody;
                    independentWalletBindCeFiUtils$startWalletCeFiBind$1.label = 2;
                    if (RxAwaitKt.await(abstractC58260yxtCopydefault, independentWalletBindCeFiUtils$startWalletCeFiBind$1) == objCopydefault2) {
                    }
                    abstractActivityC33041mov2 = abstractActivityC33041mov4;
                    C13934dbu c13934dbuFARcdN = EZpvd.fARcdN();
                    independentWalletBindCeFiUtils$startWalletCeFiBind$1.L$0 = abstractActivityC33041mov2;
                    independentWalletBindCeFiUtils$startWalletCeFiBind$1.L$1 = null;
                    independentWalletBindCeFiUtils$startWalletCeFiBind$1.label = 3;
                    objCopydefault = c13934dbuFARcdN.copydefault(getBindingTokenRequestBody, independentWalletBindCeFiUtils$startWalletCeFiBind$1);
                    if (objCopydefault == objCopydefault2) {
                    }
                    getBindingTokenResponseBody = (GetBindingTokenResponseBody) (!Result.m7383isFailureimpl(objCopydefault) ? null : objCopydefault);
                    if (getBindingTokenResponseBody != null) {
                    }
                    if (Result.m7380exceptionOrNullimpl(objCopydefault) != null) {
                    }
                } else {
                    C17304fAj c17304fAj = EZpvd;
                    if (!c17304fAj.fetchVPNInfo().OLrzqt()) {
                        gjk = gJK.StateListAnimator.EZpvd;
                        RxBus.AEQbTJ(new xWW(AbstractC54840xXg.StateListAnimator.EZpvd));
                        abstractActivityC33041mov3 = abstractActivityC33041mov4;
                        application = gjk;
                        if (application != null) {
                        }
                        objM7377constructorimpl = Result.m7377constructorimpl(objM7376boximpl);
                        objM7376boximpl = Result.m7376boximpl(objM7377constructorimpl);
                    } else {
                        InterfaceC8107awW interfaceC8107awWFetchVPNInfo = c17304fAj.fetchVPNInfo();
                        independentWalletBindCeFiUtils$startWalletCeFiBind$1.L$0 = str2;
                        independentWalletBindCeFiUtils$startWalletCeFiBind$1.L$1 = abstractActivityC33041mov4;
                        independentWalletBindCeFiUtils$startWalletCeFiBind$1.label = 4;
                        objM8562bindWalletPreCheckgIAlus$default = InterfaceC8107awW.StateListAnimator.m8562bindWalletPreCheckgIAlus$default(interfaceC8107awWFetchVPNInfo, false, independentWalletBindCeFiUtils$startWalletCeFiBind$1, 1, null);
                        if (objM8562bindWalletPreCheckgIAlus$default == objCopydefault2) {
                            return objCopydefault2;
                        }
                        BindWalletPreCheckResult bindWalletPreCheckResult = (BindWalletPreCheckResult) (!Result.m7383isFailureimpl(objM8562bindWalletPreCheckgIAlus$default) ? null : objM8562bindWalletPreCheckgIAlus$default);
                        if (!Result.m7384isSuccessimpl(objM8562bindWalletPreCheckgIAlus$default)) {
                        }
                        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM8562bindWalletPreCheckgIAlus$default);
                        abstractActivityC33041mov3 = abstractActivityC33041mov4;
                        application = new gJK.Application(thM7380exceptionOrNullimpl == null ? thM7380exceptionOrNullimpl.getMessage() : null);
                        if (application != null) {
                        }
                        objM7377constructorimpl = Result.m7377constructorimpl(objM7376boximpl);
                        objM7376boximpl = Result.m7376boximpl(objM7377constructorimpl);
                    }
                }
            } else if (i2 == 1) {
                AbstractActivityC33041mov abstractActivityC33041mov5 = (AbstractActivityC33041mov) independentWalletBindCeFiUtils$startWalletCeFiBind$1.L$1;
                java.lang.String str3 = (java.lang.String) independentWalletBindCeFiUtils$startWalletCeFiBind$1.L$0;
                C56391yDq.AEQbTJ(objAwait);
                abstractActivityC33041mov4 = abstractActivityC33041mov5;
                str2 = str3;
                AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) objAwait;
                getBindingTokenRequestBody = new GetBindingTokenRequestBody(str2, abstractC12782ctV2.AYXKKw());
                java.lang.String strAYXKKw2 = abstractC12782ctV2.AYXKKw();
                java.lang.String strAkhnZx2 = abstractC12782ctV2.AkhnZx();
                AbstractC12784ctX abstractC12784ctXGwTjWJ2 = abstractC12782ctV2.gwTjWJ();
                java.lang.String strAuCTel = abstractC12784ctXGwTjWJ2 == null ? abstractC12784ctXGwTjWJ2.AuCTel() : null;
                java.lang.String str4 = strAuCTel != null ? "" : strAuCTel;
                WalletType.Application application42 = WalletType.Companion;
                Intrinsics.copydefault(abstractC12782ctV2);
                AhwBna = new WalletInfo(str2, strAYXKKw2, strAkhnZx2, str4, application42.OLrzqt(abstractC12782ctV2), "", abstractC12782ctV2.AEQbTJ(), abstractC12782ctV2);
                abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(str2);
                independentWalletBindCeFiUtils$startWalletCeFiBind$1.L$0 = abstractActivityC33041mov4;
                independentWalletBindCeFiUtils$startWalletCeFiBind$1.L$1 = getBindingTokenRequestBody;
                independentWalletBindCeFiUtils$startWalletCeFiBind$1.label = 2;
                if (RxAwaitKt.await(abstractC58260yxtCopydefault, independentWalletBindCeFiUtils$startWalletCeFiBind$1) == objCopydefault2) {
                    return objCopydefault2;
                }
                abstractActivityC33041mov2 = abstractActivityC33041mov4;
                C13934dbu c13934dbuFARcdN2 = EZpvd.fARcdN();
                independentWalletBindCeFiUtils$startWalletCeFiBind$1.L$0 = abstractActivityC33041mov2;
                independentWalletBindCeFiUtils$startWalletCeFiBind$1.L$1 = null;
                independentWalletBindCeFiUtils$startWalletCeFiBind$1.label = 3;
                objCopydefault = c13934dbuFARcdN2.copydefault(getBindingTokenRequestBody, independentWalletBindCeFiUtils$startWalletCeFiBind$1);
                if (objCopydefault == objCopydefault2) {
                }
                getBindingTokenResponseBody = (GetBindingTokenResponseBody) (!Result.m7383isFailureimpl(objCopydefault) ? null : objCopydefault);
                if (getBindingTokenResponseBody != null) {
                }
                if (Result.m7380exceptionOrNullimpl(objCopydefault) != null) {
                }
            } else if (i2 == 2) {
                GetBindingTokenRequestBody getBindingTokenRequestBody2 = (GetBindingTokenRequestBody) independentWalletBindCeFiUtils$startWalletCeFiBind$1.L$1;
                abstractActivityC33041mov4 = (AbstractActivityC33041mov) independentWalletBindCeFiUtils$startWalletCeFiBind$1.L$0;
                C56391yDq.AEQbTJ(objAwait);
                getBindingTokenRequestBody = getBindingTokenRequestBody2;
                abstractActivityC33041mov2 = abstractActivityC33041mov4;
                C13934dbu c13934dbuFARcdN22 = EZpvd.fARcdN();
                independentWalletBindCeFiUtils$startWalletCeFiBind$1.L$0 = abstractActivityC33041mov2;
                independentWalletBindCeFiUtils$startWalletCeFiBind$1.L$1 = null;
                independentWalletBindCeFiUtils$startWalletCeFiBind$1.label = 3;
                objCopydefault = c13934dbuFARcdN22.copydefault(getBindingTokenRequestBody, independentWalletBindCeFiUtils$startWalletCeFiBind$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                getBindingTokenResponseBody = (GetBindingTokenResponseBody) (!Result.m7383isFailureimpl(objCopydefault) ? null : objCopydefault);
                if (getBindingTokenResponseBody != null) {
                }
                if (Result.m7380exceptionOrNullimpl(objCopydefault) != null) {
                }
            } else if (i2 == 3) {
                abstractActivityC33041mov2 = (AbstractActivityC33041mov) independentWalletBindCeFiUtils$startWalletCeFiBind$1.L$0;
                C56391yDq.AEQbTJ(objAwait);
                objCopydefault = ((Result) objAwait).m7386unboximpl();
                getBindingTokenResponseBody = (GetBindingTokenResponseBody) (!Result.m7383isFailureimpl(objCopydefault) ? null : objCopydefault);
                if (getBindingTokenResponseBody != null) {
                    C17304fAj c17304fAj2 = EZpvd;
                    androidx.fragment.app.FragmentManager supportFragmentManager = abstractActivityC33041mov2.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    c17304fAj2.KWHzl(supportFragmentManager, new Function1() { // from class: o.fAo
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C17304fAj.copydefault(getBindingTokenResponseBody, abstractActivityC33041mov2, (java.lang.String) obj);
                        }
                    });
                }
                if (Result.m7380exceptionOrNullimpl(objCopydefault) != null) {
                    objM7376boximpl = Unit.INSTANCE;
                }
            } else if (i2 == 4) {
                AbstractActivityC33041mov abstractActivityC33041mov6 = (AbstractActivityC33041mov) independentWalletBindCeFiUtils$startWalletCeFiBind$1.L$1;
                java.lang.String str5 = (java.lang.String) independentWalletBindCeFiUtils$startWalletCeFiBind$1.L$0;
                C56391yDq.AEQbTJ(objAwait);
                objM8562bindWalletPreCheckgIAlus$default = ((Result) objAwait).m7386unboximpl();
                abstractActivityC33041mov4 = abstractActivityC33041mov6;
                str2 = str5;
                BindWalletPreCheckResult bindWalletPreCheckResult2 = (BindWalletPreCheckResult) (!Result.m7383isFailureimpl(objM8562bindWalletPreCheckgIAlus$default) ? null : objM8562bindWalletPreCheckgIAlus$default);
                if (!Result.m7384isSuccessimpl(objM8562bindWalletPreCheckgIAlus$default) && bindWalletPreCheckResult2 != null) {
                    C17304fAj c17304fAj3 = EZpvd;
                    independentWalletBindCeFiUtils$startWalletCeFiBind$1.L$0 = str2;
                    independentWalletBindCeFiUtils$startWalletCeFiBind$1.L$1 = abstractActivityC33041mov4;
                    independentWalletBindCeFiUtils$startWalletCeFiBind$1.label = 5;
                    objAwait = c17304fAj3.KWHzl(bindWalletPreCheckResult2, str2, independentWalletBindCeFiUtils$startWalletCeFiBind$1);
                    if (objAwait == objCopydefault2) {
                        return objCopydefault2;
                    }
                    gjk = (gJK) objAwait;
                    abstractActivityC33041mov3 = abstractActivityC33041mov4;
                    application = gjk;
                    if (application != null) {
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(objM7376boximpl);
                    objM7376boximpl = Result.m7376boximpl(objM7377constructorimpl);
                } else {
                    java.lang.Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM8562bindWalletPreCheckgIAlus$default);
                    abstractActivityC33041mov3 = abstractActivityC33041mov4;
                    application = new gJK.Application(thM7380exceptionOrNullimpl2 == null ? thM7380exceptionOrNullimpl2.getMessage() : null);
                    if (application != null) {
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(objM7376boximpl);
                    objM7376boximpl = Result.m7376boximpl(objM7377constructorimpl);
                }
            } else {
                if (i2 != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractActivityC33041mov abstractActivityC33041mov7 = (AbstractActivityC33041mov) independentWalletBindCeFiUtils$startWalletCeFiBind$1.L$1;
                java.lang.String str6 = (java.lang.String) independentWalletBindCeFiUtils$startWalletCeFiBind$1.L$0;
                C56391yDq.AEQbTJ(objAwait);
                abstractActivityC33041mov4 = abstractActivityC33041mov7;
                str2 = str6;
                gjk = (gJK) objAwait;
                abstractActivityC33041mov3 = abstractActivityC33041mov4;
                application = gjk;
                if (application != null) {
                    C17304fAj c17304fAj4 = EZpvd;
                    ActivityResultLauncher activityResultLauncherRegister = (abstractActivityC33041mov3 == null || (activityResultRegistry2 = abstractActivityC33041mov3.getActivityResultRegistry()) == null) ? null : activityResultRegistry2.register(UUID.randomUUID().toString(), c17304fAj4.fetchVPNInfo().copydefault(), new ActivityResultCallback() { // from class: o.fAr
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // androidx.activity.result.ActivityResultCallback
                        public final void onActivityResult(java.lang.Object obj) {
                            C17304fAj.copydefault((BindWalletResult) obj);
                        }
                    });
                    InterfaceC8106awV interfaceC8106awVIsConnected = c17304fAj4.isConnected();
                    if (interfaceC8106awVIsConnected != null && abstractActivityC33041mov3 != null && (activityResultRegistry = abstractActivityC33041mov3.getActivityResultRegistry()) != null) {
                        objM7376boximpl = activityResultRegistry.register(UUID.randomUUID().toString(), interfaceC8106awVIsConnected.OLrzqt(true), new ActivityResultCallback() { // from class: o.fAp
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // androidx.activity.result.ActivityResultCallback
                            public final void onActivityResult(java.lang.Object obj) {
                                C17304fAj.OLrzqt(abstractActivityC33041mov3, str2, (java.lang.Boolean) obj);
                            }
                        });
                    }
                    C19338fzR.OLrzqt.KWHzl(abstractActivityC33041mov3, application, activityResultLauncherRegister, objM7376boximpl, new StateListAnimator(), (64 & 32) != 0 ? null : new Function0() { // from class: o.fAq
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C17304fAj.copydefault(abstractActivityC33041mov3, str2);
                        }
                    }, (64 & 64) != 0 ? false : false);
                    objM7376boximpl = Unit.INSTANCE;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(objM7376boximpl);
                objM7376boximpl = Result.m7376boximpl(objM7377constructorimpl);
            }
            objM7377constructorimpl2 = Result.m7377constructorimpl(objM7376boximpl);
        } catch (java.lang.Throwable th2) {
            Result.Application application5 = Result.Companion;
            objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(GetBindingTokenResponseBody getBindingTokenResponseBody, AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C17304fAj c17304fAj = EZpvd;
        c17304fAj.KWHzl(c17304fAj.copydefault(str) + "exchange/cedefi/startbind?token=" + getBindingTokenResponseBody.getBindingToken() + "&intention=" + Intention.WALLET_GENERAL.getValue() + "&package=" + c17304fAj.AkhnZx() + "}", str, abstractActivityC33041mov);
        return Unit.INSTANCE;
    }

    public static final void copydefault(BindWalletResult bindWalletResult) {
        if (bindWalletResult instanceof BindWalletResult.Success) {
            BindWalletResult.Success success = (BindWalletResult.Success) bindWalletResult;
            RxBus.AEQbTJ(new xWW(new AbstractC54840xXg.Activity(new xWT(success.getBoundWalletAccount().getAccountId(), success.getBoundWalletAccount().getUserName(), success.getBoundWalletAccount().getWalletAccountName(), success.getBoundWalletAccount().getWalletIcon(), success.getBoundWalletAccount().getWalletAddress(), success.getBoundWalletAccount().getPayoutWalletAddress(), success.getBoundWalletAccount().isCurrentPayoutWallet()))));
            InterfaceC7298ahG interfaceC7298ahGKWHzl = C7323ahf.KWHzl();
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            pairArr[0] = C56390yDp.OLrzqt("APP_TYPE", "global");
            pairArr[1] = C56390yDp.OLrzqt("RESULT", "success");
            User userOLrzqt = EZpvd.fIwbmz().OLrzqt();
            pairArr[2] = C56390yDp.OLrzqt("UID", userOLrzqt != null ? userOLrzqt.getUid() : null);
            interfaceC7298ahGKWHzl.AEQbTJ("LUA_WALLET_BIND_RESULT_EVENT", null, C56424yEw.gEmmrt(pairArr));
            return;
        }
        RxBus.AEQbTJ(new xWW(AbstractC54840xXg.Application.AEQbTJ));
        C7323ahf.KWHzl().AEQbTJ("LUA_WALLET_BIND_RESULT_EVENT", null, C56424yEw.gEmmrt(C56390yDp.OLrzqt("APP_TYPE", "global"), C56390yDp.OLrzqt("RESULT", "fail")));
    }

    public static final void OLrzqt(AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041mov), null, null, new IndependentWalletBindCeFiUtils$startWalletCeFiBind$2$3$1$loginLauncher$1$1$1(str, abstractActivityC33041mov, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: o.fAj$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC17318fAx {
        @Override // o.InterfaceC17318fAx
        public void copydefault(gJK gjk) {
            Intrinsics.checkNotNullParameter(gjk, "");
            if (gjk instanceof gJK.Activity) {
                RxBus.AEQbTJ(new xWW(AbstractC54840xXg.FragmentManager.KWHzl));
                return;
            }
            if (gjk instanceof gJK.StateListAnimator) {
                RxBus.AEQbTJ(new xWW(AbstractC54840xXg.StateListAnimator.EZpvd));
                return;
            }
            if (gjk instanceof gJK.Application) {
                RxBus.AEQbTJ(new xWW(new AbstractC54840xXg.TaskDescription(((gJK.Application) gjk).KWHzl())));
                return;
            }
            if (Intrinsics.EZpvd(gjk, gJK.ActionBar.AEQbTJ)) {
                RxBus.AEQbTJ(new xWW(AbstractC54840xXg.ActionBar.KWHzl));
                return;
            }
            if (Intrinsics.EZpvd(gjk, gJK.FragmentManager.copydefault)) {
                RxBus.AEQbTJ(new xWW(AbstractC54840xXg.Dialog.copydefault));
                return;
            }
            if (gjk instanceof gJK.LoaderManager) {
                RxBus.AEQbTJ(new xWW(new AbstractC54840xXg.Fragment(((gJK.LoaderManager) gjk).EZpvd())));
                return;
            }
            if (gjk instanceof gJK.PendingIntent) {
                RxBus.AEQbTJ(new xWW(new AbstractC54840xXg.LoaderManager(((gJK.PendingIntent) gjk).EZpvd())));
            } else if (gjk instanceof gJK.Fragment) {
                RxBus.AEQbTJ(new xWW(AbstractC54840xXg.PendingIntent.EZpvd));
            } else if (gjk instanceof gJK.Dialog) {
                RxBus.AEQbTJ(new xWW(new AbstractC54840xXg.AssistContent(((gJK.Dialog) gjk).OLrzqt())));
            }
        }
    }

    public static final Unit copydefault(AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041mov), null, null, new IndependentWalletBindCeFiUtils$startWalletCeFiBind$2$3$1$2$1(str, abstractActivityC33041mov, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v10, types: [T, o.gJK$Activity] */
    /* JADX WARN: Type inference failed for: r6v12, types: [T, o.gJK$ActionBar] */
    /* JADX WARN: Type inference failed for: r6v8, types: [T, o.gJK$FragmentManager] */
    /* JADX WARN: Type inference failed for: r7v5, types: [T, o.gJK$LoaderManager] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(BindWalletPreCheckResult bindWalletPreCheckResult, java.lang.String str, Continuation<? super gJK> continuation) throws java.lang.Throwable {
        IndependentWalletBindCeFiUtils$handleBindWalletPreCheckResult$1 independentWalletBindCeFiUtils$handleBindWalletPreCheckResult$1;
        Ref.ObjectRef objectRef;
        if (continuation instanceof IndependentWalletBindCeFiUtils$handleBindWalletPreCheckResult$1) {
            independentWalletBindCeFiUtils$handleBindWalletPreCheckResult$1 = (IndependentWalletBindCeFiUtils$handleBindWalletPreCheckResult$1) continuation;
            int i = independentWalletBindCeFiUtils$handleBindWalletPreCheckResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                independentWalletBindCeFiUtils$handleBindWalletPreCheckResult$1.label = i - Integer.MIN_VALUE;
            } else {
                independentWalletBindCeFiUtils$handleBindWalletPreCheckResult$1 = new IndependentWalletBindCeFiUtils$handleBindWalletPreCheckResult$1(this, continuation);
            }
        }
        java.lang.Object obj = independentWalletBindCeFiUtils$handleBindWalletPreCheckResult$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = independentWalletBindCeFiUtils$handleBindWalletPreCheckResult$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            if ((bindWalletPreCheckResult instanceof BindWalletPreCheckResult.NeedAddWallet) || Intrinsics.EZpvd(bindWalletPreCheckResult, BindWalletPreCheckResult.Success.INSTANCE)) {
                CoroutineDispatcher io2 = Dispatchers.getIO();
                IndependentWalletBindCeFiUtils$handleBindWalletPreCheckResult$2 independentWalletBindCeFiUtils$handleBindWalletPreCheckResult$2 = new IndependentWalletBindCeFiUtils$handleBindWalletPreCheckResult$2(str, objectRef2, null);
                independentWalletBindCeFiUtils$handleBindWalletPreCheckResult$1.L$0 = objectRef2;
                independentWalletBindCeFiUtils$handleBindWalletPreCheckResult$1.label = 1;
                if (BuildersKt.withContext(io2, independentWalletBindCeFiUtils$handleBindWalletPreCheckResult$2, independentWalletBindCeFiUtils$handleBindWalletPreCheckResult$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else if (bindWalletPreCheckResult instanceof BindWalletPreCheckResult.NeedKYC) {
                objectRef2.element = gJK.ActionBar.AEQbTJ;
                Unit unit = Unit.INSTANCE;
            } else if (bindWalletPreCheckResult instanceof BindWalletPreCheckResult.NeedLogin) {
                objectRef2.element = gJK.Activity.AEQbTJ;
                Unit unit2 = Unit.INSTANCE;
            } else if (bindWalletPreCheckResult instanceof BindWalletPreCheckResult.NeedSwitchMainAccount) {
                objectRef2.element = gJK.FragmentManager.copydefault;
                Unit unit3 = Unit.INSTANCE;
            } else {
                if (!(bindWalletPreCheckResult instanceof BindWalletPreCheckResult.ReachedMaxAccLimit)) {
                    throw new NoWhenBranchMatchedException();
                }
                objectRef2.element = new gJK.LoaderManager(((BindWalletPreCheckResult.ReachedMaxAccLimit) bindWalletPreCheckResult).getMaxCapacity());
                Unit unit4 = Unit.INSTANCE;
            }
            objectRef = objectRef2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) independentWalletBindCeFiUtils$handleBindWalletPreCheckResult$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        return objectRef.element;
    }
}
