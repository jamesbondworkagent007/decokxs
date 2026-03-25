package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradeuilib.header.BizSettingItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.usJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C49634usJ extends AbstractC59533zio<BizSettingItem, ActionBar> {
    public final Function1<RecyclerView.ViewHolder, Unit> AEQbTJ;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super androidx.recyclerview.widget.RecyclerView$ViewHolder, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C49634usJ(@NotNull Function1<? super RecyclerView.ViewHolder, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC49601urd abstractC49601urdKWHzl = AbstractC49601urd.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC49601urdKWHzl, "");
        return new ActionBar(abstractC49601urdKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final ActionBar actionBar, @NotNull final BizSettingItem bizSettingItem) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(bizSettingItem, "");
        AbstractC49601urd abstractC49601urdAEQbTJ = actionBar.AEQbTJ();
        abstractC49601urdAEQbTJ.KWHzl.setTextValue(bizSettingItem.getTitle());
        abstractC49601urdAEQbTJ.AEQbTJ.setOnCheckedChangeListener(null);
        abstractC49601urdAEQbTJ.AEQbTJ.setChecked(bizSettingItem.getEnabled() || bizSettingItem.getMandatory());
        abstractC49601urdAEQbTJ.AEQbTJ.setEnabled(!bizSettingItem.getMandatory());
        abstractC49601urdAEQbTJ.AEQbTJ.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.usI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C49634usJ.EZpvd(bizSettingItem, this, compoundButton, z);
            }
        });
        abstractC49601urdAEQbTJ.OLrzqt.setOnTouchListener(new View.OnTouchListener() { // from class: o.usK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return C49634usJ.OLrzqt(this.OLrzqt, actionBar, view, motionEvent);
            }
        });
    }

    public static final void EZpvd(BizSettingItem bizSettingItem, C49634usJ c49634usJ, android.widget.CompoundButton compoundButton, boolean z) {
        bizSettingItem.setEnabled(z);
        c49634usJ.getAdapter().notifyDataSetChanged();
    }

    public static final boolean OLrzqt(C49634usJ c49634usJ, ActionBar actionBar, android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getAction() != 0) {
            return false;
        }
        c49634usJ.AEQbTJ.invoke(actionBar);
        return false;
    }

    /* JADX INFO: renamed from: o.usJ$ActionBar */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final AbstractC49601urd OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC49601urd AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull AbstractC49601urd abstractC49601urd) {
            super(abstractC49601urd.getRoot());
            Intrinsics.checkNotNullParameter(abstractC49601urd, "");
            this.OLrzqt = abstractC49601urd;
        }
    }
}
