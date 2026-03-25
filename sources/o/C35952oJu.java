package o;

import android.graphics.PorterDuff;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C35952oJu;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oJu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35952oJu extends RecyclerView {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C35952oJu(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C35952oJu(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:21) call: o.oJu.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C35952oJu(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35952oJu(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void setActionButtons(@NotNull java.util.List<C35951oJt> list, @NotNull Function1<? super C35951oJt, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (AEQbTJ(list)) {
            setupButtonList(list, function1);
        }
    }

    public final boolean AEQbTJ(java.util.List<C35951oJt> list) {
        if (list.isEmpty()) {
            pUU.KWHzl("QuickActionView", "action button list is empty");
            return false;
        }
        if (list.size() < 3 || list.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((C35951oJt) it.next()).copydefault() == 0) {
                pUU.KWHzl("QuickActionView", "action button list item have icon resource missed");
                return false;
            }
        }
        return true;
    }

    public final void setupButtonList(java.util.List<C35951oJt> list, Function1<? super C35951oJt, Unit> function1) {
        AbstractC59533zio stateListAnimator;
        setLayoutManager(new GridLayoutManager(getContext(), list.size(), 1, false));
        if (getItemDecorationCount() != 0) {
            removeItemDecorationAt(0);
        }
        addItemDecoration(new C55370xif(C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null), 0, list.size()));
        C59534zip c59534zip = new C59534zip();
        if (list.size() <= 2) {
            stateListAnimator = new ActionBar(this, function1);
        } else {
            stateListAnimator = new StateListAnimator(this, function1);
        }
        c59534zip.register(C35951oJt.class, stateListAnimator);
        c59534zip.setItems(list);
        setAdapter(c59534zip);
    }

    /* JADX INFO: renamed from: o.oJu$ActionBar */
    public final class ActionBar extends AbstractC43310rmq<C35951oJt, nLQ> {
        public final Function1<C35951oJt, Unit> KWHzl;
        public final /* synthetic */ C35952oJu OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C35399nuc.Dialog.gUEfcq;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return C35342ntX.djBIcL;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.oJt, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(@NotNull C35952oJu c35952oJu, Function1<? super C35951oJt, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = c35952oJu;
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<nLQ> c43312rms, @NotNull final C35951oJt c35951oJt) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(c35951oJt, "");
            C52794wYp c52794wYp = ((nLQ) c43312rms.OLrzqt()).AEQbTJ;
            c52794wYp.setText(c35951oJt.EZpvd());
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.oJB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C35952oJu.ActionBar.AEQbTJ(this.AEQbTJ, c35951oJt, view);
                }
            });
        }

        public static final void AEQbTJ(ActionBar actionBar, C35951oJt c35951oJt, android.view.View view) {
            actionBar.KWHzl.invoke(c35951oJt);
        }
    }

    /* JADX INFO: renamed from: o.oJu$StateListAnimator */
    public final class StateListAnimator extends AbstractC43310rmq<C35951oJt, nLL> {
        public final Function1<C35951oJt, Unit> AEQbTJ;
        public final /* synthetic */ C35952oJu EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C35399nuc.Dialog.fsSxsn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return C35342ntX.djBIcL;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.oJt, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(@NotNull C35952oJu c35952oJu, Function1<? super C35951oJt, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = c35952oJu;
            this.AEQbTJ = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<nLL> c43312rms, @NotNull final C35951oJt c35951oJt) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(c35951oJt, "");
            wYB wyb = ((nLL) c43312rms.OLrzqt()).AEQbTJ;
            wyb.AEQbTJ().setText(c35951oJt.EZpvd());
            wyb.OLrzqt().setImageResource(c35951oJt.copydefault());
            wyb.OLrzqt().setColorFilter(ContextCompat.getColor(wyb.getContext(), C52761wXj.Activity.htlTjW), PorterDuff.Mode.SRC_IN);
            wyb.setOnClickListener(new View.OnClickListener() { // from class: o.oJw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C35952oJu.StateListAnimator.copydefault(this.OLrzqt, c35951oJt, view);
                }
            });
        }

        public static final void copydefault(StateListAnimator stateListAnimator, C35951oJt c35951oJt, android.view.View view) {
            stateListAnimator.AEQbTJ.invoke(c35951oJt);
        }
    }

    /* JADX INFO: renamed from: o.oJu$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oJu.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
