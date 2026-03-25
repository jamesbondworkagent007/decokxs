package o;

import com.okinc.core.glide.ImageSize;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.planet.domain.remote.dto.MineCommentBean;
import java.util.Date;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tzs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C47957tzs extends AbstractC43310rmq<MineCommentBean, tMW> {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.tzz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C47957tzs.EZpvd();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C47501trL.Application.gHZMYf;
    }

    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return 0;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.rms, java.lang.Object] */
    @Override // o.AbstractC43310rmq
    public /* synthetic */ void onBindViewHolder(C43312rms c43312rms, MineCommentBean mineCommentBean) {
        onBindViewHolder((C43312rms<tMW>) c43312rms, mineCommentBean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageSize EZpvd() {
        return ImageSize.create(C55298xhM.dpInt$default(40, (android.content.Context) null, 1, (java.lang.Object) null));
    }

    private final ImageSize KWHzl() {
        return (ImageSize) this.EZpvd.getValue();
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq, o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<tMW> c43312rms, @NotNull MineCommentBean mineCommentBean) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(mineCommentBean, "");
        super.onBindViewHolder((C43312rms) c43312rms, mineCommentBean);
        KWHzl(c43312rms, mineCommentBean);
    }

    public final void EZpvd(@NotNull C43312rms<tMW> c43312rms, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        java.lang.String strKWHzl = C55297xhL.KWHzl(str, KWHzl().getWidth(), KWHzl().getHeight());
        java.lang.String str2 = strKWHzl == null ? "" : strKWHzl;
        android.widget.ImageView imageView = ((tMW) c43312rms.OLrzqt()).OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C33054mpH.loadAvatar$default(imageView, str2, null, null, 6, null);
    }

    public final void OLrzqt(@NotNull C43312rms<tMW> c43312rms, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((tMW) c43312rms.OLrzqt()).AhwBna.setText(str);
    }

    public final void AEQbTJ(@NotNull C43312rms<tMW> c43312rms, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((tMW) c43312rms.OLrzqt()).copydefault.setText(str);
    }

    public final void KWHzl(@NotNull C43312rms<tMW> c43312rms, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((tMW) c43312rms.OLrzqt()).KWHzl.setText(str);
    }

    public final void KWHzl(@NotNull C43312rms<tMW> c43312rms, @NotNull MineCommentBean mineCommentBean) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(mineCommentBean, "");
        java.lang.String localFormatedTime = mineCommentBean.getLocalFormatedTime();
        if (localFormatedTime != null && localFormatedTime.length() != 0) {
            ((tMW) c43312rms.OLrzqt()).djBIcL.setText(mineCommentBean.getLocalFormatedTime());
        } else {
            ((tMW) c43312rms.OLrzqt()).djBIcL.setText(pTA.formatTime$default(new Date(mineCommentBean.getReplyTime()), OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null));
        }
    }
}
