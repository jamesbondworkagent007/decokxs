package o;

import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.amplifyframework.core.model.ModelIdentifier;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.okinc.business.defi.biz.constant.HardwareType;
import com.okinc.business.defi.biz.constant.WalletStatus;
import com.okinc.business.defi.biz.constant.WalletSyncOperation;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.error.EmptyMpcInfoException;
import com.okinc.business.defi.biz.core.error.OKWException;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.core.mpc.MpcShare2Status;
import com.okinc.business.defi.biz.core.mpc.MpcWalletCreateType;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.model.WalletAddressItem;
import com.okinc.business.defi.biz.model.wallet.MpcWalletDecodeInfo;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import com.okinc.business.defi.biz.model.wallet.OneKeyAccountInfo;
import com.okinc.business.defi.biz.model.wallet.OneKeyHardwareData;
import com.okinc.business.defi.biz.net.bean.AAActiveRes;
import com.okinc.business.defi.common.WalletCreateHelper$handleJudgeForbiddenCheck$1;
import com.okinc.business.defi.common.ui.DefiConnectWalletTipDialogFragment;
import com.okinc.business.defi.wallet.metricsmonitor.CreateOrImportType;
import com.okinc.core.util.SPUtils;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.rxutils.RxBus;
import com.okinc.wallet.api.bean.AddressType;
import com.okinc.wallet.api.bean.SupportedNetworkType;
import com.okinc.wallet.api.bean.UnsupportedWalletType;
import com.okinc.wallet.core.wallet.KeystoneAddressInfo;
import com.okinc.wallet.hardware.api.keystone.KeystoneMultiAccount;
import com.okinc.wallet.widget.dialog.DefiWalletVReminderDFragment;
import com.okinc.web3.security.bridge.MnemonicKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C11010bzJ;
import o.C12827cuN;
import o.C13062cyk;
import o.C13754dXa;
import o.C52761wXj;
import o.InterfaceC9739bbK;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.dfo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14140dfo {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final C11010bzJ AEQbTJ;
    public final InterfaceC18445fiY AYXKKw;
    public final C13092czN AhwBna;
    public final C10948byA KWHzl;
    public final C10598brV OLrzqt;
    public final C13071cyt copydefault;
    public final C12827cuN djBIcL;
    public final C13062cyk gEmmrt;
    public final C13124czt valueOf;

    /* JADX INFO: renamed from: o.dfo$Activity */
    /* JADX INFO: loaded from: classes14.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[HardwareType.values().length];
            try {
                iArr[HardwareType.LedgerNanoX.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[HardwareType.LedgerFlex.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String AuCTel(java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String AuCTelauCTel(java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String KWHzl(java.lang.String str, java.lang.Integer num, java.lang.Integer num2) {
        Intrinsics.checkNotNullParameter(num, "");
        Intrinsics.checkNotNullParameter(num2, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String copydefault(java.lang.String str, java.lang.Integer num, java.lang.Integer num2) {
        Intrinsics.checkNotNullParameter(num, "");
        Intrinsics.checkNotNullParameter(num2, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String ejfBZ(java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String fARcdN(java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String fIwbmz(java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String fJNWhG(java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String fetchVPNInfo(java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String getFieldNames(java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String getNewProxyInstance(java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String hDKMBd(java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String iwGUEr(java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String uzCIH(java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String wlaJM(java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String zLjUOn(java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return str;
    }

    public final boolean copydefault(int i) {
        return i == 0 || i == 1 || i == 2;
    }

    public C14140dfo(@NotNull C13124czt c13124czt, @NotNull C12827cuN c12827cuN, @NotNull C10948byA c10948byA, @NotNull C11010bzJ c11010bzJ, @NotNull C13062cyk c13062cyk, @NotNull InterfaceC18445fiY interfaceC18445fiY, @NotNull C13092czN c13092czN, @NotNull C13071cyt c13071cyt, @NotNull C10598brV c10598brV) {
        Intrinsics.checkNotNullParameter(c13124czt, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(c10948byA, "");
        Intrinsics.checkNotNullParameter(c11010bzJ, "");
        Intrinsics.checkNotNullParameter(c13062cyk, "");
        Intrinsics.checkNotNullParameter(interfaceC18445fiY, "");
        Intrinsics.checkNotNullParameter(c13092czN, "");
        Intrinsics.checkNotNullParameter(c13071cyt, "");
        Intrinsics.checkNotNullParameter(c10598brV, "");
        this.valueOf = c13124czt;
        this.djBIcL = c12827cuN;
        this.KWHzl = c10948byA;
        this.AEQbTJ = c11010bzJ;
        this.gEmmrt = c13062cyk;
        this.AYXKKw = interfaceC18445fiY;
        this.AhwBna = c13092czN;
        this.copydefault = c13071cyt;
        this.OLrzqt = c10598brV;
    }

    /* JADX INFO: renamed from: o.dfo$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dfo.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ C14140dfo getInstance$default(TaskDescription taskDescription, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return taskDescription.copydefault(context);
        }

        public final C14140dfo copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).gHZMYf();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.dfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC58217yxC createHDWallet$default(C14140dfo c14140dfo, java.lang.String str, int i, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str2, Function1 function1, Function1 function12, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str2 = "wallet";
        }
        java.lang.String str3 = str2;
        if ((i2 & 16) != 0) {
            function1 = null;
        }
        return c14140dfo.copydefault(str, i3, fragmentManager, str3, (Function1<? super AbstractC12782ctV, Unit>) function1, (Function1<? super AbstractC12782ctV, Unit>) function12);
    }

    public final InterfaceC58217yxC copydefault(@NotNull final java.lang.String str, int i, androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str2, Function1<? super AbstractC12782ctV, Unit> function1, @NotNull final Function1<? super AbstractC12782ctV, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return createWalletCommon$default(this, new Function0() { // from class: o.dfO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14140dfo.values(this.OLrzqt, str);
            }
        }, str, fragmentManager, null, function1, new Function1() { // from class: o.dfP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.EZpvd(function12, (AbstractC12782ctV) obj);
            }
        }, null, null, i, false, str2, null, 2752, null);
    }

    public static final AbstractC58260yxt values(C14140dfo c14140dfo, java.lang.String str) {
        return c14140dfo.KWHzl(str);
    }

    public static final Unit EZpvd(Function1 function1, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV != null) {
            ((InterfaceC32807mkZ) C43251rlk.copydefault(InterfaceC32807mkZ.class)).EZpvd();
        }
        function1.invoke(abstractC12782ctV);
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC AEQbTJ(@NotNull final java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull final java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, androidx.fragment.app.FragmentManager fragmentManager, InterfaceC14457dln interfaceC14457dln, Function1<? super AbstractC12782ctV, Unit> function1, @NotNull Function1<? super AbstractC12782ctV, Unit> function12, java.lang.String str8, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(function12, "");
        final MpcWalletDecodeInfo mpcWalletDecodeInfoOLrzqt = C10964byQ.OLrzqt(str2, str7, str3, str5, str6, true);
        if (mpcWalletDecodeInfoOLrzqt != null) {
            mpcWalletDecodeInfoOLrzqt.setCreateType(MpcWalletCreateType.LOCAL_CREATE.getValue());
        }
        return createWalletCommon$default(this, new Function0() { // from class: o.dhT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14140dfo.OLrzqt(this.KWHzl, str, str4, mpcWalletDecodeInfoOLrzqt);
            }
        }, str, fragmentManager, interfaceC14457dln, function1, function12, null, str8, i, z, null, null, 3136, null);
    }

    public static final AbstractC58260yxt OLrzqt(C14140dfo c14140dfo, java.lang.String str, java.lang.String str2, MpcWalletDecodeInfo mpcWalletDecodeInfo) {
        return c14140dfo.OLrzqt(str, str2, mpcWalletDecodeInfo);
    }

    public final InterfaceC58217yxC copydefault(@NotNull final java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull final java.lang.String str7, @NotNull java.lang.String str8, int i, androidx.fragment.app.FragmentManager fragmentManager, final InterfaceC14457dln interfaceC14457dln, Function1<? super AbstractC12782ctV, Unit> function1, @NotNull final Function1<? super AbstractC12782ctV, Unit> function12, java.lang.String str9, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return EZpvd(str, str2, str3, str4, str5, str6, str7, str8, i, fragmentManager, interfaceC14457dln, function1, new yHO() { // from class: o.dgB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C14140dfo.AEQbTJ(this.OLrzqt, interfaceC14457dln, str, function12, str7, (AbstractC12782ctV) obj, ((java.lang.Integer) obj2).intValue(), (AbstractC14702dqT) obj3);
            }
        }, new Function1() { // from class: o.dgI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.AEQbTJ((AbstractC12782ctV) obj);
            }
        }, str9, i2);
    }

    public static final Unit AEQbTJ(AbstractC12782ctV abstractC12782ctV) {
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(final C14140dfo c14140dfo, final InterfaceC14457dln interfaceC14457dln, final java.lang.String str, final Function1 function1, java.lang.String str2, final AbstractC12782ctV abstractC12782ctV, final int i, final AbstractC14702dqT abstractC14702dqT) {
        if (abstractC12782ctV != null) {
            C10854bwM c10854bwMIsConnected = c14140dfo.KWHzl.isConnected();
            long jFetchVPNInfo = c10854bwMIsConnected != null ? c10854bwMIsConnected.fetchVPNInfo() : -1L;
            java.lang.String strEZpvd = abstractC12782ctV.EZpvd(jFetchVPNInfo);
            if (abstractC12782ctV.QSBOWP() == null) {
                c14140dfo.EZpvd(abstractC14702dqT, interfaceC14457dln, str, abstractC12782ctV, i, (Function1<? super AbstractC12782ctV, Unit>) function1);
                return Unit.INSTANCE;
            }
            MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
            Intrinsics.copydefault(mpcWalletEncodeInfoQSBOWP);
            AbstractC58185ywX<kotlin.Pair<java.lang.String, AAActiveRes>> abstractC58185ywXKWHzl = c14140dfo.KWHzl(strEZpvd, str2, mpcWalletEncodeInfoQSBOWP, jFetchVPNInfo, str);
            final Function1 function12 = new Function1() { // from class: o.diV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14140dfo.EZpvd(str, abstractC12782ctV, c14140dfo, abstractC14702dqT, interfaceC14457dln, i, function1, (kotlin.Pair) obj);
                }
            };
            InterfaceC58227yxM<? super kotlin.Pair<java.lang.String, AAActiveRes>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.djb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14140dfo.fXHmeK(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.djd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14140dfo.AhwBna(this.EZpvd, abstractC14702dqT, interfaceC14457dln, str, abstractC12782ctV, i, function1, (java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dja
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14140dfo.dLBcXg(function13, obj);
                }
            });
        } else {
            c14140dfo.EZpvd(abstractC14702dqT, interfaceC14457dln, str, abstractC12782ctV, i, (Function1<? super AbstractC12782ctV, Unit>) function1);
        }
        return Unit.INSTANCE;
    }

    public static final void fXHmeK(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(final java.lang.String str, final AbstractC12782ctV abstractC12782ctV, final C14140dfo c14140dfo, final AbstractC14702dqT abstractC14702dqT, final InterfaceC14457dln interfaceC14457dln, final int i, final Function1 function1, kotlin.Pair pair) {
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP;
        java.lang.String strEZpvd;
        java.lang.String proxyAddress;
        java.lang.String str2 = (java.lang.String) pair.getFirst();
        AAActiveRes aAActiveRes = (AAActiveRes) pair.getSecond();
        java.lang.Boolean boolIsActive = aAActiveRes.isActive();
        if (Intrinsics.EZpvd(boolIsActive, java.lang.Boolean.TRUE)) {
            if (abstractC12782ctV != null && (mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP()) != null) {
                MpcWalletDecodeInfo mpcWalletDecodeInfoOLrzqt = C10964byQ.OLrzqt(str, str2, mpcWalletEncodeInfoQSBOWP);
                AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
                if (abstractC12784ctXGwTjWJ == null || (strEZpvd = abstractC12784ctXGwTjWJ.EZpvd()) == null) {
                    strEZpvd = "";
                }
                java.lang.String eoaAddress = aAActiveRes.getEoaAddress();
                if (eoaAddress == null) {
                    return Unit.INSTANCE;
                }
                WalletType walletType = WalletType.MPCWallet;
                java.lang.String aaAddress = aAActiveRes.getAaAddress();
                if (aaAddress != null && (proxyAddress = aAActiveRes.getProxyAddress()) != null) {
                    createMpcSmartAccount$default(c14140dfo, str, strEZpvd, null, null, mpcWalletDecodeInfoOLrzqt, eoaAddress, walletType, aaAddress, proxyAddress, false, false, new Function1() { // from class: o.djh
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C14140dfo.KWHzl(this.KWHzl, abstractC12782ctV, abstractC14702dqT, interfaceC14457dln, str, i, function1, (AbstractC12782ctV) obj);
                        }
                    }, 1544, null);
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        if (Intrinsics.EZpvd(boolIsActive, java.lang.Boolean.FALSE)) {
            c14140dfo.EZpvd(abstractC14702dqT, interfaceC14457dln, str, abstractC12782ctV, i, (Function1<? super AbstractC12782ctV, Unit>) function1);
        } else {
            c14140dfo.EZpvd((AbstractC14702dqT) null, interfaceC14457dln, "", abstractC12782ctV, i, (Function1<? super AbstractC12782ctV, Unit>) function1);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(final C14140dfo c14140dfo, AbstractC12782ctV abstractC12782ctV, final AbstractC14702dqT abstractC14702dqT, final InterfaceC14457dln interfaceC14457dln, final java.lang.String str, final int i, final Function1 function1, final AbstractC12782ctV abstractC12782ctV2) {
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = c14140dfo.djBIcL.copydefault(abstractC12782ctV.DbNXlk());
        final Function1 function12 = new Function1() { // from class: o.dis
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.AEQbTJ(this.AEQbTJ, abstractC14702dqT, interfaceC14457dln, str, abstractC12782ctV2, i, function1, (java.lang.Integer) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dit
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14140dfo.apNbdB(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.diu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.valueOf(this.KWHzl, abstractC14702dqT, interfaceC14457dln, str, abstractC12782ctV2, i, function1, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.div
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14140dfo.dvImUD(function13, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void apNbdB(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C14140dfo c14140dfo, AbstractC14702dqT abstractC14702dqT, InterfaceC14457dln interfaceC14457dln, java.lang.String str, AbstractC12782ctV abstractC12782ctV, int i, Function1 function1, java.lang.Integer num) {
        c14140dfo.EZpvd(abstractC14702dqT, interfaceC14457dln, str, abstractC12782ctV, i, (Function1<? super AbstractC12782ctV, Unit>) function1);
        return Unit.INSTANCE;
    }

    public static final void dvImUD(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit valueOf(C14140dfo c14140dfo, AbstractC14702dqT abstractC14702dqT, InterfaceC14457dln interfaceC14457dln, java.lang.String str, AbstractC12782ctV abstractC12782ctV, int i, Function1 function1, java.lang.Throwable th) {
        c14140dfo.EZpvd(abstractC14702dqT, interfaceC14457dln, str, abstractC12782ctV, i, (Function1<? super AbstractC12782ctV, Unit>) function1);
        return Unit.INSTANCE;
    }

    public static final void dLBcXg(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AhwBna(C14140dfo c14140dfo, AbstractC14702dqT abstractC14702dqT, InterfaceC14457dln interfaceC14457dln, java.lang.String str, AbstractC12782ctV abstractC12782ctV, int i, Function1 function1, java.lang.Throwable th) {
        c14140dfo.EZpvd(abstractC14702dqT, interfaceC14457dln, str, abstractC12782ctV, i, (Function1<? super AbstractC12782ctV, Unit>) function1);
        return Unit.INSTANCE;
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.String, AAActiveRes>> KWHzl(final java.lang.String str, final java.lang.String str2, final MpcWalletEncodeInfo mpcWalletEncodeInfo, final long j, final java.lang.String str3) {
        AbstractC58260yxt<java.util.List<AbstractC12782ctV>> abstractC58260yxtKWHzl = this.djBIcL.KWHzl(str, WalletType.MPCWallet);
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAhwBna = this.AEQbTJ.AhwBna(str3);
        final Function2 function2 = new Function2() { // from class: o.dgv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C14140dfo.EZpvd((java.util.List) obj, (java.lang.String) obj2);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(abstractC58260yxtKWHzl, abstractC58260yxtAhwBna, new InterfaceC58223yxI() { // from class: o.dgw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C14140dfo.AuCTel(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.dgy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.OLrzqt(str3, mpcWalletEncodeInfo, str2, this, str, j, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.String, AAActiveRes>> abstractC58185ywXKWHzl = abstractC58260yxtOLrzqt.KWHzl(new InterfaceC58229yxO() { // from class: o.dgE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.akftKQ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final kotlin.Pair AuCTel(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair EZpvd(java.util.List list, java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return C56390yDp.OLrzqt(list, str);
    }

    public static final InterfaceC60096zvd akftKQ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC60096zvd OLrzqt(java.lang.String str, MpcWalletEncodeInfo mpcWalletEncodeInfo, java.lang.String str2, C14140dfo c14140dfo, java.lang.String str3, long j, kotlin.Pair pair) {
        AbstractC58185ywX<AAActiveRes> abstractC58185ywXAEQbTJ;
        java.lang.Object next;
        AbstractC58185ywX abstractC58185ywXEZpvd;
        Intrinsics.checkNotNullParameter(pair, "");
        java.util.List list = (java.util.List) pair.getFirst();
        java.lang.Object second = pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "");
        java.lang.String str4 = (java.lang.String) second;
        if (!(!list.isEmpty())) {
            abstractC58185ywXAEQbTJ = c14140dfo.gEmmrt.AEQbTJ(str3, j);
        } else {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (!((AbstractC12782ctV) next).DCUTEIdCUTEI()) {
                    break;
                }
            }
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) next;
            if (!C10964byQ.OLrzqt(C10964byQ.OLrzqt(str, str4, mpcWalletEncodeInfo).getEcdsaShare2()).contentEquals(mpcWalletEncodeInfo.getEcdsaChainCode()) || !C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
                abstractC58185ywXAEQbTJ = AbstractC58185ywX.KWHzl(new AAActiveRes((java.lang.String) null, (java.lang.Long) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null));
                Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
            } else if (abstractC12782ctV != null) {
                AbstractC58260yxt abstractC58260yxtUpdateMpcWalletInfo$default = AbstractC12782ctV.updateMpcWalletInfo$default(abstractC12782ctV, str2, java.lang.Integer.valueOf(MpcShare2Status.SHARE2_VALID.getValue()), null, null, null, mpcWalletEncodeInfo.getEncryptShareKey(), null, 92, null);
                if (abstractC58260yxtUpdateMpcWalletInfo$default == null || (abstractC58185ywXEZpvd = abstractC58260yxtUpdateMpcWalletInfo$default.EZpvd()) == null) {
                    abstractC58185ywXAEQbTJ = AbstractC58185ywX.KWHzl(new AAActiveRes((java.lang.String) null, (java.lang.Long) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null));
                    Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
                } else {
                    final Function1 function1 = new Function1() { // from class: o.dfv
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C14140dfo.EZpvd((java.lang.Integer) obj);
                        }
                    };
                    abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.dfB
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58229yxO
                        public final java.lang.Object apply(java.lang.Object obj) {
                            return C14140dfo.UscePu(function1, obj);
                        }
                    });
                    if (abstractC58185ywXAEQbTJ == null) {
                    }
                }
            }
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(str4);
        final Function2 function2 = new Function2() { // from class: o.dfx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C14140dfo.OLrzqt((java.lang.String) obj, (AAActiveRes) obj2);
            }
        };
        return AbstractC58185ywX.EZpvd(abstractC58185ywXKWHzl, abstractC58185ywXAEQbTJ, new InterfaceC58223yxI() { // from class: o.dfy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C14140dfo.fJNWhG(function2, obj, obj2);
            }
        });
    }

    public static final AAActiveRes EZpvd(java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return new AAActiveRes((java.lang.String) null, (java.lang.Long) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
    }

    public static final AAActiveRes UscePu(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AAActiveRes) function1.invoke(obj);
    }

    public static final kotlin.Pair fJNWhG(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair OLrzqt(java.lang.String str, AAActiveRes aAActiveRes) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aAActiveRes, "");
        return C56390yDp.OLrzqt(str, aAActiveRes);
    }

    public final InterfaceC58217yxC EZpvd(final java.lang.String str, java.lang.String str2, java.lang.String str3, final java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, final java.lang.String str8, int i, androidx.fragment.app.FragmentManager fragmentManager, InterfaceC14457dln interfaceC14457dln, Function1<? super AbstractC12782ctV, Unit> function1, yHO<? super AbstractC12782ctV, ? super java.lang.Integer, ? super AbstractC14702dqT, Unit> yho, Function1<? super AbstractC12782ctV, Unit> function12, java.lang.String str9, int i2) {
        final MpcWalletDecodeInfo mpcWalletDecodeInfoOLrzqt = C10964byQ.OLrzqt(str2, str7, str3, str5, str6, false);
        if (mpcWalletDecodeInfoOLrzqt != null) {
            mpcWalletDecodeInfoOLrzqt.setCreateType(i);
        }
        return createWalletCommon$default(this, new Function0() { // from class: o.dfL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14140dfo.copydefault(this.copydefault, str, mpcWalletDecodeInfoOLrzqt, str8, str4);
            }
        }, str, fragmentManager, interfaceC14457dln, function1, function12, yho, str9, i2, false, null, null, 3584, null);
    }

    public static final AbstractC58260yxt copydefault(C14140dfo c14140dfo, java.lang.String str, MpcWalletDecodeInfo mpcWalletDecodeInfo, java.lang.String str2, java.lang.String str3) {
        return c14140dfo.KWHzl(str, mpcWalletDecodeInfo, str2, str3);
    }

    public static final AbstractC58260yxt AEQbTJ(final C14140dfo c14140dfo, final java.lang.String str, final java.lang.String str2, final boolean z) {
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = c14140dfo.copydefault(str);
        final Function1 function1 = new Function1() { // from class: o.djj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.KWHzl(this.OLrzqt, str, str2, z, (java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.djf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.DLWbHP(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final InterfaceC58261yxu DLWbHP(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(C14140dfo c14140dfo, java.lang.String str, java.lang.String str2, boolean z, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return c14140dfo.AEQbTJ(str, createWalletName$default(c14140dfo, null, num.intValue() + 1, false, 5, null), num.intValue(), str2, z);
    }

    public final InterfaceC58217yxC EZpvd(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, androidx.fragment.app.FragmentManager fragmentManager, boolean z, final boolean z2, @NotNull Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return createWalletCommon$default(this, new Function0() { // from class: o.dgb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14140dfo.AEQbTJ(this.OLrzqt, str, str2, z2);
            }
        }, str2, fragmentManager, null, null, function1, null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.ImmLeaksCleaner), 0, z, null, null, 3152, null);
    }

    public static final AbstractC58260yxt OLrzqt(C14140dfo c14140dfo, java.lang.String str, int i, java.lang.String str2, boolean z) {
        return c14140dfo.AEQbTJ(str, createWalletName$default(c14140dfo, null, i + 1, false, 5, null), i, str2, z);
    }

    public final InterfaceC58217yxC OLrzqt(@NotNull final java.lang.String str, @NotNull java.lang.String str2, final int i, @NotNull final java.lang.String str3, C13786dYf c13786dYf, androidx.fragment.app.FragmentManager fragmentManager, boolean z, final boolean z2, @NotNull Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return createWalletCommon$default(this, new Function0() { // from class: o.dgN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14140dfo.OLrzqt(this.OLrzqt, str, i, str3, z2);
            }
        }, str3, fragmentManager, null, null, function1, null, C33069mpW.copydefault(C13754dXa.FragmentManager.DDjgSw, C56423yEv.EZpvd(C56390yDp.OLrzqt(MTAnalysisConstants.Account.KEY_ACCOUNT, str2))), 0, z, null, c13786dYf, 1104, null);
    }

    public static final AbstractC58260yxt OLrzqt(C14140dfo c14140dfo, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, boolean z) {
        return c14140dfo.AEQbTJ(str, str2, i, str3, z);
    }

    public final InterfaceC58217yxC OLrzqt(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, final int i, @NotNull final java.lang.String str3, androidx.fragment.app.FragmentManager fragmentManager, @NotNull C13786dYf c13786dYf, boolean z, final boolean z2, @NotNull Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(c13786dYf, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return createWalletCommon$default(this, new Function0() { // from class: o.dhF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14140dfo.OLrzqt(this.EZpvd, str, str2, i, str3, z2);
            }
        }, str3, fragmentManager, null, null, function1, null, C33069mpW.copydefault(C13754dXa.FragmentManager.DDjgSw, C56423yEv.EZpvd(C56390yDp.OLrzqt(MTAnalysisConstants.Account.KEY_ACCOUNT, str2))), 0, z, null, c13786dYf, 1104, null);
    }

    public static final AbstractC58260yxt EZpvd(C14140dfo c14140dfo, java.lang.String str, java.lang.String str2, MpcWalletEncodeInfo mpcWalletEncodeInfo, boolean z) {
        return c14140dfo.KWHzl(str, str2, mpcWalletEncodeInfo, z);
    }

    public final InterfaceC58217yxC copydefault(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, androidx.fragment.app.FragmentManager fragmentManager, boolean z, final boolean z2, @NotNull final MpcWalletEncodeInfo mpcWalletEncodeInfo, @NotNull Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(mpcWalletEncodeInfo, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return createWalletCommon$default(this, new Function0() { // from class: o.dhA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14140dfo.EZpvd(this.EZpvd, str, str2, mpcWalletEncodeInfo, z2);
            }
        }, str2, fragmentManager, null, null, function1, null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.ImmLeaksCleaner), 0, z, null, null, 3152, null);
    }

    public static /* synthetic */ InterfaceC58217yxC createHDSmartAccount$default(C14140dfo c14140dfo, java.lang.String str, java.lang.String str2, androidx.fragment.app.FragmentManager fragmentManager, InterfaceC14457dln interfaceC14457dln, java.lang.String str3, WalletType walletType, java.lang.String str4, java.lang.String str5, int i, boolean z, boolean z2, Function1 function1, int i2, java.lang.Object obj) {
        return c14140dfo.OLrzqt(str, str2, fragmentManager, (i2 & 8) != 0 ? null : interfaceC14457dln, str3, walletType, str4, str5, i, (i2 & 512) != 0 ? true : z, (i2 & 1024) != 0 ? true : z2, (Function1<? super AbstractC12782ctV, Unit>) function1);
    }

    public static final AbstractC58260yxt KWHzl(C14140dfo c14140dfo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, WalletType walletType, int i, boolean z) {
        return c14140dfo.OLrzqt(str, str2, str3, str4, str5, walletType, i, z);
    }

    public final InterfaceC58217yxC OLrzqt(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, androidx.fragment.app.FragmentManager fragmentManager, InterfaceC14457dln interfaceC14457dln, @NotNull final java.lang.String str3, @NotNull final WalletType walletType, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5, final int i, boolean z, final boolean z2, @NotNull Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(walletType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return createWalletCommon$default(this, new Function0() { // from class: o.dji
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14140dfo.KWHzl(this.AEQbTJ, str, str2, str4, str5, str3, walletType, i, z2);
            }
        }, str2, fragmentManager, interfaceC14457dln, null, function1, null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.addCancellable), 0, z, null, null, 3152, null);
    }

    public static /* synthetic */ InterfaceC58217yxC createPrivateKeySmartAccount$default(C14140dfo c14140dfo, java.lang.String str, androidx.fragment.app.FragmentManager fragmentManager, InterfaceC14457dln interfaceC14457dln, long j, java.lang.String str2, java.lang.String str3, WalletType walletType, java.lang.String str4, java.lang.String str5, Function1 function1, int i, java.lang.Object obj) {
        return c14140dfo.copydefault(str, fragmentManager, (i & 4) != 0 ? null : interfaceC14457dln, j, str2, str3, walletType, str4, str5, function1);
    }

    public static final AbstractC58260yxt OLrzqt(C14140dfo c14140dfo, java.lang.String str, long j, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, WalletType walletType) {
        return c14140dfo.AEQbTJ(str, j, str2, str3, str4, str5, walletType);
    }

    public final InterfaceC58217yxC copydefault(@NotNull final java.lang.String str, androidx.fragment.app.FragmentManager fragmentManager, InterfaceC14457dln interfaceC14457dln, final long j, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final WalletType walletType, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5, @NotNull Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(walletType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return createWalletCommon$default(this, new Function0() { // from class: o.dhn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14140dfo.OLrzqt(this.EZpvd, str, j, str2, str4, str5, str3, walletType);
            }
        }, str, fragmentManager, interfaceC14457dln, null, function1, null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.addCancellable), 0, false, null, null, 3664, null);
    }

    public static /* synthetic */ InterfaceC58217yxC createMpcSmartAccount$default(C14140dfo c14140dfo, java.lang.String str, java.lang.String str2, androidx.fragment.app.FragmentManager fragmentManager, InterfaceC14457dln interfaceC14457dln, MpcWalletDecodeInfo mpcWalletDecodeInfo, java.lang.String str3, WalletType walletType, java.lang.String str4, java.lang.String str5, boolean z, boolean z2, Function1 function1, int i, java.lang.Object obj) {
        return c14140dfo.OLrzqt(str, str2, fragmentManager, (i & 8) != 0 ? null : interfaceC14457dln, mpcWalletDecodeInfo, str3, walletType, str4, str5, (i & 512) != 0 ? true : z, (i & 1024) != 0 ? true : z2, (Function1<? super AbstractC12782ctV, Unit>) function1);
    }

    public final InterfaceC58217yxC OLrzqt(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, androidx.fragment.app.FragmentManager fragmentManager, InterfaceC14457dln interfaceC14457dln, @NotNull final MpcWalletDecodeInfo mpcWalletDecodeInfo, @NotNull final java.lang.String str3, @NotNull final WalletType walletType, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5, boolean z, final boolean z2, @NotNull Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(mpcWalletDecodeInfo, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(walletType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(function1, "");
        mpcWalletDecodeInfo.setCreateType(MpcWalletCreateType.SMART_CREATE.getValue());
        return createWalletCommon$default(this, new Function0() { // from class: o.djg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14140dfo.OLrzqt(this.EZpvd, str, str2, mpcWalletDecodeInfo, str3, walletType, str4, str5, z2);
            }
        }, str, fragmentManager, interfaceC14457dln, null, function1, null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.addCancellable), 0, z, null, null, 3136, null);
    }

    public static final AbstractC58260yxt OLrzqt(C14140dfo c14140dfo, java.lang.String str, java.lang.String str2, MpcWalletDecodeInfo mpcWalletDecodeInfo, java.lang.String str3, WalletType walletType, java.lang.String str4, java.lang.String str5, boolean z) {
        return c14140dfo.copydefault(str, str2, mpcWalletDecodeInfo, str3, walletType, str4, str5, z);
    }

    public final InterfaceC58217yxC EZpvd(@NotNull final java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, androidx.fragment.app.FragmentManager fragmentManager, @NotNull final InterfaceC14457dln interfaceC14457dln, @NotNull final Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(interfaceC14457dln, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return importHDWallet$default(this, str, str2, z, z2, fragmentManager, interfaceC14457dln, new yHO() { // from class: o.dhC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C14140dfo.copydefault(this.OLrzqt, interfaceC14457dln, str, function1, (AbstractC12782ctV) obj, ((java.lang.Integer) obj2).intValue(), (AbstractC14702dqT) obj3);
            }
        }, null, 128, null);
    }

    public static final Unit copydefault(final C14140dfo c14140dfo, final InterfaceC14457dln interfaceC14457dln, final java.lang.String str, final Function1 function1, final AbstractC12782ctV abstractC12782ctV, final int i, final AbstractC14702dqT abstractC14702dqT) {
        if (abstractC12782ctV != null) {
            ((InterfaceC32807mkZ) C43251rlk.copydefault(InterfaceC32807mkZ.class)).EZpvd();
            C10854bwM c10854bwMIsConnected = c14140dfo.KWHzl.isConnected();
            final long jFetchVPNInfo = c10854bwMIsConnected != null ? c10854bwMIsConnected.fetchVPNInfo() : -1L;
            final java.lang.String strEZpvd = abstractC12782ctV.EZpvd(jFetchVPNInfo);
            AbstractC58260yxt<java.util.List<AbstractC12782ctV>> abstractC58260yxtKWHzl = c14140dfo.djBIcL.KWHzl(strEZpvd, WalletType.HDWallet);
            final Function1 function12 = new Function1() { // from class: o.djn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14140dfo.copydefault(this.EZpvd, strEZpvd, jFetchVPNInfo, (java.util.List) obj);
                }
            };
            AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58260yxtKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.djl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C14140dfo.RXzakW(function12, obj);
                }
            });
            final Function1 function13 = new Function1() { // from class: o.djm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14140dfo.OLrzqt(this.OLrzqt, abstractC12782ctV, str, abstractC14702dqT, interfaceC14457dln, i, function1, (AAActiveRes) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.djo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14140dfo.alsFma(function13, obj);
                }
            };
            final Function1 function14 = new Function1() { // from class: o.djk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14140dfo.gEmmrt(this.AEQbTJ, abstractC14702dqT, interfaceC14457dln, str, abstractC12782ctV, i, function1, (java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58227yxM<? super R>) interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.djp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14140dfo.aHXSQp(function14, obj);
                }
            });
        } else {
            c14140dfo.EZpvd(abstractC14702dqT, interfaceC14457dln, str, abstractC12782ctV, i, (Function1<? super AbstractC12782ctV, Unit>) function1);
        }
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd RXzakW(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(C14140dfo c14140dfo, java.lang.String str, long j, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.isEmpty()) {
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new AAActiveRes((java.lang.String) null, (java.lang.Long) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        return c14140dfo.gEmmrt.AEQbTJ(str, j);
    }

    public static final void alsFma(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(final C14140dfo c14140dfo, final AbstractC12782ctV abstractC12782ctV, final java.lang.String str, final AbstractC14702dqT abstractC14702dqT, final InterfaceC14457dln interfaceC14457dln, final int i, final Function1 function1, AAActiveRes aAActiveRes) {
        java.lang.String strEZpvd;
        java.lang.String proxyAddress;
        java.lang.Boolean boolIsActive = aAActiveRes.isActive();
        if (Intrinsics.EZpvd(boolIsActive, java.lang.Boolean.TRUE)) {
            AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
            if (abstractC12784ctXGwTjWJ == null || (strEZpvd = abstractC12784ctXGwTjWJ.EZpvd()) == null) {
                strEZpvd = "";
            }
            java.lang.String str2 = strEZpvd;
            java.lang.String eoaAddress = aAActiveRes.getEoaAddress();
            if (eoaAddress == null) {
                return Unit.INSTANCE;
            }
            WalletType walletType = WalletType.HDWallet;
            java.lang.String aaAddress = aAActiveRes.getAaAddress();
            if (aaAddress != null && (proxyAddress = aAActiveRes.getProxyAddress()) != null) {
                createHDSmartAccount$default(c14140dfo, str2, str, null, null, eoaAddress, walletType, aaAddress, proxyAddress, 0, false, false, new Function1() { // from class: o.dft
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C14140dfo.OLrzqt(this.copydefault, abstractC12782ctV, abstractC14702dqT, interfaceC14457dln, str, i, function1, (AbstractC12782ctV) obj);
                    }
                }, 1544, null);
            }
            return Unit.INSTANCE;
        }
        if (Intrinsics.EZpvd(boolIsActive, java.lang.Boolean.FALSE)) {
            c14140dfo.EZpvd(abstractC14702dqT, interfaceC14457dln, str, abstractC12782ctV, i, (Function1<? super AbstractC12782ctV, Unit>) function1);
        } else {
            c14140dfo.EZpvd((AbstractC14702dqT) null, interfaceC14457dln, "", abstractC12782ctV, i, (Function1<? super AbstractC12782ctV, Unit>) function1);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final C14140dfo c14140dfo, AbstractC12782ctV abstractC12782ctV, final AbstractC14702dqT abstractC14702dqT, final InterfaceC14457dln interfaceC14457dln, final java.lang.String str, final int i, final Function1 function1, final AbstractC12782ctV abstractC12782ctV2) {
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = c14140dfo.djBIcL.copydefault(abstractC12782ctV.DbNXlk());
        final Function1 function12 = new Function1() { // from class: o.dip
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.copydefault(this.KWHzl, abstractC14702dqT, interfaceC14457dln, str, abstractC12782ctV2, i, function1, (java.lang.Integer) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.diy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14140dfo.Ufzxmz(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.diN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.AYXKKw(this.KWHzl, abstractC14702dqT, interfaceC14457dln, str, abstractC12782ctV2, i, function1, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.diZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14140dfo.aJFbMH(function13, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void Ufzxmz(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C14140dfo c14140dfo, AbstractC14702dqT abstractC14702dqT, InterfaceC14457dln interfaceC14457dln, java.lang.String str, AbstractC12782ctV abstractC12782ctV, int i, Function1 function1, java.lang.Integer num) {
        c14140dfo.EZpvd(abstractC14702dqT, interfaceC14457dln, str, abstractC12782ctV, i, (Function1<? super AbstractC12782ctV, Unit>) function1);
        return Unit.INSTANCE;
    }

    public static final void aJFbMH(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(C14140dfo c14140dfo, AbstractC14702dqT abstractC14702dqT, InterfaceC14457dln interfaceC14457dln, java.lang.String str, AbstractC12782ctV abstractC12782ctV, int i, Function1 function1, java.lang.Throwable th) {
        c14140dfo.EZpvd(abstractC14702dqT, interfaceC14457dln, str, abstractC12782ctV, i, (Function1<? super AbstractC12782ctV, Unit>) function1);
        return Unit.INSTANCE;
    }

    public static final void aHXSQp(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(C14140dfo c14140dfo, AbstractC14702dqT abstractC14702dqT, InterfaceC14457dln interfaceC14457dln, java.lang.String str, AbstractC12782ctV abstractC12782ctV, int i, Function1 function1, java.lang.Throwable th) {
        c14140dfo.EZpvd(abstractC14702dqT, interfaceC14457dln, str, abstractC12782ctV, i, (Function1<? super AbstractC12782ctV, Unit>) function1);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: o.dfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC58217yxC importHDWallet$default(C14140dfo c14140dfo, java.lang.String str, java.lang.String str2, boolean z, boolean z2, androidx.fragment.app.FragmentManager fragmentManager, InterfaceC14457dln interfaceC14457dln, yHO yho, Function1 function1, int i, java.lang.Object obj) {
        return c14140dfo.AEQbTJ(str, str2, z, z2, fragmentManager, interfaceC14457dln, (yHO<? super AbstractC12782ctV, ? super java.lang.Integer, ? super AbstractC14702dqT, Unit>) ((i & 64) != 0 ? null : yho), (Function1<? super AbstractC12782ctV, Unit>) ((i & 128) != 0 ? null : function1));
    }

    public final InterfaceC58217yxC AEQbTJ(final java.lang.String str, final java.lang.String str2, final boolean z, final boolean z2, androidx.fragment.app.FragmentManager fragmentManager, InterfaceC14457dln interfaceC14457dln, yHO<? super AbstractC12782ctV, ? super java.lang.Integer, ? super AbstractC14702dqT, Unit> yho, Function1<? super AbstractC12782ctV, Unit> function1) {
        return createWalletCommon$default(this, new Function0() { // from class: o.diW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14140dfo.AEQbTJ(this.OLrzqt, str2, str, z, z2);
            }
        }, str, fragmentManager, interfaceC14457dln, null, function1, yho, null, interfaceC14457dln instanceof C14459dlp ? 3 : 4, false, null, null, 3728, null);
    }

    public static final AbstractC58260yxt AEQbTJ(C14140dfo c14140dfo, java.lang.String str, java.lang.String str2, boolean z, boolean z2) {
        return c14140dfo.EZpvd(str, str2, z, z2);
    }

    public final InterfaceC58217yxC EZpvd(@NotNull final java.lang.String str, final long j, @NotNull java.lang.String str2, androidx.fragment.app.FragmentManager fragmentManager, @NotNull final InterfaceC14457dln interfaceC14457dln, @NotNull final Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(interfaceC14457dln, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return importPrivateKeyWallet$default(this, str, j, str2, fragmentManager, interfaceC14457dln, new yHO() { // from class: o.dgq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C14140dfo.KWHzl(this.EZpvd, interfaceC14457dln, str, function1, j, (AbstractC12782ctV) obj, ((java.lang.Integer) obj2).intValue(), (AbstractC14702dqT) obj3);
            }
        }, null, 64, null);
    }

    public static final Unit KWHzl(final C14140dfo c14140dfo, final InterfaceC14457dln interfaceC14457dln, final java.lang.String str, final Function1 function1, final long j, final AbstractC12782ctV abstractC12782ctV, final int i, final AbstractC14702dqT abstractC14702dqT) {
        if (abstractC12782ctV != null) {
            ((InterfaceC32807mkZ) C43251rlk.copydefault(InterfaceC32807mkZ.class)).EZpvd();
            C10854bwM c10854bwMIsConnected = c14140dfo.KWHzl.isConnected();
            final long jFetchVPNInfo = c10854bwMIsConnected != null ? c10854bwMIsConnected.fetchVPNInfo() : -1L;
            final java.lang.String strEZpvd = abstractC12782ctV.EZpvd(jFetchVPNInfo);
            AbstractC58260yxt<java.util.List<AbstractC12782ctV>> abstractC58260yxtKWHzl = c14140dfo.djBIcL.KWHzl(strEZpvd, WalletType.KeyWallet);
            final Function1 function12 = new Function1() { // from class: o.djr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14140dfo.AhwBna(this.KWHzl, strEZpvd, jFetchVPNInfo, (java.util.List) obj);
                }
            };
            AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58260yxtKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.dfr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C14140dfo.fLIjIY(function12, obj);
                }
            });
            final Function1 function13 = new Function1() { // from class: o.dfF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14140dfo.copydefault(this.KWHzl, str, j, abstractC12782ctV, abstractC14702dqT, interfaceC14457dln, i, function1, (AAActiveRes) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dfN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14140dfo.fsSxsn(function13, obj);
                }
            };
            final Function1 function14 = new Function1() { // from class: o.dfX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14140dfo.DbNXlk(this.OLrzqt, abstractC14702dqT, interfaceC14457dln, str, abstractC12782ctV, i, function1, (java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58227yxM<? super R>) interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dgk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14140dfo.gmHjFq(function14, obj);
                }
            });
        } else {
            c14140dfo.EZpvd(abstractC14702dqT, interfaceC14457dln, str, abstractC12782ctV, i, (Function1<? super AbstractC12782ctV, Unit>) function1);
        }
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd fLIjIY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AhwBna(C14140dfo c14140dfo, java.lang.String str, long j, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.isEmpty()) {
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new AAActiveRes((java.lang.String) null, (java.lang.Long) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        return c14140dfo.gEmmrt.AEQbTJ(str, j);
    }

    public static final void fsSxsn(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(final C14140dfo c14140dfo, final java.lang.String str, long j, final AbstractC12782ctV abstractC12782ctV, final AbstractC14702dqT abstractC14702dqT, final InterfaceC14457dln interfaceC14457dln, final int i, final Function1 function1, AAActiveRes aAActiveRes) {
        java.lang.String proxyAddress;
        java.lang.Boolean boolIsActive = aAActiveRes.isActive();
        if (Intrinsics.EZpvd(boolIsActive, java.lang.Boolean.TRUE)) {
            java.lang.String strRlQdEF = abstractC12782ctV.RlQdEF();
            java.lang.String eoaAddress = aAActiveRes.getEoaAddress();
            if (eoaAddress == null) {
                return Unit.INSTANCE;
            }
            WalletType walletType = WalletType.KeyWallet;
            java.lang.String aaAddress = aAActiveRes.getAaAddress();
            if (aaAddress != null && (proxyAddress = aAActiveRes.getProxyAddress()) != null) {
                createPrivateKeySmartAccount$default(c14140dfo, str, null, null, j, strRlQdEF, eoaAddress, walletType, aaAddress, proxyAddress, new Function1() { // from class: o.dhq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C14140dfo.djBIcL(this.copydefault, abstractC12782ctV, abstractC14702dqT, interfaceC14457dln, str, i, function1, (AbstractC12782ctV) obj);
                    }
                }, 4, null);
            }
            return Unit.INSTANCE;
        }
        if (Intrinsics.EZpvd(boolIsActive, java.lang.Boolean.FALSE)) {
            c14140dfo.EZpvd(abstractC14702dqT, interfaceC14457dln, str, abstractC12782ctV, i, (Function1<? super AbstractC12782ctV, Unit>) function1);
        } else {
            c14140dfo.EZpvd((AbstractC14702dqT) null, interfaceC14457dln, "", abstractC12782ctV, i, (Function1<? super AbstractC12782ctV, Unit>) function1);
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(final C14140dfo c14140dfo, AbstractC12782ctV abstractC12782ctV, final AbstractC14702dqT abstractC14702dqT, final InterfaceC14457dln interfaceC14457dln, final java.lang.String str, final int i, final Function1 function1, final AbstractC12782ctV abstractC12782ctV2) {
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = c14140dfo.djBIcL.copydefault(abstractC12782ctV.DbNXlk());
        final Function1 function12 = new Function1() { // from class: o.dib
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.gEmmrt(this.KWHzl, abstractC14702dqT, interfaceC14457dln, str, abstractC12782ctV2, i, function1, (java.lang.Integer) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dhX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14140dfo.gUEfcq(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.dif
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.AkhnZx(this.copydefault, abstractC14702dqT, interfaceC14457dln, str, abstractC12782ctV2, i, function1, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.did
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14140dfo.hlkKmr(function13, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void gUEfcq(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(C14140dfo c14140dfo, AbstractC14702dqT abstractC14702dqT, InterfaceC14457dln interfaceC14457dln, java.lang.String str, AbstractC12782ctV abstractC12782ctV, int i, Function1 function1, java.lang.Integer num) {
        c14140dfo.EZpvd(abstractC14702dqT, interfaceC14457dln, str, abstractC12782ctV, i, (Function1<? super AbstractC12782ctV, Unit>) function1);
        return Unit.INSTANCE;
    }

    public static final void hlkKmr(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AkhnZx(C14140dfo c14140dfo, AbstractC14702dqT abstractC14702dqT, InterfaceC14457dln interfaceC14457dln, java.lang.String str, AbstractC12782ctV abstractC12782ctV, int i, Function1 function1, java.lang.Throwable th) {
        c14140dfo.EZpvd(abstractC14702dqT, interfaceC14457dln, str, abstractC12782ctV, i, (Function1<? super AbstractC12782ctV, Unit>) function1);
        return Unit.INSTANCE;
    }

    public static final void gmHjFq(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit DbNXlk(C14140dfo c14140dfo, AbstractC14702dqT abstractC14702dqT, InterfaceC14457dln interfaceC14457dln, java.lang.String str, AbstractC12782ctV abstractC12782ctV, int i, Function1 function1, java.lang.Throwable th) {
        c14140dfo.EZpvd(abstractC14702dqT, interfaceC14457dln, str, abstractC12782ctV, i, (Function1<? super AbstractC12782ctV, Unit>) function1);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: o.dfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC58217yxC importPrivateKeyWallet$default(C14140dfo c14140dfo, java.lang.String str, long j, java.lang.String str2, androidx.fragment.app.FragmentManager fragmentManager, InterfaceC14457dln interfaceC14457dln, yHO yho, Function1 function1, int i, java.lang.Object obj) {
        return c14140dfo.KWHzl(str, j, str2, fragmentManager, interfaceC14457dln, (yHO<? super AbstractC12782ctV, ? super java.lang.Integer, ? super AbstractC14702dqT, Unit>) ((i & 32) != 0 ? null : yho), (Function1<? super AbstractC12782ctV, Unit>) ((i & 64) != 0 ? null : function1));
    }

    public final InterfaceC58217yxC KWHzl(final java.lang.String str, final long j, final java.lang.String str2, androidx.fragment.app.FragmentManager fragmentManager, InterfaceC14457dln interfaceC14457dln, yHO<? super AbstractC12782ctV, ? super java.lang.Integer, ? super AbstractC14702dqT, Unit> yho, Function1<? super AbstractC12782ctV, Unit> function1) {
        return createWalletCommon$default(this, new Function0() { // from class: o.diA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14140dfo.KWHzl(this.EZpvd, str2, j, str);
            }
        }, str, fragmentManager, interfaceC14457dln, null, function1, yho, null, interfaceC14457dln instanceof C14459dlp ? 3 : 4, false, null, null, 3728, null);
    }

    public static final AbstractC58260yxt KWHzl(C14140dfo c14140dfo, java.lang.String str, long j, java.lang.String str2) {
        return c14140dfo.EZpvd(str, j, str2);
    }

    public final InterfaceC58217yxC copydefault(@NotNull final java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, androidx.fragment.app.FragmentManager fragmentManager, @NotNull final InterfaceC14457dln interfaceC14457dln, @NotNull final Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(interfaceC14457dln, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return importTonWallet$default(this, str, str2, z, z2, fragmentManager, interfaceC14457dln, new yHO() { // from class: o.diX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C14140dfo.OLrzqt(this.EZpvd, interfaceC14457dln, str, function1, (AbstractC12782ctV) obj, ((java.lang.Integer) obj2).intValue(), (AbstractC14702dqT) obj3);
            }
        }, null, 128, null);
    }

    public static final Unit OLrzqt(C14140dfo c14140dfo, InterfaceC14457dln interfaceC14457dln, java.lang.String str, Function1 function1, AbstractC12782ctV abstractC12782ctV, int i, AbstractC14702dqT abstractC14702dqT) {
        c14140dfo.EZpvd(abstractC14702dqT, interfaceC14457dln, str, abstractC12782ctV, i, (Function1<? super AbstractC12782ctV, Unit>) function1);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: o.dfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC58217yxC importTonWallet$default(C14140dfo c14140dfo, java.lang.String str, java.lang.String str2, boolean z, boolean z2, androidx.fragment.app.FragmentManager fragmentManager, InterfaceC14457dln interfaceC14457dln, yHO yho, Function1 function1, int i, java.lang.Object obj) {
        return c14140dfo.OLrzqt(str, str2, z, z2, fragmentManager, interfaceC14457dln, (yHO<? super AbstractC12782ctV, ? super java.lang.Integer, ? super AbstractC14702dqT, Unit>) ((i & 64) != 0 ? null : yho), (Function1<? super AbstractC12782ctV, Unit>) ((i & 128) != 0 ? null : function1));
    }

    public final InterfaceC58217yxC OLrzqt(final java.lang.String str, final java.lang.String str2, final boolean z, final boolean z2, androidx.fragment.app.FragmentManager fragmentManager, InterfaceC14457dln interfaceC14457dln, yHO<? super AbstractC12782ctV, ? super java.lang.Integer, ? super AbstractC14702dqT, Unit> yho, Function1<? super AbstractC12782ctV, Unit> function1) {
        return createWalletCommon$default(this, new Function0() { // from class: o.dgC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14140dfo.EZpvd(this.OLrzqt, str2, str, z, z2);
            }
        }, str, fragmentManager, interfaceC14457dln, null, function1, yho, null, interfaceC14457dln instanceof C14459dlp ? 3 : 4, false, null, null, 3728, null);
    }

    public static final AbstractC58260yxt EZpvd(C14140dfo c14140dfo, java.lang.String str, java.lang.String str2, boolean z, boolean z2) {
        return c14140dfo.KWHzl(str, str2, z, z2);
    }

    public static /* synthetic */ InterfaceC58217yxC importTrackingWallet$default(C14140dfo c14140dfo, long j, java.lang.String str, boolean z, androidx.fragment.app.FragmentManager fragmentManager, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return c14140dfo.copydefault(j, str, z, fragmentManager, (Function1<? super AbstractC12782ctV, Unit>) function1);
    }

    public final InterfaceC58217yxC copydefault(final long j, @NotNull final java.lang.String str, final boolean z, androidx.fragment.app.FragmentManager fragmentManager, @NotNull Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return createWalletCommon$default(this, new Function0() { // from class: o.dhZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14140dfo.OLrzqt(this.OLrzqt, j, str, z);
            }
        }, null, fragmentManager, null, null, function1, null, null, 3, false, null, null, 3792, null);
    }

    public static final AbstractC58260yxt OLrzqt(C14140dfo c14140dfo, long j, java.lang.String str, boolean z) {
        return c14140dfo.OLrzqt(j, str, z);
    }

    public final InterfaceC58217yxC OLrzqt(@NotNull final KeystoneMultiAccount keystoneMultiAccount, final int i, @NotNull final java.util.List<KeystoneAddressInfo> list, InterfaceC14457dln interfaceC14457dln, androidx.fragment.app.FragmentManager fragmentManager, Function1<? super AbstractC12782ctV, Unit> function1, @NotNull Function1<? super AbstractC12782ctV, Unit> function12) {
        Intrinsics.checkNotNullParameter(keystoneMultiAccount, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return createWalletCommon$default(this, new Function0() { // from class: o.djc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14140dfo.AEQbTJ(this.AEQbTJ, keystoneMultiAccount, i, list);
            }
        }, "", fragmentManager, interfaceC14457dln, function1, function12, null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.sCB), 2, false, null, null, 3648, null);
    }

    public static final AbstractC58260yxt AEQbTJ(C14140dfo c14140dfo, KeystoneMultiAccount keystoneMultiAccount, int i, java.util.List list) {
        return c14140dfo.KWHzl(keystoneMultiAccount, i, (java.util.List<KeystoneAddressInfo>) list);
    }

    public final InterfaceC58217yxC OLrzqt(@NotNull final java.util.List<ChainAddress> list, final int i, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.util.List<OneKeyAccountInfo> list2, InterfaceC14457dln interfaceC14457dln, androidx.fragment.app.FragmentManager fragmentManager, Function1<? super AbstractC12782ctV, Unit> function1, @NotNull Function1<? super AbstractC12782ctV, Unit> function12) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return createWalletCommon$default(this, new Function0() { // from class: o.dgK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14140dfo.KWHzl(this.copydefault, list, str, str2, str3, str4, list2, i);
            }
        }, "", fragmentManager, interfaceC14457dln, function1, function12, null, C33069mpW.copydefault(C13754dXa.FragmentManager.ActivityResultRegistryOwner, C56423yEv.EZpvd(C56390yDp.OLrzqt("device", C33070mpX.AYXKKw(C13754dXa.FragmentManager.sendBehavioSecData)))), 2, false, null, null, 3648, null);
    }

    public static final AbstractC58260yxt KWHzl(C14140dfo c14140dfo, java.util.List list, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list2, int i) {
        return c14140dfo.AEQbTJ((java.util.List<ChainAddress>) list, str, str2, str3, str4, (java.util.List<OneKeyAccountInfo>) list2, i);
    }

    public final InterfaceC58217yxC EZpvd(@NotNull final java.util.List<ChainAddress> list, final int i, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final C13854daT c13854daT, InterfaceC14457dln interfaceC14457dln, int i2, androidx.fragment.app.FragmentManager fragmentManager, Function1<? super AbstractC12782ctV, Unit> function1, @NotNull Function1<? super AbstractC12782ctV, Unit> function12) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(c13854daT, "");
        Intrinsics.checkNotNullParameter(function12, "");
        return createWalletCommon$default(this, new Function0() { // from class: o.dgf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14140dfo.copydefault(this.OLrzqt, list, str, str2, str3, str4, c13854daT, i);
            }
        }, "", fragmentManager, interfaceC14457dln, function1, function12, null, C33069mpW.copydefault(C13754dXa.FragmentManager.ActivityResultRegistryOwner, C56423yEv.EZpvd(C56390yDp.OLrzqt("device", C33070mpX.AYXKKw(C13754dXa.FragmentManager.sbu)))), i2, false, null, null, 3648, null);
    }

    public static final AbstractC58260yxt copydefault(C14140dfo c14140dfo, java.util.List list, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, C13854daT c13854daT, int i) {
        return c14140dfo.copydefault((java.util.List<ChainAddress>) list, str, str2, str3, str4, c13854daT, i);
    }

    public final AbstractC58260yxt<java.lang.String> KWHzl(final java.lang.String str) {
        AbstractC58260yxt<java.util.List<AbstractC12784ctX>> abstractC58260yxtWlaJM = this.djBIcL.wlaJM(yDY.gEmmrt(WalletType.HDWallet, WalletType.HardwareWallet, WalletType.TonWallet));
        final Function1 function1 = new Function1() { // from class: o.dgO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.KWHzl(this.OLrzqt, str, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtWlaJM.OLrzqt(new InterfaceC58229yxO() { // from class: o.dgQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.QVsKAR(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.dgS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.AkhnZx(this.EZpvd, (java.lang.String) obj);
            }
        };
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.dgR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.aUsmxb(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final InterfaceC58261yxu QVsKAR(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu aUsmxb(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AkhnZx(C14140dfo c14140dfo, final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtDeleteDemoWallet$default = C12827cuN.deleteDemoWallet$default(c14140dfo.djBIcL, false, 1, null);
        final Function1 function1 = new Function1() { // from class: o.dhB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.ejfBZ(str, (java.lang.Integer) obj);
            }
        };
        return abstractC58260yxtDeleteDemoWallet$default.copydefault(new InterfaceC58229yxO() { // from class: o.dhy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.USBtdM(function1, obj);
            }
        });
    }

    public static final java.lang.String USBtdM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public final AbstractC58260yxt<java.lang.String> OLrzqt(final java.lang.String str, final java.lang.String str2, final MpcWalletDecodeInfo mpcWalletDecodeInfo) {
        if (mpcWalletDecodeInfo == null) {
            C10856bwO.EZpvd("WalletCreateHelper", new OKWException("mpcShareInfo is empty", null));
            AbstractC58260yxt<java.lang.String> abstractC58260yxtAEQbTJ = AbstractC58260yxt.AEQbTJ(new EmptyMpcInfoException());
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtAEQbTJ, "");
            return abstractC58260yxtAEQbTJ;
        }
        AbstractC58260yxt<java.util.List<AbstractC12784ctX>> abstractC58260yxtKWHzl = this.djBIcL.KWHzl(WalletType.MPCWallet);
        final Function1 function1 = new Function1() { // from class: o.dgm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.KWHzl(str2, this, str, mpcWalletDecodeInfo, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.dgp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.UrRBLY(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.dgn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.AuCTel(this.EZpvd, (java.lang.String) obj);
            }
        };
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.dgr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.DWgRXt(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final InterfaceC58261yxu UrRBLY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu DWgRXt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AuCTel(C14140dfo c14140dfo, final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtDeleteDemoWallet$default = C12827cuN.deleteDemoWallet$default(c14140dfo.djBIcL, false, 1, null);
        final Function1 function1 = new Function1() { // from class: o.dhf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.hDKMBd(str, (java.lang.Integer) obj);
            }
        };
        return abstractC58260yxtDeleteDemoWallet$default.copydefault(new InterfaceC58229yxO() { // from class: o.dhi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.fHqPtx(function1, obj);
            }
        });
    }

    public static final java.lang.String fHqPtx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public final AbstractC58260yxt<java.lang.String> KWHzl(final java.lang.String str, final MpcWalletDecodeInfo mpcWalletDecodeInfo, final java.lang.String str2, final java.lang.String str3) {
        if (mpcWalletDecodeInfo == null) {
            AbstractC58260yxt<java.lang.String> abstractC58260yxtAEQbTJ = AbstractC58260yxt.AEQbTJ(new EmptyMpcInfoException());
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtAEQbTJ, "");
            return abstractC58260yxtAEQbTJ;
        }
        AbstractC58260yxt<java.util.List<AbstractC12784ctX>> abstractC58260yxtKWHzl = this.djBIcL.KWHzl(WalletType.MPCWallet);
        final Function1 function1 = new Function1() { // from class: o.dhr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.OLrzqt(str3, this, str, mpcWalletDecodeInfo, str2, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.dho
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.ixgjPv(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.dhu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.ejfBZ(this.OLrzqt, (java.lang.String) obj);
            }
        };
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.dhx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.DCUTEIdCUTEI(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final InterfaceC58261yxu ixgjPv(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu DCUTEIdCUTEI(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final java.lang.String Dmq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu ejfBZ(C14140dfo c14140dfo, final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtDeleteDemoWallet$default = C12827cuN.deleteDemoWallet$default(c14140dfo.djBIcL, false, 1, null);
        final Function1 function1 = new Function1() { // from class: o.dio
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.fIwbmz(str, (java.lang.Integer) obj);
            }
        };
        return abstractC58260yxtDeleteDemoWallet$default.copydefault(new InterfaceC58229yxO() { // from class: o.din
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.Dmq(function1, obj);
            }
        });
    }

    public final AbstractC58260yxt<java.lang.String> copydefault(final java.lang.String str, final java.lang.String str2, final MpcWalletDecodeInfo mpcWalletDecodeInfo, final java.lang.String str3, final WalletType walletType, final java.lang.String str4, final java.lang.String str5, final boolean z) {
        if (mpcWalletDecodeInfo == null) {
            AbstractC58260yxt<java.lang.String> abstractC58260yxtAEQbTJ = AbstractC58260yxt.AEQbTJ(new EmptyMpcInfoException());
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtAEQbTJ, "");
            return abstractC58260yxtAEQbTJ;
        }
        AbstractC58260yxt<java.util.List<AbstractC12782ctV>> abstractC58260yxtEZpvd = this.djBIcL.EZpvd(str3, walletType);
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtAhwBna = this.djBIcL.AhwBna(str2);
        final Function2 function2 = new Function2() { // from class: o.dfS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C14140dfo.KWHzl(this.KWHzl, (java.util.List) obj, (java.lang.Integer) obj2);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(abstractC58260yxtEZpvd, abstractC58260yxtAhwBna, new InterfaceC58223yxI() { // from class: o.dfV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C14140dfo.fIwbmz(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.dfU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.KWHzl(this.KWHzl, str, str2, mpcWalletDecodeInfo, str3, walletType, str4, str5, z, (java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.dfR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.KDccX(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final java.lang.Integer fIwbmz(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (java.lang.Integer) function2.invoke(obj, obj2);
    }

    public static final java.lang.Integer KWHzl(C14140dfo c14140dfo, java.util.List list, java.lang.Integer num) throws WalletImportError {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(num, "");
        if (!(!list.isEmpty())) {
            return num;
        }
        c14140dfo.valueOf.copydefault("WalletCreateHelper", "generateMpcCreateSmartWallet", WalletType.MPCWallet);
        throw WalletImportError.Companion.KWHzl();
    }

    public static final InterfaceC58261yxu KDccX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(C14140dfo c14140dfo, java.lang.String str, java.lang.String str2, MpcWalletDecodeInfo mpcWalletDecodeInfo, java.lang.String str3, WalletType walletType, java.lang.String str4, java.lang.String str5, boolean z, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        int iIntValue = num.intValue();
        int i = iIntValue + 1;
        C10856bwO.copydefault("WalletCreateHelper", 0, "generateMpcCreateSmartWallet addressIndex " + i);
        return c14140dfo.AhwBna.AEQbTJ(createWalletName$default(c14140dfo, null, iIntValue + 2, true, 1, null), i, str, str2, mpcWalletDecodeInfo, str3, walletType, str4, str5, z);
    }

    public static final java.lang.Integer ODXsMY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public final AbstractC58260yxt<java.lang.Integer> copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt maxWalletIndex$default = C12827cuN.getMaxWalletIndex$default(this.djBIcL, str, null, 2, null);
        final Function1 function1 = new Function1() { // from class: o.dih
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.OLrzqt((java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = maxWalletIndex$default.copydefault(new InterfaceC58229yxO() { // from class: o.dik
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.ODXsMY(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.lang.Integer OLrzqt(java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return java.lang.Integer.valueOf(num.intValue() + 1);
    }

    public static /* synthetic */ AbstractC58260yxt generateAccount$default(C14140dfo c14140dfo, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 16) != 0) {
            z = true;
        }
        return c14140dfo.AEQbTJ(str, str2, i, str3, z);
    }

    public final AbstractC58260yxt<java.lang.String> AEQbTJ(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, boolean z) {
        return this.AhwBna.AEQbTJ(str, str2, i, str3, z);
    }

    public static /* synthetic */ AbstractC58260yxt generateMPCAccount$default(C14140dfo c14140dfo, java.lang.String str, java.lang.String str2, MpcWalletEncodeInfo mpcWalletEncodeInfo, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return c14140dfo.KWHzl(str, str2, mpcWalletEncodeInfo, z);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.bzJ.ActionBar.getInstance$default(o.bzJ$ActionBar, android.content.Context, int, java.lang.Object):o.bzJ */
    public final AbstractC58260yxt<java.lang.String> KWHzl(final java.lang.String str, final java.lang.String str2, final MpcWalletEncodeInfo mpcWalletEncodeInfo, final boolean z) {
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAhwBna = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).AhwBna(str2);
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str, WalletType.MPCWallet);
        final Function2 function2 = new Function2() { // from class: o.djs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C14140dfo.EZpvd(str2, mpcWalletEncodeInfo, (java.lang.String) obj, (java.lang.Integer) obj2);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = AbstractC58260yxt.OLrzqt(abstractC58260yxtAhwBna, abstractC58260yxtOLrzqt, new InterfaceC58223yxI() { // from class: o.djt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C14140dfo.values(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.djy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.OLrzqt(this.copydefault, str, str2, z, (kotlin.Pair) obj);
            }
        };
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.OLrzqt(new InterfaceC58229yxO() { // from class: o.djw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.DcqEDu(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt3, "");
        return abstractC58260yxtOLrzqt3;
    }

    public static final kotlin.Pair values(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair EZpvd(java.lang.String str, MpcWalletEncodeInfo mpcWalletEncodeInfo, java.lang.String str2, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(num, "");
        MpcWalletDecodeInfo mpcWalletDecodeInfoOLrzqt = C10964byQ.OLrzqt(str, str2, mpcWalletEncodeInfo);
        int iIntValue = num.intValue() + 1;
        C10856bwO.copydefault("WalletCreateHelper", 0, "generateMPCAccount addressIndex " + iIntValue);
        return C56390yDp.OLrzqt(mpcWalletDecodeInfoOLrzqt, java.lang.Integer.valueOf(iIntValue));
    }

    public static final InterfaceC58261yxu DcqEDu(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(C14140dfo c14140dfo, java.lang.String str, java.lang.String str2, boolean z, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        MpcWalletDecodeInfo mpcWalletDecodeInfo = (MpcWalletDecodeInfo) pair.getFirst();
        int iIntValue = ((java.lang.Number) pair.getSecond()).intValue();
        return c14140dfo.AhwBna.OLrzqt(str, createWalletName$default(c14140dfo, null, iIntValue + 1, false, 5, null), str2, iIntValue, z, mpcWalletDecodeInfo);
    }

    public final AbstractC58260yxt<java.lang.String> OLrzqt(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final java.lang.String str5, final WalletType walletType, final int i, final boolean z) {
        AbstractC58260yxt<java.util.List<AbstractC12782ctV>> abstractC58260yxtKWHzl = this.djBIcL.KWHzl(str5, walletType);
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtAhwBna = this.djBIcL.AhwBna(str);
        final Function2 function2 = new Function2() { // from class: o.diF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C14140dfo.copydefault(this.copydefault, (java.util.List) obj, (java.lang.Integer) obj2);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(abstractC58260yxtKWHzl, abstractC58260yxtAhwBna, new InterfaceC58223yxI() { // from class: o.diK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C14140dfo.ejfBZ(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.diG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.KWHzl(this.OLrzqt, str, i, str2, str3, str4, str5, walletType, z, (java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.diH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.QXDzTk(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final java.lang.Integer ejfBZ(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (java.lang.Integer) function2.invoke(obj, obj2);
    }

    public static final java.lang.Integer copydefault(C14140dfo c14140dfo, java.util.List list, java.lang.Integer num) throws WalletImportError {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(num, "");
        if (!(!list.isEmpty())) {
            return num;
        }
        c14140dfo.valueOf.copydefault("WalletCreateHelper", "generateSmartAccount", WalletType.HDWallet);
        throw WalletImportError.Companion.KWHzl();
    }

    public static final InterfaceC58261yxu QXDzTk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(C14140dfo c14140dfo, java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, WalletType walletType, boolean z, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return c14140dfo.AhwBna.OLrzqt(str, createWalletName$default(c14140dfo, null, num.intValue() + 2, true, 1, null), i, str2, str3, str4, str5, walletType, z);
    }

    public final AbstractC58260yxt<java.lang.String> AEQbTJ(final java.lang.String str, final long j, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final java.lang.String str5, final WalletType walletType) {
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAhwBna = this.AEQbTJ.AhwBna(str);
        AbstractC58260yxt<java.util.List<AbstractC12782ctV>> abstractC58260yxtKWHzl = this.djBIcL.KWHzl(str5, walletType);
        final Function2 function2 = new Function2() { // from class: o.djv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C14140dfo.KWHzl(this.KWHzl, str, str2, (java.lang.String) obj, (java.util.List) obj2);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(abstractC58260yxtAhwBna, abstractC58260yxtKWHzl, new InterfaceC58223yxI() { // from class: o.dju
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C14140dfo.fARcdN(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.djx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.copydefault(this.KWHzl, str3, str, j, str4, str5, walletType, (java.lang.String) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.djA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.DGOPHZDGOPHZ(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.djB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.hDKMBd(this.OLrzqt, (java.lang.String) obj);
            }
        };
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.OLrzqt(new InterfaceC58229yxO() { // from class: o.djC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.OTwTPd(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt3, "");
        return abstractC58260yxtOLrzqt3;
    }

    public static final java.lang.String fARcdN(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (java.lang.String) function2.invoke(obj, obj2);
    }

    public static final java.lang.String KWHzl(C14140dfo c14140dfo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list) throws WalletImportError {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.isEmpty()) {
            c14140dfo.valueOf.copydefault("WalletCreateHelper", "generatePrivateKeySmartAccount", WalletType.KeyWallet);
            throw WalletImportError.Companion.KWHzl();
        }
        return xXW.OLrzqt.AEQbTJ(str, str3, str2, true);
    }

    public static final InterfaceC58261yxu DGOPHZDGOPHZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.deg.getAddressStr$default(o.deg, java.lang.String, boolean, int, java.lang.Object):java.lang.String */
    public static final InterfaceC58261yxu copydefault(C14140dfo c14140dfo, java.lang.String str, java.lang.String str2, long j, java.lang.String str3, java.lang.String str4, WalletType walletType, java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str5, "");
        return c14140dfo.AhwBna.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.RgaQzq) + " " + C14079deg.getAddressStr$default(C14079deg.EZpvd, str, false, 2, null), str2, j, str5, str, str3, str4, walletType);
    }

    public static final InterfaceC58261yxu OTwTPd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final java.lang.String DGUQLI(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu hDKMBd(C14140dfo c14140dfo, final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtDeleteDemoWallet$default = C12827cuN.deleteDemoWallet$default(c14140dfo.djBIcL, false, 1, null);
        final Function1 function1 = new Function1() { // from class: o.dhH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.getFieldNames(str, (java.lang.Integer) obj);
            }
        };
        return abstractC58260yxtDeleteDemoWallet$default.copydefault(new InterfaceC58229yxO() { // from class: o.dhG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.DGUQLI(function1, obj);
            }
        });
    }

    public final AbstractC58260yxt<java.lang.String> EZpvd(final java.lang.String str, final java.lang.String str2, final boolean z, final boolean z2) {
        AbstractC58260yxt<java.util.List<AbstractC12784ctX>> abstractC58260yxtWlaJM = this.djBIcL.wlaJM(yDY.gEmmrt(WalletType.HDWallet, WalletType.HardwareWallet, WalletType.TonWallet));
        final Function1 function1 = new Function1() { // from class: o.dgX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.AEQbTJ(this.EZpvd, str2, str, z, z2, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtWlaJM.OLrzqt(new InterfaceC58229yxO() { // from class: o.dgV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.fdOvFl(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.dgU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.DbNXlk(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.dgW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.igXuih(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final InterfaceC58261yxu fdOvFl(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu igXuih(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu DbNXlk(C14140dfo c14140dfo, final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtDeleteDemoWallet$default = C12827cuN.deleteDemoWallet$default(c14140dfo.djBIcL, false, 1, null);
        final Function1 function1 = new Function1() { // from class: o.dhv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.AuCTel(str, (java.lang.Integer) obj);
            }
        };
        return abstractC58260yxtDeleteDemoWallet$default.copydefault(new InterfaceC58229yxO() { // from class: o.dhz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.fjfviF(function1, obj);
            }
        });
    }

    public static final java.lang.String fjfviF(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final java.util.List DaRZkR(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public final AbstractC58260yxt<java.lang.String> EZpvd(final java.lang.String str, final long j, final java.lang.String str2) {
        AbstractC58260yxt abstractC58260yxtCopydefault = C12827cuN.fetchAllWallets$default(this.djBIcL, false, false, false, 7, null).copydefault((InterfaceC58229yxO) new C14220dhO(new Function1() { // from class: o.dhR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.OLrzqt((java.util.List) obj);
            }
        }));
        final Function1 function1 = new Function1() { // from class: o.dhQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.KWHzl(this.AEQbTJ, str2, j, str, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.dhP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.DGgnkA(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.dhN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.OLrzqt(this.AEQbTJ, str, j, str2, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.dhW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.DsrFlB(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.dhS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.uzCIH(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.OLrzqt(new InterfaceC58229yxO() { // from class: o.dhU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.QDqgQU(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt3, "");
        return abstractC58260yxtOLrzqt3;
    }

    public static final InterfaceC58261yxu DGgnkA(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(final C14140dfo c14140dfo, final java.lang.String str, final long j, final java.lang.String str2, final java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAhwBna = c14140dfo.AEQbTJ.AhwBna(str);
        final Function1 function1 = new Function1() { // from class: o.dgo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.EZpvd(list, str, c14140dfo, j, str2, (java.lang.String) obj);
            }
        };
        return abstractC58260yxtAhwBna.copydefault(new InterfaceC58229yxO() { // from class: o.dgl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.DNMMPQ(function1, obj);
            }
        });
    }

    public static final java.util.List DNMMPQ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.util.List EZpvd(java.util.List list, java.lang.String str, C14140dfo c14140dfo, long j, java.lang.String str2, java.lang.String str3) throws WalletImportError {
        java.lang.String str4;
        java.lang.Object next;
        long j2 = j;
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.copydefault(list);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) it.next();
            java.lang.String strAEQbTJ = xXW.OLrzqt.AEQbTJ(str, str3, abstractC12782ctV.RlQdEF(), true);
            if (abstractC12782ctV.QwvEab() == WalletType.HDWallet) {
                C10854bwM c10854bwMKWHzl = c14140dfo.KWHzl.KWHzl(j2);
                if (c10854bwMKWHzl == null) {
                    CustomChainCoinMeta customChainCoinMetaOLrzqt = c14140dfo.OLrzqt.OLrzqt(j2);
                    c10854bwMKWHzl = customChainCoinMetaOLrzqt != null ? customChainCoinMetaOLrzqt.AEQbTJ() : null;
                }
                if (c10854bwMKWHzl == null || !c10854bwMKWHzl.QCjLjM()) {
                    str4 = "";
                    xYS xys = xYS.copydefault;
                    java.lang.String strDCUTEI = abstractC12782ctV.DCUTEI();
                    if (c10854bwMKWHzl == null) {
                        strAEQbTJ = xys.KWHzl(strAEQbTJ, strDCUTEI, c10854bwMKWHzl.QKVWgx(), true, abstractC12782ctV.finit(), C8322bAY.KWHzl.KWHzl(c10854bwMKWHzl.fetchVPNInfo(), true), str4, abstractC12782ctV.QVAiDq());
                    } else {
                        throw WalletImportError.Activity.dataError$default(WalletImportError.Companion, null, 0, 3, null);
                    }
                } else {
                    java.util.Iterator<T> it2 = abstractC12782ctV.valueOf().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (((ChainAddress) next).getCoinId() == j2) {
                            break;
                        }
                    }
                    ChainAddress chainAddress = (ChainAddress) next;
                    java.lang.String address = chainAddress != null ? chainAddress.getAddress() : null;
                    if (address != null) {
                        str4 = address;
                    }
                    xYS xys2 = xYS.copydefault;
                    java.lang.String strDCUTEI2 = abstractC12782ctV.DCUTEI();
                    if (c10854bwMKWHzl == null) {
                    }
                }
            }
            if (C54909xZv.OLrzqt.copydefault(C9678baC.Companion.AEQbTJ(), strAEQbTJ, str2) && abstractC12782ctV.AhwBna(java.lang.Long.valueOf(j))) {
                c14140dfo.valueOf.EZpvd("WalletCreateHelper", "generatePrivateKeyWallet");
                throw WalletImportError.Companion.AYXKKw();
            }
            j2 = j;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((AbstractC12782ctV) obj).getNewProxyInstance() == WalletType.KeyWallet.ordinal()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final InterfaceC58261yxu DsrFlB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(C14140dfo c14140dfo, java.lang.String str, long j, java.lang.String str2, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return c14140dfo.AhwBna.copydefault(C33070mpX.AYXKKw(C13754dXa.FragmentManager.OnBackPressedDispatcher1), c14140dfo.EZpvd((java.util.List<? extends AbstractC12782ctV>) list, str, j), str2, j, str);
    }

    public static final InterfaceC58261yxu QDqgQU(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final java.lang.String RKcVTr(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu uzCIH(C14140dfo c14140dfo, final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtDeleteDemoWallet$default = C12827cuN.deleteDemoWallet$default(c14140dfo.djBIcL, false, 1, null);
        final Function1 function1 = new Function1() { // from class: o.dii
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.AuCTelauCTel(str, (java.lang.Integer) obj);
            }
        };
        return abstractC58260yxtDeleteDemoWallet$default.copydefault(new InterfaceC58229yxO() { // from class: o.dil
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.RKcVTr(function1, obj);
            }
        });
    }

    public final java.lang.String EZpvd(java.util.List<? extends AbstractC12782ctV> list, java.lang.String str, long j) {
        if (list.isEmpty()) {
            SPUtils.put("private_key_wallet_index_key", 0);
        }
        C10854bwM c10854bwMKWHzl = this.KWHzl.KWHzl(j);
        if (c10854bwMKWHzl != null && c10854bwMKWHzl.dxcTrN()) {
            return createWalletName$default(this, null, copydefault(list), false, 5, null);
        }
        WalletAddressItem walletAddressItemGenerateKeyAddress$default = C13847daM.generateKeyAddress$default(new C13847daM(c10854bwMKWHzl != null ? c10854bwMKWHzl.fetchVPNInfo() : 1L), str, 0, "", 2, null);
        java.lang.String address = walletAddressItemGenerateKeyAddress$default != null ? walletAddressItemGenerateKeyAddress$default.getAddress() : null;
        if (address == null || address.length() == 0) {
            return createWalletName$default(this, null, copydefault(list), false, 5, null);
        }
        return C14079deg.getAddressStr$default(C14079deg.EZpvd, address, false, 2, null);
    }

    public final int copydefault(java.util.List<? extends AbstractC12782ctV> list) {
        int iIntValue = list.isEmpty() ? 1 : 1 + SPUtils.getInt("private_key_wallet_index_key", list.size()).intValue();
        SPUtils.put("private_key_wallet_index_key", java.lang.Integer.valueOf(iIntValue));
        return iIntValue;
    }

    public final AbstractC58260yxt<java.lang.String> KWHzl(final ChainAddress chainAddress, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, int i) {
        final HardwareType hardwareTypeAEQbTJ = HardwareType.Companion.AEQbTJ(i);
        AbstractC58260yxt<java.util.List<AbstractC12784ctX>> abstractC58260yxtWlaJM = this.djBIcL.wlaJM(yDY.gEmmrt(WalletType.HDWallet, WalletType.HardwareWallet, WalletType.TonWallet));
        AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = C12827cuN.fetchAllWallets$default(this.djBIcL, false, false, false, 7, null);
        final Function1 function1 = new Function1() { // from class: o.dfA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.AEQbTJ(str, this, hardwareTypeAEQbTJ, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtFetchAllWallets$default.copydefault(new InterfaceC58229yxO() { // from class: o.dfz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.QwvEab(function1, obj);
            }
        });
        final Function2 function2 = new Function2() { // from class: o.dfE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C14140dfo.EZpvd((java.util.List) obj, (java.util.List) obj2);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(abstractC58260yxtWlaJM, abstractC58260yxtCopydefault, new InterfaceC58223yxI() { // from class: o.dfG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C14140dfo.isConnected(function2, obj, obj2);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.dfC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.EZpvd(this.OLrzqt, hardwareTypeAEQbTJ, chainAddress, str, str2, str3, (kotlin.Pair) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.dfD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.fERRXa(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.dfK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.OLrzqt(this.copydefault, chainAddress, (kotlin.Pair) obj);
            }
        };
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.OLrzqt(new InterfaceC58229yxO() { // from class: o.dfI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.htlTjW(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt3, "");
        return abstractC58260yxtOLrzqt3;
    }

    public static final java.util.List QwvEab(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final kotlin.Pair isConnected(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair EZpvd(java.util.List list, java.util.List list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return C56390yDp.OLrzqt(list, list2);
    }

    public static final InterfaceC58261yxu fERRXa(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(C14140dfo c14140dfo, HardwareType hardwareType, ChainAddress chainAddress, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.Pair pair) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(pair, "");
        java.lang.Object first = pair.getFirst();
        Intrinsics.checkNotNullExpressionValue(first, "");
        java.lang.Object second = pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "");
        java.util.List list = (java.util.List) second;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : (java.util.List) first) {
            if (c14140dfo.KWHzl((AbstractC12784ctX) obj, hardwareType)) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        java.lang.Integer num = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int iAhwBna = ((AbstractC12784ctX) next).AhwBna();
                do {
                    java.lang.Object next2 = it.next();
                    int iAhwBna2 = ((AbstractC12784ctX) next2).AhwBna();
                    if (iAhwBna < iAhwBna2) {
                        next = next2;
                        iAhwBna = iAhwBna2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) next;
        int iAhwBna3 = abstractC12784ctX != null ? abstractC12784ctX.AhwBna() : -1;
        if (iAhwBna3 == -1) {
            iAhwBna3 = arrayList.size();
        }
        C13092czN c13092czN = c14140dfo.AhwBna;
        int i = iAhwBna3 + 1;
        java.lang.String strCopydefault = c14140dfo.copydefault(c14140dfo.OLrzqt(hardwareType), i);
        java.util.Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(((AbstractC12782ctV) it2.next()).finit());
            loop1: while (true) {
                num = numValueOf;
                while (it2.hasNext()) {
                    numValueOf = java.lang.Integer.valueOf(((AbstractC12782ctV) it2.next()).finit());
                    if (num.compareTo(numValueOf) < 0) {
                        break;
                    }
                }
            }
        }
        return c13092czN.AEQbTJ(strCopydefault, i, createWalletName$default(c14140dfo, null, (num != null ? num.intValue() : -1) + 2, false, 5, null), chainAddress, new C13854daT(str, null, str2, str3, hardwareType, null, java.lang.System.currentTimeMillis(), null, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, null));
    }

    public static final InterfaceC58261yxu OLrzqt(C14140dfo c14140dfo, ChainAddress chainAddress, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        final java.lang.String str = (java.lang.String) pair.component1();
        AbstractC58260yxt abstractC58260yxtDeleteDemoWallet$default = C12827cuN.deleteDemoWallet$default(c14140dfo.djBIcL, false, 1, null);
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtOLrzqt = c14140dfo.djBIcL.OLrzqt(chainAddress.getCoinId(), C56402yEa.EZpvd(chainAddress));
        final Function2 function2 = new Function2() { // from class: o.dfM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C14140dfo.KWHzl(str, (java.lang.Integer) obj, (java.lang.Integer) obj2);
            }
        };
        return AbstractC58260yxt.OLrzqt(abstractC58260yxtDeleteDemoWallet$default, abstractC58260yxtOLrzqt, new InterfaceC58223yxI() { // from class: o.dfQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C14140dfo.fetchVPNInfo(function2, obj, obj2);
            }
        });
    }

    public static final InterfaceC58261yxu htlTjW(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final java.lang.String fetchVPNInfo(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (java.lang.String) function2.invoke(obj, obj2);
    }

    public final boolean KWHzl(AbstractC12784ctX abstractC12784ctX, HardwareType hardwareType) {
        int i = Activity.OLrzqt[hardwareType.ordinal()];
        if (i == 1) {
            return abstractC12784ctX.iwGUEr();
        }
        if (i == 2) {
            return abstractC12784ctX.hDKMBd();
        }
        return abstractC12784ctX.iwGUEr();
    }

    public final AbstractC58260yxt<java.lang.String> AEQbTJ(final java.lang.String str, final ChainAddress chainAddress, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final int i, final java.lang.String str5, final java.lang.String str6, final java.lang.String str7, final WalletType walletType) {
        AbstractC58260yxt<java.util.List<AbstractC12784ctX>> abstractC58260yxtWlaJM = this.djBIcL.wlaJM(yDY.gEmmrt(WalletType.HDWallet, WalletType.HardwareWallet, WalletType.TonWallet));
        final Function1 function1 = new Function1() { // from class: o.diU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.OLrzqt(this.AEQbTJ, str, chainAddress, str2, str3, str4, i, str5, str6, str7, walletType, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtWlaJM.OLrzqt(new InterfaceC58229yxO() { // from class: o.diR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.UlJrfe(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.diS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.EZpvd(this.OLrzqt, chainAddress, (kotlin.Pair) obj);
            }
        };
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.diY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.dUDNAs(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final InterfaceC58261yxu UlJrfe(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(C14140dfo c14140dfo, java.lang.String str, ChainAddress chainAddress, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.String str5, java.lang.String str6, java.lang.String str7, WalletType walletType, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return c14140dfo.AhwBna.AEQbTJ(str, chainAddress, new C13854daT(str2, null, str3, str4, HardwareType.Companion.AEQbTJ(i), null, java.lang.System.currentTimeMillis(), null, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, null), str5, str6, str7, walletType);
    }

    public static final InterfaceC58261yxu EZpvd(C14140dfo c14140dfo, ChainAddress chainAddress, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        final java.lang.String str = (java.lang.String) pair.component1();
        AbstractC58260yxt abstractC58260yxtDeleteDemoWallet$default = C12827cuN.deleteDemoWallet$default(c14140dfo.djBIcL, false, 1, null);
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtOLrzqt = c14140dfo.djBIcL.OLrzqt(chainAddress.getCoinId(), C56402yEa.EZpvd(chainAddress));
        final Function2 function2 = new Function2() { // from class: o.dgJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C14140dfo.copydefault(str, (java.lang.Integer) obj, (java.lang.Integer) obj2);
            }
        };
        return AbstractC58260yxt.OLrzqt(abstractC58260yxtDeleteDemoWallet$default, abstractC58260yxtOLrzqt, new InterfaceC58223yxI() { // from class: o.dgP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C14140dfo.AkhnZx(function2, obj, obj2);
            }
        });
    }

    public static final InterfaceC58261yxu dUDNAs(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final java.lang.String AkhnZx(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (java.lang.String) function2.invoke(obj, obj2);
    }

    public final AbstractC58260yxt<java.lang.String> KWHzl(final java.lang.String str, final java.lang.String str2, final boolean z, final boolean z2) {
        AbstractC58260yxt<java.util.List<AbstractC12784ctX>> abstractC58260yxtWlaJM = this.djBIcL.wlaJM(yDY.gEmmrt(WalletType.HDWallet, WalletType.HardwareWallet, WalletType.TonWallet));
        final Function1 function1 = new Function1() { // from class: o.dhI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.EZpvd(this.EZpvd, str2, str, z, z2, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtWlaJM.OLrzqt(new InterfaceC58229yxO() { // from class: o.dhL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.RVsVBY(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.dhK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.iwGUEr(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.dhM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.UhxbNG(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final InterfaceC58261yxu RVsVBY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu UhxbNG(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final java.lang.String QIZEnU(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu iwGUEr(C14140dfo c14140dfo, final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtDeleteDemoWallet$default = C12827cuN.deleteDemoWallet$default(c14140dfo.djBIcL, false, 1, null);
        final Function1 function1 = new Function1() { // from class: o.dhs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.zLjUOn(str, (java.lang.Integer) obj);
            }
        };
        return abstractC58260yxtDeleteDemoWallet$default.copydefault(new InterfaceC58229yxO() { // from class: o.dhp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.QIZEnU(function1, obj);
            }
        });
    }

    public final AbstractC58260yxt<java.lang.String> AEQbTJ(final ChainAddress chainAddress, java.lang.String str, final java.lang.String str2) throws WalletImportError {
        AbstractC58260yxt<java.lang.String> abstractC58260yxtEZpvd = this.AhwBna.EZpvd(chainAddress, str, str2);
        final Function1 function1 = new Function1() { // from class: o.djz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.AEQbTJ(this.OLrzqt, str2, (java.lang.String) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtEZpvd.OLrzqt(new InterfaceC58229yxO() { // from class: o.dfu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.QkdxfA(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.dfw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.EZpvd(this.EZpvd, chainAddress, str2, (java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.dfs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.RKDWNf(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final InterfaceC58261yxu QkdxfA(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(C14140dfo c14140dfo, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return c14140dfo.djBIcL.KWHzl(str, WalletSyncOperation.UpgradeAddress);
    }

    public static final InterfaceC58261yxu RKDWNf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(C14140dfo c14140dfo, ChainAddress chainAddress, final java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtOLrzqt = c14140dfo.djBIcL.OLrzqt(chainAddress.getCoinId(), C56402yEa.EZpvd(chainAddress));
        final Function1 function1 = new Function1() { // from class: o.dic
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.fetchVPNInfo(str, (java.lang.Integer) obj);
            }
        };
        return abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.dij
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.QHmsKR(function1, obj);
            }
        });
    }

    public static final java.lang.String QHmsKR(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public final AbstractC58260yxt<java.lang.String> EZpvd(final long j, final java.util.List<ChainAddress> list, java.util.Map<java.lang.String, java.lang.String> map, final java.lang.String str) {
        AbstractC58260yxt<java.lang.String> abstractC58260yxtEZpvd = this.copydefault.EZpvd(j, list, map, str);
        final Function1 function1 = new Function1() { // from class: o.dhJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.copydefault(this.AEQbTJ, str, (java.lang.String) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtEZpvd.OLrzqt(new InterfaceC58229yxO() { // from class: o.dhV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.OBJEWx(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.dhY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.KWHzl(this.AEQbTJ, j, list, str, (java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.dia
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.gwTjWJ(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final InterfaceC58261yxu OBJEWx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(C14140dfo c14140dfo, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return c14140dfo.djBIcL.KWHzl(str, WalletSyncOperation.UpgradeAddress);
    }

    public static final InterfaceC58261yxu gwTjWJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(C14140dfo c14140dfo, long j, java.util.List list, final java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtOLrzqt = c14140dfo.djBIcL.OLrzqt(j, (java.util.List<ChainAddress>) list);
        final Function1 function1 = new Function1() { // from class: o.dfJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.fJNWhG(str, (java.lang.Integer) obj);
            }
        };
        return abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.dfH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.dHguZz(function1, obj);
            }
        });
    }

    public static final java.lang.String dHguZz(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static /* synthetic */ AbstractC58260yxt generateTrackingWallet$default(C14140dfo c14140dfo, long j, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return c14140dfo.OLrzqt(j, str, z);
    }

    /* JADX DEBUG: Type inference failed for r8v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.String> */
    public final AbstractC58260yxt<java.lang.String> OLrzqt(long j, java.lang.String str, boolean z) {
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAEQbTJ = this.AhwBna.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.updateBackInvokedCallbackStateactivity_release), C14079deg.getAddressStr$default(C14079deg.EZpvd, str, false, 2, null), j, str, z);
        final Function1 function1 = new Function1() { // from class: o.dhg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.getFieldNames(this.OLrzqt, (java.lang.String) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtAEQbTJ.OLrzqt(new InterfaceC58229yxO() { // from class: o.dhh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.TarCU(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final InterfaceC58261yxu TarCU(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final java.lang.String ULRxlR(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu getFieldNames(C14140dfo c14140dfo, final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtDeleteDemoWallet$default = C12827cuN.deleteDemoWallet$default(c14140dfo.djBIcL, false, 1, null);
        final Function1 function1 = new Function1() { // from class: o.dhD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.wlaJM(str, (java.lang.Integer) obj);
            }
        };
        return abstractC58260yxtDeleteDemoWallet$default.copydefault(new InterfaceC58229yxO() { // from class: o.dhE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.ULRxlR(function1, obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: o.dfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC58217yxC createWalletCommon$default(C14140dfo c14140dfo, Function0 function0, java.lang.String str, androidx.fragment.app.FragmentManager fragmentManager, InterfaceC14457dln interfaceC14457dln, Function1 function1, Function1 function12, yHO yho, java.lang.String str2, int i, boolean z, java.lang.String str3, C13786dYf c13786dYf, int i2, java.lang.Object obj) {
        return c14140dfo.AEQbTJ(function0, str, fragmentManager, interfaceC14457dln, (i2 & 16) != 0 ? null : function1, (i2 & 32) != 0 ? null : function12, (i2 & 64) != 0 ? null : yho, (i2 & 128) != 0 ? null : str2, (i2 & 256) != 0 ? 1 : i, (i2 & 512) != 0 ? true : z, (i2 & 1024) != 0 ? "wallet" : str3, (i2 & 2048) != 0 ? null : c13786dYf);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, o.dqT] */
    public final InterfaceC58217yxC AEQbTJ(Function0<? extends AbstractC58260yxt<java.lang.String>> function0, final java.lang.String str, androidx.fragment.app.FragmentManager fragmentManager, final InterfaceC14457dln interfaceC14457dln, final Function1<? super AbstractC12782ctV, Unit> function1, final Function1<? super AbstractC12782ctV, Unit> function12, final yHO<? super AbstractC12782ctV, ? super java.lang.Integer, ? super AbstractC14702dqT, Unit> yho, java.lang.String str2, final int i, final boolean z, final java.lang.String str3, final C13786dYf c13786dYf) {
        ?? KWHzl;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (fragmentManager != null) {
            if (c13786dYf != null) {
                KWHzl = C14704dqV.Companion.EZpvd();
            } else {
                KWHzl = C14703dqU.Companion.KWHzl();
            }
            objectRef.element = KWHzl;
            if (str2 != null) {
                KWHzl.OLrzqt(str2);
            }
            pUU.EZpvd("WalletCreateHelper", "show loading fragment, mode=" + i + ", loadingText=" + str2);
            AbstractC14702dqT abstractC14702dqT = (AbstractC14702dqT) objectRef.element;
            java.lang.String name = AbstractC14702dqT.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            abstractC14702dqT.OLrzqt(fragmentManager, name);
        }
        AbstractC58185ywX<java.lang.String> abstractC58185ywXEZpvd = function0.invoke().EZpvd();
        final Function1 function13 = new Function1() { // from class: o.dfT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.OLrzqt(z, this, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.dfZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.QCjLjM(function13, obj);
            }
        });
        final Function1 function14 = new Function1() { // from class: o.dga
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.AEQbTJ(z, this, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.dfW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.OxVOHk(function14, obj);
            }
        });
        final Function1 function15 = new Function1() { // from class: o.dfY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.OLrzqt(this.copydefault, i, str3, function1, objectRef, yho, interfaceC14457dln, str, function12, c13786dYf, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dge
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14140dfo.QSLkRj(function15, obj);
            }
        };
        final Function1 function16 = new Function1() { // from class: o.dgd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.KWHzl(yho, function12, objectRef, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dgc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14140dfo.OJuSTm(function16, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        return interfaceC58217yxCAEQbTJ;
    }

    public static final InterfaceC60096zvd QCjLjM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(boolean z, C14140dfo c14140dfo, final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.EZpvd("WalletCreateHelper", "walletId=" + str + ", generateWallet");
        if (z) {
            AbstractC58185ywX<java.lang.Integer> abstractC58185ywXAEQbTJ = c14140dfo.AEQbTJ(str);
            final Function1 function1 = new Function1() { // from class: o.dgD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14140dfo.fARcdN(str, (java.lang.Integer) obj);
                }
            };
            return abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.dgA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C14140dfo.hrNTAI(function1, obj);
                }
            });
        }
        return AbstractC58185ywX.KWHzl(str);
    }

    public static final java.lang.String hrNTAI(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OxVOHk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(boolean z, C14140dfo c14140dfo, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.EZpvd("WalletCreateHelper", "walletId=" + str + ", syncWallet");
        if (z) {
            return c14140dfo.KWHzl(str, true).EZpvd();
        }
        return c14140dfo.djBIcL.OLrzqt(str, false).EZpvd();
    }

    public static final void QSLkRj(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(final C14140dfo c14140dfo, final int i, java.lang.String str, Function1 function1, final Ref.ObjectRef objectRef, yHO yho, final InterfaceC14457dln interfaceC14457dln, final java.lang.String str2, final Function1 function12, final C13786dYf c13786dYf, final AbstractC12782ctV abstractC12782ctV) {
        WalletStatus walletStatus;
        pUU.EZpvd("WalletCreateHelper", "walletId=" + abstractC12782ctV.DbNXlk() + ", refreshAllWallet");
        C12827cuN c12827cuN = c14140dfo.djBIcL;
        if (abstractC12782ctV.zsXlph()) {
            walletStatus = WalletStatus.DemoWallet;
        } else {
            walletStatus = WalletStatus.RealWallets;
        }
        c12827cuN.EZpvd(walletStatus);
        C14669dpn c14669dpn = C14669dpn.OLrzqt;
        java.lang.String str3 = c14140dfo.copydefault(i) ? "create_wallet" : "import_wallet";
        Intrinsics.copydefault(abstractC12782ctV);
        c14669dpn.KWHzl(str3, abstractC12782ctV, str);
        c14140dfo.OLrzqt(abstractC12782ctV.QwvEab(), i);
        c14140dfo.copydefault(abstractC12782ctV, i);
        if (function1 != null) {
            function1.invoke(abstractC12782ctV);
        }
        if (objectRef.element == 0) {
            pUU.EZpvd("WalletCreateHelper", "walletId=" + abstractC12782ctV.DbNXlk() + ", loadingDFragment == null");
            if (yho != null) {
                yho.invoke(abstractC12782ctV, java.lang.Integer.valueOf(i), null);
                pUU.EZpvd("WalletCreateHelper", "walletId=" + abstractC12782ctV.DbNXlk() + ", newCallback without loadingDFragment");
            } else {
                if (interfaceC14457dln != null) {
                    if (str2 == null) {
                        return Unit.INSTANCE;
                    }
                    interfaceC14457dln.EZpvd(true, str2);
                }
                pUU.EZpvd("WalletCreateHelper", "walletId=" + abstractC12782ctV.DbNXlk() + ", strategy");
                if (function12 != null) {
                    function12.invoke(abstractC12782ctV);
                }
                c14140dfo.copydefault(abstractC12782ctV.QwvEab(), i);
            }
        } else {
            pUU.EZpvd("WalletCreateHelper", "walletId=" + abstractC12782ctV.DbNXlk() + ", loadingDFragment != null");
            if (yho != null) {
                pUU.EZpvd("WalletCreateHelper", "walletId=" + abstractC12782ctV.DbNXlk() + ", newCallback != null");
                yho.invoke(abstractC12782ctV, java.lang.Integer.valueOf(i), objectRef.element);
            } else {
                pUU.EZpvd("WalletCreateHelper", "walletId=" + abstractC12782ctV.DbNXlk() + ", newCallback == null");
                ((AbstractC14702dqT) objectRef.element).OLrzqt(new Function0() { // from class: o.dje
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C14140dfo.EZpvd(abstractC12782ctV, interfaceC14457dln, str2, function12, c13786dYf, objectRef, c14140dfo, i);
                    }
                });
            }
        }
        xXA.OLrzqt();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(AbstractC12782ctV abstractC12782ctV, InterfaceC14457dln interfaceC14457dln, java.lang.String str, Function1 function1, C13786dYf c13786dYf, Ref.ObjectRef objectRef, C14140dfo c14140dfo, int i) {
        pUU.EZpvd("WalletCreateHelper", "walletId=" + abstractC12782ctV.DbNXlk() + ", showSuccessAnim");
        if (interfaceC14457dln != null) {
            if (str == null) {
                return Unit.INSTANCE;
            }
            interfaceC14457dln.EZpvd(true, str);
        }
        if (function1 != null) {
            function1.invoke(abstractC12782ctV);
        }
        if (c13786dYf != null && !c13786dYf.EZpvd()) {
            pUU.EZpvd("WalletCreateHelper", "walletId=" + abstractC12782ctV.DbNXlk() + ", not dismissFragment");
        } else if (interfaceC14457dln == null || interfaceC14457dln.OLrzqt()) {
            ((AbstractC14702dqT) objectRef.element).KWHzl();
            pUU.EZpvd("WalletCreateHelper", "walletId=" + abstractC12782ctV.DbNXlk() + ", dismissFragment");
        }
        c14140dfo.copydefault(abstractC12782ctV.QwvEab(), i);
        return Unit.INSTANCE;
    }

    public static final void OJuSTm(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(yHO yho, Function1 function1, Ref.ObjectRef objectRef, java.lang.Throwable th) {
        pUU.AEQbTJ("WalletCreateHelper", "createWalletCommon error", th);
        if (yho != null) {
            yho.invoke(null, 0, null);
            pUU.EZpvd("WalletCreateHelper", "newCallback without loadingDFragment");
        } else {
            if (function1 != null) {
                function1.invoke(null);
            }
            pUU.EZpvd("WalletCreateHelper", com.sun.jna.Callback.METHOD_NAME);
        }
        AbstractC14702dqT abstractC14702dqT = (AbstractC14702dqT) objectRef.element;
        if (abstractC14702dqT != null) {
            abstractC14702dqT.KWHzl();
        }
        pUU.copydefault("WalletCreateUtils", "createWalletCommon error message :" + th.getMessage());
        xXA.OLrzqt();
        return Unit.INSTANCE;
    }

    public final void OLrzqt(WalletType walletType, int i) {
        if (copydefault(i)) {
            return;
        }
        if (walletType == WalletType.HDWallet || walletType == WalletType.KeyWallet || walletType == WalletType.TonWallet) {
            C14681dpz.OLrzqt.AEQbTJ();
        }
    }

    public final void EZpvd(final AbstractC14702dqT abstractC14702dqT, final InterfaceC14457dln interfaceC14457dln, final java.lang.String str, final AbstractC12782ctV abstractC12782ctV, final int i, final Function1<? super AbstractC12782ctV, Unit> function1) {
        if (abstractC14702dqT != null) {
            pUU.EZpvd("WalletCreateHelper", "walletId=" + (abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null) + ", loadingDFragment != null");
            abstractC14702dqT.OLrzqt(new Function0() { // from class: o.dgL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C14140dfo.copydefault(abstractC12782ctV, interfaceC14457dln, str, function1, abstractC14702dqT, this, i);
                }
            });
        } else {
            pUU.EZpvd("WalletCreateHelper", "walletId=" + (abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null) + ", loadingDFragment == null");
            if (abstractC12782ctV != null) {
                if (interfaceC14457dln != null) {
                    interfaceC14457dln.EZpvd(true, str);
                }
                pUU.EZpvd("WalletCreateHelper", "walletId=" + abstractC12782ctV.DbNXlk() + ", strategy");
            }
            function1.invoke(abstractC12782ctV);
            if (abstractC12782ctV != null) {
                copydefault(abstractC12782ctV.QwvEab(), i);
            }
        }
    }

    public static final Unit copydefault(AbstractC12782ctV abstractC12782ctV, InterfaceC14457dln interfaceC14457dln, java.lang.String str, Function1 function1, AbstractC14702dqT abstractC14702dqT, C14140dfo c14140dfo, int i) {
        pUU.EZpvd("WalletCreateHelper", "walletId=" + (abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null) + ", showSuccessAnim");
        if (interfaceC14457dln != null) {
            interfaceC14457dln.EZpvd(true, str);
        }
        function1.invoke(abstractC12782ctV);
        if (interfaceC14457dln == null || interfaceC14457dln.OLrzqt()) {
            abstractC14702dqT.KWHzl();
            pUU.EZpvd("WalletCreateHelper", "walletId=" + (abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null) + ", dismissFragment");
        }
        if (abstractC12782ctV != null) {
            c14140dfo.copydefault(abstractC12782ctV.QwvEab(), i);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.String createWalletName$default(C14140dfo c14140dfo, java.lang.String str, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setOnBackInvokedDispatcher);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return c14140dfo.copydefault(str, i, z);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            str = C33070mpX.AYXKKw(C13754dXa.FragmentManager.RgaQzq);
        }
        java.lang.String str2 = java.lang.String.format(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString() + " %02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }

    public final AbstractC58185ywX<java.lang.Integer> AEQbTJ(java.lang.String str) {
        AbstractC58185ywX<java.lang.Integer> abstractC58185ywXOLrzqt = this.gEmmrt.OLrzqt(true, false, "createWallet", new C13062cyk.LoaderManager.Application(C56402yEa.EZpvd(str)));
        final Function1 function1 = new Function1() { // from class: o.dgj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX<java.lang.Integer> abstractC58185ywXOLrzqt2 = abstractC58185ywXOLrzqt.OLrzqt(new InterfaceC58227yxM() { // from class: o.dgh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14140dfo.iPSTqm(function1, obj);
            }
        }).OLrzqt(AbstractC58185ywX.KWHzl(0));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXOLrzqt2, "");
        return abstractC58185ywXOLrzqt2;
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        pUU.AEQbTJ("WalletCreateHelper", "syncWallet", th);
        return Unit.INSTANCE;
    }

    public static final void iPSTqm(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final AbstractC12782ctV gSBher(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AbstractC12782ctV) function1.invoke(obj);
    }

    public final AbstractC58260yxt<AbstractC12782ctV> KWHzl(final java.lang.String str, boolean z) {
        AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = C12827cuN.fetchAllWallets$default(this.djBIcL, false, false, z, 3, null);
        final Function1 function1 = new Function1() { // from class: o.dgg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.copydefault(str, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = abstractC58260yxtFetchAllWallets$default.copydefault(new InterfaceC58229yxO() { // from class: o.dgi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.gSBher(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final AbstractC12782ctV copydefault(java.lang.String str, java.util.List list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((AbstractC12782ctV) next).DbNXlk(), (java.lang.Object) str)) {
                break;
            }
        }
        return (AbstractC12782ctV) next;
    }

    public final InterfaceC58217yxC AEQbTJ(@NotNull final ChainAddress chainAddress, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, final int i, final InterfaceC14457dln interfaceC14457dln, int i2, @NotNull final Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(chainAddress, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return importHardwareWallet$default(this, chainAddress, str, str2, str3, i, interfaceC14457dln, i2, new yHO() { // from class: o.dgT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C14140dfo.copydefault(this.OLrzqt, chainAddress, str, str2, str3, i, interfaceC14457dln, function1, (AbstractC12782ctV) obj, ((java.lang.Integer) obj2).intValue(), (AbstractC14702dqT) obj3);
            }
        }, null, 256, null);
    }

    public static final Unit copydefault(C14140dfo c14140dfo, ChainAddress chainAddress, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, InterfaceC14457dln interfaceC14457dln, Function1 function1, AbstractC12782ctV abstractC12782ctV, int i2, AbstractC14702dqT abstractC14702dqT) {
        if (abstractC12782ctV != null && abstractC12782ctV.dUDNAs()) {
            c14140dfo.OLrzqt(abstractC12782ctV, chainAddress, str, str2, str3, i, interfaceC14457dln, i2, (Function1<? super AbstractC12782ctV, Unit>) function1);
        } else {
            c14140dfo.EZpvd((AbstractC14702dqT) null, interfaceC14457dln, "", abstractC12782ctV, i2, (Function1<? super AbstractC12782ctV, Unit>) function1);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(final AbstractC12782ctV abstractC12782ctV, final ChainAddress chainAddress, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final int i, final InterfaceC14457dln interfaceC14457dln, final int i2, final Function1<? super AbstractC12782ctV, Unit> function1) {
        C10854bwM c10854bwMIsConnected = this.KWHzl.isConnected();
        final long jFetchVPNInfo = c10854bwMIsConnected != null ? c10854bwMIsConnected.fetchVPNInfo() : -1L;
        final java.lang.String strEZpvd = abstractC12782ctV.EZpvd(jFetchVPNInfo);
        AbstractC58260yxt<java.util.List<AbstractC12782ctV>> abstractC58260yxtKWHzl = this.djBIcL.KWHzl(strEZpvd, WalletType.HardwareWallet);
        final Function1 function12 = new Function1() { // from class: o.dgY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.EZpvd(this.AEQbTJ, strEZpvd, jFetchVPNInfo, (java.util.List) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58260yxtKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.dhb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.dmfpNf(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.dhd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.EZpvd(abstractC12782ctV, this, chainAddress, str, str2, str3, i, interfaceC14457dln, i2, function1, (AAActiveRes) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dha
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14140dfo.OHqIaq(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.dhc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.AEQbTJ(this.OLrzqt, interfaceC14457dln, abstractC12782ctV, i2, function1, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58227yxM<? super R>) interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dhe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14140dfo.OFhtUX(function14, obj);
            }
        });
    }

    public static final InterfaceC60096zvd dmfpNf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(C14140dfo c14140dfo, java.lang.String str, long j, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.isEmpty()) {
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new AAActiveRes((java.lang.String) null, (java.lang.Long) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        return c14140dfo.gEmmrt.AEQbTJ(str, j);
    }

    public static final void OHqIaq(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(final AbstractC12782ctV abstractC12782ctV, final C14140dfo c14140dfo, ChainAddress chainAddress, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, final InterfaceC14457dln interfaceC14457dln, final int i2, final Function1 function1, AAActiveRes aAActiveRes) {
        java.lang.String proxyAddress;
        java.lang.Boolean boolIsActive = aAActiveRes.isActive();
        if (Intrinsics.EZpvd(boolIsActive, java.lang.Boolean.TRUE)) {
            java.lang.String strAkhnZx = abstractC12782ctV.AkhnZx();
            java.lang.String eoaAddress = aAActiveRes.getEoaAddress();
            if (eoaAddress == null) {
                return Unit.INSTANCE;
            }
            WalletType walletType = WalletType.HardwareWallet;
            java.lang.String aaAddress = aAActiveRes.getAaAddress();
            if (aaAddress != null && (proxyAddress = aAActiveRes.getProxyAddress()) != null) {
                c14140dfo.EZpvd(null, chainAddress, strAkhnZx, str, str2, str3, i, interfaceC14457dln, i2, aaAddress, proxyAddress, eoaAddress, walletType, new Function1() { // from class: o.djq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C14140dfo.AEQbTJ(this.EZpvd, abstractC12782ctV, interfaceC14457dln, i2, function1, (AbstractC12782ctV) obj);
                    }
                });
            }
            return Unit.INSTANCE;
        }
        if (Intrinsics.EZpvd(boolIsActive, java.lang.Boolean.FALSE)) {
            c14140dfo.EZpvd((AbstractC14702dqT) null, interfaceC14457dln, "", abstractC12782ctV, i2, (Function1<? super AbstractC12782ctV, Unit>) function1);
        } else {
            c14140dfo.EZpvd((AbstractC14702dqT) null, interfaceC14457dln, "", abstractC12782ctV, i2, (Function1<? super AbstractC12782ctV, Unit>) function1);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(final C14140dfo c14140dfo, AbstractC12782ctV abstractC12782ctV, final InterfaceC14457dln interfaceC14457dln, final int i, final Function1 function1, final AbstractC12782ctV abstractC12782ctV2) {
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = c14140dfo.djBIcL.copydefault(abstractC12782ctV.DbNXlk());
        final Function1 function12 = new Function1() { // from class: o.dfp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.OLrzqt(this.KWHzl, interfaceC14457dln, abstractC12782ctV2, i, function1, (java.lang.Integer) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dfq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14140dfo.hBpjJd(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.dhw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.OLrzqt(this.KWHzl, interfaceC14457dln, abstractC12782ctV2, i, function1, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dig
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14140dfo.RdAHlO(function13, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void hBpjJd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C14140dfo c14140dfo, InterfaceC14457dln interfaceC14457dln, AbstractC12782ctV abstractC12782ctV, int i, Function1 function1, java.lang.Integer num) {
        c14140dfo.EZpvd((AbstractC14702dqT) null, interfaceC14457dln, "", abstractC12782ctV, i, (Function1<? super AbstractC12782ctV, Unit>) function1);
        return Unit.INSTANCE;
    }

    public static final void RdAHlO(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C14140dfo c14140dfo, InterfaceC14457dln interfaceC14457dln, AbstractC12782ctV abstractC12782ctV, int i, Function1 function1, java.lang.Throwable th) {
        c14140dfo.EZpvd((AbstractC14702dqT) null, interfaceC14457dln, "", abstractC12782ctV, i, (Function1<? super AbstractC12782ctV, Unit>) function1);
        return Unit.INSTANCE;
    }

    public static final void OFhtUX(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C14140dfo c14140dfo, InterfaceC14457dln interfaceC14457dln, AbstractC12782ctV abstractC12782ctV, int i, Function1 function1, java.lang.Throwable th) {
        c14140dfo.EZpvd((AbstractC14702dqT) null, interfaceC14457dln, "", abstractC12782ctV, i, (Function1<? super AbstractC12782ctV, Unit>) function1);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: o.dfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC58217yxC importHardwareWallet$default(C14140dfo c14140dfo, ChainAddress chainAddress, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, InterfaceC14457dln interfaceC14457dln, int i2, yHO yho, Function1 function1, int i3, java.lang.Object obj) {
        return c14140dfo.OLrzqt(chainAddress, str, str2, str3, i, interfaceC14457dln, i2, (yHO<? super AbstractC12782ctV, ? super java.lang.Integer, ? super AbstractC14702dqT, Unit>) ((i3 & 128) != 0 ? null : yho), (Function1<? super AbstractC12782ctV, Unit>) ((i3 & 256) != 0 ? null : function1));
    }

    public final InterfaceC58217yxC OLrzqt(final ChainAddress chainAddress, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final int i, InterfaceC14457dln interfaceC14457dln, int i2, yHO<? super AbstractC12782ctV, ? super java.lang.Integer, ? super AbstractC14702dqT, Unit> yho, Function1<? super AbstractC12782ctV, Unit> function1) {
        return createWalletCommon$default(this, new Function0() { // from class: o.dgM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14140dfo.OLrzqt(this.OLrzqt, chainAddress, str, str2, str3, i);
            }
        }, "", null, interfaceC14457dln, null, function1, yho, null, i2, false, null, null, 3728, null);
    }

    public static final AbstractC58260yxt OLrzqt(C14140dfo c14140dfo, ChainAddress chainAddress, java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        return c14140dfo.KWHzl(chainAddress, str, str2, str3, i);
    }

    public static final AbstractC58260yxt AEQbTJ(C14140dfo c14140dfo, java.lang.String str, ChainAddress chainAddress, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.String str5, java.lang.String str6, java.lang.String str7, WalletType walletType) {
        return c14140dfo.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.RgaQzq) + " " + str, chainAddress, str2, str3, str4, i, str5, str6, str7, walletType);
    }

    public final InterfaceC58217yxC EZpvd(androidx.fragment.app.FragmentManager fragmentManager, @NotNull final ChainAddress chainAddress, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, final int i, InterfaceC14457dln interfaceC14457dln, int i2, @NotNull final java.lang.String str5, @NotNull final java.lang.String str6, @NotNull final java.lang.String str7, @NotNull final WalletType walletType, @NotNull Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(chainAddress, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(walletType, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return createWalletCommon$default(this, new Function0() { // from class: o.dgu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14140dfo.AEQbTJ(this.AEQbTJ, str, chainAddress, str2, str3, str4, i, str5, str6, str7, walletType);
            }
        }, "", fragmentManager, interfaceC14457dln, null, function1, null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.addCancellable), i2, false, null, null, 3664, null);
    }

    public final InterfaceC58217yxC OLrzqt(@NotNull final ChainAddress chainAddress, @NotNull java.lang.String str, @NotNull java.lang.String str2, final InterfaceC14457dln interfaceC14457dln, int i, @NotNull final Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(chainAddress, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return addChainToHardwareWallet$default(this, chainAddress, str, str2, interfaceC14457dln, i, new yHO() { // from class: o.dir
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C14140dfo.AEQbTJ(this.AEQbTJ, chainAddress, interfaceC14457dln, function1, (AbstractC12782ctV) obj, ((java.lang.Integer) obj2).intValue(), (AbstractC14702dqT) obj3);
            }
        }, null, 64, null);
    }

    public static final Unit AEQbTJ(C14140dfo c14140dfo, ChainAddress chainAddress, InterfaceC14457dln interfaceC14457dln, Function1 function1, AbstractC12782ctV abstractC12782ctV, int i, AbstractC14702dqT abstractC14702dqT) {
        C13854daT c13854daTFetchVPNInfo;
        if (abstractC12782ctV != null && abstractC12782ctV.dUDNAs()) {
            AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
            if (abstractC12784ctXGwTjWJ == null || (c13854daTFetchVPNInfo = abstractC12784ctXGwTjWJ.fetchVPNInfo()) == null) {
                return Unit.INSTANCE;
            }
            c14140dfo.OLrzqt(abstractC12782ctV, chainAddress, c13854daTFetchVPNInfo.AYXKKw(), c13854daTFetchVPNInfo.AEQbTJ(), c13854daTFetchVPNInfo.OLrzqt(), c13854daTFetchVPNInfo.KWHzl().ordinal(), interfaceC14457dln, i, (Function1<? super AbstractC12782ctV, Unit>) function1);
        } else {
            c14140dfo.EZpvd((AbstractC14702dqT) null, interfaceC14457dln, "", abstractC12782ctV, i, (Function1<? super AbstractC12782ctV, Unit>) function1);
        }
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC EZpvd(final long j, @NotNull final java.util.List<ChainAddress> list, @NotNull final java.util.Map<java.lang.String, java.lang.String> map, @NotNull final java.lang.String str, InterfaceC14457dln interfaceC14457dln, int i, yHO<? super AbstractC12782ctV, ? super java.lang.Integer, ? super AbstractC14702dqT, Unit> yho, @NotNull Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return createWalletCommon$default(this, new Function0() { // from class: o.dgF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14140dfo.OLrzqt(this.EZpvd, j, list, map, str);
            }
        }, "", null, interfaceC14457dln, null, function1, yho, null, i, false, null, null, 3728, null);
    }

    public static final AbstractC58260yxt OLrzqt(C14140dfo c14140dfo, long j, java.util.List list, java.util.Map map, java.lang.String str) {
        return c14140dfo.EZpvd(j, (java.util.List<ChainAddress>) list, (java.util.Map<java.lang.String, java.lang.String>) map, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: o.dfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC58217yxC addChainToHardwareWallet$default(C14140dfo c14140dfo, ChainAddress chainAddress, java.lang.String str, java.lang.String str2, InterfaceC14457dln interfaceC14457dln, int i, yHO yho, Function1 function1, int i2, java.lang.Object obj) {
        return c14140dfo.AEQbTJ(chainAddress, str, str2, interfaceC14457dln, i, (yHO<? super AbstractC12782ctV, ? super java.lang.Integer, ? super AbstractC14702dqT, Unit>) ((i2 & 32) != 0 ? null : yho), (Function1<? super AbstractC12782ctV, Unit>) ((i2 & 64) != 0 ? null : function1));
    }

    public final InterfaceC58217yxC AEQbTJ(final ChainAddress chainAddress, final java.lang.String str, final java.lang.String str2, InterfaceC14457dln interfaceC14457dln, int i, yHO<? super AbstractC12782ctV, ? super java.lang.Integer, ? super AbstractC14702dqT, Unit> yho, Function1<? super AbstractC12782ctV, Unit> function1) {
        return createWalletCommon$default(this, new Function0() { // from class: o.dhm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14140dfo.KWHzl(this.OLrzqt, chainAddress, str, str2);
            }
        }, "", null, interfaceC14457dln, null, function1, yho, null, i, false, null, null, 3728, null);
    }

    public static final AbstractC58260yxt KWHzl(C14140dfo c14140dfo, ChainAddress chainAddress, java.lang.String str, java.lang.String str2) {
        return c14140dfo.AEQbTJ(chainAddress, str, str2);
    }

    public final AbstractC58260yxt<java.lang.String> KWHzl(final KeystoneMultiAccount keystoneMultiAccount, final int i, final java.util.List<KeystoneAddressInfo> list) {
        AbstractC58260yxt<java.util.List<AbstractC12784ctX>> abstractC58260yxtWlaJM = this.djBIcL.wlaJM(yDY.gEmmrt(WalletType.HDWallet, WalletType.HardwareWallet, WalletType.TonWallet));
        final Function1 function1 = new Function1() { // from class: o.dix
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.copydefault(this.copydefault, keystoneMultiAccount, i, list, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtWlaJM.OLrzqt(new InterfaceC58229yxO() { // from class: o.diC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.spnCvw(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.diD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.fIwbmz(this.EZpvd, (java.lang.String) obj);
            }
        };
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.diB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.WS(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final InterfaceC58261yxu spnCvw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(C14140dfo c14140dfo, KeystoneMultiAccount keystoneMultiAccount, int i, java.util.List list, java.util.List list2) {
        java.lang.Object next;
        java.lang.Object next2;
        java.lang.String strCopydefault;
        Intrinsics.checkNotNullParameter(list2, "");
        java.util.Iterator it = list2.iterator();
        while (true) {
            next = null;
            if (!it.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it.next();
            AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) next2;
            if (abstractC12784ctX.getFieldNames()) {
                C13854daT c13854daTFetchVPNInfo = abstractC12784ctX.fetchVPNInfo();
                if (Intrinsics.EZpvd((java.lang.Object) (c13854daTFetchVPNInfo != null ? c13854daTFetchVPNInfo.AYXKKw() : null), (java.lang.Object) keystoneMultiAccount.getDeviceId())) {
                    C13854daT c13854daTFetchVPNInfo2 = abstractC12784ctX.fetchVPNInfo();
                    if (Intrinsics.EZpvd((java.lang.Object) (c13854daTFetchVPNInfo2 != null ? c13854daTFetchVPNInfo2.copydefault() : null), (java.lang.Object) keystoneMultiAccount.getMasterFingerprint())) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        AbstractC12784ctX abstractC12784ctX2 = (AbstractC12784ctX) next2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list2) {
            if (((AbstractC12784ctX) obj).getFieldNames()) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int iAhwBna = ((AbstractC12784ctX) next).AhwBna();
                do {
                    java.lang.Object next3 = it2.next();
                    int iAhwBna2 = ((AbstractC12784ctX) next3).AhwBna();
                    if (iAhwBna < iAhwBna2) {
                        next = next3;
                        iAhwBna = iAhwBna2;
                    }
                } while (it2.hasNext());
            }
        }
        AbstractC12784ctX abstractC12784ctX3 = (AbstractC12784ctX) next;
        int iAhwBna3 = abstractC12784ctX3 != null ? abstractC12784ctX3.AhwBna() : -1;
        if (iAhwBna3 == -1) {
            iAhwBna3 = arrayList.size();
        }
        C13071cyt c13071cyt = c14140dfo.copydefault;
        if (abstractC12784ctX2 == null || (strCopydefault = abstractC12784ctX2.AuCTel()) == null) {
            java.lang.String device = keystoneMultiAccount.getDevice();
            if (device == null) {
                device = "";
            }
            strCopydefault = c14140dfo.copydefault(device, iAhwBna3 + 1);
        }
        java.lang.String str = strCopydefault;
        int iAhwBna4 = abstractC12784ctX2 != null ? abstractC12784ctX2.AhwBna() : iAhwBna3 + 1;
        java.lang.String strCreateWalletName$default = createWalletName$default(c14140dfo, null, i + 1, false, 5, null);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            KeystoneAddressInfo keystoneAddressInfo = (KeystoneAddressInfo) it3.next();
            C10948byA c10948byA = c14140dfo.KWHzl;
            java.lang.Long chainId = keystoneAddressInfo.getChainId();
            C10854bwM c10854bwMOLrzqt = c10948byA.copydefault(chainId != null ? chainId.longValue() : 0L);
            long jAhwBna = c10854bwMOLrzqt != null ? c10854bwMOLrzqt.AhwBna() : 0L;
            java.lang.String address = keystoneAddressInfo.getAddress();
            java.lang.String str2 = address == null ? "" : address;
            java.lang.Integer addressType = keystoneAddressInfo.getAddressType();
            int iIntValue = addressType != null ? addressType.intValue() : AddressType.Legacy.ordinal();
            java.lang.String publicKey = keystoneAddressInfo.getPublicKey();
            java.lang.String str3 = publicKey == null ? "" : publicKey;
            java.lang.String path = keystoneAddressInfo.getPath();
            arrayList2.add(new ChainAddress(jAhwBna, str2, iIntValue, null, null, false, str3, path == null ? "" : path, 24, null));
        }
        java.lang.String deviceId = keystoneMultiAccount.getDeviceId();
        java.lang.String str4 = deviceId == null ? "" : deviceId;
        java.lang.String masterFingerprint = keystoneMultiAccount.getMasterFingerprint();
        java.lang.String str5 = masterFingerprint == null ? "" : masterFingerprint;
        java.lang.String device2 = keystoneMultiAccount.getDevice();
        C13854daT c13854daT = new C13854daT(str4, str5, device2 == null ? "" : device2, "Keystone", HardwareType.Keystone, "", java.lang.System.currentTimeMillis(), "");
        c13854daT.EZpvd(keystoneMultiAccount);
        Unit unit = Unit.INSTANCE;
        return c13071cyt.AEQbTJ(str, iAhwBna4, strCreateWalletName$default, i, arrayList2, c13854daT);
    }

    public static final InterfaceC58261yxu WS(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu fIwbmz(C14140dfo c14140dfo, final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtDeleteDemoWallet$default = C12827cuN.deleteDemoWallet$default(c14140dfo.djBIcL, false, 1, null);
        final Function1 function1 = new Function1() { // from class: o.dim
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.iwGUEr(str, (java.lang.Integer) obj);
            }
        };
        return abstractC58260yxtDeleteDemoWallet$default.copydefault(new InterfaceC58229yxO() { // from class: o.diq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.zblBkD(function1, obj);
            }
        });
    }

    public static final java.lang.String zblBkD(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public final AbstractC58260yxt<java.lang.String> AEQbTJ(final java.util.List<ChainAddress> list, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final java.util.List<OneKeyAccountInfo> list2, final int i) {
        AbstractC58260yxt<java.util.List<AbstractC12784ctX>> abstractC58260yxtWlaJM = this.djBIcL.wlaJM(yDY.gEmmrt(WalletType.HDWallet, WalletType.HardwareWallet, WalletType.TonWallet));
        final Function1 function1 = new Function1() { // from class: o.dgs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.AEQbTJ(this.copydefault, str3, i, list, str, str4, str2, list2, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtWlaJM.OLrzqt(new InterfaceC58229yxO() { // from class: o.dgt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.hCLrkq(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.dgz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.fARcdN(this.OLrzqt, (java.lang.String) obj);
            }
        };
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.dgx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.heceqZ(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final InterfaceC58261yxu hCLrkq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(C14140dfo c14140dfo, java.lang.String str, int i, java.util.List list, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list2, java.util.List list3) {
        java.util.List<OneKeyAccountInfo> listAhwBna;
        java.lang.Object next;
        java.lang.Object next2;
        C13854daT c13854daTFetchVPNInfo;
        java.util.List<OneKeyAccountInfo> listDjBIcL;
        C13854daT c13854daTFetchVPNInfo2;
        java.lang.String str5;
        java.lang.String strOLrzqt;
        java.lang.String str6;
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(list3, "");
        java.util.Iterator it = list3.iterator();
        while (true) {
            listAhwBna = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) next;
            if (abstractC12784ctX.zsXlph()) {
                C13854daT c13854daTFetchVPNInfo3 = abstractC12784ctX.fetchVPNInfo();
                if (c13854daTFetchVPNInfo3 != null) {
                    strAYXKKw = c13854daTFetchVPNInfo3.AYXKKw();
                    str6 = str2;
                } else {
                    str6 = str2;
                    strAYXKKw = null;
                }
                if (Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) str6)) {
                    C13854daT c13854daTFetchVPNInfo4 = abstractC12784ctX.fetchVPNInfo();
                    if (Intrinsics.EZpvd((java.lang.Object) (c13854daTFetchVPNInfo4 != null ? c13854daTFetchVPNInfo4.valueOf() : null), (java.lang.Object) str4)) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        AbstractC12784ctX abstractC12784ctX2 = (AbstractC12784ctX) next;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list3) {
            AbstractC12784ctX abstractC12784ctX3 = (AbstractC12784ctX) obj;
            if (abstractC12784ctX3.zsXlph()) {
                C13854daT c13854daTFetchVPNInfo5 = abstractC12784ctX3.fetchVPNInfo();
                if (c13854daTFetchVPNInfo5 != null) {
                    strOLrzqt = c13854daTFetchVPNInfo5.OLrzqt();
                    str5 = str3;
                } else {
                    str5 = str3;
                    strOLrzqt = null;
                }
                if (Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) str5)) {
                    arrayList.add(obj);
                }
            }
        }
        java.util.Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                int iAhwBna = ((AbstractC12784ctX) next2).AhwBna();
                do {
                    java.lang.Object next3 = it2.next();
                    int iAhwBna2 = ((AbstractC12784ctX) next3).AhwBna();
                    if (iAhwBna < iAhwBna2) {
                        next2 = next3;
                        iAhwBna = iAhwBna2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next2 = null;
        }
        AbstractC12784ctX abstractC12784ctX4 = (AbstractC12784ctX) next2;
        int iAhwBna3 = abstractC12784ctX4 != null ? abstractC12784ctX4.AhwBna() : -1;
        if (iAhwBna3 == -1) {
            iAhwBna3 = arrayList.size();
        }
        C13071cyt c13071cyt = c14140dfo.copydefault;
        int i2 = iAhwBna3 + 1;
        java.lang.String strCopydefault = c14140dfo.copydefault(str, i2);
        int iAhwBna4 = abstractC12784ctX2 != null ? abstractC12784ctX2.AhwBna() : i2;
        java.lang.String strCreateWalletName$default = createWalletName$default(c14140dfo, null, i + 1, false, 5, null);
        C13854daT c13854daT = new C13854daT(str2, null, str, str3, HardwareType.OneKey, null, java.lang.System.currentTimeMillis(), null, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, null);
        if (abstractC12784ctX2 != null && (c13854daTFetchVPNInfo2 = abstractC12784ctX2.fetchVPNInfo()) != null) {
            listAhwBna = c13854daTFetchVPNInfo2.djBIcL();
        }
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        java.util.Iterator<T> it3 = listAhwBna.iterator();
        while (it3.hasNext()) {
            arrayList2.add(java.lang.Integer.valueOf(((OneKeyAccountInfo) it3.next()).getAddressIndex()));
        }
        java.util.Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
        java.util.Iterator it4 = list2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(java.lang.Integer.valueOf(((OneKeyAccountInfo) it4.next()).getAddressIndex()));
        }
        if (!setOqFWZa.containsAll(CollectionsKt___CollectionsKt.OqFWZa(arrayList3))) {
            c13854daT.KWHzl(new OneKeyHardwareData(str4, list2));
        } else if (abstractC12784ctX2 != null && (c13854daTFetchVPNInfo = abstractC12784ctX2.fetchVPNInfo()) != null && (listDjBIcL = c13854daTFetchVPNInfo.djBIcL()) != null) {
            c13854daT.KWHzl(new OneKeyHardwareData(str4, listDjBIcL));
        }
        Unit unit = Unit.INSTANCE;
        return c13071cyt.OLrzqt(strCopydefault, iAhwBna4, strCreateWalletName$default, i, (java.util.List<ChainAddress>) list, c13854daT);
    }

    public static final InterfaceC58261yxu heceqZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final java.lang.String DBxZfM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu fARcdN(C14140dfo c14140dfo, final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtDeleteDemoWallet$default = C12827cuN.deleteDemoWallet$default(c14140dfo.djBIcL, false, 1, null);
        final Function1 function1 = new Function1() { // from class: o.dgG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.uzCIH(str, (java.lang.Integer) obj);
            }
        };
        return abstractC58260yxtDeleteDemoWallet$default.copydefault(new InterfaceC58229yxO() { // from class: o.dgH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.DBxZfM(function1, obj);
            }
        });
    }

    public final AbstractC58260yxt<java.lang.String> copydefault(final java.util.List<ChainAddress> list, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, final C13854daT c13854daT, int i) {
        pUU.OLrzqt(">>>ledger generateLedgerWallet deviceId:" + str2 + " - addressIndex:" + i + " - hardwareInfo:" + c13854daT);
        AbstractC58260yxt<java.util.List<AbstractC12784ctX>> abstractC58260yxtWlaJM = this.djBIcL.wlaJM(yDY.gEmmrt(WalletType.HDWallet, WalletType.HardwareWallet, WalletType.TonWallet));
        AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = C12827cuN.fetchAllWallets$default(this.djBIcL, false, false, false, 7, null);
        final Function1 function1 = new Function1() { // from class: o.diJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.OLrzqt(c13854daT, this, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtFetchAllWallets$default.copydefault(new InterfaceC58229yxO() { // from class: o.diI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.DCUTEIddSDPG(function1, obj);
            }
        });
        final Function2 function2 = new Function2() { // from class: o.diM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C14140dfo.AEQbTJ((java.util.List) obj, (java.util.List) obj2);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(abstractC58260yxtWlaJM, abstractC58260yxtCopydefault, new InterfaceC58223yxI() { // from class: o.diO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C14140dfo.DbNXlk(function2, obj, obj2);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.diL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.AEQbTJ(this.KWHzl, c13854daT, list, (kotlin.Pair) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.diP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.DGOPHZ(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.diQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.fJNWhG(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.OLrzqt(new InterfaceC58229yxO() { // from class: o.diT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.call(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt3, "");
        return abstractC58260yxtOLrzqt3;
    }

    public static final java.util.List DCUTEIddSDPG(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final kotlin.Pair DbNXlk(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair AEQbTJ(java.util.List list, java.util.List list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return C56390yDp.OLrzqt(list, list2);
    }

    public static final InterfaceC58261yxu DGOPHZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(C14140dfo c14140dfo, C13854daT c13854daT, java.util.List list, kotlin.Pair pair) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(pair, "");
        java.lang.Object first = pair.getFirst();
        Intrinsics.checkNotNullExpressionValue(first, "");
        java.lang.Object second = pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "");
        java.util.List list2 = (java.util.List) second;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : (java.util.List) first) {
            if (c14140dfo.KWHzl((AbstractC12784ctX) obj, c13854daT.KWHzl())) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        java.lang.Integer num = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(((AbstractC12784ctX) next).AhwBna());
                do {
                    java.lang.Object next2 = it.next();
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(((AbstractC12784ctX) next2).AhwBna());
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        next = next2;
                        numValueOf = numValueOf2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) next;
        int iAhwBna = abstractC12784ctX != null ? abstractC12784ctX.AhwBna() : -1;
        if (iAhwBna == -1) {
            iAhwBna = arrayList.size();
        }
        java.util.Iterator it2 = list2.iterator();
        if (it2.hasNext()) {
            java.lang.Integer numValueOf3 = java.lang.Integer.valueOf(((AbstractC12782ctV) it2.next()).finit());
            loop1: while (true) {
                num = numValueOf3;
                while (it2.hasNext()) {
                    numValueOf3 = java.lang.Integer.valueOf(((AbstractC12782ctV) it2.next()).finit());
                    if (num.compareTo(numValueOf3) < 0) {
                        break;
                    }
                }
            }
        }
        int iIntValue = (num != null ? num.intValue() : -1) + 2;
        pUU.OLrzqt(">>>ledger generateLedgerWallet rootWalletMaxCreateIndex :" + iAhwBna + " - addressIndex1:" + iIntValue + " ");
        int i = iAhwBna + 1;
        return c14140dfo.copydefault.KWHzl(c14140dfo.copydefault(c14140dfo.OLrzqt(c13854daT.KWHzl()), i), i, createWalletName$default(c14140dfo, null, iIntValue, false, 5, null), iIntValue, (java.util.List<ChainAddress>) list, c13854daT);
    }

    public static final InterfaceC58261yxu call(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu fJNWhG(C14140dfo c14140dfo, final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.OLrzqt(">>>ledger generateLedgerWallet created wallet:" + str);
        AbstractC58260yxt abstractC58260yxtDeleteDemoWallet$default = C12827cuN.deleteDemoWallet$default(c14140dfo.djBIcL, false, 1, null);
        final Function1 function1 = new Function1() { // from class: o.dhj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.getNewProxyInstance(str, (java.lang.Integer) obj);
            }
        };
        return abstractC58260yxtDeleteDemoWallet$default.copydefault(new InterfaceC58229yxO() { // from class: o.dhl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14140dfo.run(function1, obj);
            }
        });
    }

    public static final java.lang.String run(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static /* synthetic */ void showConnectWalletDialog$default(C14140dfo c14140dfo, androidx.fragment.app.FragmentManager fragmentManager, InterfaceC54859xXz interfaceC54859xXz, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 2;
        }
        c14140dfo.EZpvd(fragmentManager, interfaceC54859xXz, i);
    }

    public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull InterfaceC54859xXz interfaceC54859xXz, int i) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(interfaceC54859xXz, "");
        showConnectWalletDialog$default(this, fragmentManager, interfaceC54859xXz, i, null, yDY.AhwBna(), null, null, null, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, null);
    }

    public static /* synthetic */ void showConnectWalletDialog$default(C14140dfo c14140dfo, androidx.fragment.app.FragmentManager fragmentManager, boolean z, InterfaceC54859xXz interfaceC54859xXz, int i, InterfaceC54856xXw interfaceC54856xXw, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            i = 2;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            interfaceC54856xXw = null;
        }
        c14140dfo.OLrzqt(fragmentManager, z2, interfaceC54859xXz, i3, interfaceC54856xXw);
    }

    public final void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, boolean z, @NotNull InterfaceC54859xXz interfaceC54859xXz, int i, InterfaceC54856xXw interfaceC54856xXw) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(interfaceC54859xXz, "");
        if (fragmentManager.isDestroyed()) {
            return;
        }
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        if (!z) {
            listOLrzqt.add(UnsupportedWalletType.MPCWallet);
        }
        showConnectWalletDialog$default(this, fragmentManager, interfaceC54859xXz, i, null, C56402yEa.fARcdN(listOLrzqt), null, interfaceC54856xXw, null, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: o.dfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showConnectWalletDialog$default(C14140dfo c14140dfo, androidx.fragment.app.FragmentManager fragmentManager, InterfaceC54859xXz interfaceC54859xXz, int i, java.util.List list, java.util.List list2, java.lang.String str, InterfaceC54856xXw interfaceC54856xXw, InterfaceC54852xXs interfaceC54852xXs, int i2, java.lang.Object obj) {
        c14140dfo.KWHzl(fragmentManager, interfaceC54859xXz, (i2 & 4) != 0 ? 2 : i, (java.util.List<SupportedNetworkType>) ((i2 & 8) != 0 ? null : list), (java.util.List<? extends UnsupportedWalletType>) ((i2 & 16) != 0 ? yDY.AhwBna() : list2), (i2 & 32) != 0 ? "" : str, (i2 & 64) != 0 ? null : interfaceC54856xXw, (i2 & 128) != 0 ? null : interfaceC54852xXs);
    }

    public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull InterfaceC54859xXz interfaceC54859xXz, int i, java.util.List<SupportedNetworkType> list, @NotNull java.util.List<? extends UnsupportedWalletType> list2, @NotNull java.lang.String str, InterfaceC54856xXw interfaceC54856xXw, InterfaceC54852xXs interfaceC54852xXs) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(interfaceC54859xXz, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (fragmentManager.isDestroyed()) {
            return;
        }
        DefiConnectWalletTipDialogFragment defiConnectWalletTipDialogFragmentOLrzqt = DefiConnectWalletTipDialogFragment.Companion.OLrzqt(i, list, list2, str);
        defiConnectWalletTipDialogFragmentOLrzqt.AEQbTJ(interfaceC54859xXz);
        if (interfaceC54856xXw != null) {
            defiConnectWalletTipDialogFragmentOLrzqt.KWHzl(interfaceC54856xXw);
        }
        if (interfaceC54852xXs != null) {
            defiConnectWalletTipDialogFragmentOLrzqt.KWHzl(interfaceC54852xXs);
        }
        fragmentManager.beginTransaction().add(defiConnectWalletTipDialogFragmentOLrzqt, DefiConnectWalletTipDialogFragment.class.getSimpleName()).commitAllowingStateLoss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: androidx.lifecycle.LifecycleOwner */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(@NotNull final androidx.fragment.app.FragmentManager fragmentManager, @NotNull final LifecycleOwner lifecycleOwner, final InterfaceC54859xXz interfaceC54859xXz, final int i, final java.util.List<SupportedNetworkType> list, @NotNull final java.util.List<? extends UnsupportedWalletType> list2, final InterfaceC54856xXw interfaceC54856xXw) {
        android.content.Context contextRequireContext;
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(list2, "");
        if (fragmentManager.isDestroyed()) {
            return;
        }
        try {
            if (lifecycleOwner instanceof android.app.Activity) {
                contextRequireContext = (android.content.Context) lifecycleOwner;
            } else {
                contextRequireContext = lifecycleOwner instanceof androidx.fragment.app.Fragment ? ((androidx.fragment.app.Fragment) lifecycleOwner).requireContext() : C9678baC.Companion.AEQbTJ();
            }
            android.content.Context context = contextRequireContext;
            Intrinsics.copydefault(context);
            C10604brb.Companion.AEQbTJ(context).KWHzl(context, lifecycleOwner, new Function0() { // from class: o.dht
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C14140dfo.AEQbTJ(this.copydefault, lifecycleOwner, i, list, list2, interfaceC54856xXw, fragmentManager, interfaceC54859xXz);
                }
            });
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("WalletCreateHelper", "showImportWalletDialog: Exception", e);
        }
    }

    public static final Unit AEQbTJ(C14140dfo c14140dfo, final LifecycleOwner lifecycleOwner, final int i, final java.util.List list, final java.util.List list2, final InterfaceC54856xXw interfaceC54856xXw, final androidx.fragment.app.FragmentManager fragmentManager, final InterfaceC54859xXz interfaceC54859xXz) {
        c14140dfo.OLrzqt(lifecycleOwner, new Function0() { // from class: o.diE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14140dfo.OLrzqt(i, list, list2, interfaceC54856xXw, fragmentManager, interfaceC54859xXz, lifecycleOwner);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.don.Activity.newInstance$default(o.don$Activity, int, boolean, java.util.List, java.util.List, boolean, o.dln, java.util.ArrayList, kotlin.jvm.functions.Function0, int, java.lang.Object):o.don */
    public static final Unit OLrzqt(int i, java.util.List list, java.util.List list2, InterfaceC54856xXw interfaceC54856xXw, androidx.fragment.app.FragmentManager fragmentManager, final InterfaceC54859xXz interfaceC54859xXz, LifecycleOwner lifecycleOwner) {
        C14616don c14616donKWHzl = C14616don.Companion.KWHzl((226 & 1) != 0 ? 1 : i, (226 & 2) != 0 ? false : false, (226 & 4) != 0 ? null : list, (226 & 8) != 0 ? yDY.AhwBna() : list2, (226 & 16) == 0, (226 & 32) != 0 ? null : null, (226 & 64) != 0 ? new java.util.ArrayList() : null, (226 & 128) == 0 ? null : null);
        if (interfaceC54856xXw != null) {
            fragmentManager.registerFragmentLifecycleCallbacks(new Application(c14616donKWHzl, interfaceC54856xXw, fragmentManager), false);
        }
        if (interfaceC54859xXz != null) {
            AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXH.class, new java.lang.String[0]);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, lifecycleOwner);
            final Function1 function1 = new Function1() { // from class: o.diw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14140dfo.AEQbTJ(interfaceC54859xXz, (xXH) obj);
                }
            };
            abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.diz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14140dfo.swzYdv(function1, obj);
                }
            });
        }
        c14616donKWHzl.show(fragmentManager, C14616don.class.getSimpleName());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.dfo$Application */
    public static final class Application extends FragmentManager.FragmentLifecycleCallbacks {
        public final /* synthetic */ InterfaceC54856xXw AEQbTJ;
        public final /* synthetic */ androidx.fragment.app.FragmentManager EZpvd;
        public final /* synthetic */ C14616don KWHzl;

        public Application(C14616don c14616don, InterfaceC54856xXw interfaceC54856xXw, androidx.fragment.app.FragmentManager fragmentManager) {
            this.KWHzl = c14616don;
            this.AEQbTJ = interfaceC54856xXw;
            this.EZpvd = fragmentManager;
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentDestroyed(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            super.onFragmentDestroyed(fragmentManager, fragment);
            if (Intrinsics.EZpvd(fragment, this.KWHzl)) {
                this.AEQbTJ.OLrzqt(null);
                this.EZpvd.unregisterFragmentLifecycleCallbacks(this);
            }
        }
    }

    public static final void swzYdv(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(InterfaceC54859xXz interfaceC54859xXz, xXH xxh) {
        if (Intrinsics.EZpvd((java.lang.Object) (xxh != null ? xxh.OLrzqt() : null), (java.lang.Object) "from_import")) {
            interfaceC54859xXz.EZpvd();
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(LifecycleOwner lifecycleOwner, Function0<Unit> function0) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new WalletCreateHelper$handleJudgeForbiddenCheck$1((OKComplianceRestrictionService) C43248rlh.KWHzl.AEQbTJ(OKComplianceRestrictionService.class), this, lifecycleOwner, function0, null), 3, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.bbK.StateListAnimator.ensureInitialized$default(o.bbK, boolean, int, java.lang.Object):o.ywX */
    /* JADX DEBUG: Class process forced to load method for inline: o.myD.subscribeOnIO$default(o.ywX, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, int, java.lang.Object):o.yxC */
    public final void OLrzqt(LifecycleOwner lifecycleOwner, final Function1<? super Unit, Unit> function1) {
        C33527myD.subscribeOnIO$default(C58156yvv.OLrzqt(InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null), lifecycleOwner, Lifecycle.Event.ON_DESTROY), new Function1() { // from class: o.dgZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.EZpvd((java.lang.Throwable) obj);
            }
        }, new Function0() { // from class: o.dhk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C14140dfo.EZpvd(function1);
            }
        }, (Function1) null, 4, (java.lang.Object) null);
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        pUU.copydefault("WalletCreateHelper", "handleEnsureInitData ensureInitialized error message :" + th.getMessage());
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(Function1 function1) {
        Unit unit = Unit.INSTANCE;
        function1.invoke(unit);
        return unit;
    }

    public final void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        DefiWalletVReminderDFragment.Companion.EZpvd(new DefiWalletVReminderDFragment.ReminderDataBean(C52761wXj.TaskDescription.NRYds, null, str, str2, str3, str4, 2, null)).AEQbTJ(fragmentManager, new Function1() { // from class: o.die
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14140dfo.AEQbTJ(function0, (java.lang.Integer) obj);
            }
        });
    }

    public static final Unit AEQbTJ(Function0 function0, java.lang.Integer num) {
        if (num != null && num.intValue() == 1) {
            if (function0 != null) {
            }
        } else if (num != null) {
            num.intValue();
        }
        return Unit.INSTANCE;
    }

    public final java.lang.String OLrzqt(java.util.List<? extends AbstractC12784ctX> list, int i) {
        java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.HJWChPQdUnVm)).toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(string);
        sb.append(" ");
        if (list.isEmpty()) {
            sb.append(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
        } else if (i == -1) {
            java.util.HashSet hashSet = new java.util.HashSet(list.size() + 1);
            hashSet.add(string);
            sb.append(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
            for (AbstractC12784ctX abstractC12784ctX : list) {
                hashSet.add(abstractC12784ctX.AuCTel());
                java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) abstractC12784ctX.AuCTel()).toString(), new java.lang.String[]{" "}, false, 0, 6, (java.lang.Object) null);
                if (listSplit$default.size() > 1) {
                    hashSet.add(listSplit$default.get(listSplit$default.size() - 1));
                }
            }
            int i2 = 0;
            java.lang.String strValueOf = ExifInterface.GPS_MEASUREMENT_IN_PROGRESS;
            while (true) {
                if (!hashSet.contains(sb.toString()) && !hashSet.contains(strValueOf)) {
                    break;
                }
                C59445zhF.EZpvd(sb);
                sb.append(string);
                sb.append(" ");
                if (i2 < 26) {
                    char c = (char) (i2 + 65);
                    sb.append(c);
                    strValueOf = java.lang.String.valueOf(c);
                } else {
                    int i3 = i2 - 26;
                    java.lang.String str = ExifInterface.GPS_MEASUREMENT_IN_PROGRESS + i3;
                    sb.append(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
                    sb.append(i3);
                    strValueOf = str;
                }
                i2++;
            }
            Unit unit = Unit.INSTANCE;
        } else {
            C59445zhF.EZpvd(sb);
            sb.append(string);
            sb.append(" ");
            if (i < 26) {
                sb.append((char) (i + 65));
            } else {
                sb.append(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
                sb.append(i - 26);
            }
        }
        java.lang.String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    public final java.lang.String OLrzqt(HardwareType hardwareType) {
        int i = Activity.OLrzqt[hardwareType.ordinal()];
        if (i == 1) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.getErrorCode);
        }
        if (i == 2) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.getLastPositionUpdateTime);
        }
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.getErrorCode);
    }

    public final java.lang.String copydefault(java.lang.String str, int i) {
        java.lang.StringBuilder sb;
        java.lang.String str2;
        java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString();
        if (i < 10) {
            sb = new java.lang.StringBuilder();
            sb.append(string);
            str2 = " 0";
        } else {
            sb = new java.lang.StringBuilder();
            sb.append(string);
            str2 = " ";
        }
        sb.append(str2);
        sb.append(i);
        return sb.toString();
    }

    public final void copydefault(WalletType walletType, int i) {
        RxBus.AEQbTJ(new xXO());
        java.lang.String str = "from_create";
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z = false;
        int i2 = 2;
        if (i == 1) {
            RxBus.AEQbTJ(new xXH(str, z, i2, defaultConstructorMarker));
            return;
        }
        if (i == 2) {
            RxBus.AEQbTJ(new C14449dlf());
            RxBus.AEQbTJ(new xXH(str, z, i2, defaultConstructorMarker));
            return;
        }
        java.lang.String str2 = "from_import";
        if (i == 3) {
            RxBus.AEQbTJ(new xXH(str2, z, i2, defaultConstructorMarker));
            return;
        }
        if (i == 4) {
            RxBus.AEQbTJ(new C14449dlf());
            RxBus.AEQbTJ(new xXH(str2, z, i2, defaultConstructorMarker));
        } else {
            if (i != 5) {
                return;
            }
            RxBus.AEQbTJ(new xXH("from_cefi", z, i2, defaultConstructorMarker));
        }
    }

    public final java.lang.String OLrzqt() {
        java.lang.String hexString = java.lang.Integer.toHexString(C33070mpX.copydefault(C52761wXj.Activity.DeEinT));
        Intrinsics.checkNotNullExpressionValue(hexString, "");
        java.lang.String strSubstring = hexString.substring(2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + strSubstring;
    }

    public final void copydefault(AbstractC12782ctV abstractC12782ctV, int i) {
        CreateOrImportType createOrImportType;
        if (copydefault(i)) {
            createOrImportType = CreateOrImportType.CREATE_WALLET;
        } else {
            createOrImportType = CreateOrImportType.IMPORT_WALLET;
        }
        InterfaceC18445fiY interfaceC18445fiY = this.AYXKKw;
        java.lang.String str = (java.lang.String) C32935mmv.KWHzl.get("channel_id");
        if (str == null) {
            str = "";
        }
        interfaceC18445fiY.KWHzl("WalletCreateHelper", abstractC12782ctV, createOrImportType, str);
    }

    public static final InterfaceC58261yxu KWHzl(C14140dfo c14140dfo, java.lang.String str, java.util.List list) {
        java.lang.Object obj;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) obj2;
            if (abstractC12784ctX.fJNWhG() == WalletType.HDWallet || abstractC12784ctX.fJNWhG() == WalletType.TonWallet) {
                arrayList.add(obj2);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            java.lang.Object next = it.next();
            if (it.hasNext()) {
                int iAhwBna = ((AbstractC12784ctX) next).AhwBna();
                do {
                    java.lang.Object next2 = it.next();
                    int iAhwBna2 = ((AbstractC12784ctX) next2).AhwBna();
                    if (iAhwBna < iAhwBna2) {
                        next = next2;
                        iAhwBna = iAhwBna2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        AbstractC12784ctX abstractC12784ctX2 = (AbstractC12784ctX) obj;
        int iAhwBna3 = abstractC12784ctX2 != null ? abstractC12784ctX2.AhwBna() : -1;
        int i = (arrayList.isEmpty() || iAhwBna3 != -1) ? iAhwBna3 + 1 : -1;
        return C13092czN.createHDWallet$default(c14140dfo.AhwBna, c14140dfo.OLrzqt(arrayList, i), i, createWalletName$default(c14140dfo, null, 1, false, 5, null), str, null, 16, null);
    }

    public static final InterfaceC58261yxu KWHzl(java.lang.String str, C14140dfo c14140dfo, java.lang.String str2, MpcWalletDecodeInfo mpcWalletDecodeInfo, java.util.List list) {
        java.lang.String str3;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            MpcWalletEncodeInfo mpcWalletEncodeInfoIsConnected = ((AbstractC12784ctX) obj).isConnected();
            if (Intrinsics.EZpvd((java.lang.Object) (mpcWalletEncodeInfoIsConnected != null ? mpcWalletEncodeInfoIsConnected.getUid() : null), (java.lang.Object) mpcWalletDecodeInfo.getUid())) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            str3 = str;
        } else {
            java.lang.String str4 = java.lang.String.format(str + " %02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(size + 1)}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, "");
            str3 = str4;
        }
        return c14140dfo.AhwBna.copydefault(str3, size, createWalletName$default(c14140dfo, null, 1, false, 5, null), str2, mpcWalletDecodeInfo);
    }

    public static final InterfaceC58261yxu OLrzqt(java.lang.String str, C14140dfo c14140dfo, java.lang.String str2, MpcWalletDecodeInfo mpcWalletDecodeInfo, java.lang.String str3, java.util.List list) {
        C14140dfo c14140dfo2;
        java.lang.String str4;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            MpcWalletEncodeInfo mpcWalletEncodeInfoIsConnected = ((AbstractC12784ctX) obj).isConnected();
            if (Intrinsics.EZpvd((java.lang.Object) (mpcWalletEncodeInfoIsConnected != null ? mpcWalletEncodeInfoIsConnected.getUid() : null), (java.lang.Object) mpcWalletDecodeInfo.getUid())) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            str4 = str;
            c14140dfo2 = c14140dfo;
        } else {
            java.lang.String str5 = java.lang.String.format(str + " %02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(size + 1)}, 1));
            Intrinsics.checkNotNullExpressionValue(str5, "");
            c14140dfo2 = c14140dfo;
            str4 = str5;
        }
        return c14140dfo2.AhwBna.KWHzl(str4, size, createWalletName$default(c14140dfo, null, 1, false, 5, null), str2, mpcWalletDecodeInfo, str3);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.czN.importHDWallet$default(o.czN, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int, java.lang.Object):o.yxt */
    public static final InterfaceC58261yxu AEQbTJ(C14140dfo c14140dfo, java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.util.List list) {
        java.lang.Object obj;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) obj2;
            if (abstractC12784ctX.fJNWhG() == WalletType.HDWallet || abstractC12784ctX.fJNWhG() == WalletType.TonWallet) {
                arrayList.add(obj2);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            java.lang.Object next = it.next();
            if (it.hasNext()) {
                int iAhwBna = ((AbstractC12784ctX) next).AhwBna();
                do {
                    java.lang.Object next2 = it.next();
                    int iAhwBna2 = ((AbstractC12784ctX) next2).AhwBna();
                    if (iAhwBna < iAhwBna2) {
                        next = next2;
                        iAhwBna = iAhwBna2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        AbstractC12784ctX abstractC12784ctX2 = (AbstractC12784ctX) obj;
        int iAhwBna3 = abstractC12784ctX2 != null ? abstractC12784ctX2.AhwBna() : -1;
        int i = (arrayList.isEmpty() || iAhwBna3 != -1) ? iAhwBna3 + 1 : -1;
        return c14140dfo.AhwBna.KWHzl(c14140dfo.OLrzqt(arrayList, i), i, createWalletName$default(c14140dfo, null, 1, false, 5, null), str, str2, (32 & 32) != 0 ? MnemonicKt.MnemonicLanguageEnglish : null, z, z2);
    }

    public static final java.util.List OLrzqt(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj;
            if (abstractC12782ctV.getNewProxyInstance() == WalletType.KeyWallet.ordinal() || abstractC12782ctV.getNewProxyInstance() == WalletType.HDWallet.ordinal()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final java.util.List AEQbTJ(java.lang.String str, C14140dfo c14140dfo, HardwareType hardwareType, java.util.List list) {
        C13854daT c13854daTFetchVPNInfo;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj;
            AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
            if (abstractC12784ctXGwTjWJ != null && c14140dfo.KWHzl(abstractC12784ctXGwTjWJ, hardwareType)) {
                AbstractC12784ctX abstractC12784ctXGwTjWJ2 = abstractC12782ctV.gwTjWJ();
                if (Intrinsics.EZpvd((java.lang.Object) ((abstractC12784ctXGwTjWJ2 == null || (c13854daTFetchVPNInfo = abstractC12784ctXGwTjWJ2.fetchVPNInfo()) == null) ? null : c13854daTFetchVPNInfo.AYXKKw()), (java.lang.Object) str)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public static final InterfaceC58261yxu EZpvd(C14140dfo c14140dfo, java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.util.List list) {
        java.lang.Object obj;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) obj2;
            if (abstractC12784ctX.fJNWhG() == WalletType.HDWallet || abstractC12784ctX.fJNWhG() == WalletType.TonWallet) {
                arrayList.add(obj2);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            java.lang.Object next = it.next();
            if (it.hasNext()) {
                int iAhwBna = ((AbstractC12784ctX) next).AhwBna();
                do {
                    java.lang.Object next2 = it.next();
                    int iAhwBna2 = ((AbstractC12784ctX) next2).AhwBna();
                    if (iAhwBna < iAhwBna2) {
                        next = next2;
                        iAhwBna = iAhwBna2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        AbstractC12784ctX abstractC12784ctX2 = (AbstractC12784ctX) obj;
        int iAhwBna3 = abstractC12784ctX2 != null ? abstractC12784ctX2.AhwBna() : -1;
        int i = (arrayList.isEmpty() || iAhwBna3 != -1) ? iAhwBna3 + 1 : -1;
        return c14140dfo.AhwBna.copydefault(c14140dfo.OLrzqt((java.util.List<? extends AbstractC12784ctX>) list, i), i, createWalletName$default(c14140dfo, null, 1, false, 5, null), str, str2, (32 & 32) != 0 ? MnemonicKt.MnemonicLanguageEnglish : null, z, z2);
    }

    public static final java.util.List OLrzqt(C13854daT c13854daT, C14140dfo c14140dfo, java.util.List list) {
        C13854daT c13854daTFetchVPNInfo;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj;
            AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
            if (abstractC12784ctXGwTjWJ != null && c14140dfo.KWHzl(abstractC12784ctXGwTjWJ, c13854daT.KWHzl())) {
                AbstractC12784ctX abstractC12784ctXGwTjWJ2 = abstractC12782ctV.gwTjWJ();
                if (Intrinsics.EZpvd((java.lang.Object) ((abstractC12784ctXGwTjWJ2 == null || (c13854daTFetchVPNInfo = abstractC12784ctXGwTjWJ2.fetchVPNInfo()) == null) ? null : c13854daTFetchVPNInfo.AYXKKw()), (java.lang.Object) c13854daT.AYXKKw())) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }
}
