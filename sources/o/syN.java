package o;

import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.biz.model.RatingDisplayStatus;
import com.okinc.biz.model.SubmitRatingResult;
import com.okinc.okex.rating.bean.GetSupportRatingBean;
import com.okinc.okex.rating.bean.PreSubmitRatingBean;
import com.okinc.okex.rating.ui.submit.RatingSubmitBottomSheetActivity$finishAfterBottomSheetDismissAnimationCompleted$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.serialization.json.JsonObject;
import o.syN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class syN extends syE {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.syN.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final android.content.Intent AEQbTJ(@NotNull android.content.Context context, @NotNull GetSupportRatingBean getSupportRatingBean, java.lang.String str, JsonObject jsonObject, PreSubmitRatingBean preSubmitRatingBean, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(getSupportRatingBean, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) syN.class);
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

    @Override // o.syE, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        GetSupportRatingBean getSupportRatingBeanAEQbTJ = AEQbTJ();
        if (getSupportRatingBeanAEQbTJ == null) {
            finish();
        } else {
            gEmmrt().AEQbTJ(getSupportRatingBeanAEQbTJ, valueOf(), EZpvd(), djBIcL(), true, OLrzqt());
            syO syoOLrzqt = syO.Companion.OLrzqt();
            syoOLrzqt.show(getSupportFragmentManager(), "KEY_ID_BOTTOM_SHEET");
            syoOLrzqt.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.okinc.okex.rating.ui.submit.RatingSubmitBottomSheetActivity$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    syN.KWHzl(this.EZpvd, lifecycleOwner, event);
                }
            });
        }
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.syQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                syN.copydefault(this.copydefault);
            }
        });
    }

    public static final void KWHzl(syN syn, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(event, "");
        if (event == Lifecycle.Event.ON_DESTROY) {
            syn.AhwBna();
        }
    }

    public static final void copydefault(syN syn) {
        rVN.reportFullyDrawn$default((android.app.Activity) syn, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void AhwBna() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new RatingSubmitBottomSheetActivity$finishAfterBottomSheetDismissAnimationCompleted$1(this, null), 3, null);
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
        overridePendingTransition(0, 0);
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
