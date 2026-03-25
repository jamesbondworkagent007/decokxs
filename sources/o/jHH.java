package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.market.data.model.alert.TokenInfoForAlert;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C22366hdx;
import o.C23274hvD;
import o.C52761wXj;
import o.InterfaceC25830jHy;
import o.jHA;

/* JADX INFO: loaded from: classes15.dex */
public final class jHH extends AbstractActivityC33013moT {
    public C22367hdy AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public boolean KWHzl;
    public TokenInfoForAlert OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String AEQbTJ() {
        return "--";
    }

    public jHH() {
        final Function0 function0 = null;
        this.EZpvd = new ViewModelLazy(C56524yIo.AEQbTJ(C25829jHx.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.alert.ui.Web3MarketAlertActivity$special$$inlined$viewModels$default$2
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
        }, new Function0() { // from class: o.jHP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jHH.values();
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.alert.ui.Web3MarketAlertActivity$special$$inlined$viewModels$default$3
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

    public final C25829jHx valueOf() {
        return (C25829jHx) this.EZpvd.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory values() {
        return new C25808jHc();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C22367hdy c22367hdyCopydefault = C22367hdy.copydefault(getLayoutInflater());
        this.AEQbTJ = c22367hdyCopydefault;
        C22367hdy c22367hdy = null;
        if (c22367hdyCopydefault == null) {
            Intrinsics.gEmmrt("");
            c22367hdyCopydefault = null;
        }
        setContentView(c22367hdyCopydefault.getRoot());
        this.OLrzqt = (TokenInfoForAlert) getIntent().getParcelableExtra("token_info_for_alert");
        gEmmrt();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.jHJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                jHH.djBIcL(this.copydefault);
            }
        });
        C22367hdy c22367hdy2 = this.AEQbTJ;
        if (c22367hdy2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c22367hdy = c22367hdy2;
        }
        c22367hdy.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.jHO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                jHH.AYXKKw(this.KWHzl, view);
            }
        });
        getOnBackPressedDispatcher().addCallback(this, new Activity());
        DbNXlk();
    }

    public static final void djBIcL(jHH jhh) {
        rVN.reportFullyDrawn$default((android.app.Activity) jhh, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void AYXKKw(jHH jhh, android.view.View view) {
        jhh.getOnBackPressedDispatcher().onBackPressed();
    }

    public static final class Activity extends OnBackPressedCallback {
        public Activity() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            if (jHH.this.KWHzl) {
                jHH.this.gEmmrt();
            } else {
                jHH.this.finish();
            }
        }
    }

    public final void gEmmrt() {
        this.KWHzl = false;
        C22367hdy c22367hdy = this.AEQbTJ;
        TokenInfoForAlert tokenInfoForAlertEZpvd = null;
        if (c22367hdy == null) {
            Intrinsics.gEmmrt("");
            c22367hdy = null;
        }
        android.widget.TextView textView = c22367hdy.AhwBna;
        int i = C22366hdx.StateListAnimator.fJNWhG;
        TokenInfoForAlert tokenInfoForAlert = this.OLrzqt;
        textView.setText(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", C31256lqb.KWHzl(tokenInfoForAlert != null ? tokenInfoForAlert.djBIcL() : null, (Function0<java.lang.String>) new Function0() { // from class: o.jHQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jHH.AEQbTJ();
            }
        })))));
        C22367hdy c22367hdy2 = this.AEQbTJ;
        if (c22367hdy2 == null) {
            Intrinsics.gEmmrt("");
            c22367hdy2 = null;
        }
        c22367hdy2.getRoot().post(new java.lang.Runnable() { // from class: o.jHM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                jHH.AYXKKw(this.AEQbTJ);
            }
        });
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        int i2 = C22366hdx.ActionBar.AuCTelauCTel;
        jHA.TaskDescription taskDescription = jHA.Companion;
        TokenInfoForAlert tokenInfoForAlert2 = this.OLrzqt;
        if (tokenInfoForAlert2 != null) {
            tokenInfoForAlertEZpvd = tokenInfoForAlert2.EZpvd((831 & 1) != 0 ? tokenInfoForAlert2.OLrzqt : null, (831 & 2) != 0 ? tokenInfoForAlert2.KWHzl : null, (831 & 4) != 0 ? tokenInfoForAlert2.djBIcL : null, (831 & 8) != 0 ? tokenInfoForAlert2.AYXKKw : null, (831 & 16) != 0 ? tokenInfoForAlert2.copydefault : null, (831 & 32) != 0 ? tokenInfoForAlert2.values : null, (831 & 64) != 0 ? tokenInfoForAlert2.valueOf : null, (831 & 128) != 0 ? tokenInfoForAlert2.AhwBna : null, (831 & 256) != 0 ? tokenInfoForAlert2.AEQbTJ : null, (831 & 512) != 0 ? tokenInfoForAlert2.gEmmrt : true);
        }
        fragmentTransactionBeginTransaction.replace(i2, taskDescription.AEQbTJ(tokenInfoForAlertEZpvd));
        fragmentTransactionBeginTransaction.commit();
    }

    public static final void AYXKKw(jHH jhh) {
        C22367hdy c22367hdy = jhh.AEQbTJ;
        C22367hdy c22367hdy2 = null;
        if (c22367hdy == null) {
            Intrinsics.gEmmrt("");
            c22367hdy = null;
        }
        android.widget.LinearLayout linearLayout = c22367hdy.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams != null) {
            C22367hdy c22367hdy3 = jhh.AEQbTJ;
            if (c22367hdy3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c22367hdy2 = c22367hdy3;
            }
            layoutParams.width = c22367hdy2.AEQbTJ.getWidth();
            linearLayout.setLayoutParams(layoutParams);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void AYXKKw() {
        this.KWHzl = true;
        C22367hdy c22367hdy = this.AEQbTJ;
        if (c22367hdy == null) {
            Intrinsics.gEmmrt("");
            c22367hdy = null;
        }
        c22367hdy.AhwBna.setText(C33070mpX.AYXKKw(C22366hdx.StateListAnimator.ejfBZ));
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        fragmentTransactionBeginTransaction.replace(C22366hdx.ActionBar.AuCTelauCTel, C25819jHn.Companion.EZpvd(this.OLrzqt));
        fragmentTransactionBeginTransaction.commit();
    }

    public final void djBIcL() {
        if (this.KWHzl) {
            AhwBna();
        } else {
            fetchVPNInfo();
        }
    }

    private final void DbNXlk() {
        C25390ivn.collectOnLifecycle$default(this, valueOf().AEQbTJ(), null, new ActionBar(), 2, null);
    }

    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC25830jHy interfaceC25830jHy, Continuation<? super Unit> continuation) {
            if ((interfaceC25830jHy instanceof InterfaceC25830jHy.StateListAnimator) || (interfaceC25830jHy instanceof InterfaceC25830jHy.Application) || (interfaceC25830jHy instanceof InterfaceC25830jHy.TaskDescription)) {
                jHH.this.OLrzqt();
            } else {
                if (!(interfaceC25830jHy instanceof InterfaceC25830jHy.ActionBar)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((InterfaceC25830jHy.ActionBar) interfaceC25830jHy).AEQbTJ()) {
                    jHH.this.EZpvd();
                } else {
                    jHH.this.djBIcL();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void OLrzqt() {
        C22367hdy c22367hdy = this.AEQbTJ;
        C22367hdy c22367hdy2 = null;
        if (c22367hdy == null) {
            Intrinsics.gEmmrt("");
            c22367hdy = null;
        }
        c22367hdy.AEQbTJ.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.aWJMta));
        C22367hdy c22367hdy3 = this.AEQbTJ;
        if (c22367hdy3 == null) {
            Intrinsics.gEmmrt("");
            c22367hdy3 = null;
        }
        c22367hdy3.AEQbTJ.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.UlJrfe));
        C22367hdy c22367hdy4 = this.AEQbTJ;
        if (c22367hdy4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c22367hdy2 = c22367hdy4;
        }
        c22367hdy2.AEQbTJ.setEnabled(false);
    }

    public final void AhwBna() {
        C22367hdy c22367hdy = this.AEQbTJ;
        C22367hdy c22367hdy2 = null;
        if (c22367hdy == null) {
            Intrinsics.gEmmrt("");
            c22367hdy = null;
        }
        c22367hdy.AEQbTJ.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.aWJMta));
        C22367hdy c22367hdy3 = this.AEQbTJ;
        if (c22367hdy3 == null) {
            Intrinsics.gEmmrt("");
            c22367hdy3 = null;
        }
        c22367hdy3.AEQbTJ.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
        C22367hdy c22367hdy4 = this.AEQbTJ;
        if (c22367hdy4 == null) {
            Intrinsics.gEmmrt("");
            c22367hdy4 = null;
        }
        c22367hdy4.AEQbTJ.setEnabled(true);
        C22367hdy c22367hdy5 = this.AEQbTJ;
        if (c22367hdy5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c22367hdy2 = c22367hdy5;
        }
        c22367hdy2.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.jHR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                jHH.gEmmrt(this.AEQbTJ, view);
            }
        });
    }

    public static final void gEmmrt(jHH jhh, android.view.View view) {
        jhh.valueOf().EZpvd();
    }

    public final void fetchVPNInfo() {
        C22367hdy c22367hdy = this.AEQbTJ;
        C22367hdy c22367hdy2 = null;
        if (c22367hdy == null) {
            Intrinsics.gEmmrt("");
            c22367hdy = null;
        }
        c22367hdy.AEQbTJ.setText(C33070mpX.AYXKKw(C22366hdx.StateListAnimator.AuCTel));
        C22367hdy c22367hdy3 = this.AEQbTJ;
        if (c22367hdy3 == null) {
            Intrinsics.gEmmrt("");
            c22367hdy3 = null;
        }
        c22367hdy3.AEQbTJ.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
        C22367hdy c22367hdy4 = this.AEQbTJ;
        if (c22367hdy4 == null) {
            Intrinsics.gEmmrt("");
            c22367hdy4 = null;
        }
        c22367hdy4.AEQbTJ.setEnabled(true);
        C22367hdy c22367hdy5 = this.AEQbTJ;
        if (c22367hdy5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c22367hdy2 = c22367hdy5;
        }
        c22367hdy2.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.jHN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                jHH.AhwBna(this.KWHzl, view);
            }
        });
    }

    public static final void AhwBna(final jHH jhh, android.view.View view) {
        C32866mlf.onEvent$default("DEXMarket_Alert_AllTokenAlert_Click", (TrackChannel[]) null, new Function1() { // from class: o.jHL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jHH.KWHzl(this.EZpvd, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        jhh.AYXKKw();
    }

    public static final Unit KWHzl(jHH jhh, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        TokenInfoForAlert tokenInfoForAlert = jhh.OLrzqt;
        java.lang.String strValueOf = tokenInfoForAlert != null ? tokenInfoForAlert.valueOf() : null;
        EventParamsList.put$default(eventParamsList, "token_address", strValueOf == null ? "" : strValueOf, false, 4, null);
        TokenInfoForAlert tokenInfoForAlert2 = jhh.OLrzqt;
        java.lang.String strDjBIcL = tokenInfoForAlert2 != null ? tokenInfoForAlert2.djBIcL() : null;
        EventParamsList.put$default(eventParamsList, "token_symbol", strDjBIcL == null ? "" : strDjBIcL, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        C22367hdy c22367hdy = this.AEQbTJ;
        C22367hdy c22367hdy2 = null;
        if (c22367hdy == null) {
            Intrinsics.gEmmrt("");
            c22367hdy = null;
        }
        c22367hdy.AEQbTJ.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaControllerCompatApi24));
        C22367hdy c22367hdy3 = this.AEQbTJ;
        if (c22367hdy3 == null) {
            Intrinsics.gEmmrt("");
            c22367hdy3 = null;
        }
        c22367hdy3.AEQbTJ.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
        C22367hdy c22367hdy4 = this.AEQbTJ;
        if (c22367hdy4 == null) {
            Intrinsics.gEmmrt("");
            c22367hdy4 = null;
        }
        c22367hdy4.AEQbTJ.setEnabled(true);
        C22367hdy c22367hdy5 = this.AEQbTJ;
        if (c22367hdy5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c22367hdy2 = c22367hdy5;
        }
        c22367hdy2.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.jHU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                jHH.EZpvd(this.copydefault, view);
            }
        });
    }

    public static final void EZpvd(jHH jhh, android.view.View view) {
        jhh.valueOf().KWHzl();
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
