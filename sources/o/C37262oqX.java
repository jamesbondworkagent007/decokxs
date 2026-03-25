package o;

import android.view.View;
import com.okinc.okimcore.model.biz.relationlocal.PhoneRelation;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oqX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C37262oqX extends AbstractC43310rmq<C37246oqH, AbstractC34000nNs> {
    public Activity OLrzqt;

    /* JADX INFO: renamed from: o.oqX$Activity */
    public interface Activity {
        void KWHzl(@NotNull C37246oqH c37246oqH);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Activity KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Activity activity) {
        this.OLrzqt = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C35399nuc.Dialog.zzQwtT;
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
    public void onBindViewHolder(@NotNull C43312rms<AbstractC34000nNs> c43312rms, @NotNull C37246oqH c37246oqH) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(c37246oqH, "");
        super.onBindViewHolder((C43312rms) c43312rms, c37246oqH);
        nKZ nkz = ((AbstractC34000nNs) c43312rms.OLrzqt()).copydefault;
        nkz.KWHzl.setText(c37246oqH.EZpvd());
        nkz.valueOf.setText(((PhoneRelation) CollectionsKt___CollectionsKt.AuCTelauCTel(c37246oqH.OLrzqt())).getRawNumber());
        C35893oHp c35893oHp = nkz.copydefault;
        Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
        C35891oHn.EZpvd(c35893oHp, c37246oqH);
        C55251xgS c55251xgS = nkz.AEQbTJ;
        int size = c37246oqH.OLrzqt().size() - 1;
        if (size > 0) {
            c55251xgS.setVisibility(0);
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            java.lang.String str = java.lang.String.format("+%s", java.util.Arrays.copyOf(new java.lang.Object[]{C33129mqd.gEmmrt(java.lang.Integer.valueOf(size))}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            c55251xgS.setText(str);
        } else {
            c55251xgS.setVisibility(8);
        }
        android.view.View view = c43312rms.itemView;
        view.setOnClickListener(new StateListAnimator(view, 1000L, this, c37246oqH));
    }

    /* JADX INFO: renamed from: o.oqX$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C37262oqX KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C37246oqH copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C37262oqX c37262oqX, C37246oqH c37246oqH) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = c37262oqX;
            this.copydefault = c37246oqH;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Activity activityKWHzl = this.KWHzl.KWHzl();
                if (activityKWHzl != null) {
                    activityKWHzl.KWHzl(this.copydefault);
                }
            }
        }
    }
}
