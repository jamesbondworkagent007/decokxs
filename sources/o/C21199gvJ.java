package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gvJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C21199gvJ extends ConstraintLayout {
    public java.util.List<java.lang.String> AEQbTJ;
    public final AbstractC17070evp OLrzqt;
    public Function1<? super java.lang.Integer, Unit> copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21199gvJ(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        AbstractC17070evp abstractC17070evpOLrzqt = AbstractC17070evp.OLrzqt(android.view.LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(abstractC17070evpOLrzqt, "");
        this.OLrzqt = abstractC17070evpOLrzqt;
        this.AEQbTJ = yDY.AhwBna();
        RecyclerView recyclerView = abstractC17070evpOLrzqt.OLrzqt;
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new C31703mAu(C55298xhM.dp2px$default(24.0f, null, 1, null), 0));
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(java.lang.String.class, new Activity(C13754dXa.TaskDescription.fmB, dTV.isConnected));
        recyclerView.setAdapter(c43316rmw);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21199gvJ(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        AbstractC17070evp abstractC17070evpOLrzqt = AbstractC17070evp.OLrzqt(android.view.LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(abstractC17070evpOLrzqt, "");
        this.OLrzqt = abstractC17070evpOLrzqt;
        this.AEQbTJ = yDY.AhwBna();
        RecyclerView recyclerView = abstractC17070evpOLrzqt.OLrzqt;
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new C31703mAu(C55298xhM.dp2px$default(24.0f, null, 1, null), 0));
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(java.lang.String.class, new Activity(C13754dXa.TaskDescription.fmB, dTV.isConnected));
        recyclerView.setAdapter(c43316rmw);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21199gvJ(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        AbstractC17070evp abstractC17070evpOLrzqt = AbstractC17070evp.OLrzqt(android.view.LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(abstractC17070evpOLrzqt, "");
        this.OLrzqt = abstractC17070evpOLrzqt;
        this.AEQbTJ = yDY.AhwBna();
        RecyclerView recyclerView = abstractC17070evpOLrzqt.OLrzqt;
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new C31703mAu(C55298xhM.dp2px$default(24.0f, null, 1, null), 0));
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(java.lang.String.class, new Activity(C13754dXa.TaskDescription.fmB, dTV.isConnected));
        recyclerView.setAdapter(c43316rmw);
    }

    /* JADX INFO: renamed from: o.gvJ$Activity */
    public static final class Activity extends C43318rmy<java.lang.String, AbstractC16664eoG> {
        public Activity(int i, int i2) {
            super(i, i2);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<AbstractC16664eoG> c43312rms, java.lang.String str) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(str, "");
            super.onBindViewHolder((C43312rms) c43312rms, str);
            int iIndexOf = C21199gvJ.this.AEQbTJ.indexOf(str);
            ((AbstractC16664eoG) c43312rms.OLrzqt()).KWHzl.setText(C33069mpW.copydefault(C13754dXa.FragmentManager.sTbpmZ, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C33129mqd.addS$default(java.lang.Integer.valueOf(iIndexOf), 1, null, null, null, 14, null)))));
            ((AbstractC16664eoG) c43312rms.OLrzqt()).AEQbTJ.setText(C14079deg.EZpvd.EZpvd(str));
            android.view.View root = ((AbstractC16664eoG) c43312rms.OLrzqt()).getRoot();
            root.setOnClickListener(new Application(root, 1000L, C21199gvJ.this, iIndexOf));
        }

        /* JADX INFO: renamed from: o.gvJ$Activity$Application */
        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ C21199gvJ AEQbTJ;
            public final /* synthetic */ int EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, C21199gvJ c21199gvJ, int i) {
                this.KWHzl = view;
                this.copydefault = j;
                this.AEQbTJ = c21199gvJ;
                this.EZpvd = i;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    Function1 function1 = this.AEQbTJ.copydefault;
                    if (function1 != null) {
                        function1.invoke(java.lang.Integer.valueOf(this.EZpvd));
                    }
                }
            }
        }
    }

    public final void setData(@NotNull java.util.List<java.lang.String> list, @NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = list;
        this.copydefault = function1;
        this.OLrzqt.copydefault.setText(C33069mpW.copydefault(C13754dXa.FragmentManager.dhOYXF, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C33129mqd.gEmmrt(java.lang.Integer.valueOf(list.size()))))));
        RecyclerView.Adapter adapter = this.OLrzqt.OLrzqt.getAdapter();
        Intrinsics.copydefault(adapter, "");
        ((C43316rmw) adapter).AhwBna(list);
    }
}
