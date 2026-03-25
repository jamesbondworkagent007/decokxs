package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vvk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C51901vvk extends RecyclerView.ViewHolder {
    public C55372xih AEQbTJ;
    public android.widget.ImageView EZpvd;
    public RecyclerView KWHzl;
    public android.view.View OLrzqt;
    public android.view.View copydefault;
    public android.widget.TextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.view.View AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55372xih EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.ImageView KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecyclerView OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.view.View copydefault() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51901vvk(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.onNothingSelected);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.gEmmrt = (android.widget.TextView) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.INotificationSideChannelStub);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.EZpvd = (android.widget.ImageView) viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(C48033uCm.Application.IResultReceiverDefault);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        this.KWHzl = (RecyclerView) viewFindViewById3;
        android.view.View viewFindViewById4 = view.findViewById(C48033uCm.Application.DzCpqu);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
        this.OLrzqt = viewFindViewById4;
        android.view.View viewFindViewById5 = view.findViewById(C48033uCm.Application.sRzUNh);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
        this.copydefault = viewFindViewById5;
        android.view.View viewFindViewById6 = view.findViewById(C48033uCm.Application.getSubtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
        this.AEQbTJ = (C55372xih) viewFindViewById6;
    }
}
