package com.okinc.business.trade.features.home.meme.viewmodel.transaction;

import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.kVY;
import o.kXM;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeModeTransactionViewModel$requestMemeModeConfig$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TokenBase $currencyToken;
    final /* synthetic */ boolean $fallbackToSupportedToken;
    final /* synthetic */ yHO<TokenBase, TokenBase, String, Unit> $resultCallback;
    final /* synthetic */ String $sourceType;
    final /* synthetic */ TokenBase $tokenBase;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MemeModeTransactionViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.yHO<? super com.okinc.business.dex.api.bean.TokenBase, ? super com.okinc.business.dex.api.bean.TokenBase, ? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MemeModeTransactionViewModel$requestMemeModeConfig$1(MemeModeTransactionViewModel memeModeTransactionViewModel, TokenBase tokenBase, String str, TokenBase tokenBase2, boolean z, yHO<? super TokenBase, ? super TokenBase, ? super String, Unit> yho, Continuation<? super MemeModeTransactionViewModel$requestMemeModeConfig$1> continuation) {
        super(2, continuation);
        this.this$0 = memeModeTransactionViewModel;
        this.$tokenBase = tokenBase;
        this.$sourceType = str;
        this.$currencyToken = tokenBase2;
        this.$fallbackToSupportedToken = z;
        this.$resultCallback = yho;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeModeTransactionViewModel$requestMemeModeConfig$1(this.this$0, this.$tokenBase, this.$sourceType, this.$currencyToken, this.$fallbackToSupportedToken, this.$resultCallback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeModeTransactionViewModel$requestMemeModeConfig$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [318=5] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080 A[Catch: all -> 0x0055, Exception -> 0x0058, TryCatch #1 {Exception -> 0x0058, blocks: (B:6:0x0014, B:9:0x0021, B:61:0x0181, B:63:0x018f, B:66:0x01b0, B:11:0x002f, B:55:0x015b, B:14:0x0038, B:50:0x012c, B:52:0x013e, B:58:0x016b, B:17:0x0046, B:42:0x00e5, B:46:0x010e, B:18:0x004b, B:19:0x0050, B:29:0x007c, B:31:0x0080, B:33:0x0099, B:35:0x00a1, B:38:0x00bb, B:43:0x00f0, B:47:0x0111, B:26:0x006b), top: B:74:0x0009, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0111 A[Catch: all -> 0x0055, Exception -> 0x0058, TryCatch #1 {Exception -> 0x0058, blocks: (B:6:0x0014, B:9:0x0021, B:61:0x0181, B:63:0x018f, B:66:0x01b0, B:11:0x002f, B:55:0x015b, B:14:0x0038, B:50:0x012c, B:52:0x013e, B:58:0x016b, B:17:0x0046, B:42:0x00e5, B:46:0x010e, B:18:0x004b, B:19:0x0050, B:29:0x007c, B:31:0x0080, B:33:0x0099, B:35:0x00a1, B:38:0x00bb, B:43:0x00f0, B:47:0x0111, B:26:0x006b), top: B:74:0x0009, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013e A[Catch: all -> 0x0055, Exception -> 0x0058, TryCatch #1 {Exception -> 0x0058, blocks: (B:6:0x0014, B:9:0x0021, B:61:0x0181, B:63:0x018f, B:66:0x01b0, B:11:0x002f, B:55:0x015b, B:14:0x0038, B:50:0x012c, B:52:0x013e, B:58:0x016b, B:17:0x0046, B:42:0x00e5, B:46:0x010e, B:18:0x004b, B:19:0x0050, B:29:0x007c, B:31:0x0080, B:33:0x0099, B:35:0x00a1, B:38:0x00bb, B:43:0x00f0, B:47:0x0111, B:26:0x006b), top: B:74:0x0009, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016b A[Catch: all -> 0x0055, Exception -> 0x0058, TRY_ENTER, TryCatch #1 {Exception -> 0x0058, blocks: (B:6:0x0014, B:9:0x0021, B:61:0x0181, B:63:0x018f, B:66:0x01b0, B:11:0x002f, B:55:0x015b, B:14:0x0038, B:50:0x012c, B:52:0x013e, B:58:0x016b, B:17:0x0046, B:42:0x00e5, B:46:0x010e, B:18:0x004b, B:19:0x0050, B:29:0x007c, B:31:0x0080, B:33:0x0099, B:35:0x00a1, B:38:0x00bb, B:43:0x00f0, B:47:0x0111, B:26:0x006b), top: B:74:0x0009, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018f A[Catch: all -> 0x0055, Exception -> 0x0058, TryCatch #1 {Exception -> 0x0058, blocks: (B:6:0x0014, B:9:0x0021, B:61:0x0181, B:63:0x018f, B:66:0x01b0, B:11:0x002f, B:55:0x015b, B:14:0x0038, B:50:0x012c, B:52:0x013e, B:58:0x016b, B:17:0x0046, B:42:0x00e5, B:46:0x010e, B:18:0x004b, B:19:0x0050, B:29:0x007c, B:31:0x0080, B:33:0x0099, B:35:0x00a1, B:38:0x00bb, B:43:0x00f0, B:47:0x0111, B:26:0x006b), top: B:74:0x0009, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b0 A[Catch: all -> 0x0055, Exception -> 0x0058, TRY_LEAVE, TryCatch #1 {Exception -> 0x0058, blocks: (B:6:0x0014, B:9:0x0021, B:61:0x0181, B:63:0x018f, B:66:0x01b0, B:11:0x002f, B:55:0x015b, B:14:0x0038, B:50:0x012c, B:52:0x013e, B:58:0x016b, B:17:0x0046, B:42:0x00e5, B:46:0x010e, B:18:0x004b, B:19:0x0050, B:29:0x007c, B:31:0x0080, B:33:0x0099, B:35:0x00a1, B:38:0x00bb, B:43:0x00f0, B:47:0x0111, B:26:0x006b), top: B:74:0x0009, outer: #0 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Result result;
        String chainId;
        MemeModeTransactionViewModel memeModeTransactionViewModel;
        TokenBase tokenBase;
        Unit unit;
        String str;
        String strKWHzl;
        Object objEZpvd;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        try {
            try {
            } catch (Exception e) {
                this.this$0.EZpvd(e, this.$tokenBase);
            }
            switch (this.label) {
                case 0:
                    C56391yDq.AEQbTJ(obj);
                    this.this$0.EZpvd().setValue(C56443yFo.KWHzl(true));
                    kVY kvy = this.this$0.zsXlph;
                    TokenBase tokenBase2 = this.$tokenBase;
                    this.label = 1;
                    objAEQbTJ = kvy.AEQbTJ(tokenBase2, this);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    result = (Result) objAEQbTJ;
                    if (result == null) {
                        this.this$0.fARcdN = true;
                        Object objM7386unboximpl = result.m7386unboximpl();
                        MemeModeTransactionViewModel memeModeTransactionViewModel2 = this.this$0;
                        TokenBase tokenBase3 = this.$tokenBase;
                        boolean z = this.$fallbackToSupportedToken;
                        yHO<TokenBase, TokenBase, String, Unit> yho = this.$resultCallback;
                        TokenBase tokenBase4 = this.$currencyToken;
                        Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                        if (thM7380exceptionOrNullimpl2 == null) {
                            kVY.ActionBar actionBar = (kVY.ActionBar) objM7386unboximpl;
                            if (memeModeTransactionViewModel2.AEQbTJ(tokenBase3)) {
                                DexMultiTokenInfoBean dexMultiTokenInfoBeanOLrzqt = actionBar.OLrzqt();
                                DexMultiTokenInfoBean dexMultiTokenInfoBeanKWHzl = actionBar.KWHzl();
                                kXM kxmEZpvd = actionBar.EZpvd();
                                Function2 function2EZpvd = memeModeTransactionViewModel2.EZpvd((yHO<? super TokenBase, ? super TokenBase, ? super String, Unit>) yho, actionBar.AEQbTJ());
                                this.L$0 = memeModeTransactionViewModel2;
                                this.L$1 = tokenBase3;
                                this.label = 3;
                                if (memeModeTransactionViewModel2.EZpvd(dexMultiTokenInfoBeanOLrzqt, dexMultiTokenInfoBeanKWHzl, kxmEZpvd, tokenBase3, (Function2<? super TokenBase, ? super TokenBase, Unit>) function2EZpvd, (Continuation<? super Unit>) this) == objCopydefault) {
                                    return objCopydefault;
                                }
                                memeModeTransactionViewModel = memeModeTransactionViewModel2;
                                tokenBase = tokenBase3;
                                memeModeTransactionViewModel.EZpvd(tokenBase.getChainId());
                                memeModeTransactionViewModel.OLrzqt(tokenBase);
                            } else {
                                String chainId2 = tokenBase3.getChainId();
                                Function2 function2EZpvd2 = memeModeTransactionViewModel2.EZpvd((yHO<? super TokenBase, ? super TokenBase, ? super String, Unit>) yho, actionBar.AEQbTJ());
                                this.label = 2;
                                if (memeModeTransactionViewModel2.KWHzl(chainId2, tokenBase3, z, (Function2<? super TokenBase, ? super TokenBase, Unit>) function2EZpvd2, (Continuation<? super Unit>) this) == objCopydefault) {
                                    return objCopydefault;
                                }
                            }
                        } else {
                            Function2 function2EZpvd3 = memeModeTransactionViewModel2.EZpvd((yHO<? super TokenBase, ? super TokenBase, ? super String, Unit>) yho, memeModeTransactionViewModel2.KWHzl(tokenBase4, tokenBase3.getChainId()));
                            this.label = 4;
                            if (memeModeTransactionViewModel2.EZpvd(thM7380exceptionOrNullimpl2, tokenBase3, z, null, null, function2EZpvd3, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                    this.this$0.fARcdN = false;
                    chainId = this.$tokenBase.getChainId();
                    MemeModeTransactionViewModel memeModeTransactionViewModel3 = this.this$0;
                    String str2 = this.$sourceType;
                    this.L$0 = chainId;
                    this.label = 5;
                    if (memeModeTransactionViewModel3.EZpvd(str2, (Continuation<? super Unit>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                    str = chainId;
                    strKWHzl = this.this$0.KWHzl(this.$currencyToken, str);
                    if (this.this$0.AEQbTJ(this.$tokenBase)) {
                        MemeModeTransactionViewModel memeModeTransactionViewModel4 = this.this$0;
                        TokenBase tokenBase5 = this.$tokenBase;
                        boolean z2 = this.$fallbackToSupportedToken;
                        Function2 function2EZpvd4 = memeModeTransactionViewModel4.EZpvd((yHO<? super TokenBase, ? super TokenBase, ? super String, Unit>) this.$resultCallback, strKWHzl);
                        this.L$0 = null;
                        this.label = 6;
                        if (memeModeTransactionViewModel4.KWHzl(str, tokenBase5, z2, (Function2<? super TokenBase, ? super TokenBase, Unit>) function2EZpvd4, (Continuation<? super Unit>) this) == objCopydefault) {
                            return objCopydefault;
                        }
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                    MemeModeTransactionViewModel memeModeTransactionViewModel5 = this.this$0;
                    String tokenContractAddress = this.$tokenBase.getTokenContractAddress();
                    this.L$0 = str;
                    this.L$1 = strKWHzl;
                    this.label = 7;
                    objEZpvd = memeModeTransactionViewModel5.EZpvd(str, tokenContractAddress, strKWHzl, (Continuation<? super Result<Pair<DexMultiTokenInfoBean, DexMultiTokenInfoBean>>>) this);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    String str3 = strKWHzl;
                    String str4 = str;
                    MemeModeTransactionViewModel memeModeTransactionViewModel6 = this.this$0;
                    TokenBase tokenBase6 = this.$tokenBase;
                    yHO<TokenBase, TokenBase, String, Unit> yho2 = this.$resultCallback;
                    boolean z3 = this.$fallbackToSupportedToken;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
                    if (thM7380exceptionOrNullimpl != null) {
                        Pair pair = (Pair) objEZpvd;
                        DexMultiTokenInfoBean dexMultiTokenInfoBean = (DexMultiTokenInfoBean) pair.component1();
                        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = (DexMultiTokenInfoBean) pair.component2();
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 8;
                        if (memeModeTransactionViewModel6.copydefault(dexMultiTokenInfoBean, dexMultiTokenInfoBean2, tokenBase6, str4, str3, yho2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        Function2 function2EZpvd5 = memeModeTransactionViewModel6.EZpvd((yHO<? super TokenBase, ? super TokenBase, ? super String, Unit>) yho2, str3);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 9;
                        if (memeModeTransactionViewModel6.EZpvd(thM7380exceptionOrNullimpl, tokenBase6, z3, null, null, function2EZpvd5, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    this.this$0.EZpvd().setValue(C56443yFo.KWHzl(false));
                    return Unit.INSTANCE;
                case 1:
                    C56391yDq.AEQbTJ(obj);
                    objAEQbTJ = obj;
                    result = (Result) objAEQbTJ;
                    if (result == null) {
                    }
                    break;
                case 2:
                case 4:
                    C56391yDq.AEQbTJ(obj);
                    unit = Unit.INSTANCE;
                    return unit;
                case 3:
                    tokenBase = (TokenBase) this.L$1;
                    memeModeTransactionViewModel = (MemeModeTransactionViewModel) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    memeModeTransactionViewModel.EZpvd(tokenBase.getChainId());
                    memeModeTransactionViewModel.OLrzqt(tokenBase);
                    unit = Unit.INSTANCE;
                    return unit;
                case 5:
                    chainId = (String) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    str = chainId;
                    strKWHzl = this.this$0.KWHzl(this.$currencyToken, str);
                    if (this.this$0.AEQbTJ(this.$tokenBase)) {
                    }
                    break;
                case 6:
                    C56391yDq.AEQbTJ(obj);
                    unit = Unit.INSTANCE;
                    return unit;
                case 7:
                    strKWHzl = (String) this.L$1;
                    str = (String) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objEZpvd = ((Result) obj).m7386unboximpl();
                    String str32 = strKWHzl;
                    String str42 = str;
                    MemeModeTransactionViewModel memeModeTransactionViewModel62 = this.this$0;
                    TokenBase tokenBase62 = this.$tokenBase;
                    yHO<TokenBase, TokenBase, String, Unit> yho22 = this.$resultCallback;
                    boolean z32 = this.$fallbackToSupportedToken;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    this.this$0.EZpvd().setValue(C56443yFo.KWHzl(false));
                    return Unit.INSTANCE;
                case 8:
                case 9:
                    C56391yDq.AEQbTJ(obj);
                    this.this$0.EZpvd().setValue(C56443yFo.KWHzl(false));
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } finally {
            this.this$0.EZpvd().setValue(C56443yFo.KWHzl(false));
        }
    }
}
