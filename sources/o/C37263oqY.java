package o;

import android.view.View;
import com.okinc.okimcore.model.biz.relationlocal.PhoneRelation;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oqY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C37263oqY extends AbstractC43310rmq<PhoneRelation, nLN> {
    public StateListAnimator KWHzl;

    /* JADX INFO: renamed from: o.oqY$StateListAnimator */
    public interface StateListAnimator {
        void AEQbTJ(@NotNull PhoneRelation phoneRelation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(StateListAnimator stateListAnimator) {
        this.KWHzl = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateListAnimator KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C35399nuc.Dialog.gSBher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return C35342ntX.djBIcL;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<nLN> c43312rms, @NotNull PhoneRelation phoneRelation) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(phoneRelation, "");
        super.onBindViewHolder((C43312rms) c43312rms, phoneRelation);
        ((nLN) c43312rms.OLrzqt()).copydefault.setText(phoneRelation.getRawNumber());
        android.view.View view = c43312rms.itemView;
        view.setOnClickListener(new ActionBar(view, 1000L, this, phoneRelation));
    }

    /* JADX INFO: renamed from: o.oqY$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ PhoneRelation AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C37263oqY copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C37263oqY c37263oqY, PhoneRelation phoneRelation) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = c37263oqY;
            this.AEQbTJ = phoneRelation;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                StateListAnimator stateListAnimatorKWHzl = this.copydefault.KWHzl();
                if (stateListAnimatorKWHzl != null) {
                    stateListAnimatorKWHzl.AEQbTJ(this.AEQbTJ);
                }
            }
        }
    }
}
