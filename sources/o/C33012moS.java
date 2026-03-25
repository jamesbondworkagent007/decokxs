package o;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C32982mnp;
import o.C33012moS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.moS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33012moS extends C33005moL {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public android.widget.TextView AEQbTJ;
    public ActionBar AYXKKw;
    public final java.util.List<java.lang.Object> AhwBna;
    public final View.OnClickListener DbNXlk;
    public android.graphics.drawable.Drawable EZpvd;
    public java.lang.CharSequence KWHzl;
    public android.widget.ImageView copydefault;
    public final C59534zip djBIcL;
    public java.lang.CharSequence fARcdN;
    public java.util.List<? extends java.lang.Object> fIwbmz;
    public Function0<Unit> fJNWhG;
    public android.view.ViewGroup fetchVPNInfo;
    public android.widget.TextView isConnected;
    public android.view.View valueOf;
    public RecyclerView values;
    public PendingIntent ejfBZ = new Dialog();
    public StateListAnimator gEmmrt = new Fragment();

    /* JADX INFO: renamed from: o.moS$ActionBar */
    public interface ActionBar {
        void AEQbTJ();

        void copydefault();
    }

    /* JADX INFO: renamed from: o.moS$Dialog */
    public static class Dialog implements PendingIntent {
        @Override // o.C33012moS.PendingIntent
        public boolean AEQbTJ() {
            return true;
        }

        @Override // o.C33012moS.PendingIntent
        public boolean OLrzqt() {
            return true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C33012moS.PendingIntent
        public boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return true;
        }
    }

    /* JADX INFO: renamed from: o.moS$PendingIntent */
    public interface PendingIntent {
        boolean AEQbTJ();

        boolean OLrzqt();

        boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull java.lang.Object obj);
    }

    /* JADX INFO: renamed from: o.moS$StateListAnimator */
    public interface StateListAnimator {
        void copydefault(@NotNull android.widget.TextView textView, int i, @NotNull java.lang.Object obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(pendingIntent, "");
        this.ejfBZ = pendingIntent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        this.AEQbTJ = textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        this.fetchVPNInfo = viewGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull android.widget.ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "");
        this.copydefault = imageView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        this.isConnected = textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.valueOf = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        this.values = recyclerView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.gEmmrt = stateListAnimator;
    }

    public C33012moS() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.AhwBna = arrayList;
        this.djBIcL = new C59534zip(arrayList);
        this.DbNXlk = new View.OnClickListener() { // from class: o.moX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C33012moS.OLrzqt(this.KWHzl, view);
            }
        };
    }

    /* JADX INFO: renamed from: o.moS$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.moS.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ C33012moS newInstance$default(Application application, java.util.List list, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, android.graphics.drawable.Drawable drawable, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                charSequence = null;
            }
            if ((i & 4) != 0) {
                charSequence2 = null;
            }
            if ((i & 8) != 0) {
                drawable = null;
            }
            return application.AEQbTJ(list, charSequence, charSequence2, drawable);
        }

        public final C33012moS AEQbTJ(@NotNull java.util.List<? extends java.lang.Object> list, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, android.graphics.drawable.Drawable drawable) {
            Intrinsics.checkNotNullParameter(list, "");
            C33012moS c33012moS = new C33012moS();
            c33012moS.fIwbmz = list;
            c33012moS.fARcdN = charSequence;
            c33012moS.EZpvd = drawable;
            c33012moS.KWHzl = charSequence2;
            return c33012moS;
        }
    }

    public final android.view.ViewGroup copydefault() {
        android.view.ViewGroup viewGroup = this.fetchVPNInfo;
        if (viewGroup != null) {
            return viewGroup;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final android.widget.TextView AkhnZx() {
        android.widget.TextView textView = this.isConnected;
        if (textView != null) {
            return textView;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final android.widget.ImageView KWHzl() {
        android.widget.ImageView imageView = this.copydefault;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final android.widget.TextView OLrzqt() {
        android.widget.TextView textView = this.AEQbTJ;
        if (textView != null) {
            return textView;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final android.view.View EZpvd() {
        android.view.View view = this.valueOf;
        if (view != null) {
            return view;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final RecyclerView AEQbTJ() {
        RecyclerView recyclerView = this.values;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final void OLrzqt(C33012moS c33012moS, android.view.View view) {
        int id = view.getId();
        if (id == C32982mnp.StateListAnimator.AEQbTJ) {
            if (c33012moS.ejfBZ.OLrzqt()) {
                c33012moS.dismiss();
            }
        } else if (id == C32982mnp.StateListAnimator.EZpvd && c33012moS.ejfBZ.AEQbTJ()) {
            c33012moS.dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        android.view.View viewInflate = layoutInflater.inflate(C32982mnp.Activity.OLrzqt, (android.view.ViewGroup) null, false);
        OLrzqt((android.view.ViewGroup) viewInflate.findViewById(C32982mnp.StateListAnimator.gEmmrt));
        OLrzqt((android.widget.TextView) viewInflate.findViewById(C32982mnp.StateListAnimator.AYXKKw));
        OLrzqt((android.widget.ImageView) viewInflate.findViewById(C32982mnp.StateListAnimator.AEQbTJ));
        KWHzl((android.widget.TextView) viewInflate.findViewById(C32982mnp.StateListAnimator.EZpvd));
        copydefault(viewInflate.findViewById(C32982mnp.StateListAnimator.OLrzqt));
        copydefault((RecyclerView) viewInflate.findViewById(C32982mnp.StateListAnimator.valueOf));
        AEQbTJ().setLayoutManager(new LinearLayoutManager(viewInflate.getContext(), 1, false));
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        isConnected();
        Function0<Unit> function0 = this.fJNWhG;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onCancel(dialogInterface);
        ActionBar actionBar = this.AYXKKw;
        if (actionBar != null) {
            actionBar.copydefault();
        }
    }

    @Override // o.C33005moL, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        ActionBar actionBar = this.AYXKKw;
        if (actionBar != null) {
            actionBar.AEQbTJ();
        }
    }

    public final void isConnected() {
        if (this.fIwbmz == null) {
            dismiss();
            return;
        }
        if (this.EZpvd == null && android.text.TextUtils.isEmpty(this.fARcdN)) {
            copydefault().setVisibility(8);
        } else {
            copydefault().setVisibility(0);
            AkhnZx().setText(this.fARcdN);
            if (this.EZpvd != null) {
                KWHzl().setImageDrawable(this.EZpvd);
                KWHzl().setVisibility(0);
                KWHzl().setOnClickListener(this.DbNXlk);
            } else {
                KWHzl().setImageDrawable(null);
                KWHzl().setVisibility(8);
                KWHzl().setOnClickListener(null);
            }
        }
        if (!android.text.TextUtils.isEmpty(this.KWHzl)) {
            EZpvd().setVisibility(0);
            OLrzqt().setVisibility(0);
            OLrzqt().setText(this.KWHzl);
            OLrzqt().setOnClickListener(this.DbNXlk);
        } else {
            OLrzqt().setVisibility(8);
            EZpvd().setVisibility(8);
            OLrzqt().setText((java.lang.CharSequence) null);
            OLrzqt().setOnClickListener(null);
        }
        if (AEQbTJ().getAdapter() == null) {
            this.djBIcL.register(java.lang.Object.class, new Activity());
            AEQbTJ().setAdapter(this.djBIcL);
        }
        this.AhwBna.clear();
        java.util.List<? extends java.lang.Object> list = this.fIwbmz;
        if (list != null) {
            this.AhwBna.addAll(list);
        }
        this.djBIcL.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: o.moS$Activity */
    public final class Activity extends AbstractC59533zio<java.lang.Object, TaskDescription> {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C33012moS c33012moS = C33012moS.this;
            android.view.View viewInflate = layoutInflater.inflate(C32113mPz.Fragment.isConnected, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return new TaskDescription(c33012moS, viewInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull TaskDescription taskDescription, @NotNull final java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            Intrinsics.checkNotNullParameter(obj, "");
            final int adapterPosition = taskDescription.getAdapterPosition();
            C33012moS.this.gEmmrt.copydefault(taskDescription.AEQbTJ(), adapterPosition, obj);
            android.view.View view = taskDescription.itemView;
            final C33012moS c33012moS = C33012moS.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.mpb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C33012moS.Activity.copydefault(c33012moS, adapterPosition, obj, view2);
                }
            });
        }

        public static final void copydefault(C33012moS c33012moS, int i, java.lang.Object obj, android.view.View view) {
            PendingIntent pendingIntent = c33012moS.ejfBZ;
            Intrinsics.copydefault(view);
            if (pendingIntent.OLrzqt(view, i, obj)) {
                c33012moS.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: o.moS$TaskDescription */
    public final class TaskDescription extends RecyclerView.ViewHolder {
        public android.widget.TextView AEQbTJ;
        public final /* synthetic */ C33012moS copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C33012moS c33012moS, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.copydefault = c33012moS;
            android.view.View viewFindViewById = view.findViewById(C32113mPz.FragmentManager.OBJEWx);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.AEQbTJ = (android.widget.TextView) viewFindViewById;
        }
    }

    /* JADX INFO: renamed from: o.moS$Fragment */
    public static class Fragment implements StateListAnimator {
        @Override // o.C33012moS.StateListAnimator
        public void copydefault(@NotNull android.widget.TextView textView, int i, @NotNull java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(textView, "");
            Intrinsics.checkNotNullParameter(obj, "");
            textView.setText(obj.toString());
        }
    }
}
