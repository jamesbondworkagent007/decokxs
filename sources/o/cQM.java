package o;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.api.bean.NftPrice;
import com.okinc.business.defi.api.bean.OKWalletHiddenSmallAssetTokenModel;
import com.okinc.business.defi.biz.constant.EOSState;
import com.okinc.business.defi.biz.constant.HardwareType;
import com.okinc.business.defi.biz.constant.WalletSyncOperation;
import com.okinc.business.defi.biz.constant.WalletSyncStatus;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.common.WalletSelectedChainBean;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.error.EmptyMpcInfoException;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.core.mpc.MpcShare2Status;
import com.okinc.business.defi.biz.core.nostrfix.IdentifierType;
import com.okinc.business.defi.biz.core.nostrfix.IdentifierTypeNostrFixStatus;
import com.okinc.business.defi.biz.database.wallet.bean.WalletViewForWalletManagement;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressSegWitEntity;
import com.okinc.business.defi.biz.database.wallet.entity.EOSInfoEntity;
import com.okinc.business.defi.biz.database.wallet.entity.HardwareInfoEntity;
import com.okinc.business.defi.biz.database.wallet.entity.MPCWalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.RootWalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletDefiEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletNftEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletRepairEntity;
import com.okinc.business.defi.biz.database.wallet.repository.WalletRepository$addChainAddresses$1;
import com.okinc.business.defi.biz.database.wallet.repository.WalletRepository$fetchAllWalletIdList$2;
import com.okinc.business.defi.biz.database.wallet.repository.WalletRepository$getAllWallets$1;
import com.okinc.business.defi.biz.database.wallet.repository.WalletRepository$getAllWalletsSuspend$2;
import com.okinc.business.defi.biz.database.wallet.repository.WalletRepository$getMpcInfoByRootWalletIdsSuspend$2;
import com.okinc.business.defi.biz.database.wallet.repository.WalletRepository$getRootWalletsByIdsSuspend$2;
import com.okinc.business.defi.biz.database.wallet.repository.WalletRepository$getWalletByTypeSuspend$2;
import com.okinc.business.defi.biz.database.wallet.repository.WalletRepository$getWalletChainIdAllAddressByWalletIdsSuspend$2;
import com.okinc.business.defi.biz.database.wallet.repository.WalletRepository$getWalletNotSyncSuspend$2;
import com.okinc.business.defi.biz.database.wallet.repository.WalletRepository$queryChainAddressesByWalletIdsSuspend$2;
import com.okinc.business.defi.biz.database.wallet.repository.WalletRepository$updateAllWalletsSuspend$2;
import com.okinc.business.defi.biz.database.wallet.repository.WalletRepository$updateWalletsAndDeleteCreateData$2;
import com.okinc.business.defi.biz.database.wallet.repository.WalletRepository$updateWalletsAndDeleteSyncData$2;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import com.okinc.business.defi.biz.net.bean.AAStatus;
import com.okinc.business.defi.biz.net.bean.AddressVerifyStatus;
import com.okinc.business.defi.biz.net.bean.NftBean;
import com.okinc.business.defi.biz.net.bean.Portfolio;
import com.okinc.business.defi.biz.net.bean.SingleTeeStatus;
import com.okinc.business.defi.biz.net.bean.SingleTeeStatusAndWarringInfo;
import com.okinc.business.defi.biz.net.bean.SyncWalletReqNew;
import com.okinc.business.defi.biz.net.bean.TeeStatus;
import com.okinc.wallet.api.bean.AddressType;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.rx2.RxSingleKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C10407bnq;
import o.C10525bqB;
import o.C10614brl;
import o.InterfaceC13426dKx;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes4.dex */
public final class cQM {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final InterfaceC11384cMf copydefault;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WalletSyncOperation.values().length];
            try {
                iArr[WalletSyncOperation.Rename.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[WalletSyncOperation.UpdateDefaultAddress.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletSyncOperation.UpgradeAddress.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    public static final class StateListAnimator extends TypeToken<java.util.List<? extends java.lang.String>> {
    }

    public static final class TaskDescription extends TypeToken<java.util.List<? extends java.lang.String>> {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.util.ArrayList OLrzqt(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        Intrinsics.checkNotNullParameter(arrayList2, "");
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.util.ArrayList copydefault(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        Intrinsics.checkNotNullParameter(arrayList2, "");
        return arrayList;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cQM.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ cQM getInstance$default(Application application, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return application.OLrzqt(context);
        }

        public final cQM OLrzqt(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).QKVWgx();
        }
    }

    public cQM(@NotNull InterfaceC11384cMf interfaceC11384cMf) {
        Intrinsics.checkNotNullParameter(interfaceC11384cMf, "");
        this.copydefault = interfaceC11384cMf;
    }

    public final AbstractC58260yxt<java.lang.Boolean> AEQbTJ() {
        return C11607cUn.valueOf(KWHzl());
    }

    public static final class Activity<T> implements java.util.Comparator {
        public final /* synthetic */ java.util.Map AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(java.util.Map map) {
            this.AEQbTJ = map;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.Integer num = (java.lang.Integer) this.AEQbTJ.get(java.lang.Long.valueOf(((ChainAddress) t).getCoinId()));
            int iIntValue = num != null ? num.intValue() : -1;
            java.lang.Integer num2 = (java.lang.Integer) this.AEQbTJ.get(java.lang.Long.valueOf(((ChainAddress) t2).getCoinId()));
            return yET.KWHzl(java.lang.Integer.valueOf(iIntValue), java.lang.Integer.valueOf(num2 != null ? num2.intValue() : -1));
        }
    }

    public static final class FragmentManager<T> implements java.util.Comparator {
        public final /* synthetic */ java.util.Map AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(java.util.Map map) {
            this.AEQbTJ = map;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.Integer num = (java.lang.Integer) this.AEQbTJ.get(java.lang.Long.valueOf(((ChainAddress) t).getCoinId()));
            int iIntValue = num != null ? num.intValue() : -1;
            java.lang.Integer num2 = (java.lang.Integer) this.AEQbTJ.get(java.lang.Long.valueOf(((ChainAddress) t2).getCoinId()));
            return yET.KWHzl(java.lang.Integer.valueOf(iIntValue), java.lang.Integer.valueOf(num2 != null ? num2.intValue() : -1));
        }
    }

    public static final class LoaderManager<T> implements java.util.Comparator {
        public final /* synthetic */ java.util.Map AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(java.util.Map map) {
            this.AEQbTJ = map;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.Integer num = (java.lang.Integer) this.AEQbTJ.get(java.lang.Long.valueOf(((ChainAddress) t).getCoinId()));
            int iIntValue = num != null ? num.intValue() : -1;
            java.lang.Integer num2 = (java.lang.Integer) this.AEQbTJ.get(java.lang.Long.valueOf(((ChainAddress) t2).getCoinId()));
            return yET.KWHzl(java.lang.Integer.valueOf(iIntValue), java.lang.Integer.valueOf(num2 != null ? num2.intValue() : -1));
        }
    }

    public static final class PendingIntent<T> implements java.util.Comparator {
        public final /* synthetic */ java.util.Map KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(java.util.Map map) {
            this.KWHzl = map;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.Integer num = (java.lang.Integer) this.KWHzl.get(java.lang.Long.valueOf(((ChainAddress) t).getCoinId()));
            int iIntValue = num != null ? num.intValue() : -1;
            java.lang.Integer num2 = (java.lang.Integer) this.KWHzl.get(java.lang.Long.valueOf(((ChainAddress) t2).getCoinId()));
            return yET.KWHzl(java.lang.Integer.valueOf(iIntValue), java.lang.Integer.valueOf(num2 != null ? num2.intValue() : -1));
        }
    }

    public final AbstractC58260yxt<java.lang.Boolean> KWHzl() {
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.isConnected(this.KWHzl);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.cRe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cQM.copydefault((java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtCopydefault2 = abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.cRf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cQM.AuCTel(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault2, "");
        return abstractC58260yxtCopydefault2;
    }

    public static final java.lang.Integer isConnected(cQM cqm) {
        return java.lang.Integer.valueOf(cqm.copydefault.djBIcL());
    }

    public static final java.lang.Boolean AuCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean copydefault(java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return java.lang.Boolean.valueOf(num.intValue() > 0);
    }

    public final AbstractC58260yxt<WalletEntity> AkhnZx(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.getNewProxyInstance(this.copydefault, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final WalletEntity getNewProxyInstance(cQM cqm, java.lang.String str) {
        return cqm.copydefault.gEmmrt(str);
    }

    public final AbstractC58260yxt<java.util.List<WalletEntity>> fetchVPNInfo(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.hDKMBd(this.KWHzl, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List hDKMBd(cQM cqm, java.lang.String str) {
        return cqm.copydefault.AYXKKw(str);
    }

    public final AbstractC58260yxt<java.util.List<WalletEntity>> copydefault(@NotNull final java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.fJNWhG(this.KWHzl, list);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List fJNWhG(cQM cqm, java.util.List list) {
        return cqm.copydefault.OLrzqt((java.util.List<java.lang.String>) list);
    }

    public final AbstractC58260yxt<AbstractC12782ctV> EZpvd(final boolean z) {
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cSx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.wlaJM(this.AEQbTJ);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.cSu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cQM.copydefault(this.OLrzqt, z, (C11571cTe) obj);
            }
        };
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.cSt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cQM.hDKMBd(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final C11571cTe wlaJM(cQM cqm) {
        return cqm.copydefault.AYXKKw();
    }

    public static final InterfaceC58261yxu hDKMBd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(cQM cqm, boolean z, C11571cTe c11571cTe) {
        Intrinsics.checkNotNullParameter(c11571cTe, "");
        return cqm.EZpvd(c11571cTe, z);
    }

    public final AbstractC58260yxt<AbstractC12782ctV> AEQbTJ(@NotNull final java.lang.String str, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.getFieldNames(this.copydefault, str);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.cRs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cQM.EZpvd(this.AEQbTJ, z, (C11571cTe) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.cRE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cQM.AubY(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return C11607cUn.valueOf(abstractC58260yxtOLrzqt);
    }

    public static final C11571cTe getFieldNames(cQM cqm, java.lang.String str) {
        return cqm.copydefault.djBIcL(str);
    }

    public static final InterfaceC58261yxu AubY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(cQM cqm, boolean z, C11571cTe c11571cTe) {
        Intrinsics.checkNotNullParameter(c11571cTe, "");
        return cqm.EZpvd(c11571cTe, z);
    }

    public final AbstractC58260yxt<AbstractC12782ctV> KWHzl(@NotNull final java.lang.String str, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cSy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.iwGUEr(this.OLrzqt, str);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.cSz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cQM.valueOf(this.OLrzqt, z, (C11571cTe) obj);
            }
        };
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.cSA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cQM.wlaJM(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final C11571cTe iwGUEr(cQM cqm, java.lang.String str) {
        return cqm.copydefault.djBIcL(str);
    }

    public static final InterfaceC58261yxu wlaJM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu valueOf(cQM cqm, boolean z, C11571cTe c11571cTe) {
        Intrinsics.checkNotNullParameter(c11571cTe, "");
        return cqm.EZpvd(c11571cTe, z);
    }

    public final AbstractC58260yxt<AbstractC12782ctV> EZpvd(final C11571cTe c11571cTe, boolean z) {
        AbstractC58260yxt abstractC58260yxtCopydefault;
        AbstractC58260yxt abstractC58260yxtCopydefault2 = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.EZpvd(this.copydefault, c11571cTe);
            }
        });
        if (z) {
            abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return cQM.OLrzqt(this.EZpvd, c11571cTe);
                }
            });
        } else {
            abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(C56402yEa.EZpvd(c11571cTe));
        }
        final Function2 function2 = new Function2() { // from class: o.cRV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return cQM.copydefault(this.copydefault, c11571cTe, (java.util.List) obj, (java.util.List) obj2);
            }
        };
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(abstractC58260yxtCopydefault2, abstractC58260yxtCopydefault, new InterfaceC58223yxI() { // from class: o.cSa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return cQM.EZpvd(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final java.util.List EZpvd(cQM cqm, C11571cTe c11571cTe) {
        return cqm.copydefault.KWHzl(c11571cTe.AxsJAYsNCnLh());
    }

    public static final java.util.List OLrzqt(cQM cqm, C11571cTe c11571cTe) {
        return cqm.copydefault.valueOf(c11571cTe.AxsJAYsNCnLh());
    }

    public static final AbstractC12782ctV EZpvd(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (AbstractC12782ctV) function2.invoke(obj, obj2);
    }

    public static final AbstractC12782ctV copydefault(cQM cqm, C11571cTe c11571cTe, java.util.List list, java.util.List list2) throws WalletImportError {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        cSX csx = (cSX) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (csx != null) {
            AbstractC12784ctX abstractC12784ctXKWHzl = cqm.KWHzl(csx);
            abstractC12784ctXKWHzl.OLrzqt(cqm.KWHzl((java.util.List<C11571cTe>) list2, abstractC12784ctXKWHzl));
            AbstractC12782ctV abstractC12782ctV = null;
            for (AbstractC12782ctV abstractC12782ctV2 : abstractC12784ctXKWHzl.KWHzl()) {
                abstractC12782ctV2.copydefault(abstractC12784ctXKWHzl);
                if (Intrinsics.EZpvd((java.lang.Object) abstractC12782ctV2.DbNXlk(), (java.lang.Object) c11571cTe.fFgQHt())) {
                    abstractC12782ctV = abstractC12782ctV2;
                }
            }
            Intrinsics.copydefault(abstractC12782ctV);
            return abstractC12782ctV;
        }
        throw WalletImportError.Companion.OLrzqt("no rootwallet", 1);
    }

    public final AbstractC58260yxt<java.lang.Integer> fARcdN(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.zsXlph(this.KWHzl, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Integer zsXlph(cQM cqm, java.lang.String str) {
        return java.lang.Integer.valueOf(cqm.copydefault.fARcdN(str));
    }

    public final AbstractC58260yxt<java.util.List<AbstractC12782ctV>> valueOf() {
        return RxSingleKt.rxSingle$default(null, new WalletRepository$getAllWallets$1(this, null), 1, null);
    }

    public final AbstractC58260yxt<java.util.List<WalletEntity>> AhwBna() {
        AbstractC58260yxt<java.util.List<WalletEntity>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.uzCIH(this.copydefault);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List uzCIH(cQM cqm) {
        return cqm.copydefault.KWHzl();
    }

    public final AbstractC58260yxt<java.util.List<AbstractC12782ctV>> copydefault(final int i, final int i2) {
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.KWHzl(this.OLrzqt, i, i2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List KWHzl(cQM cqm, int i, int i2) {
        java.util.List<C11571cTe> listEZpvd = cqm.copydefault.EZpvd(i, i2);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        java.util.Iterator<T> it = listEZpvd.iterator();
        while (it.hasNext()) {
            arrayList.add(cqm.EZpvd((C11571cTe) it.next(), (AbstractC12784ctX) null));
        }
        return arrayList;
    }

    public final AbstractC58260yxt<java.util.List<AbstractC12782ctV>> fetchVPNInfo() {
        AbstractC58260yxt<java.util.List<AbstractC12782ctV>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.iwGUEr(this.EZpvd);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List iwGUEr(cQM cqm) {
        java.util.List<C11571cTe> listCopydefault = cqm.copydefault.copydefault();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        java.util.Iterator<T> it = listCopydefault.iterator();
        while (it.hasNext()) {
            arrayList.add(cqm.EZpvd((C11571cTe) it.next(), (AbstractC12784ctX) null));
        }
        return arrayList;
    }

    public final AbstractC58260yxt<java.util.List<MpcWalletEncodeInfo>> OLrzqt() {
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cSp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.fARcdN(this.AEQbTJ);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List fARcdN(cQM cqm) {
        java.util.List<MPCWalletEntity> listOLrzqt = cqm.copydefault.OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        java.util.Iterator<T> it = listOLrzqt.iterator();
        while (it.hasNext()) {
            arrayList.add(cqm.copydefault((MPCWalletEntity) it.next()));
        }
        return arrayList;
    }

    public final AbstractC58260yxt<java.lang.Integer> AkhnZx() {
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.AubY(this.copydefault);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.lang.Integer AubY(cQM cqm) {
        return java.lang.Integer.valueOf(cqm.copydefault.djBIcL());
    }

    public final AbstractC58260yxt<java.lang.Integer> isConnected() {
        return C11607cUn.valueOf(AkhnZx());
    }

    public final AbstractC58260yxt<java.lang.Boolean> values() {
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.zLjUOn(this.copydefault);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Boolean zLjUOn(cQM cqm) {
        return java.lang.Boolean.valueOf(cqm.copydefault.DbNXlk());
    }

    public final AbstractC58260yxt<java.lang.Integer> DbNXlk() {
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.zsXlph(this.OLrzqt);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Integer zsXlph(cQM cqm) {
        return java.lang.Integer.valueOf(cqm.copydefault.AkhnZx());
    }

    public static /* synthetic */ AbstractC58260yxt getMaxWalletIndex$default(cQM cqm, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = WalletType.HDWallet.ordinal();
        }
        return cqm.AEQbTJ(str, i);
    }

    public final AbstractC58260yxt<java.lang.Integer> AEQbTJ(@NotNull final java.lang.String str, final int i) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.OLrzqt(this.KWHzl, str, i);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Integer OLrzqt(cQM cqm, java.lang.String str, int i) {
        return java.lang.Integer.valueOf(cqm.copydefault.OLrzqt(str, i));
    }

    public static /* synthetic */ java.lang.Object getMaxWalletIndexSuspend$default(cQM cqm, java.lang.String str, int i, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = WalletType.HDWallet.ordinal();
        }
        return cqm.copydefault(str, i, (Continuation<? super java.lang.Integer>) continuation);
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, int i, @NotNull Continuation<? super java.lang.Integer> continuation) {
        return this.copydefault.AEQbTJ(str, i, continuation);
    }

    public final AbstractC58260yxt<java.lang.Integer> AhwBna(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.fIwbmz(this.EZpvd, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Integer fIwbmz(cQM cqm, java.lang.String str) {
        return java.lang.Integer.valueOf(cqm.copydefault.copydefault(str));
    }

    public final java.lang.Object KWHzl(@NotNull Continuation<? super java.util.List<? extends AbstractC12782ctV>> continuation) {
        return BuildersKt.withContext(Dispatchers.getDefault(), new WalletRepository$getAllWalletsSuspend$2(this, null), continuation);
    }

    public final AbstractC58260yxt<Unit> OLrzqt(@NotNull final AbstractC12782ctV abstractC12782ctV, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.EZpvd(abstractC12782ctV, this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final Unit EZpvd(AbstractC12782ctV abstractC12782ctV, cQM cqm) {
        if (abstractC12782ctV.valueOf().isEmpty()) {
            return Unit.INSTANCE;
        }
        java.util.List<ChainAddress> listValueOf = abstractC12782ctV.valueOf();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listValueOf, 10));
        for (ChainAddress chainAddress : listValueOf) {
            arrayList.add(new ChainAddressEntity(abstractC12782ctV.DbNXlk(), chainAddress.getCoinId(), chainAddress.getAddress(), chainAddress.getAddressType(), chainAddress.getPublicKey(), chainAddress.getDerivePath(), chainAddress.getProxyAddres(), chainAddress.getEoaAddress()));
        }
        cqm.copydefault.OLrzqt(abstractC12782ctV.DbNXlk(), arrayList);
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<java.util.List<java.lang.Long>> EZpvd(@NotNull final AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.copydefault(abstractC12782ctV, this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List copydefault(AbstractC12782ctV abstractC12782ctV, cQM cqm) {
        java.util.ArrayList<ChainAddress> arrayListGGvvIC = abstractC12782ctV.gGvvIC();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListGGvvIC, 10));
        for (ChainAddress chainAddress : arrayListGGvvIC) {
            arrayList.add(new ChainAddressSegWitEntity(abstractC12782ctV.DbNXlk(), chainAddress.getCoinId(), chainAddress.getAddressType(), chainAddress.getAddress(), chainAddress.getPublicKey(), chainAddress.getDerivePath()));
        }
        return cqm.copydefault.EZpvd(abstractC12782ctV.DbNXlk(), arrayList);
    }

    public final AbstractC58260yxt<java.lang.Integer> KWHzl(@NotNull final java.lang.String str, final long j) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cSf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.EZpvd(this.AEQbTJ, str, j);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Integer EZpvd(cQM cqm, java.lang.String str, long j) {
        return java.lang.Integer.valueOf(cqm.copydefault.AEQbTJ(str, j));
    }

    public final AbstractC58260yxt<java.util.List<ChainAddressSegWitEntity>> AEQbTJ(@NotNull final java.lang.String str, final long j) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cSn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.copydefault(this.copydefault, str, j);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List copydefault(cQM cqm, java.lang.String str, long j) {
        return cqm.copydefault.KWHzl(str, j);
    }

    public final AbstractC58260yxt<java.lang.Long> copydefault(@NotNull final java.lang.String str, @NotNull final EOSInfoEntity eOSInfoEntity) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(eOSInfoEntity, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cSD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.EZpvd(this.AEQbTJ, str, eOSInfoEntity);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Long EZpvd(cQM cqm, java.lang.String str, EOSInfoEntity eOSInfoEntity) {
        return java.lang.Long.valueOf(cqm.copydefault.OLrzqt(str, eOSInfoEntity));
    }

    public final java.util.List<EOSInfoEntity> gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.copydefault.AEQbTJ(str);
    }

    public final AbstractC58260yxt<java.lang.Integer> AEQbTJ(@NotNull final AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cSw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.copydefault(this.KWHzl, abstractC12782ctV);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Integer copydefault(cQM cqm, AbstractC12782ctV abstractC12782ctV) {
        return java.lang.Integer.valueOf(cqm.copydefault.EZpvd(convertToWalletEntity$default(cqm, abstractC12782ctV, null, 2, null)));
    }

    public final AbstractC58260yxt<java.lang.Integer> KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cSq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.AYXKKw(this.EZpvd, str, str2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Integer AYXKKw(cQM cqm, java.lang.String str, java.lang.String str2) {
        return java.lang.Integer.valueOf(cqm.copydefault.KWHzl(str, str2, C11600cUg.OLrzqt(true)));
    }

    public final AbstractC58260yxt<java.lang.Integer> KWHzl(@NotNull final java.lang.String str, @NotNull final AAStatus aAStatus) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aAStatus, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.copydefault(this.EZpvd, str, aAStatus);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Integer copydefault(cQM cqm, java.lang.String str, AAStatus aAStatus) {
        return java.lang.Integer.valueOf(cqm.copydefault.AEQbTJ(str, aAStatus.ordinal()));
    }

    public final AbstractC58260yxt<java.lang.Integer> djBIcL(@NotNull final java.util.List<WalletRepairEntity> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.hDKMBd(this.AEQbTJ, list);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Integer hDKMBd(cQM cqm, java.util.List list) {
        return java.lang.Integer.valueOf(cqm.copydefault.AkhnZx((java.util.List<WalletRepairEntity>) list));
    }

    public final AbstractC58260yxt<java.util.List<WalletRepairEntity>> EZpvd(final int i, final int i2) {
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.AEQbTJ(this.EZpvd, i, i2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List AEQbTJ(cQM cqm, int i, int i2) {
        return cqm.copydefault.KWHzl(i, i2);
    }

    public final AbstractC58260yxt<java.lang.Integer> AYXKKw(@NotNull final java.util.List<? extends AbstractC12782ctV> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.getFieldNames(this.KWHzl, list);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Integer getFieldNames(cQM cqm, java.util.List list) {
        InterfaceC11384cMf interfaceC11384cMf = cqm.copydefault;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(convertToWalletEntity$default(cqm, (AbstractC12782ctV) it.next(), null, 2, null));
        }
        return java.lang.Integer.valueOf(interfaceC11384cMf.gEmmrt(arrayList));
    }

    public final AbstractC58260yxt<java.lang.Long> AEQbTJ(@NotNull AbstractC12784ctX abstractC12784ctX) {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        final RootWalletEntity rootWalletEntity = new RootWalletEntity(abstractC12784ctX.EZpvd(), abstractC12784ctX.AuCTel(), abstractC12784ctX.fARcdN(), abstractC12784ctX.gEmmrt(), abstractC12784ctX.AhwBna());
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.copydefault(this.KWHzl, rootWalletEntity);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Long copydefault(cQM cqm, RootWalletEntity rootWalletEntity) {
        return java.lang.Long.valueOf(cqm.copydefault.copydefault(rootWalletEntity));
    }

    public final AbstractC58260yxt<java.lang.Integer> copydefault(@NotNull AbstractC12784ctX abstractC12784ctX) {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        final RootWalletEntity rootWalletEntity = new RootWalletEntity(abstractC12784ctX.EZpvd(), abstractC12784ctX.AuCTel(), abstractC12784ctX.fARcdN(), abstractC12784ctX.gEmmrt(), abstractC12784ctX.AhwBna());
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cSr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.AEQbTJ(this.KWHzl, rootWalletEntity);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Integer AEQbTJ(cQM cqm, RootWalletEntity rootWalletEntity) {
        return java.lang.Integer.valueOf(cqm.copydefault.EZpvd(rootWalletEntity));
    }

    public final AbstractC58260yxt<kotlin.Pair<java.util.List<cSX>, java.util.List<WalletEntity>>> AYXKKw() {
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.fIwbmz(this.OLrzqt);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final kotlin.Pair fIwbmz(cQM cqm) {
        return C56390yDp.OLrzqt(cqm.copydefault.AEQbTJ(), cqm.copydefault.KWHzl());
    }

    public static final AbstractC58260yxt<java.util.List<kotlin.Pair<cSX, java.util.List<C11571cTe>>>> ejfBZ(final cQM cqm) {
        AbstractC58260yxt<java.util.List<kotlin.Pair<cSX, java.util.List<C11571cTe>>>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.AuCTel(this.EZpvd);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List AuCTel(cQM cqm) {
        java.util.List<cSX> listAEQbTJ = cqm.copydefault.AEQbTJ();
        java.util.List<C11571cTe> listAhwBna = cqm.copydefault.AhwBna();
        java.util.HashMap map = new java.util.HashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (cSX csx : listAEQbTJ) {
            map.put(csx.getNewProxyInstance(), csx);
            linkedHashMap.put(csx, new java.util.ArrayList());
        }
        for (C11571cTe c11571cTe : listAhwBna) {
            java.util.ArrayList arrayList = (java.util.ArrayList) linkedHashMap.get(map.get(c11571cTe.AxsJAYsNCnLh()));
            if (arrayList != null) {
                arrayList.add(c11571cTe);
            }
        }
        java.util.Set setEntrySet = linkedHashMap.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        java.util.Set<Map.Entry> set = setEntrySet;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(set, 10));
        for (Map.Entry entry : set) {
            Intrinsics.copydefault(entry);
            arrayList2.add(new kotlin.Pair(entry.getKey(), entry.getValue()));
        }
        return arrayList2;
    }

    public static final InterfaceC58261yxu fARcdN(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public final AbstractC58260yxt<java.util.List<AbstractC12784ctX>> EZpvd() {
        AbstractC58260yxt<java.util.List<kotlin.Pair<cSX, java.util.List<C11571cTe>>>> abstractC58260yxtEjfBZ = ejfBZ(this);
        final Function1 function1 = new Function1() { // from class: o.cSg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cQM.fetchVPNInfo(this.KWHzl, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtEjfBZ.OLrzqt(new InterfaceC58229yxO() { // from class: o.cSs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cQM.fARcdN(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cSB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cQM.AEQbTJ(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.cQO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cQM.ejfBZ(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.cQY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cQM.values(this.EZpvd, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt2.copydefault(new InterfaceC58229yxO() { // from class: o.cRa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cQM.getNewProxyInstance(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final InterfaceC58261yxu fetchVPNInfo(final cQM cqm, final java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            java.util.Collection collection = (java.util.Collection) pair.getSecond();
            if (collection == null || collection.isEmpty()) {
                arrayList.add(((cSX) pair.getFirst()).getNewProxyInstance());
            }
        }
        return AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.AEQbTJ(this.copydefault, arrayList, list);
            }
        });
    }

    public static final kotlin.Pair AEQbTJ(cQM cqm, java.util.ArrayList arrayList, java.util.List list) {
        return C56390yDp.OLrzqt(java.lang.Integer.valueOf(cqm.copydefault.djBIcL(arrayList)), list);
    }

    public static final InterfaceC58261yxu ejfBZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(cQM cqm, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Number) pair.getFirst()).intValue() != 0) {
            return ejfBZ(cqm);
        }
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(pair.getSecond());
        Intrinsics.copydefault(abstractC58260yxtCopydefault);
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List values(cQM cqm, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            AbstractC12784ctX abstractC12784ctXKWHzl = cqm.KWHzl((cSX) pair.getFirst());
            java.util.List<AbstractC12782ctV> listKWHzl = cqm.KWHzl((java.util.List<C11571cTe>) pair.getSecond(), abstractC12784ctXKWHzl);
            java.util.Iterator<T> it2 = listKWHzl.iterator();
            while (it2.hasNext()) {
                ((AbstractC12782ctV) it2.next()).copydefault(abstractC12784ctXKWHzl);
            }
            abstractC12784ctXKWHzl.OLrzqt(listKWHzl);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : listKWHzl) {
                if (!((AbstractC12782ctV) obj).zblBkD()) {
                    arrayList2.add(obj);
                }
            }
            abstractC12784ctXKWHzl.AEQbTJ(arrayList2);
            arrayList.add(abstractC12784ctXKWHzl);
        }
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
    }

    public static final AbstractC58260yxt<java.util.List<kotlin.Pair<cSX, java.util.List<WalletViewForWalletManagement>>>> getNewProxyInstance(final cQM cqm) {
        AbstractC58260yxt<java.util.List<kotlin.Pair<cSX, java.util.List<WalletViewForWalletManagement>>>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cSJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.hDKMBd(this.OLrzqt);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List hDKMBd(cQM cqm) {
        java.util.List<cSX> listAEQbTJ = cqm.copydefault.AEQbTJ();
        java.util.List<WalletViewForWalletManagement> listValueOf = cqm.copydefault.valueOf();
        java.util.HashMap map = new java.util.HashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (cSX csx : listAEQbTJ) {
            map.put(csx.getNewProxyInstance(), csx);
            linkedHashMap.put(csx, new java.util.ArrayList());
        }
        for (WalletViewForWalletManagement walletViewForWalletManagement : listValueOf) {
            java.util.ArrayList arrayList = (java.util.ArrayList) linkedHashMap.get(map.get(walletViewForWalletManagement.getRootWalletId()));
            if (arrayList != null) {
                arrayList.add(walletViewForWalletManagement);
            }
        }
        java.util.Set setEntrySet = linkedHashMap.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        java.util.Set<Map.Entry> set = setEntrySet;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(set, 10));
        for (Map.Entry entry : set) {
            Intrinsics.copydefault(entry);
            arrayList2.add(new kotlin.Pair(entry.getKey(), entry.getValue()));
        }
        return arrayList2;
    }

    public static final InterfaceC58261yxu getFieldNames(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public final AbstractC58260yxt<java.util.List<AbstractC12784ctX>> gEmmrt() {
        AbstractC58260yxt<java.util.List<kotlin.Pair<cSX, java.util.List<WalletViewForWalletManagement>>>> newProxyInstance = getNewProxyInstance(this);
        final Function1 function1 = new Function1() { // from class: o.cSe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cQM.DbNXlk(this.OLrzqt, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = newProxyInstance.OLrzqt(new InterfaceC58229yxO() { // from class: o.cSi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cQM.getFieldNames(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cSl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cQM.EZpvd(this.AEQbTJ, (kotlin.Pair) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.cSj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cQM.uzCIH(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.cSk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cQM.ejfBZ(this.OLrzqt, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt2.copydefault(new InterfaceC58229yxO() { // from class: o.cSm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cQM.iwGUEr(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final InterfaceC58261yxu DbNXlk(final cQM cqm, final java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            java.util.Collection collection = (java.util.Collection) pair.getSecond();
            if (collection == null || collection.isEmpty()) {
                arrayList.add(((cSX) pair.getFirst()).getNewProxyInstance());
            }
        }
        return AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.EZpvd(this.copydefault, arrayList, list);
            }
        });
    }

    public static final kotlin.Pair EZpvd(cQM cqm, java.util.ArrayList arrayList, java.util.List list) {
        return C56390yDp.OLrzqt(java.lang.Integer.valueOf(cqm.copydefault.djBIcL(arrayList)), list);
    }

    public static final InterfaceC58261yxu uzCIH(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(cQM cqm, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Number) pair.getFirst()).intValue() != 0) {
            return getNewProxyInstance(cqm);
        }
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(pair.getSecond());
        Intrinsics.copydefault(abstractC58260yxtCopydefault);
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List iwGUEr(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List ejfBZ(cQM cqm, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            AbstractC12784ctX abstractC12784ctXKWHzl = cqm.KWHzl((cSX) pair.getFirst());
            java.util.List<AbstractC12782ctV> listCopydefault = cqm.copydefault((java.util.List<WalletViewForWalletManagement>) pair.getSecond(), abstractC12784ctXKWHzl);
            java.util.Iterator<T> it2 = listCopydefault.iterator();
            while (it2.hasNext()) {
                ((AbstractC12782ctV) it2.next()).copydefault(abstractC12784ctXKWHzl);
            }
            abstractC12784ctXKWHzl.OLrzqt(listCopydefault);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : listCopydefault) {
                if (!((AbstractC12782ctV) obj).zblBkD()) {
                    arrayList2.add(obj);
                }
            }
            abstractC12784ctXKWHzl.AEQbTJ(arrayList2);
            arrayList.add(abstractC12784ctXKWHzl);
        }
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
    }

    public final AbstractC58260yxt<java.util.List<AbstractC12784ctX>> isConnected(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.AuCTel(this.copydefault, str);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.cRI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cQM.valueOf(this.copydefault, (kotlin.Pair) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault2 = abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.cRH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cQM.AuCTelauCTel(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault2, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault2);
    }

    public static final kotlin.Pair AuCTel(cQM cqm, java.lang.String str) {
        return C56390yDp.OLrzqt(cqm.copydefault.KWHzl(str), cqm.copydefault.valueOf(str));
    }

    public static final java.util.List AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List valueOf(cQM cqm, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        java.util.List<AbstractC12784ctX> listEZpvd = cqm.EZpvd((java.util.List<cSX>) pair.getFirst());
        java.util.List<AbstractC12782ctV> listKWHzl = cqm.KWHzl((java.util.List<C11571cTe>) pair.getSecond(), (AbstractC12784ctX) CollectionsKt___CollectionsKt.firstOrNull(listEZpvd));
        for (AbstractC12784ctX abstractC12784ctX : listEZpvd) {
            abstractC12784ctX.OLrzqt(listKWHzl);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listKWHzl) {
                if (!((AbstractC12782ctV) obj).zblBkD()) {
                    arrayList.add(obj);
                }
            }
            abstractC12784ctX.AEQbTJ(arrayList);
        }
        java.util.Iterator<T> it = listKWHzl.iterator();
        while (it.hasNext()) {
            ((AbstractC12782ctV) it.next()).copydefault((AbstractC12784ctX) CollectionsKt___CollectionsKt.firstOrNull(listEZpvd));
        }
        return listEZpvd;
    }

    public final AbstractC58260yxt<java.util.List<AbstractC12784ctX>> DbNXlk(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cSF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.fARcdN(this.copydefault, str);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.cSI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cQM.AuCTel(this.AEQbTJ, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault2 = abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.cSK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cQM.zLjUOn(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault2, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault2);
    }

    public static final java.util.List fARcdN(cQM cqm, java.lang.String str) {
        return cqm.copydefault.KWHzl(str);
    }

    public static final java.util.List zLjUOn(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List AuCTel(cQM cqm, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return cqm.EZpvd((java.util.List<cSX>) list);
    }

    public final AbstractC58260yxt<java.util.List<WalletEntity>> AuCTel(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.wlaJM(this.OLrzqt, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List wlaJM(cQM cqm, java.lang.String str) {
        return cqm.copydefault.fetchVPNInfo(str);
    }

    public final AbstractC58260yxt<java.lang.Integer> copydefault(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cSo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.KWHzl(this.AEQbTJ, str, str2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Integer KWHzl(cQM cqm, java.lang.String str, java.lang.String str2) {
        int iOLrzqt;
        java.util.List<HardwareInfoEntity> listAhwBna = cqm.copydefault.AhwBna(str);
        if ((listAhwBna instanceof java.util.Collection) && listAhwBna.isEmpty()) {
            iOLrzqt = 0;
        } else {
            java.util.Iterator<T> it = listAhwBna.iterator();
            while (it.hasNext()) {
                if (!Intrinsics.EZpvd((java.lang.Object) ((HardwareInfoEntity) it.next()).getHardwareName(), (java.lang.Object) str2)) {
                    iOLrzqt = cqm.copydefault.OLrzqt(str, str2);
                    break;
                }
            }
            iOLrzqt = 0;
        }
        return java.lang.Integer.valueOf(iOLrzqt);
    }

    public final AbstractC58260yxt<java.lang.Integer> KWHzl(@NotNull final java.lang.String str, final java.lang.Integer num, final java.lang.String str2, final java.lang.String str3, final java.lang.Integer num2, final java.lang.String str4, final java.lang.String str5, final java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.AubY(this.AEQbTJ, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        AbstractC58260yxt abstractC58260yxtValueOf = C11607cUn.valueOf(abstractC58260yxtCopydefault);
        final Function1 function1 = new Function1() { // from class: o.cRn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cQM.EZpvd(num, str2, str3, num2, str4, str5, list, this, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtOLrzqt = abstractC58260yxtValueOf.OLrzqt(new InterfaceC58229yxO() { // from class: o.cRt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cQM.zsXlph(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final java.util.List AubY(cQM cqm, java.lang.String str) {
        return cqm.copydefault.OLrzqt(str);
    }

    public static final InterfaceC58261yxu zsXlph(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.Integer num2, java.lang.String str3, java.lang.String str4, java.util.List list, final cQM cqm, java.util.List list2) throws EmptyMpcInfoException {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(list2, "");
        final MPCWalletEntity mPCWalletEntity = (MPCWalletEntity) CollectionsKt___CollectionsKt.firstOrNull(list2);
        if (mPCWalletEntity == null) {
            throw new EmptyMpcInfoException();
        }
        if (num != null) {
            mPCWalletEntity.setStatus(num.intValue());
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            Intrinsics.copydefault((java.lang.Object) str);
            mPCWalletEntity.setAccountName(str);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            Intrinsics.copydefault((java.lang.Object) str2);
            mPCWalletEntity.setDisplayAccountName(str2);
        }
        if (num2 != null) {
            mPCWalletEntity.setEscape(num2.intValue());
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str3)) {
            Intrinsics.copydefault((java.lang.Object) str3);
            mPCWalletEntity.setEncryptShareKey(str3);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str4)) {
            Intrinsics.copydefault((java.lang.Object) str4);
            mPCWalletEntity.setMpcId(str4);
        }
        if (list != null && !list.isEmpty()) {
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(new Gson().toJson(list));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            java.lang.String str5 = (java.lang.String) objM7377constructorimpl;
            if (str5 == null) {
                str5 = "";
            }
            mPCWalletEntity.setCopiedEscapeListString(str5);
        }
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.OLrzqt(this.copydefault, mPCWalletEntity);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Integer OLrzqt(cQM cqm, MPCWalletEntity mPCWalletEntity) {
        return java.lang.Integer.valueOf(cqm.copydefault.copydefault(mPCWalletEntity));
    }

    public final AbstractC58260yxt<java.lang.Integer> OLrzqt(@NotNull final java.lang.String str, @NotNull final WalletSyncOperation walletSyncOperation) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(walletSyncOperation, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cSb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.DbNXlk(this.AEQbTJ, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        AbstractC58260yxt abstractC58260yxtValueOf = C11607cUn.valueOf(abstractC58260yxtCopydefault);
        final Function1 function1 = new Function1() { // from class: o.cSc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cQM.OLrzqt(walletSyncOperation, (WalletEntity) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault2 = abstractC58260yxtValueOf.copydefault(new InterfaceC58229yxO() { // from class: o.cSd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cQM.fJNWhG(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cRZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cQM.copydefault(this.copydefault, (WalletEntity) obj);
            }
        };
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault2.OLrzqt(new InterfaceC58229yxO() { // from class: o.cSh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cQM.fIwbmz(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final WalletEntity DbNXlk(cQM cqm, java.lang.String str) {
        return cqm.copydefault.gEmmrt(str);
    }

    public static final WalletEntity fJNWhG(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (WalletEntity) function1.invoke(obj);
    }

    public static final WalletEntity OLrzqt(WalletSyncOperation walletSyncOperation, WalletEntity walletEntity) {
        java.util.List listSplit$default;
        java.util.List listFJNWhG;
        Intrinsics.checkNotNullParameter(walletEntity, "");
        int i = ActionBar.EZpvd[walletSyncOperation.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (walletEntity.getSyncStatus() < WalletSyncStatus.HasCreate.getValue()) {
            walletSyncOperation = null;
        }
        if (walletSyncOperation == null) {
            return null;
        }
        java.lang.String syncOperation = walletEntity.getSyncOperation();
        if (syncOperation == null || syncOperation.length() == 0) {
            walletEntity.setSyncOperation(java.lang.String.valueOf(walletSyncOperation.getValue()));
        } else {
            java.lang.String syncOperation2 = walletEntity.getSyncOperation();
            if (syncOperation2 == null || !StringsKt__StringsKt.contains$default((java.lang.CharSequence) syncOperation2, (java.lang.CharSequence) java.lang.String.valueOf(walletSyncOperation.getValue()), false, 2, (java.lang.Object) null)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.String syncOperation3 = walletEntity.getSyncOperation();
                if (syncOperation3 != null && (listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) syncOperation3, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null)) != null && (listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) listSplit$default)) != null) {
                    listFJNWhG.add(java.lang.String.valueOf(walletSyncOperation.getValue()));
                    java.util.Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(listFJNWhG);
                    if (setOqFWZa != null) {
                        java.util.Iterator it = setOqFWZa.iterator();
                        while (it.hasNext()) {
                            sb.append((java.lang.String) it.next());
                            sb.append(",");
                        }
                    }
                }
                if (StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) sb, (java.lang.CharSequence) ",", false, 2, (java.lang.Object) null)) {
                    Intrinsics.checkNotNullExpressionValue(sb.deleteCharAt(StringsKt__StringsKt.fIwbmz(sb)), "");
                }
                walletEntity.setSyncOperation(sb.toString());
            }
        }
        int syncStatus = walletEntity.getSyncStatus();
        WalletSyncStatus walletSyncStatus = WalletSyncStatus.HasCreate;
        if (syncStatus < walletSyncStatus.getValue()) {
            return walletEntity;
        }
        walletEntity.setSyncStatus(walletSyncStatus.getValue());
        return walletEntity;
    }

    public static final InterfaceC58261yxu fIwbmz(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(final cQM cqm, final WalletEntity walletEntity) {
        Intrinsics.checkNotNullParameter(walletEntity, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.AEQbTJ(this.AEQbTJ, walletEntity);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Integer AEQbTJ(cQM cqm, WalletEntity walletEntity) {
        InterfaceC11384cMf interfaceC11384cMf = cqm.copydefault;
        Intrinsics.copydefault(walletEntity);
        return java.lang.Integer.valueOf(interfaceC11384cMf.EZpvd(walletEntity));
    }

    public final AbstractC58260yxt<java.lang.Integer> OLrzqt(@NotNull LinkedHashMap<java.lang.String, java.util.List<java.lang.String>> linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "");
        final java.util.HashMap map = new java.util.HashMap();
        final java.util.HashMap map2 = new java.util.HashMap();
        java.util.Set<java.lang.String> setKeySet = linkedHashMap.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "");
        int i = 1;
        int i2 = 0;
        for (java.lang.Object obj : setKeySet) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str = (java.lang.String) obj;
            map.put(str, java.lang.Integer.valueOf(i2));
            java.util.HashMap map3 = new java.util.HashMap();
            java.util.List<java.lang.String> list = linkedHashMap.get(str);
            if (list != null) {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    map3.put((java.lang.String) it.next(), java.lang.Integer.valueOf(i));
                    i++;
                }
            }
            java.util.List<java.lang.String> list2 = linkedHashMap.get(str);
            if (list2 != null) {
                int i3 = 0;
                for (java.lang.Object obj2 : list2) {
                    if (i3 < 0) {
                        yDY.AYXKKw();
                    }
                    java.lang.String str2 = (java.lang.String) obj2;
                    java.lang.Integer num = (java.lang.Integer) map3.get(str2);
                    map2.put(str2, java.lang.Integer.valueOf(num != null ? num.intValue() : 1));
                    i3++;
                }
            }
            i2++;
        }
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cSC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.EZpvd(this.OLrzqt, map, map2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Integer EZpvd(cQM cqm, java.util.HashMap map, java.util.HashMap map2) {
        return java.lang.Integer.valueOf(cqm.copydefault.AEQbTJ((java.util.HashMap<java.lang.String, java.lang.Integer>) map, (java.util.HashMap<java.lang.String, java.lang.Integer>) map2));
    }

    public final AbstractC58260yxt<java.util.List<java.lang.Long>> EZpvd(@NotNull final java.lang.String str, @NotNull final java.util.List<WalletDefiEntity> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.OLrzqt(this.copydefault, str, list);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List OLrzqt(cQM cqm, java.lang.String str, java.util.List list) {
        return cqm.copydefault.copydefault(str, (java.util.List<WalletDefiEntity>) list);
    }

    public final AbstractC58260yxt<java.util.List<java.lang.Long>> OLrzqt(@NotNull final java.lang.String str, @NotNull final java.util.List<WalletDefiEntity> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<java.util.List<java.lang.Long>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.AEQbTJ(this.AEQbTJ, str, list);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List AEQbTJ(cQM cqm, java.lang.String str, java.util.List list) {
        return cqm.copydefault.copydefault(str, (java.util.List<WalletDefiEntity>) list);
    }

    public final AbstractC58260yxt<java.util.List<java.lang.Long>> AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.util.List<WalletNftEntity> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.valueOf(this.AEQbTJ, str, list);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List valueOf(cQM cqm, java.lang.String str, java.util.List list) {
        return cqm.copydefault.AEQbTJ(str, (java.util.List<WalletNftEntity>) list);
    }

    public final AbstractC58260yxt<java.lang.Long> KWHzl(@NotNull final WalletNftEntity walletNftEntity) {
        Intrinsics.checkNotNullParameter(walletNftEntity, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.OLrzqt(this.KWHzl, walletNftEntity);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Long OLrzqt(cQM cqm, WalletNftEntity walletNftEntity) {
        return java.lang.Long.valueOf(cqm.copydefault.EZpvd(walletNftEntity));
    }

    public final AbstractC58260yxt<java.lang.Long> EZpvd(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.valueOf(this.OLrzqt, str, str2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Long valueOf(cQM cqm, java.lang.String str, java.lang.String str2) {
        return java.lang.Long.valueOf(cqm.copydefault.EZpvd(str, str2));
    }

    public final AbstractC58260yxt<java.lang.Integer> djBIcL(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.fJNWhG(this.AEQbTJ, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Integer fJNWhG(cQM cqm, java.lang.String str) {
        return java.lang.Integer.valueOf(cqm.copydefault.fIwbmz(str));
    }

    public static /* synthetic */ WalletEntity convertToWalletEntity$default(cQM cqm, AbstractC12782ctV abstractC12782ctV, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return cqm.KWHzl(abstractC12782ctV, str);
    }

    public final WalletEntity KWHzl(AbstractC12782ctV abstractC12782ctV, java.lang.String str) {
        java.lang.String str2;
        java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
        int iOrdinal = abstractC12782ctV.QwvEab().ordinal();
        java.lang.String strRlQdEF = abstractC12782ctV.RlQdEF();
        long jFlVtFt = abstractC12782ctV.flVtFt();
        java.lang.String strDCUTEI = abstractC12782ctV.DCUTEI();
        java.lang.String strAkhnZx = abstractC12782ctV.AkhnZx();
        int iOLrzqt = C11600cUg.OLrzqt(abstractC12782ctV.gasjUx());
        int iOLrzqt2 = C11600cUg.OLrzqt(abstractC12782ctV.AxsJAYaxsJAY());
        int iOLrzqt3 = C11600cUg.OLrzqt(abstractC12782ctV.ffGIBT());
        int iOLrzqt4 = C11600cUg.OLrzqt(abstractC12782ctV.zuWLRA());
        java.lang.String strAUsmxb = abstractC12782ctV.aUsmxb();
        java.lang.String strUSBtdM = abstractC12782ctV.USBtdM();
        int iOLrzqt5 = C11600cUg.OLrzqt(abstractC12782ctV.ixgjPv());
        int iOLrzqt6 = C11600cUg.OLrzqt(abstractC12782ctV.DXXBbs());
        long jDAIeex = abstractC12782ctV.DAIeex();
        int iDmfpNf = abstractC12782ctV.dmfpNf();
        if (str == null || str.length() == 0) {
            AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
            java.lang.String strEZpvd = abstractC12784ctXGwTjWJ != null ? abstractC12784ctXGwTjWJ.EZpvd() : null;
            if (strEZpvd == null) {
                strEZpvd = "";
            }
            str2 = strEZpvd;
        } else {
            str2 = str;
        }
        return new WalletEntity(strDbNXlk, iOrdinal, strRlQdEF, jFlVtFt, strDCUTEI, strAkhnZx, 0, iOLrzqt, iOLrzqt2, iOLrzqt3, iOLrzqt4, strAUsmxb, strUSBtdM, iOLrzqt5, iOLrzqt6, jDAIeex, iDmfpNf, str2, abstractC12782ctV.finit(), abstractC12782ctV.QCjLjM(), null, null, abstractC12782ctV.DarRvM().ordinal(), abstractC12782ctV.fFgQHt().ordinal(), abstractC12782ctV.accept(), 3145792, null);
    }

    public final MpcWalletEncodeInfo copydefault(MPCWalletEntity mPCWalletEntity) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            java.lang.Object objFromJson = new Gson().fromJson(mPCWalletEntity.getCopiedEscapeListString(), new TaskDescription().getType());
            Intrinsics.checkNotNullExpressionValue(objFromJson, "");
            objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) objFromJson);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        java.util.List<java.lang.String> listAhwBna = (java.util.List) objM7377constructorimpl;
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        MpcWalletEncodeInfo mpcWalletEncodeInfo = new MpcWalletEncodeInfo(null, null, null, null, 0, null, null, null, null, null, null, null, null, 0, 0L, 0, 65535, null);
        mpcWalletEncodeInfo.setRootWalletId(mPCWalletEntity.getRootWalletId());
        mpcWalletEncodeInfo.setCopiedEscapeList(listAhwBna);
        mpcWalletEncodeInfo.setMpcId(mPCWalletEntity.getMpcId());
        mpcWalletEncodeInfo.setUid(mPCWalletEntity.getUid());
        mpcWalletEncodeInfo.setStatus(mPCWalletEntity.getStatus());
        mpcWalletEncodeInfo.setVersion(mPCWalletEntity.getVersion());
        mpcWalletEncodeInfo.setAccountName(mPCWalletEntity.getAccountName());
        mpcWalletEncodeInfo.setDisplayAccountName(mPCWalletEntity.getDisplayAccountName());
        mpcWalletEncodeInfo.setEncryptShareKey(mPCWalletEntity.getEncryptShareKey());
        mpcWalletEncodeInfo.setEcdsaPubkey(mPCWalletEntity.getEcdsaPubkey());
        mpcWalletEncodeInfo.setEcdsaChainCode(mPCWalletEntity.getEcdsaChainCode());
        mpcWalletEncodeInfo.setEd25519Pubkey(mPCWalletEntity.getEd25519Pubkey());
        mpcWalletEncodeInfo.setEd25519ChainCode(mPCWalletEntity.getEd25519ChainCode());
        mpcWalletEncodeInfo.setEscape(mPCWalletEntity.isEscape());
        mpcWalletEncodeInfo.setMpcCreateAt(mPCWalletEntity.getMpcCreateAt());
        return mpcWalletEncodeInfo;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.bqB.StateListAnimator.fromCoinMeta$default(o.bqB$StateListAnimator, o.bwM, o.ctV, java.lang.String, int, java.lang.Object):o.bqB */
    /* JADX DEBUG: Class process forced to load method for inline: o.brl.TaskDescription.getInstance$default(o.brl$TaskDescription, android.content.Context, int, java.lang.Object):o.brl */
    /* JADX DEBUG: Class process forced to load method for inline: o.dKx.TaskDescription.getInstance$default(o.dKx$TaskDescription, android.content.Context, int, java.lang.Object):o.dKx */
    /* JADX DEBUG: Type inference failed for r11v18. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r1v64. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r7v11. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r9v30. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r9v35. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:755:0x0715 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:756:0x06d5 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v97, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25, types: [int] */
    /* JADX WARN: Type inference failed for: r4v90 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC12782ctV EZpvd(C11571cTe c11571cTe, AbstractC12784ctX abstractC12784ctX) {
        EOSState eOSStateCopydefault;
        final java.util.ArrayList<ChainAddress> arrayList;
        java.lang.String hiddenValue;
        java.lang.String str;
        boolean z;
        TeeStatus teeStatus;
        SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfoEZpvd;
        SingleTeeStatus singleTeeStatus;
        TeeStatus teeStatus2;
        SingleTeeStatus singleTeeStatus2;
        java.lang.Integer owned;
        java.lang.Object next;
        java.lang.Object next2;
        java.lang.Object next3;
        java.lang.Object next4;
        java.lang.Object next5;
        java.util.List list;
        long j;
        java.util.List list2;
        java.util.List list3;
        java.util.List list4;
        java.lang.String str2;
        java.lang.String str3;
        int i;
        java.util.List list5;
        cCS ccs;
        java.util.List list6;
        java.util.List list7;
        java.util.List list8;
        java.util.List list9;
        java.util.List list10;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.Object next6;
        java.lang.String address;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.util.Iterator it;
        java.lang.String str12;
        java.lang.String str13;
        java.util.ArrayList arrayList2;
        java.util.Iterator it2;
        int i2;
        int i3;
        CustomChainCoinMeta customChainCoinMetaCopydefault;
        java.util.Iterator it3;
        java.lang.Object next7;
        java.lang.String str14;
        cCS ccs2 = new cCS();
        ccs2.zsXlph(c11571cTe.fFgQHt());
        WalletType.Application application = WalletType.Companion;
        ccs2.copydefault(application.KWHzl(c11571cTe.DCUTEI()));
        ccs2.AubY(c11571cTe.QOLQEE());
        ccs2.uzCIH(c11571cTe.fetchVPNInfo());
        ccs2.AuCTelauCTel(c11571cTe.finit());
        ccs2.fARcdN(c11571cTe.flVtFt());
        IdentifierType.Activity activity = IdentifierType.Companion;
        java.lang.Integer numFZBcTu = c11571cTe.fZBcTu();
        ccs2.OLrzqt(activity.AEQbTJ(numFZBcTu != null ? numFZBcTu.intValue() : IdentifierType.IDENTIFIER_TYPE_DEFAULT.getValue()));
        IdentifierTypeNostrFixStatus.Activity activity2 = IdentifierTypeNostrFixStatus.Companion;
        java.lang.Integer numDAIeex = c11571cTe.DAIeex();
        ccs2.copydefault(activity2.AEQbTJ(numDAIeex != null ? numDAIeex.intValue() : IdentifierTypeNostrFixStatus.IDENTIFIER_TYPE_NOSTR_FIXSTATUSDEFAULT.getValue()));
        ccs2.gHZMYf(c11571cTe.AxsJAYaxsJAY());
        ccs2.zLjUOn(c11571cTe.hUfVAv());
        ccs2.DbNXlk(c11571cTe.QKudOq());
        ccs2.gEmmrt(C11600cUg.KWHzl(c11571cTe.gasjUx()));
        ccs2.EZpvd(C11600cUg.KWHzl(c11571cTe.KWHzl()));
        ccs2.OLrzqt(C11600cUg.KWHzl(c11571cTe.hDKMBd()));
        ccs2.copydefault(C11600cUg.KWHzl(c11571cTe.RcXXUw()));
        ccs2.AEQbTJ(C11600cUg.KWHzl(c11571cTe.dxcTrN()));
        ccs2.sSMYrx(c11571cTe.OBJEWx());
        ccs2.AxsJAY(c11571cTe.QHmsKR());
        ccs2.AhwBna(C11600cUg.KWHzl(c11571cTe.RKDWNf()));
        ccs2.valueOf(C11600cUg.KWHzl(c11571cTe.djSkpj()));
        ccs2.wlaJM(c11571cTe.wlaJM());
        ccs2.AEQbTJ(c11571cTe.iRxXKY());
        java.lang.Integer numQUSxYX = c11571cTe.QUSxYX();
        ccs2.KWHzl(application.KWHzl(numQUSxYX != null ? numQUSxYX.intValue() : WalletType.AAWallet.ordinal()));
        ccs2.EZpvd(c11571cTe.accept());
        AAStatus.Application application2 = AAStatus.Companion;
        java.lang.Integer numOLrzqt = c11571cTe.OLrzqt();
        ccs2.OLrzqt(application2.OLrzqt(numOLrzqt != null ? numOLrzqt.intValue() : AAStatus.Normal.ordinal()));
        ccs2.OLrzqt(c11571cTe.copydefault());
        ccs2.wlaJM(c11571cTe.zsXlph());
        C13852daR c13852daR = new C13852daR(null, null, null, null, null, false, 63, null);
        java.lang.String strQVAiDq = c11571cTe.QVAiDq();
        java.lang.String str15 = "";
        if (strQVAiDq == null) {
            strQVAiDq = "";
        }
        c13852daR.AEQbTJ(strQVAiDq);
        java.lang.Integer numQfsBiF = c11571cTe.QfsBiF();
        if (numQfsBiF != null) {
            eOSStateCopydefault = EOSState.Companion.copydefault(numQfsBiF.intValue());
            if (eOSStateCopydefault == null) {
                eOSStateCopydefault = EOSState.Unknown;
            }
        }
        c13852daR.EZpvd(eOSStateCopydefault);
        java.lang.String strRJOkX = c11571cTe.RJOkX();
        if (strRJOkX == null) {
            strRJOkX = "";
        }
        c13852daR.EZpvd(strRJOkX);
        java.lang.String strUeEOUB = c11571cTe.UeEOUB();
        if (strUeEOUB == null) {
            strUeEOUB = "";
        }
        c13852daR.OLrzqt(strUeEOUB);
        java.lang.String strOcIXYQ = c11571cTe.OcIXYQ();
        if (strOcIXYQ == null) {
            strOcIXYQ = "";
        }
        c13852daR.KWHzl(strOcIXYQ);
        java.lang.Integer numQbewEr = c11571cTe.QbewEr();
        c13852daR.AEQbTJ(numQbewEr != null ? C11600cUg.KWHzl(numQbewEr.intValue()) : false);
        Unit unit = Unit.INSTANCE;
        ccs2.EZpvd(c13852daR);
        ccs2.AEQbTJ(abstractC12784ctX != null ? abstractC12784ctX.isConnected() : null);
        java.lang.String strDarRvM = c11571cTe.DarRvM();
        if (strDarRvM == null) {
            strDarRvM = "";
        }
        ccs2.hDKMBd(strDarRvM);
        java.lang.String postValueLengthLimit = c11571cTe.getPostValueLengthLimit();
        if (postValueLengthLimit == null) {
            postValueLengthLimit = "";
        }
        ccs2.getNewProxyInstance(postValueLengthLimit);
        java.lang.String strGGvvIC = c11571cTe.gGvvIC();
        if (strGGvvIC == null) {
            strGGvvIC = "";
        }
        ccs2.fJNWhG(strGGvvIC);
        java.lang.String strQKVWgx = c11571cTe.QKVWgx();
        if (strQKVWgx == null) {
            strQKVWgx = "";
        }
        ccs2.AuCTel(strQKVWgx);
        java.lang.String strDbNXlk = c11571cTe.DbNXlk();
        java.lang.String str16 = ",";
        java.util.List listSplit$default = strDbNXlk != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) strDbNXlk, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null) : null;
        int size = listSplit$default != null ? listSplit$default.size() : 0;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(size);
        java.util.ArrayList<ChainAddress> arrayList4 = new java.util.ArrayList<>(size);
        java.lang.String strAYXKKw = c11571cTe.AYXKKw();
        java.util.List listSplit$default2 = strAYXKKw != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) strAYXKKw, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null) : null;
        java.lang.String strGEmmrt = c11571cTe.gEmmrt();
        java.util.List listSplit$default3 = strGEmmrt != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) strGEmmrt, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null) : null;
        java.lang.String strDjBIcL = c11571cTe.djBIcL();
        java.util.List listSplit$default4 = strDjBIcL != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) strDjBIcL, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null) : null;
        java.lang.String strValues = c11571cTe.values();
        java.util.List listSplit$default5 = strValues != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) strValues, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null) : null;
        java.lang.String strIsConnected = c11571cTe.isConnected();
        java.util.List listSplit$default6 = strIsConnected != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) strIsConnected, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null) : null;
        java.lang.String strAkhnZx = c11571cTe.AkhnZx();
        java.util.List listSplit$default7 = strAkhnZx != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) strAkhnZx, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null) : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (listSplit$default == null || listSplit$default2 == null || listSplit$default3 == null || listSplit$default7 == null || listSplit$default4 == null || listSplit$default5 == null || listSplit$default6 == null || listSplit$default.size() != listSplit$default2.size() || listSplit$default.size() != listSplit$default3.size() || listSplit$default.size() != listSplit$default7.size() || listSplit$default.size() != listSplit$default4.size() || listSplit$default.size() != listSplit$default5.size() || listSplit$default.size() != listSplit$default6.size()) {
            arrayList = arrayList3;
        } else {
            java.util.Iterator it4 = listSplit$default.iterator();
            int i4 = 0;
            while (it4.hasNext()) {
                java.lang.Object next8 = it4.next();
                if (i4 < 0) {
                    yDY.AYXKKw();
                }
                java.util.ArrayList arrayList5 = arrayList3;
                long j2 = java.lang.Long.parseLong((java.lang.String) next8);
                java.util.Iterator it5 = it4;
                java.util.List list11 = listSplit$default2;
                ChainAddress chainAddress = new ChainAddress(j2, (java.lang.String) listSplit$default2.get(i4), KWHzl(ccs2.ixgjPv(), j2, java.lang.Integer.parseInt((java.lang.String) listSplit$default3.get(i4))), (java.lang.String) listSplit$default6.get(i4), (java.lang.String) listSplit$default7.get(i4), true, (java.lang.String) listSplit$default4.get(i4), (java.lang.String) listSplit$default5.get(i4));
                C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(j2);
                if (c10854bwMKWHzl != null) {
                    arrayList5.add(chainAddress);
                    linkedHashMap.put(java.lang.Long.valueOf(c10854bwMKWHzl.AhwBna()), java.lang.Integer.valueOf(c10854bwMKWHzl.QfsBiF()));
                    Unit unit2 = Unit.INSTANCE;
                }
                arrayList4.add(chainAddress);
                i4++;
                arrayList3 = arrayList5;
                it4 = it5;
                listSplit$default2 = list11;
            }
            arrayList = arrayList3;
            if (arrayList.size() > 1) {
                C56407yEf.copydefault(arrayList, new Activity(linkedHashMap));
            }
            if (arrayList4.size() > 1) {
                C56407yEf.copydefault(arrayList4, new FragmentManager(linkedHashMap));
            }
        }
        ccs2.OLrzqt(new Function1() { // from class: o.cRz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cQM.OLrzqt(arrayList, (java.util.ArrayList) obj);
            }
        });
        ccs2.EZpvd(arrayList4);
        java.lang.String strFJNWhG = c11571cTe.fJNWhG();
        java.util.List listSplit$default8 = strFJNWhG != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) strFJNWhG, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null) : null;
        java.util.ArrayList<ChainAddress> arrayList6 = new java.util.ArrayList<>((listSplit$default8 != null ? listSplit$default8.size() : 0) + arrayList.size());
        java.lang.String strEjfBZ = c11571cTe.ejfBZ();
        java.util.List listSplit$default9 = strEjfBZ != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) strEjfBZ, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null) : null;
        java.lang.String strAuCTel = c11571cTe.AuCTel();
        java.util.List listSplit$default10 = strAuCTel != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) strAuCTel, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null) : null;
        java.lang.String strFIwbmz = c11571cTe.fIwbmz();
        java.util.List listSplit$default11 = strFIwbmz != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) strFIwbmz, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null) : null;
        java.lang.String strFARcdN = c11571cTe.fARcdN();
        java.util.List listSplit$default12 = strFARcdN != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) strFARcdN, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null) : null;
        if (listSplit$default8 != null && listSplit$default9 != null && listSplit$default10 != null && listSplit$default11 != null && listSplit$default8.size() == listSplit$default9.size() && listSplit$default8.size() == listSplit$default10.size() && listSplit$default8.size() == listSplit$default11.size()) {
            java.util.Iterator it6 = listSplit$default8.iterator();
            int i5 = 0;
            while (it6.hasNext()) {
                java.lang.Object next9 = it6.next();
                if (i5 < 0) {
                    yDY.AYXKKw();
                }
                long j3 = java.lang.Long.parseLong((java.lang.String) next9);
                int iKWHzl = KWHzl(ccs2.ixgjPv(), j3, java.lang.Integer.parseInt((java.lang.String) listSplit$default10.get(i5)));
                if (C33129mqd.OLrzqt((java.lang.CharSequence) listSplit$default9.get(i5))) {
                    java.util.Iterator it7 = arrayList.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            it3 = it6;
                            next7 = null;
                            break;
                        }
                        next7 = it7.next();
                        ChainAddress chainAddress2 = (ChainAddress) next7;
                        it3 = it6;
                        if (chainAddress2.getCoinId() == j3 && chainAddress2.getAddressType() == iKWHzl) {
                            break;
                        }
                        it6 = it3;
                    }
                    arrayList6.add(new ChainAddress(j3, (java.lang.String) listSplit$default9.get(i5), iKWHzl, null, null, next7 != null, (java.lang.String) listSplit$default11.get(i5), (listSplit$default12 == null || (str14 = (java.lang.String) listSplit$default12.get(i5)) == null) ? "" : str14, 24, null));
                } else {
                    it3 = it6;
                }
                i5++;
                it6 = it3;
            }
        }
        ccs2.KWHzl(arrayList6);
        if (arrayList6.isEmpty()) {
            for (ChainAddress chainAddress3 : arrayList) {
                C10854bwM c10854bwMKWHzl2 = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(chainAddress3.getCoinId()));
                if (c10854bwMKWHzl2 != null) {
                    if (c10854bwMKWHzl2.DsrFlB()) {
                        int iKWHzl2 = KWHzl(ccs2.ixgjPv(), chainAddress3.getCoinId(), chainAddress3.getAddressType());
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) chainAddress3.getAddress())) {
                            arrayList6.add(new ChainAddress(chainAddress3.getCoinId(), chainAddress3.getAddress(), iKWHzl2, null, null, true, chainAddress3.getPublicKey(), chainAddress3.getDerivePath(), 24, null));
                        }
                    }
                    Unit unit3 = Unit.INSTANCE;
                }
            }
        }
        java.util.ArrayList arrayList7 = new java.util.ArrayList(4);
        java.util.List listKWHzl = C11600cUg.KWHzl(c11571cTe.AxsJAY(), ",", new Function1() { // from class: o.cRy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(cQM.copydefault((java.lang.String) obj));
            }
        });
        arrayList7.add(listKWHzl);
        java.util.List<java.lang.String> listCopydefault = C11600cUg.copydefault(c11571cTe.zLjUOn(), ",");
        arrayList7.add(listCopydefault);
        java.util.List<java.lang.String> listCopydefault2 = C11600cUg.copydefault(c11571cTe.AuCTelauCTel(), ",");
        arrayList7.add(listCopydefault2);
        java.util.List<java.lang.String> listCopydefault3 = C11600cUg.copydefault(c11571cTe.AubY(), ",");
        arrayList7.add(listCopydefault3);
        if (!arrayList7.isEmpty()) {
            java.util.Iterator it8 = arrayList7.iterator();
            while (it8.hasNext()) {
                if (((java.util.List) it8.next()).size() != listKWHzl.size()) {
                    break;
                }
            }
            int i6 = 0;
            while (r1.hasNext()) {
            }
        } else {
            int i62 = 0;
            for (java.lang.Object obj : listKWHzl) {
                if (i62 < 0) {
                    yDY.AYXKKw();
                }
                long jLongValue = ((java.lang.Number) obj).longValue();
                if (C10598brV.AEQbTJ.OLrzqt(jLongValue) != null) {
                    ccs2.AxsJAYsNCnLh().add(new ChainAddress(jLongValue, listCopydefault.get(i62), AddressType.Legacy.getValue(), null, null, true, listCopydefault2.get(i62), listCopydefault3.get(i62), 24, null));
                    Unit unit4 = Unit.INSTANCE;
                }
                i62++;
            }
        }
        java.util.List listKWHzl2 = C11600cUg.KWHzl(c11571cTe.gHZMYf(), ",", new Function1() { // from class: o.cRx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return java.lang.Long.valueOf(cQM.KWHzl((java.lang.String) obj2));
            }
        });
        java.util.ArrayList arrayList8 = new java.util.ArrayList(3);
        java.util.List listKWHzl3 = C11600cUg.KWHzl(c11571cTe.zuBGHE(), ",", new Function1() { // from class: o.cRw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return java.lang.Long.valueOf(cQM.AYXKKw((java.lang.String) obj2));
            }
        });
        arrayList8.add(listKWHzl3);
        java.util.List<java.lang.String> listCopydefault4 = C11600cUg.copydefault(c11571cTe.sSMYrx(), ",");
        arrayList8.add(listCopydefault4);
        java.util.List<java.lang.String> listCopydefault5 = C11600cUg.copydefault(c11571cTe.AwvSrB(), ",");
        arrayList8.add(listCopydefault5);
        java.util.ArrayList<C10594brR> arrayList9 = new java.util.ArrayList<>(listKWHzl2.size());
        java.util.ArrayList<C10594brR> arrayList10 = new java.util.ArrayList<>(listKWHzl2.size());
        java.util.HashSet hashSet = new java.util.HashSet(listKWHzl2.size());
        WalletSelectedChainBean walletSelectedChainBeanKWHzl = C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null).KWHzl(c11571cTe.fFgQHt());
        java.util.Iterator it9 = listKWHzl2.iterator();
        while (true) {
            java.lang.String str17 = "0";
            java.lang.String str18 = "0.00";
            if (!it9.hasNext()) {
                break;
            }
            java.util.Iterator it10 = it9;
            long jLongValue2 = ((java.lang.Number) it9.next()).longValue();
            if (!arrayList8.isEmpty()) {
                java.util.Iterator it11 = arrayList8.iterator();
                while (it11.hasNext()) {
                    arrayList2 = arrayList8;
                    if (((java.util.List) it11.next()).size() == listKWHzl3.size()) {
                        arrayList8 = arrayList2;
                    }
                }
                arrayList2 = arrayList8;
                it2 = listKWHzl3.iterator();
                i2 = 0;
                while (true) {
                    if (it2.hasNext()) {
                    }
                    i2++;
                }
                if (i3 >= 0) {
                    str17 = listCopydefault4.get(i3);
                    str18 = listCopydefault5.get(i3);
                }
                customChainCoinMetaCopydefault = C10598brV.AEQbTJ.copydefault(jLongValue2, walletSelectedChainBeanKWHzl.getRpcUrl());
                if (customChainCoinMetaCopydefault == null) {
                }
            } else {
                arrayList2 = arrayList8;
                it2 = listKWHzl3.iterator();
                i2 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    if (((java.lang.Number) it2.next()).longValue() == jLongValue2) {
                        i3 = i2;
                        break;
                    }
                    i2++;
                }
                if (i3 >= 0 && i3 < listKWHzl3.size()) {
                    str17 = listCopydefault4.get(i3);
                    str18 = listCopydefault5.get(i3);
                }
                customChainCoinMetaCopydefault = C10598brV.AEQbTJ.copydefault(jLongValue2, walletSelectedChainBeanKWHzl.getRpcUrl());
                if (customChainCoinMetaCopydefault == null) {
                    C10594brR c10594brR = new C10594brR(customChainCoinMetaCopydefault, ccs2);
                    c10594brR.EZpvd(str17, str18);
                    arrayList9.add(c10594brR);
                    arrayList10.add(c10594brR);
                    hashSet.add(java.lang.Long.valueOf(c10594brR.OLrzqt()));
                    Unit unit5 = Unit.INSTANCE;
                }
            }
            it9 = it10;
            arrayList8 = arrayList2;
        }
        java.util.Iterator it12 = arrayList9.iterator();
        while (it12.hasNext()) {
            C10594brR c10594brR2 = (C10594brR) it12.next();
            if (c10594brR2.fetchVPNInfo().fJNWhG() || hashSet.contains(java.lang.Long.valueOf(c10594brR2.KWHzl().EZpvd()))) {
                it = it12;
            } else {
                it = it12;
                CustomChainCoinMeta customChainCoinMetaCopydefault2 = C10598brV.AEQbTJ.copydefault(c10594brR2.KWHzl().EZpvd(), walletSelectedChainBeanKWHzl.getRpcUrl());
                java.util.Iterator it13 = listKWHzl3.iterator();
                int i7 = 0;
                while (true) {
                    if (!it13.hasNext()) {
                        i7 = -1;
                        break;
                    }
                    if (((java.lang.Number) it13.next()).longValue() == c10594brR2.KWHzl().EZpvd()) {
                        break;
                    }
                    i7++;
                }
                if (i7 < 0 || i7 >= listKWHzl3.size()) {
                    str12 = "0";
                    str13 = "0.00";
                } else {
                    str12 = listCopydefault4.get(i7);
                    str13 = listCopydefault5.get(i7);
                }
                if (customChainCoinMetaCopydefault2 != null) {
                    C10594brR c10594brR3 = new C10594brR(customChainCoinMetaCopydefault2, ccs2);
                    c10594brR3.EZpvd(str12, str13);
                    arrayList10.add(c10594brR3);
                    Unit unit6 = Unit.INSTANCE;
                }
            }
            it12 = it;
        }
        ccs2.AEQbTJ(arrayList9);
        ccs2.AhwBna(arrayList10);
        java.lang.String fieldNames = c11571cTe.getFieldNames();
        java.util.List listSplit$default13 = fieldNames != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) fieldNames, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null) : null;
        java.util.ArrayList<C10525bqB> arrayList11 = new java.util.ArrayList(listSplit$default13 != null ? listSplit$default13.size() : 0);
        java.lang.String strIwGUEr = c11571cTe.iwGUEr();
        java.util.List listSplit$default14 = strIwGUEr != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) strIwGUEr, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null) : null;
        java.lang.String strAEQbTJ = c11571cTe.AEQbTJ();
        java.util.List listSplit$default15 = strAEQbTJ != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) strAEQbTJ, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null) : null;
        java.lang.String strAhwBna = c11571cTe.AhwBna();
        java.util.List listSplit$default16 = strAhwBna != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) strAhwBna, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null) : null;
        java.lang.String strUzCIH = c11571cTe.uzCIH();
        java.util.List listSplit$default17 = strUzCIH != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) strUzCIH, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null) : null;
        java.lang.String strQkdxfA = c11571cTe.QkdxfA();
        java.util.List listSplit$default18 = strQkdxfA != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) strQkdxfA, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null) : null;
        java.lang.String strOuxcSI = c11571cTe.OuxcSI();
        java.util.List listSplit$default19 = strOuxcSI != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) strOuxcSI, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null) : null;
        java.lang.String strZuWLRA = c11571cTe.zuWLRA();
        java.util.List listSplit$default20 = strZuWLRA != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) strZuWLRA, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null) : null;
        java.lang.String strRlQdEF = c11571cTe.RlQdEF();
        java.util.List listSplit$default21 = strRlQdEF != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) strRlQdEF, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null) : null;
        java.lang.String strDNCPSb = c11571cTe.dNCPSb();
        java.util.List listSplit$default22 = strDNCPSb != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) strDNCPSb, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null) : null;
        java.lang.String strGkJEwt = c11571cTe.gkJEwt();
        java.util.List listSplit$default23 = strGkJEwt != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) strGkJEwt, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null) : null;
        java.lang.String strQSBOWP = c11571cTe.QSBOWP();
        java.util.List listSplit$default24 = strQSBOWP != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) strQSBOWP, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null) : null;
        if (listSplit$default13 != null && listSplit$default15 != null) {
            java.util.List list12 = listSplit$default23;
            java.util.List list13 = listSplit$default22;
            if (listSplit$default13.size() == listSplit$default15.size()) {
                java.util.Iterator it14 = listSplit$default13.iterator();
                int i8 = 0;
                while (it14.hasNext()) {
                    java.lang.Object next10 = it14.next();
                    if (i8 < 0) {
                        yDY.AYXKKw();
                    }
                    java.util.List list14 = listSplit$default19;
                    java.lang.String str19 = str16;
                    long j4 = java.lang.Long.parseLong((java.lang.String) next10);
                    java.util.Iterator it15 = it14;
                    C10854bwM c10854bwMKWHzl3 = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(j4));
                    if (c10854bwMKWHzl3 != null) {
                        java.util.List list15 = list12;
                        int i9 = i8;
                        java.util.List list16 = list13;
                        java.util.List list17 = listSplit$default21;
                        cCS ccs3 = ccs2;
                        java.util.List list18 = listSplit$default20;
                        ccs = ccs2;
                        str2 = str15;
                        j = j4;
                        str3 = str19;
                        list6 = list14;
                        C10525bqB c10525bqBFromCoinMeta$default = C10525bqB.StateListAnimator.fromCoinMeta$default(C10525bqB.Companion, c10854bwMKWHzl3, ccs3, null, 4, null);
                        list5 = list15;
                        if (list5 != null) {
                            i = i9;
                            str5 = (java.lang.String) list5.get(i);
                        } else {
                            i = i9;
                            str5 = null;
                        }
                        if (str5 == null) {
                            str5 = str2;
                        }
                        c10525bqBFromCoinMeta$default.gEmmrt(str5);
                        list3 = listSplit$default24;
                        java.lang.String str20 = list3 != null ? (java.lang.String) list3.get(i) : null;
                        if (str20 == null) {
                            str20 = str2;
                        }
                        c10525bqBFromCoinMeta$default.AkhnZx(str20);
                        java.lang.String str21 = listSplit$default14 != null ? (java.lang.String) listSplit$default14.get(i) : null;
                        if (str21 == null || str21.length() == 0) {
                            java.util.Iterator it16 = arrayList.iterator();
                            while (true) {
                                if (!it16.hasNext()) {
                                    next6 = null;
                                    break;
                                }
                                next6 = it16.next();
                                if (((ChainAddress) next6).getCoinId() == c10854bwMKWHzl3.AEQbTJ()) {
                                    break;
                                }
                            }
                            ChainAddress chainAddress4 = (ChainAddress) next6;
                            address = chainAddress4 != null ? chainAddress4.getAddress() : null;
                        } else {
                            address = str21;
                        }
                        java.lang.String str22 = (java.lang.String) listSplit$default15.get(i);
                        java.lang.String str23 = (listSplit$default16 == null || (str11 = (java.lang.String) listSplit$default16.get(i)) == null) ? str2 : str11;
                        java.lang.String str24 = (listSplit$default17 == null || (str10 = (java.lang.String) listSplit$default17.get(i)) == null) ? str2 : str10;
                        java.lang.String str25 = address == null ? str2 : address;
                        java.lang.String str26 = (list6 == null || (str9 = (java.lang.String) list6.get(i)) == null) ? str2 : str9;
                        list = list18;
                        java.lang.String str27 = (list == null || (str8 = (java.lang.String) list.get(i)) == null) ? str2 : str8;
                        list4 = list17;
                        java.lang.String str28 = (list4 == null || (str7 = (java.lang.String) list4.get(i)) == null) ? str2 : str7;
                        list2 = list16;
                        C10525bqB.setValues$default(c10525bqBFromCoinMeta$default, str22, str23, str24, str25, null, str26, str27, str28, (list2 == null || (str6 = (java.lang.String) list2.get(i)) == null) ? str2 : str6, 16, null);
                        arrayList11.add(c10525bqBFromCoinMeta$default);
                    } else {
                        list = listSplit$default20;
                        j = j4;
                        list2 = list13;
                        list3 = listSplit$default24;
                        list4 = listSplit$default21;
                        str2 = str15;
                        str3 = str19;
                        i = i8;
                        list5 = list12;
                        ccs = ccs2;
                        list6 = list14;
                    }
                    if (listSplit$default18 == null || (str4 = (java.lang.String) listSplit$default18.get(i)) == null) {
                        list7 = list;
                    } else {
                        list7 = list;
                        if (C11600cUg.KWHzl(C33129mqd.AhwBna(str4))) {
                            list8 = list5;
                            list9 = list3;
                            list10 = list4;
                            C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).AEQbTJ(j);
                        }
                        i8 = i + 1;
                        listSplit$default19 = list6;
                        ccs2 = ccs;
                        listSplit$default24 = list9;
                        it14 = it15;
                        list12 = list8;
                        listSplit$default21 = list10;
                        listSplit$default20 = list7;
                        java.lang.String str29 = str2;
                        list13 = list2;
                        str16 = str3;
                        str15 = str29;
                    }
                    list8 = list5;
                    list9 = list3;
                    list10 = list4;
                    i8 = i + 1;
                    listSplit$default19 = list6;
                    ccs2 = ccs;
                    listSplit$default24 = list9;
                    it14 = it15;
                    list12 = list8;
                    listSplit$default21 = list10;
                    listSplit$default20 = list7;
                    java.lang.String str292 = str2;
                    list13 = list2;
                    str16 = str3;
                    str15 = str292;
                }
            }
        }
        java.lang.String str30 = str15;
        java.lang.String str31 = str16;
        cCS ccs4 = ccs2;
        ccs4.OLrzqt((java.util.List<C10525bqB>) arrayList11);
        java.lang.String strIZzfmt = c11571cTe.iZzfmt();
        java.util.List listSplit$default25 = strIZzfmt != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) strIZzfmt, new java.lang.String[]{str31}, false, 0, 6, (java.lang.Object) null) : null;
        java.util.ArrayList arrayList12 = new java.util.ArrayList(listSplit$default25 != null ? listSplit$default25.size() : 0);
        arrayList11.ensureCapacity(arrayList11.size() + (listSplit$default25 != null ? listSplit$default25.size() : 0));
        if (listSplit$default25 != null) {
            java.util.Iterator it17 = listSplit$default25.iterator();
            while (it17.hasNext()) {
                C10854bwM c10854bwMKWHzl4 = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) it17.next())));
                if (c10854bwMKWHzl4 != null) {
                    arrayList12.add(c10854bwMKWHzl4);
                    java.util.Iterator it18 = arrayList11.iterator();
                    while (true) {
                        if (!it18.hasNext()) {
                            next5 = null;
                            break;
                        }
                        next5 = it18.next();
                        if (((C10525bqB) next5).OLrzqt() == c10854bwMKWHzl4.AhwBna()) {
                            break;
                        }
                    }
                    if (next5 == null) {
                        arrayList11.add(C10525bqB.StateListAnimator.fromCoinMeta$default(C10525bqB.Companion, c10854bwMKWHzl4, ccs4, null, 4, null));
                    }
                    Unit unit7 = Unit.INSTANCE;
                }
            }
            Unit unit8 = Unit.INSTANCE;
        }
        ccs4.AEQbTJ((java.util.List<C10854bwM>) arrayList12);
        java.util.List<C10854bwM> listAEQbTJ = C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).AEQbTJ(ccs4);
        arrayList11.ensureCapacity(arrayList11.size() + (listAEQbTJ != null ? listAEQbTJ.size() : 0));
        if (listAEQbTJ != null) {
            for (C10854bwM c10854bwM : listAEQbTJ) {
                java.util.Iterator it19 = arrayList11.iterator();
                while (true) {
                    if (!it19.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it19.next();
                    if (((C10525bqB) next4).OLrzqt() == c10854bwM.AhwBna()) {
                        break;
                    }
                }
                if (next4 == null) {
                    arrayList11.add(C10525bqB.StateListAnimator.fromCoinMeta$default(C10525bqB.Companion, c10854bwM, ccs4, null, 4, null));
                }
            }
            Unit unit9 = Unit.INSTANCE;
        }
        java.lang.String newProxyInstance = c11571cTe.getNewProxyInstance();
        java.util.List listSplit$default26 = newProxyInstance != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) newProxyInstance, new java.lang.String[]{str31}, false, 0, 6, (java.lang.Object) null) : null;
        java.util.ArrayList arrayList13 = new java.util.ArrayList(listSplit$default26 != null ? listSplit$default26.size() : 0);
        final java.util.ArrayList arrayList14 = new java.util.ArrayList(listSplit$default26 != null ? listSplit$default26.size() : 0);
        if (listSplit$default26 != null) {
            java.util.Iterator it20 = listSplit$default26.iterator();
            while (it20.hasNext()) {
                final C10854bwM c10854bwMKWHzl5 = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) it20.next())));
                if (c10854bwMKWHzl5 != null) {
                    arrayList13.add(c10854bwMKWHzl5);
                    C56406yEe.AEQbTJ(arrayList11, new Function1() { // from class: o.cRv
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return java.lang.Boolean.valueOf(cQM.KWHzl(c10854bwMKWHzl5, arrayList14, (C10525bqB) obj2));
                        }
                    });
                    Unit unit10 = Unit.INSTANCE;
                }
            }
            Unit unit11 = Unit.INSTANCE;
        }
        ccs4.EZpvd((java.util.List<C10854bwM>) arrayList13);
        ccs4.copydefault(C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).getNewProxyInstance(arrayList14));
        for (Map.Entry<java.lang.String, java.util.List<C10854bwM>> entry : C10954byG.EZpvd.valueOf().KWHzl().entrySet()) {
            java.util.ArrayList arrayList15 = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayList11) {
                C10525bqB c10525bqB = (C10525bqB) obj2;
                if (Intrinsics.EZpvd((java.lang.Object) c10525bqB.valueOf(), (java.lang.Object) entry.getKey()) && c10525bqB.KWHzl().giSNqX()) {
                    arrayList15.add(obj2);
                }
            }
            if (!arrayList15.isEmpty()) {
                arrayList11.ensureCapacity(arrayList11.size() + entry.getValue().size());
                for (C10854bwM c10854bwM2 : entry.getValue()) {
                    if (ccs4.isConnected(c10854bwM2.OcIXYQ())) {
                        java.util.Iterator it21 = arrayList15.iterator();
                        while (true) {
                            if (!it21.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it21.next();
                            if (((C10525bqB) next3).OLrzqt() == c10854bwM2.AhwBna()) {
                                break;
                            }
                        }
                        if (next3 == null) {
                            arrayList11.add(C10525bqB.StateListAnimator.fromCoinMeta$default(C10525bqB.Companion, c10854bwM2, ccs4, null, 4, null));
                        }
                    }
                }
            }
        }
        InterfaceC9852bdR interfaceC9852bdR = (InterfaceC9852bdR) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC9852bdR.class));
        OKWalletHiddenSmallAssetTokenModel oKWalletHiddenSmallAssetTokenModelOLrzqt = interfaceC9852bdR != null ? interfaceC9852bdR.OLrzqt() : null;
        boolean enableHidden = oKWalletHiddenSmallAssetTokenModelOLrzqt != null ? oKWalletHiddenSmallAssetTokenModelOLrzqt.getEnableHidden() : true;
        if (oKWalletHiddenSmallAssetTokenModelOLrzqt == null || (hiddenValue = oKWalletHiddenSmallAssetTokenModelOLrzqt.getHiddenValue()) == null) {
            hiddenValue = "1";
        }
        java.util.List<C10525bqB> listEZpvd = C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).EZpvd(arrayList11, C10329bmR.EZpvd());
        java.util.ArrayList arrayList16 = new java.util.ArrayList(arrayList11.size());
        java.util.ArrayList arrayList17 = new java.util.ArrayList(arrayList11.size());
        for (C10525bqB c10525bqB2 : arrayList11) {
            if (c10525bqB2.KWHzl().DCUTEI()) {
                arrayList16.add(c10525bqB2);
            } else if (c10525bqB2.KWHzl().giSNqX()) {
                java.util.Iterator it22 = listEZpvd.iterator();
                while (true) {
                    if (!it22.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it22.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((C10525bqB) next).valueOf(), (java.lang.Object) c10525bqB2.KWHzl().fJNWhG())) {
                        break;
                    }
                }
                C10525bqB c10525bqB3 = (C10525bqB) next;
                if (c10525bqB3 != null) {
                    if (OLrzqt(enableHidden, hiddenValue, c10525bqB3.AhwBna())) {
                        arrayList16.add(c10525bqB2);
                    } else {
                        arrayList17.add(c10525bqB2);
                    }
                }
            } else if (c10525bqB2.KWHzl().dxcTrN()) {
                java.util.Iterator it23 = listEZpvd.iterator();
                while (true) {
                    if (!it23.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it23.next();
                    if (((C10525bqB) next2).OLrzqt() == c10525bqB2.KWHzl().AhwBna()) {
                        break;
                    }
                }
                C10525bqB c10525bqB4 = (C10525bqB) next2;
                if (c10525bqB4 != null) {
                    if (OLrzqt(enableHidden, hiddenValue, c10525bqB4.AhwBna())) {
                        arrayList16.add(c10525bqB2);
                    } else {
                        arrayList17.add(c10525bqB2);
                    }
                }
            } else if (OLrzqt(enableHidden, hiddenValue, c10525bqB2.AhwBna())) {
                arrayList16.add(c10525bqB2);
            } else {
                arrayList17.add(c10525bqB2);
            }
        }
        ccs4.KWHzl(C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).getNewProxyInstance(arrayList16));
        java.util.List<C10525bqB> listCall = ccs4.call();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (java.lang.Object obj3 : listCall) {
            java.lang.Long lValueOf = java.lang.Long.valueOf(((C10525bqB) obj3).OLrzqt());
            java.lang.Object arrayList18 = linkedHashMap2.get(lValueOf);
            if (arrayList18 == null) {
                arrayList18 = new java.util.ArrayList();
                linkedHashMap2.put(lValueOf, arrayList18);
            }
            ((java.util.List) arrayList18).add(obj3);
        }
        ccs4.AEQbTJ(linkedHashMap2);
        ccs4.AYXKKw(arrayList17);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (java.lang.Object obj4 : arrayList17) {
            java.lang.Long lValueOf2 = java.lang.Long.valueOf(((C10525bqB) obj4).OLrzqt());
            java.lang.Object arrayList19 = linkedHashMap3.get(lValueOf2);
            if (arrayList19 == null) {
                arrayList19 = new java.util.ArrayList();
                linkedHashMap3.put(lValueOf2, arrayList19);
            }
            ((java.util.List) arrayList19).add(obj4);
        }
        ccs4.EZpvd(linkedHashMap3);
        java.lang.String strDTwDnp = c11571cTe.DTwDnp();
        java.util.List listSplit$default27 = strDTwDnp != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) strDTwDnp, new java.lang.String[]{str31}, false, 0, 6, (java.lang.Object) null) : null;
        java.util.ArrayList arrayList20 = new java.util.ArrayList(listSplit$default27 != null ? listSplit$default27.size() : 0);
        java.lang.String strORxRYg = c11571cTe.ORxRYg();
        java.util.List<java.lang.String> listSplit$default28 = strORxRYg != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) strORxRYg, new java.lang.String[]{"}-"}, false, 0, 6, (java.lang.Object) null) : null;
        java.util.ArrayList arrayList21 = new java.util.ArrayList(listSplit$default28 != null ? listSplit$default28.size() : 0);
        if (listSplit$default28 != null) {
            for (java.lang.String str32 : listSplit$default28) {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) str32)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(str32);
                    if (!StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) str32, AbstractJsonLexerKt.END_OBJ, false, 2, (java.lang.Object) null)) {
                        sb.append(AbstractJsonLexerKt.END_OBJ);
                    }
                    arrayList21.add(sb.toString());
                }
            }
            Unit unit12 = Unit.INSTANCE;
        }
        java.util.ArrayList arrayList22 = new java.util.ArrayList(arrayList21.size());
        java.util.Iterator it24 = arrayList21.iterator();
        while (it24.hasNext()) {
            Portfolio portfolio = (Portfolio) C33490mxT.EZpvd((java.lang.String) it24.next(), Portfolio.class);
            if (portfolio != null) {
                arrayList22.add(portfolio);
            }
        }
        if (listSplit$default27 != null) {
            java.util.ArrayList arrayList23 = new java.util.ArrayList();
            for (java.lang.Object obj5 : listSplit$default27) {
                if (C10953byF.KWHzl.OLrzqt((java.lang.String) obj5)) {
                    arrayList23.add(obj5);
                }
            }
            int i10 = 0;
            for (java.lang.Object obj6 : arrayList23) {
                if (i10 < 0) {
                    yDY.AYXKKw();
                }
                java.lang.Object obj7 = arrayList22.get(i10);
                Intrinsics.checkNotNullExpressionValue(obj7, str30);
                arrayList20.add(new C10527bqD((Portfolio) obj7, ccs4));
                i10++;
            }
            str = str30;
            Unit unit13 = Unit.INSTANCE;
        } else {
            str = str30;
        }
        ccs4.copydefault(new java.util.ArrayList<>(arrayList20));
        java.lang.String strGiSNqX = c11571cTe.giSNqX();
        java.util.List listSplit$default29 = strGiSNqX != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) strGiSNqX, new java.lang.String[]{"&-&"}, false, 0, 6, (java.lang.Object) null) : null;
        java.util.ArrayList arrayList24 = new java.util.ArrayList(listSplit$default29 != null ? listSplit$default29.size() : 0);
        java.lang.String strFvQaOB = c11571cTe.fvQaOB();
        java.util.List<java.lang.String> listSplit$default30 = strFvQaOB != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) strFvQaOB, new java.lang.String[]{"}-"}, false, 0, 6, (java.lang.Object) null) : null;
        java.util.ArrayList arrayList25 = new java.util.ArrayList(listSplit$default30 != null ? listSplit$default30.size() : 0);
        if (listSplit$default30 != null) {
            for (java.lang.String str33 : listSplit$default30) {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) str33)) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(str33);
                    if (!StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) str33, AbstractJsonLexerKt.END_OBJ, false, 2, (java.lang.Object) null)) {
                        sb2.append(AbstractJsonLexerKt.END_OBJ);
                    }
                    arrayList25.add(sb2.toString());
                }
            }
            z = false;
            Unit unit14 = Unit.INSTANCE;
        } else {
            z = false;
        }
        ?? arrayList26 = new java.util.ArrayList(arrayList25.size());
        java.util.Iterator it25 = arrayList25.iterator();
        while (it25.hasNext()) {
            NftBean nftBean = (NftBean) C33490mxT.EZpvd((java.lang.String) it25.next(), NftBean.class);
            if (nftBean != null) {
                arrayList26.add(nftBean);
            }
        }
        if (listSplit$default29 != null) {
            java.util.ArrayList arrayList27 = new java.util.ArrayList();
            for (java.lang.Object obj8 : listSplit$default29) {
                if (C10953byF.KWHzl.OLrzqt((java.lang.String) obj8)) {
                    arrayList27.add(obj8);
                }
            }
            ?? r4 = z;
            for (java.lang.Object obj9 : arrayList27) {
                if (r4 < 0) {
                    yDY.AYXKKw();
                }
                java.lang.Integer total = ((NftBean) arrayList26.get(r4)).getTotal();
                if ((total != null && C33129mqd.AhwBna(total) > 0) || ((owned = ((NftBean) arrayList26.get(r4)).getOwned()) != null && C33129mqd.AhwBna(owned) > 0)) {
                    java.lang.Object obj10 = arrayList26.get(r4);
                    Intrinsics.checkNotNullExpressionValue(obj10, str);
                    arrayList24.add(new C10528bqE((NftBean) obj10, ccs4));
                }
                r4++;
            }
            Unit unit15 = Unit.INSTANCE;
        }
        ccs4.gEmmrt(new java.util.ArrayList<>(arrayList24));
        if (ccs4.QwvEab() == WalletType.HDWallet) {
            java.lang.String strOqFWZa = c11571cTe.OqFWZa();
            if (strOqFWZa != null) {
                str = strOqFWZa;
            }
            ccs4.AwvSrB(str);
            java.lang.String strDbNXlk2 = ccs4.DbNXlk();
            java.lang.String strFHqPtx = ccs4.fHqPtx();
            java.lang.Boolean boolRdAHlO = c11571cTe.RdAHlO();
            boolean zBooleanValue = boolRdAHlO != null ? boolRdAHlO.booleanValue() : z;
            java.lang.Boolean boolGwTjWJ = c11571cTe.gwTjWJ();
            boolean zBooleanValue2 = boolGwTjWJ != null ? boolGwTjWJ.booleanValue() : z;
            java.lang.Long lDXXBbs = c11571cTe.DXXBbs();
            TeeStatus teeStatus3 = new TeeStatus(zBooleanValue, zBooleanValue2, lDXXBbs != null ? lDXXBbs.longValue() : 0L, null, false, java.lang.Boolean.valueOf(C11600cUg.KWHzl(c11571cTe.EZpvd())), java.lang.Integer.valueOf(c11571cTe.ffGIBT()), null, c11571cTe.dvKsVJ(), CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA, null);
            java.lang.Boolean boolDmfpNf = c11571cTe.dmfpNf();
            SingleTeeStatus singleTeeStatus3 = new SingleTeeStatus(strDbNXlk2, strFHqPtx, teeStatus3, new AddressVerifyStatus(boolDmfpNf != null ? boolDmfpNf.booleanValue() : z), null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
            java.lang.Boolean boolAKErDB = c11571cTe.aKErDB();
            teeStatus = null;
            singleTeeStatusAndWarringInfoEZpvd = InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).getFieldNames().EZpvd(ccs4.DbNXlk(), new SingleTeeStatusAndWarringInfo(singleTeeStatus3, boolAKErDB != null ? boolAKErDB.booleanValue() : z, c11571cTe.ODWQjV(), c11571cTe.DCJXGO(), c11571cTe.valueOf()));
        } else {
            teeStatus = null;
            singleTeeStatusAndWarringInfoEZpvd = null;
        }
        ccs4.OLrzqt(singleTeeStatusAndWarringInfoEZpvd);
        if (ccs4.OJuSTm() != null && ccs4.zuWLRA()) {
            SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfoOJuSTm = ccs4.OJuSTm();
            dTH dthAEQbTJ = C17922fXg.AEQbTJ((singleTeeStatusAndWarringInfoOJuSTm == null || (singleTeeStatus2 = singleTeeStatusAndWarringInfoOJuSTm.getSingleTeeStatus()) == null) ? teeStatus : singleTeeStatus2.getTeeStatus(), ccs4.DbNXlk());
            if (dthAEQbTJ != null) {
                ((dTP) C43251rlk.copydefault(dTP.class)).OLrzqt(dthAEQbTJ);
                Unit unit16 = Unit.INSTANCE;
            }
            SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfoOJuSTm2 = ccs4.OJuSTm();
            if (singleTeeStatusAndWarringInfoOJuSTm2 != null && (singleTeeStatus = singleTeeStatusAndWarringInfoOJuSTm2.getSingleTeeStatus()) != null && (teeStatus2 = singleTeeStatus.getTeeStatus()) != null) {
                ((dTI) C43251rlk.copydefault(dTI.class)).copydefault(dTK.Companion.copydefault(teeStatus2.getModel(), ccs4.DbNXlk()));
                Unit unit17 = Unit.INSTANCE;
            }
        }
        return ccs4;
    }

    public static final long copydefault(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return java.lang.Long.parseLong(str);
    }

    public static final long KWHzl(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return java.lang.Long.parseLong(str);
    }

    public static final long AYXKKw(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return java.lang.Long.parseLong(str);
    }

    public static final boolean KWHzl(C10854bwM c10854bwM, java.util.ArrayList arrayList, C10525bqB c10525bqB) {
        Intrinsics.checkNotNullParameter(c10525bqB, "");
        boolean z = c10525bqB.OLrzqt() == c10854bwM.AhwBna();
        if (z) {
            arrayList.add(c10525bqB);
        }
        return z;
    }

    public static final boolean OLrzqt(boolean z, java.lang.String str, java.lang.String str2) {
        if (z) {
            return C33129mqd.copydefault(str2, str);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC12782ctV OLrzqt(WalletViewForWalletManagement walletViewForWalletManagement, AbstractC12784ctX abstractC12784ctX) {
        EOSState eOSStateCopydefault;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String balance;
        java.util.List<java.lang.String> listSplit$default;
        boolean z;
        NftPrice floorSalePrice;
        java.lang.String usdPrice;
        java.lang.Integer total;
        java.util.List<java.lang.String> listSplit$default2;
        TeeStatus teeStatus;
        SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfoEZpvd;
        SingleTeeStatus singleTeeStatus;
        TeeStatus teeStatus2;
        SingleTeeStatus singleTeeStatus2;
        java.lang.String str3;
        java.lang.Object next;
        java.lang.String str4;
        cCS ccs = new cCS();
        ccs.zsXlph(walletViewForWalletManagement.getId());
        WalletType.Application application = WalletType.Companion;
        ccs.copydefault(application.KWHzl(walletViewForWalletManagement.getType()));
        ccs.AubY(walletViewForWalletManagement.getData());
        ccs.uzCIH(walletViewForWalletManagement.getChainId());
        ccs.AuCTelauCTel(walletViewForWalletManagement.getLanguage());
        ccs.fARcdN(walletViewForWalletManagement.getName());
        IdentifierType.Activity activity = IdentifierType.Companion;
        java.lang.Integer identifierType = walletViewForWalletManagement.getIdentifierType();
        ccs.OLrzqt(activity.AEQbTJ(identifierType != null ? identifierType.intValue() : IdentifierType.IDENTIFIER_TYPE_DEFAULT.getValue()));
        IdentifierTypeNostrFixStatus.Activity activity2 = IdentifierTypeNostrFixStatus.Companion;
        java.lang.Integer repairStatus = walletViewForWalletManagement.getRepairStatus();
        ccs.copydefault(activity2.AEQbTJ(repairStatus != null ? repairStatus.intValue() : IdentifierTypeNostrFixStatus.IDENTIFIER_TYPE_NOSTR_FIXSTATUSDEFAULT.getValue()));
        ccs.gHZMYf(walletViewForWalletManagement.getRepairReserved());
        ccs.zLjUOn(walletViewForWalletManagement.getRepairExtJson());
        ccs.DbNXlk(walletViewForWalletManagement.getRepairTimestamp());
        ccs.gEmmrt(C11600cUg.KWHzl(walletViewForWalletManagement.getModifiedName()));
        ccs.EZpvd(C11600cUg.KWHzl(walletViewForWalletManagement.getBackup()));
        ccs.OLrzqt(C11600cUg.KWHzl(walletViewForWalletManagement.getCloudBackup()));
        ccs.copydefault(C11600cUg.KWHzl(walletViewForWalletManagement.getIHuaweiBackup()));
        ccs.AEQbTJ(C11600cUg.KWHzl(walletViewForWalletManagement.getMain()));
        ccs.sSMYrx(walletViewForWalletManagement.getXpub());
        ccs.AxsJAY(walletViewForWalletManagement.getXpriv());
        ccs.AhwBna(C11600cUg.KWHzl(walletViewForWalletManagement.isSegWit()));
        ccs.valueOf(C11600cUg.KWHzl(walletViewForWalletManagement.getFromCreate()));
        ccs.wlaJM(walletViewForWalletManagement.getCreateAt());
        ccs.AEQbTJ(walletViewForWalletManagement.getOrderValue());
        java.lang.Integer eoaWalletType = walletViewForWalletManagement.getEoaWalletType();
        ccs.KWHzl(application.KWHzl(eoaWalletType != null ? eoaWalletType.intValue() : WalletType.AAWallet.ordinal()));
        ccs.EZpvd(walletViewForWalletManagement.getSyncStatus());
        AAStatus.Application application2 = AAStatus.Companion;
        java.lang.Integer aaWalletStatus = walletViewForWalletManagement.getAaWalletStatus();
        ccs.OLrzqt(application2.OLrzqt(aaWalletStatus != null ? aaWalletStatus.intValue() : AAStatus.Normal.ordinal()));
        ccs.OLrzqt(walletViewForWalletManagement.getAddressIndex());
        ccs.wlaJM(walletViewForWalletManagement.getCreateVersion());
        C13852daR c13852daR = new C13852daR(null, null, null, null, null, false, 63, null);
        java.lang.String eosAccountName = walletViewForWalletManagement.getEosAccountName();
        java.lang.String str5 = "";
        if (eosAccountName == null) {
            eosAccountName = "";
        }
        c13852daR.AEQbTJ(eosAccountName);
        java.lang.Integer eOSState = walletViewForWalletManagement.getEOSState();
        if (eOSState != null) {
            eOSStateCopydefault = EOSState.Companion.copydefault(eOSState.intValue());
            if (eOSStateCopydefault == null) {
                eOSStateCopydefault = EOSState.Unknown;
            }
        }
        c13852daR.EZpvd(eOSStateCopydefault);
        java.lang.String eOSPubKey = walletViewForWalletManagement.getEOSPubKey();
        if (eOSPubKey == null) {
            eOSPubKey = "";
        }
        c13852daR.EZpvd(eOSPubKey);
        java.lang.String eosActiveKey = walletViewForWalletManagement.getEosActiveKey();
        if (eosActiveKey == null) {
            eosActiveKey = "";
        }
        c13852daR.OLrzqt(eosActiveKey);
        java.lang.String eOSOwnerKey = walletViewForWalletManagement.getEOSOwnerKey();
        if (eOSOwnerKey == null) {
            eOSOwnerKey = "";
        }
        c13852daR.KWHzl(eOSOwnerKey);
        java.lang.Integer eOSShouldBeDeleted = walletViewForWalletManagement.getEOSShouldBeDeleted();
        c13852daR.AEQbTJ(eOSShouldBeDeleted != null ? C11600cUg.KWHzl(eOSShouldBeDeleted.intValue()) : false);
        ccs.EZpvd(c13852daR);
        ccs.AEQbTJ(abstractC12784ctX != null ? abstractC12784ctX.isConnected() : null);
        java.lang.String tokenAsset = walletViewForWalletManagement.getTokenAsset();
        if (tokenAsset == null) {
            tokenAsset = "";
        }
        ccs.hDKMBd(tokenAsset);
        java.lang.String tokenAssetFilterSmall = walletViewForWalletManagement.getTokenAssetFilterSmall();
        if (tokenAssetFilterSmall == null) {
            tokenAssetFilterSmall = "";
        }
        ccs.getNewProxyInstance(tokenAssetFilterSmall);
        java.lang.String nftAsset = walletViewForWalletManagement.getNftAsset();
        if (nftAsset == null) {
            nftAsset = "";
        }
        ccs.fJNWhG(nftAsset);
        java.lang.String defiAsset = walletViewForWalletManagement.getDefiAsset();
        if (defiAsset == null) {
            defiAsset = "";
        }
        ccs.AuCTel(defiAsset);
        java.lang.String chainIds = walletViewForWalletManagement.getChainIds();
        java.lang.String str6 = ",";
        java.util.List listSplit$default3 = chainIds != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) chainIds, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null) : null;
        int size = listSplit$default3 != null ? listSplit$default3.size() : 0;
        final java.util.ArrayList<ChainAddress> arrayList = new java.util.ArrayList(size);
        java.util.ArrayList<ChainAddress> arrayList2 = new java.util.ArrayList<>(size);
        java.lang.String chainAddrs = walletViewForWalletManagement.getChainAddrs();
        java.util.List listSplit$default4 = chainAddrs != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) chainAddrs, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null) : null;
        java.lang.String chainAddrTypes = walletViewForWalletManagement.getChainAddrTypes();
        java.util.List listSplit$default5 = chainAddrTypes != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) chainAddrTypes, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null) : null;
        java.lang.String chainAddressPublicKeys = walletViewForWalletManagement.getChainAddressPublicKeys();
        java.util.List listSplit$default6 = chainAddressPublicKeys != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) chainAddressPublicKeys, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null) : null;
        java.lang.String chainAddsDerivePaths = walletViewForWalletManagement.getChainAddsDerivePaths();
        java.util.List listSplit$default7 = chainAddsDerivePaths != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) chainAddsDerivePaths, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null) : null;
        java.lang.String chainAddsProxyAddresses = walletViewForWalletManagement.getChainAddsProxyAddresses();
        java.util.List listSplit$default8 = chainAddsProxyAddresses != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) chainAddsProxyAddresses, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null) : null;
        java.lang.String chainAddsEoaAddresses = walletViewForWalletManagement.getChainAddsEoaAddresses();
        java.util.List listSplit$default9 = chainAddsEoaAddresses != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) chainAddsEoaAddresses, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null) : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (listSplit$default3 == null || listSplit$default4 == null || listSplit$default5 == null || listSplit$default9 == null || listSplit$default6 == null || listSplit$default7 == null || listSplit$default8 == null || listSplit$default3.size() != listSplit$default4.size() || listSplit$default3.size() != listSplit$default5.size() || listSplit$default3.size() != listSplit$default9.size() || listSplit$default3.size() != listSplit$default6.size() || listSplit$default3.size() != listSplit$default7.size() || listSplit$default3.size() != listSplit$default8.size()) {
            str = ",";
            str2 = "";
        } else {
            java.util.Iterator it = listSplit$default3.iterator();
            int i = 0;
            while (it.hasNext()) {
                java.lang.Object next2 = it.next();
                if (i < 0) {
                    yDY.AYXKKw();
                }
                java.util.Iterator it2 = it;
                java.lang.String str7 = str6;
                long j = java.lang.Long.parseLong((java.lang.String) next2);
                java.lang.String str8 = str5;
                ChainAddress chainAddress = new ChainAddress(j, (java.lang.String) listSplit$default4.get(i), KWHzl(ccs.ixgjPv(), j, java.lang.Integer.parseInt((java.lang.String) listSplit$default5.get(i))), (java.lang.String) listSplit$default8.get(i), (java.lang.String) listSplit$default9.get(i), true, (java.lang.String) listSplit$default6.get(i), (java.lang.String) listSplit$default7.get(i));
                C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(j);
                if (c10854bwMKWHzl != null) {
                    arrayList.add(chainAddress);
                    linkedHashMap.put(java.lang.Long.valueOf(c10854bwMKWHzl.AhwBna()), java.lang.Integer.valueOf(c10854bwMKWHzl.QfsBiF()));
                    Unit unit = Unit.INSTANCE;
                }
                arrayList2.add(chainAddress);
                i++;
                str6 = str7;
                it = it2;
                str5 = str8;
            }
            str = str6;
            str2 = str5;
            if (arrayList.size() > 1) {
                C56407yEf.copydefault(arrayList, new PendingIntent(linkedHashMap));
            }
            if (arrayList2.size() > 1) {
                C56407yEf.copydefault(arrayList2, new LoaderManager(linkedHashMap));
            }
        }
        ccs.OLrzqt(new Function1() { // from class: o.cQS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cQM.copydefault(arrayList, (java.util.ArrayList) obj);
            }
        });
        ccs.EZpvd(arrayList2);
        java.lang.String chainSegWitChainIds = walletViewForWalletManagement.getChainSegWitChainIds();
        java.util.List listSplit$default10 = chainSegWitChainIds != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) chainSegWitChainIds, new java.lang.String[]{str}, false, 0, 6, (java.lang.Object) null) : null;
        java.util.ArrayList<ChainAddress> arrayList3 = new java.util.ArrayList<>((listSplit$default10 != null ? listSplit$default10.size() : 0) + arrayList.size());
        java.lang.String chainSegWitAddresses = walletViewForWalletManagement.getChainSegWitAddresses();
        java.util.List listSplit$default11 = chainSegWitAddresses != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) chainSegWitAddresses, new java.lang.String[]{str}, false, 0, 6, (java.lang.Object) null) : null;
        java.lang.String chainSegWitAddTypes = walletViewForWalletManagement.getChainSegWitAddTypes();
        java.util.List listSplit$default12 = chainSegWitAddTypes != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) chainSegWitAddTypes, new java.lang.String[]{str}, false, 0, 6, (java.lang.Object) null) : null;
        java.lang.String chainSegWitAddressPublicKeys = walletViewForWalletManagement.getChainSegWitAddressPublicKeys();
        java.util.List listSplit$default13 = chainSegWitAddressPublicKeys != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) chainSegWitAddressPublicKeys, new java.lang.String[]{str}, false, 0, 6, (java.lang.Object) null) : null;
        java.lang.String chainSegWitAddressDerivePaths = walletViewForWalletManagement.getChainSegWitAddressDerivePaths();
        java.util.List listSplit$default14 = chainSegWitAddressDerivePaths != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) chainSegWitAddressDerivePaths, new java.lang.String[]{str}, false, 0, 6, (java.lang.Object) null) : null;
        if (listSplit$default10 != null && listSplit$default11 != null && listSplit$default12 != null && listSplit$default13 != null && listSplit$default10.size() == listSplit$default11.size() && listSplit$default10.size() == listSplit$default12.size() && listSplit$default10.size() == listSplit$default13.size()) {
            int i2 = 0;
            for (java.lang.Object obj : listSplit$default10) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                long j2 = java.lang.Long.parseLong((java.lang.String) obj);
                int iKWHzl = KWHzl(ccs.ixgjPv(), j2, java.lang.Integer.parseInt((java.lang.String) listSplit$default12.get(i2)));
                if (C33129mqd.OLrzqt((java.lang.CharSequence) listSplit$default11.get(i2))) {
                    java.util.Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                        ChainAddress chainAddress2 = (ChainAddress) next;
                        if (chainAddress2.getCoinId() == j2 && chainAddress2.getAddressType() == iKWHzl) {
                            break;
                        }
                    }
                    arrayList3.add(new ChainAddress(j2, (java.lang.String) listSplit$default11.get(i2), iKWHzl, null, null, next != null, (java.lang.String) listSplit$default13.get(i2), (listSplit$default14 == null || (str4 = (java.lang.String) listSplit$default14.get(i2)) == null) ? str2 : str4, 24, null));
                }
                i2++;
            }
        }
        ccs.KWHzl(arrayList3);
        if (arrayList3.isEmpty()) {
            for (ChainAddress chainAddress3 : arrayList) {
                C10854bwM c10854bwMKWHzl2 = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(chainAddress3.getCoinId()));
                if (c10854bwMKWHzl2 != null) {
                    if (c10854bwMKWHzl2.DsrFlB()) {
                        int iKWHzl2 = KWHzl(ccs.ixgjPv(), chainAddress3.getCoinId(), chainAddress3.getAddressType());
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) chainAddress3.getAddress())) {
                            arrayList3.add(new ChainAddress(chainAddress3.getCoinId(), chainAddress3.getAddress(), iKWHzl2, null, null, true, chainAddress3.getPublicKey(), chainAddress3.getDerivePath(), 24, null));
                        }
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
        java.lang.String closedCoinIds = walletViewForWalletManagement.getClosedCoinIds();
        java.util.List listSplit$default15 = closedCoinIds != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) closedCoinIds, new java.lang.String[]{str}, false, 0, 6, (java.lang.Object) null) : null;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(listSplit$default15 != null ? listSplit$default15.size() : 0);
        if (listSplit$default15 != null) {
            java.util.Iterator it4 = listSplit$default15.iterator();
            while (it4.hasNext()) {
                C10854bwM c10854bwMKWHzl3 = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) it4.next())));
                if (c10854bwMKWHzl3 != null) {
                    arrayList4.add(c10854bwMKWHzl3);
                    Unit unit3 = Unit.INSTANCE;
                }
            }
            Unit unit4 = Unit.INSTANCE;
        }
        ccs.EZpvd((java.util.List<C10854bwM>) arrayList4);
        java.lang.String coinIds = walletViewForWalletManagement.getCoinIds();
        java.util.List listSplit$default16 = coinIds != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) coinIds, new java.lang.String[]{str}, false, 0, 6, (java.lang.Object) null) : null;
        java.lang.String ccyAmounts = walletViewForWalletManagement.getCcyAmounts();
        java.util.List listSplit$default17 = ccyAmounts != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) ccyAmounts, new java.lang.String[]{str}, false, 0, 6, (java.lang.Object) null) : null;
        java.lang.String voucherTokens = walletViewForWalletManagement.getVoucherTokens();
        java.util.List listSplit$default18 = voucherTokens != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) voucherTokens, new java.lang.String[]{str}, false, 0, 6, (java.lang.Object) null) : null;
        if (listSplit$default16 != null) {
            BigDecimal bigDecimalCopydefault = C33129mqd.copydefault(0);
            BigDecimal bigDecimalAdd = bigDecimalCopydefault;
            int i3 = 0;
            for (java.lang.Object obj2 : listSplit$default16) {
                if (i3 < 0) {
                    yDY.AYXKKw();
                }
                long j3 = java.lang.Long.parseLong((java.lang.String) obj2);
                if (listSplit$default18 == null || (str3 = (java.lang.String) listSplit$default18.get(i3)) == null || !C11600cUg.KWHzl(C33129mqd.AhwBna(str3))) {
                    BigDecimal bigDecimalCopydefault2 = C33129mqd.copydefault(listSplit$default17 != null ? (java.lang.String) listSplit$default17.get(i3) : null);
                    java.lang.String totalAssetUpdateTime = walletViewForWalletManagement.getTotalAssetUpdateTime();
                    if (totalAssetUpdateTime == null || totalAssetUpdateTime.length() == 0 || ccs.zuWLRA()) {
                        bigDecimalAdd = bigDecimalAdd.add(bigDecimalCopydefault2);
                    }
                } else {
                    C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).AEQbTJ(j3);
                }
                i3++;
            }
            java.lang.String totalAssetUpdateTime2 = walletViewForWalletManagement.getTotalAssetUpdateTime();
            if (totalAssetUpdateTime2 == null || totalAssetUpdateTime2.length() == 0 || ccs.zuWLRA()) {
                ccs.hDKMBd(C54862xYb.convertToString$default(bigDecimalAdd, false, null, null, 7, null));
            }
        }
        java.lang.String totalAssetUpdateTime3 = walletViewForWalletManagement.getTotalAssetUpdateTime();
        if (totalAssetUpdateTime3 == null || totalAssetUpdateTime3.length() == 0 || ccs.zuWLRA()) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.String defiBeans = walletViewForWalletManagement.getDefiBeans();
            if (defiBeans != null && (listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) defiBeans, new java.lang.String[]{"}-"}, false, 0, 6, (java.lang.Object) null)) != null) {
                for (java.lang.String str9 : listSplit$default) {
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) str9)) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(str9);
                        if (!StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) str9, AbstractJsonLexerKt.END_OBJ, false, 2, (java.lang.Object) null)) {
                            sb.append(AbstractJsonLexerKt.END_OBJ);
                        }
                        arrayList5.add(sb.toString());
                    }
                }
                Unit unit5 = Unit.INSTANCE;
            }
            BigDecimal bigDecimalCopydefault3 = C33129mqd.copydefault(0);
            java.util.Iterator it5 = arrayList5.iterator();
            BigDecimal bigDecimalKWHzl = bigDecimalCopydefault3;
            while (it5.hasNext()) {
                Portfolio portfolio = (Portfolio) C33490mxT.EZpvd((java.lang.String) it5.next(), Portfolio.class);
                if (portfolio == null || (balance = portfolio.getBalance()) == null) {
                    balance = "0";
                }
                bigDecimalKWHzl = C54862xYb.KWHzl(bigDecimalKWHzl, balance);
            }
            ccs.AuCTel(C54862xYb.convertToString$default(bigDecimalKWHzl, false, null, null, 7, null));
        }
        java.lang.String totalAssetUpdateTime4 = walletViewForWalletManagement.getTotalAssetUpdateTime();
        if (totalAssetUpdateTime4 == null || totalAssetUpdateTime4.length() == 0 || ccs.zuWLRA()) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.String nftBeans = walletViewForWalletManagement.getNftBeans();
            if (nftBeans != null && (listSplit$default2 = StringsKt__StringsKt.split$default((java.lang.CharSequence) nftBeans, new java.lang.String[]{"}-"}, false, 0, 6, (java.lang.Object) null)) != null) {
                for (java.lang.String str10 : listSplit$default2) {
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) str10)) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(str10);
                        if (!StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) str10, AbstractJsonLexerKt.END_OBJ, false, 2, (java.lang.Object) null)) {
                            sb2.append(AbstractJsonLexerKt.END_OBJ);
                        }
                        arrayList6.add(sb2.toString());
                    }
                }
                Unit unit6 = Unit.INSTANCE;
            }
            BigDecimal bigDecimalCopydefault4 = C33129mqd.copydefault(0);
            java.util.Iterator it6 = arrayList6.iterator();
            BigDecimal bigDecimalKWHzl2 = bigDecimalCopydefault4;
            while (it6.hasNext()) {
                NftBean nftBean = (NftBean) C33490mxT.EZpvd((java.lang.String) it6.next(), NftBean.class);
                bigDecimalKWHzl2 = C54862xYb.KWHzl(bigDecimalKWHzl2, C54862xYb.OLrzqt(java.lang.Integer.valueOf((nftBean == null || (total = nftBean.getTotal()) == null) ? 0 : C33129mqd.AhwBna(total)), (nftBean == null || (floorSalePrice = nftBean.getFloorSalePrice()) == null || (usdPrice = floorSalePrice.getUsdPrice()) == null) ? 0 : usdPrice));
            }
            z = false;
            ccs.fJNWhG(C54862xYb.convertToString$default(bigDecimalKWHzl2, false, null, null, 7, null));
        } else {
            z = false;
        }
        if (ccs.QwvEab() == WalletType.HDWallet) {
            java.lang.String teeId = walletViewForWalletManagement.getTeeId();
            ccs.AwvSrB(teeId == null ? str2 : teeId);
            java.lang.String strDbNXlk = ccs.DbNXlk();
            java.lang.String strFHqPtx = ccs.fHqPtx();
            java.lang.Boolean boolIsTeeCreated = walletViewForWalletManagement.isTeeCreated();
            boolean zBooleanValue = boolIsTeeCreated != null ? boolIsTeeCreated.booleanValue() : z;
            java.lang.Boolean boolIsTeeActive = walletViewForWalletManagement.isTeeActive();
            boolean zBooleanValue2 = boolIsTeeActive != null ? boolIsTeeActive.booleanValue() : z;
            java.lang.Long teeExpiredTimestamp = walletViewForWalletManagement.getTeeExpiredTimestamp();
            TeeStatus teeStatus3 = new TeeStatus(zBooleanValue, zBooleanValue2, teeExpiredTimestamp != null ? teeExpiredTimestamp.longValue() : 0L, null, false, java.lang.Boolean.valueOf(C11600cUg.KWHzl(walletViewForWalletManagement.getAutoRenew())), java.lang.Integer.valueOf(walletViewForWalletManagement.getUpgradeStatus()), null, walletViewForWalletManagement.getModel(), CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA, null);
            java.lang.Boolean boolIsTeeVerify = walletViewForWalletManagement.isTeeVerify();
            SingleTeeStatus singleTeeStatus3 = new SingleTeeStatus(strDbNXlk, strFHqPtx, teeStatus3, new AddressVerifyStatus(boolIsTeeVerify != null ? boolIsTeeVerify.booleanValue() : z), null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
            java.lang.Boolean hasShowTeeExpiredAlert = walletViewForWalletManagement.getHasShowTeeExpiredAlert();
            teeStatus = null;
            singleTeeStatusAndWarringInfoEZpvd = InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).getFieldNames().EZpvd(ccs.DbNXlk(), new SingleTeeStatusAndWarringInfo(singleTeeStatus3, hasShowTeeExpiredAlert != null ? hasShowTeeExpiredAlert.booleanValue() : z, walletViewForWalletManagement.getTeeCreateAt(), walletViewForWalletManagement.getTeeUpdateAt(), walletViewForWalletManagement.getCanUseSa2()));
        } else {
            teeStatus = null;
            singleTeeStatusAndWarringInfoEZpvd = null;
        }
        ccs.OLrzqt(singleTeeStatusAndWarringInfoEZpvd);
        if (ccs.OJuSTm() != null && ccs.zuWLRA()) {
            SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfoOJuSTm = ccs.OJuSTm();
            dTH dthAEQbTJ = C17922fXg.AEQbTJ((singleTeeStatusAndWarringInfoOJuSTm == null || (singleTeeStatus2 = singleTeeStatusAndWarringInfoOJuSTm.getSingleTeeStatus()) == null) ? teeStatus : singleTeeStatus2.getTeeStatus(), ccs.DbNXlk());
            if (dthAEQbTJ != null) {
                ((dTP) C43251rlk.copydefault(dTP.class)).OLrzqt(dthAEQbTJ);
                Unit unit7 = Unit.INSTANCE;
            }
            SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfoOJuSTm2 = ccs.OJuSTm();
            if (singleTeeStatusAndWarringInfoOJuSTm2 != null && (singleTeeStatus = singleTeeStatusAndWarringInfoOJuSTm2.getSingleTeeStatus()) != null && (teeStatus2 = singleTeeStatus.getTeeStatus()) != null) {
                ((dTI) C43251rlk.copydefault(dTI.class)).copydefault(dTK.Companion.copydefault(teeStatus2.getModel(), ccs.DbNXlk()));
                Unit unit8 = Unit.INSTANCE;
            }
        }
        return ccs;
    }

    public final int KWHzl(boolean z, long j, int i) {
        C10854bwM c10854bwMKWHzl;
        if (z && (c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(j))) != null && c10854bwMKWHzl.AxsJAYaxsJAY()) {
            AddressType addressType = AddressType.P2SHType;
            if (i != addressType.getValue()) {
                addressType.getValue();
            }
        }
        return i;
    }

    public final AbstractC12784ctX KWHzl(cSX csx) {
        C13854daT c13854daT;
        java.lang.Object objM7377constructorimpl;
        cCD ccd = new cCD();
        ccd.AhwBna(csx.getNewProxyInstance());
        ccd.gEmmrt(csx.uzCIH());
        ccd.OLrzqt(csx.zLjUOn());
        ccd.OLrzqt(csx.KWHzl());
        ccd.KWHzl(csx.AhwBna());
        java.lang.String strFIwbmz = csx.fIwbmz();
        MpcWalletEncodeInfo mpcWalletEncodeInfo = null;
        mpcWalletEncodeInfo = null;
        if (strFIwbmz == null || strFIwbmz.length() == 0) {
            c13854daT = null;
        } else {
            java.lang.String strFIwbmz2 = csx.fIwbmz();
            java.lang.String str = strFIwbmz2 == null ? "" : strFIwbmz2;
            java.lang.String strEjfBZ = csx.ejfBZ();
            java.lang.String str2 = strEjfBZ == null ? "" : strEjfBZ;
            java.lang.String strAuCTel = csx.AuCTel();
            java.lang.String str3 = strAuCTel == null ? "" : strAuCTel;
            java.lang.String strFJNWhG = csx.fJNWhG();
            java.lang.String str4 = strFJNWhG == null ? "" : strFJNWhG;
            HardwareType.Application application = HardwareType.Companion;
            java.lang.Integer numFARcdN = csx.fARcdN();
            HardwareType hardwareTypeAEQbTJ = application.AEQbTJ(numFARcdN != null ? numFARcdN.intValue() : -1);
            java.lang.String newProxyInstance = csx.getNewProxyInstance();
            java.lang.Long lAkhnZx = csx.AkhnZx();
            long jLongValue = lAkhnZx != null ? lAkhnZx.longValue() : 0L;
            java.lang.String strIsConnected = csx.isConnected();
            c13854daT = new C13854daT(str, str2, str3, str4, hardwareTypeAEQbTJ, newProxyInstance, jLongValue, strIsConnected == null ? "" : strIsConnected);
        }
        ccd.copydefault(c13854daT);
        java.lang.Integer numZsXlph = csx.zsXlph();
        int iOrdinal = WalletType.MPCWallet.ordinal();
        if (numZsXlph != null && numZsXlph.intValue() == iOrdinal) {
            try {
                Result.Application application2 = Result.Companion;
                java.lang.Object objFromJson = new Gson().fromJson(csx.OLrzqt(), new StateListAnimator().getType());
                Intrinsics.checkNotNullExpressionValue(objFromJson, "");
                objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) objFromJson);
            } catch (java.lang.Throwable th) {
                Result.Application application3 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.util.List listAhwBna = (java.util.List) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            java.util.List list = listAhwBna;
            java.lang.String fieldNames = csx.getFieldNames();
            java.lang.String str5 = fieldNames == null ? "" : fieldNames;
            java.lang.String strHDKMBd = csx.hDKMBd();
            java.lang.String str6 = strHDKMBd == null ? "" : strHDKMBd;
            java.lang.String strWlaJM = csx.wlaJM();
            java.lang.String str7 = strWlaJM == null ? "" : strWlaJM;
            java.lang.Integer numAubY = csx.AubY();
            int iIntValue = numAubY != null ? numAubY.intValue() : MpcShare2Status.SHARE2_INVALID.getValue();
            java.lang.String strAuCTelauCTel = csx.AuCTelauCTel();
            java.lang.String str8 = strAuCTelauCTel == null ? "" : strAuCTelauCTel;
            java.lang.String strAEQbTJ = csx.AEQbTJ();
            java.lang.String str9 = strAEQbTJ == null ? "" : strAEQbTJ;
            java.lang.String strDjBIcL = csx.djBIcL();
            java.lang.String str10 = strDjBIcL == null ? "" : strDjBIcL;
            java.lang.String strValues = csx.values();
            java.lang.String str11 = strValues == null ? "" : strValues;
            java.lang.String strAYXKKw = csx.AYXKKw();
            java.lang.String str12 = strAYXKKw == null ? "" : strAYXKKw;
            java.lang.String strValueOf = csx.valueOf();
            java.lang.String str13 = strValueOf == null ? "" : strValueOf;
            java.lang.String strDbNXlk = csx.DbNXlk();
            java.lang.String str14 = strDbNXlk == null ? "" : strDbNXlk;
            java.lang.String strFetchVPNInfo = csx.fetchVPNInfo();
            java.lang.String str15 = strFetchVPNInfo == null ? "" : strFetchVPNInfo;
            java.lang.Integer numZuBGHE = csx.zuBGHE();
            int iIntValue2 = numZuBGHE != null ? numZuBGHE.intValue() : 0;
            java.lang.Long lIwGUEr = csx.iwGUEr();
            mpcWalletEncodeInfo = new MpcWalletEncodeInfo(str5, list, str6, str7, iIntValue, str8, str9, str10, str11, str12, str13, str14, str15, iIntValue2, lIwGUEr != null ? lIwGUEr.longValue() : 0L, csx.gEmmrt());
        }
        ccd.OLrzqt(mpcWalletEncodeInfo);
        return ccd;
    }

    public final AbstractC58260yxt<java.lang.Boolean> AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.gEmmrt(this.AEQbTJ, str, str2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Boolean gEmmrt(cQM cqm, java.lang.String str, java.lang.String str2) {
        return java.lang.Boolean.valueOf(C33129mqd.KWHzl((java.util.Collection) cqm.copydefault.copydefault(str, str2, WalletType.HardwareWallet.ordinal())));
    }

    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super java.util.List<java.lang.String>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new WalletRepository$fetchAllWalletIdList$2(this, null), continuation);
    }

    public final AbstractC58260yxt<java.lang.Integer> OLrzqt(@NotNull final java.lang.String str, final long j) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.valueOf(this.KWHzl, str, j);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Integer valueOf(cQM cqm, java.lang.String str, long j) {
        return java.lang.Integer.valueOf(cqm.copydefault.copydefault(str, j));
    }

    public final AbstractC58260yxt<java.util.List<cSX>> copydefault() {
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cSv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.fJNWhG(this.KWHzl);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List fJNWhG(cQM cqm) {
        return cqm.copydefault.AEQbTJ();
    }

    public final AbstractC58260yxt<java.util.List<cSX>> values(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cSH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.uzCIH(this.OLrzqt, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List uzCIH(cQM cqm, java.lang.String str) {
        return cqm.copydefault.KWHzl(str);
    }

    public final AbstractC58260yxt<java.util.List<WalletEntity>> KWHzl(@NotNull final java.lang.String str, final long j, final int i, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.copydefault(this.copydefault, str, j, i, str2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List copydefault(cQM cqm, java.lang.String str, long j, int i, java.lang.String str2) {
        return cqm.copydefault.AEQbTJ(str, j, i, str2);
    }

    public final AbstractC58260yxt<java.util.List<WalletEntity>> AEQbTJ(@NotNull final java.util.List<java.lang.Integer> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.fIwbmz(this.AEQbTJ, list);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List fIwbmz(cQM cqm, java.util.List list) {
        return cqm.copydefault.KWHzl((java.util.List<java.lang.Integer>) list);
    }

    public final java.lang.Object copydefault(@NotNull java.util.List<java.lang.Integer> list, @NotNull Continuation<? super java.util.List<WalletEntity>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new WalletRepository$getWalletByTypeSuspend$2(this, list, null), continuation);
    }

    public final AbstractC58260yxt<java.util.List<cSX>> EZpvd(@NotNull final java.util.List<java.lang.Integer> list, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cSE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.EZpvd(this.copydefault, list, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List EZpvd(cQM cqm, java.util.List list, java.lang.String str) {
        return cqm.copydefault.KWHzl((java.util.List<java.lang.Integer>) list, str);
    }

    public final AbstractC58260yxt<java.util.List<MPCWalletEntity>> valueOf(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.ejfBZ(this.OLrzqt, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List ejfBZ(cQM cqm, java.lang.String str) {
        return cqm.copydefault.EZpvd(str);
    }

    public final AbstractC58260yxt<java.util.List<cSX>> KWHzl(@NotNull final java.util.List<java.lang.Integer> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.fARcdN(this.EZpvd, list);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List fARcdN(cQM cqm, java.util.List list) {
        return cqm.copydefault.copydefault((java.util.List<java.lang.Integer>) list);
    }

    public final AbstractC58260yxt<java.util.List<WalletEntity>> djBIcL() {
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.getFieldNames(this.KWHzl);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List getFieldNames(cQM cqm) {
        return cqm.copydefault.KWHzl();
    }

    public final AbstractC58260yxt<java.util.List<cSX>> EZpvd(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, final int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cSG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.EZpvd(this.AEQbTJ, str, str2, i);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List EZpvd(cQM cqm, java.lang.String str, java.lang.String str2, int i) {
        return cqm.copydefault.copydefault(str, str2, i);
    }

    public final AbstractC58260yxt<java.util.List<java.lang.Long>> EZpvd(@NotNull java.util.List<ChainAddressEntity> list, @NotNull java.lang.String str, @NotNull java.util.List<C11283cIm> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return C11607cUn.valueOf(RxSingleKt.rxSingle$default(null, new WalletRepository$addChainAddresses$1(this, list, str, list2, null), 1, null));
    }

    public final AbstractC58260yxt<java.util.List<java.lang.Long>> OLrzqt(@NotNull final java.util.List<ChainAddressSegWitEntity> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cRC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQM.isConnected(this.copydefault, list);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List isConnected(cQM cqm, java.util.List list) {
        return cqm.copydefault.AEQbTJ((java.util.List<ChainAddressSegWitEntity>) list);
    }

    public final java.lang.Object EZpvd(int i, @NotNull Continuation<? super java.util.List<WalletEntity>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new WalletRepository$getWalletNotSyncSuspend$2(this, i, null), continuation);
    }

    public final java.lang.Object EZpvd(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.Map<java.lang.String, ? extends java.util.List<ChainAddressEntity>>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new WalletRepository$queryChainAddressesByWalletIdsSuspend$2(this, list, null), continuation);
    }

    public final java.lang.Object djBIcL(@NotNull java.util.List<WalletEntity> list, @NotNull Continuation<? super java.lang.Integer> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new WalletRepository$updateAllWalletsSuspend$2(this, list, null), continuation);
    }

    public final java.lang.Object EZpvd(@NotNull java.util.List<WalletEntity> list, @NotNull java.util.List<java.lang.String> list2, @NotNull Continuation<? super java.lang.Integer> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new WalletRepository$updateWalletsAndDeleteCreateData$2(this, list, list2, null), continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull java.util.List<WalletEntity> list, @NotNull java.util.List<SyncWalletReqNew> list2, @NotNull Continuation<? super java.lang.Integer> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new WalletRepository$updateWalletsAndDeleteSyncData$2(this, list, list2, null), continuation);
    }

    public final java.lang.Object AEQbTJ(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.Map<java.lang.String, ? extends java.util.List<MPCWalletEntity>>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new WalletRepository$getMpcInfoByRootWalletIdsSuspend$2(this, list, null), continuation);
    }

    public final java.lang.Object KWHzl(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.Map<java.lang.String, cSX>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new WalletRepository$getRootWalletsByIdsSuspend$2(this, list, null), continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.Map<java.lang.String, ? extends java.util.List<ChainAddressSegWitEntity>>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new WalletRepository$getWalletChainIdAllAddressByWalletIdsSuspend$2(this, list, null), continuation);
    }

    public final java.util.List<AbstractC12782ctV> KWHzl(java.util.List<C11571cTe> list, AbstractC12784ctX abstractC12784ctX) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(EZpvd((C11571cTe) it.next(), abstractC12784ctX));
        }
        return arrayList;
    }

    public final java.util.List<AbstractC12782ctV> copydefault(java.util.List<WalletViewForWalletManagement> list, AbstractC12784ctX abstractC12784ctX) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(OLrzqt((WalletViewForWalletManagement) it.next(), abstractC12784ctX));
        }
        return arrayList;
    }

    public final java.util.List<AbstractC12784ctX> EZpvd(java.util.List<cSX> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(KWHzl((cSX) it.next()));
        }
        return arrayList;
    }
}
