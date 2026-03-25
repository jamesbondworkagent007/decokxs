package o;

import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.okex.uploadlog.bean.FieldOption;
import com.okinc.okex.uploadlog.view.displaymodels.ExtraFormData;
import com.okinc.okex.uploadlog.view.displaymodels.FormElementDisplayModel;
import com.okinc.okex.uploadlog.view.displaymodels.FormElementViewType;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47315tni;
import o.C52761wXj;
import o.C55018xby;
import o.sCS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class sCS extends AbstractC45381soi<FormElementDisplayModel, TaskDescription> {
    public static final Fragment Companion = new Fragment(null);
    public static final int copydefault = 8;
    public boolean AEQbTJ;
    public boolean EZpvd;
    public boolean KWHzl;
    public final StateListAnimator OLrzqt;
    public final java.util.List<FormElementDisplayModel> gEmmrt;

    /* JADX INFO: loaded from: classes16.dex */
    public interface StateListAnimator {
        void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2);

        void EZpvd(@NotNull java.lang.String str);

        void KWHzl(@NotNull java.lang.String str);

        void OLrzqt(@NotNull java.lang.String str, ExtraFormData.DateInfo dateInfo);

        void copydefault(@NotNull java.lang.String str, java.lang.String str2);

        void copydefault(@NotNull java.lang.String str, boolean z);

        void gEmmrt();
    }

    public sCS(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.OLrzqt = stateListAnimator;
        this.gEmmrt = C56402yEa.EZpvd(new FormElementDisplayModel("SubmitBtn", FormElementViewType.SubmitBtn, false, null, null, null, null, 124, null));
    }

    public static final class Fragment {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sCS.Fragment.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Fragment(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Fragment() {
        }
    }

    public final void copydefault(boolean z) {
        this.AEQbTJ = z;
        java.util.List<FormElementDisplayModel> currentList = copydefault().getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        notifyItemChanged(yDY.AuCTel(currentList), "UPDATE_SUBMIT_ENABLED");
    }

    public final void KWHzl(boolean z) {
        this.KWHzl = z;
        notifyItemRangeChanged(0, getItemCount(), "UPDATE_SUBMIT_LOADING");
    }

    public final void EZpvd(boolean z) {
        this.EZpvd = z;
        java.util.List<FormElementDisplayModel> currentList = copydefault().getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "");
        java.util.Iterator<FormElementDisplayModel> it = currentList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().djBIcL() == FormElementViewType.Attachment) {
                break;
            } else {
                i++;
            }
        }
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            notifyItemChanged(numValueOf.intValue(), "UPDATE_ATTACHMENT_LIMIT");
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<com.okinc.okex.uploadlog.view.displaymodels.FormElementDisplayModel>] */
    @Override // o.AbstractC45381soi
    public void AEQbTJ(@NotNull java.util.List<? extends FormElementDisplayModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        super.AEQbTJ(CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) list, (java.lang.Iterable) this.gEmmrt));
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC45381soi
    public boolean KWHzl(@NotNull FormElementDisplayModel formElementDisplayModel, @NotNull FormElementDisplayModel formElementDisplayModel2) {
        Intrinsics.checkNotNullParameter(formElementDisplayModel, "");
        Intrinsics.checkNotNullParameter(formElementDisplayModel2, "");
        return Intrinsics.EZpvd((java.lang.Object) formElementDisplayModel.KWHzl(), (java.lang.Object) formElementDisplayModel2.KWHzl());
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC45381soi
    public boolean copydefault(@NotNull FormElementDisplayModel formElementDisplayModel, @NotNull FormElementDisplayModel formElementDisplayModel2) {
        Intrinsics.checkNotNullParameter(formElementDisplayModel, "");
        Intrinsics.checkNotNullParameter(formElementDisplayModel2, "");
        return Intrinsics.EZpvd((java.lang.Object) formElementDisplayModel.copydefault(), (java.lang.Object) formElementDisplayModel2.copydefault()) && Intrinsics.EZpvd((java.lang.Object) formElementDisplayModel.OLrzqt(), (java.lang.Object) formElementDisplayModel2.OLrzqt()) && formElementDisplayModel.djBIcL() == formElementDisplayModel2.djBIcL() && Intrinsics.EZpvd((java.lang.Object) formElementDisplayModel.EZpvd(), (java.lang.Object) formElementDisplayModel2.EZpvd());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return copydefault().getCurrentList().get(i).djBIcL().ordinal();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(viewGroup.getContext());
        if (i == FormElementViewType.Date.ordinal()) {
            AbstractC47466tqa abstractC47466tqaAEQbTJ = AbstractC47466tqa.AEQbTJ(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(abstractC47466tqaAEQbTJ, "");
            return new FragmentManager(this, abstractC47466tqaAEQbTJ);
        }
        if (i == FormElementViewType.Dropdown.ordinal()) {
            AbstractC47468tqc abstractC47468tqcCopydefault = AbstractC47468tqc.copydefault(layoutInflaterFrom, viewGroup, false);
            C55001xbh c55001xbhAkhnZx = abstractC47468tqcCopydefault.AEQbTJ.AkhnZx();
            if (c55001xbhAkhnZx != null) {
                c55001xbhAkhnZx.setHintTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
                c55001xbhAkhnZx.setEllipsize(TextUtils.TruncateAt.END);
            }
            Intrinsics.checkNotNullExpressionValue(abstractC47468tqcCopydefault, "");
            return new LoaderManager(this, abstractC47468tqcCopydefault);
        }
        if (i == FormElementViewType.MultiLine.ordinal()) {
            AbstractC47473tqh abstractC47473tqhOLrzqt = AbstractC47473tqh.OLrzqt(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(abstractC47473tqhOLrzqt, "");
            return new PendingIntent(this, abstractC47473tqhOLrzqt);
        }
        if (i == FormElementViewType.Attachment.ordinal()) {
            AbstractC47409tpW abstractC47409tpWKWHzl = AbstractC47409tpW.KWHzl(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(abstractC47409tpWKWHzl, "");
            return new Application(this, abstractC47409tpWKWHzl);
        }
        if (i == FormElementViewType.AttachedFile.ordinal()) {
            AbstractC47410tpX abstractC47410tpXEZpvd = AbstractC47410tpX.EZpvd(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(abstractC47410tpXEZpvd, "");
            return new ActionBar(this, abstractC47410tpXEZpvd);
        }
        if (i == FormElementViewType.Checkbox.ordinal()) {
            AbstractC47467tqb abstractC47467tqbCopydefault = AbstractC47467tqb.copydefault(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(abstractC47467tqbCopydefault, "");
            return new Activity(this, abstractC47467tqbCopydefault);
        }
        if (i == FormElementViewType.SubmitBtn.ordinal()) {
            AbstractC47479tqn abstractC47479tqnEZpvd = AbstractC47479tqn.EZpvd(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(abstractC47479tqnEZpvd, "");
            return new TaskStackBuilder(this, abstractC47479tqnEZpvd);
        }
        AbstractC47471tqf abstractC47471tqfCopydefault = AbstractC47471tqf.copydefault(layoutInflaterFrom, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC47471tqfCopydefault, "");
        return new Dialog(this, abstractC47471tqfCopydefault);
    }

    public final class ActionBar extends TaskDescription {
        public final /* synthetic */ sCS AEQbTJ;
        public final AbstractC47410tpX EZpvd;

        public final /* synthetic */ class TaskDescription {
            public static final /* synthetic */ int[] EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[ExtraFormData.AttachmentInfo.State.values().length];
                try {
                    iArr[ExtraFormData.AttachmentInfo.State.LOADING.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[ExtraFormData.AttachmentInfo.State.SUCCESS.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[ExtraFormData.AttachmentInfo.State.FAILED.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                EZpvd = iArr;
            }
        }

        public static final class StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ sCS EZpvd;
            public final /* synthetic */ FormElementDisplayModel KWHzl;
            public final /* synthetic */ android.view.View OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(android.view.View view, long j, sCS scs, FormElementDisplayModel formElementDisplayModel) {
                this.OLrzqt = view;
                this.AEQbTJ = j;
                this.EZpvd = scs;
                this.KWHzl = formElementDisplayModel;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    this.EZpvd.OLrzqt.KWHzl(this.KWHzl.KWHzl());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull sCS scs, AbstractC47410tpX abstractC47410tpX) {
            super(abstractC47410tpX);
            Intrinsics.checkNotNullParameter(abstractC47410tpX, "");
            this.AEQbTJ = scs;
            this.EZpvd = abstractC47410tpX;
        }

        @Override // o.sCS.TaskDescription
        public void OLrzqt(@NotNull FormElementDisplayModel formElementDisplayModel) {
            Intrinsics.checkNotNullParameter(formElementDisplayModel, "");
            AbstractC47410tpX abstractC47410tpX = this.EZpvd;
            sCS scs = this.AEQbTJ;
            android.widget.ImageView imageView = abstractC47410tpX.EZpvd;
            imageView.setOnClickListener(new StateListAnimator(imageView, 1000L, scs, formElementDisplayModel));
            ExtraFormData extraFormDataAEQbTJ = formElementDisplayModel.AEQbTJ();
            ExtraFormData.AttachmentInfo attachmentInfo = extraFormDataAEQbTJ instanceof ExtraFormData.AttachmentInfo ? (ExtraFormData.AttachmentInfo) extraFormDataAEQbTJ : null;
            ExtraFormData.AttachmentInfo.State stateOLrzqt = attachmentInfo != null ? attachmentInfo.OLrzqt() : null;
            int i = stateOLrzqt == null ? -1 : TaskDescription.EZpvd[stateOLrzqt.ordinal()];
            if (i == 1) {
                abstractC47410tpX.gEmmrt.setText(C33070mpX.AYXKKw(C47315tni.PendingIntent.dmfpNf));
                abstractC47410tpX.djBIcL.setText("");
                android.widget.TextView textView = abstractC47410tpX.valueOf;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(8);
                android.widget.ImageView imageView2 = abstractC47410tpX.EZpvd;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                imageView2.setVisibility(8);
                android.widget.ProgressBar progressBar = abstractC47410tpX.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(progressBar, "");
                progressBar.setVisibility(0);
                android.widget.ImageView imageView3 = abstractC47410tpX.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(imageView3, "");
                imageView3.setVisibility(8);
                android.widget.ImageView imageView4 = abstractC47410tpX.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(imageView4, "");
                imageView4.setVisibility(8);
                return;
            }
            if (i == 2) {
                abstractC47410tpX.gEmmrt.setText(formElementDisplayModel.copydefault());
                abstractC47410tpX.djBIcL.setText(attachmentInfo.copydefault());
                android.widget.TextView textView2 = abstractC47410tpX.valueOf;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(8);
                android.widget.ImageView imageView5 = abstractC47410tpX.EZpvd;
                Intrinsics.checkNotNullExpressionValue(imageView5, "");
                imageView5.setVisibility(0);
                android.widget.ImageView imageView6 = abstractC47410tpX.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(imageView6, "");
                imageView6.setVisibility(0);
                android.widget.ProgressBar progressBar2 = abstractC47410tpX.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(progressBar2, "");
                progressBar2.setVisibility(8);
                android.widget.ImageView imageView7 = abstractC47410tpX.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(imageView7, "");
                imageView7.setVisibility(8);
                return;
            }
            if (i == 3) {
                abstractC47410tpX.gEmmrt.setText(formElementDisplayModel.copydefault());
                abstractC47410tpX.djBIcL.setText(attachmentInfo.copydefault());
                android.widget.TextView textView3 = abstractC47410tpX.valueOf;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                C55307xhV.AEQbTJ(textView3, attachmentInfo.KWHzl());
                android.widget.ImageView imageView8 = abstractC47410tpX.EZpvd;
                Intrinsics.checkNotNullExpressionValue(imageView8, "");
                imageView8.setVisibility(0);
                android.widget.ImageView imageView9 = abstractC47410tpX.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(imageView9, "");
                imageView9.setVisibility(0);
                android.widget.ProgressBar progressBar3 = abstractC47410tpX.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(progressBar3, "");
                progressBar3.setVisibility(8);
                android.widget.ImageView imageView10 = abstractC47410tpX.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(imageView10, "");
                imageView10.setVisibility(8);
                return;
            }
            abstractC47410tpX.gEmmrt.setText(formElementDisplayModel.copydefault());
            abstractC47410tpX.djBIcL.setText("");
            android.widget.TextView textView4 = abstractC47410tpX.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            textView4.setVisibility(8);
            android.widget.ImageView imageView11 = abstractC47410tpX.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView11, "");
            imageView11.setVisibility(0);
            android.widget.ImageView imageView12 = abstractC47410tpX.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(imageView12, "");
            imageView12.setVisibility(0);
            android.widget.ProgressBar progressBar4 = abstractC47410tpX.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(progressBar4, "");
            progressBar4.setVisibility(8);
            android.widget.ImageView imageView13 = abstractC47410tpX.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView13, "");
            imageView13.setVisibility(8);
        }

        @Override // o.sCS.TaskDescription
        public void AEQbTJ() {
            this.EZpvd.EZpvd.setEnabled(!this.AEQbTJ.KWHzl);
        }
    }

    public final class Application extends TaskDescription {
        public final AbstractC47409tpW AEQbTJ;
        public final /* synthetic */ sCS OLrzqt;

        /* JADX INFO: renamed from: o.sCS$Application$Application, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0935Application implements View.OnClickListener {
            public final /* synthetic */ FormElementDisplayModel AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ sCS copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0935Application(android.view.View view, long j, sCS scs, FormElementDisplayModel formElementDisplayModel) {
                this.EZpvd = view;
                this.KWHzl = j;
                this.copydefault = scs;
                this.AEQbTJ = formElementDisplayModel;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    this.copydefault.OLrzqt.EZpvd(this.AEQbTJ.KWHzl());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull sCS scs, AbstractC47409tpW abstractC47409tpW) {
            super(abstractC47409tpW);
            Intrinsics.checkNotNullParameter(abstractC47409tpW, "");
            this.OLrzqt = scs;
            this.AEQbTJ = abstractC47409tpW;
        }

        @Override // o.sCS.TaskDescription
        public void OLrzqt(@NotNull FormElementDisplayModel formElementDisplayModel) {
            Intrinsics.checkNotNullParameter(formElementDisplayModel, "");
            OLrzqt();
            AbstractC47409tpW abstractC47409tpW = this.AEQbTJ;
            sCS scs = this.OLrzqt;
            abstractC47409tpW.AEQbTJ.setText(formElementDisplayModel.copydefault());
            android.widget.LinearLayout linearLayout = abstractC47409tpW.EZpvd;
            linearLayout.setOnClickListener(new ViewOnClickListenerC0935Application(linearLayout, 1000L, scs, formElementDisplayModel));
        }

        @Override // o.sCS.TaskDescription
        public void AEQbTJ() {
            this.AEQbTJ.EZpvd.setEnabled(!this.OLrzqt.KWHzl);
        }

        public final void OLrzqt() {
            android.widget.LinearLayout linearLayout = this.AEQbTJ.EZpvd;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(this.OLrzqt.EZpvd ^ true ? 0 : 8);
        }
    }

    public final class FragmentManager extends TaskDescription {
        public final /* synthetic */ sCS KWHzl;
        public final AbstractC47466tqa OLrzqt;

        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ sCS AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ FormElementDisplayModel OLrzqt;
            public final /* synthetic */ ExtraFormData.DateInfo copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, sCS scs, FormElementDisplayModel formElementDisplayModel, ExtraFormData.DateInfo dateInfo) {
                this.KWHzl = view;
                this.EZpvd = j;
                this.AEQbTJ = scs;
                this.OLrzqt = formElementDisplayModel;
                this.copydefault = dateInfo;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    this.AEQbTJ.OLrzqt.OLrzqt(this.OLrzqt.KWHzl(), this.copydefault);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FragmentManager(@NotNull sCS scs, AbstractC47466tqa abstractC47466tqa) {
            super(abstractC47466tqa);
            Intrinsics.checkNotNullParameter(abstractC47466tqa, "");
            this.KWHzl = scs;
            this.OLrzqt = abstractC47466tqa;
        }

        @Override // o.sCS.TaskDescription
        public void OLrzqt(@NotNull FormElementDisplayModel formElementDisplayModel) {
            int iCopydefault;
            Intrinsics.checkNotNullParameter(formElementDisplayModel, "");
            AbstractC47466tqa abstractC47466tqa = this.OLrzqt;
            sCS scs = this.KWHzl;
            abstractC47466tqa.EZpvd.setText(formElementDisplayModel.copydefault());
            abstractC47466tqa.AEQbTJ.setText(formElementDisplayModel.EZpvd());
            ExtraFormData extraFormDataAEQbTJ = formElementDisplayModel.AEQbTJ();
            ExtraFormData.DateInfo dateInfo = extraFormDataAEQbTJ instanceof ExtraFormData.DateInfo ? (ExtraFormData.DateInfo) extraFormDataAEQbTJ : null;
            android.widget.TextView textView = abstractC47466tqa.AEQbTJ;
            if (dateInfo != null) {
                iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
            } else {
                iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.QwvEab);
            }
            textView.setTextColor(iCopydefault);
            android.widget.TextView textView2 = abstractC47466tqa.AEQbTJ;
            textView2.setOnClickListener(new Activity(textView2, 1000L, scs, formElementDisplayModel, dateInfo));
        }

        @Override // o.sCS.TaskDescription
        public void AEQbTJ() {
            this.OLrzqt.AEQbTJ.setEnabled(!this.KWHzl.KWHzl);
        }
    }

    public final class TaskStackBuilder extends TaskDescription {
        public final AbstractC47479tqn OLrzqt;
        public final /* synthetic */ sCS copydefault;

        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ sCS OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, sCS scs) {
                this.KWHzl = view;
                this.copydefault = j;
                this.OLrzqt = scs;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    this.OLrzqt.OLrzqt.gEmmrt();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskStackBuilder(@NotNull sCS scs, AbstractC47479tqn abstractC47479tqn) {
            super(abstractC47479tqn);
            Intrinsics.checkNotNullParameter(abstractC47479tqn, "");
            this.copydefault = scs;
            this.OLrzqt = abstractC47479tqn;
        }

        @Override // o.sCS.TaskDescription
        public void OLrzqt(@NotNull FormElementDisplayModel formElementDisplayModel) {
            Intrinsics.checkNotNullParameter(formElementDisplayModel, "");
            EZpvd();
            C52794wYp c52794wYp = this.OLrzqt.EZpvd;
            c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this.copydefault));
        }

        @Override // o.sCS.TaskDescription
        public void AEQbTJ() {
            C52794wYp c52794wYp = this.OLrzqt.EZpvd;
            if (this.copydefault.KWHzl) {
                C52794wYp.startLoading$default(c52794wYp, 0L, 1, null);
            } else {
                c52794wYp.fIwbmz();
            }
        }

        public final void EZpvd() {
            this.OLrzqt.EZpvd.setEnabled(this.copydefault.AEQbTJ);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, int i) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        onBindViewHolder(taskDescription, i, yDY.AhwBna());
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, int i, @NotNull java.util.List<? extends java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.contains("UPDATE_SUBMIT_ENABLED") && (taskDescription instanceof TaskStackBuilder)) {
            ((TaskStackBuilder) taskDescription).EZpvd();
            return;
        }
        if (list.contains("UPDATE_ATTACHMENT_LIMIT") && (taskDescription instanceof Application)) {
            ((Application) taskDescription).OLrzqt();
        } else {
            if (list.contains("UPDATE_SUBMIT_LOADING")) {
                taskDescription.AEQbTJ();
                return;
            }
            FormElementDisplayModel formElementDisplayModel = copydefault().getCurrentList().get(i);
            Intrinsics.copydefault(formElementDisplayModel);
            taskDescription.OLrzqt(formElementDisplayModel);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        taskDescription.copydefault();
        super.onViewRecycled(taskDescription);
    }

    public static abstract class TaskDescription extends RecyclerView.ViewHolder {
        public abstract void AEQbTJ();

        public abstract void OLrzqt(@NotNull FormElementDisplayModel formElementDisplayModel);

        public void copydefault() {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull ViewDataBinding viewDataBinding) {
            super(viewDataBinding.getRoot());
            Intrinsics.checkNotNullParameter(viewDataBinding, "");
        }
    }

    public final class Dialog extends TaskDescription {
        public final ViewDataBinding AEQbTJ;
        public final /* synthetic */ sCS OLrzqt;

        @Override // o.sCS.TaskDescription
        public void AEQbTJ() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.sCS.TaskDescription
        public void OLrzqt(@NotNull FormElementDisplayModel formElementDisplayModel) {
            Intrinsics.checkNotNullParameter(formElementDisplayModel, "");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dialog(@NotNull sCS scs, ViewDataBinding viewDataBinding) {
            super(viewDataBinding);
            Intrinsics.checkNotNullParameter(viewDataBinding, "");
            this.OLrzqt = scs;
            this.AEQbTJ = viewDataBinding;
        }
    }

    public final class LoaderManager extends TaskDescription {
        public final AbstractC47468tqc EZpvd;
        public final /* synthetic */ sCS copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoaderManager(@NotNull sCS scs, AbstractC47468tqc abstractC47468tqc) {
            super(abstractC47468tqc);
            Intrinsics.checkNotNullParameter(abstractC47468tqc, "");
            this.copydefault = scs;
            this.EZpvd = abstractC47468tqc;
        }

        @Override // o.sCS.TaskDescription
        public void OLrzqt(@NotNull final FormElementDisplayModel formElementDisplayModel) {
            Intrinsics.checkNotNullParameter(formElementDisplayModel, "");
            AbstractC47468tqc abstractC47468tqc = this.EZpvd;
            final sCS scs = this.copydefault;
            abstractC47468tqc.copydefault.setText(formElementDisplayModel.copydefault());
            abstractC47468tqc.AEQbTJ.setHintText(formElementDisplayModel.EZpvd());
            ExtraFormData extraFormDataAEQbTJ = formElementDisplayModel.AEQbTJ();
            ExtraFormData.DropdownInfo dropdownInfo = extraFormDataAEQbTJ instanceof ExtraFormData.DropdownInfo ? (ExtraFormData.DropdownInfo) extraFormDataAEQbTJ : null;
            if (dropdownInfo != null) {
                java.util.List<FieldOption> listCopydefault = dropdownInfo.copydefault();
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
                for (FieldOption fieldOption : listCopydefault) {
                    java.lang.String strComponent1 = fieldOption.component1();
                    arrayList.add(new C55276xgr(fieldOption.component2(), strComponent1, null, Intrinsics.EZpvd((java.lang.Object) dropdownInfo.KWHzl(), (java.lang.Object) strComponent1), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
                }
                final java.util.List<C55276xgr> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
                abstractC47468tqc.AEQbTJ.setItems(listFJNWhG);
                final AbstractC52786wYh abstractC52786wYhOLrzqt = abstractC47468tqc.AEQbTJ.OLrzqt();
                if (abstractC52786wYhOLrzqt != null) {
                    C55018xby.Activity activity = abstractC52786wYhOLrzqt instanceof C55018xby.Activity ? (C55018xby.Activity) abstractC52786wYhOLrzqt : null;
                    if (activity != null) {
                        activity.EZpvd(new Function1() { // from class: o.sCQ
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return sCS.LoaderManager.copydefault(listFJNWhG, scs, formElementDisplayModel, abstractC52786wYhOLrzqt, (java.lang.CharSequence) obj);
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            }
            abstractC47468tqc.AEQbTJ.setEnabled(false);
        }

        @Override // o.sCS.TaskDescription
        public void AEQbTJ() {
            this.EZpvd.AEQbTJ.setState(this.copydefault.KWHzl ? 3 : 0);
        }

        @Override // o.sCS.TaskDescription
        public void copydefault() {
            this.EZpvd.AEQbTJ.setBottomSheet(null);
        }

        public static final Unit copydefault(java.util.List list, sCS scs, FormElementDisplayModel formElementDisplayModel, AbstractC52786wYh abstractC52786wYh, java.lang.CharSequence charSequence) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                C55276xgr c55276xgr = (C55276xgr) it.next();
                if (c55276xgr.AEQbTJ()) {
                    StateListAnimator stateListAnimator = scs.OLrzqt;
                    java.lang.String strKWHzl = formElementDisplayModel.KWHzl();
                    java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
                    stateListAnimator.copydefault(strKWHzl, objOLrzqt instanceof java.lang.String ? (java.lang.String) objOLrzqt : null);
                    abstractC52786wYh.dismiss();
                    return Unit.INSTANCE;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    public final class PendingIntent extends TaskDescription {
        public final AbstractC47473tqh EZpvd;
        public final /* synthetic */ sCS KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingIntent(@NotNull sCS scs, AbstractC47473tqh abstractC47473tqh) {
            super(abstractC47473tqh);
            Intrinsics.checkNotNullParameter(abstractC47473tqh, "");
            this.KWHzl = scs;
            this.EZpvd = abstractC47473tqh;
        }

        @Override // o.sCS.TaskDescription
        public void OLrzqt(@NotNull FormElementDisplayModel formElementDisplayModel) {
            Intrinsics.checkNotNullParameter(formElementDisplayModel, "");
            C44760scx.log$default("MultiLineFormElementViewHolder: " + formElementDisplayModel, null, 2, null);
            sCX scx = this.EZpvd.OLrzqt;
            sCS scs = this.KWHzl;
            scx.setTitle(formElementDisplayModel.copydefault());
            scx.setHint(formElementDisplayModel.EZpvd());
            scx.setTextChangedListener(new TaskDescription(scs, formElementDisplayModel));
        }

        public static final class TaskDescription implements android.text.TextWatcher {
            public final /* synthetic */ FormElementDisplayModel EZpvd;
            public final /* synthetic */ sCS OLrzqt;

            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            }

            public TaskDescription(sCS scs, FormElementDisplayModel formElementDisplayModel) {
                this.OLrzqt = scs;
                this.EZpvd = formElementDisplayModel;
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
                StateListAnimator stateListAnimator = this.OLrzqt.OLrzqt;
                java.lang.String strKWHzl = this.EZpvd.KWHzl();
                java.lang.String string = charSequence != null ? charSequence.toString() : null;
                if (string == null) {
                    string = "";
                }
                stateListAnimator.AEQbTJ(strKWHzl, string);
            }
        }

        @Override // o.sCS.TaskDescription
        public void AEQbTJ() {
            this.EZpvd.OLrzqt.setEnabled(!this.KWHzl.KWHzl);
        }

        @Override // o.sCS.TaskDescription
        public void copydefault() {
            this.EZpvd.OLrzqt.EZpvd();
        }
    }

    public final class Activity extends TaskDescription {
        public final /* synthetic */ sCS AEQbTJ;
        public final AbstractC47467tqb KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull sCS scs, AbstractC47467tqb abstractC47467tqb) {
            super(abstractC47467tqb);
            Intrinsics.checkNotNullParameter(abstractC47467tqb, "");
            this.AEQbTJ = scs;
            this.KWHzl = abstractC47467tqb;
        }

        @Override // o.sCS.TaskDescription
        public void OLrzqt(@NotNull final FormElementDisplayModel formElementDisplayModel) {
            Intrinsics.checkNotNullParameter(formElementDisplayModel, "");
            wYK wyk = this.KWHzl.KWHzl;
            final sCS scs = this.AEQbTJ;
            wyk.setText(formElementDisplayModel.copydefault());
            wyk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.sCO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    sCS.Activity.OLrzqt(scs, formElementDisplayModel, compoundButton, z);
                }
            });
        }

        public static final void OLrzqt(sCS scs, FormElementDisplayModel formElementDisplayModel, android.widget.CompoundButton compoundButton, boolean z) {
            scs.OLrzqt.copydefault(formElementDisplayModel.KWHzl(), z);
        }

        @Override // o.sCS.TaskDescription
        public void AEQbTJ() {
            this.KWHzl.KWHzl.setEnabled(!this.AEQbTJ.KWHzl);
        }

        @Override // o.sCS.TaskDescription
        public void copydefault() {
            this.KWHzl.KWHzl.setOnCheckedChangeListener(null);
        }
    }
}
