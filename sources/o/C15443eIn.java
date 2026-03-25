package o;

import com.okinc.business.defi.biz.core.error.EmptyResultException;
import com.okinc.business.defi.biz.model.wallet.OneKeyAccountInfo;
import com.okinc.business.defi.biz.model.wallet.OneKeyAddress;
import com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.GetRootWalletEvmAddressUseCase$getEvmAddressForIndex$1;
import com.okinc.wallet.hardware.api.onekey.OneKeyException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxAwaitKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eIn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15443eIn {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final C12827cuN KWHzl;

    @yCM
    public C15443eIn(@NotNull C12827cuN c12827cuN) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        this.KWHzl = c12827cuN;
    }

    /* JADX INFO: renamed from: o.eIn$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eIn.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, int i, @NotNull Continuation<? super C15448eIs> continuation) throws java.lang.Throwable {
        GetRootWalletEvmAddressUseCase$getEvmAddressForIndex$1 getRootWalletEvmAddressUseCase$getEvmAddressForIndex$1;
        java.lang.String strAYXKKw;
        java.util.List<OneKeyAddress> evmAddresses;
        OneKeyAddress oneKeyAddress;
        java.lang.String address;
        java.util.List<OneKeyAccountInfo> listDjBIcL;
        if (continuation instanceof GetRootWalletEvmAddressUseCase$getEvmAddressForIndex$1) {
            getRootWalletEvmAddressUseCase$getEvmAddressForIndex$1 = (GetRootWalletEvmAddressUseCase$getEvmAddressForIndex$1) continuation;
            int i2 = getRootWalletEvmAddressUseCase$getEvmAddressForIndex$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getRootWalletEvmAddressUseCase$getEvmAddressForIndex$1.label = i2 - Integer.MIN_VALUE;
            } else {
                getRootWalletEvmAddressUseCase$getEvmAddressForIndex$1 = new GetRootWalletEvmAddressUseCase$getEvmAddressForIndex$1(this, continuation);
            }
        }
        java.lang.Object objAwait = getRootWalletEvmAddressUseCase$getEvmAddressForIndex$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = getRootWalletEvmAddressUseCase$getEvmAddressForIndex$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objAwait);
                AbstractC58260yxt<AbstractC12784ctX> abstractC58260yxtDjBIcL = this.KWHzl.djBIcL(str);
                getRootWalletEvmAddressUseCase$getEvmAddressForIndex$1.L$0 = str;
                getRootWalletEvmAddressUseCase$getEvmAddressForIndex$1.I$0 = i;
                getRootWalletEvmAddressUseCase$getEvmAddressForIndex$1.label = 1;
                objAwait = RxAwaitKt.await(abstractC58260yxtDjBIcL, getRootWalletEvmAddressUseCase$getEvmAddressForIndex$1);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = getRootWalletEvmAddressUseCase$getEvmAddressForIndex$1.I$0;
                str = (java.lang.String) getRootWalletEvmAddressUseCase$getEvmAddressForIndex$1.L$0;
                C56391yDq.AEQbTJ(objAwait);
            }
            AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) objAwait;
            C13854daT c13854daTFetchVPNInfo = abstractC12784ctX.fetchVPNInfo();
            OneKeyAccountInfo oneKeyAccountInfo = null;
            java.lang.Object obj = null;
            oneKeyAccountInfo = null;
            if (c13854daTFetchVPNInfo != null && (listDjBIcL = c13854daTFetchVPNInfo.djBIcL()) != null) {
                java.util.Iterator<T> it = listDjBIcL.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (((OneKeyAccountInfo) next).getAddressIndex() == i) {
                        obj = next;
                        break;
                    }
                }
                oneKeyAccountInfo = (OneKeyAccountInfo) obj;
            }
            C13854daT c13854daTFetchVPNInfo2 = abstractC12784ctX.fetchVPNInfo();
            if (c13854daTFetchVPNInfo2 == null || (strAYXKKw = c13854daTFetchVPNInfo2.AYXKKw()) == null) {
                throw new OneKeyException("OneKey connectId not found");
            }
            if (oneKeyAccountInfo == null || (evmAddresses = oneKeyAccountInfo.getEvmAddresses()) == null || (oneKeyAddress = (OneKeyAddress) CollectionsKt___CollectionsKt.firstOrNull(evmAddresses)) == null || (address = oneKeyAddress.getAddress()) == null) {
                throw new OneKeyException("EVM address not found");
            }
            return new C15448eIs(strAYXKKw, address);
        } catch (EmptyResultException e) {
            pUU.AEQbTJ("GetRootWalletEvmAddressUseCase", "getEvmAddressForIndex: rootWallet not found", e);
            throw new OneKeyException("Root Wallet with rootWalletId: " + str + " not found");
        }
    }
}
