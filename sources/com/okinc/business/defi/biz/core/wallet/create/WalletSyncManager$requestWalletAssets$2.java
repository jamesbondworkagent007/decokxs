package com.okinc.business.defi.biz.core.wallet.create;

import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import com.okinc.business.defi.biz.net.bean.AssetAll;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C10407bnq;
import o.C12827cuN;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletSyncManager$requestWalletAssets$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<AssetAll> $assetList;
    final /* synthetic */ Map<String, WalletEntity> $id2WalletEntityMap;
    final /* synthetic */ boolean $needPnl;
    final /* synthetic */ List<WalletEntity> $successWalletEntities;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSyncManager$requestWalletAssets$2(List<AssetAll> list, boolean z, Map<String, WalletEntity> map, List<WalletEntity> list2, Continuation<? super WalletSyncManager$requestWalletAssets$2> continuation) {
        super(2, continuation);
        this.$assetList = list;
        this.$needPnl = z;
        this.$id2WalletEntityMap = map;
        this.$successWalletEntities = list2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSyncManager$requestWalletAssets$2(this.$assetList, this.$needPnl, this.$id2WalletEntityMap, this.$successWalletEntities, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletSyncManager$requestWalletAssets$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00a7 -> B:7:0x0024). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        Map<String, WalletEntity> map;
        List<WalletEntity> list;
        Iterator it;
        Map<String, WalletEntity> map2;
        List<WalletEntity> list2;
        Iterator it2;
        AssetAll assetAll;
        WalletEntity walletEntity;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List<AssetAll> list3 = this.$assetList;
            z = this.$needPnl;
            map = this.$id2WalletEntityMap;
            list = this.$successWalletEntities;
            it = list3.iterator();
            if (!it.hasNext()) {
            }
        } else if (i == 1) {
            z = this.Z$0;
            assetAll = (AssetAll) this.L$3;
            it2 = (Iterator) this.L$2;
            list2 = (List) this.L$1;
            map2 = (Map) this.L$0;
            C56391yDq.AEQbTJ(obj);
            AbstractC58260yxt<Integer> abstractC58260yxtKWHzl = C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).KWHzl((AbstractC12782ctV) obj, assetAll, true, z);
            this.L$0 = map2;
            this.L$1 = list2;
            this.L$2 = it2;
            this.L$3 = assetAll;
            this.Z$0 = z;
            this.label = 2;
            obj = RxAwaitKt.await(abstractC58260yxtKWHzl, this);
            if (obj == objCopydefault) {
            }
            List<WalletEntity> list4 = list2;
            AssetAll assetAll2 = assetAll;
            map = map2;
            if (((Number) obj).intValue() > 0) {
            }
            it = it2;
            list = list4;
            if (!it.hasNext()) {
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.Z$0;
            assetAll = (AssetAll) this.L$3;
            it2 = (Iterator) this.L$2;
            list2 = (List) this.L$1;
            map2 = (Map) this.L$0;
            C56391yDq.AEQbTJ(obj);
            List<WalletEntity> list42 = list2;
            AssetAll assetAll22 = assetAll;
            map = map2;
            if (((Number) obj).intValue() > 0 && (walletEntity = map.get(assetAll22.getAccountId())) != null) {
                list42.add(walletEntity);
            }
            it = it2;
            list = list42;
            if (!it.hasNext()) {
                AssetAll assetAll3 = (AssetAll) it.next();
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(assetAll3.getAccountId(), false);
                this.L$0 = map;
                this.L$1 = list;
                this.L$2 = it;
                this.L$3 = assetAll3;
                this.Z$0 = z;
                this.label = 1;
                Object objAwait = RxAwaitKt.await(abstractC58260yxtCopydefault, this);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
                List<WalletEntity> list5 = list;
                it2 = it;
                obj = objAwait;
                map2 = map;
                assetAll = assetAll3;
                list2 = list5;
                AbstractC58260yxt<Integer> abstractC58260yxtKWHzl2 = C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).KWHzl((AbstractC12782ctV) obj, assetAll, true, z);
                this.L$0 = map2;
                this.L$1 = list2;
                this.L$2 = it2;
                this.L$3 = assetAll;
                this.Z$0 = z;
                this.label = 2;
                obj = RxAwaitKt.await(abstractC58260yxtKWHzl2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                List<WalletEntity> list422 = list2;
                AssetAll assetAll222 = assetAll;
                map = map2;
                if (((Number) obj).intValue() > 0) {
                    list422.add(walletEntity);
                }
                it = it2;
                list = list422;
                if (!it.hasNext()) {
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
