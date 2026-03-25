package com.okinc.business.defi.biz.core.wallet.create;

import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import com.okinc.business.defi.biz.model.ChainAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import o.C13062cyk;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletSyncManager$syncWalletList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C13062cyk.ActionBar<String>>, Object> {
    final /* synthetic */ String $from;
    final /* synthetic */ boolean $isDelay;
    final /* synthetic */ C13062cyk.LoaderManager $waitType;
    final /* synthetic */ List<WalletEntity> $walletEntities;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ C13062cyk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSyncManager$syncWalletList$2(C13062cyk c13062cyk, List<WalletEntity> list, boolean z, String str, C13062cyk.LoaderManager loaderManager, Continuation<? super WalletSyncManager$syncWalletList$2> continuation) {
        super(2, continuation);
        this.this$0 = c13062cyk;
        this.$walletEntities = list;
        this.$isDelay = z;
        this.$from = str;
        this.$waitType = loaderManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WalletSyncManager$syncWalletList$2 walletSyncManager$syncWalletList$2 = new WalletSyncManager$syncWalletList$2(this.this$0, this.$walletEntities, this.$isDelay, this.$from, this.$waitType, continuation);
        walletSyncManager$syncWalletList$2.L$0 = obj;
        return walletSyncManager$syncWalletList$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C13062cyk.ActionBar<String>> continuation) {
        return ((WalletSyncManager$syncWalletList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [394=15] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03f1 A[LOOP:2: B:101:0x03eb->B:103:0x03f1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0417 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x042a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0466 A[LOOP:1: B:117:0x0460->B:119:0x0466, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0185 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x021b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0244 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0273 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0307 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x031a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0336 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x034a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x037f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x038d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03cf A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        C13062cyk c13062cyk;
        Object objKWHzl;
        Object objCopydefault;
        CoroutineScope coroutineScope2;
        C13062cyk.StateListAnimator stateListAnimator;
        Deferred deferred;
        Deferred deferredAsync$default;
        Object objAwait;
        CoroutineScope coroutineScope3;
        Deferred deferred2;
        C13062cyk.StateListAnimator stateListAnimator2;
        Object objAwait2;
        CoroutineScope coroutineScope4;
        Deferred deferred3;
        Deferred deferred4;
        List list;
        Object objAwait3;
        List list2;
        Deferred deferred5;
        C13062cyk.StateListAnimator stateListAnimator3;
        C13062cyk.StateListAnimator stateListAnimator4;
        List<WalletEntity> list3;
        Object objAwait4;
        List<WalletEntity> list4;
        List list5;
        CoroutineScope coroutineScope5;
        C13062cyk.StateListAnimator stateListAnimator5;
        List<WalletEntity> list6;
        C13062cyk.StateListAnimator stateListAnimator6;
        C13062cyk.StateListAnimator stateListAnimator7;
        Object objWithContext;
        List list7;
        Object objWithContext2;
        Object objKWHzl2;
        List list8;
        CoroutineScope coroutineScope6;
        Object objKWHzl3;
        CoroutineScope coroutineScope7;
        C13062cyk.StateListAnimator stateListAnimator8;
        Object objKWHzl4;
        Deferred deferredAsync$default2;
        Deferred deferred6;
        Object objAwait5;
        C13062cyk.StateListAnimator stateListAnimator9;
        C13062cyk c13062cyk2;
        Object objKWHzl5;
        Object objKWHzl6;
        List arrayList;
        Iterator it;
        Set setOqFWZa;
        C13062cyk c13062cyk3;
        Object objKWHzl7;
        Iterator it2;
        Object objCopydefault2 = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                c13062cyk = this.this$0;
                List<WalletEntity> list9 = this.$walletEntities;
                this.L$0 = coroutineScope;
                this.L$1 = c13062cyk;
                this.label = 1;
                objKWHzl = c13062cyk.KWHzl((List<WalletEntity>) list9, (Continuation<? super List<WalletEntity>>) this);
                if (objKWHzl == objCopydefault2) {
                    return objCopydefault2;
                }
                CoroutineScope coroutineScope8 = coroutineScope;
                List list10 = (List) objKWHzl;
                boolean z = this.$isDelay;
                String str = this.$from;
                C13062cyk.LoaderManager loaderManager = this.$waitType;
                this.L$0 = coroutineScope8;
                this.L$1 = null;
                this.label = 2;
                objCopydefault = c13062cyk.copydefault(list10, z, str, loaderManager, this);
                if (objCopydefault != objCopydefault2) {
                    return objCopydefault2;
                }
                coroutineScope2 = coroutineScope8;
                stateListAnimator = (C13062cyk.StateListAnimator) objCopydefault;
                if (this.this$0.AEQbTJ((C13062cyk.StateListAnimator<?>) stateListAnimator)) {
                    return this.this$0.OLrzqt((C13062cyk.StateListAnimator<?>) stateListAnimator);
                }
                List list11 = (List) stateListAnimator.OLrzqt();
                ArrayList arrayList2 = new ArrayList();
                Deferred deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new WalletSyncManager$syncWalletList$2$syncWalletNameDef$1(this.this$0, list11, null), 3, null);
                arrayList2.add(deferredAsync$default3);
                Deferred deferredAsync$default4 = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new WalletSyncManager$syncWalletList$2$requestSegwitDef$1(this.this$0, list11, this.$isDelay, null), 3, null);
                arrayList2.add(deferredAsync$default4);
                Deferred deferredAsync$default5 = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new WalletSyncManager$syncWalletList$2$requestEosInfoDef$1(this.this$0, list11, this.$isDelay, null), 3, null);
                arrayList2.add(deferredAsync$default5);
                deferred = deferredAsync$default5;
                deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new WalletSyncManager$syncWalletList$2$requestNearDef$1(this.this$0, list11, null), 3, null);
                arrayList2.add(deferredAsync$default);
                this.L$0 = coroutineScope2;
                this.L$1 = deferredAsync$default4;
                this.L$2 = deferred;
                this.L$3 = deferredAsync$default;
                this.label = 3;
                objAwait = deferredAsync$default3.await(this);
                if (objAwait == objCopydefault2) {
                    return objCopydefault2;
                }
                coroutineScope3 = coroutineScope2;
                deferred2 = deferredAsync$default4;
                stateListAnimator2 = (C13062cyk.StateListAnimator) objAwait;
                List list12 = (List) stateListAnimator2.OLrzqt();
                this.L$0 = coroutineScope3;
                this.L$1 = deferred;
                this.L$2 = deferredAsync$default;
                this.L$3 = stateListAnimator2;
                this.L$4 = list12;
                this.label = 4;
                objAwait2 = deferred2.await(this);
                if (objAwait2 != objCopydefault2) {
                    return objCopydefault2;
                }
                coroutineScope4 = coroutineScope3;
                deferred3 = deferred;
                deferred4 = deferredAsync$default;
                list = list12;
                C13062cyk.StateListAnimator stateListAnimator10 = (C13062cyk.StateListAnimator) objAwait2;
                List<WalletEntity> listEZpvd = ((C13062cyk.TaskDescription) stateListAnimator10.OLrzqt()).EZpvd();
                this.L$0 = coroutineScope4;
                this.L$1 = deferred4;
                this.L$2 = stateListAnimator2;
                this.L$3 = list;
                this.L$4 = stateListAnimator10;
                this.L$5 = listEZpvd;
                this.label = 5;
                objAwait3 = deferred3.await(this);
                if (objAwait3 != objCopydefault2) {
                    return objCopydefault2;
                }
                Deferred deferred7 = deferred4;
                list2 = list;
                deferred5 = deferred7;
                stateListAnimator3 = stateListAnimator2;
                stateListAnimator4 = stateListAnimator10;
                list3 = listEZpvd;
                C13062cyk.StateListAnimator stateListAnimator11 = (C13062cyk.StateListAnimator) objAwait3;
                List<WalletEntity> listEZpvd2 = ((C13062cyk.TaskDescription) stateListAnimator11.OLrzqt()).EZpvd();
                this.L$0 = coroutineScope4;
                this.L$1 = stateListAnimator3;
                this.L$2 = list2;
                this.L$3 = stateListAnimator4;
                this.L$4 = list3;
                this.L$5 = stateListAnimator11;
                this.L$6 = listEZpvd2;
                this.label = 6;
                objAwait4 = deferred5.await(this);
                if (objAwait4 != objCopydefault2) {
                    return objCopydefault2;
                }
                list4 = list3;
                list5 = list2;
                coroutineScope5 = coroutineScope4;
                stateListAnimator5 = stateListAnimator3;
                list6 = listEZpvd2;
                stateListAnimator6 = stateListAnimator4;
                stateListAnimator7 = stateListAnimator11;
                C13062cyk.StateListAnimator stateListAnimator12 = (C13062cyk.StateListAnimator) objAwait4;
                List list13 = (List) stateListAnimator12.OLrzqt();
                if (this.this$0.AEQbTJ((C13062cyk.StateListAnimator<?>) stateListAnimator5)) {
                    return this.this$0.OLrzqt((C13062cyk.StateListAnimator<?>) stateListAnimator5);
                }
                if (!this.this$0.AEQbTJ((C13062cyk.StateListAnimator<?>) stateListAnimator6)) {
                    return this.this$0.OLrzqt((C13062cyk.StateListAnimator<?>) stateListAnimator6);
                }
                if (!this.this$0.AEQbTJ((C13062cyk.StateListAnimator<?>) stateListAnimator7)) {
                    return this.this$0.OLrzqt((C13062cyk.StateListAnimator<?>) stateListAnimator7);
                }
                if (!this.this$0.AEQbTJ((C13062cyk.StateListAnimator<?>) stateListAnimator12)) {
                    return this.this$0.OLrzqt((C13062cyk.StateListAnimator<?>) stateListAnimator12);
                }
                CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                WalletSyncManager$syncWalletList$2$requestWalletAsset$1 walletSyncManager$syncWalletList$2$requestWalletAsset$1 = new WalletSyncManager$syncWalletList$2$requestWalletAsset$1(list5, list4, list6, list13, null);
                this.L$0 = coroutineScope5;
                this.L$1 = stateListAnimator6;
                this.L$2 = stateListAnimator7;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.label = 7;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, walletSyncManager$syncWalletList$2$requestWalletAsset$1, this);
                if (objWithContext == objCopydefault2) {
                    return objCopydefault2;
                }
                list7 = (List) objWithContext;
                CoroutineDispatcher coroutineDispatcher2 = Dispatchers.getDefault();
                WalletSyncManager$syncWalletList$2$shouldSyncListWallet$1 walletSyncManager$syncWalletList$2$shouldSyncListWallet$1 = new WalletSyncManager$syncWalletList$2$shouldSyncListWallet$1(stateListAnimator6, stateListAnimator7, null);
                this.L$0 = coroutineScope5;
                this.L$1 = list7;
                this.L$2 = null;
                this.label = 8;
                objWithContext2 = BuildersKt.withContext(coroutineDispatcher2, walletSyncManager$syncWalletList$2$shouldSyncListWallet$1, this);
                if (objWithContext2 == objCopydefault2) {
                    return objCopydefault2;
                }
                C13062cyk c13062cyk4 = this.this$0;
                this.L$0 = coroutineScope5;
                this.L$1 = list7;
                this.label = 9;
                objKWHzl2 = c13062cyk4.KWHzl((List<WalletEntity>) objWithContext2, (Continuation<? super List<WalletEntity>>) this);
                if (objKWHzl2 == objCopydefault2) {
                    return objCopydefault2;
                }
                list8 = list7;
                coroutineScope6 = coroutineScope5;
                C13062cyk c13062cyk5 = this.this$0;
                boolean z2 = this.$isDelay;
                String str2 = this.$from;
                C13062cyk.LoaderManager loaderManager2 = this.$waitType;
                this.L$0 = coroutineScope6;
                this.L$1 = list8;
                this.label = 10;
                objKWHzl3 = c13062cyk5.KWHzl((List<WalletEntity>) objKWHzl2, false, z2, str2, loaderManager2, (Continuation<? super C13062cyk.StateListAnimator<Pair<List<WalletEntity>, Map<String, List<ChainAddress>>>>>) this);
                if (objKWHzl3 != objCopydefault2) {
                    return objCopydefault2;
                }
                coroutineScope7 = coroutineScope6;
                stateListAnimator8 = (C13062cyk.StateListAnimator) objKWHzl3;
                C13062cyk c13062cyk6 = this.this$0;
                this.L$0 = coroutineScope7;
                this.L$1 = stateListAnimator8;
                this.label = 11;
                objKWHzl4 = c13062cyk6.KWHzl((List<WalletEntity>) list8, (Continuation<? super List<WalletEntity>>) this);
                if (objKWHzl4 == objCopydefault2) {
                    return objCopydefault2;
                }
                List list14 = (List) objKWHzl4;
                CoroutineScope coroutineScope9 = coroutineScope7;
                Deferred deferredAsync$default6 = BuildersKt__Builders_commonKt.async$default(coroutineScope9, null, null, new WalletSyncManager$syncWalletList$2$successAssetListResultJob$1(this.this$0, list14, null), 3, null);
                deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope9, null, null, new AnonymousClass1(this.this$0, list14, stateListAnimator8, null), 3, null);
                this.L$0 = deferredAsync$default6;
                this.L$1 = null;
                this.label = 12;
                if (deferredAsync$default2.await(this) == objCopydefault2) {
                    return objCopydefault2;
                }
                deferred6 = deferredAsync$default6;
                this.L$0 = null;
                this.label = 13;
                objAwait5 = deferred6.await(this);
                if (objAwait5 == objCopydefault2) {
                    return objCopydefault2;
                }
                stateListAnimator9 = (C13062cyk.StateListAnimator) objAwait5;
                if (!this.this$0.AEQbTJ((C13062cyk.StateListAnimator<?>) stateListAnimator9)) {
                    return this.this$0.OLrzqt((C13062cyk.StateListAnimator<?>) stateListAnimator9);
                }
                c13062cyk2 = this.this$0;
                List list15 = (List) stateListAnimator9.OLrzqt();
                this.L$0 = c13062cyk2;
                this.label = 14;
                objKWHzl5 = c13062cyk2.KWHzl((List<WalletEntity>) list15, (Continuation<? super List<WalletEntity>>) this);
                if (objKWHzl5 == objCopydefault2) {
                    return objCopydefault2;
                }
                boolean z3 = this.$isDelay;
                String str3 = this.$from;
                C13062cyk.LoaderManager loaderManager3 = this.$waitType;
                this.L$0 = null;
                this.label = 15;
                objKWHzl6 = c13062cyk2.KWHzl((List<WalletEntity>) objKWHzl5, true, z3, str3, loaderManager3, (Continuation<? super C13062cyk.StateListAnimator<Pair<List<WalletEntity>, Map<String, List<ChainAddress>>>>>) this);
                if (objKWHzl6 == objCopydefault2) {
                    return objCopydefault2;
                }
                List list16 = (List) ((Pair) ((C13062cyk.StateListAnimator) objKWHzl6).OLrzqt()).getFirst();
                arrayList = new ArrayList(C56403yEb.AYXKKw(list16, 10));
                it = list16.iterator();
                while (it.hasNext()) {
                    arrayList.add(((WalletEntity) it.next()).getId());
                }
                setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
                c13062cyk3 = this.this$0;
                List<WalletEntity> list17 = this.$walletEntities;
                this.L$0 = arrayList;
                this.L$1 = setOqFWZa;
                this.L$2 = c13062cyk3;
                this.label = 16;
                objKWHzl7 = c13062cyk3.KWHzl((List<WalletEntity>) list17, (Continuation<? super List<WalletEntity>>) this);
                if (objKWHzl7 == objCopydefault2) {
                    return objCopydefault2;
                }
                this.L$0 = arrayList;
                this.L$1 = setOqFWZa;
                this.L$2 = null;
                this.label = 17;
                if (c13062cyk3.AYXKKw((List) objKWHzl7, this) == objCopydefault2) {
                    return objCopydefault2;
                }
                List<WalletEntity> list18 = this.$walletEntities;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list18) {
                    if (!setOqFWZa.contains(((WalletEntity) obj2).getId())) {
                        arrayList3.add(obj2);
                    }
                }
                ArrayList arrayList4 = new ArrayList(C56403yEb.AYXKKw(arrayList3, 10));
                it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((WalletEntity) it2.next()).getId());
                }
                return new C13062cyk.ActionBar(arrayList, arrayList4, 0, "");
            case 1:
                c13062cyk = (C13062cyk) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objKWHzl = obj;
                CoroutineScope coroutineScope82 = coroutineScope;
                List list102 = (List) objKWHzl;
                boolean z4 = this.$isDelay;
                String str4 = this.$from;
                C13062cyk.LoaderManager loaderManager4 = this.$waitType;
                this.L$0 = coroutineScope82;
                this.L$1 = null;
                this.label = 2;
                objCopydefault = c13062cyk.copydefault(list102, z4, str4, loaderManager4, this);
                if (objCopydefault != objCopydefault2) {
                }
                break;
            case 2:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                coroutineScope2 = coroutineScope10;
                objCopydefault = obj;
                stateListAnimator = (C13062cyk.StateListAnimator) objCopydefault;
                if (this.this$0.AEQbTJ((C13062cyk.StateListAnimator<?>) stateListAnimator)) {
                }
                break;
            case 3:
                deferredAsync$default = (Deferred) this.L$3;
                Deferred deferred8 = (Deferred) this.L$2;
                deferred2 = (Deferred) this.L$1;
                coroutineScope3 = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                deferred = deferred8;
                objAwait = obj;
                stateListAnimator2 = (C13062cyk.StateListAnimator) objAwait;
                List list122 = (List) stateListAnimator2.OLrzqt();
                this.L$0 = coroutineScope3;
                this.L$1 = deferred;
                this.L$2 = deferredAsync$default;
                this.L$3 = stateListAnimator2;
                this.L$4 = list122;
                this.label = 4;
                objAwait2 = deferred2.await(this);
                if (objAwait2 != objCopydefault2) {
                }
                break;
            case 4:
                list = (List) this.L$4;
                stateListAnimator2 = (C13062cyk.StateListAnimator) this.L$3;
                Deferred deferred9 = (Deferred) this.L$2;
                deferred3 = (Deferred) this.L$1;
                CoroutineScope coroutineScope11 = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                coroutineScope4 = coroutineScope11;
                deferred4 = deferred9;
                objAwait2 = obj;
                C13062cyk.StateListAnimator stateListAnimator102 = (C13062cyk.StateListAnimator) objAwait2;
                List<WalletEntity> listEZpvd3 = ((C13062cyk.TaskDescription) stateListAnimator102.OLrzqt()).EZpvd();
                this.L$0 = coroutineScope4;
                this.L$1 = deferred4;
                this.L$2 = stateListAnimator2;
                this.L$3 = list;
                this.L$4 = stateListAnimator102;
                this.L$5 = listEZpvd3;
                this.label = 5;
                objAwait3 = deferred3.await(this);
                if (objAwait3 != objCopydefault2) {
                }
                break;
            case 5:
                List<WalletEntity> list19 = (List) this.L$5;
                stateListAnimator4 = (C13062cyk.StateListAnimator) this.L$4;
                List list20 = (List) this.L$3;
                C13062cyk.StateListAnimator stateListAnimator13 = (C13062cyk.StateListAnimator) this.L$2;
                Deferred deferred10 = (Deferred) this.L$1;
                coroutineScope4 = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                stateListAnimator3 = stateListAnimator13;
                objAwait3 = obj;
                list3 = list19;
                deferred5 = deferred10;
                list2 = list20;
                C13062cyk.StateListAnimator stateListAnimator112 = (C13062cyk.StateListAnimator) objAwait3;
                List<WalletEntity> listEZpvd22 = ((C13062cyk.TaskDescription) stateListAnimator112.OLrzqt()).EZpvd();
                this.L$0 = coroutineScope4;
                this.L$1 = stateListAnimator3;
                this.L$2 = list2;
                this.L$3 = stateListAnimator4;
                this.L$4 = list3;
                this.L$5 = stateListAnimator112;
                this.L$6 = listEZpvd22;
                this.label = 6;
                objAwait4 = deferred5.await(this);
                if (objAwait4 != objCopydefault2) {
                }
                break;
            case 6:
                List<WalletEntity> list21 = (List) this.L$6;
                stateListAnimator7 = (C13062cyk.StateListAnimator) this.L$5;
                List<WalletEntity> list22 = (List) this.L$4;
                stateListAnimator6 = (C13062cyk.StateListAnimator) this.L$3;
                List list23 = (List) this.L$2;
                stateListAnimator5 = (C13062cyk.StateListAnimator) this.L$1;
                CoroutineScope coroutineScope12 = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                list6 = list21;
                list4 = list22;
                list5 = list23;
                coroutineScope5 = coroutineScope12;
                objAwait4 = obj;
                C13062cyk.StateListAnimator stateListAnimator122 = (C13062cyk.StateListAnimator) objAwait4;
                List list132 = (List) stateListAnimator122.OLrzqt();
                if (this.this$0.AEQbTJ((C13062cyk.StateListAnimator<?>) stateListAnimator5)) {
                }
                break;
            case 7:
                C13062cyk.StateListAnimator stateListAnimator14 = (C13062cyk.StateListAnimator) this.L$2;
                C13062cyk.StateListAnimator stateListAnimator15 = (C13062cyk.StateListAnimator) this.L$1;
                coroutineScope5 = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                stateListAnimator6 = stateListAnimator15;
                stateListAnimator7 = stateListAnimator14;
                objWithContext = obj;
                list7 = (List) objWithContext;
                CoroutineDispatcher coroutineDispatcher22 = Dispatchers.getDefault();
                WalletSyncManager$syncWalletList$2$shouldSyncListWallet$1 walletSyncManager$syncWalletList$2$shouldSyncListWallet$12 = new WalletSyncManager$syncWalletList$2$shouldSyncListWallet$1(stateListAnimator6, stateListAnimator7, null);
                this.L$0 = coroutineScope5;
                this.L$1 = list7;
                this.L$2 = null;
                this.label = 8;
                objWithContext2 = BuildersKt.withContext(coroutineDispatcher22, walletSyncManager$syncWalletList$2$shouldSyncListWallet$12, this);
                if (objWithContext2 == objCopydefault2) {
                }
                C13062cyk c13062cyk42 = this.this$0;
                this.L$0 = coroutineScope5;
                this.L$1 = list7;
                this.label = 9;
                objKWHzl2 = c13062cyk42.KWHzl((List<WalletEntity>) objWithContext2, (Continuation<? super List<WalletEntity>>) this);
                if (objKWHzl2 == objCopydefault2) {
                }
                break;
            case 8:
                list7 = (List) this.L$1;
                CoroutineScope coroutineScope13 = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                coroutineScope5 = coroutineScope13;
                objWithContext2 = obj;
                C13062cyk c13062cyk422 = this.this$0;
                this.L$0 = coroutineScope5;
                this.L$1 = list7;
                this.label = 9;
                objKWHzl2 = c13062cyk422.KWHzl((List<WalletEntity>) objWithContext2, (Continuation<? super List<WalletEntity>>) this);
                if (objKWHzl2 == objCopydefault2) {
                }
                break;
            case 9:
                List list24 = (List) this.L$1;
                CoroutineScope coroutineScope14 = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                list8 = list24;
                coroutineScope6 = coroutineScope14;
                objKWHzl2 = obj;
                C13062cyk c13062cyk52 = this.this$0;
                boolean z22 = this.$isDelay;
                String str22 = this.$from;
                C13062cyk.LoaderManager loaderManager22 = this.$waitType;
                this.L$0 = coroutineScope6;
                this.L$1 = list8;
                this.label = 10;
                objKWHzl3 = c13062cyk52.KWHzl((List<WalletEntity>) objKWHzl2, false, z22, str22, loaderManager22, (Continuation<? super C13062cyk.StateListAnimator<Pair<List<WalletEntity>, Map<String, List<ChainAddress>>>>>) this);
                if (objKWHzl3 != objCopydefault2) {
                }
                break;
            case 10:
                List list25 = (List) this.L$1;
                coroutineScope7 = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                list8 = list25;
                objKWHzl3 = obj;
                stateListAnimator8 = (C13062cyk.StateListAnimator) objKWHzl3;
                C13062cyk c13062cyk62 = this.this$0;
                this.L$0 = coroutineScope7;
                this.L$1 = stateListAnimator8;
                this.label = 11;
                objKWHzl4 = c13062cyk62.KWHzl((List<WalletEntity>) list8, (Continuation<? super List<WalletEntity>>) this);
                if (objKWHzl4 == objCopydefault2) {
                }
                List list142 = (List) objKWHzl4;
                CoroutineScope coroutineScope92 = coroutineScope7;
                Deferred deferredAsync$default62 = BuildersKt__Builders_commonKt.async$default(coroutineScope92, null, null, new WalletSyncManager$syncWalletList$2$successAssetListResultJob$1(this.this$0, list142, null), 3, null);
                deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope92, null, null, new AnonymousClass1(this.this$0, list142, stateListAnimator8, null), 3, null);
                this.L$0 = deferredAsync$default62;
                this.L$1 = null;
                this.label = 12;
                if (deferredAsync$default2.await(this) == objCopydefault2) {
                }
                break;
            case 11:
                stateListAnimator8 = (C13062cyk.StateListAnimator) this.L$1;
                coroutineScope7 = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objKWHzl4 = obj;
                List list1422 = (List) objKWHzl4;
                CoroutineScope coroutineScope922 = coroutineScope7;
                Deferred deferredAsync$default622 = BuildersKt__Builders_commonKt.async$default(coroutineScope922, null, null, new WalletSyncManager$syncWalletList$2$successAssetListResultJob$1(this.this$0, list1422, null), 3, null);
                deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope922, null, null, new AnonymousClass1(this.this$0, list1422, stateListAnimator8, null), 3, null);
                this.L$0 = deferredAsync$default622;
                this.L$1 = null;
                this.label = 12;
                if (deferredAsync$default2.await(this) == objCopydefault2) {
                }
                break;
            case 12:
                deferred6 = (Deferred) this.L$0;
                C56391yDq.AEQbTJ(obj);
                this.L$0 = null;
                this.label = 13;
                objAwait5 = deferred6.await(this);
                if (objAwait5 == objCopydefault2) {
                }
                stateListAnimator9 = (C13062cyk.StateListAnimator) objAwait5;
                if (!this.this$0.AEQbTJ((C13062cyk.StateListAnimator<?>) stateListAnimator9)) {
                }
                break;
            case 13:
                C56391yDq.AEQbTJ(obj);
                objAwait5 = obj;
                stateListAnimator9 = (C13062cyk.StateListAnimator) objAwait5;
                if (!this.this$0.AEQbTJ((C13062cyk.StateListAnimator<?>) stateListAnimator9)) {
                }
                break;
            case 14:
                C13062cyk c13062cyk7 = (C13062cyk) this.L$0;
                C56391yDq.AEQbTJ(obj);
                c13062cyk2 = c13062cyk7;
                objKWHzl5 = obj;
                boolean z32 = this.$isDelay;
                String str32 = this.$from;
                C13062cyk.LoaderManager loaderManager32 = this.$waitType;
                this.L$0 = null;
                this.label = 15;
                objKWHzl6 = c13062cyk2.KWHzl((List<WalletEntity>) objKWHzl5, true, z32, str32, loaderManager32, (Continuation<? super C13062cyk.StateListAnimator<Pair<List<WalletEntity>, Map<String, List<ChainAddress>>>>>) this);
                if (objKWHzl6 == objCopydefault2) {
                }
                List list162 = (List) ((Pair) ((C13062cyk.StateListAnimator) objKWHzl6).OLrzqt()).getFirst();
                arrayList = new ArrayList(C56403yEb.AYXKKw(list162, 10));
                it = list162.iterator();
                while (it.hasNext()) {
                }
                setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
                c13062cyk3 = this.this$0;
                List<WalletEntity> list172 = this.$walletEntities;
                this.L$0 = arrayList;
                this.L$1 = setOqFWZa;
                this.L$2 = c13062cyk3;
                this.label = 16;
                objKWHzl7 = c13062cyk3.KWHzl((List<WalletEntity>) list172, (Continuation<? super List<WalletEntity>>) this);
                if (objKWHzl7 == objCopydefault2) {
                }
                this.L$0 = arrayList;
                this.L$1 = setOqFWZa;
                this.L$2 = null;
                this.label = 17;
                if (c13062cyk3.AYXKKw((List) objKWHzl7, this) == objCopydefault2) {
                }
                List<WalletEntity> list182 = this.$walletEntities;
                ArrayList arrayList32 = new ArrayList();
                while (r2.hasNext()) {
                }
                ArrayList arrayList42 = new ArrayList(C56403yEb.AYXKKw(arrayList32, 10));
                it2 = arrayList32.iterator();
                while (it2.hasNext()) {
                }
                return new C13062cyk.ActionBar(arrayList, arrayList42, 0, "");
            case 15:
                C56391yDq.AEQbTJ(obj);
                objKWHzl6 = obj;
                List list1622 = (List) ((Pair) ((C13062cyk.StateListAnimator) objKWHzl6).OLrzqt()).getFirst();
                arrayList = new ArrayList(C56403yEb.AYXKKw(list1622, 10));
                it = list1622.iterator();
                while (it.hasNext()) {
                }
                setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
                c13062cyk3 = this.this$0;
                List<WalletEntity> list1722 = this.$walletEntities;
                this.L$0 = arrayList;
                this.L$1 = setOqFWZa;
                this.L$2 = c13062cyk3;
                this.label = 16;
                objKWHzl7 = c13062cyk3.KWHzl((List<WalletEntity>) list1722, (Continuation<? super List<WalletEntity>>) this);
                if (objKWHzl7 == objCopydefault2) {
                }
                this.L$0 = arrayList;
                this.L$1 = setOqFWZa;
                this.L$2 = null;
                this.label = 17;
                if (c13062cyk3.AYXKKw((List) objKWHzl7, this) == objCopydefault2) {
                }
                List<WalletEntity> list1822 = this.$walletEntities;
                ArrayList arrayList322 = new ArrayList();
                while (r2.hasNext()) {
                }
                ArrayList arrayList422 = new ArrayList(C56403yEb.AYXKKw(arrayList322, 10));
                it2 = arrayList322.iterator();
                while (it2.hasNext()) {
                }
                return new C13062cyk.ActionBar(arrayList, arrayList422, 0, "");
            case 16:
                C13062cyk c13062cyk8 = (C13062cyk) this.L$2;
                Set set = (Set) this.L$1;
                List list26 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objKWHzl7 = obj;
                c13062cyk3 = c13062cyk8;
                setOqFWZa = set;
                arrayList = list26;
                this.L$0 = arrayList;
                this.L$1 = setOqFWZa;
                this.L$2 = null;
                this.label = 17;
                if (c13062cyk3.AYXKKw((List) objKWHzl7, this) == objCopydefault2) {
                }
                List<WalletEntity> list18222 = this.$walletEntities;
                ArrayList arrayList3222 = new ArrayList();
                while (r2.hasNext()) {
                }
                ArrayList arrayList4222 = new ArrayList(C56403yEb.AYXKKw(arrayList3222, 10));
                it2 = arrayList3222.iterator();
                while (it2.hasNext()) {
                }
                return new C13062cyk.ActionBar(arrayList, arrayList4222, 0, "");
            case 17:
                setOqFWZa = (Set) this.L$1;
                arrayList = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                List<WalletEntity> list182222 = this.$walletEntities;
                ArrayList arrayList32222 = new ArrayList();
                while (r2.hasNext()) {
                }
                ArrayList arrayList42222 = new ArrayList(C56403yEb.AYXKKw(arrayList32222, 10));
                it2 = arrayList32222.iterator();
                while (it2.hasNext()) {
                }
                return new C13062cyk.ActionBar(arrayList, arrayList42222, 0, "");
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.biz.core.wallet.create.WalletSyncManager$syncWalletList$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<WalletEntity> $shouldRequestAssets;
        final /* synthetic */ C13062cyk.StateListAnimator<Pair<List<WalletEntity>, Map<String, List<ChainAddress>>>> $syncWalletsResultFirst;
        int label;
        final /* synthetic */ C13062cyk this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C13062cyk c13062cyk, List<WalletEntity> list, C13062cyk.StateListAnimator<Pair<List<WalletEntity>, Map<String, List<ChainAddress>>>> stateListAnimator, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c13062cyk;
            this.$shouldRequestAssets = list;
            this.$syncWalletsResultFirst = stateListAnimator;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$shouldRequestAssets, this.$syncWalletsResultFirst, continuation);
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
                C13062cyk c13062cyk = this.this$0;
                List<WalletEntity> list = this.$shouldRequestAssets;
                Map<String, List<ChainAddress>> second = this.$syncWalletsResultFirst.OLrzqt().getSecond();
                this.label = 1;
                if (c13062cyk.OLrzqt((List<WalletEntity>) list, (Map<String, ? extends List<ChainAddress>>) second, (Continuation<? super Unit>) this) == objCopydefault) {
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
