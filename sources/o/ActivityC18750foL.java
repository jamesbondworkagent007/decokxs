package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.defi.wallet.mine.backup.FirstBackupWalletTipActivity$onCreate$2;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.web.WebActivity;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.foL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC18750foL extends AbstractActivityC33013moT {
    public int EZpvd;
    public AbstractC16366eia copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;
    public java.lang.String OLrzqt = "";
    public java.lang.String KWHzl = "";

    /* JADX INFO: renamed from: o.foL$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.foL.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ void startActivity$default(StateListAnimator stateListAnimator, android.content.Context context, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                str = "";
            }
            if ((i2 & 4) != 0) {
                str2 = "";
            }
            if ((i2 & 8) != 0) {
                i = 0;
            }
            stateListAnimator.OLrzqt(context, str, str2, i);
        }

        public final void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC18750foL.class);
            intent.putExtra("wallet_id", str);
            intent.putExtra("path", str2);
            intent.putExtra("type", i);
            context.startActivity(intent);
        }
    }

    private final void OLrzqt() {
        java.lang.String stringExtra = getIntent().getStringExtra("wallet_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.KWHzl = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("path");
        this.OLrzqt = stringExtra2 != null ? stringExtra2 : "";
        this.EZpvd = getIntent().getIntExtra("type", 0);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.copydefault = (AbstractC16366eia) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.aKErDB);
        OLrzqt();
        copydefault();
        AbstractC16366eia abstractC16366eia = this.copydefault;
        if (abstractC16366eia == null) {
            Intrinsics.gEmmrt("");
            abstractC16366eia = null;
        }
        abstractC16366eia.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.foN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC18750foL.OLrzqt(this.EZpvd, view);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FirstBackupWalletTipActivity$onCreate$2(null), 3, null);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.foO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC18750foL.KWHzl(this.copydefault);
            }
        });
    }

    public static final void OLrzqt(ActivityC18750foL activityC18750foL, android.view.View view) {
        activityC18750foL.OLrzqt("nextstep");
        ActivityC18691fnF.Companion.AEQbTJ(activityC18750foL, activityC18750foL.KWHzl, activityC18750foL.OLrzqt, activityC18750foL.EZpvd);
        activityC18750foL.finish();
    }

    public static final void KWHzl(ActivityC18750foL activityC18750foL) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC18750foL, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void copydefault() {
        final java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatMediaBrowserImplBase2);
        final java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatMediaBrowserImplBase3);
        java.lang.CharSequence charSequence = C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(C33069mpW.copydefault(C13754dXa.FragmentManager.supportNavigateUpTo, C56424yEw.AYXKKw(C56390yDp.OLrzqt(Web3SecurityTrackEvent.VALUE_SEED_PHRASE, strAYXKKw), C56390yDp.OLrzqt(Web3SecurityTrackEvent.VALUE_PRIVATE_KEY, strAYXKKw2))), new java.lang.String[]{strAYXKKw}, 0, null, false, new Function1() { // from class: o.foM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18750foL.KWHzl(this.KWHzl, (java.util.List) obj);
            }
        }, 14, null), new java.lang.String[]{strAYXKKw2}, 0, null, false, new Function1() { // from class: o.foP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18750foL.EZpvd(this.KWHzl, (java.util.List) obj);
            }
        }, 14, null);
        final int iIndexOf$default = StringsKt__StringsKt.indexOf$default(charSequence, strAYXKKw, 0, false, 6, (java.lang.Object) null);
        final int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default(charSequence, strAYXKKw2, 0, false, 6, (java.lang.Object) null);
        AbstractC16366eia abstractC16366eia = this.copydefault;
        AbstractC16366eia abstractC16366eia2 = null;
        if (abstractC16366eia == null) {
            Intrinsics.gEmmrt("");
            abstractC16366eia = null;
        }
        AppCompatTextView appCompatTextView = abstractC16366eia.OLrzqt;
        AbstractC16366eia abstractC16366eia3 = this.copydefault;
        if (abstractC16366eia3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16366eia3 = null;
        }
        AppCompatTextView appCompatTextView2 = abstractC16366eia3.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        appCompatTextView.setOnTouchListener(new ViewOnTouchListenerC14463dlt(appCompatTextView2, new Function1() { // from class: o.foU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18750foL.OLrzqt(iIndexOf$default, strAYXKKw, this, iIndexOf$default2, strAYXKKw2, ((java.lang.Integer) obj).intValue());
            }
        }));
        AbstractC16366eia abstractC16366eia4 = this.copydefault;
        if (abstractC16366eia4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16366eia2 = abstractC16366eia4;
        }
        abstractC16366eia2.OLrzqt.setText(charSequence);
    }

    public static final Unit KWHzl(ActivityC18750foL activityC18750foL, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C55366xib.KWHzl(C52761wXj.ActionBar.DNMMPQ, activityC18750foL)));
        list.add(new android.text.style.UnderlineSpan());
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ActivityC18750foL activityC18750foL, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C55366xib.KWHzl(C52761wXj.ActionBar.DNMMPQ, activityC18750foL)));
        list.add(new android.text.style.UnderlineSpan());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(int i, java.lang.String str, ActivityC18750foL activityC18750foL, int i2, java.lang.String str2, int i3) {
        if (i <= i3 && i3 <= i + str.length()) {
            C32866mlf.onEvent$default("app_web3_wallet_backup_seedphraseinfo_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            activityC18750foL.OLrzqt("seedphrase");
            java.lang.String string = activityC18750foL.getString(C13754dXa.FragmentManager.invokeSuspend);
            Intrinsics.checkNotNullExpressionValue(string, "");
            activityC18750foL.EZpvd(string);
        } else if (i2 <= i3 && i3 <= i2 + str2.length()) {
            C32866mlf.onEvent$default("app_web3_wallet_backup_privatekeyinfo_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            activityC18750foL.OLrzqt("privatekeys");
            java.lang.String string2 = activityC18750foL.getString(C13754dXa.FragmentManager.DXd);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            activityC18750foL.EZpvd(string2);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.lang.String str) {
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, this, BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
    }

    private final void OLrzqt(final java.lang.String str) {
        C32866mlf.onEvent$default("Web3Onboarding_BackupNoticeStep2_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.foQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18750foL.OLrzqt(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, str, true));
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
