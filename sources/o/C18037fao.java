package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.DiffUtil;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.biz.net.bean.Article;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.web.WebActivity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.InterfaceC18036fan;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18037fao extends androidx.recyclerview.widget.ListAdapter<InterfaceC18036fan, C18033fak> {
    public final View.OnClickListener KWHzl;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public static final DiffUtil.ItemCallback<InterfaceC18036fan> EZpvd = new Activity();

    /* JADX INFO: renamed from: o.fao$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ InterfaceC18036fan AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ AbstractC16718epH KWHzl;
        public final /* synthetic */ C18037fao OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C18037fao c18037fao, InterfaceC18036fan interfaceC18036fan, AbstractC16718epH abstractC16718epH) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = c18037fao;
            this.AEQbTJ = interfaceC18036fan;
            this.KWHzl = abstractC16718epH;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C57594ylP.AEQbTJ(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C57594ylP.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.KWHzl.onClick(this.copydefault);
                C32866mlf.onEvent$default("Web3HomePageZeroAssets_Card_Article_Click", (TrackChannel[]) null, new StateListAnimator(this.AEQbTJ), 1, (java.lang.Object) null);
                android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", ((InterfaceC18036fan.TaskDescription) this.AEQbTJ).EZpvd().OLrzqt()), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString()));
                WebActivity.TaskDescription taskDescription = WebActivity.Companion;
                android.content.Context context = this.KWHzl.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                WebActivity.TaskDescription.openPage$default(taskDescription, context, bundleBundleOf, null, 4, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18037fao(@NotNull View.OnClickListener onClickListener) {
        super(EZpvd);
        Intrinsics.checkNotNullParameter(onClickListener, "");
        this.KWHzl = onClickListener;
    }

    /* JADX INFO: renamed from: o.fao$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fao.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.fao$Activity */
    public static final class Activity extends DiffUtil.ItemCallback<InterfaceC18036fan> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(InterfaceC18036fan interfaceC18036fan, InterfaceC18036fan interfaceC18036fan2) {
            Intrinsics.checkNotNullParameter(interfaceC18036fan, "");
            Intrinsics.checkNotNullParameter(interfaceC18036fan2, "");
            return Intrinsics.EZpvd(interfaceC18036fan, interfaceC18036fan2);
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(InterfaceC18036fan interfaceC18036fan, InterfaceC18036fan interfaceC18036fan2) {
            Intrinsics.checkNotNullParameter(interfaceC18036fan, "");
            Intrinsics.checkNotNullParameter(interfaceC18036fan2, "");
            return Intrinsics.EZpvd(interfaceC18036fan, interfaceC18036fan2);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C18033fak onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC16718epH abstractC16718epHEZpvd = AbstractC16718epH.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC16718epHEZpvd, "");
        return new C18033fak(abstractC16718epHEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C18033fak c18033fak, int i) {
        Intrinsics.checkNotNullParameter(c18033fak, "");
        InterfaceC18036fan item = getItem(i);
        if (item == null) {
            return;
        }
        AbstractC16718epH abstractC16718epHOLrzqt = c18033fak.OLrzqt();
        if (item instanceof InterfaceC18036fan.ActionBar) {
            abstractC16718epHOLrzqt.getRoot().setOnClickListener(null);
            android.widget.TextView textView = abstractC16718epHOLrzqt.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            C55113xdn c55113xdn = abstractC16718epHOLrzqt.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            c55113xdn.setVisibility(0);
            abstractC16718epHOLrzqt.copydefault.setImageResource(((InterfaceC18036fan.ActionBar) item).AEQbTJ() ? C13754dXa.Activity.AwvSrB : C13754dXa.Activity.AxsJAY);
            return;
        }
        if (!(item instanceof InterfaceC18036fan.TaskDescription)) {
            throw new NoWhenBranchMatchedException();
        }
        android.view.View root = abstractC16718epHOLrzqt.getRoot();
        root.setOnClickListener(new Application(root, 1000L, this, item, abstractC16718epHOLrzqt));
        InterfaceC18036fan.TaskDescription taskDescription = (InterfaceC18036fan.TaskDescription) item;
        abstractC16718epHOLrzqt.KWHzl.setText(taskDescription.EZpvd().AEQbTJ());
        android.widget.TextView textView2 = abstractC16718epHOLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(0);
        C55113xdn c55113xdn2 = abstractC16718epHOLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
        c55113xdn2.setVisibility(8);
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrKWHzl = Glide.KWHzl(abstractC16718epHOLrzqt.copydefault);
        boolean zOLrzqt = C33492mxV.OLrzqt();
        Article articleEZpvd = taskDescription.EZpvd();
        Intrinsics.copydefault(componentCallbacks2C5333NrKWHzl.EZpvd(zOLrzqt ? articleEZpvd.EZpvd() : articleEZpvd.copydefault()).copydefault(C55298xhM.dpInt$default(247, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(WebSocketProtocol.PAYLOAD_SHORT, (android.content.Context) null, 1, (java.lang.Object) null)).KWHzl(C13754dXa.Activity.AwvSrB).copydefault(C13754dXa.Activity.AxsJAY).EZpvd((android.widget.ImageView) abstractC16718epHOLrzqt.copydefault));
    }

    /* JADX INFO: renamed from: o.fao$StateListAnimator */
    public static final class StateListAnimator implements Function1<EventParamsList, Unit> {
        public final /* synthetic */ InterfaceC18036fan AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(InterfaceC18036fan interfaceC18036fan) {
            this.AEQbTJ = interfaceC18036fan;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            KWHzl(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void KWHzl(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("article_id", java.lang.String.valueOf(((InterfaceC18036fan.TaskDescription) this.AEQbTJ).EZpvd().KWHzl()), false);
        }
    }
}
