package o;

import android.view.View;
import com.okinc.im.imui.relationlist.model.ListButton;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.orc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C37320orc extends AbstractC43310rmq<ListButton, AbstractC34006nNy> {
    public Application EZpvd;

    /* JADX INFO: renamed from: o.orc$Application */
    public interface Application {
        void copydefault(@NotNull ListButton listButton);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Application copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Application application) {
        this.EZpvd = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C35399nuc.Dialog.DLGVGj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return C35342ntX.djBIcL;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC34006nNy> c43312rms, @NotNull ListButton listButton) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(listButton, "");
        super.onBindViewHolder((C43312rms) c43312rms, listButton);
        AbstractC34006nNy abstractC34006nNy = (AbstractC34006nNy) c43312rms.OLrzqt();
        abstractC34006nNy.copydefault.setText(C33070mpX.AYXKKw(listButton.getDescription()));
        abstractC34006nNy.KWHzl.setImageDrawable(C33070mpX.KWHzl(listButton.getIconRes()));
        android.view.View view = c43312rms.itemView;
        view.setOnClickListener(new ActionBar(view, 1000L, this, listButton));
    }

    /* JADX INFO: renamed from: o.orc$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C37320orc AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ ListButton OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C37320orc c37320orc, ListButton listButton) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = c37320orc;
            this.OLrzqt = listButton;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Application applicationCopydefault = this.AEQbTJ.copydefault();
                if (applicationCopydefault != null) {
                    applicationCopydefault.copydefault(this.OLrzqt);
                }
            }
        }
    }
}
