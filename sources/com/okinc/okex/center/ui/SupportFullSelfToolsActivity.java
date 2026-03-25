package com.okinc.okex.center.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.ui.SupportFullSelfToolsActivity;
import com.okinc.okex.center.viewmodel.SupportFullSelfToolsViewModel;
import com.okinc.okex.common.ui.OKSupportBaseActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractActivityC44919sfx;
import o.AbstractC47291tnK;
import o.ActivityC44038sBa;
import o.C32979mnm;
import o.C33070mpX;
import o.C33566myq;
import o.C45057sic;
import o.C45397soy;
import o.C47315tni;
import o.C52761wXj;
import o.C55296xhK;
import o.C55298xhM;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportFullSelfToolsActivity extends AbstractActivityC44919sfx {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.sfL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportFullSelfToolsActivity.djBIcL(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.sfQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportFullSelfToolsActivity.AhwBna(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm KWHzl;

    @yCM
    public C45397soy selfServiceUseCase;

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public boolean AYXKKw() {
        return true;
    }

    public SupportFullSelfToolsActivity() {
        final Function0 function0 = null;
        this.KWHzl = new ViewModelLazy(C56524yIo.AEQbTJ(SupportFullSelfToolsViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.center.ui.SupportFullSelfToolsActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.center.ui.SupportFullSelfToolsActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.center.ui.SupportFullSelfToolsActivity$special$$inlined$viewModels$default$3
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

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.ui.SupportFullSelfToolsActivity.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final Intent copydefault(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new Intent(context, (Class<?>) SupportFullSelfToolsActivity.class);
        }
    }

    /* JADX DEBUG: Possible override for method com.okinc.okex.common.ui.OKSupportBaseActivity.EZpvd()V */
    /* JADX DEBUG: Possible override for method o.snZ.EZpvd()V */
    public final C45397soy EZpvd() {
        C45397soy c45397soy = this.selfServiceUseCase;
        if (c45397soy != null) {
            return c45397soy;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final SupportFullSelfToolsViewModel KWHzl() {
        return (SupportFullSelfToolsViewModel) this.KWHzl.getValue();
    }

    /* JADX DEBUG: Possible override for method com.okinc.okex.common.ui.OKSupportBaseActivity.AEQbTJ()V */
    /* JADX DEBUG: Possible override for method o.sfx.AEQbTJ()V */
    /* JADX DEBUG: Possible override for method o.snZ.AEQbTJ()V */
    public final AbstractC47291tnK AEQbTJ() {
        return (AbstractC47291tnK) this.AEQbTJ.getValue();
    }

    public static final AbstractC47291tnK djBIcL(SupportFullSelfToolsActivity supportFullSelfToolsActivity) {
        return AbstractC47291tnK.OLrzqt(supportFullSelfToolsActivity.getLayoutInflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C45057sic AhwBna() {
        return (C45057sic) this.EZpvd.getValue();
    }

    public static final class TaskDescription implements C45057sic.Application {
        public TaskDescription() {
        }

        @Override // o.C45057sic.Application
        public void OLrzqt(SelfServiceToolBean selfServiceToolBean) {
            Intrinsics.checkNotNullParameter(selfServiceToolBean, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(SupportFullSelfToolsActivity.this), null, null, new SupportFullSelfToolsActivity$selfToolsCardAdapter$2$1$1$onSelfServiceItemClicked$1(SupportFullSelfToolsActivity.this, selfServiceToolBean, null), 3, null);
        }
    }

    public static final C45057sic AhwBna(SupportFullSelfToolsActivity supportFullSelfToolsActivity) {
        C45057sic c45057sic = new C45057sic(false, 0, null, 6, null);
        c45057sic.copydefault(supportFullSelfToolsActivity.new TaskDescription());
        return c45057sic;
    }

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public View AkhnZx() {
        View root = AEQbTJ().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public void initFrameContent(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        AEQbTJ();
        djBIcL();
        valueOf();
        OKSupportBaseActivity.setErrorRetryClickListener$default(this, 0, new Function0() { // from class: o.sfN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SupportFullSelfToolsActivity.gEmmrt(this.EZpvd);
            }
        }, 1, null);
    }

    public static final Unit gEmmrt(SupportFullSelfToolsActivity supportFullSelfToolsActivity) {
        supportFullSelfToolsActivity.KWHzl().copydefault();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC44919sfx, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        gEmmrt();
        KWHzl().copydefault();
    }

    private final void gEmmrt() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new SupportFullSelfToolsActivity$observeViewModel$1(this, null));
    }

    private final void djBIcL() {
        KWHzl(C33070mpX.AYXKKw(C47315tni.PendingIntent.DKtBnz));
        EZpvd(C33070mpX.AYXKKw(C47315tni.PendingIntent.hrjNmC));
        EZpvd(C52761wXj.LoaderManager.iwGUEr, C52761wXj.LoaderManager.valueOf);
        EZpvd(C52761wXj.TaskDescription.UJpkuA, C47315tni.Activity.djBIcL, new View.OnClickListener() { // from class: o.sfP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                SupportFullSelfToolsActivity.OLrzqt(this.OLrzqt, view);
            }
        });
    }

    public static final void OLrzqt(SupportFullSelfToolsActivity supportFullSelfToolsActivity, View view) {
        supportFullSelfToolsActivity.startActivity(ActivityC44038sBa.Application.createIntent$default(ActivityC44038sBa.Companion, supportFullSelfToolsActivity, "all_activities", null, 4, null));
    }

    private final void valueOf() {
        RecyclerView recyclerView = AEQbTJ().copydefault;
        recyclerView.setAdapter(AhwBna());
        int i = C33566myq.EZpvd.EZpvd(C32979mnm.EZpvd.OLrzqt()) < 380 ? 2 : 3;
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), i));
        recyclerView.addItemDecoration(new Activity(i, C55298xhM.dp2px$default(12.0f, null, 1, null), false));
        recyclerView.setPadding(0, recyclerView.getPaddingTop(), 0, recyclerView.getPaddingBottom());
    }

    /* JADX INFO: loaded from: classes16.dex */
    public final class Activity extends RecyclerView.ItemDecoration {
        public final boolean AEQbTJ;
        public final int EZpvd;
        public final int KWHzl;

        public Activity(int i, int i2, boolean z) {
            this.KWHzl = i;
            this.EZpvd = i2;
            this.AEQbTJ = z;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == -1) {
                return;
            }
            int i = childAdapterPosition % this.KWHzl;
            boolean zAEQbTJ = C55296xhK.AEQbTJ(view);
            if (this.AEQbTJ) {
                if (!zAEQbTJ) {
                    int i2 = this.EZpvd;
                    int i3 = this.KWHzl;
                    rect.left = i2 - ((i * i2) / i3);
                    rect.right = ((i + 1) * i2) / i3;
                } else {
                    int i4 = this.EZpvd;
                    int i5 = this.KWHzl;
                    rect.right = i4 - ((i * i4) / i5);
                    rect.left = ((i + 1) * i4) / i5;
                }
            } else if (!zAEQbTJ) {
                int i6 = this.EZpvd;
                int i7 = this.KWHzl;
                rect.left = (i * i6) / i7;
                rect.right = i6 - (((i + 1) * i6) / i7);
            } else {
                int i8 = this.EZpvd;
                int i9 = this.KWHzl;
                rect.right = (i * i8) / i9;
                rect.left = i8 - (((i + 1) * i8) / i9);
            }
            rect.bottom = this.EZpvd;
        }
    }

    @Override // o.AbstractActivityC44919sfx, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC44919sfx, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC44919sfx, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC44919sfx, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
