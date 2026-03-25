package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC21005grb;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.grb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC21005grb extends AbstractActivityC33013moT {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public AbstractC16948etZ EZpvd;

    /* JADX INFO: renamed from: o.grb$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.grb.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AbstractC16948etZ abstractC16948etZ = (AbstractC16948etZ) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.getSerial);
        this.EZpvd = abstractC16948etZ;
        if (abstractC16948etZ == null) {
            Intrinsics.gEmmrt("");
            abstractC16948etZ = null;
        }
        abstractC16948etZ.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.gqY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC21005grb.copydefault(this.EZpvd, view);
            }
        });
        EZpvd();
        copydefault();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.gqZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC21005grb.copydefault(this.EZpvd);
            }
        });
    }

    public static final void copydefault(ActivityC21005grb activityC21005grb, android.view.View view) {
        activityC21005grb.finish();
    }

    public static final void copydefault(ActivityC21005grb activityC21005grb) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC21005grb, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void copydefault() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new TaskDescription(C33070mpX.AYXKKw(C13754dXa.FragmentManager.withContextAvailableforInline), C33070mpX.AYXKKw(C13754dXa.FragmentManager.LocalOnBackPressedDispatcherOwnerLocalOnBackPressedDispatcherOwner1)));
        arrayList.add(new TaskDescription(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ContextAwareKtwithContextAvailable2listener1), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ManagedActivityResultLauncher)));
        arrayList.add(new TaskDescription(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResult), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getContract)));
        arrayList.add(new TaskDescription(C33070mpX.AYXKKw(C13754dXa.FragmentManager.resultCodeToString), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ReportDrawnCompositionobserveReporter1)));
        AbstractC16948etZ abstractC16948etZ = this.EZpvd;
        if (abstractC16948etZ == null) {
            Intrinsics.gEmmrt("");
            abstractC16948etZ = null;
        }
        RecyclerView.Adapter adapter = abstractC16948etZ.EZpvd.getAdapter();
        C43316rmw c43316rmw = adapter instanceof C43316rmw ? (C43316rmw) adapter : null;
        if (c43316rmw != null) {
            C33064mpR.OLrzqt(c43316rmw, (java.util.List<? extends java.lang.Object>) arrayList);
        }
    }

    private final void EZpvd() {
        AbstractC16948etZ abstractC16948etZ = this.EZpvd;
        if (abstractC16948etZ == null) {
            Intrinsics.gEmmrt("");
            abstractC16948etZ = null;
        }
        RecyclerView recyclerView = abstractC16948etZ.EZpvd;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.addItemDecoration(new ActionBar());
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(TaskDescription.class, new Activity(C13754dXa.TaskDescription.UJEglR, dTV.isConnected));
        recyclerView.setAdapter(c43316rmw);
    }

    /* JADX INFO: renamed from: o.grb$ActionBar */
    public static final class ActionBar extends RecyclerView.ItemDecoration {
        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(android.graphics.Rect rect, android.view.View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            super.getItemOffsets(rect, view, recyclerView, state);
            if (recyclerView.getChildLayoutPosition(view) == state.getItemCount() - 1) {
                view.findViewById(C13754dXa.ActionBar.RatingCompatStyle).setVisibility(8);
            } else {
                view.findViewById(C13754dXa.ActionBar.RatingCompatStyle).setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: o.grb$Activity */
    public static final class Activity extends C43318rmy<TaskDescription, AbstractC16788eqY> {
        public Activity(int i, int i2) {
            super(i, i2);
        }

        @Override // o.AbstractC43310rmq
        public /* synthetic */ void onBindViewHolder(C43312rms c43312rms, java.lang.Object obj) {
            onBindViewHolder((C43312rms<AbstractC16788eqY>) c43312rms, (TaskDescription) obj);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq, o.AbstractC59533zio
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(final C43312rms<AbstractC16788eqY> c43312rms, TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(taskDescription, "");
            super.onBindViewHolder((C43312rms) c43312rms, taskDescription);
            ((AbstractC16788eqY) c43312rms.OLrzqt()).AYXKKw.setText(taskDescription.EZpvd());
            ((AbstractC16788eqY) c43312rms.OLrzqt()).AEQbTJ.setText(taskDescription.OLrzqt());
            ((AbstractC16788eqY) c43312rms.OLrzqt()).EZpvd.setRotation(180.0f);
            ((AbstractC16788eqY) c43312rms.OLrzqt()).OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.gqX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC21005grb.Activity.EZpvd(c43312rms, view);
                }
            });
        }

        public static final void EZpvd(C43312rms c43312rms, android.view.View view) {
            if (((AbstractC16788eqY) c43312rms.OLrzqt()).EZpvd.getRotation() == 0.0f) {
                ((AbstractC16788eqY) c43312rms.OLrzqt()).AEQbTJ.setVisibility(8);
                ((AbstractC16788eqY) c43312rms.OLrzqt()).EZpvd.setRotation(180.0f);
            } else {
                ((AbstractC16788eqY) c43312rms.OLrzqt()).AEQbTJ.setVisibility(0);
                ((AbstractC16788eqY) c43312rms.OLrzqt()).EZpvd.setRotation(0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: o.grb$TaskDescription */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class TaskDescription {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = taskDescription.EZpvd;
            }
            return taskDescription.KWHzl(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new TaskDescription(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) taskDescription.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) taskDescription.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "QuestionAndAnswerBean(questionContent=" + this.AEQbTJ + ", answerContent=" + this.EZpvd + ")";
        }

        public TaskDescription(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.AEQbTJ = str;
            this.EZpvd = str2;
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
