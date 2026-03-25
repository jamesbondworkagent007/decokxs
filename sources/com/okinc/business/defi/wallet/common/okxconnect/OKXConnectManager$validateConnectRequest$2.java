package com.okinc.business.defi.wallet.common.okxconnect;

import com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest;
import com.okinc.business.defi.wallet.common.tonconnect.ValidateCanConnectResult;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC12782ctV;
import o.C13754dXa;
import o.C15935eaT;
import o.C16000ebf;
import o.C16013ebs;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXConnectManager$validateConnectRequest$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ValidateCanConnectResult>, Object> {
    final /* synthetic */ String $connectRequestStr;
    final /* synthetic */ String $topicAndCidStr;
    final /* synthetic */ boolean $useShortUrl;
    final /* synthetic */ AbstractC12782ctV $wallet;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ C15935eaT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXConnectManager$validateConnectRequest$2(String str, C15935eaT c15935eaT, boolean z, String str2, AbstractC12782ctV abstractC12782ctV, Continuation<? super OKXConnectManager$validateConnectRequest$2> continuation) {
        super(2, continuation);
        this.$connectRequestStr = str;
        this.this$0 = c15935eaT;
        this.$useShortUrl = z;
        this.$topicAndCidStr = str2;
        this.$wallet = abstractC12782ctV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKXConnectManager$validateConnectRequest$2(this.$connectRequestStr, this.this$0, this.$useShortUrl, this.$topicAndCidStr, this.$wallet, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ValidateCanConnectResult> continuation) {
        return ((OKXConnectManager$validateConnectRequest$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e2 A[PHI: r10
  0x01e2: PHI (r10v49 java.lang.Object) = (r10v48 java.lang.Object), (r10v0 java.lang.Object) binds: [B:59:0x01df, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C15935eaT c15935eaT;
        AbstractC12782ctV abstractC12782ctV;
        DAppConnectRequest dAppConnectRequest;
        Pair<String, String> pairCopydefault;
        Object objOLrzqt;
        DAppConnectRequest dAppConnectRequest2;
        Pair<String, String> pair;
        C15935eaT c15935eaT2;
        DAppConnectRequest dAppConnectRequest3;
        Pair<String, String> pair2;
        C15935eaT c15935eaT3;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                pUU.KWHzl("OKXConnectManager", "New connect request: " + this.$connectRequestStr);
                this.this$0.isConnected = null;
                MutableSharedFlow mutableSharedFlow = this.this$0.ejfBZ;
                this.label = 1;
                if (mutableSharedFlow.emit(null, this) == objCopydefault) {
                    return objCopydefault;
                }
                C16000ebf c16000ebf = this.this$0.fetchVPNInfo;
                this.label = 2;
                obj = c16000ebf.EZpvd(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                if (((Boolean) obj).booleanValue()) {
                    if (this.$useShortUrl) {
                        pairCopydefault = this.this$0.OLrzqt.copydefault(this.$topicAndCidStr);
                        C15935eaT c15935eaT4 = this.this$0;
                        String first = pairCopydefault.getFirst();
                        this.L$0 = pairCopydefault;
                        this.label = 3;
                        obj = c15935eaT4.gEmmrt(first, this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                        DAppConnectRequest dAppConnectRequest4 = (DAppConnectRequest) obj;
                        C15935eaT c15935eaT5 = this.this$0;
                        C16000ebf c16000ebf2 = c15935eaT5.fetchVPNInfo;
                        this.L$0 = pairCopydefault;
                        this.L$1 = dAppConnectRequest4;
                        this.L$2 = c15935eaT5;
                        this.label = 4;
                        objOLrzqt = c16000ebf2.OLrzqt(this);
                        if (objOLrzqt != objCopydefault) {
                            return objCopydefault;
                        }
                        dAppConnectRequest2 = dAppConnectRequest4;
                        obj = objOLrzqt;
                        pair = pairCopydefault;
                        c15935eaT2 = c15935eaT5;
                        c15935eaT2.isConnected = (String) obj;
                        if (dAppConnectRequest2 == null) {
                            C15935eaT c15935eaT6 = this.this$0;
                            String first2 = pair.getFirst();
                            this.L$0 = pair;
                            this.L$1 = dAppConnectRequest2;
                            this.L$2 = null;
                            this.label = 5;
                            if (c15935eaT6.copydefault(first2, (Continuation<? super Unit>) this) == objCopydefault) {
                                return objCopydefault;
                            }
                            dAppConnectRequest3 = dAppConnectRequest2;
                            pair2 = pair;
                            if (!this.this$0.OLrzqt.OLrzqt(pair2.getSecond(), dAppConnectRequest3.getClientId())) {
                                this.this$0.AEQbTJ = dAppConnectRequest3;
                                C16013ebs c16013ebs = this.this$0.OLrzqt;
                                AbstractC12782ctV abstractC12782ctV2 = this.$wallet;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.label = 6;
                                obj = c16013ebs.KWHzl(dAppConnectRequest3, abstractC12782ctV2, this);
                                return obj == objCopydefault ? objCopydefault : obj;
                            }
                            pUU.copydefault("OKXConnectManager", "Failed to decode connect request");
                            return new ValidateCanConnectResult(ValidateCanConnectResult.ErrorType.RISKY_CONNECTION, C56443yFo.AEQbTJ(C13754dXa.FragmentManager.reportRunnablelambda2));
                        }
                        pUU.copydefault("OKXConnectManager", "Failed to decode connect request");
                        return new ValidateCanConnectResult(ValidateCanConnectResult.ErrorType.NOT_SUPPORTED, C56443yFo.AEQbTJ(C13754dXa.FragmentManager.reportRunnablelambda2));
                    }
                    Object objKWHzl = this.this$0.OLrzqt.KWHzl(this.$connectRequestStr);
                    c15935eaT = this.this$0;
                    AbstractC12782ctV abstractC12782ctV3 = this.$wallet;
                    if (Result.m7384isSuccessimpl(objKWHzl)) {
                        DAppConnectRequest dAppConnectRequest5 = (DAppConnectRequest) objKWHzl;
                        C16000ebf c16000ebf3 = c15935eaT.fetchVPNInfo;
                        String topic = dAppConnectRequest5.getTopic();
                        this.L$0 = c15935eaT;
                        this.L$1 = abstractC12782ctV3;
                        this.L$2 = dAppConnectRequest5;
                        this.label = 7;
                        if (c16000ebf3.EZpvd(topic, true, true, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        abstractC12782ctV = abstractC12782ctV3;
                        dAppConnectRequest = dAppConnectRequest5;
                        C16000ebf c16000ebf4 = c15935eaT.fetchVPNInfo;
                        this.L$0 = c15935eaT;
                        this.L$1 = abstractC12782ctV;
                        this.L$2 = dAppConnectRequest;
                        this.L$3 = c15935eaT;
                        this.label = 8;
                        obj = c16000ebf4.OLrzqt(this);
                        if (obj != objCopydefault) {
                            return objCopydefault;
                        }
                        c15935eaT3 = c15935eaT;
                        c15935eaT.isConnected = (String) obj;
                        c15935eaT3.AEQbTJ = dAppConnectRequest;
                        C16013ebs c16013ebs2 = c15935eaT3.OLrzqt;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 9;
                        obj = c16013ebs2.KWHzl(dAppConnectRequest, abstractC12782ctV, this);
                        return obj != objCopydefault ? objCopydefault : obj;
                    }
                    Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
                    if (thM7380exceptionOrNullimpl != null) {
                        pUU.AEQbTJ("OKXConnectManager", "Failed to decode connect request - " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
                        return new ValidateCanConnectResult(ValidateCanConnectResult.ErrorType.NOT_SUPPORTED, C56443yFo.AEQbTJ(C13754dXa.FragmentManager.PipHintTrackerKttrackPipAnimationHintViewflow1));
                    }
                }
                return new ValidateCanConnectResult(ValidateCanConnectResult.ErrorType.NOT_SUPPORTED, C56443yFo.AEQbTJ(C13754dXa.FragmentManager.reportRunnablelambda2));
            case 1:
                C56391yDq.AEQbTJ(obj);
                C16000ebf c16000ebf5 = this.this$0.fetchVPNInfo;
                this.label = 2;
                obj = c16000ebf5.EZpvd(this);
                if (obj == objCopydefault) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
                return new ValidateCanConnectResult(ValidateCanConnectResult.ErrorType.NOT_SUPPORTED, C56443yFo.AEQbTJ(C13754dXa.FragmentManager.reportRunnablelambda2));
            case 2:
                C56391yDq.AEQbTJ(obj);
                if (((Boolean) obj).booleanValue()) {
                }
                return new ValidateCanConnectResult(ValidateCanConnectResult.ErrorType.NOT_SUPPORTED, C56443yFo.AEQbTJ(C13754dXa.FragmentManager.reportRunnablelambda2));
            case 3:
                pairCopydefault = (Pair) this.L$0;
                C56391yDq.AEQbTJ(obj);
                DAppConnectRequest dAppConnectRequest42 = (DAppConnectRequest) obj;
                C15935eaT c15935eaT52 = this.this$0;
                C16000ebf c16000ebf22 = c15935eaT52.fetchVPNInfo;
                this.L$0 = pairCopydefault;
                this.L$1 = dAppConnectRequest42;
                this.L$2 = c15935eaT52;
                this.label = 4;
                objOLrzqt = c16000ebf22.OLrzqt(this);
                if (objOLrzqt != objCopydefault) {
                }
                break;
            case 4:
                c15935eaT2 = (C15935eaT) this.L$2;
                dAppConnectRequest2 = (DAppConnectRequest) this.L$1;
                pair = (Pair) this.L$0;
                C56391yDq.AEQbTJ(obj);
                c15935eaT2.isConnected = (String) obj;
                if (dAppConnectRequest2 == null) {
                }
                break;
            case 5:
                dAppConnectRequest3 = (DAppConnectRequest) this.L$1;
                pair2 = (Pair) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (!this.this$0.OLrzqt.OLrzqt(pair2.getSecond(), dAppConnectRequest3.getClientId())) {
                }
                break;
            case 6:
                C56391yDq.AEQbTJ(obj);
            case 7:
                DAppConnectRequest dAppConnectRequest6 = (DAppConnectRequest) this.L$2;
                AbstractC12782ctV abstractC12782ctV4 = (AbstractC12782ctV) this.L$1;
                C15935eaT c15935eaT7 = (C15935eaT) this.L$0;
                C56391yDq.AEQbTJ(obj);
                ((Result) obj).m7386unboximpl();
                dAppConnectRequest = dAppConnectRequest6;
                c15935eaT = c15935eaT7;
                abstractC12782ctV = abstractC12782ctV4;
                C16000ebf c16000ebf42 = c15935eaT.fetchVPNInfo;
                this.L$0 = c15935eaT;
                this.L$1 = abstractC12782ctV;
                this.L$2 = dAppConnectRequest;
                this.L$3 = c15935eaT;
                this.label = 8;
                obj = c16000ebf42.OLrzqt(this);
                if (obj != objCopydefault) {
                }
                break;
            case 8:
                c15935eaT = (C15935eaT) this.L$3;
                dAppConnectRequest = (DAppConnectRequest) this.L$2;
                abstractC12782ctV = (AbstractC12782ctV) this.L$1;
                c15935eaT3 = (C15935eaT) this.L$0;
                C56391yDq.AEQbTJ(obj);
                c15935eaT.isConnected = (String) obj;
                c15935eaT3.AEQbTJ = dAppConnectRequest;
                C16013ebs c16013ebs22 = c15935eaT3.OLrzqt;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 9;
                obj = c16013ebs22.KWHzl(dAppConnectRequest, abstractC12782ctV, this);
                if (obj != objCopydefault) {
                }
                break;
            case 9:
                C56391yDq.AEQbTJ(obj);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
