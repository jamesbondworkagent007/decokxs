package o;

import android.view.View;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oqU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C37259oqU extends AbstractC43310rmq<C37248oqJ, nNO> {
    public Activity OLrzqt;

    /* JADX INFO: renamed from: o.oqU$Activity */
    public interface Activity {
        void EZpvd(@NotNull RelationInfo relationInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Activity EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Activity activity) {
        this.OLrzqt = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C35399nuc.Dialog.RAQtXZ;
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
    public void onBindViewHolder(@NotNull C43312rms<nNO> c43312rms, @NotNull C37248oqJ c37248oqJ) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(c37248oqJ, "");
        super.onBindViewHolder((C43312rms) c43312rms, c37248oqJ);
        nNO nno = (nNO) c43312rms.OLrzqt();
        C37241oqC c37241oqC = C37241oqC.AEQbTJ;
        C33933nLf c33933nLf = nno.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c33933nLf, "");
        c37241oqC.AEQbTJ(c33933nLf, c37248oqJ.OLrzqt());
        C33933nLf c33933nLf2 = nno.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c33933nLf2, "");
        java.lang.String phoneRawNumber = c37248oqJ.OLrzqt().getPhoneRawNumber();
        c37241oqC.OLrzqt(c33933nLf2, phoneRawNumber != null ? phoneRawNumber : "");
        android.view.View view = c43312rms.itemView;
        view.setOnClickListener(new ActionBar(view, 1000L, this, c37248oqJ));
    }

    /* JADX INFO: renamed from: o.oqU$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C37259oqU AEQbTJ;
        public final /* synthetic */ C37248oqJ KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C37259oqU c37259oqU, C37248oqJ c37248oqJ) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = c37259oqU;
            this.KWHzl = c37248oqJ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Activity activityEZpvd = this.AEQbTJ.EZpvd();
                if (activityEZpvd != null) {
                    activityEZpvd.EZpvd(this.KWHzl.OLrzqt());
                }
            }
        }
    }
}
