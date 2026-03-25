package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.defi.biz.constant.HardwareType;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.model.wallet.MpcWalletDecodeInfo;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import com.okinc.business.defi.biz.net.bean.AAGenerateReq;
import com.okinc.business.defi.biz.net.bean.AAGenerateRes;
import com.okinc.business.defi.biz.net.bean.AAOwnerRes;
import com.okinc.business.defi.biz.net.bean.AAStatus;
import com.okinc.business.defi.biz.net.bean.CheckMpcStatusRequestBody;
import com.okinc.business.defi.biz.net.bean.CheckMpcStatusResponse;
import com.okinc.business.defi.biz.net.bean.EoaAddress;
import com.okinc.business.defi.biz.net.bean.EoaWalletInfo;
import com.okinc.business.defi.biz.net.bean.MpcStatus;
import com.okinc.business.defi.wallet.bean.WalletCreatedData;
import com.okinc.business.defi.wallet.smart.AACreateUtils$addHDWalletAccount$1;
import com.okinc.business.defi.wallet.smart.AACreateUtils$addWalletAccount$1;
import com.okinc.business.defi.wallet.smart.AACreateUtils$addWalletAccount$3;
import com.okinc.business.defi.wallet.smart.AACreateUtils$createNormalOrTeeOrAAAccount$1$2;
import com.okinc.business.defi.wallet.smart.AACreateUtils$createNormalOrTeeOrAAAccount$1$3;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.hardware.api.keystone.KeystoneMultiAccount;
import com.okinc.wallet.hardware.api.ledger.model.BluetoothDeviceModel;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C11010bzJ;
import o.C12827cuN;
import o.C13092czN;
import o.C13754dXa;
import o.C14140dfo;
import o.C17671fNz;
import o.InterfaceC9738bbJ;
import o.fWX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fNC {
    public static final fNC OLrzqt = new fNC();
    public static final C13934dbu EZpvd = new C13934dbu();
    public static final java.util.HashMap<java.lang.String, AAStatus> copydefault = new java.util.HashMap<>();
    public static final java.lang.String AEQbTJ = "AACreateUtils";
    public static final int KWHzl = 8;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WalletType.values().length];
            try {
                iArr[WalletType.KeyWallet.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[WalletType.MPCWallet.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletType.HardwareWallet.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletType.HDWallet.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final AAStatus KWHzl(AAStatus aAStatus, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return aAStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.Boolean KWHzl(java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        return bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final AAOwnerRes OLrzqt(AAOwnerRes aAOwnerRes) {
        Intrinsics.checkNotNullParameter(aAOwnerRes, "");
        return aAOwnerRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.Boolean copydefault(java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        return bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashMap<java.lang.String, AAStatus> EZpvd() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return AEQbTJ;
    }

    private fNC() {
    }

    public static /* synthetic */ AbstractC58185ywX checkAAOwner$default(fNC fnc, java.lang.String str, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        return fnc.AEQbTJ(str, l);
    }

    public final AbstractC58185ywX<AAOwnerRes> AEQbTJ(java.lang.String str, java.lang.Long l) {
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(EZpvd.OLrzqt(str, l != null ? l.longValue() : -1L), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.fOL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fNC.OLrzqt((AAOwnerRes) obj);
            }
        };
        AbstractC58185ywX<AAOwnerRes> abstractC58185ywXAEQbTJ = abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.fOM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fNC.zuBGHE(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final AAOwnerRes zuBGHE(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AAOwnerRes) function1.invoke(obj);
    }

    public static final class ActionBar<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Integer.valueOf(((AbstractC12782ctV) t).finit()), java.lang.Integer.valueOf(((AbstractC12782ctV) t2).finit()));
        }
    }

    public final AbstractC58185ywX<AAGenerateRes> OLrzqt(java.lang.String str, long j) {
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(EZpvd.EZpvd(C56402yEa.EZpvd(new AAGenerateReq(str, j))), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.fOj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fNC.KWHzl((java.util.List) obj);
            }
        };
        AbstractC58185ywX<AAGenerateRes> abstractC58185ywXAEQbTJ = abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.fOi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fNC.giSNqX(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final AAGenerateRes giSNqX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AAGenerateRes) function1.invoke(obj);
    }

    public static final AAGenerateRes KWHzl(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        AAGenerateRes aAGenerateRes = (AAGenerateRes) CollectionsKt___CollectionsKt.firstOrNull(list);
        return aAGenerateRes == null ? new AAGenerateRes((java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, 15, (DefaultConstructorMarker) null) : aAGenerateRes;
    }

    public final AbstractC58185ywX<java.lang.Boolean> AEQbTJ(java.lang.String str, java.lang.String str2, final java.lang.String str3) {
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(EZpvd.EZpvd(str, str2, C56402yEa.EZpvd(new CheckMpcStatusRequestBody(str3))), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.fPa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fNC.KWHzl(str3, (java.util.List) obj);
            }
        };
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXAEQbTJ = abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.fOZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fNC.gGvvIC(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.lang.Boolean gGvvIC(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean KWHzl(java.lang.String str, java.util.List list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((CheckMpcStatusResponse) next).getMpcId(), (java.lang.Object) str)) {
                break;
            }
        }
        CheckMpcStatusResponse checkMpcStatusResponse = (CheckMpcStatusResponse) next;
        java.lang.Integer numValueOf = checkMpcStatusResponse != null ? java.lang.Integer.valueOf(checkMpcStatusResponse.getMpcStatus()) : null;
        return java.lang.Boolean.valueOf(numValueOf != null && numValueOf.intValue() == MpcStatus.Backuped.getValue());
    }

    /* JADX DEBUG: Type inference failed for r4v4. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.lang.Boolean> */
    public final AbstractC58185ywX<java.lang.Boolean> copydefault(java.lang.String str, final java.lang.String str2, final boolean z) {
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtOLrzqt;
        C12827cuN instance$default = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null);
        if (z) {
            abstractC58260yxtOLrzqt = instance$default.AhwBna(str);
        } else {
            abstractC58260yxtOLrzqt = instance$default.OLrzqt(str, WalletType.MPCWallet);
        }
        AbstractC58185ywX<java.lang.Integer> abstractC58185ywXEZpvd = abstractC58260yxtOLrzqt.EZpvd();
        final Function1 function1 = new Function1() { // from class: o.fNP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fNC.KWHzl(z, str2, (java.lang.Integer) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.fNQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fNC.iZzfmt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd iZzfmt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(boolean z, java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        int iIntValue = num.intValue() + 1;
        C10856bwO.copydefault(AEQbTJ, 0, "sync deriveIndex " + iIntValue + " isAADerived " + z);
        AbstractC58185ywX<ResponseData<Unit>> abstractC58185ywXAEQbTJ = EZpvd.AEQbTJ(str, iIntValue);
        final Function1 function1 = new Function1() { // from class: o.fNE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fNC.copydefault((ResponseData) obj);
            }
        };
        return abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.fNM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fNC.iRxXKY(function1, obj);
            }
        });
    }

    public static final java.lang.Boolean iRxXKY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static /* synthetic */ AbstractC58185ywX homeCheckAAOwnerDisable$default(fNC fnc, java.lang.String str, java.lang.String str2, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            l = null;
        }
        return fnc.KWHzl(str, str2, l);
    }

    public final AbstractC58185ywX<AAStatus> KWHzl(@NotNull java.lang.String str, @NotNull final java.lang.String str2, final java.lang.Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str, true);
        final Function1 function1 = new Function1() { // from class: o.fPg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fNC.copydefault(str2, l, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58260yxtOLrzqt.KWHzl(new InterfaceC58229yxO() { // from class: o.fPf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fNC.gasjUx(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.fPd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fNC.OLrzqt((kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<AAStatus> abstractC58185ywXCopydefault = abstractC58185ywXKWHzl.copydefault((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.fPh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fNC.gkJEwt(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    public static final InterfaceC60096zvd gasjUx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(java.lang.String str, java.lang.Long l, final AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if (abstractC12782ctV.getFieldNames()) {
            WalletType walletType = WalletType.MPCWallet;
            if ((abstractC12782ctV.AEQbTJ(walletType) && abstractC12782ctV.Dmq()) || !abstractC12782ctV.AEQbTJ(walletType)) {
                AbstractC58185ywX<AAOwnerRes> abstractC58185ywXAEQbTJ = OLrzqt.AEQbTJ(str, l);
                final Function1 function1 = new Function1() { // from class: o.fNW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return fNC.copydefault(abstractC12782ctV, (AAOwnerRes) obj);
                    }
                };
                return abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.fNZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return fNC.fvQaOB(function1, obj);
                    }
                });
            }
        }
        return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(abstractC12782ctV, new AAOwnerRes((java.lang.String) null, (java.lang.Integer) null, 3, (DefaultConstructorMarker) null)));
    }

    public static final kotlin.Pair fvQaOB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair copydefault(AbstractC12782ctV abstractC12782ctV, AAOwnerRes aAOwnerRes) {
        Intrinsics.checkNotNullParameter(aAOwnerRes, "");
        return C56390yDp.OLrzqt(abstractC12782ctV, aAOwnerRes);
    }

    public static final InterfaceC58261yxu gkJEwt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(kotlin.Pair pair) {
        final AAStatus aAStatus;
        Intrinsics.checkNotNullParameter(pair, "");
        java.lang.Object first = pair.getFirst();
        Intrinsics.checkNotNullExpressionValue(first, "");
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) first;
        java.lang.Object second = pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "");
        java.lang.Integer errorCode = ((AAOwnerRes) second).getErrorCode();
        if (errorCode != null && errorCode.intValue() == 210001) {
            aAStatus = AAStatus.OwnerAbnormal;
        } else if (errorCode != null && errorCode.intValue() == 210002) {
            aAStatus = AAStatus.ProxyAbnormal;
        } else {
            aAStatus = AAStatus.Normal;
        }
        copydefault.put(abstractC12782ctV.DbNXlk(), aAStatus);
        if (aAStatus == abstractC12782ctV.fFgQHt()) {
            return AbstractC58260yxt.copydefault(aAStatus);
        }
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = abstractC12782ctV.copydefault(aAStatus);
        final Function1 function1 = new Function1() { // from class: o.fOz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fNC.KWHzl(aAStatus, (java.lang.Integer) obj);
            }
        };
        return abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.fOB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fNC.AxsJAYaxsJAY(function1, obj);
            }
        });
    }

    public static final AAStatus AxsJAYaxsJAY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AAStatus) function1.invoke(obj);
    }

    public final java.util.List<AbstractC12782ctV> OLrzqt(AbstractC12784ctX abstractC12784ctX) {
        long jFetchVPNInfo;
        java.util.ArrayList arrayList;
        int i = Application.copydefault[abstractC12784ctX.fJNWhG().ordinal()];
        if (i == 1) {
            C10854bwM c10854bwMIsConnected = C10954byG.EZpvd.valueOf().isConnected();
            jFetchVPNInfo = c10854bwMIsConnected != null ? c10854bwMIsConnected.fetchVPNInfo() : -1L;
            java.util.List<AbstractC12782ctV> listFIwbmz = abstractC12784ctX.fIwbmz();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : listFIwbmz) {
                if (((AbstractC12782ctV) obj).QwvEab() == WalletType.AAWallet) {
                    arrayList2.add(obj);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ChainAddress chainAddress = (ChainAddress) CollectionsKt___CollectionsKt.firstOrNull(((AbstractC12782ctV) it.next()).valueOf());
                arrayList3.add(chainAddress != null ? chainAddress.getEoaAddress() : null);
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayList3) {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) obj2)) {
                    arrayList4.add(obj2);
                }
            }
            java.util.List<AbstractC12782ctV> listFIwbmz2 = abstractC12784ctX.fIwbmz();
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj3 : listFIwbmz2) {
                AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj3;
                java.lang.String strEZpvd = abstractC12782ctV.EZpvd(jFetchVPNInfo);
                if (abstractC12782ctV.QwvEab() == WalletType.KeyWallet && abstractC12782ctV.AuCTelauCTel() && C33129mqd.OLrzqt((java.lang.CharSequence) strEZpvd) && !arrayList4.contains(strEZpvd) && C17671fNz.TaskDescription.getInstance$default(C17671fNz.Companion, null, 1, null).EZpvd(strEZpvd)) {
                    arrayList.add(obj3);
                }
            }
        } else {
            if (i != 2) {
                if (i == 3) {
                    C10854bwM c10854bwMIsConnected2 = C10954byG.EZpvd.valueOf().isConnected();
                    jFetchVPNInfo = c10854bwMIsConnected2 != null ? c10854bwMIsConnected2.fetchVPNInfo() : -1L;
                    java.util.List<AbstractC12782ctV> listFIwbmz3 = abstractC12784ctX.fIwbmz();
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    for (java.lang.Object obj4 : listFIwbmz3) {
                        if (((AbstractC12782ctV) obj4).QwvEab() == WalletType.AAWallet) {
                            arrayList5.add(obj4);
                        }
                    }
                    java.util.ArrayList arrayList6 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList5, 10));
                    java.util.Iterator it2 = arrayList5.iterator();
                    while (it2.hasNext()) {
                        ChainAddress chainAddress2 = (ChainAddress) CollectionsKt___CollectionsKt.firstOrNull(((AbstractC12782ctV) it2.next()).valueOf());
                        arrayList6.add(chainAddress2 != null ? chainAddress2.getEoaAddress() : null);
                    }
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    for (java.lang.Object obj5 : arrayList6) {
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) obj5)) {
                            arrayList7.add(obj5);
                        }
                    }
                    java.util.List<AbstractC12782ctV> listFIwbmz4 = abstractC12784ctX.fIwbmz();
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    for (java.lang.Object obj6 : listFIwbmz4) {
                        AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) obj6;
                        java.lang.String strEZpvd2 = abstractC12782ctV2.EZpvd(jFetchVPNInfo);
                        if (abstractC12782ctV2.QwvEab() == WalletType.HardwareWallet && abstractC12782ctV2.AuCTelauCTel() && C33129mqd.OLrzqt((java.lang.CharSequence) strEZpvd2) && !arrayList7.contains(strEZpvd2) && abstractC12784ctX.uzCIH()) {
                            arrayList8.add(obj6);
                        }
                    }
                    return arrayList8;
                }
                return yDY.AhwBna();
            }
            C10854bwM c10854bwMIsConnected3 = C10954byG.EZpvd.valueOf().isConnected();
            jFetchVPNInfo = c10854bwMIsConnected3 != null ? c10854bwMIsConnected3.fetchVPNInfo() : -1L;
            java.util.List<AbstractC12782ctV> listFIwbmz5 = abstractC12784ctX.fIwbmz();
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            for (java.lang.Object obj7 : listFIwbmz5) {
                if (((AbstractC12782ctV) obj7).QwvEab() == WalletType.AAWallet) {
                    arrayList9.add(obj7);
                }
            }
            java.util.ArrayList arrayList10 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList9, 10));
            java.util.Iterator it3 = arrayList9.iterator();
            while (it3.hasNext()) {
                ChainAddress chainAddress3 = (ChainAddress) CollectionsKt___CollectionsKt.firstOrNull(((AbstractC12782ctV) it3.next()).valueOf());
                arrayList10.add(chainAddress3 != null ? chainAddress3.getEoaAddress() : null);
            }
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            for (java.lang.Object obj8 : arrayList10) {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) obj8)) {
                    arrayList11.add(obj8);
                }
            }
            java.util.List<AbstractC12782ctV> listFIwbmz6 = abstractC12784ctX.fIwbmz();
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj9 : listFIwbmz6) {
                AbstractC12782ctV abstractC12782ctV3 = (AbstractC12782ctV) obj9;
                java.lang.String strEZpvd3 = abstractC12782ctV3.EZpvd(jFetchVPNInfo);
                if (abstractC12782ctV3.QwvEab() == WalletType.MPCWallet && abstractC12782ctV3.ORxRYg() && (abstractC12782ctV3.Dmq() || !abstractC12782ctV3.zLjUOn())) {
                    if (!abstractC12782ctV3.DCUTEIdCUTEI() && C33129mqd.OLrzqt((java.lang.CharSequence) strEZpvd3) && !arrayList11.contains(strEZpvd3) && C17671fNz.TaskDescription.getInstance$default(C17671fNz.Companion, null, 1, null).EZpvd(strEZpvd3)) {
                        arrayList.add(obj9);
                    }
                }
            }
        }
        return arrayList;
    }

    public final AbstractC58185ywX<Triple<AAGenerateRes, MpcWalletDecodeInfo, java.lang.Boolean>> OLrzqt(java.lang.String str, final java.lang.String str2, java.lang.String str3, final java.lang.String str4, java.lang.String str5, final MpcWalletEncodeInfo mpcWalletEncodeInfo, long j, boolean z) {
        InterfaceC60096zvd interfaceC60096zvdAEQbTJ;
        AbstractC58185ywX<java.lang.String> abstractC58185ywXEZpvd = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).AhwBna(str4).EZpvd();
        AbstractC58185ywX<AAGenerateRes> abstractC58185ywXOLrzqt = OLrzqt(str5, j);
        if (z) {
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXAEQbTJ = AEQbTJ(str, str2, str3);
            final Function1 function1 = new Function1() { // from class: o.fOP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fNC.copydefault(str2, mpcWalletEncodeInfo, (java.lang.Boolean) obj);
                }
            };
            interfaceC60096zvdAEQbTJ = abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.fOO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return fNC.djSkpj(function1, obj);
                }
            });
        } else {
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXCopydefault = copydefault(str2, mpcWalletEncodeInfo.getMpcId(), true);
            final Function1 function12 = new Function1() { // from class: o.fOR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fNC.KWHzl((java.lang.Boolean) obj);
                }
            };
            interfaceC60096zvdAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.fOQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return fNC.finit(function12, obj);
                }
            });
        }
        final yHO yho = new yHO() { // from class: o.fOT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return fNC.OLrzqt(str4, mpcWalletEncodeInfo, (java.lang.String) obj, (AAGenerateRes) obj2, (java.lang.Boolean) obj3);
            }
        };
        AbstractC58185ywX<Triple<AAGenerateRes, MpcWalletDecodeInfo, java.lang.Boolean>> abstractC58185ywXEZpvd2 = AbstractC58185ywX.EZpvd(abstractC58185ywXEZpvd, abstractC58185ywXOLrzqt, interfaceC60096zvdAEQbTJ, new InterfaceC58228yxN() { // from class: o.fOU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58228yxN
            public final java.lang.Object AEQbTJ(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return fNC.EZpvd(yho, obj, obj2, obj3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd2, "");
        return abstractC58185ywXEZpvd2;
    }

    public static final InterfaceC60096zvd djSkpj(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(java.lang.String str, MpcWalletEncodeInfo mpcWalletEncodeInfo, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXCopydefault = OLrzqt.copydefault(str, mpcWalletEncodeInfo.getMpcId(), true);
            final Function1 function1 = new Function1() { // from class: o.fNX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fNC.copydefault((java.lang.Boolean) obj);
                }
            };
            return abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.fOl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return fNC.UeEOUB(function1, obj);
                }
            });
        }
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        if (!Intrinsics.EZpvd(bool, bool2)) {
            throw new NoWhenBranchMatchedException();
        }
        return AbstractC58185ywX.KWHzl(bool2);
    }

    public static final java.lang.Boolean UeEOUB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean finit(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final Triple EZpvd(yHO yho, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        return (Triple) yho.invoke(obj, obj2, obj3);
    }

    public static final Triple OLrzqt(java.lang.String str, MpcWalletEncodeInfo mpcWalletEncodeInfo, java.lang.String str2, AAGenerateRes aAGenerateRes, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(aAGenerateRes, "");
        Intrinsics.checkNotNullParameter(bool, "");
        return new Triple(aAGenerateRes, C10964byQ.OLrzqt(str, str2, mpcWalletEncodeInfo), bool);
    }

    public static /* synthetic */ InterfaceC58217yxC createMPCWalletAccount$default(fNC fnc, java.lang.String str, android.app.Activity activity, java.lang.String str2, boolean z, boolean z2, boolean z3, Function1 function1, int i, java.lang.Object obj) {
        return fnc.KWHzl(str, (i & 2) != 0 ? null : activity, str2, (i & 8) != 0 ? true : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? true : z3, function1);
    }

    public final InterfaceC58217yxC KWHzl(@NotNull final java.lang.String str, final android.app.Activity activity, @NotNull final java.lang.String str2, final boolean z, final boolean z2, final boolean z3, @NotNull final Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C12827cuN.Application application = C12827cuN.Companion;
        AbstractC58260yxt<AbstractC12784ctX> abstractC58260yxtGEmmrt = C12827cuN.Application.getInstance$default(application, null, 1, null).gEmmrt(str);
        AbstractC58260yxt<WalletEntity> abstractC58260yxtIsConnected = C12827cuN.Application.getInstance$default(application, null, 1, null).isConnected(str);
        final Function2 function2 = new Function2() { // from class: o.fNK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return fNC.KWHzl((AbstractC12784ctX) obj, (WalletEntity) obj2);
            }
        };
        AbstractC58185ywX abstractC58185ywXEZpvd = AbstractC58260yxt.OLrzqt(abstractC58260yxtGEmmrt, abstractC58260yxtIsConnected, new InterfaceC58223yxI() { // from class: o.fNJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return fNC.OLrzqt(function2, obj, obj2);
            }
        }).EZpvd();
        final Function1 function12 = new Function1() { // from class: o.fNG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fNC.EZpvd(z3, str, (Triple) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.fNH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fNC.QbewEr(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.fNI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fNC.OLrzqt(str, str2, z, z2, function1, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fNN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fNC.QVAiDq(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.fNL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fNC.AEQbTJ(activity, function1, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fNO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fNC.QUSxYX(function14, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        return interfaceC58217yxCAEQbTJ;
    }

    public static final Triple OLrzqt(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (Triple) function2.invoke(obj, obj2);
    }

    public static final Triple KWHzl(AbstractC12784ctX abstractC12784ctX, WalletEntity walletEntity) throws WalletImportError {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        Intrinsics.checkNotNullParameter(walletEntity, "");
        java.lang.String xpriv = walletEntity.getXpriv();
        MpcWalletEncodeInfo mpcWalletEncodeInfoIsConnected = abstractC12784ctX.isConnected();
        if (xpriv == null || xpriv.length() == 0 || mpcWalletEncodeInfoIsConnected == null) {
            C10856bwO.copydefault(AEQbTJ, -1, "mpc 创建 失败 xPrivate = " + (xpriv == null || xpriv.length() == 0) + " mpcShareEncodeInfo = " + (mpcWalletEncodeInfoIsConnected == null));
            throw WalletImportError.Companion.EZpvd(12);
        }
        return new Triple(xpriv, mpcWalletEncodeInfoIsConnected, walletEntity.getId());
    }

    public static final InterfaceC60096zvd QbewEr(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(boolean z, final java.lang.String str, Triple triple) {
        Intrinsics.checkNotNullParameter(triple, "");
        java.lang.String str2 = (java.lang.String) triple.getFirst();
        final MpcWalletEncodeInfo mpcWalletEncodeInfo = (MpcWalletEncodeInfo) triple.getSecond();
        java.lang.String str3 = (java.lang.String) triple.getThird();
        if (z) {
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXAEQbTJ = OLrzqt.AEQbTJ(str2, str3, mpcWalletEncodeInfo.getMpcId());
            final Function1 function1 = new Function1() { // from class: o.fPe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fNC.EZpvd(str, mpcWalletEncodeInfo, (java.lang.Boolean) obj);
                }
            };
            return abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.fPm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return fNC.RJOkX(function1, obj);
                }
            });
        }
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXCopydefault = OLrzqt.copydefault(str, mpcWalletEncodeInfo.getMpcId(), false);
        final Function1 function12 = new Function1() { // from class: o.fPi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fNC.AEQbTJ(mpcWalletEncodeInfo, (java.lang.Boolean) obj);
            }
        };
        return abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.fPk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fNC.QfsBiF(function12, obj);
            }
        });
    }

    public static final InterfaceC60096zvd RJOkX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(java.lang.String str, final MpcWalletEncodeInfo mpcWalletEncodeInfo, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXCopydefault = OLrzqt.copydefault(str, mpcWalletEncodeInfo.getMpcId(), false);
            final Function1 function1 = new Function1() { // from class: o.fNY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fNC.KWHzl(mpcWalletEncodeInfo, (java.lang.Boolean) obj);
                }
            };
            return abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.fNV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return fNC.OcIXYQ(function1, obj);
                }
            });
        }
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        if (!Intrinsics.EZpvd(bool, bool2)) {
            throw new NoWhenBranchMatchedException();
        }
        return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(bool2, mpcWalletEncodeInfo));
    }

    public static final kotlin.Pair OcIXYQ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair KWHzl(MpcWalletEncodeInfo mpcWalletEncodeInfo, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        return C56390yDp.OLrzqt(bool, mpcWalletEncodeInfo);
    }

    public static final kotlin.Pair QfsBiF(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair AEQbTJ(MpcWalletEncodeInfo mpcWalletEncodeInfo, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        return C56390yDp.OLrzqt(bool, mpcWalletEncodeInfo);
    }

    public static final void QVAiDq(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, boolean z, boolean z2, final Function1 function1, kotlin.Pair pair) {
        java.lang.Object first = pair.getFirst();
        Intrinsics.checkNotNullExpressionValue(first, "");
        boolean zBooleanValue = ((java.lang.Boolean) first).booleanValue();
        MpcWalletEncodeInfo mpcWalletEncodeInfo = (MpcWalletEncodeInfo) pair.getSecond();
        if (zBooleanValue) {
            C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null).copydefault(str, str2, (androidx.fragment.app.FragmentManager) null, z, z2, mpcWalletEncodeInfo, new Function1() { // from class: o.fOm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fNC.AEQbTJ(function1, (AbstractC12782ctV) obj);
                }
            });
            return Unit.INSTANCE;
        }
        C55326xho.toast$default(C13754dXa.FragmentManager.performMenuItemShortcut, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        function1.invoke(null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Function1 function1, AbstractC12782ctV abstractC12782ctV) {
        function1.invoke(abstractC12782ctV);
        return Unit.INSTANCE;
    }

    public static final void QUSxYX(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(android.app.Activity activity, Function1 function1, java.lang.Throwable th) {
        if (th instanceof OKServerException) {
            if (((OKServerException) th).getCode() == 160004) {
                C55326xho.toast$default(C13754dXa.FragmentManager.performMenuItemShortcut, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            } else {
                C55326xho.toast$default(C13754dXa.FragmentManager.registerCallbackMessenger, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
        }
        if (activity == null) {
            function1.invoke(null);
        } else {
            AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
            if (abstractActivityC33041mov != null) {
                abstractActivityC33041mov.dismissLoadingWithLogo();
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ InterfaceC58217yxC createMpcSmartAccount$default(fNC fnc, android.app.Activity activity, InterfaceC14457dln interfaceC14457dln, java.lang.String str, java.lang.String str2, long j, boolean z, boolean z2, boolean z3, Function1 function1, int i, java.lang.Object obj) {
        long jFetchVPNInfo;
        InterfaceC14457dln interfaceC14457dln2 = (i & 2) != 0 ? null : interfaceC14457dln;
        if ((i & 16) != 0) {
            C10854bwM c10854bwMIsConnected = C10954byG.EZpvd.valueOf().isConnected();
            jFetchVPNInfo = c10854bwMIsConnected != null ? c10854bwMIsConnected.fetchVPNInfo() : -1L;
        } else {
            jFetchVPNInfo = j;
        }
        return fnc.AEQbTJ(activity, interfaceC14457dln2, str, str2, jFetchVPNInfo, (i & 32) != 0 ? true : z, (i & 64) != 0 ? true : z2, (i & 128) != 0 ? true : z3, function1);
    }

    public final InterfaceC58217yxC AEQbTJ(final android.app.Activity activity, final InterfaceC14457dln interfaceC14457dln, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, final long j, final boolean z, final boolean z2, final boolean z3, @NotNull final Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            abstractActivityC33041mov.showLoadingWithLogo();
        }
        AbstractC58185ywX<Triple<EoaAddress, MpcWalletEncodeInfo, java.lang.String>> abstractC58185ywXEZpvd = KWHzl(str).EZpvd();
        final Function1 function12 = new Function1() { // from class: o.fOp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fNC.EZpvd(str, str2, j, z, (Triple) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.fOI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fNC.RcXXUw(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.fOS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fNC.EZpvd(function1, str2, str, interfaceC14457dln, z2, z3, activity, (Triple) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fPb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fNC.aKErDB(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.fPl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fNC.valueOf(activity, function1, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58227yxM<? super R>) interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fNF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fNC.dNCPSb(function14, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        return interfaceC58217yxCAEQbTJ;
    }

    public static final InterfaceC60096zvd RcXXUw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(java.lang.String str, java.lang.String str2, long j, boolean z, Triple triple) {
        Intrinsics.checkNotNullParameter(triple, "");
        EoaAddress eoaAddress = (EoaAddress) triple.getFirst();
        MpcWalletEncodeInfo mpcWalletEncodeInfo = (MpcWalletEncodeInfo) triple.getSecond();
        return OLrzqt.OLrzqt((java.lang.String) triple.getThird(), str, mpcWalletEncodeInfo.getMpcId(), str2, eoaAddress.getEoaAddress(), mpcWalletEncodeInfo, j, z);
    }

    public static final void aKErDB(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(final Function1 function1, java.lang.String str, java.lang.String str2, InterfaceC14457dln interfaceC14457dln, boolean z, boolean z2, final android.app.Activity activity, Triple triple) {
        java.lang.String proxyAddress;
        AAGenerateRes aAGenerateRes = (AAGenerateRes) triple.getFirst();
        MpcWalletDecodeInfo mpcWalletDecodeInfo = (MpcWalletDecodeInfo) triple.getSecond();
        if (!((java.lang.Boolean) triple.getThird()).booleanValue()) {
            C55326xho.toast$default(C13754dXa.FragmentManager.performMenuItemShortcut, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            function1.invoke(null);
            return Unit.INSTANCE;
        }
        java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) C10964byQ.OLrzqt(mpcWalletDecodeInfo.getEcdsaShare2())).toString();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) string) && !string.contentEquals(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) mpcWalletDecodeInfo.getEcdsaChainCode()).toString())) {
            C55326xho.toast$default(C13754dXa.FragmentManager.performMenuItemShortcut, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            function1.invoke(null);
            return Unit.INSTANCE;
        }
        C14140dfo instance$default = C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null);
        java.lang.String eoaAddress = aAGenerateRes.getEoaAddress();
        if (eoaAddress == null) {
            return Unit.INSTANCE;
        }
        WalletType walletType = WalletType.MPCWallet;
        java.lang.String aaAddress = aAGenerateRes.getAaAddress();
        if (aaAddress != null && (proxyAddress = aAGenerateRes.getProxyAddress()) != null) {
            instance$default.OLrzqt(str, str2, (androidx.fragment.app.FragmentManager) null, interfaceC14457dln, mpcWalletDecodeInfo, eoaAddress, walletType, aaAddress, proxyAddress, z, z2, new Function1() { // from class: o.fOa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fNC.EZpvd(activity, function1, (AbstractC12782ctV) obj);
                }
            });
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(android.app.Activity activity, Function1 function1, AbstractC12782ctV abstractC12782ctV) {
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            abstractActivityC33041mov.dismissLoadingWithLogo();
        }
        function1.invoke(abstractC12782ctV);
        return Unit.INSTANCE;
    }

    public static final void dNCPSb(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit valueOf(android.app.Activity activity, Function1 function1, java.lang.Throwable th) {
        if (th instanceof OKServerException) {
            if (((OKServerException) th).getCode() == 160004) {
                C55326xho.toast$default(C13754dXa.FragmentManager.performMenuItemShortcut, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            } else {
                C55326xho.toast$default(C13754dXa.FragmentManager.registerCallbackMessenger, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
        }
        if (activity == null) {
            function1.invoke(null);
        } else {
            AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
            if (abstractActivityC33041mov != null) {
                abstractActivityC33041mov.dismissLoadingWithLogo();
            }
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(androidx.fragment.app.FragmentManager fragmentManager, final android.app.Activity activity, final AbstractC12784ctX abstractC12784ctX, final Function1<? super AbstractC12782ctV, Unit> function1) {
        java.lang.Object next;
        final java.lang.String strRlQdEF;
        final Function1 function12 = new Function1() { // from class: o.fOE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fNC.AYXKKw(activity, function1, (AbstractC12782ctV) obj);
            }
        };
        final java.util.List<AbstractC12782ctV> listOLrzqt = OLrzqt(abstractC12784ctX);
        C10954byG c10954byG = C10954byG.EZpvd;
        C10854bwM c10854bwMIsConnected = c10954byG.valueOf().isConnected();
        long jFetchVPNInfo = c10854bwMIsConnected != null ? c10854bwMIsConnected.fetchVPNInfo() : -1L;
        C10854bwM c10854bwMIsConnected2 = c10954byG.valueOf().isConnected();
        final long jAEQbTJ = c10854bwMIsConnected2 != null ? c10854bwMIsConnected2.AEQbTJ() : -1L;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        for (AbstractC12782ctV abstractC12782ctV : listOLrzqt) {
            arrayList.add(new EoaWalletInfo(WalletType.KeyWallet, abstractC12782ctV.EZpvd(jFetchVPNInfo), abstractC12782ctV.DbNXlk(), abstractC12782ctV.EZpvd(jFetchVPNInfo), false, 16, null));
        }
        if (arrayList.size() > 1) {
            final long j = jFetchVPNInfo;
            fPX.Companion.EZpvd(new java.util.ArrayList<>(arrayList), new yHO() { // from class: o.fOF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return fNC.OLrzqt(listOLrzqt, activity, abstractC12784ctX, j, jAEQbTJ, function12, (java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3);
                }
            }).show(fragmentManager, "WalletAddSmartSelectEOAFragment");
            return;
        }
        final EoaWalletInfo eoaWalletInfo = (EoaWalletInfo) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        if (eoaWalletInfo == null) {
            return;
        }
        java.util.Iterator<T> it = listOLrzqt.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((AbstractC12782ctV) next).DbNXlk(), (java.lang.Object) eoaWalletInfo.getWalletId())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) next;
        if (abstractC12782ctV2 == null || (strRlQdEF = abstractC12782ctV2.RlQdEF()) == null) {
            return;
        }
        final long j2 = jFetchVPNInfo;
        new C14469dlz(fragmentManager, activity, null, null, new Function1() { // from class: o.fOK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fNC.copydefault(activity, abstractC12784ctX, eoaWalletInfo, strRlQdEF, j2, jAEQbTJ, function12, (java.lang.String) obj);
            }
        }, null, null, null, 232, null).EZpvd();
    }

    public static final Unit AYXKKw(android.app.Activity activity, Function1 function1, AbstractC12782ctV abstractC12782ctV) {
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            abstractActivityC33041mov.dismissLoadingWithLogo();
        }
        function1.invoke(abstractC12782ctV);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.util.List list, android.app.Activity activity, AbstractC12784ctX abstractC12784ctX, long j, long j2, Function1 function1, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.Object next;
        java.lang.String strRlQdEF;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((AbstractC12782ctV) next).DbNXlk(), (java.lang.Object) str2)) {
                break;
            }
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) next;
        if (abstractC12782ctV == null || (strRlQdEF = abstractC12782ctV.RlQdEF()) == null) {
            return Unit.INSTANCE;
        }
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            abstractActivityC33041mov.showLoadingWithLogo();
        }
        createPrivateKeySmartAccount$default(OLrzqt, null, activity, null, abstractC12784ctX.EZpvd(), str3, str, strRlQdEF, j, j2, WalletType.KeyWallet, function1, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(android.app.Activity activity, AbstractC12784ctX abstractC12784ctX, EoaWalletInfo eoaWalletInfo, java.lang.String str, long j, long j2, Function1 function1, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            abstractActivityC33041mov.showLoadingWithLogo();
        }
        createPrivateKeySmartAccount$default(OLrzqt, null, activity, null, abstractC12784ctX.EZpvd(), str2, eoaWalletInfo.getEoaAddress(), str, j, j2, WalletType.KeyWallet, function1, 4, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void createPrivateKeySmartAccount$default(fNC fnc, androidx.fragment.app.FragmentManager fragmentManager, android.app.Activity activity, InterfaceC14457dln interfaceC14457dln, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, long j2, WalletType walletType, Function1 function1, int i, java.lang.Object obj) {
        fnc.OLrzqt(fragmentManager, activity, (i & 4) != 0 ? null : interfaceC14457dln, str, str2, str3, str4, j, j2, walletType, function1);
    }

    public static final void dxcTrN(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void OLrzqt(final androidx.fragment.app.FragmentManager fragmentManager, @NotNull final android.app.Activity activity, final InterfaceC14457dln interfaceC14457dln, @NotNull java.lang.String str, @NotNull final java.lang.String str2, @NotNull java.lang.String str3, @NotNull final java.lang.String str4, long j, final long j2, @NotNull final WalletType walletType, @NotNull final Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(walletType, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractC58185ywX<AAGenerateRes> abstractC58185ywXOLrzqt = OLrzqt(str3, j);
        final Function1 function12 = new Function1() { // from class: o.fOt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fNC.AEQbTJ(str2, fragmentManager, interfaceC14457dln, j2, str4, walletType, function1, (AAGenerateRes) obj);
            }
        };
        InterfaceC58227yxM<? super AAGenerateRes> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fOs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fNC.dxcTrN(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.fOr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fNC.KWHzl(activity, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fOv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fNC.fZBcTu(function13, obj);
            }
        });
    }

    public static final Unit AEQbTJ(java.lang.String str, androidx.fragment.app.FragmentManager fragmentManager, InterfaceC14457dln interfaceC14457dln, long j, java.lang.String str2, WalletType walletType, Function1 function1, AAGenerateRes aAGenerateRes) {
        java.lang.String aaAddress;
        java.lang.String proxyAddress;
        C14140dfo instance$default = C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null);
        java.lang.String eoaAddress = aAGenerateRes.getEoaAddress();
        if (eoaAddress != null && (aaAddress = aAGenerateRes.getAaAddress()) != null && (proxyAddress = aAGenerateRes.getProxyAddress()) != null) {
            instance$default.copydefault(str, fragmentManager, interfaceC14457dln, j, str2, eoaAddress, walletType, aaAddress, proxyAddress, function1);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final void fZBcTu(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(android.app.Activity activity, java.lang.Throwable th) {
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            abstractActivityC33041mov.dismissLoadingWithLogo();
        }
        fPH.OLrzqt.copydefault(activity, new yHO() { // from class: o.fOb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return fNC.gEmmrt(((java.lang.Integer) obj).intValue(), (android.view.View) obj2, (ViewOnClickListenerC54939xaY) obj3);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(int i, android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(FragmentActivity fragmentActivity, int i, WalletType walletType, java.lang.String str, final Function1 function1, java.lang.String str2, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        final DialogC55112xdm dialogC55112xdm = new DialogC55112xdm(fragmentActivity, C13754dXa.LoaderManager.isConnected);
        dialogC55112xdm.show();
        if (i == 1) {
            int i2 = Application.copydefault[walletType.ordinal()];
            if (i2 == 2) {
                createMPCWalletAccount$default(OLrzqt, str, fragmentActivity, str3, false, false, false, new Function1() { // from class: o.fOD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return fNC.KWHzl(dialogC55112xdm, function1, (AbstractC12782ctV) obj);
                    }
                }, 56, null);
            } else if (i2 == 4) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new AACreateUtils$createNormalOrTeeOrAAAccount$1$2(fragmentActivity, str, str3, dialogC55112xdm, function1, null), 3, null);
            } else {
                dialogC55112xdm.dismiss();
                Unit unit = Unit.INSTANCE;
            }
        } else if (i == 2) {
            int i3 = Application.copydefault[walletType.ordinal()];
            if (i3 == 2) {
                C10854bwM c10854bwMIsConnected = C10954byG.EZpvd.valueOf().isConnected();
                createMpcSmartAccount$default(OLrzqt, fragmentActivity, null, str, str3, c10854bwMIsConnected != null ? c10854bwMIsConnected.fetchVPNInfo() : -1L, false, false, false, new Function1() { // from class: o.fOH
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return fNC.AEQbTJ(dialogC55112xdm, function1, (AbstractC12782ctV) obj);
                    }
                }, 226, null);
            } else if (i3 == 4) {
                createHDSmartAccount$default(OLrzqt, fragmentActivity, null, str, str3, WalletType.HDWallet, new Function1() { // from class: o.fOG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return fNC.AhwBna(dialogC55112xdm, function1, (AbstractC12782ctV) obj);
                    }
                }, 2, null);
            } else {
                dialogC55112xdm.dismiss();
            }
        } else if (i == 3) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new AACreateUtils$createNormalOrTeeOrAAAccount$1$3(fragmentActivity, str, str3, dialogC55112xdm, str2, fragmentManager, function1, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(DialogC55112xdm dialogC55112xdm, Function1 function1, AbstractC12782ctV abstractC12782ctV) {
        dialogC55112xdm.dismiss();
        function1.invoke(abstractC12782ctV != null ? C13788dYh.copydefault(abstractC12782ctV) : null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(DialogC55112xdm dialogC55112xdm, Function1 function1, AbstractC12782ctV abstractC12782ctV) {
        dialogC55112xdm.dismiss();
        function1.invoke(abstractC12782ctV != null ? C13788dYh.copydefault(abstractC12782ctV) : null);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(DialogC55112xdm dialogC55112xdm, Function1 function1, AbstractC12782ctV abstractC12782ctV) {
        dialogC55112xdm.dismiss();
        function1.invoke(abstractC12782ctV != null ? C13788dYh.copydefault(abstractC12782ctV) : null);
        return Unit.INSTANCE;
    }

    public final void copydefault(final androidx.fragment.app.FragmentManager fragmentManager, final FragmentActivity fragmentActivity, final int i, final WalletType walletType, final java.lang.String str, final java.lang.String str2, final Function1<? super WalletCreatedData, Unit> function1) {
        new C14469dlz(fragmentManager, fragmentActivity, null, null, new Function1() { // from class: o.fOq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fNC.AEQbTJ(fragmentActivity, i, walletType, str, function1, str2, fragmentManager, (java.lang.String) obj);
            }
        }, null, null, null, 232, null).EZpvd();
    }

    public final AbstractC58260yxt<Triple<EoaAddress, MpcWalletEncodeInfo, java.lang.String>> KWHzl(java.lang.String str) {
        C12827cuN.Application application = C12827cuN.Companion;
        AbstractC58260yxt<AbstractC12784ctX> abstractC58260yxtGEmmrt = C12827cuN.Application.getInstance$default(application, null, 1, null).gEmmrt(str);
        AbstractC58260yxt<WalletEntity> abstractC58260yxtIsConnected = C12827cuN.Application.getInstance$default(application, null, 1, null).isConnected(str);
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtAhwBna = C12827cuN.Application.getInstance$default(application, null, 1, null).AhwBna(str);
        final yHO yho = new yHO() { // from class: o.fOV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return fNC.KWHzl((AbstractC12784ctX) obj, (WalletEntity) obj2, (java.lang.Integer) obj3);
            }
        };
        AbstractC58260yxt abstractC58260yxtAEQbTJ = AbstractC58260yxt.AEQbTJ(abstractC58260yxtGEmmrt, abstractC58260yxtIsConnected, abstractC58260yxtAhwBna, new InterfaceC58228yxN() { // from class: o.fOW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58228yxN
            public final java.lang.Object AEQbTJ(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return fNC.OLrzqt(yho, obj, obj2, obj3);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.fOX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fNC.copydefault((java.util.HashMap) obj);
            }
        };
        AbstractC58260yxt<Triple<EoaAddress, MpcWalletEncodeInfo, java.lang.String>> abstractC58260yxtOLrzqt = abstractC58260yxtAEQbTJ.OLrzqt(new InterfaceC58229yxO() { // from class: o.fPc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fNC.fFgQHt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final java.util.HashMap OLrzqt(yHO yho, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        return (java.util.HashMap) yho.invoke(obj, obj2, obj3);
    }

    public static final java.util.HashMap KWHzl(AbstractC12784ctX abstractC12784ctX, WalletEntity walletEntity, java.lang.Integer num) throws WalletImportError {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        Intrinsics.checkNotNullParameter(walletEntity, "");
        Intrinsics.checkNotNullParameter(num, "");
        int iIntValue = num.intValue();
        if (abstractC12784ctX.isConnected() == null) {
            C10856bwO.copydefault("AACreateUtils", 0, "MPC AA wallet Data error 21.");
            throw WalletImportError.Activity.dataError$default(WalletImportError.Companion, null, 2, 1, null);
        }
        return C56424yEw.AYXKKw(C56390yDp.OLrzqt("mpcShareInfo", abstractC12784ctX.isConnected()), C56390yDp.OLrzqt("addressIndex", java.lang.Integer.valueOf(iIntValue + 1)), C56390yDp.OLrzqt("xpriv", walletEntity.getXpriv()));
    }

    public static final InterfaceC58261yxu fFgQHt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(java.util.HashMap map) throws WalletImportError {
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.Object obj = map.get("mpcShareInfo");
        final MpcWalletEncodeInfo mpcWalletEncodeInfo = obj instanceof MpcWalletEncodeInfo ? (MpcWalletEncodeInfo) obj : null;
        if (mpcWalletEncodeInfo == null) {
            mpcWalletEncodeInfo = null;
        }
        java.lang.Object obj2 = map.get("addressIndex");
        java.lang.Integer num = obj2 instanceof java.lang.Integer ? (java.lang.Integer) obj2 : null;
        if (num == null) {
            num = null;
        }
        java.lang.Object obj3 = map.get("xpriv");
        final java.lang.String str = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        if (str == null) {
            str = null;
        }
        if (mpcWalletEncodeInfo == null || str == null || str.length() == 0 || num == null) {
            C10856bwO.copydefault("AACreateUtils", 0, "MPC AA wallet Data error 11.");
            throw WalletImportError.Companion.EZpvd(1);
        }
        C10854bwM c10854bwMIsConnected = C10954byG.EZpvd.valueOf().isConnected();
        AbstractC58260yxt<EoaAddress> abstractC58260yxtOLrzqt = C13092czN.Activity.getInstance$default(C13092czN.Companion, null, 1, null).OLrzqt(mpcWalletEncodeInfo, num.intValue(), c10854bwMIsConnected != null ? c10854bwMIsConnected.fetchVPNInfo() : -1L);
        final Function1 function1 = new Function1() { // from class: o.fOx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj4) {
                return fNC.copydefault(mpcWalletEncodeInfo, str, (EoaAddress) obj4);
            }
        };
        return abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.fOu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj4) {
                return fNC.dvKsVJ(function1, obj4);
            }
        });
    }

    public static final Triple dvKsVJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Triple) function1.invoke(obj);
    }

    public static final Triple copydefault(MpcWalletEncodeInfo mpcWalletEncodeInfo, java.lang.String str, EoaAddress eoaAddress) {
        Intrinsics.checkNotNullParameter(eoaAddress, "");
        return new Triple(eoaAddress, mpcWalletEncodeInfo, str);
    }

    public static /* synthetic */ void createHDSmartAccount$default(fNC fnc, android.app.Activity activity, InterfaceC14457dln interfaceC14457dln, java.lang.String str, java.lang.String str2, WalletType walletType, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            interfaceC14457dln = null;
        }
        fnc.copydefault(activity, interfaceC14457dln, str, str2, walletType, function1);
    }

    public final void copydefault(final android.app.Activity activity, final InterfaceC14457dln interfaceC14457dln, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final WalletType walletType, @NotNull final Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(walletType, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractC58185ywX<kotlin.Pair<java.lang.Integer, EoaAddress>> abstractC58185ywXEZpvd = OLrzqt(str).EZpvd();
        final Function1 function12 = new Function1() { // from class: o.fOh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fNC.copydefault((kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.fOf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fNC.AxsJAY(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.fOg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fNC.EZpvd(function1, str, str2, interfaceC14457dln, walletType, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fOk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fNC.QKVWgx(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.fOn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fNC.KWHzl(activity, function1, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58227yxM<? super R>) interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fOo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fNC.ORxRYg(function14, obj);
            }
        });
    }

    public static final InterfaceC60096zvd AxsJAY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(final kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        AbstractC58185ywX<AAGenerateRes> abstractC58185ywXOLrzqt = OLrzqt.OLrzqt(((EoaAddress) pair.getSecond()).getEoaAddress(), ((EoaAddress) pair.getSecond()).getChainId());
        final Function1 function1 = new Function1() { // from class: o.fOe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fNC.copydefault(pair, (AAGenerateRes) obj);
            }
        };
        return abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.fOc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fNC.gHZMYf(function1, obj);
            }
        });
    }

    public static final kotlin.Pair gHZMYf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair copydefault(kotlin.Pair pair, AAGenerateRes aAGenerateRes) {
        Intrinsics.checkNotNullParameter(aAGenerateRes, "");
        return C56390yDp.OLrzqt(pair.getFirst(), aAGenerateRes);
    }

    public static final void QKVWgx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(Function1 function1, java.lang.String str, java.lang.String str2, InterfaceC14457dln interfaceC14457dln, WalletType walletType, kotlin.Pair pair) {
        int iIntValue = ((java.lang.Number) pair.getFirst()).intValue();
        java.lang.Object second = pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "");
        AAGenerateRes aAGenerateRes = (AAGenerateRes) second;
        if (aAGenerateRes.getEoaAddress() == null || aAGenerateRes.getAaAddress() == null || aAGenerateRes.getProxyAddress() == null) {
            function1.invoke(null);
            return Unit.INSTANCE;
        }
        C14140dfo.createHDSmartAccount$default(C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null), str, str2, null, interfaceC14457dln, aAGenerateRes.getEoaAddress(), walletType, aAGenerateRes.getAaAddress(), aAGenerateRes.getProxyAddress(), iIntValue, false, false, function1, 1536, null);
        return Unit.INSTANCE;
    }

    public static final void ORxRYg(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(android.app.Activity activity, Function1 function1, java.lang.Throwable th) {
        pUU.copydefault("AACreateUtils", "createHDSmartAccount error = " + th.getMessage());
        if (activity != null) {
            AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
            if (abstractActivityC33041mov != null) {
                abstractActivityC33041mov.dismissLoadingWithLogo();
            }
            fPH.OLrzqt.copydefault(activity, new yHO() { // from class: o.fNT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return fNC.OLrzqt(((java.lang.Integer) obj).intValue(), (android.view.View) obj2, (ViewOnClickListenerC54939xaY) obj3);
                }
            });
        } else {
            function1.invoke(null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(int i, android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        return Unit.INSTANCE;
    }

    public static final kotlin.Pair flVtFt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<kotlin.Pair<java.lang.Integer, com.okinc.business.defi.biz.net.bean.EoaAddress>> */
    public final AbstractC58260yxt<kotlin.Pair<java.lang.Integer, EoaAddress>> OLrzqt(java.lang.String str) {
        AbstractC58260yxt<AbstractC12784ctX> abstractC58260yxtDjBIcL = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).djBIcL(str);
        final Function1 function1 = new Function1() { // from class: o.fON
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fNC.AEQbTJ((AbstractC12784ctX) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtDjBIcL.copydefault(new InterfaceC58229yxO() { // from class: o.fOJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fNC.flVtFt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final kotlin.Pair AEQbTJ(AbstractC12784ctX abstractC12784ctX) throws WalletImportError {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        C10854bwM c10854bwMIsConnected = C10954byG.EZpvd.valueOf().isConnected();
        long jFetchVPNInfo = c10854bwMIsConnected != null ? c10854bwMIsConnected.fetchVPNInfo() : -1L;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap map = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (AbstractC12782ctV abstractC12782ctV : CollectionsKt___CollectionsKt.EZpvd(abstractC12784ctX.KWHzl(), new ActionBar())) {
            ChainAddress chainAddress = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(abstractC12782ctV, jFetchVPNInfo, null, 2, null);
            if (chainAddress != null) {
                if (abstractC12782ctV.getFieldNames()) {
                    hashSet.add(chainAddress.getEoaAddress());
                } else {
                    arrayList.add(chainAddress.getAddress());
                    map.put(chainAddress.getAddress(), java.lang.Integer.valueOf(abstractC12782ctV.finit()));
                }
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = "";
                break;
            }
            java.lang.String str2 = (java.lang.String) it.next();
            if (C17671fNz.TaskDescription.getInstance$default(C17671fNz.Companion, null, 1, null).EZpvd(str2) && !hashSet.contains(str2)) {
                str = str2;
                break;
            }
        }
        java.lang.Integer num = (java.lang.Integer) map.get(str);
        if (num == null) {
            throw WalletImportError.Companion.copydefault();
        }
        num.intValue();
        java.lang.Object obj = map.get(str);
        Intrinsics.copydefault(obj);
        return new kotlin.Pair(obj, new EoaAddress(str, jFetchVPNInfo, "", 0, 8, (DefaultConstructorMarker) null));
    }

    public final void EZpvd(@NotNull final androidx.fragment.app.FragmentManager fragmentManager, @NotNull final android.app.Activity activity, @NotNull final AbstractC12784ctX abstractC12784ctX, @NotNull final Function1<? super AbstractC12782ctV, Unit> function1) {
        java.lang.Object obj;
        java.lang.Object next;
        C13854daT c13854daTFetchVPNInfo;
        java.lang.Object next2;
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final java.util.List<AbstractC12782ctV> listOLrzqt = OLrzqt(abstractC12784ctX);
        C10854bwM c10854bwMIsConnected = C10954byG.EZpvd.valueOf().isConnected();
        final long jFetchVPNInfo = c10854bwMIsConnected != null ? c10854bwMIsConnected.fetchVPNInfo() : -1L;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        for (AbstractC12782ctV abstractC12782ctV : listOLrzqt) {
            arrayList.add(new EoaWalletInfo(WalletType.HardwareWallet, abstractC12782ctV.EZpvd(jFetchVPNInfo), abstractC12782ctV.DbNXlk(), abstractC12782ctV.AkhnZx(), false, 16, null));
        }
        if (arrayList.size() > 1) {
            fPX.Companion.EZpvd(new java.util.ArrayList<>(arrayList), new yHO() { // from class: o.fOd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    return fNC.copydefault(listOLrzqt, abstractC12784ctX, activity, fragmentManager, jFetchVPNInfo, function1, (java.lang.String) obj2, (java.lang.String) obj3, (java.lang.String) obj4);
                }
            }).show(fragmentManager, "WalletAddSmartSelectEOAFragment");
            return;
        }
        EoaWalletInfo eoaWalletInfo = (EoaWalletInfo) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        if (eoaWalletInfo == null) {
            return;
        }
        java.util.Iterator<T> it = listOLrzqt.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((AbstractC12782ctV) next).DbNXlk(), (java.lang.Object) eoaWalletInfo.getWalletId())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) next;
        if (abstractC12782ctV2 == null) {
            return;
        }
        java.util.Iterator<T> it2 = abstractC12782ctV2.valueOf().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            java.lang.Object next3 = it2.next();
            ChainAddress chainAddress = (ChainAddress) next3;
            if (Intrinsics.EZpvd((java.lang.Object) eoaWalletInfo.getEoaAddress(), (java.lang.Object) chainAddress.getAddress())) {
                java.util.Iterator<T> it3 = C10954byG.EZpvd.valueOf().OLrzqt().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (chainAddress.getCoinId() == ((C10854bwM) next2).AhwBna()) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                if (next2 != null) {
                    obj = next3;
                    break;
                }
            }
        }
        ChainAddress chainAddress2 = (ChainAddress) obj;
        if (chainAddress2 == null || (c13854daTFetchVPNInfo = abstractC12784ctX.fetchVPNInfo()) == null) {
            return;
        }
        java.lang.String strAkhnZx = abstractC12782ctV2.AkhnZx();
        java.lang.String eoaAddress = eoaWalletInfo.getEoaAddress();
        java.lang.String strAYXKKw = c13854daTFetchVPNInfo.AYXKKw();
        java.lang.String strOLrzqt = c13854daTFetchVPNInfo.OLrzqt();
        HardwareType hardwareTypeKWHzl = c13854daTFetchVPNInfo.KWHzl();
        createHardwareSmartAccount$default(this, activity, fragmentManager, null, chainAddress2, strAkhnZx, eoaAddress, jFetchVPNInfo, strAYXKKw, c13854daTFetchVPNInfo.AEQbTJ(), strOLrzqt, hardwareTypeKWHzl != null ? hardwareTypeKWHzl.ordinal() : HardwareType.LedgerNanoX.ordinal(), function1, 4, null);
    }

    public static final Unit copydefault(java.util.List list, AbstractC12784ctX abstractC12784ctX, android.app.Activity activity, androidx.fragment.app.FragmentManager fragmentManager, long j, Function1 function1, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.Object obj;
        java.lang.Object next;
        C13854daT c13854daTFetchVPNInfo;
        java.lang.Object next2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.util.Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((AbstractC12782ctV) next).DbNXlk(), (java.lang.Object) str2)) {
                break;
            }
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) next;
        if (abstractC12782ctV == null) {
            return Unit.INSTANCE;
        }
        java.util.Iterator<T> it2 = abstractC12782ctV.valueOf().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            java.lang.Object next3 = it2.next();
            ChainAddress chainAddress = (ChainAddress) next3;
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) chainAddress.getAddress())) {
                java.util.Iterator<T> it3 = C10954byG.EZpvd.valueOf().OLrzqt().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    if (chainAddress.getCoinId() == ((C10854bwM) next2).AhwBna()) {
                        break;
                    }
                }
                if (next2 != null) {
                    obj = next3;
                    break;
                }
            }
        }
        ChainAddress chainAddress2 = (ChainAddress) obj;
        if (chainAddress2 == null) {
            return Unit.INSTANCE;
        }
        if (abstractC12784ctX == null || (c13854daTFetchVPNInfo = abstractC12784ctX.fetchVPNInfo()) == null) {
            return Unit.INSTANCE;
        }
        fNC fnc = OLrzqt;
        java.lang.String strAkhnZx = abstractC12782ctV.AkhnZx();
        java.lang.String strAYXKKw = c13854daTFetchVPNInfo.AYXKKw();
        java.lang.String strOLrzqt = c13854daTFetchVPNInfo.OLrzqt();
        HardwareType hardwareTypeKWHzl = c13854daTFetchVPNInfo.KWHzl();
        createHardwareSmartAccount$default(fnc, activity, fragmentManager, null, chainAddress2, strAkhnZx, str, j, strAYXKKw, c13854daTFetchVPNInfo.AEQbTJ(), strOLrzqt, hardwareTypeKWHzl != null ? hardwareTypeKWHzl.ordinal() : HardwareType.LedgerNanoX.ordinal(), function1, 4, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void createHardwareSmartAccount$default(fNC fnc, android.app.Activity activity, androidx.fragment.app.FragmentManager fragmentManager, InterfaceC14457dln interfaceC14457dln, ChainAddress chainAddress, java.lang.String str, java.lang.String str2, long j, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, Function1 function1, int i2, java.lang.Object obj) {
        fnc.OLrzqt(activity, fragmentManager, (i2 & 4) != 0 ? null : interfaceC14457dln, chainAddress, str, str2, j, str3, str4, str5, i, function1);
    }

    public final void OLrzqt(@NotNull final android.app.Activity activity, androidx.fragment.app.FragmentManager fragmentManager, final InterfaceC14457dln interfaceC14457dln, @NotNull final ChainAddress chainAddress, @NotNull final java.lang.String str, @NotNull java.lang.String str2, long j, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5, final int i, @NotNull final Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(chainAddress, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            abstractActivityC33041mov.showLoadingWithLogo();
        }
        AbstractC58185ywX<AAGenerateRes> abstractC58185ywXOLrzqt = OLrzqt(str2, j);
        final Function1 function12 = new Function1() { // from class: o.fOy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fNC.KWHzl(chainAddress, str, str3, str4, str5, i, interfaceC14457dln, activity, function1, (AAGenerateRes) obj);
            }
        };
        InterfaceC58227yxM<? super AAGenerateRes> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fOw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fNC.DTwDnp(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.fOA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fNC.AEQbTJ(activity, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fOC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fNC.QOLQEE(function13, obj);
            }
        });
    }

    public static final void DTwDnp(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(ChainAddress chainAddress, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, InterfaceC14457dln interfaceC14457dln, final android.app.Activity activity, final Function1 function1, AAGenerateRes aAGenerateRes) {
        java.lang.String proxyAddress;
        java.lang.String eoaAddress;
        C14140dfo instance$default = C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null);
        java.lang.String aaAddress = aAGenerateRes.getAaAddress();
        if (aaAddress != null && (proxyAddress = aAGenerateRes.getProxyAddress()) != null && (eoaAddress = aAGenerateRes.getEoaAddress()) != null) {
            instance$default.EZpvd(null, chainAddress, str, str2, str3, str4, i, interfaceC14457dln, 0, aaAddress, proxyAddress, eoaAddress, WalletType.HardwareWallet, new Function1() { // from class: o.fND
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fNC.OLrzqt(activity, function1, (AbstractC12782ctV) obj);
                }
            });
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(android.app.Activity activity, Function1 function1, AbstractC12782ctV abstractC12782ctV) {
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            abstractActivityC33041mov.dismissLoadingWithLogo();
        }
        function1.invoke(abstractC12782ctV);
        return Unit.INSTANCE;
    }

    public static final void QOLQEE(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(android.app.Activity activity, java.lang.Throwable th) {
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            abstractActivityC33041mov.dismissLoadingWithLogo();
        }
        fPH.OLrzqt.copydefault(activity, new yHO() { // from class: o.fNB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return fNC.EZpvd(((java.lang.Integer) obj).intValue(), (android.view.View) obj2, (ViewOnClickListenerC54939xaY) obj3);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(int i, android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        return Unit.INSTANCE;
    }

    public final java.lang.String AEQbTJ(@NotNull WalletType walletType) {
        Intrinsics.checkNotNullParameter(walletType, "");
        int i = Application.copydefault[walletType.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? Web3SecurityTrackEvent.VALUE_SEED_PHRASE : "hardware" : "mpc" : Web3SecurityTrackEvent.VALUE_PRIVATE_KEY;
    }

    public final void AEQbTJ(@NotNull AbstractC12784ctX abstractC12784ctX, @NotNull FragmentActivity fragmentActivity, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new AACreateUtils$addHDWalletAccount$1(fragmentManager, fragmentActivity, abstractC12784ctX, function1, null), 3, null);
    }

    public static /* synthetic */ void addWalletAccount$default(fNC fnc, AbstractC12784ctX abstractC12784ctX, FragmentActivity fragmentActivity, androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, java.lang.String str, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            fragment = null;
        }
        androidx.fragment.app.Fragment fragment2 = fragment;
        if ((i & 16) != 0) {
            str = "";
        }
        fnc.KWHzl(abstractC12784ctX, fragmentActivity, fragmentManager, fragment2, str, function2);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.fAJ.TaskDescription.newInstance$default(o.fAJ$TaskDescription, java.lang.String, java.lang.String, int, java.lang.String, boolean, boolean, boolean, kotlin.jvm.functions.Function1, int, java.lang.Object):o.fAJ */
    public final void KWHzl(@NotNull final AbstractC12784ctX abstractC12784ctX, @NotNull final FragmentActivity fragmentActivity, @NotNull final androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str, @NotNull final Function2<? super WalletCreatedData, ? super java.lang.Integer, Unit> function2) {
        KeystoneMultiAccount keystoneMultiAccountAhwBna;
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function2, "");
        int i = Application.copydefault[abstractC12784ctX.fJNWhG().ordinal()];
        if (i == 1) {
            copydefault(fragmentManager, fragmentActivity, abstractC12784ctX, new Function1() { // from class: o.fNR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fNC.OLrzqt(function2, (AbstractC12782ctV) obj);
                }
            });
            return;
        }
        if (i == 2) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new AACreateUtils$addWalletAccount$3(abstractC12784ctX, str, fragmentManager, fragmentActivity, function2, null), 3, null);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new AACreateUtils$addWalletAccount$1(fragmentActivity, fragmentManager, abstractC12784ctX, str, function2, null), 3, null);
            return;
        }
        if (abstractC12784ctX.getFieldNames()) {
            C13854daT c13854daTFetchVPNInfo = abstractC12784ctX.fetchVPNInfo();
            if (c13854daTFetchVPNInfo == null || (keystoneMultiAccountAhwBna = c13854daTFetchVPNInfo.AhwBna()) == null) {
                return;
            }
            ActivityC15384eGi.Companion.OLrzqt(fragmentActivity, abstractC12784ctX.EZpvd(), "addAccount", 1, keystoneMultiAccountAhwBna);
            return;
        }
        if (abstractC12784ctX.zsXlph()) {
            if (fragment != null) {
                eHZ.Companion.EZpvd(fragment, abstractC12784ctX.EZpvd());
                return;
            } else {
                eHZ.Companion.copydefault(fragmentActivity, abstractC12784ctX.EZpvd());
                return;
            }
        }
        if (abstractC12784ctX.uzCIH()) {
            java.util.List<AbstractC12782ctV> listFIwbmz = abstractC12784ctX.fIwbmz();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listFIwbmz) {
                AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj;
                if (abstractC12782ctV.QwvEab() == WalletType.HardwareWallet && abstractC12782ctV.dUDNAs()) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                java.util.List<AbstractC12782ctV> listFIwbmz2 = abstractC12784ctX.fIwbmz();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : listFIwbmz2) {
                    if (((AbstractC12782ctV) obj2).QwvEab() == WalletType.AAWallet) {
                        arrayList2.add(obj2);
                    }
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
                java.util.Iterator it = arrayList2.iterator();
                while (true) {
                    java.lang.String eoaAddress = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    ChainAddress chainAddress = (ChainAddress) CollectionsKt___CollectionsKt.firstOrNull(((AbstractC12782ctV) it.next()).valueOf());
                    if (chainAddress != null) {
                        eoaAddress = chainAddress.getEoaAddress();
                    }
                    arrayList3.add(eoaAddress);
                }
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                for (java.lang.Object obj3 : arrayList3) {
                    java.lang.String str2 = (java.lang.String) obj3;
                    if (!(str2 == null || str2.length() == 0)) {
                        arrayList4.add(obj3);
                    }
                }
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                for (java.lang.Object obj4 : arrayList) {
                    if (((AbstractC12782ctV) obj4).AuCTelauCTel()) {
                        arrayList5.add(obj4);
                    }
                }
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                for (java.lang.Object obj5 : arrayList5) {
                    AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) obj5;
                    C10854bwM c10854bwMIsConnected = C10954byG.EZpvd.valueOf().isConnected();
                    java.lang.String strEZpvd = abstractC12782ctV2.EZpvd(c10854bwMIsConnected != null ? c10854bwMIsConnected.fetchVPNInfo() : -1L);
                    if (!arrayList4.contains(strEZpvd) && C17671fNz.TaskDescription.getInstance$default(C17671fNz.Companion, null, 1, null).EZpvd(strEZpvd)) {
                        arrayList6.add(obj5);
                    }
                }
                if (!arrayList6.isEmpty()) {
                    fAJ.Companion.AEQbTJ((115 & 1) != 0 ? "" : null, (115 & 2) != 0 ? "" : null, abstractC12784ctX.fJNWhG().ordinal(), str, (115 & 16) != 0, (115 & 32) != 0, (115 & 64) != 0, new Function1() { // from class: o.fNS
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj6) {
                            return fNC.KWHzl(fragmentManager, fragmentActivity, abstractC12784ctX, function2, ((java.lang.Integer) obj6).intValue());
                        }
                    }).show(fragmentManager, "AAAccountSelectFragment");
                    return;
                }
            }
            KWHzl(fragmentActivity, abstractC12784ctX);
            return;
        }
        EZpvd(fragmentManager, fragmentActivity, abstractC12784ctX, new Function1() { // from class: o.fNU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj6) {
                return fNC.valueOf(function2, (AbstractC12782ctV) obj6);
            }
        });
    }

    public static final Unit OLrzqt(Function2 function2, AbstractC12782ctV abstractC12782ctV) {
        function2.invoke(abstractC12782ctV != null ? C13788dYh.copydefault(abstractC12782ctV) : null, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(androidx.fragment.app.FragmentManager fragmentManager, FragmentActivity fragmentActivity, AbstractC12784ctX abstractC12784ctX, final Function2 function2, int i) {
        if (i == 2) {
            OLrzqt.EZpvd(fragmentManager, fragmentActivity, abstractC12784ctX, new Function1() { // from class: o.fOY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fNC.EZpvd(function2, (AbstractC12782ctV) obj);
                }
            });
        } else {
            OLrzqt.KWHzl(fragmentActivity, abstractC12784ctX);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(Function2 function2, AbstractC12782ctV abstractC12782ctV) {
        function2.invoke(abstractC12782ctV != null ? C13788dYh.copydefault(abstractC12782ctV) : null, null);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(Function2 function2, AbstractC12782ctV abstractC12782ctV) {
        function2.invoke(abstractC12782ctV != null ? C13788dYh.copydefault(abstractC12782ctV) : null, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(FragmentActivity fragmentActivity, AbstractC12784ctX abstractC12784ctX) {
        java.util.ArrayList<BluetoothDeviceModel> arrayListCopydefault = C13992dcz.AEQbTJ.copydefault();
        InterfaceC57036yao interfaceC57036yaoAEQbTJ = C57032yak.AEQbTJ.AEQbTJ();
        BluetoothDeviceModel bluetoothDeviceModelOLrzqt = interfaceC57036yaoAEQbTJ != null ? interfaceC57036yaoAEQbTJ.OLrzqt() : null;
        if (arrayListCopydefault.isEmpty()) {
            ActivityC15302eDh.Companion.copydefault(fragmentActivity);
            return;
        }
        if (bluetoothDeviceModelOLrzqt != null) {
            java.lang.String address = bluetoothDeviceModelOLrzqt.getAddress();
            C13854daT c13854daTFetchVPNInfo = abstractC12784ctX.fetchVPNInfo();
            if (Intrinsics.EZpvd((java.lang.Object) address, (java.lang.Object) (c13854daTFetchVPNInfo != null ? c13854daTFetchVPNInfo.AYXKKw() : null))) {
                ActivityC15363eFo.Companion.KWHzl(fragmentActivity, 1, "from_add");
                return;
            }
        }
        fragmentActivity.startActivity(new android.content.Intent(fragmentActivity, (java.lang.Class<?>) eDT.class));
    }

    public final void EZpvd(WalletCreatedData walletCreatedData, java.lang.Integer num) {
        if (walletCreatedData == null) {
            fVE.Companion.EZpvd().EZpvd(new fWX.Fragment());
            return;
        }
        if (num != null && num.intValue() == 1) {
            boolean zCopydefault = ((dTQ) C43251rlk.copydefault(dTQ.class)).copydefault();
            if (walletCreatedData.EZpvd() != null && zCopydefault) {
                if (walletCreatedData.EZpvd().AEQbTJ()) {
                    fVE.Companion.EZpvd().EZpvd(new fWX.PictureInPictureParams(walletCreatedData.copydefault()));
                    return;
                } else {
                    fVE.Companion.EZpvd().EZpvd(new fWX.SharedElementCallback(walletCreatedData.copydefault()));
                    return;
                }
            }
            fVE.Companion.EZpvd().EZpvd(new fWX.LoaderManager(walletCreatedData.copydefault()));
            return;
        }
        if (num != null && num.intValue() == 3) {
            if (walletCreatedData.EZpvd() != null) {
                if (walletCreatedData.EZpvd().AEQbTJ()) {
                    fVE.Companion.EZpvd().EZpvd(new fWX.PictureInPictureParams(walletCreatedData.copydefault()));
                    return;
                } else {
                    fVE.Companion.EZpvd().EZpvd(new fWX.SharedElementCallback(walletCreatedData.copydefault()));
                    return;
                }
            }
            return;
        }
        fVE.Companion.EZpvd().EZpvd(new fWX.LoaderManager(walletCreatedData.copydefault()));
    }

    public static final java.lang.Boolean copydefault(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return java.lang.Boolean.valueOf(responseData.getCode() == 0 && responseData.getData() != null);
    }
}
