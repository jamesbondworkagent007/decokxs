package com.okinc.business.defi.biz.core.asset;

import com.okinc.business.defi.biz.core.asset.WalletAssetManager$saveWalletAssetCache$1;
import com.okinc.business.defi.biz.net.bean.AssetAll;
import com.okinc.business.defi.biz.net.bean.NftAll;
import com.okinc.business.defi.biz.net.bean.NftBean;
import com.okinc.business.defi.biz.net.bean.Portfolio;
import com.okinc.business.defi.biz.net.bean.TokenAsset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C10407bnq;
import o.C11607cUn;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC58229yxO;

/* JADX INFO: loaded from: classes3.dex */
public final class WalletAssetManager$saveWalletAssetCache$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    final /* synthetic */ AssetAll $asset;
    final /* synthetic */ boolean $hasPnl;
    final /* synthetic */ boolean $isFromSyncManager;
    final /* synthetic */ AbstractC12782ctV $wallet;
    int label;
    final /* synthetic */ C10407bnq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletAssetManager$saveWalletAssetCache$1(AssetAll assetAll, AbstractC12782ctV abstractC12782ctV, C10407bnq c10407bnq, boolean z, boolean z2, Continuation<? super WalletAssetManager$saveWalletAssetCache$1> continuation) {
        super(2, continuation);
        this.$asset = assetAll;
        this.$wallet = abstractC12782ctV;
        this.this$0 = c10407bnq;
        this.$isFromSyncManager = z;
        this.$hasPnl = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletAssetManager$saveWalletAssetCache$1(this.$asset, this.$wallet, this.this$0, this.$isFromSyncManager, this.$hasPnl, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
        return ((WalletAssetManager$saveWalletAssetCache$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        NftAll nftAll;
        ArrayList<NftBean> collections;
        Integer numAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$asset.getTokens() == null && this.$asset.getDefis() == null && this.$asset.getNfts() == null) {
                numAEQbTJ = C56443yFo.AEQbTJ(0);
                Intrinsics.copydefault(numAEQbTJ);
                return numAEQbTJ;
            }
            List listSynchronizedList = Collections.synchronizedList(new ArrayList());
            AbstractC12782ctV abstractC12782ctV = this.$wallet;
            if (Intrinsics.EZpvd((Object) (abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null), (Object) this.$asset.getAccountId())) {
                ArrayList<TokenAsset> tokens = this.$asset.getTokens();
                if (tokens != null) {
                    C56443yFo.KWHzl(listSynchronizedList.add(this.this$0.KWHzl(this.$wallet, (List<TokenAsset>) tokens, true, this.$isFromSyncManager, this.$hasPnl)));
                }
                ArrayList<Portfolio> defis = this.$asset.getDefis();
                if (defis != null) {
                    C56443yFo.KWHzl(listSynchronizedList.add(this.this$0.djBIcL(this.$wallet, (List<Portfolio>) defis)));
                }
                ArrayList<NftAll> nfts = this.$asset.getNfts();
                if (nfts != null && (nftAll = (NftAll) CollectionsKt___CollectionsKt.firstOrNull(nfts)) != null && (collections = nftAll.getCollections()) != null) {
                    C56443yFo.KWHzl(listSynchronizedList.add(this.this$0.AhwBna(this.$wallet, (List<NftBean>) collections)));
                }
            }
            Intrinsics.copydefault(listSynchronizedList);
            AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(listSynchronizedList);
            final Function1 function1 = new Function1() { // from class: o.bqA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return WalletAssetManager$saveWalletAssetCache$1.invokeSuspend$lambda$3((java.util.List) obj2);
                }
            };
            AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.bqC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj2) {
                    return WalletAssetManager$saveWalletAssetCache$1.invokeSuspend$lambda$4(function1, obj2);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
            this.label = 1;
            obj = RxAwaitKt.await(abstractC58260yxtCopydefault, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        numAEQbTJ = (Integer) obj;
        Intrinsics.copydefault(numAEQbTJ);
        return numAEQbTJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer invokeSuspend$lambda$3(List list) {
        return Integer.valueOf(list.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer invokeSuspend$lambda$4(Function1 function1, Object obj) {
        return (Integer) function1.invoke(obj);
    }
}
