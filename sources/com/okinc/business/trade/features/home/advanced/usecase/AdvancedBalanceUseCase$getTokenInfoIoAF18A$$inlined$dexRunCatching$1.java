package com.okinc.business.trade.features.home.advanced.usecase;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C28196kSl;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9738bbJ;
import o.kQA;
import o.kQQ;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.trade.features.home.advanced.usecase.AdvancedBalanceUseCase$getTokenInfo-IoAF18A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedBalanceUseCase$getTokenInfoIoAF18A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ kQQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedBalanceUseCase$getTokenInfoIoAF18A$$inlined$dexRunCatching$1(Continuation continuation, kQQ kqq) {
        super(2, continuation);
        this.this$0 = kqq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedBalanceUseCase$getTokenInfoIoAF18A$$inlined$dexRunCatching$1(continuation, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return ((AdvancedBalanceUseCase$getTokenInfoIoAF18A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f9 A[Catch: all -> 0x015d, CancellationException -> 0x0174, TryCatch #2 {CancellationException -> 0x0174, all -> 0x015d, blocks: (B:8:0x0017, B:45:0x0125, B:47:0x012b, B:48:0x0141, B:50:0x0145, B:51:0x0156, B:52:0x0158, B:13:0x003e, B:36:0x00f3, B:38:0x00f9, B:42:0x010a, B:16:0x005f, B:32:0x00d0, B:19:0x006b, B:28:0x0099, B:22:0x0074, B:24:0x0084, B:25:0x0088), top: B:60:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0124 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012b A[Catch: all -> 0x015d, CancellationException -> 0x0174, TryCatch #2 {CancellationException -> 0x0174, all -> 0x015d, blocks: (B:8:0x0017, B:45:0x0125, B:47:0x012b, B:48:0x0141, B:50:0x0145, B:51:0x0156, B:52:0x0158, B:13:0x003e, B:36:0x00f3, B:38:0x00f9, B:42:0x010a, B:16:0x005f, B:32:0x00d0, B:19:0x006b, B:28:0x0099, B:22:0x0074, B:24:0x0084, B:25:0x0088), top: B:60:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0145 A[Catch: all -> 0x015d, CancellationException -> 0x0174, TryCatch #2 {CancellationException -> 0x0174, all -> 0x015d, blocks: (B:8:0x0017, B:45:0x0125, B:47:0x012b, B:48:0x0141, B:50:0x0145, B:51:0x0156, B:52:0x0158, B:13:0x003e, B:36:0x00f3, B:38:0x00f9, B:42:0x010a, B:16:0x005f, B:32:0x00d0, B:19:0x006b, B:28:0x0099, B:22:0x0074, B:24:0x0084, B:25:0x0088), top: B:60:0x000d }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        DexMultiTokenInfoBean value;
        Object objEZpvd;
        Unit unit;
        String chainId;
        Object objOLrzqt;
        DexMultiTokenInfoBean dexMultiTokenInfoBean;
        String str;
        InterfaceC9738bbJ interfaceC9738bbJ;
        kQA kqa;
        Object objCopydefault;
        String str2;
        kQA kqa2;
        String str3;
        String str4;
        DexMultiTokenInfoBean dexMultiTokenInfoBean2;
        String strEZpvd;
        Object objCopydefault2;
        AbstractC43419rot abstractC43419rot;
        Object objCopydefault3 = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            value = this.this$0.copydefault().getValue();
            if (value == null) {
                unit = Unit.INSTANCE;
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C28196kSl c28196kSl = this.this$0.AYXKKw;
            this.L$0 = value;
            this.label = 1;
            objEZpvd = c28196kSl.EZpvd(this);
            if (objEZpvd == objCopydefault3) {
                return objCopydefault3;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    str = (String) this.L$4;
                    String str5 = (String) this.L$3;
                    kqa = (kQA) this.L$2;
                    dexMultiTokenInfoBean = (DexMultiTokenInfoBean) this.L$1;
                    InterfaceC9738bbJ interfaceC9738bbJ2 = (InterfaceC9738bbJ) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    interfaceC9738bbJ = interfaceC9738bbJ2;
                    chainId = str5;
                    objOLrzqt = obj;
                    String str6 = (String) objOLrzqt;
                    C28196kSl c28196kSl2 = this.this$0.AYXKKw;
                    this.L$0 = interfaceC9738bbJ;
                    this.L$1 = dexMultiTokenInfoBean;
                    this.L$2 = kqa;
                    this.L$3 = chainId;
                    this.L$4 = str;
                    this.L$5 = str6;
                    this.label = 3;
                    objCopydefault = c28196kSl2.copydefault(this);
                    if (objCopydefault != objCopydefault3) {
                        return objCopydefault3;
                    }
                    DexMultiTokenInfoBean dexMultiTokenInfoBean3 = dexMultiTokenInfoBean;
                    str2 = str;
                    kqa2 = kqa;
                    str3 = str6;
                    str4 = chainId;
                    dexMultiTokenInfoBean2 = dexMultiTokenInfoBean3;
                    String str7 = (String) objCopydefault;
                    if (interfaceC9738bbJ == null) {
                    }
                    if (strEZpvd == null) {
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.label = 4;
                    objCopydefault2 = kqa2.copydefault(str4, str3, str2, str7, strEZpvd, this);
                    if (objCopydefault2 == objCopydefault3) {
                    }
                    abstractC43419rot = (AbstractC43419rot) objCopydefault2;
                    if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                    }
                    if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    }
                    unit = Unit.INSTANCE;
                    objM7377constructorimpl = Result.m7377constructorimpl(unit);
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objCopydefault2 = obj;
                    abstractC43419rot = (AbstractC43419rot) objCopydefault2;
                    if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                        this.this$0.KWHzl().setValue(((DexMultiTokenInfoBean) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()).getAmountNum());
                    }
                    if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                        this.this$0.KWHzl().setValue("");
                    }
                    unit = Unit.INSTANCE;
                    objM7377constructorimpl = Result.m7377constructorimpl(unit);
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                String str8 = (String) this.L$5;
                String str9 = (String) this.L$4;
                str4 = (String) this.L$3;
                kQA kqa3 = (kQA) this.L$2;
                DexMultiTokenInfoBean dexMultiTokenInfoBean4 = (DexMultiTokenInfoBean) this.L$1;
                InterfaceC9738bbJ interfaceC9738bbJ3 = (InterfaceC9738bbJ) this.L$0;
                C56391yDq.AEQbTJ(obj);
                interfaceC9738bbJ = interfaceC9738bbJ3;
                dexMultiTokenInfoBean2 = dexMultiTokenInfoBean4;
                str2 = str9;
                objCopydefault = obj;
                str3 = str8;
                kqa2 = kqa3;
                String str72 = (String) objCopydefault;
                strEZpvd = interfaceC9738bbJ == null ? interfaceC9738bbJ.EZpvd(C33129mqd.valueOf(dexMultiTokenInfoBean2.getChainId())) : null;
                if (strEZpvd == null) {
                    strEZpvd = "";
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.label = 4;
                objCopydefault2 = kqa2.copydefault(str4, str3, str2, str72, strEZpvd, this);
                if (objCopydefault2 == objCopydefault3) {
                    return objCopydefault3;
                }
                abstractC43419rot = (AbstractC43419rot) objCopydefault2;
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                }
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                }
                unit = Unit.INSTANCE;
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            value = (DexMultiTokenInfoBean) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objEZpvd = obj;
        }
        InterfaceC9738bbJ interfaceC9738bbJ4 = (InterfaceC9738bbJ) objEZpvd;
        this.this$0.KWHzl().setValue("");
        kQA kqa4 = this.this$0.OLrzqt;
        chainId = value.getChainId();
        String tokenContractAddress = value.getTokenContractAddress();
        C28196kSl c28196kSl3 = this.this$0.AYXKKw;
        this.L$0 = interfaceC9738bbJ4;
        this.L$1 = value;
        this.L$2 = kqa4;
        this.L$3 = chainId;
        this.L$4 = tokenContractAddress;
        this.label = 2;
        objOLrzqt = c28196kSl3.OLrzqt(this);
        if (objOLrzqt == objCopydefault3) {
            return objCopydefault3;
        }
        dexMultiTokenInfoBean = value;
        str = tokenContractAddress;
        interfaceC9738bbJ = interfaceC9738bbJ4;
        kqa = kqa4;
        String str62 = (String) objOLrzqt;
        C28196kSl c28196kSl22 = this.this$0.AYXKKw;
        this.L$0 = interfaceC9738bbJ;
        this.L$1 = dexMultiTokenInfoBean;
        this.L$2 = kqa;
        this.L$3 = chainId;
        this.L$4 = str;
        this.L$5 = str62;
        this.label = 3;
        objCopydefault = c28196kSl22.copydefault(this);
        if (objCopydefault != objCopydefault3) {
        }
    }
}
