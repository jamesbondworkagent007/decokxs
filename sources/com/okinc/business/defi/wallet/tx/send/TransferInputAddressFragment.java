package com.okinc.business.defi.wallet.tx.send;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.inputmethod.InputMethodManager;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.common.base.Ascii;
import com.google.gson.Gson;
import com.okinc.base.bugreport.DetectionInfoBean;
import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOInfo;
import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOSignData;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import com.okinc.business.defi.biz.core.tx.TransactionType;
import com.okinc.business.defi.biz.core.tx.check.ChainStatus;
import com.okinc.business.defi.biz.core.tx.check.ChainStatusChecker;
import com.okinc.business.defi.biz.core.tx.transaction.impl.OkUTXOTransaction;
import com.okinc.business.defi.biz.core.tx.wallet.OkTransactionWallet;
import com.okinc.business.defi.biz.net.bean.CheckAddressResp;
import com.okinc.business.defi.biz.net.bean.ParseENSResp;
import com.okinc.business.defi.biz.net.bean.RegisterStatusResp;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.business.defi.common.TxToastCheckHelper;
import com.okinc.business.defi.wallet.tx.send.TransferInputAddressFragment;
import com.okinc.business.defi.wallet.tx.send.adapter.SendCoinGroup;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.ScannerActivity;
import com.okinc.core.util.model.ScanConfig;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import o.AbstractC12782ctV;
import o.AbstractC20518giR;
import o.AbstractC57212yeE;
import o.AbstractC58185ywX;
import o.AbstractC58247yxg;
import o.AbstractC8005auZ;
import o.AbstractC8060avc;
import o.AbstractC8066avi;
import o.ActivityC20795gnd;
import o.C10854bwM;
import o.C10856bwO;
import o.C10954byG;
import o.C11627cVg;
import o.C13754dXa;
import o.C13934dbu;
import o.C14494dmX;
import o.C14784drw;
import o.C16605enA;
import o.C19574gHk;
import o.C19577gHn;
import o.C19579gHp;
import o.C19580gHq;
import o.C19589gHz;
import o.C19604gIn;
import o.C21038gsH;
import o.C32866mlf;
import o.C32962mnV;
import o.C33024moe;
import o.C33054mpH;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C33489mxS;
import o.C33527myD;
import o.C33570myu;
import o.C43453rpa;
import o.C44103sDl;
import o.C52761wXj;
import o.C52794wYp;
import o.C55113xdn;
import o.C55296xhK;
import o.C55326xho;
import o.C56390yDp;
import o.C56392yDr;
import o.C56423yEv;
import o.C56444yFp;
import o.C56524yIo;
import o.C58156yvv;
import o.C58266yxz;
import o.C8003auW;
import o.C8062ave;
import o.C8349bAz;
import o.C9694baS;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56445yFq;
import o.InterfaceC56514yIe;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.ViewOnClickListenerC54939xaY;
import o.fPH;
import o.fXY;
import o.rVN;
import o.xYW;
import o.yBI;
import o.yDY;
import o.yHO;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes5.dex */
public final class TransferInputAddressFragment extends AbstractC20518giR implements View.OnClickListener {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public InterfaceC58217yxC AEQbTJ;
    public InterfaceC58217yxC AhwBna;
    public InterfaceC58217yxC AkhnZx;
    public int AuCTel;
    public String DbNXlk;
    public InterfaceC58217yxC EZpvd;
    public InterfaceC58217yxC KWHzl;
    public String ejfBZ;
    public final View.OnFocusChangeListener fARcdN;
    public InterfaceC58217yxC fIwbmz;
    public final ActivityResultLauncher<Unit> fJNWhG;
    public InterfaceC58217yxC fetchVPNInfo;
    public C19580gHq getNewProxyInstance;
    public final InterfaceC56387yDm hDKMBd;
    public String isConnected;
    public InterfaceC58217yxC valueOf;
    public C16605enA values;

    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    public TransferInputAddressFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.okinc.business.defi.wallet.tx.send.TransferInputAddressFragment$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.tx.send.TransferInputAddressFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.hDKMBd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C19589gHz.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.tx.send.TransferInputAddressFragment$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.tx.send.TransferInputAddressFragment$special$$inlined$viewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.tx.send.TransferInputAddressFragment$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        ActivityResultLauncher<Unit> activityResultLauncherRegisterForActivityResult = registerForActivityResult(ScannerActivity.Activity.getResultContract$default(ScannerActivity.Companion, new ScanConfig(false, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DrqXHJ), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DGUQLIhJrIAr), C33070mpX.AYXKKw(C13754dXa.FragmentManager.profile), false, null, true, false, null, false, null, 3941, null), yDY.AhwBna(), null, 4, null), new ActivityResultCallback() { // from class: o.gGK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                TransferInputAddressFragment.OLrzqt(this.EZpvd, (java.lang.String) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.fJNWhG = activityResultLauncherRegisterForActivityResult;
        this.ejfBZ = "";
        this.isConnected = "";
        this.DbNXlk = "";
        this.AuCTel = -1;
        this.fARcdN = new View.OnFocusChangeListener() { // from class: o.gGI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                TransferInputAddressFragment.copydefault(this.copydefault, view, z);
            }
        };
    }

    public final C19589gHz isConnected() {
        return (C19589gHz) this.hDKMBd.getValue();
    }

    public final Group gEmmrt() {
        C16605enA c16605enA = this.values;
        if (c16605enA == null) {
            Intrinsics.gEmmrt("");
            c16605enA = null;
        }
        Group group = c16605enA.hDKMBd;
        Intrinsics.checkNotNullExpressionValue(group, "");
        return group;
    }

    private final C55113xdn fJNWhG() {
        C16605enA c16605enA = this.values;
        if (c16605enA == null) {
            Intrinsics.gEmmrt("");
            c16605enA = null;
        }
        C55113xdn c55113xdn = c16605enA.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        return c55113xdn;
    }

    public static final void OLrzqt(TransferInputAddressFragment transferInputAddressFragment, String str) {
        OkTransactionWallet okTransactionWalletOLrzqt;
        C10854bwM coinMeta;
        C8349bAz c8349bAz = C8349bAz.OLrzqt;
        Intrinsics.copydefault((Object) str);
        TransactionInfo transactionInfoGEmmrt = c8349bAz.gEmmrt(str);
        transferInputAddressFragment.isConnected().AEQbTJ(true);
        C16605enA c16605enA = transferInputAddressFragment.values;
        if (c16605enA == null) {
            Intrinsics.gEmmrt("");
            c16605enA = null;
        }
        c16605enA.isConnected.setVisibility(8);
        C16605enA c16605enA2 = transferInputAddressFragment.values;
        if (c16605enA2 == null) {
            Intrinsics.gEmmrt("");
            c16605enA2 = null;
        }
        c16605enA2.fJNWhG.setVisibility(8);
        C16605enA c16605enA3 = transferInputAddressFragment.values;
        if (c16605enA3 == null) {
            Intrinsics.gEmmrt("");
            c16605enA3 = null;
        }
        c16605enA3.AuCTel.setText(transactionInfoGEmmrt.getAddress());
        checkToAddress$default(transferInputAddressFragment, false, null, 2, null);
        transferInputAddressFragment.fARcdN();
        transferInputAddressFragment.valueOf();
        C19589gHz.StateListAnimator value = transferInputAddressFragment.isConnected().gEmmrt().getValue();
        if (value != null && (okTransactionWalletOLrzqt = value.OLrzqt()) != null && (coinMeta = okTransactionWalletOLrzqt.getCoinMeta()) != null) {
            transactionInfoGEmmrt = C21038gsH.copydefault.EZpvd(coinMeta, transactionInfoGEmmrt);
        }
        Bundle arguments = transferInputAddressFragment.getArguments();
        if (arguments != null) {
            arguments.putParcelable("send_scan_info", transactionInfoGEmmrt);
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.tx.send.TransferInputAddressFragment.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final TransferInputAddressFragment OLrzqt(@NotNull String str, String str2, TransactionInfo transactionInfo, @NotNull String str3, String str4, TransactionType transactionType, @NotNull String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str5, "");
            TransferInputAddressFragment transferInputAddressFragment = new TransferInputAddressFragment();
            transferInputAddressFragment.setArguments(TransferInputAddressFragment.Companion.copydefault(str, str2, transactionInfo, str3, str4, transactionType, str5));
            return transferInputAddressFragment;
        }

        public final Bundle copydefault(@NotNull String str, String str2, TransactionInfo transactionInfo, @NotNull String str3, String str4, TransactionType transactionType, @NotNull String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Bundle bundle = new Bundle();
            bundle.putString("wallet_id", str);
            bundle.putString("coinId", str2);
            bundle.putParcelable("send_scan_info", transactionInfo);
            bundle.putString("from", str3);
            bundle.putString("init_Args_json", str4);
            if (transactionType != null) {
                bundle.putInt("txType", transactionType.ordinal());
            }
            bundle.putString("from_address", str5);
            return bundle;
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ Function0 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(View view, long j, Function0 function0) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.invoke();
            }
        }
    }

    @Override // o.AbstractC14668dpm
    public View AEQbTJ(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C16605enA c16605enAEZpvd = C16605enA.EZpvd(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        this.values = c16605enAEZpvd;
        C16605enA c16605enA = null;
        if (c16605enAEZpvd == null) {
            Intrinsics.gEmmrt("");
            c16605enAEZpvd = null;
        }
        c16605enAEZpvd.AkhnZx.setText(viewGroup.getContext().getString(C13754dXa.FragmentManager.onScrollChange));
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("from") : null;
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != -2136319830) {
                if (iHashCode == 80334932 && string.equals("from_home")) {
                    EZpvd(true);
                }
            } else if (string.equals("from_coin_detail")) {
                EZpvd(false);
            }
        }
        fIwbmz();
        C16605enA c16605enA2 = this.values;
        if (c16605enA2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16605enA = c16605enA2;
        }
        LinearLayoutCompat linearLayoutCompatOLrzqt = c16605enA.getRoot();
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompatOLrzqt, "");
        return linearLayoutCompatOLrzqt;
    }

    @Override // o.AbstractC20518giR, o.AbstractC57212yeE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        isConnected().gEmmrt().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.gGJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransferInputAddressFragment.KWHzl(this.EZpvd, (C19589gHz.StateListAnimator) obj);
            }
        }));
        isConnected().OLrzqt().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.gGL
            private static final byte[] $$c = {104, 8, 37, -73};
            private static final int $$d = CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {86, 100, -95, -75, -4, 7, -1, Ascii.GS, 7, 7, Ascii.CR, -12, 17, 0, Ascii.VT, -30, 0, 17, 5};
            private static final int $$b = 29;
            private static int copydefault = 0;
            private static int djBIcL = 1;
            private static char[] OLrzqt = {64556, 27961, 56944, 20404, 47338, 10780, 39760, 1167, 30153, 3265, 40394, 11925, 48991, 18438, 56009, 27573, 62585, 34081, 6133, 41160, 12757, 49737, 21259, 65021, 36530, 8061, 43015, 15083, 52178, 21657, 58728, 30209, 245, 37298, 8821, 45869, 24038, 61137, 32713, 20854, 49246, 29461, 58073, 5533, 34670, 27624, 64202, 18877, 55363, 12042, 48616, 3236, 37748, 3307, 40396, 11923, 3273, 40404, 11960, 48962, 18437, 55995, 27577, 62586, 34158, 6121, 41171, 12673, 49674, 21258, 65014, 36536, 8034, 43046, 15077, 52177, 21659, 58705, 30213, 3311, 40396, 11957, 48989, 18450, 56055, 27577, 62570, 34095, 6131, 41173, 12698, 49732, 21291, 65015, 36542, 8061, 43050, 15072, 9172, 45804, 416, 36974, 26419, 62948, 17544, 56153, 43543};
            private static long EZpvd = 6699659406406032831L;
            private static char[] AEQbTJ = {20357, 19972, 19977, 19983, 19976, 19976, 20472, 20469, 19972, 19974, 19977, 19982, 20473, 20474, 19969, 19975, 19969, 19972, 19983, 19975, 19975, 20479, 20390, 20444, 20417, 20390, 20421, 20429, 20431, 20424, 20429, 20418, 20431, 20444, 20431, 20423, 20403, 20418, 20403, 20384, 20420, 20420, 20447};

            /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static java.lang.String $$e(short s, int i, int i2) {
                int i3;
                int i4;
                int i5;
                int i6 = (i2 * 2) + 1;
                int i7 = 4 - (s * 3);
                int i8 = i + 66;
                byte[] bArr = $$c;
                byte[] bArr2 = new byte[i6];
                if (bArr == null) {
                    i4 = i7;
                    int i9 = i6;
                    i5 = 0;
                    i7 += i9;
                    i4++;
                    i3 = i5;
                    i5 = i3 + 1;
                    bArr2[i3] = (byte) i7;
                    if (i5 == i6) {
                        return new java.lang.String(bArr2, 0);
                    }
                    i9 = bArr[i4];
                    i7 += i9;
                    i4++;
                    i3 = i5;
                    i5 = i3 + 1;
                    bArr2[i3] = (byte) i7;
                    if (i5 == i6) {
                    }
                } else {
                    i3 = 0;
                    i4 = i7;
                    i7 = i8;
                    i5 = i3 + 1;
                    bArr2[i3] = (byte) i7;
                    if (i5 == i6) {
                    }
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void c(int i, byte b, int i2, java.lang.Object[] objArr) {
                int i3;
                byte[] bArr = $$a;
                int i4 = (i2 * 20) + 79;
                int i5 = b * 5;
                int i6 = 13 - (i * 10);
                byte[] bArr2 = new byte[i5 + 6];
                int i7 = i5 + 5;
                if (bArr == null) {
                    int i8 = i7;
                    int i9 = 0;
                    i4 = i8 + (-i4) + 8;
                    i3 = i9;
                    i6++;
                    bArr2[i3] = (byte) i4;
                    i9 = i3 + 1;
                    if (i3 == i7) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    i8 = i4;
                    i4 = bArr[i6];
                    i4 = i8 + (-i4) + 8;
                    i3 = i9;
                    i6++;
                    bArr2[i3] = (byte) i4;
                    i9 = i3 + 1;
                    if (i3 == i7) {
                    }
                } else {
                    i3 = 0;
                    i6++;
                    bArr2[i3] = (byte) i4;
                    i9 = i3 + 1;
                    if (i3 == i7) {
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                int i = 2 % 2;
                int i2 = djBIcL + 33;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    TransferInputAddressFragment.copydefault(this.KWHzl, (java.util.ArrayList) obj);
                    java.lang.Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitCopydefault = TransferInputAddressFragment.copydefault(this.KWHzl, (java.util.ArrayList) obj);
                int i3 = copydefault + 35;
                djBIcL = i3 % 128;
                int i4 = i3 % 2;
                return unitCopydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [82=5] */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            /* JADX WARN: Removed duplicated region for block: B:54:0x0236  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x0237  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void a(char c, int i, int i2, java.lang.Object[] objArr) throws java.lang.Throwable {
                int i3;
                java.lang.Throwable cause;
                int i4 = 2 % 2;
                Zn zn = new Zn();
                long[] jArr = new long[i2];
                zn.EZpvd = 0;
                int i5 = $11 + 107;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                while (true) {
                    i3 = 1191971121;
                    if (zn.EZpvd >= i2) {
                        break;
                    }
                    int i7 = $11 + 103;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = zn.EZpvd;
                        try {
                            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(OLrzqt[i >> i8])};
                            java.lang.Object objEZpvd = YY.EZpvd(927695670);
                            if (objEZpvd == null) {
                                byte b = (byte) 0;
                                objEZpvd = YY.EZpvd(217, 4, (char) 0, 862670410, false, $$e(b, (byte) (b | 46), b), new java.lang.Class[]{java.lang.Integer.TYPE});
                            }
                            java.lang.Object[] objArr3 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(i8), java.lang.Long.valueOf(EZpvd), java.lang.Integer.valueOf(c)};
                            java.lang.Object objEZpvd2 = YY.EZpvd(-297691357);
                            if (objEZpvd2 == null) {
                                byte b2 = (byte) 0;
                                objEZpvd2 = YY.EZpvd(TypedValues.CycleType.TYPE_WAVE_PERIOD, 5, (char) 0, -362718625, false, $$e(b2, (byte) (b2 | 48), b2), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                            }
                            jArr[i8] = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).longValue();
                            java.lang.Object[] objArr4 = {zn, zn};
                            java.lang.Object objEZpvd3 = YY.EZpvd(1191971121);
                            if (objEZpvd3 == null) {
                                byte b3 = (byte) 0;
                                objEZpvd3 = YY.EZpvd(226, 4, (char) 0, 1127007309, false, $$e(b3, (byte) (b3 | 47), b3), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                            }
                            ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4);
                        } catch (java.lang.Throwable th) {
                            cause = th.getCause();
                            if (cause != null) {
                            }
                        }
                    } else {
                        int i9 = zn.EZpvd;
                        java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(OLrzqt[i + i9])};
                        java.lang.Object objEZpvd4 = YY.EZpvd(927695670);
                        if (objEZpvd4 == null) {
                            byte b4 = (byte) 0;
                            objEZpvd4 = YY.EZpvd(217, 4, (char) 0, 862670410, false, $$e(b4, (byte) (b4 | 46), b4), new java.lang.Class[]{java.lang.Integer.TYPE});
                        }
                        java.lang.Object[] objArr6 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5)).longValue()), java.lang.Long.valueOf(i9), java.lang.Long.valueOf(EZpvd), java.lang.Integer.valueOf(c)};
                        java.lang.Object objEZpvd5 = YY.EZpvd(-297691357);
                        if (objEZpvd5 == null) {
                            byte b5 = (byte) 0;
                            objEZpvd5 = YY.EZpvd(TypedValues.CycleType.TYPE_WAVE_PERIOD, 5, (char) 0, -362718625, false, $$e(b5, (byte) (b5 | 48), b5), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                        }
                        jArr[i9] = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd5).invoke(null, objArr6)).longValue();
                        java.lang.Object[] objArr7 = {zn, zn};
                        java.lang.Object objEZpvd6 = YY.EZpvd(1191971121);
                        if (objEZpvd6 == null) {
                            byte b6 = (byte) 0;
                            objEZpvd6 = YY.EZpvd(226, 4, (char) 0, 1127007309, false, $$e(b6, (byte) (b6 | 47), b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        }
                        ((java.lang.reflect.Method) objEZpvd6).invoke(null, objArr7);
                    }
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
                char[] cArr = new char[i2];
                zn.EZpvd = 0;
                int i10 = $10 + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 4 / 5;
                }
                while (zn.EZpvd < i2) {
                    int i12 = $11 + 13;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    cArr[zn.EZpvd] = (char) jArr[zn.EZpvd];
                    java.lang.Object[] objArr8 = {zn, zn};
                    java.lang.Object objEZpvd7 = YY.EZpvd(i3);
                    if (objEZpvd7 == null) {
                        byte b7 = (byte) 0;
                        objEZpvd7 = YY.EZpvd(226, 4, (char) 0, 1127007309, false, $$e(b7, (byte) (b7 | 47), b7), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) objEZpvd7).invoke(null, objArr8);
                    i3 = 1191971121;
                }
                objArr[0] = new java.lang.String(cArr);
            }

            /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [180=5] */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            private static void b(int[] iArr, boolean z, byte[] bArr, java.lang.Object[] objArr) throws java.lang.Throwable {
                int i = 2 % 2;
                Zk zk = new Zk();
                int i2 = iArr[0];
                int i3 = iArr[1];
                int i4 = iArr[2];
                int i5 = iArr[3];
                char[] cArr = AEQbTJ;
                if (cArr != null) {
                    int i6 = $10 + 59;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    for (int i8 = 0; i8 < length; i8++) {
                        try {
                            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i8])};
                            java.lang.Object objEZpvd = YY.EZpvd(-455689676);
                            if (objEZpvd == null) {
                                byte b = (byte) 0;
                                byte b2 = b;
                                objEZpvd = YY.EZpvd(398, 5, (char) 0, -520718520, false, $$e(b, b2, b2), new java.lang.Class[]{java.lang.Integer.TYPE});
                            }
                            cArr2[i8] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).charValue();
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr = cArr2;
                }
                char[] cArr3 = new char[i3];
                java.lang.System.arraycopy(cArr, i2, cArr3, 0, i3);
                if (bArr != null) {
                    int i9 = $11 + 109;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    char[] cArr4 = new char[i3];
                    zk.EZpvd = 0;
                    char c = 0;
                    while (zk.EZpvd < i3) {
                        if (bArr[zk.EZpvd] == 1) {
                            int i11 = zk.EZpvd;
                            try {
                                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr3[zk.EZpvd]), java.lang.Integer.valueOf(c)};
                                java.lang.Object objEZpvd2 = YY.EZpvd(-1969893699);
                                if (objEZpvd2 == null) {
                                    byte b3 = (byte) 0;
                                    byte b4 = (byte) (b3 + 1);
                                    objEZpvd2 = YY.EZpvd(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 4, (char) 0, -1900739647, false, $$e(b3, b4, (byte) (b4 - 1)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                                }
                                cArr4[i11] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).charValue();
                            } catch (java.lang.Throwable th2) {
                                java.lang.Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } else {
                            int i12 = zk.EZpvd;
                            java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr3[zk.EZpvd]), java.lang.Integer.valueOf(c)};
                            java.lang.Object objEZpvd3 = YY.EZpvd(1852960686);
                            if (objEZpvd3 == null) {
                                byte b5 = (byte) 0;
                                objEZpvd3 = YY.EZpvd(125, 4, (char) 0, 1783702226, false, $$e(b5, (byte) (b5 | 56), b5), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                            }
                            cArr4[i12] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4)).charValue();
                        }
                        c = cArr4[zk.EZpvd];
                        java.lang.Object[] objArr5 = {zk, zk};
                        java.lang.Object objEZpvd4 = YY.EZpvd(795576183);
                        if (objEZpvd4 == null) {
                            byte b6 = (byte) 0;
                            objEZpvd4 = YY.EZpvd(97, 4, (char) 0, 726354443, false, $$e(b6, (byte) (b6 | 7), b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        }
                        ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5);
                    }
                    cArr3 = cArr4;
                }
                if (i5 > 0) {
                    char[] cArr5 = new char[i3];
                    java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i3);
                    int i13 = i3 - i5;
                    java.lang.System.arraycopy(cArr5, 0, cArr3, i13, i5);
                    java.lang.System.arraycopy(cArr5, i5, cArr3, 0, i13);
                }
                if (z) {
                    int i14 = $10 + 117;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    char[] cArr6 = new char[i3];
                    zk.EZpvd = 0;
                    while (zk.EZpvd < i3) {
                        cArr6[zk.EZpvd] = cArr3[(i3 - zk.EZpvd) - 1];
                        zk.EZpvd++;
                    }
                    cArr3 = cArr6;
                }
                if (i4 > 0) {
                    int i16 = $11 + 77;
                    $10 = i16 % 128;
                    if (i16 % 2 != 0) {
                        zk.EZpvd = 1;
                    } else {
                        zk.EZpvd = 0;
                    }
                    while (zk.EZpvd < i3) {
                        cArr3[zk.EZpvd] = (char) (cArr3[zk.EZpvd] - iArr[2]);
                        zk.EZpvd++;
                    }
                }
                objArr[0] = new java.lang.String(cArr3);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            public static void KWHzl(long j, long j2) throws java.lang.Throwable {
                long j3;
                java.lang.Object obj;
                int i = 2 % 2;
                int i2 = djBIcL + 81;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    j3 = j % (j2 >>> 22);
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    a((char) 61673, 0, WalletImportError.ERROR_CODE_AA_EXIST, objArr);
                    obj = C44103sDl.class.getField((java.lang.String) objArr[0]).get(null);
                } else {
                    j3 = j ^ (j2 << 32);
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a((char) 61673, 0, 9, objArr2);
                    obj = C44103sDl.class.getField((java.lang.String) objArr2[0]).get(null);
                }
                int i3 = djBIcL + 95;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                try {
                    java.lang.reflect.Constructor declaredConstructor = java.lang.StringBuilder.class.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    java.lang.Object objNewInstance = declaredConstructor.newInstance(null);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a((char) 0, 9, 30, objArr3);
                    java.lang.String str = (java.lang.String) objArr3[0];
                    int i5 = copydefault + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
                    djBIcL = i5 % 128;
                    if (i5 % 2 == 0) {
                        java.lang.Object[] objArr4 = new java.lang.Object[0];
                        objArr4[0] = str;
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        a((char) 23953, 33, 94, objArr5);
                        java.lang.String str2 = (java.lang.String) objArr5[0];
                        java.lang.Class[] clsArr = new java.lang.Class[1];
                        clsArr[1] = java.lang.String.class;
                        java.lang.reflect.Method method = java.lang.StringBuilder.class.getMethod(str2, clsArr);
                        method.setAccessible(false);
                        method.invoke(objNewInstance, objArr4);
                    } else {
                        java.lang.Object[] objArr6 = {str};
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        a((char) 23953, 39, 6, objArr7);
                        java.lang.reflect.Method method2 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr7[0], java.lang.String.class);
                        method2.setAccessible(true);
                        method2.invoke(objNewInstance, objArr6);
                    }
                    java.lang.Object[] objArr8 = {java.lang.Long.valueOf(j3)};
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a((char) 23953, 39, 6, objArr9);
                    java.lang.reflect.Method method3 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr9[0], java.lang.Long.TYPE);
                    method3.setAccessible(true);
                    method3.invoke(objNewInstance, objArr8);
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    b(new int[]{0, 22, CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, 0}, true, new byte[]{0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1}, objArr10);
                    java.lang.String str3 = (java.lang.String) objArr10[0];
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    a((char) 26394, 45, 8, objArr11);
                    java.lang.reflect.Method method4 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr11[0], null);
                    method4.setAccessible(true);
                    java.lang.Object objInvoke = method4.invoke(objNewInstance, null);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    a((char) 0, 53, 3, objArr12);
                    java.lang.Object[] objArr13 = {objInvoke, (java.lang.String) objArr12[0]};
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    b(new int[]{22, 21, 93, 9}, true, null, objArr14);
                    java.lang.reflect.Method method5 = Intrinsics.class.getMethod((java.lang.String) objArr14[0], java.lang.Object.class, java.lang.String.class);
                    method5.setAccessible(true);
                    method5.invoke(null, objArr13);
                    if (!pUU.class.getField("AEQbTJ").getBoolean(null)) {
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        a((char) 0, 56, 23, objArr15);
                        java.lang.Object[] objArr16 = {((java.lang.String) objArr15[0]).toString()};
                        java.lang.reflect.Constructor declaredConstructor2 = java.lang.IllegalStateException.class.getDeclaredConstructor(java.lang.String.class);
                        declaredConstructor2.setAccessible(true);
                        throw ((java.lang.Throwable) declaredConstructor2.newInstance(objArr16));
                    }
                    java.lang.Object obj2 = pUU.class.getField("copydefault").get(null);
                    int i6 = copydefault + 91;
                    djBIcL = i6 % 128;
                    int i7 = i6 % 2;
                    java.lang.reflect.Method method6 = Intrinsics.class.getMethod("copydefault", java.lang.Object.class);
                    method6.setAccessible(true);
                    method6.invoke(null, obj2);
                    java.lang.Object[] objArr17 = {str3, objInvoke};
                    java.lang.reflect.Method method7 = pUP.class.getMethod("OLrzqt", java.lang.String.class, java.lang.String.class);
                    method7.setAccessible(true);
                    method7.invoke(obj2, objArr17);
                    int i8 = djBIcL + 59;
                    copydefault = i8 % 128;
                    int i9 = i8 % 2;
                    byte[] bArr = $$a;
                    byte b = (byte) (-bArr[6]);
                    byte b2 = b;
                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                    c(b, b2, b2, objArr18);
                    java.lang.reflect.Method method8 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr18[0], null);
                    method8.setAccessible(true);
                    java.lang.Object objInvoke2 = method8.invoke(obj, null);
                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                    a((char) 0, 79, 19, objArr19);
                    DetectionInfoBean.class.getField((java.lang.String) objArr19[0]).setBoolean(objInvoke2, true);
                    int i10 = djBIcL + 7;
                    copydefault = i10 % 128;
                    if (i10 % 2 != 0) {
                        byte b3 = (byte) (-bArr[6]);
                        byte b4 = b3;
                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                        c(b3, b4, b4, objArr20);
                        java.lang.reflect.Method method9 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr20[0], null);
                        method9.setAccessible(true);
                        java.lang.Object objInvoke3 = method9.invoke(obj, null);
                        java.lang.Long lValueOf = java.lang.Long.valueOf(j3);
                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                        a((char) 12086, 122, 83, objArr21);
                        DetectionInfoBean.class.getField((java.lang.String) objArr21[0]).set(objInvoke3, lValueOf);
                    } else {
                        byte b5 = (byte) (-bArr[6]);
                        byte b6 = b5;
                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                        c(b5, b6, b6, objArr22);
                        java.lang.reflect.Method method10 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr22[0], null);
                        method10.setAccessible(true);
                        java.lang.Object objInvoke4 = method10.invoke(obj, null);
                        java.lang.Long lValueOf2 = java.lang.Long.valueOf(j3);
                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                        a((char) 12086, 98, 9, objArr23);
                        DetectionInfoBean.class.getField((java.lang.String) objArr23[0]).set(objInvoke4, lValueOf2);
                    }
                    byte b7 = bArr[13];
                    byte b8 = b7;
                    java.lang.Object[] objArr24 = new java.lang.Object[1];
                    c(b7, b8, b8, objArr24);
                    java.lang.reflect.Method method11 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr24[0], null);
                    method11.setAccessible(true);
                    method11.invoke(obj, null);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }));
        isConnected().AhwBna().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.gGP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransferInputAddressFragment.EZpvd(this.AEQbTJ, (C19577gHn) obj);
            }
        }));
        Bundle arguments = getArguments();
        if ((arguments != null ? (TransactionInfo) arguments.getParcelable("send_scan_info") : null) != null) {
            isConnected().AEQbTJ(true);
            C16605enA c16605enA = this.values;
            if (c16605enA == null) {
                Intrinsics.gEmmrt("");
                c16605enA = null;
            }
            c16605enA.isConnected.setVisibility(8);
            gEmmrt().setVisibility(8);
        } else {
            isConnected().AEQbTJ(false);
            gEmmrt().setVisibility(0);
        }
        getFieldNames();
        view.setOnApplyWindowInsetsListener(new Activity());
        C16605enA c16605enA2 = this.values;
        if (c16605enA2 == null) {
            Intrinsics.gEmmrt("");
            c16605enA2 = null;
        }
        c16605enA2.AuCTel.setImeOptions(6);
        C16605enA c16605enA3 = this.values;
        if (c16605enA3 == null) {
            Intrinsics.gEmmrt("");
            c16605enA3 = null;
        }
        c16605enA3.AuCTel.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.gGN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
                return TransferInputAddressFragment.KWHzl(this.OLrzqt, textView, i, keyEvent);
            }
        });
        getNewProxyInstance();
        C32866mlf.onEvent$default("SendToAddress_Btm_Page_View", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
    }

    public static final Unit KWHzl(final TransferInputAddressFragment transferInputAddressFragment, C19589gHz.StateListAnimator stateListAnimator) {
        if (stateListAnimator == null) {
            return Unit.INSTANCE;
        }
        transferInputAddressFragment.dismissLoading();
        C16605enA c16605enA = transferInputAddressFragment.values;
        if (c16605enA == null) {
            Intrinsics.gEmmrt("");
            c16605enA = null;
        }
        c16605enA.AuCTel.setPasteListener(new Function0() { // from class: o.gGC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TransferInputAddressFragment.fetchVPNInfo(this.OLrzqt);
            }
        });
        C16605enA c16605enA2 = transferInputAddressFragment.values;
        if (c16605enA2 == null) {
            Intrinsics.gEmmrt("");
            c16605enA2 = null;
        }
        if (String.valueOf(c16605enA2.AuCTel.getText()).length() == 0) {
            C16605enA c16605enA3 = transferInputAddressFragment.values;
            if (c16605enA3 == null) {
                Intrinsics.gEmmrt("");
                c16605enA3 = null;
            }
            c16605enA3.djBIcL.postDelayed(new Runnable() { // from class: o.gGG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    TransferInputAddressFragment.values(this.copydefault);
                }
            }, 500L);
        } else {
            transferInputAddressFragment.isConnected().AEQbTJ(true);
            C16605enA c16605enA4 = transferInputAddressFragment.values;
            if (c16605enA4 == null) {
                Intrinsics.gEmmrt("");
                c16605enA4 = null;
            }
            c16605enA4.isConnected.setVisibility(8);
            transferInputAddressFragment.gEmmrt().setVisibility(8);
        }
        if (stateListAnimator.AEQbTJ()) {
            transferInputAddressFragment.isConnected().KWHzl(false);
            C10854bwM coinMeta = stateListAnimator.OLrzqt().getCoinMeta();
            transferInputAddressFragment.EZpvd(coinMeta.fJNWhG());
            if (coinMeta.AuCTel()) {
                transferInputAddressFragment.AEQbTJ(coinMeta.djBIcL());
            } else {
                transferInputAddressFragment.AEQbTJ(coinMeta.dNCPSb());
            }
            transferInputAddressFragment.AEQbTJ(coinMeta);
            if (stateListAnimator.OLrzqt().getWallet().getFieldNames()) {
                transferInputAddressFragment.OLrzqt(new Function0() { // from class: o.gGH
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return TransferInputAddressFragment.AkhnZx(this.copydefault);
                    }
                });
            }
            rVN.reportFullyDrawn$default((Fragment) transferInputAddressFragment, true, (String) null, 2, (Object) null);
        } else {
            transferInputAddressFragment.AEQbTJ((C10854bwM) null);
            if (stateListAnimator.EZpvd()) {
                boolean zCopydefault = stateListAnimator.copydefault();
                String strKWHzl = stateListAnimator.KWHzl();
                transferInputAddressFragment.copydefault(zCopydefault, strKWHzl != null ? strKWHzl : "");
            }
            rVN.reportFullyDrawn$default((Fragment) transferInputAddressFragment, false, (String) null, 2, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(TransferInputAddressFragment transferInputAddressFragment) {
        C16605enA c16605enA = transferInputAddressFragment.values;
        C16605enA c16605enA2 = null;
        if (c16605enA == null) {
            Intrinsics.gEmmrt("");
            c16605enA = null;
        }
        Context context = c16605enA.AuCTel.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C16605enA c16605enA3 = transferInputAddressFragment.values;
        if (c16605enA3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16605enA2 = c16605enA3;
        }
        C33054mpH.OLrzqt(context, c16605enA2.AuCTel);
        return Unit.INSTANCE;
    }

    public static final void values(TransferInputAddressFragment transferInputAddressFragment) {
        ArrayList<C19574gHk> value = transferInputAddressFragment.isConnected().OLrzqt().getValue();
        if (value == null || !value.isEmpty() || transferInputAddressFragment.isConnected().copydefault()) {
            return;
        }
        C16605enA c16605enA = transferInputAddressFragment.values;
        if (c16605enA == null) {
            Intrinsics.gEmmrt("");
            c16605enA = null;
        }
        C14784drw c14784drw = c16605enA.AuCTel;
        Intrinsics.checkNotNullExpressionValue(c14784drw, "");
        transferInputAddressFragment.EZpvd((EditText) c14784drw);
    }

    public static final Unit AkhnZx(TransferInputAddressFragment transferInputAddressFragment) {
        transferInputAddressFragment.AYXKKw("infoicon");
        fPH fph = fPH.OLrzqt;
        androidx.fragment.app.FragmentManager childFragmentManager = transferInputAddressFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        fph.EZpvd(childFragmentManager, 1, C33070mpX.AYXKKw(C13754dXa.FragmentManager.InspectablePropertyValueType), C33070mpX.AYXKKw(C13754dXa.FragmentManager.LongDef), null, (32 & 32) != 0 ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.getNotifyChildrenChangedOptions) : null, new Function0() { // from class: o.gGl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TransferInputAddressFragment.djBIcL();
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL() {
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(TransferInputAddressFragment transferInputAddressFragment, ArrayList arrayList) {
        if (arrayList == null) {
            return Unit.INSTANCE;
        }
        C16605enA c16605enA = null;
        if (arrayList.isEmpty()) {
            C16605enA c16605enA2 = transferInputAddressFragment.values;
            if (c16605enA2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16605enA = c16605enA2;
            }
            c16605enA.djBIcL.setVisibility(0);
            transferInputAddressFragment.gEmmrt().setVisibility(8);
        } else {
            List<C19579gHp> listEZpvd = transferInputAddressFragment.isConnected().EZpvd((ArrayList<C19574gHk>) arrayList);
            C16605enA c16605enA3 = transferInputAddressFragment.values;
            if (c16605enA3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16605enA = c16605enA3;
            }
            c16605enA.djBIcL.setVisibility(8);
            transferInputAddressFragment.valueOf();
            transferInputAddressFragment.EZpvd(listEZpvd);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(TransferInputAddressFragment transferInputAddressFragment, C19577gHn c19577gHn) {
        if (c19577gHn == null) {
            return Unit.INSTANCE;
        }
        transferInputAddressFragment.AEQbTJ(c19577gHn);
        return Unit.INSTANCE;
    }

    public static final class Activity implements View.OnApplyWindowInsetsListener {
        public int AEQbTJ;

        public Activity() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(windowInsets, "");
            int i = WindowInsetsCompat.toWindowInsetsCompat(windowInsets).getInsets(WindowInsetsCompat.Type.ime()).bottom;
            if (this.AEQbTJ == i) {
                return windowInsets;
            }
            this.AEQbTJ = i;
            boolean z = i > 0;
            if (!TransferInputAddressFragment.this.isConnected().djBIcL()) {
                TransferInputAddressFragment.this.isConnected().copydefault(z);
                C16605enA c16605enA = TransferInputAddressFragment.this.values;
                C16605enA c16605enA2 = null;
                if (c16605enA == null) {
                    Intrinsics.gEmmrt("");
                    c16605enA = null;
                }
                ViewGroup.LayoutParams layoutParams = c16605enA.isConnected.getLayoutParams();
                if (z) {
                    layoutParams.height = i;
                } else {
                    layoutParams.height = 5;
                    C16605enA c16605enA3 = TransferInputAddressFragment.this.values;
                    if (c16605enA3 == null) {
                        Intrinsics.gEmmrt("");
                        c16605enA3 = null;
                    }
                    c16605enA3.AuCTel.clearFocus();
                }
                C16605enA c16605enA4 = TransferInputAddressFragment.this.values;
                if (c16605enA4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c16605enA2 = c16605enA4;
                }
                c16605enA2.isConnected.setLayoutParams(layoutParams);
                TransferInputAddressFragment.this.AhwBna();
            }
            TransferInputAddressFragment.this.fARcdN();
            TransferInputAddressFragment.this.valueOf();
            return windowInsets;
        }
    }

    public static final boolean KWHzl(TransferInputAddressFragment transferInputAddressFragment, TextView textView, int i, KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 1) {
            return true;
        }
        C16605enA c16605enA = transferInputAddressFragment.values;
        C16605enA c16605enA2 = null;
        if (c16605enA == null) {
            Intrinsics.gEmmrt("");
            c16605enA = null;
        }
        Context context = c16605enA.AuCTel.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C16605enA c16605enA3 = transferInputAddressFragment.values;
        if (c16605enA3 == null) {
            Intrinsics.gEmmrt("");
            c16605enA3 = null;
        }
        C33054mpH.OLrzqt(context, c16605enA3.AuCTel);
        C16605enA c16605enA4 = transferInputAddressFragment.values;
        if (c16605enA4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16605enA2 = c16605enA4;
        }
        c16605enA2.AuCTel.clearFocus();
        transferInputAddressFragment.isConnected().OLrzqt(false);
        transferInputAddressFragment.fARcdN();
        transferInputAddressFragment.valueOf();
        return false;
    }

    public final void OLrzqt(Function0<Unit> function0) {
        C16605enA c16605enA = this.values;
        if (c16605enA == null) {
            Intrinsics.gEmmrt("");
            c16605enA = null;
        }
        ImageView imageView = c16605enA.valueOf;
        Intrinsics.copydefault(imageView);
        imageView.setVisibility(0);
        imageView.setOnClickListener(new FragmentManager(imageView, 1000L, function0));
    }

    private final void fIwbmz() {
        C16605enA c16605enA = this.values;
        C16605enA c16605enA2 = null;
        if (c16605enA == null) {
            Intrinsics.gEmmrt("");
            c16605enA = null;
        }
        C52794wYp c52794wYp = c16605enA.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        C19604gIn.KWHzl(c52794wYp, 16, (28 & 2) != 0 ? 0 : C52761wXj.TaskDescription.ZxnNGp, (28 & 4) != 0 ? 0 : 0, (28 & 8) != 0 ? 0 : 0, (28 & 16) != 0 ? 0 : 0);
        C16605enA c16605enA3 = this.values;
        if (c16605enA3 == null) {
            Intrinsics.gEmmrt("");
            c16605enA3 = null;
        }
        C52794wYp c52794wYp2 = c16605enA3.copydefault;
        Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
        C19604gIn.KWHzl(c52794wYp2, 16, (28 & 2) != 0 ? 0 : C52761wXj.TaskDescription.dTTfOR, (28 & 4) != 0 ? 0 : 0, (28 & 8) != 0 ? 0 : 0, (28 & 16) != 0 ? 0 : 0);
        C16605enA c16605enA4 = this.values;
        if (c16605enA4 == null) {
            Intrinsics.gEmmrt("");
            c16605enA4 = null;
        }
        ConstraintLayout constraintLayout = c16605enA4.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = C33570myu.gEmmrt(requireContext());
            constraintLayout.setLayoutParams(marginLayoutParams);
            C16605enA c16605enA5 = this.values;
            if (c16605enA5 == null) {
                Intrinsics.gEmmrt("");
                c16605enA5 = null;
            }
            c16605enA5.AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: o.gGd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    TransferInputAddressFragment.EZpvd(this.AEQbTJ, view);
                }
            });
            C16605enA c16605enA6 = this.values;
            if (c16605enA6 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16605enA2 = c16605enA6;
            }
            c16605enA2.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.gGe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    TransferInputAddressFragment.OLrzqt(this.copydefault, view);
                }
            });
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final void EZpvd(TransferInputAddressFragment transferInputAddressFragment, View view) {
        FragmentActivity activity = transferInputAddressFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    public static final void OLrzqt(TransferInputAddressFragment transferInputAddressFragment, View view) {
        transferInputAddressFragment.AYXKKw(Web3SecurityTrackEvent.VALUE_PASTE);
        C14494dmX.KWHzl.EZpvd("SendToAddress_Btm_Button_Click", Web3SecurityTrackEvent.VALUE_PASTE);
        C16605enA c16605enA = null;
        if (!transferInputAddressFragment.isConnected().valueOf()) {
            C16605enA c16605enA2 = transferInputAddressFragment.values;
            if (c16605enA2 == null) {
                Intrinsics.gEmmrt("");
                c16605enA2 = null;
            }
            c16605enA2.fJNWhG.setVisibility(8);
            C16605enA c16605enA3 = transferInputAddressFragment.values;
            if (c16605enA3 == null) {
                Intrinsics.gEmmrt("");
                c16605enA3 = null;
            }
            c16605enA3.AuCTel.requestFocus();
            C16605enA c16605enA4 = transferInputAddressFragment.values;
            if (c16605enA4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16605enA = c16605enA4;
            }
            C14784drw c14784drw = c16605enA.AuCTel;
            Intrinsics.checkNotNullExpressionValue(c14784drw, "");
            transferInputAddressFragment.EZpvd((EditText) c14784drw);
            return;
        }
        String strKWHzl = transferInputAddressFragment.isConnected().KWHzl();
        if (strKWHzl != null) {
            C16605enA c16605enA5 = transferInputAddressFragment.values;
            if (c16605enA5 == null) {
                Intrinsics.gEmmrt("");
                c16605enA5 = null;
            }
            c16605enA5.AuCTel.setText(strKWHzl);
            C16605enA c16605enA6 = transferInputAddressFragment.values;
            if (c16605enA6 == null) {
                Intrinsics.gEmmrt("");
                c16605enA6 = null;
            }
            c16605enA6.fJNWhG.setVisibility(8);
            C16605enA c16605enA7 = transferInputAddressFragment.values;
            if (c16605enA7 == null) {
                Intrinsics.gEmmrt("");
                c16605enA7 = null;
            }
            c16605enA7.AuCTel.clearFocus();
            Context contextRequireContext = transferInputAddressFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C16605enA c16605enA8 = transferInputAddressFragment.values;
            if (c16605enA8 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16605enA = c16605enA8;
            }
            C33054mpH.OLrzqt(contextRequireContext, c16605enA.AuCTel);
            transferInputAddressFragment.fARcdN();
            transferInputAddressFragment.valueOf();
        }
    }

    public final void AkhnZx(String str) {
        printLog$default(this, "verifyAddress: " + str, null, 2, null);
        this.AuCTel = -1;
        this.ejfBZ = str;
        djBIcL(true);
        if (str.length() == 0) {
            this.ejfBZ = "";
            setToAddressErrInfo$default(this, false, null, 2, null);
            djBIcL(false);
        } else if (copydefault(str)) {
            checkDomainAddress$default(this, str, false, 2, null);
        } else if (djBIcL(str)) {
            checkNearAddress$default(this, str, false, 2, null);
        } else if (valueOf(str)) {
            OLrzqt(str);
        } else if (gEmmrt(str)) {
            KWHzl(str);
        } else {
            printLog$default(this, "by pass address: " + str, null, 2, null);
            values();
            djBIcL(false);
            fARcdN();
            valueOf();
        }
        isConnected().AhwBna(str);
    }

    private final void EZpvd(final List<C19579gHp> list) {
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        this.getNewProxyInstance = new C19580gHq(childFragmentManager, lifecycle, list);
        C16605enA c16605enA = this.values;
        C16605enA c16605enA2 = null;
        if (c16605enA == null) {
            Intrinsics.gEmmrt("");
            c16605enA = null;
        }
        c16605enA.fetchVPNInfo.setAdapter(this.getNewProxyInstance);
        C16605enA c16605enA3 = this.values;
        if (c16605enA3 == null) {
            Intrinsics.gEmmrt("");
            c16605enA3 = null;
        }
        TabLayout tabLayout = c16605enA3.gEmmrt;
        C16605enA c16605enA4 = this.values;
        if (c16605enA4 == null) {
            Intrinsics.gEmmrt("");
            c16605enA4 = null;
        }
        new TabLayoutMediator(tabLayout, c16605enA4.fetchVPNInfo, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.gGo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                TransferInputAddressFragment.AEQbTJ(list, tab, i);
            }
        }).attach();
        C16605enA c16605enA5 = this.values;
        if (c16605enA5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16605enA2 = c16605enA5;
        }
        c16605enA2.gEmmrt.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new ActionBar());
    }

    public static final void AEQbTJ(List list, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(((C19579gHp) list.get(i)).OLrzqt());
        tab.setTag(((C19579gHp) list.get(i)).EZpvd());
    }

    public static final class ActionBar implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public ActionBar() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab != null) {
                TransferInputAddressFragment transferInputAddressFragment = TransferInputAddressFragment.this;
                Object tag = tab.getTag();
                if (Intrinsics.EZpvd(tag, (Object) SendCoinGroup.RECENT.getGroup())) {
                    transferInputAddressFragment.AYXKKw("recently");
                } else if (Intrinsics.EZpvd(tag, (Object) SendCoinGroup.ADDRESS_BOOKS.getGroup())) {
                    transferInputAddressFragment.AYXKKw("addressbooks");
                } else if (Intrinsics.EZpvd(tag, (Object) SendCoinGroup.MY_WALLET.getGroup())) {
                    transferInputAddressFragment.AYXKKw("mywallet");
                }
            }
        }
    }

    public final void AEQbTJ(C19577gHn c19577gHn) {
        if (C33129mqd.OLrzqt((CharSequence) c19577gHn.OLrzqt())) {
            C43453rpa c43453rpa = C43453rpa.AEQbTJ;
            Context context = getContext();
            if (context == null) {
                return;
            }
            if (!c43453rpa.KWHzl(context)) {
                C55326xho.toast$default(C13754dXa.FragmentManager.INotificationSideChannelStub, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                return;
            }
            showLoadingAtOnce();
            this.DbNXlk = c19577gHn.copydefault();
            this.AuCTel = c19577gHn.AEQbTJ();
            final String strOLrzqt = c19577gHn.OLrzqt();
            this.ejfBZ = strOLrzqt;
            printLog$default(this, "addressItemSelected. item: " + c19577gHn, null, 2, null);
            AEQbTJ(strOLrzqt, new Function1() { // from class: o.gGf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return TransferInputAddressFragment.OLrzqt(this.OLrzqt, (TransferInputAddressFragment.StateListAnimator.TaskDescription) obj);
                }
            }, new Function1() { // from class: o.gGc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return TransferInputAddressFragment.EZpvd(this.OLrzqt, (TransferInputAddressFragment.StateListAnimator.ActionBar) obj);
                }
            }, new Function1() { // from class: o.gGg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return TransferInputAddressFragment.copydefault(this.copydefault, (TransferInputAddressFragment.StateListAnimator.Application) obj);
                }
            }, new Function1() { // from class: o.gGh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return TransferInputAddressFragment.OLrzqt(this.AEQbTJ, strOLrzqt, (TransferInputAddressFragment.StateListAnimator.TaskDescription) obj);
                }
            });
        }
    }

    public static final Unit OLrzqt(TransferInputAddressFragment transferInputAddressFragment, StateListAnimator.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        transferInputAddressFragment.dismissLoading();
        setToAddressTipInfo$default(transferInputAddressFragment, false, null, 2, null);
        transferInputAddressFragment.isConnected().AEQbTJ(true);
        transferInputAddressFragment.isConnected().OLrzqt(false);
        transferInputAddressFragment.ejfBZ = taskDescription.AEQbTJ();
        if (taskDescription.KWHzl() == ValidateAddressType.DOMAIN_ADDRESS) {
            transferInputAddressFragment.isConnected = taskDescription.AEQbTJ();
        }
        if (taskDescription.KWHzl() == ValidateAddressType.NEAR) {
            transferInputAddressFragment.isConnected().EZpvd(true);
        }
        transferInputAddressFragment.AhwBna(taskDescription.AEQbTJ());
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(TransferInputAddressFragment transferInputAddressFragment, StateListAnimator.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        transferInputAddressFragment.dismissLoading();
        setToAddressTipInfo$default(transferInputAddressFragment, false, null, 2, null);
        printLog$default(transferInputAddressFragment, "addressItemSelected doIfInValid. type: " + actionBar.copydefault() + ", err: " + actionBar.AEQbTJ(), null, 2, null);
        C55326xho.toast$default(actionBar.AEQbTJ(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(TransferInputAddressFragment transferInputAddressFragment, StateListAnimator.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        transferInputAddressFragment.EZpvd("addressItemSelected doIfException. type: " + application.AEQbTJ(), application.OLrzqt());
        String strCopydefault = application.copydefault();
        if (strCopydefault != null) {
            C55326xho.toast$default(strCopydefault, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        }
        transferInputAddressFragment.dismissLoading();
        setToAddressTipInfo$default(transferInputAddressFragment, false, null, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(TransferInputAddressFragment transferInputAddressFragment, String str, StateListAnimator.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        transferInputAddressFragment.dismissLoading();
        C16605enA c16605enA = transferInputAddressFragment.values;
        C16605enA c16605enA2 = null;
        if (c16605enA == null) {
            Intrinsics.gEmmrt("");
            c16605enA = null;
        }
        c16605enA.AuCTel.setText(str);
        C16605enA c16605enA3 = transferInputAddressFragment.values;
        if (c16605enA3 == null) {
            Intrinsics.gEmmrt("");
            c16605enA3 = null;
        }
        c16605enA3.AuCTel.clearFocus();
        C16605enA c16605enA4 = transferInputAddressFragment.values;
        if (c16605enA4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16605enA2 = c16605enA4;
        }
        c16605enA2.AuCTel.setSelection(str.length());
        transferInputAddressFragment.isConnected().AEQbTJ(true);
        transferInputAddressFragment.isConnected().OLrzqt(false);
        transferInputAddressFragment.OLrzqt(true, C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImpl3));
        return Unit.INSTANCE;
    }

    public final void AYXKKw(final String str) {
        C32866mlf.onEvent$default("Web3RecieveAddress_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.gGR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransferInputAddressFragment.copydefault(str, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    public static final Unit copydefault(String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        return Unit.INSTANCE;
    }

    public final boolean values() {
        isConnected().AEQbTJ(checkToAddress$default(this, false, null, 2, null));
        C16605enA c16605enA = this.values;
        if (c16605enA == null) {
            Intrinsics.gEmmrt("");
            c16605enA = null;
        }
        if (String.valueOf(c16605enA.AuCTel.getText()).length() == 0) {
            isConnected().AEQbTJ(false);
            setToAddressErrInfo$default(this, false, null, 2, null);
        }
        return isConnected().AYXKKw();
    }

    public final boolean AkhnZx() {
        String string;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("coinId")) == null) {
            string = MultiTransferSignData.DEFAULT_INTERVAL;
        }
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(Long.valueOf(Long.parseLong(string)));
        return c10854bwMKWHzl != null && c10854bwMKWHzl.hUfVAv();
    }

    private final boolean iwGUEr() {
        String string;
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("coinId")) != null) {
            if (Long.parseLong(string) < 0) {
                return true;
            }
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(Long.valueOf(Long.parseLong(string)));
            if (c10854bwMKWHzl != null) {
                return c10854bwMKWHzl.uzCIH();
            }
        }
        return false;
    }

    private final void getFieldNames() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            showLoadingAtOnceCannotCancel();
            C19589gHz c19589gHzIsConnected = isConnected();
            String string = arguments.getString("wallet_id");
            String str = string == null ? "" : string;
            String string2 = arguments.getString("from_address");
            String str2 = string2 == null ? "" : string2;
            String string3 = arguments.getString("coinId");
            c19589gHzIsConnected.OLrzqt(this, str, str2, string3 == null ? "" : string3, (TransactionInfo) arguments.getParcelable("send_scan_info"), iwGUEr(), 1);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C16605enA c16605enA = null;
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        int i = C13754dXa.ActionBar.getName;
        if (numValueOf != null && numValueOf.intValue() == i) {
            AYXKKw("scan");
            C14494dmX.KWHzl.EZpvd("SendToAddress_Btm_Button_Click", "scan");
            C19589gHz.StateListAnimator value = isConnected().gEmmrt().getValue();
            if (value == null || !value.AEQbTJ() || getActivity() == null) {
                return;
            }
            this.fJNWhG.launch(Unit.INSTANCE);
            return;
        }
        int i2 = C13754dXa.ActionBar.fruYXx;
        if (numValueOf != null && numValueOf.intValue() == i2) {
            AYXKKw(RequestParameters.SUBRESOURCE_DELETE);
            C16605enA c16605enA2 = this.values;
            if (c16605enA2 == null) {
                Intrinsics.gEmmrt("");
                c16605enA2 = null;
            }
            c16605enA2.AuCTel.setText("");
            C16605enA c16605enA3 = this.values;
            if (c16605enA3 == null) {
                Intrinsics.gEmmrt("");
                c16605enA3 = null;
            }
            c16605enA3.fJNWhG.setText("");
            C16605enA c16605enA4 = this.values;
            if (c16605enA4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16605enA = c16605enA4;
            }
            c16605enA.fJNWhG.setVisibility(8);
            isConnected().AEQbTJ(false);
            AhwBna();
        }
    }

    private final void getNewProxyInstance() {
        C16605enA c16605enA = this.values;
        if (c16605enA == null) {
            Intrinsics.gEmmrt("");
            c16605enA = null;
        }
        AbstractC58247yxg<Object> abstractC58247yxgThrottleFirst = C8003auW.copydefault(c16605enA.djBIcL).throttleFirst(1L, TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst, "");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C58156yvv.OLrzqt(abstractC58247yxgThrottleFirst, viewLifecycleOwner, Lifecycle.Event.ON_DESTROY).subscribe(new InterfaceC58227yxM() { // from class: o.gGb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                TransferInputAddressFragment.AEQbTJ(this.OLrzqt, obj);
            }
        });
    }

    public static final void AEQbTJ(TransferInputAddressFragment transferInputAddressFragment, Object obj) {
        transferInputAddressFragment.AYXKKw(Web3SecurityTrackEvent.VALUE_CONFIRM);
        C16605enA c16605enA = transferInputAddressFragment.values;
        if (c16605enA == null) {
            Intrinsics.gEmmrt("");
            c16605enA = null;
        }
        Editable text = c16605enA.AuCTel.getText();
        transferInputAddressFragment.AhwBna(text != null ? text.toString() : null);
    }

    public final void AhwBna(String str) {
        if (!AEQbTJ(true, str)) {
            AYXKKw(false);
            return;
        }
        OkTransactionWallet okTransactionWalletEZpvd = isConnected().EZpvd();
        if (okTransactionWalletEZpvd == null) {
            return;
        }
        AEQbTJ(okTransactionWalletEZpvd);
    }

    public final void AEQbTJ(final OkTransactionWallet okTransactionWallet) {
        showLoadingAtOnceCannotCancel();
        Boolean boolAEQbTJ = isConnected().AEQbTJ(this.ejfBZ, this.DbNXlk);
        if (boolAEQbTJ == null) {
            InterfaceC58217yxC interfaceC58217yxC = this.valueOf;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            this.valueOf = isConnected().KWHzl(this.ejfBZ, new Function2() { // from class: o.gGS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return TransferInputAddressFragment.OLrzqt(this.OLrzqt, okTransactionWallet, (java.lang.Boolean) obj, (java.lang.String) obj2);
                }
            });
            return;
        }
        copydefault(okTransactionWallet, boolAEQbTJ.booleanValue());
    }

    public static final Unit OLrzqt(TransferInputAddressFragment transferInputAddressFragment, OkTransactionWallet okTransactionWallet, Boolean bool, String str) {
        if (bool == null) {
            transferInputAddressFragment.dismissLoading();
            C55326xho.toast$default(str, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        } else {
            transferInputAddressFragment.copydefault(okTransactionWallet, bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(final OkTransactionWallet okTransactionWallet, final boolean z) {
        boolean zDarRvM = okTransactionWallet.getCoinMeta().DarRvM();
        if (z && zDarRvM) {
            dismissLoading();
            KWHzl(true, C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultKt));
            return;
        }
        InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX<List<TxToastCheckRes>> abstractC58185ywXAkhnZx = isConnected().AkhnZx(this.ejfBZ);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(abstractC58185ywXAkhnZx, viewLifecycleOwner, Lifecycle.Event.ON_DESTROY);
        final Function1 function1 = new Function1() { // from class: o.gFM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransferInputAddressFragment.KWHzl(this.AEQbTJ, okTransactionWallet, z, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gFL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                TransferInputAddressFragment.uzCIH(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gFX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransferInputAddressFragment.EZpvd(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        this.AEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gGi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                TransferInputAddressFragment.hDKMBd(function12, obj);
            }
        });
    }

    public static final void uzCIH(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(final TransferInputAddressFragment transferInputAddressFragment, final OkTransactionWallet okTransactionWallet, final boolean z, final List list) {
        transferInputAddressFragment.dismissLoading();
        FragmentActivity activity = transferInputAddressFragment.getActivity();
        if (activity == null) {
            return Unit.INSTANCE;
        }
        androidx.fragment.app.FragmentManager childFragmentManager = transferInputAddressFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        TxToastCheckHelper.StateListAnimator stateListAnimator = new TxToastCheckHelper.StateListAnimator(okTransactionWallet.getAddress(), transferInputAddressFragment.ejfBZ, okTransactionWallet.getCoinMeta(), true);
        Intrinsics.copydefault(list);
        TxToastCheckHelper.startCheck$default(new TxToastCheckHelper(activity, childFragmentManager, stateListAnimator, list, new yHO() { // from class: o.gGM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return TransferInputAddressFragment.OLrzqt(this.EZpvd, list, z, okTransactionWallet, (TxToastCheckRes) obj, (java.lang.Boolean) obj2, (java.lang.Boolean) obj3);
            }
        }), false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(final TransferInputAddressFragment transferInputAddressFragment, List list, boolean z, OkTransactionWallet okTransactionWallet, TxToastCheckRes txToastCheckRes, Boolean bool, Boolean bool2) {
        String string;
        Object obj;
        int i;
        int iOrdinal;
        boolean z2;
        Intent intentKWHzl;
        AbstractC12782ctV wallet;
        String string2;
        C10854bwM coinMeta;
        C10854bwM coinMeta2;
        if (txToastCheckRes == null && Intrinsics.EZpvd(bool, Boolean.TRUE)) {
            if (transferInputAddressFragment.AkhnZx()) {
                C33489mxS c33489mxS = C33489mxS.KWHzl;
                KSerializer<OkUTXOTransaction.InitArgs> kSerializerSerializer = OkUTXOTransaction.InitArgs.Companion.serializer();
                Bundle arguments = transferInputAddressFragment.getArguments();
                String string3 = arguments != null ? arguments.getString("init_Args_json") : null;
                if (string3 == null) {
                    string3 = "";
                }
                OkUTXOTransaction.InitArgs initArgs = (OkUTXOTransaction.InitArgs) c33489mxS.OLrzqt((DeserializationStrategy) kSerializerSerializer, string3);
                fXY.Application application = fXY.Companion;
                Context context = transferInputAddressFragment.getContext();
                if (context == null) {
                    return Unit.INSTANCE;
                }
                Bundle arguments2 = transferInputAddressFragment.getArguments();
                String string4 = arguments2 != null ? arguments2.getString("wallet_id") : null;
                String str = string4 == null ? "" : string4;
                long jAuCTel = transferInputAddressFragment.AuCTel();
                Bundle arguments3 = transferInputAddressFragment.getArguments();
                long jValueOf = C33129mqd.valueOf(arguments3 != null ? arguments3.getString("coinId") : null);
                Bundle arguments4 = transferInputAddressFragment.getArguments();
                String string5 = arguments4 != null ? arguments4.getString("from_address", "") : null;
                String str2 = string5 == null ? "" : string5;
                String str3 = transferInputAddressFragment.ejfBZ;
                OkTransactionWallet okTransactionWalletEZpvd = transferInputAddressFragment.isConnected().EZpvd();
                Integer numQbewEr = (okTransactionWalletEZpvd == null || (coinMeta2 = okTransactionWalletEZpvd.getCoinMeta()) == null) ? null : coinMeta2.QbewEr();
                List<FixedUTXOInfo> batchBean = initArgs.getBatchBean();
                if (batchBean == null) {
                    batchBean = yDY.AhwBna();
                }
                FixedUTXOSignData fixedUTXOSignData = new FixedUTXOSignData(jValueOf, str3, str2, "", false, false, null, batchBean, "53", numQbewEr, new Gson().toJson(initArgs.getUtxoList()), WalletImportError.ERROR_CODE_AA_EXIST, null);
                Bundle arguments5 = transferInputAddressFragment.getArguments();
                TransactionInfo transactionInfo = arguments5 != null ? (TransactionInfo) arguments5.getParcelable("send_scan_info") : null;
                if (!(transactionInfo instanceof TransactionInfo)) {
                    transactionInfo = null;
                }
                fixedUTXOSignData.setCurrencyIsoCode(transactionInfo != null ? transactionInfo.getCurrency() : null);
                Unit unit = Unit.INSTANCE;
                Intrinsics.copydefault(list);
                intentKWHzl = application.OLrzqt(context, new SignDataArgs<>(str, null, jAuCTel, fixedUTXOSignData, null, null, null, null, null, null, 1, 11, null, 0, null, null, null, false, false, transferInputAddressFragment.copydefault((List<TxToastCheckRes>) list), false, false, false, false, 16241650, null), transferInputAddressFragment.isConnected().AEQbTJ(transferInputAddressFragment.ejfBZ, transferInputAddressFragment.AuCTel, transferInputAddressFragment.DbNXlk), transferInputAddressFragment.isConnected().valueOf(transferInputAddressFragment.ejfBZ), transferInputAddressFragment.isConnected().djBIcL(transferInputAddressFragment.ejfBZ), z, transferInputAddressFragment.isConnected);
            } else {
                ActivityC20795gnd.Application application2 = ActivityC20795gnd.Companion;
                Context context2 = transferInputAddressFragment.getContext();
                if (context2 == null) {
                    return Unit.INSTANCE;
                }
                Bundle arguments6 = transferInputAddressFragment.getArguments();
                if (arguments6 == null || (string = arguments6.getString("wallet_id")) == null) {
                    string = "";
                }
                Bundle arguments7 = transferInputAddressFragment.getArguments();
                String string6 = arguments7 != null ? arguments7.getString("coinId") : null;
                Bundle arguments8 = transferInputAddressFragment.getArguments();
                TransactionInfo transactionInfo2 = arguments8 != null ? (TransactionInfo) arguments8.getParcelable("send_scan_info") : null;
                Bundle arguments9 = transferInputAddressFragment.getArguments();
                String string7 = arguments9 != null ? arguments9.getString("from") : null;
                String str4 = string7 == null ? "" : string7;
                String strAEQbTJ = transferInputAddressFragment.isConnected().AEQbTJ(transferInputAddressFragment.ejfBZ, transferInputAddressFragment.AuCTel, transferInputAddressFragment.DbNXlk);
                String strValueOf = transferInputAddressFragment.isConnected().valueOf(transferInputAddressFragment.ejfBZ);
                String strDjBIcL = transferInputAddressFragment.isConnected().djBIcL(transferInputAddressFragment.ejfBZ);
                String strKWHzl = transferInputAddressFragment.isConnected().KWHzl(transferInputAddressFragment.ejfBZ);
                int i2 = transferInputAddressFragment.AuCTel;
                Intrinsics.copydefault(list);
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    Object next = it.next();
                    Integer checkType = ((TxToastCheckRes) next).getCheckType();
                    if (checkType != null && checkType.intValue() == 2) {
                        obj = next;
                        break;
                    }
                }
                TxToastCheckRes txToastCheckRes2 = (TxToastCheckRes) obj;
                String str5 = transferInputAddressFragment.isConnected;
                TransactionType.TaskDescription taskDescription = TransactionType.Companion;
                Bundle arguments10 = transferInputAddressFragment.getArguments();
                if (arguments10 != null) {
                    i = i2;
                    iOrdinal = arguments10.getInt("txType", TransactionType.TypeTransfer.ordinal());
                } else {
                    i = i2;
                    iOrdinal = TransactionType.TypeTransfer.ordinal();
                }
                TransactionType transactionTypeCopydefault = taskDescription.copydefault(iOrdinal);
                OkTransactionWallet okTransactionWalletEZpvd2 = transferInputAddressFragment.isConnected().EZpvd();
                boolean z3 = (okTransactionWalletEZpvd2 == null || (coinMeta = okTransactionWalletEZpvd2.getCoinMeta()) == null || !coinMeta.DarRvM()) ? false : true;
                Bundle arguments11 = transferInputAddressFragment.getArguments();
                String str6 = (arguments11 == null || (string2 = arguments11.getString("from_address", "")) == null) ? "" : string2;
                OkTransactionWallet okTransactionWalletEZpvd3 = transferInputAddressFragment.isConnected().EZpvd();
                if (okTransactionWalletEZpvd3 == null || (wallet = okTransactionWalletEZpvd3.getWallet()) == null) {
                    z2 = true;
                } else {
                    z2 = true;
                    boolean z4 = wallet.getFieldNames();
                    C10854bwM chainMeta = okTransactionWallet.getChainMeta();
                    intentKWHzl = application2.KWHzl(context2, string, string6, transactionInfo2, str4, strAEQbTJ, strValueOf, strDjBIcL, strKWHzl, i, txToastCheckRes2, str5, transactionTypeCopydefault, z3, str6, z, z4, (chainMeta == null && chainMeta.OLrzqt(transferInputAddressFragment.ejfBZ) == z2) ? z2 : false, transferInputAddressFragment.isConnected().gEmmrt(transferInputAddressFragment.ejfBZ), transferInputAddressFragment.copydefault((List<TxToastCheckRes>) list));
                }
                C10854bwM chainMeta2 = okTransactionWallet.getChainMeta();
                if (chainMeta2 == null) {
                    intentKWHzl = application2.KWHzl(context2, string, string6, transactionInfo2, str4, strAEQbTJ, strValueOf, strDjBIcL, strKWHzl, i, txToastCheckRes2, str5, transactionTypeCopydefault, z3, str6, z, z4, (chainMeta2 == null && chainMeta2.OLrzqt(transferInputAddressFragment.ejfBZ) == z2) ? z2 : false, transferInputAddressFragment.isConnected().gEmmrt(transferInputAddressFragment.ejfBZ), transferInputAddressFragment.copydefault((List<TxToastCheckRes>) list));
                }
            }
            C9694baS.Companion.KWHzl(transferInputAddressFragment, intentKWHzl, new Function2() { // from class: o.gGX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return TransferInputAddressFragment.OLrzqt(this.EZpvd, ((java.lang.Integer) obj2).intValue(), (android.content.Intent) obj3);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(TransferInputAddressFragment transferInputAddressFragment, int i, Intent intent) {
        if (i == -1) {
            transferInputAddressFragment.AEQbTJ(intent != null ? intent.getExtras() : null);
        }
        return Unit.INSTANCE;
    }

    public static final void hDKMBd(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(TransferInputAddressFragment transferInputAddressFragment, Throwable th) {
        transferInputAddressFragment.dismissLoading();
        C55326xho.toast$default(C13754dXa.FragmentManager.dNCPSb, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        return Unit.INSTANCE;
    }

    public final ArrayList<Integer> copydefault(List<TxToastCheckRes> list) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (TxToastCheckRes txToastCheckRes : list) {
            if (Intrinsics.EZpvd(txToastCheckRes.getResult(), Boolean.FALSE)) {
                Integer checkType = txToastCheckRes.getCheckType();
                if (checkType == null) {
                    break;
                }
                arrayList.add(Integer.valueOf(checkType.intValue()));
            }
        }
        return arrayList;
    }

    public final void djBIcL(boolean z) {
        fJNWhG().setVisibility(z ? 0 : 8);
    }

    private final long AuCTel() {
        Bundle arguments = getArguments();
        C10854bwM c10854bwMKWHzl = C11627cVg.KWHzl.AEQbTJ(C33129mqd.valueOf(arguments != null ? arguments.getString("coinId") : null), true);
        return C33129mqd.valueOf(c10854bwMKWHzl != null ? Long.valueOf(c10854bwMKWHzl.fetchVPNInfo()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fARcdN() {
        C16605enA c16605enA = this.values;
        C16605enA c16605enA2 = null;
        if (c16605enA == null) {
            Intrinsics.gEmmrt("");
            c16605enA = null;
        }
        Editable text = c16605enA.AuCTel.getText();
        String string = text != null ? text.toString() : null;
        boolean z = false;
        boolean z2 = string == null || string.length() == 0;
        C16605enA c16605enA3 = this.values;
        if (c16605enA3 == null) {
            Intrinsics.gEmmrt("");
            c16605enA3 = null;
        }
        if (!c16605enA3.AuCTel.hasFocus() && z2) {
            copydefault(8);
            return;
        }
        copydefault(0);
        C16605enA c16605enA4 = this.values;
        if (c16605enA4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16605enA2 = c16605enA4;
        }
        AppCompatTextView appCompatTextView = c16605enA2.values;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        if ((!(appCompatTextView.getVisibility() == 0)) && !z2) {
            z = true;
        }
        AYXKKw(z);
    }

    private final void AYXKKw(boolean z) {
        C16605enA c16605enA = this.values;
        C16605enA c16605enA2 = null;
        if (c16605enA == null) {
            Intrinsics.gEmmrt("");
            c16605enA = null;
        }
        if (c16605enA.djBIcL.isEnabled() != z) {
            C16605enA c16605enA3 = this.values;
            if (c16605enA3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16605enA2 = c16605enA3;
            }
            c16605enA2.djBIcL.setEnabled(z);
        }
    }

    public final void copydefault(int i) {
        C16605enA c16605enA = this.values;
        C16605enA c16605enA2 = null;
        if (c16605enA == null) {
            Intrinsics.gEmmrt("");
            c16605enA = null;
        }
        if (c16605enA.djBIcL.getVisibility() != i) {
            C16605enA c16605enA3 = this.values;
            if (c16605enA3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16605enA2 = c16605enA3;
            }
            c16605enA2.djBIcL.setVisibility(i);
        }
    }

    public final void valueOf() {
        C16605enA c16605enA = this.values;
        C16605enA c16605enA2 = null;
        if (c16605enA == null) {
            Intrinsics.gEmmrt("");
            c16605enA = null;
        }
        Editable text = c16605enA.AuCTel.getText();
        String string = text != null ? text.toString() : null;
        boolean z = string == null || string.length() == 0;
        C16605enA c16605enA3 = this.values;
        if (c16605enA3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16605enA2 = c16605enA3;
        }
        if ((!c16605enA2.AuCTel.hasFocus()) && z) {
            KWHzl(0);
        } else {
            KWHzl(8);
        }
    }

    public final void KWHzl(int i) {
        if (gEmmrt().getVisibility() != i) {
            gEmmrt().setVisibility(i);
        }
    }

    public final void AYXKKw() {
        InterfaceC58217yxC interfaceC58217yxC = this.AkhnZx;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        C16605enA c16605enA = this.values;
        if (c16605enA == null) {
            Intrinsics.gEmmrt("");
            c16605enA = null;
        }
        C14784drw c14784drw = c16605enA.AuCTel;
        AbstractC58247yxg<AbstractC8060avc> abstractC58247yxgObserveOn = C8062ave.AEQbTJ(c14784drw).skip(1L).debounce(500L, TimeUnit.MILLISECONDS).observeOn(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.gGm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransferInputAddressFragment.AEQbTJ(this.KWHzl, (AbstractC8060avc) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC8060avc> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gGq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                TransferInputAddressFragment.AuCTelauCTel(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gGp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransferInputAddressFragment.OLrzqt((java.lang.Throwable) obj);
            }
        };
        this.AkhnZx = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gGu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                TransferInputAddressFragment.wlaJM(function12, obj);
            }
        });
        InterfaceC58217yxC interfaceC58217yxC2 = this.fIwbmz;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        AbstractC8005auZ<AbstractC8066avi> abstractC8005auZEZpvd = C8062ave.EZpvd(c14784drw);
        Intrinsics.checkNotNullExpressionValue(abstractC8005auZEZpvd, "");
        AbstractC58247yxg abstractC58247yxgOLrzqt = C33527myD.OLrzqt((AbstractC58247yxg) abstractC8005auZEZpvd);
        final Function1 function13 = new Function1() { // from class: o.gGs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransferInputAddressFragment.AEQbTJ(this.AEQbTJ, (AbstractC8066avi) obj);
            }
        };
        this.fIwbmz = abstractC58247yxgOLrzqt.subscribe(new InterfaceC58227yxM() { // from class: o.gGt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                TransferInputAddressFragment.AubY(function13, obj);
            }
        });
    }

    public static final void AuCTelauCTel(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(TransferInputAddressFragment transferInputAddressFragment, AbstractC8060avc abstractC8060avc) {
        Intrinsics.checkNotNullParameter(abstractC8060avc, "");
        String string = abstractC8060avc.KWHzl().getText().toString();
        printLog$default(transferInputAddressFragment, "toAddressTextWatcher debounce changed: " + string, null, 2, null);
        transferInputAddressFragment.AkhnZx(string);
        return Unit.INSTANCE;
    }

    public static final void wlaJM(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void AubY(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(TransferInputAddressFragment transferInputAddressFragment, AbstractC8066avi abstractC8066avi) {
        String string = abstractC8066avi.OLrzqt().getText().toString();
        C16605enA c16605enA = null;
        printLog$default(transferInputAddressFragment, "toAddressTextWatcher changed: " + string, null, 2, null);
        if (string.length() == 0) {
            transferInputAddressFragment.djBIcL(false);
            setToAddressErrInfo$default(transferInputAddressFragment, false, null, 2, null);
            transferInputAddressFragment.AYXKKw(false);
            transferInputAddressFragment.ejfBZ();
            C16605enA c16605enA2 = transferInputAddressFragment.values;
            if (c16605enA2 == null) {
                Intrinsics.gEmmrt("");
                c16605enA2 = null;
            }
            c16605enA2.fJNWhG.setVisibility(8);
            C16605enA c16605enA3 = transferInputAddressFragment.values;
            if (c16605enA3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16605enA = c16605enA3;
            }
            C52794wYp c52794wYp = c16605enA.copydefault;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(8);
        } else {
            transferInputAddressFragment.djBIcL(true);
            transferInputAddressFragment.AYXKKw(false);
            C16605enA c16605enA4 = transferInputAddressFragment.values;
            if (c16605enA4 == null) {
                Intrinsics.gEmmrt("");
                c16605enA4 = null;
            }
            c16605enA4.AuCTel.setHint("");
            C16605enA c16605enA5 = transferInputAddressFragment.values;
            if (c16605enA5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16605enA = c16605enA5;
            }
            C52794wYp c52794wYp2 = c16605enA.copydefault;
            Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
            c52794wYp2.setVisibility(0);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(C10854bwM c10854bwM) {
        C16605enA c16605enA = this.values;
        C16605enA c16605enA2 = null;
        if (c16605enA == null) {
            Intrinsics.gEmmrt("");
            c16605enA = null;
        }
        c16605enA.copydefault.setOnClickListener(this);
        AYXKKw();
        Bundle arguments = getArguments();
        TransactionInfo transactionInfo = arguments != null ? (TransactionInfo) arguments.getParcelable("send_scan_info") : null;
        if (transactionInfo != null) {
            C16605enA c16605enA3 = this.values;
            if (c16605enA3 == null) {
                Intrinsics.gEmmrt("");
                c16605enA3 = null;
            }
            c16605enA3.AuCTel.setText(transactionInfo.getAddress());
            gEmmrt().setVisibility(8);
        }
        C16605enA c16605enA4 = this.values;
        if (c16605enA4 == null) {
            Intrinsics.gEmmrt("");
            c16605enA4 = null;
        }
        c16605enA4.AuCTel.setOnFocusChangeListener(this.fARcdN);
        C16605enA c16605enA5 = this.values;
        if (c16605enA5 == null) {
            Intrinsics.gEmmrt("");
            c16605enA5 = null;
        }
        C55296xhK.KWHzl(c16605enA5.fARcdN, this, 2000L);
        if (c10854bwM != null && c10854bwM.OuxcSI()) {
            C16605enA c16605enA6 = this.values;
            if (c16605enA6 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16605enA2 = c16605enA6;
            }
            c16605enA2.AuCTel.setHint(getString(C13754dXa.FragmentManager.setCaptioningEnabled));
            return;
        }
        C16605enA c16605enA7 = this.values;
        if (c16605enA7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16605enA2 = c16605enA7;
        }
        c16605enA2.AuCTel.setHint(getString(C13754dXa.FragmentManager.startIntentSenderForResult));
    }

    private final void copydefault(boolean z, String str) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.EZpvd(str);
        if (z) {
            viewOnClickListenerC54939xaY.EZpvd(C13754dXa.FragmentManager.DGUQLIdZmdUa, new View.OnClickListener() { // from class: o.gGk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    TransferInputAddressFragment.AEQbTJ(viewOnClickListenerC54939xaY, this, view);
                }
            });
        }
        viewOnClickListenerC54939xaY.OLrzqt(C13754dXa.FragmentManager.keySet, new View.OnClickListener() { // from class: o.gGj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                TransferInputAddressFragment.OLrzqt(viewOnClickListenerC54939xaY, this, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, TransferInputAddressFragment transferInputAddressFragment, View view) {
        viewOnClickListenerC54939xaY.dismiss();
        transferInputAddressFragment.getFieldNames();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, TransferInputAddressFragment transferInputAddressFragment, View view) {
        FragmentActivity activity;
        viewOnClickListenerC54939xaY.dismiss();
        if (transferInputAddressFragment.KWHzl()) {
            Bundle arguments = transferInputAddressFragment.getArguments();
            String string = arguments != null ? arguments.getString("from") : null;
            if (string != null) {
                int iHashCode = string.hashCode();
                if (iHashCode == -2136319830) {
                    if (string.equals("from_coin_detail")) {
                        AbstractC57212yeE.close$default(transferInputAddressFragment, null, 1, null);
                        return;
                    }
                    return;
                } else {
                    if (iHashCode == 80334932 && string.equals("from_home")) {
                        transferInputAddressFragment.hDKMBd();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        Bundle arguments2 = transferInputAddressFragment.getArguments();
        String string2 = arguments2 != null ? arguments2.getString("from") : null;
        if (string2 != null) {
            int iHashCode2 = string2.hashCode();
            if (iHashCode2 == -2136319830) {
                if (string2.equals("from_coin_detail")) {
                    AbstractC57212yeE.close$default(transferInputAddressFragment, null, 1, null);
                }
            } else if (iHashCode2 == 80334932 && string2.equals("from_home") && (activity = transferInputAddressFragment.getActivity()) != null) {
                activity.finish();
            }
        }
    }

    public static /* synthetic */ boolean checkToAddress$default(TransferInputAddressFragment transferInputAddressFragment, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            C16605enA c16605enA = transferInputAddressFragment.values;
            if (c16605enA == null) {
                Intrinsics.gEmmrt("");
                c16605enA = null;
            }
            Editable text = c16605enA.AuCTel.getText();
            str = text != null ? text.toString() : null;
        }
        return transferInputAddressFragment.AEQbTJ(z, str);
    }

    public final boolean AEQbTJ(boolean z, String str) {
        OkTransactionWallet okTransactionWalletEZpvd;
        OkTransactionWallet okTransactionWalletOLrzqt;
        if (isConnected().gEmmrt().getValue() == null || (okTransactionWalletEZpvd = isConnected().EZpvd()) == null) {
            return false;
        }
        if (!z && (str == null || str.length() == 0)) {
            setToAddressErrInfo$default(this, false, null, 2, null);
            return true;
        }
        if (str == null || str.length() == 0) {
            String string = getString(C13754dXa.FragmentManager.rsEnD);
            Intrinsics.checkNotNullExpressionValue(string, "");
            KWHzl(true, string);
            return false;
        }
        final String strKWHzl = isConnected().KWHzl(str);
        if (Intrinsics.EZpvd((Object) okTransactionWalletEZpvd.getAddress(), (Object) strKWHzl) && !iwGUEr()) {
            String string2 = getString(C13754dXa.FragmentManager.MediaControllerCompat);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            KWHzl(true, string2);
            return false;
        }
        C19589gHz.StateListAnimator value = isConnected().gEmmrt().getValue();
        final C10854bwM chainMeta = (value == null || (okTransactionWalletOLrzqt = value.OLrzqt()) == null) ? null : okTransactionWalletOLrzqt.getChainMeta();
        if (chainMeta == null) {
            String string3 = getString(C13754dXa.FragmentManager.rsEnD);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            KWHzl(true, string3);
            return false;
        }
        C10854bwM c10854bwMKWHzl = okTransactionWalletEZpvd.getCoinMeta().KWHzl();
        boolean z2 = c10854bwMKWHzl != null && c10854bwMKWHzl.DXXBbs();
        Function0 function0 = new Function0() { // from class: o.gGn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(TransferInputAddressFragment.OLrzqt(chainMeta, strKWHzl));
            }
        };
        boolean zBooleanValue = (!z2 || xYW.AEQbTJ.DbNXlk(strKWHzl).length() <= 0) ? ((Boolean) function0.invoke()).booleanValue() : true;
        if (zBooleanValue && z2) {
            xYW xyw = xYW.AEQbTJ;
            String strDbNXlk = xyw.DbNXlk(okTransactionWalletEZpvd.getAddress());
            String strDbNXlk2 = xyw.DbNXlk(strKWHzl);
            if (strDbNXlk2.length() > 0 && !Intrinsics.EZpvd((Object) strDbNXlk, (Object) strDbNXlk2) && (okTransactionWalletEZpvd.getWallet().gHZMYf() || okTransactionWalletEZpvd.getWallet().iwGUEr())) {
                String string4 = getString(C13754dXa.FragmentManager.onActiveChanged);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                KWHzl(true, string4);
                return false;
            }
        }
        if (isConnected().AkhnZx()) {
            setToAddressErrInfo$default(this, false, null, 2, null);
            return true;
        }
        if (!zBooleanValue) {
            String string5 = getString(C13754dXa.FragmentManager.rsEnD);
            Intrinsics.checkNotNullExpressionValue(string5, "");
            KWHzl(true, string5);
            return false;
        }
        setToAddressErrInfo$default(this, false, null, 2, null);
        return true;
    }

    public static final boolean OLrzqt(C10854bwM c10854bwM, String str) {
        return xYW.AEQbTJ.AEQbTJ(c10854bwM.QKVWgx(), str, c10854bwM.iwGUEr());
    }

    public static /* synthetic */ void setToAddressErrInfo$default(TransferInputAddressFragment transferInputAddressFragment, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        transferInputAddressFragment.KWHzl(z, str);
    }

    public final void KWHzl(boolean z, String str) {
        C16605enA c16605enA = null;
        printLog$default(this, "setToAddressErrInfo show: " + z + ", errMsg: " + str, null, 2, null);
        C16605enA c16605enA2 = this.values;
        if (c16605enA2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16605enA = c16605enA2;
        }
        AppCompatTextView appCompatTextView = c16605enA.values;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        OLrzqt(appCompatTextView, z, str);
    }

    public static /* synthetic */ void setToAddressTipInfo$default(TransferInputAddressFragment transferInputAddressFragment, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        transferInputAddressFragment.OLrzqt(z, str);
    }

    public final void OLrzqt(boolean z, String str) {
        C16605enA c16605enA = null;
        printLog$default(this, "setToAddressTipInfo show: " + z + ", tipContent: " + str, null, 2, null);
        if (z) {
            C16605enA c16605enA2 = this.values;
            if (c16605enA2 == null) {
                Intrinsics.gEmmrt("");
                c16605enA2 = null;
            }
            AppCompatTextView appCompatTextView = c16605enA2.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            if (appCompatTextView.getVisibility() != 0) {
                C16605enA c16605enA3 = this.values;
                if (c16605enA3 == null) {
                    Intrinsics.gEmmrt("");
                    c16605enA3 = null;
                }
                AppCompatTextView appCompatTextView2 = c16605enA3.ejfBZ;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
                appCompatTextView2.setVisibility(0);
            }
            C16605enA c16605enA4 = this.values;
            if (c16605enA4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16605enA = c16605enA4;
            }
            c16605enA.ejfBZ.setText(str);
            return;
        }
        C16605enA c16605enA5 = this.values;
        if (c16605enA5 == null) {
            Intrinsics.gEmmrt("");
            c16605enA5 = null;
        }
        AppCompatTextView appCompatTextView3 = c16605enA5.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
        if (appCompatTextView3.getVisibility() == 8) {
            return;
        }
        C16605enA c16605enA6 = this.values;
        if (c16605enA6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16605enA = c16605enA6;
        }
        AppCompatTextView appCompatTextView4 = c16605enA.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
        appCompatTextView4.setVisibility(8);
    }

    private final void OLrzqt(TextView textView, boolean z, CharSequence charSequence) {
        if (z) {
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
            }
            textView.setText(charSequence);
        } else if (textView.getVisibility() != 8) {
            textView.setVisibility(8);
        }
    }

    private final void EZpvd(EditText editText) {
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        editText.postDelayed(new Runnable() { // from class: o.gGz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                TransferInputAddressFragment.AhwBna(this.AEQbTJ);
            }
        }, 300L);
    }

    public static final void AhwBna(TransferInputAddressFragment transferInputAddressFragment) {
        if (transferInputAddressFragment.isConnected().copydefault()) {
            return;
        }
        try {
            Object systemService = transferInputAddressFragment.requireContext().getSystemService("input_method");
            Intrinsics.copydefault(systemService, "");
            ((InputMethodManager) systemService).toggleSoftInput(1, 2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void AhwBna() {
        C16605enA c16605enA = null;
        if (!isConnected().AYXKKw() || isConnected().AEQbTJ()) {
            C16605enA c16605enA2 = this.values;
            if (c16605enA2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16605enA = c16605enA2;
            }
            c16605enA.isConnected.setVisibility(0);
            return;
        }
        C16605enA c16605enA3 = this.values;
        if (c16605enA3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16605enA = c16605enA3;
        }
        c16605enA.isConnected.setVisibility(8);
    }

    public final void ejfBZ() {
        OkTransactionWallet okTransactionWalletEZpvd = isConnected().EZpvd();
        if (okTransactionWalletEZpvd != null) {
            C16605enA c16605enA = null;
            if (okTransactionWalletEZpvd.getCoinMeta().OuxcSI()) {
                C16605enA c16605enA2 = this.values;
                if (c16605enA2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c16605enA = c16605enA2;
                }
                c16605enA.AuCTel.setHint(getString(C13754dXa.FragmentManager.setCaptioningEnabled));
                return;
            }
            C16605enA c16605enA3 = this.values;
            if (c16605enA3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16605enA = c16605enA3;
            }
            c16605enA.AuCTel.setHint(getString(C13754dXa.FragmentManager.startIntentSenderForResult));
        }
    }

    public final boolean copydefault(String str) {
        C10854bwM chainMeta;
        C10854bwM chainMeta2;
        if (!StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) JwtUtilsKt.JWT_DELIMITER, false, 2, (Object) null) || str.length() <= 1) {
            return false;
        }
        OkTransactionWallet okTransactionWalletEZpvd = isConnected().EZpvd();
        if (okTransactionWalletEZpvd != null && (chainMeta2 = okTransactionWalletEZpvd.getChainMeta()) != null && chainMeta2.QVsKAR()) {
            return false;
        }
        OkTransactionWallet okTransactionWalletEZpvd2 = isConnected().EZpvd();
        return okTransactionWalletEZpvd2 == null || (chainMeta = okTransactionWalletEZpvd2.getChainMeta()) == null || !chainMeta.OuxcSI();
    }

    public final boolean gEmmrt(String str) {
        C10854bwM chainMeta;
        OkTransactionWallet okTransactionWalletEZpvd = isConnected().EZpvd();
        if (okTransactionWalletEZpvd == null || (chainMeta = okTransactionWalletEZpvd.getChainMeta()) == null || !chainMeta.UlJrfe()) {
            return false;
        }
        return xYW.AEQbTJ.AEQbTJ(chainMeta.QKVWgx(), str, chainMeta.iwGUEr());
    }

    public final boolean djBIcL(String str) {
        C10854bwM chainMeta;
        OkTransactionWallet okTransactionWalletEZpvd = isConnected().EZpvd();
        return okTransactionWalletEZpvd != null && StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) JwtUtilsKt.JWT_DELIMITER, false, 2, (Object) null) && str.length() > 1 && (chainMeta = okTransactionWalletEZpvd.getChainMeta()) != null && chainMeta.QVsKAR();
    }

    public static /* synthetic */ void checkDomainAddress$default(TransferInputAddressFragment transferInputAddressFragment, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        transferInputAddressFragment.KWHzl(str, z);
    }

    public final void KWHzl(final String str, final boolean z) {
        printLog$default(this, "checkDomainAddress address: " + str, null, 2, null);
        InterfaceC58217yxC interfaceC58217yxC = this.fetchVPNInfo;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl((AbstractC58185ywX) isConnected().AYXKKw(str));
        final Function1 function1 = new Function1() { // from class: o.gGA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransferInputAddressFragment.copydefault(this.EZpvd, str, z, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gGD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                TransferInputAddressFragment.fJNWhG(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gGB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransferInputAddressFragment.OLrzqt(this.copydefault, str, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gGF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                TransferInputAddressFragment.fIwbmz(function12, obj);
            }
        });
        if (interfaceC58217yxCAEQbTJ == null) {
            return;
        }
        this.fetchVPNInfo = interfaceC58217yxCAEQbTJ;
    }

    public static final void fJNWhG(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(TransferInputAddressFragment transferInputAddressFragment, String str, boolean z, ResponseData responseData) {
        String address;
        transferInputAddressFragment.dismissLoading();
        transferInputAddressFragment.djBIcL(false);
        ParseENSResp parseENSResp = (ParseENSResp) responseData.getData();
        if (parseENSResp == null || (address = parseENSResp.getAddress()) == null) {
            address = "";
        }
        C16605enA c16605enA = null;
        printLog$default(transferInputAddressFragment, "checkDomainAddress success. address: " + str + ", code: " + responseData.getCode() + ", data: " + responseData.getData(), null, 2, null);
        if (responseData.getCode() == 0 && address.length() > 0) {
            transferInputAddressFragment.isConnected().AEQbTJ(true);
            transferInputAddressFragment.isConnected = str;
            setToAddressErrInfo$default(transferInputAddressFragment, false, null, 2, null);
            transferInputAddressFragment.isConnected().AEQbTJ(true);
            C16605enA c16605enA2 = transferInputAddressFragment.values;
            if (c16605enA2 == null) {
                Intrinsics.gEmmrt("");
                c16605enA2 = null;
            }
            c16605enA2.AuCTel.setText(address);
            C16605enA c16605enA3 = transferInputAddressFragment.values;
            if (c16605enA3 == null) {
                Intrinsics.gEmmrt("");
                c16605enA3 = null;
            }
            c16605enA3.AuCTel.setSelection(address.length());
            C16605enA c16605enA4 = transferInputAddressFragment.values;
            if (c16605enA4 == null) {
                Intrinsics.gEmmrt("");
                c16605enA4 = null;
            }
            c16605enA4.AuCTel.clearFocus();
            transferInputAddressFragment.isConnected().OLrzqt(false);
            C16605enA c16605enA5 = transferInputAddressFragment.values;
            if (c16605enA5 == null) {
                Intrinsics.gEmmrt("");
                c16605enA5 = null;
            }
            c16605enA5.fJNWhG.setText(transferInputAddressFragment.isConnected().EZpvd(str));
            C16605enA c16605enA6 = transferInputAddressFragment.values;
            if (c16605enA6 == null) {
                Intrinsics.gEmmrt("");
                c16605enA6 = null;
            }
            c16605enA6.fJNWhG.setVisibility(0);
            transferInputAddressFragment.ejfBZ = address;
            transferInputAddressFragment.AhwBna();
            Context contextRequireContext = transferInputAddressFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C16605enA c16605enA7 = transferInputAddressFragment.values;
            if (c16605enA7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16605enA = c16605enA7;
            }
            C33054mpH.OLrzqt(contextRequireContext, c16605enA.AuCTel);
        } else {
            transferInputAddressFragment.isConnected = "";
            if (z) {
                C16605enA c16605enA8 = transferInputAddressFragment.values;
                if (c16605enA8 == null) {
                    Intrinsics.gEmmrt("");
                    c16605enA8 = null;
                }
                c16605enA8.AuCTel.setText(str);
                C16605enA c16605enA9 = transferInputAddressFragment.values;
                if (c16605enA9 == null) {
                    Intrinsics.gEmmrt("");
                    c16605enA9 = null;
                }
                c16605enA9.AuCTel.clearFocus();
                C16605enA c16605enA10 = transferInputAddressFragment.values;
                if (c16605enA10 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c16605enA = c16605enA10;
                }
                c16605enA.AuCTel.setSelection(str.length());
            }
            if (responseData.getMsg().length() > 0) {
                transferInputAddressFragment.KWHzl(true, responseData.getMsg());
            }
        }
        transferInputAddressFragment.fARcdN();
        transferInputAddressFragment.valueOf();
        return Unit.INSTANCE;
    }

    public static final void fIwbmz(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(TransferInputAddressFragment transferInputAddressFragment, String str, Throwable th) {
        transferInputAddressFragment.EZpvd("checkDomainAddress error. address: " + str, th);
        String localizedMessage = th.getLocalizedMessage();
        if (localizedMessage != null) {
            transferInputAddressFragment.KWHzl(true, localizedMessage);
        }
        transferInputAddressFragment.AhwBna();
        transferInputAddressFragment.dismissLoading();
        transferInputAddressFragment.djBIcL(false);
        return Unit.INSTANCE;
    }

    public final boolean valueOf(String str) {
        OkTransactionWallet okTransactionWalletEZpvd;
        C10854bwM chainMeta;
        return str.length() <= 12 && (okTransactionWalletEZpvd = isConnected().EZpvd()) != null && (chainMeta = okTransactionWalletEZpvd.getChainMeta()) != null && chainMeta.OuxcSI();
    }

    public final void KWHzl(final String str) {
        final C10854bwM coinMeta;
        OkTransactionWallet okTransactionWalletEZpvd = isConnected().EZpvd();
        if (okTransactionWalletEZpvd == null || (coinMeta = okTransactionWalletEZpvd.getCoinMeta()) == null) {
            return;
        }
        AEQbTJ(coinMeta, str, new Function1() { // from class: o.gGT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransferInputAddressFragment.copydefault(this.copydefault, coinMeta, str, (RegisterStatusResp) obj);
            }
        }, new Function1() { // from class: o.gGQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransferInputAddressFragment.OLrzqt(this.copydefault, (java.lang.Throwable) obj);
            }
        });
    }

    public static final Unit copydefault(TransferInputAddressFragment transferInputAddressFragment, C10854bwM c10854bwM, String str, RegisterStatusResp registerStatusResp) {
        Intrinsics.checkNotNullParameter(registerStatusResp, "");
        ChainStatus chainStatusOLrzqt = ChainStatusChecker.OLrzqt.OLrzqt(registerStatusResp);
        transferInputAddressFragment.dismissLoading();
        transferInputAddressFragment.djBIcL(false);
        if (!c10854bwM.AuCTel() ? !Intrinsics.EZpvd(registerStatusResp.getMainCoinRegister(), Boolean.TRUE) : chainStatusOLrzqt != ChainStatus.REGISTERED) {
            transferInputAddressFragment.isConnected().AEQbTJ(false);
            transferInputAddressFragment.ejfBZ = str;
            String string = transferInputAddressFragment.getString(C13754dXa.FragmentManager.onApplyWindowInsets);
            Intrinsics.checkNotNullExpressionValue(string, "");
            transferInputAddressFragment.KWHzl(true, string);
        } else {
            transferInputAddressFragment.isConnected().AEQbTJ(true);
            transferInputAddressFragment.ejfBZ = str;
            transferInputAddressFragment.isConnected().OLrzqt(false);
            C16605enA c16605enA = transferInputAddressFragment.values;
            if (c16605enA == null) {
                Intrinsics.gEmmrt("");
                c16605enA = null;
            }
            c16605enA.AuCTel.setSelection(str.length());
            setToAddressErrInfo$default(transferInputAddressFragment, false, null, 2, null);
            if (chainStatusOLrzqt != ChainStatus.REGISTERED) {
                transferInputAddressFragment.OLrzqt(true, C33069mpW.copydefault(transferInputAddressFragment, C13754dXa.FragmentManager.AppCompatDelegateImpl3, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("token", c10854bwM.fJNWhG()))));
            }
        }
        transferInputAddressFragment.fARcdN();
        transferInputAddressFragment.valueOf();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(TransferInputAddressFragment transferInputAddressFragment, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        String localizedMessage = th.getLocalizedMessage();
        if (localizedMessage != null) {
            transferInputAddressFragment.KWHzl(true, localizedMessage);
        }
        transferInputAddressFragment.dismissLoading();
        transferInputAddressFragment.djBIcL(false);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(C10854bwM c10854bwM, String str, Function1<? super RegisterStatusResp, Unit> function1, Function1<? super Throwable, Unit> function12) {
        InterfaceC58217yxC interfaceC58217yxC = this.AhwBna;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.AhwBna = yBI.subscribeBy$default(C32962mnV.unwrapResponseData$default(C58156yvv.OLrzqt(new C13934dbu().copydefault(c10854bwM.AhwBna(), str, c10854bwM.OLrzqt(), Boolean.valueOf(c10854bwM.DCUTEIddSDPG())), this, Lifecycle.Event.ON_DESTROY), (Function1) null, 1, (Object) null), function12, (Function0) null, function1, 2, (Object) null);
    }

    public final void OLrzqt(final String str) {
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl((AbstractC58185ywX) isConnected().copydefault(this.ejfBZ));
        final Function1 function1 = new Function1() { // from class: o.gGr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransferInputAddressFragment.OLrzqt(this.EZpvd, str, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gGE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                TransferInputAddressFragment.AuCTel(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gGO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransferInputAddressFragment.copydefault(this.copydefault, str, (java.lang.Throwable) obj);
            }
        };
        this.KWHzl = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gGU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                TransferInputAddressFragment.iwGUEr(function12, obj);
            }
        });
    }

    public static final void AuCTel(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(TransferInputAddressFragment transferInputAddressFragment, String str, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        transferInputAddressFragment.dismissLoading();
        transferInputAddressFragment.djBIcL(false);
        printLog$default(transferInputAddressFragment, "checkEos success. address: " + str + ", code: " + responseData.getCode() + ", data: " + responseData.getData(), null, 2, null);
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            transferInputAddressFragment.isConnected().AEQbTJ(true);
            transferInputAddressFragment.isConnected().EZpvd(true);
            transferInputAddressFragment.ejfBZ = str;
            transferInputAddressFragment.isConnected().OLrzqt(false);
            C16605enA c16605enA = transferInputAddressFragment.values;
            if (c16605enA == null) {
                Intrinsics.gEmmrt("");
                c16605enA = null;
            }
            c16605enA.AuCTel.setSelection(str.length());
            setToAddressErrInfo$default(transferInputAddressFragment, false, null, 2, null);
        } else {
            transferInputAddressFragment.isConnected().AEQbTJ(false);
            transferInputAddressFragment.isConnected().EZpvd(false);
            transferInputAddressFragment.ejfBZ = str;
            String string = transferInputAddressFragment.getString(C13754dXa.FragmentManager.rsEnD);
            Intrinsics.checkNotNullExpressionValue(string, "");
            transferInputAddressFragment.KWHzl(true, string);
        }
        transferInputAddressFragment.fARcdN();
        transferInputAddressFragment.valueOf();
        return Unit.INSTANCE;
    }

    public static final void iwGUEr(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(TransferInputAddressFragment transferInputAddressFragment, String str, Throwable th) {
        transferInputAddressFragment.EZpvd("checkEos error. address: " + str, th);
        String localizedMessage = th.getLocalizedMessage();
        if (localizedMessage != null) {
            transferInputAddressFragment.KWHzl(true, localizedMessage);
        }
        transferInputAddressFragment.dismissLoading();
        transferInputAddressFragment.djBIcL(false);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void checkNearAddress$default(TransferInputAddressFragment transferInputAddressFragment, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        transferInputAddressFragment.OLrzqt(str, z);
    }

    public final void OLrzqt(final String str, final boolean z) {
        C16605enA c16605enA = this.values;
        if (c16605enA == null) {
            Intrinsics.gEmmrt("");
            c16605enA = null;
        }
        View view = c16605enA.isConnected;
        Intrinsics.checkNotNullExpressionValue(view, "");
        printLog$default(this, "checkNearAddress address: " + str + ", spaceKeyboard.visibility: " + (view.getVisibility() == 0), null, 2, null);
        InterfaceC58217yxC interfaceC58217yxC = this.EZpvd;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX<ResponseData<CheckAddressResp>> abstractC58185ywXOLrzqt = isConnected().OLrzqt(str);
        final Function1 function1 = new Function1() { // from class: o.gGv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransferInputAddressFragment.AEQbTJ(this.KWHzl, str, z, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<CheckAddressResp>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gGw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                TransferInputAddressFragment.getFieldNames(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gGx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransferInputAddressFragment.valueOf(this.EZpvd, str, (java.lang.Throwable) obj);
            }
        };
        this.EZpvd = abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gGy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                TransferInputAddressFragment.getNewProxyInstance(function12, obj);
            }
        });
    }

    public static final void getFieldNames(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(TransferInputAddressFragment transferInputAddressFragment, String str, boolean z, ResponseData responseData) {
        CheckAddressResp checkAddressResp;
        transferInputAddressFragment.dismissLoading();
        transferInputAddressFragment.djBIcL(false);
        printLog$default(transferInputAddressFragment, "checkNearAddress success. address: " + str + ", code: " + responseData.getCode() + ", data: " + responseData.getData(), null, 2, null);
        if (responseData.getCode() == 0 && responseData.getData() != null && (checkAddressResp = (CheckAddressResp) responseData.getData()) != null && Intrinsics.EZpvd(checkAddressResp.getRes(), Boolean.TRUE)) {
            transferInputAddressFragment.isConnected().AEQbTJ(true);
            transferInputAddressFragment.isConnected().EZpvd(true);
            transferInputAddressFragment.ejfBZ = str;
            transferInputAddressFragment.isConnected().OLrzqt(false);
            if (z) {
                C16605enA c16605enA = transferInputAddressFragment.values;
                if (c16605enA == null) {
                    Intrinsics.gEmmrt("");
                    c16605enA = null;
                }
                c16605enA.AuCTel.setText(str);
            }
            C16605enA c16605enA2 = transferInputAddressFragment.values;
            if (c16605enA2 == null) {
                Intrinsics.gEmmrt("");
                c16605enA2 = null;
            }
            c16605enA2.AuCTel.setSelection(str.length());
            setToAddressErrInfo$default(transferInputAddressFragment, false, null, 2, null);
        } else {
            transferInputAddressFragment.isConnected().AEQbTJ(false);
            transferInputAddressFragment.isConnected().EZpvd(false);
            transferInputAddressFragment.ejfBZ = str;
            transferInputAddressFragment.values();
        }
        transferInputAddressFragment.fARcdN();
        transferInputAddressFragment.valueOf();
        return Unit.INSTANCE;
    }

    public static final void getNewProxyInstance(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit valueOf(TransferInputAddressFragment transferInputAddressFragment, String str, Throwable th) {
        transferInputAddressFragment.EZpvd("checkNearAddress error. address: " + str, th);
        transferInputAddressFragment.dismissLoading();
        String localizedMessage = th.getLocalizedMessage();
        if (localizedMessage != null) {
            transferInputAddressFragment.KWHzl(true, localizedMessage);
        }
        transferInputAddressFragment.djBIcL(false);
        return Unit.INSTANCE;
    }

    public static final void copydefault(TransferInputAddressFragment transferInputAddressFragment, View view, boolean z) {
        C16605enA c16605enA = null;
        printLog$default(transferInputAddressFragment, "toAddressFocusChange hasFocus: " + z, null, 2, null);
        if (z) {
            transferInputAddressFragment.AYXKKw("enteraddress");
            C16605enA c16605enA2 = transferInputAddressFragment.values;
            if (c16605enA2 == null) {
                Intrinsics.gEmmrt("");
                c16605enA2 = null;
            }
            c16605enA2.fJNWhG.setVisibility(8);
        }
        transferInputAddressFragment.fARcdN();
        transferInputAddressFragment.valueOf();
        C16605enA c16605enA3 = transferInputAddressFragment.values;
        if (c16605enA3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16605enA = c16605enA3;
        }
        c16605enA.fIwbmz.setActivated(z);
        transferInputAddressFragment.isConnected().OLrzqt(z);
        transferInputAddressFragment.AhwBna();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ValidateAddressType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ValidateAddressType[] $VALUES;
        public static final ValidateAddressType DOMAIN_ADDRESS = new ValidateAddressType("DOMAIN_ADDRESS", 0);
        public static final ValidateAddressType NEAR = new ValidateAddressType("NEAR", 1);
        public static final ValidateAddressType EOS = new ValidateAddressType("EOS", 2);
        public static final ValidateAddressType NORMAL = new ValidateAddressType("NORMAL", 3);
        public static final ValidateAddressType PI = new ValidateAddressType("PI", 4);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ValidateAddressType[] $values() {
            return new ValidateAddressType[]{DOMAIN_ADDRESS, NEAR, EOS, NORMAL, PI};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ValidateAddressType> getEntries() {
            return $ENTRIES;
        }

        private ValidateAddressType(String str, int i) {
        }

        static {
            ValidateAddressType[] validateAddressTypeArr$values = $values();
            $VALUES = validateAddressTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(validateAddressTypeArr$values);
        }

        public static ValidateAddressType valueOf(String str) {
            return (ValidateAddressType) Enum.valueOf(ValidateAddressType.class, str);
        }

        public static ValidateAddressType[] values() {
            return (ValidateAddressType[]) $VALUES.clone();
        }
    }

    public static abstract class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.tx.send.TransferInputAddressFragment.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class TaskDescription extends StateListAnimator {
            public final String AEQbTJ;
            public final ValidateAddressType KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, ValidateAddressType validateAddressType, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    validateAddressType = taskDescription.KWHzl;
                }
                if ((i & 2) != 0) {
                    str = taskDescription.AEQbTJ;
                }
                return taskDescription.KWHzl(validateAddressType, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription KWHzl(@NotNull ValidateAddressType validateAddressType, @NotNull String str) {
                Intrinsics.checkNotNullParameter(validateAddressType, "");
                Intrinsics.checkNotNullParameter(str, "");
                return new TaskDescription(validateAddressType, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ValidateAddressType KWHzl() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TaskDescription)) {
                    return false;
                }
                TaskDescription taskDescription = (TaskDescription) obj;
                return this.KWHzl == taskDescription.KWHzl && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) taskDescription.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Valid(type=" + this.KWHzl + ", address=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull ValidateAddressType validateAddressType, @NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(validateAddressType, "");
                Intrinsics.checkNotNullParameter(str, "");
                this.KWHzl = validateAddressType;
                this.AEQbTJ = str;
            }
        }

        private StateListAnimator() {
        }

        public static final class ActionBar extends StateListAnimator {
            public final String AEQbTJ;
            public final ValidateAddressType KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, ValidateAddressType validateAddressType, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    validateAddressType = actionBar.KWHzl;
                }
                if ((i & 2) != 0) {
                    str = actionBar.AEQbTJ;
                }
                return actionBar.AEQbTJ(validateAddressType, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar AEQbTJ(@NotNull ValidateAddressType validateAddressType, String str) {
                Intrinsics.checkNotNullParameter(validateAddressType, "");
                return new ActionBar(validateAddressType, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ValidateAddressType copydefault() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionBar)) {
                    return false;
                }
                ActionBar actionBar = (ActionBar) obj;
                return this.KWHzl == actionBar.KWHzl && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) actionBar.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.KWHzl.hashCode();
                String str = this.AEQbTJ;
                return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Invalid(type=" + this.KWHzl + ", errMsg=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull ValidateAddressType validateAddressType, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(validateAddressType, "");
                this.KWHzl = validateAddressType;
                this.AEQbTJ = str;
            }
        }

        public static final class Application extends StateListAnimator {
            public final String AEQbTJ;
            public final Exception OLrzqt;
            public final ValidateAddressType copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, ValidateAddressType validateAddressType, String str, Exception exc, int i, Object obj) {
                if ((i & 1) != 0) {
                    validateAddressType = application.copydefault;
                }
                if ((i & 2) != 0) {
                    str = application.AEQbTJ;
                }
                if ((i & 4) != 0) {
                    exc = application.OLrzqt;
                }
                return application.EZpvd(validateAddressType, str, exc);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ValidateAddressType AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application EZpvd(@NotNull ValidateAddressType validateAddressType, String str, Exception exc) {
                Intrinsics.checkNotNullParameter(validateAddressType, "");
                return new Application(validateAddressType, str, exc);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Exception OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Application)) {
                    return false;
                }
                Application application = (Application) obj;
                return this.copydefault == application.copydefault && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) application.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, application.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.copydefault.hashCode();
                String str = this.AEQbTJ;
                int iHashCode2 = str == null ? 0 : str.hashCode();
                Exception exc = this.OLrzqt;
                return (((iHashCode * 31) + iHashCode2) * 31) + (exc != null ? exc.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Error(type=" + this.copydefault + ", errMsg=" + this.AEQbTJ + ", exception=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull ValidateAddressType validateAddressType, String str, Exception exc) {
                super(null);
                Intrinsics.checkNotNullParameter(validateAddressType, "");
                this.copydefault = validateAddressType;
                this.AEQbTJ = str;
                this.OLrzqt = exc;
            }
        }
    }

    public final void AEQbTJ(final String str, final Function1<? super StateListAnimator.TaskDescription, Unit> function1, final Function1<? super StateListAnimator.ActionBar, Unit> function12, final Function1<? super StateListAnimator.Application, Unit> function13, final Function1<? super StateListAnimator.TaskDescription, Unit> function14) {
        final C10854bwM coinMeta;
        if (copydefault(str)) {
            InterfaceC58217yxC interfaceC58217yxC = this.fetchVPNInfo;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl((AbstractC58185ywX) isConnected().AYXKKw(str));
            final Function1 function15 = new Function1() { // from class: o.gGZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return TransferInputAddressFragment.copydefault(this.AEQbTJ, str, function1, function12, (ResponseData) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gFO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    TransferInputAddressFragment.zsXlph(function15, obj);
                }
            };
            final Function1 function16 = new Function1() { // from class: o.gFU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return TransferInputAddressFragment.AEQbTJ(this.OLrzqt, str, function13, (java.lang.Throwable) obj);
                }
            };
            this.fetchVPNInfo = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gFV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    TransferInputAddressFragment.zLjUOn(function16, obj);
                }
            });
            return;
        }
        if (djBIcL(str)) {
            InterfaceC58217yxC interfaceC58217yxC2 = this.EZpvd;
            if (interfaceC58217yxC2 != null) {
                interfaceC58217yxC2.dispose();
            }
            AbstractC58185ywX abstractC58185ywXKWHzl2 = C33024moe.KWHzl((AbstractC58185ywX) isConnected().OLrzqt(str));
            final Function1 function17 = new Function1() { // from class: o.gFS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return TransferInputAddressFragment.EZpvd(this.AEQbTJ, str, function1, function12, (ResponseData) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.gFT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    TransferInputAddressFragment.gHZMYf(function17, obj);
                }
            };
            final Function1 function18 = new Function1() { // from class: o.gFW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return TransferInputAddressFragment.EZpvd(this.KWHzl, str, function13, (java.lang.Throwable) obj);
                }
            };
            this.EZpvd = abstractC58185ywXKWHzl2.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.gFZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    TransferInputAddressFragment.AxsJAY(function18, obj);
                }
            });
            return;
        }
        if (valueOf(str)) {
            InterfaceC58217yxC interfaceC58217yxC3 = this.KWHzl;
            if (interfaceC58217yxC3 != null) {
                interfaceC58217yxC3.dispose();
            }
            AbstractC58185ywX abstractC58185ywXKWHzl3 = C33024moe.KWHzl((AbstractC58185ywX) isConnected().copydefault(str));
            final Function1 function19 = new Function1() { // from class: o.gGa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return TransferInputAddressFragment.valueOf(this.copydefault, str, function1, function12, (ResponseData) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM3 = new InterfaceC58227yxM() { // from class: o.gFY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    TransferInputAddressFragment.AwvSrB(function19, obj);
                }
            };
            final Function1 function110 = new Function1() { // from class: o.gFR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return TransferInputAddressFragment.djBIcL(this.AEQbTJ, str, function13, (java.lang.Throwable) obj);
                }
            };
            this.KWHzl = abstractC58185ywXKWHzl3.AEQbTJ(interfaceC58227yxM3, new InterfaceC58227yxM() { // from class: o.gFN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    TransferInputAddressFragment.sSMYrx(function110, obj);
                }
            });
            return;
        }
        if (gEmmrt(str)) {
            OkTransactionWallet okTransactionWalletEZpvd = isConnected().EZpvd();
            if (okTransactionWalletEZpvd == null || (coinMeta = okTransactionWalletEZpvd.getCoinMeta()) == null) {
                return;
            }
            AEQbTJ(coinMeta, str, new Function1() { // from class: o.gFP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return TransferInputAddressFragment.copydefault(coinMeta, function12, this, function1, str, function14, (RegisterStatusResp) obj);
                }
            }, new Function1() { // from class: o.gFQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return TransferInputAddressFragment.OLrzqt(function13, (java.lang.Throwable) obj);
                }
            });
            return;
        }
        function1.invoke(new StateListAnimator.TaskDescription(ValidateAddressType.NORMAL, str));
    }

    public static final void zsXlph(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(TransferInputAddressFragment transferInputAddressFragment, String str, Function1 function1, Function1 function12, ResponseData responseData) {
        String address;
        ParseENSResp parseENSResp = (ParseENSResp) responseData.getData();
        if (parseENSResp == null || (address = parseENSResp.getAddress()) == null) {
            address = "";
        }
        printLog$default(transferInputAddressFragment, "validateAddress checkRequestDomain success. address: " + str + ", code: " + responseData.getCode() + ", data: " + responseData.getData(), null, 2, null);
        if (responseData.getCode() == 0 && address.length() > 0) {
            function1.invoke(new StateListAnimator.TaskDescription(ValidateAddressType.DOMAIN_ADDRESS, address));
        } else {
            String msg = responseData.getMsg();
            if (msg.length() == 0) {
                msg = transferInputAddressFragment.getString(C13754dXa.FragmentManager.rsEnD);
                Intrinsics.checkNotNullExpressionValue(msg, "");
            }
            function12.invoke(new StateListAnimator.ActionBar(ValidateAddressType.DOMAIN_ADDRESS, msg));
        }
        return Unit.INSTANCE;
    }

    public static final void zLjUOn(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(TransferInputAddressFragment transferInputAddressFragment, String str, Function1 function1, Throwable th) {
        transferInputAddressFragment.EZpvd("validateAddress checkRequestDomain error. address: " + str, th);
        function1.invoke(new StateListAnimator.Application(ValidateAddressType.DOMAIN_ADDRESS, th.getLocalizedMessage(), new Exception(th)));
        return Unit.INSTANCE;
    }

    public static final void gHZMYf(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(TransferInputAddressFragment transferInputAddressFragment, String str, Function1 function1, Function1 function12, ResponseData responseData) {
        CheckAddressResp checkAddressResp;
        printLog$default(transferInputAddressFragment, "validateAddress checkNearAddress success. address: " + str + ", code: " + responseData.getCode() + ", data: " + responseData.getData(), null, 2, null);
        if (responseData.getCode() == 0 && responseData.getData() != null && (checkAddressResp = (CheckAddressResp) responseData.getData()) != null && Intrinsics.EZpvd(checkAddressResp.getRes(), Boolean.TRUE)) {
            function1.invoke(new StateListAnimator.TaskDescription(ValidateAddressType.NEAR, str));
        } else {
            String string = transferInputAddressFragment.getString(C13754dXa.FragmentManager.rsEnD);
            Intrinsics.checkNotNullExpressionValue(string, "");
            function12.invoke(new StateListAnimator.ActionBar(ValidateAddressType.NEAR, string));
        }
        return Unit.INSTANCE;
    }

    public static final void AxsJAY(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(TransferInputAddressFragment transferInputAddressFragment, String str, Function1 function1, Throwable th) {
        transferInputAddressFragment.EZpvd("validateAddress checkNearAddress error. address: " + str, th);
        function1.invoke(new StateListAnimator.Application(ValidateAddressType.NEAR, th.getLocalizedMessage(), new Exception(th)));
        return Unit.INSTANCE;
    }

    public static final void AwvSrB(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit valueOf(TransferInputAddressFragment transferInputAddressFragment, String str, Function1 function1, Function1 function12, ResponseData responseData) {
        printLog$default(transferInputAddressFragment, "validateAddress checkRequestEos success. address: " + str + ", code: " + responseData.getCode() + ", data: " + responseData.getData(), null, 2, null);
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            function1.invoke(new StateListAnimator.TaskDescription(ValidateAddressType.EOS, str));
        } else {
            responseData.getMsg();
            String string = transferInputAddressFragment.getString(C13754dXa.FragmentManager.rsEnD);
            Intrinsics.checkNotNullExpressionValue(string, "");
            function12.invoke(new StateListAnimator.ActionBar(ValidateAddressType.EOS, string));
        }
        return Unit.INSTANCE;
    }

    public static final void sSMYrx(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(TransferInputAddressFragment transferInputAddressFragment, String str, Function1 function1, Throwable th) {
        transferInputAddressFragment.EZpvd("validateAddress checkRequestEos error. address: " + str, th);
        function1.invoke(new StateListAnimator.Application(ValidateAddressType.NEAR, th.getLocalizedMessage(), new Exception(th)));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C10854bwM c10854bwM, Function1 function1, TransferInputAddressFragment transferInputAddressFragment, Function1 function12, String str, Function1 function13, RegisterStatusResp registerStatusResp) {
        Intrinsics.checkNotNullParameter(registerStatusResp, "");
        ChainStatus chainStatusOLrzqt = ChainStatusChecker.OLrzqt.OLrzqt(registerStatusResp);
        if (!c10854bwM.AuCTel() ? !Intrinsics.EZpvd(registerStatusResp.getMainCoinRegister(), Boolean.TRUE) : chainStatusOLrzqt != ChainStatus.REGISTERED) {
            function1.invoke(new StateListAnimator.ActionBar(ValidateAddressType.PI, C33069mpW.copydefault(transferInputAddressFragment, C13754dXa.FragmentManager.onApplyWindowInsets, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("token", c10854bwM.fJNWhG())))));
        } else if (chainStatusOLrzqt == ChainStatus.REGISTERED) {
            function12.invoke(new StateListAnimator.TaskDescription(ValidateAddressType.PI, str));
        } else {
            function13.invoke(new StateListAnimator.TaskDescription(ValidateAddressType.PI, str));
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        function1.invoke(new StateListAnimator.Application(ValidateAddressType.PI, th.getLocalizedMessage(), new Exception(th)));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void printLog$default(TransferInputAddressFragment transferInputAddressFragment, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        transferInputAddressFragment.EZpvd(str, th);
    }

    public final void EZpvd(String str, Throwable th) {
        if (th == null) {
            C10856bwO.copydefault("TransferInputAddressFragment", 0, str);
        } else {
            C10856bwO.copydefault("TransferInputAddressFragment", 0, str, th);
        }
    }
}
