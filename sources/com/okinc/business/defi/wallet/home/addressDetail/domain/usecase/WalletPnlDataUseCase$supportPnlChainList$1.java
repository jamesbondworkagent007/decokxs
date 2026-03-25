package com.okinc.business.defi.wallet.home.addressDetail.domain.usecase;

import com.okinc.business.defi.biz.database.extra.entity.SupportPnlChainEntity;
import com.okinc.business.defi.biz.net.bean.SupportPnlChainResponse;
import com.okinc.business.defi.biz.net.bean.WalletSupportPnlChainListResponse;
import com.okinc.network.okg.response.OKServerException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC43419rot;
import o.C10856bwO;
import o.C15835eXa;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.eWV;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletPnlDataUseCase$supportPnlChainList$1 extends SuspendLambda implements Function2<FlowCollector<? super List<? extends SupportPnlChainResponse>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C15835eXa this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletPnlDataUseCase$supportPnlChainList$1(C15835eXa c15835eXa, Continuation<? super WalletPnlDataUseCase$supportPnlChainList$1> continuation) {
        super(2, continuation);
        this.this$0 = c15835eXa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WalletPnlDataUseCase$supportPnlChainList$1 walletPnlDataUseCase$supportPnlChainList$1 = new WalletPnlDataUseCase$supportPnlChainList$1(this.this$0, continuation);
        walletPnlDataUseCase$supportPnlChainList$1.L$0 = obj;
        return walletPnlDataUseCase$supportPnlChainList$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends SupportPnlChainResponse>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super List<SupportPnlChainResponse>>) flowCollector, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super List<SupportPnlChainResponse>> flowCollector, Continuation<? super Unit> continuation) {
        return ((WalletPnlDataUseCase$supportPnlChainList$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0151 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0159  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        AbstractC43419rot abstractC43419rot;
        C15835eXa c15835eXa;
        WalletSupportPnlChainListResponse walletSupportPnlChainListResponse;
        eWV ewv;
        List<SupportPnlChainResponse> chains;
        List<SupportPnlChainEntity> listAhwBna;
        CoroutineDispatcher io2;
        AbstractC43419rot abstractC43419rot2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            eWV ewv2 = this.this$0.KWHzl;
            CoroutineDispatcher io3 = Dispatchers.getIO();
            this.L$0 = flowCollector;
            this.label = 1;
            obj = ewv2.EZpvd(io3, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    flowCollector = (FlowCollector) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    C15835eXa c15835eXa2 = this.this$0;
                    this.L$0 = flowCollector;
                    this.label = 3;
                    obj = c15835eXa2.EZpvd(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    abstractC43419rot = (AbstractC43419rot) obj;
                    c15835eXa = this.this$0;
                    if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                    }
                    if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    }
                    return Unit.INSTANCE;
                }
                if (i == 3) {
                    flowCollector = (FlowCollector) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    abstractC43419rot = (AbstractC43419rot) obj;
                    c15835eXa = this.this$0;
                    if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                        WalletSupportPnlChainListResponse walletSupportPnlChainListResponse2 = (WalletSupportPnlChainListResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                        List<SupportPnlChainResponse> chains2 = walletSupportPnlChainListResponse2.getChains();
                        if (chains2 == null) {
                            chains2 = yDY.AhwBna();
                        }
                        this.L$0 = c15835eXa;
                        this.L$1 = abstractC43419rot;
                        this.L$2 = walletSupportPnlChainListResponse2;
                        this.label = 4;
                        if (flowCollector.emit(chains2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        walletSupportPnlChainListResponse = walletSupportPnlChainListResponse2;
                        ewv = c15835eXa.KWHzl;
                        chains = walletSupportPnlChainListResponse.getChains();
                        if (chains != null) {
                        }
                        io2 = Dispatchers.getIO();
                        this.L$0 = abstractC43419rot;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 5;
                        if (ewv.EZpvd(listAhwBna, io2, this) != objCopydefault) {
                        }
                    }
                    if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractC43419rot2 = (AbstractC43419rot) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    abstractC43419rot = abstractC43419rot2;
                    if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                        C10856bwO.copydefault("WalletPnlDataUseCase", 0, "pnlUseCase: get remote support chain list error", (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl());
                    }
                    return Unit.INSTANCE;
                }
                walletSupportPnlChainListResponse = (WalletSupportPnlChainListResponse) this.L$2;
                AbstractC43419rot abstractC43419rot3 = (AbstractC43419rot) this.L$1;
                c15835eXa = (C15835eXa) this.L$0;
                C56391yDq.AEQbTJ(obj);
                abstractC43419rot = abstractC43419rot3;
                ewv = c15835eXa.KWHzl;
                chains = walletSupportPnlChainListResponse.getChains();
                if (chains != null) {
                    listAhwBna = yDY.AhwBna();
                } else {
                    listAhwBna = new ArrayList<>(C56403yEb.AYXKKw(chains, 10));
                    for (SupportPnlChainResponse supportPnlChainResponse : chains) {
                        Long chainId = supportPnlChainResponse.getChainId();
                        long jLongValue = chainId != null ? chainId.longValue() : -1L;
                        String chainName = supportPnlChainResponse.getChainName();
                        String str = "";
                        if (chainName == null) {
                            chainName = "";
                        }
                        String chainLogo = supportPnlChainResponse.getChainLogo();
                        if (chainLogo != null) {
                            str = chainLogo;
                        }
                        listAhwBna.add(new SupportPnlChainEntity(jLongValue, chainName, str));
                    }
                }
                io2 = Dispatchers.getIO();
                this.L$0 = abstractC43419rot;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 5;
                if (ewv.EZpvd(listAhwBna, io2, this) != objCopydefault) {
                    return objCopydefault;
                }
                abstractC43419rot2 = abstractC43419rot;
                abstractC43419rot = abstractC43419rot2;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                }
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        List<SupportPnlChainEntity> list = (List) obj;
        if (true ^ list.isEmpty()) {
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (SupportPnlChainEntity supportPnlChainEntity : list) {
                arrayList.add(new SupportPnlChainResponse(C56443yFo.KWHzl(supportPnlChainEntity.getChainId()), supportPnlChainEntity.getChainName(), supportPnlChainEntity.getChainLogo()));
            }
            this.L$0 = flowCollector;
            this.label = 2;
            if (flowCollector.emit(arrayList, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        C15835eXa c15835eXa22 = this.this$0;
        this.L$0 = flowCollector;
        this.label = 3;
        obj = c15835eXa22.EZpvd(this);
        if (obj == objCopydefault) {
        }
        abstractC43419rot = (AbstractC43419rot) obj;
        c15835eXa = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
        }
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }
}
