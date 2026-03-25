package o;

import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressSegWitEntity;
import com.okinc.business.defi.biz.database.wallet.entity.EOSInfoEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import com.okinc.business.defi.biz.database.wallet.repository.AddressRepository$checkAddressExist$2;
import com.okinc.business.defi.biz.database.wallet.repository.AddressRepository$deleteSegwitAddressListSuspend$2;
import com.okinc.business.defi.biz.database.wallet.repository.AddressRepository$getChainIdWithAddressList$2;
import com.okinc.business.defi.biz.database.wallet.repository.AddressRepository$getEosInfoSuspend$2;
import com.okinc.business.defi.biz.database.wallet.repository.AddressRepository$getSegwitAddressListSuspend$2;
import com.okinc.business.defi.biz.database.wallet.repository.AddressRepository$getWalletAddressMapSuspend$2;
import com.okinc.business.defi.biz.database.wallet.repository.AddressRepository$getWalletAddressSuspend$2;
import com.okinc.business.defi.biz.database.wallet.repository.AddressRepository$insertOrReplaceWalletAddressSuspend$2;
import com.okinc.business.defi.biz.database.wallet.repository.AddressRepository$updateEosInfosSuspend$2;
import com.okinc.business.defi.biz.model.ChainAddress;
import java.util.concurrent.Callable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cOG {
    public final InterfaceC11289cIs OLrzqt;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cOG.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ cOG getInstance$default(Application application, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return application.KWHzl(context);
        }

        public final cOG KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).EZpvd();
        }
    }

    public cOG(@NotNull InterfaceC11289cIs interfaceC11289cIs) {
        Intrinsics.checkNotNullParameter(interfaceC11289cIs, "");
        this.OLrzqt = interfaceC11289cIs;
    }

    public final AbstractC58260yxt<java.lang.Long> KWHzl(@NotNull final java.lang.String str, final long j, @NotNull final java.lang.String str2, final int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cOJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cOG.KWHzl(this.AEQbTJ, str, j, i);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        AbstractC58260yxt abstractC58260yxtValueOf = C11607cUn.valueOf(abstractC58260yxtCopydefault);
        final Function1 function1 = new Function1() { // from class: o.cOM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cOG.AEQbTJ(this.EZpvd, str, j, str2, i, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<java.lang.Long> abstractC58260yxtOLrzqt = abstractC58260yxtValueOf.OLrzqt(new InterfaceC58229yxO() { // from class: o.cOP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cOG.OLrzqt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final java.util.List KWHzl(cOG cog, java.lang.String str, long j, int i) {
        return cog.OLrzqt.AEQbTJ(str, j, i);
    }

    public static final InterfaceC58261yxu OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(final cOG cog, final java.lang.String str, final long j, final java.lang.String str2, final int i, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        final ChainAddressSegWitEntity chainAddressSegWitEntity = (ChainAddressSegWitEntity) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (chainAddressSegWitEntity != null) {
            AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cOH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return cOG.KWHzl(this.KWHzl, str, j, str2, i, chainAddressSegWitEntity);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
            AbstractC58260yxt abstractC58260yxtValueOf = C11607cUn.valueOf(abstractC58260yxtCopydefault);
            if (abstractC58260yxtValueOf != null) {
                return abstractC58260yxtValueOf;
            }
        }
        return AbstractC58260yxt.copydefault(0L);
    }

    public static final java.lang.Long KWHzl(cOG cog, java.lang.String str, long j, java.lang.String str2, int i, ChainAddressSegWitEntity chainAddressSegWitEntity) {
        return java.lang.Long.valueOf(cog.OLrzqt.EZpvd(new ChainAddressEntity(str, j, str2, i, chainAddressSegWitEntity.getPublicKey(), chainAddressSegWitEntity.getDerivePath(), null, null, 192, null)));
    }

    public final AbstractC58260yxt<java.util.List<java.lang.Long>> KWHzl(@NotNull final java.lang.String str, @NotNull final ChainAddress chainAddress, @NotNull final ChainAddress chainAddress2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(chainAddress, "");
        Intrinsics.checkNotNullParameter(chainAddress2, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cOL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cOG.EZpvd(this.AEQbTJ, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        AbstractC58260yxt abstractC58260yxtValueOf = C11607cUn.valueOf(abstractC58260yxtCopydefault);
        final Function1 function1 = new Function1() { // from class: o.cOO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cOG.KWHzl(chainAddress, chainAddress2, this, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<java.util.List<java.lang.Long>> abstractC58260yxtOLrzqt = abstractC58260yxtValueOf.OLrzqt(new InterfaceC58229yxO() { // from class: o.cOK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cOG.AEQbTJ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final java.util.List EZpvd(cOG cog, java.lang.String str) {
        return cog.OLrzqt.OLrzqt(str);
    }

    public static final InterfaceC58261yxu AEQbTJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final java.util.List copydefault(cOG cog, java.util.List list) {
        InterfaceC11289cIs interfaceC11289cIs = cog.OLrzqt;
        Intrinsics.copydefault(list);
        return interfaceC11289cIs.AEQbTJ(list);
    }

    public final java.lang.Object copydefault(@NotNull java.util.List<EOSInfoEntity> list, @NotNull java.util.List<ChainAddressEntity> list2, @NotNull Continuation<? super java.lang.Long> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AddressRepository$updateEosInfosSuspend$2(this, list, list2, null), continuation);
    }

    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AddressRepository$checkAddressExist$2(this, str, null), continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull java.util.List<java.lang.Long> list, @NotNull Continuation<? super java.util.List<cII>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AddressRepository$getChainIdWithAddressList$2(this, list, null), continuation);
    }

    public final AbstractC58260yxt<java.util.List<WalletEntity>> OLrzqt(final long j, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cOT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cOG.OLrzqt(this.OLrzqt, j, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List OLrzqt(cOG cog, long j, java.lang.String str) {
        return cog.OLrzqt.copydefault(j, str);
    }

    public final java.lang.Object AEQbTJ(@NotNull java.util.List<ChainAddressEntity> list, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AddressRepository$insertOrReplaceWalletAddressSuspend$2(this, list, null), continuation);
    }

    public final java.lang.Object AEQbTJ(@NotNull java.util.List<java.lang.String> list, @NotNull java.util.List<java.lang.Long> list2, @NotNull Continuation<? super java.util.Map<java.lang.String, ? extends java.util.List<ChainAddressEntity>>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AddressRepository$getWalletAddressMapSuspend$2(this, list, list2, null), continuation);
    }

    public final java.lang.Object KWHzl(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.Map<java.lang.String, ? extends java.util.List<EOSInfoEntity>>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AddressRepository$getEosInfoSuspend$2(this, list, null), continuation);
    }

    public final java.lang.Object copydefault(@NotNull java.util.List<java.lang.String> list, @NotNull java.util.List<java.lang.Long> list2, @NotNull java.util.List<java.lang.Integer> list3, @NotNull Continuation<? super java.util.Map<java.lang.String, ? extends java.util.List<ChainAddressSegWitEntity>>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AddressRepository$getSegwitAddressListSuspend$2(this, list, list2, list3, null), continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, long j, @NotNull Continuation<? super java.util.List<ChainAddressEntity>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AddressRepository$getWalletAddressSuspend$2(this, str, j, null), continuation);
    }

    public final java.lang.Object EZpvd(@NotNull java.util.List<ChainAddressSegWitEntity> list, @NotNull Continuation<? super java.lang.Integer> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AddressRepository$deleteSegwitAddressListSuspend$2(this, list, null), continuation);
    }

    public static final InterfaceC58261yxu KWHzl(ChainAddress chainAddress, ChainAddress chainAddress2, final cOG cog, final java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ChainAddressEntity chainAddressEntity = (ChainAddressEntity) it.next();
            if (Intrinsics.EZpvd((java.lang.Object) chainAddressEntity.getAddress(), (java.lang.Object) chainAddress.getAddress())) {
                chainAddressEntity.setAddress(chainAddress2.getAddress());
                chainAddressEntity.setAddressType(chainAddress2.getAddressType());
                chainAddressEntity.setPublicKey(chainAddress2.getPublicKey());
                chainAddressEntity.setDerivePath(chainAddress2.getDerivePath());
                chainAddressEntity.setProxyAddress(chainAddress2.getProxyAddres());
                chainAddressEntity.setEoaAddress(chainAddress2.getEoaAddress());
            }
        }
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cOS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cOG.copydefault(this.EZpvd, list);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }
}
