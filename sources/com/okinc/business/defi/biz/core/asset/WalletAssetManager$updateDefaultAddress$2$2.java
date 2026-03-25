package com.okinc.business.defi.biz.core.asset;

import com.okinc.business.defi.biz.model.ChainAddress;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C10407bnq;
import o.C10854bwM;
import o.C11283cIm;
import o.C13058cyg;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes3.dex */
public final class WalletAssetManager$updateDefaultAddress$2$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Long>>, Object> {
    final /* synthetic */ Ref.ObjectRef<ChainAddress> $chainAddress;
    final /* synthetic */ Ref.ObjectRef<C10854bwM> $coinMeta;
    final /* synthetic */ AbstractC12782ctV $wallet;
    int label;
    final /* synthetic */ C10407bnq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletAssetManager$updateDefaultAddress$2$2(C10407bnq c10407bnq, AbstractC12782ctV abstractC12782ctV, Ref.ObjectRef<C10854bwM> objectRef, Ref.ObjectRef<ChainAddress> objectRef2, Continuation<? super WalletAssetManager$updateDefaultAddress$2$2> continuation) {
        super(2, continuation);
        this.this$0 = c10407bnq;
        this.$wallet = abstractC12782ctV;
        this.$coinMeta = objectRef;
        this.$chainAddress = objectRef2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletAssetManager$updateDefaultAddress$2$2(this.this$0, this.$wallet, this.$coinMeta, this.$chainAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Long>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<Long>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<Long>> continuation) {
        return ((WalletAssetManager$updateDefaultAddress$2$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<C11283cIm> listEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return obj;
        }
        C56391yDq.AEQbTJ(obj);
        C13058cyg c13058cyg = this.this$0.fIwbmz;
        String strDbNXlk = this.$wallet.DbNXlk();
        C10854bwM c10854bwM = this.$coinMeta.element;
        if (c10854bwM != null && c10854bwM.DsrFlB()) {
            ArrayList<ChainAddress> arrayListGGvvIC = this.$wallet.gGvvIC();
            Ref.ObjectRef<ChainAddress> objectRef = this.$chainAddress;
            ArrayList<ChainAddress> arrayList = new ArrayList();
            for (Object obj2 : arrayListGGvvIC) {
                if (((ChainAddress) obj2).getCoinId() == objectRef.element.getCoinId()) {
                    arrayList.add(obj2);
                }
            }
            listEZpvd = new ArrayList<>(C56403yEb.AYXKKw(arrayList, 10));
            for (ChainAddress chainAddress : arrayList) {
                listEZpvd.add(new C11283cIm(chainAddress.getAddressType(), chainAddress.getChainId(), "", null, null, 24, null));
            }
        } else {
            listEZpvd = C56402yEa.EZpvd(new C11283cIm(this.$chainAddress.element.getAddressType(), this.$chainAddress.element.getChainId(), "", null, null, 24, null));
        }
        List<C11283cIm> listAhwBna = yDY.AhwBna();
        this.label = 1;
        Object objCopydefault2 = c13058cyg.copydefault(strDbNXlk, listEZpvd, listAhwBna, this);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }
}
