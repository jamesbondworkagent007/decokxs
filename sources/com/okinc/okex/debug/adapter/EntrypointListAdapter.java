package com.okinc.okex.debug.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.okex.debug.adapter.EntrypointListAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC45381soi;
import o.C33070mpX;
import o.C52761wXj;
import o.C52794wYp;
import o.C55296xhK;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class EntrypointListAdapter extends AbstractC45381soi<StateListAnimator, RecyclerView.ViewHolder> {
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.spr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(EntrypointListAdapter.EZpvd());
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.spt
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(EntrypointListAdapter.AEQbTJ());
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.spv
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return EntrypointListAdapter.OLrzqt(this.AEQbTJ);
        }
    });

    public static abstract class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.debug.adapter.EntrypointListAdapter.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static final class Activity extends StateListAnimator {
            public final String OLrzqt;
            public final Function0<Unit> copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.debug.adapter.EntrypointListAdapter$StateListAnimator$Activity */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Activity copy$default(Activity activity, String str, Function0 function0, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = activity.OLrzqt;
                }
                if ((i & 2) != 0) {
                    function0 = activity.copydefault;
                }
                return activity.OLrzqt(str, function0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Function0<Unit> KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity OLrzqt(@NotNull String str, @NotNull Function0<Unit> function0) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(function0, "");
                return new Activity(str, function0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Activity)) {
                    return false;
                }
                Activity activity = (Activity) obj;
                return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) activity.OLrzqt) && Intrinsics.EZpvd(this.copydefault, activity.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "EntrypointItem(text=" + this.OLrzqt + ", action=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull String str, @NotNull Function0<Unit> function0) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(function0, "");
                this.OLrzqt = str;
                this.copydefault = function0;
            }
        }

        public static final class ActionBar extends StateListAnimator {
            public final String KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = actionBar.KWHzl;
                }
                return actionBar.KWHzl(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar KWHzl(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new ActionBar(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionBar) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) ((ActionBar) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "EntrypointHeader(text=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.KWHzl = str;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class EntrypointType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ EntrypointType[] $VALUES;
        public static final EntrypointType ENTRYPOINT_HEADER = new EntrypointType("ENTRYPOINT_HEADER", 0);
        public static final EntrypointType ENTRYPOINT_ITEM = new EntrypointType("ENTRYPOINT_ITEM", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ EntrypointType[] $values() {
            return new EntrypointType[]{ENTRYPOINT_HEADER, ENTRYPOINT_ITEM};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<EntrypointType> getEntries() {
            return $ENTRIES;
        }

        private EntrypointType(String str, int i) {
        }

        static {
            EntrypointType[] entrypointTypeArr$values = $values();
            $VALUES = entrypointTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(entrypointTypeArr$values);
        }

        public static EntrypointType valueOf(String str) {
            return (EntrypointType) Enum.valueOf(EntrypointType.class, str);
        }

        public static EntrypointType[] values() {
            return (EntrypointType[]) $VALUES.clone();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC45381soi
    public boolean KWHzl(@NotNull StateListAnimator stateListAnimator, @NotNull StateListAnimator stateListAnimator2) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(stateListAnimator2, "");
        return ((stateListAnimator instanceof StateListAnimator.ActionBar) && (stateListAnimator2 instanceof StateListAnimator.ActionBar)) || ((stateListAnimator instanceof StateListAnimator.Activity) && (stateListAnimator2 instanceof StateListAnimator.Activity));
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // o.AbstractC45381soi
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean copydefault(@NotNull StateListAnimator stateListAnimator, @NotNull StateListAnimator stateListAnimator2) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(stateListAnimator2, "");
        if ((stateListAnimator instanceof StateListAnimator.ActionBar) && (stateListAnimator2 instanceof StateListAnimator.ActionBar)) {
            return Intrinsics.EZpvd((Object) ((StateListAnimator.ActionBar) stateListAnimator).AEQbTJ(), (Object) ((StateListAnimator.ActionBar) stateListAnimator2).AEQbTJ());
        }
        if ((stateListAnimator instanceof StateListAnimator.Activity) && (stateListAnimator2 instanceof StateListAnimator.Activity)) {
            return Intrinsics.EZpvd((Object) ((StateListAnimator.Activity) stateListAnimator).AEQbTJ(), (Object) ((StateListAnimator.Activity) stateListAnimator2).AEQbTJ());
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (copydefault().getCurrentList().get(i) instanceof StateListAnimator.ActionBar) {
            return EntrypointType.ENTRYPOINT_HEADER.ordinal();
        }
        return EntrypointType.ENTRYPOINT_ITEM.ordinal();
    }

    public final int AYXKKw() {
        return ((Number) this.OLrzqt.getValue()).intValue();
    }

    public static final int EZpvd() {
        return C33070mpX.OLrzqt(C52761wXj.StateListAnimator.ODWQjV);
    }

    public final int djBIcL() {
        return ((Number) this.EZpvd.getValue()).intValue();
    }

    public static final int AEQbTJ() {
        return C33070mpX.OLrzqt(C52761wXj.StateListAnimator.ffGIBT);
    }

    public final ViewGroup.MarginLayoutParams valueOf() {
        return (ViewGroup.MarginLayoutParams) this.KWHzl.getValue();
    }

    public static final ViewGroup.MarginLayoutParams OLrzqt(EntrypointListAdapter entrypointListAdapter) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(entrypointListAdapter.AYXKKw(), entrypointListAdapter.djBIcL(), entrypointListAdapter.AYXKKw(), entrypointListAdapter.djBIcL());
        return marginLayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        if (i == EntrypointType.ENTRYPOINT_HEADER.ordinal()) {
            TextView textView = new TextView(viewGroup.getContext());
            textView.setLayoutParams(valueOf());
            textView.setTextAppearance(C52761wXj.LoaderManager.AubY);
            return new ActionBar(this, textView);
        }
        if (i == EntrypointType.ENTRYPOINT_ITEM.ordinal()) {
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C52794wYp c52794wYp = new C52794wYp(context, null, 0, 6, null);
            c52794wYp.setLayoutParams(valueOf());
            c52794wYp.setOKDSType(258);
            c52794wYp.setOKDSSize(52);
            return new Activity(this, c52794wYp);
        }
        throw new IllegalArgumentException("Invalid viewType: " + i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        if (viewHolder instanceof Activity) {
            StateListAnimator stateListAnimator = copydefault().getCurrentList().get(i);
            Intrinsics.copydefault(stateListAnimator, "");
            ((Activity) viewHolder).OLrzqt((StateListAnimator.Activity) stateListAnimator);
        } else if (viewHolder instanceof ActionBar) {
            StateListAnimator stateListAnimator2 = copydefault().getCurrentList().get(i);
            Intrinsics.copydefault(stateListAnimator2, "");
            ((ActionBar) viewHolder).copydefault((StateListAnimator.ActionBar) stateListAnimator2);
        }
    }

    public final class ActionBar extends RecyclerView.ViewHolder {
        public final TextView AEQbTJ;
        public final /* synthetic */ EntrypointListAdapter KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull EntrypointListAdapter entrypointListAdapter, TextView textView) {
            super(textView);
            Intrinsics.checkNotNullParameter(textView, "");
            this.KWHzl = entrypointListAdapter;
            this.AEQbTJ = textView;
        }

        public final void copydefault(@NotNull StateListAnimator.ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            this.AEQbTJ.setText(actionBar.AEQbTJ());
        }
    }

    public final class Activity extends RecyclerView.ViewHolder {
        public final /* synthetic */ EntrypointListAdapter EZpvd;
        public final C52794wYp KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull EntrypointListAdapter entrypointListAdapter, C52794wYp c52794wYp) {
            super(c52794wYp);
            Intrinsics.checkNotNullParameter(c52794wYp, "");
            this.EZpvd = entrypointListAdapter;
            this.KWHzl = c52794wYp;
        }

        public final void OLrzqt(@NotNull StateListAnimator.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            C52794wYp c52794wYp = this.KWHzl;
            c52794wYp.setText(activity.AEQbTJ());
            c52794wYp.setOnClickListener(new ViewOnClickListenerC0544Activity(c52794wYp, 1000L, activity));
        }

        /* JADX INFO: renamed from: com.okinc.okex.debug.adapter.EntrypointListAdapter$Activity$Activity, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0544Activity implements View.OnClickListener {
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ View KWHzl;
            public final /* synthetic */ StateListAnimator.Activity copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0544Activity(View view, long j, StateListAnimator.Activity activity) {
                this.KWHzl = view;
                this.EZpvd = j;
                this.copydefault = activity;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    this.copydefault.KWHzl().invoke();
                }
            }
        }
    }
}
