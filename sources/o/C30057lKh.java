package o;

import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC35280nsO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lKh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30057lKh implements InterfaceC35280nsO {
    @Override // o.InterfaceC35280nsO
    public boolean EZpvd(java.lang.String str) {
        return InterfaceC35280nsO.TaskDescription.KWHzl(this, str);
    }

    @Override // o.InterfaceC35280nsO
    public boolean AEQbTJ(@NotNull C35248nrj c35248nrj) {
        Intrinsics.checkNotNullParameter(c35248nrj, "");
        return c35248nrj.copydefault() == GroupTagType.OTC_AGENT;
    }
}
