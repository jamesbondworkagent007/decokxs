package o;

import com.okinc.business.web3pay.lib.features.contacts.data.datasource.cache.Web3PayContactsCacheSourceImpl$getCachedContacts$1;
import com.okinc.business.web3pay.lib.features.contacts.data.datasource.cache.Web3PayContactsCacheSourceImpl$isCacheValid$1;
import com.okinc.business.web3pay.lib.features.contacts.data.datasource.cache.Web3PayContactsCacheSourceImpl$setContacts$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lqZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31254lqZ implements InterfaceC31309lrb {
    public java.util.List<C31314lrg> AEQbTJ = yDY.AhwBna();
    public final Mutex KWHzl = MutexKt.Mutex$default(false, 1, null);

    @yCM
    public C31254lqZ() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC31309lrb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        Web3PayContactsCacheSourceImpl$isCacheValid$1 web3PayContactsCacheSourceImpl$isCacheValid$1;
        C31254lqZ c31254lqZ;
        Mutex mutex;
        if (continuation instanceof Web3PayContactsCacheSourceImpl$isCacheValid$1) {
            web3PayContactsCacheSourceImpl$isCacheValid$1 = (Web3PayContactsCacheSourceImpl$isCacheValid$1) continuation;
            int i = web3PayContactsCacheSourceImpl$isCacheValid$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                web3PayContactsCacheSourceImpl$isCacheValid$1.label = i - Integer.MIN_VALUE;
            } else {
                web3PayContactsCacheSourceImpl$isCacheValid$1 = new Web3PayContactsCacheSourceImpl$isCacheValid$1(this, continuation);
            }
        }
        java.lang.Object obj = web3PayContactsCacheSourceImpl$isCacheValid$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = web3PayContactsCacheSourceImpl$isCacheValid$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Mutex mutex2 = this.KWHzl;
            web3PayContactsCacheSourceImpl$isCacheValid$1.L$0 = this;
            web3PayContactsCacheSourceImpl$isCacheValid$1.L$1 = mutex2;
            web3PayContactsCacheSourceImpl$isCacheValid$1.label = 1;
            if (mutex2.lock(null, web3PayContactsCacheSourceImpl$isCacheValid$1) == objCopydefault) {
                return objCopydefault;
            }
            c31254lqZ = this;
            mutex = mutex2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) web3PayContactsCacheSourceImpl$isCacheValid$1.L$1;
            c31254lqZ = (C31254lqZ) web3PayContactsCacheSourceImpl$isCacheValid$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        try {
            return C56443yFo.KWHzl(!c31254lqZ.AEQbTJ.isEmpty());
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC31309lrb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.util.List<C31314lrg> list, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        Web3PayContactsCacheSourceImpl$setContacts$1 web3PayContactsCacheSourceImpl$setContacts$1;
        Mutex mutex;
        C31254lqZ c31254lqZ;
        if (continuation instanceof Web3PayContactsCacheSourceImpl$setContacts$1) {
            web3PayContactsCacheSourceImpl$setContacts$1 = (Web3PayContactsCacheSourceImpl$setContacts$1) continuation;
            int i = web3PayContactsCacheSourceImpl$setContacts$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                web3PayContactsCacheSourceImpl$setContacts$1.label = i - Integer.MIN_VALUE;
            } else {
                web3PayContactsCacheSourceImpl$setContacts$1 = new Web3PayContactsCacheSourceImpl$setContacts$1(this, continuation);
            }
        }
        java.lang.Object obj = web3PayContactsCacheSourceImpl$setContacts$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = web3PayContactsCacheSourceImpl$setContacts$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            mutex = this.KWHzl;
            web3PayContactsCacheSourceImpl$setContacts$1.L$0 = this;
            web3PayContactsCacheSourceImpl$setContacts$1.L$1 = list;
            web3PayContactsCacheSourceImpl$setContacts$1.L$2 = mutex;
            web3PayContactsCacheSourceImpl$setContacts$1.label = 1;
            if (mutex.lock(null, web3PayContactsCacheSourceImpl$setContacts$1) == objCopydefault) {
                return objCopydefault;
            }
            c31254lqZ = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) web3PayContactsCacheSourceImpl$setContacts$1.L$2;
            java.util.List<C31314lrg> list2 = (java.util.List) web3PayContactsCacheSourceImpl$setContacts$1.L$1;
            c31254lqZ = (C31254lqZ) web3PayContactsCacheSourceImpl$setContacts$1.L$0;
            C56391yDq.AEQbTJ(obj);
            mutex = mutex2;
            list = list2;
        }
        try {
            c31254lqZ.AEQbTJ = list;
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC31309lrb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Continuation<? super java.util.List<C31314lrg>> continuation) throws java.lang.Throwable {
        Web3PayContactsCacheSourceImpl$getCachedContacts$1 web3PayContactsCacheSourceImpl$getCachedContacts$1;
        C31254lqZ c31254lqZ;
        Mutex mutex;
        if (continuation instanceof Web3PayContactsCacheSourceImpl$getCachedContacts$1) {
            web3PayContactsCacheSourceImpl$getCachedContacts$1 = (Web3PayContactsCacheSourceImpl$getCachedContacts$1) continuation;
            int i = web3PayContactsCacheSourceImpl$getCachedContacts$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                web3PayContactsCacheSourceImpl$getCachedContacts$1.label = i - Integer.MIN_VALUE;
            } else {
                web3PayContactsCacheSourceImpl$getCachedContacts$1 = new Web3PayContactsCacheSourceImpl$getCachedContacts$1(this, continuation);
            }
        }
        java.lang.Object obj = web3PayContactsCacheSourceImpl$getCachedContacts$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = web3PayContactsCacheSourceImpl$getCachedContacts$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Mutex mutex2 = this.KWHzl;
            web3PayContactsCacheSourceImpl$getCachedContacts$1.L$0 = this;
            web3PayContactsCacheSourceImpl$getCachedContacts$1.L$1 = mutex2;
            web3PayContactsCacheSourceImpl$getCachedContacts$1.label = 1;
            if (mutex2.lock(null, web3PayContactsCacheSourceImpl$getCachedContacts$1) == objCopydefault) {
                return objCopydefault;
            }
            c31254lqZ = this;
            mutex = mutex2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) web3PayContactsCacheSourceImpl$getCachedContacts$1.L$1;
            c31254lqZ = (C31254lqZ) web3PayContactsCacheSourceImpl$getCachedContacts$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        try {
            return c31254lqZ.AEQbTJ;
        } finally {
            mutex.unlock(null);
        }
    }
}
