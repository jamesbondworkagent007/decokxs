package o;

import com.okinc.im.imui.share.model.ShareMessageError;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oxq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37652oxq extends C43318rmy<ShareMessageError, nKM> {
    public C37652oxq() {
        super(C35399nuc.Dialog.hCLrkq, 0);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<nKM> c43312rms, @NotNull ShareMessageError shareMessageError) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(shareMessageError, "");
        super.onBindViewHolder((C43312rms) c43312rms, shareMessageError);
        nKM nkm = (nKM) c43312rms.OLrzqt();
        C35893oHp c35893oHp = nkm.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
        C35891oHn.OLrzqt(c35893oHp, shareMessageError.KWHzl().AEQbTJ(), shareMessageError.KWHzl().KWHzl(), C33129mqd.gEmmrt(shareMessageError.KWHzl().EZpvd()));
        nkm.EZpvd.setText(shareMessageError.KWHzl().EZpvd());
        nkm.copydefault.setText(shareMessageError.EZpvd());
    }
}
