package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fxh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19248fxh extends RecyclerView.ViewHolder {
    public final C17116ewi AEQbTJ;
    public final Function0<Unit> EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19248fxh(@NotNull C17116ewi c17116ewi, @NotNull Function0<Unit> function0) {
        super(c17116ewi.getRoot());
        Intrinsics.checkNotNullParameter(c17116ewi, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ = c17116ewi;
        this.EZpvd = function0;
    }

    public final void copydefault(@NotNull C18998fsw c18998fsw) {
        Intrinsics.checkNotNullParameter(c18998fsw, "");
        C17116ewi c17116ewi = this.AEQbTJ;
        C54989xbV c54989xbV = c17116ewi.KWHzl;
        int color = ContextCompat.getColor(c54989xbV.getContext(), C52761wXj.Activity.fdOvFl);
        c54989xbV.EZpvd().setTextColor(color);
        ImageViewCompat.setImageTintList(c54989xbV.OLrzqt(), android.content.res.ColorStateList.valueOf(color));
        c54989xbV.setOKDSSize(-4);
        if (c18998fsw.KWHzl() == Long.MIN_VALUE) {
            c54989xbV.EZpvd().setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setSupportActionBar));
            c54989xbV.AEQbTJ().setImageResource(C52761wXj.TaskDescription.createSocket);
        } else {
            c54989xbV.EZpvd().setText(c18998fsw.AEQbTJ());
            C33054mpH.loadRoundImage$default(c54989xbV.AEQbTJ(), c18998fsw.OLrzqt(), 0, 2, null);
        }
        C54989xbV c54989xbV2 = c17116ewi.KWHzl;
        c54989xbV2.setOnClickListener(new ActionBar(c54989xbV2, 1000L, this));
    }

    /* JADX INFO: renamed from: o.fxh$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C19248fxh AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C19248fxh c19248fxh) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = c19248fxh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.EZpvd.invoke();
            }
        }
    }
}
