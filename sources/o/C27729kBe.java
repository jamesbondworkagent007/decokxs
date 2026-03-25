package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.business.market.features.vibes.ui.VibesKolUiModel;
import com.okinc.localization.util.format.DisplaySign;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C22366hdx;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kBe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27729kBe extends androidx.recyclerview.widget.ListAdapter<VibesKolUiModel, TaskDescription> {
    public final Function1<VibesKolUiModel, Unit> AEQbTJ;
    public final Function1<VibesKolUiModel, Unit> KWHzl;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C27729kBe() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r2v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r3v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.vibes.ui.VibesKolUiModel, kotlin.Unit>, kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.vibes.ui.VibesKolUiModel, kotlin.Unit>):void (m)] (LINE:34) call: o.kBe.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C27729kBe(Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : function12);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.vibes.ui.VibesKolUiModel, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.vibes.ui.VibesKolUiModel, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C27729kBe(Function1<? super VibesKolUiModel, Unit> function1, Function1<? super VibesKolUiModel, Unit> function12) {
        super(new C27747kBw());
        this.KWHzl = function1;
        this.AEQbTJ = function12;
    }

    public final void OLrzqt(boolean z) {
        if (z != this.copydefault) {
            this.copydefault = z;
            notifyItemRangeChanged(0, getItemCount());
        }
    }

    /* JADX INFO: renamed from: o.kBe$TaskDescription */
    public final class TaskDescription extends kLN<VibesKolUiModel> {
        public final /* synthetic */ C27729kBe AEQbTJ;
        public final C22325hdI copydefault;

        /* JADX WARN: Illegal instructions before constructor call */
        public TaskDescription(@NotNull C27729kBe c27729kBe, C22325hdI c22325hdI) {
            Intrinsics.checkNotNullParameter(c22325hdI, "");
            this.AEQbTJ = c27729kBe;
            LinearLayoutCompat root = c22325hdI.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(root);
            this.copydefault = c22325hdI;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;)V */
        @Override // o.kLN
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(@NotNull VibesKolUiModel vibesKolUiModel) {
            int iTradeRiseDefault$default;
            Intrinsics.checkNotNullParameter(vibesKolUiModel, "");
            C22325hdI c22325hdI = this.copydefault;
            C27729kBe c27729kBe = this.AEQbTJ;
            AppCompatImageView appCompatImageView = c22325hdI.EZpvd;
            appCompatImageView.setOnClickListener(new Application(appCompatImageView, 1000L, c27729kBe, vibesKolUiModel));
            AppCompatTextView appCompatTextView = c22325hdI.AYXKKw;
            appCompatTextView.setOnClickListener(new ActionBar(appCompatTextView, 1000L, c27729kBe, vibesKolUiModel));
            c22325hdI.AYXKKw.setText(vibesKolUiModel.gEmmrt());
            c22325hdI.AhwBna.setText(C23319hvw.getFormattedNumberICU$default(vibesKolUiModel.AYXKKw(), null, null, null, null, false, false, 63, null));
            AppCompatImageView appCompatImageView2 = c22325hdI.EZpvd;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
            C25386ivj.KWHzl(appCompatImageView2, vibesKolUiModel.AhwBna(), new C25385ivi(C33070mpX.KWHzl(C22366hdx.Application.copydefault), null, 0.0f, 0, 10, null));
            c22325hdI.KWHzl.setText(vibesKolUiModel.OLrzqt().length() == 0 ? "--" : C23319hvw.getFormattedNumberICU$default(vibesKolUiModel.OLrzqt(), null, null, null, null, false, false, 63, null));
            c22325hdI.gEmmrt.setText(vibesKolUiModel.AEQbTJ().length() != 0 ? kLY.formatPercentage$default(vibesKolUiModel.AEQbTJ(), DisplaySign.EXCEPT_ZERO, false, null, null, 14, null) : "--");
            android.widget.TextView textView = c22325hdI.gEmmrt;
            if (C33129mqd.OLrzqt((java.lang.Object) vibesKolUiModel.AEQbTJ(), (java.lang.Object) 0)) {
                iTradeRiseDefault$default = C25382ivf.KWHzl(C52761wXj.Activity.QwvEab);
            } else if (C23313hvq.KWHzl(vibesKolUiModel.AEQbTJ(), 0)) {
                C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                android.content.Context context = c22325hdI.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                iTradeRiseDefault$default = C33512mxp.tradeFallDefault$default(c33512mxp, context, 0.0f, 2, null);
            } else {
                C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
                android.content.Context context2 = c22325hdI.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                iTradeRiseDefault$default = C33512mxp.tradeRiseDefault$default(c33512mxp2, context2, 0.0f, 2, null);
            }
            textView.setTextColor(iTradeRiseDefault$default);
        }

        /* JADX INFO: renamed from: o.kBe$TaskDescription$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ C27729kBe OLrzqt;
            public final /* synthetic */ VibesKolUiModel copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, C27729kBe c27729kBe, VibesKolUiModel vibesKolUiModel) {
                this.EZpvd = view;
                this.KWHzl = j;
                this.OLrzqt = c27729kBe;
                this.copydefault = vibesKolUiModel;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    Function1 function1 = this.OLrzqt.KWHzl;
                    if (function1 != null) {
                        function1.invoke(this.copydefault);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: o.kBe$TaskDescription$Application */
        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ C27729kBe KWHzl;
            public final /* synthetic */ VibesKolUiModel OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, C27729kBe c27729kBe, VibesKolUiModel vibesKolUiModel) {
                this.AEQbTJ = view;
                this.copydefault = j;
                this.KWHzl = c27729kBe;
                this.OLrzqt = vibesKolUiModel;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    Function1 function1 = this.KWHzl.KWHzl;
                    if (function1 != null) {
                        function1.invoke(this.OLrzqt);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C22325hdI c22325hdIEZpvd = C22325hdI.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c22325hdIEZpvd, "");
        return new TaskDescription(this, c22325hdIEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, int i) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        VibesKolUiModel item = getItem(i);
        Intrinsics.checkNotNullExpressionValue(item, "");
        taskDescription.EZpvd(item);
    }
}
