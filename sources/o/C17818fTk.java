package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.business.defi.api.bean.ActivateTeeGuideModel;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.business.defi.wallet.tee.activate.ui.ActivateSAGuideFragment$initView$4$2;
import com.okinc.components.track.TrackChannel;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC17792fSl;
import o.C13754dXa;
import o.C14140dfo;
import o.C52761wXj;
import o.fVU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fTk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17818fTk extends AbstractC32996moC {
    public final ActivityResultLauncher<java.lang.String> EZpvd;
    public final int KWHzl = C13754dXa.TaskDescription.DrqXHJ;
    public final ActivityResultLauncher<ActivateTeeGuideModel> OLrzqt;
    public C16579emb copydefault;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.KWHzl;
    }

    public C17818fTk() {
        ActivityResultLauncher<ActivateTeeGuideModel> activityResultLauncherRegisterForActivityResult = registerForActivityResult(ActivityC17792fSl.ActionBar.KWHzl, new ActivityResultCallback() { // from class: o.fTo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C17818fTk.AEQbTJ(this.OLrzqt, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.OLrzqt = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<java.lang.String> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(fVU.TaskDescription.copydefault, new ActivityResultCallback() { // from class: o.fTs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C17818fTk.KWHzl(this.OLrzqt, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.EZpvd = activityResultLauncherRegisterForActivityResult2;
    }

    /* JADX INFO: renamed from: o.fTk$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fTk.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C17818fTk AEQbTJ(@NotNull ActivateTeeGuideModel activateTeeGuideModel) {
            Intrinsics.checkNotNullParameter(activateTeeGuideModel, "");
            C17818fTk c17818fTk = new C17818fTk();
            c17818fTk.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("tee_account_info", activateTeeGuideModel)));
            return c17818fTk;
        }
    }

    public final C16579emb EZpvd() {
        C16579emb c16579emb = this.copydefault;
        if (c16579emb != null) {
            return c16579emb;
        }
        throw new java.lang.IllegalStateException("Binding is only available between onCreateView and onDestroyView".toString());
    }

    public final ActivateTeeGuideModel AEQbTJ() {
        ActivateTeeGuideModel activateTeeGuideModel;
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (activateTeeGuideModel = (ActivateTeeGuideModel) arguments.getParcelable("tee_account_info")) == null) {
            throw new java.lang.IllegalArgumentException("Missing input params");
        }
        return activateTeeGuideModel;
    }

    public static final void AEQbTJ(C17818fTk c17818fTk, ActivityResult activityResult) {
        if (c17818fTk.requireActivity() instanceof fSU) {
            c17818fTk.requireActivity().setResult(activityResult.getResultCode(), activityResult.getData());
            c17818fTk.requireActivity().finish();
        }
    }

    public static final void KWHzl(C17818fTk c17818fTk, ActivityResult activityResult) {
        FragmentActivity activity = c17818fTk.getActivity();
        if (activity instanceof fSU) {
            fSU fsu = (fSU) activity;
            fsu.setResult(activityResult.getResultCode());
            fsu.finish();
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.copydefault = C16579emb.AEQbTJ(view);
        EZpvd().gEmmrt.setBackImage(C52761wXj.TaskDescription.alsFma);
        C32866mlf.onEvent$default("Web3WalletSmartAccountIntroductionPage_Page_Page_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        C33537myN c33537myN = EZpvd().gEmmrt;
        Intrinsics.copydefault(c33537myN);
        c33537myN.setVisibility(0);
        c33537myN.setAppBarColor(0);
        c33537myN.setStatusBarVisible(4);
        c33537myN.setBackVisible(0);
        copydefault();
        java.lang.String str = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ODWQjV) + "\u200b";
        java.lang.String str2 = C33069mpW.copydefault(C13754dXa.FragmentManager.QWSkGZ, C56423yEv.EZpvd(C56390yDp.OLrzqt("learn", str))) + "\u200b";
        EZpvd().djBIcL.setText(C33061mpO.setupSpanStyles$default(str2, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.fTn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17818fTk.copydefault((java.util.List) obj);
            }
        }, 14, null));
        EZpvd().djBIcL.setOnTouchListener(new ViewOnTouchListenerC14460dlq(EZpvd().djBIcL, str2, str, new Function0() { // from class: o.fTm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C17818fTk.AhwBna(this.copydefault);
            }
        }));
        view.post(new java.lang.Runnable() { // from class: o.fTl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C17818fTk.gEmmrt(this.KWHzl);
            }
        });
        C52794wYp c52794wYp = EZpvd().copydefault;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
    }

    public static final Unit copydefault(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.UnderlineSpan());
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C17818fTk c17818fTk) {
        android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C13754dXa.FragmentManager.RZOtbZ)), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString()));
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        FragmentActivity fragmentActivityRequireActivity = c17818fTk.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        WebActivity.TaskDescription.openPage$default(taskDescription, fragmentActivityRequireActivity, bundleBundleOf, null, 4, null);
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(C17818fTk c17818fTk) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c17818fTk, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.fTk$TaskDescription */
    public static final class TaskDescription implements Function1<java.lang.String, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        public final void KWHzl(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C14140dfo.TaskDescription taskDescription = C14140dfo.Companion;
            C14140dfo instance$default = C14140dfo.TaskDescription.getInstance$default(taskDescription, null, 1, null);
            java.lang.String rootWalletId = C17818fTk.this.AEQbTJ().getRootWalletId();
            java.lang.String strCreateWalletName$default = C14140dfo.createWalletName$default(C14140dfo.TaskDescription.getInstance$default(taskDescription, null, 1, null), null, C17818fTk.this.AEQbTJ().getAddressIndex() + 1, false, 5, null);
            int addressIndex = C17818fTk.this.AEQbTJ().getAddressIndex();
            androidx.fragment.app.FragmentManager childFragmentManager = C17818fTk.this.getChildFragmentManager();
            C13786dYf c13786dYf = new C13786dYf(false);
            final C17818fTk c17818fTk = C17818fTk.this;
            instance$default.OLrzqt(rootWalletId, strCreateWalletName$default, addressIndex, str, childFragmentManager, c13786dYf, (192 & 64) != 0, (192 & 128) != 0, (Function1<? super AbstractC12782ctV, Unit>) new Function1<AbstractC12782ctV, Unit>() { // from class: o.fTk.TaskDescription.2
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* synthetic */ Unit invoke(AbstractC12782ctV abstractC12782ctV) {
                    EZpvd(abstractC12782ctV);
                    return Unit.INSTANCE;
                }

                public final void EZpvd(AbstractC12782ctV abstractC12782ctV) {
                    if (abstractC12782ctV == null) {
                        c17818fTk.EZpvd().copydefault.fIwbmz();
                        return;
                    }
                    if (!abstractC12782ctV.RJOkX()) {
                        ActivityC17792fSl.StateListAnimator stateListAnimator = ActivityC17792fSl.Companion;
                        FragmentActivity activity = c17818fTk.getActivity();
                        if (activity == null) {
                            return;
                        } else {
                            stateListAnimator.copydefault(activity, new ActivateTeeGuideModel(abstractC12782ctV.DbNXlk(), false, true, (java.lang.String) null, 0, 0, 0, "sa_wallet_onboarding", 122, (DefaultConstructorMarker) null));
                        }
                    }
                    FragmentActivity activity2 = c17818fTk.getActivity();
                    if (activity2 != null) {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("result_key_wallet_created_data", C13788dYh.copydefault(abstractC12782ctV));
                        Unit unit = Unit.INSTANCE;
                        activity2.setResult(-1, intent);
                    }
                    FragmentActivity activity3 = c17818fTk.getActivity();
                    if (activity3 != null) {
                        activity3.finish();
                    }
                }
            });
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.String str) {
            KWHzl(str);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.fTk$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C17818fTk copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C17818fTk c17818fTk) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = c17818fTk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                pUU.valueOf(this.copydefault.getTAG(), "accountId = " + this.copydefault.AEQbTJ().getAccountId());
                C32866mlf.onEvent$default("Web3WalletSmartAccountIntroductionPage_Button_Button_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                if (this.copydefault.AEQbTJ().isNeedToCreateNewAccount()) {
                    C52794wYp.startLoading$default(this.copydefault.EZpvd().copydefault, 0L, 1, null);
                    androidx.fragment.app.FragmentManager childFragmentManager = this.copydefault.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    new C14513dmq(childFragmentManager, "activeSAGuide", this.copydefault.new TaskDescription(), null).EZpvd();
                    return;
                }
                LifecycleOwner viewLifecycleOwner = this.copydefault.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ActivateSAGuideFragment$initView$4$2(this.copydefault, null), 3, null);
            }
        }
    }

    private final void copydefault() {
        LottieAnimationView lottieAnimationView = EZpvd().valueOf;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        C14677dpv.KWHzl(lottieAnimationView, CDNSourceManager.LottieSource.SACreateGuide);
        EZpvd().valueOf.cancelAnimation();
        EZpvd().valueOf.playAnimation();
    }
}
