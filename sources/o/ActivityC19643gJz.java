package o;

import android.view.View;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.os.BundleKt;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.wallet.api.WalletCefiBindingService;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gJz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class ActivityC19643gJz extends AbstractActivityC19642gJy implements gJR {
    public static final TaskDescription Companion = new TaskDescription(null);

    @Override // o.AbstractActivityC33041mov, o.InterfaceC33507mxk
    public boolean needChangeUpDownColor() {
        return false;
    }

    @Override // o.AbstractActivityC19642gJy, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C13754dXa.TaskDescription.OHqIaq);
        C33537myN c33537myN = (C33537myN) findViewById(C13754dXa.ActionBar.accept);
        if (c33537myN != null) {
            c33537myN.setSubDoListener(new View.OnClickListener() { // from class: o.gJB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC19643gJz.KWHzl(this.OLrzqt, view);
                }
            });
        }
        if (bundle == null) {
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction.replace(C13754dXa.ActionBar.XW, gJE.class, null, null), "");
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        }
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.gJC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC19643gJz.OLrzqt(this.copydefault);
            }
        });
    }

    public static final void KWHzl(ActivityC19643gJz activityC19643gJz, android.view.View view) {
        C32866mlf.onEvent$default("LinkedAccount_GuidePop_GetStarted_Click", (TrackChannel[]) null, new Function1() { // from class: o.gJx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC19643gJz.KWHzl((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, activityC19643gJz, BundleKt.bundleOf(C56390yDp.OLrzqt("url", activityC19643gJz.getString(C13754dXa.FragmentManager.onProviderDisabled))), null, 4, null);
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "faq", true);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(ActivityC19643gJz activityC19643gJz) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC19643gJz, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.gJR
    public void OLrzqt(@NotNull WalletCefiBindingService.WalletCefiBindingResult walletCefiBindingResult) {
        Intrinsics.checkNotNullParameter(walletCefiBindingResult, "");
        android.content.Intent intent = getIntent();
        if (intent == null) {
            intent = new android.content.Intent();
        }
        setResult(-1, intent.putExtra("RESULT_WALLET_BINDING_STATUS", walletCefiBindingResult));
        finish();
    }

    /* JADX INFO: renamed from: o.gJz$ActionBar */
    public static final class ActionBar extends ActivityResultContract<StateListAnimator, Activity> {
        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(@NotNull android.content.Context context, @NotNull StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            return ActivityC19643gJz.Companion.AEQbTJ(context, stateListAnimator.OLrzqt(), stateListAnimator.copydefault(), stateListAnimator.EZpvd(), stateListAnimator.KWHzl());
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public Activity parseResult(int i, android.content.Intent intent) {
            if (i != -1 || intent == null) {
                return null;
            }
            java.lang.String stringExtra = intent.getStringExtra("wallet_address");
            if (stringExtra == null) {
                stringExtra = "";
            }
            java.lang.String stringExtra2 = intent.getStringExtra("chain_id");
            java.lang.String str = stringExtra2 != null ? stringExtra2 : "";
            java.io.Serializable serializableExtra = intent.getSerializableExtra("source");
            return new Activity(stringExtra, str, serializableExtra instanceof WalletCefiBindingService.Source ? (WalletCefiBindingService.Source) serializableExtra : null, (WalletCefiBindingService.WalletCefiBindingResult) intent.getParcelableExtra("RESULT_WALLET_BINDING_STATUS"));
        }
    }

    /* JADX INFO: renamed from: o.gJz$StateListAnimator */
    public static final class StateListAnimator {
        public final WalletCefiBindingService.Source AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, int i, WalletCefiBindingService.Source source, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = stateListAnimator.EZpvd;
            }
            if ((i2 & 2) != 0) {
                str2 = stateListAnimator.KWHzl;
            }
            if ((i2 & 4) != 0) {
                i = stateListAnimator.copydefault;
            }
            if ((i2 & 8) != 0) {
                source = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.EZpvd(str, str2, i, source);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull WalletCefiBindingService.Source source) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(source, "");
            return new StateListAnimator(str, str2, i, source);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WalletCefiBindingService.Source KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) stateListAnimator.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) stateListAnimator.KWHzl) && this.copydefault == stateListAnimator.copydefault && this.AEQbTJ == stateListAnimator.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.EZpvd.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "WalletCefiBindingInput(walletAddress=" + this.EZpvd + ", chainId=" + this.KWHzl + ", withdrawLimit=" + this.copydefault + ", source=" + this.AEQbTJ + ")";
        }

        public StateListAnimator(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull WalletCefiBindingService.Source source) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(source, "");
            this.EZpvd = str;
            this.KWHzl = str2;
            this.copydefault = i;
            this.AEQbTJ = source;
        }
    }

    /* JADX INFO: renamed from: o.gJz$Activity */
    public static final class Activity {
        public static final int AEQbTJ = WalletCefiBindingService.WalletCefiBindingResult.KWHzl;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final WalletCefiBindingService.Source OLrzqt;
        public final WalletCefiBindingService.WalletCefiBindingResult copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, WalletCefiBindingService.Source source, WalletCefiBindingService.WalletCefiBindingResult walletCefiBindingResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = activity.EZpvd;
            }
            if ((i & 4) != 0) {
                source = activity.OLrzqt;
            }
            if ((i & 8) != 0) {
                walletCefiBindingResult = activity.copydefault;
            }
            return activity.EZpvd(str, str2, source, walletCefiBindingResult);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, WalletCefiBindingService.Source source, WalletCefiBindingService.WalletCefiBindingResult walletCefiBindingResult) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Activity(str, str2, source, walletCefiBindingResult);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WalletCefiBindingService.WalletCefiBindingResult copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) activity.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) activity.EZpvd) && this.OLrzqt == activity.OLrzqt && Intrinsics.EZpvd(this.copydefault, activity.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            int iHashCode2 = this.EZpvd.hashCode();
            WalletCefiBindingService.Source source = this.OLrzqt;
            int iHashCode3 = source == null ? 0 : source.hashCode();
            WalletCefiBindingService.WalletCefiBindingResult walletCefiBindingResult = this.copydefault;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (walletCefiBindingResult != null ? walletCefiBindingResult.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "WalletCefiBindingOutput(walletAddress=" + this.KWHzl + ", chainId=" + this.EZpvd + ", source=" + this.OLrzqt + ", cefiBindingResult=" + this.copydefault + ")";
        }

        public Activity(@NotNull java.lang.String str, @NotNull java.lang.String str2, WalletCefiBindingService.Source source, WalletCefiBindingService.WalletCefiBindingResult walletCefiBindingResult) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.KWHzl = str;
            this.EZpvd = str2;
            this.OLrzqt = source;
            this.copydefault = walletCefiBindingResult;
        }
    }

    /* JADX INFO: renamed from: o.gJz$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gJz.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final android.content.Intent AEQbTJ(android.content.Context context, java.lang.String str, java.lang.String str2, int i, WalletCefiBindingService.Source source) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC19643gJz.class);
            intent.putExtra("wallet_address", str);
            intent.putExtra("chain_id", str2);
            intent.putExtra("ARG_WITHDRAW_LIMIT", i);
            intent.putExtra("source", source);
            return intent;
        }
    }

    @Override // o.AbstractActivityC19642gJy, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC19642gJy, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC19642gJy, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC19642gJy, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
