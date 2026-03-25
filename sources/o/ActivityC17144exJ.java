package o;

import android.view.View;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.wallet.mine.walletmanage.walletmanageradapter.SafeLinearLayoutManager;
import com.okinc.wallet.api.bean.AddressType;
import com.okinc.web3.security.service.Web3SecurityServiceProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C11010bzJ;
import o.C12827cuN;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.exJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ActivityC17144exJ extends AbstractActivityC33013moT {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final C43316rmw OLrzqt = new C43316rmw();
    public AbstractC16314ehb copydefault;

    /* JADX INFO: renamed from: o.exJ$StateListAnimator */
    public static final class StateListAnimator extends AbstractC43310rmq<ActionBar.TaskDescription, AbstractC16754epr> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C13754dXa.TaskDescription.DcMfJKdMCrTj;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return dTV.isConnected;
        }
    }

    /* JADX INFO: renamed from: o.exJ$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.exJ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void copydefault(@NotNull AbstractActivityC33041mov abstractActivityC33041mov) {
            Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
            abstractActivityC33041mov.startActivity(new android.content.Intent(abstractActivityC33041mov, (java.lang.Class<?>) ActivityC17144exJ.class));
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AbstractC16314ehb abstractC16314ehbEZpvd = AbstractC16314ehb.EZpvd(getLayoutInflater());
        this.copydefault = abstractC16314ehbEZpvd;
        AbstractC16314ehb abstractC16314ehb = null;
        if (abstractC16314ehbEZpvd == null) {
            Intrinsics.gEmmrt("");
            abstractC16314ehbEZpvd = null;
        }
        abstractC16314ehbEZpvd.KWHzl.setTitle("导出Nostr私钥(Export the Nostr private key)");
        AbstractC16314ehb abstractC16314ehb2 = this.copydefault;
        if (abstractC16314ehb2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16314ehb = abstractC16314ehb2;
        }
        setContentView(abstractC16314ehb.getRoot());
        OLrzqt();
        KWHzl();
        EZpvd();
    }

    private final void OLrzqt() {
        AbstractC16314ehb abstractC16314ehb = this.copydefault;
        AbstractC16314ehb abstractC16314ehb2 = null;
        if (abstractC16314ehb == null) {
            Intrinsics.gEmmrt("");
            abstractC16314ehb = null;
        }
        abstractC16314ehb.EZpvd.setLayoutManager(new SafeLinearLayoutManager(this));
        AbstractC16314ehb abstractC16314ehb3 = this.copydefault;
        if (abstractC16314ehb3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16314ehb2 = abstractC16314ehb3;
        }
        abstractC16314ehb2.EZpvd.setAdapter(this.OLrzqt);
    }

    private final void KWHzl() {
        this.OLrzqt.register(ActionBar.Activity.class, new TaskDescription());
        this.OLrzqt.register(ActionBar.StateListAnimator.class, new Application(new Function1() { // from class: o.exP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17144exJ.OLrzqt(this.AEQbTJ, (AbstractC12782ctV) obj);
            }
        }));
        this.OLrzqt.register(ActionBar.TaskDescription.class, new StateListAnimator());
    }

    public static final Unit OLrzqt(final ActivityC17144exJ activityC17144exJ, final AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        final C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(1237L);
        if (c10854bwMCopydefault == null) {
            C55326xho.toast$default("Nostr 暂不支持(Nostr is not supported)", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return Unit.INSTANCE;
        }
        androidx.fragment.app.FragmentManager supportFragmentManager = activityC17144exJ.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        new C14461dlr(supportFragmentManager, "debugExportNostr", new Function1() { // from class: o.exV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17144exJ.EZpvd(abstractC12782ctV, c10854bwMCopydefault, activityC17144exJ, (java.lang.String) obj);
            }
        }, null, null, false, 56, null).EZpvd();
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(final AbstractC12782ctV abstractC12782ctV, final C10854bwM c10854bwM, final ActivityC17144exJ activityC17144exJ, final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAhwBna = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).AhwBna(str);
        final Function1 function1 = new Function1() { // from class: o.exN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17144exJ.OLrzqt(str, abstractC12782ctV, c10854bwM, activityC17144exJ, (java.lang.String) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.String> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.exM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC17144exJ.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.exQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17144exJ.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        activityC17144exJ.addDisposable(abstractC58260yxtAhwBna.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.exO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC17144exJ.valueOf(function12, obj);
            }
        }));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.String str, AbstractC12782ctV abstractC12782ctV, C10854bwM c10854bwM, ActivityC17144exJ activityC17144exJ, java.lang.String str2) {
        xXW xxw = xXW.OLrzqt;
        Intrinsics.copydefault((java.lang.Object) str2);
        java.lang.String strAEQbTJ = xxw.AEQbTJ(str, str2, abstractC12782ctV.RlQdEF(), true);
        if (strAEQbTJ.length() == 0) {
            C55326xho.toastWithFailedIcon$default("助记词错误(Mnemonic error)", 0, 1, (java.lang.Object) null);
            return Unit.INSTANCE;
        }
        java.lang.String strKWHzl = xYW.AEQbTJ.KWHzl(strAEQbTJ, abstractC12782ctV.DCUTEI(), c10854bwM.QKVWgx(), true, abstractC12782ctV.finit(), AddressType.Legacy.getValue());
        if (strKWHzl.length() == 0) {
            C55326xho.toastWithFailedIcon$default("恢复Nostr私钥失败(Failed to recover the Nostr private key)", 0, 1, (java.lang.Object) null);
            return Unit.INSTANCE;
        }
        java.lang.String strAYXKKw = abstractC12782ctV.AYXKKw();
        Web3SecurityServiceProvider.getService().showPrivateKeyDialog(activityC17144exJ, strAYXKKw + " 的 Nostr 私钥(Nostr private key of " + strAYXKKw + ")", strKWHzl);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void EZpvd() {
        AbstractC16314ehb abstractC16314ehb = this.copydefault;
        if (abstractC16314ehb == null) {
            Intrinsics.gEmmrt("");
            abstractC16314ehb = null;
        }
        abstractC16314ehb.OLrzqt.KWHzl(0L);
        AbstractC58260yxt allRootWallets$default = C12827cuN.getAllRootWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), true, false, 2, null);
        final Function1 function1 = new Function1() { // from class: o.exI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17144exJ.copydefault(this.OLrzqt, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.exH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC17144exJ.AhwBna(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.exK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17144exJ.OLrzqt(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        addDisposable(allRootWallets$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.exL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC17144exJ.AYXKKw(function12, obj);
            }
        }));
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(ActivityC17144exJ activityC17144exJ, java.util.List list) {
        AbstractC16314ehb abstractC16314ehb = activityC17144exJ.copydefault;
        if (abstractC16314ehb == null) {
            Intrinsics.gEmmrt("");
            abstractC16314ehb = null;
        }
        abstractC16314ehb.OLrzqt.copydefault();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        Intrinsics.copydefault(list);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) it.next();
            if (abstractC12784ctX.fJNWhG() == WalletType.HDWallet) {
                arrayList.add(new ActionBar.Activity(abstractC12784ctX.AuCTel()));
                for (AbstractC12782ctV abstractC12782ctV : abstractC12784ctX.KWHzl()) {
                    if (abstractC12782ctV.AubY()) {
                        arrayList.add(new ActionBar.StateListAnimator(abstractC12782ctV));
                    }
                }
                arrayList.add(ActionBar.TaskDescription.AEQbTJ);
            }
        }
        arrayList.remove(yDY.AuCTel(arrayList));
        if (!arrayList.isEmpty()) {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activityC17144exJ);
            viewOnClickListenerC54939xaY.EZpvd("点击钱包名称获以获取Nostr私钥(Click the wallet name to get the Nostr private key)");
            ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, "继续(continue)", (View.OnClickListener) null, 2, (java.lang.Object) null);
            viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
            viewOnClickListenerC54939xaY.show();
        } else {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = new ViewOnClickListenerC54939xaY(activityC17144exJ);
            viewOnClickListenerC54939xaY2.EZpvd("请先导入助记词以获取Nostr私钥(Import the mnemonic first to get the Nostr private key)");
            ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY2, "知道了(get it)", (View.OnClickListener) null, 2, (java.lang.Object) null);
            viewOnClickListenerC54939xaY2.setCanceledOnTouchOutside(true);
            viewOnClickListenerC54939xaY2.show();
        }
        C33064mpR.OLrzqt(activityC17144exJ.OLrzqt, (java.util.List<? extends java.lang.Object>) arrayList);
        rVN.reportFullyDrawn$default((android.app.Activity) activityC17144exJ, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(ActivityC17144exJ activityC17144exJ, java.lang.Throwable th) {
        AbstractC16314ehb abstractC16314ehb = activityC17144exJ.copydefault;
        if (abstractC16314ehb == null) {
            Intrinsics.gEmmrt("");
            abstractC16314ehb = null;
        }
        abstractC16314ehb.OLrzqt.copydefault();
        rVN.reportFullyDrawn$default((android.app.Activity) activityC17144exJ, false, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.exJ$ActionBar */
    public static abstract class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.exJ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX INFO: renamed from: o.exJ$ActionBar$Activity */
        public static final class Activity extends ActionBar {
            public final java.lang.String EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = activity.EZpvd;
                }
                return activity.EZpvd(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity EZpvd(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Activity(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((Activity) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "RootWalletUIBean(name=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull java.lang.String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.EZpvd = str;
            }
        }

        /* JADX INFO: renamed from: o.exJ$ActionBar$StateListAnimator */
        public static final class StateListAnimator extends ActionBar {
            public final AbstractC12782ctV EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, AbstractC12782ctV abstractC12782ctV, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    abstractC12782ctV = stateListAnimator.EZpvd;
                }
                return stateListAnimator.KWHzl(abstractC12782ctV);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV) {
                Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
                return new StateListAnimator(abstractC12782ctV);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AbstractC12782ctV copydefault() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.EZpvd, ((StateListAnimator) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "WalletUIBean(wallet=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull AbstractC12782ctV abstractC12782ctV) {
                super(null);
                Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
                this.EZpvd = abstractC12782ctV;
            }
        }

        /* JADX INFO: renamed from: o.exJ$ActionBar$TaskDescription */
        public static final class TaskDescription extends ActionBar {
            public static final TaskDescription AEQbTJ = new TaskDescription();

            private TaskDescription() {
                super(null);
            }
        }
    }

    /* JADX INFO: renamed from: o.exJ$Application */
    public static final class Application extends AbstractC43310rmq<ActionBar.StateListAnimator, AbstractC16760epx> {
        public final Function1<AbstractC12782ctV, Unit> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C13754dXa.TaskDescription.DcMfJKfNUfqk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return dTV.isConnected;
        }

        /* JADX INFO: renamed from: o.exJ$Application$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ Application KWHzl;
            public final /* synthetic */ ActionBar.StateListAnimator copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, Application application, ActionBar.StateListAnimator stateListAnimator) {
                this.EZpvd = view;
                this.AEQbTJ = j;
                this.KWHzl = application;
                this.copydefault = stateListAnimator;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    this.KWHzl.copydefault.invoke(this.copydefault.copydefault());
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.ctV, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(@NotNull Function1<? super AbstractC12782ctV, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC16760epx> c43312rms, @NotNull ActionBar.StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            super.onBindViewHolder((C43312rms) c43312rms, stateListAnimator);
            ((AbstractC16760epx) c43312rms.OLrzqt()).AEQbTJ.setText(stateListAnimator.copydefault().AkhnZx());
            android.view.View view = c43312rms.itemView;
            view.setOnClickListener(new ActionBar(view, 1000L, this, stateListAnimator));
        }
    }

    /* JADX INFO: renamed from: o.exJ$TaskDescription */
    public static final class TaskDescription extends AbstractC43310rmq<ActionBar.Activity, AbstractC16753epq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C13754dXa.TaskDescription.fbC;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return dTV.isConnected;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC16753epq> c43312rms, @NotNull ActionBar.Activity activity) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(activity, "");
            super.onBindViewHolder((C43312rms) c43312rms, activity);
            ((AbstractC16753epq) c43312rms.OLrzqt()).AEQbTJ.setText(activity.EZpvd());
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
