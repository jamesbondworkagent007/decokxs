package o;

import androidx.activity.result.contract.ActivityResultContract;
import com.okinc.auth.api.service.MfaServiceRequest;
import com.okinc.auth.api.service.MfaServiceResult;
import com.okinc.auth.api.service.MfaState;
import com.okinc.auth.impl.mfa.model.MfaScenario;
import com.okinc.auth.impl.mfa.ui.landing.MfaForResultActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.aCv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@yCR
public final class C5782aCv extends AbstractC43215rlA implements InterfaceC8197ayG {
    @yCM
    public C5782aCv() {
    }

    /* JADX INFO: renamed from: o.aCv$TaskDescription */
    public static final class TaskDescription extends ActivityResultContract<java.lang.String, MfaServiceResult> {
        public final /* synthetic */ Function0<Unit> EZpvd;

        public TaskDescription(Function0<Unit> function0) {
            this.EZpvd = function0;
        }

        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(android.content.Context context, java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            return MfaForResultActivity.Companion.AEQbTJ(context, str, this.EZpvd, null, null, MfaScenario.IsPostLogin);
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public MfaServiceResult parseResult(int i, android.content.Intent intent) {
            MfaServiceResult mfaServiceResult = intent != null ? (MfaServiceResult) intent.getParcelableExtra("KEY_RESPONSE") : null;
            return mfaServiceResult == null ? new MfaServiceResult(MfaState.Failure.OLrzqt, "") : mfaServiceResult;
        }
    }

    @Override // o.InterfaceC8197ayG
    public ActivityResultContract<java.lang.String, MfaServiceResult> copydefault(Function0<Unit> function0) {
        return new TaskDescription(function0);
    }

    /* JADX INFO: renamed from: o.aCv$Activity */
    public static final class Activity extends ActivityResultContract<MfaServiceRequest, MfaServiceResult> {
        public final /* synthetic */ Function0<Unit> AEQbTJ;
        public final /* synthetic */ Function0<Unit> OLrzqt;

        public Activity(Function0<Unit> function0, Function0<Unit> function02) {
            this.OLrzqt = function0;
            this.AEQbTJ = function02;
        }

        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(android.content.Context context, MfaServiceRequest mfaServiceRequest) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(mfaServiceRequest, "");
            return MfaForResultActivity.Companion.AEQbTJ(context, mfaServiceRequest.getMfaSessionId(), this.OLrzqt, mfaServiceRequest.getSubdomainStrategy(), this.AEQbTJ, MfaScenario.IsNonAuth);
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public MfaServiceResult parseResult(int i, android.content.Intent intent) {
            MfaServiceResult mfaServiceResult = intent != null ? (MfaServiceResult) intent.getParcelableExtra("KEY_RESPONSE") : null;
            return mfaServiceResult == null ? new MfaServiceResult(MfaState.Failure.OLrzqt, "") : mfaServiceResult;
        }
    }

    @Override // o.InterfaceC8197ayG
    public ActivityResultContract<MfaServiceRequest, MfaServiceResult> OLrzqt(Function0<Unit> function0, Function0<Unit> function02) {
        return new Activity(function0, function02);
    }
}
