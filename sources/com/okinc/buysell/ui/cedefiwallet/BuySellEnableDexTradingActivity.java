package com.okinc.buysell.ui.cedefiwallet;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RawRes;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieListener;
import com.okinc.buysell.common.CdnResourceType;
import com.okinc.buysell.data.cedefi.BuySellDexCreateWalletResult;
import com.okinc.buysell.data.cedefi.BuySellDexEmailState;
import com.okinc.buysell.data.cedefi.BuySellDexWalletCreationError;
import com.okinc.buysell.ui.cedefiwallet.BuySellEnableDexTradingActivity;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.okuser.data.User;
import com.okinc.okuser.data.UserInfo;
import com.okinc.uilab.reminder.OKReminder;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC30039lJq;
import o.AbstractC31404ltQ;
import o.AbstractC59533zio;
import o.C30042lJt;
import o.C30044lJv;
import o.C31351lsQ;
import o.C31428lto;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C43251rlk;
import o.C43316rmw;
import o.C52761wXj;
import o.C52794wYp;
import o.C55296xhK;
import o.C55298xhM;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56423yEv;
import o.C56442yFn;
import o.C56524yIo;
import o.C57597ylS;
import o.C7323ahf;
import o.InterfaceC31668lzp;
import o.InterfaceC47278tmy;
import o.InterfaceC56387yDm;
import o.InterfaceC7298ahG;
import o.lJG;
import o.lJJ;
import o.pUU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class BuySellEnableDexTradingActivity extends lJJ {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public boolean AEQbTJ;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.lJw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return BuySellEnableDexTradingActivity.values();
        }
    });
    public final InterfaceC56387yDm OLrzqt;
    public AbstractC31404ltQ copydefault;

    @yCM
    public InterfaceC47278tmy userManager;

    public BuySellEnableDexTradingActivity() {
        final Function0 function0 = null;
        this.OLrzqt = new ViewModelLazy(C56524yIo.AEQbTJ(BuySellDexEnableViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.cedefiwallet.BuySellEnableDexTradingActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.cedefiwallet.BuySellEnableDexTradingActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.cedefiwallet.BuySellEnableDexTradingActivity$special$$inlined$viewModels$default$3
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
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.cedefiwallet.BuySellEnableDexTradingActivity.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void EZpvd(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            context.startActivity(new Intent(context, (Class<?>) BuySellEnableDexTradingActivity.class));
        }

        public final void copydefault(@NotNull Context context, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) BuySellEnableDexTradingActivity.class);
            intent.putExtra("extra.from_lua", z);
            context.startActivity(intent);
        }
    }

    /* JADX DEBUG: Possible override for method o.lJJ.KWHzl()V */
    public final BuySellDexEnableViewModel KWHzl() {
        return (BuySellDexEnableViewModel) this.OLrzqt.getValue();
    }

    private final C43316rmw fetchVPNInfo() {
        return (C43316rmw) this.EZpvd.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw values() {
        return new C43316rmw();
    }

    public final InterfaceC47278tmy EZpvd() {
        InterfaceC47278tmy interfaceC47278tmy = this.userManager;
        if (interfaceC47278tmy != null) {
            return interfaceC47278tmy;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.lJJ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(C52761wXj.Application.AEQbTJ, C52761wXj.Application.fetchVPNInfo);
        AbstractC31404ltQ abstractC31404ltQCopydefault = AbstractC31404ltQ.copydefault(getLayoutInflater());
        this.copydefault = abstractC31404ltQCopydefault;
        setContentView(abstractC31404ltQCopydefault != null ? abstractC31404ltQCopydefault.getRoot() : null);
        DbNXlk();
        AkhnZx();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: renamed from: com.okinc.buysell.ui.cedefiwallet.BuySellEnableDexTradingActivity$onCreate$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BuySellEnableDexTradingActivity.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault;
            Object objCopydefault2 = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC31668lzp interfaceC31668lzp = (InterfaceC31668lzp) C43251rlk.copydefault(InterfaceC31668lzp.class);
                this.label = 1;
                objCopydefault = interfaceC31668lzp.copydefault(this);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objCopydefault = ((Result) obj).m7386unboximpl();
            }
            BuySellEnableDexTradingActivity buySellEnableDexTradingActivity = BuySellEnableDexTradingActivity.this;
            if (Result.m7384isSuccessimpl(objCopydefault)) {
                buySellEnableDexTradingActivity.KWHzl().AEQbTJ(new AbstractC30039lJq.Activity((BuySellDexEmailState) objCopydefault));
            }
            BuySellEnableDexTradingActivity buySellEnableDexTradingActivity2 = BuySellEnableDexTradingActivity.this;
            if (Result.m7380exceptionOrNullimpl(objCopydefault) != null) {
                buySellEnableDexTradingActivity2.KWHzl().AEQbTJ(new AbstractC30039lJq.Activity(null));
            }
            return Unit.INSTANCE;
        }
    }

    private final void DbNXlk() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BuySellEnableDexTradingActivity$setupObservers$1(this, null), 3, null);
    }

    private final void AkhnZx() {
        C52794wYp c52794wYp;
        C57597ylS c57597ylS;
        C52794wYp c52794wYp2;
        C57597ylS c57597ylS2;
        ImageView doImage;
        C57597ylS c57597ylS3;
        OKReminder oKReminder;
        OKReminder oKReminder2;
        OKReminder oKReminder3;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        LottieAnimationView lottieAnimationView;
        AbstractC31404ltQ abstractC31404ltQ = this.copydefault;
        if (abstractC31404ltQ != null && (lottieAnimationView = abstractC31404ltQ.djBIcL) != null) {
            Context context = lottieAnimationView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            lottieAnimationView.setAnimationFromUrl(C31428lto.AEQbTJ("lottie/fiat_payment/cedefi_wallet_creation_intro.lottie", context, CdnResourceType.Lottie, true));
            lottieAnimationView.playAnimation();
        }
        AbstractC31404ltQ abstractC31404ltQ2 = this.copydefault;
        if (abstractC31404ltQ2 != null && (recyclerView2 = abstractC31404ltQ2.isConnected) != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(getMActivity(), 1, false));
        }
        AbstractC31404ltQ abstractC31404ltQ3 = this.copydefault;
        if (abstractC31404ltQ3 != null && (recyclerView = abstractC31404ltQ3.isConnected) != null) {
            recyclerView.setAdapter(fetchVPNInfo());
        }
        fetchVPNInfo().register(C30044lJv.class, new ActionBar());
        AbstractC31404ltQ abstractC31404ltQ4 = this.copydefault;
        if (abstractC31404ltQ4 != null && (oKReminder3 = abstractC31404ltQ4.DbNXlk) != null) {
            oKReminder3.setStyle(2);
        }
        AbstractC31404ltQ abstractC31404ltQ5 = this.copydefault;
        if (abstractC31404ltQ5 != null && (oKReminder2 = abstractC31404ltQ5.DbNXlk) != null) {
            oKReminder2.setCloseIconVisibility(false);
        }
        AbstractC31404ltQ abstractC31404ltQ6 = this.copydefault;
        if (abstractC31404ltQ6 != null && (oKReminder = abstractC31404ltQ6.DbNXlk) != null) {
            oKReminder.setTitle(C33070mpX.AYXKKw(C31351lsQ.Activity.Ufzxmz));
        }
        AbstractC31404ltQ abstractC31404ltQ7 = this.copydefault;
        if (abstractC31404ltQ7 != null && (c57597ylS3 = abstractC31404ltQ7.OLrzqt) != null) {
            c57597ylS3.setSubDoImageResource(C52761wXj.TaskDescription.alsFma);
        }
        AbstractC31404ltQ abstractC31404ltQ8 = this.copydefault;
        if (abstractC31404ltQ8 != null && (c57597ylS2 = abstractC31404ltQ8.OLrzqt) != null && (doImage = c57597ylS2.getDoImage()) != null) {
            doImage.setImageTintList(ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
        }
        AbstractC31404ltQ abstractC31404ltQ9 = this.copydefault;
        if (abstractC31404ltQ9 != null && (c52794wYp2 = abstractC31404ltQ9.copydefault) != null) {
            c52794wYp2.setEnabled(false);
        }
        AbstractC31404ltQ abstractC31404ltQ10 = this.copydefault;
        if (abstractC31404ltQ10 != null && (c57597ylS = abstractC31404ltQ10.OLrzqt) != null) {
            c57597ylS.setSubDoListener(new View.OnClickListener() { // from class: o.lJz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    BuySellEnableDexTradingActivity.OLrzqt(this.AEQbTJ, view);
                }
            });
        }
        AbstractC31404ltQ abstractC31404ltQ11 = this.copydefault;
        if (abstractC31404ltQ11 == null || (c52794wYp = abstractC31404ltQ11.copydefault) == null) {
            return;
        }
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
    }

    public static final void OLrzqt(BuySellEnableDexTradingActivity buySellEnableDexTradingActivity, View view) {
        buySellEnableDexTradingActivity.AYXKKw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AYXKKw() {
        lJG ljgEZpvd = KWHzl().KWHzl().getValue().EZpvd();
        if (ljgEZpvd instanceof lJG.ActionBar) {
            AEQbTJ(EopTrackEvent.KEY_RESULT_FAILED);
            setResult(313);
        } else if (Intrinsics.EZpvd(ljgEZpvd, lJG.TaskDescription.OLrzqt)) {
            AEQbTJ("success");
            setResult(-1);
        } else {
            AEQbTJ("cancelled");
            setResult(0);
        }
        finish();
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ BuySellEnableDexTradingActivity copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, BuySellEnableDexTradingActivity buySellEnableDexTradingActivity) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = buySellEnableDexTradingActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (this.copydefault.KWHzl().KWHzl().getValue().EZpvd() instanceof lJG.Application) {
                    this.copydefault.AEQbTJ = true;
                    this.copydefault.AEQbTJ();
                } else {
                    if (this.copydefault.AEQbTJ) {
                        return;
                    }
                    this.copydefault.AYXKKw();
                }
            }
        }
    }

    public final void AEQbTJ(String str) {
        InterfaceC7298ahG interfaceC7298ahGKWHzl;
        boolean booleanExtra = getIntent().getBooleanExtra("extra.from_lua", false);
        pUU.OLrzqt("fromLua: " + booleanExtra + ", status: " + str);
        if (booleanExtra && (interfaceC7298ahGKWHzl = C7323ahf.KWHzl()) != null) {
            interfaceC7298ahGKWHzl.AEQbTJ("UIBuySellEnableDexTradingNotification", null, C56423yEv.EZpvd(C56390yDp.OLrzqt("UIBuySellEnableDexTradingNotificationExtra", str)));
        }
    }

    public final void AEQbTJ(C30042lJt c30042lJt) {
        LinearLayoutCompat linearLayoutCompat;
        LinearLayoutCompat linearLayoutCompat2;
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        TextView textView;
        TextView textView2;
        TextView textView3;
        UserInfo info;
        LinearLayoutCompat linearLayoutCompat3;
        LinearLayoutCompat linearLayoutCompat4;
        C57597ylS c57597ylS;
        C52794wYp c52794wYp3;
        C52794wYp c52794wYp4;
        TextView textView4;
        TextView textView5;
        LinearLayoutCompat linearLayoutCompat5;
        LinearLayoutCompat linearLayoutCompat6;
        C57597ylS c57597ylS2;
        lJG ljgEZpvd = c30042lJt.EZpvd();
        String realEmail = null;
        realEmail = null;
        if (ljgEZpvd instanceof lJG.ActionBar) {
            AbstractC31404ltQ abstractC31404ltQ = this.copydefault;
            if (abstractC31404ltQ != null && (c57597ylS2 = abstractC31404ltQ.OLrzqt) != null) {
                c57597ylS2.setVisibility(4);
            }
            AbstractC31404ltQ abstractC31404ltQ2 = this.copydefault;
            if (abstractC31404ltQ2 != null && (linearLayoutCompat6 = abstractC31404ltQ2.EZpvd) != null) {
                linearLayoutCompat6.setVisibility(8);
            }
            AbstractC31404ltQ abstractC31404ltQ3 = this.copydefault;
            if (abstractC31404ltQ3 != null && (linearLayoutCompat5 = abstractC31404ltQ3.AYXKKw) != null) {
                linearLayoutCompat5.setVisibility(0);
            }
            AbstractC31404ltQ abstractC31404ltQ4 = this.copydefault;
            showStatusLottieAnimation$default(this, abstractC31404ltQ4 != null ? abstractC31404ltQ4.gEmmrt : null, C52761wXj.PendingIntent.valueOf, 0, 4, null);
            AbstractC31404ltQ abstractC31404ltQ5 = this.copydefault;
            if (abstractC31404ltQ5 != null && (textView5 = abstractC31404ltQ5.valueOf) != null) {
                textView5.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.RXzakW));
                textView5.setGravity(1);
                textView5.setTextAlignment(4);
            }
            AbstractC31404ltQ abstractC31404ltQ6 = this.copydefault;
            if (abstractC31404ltQ6 != null && (textView4 = abstractC31404ltQ6.AhwBna) != null) {
                textView4.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.UhxbNG));
                textView4.setGravity(1);
                textView4.setTextAlignment(4);
            }
            AbstractC31404ltQ abstractC31404ltQ7 = this.copydefault;
            if (abstractC31404ltQ7 != null && (c52794wYp4 = abstractC31404ltQ7.copydefault) != null) {
                c52794wYp4.setEnabled(true);
            }
            djBIcL();
            AbstractC31404ltQ abstractC31404ltQ8 = this.copydefault;
            if (abstractC31404ltQ8 == null || (c52794wYp3 = abstractC31404ltQ8.copydefault) == null) {
                return;
            }
            c52794wYp3.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.QIZEnU));
            return;
        }
        if (ljgEZpvd instanceof lJG.TaskDescription) {
            AbstractC31404ltQ abstractC31404ltQ9 = this.copydefault;
            if (abstractC31404ltQ9 != null && (c57597ylS = abstractC31404ltQ9.OLrzqt) != null) {
                c57597ylS.setVisibility(4);
            }
            AbstractC31404ltQ abstractC31404ltQ10 = this.copydefault;
            if (abstractC31404ltQ10 != null && (linearLayoutCompat4 = abstractC31404ltQ10.EZpvd) != null) {
                linearLayoutCompat4.setVisibility(8);
            }
            AbstractC31404ltQ abstractC31404ltQ11 = this.copydefault;
            if (abstractC31404ltQ11 != null && (linearLayoutCompat3 = abstractC31404ltQ11.AYXKKw) != null) {
                linearLayoutCompat3.setVisibility(0);
            }
            AbstractC31404ltQ abstractC31404ltQ12 = this.copydefault;
            showStatusLottieAnimation$default(this, abstractC31404ltQ12 != null ? abstractC31404ltQ12.gEmmrt : null, C52761wXj.PendingIntent.uzCIH, 0, 4, null);
            User userOLrzqt = EZpvd().OLrzqt();
            if (userOLrzqt != null && (info = userOLrzqt.getInfo()) != null) {
                realEmail = info.getRealEmail();
            }
            if (realEmail == null) {
                realEmail = "";
            }
            pUU.KWHzl(getTAG(), "EnableDexSuccess, email: " + realEmail);
            AbstractC31404ltQ abstractC31404ltQ13 = this.copydefault;
            if (abstractC31404ltQ13 != null && (textView3 = abstractC31404ltQ13.valueOf) != null) {
                textView3.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.UscePu));
                textView3.setGravity(1);
                textView3.setTextAlignment(4);
            }
            AbstractC31404ltQ abstractC31404ltQ14 = this.copydefault;
            if (abstractC31404ltQ14 != null && (textView2 = abstractC31404ltQ14.AhwBna) != null) {
                textView2.setGravity(1);
                textView2.setTextAlignment(4);
            }
            AbstractC31404ltQ abstractC31404ltQ15 = this.copydefault;
            if (abstractC31404ltQ15 != null && (textView = abstractC31404ltQ15.AhwBna) != null) {
                textView.setText(C33069mpW.copydefault(C31351lsQ.Activity.TarCU, C56423yEv.EZpvd(C56390yDp.OLrzqt("recoveryEmail", realEmail))));
            }
            AbstractC31404ltQ abstractC31404ltQ16 = this.copydefault;
            if (abstractC31404ltQ16 != null && (c52794wYp2 = abstractC31404ltQ16.copydefault) != null) {
                c52794wYp2.setEnabled(true);
            }
            djBIcL();
            AbstractC31404ltQ abstractC31404ltQ17 = this.copydefault;
            if (abstractC31404ltQ17 == null || (c52794wYp = abstractC31404ltQ17.copydefault) == null) {
                return;
            }
            c52794wYp.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.ULRxlR));
            return;
        }
        if (!(ljgEZpvd instanceof lJG.Application)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC31404ltQ abstractC31404ltQ18 = this.copydefault;
        if (abstractC31404ltQ18 != null && (linearLayoutCompat2 = abstractC31404ltQ18.EZpvd) != null) {
            linearLayoutCompat2.setVisibility(0);
        }
        AbstractC31404ltQ abstractC31404ltQ19 = this.copydefault;
        if (abstractC31404ltQ19 != null && (linearLayoutCompat = abstractC31404ltQ19.AYXKKw) != null) {
            linearLayoutCompat.setVisibility(8);
        }
        EZpvd(true);
        KWHzl(((lJG.Application) c30042lJt.EZpvd()).AEQbTJ());
        KWHzl(((lJG.Application) c30042lJt.EZpvd()).KWHzl());
    }

    public final void KWHzl(String str) {
        TextView textView;
        AbstractC31404ltQ abstractC31404ltQ = this.copydefault;
        if (abstractC31404ltQ == null || (textView = abstractC31404ltQ.values) == null) {
            return;
        }
        textView.setText(str);
    }

    public final void djBIcL() {
        C52794wYp c52794wYp;
        AbstractC31404ltQ abstractC31404ltQ = this.copydefault;
        if (abstractC31404ltQ != null && (c52794wYp = abstractC31404ltQ.copydefault) != null) {
            c52794wYp.fIwbmz();
        }
        this.AEQbTJ = false;
    }

    public final void KWHzl(C30042lJt c30042lJt) {
        OKReminder oKReminder;
        AbstractC31404ltQ abstractC31404ltQ = this.copydefault;
        if (abstractC31404ltQ == null || (oKReminder = abstractC31404ltQ.DbNXlk) == null) {
            return;
        }
        oKReminder.setVisibility(c30042lJt.copydefault() ? 0 : 8);
    }

    public final void KWHzl(List<C30044lJv> list) {
        fetchVPNInfo().setItems(list);
        fetchVPNInfo().notifyDataSetChanged();
    }

    public final void EZpvd(boolean z) {
        C52794wYp c52794wYp;
        AbstractC31404ltQ abstractC31404ltQ = this.copydefault;
        if (abstractC31404ltQ != null && (c52794wYp = abstractC31404ltQ.copydefault) != null) {
            c52794wYp.setEnabled(z);
        }
        djBIcL();
    }

    public final void AEQbTJ() {
        InterfaceC31668lzp interfaceC31668lzp = (InterfaceC31668lzp) C43251rlk.copydefault(InterfaceC31668lzp.class);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        interfaceC31668lzp.KWHzl(supportFragmentManager, this, new BuySellEnableDexTradingActivity$handleEnableDexButtonClicked$1(this));
    }

    public final void EZpvd(BuySellDexCreateWalletResult buySellDexCreateWalletResult) {
        if (buySellDexCreateWalletResult instanceof BuySellDexCreateWalletResult.Success) {
            KWHzl().AEQbTJ(new AbstractC30039lJq.StateListAnimator(((BuySellDexCreateWalletResult.Success) buySellDexCreateWalletResult).copydefault()));
            return;
        }
        if (buySellDexCreateWalletResult instanceof BuySellDexCreateWalletResult.Cancelled) {
            djBIcL();
            finish();
            return;
        }
        if (buySellDexCreateWalletResult instanceof BuySellDexCreateWalletResult.Failed) {
            BuySellDexCreateWalletResult.Failed failed = (BuySellDexCreateWalletResult.Failed) buySellDexCreateWalletResult;
            pUU.KWHzl(getTAG(), "Wallet creation failed: " + failed.KWHzl());
            djBIcL();
            if (failed.KWHzl() instanceof BuySellDexWalletCreationError.RiskControl) {
                KWHzl().AEQbTJ(new AbstractC30039lJq.TaskDescription("RiskControl error"));
                return;
            }
            pUU.KWHzl(getTAG(), "Wallet creation failed: " + failed.KWHzl());
            return;
        }
        if (!Intrinsics.EZpvd(buySellDexCreateWalletResult, BuySellDexCreateWalletResult.Ignored.EZpvd)) {
            throw new NoWhenBranchMatchedException();
        }
        pUU.KWHzl(getTAG(), "Wallet creation failed: Ignored");
        djBIcL();
    }

    @Override // o.lJJ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        KWHzl().AEQbTJ(AbstractC30039lJq.ActionBar.AEQbTJ);
    }

    @Override // o.lJJ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        KWHzl().AEQbTJ(AbstractC30039lJq.Application.EZpvd);
    }

    @Override // o.lJJ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.copydefault = null;
    }

    public static /* synthetic */ void showStatusLottieAnimation$default(BuySellEnableDexTradingActivity buySellEnableDexTradingActivity, ImageView imageView, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        buySellEnableDexTradingActivity.EZpvd(imageView, i, i2);
    }

    private final void EZpvd(final ImageView imageView, @RawRes int i, final int i2) {
        LottieCompositionFactory.fromRawRes(getMActivity(), i).addListener(new LottieListener() { // from class: o.lJB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(java.lang.Object obj) {
                BuySellEnableDexTradingActivity.OLrzqt(imageView, i2, (LottieComposition) obj);
            }
        });
    }

    public static final void OLrzqt(ImageView imageView, int i, LottieComposition lottieComposition) {
        if (imageView != null) {
            LottieDrawable lottieDrawable = new LottieDrawable();
            lottieDrawable.setComposition(lottieComposition);
            lottieDrawable.setRepeatCount(i);
            lottieDrawable.playAnimation();
            imageView.performHapticFeedback(0);
            imageView.setImageDrawable(lottieDrawable);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iOLrzqt = C55298xhM.OLrzqt(216, context);
            layoutParams.width = iOLrzqt;
            layoutParams.height = iOLrzqt;
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class ActionBar extends AbstractC59533zio<C30044lJv, StateListAnimator> {
        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public StateListAnimator onCreateViewHolder(@NotNull LayoutInflater layoutInflater, @NotNull ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            View viewInflate = layoutInflater.inflate(C31351lsQ.ActionBar.dxcTrN, viewGroup, false);
            Intrinsics.copydefault(viewInflate);
            return new StateListAnimator(this, viewInflate);
        }

        /* JADX INFO: loaded from: classes18.dex */
        public final class StateListAnimator extends RecyclerView.ViewHolder {
            public final ImageView EZpvd;
            public final TextView OLrzqt;
            public final /* synthetic */ ActionBar copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ImageView KWHzl() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TextView copydefault() {
                return this.OLrzqt;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull ActionBar actionBar, View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "");
                this.copydefault = actionBar;
                View viewFindViewById = view.findViewById(C31351lsQ.Application.hvKCwS);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
                this.EZpvd = (ImageView) viewFindViewById;
                View viewFindViewById2 = view.findViewById(C31351lsQ.Application.zDUObI);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
                this.OLrzqt = (TextView) viewFindViewById2;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull C30044lJv c30044lJv) {
            Integer numKWHzl;
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            Intrinsics.checkNotNullParameter(c30044lJv, "");
            if (C33129mqd.AEQbTJ(c30044lJv.KWHzl(), 0) && (numKWHzl = c30044lJv.KWHzl()) != null) {
                stateListAnimator.KWHzl().setImageDrawable(C33070mpX.KWHzl(numKWHzl.intValue()));
            }
            stateListAnimator.copydefault().setText(c30044lJv.copydefault());
        }
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(C52761wXj.Application.fetchVPNInfo, C52761wXj.Application.valueOf);
    }

    @Override // o.lJJ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.lJJ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
