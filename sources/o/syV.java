package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentResultListener;
import com.okinc.biz.model.RatingDisplayStatus;
import com.okinc.biz.model.SubmitRatingResult;
import com.okinc.okex.rating.bean.GetSupportRatingBean;
import com.okinc.okex.rating.bean.PreSubmitRatingBean;
import com.okinc.okex.rating.ui.core.submit.content.RatingSubmitContentFragment;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class syV extends syE {
    public AbstractC47281tnA AhwBna;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AYXKKw = 8;

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.syV.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context, @NotNull GetSupportRatingBean getSupportRatingBean, java.lang.String str, JsonObject jsonObject, PreSubmitRatingBean preSubmitRatingBean, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(getSupportRatingBean, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) syV.class);
            kotlin.Pair[] pairArr = new kotlin.Pair[6];
            pairArr[0] = C56390yDp.OLrzqt("KEY_API_MODEL", getSupportRatingBean);
            pairArr[1] = C56390yDp.OLrzqt("KEY_RATING_NOTIFICATION_ID", str);
            pairArr[2] = C56390yDp.OLrzqt("KEY_MODULE_ATTRIBUTES", jsonObject != null ? jsonObject.toString() : null);
            pairArr[3] = C56390yDp.OLrzqt("KEY_PRESUBMIT_ATTRIBUTES", preSubmitRatingBean);
            RatingDisplayStatus status = getSupportRatingBean.getStatus();
            pairArr[4] = C56390yDp.OLrzqt(RatingDisplayStatus.RATING_DISPLAY_STATUS, status != null ? java.lang.Integer.valueOf(status.getValue()) : null);
            pairArr[5] = C56390yDp.OLrzqt("KEY_BUSINESS_ID", str2);
            intent.putExtras(BundleKt.bundleOf(pairArr));
            return intent;
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.AhwBna = null;
    }

    @Override // o.syE, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        wYC wyc;
        super.onCreate(bundle);
        AbstractC47281tnA abstractC47281tnAAEQbTJ = AbstractC47281tnA.AEQbTJ(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(abstractC47281tnAAEQbTJ, "");
        this.AhwBna = abstractC47281tnAAEQbTJ;
        setContentView(abstractC47281tnAAEQbTJ.getRoot());
        AbstractC47281tnA abstractC47281tnA = this.AhwBna;
        if (abstractC47281tnA != null && (wyc = abstractC47281tnA.copydefault) != null) {
            wyc.setOnClickListener(new Application(wyc, 1000L, this));
        }
        GetSupportRatingBean getSupportRatingBeanAEQbTJ = AEQbTJ();
        if (getSupportRatingBeanAEQbTJ != null) {
            gEmmrt().AEQbTJ(getSupportRatingBeanAEQbTJ, valueOf(), EZpvd(), djBIcL(), false, OLrzqt());
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransactionBeginTransaction.replace(C47315tni.TaskDescription.fFgQHt, RatingSubmitContentFragment.Companion.KWHzl("KEY_ID_SUBMIT_FRAGMENT"));
            fragmentTransactionBeginTransaction.replace(C47315tni.TaskDescription.QkdxfA, C45829syv.Companion.copydefault());
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
            getSupportFragmentManager().setFragmentResultListener("KEY_ID_SUBMIT_FRAGMENT", this, new FragmentResultListener() { // from class: o.syU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.fragment.app.FragmentResultListener
                public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle2) {
                    syV.EZpvd(this.EZpvd, str, bundle2);
                }
            });
        }
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.syR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                syV.AEQbTJ(this.AEQbTJ);
            }
        });
    }

    public static final void EZpvd(syV syv, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (RatingSubmitContentFragment.Event.Companion.OLrzqt(bundle) instanceof RatingSubmitContentFragment.Event.Complete) {
            syv.finish();
        }
    }

    public static final void AEQbTJ(syV syv) {
        rVN.reportFullyDrawn$default((android.app.Activity) syv, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        SubmitRatingResult value = gEmmrt().iwGUEr().getValue();
        if (value != null) {
            android.os.Bundle extras = getIntent().getExtras();
            if (extras == null) {
                extras = BundleKt.bundleOf();
            }
            extras.putAll(SubmitRatingResult.Companion.copydefault(value));
            android.content.Intent intent = new android.content.Intent();
            intent.putExtras(extras);
            setResult(-1, intent);
        }
        super.finish();
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ syV AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, syV syv) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = syv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.finish();
            }
        }
    }

    @Override // o.syE, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.syE, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.syE, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.syE, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
