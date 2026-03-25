package o;

import android.view.View;
import com.okinc.im.bean.tag.TagSize;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC35897oHt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oqR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37256oqR implements InterfaceC35897oHt<java.lang.Object> {
    public Application copydefault;

    /* JADX INFO: renamed from: o.oqR$Application */
    public interface Application {
        void KWHzl(@NotNull RelationInfo relationInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Application AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Application application) {
        this.copydefault = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35897oHt
    public void copydefault(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
    }

    @Override // o.InterfaceC35897oHt
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj, @NotNull java.util.List<? extends java.lang.Object> list) {
        InterfaceC35897oHt.Application.AEQbTJ(this, c35895oHr, obj, list);
    }

    @Override // o.InterfaceC35897oHt
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
        if ((c35895oHr instanceof TaskDescription) && (obj instanceof RelationInfo)) {
            ((TaskDescription) c35895oHr).OLrzqt((RelationInfo) obj);
        }
    }

    @Override // o.InterfaceC35897oHt
    public boolean AEQbTJ(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return obj instanceof RelationInfo;
    }

    @Override // o.InterfaceC35897oHt
    public C35895oHr AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C34013nOe c34013nOeOLrzqt = C34013nOe.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c34013nOeOLrzqt, "");
        return new TaskDescription(this, c34013nOeOLrzqt);
    }

    /* JADX INFO: renamed from: o.oqR$TaskDescription */
    public final class TaskDescription extends C35895oHr {
        public final C34013nOe AEQbTJ;
        public final /* synthetic */ C37256oqR EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C37256oqR c37256oqR, C34013nOe c34013nOe) {
            super(c34013nOe.getRoot().getContext(), c34013nOe.getRoot());
            Intrinsics.checkNotNullParameter(c34013nOe, "");
            this.EZpvd = c37256oqR;
            this.AEQbTJ = c34013nOe;
        }

        public final void OLrzqt(@NotNull RelationInfo relationInfo) {
            Intrinsics.checkNotNullParameter(relationInfo, "");
            C34013nOe c34013nOe = this.AEQbTJ;
            C37256oqR c37256oqR = this.EZpvd;
            c34013nOe.copydefault.setText(C44157sFk.getDisplayName$default(relationInfo, null, 1, null));
            C35893oHp c35893oHp = c34013nOe.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
            C37716ozA.KWHzl(c35893oHp, relationInfo.getOfficialTags(), TagSize.DP_18);
            C35893oHp c35893oHp2 = c34013nOe.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c35893oHp2, "");
            C35891oHn.OLrzqt(c35893oHp2, relationInfo);
            c34013nOe.EZpvd.bringToFront();
            android.view.View view = this.itemView;
            view.setOnClickListener(new ActionBar(view, 1000L, c37256oqR, relationInfo));
        }

        /* JADX INFO: renamed from: o.oqR$TaskDescription$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ RelationInfo KWHzl;
            public final /* synthetic */ C37256oqR copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, C37256oqR c37256oqR, RelationInfo relationInfo) {
                this.EZpvd = view;
                this.AEQbTJ = j;
                this.copydefault = c37256oqR;
                this.KWHzl = relationInfo;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    Application applicationAEQbTJ = this.copydefault.AEQbTJ();
                    if (applicationAEQbTJ != null) {
                        applicationAEQbTJ.KWHzl(this.KWHzl);
                    }
                }
            }
        }
    }
}
