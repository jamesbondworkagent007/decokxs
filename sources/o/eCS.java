package o;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import com.okinc.business.defi.wallet.hardware.bean.HardWareConnectGuide;
import com.okinc.core.util.ScannerActivity;
import com.okinc.core.util.model.ScanConfig;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eCS extends eCI {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public int AEQbTJ = 1;
    public ActivityResultLauncher<Unit> KWHzl;

    public static final void KWHzl(java.lang.String str) {
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eCS.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ void startActivity$default(StateListAnimator stateListAnimator, android.app.Activity activity, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                i = 1;
            }
            stateListAnimator.EZpvd(activity, i);
        }

        public final void EZpvd(@NotNull android.app.Activity activity, int i) {
            Intrinsics.checkNotNullParameter(activity, "");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) eCS.class);
            intent.putExtra(OtcExtraKeys.MODE, i);
            activity.startActivity(intent);
        }
    }

    @Override // o.eCI, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.AEQbTJ = getIntent().getIntExtra(OtcExtraKeys.MODE, 1);
        this.KWHzl = registerForActivityResult(ScannerActivity.Activity.getResultContract$default(ScannerActivity.Companion, new ScanConfig(false, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DrqXHJ), null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DGUQLIhJrIAr), C33070mpX.AYXKKw(C13754dXa.FragmentManager.profile), true, "OKWKeystoneConnectScannerViewExtensionImpl", false, false, null, false, null, 3973, null), null, BundleKt.bundleOf(C56390yDp.OLrzqt(OtcExtraKeys.MODE, java.lang.Integer.valueOf(this.AEQbTJ))), 2, null), new ActivityResultCallback() { // from class: o.eCZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                eCS.KWHzl((java.lang.String) obj);
            }
        });
    }

    @Override // o.eCI
    public void copydefault(@NotNull eFL efl) {
        Intrinsics.checkNotNullParameter(efl, "");
        EZpvd();
    }

    @Override // o.eCI
    public void AEQbTJ() {
        EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.RkASWs));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(java.lang.String str) {
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, this, BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
    }

    public final void EZpvd() {
        C13992dcz c13992dcz = C13992dcz.AEQbTJ;
        if (c13992dcz.gEmmrt()) {
            c13992dcz.AEQbTJ();
            eEB eebEZpvd = eEB.Companion.EZpvd(copydefault());
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            eebEZpvd.AEQbTJ(supportFragmentManager, new Function0() { // from class: o.eCW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return eCS.AEQbTJ(this.KWHzl);
                }
            });
            return;
        }
        try {
            ActivityResultLauncher<Unit> activityResultLauncher = this.KWHzl;
            if (activityResultLauncher == null) {
                Intrinsics.gEmmrt("");
                activityResultLauncher = null;
            }
            activityResultLauncher.launch(Unit.INSTANCE);
        } catch (java.lang.Exception unused) {
            pUU.copydefault(getTAG(), "launch scanner failed");
        }
        if (this.AEQbTJ != 1) {
            finish();
        }
    }

    public static final Unit AEQbTJ(eCS ecs) {
        try {
            ActivityResultLauncher<Unit> activityResultLauncher = ecs.KWHzl;
            if (activityResultLauncher == null) {
                Intrinsics.gEmmrt("");
                activityResultLauncher = null;
            }
            activityResultLauncher.launch(Unit.INSTANCE);
        } catch (java.lang.Exception unused) {
            pUU.copydefault(ecs.getTAG(), "launch scanner failed");
        }
        if (ecs.AEQbTJ != 1) {
            ecs.finish();
        }
        return Unit.INSTANCE;
    }

    public final java.util.ArrayList<HardWareConnectGuide> copydefault() {
        java.lang.CharSequence charSequence = C33061mpO.setupSpanStyles$default(C33069mpW.copydefault(C13754dXa.FragmentManager.dIjzlO, C56423yEv.EZpvd(C56390yDp.OLrzqt("seedphraseisadded", C33070mpX.AYXKKw(C13754dXa.FragmentManager.getUserContextRegisteredStatus)))), new java.lang.String[]{C33070mpX.AYXKKw(C13754dXa.FragmentManager.getUserContextRegisteredStatus)}, 0, null, false, new Function1() { // from class: o.eDa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eCS.AEQbTJ(this.AEQbTJ, (java.util.List) obj);
            }
        }, 14, null);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.DBAlnt);
        java.lang.Float fValueOf = java.lang.Float.valueOf(80.0f);
        return yDY.copydefault(new HardWareConnectGuide("images/web3_wallet/keystone_guide1.png", charSequence, strAYXKKw, (java.lang.Boolean) null, fValueOf, (java.lang.String) null, 40, (DefaultConstructorMarker) null), new HardWareConnectGuide("images/web3_wallet/keystone_guide2.png", C33070mpX.AYXKKw(C13754dXa.FragmentManager.gBtXYZ), C33061mpO.setupSpanStyles$default(C33069mpW.copydefault(C13754dXa.FragmentManager.zeUYeG, C56423yEv.EZpvd(C56390yDp.OLrzqt("download", C33070mpX.AYXKKw(C13754dXa.FragmentManager.OzhFjl)))), new java.lang.String[]{C33070mpX.AYXKKw(C13754dXa.FragmentManager.OzhFjl)}, 0, null, false, new Function1() { // from class: o.eCX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eCS.EZpvd(this.AEQbTJ, (java.util.List) obj);
            }
        }, 14, null), java.lang.Boolean.TRUE, fValueOf, (java.lang.String) null, 32, (DefaultConstructorMarker) null), new HardWareConnectGuide("images/web3_wallet/keystone_guide3.png", C33070mpX.AYXKKw(C13754dXa.FragmentManager.dzkkkq), C33070mpX.AYXKKw(C13754dXa.FragmentManager.QiTXOm), (java.lang.Boolean) null, fValueOf, (java.lang.String) null, 40, (DefaultConstructorMarker) null), new HardWareConnectGuide("images/web3_wallet/keystone_guide4.png", C33061mpO.setupSpanStyles$default(C33069mpW.copydefault(C13754dXa.FragmentManager.fupbxE, C56423yEv.EZpvd(C56390yDp.OLrzqt("connectsoftwarewallet", C33070mpX.AYXKKw(C13754dXa.FragmentManager.deregisterUser)))), new java.lang.String[]{C33070mpX.AYXKKw(C13754dXa.FragmentManager.deregisterUser)}, 0, null, false, new Function1() { // from class: o.eCY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eCS.gEmmrt(this.copydefault, (java.util.List) obj);
            }
        }, 14, null), C33070mpX.AYXKKw(C13754dXa.FragmentManager.OrsvgJ), (java.lang.Boolean) null, fValueOf, (java.lang.String) null, 40, (DefaultConstructorMarker) null));
    }

    public static final Unit AEQbTJ(eCS ecs, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(ContextCompat.getColor(ecs, C52761wXj.Activity.GiPPlLRPuVlr)));
        return Unit.INSTANCE;
    }

    public static final class Activity extends android.text.style.ClickableSpan {
        public Activity() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            eCS.this.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.RbVjfb));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(ContextCompat.getColor(eCS.this, C52761wXj.Activity.fbC));
            textPaint.setUnderlineText(true);
        }
    }

    public static final Unit EZpvd(eCS ecs, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(ecs.new Activity());
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(eCS ecs, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(ContextCompat.getColor(ecs, C13754dXa.StateListAnimator.OLrzqt)));
        return Unit.INSTANCE;
    }

    @Override // o.eCI
    public eFN KWHzl() {
        return new eFN("images/web3_wallet/keystone_introduction.png", C33069mpW.copydefault(C13754dXa.FragmentManager.DTeKQX, C56423yEv.EZpvd(C56390yDp.OLrzqt("hardwarename", C33070mpX.AYXKKw(C13754dXa.FragmentManager.svY)))), true, yDY.AhwBna(new eFL(C13754dXa.Activity.gasjUx, C33070mpX.AYXKKw(C13754dXa.FragmentManager.Th), null, 4, null)));
    }

    @Override // o.eCI, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.eCI, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.eCI, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.eCI, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
