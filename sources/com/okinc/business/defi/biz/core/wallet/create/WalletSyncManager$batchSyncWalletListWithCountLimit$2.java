package com.okinc.business.defi.biz.core.wallet.create;

import com.okinc.business.defi.biz.constant.WalletSyncStatus;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C12979cxG;
import o.C13062cyk;
import o.C56391yDq;
import o.C56442yFn;
import o.cQM;
import o.yDY;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletSyncManager$batchSyncWalletListWithCountLimit$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C13062cyk.ActionBar<String>>, Object> {
    final /* synthetic */ boolean $isDelay;
    final /* synthetic */ C13062cyk.LoaderManager $waitType;
    final /* synthetic */ List<String> $walletIds;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C13062cyk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSyncManager$batchSyncWalletListWithCountLimit$2(List<String> list, C13062cyk c13062cyk, boolean z, C13062cyk.LoaderManager loaderManager, Continuation<? super WalletSyncManager$batchSyncWalletListWithCountLimit$2> continuation) {
        super(2, continuation);
        this.$walletIds = list;
        this.this$0 = c13062cyk;
        this.$isDelay = z;
        this.$waitType = loaderManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WalletSyncManager$batchSyncWalletListWithCountLimit$2 walletSyncManager$batchSyncWalletListWithCountLimit$2 = new WalletSyncManager$batchSyncWalletListWithCountLimit$2(this.$walletIds, this.this$0, this.$isDelay, this.$waitType, continuation);
        walletSyncManager$batchSyncWalletListWithCountLimit$2.L$0 = obj;
        return walletSyncManager$batchSyncWalletListWithCountLimit$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C13062cyk.ActionBar<String>> continuation) {
        return ((WalletSyncManager$batchSyncWalletListWithCountLimit$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [355=4] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Set setOqFWZa;
        CoroutineScope coroutineScope;
        C12979cxG c12979cxG;
        C13062cyk.ActionBar actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            if (this.$walletIds.size() > 10) {
                throw new RuntimeException("sync wallet size must not large than 10");
            }
            setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(this.$walletIds);
            cQM cqm = this.this$0.isConnected;
            int value = WalletSyncStatus.HasSync.getValue();
            this.L$0 = coroutineScope2;
            this.L$1 = setOqFWZa;
            this.label = 1;
            Object objEZpvd = cqm.EZpvd(value, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            coroutineScope = coroutineScope2;
            obj = objEZpvd;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    actionBar = (C13062cyk.ActionBar) obj;
                    if (actionBar != null) {
                        return actionBar;
                    }
                    return new C13062cyk.ActionBar(yDY.AhwBna(), yDY.AhwBna(), -1, "");
                }
                C56391yDq.AEQbTJ(obj);
                c12979cxG = (C12979cxG) CollectionsKt___CollectionsKt.firstOrNull((List) obj);
                if (c12979cxG != null) {
                    this.label = 3;
                    obj = c12979cxG.EZpvd(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    actionBar = (C13062cyk.ActionBar) obj;
                    if (actionBar != null) {
                    }
                }
                return new C13062cyk.ActionBar(yDY.AhwBna(), yDY.AhwBna(), -1, "");
            }
            setOqFWZa = (Set) this.L$1;
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            coroutineScope = coroutineScope3;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            if (setOqFWZa.contains(((WalletEntity) obj2).getId())) {
                arrayList.add(obj2);
            }
        }
        C13062cyk c13062cyk = this.this$0;
        boolean z = this.$isDelay;
        C13062cyk.LoaderManager loaderManager = this.$waitType;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        obj = c13062cyk.EZpvd(coroutineScope, arrayList, z, "createWallet", loaderManager, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        c12979cxG = (C12979cxG) CollectionsKt___CollectionsKt.firstOrNull((List) obj);
        if (c12979cxG != null) {
        }
        return new C13062cyk.ActionBar(yDY.AhwBna(), yDY.AhwBna(), -1, "");
    }
}
