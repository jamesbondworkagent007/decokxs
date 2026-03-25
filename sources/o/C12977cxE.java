package o;

import com.okinc.business.defi.biz.core.wallet.create.SyncWalletTaskManager$addAsyncTaskAndStart$1;
import com.okinc.business.defi.biz.core.wallet.create.SyncWalletTaskManager$startSyncTask$1;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cxE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12977cxE<T> {
    public final ConcurrentHashMap<java.lang.String, C12979cxG<T>> AEQbTJ;
    public final CoroutineScope OLrzqt;
    public final kotlinx.coroutines.channels.Channel<C12979cxG<T>> copydefault;

    public C12977cxE(@NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.OLrzqt = coroutineScope;
        this.AEQbTJ = new ConcurrentHashMap<>();
        this.copydefault = ChannelKt.Channel$default(0, null, null, 7, null);
        KWHzl();
    }

    public final C12979cxG<T> AEQbTJ(@NotNull final java.util.List<WalletEntity> list, @NotNull Function0<? extends Deferred<? extends T>> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        C12979cxG<T> c12979cxG = new C12979cxG<>(function0);
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.AEQbTJ.put(((WalletEntity) it.next()).getId(), c12979cxG);
        }
        c12979cxG.copydefault(new Function1() { // from class: o.cxK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12977cxE.OLrzqt(list, this, (java.lang.Throwable) obj);
            }
        });
        return c12979cxG;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.util.List<C12979cxG<T>> list, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        SyncWalletTaskManager$addAsyncTaskAndStart$1 syncWalletTaskManager$addAsyncTaskAndStart$1;
        java.util.Iterator<T> it;
        C12977cxE<T> c12977cxE;
        if (continuation instanceof SyncWalletTaskManager$addAsyncTaskAndStart$1) {
            syncWalletTaskManager$addAsyncTaskAndStart$1 = (SyncWalletTaskManager$addAsyncTaskAndStart$1) continuation;
            int i = syncWalletTaskManager$addAsyncTaskAndStart$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                syncWalletTaskManager$addAsyncTaskAndStart$1.label = i - Integer.MIN_VALUE;
            } else {
                syncWalletTaskManager$addAsyncTaskAndStart$1 = new SyncWalletTaskManager$addAsyncTaskAndStart$1(this, continuation);
            }
        }
        java.lang.Object obj = syncWalletTaskManager$addAsyncTaskAndStart$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = syncWalletTaskManager$addAsyncTaskAndStart$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            it = list.iterator();
            c12977cxE = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (java.util.Iterator) syncWalletTaskManager$addAsyncTaskAndStart$1.L$1;
            c12977cxE = (C12977cxE) syncWalletTaskManager$addAsyncTaskAndStart$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        while (it.hasNext()) {
            C12979cxG<T> c12979cxG = (C12979cxG) it.next();
            kotlinx.coroutines.channels.Channel<C12979cxG<T>> channel = c12977cxE.copydefault;
            syncWalletTaskManager$addAsyncTaskAndStart$1.L$0 = c12977cxE;
            syncWalletTaskManager$addAsyncTaskAndStart$1.L$1 = it;
            syncWalletTaskManager$addAsyncTaskAndStart$1.label = 1;
            if (channel.send(c12979cxG, syncWalletTaskManager$addAsyncTaskAndStart$1) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(this.OLrzqt, null, null, new SyncWalletTaskManager$startSyncTask$1(this, null), 3, null);
    }

    public final C12979cxG<T> KWHzl(@NotNull WalletEntity walletEntity) {
        Intrinsics.checkNotNullParameter(walletEntity, "");
        return this.AEQbTJ.get(walletEntity.getId());
    }

    public static final Unit OLrzqt(java.util.List list, C12977cxE c12977cxE, java.lang.Throwable th) {
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            c12977cxE.AEQbTJ.remove(((WalletEntity) it.next()).getId());
        }
        return Unit.INSTANCE;
    }
}
