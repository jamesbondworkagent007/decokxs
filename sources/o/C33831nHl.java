package o;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nHl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33831nHl extends nGR {
    public TaskDescription AEQbTJ;
    public final java.lang.String KWHzl = "SearchViewProvider";

    /* JADX INFO: renamed from: o.nHl$TaskDescription */
    public interface TaskDescription {
        void copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TaskDescription AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(TaskDescription taskDescription) {
        this.AEQbTJ = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35897oHt
    public void copydefault(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
    }

    /* JADX INFO: renamed from: o.nHl$ActionBar */
    public final class ActionBar extends C35895oHr {
        public final nOR EZpvd;
        public final /* synthetic */ C33831nHl OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C33831nHl c33831nHl, nOR nor) {
            super(nor.getRoot().getContext(), nor.getRoot());
            Intrinsics.checkNotNullParameter(nor, "");
            this.OLrzqt = c33831nHl;
            this.EZpvd = nor;
        }

        public final void AEQbTJ() {
            C55230xfy c55230xfy = this.EZpvd.EZpvd;
            c55230xfy.setOnClickListener(new Activity(c55230xfy, 1000L, this.OLrzqt));
        }

        /* JADX INFO: renamed from: o.nHl$ActionBar$Activity */
        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ C33831nHl AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ android.view.View KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, C33831nHl c33831nHl) {
                this.KWHzl = view;
                this.EZpvd = j;
                this.AEQbTJ = c33831nHl;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    TaskDescription taskDescriptionAEQbTJ = this.AEQbTJ.AEQbTJ();
                    if (taskDescriptionAEQbTJ != null) {
                        taskDescriptionAEQbTJ.copydefault();
                    }
                }
            }
        }
    }

    @Override // o.InterfaceC35897oHt
    public C35895oHr AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        nOR norCopydefault = nOR.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(norCopydefault, "");
        return new ActionBar(this, norCopydefault);
    }

    @Override // o.InterfaceC35897oHt
    public boolean AEQbTJ(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return obj instanceof nGN;
    }

    @Override // o.nGR, o.InterfaceC35897oHt
    public void AEQbTJ(@NotNull C35895oHr c35895oHr, @NotNull java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(c35895oHr, "");
        Intrinsics.checkNotNullParameter(obj, "");
        super.AEQbTJ(c35895oHr, obj, i);
        if ((obj instanceof nGN) && (c35895oHr instanceof ActionBar)) {
            ((ActionBar) c35895oHr).AEQbTJ();
        } else {
            pUU.copydefault(this.KWHzl, "Incorrect holder type");
        }
    }
}
