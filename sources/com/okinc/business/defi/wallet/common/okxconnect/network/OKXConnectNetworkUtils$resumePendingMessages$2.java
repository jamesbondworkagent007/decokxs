package com.okinc.business.defi.wallet.common.okxconnect.network;

import com.okinc.business.defi.wallet.common.okxconnect.network.rpc.SplitMessageCache;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C16000ebf;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C56548yJl;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXConnectNetworkUtils$resumePendingMessages$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $allTopics;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ C16000ebf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXConnectNetworkUtils$resumePendingMessages$2(C16000ebf c16000ebf, List<String> list, Continuation<? super OKXConnectNetworkUtils$resumePendingMessages$2> continuation) {
        super(2, continuation);
        this.this$0 = c16000ebf;
        this.$allTopics = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKXConnectNetworkUtils$resumePendingMessages$2(this.this$0, this.$allTopics, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKXConnectNetworkUtils$resumePendingMessages$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0126  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00b6 -> B:22:0x00ba). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x014f -> B:22:0x00ba). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Iterator it;
        List<String> list;
        C16000ebf c16000ebf;
        List<String> list2;
        C16000ebf c16000ebf2;
        Iterator it2;
        SplitMessageCache splitMessageCache;
        Iterator it3;
        int i;
        boolean zBooleanValue;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            List<SplitMessageCache> listAEQbTJ = this.this$0.AuCTel.AEQbTJ();
            List<String> list3 = this.$allTopics;
            C16000ebf c16000ebf3 = this.this$0;
            it = listAEQbTJ.iterator();
            list = list3;
            c16000ebf = c16000ebf3;
            while (it.hasNext()) {
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Iterator it4 = (Iterator) this.L$4;
            SplitMessageCache splitMessageCache2 = (SplitMessageCache) this.L$3;
            it = (Iterator) this.L$2;
            c16000ebf = (C16000ebf) this.L$1;
            list = (List) this.L$0;
            C56391yDq.AEQbTJ(obj);
            if (it4.hasNext()) {
                int iIntValue = ((Number) it4.next()).intValue();
                this.L$0 = list;
                this.L$1 = c16000ebf;
                this.L$2 = it;
                this.L$3 = splitMessageCache2;
                this.L$4 = it4;
                this.I$0 = iIntValue;
                this.label = 1;
                Object objOLrzqt = c16000ebf.OLrzqt(splitMessageCache2, iIntValue, (Continuation<? super Boolean>) this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                Iterator it5 = it4;
                i = iIntValue;
                obj = objOLrzqt;
                list2 = list;
                c16000ebf2 = c16000ebf;
                it2 = it;
                splitMessageCache = splitMessageCache2;
                it3 = it5;
                zBooleanValue = ((Boolean) obj).booleanValue();
                pUU.KWHzl("OKXConnectNetworkUtils", "resumePendingMessages: package" + i + " send " + (!zBooleanValue ? "success" : "fail"));
                if (zBooleanValue) {
                    c16000ebf2.AuCTel.KWHzl(splitMessageCache.getTopic(), splitMessageCache.getPackageGroupId());
                    it = it2;
                    c16000ebf = c16000ebf2;
                    list = list2;
                } else {
                    pUU.EZpvd("OKXConnectNetworkUtils", "resumePendingMessages: delay 10 ms for package " + i);
                    this.L$0 = list2;
                    this.L$1 = c16000ebf2;
                    this.L$2 = it2;
                    this.L$3 = splitMessageCache;
                    this.L$4 = it3;
                    this.label = 2;
                    if (DelayKt.delay(10L, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    it4 = it3;
                    splitMessageCache2 = splitMessageCache;
                    it = it2;
                    c16000ebf = c16000ebf2;
                    list = list2;
                    if (it4.hasNext()) {
                    }
                }
            }
            while (it.hasNext()) {
                splitMessageCache2 = (SplitMessageCache) it.next();
                if (list.contains(splitMessageCache2.getTopic())) {
                    pUU.EZpvd("OKXConnectNetworkUtils", "resumePendingMessages start");
                    IntRange intRangeAhwBna = C56548yJl.AhwBna(0, splitMessageCache2.getTotalCount());
                    ArrayList arrayList = new ArrayList();
                    for (Integer num : intRangeAhwBna) {
                        if (!splitMessageCache2.getSentPackages().contains(C56443yFo.AEQbTJ(num.intValue()))) {
                            arrayList.add(num);
                        }
                    }
                    it4 = arrayList.iterator();
                    if (it4.hasNext()) {
                    }
                    while (it.hasNext()) {
                    }
                } else {
                    c16000ebf.AuCTel.KWHzl(splitMessageCache2.getTopic(), splitMessageCache2.getPackageGroupId());
                }
            }
            return Unit.INSTANCE;
        }
        i = this.I$0;
        it3 = (Iterator) this.L$4;
        splitMessageCache = (SplitMessageCache) this.L$3;
        it2 = (Iterator) this.L$2;
        c16000ebf2 = (C16000ebf) this.L$1;
        list2 = (List) this.L$0;
        C56391yDq.AEQbTJ(obj);
        zBooleanValue = ((Boolean) obj).booleanValue();
        if (!zBooleanValue) {
        }
        pUU.KWHzl("OKXConnectNetworkUtils", "resumePendingMessages: package" + i + " send " + (!zBooleanValue ? "success" : "fail"));
        if (zBooleanValue) {
        }
    }
}
