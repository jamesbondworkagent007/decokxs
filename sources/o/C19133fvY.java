package o;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.mine.search.data.model.TagEventProperty;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fvY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19133fvY extends androidx.recyclerview.widget.ListAdapter<C18982fsg, RecyclerView.ViewHolder> {
    public static final Application EZpvd = new Application(null);
    public static final int KWHzl = 8;
    public final android.content.Context AEQbTJ;
    public final Function1<C18982fsg, Unit> AYXKKw;
    public final androidx.fragment.app.FragmentManager OLrzqt;
    public final Function1<TagEventProperty, Unit> copydefault;
    public final Function1<C18982fsg, Unit> djBIcL;
    public final Function1<java.lang.String, Unit> valueOf;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.fsg, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super o.fsg, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.wallet.mine.search.data.model.TagEventProperty, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19133fvY(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Function1<? super C18982fsg, Unit> function1, @NotNull Function1<? super C18982fsg, Unit> function12, @NotNull Function1<? super java.lang.String, Unit> function13, @NotNull Function1<? super TagEventProperty, Unit> function14) {
        super(EZpvd);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(function14, "");
        this.AEQbTJ = context;
        this.OLrzqt = fragmentManager;
        this.AYXKKw = function1;
        this.djBIcL = function12;
        this.valueOf = function13;
        this.copydefault = function14;
    }

    /* JADX INFO: renamed from: o.fvY$Application */
    public static final class Application extends DiffUtil.ItemCallback<C18982fsg> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fvY.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(@NotNull C18982fsg c18982fsg, @NotNull C18982fsg c18982fsg2) {
            Intrinsics.checkNotNullParameter(c18982fsg, "");
            Intrinsics.checkNotNullParameter(c18982fsg2, "");
            return c18982fsg.copydefault().OLrzqt() == c18982fsg2.copydefault().OLrzqt();
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(@NotNull C18982fsg c18982fsg, @NotNull C18982fsg c18982fsg2) {
            Intrinsics.checkNotNullParameter(c18982fsg, "");
            Intrinsics.checkNotNullParameter(c18982fsg2, "");
            return Intrinsics.EZpvd(c18982fsg, c18982fsg2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C17178exr c17178exrEZpvd = C17178exr.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c17178exrEZpvd, "");
        return new C19192fwe(c17178exrEZpvd, this.AYXKKw, this.djBIcL, this.valueOf, this.copydefault);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        if (viewHolder instanceof C19192fwe) {
            C18982fsg item = getItem(i);
            Intrinsics.copydefault(item);
            ((C19192fwe) viewHolder).EZpvd(item);
        }
    }
}
