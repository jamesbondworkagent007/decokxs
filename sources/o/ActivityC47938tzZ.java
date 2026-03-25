package o;

import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bumptech.glide.Glide;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.planet.biz_onboarding.FollowTopOrbitersActivity$observe$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tzZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ActivityC47938tzZ extends AbstractActivityC47505trP implements InterfaceC47502trM<C46221tMh> {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public boolean AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public C45892tAc EZpvd;
    public C46221tMh KWHzl;
    public OnBackPressedCallback OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;)V */
    @Override // o.InterfaceC47502trM
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void EZpvd(C46221tMh c46221tMh) {
        this.KWHzl = c46221tMh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Landroidx/viewbinding/ViewBinding; */
    @Override // o.InterfaceC47502trM
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C46221tMh OLrzqt() {
        return this.KWHzl;
    }

    public ActivityC47938tzZ() {
        final Function0 function0 = null;
        this.AYXKKw = new ViewModelLazy(C56524yIo.AEQbTJ(C45895tAf.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_onboarding.FollowTopOrbitersActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_onboarding.FollowTopOrbitersActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_onboarding.FollowTopOrbitersActivity$special$$inlined$viewModels$default$3
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

    public final C45895tAf copydefault() {
        return (C45895tAf) this.AYXKKw.getValue();
    }

    /* JADX INFO: renamed from: o.tzZ$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tzZ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void OLrzqt(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            context.startActivity(new android.content.Intent(context, (java.lang.Class<?>) ActivityC47938tzZ.class));
        }
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C46221tMh c46221tMhOLrzqt = C46221tMh.OLrzqt(getLayoutInflater());
        setContentView(c46221tMhOLrzqt.valueOf);
        EZpvd(c46221tMhOLrzqt);
        OnBackPressedCallback onBackPressedCallback = null;
        C32866mlf.onEvent$default("Orbit_Whole_Introfollow_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        this.OLrzqt = new ActionBar();
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        OnBackPressedCallback onBackPressedCallback2 = this.OLrzqt;
        if (onBackPressedCallback2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            onBackPressedCallback = onBackPressedCallback2;
        }
        onBackPressedDispatcher.addCallback(this, onBackPressedCallback);
        valueOf();
        djBIcL();
        copydefault().OLrzqt();
    }

    /* JADX INFO: renamed from: o.tzZ$ActionBar */
    public static final class ActionBar extends OnBackPressedCallback {
        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
        }

        public ActionBar() {
            super(true);
        }
    }

    private final void valueOf() {
        C46221tMh c46221tMhOLrzqt = OLrzqt();
        if (c46221tMhOLrzqt != null) {
            ComponentCallbacks2C5333Nr componentCallbacks2C5333NrKWHzl = Glide.KWHzl(c46221tMhOLrzqt.AEQbTJ);
            android.content.Context context = c46221tMhOLrzqt.AEQbTJ.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            componentCallbacks2C5333NrKWHzl.EZpvd(C43454rpb.copydefault("images/planet/planet_cover_photo_default.webp", context, true)).EZpvd(c46221tMhOLrzqt.AEQbTJ);
            c46221tMhOLrzqt.AYXKKw.setAnimation(C47501trL.PendingIntent.EZpvd);
            c46221tMhOLrzqt.AhwBna.setLayoutManager(new LinearLayoutManager(this));
            C45892tAc c45892tAc = new C45892tAc(new Function1() { // from class: o.tzW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC47938tzZ.EZpvd(this.OLrzqt, (java.lang.String) obj);
                }
            });
            this.EZpvd = c45892tAc;
            c46221tMhOLrzqt.AhwBna.setAdapter(c45892tAc);
            c46221tMhOLrzqt.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.tAd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC47938tzZ.copydefault(this.KWHzl, view);
                }
            });
            c46221tMhOLrzqt.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.tAa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC47938tzZ.EZpvd(this.OLrzqt, view);
                }
            });
            c46221tMhOLrzqt.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.tAb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC47938tzZ.gEmmrt(this.AEQbTJ, view);
                }
            });
        }
    }

    public static final Unit EZpvd(ActivityC47938tzZ activityC47938tzZ, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        activityC47938tzZ.copydefault().OLrzqt(str);
        return Unit.INSTANCE;
    }

    public static final void copydefault(ActivityC47938tzZ activityC47938tzZ, android.view.View view) {
        C32866mlf.onEvent$default("Orbit_Btm_Introfollow_Click", (TrackChannel[]) null, new Function1() { // from class: o.tzY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC47938tzZ.AEQbTJ((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        activityC47938tzZ.copydefault().AhwBna();
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "button", "skip", false, 4, null);
        EventParamsList.put$default(eventParamsList, "follow_count", "0", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(ActivityC47938tzZ activityC47938tzZ, android.view.View view) {
        final int size = activityC47938tzZ.copydefault().EZpvd().getValue().size();
        C32866mlf.onEvent$default("Orbit_Btm_Introfollow_Click", (TrackChannel[]) null, new Function1() { // from class: o.tAe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC47938tzZ.EZpvd(size, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        activityC47938tzZ.copydefault().AYXKKw();
    }

    public static final Unit EZpvd(int i, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "button", "follow", false, 4, null);
        EventParamsList.put$default(eventParamsList, "follow_count", java.lang.String.valueOf(i), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(ActivityC47938tzZ activityC47938tzZ, android.view.View view) {
        activityC47938tzZ.copydefault().OLrzqt();
    }

    private final void djBIcL() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FollowTopOrbitersActivity$observe$1(this, null), 3, null);
    }

    public final void copydefault(int i) {
        C52794wYp c52794wYp;
        java.lang.String strAYXKKw;
        C46221tMh c46221tMhOLrzqt = OLrzqt();
        if (c46221tMhOLrzqt == null || (c52794wYp = c46221tMhOLrzqt.OLrzqt) == null) {
            return;
        }
        if (i > 0) {
            strAYXKKw = C33069mpW.copydefault(C47501trL.Fragment.DBxZfM, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(i))));
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.DcMfJKfNUfqk);
        }
        c52794wYp.setText(strAYXKKw);
        c52794wYp.setEnabled(i > 0 && !copydefault().KWHzl().getValue().booleanValue());
    }

    public final void KWHzl() {
        ConstraintLayout constraintLayout;
        C55284xgz c55284xgzKWHzl;
        C55284xgz c55284xgzIsConnected;
        C55284xgz c55284xgzDjBIcL;
        C46221tMh c46221tMhOLrzqt = OLrzqt();
        if (c46221tMhOLrzqt == null || (constraintLayout = c46221tMhOLrzqt.valueOf) == null || (c55284xgzKWHzl = C55284xgz.Companion.KWHzl(constraintLayout, C33070mpX.AYXKKw(C47501trL.Fragment.DTg))) == null || (c55284xgzIsConnected = c55284xgzKWHzl.isConnected(0)) == null || (c55284xgzDjBIcL = c55284xgzIsConnected.djBIcL(0)) == null) {
            return;
        }
        c55284xgzDjBIcL.hDKMBd();
    }

    public final void AEQbTJ() {
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: o.tzV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC47938tzZ.gEmmrt(this.OLrzqt);
            }
        }, 150L);
    }

    public static final void gEmmrt(ActivityC47938tzZ activityC47938tzZ) {
        android.view.View viewFindViewById;
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == null || (viewFindViewById = activityAEQbTJ.findViewById(android.R.id.content)) == null) {
            return;
        }
        BottomNavigationView bottomNavigationViewAEQbTJ = activityC47938tzZ.AEQbTJ(viewFindViewById);
        C55284xgz c55284xgzKWHzl = C55284xgz.Companion.KWHzl(viewFindViewById, C33070mpX.AYXKKw(C47501trL.Fragment.DsrFlB));
        if (c55284xgzKWHzl != null) {
            if (bottomNavigationViewAEQbTJ != null) {
                c55284xgzKWHzl.AEQbTJ(bottomNavigationViewAEQbTJ);
            }
            c55284xgzKWHzl.isConnected(3);
            c55284xgzKWHzl.djBIcL(0);
            c55284xgzKWHzl.hDKMBd();
        }
    }

    private final BottomNavigationView AEQbTJ(android.view.View view) {
        if (view == null) {
            return null;
        }
        if (view instanceof BottomNavigationView) {
            return (BottomNavigationView) view;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                BottomNavigationView bottomNavigationViewAEQbTJ = AEQbTJ(viewGroup.getChildAt(i));
                if (bottomNavigationViewAEQbTJ != null) {
                    return bottomNavigationViewAEQbTJ;
                }
            }
        }
        return null;
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC47505trP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
