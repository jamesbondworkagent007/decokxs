package o;

import androidx.autofill.HintConstants;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.wallet.imported.DefiWalletImportUIHelper$checkWalletExist$1;
import com.okinc.business.defi.wallet.imported.DefiWalletImportUIHelper$handleCheckPasswordStatus$1;
import com.okinc.business.defi.wallet.imported.DefiWalletImportUIHelper$startImportWallet$1$onActivityCreated$1;
import com.okinc.business.defi.wallet.imported.DefiWalletImportUIHelper$startImportWallet$1$onButtonEvent$1;
import com.okinc.business.defi.wallet.imported.DefiWalletImportUIHelper$startImportWallet$1$onPrivateKeyValid$1;
import com.okinc.business.defi.wallet.imported.DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseCollide$1;
import com.okinc.business.defi.wallet.imported.DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseCollide$2$1;
import com.okinc.business.defi.wallet.imported.DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseValid$1;
import com.okinc.business.defi.wallet.imported.DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseValid$2$1;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.wallet.api.bean.AddressType;
import com.okinc.wallet.api.bean.SupportedNetworkType;
import com.okinc.wallet.core.mpc.CoinAddressBean;
import com.okinc.wallet.core.mpc.WalletAddressList;
import com.okinc.web3.security.bridge.MnemonicKt;
import com.okinc.web3.security.listener.ImportWalletListener;
import com.okinc.web3.security.model.ButtonEvent;
import com.okinc.web3.security.model.ImportMode;
import com.okinc.web3.security.model.TonAddress;
import com.okinc.web3.security.model.TonAddressInfo;
import com.okinc.web3.security.model.ValidSeedPhraseResult;
import com.okinc.web3.security.service.Web3SecurityServiceProvider;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13092czN;
import o.C13754dXa;
import o.C14140dfo;
import o.C18408fho;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fho, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18408fho {
    public static final C18408fho EZpvd = new C18408fho();

    private C18408fho() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.fho */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startImportWallet$default(C18408fho c18408fho, android.content.Context context, int i, InterfaceC14457dln interfaceC14457dln, java.util.List list, ImportMode importMode, int i2, java.lang.Object obj) {
        InterfaceC14457dln interfaceC14457dln2 = (i2 & 4) != 0 ? null : interfaceC14457dln;
        java.util.List list2 = (i2 & 8) != 0 ? null : list;
        if ((i2 & 16) != 0) {
            importMode = ImportMode.All;
        }
        c18408fho.EZpvd(context, i, interfaceC14457dln2, list2, importMode);
    }

    public final void EZpvd(@NotNull android.content.Context context, int i, InterfaceC14457dln interfaceC14457dln, java.util.List<SupportedNetworkType> list, @NotNull ImportMode importMode) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(importMode, "");
        C13758dXe c13758dXeIsConnected = C13458dMb.EZpvd(context).isConnected();
        C14565dnp c14565dnp = new C14565dnp();
        Web3SecurityServiceProvider.getService().startImportingWallet(context, importMode, new Activity(i, interfaceC14457dln, c13758dXeIsConnected, new Function1() { // from class: o.fhq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18408fho.EZpvd((AbstractC12782ctV) obj);
            }
        }, list, c14565dnp));
    }

    public static final Unit EZpvd(AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV == null) {
            C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setMediaController), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.fho$Activity */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class Activity implements ImportWalletListener {
        public final /* synthetic */ C13758dXe AEQbTJ;
        public final /* synthetic */ java.util.List<SupportedNetworkType> AYXKKw;
        public final /* synthetic */ InterfaceC14457dln EZpvd;
        public final /* synthetic */ Function1<AbstractC12782ctV, Unit> KWHzl;
        public final /* synthetic */ InterfaceC14563dnn OLrzqt;
        public final /* synthetic */ int copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.ctV, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(int i, InterfaceC14457dln interfaceC14457dln, C13758dXe c13758dXe, Function1<? super AbstractC12782ctV, Unit> function1, java.util.List<SupportedNetworkType> list, InterfaceC14563dnn interfaceC14563dnn) {
            this.copydefault = i;
            this.EZpvd = interfaceC14457dln;
            this.AEQbTJ = c13758dXe;
            this.KWHzl = function1;
            this.AYXKKw = list;
            this.OLrzqt = interfaceC14563dnn;
        }

        @Override // com.okinc.web3.security.listener.ImportWalletListener
        public void onActivityCreated(AbstractActivityC33041mov abstractActivityC33041mov) {
            Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041mov), null, null, new DefiWalletImportUIHelper$startImportWallet$1$onActivityCreated$1(null), 3, null);
        }

        @Override // com.okinc.web3.security.listener.ImportWalletListener
        public void onSeedPhraseValid(final AbstractActivityC33041mov abstractActivityC33041mov, final ValidSeedPhraseResult validSeedPhraseResult, final Function1<? super java.lang.String, Unit> function1) {
            Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
            Intrinsics.checkNotNullParameter(validSeedPhraseResult, "");
            Intrinsics.checkNotNullParameter(function1, "");
            C18408fho c18408fho = C18408fho.EZpvd;
            int i = this.copydefault;
            DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseValid$1 defiWalletImportUIHelper$startImportWallet$1$onSeedPhraseValid$1 = new DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseValid$1(validSeedPhraseResult, this.AEQbTJ, null);
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("from", "mnemonic"), C56390yDp.OLrzqt("mnemonic", validSeedPhraseResult.getSeedPhrase()), C56390yDp.OLrzqt(OtcExtraKeys.MODE, java.lang.Integer.valueOf(this.copydefault)));
            final InterfaceC14457dln interfaceC14457dln = this.EZpvd;
            final int i2 = this.copydefault;
            final Function1<AbstractC12782ctV, Unit> function12 = this.KWHzl;
            C18408fho.handleCheckPasswordStatus$default(c18408fho, abstractActivityC33041mov, true, i, defiWalletImportUIHelper$startImportWallet$1$onSeedPhraseValid$1, bundleBundleOf, interfaceC14457dln, new Function1() { // from class: o.fhz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18408fho.Activity.copydefault(validSeedPhraseResult, i2, abstractActivityC33041mov, interfaceC14457dln, function12, function1, (java.lang.String) obj);
                }
            }, null, 128, null);
        }

        public static final Unit copydefault(ValidSeedPhraseResult validSeedPhraseResult, int i, AbstractActivityC33041mov abstractActivityC33041mov, InterfaceC14457dln interfaceC14457dln, Function1 function1, Function1 function12, java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (!validSeedPhraseResult.getIgnoreCheckExists()) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041mov), null, null, new DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseValid$2$1(validSeedPhraseResult, str, function12, i, abstractActivityC33041mov, interfaceC14457dln, function1, null), 3, null);
                return Unit.INSTANCE;
            }
            C18408fho.EZpvd.OLrzqt(i, abstractActivityC33041mov, interfaceC14457dln, str, validSeedPhraseResult.getSeedPhrase(), validSeedPhraseResult.isTon(), function1);
            return Unit.INSTANCE;
        }

        @Override // com.okinc.web3.security.listener.ImportWalletListener
        public void onPrivateKeyValid(final AbstractActivityC33041mov abstractActivityC33041mov, final java.lang.String str, Function1<? super java.lang.String, Unit> function1) {
            Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            if (!C13847daM.Companion.AYXKKw(str)) {
                function1.invoke(C33070mpX.AYXKKw(C13754dXa.FragmentManager.PipHintTrackerKttrackPipAnimationHintViewflow1attachStateChangeListener1));
                return;
            }
            C18408fho c18408fho = C18408fho.EZpvd;
            kotlin.Pair pairKWHzl = c18408fho.KWHzl(str, this.AYXKKw);
            final java.lang.Long l = (java.lang.Long) pairKWHzl.component1();
            java.lang.String str2 = (java.lang.String) pairKWHzl.component2();
            if (str2 != null) {
                function1.invoke(str2);
                return;
            }
            int i = this.copydefault;
            DefiWalletImportUIHelper$startImportWallet$1$onPrivateKeyValid$1 defiWalletImportUIHelper$startImportWallet$1$onPrivateKeyValid$1 = new DefiWalletImportUIHelper$startImportWallet$1$onPrivateKeyValid$1(this.AEQbTJ, str, null);
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("requestCode", 101), C56390yDp.OLrzqt("from", Web3SecurityTrackEvent.VALUE_PRIVATE_KEY), C56390yDp.OLrzqt(Web3SecurityTrackEvent.VALUE_PRIVATE_KEY, str), C56390yDp.OLrzqt(OtcExtraKeys.MODE, java.lang.Integer.valueOf(this.copydefault)));
            if (l != null) {
                bundleBundleOf.putLong("chain_id", l.longValue());
            }
            Unit unit = Unit.INSTANCE;
            final InterfaceC14457dln interfaceC14457dln = this.EZpvd;
            final int i2 = this.copydefault;
            final java.util.List<SupportedNetworkType> list = this.AYXKKw;
            final Function1<AbstractC12782ctV, Unit> function12 = this.KWHzl;
            Function1<? super java.lang.String, Unit> function13 = new Function1() { // from class: o.fht
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18408fho.Activity.OLrzqt(abstractActivityC33041mov, interfaceC14457dln, i2, str, l, list, function12, (java.lang.String) obj);
                }
            };
            final InterfaceC14457dln interfaceC14457dln2 = this.EZpvd;
            final int i3 = this.copydefault;
            final java.util.List<SupportedNetworkType> list2 = this.AYXKKw;
            final Function1<AbstractC12782ctV, Unit> function14 = this.KWHzl;
            c18408fho.KWHzl(abstractActivityC33041mov, false, i, (Function1<? super Continuation<? super java.lang.Boolean>, ? extends java.lang.Object>) defiWalletImportUIHelper$startImportWallet$1$onPrivateKeyValid$1, bundleBundleOf, interfaceC14457dln, function13, new Function1() { // from class: o.fhs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18408fho.Activity.KWHzl(abstractActivityC33041mov, interfaceC14457dln2, i3, str, l, list2, function14, (android.content.Intent) obj);
                }
            });
        }

        public static final Unit OLrzqt(AbstractActivityC33041mov abstractActivityC33041mov, InterfaceC14457dln interfaceC14457dln, int i, java.lang.String str, java.lang.Long l, java.util.List list, Function1 function1, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            C18408fho.EZpvd.AEQbTJ(abstractActivityC33041mov, interfaceC14457dln, i, str, str2, l, list, function1);
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(AbstractActivityC33041mov abstractActivityC33041mov, InterfaceC14457dln interfaceC14457dln, int i, java.lang.String str, java.lang.Long l, java.util.List list, Function1 function1, android.content.Intent intent) {
            if (intent == null) {
                return Unit.INSTANCE;
            }
            java.lang.String stringExtra = intent.getStringExtra(HintConstants.AUTOFILL_HINT_PASSWORD);
            if (stringExtra != null) {
                C18408fho.EZpvd.AEQbTJ(abstractActivityC33041mov, interfaceC14457dln, i, str, stringExtra, l, list, function1);
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }

        @Override // com.okinc.web3.security.listener.ImportWalletListener
        public void onSeedPhraseCollide(final AbstractActivityC33041mov abstractActivityC33041mov, final java.lang.String str, final Function1<? super TonAddress, Unit> function1, final Function1<? super java.lang.String, Unit> function12) {
            Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            C18408fho.handleCheckPasswordStatus$default(C18408fho.EZpvd, abstractActivityC33041mov, true, this.copydefault, new DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseCollide$1(this.AEQbTJ, str, null), BundleKt.bundleOf(C56390yDp.OLrzqt("from", "mnemonic"), C56390yDp.OLrzqt("mnemonic", str), C56390yDp.OLrzqt(OtcExtraKeys.MODE, java.lang.Integer.valueOf(this.copydefault))), this.EZpvd, new Function1() { // from class: o.fhr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18408fho.Activity.copydefault(abstractActivityC33041mov, str, function12, function1, (java.lang.String) obj);
                }
            }, null, 128, null);
        }

        public static final Unit copydefault(AbstractActivityC33041mov abstractActivityC33041mov, java.lang.String str, Function1 function1, Function1 function12, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041mov), null, null, new DefiWalletImportUIHelper$startImportWallet$1$onSeedPhraseCollide$2$1(str, str2, function1, function12, null), 3, null);
            return Unit.INSTANCE;
        }

        @Override // com.okinc.web3.security.listener.ImportWalletListener
        public void onButtonEvent(AbstractActivityC33041mov abstractActivityC33041mov, ButtonEvent buttonEvent) {
            Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
            Intrinsics.checkNotNullParameter(buttonEvent, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041mov), null, null, new DefiWalletImportUIHelper$startImportWallet$1$onButtonEvent$1(buttonEvent, this.OLrzqt, null), 3, null);
        }
    }

    public final void OLrzqt(int i, AbstractActivityC33041mov abstractActivityC33041mov, InterfaceC14457dln interfaceC14457dln, java.lang.String str, java.lang.String str2, boolean z, Function1<? super AbstractC12782ctV, Unit> function1) {
        InterfaceC14457dln interfaceC14457dlnAEQbTJ = AEQbTJ(abstractActivityC33041mov, interfaceC14457dln, i, false);
        if (z) {
            C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null).copydefault(str, str2, false, false, abstractActivityC33041mov.getSupportFragmentManager(), interfaceC14457dlnAEQbTJ, function1);
        } else {
            C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null).EZpvd(str, str2, false, false, abstractActivityC33041mov.getSupportFragmentManager(), interfaceC14457dlnAEQbTJ, function1);
        }
    }

    public final void AEQbTJ(AbstractActivityC33041mov abstractActivityC33041mov, InterfaceC14457dln interfaceC14457dln, int i, java.lang.String str, java.lang.String str2, java.lang.Long l, java.util.List<SupportedNetworkType> list, Function1<? super AbstractC12782ctV, Unit> function1) {
        C14681dpz.OLrzqt.AEQbTJ();
        if (l != null) {
            AEQbTJ(abstractActivityC33041mov, interfaceC14457dln, i, str, str2, l.longValue(), function1);
        } else {
            copydefault(abstractActivityC33041mov, interfaceC14457dln, i, str, str2, list);
        }
    }

    public final void AEQbTJ(AbstractActivityC33041mov abstractActivityC33041mov, InterfaceC14457dln interfaceC14457dln, int i, java.lang.String str, java.lang.String str2, long j, Function1<? super AbstractC12782ctV, Unit> function1) {
        if (interfaceC14457dln != null) {
            if (interfaceC14457dln instanceof C14462dls) {
                ((C14462dls) interfaceC14457dln).AEQbTJ(abstractActivityC33041mov);
            } else if (interfaceC14457dln instanceof C14456dlm) {
                ((C14456dlm) interfaceC14457dln).AEQbTJ(abstractActivityC33041mov);
            }
        }
        C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null).EZpvd(str2, j, str, abstractActivityC33041mov.getSupportFragmentManager(), getWalletImportStrategy$default(this, abstractActivityC33041mov, interfaceC14457dln, i, false, 8, null), function1);
    }

    public final void copydefault(AbstractActivityC33041mov abstractActivityC33041mov, InterfaceC14457dln interfaceC14457dln, int i, java.lang.String str, java.lang.String str2, java.util.List<SupportedNetworkType> list) {
        ActivityC18418fhy.Companion.OLrzqt(abstractActivityC33041mov, (784 & 2) != 0 ? "" : null, (784 & 4) != 0 ? "" : str2, (784 & 8) != 0 ? "" : null, (784 & 16) == 0 ? str : "", (784 & 32) != 0 ? 1 : i, (784 & 64) != 0 ? false : false, (784 & 128) == 0 ? false : false, (784 & 256) != 0 ? null : interfaceC14457dln, (784 & 512) == 0 ? list : null);
        if (i == 2) {
            abstractActivityC33041mov.finish();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: o.fho */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleCheckPasswordStatus$default(C18408fho c18408fho, AbstractActivityC33041mov abstractActivityC33041mov, boolean z, int i, Function1 function1, android.os.Bundle bundle, InterfaceC14457dln interfaceC14457dln, Function1 function12, Function1 function13, int i2, java.lang.Object obj) {
        c18408fho.KWHzl(abstractActivityC33041mov, z, i, (Function1<? super Continuation<? super java.lang.Boolean>, ? extends java.lang.Object>) function1, bundle, interfaceC14457dln, (Function1<? super java.lang.String, Unit>) function12, (Function1<? super android.content.Intent, Unit>) ((i2 & 128) != 0 ? null : function13));
    }

    public final void KWHzl(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, boolean z, int i, @NotNull Function1<? super Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function1, @NotNull android.os.Bundle bundle, InterfaceC14457dln interfaceC14457dln, Function1<? super java.lang.String, Unit> function12, Function1<? super android.content.Intent, Unit> function13) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041mov), null, null, new DefiWalletImportUIHelper$handleCheckPasswordStatus$1(abstractActivityC33041mov, function1, bundle, interfaceC14457dln, function12, function13, z, i, null), 3, null);
    }

    public static /* synthetic */ InterfaceC14457dln getWalletImportStrategy$default(C18408fho c18408fho, AbstractActivityC33041mov abstractActivityC33041mov, InterfaceC14457dln interfaceC14457dln, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        return c18408fho.AEQbTJ(abstractActivityC33041mov, interfaceC14457dln, i, z);
    }

    public final InterfaceC14457dln AEQbTJ(AbstractActivityC33041mov abstractActivityC33041mov, InterfaceC14457dln interfaceC14457dln, int i, boolean z) {
        if (interfaceC14457dln != null) {
            if (interfaceC14457dln instanceof C14462dls) {
                ((C14462dls) interfaceC14457dln).AEQbTJ(abstractActivityC33041mov);
            } else if (interfaceC14457dln instanceof C14456dlm) {
                ((C14456dlm) interfaceC14457dln).AEQbTJ(abstractActivityC33041mov);
            }
        }
        if (interfaceC14457dln != null) {
            return interfaceC14457dln;
        }
        if (i == 1) {
            return new C14459dlp(abstractActivityC33041mov, z);
        }
        return new C14458dlo(abstractActivityC33041mov);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(TonAddress tonAddress, java.lang.String str, java.lang.String str2, Continuation<? super TonAddress> continuation) throws java.lang.Throwable {
        DefiWalletImportUIHelper$checkWalletExist$1 defiWalletImportUIHelper$checkWalletExist$1;
        java.lang.String str3;
        TonAddressInfo tonAddressInfo;
        java.lang.Throwable th;
        TonAddressInfo tonAddressInfo2;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof DefiWalletImportUIHelper$checkWalletExist$1) {
            defiWalletImportUIHelper$checkWalletExist$1 = (DefiWalletImportUIHelper$checkWalletExist$1) continuation;
            int i = defiWalletImportUIHelper$checkWalletExist$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defiWalletImportUIHelper$checkWalletExist$1.label = i - Integer.MIN_VALUE;
            } else {
                defiWalletImportUIHelper$checkWalletExist$1 = new DefiWalletImportUIHelper$checkWalletExist$1(this, continuation);
            }
        }
        java.lang.Object obj = defiWalletImportUIHelper$checkWalletExist$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = defiWalletImportUIHelper$checkWalletExist$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                TonAddressInfo tonAddressInfo3 = new TonAddressInfo(tonAddress.getTonAddress().getAddress(), false, 2, null);
                TonAddressInfo tonAddressInfo4 = new TonAddressInfo(tonAddress.getHdTonAddress().getAddress(), false, 2, null);
                try {
                    Result.Application application = Result.Companion;
                    C13092czN instance$default = C13092czN.Activity.getInstance$default(C13092czN.Companion, null, 1, null);
                    java.util.List<java.lang.Integer> listAhwBna = yDY.AhwBna(C56443yFo.AEQbTJ(WalletType.HDWallet.ordinal()), C56443yFo.AEQbTJ(WalletType.TonWallet.ordinal()));
                    defiWalletImportUIHelper$checkWalletExist$1.L$0 = str;
                    defiWalletImportUIHelper$checkWalletExist$1.L$1 = tonAddressInfo3;
                    defiWalletImportUIHelper$checkWalletExist$1.L$2 = tonAddressInfo4;
                    defiWalletImportUIHelper$checkWalletExist$1.label = 1;
                    java.lang.Object objEZpvd = instance$default.EZpvd(str, str2, listAhwBna, defiWalletImportUIHelper$checkWalletExist$1);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    str3 = str;
                    tonAddressInfo = tonAddressInfo3;
                    obj = objEZpvd;
                    tonAddressInfo2 = tonAddressInfo4;
                } catch (java.lang.Throwable th2) {
                    str3 = str;
                    tonAddressInfo = tonAddressInfo3;
                    th = th2;
                    tonAddressInfo2 = tonAddressInfo4;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tonAddressInfo2 = (TonAddressInfo) defiWalletImportUIHelper$checkWalletExist$1.L$2;
                tonAddressInfo = (TonAddressInfo) defiWalletImportUIHelper$checkWalletExist$1.L$1;
                str3 = (java.lang.String) defiWalletImportUIHelper$checkWalletExist$1.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    Result.Application application22 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) obj);
            if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                java.util.Iterator it = ((java.util.List) objM7377constructorimpl).iterator();
                while (it.hasNext()) {
                    int iIntValue = ((java.lang.Number) it.next()).intValue();
                    if (iIntValue == WalletType.TonWallet.ordinal()) {
                        tonAddressInfo.setAlreadyExist(true);
                    } else if (iIntValue == WalletType.HDWallet.ordinal()) {
                        tonAddressInfo2.setAlreadyExist(true);
                    }
                }
            }
            return new TonAddress(str3, tonAddressInfo, tonAddressInfo2);
        } catch (CancellationException e) {
            throw e;
        }
    }

    public final java.lang.String AEQbTJ(java.lang.String str, boolean z) {
        java.util.List<CoinAddressBean> addressList;
        CoinAddressBean coinAddressBean;
        C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(607L);
        if (c10854bwMCopydefault == null) {
            return "";
        }
        WalletAddressList walletAddressListKWHzl = C54908xZu.AEQbTJ.KWHzl(str, MnemonicKt.MnemonicLanguageEnglish, c10854bwMCopydefault.QKVWgx(), c10854bwMCopydefault.fetchVPNInfo(), 0, AddressType.Legacy.getValue(), c10854bwMCopydefault.iwGUEr(), (MLKEMEngine.KyberPolyBytes & 128) != 0, (MLKEMEngine.KyberPolyBytes & 256) != 0 ? false : z, "");
        java.lang.String address = (walletAddressListKWHzl == null || (addressList = walletAddressListKWHzl.getAddressList()) == null || (coinAddressBean = (CoinAddressBean) CollectionsKt___CollectionsKt.firstOrNull(addressList)) == null) ? null : coinAddressBean.getAddress();
        return address == null ? "" : address;
    }

    public final kotlin.Pair<java.lang.Long, java.lang.String> KWHzl(java.lang.String str, java.util.List<SupportedNetworkType> list) {
        java.lang.String strAYXKKw;
        java.lang.Long lEZpvd;
        java.util.List<C13853daS> listKWHzl = C13847daM.Companion.KWHzl(str);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        java.util.Iterator<T> it = listKWHzl.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Long.valueOf(((C13853daS) it.next()).copydefault().fetchVPNInfo()));
        }
        java.util.Set<java.lang.Long> setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
        if (list == null || list.isEmpty()) {
            return C56390yDp.OLrzqt(EZpvd(setOqFWZa), null);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(java.lang.Long.valueOf(((SupportedNetworkType) it2.next()).KWHzl()));
        }
        if (setOqFWZa.containsAll(arrayList2)) {
            if (KWHzl(list)) {
                lEZpvd = copydefault(list);
            } else {
                lEZpvd = EZpvd(setOqFWZa);
            }
            return C56390yDp.OLrzqt(lEZpvd, null);
        }
        if (list.size() == 1) {
            strAYXKKw = C33069mpW.copydefault(C13754dXa.FragmentManager.ActionBarDrawerToggleHoneycombSetIndicatorInfo, C56423yEv.EZpvd(C56390yDp.OLrzqt("network", ((SupportedNetworkType) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).EZpvd())));
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.canTextInput);
        }
        return C56390yDp.OLrzqt(null, strAYXKKw);
    }

    public final java.lang.Long EZpvd(java.util.Set<java.lang.Long> set) {
        java.lang.Long l = (java.lang.Long) CollectionsKt___CollectionsKt.iRxXKY(set);
        if (l != null) {
            C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(l.longValue());
            if (c10854bwMCopydefault != null) {
                return java.lang.Long.valueOf(c10854bwMCopydefault.AEQbTJ());
            }
        }
        return null;
    }

    public final boolean KWHzl(java.util.List<SupportedNetworkType> list) {
        return (list != null && list.size() == 1) || EZpvd(list);
    }

    public final java.lang.Long copydefault(java.util.List<SupportedNetworkType> list) {
        long jKWHzl;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (EZpvd(list)) {
            C10854bwM c10854bwMIsConnected = C10954byG.EZpvd.valueOf().isConnected();
            if (c10854bwMIsConnected == null) {
                return null;
            }
            jKWHzl = c10854bwMIsConnected.fetchVPNInfo();
        } else {
            jKWHzl = ((SupportedNetworkType) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).KWHzl();
        }
        C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(jKWHzl);
        if (c10854bwMCopydefault != null) {
            return java.lang.Long.valueOf(c10854bwMCopydefault.AEQbTJ());
        }
        return null;
    }

    public final boolean EZpvd(java.util.List<SupportedNetworkType> list) {
        if (list == null) {
            list = yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(((SupportedNetworkType) it.next()).KWHzl());
            if (c10854bwMCopydefault != null) {
                arrayList.add(c10854bwMCopydefault);
            }
        }
        if (!arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                return true;
            }
            java.util.Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!((C10854bwM) it2.next()).ejfBZ()) {
                }
            }
            return true;
        }
        return false;
    }
}
