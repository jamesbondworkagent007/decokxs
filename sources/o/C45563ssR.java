package o;

import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okex.feedback.FeedbackHistoryDetailFragment$initViewModel$1;
import com.okinc.okex.feedback.FeedbackHistoryDetailFragment$initViewModel$2;
import com.okinc.okex.feedback.FeedbackStatus;
import com.okinc.okex.feedback.net.bean.LoopholeResp;
import com.okinc.okex.feedback.net.bean.StatusInfo;
import com.okinc.okex.feedback.viewmodel.FeedbackListViewModel;
import java.util.Date;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C47315tni;
import o.C52761wXj;
import o.InterfaceC8224ayh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ssR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45563ssR extends wXX {
    public final InterfaceC56387yDm AEQbTJ;
    public AbstractC47379tot EZpvd;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.ssW
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C45563ssR.djBIcL(this.copydefault));
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.ssU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C45563ssR.AYXKKw(this.copydefault));
        }
    });
    public int copydefault = -1;

    /* JADX INFO: renamed from: o.ssR$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[FeedbackStatus.values().length];
            try {
                iArr[FeedbackStatus.ALL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[FeedbackStatus.SUBMITTED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[FeedbackStatus.PENDING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[FeedbackStatus.DECLINED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[FeedbackStatus.REVIEWING_FEEDBACK.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[FeedbackStatus.REVIEWING_BUG.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[FeedbackStatus.PENDING_YOUR_APPROVAL.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[FeedbackStatus.TO_BE_REWARDED.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[FeedbackStatus.REWARDED.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[FeedbackStatus.YOU_REJECTED_THE_RESULT.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            KWHzl = iArr;
        }
    }

    public C45563ssR() {
        final Function0 function0 = null;
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(FeedbackListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.feedback.FeedbackHistoryDetailFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.feedback.FeedbackHistoryDetailFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.feedback.FeedbackHistoryDetailFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FeedbackListViewModel OLrzqt() {
        return (FeedbackListViewModel) this.AEQbTJ.getValue();
    }

    private final boolean djBIcL() {
        return ((java.lang.Boolean) this.OLrzqt.getValue()).booleanValue();
    }

    public static final boolean djBIcL(C45563ssR c45563ssR) {
        android.os.Bundle arguments = c45563ssR.getArguments();
        return arguments != null && arguments.getInt("type") == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int AEQbTJ() {
        return ((java.lang.Number) this.KWHzl.getValue()).intValue();
    }

    public static final int AYXKKw(C45563ssR c45563ssR) {
        android.os.Bundle arguments = c45563ssR.getArguments();
        if (arguments != null) {
            return arguments.getInt("id");
        }
        return 0;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        if (djBIcL()) {
            strAYXKKw = C33070mpX.AYXKKw(C47315tni.PendingIntent.DGUQLIdZmdUa);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C47315tni.PendingIntent.zAEkPU);
        }
        wxq.setTitle(strAYXKKw);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AbstractC47379tot abstractC47379totAEQbTJ = AbstractC47379tot.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        Intrinsics.checkNotNullExpressionValue(abstractC47379totAEQbTJ, "");
        this.EZpvd = abstractC47379totAEQbTJ;
        copydefault();
    }

    public final void copydefault() {
        AbstractC47379tot abstractC47379tot = this.EZpvd;
        if (abstractC47379tot != null) {
            C52794wYp c52794wYp = abstractC47379tot.valueOf;
            c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
            C52794wYp c52794wYp2 = abstractC47379tot.copydefault;
            c52794wYp2.setOnClickListener(new StateListAnimator(c52794wYp2, 1000L, this));
            android.widget.TextView textView = abstractC47379tot.gEmmrt;
            textView.setOnClickListener(new LoaderManager(textView, 1000L, this));
        }
        EZpvd();
    }

    /* JADX INFO: renamed from: o.ssR$TaskDescription */
    public static final class TaskDescription implements Function1<EventParamsList, Unit> {
        public static final TaskDescription EZpvd = new TaskDescription();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            copydefault(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void copydefault(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("origin", "Detail page", true);
        }
    }

    /* JADX INFO: renamed from: o.ssR$Activity */
    public static final class Activity implements Function1<EventParamsList, Unit> {
        public static final Activity OLrzqt = new Activity();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            KWHzl(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void KWHzl(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("origin", "Detail page", true);
        }
    }

    private final void EZpvd() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new FeedbackHistoryDetailFragment$initViewModel$1(this, null));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FeedbackHistoryDetailFragment$initViewModel$2(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void valueOf() {
        dismissAllowingStateLoss();
        android.os.Bundle bundle = new android.os.Bundle(getArguments());
        C45625sta c45625sta = new C45625sta();
        c45625sta.setArguments(bundle);
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        c45625sta.show(parentFragmentManager, C45625sta.class.getSimpleName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl() {
        dismissAllowingStateLoss();
        android.os.Bundle bundle = new android.os.Bundle(getArguments());
        C45576sse c45576sse = new C45576sse();
        c45576sse.setArguments(bundle);
        c45576sse.show(getParentFragmentManager(), C45576sse.class.getSimpleName());
    }

    public final void KWHzl(LoopholeResp loopholeResp) {
        AbstractC47379tot abstractC47379tot = this.EZpvd;
        if (abstractC47379tot != null) {
            abstractC47379tot.djBIcL.setText(loopholeResp.getMainCategoryName());
            abstractC47379tot.AEQbTJ.setText(loopholeResp.getChildName());
            abstractC47379tot.fetchVPNInfo.setText(loopholeResp.getTitle());
            abstractC47379tot.OLrzqt.setText(loopholeResp.getContent());
            FeedbackStatus feedbackStatusEZpvd = FeedbackStatus.Companion.EZpvd(loopholeResp.getStatus());
            if (feedbackStatusEZpvd != null) {
                abstractC47379tot.AYXKKw.setText(C33070mpX.AYXKKw(feedbackStatusEZpvd.getText()));
                abstractC47379tot.AYXKKw.setTextColor(C33070mpX.copydefault(feedbackStatusEZpvd.getColor()));
                android.widget.TextView textView = abstractC47379tot.AYXKKw;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(C33070mpX.copydefault(feedbackStatusEZpvd.getBg()));
                float fDp2pxFloat$default = C55298xhM.dp2pxFloat$default(4.0f, null, 1, null);
                gradientDrawable.setCornerRadii(new float[]{fDp2pxFloat$default, fDp2pxFloat$default, fDp2pxFloat$default, fDp2pxFloat$default, fDp2pxFloat$default, fDp2pxFloat$default, fDp2pxFloat$default, fDp2pxFloat$default});
                textView.setBackground(gradientDrawable);
                onEvent(feedbackStatusEZpvd);
            }
            abstractC47379tot.EZpvd.setText(loopholeResp.getAuditContent());
            android.widget.TextView textView2 = abstractC47379tot.EZpvd;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            C33054mpH.setBooleanVisibility$default(textView2, C33129mqd.OLrzqt((java.lang.CharSequence) loopholeResp.getAuditContent()), false, 2, null);
            java.util.ArrayList<StatusInfo> statusInfo = loopholeResp.getStatusInfo();
            if (statusInfo != null) {
                int i = 0;
                for (java.lang.Object obj : statusInfo) {
                    if (i < 0) {
                        yDY.AYXKKw();
                    }
                    if (Intrinsics.EZpvd(((StatusInfo) obj).getVaild(), java.lang.Boolean.TRUE)) {
                        this.copydefault = i;
                    }
                    i++;
                }
            }
            android.widget.TextView textView3 = abstractC47379tot.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            C33054mpH.setBooleanVisibility$default(textView3, loopholeResp.getStatus() == 8, false, 2, null);
            java.lang.CharSequence text = abstractC47379tot.gEmmrt.getText();
            abstractC47379tot.gEmmrt.setText(text != null ? C33061mpO.setupSpanStyles$default(text, new java.lang.String[]{text.toString()}, 0, null, false, new Function1() { // from class: o.ssT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C45563ssR.EZpvd(this.EZpvd, (java.util.List) obj2);
                }
            }, 14, null) : null);
            abstractC47379tot.gEmmrt.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            android.widget.LinearLayout linearLayout = abstractC47379tot.KWHzl;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            C33054mpH.setBooleanVisibility$default(linearLayout, loopholeResp.getStatus() == 6, false, 2, null);
            java.util.ArrayList<StatusInfo> statusInfo2 = loopholeResp.getStatusInfo();
            if (statusInfo2 != null) {
                OLrzqt(statusInfo2);
            }
        }
    }

    /* JADX INFO: renamed from: o.ssR$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C45563ssR copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C45563ssR c45563ssR) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = c45563ssR;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.valueOf();
                C32866mlf.EZpvd("app_support_feedback_reject_click", new TrackChannel[]{TrackChannel.All}, TaskDescription.EZpvd);
            }
        }
    }

    /* JADX INFO: renamed from: o.ssR$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C45563ssR OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C45563ssR c45563ssR) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = c45563ssR;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                InterfaceC8224ayh interfaceC8224ayh = (InterfaceC8224ayh) C43251rlk.copydefault(InterfaceC8224ayh.class);
                android.content.Context contextRequireContext = this.OLrzqt.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                InterfaceC8224ayh.TaskDescription.goToFundingHistory$default(interfaceC8224ayh, contextRequireContext, null, null, 6, null);
                C32866mlf.onEvent$default("app_support_feedback_view_wallet_click", new TrackChannel[]{TrackChannel.All}, (Function1) null, 2, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: o.ssR$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C45563ssR EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C45563ssR c45563ssR) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = c45563ssR;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.KWHzl();
                C32866mlf.EZpvd("app_support_feedback_approve_click", new TrackChannel[]{TrackChannel.All}, Activity.OLrzqt);
            }
        }
    }

    public static final Unit EZpvd(final C45563ssR c45563ssR, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.UnderlineSpan() { // from class: com.okinc.okex.feedback.FeedbackHistoryDetailFragment$refreshView$1$3$1
            @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                Intrinsics.checkNotNullParameter(textPaint, "");
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(true);
                textPaint.setColor(ContextCompat.getColor(this.copydefault.requireContext(), C52761wXj.Activity.hvKCwS));
            }
        });
        return Unit.INSTANCE;
    }

    public final void OLrzqt(java.util.ArrayList<StatusInfo> arrayList) {
        RecyclerView recyclerView;
        AbstractC47379tot abstractC47379tot = this.EZpvd;
        if (abstractC47379tot == null || (recyclerView = abstractC47379tot.AhwBna) == null) {
            return;
        }
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(StatusInfo.class, new FragmentManager(arrayList));
        c59534zip.setItems(arrayList);
        recyclerView.setAdapter(c59534zip);
    }

    /* JADX INFO: renamed from: o.ssR$FragmentManager */
    public static final class FragmentManager extends AbstractC59533zio<StatusInfo, RecyclerView.ViewHolder> {
        public final /* synthetic */ java.util.ArrayList<StatusInfo> AEQbTJ;

        public FragmentManager(java.util.ArrayList<StatusInfo> arrayList) {
            this.AEQbTJ = arrayList;
        }

        /* JADX INFO: renamed from: o.ssR$FragmentManager$Activity */
        public static final class Activity extends RecyclerView.ViewHolder {
            public Activity(android.view.View view) {
                super(view);
            }
        }

        @Override // o.AbstractC59533zio
        public RecyclerView.ViewHolder onCreateViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            return new Activity(layoutInflater.inflate(C47315tni.ActionBar.hUfVAv, viewGroup, false));
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, StatusInfo statusInfo) {
            int i;
            java.lang.String strValueOf;
            int i2;
            Intrinsics.checkNotNullParameter(viewHolder, "");
            Intrinsics.checkNotNullParameter(statusInfo, "");
            boolean z = C45563ssR.this.copydefault == -1 || viewHolder.getAbsoluteAdapterPosition() < C45563ssR.this.copydefault;
            if (z) {
                i = C47315tni.Application.KWHzl;
                strValueOf = "";
                i2 = 0;
            } else if (viewHolder.getAbsoluteAdapterPosition() > C45563ssR.this.copydefault) {
                i = C47315tni.Application.fJNWhG;
                strValueOf = java.lang.String.valueOf(viewHolder.getAbsoluteAdapterPosition() + 1);
                i2 = C52761wXj.Activity.Dff;
            } else {
                i = C47315tni.Application.AuCTel;
                strValueOf = java.lang.String.valueOf(viewHolder.getAbsoluteAdapterPosition() + 1);
                i2 = C52761wXj.Activity.DGgkXd;
            }
            android.widget.TextView textView = (android.widget.TextView) viewHolder.itemView.findViewById(C47315tni.TaskDescription.hrNTAI);
            textView.setBackground(C33070mpX.KWHzl(i));
            textView.setText(strValueOf);
            if (i2 != 0) {
                textView.setTextColor(C33070mpX.copydefault(i2));
            }
            android.view.View viewFindViewById = viewHolder.itemView.findViewById(C47315tni.TaskDescription.sTzBva);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            C33054mpH.setBooleanVisibility$default(viewFindViewById, z && viewHolder.getAbsoluteAdapterPosition() != this.AEQbTJ.size() - 1, false, 2, null);
            android.view.View viewFindViewById2 = viewHolder.itemView.findViewById(C47315tni.TaskDescription.swzYdv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            C33054mpH.setBooleanVisibility$default(viewFindViewById2, (z || viewHolder.getAbsoluteAdapterPosition() == this.AEQbTJ.size() - 1) ? false : true, false, 2, null);
            ((android.widget.TextView) viewHolder.itemView.findViewById(C47315tni.TaskDescription.ggKfIT)).setText(statusInfo.getName());
            ((android.widget.TextView) viewHolder.itemView.findViewById(C47315tni.TaskDescription.ROgMPW)).setText(statusInfo.getUpdateDate() == null ? "-" : pTA.formatSimpleDate$default(new Date(statusInfo.getUpdateDate().longValue()), null, 1, null));
        }
    }

    public final void onEvent(FeedbackStatus feedbackStatus) {
        final java.lang.String str;
        switch (ActionBar.KWHzl[feedbackStatus.ordinal()]) {
            case 1:
            case 7:
                str = "";
                break;
            case 2:
                str = "Submitted";
                break;
            case 3:
                str = "Pending review";
                break;
            case 4:
                str = "Declined";
                break;
            case 5:
                str = "Pending your approval";
                break;
            case 6:
                str = "Reviewing bug";
                break;
            case 8:
                str = "To be rewarded";
                break;
            case 9:
                str = "Rewarded";
                break;
            case 10:
                str = "You rejected the result";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (djBIcL()) {
            C32866mlf.EZpvd("app_support_feedback_details_view", new TrackChannel[]{TrackChannel.All}, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ssX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45563ssR.EZpvd(str, (EventParamsList) obj);
                }
            });
        } else {
            C32866mlf.EZpvd("app_support_security_bug_details_view", new TrackChannel[]{TrackChannel.All}, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ssV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45563ssR.AEQbTJ(str, (EventParamsList) obj);
                }
            });
        }
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("status", str, true);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("status", str, true);
        return Unit.INSTANCE;
    }
}
