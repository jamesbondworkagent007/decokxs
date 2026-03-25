package o;

import android.os.Build;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.okex.rating.bean.GetSupportRatingBean;
import com.okinc.okex.rating.bean.PreSubmitRatingBean;
import com.okinc.okex.rating.viewmodel.RatingSubmitViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class syE extends AbstractActivityC33041mov {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm valueOf;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.syJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return syE.gEmmrt(this.copydefault);
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.syI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return syE.djBIcL(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.syH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return syE.valueOf(this.copydefault);
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.syL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return syE.AYXKKw(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.syK
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return syE.AhwBna(this.KWHzl);
        }
    });

    public syE() {
        final Function0 function0 = null;
        this.valueOf = new ViewModelLazy(C56524yIo.AEQbTJ(RatingSubmitViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.rating.ui.submit.RatingSubmitBaseActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0() { // from class: o.syM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return syE.KWHzl();
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.rating.ui.submit.RatingSubmitBaseActivity$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.syE.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final GetSupportRatingBean AEQbTJ() {
        return (GetSupportRatingBean) this.OLrzqt.getValue();
    }

    public static final GetSupportRatingBean gEmmrt(syE sye) {
        if (Build.VERSION.SDK_INT >= 33) {
            android.content.Intent intent = sye.getIntent();
            if (intent != null) {
                return (GetSupportRatingBean) intent.getParcelableExtra("KEY_API_MODEL", GetSupportRatingBean.class);
            }
        } else {
            android.content.Intent intent2 = sye.getIntent();
            if (intent2 != null) {
                return (GetSupportRatingBean) intent2.getParcelableExtra("KEY_API_MODEL");
            }
        }
        return null;
    }

    public final java.lang.String OLrzqt() {
        return (java.lang.String) this.copydefault.getValue();
    }

    public static final java.lang.String djBIcL(syE sye) {
        return sye.getIntent().getStringExtra("KEY_BUSINESS_ID");
    }

    public final java.lang.String valueOf() {
        return (java.lang.String) this.djBIcL.getValue();
    }

    public static final java.lang.String valueOf(syE sye) {
        android.content.Intent intent = sye.getIntent();
        if (intent != null) {
            return intent.getStringExtra("KEY_RATING_NOTIFICATION_ID");
        }
        return null;
    }

    public final JsonObject EZpvd() {
        return (JsonObject) this.EZpvd.getValue();
    }

    public static final JsonObject AYXKKw(syE sye) {
        java.lang.String stringExtra;
        android.content.Intent intent = sye.getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("KEY_MODULE_ATTRIBUTES")) == null) {
            return null;
        }
        return (JsonObject) Json.Default.decodeFromString(JsonObject.Companion.serializer(), stringExtra);
    }

    public final PreSubmitRatingBean djBIcL() {
        return (PreSubmitRatingBean) this.AEQbTJ.getValue();
    }

    public static final PreSubmitRatingBean AhwBna(syE sye) {
        if (Build.VERSION.SDK_INT >= 33) {
            android.content.Intent intent = sye.getIntent();
            if (intent != null) {
                return (PreSubmitRatingBean) intent.getParcelableExtra("KEY_PRESUBMIT_ATTRIBUTES", PreSubmitRatingBean.class);
            }
        } else {
            android.content.Intent intent2 = sye.getIntent();
            if (intent2 != null) {
                return (PreSubmitRatingBean) intent2.getParcelableExtra("KEY_PRESUBMIT_ATTRIBUTES");
            }
        }
        return null;
    }

    public final RatingSubmitViewModel gEmmrt() {
        return (RatingSubmitViewModel) this.valueOf.getValue();
    }

    public static final ViewModelProvider.Factory KWHzl() {
        return new ActionBar();
    }

    public static final class ActionBar implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(java.lang.Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return new RatingSubmitViewModel(new syS(sxL.Companion.EZpvd()));
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
