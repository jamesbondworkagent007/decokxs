package o;

import android.view.View;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48931uew;
import o.C48974ufm;
import o.C49197ujx;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ujx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C49197ujx extends AbstractC48907ueY {
    public final java.util.ArrayList<java.lang.String> AhwBna;
    public final int EZpvd = C48931uew.Application.AhwBna;
    public final C59534zip djBIcL;
    public C49020ugf gEmmrt;
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public static final C48974ufm.Activity<kotlin.Pair<java.lang.Integer, java.lang.String>> OLrzqt = new C48974ufm.Activity<>("demo_thumbnail_click", 0, 2, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.EZpvd;
    }

    public C49197ujx() {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        this.AhwBna = arrayList;
        this.djBIcL = new C59534zip(arrayList);
    }

    /* JADX INFO: renamed from: o.ujx$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ujx.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C48974ufm.Activity<kotlin.Pair<java.lang.Integer, java.lang.String>> OLrzqt() {
            return C49197ujx.OLrzqt;
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C49020ugf c49020ugfKWHzl = C49020ugf.KWHzl(view);
        Intrinsics.copydefault(c49020ugfKWHzl);
        this.gEmmrt = c49020ugfKWHzl;
        this.AhwBna.addAll(yDY.gEmmrt("1", "2", "3", "4", "5", OrderDetailListItem.SLIP_OUT, "7", "8", "9", "10"));
        C49020ugf c49020ugf = this.gEmmrt;
        C49020ugf c49020ugf2 = null;
        if (c49020ugf == null) {
            Intrinsics.gEmmrt("");
            c49020ugf = null;
        }
        c49020ugf.KWHzl.setLayoutManager(C33047mpA.OLrzqt(requireContext()));
        C57583ylE c57583ylE = new C57583ylE(C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null), false, false);
        C49020ugf c49020ugf3 = this.gEmmrt;
        if (c49020ugf3 == null) {
            Intrinsics.gEmmrt("");
            c49020ugf3 = null;
        }
        c49020ugf3.KWHzl.addItemDecoration(c57583ylE);
        this.djBIcL.register(java.lang.String.class, new TaskDescription(new Function2() { // from class: o.ujy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C49197ujx.KWHzl(this.EZpvd, ((java.lang.Integer) obj).intValue(), (java.lang.String) obj2);
            }
        }));
        C49020ugf c49020ugf4 = this.gEmmrt;
        if (c49020ugf4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c49020ugf2 = c49020ugf4;
        }
        c49020ugf2.KWHzl.setAdapter(this.djBIcL);
    }

    public static final Unit KWHzl(C49197ujx c49197ujx, int i, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c49197ujx.copydefault().OLrzqt(OLrzqt, new kotlin.Pair(java.lang.Integer.valueOf(i), str));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.ujx$TaskDescription */
    public static final class TaskDescription extends AbstractC43310rmq<java.lang.String, AbstractC49030ugp> {
        public final Function2<java.lang.Integer, java.lang.String, Unit> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C48931uew.Application.fIwbmz;
        }

        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(@NotNull Function2<? super java.lang.Integer, ? super java.lang.String, Unit> function2) {
            Intrinsics.checkNotNullParameter(function2, "");
            this.EZpvd = function2;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull final C43312rms<AbstractC49030ugp> c43312rms, @NotNull final java.lang.String str) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(str, "");
            super.onBindViewHolder((C43312rms) c43312rms, str);
            ((AbstractC49030ugp) c43312rms.OLrzqt()).EZpvd.setImageResource(C52761wXj.TaskDescription.svhCHd);
            c43312rms.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.uju
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C49197ujx.TaskDescription.copydefault(this.OLrzqt, c43312rms, str, view);
                }
            });
        }

        public static final void copydefault(TaskDescription taskDescription, C43312rms c43312rms, java.lang.String str, android.view.View view) {
            taskDescription.EZpvd.invoke(java.lang.Integer.valueOf(c43312rms.getAdapterPosition()), str);
        }
    }
}
