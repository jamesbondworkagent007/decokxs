package o;

import com.okinc.business.defi.api.bean.ActivateTeeGuideModel;
import com.okinc.business.defi.biz.impl.OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$1;
import com.okinc.business.defi.biz.impl.OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$2;
import com.okinc.business.defi.biz.impl.OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$6;
import com.okinc.business.defi.biz.impl.OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$8;
import com.okinc.business.defi.biz.impl.OKWalletDeFiTEEAccountServiceImpl$startGeneralActivateSA$1;
import com.okinc.business.defi.biz.impl.OKWalletDeFiTEEAccountServiceImpl$startGeneralActivateSA$2$wallet$1;
import com.okinc.business.defi.tee.bean.CacheState;
import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.wallet.api.bean.CurrentWalletSwitchConfig;
import com.okinc.wallet.api.bean.CurrentWalletSwitchNetworkMode;
import com.okinc.wallet.api.bean.CurrentWalletSwitchTeeConfig;
import com.okinc.wallet.api.bean.FunctionConfig;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import o.ActivityC17792fSl;
import o.C12827cuN;
import o.C13754dXa;
import o.xWX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cXA extends AbstractC43215rlA implements dTQ {
    public static java.lang.Boolean EZpvd;
    public java.lang.Boolean copydefault;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    public static final class ActionBar extends C32927mmn {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C32927mmn, o.InterfaceC32926mmm
        public java.lang.String EZpvd() {
            return "mobile_web3_wallet_tee_2_mode_support_flag";
        }
    }

    public static final class TaskDescription implements InterfaceC54855xXv {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC54855xXv
        public void AEQbTJ(InterfaceC9738bbJ interfaceC9738bbJ) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC54855xXv
        public void KWHzl(InterfaceC9738bbJ interfaceC9738bbJ, long j) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        }

        @Override // o.InterfaceC54855xXv
        public void OLrzqt(long j) {
        }

        @Override // o.InterfaceC54855xXv
        public void copydefault() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC54855xXv
        public void copydefault(InterfaceC9738bbJ interfaceC9738bbJ) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cXA.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final boolean OLrzqt() {
        java.lang.Boolean bool = this.copydefault;
        if (bool != null) {
            Intrinsics.copydefault(bool);
            return bool.booleanValue();
        }
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(ABTestManager.AEQbTJ.KWHzl(new ActionBar(), AmplitudeName.WEB3));
        this.copydefault = boolValueOf;
        Intrinsics.copydefault(boolValueOf);
        return boolValueOf.booleanValue();
    }

    @Override // o.dTQ
    public boolean copydefault() {
        java.lang.Object objM7377constructorimpl;
        java.lang.String lowerCase;
        try {
            Result.Application application = Result.Companion;
            if (EZpvd == null) {
                pUU.copydefault("zqh", "IsTEEAccountFunctionEnabled == null and get gray value ");
                java.lang.String strAEQbTJ = ABTestManager.AEQbTJ.AEQbTJ("mobile_web3_wallet_tee_support_flag", AmplitudeName.WEB3);
                if (strAEQbTJ != null) {
                    lowerCase = strAEQbTJ.toLowerCase(java.util.Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                } else {
                    lowerCase = null;
                }
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(C59449zhJ.equals$default(lowerCase, "show", false, 2, null));
                EZpvd = boolValueOf;
                pUU.copydefault("zqh", "IsTEEAccountFunctionEnabled = " + boolValueOf);
            }
            java.lang.Boolean bool = EZpvd;
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(bool != null ? bool.booleanValue() : false));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            objM7377constructorimpl = java.lang.Boolean.FALSE;
        }
        return ((java.lang.Boolean) objM7377constructorimpl).booleanValue();
    }

    @Override // o.dTQ
    public boolean OLrzqt(java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        boolean z;
        AbstractC12782ctV abstractC12782ctVOLrzqt;
        try {
            Result.Application application = Result.Companion;
            z = true;
            C12827cuN instance$default = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null);
            if (str == null) {
                abstractC12782ctVOLrzqt = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(instance$default.copydefault());
            } else {
                abstractC12782ctVOLrzqt = instance$default.OLrzqt(str);
            }
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (abstractC12782ctVOLrzqt != null) {
            AbstractC12782ctV abstractC12782ctV = abstractC12782ctVOLrzqt.AubY() ? abstractC12782ctVOLrzqt : null;
            if (abstractC12782ctV != null) {
                if (!OLrzqt() && !abstractC12782ctV.OLrzqt()) {
                    z = false;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(z));
                if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                    objM7377constructorimpl = java.lang.Boolean.FALSE;
                }
                return ((java.lang.Boolean) objM7377constructorimpl).booleanValue();
            }
        }
        return false;
    }

    @Override // o.dTQ
    public void copydefault(@NotNull final android.content.Context context, @NotNull java.lang.String str, final java.lang.Boolean bool, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (copydefault()) {
            C11607cUn.OLrzqt(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str, false), (Function1<? super java.lang.Throwable, Unit>) new Function1() { // from class: o.cXy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return cXA.AEQbTJ((java.lang.Throwable) obj);
                }
            }, new Function1() { // from class: o.cXz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return cXA.OLrzqt(this.EZpvd, context, bool, str2, (AbstractC12782ctV) obj);
                }
            });
        }
    }

    public static final Unit OLrzqt(cXA cxa, android.content.Context context, java.lang.Boolean bool, java.lang.String str, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if (abstractC12782ctV.AubY()) {
            if (abstractC12782ctV.zLjUOn()) {
                cxa.copydefault(context, abstractC12782ctV, bool, str);
            } else {
                android.app.Activity activityOLrzqt = C33569myt.OLrzqt(context);
                AbstractActivityC33041mov abstractActivityC33041mov = activityOLrzqt instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activityOLrzqt : null;
                if (abstractActivityC33041mov == null) {
                    return Unit.INSTANCE;
                }
                C14325djN.showBackupTipDialog$default(new C14325djN(), abstractActivityC33041mov, abstractActivityC33041mov.getSupportFragmentManager(), abstractC12782ctV, null, 8, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.QVMIlxQVMIlx, 0, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    @Override // o.dTQ
    public dTM AEQbTJ(java.lang.String str, java.lang.Long l, boolean z) {
        C17925fXj c17925fXj = C17925fXj.EZpvd;
        dTO dtoCopydefault = c17925fXj.copydefault();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        CacheState cacheStateAEQbTJ = dtoCopydefault.AEQbTJ();
        CacheState cacheState = CacheState.Ready;
        if (cacheStateAEQbTJ != cacheState) {
            booleanRef.element = true;
        }
        if (!z) {
            if (!booleanRef.element) {
                return new dTM(cacheState, str == null ? "" : str, Intrinsics.EZpvd(dtoCopydefault.OLrzqt(), java.lang.Boolean.TRUE), true, true, 0L, 32, null);
            }
            return new dTM(CacheState.None, str == null ? "" : str, false, false, false, 0L, 32, null);
        }
        if (l == null || str == null) {
            return new dTM(CacheState.None, str == null ? "" : str, false, false, false, 0L, 32, null);
        }
        dTR dtrCopydefault = c17925fXj.copydefault(str);
        Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        if (dtrCopydefault.KWHzl() != cacheState) {
            booleanRef2.element = true;
        }
        if (booleanRef.element || booleanRef2.element) {
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$1(booleanRef, booleanRef2, str, null), 3, null);
            return new dTM(CacheState.None, str, false, false, false, 0L, 32, null);
        }
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$2(str, null), 3, null);
        C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(l.longValue());
        java.lang.Long lValueOf = c10854bwMCopydefault != null ? java.lang.Long.valueOf(c10854bwMCopydefault.QVAiDq()) : null;
        CacheState cacheState2 = (lValueOf != null && C33129mqd.KWHzl((java.util.Collection) dtoCopydefault.copydefault()) && C33129mqd.KWHzl((java.util.Collection) dtrCopydefault.AEQbTJ())) ? cacheState : CacheState.None;
        boolean zEZpvd = Intrinsics.EZpvd(dtoCopydefault.OLrzqt(), java.lang.Boolean.TRUE);
        java.util.List<java.lang.Long> listCopydefault = dtoCopydefault.copydefault();
        boolean z2 = listCopydefault != null && CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.Long>) ((java.lang.Iterable<? extends java.lang.Object>) listCopydefault), lValueOf);
        java.util.List<java.lang.Long> listAEQbTJ = dtrCopydefault.AEQbTJ();
        return new dTM(cacheState2, str, zEZpvd, z2, listAEQbTJ != null && CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.Long>) ((java.lang.Iterable<? extends java.lang.Object>) listAEQbTJ), lValueOf), 0L, 32, null);
    }

    @Override // o.dTQ
    public java.util.Map<java.lang.Long, dTM> EZpvd(java.lang.String str, @NotNull java.util.List<java.lang.Long> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        C17925fXj c17925fXj = C17925fXj.EZpvd;
        dTO dtoCopydefault = c17925fXj.copydefault();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        CacheState cacheStateAEQbTJ = dtoCopydefault.AEQbTJ();
        CacheState cacheState = CacheState.Ready;
        boolean z2 = true;
        if (cacheStateAEQbTJ != cacheState) {
            booleanRef.element = true;
        }
        if (!z) {
            if (!booleanRef.element) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
                for (java.lang.Object obj : list) {
                    linkedHashMap.put(obj, new dTM(CacheState.Ready, str == null ? "" : str, Intrinsics.EZpvd(dtoCopydefault.OLrzqt(), java.lang.Boolean.TRUE), true, true, ((java.lang.Number) obj).longValue()));
                }
                return linkedHashMap;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
            for (java.lang.Object obj2 : list) {
                linkedHashMap2.put(obj2, new dTM(CacheState.None, str == null ? "" : str, false, false, false, ((java.lang.Number) obj2).longValue()));
            }
            return linkedHashMap2;
        }
        if (!list.isEmpty() && str != null) {
            dTR dtrCopydefault = c17925fXj.copydefault(str);
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            if (dtrCopydefault.KWHzl() != cacheState) {
                booleanRef2.element = true;
            }
            if (booleanRef.element || booleanRef2.element) {
                BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$6(booleanRef, booleanRef2, str, null), 3, null);
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
                for (java.lang.Object obj3 : list) {
                    linkedHashMap3.put(obj3, new dTM(CacheState.None, str, false, false, false, ((java.lang.Number) obj3).longValue()));
                }
                return linkedHashMap3;
            }
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new OKWalletDeFiTEEAccountServiceImpl$queryTEEAccountAndChainStatus$8(str, null), 3, null);
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
            for (java.lang.Object obj4 : list) {
                long jLongValue = ((java.lang.Number) obj4).longValue();
                C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(jLongValue);
                java.lang.Long lValueOf = c10854bwMCopydefault != null ? java.lang.Long.valueOf(c10854bwMCopydefault.QVAiDq()) : null;
                CacheState cacheState2 = (lValueOf != null && C33129mqd.KWHzl((java.util.Collection) dtoCopydefault.copydefault()) && C33129mqd.KWHzl((java.util.Collection) dtrCopydefault.AEQbTJ())) ? CacheState.Ready : CacheState.None;
                boolean zEZpvd = Intrinsics.EZpvd(dtoCopydefault.OLrzqt(), java.lang.Boolean.TRUE);
                java.util.List<java.lang.Long> listCopydefault = dtoCopydefault.copydefault();
                boolean z3 = (listCopydefault == null || CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.Long>) ((java.lang.Iterable<? extends java.lang.Object>) listCopydefault), lValueOf) != z2) ? false : z2;
                java.util.List<java.lang.Long> listAEQbTJ = dtrCopydefault.AEQbTJ();
                linkedHashMap4.put(obj4, new dTM(cacheState2, str, zEZpvd, z3, (listAEQbTJ == null || CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.Long>) ((java.lang.Iterable<? extends java.lang.Object>) listAEQbTJ), lValueOf) != z2) ? false : z2, jLongValue));
                z2 = true;
            }
            return linkedHashMap4;
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
        for (java.lang.Object obj5 : list) {
            linkedHashMap5.put(obj5, new dTM(CacheState.None, str == null ? "" : str, false, false, false, ((java.lang.Number) obj5).longValue()));
        }
        return linkedHashMap5;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // o.dTQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull android.content.Context context, @NotNull ActivateTeeGuideModel activateTeeGuideModel, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        OKWalletDeFiTEEAccountServiceImpl$startGeneralActivateSA$1 oKWalletDeFiTEEAccountServiceImpl$startGeneralActivateSA$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        android.content.Context context2;
        ActivateTeeGuideModel activateTeeGuideModel2;
        if (continuation instanceof OKWalletDeFiTEEAccountServiceImpl$startGeneralActivateSA$1) {
            oKWalletDeFiTEEAccountServiceImpl$startGeneralActivateSA$1 = (OKWalletDeFiTEEAccountServiceImpl$startGeneralActivateSA$1) continuation;
            int i = oKWalletDeFiTEEAccountServiceImpl$startGeneralActivateSA$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKWalletDeFiTEEAccountServiceImpl$startGeneralActivateSA$1.label = i - Integer.MIN_VALUE;
            } else {
                oKWalletDeFiTEEAccountServiceImpl$startGeneralActivateSA$1 = new OKWalletDeFiTEEAccountServiceImpl$startGeneralActivateSA$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = oKWalletDeFiTEEAccountServiceImpl$startGeneralActivateSA$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oKWalletDeFiTEEAccountServiceImpl$startGeneralActivateSA$1.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            Result.Application application2 = Result.Companion;
            dTQ dtq = (dTQ) C43251rlk.OLrzqt(dTQ.class);
            if (dtq == null || !dtq.copydefault()) {
                pUU.copydefault("WalletServiceImpl", "Be selected for the gray");
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.copydefault("WalletServiceImpl", "error message: " + thM7380exceptionOrNullimpl.getMessage());
                }
                return Unit.INSTANCE;
            }
            CoroutineDispatcher io2 = Dispatchers.getIO();
            OKWalletDeFiTEEAccountServiceImpl$startGeneralActivateSA$2$wallet$1 oKWalletDeFiTEEAccountServiceImpl$startGeneralActivateSA$2$wallet$1 = new OKWalletDeFiTEEAccountServiceImpl$startGeneralActivateSA$2$wallet$1(activateTeeGuideModel, null);
            context2 = context;
            oKWalletDeFiTEEAccountServiceImpl$startGeneralActivateSA$1.L$0 = context2;
            oKWalletDeFiTEEAccountServiceImpl$startGeneralActivateSA$1.L$1 = activateTeeGuideModel;
            oKWalletDeFiTEEAccountServiceImpl$startGeneralActivateSA$1.label = 1;
            objWithContext = BuildersKt.withContext(io2, oKWalletDeFiTEEAccountServiceImpl$startGeneralActivateSA$2$wallet$1, oKWalletDeFiTEEAccountServiceImpl$startGeneralActivateSA$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            activateTeeGuideModel2 = activateTeeGuideModel;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ActivateTeeGuideModel activateTeeGuideModel3 = (ActivateTeeGuideModel) oKWalletDeFiTEEAccountServiceImpl$startGeneralActivateSA$1.L$1;
            android.content.Context context3 = (android.content.Context) oKWalletDeFiTEEAccountServiceImpl$startGeneralActivateSA$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            activateTeeGuideModel2 = activateTeeGuideModel3;
            context2 = context3;
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objWithContext;
        Intrinsics.copydefault(abstractC12782ctV);
        boolean zOLrzqt = C17922fXg.OLrzqt((InterfaceC9738bbJ) abstractC12782ctV);
        android.app.Activity activityOLrzqt = C33569myt.OLrzqt(context2);
        final AbstractActivityC33041mov abstractActivityC33041mov = activityOLrzqt instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activityOLrzqt : null;
        if (abstractActivityC33041mov != null) {
            if (abstractC12782ctV.AubY() && !abstractC12782ctV.zLjUOn()) {
                pUU.copydefault("WalletServiceImpl", "HD wallet and isBackup is false");
                C14325djN.showBackupTipDialog$default(new C14325djN(), abstractActivityC33041mov, abstractActivityC33041mov.getSupportFragmentManager(), abstractC12782ctV, null, 8, null);
            } else if (!abstractC12782ctV.AubY()) {
                pUU.copydefault("WalletServiceImpl", "is not HD wallet");
                C17925fXj.EZpvd.copydefault().KWHzl();
                C17877fVp.Companion.OLrzqt().EZpvd(abstractActivityC33041mov, new Function0() { // from class: o.cXC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return cXA.OLrzqt(abstractActivityC33041mov);
                    }
                }, new Function0() { // from class: o.cXB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return cXA.EZpvd();
                    }
                });
            } else if (!zOLrzqt) {
                context2.startActivity(ActivityC17792fSl.ActionBar.KWHzl.createIntent(context2, activateTeeGuideModel2));
            } else {
                C17922fXg.showSAGuide$default(context2, activateTeeGuideModel2, null, null, null, 28, null);
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(AbstractActivityC33041mov abstractActivityC33041mov) {
        xWX xwx = (xWX) C43251rlk.copydefault(xWX.class);
        androidx.fragment.app.FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        xWX.TaskDescription.showCurrentWalletSwitchScreen$default(xwx, supportFragmentManager, new CurrentWalletSwitchConfig(null, CurrentWalletSwitchNetworkMode.Ignored.OLrzqt, "", C33070mpX.AYXKKw(C13754dXa.FragmentManager.addPreRequisiteCollector), null, 1, new CurrentWalletSwitchTeeConfig(C13754dXa.FragmentManager.Slwtri, "num", "learn", C13754dXa.FragmentManager.RZOtbZ), new FunctionConfig(true, true, true, false, 8, null), 17, null), new Function2() { // from class: o.cXD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(cXA.OLrzqt((InterfaceC9738bbJ) obj, (java.lang.Long) obj2));
            }
        }, null, new TaskDescription(), 8, null);
        return Unit.INSTANCE;
    }

    public static final boolean OLrzqt(InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return interfaceC9738bbJ.AubY();
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    @Override // o.dTQ
    public void copydefault(@NotNull android.content.Context context, @NotNull InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Boolean bool, @NotNull java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            if (!C17922fXg.copydefault(interfaceC9738bbJ, context, str)) {
                fVU.Companion.AEQbTJ(context, interfaceC9738bbJ.DbNXlk(), bool);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            pUU.copydefault("WalletServiceImpl", "enterTeeReNewPageAndCheck onFailure");
            fVU.Companion.AEQbTJ(context, interfaceC9738bbJ.DbNXlk(), bool);
        }
    }

    @Override // o.dTQ
    public boolean copydefault(@NotNull java.lang.String str) {
        AbstractC12782ctV abstractC12782ctVOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        if (OLrzqt(str) && (abstractC12782ctVOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str)) != null) {
            return C17922fXg.AEQbTJ(abstractC12782ctVOLrzqt);
        }
        return false;
    }

    @Override // o.dTQ
    public boolean AEQbTJ(@NotNull java.lang.String str) {
        AbstractC12782ctV abstractC12782ctVOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        return OLrzqt(str) && (abstractC12782ctVOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str)) != null && abstractC12782ctVOLrzqt.uzCIH() == 1;
    }
}
