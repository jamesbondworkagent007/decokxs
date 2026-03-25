package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.error.OKWException;
import com.okinc.business.defi.biz.core.mpc.MpcShare2Status;
import com.okinc.business.defi.biz.drivers.bean.MPCWalletShareBean;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.model.wallet.MpcWalletDecodeInfo;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import com.okinc.business.defi.biz.net.bean.BackupCloudTypeRes;
import com.okinc.business.defi.biz.net.bean.CheckMpcStatusRequestBody;
import com.okinc.business.defi.biz.net.bean.CheckMpcStatusResponse;
import com.okinc.business.defi.biz.net.bean.EscapeCoinMetaBean;
import com.okinc.business.defi.biz.net.bean.MpcStatus;
import com.okinc.business.defi.biz.net.bean.SyncMpcEscapeStatusRes;
import com.okinc.business.defi.wallet.mpc.MpcPrivateKeyItem;
import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.mpc.MpcPrivateKey;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC17448fFs;
import o.C11010bzJ;
import o.C12827cuN;
import o.C13754dXa;
import o.InterfaceC9738bbJ;
import o.fFK;
import o.fGL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fGT extends AbstractC33073mpa {
    public MpcWalletDecodeInfo AEQbTJ;
    public AbstractC12782ctV djBIcL;
    public final C17237eyx valueOf;
    public final java.lang.String gEmmrt = fGT.class.getName();
    public final C13934dbu AYXKKw = new C13934dbu();
    public final MutableLiveData<java.lang.Integer> OLrzqt = new MutableLiveData<>(-1);
    public final MutableLiveData<java.lang.Integer> KWHzl = new MutableLiveData<>();
    public final MutableLiveData<java.util.List<fDL<java.lang.Object>>> copydefault = new MutableLiveData<>();
    public java.util.ArrayList<C10854bwM> EZpvd = new java.util.ArrayList<>();
    public java.lang.String AhwBna = "";
    public java.lang.String isConnected = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.Integer AEQbTJ(java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.Boolean AhwBna(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return java.lang.Boolean.TRUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.Boolean copydefault(java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return java.lang.Boolean.TRUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.Integer valueOf(java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Integer> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12782ctV EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MpcWalletDecodeInfo KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.List<fDL<java.lang.Object>>> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Integer> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt() {
        this.AhwBna = "";
        this.isConnected = "";
        this.djBIcL = null;
        this.AEQbTJ = null;
    }

    public fGT() {
        C12827cuN.Application application = C12827cuN.Companion;
        this.valueOf = new C17237eyx(new C17262ezV(C12827cuN.Application.getInstance$default(application, null, 1, null), null, null, 6, null), 0 == true ? 1 : 0, 0 == true ? 1 : 0, new C17241ezA(new C17262ezV(C12827cuN.Application.getInstance$default(application, null, 1, null), null, null, 6, null)), 0 == true ? 1 : 0, 22, null);
    }

    public final void KWHzl(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov, @NotNull final AbstractC12782ctV abstractC12782ctV, @NotNull final java.lang.String str, @NotNull final Function0<Unit> function0) {
        java.lang.String mpcId;
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
        if (mpcWalletEncodeInfoQSBOWP == null || (mpcId = mpcWalletEncodeInfoQSBOWP.getMpcId()) == null) {
            mpcId = MultiTransferSignData.DEFAULT_INTERVAL;
        }
        final boolean zDCUTEIdCUTEI = abstractC12782ctV.DCUTEIdCUTEI();
        abstractActivityC33041mov.showLoadingAtOnce();
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXOLrzqt = OLrzqt(abstractC12782ctV);
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.util.ArrayList<C10854bwM>>> abstractC58185ywXCopydefault = copydefault(mpcId);
        final Function2 function2 = new Function2() { // from class: o.fHG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return fGT.OLrzqt((java.lang.Boolean) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXOLrzqt, abstractC58185ywXCopydefault, new InterfaceC58223yxI() { // from class: o.fHK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return fGT.AEQbTJ(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.fHJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fGT.EZpvd(abstractC12782ctV, zDCUTEIdCUTEI, function0, this, abstractActivityC33041mov, str, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fHL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fGT.gGvvIC(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.fHM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fGT.EZpvd(this.EZpvd, abstractActivityC33041mov, abstractC12782ctV, str, (java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fHR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fGT.flVtFt(function12, obj);
            }
        }));
    }

    public static final kotlin.Pair AEQbTJ(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair OLrzqt(java.lang.Boolean bool, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(bool, "");
        Intrinsics.checkNotNullParameter(pair, "");
        return C56390yDp.OLrzqt(bool, pair);
    }

    public static final void gGvvIC(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(AbstractC12782ctV abstractC12782ctV, boolean z, Function0 function0, fGT fgt, AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str, kotlin.Pair pair) {
        java.lang.String strAkhnZx;
        java.lang.Object second = pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "");
        if (((java.lang.Boolean) ((kotlin.Pair) second).getFirst()).booleanValue()) {
            if (abstractC12782ctV.DCUTEIdCUTEI()) {
                if (!z) {
                    function0.invoke();
                }
                fgt.copydefault(abstractC12782ctV, abstractActivityC33041mov, str);
            } else if (!abstractC12782ctV.Dmq()) {
                abstractActivityC33041mov.dismissLoading();
                C55326xho.toast$default(C13754dXa.FragmentManager.performMenuItemShortcut, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            } else {
                abstractActivityC33041mov.dismissLoading();
                fFK.ActionBar actionBar = fFK.Companion;
                java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
                AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
                if (abstractC12784ctXGwTjWJ == null || (strAkhnZx = abstractC12784ctXGwTjWJ.AuCTel()) == null) {
                    strAkhnZx = abstractC12782ctV.AkhnZx();
                }
                actionBar.AEQbTJ(abstractActivityC33041mov, strDbNXlk, strAkhnZx, str);
            }
        } else {
            abstractActivityC33041mov.dismissLoading();
            C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.OptIn), 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final void flVtFt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(fGT fgt, AbstractActivityC33041mov abstractActivityC33041mov, AbstractC12782ctV abstractC12782ctV, java.lang.String str, java.lang.Throwable th) {
        java.lang.String strAkhnZx;
        pUU.copydefault(fgt.gEmmrt, "onWalletItemClick zip error message : " + th.getMessage());
        abstractActivityC33041mov.dismissLoading();
        if (!abstractC12782ctV.DCUTEIdCUTEI() && (!fgt.EZpvd.isEmpty())) {
            fFK.ActionBar actionBar = fFK.Companion;
            java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
            AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
            if (abstractC12784ctXGwTjWJ == null || (strAkhnZx = abstractC12784ctXGwTjWJ.AuCTel()) == null) {
                strAkhnZx = abstractC12782ctV.AkhnZx();
            }
            actionBar.AEQbTJ(abstractActivityC33041mov, strDbNXlk, strAkhnZx, str);
        } else {
            C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.OptIn), 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public final AbstractC58185ywX<java.lang.Boolean> OLrzqt(final AbstractC12782ctV abstractC12782ctV) {
        final java.lang.String mpcId;
        if (abstractC12782ctV.DCUTEIdCUTEI()) {
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(java.lang.Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
        if (mpcWalletEncodeInfoQSBOWP == null || (mpcId = mpcWalletEncodeInfoQSBOWP.getMpcId()) == null) {
            mpcId = "";
        }
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(this.AYXKKw.EZpvd(abstractC12782ctV.USBtdM(), abstractC12782ctV.DbNXlk(), C56402yEa.EZpvd(new CheckMpcStatusRequestBody(mpcId))), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.fHB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fGT.AEQbTJ(abstractC12782ctV, mpcId, (java.util.List) obj);
            }
        };
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXCopydefault = abstractC58185ywXUnwrapResponseData$default.copydefault(new InterfaceC58229yxO() { // from class: o.fHI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fGT.finit(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    public static final InterfaceC58261yxu finit(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(final AbstractC12782ctV abstractC12782ctV, java.lang.String str, java.util.List list) {
        java.lang.Object next;
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP;
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
        int value = MpcStatus.Refreshed.getValue();
        if (numValueOf == null || numValueOf.intValue() != value) {
            int value2 = MpcStatus.Escape.getValue();
            if (numValueOf == null || numValueOf.intValue() != value2) {
                return AbstractC58260yxt.copydefault(java.lang.Boolean.TRUE);
            }
        }
        if (checkMpcStatusResponse.getMpcStatus() == MpcStatus.Escape.getValue() && (mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP()) != null) {
            mpcWalletEncodeInfoQSBOWP.setEscape(1);
        }
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP2 = abstractC12782ctV.QSBOWP();
        if (mpcWalletEncodeInfoQSBOWP2 != null) {
            mpcWalletEncodeInfoQSBOWP2.setStatus(MpcShare2Status.SHARE2_INVALID.getValue());
        }
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP3 = abstractC12782ctV.QSBOWP();
        final java.lang.Integer numValueOf2 = mpcWalletEncodeInfoQSBOWP3 != null ? java.lang.Integer.valueOf(mpcWalletEncodeInfoQSBOWP3.getStatus()) : null;
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP4 = abstractC12782ctV.QSBOWP();
        final java.lang.Integer numValueOf3 = mpcWalletEncodeInfoQSBOWP4 != null ? java.lang.Integer.valueOf(mpcWalletEncodeInfoQSBOWP4.isEscape()) : null;
        C10854bwM c10854bwMIsConnected = C10954byG.EZpvd.valueOf().isConnected();
        AbstractC58260yxt<java.util.List<AbstractC12782ctV>> abstractC58260yxtKWHzl = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).KWHzl(abstractC12782ctV.EZpvd(c10854bwMIsConnected != null ? c10854bwMIsConnected.fetchVPNInfo() : -1L), abstractC12782ctV.QwvEab());
        final Function1 function1 = new Function1() { // from class: o.fHO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fGT.EZpvd(abstractC12782ctV, numValueOf2, numValueOf3, (java.util.List) obj);
            }
        };
        return abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.fHN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fGT.fFgQHt(function1, obj);
            }
        });
    }

    public static final InterfaceC58261yxu fFgQHt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(AbstractC12782ctV abstractC12782ctV, java.lang.Integer num, java.lang.Integer num2, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            AbstractC58260yxt abstractC58260yxtUpdateMpcWalletInfo$default = AbstractC12782ctV.updateMpcWalletInfo$default(abstractC12782ctV, null, num, null, null, num2, null, null, 109, null);
            final Function1 function1 = new Function1() { // from class: o.fGP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fGT.copydefault((java.lang.Integer) obj);
                }
            };
            return abstractC58260yxtUpdateMpcWalletInfo$default.copydefault(new InterfaceC58229yxO() { // from class: o.fGS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return fGT.dNCPSb(function1, obj);
                }
            });
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        AbstractC58260yxt abstractC58260yxtUpdateMpcWalletInfo$default2 = AbstractC12782ctV.updateMpcWalletInfo$default(abstractC12782ctV, null, num, null, null, num2, null, null, 109, null);
        AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
        java.lang.String mpcId = mpcWalletEncodeInfoQSBOWP != null ? mpcWalletEncodeInfoQSBOWP.getMpcId() : null;
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP2 = abstractC12782ctV2.QSBOWP();
        if (Intrinsics.EZpvd((java.lang.Object) mpcId, (java.lang.Object) (mpcWalletEncodeInfoQSBOWP2 != null ? mpcWalletEncodeInfoQSBOWP2.getMpcId() : null))) {
            arrayList.add(AbstractC12782ctV.updateMpcWalletInfo$default(abstractC12782ctV2, null, num, null, null, num2, null, null, 109, null));
        }
        arrayList.add(abstractC58260yxtUpdateMpcWalletInfo$default2);
        AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(arrayList);
        final Function1 function12 = new Function1() { // from class: o.fHc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fGT.AhwBna((java.util.List) obj);
            }
        };
        return abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.fHr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fGT.RcXXUw(function12, obj);
            }
        });
    }

    public static final java.lang.Boolean dNCPSb(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean RcXXUw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public final void copydefault(final AbstractC12782ctV abstractC12782ctV, final AbstractActivityC33041mov abstractActivityC33041mov, final java.lang.String str) {
        androidx.fragment.app.FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        new C14461dlr(supportFragmentManager, "mpcEscape-escapedWalletLogic", new Function1() { // from class: o.fHV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fGT.EZpvd(abstractC12782ctV, this, abstractActivityC33041mov, str, (java.lang.String) obj);
            }
        }, new Function0() { // from class: o.fIf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return fGT.copydefault(abstractActivityC33041mov);
            }
        }, null, false, 48, null).EZpvd();
    }

    public static final Unit EZpvd(final AbstractC12782ctV abstractC12782ctV, final fGT fgt, final AbstractActivityC33041mov abstractActivityC33041mov, final java.lang.String str, final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58260yxt<kotlin.Pair<MpcWalletDecodeInfo, java.lang.String>> abstractC58260yxtAEQbTJ = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).AEQbTJ(abstractC12782ctV, str2);
        final Function1 function1 = new Function1() { // from class: o.fIb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fGT.copydefault(this.KWHzl, abstractActivityC33041mov, str2, abstractC12782ctV, str, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM<? super kotlin.Pair<MpcWalletDecodeInfo, java.lang.String>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fHX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fGT.OcIXYQ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.fIa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fGT.djBIcL(this.copydefault, (java.lang.Throwable) obj);
            }
        };
        fgt.call().AEQbTJ(abstractC58260yxtAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fHY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fGT.ORxRYg(function12, obj);
            }
        }));
        return Unit.INSTANCE;
    }

    public static final void OcIXYQ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(fGT fgt, AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str, AbstractC12782ctV abstractC12782ctV, java.lang.String str2, kotlin.Pair pair) {
        MpcWalletDecodeInfo mpcWalletDecodeInfo = (MpcWalletDecodeInfo) pair.getFirst();
        java.lang.String str3 = (java.lang.String) pair.getSecond();
        if (mpcWalletDecodeInfo.getEcdsaShare3().length() == 0 || mpcWalletDecodeInfo.getEd25519Share3().length() == 0) {
            if (C14392dkb.AEQbTJ.OLrzqt()) {
                fgt.copydefault(abstractActivityC33041mov, mpcWalletDecodeInfo, str, str3, 1, abstractC12782ctV, str2);
            } else {
                fgt.AhwBna = str;
                fgt.isConnected = str3;
                fgt.AEQbTJ = mpcWalletDecodeInfo;
                fgt.djBIcL = abstractC12782ctV;
                fgt.KWHzl(mpcWalletDecodeInfo.getMpcId());
            }
        } else {
            toPrivateKeysLogic$default(fgt, fgt.copydefault(mpcWalletDecodeInfo, abstractC12782ctV), abstractActivityC33041mov, mpcWalletDecodeInfo, abstractC12782ctV, null, false, 48, null);
        }
        return Unit.INSTANCE;
    }

    public static final void ORxRYg(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(fGT fgt, java.lang.Throwable th) {
        pUU.copydefault(fgt.gEmmrt, "WalletManager.getDecodeMpcInfo error message:" + th.getMessage());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractActivityC33041mov abstractActivityC33041mov) {
        abstractActivityC33041mov.dismissLoading();
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov, @NotNull final MpcWalletDecodeInfo mpcWalletDecodeInfo, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, int i, @NotNull final AbstractC12782ctV abstractC12782ctV, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(mpcWalletDecodeInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(str3, "");
        OLrzqt(abstractActivityC33041mov, mpcWalletDecodeInfo.getMpcId(), i, str, new Function1() { // from class: o.fHh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fGT.OLrzqt(this.EZpvd, mpcWalletDecodeInfo, abstractC12782ctV, str, str2, abstractActivityC33041mov, str3, (MPCWalletShareBean) obj);
            }
        });
    }

    public static final Unit OLrzqt(final fGT fgt, final MpcWalletDecodeInfo mpcWalletDecodeInfo, final AbstractC12782ctV abstractC12782ctV, java.lang.String str, java.lang.String str2, final AbstractActivityC33041mov abstractActivityC33041mov, final java.lang.String str3, MPCWalletShareBean mPCWalletShareBean) {
        Intrinsics.checkNotNullParameter(mPCWalletShareBean, "");
        fgt.copydefault(mpcWalletDecodeInfo, mPCWalletShareBean, abstractC12782ctV, str, str2);
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
        final java.lang.Integer numValueOf = mpcWalletEncodeInfoQSBOWP != null ? java.lang.Integer.valueOf(mpcWalletEncodeInfoQSBOWP.getStatus()) : null;
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP2 = abstractC12782ctV.QSBOWP();
        final java.lang.Integer numValueOf2 = mpcWalletEncodeInfoQSBOWP2 != null ? java.lang.Integer.valueOf(mpcWalletEncodeInfoQSBOWP2.isEscape()) : null;
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP3 = abstractC12782ctV.QSBOWP();
        final java.lang.String encryptShareKey = mpcWalletEncodeInfoQSBOWP3 != null ? mpcWalletEncodeInfoQSBOWP3.getEncryptShareKey() : null;
        C10854bwM c10854bwMIsConnected = C10954byG.EZpvd.valueOf().isConnected();
        AbstractC58260yxt<java.util.List<AbstractC12782ctV>> abstractC58260yxtKWHzl = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).KWHzl(abstractC12782ctV.EZpvd(c10854bwMIsConnected != null ? c10854bwMIsConnected.fetchVPNInfo() : -1L), abstractC12782ctV.QwvEab());
        final Function1 function1 = new Function1() { // from class: o.fHl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fGT.AEQbTJ(abstractC12782ctV, numValueOf, numValueOf2, encryptShareKey, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.fHj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fGT.dvKsVJ(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.fHm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fGT.AEQbTJ(this.OLrzqt, mpcWalletDecodeInfo, abstractC12782ctV, abstractActivityC33041mov, str3, (java.lang.Integer) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fHk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fGT.gasjUx(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.fHp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fGT.values(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        fgt.call().AEQbTJ(abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fHs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fGT.fvQaOB(function13, obj);
            }
        }));
        return Unit.INSTANCE;
    }

    public static final InterfaceC58261yxu dvKsVJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(AbstractC12782ctV abstractC12782ctV, java.lang.Integer num, java.lang.Integer num2, java.lang.String str, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            AbstractC58260yxt abstractC58260yxtUpdateMpcWalletInfo$default = AbstractC12782ctV.updateMpcWalletInfo$default(abstractC12782ctV, null, num, null, null, num2, str, null, 77, null);
            final Function1 function1 = new Function1() { // from class: o.fIn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fGT.AEQbTJ((java.lang.Integer) obj);
                }
            };
            return abstractC58260yxtUpdateMpcWalletInfo$default.copydefault(new InterfaceC58229yxO() { // from class: o.fIo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return fGT.dxcTrN(function1, obj);
                }
            });
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        AbstractC58260yxt abstractC58260yxtUpdateMpcWalletInfo$default2 = AbstractC12782ctV.updateMpcWalletInfo$default(abstractC12782ctV, null, num, null, null, num2, str, null, 77, null);
        AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
        java.lang.String mpcId = mpcWalletEncodeInfoQSBOWP != null ? mpcWalletEncodeInfoQSBOWP.getMpcId() : null;
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP2 = abstractC12782ctV2.QSBOWP();
        if (Intrinsics.EZpvd((java.lang.Object) mpcId, (java.lang.Object) (mpcWalletEncodeInfoQSBOWP2 != null ? mpcWalletEncodeInfoQSBOWP2.getMpcId() : null))) {
            arrayList.add(AbstractC12782ctV.updateMpcWalletInfo$default((AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(list), null, num, null, null, num2, str, null, 77, null));
        }
        arrayList.add(abstractC58260yxtUpdateMpcWalletInfo$default2);
        AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(arrayList);
        final Function1 function12 = new Function1() { // from class: o.fGQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fGT.valueOf((java.util.List) obj);
            }
        };
        return abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.fGX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fGT.fZBcTu(function12, obj);
            }
        });
    }

    public static final java.lang.Integer dxcTrN(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final java.lang.Integer fZBcTu(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final java.lang.Integer valueOf(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return java.lang.Integer.valueOf(list.size());
    }

    public static final void gasjUx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(fGT fgt, MpcWalletDecodeInfo mpcWalletDecodeInfo, AbstractC12782ctV abstractC12782ctV, AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str, java.lang.Integer num) {
        toPrivateKeysLogic$default(fgt, fgt.copydefault(mpcWalletDecodeInfo, abstractC12782ctV), abstractActivityC33041mov, mpcWalletDecodeInfo, abstractC12782ctV, str, false, 32, null);
        return Unit.INSTANCE;
    }

    public static final void fvQaOB(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit values(fGT fgt, java.lang.Throwable th) {
        pUU.copydefault(fgt.gEmmrt, "handleGetShare3FromIcloud queryAAWallet error message:" + th.getMessage());
        return Unit.INSTANCE;
    }

    public final void copydefault(MpcWalletDecodeInfo mpcWalletDecodeInfo, MPCWalletShareBean mPCWalletShareBean, AbstractC12782ctV abstractC12782ctV, java.lang.String str, java.lang.String str2) {
        mpcWalletDecodeInfo.setEcdsaP3(mPCWalletShareBean.getEcdsaP3());
        mpcWalletDecodeInfo.setEcdsaShare3(mPCWalletShareBean.getEcdsaShare3());
        mpcWalletDecodeInfo.setEd25519Share3(mPCWalletShareBean.getEd25519Share3());
        mpcWalletDecodeInfo.setStatus(MpcShare2Status.SHARE2_INVALID.getValue());
        mpcWalletDecodeInfo.setEscape(1);
        abstractC12782ctV.AEQbTJ(C10964byQ.copydefault(str, str2, mpcWalletDecodeInfo));
    }

    public final void OLrzqt(final AbstractActivityC33041mov abstractActivityC33041mov, final java.lang.String str, final int i, final java.lang.String str2, final Function1<? super MPCWalletShareBean, Unit> function1) {
        InterfaceC14334djW interfaceC14334djWOLrzqt = C14392dkb.AEQbTJ.OLrzqt(abstractActivityC33041mov, i);
        if (interfaceC14334djWOLrzqt != null) {
            interfaceC14334djWOLrzqt.KWHzl(abstractActivityC33041mov, 1, new Function0() { // from class: o.fGV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return fGT.KWHzl(abstractActivityC33041mov, i, str, str2, this, function1);
                }
            });
        }
    }

    public static final Unit KWHzl(AbstractActivityC33041mov abstractActivityC33041mov, int i, java.lang.String str, java.lang.String str2, final fGT fgt, final Function1 function1) {
        abstractActivityC33041mov.dismissLoading();
        InterfaceC14373dkI interfaceC14373dkIEZpvd = C14392dkb.AEQbTJ.EZpvd(abstractActivityC33041mov, i);
        if (interfaceC14373dkIEZpvd != null) {
            androidx.fragment.app.FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            interfaceC14373dkIEZpvd.KWHzl(str, str2, supportFragmentManager, abstractActivityC33041mov, new Function2() { // from class: o.fHv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return fGT.copydefault(this.copydefault, function1, (MPCWalletShareBean) obj, (java.lang.String) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(fGT fgt, Function1 function1, MPCWalletShareBean mPCWalletShareBean, java.lang.String str) {
        Intrinsics.checkNotNullParameter(mPCWalletShareBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        fgt.OLrzqt.setValue(0);
        function1.invoke(mPCWalletShareBean);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov, @NotNull final java.lang.String str, @NotNull final AbstractC12782ctV abstractC12782ctV, @NotNull final MPCWalletShareBean mPCWalletShareBean, @NotNull final java.lang.String str2) {
        java.lang.String mpcId;
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(mPCWalletShareBean, "");
        Intrinsics.checkNotNullParameter(str2, "");
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
        if (mpcWalletEncodeInfoQSBOWP == null || (mpcId = mpcWalletEncodeInfoQSBOWP.getMpcId()) == null) {
            mpcId = MultiTransferSignData.DEFAULT_INTERVAL;
        }
        AbstractC58185ywX<java.lang.String> abstractC58185ywXEZpvd = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).AhwBna(str).EZpvd();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.util.ArrayList<C10854bwM>>> abstractC58185ywXCopydefault = copydefault(mpcId);
        final Function2 function2 = new Function2() { // from class: o.fHP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return fGT.EZpvd((java.lang.String) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX abstractC58185ywXEZpvd2 = AbstractC58185ywX.EZpvd(abstractC58185ywXEZpvd, abstractC58185ywXCopydefault, new InterfaceC58223yxI() { // from class: o.fHQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return fGT.copydefault(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.fHT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fGT.EZpvd(str, abstractC12782ctV, this, mPCWalletShareBean, abstractActivityC33041mov, str2, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fHS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fGT.zuBGHE(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.fHW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fGT.copydefault((java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58185ywXEZpvd2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fHU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fGT.sSMYrx(function12, obj);
            }
        }));
    }

    public static final kotlin.Pair copydefault(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair EZpvd(java.lang.String str, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(pair, "");
        return C56390yDp.OLrzqt(str, pair);
    }

    public static final void zuBGHE(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.String str, AbstractC12782ctV abstractC12782ctV, fGT fgt, MPCWalletShareBean mPCWalletShareBean, AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str2, kotlin.Pair pair) {
        java.lang.Object first = pair.getFirst();
        Intrinsics.checkNotNullExpressionValue(first, "");
        java.lang.String str3 = (java.lang.String) first;
        java.lang.Object second = pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "");
        kotlin.Pair pair2 = (kotlin.Pair) second;
        if (((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            if (((java.util.ArrayList) pair2.getSecond()).isEmpty()) {
                C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.OptIn), 0, 1, (java.lang.Object) null);
                return Unit.INSTANCE;
            }
            MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
            if (mpcWalletEncodeInfoQSBOWP == null) {
                return Unit.INSTANCE;
            }
            MpcWalletDecodeInfo mpcWalletDecodeInfoOLrzqt = C10964byQ.OLrzqt(str, str3, mpcWalletEncodeInfoQSBOWP);
            fgt.copydefault(mpcWalletDecodeInfoOLrzqt, mPCWalletShareBean, abstractC12782ctV, str, str3);
            java.util.ArrayList<MpcPrivateKeyItem> arrayListCopydefault = fgt.copydefault(mpcWalletDecodeInfoOLrzqt, abstractC12782ctV);
            if ((!arrayListCopydefault.isEmpty()) && arrayListCopydefault.size() < fgt.EZpvd.size()) {
                fgt.AYXKKw(arrayListCopydefault);
                eRI.OLrzqt.copydefault(abstractActivityC33041mov);
            } else {
                fgt.OLrzqt.setValue(0);
                fgt.EZpvd(arrayListCopydefault, abstractActivityC33041mov, mpcWalletDecodeInfoOLrzqt, abstractC12782ctV, str2, true);
            }
        } else {
            C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.OptIn), 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final void sSMYrx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.OptIn), 0, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final java.util.ArrayList<MpcPrivateKeyItem> copydefault(MpcWalletDecodeInfo mpcWalletDecodeInfo, AbstractC12782ctV abstractC12782ctV) {
        java.lang.Object next;
        java.lang.String strCopydefault;
        java.lang.String strDjBIcL;
        java.lang.String address;
        java.util.List<MpcPrivateKey> listAEQbTJ = abstractC12782ctV.AEQbTJ(mpcWalletDecodeInfo, this.EZpvd);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        for (MpcPrivateKey mpcPrivateKey : listAEQbTJ) {
            ChainAddress chainAddress = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(abstractC12782ctV, mpcPrivateKey.getChainId(), null, 2, null);
            java.lang.String str = (chainAddress == null || (address = chainAddress.getAddress()) == null) ? "" : address;
            java.util.Iterator<T> it = this.EZpvd.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (mpcPrivateKey.getChainId() == ((C10854bwM) next).fetchVPNInfo()) {
                    break;
                }
            }
            C10854bwM c10854bwM = (C10854bwM) next;
            arrayList.add(new MpcPrivateKeyItem(mpcPrivateKey.getChainId(), mpcPrivateKey.getPrivateKey(), str, false, false, (c10854bwM == null || (strDjBIcL = c10854bwM.djBIcL()) == null) ? "" : strDjBIcL, (c10854bwM == null || (strCopydefault = c10854bwM.copydefault()) == null) ? "" : strCopydefault, 24, (DefaultConstructorMarker) null));
        }
        return new java.util.ArrayList<>(arrayList);
    }

    public static final kotlin.Pair UeEOUB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.util.ArrayList<C10854bwM>>> copydefault(java.lang.String str) {
        AbstractC58185ywX<ResponseData<java.util.List<EscapeCoinMetaBean>>> abstractC58185ywXDjBIcL = this.AYXKKw.djBIcL(str);
        final Function1 function1 = new Function1() { // from class: o.fHq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fGT.KWHzl(this.copydefault, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXAEQbTJ = abstractC58185ywXDjBIcL.AEQbTJ(new InterfaceC58229yxO() { // from class: o.fHo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fGT.UeEOUB(function1, obj);
            }
        });
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl("");
        final Function1 function12 = new Function1() { // from class: o.fHw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fGT.EZpvd(this.EZpvd, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.util.ArrayList<C10854bwM>>> abstractC58185ywXOLrzqt = abstractC58185ywXAEQbTJ.OLrzqt(abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.fHt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fGT.djSkpj(function12, obj);
            }
        }));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXOLrzqt, "");
        return abstractC58185ywXOLrzqt;
    }

    public static final kotlin.Pair djSkpj(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair EZpvd(fGT fgt, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        fgt.EZpvd.clear();
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, new java.util.ArrayList(0));
    }

    public final void djBIcL(java.util.List<EscapeCoinMetaBean> list) {
        this.EZpvd.clear();
        this.EZpvd.addAll(C10954byG.EZpvd.valueOf().OLrzqt(list));
    }

    public static /* synthetic */ void toPrivateKeysLogic$default(fGT fgt, java.util.ArrayList arrayList, AbstractActivityC33041mov abstractActivityC33041mov, MpcWalletDecodeInfo mpcWalletDecodeInfo, AbstractC12782ctV abstractC12782ctV, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str = "";
        }
        java.lang.String str2 = str;
        if ((i & 32) != 0) {
            z = false;
        }
        fgt.EZpvd(arrayList, abstractActivityC33041mov, mpcWalletDecodeInfo, abstractC12782ctV, str2, z);
    }

    public final void EZpvd(java.util.ArrayList<MpcPrivateKeyItem> arrayList, AbstractActivityC33041mov abstractActivityC33041mov, MpcWalletDecodeInfo mpcWalletDecodeInfo, AbstractC12782ctV abstractC12782ctV, java.lang.String str, boolean z) {
        if (arrayList.isEmpty()) {
            this.OLrzqt.setValue(1);
            return;
        }
        if (z) {
            KWHzl(abstractC12782ctV, abstractActivityC33041mov, arrayList, str);
            return;
        }
        this.OLrzqt.setValue(2);
        fGL.TaskDescription taskDescription = fGL.Companion;
        java.lang.String mpcId = mpcWalletDecodeInfo.getMpcId();
        java.lang.String uid = mpcWalletDecodeInfo.getUid();
        AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
        java.lang.String strEZpvd = abstractC12784ctXGwTjWJ != null ? abstractC12784ctXGwTjWJ.EZpvd() : null;
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        taskDescription.KWHzl(abstractActivityC33041mov, mpcId, uid, strEZpvd, C33129mqd.AYXKKw(java.lang.Integer.valueOf(abstractC12782ctV.finit())), arrayList);
        gEmmrt();
    }

    public final void KWHzl(final AbstractC12782ctV abstractC12782ctV, final android.app.Activity activity, final java.util.ArrayList<MpcPrivateKeyItem> arrayList, final java.lang.String str) {
        java.lang.String uid;
        java.lang.String mpcId;
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
        java.lang.String str2 = (mpcWalletEncodeInfoQSBOWP == null || (mpcId = mpcWalletEncodeInfoQSBOWP.getMpcId()) == null) ? "" : mpcId;
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP2 = abstractC12782ctV.QSBOWP();
        java.lang.String str3 = (mpcWalletEncodeInfoQSBOWP2 == null || (uid = mpcWalletEncodeInfoQSBOWP2.getUid()) == null) ? "" : uid;
        AbstractC58185ywX<ResponseData<SyncMpcEscapeStatusRes>> abstractC58185ywXEZpvd = this.AYXKKw.EZpvd(abstractC12782ctV.USBtdM(), abstractC12782ctV.DbNXlk(), abstractC12782ctV.aUsmxb(), str2, str3);
        final java.lang.String str4 = str2;
        final java.lang.String str5 = str3;
        final Function1 function1 = new Function1() { // from class: o.fHD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fGT.copydefault(abstractC12782ctV, this, str, activity, str4, str5, arrayList, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<SyncMpcEscapeStatusRes>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fHH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fGT.gkJEwt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.fHE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fGT.DbNXlk(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fHF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fGT.QKudOq(function12, obj);
            }
        }));
    }

    public static final void gkJEwt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(final AbstractC12782ctV abstractC12782ctV, final fGT fgt, final java.lang.String str, final android.app.Activity activity, final java.lang.String str2, final java.lang.String str3, final java.util.ArrayList arrayList, ResponseData responseData) {
        java.lang.Integer resultCode;
        int code = responseData.getCode();
        if (code == 0) {
            SyncMpcEscapeStatusRes syncMpcEscapeStatusRes = (SyncMpcEscapeStatusRes) responseData.getData();
            if (syncMpcEscapeStatusRes != null && (resultCode = syncMpcEscapeStatusRes.getResultCode()) != null && resultCode.intValue() == 0) {
                MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
                final java.lang.Integer numValueOf = mpcWalletEncodeInfoQSBOWP != null ? java.lang.Integer.valueOf(mpcWalletEncodeInfoQSBOWP.getStatus()) : null;
                MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP2 = abstractC12782ctV.QSBOWP();
                final java.lang.Integer numValueOf2 = mpcWalletEncodeInfoQSBOWP2 != null ? java.lang.Integer.valueOf(mpcWalletEncodeInfoQSBOWP2.isEscape()) : null;
                MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP3 = abstractC12782ctV.QSBOWP();
                final java.lang.String encryptShareKey = mpcWalletEncodeInfoQSBOWP3 != null ? mpcWalletEncodeInfoQSBOWP3.getEncryptShareKey() : null;
                C10854bwM c10854bwMIsConnected = C10954byG.EZpvd.valueOf().isConnected();
                AbstractC58260yxt<java.util.List<AbstractC12782ctV>> abstractC58260yxtKWHzl = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).KWHzl(abstractC12782ctV.EZpvd(c10854bwMIsConnected != null ? c10854bwMIsConnected.fetchVPNInfo() : -1L), abstractC12782ctV.QwvEab());
                final Function1 function1 = new Function1() { // from class: o.fIc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return fGT.copydefault(abstractC12782ctV, numValueOf, numValueOf2, encryptShareKey, (java.util.List) obj);
                    }
                };
                AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.fIl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return fGT.iZzfmt(function1, obj);
                    }
                });
                final Function1 function12 = new Function1() { // from class: o.fIh
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return fGT.KWHzl(this.AEQbTJ, str, activity, abstractC12782ctV, str2, str3, arrayList, (java.lang.Integer) obj);
                    }
                };
                InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fIj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        fGT.iRxXKY(function12, obj);
                    }
                };
                final Function1 function13 = new Function1() { // from class: o.fIk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return fGT.fetchVPNInfo(this.EZpvd, (java.lang.Throwable) obj);
                    }
                };
                fgt.call().AEQbTJ(abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fIi
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        fGT.hUfVAv(function13, obj);
                    }
                }));
            } else {
                fgt.OLrzqt.setValue(1);
            }
        } else if (code != 160001) {
            fgt.OLrzqt.setValue(1);
        } else {
            C55326xho.toast$default(C13754dXa.FragmentManager.performMenuItemShortcut, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final InterfaceC58261yxu iZzfmt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(AbstractC12782ctV abstractC12782ctV, java.lang.Integer num, java.lang.Integer num2, java.lang.String str, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            AbstractC58260yxt abstractC58260yxtUpdateMpcWalletInfo$default = AbstractC12782ctV.updateMpcWalletInfo$default(abstractC12782ctV, null, num, null, null, num2, str, null, 77, null);
            final Function1 function1 = new Function1() { // from class: o.fHf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fGT.valueOf((java.lang.Integer) obj);
                }
            };
            return abstractC58260yxtUpdateMpcWalletInfo$default.copydefault(new InterfaceC58229yxO() { // from class: o.fHe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return fGT.giSNqX(function1, obj);
                }
            });
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        AbstractC58260yxt abstractC58260yxtUpdateMpcWalletInfo$default2 = AbstractC12782ctV.updateMpcWalletInfo$default(abstractC12782ctV, null, num, null, null, num2, str, null, 77, null);
        AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV2.QSBOWP();
        java.lang.String mpcId = mpcWalletEncodeInfoQSBOWP != null ? mpcWalletEncodeInfoQSBOWP.getMpcId() : null;
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP2 = abstractC12782ctV.QSBOWP();
        if (Intrinsics.EZpvd((java.lang.Object) mpcId, (java.lang.Object) (mpcWalletEncodeInfoQSBOWP2 != null ? mpcWalletEncodeInfoQSBOWP2.getMpcId() : null))) {
            arrayList.add(AbstractC12782ctV.updateMpcWalletInfo$default(abstractC12782ctV2, null, num, null, null, num2, str, null, 77, null));
        }
        arrayList.add(abstractC58260yxtUpdateMpcWalletInfo$default2);
        AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(arrayList);
        final Function1 function12 = new Function1() { // from class: o.fHg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fGT.gEmmrt((java.util.List) obj);
            }
        };
        return abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.fHn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fGT.AxsJAYaxsJAY(function12, obj);
            }
        });
    }

    public static final java.lang.Integer giSNqX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final java.lang.Integer AxsJAYaxsJAY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final java.lang.Integer gEmmrt(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return java.lang.Integer.valueOf(list.size());
    }

    public static final void iRxXKY(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(fGT fgt, java.lang.String str, android.app.Activity activity, AbstractC12782ctV abstractC12782ctV, java.lang.String str2, java.lang.String str3, java.util.ArrayList arrayList, java.lang.Integer num) {
        java.lang.String strEZpvd;
        fgt.OLrzqt.setValue(2);
        java.lang.String str4 = "";
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "DefiWalletDetailActivity")) {
            ActivityC17448fFs.Activity activity2 = ActivityC17448fFs.Companion;
            AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
            if (abstractC12784ctXGwTjWJ != null && (strEZpvd = abstractC12784ctXGwTjWJ.EZpvd()) != null) {
                str4 = strEZpvd;
            }
            activity2.KWHzl(activity, str4);
        } else {
            fGL.TaskDescription taskDescription = fGL.Companion;
            AbstractC12784ctX abstractC12784ctXGwTjWJ2 = abstractC12782ctV.gwTjWJ();
            java.lang.String strEZpvd2 = abstractC12784ctXGwTjWJ2 != null ? abstractC12784ctXGwTjWJ2.EZpvd() : null;
            taskDescription.KWHzl(activity, str2, str3, strEZpvd2 == null ? "" : strEZpvd2, C33129mqd.AYXKKw(java.lang.Integer.valueOf(abstractC12782ctV.finit())), arrayList);
        }
        activity.finish();
        fgt.gEmmrt();
        return Unit.INSTANCE;
    }

    public static final void hUfVAv(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit fetchVPNInfo(fGT fgt, java.lang.Throwable th) {
        fgt.OLrzqt.setValue(1);
        pUU.copydefault(fgt.gEmmrt, "syncShareEscapeStatus--->queryAAWallet error message :" + th.getMessage());
        return Unit.INSTANCE;
    }

    public static final void QKudOq(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit DbNXlk(fGT fgt, java.lang.Throwable th) {
        fgt.OLrzqt.setValue(1);
        pUU.copydefault(fgt.gEmmrt, "syncShareEscapeStatus error message :" + th.getMessage());
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd DTwDnp(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<AbstractC12782ctV> abstractC58185ywXEZpvd = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str, true).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.fHu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fGT.KWHzl(this.EZpvd, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.fHx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fGT.DTwDnp(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.fHC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fGT.copydefault(this.KWHzl, (BackupCloudTypeRes) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fHA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fGT.QKVWgx(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.fHy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fGT.AhwBna(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58227yxM<? super R>) interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fHz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fGT.QOLQEE(function13, obj);
            }
        }));
    }

    public static final InterfaceC60096zvd KWHzl(fGT fgt, AbstractC12782ctV abstractC12782ctV) {
        java.lang.String mpcId;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        C13934dbu c13934dbu = fgt.AYXKKw;
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
        if (mpcWalletEncodeInfoQSBOWP == null || (mpcId = mpcWalletEncodeInfoQSBOWP.getMpcId()) == null) {
            mpcId = "";
        }
        return C43423rox.unwrapResponseData$default(c13934dbu.EZpvd(mpcId, ""), (Function1) null, 1, (java.lang.Object) null);
    }

    public static final void QKVWgx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(fGT fgt, BackupCloudTypeRes backupCloudTypeRes) {
        fgt.KWHzl.setValue(java.lang.Integer.valueOf(backupCloudTypeRes.getBackupCloudType()));
        return Unit.INSTANCE;
    }

    public static final void QOLQEE(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AhwBna(fGT fgt, java.lang.Throwable th) {
        fgt.KWHzl.setValue(0);
        pUU.copydefault(fgt.gEmmrt, "getBackupCloudType error message :" + th.getMessage());
        return Unit.INSTANCE;
    }

    public static final void QVAiDq(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(this.AYXKKw.EZpvd(str, ""), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.fHZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fGT.KWHzl(this.KWHzl, (BackupCloudTypeRes) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fId
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fGT.QVAiDq(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.fIe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fGT.gEmmrt(this.copydefault, (java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fIg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fGT.QfsBiF(function12, obj);
            }
        }));
    }

    public static final Unit KWHzl(fGT fgt, BackupCloudTypeRes backupCloudTypeRes) {
        fgt.KWHzl.setValue(java.lang.Integer.valueOf(backupCloudTypeRes.getBackupCloudType()));
        return Unit.INSTANCE;
    }

    public static final void QfsBiF(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(fGT fgt, java.lang.Throwable th) {
        fgt.KWHzl.setValue(0);
        pUU.copydefault(fgt.gEmmrt, "getBackupCloudTypeByMpcId error message :" + th.getMessage());
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        AbstractC58260yxt abstractC58260yxtCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            AbstractC58260yxt<java.util.List<AbstractC12784ctX>> abstractC58260yxtKWHzl = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).KWHzl(WalletType.MPCWallet);
            final Function1 function1 = new Function1() { // from class: o.fGW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fGT.KWHzl((java.util.List) obj);
                }
            };
            abstractC58260yxtCopydefault = abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.fGY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return fGT.QUSxYX(function1, obj);
                }
            });
        } else {
            AbstractC58260yxt<AbstractC12784ctX> abstractC58260yxtDjBIcL = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).djBIcL(str);
            final Function1 function12 = new Function1() { // from class: o.fGU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fGT.OLrzqt((AbstractC12784ctX) obj);
                }
            };
            abstractC58260yxtCopydefault = abstractC58260yxtDjBIcL.copydefault(new InterfaceC58229yxO() { // from class: o.fHd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return fGT.QbewEr(function12, obj);
                }
            });
        }
        final Function1 function13 = new Function1() { // from class: o.fGZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fGT.OLrzqt(this.EZpvd, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fHb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fGT.RJOkX(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.fHa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fGT.isConnected(this.copydefault, (java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fHi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fGT.aKErDB(function14, obj);
            }
        }));
    }

    public static final java.util.List QUSxYX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List OLrzqt(AbstractC12784ctX abstractC12784ctX) {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        return C56402yEa.EZpvd(abstractC12784ctX);
    }

    public static final java.util.List QbewEr(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final void RJOkX(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(fGT fgt, java.util.List list) {
        Intrinsics.copydefault(list);
        fgt.copydefault.setValue(fgt.AkhnZx(list));
        return Unit.INSTANCE;
    }

    public static final void aKErDB(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit isConnected(fGT fgt, java.lang.Throwable th) {
        pUU.copydefault(fgt.gEmmrt, "getListData error message :" + th.getMessage());
        return Unit.INSTANCE;
    }

    public final java.util.List<fDL<java.lang.Object>> AkhnZx(java.util.List<? extends AbstractC12784ctX> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<? extends AbstractC12784ctX> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AEQbTJ(it.next()));
            arrayList.add(new fED());
        }
        arrayList.remove(yDY.AuCTel(arrayList));
        return arrayList;
    }

    public final ActivityC17448fFs.Application AEQbTJ(AbstractC12784ctX abstractC12784ctX) {
        return new ActivityC17448fFs.Application(abstractC12784ctX, false, 2, null);
    }

    public final void KWHzl(@NotNull AbstractC12784ctX abstractC12784ctX, boolean z) {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        SPUtils.commit(EZpvd(abstractC12784ctX), java.lang.Boolean.valueOf(z));
    }

    public final boolean KWHzl(@NotNull AbstractC12784ctX abstractC12784ctX) {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        return SPUtils.getBoolean(EZpvd(abstractC12784ctX), true);
    }

    public final java.lang.String EZpvd(AbstractC12784ctX abstractC12784ctX) {
        return "MpcEscapeListPageExpandStatus" + abstractC12784ctX.EZpvd();
    }

    public final void AYXKKw(java.util.List<MpcPrivateKeyItem> list) {
        java.lang.Object next;
        java.util.ArrayList<C10854bwM> arrayList = this.EZpvd;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Long.valueOf(((C10854bwM) it.next()).fetchVPNInfo()));
        }
        java.util.Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(java.lang.Long.valueOf(((MpcPrivateKeyItem) it2.next()).getChainId()));
        }
        java.util.Set setAYXKKw = CollectionsKt___CollectionsKt.AYXKKw((java.lang.Iterable) setOqFWZa, (java.lang.Iterable) CollectionsKt___CollectionsKt.OqFWZa(arrayList3));
        if (!(!setAYXKKw.isEmpty())) {
            return;
        }
        java.util.Iterator it3 = setAYXKKw.iterator();
        java.lang.String str = "";
        while (true) {
            java.lang.String strIwGUEr = null;
            if (it3.hasNext()) {
                long jLongValue = ((java.lang.Number) it3.next()).longValue();
                java.util.Iterator<T> it4 = this.EZpvd.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it4.next();
                        if (jLongValue == ((C10854bwM) next).fetchVPNInfo()) {
                            break;
                        }
                    }
                }
                C10854bwM c10854bwM = (C10854bwM) next;
                java.lang.Long lValueOf = c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.fetchVPNInfo()) : null;
                java.lang.Long lValueOf2 = c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.QKVWgx()) : null;
                if (c10854bwM != null) {
                    strIwGUEr = c10854bwM.iwGUEr();
                }
                str = ((java.lang.Object) str) + lValueOf + "--" + lValueOf2 + "--" + strIwGUEr + ">>";
            } else {
                java.lang.String str2 = this.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(str2, "");
                C10856bwO.EZpvd(str2, new OKWException(str, null));
                pUU.copydefault(this.gEmmrt, "tractEvent reportError :" + ((java.lang.Object) str));
                return;
            }
        }
    }

    public static final kotlin.Pair KWHzl(fGT fgt, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.util.List<EscapeCoinMetaBean> listAhwBna = (java.util.List) responseData.getData();
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            fgt.djBIcL(listAhwBna);
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, fgt.EZpvd);
        }
        fgt.EZpvd.clear();
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, new java.util.ArrayList(0));
    }

    public static final java.util.List KWHzl(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((AbstractC12784ctX) obj).AYXKKw()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
