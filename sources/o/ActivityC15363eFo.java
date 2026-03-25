package o;

import androidx.databinding.DataBindingUtil;
import com.okinc.business.defi.biz.wallethardware.ledger.LedgerSignHelper;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import com.okinc.wallet.hardware.api.ledger.LedgerSupportedApp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC14027ddh;
import o.ActivityC15363eFo;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eFo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC15363eFo extends AbstractActivityC33013moT {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public AbstractC16380eio OLrzqt;
    public int EZpvd = 1;
    public java.lang.String KWHzl = "";
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.eFn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC15363eFo.copydefault();
        }
    });

    private final C59534zip EZpvd() {
        return (C59534zip) this.AEQbTJ.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C59534zip copydefault() {
        return new C59534zip();
    }

    /* JADX INFO: renamed from: o.eFo$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eFo.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ void startActivity$default(ActionBar actionBar, android.content.Context context, int i, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                i = 1;
            }
            if ((i2 & 4) != 0) {
                str = "";
            }
            actionBar.KWHzl(context, i, str);
        }

        public final void KWHzl(@NotNull android.content.Context context, int i, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC15363eFo.class);
            intent.putExtra(OtcExtraKeys.MODE, i);
            intent.putExtra("from", str);
            context.startActivity(intent);
        }
    }

    private final void AEQbTJ() {
        android.content.Intent intent = getIntent();
        this.EZpvd = intent != null ? intent.getIntExtra(OtcExtraKeys.MODE, 1) : 1;
        android.content.Intent intent2 = getIntent();
        java.lang.String stringExtra = intent2 != null ? intent2.getStringExtra("from") : null;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.KWHzl = stringExtra;
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AEQbTJ();
        AbstractC16380eio abstractC16380eio = (AbstractC16380eio) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.hUfVAv);
        this.OLrzqt = abstractC16380eio;
        if (abstractC16380eio == null) {
            Intrinsics.gEmmrt("");
            abstractC16380eio = null;
        }
        abstractC16380eio.AEQbTJ.setAdapter(EZpvd());
        EZpvd().register(C10854bwM.class, new TaskDescription());
        C33064mpR.OLrzqt(EZpvd(), C10954byG.EZpvd.valueOf().fetchVPNInfo());
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.eFv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC15363eFo.EZpvd(this.AEQbTJ);
            }
        });
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXH.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, this);
        final Function1 function1 = new Function1() { // from class: o.eFw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15363eFo.AEQbTJ(this.EZpvd, (xXH) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.eFA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC15363eFo.valueOf(function1, obj);
            }
        });
    }

    public static final void EZpvd(ActivityC15363eFo activityC15363eFo) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC15363eFo, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(ActivityC15363eFo activityC15363eFo, xXH xxh) {
        activityC15363eFo.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.eFo$TaskDescription */
    /* JADX INFO: loaded from: classes15.dex */
    public final class TaskDescription extends C43318rmy<C10854bwM, AbstractC16798eqi> {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public TaskDescription() {
            super(C13754dXa.TaskDescription.hNurIN, dTV.isConnected);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC16798eqi> c43312rms, @NotNull final C10854bwM c10854bwM) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(c10854bwM, "");
            super.onBindViewHolder((C43312rms) c43312rms, c10854bwM);
            android.widget.ImageView imageView = ((AbstractC16798eqi) c43312rms.OLrzqt()).KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C57659ymb.copydefault(imageView, c10854bwM.copydefault(), C52761wXj.TaskDescription.aHXSQp, 1.0f, 32.0f);
            ((AbstractC16798eqi) c43312rms.OLrzqt()).EZpvd.setText(c10854bwM.djBIcL());
            AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = C8003auW.copydefault(c43312rms.itemView).throttleFirst(3L, java.util.concurrent.TimeUnit.SECONDS);
            final ActivityC15363eFo activityC15363eFo = ActivityC15363eFo.this;
            abstractC58247yxgThrottleFirst.subscribe(new InterfaceC58227yxM() { // from class: o.eFz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ActivityC15363eFo.TaskDescription.OLrzqt(activityC15363eFo, c10854bwM, obj);
                }
            });
        }

        public static final void OLrzqt(ActivityC15363eFo activityC15363eFo, C10854bwM c10854bwM, java.lang.Object obj) {
            activityC15363eFo.EZpvd(c10854bwM);
        }
    }

    public final void EZpvd(final C10854bwM c10854bwM) {
        showLoadingAtOnce();
        AbstractC58260yxt<AbstractC14027ddh> abstractC58260yxtOLrzqt = C14033ddn.OLrzqt.OLrzqt(c10854bwM);
        final Function1 function1 = new Function1() { // from class: o.eFs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15363eFo.EZpvd(this.KWHzl, c10854bwM, (AbstractC14027ddh) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC14027ddh> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eFu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC15363eFo.OLrzqt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.eFr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15363eFo.copydefault(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        addDisposable(abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eFt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC15363eFo.AEQbTJ(function12, obj);
            }
        }));
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.eDA.TaskDescription.start$default(o.eDA$TaskDescription, android.app.Activity, int, com.okinc.wallet.hardware.api.ledger.LedgerSupportedApp, java.lang.String, boolean, int, java.lang.Object):void */
    public static final Unit EZpvd(ActivityC15363eFo activityC15363eFo, C10854bwM c10854bwM, AbstractC14027ddh abstractC14027ddh) {
        activityC15363eFo.dismissLoading();
        if (abstractC14027ddh instanceof AbstractC14027ddh.ActionBar) {
            if (((AbstractC14027ddh.ActionBar) abstractC14027ddh).EZpvd() == 73819765) {
                LedgerSupportedApp ledgerSupportedAppCopydefault = LedgerSignHelper.AEQbTJ.copydefault(c10854bwM);
                if (ledgerSupportedAppCopydefault == null) {
                    return Unit.INSTANCE;
                }
                eDA.Companion.copydefault(activityC15363eFo, 6, (8 & 4) != 0 ? null : ledgerSupportedAppCopydefault, (8 & 8) != 0 ? null : null, false);
            } else {
                java.lang.String string = activityC15363eFo.getString(C13754dXa.FragmentManager.MediaSessionCompatApi23);
                Intrinsics.checkNotNullExpressionValue(string, "");
                C55326xho.toastWithFailedIcon$default(string, 0, 1, (java.lang.Object) null);
            }
        } else {
            eEL.Companion.KWHzl(activityC15363eFo, activityC15363eFo.EZpvd, activityC15363eFo.KWHzl, c10854bwM.fetchVPNInfo());
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(ActivityC15363eFo activityC15363eFo, java.lang.Throwable th) {
        activityC15363eFo.dismissLoading();
        return Unit.INSTANCE;
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
