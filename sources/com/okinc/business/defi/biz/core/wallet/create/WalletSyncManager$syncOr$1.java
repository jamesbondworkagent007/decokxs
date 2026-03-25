package com.okinc.business.defi.biz.core.wallet.create;

import com.okinc.business.defi.biz.constant.WalletSyncStatus;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import o.C12980cxH;
import o.C13062cyk;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.cQM;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletSyncManager$syncOr$1 extends SuspendLambda implements Function2<ProducerScope<? super Integer>, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $forceSync;
    final /* synthetic */ String $from;
    final /* synthetic */ boolean $isDelay;
    final /* synthetic */ long $start;
    final /* synthetic */ C13062cyk.LoaderManager $waitType;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C13062cyk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSyncManager$syncOr$1(boolean z, C13062cyk c13062cyk, long j, C13062cyk.LoaderManager loaderManager, boolean z2, String str, Continuation<? super WalletSyncManager$syncOr$1> continuation) {
        super(2, continuation);
        this.$forceSync = z;
        this.this$0 = c13062cyk;
        this.$start = j;
        this.$waitType = loaderManager;
        this.$isDelay = z2;
        this.$from = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WalletSyncManager$syncOr$1 walletSyncManager$syncOr$1 = new WalletSyncManager$syncOr$1(this.$forceSync, this.this$0, this.$start, this.$waitType, this.$isDelay, this.$from, continuation);
        walletSyncManager$syncOr$1.L$0 = obj;
        return walletSyncManager$syncOr$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super Integer> producerScope, Continuation<? super Unit> continuation) {
        return ((WalletSyncManager$syncOr$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:25:0x0057 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:30:0x006f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:80:0x019a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0221 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0230 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x027f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x017a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0198 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019c A[Catch: all -> 0x0057, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0057, blocks: (B:17:0x003a, B:23:0x0052, B:81:0x019c), top: B:133:0x0008 }] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v35, types: [kotlinx.coroutines.channels.ProducerScope] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlinx.coroutines.channels.ProducerScope] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v23, types: [kotlinx.coroutines.channels.ProducerScope] */
    /* JADX WARN: Type inference failed for: r5v15, types: [kotlinx.coroutines.CoroutineScope] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r4;
        MainCoroutineDispatcher main;
        AnonymousClass3 anonymousClass3;
        ProducerScope producerScope;
        List listAhwBna;
        List list;
        Object next;
        WalletEntity walletEntity;
        ?? r11;
        List list2;
        List list3;
        C13062cyk c13062cyk;
        boolean z;
        String str;
        C13062cyk.LoaderManager loaderManager;
        ?? r2;
        ?? r1;
        ?? r12;
        ProducerScope producerScope2;
        ProducerScope producerScope3;
        MainCoroutineDispatcher main2;
        AnonymousClass4 anonymousClass4;
        ProducerScope producerScope4;
        Object objCopydefault = C56442yFn.copydefault();
        ?? r13 = this.label;
        ?? r22 = 1;
        try {
            try {
            } catch (Throwable th) {
                th = th;
                r4 = r13;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        switch (r13) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                ProducerScope producerScope5 = (ProducerScope) this.L$0;
                if (this.$forceSync || !this.this$0.AhwBna) {
                    cQM cqm = this.this$0.isConnected;
                    int value = WalletSyncStatus.HasSync.getValue();
                    this.L$0 = producerScope5;
                    this.label = 2;
                    Object objEZpvd = cqm.EZpvd(value, this);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    producerScope = producerScope5;
                    obj = objEZpvd;
                    listAhwBna = (List) obj;
                    if (!listAhwBna.isEmpty()) {
                        this.this$0.AhwBna = true;
                        MainCoroutineDispatcher main3 = Dispatchers.getMain();
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(producerScope, null);
                        this.L$0 = null;
                        this.label = 3;
                        if (BuildersKt.withContext(main3, anonymousClass2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        pUU.OLrzqt("fcj finish sync task ==== 2 " + (System.currentTimeMillis() - this.$start));
                        return Unit.INSTANCE;
                    }
                    this.this$0.AhwBna = false;
                    C13062cyk.LoaderManager loaderManager2 = this.$waitType;
                    if (!Intrinsics.EZpvd(loaderManager2, C13062cyk.LoaderManager.TaskDescription.OLrzqt)) {
                        if (loaderManager2 instanceof C13062cyk.LoaderManager.Application) {
                            Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(((C13062cyk.LoaderManager.Application) this.$waitType).OLrzqt());
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : listAhwBna) {
                                if (setOqFWZa.contains(((WalletEntity) obj2).getId())) {
                                    arrayList.add(obj2);
                                }
                            }
                            List listGEmmrt = CollectionsKt___CollectionsKt.gEmmrt((Iterable) listAhwBna, (Iterable) CollectionsKt___CollectionsKt.OqFWZa(arrayList));
                            C13062cyk c13062cyk2 = this.this$0;
                            boolean z2 = this.$isDelay;
                            String str2 = this.$from;
                            C13062cyk.LoaderManager loaderManager3 = this.$waitType;
                            this.L$0 = producerScope;
                            this.L$1 = arrayList;
                            this.label = 7;
                            if (c13062cyk2.KWHzl(producerScope, (List<WalletEntity>) listGEmmrt, z2, str2, loaderManager3, (Continuation<? super Unit>) this) == objCopydefault) {
                                return objCopydefault;
                            }
                            list = arrayList;
                            producerScope2 = producerScope;
                            C13062cyk c13062cyk3 = this.this$0;
                            boolean z3 = this.$isDelay;
                            String str3 = this.$from;
                            C13062cyk.LoaderManager loaderManager4 = this.$waitType;
                            this.L$0 = producerScope2;
                            this.L$1 = null;
                            this.label = 8;
                            obj = c13062cyk3.EZpvd(producerScope2, list, z3, str3, loaderManager4, this);
                            producerScope3 = producerScope2;
                            if (obj == objCopydefault) {
                                return objCopydefault;
                            }
                            this.L$0 = producerScope3;
                            this.label = 9;
                            r12 = producerScope3;
                            if (C12980cxH.KWHzl((Collection) obj, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            r2 = r12;
                            pUU.OLrzqt("fcj finish sync task ==== 4 " + (System.currentTimeMillis() - this.$start));
                            main2 = Dispatchers.getMain();
                            anonymousClass4 = new AnonymousClass4(r2, null);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 14;
                            if (BuildersKt.withContext(main2, anonymousClass4, this) == objCopydefault) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (Intrinsics.EZpvd(loaderManager2, C13062cyk.LoaderManager.Activity.AEQbTJ)) {
                            C13062cyk c13062cyk4 = this.this$0;
                            boolean z4 = this.$isDelay;
                            String str4 = this.$from;
                            C13062cyk.LoaderManager loaderManager5 = this.$waitType;
                            this.L$0 = producerScope;
                            this.label = 10;
                            Object objKWHzl = c13062cyk4.KWHzl(producerScope, (List<WalletEntity>) listAhwBna, z4, str4, loaderManager5, (Continuation<? super Unit>) this);
                            r12 = producerScope;
                            if (objKWHzl == objCopydefault) {
                                return objCopydefault;
                            }
                            r2 = r12;
                            pUU.OLrzqt("fcj finish sync task ==== 4 " + (System.currentTimeMillis() - this.$start));
                            main2 = Dispatchers.getMain();
                            anonymousClass4 = new AnonymousClass4(r2, null);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 14;
                            if (BuildersKt.withContext(main2, anonymousClass4, this) == objCopydefault) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (Intrinsics.EZpvd(loaderManager2, C13062cyk.LoaderManager.StateListAnimator.EZpvd)) {
                            C13062cyk c13062cyk5 = this.this$0;
                            boolean z5 = this.$isDelay;
                            String str5 = this.$from;
                            C13062cyk.LoaderManager loaderManager6 = this.$waitType;
                            this.L$0 = producerScope;
                            this.label = 11;
                            obj = c13062cyk5.EZpvd(producerScope, listAhwBna, z5, str5, loaderManager6, this);
                            producerScope4 = producerScope;
                            if (obj == objCopydefault) {
                                return objCopydefault;
                            }
                            this.L$0 = producerScope4;
                            this.label = 12;
                            r12 = producerScope4;
                            if (C12980cxH.KWHzl((Collection) obj, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            r2 = r12;
                            pUU.OLrzqt("fcj finish sync task ==== 4 " + (System.currentTimeMillis() - this.$start));
                            main2 = Dispatchers.getMain();
                            anonymousClass4 = new AnonymousClass4(r2, null);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 14;
                            if (BuildersKt.withContext(main2, anonymousClass4, this) == objCopydefault) {
                            }
                            return Unit.INSTANCE;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    Iterator it = listAhwBna.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (((WalletEntity) next).getMain() == 1) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    walletEntity = (WalletEntity) next;
                    if (walletEntity == null) {
                        r11 = producerScope;
                        list2 = null;
                        if (walletEntity != null) {
                        }
                        c13062cyk = this.this$0;
                        z = this.$isDelay;
                        str = this.$from;
                        loaderManager = this.$waitType;
                        this.L$0 = r11;
                        this.L$1 = list2;
                        this.L$2 = null;
                        this.label = 5;
                        if (c13062cyk.KWHzl((CoroutineScope) r11, (List<WalletEntity>) listAhwBna, z, str, loaderManager, (Continuation<? super Unit>) this) == objCopydefault) {
                        }
                    } else {
                        C13062cyk c13062cyk6 = this.this$0;
                        List listEZpvd = C56402yEa.EZpvd(walletEntity);
                        boolean z6 = this.$isDelay;
                        String str6 = this.$from;
                        C13062cyk.LoaderManager loaderManager7 = this.$waitType;
                        this.L$0 = producerScope;
                        this.L$1 = listAhwBna;
                        this.L$2 = walletEntity;
                        this.label = 4;
                        Object objEZpvd2 = c13062cyk6.EZpvd(producerScope, listEZpvd, z6, str6, loaderManager7, this);
                        if (objEZpvd2 == objCopydefault) {
                            return objCopydefault;
                        }
                        list3 = listAhwBna;
                        obj = objEZpvd2;
                        r1 = producerScope;
                        r11 = r1;
                        list2 = (List) obj;
                        listAhwBna = list3;
                        if (walletEntity != null) {
                            try {
                                listAhwBna = CollectionsKt___CollectionsKt.AhwBna((Iterable<? extends WalletEntity>) ((Iterable<? extends Object>) listAhwBna), walletEntity);
                            } catch (Throwable th3) {
                                th = th3;
                                r22 = r11;
                                r4 = r22;
                                th.printStackTrace();
                                main = Dispatchers.getMain();
                                anonymousClass3 = new AnonymousClass3(r4, null);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 13;
                                if (BuildersKt.withContext(main, anonymousClass3, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                                pUU.OLrzqt("fcj finish sync task ==== 3 " + (System.currentTimeMillis() - this.$start));
                                return Unit.INSTANCE;
                            }
                        }
                        c13062cyk = this.this$0;
                        z = this.$isDelay;
                        str = this.$from;
                        loaderManager = this.$waitType;
                        this.L$0 = r11;
                        this.L$1 = list2;
                        this.L$2 = null;
                        this.label = 5;
                        if (c13062cyk.KWHzl((CoroutineScope) r11, (List<WalletEntity>) listAhwBna, z, str, loaderManager, (Continuation<? super Unit>) this) == objCopydefault) {
                            return objCopydefault;
                        }
                        r2 = r11;
                        if (list2 != null) {
                            this.L$0 = r2;
                            this.L$1 = null;
                            this.label = 6;
                            if (C12980cxH.KWHzl(list2, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            r12 = r2;
                            r2 = r12;
                        }
                        pUU.OLrzqt("fcj finish sync task ==== 4 " + (System.currentTimeMillis() - this.$start));
                        main2 = Dispatchers.getMain();
                        anonymousClass4 = new AnonymousClass4(r2, null);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 14;
                        if (BuildersKt.withContext(main2, anonymousClass4, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    MainCoroutineDispatcher main4 = Dispatchers.getMain();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(producerScope5, null);
                    this.label = 1;
                    if (BuildersKt.withContext(main4, anonymousClass1, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    pUU.OLrzqt("fcj finish sync task ==== 1 " + (System.currentTimeMillis() - this.$start));
                    return Unit.INSTANCE;
                }
                break;
            case 1:
                C56391yDq.AEQbTJ(obj);
                pUU.OLrzqt("fcj finish sync task ==== 1 " + (System.currentTimeMillis() - this.$start));
                return Unit.INSTANCE;
            case 2:
                ProducerScope producerScope6 = (ProducerScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                producerScope = producerScope6;
                listAhwBna = (List) obj;
                if (!listAhwBna.isEmpty()) {
                }
                break;
            case 3:
                C56391yDq.AEQbTJ(obj);
                pUU.OLrzqt("fcj finish sync task ==== 2 " + (System.currentTimeMillis() - this.$start));
                return Unit.INSTANCE;
            case 4:
                WalletEntity walletEntity2 = (WalletEntity) this.L$2;
                List list4 = (List) this.L$1;
                r4 = (ProducerScope) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    walletEntity = walletEntity2;
                    r1 = r4;
                    list3 = list4;
                    r11 = r1;
                    list2 = (List) obj;
                    listAhwBna = list3;
                    if (walletEntity != null) {
                    }
                    c13062cyk = this.this$0;
                    z = this.$isDelay;
                    str = this.$from;
                    loaderManager = this.$waitType;
                    this.L$0 = r11;
                    this.L$1 = list2;
                    this.L$2 = null;
                    this.label = 5;
                    if (c13062cyk.KWHzl((CoroutineScope) r11, (List<WalletEntity>) listAhwBna, z, str, loaderManager, (Continuation<? super Unit>) this) == objCopydefault) {
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th.printStackTrace();
                    main = Dispatchers.getMain();
                    anonymousClass3 = new AnonymousClass3(r4, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 13;
                    if (BuildersKt.withContext(main, anonymousClass3, this) == objCopydefault) {
                    }
                    pUU.OLrzqt("fcj finish sync task ==== 3 " + (System.currentTimeMillis() - this.$start));
                    return Unit.INSTANCE;
                }
                break;
            case 5:
                list2 = (List) this.L$1;
                ProducerScope producerScope7 = (ProducerScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                r2 = producerScope7;
                if (list2 != null) {
                }
                pUU.OLrzqt("fcj finish sync task ==== 4 " + (System.currentTimeMillis() - this.$start));
                main2 = Dispatchers.getMain();
                anonymousClass4 = new AnonymousClass4(r2, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 14;
                if (BuildersKt.withContext(main2, anonymousClass4, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 6:
            case 9:
            case 10:
            case 12:
                ProducerScope producerScope8 = (ProducerScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                r12 = producerScope8;
                r2 = r12;
                pUU.OLrzqt("fcj finish sync task ==== 4 " + (System.currentTimeMillis() - this.$start));
                main2 = Dispatchers.getMain();
                anonymousClass4 = new AnonymousClass4(r2, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 14;
                if (BuildersKt.withContext(main2, anonymousClass4, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 7:
                List list5 = (List) this.L$1;
                ProducerScope producerScope9 = (ProducerScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                list = list5;
                producerScope2 = producerScope9;
                C13062cyk c13062cyk32 = this.this$0;
                boolean z32 = this.$isDelay;
                String str32 = this.$from;
                C13062cyk.LoaderManager loaderManager42 = this.$waitType;
                this.L$0 = producerScope2;
                this.L$1 = null;
                this.label = 8;
                obj = c13062cyk32.EZpvd(producerScope2, list, z32, str32, loaderManager42, this);
                producerScope3 = producerScope2;
                if (obj == objCopydefault) {
                }
                this.L$0 = producerScope3;
                this.label = 9;
                r12 = producerScope3;
                if (C12980cxH.KWHzl((Collection) obj, this) == objCopydefault) {
                }
                r2 = r12;
                pUU.OLrzqt("fcj finish sync task ==== 4 " + (System.currentTimeMillis() - this.$start));
                main2 = Dispatchers.getMain();
                anonymousClass4 = new AnonymousClass4(r2, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 14;
                if (BuildersKt.withContext(main2, anonymousClass4, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 8:
                ProducerScope producerScope10 = (ProducerScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                producerScope3 = producerScope10;
                this.L$0 = producerScope3;
                this.label = 9;
                r12 = producerScope3;
                if (C12980cxH.KWHzl((Collection) obj, this) == objCopydefault) {
                }
                r2 = r12;
                pUU.OLrzqt("fcj finish sync task ==== 4 " + (System.currentTimeMillis() - this.$start));
                main2 = Dispatchers.getMain();
                anonymousClass4 = new AnonymousClass4(r2, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 14;
                if (BuildersKt.withContext(main2, anonymousClass4, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 11:
                ProducerScope producerScope11 = (ProducerScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                producerScope4 = producerScope11;
                this.L$0 = producerScope4;
                this.label = 12;
                r12 = producerScope4;
                if (C12980cxH.KWHzl((Collection) obj, this) == objCopydefault) {
                }
                r2 = r12;
                pUU.OLrzqt("fcj finish sync task ==== 4 " + (System.currentTimeMillis() - this.$start));
                main2 = Dispatchers.getMain();
                anonymousClass4 = new AnonymousClass4(r2, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 14;
                if (BuildersKt.withContext(main2, anonymousClass4, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 13:
                C56391yDq.AEQbTJ(obj);
                pUU.OLrzqt("fcj finish sync task ==== 3 " + (System.currentTimeMillis() - this.$start));
                return Unit.INSTANCE;
            case 14:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.biz.core.wallet.create.WalletSyncManager$syncOr$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ProducerScope<Integer> $$this$rxFlowable;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.channels.ProducerScope<? super java.lang.Integer> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(ProducerScope<? super Integer> producerScope, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$$this$rxFlowable = producerScope;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$$this$rxFlowable, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SendChannel<Integer> channel = this.$$this$rxFlowable.getChannel();
                Integer numAEQbTJ = C56443yFo.AEQbTJ(0);
                this.label = 1;
                if (channel.send(numAEQbTJ, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.biz.core.wallet.create.WalletSyncManager$syncOr$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ProducerScope<Integer> $$this$rxFlowable;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.channels.ProducerScope<? super java.lang.Integer> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(ProducerScope<? super Integer> producerScope, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$$this$rxFlowable = producerScope;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$$this$rxFlowable, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SendChannel<Integer> channel = this.$$this$rxFlowable.getChannel();
                Integer numAEQbTJ = C56443yFo.AEQbTJ(0);
                this.label = 1;
                if (channel.send(numAEQbTJ, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.biz.core.wallet.create.WalletSyncManager$syncOr$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ProducerScope<Integer> $$this$rxFlowable;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.channels.ProducerScope<? super java.lang.Integer> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(ProducerScope<? super Integer> producerScope, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$$this$rxFlowable = producerScope;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$$this$rxFlowable, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SendChannel<Integer> channel = this.$$this$rxFlowable.getChannel();
                Integer numAEQbTJ = C56443yFo.AEQbTJ(-1);
                this.label = 1;
                if (channel.send(numAEQbTJ, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.biz.core.wallet.create.WalletSyncManager$syncOr$1$4, reason: invalid class name */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ProducerScope<Integer> $$this$rxFlowable;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.channels.ProducerScope<? super java.lang.Integer> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(ProducerScope<? super Integer> producerScope, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$$this$rxFlowable = producerScope;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.$$this$rxFlowable, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SendChannel<Integer> channel = this.$$this$rxFlowable.getChannel();
                Integer numAEQbTJ = C56443yFo.AEQbTJ(0);
                this.label = 1;
                if (channel.send(numAEQbTJ, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
