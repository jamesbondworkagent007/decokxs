package o;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.bumptech.glide.Glide;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.core.tx.check.ChainStatus;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.CoinProtocol;
import com.okinc.business.defi.biz.net.bean.ContractAddressResp;
import com.okinc.business.defi.wallet.custom.CustomTokenFragment$observeData$1;
import com.okinc.business.defi.wallet.custom.OKWXRCProtocolEnum;
import com.okinc.business.dex.api.bean.OKDCoinDetailConfig;
import com.okinc.business.dex.api.bean.OKDSourceType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.rxutils.RxBus;
import com.okinc.web3Uilib.bean.RiskPageInfoBean;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C10407bnq;
import o.C12827cuN;
import o.C13754dXa;
import o.InterfaceC18445fiY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eey, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C16178eey extends AbstractC32998moE {
    public final C57586ylH AYXKKw;
    public C10854bwM AhwBna;
    public final C57586ylH AkhnZx;
    public java.lang.String DbNXlk;
    public InterfaceC58217yxC EZpvd;
    public C13916dbc KWHzl;
    public C16483ekl OLrzqt;
    public final InterfaceC56387yDm ejfBZ;
    public java.util.ArrayList<CoinProtocol> fIwbmz;
    public CustomChainCoinMeta fetchVPNInfo;
    public InterfaceC58217yxC gEmmrt;
    public final C57586ylH isConnected;
    public InterfaceC58217yxC valueOf;
    public final C57586ylH values;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;
    public final int djBIcL = C13754dXa.TaskDescription.DGOPHZDGOPHZ;
    public long copydefault = -1;

    /* JADX INFO: renamed from: o.eey$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;

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
            try {
                iArr[ChainStatus.UNREGISTERED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[OKWXRCProtocolEnum.values().length];
            try {
                iArr2[OKWXRCProtocolEnum.BRC20S.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[OKWXRCProtocolEnum.FRACTAL_CAT20.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            EZpvd = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.djBIcL;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    public C16178eey() {
        Function0 function0 = new Function0() { // from class: o.efL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C16178eey.EZpvd();
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.custom.CustomTokenFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.custom.CustomTokenFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        final Function0 function03 = null;
        this.ejfBZ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C16204efX.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.custom.CustomTokenFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.custom.CustomTokenFragment$special$$inlined$viewModels$default$4
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
                Function0 function04 = function03;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function0);
        this.DbNXlk = "";
        this.fIwbmz = new java.util.ArrayList<>(yDY.AhwBna());
        this.AYXKKw = new C57586ylH(new Function1() { // from class: o.efK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16178eey.EZpvd(this.OLrzqt, (java.lang.String) obj);
            }
        });
        this.isConnected = new C57586ylH(new Function1() { // from class: o.efO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16178eey.gEmmrt(this.EZpvd, (java.lang.String) obj);
            }
        });
        this.values = new C57586ylH(new Function1() { // from class: o.efR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16178eey.AhwBna(this.KWHzl, (java.lang.String) obj);
            }
        });
        this.AkhnZx = new C57586ylH(new Function1() { // from class: o.efQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16178eey.valueOf(this.KWHzl, (java.lang.String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o.eey$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eey.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ C16178eey newInstance$default(Activity activity, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = Long.MIN_VALUE;
            }
            return activity.copydefault(j);
        }

        public final C16178eey copydefault(long j) {
            C16178eey c16178eey = new C16178eey();
            c16178eey.ensureArguments().putLong("chain_id", j);
            return c16178eey;
        }
    }

    public final C55001xbh DbNXlk() {
        C55018xby c55018xby;
        C16483ekl c16483ekl = this.OLrzqt;
        if (c16483ekl == null || (c55018xby = c16483ekl.KWHzl) == null) {
            return null;
        }
        return c55018xby.AkhnZx();
    }

    public final C55001xbh values() {
        C55008xbo c55008xbo;
        C16483ekl c16483ekl = this.OLrzqt;
        if (c16483ekl == null || (c55008xbo = c16483ekl.EZpvd) == null) {
            return null;
        }
        return c55008xbo.AkhnZx();
    }

    public final C55001xbh AYXKKw() {
        C55008xbo c55008xbo;
        C16483ekl c16483ekl = this.OLrzqt;
        if (c16483ekl == null || (c55008xbo = c16483ekl.valueOf) == null) {
            return null;
        }
        return c55008xbo.AkhnZx();
    }

    public final C55001xbh isConnected() {
        C55008xbo c55008xbo;
        C16483ekl c16483ekl = this.OLrzqt;
        if (c16483ekl == null || (c55008xbo = c16483ekl.DbNXlk) == null) {
            return null;
        }
        return c55008xbo.AkhnZx();
    }

    public final C55001xbh AkhnZx() {
        C55008xbo c55008xbo;
        C16483ekl c16483ekl = this.OLrzqt;
        if (c16483ekl == null || (c55008xbo = c16483ekl.djBIcL) == null) {
            return null;
        }
        return c55008xbo.AkhnZx();
    }

    public final C16204efX fetchVPNInfo() {
        return (C16204efX) this.ejfBZ.getValue();
    }

    public static final C16204efX KWHzl(CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        C12827cuN instance$default = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null);
        return new C16204efX(instance$default, InterfaceC18445fiY.StateListAnimator.getInstance$default(InterfaceC18445fiY.Companion, null, 1, null), new C16205efY(new C13934dbu(), instance$default), SavedStateHandleSupport.createSavedStateHandle(creationExtras));
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C14693dqK c14693dqK;
        C52794wYp c52794wYp;
        C14693dqK c14693dqK2;
        C14693dqK c14693dqK3;
        android.widget.RelativeLayout relativeLayout;
        C55239xgG c55239xgG;
        Intrinsics.checkNotNullParameter(view, "");
        this.OLrzqt = C16483ekl.AEQbTJ(view);
        long j = ensureArguments().getLong("chain_id");
        this.copydefault = j;
        pUU.OLrzqt(">>>protocol CustomTokenFragment initView chainId:" + j);
        C16483ekl c16483ekl = this.OLrzqt;
        if (c16483ekl != null && (c55239xgG = c16483ekl.gEmmrt) != null) {
            c55239xgG.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.efV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    C16178eey.AEQbTJ(this.KWHzl, compoundButton, z);
                }
            });
        }
        C16483ekl c16483ekl2 = this.OLrzqt;
        if (c16483ekl2 != null && (relativeLayout = c16483ekl2.AhwBna) != null) {
            relativeLayout.setOnTouchListener(new View.OnTouchListener() { // from class: o.efT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                    return C16178eey.AEQbTJ(this.EZpvd, view2, motionEvent);
                }
            });
        }
        C55001xbh c55001xbhAYXKKw = AYXKKw();
        if (c55001xbhAYXKKw != null) {
            c55001xbhAYXKKw.addTextChangedListener(this.AYXKKw);
        }
        C55001xbh c55001xbhAYXKKw2 = AYXKKw();
        if (c55001xbhAYXKKw2 != null) {
            c55001xbhAYXKKw2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.eeE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view2, boolean z) {
                    C16178eey.copydefault(this.AEQbTJ, view2, z);
                }
            });
        }
        C55001xbh c55001xbhValues = values();
        if (c55001xbhValues != null) {
            c55001xbhValues.addTextChangedListener(this.AkhnZx);
        }
        C55001xbh c55001xbhValues2 = values();
        if (c55001xbhValues2 != null) {
            c55001xbhValues2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.eeB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
                    return C16178eey.AEQbTJ(this.OLrzqt, textView, i, keyEvent);
                }
            });
        }
        C55001xbh c55001xbhValues3 = values();
        if (c55001xbhValues3 != null) {
            c55001xbhValues3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.eeC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view2, boolean z) {
                    C16178eey.AEQbTJ(this.copydefault, view2, z);
                }
            });
        }
        C55001xbh c55001xbhIsConnected = isConnected();
        if (c55001xbhIsConnected != null) {
            c55001xbhIsConnected.addTextChangedListener(this.values);
        }
        C55001xbh c55001xbhIsConnected2 = isConnected();
        if (c55001xbhIsConnected2 != null) {
            c55001xbhIsConnected2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.eeJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view2, boolean z) {
                    C16178eey.valueOf(this.copydefault, view2, z);
                }
            });
        }
        C55001xbh c55001xbhAkhnZx = AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.addTextChangedListener(this.isConnected);
        }
        if (this.copydefault != Long.MIN_VALUE) {
            C16483ekl c16483ekl3 = this.OLrzqt;
            if (c16483ekl3 != null && (c14693dqK3 = c16483ekl3.values) != null) {
                c14693dqK3.copydefault();
            }
            C16483ekl c16483ekl4 = this.OLrzqt;
            if (c16483ekl4 != null && (c14693dqK2 = c16483ekl4.values) != null) {
                c14693dqK2.setState(3);
            }
        } else {
            C16483ekl c16483ekl5 = this.OLrzqt;
            if (c16483ekl5 != null && (c14693dqK = c16483ekl5.values) != null) {
                c14693dqK.setOnContentViewClickListener(new Function1() { // from class: o.eeI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C16178eey.EZpvd(this.KWHzl, (C14693dqK) obj);
                    }
                });
            }
        }
        C16483ekl c16483ekl6 = this.OLrzqt;
        if (c16483ekl6 != null && (c52794wYp = c16483ekl6.OLrzqt) != null) {
            c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
        }
        fARcdN();
        uzCIH();
        hDKMBd();
    }

    public static final void AEQbTJ(final C16178eey c16178eey, android.widget.CompoundButton compoundButton, boolean z) {
        C10854bwM c10854bwM;
        if (c16178eey.fJNWhG() && (c10854bwM = c16178eey.AhwBna) != null && c10854bwM.fetchVPNInfo() == 1) {
            c16178eey.KWHzl(new Function1() { // from class: o.eeV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C16178eey.djBIcL(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
    }

    public static final Unit djBIcL(C16178eey c16178eey, boolean z) {
        c16178eey.KWHzl(z);
        return Unit.INSTANCE;
    }

    public static final boolean AEQbTJ(C16178eey c16178eey, android.view.View view, android.view.MotionEvent motionEvent) {
        C55001xbh c55001xbhIsConnected;
        C55001xbh c55001xbhAYXKKw;
        C55001xbh c55001xbhValues;
        if (view instanceof AppCompatEditText) {
            return false;
        }
        if (!Intrinsics.EZpvd(view, c16178eey.values()) && (c55001xbhValues = c16178eey.values()) != null) {
            c55001xbhValues.clearFocus();
        }
        C10854bwM c10854bwM = c16178eey.AhwBna;
        if (c10854bwM != null && c10854bwM.UlJrfe()) {
            if (!Intrinsics.EZpvd(view, c16178eey.AYXKKw()) && (c55001xbhAYXKKw = c16178eey.AYXKKw()) != null) {
                c55001xbhAYXKKw.clearFocus();
            }
            if (!Intrinsics.EZpvd(view, c16178eey.isConnected()) && (c55001xbhIsConnected = c16178eey.isConnected()) != null) {
                c55001xbhIsConnected.clearFocus();
            }
        }
        android.content.Context context = c16178eey.getContext();
        if (context == null) {
            return false;
        }
        C33054mpH.OLrzqt(context, view);
        return false;
    }

    public static final void copydefault(final C16178eey c16178eey, android.view.View view, boolean z) {
        java.lang.String strIsConnected;
        CustomChainMeta customChainMetaOLrzqt;
        if (!z && c16178eey.fJNWhG()) {
            C10854bwM c10854bwM = c16178eey.AhwBna;
            if (c10854bwM != null && !c10854bwM.DarRvM()) {
                if (c16178eey.AhwBna != null) {
                    c16178eey.KWHzl(new Function1() { // from class: o.efG
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C16178eey.gEmmrt(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
                        }
                    });
                    return;
                }
                return;
            }
            final java.lang.String strOLrzqt = c16178eey.OLrzqt(getTextOf$default(c16178eey, c16178eey.AYXKKw(), false, 2, null));
            CustomChainCoinMeta customChainCoinMeta = c16178eey.fetchVPNInfo;
            if (customChainCoinMeta == null || (customChainMetaOLrzqt = customChainCoinMeta.OLrzqt()) == null || (strIsConnected = customChainMetaOLrzqt.isConnected()) == null) {
                strIsConnected = "";
            }
            c16178eey.OLrzqt(strIsConnected, strOLrzqt, new Function1() { // from class: o.efN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C16178eey.EZpvd(this.AEQbTJ, strOLrzqt, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            return;
        }
        C55001xbh c55001xbhIsConnected = c16178eey.isConnected();
        if (c55001xbhIsConnected != null) {
            c55001xbhIsConnected.setEnabled(true);
        }
        C55001xbh c55001xbhAkhnZx = c16178eey.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setEnabled(true);
        }
    }

    public static final Unit gEmmrt(C16178eey c16178eey, boolean z) {
        c16178eey.KWHzl(z);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(final C16178eey c16178eey, java.lang.String str, boolean z) {
        java.lang.String strIsConnected;
        CustomChainMeta customChainMetaOLrzqt;
        if (z) {
            c16178eey.valueOf();
            CustomChainCoinMeta customChainCoinMeta = c16178eey.fetchVPNInfo;
            if (customChainCoinMeta == null || (customChainMetaOLrzqt = customChainCoinMeta.OLrzqt()) == null || (strIsConnected = customChainMetaOLrzqt.isConnected()) == null) {
                strIsConnected = "";
            }
            C10734btz c10734btz = C10734btz.KWHzl;
            AbstractC58260yxt<java.lang.String> abstractC58260yxtGEmmrt = c10734btz.gEmmrt(strIsConnected, str);
            AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt = c10734btz.OLrzqt(strIsConnected, str);
            AbstractC58260yxt<java.lang.String> abstractC58260yxtAYXKKw = c10734btz.AYXKKw(strIsConnected, str);
            final yHO yho = new yHO() { // from class: o.efE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return C16178eey.KWHzl((java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3);
                }
            };
            AbstractC58260yxt abstractC58260yxtAEQbTJ = AbstractC58260yxt.AEQbTJ(abstractC58260yxtGEmmrt, abstractC58260yxtOLrzqt, abstractC58260yxtAYXKKw, new InterfaceC58228yxN() { // from class: o.efD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58228yxN
                public final java.lang.Object AEQbTJ(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return C16178eey.copydefault(yho, obj, obj2, obj3);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtAEQbTJ, "");
            AbstractC58260yxt abstractC58260yxtAEQbTJ2 = C58156yvv.AEQbTJ(abstractC58260yxtAEQbTJ, c16178eey, Lifecycle.Event.ON_DESTROY);
            final Function1 function1 = new Function1() { // from class: o.efF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C16178eey.EZpvd(this.copydefault, (java.util.List) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.efH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C16178eey.RJOkX(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.efM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C16178eey.AEQbTJ((java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtAEQbTJ2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.efI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C16178eey.QbewEr(function12, obj);
                }
            });
        } else {
            c16178eey.AuCTel();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.eey$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.content.Context OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, android.content.Context context) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.OLrzqt);
                viewOnClickListenerC54939xaY.setCancelable(true);
                viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
                viewOnClickListenerC54939xaY.setTitle(C13754dXa.FragmentManager.ActivityResultContractsTakePicture);
                viewOnClickListenerC54939xaY.copydefault(C13754dXa.FragmentManager.QhYuFg);
                viewOnClickListenerC54939xaY.EZpvd(C13754dXa.FragmentManager.getItem, new LoaderManager(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.eey$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C16178eey EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C16178eey c16178eey) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c16178eey;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            C13916dbc c13916dbc;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C13916dbc c13916dbc2 = this.EZpvd.KWHzl;
                if ((c13916dbc2 != null ? java.lang.Integer.valueOf(c13916dbc2.AEQbTJ()) : null) == null || ((c13916dbc = this.EZpvd.KWHzl) != null && c13916dbc.AEQbTJ() == 0)) {
                    this.EZpvd.AhwBna();
                } else {
                    C16178eey c16178eey = this.EZpvd;
                    c16178eey.EZpvd(c16178eey.new Application());
                }
            }
        }
    }

    public static final java.util.List copydefault(yHO yho, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        return (java.util.List) yho.invoke(obj, obj2, obj3);
    }

    public static final java.util.List KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return yDY.gEmmrt(str, str2, str3);
    }

    public static final void RJOkX(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C16178eey c16178eey, java.util.List list) {
        Intrinsics.copydefault(list);
        if (!list.isEmpty()) {
            C55001xbh c55001xbhIsConnected = c16178eey.isConnected();
            if (c55001xbhIsConnected != null) {
                c55001xbhIsConnected.setText((java.lang.CharSequence) list.get(0));
            }
            C55001xbh c55001xbhIsConnected2 = c16178eey.isConnected();
            if (c55001xbhIsConnected2 != null) {
                c55001xbhIsConnected2.setEnabled(false);
            }
        }
        if (list.size() > 1) {
            C55001xbh c55001xbhAkhnZx = c16178eey.AkhnZx();
            if (c55001xbhAkhnZx != null) {
                c55001xbhAkhnZx.setText((java.lang.CharSequence) list.get(1));
            }
            C55001xbh c55001xbhAkhnZx2 = c16178eey.AkhnZx();
            if (c55001xbhAkhnZx2 != null) {
                c55001xbhAkhnZx2.setEnabled(false);
            }
        }
        if (list.size() > 2) {
            c16178eey.DbNXlk = (java.lang.String) list.get(2);
        }
        return Unit.INSTANCE;
    }

    public static final void QbewEr(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final boolean AEQbTJ(C16178eey c16178eey, android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        C55001xbh c55001xbhValues = c16178eey.values();
        if (c55001xbhValues != null) {
            c55001xbhValues.clearFocus();
        }
        android.content.Context context = c16178eey.getContext();
        if (context == null) {
            return false;
        }
        C33054mpH.OLrzqt(context, c16178eey.values());
        return false;
    }

    public static final void AEQbTJ(final C16178eey c16178eey, android.view.View view, boolean z) {
        C10854bwM c10854bwM;
        if (z) {
            return;
        }
        C55001xbh c55001xbhValues = c16178eey.values();
        if (java.lang.String.valueOf(c55001xbhValues != null ? c55001xbhValues.getText() : null).length() <= 0 || (c10854bwM = c16178eey.AhwBna) == null) {
            return;
        }
        C10407bnq instance$default = C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null);
        long jAEQbTJ = c10854bwM.AEQbTJ();
        C55001xbh c55001xbhValues2 = c16178eey.values();
        AbstractC58185ywX abstractC58185ywXCopydefault = instance$default.copydefault(jAEQbTJ, C33129mqd.gEmmrt(c55001xbhValues2 != null ? c55001xbhValues2.getText() : null), (8 & 4) != 0 ? null : c16178eey.fetchVPNInfo().AEQbTJ(), (8 & 8) != 0 ? null : null);
        final Function1 function1 = new Function1() { // from class: o.eeL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16178eey.OLrzqt(this.OLrzqt, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eeO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C16178eey.QUSxYX(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.eeP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16178eey.fetchVPNInfo(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        c16178eey.gEmmrt = abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eeT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C16178eey.dNCPSb(function12, obj);
            }
        });
    }

    public static final void QUSxYX(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void dNCPSb(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit fetchVPNInfo(C16178eey c16178eey, java.lang.Throwable th) {
        C52794wYp c52794wYp;
        c16178eey.AuCTel();
        c16178eey.KWHzl(false);
        C16483ekl c16483ekl = c16178eey.OLrzqt;
        if (c16483ekl != null && (c52794wYp = c16483ekl.OLrzqt) != null) {
            c52794wYp.setEnabled(false);
        }
        return Unit.INSTANCE;
    }

    public static final void valueOf(final C16178eey c16178eey, android.view.View view, boolean z) {
        C10854bwM c10854bwM;
        if (z || !c16178eey.fJNWhG() || (c10854bwM = c16178eey.AhwBna) == null || c10854bwM.DarRvM()) {
            return;
        }
        c16178eey.KWHzl(new Function1() { // from class: o.efv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16178eey.AYXKKw(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit AYXKKw(C16178eey c16178eey, boolean z) {
        c16178eey.KWHzl(z);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(final C16178eey c16178eey, C14693dqK c14693dqK) {
        Intrinsics.checkNotNullParameter(c14693dqK, "");
        C16267egh c16267egh = new C16267egh();
        c16267egh.EZpvd(new Function1() { // from class: o.eeG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16178eey.OLrzqt(this.EZpvd, (C13924dbk) obj);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = c16178eey.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c14693dqK.EZpvd(childFragmentManager, c16267egh);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C16178eey c16178eey, C13924dbk c13924dbk) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(c13924dbk, "");
        if (c13924dbk.OLrzqt().DarRvM()) {
            java.util.Iterator<T> it = C10598brV.AEQbTJ.gEmmrt().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                CustomChainCoinMeta customChainCoinMeta = (CustomChainCoinMeta) next;
                C10854bwM c10854bwMOLrzqt = c13924dbk.OLrzqt();
                if (c10854bwMOLrzqt != null && customChainCoinMeta.copydefault() == c10854bwMOLrzqt.fetchVPNInfo()) {
                    break;
                }
            }
            c16178eey.fetchVPNInfo = (CustomChainCoinMeta) next;
        }
        c16178eey.fetchVPNInfo().copydefault(c13924dbk);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.eey$Application */
    public static final class Application implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            OLrzqt();
            return Unit.INSTANCE;
        }

        public final void OLrzqt() {
            C16178eey.this.AhwBna();
        }
    }

    public final void AhwBna() {
        java.lang.String strIsConnected;
        CustomChainMeta customChainMetaOLrzqt;
        C10854bwM c10854bwM = this.AhwBna;
        if (c10854bwM != null && !c10854bwM.DarRvM()) {
            KWHzl(new Function1() { // from class: o.efP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C16178eey.copydefault(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            return;
        }
        final java.lang.String strEjfBZ = ejfBZ();
        CustomChainCoinMeta customChainCoinMeta = this.fetchVPNInfo;
        if (customChainCoinMeta == null || (customChainMetaOLrzqt = customChainCoinMeta.OLrzqt()) == null || (strIsConnected = customChainMetaOLrzqt.isConnected()) == null) {
            strIsConnected = "";
        }
        OLrzqt(strIsConnected, strEjfBZ, new Function1() { // from class: o.efW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16178eey.OLrzqt(this.EZpvd, strEjfBZ, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit copydefault(C16178eey c16178eey, boolean z) {
        c16178eey.KWHzl(z);
        if (z) {
            c16178eey.AEQbTJ();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final C16178eey c16178eey, java.lang.String str, boolean z) {
        CustomChainMeta customChainMetaOLrzqt;
        android.text.Editable text;
        android.text.Editable text2;
        java.lang.String string;
        CustomChainMeta customChainMetaOLrzqt2;
        if (z) {
            c16178eey.showLoading();
            CustomChainCoinMeta customChainCoinMeta = c16178eey.fetchVPNInfo;
            final CustomChainCoinMeta customChainCoinMetaKWHzl = C10598brV.AEQbTJ.KWHzl(str, (customChainCoinMeta == null || (customChainMetaOLrzqt2 = customChainCoinMeta.OLrzqt()) == null) ? 0L : customChainMetaOLrzqt2.fetchVPNInfo());
            int iAhwBna = 0;
            if (customChainCoinMetaKWHzl != null) {
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
                final Function1 function1 = new Function1() { // from class: o.efk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C16178eey.copydefault(customChainCoinMetaKWHzl, (AbstractC12782ctV) obj);
                    }
                };
                AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.efn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C16178eey.QOLQEE(function1, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
                AbstractC58260yxt abstractC58260yxtAEQbTJ = C58156yvv.AEQbTJ(abstractC58260yxtOLrzqt, c16178eey, Lifecycle.Event.ON_DESTROY);
                final Function1 function12 = new Function1() { // from class: o.efm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C16178eey.AEQbTJ(this.EZpvd, (java.lang.Long) obj);
                    }
                };
                InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.efj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C16178eey.ORxRYg(function12, obj);
                    }
                };
                final Function1 function13 = new Function1() { // from class: o.efr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C16178eey.AhwBna(this.KWHzl, (java.lang.Throwable) obj);
                    }
                };
                abstractC58260yxtAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.efs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C16178eey.OcIXYQ(function13, obj);
                    }
                });
            } else {
                CustomChainCoinMeta customChainCoinMeta2 = c16178eey.fetchVPNInfo;
                if (customChainCoinMeta2 != null && (customChainMetaOLrzqt = customChainCoinMeta2.OLrzqt()) != null) {
                    C10639bsJ c10639bsJ = C10639bsJ.EZpvd;
                    C55001xbh c55001xbhIsConnected = c16178eey.isConnected();
                    java.lang.String str2 = (c55001xbhIsConnected == null || (text2 = c55001xbhIsConnected.getText()) == null || (string = text2.toString()) == null) ? "" : string;
                    java.lang.String str3 = c16178eey.DbNXlk;
                    C55001xbh c55001xbhAYXKKw = c16178eey.AYXKKw();
                    java.lang.String string2 = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) C33129mqd.gEmmrt(c55001xbhAYXKKw != null ? c55001xbhAYXKKw.getText() : null)).toString();
                    C55001xbh c55001xbhAkhnZx = c16178eey.AkhnZx();
                    if (c55001xbhAkhnZx != null && (text = c55001xbhAkhnZx.getText()) != null) {
                        iAhwBna = C33129mqd.AhwBna(text);
                    }
                    AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl = c10639bsJ.KWHzl(customChainMetaOLrzqt, str2, str3, string2, iAhwBna);
                    final Function1 function14 = new Function1() { // from class: o.efp
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C16178eey.KWHzl(this.AEQbTJ, (java.lang.Boolean) obj);
                        }
                    };
                    InterfaceC58227yxM<? super java.lang.Boolean> interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.efq
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            C16178eey.QfsBiF(function14, obj);
                        }
                    };
                    final Function1 function15 = new Function1() { // from class: o.efo
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C16178eey.isConnected(this.OLrzqt, (java.lang.Throwable) obj);
                        }
                    };
                    abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.efw
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            C16178eey.QVAiDq(function15, obj);
                        }
                    });
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final InterfaceC58261yxu QOLQEE(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(CustomChainCoinMeta customChainCoinMeta, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if (abstractC12782ctV.AkhnZx(customChainCoinMeta.AkhnZx())) {
            AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(0L);
            Intrinsics.copydefault(abstractC58260yxtCopydefault);
            return abstractC58260yxtCopydefault;
        }
        return abstractC12782ctV.getNewProxyInstance(customChainCoinMeta.valueOf());
    }

    public static final void ORxRYg(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C16178eey c16178eey, java.lang.Long l) {
        c16178eey.dismissLoading();
        RxBus.AEQbTJ(new C9934beu());
        FragmentActivity activity = c16178eey.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    public static final void OcIXYQ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AhwBna(C16178eey c16178eey, java.lang.Throwable th) {
        c16178eey.dismissLoading();
        java.lang.String message = th.getMessage();
        if (message != null) {
            C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final void QfsBiF(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C16178eey c16178eey, java.lang.Boolean bool) {
        c16178eey.dismissLoading();
        RxBus.AEQbTJ(new C9934beu());
        FragmentActivity activity = c16178eey.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    public static final void QVAiDq(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit isConnected(C16178eey c16178eey, java.lang.Throwable th) {
        c16178eey.dismissLoading();
        java.lang.String message = th.getMessage();
        if (message != null) {
            C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.eey */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void dealRiskError$default(C16178eey c16178eey, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        c16178eey.EZpvd((Function0<Unit>) function0);
    }

    public final void EZpvd(Function0<Unit> function0) {
        java.lang.String strOLrzqt;
        C14128dfc c14128dfc = C14128dfc.KWHzl;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        android.content.res.Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        int i = C13754dXa.FragmentManager.conditional;
        C13916dbc c13916dbc = this.KWHzl;
        kotlin.Pair pairKWHzl = c14128dfc.KWHzl(activity, resources, i, "detail", (96 & 16) != 0 ? "" : (c13916dbc == null || (strOLrzqt = c13916dbc.OLrzqt()) == null) ? "" : strOLrzqt, (96 & 32) != 0 ? null : null, (96 & 64) != 0 ? null : null, (96 & 128) != 0 ? null : new Function0() { // from class: o.efx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C16178eey.valueOf(this.OLrzqt);
            }
        });
        C57445yiZ c57445yiZ = C57445yiZ.copydefault;
        FragmentActivity activity2 = getActivity();
        if (activity2 == null) {
            return;
        }
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        c57445yiZ.copydefault(activity2, parentFragmentManager, C13754dXa.ActionBar.aeJQwa, new RiskPageInfoBean(C33070mpX.AYXKKw(C13754dXa.FragmentManager.anyOf), (java.lang.CharSequence) pairKWHzl.getFirst(), (java.lang.CharSequence) pairKWHzl.getSecond(), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaSession), C33070mpX.AYXKKw(C13754dXa.FragmentManager.RequiresPermission), null, null, null, null, null, true, 992, null), (496 & 16) != 0 ? null : null, (496 & 32) != 0 ? null : function0, (496 & 64) != 0 ? null : null, (496 & 128) != 0 ? null : null, (496 & 256) != 0 ? null : null);
    }

    public static final Unit valueOf(C16178eey c16178eey) {
        C10854bwM c10854bwM = c16178eey.AhwBna;
        if (c10854bwM != null) {
            OKDSourceType oKDSourceType = OKDSourceType.WALLET_SOURCE;
            long jFetchVPNInfo = c10854bwM.fetchVPNInfo();
            OKDCoinDetailConfig oKDCoinDetailConfig = new OKDCoinDetailConfig(oKDSourceType, java.lang.String.valueOf(jFetchVPNInfo), c16178eey.ejfBZ(), c10854bwM.fJNWhG(), null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
            gKO gko = (gKO) C43251rlk.copydefault(gKO.class);
            FragmentActivity fragmentActivityRequireActivity = c16178eey.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            gko.OLrzqt(fragmentActivityRequireActivity, oKDCoinDetailConfig);
        }
        return Unit.INSTANCE;
    }

    public final boolean fJNWhG() {
        C10854bwM c10854bwM = this.AhwBna;
        if (c10854bwM != null && c10854bwM.UlJrfe()) {
            if (getTextOf$default(this, AYXKKw(), false, 2, null).length() <= 0 || OLrzqt((android.widget.TextView) isConnected(), false).length() <= 0) {
                return false;
            }
        } else if (getTextOf$default(this, AYXKKw(), false, 2, null).length() <= 0) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ java.lang.String getTextOf$default(C16178eey c16178eey, android.widget.TextView textView, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c16178eey.OLrzqt(textView, z);
    }

    public final java.lang.String OLrzqt(android.widget.TextView textView, boolean z) {
        if (z) {
            return StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) C33129mqd.gEmmrt(textView != null ? textView.getText() : null)).toString();
        }
        return C33129mqd.gEmmrt(textView != null ? textView.getText() : null);
    }

    public final void AEQbTJ(final java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        C32866mlf.onEvent$default("Web3_CustomCrypto_Page_Submit", (TrackChannel[]) null, new Function1() { // from class: o.eft
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16178eey.EZpvd(str, str2, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("chain", str, false);
        if (str2 != null) {
            eventParamsList.put(MTCoreConstants.Protocol.KEY_PROTOCOL, str2, false);
        }
        eventParamsList.put("token", str3, false);
        return Unit.INSTANCE;
    }

    public final void copydefault(final java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        C32866mlf.onEvent$default("Web3WalletHomepage_ManageCrypto_AddCrypto_Click", (TrackChannel[]) null, new Function1() { // from class: o.eeA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16178eey.OLrzqt(str, str2, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_symbol", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_symbol", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_contract_address", str3, false, 4, null);
        eventParamsList.put("source_page", "custom_crypto", true);
        return Unit.INSTANCE;
    }

    private final void hDKMBd() {
        android.widget.FrameLayout frameLayout;
        android.widget.RelativeLayout relativeLayout;
        android.widget.FrameLayout frameLayout2;
        android.widget.FrameLayout frameLayout3;
        android.widget.RelativeLayout relativeLayout2;
        android.widget.FrameLayout frameLayout4;
        showLoading();
        java.lang.Object obj = null;
        if (this.copydefault >= Long.MIN_VALUE) {
            dismissLoading();
            C16483ekl c16483ekl = this.OLrzqt;
            if (c16483ekl != null && (frameLayout4 = c16483ekl.AYXKKw) != null) {
                C6980aZc.OLrzqt(this, frameLayout4);
            }
            C16483ekl c16483ekl2 = this.OLrzqt;
            if (c16483ekl2 != null && (relativeLayout2 = c16483ekl2.AhwBna) != null) {
                relativeLayout2.setVisibility(0);
            }
            C16483ekl c16483ekl3 = this.OLrzqt;
            if (c16483ekl3 != null && (frameLayout3 = c16483ekl3.AYXKKw) != null) {
                frameLayout3.setVisibility(8);
            }
            java.util.Iterator<T> it = C10598brV.AEQbTJ.gEmmrt().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((CustomChainCoinMeta) next).copydefault() == this.copydefault) {
                    obj = next;
                    break;
                }
            }
            CustomChainCoinMeta customChainCoinMeta = (CustomChainCoinMeta) obj;
            this.fetchVPNInfo = customChainCoinMeta;
            copydefault(copydefault(customChainCoinMeta));
            return;
        }
        dismissLoading();
        C16483ekl c16483ekl4 = this.OLrzqt;
        if (c16483ekl4 != null && (frameLayout2 = c16483ekl4.AYXKKw) != null) {
            C6980aZc.OLrzqt(this, frameLayout2);
        }
        C16483ekl c16483ekl5 = this.OLrzqt;
        if (c16483ekl5 != null && (relativeLayout = c16483ekl5.AhwBna) != null) {
            relativeLayout.setVisibility(0);
        }
        C16483ekl c16483ekl6 = this.OLrzqt;
        if (c16483ekl6 != null && (frameLayout = c16483ekl6.AYXKKw) != null) {
            frameLayout.setVisibility(8);
        }
        java.util.Iterator<T> it2 = C10598brV.AEQbTJ.gEmmrt().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            java.lang.Object next2 = it2.next();
            if (((CustomChainCoinMeta) next2).copydefault() == this.copydefault) {
                obj = next2;
                break;
            }
        }
        CustomChainCoinMeta customChainCoinMeta2 = (CustomChainCoinMeta) obj;
        this.fetchVPNInfo = customChainCoinMeta2;
        copydefault(copydefault(customChainCoinMeta2));
    }

    public final C13924dbk copydefault(CustomChainCoinMeta customChainCoinMeta) {
        C10854bwM c10854bwMAEQbTJ;
        if (customChainCoinMeta == null || (c10854bwMAEQbTJ = customChainCoinMeta.AEQbTJ()) == null) {
            return null;
        }
        this.AhwBna = c10854bwMAEQbTJ;
        return new C13924dbk(c10854bwMAEQbTJ, customChainCoinMeta.fetchVPNInfo());
    }

    public final void copydefault(C13924dbk c13924dbk) {
        C55008xbo c55008xbo;
        C55008xbo c55008xbo2;
        C55008xbo c55008xbo3;
        C55008xbo c55008xbo4;
        C55008xbo c55008xbo5;
        C55008xbo c55008xbo6;
        C55008xbo c55008xbo7;
        C55008xbo c55008xbo8;
        C55239xgG c55239xgG;
        ConstraintLayout constraintLayout;
        java.lang.String strOLrzqt;
        java.lang.String strDjBIcL;
        java.lang.Character chWlaJM;
        java.lang.String string;
        C14693dqK c14693dqK;
        java.lang.String strDjBIcL2;
        C10854bwM c10854bwMOLrzqt;
        C55008xbo c55008xbo9;
        C55008xbo c55008xbo10;
        C55008xbo c55008xbo11;
        C55008xbo c55008xbo12;
        android.widget.ImageView imageView;
        C55239xgG c55239xgG2;
        ConstraintLayout constraintLayout2;
        C55008xbo c55008xbo13;
        C55008xbo c55008xbo14;
        C55008xbo c55008xbo15;
        C55008xbo c55008xbo16;
        C55008xbo c55008xbo17;
        C55008xbo c55008xbo18;
        C55008xbo c55008xbo19;
        C55018xby c55018xby;
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        C10854bwM c10854bwMOLrzqt2 = c13924dbk != null ? c13924dbk.OLrzqt() : null;
        C16483ekl c16483ekl = this.OLrzqt;
        if (c16483ekl != null && (c55018xby = c16483ekl.KWHzl) != null) {
            c55018xby.setVisibility(CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.Long>) ((java.lang.Iterable<? extends java.lang.Object>) C16260ega.AEQbTJ()), c10854bwMOLrzqt2 != null ? java.lang.Long.valueOf(c10854bwMOLrzqt2.fetchVPNInfo()) : null) ? 0 : 8);
        }
        if (c10854bwMOLrzqt2 != null && c10854bwMOLrzqt2.iRxXKY()) {
            C16483ekl c16483ekl2 = this.OLrzqt;
            if (c16483ekl2 != null && (c55008xbo19 = c16483ekl2.EZpvd) != null) {
                c55008xbo19.setVisibility(0);
            }
            java.lang.Integer numAEQbTJ = fetchVPNInfo().AEQbTJ();
            int protocolId = OKWXRCProtocolEnum.FRACTAL_CAT20.getProtocolId();
            if (numAEQbTJ != null && numAEQbTJ.intValue() == protocolId) {
                C16483ekl c16483ekl3 = this.OLrzqt;
                if (c16483ekl3 != null && (c55008xbo18 = c16483ekl3.DbNXlk) != null) {
                    c55008xbo18.setVisibility(0);
                }
                C16483ekl c16483ekl4 = this.OLrzqt;
                if (c16483ekl4 != null && (c55008xbo17 = c16483ekl4.djBIcL) != null) {
                    c55008xbo17.setVisibility(0);
                }
                C16483ekl c16483ekl5 = this.OLrzqt;
                if (c16483ekl5 != null && (c55008xbo16 = c16483ekl5.valueOf) != null) {
                    c55008xbo16.setVisibility(8);
                }
            } else {
                C16483ekl c16483ekl6 = this.OLrzqt;
                if (c16483ekl6 != null && (c55008xbo15 = c16483ekl6.DbNXlk) != null) {
                    c55008xbo15.setVisibility(8);
                }
                C16483ekl c16483ekl7 = this.OLrzqt;
                if (c16483ekl7 != null && (c55008xbo14 = c16483ekl7.djBIcL) != null) {
                    c55008xbo14.setVisibility(8);
                }
                C16483ekl c16483ekl8 = this.OLrzqt;
                if (c16483ekl8 != null && (c55008xbo13 = c16483ekl8.valueOf) != null) {
                    c55008xbo13.setVisibility(8);
                }
            }
        } else if (c10854bwMOLrzqt2 == null || !c10854bwMOLrzqt2.UlJrfe()) {
            C16483ekl c16483ekl9 = this.OLrzqt;
            if (c16483ekl9 != null && (c55008xbo4 = c16483ekl9.EZpvd) != null) {
                c55008xbo4.setVisibility(8);
            }
            C16483ekl c16483ekl10 = this.OLrzqt;
            if (c16483ekl10 != null && (c55008xbo3 = c16483ekl10.DbNXlk) != null) {
                c55008xbo3.setVisibility(0);
            }
            C16483ekl c16483ekl11 = this.OLrzqt;
            if (c16483ekl11 != null && (c55008xbo2 = c16483ekl11.djBIcL) != null) {
                c55008xbo2.setVisibility(0);
            }
            C16483ekl c16483ekl12 = this.OLrzqt;
            if (c16483ekl12 != null && (c55008xbo = c16483ekl12.valueOf) != null) {
                c55008xbo.setVisibility(0);
            }
        } else {
            C16483ekl c16483ekl13 = this.OLrzqt;
            if (c16483ekl13 != null && (c55008xbo8 = c16483ekl13.EZpvd) != null) {
                c55008xbo8.setVisibility(8);
            }
            C16483ekl c16483ekl14 = this.OLrzqt;
            if (c16483ekl14 != null && (c55008xbo7 = c16483ekl14.valueOf) != null) {
                c55008xbo7.setVisibility(0);
            }
            C16483ekl c16483ekl15 = this.OLrzqt;
            if (c16483ekl15 != null && (c55008xbo6 = c16483ekl15.DbNXlk) != null) {
                c55008xbo6.setVisibility(0);
            }
            C16483ekl c16483ekl16 = this.OLrzqt;
            if (c16483ekl16 != null && (c55008xbo5 = c16483ekl16.djBIcL) != null) {
                c55008xbo5.setVisibility(8);
            }
        }
        if (c10854bwMOLrzqt2 == null || c10854bwMOLrzqt2.fetchVPNInfo() != 1) {
            C16483ekl c16483ekl17 = this.OLrzqt;
            if (c16483ekl17 != null && (constraintLayout = c16483ekl17.copydefault) != null) {
                constraintLayout.setVisibility(8);
            }
            C16483ekl c16483ekl18 = this.OLrzqt;
            if (c16483ekl18 != null && (c55239xgG = c16483ekl18.gEmmrt) != null) {
                c55239xgG.setChecked(false);
            }
        } else {
            C16483ekl c16483ekl19 = this.OLrzqt;
            if (c16483ekl19 != null && (constraintLayout2 = c16483ekl19.copydefault) != null) {
                constraintLayout2.setVisibility(8);
            }
            C16483ekl c16483ekl20 = this.OLrzqt;
            if (c16483ekl20 != null && (c55239xgG2 = c16483ekl20.gEmmrt) != null) {
                c55239xgG2.setChecked(false);
            }
            C16483ekl c16483ekl21 = this.OLrzqt;
            if (c16483ekl21 != null && (imageView = c16483ekl21.AEQbTJ) != null) {
                imageView.setOnClickListener(new ActionBar(imageView, 1000L, context));
            }
        }
        int i = C13754dXa.FragmentManager.RTWSvT;
        int i2 = C13754dXa.FragmentManager.iHkeWl;
        int i3 = C13754dXa.FragmentManager.UccSpe;
        int i4 = C13754dXa.FragmentManager.RzdrRQ;
        if (c10854bwMOLrzqt2 != null && c10854bwMOLrzqt2.fetchVPNInfo() == 607) {
            i = C13754dXa.FragmentManager.addReporter;
            i2 = C13754dXa.FragmentManager.onStart;
        } else if (c10854bwMOLrzqt2 != null && c10854bwMOLrzqt2.UlJrfe()) {
            i = C13754dXa.FragmentManager.setDisplayShowCustomEnabled;
            i2 = C13754dXa.FragmentManager.setHideOffset;
            i3 = C13754dXa.FragmentManager.setDisplayHomeAsUpEnabled;
            i4 = C13754dXa.FragmentManager.setHideOnContentScrollEnabled;
        } else if (c10854bwMOLrzqt2 != null && c10854bwMOLrzqt2.RlQdEF()) {
            i = C13754dXa.FragmentManager.getFlags;
        }
        C16483ekl c16483ekl22 = this.OLrzqt;
        java.lang.String str = "";
        if (c16483ekl22 != null && (c55008xbo12 = c16483ekl22.valueOf) != null) {
            java.lang.String string2 = getString(i);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            c55008xbo12.setLabelText(string2);
        }
        C16483ekl c16483ekl23 = this.OLrzqt;
        if (c16483ekl23 != null && (c55008xbo11 = c16483ekl23.valueOf) != null) {
            c55008xbo11.setHintText(getString(i2));
        }
        C16483ekl c16483ekl24 = this.OLrzqt;
        if (c16483ekl24 != null && (c55008xbo10 = c16483ekl24.DbNXlk) != null) {
            java.lang.String string3 = getString(i3);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            c55008xbo10.setLabelText(string3);
        }
        C16483ekl c16483ekl25 = this.OLrzqt;
        if (c16483ekl25 != null && (c55008xbo9 = c16483ekl25.DbNXlk) != null) {
            c55008xbo9.setHintText(getString(i4));
        }
        C10854bwM c10854bwM = this.AhwBna;
        if (!Intrinsics.EZpvd(c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.AhwBna()) : null, c10854bwMOLrzqt2 != null ? java.lang.Long.valueOf(c10854bwMOLrzqt2.AhwBna()) : null)) {
            this.AhwBna = c10854bwMOLrzqt2;
            C55001xbh c55001xbhAYXKKw = AYXKKw();
            if (c55001xbhAYXKKw != null) {
                c55001xbhAYXKKw.setText("");
            }
            C55001xbh c55001xbhIsConnected = isConnected();
            if (c55001xbhIsConnected != null) {
                c55001xbhIsConnected.setText("");
            }
            C55001xbh c55001xbhAkhnZx = AkhnZx();
            if (c55001xbhAkhnZx != null) {
                c55001xbhAkhnZx.setText("");
            }
            C55001xbh c55001xbhIsConnected2 = isConnected();
            if (c55001xbhIsConnected2 != null) {
                c55001xbhIsConnected2.setEnabled(true);
            }
            C55001xbh c55001xbhAkhnZx2 = AkhnZx();
            if (c55001xbhAkhnZx2 != null) {
                c55001xbhAkhnZx2.setEnabled(true);
            }
        }
        if (c13924dbk != null && (c10854bwMOLrzqt = c13924dbk.OLrzqt()) != null && !c10854bwMOLrzqt.DarRvM()) {
            strOLrzqt = c13924dbk.AEQbTJ();
        } else if (c10854bwMOLrzqt2 == null || (strDjBIcL = c10854bwMOLrzqt2.djBIcL()) == null || (chWlaJM = C59454zhO.wlaJM(strDjBIcL)) == null || (string = chWlaJM.toString()) == null || (strOLrzqt = C9700baY.OLrzqt(string)) == null) {
            strOLrzqt = "";
        }
        pUU.OLrzqt(">>>chain network: imageUrl:" + strOLrzqt);
        Glide.AEQbTJ(context).EZpvd(strOLrzqt).OLrzqt(new Dialog(C55298xhM.KWHzl(20.0f, context), C55298xhM.KWHzl(20.0f, context)));
        C16483ekl c16483ekl26 = this.OLrzqt;
        if (c16483ekl26 == null || (c14693dqK = c16483ekl26.values) == null) {
            return;
        }
        C10854bwM c10854bwM2 = this.AhwBna;
        if (c10854bwM2 != null && (strDjBIcL2 = c10854bwM2.djBIcL()) != null) {
            str = strDjBIcL2;
        }
        c14693dqK.setSelectionText(str);
    }

    /* JADX INFO: renamed from: o.eey$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.AEQbTJ = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.AEQbTJ.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.eey$Dialog */
    public static final class Dialog extends AbstractC5449Sd<android.graphics.drawable.Drawable> {
        public Dialog(int i, int i2) {
            super(i, i2);
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
        @Override // o.InterfaceC5462Sq
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void copydefault(android.graphics.drawable.Drawable drawable, InterfaceC5460So<? super android.graphics.drawable.Drawable> interfaceC5460So) {
            C14693dqK c14693dqK;
            Intrinsics.checkNotNullParameter(drawable, "");
            C16483ekl c16483ekl = C16178eey.this.OLrzqt;
            if (c16483ekl == null || (c14693dqK = c16483ekl.values) == null) {
                return;
            }
            C14693dqK.setStartIconWithIntrinsicBounds$default(c14693dqK, drawable, 0, 2, null);
        }

        @Override // o.InterfaceC5462Sq
        public void a_(android.graphics.drawable.Drawable drawable) {
            C14693dqK c14693dqK;
            C16483ekl c16483ekl = C16178eey.this.OLrzqt;
            if (c16483ekl == null || (c14693dqK = c16483ekl.values) == null) {
                return;
            }
            c14693dqK.KWHzl();
        }
    }

    public static final Unit EZpvd(C16178eey c16178eey, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c16178eey.copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C16178eey c16178eey, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c16178eey.copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C16178eey c16178eey, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c16178eey.copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C16178eey c16178eey, java.lang.String str) {
        C52794wYp c52794wYp;
        Intrinsics.checkNotNullParameter(str, "");
        c16178eey.copydefault();
        C55001xbh c55001xbhValues = c16178eey.values();
        android.text.Editable text = c55001xbhValues != null ? c55001xbhValues.getText() : null;
        if (text == null || text.length() == 0) {
            c16178eey.valueOf();
            C16483ekl c16483ekl = c16178eey.OLrzqt;
            if (c16483ekl != null && (c52794wYp = c16483ekl.OLrzqt) != null) {
                c52794wYp.setEnabled(false);
            }
        }
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        C52794wYp c52794wYp;
        boolean zKWHzl = KWHzl();
        C16483ekl c16483ekl = this.OLrzqt;
        if (c16483ekl == null || (c52794wYp = c16483ekl.OLrzqt) == null) {
            return;
        }
        c52794wYp.setEnabled(zKWHzl);
    }

    public final boolean KWHzl() {
        C10854bwM c10854bwM = this.AhwBna;
        return ((c10854bwM != null && c10854bwM.iRxXKY()) || getTextOf$default(this, AYXKKw(), false, 2, null).length() == 0 || getTextOf$default(this, AkhnZx(), false, 2, null).length() == 0) ? false : true;
    }

    public final void AuCTel() {
        C55008xbo c55008xbo;
        C55008xbo c55008xbo2;
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        C10854bwM c10854bwM = this.AhwBna;
        if (c10854bwM == null || !c10854bwM.iRxXKY()) {
            C16483ekl c16483ekl = this.OLrzqt;
            if (c16483ekl == null || (c55008xbo = c16483ekl.valueOf) == null) {
                return;
            }
            java.lang.CharSequence text = context.getText(C13754dXa.FragmentManager.siEkQe);
            Intrinsics.checkNotNullExpressionValue(text, "");
            c55008xbo.setErrorText(text);
            return;
        }
        C16483ekl c16483ekl2 = this.OLrzqt;
        if (c16483ekl2 == null || (c55008xbo2 = c16483ekl2.EZpvd) == null) {
            return;
        }
        java.lang.CharSequence text2 = context.getText(C13754dXa.FragmentManager.setSubtitle);
        Intrinsics.checkNotNullExpressionValue(text2, "");
        c55008xbo2.setErrorText(text2);
    }

    public final void valueOf() {
        C55008xbo c55008xbo;
        C55008xbo c55008xbo2;
        C10854bwM c10854bwM = this.AhwBna;
        if (c10854bwM == null || !c10854bwM.iRxXKY()) {
            C16483ekl c16483ekl = this.OLrzqt;
            if (c16483ekl == null || (c55008xbo = c16483ekl.valueOf) == null) {
                return;
            }
            c55008xbo.values();
            return;
        }
        C16483ekl c16483ekl2 = this.OLrzqt;
        if (c16483ekl2 == null || (c55008xbo2 = c16483ekl2.EZpvd) == null) {
            return;
        }
        c55008xbo2.values();
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        C55239xgG c55239xgG;
        C55239xgG c55239xgG2;
        if (C59449zhJ.startsWith$default(str, "facet_", false, 2, null)) {
            return str;
        }
        C16483ekl c16483ekl = this.OLrzqt;
        boolean zIsChecked = (c16483ekl == null || (c55239xgG2 = c16483ekl.gEmmrt) == null) ? false : c55239xgG2.isChecked();
        C10854bwM c10854bwM = this.AhwBna;
        if (c10854bwM == null || c10854bwM.fetchVPNInfo() != 1 || !zIsChecked) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        C16483ekl c16483ekl2 = this.OLrzqt;
        if (c16483ekl2 != null && (c55239xgG = c16483ekl2.gEmmrt) != null && c55239xgG.isChecked()) {
            sb.insert(0, "facet_");
        }
        return C33129mqd.gEmmrt(sb);
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2, final Function1<? super java.lang.Boolean, Unit> function1) {
        AbstractC58260yxt abstractC58260yxtAEQbTJ = C58156yvv.AEQbTJ(C10734btz.KWHzl.KWHzl(str, OLrzqt(str2)), this, Lifecycle.Event.ON_DESTROY);
        final Function1 function12 = new Function1() { // from class: o.eeH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16178eey.OLrzqt(function1, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eeF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C16178eey.AxsJAY(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.eeN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16178eey.OLrzqt(function1, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eeM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C16178eey.gHZMYf(function13, obj);
            }
        });
    }

    public static final void AxsJAY(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Function1 function1, java.lang.Boolean bool) {
        Intrinsics.copydefault(bool);
        function1.invoke(bool);
        return Unit.INSTANCE;
    }

    public static final void gHZMYf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Function1 function1, java.lang.Throwable th) {
        function1.invoke(java.lang.Boolean.FALSE);
        return Unit.INSTANCE;
    }

    private final java.lang.String ejfBZ() {
        C10854bwM c10854bwM = this.AhwBna;
        if (c10854bwM != null && c10854bwM.iRxXKY()) {
            return OLrzqt((android.widget.TextView) values(), false);
        }
        C10854bwM c10854bwM2 = this.AhwBna;
        if (c10854bwM2 != null && c10854bwM2.OBJEWx()) {
            return OLrzqt(getTextOf$default(this, AYXKKw(), false, 2, null));
        }
        C10854bwM c10854bwM3 = this.AhwBna;
        if (c10854bwM3 != null && c10854bwM3.DGOPHZ()) {
            return fetchVPNInfo().OLrzqt(getTextOf$default(this, AYXKKw(), false, 2, null));
        }
        return getTextOf$default(this, AYXKKw(), false, 2, null);
    }

    private final java.lang.String fIwbmz() {
        C10854bwM c10854bwM = this.AhwBna;
        if (c10854bwM == null || !c10854bwM.UlJrfe()) {
            return null;
        }
        return OLrzqt((android.widget.TextView) isConnected(), false);
    }

    public final void KWHzl(boolean z) {
        C55001xbh c55001xbhIsConnected;
        C10854bwM c10854bwM = this.AhwBna;
        if (c10854bwM != null && c10854bwM.UlJrfe()) {
            C55001xbh c55001xbhIsConnected2 = isConnected();
            if (c55001xbhIsConnected2 != null) {
                c55001xbhIsConnected2.setEnabled(true);
            }
        } else {
            C55001xbh c55001xbhIsConnected3 = isConnected();
            if (c55001xbhIsConnected3 != null) {
                c55001xbhIsConnected3.setEnabled(!z);
            }
        }
        C55001xbh c55001xbhAkhnZx = AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setEnabled(!z);
        }
        if (z) {
            C55001xbh c55001xbhIsConnected4 = isConnected();
            if (c55001xbhIsConnected4 != null) {
                C13916dbc c13916dbc = this.KWHzl;
                c55001xbhIsConnected4.setText(c13916dbc != null ? c13916dbc.EZpvd() : null);
            }
            C55001xbh c55001xbhAkhnZx2 = AkhnZx();
            if (c55001xbhAkhnZx2 != null) {
                C13916dbc c13916dbc2 = this.KWHzl;
                c55001xbhAkhnZx2.setText(c13916dbc2 != null ? c13916dbc2.copydefault() : null);
                return;
            }
            return;
        }
        C10854bwM c10854bwM2 = this.AhwBna;
        if ((c10854bwM2 == null || !c10854bwM2.UlJrfe()) && (c55001xbhIsConnected = isConnected()) != null) {
            c55001xbhIsConnected.setText("");
        }
        C55001xbh c55001xbhAkhnZx3 = AkhnZx();
        if (c55001xbhAkhnZx3 != null) {
            c55001xbhAkhnZx3.setText("");
        }
    }

    public final void KWHzl(final Function1<? super java.lang.Boolean, Unit> function1) {
        showLoading();
        java.lang.String strEjfBZ = ejfBZ();
        C10407bnq instance$default = C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null);
        C10854bwM c10854bwM = this.AhwBna;
        AbstractC58185ywX<ResponseData<ContractAddressResp>> abstractC58185ywXCopydefault = instance$default.copydefault(c10854bwM != null ? c10854bwM.AEQbTJ() : 0L, strEjfBZ, fetchVPNInfo().AEQbTJ(), fIwbmz());
        final Function1 function12 = new Function1() { // from class: o.eeQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16178eey.copydefault(this.KWHzl, function1, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<ContractAddressResp>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eeS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C16178eey.AubY(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.eeR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16178eey.KWHzl(this.copydefault, function1, (java.lang.Throwable) obj);
            }
        };
        this.EZpvd = abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eeX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C16178eey.sSMYrx(function13, obj);
            }
        });
    }

    public static final void AubY(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C16178eey c16178eey, Function1 function1, ResponseData responseData) {
        C13916dbc c13916dbc;
        java.lang.String riskJumpUrl;
        C13916dbc c13916dbc2;
        C13916dbc c13916dbc3;
        C13916dbc c13916dbc4;
        C13916dbc c13916dbc5;
        c16178eey.djBIcL();
        c16178eey.dismissLoading();
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            ContractAddressResp contractAddressResp = (ContractAddressResp) responseData.getData();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (contractAddressResp != null ? contractAddressResp.getSymbol() : null)) && (c13916dbc5 = c16178eey.KWHzl) != null) {
                ContractAddressResp contractAddressResp2 = (ContractAddressResp) responseData.getData();
                c13916dbc5.EZpvd(java.lang.String.valueOf(contractAddressResp2 != null ? contractAddressResp2.getSymbol() : null));
            }
            ContractAddressResp contractAddressResp3 = (ContractAddressResp) responseData.getData();
            if ((contractAddressResp3 != null ? java.lang.Integer.valueOf(contractAddressResp3.getPrecision()) : null) != null && (c13916dbc4 = c16178eey.KWHzl) != null) {
                ContractAddressResp contractAddressResp4 = (ContractAddressResp) responseData.getData();
                c13916dbc4.OLrzqt(C33129mqd.AYXKKw(contractAddressResp4 != null ? java.lang.Integer.valueOf(contractAddressResp4.getPrecision()) : null));
            }
            ContractAddressResp contractAddressResp5 = (ContractAddressResp) responseData.getData();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (contractAddressResp5 != null ? contractAddressResp5.getContractAddress() : null)) && (c13916dbc3 = c16178eey.KWHzl) != null) {
                ContractAddressResp contractAddressResp6 = (ContractAddressResp) responseData.getData();
                c13916dbc3.copydefault(C33129mqd.gEmmrt(contractAddressResp6 != null ? contractAddressResp6.getContractAddress() : null));
            }
            ContractAddressResp contractAddressResp7 = (ContractAddressResp) responseData.getData();
            if ((contractAddressResp7 != null ? java.lang.Integer.valueOf(contractAddressResp7.getRiskType()) : null) != null && (c13916dbc2 = c16178eey.KWHzl) != null) {
                ContractAddressResp contractAddressResp8 = (ContractAddressResp) responseData.getData();
                c13916dbc2.KWHzl(contractAddressResp8 != null ? contractAddressResp8.getRiskType() : 0);
            }
            ContractAddressResp contractAddressResp9 = (ContractAddressResp) responseData.getData();
            java.lang.String riskJumpUrl2 = contractAddressResp9 != null ? contractAddressResp9.getRiskJumpUrl() : null;
            java.lang.String str = "";
            if (!Intrinsics.EZpvd((java.lang.Object) riskJumpUrl2, (java.lang.Object) "") && (c13916dbc = c16178eey.KWHzl) != null) {
                ContractAddressResp contractAddressResp10 = (ContractAddressResp) responseData.getData();
                if (contractAddressResp10 != null && (riskJumpUrl = contractAddressResp10.getRiskJumpUrl()) != null) {
                    str = riskJumpUrl;
                }
                c13916dbc.KWHzl(str);
            }
            function1.invoke(java.lang.Boolean.TRUE);
            c16178eey.valueOf();
        } else {
            C55326xho.toast$default(responseData.getMsg(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            C10854bwM c10854bwM = c16178eey.AhwBna;
            if (c10854bwM != null && c10854bwM.UlJrfe()) {
                c16178eey.valueOf();
            } else {
                c16178eey.AuCTel();
            }
            function1.invoke(java.lang.Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    public static final void sSMYrx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C16178eey c16178eey, Function1 function1, java.lang.Throwable th) {
        pUU.copydefault(c16178eey.getTAG(), "checkContract checkContractAddress error message : " + th.getMessage());
        function1.invoke(java.lang.Boolean.FALSE);
        c16178eey.dismissLoading();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ() {
        java.lang.String strDjBIcL;
        java.lang.Long lValueOf;
        long jAEQbTJ;
        showLoading();
        C13916dbc c13916dbc = this.KWHzl;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(c13916dbc != null ? c13916dbc.KWHzl() : null);
        C13916dbc c13916dbc2 = this.KWHzl;
        final java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(c13916dbc2 != null ? c13916dbc2.EZpvd() : null);
        C13916dbc c13916dbc3 = this.KWHzl;
        int iAhwBna = C33129mqd.AhwBna(c13916dbc3 != null ? c13916dbc3.copydefault() : null);
        pUU.KWHzl(getTAG(), "addCustomToken contract:" + strGEmmrt + " symbol:" + strGEmmrt2 + " decimal:" + iAhwBna);
        java.lang.String tag = getTAG();
        C10854bwM c10854bwM = this.AhwBna;
        pUU.KWHzl(tag, "addCustomToken generalChainId:" + (c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.fetchVPNInfo()) : null));
        C10948byA c10948byAValueOf = C10954byG.EZpvd.valueOf();
        C10854bwM c10854bwM2 = this.AhwBna;
        final C10854bwM c10854bwMEZpvd = c10948byAValueOf.EZpvd(strGEmmrt, c10854bwM2 != null ? c10854bwM2.fetchVPNInfo() : -1L);
        pUU.KWHzl(getTAG(), "addCustomToken coinMeta:" + (c10854bwMEZpvd != null ? c10854bwMEZpvd.fJNWhG() : null));
        C16204efX c16204efXFetchVPNInfo = fetchVPNInfo();
        java.lang.String name = C16178eey.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        if (c10854bwMEZpvd == null || (strDjBIcL = c10854bwMEZpvd.djBIcL()) == null) {
            C10854bwM c10854bwM3 = this.AhwBna;
            strDjBIcL = c10854bwM3 != null ? c10854bwM3.djBIcL() : null;
        }
        if (c10854bwMEZpvd != null) {
            jAEQbTJ = c10854bwMEZpvd.AEQbTJ();
        } else {
            C10854bwM c10854bwM4 = this.AhwBna;
            if (c10854bwM4 == null) {
                lValueOf = null;
                c16204efXFetchVPNInfo.AEQbTJ(name, strDjBIcL, lValueOf, strGEmmrt2);
                if (c10854bwMEZpvd == null) {
                    AEQbTJ(c10854bwMEZpvd.djBIcL(), c10854bwMEZpvd.dNCPSb(), strGEmmrt2);
                    AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
                    final Function1 function1 = new Function1() { // from class: o.efb
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C16178eey.copydefault(c10854bwMEZpvd, (AbstractC12782ctV) obj);
                        }
                    };
                    AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.eeZ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58229yxO
                        public final java.lang.Object apply(java.lang.Object obj) {
                            return C16178eey.hDKMBd(function1, obj);
                        }
                    });
                    final Function1 function12 = new Function1() { // from class: o.efc
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C16178eey.OLrzqt(this.KWHzl, strGEmmrt2, c10854bwMEZpvd, (java.lang.Integer) obj);
                        }
                    };
                    InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.efa
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            C16178eey.AuCTelauCTel(function12, obj);
                        }
                    };
                    final Function1 function13 = new Function1() { // from class: o.efd
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C16178eey.gEmmrt(this.AEQbTJ, (java.lang.Throwable) obj);
                        }
                    };
                    this.valueOf = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.efi
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            C16178eey.zLjUOn(function13, obj);
                        }
                    });
                    return;
                }
                C10854bwM c10854bwM5 = this.AhwBna;
                java.lang.String strDjBIcL2 = c10854bwM5 != null ? c10854bwM5.djBIcL() : null;
                java.lang.String str = strDjBIcL2 != null ? strDjBIcL2 : "";
                C10854bwM c10854bwM6 = this.AhwBna;
                AEQbTJ(str, c10854bwM6 != null ? c10854bwM6.dNCPSb() : null, strGEmmrt2);
                C10407bnq instance$default = C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null);
                C10854bwM c10854bwM7 = this.AhwBna;
                if (c10854bwM7 != null) {
                    AbstractC58185ywX abstractC58185ywXOLrzqt = instance$default.OLrzqt(c10854bwM7.AEQbTJ(), strGEmmrt, strGEmmrt2, iAhwBna, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? null : fetchVPNInfo().AEQbTJ(), (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) != 0 ? null : null);
                    final Function1 function14 = new Function1() { // from class: o.efg
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C16178eey.KWHzl(this.OLrzqt, strGEmmrt2, (ResponseData) obj);
                        }
                    };
                    InterfaceC58227yxM interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.efe
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            C16178eey.zsXlph(function14, obj);
                        }
                    };
                    final Function1 function15 = new Function1() { // from class: o.eff
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C16178eey.AYXKKw(this.copydefault, (java.lang.Throwable) obj);
                        }
                    };
                    this.valueOf = abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.efl
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            C16178eey.wlaJM(function15, obj);
                        }
                    });
                    return;
                }
                return;
            }
            jAEQbTJ = c10854bwM4.AEQbTJ();
        }
        lValueOf = java.lang.Long.valueOf(jAEQbTJ);
        c16204efXFetchVPNInfo.AEQbTJ(name, strDjBIcL, lValueOf, strGEmmrt2);
        if (c10854bwMEZpvd == null) {
        }
    }

    public static final InterfaceC58261yxu hDKMBd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(C10854bwM c10854bwM, AbstractC12782ctV abstractC12782ctV) {
        java.lang.Object next;
        java.util.List listEZpvd;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if (!abstractC12782ctV.fetchVPNInfo(c10854bwM.OcIXYQ()) && abstractC12782ctV.isConnected(c10854bwM.OcIXYQ())) {
            java.util.List<C10854bwM> listAEQbTJ = C10954byG.EZpvd.valueOf().AEQbTJ(c10854bwM.fJNWhG());
            java.util.Iterator<T> it = listAEQbTJ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((C10854bwM) next).AhwBna() == c10854bwM.AhwBna()) {
                    break;
                }
            }
            if (next == null) {
                listEZpvd = C56402yEa.EZpvd(abstractC12782ctV.OLrzqt(c10854bwM.OcIXYQ(), true));
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : listAEQbTJ) {
                    if (abstractC12782ctV.KWHzl(((C10854bwM) obj).OcIXYQ())) {
                        ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwM.AEQbTJ(), null, 2, null);
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) (chainAddressAddressFromChainId$default != null ? chainAddressAddressFromChainId$default.getAddress() : null))) {
                            arrayList.add(obj);
                        }
                    }
                }
                listEZpvd = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                java.util.Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    listEZpvd.add(abstractC12782ctV.OLrzqt(((C10854bwM) it2.next()).OcIXYQ(), true));
                }
            }
            AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(listEZpvd);
            final Function1 function1 = new Function1() { // from class: o.eeW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C16178eey.AEQbTJ((java.util.List) obj2);
                }
            };
            return abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.efh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj2) {
                    return C16178eey.uzCIH(function1, obj2);
                }
            });
        }
        return AbstractC58260yxt.copydefault(0);
    }

    public static final java.lang.Integer AEQbTJ(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return java.lang.Integer.valueOf(list.size());
    }

    public static final java.lang.Integer uzCIH(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final void AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C16178eey c16178eey, java.lang.String str, C10854bwM c10854bwM, java.lang.Integer num) {
        c16178eey.dismissLoading();
        pUU.KWHzl(c16178eey.getTAG(), "addCustomToken fetchMainWallet openAsset success:" + num);
        C55326xho.toast$default(C13754dXa.FragmentManager.onWindowStartingSupportActionMode, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        C10854bwM c10854bwMKWHzl = c10854bwM.KWHzl();
        java.lang.String strFJNWhG = c10854bwMKWHzl != null ? c10854bwMKWHzl.fJNWhG() : null;
        if (strFJNWhG == null) {
            strFJNWhG = "";
        }
        c16178eey.copydefault(str, strFJNWhG, c10854bwM.OLrzqt());
        c16178eey.OLrzqt(c10854bwM);
        RxBus.AEQbTJ(new C9934beu());
        return Unit.INSTANCE;
    }

    public static final void zLjUOn(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(C16178eey c16178eey, java.lang.Throwable th) {
        c16178eey.dismissLoading();
        pUU.AEQbTJ(c16178eey.getTAG(), "addCustomToken fetchMainWallet openAsset error", th);
        return Unit.INSTANCE;
    }

    public static final void zsXlph(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C16178eey c16178eey, java.lang.String str, ResponseData responseData) {
        C10854bwM c10854bwMKWHzl;
        c16178eey.dismissLoading();
        if (responseData.getCode() == 0) {
            java.lang.String tag = c16178eey.getTAG();
            C10854bwM c10854bwM = (C10854bwM) responseData.getData();
            pUU.KWHzl(tag, "WalletAssetManager addCustomToken success: " + (c10854bwM != null ? c10854bwM.fJNWhG() : null));
            C55326xho.toast$default(C13754dXa.FragmentManager.onWindowStartingSupportActionMode, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            C10854bwM c10854bwM2 = c16178eey.AhwBna;
            java.lang.String strFJNWhG = (c10854bwM2 == null || (c10854bwMKWHzl = c10854bwM2.KWHzl()) == null) ? null : c10854bwMKWHzl.fJNWhG();
            if (strFJNWhG == null) {
                strFJNWhG = "";
            }
            C10854bwM c10854bwM3 = c16178eey.AhwBna;
            java.lang.String strOLrzqt = c10854bwM3 != null ? c10854bwM3.OLrzqt() : null;
            c16178eey.copydefault(str, strFJNWhG, strOLrzqt != null ? strOLrzqt : "");
            c16178eey.OLrzqt((C10854bwM) responseData.getData());
            RxBus.AEQbTJ(new C9934beu());
        } else {
            pUU.copydefault(c16178eey.getTAG(), "WalletAssetManager addCustomToken error message: " + responseData.getErrorMsg());
            if (C33129mqd.OLrzqt((java.lang.CharSequence) responseData.getErrorMsg())) {
                C55326xho.toastWithFailedIcon$default(responseData.getErrorMsg(), 0, 1, (java.lang.Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final void wlaJM(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(C16178eey c16178eey, java.lang.Throwable th) {
        c16178eey.dismissLoading();
        pUU.AEQbTJ(c16178eey.getTAG(), "WalletAssetManager.addCustomToken error", th);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(final C10854bwM c10854bwM) {
        if (c10854bwM == null || !c10854bwM.DBxZfM()) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.efu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16178eey.OLrzqt(this.copydefault, c10854bwM, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58260yxtCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.efC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C16178eey.AwvSrB(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(abstractC58185ywXKWHzl, this, Lifecycle.Event.ON_DESTROY);
        final Function1 function12 = new Function1() { // from class: o.efy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16178eey.OLrzqt(this.KWHzl, c10854bwM, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.efA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C16178eey.QKVWgx(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.efz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16178eey.djBIcL(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.efB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C16178eey.DTwDnp(function13, obj);
            }
        });
    }

    public static final InterfaceC60096zvd AwvSrB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(C16178eey c16178eey, C10854bwM c10854bwM, final AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if (!abstractC12782ctV.djSkpj()) {
            return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(ChainStatus.REGISTERED, abstractC12782ctV.DbNXlk()));
        }
        C16204efX c16204efXFetchVPNInfo = c16178eey.fetchVPNInfo();
        long jAhwBna = c10854bwM.AhwBna();
        ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwM.AEQbTJ(), null, 2, null);
        java.lang.String address = chainAddressAddressFromChainId$default != null ? chainAddressAddressFromChainId$default.getAddress() : null;
        AbstractC58185ywX<ChainStatus> abstractC58185ywXCopydefault = c16204efXFetchVPNInfo.copydefault(jAhwBna, address != null ? address : "", c10854bwM.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.eeU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16178eey.EZpvd(abstractC12782ctV, (ChainStatus) obj);
            }
        };
        return abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.eeY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C16178eey.zuBGHE(function1, obj);
            }
        });
    }

    public static final kotlin.Pair zuBGHE(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair EZpvd(AbstractC12782ctV abstractC12782ctV, ChainStatus chainStatus) {
        Intrinsics.checkNotNullParameter(chainStatus, "");
        return C56390yDp.OLrzqt(chainStatus, abstractC12782ctV.DbNXlk());
    }

    public static final Unit OLrzqt(final C16178eey c16178eey, C10854bwM c10854bwM, kotlin.Pair pair) {
        ChainStatus chainStatus = (ChainStatus) pair.component1();
        java.lang.String str = (java.lang.String) pair.component2();
        c16178eey.dismissLoading();
        int i = StateListAnimator.KWHzl[chainStatus.ordinal()];
        if (i == 1) {
            FragmentActivity activity = c16178eey.getActivity();
            if (activity != null) {
                activity.finish();
            }
        } else if (i == 2) {
            C14083dek.OLrzqt.KWHzl();
        } else if (i == 3) {
            C14083dek c14083dek = C14083dek.OLrzqt;
            android.content.Context context = c16178eey.getContext();
            if (context == null) {
                return Unit.INSTANCE;
            }
            androidx.fragment.app.FragmentManager childFragmentManager = c16178eey.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c14083dek.EZpvd(context, childFragmentManager, str, c10854bwM.AhwBna(), new Function1() { // from class: o.efJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C16178eey.copydefault(this.copydefault, (android.os.Bundle) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void QKVWgx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C16178eey c16178eey, android.os.Bundle bundle) {
        FragmentActivity activity = c16178eey.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    public static final void DTwDnp(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(C16178eey c16178eey, java.lang.Throwable th) {
        c16178eey.dismissLoading();
        pUU.AEQbTJ(c16178eey.getTAG(), "checkTokenRegisterStatus error", th);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.OLrzqt = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        InterfaceC58217yxC interfaceC58217yxC = this.valueOf;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.EZpvd;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC3 = this.gEmmrt;
        if (interfaceC58217yxC3 != null) {
            interfaceC58217yxC3.dispose();
        }
    }

    public final void djBIcL() {
        this.KWHzl = new C13916dbc("", "", "", 0, null, 24, null);
    }

    private final void uzCIH() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new CustomTokenFragment$observeData$1(this, null), 3, null);
    }

    public final void copydefault(CoinProtocol coinProtocol) {
        C55008xbo c55008xbo;
        C55008xbo c55008xbo2;
        C55008xbo c55008xbo3;
        C55018xby c55018xby;
        C55018xby c55018xby2;
        android.widget.LinearLayout linearLayoutEjfBZ;
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        C55001xbh c55001xbhValues = values();
        if (c55001xbhValues != null) {
            c55001xbhValues.setText("");
        }
        C55001xbh c55001xbhValues2 = values();
        if (c55001xbhValues2 != null) {
            c55001xbhValues2.clearFocus();
        }
        C16483ekl c16483ekl = this.OLrzqt;
        if (c16483ekl != null && (c55018xby2 = c16483ekl.KWHzl) != null && (linearLayoutEjfBZ = c55018xby2.ejfBZ()) != null) {
            linearLayoutEjfBZ.setEnabled(true);
        }
        C16483ekl c16483ekl2 = this.OLrzqt;
        if (c16483ekl2 != null && (c55018xby = c16483ekl2.KWHzl) != null) {
            c55018xby.setText(coinProtocol.getProtocolName());
        }
        int i = StateListAnimator.EZpvd[OKWXRCProtocolEnum.Companion.AEQbTJ(coinProtocol.getProtocolId()).ordinal()];
        if (i == 1) {
            C55001xbh c55001xbhValues3 = values();
            if (c55001xbhValues3 != null) {
                c55001xbhValues3.setHint(C13754dXa.FragmentManager.DGUQLI);
            }
            C16483ekl c16483ekl3 = this.OLrzqt;
            if (c16483ekl3 != null && (c55008xbo = c16483ekl3.EZpvd) != null) {
                c55008xbo.setLabelText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setMediaUri));
            }
        } else if (i == 2) {
            C16483ekl c16483ekl4 = this.OLrzqt;
            if (c16483ekl4 != null && (c55008xbo2 = c16483ekl4.EZpvd) != null) {
                c55008xbo2.setLabelText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getMediaId));
            }
            C55001xbh c55001xbhValues4 = values();
            if (c55001xbhValues4 != null) {
                c55001xbhValues4.setHint(C13754dXa.FragmentManager.toString);
            }
        } else {
            C16483ekl c16483ekl5 = this.OLrzqt;
            if (c16483ekl5 != null && (c55008xbo3 = c16483ekl5.EZpvd) != null) {
                c55008xbo3.setLabelText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setMediaUri));
            }
            C55001xbh c55001xbhValues5 = values();
            if (c55001xbhValues5 != null) {
                c55001xbhValues5.setHint(C13754dXa.FragmentManager.hCLrkq);
            }
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) coinProtocol.getLogo())) {
            Glide.AEQbTJ(context).EZpvd(coinProtocol.getLogo()).OLrzqt(new FragmentManager(context, C55298xhM.KWHzl(20.0f, context), C55298xhM.KWHzl(20.0f, context)));
            return;
        }
        C55001xbh c55001xbhDbNXlk = DbNXlk();
        if (c55001xbhDbNXlk != null) {
            c55001xbhDbNXlk.setCompoundDrawablesRelative(null, null, null, null);
        }
    }

    /* JADX INFO: renamed from: o.eey$FragmentManager */
    public static final class FragmentManager extends AbstractC5449Sd<android.graphics.drawable.Drawable> {
        public final /* synthetic */ android.content.Context AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FragmentManager(android.content.Context context, int i, int i2) {
            super(i, i2);
            this.AEQbTJ = context;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
        @Override // o.InterfaceC5462Sq
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void copydefault(android.graphics.drawable.Drawable drawable, InterfaceC5460So<? super android.graphics.drawable.Drawable> interfaceC5460So) {
            Intrinsics.checkNotNullParameter(drawable, "");
            C55001xbh c55001xbhDbNXlk = C16178eey.this.DbNXlk();
            if (c55001xbhDbNXlk != null) {
                c55001xbhDbNXlk.setCompoundDrawablePadding(C55298xhM.KWHzl(8.0f, this.AEQbTJ));
                c55001xbhDbNXlk.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            }
        }

        @Override // o.InterfaceC5462Sq
        public void a_(android.graphics.drawable.Drawable drawable) {
            C55001xbh c55001xbhDbNXlk = C16178eey.this.DbNXlk();
            if (c55001xbhDbNXlk != null) {
                c55001xbhDbNXlk.setCompoundDrawablesRelative(null, null, null, null);
            }
        }
    }

    public final void gEmmrt() {
        C55018xby c55018xby;
        android.widget.LinearLayout linearLayoutEjfBZ;
        C16483ekl c16483ekl = this.OLrzqt;
        if (c16483ekl != null && (c55018xby = c16483ekl.KWHzl) != null && (linearLayoutEjfBZ = c55018xby.ejfBZ()) != null) {
            linearLayoutEjfBZ.setEnabled(false);
        }
        C55001xbh c55001xbhDbNXlk = DbNXlk();
        if (c55001xbhDbNXlk != null) {
            c55001xbhDbNXlk.setCompoundDrawablesRelative(null, null, null, null);
        }
        C55326xho.KWHzl(C13754dXa.FragmentManager.DsrFlB, 1);
    }

    public final void fARcdN() {
        C55018xby c55018xby;
        C16483ekl c16483ekl = this.OLrzqt;
        if (c16483ekl == null || (c55018xby = c16483ekl.KWHzl) == null) {
            return;
        }
        c55018xby.setFragmentManager(getChildFragmentManager());
        c55018xby.setBottomSheet(C16281egv.Companion.copydefault(this.fIwbmz, new Function1() { // from class: o.eeK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16178eey.AEQbTJ(this.AEQbTJ, (CoinProtocol) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(C16178eey c16178eey, CoinProtocol coinProtocol) {
        Intrinsics.checkNotNullParameter(coinProtocol, "");
        c16178eey.fetchVPNInfo().KWHzl(coinProtocol.getProtocolId());
        return Unit.INSTANCE;
    }

    public static final ViewModelProvider.Factory EZpvd() {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(C16204efX.class), new Function1() { // from class: o.eeD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16178eey.KWHzl((CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(C16178eey c16178eey, ResponseData responseData) {
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        C52794wYp c52794wYp3;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            ContractAddressResp contractAddressResp = (ContractAddressResp) responseData.getData();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (contractAddressResp != null ? contractAddressResp.getSymbol() : null))) {
                ContractAddressResp contractAddressResp2 = (ContractAddressResp) responseData.getData();
                if ((contractAddressResp2 != null ? java.lang.Integer.valueOf(contractAddressResp2.getPrecision()) : null) != null) {
                    ContractAddressResp contractAddressResp3 = (ContractAddressResp) responseData.getData();
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) (contractAddressResp3 != null ? contractAddressResp3.getContractAddress() : null))) {
                        java.lang.Integer numAEQbTJ = c16178eey.fetchVPNInfo().AEQbTJ();
                        int protocolId = OKWXRCProtocolEnum.FRACTAL_CAT20.getProtocolId();
                        if (numAEQbTJ != null && numAEQbTJ.intValue() == protocolId) {
                            c16178eey.djBIcL();
                            C13916dbc c13916dbc = c16178eey.KWHzl;
                            if (c13916dbc != null) {
                                ContractAddressResp contractAddressResp4 = (ContractAddressResp) responseData.getData();
                                c13916dbc.EZpvd(java.lang.String.valueOf(contractAddressResp4 != null ? contractAddressResp4.getSymbol() : null));
                            }
                            C13916dbc c13916dbc2 = c16178eey.KWHzl;
                            if (c13916dbc2 != null) {
                                ContractAddressResp contractAddressResp5 = (ContractAddressResp) responseData.getData();
                                c13916dbc2.OLrzqt(C33129mqd.AYXKKw(contractAddressResp5 != null ? java.lang.Integer.valueOf(contractAddressResp5.getPrecision()) : null));
                            }
                            C13916dbc c13916dbc3 = c16178eey.KWHzl;
                            if (c13916dbc3 != null) {
                                ContractAddressResp contractAddressResp6 = (ContractAddressResp) responseData.getData();
                                c13916dbc3.copydefault(C33129mqd.gEmmrt(contractAddressResp6 != null ? contractAddressResp6.getContractAddress() : null));
                            }
                            c16178eey.KWHzl(true);
                        }
                        c16178eey.valueOf();
                        C16483ekl c16483ekl = c16178eey.OLrzqt;
                        if (c16483ekl != null && (c52794wYp3 = c16483ekl.OLrzqt) != null) {
                            c52794wYp3.setEnabled(true);
                        }
                    }
                }
            } else {
                c16178eey.AuCTel();
                c16178eey.KWHzl(false);
                C16483ekl c16483ekl2 = c16178eey.OLrzqt;
                if (c16483ekl2 != null && (c52794wYp2 = c16483ekl2.OLrzqt) != null) {
                    c52794wYp2.setEnabled(false);
                }
            }
        } else {
            c16178eey.AuCTel();
            c16178eey.KWHzl(false);
            C16483ekl c16483ekl3 = c16178eey.OLrzqt;
            if (c16483ekl3 != null && (c52794wYp = c16483ekl3.OLrzqt) != null) {
                c52794wYp.setEnabled(false);
            }
        }
        return Unit.INSTANCE;
    }
}
