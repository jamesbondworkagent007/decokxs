package com.okinc.business.defi.wallet.mine.viewmodel;

import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.productmatrix.api.bean.StringPair;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC12784ctX;
import o.AbstractC58260yxt;
import o.C12827cuN;
import o.C14728dqt;
import o.C17304fAj;
import o.C19307fyn;
import o.C19310fyq;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC32807mkZ;
import o.InterfaceC8107awW;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class WalletMineViewModel$loadSettingsData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ C19307fyn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletMineViewModel$loadSettingsData$1(C19307fyn c19307fyn, Continuation<? super WalletMineViewModel$loadSettingsData$1> continuation) {
        super(2, continuation);
        this.this$0 = c19307fyn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletMineViewModel$loadSettingsData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletMineViewModel$loadSettingsData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r12v1, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r12v16, resolved type: boolean */
    /* JADX WARN: Can't wrap try/catch for region: R(9:126|(1:(1:(17:6|130|7|8|33|38|(1:40)|41|(1:43)|44|(1:46)(2:47|(1:52)(1:51))|53|(1:67)(1:66)|(1:72)(1:71)|(1:74)|75|(12:76|(1:78)(1:79)|80|(4:85|(3:88|(2:139|96)(1:95)|86)|136|97)(1:97)|98|(4:103|(3:106|(2:134|108)(1:135)|104)|133|109)(1:109)|110|(1:112)(1:113)|114|(1:116)(1:117)|118|(3:132|120|121)(1:122)))(2:13|14))(2:15|16))(3:17|18|(1:20))|21|25|(1:27)|28|128|29|(1:31)(14:32|33|38|(0)|41|(0)|44|(0)(0)|53|(2:55|67)(2:59|67)|(2:69|72)(0)|(0)|75|(13:76|(0)(0)|80|(5:82|85|(1:86)|136|97)(0)|98|(5:100|103|(1:104)|133|109)(0)|110|(0)(0)|114|(0)(0)|118|(0)(0)|122))) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0224 A[LOOP:0: B:76:0x0108->B:122:0x0224, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        AbstractC12782ctV abstractC12782ctV;
        Object objAwait;
        AbstractC12782ctV abstractC12782ctV2;
        Object objM7377constructorimpl2;
        List<AbstractC12784ctX> listAhwBna;
        PageType pageType;
        InterfaceC8107awW interfaceC8107awW;
        boolean z;
        boolean z2;
        MutableStateFlow mutableStateFlow;
        C19307fyn c19307fyn;
        Object value;
        StringPair[] stringPairArr;
        boolean z3;
        boolean z4;
        Iterator it;
        boolean z5;
        Object objAwait2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        char c = 0;
        try {
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C19307fyn c19307fyn2 = this.this$0;
                Result.Application application2 = Result.Companion;
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = c19307fyn2.djBIcL.copydefault(false);
                this.label = 1;
                objAwait2 = RxAwaitKt.await(abstractC58260yxtCopydefault, this);
                if (objAwait2 == objCopydefault) {
                    return objCopydefault;
                }
            } else if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                objAwait2 = obj;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC12782ctV2 = (AbstractC12782ctV) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    objAwait = obj;
                    objM7377constructorimpl2 = Result.m7377constructorimpl((List) objAwait);
                } catch (Throwable th2) {
                    th = th2;
                    abstractC12782ctV = abstractC12782ctV2;
                    Result.Application application3 = Result.Companion;
                    objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    abstractC12782ctV2 = abstractC12782ctV;
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
                    objM7377constructorimpl2 = null;
                }
                listAhwBna = (List) objM7377constructorimpl2;
                if (listAhwBna == null) {
                    listAhwBna = yDY.AhwBna();
                }
                C19307fyn c19307fyn3 = this.this$0;
                if (abstractC12782ctV2 != null) {
                    pageType = PageType.PRE_LOGIN;
                } else {
                    pageType = (abstractC12782ctV2.getFieldNames() || !AbstractC12782ctV.isCustomNetworkSupport$default(abstractC12782ctV2, false, 1, null)) ? PageType.LOGIN_AA : PageType.LOGIN_EOA;
                }
                c19307fyn3.gEmmrt = pageType;
                C14728dqt c14728dqt = C14728dqt.KWHzl;
                z = c14728dqt.KWHzl() ? !(c14728dqt.KWHzl() || (interfaceC8107awW = this.this$0.EZpvd) == null || !interfaceC8107awW.OLrzqt() || abstractC12782ctV2 == null) : !(!C17304fAj.EZpvd.hDKMBd() || abstractC12782ctV2 == null);
                z2 = !z && this.this$0.AEQbTJ();
                if (z2) {
                    this.this$0.djBIcL();
                }
                mutableStateFlow = this.this$0.AEQbTJ;
                c19307fyn = this.this$0;
                while (true) {
                    value = mutableStateFlow.getValue();
                    stringPairArr = new StringPair[8];
                    stringPairArr[c] = new StringPair("hw", String.valueOf(abstractC12782ctV2 == null ? 1 : c));
                    stringPairArr[1] = new StringPair("iwa", String.valueOf(C14728dqt.KWHzl.KWHzl()));
                    z3 = listAhwBna instanceof Collection;
                    if (z3 || !listAhwBna.isEmpty()) {
                        for (AbstractC12784ctX abstractC12784ctX : listAhwBna) {
                            if (abstractC12784ctX.fJNWhG() == WalletType.HDWallet || abstractC12784ctX.fJNWhG() == WalletType.KeyWallet || abstractC12784ctX.fJNWhG() == WalletType.TonWallet) {
                                z4 = true;
                                break;
                            }
                        }
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    stringPairArr[2] = new StringPair("sb", String.valueOf(z4));
                    stringPairArr[3] = new StringPair("sec", String.valueOf(z));
                    stringPairArr[4] = new StringPair("sct", String.valueOf(z2));
                    if (z3 || !listAhwBna.isEmpty()) {
                        it = listAhwBna.iterator();
                        while (it.hasNext()) {
                            if (((AbstractC12784ctX) it.next()).fJNWhG() == WalletType.MPCWallet) {
                                z5 = true;
                                break;
                            }
                        }
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    stringPairArr[5] = new StringPair("sse", String.valueOf(z5));
                    stringPairArr[6] = new StringPair("scn", String.valueOf(c19307fyn.copydefault() != PageType.LOGIN_EOA));
                    stringPairArr[7] = new StringPair("sds", String.valueOf(((InterfaceC32807mkZ) C43251rlk.copydefault(InterfaceC32807mkZ.class)).KWHzl()));
                    if (!mutableStateFlow.compareAndSet(value, new C19310fyq(yDY.gEmmrt(stringPairArr), c19307fyn.copydefault() != PageType.PRE_LOGIN, c19307fyn.copydefault.hasNewVersion()))) {
                        return Unit.INSTANCE;
                    }
                    c = 0;
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl((AbstractC12782ctV) objAwait2);
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            abstractC12782ctV = (AbstractC12782ctV) objM7377constructorimpl;
            this.this$0.AYXKKw = abstractC12782ctV;
            C19307fyn c19307fyn4 = this.this$0;
            Result.Application application4 = Result.Companion;
            AbstractC58260yxt allRootWallets$default = C12827cuN.getAllRootWallets$default(c19307fyn4.djBIcL, true, false, 2, null);
            this.L$0 = abstractC12782ctV;
            this.label = 2;
            objAwait = RxAwaitKt.await(allRootWallets$default, this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            abstractC12782ctV2 = abstractC12782ctV;
            objM7377constructorimpl2 = Result.m7377constructorimpl((List) objAwait);
            if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
            }
            listAhwBna = (List) objM7377constructorimpl2;
            if (listAhwBna == null) {
            }
            C19307fyn c19307fyn32 = this.this$0;
            if (abstractC12782ctV2 != null) {
            }
            c19307fyn32.gEmmrt = pageType;
            C14728dqt c14728dqt2 = C14728dqt.KWHzl;
            if (c14728dqt2.KWHzl()) {
            }
            if (z) {
            }
            if (z2) {
            }
            mutableStateFlow = this.this$0.AEQbTJ;
            c19307fyn = this.this$0;
            while (true) {
                value = mutableStateFlow.getValue();
                stringPairArr = new StringPair[8];
                stringPairArr[c] = new StringPair("hw", String.valueOf(abstractC12782ctV2 == null ? 1 : c));
                stringPairArr[1] = new StringPair("iwa", String.valueOf(C14728dqt.KWHzl.KWHzl()));
                z3 = listAhwBna instanceof Collection;
                if (z3) {
                    while (r13.hasNext()) {
                    }
                    z4 = false;
                }
                stringPairArr[2] = new StringPair("sb", String.valueOf(z4));
                stringPairArr[3] = new StringPair("sec", String.valueOf(z));
                stringPairArr[4] = new StringPair("sct", String.valueOf(z2));
                if (z3) {
                    it = listAhwBna.iterator();
                    while (it.hasNext()) {
                    }
                    z5 = false;
                }
                stringPairArr[5] = new StringPair("sse", String.valueOf(z5));
                stringPairArr[6] = new StringPair("scn", String.valueOf(c19307fyn.copydefault() != PageType.LOGIN_EOA));
                stringPairArr[7] = new StringPair("sds", String.valueOf(((InterfaceC32807mkZ) C43251rlk.copydefault(InterfaceC32807mkZ.class)).KWHzl()));
                if (!mutableStateFlow.compareAndSet(value, new C19310fyq(yDY.gEmmrt(stringPairArr), c19307fyn.copydefault() != PageType.PRE_LOGIN, c19307fyn.copydefault.hasNewVersion()))) {
                }
                c = 0;
            }
        } catch (CancellationException e2) {
            throw e2;
        }
    }
}
