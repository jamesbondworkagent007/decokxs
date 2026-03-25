package com.okinc.business.defi.wallet.hardware;

import com.okinc.wallet.core.other.DerivePath;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C10854bwM;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.C8322bAY;
import o.InterfaceC15373eFy;
import o.eEX;
import o.eFI;
import o.eFJ;
import o.pUU;
import o.yHO;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes18.dex */
public final class HardwareWalletSelectAddressViewModel$observer$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ eEX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HardwareWalletSelectAddressViewModel$observer$2(eEX eex, Continuation<? super HardwareWalletSelectAddressViewModel$observer$2> continuation) {
        super(2, continuation);
        this.this$0 = eex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HardwareWalletSelectAddressViewModel$observer$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HardwareWalletSelectAddressViewModel$observer$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class ActionBar implements Flow<Integer> {
        public final /* synthetic */ Flow OLrzqt;
        public final /* synthetic */ eEX copydefault;

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.hardware.HardwareWalletSelectAddressViewModel$observer$2$ActionBar$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ eEX KWHzl;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector, eEX eex) {
                this.copydefault = flowCollector;
                this.KWHzl = eex;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r6v5, resolved type: kotlinx.coroutines.flow.MutableStateFlow */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                HardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$2$2$1 hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$2$2$1;
                Object value;
                if (continuation instanceof HardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$2$2$1) {
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$2$2$1 = (HardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$2$2$1) continuation;
                    int i = hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$2$2$1 = new HardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$2$2$1(this, continuation);
                    }
                }
                Object obj2 = hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$2$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    int iIntValue = ((Number) obj).intValue();
                    pUU.OLrzqt(">>>ledger Thread:" + Thread.currentThread() + " offset update:" + iIntValue + " _ currentOffset:" + this.KWHzl.EZpvd());
                    MutableStateFlow mutableStateFlow = this.KWHzl.valueOf;
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value, eEX.ActionBar.copy$default((eEX.ActionBar) value, false, true, false, null, null, null, null, false, false, null, 893, null)));
                    Integer numAEQbTJ = C56443yFo.AEQbTJ(iIntValue);
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$2$2$1.label = 1;
                    if (flowCollector.emit(numAEQbTJ, hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$2$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public ActionBar(Flow flow, eEX eex) {
            this.OLrzqt = flow;
            this.copydefault = eex;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation) {
            Object objCollect = this.OLrzqt.collect(new AnonymousClass1(flowCollector, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class Activity implements Flow<HardwareWalletDerivationPath> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ eEX OLrzqt;

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.hardware.HardwareWalletSelectAddressViewModel$observer$2$Activity$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;
            public final /* synthetic */ eEX copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, eEX eex) {
                this.KWHzl = flowCollector;
                this.copydefault = eex;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r6v4, resolved type: kotlinx.coroutines.flow.MutableStateFlow */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                HardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$1$2$1 hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$1$2$1;
                Object value;
                if (continuation instanceof HardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$1$2$1) {
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$1$2$1 = (HardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i = hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$1$2$1 = new HardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    HardwareWalletDerivationPath hardwareWalletDerivationPath = (HardwareWalletDerivationPath) obj;
                    pUU.OLrzqt(">>>ledger Thread:" + Thread.currentThread() + " derivationPath update:" + hardwareWalletDerivationPath);
                    MutableStateFlow mutableStateFlow = this.copydefault.valueOf;
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value, eEX.ActionBar.copy$default((eEX.ActionBar) value, true, false, false, null, null, new ArrayList(), null, true, false, null, 862, null)));
                    this.copydefault.AEQbTJ(0);
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(hardwareWalletDerivationPath, hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Activity(Flow flow, eEX eex) {
            this.AEQbTJ = flow;
            this.OLrzqt = eex;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super HardwareWalletDerivationPath> flowCollector, Continuation continuation) {
            Object objCollect = this.AEQbTJ.collect(new AnonymousClass4(flowCollector, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class TaskDescription implements Flow<eEX.ActionBar> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ eEX OLrzqt;
        public final /* synthetic */ C10854bwM copydefault;

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.hardware.HardwareWalletSelectAddressViewModel$observer$2$TaskDescription$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ eEX AEQbTJ;
            public final /* synthetic */ FlowCollector OLrzqt;
            public final /* synthetic */ C10854bwM copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, eEX eex, C10854bwM c10854bwM) {
                this.OLrzqt = flowCollector;
                this.AEQbTJ = eex;
                this.copydefault = c10854bwM;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: Removed duplicated region for block: B:40:0x01e5 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:41:0x01e6  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x01f7  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x02be  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x0329 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                HardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1 hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1;
                AnonymousClass3<T> anonymousClass3;
                FlowCollector flowCollector;
                HardwareWalletDerivationPath hardwareWalletDerivationPath;
                ArrayList arrayList;
                List<DerivePath> list;
                AnonymousClass3<T> anonymousClass32;
                FlowCollector flowCollector2;
                HardwareWalletDerivationPath hardwareWalletDerivationPath2;
                ArrayList arrayList2;
                HardwareWalletDerivationPath hardwareWalletDerivationPath3;
                FlowCollector flowCollector3;
                AnonymousClass3<T> anonymousClass33;
                eEX.ActionBar actionBarCopy$default;
                if (continuation instanceof HardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1) {
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1 = (HardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1) continuation;
                    int i = hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1 = new HardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1(this, continuation);
                    }
                }
                Object objKWHzl = hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(objKWHzl);
                    FlowCollector flowCollector4 = this.OLrzqt;
                    HardwareWalletDerivationPath hardwareWalletDerivationPath4 = (HardwareWalletDerivationPath) ((Pair) obj).getFirst();
                    pUU.OLrzqt(">>>ledger Thread:" + Thread.currentThread() + " update derivationPath :" + hardwareWalletDerivationPath4 + " - currentOffset:" + this.AEQbTJ.EZpvd());
                    InterfaceC15373eFy interfaceC15373eFy = this.AEQbTJ.OLrzqt;
                    C10854bwM c10854bwM = this.copydefault;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$0 = this;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$1 = flowCollector4;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$2 = hardwareWalletDerivationPath4;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.label = 1;
                    Object objAEQbTJ = interfaceC15373eFy.AEQbTJ(c10854bwM, hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    anonymousClass3 = this;
                    flowCollector = flowCollector4;
                    hardwareWalletDerivationPath = hardwareWalletDerivationPath4;
                    objKWHzl = objAEQbTJ;
                } else if (i2 == 1) {
                    HardwareWalletDerivationPath hardwareWalletDerivationPath5 = (HardwareWalletDerivationPath) hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$2;
                    FlowCollector flowCollector5 = (FlowCollector) hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$1;
                    AnonymousClass3<T> anonymousClass34 = (AnonymousClass3) hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$0;
                    C56391yDq.AEQbTJ(objKWHzl);
                    hardwareWalletDerivationPath = hardwareWalletDerivationPath5;
                    flowCollector = flowCollector5;
                    anonymousClass3 = anonymousClass34;
                } else {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            list = (List) hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$4;
                            arrayList = (ArrayList) hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$3;
                            hardwareWalletDerivationPath2 = (HardwareWalletDerivationPath) hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$2;
                            flowCollector2 = (FlowCollector) hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$1;
                            anonymousClass32 = (AnonymousClass3) hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$0;
                            C56391yDq.AEQbTJ(objKWHzl);
                            list.addAll((List) objKWHzl);
                            pUU.OLrzqt(">>>ledger getDerivationPath pathList size:" + list.size() + " on thread:" + Thread.currentThread());
                            InterfaceC15373eFy interfaceC15373eFy2 = anonymousClass32.AEQbTJ.OLrzqt;
                            C10854bwM c10854bwM2 = anonymousClass32.copydefault;
                            hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$0 = anonymousClass32;
                            hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$1 = flowCollector2;
                            hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$2 = hardwareWalletDerivationPath2;
                            hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$3 = arrayList;
                            hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$4 = null;
                            hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.label = 4;
                            objKWHzl = interfaceC15373eFy2.KWHzl(list, c10854bwM2, hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1);
                            if (objKWHzl != objCopydefault) {
                                return objCopydefault;
                            }
                            arrayList2 = arrayList;
                            hardwareWalletDerivationPath3 = hardwareWalletDerivationPath2;
                            flowCollector3 = flowCollector2;
                            anonymousClass33 = anonymousClass32;
                            List list2 = (List) objKWHzl;
                            if (anonymousClass33.copydefault.call()) {
                            }
                            hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$0 = null;
                            hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$1 = null;
                            hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$2 = null;
                            hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$3 = null;
                            hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.label = 5;
                            if (flowCollector3.emit(actionBarCopy$default, hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1) == objCopydefault) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (i2 != 4) {
                            if (i2 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C56391yDq.AEQbTJ(objKWHzl);
                            return Unit.INSTANCE;
                        }
                        ArrayList arrayList3 = (ArrayList) hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$3;
                        HardwareWalletDerivationPath hardwareWalletDerivationPath6 = (HardwareWalletDerivationPath) hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$2;
                        flowCollector3 = (FlowCollector) hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$1;
                        anonymousClass33 = (AnonymousClass3) hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$0;
                        C56391yDq.AEQbTJ(objKWHzl);
                        arrayList2 = arrayList3;
                        hardwareWalletDerivationPath3 = hardwareWalletDerivationPath6;
                        List list22 = (List) objKWHzl;
                        if (anonymousClass33.copydefault.call()) {
                            if (anonymousClass33.AEQbTJ.gEmmrt == null && (!list22.isEmpty())) {
                                anonymousClass33.AEQbTJ.gEmmrt = (eFI) list22.get(0);
                            }
                            eEX.ActionBar actionBar = (eEX.ActionBar) anonymousClass33.AEQbTJ.valueOf.getValue();
                            List<eFI> listKWHzl = ((eEX.ActionBar) anonymousClass33.AEQbTJ.valueOf.getValue()).KWHzl();
                            listKWHzl.addAll(list22);
                            Unit unit = Unit.INSTANCE;
                            actionBarCopy$default = eEX.ActionBar.copy$default(actionBar, false, false, false, arrayList2, hardwareWalletDerivationPath3, listKWHzl, null, false, anonymousClass33.copydefault.call(), null, 708, null);
                        } else {
                            ArrayList arrayList4 = new ArrayList();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (T t : list22) {
                                Integer numAEQbTJ = C56443yFo.AEQbTJ(((eFI) t).KWHzl());
                                Object arrayList5 = linkedHashMap.get(numAEQbTJ);
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    linkedHashMap.put(numAEQbTJ, arrayList5);
                                }
                                ((List) arrayList5).add(t);
                            }
                            Iterator it = linkedHashMap.entrySet().iterator();
                            while (it.hasNext()) {
                                arrayList4.add(new eFJ(-1, (List) ((Map.Entry) it.next()).getValue()));
                            }
                            if (anonymousClass33.AEQbTJ.djBIcL == null && (!arrayList4.isEmpty())) {
                                anonymousClass33.AEQbTJ.djBIcL = (eFJ) arrayList4.get(0);
                            }
                            eEX.ActionBar actionBar2 = (eEX.ActionBar) anonymousClass33.AEQbTJ.valueOf.getValue();
                            boolean zCall = anonymousClass33.copydefault.call();
                            List<eFJ> listOLrzqt = ((eEX.ActionBar) anonymousClass33.AEQbTJ.valueOf.getValue()).OLrzqt();
                            listOLrzqt.addAll(arrayList4);
                            List<eFI> listKWHzl2 = ((eEX.ActionBar) anonymousClass33.AEQbTJ.valueOf.getValue()).KWHzl();
                            listKWHzl2.addAll(list22);
                            actionBarCopy$default = eEX.ActionBar.copy$default(actionBar2, false, false, false, arrayList2, hardwareWalletDerivationPath3, listKWHzl2, null, false, zCall, listOLrzqt, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, null);
                        }
                        hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$0 = null;
                        hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$1 = null;
                        hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$2 = null;
                        hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$3 = null;
                        hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.label = 5;
                        if (flowCollector3.emit(actionBarCopy$default, hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                    list = (List) hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$4;
                    arrayList = (ArrayList) hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$3;
                    hardwareWalletDerivationPath2 = (HardwareWalletDerivationPath) hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$2;
                    flowCollector2 = (FlowCollector) hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$1;
                    anonymousClass32 = (AnonymousClass3) hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$0;
                    C56391yDq.AEQbTJ(objKWHzl);
                    list.addAll((List) objKWHzl);
                    pUU.OLrzqt(">>>ledger getDerivationPath pathList size:" + list.size() + " on thread:" + Thread.currentThread());
                    InterfaceC15373eFy interfaceC15373eFy22 = anonymousClass32.AEQbTJ.OLrzqt;
                    C10854bwM c10854bwM22 = anonymousClass32.copydefault;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$0 = anonymousClass32;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$1 = flowCollector2;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$2 = hardwareWalletDerivationPath2;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$3 = arrayList;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$4 = null;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.label = 4;
                    objKWHzl = interfaceC15373eFy22.KWHzl(list, c10854bwM22, hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1);
                    if (objKWHzl != objCopydefault) {
                    }
                }
                ArrayList arrayList6 = (ArrayList) objKWHzl;
                ArrayList arrayList7 = new ArrayList();
                if (anonymousClass3.copydefault.call()) {
                    List<Integer> listAEQbTJ = C8322bAY.KWHzl.AEQbTJ(anonymousClass3.copydefault.fetchVPNInfo(), true);
                    InterfaceC15373eFy interfaceC15373eFy3 = anonymousClass3.AEQbTJ.OLrzqt;
                    long jQKVWgx = anonymousClass3.copydefault.QKVWgx();
                    int iEZpvd = anonymousClass3.AEQbTJ.EZpvd();
                    int iEZpvd2 = anonymousClass3.AEQbTJ.EZpvd();
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$0 = anonymousClass3;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$1 = flowCollector;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$2 = hardwareWalletDerivationPath;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$3 = arrayList6;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$4 = arrayList7;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.label = 2;
                    AnonymousClass3<T> anonymousClass35 = anonymousClass3;
                    FlowCollector flowCollector6 = flowCollector;
                    Object objAEQbTJ2 = interfaceC15373eFy3.AEQbTJ(jQKVWgx, listAEQbTJ, iEZpvd, iEZpvd2 + 1, hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1);
                    if (objAEQbTJ2 == objCopydefault) {
                        return objCopydefault;
                    }
                    arrayList = arrayList6;
                    objKWHzl = objAEQbTJ2;
                    list = arrayList7;
                    anonymousClass32 = anonymousClass35;
                    flowCollector2 = flowCollector6;
                    hardwareWalletDerivationPath2 = hardwareWalletDerivationPath;
                    list.addAll((List) objKWHzl);
                    pUU.OLrzqt(">>>ledger getDerivationPath pathList size:" + list.size() + " on thread:" + Thread.currentThread());
                    InterfaceC15373eFy interfaceC15373eFy222 = anonymousClass32.AEQbTJ.OLrzqt;
                    C10854bwM c10854bwM222 = anonymousClass32.copydefault;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$0 = anonymousClass32;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$1 = flowCollector2;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$2 = hardwareWalletDerivationPath2;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$3 = arrayList;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$4 = null;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.label = 4;
                    objKWHzl = interfaceC15373eFy222.KWHzl(list, c10854bwM222, hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1);
                    if (objKWHzl != objCopydefault) {
                    }
                } else {
                    AnonymousClass3<T> anonymousClass36 = anonymousClass3;
                    FlowCollector flowCollector7 = flowCollector;
                    InterfaceC15373eFy interfaceC15373eFy4 = anonymousClass36.AEQbTJ.OLrzqt;
                    long jQKVWgx2 = anonymousClass36.copydefault.QKVWgx();
                    List<Integer> listEZpvd = C56402yEa.EZpvd(C56443yFo.AEQbTJ(hardwareWalletDerivationPath.getAddressType().getValue()));
                    int iEZpvd3 = anonymousClass36.AEQbTJ.EZpvd();
                    int iEZpvd4 = anonymousClass36.AEQbTJ.EZpvd();
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$0 = anonymousClass36;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$1 = flowCollector7;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$2 = hardwareWalletDerivationPath;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$3 = arrayList6;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$4 = arrayList7;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.label = 3;
                    Object objAEQbTJ3 = interfaceC15373eFy4.AEQbTJ(jQKVWgx2, listEZpvd, iEZpvd3, iEZpvd4 + 4, hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1);
                    if (objAEQbTJ3 == objCopydefault) {
                        return objCopydefault;
                    }
                    arrayList = arrayList6;
                    objKWHzl = objAEQbTJ3;
                    list = arrayList7;
                    anonymousClass32 = anonymousClass36;
                    flowCollector2 = flowCollector7;
                    hardwareWalletDerivationPath2 = hardwareWalletDerivationPath;
                    list.addAll((List) objKWHzl);
                    pUU.OLrzqt(">>>ledger getDerivationPath pathList size:" + list.size() + " on thread:" + Thread.currentThread());
                    InterfaceC15373eFy interfaceC15373eFy2222 = anonymousClass32.AEQbTJ.OLrzqt;
                    C10854bwM c10854bwM2222 = anonymousClass32.copydefault;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$0 = anonymousClass32;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$1 = flowCollector2;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$2 = hardwareWalletDerivationPath2;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$3 = arrayList;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.L$4 = null;
                    hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1.label = 4;
                    objKWHzl = interfaceC15373eFy2222.KWHzl(list, c10854bwM2222, hardwareWalletSelectAddressViewModel$observer$2$invokeSuspend$$inlined$map$3$2$1);
                    if (objKWHzl != objCopydefault) {
                    }
                }
            }
        }

        public TaskDescription(Flow flow, eEX eex, C10854bwM c10854bwM) {
            this.AEQbTJ = flow;
            this.OLrzqt = eex;
            this.copydefault = c10854bwM;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super eEX.ActionBar> flowCollector, Continuation continuation) {
            Object objCollect = this.AEQbTJ.collect(new AnonymousClass3(flowCollector, this.OLrzqt, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC15373eFy interfaceC15373eFy = this.this$0.OLrzqt;
            long jAEQbTJ = this.this$0.AEQbTJ();
            this.label = 1;
            obj = interfaceC15373eFy.KWHzl(jAEQbTJ, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C10854bwM c10854bwM = (C10854bwM) obj;
        if (c10854bwM == null) {
            pUU.copydefault(">>>coinMeta is NULL with generalChainId:" + this.this$0.AEQbTJ());
            return Unit.INSTANCE;
        }
        pUU.OLrzqt(">>>ledger coinMeta generalChainId:" + c10854bwM.fetchVPNInfo());
        pUU.OLrzqt(">>>ledger coinMeta chainId:" + c10854bwM.AEQbTJ());
        pUU.OLrzqt(">>>ledger coinMeta factionChainId:" + c10854bwM.QKVWgx());
        Flow flowM7441catch = FlowKt.m7441catch(new TaskDescription(FlowKt.distinctUntilChanged(FlowKt.combine(new Activity(FlowKt.distinctUntilChanged(this.this$0.copydefault), this.this$0), new ActionBar(this.this$0.KWHzl, this.this$0), new AnonymousClass3(null))), this.this$0, c10854bwM), new AnonymousClass5(this.this$0, null));
        final eEX eex = this.this$0;
        FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.wallet.hardware.HardwareWalletSelectAddressViewModel$observer$2.1
            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            /* JADX DEBUG: Multi-variable search result rejected for r5v6, resolved type: kotlinx.coroutines.flow.MutableStateFlow */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public final Object emit(eEX.ActionBar actionBar, Continuation<? super Unit> continuation) {
                Object value;
                pUU.OLrzqt(">>>ledger collect on thread:" + Thread.currentThread() + " collected viewModelState chainAddressList:" + actionBar.KWHzl().size() + " ");
                MutableStateFlow mutableStateFlow = eex.valueOf;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, actionBar));
                return Unit.INSTANCE;
            }
        };
        this.label = 2;
        if (flowM7441catch.collect(flowCollector, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.hardware.HardwareWalletSelectAddressViewModel$observer$2$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements yHO<HardwareWalletDerivationPath, Integer, Continuation<? super Pair<? extends HardwareWalletDerivationPath, ? extends Integer>>, Object> {
        /* synthetic */ int I$0;
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(3, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(HardwareWalletDerivationPath hardwareWalletDerivationPath, int i, Continuation<? super Pair<HardwareWalletDerivationPath, Integer>> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
            anonymousClass3.L$0 = hardwareWalletDerivationPath;
            anonymousClass3.I$0 = i;
            return anonymousClass3.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // o.yHO
        public /* synthetic */ Object invoke(HardwareWalletDerivationPath hardwareWalletDerivationPath, Integer num, Continuation<? super Pair<? extends HardwareWalletDerivationPath, ? extends Integer>> continuation) {
            return invoke(hardwareWalletDerivationPath, num.intValue(), (Continuation<? super Pair<HardwareWalletDerivationPath, Integer>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                return new Pair((HardwareWalletDerivationPath) this.L$0, C56443yFo.AEQbTJ(this.I$0));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.hardware.HardwareWalletSelectAddressViewModel$observer$2$5, reason: invalid class name */
    public static final class AnonymousClass5 extends SuspendLambda implements yHO<FlowCollector<? super eEX.ActionBar>, Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ eEX this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(eEX eex, Continuation<? super AnonymousClass5> continuation) {
            super(3, continuation);
            this.this$0 = eex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.yHO
        public final Object invoke(FlowCollector<? super eEX.ActionBar> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, continuation);
            anonymousClass5.L$0 = th;
            return anonymousClass5.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Throwable th = (Throwable) this.L$0;
                pUU.copydefault(">>>leger error observer catch :" + th);
                MutableStateFlow mutableStateFlow = this.this$0.valueOf;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, eEX.ActionBar.copy$default((eEX.ActionBar) value, false, false, false, null, null, null, th, false, false, null, 958, null)));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
