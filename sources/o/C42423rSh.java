package o;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.DialogInformation;
import com.okinc.ok_kyc_core.data.remote.networkmodel.SelectPopUpAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.SelectPopUpChoice;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C42423rSh;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rSh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C42423rSh extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public AbstractC43980rzX EZpvd;
    public SelectPopUpAppModel KWHzl;
    public final C43316rmw OLrzqt = new C43316rmw();

    public C42423rSh() {
        final Function0 function0 = null;
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C42163rIr.class), new Function0<ViewModelStore>() { // from class: com.okinc.ok_kyc_core.presentation.views.kycConfirmation.SelectComplianceBottomSheet$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.ok_kyc_core.presentation.views.kycConfirmation.SelectComplianceBottomSheet$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.ok_kyc_core.presentation.views.kycConfirmation.SelectComplianceBottomSheet$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: renamed from: o.rSh$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rSh.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C42423rSh OLrzqt(@NotNull SelectPopUpAppModel selectPopUpAppModel) {
            Intrinsics.checkNotNullParameter(selectPopUpAppModel, "");
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("dialog", selectPopUpAppModel));
            C42423rSh c42423rSh = new C42423rSh();
            c42423rSh.setArguments(bundleBundleOf);
            return c42423rSh;
        }
    }

    private final C42163rIr EZpvd() {
        return (C42163rIr) this.AEQbTJ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(android.os.Bundle bundle) {
        SelectPopUpAppModel selectPopUpAppModel;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            android.os.Bundle arguments = getArguments();
            selectPopUpAppModel = arguments != null ? (SelectPopUpAppModel) arguments.getParcelable("dialog", SelectPopUpAppModel.class) : null;
        } else {
            android.os.Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                selectPopUpAppModel = (SelectPopUpAppModel) arguments2.getParcelable("dialog");
            }
        }
        this.KWHzl = selectPopUpAppModel;
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onHeaderCreated(c52781wYc);
        c52781wYc.setVisibility(8);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        java.lang.String title;
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.EZpvd().setVisibility(8);
        wxq.setStyle(3);
        wxq.AEQbTJ().setVisibility(0);
        wxq.AYXKKw().setTextSize(18.0f);
        ViewGroup.LayoutParams layoutParams = wxq.AYXKKw().getLayoutParams();
        layoutParams.width = -1;
        wxq.AYXKKw().setLayoutParams(layoutParams);
        wxq.AYXKKw().setGravity(1);
        SelectPopUpAppModel selectPopUpAppModel = this.KWHzl;
        if (selectPopUpAppModel == null || (title = selectPopUpAppModel.getTitle()) == null) {
            return;
        }
        wxq.setTitle(title);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.util.List<SelectPopUpChoice> choices;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        this.EZpvd = (AbstractC43980rzX) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.DBxZfM, constraintLayout, true);
        SelectPopUpAppModel selectPopUpAppModel = this.KWHzl;
        if (selectPopUpAppModel != null) {
            AbstractC43980rzX abstractC43980rzX = null;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) selectPopUpAppModel.getSubtitle())) {
                AbstractC43980rzX abstractC43980rzX2 = this.EZpvd;
                if (abstractC43980rzX2 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC43980rzX2 = null;
                }
                abstractC43980rzX2.KWHzl.setText(selectPopUpAppModel.getSubtitle());
            } else {
                AbstractC43980rzX abstractC43980rzX3 = this.EZpvd;
                if (abstractC43980rzX3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC43980rzX3 = null;
                }
                abstractC43980rzX3.KWHzl.setVisibility(8);
            }
            SelectPopUpAppModel selectPopUpAppModel2 = this.KWHzl;
            if (selectPopUpAppModel2 == null || (choices = selectPopUpAppModel2.getChoices()) == null) {
                return;
            }
            AbstractC43980rzX abstractC43980rzX4 = this.EZpvd;
            if (abstractC43980rzX4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC43980rzX = abstractC43980rzX4;
            }
            C31695mAm c31695mAm = abstractC43980rzX.AEQbTJ;
            c31695mAm.setLayoutManager(C33047mpA.KWHzl(c31695mAm.getContext()));
            android.content.Context context = c31695mAm.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c31695mAm.addItemDecoration(new Activity(context));
            c31695mAm.setAdapter(this.OLrzqt);
            this.OLrzqt.register(SelectPopUpChoice.class, new StateListAnimator(this, new Function1() { // from class: o.rSm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C42423rSh.OLrzqt(this.OLrzqt, (CTAButtonAppModel) obj);
                }
            }));
            this.OLrzqt.setItems(choices);
            this.OLrzqt.notifyDataSetChanged();
        }
    }

    public static final Unit OLrzqt(C42423rSh c42423rSh, CTAButtonAppModel cTAButtonAppModel) {
        java.lang.String id;
        if (cTAButtonAppModel != null) {
            MutableLiveData<C43734ruq<kotlin.Pair<CTAButtonAppModel, DialogInformation>>> mutableLiveDataKWHzl = c42423rSh.EZpvd().KWHzl();
            SelectPopUpAppModel selectPopUpAppModel = c42423rSh.KWHzl;
            if (selectPopUpAppModel == null || (id = selectPopUpAppModel.getId()) == null) {
                id = "";
            }
            mutableLiveDataKWHzl.setValue(new C43734ruq<>(new kotlin.Pair(cTAButtonAppModel, new DialogInformation(id, false, null, 4, null))));
        }
        c42423rSh.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.rSh$Activity */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Activity extends RecyclerView.ItemDecoration {
        public final android.content.Context EZpvd;

        public Activity(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            this.EZpvd = context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            if (recyclerView.getChildAdapterPosition(view) != 0) {
                rect.top = this.EZpvd.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.zuBGHE);
            }
        }
    }

    /* JADX INFO: renamed from: o.rSh$StateListAnimator */
    /* JADX INFO: loaded from: classes23.dex */
    public final class StateListAnimator extends AbstractC43310rmq<SelectPopUpChoice, AbstractC43992rzj> {
        public final Function1<CTAButtonAppModel, Unit> OLrzqt;
        public final /* synthetic */ C42423rSh copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C43662rtX.TaskDescription.UlJrfe;
        }

        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(@NotNull C42423rSh c42423rSh, Function1<? super CTAButtonAppModel, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = c42423rSh;
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC43992rzj> c43312rms, @NotNull final SelectPopUpChoice selectPopUpChoice) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(selectPopUpChoice, "");
            super.onBindViewHolder((C43312rms) c43312rms, selectPopUpChoice);
            android.widget.TextView textView = ((AbstractC43992rzj) c43312rms.OLrzqt()).valueOf;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            java.lang.String title = selectPopUpChoice.getTitle();
            textView.setVisibility((title == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) title)) ^ true ? 0 : 8);
            android.widget.TextView textView2 = ((AbstractC43992rzj) c43312rms.OLrzqt()).valueOf;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            if (textView2.getVisibility() == 0) {
                ((AbstractC43992rzj) c43312rms.OLrzqt()).valueOf.setText(selectPopUpChoice.getTitle());
            }
            android.widget.TextView textView3 = ((AbstractC43992rzj) c43312rms.OLrzqt()).OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            java.lang.String badge = selectPopUpChoice.getBadge();
            textView3.setVisibility((badge == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) badge)) ^ true ? 0 : 8);
            android.widget.TextView textView4 = ((AbstractC43992rzj) c43312rms.OLrzqt()).OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            if (textView4.getVisibility() == 0) {
                ((AbstractC43992rzj) c43312rms.OLrzqt()).OLrzqt.setText(selectPopUpChoice.getBadge());
            }
            java.lang.Integer numEZpvd = rQW.EZpvd(selectPopUpChoice.getImage(), TtmlNode.TAG_IMAGE);
            android.widget.ImageView imageView = ((AbstractC43992rzj) c43312rms.OLrzqt()).copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(numEZpvd != null ? 0 : 8);
            if (numEZpvd != null) {
                ((AbstractC43992rzj) c43312rms.OLrzqt()).copydefault.setImageResource(numEZpvd.intValue());
            }
            android.widget.TextView textView5 = ((AbstractC43992rzj) c43312rms.OLrzqt()).KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView5, "");
            java.lang.String subTitle = selectPopUpChoice.getSubTitle();
            textView5.setVisibility((subTitle == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) subTitle)) ^ true ? 0 : 8);
            android.widget.TextView textView6 = ((AbstractC43992rzj) c43312rms.OLrzqt()).KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView6, "");
            if (textView6.getVisibility() == 0) {
                ((AbstractC43992rzj) c43312rms.OLrzqt()).KWHzl.setText(selectPopUpChoice.getSubTitle());
            }
            ((AbstractC43992rzj) c43312rms.OLrzqt()).AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.rSp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C42423rSh.StateListAnimator.copydefault(this.EZpvd, selectPopUpChoice, view);
                }
            });
        }

        public static final void copydefault(StateListAnimator stateListAnimator, SelectPopUpChoice selectPopUpChoice, android.view.View view) {
            stateListAnimator.OLrzqt.invoke(selectPopUpChoice.getCta());
        }
    }
}
