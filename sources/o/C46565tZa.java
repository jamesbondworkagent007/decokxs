package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.localization.bean.LanguageItem;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.jvm.internal.Intrinsics;
import o.C46526tXp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tZa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C46565tZa extends RecyclerView.Adapter<ActionBar> {
    public final LanguageItem.NameType copydefault;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 1;
    }

    public C46565tZa(@NotNull LanguageItem.NameType nameType) {
        Intrinsics.checkNotNullParameter(nameType, "");
        this.copydefault = nameType;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C46535tXy c46535tXyAEQbTJ = C46535tXy.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()));
        Intrinsics.checkNotNullExpressionValue(c46535tXyAEQbTJ, "");
        return new ActionBar(c46535tXyAEQbTJ, this.copydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, int i) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        actionBar.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.tZa$ActionBar */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final C46535tXy AEQbTJ;
        public final LanguageItem.NameType OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C46535tXy c46535tXy, @NotNull LanguageItem.NameType nameType) {
            super(c46535tXy.getRoot());
            Intrinsics.checkNotNullParameter(c46535tXy, "");
            Intrinsics.checkNotNullParameter(nameType, "");
            this.AEQbTJ = c46535tXy;
            this.OLrzqt = nameType;
        }

        public final void AEQbTJ() {
            java.lang.String strAYXKKw;
            OKReminder oKReminder = this.AEQbTJ.OLrzqt;
            oKReminder.setCloseIconVisibility(false);
            oKReminder.setStyle(0);
            if (this.OLrzqt == LanguageItem.NameType.CEFI) {
                strAYXKKw = C33070mpX.AYXKKw(C46526tXp.TaskDescription.KWHzl);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C46526tXp.TaskDescription.OLrzqt);
            }
            oKReminder.setMessage(strAYXKKw);
            oKReminder.KWHzl().setTextAlignment(5);
            OKReminder oKReminder2 = this.AEQbTJ.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(oKReminder2, "");
            oKReminder2.setVisibility(C34703nhO.copydefault() ? 8 : 0);
        }
    }
}
