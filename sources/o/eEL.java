package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.google.firebase.messaging.Constants;
import com.okinc.business.defi.biz.core.error.OKWException;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.hardware.HardwareWalletDerivationPath;
import com.okinc.business.defi.wallet.hardware.HardwareWalletSelectAddressActivity$mergeOrAddWallet$1;
import com.okinc.business.defi.wallet.hardware.HardwareWalletSelectAddressActivity$mergeOrAddWallet$2;
import com.okinc.business.defi.wallet.hardware.HardwareWalletSelectAddressActivity$observeUiState$1;
import com.okinc.dimodule.DispatcherProvider;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC15326eEe;
import o.C13124czt;
import o.C13754dXa;
import o.C15323eEb;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class eEL extends AbstractActivityC33013moT {
    public C10854bwM AYXKKw;
    public AbstractC16383eir AhwBna;
    public C15296eDb KWHzl;
    public final InterfaceC56387yDm valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;
    public java.lang.String OLrzqt = "HardwareWalletSelectAddressActivity";
    public int gEmmrt = 1;
    public java.lang.String EZpvd = "";
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.eEN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return eEL.KWHzl();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull C15296eDb c15296eDb) {
        Intrinsics.checkNotNullParameter(c15296eDb, "");
        this.KWHzl = c15296eDb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public java.lang.String getTAG() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public void setTAG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    public eEL() {
        final Function0 function0 = null;
        this.valueOf = new ViewModelLazy(C56524yIo.AEQbTJ(eEX.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.hardware.HardwareWalletSelectAddressActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0() { // from class: o.eEO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eEL.AEQbTJ();
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.hardware.HardwareWalletSelectAddressActivity$special$$inlined$viewModels$default$3
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
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eEL.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void KWHzl(@NotNull android.app.Activity activity, int i, @NotNull java.lang.String str, long j) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) eEL.class);
            intent.putExtra(OtcExtraKeys.MODE, i);
            intent.putExtra("from", str);
            intent.putExtra("generalChainId", j);
            activity.startActivity(intent);
        }
    }

    public final C15296eDb copydefault() {
        C15296eDb c15296eDb = this.KWHzl;
        if (c15296eDb != null) {
            return c15296eDb;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final eEX djBIcL() {
        return (eEX) this.valueOf.getValue();
    }

    public static final eEX EZpvd(CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new eEX(C13124czt.Application.getInstance$default(C13124czt.Companion, null, 1, null), new C15372eFx(C10954byG.EZpvd.valueOf(), C57032yak.AEQbTJ.AEQbTJ(), new C13934dbu(), xYW.AEQbTJ, new DispatcherProvider()), SavedStateHandleSupport.createSavedStateHandle(creationExtras));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final eEG AhwBna() {
        return (eEG) this.copydefault.getValue();
    }

    public static final eEG KWHzl() {
        return new eEG();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.gEmmrt = getIntent().getIntExtra(OtcExtraKeys.MODE, 1);
        java.lang.String stringExtra = getIntent().getStringExtra("from");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.EZpvd = stringExtra;
        long longExtra = getIntent().getLongExtra("generalChainId", -1L);
        this.AYXKKw = C10954byG.EZpvd.valueOf().copydefault(longExtra);
        pUU.OLrzqt(">>>ledger generalChainId:" + longExtra + " - mode:" + this.gEmmrt + " - from:" + this.EZpvd);
        this.AhwBna = (AbstractC16383eir) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.gasjUx);
        valueOf();
        AYXKKw();
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXH.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, this);
        final Function1 function1 = new Function1() { // from class: o.eES
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eEL.AEQbTJ(this.KWHzl, (xXH) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.eEW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                eEL.OLrzqt(function1, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(eEL eel, xXH xxh) {
        eel.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void values() {
        AbstractC16383eir abstractC16383eir = this.AhwBna;
        AbstractC16383eir abstractC16383eir2 = null;
        if (abstractC16383eir == null) {
            Intrinsics.gEmmrt("");
            abstractC16383eir = null;
        }
        abstractC16383eir.AEQbTJ.setVisibility(0);
        AbstractC16383eir abstractC16383eir3 = this.AhwBna;
        if (abstractC16383eir3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16383eir3 = null;
        }
        abstractC16383eir3.copydefault.setVisibility(8);
        AbstractC16383eir abstractC16383eir4 = this.AhwBna;
        if (abstractC16383eir4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16383eir4 = null;
        }
        abstractC16383eir4.KWHzl.setAnimation(C13754dXa.Fragment.valueOf);
        AbstractC16383eir abstractC16383eir5 = this.AhwBna;
        if (abstractC16383eir5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16383eir2 = abstractC16383eir5;
        }
        abstractC16383eir2.KWHzl.playAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gEmmrt() {
        AbstractC16383eir abstractC16383eir = this.AhwBna;
        AbstractC16383eir abstractC16383eir2 = null;
        if (abstractC16383eir == null) {
            Intrinsics.gEmmrt("");
            abstractC16383eir = null;
        }
        abstractC16383eir.AEQbTJ.setVisibility(8);
        AbstractC16383eir abstractC16383eir3 = this.AhwBna;
        if (abstractC16383eir3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16383eir3 = null;
        }
        abstractC16383eir3.copydefault.setVisibility(0);
        AbstractC16383eir abstractC16383eir4 = this.AhwBna;
        if (abstractC16383eir4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16383eir2 = abstractC16383eir4;
        }
        abstractC16383eir2.KWHzl.cancelAnimation();
    }

    public final void valueOf() {
        C10854bwM c10854bwM = this.AYXKKw;
        AbstractC16383eir abstractC16383eir = null;
        java.lang.String strDjBIcL = c10854bwM != null ? c10854bwM.djBIcL() : null;
        if (strDjBIcL == null) {
            strDjBIcL = "";
        }
        java.lang.String strKWHzl = C33069mpW.KWHzl(this, C13754dXa.FragmentManager.hErYDe, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("network", strDjBIcL)));
        AbstractC16383eir abstractC16383eir2 = this.AhwBna;
        if (abstractC16383eir2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16383eir2 = null;
        }
        abstractC16383eir2.OLrzqt.setTitle(strKWHzl);
        AbstractC16383eir abstractC16383eir3 = this.AhwBna;
        if (abstractC16383eir3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16383eir3 = null;
        }
        abstractC16383eir3.OLrzqt.setTitleTypeface("harmony_sans_bold.ttf");
        AbstractC16383eir abstractC16383eir4 = this.AhwBna;
        if (abstractC16383eir4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16383eir4 = null;
        }
        android.widget.TextView textView = abstractC16383eir4.AhwBna;
        textView.setOnClickListener(new Application(textView, 1000L, this));
        AbstractC16383eir abstractC16383eir5 = this.AhwBna;
        if (abstractC16383eir5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16383eir5 = null;
        }
        C52794wYp c52794wYp = abstractC16383eir5.gEmmrt;
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
        KWHzl(new C15296eDb(new Function1() { // from class: o.eEP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eEL.OLrzqt(this.KWHzl, (eFI) obj);
            }
        }, new Function1() { // from class: o.eER
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eEL.KWHzl(this.EZpvd, (eFJ) obj);
            }
        }, new Function0() { // from class: o.eEQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eEL.AkhnZx(this.EZpvd);
            }
        }));
        AbstractC16383eir abstractC16383eir6 = this.AhwBna;
        if (abstractC16383eir6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16383eir6 = null;
        }
        abstractC16383eir6.djBIcL.setAdapter(copydefault());
        AbstractC16383eir abstractC16383eir7 = this.AhwBna;
        if (abstractC16383eir7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16383eir = abstractC16383eir7;
        }
        abstractC16383eir.djBIcL.addItemDecoration(new C6987aZj(ContextCompat.getColor(this, C52761wXj.Activity.aBDePw), C33052mpF.AEQbTJ(16, (android.content.Context) this), 0, 0, 0, 0));
    }

    public static final class TaskDescription implements Function1<HardwareWalletDerivationPath, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(HardwareWalletDerivationPath hardwareWalletDerivationPath) {
            OLrzqt(hardwareWalletDerivationPath);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(HardwareWalletDerivationPath hardwareWalletDerivationPath) {
            Intrinsics.checkNotNullParameter(hardwareWalletDerivationPath, "");
            pUU.OLrzqt(">>>ledger callback from derivation: " + hardwareWalletDerivationPath + " ");
            eEL.this.djBIcL().KWHzl(hardwareWalletDerivationPath);
        }
    }

    public static final class Dialog implements Function1<java.lang.Throwable, Unit> {
        public static final Dialog EZpvd = new Dialog();

        public final void KWHzl(java.lang.Throwable th) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            KWHzl(th);
            return Unit.INSTANCE;
        }
    }

    public static final class StateListAnimator implements Function1<java.lang.Boolean, Unit> {
        public final /* synthetic */ eFI copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(eFI efi) {
            this.copydefault = efi;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Boolean bool) {
            OLrzqt(bool);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void OLrzqt(java.lang.Boolean bool) {
            if (bool.booleanValue()) {
                C10854bwM c10854bwM = eEL.this.AYXKKw;
                if (c10854bwM != null && c10854bwM.OBJEWx()) {
                    C55326xho.toast$default(eEL.this.getString(C13754dXa.FragmentManager.getAction), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                    return;
                } else {
                    C55326xho.toast$default(eEL.this.getString(C13754dXa.FragmentManager.PlaybackStateCompatCustomAction), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                    return;
                }
            }
            ActivityC15326eEe.ActionBar actionBar = ActivityC15326eEe.Companion;
            eEL eel = eEL.this;
            actionBar.OLrzqt(eel, eel.gEmmrt, eEL.this.EZpvd, this.copydefault.copydefault());
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ eEL copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, eEL eel) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = eel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            C10854bwM c10854bwM;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                eFI efiCopydefault = this.copydefault.djBIcL().copydefault();
                eFJ efjDjBIcL = this.copydefault.djBIcL().djBIcL();
                if (efiCopydefault == null && efjDjBIcL == null) {
                    return;
                }
                if (efiCopydefault == null || (c10854bwM = this.copydefault.AYXKKw) == null || !c10854bwM.ejfBZ()) {
                    C10854bwM c10854bwM2 = this.copydefault.AYXKKw;
                    if (c10854bwM2 == null || !c10854bwM2.DsrFlB()) {
                        if (efiCopydefault != null) {
                            eEG eegAhwBna = this.copydefault.AhwBna();
                            C10854bwM c10854bwM3 = this.copydefault.AYXKKw;
                            this.copydefault.addDisposable(eegAhwBna.copydefault(c10854bwM3 != null ? java.lang.Long.valueOf(c10854bwM3.AEQbTJ()) : null, C56402yEa.EZpvd(efiCopydefault.copydefault())).OLrzqt(new InterfaceC58229yxO(this.copydefault.new PictureInPictureParams()) { // from class: o.eEL.TaskStackBuilder
                                public final /* synthetic */ Function1 EZpvd;

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                {
                                    Intrinsics.checkNotNullParameter(function1, "");
                                    this.EZpvd = function1;
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // o.InterfaceC58229yxO
                                public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                                    return this.EZpvd.invoke(obj);
                                }
                            }).AEQbTJ(new InterfaceC58227yxM(this.copydefault.new SharedElementCallback(efiCopydefault)) { // from class: o.eEL.VoiceInteractor
                                public final /* synthetic */ Function1 KWHzl;

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                {
                                    Intrinsics.checkNotNullParameter(function1, "");
                                    this.KWHzl = function1;
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // o.InterfaceC58227yxM
                                public final /* synthetic */ void accept(java.lang.Object obj) {
                                    this.KWHzl.invoke(obj);
                                }
                            }, new InterfaceC58227yxM(this.copydefault.new FragmentManager()) { // from class: o.eEL.VoiceInteractor
                                public final /* synthetic */ Function1 KWHzl;

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                {
                                    Intrinsics.checkNotNullParameter(function1, "");
                                    this.KWHzl = function1;
                                }

                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // o.InterfaceC58227yxM
                                public final /* synthetic */ void accept(java.lang.Object obj) {
                                    this.KWHzl.invoke(obj);
                                }
                            }));
                            return;
                        }
                        pUU.copydefault(">>>ledger info is NULL when click item");
                        return;
                    }
                    pUU.OLrzqt(">>>ledger mChainMeta?.isUTXO == true mode:" + this.copydefault.gEmmrt + " - from:" + this.copydefault.EZpvd + " - info:" + efiCopydefault + " - groupAddress:" + efjDjBIcL);
                    eFJ efjDjBIcL2 = this.copydefault.djBIcL().djBIcL();
                    if (efjDjBIcL2 == null) {
                        return;
                    }
                    java.util.List<eFI> listCopydefault = efjDjBIcL2.copydefault();
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
                    java.util.Iterator<T> it = listCopydefault.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((eFI) it.next()).copydefault());
                    }
                    eEG eegAhwBna2 = this.copydefault.AhwBna();
                    C10854bwM c10854bwM4 = this.copydefault.AYXKKw;
                    this.copydefault.addDisposable(eegAhwBna2.copydefault(c10854bwM4 != null ? java.lang.Long.valueOf(c10854bwM4.AEQbTJ()) : null, arrayList).OLrzqt(new InterfaceC58229yxO(this.copydefault.new PendingIntent(arrayList)) { // from class: o.eEL.TaskStackBuilder
                        public final /* synthetic */ Function1 EZpvd;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        {
                            Intrinsics.checkNotNullParameter(function1, "");
                            this.EZpvd = function1;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58229yxO
                        public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                            return this.EZpvd.invoke(obj);
                        }
                    }).AEQbTJ(new InterfaceC58227yxM(this.copydefault.new Fragment(efjDjBIcL2)) { // from class: o.eEL.VoiceInteractor
                        public final /* synthetic */ Function1 KWHzl;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        {
                            Intrinsics.checkNotNullParameter(function1, "");
                            this.KWHzl = function1;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final /* synthetic */ void accept(java.lang.Object obj) {
                            this.KWHzl.invoke(obj);
                        }
                    }, new InterfaceC58227yxM(this.copydefault.new LoaderManager()) { // from class: o.eEL.VoiceInteractor
                        public final /* synthetic */ Function1 KWHzl;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        {
                            Intrinsics.checkNotNullParameter(function1, "");
                            this.KWHzl = function1;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final /* synthetic */ void accept(java.lang.Object obj) {
                            this.KWHzl.invoke(obj);
                        }
                    }));
                    return;
                }
                eEG eegAhwBna3 = this.copydefault.AhwBna();
                C10854bwM c10854bwM5 = this.copydefault.AYXKKw;
                this.copydefault.addDisposable(eegAhwBna3.copydefault(c10854bwM5 != null ? java.lang.Long.valueOf(c10854bwM5.AEQbTJ()) : null, C56402yEa.EZpvd(efiCopydefault.copydefault())).AEQbTJ(new InterfaceC58227yxM(this.copydefault.new StateListAnimator(efiCopydefault)) { // from class: o.eEL.VoiceInteractor
                    public final /* synthetic */ Function1 KWHzl;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.KWHzl = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final /* synthetic */ void accept(java.lang.Object obj) {
                        this.KWHzl.invoke(obj);
                    }
                }, new InterfaceC58227yxM(Dialog.EZpvd) { // from class: o.eEL.VoiceInteractor
                    public final /* synthetic */ Function1 KWHzl;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.KWHzl = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final /* synthetic */ void accept(java.lang.Object obj) {
                        this.KWHzl.invoke(obj);
                    }
                }));
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ eEL EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, eEL eel) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = eel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C15323eEb.TaskDescription taskDescription = C15323eEb.Companion;
                androidx.fragment.app.FragmentManager supportFragmentManager = this.EZpvd.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                taskDescription.KWHzl(supportFragmentManager, this.EZpvd.djBIcL().OLrzqt(), this.EZpvd.djBIcL().KWHzl(), this.EZpvd.new TaskDescription());
            }
        }
    }

    public static final class PendingIntent implements Function1<java.lang.Boolean, InterfaceC58261yxu<? extends java.lang.Boolean>> {
        public final /* synthetic */ java.util.List<ChainAddress> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(java.util.List<ChainAddress> list) {
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final InterfaceC58261yxu<? extends java.lang.Boolean> invoke(java.lang.Boolean bool) throws OKWException {
            Intrinsics.checkNotNullParameter(bool, "");
            C10854bwM c10854bwM = eEL.this.AYXKKw;
            pUU.OLrzqt(">>>ledger isUTXO existWallets subscribe boolean:" + bool + " with chainID from mChainMeta:" + (c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.AEQbTJ()) : null) + " ");
            if (!bool.booleanValue()) {
                eEL.this.AhwBna().OLrzqt(eEL.this.gEmmrt);
                eEL.this.AhwBna().KWHzl(eEL.this.EZpvd);
                eEG eegAhwBna = eEL.this.AhwBna();
                C10854bwM c10854bwM2 = eEL.this.AYXKKw;
                if (c10854bwM2 != null) {
                    return eegAhwBna.EZpvd(c10854bwM2.AEQbTJ(), this.OLrzqt);
                }
                throw new OKWException(Constants.IPC_BUNDLE_KEY_SEND_ERROR, null);
            }
            eEL.this.djBIcL().EZpvd(eEL.this.getTAG(), "initUIForV2_isUTXO_True");
            AbstractC58260yxt abstractC58260yxtAEQbTJ = AbstractC58260yxt.AEQbTJ(WalletImportError.Companion.OLrzqt());
            Intrinsics.copydefault(abstractC58260yxtAEQbTJ);
            return abstractC58260yxtAEQbTJ;
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Fragment implements Function1<java.lang.Boolean, Unit> {
        public final /* synthetic */ eFJ AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(eFJ efj) {
            this.AEQbTJ = efj;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Boolean bool) {
            KWHzl(bool);
            return Unit.INSTANCE;
        }

        public final void KWHzl(java.lang.Boolean bool) {
            pUU.OLrzqt(">>>ledger isUTXO judgeIfCanBeMerged subscribe boolean:" + bool);
            if (bool.booleanValue()) {
                eEG eegAhwBna = eEL.this.AhwBna();
                final eEL eel = eEL.this;
                final eFJ efj = this.AEQbTJ;
                eegAhwBna.EZpvd(eel, new Function0<Unit>() { // from class: o.eEL.Fragment.3
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function0
                    public /* synthetic */ Unit invoke() {
                        EZpvd();
                        return Unit.INSTANCE;
                    }

                    public final void EZpvd() {
                        eel.copydefault(efj);
                    }
                });
                return;
            }
            eEL.this.copydefault(this.AEQbTJ);
        }
    }

    public static final class LoaderManager implements Function1<java.lang.Throwable, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            KWHzl(th);
            return Unit.INSTANCE;
        }

        public final void KWHzl(java.lang.Throwable th) {
            if (th instanceof WalletImportError) {
                C55326xho.toast$default(eEL.this.getString(C13754dXa.FragmentManager.getAction), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
        }
    }

    public static final class PictureInPictureParams implements Function1<java.lang.Boolean, InterfaceC58261yxu<? extends java.lang.Boolean>> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams() {
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final InterfaceC58261yxu<? extends java.lang.Boolean> invoke(java.lang.Boolean bool) throws OKWException {
            Intrinsics.checkNotNullParameter(bool, "");
            if (!bool.booleanValue()) {
                eEL.this.AhwBna().OLrzqt(eEL.this.gEmmrt);
                eEL.this.AhwBna().KWHzl(eEL.this.EZpvd);
                eEG eegAhwBna = eEL.this.AhwBna();
                C10854bwM c10854bwM = eEL.this.AYXKKw;
                if (c10854bwM != null) {
                    return eEG.judgeIfCanBeMerged$default(eegAhwBna, c10854bwM.AEQbTJ(), null, 2, null);
                }
                throw new OKWException(Constants.IPC_BUNDLE_KEY_SEND_ERROR, null);
            }
            eEL.this.djBIcL().EZpvd(eEL.this.getTAG(), "initUIForV2_isUTXO_False");
            AbstractC58260yxt abstractC58260yxtAEQbTJ = AbstractC58260yxt.AEQbTJ(WalletImportError.Companion.OLrzqt());
            Intrinsics.copydefault(abstractC58260yxtAEQbTJ);
            return abstractC58260yxtAEQbTJ;
        }
    }

    public static final class FragmentManager implements Function1<java.lang.Throwable, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            KWHzl(th);
            return Unit.INSTANCE;
        }

        public final void KWHzl(java.lang.Throwable th) {
            if (th instanceof WalletImportError) {
                C55326xho.toast$default(eEL.this.getString(C13754dXa.FragmentManager.getAction), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class SharedElementCallback implements Function1<java.lang.Boolean, Unit> {
        public final /* synthetic */ eFI KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback(eFI efi) {
            this.KWHzl = efi;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Boolean bool) {
            KWHzl(bool);
            return Unit.INSTANCE;
        }

        public final void KWHzl(java.lang.Boolean bool) {
            if (bool.booleanValue()) {
                eEG eegAhwBna = eEL.this.AhwBna();
                final eEL eel = eEL.this;
                final eFI efi = this.KWHzl;
                eegAhwBna.EZpvd(eel, new Function0<Unit>() { // from class: o.eEL.SharedElementCallback.1
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function0
                    public /* synthetic */ Unit invoke() {
                        AEQbTJ();
                        return Unit.INSTANCE;
                    }

                    public final void AEQbTJ() {
                        eel.OLrzqt(efi);
                    }
                });
                return;
            }
            eEL.this.OLrzqt(this.KWHzl);
        }
    }

    public static final Unit OLrzqt(eEL eel, eFI efi) {
        Intrinsics.checkNotNullParameter(efi, "");
        pUU.OLrzqt(">>>ledger address click:" + efi);
        eel.djBIcL().EZpvd(efi);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(eEL eel, eFJ efj) {
        Intrinsics.checkNotNullParameter(efj, "");
        pUU.OLrzqt(">>>ledger group address click:" + efj);
        eel.djBIcL().KWHzl(efj);
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(eEL eel) {
        pUU.OLrzqt(">>>ledger load more click");
        eel.djBIcL().gEmmrt();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(eFI efi) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new HardwareWalletSelectAddressActivity$mergeOrAddWallet$1(this, efi, null), 3, null);
    }

    public final void copydefault(eFJ efj) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new HardwareWalletSelectAddressActivity$mergeOrAddWallet$2(this, efj, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchVPNInfo() {
        C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.launchUnitdefault, 0, 1, (java.lang.Object) null);
    }

    private final void AYXKKw() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new HardwareWalletSelectAddressActivity$observeUiState$1(this, null), 3, null);
    }

    public static final ViewModelProvider.Factory AEQbTJ() {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(eEX.class), new Function1() { // from class: o.eEK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eEL.EZpvd((CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
