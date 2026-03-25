package o;

import com.okinc.core.glide.ImageSize;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.planet.domain.remote.dto.MineLikesBean;
import java.util.Date;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tzy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C47963tzy extends AbstractC43310rmq<MineLikesBean, tMX> {
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.tzx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C47963tzy.EZpvd();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C47501trL.Application.AxsJAY;
    }

    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return 0;
    }

    private final ImageSize AEQbTJ() {
        return (ImageSize) this.KWHzl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageSize EZpvd() {
        return ImageSize.create(C55298xhM.dpInt$default(40, (android.content.Context) null, 1, (java.lang.Object) null));
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<tMX> c43312rms, @NotNull MineLikesBean mineLikesBean) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(mineLikesBean, "");
        super.onBindViewHolder((C43312rms) c43312rms, mineLikesBean);
        EZpvd(c43312rms, mineLikesBean);
    }

    public final void EZpvd(@NotNull C43312rms<tMX> c43312rms, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        java.lang.String strKWHzl = C55297xhL.KWHzl(str, AEQbTJ().getWidth(), AEQbTJ().getHeight());
        java.lang.String str2 = strKWHzl == null ? "" : strKWHzl;
        android.widget.ImageView imageView = ((tMX) c43312rms.OLrzqt()).copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C33054mpH.loadAvatar$default(imageView, str2, null, null, 6, null);
    }

    public final void KWHzl(@NotNull C43312rms<tMX> c43312rms, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((tMX) c43312rms.OLrzqt()).EZpvd.setText(str);
    }

    public final void OLrzqt(@NotNull C43312rms<tMX> c43312rms, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((tMX) c43312rms.OLrzqt()).OLrzqt.setText(str);
    }

    public final void EZpvd(@NotNull C43312rms<tMX> c43312rms, @NotNull MineLikesBean mineLikesBean) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(mineLikesBean, "");
        java.lang.String localFormatedTime = mineLikesBean.getLocalFormatedTime();
        if (localFormatedTime != null && localFormatedTime.length() != 0) {
            ((tMX) c43312rms.OLrzqt()).AEQbTJ.setText(mineLikesBean.getLocalFormatedTime());
        } else {
            ((tMX) c43312rms.OLrzqt()).AEQbTJ.setText(pTA.formatTime$default(new Date(mineLikesBean.getLikeTime()), OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null));
        }
    }
}
