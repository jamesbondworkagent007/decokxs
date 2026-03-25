package o;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.core.ktx.MatchPattern;
import com.okinc.okex.center.bean.enums.CategorySlug;
import com.okinc.okex.search.ui.displaymodels.SearchArticleDisplayModel;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C44047sBj;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sBj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C44047sBj extends AbstractC45381soi<SearchArticleDisplayModel, TaskDescription> {
    public java.lang.String AEQbTJ;
    public final CategorySlug OLrzqt;
    public ActionBar copydefault;

    /* JADX INFO: renamed from: o.sBj$ActionBar */
    /* JADX INFO: loaded from: classes16.dex */
    public interface ActionBar {
        void KWHzl(@NotNull SearchArticleDisplayModel searchArticleDisplayModel, int i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.copydefault = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.String str) {
        this.AEQbTJ = str;
    }

    public C44047sBj(@NotNull CategorySlug categorySlug) {
        Intrinsics.checkNotNullParameter(categorySlug, "");
        this.OLrzqt = categorySlug;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC45381soi
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean KWHzl(@NotNull SearchArticleDisplayModel searchArticleDisplayModel, @NotNull SearchArticleDisplayModel searchArticleDisplayModel2) {
        Intrinsics.checkNotNullParameter(searchArticleDisplayModel, "");
        Intrinsics.checkNotNullParameter(searchArticleDisplayModel2, "");
        return Intrinsics.EZpvd((java.lang.Object) searchArticleDisplayModel.getSlug(), (java.lang.Object) searchArticleDisplayModel2.getSlug());
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC45381soi
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean copydefault(@NotNull SearchArticleDisplayModel searchArticleDisplayModel, @NotNull SearchArticleDisplayModel searchArticleDisplayModel2) {
        Intrinsics.checkNotNullParameter(searchArticleDisplayModel, "");
        Intrinsics.checkNotNullParameter(searchArticleDisplayModel2, "");
        return Intrinsics.EZpvd((java.lang.Object) searchArticleDisplayModel.getTitle(), (java.lang.Object) searchArticleDisplayModel2.getTitle()) && Intrinsics.EZpvd((java.lang.Object) searchArticleDisplayModel.getUrl(), (java.lang.Object) searchArticleDisplayModel2.getUrl()) && searchArticleDisplayModel.getPublishTime() == searchArticleDisplayModel2.getPublishTime() && searchArticleDisplayModel.getUpdateTime() == searchArticleDisplayModel2.getUpdateTime() && searchArticleDisplayModel.getOkxLikesNums() == searchArticleDisplayModel2.getOkxLikesNums() && Intrinsics.EZpvd((java.lang.Object) searchArticleDisplayModel.getCategoryName(), (java.lang.Object) searchArticleDisplayModel2.getCategoryName()) && searchArticleDisplayModel.getCategorySlug() == searchArticleDisplayModel2.getCategorySlug();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC47402tpP abstractC47402tpPOLrzqt = AbstractC47402tpP.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC47402tpPOLrzqt, "");
        return new Application(this, abstractC47402tpPOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, int i) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        if (taskDescription instanceof StateListAnimator) {
            SearchArticleDisplayModel searchArticleDisplayModel = copydefault().getCurrentList().get(i);
            Intrinsics.checkNotNullExpressionValue(searchArticleDisplayModel, "");
            ((StateListAnimator) taskDescription).KWHzl(searchArticleDisplayModel);
        } else if (taskDescription instanceof Application) {
            SearchArticleDisplayModel searchArticleDisplayModel2 = copydefault().getCurrentList().get(i);
            Intrinsics.checkNotNullExpressionValue(searchArticleDisplayModel2, "");
            ((Application) taskDescription).KWHzl(searchArticleDisplayModel2);
        }
    }

    /* JADX INFO: renamed from: o.sBj$TaskDescription */
    public static abstract class TaskDescription extends RecyclerView.ViewHolder {
        public final int OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull ViewDataBinding viewDataBinding) {
            super(viewDataBinding.getRoot());
            Intrinsics.checkNotNullParameter(viewDataBinding, "");
            this.OLrzqt = C33070mpX.copydefault(C52761wXj.Activity.fkESqH);
        }

        public final java.lang.CharSequence EZpvd(java.lang.String str, java.lang.String str2) {
            return (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || str2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2) || !StringsKt__StringsKt.AhwBna((java.lang.CharSequence) str2, (java.lang.CharSequence) str, true)) ? str2 : C33061mpO.setupSpanStyles$default(str2, new java.lang.String[]{str}, 0, MatchPattern.CONTAINS, true, new Function1() { // from class: o.sBh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C44047sBj.TaskDescription.OLrzqt(this.EZpvd, (java.util.List) obj);
                }
            }, 2, null);
        }

        public static final Unit OLrzqt(TaskDescription taskDescription, java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            list.add(new android.text.style.BackgroundColorSpan(taskDescription.OLrzqt));
            list.add(new android.text.style.ForegroundColorSpan(ViewCompat.MEASURED_STATE_MASK));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.sBj$Application */
    public final class Application extends TaskDescription {
        public final AbstractC47402tpP AEQbTJ;
        public final /* synthetic */ C44047sBj KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C44047sBj c44047sBj, AbstractC47402tpP abstractC47402tpP) {
            super(abstractC47402tpP);
            Intrinsics.checkNotNullParameter(abstractC47402tpP, "");
            this.KWHzl = c44047sBj;
            this.AEQbTJ = abstractC47402tpP;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void KWHzl(@NotNull SearchArticleDisplayModel searchArticleDisplayModel) {
            long publishTime;
            int i;
            java.lang.String string;
            Intrinsics.checkNotNullParameter(searchArticleDisplayModel, "");
            AbstractC47402tpP abstractC47402tpP = this.AEQbTJ;
            C44047sBj c44047sBj = this.KWHzl;
            C55258xgZ c55258xgZ = abstractC47402tpP.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55258xgZ, "");
            C45391sos.AEQbTJ(c55258xgZ);
            abstractC47402tpP.AEQbTJ.setTextValue(EZpvd(c44047sBj.AEQbTJ, searchArticleDisplayModel.getTitle()));
            if (searchArticleDisplayModel.getCategorySlug() != CategorySlug.Announcement) {
                publishTime = searchArticleDisplayModel.getUpdateTime();
            } else {
                publishTime = searchArticleDisplayModel.getPublishTime();
            }
            Date date = new Date(publishTime * ((long) 1000));
            android.widget.TextView textView = abstractC47402tpP.EZpvd;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            abstractC47402tpP.EZpvd.setText(pTA.formatStandardDate$default(date, null, 1, null));
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(searchArticleDisplayModel.getOkxLikesNums());
            if (numValueOf.intValue() <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null && (string = numValueOf.toString()) != null) {
                android.widget.TextView textView2 = abstractC47402tpP.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(0);
                abstractC47402tpP.OLrzqt.setText(pTB.formatLocalized$default(string, null, 1, null));
            } else {
                android.widget.TextView textView3 = abstractC47402tpP.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                textView3.setVisibility(8);
            }
            android.view.View view = abstractC47402tpP.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(view, "");
            android.widget.TextView textView4 = abstractC47402tpP.EZpvd;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            if (textView4.getVisibility() == 0) {
                android.widget.TextView textView5 = abstractC47402tpP.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(textView5, "");
                i = textView5.getVisibility() != 0 ? 8 : 0;
            }
            view.setVisibility(i);
            android.view.View root = abstractC47402tpP.getRoot();
            root.setOnClickListener(new ViewOnClickListenerC0934Application(root, 1000L, c44047sBj, searchArticleDisplayModel, this));
        }

        /* JADX INFO: renamed from: o.sBj$Application$Application, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0934Application implements View.OnClickListener {
            public final /* synthetic */ SearchArticleDisplayModel AEQbTJ;
            public final /* synthetic */ Application EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ C44047sBj OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0934Application(android.view.View view, long j, C44047sBj c44047sBj, SearchArticleDisplayModel searchArticleDisplayModel, Application application) {
                this.copydefault = view;
                this.KWHzl = j;
                this.OLrzqt = c44047sBj;
                this.AEQbTJ = searchArticleDisplayModel;
                this.EZpvd = application;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    ActionBar actionBar = this.OLrzqt.copydefault;
                    if (actionBar != null) {
                        actionBar.KWHzl(this.AEQbTJ, this.EZpvd.getBindingAdapterPosition());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.sBj$StateListAnimator */
    public final class StateListAnimator extends TaskDescription {
        public final /* synthetic */ C44047sBj AEQbTJ;
        public final AbstractC47393tpG KWHzl;

        /* JADX WARN: Removed duplicated region for block: B:11:0x0080  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void KWHzl(@NotNull SearchArticleDisplayModel searchArticleDisplayModel) {
            int i;
            Intrinsics.checkNotNullParameter(searchArticleDisplayModel, "");
            AbstractC47393tpG abstractC47393tpG = this.KWHzl;
            C44047sBj c44047sBj = this.AEQbTJ;
            C55258xgZ c55258xgZ = abstractC47393tpG.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55258xgZ, "");
            C45391sos.AEQbTJ(c55258xgZ);
            abstractC47393tpG.EZpvd.setTextValue(EZpvd(c44047sBj.AEQbTJ, searchArticleDisplayModel.getTitle()));
            abstractC47393tpG.copydefault.setText(searchArticleDisplayModel.getSectionName());
            android.widget.TextView textView = abstractC47393tpG.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) searchArticleDisplayModel.getSectionName()) ^ true ? 0 : 8);
            Date date = new Date(searchArticleDisplayModel.getUpdateTime() * ((long) 1000));
            android.widget.TextView textView2 = abstractC47393tpG.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(0);
            abstractC47393tpG.AEQbTJ.setText(pTA.formatStandardDate$default(date, null, 1, null));
            android.view.View view = abstractC47393tpG.KWHzl;
            Intrinsics.checkNotNullExpressionValue(view, "");
            android.widget.TextView textView3 = abstractC47393tpG.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            if (textView3.getVisibility() == 0) {
                android.widget.TextView textView4 = abstractC47393tpG.copydefault;
                Intrinsics.checkNotNullExpressionValue(textView4, "");
                i = textView4.getVisibility() != 0 ? 8 : 0;
            }
            view.setVisibility(i);
            android.view.View root = abstractC47393tpG.getRoot();
            root.setOnClickListener(new ActionBar(root, 1000L, c44047sBj, searchArticleDisplayModel, this));
        }

        /* JADX INFO: renamed from: o.sBj$StateListAnimator$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ StateListAnimator EZpvd;
            public final /* synthetic */ SearchArticleDisplayModel KWHzl;
            public final /* synthetic */ C44047sBj OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, C44047sBj c44047sBj, SearchArticleDisplayModel searchArticleDisplayModel, StateListAnimator stateListAnimator) {
                this.AEQbTJ = view;
                this.copydefault = j;
                this.OLrzqt = c44047sBj;
                this.KWHzl = searchArticleDisplayModel;
                this.EZpvd = stateListAnimator;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    ActionBar actionBar = this.OLrzqt.copydefault;
                    if (actionBar != null) {
                        actionBar.KWHzl(this.KWHzl, this.EZpvd.getBindingAdapterPosition());
                    }
                }
            }
        }
    }
}
