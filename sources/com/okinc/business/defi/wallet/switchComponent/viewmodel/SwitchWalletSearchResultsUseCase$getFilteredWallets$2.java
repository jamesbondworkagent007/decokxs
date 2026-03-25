package com.okinc.business.defi.wallet.switchComponent.viewmodel;

import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.switchComponent.viewmodel.SwitchWalletSearchResultsUseCase$getFilteredWallets$2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.AbstractC12784ctX;
import o.C17922fXg;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C59467zhb;
import o.InterfaceC17773fRt;
import o.InterfaceC9738bbJ;
import o.dTH;
import o.fDO;
import o.fDU;
import o.fRA;
import o.fRW;

/* JADX INFO: loaded from: classes5.dex */
public final class SwitchWalletSearchResultsUseCase$getFilteredWallets$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends fDU>>, Object> {
    final /* synthetic */ boolean $showTeeWalletStatus;
    Object L$0;
    int label;
    final /* synthetic */ fRW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchWalletSearchResultsUseCase$getFilteredWallets$2(fRW frw, boolean z, Continuation<? super SwitchWalletSearchResultsUseCase$getFilteredWallets$2> continuation) {
        super(2, continuation);
        this.this$0 = frw;
        this.$showTeeWalletStatus = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SwitchWalletSearchResultsUseCase$getFilteredWallets$2(this.this$0, this.$showTeeWalletStatus, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends fDU>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<fDU>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<fDU>> continuation) {
        return ((SwitchWalletSearchResultsUseCase$getFilteredWallets$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        final InterfaceC9738bbJ interfaceC9738bbJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC17773fRt interfaceC17773fRt = this.this$0.valueOf;
            this.label = 1;
            obj = interfaceC17773fRt.OLrzqt(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC9738bbJ = (InterfaceC9738bbJ) this.L$0;
                C56391yDq.AEQbTJ(obj);
                Sequence sequenceDbNXlk = C59467zhb.DbNXlk(CollectionsKt___CollectionsKt.QVAiDq((Iterable) obj), new AnonymousClass1(fRA.OLrzqt));
                final fRW frw = this.this$0;
                final boolean z = this.$showTeeWalletStatus;
                return C59467zhb.zuBGHE(C59467zhb.wlaJM(C59467zhb.fetchVPNInfo(sequenceDbNXlk, new Function1() { // from class: o.fRS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return SwitchWalletSearchResultsUseCase$getFilteredWallets$2.invokeSuspend$lambda$6(frw, z, interfaceC9738bbJ, (AbstractC12784ctX) obj2);
                    }
                })));
            }
            C56391yDq.AEQbTJ(obj);
        }
        InterfaceC9738bbJ interfaceC9738bbJ2 = (InterfaceC9738bbJ) obj;
        InterfaceC17773fRt interfaceC17773fRt2 = this.this$0.valueOf;
        this.L$0 = interfaceC9738bbJ2;
        this.label = 2;
        Object objAEQbTJ = interfaceC17773fRt2.AEQbTJ(this);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        interfaceC9738bbJ = interfaceC9738bbJ2;
        obj = objAEQbTJ;
        Sequence sequenceDbNXlk2 = C59467zhb.DbNXlk(CollectionsKt___CollectionsKt.QVAiDq((Iterable) obj), new AnonymousClass1(fRA.OLrzqt));
        final fRW frw2 = this.this$0;
        final boolean z2 = this.$showTeeWalletStatus;
        return C59467zhb.zuBGHE(C59467zhb.wlaJM(C59467zhb.fetchVPNInfo(sequenceDbNXlk2, new Function1() { // from class: o.fRS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return SwitchWalletSearchResultsUseCase$getFilteredWallets$2.invokeSuspend$lambda$6(frw2, z2, interfaceC9738bbJ, (AbstractC12784ctX) obj2);
            }
        })));
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.switchComponent.viewmodel.SwitchWalletSearchResultsUseCase$getFilteredWallets$2$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<AbstractC12784ctX, Boolean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Object obj) {
            super(1, obj, fRA.class, "filterUnsupportedRootWallets", "filterUnsupportedRootWallets(Lcom/okinc/business/defi/biz/core/wallet/RootWallet;)Z", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(AbstractC12784ctX abstractC12784ctX) {
            Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
            return Boolean.valueOf(((fRA) this.receiver).AEQbTJ(abstractC12784ctX));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fDU invokeSuspend$lambda$6(final fRW frw, final boolean z, final InterfaceC9738bbJ interfaceC9738bbJ, AbstractC12784ctX abstractC12784ctX) {
        List listZuBGHE = C59467zhb.zuBGHE(C59467zhb.fetchVPNInfo(C59467zhb.DbNXlk(C59467zhb.DbNXlk(C59467zhb.DbNXlk(C59467zhb.DbNXlk(CollectionsKt___CollectionsKt.QVAiDq(abstractC12784ctX.KWHzl()), new Function1() { // from class: o.fRU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(SwitchWalletSearchResultsUseCase$getFilteredWallets$2.invokeSuspend$lambda$6$lambda$0(frw, (AbstractC12782ctV) obj));
            }
        }), new Function1() { // from class: o.fRV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(SwitchWalletSearchResultsUseCase$getFilteredWallets$2.invokeSuspend$lambda$6$lambda$1(frw, (AbstractC12782ctV) obj));
            }
        }), new Function1() { // from class: o.fRT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(SwitchWalletSearchResultsUseCase$getFilteredWallets$2.invokeSuspend$lambda$6$lambda$2(frw, (AbstractC12782ctV) obj));
            }
        }), new Function1() { // from class: o.fRY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(SwitchWalletSearchResultsUseCase$getFilteredWallets$2.invokeSuspend$lambda$6$lambda$3(frw, (AbstractC12782ctV) obj));
            }
        }), new Function1() { // from class: o.fSb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwitchWalletSearchResultsUseCase$getFilteredWallets$2.invokeSuspend$lambda$6$lambda$5(frw, z, interfaceC9738bbJ, (AbstractC12782ctV) obj);
            }
        }));
        if (listZuBGHE.isEmpty()) {
            return null;
        }
        return new fDU(abstractC12784ctX.AuCTel(), listZuBGHE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$6$lambda$0(fRW frw, AbstractC12782ctV abstractC12782ctV) {
        return fRA.OLrzqt.EZpvd(abstractC12782ctV, frw.EZpvd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$6$lambda$1(fRW frw, AbstractC12782ctV abstractC12782ctV) {
        return fRA.OLrzqt.AEQbTJ(abstractC12782ctV, frw.valueOf, frw.KWHzl, frw.AEQbTJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$6$lambda$2(fRW frw, AbstractC12782ctV abstractC12782ctV) {
        return fRA.OLrzqt.OLrzqt(abstractC12782ctV, frw.AEQbTJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$6$lambda$3(fRW frw, AbstractC12782ctV abstractC12782ctV) {
        fRA fra = fRA.OLrzqt;
        return fra.AEQbTJ(abstractC12782ctV, frw.valueOf) && !fra.KWHzl(abstractC12782ctV, frw.copydefault);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fDO invokeSuspend$lambda$6$lambda$5(fRW frw, boolean z, InterfaceC9738bbJ interfaceC9738bbJ, AbstractC12782ctV abstractC12782ctV) {
        dTH fragmentManager;
        String strDbNXlk = abstractC12782ctV.DbNXlk();
        String strCopydefault = frw.gEmmrt.copydefault(abstractC12782ctV);
        String strAEQbTJ = abstractC12782ctV.AEQbTJ();
        ArrayList<ChainAddress> arrayListIsConnected = abstractC12782ctV.isConnected();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(arrayListIsConnected, 10));
        Iterator<T> it = arrayListIsConnected.iterator();
        while (it.hasNext()) {
            arrayList.add(((ChainAddress) it.next()).getAddress());
        }
        if (z) {
            fragmentManager = C17922fXg.OLrzqt(abstractC12782ctV);
        } else {
            fragmentManager = new dTH.FragmentManager(abstractC12782ctV.DbNXlk());
        }
        return new fDO(strDbNXlk, strAEQbTJ, strCopydefault, arrayList, fragmentManager, fRA.OLrzqt.copydefault(abstractC12782ctV, frw.OLrzqt, interfaceC9738bbJ));
    }
}
