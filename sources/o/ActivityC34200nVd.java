package o;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import androidx.core.os.BundleKt;
import androidx.core.widget.TextViewCompat;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okimcore.model.exception.OKIMException;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nVd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC34200nVd extends nVH {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.nVg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC34200nVd.AEQbTJ(this.AEQbTJ);
        }
    });

    /* JADX INFO: renamed from: o.nVd$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nVd.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final android.content.Intent KWHzl(@NotNull android.content.Context context, @NotNull GroupInfo groupInfo) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(groupInfo, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC34200nVd.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_GROUP_INFO", groupInfo)));
            return intent;
        }
    }

    private final GroupInfo DbNXlk() {
        return (GroupInfo) this.gEmmrt.getValue();
    }

    public static final GroupInfo AEQbTJ(ActivityC34200nVd activityC34200nVd) throws OKIMException {
        GroupInfo groupInfo;
        if (Build.VERSION.SDK_INT >= 33) {
            groupInfo = (GroupInfo) activityC34200nVd.getIntent().getParcelableExtra("ARG_GROUP_INFO", GroupInfo.class);
        } else {
            groupInfo = (GroupInfo) activityC34200nVd.getIntent().getParcelableExtra("ARG_GROUP_INFO");
        }
        if (groupInfo != null) {
            return groupInfo;
        }
        throw new OKIMException("Group Info cannot be null", -3);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd()Ljava/lang/CharSequence; */
    /* JADX DEBUG: Possible override for method o.nVH.OLrzqt()V */
    @Override // o.AbstractActivityC33007moN
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.String EZpvd() {
        return C33070mpX.AYXKKw(C35399nuc.LoaderManager.QfZsXX);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault()Landroidx/fragment/app/Fragment; */
    /* JADX DEBUG: Possible override for method o.nVH.AYXKKw()V */
    @Override // o.AbstractActivityC33007moN
    /* JADX INFO: renamed from: AYXKKw, reason: merged with bridge method [inline-methods] */
    public C34214nVr copydefault() {
        return C34214nVr.Companion.OLrzqt(DbNXlk());
    }

    @Override // o.nVH, o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ColorDrawable colorDrawable = new ColorDrawable(C33070mpX.copydefault(C52761wXj.Activity.EZpvd));
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setBackgroundDrawable(colorDrawable);
        }
        AbstractC33093mpu abstractC33093mpuDjBIcL = djBIcL();
        android.widget.FrameLayout frameLayout = abstractC33093mpuDjBIcL.KWHzl;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        C55296xhK.OLrzqt(frameLayout, java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f));
        TextViewCompat.setTextAppearance(abstractC33093mpuDjBIcL.djBIcL, C52761wXj.LoaderManager.DGOPHZ);
        C32866mlf.onEvent$default("IMGroupSettings_Full_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.nVf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC34200nVd.AEQbTJ(this.OLrzqt, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.nVh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC34200nVd.OLrzqt(this.copydefault);
            }
        });
    }

    public static final Unit AEQbTJ(ActivityC34200nVd activityC34200nVd, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        oBY.copydefault.copydefault(eventParamsList, activityC34200nVd.DbNXlk());
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(ActivityC34200nVd activityC34200nVd) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC34200nVd, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.nVH, o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.nVH, o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.nVH, o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.nVH, o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
