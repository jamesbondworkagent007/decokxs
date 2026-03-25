package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.imui.inputpanelV2.pluginV2.FilePlugin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C36482obm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.obm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C36482obm extends RecyclerView.Adapter<TaskDescription> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final InterfaceC36485obp EZpvd;
    public java.util.List<InterfaceC35288nsW> KWHzl;

    public C36482obm(@NotNull java.util.List<InterfaceC35288nsW> list, @NotNull InterfaceC36485obp interfaceC36485obp) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(interfaceC36485obp, "");
        this.KWHzl = list;
        this.EZpvd = interfaceC36485obp;
    }

    /* JADX INFO: renamed from: o.obm$TaskDescription */
    public final class TaskDescription extends RecyclerView.ViewHolder {
        public final android.widget.TextView AEQbTJ;
        public final android.widget.ImageView EZpvd;
        public final /* synthetic */ C36482obm KWHzl;
        public final android.view.View OLrzqt;
        public final android.content.Context copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C36482obm c36482obm, @NotNull android.view.View view, android.content.Context context) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(context, "");
            this.KWHzl = c36482obm;
            this.copydefault = context;
            android.view.View viewFindViewById = view.findViewById(C35399nuc.StateListAnimator.FYtjSf);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.AEQbTJ = (android.widget.TextView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C35399nuc.StateListAnimator.fdt);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.EZpvd = (android.widget.ImageView) viewFindViewById2;
            this.OLrzqt = view;
        }

        public final void OLrzqt(@NotNull final InterfaceC35288nsW interfaceC35288nsW) {
            Intrinsics.checkNotNullParameter(interfaceC35288nsW, "");
            android.view.View view = this.OLrzqt;
            final C36482obm c36482obm = this.KWHzl;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.obl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C36482obm.TaskDescription.copydefault(interfaceC35288nsW, c36482obm, view2);
                }
            });
            if (interfaceC35288nsW instanceof C36478obi) {
                this.OLrzqt.setContentDescription("GalleryPlugin");
            } else if (interfaceC35288nsW instanceof C36413oaW) {
                this.OLrzqt.setContentDescription("CameraPlugin");
            } else if (interfaceC35288nsW instanceof C36489obt) {
                this.OLrzqt.setContentDescription("RedPacketPlugin");
            } else if (interfaceC35288nsW instanceof C36492obw) {
                this.OLrzqt.setContentDescription("VoiceCallPlugin");
            } else if (interfaceC35288nsW instanceof C36488obs) {
                this.OLrzqt.setContentDescription("TransferPlugin");
            } else if (interfaceC35288nsW instanceof FilePlugin) {
                this.OLrzqt.setContentDescription("FilePlugin");
            } else {
                this.OLrzqt.setContentDescription(null);
            }
            this.AEQbTJ.setText(interfaceC35288nsW.KWHzl());
            android.widget.ImageView imageView = this.EZpvd;
            android.content.Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            imageView.setImageDrawable(interfaceC35288nsW.EZpvd(context));
            pUU.EZpvd("PluginsAdapter", "Binding plugin: " + interfaceC35288nsW.KWHzl());
        }

        public static final void copydefault(InterfaceC35288nsW interfaceC35288nsW, C36482obm c36482obm, android.view.View view) {
            pUU.KWHzl("PluginsAdapter", "Plugin clicked: " + interfaceC35288nsW.KWHzl());
            c36482obm.EZpvd.KWHzl(interfaceC35288nsW);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C35399nuc.Dialog.invokespecialsiEkQe, viewGroup, false);
        pUU.KWHzl("PluginsAdapter", "Creating PluginViewHolder for position: " + i);
        Intrinsics.copydefault(viewInflate);
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return new TaskDescription(this, viewInflate, context);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, int i) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        pUU.KWHzl("PluginsAdapter", "Binding plugin at position: " + i);
        taskDescription.OLrzqt(this.KWHzl.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.KWHzl.size();
    }

    /* JADX INFO: renamed from: o.obm$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.obm.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
