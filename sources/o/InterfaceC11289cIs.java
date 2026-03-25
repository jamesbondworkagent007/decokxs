package o;

import com.okinc.business.defi.biz.database.wallet.dao.AddressDao$updateEosInfosSuspend$1;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressSegWitEntity;
import com.okinc.business.defi.biz.database.wallet.entity.EOSInfoEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cIs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC11289cIs {
    java.lang.Object AEQbTJ(@NotNull java.lang.String str, long j, @NotNull Continuation<? super java.util.List<ChainAddressEntity>> continuation);

    java.lang.Object AEQbTJ(@NotNull java.util.List<EOSInfoEntity> list, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation);

    java.util.List<ChainAddressSegWitEntity> AEQbTJ(@NotNull java.lang.String str, long j, int i);

    java.util.List<java.lang.Long> AEQbTJ(@NotNull java.util.List<ChainAddressEntity> list);

    long EZpvd(@NotNull ChainAddressEntity chainAddressEntity);

    java.lang.Object EZpvd(@NotNull java.util.List<java.lang.String> list, @NotNull java.util.List<java.lang.Long> list2, @NotNull java.util.List<java.lang.Integer> list3, @NotNull Continuation<? super java.util.Map<java.lang.String, ? extends java.util.List<ChainAddressSegWitEntity>>> continuation);

    java.lang.Object EZpvd(@NotNull java.util.List<EOSInfoEntity> list, @NotNull java.util.List<ChainAddressEntity> list2, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation);

    java.lang.Object EZpvd(@NotNull java.util.List<java.lang.Long> list, @NotNull Continuation<? super java.util.List<cII>> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object KWHzl(@NotNull java.util.List<java.lang.String> list, @NotNull java.util.List<java.lang.Long> list2, @NotNull Continuation<? super java.util.Map<java.lang.String, ? extends java.util.List<ChainAddressEntity>>> continuation);

    java.lang.Object KWHzl(@NotNull java.util.List<ChainAddressSegWitEntity> list, @NotNull Continuation<? super java.lang.Integer> continuation);

    java.lang.Object OLrzqt(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.Map<java.lang.String, ? extends java.util.List<EOSInfoEntity>>> continuation);

    java.util.List<ChainAddressEntity> OLrzqt(@NotNull java.lang.String str);

    java.lang.Object copydefault(@NotNull java.util.List<ChainAddressEntity> list, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation);

    java.util.List<WalletEntity> copydefault(long j, @NotNull java.lang.String str);

    /* JADX INFO: renamed from: o.cIs$StateListAnimator */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class StateListAnimator {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object AEQbTJ(@NotNull InterfaceC11289cIs interfaceC11289cIs, @NotNull java.util.List<EOSInfoEntity> list, @NotNull java.util.List<ChainAddressEntity> list2, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation) throws java.lang.Throwable {
            AddressDao$updateEosInfosSuspend$1 addressDao$updateEosInfosSuspend$1;
            if (continuation instanceof AddressDao$updateEosInfosSuspend$1) {
                addressDao$updateEosInfosSuspend$1 = (AddressDao$updateEosInfosSuspend$1) continuation;
                int i = addressDao$updateEosInfosSuspend$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    addressDao$updateEosInfosSuspend$1.label = i - Integer.MIN_VALUE;
                } else {
                    addressDao$updateEosInfosSuspend$1 = new AddressDao$updateEosInfosSuspend$1(continuation);
                }
            }
            java.lang.Object objCopydefault = addressDao$updateEosInfosSuspend$1.result;
            java.lang.Object objCopydefault2 = C56442yFn.copydefault();
            int i2 = addressDao$updateEosInfosSuspend$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                addressDao$updateEosInfosSuspend$1.L$0 = interfaceC11289cIs;
                addressDao$updateEosInfosSuspend$1.L$1 = list2;
                addressDao$updateEosInfosSuspend$1.label = 1;
                if (interfaceC11289cIs.AEQbTJ(list, addressDao$updateEosInfosSuspend$1) == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        C56391yDq.AEQbTJ(objCopydefault);
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (java.util.List) addressDao$updateEosInfosSuspend$1.L$1;
                interfaceC11289cIs = (InterfaceC11289cIs) addressDao$updateEosInfosSuspend$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
            addressDao$updateEosInfosSuspend$1.L$0 = null;
            addressDao$updateEosInfosSuspend$1.L$1 = null;
            addressDao$updateEosInfosSuspend$1.label = 2;
            objCopydefault = interfaceC11289cIs.copydefault(list2, addressDao$updateEosInfosSuspend$1);
            return objCopydefault == objCopydefault2 ? objCopydefault2 : objCopydefault;
        }
    }
}
