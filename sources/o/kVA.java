package o;

import com.okinc.business.dexlogic.bean.SellMemeConfigBean;
import com.okinc.business.trade.features.home.meme.repository.MemeSellConfigRepositoryImpl$getMemeSellConfig$1;
import com.okinc.business.trade.features.home.meme.repository.MemeSellConfigRepositoryImpl$getMemeSellConfig$2;
import com.okinc.network.okg.response.OKServerException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kVA implements InterfaceC28291kVz {
    public final java.util.List<SellMemeConfigBean> EZpvd;
    public final InterfaceC23234huQ KWHzl;

    @yCM
    public kVA(@NotNull InterfaceC23234huQ interfaceC23234huQ) {
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        this.KWHzl = interfaceC23234huQ;
        this.EZpvd = new java.util.ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC28291kVz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<SellMemeConfigBean>, OKServerException>> continuation) throws java.lang.Throwable {
        MemeSellConfigRepositoryImpl$getMemeSellConfig$1 memeSellConfigRepositoryImpl$getMemeSellConfig$1;
        kVA kva;
        if (continuation instanceof MemeSellConfigRepositoryImpl$getMemeSellConfig$1) {
            memeSellConfigRepositoryImpl$getMemeSellConfig$1 = (MemeSellConfigRepositoryImpl$getMemeSellConfig$1) continuation;
            int i = memeSellConfigRepositoryImpl$getMemeSellConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeSellConfigRepositoryImpl$getMemeSellConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                memeSellConfigRepositoryImpl$getMemeSellConfig$1 = new MemeSellConfigRepositoryImpl$getMemeSellConfig$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = memeSellConfigRepositoryImpl$getMemeSellConfig$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = memeSellConfigRepositoryImpl$getMemeSellConfig$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            MemeSellConfigRepositoryImpl$getMemeSellConfig$2 memeSellConfigRepositoryImpl$getMemeSellConfig$2 = new MemeSellConfigRepositoryImpl$getMemeSellConfig$2(this, null);
            memeSellConfigRepositoryImpl$getMemeSellConfig$1.L$0 = this;
            memeSellConfigRepositoryImpl$getMemeSellConfig$1.label = 1;
            objEZpvd = kAB.EZpvd(memeSellConfigRepositoryImpl$getMemeSellConfig$2, memeSellConfigRepositoryImpl$getMemeSellConfig$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            kva = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kva = (kVA) memeSellConfigRepositoryImpl$getMemeSellConfig$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objEZpvd;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            java.util.List list = (java.util.List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            kva.EZpvd.clear();
            kva.EZpvd.addAll(list);
        }
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            kva.EZpvd.clear();
        }
        return abstractC43419rot;
    }

    @Override // o.InterfaceC28291kVz
    public SellMemeConfigBean AEQbTJ(@NotNull java.lang.String str) {
        java.lang.String str2;
        java.lang.Object next;
        byte b;
        byte b2;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = this.EZpvd.iterator();
        while (true) {
            str2 = null;
            b2 = 0;
            b = 0;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((SellMemeConfigBean) next).getChainId(), (java.lang.Object) str)) {
                break;
            }
        }
        SellMemeConfigBean sellMemeConfigBean = (SellMemeConfigBean) next;
        if (sellMemeConfigBean != null) {
            return sellMemeConfigBean;
        }
        SellMemeConfigBean sellMemeConfigBean2 = (SellMemeConfigBean) CollectionsKt___CollectionsKt.firstOrNull(this.EZpvd);
        if (sellMemeConfigBean2 != null) {
            return sellMemeConfigBean2;
        }
        return new SellMemeConfigBean(str2, (java.util.List) (b == true ? 1 : 0), 3, (DefaultConstructorMarker) (b2 == true ? 1 : 0));
    }
}
