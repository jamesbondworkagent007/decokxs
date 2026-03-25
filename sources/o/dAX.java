package o;

import androidx.core.view.PointerIconCompat;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.api.constant.ChainRegisterStatus;
import com.okinc.business.defi.dapp.net.OKCheckLeveldappInfo;
import com.okinc.business.defi.dapp.net.WalletSelectDappCustomParams;
import com.okinc.business.defi.dapp.webview.DappTabData;
import com.okinc.wallet.api.MpcWalletService;
import com.okinc.wallet.api.bean.DappSupportCheck;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class dAX {
    public WeakReference<FragmentActivity> AEQbTJ;
    public int EZpvd;
    public WeakReference<dES> KWHzl;
    public InterfaceC9738bbJ OLrzqt;
    public PlatformItem copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(PlatformItem platformItem) {
        this.copydefault = platformItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WeakReference<FragmentActivity> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull WeakReference<dES> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        this.KWHzl = weakReference;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(InterfaceC9738bbJ interfaceC9738bbJ) {
        this.OLrzqt = interfaceC9738bbJ;
    }

    public void EZpvd(InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l, java.util.HashMap<java.lang.String, java.lang.Object> map) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC9738bbJ OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WeakReference<dES> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull WeakReference<FragmentActivity> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        this.AEQbTJ = weakReference;
    }

    public dAX(int i, @NotNull WeakReference<FragmentActivity> weakReference, @NotNull WeakReference<dES> weakReference2) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        Intrinsics.checkNotNullParameter(weakReference2, "");
        this.EZpvd = i;
        this.AEQbTJ = weakReference;
        this.KWHzl = weakReference2;
    }

    public final PlatformItem AEQbTJ() {
        java.lang.String url;
        C13241dEa mWebView;
        java.lang.String logo;
        PlatformItem platformItem;
        java.lang.String mTitle;
        java.lang.String mTitle2;
        C13241dEa mWebView2;
        C15112dyF c15112dyF = C15112dyF.AEQbTJ;
        DappTabData dappTabDataOLrzqt = c15112dyF.OLrzqt();
        if (dappTabDataOLrzqt == null || (mWebView2 = dappTabDataOLrzqt.getMWebView()) == null || (url = mWebView2.fARcdN()) == null) {
            DappTabData dappTabDataOLrzqt2 = c15112dyF.OLrzqt();
            url = (dappTabDataOLrzqt2 == null || (mWebView = dappTabDataOLrzqt2.getMWebView()) == null) ? null : mWebView.getUrl();
        }
        PlatformItem platformItem2 = this.copydefault;
        java.lang.String str = "";
        if (platformItem2 == null) {
            java.lang.String strAEQbTJ = C14923duc.EZpvd.AEQbTJ(url);
            java.lang.String str2 = url == null ? "" : url;
            DappTabData dappTabDataOLrzqt3 = c15112dyF.OLrzqt();
            this.copydefault = new PlatformItem(0L, (dappTabDataOLrzqt3 == null || (mTitle2 = dappTabDataOLrzqt3.getMTitle()) == null) ? "" : mTitle2, strAEQbTJ, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, str2, (java.lang.String) null, 0L, 0, (java.lang.String) null, (java.lang.String) null, 16121, (DefaultConstructorMarker) null);
        } else {
            if (platformItem2 != null) {
                platformItem2.setUrl(url == null ? "" : url);
            }
            PlatformItem platformItem3 = this.copydefault;
            if (platformItem3 != null) {
                DappTabData dappTabDataOLrzqt4 = c15112dyF.OLrzqt();
                if (dappTabDataOLrzqt4 != null && (mTitle = dappTabDataOLrzqt4.getMTitle()) != null) {
                    str = mTitle;
                }
                platformItem3.setPlatform(str);
            }
            PlatformItem platformItem4 = this.copydefault;
            if (platformItem4 != null && (logo = platformItem4.getLogo()) != null && logo.length() == 0 && (platformItem = this.copydefault) != null) {
                platformItem.setLogo(C14923duc.EZpvd.AEQbTJ(url));
            }
        }
        return this.copydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.dAX */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void requestAccounts$default(dAX dax, long j, java.util.HashMap map, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestAccounts");
        }
        if ((i & 2) != 0) {
            map = null;
        }
        dax.KWHzl(j, (java.util.HashMap<java.lang.String, java.lang.Object>) map);
    }

    public final void KWHzl(final long j, final java.util.HashMap<java.lang.String, java.lang.Object> map) {
        C13241dEa mWebView;
        PlatformItem platformItemAEQbTJ = AEQbTJ();
        if (platformItemAEQbTJ != null && platformItemAEQbTJ.getId() == 0) {
            FragmentActivity fragmentActivity = this.AEQbTJ.get();
            if (fragmentActivity != null) {
                C14923duc c14923duc = C14923duc.EZpvd;
                DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
                C14923duc.checkUrl$default(c14923duc, fragmentActivity, (dappTabDataOLrzqt == null || (mWebView = dappTabDataOLrzqt.getMWebView()) == null) ? null : mWebView.getUrl(), null, null, null, null, null, null, null, null, new yHO() { // from class: o.dBf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.yHO
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return dAX.KWHzl(this.EZpvd, j, map, ((java.lang.Boolean) obj).booleanValue(), ((java.lang.Boolean) obj2).booleanValue(), (OKCheckLeveldappInfo) obj3);
                    }
                }, PointerIconCompat.TYPE_GRAB, null);
                return;
            }
            return;
        }
        AEQbTJ(j, map);
    }

    public static final Unit KWHzl(dAX dax, long j, java.util.HashMap map, boolean z, boolean z2, OKCheckLeveldappInfo oKCheckLeveldappInfo) {
        dax.AEQbTJ(j, (java.util.HashMap<java.lang.String, java.lang.Object>) map);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.dAX */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onWalletAndNetSelect$default(dAX dax, InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l, java.util.HashMap map, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onWalletAndNetSelect");
        }
        if ((i & 4) != 0) {
            map = null;
        }
        dax.EZpvd(interfaceC9738bbJ, l, (java.util.HashMap<java.lang.String, java.lang.Object>) map);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.dAX */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getWalletByNetWork$default(dAX dax, long j, java.util.HashMap map, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWalletByNetWork");
        }
        if ((i & 2) != 0) {
            map = null;
        }
        dax.AEQbTJ(j, (java.util.HashMap<java.lang.String, java.lang.Object>) map);
    }

    public final void AEQbTJ(final long j, final java.util.HashMap<java.lang.String, java.lang.Object> map) {
        C14923duc c14923duc = C14923duc.EZpvd;
        if (!c14923duc.zsXlph()) {
            final FragmentActivity fragmentActivity = this.AEQbTJ.get();
            if (fragmentActivity != null) {
                kotlin.Pair<java.lang.String, java.lang.String> pairAuCTel = c14923duc.AuCTel();
                androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                c14923duc.copydefault(pairAuCTel, supportFragmentManager, new Function0() { // from class: o.dBx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return dAX.EZpvd(fragmentActivity, this, j, map);
                    }
                }, new Function0() { // from class: o.dBt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return dAX.OLrzqt(this.AEQbTJ, j, map);
                    }
                });
                return;
            }
            return;
        }
        EZpvd(j, map);
    }

    public static final Unit EZpvd(FragmentActivity fragmentActivity, final dAX dax, long j, final java.util.HashMap map) {
        dES des;
        if (!fragmentActivity.isDestroyed() && (des = dax.KWHzl.get()) != null) {
            des.AEQbTJ(java.lang.Long.valueOf(j), new Function2() { // from class: o.dBp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return dAX.AEQbTJ(this.OLrzqt, map, (InterfaceC9738bbJ) obj, (java.lang.Long) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(dAX dax, java.util.HashMap map, InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l) {
        dax.EZpvd(interfaceC9738bbJ, l, (java.util.HashMap<java.lang.String, java.lang.Object>) map);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(dAX dax, long j, java.util.HashMap map) {
        dax.EZpvd((InterfaceC9738bbJ) null, java.lang.Long.valueOf(j), (java.util.HashMap<java.lang.String, java.lang.Object>) map);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.dAX */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getWalletByNetWorkInner$default(dAX dax, long j, java.util.HashMap map, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWalletByNetWorkInner");
        }
        if ((i & 2) != 0) {
            map = null;
        }
        dax.EZpvd(j, (java.util.HashMap<java.lang.String, java.lang.Object>) map);
    }

    public final void EZpvd(final long j, final java.util.HashMap<java.lang.String, java.lang.Object> map) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(1);
        final Function1 function1 = new Function1() { // from class: o.dAU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dAX.AEQbTJ((java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.dBa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return dAX.fIwbmz(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.dBh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dAX.AEQbTJ((InterfaceC9738bbJ) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.dBe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return dAX.valueOf(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.dBg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dAX.OLrzqt(objectRef, j, (InterfaceC9738bbJ) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.OLrzqt(new InterfaceC58229yxO() { // from class: o.dBi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return dAX.AkhnZx(function13, obj);
            }
        });
        final Function1 function14 = new Function1() { // from class: o.dBl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dAX.OLrzqt(objectRef, j, this, map, (ChainRegisterStatus) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt4 = abstractC58260yxtOLrzqt3.OLrzqt(new InterfaceC58229yxO() { // from class: o.dBj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return dAX.fetchVPNInfo(function14, obj);
            }
        });
        final Function1 function15 = new Function1() { // from class: o.dBk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dAX.EZpvd(j, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault2 = abstractC58260yxtOLrzqt4.copydefault(new InterfaceC58229yxO() { // from class: o.dBn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return dAX.values(function15, obj);
            }
        });
        final Function1 function16 = new Function1() { // from class: o.dBc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dAX.copydefault(this.KWHzl, j, map, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dBd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dAX.DbNXlk(function16, obj);
            }
        };
        final Function1 function17 = new Function1() { // from class: o.dBb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dAX.OLrzqt(this.EZpvd, j, map, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtCopydefault2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dAZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dAX.isConnected(function17, obj);
            }
        });
    }

    public static final InterfaceC58261yxu fIwbmz(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).gEmmrt().KWHzl();
    }

    public static final InterfaceC58261yxu valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(final InterfaceC9738bbJ interfaceC9738bbJ) {
        java.lang.String mUrl;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        C14923duc c14923duc = C14923duc.EZpvd;
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        if (dappTabDataOLrzqt != null && (mUrl = dappTabDataOLrzqt.getMUrl()) != null) {
            str = mUrl;
        }
        final java.lang.String strKWHzl = c14923duc.KWHzl(str);
        DappSupportCheck dappSupportCheckEZpvd = C15196dzk.KWHzl.EZpvd(strKWHzl);
        if ((interfaceC9738bbJ.wlaJM() || interfaceC9738bbJ.ORxRYg() || interfaceC9738bbJ.getFieldNames()) && dappSupportCheckEZpvd == null) {
            AbstractC58185ywX<DappSupportCheck> abstractC58185ywXJ_ = ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).j_(strKWHzl);
            final Function1 function1 = new Function1() { // from class: o.dAY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dAX.OLrzqt(strKWHzl, interfaceC9738bbJ, (DappSupportCheck) obj);
                }
            };
            return abstractC58185ywXJ_.AEQbTJ(new InterfaceC58229yxO() { // from class: o.dAW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return dAX.gEmmrt(function1, obj);
                }
            }).OLrzqt(interfaceC9738bbJ);
        }
        return AbstractC58260yxt.copydefault(interfaceC9738bbJ);
    }

    public static final InterfaceC9738bbJ gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC9738bbJ) function1.invoke(obj);
    }

    public static final InterfaceC9738bbJ OLrzqt(java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ, DappSupportCheck dappSupportCheck) {
        Intrinsics.checkNotNullParameter(dappSupportCheck, "");
        C15157dyy.EZpvd.OLrzqt().put(str, dappSupportCheck);
        return interfaceC9738bbJ;
    }

    public static final InterfaceC58261yxu AkhnZx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.bbJ */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC58261yxu OLrzqt(Ref.ObjectRef objectRef, long j, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        objectRef.element = interfaceC9738bbJ;
        return ((InterfaceC9844bdJ) C43248rlh.KWHzl.AEQbTJ(InterfaceC9844bdJ.class)).AEQbTJ(j, interfaceC9738bbJ.EZpvd(j)).OLrzqt(ChainRegisterStatus.UNREGISTERED);
    }

    public static final InterfaceC58261yxu fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.dzk.walletIsAvailable$default(o.dzk, java.lang.String, java.lang.Long, java.lang.Boolean, com.okinc.business.defi.dapp.net.WalletSelectDappCustomParams, java.lang.Boolean, int, java.lang.Object):boolean */
    public static final InterfaceC58261yxu OLrzqt(Ref.ObjectRef objectRef, long j, dAX dax, java.util.HashMap map, ChainRegisterStatus chainRegisterStatus) {
        java.lang.String mUrl;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(chainRegisterStatus, "");
        if (chainRegisterStatus == ChainRegisterStatus.REGISTERED) {
            C15196dzk c15196dzk = C15196dzk.KWHzl;
            T t = objectRef.element;
            Intrinsics.copydefault(t);
            java.lang.String strDbNXlk = ((InterfaceC9738bbJ) t).DbNXlk();
            PlatformItem platformItemAEQbTJ = dax.AEQbTJ();
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(platformItemAEQbTJ != null ? java.lang.Long.valueOf(platformItemAEQbTJ.getId()) : null);
            C15112dyF c15112dyF = C15112dyF.AEQbTJ;
            DappTabData dappTabDataOLrzqt = c15112dyF.OLrzqt();
            java.lang.String mUrl2 = dappTabDataOLrzqt != null ? dappTabDataOLrzqt.getMUrl() : null;
            PlatformItem platformItemAEQbTJ2 = dax.AEQbTJ();
            java.lang.String category = platformItemAEQbTJ2 != null ? platformItemAEQbTJ2.getCategory() : null;
            C14923duc c14923duc = C14923duc.EZpvd;
            DappTabData dappTabDataOLrzqt2 = c15112dyF.OLrzqt();
            if (dappTabDataOLrzqt2 != null && (mUrl = dappTabDataOLrzqt2.getMUrl()) != null) {
                str = mUrl;
            }
            if (C15196dzk.walletIsAvailable$default(c15196dzk, strDbNXlk, java.lang.Long.valueOf(j), null, new WalletSelectDappCustomParams(mUrl2, strGEmmrt, category, c15196dzk.EZpvd(c14923duc.KWHzl(str)), true), null, 20, null)) {
                dax.EZpvd((InterfaceC9738bbJ) objectRef.element, java.lang.Long.valueOf(j), (java.util.HashMap<java.lang.String, java.lang.Object>) map);
                return AbstractC58260yxt.AEQbTJ();
            }
        }
        return ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).gEmmrt().gEmmrt();
    }

    public static final java.lang.Boolean values(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(final dAX dax, final long j, final java.util.HashMap map, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            dES des = dax.KWHzl.get();
            if (des != null) {
                des.AEQbTJ(java.lang.Long.valueOf(j), new Function2() { // from class: o.dBs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return dAX.OLrzqt(this.OLrzqt, map, (InterfaceC9738bbJ) obj, (java.lang.Long) obj2);
                    }
                });
            }
        } else {
            FragmentActivity fragmentActivity = dax.AEQbTJ.get();
            if (fragmentActivity != null) {
                C14923duc c14923duc = C14923duc.EZpvd;
                kotlin.Pair<java.lang.String, java.lang.String> pairUzCIH = c14923duc.uzCIH(java.lang.Long.valueOf(j));
                androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                c14923duc.copydefault(pairUzCIH, supportFragmentManager, new Function0() { // from class: o.dBo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return dAX.EZpvd(this.AEQbTJ, j, map);
                    }
                }, new Function0() { // from class: o.dBq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return dAX.AhwBna(this.KWHzl, j, map);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(dAX dax, java.util.HashMap map, InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l) {
        dax.EZpvd(interfaceC9738bbJ, l, (java.util.HashMap<java.lang.String, java.lang.Object>) map);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(final dAX dax, long j, final java.util.HashMap map) {
        dES des = dax.KWHzl.get();
        if (des != null) {
            des.AEQbTJ(java.lang.Long.valueOf(j), new Function2() { // from class: o.dBm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return dAX.valueOf(this.EZpvd, map, (InterfaceC9738bbJ) obj, (java.lang.Long) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(dAX dax, java.util.HashMap map, InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l) {
        dax.EZpvd(interfaceC9738bbJ, l, (java.util.HashMap<java.lang.String, java.lang.Object>) map);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(dAX dax, long j, java.util.HashMap map) {
        dax.EZpvd((InterfaceC9738bbJ) null, java.lang.Long.valueOf(j), (java.util.HashMap<java.lang.String, java.lang.Object>) map);
        return Unit.INSTANCE;
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(dAX dax, long j, java.util.HashMap map, java.lang.Throwable th) {
        dax.EZpvd((InterfaceC9738bbJ) null, java.lang.Long.valueOf(j), (java.util.HashMap<java.lang.String, java.lang.Object>) map);
        return Unit.INSTANCE;
    }

    public boolean KWHzl() {
        C13241dEa mWebView;
        java.lang.Object objRcXXUw;
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        if (dappTabDataOLrzqt == null || (mWebView = dappTabDataOLrzqt.getMWebView()) == null) {
            return false;
        }
        switch (this.EZpvd) {
            case 0:
                objRcXXUw = mWebView.RcXXUw();
                break;
            case 1:
                objRcXXUw = mWebView.QUSxYX();
                break;
            case 2:
            default:
                objRcXXUw = null;
                break;
            case 3:
                objRcXXUw = mWebView.gEmmrt();
                break;
            case 4:
                objRcXXUw = mWebView.QfsBiF();
                break;
            case 5:
                objRcXXUw = mWebView.AhwBna();
                break;
            case 6:
                objRcXXUw = mWebView.QVAiDq();
                break;
            case 7:
                objRcXXUw = mWebView.djBIcL();
                break;
            case 8:
                objRcXXUw = mWebView.AubY();
                break;
            case 9:
                objRcXXUw = mWebView.QbewEr();
                break;
        }
        Intrinsics.copydefault(objRcXXUw, "");
        return Intrinsics.EZpvd(this, (dAX) objRcXXUw);
    }

    public final void EZpvd(@NotNull final Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        FragmentActivity fragmentActivity = this.AEQbTJ.get();
        if (fragmentActivity != null) {
            fragmentActivity.runOnUiThread(new java.lang.Runnable() { // from class: o.dBr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    dAX.copydefault(function1);
                }
            });
        }
    }

    public static final void copydefault(Function1 function1) {
        dDN ddn = dDN.copydefault;
        DappTabData dappTabDataOLrzqt = C15112dyF.AEQbTJ.OLrzqt();
        ddn.AEQbTJ(dappTabDataOLrzqt != null ? dappTabDataOLrzqt.getMWebView() : null, (Function1<? super java.lang.String, Unit>) function1);
    }

    public static final java.lang.Boolean EZpvd(long j, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) obj;
            if (C14923duc.EZpvd.EZpvd(interfaceC9738bbJ, java.lang.Long.valueOf(j)) || interfaceC9738bbJ.fetchVPNInfo(j)) {
                arrayList.add(obj);
            }
        }
        return java.lang.Boolean.valueOf(C33129mqd.KWHzl((java.util.Collection) arrayList));
    }
}
