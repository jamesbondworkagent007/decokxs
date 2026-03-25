package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.defi.biz.core.ws.channel.SmallAssetsTxStatusSubManager;
import com.okinc.business.defi.wallet.tee.converter.ui.activity.SmallAssetsConverterResultActivity$txStatusSubListener$1$onSubData$1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o.C13754dXa;
import o.InterfaceC43294rma;
import o.xZF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fUu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ActivityC17855fUu extends AbstractActivityC33013moT {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public C10854bwM EZpvd;
    public C16430ejl OLrzqt;
    public long AEQbTJ = -1;
    public final TaskDescription KWHzl = new TaskDescription(toString());

    /* JADX INFO: renamed from: o.fUu$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fUu.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void KWHzl(@NotNull android.content.Context context, int i, long j) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC17855fUu.class);
            intent.putExtra("convert_token_num", i);
            intent.putExtra("convert_chain_id", j);
            context.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: o.fUu$TaskDescription */
    public static final class TaskDescription extends xZF.TaskDescription<SmallAssetsTxStatusSubManager.SubResponse> {
        public TaskDescription(java.lang.String str) {
            super(str, null, 2, null);
        }

        @Override // o.xZF.TaskDescription
        public void EZpvd(java.util.List<SmallAssetsTxStatusSubManager.SubResponse> list) {
            Intrinsics.checkNotNullParameter(list, "");
            SmallAssetsTxStatusSubManager.SubResponse subResponse = (SmallAssetsTxStatusSubManager.SubResponse) CollectionsKt___CollectionsKt.firstOrNull(list);
            SmallAssetsTxStatusSubManager.SubResponseData data = subResponse != null ? subResponse.getData() : null;
            if (data != null) {
                C10854bwM c10854bwMCopydefault = ActivityC17855fUu.this.EZpvd;
                if (c10854bwMCopydefault == null) {
                    c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(ActivityC17855fUu.this.AEQbTJ);
                }
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(ActivityC17855fUu.this), Dispatchers.getMain(), null, new SmallAssetsConverterResultActivity$txStatusSubListener$1$onSubData$1(data, ActivityC17855fUu.this, c10854bwMCopydefault, null), 2, null);
            }
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.clear();
        }
        super.onCreate(bundle);
        C16430ejl c16430ejlAEQbTJ = C16430ejl.AEQbTJ(getLayoutInflater());
        this.OLrzqt = c16430ejlAEQbTJ;
        if (bundle != null) {
            finish();
            return;
        }
        C16430ejl c16430ejl = null;
        if (c16430ejlAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            c16430ejlAEQbTJ = null;
        }
        setContentView(c16430ejlAEQbTJ.getRoot());
        KWHzl();
        EZpvd();
        C16430ejl c16430ejl2 = this.OLrzqt;
        if (c16430ejl2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16430ejl = c16430ejl2;
        }
        c16430ejl.EZpvd.AEQbTJ().setVisibility(8);
        int intExtra = getIntent().getIntExtra("convert_token_num", 0);
        this.AEQbTJ = getIntent().getLongExtra("convert_chain_id", -1L);
        this.EZpvd = C10954byG.EZpvd.valueOf().copydefault(this.AEQbTJ);
        copydefault(intExtra);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.fUA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC17855fUu.valueOf(this.KWHzl);
            }
        });
    }

    public static final void valueOf(ActivityC17855fUu activityC17855fUu) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC17855fUu, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void copydefault(int i) {
        setResultPageUI$default(this, pTD.EZpvd(this, C13754dXa.Dialog.AYXKKw, i, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(i)))), C33070mpX.AYXKKw(C13754dXa.FragmentManager.onCustomAction), 6, null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DarRvM), null, new Function0() { // from class: o.fUy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC17855fUu.isConnected(this.EZpvd);
            }
        }, 40, null);
    }

    public static final Unit isConnected(ActivityC17855fUu activityC17855fUu) {
        activityC17855fUu.finish();
        return Unit.INSTANCE;
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2, int i) {
        KWHzl(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatMediaSessionImpl), "", 4, C33070mpX.AYXKKw(C13754dXa.FragmentManager.removeOnActiveChangeListener), C33070mpX.AYXKKw(C13754dXa.FragmentManager.djSkpj), new Function0() { // from class: o.fUx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC17855fUu.values(this.copydefault);
            }
        }, new Function0() { // from class: o.fUB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC17855fUu.DbNXlk(this.OLrzqt);
            }
        });
        C16892esW c16892esWOLrzqt = C16892esW.OLrzqt(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c16892esWOLrzqt, "");
        c16892esWOLrzqt.getRoot().setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        C16430ejl c16430ejl = this.OLrzqt;
        if (c16430ejl == null) {
            Intrinsics.gEmmrt("");
            c16430ejl = null;
        }
        c16430ejl.EZpvd.setAdvancedView(c16892esWOLrzqt.getRoot());
        c16892esWOLrzqt.EZpvd.setText(str);
        c16892esWOLrzqt.AEQbTJ.setText(str2);
        boolean z = i > 0;
        c16892esWOLrzqt.KWHzl.setVisibility(z ? 0 : 8);
        c16892esWOLrzqt.OLrzqt.setVisibility(z ? 0 : 8);
        if (z) {
            c16892esWOLrzqt.OLrzqt.setText(pTD.EZpvd(this, C13754dXa.Dialog.valueOf, i, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(i)))));
        }
    }

    public static final Unit values(ActivityC17855fUu activityC17855fUu) {
        activityC17855fUu.OLrzqt();
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(ActivityC17855fUu activityC17855fUu) {
        activityC17855fUu.finish();
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        setResultPageUI$default(this, C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatCallbackStubApi21), C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompat3), 3, null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getServiceComponent), null, new Function0() { // from class: o.fUt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC17855fUu.gEmmrt(this.EZpvd);
            }
        }, 40, null);
    }

    public static final Unit gEmmrt(ActivityC17855fUu activityC17855fUu) {
        activityC17855fUu.finish();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: o.fUu */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setResultPageUI$default(ActivityC17855fUu activityC17855fUu, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, Function0 function0, Function0 function02, int i2, java.lang.Object obj) {
        activityC17855fUu.KWHzl(str, str2, i, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : function0, (i2 & 64) != 0 ? null : function02);
    }

    /* JADX INFO: renamed from: o.fUu$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ Function0 EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, Function0 function0) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: o.fUu$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ Function0 OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, Function0 function0) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.invoke();
            }
        }
    }

    private final void KWHzl(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, Function0<Unit> function0, Function0<Unit> function02) {
        C16430ejl c16430ejl = this.OLrzqt;
        C16430ejl c16430ejl2 = null;
        if (c16430ejl == null) {
            Intrinsics.gEmmrt("");
            c16430ejl = null;
        }
        c16430ejl.EZpvd.setTitleText(str);
        C16430ejl c16430ejl3 = this.OLrzqt;
        if (c16430ejl3 == null) {
            Intrinsics.gEmmrt("");
            c16430ejl3 = null;
        }
        c16430ejl3.EZpvd.setSubTitleText(str2);
        C16430ejl c16430ejl4 = this.OLrzqt;
        if (c16430ejl4 == null) {
            Intrinsics.gEmmrt("");
            c16430ejl4 = null;
        }
        c16430ejl4.EZpvd.AEQbTJ().setOnClickListener(new View.OnClickListener() { // from class: o.fUv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC17855fUu.copydefault(this.EZpvd, view);
            }
        });
        C16430ejl c16430ejl5 = this.OLrzqt;
        if (c16430ejl5 == null) {
            Intrinsics.gEmmrt("");
            c16430ejl5 = null;
        }
        c16430ejl5.EZpvd.setStatus(i);
        C16430ejl c16430ejl6 = this.OLrzqt;
        if (c16430ejl6 == null) {
            Intrinsics.gEmmrt("");
            c16430ejl6 = null;
        }
        C52794wYp c52794wYpCopydefault = c16430ejl6.EZpvd.OLrzqt().copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setVisibility(function0 != null ? 0 : 8);
            if (function0 != null) {
                c52794wYpCopydefault.setText(str3);
                c52794wYpCopydefault.setOnClickListener(new ActionBar(c52794wYpCopydefault, 1000L, function0));
            }
        }
        C16430ejl c16430ejl7 = this.OLrzqt;
        if (c16430ejl7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16430ejl2 = c16430ejl7;
        }
        C52794wYp c52794wYpAEQbTJ = c16430ejl2.EZpvd.OLrzqt().AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setVisibility(function02 == null ? 8 : 0);
            if (function02 != null) {
                c52794wYpAEQbTJ.setText(str4);
                c52794wYpAEQbTJ.setOnClickListener(new StateListAnimator(c52794wYpAEQbTJ, 1000L, function02));
            }
        }
    }

    public static final void copydefault(ActivityC17855fUu activityC17855fUu, android.view.View view) {
        activityC17855fUu.finish();
    }

    public final void OLrzqt() {
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        java.lang.String string = getString(C13754dXa.FragmentManager.getCallingPackage);
        Intrinsics.checkNotNullExpressionValue(string, "");
        InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, this, string, null, new Function1() { // from class: o.fUs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17855fUu.OLrzqt((AbstractC43238rlX) obj);
            }
        }, 4, null);
    }

    public static final Unit OLrzqt(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    private final void KWHzl() {
        C11205cFp.EZpvd.zuBGHE().AEQbTJ(this.KWHzl);
    }

    private final void AEQbTJ() {
        C11205cFp.EZpvd.zuBGHE().OLrzqt(this.KWHzl);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AEQbTJ();
    }

    public final void EZpvd() {
        C55097xdX c55097xdX = new C55097xdX(this, null, 0, 4, null);
        c55097xdX.setState(2);
        c55097xdX.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.QOjuYg));
        c55097xdX.setCloseBtnShow(true);
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 0L, 0, 0, 0, 30, null);
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
