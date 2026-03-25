package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC17448fFs;
import o.C13754dXa;
import o.C17543fJf;
import o.fDP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fJf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C17543fJf implements fDP {
    public final Function1<ActivityC17448fFs.Application, Unit> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.fFs$Application, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C17543fJf(@NotNull Function1<? super ActivityC17448fFs.Application, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    @Override // o.fDP
    public void AEQbTJ(@NotNull RecyclerView.ViewHolder viewHolder) {
        fDP.Activity.copydefault(this, viewHolder);
    }

    @Override // o.fDP
    public RecyclerView.ViewHolder AEQbTJ(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C13754dXa.TaskDescription.OzhFjl, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new ActionBar(viewInflate);
    }

    @Override // o.fDP
    public void OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull final java.lang.Object obj, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(obj, "");
        ((ActionBar) viewHolder).EZpvd((ActivityC17448fFs.Application) obj);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.fJj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C17543fJf.KWHzl(this.OLrzqt, obj, view);
            }
        });
    }

    public static final void KWHzl(C17543fJf c17543fJf, java.lang.Object obj, android.view.View view) {
        c17543fJf.KWHzl.invoke(obj);
    }

    /* JADX INFO: renamed from: o.fJf$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final android.widget.TextView AEQbTJ;
        public final C55251xgS EZpvd;
        public final android.widget.ImageView KWHzl;
        public final android.widget.TextView OLrzqt;
        public final InterfaceC56387yDm copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.OLrzqt = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.onSessionEvent);
            this.AEQbTJ = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.getIControllerCallback);
            this.EZpvd = (C55251xgS) view.findViewById(C13754dXa.ActionBar.RcvFxC);
            this.KWHzl = (android.widget.ImageView) view.findViewById(C13754dXa.ActionBar.hrnhsO);
            this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.fJi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C17543fJf.ActionBar.AEQbTJ();
                }
            });
        }

        private final C17412fEj copydefault() {
            return (C17412fEj) this.copydefault.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C17412fEj AEQbTJ() {
            return new C17412fEj();
        }

        public final void EZpvd(@NotNull ActivityC17448fFs.Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            AbstractC12784ctX abstractC12784ctXCopydefault = application.copydefault();
            this.OLrzqt.setText(copydefault().AYXKKw(abstractC12784ctXCopydefault));
            this.AEQbTJ.setText(copydefault().djBIcL(abstractC12784ctXCopydefault));
            this.EZpvd.setVisibility(abstractC12784ctXCopydefault.getNewProxyInstance() ? 0 : 8);
            this.KWHzl.setRotation(application.EZpvd() ? 0.0f : 180.0f);
        }
    }
}
