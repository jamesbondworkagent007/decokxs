package o;

import android.view.View;
import com.bumptech.glide.Glide;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.planet.biz_content.draft.DraftDataInfo;
import com.okinc.planet.domain.remote.dto.PublishImageItem;
import java.util.Date;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.trZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47515trZ extends AbstractC43310rmq<DraftDataInfo, AbstractC46312tPr> {
    public final Function1<DraftDataInfo, Unit> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C47501trL.Application.dvImUD;
    }

    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.planet.biz_content.draft.DraftDataInfo, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C47515trZ(@NotNull Function1<? super DraftDataInfo, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC46312tPr> c43312rms, @NotNull DraftDataInfo draftDataInfo) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(draftDataInfo, "");
        super.onBindViewHolder((C43312rms) c43312rms, draftDataInfo);
        AbstractC46312tPr abstractC46312tPr = (AbstractC46312tPr) c43312rms.OLrzqt();
        java.lang.String content = draftDataInfo.getContent();
        if (content == null) {
            content = "";
        }
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) content)) {
            abstractC46312tPr.copydefault.setText(content);
            android.widget.TextView textView = abstractC46312tPr.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
        } else {
            android.widget.TextView textView2 = abstractC46312tPr.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
        }
        java.lang.String modifyTime = draftDataInfo.getModifyTime();
        long jValueOf = modifyTime != null ? C33129mqd.valueOf(modifyTime) : 0L;
        abstractC46312tPr.EZpvd.setText(pTA.formatTime$default(new Date(jValueOf), OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null) + " · " + pTA.formatDate$default(new Date(jValueOf), OKDateEnum.DATE_FORMAT_SIMPLE, null, null, 6, null) + " ");
        java.util.List<PublishImageItem> imageList = draftDataInfo.getImageList();
        if (imageList == null) {
            imageList = yDY.AhwBna();
        }
        if (!imageList.isEmpty()) {
            abstractC46312tPr.OLrzqt.setVisibility(0);
            Intrinsics.copydefault(Glide.AEQbTJ(abstractC46312tPr.OLrzqt.getContext()).EZpvd(((PublishImageItem) CollectionsKt___CollectionsKt.AuCTelauCTel(imageList)).KWHzl()).KWHzl(C47501trL.ActionBar.fIwbmz).copydefault(C47501trL.ActionBar.fIwbmz).AEQbTJ(new C5405Ql(), new C5417Qx(C55298xhM.dp2px$default(8.0f, null, 1, null))).EZpvd(abstractC46312tPr.OLrzqt));
        } else {
            abstractC46312tPr.OLrzqt.setVisibility(8);
        }
        android.view.View root = abstractC46312tPr.getRoot();
        root.setOnClickListener(new Application(root, 1000L, this, draftDataInfo));
    }

    /* JADX INFO: renamed from: o.trZ$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C47515trZ OLrzqt;
        public final /* synthetic */ DraftDataInfo copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C47515trZ c47515trZ, DraftDataInfo draftDataInfo) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = c47515trZ;
            this.copydefault = draftDataInfo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.AEQbTJ.invoke(this.copydefault);
            }
        }
    }
}
