package o;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.library.drawline.DrawLineData;
import com.okinc.kline.ui.view.model.LineToolItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C39804pzJ;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pzJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39804pzJ extends android.widget.PopupWindow {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public RecyclerView AEQbTJ;
    public int EZpvd;
    public Function1<? super java.lang.Integer, Unit> KWHzl;
    public java.util.ArrayList<LineToolItem> OLrzqt;
    public android.view.View djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    /* JADX INFO: renamed from: o.pzJ$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pzJ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C39804pzJ OLrzqt(int i, @NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new C39804pzJ(i, context);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39804pzJ(int i, @NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = new java.util.ArrayList<>();
        this.EZpvd = i;
        copydefault(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39804pzJ(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.OLrzqt = new java.util.ArrayList<>();
        this.EZpvd = 100;
        copydefault(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39804pzJ(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.OLrzqt = new java.util.ArrayList<>();
        this.EZpvd = 100;
        copydefault(context);
    }

    public final void copydefault(android.content.Context context) {
        setContentView(android.view.View.inflate(context, C35964oKf.Application.RZNAhV, null));
        setTouchable(true);
        setFocusable(true);
        setOutsideTouchable(false);
        setWidth(-2);
        setHeight(-2);
        AEQbTJ(context);
        setBackgroundDrawable(new ColorDrawable(0));
        this.djBIcL = getContentView().findViewById(C35964oKf.StateListAnimator.getServiceComponent);
        this.AEQbTJ = (RecyclerView) getContentView().findViewById(C35964oKf.StateListAnimator.OFQuKP);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(1);
        RecyclerView recyclerView = this.AEQbTJ;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView2 = this.AEQbTJ;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(new Application(this, context));
        }
        android.view.View view = this.djBIcL;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: o.pzF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C39804pzJ.EZpvd(this.EZpvd, view2);
                }
            });
        }
    }

    public static final void EZpvd(C39804pzJ c39804pzJ, android.view.View view) {
        c39804pzJ.dismiss();
    }

    public final void AEQbTJ(android.content.Context context) {
        java.util.ArrayList<LineToolItem> arrayList = this.OLrzqt;
        if (arrayList != null) {
            arrayList.clear();
        }
        int i = this.EZpvd;
        if (i == 100) {
            java.util.ArrayList<LineToolItem> arrayList2 = this.OLrzqt;
            if (arrayList2 != null) {
                java.lang.String string = context.getString(C35964oKf.Fragment.UhxbNG);
                Intrinsics.checkNotNullExpressionValue(string, "");
                arrayList2.add(new LineToolItem(string, false, java.lang.Integer.valueOf(C35964oKf.Activity.gGvvIC), DrawLineData.LineType.H_SEGMENT, 2, null));
            }
            java.util.ArrayList<LineToolItem> arrayList3 = this.OLrzqt;
            if (arrayList3 != null) {
                java.lang.String string2 = context.getString(C35964oKf.Fragment.UscePu);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                arrayList3.add(new LineToolItem(string2, false, java.lang.Integer.valueOf(C35964oKf.Activity.fvQaOB), DrawLineData.LineType.H_LINE, 2, null));
            }
            java.util.ArrayList<LineToolItem> arrayList4 = this.OLrzqt;
            if (arrayList4 != null) {
                java.lang.String string3 = context.getString(C35964oKf.Fragment.akftKQ);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                arrayList4.add(new LineToolItem(string3, false, java.lang.Integer.valueOf(C35964oKf.Activity.flVtFt), DrawLineData.LineType.H_RADIAL, 2, null));
                return;
            }
            return;
        }
        if (i != 101) {
            if (i == 200) {
                java.util.ArrayList<LineToolItem> arrayList5 = this.OLrzqt;
                if (arrayList5 != null) {
                    java.lang.String string4 = context.getString(C35964oKf.Fragment.UCQKYV);
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    arrayList5.add(new LineToolItem(string4, false, java.lang.Integer.valueOf(C35964oKf.Activity.dxcTrN), DrawLineData.LineType.G_RECTANGLE, 2, null));
                }
                java.util.ArrayList<LineToolItem> arrayList6 = this.OLrzqt;
                if (arrayList6 != null) {
                    java.lang.String string5 = context.getString(C35964oKf.Fragment.HJWChPhFGucI);
                    Intrinsics.checkNotNullExpressionValue(string5, "");
                    arrayList6.add(new LineToolItem(string5, false, java.lang.Integer.valueOf(C35964oKf.Activity.finit), DrawLineData.LineType.G_CIRCLE, 2, null));
                }
                java.util.ArrayList<LineToolItem> arrayList7 = this.OLrzqt;
                if (arrayList7 != null) {
                    java.lang.String string6 = context.getString(C35964oKf.Fragment.hwXsuq);
                    Intrinsics.checkNotNullExpressionValue(string6, "");
                    arrayList7.add(new LineToolItem(string6, false, java.lang.Integer.valueOf(C35964oKf.Activity.fZBcTu), DrawLineData.LineType.G_TRIANGLE, 2, null));
                    return;
                }
                return;
            }
            return;
        }
        java.util.ArrayList<LineToolItem> arrayList8 = this.OLrzqt;
        if (arrayList8 != null) {
            java.lang.String string7 = context.getString(C35964oKf.Fragment.RXzakW);
            Intrinsics.checkNotNullExpressionValue(string7, "");
            arrayList8.add(new LineToolItem(string7, false, java.lang.Integer.valueOf(C35964oKf.Activity.gkJEwt), DrawLineData.LineType.SEGMENT, 2, null));
        }
        java.util.ArrayList<LineToolItem> arrayList9 = this.OLrzqt;
        if (arrayList9 != null) {
            java.lang.String string8 = context.getString(C35964oKf.Fragment.aHXSQp);
            Intrinsics.checkNotNullExpressionValue(string8, "");
            arrayList9.add(new LineToolItem(string8, false, java.lang.Integer.valueOf(C35964oKf.Activity.iZzfmt), DrawLineData.LineType.LINE, 2, null));
        }
        java.util.ArrayList<LineToolItem> arrayList10 = this.OLrzqt;
        if (arrayList10 != null) {
            java.lang.String string9 = context.getString(C35964oKf.Fragment.alsFma);
            Intrinsics.checkNotNullExpressionValue(string9, "");
            arrayList10.add(new LineToolItem(string9, false, java.lang.Integer.valueOf(C35964oKf.Activity.AxsJAYaxsJAY), DrawLineData.LineType.RADIAL, 2, null));
        }
        java.util.ArrayList<LineToolItem> arrayList11 = this.OLrzqt;
        if (arrayList11 != null) {
            java.lang.String string10 = context.getString(C35964oKf.Fragment.TarCU);
            Intrinsics.checkNotNullExpressionValue(string10, "");
            arrayList11.add(new LineToolItem(string10, false, java.lang.Integer.valueOf(C35964oKf.Activity.hUfVAv), DrawLineData.LineType.ARROW, 2, null));
        }
        java.util.ArrayList<LineToolItem> arrayList12 = this.OLrzqt;
        if (arrayList12 != null) {
            java.lang.String string11 = context.getString(C35964oKf.Fragment.drbYRJ);
            Intrinsics.checkNotNullExpressionValue(string11, "");
            arrayList12.add(new LineToolItem(string11, false, java.lang.Integer.valueOf(C52761wXj.TaskDescription.sYcwUD), DrawLineData.LineType.INFO_SEGMENT, 2, null));
        }
    }

    /* JADX INFO: renamed from: o.pzJ$Application */
    /* JADX INFO: loaded from: classes16.dex */
    public final class Application extends RecyclerView.Adapter<TaskDescription> {
        public final /* synthetic */ C39804pzJ EZpvd;
        public android.content.Context KWHzl;

        public Application(@NotNull C39804pzJ c39804pzJ, android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            this.EZpvd = c39804pzJ;
            this.KWHzl = context;
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public TaskDescription onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = android.view.LayoutInflater.from(this.KWHzl).inflate(C35964oKf.Application.spnCvw, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return new TaskDescription(viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            java.util.ArrayList arrayList = this.EZpvd.OLrzqt;
            if (arrayList != null) {
                return arrayList.size();
            }
            return 0;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull TaskDescription taskDescription, final int i) {
            LineToolItem lineToolItem;
            LineToolItem lineToolItem2;
            LineToolItem lineToolItem3;
            java.lang.Integer toolImg;
            LineToolItem lineToolItem4;
            Intrinsics.checkNotNullParameter(taskDescription, "");
            android.widget.TextView textViewEZpvd = taskDescription.EZpvd();
            java.util.ArrayList arrayList = this.EZpvd.OLrzqt;
            android.graphics.drawable.Drawable drawable = null;
            textViewEZpvd.setText((arrayList == null || (lineToolItem4 = (LineToolItem) arrayList.get(i)) == null) ? null : lineToolItem4.getToolName());
            android.widget.ImageView imageViewKWHzl = taskDescription.KWHzl();
            java.util.ArrayList arrayList2 = this.EZpvd.OLrzqt;
            if (arrayList2 != null && (lineToolItem3 = (LineToolItem) arrayList2.get(i)) != null && (toolImg = lineToolItem3.getToolImg()) != null) {
                drawable = this.KWHzl.getDrawable(toolImg.intValue());
            }
            imageViewKWHzl.setBackground(drawable);
            android.widget.TextView textViewEZpvd2 = taskDescription.EZpvd();
            java.util.ArrayList arrayList3 = this.EZpvd.OLrzqt;
            boolean zIsSelect = false;
            textViewEZpvd2.setSelected((arrayList3 == null || (lineToolItem2 = (LineToolItem) arrayList3.get(i)) == null) ? false : lineToolItem2.isSelect());
            android.widget.ImageView imageViewKWHzl2 = taskDescription.KWHzl();
            java.util.ArrayList arrayList4 = this.EZpvd.OLrzqt;
            if (arrayList4 != null && (lineToolItem = (LineToolItem) arrayList4.get(i)) != null) {
                zIsSelect = lineToolItem.isSelect();
            }
            imageViewKWHzl2.setSelected(zIsSelect);
            android.view.View view = taskDescription.itemView;
            final C39804pzJ c39804pzJ = this.EZpvd;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.pzI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C39804pzJ.Application.copydefault(c39804pzJ, i, this, view2);
                }
            });
        }

        public static final void copydefault(final C39804pzJ c39804pzJ, final int i, Application application, android.view.View view) {
            LineToolItem lineToolItem;
            LineToolItem lineToolItem2;
            LineToolItem lineToolItem3;
            DrawLineData drawLineData = DrawLineData.copydefault;
            java.util.ArrayList arrayList = c39804pzJ.OLrzqt;
            drawLineData.EZpvd((arrayList == null || (lineToolItem3 = (LineToolItem) arrayList.get(i)) == null) ? null : lineToolItem3.getId());
            java.util.ArrayList arrayList2 = c39804pzJ.OLrzqt;
            java.lang.Integer numValueOf = arrayList2 != null ? java.lang.Integer.valueOf(arrayList2.size()) : null;
            Intrinsics.copydefault(numValueOf);
            int iIntValue = numValueOf.intValue();
            for (int i2 = 0; i2 < iIntValue; i2++) {
                java.util.ArrayList arrayList3 = c39804pzJ.OLrzqt;
                if (arrayList3 != null && (lineToolItem2 = (LineToolItem) arrayList3.get(i2)) != null) {
                    lineToolItem2.setSelect(false);
                }
            }
            java.util.ArrayList arrayList4 = c39804pzJ.OLrzqt;
            if (arrayList4 != null && (lineToolItem = (LineToolItem) arrayList4.get(i)) != null) {
                lineToolItem.setSelect(true);
            }
            application.notifyDataSetChanged();
            c39804pzJ.dismiss();
            Function1 function1 = c39804pzJ.KWHzl;
            if (function1 != null) {
                function1.invoke(0);
            }
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("KLine_DrawingToolSidebar_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pzH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39804pzJ.Application.copydefault(c39804pzJ, i, (EventParamsList) obj);
                }
            });
        }

        public static final Unit copydefault(C39804pzJ c39804pzJ, int i, EventParamsList eventParamsList) {
            LineToolItem lineToolItem;
            DrawLineData.LineType id;
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            java.util.ArrayList arrayList = c39804pzJ.OLrzqt;
            eventParamsList.put("app_drawing_tool_type", C33129mqd.gEmmrt((arrayList == null || (lineToolItem = (LineToolItem) arrayList.get(i)) == null || (id = lineToolItem.getId()) == null) ? null : id.getStrName()), true);
            eventParamsList.put("terminal", "app", true);
            eventParamsList.put("chart_type", "original", true);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.pzJ$TaskDescription */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final android.widget.ImageView AEQbTJ;
        public final android.widget.TextView OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C35964oKf.StateListAnimator.clearCurrentKeyboardTarget);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.AEQbTJ = (android.widget.ImageView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C35964oKf.StateListAnimator.OTJFaA);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.OLrzqt = (android.widget.TextView) viewFindViewById2;
        }
    }

    public final void copydefault() {
        RecyclerView.Adapter adapter;
        java.util.ArrayList<LineToolItem> arrayList = this.OLrzqt;
        if (arrayList != null) {
            java.util.Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                ((LineToolItem) it.next()).setSelect(false);
            }
        }
        RecyclerView recyclerView = this.AEQbTJ;
        if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        adapter.notifyDataSetChanged();
    }
}
