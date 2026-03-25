package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.timepicker.TimeModel;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.crcore.coreapi.service.IMarketApiService;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C18933frk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.frk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18933frk extends androidx.recyclerview.widget.ListAdapter<C18927fre, TaskDescription> {
    public final android.content.Context AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.util.Map<java.lang.Integer, android.os.CountDownTimer> KWHzl;
    public final Function1<C18927fre, Unit> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.fre, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C18933frk(@NotNull android.content.Context context, @NotNull Function1<? super C18927fre, Unit> function1) {
        super(new C18931fri());
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = context;
        this.OLrzqt = function1;
        this.KWHzl = new LinkedHashMap();
        this.EZpvd = "00";
    }

    /* JADX INFO: renamed from: o.frk$TaskDescription */
    public final class TaskDescription extends RecyclerView.ViewHolder {
        public C18927fre EZpvd;
        public final /* synthetic */ C18933frk OLrzqt;
        public final C17173exm copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C18933frk c18933frk, C17173exm c17173exm) {
            super(c17173exm.getRoot());
            Intrinsics.checkNotNullParameter(c17173exm, "");
            this.OLrzqt = c18933frk;
            this.copydefault = c17173exm;
        }

        public final void EZpvd(@NotNull final C18927fre c18927fre, @NotNull final Function1<? super C18927fre, Unit> function1) {
            Intrinsics.checkNotNullParameter(c18927fre, "");
            Intrinsics.checkNotNullParameter(function1, "");
            C17173exm c17173exm = this.copydefault;
            this.EZpvd = c18927fre;
            c17173exm.KWHzl.setText(c18927fre.AEQbTJ());
            c17173exm.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.frj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C18933frk.TaskDescription.copydefault(function1, c18927fre, view);
                }
            });
            KWHzl(c18927fre);
        }

        public static final void copydefault(Function1 function1, C18927fre c18927fre, android.view.View view) {
            function1.invoke(c18927fre);
        }

        public final void KWHzl(@NotNull C18927fre c18927fre) {
            Intrinsics.checkNotNullParameter(c18927fre, "");
            long jValueOf = C33129mqd.valueOf(c18927fre.OLrzqt()) - (java.lang.System.currentTimeMillis() / ((long) 1000));
            if (jValueOf <= 0) {
                this.copydefault.OLrzqt.setText(this.OLrzqt.EZpvd);
                this.copydefault.gEmmrt.setText(this.OLrzqt.EZpvd);
                this.copydefault.AYXKKw.setText(this.OLrzqt.EZpvd);
                this.copydefault.valueOf.setText(this.OLrzqt.EZpvd);
                return;
            }
            long j = RemoteMessageConst.DEFAULT_TTL;
            long j2 = IMarketApiService.SIXTY_MINUTES;
            long j3 = 60;
            android.widget.TextView textView = this.copydefault.OLrzqt;
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            java.lang.String str = java.lang.String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(jValueOf / j)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            textView.setText(str);
            android.widget.TextView textView2 = this.copydefault.gEmmrt;
            java.lang.String str2 = java.lang.String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf((jValueOf % j) / j2)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            textView2.setText(str2);
            android.widget.TextView textView3 = this.copydefault.AYXKKw;
            java.lang.String str3 = java.lang.String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf((jValueOf % j2) / j3)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "");
            textView3.setText(str3);
            android.widget.TextView textView4 = this.copydefault.valueOf;
            java.lang.String str4 = java.lang.String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(jValueOf % j3)}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, "");
            textView4.setText(str4);
        }

        public final void KWHzl() {
            C18927fre c18927fre = this.EZpvd;
            if (c18927fre != null) {
                C18933frk c18933frk = this.OLrzqt;
                OLrzqt();
                long j = 1000;
                long jValueOf = C33129mqd.valueOf(c18927fre.OLrzqt()) - (java.lang.System.currentTimeMillis() / j);
                if (jValueOf <= 0) {
                    KWHzl(c18927fre);
                    return;
                }
                Activity activity = new Activity(c18927fre, c18933frk, jValueOf * j);
                c18933frk.KWHzl.put(java.lang.Integer.valueOf(hashCode()), activity);
                activity.start();
            }
        }

        /* JADX INFO: renamed from: o.frk$TaskDescription$Activity */
        public static final class Activity extends android.os.CountDownTimer {
            public final /* synthetic */ C18927fre EZpvd;
            public final /* synthetic */ C18933frk OLrzqt;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(C18927fre c18927fre, C18933frk c18933frk, long j) {
                super(j, 1000L);
                this.EZpvd = c18927fre;
                this.OLrzqt = c18933frk;
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                TaskDescription.this.KWHzl(this.EZpvd);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                TaskDescription.this.KWHzl(this.EZpvd);
                this.OLrzqt.KWHzl.remove(java.lang.Integer.valueOf(TaskDescription.this.hashCode()));
            }
        }

        public final void OLrzqt() {
            android.os.CountDownTimer countDownTimer = (android.os.CountDownTimer) this.OLrzqt.KWHzl.get(java.lang.Integer.valueOf(hashCode()));
            if (countDownTimer != null) {
                C18933frk c18933frk = this.OLrzqt;
                countDownTimer.cancel();
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C17173exm c17173exmKWHzl = C17173exm.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c17173exmKWHzl, "");
        return new TaskDescription(this, c17173exmKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, int i) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C18927fre item = getItem(i);
        Intrinsics.copydefault(item);
        taskDescription.EZpvd(item, this.OLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        super.onViewAttachedToWindow(taskDescription);
        taskDescription.KWHzl();
    }

    /* JADX DEBUG: Method merged with bridge method: onViewDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        super.onViewDetachedFromWindow(taskDescription);
        taskDescription.OLrzqt();
    }

    /* JADX DEBUG: Method merged with bridge method: onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        super.onViewRecycled(taskDescription);
        taskDescription.OLrzqt();
    }

    public final void copydefault() {
        java.util.Iterator<T> it = this.KWHzl.values().iterator();
        while (it.hasNext()) {
            ((android.os.CountDownTimer) it.next()).cancel();
        }
        this.KWHzl.clear();
    }
}
