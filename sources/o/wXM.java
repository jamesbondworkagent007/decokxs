package o;

import com.bumptech.glide.Priority;
import kotlin.jvm.internal.Intrinsics;
import o.NU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wXM implements NU<wXL> {
    public final wXL OLrzqt;

    @Override // o.NU
    public void AEQbTJ() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.NU
    public java.lang.Class<wXL> KWHzl() {
        return wXL.class;
    }

    @Override // o.NU
    public void copydefault() {
    }

    public wXM(@NotNull wXL wxl) {
        Intrinsics.checkNotNullParameter(wxl, "");
        this.OLrzqt = wxl;
    }

    @Override // o.NU
    public void EZpvd(@NotNull Priority priority, @NotNull NU.TaskDescription<? super wXL> taskDescription) {
        Intrinsics.checkNotNullParameter(priority, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.OLrzqt.djBIcL();
        taskDescription.KWHzl(this.OLrzqt);
    }

    @Override // o.NU
    public com.bumptech.glide.load.DataSource OLrzqt() {
        return com.bumptech.glide.load.DataSource.LOCAL;
    }
}
