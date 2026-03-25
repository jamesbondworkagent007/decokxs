package o;

import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.assets.api.model.GoToWithdrawFromWalletResultContractArgs;
import com.okinc.business.defi.biz.core.tx.check.ChainCheckType;
import com.okinc.business.defi.biz.core.tx.check.ChainStatus;
import com.okinc.business.defi.biz.core.tx.check.ChainStatusChecker;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.RechargeBean;
import com.okinc.business.defi.biz.net.bean.RechargeNavigationBean;
import com.okinc.business.defi.wallet.transfer.recharge.RechargeManager$handleClick$1;
import com.okinc.business.defi.wallet.transfer.recharge.RechargeManager$isWithdrawSupported$1$1;
import com.okinc.business.dex.api.bean.ChainRequest;
import com.okinc.business.dex.api.bean.CoinInfo;
import com.okinc.business.dex.api.bean.SupportSwapCheck;
import com.okinc.business.dex.api.bean.TradeParam;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.wallet.api.bean.WalletRechargeBean;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C12827cuN;
import o.C13754dXa;
import o.C14140dfo;
import o.C21182gut;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.guC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21139guC {
    public static final C21139guC OLrzqt = new C21139guC();

    /* JADX INFO: renamed from: o.guC$Application */
    public static final class Application implements InterfaceC54859xXz {
        @Override // o.InterfaceC54859xXz
        public void EZpvd() {
        }
    }

    /* JADX INFO: renamed from: o.guC$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ChainStatus.values().length];
            try {
                iArr[ChainStatus.REGISTERED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ChainStatus.REGISTERING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    private C21139guC() {
    }

    public final AbstractC58185ywX<androidx.fragment.app.Fragment> EZpvd(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov, @NotNull final WalletRechargeBean walletRechargeBean) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(walletRechargeBean, "");
        abstractActivityC33041mov.showLoading();
        KWHzl(walletRechargeBean);
        return C57197ydq.KWHzl(new InterfaceC58187ywZ() { // from class: o.guP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C21139guC.AEQbTJ(abstractActivityC33041mov, walletRechargeBean, interfaceC58184ywW);
            }
        });
    }

    public static final void AEQbTJ(final AbstractActivityC33041mov abstractActivityC33041mov, final WalletRechargeBean walletRechargeBean, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        OLrzqt.copydefault(new Function1() { // from class: o.gvd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21139guC.copydefault(abstractActivityC33041mov, interfaceC58184ywW, walletRechargeBean, (AbstractC12782ctV) obj);
            }
        });
    }

    public static final Unit copydefault(final AbstractActivityC33041mov abstractActivityC33041mov, final InterfaceC58184ywW interfaceC58184ywW, final WalletRechargeBean walletRechargeBean, final AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV == null) {
            abstractActivityC33041mov.dismissLoading();
            C55326xho.toast$default(C13754dXa.FragmentManager.BackHandlerKt, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            interfaceC58184ywW.onComplete();
            return Unit.INSTANCE;
        }
        C10854bwM c10854bwMEZpvd = C10954byG.EZpvd.valueOf().EZpvd(walletRechargeBean.getTokenAddress(), C33129mqd.valueOf(walletRechargeBean.getChainId()));
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXOLrzqt = fPV.OLrzqt.OLrzqt(c10854bwMEZpvd != null ? c10854bwMEZpvd.AhwBna() : -1L, abstractC12782ctV);
        final Function1 function1 = new Function1() { // from class: o.guS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21139guC.KWHzl(abstractActivityC33041mov, walletRechargeBean, abstractC12782ctV, interfaceC58184ywW, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gvc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21139guC.fARcdN(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gvb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21139guC.EZpvd(abstractActivityC33041mov, walletRechargeBean, abstractC12782ctV, interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        };
        abstractActivityC33041mov.addDisposable(abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gve
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21139guC.fJNWhG(function12, obj);
            }
        }));
        return Unit.INSTANCE;
    }

    public static final void fARcdN(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(AbstractActivityC33041mov abstractActivityC33041mov, WalletRechargeBean walletRechargeBean, AbstractC12782ctV abstractC12782ctV, InterfaceC58184ywW interfaceC58184ywW, kotlin.Pair pair) {
        C21139guC c21139guC = OLrzqt;
        Intrinsics.copydefault(interfaceC58184ywW);
        c21139guC.EZpvd(abstractActivityC33041mov, walletRechargeBean, abstractC12782ctV, (InterfaceC58184ywW<androidx.fragment.app.Fragment>) interfaceC58184ywW, ((java.lang.Boolean) pair.getFirst()).booleanValue());
        return Unit.INSTANCE;
    }

    public static final void fJNWhG(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(AbstractActivityC33041mov abstractActivityC33041mov, WalletRechargeBean walletRechargeBean, AbstractC12782ctV abstractC12782ctV, InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        C21139guC c21139guC = OLrzqt;
        Intrinsics.copydefault(interfaceC58184ywW);
        generateGetRechargeFragment$default(c21139guC, abstractActivityC33041mov, walletRechargeBean, abstractC12782ctV, interfaceC58184ywW, false, 16, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void generateGetRechargeFragment$default(C21139guC c21139guC, AbstractActivityC33041mov abstractActivityC33041mov, WalletRechargeBean walletRechargeBean, AbstractC12782ctV abstractC12782ctV, InterfaceC58184ywW interfaceC58184ywW, boolean z, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        c21139guC.EZpvd(abstractActivityC33041mov, walletRechargeBean, abstractC12782ctV, (InterfaceC58184ywW<androidx.fragment.app.Fragment>) interfaceC58184ywW, z);
    }

    public final void EZpvd(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov, @NotNull final WalletRechargeBean walletRechargeBean, @NotNull final AbstractC12782ctV abstractC12782ctV, @NotNull final InterfaceC58184ywW<androidx.fragment.app.Fragment> interfaceC58184ywW, final boolean z) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(walletRechargeBean, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        final C10854bwM c10854bwMEZpvd = C10954byG.EZpvd.valueOf().EZpvd(walletRechargeBean.getTokenAddress(), C33129mqd.valueOf(walletRechargeBean.getChainId()));
        if (!abstractC12782ctV.zLjUOn()) {
            abstractActivityC33041mov.dismissLoading();
            C55326xho.toast$default(C13754dXa.FragmentManager.HJWChPdIKEqB, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            interfaceC58184ywW.onComplete();
            return;
        }
        if (abstractC12782ctV.zsXlph()) {
            abstractActivityC33041mov.dismissLoading();
            C14140dfo instance$default = C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null);
            androidx.fragment.app.FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            instance$default.EZpvd(supportFragmentManager, new Application(), 1);
            interfaceC58184ywW.onComplete();
            return;
        }
        if (!abstractC12782ctV.djBIcL(c10854bwMEZpvd != null ? java.lang.Long.valueOf(c10854bwMEZpvd.AhwBna()) : null) && !walletRechargeBean.getAddCustomToken()) {
            abstractActivityC33041mov.dismissLoading();
            C55326xho.toast$default(C13754dXa.FragmentManager.newHeartRating, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            interfaceC58184ywW.onComplete();
            return;
        }
        copydefault(abstractActivityC33041mov, abstractC12782ctV, c10854bwMEZpvd, interfaceC58184ywW, new Function0() { // from class: o.guE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C21139guC.AEQbTJ(abstractC12782ctV, c10854bwMEZpvd, walletRechargeBean, abstractActivityC33041mov, interfaceC58184ywW, z);
            }
        });
    }

    public static final Unit AEQbTJ(AbstractC12782ctV abstractC12782ctV, final C10854bwM c10854bwM, final WalletRechargeBean walletRechargeBean, final AbstractActivityC33041mov abstractActivityC33041mov, final InterfaceC58184ywW interfaceC58184ywW, final boolean z) {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        C21139guC c21139guC = OLrzqt;
        AbstractC58185ywX abstractC58185ywXCopydefault = AbstractC58185ywX.copydefault(c21139guC.AEQbTJ(abstractC12782ctV, c10854bwM, walletRechargeBean), c21139guC.OLrzqt(abstractC12782ctV, c10854bwM, walletRechargeBean), c21139guC.KWHzl(abstractActivityC33041mov, abstractC12782ctV, c10854bwM, walletRechargeBean), c21139guC.EZpvd(abstractC12782ctV, c10854bwM, walletRechargeBean));
        final Function1 function1 = new Function1() { // from class: o.guN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21139guC.copydefault(arrayList, abstractActivityC33041mov, interfaceC58184ywW, walletRechargeBean, c10854bwM, z, (kotlin.Pair) obj);
            }
        };
        abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58227yxM() { // from class: o.guL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21139guC.isConnected(function1, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.util.ArrayList arrayList, AbstractActivityC33041mov abstractActivityC33041mov, InterfaceC58184ywW interfaceC58184ywW, WalletRechargeBean walletRechargeBean, C10854bwM c10854bwM, boolean z, kotlin.Pair pair) {
        java.lang.String strCopydefault;
        if (pair.getSecond() != null) {
            java.lang.Object second = pair.getSecond();
            Intrinsics.copydefault(second);
            arrayList.add(second);
        }
        if (Intrinsics.EZpvd(pair.getFirst(), (java.lang.Object) "qr_code")) {
            abstractActivityC33041mov.dismissLoading();
            if (C33129mqd.valueOf(java.lang.Integer.valueOf(arrayList.size()), 1)) {
                interfaceC58184ywW.onNext(OLrzqt.AEQbTJ(((RechargeBean) arrayList.get(0)).getNavigationData()));
            } else {
                C21182gut.ActionBar actionBar = C21182gut.Companion;
                if (OLrzqt.OLrzqt(walletRechargeBean)) {
                    strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.isElapsedRealtimeNanosAvailable, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", C33129mqd.gEmmrt(c10854bwM != null ? c10854bwM.fJNWhG() : null))));
                } else {
                    strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.fMBJsc, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", C33129mqd.gEmmrt(c10854bwM != null ? c10854bwM.fJNWhG() : null))));
                }
                interfaceC58184ywW.onNext(actionBar.OLrzqt(strCopydefault, arrayList, z));
            }
            interfaceC58184ywW.onComplete();
        }
        return Unit.INSTANCE;
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void copydefault(final Function1<? super AbstractC12782ctV, Unit> function1) {
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
        final Function1 function12 = new Function1() { // from class: o.guH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21139guC.AEQbTJ(function1, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.guJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21139guC.AkhnZx(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.guG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21139guC.EZpvd(function1, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.guF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21139guC.AuCTel(function13, obj);
            }
        });
    }

    public static final Unit AEQbTJ(Function1 function1, AbstractC12782ctV abstractC12782ctV) {
        function1.invoke(abstractC12782ctV);
        return Unit.INSTANCE;
    }

    public static final void AuCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(Function1 function1, java.lang.Throwable th) {
        function1.invoke(null);
        return Unit.INSTANCE;
    }

    public final void copydefault(final AbstractActivityC33041mov abstractActivityC33041mov, final AbstractC12782ctV abstractC12782ctV, final C10854bwM c10854bwM, final InterfaceC58184ywW<androidx.fragment.app.Fragment> interfaceC58184ywW, final Function0<Unit> function0) {
        if (c10854bwM == null || !c10854bwM.DBxZfM()) {
            function0.invoke();
            return;
        }
        ChainStatusChecker chainStatusChecker = ChainStatusChecker.OLrzqt;
        long jAhwBna = c10854bwM.AhwBna();
        ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwM.AEQbTJ(), null, 2, null);
        java.lang.String address = chainAddressAddressFromChainId$default != null ? chainAddressAddressFromChainId$default.getAddress() : null;
        if (address == null) {
            address = "";
        }
        AbstractC58185ywX<ChainStatus> abstractC58185ywXOLrzqt = chainStatusChecker.OLrzqt(jAhwBna, address, c10854bwM.OLrzqt(), C56402yEa.EZpvd(ChainCheckType.CHECK_REGISTER));
        final Function1 function1 = new Function1() { // from class: o.guQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21139guC.KWHzl(function0, abstractActivityC33041mov, interfaceC58184ywW, abstractC12782ctV, c10854bwM, (ChainStatus) obj);
            }
        };
        InterfaceC58227yxM<? super ChainStatus> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.guV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21139guC.DbNXlk(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.guU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21139guC.copydefault(abstractActivityC33041mov, interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.guX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21139guC.values(function12, obj);
            }
        });
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(Function0 function0, AbstractActivityC33041mov abstractActivityC33041mov, InterfaceC58184ywW interfaceC58184ywW, AbstractC12782ctV abstractC12782ctV, C10854bwM c10854bwM, ChainStatus chainStatus) {
        int i = chainStatus == null ? -1 : TaskDescription.EZpvd[chainStatus.ordinal()];
        if (i == 1) {
            function0.invoke();
        } else if (i == 2) {
            abstractActivityC33041mov.dismissLoading();
            C14083dek.OLrzqt.KWHzl();
            interfaceC58184ywW.onComplete();
        } else {
            abstractActivityC33041mov.dismissLoading();
            C14083dek c14083dek = C14083dek.OLrzqt;
            androidx.fragment.app.FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            C14083dek.handleUnregisteredStatus$default(c14083dek, abstractActivityC33041mov, supportFragmentManager, abstractC12782ctV.DbNXlk(), c10854bwM.AhwBna(), null, 16, null);
            interfaceC58184ywW.onComplete();
        }
        return Unit.INSTANCE;
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(AbstractActivityC33041mov abstractActivityC33041mov, InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        abstractActivityC33041mov.dismissLoading();
        C55326xho.toast$default(C13754dXa.FragmentManager.DcMfJKffREWX, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.String, RechargeBean>> AEQbTJ(AbstractC12782ctV abstractC12782ctV, final C10854bwM c10854bwM, WalletRechargeBean walletRechargeBean) {
        boolean zDjBIcL = C14687dqE.OLrzqt.djBIcL();
        if (abstractC12782ctV.QfsBiF() || abstractC12782ctV.getFieldNames() || !copydefault(walletRechargeBean, "gas_station") || zDjBIcL) {
            AbstractC58185ywX<kotlin.Pair<java.lang.String, RechargeBean>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new kotlin.Pair("gas_station", null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        final java.lang.String strOLrzqt = OLrzqt(walletRechargeBean.getBizSource());
        return C57197ydq.KWHzl(new InterfaceC58187ywZ() { // from class: o.guM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C21139guC.copydefault(strOLrzqt, c10854bwM, interfaceC58184ywW);
            }
        });
    }

    public static final void copydefault(final java.lang.String str, final C10854bwM c10854bwM, final InterfaceC58184ywW interfaceC58184ywW) {
        InterfaceC9772bbr interfaceC9772bbr;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9772bbr.class));
        if (listKWHzl == null || (interfaceC9772bbr = (InterfaceC9772bbr) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) == null) {
            return;
        }
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXOLrzqt = interfaceC9772bbr.OLrzqt(str, C33129mqd.gEmmrt(c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.fetchVPNInfo()) : null));
        if (abstractC58185ywXOLrzqt != null) {
            final Function1 function1 = new Function1() { // from class: o.gvf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C21139guC.EZpvd(interfaceC58184ywW, c10854bwM, str, (java.lang.Boolean) obj);
                }
            };
            InterfaceC58227yxM<? super java.lang.Boolean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gvh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C21139guC.iwGUEr(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.gvg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C21139guC.copydefault(interfaceC58184ywW, (java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gvi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C21139guC.getFieldNames(function12, obj);
                }
            });
        }
    }

    public static final void iwGUEr(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(InterfaceC58184ywW interfaceC58184ywW, C10854bwM c10854bwM, java.lang.String str, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            C21139guC c21139guC = OLrzqt;
            Intrinsics.copydefault(interfaceC58184ywW);
            c21139guC.EZpvd((InterfaceC58184ywW<kotlin.Pair<java.lang.String, RechargeBean>>) interfaceC58184ywW, "gas_station", new RechargeBean("gas_station", C33070mpX.AYXKKw(C13754dXa.FragmentManager.RSmiaq), true, C33069mpW.copydefault(C13754dXa.FragmentManager.ORmwhf, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", C33129mqd.gEmmrt(c10854bwM != null ? c10854bwM.fJNWhG() : null)))), C13754dXa.Activity.iZzfmt, new RechargeNavigationBean((java.lang.String) null, C33129mqd.gEmmrt(c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.fetchVPNInfo()) : null), (java.lang.String) null, 0L, (java.lang.String) null, C33129mqd.gEmmrt(c10854bwM != null ? c10854bwM.fJNWhG() : null), (java.lang.String) null, false, 0, 0, (java.lang.String) null, false, false, false, false, (java.lang.String) null, str, 0, 196573, (DefaultConstructorMarker) null)));
        } else {
            C21139guC c21139guC2 = OLrzqt;
            Intrinsics.copydefault(interfaceC58184ywW);
            c21139guC2.EZpvd((InterfaceC58184ywW<kotlin.Pair<java.lang.String, RechargeBean>>) interfaceC58184ywW, "gas_station", (RechargeBean) null);
        }
        return Unit.INSTANCE;
    }

    public static final void getFieldNames(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        C21139guC c21139guC = OLrzqt;
        Intrinsics.copydefault(interfaceC58184ywW);
        c21139guC.EZpvd((InterfaceC58184ywW<kotlin.Pair<java.lang.String, RechargeBean>>) interfaceC58184ywW, "gas_station", (RechargeBean) null);
        return Unit.INSTANCE;
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.String, RechargeBean>> KWHzl(final AbstractActivityC33041mov abstractActivityC33041mov, final AbstractC12782ctV abstractC12782ctV, final C10854bwM c10854bwM, final WalletRechargeBean walletRechargeBean) {
        if (!copydefault(walletRechargeBean, "withdraw") || !C21027grx.copydefault.AEQbTJ() || !dZP.OLrzqt.valueOf() || C14728dqt.KWHzl.KWHzl()) {
            AbstractC58185ywX<kotlin.Pair<java.lang.String, RechargeBean>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new kotlin.Pair("withdraw", null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        return C57197ydq.KWHzl(new InterfaceC58187ywZ() { // from class: o.guI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C21139guC.OLrzqt(walletRechargeBean, c10854bwM, abstractActivityC33041mov, abstractC12782ctV, interfaceC58184ywW);
            }
        });
    }

    public static final void OLrzqt(WalletRechargeBean walletRechargeBean, C10854bwM c10854bwM, AbstractActivityC33041mov abstractActivityC33041mov, AbstractC12782ctV abstractC12782ctV, InterfaceC58184ywW interfaceC58184ywW) {
        java.lang.String strAYXKKw;
        java.lang.String strCopydefault;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        if (!dZP.OLrzqt.gEmmrt()) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041mov), null, null, new RechargeManager$isWithdrawSupported$1$1(c10854bwM, interfaceC58184ywW, walletRechargeBean, abstractC12782ctV, null), 3, null);
            return;
        }
        C21139guC c21139guC = OLrzqt;
        if (c21139guC.OLrzqt(walletRechargeBean)) {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.HJWChPRGtXKCDKRTZD);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.zEHIKV);
        }
        java.lang.String str = strAYXKKw;
        if (c21139guC.OLrzqt(walletRechargeBean)) {
            strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.getSerial, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", C33129mqd.gEmmrt(c10854bwM != null ? c10854bwM.fJNWhG() : null))));
        } else {
            strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.zDGrpR, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", C33129mqd.gEmmrt(c10854bwM != null ? c10854bwM.fJNWhG() : null))));
        }
        c21139guC.EZpvd((InterfaceC58184ywW<kotlin.Pair<java.lang.String, RechargeBean>>) interfaceC58184ywW, "withdraw", new RechargeBean("withdraw", str, false, strCopydefault, C13754dXa.Activity.QKudOq, new RechargeNavigationBean((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0L, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 0, 0, (java.lang.String) null, false, false, false, false, (java.lang.String) null, (java.lang.String) null, 0, 262143, (DefaultConstructorMarker) null)));
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.String, RechargeBean>> EZpvd(AbstractC12782ctV abstractC12782ctV, C10854bwM c10854bwM, WalletRechargeBean walletRechargeBean) {
        java.lang.String strAYXKKw;
        java.lang.String strCopydefault;
        if (OLrzqt(walletRechargeBean)) {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.RWIpjU);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.OijiEz);
        }
        java.lang.String str = strAYXKKw;
        if (OLrzqt(walletRechargeBean)) {
            strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.gCNefq, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", C33129mqd.gEmmrt(c10854bwM != null ? c10854bwM.fJNWhG() : null))));
        } else {
            strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.UfveVb, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", C33129mqd.gEmmrt(c10854bwM != null ? c10854bwM.fJNWhG() : null))));
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.String, RechargeBean>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new kotlin.Pair("qr_code", new RechargeBean("qr_code", str, false, strCopydefault, C13754dXa.Activity.accept, new RechargeNavigationBean(abstractC12782ctV.DbNXlk(), walletRechargeBean.getChainId(), walletRechargeBean.getTokenAddress(), C33129mqd.valueOf(c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.AhwBna()) : null), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 0, 0, (java.lang.String) null, false, false, walletRechargeBean.getAddCustomToken(), c10854bwM == null, walletRechargeBean.getTip(), (java.lang.String) null, walletRechargeBean.getAddressType(), 73712, (DefaultConstructorMarker) null))));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.String, RechargeBean>> OLrzqt(final AbstractC12782ctV abstractC12782ctV, final C10854bwM c10854bwM, final WalletRechargeBean walletRechargeBean) {
        boolean zDjBIcL = C14687dqE.OLrzqt.djBIcL();
        if (abstractC12782ctV.QfsBiF() || !copydefault(walletRechargeBean, "dex") || zDjBIcL || (c10854bwM != null && C10854bwM.isXRCToken$default(c10854bwM, null, 1, null))) {
            AbstractC58185ywX<kotlin.Pair<java.lang.String, RechargeBean>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new kotlin.Pair("dex", null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        final java.lang.String strOLrzqt = OLrzqt(walletRechargeBean.getBizSource());
        return C57197ydq.KWHzl(new InterfaceC58187ywZ() { // from class: o.guO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C21139guC.EZpvd(strOLrzqt, c10854bwM, walletRechargeBean, abstractC12782ctV, interfaceC58184ywW);
            }
        });
    }

    public static final void EZpvd(final java.lang.String str, final C10854bwM c10854bwM, final WalletRechargeBean walletRechargeBean, final AbstractC12782ctV abstractC12782ctV, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        AbstractC58185ywX<SupportSwapCheck> abstractC58185ywXKWHzl = ((gKO) C43251rlk.copydefault(gKO.class)).KWHzl(new ChainRequest("1", str, new CoinInfo((java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, 15, (DefaultConstructorMarker) null), new CoinInfo(C33129mqd.gEmmrt(c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.fetchVPNInfo()) : null), C33129mqd.gEmmrt(c10854bwM != null ? c10854bwM.OLrzqt() : null), c10854bwM != null && c10854bwM.AuCTel(), (java.lang.String) null, 8, (DefaultConstructorMarker) null), ""));
        final Function1 function1 = new Function1() { // from class: o.guW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21139guC.copydefault(interfaceC58184ywW, walletRechargeBean, c10854bwM, abstractC12782ctV, str, (SupportSwapCheck) obj);
            }
        };
        InterfaceC58227yxM<? super SupportSwapCheck> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.guY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21139guC.ejfBZ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gva
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21139guC.EZpvd(interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.guZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21139guC.fIwbmz(function12, obj);
            }
        });
    }

    public static final void ejfBZ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(InterfaceC58184ywW interfaceC58184ywW, WalletRechargeBean walletRechargeBean, C10854bwM c10854bwM, AbstractC12782ctV abstractC12782ctV, java.lang.String str, SupportSwapCheck supportSwapCheck) {
        java.lang.String strAYXKKw;
        java.lang.String strCopydefault;
        if (supportSwapCheck.isSupportCrossSwap() == 1 || supportSwapCheck.isSupportSingleSwap() == 1) {
            C21139guC c21139guC = OLrzqt;
            Intrinsics.copydefault(interfaceC58184ywW);
            if (c21139guC.OLrzqt(walletRechargeBean)) {
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.itxZVF);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.hfdhUn);
            }
            java.lang.String str2 = strAYXKKw;
            if (c21139guC.OLrzqt(walletRechargeBean)) {
                strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.iWlNch, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", C33129mqd.gEmmrt(c10854bwM != null ? c10854bwM.fJNWhG() : null))));
            } else {
                strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.Dap, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", C33129mqd.gEmmrt(c10854bwM != null ? c10854bwM.fJNWhG() : null))));
            }
            c21139guC.EZpvd((InterfaceC58184ywW<kotlin.Pair<java.lang.String, RechargeBean>>) interfaceC58184ywW, "dex", new RechargeBean("dex", str2, false, strCopydefault, C13754dXa.Activity.hUfVAv, new RechargeNavigationBean(abstractC12782ctV.DbNXlk(), C33129mqd.gEmmrt(c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.fetchVPNInfo()) : null), C33129mqd.gEmmrt(c10854bwM != null ? c10854bwM.OLrzqt() : null), 0L, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, c10854bwM != null && c10854bwM.AuCTel(), 0, 0, (java.lang.String) null, false, false, false, false, (java.lang.String) null, str, 0, 196472, (DefaultConstructorMarker) null)));
        } else {
            C21139guC c21139guC2 = OLrzqt;
            Intrinsics.copydefault(interfaceC58184ywW);
            c21139guC2.EZpvd((InterfaceC58184ywW<kotlin.Pair<java.lang.String, RechargeBean>>) interfaceC58184ywW, "dex", (RechargeBean) null);
        }
        return Unit.INSTANCE;
    }

    public static final void fIwbmz(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        C21139guC c21139guC = OLrzqt;
        Intrinsics.copydefault(interfaceC58184ywW);
        c21139guC.EZpvd((InterfaceC58184ywW<kotlin.Pair<java.lang.String, RechargeBean>>) interfaceC58184ywW, "dex", (RechargeBean) null);
        return Unit.INSTANCE;
    }

    public final boolean copydefault(WalletRechargeBean walletRechargeBean, java.lang.String str) {
        if (C33129mqd.KWHzl((java.util.Collection) walletRechargeBean.getWhiteList()) && C33129mqd.KWHzl((java.util.Collection) walletRechargeBean.getBlackList())) {
            java.util.ArrayList<java.lang.String> whiteList = walletRechargeBean.getWhiteList();
            Intrinsics.copydefault(whiteList);
            if (whiteList.contains(str)) {
                java.util.ArrayList<java.lang.String> blackList = walletRechargeBean.getBlackList();
                Intrinsics.copydefault(blackList);
                if (!blackList.contains(str)) {
                    return true;
                }
            }
        } else {
            if (C33129mqd.KWHzl((java.util.Collection) walletRechargeBean.getWhiteList())) {
                java.util.ArrayList<java.lang.String> whiteList2 = walletRechargeBean.getWhiteList();
                Intrinsics.copydefault(whiteList2);
                return whiteList2.contains(str);
            }
            java.util.ArrayList<java.lang.String> blackList2 = walletRechargeBean.getBlackList();
            if (blackList2 == null || !blackList2.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean OLrzqt(WalletRechargeBean walletRechargeBean) {
        return Intrinsics.EZpvd((java.lang.Object) walletRechargeBean.getScene(), (java.lang.Object) "gas");
    }

    public final void EZpvd(InterfaceC58184ywW<kotlin.Pair<java.lang.String, RechargeBean>> interfaceC58184ywW, java.lang.String str, RechargeBean rechargeBean) {
        interfaceC58184ywW.onNext(new kotlin.Pair<>(str, rechargeBean));
        interfaceC58184ywW.onComplete();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r5 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        if (r5 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String copydefault(AbstractC12782ctV abstractC12782ctV, C10854bwM c10854bwM, int i) {
        java.lang.String address;
        if (c10854bwM == null || !c10854bwM.OuxcSI()) {
            if (i == -1) {
                ChainAddress chainAddressOLrzqt = abstractC12782ctV.OLrzqt(c10854bwM != null ? c10854bwM.AEQbTJ() : 0L, (java.lang.Integer) null);
                if (chainAddressOLrzqt != null) {
                    address = chainAddressOLrzqt.getAddress();
                }
            } else {
                ChainAddress chainAddressOLrzqt2 = abstractC12782ctV.OLrzqt(c10854bwM != null ? c10854bwM.AEQbTJ() : 0L, java.lang.Integer.valueOf(i));
                if (chainAddressOLrzqt2 != null) {
                    address = chainAddressOLrzqt2.getAddress();
                }
            }
        } else {
            C13852daR c13852daRODWQjV = abstractC12782ctV.ODWQjV();
            java.lang.String strKWHzl = c13852daRODWQjV != null ? c13852daRODWQjV.KWHzl() : null;
            if (strKWHzl != null) {
                return strKWHzl;
            }
        }
        return "";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.guC */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleClick$default(C21139guC c21139guC, AbstractActivityC33041mov abstractActivityC33041mov, InterfaceC8223ayg interfaceC8223ayg, RechargeBean rechargeBean, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function1 = null;
        }
        c21139guC.OLrzqt(abstractActivityC33041mov, interfaceC8223ayg, rechargeBean, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [539=5] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void OLrzqt(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov, InterfaceC8223ayg interfaceC8223ayg, @NotNull RechargeBean rechargeBean, final Function1<? super gKW, Unit> function1) {
        java.util.List listKWHzl;
        InterfaceC9772bbr interfaceC9772bbr;
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(rechargeBean, "");
        java.lang.String type = rechargeBean.getType();
        switch (type.hashCode()) {
            case -1313788774:
                if (type.equals("buy_crypto")) {
                    final android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("url", rechargeBean.getNavigationData().getUrl());
                    bundle.putString("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString());
                    bundle.putBoolean("SHOW_CLOSE", true);
                    bundle.putBoolean("share", false);
                    bundle.putIntArray("TRANSITION_ANIM", new int[]{C52761wXj.Application.AEQbTJ, C52761wXj.Application.valueOf});
                    if (!rechargeBean.getNavigationData().isTrackingWallet()) {
                        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, abstractActivityC33041mov, bundle, null, 4, null);
                    } else {
                        C14140dfo instance$default = C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null);
                        androidx.fragment.app.FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                        instance$default.copydefault(supportFragmentManager, C33070mpX.AYXKKw(C13754dXa.FragmentManager.AttrRes), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsPickMultipleVisualMedia), C33070mpX.AYXKKw(C13754dXa.FragmentManager.size), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContracts), new Function0() { // from class: o.guK
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C21139guC.copydefault(bundle, abstractActivityC33041mov);
                            }
                        });
                    }
                    break;
                }
                break;
            case -940242166:
                if (type.equals("withdraw")) {
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041mov), null, null, new RechargeManager$handleClick$1(abstractActivityC33041mov, rechargeBean, interfaceC8223ayg, null), 3, null);
                    break;
                }
                break;
            case 99351:
                if (type.equals("dex")) {
                    gKO gko = (gKO) C43251rlk.copydefault(gKO.class);
                    TradeParam tradeParam = new TradeParam(rechargeBean.getNavigationData().getWalletId(), rechargeBean.getNavigationData().getSourceType(), new CoinInfo((java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, 15, (DefaultConstructorMarker) null), new CoinInfo(rechargeBean.getNavigationData().getChainId(), rechargeBean.getNavigationData().getTokenAddress(), rechargeBean.getNavigationData().isCoin(), (java.lang.String) null, 8, (DefaultConstructorMarker) null), "", (java.lang.Integer) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.Boolean) null, false, (java.lang.String) null, 0, (java.lang.String) null, 16352, (DefaultConstructorMarker) null);
                    java.lang.String simpleName = C21182gut.class.getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName, "");
                    gko.copydefault(abstractActivityC33041mov, abstractActivityC33041mov, tradeParam, simpleName, null, C13754dXa.LoaderManager.AuCTel, new Function1() { // from class: o.guR
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C21139guC.EZpvd(function1, (gKW) obj);
                        }
                    });
                    break;
                }
                break;
            case 563217739:
                if (type.equals("qr_code")) {
                    DialogInterfaceOnKeyListenerC14659dpd dialogInterfaceOnKeyListenerC14659dpdCopydefault = DialogInterfaceOnKeyListenerC14659dpd.Companion.copydefault(0.92f);
                    dialogInterfaceOnKeyListenerC14659dpdCopydefault.KWHzl(OLrzqt.AEQbTJ(rechargeBean.getNavigationData()));
                    dialogInterfaceOnKeyListenerC14659dpdCopydefault.show(abstractActivityC33041mov.getSupportFragmentManager(), ViewOnClickListenerC20995grR.class.getSimpleName());
                    break;
                }
                break;
            case 772885966:
                if (type.equals("gas_station") && (listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9772bbr.class))) != null && (interfaceC9772bbr = (InterfaceC9772bbr) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) != null) {
                    androidx.fragment.app.FragmentManager supportFragmentManager2 = abstractActivityC33041mov.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                    interfaceC9772bbr.AEQbTJ(supportFragmentManager2, rechargeBean.getNavigationData().getSourceType(), rechargeBean.getNavigationData().getChainId(), rechargeBean.getNavigationData().getSymbol(), "wallet_recharge", "wallet", C13754dXa.LoaderManager.AuCTel);
                }
                break;
        }
    }

    public static final Unit copydefault(android.os.Bundle bundle, AbstractActivityC33041mov abstractActivityC33041mov) {
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, abstractActivityC33041mov, bundle, null, 4, null);
        return null;
    }

    public static final Unit EZpvd(Function1 function1, gKW gkw) {
        Intrinsics.checkNotNullParameter(gkw, "");
        if (function1 != null) {
            function1.invoke(gkw);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(InterfaceC8223ayg interfaceC8223ayg, RechargeNavigationBean rechargeNavigationBean) {
        if (interfaceC8223ayg != null) {
            interfaceC8223ayg.KWHzl(new GoToWithdrawFromWalletResultContractArgs.Withdraw(rechargeNavigationBean.getCurrencyId(), rechargeNavigationBean.getSubCurrencyId(), rechargeNavigationBean.getCoinAddress(), rechargeNavigationBean.getWalletDisplayName(), rechargeNavigationBean.getWalletId(), C33129mqd.valueOf(java.lang.Long.valueOf(rechargeNavigationBean.getCoinId())), null, 64, null));
        }
    }

    public final AbstractC57212yeE AEQbTJ(RechargeNavigationBean rechargeNavigationBean) {
        if (rechargeNavigationBean.getNeedCustomToken()) {
            return ViewOnClickListenerC20995grR.Companion.AEQbTJ(rechargeNavigationBean.getWalletId(), C33129mqd.valueOf(rechargeNavigationBean.getChainId()), rechargeNavigationBean.getTokenAddress(), (128 & 8) != 0 ? false : rechargeNavigationBean.getAddCustomToken(), (128 & 16) != 0 ? false : false, (128 & 32) != 0 ? "" : rechargeNavigationBean.getTip(), (128 & 64) != 0 ? -1 : rechargeNavigationBean.getAddressType(), (128 & 128) != 0 ? null : null);
        }
        return ViewOnClickListenerC20995grR.Companion.copydefault(rechargeNavigationBean.getWalletId(), C33129mqd.gEmmrt(java.lang.Long.valueOf(rechargeNavigationBean.getCoinId())), (1772 & 4) != 0 ? false : false, (1772 & 8) != 0 ? "" : rechargeNavigationBean.getTip(), (1772 & 16) != 0 ? false : false, (1772 & 32) != 0 ? false : false, (1772 & 64) != 0 ? -1 : rechargeNavigationBean.getAddressType(), (1772 & 128) != 0 ? -1L : C33129mqd.valueOf(rechargeNavigationBean.getChainId()), (1772 & 256) != 0 ? "" : null, (1772 & 512) != 0 ? 1 : 0, (1772 & 1024) != 0 ? null : null);
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -795192327) {
            if (iHashCode != 108988) {
                if (iHashCode == 114974605 && str.equals("yield")) {
                    return "yield_trade";
                }
            } else if (str.equals("nft")) {
                return "nft_trade";
            }
        } else if (str.equals("wallet")) {
            return "wallet_trade";
        }
        return "default_trade";
    }

    public final void KWHzl(final WalletRechargeBean walletRechargeBean) {
        C32866mlf.onEvent$default("Web3WalletSend_Activities_FillUpGas_Interact", (TrackChannel[]) null, new Function1() { // from class: o.guT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21139guC.OLrzqt(walletRechargeBean, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(WalletRechargeBean walletRechargeBean, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bizsource", walletRechargeBean.getBizSource(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "isgasstation", OLrzqt.OLrzqt(walletRechargeBean) ? "true" : "false", false, 4, null);
        return Unit.INSTANCE;
    }
}
