package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.klA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C28984klA extends wXX {
    public C21484hBb EZpvd;

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.EZpvd = C21484hBb.OLrzqt(getCustomLayoutInflater(), constraintLayout, true);
    }
}
