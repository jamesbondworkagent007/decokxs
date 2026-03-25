package o;

import com.okinc.db.DrawingDataDatabase;
import com.okinc.db.bean.DrawingDataEntity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mJv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C31947mJv {
    public final InterfaceC31950mJy EZpvd = DrawingDataDatabase.Companion.AEQbTJ(C43246rlf.OLrzqt.valueOf()).KWHzl();

    public final AbstractC58260yxt<java.util.List<DrawingDataEntity>> copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return KWHzl(this.EZpvd.AEQbTJ(str));
    }

    public final AbstractC58260yxt<java.lang.Long> OLrzqt(@NotNull DrawingDataEntity drawingDataEntity) {
        Intrinsics.checkNotNullParameter(drawingDataEntity, "");
        return KWHzl(this.EZpvd.KWHzl(drawingDataEntity));
    }

    public final AbstractC58260yxt<java.lang.Integer> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return KWHzl(this.EZpvd.OLrzqt(str));
    }

    public final <T> AbstractC58260yxt<T> KWHzl(AbstractC58260yxt<T> abstractC58260yxt) {
        AbstractC58260yxt<T> abstractC58260yxtKWHzl;
        if (abstractC58260yxt == null || (abstractC58260yxtKWHzl = abstractC58260yxt.KWHzl(yBP.AEQbTJ())) == null) {
            return null;
        }
        return abstractC58260yxtKWHzl.OLrzqt(C58266yxz.OLrzqt());
    }
}
