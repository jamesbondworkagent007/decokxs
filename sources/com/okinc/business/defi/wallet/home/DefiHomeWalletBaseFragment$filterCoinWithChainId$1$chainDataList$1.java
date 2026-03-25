package com.okinc.business.defi.wallet.home;

import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.wallet.home.DefiHomeWalletBaseFragment$filterCoinWithChainId$1$chainDataList$1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.AbstractC12782ctV;
import o.C10525bqB;
import o.C10529bqF;
import o.C10598brV;
import o.C10854bwM;
import o.C10953byF;
import o.C10954byG;
import o.C15625ePg;
import o.C33129mqd;
import o.C56391yDq;
import o.C56407yEf;
import o.C56442yFn;
import o.C56443yFo;
import o.eUG;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiHomeWalletBaseFragment$filterCoinWithChainId$1$chainDataList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ArrayList<eUG>>, Object> {
    final /* synthetic */ long $chainId;
    final /* synthetic */ List<eUG> $listToFilter;
    Object L$0;
    int label;
    final /* synthetic */ C15625ePg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiHomeWalletBaseFragment$filterCoinWithChainId$1$chainDataList$1(long j, C15625ePg c15625ePg, List<eUG> list, Continuation<? super DefiHomeWalletBaseFragment$filterCoinWithChainId$1$chainDataList$1> continuation) {
        super(2, continuation);
        this.$chainId = j;
        this.this$0 = c15625ePg;
        this.$listToFilter = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiHomeWalletBaseFragment$filterCoinWithChainId$1$chainDataList$1(this.$chainId, this.this$0, this.$listToFilter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ArrayList<eUG>> continuation) {
        return ((DefiHomeWalletBaseFragment$filterCoinWithChainId$1$chainDataList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ec  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList arrayList;
        C10525bqB c10525bqBKWHzl;
        C10525bqB c10525bqB;
        String strFJNWhG;
        List listEZpvd;
        Object next;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            long j = this.$chainId;
            int i3 = 5;
            if (j >= 0) {
                AbstractC12782ctV value = this.this$0.AuCTelauCTel().fARcdN().getValue();
                Map<String, List<C10525bqB>> mapHrNTAI = value != null ? value.hrNTAI() : null;
                List<eUG> list = this.$listToFilter;
                C15625ePg c15625ePg = this.this$0;
                long j2 = this.$chainId;
                int i4 = 0;
                int i5 = 0;
                for (Object obj2 : list) {
                    if (i5 < 0) {
                        yDY.AYXKKw();
                    }
                    eUG eug = (eUG) obj2;
                    if (eug.ejfBZ() == i2) {
                        C56443yFo.KWHzl(arrayList3.add(eug));
                    } else if (eug.ejfBZ() == i3) {
                        C56443yFo.KWHzl(arrayList2.add(eug));
                    } else {
                        long jEZpvd = C10953byF.KWHzl.EZpvd(eug.djBIcL());
                        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(C56443yFo.KWHzl(jEZpvd));
                        if (c10854bwMKWHzl == null || !c10854bwMKWHzl.giSNqX()) {
                            AbstractC12782ctV value2 = c15625ePg.AuCTelauCTel().fARcdN().getValue();
                            if (value2 != null && (c10525bqBKWHzl = value2.KWHzl(jEZpvd, (Integer) null)) != null && c10525bqBKWHzl.AEQbTJ() == j2) {
                                arrayList2.add(eug);
                            }
                        } else if (mapHrNTAI == null) {
                            c10525bqB = null;
                            if (c10525bqB != null) {
                                boolean zAEQbTJ = C33129mqd.AEQbTJ(c10525bqB.fIwbmz(), C56443yFo.AEQbTJ(i4));
                                eUG eugOLrzqt = c15625ePg.OLrzqt(c10525bqB);
                                ArrayList<Long> arrayList4 = new ArrayList<>();
                                if (zAEQbTJ) {
                                    arrayList4.add(C56443yFo.KWHzl(c10525bqB.KWHzl().AhwBna()));
                                }
                                eugOLrzqt.EZpvd(arrayList4);
                                ArrayList<Long> arrayList5 = new ArrayList<>();
                                if (!zAEQbTJ) {
                                    arrayList5.add(C56443yFo.KWHzl(c10525bqB.KWHzl().AhwBna()));
                                }
                                eugOLrzqt.AEQbTJ(arrayList5);
                                eugOLrzqt.KWHzl(eug.hDKMBd());
                                eugOLrzqt.AYXKKw(eug.sSMYrx());
                                eugOLrzqt.KWHzl(eug.AEQbTJ());
                                eugOLrzqt.AEQbTJ(eug.isConnected());
                                eugOLrzqt.copydefault(eug.AubY());
                                eugOLrzqt.EZpvd(eug.AwvSrB());
                                eugOLrzqt.EZpvd(eug.valueOf());
                                eugOLrzqt.OLrzqt(eug.getNewProxyInstance());
                                eugOLrzqt.copydefault(C33129mqd.mulS$default(eugOLrzqt.KWHzl(), eugOLrzqt.AEQbTJ(), null, null, null, 14, null));
                                eugOLrzqt.AEQbTJ(eug.getFieldNames());
                                arrayList2.add(eugOLrzqt);
                            }
                        } else {
                            if (c10854bwMKWHzl == null || (strFJNWhG = c10854bwMKWHzl.fJNWhG()) == null) {
                                strFJNWhG = "";
                            }
                            List<C10525bqB> list2 = mapHrNTAI.get(strFJNWhG);
                            if (list2 != null && (listEZpvd = CollectionsKt___CollectionsKt.EZpvd(list2, C10529bqF.AEQbTJ)) != null) {
                                Iterator it = listEZpvd.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    if (((C10525bqB) next).AEQbTJ() == j2) {
                                        break;
                                    }
                                }
                                c10525bqB = (C10525bqB) next;
                            }
                            if (c10525bqB != null) {
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    i5++;
                    i2 = 1;
                    i3 = 5;
                    i4 = 0;
                }
            } else {
                for (eUG eug2 : this.$listToFilter) {
                    if (eug2.djBIcL().length() == 0 && eug2.ejfBZ() != 5) {
                        C56443yFo.KWHzl(arrayList3.add(eug2));
                    } else {
                        CustomChainCoinMeta customChainCoinMetaOLrzqt = C10598brV.AEQbTJ.OLrzqt(C10953byF.KWHzl.EZpvd(eug2.djBIcL()));
                        if (customChainCoinMetaOLrzqt != null && customChainCoinMetaOLrzqt.copydefault() == j) {
                            arrayList2.add(eug2);
                        }
                    }
                }
            }
            if (!(!arrayList2.isEmpty())) {
                return arrayList2;
            }
            if (this.$chainId >= 0) {
                arrayList2.addAll(arrayList3);
                MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, arrayList2, null);
                this.L$0 = arrayList2;
                this.label = 1;
                if (BuildersKt.withContext(immediate, anonymousClass3, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                arrayList2.addAll(arrayList3);
                MainCoroutineDispatcher immediate2 = Dispatchers.getMain().getImmediate();
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, arrayList2, null);
                this.L$0 = arrayList2;
                this.label = 2;
                if (BuildersKt.withContext(immediate2, anonymousClass4, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            arrayList = arrayList2;
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = (ArrayList) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.DefiHomeWalletBaseFragment$filterCoinWithChainId$1$chainDataList$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ArrayList<eUG> $chainDataList;
        int label;
        final /* synthetic */ C15625ePg this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C15625ePg c15625ePg, ArrayList<eUG> arrayList, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = c15625ePg;
            this.$chainDataList = arrayList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$chainDataList, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                ArrayList<eUG> arrayList = this.$chainDataList;
                long jCurrentTimeMillis = System.currentTimeMillis();
                C56407yEf.copydefault(arrayList, new Comparator() { // from class: o.ePw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.util.Comparator
                    public final int compare(java.lang.Object obj2, java.lang.Object obj3) {
                        return DefiHomeWalletBaseFragment$filterCoinWithChainId$1$chainDataList$1.AnonymousClass3.invokeSuspend$lambda$1$lambda$0((eUG) obj2, (eUG) obj3);
                    }
                });
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                pUU.KWHzl(this.this$0.getTAG(), "chainId >= 0, sort time=" + (jCurrentTimeMillis2 - jCurrentTimeMillis) + " ms");
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invokeSuspend$lambda$1$lambda$0(eUG eug, eUG eug2) {
            if (eug.djBIcL().length() == 0 && eug2.djBIcL().length() > 0) {
                return 1;
            }
            if (eug2.djBIcL().length() == 0 && eug.djBIcL().length() > 0) {
                return -1;
            }
            String strMulS$default = C33129mqd.mulS$default(eug.KWHzl(), eug.AEQbTJ(), null, null, null, 14, null);
            String strMulS$default2 = C33129mqd.mulS$default(eug2.KWHzl(), eug2.AEQbTJ(), null, null, null, 14, null);
            if (C33129mqd.gEmmrt(strMulS$default, strMulS$default2)) {
                return 1;
            }
            if (C33129mqd.AEQbTJ(strMulS$default, strMulS$default2)) {
                return -1;
            }
            Integer numValues = eug.values();
            int iIntValue = numValues != null ? numValues.intValue() : 0;
            Integer numValues2 = eug2.values();
            int iIntValue2 = numValues2 != null ? numValues2.intValue() : 0;
            if (C33129mqd.AEQbTJ(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2))) {
                return 1;
            }
            return C33129mqd.gEmmrt(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)) ? -1 : 0;
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.DefiHomeWalletBaseFragment$filterCoinWithChainId$1$chainDataList$1$4, reason: invalid class name */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ArrayList<eUG> $chainDataList;
        int label;
        final /* synthetic */ C15625ePg this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(C15625ePg c15625ePg, ArrayList<eUG> arrayList, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = c15625ePg;
            this.$chainDataList = arrayList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, this.$chainDataList, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                ArrayList<eUG> arrayList = this.$chainDataList;
                long jCurrentTimeMillis = System.currentTimeMillis();
                final Function2 function2 = new Function2() { // from class: o.ePx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return java.lang.Integer.valueOf(DefiHomeWalletBaseFragment$filterCoinWithChainId$1$chainDataList$1.AnonymousClass4.invokeSuspend$lambda$2$lambda$0((eUG) obj2, (eUG) obj3));
                    }
                };
                C56407yEf.copydefault(arrayList, new Comparator() { // from class: o.ePA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.util.Comparator
                    public final int compare(java.lang.Object obj2, java.lang.Object obj3) {
                        return DefiHomeWalletBaseFragment$filterCoinWithChainId$1$chainDataList$1.AnonymousClass4.invokeSuspend$lambda$2$lambda$1(function2, obj2, obj3);
                    }
                });
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                pUU.KWHzl(this.this$0.getTAG(), "chainId < 0, sort time=" + (jCurrentTimeMillis2 - jCurrentTimeMillis) + " ms");
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invokeSuspend$lambda$2$lambda$1(Function2 function2, Object obj, Object obj2) {
            return ((Number) function2.invoke(obj, obj2)).intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invokeSuspend$lambda$2$lambda$0(eUG eug, eUG eug2) {
            if (C33129mqd.gEmmrt(eug.AkhnZx(), eug2.AkhnZx())) {
                return 1;
            }
            return C33129mqd.AEQbTJ(eug.AkhnZx(), eug2.AkhnZx()) ? -1 : 0;
        }
    }
}
