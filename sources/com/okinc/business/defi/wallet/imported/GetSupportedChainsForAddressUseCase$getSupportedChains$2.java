package com.okinc.business.defi.wallet.imported;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C10854bwM;
import o.C13092czN;
import o.C13847daM;
import o.C13853daS;
import o.C18373fhF;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC18379fhL;

/* JADX INFO: loaded from: classes18.dex */
public final class GetSupportedChainsForAddressUseCase$getSupportedChains$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends InterfaceC18379fhL.Activity>>, Object> {
    final /* synthetic */ String $account;
    final /* synthetic */ String $address;
    final /* synthetic */ boolean $isNearShortAddress;
    final /* synthetic */ boolean $isSmartContract;
    Object L$0;
    int label;
    final /* synthetic */ C18373fhF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSupportedChainsForAddressUseCase$getSupportedChains$2(String str, boolean z, String str2, boolean z2, C18373fhF c18373fhF, Continuation<? super GetSupportedChainsForAddressUseCase$getSupportedChains$2> continuation) {
        super(2, continuation);
        this.$address = str;
        this.$isSmartContract = z;
        this.$account = str2;
        this.$isNearShortAddress = z2;
        this.this$0 = c18373fhF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetSupportedChainsForAddressUseCase$getSupportedChains$2(this.$address, this.$isSmartContract, this.$account, this.$isNearShortAddress, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends InterfaceC18379fhL.Activity>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<InterfaceC18379fhL.Activity>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<InterfaceC18379fhL.Activity>> continuation) {
        return ((GetSupportedChainsForAddressUseCase$getSupportedChains$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<InterfaceC18379fhL.Activity.TaskDescription> list;
        Throwable th;
        C10854bwM c10854bwMAuCTel;
        List<C13853daS> listAEQbTJ;
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                } catch (Throwable th2) {
                    th = th2;
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            } else {
                C56391yDq.AEQbTJ(obj);
                String str = this.$address;
                boolean z = this.$isSmartContract;
                String str2 = this.$account;
                boolean z2 = this.$isNearShortAddress;
                C18373fhF c18373fhF = this.this$0;
                List listOLrzqt = C56402yEa.OLrzqt();
                if (!StringsKt__StringsKt.fARcdN((CharSequence) str)) {
                    if (z) {
                        listAEQbTJ = C13847daM.Companion.copydefault(str);
                    } else {
                        listAEQbTJ = C13847daM.Companion.AEQbTJ(str);
                    }
                    for (C13853daS c13853daS : listAEQbTJ) {
                        listOLrzqt.add(new InterfaceC18379fhL.Activity.TaskDescription(c13853daS.copydefault(), c13853daS.OLrzqt()));
                    }
                }
                if (!StringsKt__StringsKt.fARcdN((CharSequence) str2)) {
                    for (C13853daS c13853daS2 : C13847daM.Companion.AEQbTJ(str2)) {
                        listOLrzqt.add(new InterfaceC18379fhL.Activity.TaskDescription(c13853daS2.copydefault(), c13853daS2.OLrzqt()));
                    }
                    if (z2 && (c10854bwMAuCTel = c18373fhF.EZpvd.AuCTel()) != null) {
                        listOLrzqt.add(new InterfaceC18379fhL.Activity.TaskDescription(c10854bwMAuCTel, str2));
                    }
                }
                List listFARcdN = C56402yEa.fARcdN(listOLrzqt);
                C18373fhF c18373fhF2 = this.this$0;
                try {
                    Result.Application application2 = Result.Companion;
                    C13092czN c13092czN = c18373fhF2.AEQbTJ;
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listFARcdN, 10));
                    Iterator it = listFARcdN.iterator();
                    while (it.hasNext()) {
                        arrayList.add(C56443yFo.KWHzl(((InterfaceC18379fhL.Activity.TaskDescription) it.next()).KWHzl().AEQbTJ()));
                    }
                    List<Long> listQbewEr = CollectionsKt___CollectionsKt.QbewEr(arrayList);
                    this.L$0 = listFARcdN;
                    this.label = 1;
                    Object objKWHzl = c13092czN.KWHzl(listQbewEr, this);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                    list = listFARcdN;
                    obj = objKWHzl;
                } catch (Throwable th3) {
                    list = listFARcdN;
                    th = th3;
                    Result.Application application3 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl((Map) obj);
            if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                objM7377constructorimpl = C56424yEw.KWHzl();
            }
            Map map = (Map) objM7377constructorimpl;
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (InterfaceC18379fhL.Activity.TaskDescription taskDescription : list) {
                List list2 = (List) map.get(C56443yFo.KWHzl(taskDescription.KWHzl().AEQbTJ()));
                arrayList2.add(taskDescription.copydefault(list2 != null && list2.contains(taskDescription.copydefault())).AEQbTJ());
            }
            return arrayList2;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
