package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.planet.consts.PlanetMiniAppPath;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tJB extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public boolean AEQbTJ;
    public C46265tNy OLrzqt;

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tJB.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ tJB newInstance$default(TaskDescription taskDescription, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str2 = "";
            }
            return taskDescription.AEQbTJ(str, str2);
        }

        public final tJB AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("tier_key", str);
            bundle.putString("kol_id", str2);
            tJB tjb = new tJB();
            tjb.setArguments(bundle);
            return tjb;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.AEQbTJ().setVisibility(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.OLrzqt = C46265tNy.KWHzl(getLayoutInflater(), constraintLayout, true);
        AEQbTJ();
        constraintLayout.post(new java.lang.Runnable() { // from class: o.tJE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                tJB.KWHzl(this.OLrzqt);
            }
        });
    }

    public static final void KWHzl(tJB tjb) {
        if (tjb.AEQbTJ) {
            return;
        }
        tjb.AEQbTJ = true;
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) tjb, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static /* synthetic */ ActionBar getBadgeData$default(tJB tjb, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return tjb.KWHzl(str);
    }

    public final ActionBar KWHzl(java.lang.String str) {
        return new ActionBar(0, C33069mpW.copydefault(C47501trL.Fragment.DQzvGN, C56424yEw.gEmmrt(C56390yDp.OLrzqt("num", str), C56390yDp.OLrzqt("levelName", AEQbTJ(str)))), copydefault(str));
    }

    public final android.text.SpannableString copydefault(java.lang.String str) {
        java.lang.String strCopydefault = C33069mpW.copydefault(C47501trL.Fragment.scanPackages, C56423yEv.EZpvd(C56390yDp.OLrzqt("levelName", AEQbTJ(str))));
        java.lang.String str2 = strCopydefault + "\n" + C33070mpX.AYXKKw(C47501trL.Fragment.fARcdN);
        android.text.SpannableString spannableString = new android.text.SpannableString(str2);
        int length = strCopydefault.length() + 1;
        spannableString.setSpan(new StateListAnimator(), length, str2.length(), 33);
        spannableString.setSpan(new android.text.style.TextAppearanceSpan(requireContext(), C52761wXj.LoaderManager.KWHzl), length, str2.length(), 33);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(requireContext().getColor(C52761wXj.Activity.DCUTEIddSDPG)), length, str2.length(), 33);
        spannableString.setSpan(new android.text.style.UnderlineSpan(), length, str2.length(), 33);
        return spannableString;
    }

    public static final class StateListAnimator extends android.text.style.ClickableSpan {
        public StateListAnimator() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            java.lang.String string;
            Intrinsics.checkNotNullParameter(view, "");
            android.os.Bundle arguments = tJB.this.getArguments();
            if (arguments == null || (string = arguments.getString("tier_key")) == null) {
                string = "";
            }
            android.content.Context contextRequireContext = tJB.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            PlanetMiniAppPath planetMiniAppPath = PlanetMiniAppPath.TraderLevelsIntroEntrance;
            C46369tRu.copydefault(contextRequireContext, planetMiniAppPath.getAppId(), planetMiniAppPath.getUrl(), C56423yEv.EZpvd(C56390yDp.OLrzqt("tierKey", string)));
            tJB.this.dismissAllowingStateLoss();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String EZpvd(java.lang.String str) {
        int i;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        if (C46361tRm.OLrzqt(fragmentActivityRequireActivity)) {
            switch (str.hashCode()) {
                case 49:
                    i = !str.equals("1") ? 0 : C47501trL.Fragment.DGUQLIekVPG;
                    break;
                case 50:
                    if (str.equals("2")) {
                        i = C47501trL.Fragment.DUUtXg;
                        break;
                    }
                    break;
                case 51:
                    if (str.equals("3")) {
                        i = C47501trL.Fragment.DSiOMJ;
                        break;
                    }
                    break;
                case 52:
                    if (str.equals("4")) {
                        i = C47501trL.Fragment.frkDMe;
                        break;
                    }
                    break;
            }
        } else {
            switch (str.hashCode()) {
                case 49:
                    if (str.equals("1")) {
                        i = C47501trL.Fragment.DrqXHJ;
                        break;
                    }
                    break;
                case 50:
                    if (str.equals("2")) {
                        i = C47501trL.Fragment.DGUQLIhJrIAr;
                        break;
                    }
                    break;
                case 51:
                    if (str.equals("3")) {
                        i = C47501trL.Fragment.DIIpTV;
                        break;
                    }
                    break;
                case 52:
                    if (str.equals("4")) {
                        i = C47501trL.Fragment.QfJbVf;
                        break;
                    }
                    break;
            }
        }
        if (i != 0) {
            return getString(i);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [167=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String AEQbTJ(java.lang.String str) {
        java.lang.String string;
        switch (str.hashCode()) {
            case 49:
                if (!str.equals("1")) {
                    return "";
                }
                string = getString(C47501trL.Fragment.ihnvzI);
                Intrinsics.checkNotNullExpressionValue(string, "");
                break;
                break;
            case 50:
                if (!str.equals("2")) {
                    return "";
                }
                string = getString(C47501trL.Fragment.gdmIOq);
                Intrinsics.checkNotNullExpressionValue(string, "");
                break;
                break;
            case 51:
                if (!str.equals("3")) {
                    return "";
                }
                string = getString(C47501trL.Fragment.DQzvGNdrmXxu);
                Intrinsics.checkNotNullExpressionValue(string, "");
                break;
                break;
            case 52:
                if (!str.equals("4")) {
                    return "";
                }
                string = getString(C47501trL.Fragment.isReflectionWorking);
                Intrinsics.checkNotNullExpressionValue(string, "");
                break;
                break;
            default:
                return "";
        }
        return string;
    }

    private final void AEQbTJ() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("tier_key")) == null) {
            string = "";
        }
        ActionBar actionBarKWHzl = KWHzl(string);
        android.view.LayoutInflater layoutInflater = getLayoutInflater();
        int i = C47501trL.Application.AwvSrB;
        C46265tNy c46265tNy = this.OLrzqt;
        C46265tNy c46265tNy2 = null;
        if (c46265tNy == null) {
            Intrinsics.gEmmrt("");
            c46265tNy = null;
        }
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(layoutInflater, i, c46265tNy.OLrzqt, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        AbstractC46241tNa abstractC46241tNa = (AbstractC46241tNa) viewDataBindingInflate;
        android.widget.ImageView imageView = abstractC46241tNa.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C33054mpH.AEQbTJ(imageView, EZpvd(string));
        abstractC46241tNa.OLrzqt.setText(actionBarKWHzl.AEQbTJ());
        abstractC46241tNa.AEQbTJ.setText(actionBarKWHzl.EZpvd());
        abstractC46241tNa.AEQbTJ.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        java.util.List listEZpvd = C56402yEa.EZpvd(abstractC46241tNa.getRoot());
        C46265tNy c46265tNy3 = this.OLrzqt;
        if (c46265tNy3 == null) {
            Intrinsics.gEmmrt("");
            c46265tNy3 = null;
        }
        c46265tNy3.OLrzqt.setAdapter(new Activity(listEZpvd));
        C46265tNy c46265tNy4 = this.OLrzqt;
        if (c46265tNy4 == null) {
            Intrinsics.gEmmrt("");
            c46265tNy4 = null;
        }
        c46265tNy4.OLrzqt.setCurrentItem(0, false);
        C46265tNy c46265tNy5 = this.OLrzqt;
        if (c46265tNy5 == null) {
            Intrinsics.gEmmrt("");
            c46265tNy5 = null;
        }
        c46265tNy5.copydefault.setVisibility(8);
        C46265tNy c46265tNy6 = this.OLrzqt;
        if (c46265tNy6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c46265tNy2 = c46265tNy6;
        }
        c46265tNy2.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.tJD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                tJB.AEQbTJ(this.copydefault, view);
            }
        });
    }

    public static final void AEQbTJ(tJB tjb, android.view.View view) {
        tjb.dismissAllowingStateLoss();
    }

    public static final class Activity extends RecyclerView.Adapter<TaskDescription> {
        public final java.util.List<android.view.View> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull TaskDescription taskDescription, int i) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return i;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends android.view.View> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(@NotNull java.util.List<? extends android.view.View> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = list;
        }

        public static final class TaskDescription extends RecyclerView.ViewHolder {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull android.view.View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "");
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public TaskDescription onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            return new TaskDescription(this.copydefault.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.copydefault.size();
        }
    }

    public static final class ActionBar {
        public final java.lang.String EZpvd;
        public final java.lang.CharSequence KWHzl;
        public final int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.CharSequence EZpvd() {
            return this.KWHzl;
        }

        public ActionBar(int i, @NotNull java.lang.String str, @NotNull java.lang.CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            this.OLrzqt = i;
            this.EZpvd = str;
            this.KWHzl = charSequence;
        }
    }
}
