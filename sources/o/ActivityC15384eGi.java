package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.hardware.keystone.KeystoneSelectAccountViewModel;
import com.okinc.business.defi.wallet.mine.data.DerviationEVM;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.wallet.hardware.api.keystone.KeystoneMultiAccount;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC15384eGi;
import o.C13754dXa;
import o.C18479fjF;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eGi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC15384eGi extends AbstractActivityC33013moT {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public AbstractC16340eiA AEQbTJ;
    public KeystoneMultiAccount OLrzqt;
    public KeystoneSelectAccountViewModel djBIcL;
    public java.lang.String gEmmrt;
    public int KWHzl = 1;
    public C43316rmw EZpvd = new C43316rmw();
    public java.lang.String AhwBna = "createWallet";

    /* JADX INFO: renamed from: o.eGi$FragmentManager */
    public static final /* synthetic */ class FragmentManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.eGi$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eGi.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ void startActivity$default(Activity activity, android.app.Activity activity2, java.lang.String str, java.lang.String str2, int i, KeystoneMultiAccount keystoneMultiAccount, int i2, java.lang.Object obj) {
            if ((i2 & 8) != 0) {
                i = 1;
            }
            activity.OLrzqt(activity2, str, str2, i, keystoneMultiAccount);
        }

        public final void OLrzqt(@NotNull android.app.Activity activity, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull KeystoneMultiAccount keystoneMultiAccount) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(keystoneMultiAccount, "");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) ActivityC15384eGi.class);
            intent.putExtra("root_wallet_id", str);
            intent.putExtra("type", str2);
            intent.putExtra(OtcExtraKeys.MODE, i);
            intent.putExtra("data", keystoneMultiAccount);
            activity.startActivity(intent);
        }
    }

    private final void KWHzl() {
        java.lang.String stringExtra = getIntent().getStringExtra("root_wallet_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.gEmmrt = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("type");
        this.AhwBna = stringExtra2 != null ? stringExtra2 : "";
        this.KWHzl = getIntent().getIntExtra(OtcExtraKeys.MODE, 1);
        this.OLrzqt = (KeystoneMultiAccount) getIntent().getParcelableExtra("data");
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        KWHzl();
        this.AEQbTJ = (AbstractC16340eiA) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.RlQdEF);
        KeystoneSelectAccountViewModel keystoneSelectAccountViewModel = (KeystoneSelectAccountViewModel) new ViewModelProvider(this).get(KeystoneSelectAccountViewModel.class);
        this.djBIcL = keystoneSelectAccountViewModel;
        AbstractC16340eiA abstractC16340eiA = null;
        if (keystoneSelectAccountViewModel == null) {
            Intrinsics.gEmmrt("");
            keystoneSelectAccountViewModel = null;
        }
        keystoneSelectAccountViewModel.EZpvd(this.AhwBna, this.gEmmrt, this.OLrzqt);
        AbstractC16340eiA abstractC16340eiA2 = this.AEQbTJ;
        if (abstractC16340eiA2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16340eiA = abstractC16340eiA2;
        }
        C52794wYp c52794wYpCopydefault = abstractC16340eiA.EZpvd.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setEnabled(false);
        }
        OLrzqt();
        copydefault();
        EZpvd();
    }

    private final void OLrzqt() {
        AbstractC16340eiA abstractC16340eiA = this.AEQbTJ;
        AbstractC16340eiA abstractC16340eiA2 = null;
        if (abstractC16340eiA == null) {
            Intrinsics.gEmmrt("");
            abstractC16340eiA = null;
        }
        abstractC16340eiA.copydefault.setHasFixedSize(true);
        AbstractC16340eiA abstractC16340eiA3 = this.AEQbTJ;
        if (abstractC16340eiA3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16340eiA3 = null;
        }
        abstractC16340eiA3.copydefault.setLayoutManager(new LinearLayoutManager(this, 1, false));
        AbstractC16340eiA abstractC16340eiA4 = this.AEQbTJ;
        if (abstractC16340eiA4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16340eiA4 = null;
        }
        abstractC16340eiA4.copydefault.addItemDecoration(new C31703mAu(C33052mpF.EZpvd(16.0f, (android.content.Context) this), C33052mpF.EZpvd(16.0f, (android.content.Context) this)));
        AbstractC16340eiA abstractC16340eiA5 = this.AEQbTJ;
        if (abstractC16340eiA5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16340eiA2 = abstractC16340eiA5;
        }
        abstractC16340eiA2.copydefault.setAdapter(this.EZpvd);
        InterfaceC59537zis interfaceC59537zisRegister = this.EZpvd.register(KeystoneSelectAccountViewModel.KeystoneAccountInfo.class);
        int i = C13754dXa.TaskDescription.v;
        int i2 = dTV.DbNXlk;
        interfaceC59537zisRegister.copydefault(new LoaderManager(i, i2), new Fragment(C13754dXa.TaskDescription.FQNKFG, i2)).AEQbTJ(new InterfaceC59531zim() { // from class: o.eGf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59531zim
            public final int OLrzqt(int i3, java.lang.Object obj) {
                return ActivityC15384eGi.AEQbTJ(i3, (KeystoneSelectAccountViewModel.KeystoneAccountInfo) obj);
            }
        });
        C33064mpR.OLrzqt(this.EZpvd, (java.util.List<? extends java.lang.Object>) C56402yEa.EZpvd(KeystoneSelectAccountViewModel.KeystoneAccountInfo.Companion.KWHzl()));
    }

    /* JADX INFO: renamed from: o.eGi$LoaderManager */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class LoaderManager extends C43318rmy<KeystoneSelectAccountViewModel.KeystoneAccountInfo, AbstractC16775eqL> {
        public LoaderManager(int i, int i2) {
            super(i, i2);
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC43310rmq, o.AbstractC59533zio
        public C43312rms<AbstractC16775eqL> onCreateViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C43312rms<AbstractC16775eqL> c43312rmsOnCreateViewHolder = super.onCreateViewHolder(layoutInflater, viewGroup);
            Intrinsics.checkNotNullExpressionValue(c43312rmsOnCreateViewHolder, "");
            AppCompatTextView appCompatTextView = ((AbstractC16775eqL) c43312rmsOnCreateViewHolder.OLrzqt()).KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setOnClickListener(new Application(appCompatTextView, 1000L));
            return c43312rmsOnCreateViewHolder;
        }

        /* JADX INFO: renamed from: o.eGi$LoaderManager$Application */
        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j) {
                this.OLrzqt = view;
                this.copydefault = j;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    android.content.Context context = ((AppCompatTextView) this.OLrzqt).getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                    viewOnClickListenerC54939xaY.copydefault(C13754dXa.FragmentManager.FullyDrawnReporterKtreportWhenComplete1);
                    ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C13754dXa.FragmentManager.getNotifyChildrenChangedOptions, (View.OnClickListener) null, 2, (java.lang.Object) null);
                    viewOnClickListenerC54939xaY.show();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.eGi$Fragment */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Fragment extends C43318rmy<KeystoneSelectAccountViewModel.KeystoneAccountInfo, AbstractC16771eqH> {
        public KeystoneSelectAccountViewModel.KeystoneAccountInfo OLrzqt;

        public Fragment(int i, int i2) {
            super(i, i2);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<AbstractC16771eqH> c43312rms, final KeystoneSelectAccountViewModel.KeystoneAccountInfo keystoneAccountInfo) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(keystoneAccountInfo, "");
            ((AbstractC16771eqH) c43312rms.OLrzqt()).AhwBna.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            AppCompatTextView appCompatTextView = ((AbstractC16771eqH) c43312rms.OLrzqt()).AhwBna;
            android.text.SpannableString spannableString = new android.text.SpannableString(C33070mpX.AYXKKw(C13754dXa.FragmentManager.dPnHjp));
            spannableString.setSpan(new Application(keystoneAccountInfo, ActivityC15384eGi.this, c43312rms), 0, spannableString.length(), 33);
            appCompatTextView.setText(spannableString);
            AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = C8003auW.copydefault(((AbstractC16771eqH) c43312rms.OLrzqt()).getRoot()).throttleFirst(200L, java.util.concurrent.TimeUnit.MILLISECONDS);
            final ActivityC15384eGi activityC15384eGi = ActivityC15384eGi.this;
            abstractC58247yxgThrottleFirst.subscribe(new InterfaceC58227yxM() { // from class: o.eGn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ActivityC15384eGi.Fragment.AEQbTJ(keystoneAccountInfo, this, activityC15384eGi, obj);
                }
            });
            keystoneAccountInfo.setSelected(Intrinsics.EZpvd(keystoneAccountInfo, this.OLrzqt));
            super.onBindViewHolder((C43312rms) c43312rms, keystoneAccountInfo);
        }

        /* JADX INFO: renamed from: o.eGi$Fragment$Application */
        public static final class Application extends android.text.style.ClickableSpan {
            public final /* synthetic */ KeystoneSelectAccountViewModel.KeystoneAccountInfo AEQbTJ;
            public final /* synthetic */ ActivityC15384eGi EZpvd;
            public final /* synthetic */ C43312rms<AbstractC16771eqH> KWHzl;

            public Application(KeystoneSelectAccountViewModel.KeystoneAccountInfo keystoneAccountInfo, ActivityC15384eGi activityC15384eGi, C43312rms<AbstractC16771eqH> c43312rms) {
                this.AEQbTJ = keystoneAccountInfo;
                this.EZpvd = activityC15384eGi;
                this.KWHzl = c43312rms;
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(android.view.View view) {
                Intrinsics.checkNotNullParameter(view, "");
                C18479fjF.Activity activity = C18479fjF.Companion;
                java.util.List<DerviationEVM> ethDeriveInfo = this.AEQbTJ.getEthDeriveInfo();
                java.lang.String selectEthAddress = this.AEQbTJ.getSelectEthAddress();
                final KeystoneSelectAccountViewModel.KeystoneAccountInfo keystoneAccountInfo = this.AEQbTJ;
                final ActivityC15384eGi activityC15384eGi = this.EZpvd;
                final C43312rms<AbstractC16771eqH> c43312rms = this.KWHzl;
                C18479fjF c18479fjFCopydefault = activity.copydefault(ethDeriveInfo, selectEthAddress, new Function1() { // from class: o.eGl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC15384eGi.Fragment.Application.OLrzqt(keystoneAccountInfo, activityC15384eGi, c43312rms, (DerviationEVM) obj);
                    }
                });
                androidx.fragment.app.FragmentManager supportFragmentManager = this.EZpvd.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                c18479fjFCopydefault.show(supportFragmentManager);
            }

            public static final Unit OLrzqt(KeystoneSelectAccountViewModel.KeystoneAccountInfo keystoneAccountInfo, final ActivityC15384eGi activityC15384eGi, C43312rms c43312rms, DerviationEVM derviationEVM) {
                java.lang.String strDbNXlk;
                Intrinsics.checkNotNullParameter(derviationEVM, "");
                ChainAddress selectEthChainAddress = keystoneAccountInfo.getSelectEthChainAddress();
                java.lang.String address = derviationEVM.getAddress();
                if (address == null) {
                    return Unit.INSTANCE;
                }
                keystoneAccountInfo.setSelectEthAddress(address);
                if (keystoneAccountInfo.isAdded()) {
                    activityC15384eGi.showLoading();
                    C12766ctF c12766ctF = C12766ctF.copydefault;
                    AbstractC12782ctV wallet = keystoneAccountInfo.getWallet();
                    if (wallet == null || (strDbNXlk = wallet.DbNXlk()) == null) {
                        return Unit.INSTANCE;
                    }
                    if (selectEthChainAddress == null) {
                        return Unit.INSTANCE;
                    }
                    ChainAddress selectEthChainAddress2 = keystoneAccountInfo.getSelectEthChainAddress();
                    if (selectEthChainAddress2 == null) {
                        return Unit.INSTANCE;
                    }
                    AbstractC58185ywX<java.lang.Integer> abstractC58185ywXCopydefault = c12766ctF.copydefault(strDbNXlk, selectEthChainAddress, selectEthChainAddress2);
                    final Function1 function1 = new Function1() { // from class: o.eGp
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return ActivityC15384eGi.Fragment.Application.copydefault(activityC15384eGi, (java.lang.Integer) obj);
                        }
                    };
                    InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eGs
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            ActivityC15384eGi.Fragment.Application.copydefault(function1, obj);
                        }
                    };
                    final Function1 function12 = new Function1() { // from class: o.eGq
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return ActivityC15384eGi.Fragment.Application.EZpvd(activityC15384eGi, (java.lang.Throwable) obj);
                        }
                    };
                    abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eGr
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            ActivityC15384eGi.Fragment.Application.KWHzl(function12, obj);
                        }
                    });
                }
                activityC15384eGi.EZpvd.notifyItemChanged(c43312rms.getBindingAdapterPosition());
                return Unit.INSTANCE;
            }

            public static final void copydefault(Function1 function1, java.lang.Object obj) {
                function1.invoke(obj);
            }

            public static final Unit copydefault(ActivityC15384eGi activityC15384eGi, java.lang.Integer num) {
                activityC15384eGi.dismissLoading();
                C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DMb), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                return Unit.INSTANCE;
            }

            public static final void KWHzl(Function1 function1, java.lang.Object obj) {
                function1.invoke(obj);
            }

            public static final Unit EZpvd(ActivityC15384eGi activityC15384eGi, java.lang.Throwable th) {
                activityC15384eGi.dismissLoading();
                return Unit.INSTANCE;
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(android.text.TextPaint textPaint) {
                Intrinsics.checkNotNullParameter(textPaint, "");
                super.updateDrawState(textPaint);
                textPaint.setColor(ContextCompat.getColor(this.EZpvd, C52761wXj.Activity.fdOvFl));
                textPaint.setUnderlineText(true);
            }
        }

        public static final void AEQbTJ(KeystoneSelectAccountViewModel.KeystoneAccountInfo keystoneAccountInfo, Fragment fragment, ActivityC15384eGi activityC15384eGi, java.lang.Object obj) {
            if (keystoneAccountInfo.isAdded()) {
                return;
            }
            AbstractC16340eiA abstractC16340eiA = null;
            if (keystoneAccountInfo.isSelected()) {
                fragment.OLrzqt = null;
                AbstractC16340eiA abstractC16340eiA2 = activityC15384eGi.AEQbTJ;
                if (abstractC16340eiA2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16340eiA = abstractC16340eiA2;
                }
                C52794wYp c52794wYpCopydefault = abstractC16340eiA.EZpvd.copydefault();
                if (c52794wYpCopydefault != null) {
                    c52794wYpCopydefault.setEnabled(false);
                }
            } else {
                fragment.OLrzqt = keystoneAccountInfo;
                AbstractC16340eiA abstractC16340eiA3 = activityC15384eGi.AEQbTJ;
                if (abstractC16340eiA3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16340eiA = abstractC16340eiA3;
                }
                C52794wYp c52794wYpCopydefault2 = abstractC16340eiA.EZpvd.copydefault();
                if (c52794wYpCopydefault2 != null) {
                    c52794wYpCopydefault2.setEnabled(true);
                }
            }
            activityC15384eGi.EZpvd.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: o.eGi$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ ActivityC15384eGi OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC15384eGi activityC15384eGi) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = activityC15384eGi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.finish();
            }
        }
    }

    /* JADX INFO: renamed from: o.eGi$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ ActivityC15384eGi copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ActivityC15384eGi activityC15384eGi) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = activityC15384eGi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            KeystoneSelectAccountViewModel keystoneSelectAccountViewModel;
            java.lang.Object next;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Web3WalletConnectedSuccess_WalletAddress_Connect_Click", (TrackChannel[]) null, StateListAnimator.copydefault, 1, (java.lang.Object) null);
                KeystoneSelectAccountViewModel keystoneSelectAccountViewModel2 = this.copydefault.djBIcL;
                if (keystoneSelectAccountViewModel2 == null) {
                    Intrinsics.gEmmrt("");
                    keystoneSelectAccountViewModel = null;
                } else {
                    keystoneSelectAccountViewModel = keystoneSelectAccountViewModel2;
                }
                androidx.fragment.app.FragmentManager supportFragmentManager = this.copydefault.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                ActivityC15384eGi activityC15384eGi = this.copydefault;
                java.util.List<?> items = activityC15384eGi.EZpvd.getItems();
                Intrinsics.checkNotNullExpressionValue(items, "");
                java.util.Iterator<T> it = items.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if ((next instanceof KeystoneSelectAccountViewModel.KeystoneAccountInfo) && ((KeystoneSelectAccountViewModel.KeystoneAccountInfo) next).isSelected()) {
                        break;
                    }
                }
                KeystoneSelectAccountViewModel.KeystoneAccountInfo keystoneAccountInfo = next instanceof KeystoneSelectAccountViewModel.KeystoneAccountInfo ? (KeystoneSelectAccountViewModel.KeystoneAccountInfo) next : null;
                if (keystoneAccountInfo == null) {
                    return;
                }
                keystoneSelectAccountViewModel.OLrzqt(supportFragmentManager, activityC15384eGi, keystoneAccountInfo, this.copydefault.KWHzl, TaskDescription.copydefault);
            }
        }
    }

    public static final int AEQbTJ(int i, KeystoneSelectAccountViewModel.KeystoneAccountInfo keystoneAccountInfo) {
        Intrinsics.checkNotNullParameter(keystoneAccountInfo, "");
        return !keystoneAccountInfo.isHeader() ? 1 : 0;
    }

    public final void copydefault() {
        showLoading();
        KeystoneSelectAccountViewModel keystoneSelectAccountViewModel = this.djBIcL;
        KeystoneSelectAccountViewModel keystoneSelectAccountViewModel2 = null;
        if (keystoneSelectAccountViewModel == null) {
            Intrinsics.gEmmrt("");
            keystoneSelectAccountViewModel = null;
        }
        keystoneSelectAccountViewModel.AEQbTJ(false);
        AbstractC16340eiA abstractC16340eiA = this.AEQbTJ;
        if (abstractC16340eiA == null) {
            Intrinsics.gEmmrt("");
            abstractC16340eiA = null;
        }
        abstractC16340eiA.OLrzqt.djBIcL(false);
        AbstractC16340eiA abstractC16340eiA2 = this.AEQbTJ;
        if (abstractC16340eiA2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16340eiA2 = null;
        }
        abstractC16340eiA2.OLrzqt.AhwBna(true);
        AbstractC16340eiA abstractC16340eiA3 = this.AEQbTJ;
        if (abstractC16340eiA3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16340eiA3 = null;
        }
        abstractC16340eiA3.OLrzqt.KWHzl(new InterfaceC57900yrD() { // from class: o.eGk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                ActivityC15384eGi.KWHzl(this.copydefault, interfaceC57934yrl);
            }
        });
        KeystoneSelectAccountViewModel keystoneSelectAccountViewModel3 = this.djBIcL;
        if (keystoneSelectAccountViewModel3 == null) {
            Intrinsics.gEmmrt("");
            keystoneSelectAccountViewModel3 = null;
        }
        keystoneSelectAccountViewModel3.OLrzqt().observe(this, new FragmentManager(new Function1() { // from class: o.eGm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15384eGi.OLrzqt(this.AEQbTJ, (java.util.ArrayList) obj);
            }
        }));
        KeystoneSelectAccountViewModel keystoneSelectAccountViewModel4 = this.djBIcL;
        if (keystoneSelectAccountViewModel4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            keystoneSelectAccountViewModel2 = keystoneSelectAccountViewModel4;
        }
        keystoneSelectAccountViewModel2.copydefault().observe(this, new FragmentManager(new Function1() { // from class: o.eGo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15384eGi.EZpvd(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final void KWHzl(ActivityC15384eGi activityC15384eGi, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        KeystoneSelectAccountViewModel keystoneSelectAccountViewModel = activityC15384eGi.djBIcL;
        if (keystoneSelectAccountViewModel == null) {
            Intrinsics.gEmmrt("");
            keystoneSelectAccountViewModel = null;
        }
        keystoneSelectAccountViewModel.AEQbTJ(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(ActivityC15384eGi activityC15384eGi, java.util.ArrayList arrayList) {
        activityC15384eGi.EZpvd.setItems(arrayList);
        AbstractC16340eiA abstractC16340eiA = null;
        if (arrayList.size() == 1) {
            Intrinsics.copydefault(arrayList);
            if (((KeystoneSelectAccountViewModel.KeystoneAccountInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList)).getIndex() != KeystoneSelectAccountViewModel.KeystoneAccountInfo.Companion.KWHzl().getIndex()) {
                activityC15384eGi.dismissLoading();
                rVN.reportFullyDrawn$default((android.app.Activity) activityC15384eGi, true, (java.lang.String) null, 2, (java.lang.Object) null);
            }
        }
        activityC15384eGi.AEQbTJ();
        AbstractC16340eiA abstractC16340eiA2 = activityC15384eGi.AEQbTJ;
        if (abstractC16340eiA2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16340eiA2 = null;
        }
        abstractC16340eiA2.OLrzqt.valueOf();
        activityC15384eGi.EZpvd.notifyDataSetChanged();
        KeystoneSelectAccountViewModel keystoneSelectAccountViewModel = activityC15384eGi.djBIcL;
        if (keystoneSelectAccountViewModel == null) {
            Intrinsics.gEmmrt("");
            keystoneSelectAccountViewModel = null;
        }
        if (keystoneSelectAccountViewModel.EZpvd()) {
            AbstractC16340eiA abstractC16340eiA3 = activityC15384eGi.AEQbTJ;
            if (abstractC16340eiA3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16340eiA = abstractC16340eiA3;
            }
            abstractC16340eiA.OLrzqt.AhwBna(false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ActivityC15384eGi activityC15384eGi, java.lang.Boolean bool) {
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.FALSE)) {
            activityC15384eGi.valueOf();
        }
        return Unit.INSTANCE;
    }

    private final void valueOf() {
        C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.launchUnitdefault, 0, 1, (java.lang.Object) null);
    }

    public final void AEQbTJ() {
        KeystoneMultiAccount keystoneMultiAccount;
        java.lang.String device;
        java.lang.String deviceVersion;
        if (SPUtils.getBoolean("defi_wallet_keystone_show_upgrade", false) || (keystoneMultiAccount = this.OLrzqt) == null || (device = keystoneMultiAccount.getDevice()) == null || !device.equals("Keystone 3 Pro")) {
            return;
        }
        KeystoneMultiAccount keystoneMultiAccount2 = this.OLrzqt;
        java.lang.String deviceVersion2 = keystoneMultiAccount2 != null ? keystoneMultiAccount2.getDeviceVersion() : null;
        if (deviceVersion2 != null && deviceVersion2.length() != 0) {
            C14085dem c14085dem = C14085dem.copydefault;
            KeystoneMultiAccount keystoneMultiAccount3 = this.OLrzqt;
            if (keystoneMultiAccount3 == null || (deviceVersion = keystoneMultiAccount3.getDeviceVersion()) == null) {
                deviceVersion = "";
            }
            if (c14085dem.KWHzl(deviceVersion, "1.0.4") >= 0) {
                return;
            }
        }
        eGB egb = new eGB();
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        egb.show(supportFragmentManager);
        SPUtils.commit("defi_wallet_keystone_show_upgrade", java.lang.Boolean.TRUE);
    }

    public final void EZpvd() {
        AbstractC16340eiA abstractC16340eiA = this.AEQbTJ;
        AbstractC16340eiA abstractC16340eiA2 = null;
        if (abstractC16340eiA == null) {
            Intrinsics.gEmmrt("");
            abstractC16340eiA = null;
        }
        AppCompatImageView appCompatImageView = abstractC16340eiA.AEQbTJ;
        appCompatImageView.setOnClickListener(new ActionBar(appCompatImageView, 1000L, this));
        AbstractC16340eiA abstractC16340eiA3 = this.AEQbTJ;
        if (abstractC16340eiA3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16340eiA2 = abstractC16340eiA3;
        }
        C52794wYp c52794wYpCopydefault = abstractC16340eiA2.EZpvd.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new Application(c52794wYpCopydefault, 1000L, this));
        }
    }

    /* JADX INFO: renamed from: o.eGi$StateListAnimator */
    public static final class StateListAnimator implements Function1<EventParamsList, Unit> {
        public static final StateListAnimator copydefault = new StateListAnimator();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            KWHzl(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void KWHzl(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.add(new EventParam("brand_name", "keystone", true));
        }
    }

    /* JADX INFO: renamed from: o.eGi$TaskDescription */
    public static final class TaskDescription implements Function1<AbstractC12782ctV, Unit> {
        public static final TaskDescription copydefault = new TaskDescription();

        public final void EZpvd(AbstractC12782ctV abstractC12782ctV) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(AbstractC12782ctV abstractC12782ctV) {
            EZpvd(abstractC12782ctV);
            return Unit.INSTANCE;
        }
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
