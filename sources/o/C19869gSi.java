package o;

import com.okinc.business.dex.trade.copytrading.edit.data.CopyTradingEditStrategyRepositoryImpl$checkCanCreateStrategy$1;
import com.okinc.business.dex.trade.copytrading.edit.data.CopyTradingEditStrategyRepositoryImpl$checkCanCreateStrategy$result$1;
import com.okinc.business.dex.trade.copytrading.edit.data.CopyTradingEditStrategyRepositoryImpl$createCopyTrade$1;
import com.okinc.business.dex.trade.copytrading.edit.data.CopyTradingEditStrategyRepositoryImpl$getDefaultConfig$1;
import com.okinc.business.dex.trade.copytrading.edit.data.CopyTradingEditStrategyRepositoryImpl$getDefaultConfig$2$result$1;
import com.okinc.business.dex.trade.copytrading.edit.data.CopyTradingEditStrategyRepositoryImpl$getSupportedChains$1;
import com.okinc.business.dex.trade.copytrading.edit.data.CopyTradingEditStrategyRepositoryImpl$getSupportedChains$2$result$1;
import com.okinc.business.dex.trade.copytrading.edit.data.CopyTradingEditStrategyRepositoryImpl$modifyCopyTrade$1;
import com.okinc.business.dex.trade.copytrading.edit.data.model.BuySettings;
import com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingDefaultConfig;
import com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingStrategy;
import com.okinc.business.dex.trade.copytrading.edit.data.model.CreateOrderResult;
import com.okinc.business.dex.trade.copytrading.edit.data.model.SellSettings;
import com.okinc.business.dex.trade.copytrading.edit.data.model.TokenFilter;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.serialization.json.JsonElement;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gSi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@yCR
public final class C19869gSi implements InterfaceC19871gSk {
    public final kYC AYXKKw;
    public final InterfaceC23225huH AhwBna;
    public java.util.List<DefiChainInfo> EZpvd;
    public final InterfaceC19867gSg KWHzl;
    public final Mutex OLrzqt;
    public final ConcurrentHashMap<java.lang.String, CopyTradingDefaultConfig> copydefault;
    public final Mutex gEmmrt;
    public final InterfaceC23234huQ valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C19869gSi(@NotNull InterfaceC19867gSg interfaceC19867gSg, @NotNull InterfaceC23234huQ interfaceC23234huQ, @NotNull kYC kyc, @NotNull InterfaceC23225huH interfaceC23225huH) {
        Intrinsics.checkNotNullParameter(interfaceC19867gSg, "");
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        Intrinsics.checkNotNullParameter(kyc, "");
        Intrinsics.checkNotNullParameter(interfaceC23225huH, "");
        this.KWHzl = interfaceC19867gSg;
        this.valueOf = interfaceC23234huQ;
        this.AYXKKw = kyc;
        this.AhwBna = interfaceC23225huH;
        this.OLrzqt = MutexKt.Mutex$default(false, 1, null);
        this.copydefault = new ConcurrentHashMap<>();
        this.gEmmrt = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX INFO: renamed from: o.gSi$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gSi.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.InterfaceC19871gSk
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super BuySettings> continuation) {
        return this.KWHzl.OLrzqt(str, continuation);
    }

    @Override // o.InterfaceC19871gSk
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull BuySettings buySettings, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objKWHzl = this.KWHzl.KWHzl(str, buySettings, continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    @Override // o.InterfaceC19871gSk
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super SellSettings> continuation) {
        return this.KWHzl.KWHzl(str, continuation);
    }

    @Override // o.InterfaceC19871gSk
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull SellSettings sellSettings, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objCopydefault = this.KWHzl.copydefault(str, sellSettings, continuation);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
    }

    @Override // o.InterfaceC19871gSk
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super TokenFilter> continuation) {
        return this.KWHzl.AEQbTJ(str, continuation);
    }

    @Override // o.InterfaceC19871gSk
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull TokenFilter tokenFilter, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objCopydefault = this.KWHzl.copydefault(str, tokenFilter, continuation);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3 A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:13:0x0035, B:31:0x009d, B:33:0x00a3, B:35:0x00be, B:37:0x00c2, B:41:0x00e9, B:42:0x00ee), top: B:49:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:13:0x0035, B:31:0x009d, B:33:0x00a3, B:35:0x00be, B:37:0x00c2, B:41:0x00e9, B:42:0x00ee), top: B:49:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC19871gSk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, java.lang.String str2, @NotNull Continuation<? super Result<CopyTradingDefaultConfig>> continuation) throws java.lang.Throwable {
        CopyTradingEditStrategyRepositoryImpl$getDefaultConfig$1 copyTradingEditStrategyRepositoryImpl$getDefaultConfig$1;
        Mutex mutex;
        C19869gSi c19869gSi;
        java.lang.Throwable th;
        C19869gSi c19869gSi2;
        java.lang.String str3;
        Mutex mutex2;
        java.lang.Object objM7377constructorimpl;
        AbstractC43419rot abstractC43419rot;
        java.lang.Object objM7377constructorimpl2;
        if (continuation instanceof CopyTradingEditStrategyRepositoryImpl$getDefaultConfig$1) {
            copyTradingEditStrategyRepositoryImpl$getDefaultConfig$1 = (CopyTradingEditStrategyRepositoryImpl$getDefaultConfig$1) continuation;
            int i = copyTradingEditStrategyRepositoryImpl$getDefaultConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                copyTradingEditStrategyRepositoryImpl$getDefaultConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                copyTradingEditStrategyRepositoryImpl$getDefaultConfig$1 = new CopyTradingEditStrategyRepositoryImpl$getDefaultConfig$1(this, continuation);
            }
        }
        java.lang.Object obj = copyTradingEditStrategyRepositoryImpl$getDefaultConfig$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = copyTradingEditStrategyRepositoryImpl$getDefaultConfig$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                mutex = this.OLrzqt;
                copyTradingEditStrategyRepositoryImpl$getDefaultConfig$1.L$0 = this;
                copyTradingEditStrategyRepositoryImpl$getDefaultConfig$1.L$1 = str;
                copyTradingEditStrategyRepositoryImpl$getDefaultConfig$1.L$2 = str2;
                copyTradingEditStrategyRepositoryImpl$getDefaultConfig$1.L$3 = mutex;
                copyTradingEditStrategyRepositoryImpl$getDefaultConfig$1.label = 1;
                if (mutex.lock(null, copyTradingEditStrategyRepositoryImpl$getDefaultConfig$1) == objCopydefault) {
                    return objCopydefault;
                }
                c19869gSi = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) copyTradingEditStrategyRepositoryImpl$getDefaultConfig$1.L$2;
                    str3 = (java.lang.String) copyTradingEditStrategyRepositoryImpl$getDefaultConfig$1.L$1;
                    c19869gSi2 = (C19869gSi) copyTradingEditStrategyRepositoryImpl$getDefaultConfig$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        abstractC43419rot = (AbstractC43419rot) obj;
                        if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
                            c19869gSi2.copydefault.put(str3, (CopyTradingDefaultConfig) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl());
                            Result.Application application = Result.Companion;
                            objM7377constructorimpl2 = Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl());
                        } else {
                            if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            pUU.AEQbTJ("CopyTradingEditStrategyRepositoryImpl", "getDefaultConfig error", (java.lang.Throwable) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl());
                            Result.Application application2 = Result.Companion;
                            objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()));
                        }
                        mutex = mutex2;
                        objM7377constructorimpl = objM7377constructorimpl2;
                        mutex.unlock(null);
                        return objM7377constructorimpl;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        mutex = mutex2;
                        mutex.unlock(null);
                        throw th;
                    }
                }
                Mutex mutex3 = (Mutex) copyTradingEditStrategyRepositoryImpl$getDefaultConfig$1.L$3;
                str2 = (java.lang.String) copyTradingEditStrategyRepositoryImpl$getDefaultConfig$1.L$2;
                java.lang.String str4 = (java.lang.String) copyTradingEditStrategyRepositoryImpl$getDefaultConfig$1.L$1;
                c19869gSi = (C19869gSi) copyTradingEditStrategyRepositoryImpl$getDefaultConfig$1.L$0;
                C56391yDq.AEQbTJ(obj);
                mutex = mutex3;
                str = str4;
            }
            CopyTradingDefaultConfig copyTradingDefaultConfig = c19869gSi.copydefault.get(str);
            if (copyTradingDefaultConfig == null) {
                CopyTradingEditStrategyRepositoryImpl$getDefaultConfig$2$result$1 copyTradingEditStrategyRepositoryImpl$getDefaultConfig$2$result$1 = new CopyTradingEditStrategyRepositoryImpl$getDefaultConfig$2$result$1(c19869gSi, str, str2, null);
                copyTradingEditStrategyRepositoryImpl$getDefaultConfig$1.L$0 = c19869gSi;
                copyTradingEditStrategyRepositoryImpl$getDefaultConfig$1.L$1 = str;
                copyTradingEditStrategyRepositoryImpl$getDefaultConfig$1.L$2 = mutex;
                copyTradingEditStrategyRepositoryImpl$getDefaultConfig$1.L$3 = null;
                copyTradingEditStrategyRepositoryImpl$getDefaultConfig$1.label = 2;
                java.lang.Object objEZpvd = kAB.EZpvd(copyTradingEditStrategyRepositoryImpl$getDefaultConfig$2$result$1, copyTradingEditStrategyRepositoryImpl$getDefaultConfig$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                c19869gSi2 = c19869gSi;
                str3 = str;
                mutex2 = mutex;
                obj = objEZpvd;
                abstractC43419rot = (AbstractC43419rot) obj;
                if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
                }
                mutex = mutex2;
                objM7377constructorimpl = objM7377constructorimpl2;
                mutex.unlock(null);
                return objM7377constructorimpl;
            }
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(copyTradingDefaultConfig);
            mutex.unlock(null);
            return objM7377constructorimpl;
        } catch (java.lang.Throwable th3) {
            th = th3;
            mutex.unlock(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0086 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0031, B:31:0x0080, B:33:0x0086, B:35:0x009f, B:37:0x00a3, B:51:0x00fe, B:52:0x0103), top: B:57:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0031, B:31:0x0080, B:33:0x0086, B:35:0x009f, B:37:0x00a3, B:51:0x00fe, B:52:0x0103), top: B:57:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC19871gSk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Continuation<? super Result<? extends java.util.List<DefiChainInfo>>> continuation) throws java.lang.Throwable {
        CopyTradingEditStrategyRepositoryImpl$getSupportedChains$1 copyTradingEditStrategyRepositoryImpl$getSupportedChains$1;
        Mutex mutex;
        C19869gSi c19869gSi;
        Mutex mutex2;
        C19869gSi c19869gSi2;
        java.lang.Object objM7377constructorimpl;
        AbstractC43419rot abstractC43419rot;
        java.lang.Object objM7377constructorimpl2;
        if (continuation instanceof CopyTradingEditStrategyRepositoryImpl$getSupportedChains$1) {
            copyTradingEditStrategyRepositoryImpl$getSupportedChains$1 = (CopyTradingEditStrategyRepositoryImpl$getSupportedChains$1) continuation;
            int i = copyTradingEditStrategyRepositoryImpl$getSupportedChains$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                copyTradingEditStrategyRepositoryImpl$getSupportedChains$1.label = i - Integer.MIN_VALUE;
            } else {
                copyTradingEditStrategyRepositoryImpl$getSupportedChains$1 = new CopyTradingEditStrategyRepositoryImpl$getSupportedChains$1(this, continuation);
            }
        }
        java.lang.Object obj = copyTradingEditStrategyRepositoryImpl$getSupportedChains$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = copyTradingEditStrategyRepositoryImpl$getSupportedChains$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                mutex = this.gEmmrt;
                copyTradingEditStrategyRepositoryImpl$getSupportedChains$1.L$0 = this;
                copyTradingEditStrategyRepositoryImpl$getSupportedChains$1.L$1 = mutex;
                copyTradingEditStrategyRepositoryImpl$getSupportedChains$1.label = 1;
                if (mutex.lock(null, copyTradingEditStrategyRepositoryImpl$getSupportedChains$1) == objCopydefault) {
                    return objCopydefault;
                }
                c19869gSi = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) copyTradingEditStrategyRepositoryImpl$getSupportedChains$1.L$1;
                    c19869gSi2 = (C19869gSi) copyTradingEditStrategyRepositoryImpl$getSupportedChains$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        abstractC43419rot = (AbstractC43419rot) obj;
                        if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
                            c19869gSi2.EZpvd = (java.util.List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                            Result.Application application = Result.Companion;
                            objM7377constructorimpl2 = Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl());
                        } else {
                            if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            pUU.AEQbTJ("CopyTradingEditStrategyRepositoryImpl", "getSupportedChains error", (java.lang.Throwable) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl());
                            Result.Application application2 = Result.Companion;
                            objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()));
                        }
                        objM7377constructorimpl = objM7377constructorimpl2;
                        mutex = mutex2;
                        mutex.unlock(null);
                        if (!Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                            return Result.m7377constructorimpl(objM7377constructorimpl);
                        }
                        Result.Application application3 = Result.Companion;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (java.lang.Object obj2 : (java.util.List) objM7377constructorimpl) {
                            if (((DefiChainInfo) obj2).getSupportCopyTrade()) {
                                arrayList.add(obj2);
                            }
                        }
                        return Result.m7377constructorimpl(arrayList);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        mutex = mutex2;
                        mutex.unlock(null);
                        throw th;
                    }
                }
                Mutex mutex3 = (Mutex) copyTradingEditStrategyRepositoryImpl$getSupportedChains$1.L$1;
                c19869gSi = (C19869gSi) copyTradingEditStrategyRepositoryImpl$getSupportedChains$1.L$0;
                C56391yDq.AEQbTJ(obj);
                mutex = mutex3;
            }
            java.util.List<DefiChainInfo> list = c19869gSi.EZpvd;
            if (list == null) {
                CopyTradingEditStrategyRepositoryImpl$getSupportedChains$2$result$1 copyTradingEditStrategyRepositoryImpl$getSupportedChains$2$result$1 = new CopyTradingEditStrategyRepositoryImpl$getSupportedChains$2$result$1(c19869gSi, null);
                copyTradingEditStrategyRepositoryImpl$getSupportedChains$1.L$0 = c19869gSi;
                copyTradingEditStrategyRepositoryImpl$getSupportedChains$1.L$1 = mutex;
                copyTradingEditStrategyRepositoryImpl$getSupportedChains$1.label = 2;
                java.lang.Object objEZpvd = kAB.EZpvd(copyTradingEditStrategyRepositoryImpl$getSupportedChains$2$result$1, copyTradingEditStrategyRepositoryImpl$getSupportedChains$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                mutex2 = mutex;
                obj = objEZpvd;
                c19869gSi2 = c19869gSi;
                abstractC43419rot = (AbstractC43419rot) obj;
                if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
                }
                objM7377constructorimpl = objM7377constructorimpl2;
                mutex = mutex2;
                mutex.unlock(null);
                if (!Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                }
            } else {
                Result.Application application4 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(list);
                mutex.unlock(null);
                if (!Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            mutex.unlock(null);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r9 != null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC19871gSk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull CopyTradingStrategy copyTradingStrategy, @NotNull Continuation<? super Result<CreateOrderResult>> continuation) throws java.lang.Throwable {
        CopyTradingEditStrategyRepositoryImpl$createCopyTrade$1 copyTradingEditStrategyRepositoryImpl$createCopyTrade$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        C19869gSi c19869gSi;
        ResponseData responseData;
        if (continuation instanceof CopyTradingEditStrategyRepositoryImpl$createCopyTrade$1) {
            copyTradingEditStrategyRepositoryImpl$createCopyTrade$1 = (CopyTradingEditStrategyRepositoryImpl$createCopyTrade$1) continuation;
            int i = copyTradingEditStrategyRepositoryImpl$createCopyTrade$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                copyTradingEditStrategyRepositoryImpl$createCopyTrade$1.label = i - Integer.MIN_VALUE;
            } else {
                copyTradingEditStrategyRepositoryImpl$createCopyTrade$1 = new CopyTradingEditStrategyRepositoryImpl$createCopyTrade$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = copyTradingEditStrategyRepositoryImpl$createCopyTrade$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = copyTradingEditStrategyRepositoryImpl$createCopyTrade$1.label;
        try {
        } catch (java.lang.Exception e) {
            actionBar = new AbstractC43419rot.ActionBar(e);
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            c19869gSi = this;
        } else if (i2 == 1) {
            copyTradingStrategy = (CopyTradingStrategy) copyTradingEditStrategyRepositoryImpl$createCopyTrade$1.L$1;
            c19869gSi = (C19869gSi) copyTradingEditStrategyRepositoryImpl$createCopyTrade$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            responseData = (ResponseData) objOLrzqt;
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
            responseData = (ResponseData) objOLrzqt;
            if (responseData.getCode() != 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
                if (stateListAnimator instanceof AbstractC43419rot.StateListAnimator) {
                }
            } else {
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                stateListAnimator = actionBar;
                if (stateListAnimator instanceof AbstractC43419rot.StateListAnimator) {
                    Result.Application application = Result.Companion;
                    return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl());
                }
                if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) stateListAnimator;
                pUU.AEQbTJ("CopyTradingEditStrategyRepositoryImpl", "createCopyTrade error", (java.lang.Throwable) actionBar2.KWHzl());
                Result.Application application2 = Result.Companion;
                return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) actionBar2.KWHzl()));
            }
        }
        InterfaceC23234huQ interfaceC23234huQ = c19869gSi.valueOf;
        copyTradingEditStrategyRepositoryImpl$createCopyTrade$1.L$0 = null;
        copyTradingEditStrategyRepositoryImpl$createCopyTrade$1.L$1 = null;
        copyTradingEditStrategyRepositoryImpl$createCopyTrade$1.label = 2;
        objOLrzqt = interfaceC23234huQ.OLrzqt(copyTradingStrategy, copyTradingEditStrategyRepositoryImpl$createCopyTrade$1);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        responseData = (ResponseData) objOLrzqt;
        if (responseData.getCode() != 0) {
        }
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        stateListAnimator = actionBar;
        if (stateListAnimator instanceof AbstractC43419rot.StateListAnimator) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r9 != null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC19871gSk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull CopyTradingStrategy copyTradingStrategy, @NotNull Continuation<? super Result<? extends JsonElement>> continuation) throws java.lang.Throwable {
        CopyTradingEditStrategyRepositoryImpl$modifyCopyTrade$1 copyTradingEditStrategyRepositoryImpl$modifyCopyTrade$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        C19869gSi c19869gSi;
        ResponseData responseData;
        if (continuation instanceof CopyTradingEditStrategyRepositoryImpl$modifyCopyTrade$1) {
            copyTradingEditStrategyRepositoryImpl$modifyCopyTrade$1 = (CopyTradingEditStrategyRepositoryImpl$modifyCopyTrade$1) continuation;
            int i = copyTradingEditStrategyRepositoryImpl$modifyCopyTrade$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                copyTradingEditStrategyRepositoryImpl$modifyCopyTrade$1.label = i - Integer.MIN_VALUE;
            } else {
                copyTradingEditStrategyRepositoryImpl$modifyCopyTrade$1 = new CopyTradingEditStrategyRepositoryImpl$modifyCopyTrade$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = copyTradingEditStrategyRepositoryImpl$modifyCopyTrade$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = copyTradingEditStrategyRepositoryImpl$modifyCopyTrade$1.label;
        try {
        } catch (java.lang.Exception e) {
            actionBar = new AbstractC43419rot.ActionBar(e);
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            c19869gSi = this;
        } else if (i2 == 1) {
            copyTradingStrategy = (CopyTradingStrategy) copyTradingEditStrategyRepositoryImpl$modifyCopyTrade$1.L$1;
            c19869gSi = (C19869gSi) copyTradingEditStrategyRepositoryImpl$modifyCopyTrade$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            responseData = (ResponseData) objKWHzl;
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
            responseData = (ResponseData) objKWHzl;
            if (responseData.getCode() != 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
                if (stateListAnimator instanceof AbstractC43419rot.StateListAnimator) {
                }
            } else {
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                stateListAnimator = actionBar;
                if (stateListAnimator instanceof AbstractC43419rot.StateListAnimator) {
                    Result.Application application = Result.Companion;
                    return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl());
                }
                if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) stateListAnimator;
                pUU.AEQbTJ("CopyTradingEditStrategyRepositoryImpl", "modifyCopyTrade error", (java.lang.Throwable) actionBar2.KWHzl());
                Result.Application application2 = Result.Companion;
                return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) actionBar2.KWHzl()));
            }
        }
        InterfaceC23234huQ interfaceC23234huQ = c19869gSi.valueOf;
        copyTradingEditStrategyRepositoryImpl$modifyCopyTrade$1.L$0 = null;
        copyTradingEditStrategyRepositoryImpl$modifyCopyTrade$1.L$1 = null;
        copyTradingEditStrategyRepositoryImpl$modifyCopyTrade$1.label = 2;
        objKWHzl = interfaceC23234huQ.KWHzl(copyTradingStrategy, copyTradingEditStrategyRepositoryImpl$modifyCopyTrade$1);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        responseData = (ResponseData) objKWHzl;
        if (responseData.getCode() != 0) {
        }
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        stateListAnimator = actionBar;
        if (stateListAnimator instanceof AbstractC43419rot.StateListAnimator) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) {
        CopyTradingEditStrategyRepositoryImpl$checkCanCreateStrategy$1 copyTradingEditStrategyRepositoryImpl$checkCanCreateStrategy$1;
        if (continuation instanceof CopyTradingEditStrategyRepositoryImpl$checkCanCreateStrategy$1) {
            copyTradingEditStrategyRepositoryImpl$checkCanCreateStrategy$1 = (CopyTradingEditStrategyRepositoryImpl$checkCanCreateStrategy$1) continuation;
            int i = copyTradingEditStrategyRepositoryImpl$checkCanCreateStrategy$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                copyTradingEditStrategyRepositoryImpl$checkCanCreateStrategy$1.label = i - Integer.MIN_VALUE;
            } else {
                copyTradingEditStrategyRepositoryImpl$checkCanCreateStrategy$1 = new CopyTradingEditStrategyRepositoryImpl$checkCanCreateStrategy$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = copyTradingEditStrategyRepositoryImpl$checkCanCreateStrategy$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = copyTradingEditStrategyRepositoryImpl$checkCanCreateStrategy$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            CopyTradingEditStrategyRepositoryImpl$checkCanCreateStrategy$result$1 copyTradingEditStrategyRepositoryImpl$checkCanCreateStrategy$result$1 = new CopyTradingEditStrategyRepositoryImpl$checkCanCreateStrategy$result$1(this, str, null);
            copyTradingEditStrategyRepositoryImpl$checkCanCreateStrategy$1.label = 1;
            objEZpvd = kAB.EZpvd(copyTradingEditStrategyRepositoryImpl$checkCanCreateStrategy$result$1, copyTradingEditStrategyRepositoryImpl$checkCanCreateStrategy$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objEZpvd;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(C56443yFo.KWHzl(true));
        }
        if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC43419rot.ActionBar actionBar = (AbstractC43419rot.ActionBar) abstractC43419rot;
        pUU.AEQbTJ("CopyTradingEditStrategyRepositoryImpl", "checkCanCreateStrategy error", (java.lang.Throwable) actionBar.KWHzl());
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) actionBar.KWHzl()));
    }

    @Override // o.InterfaceC19871gSk
    public void OLrzqt() {
        this.copydefault.clear();
    }
}
