package o;

import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventsVo;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oRc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36150oRc extends AbstractC59533zio<MarketEventsVo.Content, TaskDescription> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final InterfaceC36144oQx OLrzqt;

    public C36150oRc(@NotNull InterfaceC36144oQx interfaceC36144oQx) {
        Intrinsics.checkNotNullParameter(interfaceC36144oQx, "");
        this.OLrzqt = interfaceC36144oQx;
    }

    /* JADX INFO: renamed from: o.oRc$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oRc.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.oRc$TaskDescription */
    public final class TaskDescription extends RecyclerView.ViewHolder {
        public final /* synthetic */ C36150oRc KWHzl;
        public final C36041oNb copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C36041oNb AEQbTJ() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C36150oRc c36150oRc, C36041oNb c36041oNb) {
            super(c36041oNb.getRoot());
            Intrinsics.checkNotNullParameter(c36041oNb, "");
            this.KWHzl = c36150oRc;
            this.copydefault = c36041oNb;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C36041oNb c36041oNbAEQbTJ = C36041oNb.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c36041oNbAEQbTJ, "");
        return new TaskDescription(this, c36041oNbAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0085  */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, @NotNull MarketEventsVo.Content content) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(content, "");
        C36041oNb c36041oNbAEQbTJ = taskDescription.AEQbTJ();
        c36041oNbAEQbTJ.djBIcL.setText(pTA.formatTime$default(new Date(content.djBIcL().getTimeStamp()), OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 14, null));
        c36041oNbAEQbTJ.gEmmrt.setText(content.EZpvd());
        LinearLayoutCompat linearLayoutCompat = c36041oNbAEQbTJ.AYXKKw;
        linearLayoutCompat.setOnClickListener(new Application(linearLayoutCompat, 1000L, this, content));
        c36041oNbAEQbTJ.OLrzqt.setText(oQQ.copydefault(content));
        c36041oNbAEQbTJ.AEQbTJ.setText(oQQ.OLrzqt(content));
        AppCompatTextView appCompatTextView = c36041oNbAEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(C33129mqd.OLrzqt(oQQ.OLrzqt(content)) ? 0 : 8);
        if (!content.AYXKKw()) {
            AppCompatTextView appCompatTextView2 = c36041oNbAEQbTJ.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
            if (KWHzl(appCompatTextView2)) {
                c36041oNbAEQbTJ.OLrzqt.setMaxLines(5);
            } else {
                c36041oNbAEQbTJ.OLrzqt.setMaxLines(Integer.MAX_VALUE);
            }
        }
        AppCompatTextView appCompatTextView3 = c36041oNbAEQbTJ.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
        appCompatTextView3.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) content.EZpvd()) ? 0 : 8);
        android.view.View view = c36041oNbAEQbTJ.EZpvd;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) content.EZpvd()) ? 0 : 8);
        android.view.View view2 = taskDescription.itemView;
        view2.setOnClickListener(new Activity(view2, 1000L, this, content));
    }

    public final boolean KWHzl(AppCompatTextView appCompatTextView) {
        java.lang.CharSequence text = appCompatTextView.getText();
        if (text == null || text.length() == 0) {
            return false;
        }
        java.lang.CharSequence text2 = appCompatTextView.getText();
        Intrinsics.copydefault(text2, "");
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(text2, 0, appCompatTextView.getText().length(), appCompatTextView.getPaint(), C33570myu.djBIcL(appCompatTextView.getContext()) - C55298xhM.dpInt$default(64, (android.content.Context) null, 1, (java.lang.Object) null));
        builderObtain.setAlignment(Layout.Alignment.ALIGN_NORMAL);
        builderObtain.setLineSpacing(appCompatTextView.getLineSpacingExtra(), appCompatTextView.getLineSpacingMultiplier());
        builderObtain.setIncludePad(appCompatTextView.getIncludeFontPadding());
        builderObtain.setHyphenationFrequency(1);
        return builderObtain.build().getLineCount() > 5;
    }

    /* JADX INFO: renamed from: o.oRc$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C36150oRc KWHzl;
        public final /* synthetic */ MarketEventsVo.Content OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C36150oRc c36150oRc, MarketEventsVo.Content content) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = c36150oRc;
            this.OLrzqt = content;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.OLrzqt.AEQbTJ(this.OLrzqt);
            }
        }
    }

    /* JADX INFO: renamed from: o.oRc$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C36150oRc EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ MarketEventsVo.Content copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C36150oRc c36150oRc, MarketEventsVo.Content content) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c36150oRc;
            this.copydefault = content;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.OLrzqt.KWHzl(this.copydefault);
            }
        }
    }
}
