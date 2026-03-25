package o;

import com.okinc.multitype.selection.Selectable;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xgj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55268xgj implements InterfaceC55196xfQ<C55276xgr, C55104xde<wZX>> {
    public Selectable.Mode AEQbTJ;
    public int EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C55268xgj() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Selectable.Mode EZpvd() {
        return this.AEQbTJ;
    }

    public C55268xgj(@NotNull Selectable.Mode mode, int i) {
        Intrinsics.checkNotNullParameter(mode, "");
        this.AEQbTJ = mode;
        this.EZpvd = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.multitype.selection.Selectable$Mode:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.multitype.selection.Selectable$Mode:0x0004: SGET  A[WRAPPED] (LINE:22) com.okinc.multitype.selection.Selectable.Mode.Single com.okinc.multitype.selection.Selectable$Mode) : (r1v0 com.okinc.multitype.selection.Selectable$Mode))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
 A[MD:(com.okinc.multitype.selection.Selectable$Mode, int):void (m)] (LINE:21) call: o.xgj.<init>(com.okinc.multitype.selection.Selectable$Mode, int):void type: THIS */
    public /* synthetic */ C55268xgj(Selectable.Mode mode, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Selectable.Mode.Single : mode, (i2 & 2) != 0 ? 0 : i);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.InterfaceC55196xfQ
    /* JADX INFO: renamed from: OLrzqt */
    public C55104xde<wZX> AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        wZX wzxAEQbTJ = wZX.AEQbTJ(layoutInflater);
        wzxAEQbTJ.getRoot().EZpvd().setTypeface(C55051xce.OLrzqt.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(wzxAEQbTJ, "");
        return new C55104xde<>(wzxAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;ZZ)V */
    @Override // o.InterfaceC55196xfQ
    /* JADX INFO: renamed from: copydefault */
    public void EZpvd(@NotNull C55104xde<wZX> c55104xde, @NotNull C55276xgr c55276xgr, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(c55104xde, "");
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        wZX wzx = (wZX) c55104xde.OLrzqt();
        if (this.EZpvd == 1) {
            OKRegularCell root = wzx.getRoot();
            android.content.Context context = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iOLrzqt = C55298xhM.OLrzqt(32, context);
            android.content.Context context2 = root.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            root.setIconSize(iOLrzqt, C55298xhM.OLrzqt(32, context2));
            android.widget.TextView textViewEZpvd = root.EZpvd();
            textViewEZpvd.setTextAppearance(C52761wXj.LoaderManager.giSNqX);
            textViewEZpvd.setTextSize(18.0f);
        }
        if (this.EZpvd == 2) {
            OKRegularCell root2 = wzx.getRoot();
            android.content.Context context3 = root2.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            int iOLrzqt2 = C55298xhM.OLrzqt(32, context3);
            android.content.Context context4 = root2.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            root2.setIconSize(iOLrzqt2, C55298xhM.OLrzqt(32, context4));
            android.widget.TextView textViewEZpvd2 = root2.EZpvd();
            textViewEZpvd2.setTextAppearance(C52761wXj.LoaderManager.giSNqX);
            textViewEZpvd2.setTextSize(18.0f);
            root2.AEQbTJ().setTextSize(14.0f);
            wzx.copydefault.setImageResource(C52761wXj.TaskDescription.DGUQLI);
        }
        OKRegularCell root3 = wzx.getRoot();
        root3.setTag(C52761wXj.FragmentManager.DGUQLIekVPG, c55276xgr);
        root3.setTitle(c55276xgr.AhwBna());
        root3.setDescription(c55276xgr.EZpvd());
        Intrinsics.copydefault(root3);
        C55297xhL.KWHzl(root3, c55276xgr.KWHzl());
        root3.setEnabled(z2);
        root3.setContentDescription(c55276xgr.copydefault());
        if (this.EZpvd == 2) {
            return;
        }
        if (z) {
            wzx.copydefault.setImageResource(C52761wXj.TaskDescription.fVjYLc);
            return;
        }
        if (this.AEQbTJ == Selectable.Mode.Single) {
            wzx.copydefault.setImageDrawable(null);
        } else if (c55276xgr.AYXKKw()) {
            wzx.copydefault.setImageResource(C52761wXj.TaskDescription.dbwnZN);
        } else {
            wzx.copydefault.setImageResource(C52761wXj.TaskDescription.gsvlRV);
        }
    }
}
