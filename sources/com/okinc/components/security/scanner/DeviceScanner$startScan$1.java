package com.okinc.components.security.scanner;

import com.okinc.components.security.scanner.EnsecureAppInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.reactive.AwaitKt;
import o.AbstractC58185ywX;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56548yJl;
import o.InterfaceC32767mjm;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class DeviceScanner$startScan$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ DeviceScanner this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceScanner$startScan$1(DeviceScanner deviceScanner, Continuation<? super DeviceScanner$startScan$1> continuation) {
        super(2, continuation);
        this.this$0 = deviceScanner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeviceScanner$startScan$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeviceScanner$startScan$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objWithContext;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objWithContext = obj;
            } else {
                C56391yDq.AEQbTJ(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                objWithContext = BuildersKt.withContext(io2, anonymousClass1, this);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            }
            DeviceScanner deviceScanner = this.this$0;
            List<EnsecureAppInfo> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) objWithContext);
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listFJNWhG, 10)), 16));
            for (Object obj2 : listFJNWhG) {
                linkedHashMap.put(((EnsecureAppInfo) obj2).getPackageName(), obj2);
            }
            for (EnsecureAppInfo ensecureAppInfo : deviceScanner.EZpvd()) {
                EnsecureAppInfo ensecureAppInfo2 = (EnsecureAppInfo) linkedHashMap.get(ensecureAppInfo.getPackageName());
                if (ensecureAppInfo2 != null) {
                    arrayList.add(EnsecureAppInfo.copy$default(ensecureAppInfo, null, null, null, null, EnsecureAppInfo.ScanResult.copy$default(ensecureAppInfo.getScanResult(), null, ensecureAppInfo2.getScanResult().getLevel(), 1, null), false, 47, null));
                } else {
                    arrayList.add(ensecureAppInfo);
                }
            }
            for (EnsecureAppInfo ensecureAppInfo3 : listFJNWhG) {
                List<EnsecureAppInfo> listEZpvd = deviceScanner.EZpvd();
                if (!(listEZpvd instanceof Collection) || !listEZpvd.isEmpty()) {
                    Iterator<T> it = listEZpvd.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.EZpvd((Object) ((EnsecureAppInfo) it.next()).getPackageName(), (Object) ensecureAppInfo3.getPackageName())) {
                            break;
                        }
                    }
                }
                arrayList.add(ensecureAppInfo3);
            }
            deviceScanner.EZpvd(arrayList);
            InterfaceC32767mjm interfaceC32767mjm = deviceScanner.gEmmrt;
            if (interfaceC32767mjm != null) {
                interfaceC32767mjm.AEQbTJ(deviceScanner.EZpvd());
            }
        } catch (Exception e) {
            InterfaceC32767mjm interfaceC32767mjm2 = this.this$0.gEmmrt;
            if (interfaceC32767mjm2 != null) {
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                interfaceC32767mjm2.copydefault(message);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.components.security.scanner.DeviceScanner$startScan$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends EnsecureAppInfo>>, Object> {
        int label;
        final /* synthetic */ DeviceScanner this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DeviceScanner deviceScanner, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = deviceScanner;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends EnsecureAppInfo>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<EnsecureAppInfo>>) continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<EnsecureAppInfo>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC32767mjm interfaceC32767mjm;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                DeviceScanner deviceScanner = this.this$0;
                deviceScanner.EZpvd(deviceScanner.KWHzl());
                if (this.this$0.copydefault.size() < 2 && (interfaceC32767mjm = this.this$0.gEmmrt) != null) {
                    interfaceC32767mjm.copydefault(String.valueOf(this.this$0.copydefault.size()));
                }
                InterfaceC32767mjm interfaceC32767mjm2 = this.this$0.gEmmrt;
                if (interfaceC32767mjm2 != null) {
                    interfaceC32767mjm2.KWHzl(this.this$0.EZpvd());
                }
                AbstractC58185ywX abstractC58185ywXCopydefault = this.this$0.copydefault();
                this.label = 1;
                obj = AwaitKt.awaitLast(abstractC58185ywXCopydefault, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            List list = (List) obj;
            return list == null ? yDY.AhwBna() : list;
        }
    }
}
