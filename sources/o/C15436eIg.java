package o;

import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.model.wallet.OneKeyAccountInfo;
import com.okinc.business.defi.biz.model.wallet.OneKeyAddress;
import com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.GetOneKeyWalletsEvmAddressesUseCase$getEvmAddressesForIndex$1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.rx2.RxAwaitKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eIg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15436eIg {
    public final C12827cuN copydefault;

    @yCM
    public C15436eIg(@NotNull C12827cuN c12827cuN) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        this.copydefault = c12827cuN;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull final java.lang.String str, final int i, @NotNull Continuation<? super Sequence<java.lang.String>> continuation) throws java.lang.Throwable {
        GetOneKeyWalletsEvmAddressesUseCase$getEvmAddressesForIndex$1 getOneKeyWalletsEvmAddressesUseCase$getEvmAddressesForIndex$1;
        if (continuation instanceof GetOneKeyWalletsEvmAddressesUseCase$getEvmAddressesForIndex$1) {
            getOneKeyWalletsEvmAddressesUseCase$getEvmAddressesForIndex$1 = (GetOneKeyWalletsEvmAddressesUseCase$getEvmAddressesForIndex$1) continuation;
            int i2 = getOneKeyWalletsEvmAddressesUseCase$getEvmAddressesForIndex$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getOneKeyWalletsEvmAddressesUseCase$getEvmAddressesForIndex$1.label = i2 - Integer.MIN_VALUE;
            } else {
                getOneKeyWalletsEvmAddressesUseCase$getEvmAddressesForIndex$1 = new GetOneKeyWalletsEvmAddressesUseCase$getEvmAddressesForIndex$1(this, continuation);
            }
        }
        java.lang.Object objAwait = getOneKeyWalletsEvmAddressesUseCase$getEvmAddressesForIndex$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = getOneKeyWalletsEvmAddressesUseCase$getEvmAddressesForIndex$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objAwait);
            AbstractC58260yxt<java.util.List<AbstractC12784ctX>> abstractC58260yxtKWHzl = this.copydefault.KWHzl(WalletType.HardwareWallet);
            getOneKeyWalletsEvmAddressesUseCase$getEvmAddressesForIndex$1.L$0 = str;
            getOneKeyWalletsEvmAddressesUseCase$getEvmAddressesForIndex$1.I$0 = i;
            getOneKeyWalletsEvmAddressesUseCase$getEvmAddressesForIndex$1.label = 1;
            objAwait = RxAwaitKt.await(abstractC58260yxtKWHzl, getOneKeyWalletsEvmAddressesUseCase$getEvmAddressesForIndex$1);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = getOneKeyWalletsEvmAddressesUseCase$getEvmAddressesForIndex$1.I$0;
            str = (java.lang.String) getOneKeyWalletsEvmAddressesUseCase$getEvmAddressesForIndex$1.L$0;
            C56391yDq.AEQbTJ(objAwait);
        }
        Intrinsics.checkNotNullExpressionValue(objAwait, "");
        return C59467zhb.fetchVPNInfo(C59467zhb.AkhnZx(C59467zhb.DbNXlk(C59467zhb.AkhnZx(C59467zhb.DbNXlk(CollectionsKt___CollectionsKt.QVAiDq((java.lang.Iterable) objAwait), new Function1() { // from class: o.eIj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C15436eIg.AEQbTJ(str, (AbstractC12784ctX) obj));
            }
        }), new Function1() { // from class: o.eIk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15436eIg.copydefault((AbstractC12784ctX) obj);
            }
        }), new Function1() { // from class: o.eIl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C15436eIg.EZpvd(i, (OneKeyAccountInfo) obj));
            }
        }), new Function1() { // from class: o.eIm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15436eIg.KWHzl((OneKeyAccountInfo) obj);
            }
        }), new Function1() { // from class: o.eIo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15436eIg.copydefault((OneKeyAddress) obj);
            }
        });
    }

    public static final boolean AEQbTJ(java.lang.String str, AbstractC12784ctX abstractC12784ctX) {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        if (abstractC12784ctX.zsXlph()) {
            C13854daT c13854daTFetchVPNInfo = abstractC12784ctX.fetchVPNInfo();
            if (Intrinsics.EZpvd((java.lang.Object) (c13854daTFetchVPNInfo != null ? c13854daTFetchVPNInfo.AYXKKw() : null), (java.lang.Object) str)) {
                return true;
            }
        }
        return false;
    }

    public static final java.lang.Iterable copydefault(AbstractC12784ctX abstractC12784ctX) {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        C13854daT c13854daTFetchVPNInfo = abstractC12784ctX.fetchVPNInfo();
        java.util.List<OneKeyAccountInfo> listDjBIcL = c13854daTFetchVPNInfo != null ? c13854daTFetchVPNInfo.djBIcL() : null;
        return listDjBIcL == null ? yDY.AhwBna() : listDjBIcL;
    }

    public static final boolean EZpvd(int i, OneKeyAccountInfo oneKeyAccountInfo) {
        Intrinsics.checkNotNullParameter(oneKeyAccountInfo, "");
        return oneKeyAccountInfo.getAddressIndex() == i;
    }

    public static final java.lang.Iterable KWHzl(OneKeyAccountInfo oneKeyAccountInfo) {
        Intrinsics.checkNotNullParameter(oneKeyAccountInfo, "");
        return oneKeyAccountInfo.getEvmAddresses();
    }

    public static final java.lang.String copydefault(OneKeyAddress oneKeyAddress) {
        Intrinsics.checkNotNullParameter(oneKeyAddress, "");
        return oneKeyAddress.getAddress();
    }
}
