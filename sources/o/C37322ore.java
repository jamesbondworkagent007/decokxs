package o;

import android.view.View;
import com.okinc.okimcore.model.other.VipManagerRelationInfo;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ore, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C37322ore extends AbstractC43310rmq<VipManagerRelationInfo, nNO> {
    public Application copydefault;

    /* JADX INFO: renamed from: o.ore$Application */
    public interface Application {
        void copydefault(@NotNull VipManagerRelationInfo vipManagerRelationInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Application EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Application application) {
        this.copydefault = application;
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
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<nNO> c43312rms, @NotNull VipManagerRelationInfo vipManagerRelationInfo) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(vipManagerRelationInfo, "");
        super.onBindViewHolder((C43312rms) c43312rms, vipManagerRelationInfo);
        nNO nno = (nNO) c43312rms.OLrzqt();
        C37241oqC c37241oqC = C37241oqC.AEQbTJ;
        C33933nLf c33933nLf = nno.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c33933nLf, "");
        c37241oqC.AEQbTJ(c33933nLf, vipManagerRelationInfo.getRelationInfo());
        android.widget.TextView textView = nno.EZpvd.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        android.view.View view = c43312rms.itemView;
        view.setOnClickListener(new Activity(view, 1000L, this, vipManagerRelationInfo));
    }

    /* JADX INFO: renamed from: o.ore$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C37322ore AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ VipManagerRelationInfo OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C37322ore c37322ore, VipManagerRelationInfo vipManagerRelationInfo) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = c37322ore;
            this.OLrzqt = vipManagerRelationInfo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Application applicationEZpvd = this.AEQbTJ.EZpvd();
                if (applicationEZpvd != null) {
                    applicationEZpvd.copydefault(this.OLrzqt);
                }
            }
        }
    }
}
