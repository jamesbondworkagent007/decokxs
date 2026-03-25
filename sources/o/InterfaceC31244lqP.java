package o;

import com.okinc.business.web3pay.lib.features.contacts.data.dao.RecentContactDao$saveRecentContact$1;
import com.okinc.business.web3pay.lib.features.contacts.data.entity.Web3PayRecentContactEntity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lqP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC31244lqP {
    java.lang.Object AEQbTJ(@NotNull Web3PayRecentContactEntity web3PayRecentContactEntity, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, int i, @NotNull Continuation<? super java.util.List<Web3PayRecentContactEntity>> continuation);

    java.lang.Object AEQbTJ(@NotNull Continuation<? super Unit> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, int i, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, java.lang.Long l, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object copydefault(@NotNull Web3PayRecentContactEntity web3PayRecentContactEntity, int i, @NotNull Continuation<? super Unit> continuation);

    /* JADX INFO: renamed from: o.lqP$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX WARN: Removed duplicated region for block: B:27:0x0091 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object EZpvd(@NotNull InterfaceC31244lqP interfaceC31244lqP, @NotNull Web3PayRecentContactEntity web3PayRecentContactEntity, int i, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
            RecentContactDao$saveRecentContact$1 recentContactDao$saveRecentContact$1;
            InterfaceC31244lqP interfaceC31244lqP2;
            int i2;
            java.lang.String key;
            if (continuation instanceof RecentContactDao$saveRecentContact$1) {
                recentContactDao$saveRecentContact$1 = (RecentContactDao$saveRecentContact$1) continuation;
                int i3 = recentContactDao$saveRecentContact$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    recentContactDao$saveRecentContact$1.label = i3 - Integer.MIN_VALUE;
                } else {
                    recentContactDao$saveRecentContact$1 = new RecentContactDao$saveRecentContact$1(continuation);
                }
            }
            java.lang.Object obj = recentContactDao$saveRecentContact$1.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i4 = recentContactDao$saveRecentContact$1.label;
            if (i4 == 0) {
                C56391yDq.AEQbTJ(obj);
                java.lang.String key2 = web3PayRecentContactEntity.getKey();
                java.lang.Long contactId = web3PayRecentContactEntity.getContactId();
                recentContactDao$saveRecentContact$1.L$0 = interfaceC31244lqP;
                recentContactDao$saveRecentContact$1.L$1 = web3PayRecentContactEntity;
                recentContactDao$saveRecentContact$1.I$0 = i;
                recentContactDao$saveRecentContact$1.label = 1;
                if (interfaceC31244lqP.KWHzl(key2, contactId, recentContactDao$saveRecentContact$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    i2 = recentContactDao$saveRecentContact$1.I$0;
                    web3PayRecentContactEntity = (Web3PayRecentContactEntity) recentContactDao$saveRecentContact$1.L$1;
                    interfaceC31244lqP2 = (InterfaceC31244lqP) recentContactDao$saveRecentContact$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    key = web3PayRecentContactEntity.getKey();
                    recentContactDao$saveRecentContact$1.L$0 = null;
                    recentContactDao$saveRecentContact$1.L$1 = null;
                    recentContactDao$saveRecentContact$1.label = 3;
                    if (interfaceC31244lqP2.EZpvd(key, i2, recentContactDao$saveRecentContact$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                i = recentContactDao$saveRecentContact$1.I$0;
                web3PayRecentContactEntity = (Web3PayRecentContactEntity) recentContactDao$saveRecentContact$1.L$1;
                interfaceC31244lqP = (InterfaceC31244lqP) recentContactDao$saveRecentContact$1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            recentContactDao$saveRecentContact$1.L$0 = interfaceC31244lqP;
            recentContactDao$saveRecentContact$1.L$1 = web3PayRecentContactEntity;
            recentContactDao$saveRecentContact$1.I$0 = i;
            recentContactDao$saveRecentContact$1.label = 2;
            if (interfaceC31244lqP.AEQbTJ(web3PayRecentContactEntity, recentContactDao$saveRecentContact$1) == objCopydefault) {
                return objCopydefault;
            }
            int i5 = i;
            interfaceC31244lqP2 = interfaceC31244lqP;
            i2 = i5;
            key = web3PayRecentContactEntity.getKey();
            recentContactDao$saveRecentContact$1.L$0 = null;
            recentContactDao$saveRecentContact$1.L$1 = null;
            recentContactDao$saveRecentContact$1.label = 3;
            if (interfaceC31244lqP2.EZpvd(key, i2, recentContactDao$saveRecentContact$1) == objCopydefault) {
            }
            return Unit.INSTANCE;
        }
    }
}
