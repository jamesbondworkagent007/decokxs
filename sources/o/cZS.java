package o;

import com.okinc.business.defi.biz.impl.WalletReferralServiceImpl$bindDexTradeReferralInfo$1;
import com.okinc.business.defi.biz.impl.WalletReferralServiceImpl$bindReferralCode$1;
import com.okinc.business.defi.biz.impl.WalletReferralServiceImpl$bindReferralSubInviter$1;
import com.okinc.business.defi.biz.impl.WalletReferralServiceImpl$bindShortReferralCode$1;
import com.okinc.business.defi.biz.impl.WalletReferralServiceImpl$checkAndSavePreferCodeForAppLink$1;
import com.okinc.business.defi.biz.impl.WalletReferralServiceImpl$checkAttributionCodeAndSaveDeviceCode$1;
import com.okinc.business.defi.biz.impl.WalletReferralServiceImpl$checkPreferReferralCodeState$1;
import com.okinc.business.defi.biz.impl.WalletReferralServiceImpl$checkReferralCodeState$1;
import com.okinc.business.defi.biz.impl.WalletReferralServiceImpl$deleteReferralInfo$1;
import com.okinc.business.defi.biz.impl.WalletReferralServiceImpl$getShareReferralCodeFromCacheOrNetwork$1;
import com.okinc.business.defi.biz.impl.WalletReferralServiceImpl$gotoReferralDashboard$1;
import com.okinc.business.defi.biz.impl.WalletReferralServiceImpl$gotoReferralDashboardFromMore$1;
import com.okinc.business.defi.biz.impl.WalletReferralServiceImpl$showReferralCodeApplyPanel$1;
import com.okinc.business.defi.biz.impl.WalletReferralServiceImpl$triggerRetryReportReferralInfo$1;
import com.okinc.business.defi.biz.impl.WalletReferralServiceImpl$unFreezeReferralInfo$1;
import com.okinc.business.defi.biz.impl.WalletReferralServiceImpl$updateShareReferralCacheCode$1;
import com.okinc.business.defi.biz.net.bean.InviterCodeResponse;
import com.okinc.business.defi.common.utils.ReferralManager;
import com.okinc.core.util.SPUtils;
import com.okinc.wallet.api.WalletReferralSource;
import com.okinc.wallet.api.bean.ReferralInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cZS extends AbstractC43215rlA implements xWP {
    public static final Activity Companion = new Activity(null);
    public final C13934dbu KWHzl;

    public cZS(@NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.KWHzl = c13934dbu;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cZS.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.xWP
    public ReferralInfo OLrzqt(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        if (str == null || str.length() == 0) {
            pUU.copydefault("DexReferral", "getReferralInfo: accountId is null or empty");
            return null;
        }
        try {
            return ReferralManager.StateListAnimator.getInstance$default(ReferralManager.Companion, null, 1, null).copydefault(str, str2);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("DexReferral", "getReferralInfo failed", e);
            return null;
        }
    }

    @Override // o.xWP
    public ReferralInfo AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            return ReferralManager.StateListAnimator.getInstance$default(ReferralManager.Companion, null, 1, null).KWHzl(str, str2);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("DexReferral", "getReferralInfo failed", e);
            return null;
        }
    }

    @Override // o.xWP
    public void AEQbTJ(@NotNull ReferralInfo referralInfo, @NotNull java.lang.String str, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(referralInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function2, "");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new WalletReferralServiceImpl$checkPreferReferralCodeState$1(referralInfo, str, function2, null), 2, null);
    }

    @Override // o.xWP
    public void OLrzqt(@NotNull ReferralInfo referralInfo, @NotNull java.lang.String str, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(referralInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function2, "");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new WalletReferralServiceImpl$checkReferralCodeState$1(referralInfo, str, function2, null), 2, null);
    }

    @Override // o.xWP
    public void OLrzqt(@NotNull ReferralInfo referralInfo, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(referralInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new WalletReferralServiceImpl$bindDexTradeReferralInfo$1(referralInfo, str, null), 2, null);
    }

    @Override // o.xWP
    public void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull ReferralInfo referralInfo, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(referralInfo, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new WalletReferralServiceImpl$showReferralCodeApplyPanel$1(context, str, referralInfo, map, function1, null), 3, null);
    }

    @Override // o.xWP
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new WalletReferralServiceImpl$checkAndSavePreferCodeForAppLink$1(str, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.xWP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        WalletReferralServiceImpl$deleteReferralInfo$1 walletReferralServiceImpl$deleteReferralInfo$1;
        if (continuation instanceof WalletReferralServiceImpl$deleteReferralInfo$1) {
            walletReferralServiceImpl$deleteReferralInfo$1 = (WalletReferralServiceImpl$deleteReferralInfo$1) continuation;
            int i = walletReferralServiceImpl$deleteReferralInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletReferralServiceImpl$deleteReferralInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                walletReferralServiceImpl$deleteReferralInfo$1 = new WalletReferralServiceImpl$deleteReferralInfo$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = walletReferralServiceImpl$deleteReferralInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletReferralServiceImpl$deleteReferralInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                ReferralManager instance$default = ReferralManager.StateListAnimator.getInstance$default(ReferralManager.Companion, null, 1, null);
                walletReferralServiceImpl$deleteReferralInfo$1.label = 1;
                objEZpvd = instance$default.EZpvd(str, walletReferralServiceImpl$deleteReferralInfo$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            boolean zBooleanValue = ((java.lang.Boolean) objEZpvd).booleanValue();
            pUU.EZpvd("DexReferral", "deleteReferralInfo: Result=" + zBooleanValue);
            return C56443yFo.KWHzl(zBooleanValue);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("DexReferral", "WalletReferralServiceImpl: Failed to delete ReferralInfo", e);
            return C56443yFo.KWHzl(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.xWP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        WalletReferralServiceImpl$unFreezeReferralInfo$1 walletReferralServiceImpl$unFreezeReferralInfo$1;
        if (continuation instanceof WalletReferralServiceImpl$unFreezeReferralInfo$1) {
            walletReferralServiceImpl$unFreezeReferralInfo$1 = (WalletReferralServiceImpl$unFreezeReferralInfo$1) continuation;
            int i = walletReferralServiceImpl$unFreezeReferralInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletReferralServiceImpl$unFreezeReferralInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                walletReferralServiceImpl$unFreezeReferralInfo$1 = new WalletReferralServiceImpl$unFreezeReferralInfo$1(this, continuation);
            }
        }
        java.lang.Object objDjBIcL = walletReferralServiceImpl$unFreezeReferralInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletReferralServiceImpl$unFreezeReferralInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objDjBIcL);
                pUU.KWHzl("DexReferral", "unFreezeReferralInfo: accountId=" + str);
                ReferralManager instance$default = ReferralManager.StateListAnimator.getInstance$default(ReferralManager.Companion, null, 1, null);
                walletReferralServiceImpl$unFreezeReferralInfo$1.label = 1;
                objDjBIcL = instance$default.djBIcL(str, walletReferralServiceImpl$unFreezeReferralInfo$1);
                if (objDjBIcL == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objDjBIcL);
            }
            boolean zBooleanValue = ((java.lang.Boolean) objDjBIcL).booleanValue();
            pUU.KWHzl("DexReferral", "unFreezeReferralInfo: Result=" + zBooleanValue);
            return C56443yFo.KWHzl(zBooleanValue);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("DexReferral", "unFreezeReferralInfo: Failed to unFreeze ReferralInfo", e);
            return C56443yFo.KWHzl(false);
        }
    }

    @Override // o.xWP
    public void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new WalletReferralServiceImpl$triggerRetryReportReferralInfo$1(null), 2, null);
    }

    @Override // o.xWP
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        try {
            java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            boolean zCopydefault = ReferralManager.StateListAnimator.getInstance$default(ReferralManager.Companion, null, 1, null).copydefault(upperCase);
            pUU.EZpvd("DexReferral", "disablePreferReferralCode: Result=" + zCopydefault);
            return C56443yFo.KWHzl(zCopydefault);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("DexReferral", "WalletReferralServiceImpl: Failed to disablePreferReferralCode", e);
            return C56443yFo.KWHzl(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.xWP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, boolean z, @NotNull WalletReferralSource walletReferralSource, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WalletReferralServiceImpl$bindReferralCode$1 walletReferralServiceImpl$bindReferralCode$1;
        if (continuation instanceof WalletReferralServiceImpl$bindReferralCode$1) {
            walletReferralServiceImpl$bindReferralCode$1 = (WalletReferralServiceImpl$bindReferralCode$1) continuation;
            int i = walletReferralServiceImpl$bindReferralCode$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletReferralServiceImpl$bindReferralCode$1.label = i - Integer.MIN_VALUE;
            } else {
                walletReferralServiceImpl$bindReferralCode$1 = new WalletReferralServiceImpl$bindReferralCode$1(this, continuation);
            }
        }
        WalletReferralServiceImpl$bindReferralCode$1 walletReferralServiceImpl$bindReferralCode$12 = walletReferralServiceImpl$bindReferralCode$1;
        java.lang.Object obj = walletReferralServiceImpl$bindReferralCode$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletReferralServiceImpl$bindReferralCode$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.EZpvd("DexReferral", "bindReferralCode: Starting with code=" + str + ", source=" + walletReferralSource);
                ReferralManager instance$default = ReferralManager.StateListAnimator.getInstance$default(ReferralManager.Companion, null, 1, null);
                walletReferralServiceImpl$bindReferralCode$12.label = 1;
                if (instance$default.OLrzqt(context, str, false, walletReferralSource, true, map, (Continuation<? super Unit>) walletReferralServiceImpl$bindReferralCode$12) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("DexReferral", "bindReferralCode: Failed", e);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.xWP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WalletReferralServiceImpl$checkAttributionCodeAndSaveDeviceCode$1 walletReferralServiceImpl$checkAttributionCodeAndSaveDeviceCode$1;
        if (continuation instanceof WalletReferralServiceImpl$checkAttributionCodeAndSaveDeviceCode$1) {
            walletReferralServiceImpl$checkAttributionCodeAndSaveDeviceCode$1 = (WalletReferralServiceImpl$checkAttributionCodeAndSaveDeviceCode$1) continuation;
            int i = walletReferralServiceImpl$checkAttributionCodeAndSaveDeviceCode$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletReferralServiceImpl$checkAttributionCodeAndSaveDeviceCode$1.label = i - Integer.MIN_VALUE;
            } else {
                walletReferralServiceImpl$checkAttributionCodeAndSaveDeviceCode$1 = new WalletReferralServiceImpl$checkAttributionCodeAndSaveDeviceCode$1(this, continuation);
            }
        }
        java.lang.Object obj = walletReferralServiceImpl$checkAttributionCodeAndSaveDeviceCode$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletReferralServiceImpl$checkAttributionCodeAndSaveDeviceCode$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.EZpvd("DexReferral", "checkAttributionCodeAndSaveDeviceCode: Starting");
                ReferralManager instance$default = ReferralManager.StateListAnimator.getInstance$default(ReferralManager.Companion, null, 1, null);
                walletReferralServiceImpl$checkAttributionCodeAndSaveDeviceCode$1.label = 1;
                if (instance$default.AEQbTJ(walletReferralServiceImpl$checkAttributionCodeAndSaveDeviceCode$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("DexReferral", "checkAttributionCodeAndSaveDeviceCode: Failed", e);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.xWP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WalletReferralServiceImpl$bindReferralSubInviter$1 walletReferralServiceImpl$bindReferralSubInviter$1;
        if (continuation instanceof WalletReferralServiceImpl$bindReferralSubInviter$1) {
            walletReferralServiceImpl$bindReferralSubInviter$1 = (WalletReferralServiceImpl$bindReferralSubInviter$1) continuation;
            int i = walletReferralServiceImpl$bindReferralSubInviter$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletReferralServiceImpl$bindReferralSubInviter$1.label = i - Integer.MIN_VALUE;
            } else {
                walletReferralServiceImpl$bindReferralSubInviter$1 = new WalletReferralServiceImpl$bindReferralSubInviter$1(this, continuation);
            }
        }
        java.lang.Object obj = walletReferralServiceImpl$bindReferralSubInviter$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletReferralServiceImpl$bindReferralSubInviter$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.EZpvd("DexReferral", "bindReferralSubInviter: Starting with code=" + str);
                ReferralManager instance$default = ReferralManager.StateListAnimator.getInstance$default(ReferralManager.Companion, null, 1, null);
                walletReferralServiceImpl$bindReferralSubInviter$1.label = 1;
                if (instance$default.EZpvd(context, str, walletReferralServiceImpl$bindReferralSubInviter$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("DexReferral", "bindReferralSubInviter: Failed", e);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.xWP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, boolean z, @NotNull WalletReferralSource walletReferralSource, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WalletReferralServiceImpl$bindShortReferralCode$1 walletReferralServiceImpl$bindShortReferralCode$1;
        if (continuation instanceof WalletReferralServiceImpl$bindShortReferralCode$1) {
            walletReferralServiceImpl$bindShortReferralCode$1 = (WalletReferralServiceImpl$bindShortReferralCode$1) continuation;
            int i = walletReferralServiceImpl$bindShortReferralCode$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletReferralServiceImpl$bindShortReferralCode$1.label = i - Integer.MIN_VALUE;
            } else {
                walletReferralServiceImpl$bindShortReferralCode$1 = new WalletReferralServiceImpl$bindShortReferralCode$1(this, continuation);
            }
        }
        WalletReferralServiceImpl$bindShortReferralCode$1 walletReferralServiceImpl$bindShortReferralCode$12 = walletReferralServiceImpl$bindShortReferralCode$1;
        java.lang.Object obj = walletReferralServiceImpl$bindShortReferralCode$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletReferralServiceImpl$bindShortReferralCode$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.EZpvd("DexReferral", "bindShortReferralCode: Starting with code=" + str + ", source=" + walletReferralSource);
                ReferralManager instance$default = ReferralManager.StateListAnimator.getInstance$default(ReferralManager.Companion, null, 1, null);
                walletReferralServiceImpl$bindShortReferralCode$12.label = 1;
                if (instance$default.OLrzqt(context, str, true, walletReferralSource, false, map, (Continuation<? super Unit>) walletReferralServiceImpl$bindShortReferralCode$12) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("DexReferral", "bindShortReferralCode: Failed", e);
        }
        return Unit.INSTANCE;
    }

    @Override // o.xWP
    public boolean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return ReferralManager.StateListAnimator.getInstance$default(ReferralManager.Companion, null, 1, null).fetchVPNInfo(str);
    }

    @Override // o.xWP
    public void copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new WalletReferralServiceImpl$gotoReferralDashboard$1(context, null), 3, null);
    }

    @Override // o.xWP
    public void OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new WalletReferralServiceImpl$gotoReferralDashboardFromMore$1(context, null), 3, null);
    }

    @Override // o.xWP
    public boolean copydefault() {
        return ReferralManager.StateListAnimator.getInstance$default(ReferralManager.Companion, null, 1, null).valueOf();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5 A[Catch: Exception -> 0x0129, TryCatch #0 {Exception -> 0x0129, blocks: (B:13:0x0033, B:40:0x00cd, B:42:0x00d5, B:44:0x00dd, B:47:0x00e4, B:49:0x00ec, B:52:0x00f3, B:54:0x011d, B:18:0x0048, B:32:0x00ac, B:34:0x00b6, B:37:0x00be, B:56:0x0123, B:24:0x0061, B:26:0x008d, B:28:0x0093), top: B:62:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011d A[Catch: Exception -> 0x0129, TryCatch #0 {Exception -> 0x0129, blocks: (B:13:0x0033, B:40:0x00cd, B:42:0x00d5, B:44:0x00dd, B:47:0x00e4, B:49:0x00ec, B:52:0x00f3, B:54:0x011d, B:18:0x0048, B:32:0x00ac, B:34:0x00b6, B:37:0x00be, B:56:0x0123, B:24:0x0061, B:26:0x008d, B:28:0x0093), top: B:62:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.xWP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super kotlin.Pair<java.lang.String, java.lang.String>> continuation) throws java.lang.Throwable {
        WalletReferralServiceImpl$getShareReferralCodeFromCacheOrNetwork$1 walletReferralServiceImpl$getShareReferralCodeFromCacheOrNetwork$1;
        cZS czs;
        AbstractC43419rot abstractC43419rot;
        java.lang.String defaultCode;
        java.lang.String discountRate;
        if (continuation instanceof WalletReferralServiceImpl$getShareReferralCodeFromCacheOrNetwork$1) {
            walletReferralServiceImpl$getShareReferralCodeFromCacheOrNetwork$1 = (WalletReferralServiceImpl$getShareReferralCodeFromCacheOrNetwork$1) continuation;
            int i = walletReferralServiceImpl$getShareReferralCodeFromCacheOrNetwork$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletReferralServiceImpl$getShareReferralCodeFromCacheOrNetwork$1.label = i - Integer.MIN_VALUE;
            } else {
                walletReferralServiceImpl$getShareReferralCodeFromCacheOrNetwork$1 = new WalletReferralServiceImpl$getShareReferralCodeFromCacheOrNetwork$1(this, continuation);
            }
        }
        java.lang.Object objAwait = walletReferralServiceImpl$getShareReferralCodeFromCacheOrNetwork$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletReferralServiceImpl$getShareReferralCodeFromCacheOrNetwork$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwait);
                if (ReferralManager.StateListAnimator.getInstance$default(ReferralManager.Companion, null, 1, null).gEmmrt() && C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                    java.lang.String string = SPUtils.getString("SP_DEX_REFERRAL_CODE_KEY:" + str, "");
                    java.lang.String string2 = SPUtils.getString("SP_DEX_REFERRAL_RATE_KEY:" + str, "");
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) string)) {
                        return new kotlin.Pair(string, string2);
                    }
                    AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str, false);
                    walletReferralServiceImpl$getShareReferralCodeFromCacheOrNetwork$1.L$0 = this;
                    walletReferralServiceImpl$getShareReferralCodeFromCacheOrNetwork$1.L$1 = str;
                    walletReferralServiceImpl$getShareReferralCodeFromCacheOrNetwork$1.label = 1;
                    objAwait = RxAwaitKt.await(abstractC58260yxtOLrzqt, walletReferralServiceImpl$getShareReferralCodeFromCacheOrNetwork$1);
                    if (objAwait == objCopydefault) {
                        return objCopydefault;
                    }
                    czs = this;
                } else {
                    return new kotlin.Pair("", "");
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) walletReferralServiceImpl$getShareReferralCodeFromCacheOrNetwork$1.L$0;
                    C56391yDq.AEQbTJ(objAwait);
                    abstractC43419rot = (AbstractC43419rot) objAwait;
                    if (!abstractC43419rot.EZpvd()) {
                        InviterCodeResponse inviterCodeResponse = (InviterCodeResponse) abstractC43419rot.copydefault();
                        if (inviterCodeResponse == null || (defaultCode = inviterCodeResponse.getDefaultCode()) == null) {
                            defaultCode = "";
                        }
                        InviterCodeResponse inviterCodeResponse2 = (InviterCodeResponse) abstractC43419rot.copydefault();
                        if (inviterCodeResponse2 == null || (discountRate = inviterCodeResponse2.getDiscountRate()) == null) {
                            discountRate = "";
                        }
                        SPUtils.put("SP_DEX_REFERRAL_CODE_KEY:" + str, defaultCode);
                        SPUtils.put("SP_DEX_REFERRAL_RATE_KEY:" + str, discountRate);
                        return new kotlin.Pair(defaultCode, discountRate);
                    }
                    return new kotlin.Pair("", "");
                }
                str = (java.lang.String) walletReferralServiceImpl$getShareReferralCodeFromCacheOrNetwork$1.L$1;
                czs = (cZS) walletReferralServiceImpl$getShareReferralCodeFromCacheOrNetwork$1.L$0;
                C56391yDq.AEQbTJ(objAwait);
            }
            InterfaceC9780bbz interfaceC9780bbzCopydefault = ((AbstractC12782ctV) objAwait).copydefault(1L);
            java.lang.String address = interfaceC9780bbzCopydefault != null ? interfaceC9780bbzCopydefault.getAddress() : null;
            if (address != null) {
                C13934dbu c13934dbu = czs.KWHzl;
                walletReferralServiceImpl$getShareReferralCodeFromCacheOrNetwork$1.L$0 = str;
                walletReferralServiceImpl$getShareReferralCodeFromCacheOrNetwork$1.L$1 = null;
                walletReferralServiceImpl$getShareReferralCodeFromCacheOrNetwork$1.label = 2;
                objAwait = c13934dbu.djBIcL(address, walletReferralServiceImpl$getShareReferralCodeFromCacheOrNetwork$1);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
                abstractC43419rot = (AbstractC43419rot) objAwait;
                if (!abstractC43419rot.EZpvd()) {
                }
            } else {
                return new kotlin.Pair("", "");
            }
        } catch (java.lang.Exception unused) {
            return new kotlin.Pair("", "");
        }
    }

    @Override // o.xWP
    public void AEQbTJ() {
        pUU.EZpvd("DexReferral", "updateShareReferralCacheCode: Starting");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new WalletReferralServiceImpl$updateShareReferralCacheCode$1(this, null), 3, null);
    }

    @Override // o.xWP
    public java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!ReferralManager.StateListAnimator.getInstance$default(ReferralManager.Companion, null, 1, null).gEmmrt()) {
            return "";
        }
        java.lang.String string = SPUtils.getString("SP_DEX_REFERRAL_CODE_KEY:" + str, "");
        Intrinsics.copydefault((java.lang.Object) string);
        return string;
    }
}
