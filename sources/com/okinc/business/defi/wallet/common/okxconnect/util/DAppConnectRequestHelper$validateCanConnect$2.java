package com.okinc.business.defi.wallet.common.okxconnect.util;

import com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest;
import com.okinc.business.defi.wallet.common.tonconnect.ValidateCanConnectResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C13754dXa;
import o.C16011ebq;
import o.C16013ebs;
import o.C33129mqd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC13987dcu;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class DAppConnectRequestHelper$validateCanConnect$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ValidateCanConnectResult>, Object> {
    final /* synthetic */ DAppConnectRequest $dAppConnectRequest;
    final /* synthetic */ AbstractC12782ctV $wallet;
    int label;
    final /* synthetic */ C16013ebs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppConnectRequestHelper$validateCanConnect$2(DAppConnectRequest dAppConnectRequest, C16013ebs c16013ebs, AbstractC12782ctV abstractC12782ctV, Continuation<? super DAppConnectRequestHelper$validateCanConnect$2> continuation) {
        super(2, continuation);
        this.$dAppConnectRequest = dAppConnectRequest;
        this.this$0 = c16013ebs;
        this.$wallet = abstractC12782ctV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DAppConnectRequestHelper$validateCanConnect$2(this.$dAppConnectRequest, this.this$0, this.$wallet, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ValidateCanConnectResult> continuation) {
        return ((DAppConnectRequestHelper$validateCanConnect$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0103 A[LOOP:2: B:54:0x00fd->B:56:0x0103, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0154 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0181  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList arrayList;
        Iterator<T> it;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z = false;
            boolean z2 = this.$dAppConnectRequest.getProtocolVer() > 2;
            List<DAppConnectRequest.Request.RequestAccounts.Namespace> requiredNamespaces = this.$dAppConnectRequest.getRequiredNamespaces();
            C16013ebs c16013ebs = this.this$0;
            if (!(requiredNamespaces instanceof Collection) || !requiredNamespaces.isEmpty()) {
                Iterator<T> it2 = requiredNamespaces.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!c16013ebs.AkhnZx.contains(((DAppConnectRequest.Request.RequestAccounts.Namespace) it2.next()).getNamespace())) {
                        z = true;
                        break;
                    }
                }
            }
            if (!z2 && !z) {
                C16011ebq c16011ebq = this.this$0.isConnected;
                this.label = 1;
                obj = c16011ebq.copydefault(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                pUU.KWHzl("DAppConnectRequestHelper", "Unsupported request: version-" + z2 + " namespace-" + z);
                return new ValidateCanConnectResult(ValidateCanConnectResult.ErrorType.NOT_SUPPORTED, C56443yFo.AEQbTJ(C13754dXa.FragmentManager.PipHintTrackerKttrackPipAnimationHintViewflow1));
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
        } else if (i == 2) {
            C56391yDq.AEQbTJ(obj);
            if (this.$dAppConnectRequest.getHasCosmosRequest()) {
                C16013ebs c16013ebs2 = this.this$0;
                this.label = 3;
                if (c16013ebs2.OLrzqt(this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            List<String> requiredCaipChains = this.$dAppConnectRequest.getRequiredCaipChains();
            InterfaceC13987dcu.Application application = InterfaceC13987dcu.Companion;
            arrayList = new ArrayList(C56403yEb.AYXKKw(requiredCaipChains, 10));
            it = requiredCaipChains.iterator();
            while (it.hasNext()) {
            }
            if (!arrayList.isEmpty()) {
            }
            C16013ebs c16013ebs3 = this.this$0;
            AbstractC12782ctV abstractC12782ctV = this.$wallet;
            String url = this.$dAppConnectRequest.getDAppInfo().getUrl();
            this.label = 4;
            obj = c16013ebs3.copydefault(abstractC12782ctV, url, (Continuation<? super Boolean>) this);
            if (obj == objCopydefault) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                if (((Boolean) obj).booleanValue()) {
                    pUU.KWHzl("DAppConnectRequestHelper", "Error validating mpcCheck or aaCheck: " + this.$dAppConnectRequest);
                    return new ValidateCanConnectResult(ValidateCanConnectResult.ErrorType.NOT_SUPPORTED, C56443yFo.AEQbTJ(C13754dXa.FragmentManager.findViewById));
                }
                if (this.this$0.OLrzqt(this.$dAppConnectRequest, this.$wallet)) {
                    List<DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod> connectRequestMethods = this.$dAppConnectRequest.getConnectRequestMethods();
                    ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(connectRequestMethods, 10));
                    Iterator<T> it3 = connectRequestMethods.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod) it3.next()).getCaipChainId());
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : arrayList2) {
                        if (C33129mqd.OLrzqt((CharSequence) obj2)) {
                            arrayList3.add(obj2);
                        }
                    }
                    if (this.$dAppConnectRequest.getRequiredCaipChains().containsAll(arrayList3)) {
                        return new ValidateCanConnectResult(ValidateCanConnectResult.ErrorType.NONE, null, 2, null);
                    }
                    return new ValidateCanConnectResult(ValidateCanConnectResult.ErrorType.NOT_SUPPORTED, C56443yFo.AEQbTJ(C13754dXa.FragmentManager.DcMfJKRKUgwx));
                }
                return new ValidateCanConnectResult(ValidateCanConnectResult.ErrorType.WALLET_NOT_SUPPORTED, C56443yFo.AEQbTJ(C13754dXa.FragmentManager.DcMfJKRKUgwx));
            }
            C56391yDq.AEQbTJ(obj);
            List<String> requiredCaipChains2 = this.$dAppConnectRequest.getRequiredCaipChains();
            InterfaceC13987dcu.Application application2 = InterfaceC13987dcu.Companion;
            arrayList = new ArrayList(C56403yEb.AYXKKw(requiredCaipChains2, 10));
            it = requiredCaipChains2.iterator();
            while (it.hasNext()) {
                arrayList.add(application2.AEQbTJ((String) it.next()));
            }
            if (!arrayList.isEmpty()) {
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    if (((InterfaceC13987dcu) it4.next()) == null) {
                        pUU.KWHzl("DAppConnectRequestHelper", "App does not support at least one of the required chains");
                        return new ValidateCanConnectResult(ValidateCanConnectResult.ErrorType.NOT_SUPPORTED, C56443yFo.AEQbTJ(C13754dXa.FragmentManager.DcMfJKRKUgwx));
                    }
                }
            }
            C16013ebs c16013ebs32 = this.this$0;
            AbstractC12782ctV abstractC12782ctV2 = this.$wallet;
            String url2 = this.$dAppConnectRequest.getDAppInfo().getUrl();
            this.label = 4;
            obj = c16013ebs32.copydefault(abstractC12782ctV2, url2, (Continuation<? super Boolean>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            if (((Boolean) obj).booleanValue()) {
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            pUU.KWHzl("DAppConnectRequestHelper", "Encrypted storage failed to init");
            return new ValidateCanConnectResult(ValidateCanConnectResult.ErrorType.ENCRYPTED_STORAGE_NOT_INIT, C56443yFo.AEQbTJ(C13754dXa.FragmentManager.reportRunnablelambda2));
        }
        if (!this.$wallet.zLjUOn()) {
            pUU.KWHzl("DAppConnectRequestHelper", "Wallet not backed up");
            return new ValidateCanConnectResult(ValidateCanConnectResult.ErrorType.WALLET_NOT_BACKED_UP, C56443yFo.AEQbTJ(C13754dXa.FragmentManager.HJWChPdIKEqB));
        }
        if (this.$dAppConnectRequest.isTonRequested()) {
            C16013ebs c16013ebs4 = this.this$0;
            AbstractC12782ctV abstractC12782ctV3 = this.$wallet;
            this.label = 2;
            if (c16013ebs4.KWHzl(abstractC12782ctV3, (Continuation<? super ValidateCanConnectResult>) this) == objCopydefault) {
                return objCopydefault;
            }
        }
        if (this.$dAppConnectRequest.getHasCosmosRequest()) {
        }
        List<String> requiredCaipChains22 = this.$dAppConnectRequest.getRequiredCaipChains();
        InterfaceC13987dcu.Application application22 = InterfaceC13987dcu.Companion;
        arrayList = new ArrayList(C56403yEb.AYXKKw(requiredCaipChains22, 10));
        it = requiredCaipChains22.iterator();
        while (it.hasNext()) {
        }
        if (!arrayList.isEmpty()) {
        }
        C16013ebs c16013ebs322 = this.this$0;
        AbstractC12782ctV abstractC12782ctV22 = this.$wallet;
        String url22 = this.$dAppConnectRequest.getDAppInfo().getUrl();
        this.label = 4;
        obj = c16013ebs322.copydefault(abstractC12782ctV22, url22, (Continuation<? super Boolean>) this);
        if (obj == objCopydefault) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
