package com.okinc.business.defi.biz.core.asset.walletmanagement;

import com.okinc.business.defi.biz.net.bean.WalletTotalAssetModel;
import com.okinc.network.okg.response.ResponseData;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC12784ctX;
import o.AbstractC58260yxt;
import o.C10542bqS;
import o.C10546bqW;
import o.C10856bwO;
import o.C56391yDq;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes3.dex */
public final class GetAllRootWalletAtWalletManagementUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends AbstractC12784ctX>>, Object> {
    final /* synthetic */ boolean $needRefresh;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C10546bqW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAllRootWalletAtWalletManagementUseCase$invoke$2(C10546bqW c10546bqW, boolean z, Continuation<? super GetAllRootWalletAtWalletManagementUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c10546bqW;
        this.$needRefresh = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GetAllRootWalletAtWalletManagementUseCase$invoke$2 getAllRootWalletAtWalletManagementUseCase$invoke$2 = new GetAllRootWalletAtWalletManagementUseCase$invoke$2(this.this$0, this.$needRefresh, continuation);
        getAllRootWalletAtWalletManagementUseCase$invoke$2.L$0 = obj;
        return getAllRootWalletAtWalletManagementUseCase$invoke$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends AbstractC12784ctX>> continuation) {
        return ((GetAllRootWalletAtWalletManagementUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0133 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0134  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List listAhwBna;
        List list;
        HashMap map;
        CoroutineScope coroutineScope;
        Object objKWHzl;
        List list2;
        CoroutineScope coroutineScope2;
        CoroutineDispatcher coroutineDispatcher;
        AnonymousClass2 anonymousClass2;
        ResponseData responseData;
        CoroutineScope coroutineScope3;
        List list3;
        Collection collection;
        CoroutineScope coroutineScope4;
        Object objAwait;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception e) {
            C10856bwO.copydefault(this.this$0.OLrzqt, 0, "getAllRootWallet error");
            C10856bwO.copydefault(this.this$0.OLrzqt, 0, String.valueOf(e));
            listAhwBna = yDY.AhwBna();
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope4 = (CoroutineScope) this.L$0;
            C10856bwO.copydefault(this.this$0.OLrzqt, 0, "getAllRootWallet needRefresh:" + this.$needRefresh);
            AbstractC58260yxt<List<AbstractC12784ctX>> abstractC58260yxtEZpvd = this.this$0.EZpvd.EZpvd(true, true);
            this.L$0 = coroutineScope4;
            this.label = 1;
            objAwait = RxAwaitKt.await(abstractC58260yxtEZpvd, this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
        } else if (i == 1) {
            coroutineScope4 = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objAwait = obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    responseData = (ResponseData) this.L$2;
                    list3 = (List) this.L$1;
                    CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        coroutineScope3 = coroutineScope5;
                        collection = (Collection) responseData.getData();
                        if (collection != null && !collection.isEmpty()) {
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass3(this.this$0, responseData, null), 3, null);
                        }
                        return list3;
                    } catch (Exception e2) {
                        e = e2;
                        list = list3;
                        C10856bwO.copydefault(this.this$0.OLrzqt, 0, "fetchWalletTotalAsset error");
                        C10856bwO.copydefault(this.this$0.OLrzqt, 0, String.valueOf(e));
                        return list;
                    }
                }
                map = (HashMap) this.L$2;
                List list4 = (List) this.L$1;
                coroutineScope2 = (CoroutineScope) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    list2 = list4;
                    objKWHzl = obj;
                    try {
                        ResponseData responseData2 = (ResponseData) objKWHzl;
                        coroutineDispatcher = Dispatchers.getDefault();
                        anonymousClass2 = new AnonymousClass2(responseData2, map, null);
                        this.L$0 = coroutineScope2;
                        this.L$1 = list2;
                        this.L$2 = responseData2;
                        this.label = 4;
                        if (BuildersKt.withContext(coroutineDispatcher, anonymousClass2, this) != objCopydefault) {
                            return objCopydefault;
                        }
                        responseData = responseData2;
                        coroutineScope3 = coroutineScope2;
                        list3 = list2;
                        collection = (Collection) responseData.getData();
                        if (collection != null) {
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass3(this.this$0, responseData, null), 3, null);
                        }
                        return list3;
                    } catch (Exception e3) {
                        e = e3;
                        list4 = list2;
                        list = list4;
                        C10856bwO.copydefault(this.this$0.OLrzqt, 0, "fetchWalletTotalAsset error");
                        C10856bwO.copydefault(this.this$0.OLrzqt, 0, String.valueOf(e));
                        return list;
                    }
                } catch (Exception e4) {
                    e = e4;
                    list = list4;
                    C10856bwO.copydefault(this.this$0.OLrzqt, 0, "fetchWalletTotalAsset error");
                    C10856bwO.copydefault(this.this$0.OLrzqt, 0, String.valueOf(e));
                    return list;
                }
            }
            map = (HashMap) this.L$2;
            list = (List) this.L$1;
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            try {
                C10542bqS c10542bqS = this.this$0.copydefault;
                Collection collectionValues = map.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "");
                List<? extends AbstractC12782ctV> listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(collectionValues);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                this.L$0 = coroutineScope;
                this.L$1 = list;
                this.L$2 = map;
                this.label = 3;
                objKWHzl = c10542bqS.KWHzl(listAxsJAYsNCnLh, io2, this);
                if (objKWHzl != objCopydefault) {
                    return objCopydefault;
                }
                CoroutineScope coroutineScope6 = coroutineScope;
                list2 = list;
                coroutineScope2 = coroutineScope6;
                ResponseData responseData22 = (ResponseData) objKWHzl;
                coroutineDispatcher = Dispatchers.getDefault();
                anonymousClass2 = new AnonymousClass2(responseData22, map, null);
                this.L$0 = coroutineScope2;
                this.L$1 = list2;
                this.L$2 = responseData22;
                this.label = 4;
                if (BuildersKt.withContext(coroutineDispatcher, anonymousClass2, this) != objCopydefault) {
                }
            } catch (Exception e5) {
                e = e5;
                C10856bwO.copydefault(this.this$0.OLrzqt, 0, "fetchWalletTotalAsset error");
                C10856bwO.copydefault(this.this$0.OLrzqt, 0, String.valueOf(e));
                return list;
            }
        }
        listAhwBna = (List) objAwait;
        Intrinsics.copydefault(listAhwBna);
        if (!(true ^ listAhwBna.isEmpty()) || !this.$needRefresh) {
            return listAhwBna;
        }
        HashMap map2 = new HashMap();
        CoroutineDispatcher coroutineDispatcher2 = Dispatchers.getDefault();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(listAhwBna, map2, null);
        this.L$0 = coroutineScope4;
        this.L$1 = listAhwBna;
        this.L$2 = map2;
        this.label = 2;
        if (BuildersKt.withContext(coroutineDispatcher2, anonymousClass1, this) == objCopydefault) {
            return objCopydefault;
        }
        list = listAhwBna;
        map = map2;
        coroutineScope = coroutineScope4;
        C10542bqS c10542bqS2 = this.this$0.copydefault;
        Collection collectionValues2 = map.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues2, "");
        List<? extends AbstractC12782ctV> listAxsJAYsNCnLh2 = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(collectionValues2);
        CoroutineDispatcher io22 = Dispatchers.getIO();
        this.L$0 = coroutineScope;
        this.L$1 = list;
        this.L$2 = map;
        this.label = 3;
        objKWHzl = c10542bqS2.KWHzl(listAxsJAYsNCnLh2, io22, this);
        if (objKWHzl != objCopydefault) {
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.biz.core.asset.walletmanagement.GetAllRootWalletAtWalletManagementUseCase$invoke$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<AbstractC12784ctX> $allRootWallets;
        final /* synthetic */ HashMap<String, AbstractC12782ctV> $walletMap;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends o.ctX> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(List<? extends AbstractC12784ctX> list, HashMap<String, AbstractC12782ctV> map, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$allRootWallets = list;
            this.$walletMap = map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$allRootWallets, this.$walletMap, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                List<AbstractC12784ctX> list = this.$allRootWallets;
                Intrinsics.copydefault(list);
                HashMap<String, AbstractC12782ctV> map = this.$walletMap;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    for (AbstractC12782ctV abstractC12782ctV : ((AbstractC12784ctX) it.next()).KWHzl()) {
                        map.put(abstractC12782ctV.DbNXlk(), abstractC12782ctV);
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.biz.core.asset.walletmanagement.GetAllRootWalletAtWalletManagementUseCase$invoke$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ HashMap<String, AbstractC12782ctV> $walletMap;
        final /* synthetic */ ResponseData<List<WalletTotalAssetModel>> $walletTotalAssets;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ResponseData<List<WalletTotalAssetModel>> responseData, HashMap<String, AbstractC12782ctV> map, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$walletTotalAssets = responseData;
            this.$walletMap = map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$walletTotalAssets, this.$walletMap, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                List<WalletTotalAssetModel> data = this.$walletTotalAssets.getData();
                if (data == null) {
                    return null;
                }
                HashMap<String, AbstractC12782ctV> map = this.$walletMap;
                for (WalletTotalAssetModel walletTotalAssetModel : data) {
                    AbstractC12782ctV abstractC12782ctV = map.get(walletTotalAssetModel.getAccountId());
                    if (abstractC12782ctV != null) {
                        String tokenAsset = walletTotalAssetModel.getTokenAsset();
                        if (tokenAsset == null) {
                            tokenAsset = "";
                        }
                        abstractC12782ctV.hDKMBd(tokenAsset);
                        String tokenAssetFilter = walletTotalAssetModel.getTokenAssetFilter();
                        if (tokenAssetFilter == null) {
                            tokenAssetFilter = "";
                        }
                        abstractC12782ctV.getNewProxyInstance(tokenAssetFilter);
                        String nftAsset = walletTotalAssetModel.getNftAsset();
                        if (nftAsset == null) {
                            nftAsset = "";
                        }
                        abstractC12782ctV.fJNWhG(nftAsset);
                        String defiAsset = walletTotalAssetModel.getDefiAsset();
                        abstractC12782ctV.AuCTel(defiAsset != null ? defiAsset : "");
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.biz.core.asset.walletmanagement.GetAllRootWalletAtWalletManagementUseCase$invoke$2$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ResponseData<List<WalletTotalAssetModel>> $walletTotalAssets;
        int label;
        final /* synthetic */ C10546bqW this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C10546bqW c10546bqW, ResponseData<List<WalletTotalAssetModel>> responseData, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = c10546bqW;
            this.$walletTotalAssets = responseData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$walletTotalAssets, continuation);
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
                C10542bqS c10542bqS = this.this$0.copydefault;
                List<WalletTotalAssetModel> data = this.$walletTotalAssets.getData();
                Intrinsics.copydefault(data);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                this.label = 1;
                if (c10542bqS.EZpvd(data, io2, this) == objCopydefault) {
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
