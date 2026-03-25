package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC55524xla;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nmm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34986nmm extends AbstractC59533zio<AbstractC55524xla.StateListAnimator, TaskDescription> {
    public InterfaceC34987nmn OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C34986nmm() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public C34986nmm(InterfaceC34987nmn interfaceC34987nmn, int i) {
        this.OLrzqt = interfaceC34987nmn;
        this.copydefault = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:o.nmn:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.nmn) : (r1v0 o.nmn))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.qZH.ActionBar.gVEiQJ int) : (r2v0 int))
 A[MD:(o.nmn, int):void (m)] (LINE:61) call: o.nmm.<init>(o.nmn, int):void type: THIS */
    public /* synthetic */ C34986nmm(InterfaceC34987nmn interfaceC34987nmn, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : interfaceC34987nmn, (i2 & 2) != 0 ? qZH.ActionBar.gVEiQJ : i);
    }

    /* JADX INFO: renamed from: o.nmm$TaskDescription */
    public static final class TaskDescription extends C34910nlP {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(this.copydefault, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new TaskDescription(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, @NotNull AbstractC55524xla.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        C34984nmk.KWHzl(this.OLrzqt, taskDescription, stateListAnimator.valueOf());
    }
}
