package com.okinc.ok_kyc_core.presentation.loading;

import android.view.View;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FormAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ProcessingAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ResultAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.SelectWalletVerificationAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.VirtualActionAppModel;
import com.okinc.ok_kyc_core.presentation.loading.LoadingFragment$onActivityCreated$4;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC42074rFj;
import o.AbstractC43849rwz;
import o.ActivityC42162rIq;
import o.C42165rIt;
import o.C43700ruI;
import o.C43733rup;
import o.C43734ruq;
import o.C43961rzE;
import o.C43963rzG;
import o.C52794wYp;
import o.C55296xhK;
import o.C56391yDq;
import o.C56442yFn;
import o.rIB;

/* JADX INFO: loaded from: classes23.dex */
public final class LoadingFragment$onActivityCreated$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C42165rIt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingFragment$onActivityCreated$4(C42165rIt c42165rIt, Continuation<? super LoadingFragment$onActivityCreated$4> continuation) {
        super(2, continuation);
        this.this$0 = c42165rIt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LoadingFragment$onActivityCreated$4(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LoadingFragment$onActivityCreated$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C43700ruI EZpvd;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ C42165rIt copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(View view, long j, C42165rIt c42165rIt, C43700ruI c43700ruI) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = c42165rIt;
            this.EZpvd = c43700ruI;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                FragmentActivity activity = this.copydefault.getActivity();
                if (activity != null) {
                    rIB ribFetchVPNInfo = this.copydefault.fetchVPNInfo();
                    PageComponentAppModel viewModel = this.EZpvd.OLrzqt().getViewModel();
                    String strKWHzl = this.EZpvd.KWHzl();
                    HashMap<String, String> mapEZpvd = this.EZpvd.EZpvd();
                    FragmentManager childFragmentManager = this.copydefault.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    AbstractC42074rFj.navigatePopUpAction$default(ribFetchVPNInfo, viewModel, activity, childFragmentManager, strKWHzl, mapEZpvd, null, 32, null);
                }
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            LiveData<C43734ruq<Pair<C43700ruI, C52794wYp>>> liveDataFetchVPNInfo = this.this$0.fetchVPNInfo().fetchVPNInfo();
            LifecycleOwner viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            final C42165rIt c42165rIt = this.this$0;
            C43733rup.copydefault(liveDataFetchVPNInfo, viewLifecycleOwner, new Function1() { // from class: o.rIC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return LoadingFragment$onActivityCreated$4.invokeSuspend$lambda$6(c42165rIt, (C43734ruq) obj2);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$6(C42165rIt c42165rIt, C43734ruq c43734ruq) {
        C43961rzE c43961rzE;
        LinearLayoutCompat root;
        PageComponentProfile pageComponentProfile;
        C43961rzE c43961rzE2;
        C52794wYp c52794wYp;
        C43961rzE c43961rzE3;
        TextView textView;
        String subtitle;
        C43961rzE c43961rzE4;
        TextView textView2;
        String title;
        C43961rzE c43961rzE5;
        LinearLayoutCompat root2;
        Integer maxLevel;
        C43961rzE c43961rzE6;
        LinearLayoutCompat root3;
        C43963rzG c43963rzG;
        FrameLayout root4;
        Pair pair = (Pair) c43734ruq.EZpvd();
        if (pair != null) {
            AbstractC43849rwz abstractC43849rwzAEQbTJ = c42165rIt.AEQbTJ();
            if (abstractC43849rwzAEQbTJ != null && (c43963rzG = abstractC43849rwzAEQbTJ.copydefault) != null && (root4 = c43963rzG.getRoot()) != null) {
                root4.setVisibility(8);
            }
            C43700ruI c43700ruI = (C43700ruI) pair.getFirst();
            if (c43700ruI.OLrzqt().getOnDemandFeatureFlagEnabled()) {
                AbstractC43849rwz abstractC43849rwzAEQbTJ2 = c42165rIt.AEQbTJ();
                if (abstractC43849rwzAEQbTJ2 != null && (c43961rzE6 = abstractC43849rwzAEQbTJ2.OLrzqt) != null && (root3 = c43961rzE6.getRoot()) != null) {
                    root3.setVisibility(8);
                }
                c42165rIt.KWHzl().OLrzqt(c43700ruI.OLrzqt().getViewModel());
                PageComponentProfile profile = c43700ruI.OLrzqt().getProfile();
                if (profile != null) {
                    if (profile.getMaxLevel() == null || ((maxLevel = profile.getMaxLevel()) != null && maxLevel.intValue() == -1)) {
                        profile = null;
                    }
                    pageComponentProfile = profile;
                } else {
                    pageComponentProfile = null;
                }
                c42165rIt.KWHzl().ejfBZ();
                c42165rIt.KWHzl().KWHzl(c43700ruI.KWHzl());
                c42165rIt.KWHzl().AEQbTJ(c43700ruI.EZpvd());
                PageComponentAppModel viewModel = c43700ruI.OLrzqt().getViewModel();
                if (viewModel instanceof FormAppModel) {
                    AbstractC42074rFj.navigateToFormPage$default(c42165rIt.fetchVPNInfo(), c43700ruI.OLrzqt().getViewModel(), c43700ruI.KWHzl(), c43700ruI.EZpvd(), pageComponentProfile, null, 16, null);
                } else if (viewModel instanceof ResultAppModel) {
                    AbstractC42074rFj.navigateToResultPage$default(c42165rIt.fetchVPNInfo(), c43700ruI.OLrzqt().getViewModel(), c43700ruI.KWHzl(), c43700ruI.EZpvd(), pageComponentProfile, null, 16, null);
                } else if (viewModel instanceof SelectWalletVerificationAppModel) {
                    AbstractC42074rFj.navigateToSelectWalletVerificationPage$default(c42165rIt.fetchVPNInfo(), c43700ruI.OLrzqt().getViewModel(), c43700ruI.KWHzl(), c43700ruI.EZpvd(), pageComponentProfile, null, 16, null);
                } else if (viewModel instanceof ProcessingAppModel) {
                    if (c42165rIt.getActivity() != null) {
                        AbstractC42074rFj.navigateToProcessingPage$default(c42165rIt.fetchVPNInfo(), c43700ruI.OLrzqt().getViewModel(), c43700ruI.KWHzl(), c43700ruI.AEQbTJ(), c43700ruI.EZpvd(), pageComponentProfile, null, 32, null);
                    }
                } else if (viewModel instanceof VirtualActionAppModel) {
                    AbstractC42074rFj.navigateVirtualAction$default(c42165rIt.fetchVPNInfo(), c43700ruI.OLrzqt().getViewModel(), null, c43700ruI.KWHzl(), ActivityC42162rIq.Companion.EZpvd(c43700ruI.KWHzl()), c43700ruI.EZpvd(), c42165rIt.KWHzl().OLrzqt(), c42165rIt.requireActivity(), Boolean.TRUE, null, 256, null);
                } else if (viewModel instanceof PopUpAppModel) {
                    AbstractC43849rwz abstractC43849rwzAEQbTJ3 = c42165rIt.AEQbTJ();
                    if (abstractC43849rwzAEQbTJ3 != null && (c43961rzE5 = abstractC43849rwzAEQbTJ3.OLrzqt) != null && (root2 = c43961rzE5.getRoot()) != null) {
                        root2.setVisibility(0);
                    }
                    PageComponentAppModel viewModel2 = c43700ruI.OLrzqt().getViewModel();
                    AbstractC43849rwz abstractC43849rwzAEQbTJ4 = c42165rIt.AEQbTJ();
                    if (abstractC43849rwzAEQbTJ4 != null && (c43961rzE4 = abstractC43849rwzAEQbTJ4.OLrzqt) != null && (textView2 = c43961rzE4.AEQbTJ) != null) {
                        if (viewModel2 == null || (title = viewModel2.getTitle()) == null) {
                            title = "";
                        }
                        textView2.setText(title);
                    }
                    AbstractC43849rwz abstractC43849rwzAEQbTJ5 = c42165rIt.AEQbTJ();
                    if (abstractC43849rwzAEQbTJ5 != null && (c43961rzE3 = abstractC43849rwzAEQbTJ5.OLrzqt) != null && (textView = c43961rzE3.copydefault) != null) {
                        if (viewModel2 == null || (subtitle = viewModel2.getSubtitle()) == null) {
                            subtitle = "";
                        }
                        textView.setText(subtitle);
                    }
                    AbstractC43849rwz abstractC43849rwzAEQbTJ6 = c42165rIt.AEQbTJ();
                    if (abstractC43849rwzAEQbTJ6 != null && (c43961rzE2 = abstractC43849rwzAEQbTJ6.OLrzqt) != null && (c52794wYp = c43961rzE2.KWHzl) != null) {
                        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, c42165rIt, c43700ruI));
                    }
                    FragmentActivity activity = c42165rIt.getActivity();
                    if (activity != null) {
                        rIB ribFetchVPNInfo = c42165rIt.fetchVPNInfo();
                        PageComponentAppModel viewModel3 = c43700ruI.OLrzqt().getViewModel();
                        String strKWHzl = c43700ruI.KWHzl();
                        HashMap<String, String> mapEZpvd = c43700ruI.EZpvd();
                        FragmentManager childFragmentManager = c42165rIt.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                        AbstractC42074rFj.navigatePopUpAction$default(ribFetchVPNInfo, viewModel3, activity, childFragmentManager, strKWHzl, mapEZpvd, null, 32, null);
                    }
                } else {
                    c42165rIt.KWHzl().AuCTel();
                }
            } else {
                AbstractC43849rwz abstractC43849rwzAEQbTJ7 = c42165rIt.AEQbTJ();
                if (abstractC43849rwzAEQbTJ7 != null && (c43961rzE = abstractC43849rwzAEQbTJ7.OLrzqt) != null && (root = c43961rzE.getRoot()) != null) {
                    root.setVisibility(0);
                }
                c42165rIt.KWHzl().AuCTel();
            }
        }
        return Unit.INSTANCE;
    }
}
